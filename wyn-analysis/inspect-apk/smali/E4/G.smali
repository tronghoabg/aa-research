.class public final LE4/G;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE4/h;
.implements LE4/g;


# instance fields
.field public final a:LE4/i;

.field public final b:LE4/k;

.field public c:I

.field public d:LE4/e;

.field public e:Ljava/lang/Object;

.field public volatile f:LI4/o;

.field public g:LE4/f;


# direct methods
.method public constructor <init>(LE4/i;LE4/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LE4/G;->a:LE4/i;

    .line 5
    .line 6
    iput-object p2, p0, LE4/G;->b:LE4/k;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(LB4/d;Ljava/lang/Object;LC4/e;ILB4/d;)V
    .locals 6

    .line 1
    iget-object v0, p0, LE4/G;->b:LE4/k;

    .line 2
    .line 3
    iget-object p4, p0, LE4/G;->f:LI4/o;

    .line 4
    .line 5
    iget-object p4, p4, LI4/o;->c:LC4/e;

    .line 6
    .line 7
    invoke-interface {p4}, LC4/e;->d()I

    .line 8
    .line 9
    .line 10
    move-result v4

    .line 11
    move-object v5, p1

    .line 12
    move-object v1, p1

    .line 13
    move-object v2, p2

    .line 14
    move-object v3, p3

    .line 15
    invoke-virtual/range {v0 .. v5}, LE4/k;->a(LB4/d;Ljava/lang/Object;LC4/e;ILB4/d;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final b(LB4/d;Ljava/lang/Exception;LC4/e;I)V
    .locals 1

    .line 1
    iget-object p4, p0, LE4/G;->b:LE4/k;

    .line 2
    .line 3
    iget-object v0, p0, LE4/G;->f:LI4/o;

    .line 4
    .line 5
    iget-object v0, v0, LI4/o;->c:LC4/e;

    .line 6
    .line 7
    invoke-interface {v0}, LC4/e;->d()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p4, p1, p2, p3, v0}, LE4/k;->b(LB4/d;Ljava/lang/Exception;LC4/e;I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final cancel()V
    .locals 1

    .line 1
    iget-object v0, p0, LE4/G;->f:LI4/o;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, LI4/o;->c:LC4/e;

    .line 6
    .line 7
    invoke-interface {v0}, LC4/e;->cancel()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final d()Z
    .locals 13

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object v1, p0, LE4/G;->e:Ljava/lang/Object;

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v1, :cond_1

    .line 6
    .line 7
    iput-object v2, p0, LE4/G;->e:Ljava/lang/Object;

    .line 8
    .line 9
    const-string v3, "SourceGenerator"

    .line 10
    .line 11
    const-string v4, "Finished encoding source to cache, key: "

    .line 12
    .line 13
    sget v5, LY4/i;->b:I

    .line 14
    .line 15
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 16
    .line 17
    .line 18
    move-result-wide v5

    .line 19
    :try_start_0
    iget-object v7, p0, LE4/G;->a:LE4/i;

    .line 20
    .line 21
    invoke-virtual {v7, v1}, LE4/i;->d(Ljava/lang/Object;)LB4/b;

    .line 22
    .line 23
    .line 24
    move-result-object v7

    .line 25
    new-instance v8, LG9/e;

    .line 26
    .line 27
    iget-object v9, p0, LE4/G;->a:LE4/i;

    .line 28
    .line 29
    iget-object v9, v9, LE4/i;->i:LB4/g;

    .line 30
    .line 31
    const/4 v10, 0x3

    .line 32
    invoke-direct {v8, v7, v1, v9, v10}, LG9/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 33
    .line 34
    .line 35
    new-instance v9, LE4/f;

    .line 36
    .line 37
    iget-object v10, p0, LE4/G;->f:LI4/o;

    .line 38
    .line 39
    iget-object v10, v10, LI4/o;->a:LB4/d;

    .line 40
    .line 41
    iget-object v11, p0, LE4/G;->a:LE4/i;

    .line 42
    .line 43
    iget-object v12, v11, LE4/i;->n:LB4/d;

    .line 44
    .line 45
    invoke-direct {v9, v10, v12}, LE4/f;-><init>(LB4/d;LB4/d;)V

    .line 46
    .line 47
    .line 48
    iput-object v9, p0, LE4/G;->g:LE4/f;

    .line 49
    .line 50
    iget-object v9, v11, LE4/i;->h:Ld7/j;

    .line 51
    .line 52
    invoke-virtual {v9}, Ld7/j;->a()LG4/a;

    .line 53
    .line 54
    .line 55
    move-result-object v9

    .line 56
    iget-object v10, p0, LE4/G;->g:LE4/f;

    .line 57
    .line 58
    invoke-interface {v9, v10, v8}, LG4/a;->f(LB4/d;LG9/e;)V

    .line 59
    .line 60
    .line 61
    const/4 v8, 0x2

    .line 62
    invoke-static {v3, v8}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 63
    .line 64
    .line 65
    move-result v8

    .line 66
    if-eqz v8, :cond_0

    .line 67
    .line 68
    new-instance v8, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    invoke-direct {v8, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    iget-object v4, p0, LE4/G;->g:LE4/f;

    .line 74
    .line 75
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string v4, ", data: "

    .line 79
    .line 80
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string v1, ", encoder: "

    .line 87
    .line 88
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string v1, ", duration: "

    .line 95
    .line 96
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-static {v5, v6}, LY4/i;->a(J)D

    .line 100
    .line 101
    .line 102
    move-result-wide v4

    .line 103
    invoke-virtual {v8, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-static {v3, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 111
    .line 112
    .line 113
    goto :goto_0

    .line 114
    :catchall_0
    move-exception v0

    .line 115
    goto :goto_1

    .line 116
    :cond_0
    :goto_0
    iget-object v1, p0, LE4/G;->f:LI4/o;

    .line 117
    .line 118
    iget-object v1, v1, LI4/o;->c:LC4/e;

    .line 119
    .line 120
    invoke-interface {v1}, LC4/e;->a()V

    .line 121
    .line 122
    .line 123
    new-instance v1, LE4/e;

    .line 124
    .line 125
    iget-object v3, p0, LE4/G;->f:LI4/o;

    .line 126
    .line 127
    iget-object v3, v3, LI4/o;->a:LB4/d;

    .line 128
    .line 129
    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    iget-object v4, p0, LE4/G;->a:LE4/i;

    .line 134
    .line 135
    invoke-direct {v1, v3, v4, p0}, LE4/e;-><init>(Ljava/util/List;LE4/i;LE4/g;)V

    .line 136
    .line 137
    .line 138
    iput-object v1, p0, LE4/G;->d:LE4/e;

    .line 139
    .line 140
    goto :goto_2

    .line 141
    :goto_1
    iget-object v1, p0, LE4/G;->f:LI4/o;

    .line 142
    .line 143
    iget-object v1, v1, LI4/o;->c:LC4/e;

    .line 144
    .line 145
    invoke-interface {v1}, LC4/e;->a()V

    .line 146
    .line 147
    .line 148
    throw v0

    .line 149
    :cond_1
    :goto_2
    iget-object v1, p0, LE4/G;->d:LE4/e;

    .line 150
    .line 151
    if-eqz v1, :cond_2

    .line 152
    .line 153
    invoke-virtual {v1}, LE4/e;->d()Z

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    if-eqz v1, :cond_2

    .line 158
    .line 159
    return v0

    .line 160
    :cond_2
    iput-object v2, p0, LE4/G;->d:LE4/e;

    .line 161
    .line 162
    iput-object v2, p0, LE4/G;->f:LI4/o;

    .line 163
    .line 164
    const/4 v1, 0x0

    .line 165
    :cond_3
    :goto_3
    if-nez v1, :cond_5

    .line 166
    .line 167
    iget v2, p0, LE4/G;->c:I

    .line 168
    .line 169
    iget-object v3, p0, LE4/G;->a:LE4/i;

    .line 170
    .line 171
    invoke-virtual {v3}, LE4/i;->b()Ljava/util/ArrayList;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 176
    .line 177
    .line 178
    move-result v3

    .line 179
    if-ge v2, v3, :cond_5

    .line 180
    .line 181
    iget-object v2, p0, LE4/G;->a:LE4/i;

    .line 182
    .line 183
    invoke-virtual {v2}, LE4/i;->b()Ljava/util/ArrayList;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    iget v3, p0, LE4/G;->c:I

    .line 188
    .line 189
    add-int/lit8 v4, v3, 0x1

    .line 190
    .line 191
    iput v4, p0, LE4/G;->c:I

    .line 192
    .line 193
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    check-cast v2, LI4/o;

    .line 198
    .line 199
    iput-object v2, p0, LE4/G;->f:LI4/o;

    .line 200
    .line 201
    iget-object v2, p0, LE4/G;->f:LI4/o;

    .line 202
    .line 203
    if-eqz v2, :cond_3

    .line 204
    .line 205
    iget-object v2, p0, LE4/G;->a:LE4/i;

    .line 206
    .line 207
    iget-object v2, v2, LE4/i;->p:LE4/m;

    .line 208
    .line 209
    iget-object v3, p0, LE4/G;->f:LI4/o;

    .line 210
    .line 211
    iget-object v3, v3, LI4/o;->c:LC4/e;

    .line 212
    .line 213
    invoke-interface {v3}, LC4/e;->d()I

    .line 214
    .line 215
    .line 216
    move-result v3

    .line 217
    invoke-virtual {v2, v3}, LE4/m;->a(I)Z

    .line 218
    .line 219
    .line 220
    move-result v2

    .line 221
    if-nez v2, :cond_4

    .line 222
    .line 223
    iget-object v2, p0, LE4/G;->a:LE4/i;

    .line 224
    .line 225
    iget-object v3, p0, LE4/G;->f:LI4/o;

    .line 226
    .line 227
    iget-object v3, v3, LI4/o;->c:LC4/e;

    .line 228
    .line 229
    invoke-interface {v3}, LC4/e;->b()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    move-result-object v3

    .line 233
    invoke-virtual {v2, v3}, LE4/i;->c(Ljava/lang/Class;)LE4/z;

    .line 234
    .line 235
    .line 236
    move-result-object v2

    .line 237
    if-eqz v2, :cond_3

    .line 238
    .line 239
    :cond_4
    iget-object v1, p0, LE4/G;->f:LI4/o;

    .line 240
    .line 241
    iget-object v2, p0, LE4/G;->f:LI4/o;

    .line 242
    .line 243
    iget-object v2, v2, LI4/o;->c:LC4/e;

    .line 244
    .line 245
    iget-object v3, p0, LE4/G;->a:LE4/i;

    .line 246
    .line 247
    iget-object v3, v3, LE4/i;->o:Lcom/bumptech/glide/d;

    .line 248
    .line 249
    new-instance v4, LS3/e;

    .line 250
    .line 251
    const/4 v5, 0x4

    .line 252
    invoke-direct {v4, v5, p0, v1}, LS3/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    invoke-interface {v2, v3, v4}, LC4/e;->e(Lcom/bumptech/glide/d;LC4/d;)V

    .line 256
    .line 257
    .line 258
    move v1, v0

    .line 259
    goto :goto_3

    .line 260
    :cond_5
    return v1
.end method
