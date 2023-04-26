# spring-cloud-config-server
<!-- PROJECT SHIELDS -->

<!--
*** I'm using markdown "reference style" links for readability.
*** Reference links are enclosed in brackets [ ] instead of parentheses ( ).
*** See the bottom of this document for the declaration of the reference variables
*** for contributors-url, forks-url, etc. This is an optional, concise syntax you may use.
*** https://www.markdownguide.org/basic-syntax/#reference-style-links
-->
[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![LinkedIn][linkedin-shield]][linkedin-url]

<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/yewin-mm/spring-cloud-config-server.svg?style=for-the-badge
[contributors-url]: https://github.com/yewin-mm/spring-cloud-config-server/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/yewin-mm/spring-cloud-config-server.svg?style=for-the-badge
[forks-url]: https://github.com/yewin-mm/spring-cloud-config-server/network/members
[stars-shield]: https://img.shields.io/github/stars/yewin-mm/spring-cloud-config-server.svg?style=for-the-badge
[stars-url]: https://github.com/yewin-mm/spring-cloud-config-server/stargazers
[issues-shield]: https://img.shields.io/github/issues/yewin-mm/spring-cloud-config-server.svg?style=for-the-badge
[issues-url]: https://github.com/yewin-mm/spring-cloud-config-server/issues
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://www.linkedin.com/in/ye-win-1a33a292/

<h1 align="center">
  Overview
  <img src="https://github.com/yewin-mm/spring-cloud-config-server/blob/master/github/template/images/overview/cloud_config.png" /><br/>
</h1>


