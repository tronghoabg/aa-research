.class public final Lcom/google/android/gms/internal/ads/zzcnp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzbar;


# instance fields
.field private final zza:Landroid/content/Context;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzgdl;


# direct methods
.method public constructor <init>(Landroid/content/Context;LH6/a;)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcnp;->zza:Landroid/content/Context;

    .line 5
    .line 6
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbix;->zzdI:Lcom/google/android/gms/internal/ads/zzbio;

    .line 7
    .line 8
    sget-object v1, LD6/s;->e:LD6/s;

    .line 9
    .line 10
    iget-object v2, v1, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 11
    .line 12
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Ljava/lang/Integer;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v2, 0x2

    .line 23
    const/4 v3, 0x1

    .line 24
    const/4 v4, 0x3

    .line 25
    if-eq v0, v3, :cond_2

    .line 26
    .line 27
    if-eq v0, v2, :cond_0

    .line 28
    .line 29
    if-eq v0, v4, :cond_1

    .line 30
    .line 31
    :cond_0
    move v2, v4

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 v2, 0x4

    .line 34
    :cond_2
    :goto_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgei;->zze()Lcom/google/android/gms/internal/ads/zzgeh;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sget-object v5, Lcom/google/android/gms/internal/ads/zzbix;->zzdO:Lcom/google/android/gms/internal/ads/zzbio;

    .line 39
    .line 40
    iget-object v6, v1, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 41
    .line 42
    invoke-virtual {v6, v5}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    check-cast v5, Ljava/lang/Float;

    .line 47
    .line 48
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    invoke-virtual {v0, v5}, Lcom/google/android/gms/internal/ads/zzgeh;->zza(F)Lcom/google/android/gms/internal/ads/zzgeh;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zziej;->zzbm()Lcom/google/android/gms/internal/ads/zziep;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    check-cast v0, Lcom/google/android/gms/internal/ads/zzgei;

    .line 60
    .line 61
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgek;->zzi()Lcom/google/android/gms/internal/ads/zzgej;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    sget-object v6, Lcom/google/android/gms/internal/ads/zzbix;->zzdP:Lcom/google/android/gms/internal/ads/zzbio;

    .line 66
    .line 67
    iget-object v7, v1, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 68
    .line 69
    invoke-virtual {v7, v6}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    check-cast v6, Ljava/lang/Boolean;

    .line 74
    .line 75
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/ads/zzgej;->zza(Z)Lcom/google/android/gms/internal/ads/zzgej;

    .line 80
    .line 81
    .line 82
    sget-object v6, Lcom/google/android/gms/internal/ads/zzbix;->zzdR:Lcom/google/android/gms/internal/ads/zzbio;

    .line 83
    .line 84
    iget-object v7, v1, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 85
    .line 86
    invoke-virtual {v7, v6}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    check-cast v6, Ljava/lang/Long;

    .line 91
    .line 92
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 93
    .line 94
    .line 95
    move-result-wide v6

    .line 96
    invoke-virtual {v5, v6, v7}, Lcom/google/android/gms/internal/ads/zzgej;->zzb(J)Lcom/google/android/gms/internal/ads/zzgej;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zziej;->zzbm()Lcom/google/android/gms/internal/ads/zziep;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    check-cast v5, Lcom/google/android/gms/internal/ads/zzgek;

    .line 104
    .line 105
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgdq;->zzx()Lcom/google/android/gms/internal/ads/zzgdo;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    invoke-virtual {v6, v2}, Lcom/google/android/gms/internal/ads/zzgdo;->zzl(I)Lcom/google/android/gms/internal/ads/zzgdo;

    .line 110
    .line 111
    .line 112
    iget-object p2, p2, LH6/a;->a:Ljava/lang/String;

    .line 113
    .line 114
    invoke-virtual {v6, p2}, Lcom/google/android/gms/internal/ads/zzgdo;->zzd(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzgdo;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v6, v4}, Lcom/google/android/gms/internal/ads/zzgdo;->zzm(I)Lcom/google/android/gms/internal/ads/zzgdo;

    .line 118
    .line 119
    .line 120
    sget-object p2, Lcom/google/android/gms/internal/ads/zzbix;->zzdp:Lcom/google/android/gms/internal/ads/zzbio;

    .line 121
    .line 122
    iget-object v2, v1, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 123
    .line 124
    invoke-virtual {v2, p2}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p2

    .line 128
    check-cast p2, Ljava/lang/Boolean;

    .line 129
    .line 130
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 131
    .line 132
    .line 133
    move-result p2

    .line 134
    invoke-virtual {v6, p2}, Lcom/google/android/gms/internal/ads/zzgdo;->zza(Z)Lcom/google/android/gms/internal/ads/zzgdo;

    .line 135
    .line 136
    .line 137
    sget-object p2, Lcom/google/android/gms/internal/ads/zzbix;->zzdS:Lcom/google/android/gms/internal/ads/zzbio;

    .line 138
    .line 139
    iget-object v2, v1, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 140
    .line 141
    invoke-virtual {v2, p2}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p2

    .line 145
    check-cast p2, Ljava/lang/Boolean;

    .line 146
    .line 147
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 148
    .line 149
    .line 150
    move-result p2

    .line 151
    invoke-virtual {v6, p2}, Lcom/google/android/gms/internal/ads/zzgdo;->zzb(Z)Lcom/google/android/gms/internal/ads/zzgdo;

    .line 152
    .line 153
    .line 154
    sget-object p2, Lcom/google/android/gms/internal/ads/zzbix;->zzdT:Lcom/google/android/gms/internal/ads/zzbio;

    .line 155
    .line 156
    iget-object v2, v1, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 157
    .line 158
    invoke-virtual {v2, p2}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object p2

    .line 162
    check-cast p2, Ljava/lang/Boolean;

    .line 163
    .line 164
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 165
    .line 166
    .line 167
    move-result p2

    .line 168
    invoke-virtual {v6, p2}, Lcom/google/android/gms/internal/ads/zzgdo;->zzc(Z)Lcom/google/android/gms/internal/ads/zzgdo;

    .line 169
    .line 170
    .line 171
    sget-object p2, Lcom/google/android/gms/internal/ads/zzbix;->zzdF:Lcom/google/android/gms/internal/ads/zzbio;

    .line 172
    .line 173
    iget-object v2, v1, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 174
    .line 175
    invoke-virtual {v2, p2}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object p2

    .line 179
    check-cast p2, Ljava/lang/Integer;

    .line 180
    .line 181
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 182
    .line 183
    .line 184
    move-result p2

    .line 185
    const/4 v2, -0x1

    .line 186
    if-ne p2, v2, :cond_3

    .line 187
    .line 188
    goto :goto_1

    .line 189
    :cond_3
    const/4 v3, 0x0

    .line 190
    :goto_1
    invoke-virtual {v6, v3}, Lcom/google/android/gms/internal/ads/zzgdo;->zzj(Z)Lcom/google/android/gms/internal/ads/zzgdo;

    .line 191
    .line 192
    .line 193
    sget-object p2, Lcom/google/android/gms/internal/ads/zzbix;->zzdH:Lcom/google/android/gms/internal/ads/zzbio;

    .line 194
    .line 195
    iget-object v2, v1, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 196
    .line 197
    invoke-virtual {v2, p2}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object p2

    .line 201
    check-cast p2, Ljava/lang/Integer;

    .line 202
    .line 203
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 204
    .line 205
    .line 206
    move-result p2

    .line 207
    int-to-long v2, p2

    .line 208
    invoke-virtual {v6, v2, v3}, Lcom/google/android/gms/internal/ads/zzgdo;->zzi(J)Lcom/google/android/gms/internal/ads/zzgdo;

    .line 209
    .line 210
    .line 211
    sget-object p2, Lcom/google/android/gms/internal/ads/zzbix;->zzdQ:Lcom/google/android/gms/internal/ads/zzbio;

    .line 212
    .line 213
    iget-object v2, v1, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 214
    .line 215
    invoke-virtual {v2, p2}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object p2

    .line 219
    check-cast p2, Ljava/lang/Long;

    .line 220
    .line 221
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 222
    .line 223
    .line 224
    move-result-wide v2

    .line 225
    invoke-virtual {v6, v2, v3}, Lcom/google/android/gms/internal/ads/zzgdo;->zzg(J)Lcom/google/android/gms/internal/ads/zzgdo;

    .line 226
    .line 227
    .line 228
    sget-object p2, Lcom/google/android/gms/internal/ads/zzbix;->zzdG:Lcom/google/android/gms/internal/ads/zzbio;

    .line 229
    .line 230
    iget-object v2, v1, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 231
    .line 232
    invoke-virtual {v2, p2}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object p2

    .line 236
    check-cast p2, Ljava/lang/Integer;

    .line 237
    .line 238
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 239
    .line 240
    .line 241
    move-result p2

    .line 242
    int-to-long v2, p2

    .line 243
    invoke-virtual {v6, v2, v3}, Lcom/google/android/gms/internal/ads/zzgdo;->zzf(J)Lcom/google/android/gms/internal/ads/zzgdo;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v6, v0}, Lcom/google/android/gms/internal/ads/zzgdo;->zze(Lcom/google/android/gms/internal/ads/zzgei;)Lcom/google/android/gms/internal/ads/zzgdo;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v6, v5}, Lcom/google/android/gms/internal/ads/zzgdo;->zzh(Lcom/google/android/gms/internal/ads/zzgek;)Lcom/google/android/gms/internal/ads/zzgdo;

    .line 250
    .line 251
    .line 252
    sget-object p2, Lcom/google/android/gms/internal/ads/zzbix;->zzew:Lcom/google/android/gms/internal/ads/zzbio;

    .line 253
    .line 254
    iget-object v0, v1, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 255
    .line 256
    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object p2

    .line 260
    check-cast p2, Ljava/lang/Boolean;

    .line 261
    .line 262
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 263
    .line 264
    .line 265
    move-result p2

    .line 266
    invoke-virtual {v6, p2}, Lcom/google/android/gms/internal/ads/zzgdo;->zzk(Z)Lcom/google/android/gms/internal/ads/zzgdo;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zziej;->zzbm()Lcom/google/android/gms/internal/ads/zziep;

    .line 270
    .line 271
    .line 272
    move-result-object p2

    .line 273
    check-cast p2, Lcom/google/android/gms/internal/ads/zzgdq;

    .line 274
    .line 275
    sget-object v0, Lcom/google/android/gms/internal/ads/zzcfy;->zza:Lcom/google/android/gms/internal/ads/zzhcp;

    .line 276
    .line 277
    invoke-static {p1, v0, p2}, Lcom/google/android/gms/internal/ads/zzgdl;->zza(Landroid/content/Context;Ljava/util/concurrent/ExecutorService;Lcom/google/android/gms/internal/ads/zzgdq;)Lcom/google/android/gms/internal/ads/zzgdl;

    .line 278
    .line 279
    .line 280
    move-result-object p1

    .line 281
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcnp;->zzb:Lcom/google/android/gms/internal/ads/zzgdl;

    .line 282
    .line 283
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzgdl;->zzb()Lp8/p;

    .line 284
    .line 285
    .line 286
    return-void
