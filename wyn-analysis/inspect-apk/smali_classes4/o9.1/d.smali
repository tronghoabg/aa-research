.class public final Lo9/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lo9/a;

.field public final b:Lo9/e;

.field public final c:Ljava/util/ArrayList;

.field public final d:Ljava/util/HashMap;

.field public e:Lc9/c;

.field public f:J

.field public g:Lo9/h;


# direct methods
.method public constructor <init>(Lo9/a;Lo9/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lo9/d;->a:Lo9/a;

    .line 5
    .line 6
    iput-object p2, p0, Lo9/d;->b:Lo9/e;

    .line 7
    .line 8
    new-instance p1, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lo9/d;->c:Ljava/util/ArrayList;

    .line 14
    .line 15
    sget-object p1, Ls9/g;->a:Lc9/b;

    .line 16
    .line 17
    iput-object p1, p0, Lo9/d;->e:Lc9/c;

    .line 18
    .line 19
    new-instance p1, Ljava/util/HashMap;

    .line 20
    .line 21
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lo9/d;->d:Ljava/util/HashMap;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final a(Lo9/c;J)Lm9/O;
    .locals 12

    .line 1
    instance-of v0, p1, Lo9/e;

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    new-array v1, v1, [Ljava/lang/Object;

    .line 7
    .line 8
    const-string v2, "Unexpected bundle metadata element."

    .line 9
    .line 10
    invoke-static {v0, v2, v1}, LFe/c;->k(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lo9/d;->e:Lc9/c;

    .line 14
    .line 15
    invoke-virtual {v0}, Lc9/c;->size()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    instance-of v1, p1, Lo9/j;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    iget-object v1, p0, Lo9/d;->c:Ljava/util/ArrayList;

    .line 25
    .line 26
    check-cast p1, Lo9/j;

    .line 27
    .line 28
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    instance-of v1, p1, Lo9/h;

    .line 33
    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    check-cast p1, Lo9/h;

    .line 37
    .line 38
    iget-object v1, p0, Lo9/d;->d:Ljava/util/HashMap;

    .line 39
    .line 40
    iget-object v3, p1, Lo9/h;->a:Ls9/h;

    .line 41
    .line 42
    invoke-virtual {v1, v3, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, Lo9/d;->g:Lo9/h;

    .line 46
    .line 47
    iget-boolean v1, p1, Lo9/h;->c:Z

    .line 48
    .line 49
    if-nez v1, :cond_3

    .line 50
    .line 51
    iget-object v1, p0, Lo9/d;->e:Lc9/c;

    .line 52
    .line 53
    iget-object p1, p1, Lo9/h;->b:Ls9/o;

    .line 54
    .line 55
    invoke-static {v3, p1}, Ls9/k;->h(Ls9/h;Ls9/o;)Ls9/k;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    iput-object p1, v4, Ls9/k;->d:Ls9/o;

    .line 60
    .line 61
    invoke-virtual {v1, v3, v4}, Lc9/c;->g(Ljava/lang/Object;Ljava/lang/Object;)Lc9/c;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    iput-object p1, p0, Lo9/d;->e:Lc9/c;

    .line 66
    .line 67
    iput-object v2, p0, Lo9/d;->g:Lo9/h;

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    instance-of v1, p1, Lo9/b;

    .line 71
    .line 72
    if-eqz v1, :cond_3

    .line 73
    .line 74
    check-cast p1, Lo9/b;

    .line 75
    .line 76
    iget-object v1, p0, Lo9/d;->g:Lo9/h;

    .line 77
    .line 78
    if-eqz v1, :cond_2

    .line 79
    .line 80
    iget-object v3, p1, Lo9/b;->a:Ls9/k;

    .line 81
    .line 82
    iget-object v1, v1, Lo9/h;->a:Ls9/h;

    .line 83
    .line 84
    iget-object v3, v3, Ls9/k;->a:Ls9/h;

    .line 85
    .line 86
    invoke-virtual {v3, v1}, Ls9/h;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-eqz v1, :cond_2

    .line 91
    .line 92
    iget-object v1, p0, Lo9/d;->e:Lc9/c;

    .line 93
    .line 94
    iget-object p1, p1, Lo9/b;->a:Ls9/k;

    .line 95
    .line 96
    iget-object v3, p0, Lo9/d;->g:Lo9/h;

    .line 97
    .line 98
    iget-object v3, v3, Lo9/h;->b:Ls9/o;

    .line 99
    .line 100
    iput-object v3, p1, Ls9/k;->d:Ls9/o;

    .line 101
    .line 102
    iget-object v3, p1, Ls9/k;->a:Ls9/h;

    .line 103
    .line 104
    invoke-virtual {v1, v3, p1}, Lc9/c;->g(Ljava/lang/Object;Ljava/lang/Object;)Lc9/c;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    iput-object p1, p0, Lo9/d;->e:Lc9/c;

    .line 109
    .line 110
    iput-object v2, p0, Lo9/d;->g:Lo9/h;

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 114
    .line 115
    const-string p2, "The document being added does not match the stored metadata."

    .line 116
    .line 117
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    throw p1

    .line 121
    :cond_3
    :goto_0
    iget-wide v3, p0, Lo9/d;->f:J

    .line 122
    .line 123
    add-long/2addr v3, p2

    .line 124
    iput-wide v3, p0, Lo9/d;->f:J

    .line 125
    .line 126
    iget-object p1, p0, Lo9/d;->e:Lc9/c;

    .line 127
    .line 128
    invoke-virtual {p1}, Lc9/c;->size()I

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    if-eq v0, p1, :cond_4

    .line 133
    .line 134
    new-instance v3, Lm9/O;

    .line 135
    .line 136
    iget-object p1, p0, Lo9/d;->e:Lc9/c;

    .line 137
    .line 138
    invoke-virtual {p1}, Lc9/c;->size()I

    .line 139
    .line 140
    .line 141
    move-result v4

    .line 142
    iget-object p1, p0, Lo9/d;->b:Lo9/e;

    .line 143
    .line 144
    iget-wide v6, p0, Lo9/d;->f:J

    .line 145
    .line 146
    const/4 v11, 0x2

    .line 147
    const/4 v10, 0x0

    .line 148
    iget v5, p1, Lo9/e;->d:I

    .line 149
    .line 150
    iget-wide v8, p1, Lo9/e;->e:J

    .line 151
    .line 152
    invoke-direct/range {v3 .. v11}, Lm9/O;-><init>(IIJJLm9/G;I)V

    .line 153
    .line 154
    .line 155
    return-object v3

    .line 156
    :cond_4
    return-object v2
.end method

.method public final b()Lc9/c;
    .locals 12

    .line 1
    iget-object v0, p0, Lo9/d;->g:Lo9/h;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    move v0, v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v2

    .line 10
    :goto_0
    const-string v3, "Bundled documents end with a document metadata element instead of a document."

    .line 11
    .line 12
    new-array v4, v2, [Ljava/lang/Object;

    .line 13
    .line 14
    invoke-static {v0, v3, v4}, LFe/c;->k(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lo9/d;->b:Lo9/e;

    .line 18
    .line 19
    iget-object v3, v0, Lo9/e;->a:Ljava/lang/String;

    .line 20
    .line 21
    if-eqz v3, :cond_1

    .line 22
    .line 23
    move v4, v1

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move v4, v2

    .line 26
    :goto_1
    const-string v5, "Bundle ID must be set"

    .line 27
    .line 28
    new-array v6, v2, [Ljava/lang/Object;

    .line 29
    .line 30
    invoke-static {v4, v5, v6}, LFe/c;->k(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object v4, p0, Lo9/d;->e:Lc9/c;

    .line 34
    .line 35
    invoke-virtual {v4}, Lc9/c;->size()I

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    iget v5, v0, Lo9/e;->d:I

    .line 40
    .line 41
    if-ne v4, v5, :cond_2

    .line 42
    .line 43
    move v4, v1

    .line 44
    goto :goto_2

    .line 45
    :cond_2
    move v4, v2

    .line 46
    :goto_2
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    iget-object v6, p0, Lo9/d;->e:Lc9/c;

    .line 51
    .line 52
    invoke-virtual {v6}, Lc9/c;->size()I

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    const/4 v7, 0x2

    .line 61
    new-array v7, v7, [Ljava/lang/Object;

    .line 62
    .line 63
    aput-object v5, v7, v2

    .line 64
    .line 65
    aput-object v6, v7, v1

    .line 66
    .line 67
    const-string v1, "Expected %s documents, but loaded %s."

    .line 68
    .line 69
    invoke-static {v4, v1, v7}, LFe/c;->k(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    iget-object v1, p0, Lo9/d;->e:Lc9/c;

    .line 73
    .line 74
    iget-object v2, p0, Lo9/d;->a:Lo9/a;

    .line 75
    .line 76
    move-object v5, v2

    .line 77
    check-cast v5, Lr9/l;

    .line 78
    .line 79
    new-instance v2, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    const-string v4, "__bundle__/docs/"

    .line 82
    .line 83
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-static {v2}, Ls9/m;->l(Ljava/lang/String;)Ls9/m;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    new-instance v3, Lp9/u;

    .line 98
    .line 99
    const/4 v4, 0x0

    .line 100
    invoke-direct {v3, v2, v4}, Lp9/u;-><init>(Ls9/m;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v3}, Lp9/u;->i()Lp9/A;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    invoke-virtual {v5, v2}, Lr9/l;->a(Lp9/A;)Lr9/S;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    new-instance v3, LA5/g;

    .line 112
    .line 113
    const/16 v4, 0x13

    .line 114
    .line 115
    invoke-direct {v3, v5, v1, v2, v4}, LA5/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 116
    .line 117
    .line 118
    const-string v1, "Apply bundle documents"

    .line 119
    .line 120
    iget-object v2, v5, Lr9/l;->a:Lp7/b;

    .line 121
    .line 122
    invoke-virtual {v2, v1, v3}, Lp7/b;->O(Ljava/lang/String;Lw9/o;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    check-cast v1, Lc9/c;

    .line 127
    .line 128
    new-instance v3, Ljava/util/HashMap;

    .line 129
    .line 130
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 131
    .line 132
    .line 133
    iget-object v4, p0, Lo9/d;->c:Ljava/util/ArrayList;

    .line 134
    .line 135
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 136
    .line 137
    .line 138
    move-result-object v6

    .line 139
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 140
    .line 141
    .line 142
    move-result v7

    .line 143
    if-eqz v7, :cond_3

    .line 144
    .line 145
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v7

    .line 149
    check-cast v7, Lo9/j;

    .line 150
    .line 151
    iget-object v7, v7, Lo9/j;->a:Ljava/lang/String;

    .line 152
    .line 153
    sget-object v8, Ls9/h;->c:Lc9/d;

    .line 154
    .line 155
    invoke-virtual {v3, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_3
    iget-object v6, p0, Lo9/d;->d:Ljava/util/HashMap;

    .line 160
    .line 161
    invoke-virtual {v6}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 162
    .line 163
    .line 164
    move-result-object v6

    .line 165
    invoke-interface {v6}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 166
    .line 167
    .line 168
    move-result-object v6

    .line 169
    :cond_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 170
    .line 171
    .line 172
    move-result v7

    .line 173
    if-eqz v7, :cond_5

    .line 174
    .line 175
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v7

    .line 179
    check-cast v7, Lo9/h;

    .line 180
    .line 181
    iget-object v8, v7, Lo9/h;->d:Ljava/util/ArrayList;

    .line 182
    .line 183
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 184
    .line 185
    .line 186
    move-result-object v8

    .line 187
    :goto_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 188
    .line 189
    .line 190
    move-result v9

    .line 191
    if-eqz v9, :cond_4

    .line 192
    .line 193
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v9

    .line 197
    check-cast v9, Ljava/lang/String;

    .line 198
    .line 199
    invoke-virtual {v3, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v10

    .line 203
    check-cast v10, Lc9/d;

    .line 204
    .line 205
    iget-object v11, v7, Lo9/h;->a:Ls9/h;

    .line 206
    .line 207
    invoke-virtual {v10, v11}, Lc9/d;->a(Ljava/lang/Object;)Lc9/d;

    .line 208
    .line 209
    .line 210
    move-result-object v10

    .line 211
    invoke-virtual {v3, v9, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    goto :goto_4

    .line 215
    :cond_5
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 216
    .line 217
    .line 218
    move-result-object v11

    .line 219
    :goto_5
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 220
    .line 221
    .line 222
    move-result v4

    .line 223
    if-eqz v4, :cond_6

    .line 224
    .line 225
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v4

    .line 229
    move-object v6, v4

    .line 230
    check-cast v6, Lo9/j;

    .line 231
    .line 232
    iget-object v4, v6, Lo9/j;->a:Ljava/lang/String;

    .line 233
    .line 234
    invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v4

    .line 238
    move-object v9, v4

    .line 239
    check-cast v9, Lc9/d;

    .line 240
    .line 241
    iget-object v4, v6, Lo9/j;->b:Lo9/i;

    .line 242
    .line 243
    iget-object v4, v4, Lo9/i;->a:Lp9/A;

    .line 244
    .line 245
    invoke-virtual {v5, v4}, Lr9/l;->a(Lp9/A;)Lr9/S;

    .line 246
    .line 247
    .line 248
    move-result-object v7

    .line 249
    iget v8, v7, Lr9/S;->b:I

    .line 250
    .line 251
    new-instance v4, Lcom/applovin/impl/N;

    .line 252
    .line 253
    const/4 v10, 0x3

    .line 254
    invoke-direct/range {v4 .. v10}, Lcom/applovin/impl/N;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;I)V

    .line 255
    .line 256
    .line 257
    const-string v6, "Saved named query"

    .line 258
    .line 259
    invoke-virtual {v2, v6, v4}, Lp7/b;->P(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 260
    .line 261
    .line 262
    goto :goto_5

    .line 263
    :cond_6
    new-instance v3, Lng/a;

    .line 264
    .line 265
    const/16 v4, 0xb

    .line 266
    .line 267
    invoke-direct {v3, v4, v5, v0}, Lng/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 268
    .line 269
    .line 270
    const-string v0, "Save bundle"

    .line 271
    .line 272
    invoke-virtual {v2, v0, v3}, Lp7/b;->P(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 273
    .line 274
    .line 275
    return-object v1
.end method
