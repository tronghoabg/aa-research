.class public final LN6/y;
.super LQ6/b;
.source "SourceFile"


# instance fields
.field public final a:LN6/x;

.field public final b:Lcom/google/android/gms/internal/ads/zzdzy;

.field public final c:Z

.field public final d:I

.field public final e:J

.field public final f:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>(LN6/x;ZILjava/lang/Boolean;Lcom/google/android/gms/internal/ads/zzdzy;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LN6/y;->a:LN6/x;

    .line 5
    .line 6
    iput-boolean p2, p0, LN6/y;->c:Z

    .line 7
    .line 8
    iput p3, p0, LN6/y;->d:I

    .line 9
    .line 10
    iput-object p4, p0, LN6/y;->f:Ljava/lang/Boolean;

    .line 11
    .line 12
    iput-object p5, p0, LN6/y;->b:Lcom/google/android/gms/internal/ads/zzdzy;

    .line 13
    .line 14
    sget-object p1, LC6/n;->D:LC6/n;

    .line 15
    .line 16
    iget-object p1, p1, LC6/n;->k:Ln7/b;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 22
    .line 23
    .line 24
    move-result-wide p1

    .line 25
    iput-wide p1, p0, LN6/y;->e:J

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/String;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    new-instance v2, Landroid/util/Pair;

    .line 5
    .line 6
    const-string v3, "sgf_reason"

    .line 7
    .line 8
    move-object/from16 v6, p1

    .line 9
    .line 10
    invoke-direct {v2, v3, v6}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    new-instance v3, Landroid/util/Pair;

    .line 14
    .line 15
    const-string v4, "se"

    .line 16
    .line 17
    const-string v5, "query_g"

    .line 18
    .line 19
    invoke-direct {v3, v4, v5}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    new-instance v4, Landroid/util/Pair;

    .line 23
    .line 24
    const-string v5, "BANNER"

    .line 25
    .line 26
    const-string v7, "ad_format"

    .line 27
    .line 28
    invoke-direct {v4, v7, v5}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    new-instance v5, Landroid/util/Pair;

    .line 32
    .line 33
    const/4 v7, 0x6

    .line 34
    invoke-static {v7}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v8

    .line 38
    const-string v9, "rtype"

    .line 39
    .line 40
    invoke-direct {v5, v9, v8}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    new-instance v8, Landroid/util/Pair;

    .line 44
    .line 45
    const-string v9, "scar"

    .line 46
    .line 47
    const-string v10, "true"

    .line 48
    .line 49
    invoke-direct {v8, v9, v10}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    new-instance v9, Landroid/util/Pair;

    .line 53
    .line 54
    sget-object v10, LC6/n;->D:LC6/n;

    .line 55
    .line 56
    iget-object v11, v10, LC6/n;->k:Ln7/b;

    .line 57
    .line 58
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 62
    .line 63
    .line 64
    move-result-wide v11

    .line 65
    iget-wide v13, v0, LN6/y;->e:J

    .line 66
    .line 67
    sub-long/2addr v11, v13

    .line 68
    invoke-static {v11, v12}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v11

    .line 72
    const-string v12, "lat_ms"

    .line 73
    .line 74
    invoke-direct {v9, v12, v11}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    new-instance v11, Landroid/util/Pair;

    .line 78
    .line 79
    move-object v12, v9

    .line 80
    iget v9, v0, LN6/y;->d:I

    .line 81
    .line 82
    invoke-static {v9}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v13

    .line 86
    const-string v14, "sgpc_rn"

    .line 87
    .line 88
    invoke-direct {v11, v14, v13}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    new-instance v13, Landroid/util/Pair;

    .line 92
    .line 93
    iget-object v14, v0, LN6/y;->f:Ljava/lang/Boolean;

    .line 94
    .line 95
    invoke-static {v14}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v14

    .line 99
    const-string v15, "sgpc_lsu"

    .line 100
    .line 101
    invoke-direct {v13, v15, v14}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    new-instance v14, Landroid/util/Pair;

    .line 105
    .line 106
    iget-boolean v15, v0, LN6/y;->c:Z

    .line 107
    .line 108
    if-eq v1, v15, :cond_0

    .line 109
    .line 110
    const-string v16, "0"

    .line 111
    .line 112
    :goto_0
    move/from16 v17, v1

    .line 113
    .line 114
    move-object/from16 v1, v16

    .line 115
    .line 116
    move/from16 v16, v7

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_0
    const-string v16, "1"

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :goto_1
    const-string v7, "tpc"

    .line 123
    .line 124
    invoke-direct {v14, v7, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    const/16 v1, 0x9

    .line 128
    .line 129
    new-array v1, v1, [Landroid/util/Pair;

    .line 130
    .line 131
    const/4 v7, 0x0

    .line 132
    aput-object v2, v1, v7

    .line 133
    .line 134
    aput-object v3, v1, v17

    .line 135
    .line 136
    const/4 v2, 0x2

    .line 137
    aput-object v4, v1, v2

    .line 138
    .line 139
    const/4 v2, 0x3

    .line 140
    aput-object v5, v1, v2

    .line 141
    .line 142
    const/4 v2, 0x4

    .line 143
    aput-object v8, v1, v2

    .line 144
    .line 145
    const/4 v2, 0x5

    .line 146
    aput-object v12, v1, v2

    .line 147
    .line 148
    aput-object v11, v1, v16

    .line 149
    .line 150
    const/4 v2, 0x7

    .line 151
    aput-object v13, v1, v2

    .line 152
    .line 153
    const/16 v2, 0x8

    .line 154
    .line 155
    aput-object v14, v1, v2

    .line 156
    .line 157
    const-string v2, "sgpcf"

    .line 158
    .line 159
    iget-object v3, v0, LN6/y;->b:Lcom/google/android/gms/internal/ads/zzdzy;

    .line 160
    .line 161
    invoke-static {v3, v2, v1}, Lp7/b;->a0(Lcom/google/android/gms/internal/ads/zzdzy;Ljava/lang/String;[Landroid/util/Pair;)V

    .line 162
    .line 163
    .line 164
    new-instance v4, LN6/z;

    .line 165
    .line 166
    iget-object v1, v10, LC6/n;->k:Ln7/b;

    .line 167
    .line 168
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 172
    .line 173
    .line 174
    move-result-wide v1

    .line 175
    sget-object v3, Lcom/google/android/gms/internal/ads/zzblc;->zzh:Lcom/google/android/gms/internal/ads/zzbkh;

    .line 176
    .line 177
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzbkh;->zze()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    check-cast v3, Ljava/lang/Long;

    .line 182
    .line 183
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 184
    .line 185
    .line 186
    move-result-wide v7

    .line 187
    add-long/2addr v7, v1

    .line 188
    const/4 v5, 0x0

    .line 189
    invoke-direct/range {v4 .. v9}, LN6/z;-><init>(LQ6/a;Ljava/lang/String;JI)V

    .line 190
    .line 191
    .line 192
    iget-object v1, v0, LN6/y;->a:LN6/x;

    .line 193
    .line 194
    invoke-virtual {v1, v15, v4}, LN6/x;->b(ZLN6/z;)V

    .line 195
    .line 196
    .line 197
    return-void
.end method

.method public final onSuccess(LQ6/a;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    new-instance v2, Landroid/util/Pair;

    .line 5
    .line 6
    const-string v3, "se"

    .line 7
    .line 8
    const-string v4, "query_g"

    .line 9
    .line 10
    invoke-direct {v2, v3, v4}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    new-instance v3, Landroid/util/Pair;

    .line 14
    .line 15
    const-string v4, "BANNER"

    .line 16
    .line 17
    const-string v5, "ad_format"

    .line 18
    .line 19
    invoke-direct {v3, v5, v4}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    new-instance v4, Landroid/util/Pair;

    .line 23
    .line 24
    const/4 v5, 0x6

    .line 25
    invoke-static {v5}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v6

    .line 29
    const-string v7, "rtype"

    .line 30
    .line 31
    invoke-direct {v4, v7, v6}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    new-instance v6, Landroid/util/Pair;

    .line 35
    .line 36
    const-string v7, "scar"

    .line 37
    .line 38
    const-string v8, "true"

    .line 39
    .line 40
    invoke-direct {v6, v7, v8}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    new-instance v7, Landroid/util/Pair;

    .line 44
    .line 45
    sget-object v8, LC6/n;->D:LC6/n;

    .line 46
    .line 47
    iget-object v9, v8, LC6/n;->k:Ln7/b;

    .line 48
    .line 49
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 53
    .line 54
    .line 55
    move-result-wide v9

    .line 56
    iget-wide v11, v0, LN6/y;->e:J

    .line 57
    .line 58
    sub-long/2addr v9, v11

    .line 59
    invoke-static {v9, v10}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v9

    .line 63
    const-string v10, "lat_ms"

    .line 64
    .line 65
    invoke-direct {v7, v10, v9}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    new-instance v9, Landroid/util/Pair;

    .line 69
    .line 70
    iget v15, v0, LN6/y;->d:I

    .line 71
    .line 72
    invoke-static {v15}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v10

    .line 76
    const-string v11, "sgpc_rn"

    .line 77
    .line 78
    invoke-direct {v9, v11, v10}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    new-instance v10, Landroid/util/Pair;

    .line 82
    .line 83
    iget-object v11, v0, LN6/y;->f:Ljava/lang/Boolean;

    .line 84
    .line 85
    invoke-static {v11}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v11

    .line 89
    const-string v12, "sgpc_lsu"

    .line 90
    .line 91
    invoke-direct {v10, v12, v11}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    new-instance v11, Landroid/util/Pair;

    .line 95
    .line 96
    iget-boolean v12, v0, LN6/y;->c:Z

    .line 97
    .line 98
    if-eq v1, v12, :cond_0

    .line 99
    .line 100
    const-string v13, "0"

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_0
    const-string v13, "1"

    .line 104
    .line 105
    :goto_0
    const-string v14, "tpc"

    .line 106
    .line 107
    invoke-direct {v11, v14, v13}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    const/16 v13, 0x8

    .line 111
    .line 112
    new-array v13, v13, [Landroid/util/Pair;

    .line 113
    .line 114
    const/4 v14, 0x0

    .line 115
    aput-object v2, v13, v14

    .line 116
    .line 117
    aput-object v3, v13, v1

    .line 118
    .line 119
    const/4 v1, 0x2

    .line 120
    aput-object v4, v13, v1

    .line 121
    .line 122
    const/4 v1, 0x3

    .line 123
    aput-object v6, v13, v1

    .line 124
    .line 125
    const/4 v1, 0x4

    .line 126
    aput-object v7, v13, v1

    .line 127
    .line 128
    const/4 v1, 0x5

    .line 129
    aput-object v9, v13, v1

    .line 130
    .line 131
    aput-object v10, v13, v5

    .line 132
    .line 133
    const/4 v1, 0x7

    .line 134
    aput-object v11, v13, v1

    .line 135
    .line 136
    const-string v1, "sgpcs"

    .line 137
    .line 138
    iget-object v2, v0, LN6/y;->b:Lcom/google/android/gms/internal/ads/zzdzy;

    .line 139
    .line 140
    invoke-static {v2, v1, v13}, Lp7/b;->a0(Lcom/google/android/gms/internal/ads/zzdzy;Ljava/lang/String;[Landroid/util/Pair;)V

    .line 141
    .line 142
    .line 143
    new-instance v10, LN6/z;

    .line 144
    .line 145
    iget-object v1, v8, LC6/n;->k:Ln7/b;

    .line 146
    .line 147
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 151
    .line 152
    .line 153
    move-result-wide v1

    .line 154
    sget-object v3, Lcom/google/android/gms/internal/ads/zzblc;->zzh:Lcom/google/android/gms/internal/ads/zzbkh;

    .line 155
    .line 156
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzbkh;->zze()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    check-cast v3, Ljava/lang/Long;

    .line 161
    .line 162
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 163
    .line 164
    .line 165
    move-result-wide v3

    .line 166
    add-long v13, v3, v1

    .line 167
    .line 168
    move v1, v12

    .line 169
    const-string v12, ""

    .line 170
    .line 171
    move-object/from16 v11, p1

    .line 172
    .line 173
    invoke-direct/range {v10 .. v15}, LN6/z;-><init>(LQ6/a;Ljava/lang/String;JI)V

    .line 174
    .line 175
    .line 176
    iget-object v2, v0, LN6/y;->a:LN6/x;

    .line 177
    .line 178
    invoke-virtual {v2, v1, v10}, LN6/x;->b(ZLN6/z;)V

    .line 179
    .line 180
    .line 181
    return-void
.end method
