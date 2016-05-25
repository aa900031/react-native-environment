//
//  RNEnvironment.m
//  RNEnvironment
//
//  Created by zhong666 on 2016/5/25.
//  Copyright © 2016年 github. All rights reserved.
//

#import "RNEnvironment.h"
#import "RCTConvert.h"

@implementation RNEnvironment

RCT_EXPORT_MODULE();

- (NSDictionary *)constantsToExport
{
    NSDictionary *envFile = [NSDictionary dictionaryWithContentsOfFile:[[NSBundle mainBundle] pathForResource:@"env" ofType:@"plist"]];
    return envFile;
}

@end
