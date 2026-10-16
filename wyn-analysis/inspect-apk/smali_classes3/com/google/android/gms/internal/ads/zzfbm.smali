.class public final Lcom/google/android/gms/internal/ads/zzfbm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfcs;


# instance fields
.field private final zza:Landroid/content/Context;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzhcp;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzflg;

.field private final zzd:LH6/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzhcp;Lcom/google/android/gms/internal/ads/zzflg;LH6/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfbm;->zza:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfbm;->zzb:Lcom/google/android/gms/internal/ads/zzhcp;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzfbm;->zzc:Lcom/google/android/gms/internal/ads/zzflg;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzfbm;->zzd:LH6/a;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final zza()Lp8/p;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfbl;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzfbl;-><init>(Lcom/google/android/gms/internal/ads/zzfbm;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfbm;->zzb:Lcom/google/android/gms/internal/ads/zzhcp;

    .line 7
    .line 8
    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/zzhcp;->zzc(Ljava/util/concurrent/Callable;)Lp8/p;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
.end method

.method public final zzb()I
    .locals 1

    const/16 v0, 0x35

    return v0
.end method

.method public final zzc()Lcom/google/android/gms/internal/ads/zzfbn;
    .locals 10

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfbm;->zza:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfbm;->zzc:Lcom/google/android/gms/internal/ads/zzflg;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzflg;->zza()Z

    .line 6
    .line 7
    .line 8
    move-result v7

    .line 9
    new-instance v1, Lcom/google/android/gms/internal/ads/zzgcr;

    .line 10
    .line 11
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzgcr;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v2, Lcom/google/android/gms/internal/ads/zzgcr;

    .line 15
    .line 16
    invoke-direct {v2}, Lcom/google/android/gms/internal/ads/zzgcr;-><init>()V

    .line 17
    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    if-eqz v7, :cond_0

    .line 21
    .line 22
    sget-object v4, Lcom/google/android/gms/internal/ads/zzbix;->zzeh:Lcom/google/android/gms/internal/ads/zzbio;

    .line 23
    .line 24
    sget-object v5, LD6/s;->e:LD6/s;

    .line 25
    .line 26
    iget-object v5, v5, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 27
    .line 28
    invoke-virtual {v5, v4}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    check-cast v4, Ljava/lang/Boolean;

    .line 33
    .line 34
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-nez v4, :cond_0

    .line 39
    .line 40
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfbn;

    .line 41
    .line 42
    invoke-direct {v0, v3}, Lcom/google/android/gms/internal/ads/zzfbn;-><init>(Z)V

    .line 43
    .line 44
    .line 45
    return-object v0

    .line 46
    :catch_0
    move-exception v0

    .line 47
    goto/16 :goto_1

    .line 48
    .line 49
    :cond_0
    if-nez v7, :cond_1

    .line 50
    .line 51
    sget-object v4, Lcom/google/android/gms/internal/ads/zzbix;->zzed:Lcom/google/android/gms/internal/ads/zzbio;

    .line 52
    .line 53
    sget-object v5, LD6/s;->e:LD6/s;

    .line 54
    .line 55
    iget-object v5, v5, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 56
    .line 57
    invoke-virtual {v5, v4}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    check-cast v4, Ljava/lang/Boolean;

    .line 62
    .line 63
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-nez v4, :cond_2

    .line 68
    .line 69
    :cond_1
    if-eqz v7, :cond_3

    .line 70
    .line 71
    sget-object v4, Lcom/google/android/gms/internal/ads/zzbix;->zzef:Lcom/google/android/gms/internal/ads/zzbio;

    .line 72
    .line 73
    sget-object v5, LD6/s;->e:LD6/s;

    .line 74
    .line 75
    iget-object v5, v5, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 76
    .line 77
    invoke-virtual {v5, v4}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    check-cast v4, Ljava/lang/Boolean;

    .line 82
    .line 83
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    if-eqz v4, :cond_3

    .line 88
    .line 89
    :cond_2
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgcv;->zzh(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzgcv;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    sget-object v4, Lcom/google/android/gms/internal/ads/zzbix;->zzeo:Lcom/google/android/gms/internal/ads/zzbio;

    .line 94
    .line 95
    sget-object v5, LD6/s;->e:LD6/s;

    .line 96
    .line 97
    iget-object v5, v5, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 98
    .line 99
    invoke-virtual {v5, v4}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    check-cast v4, Ljava/lang/Long;

    .line 104
    .line 105
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 106
    .line 107
    .line 108
    move-result-wide v4

    .line 109
    sget-object v6, LC6/n;->D:LC6/n;

    .line 110
    .line 111
    iget-object v6, v6, LC6/n;->h:Lcom/google/android/gms/internal/ads/zzcfk;

    .line 112
    .line 113
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzcfk;->zzp()LG6/N;

    .line 114
    .line 115
    .line 116
    move-result-object v6

    .line 117
    check-cast v6, LG6/O;

    .line 118
    .line 119
    invoke-virtual {v6}, LG6/O;->D()Z

    .line 120
    .line 121
    .line 122
    move-result v6

    .line 123
    invoke-virtual {v1, v4, v5, v6}, Lcom/google/android/gms/internal/ads/zzgcv;->zzi(JZ)Lcom/google/android/gms/internal/ads/zzgcr;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    :cond_3
    sget-object v4, Lcom/google/android/gms/internal/ads/zzbix;->zzel:Lcom/google/android/gms/internal/ads/zzbio;

    .line 128
    .line 129
    sget-object v5, LD6/s;->e:LD6/s;

    .line 130
    .line 131
    iget-object v6, v5, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 132
    .line 133
    invoke-virtual {v6, v4}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    check-cast v4, Ljava/lang/Boolean;

    .line 138
    .line 139
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 140
    .line 141
    .line 142
    move-result v4

    .line 143
    if-eqz v4, :cond_4

    .line 144
    .line 145
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzfbm;->zzd:LH6/a;

    .line 146
    .line 147
    iget v4, v4, LH6/a;->c:I

    .line 148
    .line 149
    sget-object v6, Lcom/google/android/gms/internal/ads/zzbix;->zzek:Lcom/google/android/gms/internal/ads/zzbio;

    .line 150
    .line 151
    iget-object v8, v5, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 152
    .line 153
    invoke-virtual {v8, v6}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v6

    .line 157
    check-cast v6, Ljava/lang/Integer;

    .line 158
    .line 159
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 160
    .line 161
    .line 162
    move-result v6

    .line 163
    if-ge v4, v6, :cond_4

    .line 164
    .line 165
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgcw;->zzh(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzgcw;

    .line 166
    .line 167
    .line 168
    move-result-object v4

    .line 169
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzgcw;->zzj()V

    .line 170
    .line 171
    .line 172
    :cond_4
    if-nez v7, :cond_5

    .line 173
    .line 174
    sget-object v4, Lcom/google/android/gms/internal/ads/zzbix;->zzee:Lcom/google/android/gms/internal/ads/zzbio;

    .line 175
    .line 176
    iget-object v6, v5, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 177
    .line 178
    invoke-virtual {v6, v4}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    check-cast v4, Ljava/lang/Boolean;

    .line 183
    .line 184
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 185
    .line 186
    .line 187
    move-result v4

    .line 188
    if-nez v4, :cond_6

    .line 189
    .line 190
    :cond_5
    if-eqz v7, :cond_8

    .line 191
    .line 192
    sget-object v4, Lcom/google/android/gms/internal/ads/zzbix;->zzeg:Lcom/google/android/gms/internal/ads/zzbio;

    .line 193
    .line 194
    iget-object v6, v5, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 195
    .line 196
    invoke-virtual {v6, v4}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v4

    .line 200
    check-cast v4, Ljava/lang/Boolean;

    .line 201
    .line 202
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 203
    .line 204
    .line 205
    move-result v4

    .line 206
    if-eqz v4, :cond_8

    .line 207
    .line 208
    :cond_6
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgcw;->zzh(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzgcw;

    .line 209
    .line 210
    .line 211
    move-result-object v4

    .line 212
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgcs;->zza(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzgcs;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzfbm;->zzd:LH6/a;

    .line 217
    .line 218
    iget v6, v6, LH6/a;->c:I

    .line 219
    .line 220
    sget-object v8, Lcom/google/android/gms/internal/ads/zzbix;->zzek:Lcom/google/android/gms/internal/ads/zzbio;

    .line 221
    .line 222
    iget-object v9, v5, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 223
    .line 224
    invoke-virtual {v9, v8}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v8

    .line 228
    check-cast v8, Ljava/lang/Integer;

    .line 229
    .line 230
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 231
    .line 232
    .line 233
    move-result v8

    .line 234
    if-lt v6, v8, :cond_7

    .line 235
    .line 236
    sget-object v2, Lcom/google/android/gms/internal/ads/zzbix;->zzep:Lcom/google/android/gms/internal/ads/zzbio;

    .line 237
    .line 238
    iget-object v3, v5, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 239
    .line 240
    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    check-cast v2, Ljava/lang/Long;

    .line 245
    .line 246
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 247
    .line 248
    .line 249
    move-result-wide v2

    .line 250
    sget-object v5, LC6/n;->D:LC6/n;

    .line 251
    .line 252
    iget-object v5, v5, LC6/n;->h:Lcom/google/android/gms/internal/ads/zzcfk;

    .line 253
    .line 254
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzcfk;->zzp()LG6/N;

    .line 255
    .line 256
    .line 257
    move-result-object v5

    .line 258
    check-cast v5, LG6/O;

    .line 259
    .line 260
    invoke-virtual {v5}, LG6/O;->D()Z

    .line 261
    .line 262
    .line 263
    move-result v5

    .line 264
    invoke-virtual {v4, v2, v3, v5}, Lcom/google/android/gms/internal/ads/zzgcw;->zzi(JZ)Lcom/google/android/gms/internal/ads/zzgcr;

    .line 265
    .line 266
    .line 267
    move-result-object v2

    .line 268
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzgcs;->zzc()Z

    .line 269
    .line 270
    .line 271
    move-result v3

    .line 272
    :cond_7
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzgcs;->zze()Z

    .line 273
    .line 274
    .line 275
    move-result v0

    .line 276
    move v6, v0

    .line 277
    move-object v4, v2

    .line 278
    move v5, v3

    .line 279
    goto :goto_0

    .line 280
    :cond_8
    move-object v4, v2

    .line 281
    move v5, v3

    .line 282
    move v6, v5

    .line 283
    :goto_0
    new-instance v2, Lcom/google/android/gms/internal/ads/zzfbn;

    .line 284
    .line 285
    move-object v3, v1

    .line 286
    invoke-direct/range {v2 .. v7}, Lcom/google/android/gms/internal/ads/zzfbn;-><init>(Lcom/google/android/gms/internal/ads/zzgcr;Lcom/google/android/gms/internal/ads/zzgcr;ZZZ)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 287
    .line 288
    .line 289
    return-object v2

    .line 290
    :goto_1
    sget-object v1, LC6/n;->D:LC6/n;

    .line 291
    .line 292
    iget-object v1, v1, LC6/n;->h:Lcom/google/android/gms/internal/ads/zzcfk;

    .line 293
    .line 294
    const-string v2, "PerAppIdSignal"

    .line 295
    .line 296
    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/ads/zzcfk;->zzh(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfbm;->zzc:Lcom/google/android/gms/internal/ads/zzflg;

    .line 300
    .line 301
    new-instance v1, Lcom/google/android/gms/internal/ads/zzfbn;

    .line 302
    .line 303
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzflg;->zza()Z

    .line 304
    .line 305
    .line 306
    move-result v0

    .line 307
    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/zzfbn;-><init>(Z)V

    .line 308
    .line 309
    .line 310
    return-object v1
.end method
