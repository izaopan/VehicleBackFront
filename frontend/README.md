# Available Scripts

##  Useful commands

## npm install
Install all dependencies 

## npm Start
Runs the app in the development mode.
Open [http://localhost:3000](http://localhost:3000) to view it in the browser.

## npm run build
Builds the app for production to the build folder.
It correctly bundles React in production mode and optimizes the build for the best performance.

The build is minified and the filenames include the hashes.
Your app is ready to be deployed!

## docker build . -t [IMAGE_NAME]
To build a docker image 
The content of ./build is needed (So "npm run build" needs to be executed before this) 

## docker run -p [port]:80 [IMAGE_NAME]
Start the docker image locally.
The app is accessable via http://localhost:[port]


See the section about [deployment](https://facebook.github.io/create-react-app/docs/deployment) for more information.

### Learn More

This project was bootstrapped with [Create React App](https://github.com/facebook/create-react-app).

You can learn more in the [Create React App documentation](https://facebook.github.io/create-react-app/docs/getting-started).

To learn React, check out the [React documentation](https://reactjs.org/).
