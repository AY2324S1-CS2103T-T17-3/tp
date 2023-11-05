---
layout: page
title: User Guide
---

## Welcome to TutorConnect

TutorConnect is an address book made for **tuition centre coordinators** to easily track and schedule tuition classes.

Say goodbye to scheduling conflicts and the complicated process of allocating classes to your tutors!

Here’s an overview of what you can do with TutorConnect:
* Store and edit information about your tutors
* Create and plan your tutor availability and schedule
* View upcoming schedules

Sounds good, right? On top of these functionalities, we believe in bringing you the most efficient scheduling tool. 
TutorConnect is **optimised for users who can type fast** and utilise the [Command Line Interface (CLI)](#glossary) to complete tasks using the keyboard faster than using the mouse.

--------------------------------------------------------------------------------------------------------------------
## Table of Contents
* Table of Contents
{:toc}
--------------------------------------------------------------------------------------------------------------------

## Usage of the User Guide

This User Guide is designed to be used alongside TutorConnect, for you to make the most of the app and get the most
enjoyable experience tracking and scheduling tuition classes.

A warm welcome to TutorConnect! Before we dive into the details, let's get you started with a quick overview of how 
to navigate and use this User Guide successfully.

For **Beginner Users**, we're thrilled to have you onboard! Get started with a [Tutorial](#tutorconnect-tutorial-for-new-users) here.

For **Experienced Users**, thank you for choosing TutorConnect! You may refer to the [Command Summary](#command-summary) here.

### Navigating the User Guide
TutorConnect's User Guide is made with you mind. It is designed to be user-friendly and easy to navigate. Here are a 
few tips for smooth navigation:
* Hyperlinks: Throughout this guide, you'll find [hyperlinks](#usage-of-the-user-guide) that can take you to related sections or external 
  resources. Click on these links to access additional information or jump to different parts of the guide.
* Back to Top Button: At the end of each section, you'll find a [Back To Top](#table-of-contents) button, to return 
  you to the Table of Contents.

### Common Notation
Throughout this User Guide, you will also find some common notations, to provide you with extra information you may 
need. Look out for these coloured boxes!

<div markdown="block" class="alert alert-success">

**:bulb: Tip**<br>

`Tips` are used to provide helpful advice, suggestions, or best practices to enhance your experience by making a task easier or more efficient.

</div>

<div markdown="block" class="alert alert-warning">

**:warning: Warning**<br>

`Warnings` are used to alert you about potential issues, errors, or risks associated with a task or action. They are essential for preventing mistakes and ensuring safety.

</div>

<div markdown="block" class="alert alert-info">

**:information_source: Information**<br>

`Information` sections provide additional background knowledge or context to help you understand a topic better.

</div>

[Back To Top](#table-of-contents)

--------------------------------------------------------------------------------------------------------------------

## Quick Start

Welcome to TutorConnect! We are excited to get you started with a more efficient scheduling method.

1. Ensure you have Java `11` installed in your Computer. To verify, perform the following steps:
    1. Open a terminal. Refer to the following guides on how:
        1. [MacOS](https://support.apple.com/en-sg/guide/terminal/apd5265185d-f365-44cb-8b09-71a064a42125/mac#:~:text=Terminal%20for%20me-,Open%20Terminal,%2C%20then%20double%2Dclick%20Terminal)
        2. [Windows](https://www.howtogeek.com/235101/10-ways-to-open-the-command-prompt-in-windows-10/#:~:text=anywhere%20you%20like.-,Open%20Command%20Prompt%20from%20the%20Run%20Box,open%20an%20administrator%20Command%20Prompt)
    2. Type `java -version` and press Enter.
    3. If it says a version other than 11 or `command not found`, please install Java 11 by following this [guide](https://www.java.com/en/download/help/download_options.html).

2. Download the latest jar file (tutorconnect.jar) from our [Github Releases](https://github.com/AY2324S1-CS2103T-T17-3/tp/releases).

3. Move the jar file into a new folder called “TutorConnect”.

4. Double-click the jar file to launch the application.

   <div markdown="block" class="alert alert-info">

   **:information_source: Mac Users**<br>

   If you are a Mac user, you may encounter a warning that says
   the jar file cannot be opened because it is from an unidentified developer. To continue:

    1. Right-click on the jar file and select `Open With > JavaLauncher (default)`
    2. Press Open when prompted

   </div>

### Navigating the Interface

TutorConnect comes equipped with a [GUI](#glossary) interface that provides visual feedback to you.
Below is a quick overview of the various components of our interface.

![ui overview](images/uiOverview.png)

| Component        | Description                                                                                | 
|------------------|--------------------------------------------------------------------------------------------|
| Command Box      | You will enter your [commands](#glossary) along with its input here.                       |
| Menu Bar         | Contains dropdown menu options for the application.                                        |
| Result Display   | Displays the results of your commands.<br/>Any error messages will also be displayed here. | 
| Tutor Details    | Contains information related to the tutor like name, phone number etc.                     |
| Schedule Details | Contains information related to the schedule like assigned tutor, start time etc.          |
| Current Time     | Displays the current date and time.                                                        |

[Back To Top](#table-of-contents)

--------------------------------------------------------------------------------------------------------------------

## TutorConnect Tutorial (for new users)

Hello and welcome to TutorConnect! We're delighted you've chosen our platform to manage your tuition center's tutors and schedules. 

Before we begin, please ensure that you have viewed the following sections of the guide:
* [Quick Start](#quick-start) to help you get TutorConnect up and running.
* [Navigating the Interface](#navigating-the-interface) to get you familiarised on how to navigate TutorConnect.

This tutorial aims to guide you through the essential features and functionalities of TutorConnect that you will use 
on a day-to-day basis. You will be adding your first tutor and corresponding schedule!

Click on any of these below to jump to the respective sections of the guide!
* [Start](#start)
* [Adding your first tutor](#adding-your-first-tutor)
* [Adding your first schedule](#adding-your-first-schedule)
* [Marking your schedule as completed](#marking-your-schedule-as-completed)

### Start
![start](images/tutorial/start.png)

When you first launch TutorConnect, you will be greeted with an empty screen with no tutors. It's time to start adding your tutors to TutorConnect.

### Adding your first tutor

![add-t](images/tutorial/add-t.png)

Let's say you have a tutor named **John Doe**, he has provided you with his phone number: **9123 4567** and his email address: **johndoe@example.com**.

Here is how you would use the [**add-t**](#adding-a-tutor-add-t) command to add John Doe to TutorConnect:
1. Simply type into the Command Box: `add-t n/John Doe p/91234567 e/johnd@example.com`
2. Hit enter
3. Voila! John Doe is now in TutorConnect

### Adding your first schedule

![add-s](images/tutorial/add-s.png)

Now that your tutors are in TutorConnect, it's time to start scheduling classes for them!

Let's say you have a class on **1 October 2023** from **9AM to 11AM**.

Let's assign the class to **John Doe**.

Here is how to use the [**add-s**](#adding-a-schedule-add-s) command to assign the schedule to John Doe:
1. Get the **TUTOR_INDEX** of the tutor you wish to assign the schedule to
   ![tutor-index](images/tutorial/tutor-index.png)
2. Simply type into the Command Box: `add-s 1 st/2023-10-01T09:00 et/2023-10-01T11:00`
3. Hit enter
4. Tada! John Doe now has a schedule on **1 October 2023** from **9AM to 11AM**

### Marking your schedule as completed

![mark](images/tutorial/mark.png)

Now that class is over, it is time to mark the schedule as completed!

Here is how to use the [**mark**](#marking-a-schedule-mark) command to mark the schedule as completed:
1. Get the **SCHEDULE_INDEX** of the schedule you wish to mark as completed
   ![schedule-index](images/tutorial/schedule-index.png)
2. Simply type into the Command Box: `mark 1 m/1`
3. Hit enter
4. Tada! The schedule is now marked as completed

**Congratulations!** You have successfully added your first tutor and schedule, and also completed a schedule in TutorConnect. We hope that this tutorial has helped guide you through the basic features of TutorConnect. Please refer to the [**Features Section**](#features) to see what else TutorConnect can do. Alternatively visit the [**FAQ**](#faq) to view the frequently asked questions.

[Back To Top](#table-of-contents)

--------------------------------------------------------------------------------------------------------------------

## Features
From pairing classes with tutors to managing your tuition centre schedules, TutorConnect provides you with a 
fuss-free solution for all your scheduling needs. This section shows you how to use TutorConnect to its full 
potential. Let's get started!

### Tutor Related Features

Tutors are the core of your tuition centre management. This section will show you all the features related to 
tracking tutor information within your tuition centre.

#### Adding a tutor: `add-t`

Adds a tutor to TutorConnect.

##### :star: First time users
{:.no_toc}

**Scenario**

A new tutor named **John Doe** has just joined your tuition centre. His phone number is **98765432** and his email 
address is **johnd@example.com**.

Let’s add him into TutorConnect.

**Follow these steps**

Type in `add-t n/John Doe p/98765432 e/johnd@example.com` and press enter.

**What you can expect to see**

Amazing! Tutor John Doe has now been added to the bottom of the displayed list.

![add tutor](images/addTutor.png)


##### :star::star::star: Experienced users
{:.no_toc}

**Command format**

![add tutor command](images/addTutorCommandSyntax.png)

**Errors you might encounter**

Here is a list of the error messages you may encounter, when the command is entered incorrectly:

| Error Message                                                                              | Reason                                                                    |
|--------------------------------------------------------------------------------------------|---------------------------------------------------------------------------|
| `Invalid command format!`                                                                  | One or more of the tags `n/`, `p/`, `e/` is missing.                      |
| `Names should only contain alphanumeric characters and spaces, and it should not be blank` | Tutor name input was either invalid or blank.                             |
| `Phone numbers should only contain numbers, and it should be at least 3 digits long`       | Tutor phone number input was either invalid or blank.                     |
| `Emails should be of the format local-part@domain and adhere to the following constraints` | Tutor email input was <br/>either invalid or blank[<sup>1</sup>](#note1). |
| `Multiple values specified for the following single-valued field(s): n/`                   | More than 1 `n/` was given in the command.                                |
| `Multiple values specified for the following single-valued field(s): p/`                   | More than 1 `p/` was given in the command.                                |
| `Multiple values specified for the following single-valued field(s): e/`                   | More than 1 `e/` was given in the command.                                |
| `This tutor already exists in the address book`                                            | There is a tutor with the same name in the address book.                  |

Refer to [input information](#input-examples) for details about valid inputs.

[Back To Top](#table-of-contents)

#### Editing a tutor: `edit-t`

Edits an existing tutor found in TutorConnect.

##### :star: First time users
{:.no_toc}

**Scenario**

Imagine that tutor John Doe has changed his phone number to **87654321**.\
As a tuition centre coordinator, you want to have the most up-to-date information on your tutors.  

Let's use the edit tutor command to update his phone number!

**Follow these steps**

1. Type in `list-t`, press enter, and find John Doe in the list of tutors.
2. Let's say you found him at position 9.
3. Type in `edit-t 9 p/87654321` and press enter.

**What you can expect to see**

Viola! His phone number has now been updated to **87654321**.

![edit tutor](images/editTutor.png)

##### :star::star::star: Experienced users
{:.no_toc}

**Command format**

![edit tutor command](images/editTutorCommandSyntax.png)

**Errors you might encounter**

Here is a list of the error messages you may encounter, when the command is entered incorrectly:

| Error Message                                                                              | Reason                                                               |
|--------------------------------------------------------------------------------------------|----------------------------------------------------------------------|
| `Invalid command format!`                                                                  | Invalid or missing TUTOR_INDEX.                                      |
| `The person index provided is invalid`                                                     | TUTOR_INDEX entered is not in the range of number of tutors.         |
| `Names should only contain alphanumeric characters and spaces, and it should not be blank` | Tutor name input was either invalid or blank.                        |
| `Phone numbers should only contain numbers, and it should be at least 3 digits long`       | Tutor phone number input was either invalid or blank.                |
| `Emails should be of the format local-part@domain and adhere to the following constraints` | Tutor email input was either invalid or blank[<sup>1</sup>](#note1). |
| `Multiple values specified for the following single-valued field(s): n/`                   | More than 1 `n/` was given in the command.                           |
| `Multiple values specified for the following single-valued field(s): p/`                   | More than 1 `p/` was given in the command.                           |
| `Multiple values specified for the following single-valued field(s): e/`                   | More than 1 `e/` was given in the command.                           |
| `This tutor already exists in the address book`                                            | There is a tutor with the same name in the address book.             |
| `At least one field to edit must be provided`                                              | There is no `n/`, `p/` or `e/` tag provided to edit a field.         |

You can also refer to [input information](#input-examples) for details about valid inputs.

[Back To Top](#table-of-contents)

#### Listing all tutors: `list-t`

Displays a list of all tutors in TutorConnect.

##### :star: First time users
{:.no_toc}

**Scenario**

Imagine that you have found the details of the tutor **John Doe** and want to go back to view the list of tutors.\
As a tuition centre coordinator, you want to view the list of tutors after filtering the list of tutors.

Let's use the list tutor command to view the most updated list of tutors!

**Follow these steps:**

1. Type in `find-t John` and press enter to find any tutors with the name John.
2. Let's say you have successfully found one tutor named John Doe.
3. Type in `list-t` and press enter to go back to view the full updated list of tutors.

**What you can expect to see**

Great job! You have found the full updated list of tutors.

![list tutor](images/listTutor.png)

##### :star::star::star: Experienced users
{:.no_toc}

Unlike [`list-s`](#listing-all-schedules-list-s), `list-t` does not take in any fields.\
Anything you type after `list-t` will be ignored.

[Back To Top](#table-of-contents)

#### Locating tutors by name: `find-t`

Find tutors whose names contain any of the given keywords.

##### :star: First time users
{:.no_toc}

**Scenario**

You would like to contact tutor **John Doe**, but you can't remember his phone number. You try to look for him in the 
list of tutors but the list has gotten far too long, and you can't find him.

Fret not! The find tutor command is here to save the day.

**Follow these steps**

Type in `find-t john` and press enter.

**What you can expect to see**

Tada! You have found tutor **John Doe** (and any other tutors whose name contains John).

![find tutor](images/findTutor.png)

##### :star::star::star: Experienced users
{:.no_toc}

**Command format**

![find tutor command](images/findTutorCommandSyntax.png)

**Errors you might encounter**

This command is relatively straight forward to use and has only 1 possible error:

| Error Message             | Reason                          |
|---------------------------|---------------------------------|
| `Invalid command format!` | No search keyword was provided. |

<div markdown="block" id="search-behaviour" class="alert alert-info">

**:information_source: Search behaviour**<br>

* The search is case-insensitive. e.g. `hans` will match for `Hans` too!
* The order of the keywords does not matter. e.g. `Hans Bo` will match `Bo Hans`
* Only full words will be matched. e.g. `Han` will not match `Hans`
* Tutors matching at least one keyword will be matched. e.g. `Hans Bo` will match both `Hans Gruber` and `Bo Yang`

</div>

You can also refer to [input information](#input-examples) for details about valid inputs.

[Back To Top](#table-of-contents)

#### Deleting a tutor: `delete-t`

Deletes a tutor from TutorConnect.

##### :star: First time users
{:.no_toc}

**Scenario**

Imagine the tutor **John Doe** has left the tuition centre and you want to remove him from the tutor list to keep
the list of tutors updated.

No worries! Let the delete tutor command help you to remove **John Doe** from the tutor list.

**Follow these steps**

1. Type `list-t` and press enter to get the index number of the tutor to be deleted.
2. Let's say the tutor to be deleted **John Doe**, is in position 9 of the tutor list.
3. Type `delete-t 9` and press enter.

**What you can expect to see**

Well done! You have deleted tutor **John Doe**.

![delete tutor](images/deleteTutor.png)

##### :star::star::star: Experienced users
{:.no_toc}

**Command format**
![delete tutor command](images/deleteTutorCommandSyntax.png)

**Errors you might encounter**

Here is a list of the error messages you may encounter, when the command is entered incorrectly:

| Error Message                          | Reason                                                       |
|----------------------------------------|--------------------------------------------------------------|
| `Invalid command format!`              | Invalid or missing TUTOR_INDEX.                              |
| `The person index provided is invalid` | TUTOR_INDEX entered is not in the range of number of tutors. |

You can also refer to [input information](#input-examples) for details about valid inputs.

[Back To Top](#table-of-contents)

### Schedule Related Features
As busy tuition centre coordinators, creating conflict-free schedules is no easy feat. Don't worry! TutorConnect has 
you covered with our extensive list of features, all about creating and managing scheduling issues.

#### Adding a schedule: `add-s`

Adds a schedule to a specified tutor.

##### :star: First time users
{:.no_toc}

**Scenario**

You have a new upcoming class on **1 December 2023** from **9AM to 11AM**. 

Let's schedule this class to the tutor **Bernice Yu**.

**Follow these steps**

Type in `add-s 1 st/2023-12-01T09:00 et/2023-12-01T11:00` and press enter.

**What you can expect to see**

Wow! The new schedule for Bernice Yu has now been added to the list of schedules.

![add schedule](images/addSchedule.png)

##### :star::star::star: Experienced users
{:.no_toc}

**Command format**

![add schedule command](images/addScheduleCommandSyntax.png)

Here is a list of the error messages you may encounter, when the command is entered incorrectly:


| Error Message                                                                                                      | Reason                                                                                       |
|--------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------|
| `Invalid command format!`                                                                                          | Invalid `TUTOR_INDEX` or some of the tags `st/`, `et/` is missing.                           |
| `StartTime should only contain a valid date and time in the format "yyyy-MM-ddTHH:mm", and it should not be blank` | The start time entered is not in the correct datetime format[<sup>2</sup>](#note2).          |
| `EndTime should only contain a valid date and time in the format "yyyy-MM-ddTHH:mm", and it should not be blank`   | The end time entered is not in the correct datetime format[<sup>2</sup>](#note2).            |
| `Multiple values specified for the following single-valued field(s): st/`                                          | More than 1 `st/` was given in the command.                                                  |
| `Multiple values specified for the following single-valued field(s): et/`                                          | More than 1 `et/` was given in the command.                                                  |
| `This schedule already exists in the address book`                                                                 | There is a schedule for the same tutor with the same start and end time in the address book. |
| `This tutor has a clashing schedule in the address book`                                                           | There is a schedule for the same tutor with overlapping times in the address book.           |
| `Schedules start time must be before its end time and both should be on the same day`                              | The provided start time is either before the end time or they are not on the same day.       |

Refer to [input information](#input-examples) for details about valid inputs.

[Back To Top](#table-of-contents)

#### Editing a schedule: `edit-s`

Edits an existing schedule in TutorConnect.

##### :star: First time users
{:.no_toc}

**Scenario**

One day, tutor Bernice Yu requested to change the timing of a class on 15th September, so that it starts at 8am 
instead of 9am.

The edit schedule function is here for that!

**Follow these steps**

1. Type in `list-s` to find the schedule to update.
2. Let's say the schedule to be updated is in position 1.
3. Type in `edit-s 1 st/2023-09-15T08:00` and press enter.

**What you can expect to see**

Tada! The schedule has now been updated to 8am.

![edit schedule](images/editSchedule.png)


##### :star::star::star: Experienced users
{:.no_toc}

**Command format**

![edit schedule command](images/editScheduleCommandSyntax.png)

**Errors you might encounter**

Here is a list of the error messages you may encounter, when the command is entered incorrectly:

| Error Message                                                                                                      | Reason                                                                                       |
|--------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------|
| `Invalid command format!`                                                                                          | Invalid or missing SCHEDULE_INDEX.                                                           |
| `The schedule index provided is invalid`                                                                           | SCHEDULE_INDEX entered is not in the range of number of schedules.                           |
| `EndTime should only contain a valid date and time in the format "yyyy-MM-ddTHH:mm", and it should not be blank`   | The end time entered is not in the correct datetime format[<sup>2</sup>](#note2).            |
| `StartTime should only contain a valid date and time in the format "yyyy-MM-ddTHH:mm", and it should not be blank` | The start time entered is not in the correct datetime format[<sup>2</sup>](#note2).          |
| `Multiple values specified for the following single-valued field(s): st/`                                          | More than 1 `st/` was given in the command.                                                  |
| `Multiple values specified for the following single-valued field(s): et/`                                          | More than 1 `et/` was given in the command.                                                  |
| `This schedule already exists in the address book`                                                                 | There is a schedule for the same tutor with the same start and end time in the address book. |
| `This tutor has a clashing schedule in the address book`                                                           | There is a schedule for the same tutor with overlapping times in the address book.           |
| `At least one field to edit must be provided`                                                                      | There is no `st/` or `et/` tag provided to edit a field.                                     |
| `Schedules start time must be before its end time and both should be on the same day`                              | The provided start time is either before the end time or they are not on the same day.       |


You can also refer to [input information](#input-examples) for details about valid inputs.

[Back To Top](#table-of-contents)

#### Listing all schedules: `list-s`

Displays a list of all schedules in TutorConnect. List can be filtered by tutors using the index number provided in the tutor list, or filter by `COMPLETED` or `MISSING` status.

##### :star: First time users
{:.no_toc}

**Scenario**

You wish to view schedules assigned to tutor **Irfan Ibrahim** that have been marked as `COMPLETED`.

The list schedule function is here for that!

**Follow these steps**

1. On the left panel that shows the list of tutors, check the `TUTOR_INDEX` of Irfan Ibrahim, in this case, his number is 2.
![list schedule](images/list-schedules/list-s.png)
2. Type in `list-s 2 m/1` where `m/1` represents schedules marked as `COMPLETED` and press enter.
3. If you wish to view the schedules that are marked as `MISSED` only, you can also enter `list-s m/0` where `m/0` represents schedules marked as `MISSED` and press enter.

**What you can expect to see**

Tada! For step 2, the schedule list has now been updated to show schedules from tutor Irfan Ibrahim that are marked as `COMPLETED`.

![list schedule tutor completed](images/list-schedules/list-s-tutor-completed.png)


For step 3, the schedule list has been updated to show schedules that are marked as `MISSED`.

![list schedule missed](images/list-schedules/list-s-missed.png)

<div markdown="block" class="alert alert-info">

**:bulb: Tip**<br>

`list-s` command is equipped with flexible options to view a list of schedules that covers the following scenarios:
- `list-s` : To show all schedules.
- `list-s 1` : To show schedules by tutor that associates with `tutor_index`1.
- `list-s m/0` : To show schedules marked as `MISSING`.
- `list-s m/1` : To show schedules marked as `COMPLETED`.
- `list-s 1 m/0` : To show schedules by `tutor_index` 1 marked as `MISSING`.

</div>

##### :star::star::star: Experienced users
{:.no_toc}

**Command format**

![list schedule command](images/list-schedules/list-s-syntax.png)

<div markdown="block" class="alert alert-warning">

**:warning: Warning**<br>

`TUTOR_INDEX` and `m/` are optional fields to add as per type of usage. However an error will still occur if invalid values are passed into these fields.

</div>

**Errors you might encounter**

Here is a list of the error messages you may encounter, when the command is entered incorrectly:

| Error Message                                                            | Reason                                                         |
|--------------------------------------------------------------------------|----------------------------------------------------------------|
| `Invalid command format!`                                                | `TUTOR_INDEX` is not a valid number.                           |
| `The person index provided is invalid`                                   | `TUTOR_INDEX` entered is not in the range of number of tutors. |
| `Status has to be either MISSED (m/0) or COMPLETED (m/1)`                | Invalid value of `/m` was entered.                             |
| `Multiple values specified for the following single-valued field(s): m/` | More than 1 `m/` was given in the command.                     |



You can also refer to [input information](#input-examples) for details about valid inputs.

[Back To Top](#table-of-contents)

#### Locating schedules by name: `find-s`

Find schedules whose tutor's names contain any of the given keywords.

##### :star: First time users
{:.no_toc}

**Scenario**

You wish to view the list of schedules from a tutor named **Bernice**. But unfortunately, you forgot what's her last name.

The find schedule function is here for that!

**Follow these steps**

1. Type in `find-s Bernice` and press enter. 

**What you can expect to see**

Tada! The schedule list has now been updated to show schedules from tutor that contains the name "Bernice".

![find schedule tutor](images/find-schedules/find-s.png)


##### :star::star::star: Experienced users
{:.no_toc}

**Command format**

![find schedule command](images/find-schedules/find-s-syntax.png)

Learn more about the [search behaviour](#search-behaviour) and supercharge your search now!

**Errors you might encounter**

Here is a list of the error messages you may encounter, when the command is entered incorrectly:

| Error Message             | Reason                      |
|---------------------------|-----------------------------|
| `Invalid command format!` | No search keyword provided. |


You can also refer to [input information](#input-examples) for details about valid inputs.

[Back To Top](#table-of-contents)


#### Marking a schedule: `mark`

Sets the status of a schedule in TutorConnect.

##### :star: First time users
{:.no_toc}

**Scenario**

A class has ended and hence the schedule representing that class should be now marked as COMPLETED.

Fret not as you can do just that with the mark command.

**Follow these steps**

1. Type in `list-s`, press enter, and find the schedule you want to mark as COMPLETED.
2. Let's say the schedule is at position 1.
3. Type in `mark 1 m/1` and press enter.

**What you can expect to see**

Yay! The schedule has been marked as COMPLETED.

![mark schedule](images/markSchedule.png)

##### :star::star::star: Experienced users
{:.no_toc}

**Command format**

![mark schedule command](images/markScheduleCommandSyntax.png)

<div markdown="block" class="alert alert-info">

**:information_source: Schedule status**<br>

* There are only two types of Schedule status: MISSED or COMPLETED.
* To set the status of the specified schedule to MISSED, input `m/0` as 0 indicates the MISSED status.
* To set the status of the specified schedule to COMPLETED, input `m/1` as 1 indicates the COMPLETED status.
* Any inputs other than 0 or 1 will result in an invalid status message displayed.

</div>

**Errors you might encounter**

Here is a list of the error messages you may encounter, when the command is entered incorrectly:

| Error Message                                             | Reason                                                             |
|-----------------------------------------------------------|--------------------------------------------------------------------|
| `Invalid command format!`                                 | Invalid or missing SCHEDULE_INDEX or missing schedule status.      |
| `The schedule index provided is invalid`                  | SCHEDULE_INDEX entered is not in the range of number of schedules. |
| `Status has to be either MISSED (m/0) or COMPLETED (m/1)` | Schedule status entered is not 0 or 1.                             |

You can also refer to [input information](#input-examples) for details about valid inputs.

[Back To Top](#table-of-contents)

#### Unmarking a schedule: `unmark`

Removes the status of a schedule.

##### :star: First time users
{:.no_toc}

**Scenario**

You have accidentally marked the wrong schedule to be COMPLETED.\
The class for that schedule has yet to occur so its status should be left empty.

Don't worry as you can do just that with the unmark command.

**Follow these steps**

1. Type in `list-s`, press enter, and find the schedule you want to unmark.
2. Let's say the schedule to be unmarked is at position 1.
3. Type in `unmark 1` and press enter.

**What you can expect to see**

Phew! The schedule has now been unmarked.

![unmark schedule](images/unmarkSchedule.png)

##### :star::star::star: Experienced users
{:.no_toc}

**Command format**

![unmark schedule command](images/unmarkScheduleCommandSyntax.png)

**Errors you might encounter**

Here is a list of the error messages you may encounter, when the command is entered incorrectly:

| Error Message                            | Reason                                                             |
|------------------------------------------|--------------------------------------------------------------------|
| `Invalid command format!`                | Invalid or missing SCHEDULE_INDEX.                                 |
| `The schedule index provided is invalid` | SCHEDULE_INDEX entered is not in the range of number of schedules. |

You can also refer to [input information](#input-examples) for details about valid inputs.

[Back To Top](#table-of-contents)

#### Deleting a schedule: `delete-s`

Deletes a schedule from TutorConnect.

##### :star: First time users
{:.no_toc}

**Scenario**

Imagine the schedule assigned to **Bernice Yu** on **15 September 9am to 11am** has been cancelled, and you want to remove the schedule.

No worries! Let the delete schedule command help you!

**Follow these steps**

1. Type `list-s` and press enter to get the index number of the schedule to be deleted.
2. Let's say the schedule to be deleted is in position 1 of the schedule list.
3. Type `delete-s 1` and press enter.

**What you can expect to see**

Well done! You have deleted the schedule assigned to **Bernice Yu**.

![delete schedule](images/delete-schedules/delete-s.png)

##### :star::star::star: Experienced users
{:.no_toc}

**Command format**
![delete schedule command](images/delete-schedules/delete-s-syntax.png)

**Errors you might encounter**

Here is a list of the error messages you may encounter, when the command is entered incorrectly:

| Error Message                            | Reason                                                       |
|------------------------------------------|--------------------------------------------------------------|
| `Invalid command format!`                | Invalid or missing `SCHEDULE_INDEX`.                           |
| `The schedule index provided is invalid` | `SCHEDULE_INDEX` entered is not in the range of number of tutors. |

You can also refer to [input information](#input-examples) for details about valid inputs.

[Back To Top](#table-of-contents)

#### Viewing calendar: `show`

Displays schedules on a specified day as a calendar view.

##### :star: First time users
{:.no_toc}

**Scenario**

After adding all your tutor's schedules, you would like to view the schedules on a given day as a calendar.

You're in luck with the calendar view command!

**Follow these steps**

To view the schedules on **15 September 2023** as a calendar, type in `show 2023-09-15` and press enter.

**What you can expect to see**

Woah look at that! The schedules are now being displayed in a calendar form.

![show calendar](images/showCalendar.png)

<div markdown="block" class="alert alert-success">

**:bulb: Worried about having too many schedules to view?**<br>
* The calendar can show schedules for selected tutors only!
* Simply use [`find-t`](#locating-tutors-by-name-find-t) to select the tutors first (e.g. `find-t John` to select all
  tutors with the name John).
* Then use the `show` command to view their schedules in calendar view on a given date. It's that simple!

**Note**:
* Use [`list-t`](#listing-all-tutors-list-t) before `show` to view the schedules for all tutors again.

</div>

##### :star::star::star: Experienced users
{:.no_toc}

**Command format**

![show calendar command](images/showCommandSyntax.png)

**Errors you might encounter**

This command might seem complicated, but it is easy to use with only 1 possible error:

| Error Message             | Reason                   |
|---------------------------|--------------------------|
| `Invalid command format!` | Invalid or missing DATE. |

<div markdown="block" class="alert alert-warning">

**:warning: Calendar Limitations**<br>
* Schedules with very short duration may not be displayed correctly (the schedule's index, status and time will not be visible).
* Using any other commands will hide the calendar view. Use the `show` command to view calendar again. 

</div>

You can also refer to [input information](#input-examples) for details about valid inputs.

[Back To Top](#table-of-contents)

### System Feature

Beyond just providing you with powerful features related to tutors and schedule tracking, TutorConnect offers some 
additional system features to take your experience with us to the next level!

#### Changing theme: `theme`

Changes the theme of TutorConnect.

##### :star: First time users
{:.no_toc}

**Scenario**

Want a change of scenery? TutorConnect supports 3 colour palettes for you to choose from! No more looking at a
boring interface. Let's say you want to switch to `blue` theme.

**Follow these steps**

Type in `theme blue`.

**What you can expect to see**

Wow! A whole new colour scheme.

![change theme](images/changeTheme.png)

##### :star::star::star: Experienced users
{:.no_toc}

**Command format**

![theme command](images/themeCommandSyntax.png)

**Errors you might encounter**

Here is a list of the error messages you may encounter, when the command is entered incorrectly:

| Error Message                   | Reason                                              |
|---------------------------------|-----------------------------------------------------|
| `Invalid command format!`       | New theme field was left blank and not specified.   |
| `Theme provided does not exist` | New theme field was not `dark`, `light` or `blue`.  |

You can also refer to [input information](#input-examples) for details about valid inputs.

[Back To Top](#table-of-contents)

#### Clearing all data: `clear`

Clears all data in TutorConnect.

##### :star: First time users
{:.no_toc}

**Scenario**

You realised that all your current tutors and schedules created are wrong, and you would like to delete them all.

Instead of deleting them one by one, use the clear command!

<div markdown="block" class="alert alert-warning">

**:warning: Warning**<br>

This action is irreversible! Your tutors and schedules will be gone **FOREVER**.

Do not enter the command unless you are very sure.

</div>

**Follow these steps**

Type in `clear` and press enter.

**What you can expect to see**

That's it. It's all gone. TutorConnect should now display an empty address book.

![clear addressbook](images/clearAddressBook.png)

##### :star::star::star: Experienced users
{:.no_toc}

There are no additional information about this command.

As an experienced user, you should be aware of the dangers of the `clear` command.  

[Back To Top](#table-of-contents)

#### Help: `help`

Opens a window with instructions for getting help.

**Scenario**

Unsure on how to use a command or encounter an unknown error?

Get help from within the app by using the help command!

**Follow these steps**

Type in `help` and press enter.

**What you can expect to see**

Is that a bird? Is that a plane?
Nope it's the help window!

![help window](images/helpWindow.png)

<div markdown="block" class="alert alert-success">

**:bulb: Tip**<br>

The help window can also be accessed by the button above the command box!

</div>

[Back To Top](#table-of-contents)

--------------------------------------------------------------------------------------------------------------------

## Frequently Asked Questions
Have some burning questions you want answered? Check out this FAQ section to find out if others have had the same 
question!

**Q**: How do I transfer my data to another Computer?<br>
**A**: Install the app in the other computer and overwrite the empty data file it creates with the file that contains the data of your previous AddressBook home folder.

**Q**: What if I make a mistake when typing a command?<br>
**A**: Don't worry! If you make a mistake while typing a command, TutorConnect will provide an error message to guide you. Simply correct the command and try again.

**Q**: Can I view schedules in a different time zone?<br>
**A**: Currently, TutorConnect displays schedules in your local time zone. If you need to coordinate with tutors in different time zones, you may consider using a world clock or time zone converter alongside the application.

**Q**: Is there a way to export my data from TutorConnect?<br>
**A**: Currently, TutorConnect doesn't have an export feature. However, you can manually copy the `data.json` file from the "TutorConnect" folder for backup or transfer purposes.

**Q**: How do I report a bug or suggest a feature?<br>
**A**: We value your feedback! Please visit our [Github repository](https://github.com/AY2324S1-CS2103T-T17-3/tp) and open an issue to report a bug or make a feature request.

**Q**: I'm encountering an issue not covered here. What should I do?<br>
**A**: Feel free to reach out to our support team at [support@tutorconnect.com](mailto:support@tutorconnect.com). We'll do our best to assist you.

[Back To Top](#table-of-contents)

--------------------------------------------------------------------------------------------------------------------

## Known issues

TutorConnect is always looking to improve. Currently, there are a few known issues within the app that our 
development team is working round the clock to solve. Don't worry, every version of TutorConnect released for you to 
use is sure to solve your scheduling needs.

1. **When using multiple screens**, if you move the application to a secondary screen, and later switch to using only the primary screen, the GUI will open off-screen. The remedy is to delete the `preferences.json` file created by the application before running the application again.

[Back To Top](#table-of-contents)

--------------------------------------------------------------------------------------------------------------------

## Glossary

### Definitions
Here are some descriptions of the words you might come across in the User Guide:

| Term                       | Definition                                                                                                                                                                                                                                                 |
|----------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Command                    | A command is an instruction given to the application to perform a specific action. For example, `list-t` is a command to list all tutors in the address book.                                                                                              |
| GUI                        | GUI is a user interface that allows users to interact with the application using graphical elements like text fields, buttons, and menus.                                                                                                                  |
| <span id="cli">CLI</span>  | CLI is a text-based user interface that allows users to interact with the application by typing commands.                                                                                                                                                  |


### Input Examples

| Input Fields                       | ✅                                                | ❌                                             |
|------------------------------------|--------------------------------------------------|-----------------------------------------------|
| `n/NAME`                           | John Doe, John Doe123                            | John@Doe                                      |
| `p/PHONE NUMBER`                   | 98765432, 987                                    | abc, 98                                       |
| `e/EMAIL`                          | johnd@example.com,<br/>jo@example123-example.com | johnd, johnd@p                                |
| `st/START_TIME`<br/>`et/END_TIME`  | 2023-09-15T09:00,<br/>2023-09-15T11:00           | 2023-09-15 09:00,<br/>2023-09-15T09           |
| `m/SCHEDULE STATUS`                | 0, 1                                             | 3, abc                                        |
| `TUTOR_INDEX`<br/>`SCHEDULE_INDEX` | 1                                                | 0, abc                                        |
| `DATE`                             | 2023-09-15                                       | 2023-09-15T09:00                              |
| `NEW_THEME`                        | dark, light, blue                                | white, brown, black                           |

### Input Information
Here are some inputs you might come across in the User Guide:

| Input               | Description                                       | Limitations                                                                                  |
|---------------------|---------------------------------------------------|----------------------------------------------------------------------------------------------|
| `n/NAME`            | Refers to the name of the tutor.                  | Only contain alphanumeric characters and spaces, and <br/>should <br/>not be blank.          |
| `p/PHONE NUMBER`    | Refers to the phone number of the tutor.          | Only contain numbers, and should be at least 3 <br/>digits long.                             |
| `e/EMAIL`           | Refers to the email address of the tutor.         | Of the format local-part@domain[<sup>1</sup>](#note1).                                       |
| `st/START_TIME`     | Refers to the start time of the schedule.         | Only datetime in `yyyy-MM-ddTHH:mm`[<sup>2</sup>](#note2) format is accepted.                |
| `et/END_TIME`       | Refers to the end time of the schedule.           | Only datetime in `yyyy-MM-ddTHH:mm`[<sup>2</sup>](#note2) format is accepted.                |
| `m/SCHEDULE STATUS` | Refers to the status of schedule in the list.     | Only numerical inputs of 0 for MISSED status and 1 for COMPLETED status is accepted          |
| `TUTOR_INDEX`       | Refers to the position of tutor in the list.      | Only numerical input that ranges from 1 to the last tutor shown in the list of tutors.       |
| `SCHEDULE_INDEX`    | Refers to the position of schedule in the list.   | Only numerical input that ranges from 1 to the last schedule shown in the list of schedules. |
| `DATE`              | Refers to the date to view schedules for.         | Only date in `yyyy-MM-dd` format is accepted.                                                |
| `NEW_THEME`         | Refers to the name of the new theme to switch to. | Only `dark`, `light` and `blue` themes are supported.                                        |

**<sup id="note1">1</sup> Email Format**

1. The local-part should only contain alphanumeric characters and these special characters, excluding the parentheses, (+_.-). The local-part may not start or end with any special characters.
2. This is followed by a '@' and then a domain name. The domain name is made up of domain labels separated by periods.

The domain name must:
* end with a domain label at least 2 characters long
* have each domain label start and end with alphanumeric characters
* have each domain label consist of alphanumeric characters, separated only by hyphens, if any.

**<sup id="note2">2</sup> `yyyy-MM-ddTHH:mm`**
* `yyyy` represents the **year** (e.g., 2023).
* `MM` represents the **month** with a leading zero (e.g., 09 for September, 10 for October).
* `dd` represents the **day** of the month with a leading zero (e.g., 03, 15).
* `T` is a **separator** indicating the start of the time portion.
* `HH` represents the **hour** in **24-hour format** with a leading zero (e.g., 09 for 9 AM, 21 for 9 PM).
* `mm` represents the **minutes** with a leading zero (e.g., 05).

[Back To Top](#table-of-contents)


--------------------------------------------------------------------------------------------------------------------

## Command summary

| Action              | Format, Examples                                                                                           |
|---------------------|------------------------------------------------------------------------------------------------------------|
| **Add Tutor**       | `add-t n/NAME p/PHONE NUMBER e/EMAIL` <br> e.g., `add-t n/John Doe p/98765432 e/johnd@example.com`         |
| **Edit Tutor**      | `edit-t TUTOR_INDEX n/NAME p/PHONE_NUMBER e/EMAIL`<br> e.g.,`edit-t 2 n/James Lee e/jameslee@example.com`  |
| **List Tutor**      | `list-t`                                                                                                   |
| **Delete Tutor**    | `delete-t TUTOR_INDEX`<br> e.g., `delete-t 3`                                                              |
| **Find Tutor**      | `find-t KEYWORD [MORE_KEYWORDS]`<br> e.g., `find-t James Jake`                                             |
| **Add Schedule**    | `add-s TUTOR_INDEX st/START_TIME et/END_TIME` <br> e.g., `add-s 1 st/2023-09-15T09:00 et/2023-09-15T11:00` |
| **Edit Schedule**   | `edit-s SCHEDULE_INDEX [st/START_TIME] [et/END_TIME]` <br> e.g., `edit-s 1 st/2023-09-15T13:00`            |
| **List Schedule**   | `list-s`, `list-s TUTOR_INDEX m/SCHEDULE STATUS` <br> e.g., `list-s 1 m/0`                                 |
| **Mark Schedule**   | `mark SCHEDULE_INDEX m/SCHEDULE STATUS`<br> e.g., `mark 3 m/0`                                             |
| **Unmark Schedule** | `unmark SCHEDULE_INDEX`<br> e.g., `unmark 3`                                                               |
| **Delete Schedule** | `delete-s SCHEDULE_INDEX`<br> e.g., `delete-s 3`                                                           |
| **Find Schedule**   | `find-s KEYWORD [MORE_KEYWORDS]`<br> e.g., `find-s James Jake`                                             |
| **View Calendar**   | `show DATE` <br> e.g., `show 2023-09-15`                                                                   |
| **Change Theme**    | `theme NEW_THEME` <br> e.g., `theme dark`                                                                  |
| **Clear**           | `clear`                                                                                                    |

[Back To Top](#table-of-contents)
