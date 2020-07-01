var account = account || {}
account = (function(){
		let _
		let init = function(){
			 _ = sessionStorage.getItem('context')
		}
		let join = function(payload){
			$.ajax({
				url : _+`/account/users`,
				type: 'POST',
				data: JSON.stringify(payload),
				dataType: 'json',
				contentType: 'application/json; charset=UTF-8',
				success: function(res){
					location.href = _+`/location/account/LoginForm`
				},
				error: function(err){
					alert(err)
				}
			})
		}
		let login = function(payload){
			$.ajax({
				url : _+`/account/users/${payload.userid}`,
				type: 'POST',
				data: JSON.stringify(payload),
				dataType: 'json',
				contentType: 'application/json; charset=UTF-8',
				success: function(res){
					alert(res)
				},
				error: function(err){
					alert(err)
				}
			})
		}
		let logout = function(){
			sessionStroage.removeItem('userid')
			sessionStroage.removeItem('context')
			sessionStroage.removeItem('javascript')
			sessionStroage.removeItem('css')
			sessionStroage.removeItem('image')
		}
		return {init, join, login, logout}
	})()