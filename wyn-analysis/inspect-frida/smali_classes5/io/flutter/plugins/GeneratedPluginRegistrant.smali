.class public final Lio/flutter/plugins/GeneratedPluginRegistrant;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "GeneratedPluginRegistrant"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static registerWith(Llc/b;)V
    .locals 3

    .line 1
    const-string v0, "GeneratedPluginRegistrant"

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p0, Llc/b;->d:LK8/H;

    .line 4
    .line 5
    new-instance v2, Lcom/applovin/applovin_max/AppLovinMAX;

    .line 6
    .line 7
    invoke-direct {v2}, Lcom/applovin/applovin_max/AppLovinMAX;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, v2}, LK8/H;->e(Lqc/b;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catch_0
    move-exception v1

    .line 15
    const-string v2, "Error registering plugin applovin_max, com.applovin.applovin_max.AppLovinMAX"

    .line 16
    .line 17
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 18
    .line 19
    .line 20
    :goto_0
    :try_start_1
    iget-object v1, p0, Llc/b;->d:LK8/H;

    .line 21
    .line 22
    new-instance v2, Ldb/e;

    .line 23
    .line 24
    invoke-direct {v2}, Ldb/e;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v2}, LK8/H;->e(Lqc/b;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 28
    .line 29
    .line 30
    goto :goto_1

    .line 31
    :catch_1
    move-exception v1

    .line 32
    const-string v2, "Error registering plugin audio_session, com.ryanheise.audio_session.AudioSessionPlugin"

    .line 33
    .line 34
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 35
    .line 36
    .line 37
    :goto_1
    :try_start_2
    iget-object v1, p0, Llc/b;->d:LK8/H;

    .line 38
    .line 39
    new-instance v2, LVb/a;

    .line 40
    .line 41
    invoke-direct {v2}, LVb/a;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v2}, LK8/H;->e(Lqc/b;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 45
    .line 46
    .line 47
    goto :goto_2

    .line 48
    :catch_2
    move-exception v1

    .line 49
    const-string v2, "Error registering plugin battery_plus, dev.fluttercommunity.plus.battery.BatteryPlusPlugin"

    .line 50
    .line 51
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 52
    .line 53
    .line 54
    :goto_2
    :try_start_3
    iget-object v1, p0, Llc/b;->d:LK8/H;

    .line 55
    .line 56
    new-instance v2, Lyc/i;

    .line 57
    .line 58
    invoke-direct {v2}, Lyc/i;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v2}, LK8/H;->e(Lqc/b;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 62
    .line 63
    .line 64
    goto :goto_3

    .line 65
    :catch_3
    move-exception v1

    .line 66
    const-string v2, "Error registering plugin camera_android, io.flutter.plugins.camera.CameraPlugin"

    .line 67
    .line 68
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 69
    .line 70
    .line 71
    :goto_3
    :try_start_4
    iget-object v1, p0, Llc/b;->d:LK8/H;

    .line 72
    .line 73
    new-instance v2, LUc/f;

    .line 74
    .line 75
    invoke-direct {v2}, LUc/f;-><init>()V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1, v2}, LK8/H;->e(Lqc/b;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    .line 79
    .line 80
    .line 81
    goto :goto_4

    .line 82
    :catch_4
    move-exception v1

    .line 83
    const-string v2, "Error registering plugin cloud_firestore, io.flutter.plugins.firebase.firestore.FlutterFirebaseFirestorePlugin"

    .line 84
    .line 85
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 86
    .line 87
    .line 88
    :goto_4
    :try_start_5
    iget-object v1, p0, Llc/b;->d:LK8/H;

    .line 89
    .line 90
    new-instance v2, LWb/b;

    .line 91
    .line 92
    invoke-direct {v2}, LWb/b;-><init>()V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1, v2}, LK8/H;->e(Lqc/b;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    .line 96
    .line 97
    .line 98
    goto :goto_5

    .line 99
    :catch_5
    move-exception v1

    .line 100
    const-string v2, "Error registering plugin connectivity_plus, dev.fluttercommunity.plus.connectivity.ConnectivityPlugin"

    .line 101
    .line 102
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 103
    .line 104
    .line 105
    :goto_5
    :try_start_6
    iget-object v1, p0, Llc/b;->d:LK8/H;

    .line 106
    .line 107
    new-instance v2, Ll5/a;

    .line 108
    .line 109
    invoke-direct {v2}, Ll5/a;-><init>()V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1, v2}, LK8/H;->e(Lqc/b;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6

    .line 113
    .line 114
    .line 115
    goto :goto_6

    .line 116
    :catch_6
    move-exception v1

    .line 117
    const-string v2, "Error registering plugin desktop_webview_auth, com.example.desktop_webview_auth.DesktopWebviewAuthPlugin"

    .line 118
    .line 119
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 120
    .line 121
    .line 122
    :goto_6
    :try_start_7
    iget-object v1, p0, Llc/b;->d:LK8/H;

    .line 123
    .line 124
    new-instance v2, LXb/a;

    .line 125
    .line 126
    invoke-direct {v2}, LXb/a;-><init>()V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1, v2}, LK8/H;->e(Lqc/b;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_7

    .line 130
    .line 131
    .line 132
    goto :goto_7

    .line 133
    :catch_7
    move-exception v1

    .line 134
    const-string v2, "Error registering plugin device_info_plus, dev.fluttercommunity.plus.device_info.DeviceInfoPlusPlugin"

    .line 135
    .line 136
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 137
    .line 138
    .line 139
    :goto_7
    :try_start_8
    iget-object v1, p0, Llc/b;->d:LK8/H;

    .line 140
    .line 141
    new-instance v2, Lec/c;

    .line 142
    .line 143
    invoke-direct {v2}, Lec/c;-><init>()V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v1, v2}, LK8/H;->e(Lqc/b;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_8

    .line 147
    .line 148
    .line 149
    goto :goto_8

    .line 150
    :catch_8
    move-exception v1

    .line 151
    const-string v2, "Error registering plugin disable_battery_optimization, in.jvapps.disable_battery_optimization.DisableBatteryOptimizationPlugin"

    .line 152
    .line 153
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 154
    .line 155
    .line 156
    :goto_8
    :try_start_9
    iget-object v1, p0, Llc/b;->d:LK8/H;

    .line 157
    .line 158
    new-instance v2, Lm5/c;

    .line 159
    .line 160
    invoke-direct {v2}, Lm5/c;-><init>()V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v1, v2}, LK8/H;->e(Lqc/b;)V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_9

    .line 164
    .line 165
    .line 166
    goto :goto_9

    .line 167
    :catch_9
    move-exception v1

    .line 168
    const-string v2, "Error registering plugin disk_space_2, com.example.disk_space_2.DiskSpace_2Plugin"

    .line 169
    .line 170
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 171
    .line 172
    .line 173
    :goto_9
    :try_start_a
    iget-object v1, p0, Llc/b;->d:LK8/H;

    .line 174
    .line 175
    new-instance v2, Ls4/b;

    .line 176
    .line 177
    invoke-direct {v2}, Ls4/b;-><init>()V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v1, v2}, LK8/H;->e(Lqc/b;)V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_a

    .line 181
    .line 182
    .line 183
    goto :goto_a

    .line 184
    :catch_a
    move-exception v1

    .line 185
    const-string v2, "Error registering plugin ffmpeg_kit_flutter, com.arthenica.ffmpegkit.flutter.FFmpegKitFlutterPlugin"

    .line 186
    .line 187
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 188
    .line 189
    .line 190
    :goto_a
    :try_start_b
    iget-object v1, p0, Llc/b;->d:LK8/H;

    .line 191
    .line 192
    new-instance v2, LWa/e;

    .line 193
    .line 194
    invoke-direct {v2}, LWa/e;-><init>()V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v1, v2}, LK8/H;->e(Lqc/b;)V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_b

    .line 198
    .line 199
    .line 200
    goto :goto_b

    .line 201
    :catch_b
    move-exception v1

    .line 202
    const-string v2, "Error registering plugin file_picker, com.mr.flutter.plugin.filepicker.FilePickerPlugin"

    .line 203
    .line 204
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 205
    .line 206
    .line 207
    :goto_b
    :try_start_c
    iget-object v1, p0, Llc/b;->d:LK8/H;

    .line 208
    .line 209
    new-instance v2, LNc/e;

    .line 210
    .line 211
    invoke-direct {v2}, LNc/e;-><init>()V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v1, v2}, LK8/H;->e(Lqc/b;)V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_c

    .line 215
    .line 216
    .line 217
    goto :goto_c

    .line 218
    :catch_c
    move-exception v1

    .line 219
    const-string v2, "Error registering plugin firebase_analytics, io.flutter.plugins.firebase.analytics.FlutterFirebaseAnalyticsPlugin"

    .line 220
    .line 221
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 222
    .line 223
    .line 224
    :goto_c
    :try_start_d
    iget-object v1, p0, Llc/b;->d:LK8/H;

    .line 225
    .line 226
    new-instance v2, LOc/b;

    .line 227
    .line 228
    invoke-direct {v2}, LOc/b;-><init>()V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v1, v2}, LK8/H;->e(Lqc/b;)V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_d

    .line 232
    .line 233
    .line 234
    goto :goto_d

    .line 235
    :catch_d
    move-exception v1

    .line 236
    const-string v2, "Error registering plugin firebase_app_check, io.flutter.plugins.firebase.appcheck.FlutterFirebaseAppCheckPlugin"

    .line 237
    .line 238
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 239
    .line 240
    .line 241
    :goto_d
    :try_start_e
    iget-object v1, p0, Llc/b;->d:LK8/H;

    .line 242
    .line 243
    new-instance v2, LPc/d;

    .line 244
    .line 245
    invoke-direct {v2}, LPc/d;-><init>()V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v1, v2}, LK8/H;->e(Lqc/b;)V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_e

    .line 249
    .line 250
    .line 251
    goto :goto_e

    .line 252
    :catch_e
    move-exception v1

    .line 253
    const-string v2, "Error registering plugin firebase_auth, io.flutter.plugins.firebase.auth.FlutterFirebaseAuthPlugin"

    .line 254
    .line 255
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 256
    .line 257
    .line 258
    :goto_e
    :try_start_f
    iget-object v1, p0, Llc/b;->d:LK8/H;

    .line 259
    .line 260
    new-instance v2, LQc/c;

    .line 261
    .line 262
    invoke-direct {v2}, LQc/c;-><init>()V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v1, v2}, LK8/H;->e(Lqc/b;)V
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_f

    .line 266
    .line 267
    .line 268
    goto :goto_f

    .line 269
    :catch_f
    move-exception v1

    .line 270
    const-string v2, "Error registering plugin firebase_core, io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin"

    .line 271
    .line 272
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 273
    .line 274
    .line 275
    :goto_f
    :try_start_10
    iget-object v1, p0, Llc/b;->d:LK8/H;

    .line 276
    .line 277
    new-instance v2, LRc/e;

    .line 278
    .line 279
    invoke-direct {v2}, LRc/e;-><init>()V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v1, v2}, LK8/H;->e(Lqc/b;)V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_10

    .line 283
    .line 284
    .line 285
    goto :goto_10

    .line 286
    :catch_10
    move-exception v1

    .line 287
    const-string v2, "Error registering plugin firebase_crashlytics, io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin"

    .line 288
    .line 289
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 290
    .line 291
    .line 292
    :goto_10
    :try_start_11
    iget-object v1, p0, Llc/b;->d:LK8/H;

    .line 293
    .line 294
    new-instance v2, LSc/b;

    .line 295
    .line 296
    invoke-direct {v2}, LSc/b;-><init>()V

    .line 297
    .line 298
    .line 299
    invoke-virtual {v1, v2}, LK8/H;->e(Lqc/b;)V
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_11

    .line 300
    .line 301
    .line 302
    goto :goto_11

    .line 303
    :catch_11
    move-exception v1

    .line 304
    const-string v2, "Error registering plugin firebase_dynamic_links, io.flutter.plugins.firebase.dynamiclinks.FlutterFirebaseDynamicLinksPlugin"

    .line 305
    .line 306
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 307
    .line 308
    .line 309
    :goto_11
    :try_start_12
    iget-object v1, p0, Llc/b;->d:LK8/H;

    .line 310
    .line 311
    new-instance v2, LXc/a;

    .line 312
    .line 313
    invoke-direct {v2}, LXc/a;-><init>()V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v1, v2}, LK8/H;->e(Lqc/b;)V
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_12

    .line 317
    .line 318
    .line 319
    goto :goto_12

    .line 320
    :catch_12
    move-exception v1

    .line 321
    const-string v2, "Error registering plugin firebase_in_app_messaging, io.flutter.plugins.firebase.inappmessaging.FirebaseInAppMessagingPlugin"

    .line 322
    .line 323
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 324
    .line 325
    .line 326
    :goto_12
    :try_start_13
    iget-object v1, p0, Llc/b;->d:LK8/H;

    .line 327
    .line 328
    new-instance v2, LYc/f;

    .line 329
    .line 330
    invoke-direct {v2}, LYc/f;-><init>()V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v1, v2}, LK8/H;->e(Lqc/b;)V
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_13

    .line 334
    .line 335
    .line 336
    goto :goto_13

    .line 337
    :catch_13
    move-exception v1

    .line 338
    const-string v2, "Error registering plugin firebase_messaging, io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin"

    .line 339
    .line 340
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 341
    .line 342
    .line 343
    :goto_13
    :try_start_14
    iget-object v1, p0, Llc/b;->d:LK8/H;

    .line 344
    .line 345
    new-instance v2, LTc/b;

    .line 346
    .line 347
    invoke-direct {v2}, LTc/b;-><init>()V

    .line 348
    .line 349
    .line 350
    invoke-virtual {v1, v2}, LK8/H;->e(Lqc/b;)V
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_14

    .line 351
    .line 352
    .line 353
    goto :goto_14

    .line 354
    :catch_14
    move-exception v1

    .line 355
    const-string v2, "Error registering plugin firebase_remote_config, io.flutter.plugins.firebase.firebaseremoteconfig.FirebaseRemoteConfigPlugin"

    .line 356
    .line 357
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 358
    .line 359
    .line 360
    :goto_14
    :try_start_15
    iget-object v1, p0, Llc/b;->d:LK8/H;

    .line 361
    .line 362
    new-instance v2, LXa/a;

    .line 363
    .line 364
    invoke-direct {v2}, LXa/a;-><init>()V

    .line 365
    .line 366
    .line 367
    invoke-virtual {v1, v2}, LK8/H;->e(Lqc/b;)V
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_15

    .line 368
    .line 369
    .line 370
    goto :goto_15

    .line 371
    :catch_15
    move-exception v1

    .line 372
    const-string v2, "Error registering plugin flutter_foreground_task, com.pravera.flutter_foreground_task.FlutterForegroundTaskPlugin"

    .line 373
    .line 374
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 375
    .line 376
    .line 377
    :goto_15
    :try_start_16
    iget-object v1, p0, Llc/b;->d:LK8/H;

    .line 378
    .line 379
    new-instance v2, Lcom/dexterous/flutterlocalnotifications/FlutterLocalNotificationsPlugin;

    .line 380
    .line 381
    invoke-direct {v2}, Lcom/dexterous/flutterlocalnotifications/FlutterLocalNotificationsPlugin;-><init>()V

    .line 382
    .line 383
    .line 384
    invoke-virtual {v1, v2}, LK8/H;->e(Lqc/b;)V
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_16

    .line 385
    .line 386
    .line 387
    goto :goto_16

    .line 388
    :catch_16
    move-exception v1

    .line 389
    const-string v2, "Error registering plugin flutter_local_notifications, com.dexterous.flutterlocalnotifications.FlutterLocalNotificationsPlugin"

    .line 390
    .line 391
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 392
    .line 393
    .line 394
    :goto_16
    :try_start_17
    iget-object v1, p0, Llc/b;->d:LK8/H;

    .line 395
    .line 396
    new-instance v2, Lag/a;

    .line 397
    .line 398
    invoke-direct {v2}, Lag/a;-><init>()V

    .line 399
    .line 400
    .line 401
    invoke-virtual {v1, v2}, LK8/H;->e(Lqc/b;)V
    :try_end_17
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_17} :catch_17

    .line 402
    .line 403
    .line 404
    goto :goto_17

    .line 405
    :catch_17
    move-exception v1

    .line 406
    const-string v2, "Error registering plugin flutter_native_splash, net.jonhanson.flutter_native_splash.FlutterNativeSplashPlugin"

    .line 407
    .line 408
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 409
    .line 410
    .line 411
    :goto_17
    :try_start_18
    iget-object v1, p0, Llc/b;->d:LK8/H;

    .line 412
    .line 413
    new-instance v2, Lcc/a;

    .line 414
    .line 415
    invoke-direct {v2}, Lcc/a;-><init>()V

    .line 416
    .line 417
    .line 418
    invoke-virtual {v1, v2}, LK8/H;->e(Lqc/b;)V
    :try_end_18
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_18} :catch_18

    .line 419
    .line 420
    .line 421
    goto :goto_18

    .line 422
    :catch_18
    move-exception v1

    .line 423
    const-string v2, "Error registering plugin flutter_overlay_window, flutter.overlay.window.flutter_overlay_window.FlutterOverlayWindowPlugin"

    .line 424
    .line 425
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 426
    .line 427
    .line 428
    :goto_18
    :try_start_19
    iget-object v1, p0, Llc/b;->d:LK8/H;

    .line 429
    .line 430
    new-instance v2, LZc/a;

    .line 431
    .line 432
    invoke-direct {v2}, LZc/a;-><init>()V

    .line 433
    .line 434
    .line 435
    invoke-virtual {v1, v2}, LK8/H;->e(Lqc/b;)V
    :try_end_19
    .catch Ljava/lang/Exception; {:try_start_19 .. :try_end_19} :catch_19

    .line 436
    .line 437
    .line 438
    goto :goto_19

    .line 439
    :catch_19
    move-exception v1

    .line 440
    const-string v2, "Error registering plugin flutter_plugin_android_lifecycle, io.flutter.plugins.flutter_plugin_android_lifecycle.FlutterAndroidLifecyclePlugin"

    .line 441
    .line 442
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 443
    .line 444
    .line 445
    :goto_19
    :try_start_1a
    iget-object v1, p0, Llc/b;->d:LK8/H;

    .line 446
    .line 447
    new-instance v2, Llb/f;

    .line 448
    .line 449
    invoke-direct {v2}, Llb/f;-><init>()V

    .line 450
    .line 451
    .line 452
    invoke-virtual {v1, v2}, LK8/H;->e(Lqc/b;)V
    :try_end_1a
    .catch Ljava/lang/Exception; {:try_start_1a .. :try_end_1a} :catch_1a

    .line 453
    .line 454
    .line 455
    goto :goto_1a

    .line 456
    :catch_1a
    move-exception v1

    .line 457
    const-string v2, "Error registering plugin flutter_tts, com.tundralabs.fluttertts.FlutterTtsPlugin"

    .line 458
    .line 459
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 460
    .line 461
    .line 462
    :goto_1a
    :try_start_1b
    iget-object v1, p0, Llc/b;->d:LK8/H;

    .line 463
    .line 464
    new-instance v2, LUb/a;

    .line 465
    .line 466
    invoke-direct {v2}, LUb/a;-><init>()V

    .line 467
    .line 468
    .line 469
    invoke-virtual {v1, v2}, LK8/H;->e(Lqc/b;)V
    :try_end_1b
    .catch Ljava/lang/Exception; {:try_start_1b .. :try_end_1b} :catch_1b

    .line 470
    .line 471
    .line 472
    goto :goto_1b

    .line 473
    :catch_1b
    move-exception v1

    .line 474
    const-string v2, "Error registering plugin flutter_udid, de.gigadroid.flutter_udid.FlutterUdidPlugin"

    .line 475
    .line 476
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 477
    .line 478
    .line 479
    :goto_1b
    :try_start_1c
    iget-object v1, p0, Llc/b;->d:LK8/H;

    .line 480
    .line 481
    new-instance v2, LCg/c;

    .line 482
    .line 483
    invoke-direct {v2}, LCg/c;-><init>()V

    .line 484
    .line 485
    .line 486
    invoke-virtual {v1, v2}, LK8/H;->e(Lqc/b;)V
    :try_end_1c
    .catch Ljava/lang/Exception; {:try_start_1c .. :try_end_1c} :catch_1c

    .line 487
    .line 488
    .line 489
    goto :goto_1c

    .line 490
    :catch_1c
    move-exception v1

    .line 491
    const-string v2, "Error registering plugin gal, studio.midoridesign.gal.GalPlugin"

    .line 492
    .line 493
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 494
    .line 495
    .line 496
    :goto_1c
    :try_start_1d
    iget-object v1, p0, Llc/b;->d:LK8/H;

    .line 497
    .line 498
    new-instance v2, Lv4/b;

    .line 499
    .line 500
    invoke-direct {v2}, Lv4/b;-><init>()V

    .line 501
    .line 502
    .line 503
    invoke-virtual {v1, v2}, LK8/H;->e(Lqc/b;)V
    :try_end_1d
    .catch Ljava/lang/Exception; {:try_start_1d .. :try_end_1d} :catch_1d

    .line 504
    .line 505
    .line 506
    goto :goto_1d

    .line 507
    :catch_1d
    move-exception v1

    .line 508
    const-string v2, "Error registering plugin geolocator_android, com.baseflow.geolocator.GeolocatorPlugin"

    .line 509
    .line 510
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 511
    .line 512
    .line 513
    :goto_1d
    :try_start_1e
    iget-object v1, p0, Llc/b;->d:LK8/H;

    .line 514
    .line 515
    new-instance v2, LJa/a;

    .line 516
    .line 517
    invoke-direct {v2}, LJa/a;-><init>()V

    .line 518
    .line 519
    .line 520
    invoke-virtual {v1, v2}, LK8/H;->e(Lqc/b;)V
    :try_end_1e
    .catch Ljava/lang/Exception; {:try_start_1e .. :try_end_1e} :catch_1e

    .line 521
    .line 522
    .line 523
    goto :goto_1e

    .line 524
    :catch_1e
    move-exception v1

    .line 525
    const-string v2, "Error registering plugin google_mlkit_commons, com.google_mlkit_commons.GoogleMlKitCommonsPlugin"

    .line 526
    .line 527
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 528
    .line 529
    .line 530
    :goto_1e
    :try_start_1f
    iget-object v1, p0, Llc/b;->d:LK8/H;

    .line 531
    .line 532
    new-instance v2, LKa/a;

    .line 533
    .line 534
    invoke-direct {v2}, LKa/a;-><init>()V

    .line 535
    .line 536
    .line 537
    invoke-virtual {v1, v2}, LK8/H;->e(Lqc/b;)V
    :try_end_1f
    .catch Ljava/lang/Exception; {:try_start_1f .. :try_end_1f} :catch_1f

    .line 538
    .line 539
    .line 540
    goto :goto_1f

    .line 541
    :catch_1f
    move-exception v1

    .line 542
    const-string v2, "Error registering plugin google_mlkit_text_recognition, com.google_mlkit_text_recognition.GoogleMlKitTextRecognitionPlugin"

    .line 543
    .line 544
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 545
    .line 546
    .line 547
    :goto_1f
    :try_start_20
    iget-object v1, p0, Llc/b;->d:LK8/H;

    .line 548
    .line 549
    new-instance v2, Lad/X;

    .line 550
    .line 551
    invoke-direct {v2}, Lad/X;-><init>()V

    .line 552
    .line 553
    .line 554
    invoke-virtual {v1, v2}, LK8/H;->e(Lqc/b;)V
    :try_end_20
    .catch Ljava/lang/Exception; {:try_start_20 .. :try_end_20} :catch_20

    .line 555
    .line 556
    .line 557
    goto :goto_20

    .line 558
    :catch_20
    move-exception v1

    .line 559
    const-string v2, "Error registering plugin google_mobile_ads, io.flutter.plugins.googlemobileads.GoogleMobileAdsPlugin"

    .line 560
    .line 561
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 562
    .line 563
    .line 564
    :goto_20
    :try_start_21
    iget-object v1, p0, Llc/b;->d:LK8/H;

    .line 565
    .line 566
    new-instance v2, Ldd/f;

    .line 567
    .line 568
    invoke-direct {v2}, Ldd/f;-><init>()V

    .line 569
    .line 570
    .line 571
    invoke-virtual {v1, v2}, LK8/H;->e(Lqc/b;)V
    :try_end_21
    .catch Ljava/lang/Exception; {:try_start_21 .. :try_end_21} :catch_21

    .line 572
    .line 573
    .line 574
    goto :goto_21

    .line 575
    :catch_21
    move-exception v1

    .line 576
    const-string v2, "Error registering plugin google_sign_in_android, io.flutter.plugins.googlesignin.GoogleSignInPlugin"

    .line 577
    .line 578
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 579
    .line 580
    .line 581
    :goto_21
    :try_start_22
    iget-object v1, p0, Llc/b;->d:LK8/H;

    .line 582
    .line 583
    new-instance v2, Leb/f;

    .line 584
    .line 585
    invoke-direct {v2}, Leb/f;-><init>()V

    .line 586
    .line 587
    .line 588
    invoke-virtual {v1, v2}, LK8/H;->e(Lqc/b;)V
    :try_end_22
    .catch Ljava/lang/Exception; {:try_start_22 .. :try_end_22} :catch_22

    .line 589
    .line 590
    .line 591
    goto :goto_22

    .line 592
    :catch_22
    move-exception v1

    .line 593
    const-string v2, "Error registering plugin just_audio, com.ryanheise.just_audio.JustAudioPlugin"

    .line 594
    .line 595
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 596
    .line 597
    .line 598
    :goto_22
    :try_start_23
    iget-object v1, p0, Llc/b;->d:LK8/H;

    .line 599
    .line 600
    new-instance v2, Lbc/a;

    .line 601
    .line 602
    invoke-direct {v2}, Lbc/a;-><init>()V

    .line 603
    .line 604
    .line 605
    invoke-virtual {v1, v2}, LK8/H;->e(Lqc/b;)V
    :try_end_23
    .catch Ljava/lang/Exception; {:try_start_23 .. :try_end_23} :catch_23

    .line 606
    .line 607
    .line 608
    goto :goto_23

    .line 609
    :catch_23
    move-exception v1

    .line 610
    const-string v2, "Error registering plugin motion_sensors, finaldev.motion_sensors.MotionSensorsPlugin"

    .line 611
    .line 612
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 613
    .line 614
    .line 615
    :goto_23
    :try_start_24
    iget-object v1, p0, Llc/b;->d:LK8/H;

    .line 616
    .line 617
    new-instance v2, Le5/a;

    .line 618
    .line 619
    invoke-direct {v2}, Le5/a;-><init>()V

    .line 620
    .line 621
    .line 622
    invoke-virtual {v1, v2}, LK8/H;->e(Lqc/b;)V
    :try_end_24
    .catch Ljava/lang/Exception; {:try_start_24 .. :try_end_24} :catch_24

    .line 623
    .line 624
    .line 625
    goto :goto_24

    .line 626
    :catch_24
    move-exception v1

    .line 627
    const-string v2, "Error registering plugin native_exif, com.cloudacy.native_exif.NativeExifPlugin"

    .line 628
    .line 629
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 630
    .line 631
    .line 632
    :goto_24
    :try_start_25
    iget-object v1, p0, Llc/b;->d:LK8/H;

    .line 633
    .line 634
    new-instance v2, LYb/a;

    .line 635
    .line 636
    invoke-direct {v2}, LYb/a;-><init>()V

    .line 637
    .line 638
    .line 639
    invoke-virtual {v1, v2}, LK8/H;->e(Lqc/b;)V
    :try_end_25
    .catch Ljava/lang/Exception; {:try_start_25 .. :try_end_25} :catch_25

    .line 640
    .line 641
    .line 642
    goto :goto_25

    .line 643
    :catch_25
    move-exception v1

    .line 644
    const-string v2, "Error registering plugin network_info_plus, dev.fluttercommunity.plus.network_info.NetworkInfoPlusPlugin"

    .line 645
    .line 646
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 647
    .line 648
    .line 649
    :goto_25
    :try_start_26
    iget-object v1, p0, Llc/b;->d:LK8/H;

    .line 650
    .line 651
    new-instance v2, LZb/a;

    .line 652
    .line 653
    invoke-direct {v2}, LZb/a;-><init>()V

    .line 654
    .line 655
    .line 656
    invoke-virtual {v1, v2}, LK8/H;->e(Lqc/b;)V
    :try_end_26
    .catch Ljava/lang/Exception; {:try_start_26 .. :try_end_26} :catch_26

    .line 657
    .line 658
    .line 659
    goto :goto_26

    .line 660
    :catch_26
    move-exception v1

    .line 661
    const-string v2, "Error registering plugin package_info_plus, dev.fluttercommunity.plus.packageinfo.PackageInfoPlugin"

    .line 662
    .line 663
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 664
    .line 665
    .line 666
    :goto_26
    :try_start_27
    iget-object v1, p0, Llc/b;->d:LK8/H;

    .line 667
    .line 668
    new-instance v2, Led/d;

    .line 669
    .line 670
    invoke-direct {v2}, Led/d;-><init>()V

    .line 671
    .line 672
    .line 673
    invoke-virtual {v1, v2}, LK8/H;->e(Lqc/b;)V
    :try_end_27
    .catch Ljava/lang/Exception; {:try_start_27 .. :try_end_27} :catch_27

    .line 674
    .line 675
    .line 676
    goto :goto_27

    .line 677
    :catch_27
    move-exception v1

    .line 678
    const-string v2, "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin"

    .line 679
    .line 680
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 681
    .line 682
    .line 683
    :goto_27
    :try_start_28
    iget-object v1, p0, Llc/b;->d:LK8/H;

    .line 684
    .line 685
    new-instance v2, Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/QonversionPlugin;

    .line 686
    .line 687
    invoke-direct {v2}, Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/QonversionPlugin;-><init>()V

    .line 688
    .line 689
    .line 690
    invoke-virtual {v1, v2}, LK8/H;->e(Lqc/b;)V
    :try_end_28
    .catch Ljava/lang/Exception; {:try_start_28 .. :try_end_28} :catch_28

    .line 691
    .line 692
    .line 693
    goto :goto_28

    .line 694
    :catch_28
    move-exception v1

    .line 695
    const-string v2, "Error registering plugin qonversion_flutter, com.qonversion.flutter.sdk.qonversion_flutter_sdk.QonversionPlugin"

    .line 696
    .line 697
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 698
    .line 699
    .line 700
    :goto_28
    :try_start_29
    iget-object v1, p0, Llc/b;->d:LK8/H;

    .line 701
    .line 702
    new-instance v2, LOb/a;

    .line 703
    .line 704
    invoke-direct {v2}, LOb/a;-><init>()V

    .line 705
    .line 706
    .line 707
    invoke-virtual {v1, v2}, LK8/H;->e(Lqc/b;)V
    :try_end_29
    .catch Ljava/lang/Exception; {:try_start_29 .. :try_end_29} :catch_29

    .line 708
    .line 709
    .line 710
    goto :goto_29

    .line 711
    :catch_29
    move-exception v1

    .line 712
    const-string v2, "Error registering plugin safe_device, com.xamdesign.safe_device.SafeDevicePlugin"

    .line 713
    .line 714
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 715
    .line 716
    .line 717
    :goto_29
    :try_start_2a
    iget-object v1, p0, Llc/b;->d:LK8/H;

    .line 718
    .line 719
    new-instance v2, Lfd/H;

    .line 720
    .line 721
    invoke-direct {v2}, Lfd/H;-><init>()V

    .line 722
    .line 723
    .line 724
    invoke-virtual {v1, v2}, LK8/H;->e(Lqc/b;)V
    :try_end_2a
    .catch Ljava/lang/Exception; {:try_start_2a .. :try_end_2a} :catch_2a

    .line 725
    .line 726
    .line 727
    goto :goto_2a

    .line 728
    :catch_2a
    move-exception v1

    .line 729
    const-string v2, "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin"

    .line 730
    .line 731
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 732
    .line 733
    .line 734
    :goto_2a
    :try_start_2b
    iget-object v1, p0, Llc/b;->d:LK8/H;

    .line 735
    .line 736
    new-instance v2, Lf5/h;

    .line 737
    .line 738
    invoke-direct {v2}, Lf5/h;-><init>()V

    .line 739
    .line 740
    .line 741
    invoke-virtual {v1, v2}, LK8/H;->e(Lqc/b;)V
    :try_end_2b
    .catch Ljava/lang/Exception; {:try_start_2b .. :try_end_2b} :catch_2b

    .line 742
    .line 743
    .line 744
    goto :goto_2b

    .line 745
    :catch_2b
    move-exception v1

    .line 746
    const-string v2, "Error registering plugin speech_to_text, com.csdcorp.speech_to_text.SpeechToTextPlugin"

    .line 747
    .line 748
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 749
    .line 750
    .line 751
    :goto_2b
    :try_start_2c
    iget-object v1, p0, Llc/b;->d:LK8/H;

    .line 752
    .line 753
    new-instance v2, Ljb/l;

    .line 754
    .line 755
    invoke-direct {v2}, Ljb/l;-><init>()V

    .line 756
    .line 757
    .line 758
    invoke-virtual {v1, v2}, LK8/H;->e(Lqc/b;)V
    :try_end_2c
    .catch Ljava/lang/Exception; {:try_start_2c .. :try_end_2c} :catch_2c

    .line 759
    .line 760
    .line 761
    goto :goto_2c

    .line 762
    :catch_2c
    move-exception v1

    .line 763
    const-string v2, "Error registering plugin sqflite_android, com.tekartik.sqflite.SqflitePlugin"

    .line 764
    .line 765
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 766
    .line 767
    .line 768
    :goto_2c
    :try_start_2d
    iget-object v1, p0, Llc/b;->d:LK8/H;

    .line 769
    .line 770
    new-instance v2, Lg5/e;

    .line 771
    .line 772
    invoke-direct {v2}, Lg5/e;-><init>()V

    .line 773
    .line 774
    .line 775
    invoke-virtual {v1, v2}, LK8/H;->e(Lqc/b;)V
    :try_end_2d
    .catch Ljava/lang/Exception; {:try_start_2d .. :try_end_2d} :catch_2d

    .line 776
    .line 777
    .line 778
    goto :goto_2d

    .line 779
    :catch_2d
    move-exception v1

    .line 780
    const-string v2, "Error registering plugin sqflite_sqlcipher, com.davidmartos96.sqflite_sqlcipher.SqfliteSqlCipherPlugin"

    .line 781
    .line 782
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 783
    .line 784
    .line 785
    :goto_2d
    :try_start_2e
    iget-object v1, p0, Llc/b;->d:LK8/H;

    .line 786
    .line 787
    new-instance v2, Lgd/f;

    .line 788
    .line 789
    invoke-direct {v2}, Lgd/f;-><init>()V

    .line 790
    .line 791
    .line 792
    invoke-virtual {v1, v2}, LK8/H;->e(Lqc/b;)V
    :try_end_2e
    .catch Ljava/lang/Exception; {:try_start_2e .. :try_end_2e} :catch_2e

    .line 793
    .line 794
    .line 795
    goto :goto_2e

    .line 796
    :catch_2e
    move-exception v1

    .line 797
    const-string v2, "Error registering plugin url_launcher_android, io.flutter.plugins.urllauncher.UrlLauncherPlugin"

    .line 798
    .line 799
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 800
    .line 801
    .line 802
    :goto_2e
    :try_start_2f
    iget-object v1, p0, Llc/b;->d:LK8/H;

    .line 803
    .line 804
    new-instance v2, Lhd/q;

    .line 805
    .line 806
    invoke-direct {v2}, Lhd/q;-><init>()V

    .line 807
    .line 808
    .line 809
    invoke-virtual {v1, v2}, LK8/H;->e(Lqc/b;)V
    :try_end_2f
    .catch Ljava/lang/Exception; {:try_start_2f .. :try_end_2f} :catch_2f

    .line 810
    .line 811
    .line 812
    goto :goto_2f

    .line 813
    :catch_2f
    move-exception v1

    .line 814
    const-string v2, "Error registering plugin video_player_android, io.flutter.plugins.videoplayer.VideoPlayerPlugin"

    .line 815
    .line 816
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 817
    .line 818
    .line 819
    :goto_2f
    :try_start_30
    iget-object v1, p0, Llc/b;->d:LK8/H;

    .line 820
    .line 821
    new-instance v2, Lac/b;

    .line 822
    .line 823
    invoke-direct {v2}, Lac/b;-><init>()V

    .line 824
    .line 825
    .line 826
    invoke-virtual {v1, v2}, LK8/H;->e(Lqc/b;)V
    :try_end_30
    .catch Ljava/lang/Exception; {:try_start_30 .. :try_end_30} :catch_30

    .line 827
    .line 828
    .line 829
    goto :goto_30

    .line 830
    :catch_30
    move-exception v1

    .line 831
    const-string v2, "Error registering plugin wakelock_plus, dev.fluttercommunity.plus.wakelock.WakelockPlusPlugin"

    .line 832
    .line 833
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 834
    .line 835
    .line 836
    :goto_30
    :try_start_31
    iget-object p0, p0, Llc/b;->d:LK8/H;

    .line 837
    .line 838
    new-instance v1, Lkd/X;

    .line 839
    .line 840
    invoke-direct {v1}, Lkd/X;-><init>()V

    .line 841
    .line 842
    .line 843
    invoke-virtual {p0, v1}, LK8/H;->e(Lqc/b;)V
    :try_end_31
    .catch Ljava/lang/Exception; {:try_start_31 .. :try_end_31} :catch_31

    .line 844
    .line 845
    .line 846
    goto :goto_31

    .line 847
    :catch_31
    move-exception p0

    .line 848
    const-string v1, "Error registering plugin webview_flutter_android, io.flutter.plugins.webviewflutter.WebViewFlutterPlugin"

    .line 849
    .line 850
    invoke-static {v0, v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 851
    .line 852
    .line 853
    :goto_31
    return-void
.end method
