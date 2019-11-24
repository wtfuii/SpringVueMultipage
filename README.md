## SpringVueMultipage Boilerplate

This is a highly opinionated Spring template that utilizes the following
stack:

* Spring Boot 2.2
* Gradle 5.6
* Kotlin 1.3
* Vue-CLI 4.0
* Vue 2.6
* Pebble Template Engine

Most of the modern JavaScript boilerplates support only single page
applications.
The main motivation behind this template was to show that a modern WebApp not always
has to be a single page application. Use plain old HTML templates if they fit
and use the whole Webpack toolchain if you need it. It can still make sense to render
forms on the backend as data validation only needs to be performed once instead of 
both in the backend and in the frontend.

To add a new JavaScript file as webpack entry, just add it to the `frontend/src/entries`
folder. Then include it in your Pebble template of choice using the following tags:
```
{% import 'macros/macros' %}
{% block js %}{{ webpack_js("second") }}{% endblock %}
{% block css %}{{ webpack_css("second") }} {% endblock %}
```
I chose Pebble as template engine because it supports inheritance and uses almost
the same syntax as Jinja2 in the Python world.

To build a runnable JAR file that includes all the frontend assets, just run
`bootJar` with Gradle.
During development, run `bootRun` and `npm run watch` in parallel.
If you know how to run Webpack as well with `bootRun`, please open an issue.