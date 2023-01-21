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
* This project is communicate with [Spring Cloud Config Sample Microservice A](https://github.com/yewin-mm/spring-cloud-config-sample-microservice-a) as for config sample client service <br> and 
[Spring Cloud Config Sample Microservice B](https://github.com/yewin-mm/spring-cloud-config-sample-microservice-b) as for another config sample client service <br>
and communicate with [Config Files Storage](https://github.com/yewin-mm/spring-cloud-config-files-storage) as for config files storage repository. 

<!-- TABLE OF CONTENTS -->
## Table of Contents
- [About The Project](#about-the-project)
    - [Built With](#built-with)
- [Getting Started](#getting-started)
    - [Before you begin](#before-you-begin)
    - [Clone Project](#clone-project)
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
