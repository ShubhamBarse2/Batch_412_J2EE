<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>User Profile</title>

<style>
    body {
        margin: 0;
        padding: 0;
        font-family: Arial, sans-serif;
        background: #e7e7e7;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }

    .profile-box {
        background: white;
        width: 380px;
        padding: 30px;
        border-radius: 8px;
        box-shadow: 0 0 15px rgba(0,0,0,0.1);
        text-align: center;
    }

    h2 {
        margin-bottom: 20px;
        color: #333;
    }

    .profile-item {
        margin: 10px 0;
        text-align: left;
        font-size: 16px;
    }

    .profile-item span {
        font-weight: bold;
        color: #333;
    }

    .btn {
        margin-top: 20px;
        width: 100%;
        padding: 10px;
        background: #007bff;
        color: white;
        border: none;
        border-radius: 5px;
        cursor: pointer;
        font-size: 16px;
    }

    .btn:hover {
        background: #0056b3;
    }
</style>
</head>

<body>

<div class="profile-box">
    <h2>User Profile</h2>

    <div class="profile-item">
        <span>Full Name:</span> John Doe
    </div>

    <div class="profile-item">
        <span>Email:</span> johndoe@example.com
    </div>

    <div class="profile-item">
        <span>City:</span> New York
    </div>

    <div class="profile-item">
        <span>Phone Number:</span> +1234567890
    </div>

    <button class="btn" onclick="window.location.href='index.html'">Back to Home</button>
</div>

</body>
</html>
