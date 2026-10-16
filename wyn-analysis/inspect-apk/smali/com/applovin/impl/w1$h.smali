.class Lcom/applovin/impl/w1$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/applovin/sdk/AppLovinAdClickListener;
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/applovin/impl/w1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "h"
.end annotation


# instance fields
.field final synthetic a:Lcom/applovin/impl/w1;


# direct methods
.method private constructor <init>(Lcom/applovin/impl/w1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/applovin/impl/w1$h;->a:Lcom/applovin/impl/w1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/applovin/impl/w1;Lcom/applovin/impl/w1$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/applovin/impl/w1$h;-><init>(Lcom/applovin/impl/w1;)V

    return-void
.end method

.method private synthetic a()V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/applovin/impl/w1$h;->a:Lcom/applovin/impl/w1;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/applovin/impl/w1;->q:J

    return-void
.end method

.method public static synthetic a(Lcom/applovin/impl/w1$h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/applovin/impl/w1$h;->a()V

    return-void
.end method


# virtual methods
.method public adClicked(Lcom/applovin/sdk/AppLovinAd;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/applovin/impl/w1$h;->a:Lcom/applovin/impl/w1;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/applovin/impl/w1;->c:Lcom/applovin/impl/sdk/o;

    .line 4
    .line 5
    invoke-static {}, Lcom/applovin/impl/sdk/o;->a()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/applovin/impl/w1$h;->a:Lcom/applovin/impl/w1;

    .line 12
    .line 13
    iget-object v0, v0, Lcom/applovin/impl/w1;->c:Lcom/applovin/impl/sdk/o;

    .line 14
    .line 15
    const-string v1, "AppLovinFullscreenActivity"

    .line 16
    .line 17
    const-string v2, "Clicking through graphic"

    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, Lcom/applovin/impl/sdk/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Lcom/applovin/impl/w1$h;->a:Lcom/applovin/impl/w1;

    .line 23
    .line 24
    iget-object v0, v0, Lcom/applovin/impl/w1;->E:Lcom/applovin/sdk/AppLovinAdClickListener;

    .line 25
    .line 26
    invoke-static {v0, p1}, Lcom/applovin/impl/t2;->a(Lcom/applovin/sdk/AppLovinAdClickListener;Lcom/applovin/sdk/AppLovinAd;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lcom/applovin/impl/w1$h;->a:Lcom/applovin/impl/w1;

    .line 30
    .line 31
    iget v0, p1, Lcom/applovin/impl/w1;->z:I

    .line 32
    .line 33
    add-int/lit8 v0, v0, 0x1

    .line 34
    .line 35
    iput v0, p1, Lcom/applovin/impl/w1;->z:I

    .line 36
    .line 37
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/applovin/impl/w1$h;->a:Lcom/applovin/impl/w1;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/applovin/impl/w1;->k:Lcom/applovin/impl/adview/g;

    .line 4
    .line 5
    const-string v2, "AppLovinFullscreenActivity"

    .line 6
    .line 7
    if-ne p1, v1, :cond_6

    .line 8
    .line 9
    iget-object v0, v0, Lcom/applovin/impl/w1;->b:Lcom/applovin/impl/sdk/k;

    .line 10
    .line 11
    sget-object v1, Lcom/applovin/impl/y4;->c2:Lcom/applovin/impl/y4;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lcom/applovin/impl/sdk/k;->a(Lcom/applovin/impl/y4;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_6

    .line 24
    .line 25
    iget-object p1, p0, Lcom/applovin/impl/w1$h;->a:Lcom/applovin/impl/w1;

    .line 26
    .line 27
    invoke-static {p1}, Lcom/applovin/impl/w1;->f(Lcom/applovin/impl/w1;)I

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lcom/applovin/impl/w1$h;->a:Lcom/applovin/impl/w1;

    .line 31
    .line 32
    iget-object p1, p1, Lcom/applovin/impl/w1;->a:Lcom/applovin/impl/sdk/ad/b;

    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/applovin/impl/sdk/ad/b;->O0()Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-eqz p1, :cond_0

    .line 39
    .line 40
    iget-object p1, p0, Lcom/applovin/impl/w1$h;->a:Lcom/applovin/impl/w1;

    .line 41
    .line 42
    new-instance v0, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string v1, "javascript:al_onCloseButtonTapped("

    .line 45
    .line 46
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, Lcom/applovin/impl/w1$h;->a:Lcom/applovin/impl/w1;

    .line 50
    .line 51
    invoke-static {v1}, Lcom/applovin/impl/w1;->e(Lcom/applovin/impl/w1;)I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string v1, ","

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    iget-object v3, p0, Lcom/applovin/impl/w1$h;->a:Lcom/applovin/impl/w1;

    .line 64
    .line 65
    iget v3, v3, Lcom/applovin/impl/w1;->y:I

    .line 66
    .line 67
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    iget-object v1, p0, Lcom/applovin/impl/w1$h;->a:Lcom/applovin/impl/w1;

    .line 74
    .line 75
    iget v1, v1, Lcom/applovin/impl/w1;->z:I

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string v1, ");"

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {p1, v0}, Lcom/applovin/impl/w1;->e(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    :cond_0
    iget-object p1, p0, Lcom/applovin/impl/w1$h;->a:Lcom/applovin/impl/w1;

    .line 93
    .line 94
    iget-object p1, p1, Lcom/applovin/impl/w1;->a:Lcom/applovin/impl/sdk/ad/b;

    .line 95
    .line 96
    invoke-virtual {p1}, Lcom/applovin/impl/sdk/ad/b;->F()Ljava/util/List;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    iget-object v0, p0, Lcom/applovin/impl/w1$h;->a:Lcom/applovin/impl/w1;

    .line 101
    .line 102
    iget-object v0, v0, Lcom/applovin/impl/w1;->c:Lcom/applovin/impl/sdk/o;

    .line 103
    .line 104
    invoke-static {}, Lcom/applovin/impl/sdk/o;->a()Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-eqz v0, :cond_1

    .line 109
    .line 110
    iget-object v0, p0, Lcom/applovin/impl/w1$h;->a:Lcom/applovin/impl/w1;

    .line 111
    .line 112
    iget-object v0, v0, Lcom/applovin/impl/w1;->c:Lcom/applovin/impl/sdk/o;

    .line 113
    .line 114
    new-instance v1, Ljava/lang/StringBuilder;

    .line 115
    .line 116
    const-string v3, "Handling close button tap "

    .line 117
    .line 118
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    iget-object v3, p0, Lcom/applovin/impl/w1$h;->a:Lcom/applovin/impl/w1;

    .line 122
    .line 123
    invoke-static {v3}, Lcom/applovin/impl/w1;->e(Lcom/applovin/impl/w1;)I

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    const-string v3, " with multi close delay: "

    .line 131
    .line 132
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    invoke-virtual {v0, v2, v1}, Lcom/applovin/impl/sdk/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    :cond_1
    if-eqz p1, :cond_5

    .line 146
    .line 147
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    iget-object v1, p0, Lcom/applovin/impl/w1$h;->a:Lcom/applovin/impl/w1;

    .line 152
    .line 153
    invoke-static {v1}, Lcom/applovin/impl/w1;->e(Lcom/applovin/impl/w1;)I

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    if-gt v0, v1, :cond_2

    .line 158
    .line 159
    goto/16 :goto_0

    .line 160
    .line 161
    :cond_2
    iget-object v0, p0, Lcom/applovin/impl/w1$h;->a:Lcom/applovin/impl/w1;

    .line 162
    .line 163
    invoke-static {v0}, Lcom/applovin/impl/w1;->g(Lcom/applovin/impl/w1;)Ljava/util/ArrayList;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 168
    .line 169
    .line 170
    move-result-wide v3

    .line 171
    iget-object v1, p0, Lcom/applovin/impl/w1$h;->a:Lcom/applovin/impl/w1;

    .line 172
    .line 173
    iget-wide v5, v1, Lcom/applovin/impl/w1;->q:J

    .line 174
    .line 175
    sub-long/2addr v3, v5

    .line 176
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    iget-object v0, p0, Lcom/applovin/impl/w1$h;->a:Lcom/applovin/impl/w1;

    .line 184
    .line 185
    iget-object v0, v0, Lcom/applovin/impl/w1;->a:Lcom/applovin/impl/sdk/ad/b;

    .line 186
    .line 187
    invoke-virtual {v0}, Lcom/applovin/impl/sdk/ad/b;->D()Ljava/util/List;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    if-eqz v0, :cond_3

    .line 192
    .line 193
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 194
    .line 195
    .line 196
    move-result v1

    .line 197
    iget-object v3, p0, Lcom/applovin/impl/w1$h;->a:Lcom/applovin/impl/w1;

    .line 198
    .line 199
    invoke-static {v3}, Lcom/applovin/impl/w1;->e(Lcom/applovin/impl/w1;)I

    .line 200
    .line 201
    .line 202
    move-result v3

    .line 203
    if-le v1, v3, :cond_3

    .line 204
    .line 205
    iget-object v1, p0, Lcom/applovin/impl/w1$h;->a:Lcom/applovin/impl/w1;

    .line 206
    .line 207
    iget-object v3, v1, Lcom/applovin/impl/w1;->k:Lcom/applovin/impl/adview/g;

    .line 208
    .line 209
    invoke-static {v1}, Lcom/applovin/impl/w1;->e(Lcom/applovin/impl/w1;)I

    .line 210
    .line 211
    .line 212
    move-result v1

    .line 213
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    check-cast v0, Lcom/applovin/impl/adview/e$a;

    .line 218
    .line 219
    invoke-virtual {v3, v0}, Lcom/applovin/impl/adview/g;->a(Lcom/applovin/impl/adview/e$a;)V

    .line 220
    .line 221
    .line 222
    :cond_3
    iget-object v0, p0, Lcom/applovin/impl/w1$h;->a:Lcom/applovin/impl/w1;

    .line 223
    .line 224
    iget-object v0, v0, Lcom/applovin/impl/w1;->c:Lcom/applovin/impl/sdk/o;

    .line 225
    .line 226
    invoke-static {}, Lcom/applovin/impl/sdk/o;->a()Z

    .line 227
    .line 228
    .line 229
    move-result v0

    .line 230
    if-eqz v0, :cond_4

    .line 231
    .line 232
    iget-object v0, p0, Lcom/applovin/impl/w1$h;->a:Lcom/applovin/impl/w1;

    .line 233
    .line 234
    iget-object v0, v0, Lcom/applovin/impl/w1;->c:Lcom/applovin/impl/sdk/o;

    .line 235
    .line 236
    new-instance v1, Ljava/lang/StringBuilder;

    .line 237
    .line 238
    const-string v3, "Scheduling next close button with delay: "

    .line 239
    .line 240
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    iget-object v3, p0, Lcom/applovin/impl/w1$h;->a:Lcom/applovin/impl/w1;

    .line 244
    .line 245
    invoke-static {v3}, Lcom/applovin/impl/w1;->e(Lcom/applovin/impl/w1;)I

    .line 246
    .line 247
    .line 248
    move-result v3

    .line 249
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v3

    .line 253
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    invoke-virtual {v0, v2, v1}, Lcom/applovin/impl/sdk/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    :cond_4
    iget-object v0, p0, Lcom/applovin/impl/w1$h;->a:Lcom/applovin/impl/w1;

    .line 264
    .line 265
    iget-object v0, v0, Lcom/applovin/impl/w1;->k:Lcom/applovin/impl/adview/g;

    .line 266
    .line 267
    const/16 v1, 0x8

    .line 268
    .line 269
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 270
    .line 271
    .line 272
    iget-object v0, p0, Lcom/applovin/impl/w1$h;->a:Lcom/applovin/impl/w1;

    .line 273
    .line 274
    iget-object v1, v0, Lcom/applovin/impl/w1;->k:Lcom/applovin/impl/adview/g;

    .line 275
    .line 276
    invoke-static {v0}, Lcom/applovin/impl/w1;->e(Lcom/applovin/impl/w1;)I

    .line 277
    .line 278
    .line 279
    move-result v2

    .line 280
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object p1

    .line 284
    check-cast p1, Ljava/lang/Integer;

    .line 285
    .line 286
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 287
    .line 288
    .line 289
    move-result p1

    .line 290
    int-to-long v2, p1

    .line 291
    new-instance p1, Lcom/applovin/impl/D0;

    .line 292
    .line 293
    const/4 v4, 0x2

    .line 294
    invoke-direct {p1, p0, v4}, Lcom/applovin/impl/D0;-><init>(Ljava/lang/Object;I)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v0, v1, v2, v3, p1}, Lcom/applovin/impl/w1;->a(Lcom/applovin/impl/adview/g;JLjava/lang/Runnable;)V

    .line 298
    .line 299
    .line 300
    return-void

    .line 301
    :cond_5
    :goto_0
    iget-object p1, p0, Lcom/applovin/impl/w1$h;->a:Lcom/applovin/impl/w1;

    .line 302
    .line 303
    const-string v0, "native_close_button"

    .line 304
    .line 305
    invoke-virtual {p1, v0}, Lcom/applovin/impl/w1;->a(Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    return-void

    .line 309
    :cond_6
    iget-object v0, p0, Lcom/applovin/impl/w1$h;->a:Lcom/applovin/impl/w1;

    .line 310
    .line 311
    iget-object v0, v0, Lcom/applovin/impl/w1;->c:Lcom/applovin/impl/sdk/o;

    .line 312
    .line 313
    invoke-static {}, Lcom/applovin/impl/sdk/o;->a()Z

    .line 314
    .line 315
    .line 316
    move-result v0

    .line 317
    if-eqz v0, :cond_7

    .line 318
    .line 319
    iget-object v0, p0, Lcom/applovin/impl/w1$h;->a:Lcom/applovin/impl/w1;

    .line 320
    .line 321
    iget-object v0, v0, Lcom/applovin/impl/w1;->c:Lcom/applovin/impl/sdk/o;

    .line 322
    .line 323
    new-instance v1, Ljava/lang/StringBuilder;

    .line 324
    .line 325
    const-string v3, "Unhandled click on widget: "

    .line 326
    .line 327
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 331
    .line 332
    .line 333
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object p1

    .line 337
    invoke-virtual {v0, v2, p1}, Lcom/applovin/impl/sdk/o;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 338
    .line 339
    .line 340
    :cond_7
    return-void
.end method
