# OparetaChallenge-master
Opareta test challenge updated with tests


# Steps to install Android studio and its required tools

Download from https://developer.android.com/studio .
On clicking download, accept the terms and conditions.
Click on the.dmg file and move the android studio to the application folder (On Mac which I am Using)

Once android studio is installed, prerequisites should be set to run the android app tests smoothly. Run following commands on terminal to finish the complete setup

brew install android-sdk (homebrew should be installed before using brew). In case of download failure or any errors run brew install --cask android-sdk
brew install --cask android-platform-tools (to add android platform tools)

Then set environment variables (android_home and platform-tools)
 add these lines to bash_profile file 
 - export ANDROID_HOME={path to sdk}/android-sdk
- PATH=”{path to platform-tools}/platform-tools:${PATH}”

create a virtual device(using the avd-manager
Download app code from https://drive.google.com/file/d/1PFtSZR7cqviSWByLl1aqSkFzdWaDRssX/view?usp=sharing , unzip the file

then click file >> new >> import project to get unzipped project folder or open existing project to access the folder with the project files

When imported collectly run the application To confirm everything is set upcorrectly
