.class public final Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;
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

.field public final synthetic f:Lkotlin/jvm/internal/G;

.field public final synthetic g:Lkotlin/jvm/internal/G;

.field public final synthetic h:Lkotlin/jvm/internal/G;

.field public final synthetic i:Lkotlin/jvm/internal/G;

.field public final synthetic j:Ljava/util/ArrayList;

.field public final synthetic k:Ljava/util/ArrayList;

.field public final synthetic l:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Lorg/xmlpull/v1/XmlPullParser;Ljf/c;Lkotlin/jvm/internal/G;Lkotlin/jvm/internal/G;Lkotlin/jvm/internal/G;Lkotlin/jvm/internal/G;Lkotlin/jvm/internal/G;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->d:Lorg/xmlpull/v1/XmlPullParser;

    .line 2
    .line 3
    iput-object p3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->e:Lkotlin/jvm/internal/G;

    .line 4
    .line 5
    iput-object p4, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->f:Lkotlin/jvm/internal/G;

    .line 6
    .line 7
    iput-object p5, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->g:Lkotlin/jvm/internal/G;

    .line 8
    .line 9
    iput-object p6, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->h:Lkotlin/jvm/internal/G;

    .line 10
    .line 11
    iput-object p7, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->i:Lkotlin/jvm/internal/G;

    .line 12
    .line 13
    iput-object p8, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->j:Ljava/util/ArrayList;

    .line 14
    .line 15
    iput-object p9, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->k:Ljava/util/ArrayList;

    .line 16
    .line 17
    iput-object p10, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->l:Ljava/util/ArrayList;

    .line 18
    .line 19
    const/4 p1, 0x2

    .line 20
    invoke-direct {p0, p1, p2}, Llf/j;-><init>(ILjf/c;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 11

    .line 1
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;

    .line 2
    .line 3
    iget-object v9, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->k:Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object v10, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->l:Ljava/util/ArrayList;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->e:Lkotlin/jvm/internal/G;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->f:Lkotlin/jvm/internal/G;

    .line 10
    .line 11
    iget-object v5, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->g:Lkotlin/jvm/internal/G;

    .line 12
    .line 13
    iget-object v6, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->h:Lkotlin/jvm/internal/G;

    .line 14
    .line 15
    iget-object v7, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->i:Lkotlin/jvm/internal/G;

    .line 16
    .line 17
    iget-object v8, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->j:Ljava/util/ArrayList;

    .line 18
    .line 19
    iget-object v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->d:Lorg/xmlpull/v1/XmlPullParser;

    .line 20
    .line 21
    move-object v2, p2

    .line 22
    invoke-direct/range {v0 .. v10}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;-><init>(Lorg/xmlpull/v1/XmlPullParser;Ljf/c;Lkotlin/jvm/internal/G;Lkotlin/jvm/internal/G;Lkotlin/jvm/internal/G;Lkotlin/jvm/internal/G;Lkotlin/jvm/internal/G;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 23
    .line 24
    .line 25
    iput-object p1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->c:Ljava/lang/Object;

    .line 26
    .line 27
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
    invoke-virtual {p0, p1, p2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    iget v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->b:I

    .line 4
    .line 5
    sget-object v2, Lef/C;->a:Lef/C;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x2

    .line 9
    iget-object v5, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->d:Lorg/xmlpull/v1/XmlPullParser;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 17
    .line 18
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1

    .line 22
    :pswitch_0
    iget v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->a:I

    .line 23
    .line 24
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto/16 :goto_9

    .line 28
    .line 29
    :pswitch_1
    iget v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->a:I

    .line 30
    .line 31
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto/16 :goto_5

    .line 35
    .line 36
    :pswitch_2
    iget v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->a:I

    .line 37
    .line 38
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto/16 :goto_1

    .line 42
    .line 43
    :pswitch_3
    iget v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->a:I

    .line 44
    .line 45
    iget-object v6, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->c:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v6, Lkotlin/jvm/internal/G;

    .line 48
    .line 49
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    goto/16 :goto_3

    .line 53
    .line 54
    :pswitch_4
    iget v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->a:I

    .line 55
    .line 56
    iget-object v6, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->c:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v6, Lkotlin/jvm/internal/G;

    .line 59
    .line 60
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    goto/16 :goto_2

    .line 64
    .line 65
    :pswitch_5
    iget v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->a:I

    .line 66
    .line 67
    iget-object v6, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->c:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v6, Lkotlin/jvm/internal/G;

    .line 70
    .line 71
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    goto/16 :goto_6

    .line 75
    .line 76
    :pswitch_6
    iget v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->a:I

    .line 77
    .line 78
    iget-object v6, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->c:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v6, Lkotlin/jvm/internal/G;

    .line 81
    .line 82
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    goto/16 :goto_4

    .line 86
    .line 87
    :pswitch_7
    iget v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->a:I

    .line 88
    .line 89
    iget-object v6, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->c:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v6, Lkotlin/jvm/internal/G;

    .line 92
    .line 93
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    goto/16 :goto_7

    .line 97
    .line 98
    :pswitch_8
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    iget-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->c:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast p1, LEf/E;

    .line 104
    .line 105
    invoke-static {p1}, LEf/H;->o(LEf/E;)V

    .line 106
    .line 107
    .line 108
    invoke-static {v5}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/J0;->i(Lorg/xmlpull/v1/XmlPullParser;)Z

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    if-eqz p1, :cond_0

    .line 113
    .line 114
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->nextTag()I

    .line 115
    .line 116
    .line 117
    :cond_0
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    if-ne p1, v3, :cond_1

    .line 122
    .line 123
    goto/16 :goto_c

    .line 124
    .line 125
    :cond_1
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    if-ne p1, v4, :cond_19

    .line 130
    .line 131
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    .line 132
    .line 133
    .line 134
    move-result p1

    .line 135
    move v1, p1

    .line 136
    :goto_0
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    if-lt p1, v1, :cond_18

    .line 141
    .line 142
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    sub-int/2addr p1, v1

    .line 147
    const/4 v6, 0x3

    .line 148
    const/4 v7, 0x4

    .line 149
    if-eqz p1, :cond_13

    .line 150
    .line 151
    if-eq p1, v3, :cond_2

    .line 152
    .line 153
    goto/16 :goto_b

    .line 154
    .line 155
    :cond_2
    sget-object p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/J0;->a:Lef/p;

    .line 156
    .line 157
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 158
    .line 159
    .line 160
    move-result p1

    .line 161
    if-ne p1, v4, :cond_17

    .line 162
    .line 163
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    if-eqz p1, :cond_17

    .line 168
    .line 169
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 170
    .line 171
    .line 172
    move-result v8

    .line 173
    const/4 v9, 0x0

    .line 174
    sparse-switch v8, :sswitch_data_0

    .line 175
    .line 176
    .line 177
    goto/16 :goto_b

    .line 178
    .line 179
    :sswitch_0
    const-string v6, "Impression"

    .line 180
    .line 181
    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result p1

    .line 185
    if-nez p1, :cond_3

    .line 186
    .line 187
    goto/16 :goto_b

    .line 188
    .line 189
    :cond_3
    iput-object v9, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->c:Ljava/lang/Object;

    .line 190
    .line 191
    iput v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->a:I

    .line 192
    .line 193
    const/4 p1, 0x6

    .line 194
    iput p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->b:I

    .line 195
    .line 196
    invoke-static {v5, p0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/J0;->u(Lorg/xmlpull/v1/XmlPullParser;Llf/c;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    if-ne p1, v0, :cond_4

    .line 201
    .line 202
    goto/16 :goto_8

    .line 203
    .line 204
    :cond_4
    :goto_1
    check-cast p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/s;

    .line 205
    .line 206
    if-eqz p1, :cond_17

    .line 207
    .line 208
    iget-object v6, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->j:Ljava/util/ArrayList;

    .line 209
    .line 210
    invoke-virtual {v6, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    goto/16 :goto_b

    .line 214
    .line 215
    :sswitch_1
    const-string v6, "Advertiser"

    .line 216
    .line 217
    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result p1

    .line 221
    if-nez p1, :cond_5

    .line 222
    .line 223
    goto/16 :goto_b

    .line 224
    .line 225
    :cond_5
    iget-object v6, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->h:Lkotlin/jvm/internal/G;

    .line 226
    .line 227
    iput-object v6, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->c:Ljava/lang/Object;

    .line 228
    .line 229
    iput v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->a:I

    .line 230
    .line 231
    iput v7, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->b:I

    .line 232
    .line 233
    invoke-static {v5, p0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/J0;->a(Lorg/xmlpull/v1/XmlPullParser;Ljf/c;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    if-ne p1, v0, :cond_6

    .line 238
    .line 239
    goto/16 :goto_8

    .line 240
    .line 241
    :cond_6
    :goto_2
    iput-object p1, v6, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 242
    .line 243
    goto/16 :goto_b

    .line 244
    .line 245
    :sswitch_2
    const-string v6, "Pricing"

    .line 246
    .line 247
    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    move-result p1

    .line 251
    if-nez p1, :cond_7

    .line 252
    .line 253
    goto/16 :goto_b

    .line 254
    .line 255
    :cond_7
    iget-object v6, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->i:Lkotlin/jvm/internal/G;

    .line 256
    .line 257
    iput-object v6, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->c:Ljava/lang/Object;

    .line 258
    .line 259
    iput v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->a:I

    .line 260
    .line 261
    const/4 p1, 0x5

    .line 262
    iput p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->b:I

    .line 263
    .line 264
    invoke-static {v5, p0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/J0;->y(Lorg/xmlpull/v1/XmlPullParser;Llf/c;)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object p1

    .line 268
    if-ne p1, v0, :cond_8

    .line 269
    .line 270
    goto/16 :goto_8

    .line 271
    .line 272
    :cond_8
    :goto_3
    iput-object p1, v6, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 273
    .line 274
    goto/16 :goto_b

    .line 275
    .line 276
    :sswitch_3
    const-string v6, "AdTitle"

    .line 277
    .line 278
    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    move-result p1

    .line 282
    if-nez p1, :cond_9

    .line 283
    .line 284
    goto/16 :goto_b

    .line 285
    .line 286
    :cond_9
    iget-object v6, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->f:Lkotlin/jvm/internal/G;

    .line 287
    .line 288
    iput-object v6, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->c:Ljava/lang/Object;

    .line 289
    .line 290
    iput v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->a:I

    .line 291
    .line 292
    iput v4, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->b:I

    .line 293
    .line 294
    invoke-static {v5, p0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/J0;->a(Lorg/xmlpull/v1/XmlPullParser;Ljf/c;)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object p1

    .line 298
    if-ne p1, v0, :cond_a

    .line 299
    .line 300
    goto/16 :goto_8

    .line 301
    .line 302
    :cond_a
    :goto_4
    iput-object p1, v6, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 303
    .line 304
    goto/16 :goto_b

    .line 305
    .line 306
    :sswitch_4
    const-string v6, "Error"

    .line 307
    .line 308
    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    move-result p1

    .line 312
    if-nez p1, :cond_b

    .line 313
    .line 314
    goto/16 :goto_b

    .line 315
    .line 316
    :cond_b
    iput-object v9, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->c:Ljava/lang/Object;

    .line 317
    .line 318
    iput v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->a:I

    .line 319
    .line 320
    const/4 p1, 0x7

    .line 321
    iput p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->b:I

    .line 322
    .line 323
    invoke-static {v5, p0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/J0;->a(Lorg/xmlpull/v1/XmlPullParser;Ljf/c;)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object p1

    .line 327
    if-ne p1, v0, :cond_c

    .line 328
    .line 329
    goto :goto_8

    .line 330
    :cond_c
    :goto_5
    check-cast p1, Ljava/lang/String;

    .line 331
    .line 332
    if-eqz p1, :cond_17

    .line 333
    .line 334
    iget-object v6, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->k:Ljava/util/ArrayList;

    .line 335
    .line 336
    invoke-virtual {v6, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 337
    .line 338
    .line 339
    goto/16 :goto_b

    .line 340
    .line 341
    :sswitch_5
    const-string v7, "Description"

    .line 342
    .line 343
    invoke-virtual {p1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 344
    .line 345
    .line 346
    move-result p1

    .line 347
    if-nez p1, :cond_d

    .line 348
    .line 349
    goto/16 :goto_b

    .line 350
    .line 351
    :cond_d
    iget-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->g:Lkotlin/jvm/internal/G;

    .line 352
    .line 353
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->c:Ljava/lang/Object;

    .line 354
    .line 355
    iput v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->a:I

    .line 356
    .line 357
    iput v6, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->b:I

    .line 358
    .line 359
    invoke-static {v5, p0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/J0;->a(Lorg/xmlpull/v1/XmlPullParser;Ljf/c;)Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v6

    .line 363
    if-ne v6, v0, :cond_e

    .line 364
    .line 365
    goto :goto_8

    .line 366
    :cond_e
    move-object v10, v6

    .line 367
    move-object v6, p1

    .line 368
    move-object p1, v10

    .line 369
    :goto_6
    iput-object p1, v6, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 370
    .line 371
    goto/16 :goto_b

    .line 372
    .line 373
    :sswitch_6
    const-string v6, "AdSystem"

    .line 374
    .line 375
    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 376
    .line 377
    .line 378
    move-result p1

    .line 379
    if-nez p1, :cond_f

    .line 380
    .line 381
    goto :goto_b

    .line 382
    :cond_f
    iget-object v6, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->e:Lkotlin/jvm/internal/G;

    .line 383
    .line 384
    iput-object v6, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->c:Ljava/lang/Object;

    .line 385
    .line 386
    iput v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->a:I

    .line 387
    .line 388
    iput v3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->b:I

    .line 389
    .line 390
    invoke-static {v5, p0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/J0;->d(Lorg/xmlpull/v1/XmlPullParser;Llf/c;)Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    move-result-object p1

    .line 394
    if-ne p1, v0, :cond_10

    .line 395
    .line 396
    goto :goto_8

    .line 397
    :cond_10
    :goto_7
    iput-object p1, v6, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 398
    .line 399
    goto :goto_b

    .line 400
    :sswitch_7
    const-string v6, "Creatives"

    .line 401
    .line 402
    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 403
    .line 404
    .line 405
    move-result p1

    .line 406
    if-nez p1, :cond_11

    .line 407
    .line 408
    goto :goto_b

    .line 409
    :cond_11
    iput-object v9, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->c:Ljava/lang/Object;

    .line 410
    .line 411
    iput v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->a:I

    .line 412
    .line 413
    const/16 p1, 0x8

    .line 414
    .line 415
    iput p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->b:I

    .line 416
    .line 417
    invoke-static {v5, v3, p0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/J0;->e(Lorg/xmlpull/v1/XmlPullParser;ZLlf/c;)Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object p1

    .line 421
    if-ne p1, v0, :cond_12

    .line 422
    .line 423
    :goto_8
    return-object v0

    .line 424
    :cond_12
    :goto_9
    check-cast p1, Ljava/util/List;

    .line 425
    .line 426
    iget-object v6, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I0;->l:Ljava/util/ArrayList;

    .line 427
    .line 428
    invoke-virtual {v6, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 429
    .line 430
    .line 431
    goto :goto_b

    .line 432
    :cond_13
    sget-object p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/J0;->a:Lef/p;

    .line 433
    .line 434
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 435
    .line 436
    .line 437
    move-result p1

    .line 438
    if-ne p1, v4, :cond_14

    .line 439
    .line 440
    goto :goto_b

    .line 441
    :cond_14
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 442
    .line 443
    .line 444
    move-result p1

    .line 445
    if-ne p1, v7, :cond_16

    .line 446
    .line 447
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    .line 448
    .line 449
    .line 450
    move-result-object p1

    .line 451
    if-eqz p1, :cond_16

    .line 452
    .line 453
    invoke-static {p1}, LBf/k;->y0(Ljava/lang/CharSequence;)Z

    .line 454
    .line 455
    .line 456
    move-result p1

    .line 457
    if-eqz p1, :cond_15

    .line 458
    .line 459
    goto :goto_a

    .line 460
    :cond_15
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    .line 461
    .line 462
    .line 463
    move-result-object p1

    .line 464
    const-string v6, "getText(...)"

    .line 465
    .line 466
    invoke-static {p1, v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 467
    .line 468
    .line 469
    invoke-static {p1}, LBf/k;->V0(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 470
    .line 471
    .line 472
    move-result-object p1

    .line 473
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 474
    .line 475
    .line 476
    goto :goto_b

    .line 477
    :cond_16
    :goto_a
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 478
    .line 479
    .line 480
    move-result p1

    .line 481
    if-ne p1, v6, :cond_17

    .line 482
    .line 483
    return-object v2

    .line 484
    :cond_17
    :goto_b
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 485
    .line 486
    .line 487
    goto/16 :goto_0

    .line 488
    .line 489
    :cond_18
    :goto_c
    return-object v2

    .line 490
    :cond_19
    new-instance p1, Lorg/xmlpull/v1/XmlPullParserException;

    .line 491
    .line 492
    const-string v0, "iterateCurrentTagEvents call is allowed only for START_TAG event"

    .line 493
    .line 494
    invoke-direct {p1, v0}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 495
    .line 496
    .line 497
    throw p1

    .line 498
    nop

    .line 499
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    :sswitch_data_0
    .sparse-switch
        -0x64e1597c -> :sswitch_7
        -0x616317ae -> :sswitch_6
        -0x360d424 -> :sswitch_5
        0x401e1e8 -> :sswitch_4
        0x1deadbd5 -> :sswitch_3
        0x507137a6 -> :sswitch_2
        0x7b1db94b -> :sswitch_1
        0x7e026e29 -> :sswitch_0
    .end sparse-switch
.end method
