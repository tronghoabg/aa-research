.class public final synthetic LRc/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/util/Map;

.field public final synthetic c:Lcom/google/android/gms/tasks/TaskCompletionSource;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Map;Lcom/google/android/gms/tasks/TaskCompletionSource;I)V
    .locals 0

    .line 1
    iput p3, p0, LRc/a;->a:I

    iput-object p1, p0, LRc/a;->b:Ljava/util/Map;

    iput-object p2, p0, LRc/a;->c:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget v0, p0, LRc/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LRc/a;->b:Ljava/util/Map;

    .line 7
    .line 8
    iget-object v1, p0, LRc/a;->c:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 9
    .line 10
    :try_start_0
    invoke-static {}, Lcom/google/firebase/messaging/FirebaseMessaging;->c()Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-static {v0}, Lp7/b;->F(Ljava/util/Map;)LW9/t;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v2, v0}, Lcom/google/firebase/messaging/FirebaseMessaging;->h(LW9/t;)V

    .line 19
    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catch_0
    move-exception v0

    .line 27
    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    return-void

    .line 31
    :pswitch_0
    iget-object v0, p0, LRc/a;->b:Ljava/util/Map;

    .line 32
    .line 33
    iget-object v1, p0, LRc/a;->c:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 34
    .line 35
    :try_start_1
    invoke-static {}, Lcom/google/firebase/messaging/FirebaseMessaging;->c()Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    const-string v3, "topic"

    .line 40
    .line 41
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {v0}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    check-cast v0, Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    new-instance v3, LJ9/y;

    .line 54
    .line 55
    const/4 v4, 0x1

    .line 56
    invoke-direct {v3, v0, v4}, LJ9/y;-><init>(Ljava/lang/String;I)V

    .line 57
    .line 58
    .line 59
    iget-object v0, v2, Lcom/google/firebase/messaging/FirebaseMessaging;->h:Lcom/google/android/gms/tasks/Task;

    .line 60
    .line 61
    invoke-virtual {v0, v3}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    const/4 v0, 0x0

    .line 69
    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :catch_1
    move-exception v0

    .line 74
    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 75
    .line 76
    .line 77
    :goto_1
    return-void

    .line 78
    :pswitch_1
    iget-object v0, p0, LRc/a;->b:Ljava/util/Map;

    .line 79
    .line 80
    iget-object v1, p0, LRc/a;->c:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 81
    .line 82
    :try_start_2
    invoke-static {}, Lcom/google/firebase/messaging/FirebaseMessaging;->c()Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    const-string v3, "enabled"

    .line 87
    .line 88
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-static {v0}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    check-cast v0, Ljava/lang/Boolean;

    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    invoke-static {}, Ls8/g;->e()Ls8/g;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    invoke-virtual {v3}, Ls8/g;->a()V

    .line 109
    .line 110
    .line 111
    iget-object v3, v3, Ls8/g;->a:Landroid/content/Context;

    .line 112
    .line 113
    const-string v4, "com.google.firebase.messaging"

    .line 114
    .line 115
    const/4 v5, 0x0

    .line 116
    invoke-virtual {v3, v4, v5}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    const-string v4, "export_to_big_query"

    .line 125
    .line 126
    invoke-interface {v3, v4, v0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 131
    .line 132
    .line 133
    iget-object v0, v2, Lcom/google/firebase/messaging/FirebaseMessaging;->c:LC6/l;

    .line 134
    .line 135
    invoke-virtual {v2}, Lcom/google/firebase/messaging/FirebaseMessaging;->k()Z

    .line 136
    .line 137
    .line 138
    move-result v3

    .line 139
    iget-object v2, v2, Lcom/google/firebase/messaging/FirebaseMessaging;->b:Landroid/content/Context;

    .line 140
    .line 141
    invoke-static {v2, v0, v3}, Lff/B;->I(Landroid/content/Context;LC6/l;Z)V

    .line 142
    .line 143
    .line 144
    const/4 v0, 0x0

    .line 145
    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 146
    .line 147
    .line 148
    goto :goto_2

    .line 149
    :catch_2
    move-exception v0

    .line 150
    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 151
    .line 152
    .line 153
    :goto_2
    return-void

    .line 154
    :pswitch_2
    iget-object v0, p0, LRc/a;->b:Ljava/util/Map;

    .line 155
    .line 156
    iget-object v1, p0, LRc/a;->c:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 157
    .line 158
    :try_start_3
    invoke-static {}, Lcom/google/firebase/messaging/FirebaseMessaging;->c()Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    const-string v3, "topic"

    .line 163
    .line 164
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-static {v0}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    check-cast v0, Ljava/lang/String;

    .line 172
    .line 173
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    new-instance v3, LJ9/y;

    .line 177
    .line 178
    const/4 v4, 0x2

    .line 179
    invoke-direct {v3, v0, v4}, LJ9/y;-><init>(Ljava/lang/String;I)V

    .line 180
    .line 181
    .line 182
    iget-object v0, v2, Lcom/google/firebase/messaging/FirebaseMessaging;->h:Lcom/google/android/gms/tasks/Task;

    .line 183
    .line 184
    invoke-virtual {v0, v3}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    const/4 v0, 0x0

    .line 192
    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 193
    .line 194
    .line 195
    goto :goto_3

    .line 196
    :catch_3
    move-exception v0

    .line 197
    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 198
    .line 199
    .line 200
    :goto_3
    return-void

    .line 201
    :pswitch_3
    iget-object v0, p0, LRc/a;->b:Ljava/util/Map;

    .line 202
    .line 203
    iget-object v1, p0, LRc/a;->c:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 204
    .line 205
    :try_start_4
    const-string v2, "identifier"

    .line 206
    .line 207
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    invoke-static {v0}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    check-cast v0, Ljava/lang/String;

    .line 215
    .line 216
    invoke-static {}, LN8/c;->a()LN8/c;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    iget-object v2, v2, LN8/c;->a:LR8/s;

    .line 221
    .line 222
    iget-object v3, v2, LR8/s;->p:LS8/f;

    .line 223
    .line 224
    iget-object v3, v3, LS8/f;->a:LS8/c;

    .line 225
    .line 226
    new-instance v4, LC8/d;

    .line 227
    .line 228
    const/16 v5, 0x1d

    .line 229
    .line 230
    invoke-direct {v4, v5, v2, v0}, LC8/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v3, v4}, LS8/c;->b(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    .line 234
    .line 235
    .line 236
    const/4 v0, 0x0

    .line 237
    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    .line 238
    .line 239
    .line 240
    goto :goto_4

    .line 241
    :catch_4
    move-exception v0

    .line 242
    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 243
    .line 244
    .line 245
    :goto_4
    return-void

    .line 246
    :pswitch_4
    iget-object v0, p0, LRc/a;->b:Ljava/util/Map;

    .line 247
    .line 248
    iget-object v1, p0, LRc/a;->c:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 249
    .line 250
    :try_start_5
    const-string v2, "message"

    .line 251
    .line 252
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    invoke-static {v0}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-object v6, v0

    .line 260
    check-cast v6, Ljava/lang/String;

    .line 261
    .line 262
    invoke-static {}, LN8/c;->a()LN8/c;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    iget-object v3, v0, LN8/c;->a:LR8/s;

    .line 267
    .line 268
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 269
    .line 270
    .line 271
    move-result-wide v4

    .line 272
    iget-wide v7, v3, LR8/s;->d:J

    .line 273
    .line 274
    sub-long/2addr v4, v7

    .line 275
    iget-object v0, v3, LR8/s;->p:LS8/f;

    .line 276
    .line 277
    iget-object v0, v0, LS8/f;->a:LS8/c;

    .line 278
    .line 279
    new-instance v2, LR8/o;

    .line 280
    .line 281
    const/4 v7, 0x1

    .line 282
    invoke-direct/range {v2 .. v7}, LR8/o;-><init>(LR8/s;JLjava/lang/String;I)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v0, v2}, LS8/c;->b(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    .line 286
    .line 287
    .line 288
    const/4 v0, 0x0

    .line 289
    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    .line 290
    .line 291
    .line 292
    goto :goto_5

    .line 293
    :catch_5
    move-exception v0

    .line 294
    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 295
    .line 296
    .line 297
    :goto_5
    return-void

    .line 298
    :pswitch_5
    iget-object v0, p0, LRc/a;->b:Ljava/util/Map;

    .line 299
    .line 300
    iget-object v1, p0, LRc/a;->c:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 301
    .line 302
    :try_start_6
    const-string v2, "key"

    .line 303
    .line 304
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v2

    .line 308
    invoke-static {v2}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    check-cast v2, Ljava/lang/String;

    .line 312
    .line 313
    const-string v3, "value"

    .line 314
    .line 315
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    invoke-static {v0}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    check-cast v0, Ljava/lang/String;

    .line 323
    .line 324
    invoke-static {}, LN8/c;->a()LN8/c;

    .line 325
    .line 326
    .line 327
    move-result-object v3

    .line 328
    iget-object v3, v3, LN8/c;->a:LR8/s;

    .line 329
    .line 330
    iget-object v4, v3, LR8/s;->p:LS8/f;

    .line 331
    .line 332
    iget-object v4, v4, LS8/f;->a:LS8/c;

    .line 333
    .line 334
    new-instance v5, LR8/q;

    .line 335
    .line 336
    const/4 v6, 0x0

    .line 337
    invoke-direct {v5, v3, v2, v0, v6}, LR8/q;-><init>(LR8/s;Ljava/lang/String;Ljava/lang/String;I)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v4, v5}, LS8/c;->b(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    .line 341
    .line 342
    .line 343
    const/4 v0, 0x0

    .line 344
    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6

    .line 345
    .line 346
    .line 347
    goto :goto_6

    .line 348
    :catch_6
    move-exception v0

    .line 349
    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 350
    .line 351
    .line 352
    :goto_6
    return-void

    .line 353
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
