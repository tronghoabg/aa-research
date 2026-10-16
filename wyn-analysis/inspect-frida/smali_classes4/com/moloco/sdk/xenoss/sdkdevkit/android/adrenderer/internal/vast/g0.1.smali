.class public final Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/g0;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:I

.field public b:I

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lorg/xmlpull/v1/XmlPullParser;

.field public final synthetic e:Lkotlin/jvm/internal/G;

.field public final synthetic f:Ljava/util/ArrayList;

.field public final synthetic g:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Lorg/xmlpull/v1/XmlPullParser;Ljf/c;Lkotlin/jvm/internal/G;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/g0;->d:Lorg/xmlpull/v1/XmlPullParser;

    .line 2
    .line 3
    iput-object p3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/g0;->e:Lkotlin/jvm/internal/G;

    .line 4
    .line 5
    iput-object p4, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/g0;->f:Ljava/util/ArrayList;

    .line 6
    .line 7
    iput-object p5, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/g0;->g:Ljava/util/ArrayList;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p2}, Llf/j;-><init>(ILjf/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 6

    .line 1
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/g0;

    .line 2
    .line 3
    iget-object v4, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/g0;->f:Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object v5, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/g0;->g:Ljava/util/ArrayList;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/g0;->e:Lkotlin/jvm/internal/G;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/g0;->d:Lorg/xmlpull/v1/XmlPullParser;

    .line 10
    .line 11
    move-object v2, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/g0;-><init>(Lorg/xmlpull/v1/XmlPullParser;Ljf/c;Lkotlin/jvm/internal/G;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/g0;->c:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LEf/E;

    .line 2
    .line 3
    check-cast p2, Ljf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/g0;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/g0;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/g0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    iget v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/g0;->b:I

    .line 4
    .line 5
    sget-object v2, Lef/C;->a:Lef/C;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x3

    .line 9
    const/4 v5, 0x2

    .line 10
    iget-object v6, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/g0;->d:Lorg/xmlpull/v1/XmlPullParser;

    .line 11
    .line 12
    if-eqz v1, :cond_3

    .line 13
    .line 14
    if-eq v1, v3, :cond_2

    .line 15
    .line 16
    if-eq v1, v5, :cond_1

    .line 17
    .line 18
    if-ne v1, v4, :cond_0

    .line 19
    .line 20
    iget v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/g0;->a:I

    .line 21
    .line 22
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto/16 :goto_2

    .line 26
    .line 27
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 30
    .line 31
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p1

    .line 35
    :cond_1
    iget v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/g0;->a:I

    .line 36
    .line 37
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto/16 :goto_1

    .line 41
    .line 42
    :cond_2
    iget v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/g0;->a:I

    .line 43
    .line 44
    iget-object v7, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/g0;->c:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v7, Lkotlin/jvm/internal/G;

    .line 47
    .line 48
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto/16 :goto_4

    .line 52
    .line 53
    :cond_3
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/g0;->c:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p1, LEf/E;

    .line 59
    .line 60
    invoke-static {p1}, LEf/H;->o(LEf/E;)V

    .line 61
    .line 62
    .line 63
    invoke-static {v6}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/J0;->i(Lorg/xmlpull/v1/XmlPullParser;)Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-eqz p1, :cond_4

    .line 68
    .line 69
    invoke-interface {v6}, Lorg/xmlpull/v1/XmlPullParser;->nextTag()I

    .line 70
    .line 71
    .line 72
    :cond_4
    invoke-interface {v6}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-ne p1, v3, :cond_5

    .line 77
    .line 78
    goto/16 :goto_7

    .line 79
    .line 80
    :cond_5
    invoke-interface {v6}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-ne p1, v5, :cond_16

    .line 85
    .line 86
    invoke-interface {v6}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    move v1, p1

    .line 91
    :goto_0
    invoke-interface {v6}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    if-lt p1, v1, :cond_15

    .line 96
    .line 97
    invoke-interface {v6}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    sub-int/2addr p1, v1

    .line 102
    if-eqz p1, :cond_10

    .line 103
    .line 104
    if-eq p1, v3, :cond_6

    .line 105
    .line 106
    goto/16 :goto_6

    .line 107
    .line 108
    :cond_6
    sget-object p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/J0;->a:Lef/p;

    .line 109
    .line 110
    invoke-interface {v6}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    if-ne p1, v5, :cond_14

    .line 115
    .line 116
    invoke-interface {v6}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    if-eqz p1, :cond_14

    .line 121
    .line 122
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 123
    .line 124
    .line 125
    move-result v7

    .line 126
    const v8, -0x24d417c3

    .line 127
    .line 128
    .line 129
    if-eq v7, v8, :cond_d

    .line 130
    .line 131
    const v8, -0x8178f89

    .line 132
    .line 133
    .line 134
    const/4 v9, 0x0

    .line 135
    if-eq v7, v8, :cond_a

    .line 136
    .line 137
    const v8, 0x7d9f703f

    .line 138
    .line 139
    .line 140
    if-eq v7, v8, :cond_7

    .line 141
    .line 142
    goto/16 :goto_6

    .line 143
    .line 144
    :cond_7
    const-string v7, "ClickTracking"

    .line 145
    .line 146
    invoke-virtual {p1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    if-nez p1, :cond_8

    .line 151
    .line 152
    goto/16 :goto_6

    .line 153
    .line 154
    :cond_8
    iput-object v9, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/g0;->c:Ljava/lang/Object;

    .line 155
    .line 156
    iput v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/g0;->a:I

    .line 157
    .line 158
    iput v5, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/g0;->b:I

    .line 159
    .line 160
    invoke-static {v6, p0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/J0;->D(Lorg/xmlpull/v1/XmlPullParser;Llf/c;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    if-ne p1, v0, :cond_9

    .line 165
    .line 166
    goto :goto_3

    .line 167
    :cond_9
    :goto_1
    check-cast p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/J;

    .line 168
    .line 169
    if-eqz p1, :cond_14

    .line 170
    .line 171
    iget-object v7, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/g0;->f:Ljava/util/ArrayList;

    .line 172
    .line 173
    invoke-virtual {v7, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    goto/16 :goto_6

    .line 177
    .line 178
    :cond_a
    const-string v7, "CustomClick"

    .line 179
    .line 180
    invoke-virtual {p1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result p1

    .line 184
    if-nez p1, :cond_b

    .line 185
    .line 186
    goto/16 :goto_6

    .line 187
    .line 188
    :cond_b
    iput-object v9, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/g0;->c:Ljava/lang/Object;

    .line 189
    .line 190
    iput v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/g0;->a:I

    .line 191
    .line 192
    iput v4, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/g0;->b:I

    .line 193
    .line 194
    invoke-static {v6, p0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/J0;->D(Lorg/xmlpull/v1/XmlPullParser;Llf/c;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    if-ne p1, v0, :cond_c

    .line 199
    .line 200
    goto :goto_3

    .line 201
    :cond_c
    :goto_2
    check-cast p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/J;

    .line 202
    .line 203
    if-eqz p1, :cond_14

    .line 204
    .line 205
    iget-object v7, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/g0;->g:Ljava/util/ArrayList;

    .line 206
    .line 207
    invoke-virtual {v7, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    goto :goto_6

    .line 211
    :cond_d
    const-string v7, "ClickThrough"

    .line 212
    .line 213
    invoke-virtual {p1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    move-result p1

    .line 217
    if-nez p1, :cond_e

    .line 218
    .line 219
    goto :goto_6

    .line 220
    :cond_e
    iget-object v7, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/g0;->e:Lkotlin/jvm/internal/G;

    .line 221
    .line 222
    iput-object v7, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/g0;->c:Ljava/lang/Object;

    .line 223
    .line 224
    iput v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/g0;->a:I

    .line 225
    .line 226
    iput v3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/g0;->b:I

    .line 227
    .line 228
    invoke-static {v6, p0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/J0;->D(Lorg/xmlpull/v1/XmlPullParser;Llf/c;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    if-ne p1, v0, :cond_f

    .line 233
    .line 234
    :goto_3
    return-object v0

    .line 235
    :cond_f
    :goto_4
    iput-object p1, v7, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 236
    .line 237
    goto :goto_6

    .line 238
    :cond_10
    sget-object p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/J0;->a:Lef/p;

    .line 239
    .line 240
    invoke-interface {v6}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 241
    .line 242
    .line 243
    move-result p1

    .line 244
    if-ne p1, v5, :cond_11

    .line 245
    .line 246
    goto :goto_6

    .line 247
    :cond_11
    invoke-interface {v6}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 248
    .line 249
    .line 250
    move-result p1

    .line 251
    const/4 v7, 0x4

    .line 252
    if-ne p1, v7, :cond_13

    .line 253
    .line 254
    invoke-interface {v6}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object p1

    .line 258
    if-eqz p1, :cond_13

    .line 259
    .line 260
    invoke-static {p1}, LBf/k;->y0(Ljava/lang/CharSequence;)Z

    .line 261
    .line 262
    .line 263
    move-result p1

    .line 264
    if-eqz p1, :cond_12

    .line 265
    .line 266
    goto :goto_5

    .line 267
    :cond_12
    invoke-interface {v6}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object p1

    .line 271
    const-string v7, "getText(...)"

    .line 272
    .line 273
    invoke-static {p1, v7}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    invoke-static {p1}, LBf/k;->V0(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 277
    .line 278
    .line 279
    move-result-object p1

    .line 280
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    goto :goto_6

    .line 284
    :cond_13
    :goto_5
    invoke-interface {v6}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 285
    .line 286
    .line 287
    move-result p1

    .line 288
    if-ne p1, v4, :cond_14

    .line 289
    .line 290
    return-object v2

    .line 291
    :cond_14
    :goto_6
    invoke-interface {v6}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 292
    .line 293
    .line 294
    goto/16 :goto_0

    .line 295
    .line 296
    :cond_15
    :goto_7
    return-object v2

    .line 297
    :cond_16
    new-instance p1, Lorg/xmlpull/v1/XmlPullParserException;

    .line 298
    .line 299
    const-string v0, "iterateCurrentTagEvents call is allowed only for START_TAG event"

    .line 300
    .line 301
    invoke-direct {p1, v0}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    throw p1
.end method
