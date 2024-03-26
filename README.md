## Random Video Calling Application
The Random Video Calling application is an Android application that allows users to initiate random video calls with other users. This README provides an overview of the application's features, functionality, and main components.

Overview
The Random Video Calling application enables users to:

Initiate random video calls with other users.
View their profile information, including their profile picture and available coins.
Earn coins by watching ads, which can be used to initiate video calls.
Features
User Authentication
The application utilizes Firebase Authentication to authenticate users securely. Users are required to sign in with their credentials to access the app's features.

Profile Management
Users can view their profile information, including their profile picture and available coins. Profile information is fetched from the Firebase Realtime Database.

## Video Calling
The main functionality of the application is the ability to initiate random video calls with other users. Users can tap the "Find" button to search for other users available for video calls. A random user is selected, and a video call can be initiated if both users have granted the necessary permissions.

## Permission Handling
The application handles permissions for camera and microphone access to enable video calling functionality. Users are prompted to grant these permissions before initiating video calls.

## Main Libraries Used
The Random Video Calling application utilizes the following main libraries:
androidx.appcompat:appcompat:1.5.1: Provides backward compatibility for newer Android features.
com.google.firebase:firebase-auth:21.1.0: Implements Firebase Authentication for user authentication.
com.google.firebase:firebase-database:20.1.0: Integrates Firebase Realtime Database for storing and retrieving user profile information.
com.bumptech.glide:glide:4.14.2: Facilitates image loading and caching for displaying user profile pictures.
## Usage
To use the Random Video Calling application:
Install the application on an Android device.
Sign in with your credentials or create a new account if you are a new user.
Earn coins by watching ads to initiate video calls.
Enjoy random video calls with other users.
## Screenshots
![Screenshot 2024-03-26 145451](https://github.com/mohdkaif2304/Random-Calling/assets/118160035/2df3cc19-02ab-40d7-a67c-f580d316cb52)
![Screenshot 2024-03-26 143338](https://github.com/mohdkaif2304/Random-Calling/assets/118160035/2f3485c9-dffe-48d7-92eb-49c89bf8df6a)
![Screenshot 2024-03-26 143400](https://github.com/mohdkaif2304/Random-Calling/assets/118160035/ab02f7e2-a4e1-46dc-af5f-7319fb352d87)
![Screenshot 2024-03-26 143310](https://github.com/mohdkaif2304/Random-Calling/assets/118160035/7df44a18-dc82-40e1-b110-b7721ebf7af2)
![Screenshot 2024-03-26 143409](https://github.com/mohdkaif2304/Random-Calling/assets/118160035/3cb53b67-aee6-431f-8565-42dde6d51e34)
![Screenshot 2024-03-26 143506](https://github.com/mohdkaif2304/Random-Calling/assets/118160035/0dc186d3-ac56-4782-aaae-ed86c274ac5a)


