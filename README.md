# EasyPortfolio
So you have developed full Application, Now the part comes when you are required to showcase your awesome projects but you feel terrible for creating something boilerplate. Now don't feel just write couple of lines about your projects and provide link to those projects and bamm you get the PortfolioActivity. 

<img src="https://github.com/webianks/EasyPortfolio/blob/master/screen.png" height="700" width="400" >


# Download

**Gradle**

```groovy
compile 'com.webianks.library:easy-portfolio:1.0.0'
```
**Maven**

```xml
<dependency>
  <groupId>com.webianks.library</groupId>
  <artifactId>easy-portfolio</artifactId>
  <version>1.0.0</version>
  <type>pom</type>
</dependency>
```

# Usage

Use these block of code inside the onClick method of the Activity/Fragment from where you want to open the PortfolioActivity.

Step 1:

First of all create a list of projects by adding ProjectName, ProjectDescription and ProjectLink and mind that you should use the <b>Project</b> as a type of list.

```
 List<Project> projectList = new ArrayList<>();

 Project pollstap = new Project();
 pollstap.setProjectName("PollsTap");
 pollstap.setProjectDesc("Polling based social networking app." +
                " You can start new polls and reach a conclusion based on the voting.");
 pollstap.setProjectLink("https://play.google.com/store/apps/details?id=com.webianks.pollstap");

 Project popupBubble = new Project();
 popupBubble.setProjectName("PopupBubble");
 popupBubble.setProjectDesc("Easily add and customise \"New Post\" popup button with the feeds (RecyclerView) of your app.");
 popupBubble.setProjectLink("https://github.com/webianks/PopupBubble");

 projectList.add(pollstap);
 projectList.add(popupBubble);

```

Step 2:

Pass this 'projectList' to the 'withProjectList()' method then build and start to launch the activity.

```java

    new EasyPortfolio.Builder(this)
          .withGithubUrl("http://www.github.com/webianks")
          .withPlayStoreUrl("https://play.google.com/store/apps/dev?id=5406110317606112331")
          .withLinkedInUrl("https://www.linkedin.com/in/ramankit-singh-b7b09493/")
          .withProjectList(projectList)
          .build()
          .start();
```

# License

```
Copyright 2017 Ramankit Singh

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
   
```
