/**
 * 
 */

const partternDate = (vdate, symbol) => {
	const year = vdate.getFullYear()
	const month = (vdate.getMonth() + 1).toString().padStart(2, 0)
	const day = vdate.getDate().toString().padStart(2, 0)

	const result = [year, month, day].join(symbol)
	return result

}

document.forms[0].jsjoindate.value = partternDate(new Date(), '-')


function func_reg() {
	const frm = document.forms[0]
	const name = frm.jsname
	const nickname = frm.jsnickname
	const id = frm.jsid
	const password = frm.jspassword
	const password2 = frm.jspassword2
	const phone = frm.jsphone
	const address = frm.jsaddress
	let isTrue = true;
	let tel = /^010[-]?[0-9]{4}[-]?[0-9]{4}$/

	//이름 미작성
	if (name.value == "") {
		alert('이름을 미작성 하였습니다.')
		name.focus()
		isTrue = false
	}

	//이름은 2~10글자까지만
	else if (name.value.length < 2 || name.value.length > 10) {
		alert('이름은 길이는 2~10글자 입니다. 다시 확인해주세요.')
		name.focus()
		isTrue = false
	}
	
	//닉네임 미작성
	else if (nickname.value == "") {
		alert('닉네임을 미작성 하였습니다.')
		nickname.focus()
		isTrue = false
	}

	//닉네임은 최대 3~8글자까지가능
	else if (nickname.value.length < 3 || nickname.value.length > 8) {
		alert('닉네임은 3~8글자입니다.')
		nickname.focus()
		isTrue = false
	}

	//ID 미작성
	else if (id.value == "") {
		alert('ID를 미작성 하였습니다.')
		id.focus()
		isTrue = false
	}

	//ID 는 8~15글자
	else if (id.value.length < 8 || id.value.length > 15) {
		alert('ID는 8~15글자 입니다.')
		id.focus()
		isTrue = false
	}

	//비밀번호 미작성
	else if (password.value == "") {
		alert('비밀번호를 미작성 하였습니다.')
		password.focus()
		isTrue = false
	}

	//비밀번호 는 8~15글자
	else if (password.value.length < 8 || password.value.length > 15) {
		alert('패스워드 는 8~15글자 입니다.')
		password.focus()
		isTrue = false
	}
	
	//비밀번호 바꾸는거 확인
	else if(!(password.value == password2.value)) {
		alert('입력하신 비밀번호가 다릅니다.')
		password.focus()
		isTrue = false
	}

	//핸드폰 정규식
	else if (tel.test(phone.value)=== false) {
		alert('핸드폰 번호 입력이 잘못되었습니다.')
		phone.focus()
		isTrue = false
	}

	//주소 썻는지 확인
	else if (address.value == "") {
		alert('주소를 입력해주세요.')
		address.focus()
		isTrue = false
	}

	if (isTrue) {
		frm.submit()
	}
}