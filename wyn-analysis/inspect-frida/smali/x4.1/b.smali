.class public final Lx4/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx4/e;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lx4/a;

.field public final c:Lcom/google/android/gms/internal/location/zzbi;

.field public final d:Lx4/k;

.field public final e:I

.field public final f:Lx4/h;

.field public g:Lw4/a;

.field public h:Lx4/l;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lx4/h;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx4/b;->a:Landroid/content/Context;

    .line 5
    .line 6
    sget v0, Lx7/o;->a:I

    .line 7
    .line 8
    new-instance v0, Lcom/google/android/gms/internal/location/zzbi;

    .line 9
    .line 10
    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/location/zzbi;-><init>(Landroid/content/Context;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lx4/b;->c:Lcom/google/android/gms/internal/location/zzbi;

    .line 14
    .line 15
    iput-object p2, p0, Lx4/b;->f:Lx4/h;

    .line 16
    .line 17
    new-instance v0, Lx4/k;

    .line 18
    .line 19
    invoke-direct {v0, p1, p2}, Lx4/k;-><init>(Landroid/content/Context;Lx4/h;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lx4/b;->d:Lx4/k;

    .line 23
    .line 24
    monitor-enter p0

    .line 25
    :try_start_0
    new-instance v0, Ljava/security/SecureRandom;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    .line 28
    .line 29
    .line 30
    const/high16 v1, 0x10000

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    .line 33
    .line 34
    .line 35
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    monitor-exit p0

    .line 37
    iput v0, p0, Lx4/b;->e:I

    .line 38
    .line 39
    new-instance v0, Lx4/a;

    .line 40
    .line 41
    invoke-direct {v0, p0, p2, p1}, Lx4/a;-><init>(Lx4/b;Lx4/h;Landroid/content/Context;)V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, Lx4/b;->b:Lx4/a;

    .line 45
    .line 46
    return-void

    .line 47
    :catchall_0
    move-exception p1

    .line 48
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    throw p1
.end method

.method public static f(Lx4/h;)Lcom/google/android/gms/location/LocationRequest;
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 4
    .line 5
    const/16 v2, 0x21

    .line 6
    .line 7
    const/16 v3, 0x68

    .line 8
    .line 9
    const/16 v4, 0x64

    .line 10
    .line 11
    const/4 v5, 0x2

    .line 12
    const/4 v6, 0x0

    .line 13
    const/16 v7, 0x69

    .line 14
    .line 15
    const/16 v8, 0x66

    .line 16
    .line 17
    const/4 v9, 0x0

    .line 18
    const-wide/16 v10, 0x0

    .line 19
    .line 20
    const/4 v12, 0x1

    .line 21
    if-ge v1, v2, :cond_6

    .line 22
    .line 23
    invoke-static {}, Lcom/google/android/gms/location/LocationRequest;->V()Lcom/google/android/gms/location/LocationRequest;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    if-eqz v0, :cond_5

    .line 28
    .line 29
    iget v2, v0, Lx4/h;->a:I

    .line 30
    .line 31
    invoke-static {v2}, LA/f;->f(I)I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    if-eq v2, v12, :cond_2

    .line 38
    .line 39
    if-eq v2, v5, :cond_0

    .line 40
    .line 41
    move v3, v4

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    move v3, v8

    .line 44
    goto :goto_0

    .line 45
    :cond_1
    move v3, v7

    .line 46
    :cond_2
    :goto_0
    invoke-static {v3}, Lx7/z;->b(I)V

    .line 47
    .line 48
    .line 49
    iput v3, v1, Lcom/google/android/gms/location/LocationRequest;->a:I

    .line 50
    .line 51
    iget-wide v2, v0, Lx4/h;->c:J

    .line 52
    .line 53
    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/location/LocationRequest;->X(J)V

    .line 54
    .line 55
    .line 56
    const-wide/16 v4, 0x2

    .line 57
    .line 58
    div-long/2addr v2, v4

    .line 59
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    new-array v5, v12, [Ljava/lang/Object;

    .line 64
    .line 65
    aput-object v4, v5, v9

    .line 66
    .line 67
    cmp-long v4, v2, v10

    .line 68
    .line 69
    if-ltz v4, :cond_3

    .line 70
    .line 71
    move v9, v12

    .line 72
    :cond_3
    const-string v4, "illegal fastest interval: %d"

    .line 73
    .line 74
    invoke-static {v9, v4, v5}, Lcom/google/android/gms/common/internal/v;->c(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    iput-wide v2, v1, Lcom/google/android/gms/location/LocationRequest;->c:J

    .line 78
    .line 79
    iget-wide v2, v0, Lx4/h;->b:J

    .line 80
    .line 81
    long-to-float v0, v2

    .line 82
    cmpg-float v2, v0, v6

    .line 83
    .line 84
    if-ltz v2, :cond_4

    .line 85
    .line 86
    iput v0, v1, Lcom/google/android/gms/location/LocationRequest;->g:F

    .line 87
    .line 88
    return-object v1

    .line 89
    :cond_4
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 90
    .line 91
    invoke-static {v0}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    new-instance v3, Ljava/lang/StringBuilder;

    .line 100
    .line 101
    add-int/lit8 v2, v2, 0x16

    .line 102
    .line 103
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 104
    .line 105
    .line 106
    const-string v2, "invalid displacement: "

    .line 107
    .line 108
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    throw v1

    .line 122
    :cond_5
    return-object v1

    .line 123
    :cond_6
    cmp-long v1, v10, v10

    .line 124
    .line 125
    const/16 v27, 0x1

    .line 126
    .line 127
    const/16 v30, 0x0

    .line 128
    .line 129
    if-ltz v1, :cond_7

    .line 130
    .line 131
    move/from16 v1, v27

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_7
    move/from16 v1, v30

    .line 135
    .line 136
    :goto_1
    const-string v2, "intervalMillis must be greater than or equal to 0"

    .line 137
    .line 138
    invoke-static {v2, v1}, Lcom/google/android/gms/common/internal/v;->a(Ljava/lang/String;Z)V

    .line 139
    .line 140
    .line 141
    const-wide/16 v13, -0x1

    .line 142
    .line 143
    if-eqz v0, :cond_f

    .line 144
    .line 145
    iget v1, v0, Lx4/h;->a:I

    .line 146
    .line 147
    invoke-static {v1}, LA/f;->f(I)I

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    if-eqz v1, :cond_9

    .line 152
    .line 153
    if-eq v1, v12, :cond_a

    .line 154
    .line 155
    if-eq v1, v5, :cond_8

    .line 156
    .line 157
    move v3, v4

    .line 158
    goto :goto_2

    .line 159
    :cond_8
    move v3, v8

    .line 160
    goto :goto_2

    .line 161
    :cond_9
    move v3, v7

    .line 162
    :cond_a
    :goto_2
    invoke-static {v3}, Lx7/z;->b(I)V

    .line 163
    .line 164
    .line 165
    iget-wide v4, v0, Lx4/h;->c:J

    .line 166
    .line 167
    cmp-long v1, v4, v10

    .line 168
    .line 169
    if-ltz v1, :cond_b

    .line 170
    .line 171
    move v1, v12

    .line 172
    goto :goto_3

    .line 173
    :cond_b
    move v1, v9

    .line 174
    :goto_3
    invoke-static {v2, v1}, Lcom/google/android/gms/common/internal/v;->a(Ljava/lang/String;Z)V

    .line 175
    .line 176
    .line 177
    cmp-long v1, v4, v13

    .line 178
    .line 179
    if-eqz v1, :cond_c

    .line 180
    .line 181
    cmp-long v1, v4, v10

    .line 182
    .line 183
    if-ltz v1, :cond_d

    .line 184
    .line 185
    :cond_c
    move v1, v12

    .line 186
    goto :goto_4

    .line 187
    :cond_d
    move v1, v9

    .line 188
    :goto_4
    const-string v2, "minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL"

    .line 189
    .line 190
    invoke-static {v2, v1}, Lcom/google/android/gms/common/internal/v;->a(Ljava/lang/String;Z)V

    .line 191
    .line 192
    .line 193
    iget-wide v0, v0, Lx4/h;->b:J

    .line 194
    .line 195
    long-to-float v0, v0

    .line 196
    cmpl-float v1, v0, v6

    .line 197
    .line 198
    if-ltz v1, :cond_e

    .line 199
    .line 200
    move v9, v12

    .line 201
    :cond_e
    const-string v1, "minUpdateDistanceMeters must be greater than or equal to 0"

    .line 202
    .line 203
    invoke-static {v1, v9}, Lcom/google/android/gms/common/internal/v;->a(Ljava/lang/String;Z)V

    .line 204
    .line 205
    .line 206
    move/from16 v26, v0

    .line 207
    .line 208
    move v8, v3

    .line 209
    move-wide v0, v4

    .line 210
    move-wide v2, v13

    .line 211
    goto :goto_5

    .line 212
    :cond_f
    move/from16 v26, v6

    .line 213
    .line 214
    move-wide v4, v10

    .line 215
    move-wide v0, v13

    .line 216
    move-wide v2, v0

    .line 217
    :goto_5
    new-instance v13, Lcom/google/android/gms/location/LocationRequest;

    .line 218
    .line 219
    cmp-long v6, v0, v2

    .line 220
    .line 221
    if-nez v6, :cond_10

    .line 222
    .line 223
    move-wide/from16 v17, v4

    .line 224
    .line 225
    goto :goto_7

    .line 226
    :cond_10
    if-ne v8, v7, :cond_11

    .line 227
    .line 228
    :goto_6
    move-wide/from16 v17, v0

    .line 229
    .line 230
    goto :goto_7

    .line 231
    :cond_11
    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->min(JJ)J

    .line 232
    .line 233
    .line 234
    move-result-wide v0

    .line 235
    goto :goto_6

    .line 236
    :goto_7
    invoke-static {v10, v11, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 237
    .line 238
    .line 239
    move-result-wide v19

    .line 240
    cmp-long v0, v2, v2

    .line 241
    .line 242
    if-nez v0, :cond_12

    .line 243
    .line 244
    move-wide/from16 v28, v4

    .line 245
    .line 246
    goto :goto_8

    .line 247
    :cond_12
    move-wide/from16 v28, v2

    .line 248
    .line 249
    :goto_8
    new-instance v0, Landroid/os/WorkSource;

    .line 250
    .line 251
    const/4 v1, 0x0

    .line 252
    invoke-direct {v0, v1}, Landroid/os/WorkSource;-><init>(Landroid/os/WorkSource;)V

    .line 253
    .line 254
    .line 255
    const/16 v34, 0x0

    .line 256
    .line 257
    const-wide v21, 0x7fffffffffffffffL

    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    const-wide v23, 0x7fffffffffffffffL

    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    const v25, 0x7fffffff

    .line 268
    .line 269
    .line 270
    move/from16 v31, v30

    .line 271
    .line 272
    move/from16 v32, v30

    .line 273
    .line 274
    move-object/from16 v33, v0

    .line 275
    .line 276
    move-wide v15, v4

    .line 277
    move v14, v8

    .line 278
    invoke-direct/range {v13 .. v34}, Lcom/google/android/gms/location/LocationRequest;-><init>(IJJJJJIFZJIIZLandroid/os/WorkSource;Lcom/google/android/gms/internal/location/zze;)V

    .line 279
    .line 280
    .line 281
    return-object v13
.end method


# virtual methods
.method public final a(Landroid/app/Activity;Lx4/l;Lw4/a;)V
    .locals 2

    .line 1
    iput-object p2, p0, Lx4/b;->h:Lx4/l;

    .line 2
    .line 3
    iput-object p3, p0, Lx4/b;->g:Lw4/a;

    .line 4
    .line 5
    iget-object p2, p0, Lx4/b;->f:Lx4/h;

    .line 6
    .line 7
    invoke-static {p2}, Lx4/b;->f(Lx4/h;)Lcom/google/android/gms/location/LocationRequest;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    new-instance p2, Lx7/p;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-direct {p2, v0, v1, v1}, Lx7/p;-><init>(Ljava/util/ArrayList;ZZ)V

    .line 23
    .line 24
    .line 25
    sget v0, Lx7/o;->a:I

    .line 26
    .line 27
    new-instance v0, Lcom/google/android/gms/internal/location/zzda;

    .line 28
    .line 29
    iget-object v1, p0, Lx4/b;->a:Landroid/content/Context;

    .line 30
    .line 31
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/location/zzda;-><init>(Landroid/content/Context;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/location/zzda;->checkLocationSettings(Lx7/p;)Lcom/google/android/gms/tasks/Task;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    new-instance v0, Lo1/c;

    .line 39
    .line 40
    const/16 v1, 0xb

    .line 41
    .line 42
    invoke-direct {v0, p0, v1}, Lo1/c;-><init>(Ljava/lang/Object;I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p2, v0}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    new-instance v0, LA5/g;

    .line 50
    .line 51
    const/16 v1, 0x18

    .line 52
    .line 53
    invoke-direct {v0, p0, p1, p3, v1}, LA5/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p2, v0}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public final b(LKa/b;LKa/b;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lx4/b;->c:Lcom/google/android/gms/internal/location/zzbi;

    .line 2
    .line 3
    invoke-interface {v0}, Lx7/h;->getLastLocation()Lcom/google/android/gms/tasks/Task;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lo1/c;

    .line 8
    .line 9
    const/16 v2, 0xc

    .line 10
    .line 11
    invoke-direct {v1, p1, v2}, Lo1/c;-><init>(Ljava/lang/Object;I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    new-instance v0, Lo1/c;

    .line 19
    .line 20
    const/16 v1, 0xd

    .line 21
    .line 22
    invoke-direct {v0, p2, v1}, Lo1/c;-><init>(Ljava/lang/Object;I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final c(Lcom/google/android/gms/ads/nativead/l;)V
    .locals 4

    .line 1
    sget v0, Lx7/o;->a:I

    .line 2
    .line 3
    new-instance v0, Lcom/google/android/gms/internal/location/zzda;

    .line 4
    .line 5
    iget-object v1, p0, Lx4/b;->a:Landroid/content/Context;

    .line 6
    .line 7
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/location/zzda;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lx7/p;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v2, v1, v3, v3}, Lx7/p;-><init>(Ljava/util/ArrayList;ZZ)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/location/zzda;->checkLocationSettings(Lx7/p;)Lcom/google/android/gms/tasks/Task;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    new-instance v1, Lo1/c;

    .line 26
    .line 27
    const/16 v2, 0xa

    .line 28
    .line 29
    invoke-direct {v1, p1, v2}, Lo1/c;-><init>(Ljava/lang/Object;I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final d(II)Z
    .locals 2

    .line 1
    iget v0, p0, Lx4/b;->e:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-ne p1, v0, :cond_2

    .line 5
    .line 6
    const/4 p1, -0x1

    .line 7
    if-ne p2, p1, :cond_1

    .line 8
    .line 9
    iget-object p1, p0, Lx4/b;->f:Lx4/h;

    .line 10
    .line 11
    if-eqz p1, :cond_2

    .line 12
    .line 13
    iget-object p2, p0, Lx4/b;->h:Lx4/l;

    .line 14
    .line 15
    if-eqz p2, :cond_2

    .line 16
    .line 17
    iget-object p2, p0, Lx4/b;->g:Lw4/a;

    .line 18
    .line 19
    if-nez p2, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {p0, p1}, Lx4/b;->g(Lx4/h;)V

    .line 23
    .line 24
    .line 25
    const/4 p1, 0x1

    .line 26
    return p1

    .line 27
    :cond_1
    iget-object p1, p0, Lx4/b;->g:Lw4/a;

    .line 28
    .line 29
    if-eqz p1, :cond_2

    .line 30
    .line 31
    const/4 p2, 0x3

    .line 32
    invoke-interface {p1, p2}, Lw4/a;->onError(I)V

    .line 33
    .line 34
    .line 35
    :cond_2
    :goto_0
    return v1
.end method

.method public final e()V
    .locals 2

    .line 1
    iget-object v0, p0, Lx4/b;->d:Lx4/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Lx4/k;->c()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lx4/b;->c:Lcom/google/android/gms/internal/location/zzbi;

    .line 7
    .line 8
    iget-object v1, p0, Lx4/b;->b:Lx4/a;

    .line 9
    .line 10
    invoke-interface {v0, v1}, Lx7/h;->removeLocationUpdates(Lx7/l;)Lcom/google/android/gms/tasks/Task;

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final g(Lx4/h;)V
    .locals 3

    .line 1
    invoke-static {p1}, Lx4/b;->f(Lx4/h;)Lcom/google/android/gms/location/LocationRequest;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Lx4/b;->d:Lx4/k;

    .line 6
    .line 7
    invoke-virtual {v0}, Lx4/k;->b()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lx4/b;->b:Lx4/a;

    .line 11
    .line 12
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iget-object v2, p0, Lx4/b;->c:Lcom/google/android/gms/internal/location/zzbi;

    .line 17
    .line 18
    invoke-interface {v2, p1, v0, v1}, Lx7/h;->requestLocationUpdates(Lcom/google/android/gms/location/LocationRequest;Lx7/l;Landroid/os/Looper;)Lcom/google/android/gms/tasks/Task;

    .line 19
    .line 20
    .line 21
    return-void
.end method
