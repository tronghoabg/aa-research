.class public final synthetic LG5/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Z

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Z)V
    .locals 0

    .line 1
    iput p1, p0, LG5/o;->a:I

    iput-object p2, p0, LG5/o;->c:Ljava/lang/Object;

    iput-boolean p3, p0, LG5/o;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    const/16 v0, 0x17

    .line 2
    .line 3
    iget-boolean v1, p0, LG5/o;->b:Z

    .line 4
    .line 5
    iget-object v2, p0, LG5/o;->c:Ljava/lang/Object;

    .line 6
    .line 7
    iget v3, p0, LG5/o;->a:I

    .line 8
    .line 9
    packed-switch v3, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v2, Lp9/n;

    .line 13
    .line 14
    iget-object v0, v2, Lp9/n;->g:Lr9/l;

    .line 15
    .line 16
    iget-object v0, v0, Lr9/l;->g:LK8/f;

    .line 17
    .line 18
    iput-boolean v1, v0, LK8/f;->b:Z

    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    check-cast v2, Lf5/h;

    .line 22
    .line 23
    const-string v0, "Creating recognizer"

    .line 24
    .line 25
    invoke-virtual {v2, v0}, Lf5/h;->c(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iget-boolean v0, v2, Lf5/h;->k:Z

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    if-eqz v0, :cond_3

    .line 32
    .line 33
    iget-object v0, v2, Lf5/h;->a:Landroid/content/Context;

    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    new-instance v4, Landroid/content/Intent;

    .line 42
    .line 43
    const-string v5, "android.speech.RecognitionService"

    .line 44
    .line 45
    invoke-direct {v4, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const/4 v5, 0x0

    .line 49
    invoke-virtual {v1, v4, v5}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    const-string v4, "queryIntentServices(...)"

    .line 54
    .line 55
    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    new-instance v4, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    const-string v5, "RecognitionService, found: "

    .line 61
    .line 62
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    invoke-virtual {v2, v4}, Lf5/h;->c(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    move-object v4, v1

    .line 80
    check-cast v4, Ljava/lang/Iterable;

    .line 81
    .line 82
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    if-eqz v5, :cond_1

    .line 91
    .line 92
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    check-cast v5, Landroid/content/pm/ResolveInfo;

    .line 97
    .line 98
    iget-object v5, v5, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    .line 99
    .line 100
    if-eqz v5, :cond_0

    .line 101
    .line 102
    new-instance v6, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    const-string v7, "RecognitionService: packageName: "

    .line 105
    .line 106
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    iget-object v7, v5, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    .line 110
    .line 111
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    const-string v7, ", name: "

    .line 115
    .line 116
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    iget-object v5, v5, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    .line 120
    .line 121
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    invoke-virtual {v2, v5}, Lf5/h;->c(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_1
    invoke-static {v1}, Lff/o;->s0(Ljava/util/List;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    check-cast v1, Landroid/content/pm/ResolveInfo;

    .line 137
    .line 138
    if-eqz v1, :cond_2

    .line 139
    .line 140
    iget-object v1, v1, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    .line 141
    .line 142
    if-eqz v1, :cond_2

    .line 143
    .line 144
    new-instance v4, Landroid/content/ComponentName;

    .line 145
    .line 146
    iget-object v5, v1, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    .line 147
    .line 148
    iget-object v1, v1, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    .line 149
    .line 150
    invoke-direct {v4, v5, v1}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_2
    move-object v4, v3

    .line 155
    :goto_1
    invoke-static {v0, v4}, Landroid/speech/SpeechRecognizer;->createSpeechRecognizer(Landroid/content/Context;Landroid/content/ComponentName;)Landroid/speech/SpeechRecognizer;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    const-string v1, "Setting listener after intent lookup"

    .line 160
    .line 161
    invoke-virtual {v2, v1}, Lf5/h;->c(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0, v2}, Landroid/speech/SpeechRecognizer;->setRecognitionListener(Landroid/speech/RecognitionListener;)V

    .line 165
    .line 166
    .line 167
    iput-object v0, v2, Lf5/h;->p:Landroid/speech/SpeechRecognizer;

    .line 168
    .line 169
    goto :goto_2

    .line 170
    :cond_3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 171
    .line 172
    const/16 v4, 0x1f

    .line 173
    .line 174
    if-lt v0, v4, :cond_4

    .line 175
    .line 176
    if-eqz v1, :cond_4

    .line 177
    .line 178
    iget-object v0, v2, Lf5/h;->a:Landroid/content/Context;

    .line 179
    .line 180
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    invoke-static {v0}, Le1/c;->y(Landroid/content/Context;)Z

    .line 184
    .line 185
    .line 186
    move-result v0

    .line 187
    if-eqz v0, :cond_4

    .line 188
    .line 189
    iget-object v0, v2, Lf5/h;->a:Landroid/content/Context;

    .line 190
    .line 191
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    invoke-static {v0}, Le1/c;->g(Landroid/content/Context;)Landroid/speech/SpeechRecognizer;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    const-string v1, "Setting on device listener"

    .line 199
    .line 200
    invoke-virtual {v2, v1}, Lf5/h;->c(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v0, v2}, Landroid/speech/SpeechRecognizer;->setRecognitionListener(Landroid/speech/RecognitionListener;)V

    .line 204
    .line 205
    .line 206
    iput-object v0, v2, Lf5/h;->p:Landroid/speech/SpeechRecognizer;

    .line 207
    .line 208
    :cond_4
    iget-object v0, v2, Lf5/h;->p:Landroid/speech/SpeechRecognizer;

    .line 209
    .line 210
    if-nez v0, :cond_5

    .line 211
    .line 212
    iget-object v0, v2, Lf5/h;->a:Landroid/content/Context;

    .line 213
    .line 214
    invoke-static {v0}, Landroid/speech/SpeechRecognizer;->createSpeechRecognizer(Landroid/content/Context;)Landroid/speech/SpeechRecognizer;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    const-string v1, "Setting default listener"

    .line 219
    .line 220
    invoke-virtual {v2, v1}, Lf5/h;->c(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v0, v2}, Landroid/speech/SpeechRecognizer;->setRecognitionListener(Landroid/speech/RecognitionListener;)V

    .line 224
    .line 225
    .line 226
    iput-object v0, v2, Lf5/h;->p:Landroid/speech/SpeechRecognizer;

    .line 227
    .line 228
    :cond_5
    :goto_2
    iget-object v0, v2, Lf5/h;->p:Landroid/speech/SpeechRecognizer;

    .line 229
    .line 230
    if-nez v0, :cond_7

    .line 231
    .line 232
    const-string v0, "SpeechToTextPlugin"

    .line 233
    .line 234
    const-string v1, "Speech recognizer null"

    .line 235
    .line 236
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 237
    .line 238
    .line 239
    iget-object v0, v2, Lf5/h;->e:LWa/h;

    .line 240
    .line 241
    if-eqz v0, :cond_6

    .line 242
    .line 243
    const-string v4, "recognizerNotAvailable"

    .line 244
    .line 245
    const-string v5, ""

    .line 246
    .line 247
    invoke-virtual {v0, v4, v1, v5}, LWa/h;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    :cond_6
    iput-object v3, v2, Lf5/h;->e:LWa/h;

    .line 251
    .line 252
    :cond_7
    return-void

    .line 253
    :pswitch_1
    check-cast v2, Lcom/applovin/impl/l4;

    .line 254
    .line 255
    invoke-static {v2, v1}, Lcom/applovin/impl/l4;->k(Lcom/applovin/impl/l4;Z)V

    .line 256
    .line 257
    .line 258
    return-void

    .line 259
    :pswitch_2
    check-cast v2, LWa/b;

    .line 260
    .line 261
    iget-object v0, v2, LWa/b;->h:Luc/h;

    .line 262
    .line 263
    if-eqz v0, :cond_8

    .line 264
    .line 265
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    invoke-virtual {v0, v1}, Luc/h;->a(Ljava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    :cond_8
    return-void

    .line 273
    :pswitch_3
    check-cast v2, LS3/s;

    .line 274
    .line 275
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    sget v3, LQ1/x;->a:I

    .line 279
    .line 280
    iget-object v2, v2, LS3/s;->c:Ljava/lang/Object;

    .line 281
    .line 282
    check-cast v2, LU1/r;

    .line 283
    .line 284
    iget-object v2, v2, LU1/r;->a:LU1/u;

    .line 285
    .line 286
    iget-boolean v3, v2, LU1/u;->W:Z

    .line 287
    .line 288
    if-ne v3, v1, :cond_9

    .line 289
    .line 290
    goto :goto_3

    .line 291
    :cond_9
    iput-boolean v1, v2, LU1/u;->W:Z

    .line 292
    .line 293
    new-instance v3, LE5/y;

    .line 294
    .line 295
    const/4 v4, 0x4

    .line 296
    invoke-direct {v3, v1, v4}, LE5/y;-><init>(ZI)V

    .line 297
    .line 298
    .line 299
    iget-object v1, v2, LU1/u;->l:LQ1/j;

    .line 300
    .line 301
    invoke-virtual {v1, v0, v3}, LQ1/j;->e(ILQ1/g;)V

    .line 302
    .line 303
    .line 304
    :goto_3
    return-void

    .line 305
    :pswitch_4
    check-cast v2, LG5/p;

    .line 306
    .line 307
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 308
    .line 309
    .line 310
    sget v3, Lu6/v;->a:I

    .line 311
    .line 312
    iget-object v2, v2, LG5/p;->c:LE5/F;

    .line 313
    .line 314
    iget-object v2, v2, LE5/F;->a:LE5/I;

    .line 315
    .line 316
    iget-boolean v3, v2, LE5/I;->c0:Z

    .line 317
    .line 318
    if-ne v3, v1, :cond_a

    .line 319
    .line 320
    goto :goto_4

    .line 321
    :cond_a
    iput-boolean v1, v2, LE5/I;->c0:Z

    .line 322
    .line 323
    new-instance v3, LE5/y;

    .line 324
    .line 325
    const/4 v4, 0x1

    .line 326
    invoke-direct {v3, v1, v4}, LE5/y;-><init>(ZI)V

    .line 327
    .line 328
    .line 329
    iget-object v1, v2, LE5/I;->l:LK8/H;

    .line 330
    .line 331
    invoke-virtual {v1, v0, v3}, LK8/H;->p(ILu6/g;)V

    .line 332
    .line 333
    .line 334
    :goto_4
    return-void

    .line 335
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
