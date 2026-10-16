.class public final synthetic Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LX8/c;


# direct methods
.method public synthetic constructor <init>(LX8/c;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/e;->a:I

    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/e;->b:LX8/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    sget-object v2, Lef/C;->a:Lef/C;

    .line 6
    .line 7
    sget-object v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/h;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/h;

    .line 8
    .line 9
    sget-object v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/g;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/g;

    .line 10
    .line 11
    const-string v5, "store_launch_complete"

    .line 12
    .line 13
    const-string v6, "result"

    .line 14
    .line 15
    iget-object v7, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/e;->b:LX8/c;

    .line 16
    .line 17
    sget-object v8, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/i;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/i;

    .line 18
    .line 19
    const-string v9, "outcome"

    .line 20
    .line 21
    const/4 v10, 0x0

    .line 22
    iget v11, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/e;->a:I

    .line 23
    .line 24
    packed-switch v11, :pswitch_data_0

    .line 25
    .line 26
    .line 27
    move-object/from16 v11, p1

    .line 28
    .line 29
    check-cast v11, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/j;

    .line 30
    .line 31
    invoke-static {v11, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v11, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v8

    .line 38
    iget-object v9, v7, LX8/c;->f:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v9, Lcom/moloco/sdk/acm/recorder/c;

    .line 41
    .line 42
    if-eqz v8, :cond_2

    .line 43
    .line 44
    sget-object v12, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 45
    .line 46
    const/16 v17, 0xc

    .line 47
    .line 48
    const/16 v18, 0x0

    .line 49
    .line 50
    const-string v13, "InlineInstallLauncher"

    .line 51
    .line 52
    const-string v14, "click_inline_halfsheet_shown"

    .line 53
    .line 54
    const/4 v15, 0x0

    .line 55
    const/16 v16, 0x0

    .line 56
    .line 57
    invoke-static/range {v12 .. v18}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    if-eqz v9, :cond_0

    .line 61
    .line 62
    new-instance v1, Lcom/moloco/sdk/acm/h;

    .line 63
    .line 64
    sget-object v3, Lcom/moloco/sdk/internal/client_metrics_data/a;->b:[Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 65
    .line 66
    invoke-direct {v1, v5}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    sget-object v3, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 70
    .line 71
    const-string v3, "click_inline_halfsheet_shown"

    .line 72
    .line 73
    invoke-virtual {v1, v6, v3}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v9, v1}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 77
    .line 78
    .line 79
    :cond_0
    iget-object v1, v7, LX8/c;->g:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 82
    .line 83
    const/4 v3, 0x1

    .line 84
    invoke-virtual {v1, v10, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    if-eqz v1, :cond_1

    .line 89
    .line 90
    iget-object v1, v7, LX8/c;->d:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/c;

    .line 93
    .line 94
    iget-object v1, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/c;->b:Ljava/lang/String;

    .line 95
    .line 96
    if-eqz v1, :cond_4

    .line 97
    .line 98
    invoke-static {}, Lcom/moloco/sdk/service_locator/j;->b()Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/n;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    invoke-virtual {v3, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/n;->a(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    const-string v3, "inline_install_success fire this event once: "

    .line 106
    .line 107
    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v14

    .line 111
    const/16 v17, 0xc

    .line 112
    .line 113
    const/16 v18, 0x0

    .line 114
    .line 115
    const-string v13, "InlineInstallLauncher"

    .line 116
    .line 117
    const/4 v15, 0x0

    .line 118
    const/16 v16, 0x0

    .line 119
    .line 120
    invoke-static/range {v12 .. v18}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_1
    const/16 v17, 0xc

    .line 125
    .line 126
    const/16 v18, 0x0

    .line 127
    .line 128
    const-string v13, "InlineInstallLauncher"

    .line 129
    .line 130
    const-string v14, "inline_install_success already fired"

    .line 131
    .line 132
    const/4 v15, 0x0

    .line 133
    const/16 v16, 0x0

    .line 134
    .line 135
    invoke-static/range {v12 .. v18}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_2
    invoke-virtual {v11, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v4

    .line 143
    if-eqz v4, :cond_3

    .line 144
    .line 145
    sget-object v12, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 146
    .line 147
    const/16 v17, 0xc

    .line 148
    .line 149
    const/16 v18, 0x0

    .line 150
    .line 151
    const-string v13, "InlineInstallLauncher"

    .line 152
    .line 153
    const-string v14, "click_inline_fullsheet_shown"

    .line 154
    .line 155
    const/4 v15, 0x0

    .line 156
    const/16 v16, 0x0

    .line 157
    .line 158
    invoke-static/range {v12 .. v18}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    if-eqz v9, :cond_4

    .line 162
    .line 163
    new-instance v1, Lcom/moloco/sdk/acm/h;

    .line 164
    .line 165
    sget-object v3, Lcom/moloco/sdk/internal/client_metrics_data/a;->b:[Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 166
    .line 167
    invoke-direct {v1, v5}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    sget-object v3, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 171
    .line 172
    const-string v3, "click_inline_fullsheet_shown"

    .line 173
    .line 174
    invoke-virtual {v1, v6, v3}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v9, v1}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 178
    .line 179
    .line 180
    goto :goto_0

    .line 181
    :cond_3
    invoke-virtual {v11, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v3

    .line 185
    if-eqz v3, :cond_5

    .line 186
    .line 187
    sget-object v11, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 188
    .line 189
    const/16 v16, 0xc

    .line 190
    .line 191
    const/16 v17, 0x0

    .line 192
    .line 193
    const-string v12, "InlineInstallLauncher"

    .line 194
    .line 195
    const-string v13, "click_inline_fallback_shown"

    .line 196
    .line 197
    const/4 v14, 0x0

    .line 198
    const/4 v15, 0x0

    .line 199
    invoke-static/range {v11 .. v17}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    if-eqz v9, :cond_4

    .line 203
    .line 204
    new-instance v1, Lcom/moloco/sdk/acm/h;

    .line 205
    .line 206
    sget-object v3, Lcom/moloco/sdk/internal/client_metrics_data/a;->b:[Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 207
    .line 208
    invoke-direct {v1, v5}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    sget-object v3, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 212
    .line 213
    const-string v3, "click_inline_fallback_shown"

    .line 214
    .line 215
    invoke-virtual {v1, v6, v3}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v9, v1}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 219
    .line 220
    .line 221
    :cond_4
    :goto_0
    return-object v2

    .line 222
    :cond_5
    new-instance v2, LE5/Q;

    .line 223
    .line 224
    invoke-direct {v2, v10, v1}, LE5/Q;-><init>(BI)V

    .line 225
    .line 226
    .line 227
    throw v2

    .line 228
    :pswitch_0
    move-object/from16 v11, p1

    .line 229
    .line 230
    check-cast v11, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/j;

    .line 231
    .line 232
    invoke-static {v11, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v11, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result v8

    .line 239
    if-nez v8, :cond_8

    .line 240
    .line 241
    invoke-virtual {v11, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    move-result v4

    .line 245
    iget-object v7, v7, LX8/c;->f:Ljava/lang/Object;

    .line 246
    .line 247
    check-cast v7, Lcom/moloco/sdk/acm/recorder/c;

    .line 248
    .line 249
    if-eqz v4, :cond_6

    .line 250
    .line 251
    sget-object v12, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 252
    .line 253
    const/16 v17, 0xc

    .line 254
    .line 255
    const/16 v18, 0x0

    .line 256
    .line 257
    const-string v13, "InlineInstallLauncher"

    .line 258
    .line 259
    const-string v14, "auto_fullsheet_shown"

    .line 260
    .line 261
    const/4 v15, 0x0

    .line 262
    const/16 v16, 0x0

    .line 263
    .line 264
    invoke-static/range {v12 .. v18}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    if-eqz v7, :cond_8

    .line 268
    .line 269
    new-instance v1, Lcom/moloco/sdk/acm/h;

    .line 270
    .line 271
    sget-object v3, Lcom/moloco/sdk/internal/client_metrics_data/a;->b:[Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 272
    .line 273
    invoke-direct {v1, v5}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    sget-object v3, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 277
    .line 278
    const-string v3, "auto_fullsheet_shown"

    .line 279
    .line 280
    invoke-virtual {v1, v6, v3}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v7, v1}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 284
    .line 285
    .line 286
    goto :goto_1

    .line 287
    :cond_6
    invoke-virtual {v11, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 288
    .line 289
    .line 290
    move-result v3

    .line 291
    if-eqz v3, :cond_7

    .line 292
    .line 293
    sget-object v11, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 294
    .line 295
    const/16 v16, 0xc

    .line 296
    .line 297
    const/16 v17, 0x0

    .line 298
    .line 299
    const-string v12, "InlineInstallLauncher"

    .line 300
    .line 301
    const-string v13, "auto_fallback_shown"

    .line 302
    .line 303
    const/4 v14, 0x0

    .line 304
    const/4 v15, 0x0

    .line 305
    invoke-static/range {v11 .. v17}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 306
    .line 307
    .line 308
    if-eqz v7, :cond_8

    .line 309
    .line 310
    new-instance v1, Lcom/moloco/sdk/acm/h;

    .line 311
    .line 312
    sget-object v3, Lcom/moloco/sdk/internal/client_metrics_data/a;->b:[Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 313
    .line 314
    invoke-direct {v1, v5}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 315
    .line 316
    .line 317
    sget-object v3, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 318
    .line 319
    const-string v3, "auto_fallback_shown"

    .line 320
    .line 321
    invoke-virtual {v1, v6, v3}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v7, v1}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 325
    .line 326
    .line 327
    goto :goto_1

    .line 328
    :cond_7
    new-instance v2, LE5/Q;

    .line 329
    .line 330
    invoke-direct {v2, v10, v1}, LE5/Q;-><init>(BI)V

    .line 331
    .line 332
    .line 333
    throw v2

    .line 334
    :cond_8
    :goto_1
    return-object v2

    .line 335
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