.end method


# virtual methods
.method public final zza()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcnp;->zzb:Lcom/google/android/gms/internal/ads/zzgdl;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzgdl;->zzh()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/lit8 v0, v0, -0x1

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-eq v0, v1, :cond_2

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    if-eq v0, v1, :cond_1

    .line 14
    .line 15
    const/4 v1, 0x3

    .line 16
    if-eq v0, v1, :cond_0

    .line 17
    .line 18
    const-string v0, "uns"

    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_0
    const-string v0, "3.0"

    .line 22
    .line 23
    return-object v0

    .line 24
    :cond_1
    const-string v0, "2.0"

    .line 25
    .line 26
    return-object v0

    .line 27
    :cond_2
    const-string v0, "1.0"

    .line 28
    .line 29
    return-object v0
.end method

.method public final zzd(Landroid/view/MotionEvent;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcnp;->zzb:Lcom/google/android/gms/internal/ads/zzgdl;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzgdl;->zzg(Landroid/view/InputEvent;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final zze(III)V
    .locals 21
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    sget-object v3, LD6/q;->g:LD6/q;

    .line 8
    .line 9
    iget-object v4, v3, LD6/q;->a:LH6/f;

    .line 10
    .line 11
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzcnp;->zza:Landroid/content/Context;

    .line 12
    .line 13
    invoke-static {v4, v1}, LH6/f;->b(Landroid/content/Context;I)I

    .line 14
    .line 15
    .line 16
    move-result v5

    .line 17
    int-to-float v11, v5

    .line 18
    iget-object v5, v3, LD6/q;->a:LH6/f;

    .line 19
    .line 20
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    invoke-static {v5, v2}, LH6/f;->s(Landroid/util/DisplayMetrics;I)I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    int-to-float v12, v5

    .line 33
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzcnp;->zzb:Lcom/google/android/gms/internal/ads/zzgdl;

    .line 34
    .line 35
    move/from16 v6, p3

    .line 36
    .line 37
    int-to-long v8, v6

    .line 38
    const/4 v10, 0x0

    .line 39
    const/4 v13, 0x0

    .line 40
    const-wide/16 v6, 0x0

    .line 41
    .line 42
    invoke-static/range {v6 .. v13}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    move-wide v15, v8

    .line 47
    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/ads/zzgdl;->zzg(Landroid/view/InputEvent;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v6}, Landroid/view/MotionEvent;->recycle()V

    .line 51
    .line 52
    .line 53
    iget-object v6, v3, LD6/q;->a:LH6/f;

    .line 54
    .line 55
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    invoke-static {v6, v1}, LH6/f;->s(Landroid/util/DisplayMetrics;I)I

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    int-to-float v6, v6

    .line 68
    iget-object v7, v3, LD6/q;->a:LH6/f;

    .line 69
    .line 70
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    invoke-static {v7, v2}, LH6/f;->s(Landroid/util/DisplayMetrics;I)I

    .line 79
    .line 80
    .line 81
    move-result v7

    .line 82
    int-to-float v7, v7

    .line 83
    const/16 v20, 0x0

    .line 84
    .line 85
    const-wide/16 v13, 0x0

    .line 86
    .line 87
    const/16 v17, 0x2

    .line 88
    .line 89
    move/from16 v18, v6

    .line 90
    .line 91
    move/from16 v19, v7

    .line 92
    .line 93
    invoke-static/range {v13 .. v20}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/ads/zzgdl;->zzg(Landroid/view/InputEvent;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v6}, Landroid/view/MotionEvent;->recycle()V

    .line 101
    .line 102
    .line 103
    iget-object v6, v3, LD6/q;->a:LH6/f;

    .line 104
    .line 105
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 110
    .line 111
    .line 112
    move-result-object v6

    .line 113
    invoke-static {v6, v1}, LH6/f;->s(Landroid/util/DisplayMetrics;I)I

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    int-to-float v1, v1

    .line 118
    iget-object v3, v3, LD6/q;->a:LH6/f;

    .line 119
    .line 120
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    invoke-static {v3, v2}, LH6/f;->s(Landroid/util/DisplayMetrics;I)I

    .line 129
    .line 130
    .line 131
    move-result v2

    .line 132
    int-to-float v2, v2

    .line 133
    const/16 v20, 0x0

    .line 134
    .line 135
    const-wide/16 v13, 0x0

    .line 136
    .line 137
    const/16 v17, 0x1

    .line 138
    .line 139
    move/from16 v18, v1

    .line 140
    .line 141
    move/from16 v19, v2

    .line 142
    .line 143
    invoke-static/range {v13 .. v20}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    invoke-virtual {v5, v1}, Lcom/google/android/gms/internal/ads/zzgdl;->zzg(Landroid/view/InputEvent;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v1}, Landroid/view/MotionEvent;->recycle()V

    .line 151
    .line 152
    .line 153
    return-void
.end method

.method public final zzf(Landroid/content/Context;Ljava/lang/String;Landroid/view/View;Landroid/app/Activity;)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object p4, p0, Lcom/google/android/gms/internal/ads/zzcnp;->zzb:Lcom/google/android/gms/internal/ads/zzgdl;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p4, p1, p2, p3, v0}, Lcom/google/android/gms/internal/ads/zzgdl;->zze(Landroid/content/Context;Ljava/lang/String;Landroid/view/View;Landroid/app/Activity;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    return-object p1
.end method

.method public final zzg(Landroid/content/Context;Ljava/lang/String;Landroid/view/View;)Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcnp;->zzb:Lcom/google/android/gms/internal/ads/zzgdl;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, p1, p2, p3, v1}, Lcom/google/android/gms/internal/ads/zzgdl;->zze(Landroid/content/Context;Ljava/lang/String;Landroid/view/View;Landroid/app/Activity;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    return-object p1
.end method

.method public final zzh(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public final zzi([Ljava/lang/StackTraceElement;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcnp;->zzb:Lcom/google/android/gms/internal/ads/zzgdl;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzgdl;->zzf(Ljava/util/List;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final zzj(Landroid/content/Context;Landroid/view/View;Landroid/app/Activity;)Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcnp;->zzb:Lcom/google/android/gms/internal/ads/zzgdl;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, p1, v1, p2, p3}, Lcom/google/android/gms/internal/ads/zzgdl;->zzd(Landroid/content/Context;Ljava/lang/String;Landroid/view/View;Landroid/app/Activity;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    return-object p1
.end method

.method public final zzk(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcnp;->zzb:Lcom/google/android/gms/internal/ads/zzgdl;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzgdl;->zzc(Landroid/content/Context;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final zzl(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcnp;->zzb:Lcom/google/android/gms/internal/ads/zzgdl;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzgdl;->zzc(Landroid/content/Context;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
