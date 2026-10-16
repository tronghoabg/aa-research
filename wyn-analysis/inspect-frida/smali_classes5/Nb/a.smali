.class public final synthetic LNb/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luc/p;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/wynauto/wyn/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/wynauto/wyn/MainActivity;I)V
    .locals 0

    .line 1
    iput p2, p0, LNb/a;->a:I

    iput-object p1, p0, LNb/a;->b:Lcom/wynauto/wyn/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onMethodCall(Luc/o;Luc/q;)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    const-string v2, "call"

    .line 4
    .line 5
    iget-object v3, p0, LNb/a;->b:Lcom/wynauto/wyn/MainActivity;

    .line 6
    .line 7
    iget v4, p0, LNb/a;->a:I

    .line 8
    .line 9
    packed-switch v4, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget v4, Lcom/wynauto/wyn/MainActivity;->j:I

    .line 13
    .line 14
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v2, p1, Luc/o;->a:Ljava/lang/String;

    .line 18
    .line 19
    const-string v4, "yuvToJpeg"

    .line 20
    .line 21
    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_2

    .line 26
    .line 27
    :try_start_0
    const-string v2, "nv21"

    .line 28
    .line 29
    invoke-virtual {p1, v2}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-static {v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    check-cast v2, [B

    .line 37
    .line 38
    const-string v4, "width"

    .line 39
    .line 40
    invoke-virtual {p1, v4}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-static {v4}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    check-cast v4, Ljava/lang/Number;

    .line 48
    .line 49
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    const-string v5, "height"

    .line 54
    .line 55
    invoke-virtual {p1, v5}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    invoke-static {v5}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    check-cast v5, Ljava/lang/Number;

    .line 63
    .line 64
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    const-string v6, "quality"

    .line 69
    .line 70
    invoke-virtual {p1, v6}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    check-cast v6, Ljava/lang/Integer;

    .line 75
    .line 76
    if-eqz v6, :cond_0

    .line 77
    .line 78
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    goto :goto_0

    .line 83
    :catch_0
    move-exception p1

    .line 84
    goto :goto_1

    .line 85
    :cond_0
    const/16 v6, 0x55

    .line 86
    .line 87
    :goto_0
    const-string v7, "rotation"

    .line 88
    .line 89
    invoke-virtual {p1, v7}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    check-cast p1, Ljava/lang/Integer;

    .line 94
    .line 95
    if-eqz p1, :cond_1

    .line 96
    .line 97
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    invoke-static {v2, v4, v5, v6, v1}, Lcom/wynauto/wyn/MainActivity;->B([BIIII)[B

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    move-object v1, p2

    .line 109
    check-cast v1, Ltc/g;

    .line 110
    .line 111
    invoke-virtual {v1, p1}, Ltc/g;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 112
    .line 113
    .line 114
    goto :goto_2

    .line 115
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    const-string v1, "CONVERSION_ERROR"

    .line 120
    .line 121
    check-cast p2, Ltc/g;

    .line 122
    .line 123
    invoke-virtual {p2, v1, p1, v0}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_2
    check-cast p2, Ltc/g;

    .line 128
    .line 129
    invoke-virtual {p2}, Ltc/g;->c()V

    .line 130
    .line 131
    .line 132
    :goto_2
    return-void

    .line 133
    :pswitch_0
    sget v4, Lcom/wynauto/wyn/MainActivity;->j:I

    .line 134
    .line 135
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    iget-object v2, p1, Luc/o;->a:Ljava/lang/String;

    .line 139
    .line 140
    const-string v4, "getNativeLibraryDirectory"

    .line 141
    .line 142
    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v4

    .line 146
    if-eqz v4, :cond_3

    .line 147
    .line 148
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    const/16 v1, 0x80

    .line 160
    .line 161
    invoke-virtual {p1, v0, v1}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    const-string v0, "getApplicationInfo(...)"

    .line 166
    .line 167
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    iget-object p1, p1, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;

    .line 171
    .line 172
    check-cast p2, Ltc/g;

    .line 173
    .line 174
    invoke-virtual {p2, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    goto/16 :goto_5

    .line 178
    .line 179
    :cond_3
    const-string v4, "javaLoadLibrary"

    .line 180
    .line 181
    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v4

    .line 185
    if-eqz v4, :cond_4

    .line 186
    .line 187
    :try_start_1
    iget-object p1, p1, Luc/o;->b:Ljava/lang/Object;

    .line 188
    .line 189
    const-string v1, "null cannot be cast to non-null type kotlin.String"

    .line 190
    .line 191
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    check-cast p1, Ljava/lang/String;

    .line 195
    .line 196
    invoke-static {p1}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    move-object p1, p2

    .line 200
    check-cast p1, Ltc/g;

    .line 201
    .line 202
    invoke-virtual {p1, v0}, Ltc/g;->a(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 203
    .line 204
    .line 205
    goto :goto_5

    .line 206
    :catch_1
    move-exception p1

    .line 207
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    check-cast p2, Ltc/g;

    .line 212
    .line 213
    invoke-virtual {p2, p1, v0, v0}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    goto :goto_5

    .line 217
    :cond_4
    const-string p1, "startGnssStatus"

    .line 218
    .line 219
    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result p1

    .line 223
    const-string v4, "null cannot be cast to non-null type android.location.LocationManager"

    .line 224
    .line 225
    const-string v5, "location"

    .line 226
    .line 227
    const/16 v6, 0x18

    .line 228
    .line 229
    if-eqz p1, :cond_6

    .line 230
    .line 231
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 232
    .line 233
    if-lt p1, v6, :cond_5

    .line 234
    .line 235
    invoke-virtual {v3, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    check-cast p1, Landroid/location/LocationManager;

    .line 243
    .line 244
    new-instance v2, LNb/b;

    .line 245
    .line 246
    invoke-direct {v2, v3, v1}, LNb/b;-><init>(Ljava/lang/Object;I)V

    .line 247
    .line 248
    .line 249
    iput-object v2, v3, Lcom/wynauto/wyn/MainActivity;->i:Landroid/location/GnssStatus$Callback;

    .line 250
    .line 251
    :try_start_2
    invoke-static {p1, v2}, LA7/O0;->q(Landroid/location/LocationManager;Landroid/location/GnssStatus$Callback;)V
    :try_end_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_2

    .line 252
    .line 253
    .line 254
    goto :goto_3

    .line 255
    :cond_5
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    :catch_2
    :goto_3
    check-cast p2, Ltc/g;

    .line 259
    .line 260
    invoke-virtual {p2, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    goto :goto_5

    .line 264
    :cond_6
    const-string p1, "stopGnssStatus"

    .line 265
    .line 266
    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    move-result p1

    .line 270
    if-eqz p1, :cond_9

    .line 271
    .line 272
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 273
    .line 274
    if-lt p1, v6, :cond_7

    .line 275
    .line 276
    invoke-virtual {v3, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object p1

    .line 280
    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    check-cast p1, Landroid/location/LocationManager;

    .line 284
    .line 285
    iget-object v1, v3, Lcom/wynauto/wyn/MainActivity;->i:Landroid/location/GnssStatus$Callback;

    .line 286
    .line 287
    if-eqz v1, :cond_8

    .line 288
    .line 289
    invoke-static {p1, v1}, LA7/O0;->C(Landroid/location/LocationManager;Landroid/location/GnssStatus$Callback;)V

    .line 290
    .line 291
    .line 292
    goto :goto_4

    .line 293
    :cond_7
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    :cond_8
    :goto_4
    check-cast p2, Ltc/g;

    .line 297
    .line 298
    invoke-virtual {p2, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 299
    .line 300
    .line 301
    goto :goto_5

    .line 302
    :cond_9
    check-cast p2, Ltc/g;

    .line 303
    .line 304
    invoke-virtual {p2}, Ltc/g;->c()V

    .line 305
    .line 306
    .line 307
    :goto_5
    return-void

    .line 308
    nop

    .line 309
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
