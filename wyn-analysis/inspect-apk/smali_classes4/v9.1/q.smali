.class public final Lv9/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv9/s;


# instance fields
.field public final synthetic a:LE5/n0;


# direct methods
.method public constructor <init>(LE5/n0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv9/q;->a:LE5/n0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lmd/k0;)V
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    iget-object v2, p0, Lv9/q;->a:LE5/n0;

    .line 4
    .line 5
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lmd/k0;->f()Z

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    if-eqz v3, :cond_0

    .line 13
    .line 14
    invoke-virtual {v2}, LE5/n0;->v()Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    xor-int/2addr v3, v1

    .line 19
    const-string v4, "Write stream was stopped gracefully while still needed."

    .line 20
    .line 21
    new-array v5, v0, [Ljava/lang/Object;

    .line 22
    .line 23
    invoke-static {v3, v4, v5}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-virtual {p1}, Lmd/k0;->f()Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    iget-object v4, v2, LE5/n0;->f:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v4, Lv9/B;

    .line 33
    .line 34
    if-nez v3, :cond_3

    .line 35
    .line 36
    iget-object v3, v2, LE5/n0;->m:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v3, Ljava/util/ArrayDeque;

    .line 39
    .line 40
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    if-nez v5, :cond_3

    .line 45
    .line 46
    iget-boolean v5, v4, Lv9/B;->s:Z

    .line 47
    .line 48
    iget-object v6, p1, Lmd/k0;->a:Lmd/j0;

    .line 49
    .line 50
    const-string v7, "Handling write error with status OK."

    .line 51
    .line 52
    if-eqz v5, :cond_2

    .line 53
    .line 54
    invoke-virtual {p1}, Lmd/k0;->f()Z

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    xor-int/2addr v5, v1

    .line 59
    new-array v8, v0, [Ljava/lang/Object;

    .line 60
    .line 61
    invoke-static {v5, v7, v8}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    sget-object v5, Lv9/g;->d:Ljava/util/HashSet;

    .line 65
    .line 66
    iget v5, v6, Lmd/j0;->a:I

    .line 67
    .line 68
    sget-object v7, Lm9/F;->m:Landroid/util/SparseArray;

    .line 69
    .line 70
    sget-object v8, Lm9/F;->d:Lm9/F;

    .line 71
    .line 72
    invoke-virtual {v7, v5, v8}, Landroid/util/SparseArray;->get(ILjava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    check-cast v5, Lm9/F;

    .line 77
    .line 78
    invoke-static {v5}, Lv9/g;->a(Lm9/F;)Z

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    if-eqz v5, :cond_3

    .line 83
    .line 84
    sget-object v5, Lmd/j0;->m:Lmd/j0;

    .line 85
    .line 86
    invoke-virtual {v6, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    if-nez v5, :cond_3

    .line 91
    .line 92
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    check-cast v3, Lt9/i;

    .line 97
    .line 98
    invoke-virtual {v4}, Lv9/b;->b()V

    .line 99
    .line 100
    .line 101
    iget v3, v3, Lt9/i;->a:I

    .line 102
    .line 103
    iget-object v5, v2, LE5/n0;->b:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v5, Lad/L;

    .line 106
    .line 107
    iget-object v5, v5, Lad/L;->b:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v5, Lp9/s;

    .line 110
    .line 111
    invoke-virtual {v5}, Lp9/s;->e()Lp9/z;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    const-string v6, "handleRejectedWrite"

    .line 116
    .line 117
    invoke-virtual {v5, v6}, Lp9/z;->a(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    iget-object v6, v5, Lp9/z;->a:Lr9/l;

    .line 121
    .line 122
    new-instance v7, LE5/A;

    .line 123
    .line 124
    const/4 v8, 0x5

    .line 125
    invoke-direct {v7, v6, v3, v8}, LE5/A;-><init>(Ljava/lang/Object;II)V

    .line 126
    .line 127
    .line 128
    iget-object v6, v6, Lr9/l;->a:Lp7/b;

    .line 129
    .line 130
    const-string v8, "Reject batch"

    .line 131
    .line 132
    invoke-virtual {v6, v8, v7}, Lp7/b;->O(Ljava/lang/String;Lw9/o;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v6

    .line 136
    check-cast v6, Lc9/c;

    .line 137
    .line 138
    invoke-virtual {v6}, Lc9/c;->isEmpty()Z

    .line 139
    .line 140
    .line 141
    move-result v7

    .line 142
    if-nez v7, :cond_1

    .line 143
    .line 144
    invoke-virtual {v6}, Lc9/c;->e()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v7

    .line 148
    check-cast v7, Ls9/h;

    .line 149
    .line 150
    iget-object v7, v7, Ls9/h;->a:Ls9/m;

    .line 151
    .line 152
    new-array v1, v1, [Ljava/lang/Object;

    .line 153
    .line 154
    aput-object v7, v1, v0

    .line 155
    .line 156
    const-string v7, "Write failed at %s"

    .line 157
    .line 158
    invoke-static {p1, v7, v1}, Lp9/z;->e(Lmd/k0;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    :cond_1
    invoke-virtual {v5, v3, p1}, Lp9/z;->f(ILmd/k0;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v5, v3}, Lp9/z;->j(I)V

    .line 165
    .line 166
    .line 167
    const/4 p1, 0x0

    .line 168
    invoke-virtual {v5, v6, p1}, Lp9/z;->b(Lc9/c;LC8/i;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v2}, LE5/n0;->i()V

    .line 172
    .line 173
    .line 174
    goto :goto_0

    .line 175
    :cond_2
    invoke-virtual {p1}, Lmd/k0;->f()Z

    .line 176
    .line 177
    .line 178
    move-result v3

    .line 179
    xor-int/2addr v3, v1

    .line 180
    new-array v5, v0, [Ljava/lang/Object;

    .line 181
    .line 182
    invoke-static {v3, v7, v5}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    sget-object v3, Lv9/g;->d:Ljava/util/HashSet;

    .line 186
    .line 187
    iget v3, v6, Lmd/j0;->a:I

    .line 188
    .line 189
    sget-object v5, Lm9/F;->m:Landroid/util/SparseArray;

    .line 190
    .line 191
    sget-object v6, Lm9/F;->d:Lm9/F;

    .line 192
    .line 193
    invoke-virtual {v5, v3, v6}, Landroid/util/SparseArray;->get(ILjava/lang/Object;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v3

    .line 197
    check-cast v3, Lm9/F;

    .line 198
    .line 199
    invoke-static {v3}, Lv9/g;->a(Lm9/F;)Z

    .line 200
    .line 201
    .line 202
    move-result v3

    .line 203
    if-eqz v3, :cond_3

    .line 204
    .line 205
    iget-object v3, v4, Lv9/B;->t:Lcom/google/protobuf/ByteString;

    .line 206
    .line 207
    invoke-static {v3}, Lw9/p;->i(Lcom/google/protobuf/ByteString;)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v3

    .line 211
    const/4 v5, 0x2

    .line 212
    new-array v5, v5, [Ljava/lang/Object;

    .line 213
    .line 214
    aput-object v3, v5, v0

    .line 215
    .line 216
    aput-object p1, v5, v1

    .line 217
    .line 218
    const-string p1, "RemoteStore"

    .line 219
    .line 220
    const-string v3, "RemoteStore error before completed handshake; resetting stream token %s: %s"

    .line 221
    .line 222
    invoke-static {p1, v3, v1, v5}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    sget-object p1, Lv9/B;->u:Lcom/google/protobuf/ByteString;

    .line 226
    .line 227
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    iput-object p1, v4, Lv9/B;->t:Lcom/google/protobuf/ByteString;

    .line 231
    .line 232
    iget-object v1, v2, LE5/n0;->c:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast v1, Lr9/l;

    .line 235
    .line 236
    new-instance v3, Lng/a;

    .line 237
    .line 238
    const/16 v5, 0xc

    .line 239
    .line 240
    invoke-direct {v3, v5, v1, p1}, Lng/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    iget-object p1, v1, Lr9/l;->a:Lp7/b;

    .line 244
    .line 245
    const-string v1, "Set stream token"

    .line 246
    .line 247
    invoke-virtual {p1, v1, v3}, Lp7/b;->P(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 248
    .line 249
    .line 250
    :cond_3
    :goto_0
    invoke-virtual {v2}, LE5/n0;->v()Z

    .line 251
    .line 252
    .line 253
    move-result p1

    .line 254
    if-eqz p1, :cond_4

    .line 255
    .line 256
    invoke-virtual {v2}, LE5/n0;->v()Z

    .line 257
    .line 258
    .line 259
    move-result p1

    .line 260
    new-array v0, v0, [Ljava/lang/Object;

    .line 261
    .line 262
    const-string v1, "startWriteStream() called when shouldStartWriteStream() is false."

    .line 263
    .line 264
    invoke-static {p1, v1, v0}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v4}, Lv9/B;->g()V

    .line 268
    .line 269
    .line 270
    :cond_4
    return-void
.end method

.method public final b()V
    .locals 5

    .line 1
    iget-object v0, p0, Lv9/q;->a:LE5/n0;

    .line 2
    .line 3
    iget-object v0, v0, LE5/n0;->f:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lv9/B;

    .line 6
    .line 7
    invoke-virtual {v0}, Lv9/b;->c()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    new-array v3, v2, [Ljava/lang/Object;

    .line 13
    .line 14
    const-string v4, "Writing handshake requires an opened stream"

    .line 15
    .line 16
    invoke-static {v1, v4, v3}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-boolean v1, v0, Lv9/B;->s:Z

    .line 20
    .line 21
    xor-int/lit8 v1, v1, 0x1

    .line 22
    .line 23
    const-string v3, "Handshake already completed"

    .line 24
    .line 25
    new-array v2, v2, [Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {v1, v3, v2}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-static {}, Lka/K1;->f()Lka/I1;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iget-object v2, v0, Lv9/B;->r:Lv9/o;

    .line 35
    .line 36
    iget-object v2, v2, Lv9/o;->b:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v1, v2}, Lka/I1;->b(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, Lka/K1;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Lv9/b;->i(Lcom/google/protobuf/GeneratedMessageLite;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method
