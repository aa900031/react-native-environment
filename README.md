# react-native-environment

[![npm version](https://badge.fury.io/js/react-native-environment.svg)](https://badge.fury.io/js/react-native-environment)

The react native module, will read native project .properties or .plist

## Installation

First install this package
```shell
npm install --save react-native-environment
```
and link that by `rnpm`
```shell
rnpm link react-native-environment
```

PS. I don't want to say manually install guid, please use rnpm, it's really goods to use

## Use (iOS)
1. Will create plist with info.plist same level, by name: **env.plist**
2. Input your key value datas

## Use (Android)
1. Will create properties in assets folder, by name: **env.properties**
2. Input your key value datas

## Use (JS)
#### import module:
```javascript
var Env = require('react-native-environment');
```
or
```javascript
import Env from 'react-native-environment'
```

#### call object key
```javascript
console.log(Env.uid);
```

## Release Notes
* 0.0.1 init version
