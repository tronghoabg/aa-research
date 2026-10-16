.class public final synthetic LJ9/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLe/b;
.implements LLe/c;
.implements LLe/d;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LJ9/C;


# direct methods
.method public synthetic constructor <init>(LJ9/C;I)V
    .locals 0

    .line 1
    iput p2, p0, LJ9/w;->a:I

    iput-object p1, p0, LJ9/w;->b:LJ9/C;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Object;)V
    .locals 5

    .line 1
    iget v0, p0, LJ9/w;->a:I

    .line 2
    .line 3
    check-cast p1, Lta/o;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LJ9/w;->b:LJ9/C;

    .line 9
    .line 10
    iget-object v0, v0, LJ9/C;->c:LJ9/f;

    .line 11
    .line 12
    iget-object v1, v0, LJ9/f;->a:LJ9/I;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    new-instance v2, LB8/c;

    .line 18
    .line 19
    const/4 v3, 0x5

    .line 20
    invoke-direct {v2, v3, v1, p1}, LB8/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    new-instance v1, LQe/b;

    .line 24
    .line 25
    const/4 v3, 0x2

    .line 26
    invoke-direct {v1, v2, v3}, LQe/b;-><init>(Ljava/lang/Object;I)V

    .line 27
    .line 28
    .line 29
    new-instance v2, LA5/h;

    .line 30
    .line 31
    const/4 v3, 0x5

    .line 32
    invoke-direct {v2, v3, v0, p1}, LA5/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v2}, LHe/a;->b(LLe/a;)LQe/e;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    new-instance v0, LF5/d;

    .line 40
    .line 41
    const/16 v1, 0x1a

    .line 42
    .line 43
    invoke-direct {v0, v1}, LF5/d;-><init>(I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, v0}, LHe/a;->b(LLe/a;)LQe/e;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    new-instance v0, LF5/d;

    .line 51
    .line 52
    const/16 v1, 0x1b

    .line 53
    .line 54
    invoke-direct {v0, v1}, LF5/d;-><init>(I)V

    .line 55
    .line 56
    .line 57
    sget-object v1, LNe/b;->c:Lx9/d;

    .line 58
    .line 59
    new-instance v2, LQe/e;

    .line 60
    .line 61
    invoke-direct {v2, p1, v0, v1}, LQe/e;-><init>(LHe/a;LLe/b;LLe/a;)V

    .line 62
    .line 63
    .line 64
    new-instance p1, LF5/d;

    .line 65
    .line 66
    const/16 v0, 0x1c

    .line 67
    .line 68
    invoke-direct {p1, v0}, LF5/d;-><init>(I)V

    .line 69
    .line 70
    .line 71
    new-instance v0, LQe/f;

    .line 72
    .line 73
    const/4 v1, 0x0

    .line 74
    invoke-direct {v0, v2, p1, v1}, LQe/f;-><init>(Ljava/lang/Object;LLe/c;I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, LHe/a;->c()LJe/c;

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :pswitch_0
    iget-object v0, p0, LJ9/w;->b:LJ9/C;

    .line 82
    .line 83
    iget-object v0, v0, LJ9/C;->g:LJ9/u;

    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    new-instance v1, Ljava/util/HashSet;

    .line 89
    .line 90
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1}, Lta/o;->e()Lcom/google/protobuf/Internal$ProtobufList;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    if-eqz v2, :cond_1

    .line 106
    .line 107
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    check-cast v2, Lsa/f;

    .line 112
    .line 113
    invoke-virtual {v2}, Lsa/f;->f()I

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    const/4 v4, 0x1

    .line 118
    invoke-static {v3, v4}, LA/f;->b(II)Z

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    if-eqz v3, :cond_0

    .line 123
    .line 124
    invoke-virtual {v2}, Lsa/f;->i()Lsa/h;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    invoke-virtual {v2}, Lsa/h;->c()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    goto :goto_1

    .line 133
    :cond_0
    invoke-virtual {v2}, Lsa/f;->d()Lsa/c;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    invoke-virtual {v2}, Lsa/c;->c()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    :goto_1
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 146
    .line 147
    const-string v2, "Potential impressions to clear: "

    .line 148
    .line 149
    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    invoke-static {p1}, Lic/d;->E(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0}, LJ9/u;->a()LHe/g;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    sget-object v2, LJ9/u;->c:Lta/f;

    .line 171
    .line 172
    const-string v3, "item is null"

    .line 173
    .line 174
    invoke-static {v2, v3}, LNe/b;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    invoke-static {v2}, LHe/g;->a(Ljava/lang/Object;)LHe/g;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    invoke-virtual {p1, v2}, LHe/g;->d(LHe/g;)LHe/g;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    new-instance v2, LA5/h;

    .line 186
    .line 187
    const/16 v3, 0x9

    .line 188
    .line 189
    invoke-direct {v2, v3, v0, v1}, LA5/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    new-instance v0, LQe/f;

    .line 193
    .line 194
    const/4 v1, 0x1

    .line 195
    invoke-direct {v0, p1, v2, v1}, LQe/f;-><init>(Ljava/lang/Object;LLe/c;I)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v0}, LHe/a;->c()LJe/c;

    .line 199
    .line 200
    .line 201
    return-void

    .line 202
    nop

    .line 203
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/16 v1, 0xb

    .line 4
    .line 5
    const/4 v2, 0x5

    .line 6
    const/4 v3, 0x3

    .line 7
    const/4 v4, 0x4

    .line 8
    const/4 v5, 0x2

    .line 9
    const/4 v6, 0x1

    .line 10
    const/4 v7, 0x0

    .line 11
    iget v8, v0, LJ9/w;->a:I

    .line 12
    .line 13
    packed-switch v8, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    move-object/from16 v1, p1

    .line 17
    .line 18
    check-cast v1, Lsa/f;

    .line 19
    .line 20
    iget-object v4, v0, LJ9/w;->b:LJ9/C;

    .line 21
    .line 22
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Lsa/f;->e()Z

    .line 26
    .line 27
    .line 28
    move-result v8

    .line 29
    if-eqz v8, :cond_0

    .line 30
    .line 31
    invoke-static {v1}, LHe/g;->a(Ljava/lang/Object;)LHe/g;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    goto/16 :goto_3

    .line 36
    .line 37
    :cond_0
    iget-object v4, v4, LJ9/C;->g:LJ9/u;

    .line 38
    .line 39
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Lsa/f;->f()I

    .line 43
    .line 44
    .line 45
    move-result v8

    .line 46
    invoke-static {v8, v6}, LA/f;->b(II)Z

    .line 47
    .line 48
    .line 49
    move-result v8

    .line 50
    if-eqz v8, :cond_1

    .line 51
    .line 52
    invoke-virtual {v1}, Lsa/f;->i()Lsa/h;

    .line 53
    .line 54
    .line 55
    move-result-object v8

    .line 56
    invoke-virtual {v8}, Lsa/h;->c()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v8

    .line 60
    goto :goto_0

    .line 61
    :cond_1
    invoke-virtual {v1}, Lsa/f;->d()Lsa/c;

    .line 62
    .line 63
    .line 64
    move-result-object v8

    .line 65
    invoke-virtual {v8}, Lsa/c;->c()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v8

    .line 69
    :goto_0
    invoke-virtual {v4}, LJ9/u;->a()LHe/g;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    new-instance v9, LF5/d;

    .line 74
    .line 75
    const/16 v10, 0x10

    .line 76
    .line 77
    invoke-direct {v9, v10}, LF5/d;-><init>(I)V

    .line 78
    .line 79
    .line 80
    new-instance v10, LSe/j;

    .line 81
    .line 82
    invoke-direct {v10, v4, v9, v6}, LSe/j;-><init>(LHe/g;LLe/c;I)V

    .line 83
    .line 84
    .line 85
    new-instance v4, LF5/d;

    .line 86
    .line 87
    const/16 v9, 0x11

    .line 88
    .line 89
    invoke-direct {v4, v9}, LF5/d;-><init>(I)V

    .line 90
    .line 91
    .line 92
    instance-of v9, v10, LOe/b;

    .line 93
    .line 94
    if-eqz v9, :cond_2

    .line 95
    .line 96
    check-cast v10, LOe/b;

    .line 97
    .line 98
    invoke-interface {v10}, LOe/b;->a()LHe/i;

    .line 99
    .line 100
    .line 101
    move-result-object v9

    .line 102
    goto :goto_1

    .line 103
    :cond_2
    new-instance v9, LSe/u;

    .line 104
    .line 105
    invoke-direct {v9, v10}, LSe/u;-><init>(LHe/g;)V

    .line 106
    .line 107
    .line 108
    :goto_1
    sget v10, LHe/c;->a:I

    .line 109
    .line 110
    const-string v11, "maxConcurrency"

    .line 111
    .line 112
    const v12, 0x7fffffff

    .line 113
    .line 114
    .line 115
    invoke-static {v12, v11}, LNe/b;->b(ILjava/lang/String;)V

    .line 116
    .line 117
    .line 118
    const-string v11, "bufferSize"

    .line 119
    .line 120
    invoke-static {v10, v11}, LNe/b;->b(ILjava/lang/String;)V

    .line 121
    .line 122
    .line 123
    instance-of v11, v9, LOe/f;

    .line 124
    .line 125
    if-eqz v11, :cond_4

    .line 126
    .line 127
    check-cast v9, LOe/f;

    .line 128
    .line 129
    invoke-interface {v9}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v9

    .line 133
    if-nez v9, :cond_3

    .line 134
    .line 135
    sget-object v4, LTe/e;->a:LTe/e;

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_3
    new-instance v10, LTe/p;

    .line 139
    .line 140
    invoke-direct {v10, v9, v4}, LTe/p;-><init>(Ljava/lang/Object;LF5/d;)V

    .line 141
    .line 142
    .line 143
    move-object v4, v10

    .line 144
    goto :goto_2

    .line 145
    :cond_4
    new-instance v11, LTe/i;

    .line 146
    .line 147
    invoke-direct {v11, v9, v4, v10}, LTe/i;-><init>(LHe/i;LF5/d;I)V

    .line 148
    .line 149
    .line 150
    move-object v4, v11

    .line 151
    :goto_2
    new-instance v9, LF5/d;

    .line 152
    .line 153
    const/16 v10, 0x12

    .line 154
    .line 155
    invoke-direct {v9, v10}, LF5/d;-><init>(I)V

    .line 156
    .line 157
    .line 158
    new-instance v10, LTe/c;

    .line 159
    .line 160
    invoke-direct {v10, v4, v9, v3}, LTe/c;-><init>(LHe/i;Ljava/lang/Object;I)V

    .line 161
    .line 162
    .line 163
    const-string v3, "element is null"

    .line 164
    .line 165
    invoke-static {v8, v3}, LNe/b;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    new-instance v3, LNe/a;

    .line 169
    .line 170
    invoke-direct {v3, v8, v7}, LNe/a;-><init>(Ljava/lang/String;Z)V

    .line 171
    .line 172
    .line 173
    new-instance v4, LTe/d;

    .line 174
    .line 175
    invoke-direct {v4, v10, v3}, LTe/d;-><init>(LTe/c;LNe/a;)V

    .line 176
    .line 177
    .line 178
    new-instance v3, LF5/d;

    .line 179
    .line 180
    const/16 v8, 0x1d

    .line 181
    .line 182
    invoke-direct {v3, v8}, LF5/d;-><init>(I)V

    .line 183
    .line 184
    .line 185
    new-instance v8, LUe/a;

    .line 186
    .line 187
    invoke-direct {v8, v4, v3, v7}, LUe/a;-><init>(LHe/n;Ljava/lang/Object;I)V

    .line 188
    .line 189
    .line 190
    new-instance v3, LUe/b;

    .line 191
    .line 192
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 193
    .line 194
    .line 195
    new-instance v4, LA7/h0;

    .line 196
    .line 197
    invoke-direct {v4, v3, v2}, LA7/h0;-><init>(Ljava/lang/Object;I)V

    .line 198
    .line 199
    .line 200
    new-instance v2, LUe/a;

    .line 201
    .line 202
    invoke-direct {v2, v8, v4, v5}, LUe/a;-><init>(LHe/n;Ljava/lang/Object;I)V

    .line 203
    .line 204
    .line 205
    new-instance v3, LJ9/v;

    .line 206
    .line 207
    invoke-direct {v3, v1}, LJ9/v;-><init>(Lsa/f;)V

    .line 208
    .line 209
    .line 210
    new-instance v4, LUe/a;

    .line 211
    .line 212
    invoke-direct {v4, v2, v3, v6}, LUe/a;-><init>(LHe/n;Ljava/lang/Object;I)V

    .line 213
    .line 214
    .line 215
    new-instance v2, LJ9/x;

    .line 216
    .line 217
    invoke-direct {v2, v7}, LJ9/x;-><init>(I)V

    .line 218
    .line 219
    .line 220
    new-instance v3, LSe/h;

    .line 221
    .line 222
    invoke-direct {v3, v7, v4, v2}, LSe/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    new-instance v2, LJ9/v;

    .line 226
    .line 227
    invoke-direct {v2, v1}, LJ9/v;-><init>(Lsa/f;)V

    .line 228
    .line 229
    .line 230
    new-instance v1, LSe/j;

    .line 231
    .line 232
    invoke-direct {v1, v3, v2, v6}, LSe/j;-><init>(LHe/g;LLe/c;I)V

    .line 233
    .line 234
    .line 235
    :goto_3
    return-object v1

    .line 236
    :pswitch_0
    move-object/from16 v10, p1

    .line 237
    .line 238
    check-cast v10, Ljava/lang/String;

    .line 239
    .line 240
    iget-object v9, v0, LJ9/w;->b:LJ9/C;

    .line 241
    .line 242
    iget-object v8, v9, LJ9/C;->c:LJ9/f;

    .line 243
    .line 244
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    new-instance v11, LG8/c;

    .line 248
    .line 249
    invoke-direct {v11, v8, v5}, LG8/c;-><init>(Ljava/lang/Object;I)V

    .line 250
    .line 251
    .line 252
    new-instance v12, LSe/k;

    .line 253
    .line 254
    invoke-direct {v12, v11}, LSe/k;-><init>(Ljava/util/concurrent/Callable;)V

    .line 255
    .line 256
    .line 257
    iget-object v11, v8, LJ9/f;->a:LJ9/I;

    .line 258
    .line 259
    invoke-static {}, Lta/o;->parser()Lcom/google/protobuf/Parser;

    .line 260
    .line 261
    .line 262
    move-result-object v13

    .line 263
    invoke-virtual {v11, v13}, LJ9/I;->a(Lcom/google/protobuf/Parser;)LSe/k;

    .line 264
    .line 265
    .line 266
    move-result-object v11

    .line 267
    new-instance v13, LJ9/e;

    .line 268
    .line 269
    invoke-direct {v13, v8, v7}, LJ9/e;-><init>(LJ9/f;I)V

    .line 270
    .line 271
    .line 272
    new-instance v14, LSe/r;

    .line 273
    .line 274
    sget-object v15, LNe/b;->d:Lya/b;

    .line 275
    .line 276
    invoke-direct {v14, v11, v13, v15}, LSe/r;-><init>(LHe/g;LLe/b;LLe/b;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v12, v14}, LHe/g;->d(LHe/g;)LHe/g;

    .line 280
    .line 281
    .line 282
    move-result-object v11

    .line 283
    new-instance v12, LJ9/e;

    .line 284
    .line 285
    invoke-direct {v12, v8, v6}, LJ9/e;-><init>(LJ9/f;I)V

    .line 286
    .line 287
    .line 288
    new-instance v13, LSe/g;

    .line 289
    .line 290
    invoke-direct {v13, v11, v12, v7}, LSe/g;-><init>(LHe/g;Ljava/lang/Object;I)V

    .line 291
    .line 292
    .line 293
    new-instance v11, LJ9/e;

    .line 294
    .line 295
    invoke-direct {v11, v8, v5}, LJ9/e;-><init>(LJ9/f;I)V

    .line 296
    .line 297
    .line 298
    new-instance v8, LSe/r;

    .line 299
    .line 300
    invoke-direct {v8, v13, v15, v11}, LSe/r;-><init>(LHe/g;LLe/b;LLe/b;)V

    .line 301
    .line 302
    .line 303
    new-instance v11, LJ9/x;

    .line 304
    .line 305
    invoke-direct {v11, v6}, LJ9/x;-><init>(I)V

    .line 306
    .line 307
    .line 308
    new-instance v12, LSe/r;

    .line 309
    .line 310
    invoke-direct {v12, v8, v11, v15}, LSe/r;-><init>(LHe/g;LLe/b;LLe/b;)V

    .line 311
    .line 312
    .line 313
    new-instance v8, LJ9/x;

    .line 314
    .line 315
    invoke-direct {v8, v5}, LJ9/x;-><init>(I)V

    .line 316
    .line 317
    .line 318
    new-instance v11, LSe/r;

    .line 319
    .line 320
    invoke-direct {v11, v12, v15, v8}, LSe/r;-><init>(LHe/g;LLe/b;LLe/b;)V

    .line 321
    .line 322
    .line 323
    sget-object v8, LSe/e;->a:LSe/e;

    .line 324
    .line 325
    new-instance v12, LA7/h0;

    .line 326
    .line 327
    invoke-direct {v12, v8, v2}, LA7/h0;-><init>(Ljava/lang/Object;I)V

    .line 328
    .line 329
    .line 330
    new-instance v14, LSe/j;

    .line 331
    .line 332
    invoke-direct {v14, v11, v12, v5}, LSe/j;-><init>(LHe/g;LLe/c;I)V

    .line 333
    .line 334
    .line 335
    new-instance v8, LJ9/w;

    .line 336
    .line 337
    invoke-direct {v8, v9, v3}, LJ9/w;-><init>(LJ9/C;I)V

    .line 338
    .line 339
    .line 340
    new-instance v11, LJ9/w;

    .line 341
    .line 342
    invoke-direct {v11, v9, v4}, LJ9/w;-><init>(LJ9/C;I)V

    .line 343
    .line 344
    .line 345
    new-instance v12, LJ9/z;

    .line 346
    .line 347
    invoke-direct {v12, v9, v10, v6}, LJ9/z;-><init>(LJ9/C;Ljava/lang/String;I)V

    .line 348
    .line 349
    .line 350
    new-instance v13, LJ9/x;

    .line 351
    .line 352
    invoke-direct {v13, v3}, LJ9/x;-><init>(I)V

    .line 353
    .line 354
    .line 355
    move-object v3, v8

    .line 356
    new-instance v8, LJ9/B;

    .line 357
    .line 358
    invoke-direct/range {v8 .. v13}, LJ9/B;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 359
    .line 360
    .line 361
    iget-object v11, v9, LJ9/C;->g:LJ9/u;

    .line 362
    .line 363
    invoke-virtual {v11}, LJ9/u;->a()LHe/g;

    .line 364
    .line 365
    .line 366
    move-result-object v11

    .line 367
    new-instance v12, LJ9/x;

    .line 368
    .line 369
    invoke-direct {v12, v4}, LJ9/x;-><init>(I)V

    .line 370
    .line 371
    .line 372
    new-instance v13, LSe/r;

    .line 373
    .line 374
    invoke-direct {v13, v11, v15, v12}, LSe/r;-><init>(LHe/g;LLe/b;LLe/b;)V

    .line 375
    .line 376
    .line 377
    invoke-static {}, Lta/f;->d()Lta/f;

    .line 378
    .line 379
    .line 380
    move-result-object v11

    .line 381
    const-string v12, "item is null"

    .line 382
    .line 383
    invoke-static {v11, v12}, LNe/b;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    invoke-static {v11}, LHe/g;->a(Ljava/lang/Object;)LHe/g;

    .line 387
    .line 388
    .line 389
    move-result-object v11

    .line 390
    invoke-virtual {v13, v11}, LHe/g;->d(LHe/g;)LHe/g;

    .line 391
    .line 392
    .line 393
    move-result-object v11

    .line 394
    invoke-static {}, Lta/f;->d()Lta/f;

    .line 395
    .line 396
    .line 397
    move-result-object v12

    .line 398
    invoke-static {v12}, LHe/g;->a(Ljava/lang/Object;)LHe/g;

    .line 399
    .line 400
    .line 401
    move-result-object v12

    .line 402
    new-instance v13, LA7/h0;

    .line 403
    .line 404
    invoke-direct {v13, v12, v2}, LA7/h0;-><init>(Ljava/lang/Object;I)V

    .line 405
    .line 406
    .line 407
    new-instance v2, LSe/j;

    .line 408
    .line 409
    invoke-direct {v2, v11, v13, v5}, LSe/j;-><init>(LHe/g;LLe/c;I)V

    .line 410
    .line 411
    .line 412
    iget-object v11, v9, LJ9/C;->m:LP9/d;

    .line 413
    .line 414
    check-cast v11, LP9/c;

    .line 415
    .line 416
    invoke-virtual {v11}, LP9/c;->d()Lcom/google/android/gms/tasks/Task;

    .line 417
    .line 418
    .line 419
    move-result-object v12

    .line 420
    new-instance v13, LA5/h;

    .line 421
    .line 422
    iget-object v4, v9, LJ9/C;->o:Ljava/util/concurrent/Executor;

    .line 423
    .line 424
    invoke-direct {v13, v1, v12, v4}, LA5/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 425
    .line 426
    .line 427
    new-instance v12, LSe/d;

    .line 428
    .line 429
    invoke-direct {v12, v13, v7}, LSe/d;-><init>(Ljava/lang/Object;I)V

    .line 430
    .line 431
    .line 432
    invoke-virtual {v11}, LP9/c;->e()Lcom/google/android/gms/tasks/Task;

    .line 433
    .line 434
    .line 435
    move-result-object v11

    .line 436
    new-instance v13, LA5/h;

    .line 437
    .line 438
    invoke-direct {v13, v1, v11, v4}, LA5/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 439
    .line 440
    .line 441
    new-instance v1, LSe/d;

    .line 442
    .line 443
    invoke-direct {v1, v13, v7}, LSe/d;-><init>(Ljava/lang/Object;I)V

    .line 444
    .line 445
    .line 446
    new-instance v4, LF5/d;

    .line 447
    .line 448
    const/16 v11, 0x14

    .line 449
    .line 450
    invoke-direct {v4, v11}, LF5/d;-><init>(I)V

    .line 451
    .line 452
    .line 453
    new-instance v11, Lx4/d;

    .line 454
    .line 455
    invoke-direct {v11, v4}, Lx4/d;-><init>(LF5/d;)V

    .line 456
    .line 457
    .line 458
    new-array v4, v5, [LHe/g;

    .line 459
    .line 460
    aput-object v12, v4, v7

    .line 461
    .line 462
    aput-object v1, v4, v6

    .line 463
    .line 464
    new-instance v1, LSe/h;

    .line 465
    .line 466
    invoke-direct {v1, v6, v4, v11}, LSe/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 467
    .line 468
    .line 469
    iget-object v4, v9, LJ9/C;->f:LJ9/X;

    .line 470
    .line 471
    iget-object v4, v4, LJ9/X;->a:LHe/m;

    .line 472
    .line 473
    const-string v5, "scheduler is null"

    .line 474
    .line 475
    invoke-static {v4, v5}, LNe/b;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 476
    .line 477
    .line 478
    new-instance v5, LSe/g;

    .line 479
    .line 480
    invoke-direct {v5, v1, v4, v6}, LSe/g;-><init>(LHe/g;Ljava/lang/Object;I)V

    .line 481
    .line 482
    .line 483
    new-instance v1, LA5/h;

    .line 484
    .line 485
    const/16 v4, 0xa

    .line 486
    .line 487
    invoke-direct {v1, v4, v9, v5}, LA5/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 488
    .line 489
    .line 490
    iget-object v4, v9, LJ9/C;->k:LJ9/Z;

    .line 491
    .line 492
    iget-boolean v5, v4, LJ9/Z;->c:Z

    .line 493
    .line 494
    if-eqz v5, :cond_5

    .line 495
    .line 496
    const-string v5, "ON_FOREGROUND"

    .line 497
    .line 498
    invoke-virtual {v10, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 499
    .line 500
    .line 501
    move-result v5

    .line 502
    goto :goto_4

    .line 503
    :cond_5
    iget-boolean v5, v4, LJ9/Z;->b:Z

    .line 504
    .line 505
    :goto_4
    if-eqz v5, :cond_6

    .line 506
    .line 507
    iget-boolean v3, v4, LJ9/Z;->b:Z

    .line 508
    .line 509
    iget-boolean v4, v4, LJ9/Z;->c:Z

    .line 510
    .line 511
    new-instance v5, Ljava/lang/StringBuilder;

    .line 512
    .line 513
    const-string v6, "Forcing fetch from service rather than cache. Test Device: "

    .line 514
    .line 515
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 516
    .line 517
    .line 518
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 519
    .line 520
    .line 521
    const-string v3, " | App Fresh Install: "

    .line 522
    .line 523
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 524
    .line 525
    .line 526
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 527
    .line 528
    .line 529
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 530
    .line 531
    .line 532
    move-result-object v3

    .line 533
    invoke-static {v3}, Lic/d;->F(Ljava/lang/String;)V

    .line 534
    .line 535
    .line 536
    new-instance v3, LSe/j;

    .line 537
    .line 538
    invoke-direct {v3, v2, v1, v7}, LSe/j;-><init>(LHe/g;LLe/c;I)V

    .line 539
    .line 540
    .line 541
    new-instance v1, LSe/j;

    .line 542
    .line 543
    invoke-direct {v1, v3, v8, v7}, LSe/j;-><init>(LHe/g;LLe/c;I)V

    .line 544
    .line 545
    .line 546
    new-instance v2, LRe/m;

    .line 547
    .line 548
    const/4 v3, 0x4

    .line 549
    invoke-direct {v2, v1, v3}, LRe/m;-><init>(Ljava/lang/Object;I)V

    .line 550
    .line 551
    .line 552
    goto :goto_5

    .line 553
    :cond_6
    const-string v4, "Attempting to fetch campaigns using cache"

    .line 554
    .line 555
    invoke-static {v4}, Lic/d;->E(Ljava/lang/String;)V

    .line 556
    .line 557
    .line 558
    new-instance v4, LSe/j;

    .line 559
    .line 560
    invoke-direct {v4, v2, v1, v7}, LSe/j;-><init>(LHe/g;LLe/c;I)V

    .line 561
    .line 562
    .line 563
    new-instance v1, LSe/r;

    .line 564
    .line 565
    invoke-direct {v1, v4, v3, v15}, LSe/r;-><init>(LHe/g;LLe/b;LLe/b;)V

    .line 566
    .line 567
    .line 568
    invoke-virtual {v14, v1}, LHe/g;->d(LHe/g;)LHe/g;

    .line 569
    .line 570
    .line 571
    move-result-object v1

    .line 572
    new-instance v2, LSe/j;

    .line 573
    .line 574
    invoke-direct {v2, v1, v8, v7}, LSe/j;-><init>(LHe/g;LLe/c;I)V

    .line 575
    .line 576
    .line 577
    new-instance v1, LRe/m;

    .line 578
    .line 579
    const/4 v3, 0x4

    .line 580
    invoke-direct {v1, v2, v3}, LRe/m;-><init>(Ljava/lang/Object;I)V

    .line 581
    .line 582
    .line 583
    move-object v2, v1

    .line 584
    :goto_5
    return-object v2

    .line 585
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public test(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    check-cast p1, Lsa/f;

    .line 2
    .line 3
    iget-object v0, p0, LJ9/w;->b:LJ9/C;

    .line 4
    .line 5
    iget-object v1, v0, LJ9/C;->k:LJ9/Z;

    .line 6
    .line 7
    iget-boolean v1, v1, LJ9/Z;->b:Z

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    if-nez v1, :cond_2

    .line 11
    .line 12
    invoke-virtual {p1}, Lsa/f;->f()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-static {v1, v2}, LA/f;->b(II)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-virtual {p1}, Lsa/f;->i()Lsa/h;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1}, Lsa/h;->e()J

    .line 27
    .line 28
    .line 29
    move-result-wide v3

    .line 30
    invoke-virtual {p1}, Lsa/f;->i()Lsa/h;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p1}, Lsa/h;->b()J

    .line 35
    .line 36
    .line 37
    move-result-wide v5

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-virtual {p1}, Lsa/f;->f()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    const/4 v3, 0x2

    .line 44
    invoke-static {v1, v3}, LA/f;->b(II)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_1

    .line 49
    .line 50
    invoke-virtual {p1}, Lsa/f;->d()Lsa/c;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v1}, Lsa/c;->e()J

    .line 55
    .line 56
    .line 57
    move-result-wide v3

    .line 58
    invoke-virtual {p1}, Lsa/f;->d()Lsa/c;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {p1}, Lsa/c;->b()J

    .line 63
    .line 64
    .line 65
    move-result-wide v5

    .line 66
    :goto_0
    iget-object p1, v0, LJ9/C;->d:LM9/a;

    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 72
    .line 73
    .line 74
    move-result-wide v0

    .line 75
    cmp-long p1, v0, v3

    .line 76
    .line 77
    if-lez p1, :cond_1

    .line 78
    .line 79
    cmp-long p1, v0, v5

    .line 80
    .line 81
    if-gez p1, :cond_1

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_1
    const/4 p1, 0x0

    .line 85
    return p1

    .line 86
    :cond_2
    :goto_1
    return v2
.end method
