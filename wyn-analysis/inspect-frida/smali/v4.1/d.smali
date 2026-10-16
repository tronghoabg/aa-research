.class public final Lv4/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luc/i;


# instance fields
.field public final a:Ly4/a;

.field public b:Luc/j;

.field public c:Landroid/content/Context;

.field public d:Landroid/app/Activity;

.field public e:Lcom/baseflow/geolocator/GeolocatorLocationService;

.field public final f:Lx4/c;

.field public g:Lx4/e;


# direct methods
.method public constructor <init>(Ly4/a;Lx4/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv4/d;->a:Ly4/a;

    .line 5
    .line 6
    iput-object p2, p0, Lv4/d;->f:Lx4/c;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 3

    .line 1
    const-string v0, "FlutterGeolocator"

    .line 2
    .line 3
    const-string v1, "Geolocator position updates stopped"

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lv4/d;->e:Lcom/baseflow/geolocator/GeolocatorLocationService;

    .line 9
    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    iget p1, v1, Lcom/baseflow/geolocator/GeolocatorLocationService;->d:I

    .line 16
    .line 17
    if-ne p1, v2, :cond_2

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget p1, v1, Lcom/baseflow/geolocator/GeolocatorLocationService;->c:I

    .line 21
    .line 22
    if-nez p1, :cond_2

    .line 23
    .line 24
    :goto_0
    iget p1, v1, Lcom/baseflow/geolocator/GeolocatorLocationService;->d:I

    .line 25
    .line 26
    sub-int/2addr p1, v2

    .line 27
    iput p1, v1, Lcom/baseflow/geolocator/GeolocatorLocationService;->d:I

    .line 28
    .line 29
    const-string p1, "Stopping location service."

    .line 30
    .line 31
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    iget-object p1, v1, Lcom/baseflow/geolocator/GeolocatorLocationService;->g:Lx4/e;

    .line 35
    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    iget-object v0, v1, Lcom/baseflow/geolocator/GeolocatorLocationService;->f:Lx4/c;

    .line 39
    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    iget-object v0, v0, Lx4/c;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 43
    .line 44
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    invoke-interface {p1}, Lx4/e;->e()V

    .line 48
    .line 49
    .line 50
    :cond_1
    iget-object p1, p0, Lv4/d;->e:Lcom/baseflow/geolocator/GeolocatorLocationService;

    .line 51
    .line 52
    invoke-virtual {p1}, Lcom/baseflow/geolocator/GeolocatorLocationService;->a()V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    const-string p1, "There is still another flutter engine connected, not stopping location service"

    .line 57
    .line 58
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    :goto_1
    iget-object p1, p0, Lv4/d;->g:Lx4/e;

    .line 62
    .line 63
    if-eqz p1, :cond_3

    .line 64
    .line 65
    iget-object v0, p0, Lv4/d;->f:Lx4/c;

    .line 66
    .line 67
    if-eqz v0, :cond_3

    .line 68
    .line 69
    iget-object v0, v0, Lx4/c;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 70
    .line 71
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    invoke-interface {p1}, Lx4/e;->e()V

    .line 75
    .line 76
    .line 77
    const/4 p1, 0x0

    .line 78
    iput-object p1, p0, Lv4/d;->g:Lx4/e;

    .line 79
    .line 80
    :cond_3
    return-void
.end method

.method public final b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lv4/d;->b:Luc/j;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "FlutterGeolocator"

    .line 6
    .line 7
    const-string v1, "Tried to stop listening when no MethodChannel had been initialized."

    .line 8
    .line 9
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    invoke-virtual {p0, v0}, Lv4/d;->a(Z)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lv4/d;->b:Luc/j;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-virtual {v0, v1}, Luc/j;->a(Luc/i;)V

    .line 21
    .line 22
    .line 23
    iput-object v1, p0, Lv4/d;->b:Luc/j;

    .line 24
    .line 25
    return-void
.end method

.method public final onCancel(Ljava/lang/Object;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    invoke-virtual {p0, p1}, Lv4/d;->a(Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final onListen(Ljava/lang/Object;Luc/g;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const/4 v2, 0x0

    .line 5
    :try_start_0
    iget-object v3, v0, Lv4/d;->a:Ly4/a;

    .line 6
    .line 7
    iget-object v4, v0, Lv4/d;->c:Landroid/content/Context;

    .line 8
    .line 9
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {v4}, Ly4/a;->a(Landroid/content/Context;)I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    const/4 v4, 0x3

    .line 17
    const/4 v5, 0x1

    .line 18
    const/4 v6, 0x0

    .line 19
    if-eq v3, v4, :cond_1

    .line 20
    .line 21
    if-ne v3, v1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v3, v6

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    :goto_0
    move v3, v5

    .line 27
    :goto_1
    if-nez v3, :cond_2

    .line 28
    .line 29
    const/4 v3, 0x5

    .line 30
    invoke-static {v3}, Lpd/f;->h(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-static {v3}, Lpd/f;->g(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    move-object/from16 v5, p2

    .line 39
    .line 40
    check-cast v5, Luc/h;

    .line 41
    .line 42
    invoke-virtual {v5, v4, v3, v2}, Luc/h;->c(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)V
    :try_end_0
    .catch Lw4/b; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_2
    iget-object v1, v0, Lv4/d;->e:Lcom/baseflow/geolocator/GeolocatorLocationService;

    .line 47
    .line 48
    const-string v3, "FlutterGeolocator"

    .line 49
    .line 50
    if-nez v1, :cond_3

    .line 51
    .line 52
    const-string v1, "Location background service has not started correctly"

    .line 53
    .line 54
    invoke-static {v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_3
    move-object/from16 v1, p1

    .line 59
    .line 60
    check-cast v1, Ljava/util/Map;

    .line 61
    .line 62
    if-eqz v1, :cond_4

    .line 63
    .line 64
    const-string v4, "forceLocationManager"

    .line 65
    .line 66
    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    if-eqz v7, :cond_4

    .line 71
    .line 72
    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    check-cast v4, Ljava/lang/Boolean;

    .line 77
    .line 78
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    :cond_4
    invoke-static {v1}, Lx4/h;->a(Ljava/util/Map;)Lx4/h;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    if-eqz v1, :cond_8

    .line 87
    .line 88
    const-string v7, "foregroundNotificationConfig"

    .line 89
    .line 90
    invoke-interface {v1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    check-cast v1, Ljava/util/Map;

    .line 95
    .line 96
    if-nez v1, :cond_5

    .line 97
    .line 98
    goto/16 :goto_3

    .line 99
    .line 100
    :cond_5
    const-string v7, "notificationIcon"

    .line 101
    .line 102
    invoke-interface {v1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v7

    .line 106
    check-cast v7, Ljava/util/Map;

    .line 107
    .line 108
    if-nez v7, :cond_6

    .line 109
    .line 110
    move-object v15, v2

    .line 111
    goto :goto_2

    .line 112
    :cond_6
    const-string v8, "name"

    .line 113
    .line 114
    invoke-interface {v7, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v8

    .line 118
    check-cast v8, Ljava/lang/String;

    .line 119
    .line 120
    const-string v9, "defType"

    .line 121
    .line 122
    invoke-interface {v7, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v7

    .line 126
    check-cast v7, Ljava/lang/String;

    .line 127
    .line 128
    new-instance v9, LY1/t;

    .line 129
    .line 130
    const/4 v10, 0x3

    .line 131
    invoke-direct {v9, v10, v8, v7}, LY1/t;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    move-object v15, v9

    .line 135
    :goto_2
    const-string v7, "notificationTitle"

    .line 136
    .line 137
    invoke-interface {v1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v7

    .line 141
    move-object v12, v7

    .line 142
    check-cast v12, Ljava/lang/String;

    .line 143
    .line 144
    const-string v7, "notificationChannelName"

    .line 145
    .line 146
    invoke-interface {v1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v7

    .line 150
    move-object v14, v7

    .line 151
    check-cast v14, Ljava/lang/String;

    .line 152
    .line 153
    const-string v7, "notificationText"

    .line 154
    .line 155
    invoke-interface {v1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v7

    .line 159
    move-object v13, v7

    .line 160
    check-cast v13, Ljava/lang/String;

    .line 161
    .line 162
    const-string v7, "enableWifiLock"

    .line 163
    .line 164
    invoke-interface {v1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v7

    .line 168
    check-cast v7, Ljava/lang/Boolean;

    .line 169
    .line 170
    const-string v8, "enableWakeLock"

    .line 171
    .line 172
    invoke-interface {v1, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v8

    .line 176
    check-cast v8, Ljava/lang/Boolean;

    .line 177
    .line 178
    const-string v9, "setOngoing"

    .line 179
    .line 180
    invoke-interface {v1, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v9

    .line 184
    check-cast v9, Ljava/lang/Boolean;

    .line 185
    .line 186
    const-string v10, "color"

    .line 187
    .line 188
    invoke-interface {v1, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    if-eqz v1, :cond_7

    .line 193
    .line 194
    check-cast v1, Ljava/lang/Number;

    .line 195
    .line 196
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 197
    .line 198
    .line 199
    move-result v1

    .line 200
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    :cond_7
    move-object/from16 v19, v2

    .line 205
    .line 206
    new-instance v11, Lu0/a0;

    .line 207
    .line 208
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 209
    .line 210
    .line 211
    move-result v16

    .line 212
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 213
    .line 214
    .line 215
    move-result v17

    .line 216
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 217
    .line 218
    .line 219
    move-result v18

    .line 220
    invoke-direct/range {v11 .. v19}, Lu0/a0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LY1/t;ZZZLjava/lang/Integer;)V

    .line 221
    .line 222
    .line 223
    move-object v2, v11

    .line 224
    :cond_8
    :goto_3
    if-eqz v2, :cond_d

    .line 225
    .line 226
    const-string v1, "Geolocator position updates started using Android foreground service"

    .line 227
    .line 228
    invoke-static {v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 229
    .line 230
    .line 231
    iget-object v1, v0, Lv4/d;->e:Lcom/baseflow/geolocator/GeolocatorLocationService;

    .line 232
    .line 233
    iget v7, v1, Lcom/baseflow/geolocator/GeolocatorLocationService;->d:I

    .line 234
    .line 235
    add-int/2addr v7, v5

    .line 236
    iput v7, v1, Lcom/baseflow/geolocator/GeolocatorLocationService;->d:I

    .line 237
    .line 238
    iget-object v7, v1, Lcom/baseflow/geolocator/GeolocatorLocationService;->f:Lx4/c;

    .line 239
    .line 240
    if-eqz v7, :cond_9

    .line 241
    .line 242
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 243
    .line 244
    .line 245
    move-result-object v7

    .line 246
    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 247
    .line 248
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 249
    .line 250
    .line 251
    move-result-object v6

    .line 252
    invoke-virtual {v8, v6}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    move-result v6

    .line 256
    invoke-static {v7, v6, v4}, Lx4/c;->a(Landroid/content/Context;ZLx4/h;)Lx4/e;

    .line 257
    .line 258
    .line 259
    move-result-object v4

    .line 260
    iput-object v4, v1, Lcom/baseflow/geolocator/GeolocatorLocationService;->g:Lx4/e;

    .line 261
    .line 262
    iget-object v6, v1, Lcom/baseflow/geolocator/GeolocatorLocationService;->f:Lx4/c;

    .line 263
    .line 264
    iget-object v1, v1, Lcom/baseflow/geolocator/GeolocatorLocationService;->e:Landroid/app/Activity;

    .line 265
    .line 266
    new-instance v7, LVc/c;

    .line 267
    .line 268
    move-object/from16 v8, p2

    .line 269
    .line 270
    check-cast v8, Luc/h;

    .line 271
    .line 272
    const/4 v9, 0x1

    .line 273
    invoke-direct {v7, v8, v9}, LVc/c;-><init>(Luc/h;I)V

    .line 274
    .line 275
    .line 276
    new-instance v9, LVc/c;

    .line 277
    .line 278
    const/4 v10, 0x2

    .line 279
    invoke-direct {v9, v8, v10}, LVc/c;-><init>(Luc/h;I)V

    .line 280
    .line 281
    .line 282
    iget-object v6, v6, Lx4/c;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 283
    .line 284
    invoke-virtual {v6, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    invoke-interface {v4, v1, v7, v9}, Lx4/e;->a(Landroid/app/Activity;Lx4/l;Lw4/a;)V

    .line 288
    .line 289
    .line 290
    :cond_9
    iget-object v1, v0, Lv4/d;->e:Lcom/baseflow/geolocator/GeolocatorLocationService;

    .line 291
    .line 292
    iget-object v4, v1, Lcom/baseflow/geolocator/GeolocatorLocationService;->j:Lt6/q;

    .line 293
    .line 294
    if-eqz v4, :cond_a

    .line 295
    .line 296
    const-string v4, "Service already in foreground mode."

    .line 297
    .line 298
    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 299
    .line 300
    .line 301
    iget-object v3, v1, Lcom/baseflow/geolocator/GeolocatorLocationService;->j:Lt6/q;

    .line 302
    .line 303
    if-eqz v3, :cond_c

    .line 304
    .line 305
    iget-boolean v4, v1, Lcom/baseflow/geolocator/GeolocatorLocationService;->b:Z

    .line 306
    .line 307
    invoke-virtual {v3, v2, v4}, Lt6/q;->h(Lu0/a0;Z)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v1, v2}, Lcom/baseflow/geolocator/GeolocatorLocationService;->b(Lu0/a0;)V

    .line 311
    .line 312
    .line 313
    goto :goto_4

    .line 314
    :cond_a
    const-string v4, "Start service in foreground mode."

    .line 315
    .line 316
    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 317
    .line 318
    .line 319
    new-instance v3, Lt6/q;

    .line 320
    .line 321
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 322
    .line 323
    .line 324
    move-result-object v4

    .line 325
    invoke-direct {v3, v4, v2}, Lt6/q;-><init>(Landroid/content/Context;Lu0/a0;)V

    .line 326
    .line 327
    .line 328
    iput-object v3, v1, Lcom/baseflow/geolocator/GeolocatorLocationService;->j:Lt6/q;

    .line 329
    .line 330
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 331
    .line 332
    const/16 v6, 0x1a

    .line 333
    .line 334
    if-lt v3, v6, :cond_b

    .line 335
    .line 336
    new-instance v7, LX0/N;

    .line 337
    .line 338
    invoke-direct {v7, v4}, LX0/N;-><init>(Landroid/content/Context;)V

    .line 339
    .line 340
    .line 341
    invoke-static {}, Lorg/apache/tika/utils/a;->C()V

    .line 342
    .line 343
    .line 344
    iget-object v4, v2, Lu0/a0;->f:Ljava/lang/Object;

    .line 345
    .line 346
    check-cast v4, Ljava/lang/String;

    .line 347
    .line 348
    invoke-static {v4}, Lorg/apache/tika/utils/a;->a(Ljava/lang/String;)Landroid/app/NotificationChannel;

    .line 349
    .line 350
    .line 351
    move-result-object v4

    .line 352
    invoke-static {v4}, Lorg/apache/tika/utils/a;->p(Landroid/app/NotificationChannel;)V

    .line 353
    .line 354
    .line 355
    if-lt v3, v6, :cond_b

    .line 356
    .line 357
    iget-object v3, v7, LX0/N;->b:Landroid/app/NotificationManager;

    .line 358
    .line 359
    invoke-static {v3, v4}, LX0/G;->b(Landroid/app/NotificationManager;Landroid/app/NotificationChannel;)V

    .line 360
    .line 361
    .line 362
    :cond_b
    iget-object v3, v1, Lcom/baseflow/geolocator/GeolocatorLocationService;->j:Lt6/q;

    .line 363
    .line 364
    iget-object v3, v3, Lt6/q;->b:Ljava/lang/Object;

    .line 365
    .line 366
    check-cast v3, LX0/q;

    .line 367
    .line 368
    invoke-virtual {v3}, LX0/q;->a()Landroid/app/Notification;

    .line 369
    .line 370
    .line 371
    move-result-object v3

    .line 372
    const v4, 0x12697

    .line 373
    .line 374
    .line 375
    invoke-virtual {v1, v4, v3}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    .line 376
    .line 377
    .line 378
    iput-boolean v5, v1, Lcom/baseflow/geolocator/GeolocatorLocationService;->b:Z

    .line 379
    .line 380
    :cond_c
    :goto_4
    invoke-virtual {v1, v2}, Lcom/baseflow/geolocator/GeolocatorLocationService;->b(Lu0/a0;)V

    .line 381
    .line 382
    .line 383
    return-void

    .line 384
    :cond_d
    const-string v1, "Geolocator position updates started"

    .line 385
    .line 386
    invoke-static {v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 387
    .line 388
    .line 389
    iget-object v1, v0, Lv4/d;->c:Landroid/content/Context;

    .line 390
    .line 391
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 392
    .line 393
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 394
    .line 395
    .line 396
    move-result-object v3

    .line 397
    invoke-virtual {v2, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 398
    .line 399
    .line 400
    move-result v2

    .line 401
    iget-object v3, v0, Lv4/d;->f:Lx4/c;

    .line 402
    .line 403
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 404
    .line 405
    .line 406
    invoke-static {v1, v2, v4}, Lx4/c;->a(Landroid/content/Context;ZLx4/h;)Lx4/e;

    .line 407
    .line 408
    .line 409
    move-result-object v1

    .line 410
    iput-object v1, v0, Lv4/d;->g:Lx4/e;

    .line 411
    .line 412
    iget-object v2, v0, Lv4/d;->d:Landroid/app/Activity;

    .line 413
    .line 414
    new-instance v4, LVc/c;

    .line 415
    .line 416
    move-object/from16 v5, p2

    .line 417
    .line 418
    check-cast v5, Luc/h;

    .line 419
    .line 420
    const/4 v6, 0x3

    .line 421
    invoke-direct {v4, v5, v6}, LVc/c;-><init>(Luc/h;I)V

    .line 422
    .line 423
    .line 424
    new-instance v6, LVc/c;

    .line 425
    .line 426
    const/4 v7, 0x4

    .line 427
    invoke-direct {v6, v5, v7}, LVc/c;-><init>(Luc/h;I)V

    .line 428
    .line 429
    .line 430
    iget-object v3, v3, Lx4/c;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 431
    .line 432
    invoke-virtual {v3, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 433
    .line 434
    .line 435
    invoke-interface {v1, v2, v4, v6}, Lx4/e;->a(Landroid/app/Activity;Lx4/l;Lw4/a;)V

    .line 436
    .line 437
    .line 438
    return-void

    .line 439
    :catch_0
    invoke-static {v1}, Lpd/f;->h(I)Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v3

    .line 443
    invoke-static {v1}, Lpd/f;->g(I)Ljava/lang/String;

    .line 444
    .line 445
    .line 446
    move-result-object v1

    .line 447
    move-object/from16 v4, p2

    .line 448
    .line 449
    check-cast v4, Luc/h;

    .line 450
    .line 451
    invoke-virtual {v4, v3, v1, v2}, Luc/h;->c(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)V

    .line 452
    .line 453
    .line 454
    return-void
.end method
