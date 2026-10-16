.class public final Lcom/google/android/gms/common/api/internal/M;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;
.implements Lh2/i;


# instance fields
.field public a:J

.field public b:J

.field public c:I

.field public final d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/internal/i;ILcom/google/android/gms/common/api/internal/b;JJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/M;->d:Ljava/lang/Object;

    iput p2, p0, Lcom/google/android/gms/common/api/internal/M;->c:I

    iput-object p3, p0, Lcom/google/android/gms/common/api/internal/M;->e:Ljava/lang/Object;

    iput-wide p4, p0, Lcom/google/android/gms/common/api/internal/M;->a:J

    iput-wide p6, p0, Lcom/google/android/gms/common/api/internal/M;->b:J

    return-void
.end method

.method public constructor <init>(Lg2/l;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/M;->d:Ljava/lang/Object;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    iput-wide v0, p0, Lcom/google/android/gms/common/api/internal/M;->a:J

    const-wide/16 v0, 0x0

    .line 5
    iput-wide v0, p0, Lcom/google/android/gms/common/api/internal/M;->b:J

    const/4 p1, -0x1

    .line 6
    iput p1, p0, Lcom/google/android/gms/common/api/internal/M;->c:I

    return-void
.end method

.method public static e(Lcom/google/android/gms/common/api/internal/H;Lcom/google/android/gms/common/internal/f;I)Lcom/google/android/gms/common/internal/j;
    .locals 4

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/f;->getTelemetryConfiguration()Lcom/google/android/gms/common/internal/j;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p1, :cond_5

    .line 7
    .line 8
    iget-boolean v1, p1, Lcom/google/android/gms/common/internal/j;->b:Z

    .line 9
    .line 10
    if-eqz v1, :cond_5

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    iget-object v2, p1, Lcom/google/android/gms/common/internal/j;->d:[I

    .line 14
    .line 15
    if-nez v2, :cond_2

    .line 16
    .line 17
    iget-object v2, p1, Lcom/google/android/gms/common/internal/j;->f:[I

    .line 18
    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    goto :goto_2

    .line 22
    :cond_0
    :goto_0
    array-length v3, v2

    .line 23
    if-ge v1, v3, :cond_3

    .line 24
    .line 25
    aget v3, v2, v1

    .line 26
    .line 27
    if-ne v3, p2, :cond_1

    .line 28
    .line 29
    return-object v0

    .line 30
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    :goto_1
    array-length v3, v2

    .line 34
    if-ge v1, v3, :cond_5

    .line 35
    .line 36
    aget v3, v2, v1

    .line 37
    .line 38
    if-ne v3, p2, :cond_4

    .line 39
    .line 40
    :cond_3
    :goto_2
    iget p0, p0, Lcom/google/android/gms/common/api/internal/H;->l:I

    .line 41
    .line 42
    iget p2, p1, Lcom/google/android/gms/common/internal/j;->e:I

    .line 43
    .line 44
    if-ge p0, p2, :cond_5

    .line 45
    .line 46
    return-object p1

    .line 47
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_5
    return-object v0
.end method


# virtual methods
.method public a(JJ)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/google/android/gms/common/api/internal/M;->a:J

    .line 2
    .line 3
    iput-wide p3, p0, Lcom/google/android/gms/common/api/internal/M;->b:J

    .line 4
    .line 5
    return-void
.end method

.method public b(LQ1/o;JIZ)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p4

    .line 4
    .line 5
    iget-object v2, v0, Lcom/google/android/gms/common/api/internal/M;->e:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ls2/C;

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget v2, v0, Lcom/google/android/gms/common/api/internal/M;->c:I

    .line 13
    .line 14
    const/4 v3, -0x1

    .line 15
    if-eq v2, v3, :cond_0

    .line 16
    .line 17
    invoke-static {v2}, Lg2/i;->a(I)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eq v1, v2, :cond_0

    .line 22
    .line 23
    sget v3, LQ1/x;->a:I

    .line 24
    .line 25
    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 26
    .line 27
    const-string v3, "Received RTP packet with unexpected sequence number. Expected: "

    .line 28
    .line 29
    const-string v4, "; received: "

    .line 30
    .line 31
    const-string v5, "."

    .line 32
    .line 33
    invoke-static {v3, v2, v4, v1, v5}, LN0/a;->e(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    const-string v3, "RtpPcmReader"

    .line 38
    .line 39
    invoke-static {v3, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 40
    .line 41
    .line 42
    :cond_0
    iget-wide v4, v0, Lcom/google/android/gms/common/api/internal/M;->b:J

    .line 43
    .line 44
    iget-wide v9, v0, Lcom/google/android/gms/common/api/internal/M;->a:J

    .line 45
    .line 46
    iget-object v2, v0, Lcom/google/android/gms/common/api/internal/M;->d:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v2, Lg2/l;

    .line 49
    .line 50
    iget v8, v2, Lg2/l;->b:I

    .line 51
    .line 52
    move-wide/from16 v6, p2

    .line 53
    .line 54
    invoke-static/range {v4 .. v10}, LS3/f;->N(JJIJ)J

    .line 55
    .line 56
    .line 57
    move-result-wide v12

    .line 58
    invoke-virtual/range {p1 .. p1}, LQ1/o;->a()I

    .line 59
    .line 60
    .line 61
    move-result v15

    .line 62
    iget-object v2, v0, Lcom/google/android/gms/common/api/internal/M;->e:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v2, Ls2/C;

    .line 65
    .line 66
    move-object/from16 v3, p1

    .line 67
    .line 68
    invoke-interface {v2, v15, v3}, Ls2/C;->e(ILQ1/o;)V

    .line 69
    .line 70
    .line 71
    iget-object v2, v0, Lcom/google/android/gms/common/api/internal/M;->e:Ljava/lang/Object;

    .line 72
    .line 73
    move-object v11, v2

    .line 74
    check-cast v11, Ls2/C;

    .line 75
    .line 76
    const/16 v17, 0x0

    .line 77
    .line 78
    const/4 v14, 0x1

    .line 79
    const/16 v16, 0x0

    .line 80
    .line 81
    invoke-interface/range {v11 .. v17}, Ls2/C;->a(JIIILs2/B;)V

    .line 82
    .line 83
    .line 84
    iput v1, v0, Lcom/google/android/gms/common/api/internal/M;->c:I

    .line 85
    .line 86
    return-void
.end method

.method public c(Ls2/o;I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-interface {p1, p2, v0}, Ls2/o;->m(II)Ls2/C;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/M;->e:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object p2, p0, Lcom/google/android/gms/common/api/internal/M;->d:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p2, Lg2/l;

    .line 11
    .line 12
    iget-object p2, p2, Lg2/l;->c:LN1/n;

    .line 13
    .line 14
    invoke-interface {p1, p2}, Ls2/C;->c(LN1/n;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public d(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/google/android/gms/common/api/internal/M;->a:J

    .line 2
    .line 3
    return-void
.end method

.method public onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/M;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lcom/google/android/gms/common/api/internal/i;

    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/i;->c()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    goto/16 :goto_8

    .line 14
    .line 15
    :cond_0
    invoke-static {}, Lcom/google/android/gms/common/internal/w;->c()Lcom/google/android/gms/common/internal/w;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget-object v2, v2, Lcom/google/android/gms/common/internal/w;->a:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, Lcom/google/android/gms/common/internal/x;

    .line 22
    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    iget-boolean v3, v2, Lcom/google/android/gms/common/internal/x;->b:Z

    .line 26
    .line 27
    if-eqz v3, :cond_b

    .line 28
    .line 29
    :cond_1
    iget-object v3, v1, Lcom/google/android/gms/common/api/internal/i;->j:Lj$/util/concurrent/ConcurrentHashMap;

    .line 30
    .line 31
    iget-object v4, v0, Lcom/google/android/gms/common/api/internal/M;->e:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v4, Lcom/google/android/gms/common/api/internal/b;

    .line 34
    .line 35
    invoke-virtual {v3, v4}, Lj$/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Lcom/google/android/gms/common/api/internal/H;

    .line 40
    .line 41
    if-eqz v3, :cond_b

    .line 42
    .line 43
    iget-object v4, v3, Lcom/google/android/gms/common/api/internal/H;->b:Lcom/google/android/gms/common/api/g;

    .line 44
    .line 45
    instance-of v5, v4, Lcom/google/android/gms/common/internal/f;

    .line 46
    .line 47
    if-eqz v5, :cond_b

    .line 48
    .line 49
    check-cast v4, Lcom/google/android/gms/common/internal/f;

    .line 50
    .line 51
    iget-wide v5, v0, Lcom/google/android/gms/common/api/internal/M;->a:J

    .line 52
    .line 53
    const-wide/16 v7, 0x0

    .line 54
    .line 55
    cmp-long v9, v5, v7

    .line 56
    .line 57
    const/4 v10, 0x1

    .line 58
    const/4 v11, 0x0

    .line 59
    if-lez v9, :cond_2

    .line 60
    .line 61
    move v12, v10

    .line 62
    goto :goto_0

    .line 63
    :cond_2
    move v12, v11

    .line 64
    :goto_0
    invoke-virtual {v4}, Lcom/google/android/gms/common/internal/f;->getGCoreServiceId()I

    .line 65
    .line 66
    .line 67
    move-result v23

    .line 68
    const/16 v13, 0x64

    .line 69
    .line 70
    if-eqz v2, :cond_5

    .line 71
    .line 72
    iget-boolean v14, v2, Lcom/google/android/gms/common/internal/x;->c:Z

    .line 73
    .line 74
    and-int/2addr v12, v14

    .line 75
    invoke-virtual {v4}, Lcom/google/android/gms/common/internal/f;->hasConnectionInfo()Z

    .line 76
    .line 77
    .line 78
    move-result v14

    .line 79
    iget v15, v2, Lcom/google/android/gms/common/internal/x;->d:I

    .line 80
    .line 81
    iget v7, v2, Lcom/google/android/gms/common/internal/x;->a:I

    .line 82
    .line 83
    if-eqz v14, :cond_4

    .line 84
    .line 85
    invoke-virtual {v4}, Lcom/google/android/gms/common/internal/f;->isConnecting()Z

    .line 86
    .line 87
    .line 88
    move-result v8

    .line 89
    if-nez v8, :cond_4

    .line 90
    .line 91
    iget v2, v0, Lcom/google/android/gms/common/api/internal/M;->c:I

    .line 92
    .line 93
    invoke-static {v3, v4, v2}, Lcom/google/android/gms/common/api/internal/M;->e(Lcom/google/android/gms/common/api/internal/H;Lcom/google/android/gms/common/internal/f;I)Lcom/google/android/gms/common/internal/j;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    if-eqz v2, :cond_b

    .line 98
    .line 99
    iget-boolean v3, v2, Lcom/google/android/gms/common/internal/j;->c:Z

    .line 100
    .line 101
    if-eqz v3, :cond_3

    .line 102
    .line 103
    if-lez v9, :cond_3

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_3
    move v10, v11

    .line 107
    :goto_1
    iget v2, v2, Lcom/google/android/gms/common/internal/j;->e:I

    .line 108
    .line 109
    move/from16 v29, v2

    .line 110
    .line 111
    move/from16 v26, v7

    .line 112
    .line 113
    move v12, v10

    .line 114
    :goto_2
    move v2, v15

    .line 115
    goto :goto_3

    .line 116
    :cond_4
    iget v2, v2, Lcom/google/android/gms/common/internal/x;->e:I

    .line 117
    .line 118
    move/from16 v29, v2

    .line 119
    .line 120
    move/from16 v26, v7

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_5
    const/16 v15, 0x1388

    .line 124
    .line 125
    move/from16 v26, v11

    .line 126
    .line 127
    move/from16 v29, v13

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :goto_3
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    const/4 v4, -0x1

    .line 135
    if-eqz v3, :cond_6

    .line 136
    .line 137
    move v15, v11

    .line 138
    goto :goto_5

    .line 139
    :cond_6
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/tasks/Task;->isCanceled()Z

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    if-eqz v3, :cond_7

    .line 144
    .line 145
    move v11, v4

    .line 146
    move v15, v13

    .line 147
    goto :goto_5

    .line 148
    :cond_7
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    instance-of v7, v3, Lcom/google/android/gms/common/api/j;

    .line 153
    .line 154
    if-eqz v7, :cond_9

    .line 155
    .line 156
    check-cast v3, Lcom/google/android/gms/common/api/j;

    .line 157
    .line 158
    invoke-virtual {v3}, Lcom/google/android/gms/common/api/j;->getStatus()Lcom/google/android/gms/common/api/Status;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    iget v11, v3, Lcom/google/android/gms/common/api/Status;->a:I

    .line 163
    .line 164
    iget-object v3, v3, Lcom/google/android/gms/common/api/Status;->d:Ld7/b;

    .line 165
    .line 166
    if-nez v3, :cond_8

    .line 167
    .line 168
    :goto_4
    move v15, v11

    .line 169
    move v11, v4

    .line 170
    goto :goto_5

    .line 171
    :cond_8
    iget v3, v3, Ld7/b;->b:I

    .line 172
    .line 173
    move v15, v11

    .line 174
    move v11, v3

    .line 175
    goto :goto_5

    .line 176
    :cond_9
    const/16 v11, 0x65

    .line 177
    .line 178
    goto :goto_4

    .line 179
    :goto_5
    if-eqz v12, :cond_a

    .line 180
    .line 181
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 182
    .line 183
    .line 184
    move-result-wide v7

    .line 185
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 186
    .line 187
    .line 188
    move-result-wide v3

    .line 189
    iget-wide v9, v0, Lcom/google/android/gms/common/api/internal/M;->b:J

    .line 190
    .line 191
    sub-long/2addr v3, v9

    .line 192
    long-to-int v4, v3

    .line 193
    move-wide/from16 v17, v5

    .line 194
    .line 195
    move-wide/from16 v19, v7

    .line 196
    .line 197
    :goto_6
    move/from16 v24, v4

    .line 198
    .line 199
    goto :goto_7

    .line 200
    :cond_a
    const-wide/16 v17, 0x0

    .line 201
    .line 202
    const-wide/16 v19, 0x0

    .line 203
    .line 204
    goto :goto_6

    .line 205
    :goto_7
    new-instance v25, Lcom/google/android/gms/common/internal/t;

    .line 206
    .line 207
    const/16 v22, 0x0

    .line 208
    .line 209
    iget v14, v0, Lcom/google/android/gms/common/api/internal/M;->c:I

    .line 210
    .line 211
    const/16 v21, 0x0

    .line 212
    .line 213
    move/from16 v16, v11

    .line 214
    .line 215
    move-object/from16 v13, v25

    .line 216
    .line 217
    invoke-direct/range {v13 .. v24}, Lcom/google/android/gms/common/internal/t;-><init>(IIIJJLjava/lang/String;Ljava/lang/String;II)V

    .line 218
    .line 219
    .line 220
    int-to-long v2, v2

    .line 221
    new-instance v24, Lcom/google/android/gms/common/api/internal/N;

    .line 222
    .line 223
    move-wide/from16 v27, v2

    .line 224
    .line 225
    invoke-direct/range {v24 .. v29}, Lcom/google/android/gms/common/api/internal/N;-><init>(Lcom/google/android/gms/common/internal/t;IJI)V

    .line 226
    .line 227
    .line 228
    move-object/from16 v2, v24

    .line 229
    .line 230
    iget-object v1, v1, Lcom/google/android/gms/common/api/internal/i;->n:Lcom/google/android/gms/internal/base/zau;

    .line 231
    .line 232
    const/16 v3, 0x12

    .line 233
    .line 234
    invoke-virtual {v1, v3, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    invoke-virtual {v1, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 239
    .line 240
    .line 241
    :cond_b
    :goto_8
    return-void
.end method
