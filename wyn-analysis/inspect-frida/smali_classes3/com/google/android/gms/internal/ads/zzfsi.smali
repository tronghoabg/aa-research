.class public final Lcom/google/android/gms/internal/ads/zzfsi;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzepl;

.field private final zzb:Ljava/lang/String;

.field private final zzc:Ljava/lang/String;

.field private final zzd:Ljava/lang/String;

.field private final zze:Landroid/content/Context;

.field private final zzf:Lcom/google/android/gms/internal/ads/zzfkz;

.field private final zzg:Lcom/google/android/gms/internal/ads/zzfla;

.field private final zzh:Ln7/a;

.field private final zzi:Lcom/google/android/gms/internal/ads/zzbaw;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzepl;LH6/a;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzfkz;Lcom/google/android/gms/internal/ads/zzfla;Ln7/a;Lcom/google/android/gms/internal/ads/zzbaw;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfsi;->zza:Lcom/google/android/gms/internal/ads/zzepl;

    .line 5
    .line 6
    iget-object p1, p2, LH6/a;->a:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfsi;->zzb:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzfsi;->zzc:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzfsi;->zzd:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzfsi;->zze:Landroid/content/Context;

    .line 15
    .line 16
    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzfsi;->zzf:Lcom/google/android/gms/internal/ads/zzfkz;

    .line 17
    .line 18
    iput-object p7, p0, Lcom/google/android/gms/internal/ads/zzfsi;->zzg:Lcom/google/android/gms/internal/ads/zzfla;

    .line 19
    .line 20
    iput-object p8, p0, Lcom/google/android/gms/internal/ads/zzfsi;->zzh:Ln7/a;

    .line 21
    .line 22
    iput-object p9, p0, Lcom/google/android/gms/internal/ads/zzfsi;->zzi:Lcom/google/android/gms/internal/ads/zzbaw;

    .line 23
    .line 24
    return-void
.end method

