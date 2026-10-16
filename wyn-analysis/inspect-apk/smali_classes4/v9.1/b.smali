.class public abstract Lv9/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final m:J

.field public static final n:J

.field public static final o:J

.field public static final p:J

.field public static final q:J


# instance fields
.field public a:Lme/a;

.field public b:Lme/a;

.field public final c:Lv9/m;

.field public final d:LF6/r;

.field public final e:Lg5/d;

.field public final f:Lw9/e;

.field public final g:Lw9/d;

.field public h:Lv9/r;

.field public i:J

.field public j:Lv9/k;

.field public final k:Lw9/l;

.field public final l:Lv9/s;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 2
    .line 3
    const-wide/16 v1, 0x1

    .line 4
    .line 5
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 6
    .line 7
    .line 8
    move-result-wide v3

    .line 9
    sput-wide v3, Lv9/b;->m:J

    .line 10
    .line 11
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 12
    .line 13
    invoke-virtual {v3, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 14
    .line 15
    .line 16
    move-result-wide v4

    .line 17
    sput-wide v4, Lv9/b;->n:J

    .line 18
    .line 19
    invoke-virtual {v3, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 20
    .line 21
    .line 22
    move-result-wide v1

    .line 23
    sput-wide v1, Lv9/b;->o:J

    .line 24
    .line 25
    const-wide/16 v1, 0xa

    .line 26
    .line 27
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 28
    .line 29
    .line 30
    move-result-wide v3

    .line 31
    sput-wide v3, Lv9/b;->p:J

    .line 32
    .line 33
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    sput-wide v0, Lv9/b;->q:J

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>(Lv9/m;LF6/r;Lw9/e;Lw9/d;Lw9/d;Lv9/s;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lv9/r;->a:Lv9/r;

    .line 5
    .line 6
    iput-object v0, p0, Lv9/b;->h:Lv9/r;

    .line 7
    .line 8
    const-wide/16 v0, 0x0

    .line 9
    .line 10
    iput-wide v0, p0, Lv9/b;->i:J

    .line 11
    .line 12
    iput-object p1, p0, Lv9/b;->c:Lv9/m;

    .line 13
    .line 14
    iput-object p2, p0, Lv9/b;->d:LF6/r;

    .line 15
    .line 16
    iput-object p3, p0, Lv9/b;->f:Lw9/e;

    .line 17
    .line 18
    iput-object p5, p0, Lv9/b;->g:Lw9/d;

    .line 19
    .line 20
    iput-object p6, p0, Lv9/b;->l:Lv9/s;

    .line 21
    .line 22
    new-instance p1, Lg5/d;

    .line 23
    .line 24
    const/16 p2, 0x1c

    .line 25
    .line 26
    invoke-direct {p1, p0, p2}, Lg5/d;-><init>(Ljava/lang/Object;I)V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lv9/b;->e:Lg5/d;

    .line 30
    .line 31
    new-instance v0, Lw9/l;

    .line 32
    .line 33
    sget-wide v5, Lv9/b;->n:J

    .line 34
    .line 35
    sget-wide v3, Lv9/b;->m:J

    .line 36
    .line 37
    move-object v1, p3

    .line 38
    move-object v2, p4

    .line 39
    invoke-direct/range {v0 .. v6}, Lw9/l;-><init>(Lw9/e;Lw9/d;JJ)V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, Lv9/b;->k:Lw9/l;

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final a(Lv9/r;Lmd/k0;)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Lv9/b;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    new-array v2, v1, [Ljava/lang/Object;

    .line 7
    .line 8
    const-string v3, "Only started streams should be closed."

    .line 9
    .line 10
    invoke-static {v0, v3, v2}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    sget-object v0, Lv9/r;->e:Lv9/r;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    if-eq p1, v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p2}, Lmd/k0;->f()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v3, v1

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    :goto_0
    move v3, v2

    .line 28
    :goto_1
    const-string v4, "Can\'t provide an error when not in an error state."

    .line 29
    .line 30
    new-array v5, v1, [Ljava/lang/Object;

    .line 31
    .line 32
    invoke-static {v3, v4, v5}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object v3, p0, Lv9/b;->f:Lw9/e;

    .line 36
    .line 37
    invoke-virtual {v3}, Lw9/e;->d()V

    .line 38
    .line 39
    .line 40
    sget-object v3, Lv9/g;->d:Ljava/util/HashSet;

    .line 41
    .line 42
    iget-object v3, p2, Lmd/k0;->a:Lmd/j0;

    .line 43
    .line 44
    iget-object v3, p2, Lmd/k0;->c:Ljava/lang/Throwable;

    .line 45
    .line 46
    instance-of v4, v3, Ljavax/net/ssl/SSLHandshakeException;

    .line 47
    .line 48
    if-eqz v4, :cond_2

    .line 49
    .line 50
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    const-string v5, "no ciphers available"

    .line 55
    .line 56
    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 57
    .line 58
    .line 59
    :cond_2
    iget-object v4, p0, Lv9/b;->b:Lme/a;

    .line 60
    .line 61
    const/4 v5, 0x0

    .line 62
    if-eqz v4, :cond_3

    .line 63
    .line 64
    invoke-virtual {v4}, Lme/a;->n()V

    .line 65
    .line 66
    .line 67
    iput-object v5, p0, Lv9/b;->b:Lme/a;

    .line 68
    .line 69
    :cond_3
    iget-object v4, p0, Lv9/b;->a:Lme/a;

    .line 70
    .line 71
    if-eqz v4, :cond_4

    .line 72
    .line 73
    invoke-virtual {v4}, Lme/a;->n()V

    .line 74
    .line 75
    .line 76
    iput-object v5, p0, Lv9/b;->a:Lme/a;

    .line 77
    .line 78
    :cond_4
    iget-object v4, p0, Lv9/b;->k:Lw9/l;

    .line 79
    .line 80
    iget-object v6, v4, Lw9/l;->h:Lme/a;

    .line 81
    .line 82
    if-eqz v6, :cond_5

    .line 83
    .line 84
    invoke-virtual {v6}, Lme/a;->n()V

    .line 85
    .line 86
    .line 87
    iput-object v5, v4, Lw9/l;->h:Lme/a;

    .line 88
    .line 89
    :cond_5
    iget-wide v6, p0, Lv9/b;->i:J

    .line 90
    .line 91
    const-wide/16 v8, 0x1

    .line 92
    .line 93
    add-long/2addr v6, v8

    .line 94
    iput-wide v6, p0, Lv9/b;->i:J

    .line 95
    .line 96
    sget-object v6, Lmd/j0;->c:Lmd/j0;

    .line 97
    .line 98
    iget-object v7, p2, Lmd/k0;->a:Lmd/j0;

    .line 99
    .line 100
    if-ne v7, v6, :cond_6

    .line 101
    .line 102
    const-wide/16 v6, 0x0

    .line 103
    .line 104
    iput-wide v6, v4, Lw9/l;->f:J

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_6
    sget-object v6, Lmd/j0;->k:Lmd/j0;

    .line 108
    .line 109
    if-ne v7, v6, :cond_7

    .line 110
    .line 111
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 120
    .line 121
    .line 122
    move-result v6

    .line 123
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 124
    .line 125
    .line 126
    move-result-object v6

    .line 127
    new-array v7, v2, [Ljava/lang/Object;

    .line 128
    .line 129
    aput-object v6, v7, v1

    .line 130
    .line 131
    const-string v6, "(%x) Using maximum backoff delay to prevent overloading the backend."

    .line 132
    .line 133
    invoke-static {v3, v6, v2, v7}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    iget-wide v6, v4, Lw9/l;->e:J

    .line 137
    .line 138
    iput-wide v6, v4, Lw9/l;->f:J

    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_7
    sget-object v6, Lmd/j0;->s:Lmd/j0;

    .line 142
    .line 143
    if-ne v7, v6, :cond_8

    .line 144
    .line 145
    iget-object v6, p0, Lv9/b;->h:Lv9/r;

    .line 146
    .line 147
    sget-object v8, Lv9/r;->d:Lv9/r;

    .line 148
    .line 149
    if-eq v6, v8, :cond_8

    .line 150
    .line 151
    iget-object v3, p0, Lv9/b;->c:Lv9/m;

    .line 152
    .line 153
    iget-object v4, v3, Lv9/m;->b:Ln9/d;

    .line 154
    .line 155
    invoke-virtual {v4}, Ln9/d;->Y()V

    .line 156
    .line 157
    .line 158
    iget-object v3, v3, Lv9/m;->c:Ln9/b;

    .line 159
    .line 160
    invoke-virtual {v3}, Ln9/b;->X()V

    .line 161
    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_8
    sget-object v6, Lmd/j0;->q:Lmd/j0;

    .line 165
    .line 166
    if-ne v7, v6, :cond_a

    .line 167
    .line 168
    instance-of v6, v3, Ljava/net/UnknownHostException;

    .line 169
    .line 170
    if-nez v6, :cond_9

    .line 171
    .line 172
    instance-of v3, v3, Ljava/net/ConnectException;

    .line 173
    .line 174
    if-eqz v3, :cond_a

    .line 175
    .line 176
    :cond_9
    sget-wide v6, Lv9/b;->q:J

    .line 177
    .line 178
    iput-wide v6, v4, Lw9/l;->e:J

    .line 179
    .line 180
    :cond_a
    :goto_2
    if-eq p1, v0, :cond_b

    .line 181
    .line 182
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 191
    .line 192
    .line 193
    move-result v3

    .line 194
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 195
    .line 196
    .line 197
    move-result-object v3

    .line 198
    new-array v4, v2, [Ljava/lang/Object;

    .line 199
    .line 200
    aput-object v3, v4, v1

    .line 201
    .line 202
    const-string v3, "(%x) Performing stream teardown"

    .line 203
    .line 204
    invoke-static {v0, v3, v2, v4}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {p0}, Lv9/b;->h()V

    .line 208
    .line 209
    .line 210
    :cond_b
    iget-object v0, p0, Lv9/b;->j:Lv9/k;

    .line 211
    .line 212
    if-eqz v0, :cond_d

    .line 213
    .line 214
    invoke-virtual {p2}, Lmd/k0;->f()Z

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    if-eqz v0, :cond_c

    .line 219
    .line 220
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 229
    .line 230
    .line 231
    move-result v3

    .line 232
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 233
    .line 234
    .line 235
    move-result-object v3

    .line 236
    new-array v4, v2, [Ljava/lang/Object;

    .line 237
    .line 238
    aput-object v3, v4, v1

    .line 239
    .line 240
    const-string v1, "(%x) Closing stream client-side"

    .line 241
    .line 242
    invoke-static {v0, v1, v2, v4}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    iget-object v0, p0, Lv9/b;->j:Lv9/k;

    .line 246
    .line 247
    invoke-virtual {v0}, Lv9/k;->b()V

    .line 248
    .line 249
    .line 250
    :cond_c
    iput-object v5, p0, Lv9/b;->j:Lv9/k;

    .line 251
    .line 252
    :cond_d
    iput-object p1, p0, Lv9/b;->h:Lv9/r;

    .line 253
    .line 254
    iget-object p1, p0, Lv9/b;->l:Lv9/s;

    .line 255
    .line 256
    invoke-interface {p1, p2}, Lv9/s;->a(Lmd/k0;)V

    .line 257
    .line 258
    .line 259
    return-void
.end method

.method public final b()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lv9/b;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    xor-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    new-array v1, v1, [Ljava/lang/Object;

    .line 9
    .line 10
    const-string v2, "Can only inhibit backoff after in a stopped state"

    .line 11
    .line 12
    invoke-static {v0, v2, v1}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lv9/b;->f:Lw9/e;

    .line 16
    .line 17
    invoke-virtual {v0}, Lw9/e;->d()V

    .line 18
    .line 19
    .line 20
    sget-object v0, Lv9/r;->a:Lv9/r;

    .line 21
    .line 22
    iput-object v0, p0, Lv9/b;->h:Lv9/r;

    .line 23
    .line 24
    const-wide/16 v0, 0x0

    .line 25
    .line 26
    iget-object v2, p0, Lv9/b;->k:Lw9/l;

    .line 27
    .line 28
    iput-wide v0, v2, Lw9/l;->f:J

    .line 29
    .line 30
    return-void
.end method

.method public final c()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lv9/b;->f:Lw9/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Lw9/e;->d()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lv9/b;->h:Lv9/r;

    .line 7
    .line 8
    sget-object v1, Lv9/r;->c:Lv9/r;

    .line 9
    .line 10
    if-eq v0, v1, :cond_1

    .line 11
    .line 12
    sget-object v1, Lv9/r;->d:Lv9/r;

    .line 13
    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0

    .line 19
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 20
    return v0
.end method

.method public final d()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lv9/b;->f:Lw9/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Lw9/e;->d()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lv9/b;->h:Lv9/r;

    .line 7
    .line 8
    sget-object v1, Lv9/r;->b:Lv9/r;

    .line 9
    .line 10
    if-eq v0, v1, :cond_1

    .line 11
    .line 12
    sget-object v1, Lv9/r;->f:Lv9/r;

    .line 13
    .line 14
    if-eq v0, v1, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0}, Lv9/b;->c()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    return v0

    .line 25
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 26
    return v0
.end method

.method public abstract e(Lcom/google/protobuf/MessageLite;)V
.end method

.method public abstract f(Lcom/google/protobuf/MessageLite;)V
.end method

.method public g()V
    .locals 9

    .line 1
    iget-object v0, p0, Lv9/b;->f:Lw9/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Lw9/e;->d()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lv9/b;->j:Lv9/k;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    move v0, v1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v0, v2

    .line 15
    :goto_0
    const-string v3, "Last call still set"

    .line 16
    .line 17
    new-array v4, v2, [Ljava/lang/Object;

    .line 18
    .line 19
    invoke-static {v0, v3, v4}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lv9/b;->b:Lme/a;

    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    move v0, v1

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move v0, v2

    .line 29
    :goto_1
    const-string v3, "Idle timer still set"

    .line 30
    .line 31
    new-array v4, v2, [Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {v0, v3, v4}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lv9/b;->h:Lv9/r;

    .line 37
    .line 38
    sget-object v3, Lv9/r;->e:Lv9/r;

    .line 39
    .line 40
    if-ne v0, v3, :cond_3

    .line 41
    .line 42
    if-ne v0, v3, :cond_2

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_2
    move v1, v2

    .line 46
    :goto_2
    const-string v0, "Should only perform backoff in an error state"

    .line 47
    .line 48
    new-array v3, v2, [Ljava/lang/Object;

    .line 49
    .line 50
    invoke-static {v1, v0, v3}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    sget-object v0, Lv9/r;->f:Lv9/r;

    .line 54
    .line 55
    iput-object v0, p0, Lv9/b;->h:Lv9/r;

    .line 56
    .line 57
    new-instance v0, Lv9/a;

    .line 58
    .line 59
    invoke-direct {v0, p0, v2}, Lv9/a;-><init>(Lv9/b;I)V

    .line 60
    .line 61
    .line 62
    iget-object v1, p0, Lv9/b;->k:Lw9/l;

    .line 63
    .line 64
    invoke-virtual {v1, v0}, Lw9/l;->a(Ljava/lang/Runnable;)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_3
    sget-object v3, Lv9/r;->a:Lv9/r;

    .line 69
    .line 70
    if-ne v0, v3, :cond_4

    .line 71
    .line 72
    move v0, v1

    .line 73
    goto :goto_3

    .line 74
    :cond_4
    move v0, v2

    .line 75
    :goto_3
    const-string v3, "Already started"

    .line 76
    .line 77
    new-array v4, v2, [Ljava/lang/Object;

    .line 78
    .line 79
    invoke-static {v0, v3, v4}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    new-instance v0, LA2/d;

    .line 83
    .line 84
    iget-wide v3, p0, Lv9/b;->i:J

    .line 85
    .line 86
    const/16 v5, 0xc

    .line 87
    .line 88
    invoke-direct {v0, p0, v3, v4, v5}, LA2/d;-><init>(Ljava/lang/Object;JI)V

    .line 89
    .line 90
    .line 91
    new-instance v3, LE4/n;

    .line 92
    .line 93
    invoke-direct {v3, p0, v0}, LE4/n;-><init>(Lv9/b;LA2/d;)V

    .line 94
    .line 95
    .line 96
    new-array v0, v1, [Lmd/f;

    .line 97
    .line 98
    const/4 v1, 0x0

    .line 99
    aput-object v1, v0, v2

    .line 100
    .line 101
    iget-object v1, p0, Lv9/b;->c:Lv9/m;

    .line 102
    .line 103
    iget-object v2, v1, Lv9/m;->d:LX8/c;

    .line 104
    .line 105
    iget-object v4, p0, Lv9/b;->d:LF6/r;

    .line 106
    .line 107
    iget-object v5, v2, LX8/c;->a:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v5, Lcom/google/android/gms/tasks/Task;

    .line 110
    .line 111
    iget-object v6, v2, LX8/c;->b:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v6, Lw9/e;

    .line 114
    .line 115
    iget-object v6, v6, Lw9/e;->a:Lw9/c;

    .line 116
    .line 117
    new-instance v7, Laa/f;

    .line 118
    .line 119
    const/16 v8, 0x1a

    .line 120
    .line 121
    invoke-direct {v7, v8, v2, v4}, Laa/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v5, v6, v7}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    iget-object v4, v1, Lv9/m;->a:Lw9/e;

    .line 129
    .line 130
    iget-object v4, v4, Lw9/e;->a:Lw9/c;

    .line 131
    .line 132
    new-instance v5, LA5/g;

    .line 133
    .line 134
    const/16 v6, 0x16

    .line 135
    .line 136
    invoke-direct {v5, v1, v0, v3, v6}, LA5/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v2, v4, v5}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 140
    .line 141
    .line 142
    new-instance v3, Lv9/k;

    .line 143
    .line 144
    invoke-direct {v3, v1, v0, v2}, Lv9/k;-><init>(Lv9/m;[Lmd/f;Lcom/google/android/gms/tasks/Task;)V

    .line 145
    .line 146
    .line 147
    iput-object v3, p0, Lv9/b;->j:Lv9/k;

    .line 148
    .line 149
    sget-object v0, Lv9/r;->b:Lv9/r;

    .line 150
    .line 151
    iput-object v0, p0, Lv9/b;->h:Lv9/r;

    .line 152
    .line 153
    return-void
.end method

.method public h()V
    .locals 0

    .line 1
    return-void
.end method

.method public final i(Lcom/google/protobuf/GeneratedMessageLite;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lv9/b;->f:Lw9/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Lw9/e;->d()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const/4 v2, 0x2

    .line 23
    new-array v2, v2, [Ljava/lang/Object;

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    aput-object v1, v2, v3

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    aput-object p1, v2, v1

    .line 30
    .line 31
    const-string v3, "(%x) Stream sending: %s"

    .line 32
    .line 33
    invoke-static {v0, v3, v1, v2}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lv9/b;->b:Lme/a;

    .line 37
    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    invoke-virtual {v0}, Lme/a;->n()V

    .line 41
    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    iput-object v0, p0, Lv9/b;->b:Lme/a;

    .line 45
    .line 46
    :cond_0
    iget-object v0, p0, Lv9/b;->j:Lv9/k;

    .line 47
    .line 48
    invoke-virtual {v0, p1}, Lmd/x;->d(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method
