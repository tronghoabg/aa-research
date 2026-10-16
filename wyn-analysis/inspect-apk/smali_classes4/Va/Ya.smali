.class public final LVa/Ya;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVa/va;


# instance fields
.field public synthetic a:LVa/Za;


# virtual methods
.method public final a()V
    .locals 7

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    sget v1, LVa/pb;->u:I

    .line 4
    .line 5
    add-int/lit8 v1, v1, 0x13

    .line 6
    .line 7
    rem-int/lit16 v1, v1, 0x80

    .line 8
    .line 9
    sput v1, LVa/pb;->t:I

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    const/16 v2, 0x30

    .line 13
    .line 14
    :try_start_0
    sget-object v3, LVa/pb;->l:Ljava/lang/Class;

    .line 15
    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    sget-object v3, LVa/pb;->m:Ljava/lang/Object;

    .line 19
    .line 20
    if-nez v3, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception v3

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    :goto_0
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    shr-int/lit8 v3, v3, 0x10

    .line 30
    .line 31
    rsub-int/lit8 v3, v3, 0x7f

    .line 32
    .line 33
    const-string v4, "\u0091\u0081\u0097\u0085\u0091\u0096\u0084\u0089\u008d\u0081\u0082\u0081\u008c\u008a\u0085\u0083\u0082\u0086\u008b\u0087\u008a\u0089\u0086\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081"

    .line 34
    .line 35
    invoke-static {v3, v4}, LVa/pb;->W(ILjava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    sput-object v3, LVa/pb;->l:Ljava/lang/Class;

    .line 48
    .line 49
    invoke-static {v0, v2}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    add-int/lit8 v4, v4, 0xc

    .line 54
    .line 55
    const-string v5, "\u0001\u0002\u0003\u0004\u0005\u0000\u0000\u0008\u0001\ny"

    .line 56
    .line 57
    invoke-static {v0, v0, v1}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    add-int/lit8 v6, v6, 0x14

    .line 62
    .line 63
    int-to-byte v6, v6

    .line 64
    invoke-static {v6, v4, v5}, LVa/pb;->A(BILjava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    new-array v5, v1, [Ljava/lang/Class;

    .line 73
    .line 74
    invoke-virtual {v3, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    new-array v4, v1, [Ljava/lang/Object;

    .line 79
    .line 80
    const/4 v5, 0x0

    .line 81
    invoke-virtual {v3, v5, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    sput-object v3, LVa/pb;->m:Ljava/lang/Object;

    .line 86
    .line 87
    :cond_1
    sget-object v3, LVa/pb;->l:Ljava/lang/Class;

    .line 88
    .line 89
    sget-object v4, LVa/pb;->m:Ljava/lang/Object;

    .line 90
    .line 91
    invoke-static {v3, v4}, LVa/pb;->H(Ljava/lang/Class;Ljava/lang/Object;)Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    goto :goto_2

    .line 96
    :goto_1
    invoke-static {v0, v2, v1}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    add-int/lit8 v4, v4, 0xd

    .line 101
    .line 102
    invoke-static {v0, v1}, Landroid/text/TextUtils;->getOffsetAfter(Ljava/lang/CharSequence;I)I

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    add-int/lit8 v5, v5, 0x5d

    .line 107
    .line 108
    int-to-byte v5, v5

    .line 109
    const-string v6, "\n\u0002\n\u000b\u0006\u0011\u0007\u000f\u0000\u000e\u0011\u0002"

    .line 110
    .line 111
    invoke-static {v5, v4, v6}, LVa/pb;->A(BILjava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    new-instance v5, Ljava/lang/StringBuilder;

    .line 120
    .line 121
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 122
    .line 123
    .line 124
    invoke-static {v0}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    rsub-int/lit8 v0, v0, 0x23

    .line 129
    .line 130
    invoke-static {v2}, Landroid/text/AndroidCharacter;->getMirror(C)C

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    add-int/lit8 v2, v2, -0x15

    .line 135
    .line 136
    int-to-byte v2, v2

    .line 137
    const-string v6, "\u0010\t\u000b\u0006\u0010\u0016\u0001\u0002\u008f\u008f\u0010\u0000\u0004\u000c\u000c\r\u0003\n\u0006\u0017\u0012\u0007\u0000\n\u0001\u0002\u0010\u0016\u0012\u000e\u0000\u0013\u0003\u0017;"

    .line 138
    .line 139
    invoke-static {v2, v0, v6}, LVa/pb;->A(BILjava/lang/String;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v3}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-static {v4, v0}, LVa/Ab;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    new-instance v0, Ljava/util/ArrayList;

    .line 165
    .line 166
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 167
    .line 168
    .line 169
    :goto_2
    iget-object v2, p0, LVa/Ya;->a:LVa/Za;

    .line 170
    .line 171
    iget-object v2, v2, LVa/Za;->b:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v2, Ljava/util/ArrayList;

    .line 174
    .line 175
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 176
    .line 177
    .line 178
    iget-object v2, p0, LVa/Ya;->a:LVa/Za;

    .line 179
    .line 180
    iget-object v3, v2, LVa/Za;->b:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast v3, Ljava/util/ArrayList;

    .line 183
    .line 184
    iget-object v2, v2, LVa/Za;->a:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v2, Ljava/util/ArrayList;

    .line 187
    .line 188
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 189
    .line 190
    .line 191
    move v2, v1

    .line 192
    :goto_3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 193
    .line 194
    .line 195
    move-result v3

    .line 196
    if-ge v2, v3, :cond_4

    .line 197
    .line 198
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    check-cast v3, Landroid/view/View;

    .line 203
    .line 204
    iget-object v4, p0, LVa/Ya;->a:LVa/Za;

    .line 205
    .line 206
    iget-object v4, v4, LVa/Za;->b:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v4, Ljava/util/ArrayList;

    .line 209
    .line 210
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    iget-object v4, p0, LVa/Ya;->a:LVa/Za;

    .line 214
    .line 215
    iget-object v4, v4, LVa/Za;->a:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast v4, Ljava/util/ArrayList;

    .line 218
    .line 219
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result v4

    .line 223
    if-nez v4, :cond_3

    .line 224
    .line 225
    iget-object v4, p0, LVa/Ya;->a:LVa/Za;

    .line 226
    .line 227
    iget-object v4, v4, LVa/Za;->a:Ljava/lang/Object;

    .line 228
    .line 229
    check-cast v4, Ljava/util/ArrayList;

    .line 230
    .line 231
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    iget-object v4, p0, LVa/Ya;->a:LVa/Za;

    .line 235
    .line 236
    monitor-enter v4

    .line 237
    :try_start_1
    iget-object v5, v4, LVa/Za;->c:Ljava/lang/Object;

    .line 238
    .line 239
    check-cast v5, Ljava/util/ArrayList;

    .line 240
    .line 241
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 242
    .line 243
    .line 244
    move-result-object v5

    .line 245
    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 246
    .line 247
    .line 248
    move-result v6

    .line 249
    if-eqz v6, :cond_2

    .line 250
    .line 251
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v6

    .line 255
    check-cast v6, LVa/gb;

    .line 256
    .line 257
    invoke-interface {v6, v3}, LVa/gb;->a(Landroid/view/View;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 258
    .line 259
    .line 260
    goto :goto_4

    .line 261
    :catchall_1
    move-exception v0

    .line 262
    goto :goto_5

    .line 263
    :cond_2
    monitor-exit v4

    .line 264
    goto :goto_6

    .line 265
    :goto_5
    :try_start_2
    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 266
    throw v0

    .line 267
    :cond_3
    :goto_6
    add-int/lit8 v2, v2, 0x1

    .line 268
    .line 269
    goto :goto_3

    .line 270
    :cond_4
    :goto_7
    iget-object v0, p0, LVa/Ya;->a:LVa/Za;

    .line 271
    .line 272
    iget-object v0, v0, LVa/Za;->b:Ljava/lang/Object;

    .line 273
    .line 274
    check-cast v0, Ljava/util/ArrayList;

    .line 275
    .line 276
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 277
    .line 278
    .line 279
    move-result v0

    .line 280
    if-ge v1, v0, :cond_5

    .line 281
    .line 282
    iget-object v0, p0, LVa/Ya;->a:LVa/Za;

    .line 283
    .line 284
    iget-object v0, v0, LVa/Za;->b:Ljava/lang/Object;

    .line 285
    .line 286
    check-cast v0, Ljava/util/ArrayList;

    .line 287
    .line 288
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    check-cast v0, Landroid/view/View;

    .line 293
    .line 294
    iget-object v2, p0, LVa/Ya;->a:LVa/Za;

    .line 295
    .line 296
    iget-object v2, v2, LVa/Za;->a:Ljava/lang/Object;

    .line 297
    .line 298
    check-cast v2, Ljava/util/ArrayList;

    .line 299
    .line 300
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    iget-object v2, p0, LVa/Ya;->a:LVa/Za;

    .line 304
    .line 305
    invoke-static {v2, v0}, LVa/Za;->l(LVa/Za;Landroid/view/View;)V

    .line 306
    .line 307
    .line 308
    add-int/lit8 v1, v1, 0x1

    .line 309
    .line 310
    goto :goto_7

    .line 311
    :cond_5
    iget-object v0, p0, LVa/Ya;->a:LVa/Za;

    .line 312
    .line 313
    iget-object v0, v0, LVa/Za;->b:Ljava/lang/Object;

    .line 314
    .line 315
    check-cast v0, Ljava/util/ArrayList;

    .line 316
    .line 317
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 318
    .line 319
    .line 320
    return-void
.end method
