.class public final synthetic Lr9/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr9/l;

.field public final synthetic c:Ljava/util/ArrayList;


# direct methods
.method public synthetic constructor <init>(Lr9/l;Ljava/util/ArrayList;I)V
    .locals 0

    .line 1
    iput p3, p0, Lr9/i;->a:I

    iput-object p1, p0, Lr9/i;->b:Lr9/l;

    iput-object p2, p0, Lr9/i;->c:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lr9/i;->c:Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object v2, v0, Lr9/i;->b:Lr9/l;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    iget v5, v0, Lr9/i;->a:I

    .line 10
    .line 11
    packed-switch v5, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    if-eqz v5, :cond_5

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    check-cast v5, Lr9/m;

    .line 29
    .line 30
    iget v6, v5, Lr9/m;->a:I

    .line 31
    .line 32
    iget-object v7, v5, Lr9/m;->c:Lc9/d;

    .line 33
    .line 34
    iget-object v8, v2, Lr9/l;->h:LY2/B;

    .line 35
    .line 36
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v7}, Lc9/d;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    :goto_1
    move-object v9, v7

    .line 44
    check-cast v9, LA7/v;

    .line 45
    .line 46
    iget-object v10, v9, LA7/v;->b:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v10, Ljava/util/Iterator;

    .line 49
    .line 50
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v10

    .line 54
    if-eqz v10, :cond_0

    .line 55
    .line 56
    invoke-virtual {v9}, LA7/v;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v9

    .line 60
    check-cast v9, Ls9/h;

    .line 61
    .line 62
    new-instance v10, Lr9/c;

    .line 63
    .line 64
    invoke-direct {v10, v9, v6}, Lr9/c;-><init>(Ls9/h;I)V

    .line 65
    .line 66
    .line 67
    iget-object v9, v8, LY2/B;->b:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v9, Lc9/d;

    .line 70
    .line 71
    invoke-virtual {v9, v10}, Lc9/d;->a(Ljava/lang/Object;)Lc9/d;

    .line 72
    .line 73
    .line 74
    move-result-object v9

    .line 75
    iput-object v9, v8, LY2/B;->b:Ljava/lang/Object;

    .line 76
    .line 77
    iget-object v9, v8, LY2/B;->c:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v9, Lc9/d;

    .line 80
    .line 81
    invoke-virtual {v9, v10}, Lc9/d;->a(Ljava/lang/Object;)Lc9/d;

    .line 82
    .line 83
    .line 84
    move-result-object v9

    .line 85
    iput-object v9, v8, LY2/B;->c:Ljava/lang/Object;

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_0
    iget-object v7, v5, Lr9/m;->d:Lc9/d;

    .line 89
    .line 90
    invoke-virtual {v7}, Lc9/d;->iterator()Ljava/util/Iterator;

    .line 91
    .line 92
    .line 93
    move-result-object v9

    .line 94
    :goto_2
    move-object v10, v9

    .line 95
    check-cast v10, LA7/v;

    .line 96
    .line 97
    iget-object v11, v10, LA7/v;->b:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v11, Ljava/util/Iterator;

    .line 100
    .line 101
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 102
    .line 103
    .line 104
    move-result v11

    .line 105
    if-eqz v11, :cond_1

    .line 106
    .line 107
    invoke-virtual {v10}, LA7/v;->next()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v10

    .line 111
    check-cast v10, Ls9/h;

    .line 112
    .line 113
    iget-object v11, v2, Lr9/l;->a:Lp7/b;

    .line 114
    .line 115
    invoke-virtual {v11}, Lp7/b;->D()Lr9/z;

    .line 116
    .line 117
    .line 118
    move-result-object v11

    .line 119
    invoke-interface {v11, v10}, Lr9/z;->g(Ls9/h;)V

    .line 120
    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_1
    invoke-virtual {v7}, Lc9/d;->iterator()Ljava/util/Iterator;

    .line 124
    .line 125
    .line 126
    move-result-object v7

    .line 127
    :goto_3
    move-object v9, v7

    .line 128
    check-cast v9, LA7/v;

    .line 129
    .line 130
    iget-object v10, v9, LA7/v;->b:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v10, Ljava/util/Iterator;

    .line 133
    .line 134
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 135
    .line 136
    .line 137
    move-result v10

    .line 138
    if-eqz v10, :cond_2

    .line 139
    .line 140
    invoke-virtual {v9}, LA7/v;->next()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v9

    .line 144
    check-cast v9, Ls9/h;

    .line 145
    .line 146
    new-instance v10, Lr9/c;

    .line 147
    .line 148
    invoke-direct {v10, v9, v6}, Lr9/c;-><init>(Ls9/h;I)V

    .line 149
    .line 150
    .line 151
    iget-object v9, v8, LY2/B;->b:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v9, Lc9/d;

    .line 154
    .line 155
    invoke-virtual {v9, v10}, Lc9/d;->c(Ljava/lang/Object;)Lc9/d;

    .line 156
    .line 157
    .line 158
    move-result-object v9

    .line 159
    iput-object v9, v8, LY2/B;->b:Ljava/lang/Object;

    .line 160
    .line 161
    iget-object v9, v8, LY2/B;->c:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v9, Lc9/d;

    .line 164
    .line 165
    invoke-virtual {v9, v10}, Lc9/d;->c(Ljava/lang/Object;)Lc9/d;

    .line 166
    .line 167
    .line 168
    move-result-object v9

    .line 169
    iput-object v9, v8, LY2/B;->c:Ljava/lang/Object;

    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_2
    iget-boolean v5, v5, Lr9/m;->b:Z

    .line 173
    .line 174
    if-nez v5, :cond_4

    .line 175
    .line 176
    iget-object v5, v2, Lr9/l;->k:Landroid/util/SparseArray;

    .line 177
    .line 178
    invoke-virtual {v5, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v7

    .line 182
    check-cast v7, Lr9/S;

    .line 183
    .line 184
    if-eqz v7, :cond_3

    .line 185
    .line 186
    move v8, v4

    .line 187
    goto :goto_4

    .line 188
    :cond_3
    move v8, v3

    .line 189
    :goto_4
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 190
    .line 191
    .line 192
    move-result-object v9

    .line 193
    new-array v10, v4, [Ljava/lang/Object;

    .line 194
    .line 195
    aput-object v9, v10, v3

    .line 196
    .line 197
    const-string v9, "Can\'t set limbo-free snapshot version for unknown target: %s"

    .line 198
    .line 199
    invoke-static {v8, v9, v10}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    iget-object v8, v7, Lr9/S;->e:Ls9/o;

    .line 203
    .line 204
    new-instance v11, Lr9/S;

    .line 205
    .line 206
    iget-wide v14, v7, Lr9/S;->c:J

    .line 207
    .line 208
    iget-object v9, v7, Lr9/S;->d:Lr9/y;

    .line 209
    .line 210
    iget-object v12, v7, Lr9/S;->a:Lp9/A;

    .line 211
    .line 212
    iget v13, v7, Lr9/S;->b:I

    .line 213
    .line 214
    iget-object v10, v7, Lr9/S;->g:Lcom/google/protobuf/ByteString;

    .line 215
    .line 216
    iget-object v4, v7, Lr9/S;->h:Ljava/lang/Integer;

    .line 217
    .line 218
    move-object/from16 v18, v8

    .line 219
    .line 220
    move-object/from16 v20, v4

    .line 221
    .line 222
    move-object/from16 v17, v8

    .line 223
    .line 224
    move-object/from16 v16, v9

    .line 225
    .line 226
    move-object/from16 v19, v10

    .line 227
    .line 228
    invoke-direct/range {v11 .. v20}, Lr9/S;-><init>(Lp9/A;IJLr9/y;Ls9/o;Ls9/o;Lcom/google/protobuf/ByteString;Ljava/lang/Integer;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v5, v6, v11}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    const/4 v4, 0x0

    .line 235
    invoke-static {v7, v11, v4}, Lr9/l;->e(Lr9/S;Lr9/S;Lv9/t;)Z

    .line 236
    .line 237
    .line 238
    move-result v4

    .line 239
    if-eqz v4, :cond_4

    .line 240
    .line 241
    iget-object v4, v2, Lr9/l;->i:Lr9/Q;

    .line 242
    .line 243
    invoke-interface {v4, v11}, Lr9/Q;->b(Lr9/S;)V

    .line 244
    .line 245
    .line 246
    :cond_4
    const/4 v4, 0x1

    .line 247
    goto/16 :goto_0

    .line 248
    .line 249
    :cond_5
    return-void

    .line 250
    :pswitch_0
    iget-object v4, v2, Lr9/l;->b:Lr9/f;

    .line 251
    .line 252
    invoke-interface {v4}, Lr9/f;->r()Ljava/util/Collection;

    .line 253
    .line 254
    .line 255
    move-result-object v4

    .line 256
    sget-object v5, Ls9/a;->f:Lq6/d;

    .line 257
    .line 258
    iget-object v6, v2, Lr9/l;->b:Lr9/f;

    .line 259
    .line 260
    invoke-static {v6}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    new-instance v7, Lr9/j;

    .line 264
    .line 265
    invoke-direct {v7, v6, v3}, Lr9/j;-><init>(Lr9/f;I)V

    .line 266
    .line 267
    .line 268
    iget-object v2, v2, Lr9/l;->b:Lr9/f;

    .line 269
    .line 270
    invoke-static {v2}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    new-instance v3, Lr9/j;

    .line 274
    .line 275
    const/4 v6, 0x1

    .line 276
    invoke-direct {v3, v2, v6}, Lr9/j;-><init>(Lr9/f;I)V

    .line 277
    .line 278
    .line 279
    sget-object v2, Lw9/p;->a:Lm9/B;

    .line 280
    .line 281
    new-instance v2, Ljava/util/ArrayList;

    .line 282
    .line 283
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 284
    .line 285
    .line 286
    invoke-static {v2, v5}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 287
    .line 288
    .line 289
    new-instance v4, Ljava/util/ArrayList;

    .line 290
    .line 291
    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 292
    .line 293
    .line 294
    invoke-static {v4, v5}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 302
    .line 303
    .line 304
    move-result-object v2

    .line 305
    invoke-static {v1, v2, v5, v7, v3}, Lw9/p;->f(Ljava/util/Iterator;Ljava/util/Iterator;Ljava/util/Comparator;Lw9/g;Lw9/g;)V

    .line 306
    .line 307
    .line 308
    return-void

    .line 309
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
