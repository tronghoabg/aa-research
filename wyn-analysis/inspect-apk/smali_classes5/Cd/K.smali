.class public final LCd/K;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/q;


# instance fields
.field public synthetic a:LFd/c;

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/nio/charset/Charset;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/nio/charset/Charset;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LCd/K;->c:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, LCd/K;->d:Ljava/nio/charset/Charset;

    .line 4
    .line 5
    const/4 p1, 0x3

    .line 6
    invoke-direct {p0, p1, p3}, Llf/j;-><init>(ILjf/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, LFd/c;

    .line 2
    .line 3
    check-cast p3, Ljf/c;

    .line 4
    .line 5
    new-instance v0, LCd/K;

    .line 6
    .line 7
    iget-object v1, p0, LCd/K;->c:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v2, p0, LCd/K;->d:Ljava/nio/charset/Charset;

    .line 10
    .line 11
    invoke-direct {v0, v1, v2, p3}, LCd/K;-><init>(Ljava/lang/String;Ljava/nio/charset/Charset;Ljf/c;)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, LCd/K;->a:LFd/c;

    .line 15
    .line 16
    iput-object p2, v0, LCd/K;->b:Ljava/lang/Object;

    .line 17
    .line 18
    sget-object p1, Lef/C;->a:Lef/C;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, LCd/K;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LCd/K;->a:LFd/c;

    .line 7
    .line 8
    iget-object v0, p0, LCd/K;->b:Ljava/lang/Object;

    .line 9
    .line 10
    sget-object v1, LCd/N;->a:Lvg/b;

    .line 11
    .line 12
    iget-object v1, p1, LFd/c;->c:LJd/n;

    .line 13
    .line 14
    sget-object v2, LJd/p;->a:Ljava/util/List;

    .line 15
    .line 16
    const-string v2, "Accept-Charset"

    .line 17
    .line 18
    invoke-virtual {v1, v2}, LA7/B0;->E(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-object v3, p1, LFd/c;->a:LJd/B;

    .line 23
    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    const-string v4, "Adding Accept-Charset="

    .line 30
    .line 31
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iget-object v4, p0, LCd/K;->c:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v5, " to "

    .line 40
    .line 41
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    sget-object v5, LCd/N;->a:Lvg/b;

    .line 52
    .line 53
    invoke-interface {v5, v1}, Lvg/b;->s(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    iget-object v1, p1, LFd/c;->c:LJd/n;

    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    const-string v5, "value"

    .line 62
    .line 63
    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, v4}, LJd/n;->Y(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1, v2}, LA7/B0;->D(Ljava/lang/String;)Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 74
    .line 75
    .line 76
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    :goto_0
    instance-of v1, v0, Ljava/lang/String;

    .line 80
    .line 81
    if-nez v1, :cond_1

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_1
    invoke-static {p1}, Lff/B;->i(LJd/r;)LJd/f;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    if-eqz p1, :cond_2

    .line 89
    .line 90
    sget-object v1, LJd/e;->a:LJd/f;

    .line 91
    .line 92
    iget-object v1, v1, LJd/f;->d:Ljava/lang/String;

    .line 93
    .line 94
    iget-object v2, p1, LJd/f;->d:Ljava/lang/String;

    .line 95
    .line 96
    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    if-nez v1, :cond_2

    .line 101
    .line 102
    :goto_1
    const/4 p1, 0x0

    .line 103
    return-object p1

    .line 104
    :cond_2
    check-cast v0, Ljava/lang/String;

    .line 105
    .line 106
    if-nez p1, :cond_3

    .line 107
    .line 108
    sget-object v1, LJd/e;->a:LJd/f;

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_3
    move-object v1, p1

    .line 112
    :goto_2
    if-eqz p1, :cond_4

    .line 113
    .line 114
    invoke-static {p1}, Lp7/b;->i(LJd/f;)Ljava/nio/charset/Charset;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    if-nez p1, :cond_5

    .line 119
    .line 120
    :cond_4
    iget-object p1, p0, LCd/K;->d:Ljava/nio/charset/Charset;

    .line 121
    .line 122
    :cond_5
    new-instance v2, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    const-string v4, "Sending request body to "

    .line 125
    .line 126
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    const-string v3, " as text/plain with charset "

    .line 133
    .line 134
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    sget-object v3, LCd/N;->a:Lvg/b;

    .line 145
    .line 146
    invoke-interface {v3, v2}, Lvg/b;->s(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    new-instance v2, LMd/d;

    .line 150
    .line 151
    const-string v3, "<this>"

    .line 152
    .line 153
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    const-string v3, "charset"

    .line 157
    .line 158
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    invoke-static {p1}, Lp7/b;->A(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    iget-object v4, v1, LJ4/d;->c:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v4, Ljava/util/List;

    .line 168
    .line 169
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 170
    .line 171
    .line 172
    move-result v5

    .line 173
    if-eqz v5, :cond_9

    .line 174
    .line 175
    const/4 v6, 0x1

    .line 176
    if-eq v5, v6, :cond_8

    .line 177
    .line 178
    move-object v5, v4

    .line 179
    check-cast v5, Ljava/lang/Iterable;

    .line 180
    .line 181
    instance-of v7, v5, Ljava/util/Collection;

    .line 182
    .line 183
    if-eqz v7, :cond_6

    .line 184
    .line 185
    move-object v7, v5

    .line 186
    check-cast v7, Ljava/util/Collection;

    .line 187
    .line 188
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 189
    .line 190
    .line 191
    move-result v7

    .line 192
    if-eqz v7, :cond_6

    .line 193
    .line 194
    goto :goto_3

    .line 195
    :cond_6
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 196
    .line 197
    .line 198
    move-result-object v5

    .line 199
    :cond_7
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 200
    .line 201
    .line 202
    move-result v7

    .line 203
    if-eqz v7, :cond_9

    .line 204
    .line 205
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v7

    .line 209
    check-cast v7, LJd/j;

    .line 210
    .line 211
    iget-object v8, v7, LJd/j;->a:Ljava/lang/String;

    .line 212
    .line 213
    invoke-static {v8, v3, v6}, LBf/r;->c0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 214
    .line 215
    .line 216
    move-result v8

    .line 217
    if-eqz v8, :cond_7

    .line 218
    .line 219
    iget-object v7, v7, LJd/j;->b:Ljava/lang/String;

    .line 220
    .line 221
    invoke-static {v7, p1, v6}, LBf/r;->c0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 222
    .line 223
    .line 224
    move-result v7

    .line 225
    if-eqz v7, :cond_7

    .line 226
    .line 227
    goto :goto_4

    .line 228
    :cond_8
    const/4 v5, 0x0

    .line 229
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v5

    .line 233
    check-cast v5, LJd/j;

    .line 234
    .line 235
    iget-object v7, v5, LJd/j;->a:Ljava/lang/String;

    .line 236
    .line 237
    invoke-static {v7, v3, v6}, LBf/r;->c0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 238
    .line 239
    .line 240
    move-result v7

    .line 241
    if-eqz v7, :cond_9

    .line 242
    .line 243
    iget-object v5, v5, LJd/j;->b:Ljava/lang/String;

    .line 244
    .line 245
    invoke-static {v5, p1, v6}, LBf/r;->c0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 246
    .line 247
    .line 248
    move-result v5

    .line 249
    if-eqz v5, :cond_9

    .line 250
    .line 251
    goto :goto_4

    .line 252
    :cond_9
    :goto_3
    new-instance v5, LJd/f;

    .line 253
    .line 254
    check-cast v4, Ljava/util/Collection;

    .line 255
    .line 256
    new-instance v6, LJd/j;

    .line 257
    .line 258
    invoke-direct {v6, v3, p1}, LJd/j;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    invoke-static {v4, v6}, Lff/o;->F0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    iget-object v3, v1, LJ4/d;->b:Ljava/lang/Object;

    .line 266
    .line 267
    check-cast v3, Ljava/lang/String;

    .line 268
    .line 269
    iget-object v4, v1, LJd/f;->d:Ljava/lang/String;

    .line 270
    .line 271
    iget-object v1, v1, LJd/f;->e:Ljava/lang/String;

    .line 272
    .line 273
    invoke-direct {v5, v4, v1, v3, p1}, LJd/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 274
    .line 275
    .line 276
    move-object v1, v5

    .line 277
    :goto_4
    invoke-direct {v2, v0, v1}, LMd/d;-><init>(Ljava/lang/String;LJd/f;)V

    .line 278
    .line 279
    .line 280
    return-object v2
.end method
