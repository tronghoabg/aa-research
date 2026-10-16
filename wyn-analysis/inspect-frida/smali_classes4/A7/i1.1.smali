.class public final LA7/i1;
.super LA7/Y;
.source "SourceFile"


# instance fields
.field public volatile c:LA7/j1;

.field public volatile d:LA7/j1;

.field public e:LA7/j1;

.field public final f:Lj$/util/concurrent/ConcurrentHashMap;

.field public g:Landroid/app/Activity;

.field public volatile h:Z

.field public volatile i:LA7/j1;

.field public j:LA7/j1;

.field public k:Z

.field public final l:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LA7/n0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LA7/Y;-><init>(LA7/n0;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LA7/i1;->l:Ljava/lang/Object;

    .line 10
    .line 11
    new-instance p1, Lj$/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    invoke-direct {p1}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, LA7/i1;->f:Lj$/util/concurrent/ConcurrentHashMap;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final j0()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final k0(Z)LA7/j1;
    .locals 0

    .line 1
    invoke-virtual {p0}, LA7/Y;->h0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LA7/B;->c0()V

    .line 5
    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, LA7/i1;->e:LA7/j1;

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    iget-object p1, p0, LA7/i1;->e:LA7/j1;

    .line 13
    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    return-object p1

    .line 17
    :cond_1
    iget-object p1, p0, LA7/i1;->j:LA7/j1;

    .line 18
    .line 19
    return-object p1
.end method

.method public final l0(Ljava/lang/Class;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    const-string p1, "Activity"

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    const-string v0, "\\."

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    array-length v0, p1

    .line 17
    if-lez v0, :cond_1

    .line 18
    .line 19
    array-length v0, p1

    .line 20
    add-int/lit8 v0, v0, -0x1

    .line 21
    .line 22
    aget-object p1, p1, v0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const-string p1, ""

    .line 26
    .line 27
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iget-object v1, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, LA7/n0;

    .line 34
    .line 35
    iget-object v2, v1, LA7/n0;->g:LA7/e;

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    const/16 v2, 0x1f4

    .line 41
    .line 42
    if-le v0, v2, :cond_2

    .line 43
    .line 44
    iget-object v0, v1, LA7/n0;->g:LA7/e;

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    const/4 v0, 0x0

    .line 50
    invoke-virtual {p1, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    :cond_2
    return-object p1
.end method

.method public final m0(LA7/j1;LA7/j1;JZLandroid/os/Bundle;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-wide/from16 v3, p3

    .line 8
    .line 9
    move-object/from16 v5, p6

    .line 10
    .line 11
    invoke-virtual {v0}, LA7/B;->c0()V

    .line 12
    .line 13
    .line 14
    const/4 v6, 0x0

    .line 15
    const/4 v7, 0x1

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    iget-wide v8, v1, LA7/j1;->c:J

    .line 19
    .line 20
    iget-wide v10, v2, LA7/j1;->c:J

    .line 21
    .line 22
    cmp-long v8, v10, v8

    .line 23
    .line 24
    if-nez v8, :cond_1

    .line 25
    .line 26
    iget-object v8, v2, LA7/j1;->b:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v9, v1, LA7/j1;->b:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v8, v9}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v8

    .line 34
    if-eqz v8, :cond_1

    .line 35
    .line 36
    iget-object v8, v2, LA7/j1;->a:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v9, v1, LA7/j1;->a:Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {v8, v9}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v8

    .line 44
    if-nez v8, :cond_0

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    move v8, v6

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    :goto_0
    move v8, v7

    .line 50
    :goto_1
    if-eqz p5, :cond_2

    .line 51
    .line 52
    iget-object v9, v0, LA7/i1;->e:LA7/j1;

    .line 53
    .line 54
    if-eqz v9, :cond_2

    .line 55
    .line 56
    move v6, v7

    .line 57
    :cond_2
    iget-boolean v9, v1, LA7/j1;->e:Z

    .line 58
    .line 59
    iget-object v10, v0, LA7/B0;->a:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v10, LA7/n0;

    .line 62
    .line 63
    if-eqz v8, :cond_c

    .line 64
    .line 65
    new-instance v8, Landroid/os/Bundle;

    .line 66
    .line 67
    if-eqz v5, :cond_3

    .line 68
    .line 69
    invoke-direct {v8, v5}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 70
    .line 71
    .line 72
    :goto_2
    move-object v14, v8

    .line 73
    goto :goto_3

    .line 74
    :cond_3
    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 75
    .line 76
    .line 77
    goto :goto_2

    .line 78
    :goto_3
    invoke-static {v1, v14, v7}, LA7/U1;->u0(LA7/j1;Landroid/os/Bundle;Z)V

    .line 79
    .line 80
    .line 81
    if-eqz v2, :cond_6

    .line 82
    .line 83
    iget-object v5, v2, LA7/j1;->a:Ljava/lang/String;

    .line 84
    .line 85
    if-eqz v5, :cond_4

    .line 86
    .line 87
    const-string v8, "_pn"

    .line 88
    .line 89
    invoke-virtual {v14, v8, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    :cond_4
    iget-object v5, v2, LA7/j1;->b:Ljava/lang/String;

    .line 93
    .line 94
    if-eqz v5, :cond_5

    .line 95
    .line 96
    const-string v8, "_pc"

    .line 97
    .line 98
    invoke-virtual {v14, v8, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    :cond_5
    const-string v5, "_pi"

    .line 102
    .line 103
    iget-wide v11, v2, LA7/j1;->c:J

    .line 104
    .line 105
    invoke-virtual {v14, v5, v11, v12}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 106
    .line 107
    .line 108
    :cond_6
    if-eqz v6, :cond_7

    .line 109
    .line 110
    invoke-virtual {v0}, LA7/B;->g0()LA7/x1;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    iget-object v2, v2, LA7/x1;->f:LA7/B1;

    .line 115
    .line 116
    const-wide/16 p5, 0x0

    .line 117
    .line 118
    iget-wide v11, v2, LA7/B1;->c:J

    .line 119
    .line 120
    sub-long v11, v3, v11

    .line 121
    .line 122
    iput-wide v3, v2, LA7/B1;->c:J

    .line 123
    .line 124
    cmp-long v2, v11, p5

    .line 125
    .line 126
    if-lez v2, :cond_8

    .line 127
    .line 128
    invoke-virtual {v0}, LA7/B0;->b0()LA7/U1;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    invoke-virtual {v2, v14, v11, v12}, LA7/U1;->w0(Landroid/os/Bundle;J)V

    .line 133
    .line 134
    .line 135
    goto :goto_4

    .line 136
    :cond_7
    const-wide/16 p5, 0x0

    .line 137
    .line 138
    :cond_8
    :goto_4
    iget-object v2, v10, LA7/n0;->g:LA7/e;

    .line 139
    .line 140
    invoke-virtual {v2}, LA7/e;->q0()Z

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    if-nez v2, :cond_9

    .line 145
    .line 146
    const-string v2, "_mst"

    .line 147
    .line 148
    const-wide/16 v11, 0x1

    .line 149
    .line 150
    invoke-virtual {v14, v2, v11, v12}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 151
    .line 152
    .line 153
    :cond_9
    if-eqz v9, :cond_a

    .line 154
    .line 155
    const-string v2, "app"

    .line 156
    .line 157
    :goto_5
    move-object v12, v2

    .line 158
    goto :goto_6

    .line 159
    :cond_a
    const-string v2, "auto"

    .line 160
    .line 161
    goto :goto_5

    .line 162
    :goto_6
    iget-object v2, v10, LA7/n0;->n:Ln7/b;

    .line 163
    .line 164
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 168
    .line 169
    .line 170
    move-result-wide v15

    .line 171
    if-eqz v9, :cond_b

    .line 172
    .line 173
    iget-wide v7, v1, LA7/j1;->f:J

    .line 174
    .line 175
    cmp-long v5, v7, p5

    .line 176
    .line 177
    if-eqz v5, :cond_b

    .line 178
    .line 179
    move-wide v15, v7

    .line 180
    :cond_b
    invoke-virtual {v0}, LA7/B;->e0()LA7/P0;

    .line 181
    .line 182
    .line 183
    move-result-object v11

    .line 184
    const-string v13, "_vs"

    .line 185
    .line 186
    invoke-virtual/range {v11 .. v16}, LA7/P0;->v0(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V

    .line 187
    .line 188
    .line 189
    :cond_c
    if-eqz v6, :cond_d

    .line 190
    .line 191
    iget-object v5, v0, LA7/i1;->e:LA7/j1;

    .line 192
    .line 193
    const/4 v2, 0x1

    .line 194
    invoke-virtual {v0, v5, v2, v3, v4}, LA7/i1;->n0(LA7/j1;ZJ)V

    .line 195
    .line 196
    .line 197
    :cond_d
    iput-object v1, v0, LA7/i1;->e:LA7/j1;

    .line 198
    .line 199
    if-eqz v9, :cond_e

    .line 200
    .line 201
    iput-object v1, v0, LA7/i1;->j:LA7/j1;

    .line 202
    .line 203
    :cond_e
    invoke-static {v10}, LA7/p0;->h(LA7/n0;)LA7/m1;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    new-instance v3, LA7/p;

    .line 208
    .line 209
    const/16 v4, 0xa

    .line 210
    .line 211
    invoke-direct {v3, v4, v2, v1}, LA7/p;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v2, v3}, LA7/m1;->m0(Ljava/lang/Runnable;)V

    .line 215
    .line 216
    .line 217
    return-void
.end method

.method public final n0(LA7/j1;ZJ)V
    .locals 4

    .line 1
    iget-object v0, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LA7/n0;

    .line 4
    .line 5
    invoke-virtual {v0}, LA7/n0;->h()LA7/r;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v0, v0, LA7/n0;->n:Ln7/b;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 15
    .line 16
    .line 17
    move-result-wide v2

    .line 18
    invoke-virtual {v1, v2, v3}, LA7/r;->h0(J)V

    .line 19
    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    iget-boolean v1, p1, LA7/j1;->d:Z

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move v1, v0

    .line 31
    :goto_0
    invoke-virtual {p0}, LA7/B;->g0()LA7/x1;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    iget-object v2, v2, LA7/x1;->f:LA7/B1;

    .line 36
    .line 37
    invoke-virtual {v2, p3, p4, v1, p2}, LA7/B1;->c(JZZ)Z

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    if-eqz p2, :cond_1

    .line 42
    .line 43
    if-eqz p1, :cond_1

    .line 44
    .line 45
    iput-boolean v0, p1, LA7/j1;->d:Z

    .line 46
    .line 47
    :cond_1
    return-void
.end method

.method public final o0(Landroid/app/Activity;LA7/j1;Z)V
    .locals 12

    .line 1
    iget-object v2, p0, LA7/i1;->c:LA7/j1;

    .line 2
    .line 3
    if-nez v2, :cond_0

    .line 4
    .line 5
    iget-object v2, p0, LA7/i1;->d:LA7/j1;

    .line 6
    .line 7
    :goto_0
    move-object v3, v2

    .line 8
    goto :goto_1

    .line 9
    :cond_0
    iget-object v2, p0, LA7/i1;->c:LA7/j1;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :goto_1
    iget-object v2, p2, LA7/j1;->b:Ljava/lang/String;

    .line 13
    .line 14
    if-nez v2, :cond_1

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {p0, v2}, LA7/i1;->l0(Ljava/lang/Class;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v6

    .line 24
    new-instance v4, LA7/j1;

    .line 25
    .line 26
    iget-object v5, p2, LA7/j1;->a:Ljava/lang/String;

    .line 27
    .line 28
    iget-wide v7, p2, LA7/j1;->c:J

    .line 29
    .line 30
    iget-boolean v9, p2, LA7/j1;->e:Z

    .line 31
    .line 32
    iget-wide v10, p2, LA7/j1;->f:J

    .line 33
    .line 34
    invoke-direct/range {v4 .. v11}, LA7/j1;-><init>(Ljava/lang/String;Ljava/lang/String;JZJ)V

    .line 35
    .line 36
    .line 37
    move-object v2, v4

    .line 38
    goto :goto_2

    .line 39
    :cond_1
    move-object v2, p2

    .line 40
    :goto_2
    iget-object v0, p0, LA7/i1;->c:LA7/j1;

    .line 41
    .line 42
    iput-object v0, p0, LA7/i1;->d:LA7/j1;

    .line 43
    .line 44
    iput-object v2, p0, LA7/i1;->c:LA7/j1;

    .line 45
    .line 46
    iget-object v0, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, LA7/n0;

    .line 49
    .line 50
    iget-object v0, v0, LA7/n0;->n:Ln7/b;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 56
    .line 57
    .line 58
    move-result-wide v4

    .line 59
    invoke-virtual {p0}, LA7/B0;->zzl()LA7/k0;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    new-instance v0, LA7/d1;

    .line 64
    .line 65
    move-object v1, p0

    .line 66
    move v6, p3

    .line 67
    invoke-direct/range {v0 .. v6}, LA7/d1;-><init>(LA7/i1;LA7/j1;LA7/j1;JZ)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v7, v0}, LA7/k0;->m0(Ljava/lang/Runnable;)V

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public final p0(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 5

    .line 1
    iget-object v0, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LA7/n0;

    .line 4
    .line 5
    iget-object v0, v0, LA7/n0;->g:LA7/e;

    .line 6
    .line 7
    invoke-virtual {v0}, LA7/e;->q0()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    if-nez p2, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    const-string v0, "com.google.app_measurement.screen_service"

    .line 18
    .line 19
    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    if-nez p2, :cond_2

    .line 24
    .line 25
    :goto_0
    return-void

    .line 26
    :cond_2
    new-instance v0, LA7/j1;

    .line 27
    .line 28
    const-string v1, "name"

    .line 29
    .line 30
    invoke-virtual {p2, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const-string v2, "referrer_name"

    .line 35
    .line 36
    invoke-virtual {p2, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    const-string v3, "id"

    .line 41
    .line 42
    invoke-virtual {p2, v3}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 43
    .line 44
    .line 45
    move-result-wide v3

    .line 46
    invoke-direct {v0, v1, v2, v3, v4}, LA7/j1;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    .line 47
    .line 48
    .line 49
    iget-object p2, p0, LA7/i1;->f:Lj$/util/concurrent/ConcurrentHashMap;

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {p2, p1, v0}, Lj$/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public final q0(Landroid/app/Activity;)LA7/j1;
    .locals 5

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LA7/i1;->f:Lj$/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Lj$/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, LA7/j1;

    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {p0, v0}, LA7/i1;->l0(Ljava/lang/Class;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    new-instance v1, LA7/j1;

    .line 31
    .line 32
    invoke-virtual {p0}, LA7/B0;->b0()LA7/U1;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v2}, LA7/U1;->o1()J

    .line 37
    .line 38
    .line 39
    move-result-wide v2

    .line 40
    const/4 v4, 0x0

    .line 41
    invoke-direct {v1, v4, v0, v2, v3}, LA7/j1;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, LA7/i1;->f:Lj$/util/concurrent/ConcurrentHashMap;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {v0, p1, v1}, Lj$/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-object v0, v1

    .line 58
    :cond_0
    iget-object p1, p0, LA7/i1;->i:LA7/j1;

    .line 59
    .line 60
    if-eqz p1, :cond_1

    .line 61
    .line 62
    iget-object p1, p0, LA7/i1;->i:LA7/j1;

    .line 63
    .line 64
    return-object p1

    .line 65
    :cond_1
    return-object v0
.end method