# spring-cloud-config-server
* This is the sample service for Spring Cloud Config Server.
* Nowadays, We used spring cloud config for centralization for all configures at one place over `Git` call config repository (properties or yml files store). 
* Also, we don't need to restart our application again if we changed something in our `application.properties` files or if we want to change something in that config file.
* So, Spring Cloud Config is used for centralized configuration and used to change config at runtime collaborate with Spring boot Actuator build in `Refresh` api. 
* This project is communicate with [Spring Cloud Config Sample Microservice A](https://github.com/yewin-mm/spring-cloud-config-sample-microservice-a) as for config sample client service and 
[Spring Cloud Config Sample Microservice B](https://github.com/yewin-mm/spring-cloud-config-sample-microservice-b) as for another config sample client service <br>
and communicate with [Config Files Storage](https://github.com/yewin-mm/spring-cloud-config-files-storage) as for config files storage repository. 

<!-- TABLE OF CONTENTS -->
## Table of Contents
- [About The Project](#about-the-project)
    - [Built With](#built-with)
- [Getting Started](#getting-started)
    - [Before you begin](#before-you-begin)
    - [Clone Project](#clone-project)
    - [Prerequisites](#prerequisites)
    - [Instruction](#instruction)
      -  [Setup Config file store and Run Services](#setup-and-run-services)
      -  [Testing](#testing)
        -  [Testing Config Server](#testing-config-server)
- [Contact Me](#contact)
- [Contributing](#Contributing)


<a name="about-the-project"></a>
## ⚡️About The Project
This is Demo Project for Spring Cloud Config Server. <br>
Client services will fetch config properties from this server and this cloud config server get those properties files from [config files repository](https://github.com/yewin-mm/spring-cloud-config-files-storage) through `Git`. <br>
So, firstly, you need to put `application.properties` or `yml` for this application to `Github` or `Bitbucket` or you can even use your local config folder which already committed to local git repository. <br>
Here, config file means your application require file like `application.properties` or `application.yml` file.

<a name="built-with"></a>
### 🪓 Built With
This project is built with
* [Java](https://www.oracle.com/au/java/technologies/javase/javase-jdk8-downloads.html)
* [Maven](https://maven.apache.org/download.cgi)

<a name="getting-started"></a>
## 🔥 Getting Started
This project is built with Java, Maven.
So, please make sure all are installed in your machine.

<a name="before-you-begin"></a>
### 🔔 Before you begin
If you are new in Git, GitHub and new in Spring Boot configuration structure, <br>
You should see basic detail instructions first in here [Spring Boot Application Instruction](https://github.com/yewin-mm/spring-boot-app-instruction)<br>
If you are not good enough in basic API knowledge with Java Spring Boot and other spring basic knowledge, you should learn below example projects first. <br>
Click below links.
* [Spring Boot Sample CRUD Application](https://github.com/yewin-mm/spring-boot-sample-crud) (for sample CRUD application)
* [Reading Values from Properties files](https://github.com/yewin-mm/reading-properties-file-values) (for reading values from properties files)
* [Spring Profile](https://github.com/yewin-mm/spring-profile-properties-yml-file) (for knowing spring profiles)
* [Config Files Store](https://github.com/yewin-mm/spring-cloud-config-files-storage) (for config file store)
* [Spring Cloud Config Sample Microservice A](https://github.com/yewin-mm/spring-cloud-config-sample-microservice-a) (for sample config client)
* [Spring Cloud Config Sample Microservice B](https://github.com/yewin-mm/spring-cloud-config-sample-microservice-b) (for sample config client)


<a name="clone-project"></a>
### 🥡 Clone Project
* Clone the repo
   ```sh
   git clone https://github.com/yewin-mm/spring-cloud-config-server.git
   ```

<a name="prerequisites"></a>
### 🔑 Prerequisites
Prerequisites can be found here, [Spring Boot Application Instruction](https://github.com/yewin-mm/spring-boot-app-instruction). <br>
You need to clone [Config Files Store](https://github.com/yewin-mm/spring-cloud-config-files-storage) for getting and managing properties files <br>
and [Spring Cloud Config Sample Microservice a](https://github.com/yewin-mm/spring-cloud-config-sample-microservice-a) for sample client a and [Spring Cloud Config Sample Microservice b](https://github.com/yewin-mm/spring-cloud-config-sample-microservice-b) for sample client b.


<a name="instruction"></a>
### 📝 Instruction
<a name="setup-and-run-services"></a>
#### Setup Config file store and Run Services
* Clone [Config Files Store](https://github.com/yewin-mm/spring-cloud-config-files-storage) or create folder with properties files.
  * If you manual created folder with creating some properties files like above config file store,
  * Firstly, you need to do that config files store folder as git repository.
  * Go to your created config file repo folder(directory) with CMD or Terminal
  * Type `git init` and type `git add .` and type `git commit -m "first commit for config"` and connect with your git by `git remote {url}` and type `git push -u origin master`.
    * (`git init` command should type only `one time` for this folder).
* Clone and run this config server application.
* If you did manual created config store folder and you want to connect this server to your config store folder, you need to push your config store folder to your Github or other git based code store repo like Bitbucket and you need to change your store url in `spring.cloud.config.server.git.uri` field inside `application.properties` file in this config server application.
* You can even use my config store url (above Config File Store repo), but if you want to change field value, you can't do that because you used my config repo. So, it's better creating new folder and pushing into your Github.

<a name="testing"></a>
#### Testing
* Import `cloud config.postman_collection.json` file under project directory (see that file in project directory) into your installed Postman application.
  * Click in your Postman (top left corner) import -> file -> upload files -> {choose that json file} and open/import.
  * After that, you can see the folder which you import from file in your Postman.
  * Open your imported `cloud-config` folder in postman and inside this folder, you will see total of 3 folders,


<a name="testing-config-server"></a>
##### Testing Config Server
* Now, you can test Config Server by calling api from Postman.
* Please note that your Config File Store directory is already git project as above [Setup Config file store](#setup-and-run-services) step.
* Open `config-server` folder
  * Open `(build-in api) (service a) check properties (default profile)` api, click `send` button, you can see Service A default profile config values.
  * And this values is from `microservice-a.properties` file and which file under your cloned config file store directory.
  * You can also call for `service b` sample APIs.
  * You can also check for another check properties APIs `as per application profile` and I already dropped those APIs in that folder.
  * You can also check `encrypt` and `decrypt` APIs by adding test value in encrypt api, and you will get encrypted value, <br>
    and you can add that encrypted value in decrypt api and you will get decrypted value.
  * Those `encrypt` and `decrypt` APIs is just for testing encryption which will use in our config file store and config server as for security. <br>
    Because someone may get your config files, and he can easily get your secret credentials like server credentials.
  * Because in real world applications, you need to push your config file store in GitHub or Bitbucket.
  * That approach is because your real world running application in cloud server can't connect to your local config directory and so, you need to push your config repo to GitHub or Bitbucket.
  * So, this config file store directory is just for testing in local laptop and even if you push your config file store in GitHub as repository,
    your config server can fetch that config file directory well and I already dropped that sample cloud config file url in `application.properties` file of  config server too.


<a name="contact"></a>
## ✉️ Contact
Name - Ye Win <br> LinkedIn profile -  [Ye Win's LinkedIn](https://www.linkedin.com/in/ye-win-1a33a292/)  <br> Email Address - yewin.mmr@gmail.com

Project Link: [Spring Cloud Config Server](https://github.com/yewin-mm/spring-cloud-config-server)


<a name="contributing"></a>
## ⭐ Contributing
Contributions are what make the open source community such an amazing place to be learnt, inspire, and create. Any contributions you make are **greatly appreciated**.
<br>If you want to contribute....
1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/yourname`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeatures'`)
4. Push to the Branch (`git push -u origin feature/yourname`)
5. Open a Pull Request