.method public static zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    const-string p2, ""

    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0, p1, p2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static synthetic zze(Lcom/google/android/gms/internal/ads/zzfkz;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzfkz;->zza:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzfsi;->zzg(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static synthetic zzf(Lcom/google/android/gms/internal/ads/zzfkz;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzfkz;->zzb:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzfsi;->zzg(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method private static zzg(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string p0, ""

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-static {}, LH6/i;->c()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    const-string p0, "fakeForAdDebugLog"

    .line 17
    .line 18
    :cond_1
    return-object p0
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzfky;Lcom/google/android/gms/internal/ads/zzfkn;Ljava/util/List;)Ljava/util/List;
    .locals 9

    .line 1
    const/4 v7, 0x0

    .line 2
    const/4 v8, 0x0

    .line 3
    const/4 v3, 0x0

    .line 4
    const-string v4, ""

    .line 5
    .line 6
    const-string v5, ""

    .line 7
    .line 8
    move-object v0, p0

    .line 9
    move-object v1, p1

    .line 10
    move-object v2, p2

    .line 11
    move-object v6, p3

    .line 12
    invoke-virtual/range {v0 .. v8}, Lcom/google/android/gms/internal/ads/zzfsi;->zzb(Lcom/google/android/gms/internal/ads/zzfky;Lcom/google/android/gms/internal/ads/zzfkn;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/google/android/gms/internal/ads/zzdbv;Lcom/google/android/gms/internal/ads/zzcfl;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzfky;Lcom/google/android/gms/internal/ads/zzfkn;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/google/android/gms/internal/ads/zzdbv;Lcom/google/android/gms/internal/ads/zzcfl;)Ljava/util/List;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p8

    .line 6
    .line 7
    new-instance v3, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-interface/range {p6 .. p6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v5

    .line 20
    if-eqz v5, :cond_e

    .line 21
    .line 22
    const-string v5, "1"

    .line 23
    .line 24
    const-string v6, "0"

    .line 25
    .line 26
    const/4 v7, 0x1

    .line 27
    move/from16 v8, p3

    .line 28
    .line 29
    if-eq v7, v8, :cond_0

    .line 30
    .line 31
    move-object v9, v6

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    move-object v9, v5

    .line 34
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v10

    .line 38
    check-cast v10, Ljava/lang/String;

    .line 39
    .line 40
    move-object/from16 v11, p1

    .line 41
    .line 42
    iget-object v12, v11, Lcom/google/android/gms/internal/ads/zzfky;->zza:Lcom/google/android/gms/internal/ads/zzfkv;

    .line 43
    .line 44
    iget-object v12, v12, Lcom/google/android/gms/internal/ads/zzfkv;->zza:Lcom/google/android/gms/internal/ads/zzflg;

    .line 45
    .line 46
    const-string v13, "@gw_adlocid@"

    .line 47
    .line 48
    iget-object v12, v12, Lcom/google/android/gms/internal/ads/zzflg;->zzg:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v10, v13, v12}, Lcom/google/android/gms/internal/ads/zzfsi;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v10

    .line 54
    const-string v12, "@gw_adnetrefresh@"

    .line 55
    .line 56
    invoke-static {v10, v12, v9}, Lcom/google/android/gms/internal/ads/zzfsi;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v9

    .line 60
    iget-object v10, v0, Lcom/google/android/gms/internal/ads/zzfsi;->zzb:Ljava/lang/String;

    .line 61
    .line 62
    const-string v12, "@gw_sdkver@"

    .line 63
    .line 64
    invoke-static {v9, v12, v10}, Lcom/google/android/gms/internal/ads/zzfsi;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v9

    .line 68
    const-string v10, ""

    .line 69
    .line 70
    if-eqz v1, :cond_6

    .line 71
    .line 72
    const-string v12, "@gw_qdata@"

    .line 73
    .line 74
    iget-object v13, v1, Lcom/google/android/gms/internal/ads/zzfkn;->zzy:Ljava/lang/String;

    .line 75
    .line 76
    invoke-static {v9, v12, v13}, Lcom/google/android/gms/internal/ads/zzfsi;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v9

    .line 80
    const-string v12, "@gw_adnetid@"

    .line 81
    .line 82
    iget-object v13, v1, Lcom/google/android/gms/internal/ads/zzfkn;->zzx:Ljava/lang/String;

    .line 83
    .line 84
    invoke-static {v9, v12, v13}, Lcom/google/android/gms/internal/ads/zzfsi;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v9

    .line 88
    const-string v12, "@gw_allocid@"

    .line 89
    .line 90
    iget-object v13, v1, Lcom/google/android/gms/internal/ads/zzfkn;->zzw:Ljava/lang/String;

    .line 91
    .line 92
    invoke-static {v9, v12, v13}, Lcom/google/android/gms/internal/ads/zzfsi;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v9

    .line 96
    iget-object v12, v0, Lcom/google/android/gms/internal/ads/zzfsi;->zze:Landroid/content/Context;

    .line 97
    .line 98
    iget-object v13, v1, Lcom/google/android/gms/internal/ads/zzfkn;->zzaw:Ljava/util/Map;

    .line 99
    .line 100
    iget-boolean v14, v1, Lcom/google/android/gms/internal/ads/zzfkn;->zzW:Z

    .line 101
    .line 102
    invoke-static {v9, v12, v14, v13}, Lcom/google/android/gms/internal/ads/zzcei;->zza(Ljava/lang/String;Landroid/content/Context;ZLjava/util/Map;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v9

    .line 106
    sget-object v13, Lcom/google/android/gms/internal/ads/zzbix;->zzpk:Lcom/google/android/gms/internal/ads/zzbio;

    .line 107
    .line 108
    sget-object v14, LD6/s;->e:LD6/s;

    .line 109
    .line 110
    iget-object v15, v14, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 111
    .line 112
    invoke-virtual {v15, v13}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v13

    .line 116
    check-cast v13, Ljava/lang/Boolean;

    .line 117
    .line 118
    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    .line 119
    .line 120
    .line 121
    move-result v13

    .line 122
    if-eqz v13, :cond_2

    .line 123
    .line 124
    iget v13, v1, Lcom/google/android/gms/internal/ads/zzfkn;->zze:I

    .line 125
    .line 126
    const/4 v15, 0x4

    .line 127
    if-ne v13, v15, :cond_2

    .line 128
    .line 129
    sget-object v13, LC6/n;->D:LC6/n;

    .line 130
    .line 131
    iget-object v13, v13, LC6/n;->c:LG6/U;

    .line 132
    .line 133
    invoke-static {v12}, LG6/U;->g(Landroid/content/Context;)Z

    .line 134
    .line 135
    .line 136
    move-result v12

    .line 137
    if-eq v7, v12, :cond_1

    .line 138
    .line 139
    move-object v5, v6

    .line 140
    :cond_1
    const-string v6, "@gw_aps@"

    .line 141
    .line 142
    invoke-static {v9, v6, v5}, Lcom/google/android/gms/internal/ads/zzfsi;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v5

    .line 146
    move-object v9, v5

    .line 147
    :cond_2
    sget-object v5, Lcom/google/android/gms/internal/ads/zzbix;->zzpv:Lcom/google/android/gms/internal/ads/zzbio;

    .line 148
    .line 149
    iget-object v6, v14, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 150
    .line 151
    invoke-virtual {v6, v5}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v5

    .line 155
    check-cast v5, Ljava/lang/Boolean;

    .line 156
    .line 157
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 158
    .line 159
    .line 160
    move-result v5

    .line 161
    if-eqz v5, :cond_6

    .line 162
    .line 163
    if-eqz v2, :cond_6

    .line 164
    .line 165
    iget v5, v2, Lcom/google/android/gms/internal/ads/zzcfl;->zza:I

    .line 166
    .line 167
    if-ltz v5, :cond_3

    .line 168
    .line 169
    invoke-static {v5}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    goto :goto_2

    .line 174
    :cond_3
    move-object v5, v10

    .line 175
    :goto_2
    const-string v6, "@gw_is@"

    .line 176
    .line 177
    invoke-static {v9, v6, v5}, Lcom/google/android/gms/internal/ads/zzfsi;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v5

    .line 181
    iget v6, v2, Lcom/google/android/gms/internal/ads/zzcfl;->zzb:I

    .line 182
    .line 183
    if-ltz v6, :cond_4

    .line 184
    .line 185
    invoke-static {v6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v6

    .line 189
    goto :goto_3

    .line 190
    :cond_4
    move-object v6, v10

    .line 191
    :goto_3
    const-string v9, "@gw_fis@"

    .line 192
    .line 193
    invoke-static {v5, v9, v6}, Lcom/google/android/gms/internal/ads/zzfsi;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v5

    .line 197
    iget v6, v2, Lcom/google/android/gms/internal/ads/zzcfl;->zzc:I

    .line 198
    .line 199
    if-ltz v6, :cond_5

    .line 200
    .line 201
    invoke-static {v6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v6

    .line 205
    goto :goto_4

    .line 206
    :cond_5
    move-object v6, v10

    .line 207
    :goto_4
    const-string v9, "@gw_sfis@"

    .line 208
    .line 209
    invoke-static {v5, v9, v6}, Lcom/google/android/gms/internal/ads/zzfsi;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v9

    .line 213
    :cond_6
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzfsi;->zza:Lcom/google/android/gms/internal/ads/zzepl;

    .line 214
    .line 215
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzepl;->zzg()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v6

    .line 219
    const-string v12, "@gw_adnetstatus@"

    .line 220
    .line 221
    invoke-static {v9, v12, v6}, Lcom/google/android/gms/internal/ads/zzfsi;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v6

    .line 225
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzepl;->zzh()J

    .line 226
    .line 227
    .line 228
    move-result-wide v12

    .line 229
    const/16 v5, 0xa

    .line 230
    .line 231
    invoke-static {v12, v13, v5}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v9

    .line 235
    const-string v12, "@gw_ttr@"

    .line 236
    .line 237
    invoke-static {v6, v12, v9}, Lcom/google/android/gms/internal/ads/zzfsi;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v6

    .line 241
    iget-object v9, v0, Lcom/google/android/gms/internal/ads/zzfsi;->zzc:Ljava/lang/String;

    .line 242
    .line 243
    const-string v12, "@gw_seqnum@"

    .line 244
    .line 245
    invoke-static {v6, v12, v9}, Lcom/google/android/gms/internal/ads/zzfsi;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v6

    .line 249
    iget-object v9, v0, Lcom/google/android/gms/internal/ads/zzfsi;->zzd:Ljava/lang/String;

    .line 250
    .line 251
    const-string v12, "@gw_sessid@"

    .line 252
    .line 253
    invoke-static {v6, v12, v9}, Lcom/google/android/gms/internal/ads/zzfsi;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v6

    .line 257
    sget-object v9, Lcom/google/android/gms/internal/ads/zzbix;->zzpt:Lcom/google/android/gms/internal/ads/zzbio;

    .line 258
    .line 259
    sget-object v12, LD6/s;->e:LD6/s;

    .line 260
    .line 261
    iget-object v13, v12, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 262
    .line 263
    invoke-virtual {v13, v9}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v9

    .line 267
    check-cast v9, Ljava/lang/Boolean;

    .line 268
    .line 269
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 270
    .line 271
    .line 272
    move-result v9

    .line 273
    if-eqz v9, :cond_8

    .line 274
    .line 275
    const-string v9, "@gw_placement_id@"

    .line 276
    .line 277
    if-eqz p7, :cond_7

    .line 278
    .line 279
    invoke-virtual/range {p7 .. p7}, Lcom/google/android/gms/internal/ads/zzdbv;->zza()J

    .line 280
    .line 281
    .line 282
    move-result-wide v13

    .line 283
    const-wide/16 v15, 0x0

    .line 284
    .line 285
    cmp-long v13, v13, v15

    .line 286
    .line 287
    if-lez v13, :cond_7

    .line 288
    .line 289
    invoke-virtual/range {p7 .. p7}, Lcom/google/android/gms/internal/ads/zzdbv;->zza()J

    .line 290
    .line 291
    .line 292
    move-result-wide v13

    .line 293
    invoke-static {v13, v14, v5}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v5

    .line 297
    invoke-static {v6, v9, v5}, Lcom/google/android/gms/internal/ads/zzfsi;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v6

    .line 301
    goto :goto_5

    .line 302
    :cond_7
    invoke-static {v6, v9, v10}, Lcom/google/android/gms/internal/ads/zzfsi;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v6

    .line 306
    :cond_8
    :goto_5
    sget-object v5, Lcom/google/android/gms/internal/ads/zzbix;->zzeB:Lcom/google/android/gms/internal/ads/zzbio;

    .line 307
    .line 308
    iget-object v9, v12, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 309
    .line 310
    invoke-virtual {v9, v5}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v5

    .line 314
    check-cast v5, Ljava/lang/Boolean;

    .line 315
    .line 316
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 317
    .line 318
    .line 319
    move-result v5

    .line 320
    const/4 v9, 0x0

    .line 321
    if-eqz v5, :cond_9

    .line 322
    .line 323
    invoke-static/range {p4 .. p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 324
    .line 325
    .line 326
    move-result v5

    .line 327
    if-nez v5, :cond_9

    .line 328
    .line 329
    move v9, v7

    .line 330
    :cond_9
    invoke-static/range {p5 .. p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 331
    .line 332
    .line 333
    move-result v5

    .line 334
    xor-int/lit8 v10, v5, 0x1

    .line 335
    .line 336
    if-nez v9, :cond_b

    .line 337
    .line 338
    if-nez v5, :cond_a

    .line 339
    .line 340
    goto :goto_6

    .line 341
    :cond_a
    move-object/from16 v9, p4

    .line 342
    .line 343
    move-object/from16 v7, p5

    .line 344
    .line 345
    goto :goto_9

    .line 346
    :cond_b
    move v7, v10

    .line 347
    :goto_6
    invoke-static {v6}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 348
    .line 349
    .line 350
    move-result-object v5

    .line 351
    iget-object v10, v0, Lcom/google/android/gms/internal/ads/zzfsi;->zzi:Lcom/google/android/gms/internal/ads/zzbaw;

    .line 352
    .line 353
    invoke-virtual {v10, v5}, Lcom/google/android/gms/internal/ads/zzbaw;->zza(Landroid/net/Uri;)Z

    .line 354
    .line 355
    .line 356
    move-result v5

    .line 357
    if-eqz v5, :cond_a

    .line 358
    .line 359
    invoke-static {v6}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 360
    .line 361
    .line 362
    move-result-object v5

    .line 363
    invoke-virtual {v5}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 364
    .line 365
    .line 366
    move-result-object v5

    .line 367
    if-eqz v9, :cond_c

    .line 368
    .line 369
    const-string v6, "ms"

    .line 370
    .line 371
    move-object/from16 v9, p4

    .line 372
    .line 373
    invoke-virtual {v5, v6, v9}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 374
    .line 375
    .line 376
    move-result-object v5

    .line 377
    goto :goto_7

    .line 378
    :cond_c
    move-object/from16 v9, p4

    .line 379
    .line 380
    :goto_7
    if-eqz v7, :cond_d

    .line 381
    .line 382
    const-string v6, "attok"

    .line 383
    .line 384
    move-object/from16 v7, p5

    .line 385
    .line 386
    invoke-virtual {v5, v6, v7}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 387
    .line 388
    .line 389
    move-result-object v5

    .line 390
    goto :goto_8

    .line 391
    :cond_d
    move-object/from16 v7, p5

    .line 392
    .line 393
    :goto_8
    invoke-virtual {v5}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 394
    .line 395
    .line 396
    move-result-object v5

    .line 397
    invoke-virtual {v5}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object v6

    .line 401
    :goto_9
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 402
    .line 403
    .line 404
    goto/16 :goto_0

    .line 405
    .line 406
    :cond_e
    return-object v3
.end method

.method public final zzc(Lcom/google/android/gms/internal/ads/zzfkn;Ljava/util/List;Lcom/google/android/gms/internal/ads/zzcbw;)Ljava/util/List;
    .locals 10

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfsi;->zzh:Ln7/a;

    .line 7
    .line 8
    check-cast v1, Ln7/b;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 14
    .line 15
    .line 16
    move-result-wide v1

    .line 17
    :try_start_0
    invoke-interface {p3}, Lcom/google/android/gms/internal/ads/zzcbw;->zzb()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-interface {p3}, Lcom/google/android/gms/internal/ads/zzcbw;->zzc()I

    .line 22
    .line 23
    .line 24
    move-result p3

    .line 25
    invoke-static {p3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p3
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    sget-object v4, Lcom/google/android/gms/internal/ads/zzbix;->zzeC:Lcom/google/android/gms/internal/ads/zzbio;

    .line 30
    .line 31
    sget-object v5, LD6/s;->e:LD6/s;

    .line 32
    .line 33
    iget-object v5, v5, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 34
    .line 35
    invoke-virtual {v5, v4}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    check-cast v4, Ljava/lang/Boolean;

    .line 40
    .line 41
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-eqz v4, :cond_1

    .line 46
    .line 47
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzfsi;->zzg:Lcom/google/android/gms/internal/ads/zzfla;

    .line 48
    .line 49
    if-nez v4, :cond_0

    .line 50
    .line 51
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgtp;->zzc()Lcom/google/android/gms/internal/ads/zzgtp;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    goto :goto_1

    .line 56
    :cond_0
    iget-object v4, v4, Lcom/google/android/gms/internal/ads/zzfla;->zza:Lcom/google/android/gms/internal/ads/zzfkz;

    .line 57
    .line 58
    :goto_0
    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzgtp;->zzd(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzgtp;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    goto :goto_1

    .line 63
    :cond_1
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzfsi;->zzf:Lcom/google/android/gms/internal/ads/zzfkz;

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :goto_1
    sget-object v5, Lcom/google/android/gms/internal/ads/zzfsh;->zza:Lcom/google/android/gms/internal/ads/zzfsh;

    .line 67
    .line 68
    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/ads/zzgtp;->zzb(Lcom/google/android/gms/internal/ads/zzgti;)Lcom/google/android/gms/internal/ads/zzgtp;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    const-string v6, ""

    .line 73
    .line 74
    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/ads/zzgtp;->zza(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    check-cast v5, Ljava/lang/String;

    .line 79
    .line 80
    sget-object v7, Lcom/google/android/gms/internal/ads/zzfsg;->zza:Lcom/google/android/gms/internal/ads/zzfsg;

    .line 81
    .line 82
    invoke-virtual {v4, v7}, Lcom/google/android/gms/internal/ads/zzgtp;->zzb(Lcom/google/android/gms/internal/ads/zzgti;)Lcom/google/android/gms/internal/ads/zzgtp;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    invoke-virtual {v4, v6}, Lcom/google/android/gms/internal/ads/zzgtp;->zza(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    check-cast v4, Ljava/lang/String;

    .line 91
    .line 92
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    if-eqz v6, :cond_2

    .line 101
    .line 102
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    check-cast v6, Ljava/lang/String;

    .line 107
    .line 108
    invoke-static {v5}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v7

    .line 112
    const-string v8, "@gw_rwd_userid@"

    .line 113
    .line 114
    invoke-static {v6, v8, v7}, Lcom/google/android/gms/internal/ads/zzfsi;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v6

    .line 118
    invoke-static {v4}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v7

    .line 122
    const-string v8, "@gw_rwd_custom_data@"

    .line 123
    .line 124
    invoke-static {v6, v8, v7}, Lcom/google/android/gms/internal/ads/zzfsi;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v6

    .line 128
    invoke-static {v1, v2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v7

    .line 132
    const-string v8, "@gw_tmstmp@"

    .line 133
    .line 134
    invoke-static {v6, v8, v7}, Lcom/google/android/gms/internal/ads/zzfsi;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    invoke-static {v3}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v7

    .line 142
    const-string v8, "@gw_rwd_itm@"

    .line 143
    .line 144
    invoke-static {v6, v8, v7}, Lcom/google/android/gms/internal/ads/zzfsi;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v6

    .line 148
    const-string v7, "@gw_rwd_amt@"

    .line 149
    .line 150
    invoke-static {v6, v7, p3}, Lcom/google/android/gms/internal/ads/zzfsi;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v6

    .line 154
    iget-object v7, p0, Lcom/google/android/gms/internal/ads/zzfsi;->zzb:Ljava/lang/String;

    .line 155
    .line 156
    const-string v8, "@gw_sdkver@"

    .line 157
    .line 158
    invoke-static {v6, v8, v7}, Lcom/google/android/gms/internal/ads/zzfsi;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v6

    .line 162
    iget-object v7, p0, Lcom/google/android/gms/internal/ads/zzfsi;->zze:Landroid/content/Context;

    .line 163
    .line 164
    iget-boolean v8, p1, Lcom/google/android/gms/internal/ads/zzfkn;->zzW:Z

    .line 165
    .line 166
    iget-object v9, p1, Lcom/google/android/gms/internal/ads/zzfkn;->zzaw:Ljava/util/Map;

    .line 167
    .line 168
    invoke-static {v6, v7, v8, v9}, Lcom/google/android/gms/internal/ads/zzcei;->zza(Ljava/lang/String;Landroid/content/Context;ZLjava/util/Map;)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v6

    .line 172
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    goto :goto_2

    .line 176
    :cond_2
    return-object v0

    .line 177
    :catch_0
    move-exception p1

    .line 178
    sget p2, LG6/L;->b:I

    .line 179
    .line 180
    const-string p2, "Unable to determine award type and amount."

    .line 181
    .line 182
    invoke-static {p2, p1}, LH6/l;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 183
    .line 184
    .line 185
    return-object v0
.end method
