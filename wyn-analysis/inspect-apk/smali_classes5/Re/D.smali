.class public final LRe/D;
.super LYe/b;
.source "SourceFile"


# instance fields
.field public final a:[Ljava/lang/Object;

.field public b:I

.field public volatile c:Z

.field public final synthetic d:I

.field public final e:LHe/f;


# direct methods
.method public constructor <init>(LHe/f;[Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, LRe/D;->d:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, LRe/D;->a:[Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p1, p0, LRe/D;->e:LHe/f;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final c(I)I
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
.end method

.method public final cancel()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LRe/D;->c:Z

    .line 3
    .line 4
    return-void
.end method

.method public final clear()V
    .locals 1

    .line 1
    iget-object v0, p0, LRe/D;->a:[Ljava/lang/Object;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    iput v0, p0, LRe/D;->b:I

    .line 5
    .line 6
    return-void
.end method

.method public final isEmpty()Z
    .locals 2

    .line 1
    iget v0, p0, LRe/D;->b:I

    .line 2
    .line 3
    iget-object v1, p0, LRe/D;->a:[Ljava/lang/Object;

    .line 4
    .line 5
    array-length v1, v1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public final poll()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, LRe/D;->b:I

    .line 2
    .line 3
    iget-object v1, p0, LRe/D;->a:[Ljava/lang/Object;

    .line 4
    .line 5
    array-length v2, v1

    .line 6
    if-ne v0, v2, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    return-object v0

    .line 10
    :cond_0
    add-int/lit8 v2, v0, 0x1

    .line 11
    .line 12
    iput v2, p0, LRe/D;->b:I

    .line 13
    .line 14
    aget-object v0, v1, v0

    .line 15
    .line 16
    const-string v1, "array element is null"

    .line 17
    .line 18
    invoke-static {v0, v1}, LNe/b;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public final request(J)V
    .locals 10

    .line 1
    invoke-static {p1, p2}, LYe/f;->c(J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_16

    .line 6
    .line 7
    invoke-static {p0, p1, p2}, LFe/e;->f(Ljava/util/concurrent/atomic/AtomicLong;J)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    const-wide/16 v2, 0x0

    .line 12
    .line 13
    cmp-long v0, v0, v2

    .line 14
    .line 15
    if-nez v0, :cond_16

    .line 16
    .line 17
    const-wide v0, 0x7fffffffffffffffL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    cmp-long v0, p1, v0

    .line 23
    .line 24
    if-nez v0, :cond_8

    .line 25
    .line 26
    iget p1, p0, LRe/D;->d:I

    .line 27
    .line 28
    packed-switch p1, :pswitch_data_0

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, LRe/D;->a:[Ljava/lang/Object;

    .line 32
    .line 33
    array-length p2, p1

    .line 34
    iget-object v0, p0, LRe/D;->e:LHe/f;

    .line 35
    .line 36
    iget v1, p0, LRe/D;->b:I

    .line 37
    .line 38
    :goto_0
    if-eq v1, p2, :cond_2

    .line 39
    .line 40
    iget-boolean v2, p0, LRe/D;->c:Z

    .line 41
    .line 42
    if-eqz v2, :cond_0

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_0
    aget-object v2, p1, v1

    .line 46
    .line 47
    if-nez v2, :cond_1

    .line 48
    .line 49
    new-instance p1, Ljava/lang/NullPointerException;

    .line 50
    .line 51
    const-string p2, "array element is null"

    .line 52
    .line 53
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-interface {v0, p1}, LHe/f;->onError(Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_1
    invoke-interface {v0, v2}, LHe/f;->b(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    add-int/lit8 v1, v1, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    iget-boolean p1, p0, LRe/D;->c:Z

    .line 67
    .line 68
    if-eqz p1, :cond_3

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_3
    invoke-interface {v0}, LHe/f;->onComplete()V

    .line 72
    .line 73
    .line 74
    goto :goto_2

    .line 75
    :pswitch_0
    iget-object p1, p0, LRe/D;->a:[Ljava/lang/Object;

    .line 76
    .line 77
    array-length p2, p1

    .line 78
    iget-object v0, p0, LRe/D;->e:LHe/f;

    .line 79
    .line 80
    check-cast v0, LOe/a;

    .line 81
    .line 82
    iget v1, p0, LRe/D;->b:I

    .line 83
    .line 84
    :goto_1
    if-eq v1, p2, :cond_6

    .line 85
    .line 86
    iget-boolean v2, p0, LRe/D;->c:Z

    .line 87
    .line 88
    if-eqz v2, :cond_4

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_4
    aget-object v2, p1, v1

    .line 92
    .line 93
    if-nez v2, :cond_5

    .line 94
    .line 95
    new-instance p1, Ljava/lang/NullPointerException;

    .line 96
    .line 97
    const-string p2, "array element is null"

    .line 98
    .line 99
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-interface {v0, p1}, LHe/f;->onError(Ljava/lang/Throwable;)V

    .line 103
    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_5
    invoke-interface {v0, v2}, LOe/a;->d(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    add-int/lit8 v1, v1, 0x1

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_6
    iget-boolean p1, p0, LRe/D;->c:Z

    .line 113
    .line 114
    if-eqz p1, :cond_7

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_7
    invoke-interface {v0}, LHe/f;->onComplete()V

    .line 118
    .line 119
    .line 120
    :goto_2
    return-void

    .line 121
    :cond_8
    iget v0, p0, LRe/D;->d:I

    .line 122
    .line 123
    packed-switch v0, :pswitch_data_1

    .line 124
    .line 125
    .line 126
    iget-object v0, p0, LRe/D;->a:[Ljava/lang/Object;

    .line 127
    .line 128
    array-length v1, v0

    .line 129
    iget v2, p0, LRe/D;->b:I

    .line 130
    .line 131
    iget-object v3, p0, LRe/D;->e:LHe/f;

    .line 132
    .line 133
    const-wide/16 v4, 0x0

    .line 134
    .line 135
    :cond_9
    move-wide v6, v4

    .line 136
    :cond_a
    :goto_3
    cmp-long v8, v6, p1

    .line 137
    .line 138
    if-eqz v8, :cond_d

    .line 139
    .line 140
    if-eq v2, v1, :cond_d

    .line 141
    .line 142
    iget-boolean v8, p0, LRe/D;->c:Z

    .line 143
    .line 144
    if-eqz v8, :cond_b

    .line 145
    .line 146
    goto/16 :goto_5

    .line 147
    .line 148
    :cond_b
    aget-object v8, v0, v2

    .line 149
    .line 150
    if-nez v8, :cond_c

    .line 151
    .line 152
    new-instance p1, Ljava/lang/NullPointerException;

    .line 153
    .line 154
    const-string p2, "array element is null"

    .line 155
    .line 156
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    invoke-interface {v3, p1}, LHe/f;->onError(Ljava/lang/Throwable;)V

    .line 160
    .line 161
    .line 162
    goto/16 :goto_5

    .line 163
    .line 164
    :cond_c
    invoke-interface {v3, v8}, LHe/f;->b(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    const-wide/16 v8, 0x1

    .line 168
    .line 169
    add-long/2addr v6, v8

    .line 170
    add-int/lit8 v2, v2, 0x1

    .line 171
    .line 172
    goto :goto_3

    .line 173
    :cond_d
    if-ne v2, v1, :cond_e

    .line 174
    .line 175
    iget-boolean p1, p0, LRe/D;->c:Z

    .line 176
    .line 177
    if-nez p1, :cond_16

    .line 178
    .line 179
    invoke-interface {v3}, LHe/f;->onComplete()V

    .line 180
    .line 181
    .line 182
    goto :goto_5

    .line 183
    :cond_e
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 184
    .line 185
    .line 186
    move-result-wide p1

    .line 187
    cmp-long v8, v6, p1

    .line 188
    .line 189
    if-nez v8, :cond_a

    .line 190
    .line 191
    iput v2, p0, LRe/D;->b:I

    .line 192
    .line 193
    neg-long p1, v6

    .line 194
    invoke-virtual {p0, p1, p2}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    .line 195
    .line 196
    .line 197
    move-result-wide p1

    .line 198
    cmp-long v6, p1, v4

    .line 199
    .line 200
    if-nez v6, :cond_9

    .line 201
    .line 202
    goto :goto_5

    .line 203
    :pswitch_1
    iget-object v0, p0, LRe/D;->a:[Ljava/lang/Object;

    .line 204
    .line 205
    array-length v1, v0

    .line 206
    iget v2, p0, LRe/D;->b:I

    .line 207
    .line 208
    iget-object v3, p0, LRe/D;->e:LHe/f;

    .line 209
    .line 210
    check-cast v3, LOe/a;

    .line 211
    .line 212
    const-wide/16 v4, 0x0

    .line 213
    .line 214
    :cond_f
    move-wide v6, v4

    .line 215
    :cond_10
    :goto_4
    cmp-long v8, v6, p1

    .line 216
    .line 217
    if-eqz v8, :cond_14

    .line 218
    .line 219
    if-eq v2, v1, :cond_14

    .line 220
    .line 221
    iget-boolean v8, p0, LRe/D;->c:Z

    .line 222
    .line 223
    if-eqz v8, :cond_11

    .line 224
    .line 225
    goto :goto_5

    .line 226
    :cond_11
    aget-object v8, v0, v2

    .line 227
    .line 228
    if-nez v8, :cond_12

    .line 229
    .line 230
    new-instance p1, Ljava/lang/NullPointerException;

    .line 231
    .line 232
    const-string p2, "array element is null"

    .line 233
    .line 234
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    invoke-interface {v3, p1}, LHe/f;->onError(Ljava/lang/Throwable;)V

    .line 238
    .line 239
    .line 240
    goto :goto_5

    .line 241
    :cond_12
    invoke-interface {v3, v8}, LOe/a;->d(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    move-result v8

    .line 245
    if-eqz v8, :cond_13

    .line 246
    .line 247
    const-wide/16 v8, 0x1

    .line 248
    .line 249
    add-long/2addr v6, v8

    .line 250
    :cond_13
    add-int/lit8 v2, v2, 0x1

    .line 251
    .line 252
    goto :goto_4

    .line 253
    :cond_14
    if-ne v2, v1, :cond_15

    .line 254
    .line 255
    iget-boolean p1, p0, LRe/D;->c:Z

    .line 256
    .line 257
    if-nez p1, :cond_16

    .line 258
    .line 259
    invoke-interface {v3}, LHe/f;->onComplete()V

    .line 260
    .line 261
    .line 262
    goto :goto_5

    .line 263
    :cond_15
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 264
    .line 265
    .line 266
    move-result-wide p1

    .line 267
    cmp-long v8, v6, p1

    .line 268
    .line 269
    if-nez v8, :cond_10

    .line 270
    .line 271
    iput v2, p0, LRe/D;->b:I

    .line 272
    .line 273
    neg-long p1, v6

    .line 274
    invoke-virtual {p0, p1, p2}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    .line 275
    .line 276
    .line 277
    move-result-wide p1

    .line 278
    cmp-long v6, p1, v4

    .line 279
    .line 280
    if-nez v6, :cond_f

    .line 281
    .line 282
    :cond_16
    :goto_5
    return-void

    .line 283
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch
.end method
