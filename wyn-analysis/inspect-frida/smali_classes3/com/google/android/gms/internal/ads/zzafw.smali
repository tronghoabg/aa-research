.class public final Lcom/google/android/gms/internal/ads/zzafw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzagg;


# static fields
.field public static final synthetic zza:I

.field private static final zzb:[I

.field private static final zzc:Lcom/google/android/gms/internal/ads/zzafv;

.field private static final zzd:Lcom/google/android/gms/internal/ads/zzafv;


# instance fields
.field private zze:Lcom/google/android/gms/internal/ads/zzgwt;

.field private final zzf:Lcom/google/android/gms/internal/ads/zzanq;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/16 v0, 0x15

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/google/android/gms/internal/ads/zzafw;->zzb:[I

    .line 9
    .line 10
    new-instance v0, Lcom/google/android/gms/internal/ads/zzafv;

    .line 11
    .line 12
    sget-object v1, Lcom/google/android/gms/internal/ads/zzaft;->zza:Lcom/google/android/gms/internal/ads/zzaft;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzafv;-><init>(Lcom/google/android/gms/internal/ads/zzafu;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lcom/google/android/gms/internal/ads/zzafw;->zzc:Lcom/google/android/gms/internal/ads/zzafv;

    .line 18
    .line 19
    new-instance v0, Lcom/google/android/gms/internal/ads/zzafv;

    .line 20
    .line 21
    sget-object v1, Lcom/google/android/gms/internal/ads/zzafs;->zza:Lcom/google/android/gms/internal/ads/zzafs;

    .line 22
    .line 23
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzafv;-><init>(Lcom/google/android/gms/internal/ads/zzafu;)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lcom/google/android/gms/internal/ads/zzafw;->zzd:Lcom/google/android/gms/internal/ads/zzafv;

    .line 27
    .line 28
    return-void

    .line 29
    :array_0
    .array-data 4
        0x5
        0x4
        0xc
        0x8
        0x3
        0xa
        0x9
        0xb
        0x6
        0x2
        0x0
        0x1
        0x7
        0x10
        0xf
        0xe
        0x11
        0x12
        0x13
        0x14
        0x15
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzanl;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzanl;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzafw;->zzf:Lcom/google/android/gms/internal/ads/zzanq;

    return-void
.end method

.method private final zzc(ILjava/util/List;)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    packed-switch p1, :pswitch_data_0

    .line 3
    .line 4
    .line 5
    :pswitch_0
    goto :goto_0

    .line 6
    :pswitch_1
    new-instance p1, Lcom/google/android/gms/internal/ads/zzaic;

    .line 7
    .line 8
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzaic;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_2
    new-instance p1, Lcom/google/android/gms/internal/ads/zzair;

    .line 16
    .line 17
    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/zzair;-><init>(I)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_3
    new-instance p1, Lcom/google/android/gms/internal/ads/zzaid;

    .line 25
    .line 26
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzaid;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_4
    new-instance p1, Lcom/google/android/gms/internal/ads/zzasc;

    .line 34
    .line 35
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzasc;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :pswitch_5
    new-instance p1, Lcom/google/android/gms/internal/ads/zzanj;

    .line 43
    .line 44
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzanj;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :pswitch_6
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzafw;->zzf:Lcom/google/android/gms/internal/ads/zzanq;

    .line 52
    .line 53
    new-instance v1, Lcom/google/android/gms/internal/ads/zzahv;

    .line 54
    .line 55
    invoke-direct {v1, v0, p1}, Lcom/google/android/gms/internal/ads/zzahv;-><init>(ILcom/google/android/gms/internal/ads/zzanq;)V

    .line 56
    .line 57
    .line 58
    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :pswitch_7
    sget-object p1, Lcom/google/android/gms/internal/ads/zzafw;->zzd:Lcom/google/android/gms/internal/ads/zzafv;

    .line 63
    .line 64
    new-array v0, v0, [Ljava/lang/Object;

    .line 65
    .line 66
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzafv;->zza([Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzaga;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    if-eqz p1, :cond_0

    .line 71
    .line 72
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    :cond_0
    :goto_0
    return-void

    .line 76
    :pswitch_8
    new-instance p1, Lcom/google/android/gms/internal/ads/zzait;

    .line 77
    .line 78
    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/zzait;-><init>(I)V

    .line 79
    .line 80
    .line 81
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :pswitch_9
    new-instance p1, Lcom/google/android/gms/internal/ads/zzarx;

    .line 86
    .line 87
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzarx;-><init>()V

    .line 88
    .line 89
    .line 90
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :pswitch_a
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzafw;->zze:Lcom/google/android/gms/internal/ads/zzgwt;

    .line 95
    .line 96
    if-nez p1, :cond_1

    .line 97
    .line 98
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgwt;->zzi()Lcom/google/android/gms/internal/ads/zzgwt;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzafw;->zze:Lcom/google/android/gms/internal/ads/zzgwt;

    .line 103
    .line 104
    :cond_1
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzafw;->zzf:Lcom/google/android/gms/internal/ads/zzanq;

    .line 105
    .line 106
    new-instance v1, Lcom/google/android/gms/internal/ads/zzark;

    .line 107
    .line 108
    new-instance v5, Lcom/google/android/gms/internal/ads/zzfj;

    .line 109
    .line 110
    const-wide/16 v2, 0x0

    .line 111
    .line 112
    invoke-direct {v5, v2, v3}, Lcom/google/android/gms/internal/ads/zzfj;-><init>(J)V

    .line 113
    .line 114
    .line 115
    new-instance v6, Lcom/google/android/gms/internal/ads/zzapx;

    .line 116
    .line 117
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzafw;->zze:Lcom/google/android/gms/internal/ads/zzgwt;

    .line 118
    .line 119
    invoke-direct {v6, v0, p1}, Lcom/google/android/gms/internal/ads/zzapx;-><init>(ILjava/util/List;)V

    .line 120
    .line 121
    .line 122
    const/4 v2, 0x1

    .line 123
    const/4 v3, 0x0

    .line 124
    const v7, 0x1b8a0

    .line 125
    .line 126
    .line 127
    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/zzark;-><init>(IILcom/google/android/gms/internal/ads/zzanq;Lcom/google/android/gms/internal/ads/zzfj;Lcom/google/android/gms/internal/ads/zzarn;I)V

    .line 128
    .line 129
    .line 130
    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :pswitch_b
    new-instance p1, Lcom/google/android/gms/internal/ads/zzaqz;

    .line 135
    .line 136
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzaqz;-><init>()V

    .line 137
    .line 138
    .line 139
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    return-void

    .line 143
    :pswitch_c
    new-instance p1, Lcom/google/android/gms/internal/ads/zzamz;

    .line 144
    .line 145
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzamz;-><init>()V

    .line 146
    .line 147
    .line 148
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    :pswitch_d
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzafw;->zzf:Lcom/google/android/gms/internal/ads/zzanq;

    .line 153
    .line 154
    new-instance v0, Lcom/google/android/gms/internal/ads/zzalw;

    .line 155
    .line 156
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgwt;->zzi()Lcom/google/android/gms/internal/ads/zzgwt;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    const/4 v3, 0x0

    .line 161
    const/4 v4, 0x0

    .line 162
    const/16 v2, 0x2c0

    .line 163
    .line 164
    const/4 v6, 0x0

    .line 165
    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/zzalw;-><init>(Lcom/google/android/gms/internal/ads/zzanq;ILcom/google/android/gms/internal/ads/zzfj;Lcom/google/android/gms/internal/ads/zzamp;Ljava/util/List;Lcom/google/android/gms/internal/ads/zzahm;)V

    .line 166
    .line 167
    .line 168
    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    new-instance p1, Lcom/google/android/gms/internal/ads/zzami;

    .line 172
    .line 173
    const/16 v0, 0xa0

    .line 174
    .line 175
    invoke-direct {p1, v1, v0}, Lcom/google/android/gms/internal/ads/zzami;-><init>(Lcom/google/android/gms/internal/ads/zzanq;I)V

    .line 176
    .line 177
    .line 178
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    return-void

    .line 182
    :pswitch_e
    new-instance p1, Lcom/google/android/gms/internal/ads/zzaku;

    .line 183
    .line 184
    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/zzaku;-><init>(I)V

    .line 185
    .line 186
    .line 187
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    return-void

    .line 191
    :pswitch_f
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzafw;->zzf:Lcom/google/android/gms/internal/ads/zzanq;

    .line 192
    .line 193
    new-instance v1, Lcom/google/android/gms/internal/ads/zzakm;

    .line 194
    .line 195
    invoke-direct {v1, p1, v0}, Lcom/google/android/gms/internal/ads/zzakm;-><init>(Lcom/google/android/gms/internal/ads/zzanq;I)V

    .line 196
    .line 197
    .line 198
    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    return-void

    .line 202
    :pswitch_10
    new-instance p1, Lcom/google/android/gms/internal/ads/zzail;

    .line 203
    .line 204
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzail;-><init>()V

    .line 205
    .line 206
    .line 207
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    return-void

    .line 211
    :pswitch_11
    sget-object p1, Lcom/google/android/gms/internal/ads/zzafw;->zzc:Lcom/google/android/gms/internal/ads/zzafv;

    .line 212
    .line 213
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    const/4 v2, 0x1

    .line 218
    new-array v2, v2, [Ljava/lang/Object;

    .line 219
    .line 220
    aput-object v1, v2, v0

    .line 221
    .line 222
    invoke-virtual {p1, v2}, Lcom/google/android/gms/internal/ads/zzafv;->zza([Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzaga;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    if-eqz p1, :cond_2

    .line 227
    .line 228
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    return-void

    .line 232
    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/ads/zzaii;

    .line 233
    .line 234
    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/zzaii;-><init>(I)V

    .line 235
    .line 236
    .line 237
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    return-void

    .line 241
    :pswitch_12
    new-instance p1, Lcom/google/android/gms/internal/ads/zzahr;

    .line 242
    .line 243
    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/zzahr;-><init>(I)V

    .line 244
    .line 245
    .line 246
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    return-void

    .line 250
    :pswitch_13
    new-instance p1, Lcom/google/android/gms/internal/ads/zzapv;

    .line 251
    .line 252
    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/zzapv;-><init>(I)V

    .line 253
    .line 254
    .line 255
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    return-void

    .line 259
    :pswitch_14
    new-instance p1, Lcom/google/android/gms/internal/ads/zzaps;

    .line 260
    .line 261
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzaps;-><init>()V

    .line 262
    .line 263
    .line 264
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    return-void

    .line 268
    :pswitch_15
    new-instance p1, Lcom/google/android/gms/internal/ads/zzapp;

    .line 269
    .line 270
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzapp;-><init>()V

    .line 271
    .line 272
    .line 273
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    return-void

    .line 277
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method public final declared-synchronized zza()[Lcom/google/android/gms/internal/ads/zzaga;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-object v0, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 3
    .line 4
    new-instance v1, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/ads/zzafw;->zzb(Landroid/net/Uri;Ljava/util/Map;)[Lcom/google/android/gms/internal/ads/zzaga;

    .line 10
    .line 11
    .line 12
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    monitor-exit p0

    .line 14
    return-object v0

    .line 15
    :catchall_0
    move-exception v0

    .line 16
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    throw v0
.end method

.method public final declared-synchronized zzb(Landroid/net/Uri;Ljava/util/Map;)[Lcom/google/android/gms/internal/ads/zzaga;
    .locals 24

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    const/16 v2, 0x15

    .line 7
    .line 8
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 9
    .line 10
    .line 11
    const-string v3, "Content-Type"

    .line 12
    .line 13
    move-object/from16 v4, p2

    .line 14
    .line 15
    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Ljava/util/List;

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    if-eqz v5, :cond_1

    .line 29
    .line 30
    :cond_0
    const/4 v3, 0x0

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    check-cast v3, Ljava/lang/String;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    move-exception v0

    .line 40
    goto/16 :goto_7

    .line 41
    .line 42
    :goto_0
    const/16 v8, 0x10

    .line 43
    .line 44
    const/4 v9, 0x5

    .line 45
    const/4 v10, 0x7

    .line 46
    const/16 v11, 0x14

    .line 47
    .line 48
    const/16 v12, 0xc

    .line 49
    .line 50
    const/4 v13, 0x6

    .line 51
    const/16 v14, 0xb

    .line 52
    .line 53
    const/16 v15, 0xe

    .line 54
    .line 55
    const/16 v16, 0x13

    .line 56
    .line 57
    const/16 v17, 0x1

    .line 58
    .line 59
    const/16 v18, 0x9

    .line 60
    .line 61
    const/16 v19, 0xd

    .line 62
    .line 63
    const/16 v20, 0xf

    .line 64
    .line 65
    const/16 v21, 0x8

    .line 66
    .line 67
    const/16 v22, 0xa

    .line 68
    .line 69
    const/4 v5, -0x1

    .line 70
    if-nez v3, :cond_2

    .line 71
    .line 72
    :goto_1
    move v3, v5

    .line 73
    goto/16 :goto_4

    .line 74
    .line 75
    :cond_2
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzas;->zzh(Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 80
    .line 81
    .line 82
    move-result v23

    .line 83
    sparse-switch v23, :sswitch_data_0

    .line 84
    .line 85
    .line 86
    goto/16 :goto_2

    .line 87
    .line 88
    :sswitch_0
    const-string v6, "video/x-matroska"

    .line 89
    .line 90
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    if-eqz v3, :cond_3

    .line 95
    .line 96
    move/from16 v3, v22

    .line 97
    .line 98
    goto/16 :goto_3

    .line 99
    .line 100
    :sswitch_1
    const-string v6, "audio/webm"

    .line 101
    .line 102
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    if-eqz v3, :cond_3

    .line 107
    .line 108
    move/from16 v3, v19

    .line 109
    .line 110
    goto/16 :goto_3

    .line 111
    .line 112
    :sswitch_2
    const-string v6, "audio/mpeg"

    .line 113
    .line 114
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    if-eqz v3, :cond_3

    .line 119
    .line 120
    move/from16 v3, v20

    .line 121
    .line 122
    goto/16 :goto_3

    .line 123
    .line 124
    :sswitch_3
    const-string v6, "audio/midi"

    .line 125
    .line 126
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    if-eqz v3, :cond_3

    .line 131
    .line 132
    move/from16 v3, v18

    .line 133
    .line 134
    goto/16 :goto_3

    .line 135
    .line 136
    :sswitch_4
    const-string v6, "audio/flac"

    .line 137
    .line 138
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v3

    .line 142
    if-eqz v3, :cond_3

    .line 143
    .line 144
    move v3, v10

    .line 145
    goto/16 :goto_3

    .line 146
    .line 147
    :sswitch_5
    const-string v6, "audio/eac3"

    .line 148
    .line 149
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    if-eqz v3, :cond_3

    .line 154
    .line 155
    move/from16 v3, v17

    .line 156
    .line 157
    goto/16 :goto_3

    .line 158
    .line 159
    :sswitch_6
    const-string v6, "audio/3gpp"

    .line 160
    .line 161
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v3

    .line 165
    if-eqz v3, :cond_3

    .line 166
    .line 167
    move v3, v9

    .line 168
    goto/16 :goto_3

    .line 169
    .line 170
    :sswitch_7
    const-string v6, "video/mp4"

    .line 171
    .line 172
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    if-eqz v3, :cond_3

    .line 177
    .line 178
    move v3, v8

    .line 179
    goto/16 :goto_3

    .line 180
    .line 181
    :sswitch_8
    const-string v6, "audio/wav"

    .line 182
    .line 183
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v3

    .line 187
    if-eqz v3, :cond_3

    .line 188
    .line 189
    const/16 v3, 0x16

    .line 190
    .line 191
    goto/16 :goto_3

    .line 192
    .line 193
    :sswitch_9
    const-string v6, "audio/ogg"

    .line 194
    .line 195
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v3

    .line 199
    if-eqz v3, :cond_3

    .line 200
    .line 201
    move/from16 v3, v16

    .line 202
    .line 203
    goto/16 :goto_3

    .line 204
    .line 205
    :sswitch_a
    const-string v6, "audio/mp4"

    .line 206
    .line 207
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result v3

    .line 211
    if-eqz v3, :cond_3

    .line 212
    .line 213
    const/16 v3, 0x11

    .line 214
    .line 215
    goto/16 :goto_3

    .line 216
    .line 217
    :sswitch_b
    const-string v6, "audio/amr"

    .line 218
    .line 219
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result v3

    .line 223
    if-eqz v3, :cond_3

    .line 224
    .line 225
    const/4 v3, 0x4

    .line 226
    goto/16 :goto_3

    .line 227
    .line 228
    :sswitch_c
    const-string v6, "audio/ac4"

    .line 229
    .line 230
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    move-result v3

    .line 234
    if-eqz v3, :cond_3

    .line 235
    .line 236
    const/4 v3, 0x3

    .line 237
    goto/16 :goto_3

    .line 238
    .line 239
    :sswitch_d
    const-string v6, "audio/ac3"

    .line 240
    .line 241
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    move-result v3

    .line 245
    if-eqz v3, :cond_3

    .line 246
    .line 247
    move v3, v4

    .line 248
    goto/16 :goto_3

    .line 249
    .line 250
    :sswitch_e
    const-string v6, "video/x-flv"

    .line 251
    .line 252
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    move-result v3

    .line 256
    if-eqz v3, :cond_3

    .line 257
    .line 258
    move/from16 v3, v21

    .line 259
    .line 260
    goto/16 :goto_3

    .line 261
    .line 262
    :sswitch_f
    const-string v6, "application/webm"

    .line 263
    .line 264
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result v3

    .line 268
    if-eqz v3, :cond_3

    .line 269
    .line 270
    move v3, v15

    .line 271
    goto/16 :goto_3

    .line 272
    .line 273
    :sswitch_10
    const-string v6, "audio/x-matroska"

    .line 274
    .line 275
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result v3

    .line 279
    if-eqz v3, :cond_3

    .line 280
    .line 281
    move v3, v14

    .line 282
    goto/16 :goto_3

    .line 283
    .line 284
    :sswitch_11
    const-string v6, "image/png"

    .line 285
    .line 286
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    move-result v3

    .line 290
    if-eqz v3, :cond_3

    .line 291
    .line 292
    const/16 v3, 0x1a

    .line 293
    .line 294
    goto/16 :goto_3

    .line 295
    .line 296
    :sswitch_12
    const-string v6, "image/bmp"

    .line 297
    .line 298
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 299
    .line 300
    .line 301
    move-result v3

    .line 302
    if-eqz v3, :cond_3

    .line 303
    .line 304
    const/16 v3, 0x1c

    .line 305
    .line 306
    goto/16 :goto_3

    .line 307
    .line 308
    :sswitch_13
    const-string v6, "text/vtt"

    .line 309
    .line 310
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 311
    .line 312
    .line 313
    move-result v3

    .line 314
    if-eqz v3, :cond_3

    .line 315
    .line 316
    const/16 v3, 0x17

    .line 317
    .line 318
    goto/16 :goto_3

    .line 319
    .line 320
    :sswitch_14
    const-string v6, "video/x-msvideo"

    .line 321
    .line 322
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 323
    .line 324
    .line 325
    move-result v3

    .line 326
    if-eqz v3, :cond_3

    .line 327
    .line 328
    const/16 v3, 0x19

    .line 329
    .line 330
    goto/16 :goto_3

    .line 331
    .line 332
    :sswitch_15
    const-string v6, "application/mp4"

    .line 333
    .line 334
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 335
    .line 336
    .line 337
    move-result v3

    .line 338
    if-eqz v3, :cond_3

    .line 339
    .line 340
    const/16 v3, 0x12

    .line 341
    .line 342
    goto/16 :goto_3

    .line 343
    .line 344
    :sswitch_16
    const-string v6, "image/webp"

    .line 345
    .line 346
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 347
    .line 348
    .line 349
    move-result v3

    .line 350
    if-eqz v3, :cond_3

    .line 351
    .line 352
    const/16 v3, 0x1b

    .line 353
    .line 354
    goto/16 :goto_3

    .line 355
    .line 356
    :sswitch_17
    const-string v6, "image/jpeg"

    .line 357
    .line 358
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 359
    .line 360
    .line 361
    move-result v3

    .line 362
    if-eqz v3, :cond_3

    .line 363
    .line 364
    const/16 v3, 0x18

    .line 365
    .line 366
    goto :goto_3

    .line 367
    :sswitch_18
    const-string v6, "image/heif"

    .line 368
    .line 369
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 370
    .line 371
    .line 372
    move-result v3

    .line 373
    if-eqz v3, :cond_3

    .line 374
    .line 375
    const/16 v3, 0x1d

    .line 376
    .line 377
    goto :goto_3

    .line 378
    :sswitch_19
    const-string v6, "image/heic"

    .line 379
    .line 380
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 381
    .line 382
    .line 383
    move-result v3

    .line 384
    if-eqz v3, :cond_3

    .line 385
    .line 386
    const/16 v3, 0x1e

    .line 387
    .line 388
    goto :goto_3

    .line 389
    :sswitch_1a
    const-string v6, "image/avif"

    .line 390
    .line 391
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 392
    .line 393
    .line 394
    move-result v3

    .line 395
    if-eqz v3, :cond_3

    .line 396
    .line 397
    const/16 v3, 0x1f

    .line 398
    .line 399
    goto :goto_3

    .line 400
    :sswitch_1b
    const-string v6, "audio/amr-wb"

    .line 401
    .line 402
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 403
    .line 404
    .line 405
    move-result v3

    .line 406
    if-eqz v3, :cond_3

    .line 407
    .line 408
    move v3, v13

    .line 409
    goto :goto_3

    .line 410
    :sswitch_1c
    const-string v6, "video/webm"

    .line 411
    .line 412
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 413
    .line 414
    .line 415
    move-result v3

    .line 416
    if-eqz v3, :cond_3

    .line 417
    .line 418
    move v3, v12

    .line 419
    goto :goto_3

    .line 420
    :sswitch_1d
    const-string v6, "video/mp2t"

    .line 421
    .line 422
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 423
    .line 424
    .line 425
    move-result v3

    .line 426
    if-eqz v3, :cond_3

    .line 427
    .line 428
    move v3, v2

    .line 429
    goto :goto_3

    .line 430
    :sswitch_1e
    const-string v6, "video/mp2p"

    .line 431
    .line 432
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 433
    .line 434
    .line 435
    move-result v3

    .line 436
    if-eqz v3, :cond_3

    .line 437
    .line 438
    move v3, v11

    .line 439
    goto :goto_3

    .line 440
    :sswitch_1f
    const-string v6, "audio/eac3-joc"

    .line 441
    .line 442
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 443
    .line 444
    .line 445
    move-result v3

    .line 446
    if-eqz v3, :cond_3

    .line 447
    .line 448
    const/4 v3, 0x2

    .line 449
    goto :goto_3

    .line 450
    :cond_3
    :goto_2
    move v3, v5

    .line 451
    :goto_3
    packed-switch v3, :pswitch_data_0

    .line 452
    .line 453
    .line 454
    goto/16 :goto_1

    .line 455
    .line 456
    :pswitch_0
    move v3, v2

    .line 457
    goto :goto_4

    .line 458
    :pswitch_1
    move v3, v11

    .line 459
    goto :goto_4

    .line 460
    :pswitch_2
    move/from16 v3, v16

    .line 461
    .line 462
    goto :goto_4

    .line 463
    :pswitch_3
    const/16 v3, 0x12

    .line 464
    .line 465
    goto :goto_4

    .line 466
    :pswitch_4
    const/16 v3, 0x11

    .line 467
    .line 468
    goto :goto_4

    .line 469
    :pswitch_5
    move v3, v8

    .line 470
    goto :goto_4

    .line 471
    :pswitch_6
    move v3, v15

    .line 472
    goto :goto_4

    .line 473
    :pswitch_7
    move/from16 v3, v19

    .line 474
    .line 475
    goto :goto_4

    .line 476
    :pswitch_8
    move v3, v12

    .line 477
    goto :goto_4

    .line 478
    :pswitch_9
    move v3, v14

    .line 479
    goto :goto_4

    .line 480
    :pswitch_a
    move/from16 v3, v22

    .line 481
    .line 482
    goto :goto_4

    .line 483
    :pswitch_b
    move/from16 v3, v18

    .line 484
    .line 485
    goto :goto_4

    .line 486
    :pswitch_c
    move/from16 v3, v21

    .line 487
    .line 488
    goto :goto_4

    .line 489
    :pswitch_d
    move v3, v10

    .line 490
    goto :goto_4

    .line 491
    :pswitch_e
    move v3, v13

    .line 492
    goto :goto_4

    .line 493
    :pswitch_f
    move/from16 v3, v20

    .line 494
    .line 495
    goto :goto_4

    .line 496
    :pswitch_10
    move v3, v9

    .line 497
    goto :goto_4

    .line 498
    :pswitch_11
    const/4 v3, 0x4

    .line 499
    goto :goto_4

    .line 500
    :pswitch_12
    const/4 v3, 0x3

    .line 501
    goto :goto_4

    .line 502
    :pswitch_13
    move/from16 v3, v17

    .line 503
    .line 504
    goto :goto_4

    .line 505
    :pswitch_14
    move v3, v4

    .line 506
    :goto_4
    if-eq v3, v5, :cond_4

    .line 507
    .line 508
    invoke-direct {v1, v3, v0}, Lcom/google/android/gms/internal/ads/zzafw;->zzc(ILjava/util/List;)V

    .line 509
    .line 510
    .line 511
    :cond_4
    invoke-virtual/range {p1 .. p1}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    .line 512
    .line 513
    .line 514
    move-result-object v6

    .line 515
    if-nez v6, :cond_6

    .line 516
    .line 517
    :cond_5
    move v6, v5

    .line 518
    goto/16 :goto_5

    .line 519
    .line 520
    :cond_6
    const-string v7, ".ac3"

    .line 521
    .line 522
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 523
    .line 524
    .line 525
    move-result v7

    .line 526
    if-nez v7, :cond_7

    .line 527
    .line 528
    const-string v7, ".ec3"

    .line 529
    .line 530
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 531
    .line 532
    .line 533
    move-result v7

    .line 534
    if-eqz v7, :cond_8

    .line 535
    .line 536
    :cond_7
    move v6, v4

    .line 537
    goto/16 :goto_5

    .line 538
    .line 539
    :cond_8
    const-string v7, ".ac4"

    .line 540
    .line 541
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 542
    .line 543
    .line 544
    move-result v7

    .line 545
    if-eqz v7, :cond_9

    .line 546
    .line 547
    move/from16 v6, v17

    .line 548
    .line 549
    goto/16 :goto_5

    .line 550
    .line 551
    :cond_9
    const-string v7, ".adts"

    .line 552
    .line 553
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 554
    .line 555
    .line 556
    move-result v7

    .line 557
    if-nez v7, :cond_a

    .line 558
    .line 559
    const-string v7, ".aac"

    .line 560
    .line 561
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 562
    .line 563
    .line 564
    move-result v7

    .line 565
    if-eqz v7, :cond_b

    .line 566
    .line 567
    :cond_a
    const/4 v6, 0x2

    .line 568
    goto/16 :goto_5

    .line 569
    .line 570
    :cond_b
    const-string v7, ".amr"

    .line 571
    .line 572
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 573
    .line 574
    .line 575
    move-result v7

    .line 576
    if-eqz v7, :cond_c

    .line 577
    .line 578
    const/4 v6, 0x3

    .line 579
    goto/16 :goto_5

    .line 580
    .line 581
    :cond_c
    const-string v7, ".flac"

    .line 582
    .line 583
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 584
    .line 585
    .line 586
    move-result v7

    .line 587
    if-eqz v7, :cond_d

    .line 588
    .line 589
    const/4 v6, 0x4

    .line 590
    goto/16 :goto_5

    .line 591
    .line 592
    :cond_d
    const-string v7, ".flv"

    .line 593
    .line 594
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 595
    .line 596
    .line 597
    move-result v7

    .line 598
    if-eqz v7, :cond_e

    .line 599
    .line 600
    move v6, v9

    .line 601
    goto/16 :goto_5

    .line 602
    .line 603
    :cond_e
    const-string v7, ".mid"

    .line 604
    .line 605
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 606
    .line 607
    .line 608
    move-result v7

    .line 609
    if-nez v7, :cond_f

    .line 610
    .line 611
    const-string v7, ".midi"

    .line 612
    .line 613
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 614
    .line 615
    .line 616
    move-result v7

    .line 617
    if-nez v7, :cond_f

    .line 618
    .line 619
    const-string v7, ".smf"

    .line 620
    .line 621
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 622
    .line 623
    .line 624
    move-result v7

    .line 625
    if-eqz v7, :cond_10

    .line 626
    .line 627
    :cond_f
    move/from16 v6, v20

    .line 628
    .line 629
    goto/16 :goto_5

    .line 630
    .line 631
    :cond_10
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 632
    .line 633
    .line 634
    move-result v7

    .line 635
    const-string v9, ".mk"

    .line 636
    .line 637
    add-int/lit8 v7, v7, -0x4

    .line 638
    .line 639
    invoke-virtual {v6, v9, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    .line 640
    .line 641
    .line 642
    move-result v7

    .line 643
    if-nez v7, :cond_11

    .line 644
    .line 645
    const-string v7, ".webm"

    .line 646
    .line 647
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 648
    .line 649
    .line 650
    move-result v7

    .line 651
    if-eqz v7, :cond_12

    .line 652
    .line 653
    :cond_11
    move v6, v13

    .line 654
    goto/16 :goto_5

    .line 655
    .line 656
    :cond_12
    const-string v7, ".mp3"

    .line 657
    .line 658
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 659
    .line 660
    .line 661
    move-result v7

    .line 662
    if-eqz v7, :cond_13

    .line 663
    .line 664
    move v6, v10

    .line 665
    goto/16 :goto_5

    .line 666
    .line 667
    :cond_13
    const-string v7, ".mp4"

    .line 668
    .line 669
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 670
    .line 671
    .line 672
    move-result v7

    .line 673
    if-nez v7, :cond_14

    .line 674
    .line 675
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 676
    .line 677
    .line 678
    move-result v7

    .line 679
    add-int/lit8 v7, v7, -0x4

    .line 680
    .line 681
    const-string v9, ".m4"

    .line 682
    .line 683
    invoke-virtual {v6, v9, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    .line 684
    .line 685
    .line 686
    move-result v7

    .line 687
    if-nez v7, :cond_14

    .line 688
    .line 689
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 690
    .line 691
    .line 692
    move-result v7

    .line 693
    const-string v9, ".mp4"

    .line 694
    .line 695
    add-int/lit8 v7, v7, -0x5

    .line 696
    .line 697
    invoke-virtual {v6, v9, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    .line 698
    .line 699
    .line 700
    move-result v7

    .line 701
    if-nez v7, :cond_14

    .line 702
    .line 703
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 704
    .line 705
    .line 706
    move-result v7

    .line 707
    add-int/lit8 v7, v7, -0x5

    .line 708
    .line 709
    const-string v9, ".cmf"

    .line 710
    .line 711
    invoke-virtual {v6, v9, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    .line 712
    .line 713
    .line 714
    move-result v7

    .line 715
    if-eqz v7, :cond_15

    .line 716
    .line 717
    :cond_14
    move/from16 v6, v21

    .line 718
    .line 719
    goto/16 :goto_5

    .line 720
    .line 721
    :cond_15
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 722
    .line 723
    .line 724
    move-result v7

    .line 725
    add-int/lit8 v7, v7, -0x4

    .line 726
    .line 727
    const-string v9, ".og"

    .line 728
    .line 729
    invoke-virtual {v6, v9, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    .line 730
    .line 731
    .line 732
    move-result v7

    .line 733
    if-nez v7, :cond_16

    .line 734
    .line 735
    const-string v7, ".opus"

    .line 736
    .line 737
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 738
    .line 739
    .line 740
    move-result v7

    .line 741
    if-eqz v7, :cond_17

    .line 742
    .line 743
    :cond_16
    move/from16 v6, v18

    .line 744
    .line 745
    goto/16 :goto_5

    .line 746
    .line 747
    :cond_17
    const-string v7, ".ps"

    .line 748
    .line 749
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 750
    .line 751
    .line 752
    move-result v7

    .line 753
    if-nez v7, :cond_18

    .line 754
    .line 755
    const-string v7, ".mpeg"

    .line 756
    .line 757
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 758
    .line 759
    .line 760
    move-result v7

    .line 761
    if-nez v7, :cond_18

    .line 762
    .line 763
    const-string v7, ".mpg"

    .line 764
    .line 765
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 766
    .line 767
    .line 768
    move-result v7

    .line 769
    if-nez v7, :cond_18

    .line 770
    .line 771
    const-string v7, ".m2p"

    .line 772
    .line 773
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 774
    .line 775
    .line 776
    move-result v7

    .line 777
    if-eqz v7, :cond_19

    .line 778
    .line 779
    :cond_18
    move/from16 v6, v22

    .line 780
    .line 781
    goto/16 :goto_5

    .line 782
    .line 783
    :cond_19
    const-string v7, ".ts"

    .line 784
    .line 785
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 786
    .line 787
    .line 788
    move-result v7

    .line 789
    if-nez v7, :cond_1a

    .line 790
    .line 791
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 792
    .line 793
    .line 794
    move-result v7

    .line 795
    add-int/lit8 v7, v7, -0x4

    .line 796
    .line 797
    const-string v9, ".ts"

    .line 798
    .line 799
    invoke-virtual {v6, v9, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    .line 800
    .line 801
    .line 802
    move-result v7

    .line 803
    if-eqz v7, :cond_1b

    .line 804
    .line 805
    :cond_1a
    move v6, v14

    .line 806
    goto/16 :goto_5

    .line 807
    .line 808
    :cond_1b
    const-string v7, ".wav"

    .line 809
    .line 810
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 811
    .line 812
    .line 813
    move-result v7

    .line 814
    if-nez v7, :cond_1c

    .line 815
    .line 816
    const-string v7, ".wave"

    .line 817
    .line 818
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 819
    .line 820
    .line 821
    move-result v7

    .line 822
    if-eqz v7, :cond_1d

    .line 823
    .line 824
    :cond_1c
    move v6, v12

    .line 825
    goto/16 :goto_5

    .line 826
    .line 827
    :cond_1d
    const-string v7, ".vtt"

    .line 828
    .line 829
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 830
    .line 831
    .line 832
    move-result v7

    .line 833
    if-nez v7, :cond_1e

    .line 834
    .line 835
    const-string v7, ".webvtt"

    .line 836
    .line 837
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 838
    .line 839
    .line 840
    move-result v7

    .line 841
    if-eqz v7, :cond_1f

    .line 842
    .line 843
    :cond_1e
    move/from16 v6, v19

    .line 844
    .line 845
    goto/16 :goto_5

    .line 846
    .line 847
    :cond_1f
    const-string v7, ".jpg"

    .line 848
    .line 849
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 850
    .line 851
    .line 852
    move-result v7

    .line 853
    if-nez v7, :cond_20

    .line 854
    .line 855
    const-string v7, ".jpeg"

    .line 856
    .line 857
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 858
    .line 859
    .line 860
    move-result v7

    .line 861
    if-eqz v7, :cond_21

    .line 862
    .line 863
    :cond_20
    move v6, v15

    .line 864
    goto :goto_5

    .line 865
    :cond_21
    const-string v7, ".avi"

    .line 866
    .line 867
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 868
    .line 869
    .line 870
    move-result v7

    .line 871
    if-eqz v7, :cond_22

    .line 872
    .line 873
    move v6, v8

    .line 874
    goto :goto_5

    .line 875
    :cond_22
    const-string v7, ".png"

    .line 876
    .line 877
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 878
    .line 879
    .line 880
    move-result v7

    .line 881
    if-eqz v7, :cond_23

    .line 882
    .line 883
    const/16 v6, 0x11

    .line 884
    .line 885
    goto :goto_5

    .line 886
    :cond_23
    const-string v7, ".webp"

    .line 887
    .line 888
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 889
    .line 890
    .line 891
    move-result v7

    .line 892
    if-eqz v7, :cond_24

    .line 893
    .line 894
    const/16 v6, 0x12

    .line 895
    .line 896
    goto :goto_5

    .line 897
    :cond_24
    const-string v7, ".bmp"

    .line 898
    .line 899
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 900
    .line 901
    .line 902
    move-result v7

    .line 903
    if-nez v7, :cond_25

    .line 904
    .line 905
    const-string v7, ".dib"

    .line 906
    .line 907
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 908
    .line 909
    .line 910
    move-result v7

    .line 911
    if-eqz v7, :cond_26

    .line 912
    .line 913
    :cond_25
    move/from16 v6, v16

    .line 914
    .line 915
    goto :goto_5

    .line 916
    :cond_26
    const-string v7, ".heic"

    .line 917
    .line 918
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 919
    .line 920
    .line 921
    move-result v7

    .line 922
    if-nez v7, :cond_27

    .line 923
    .line 924
    const-string v7, ".heif"

    .line 925
    .line 926
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 927
    .line 928
    .line 929
    move-result v7

    .line 930
    if-eqz v7, :cond_28

    .line 931
    .line 932
    :cond_27
    move v6, v11

    .line 933
    goto :goto_5

    .line 934
    :cond_28
    const-string v7, ".avif"

    .line 935
    .line 936
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 937
    .line 938
    .line 939
    move-result v6

    .line 940
    if-eqz v6, :cond_5

    .line 941
    .line 942
    move v6, v2

    .line 943
    :goto_5
    if-eq v6, v5, :cond_29

    .line 944
    .line 945
    if-eq v6, v3, :cond_29

    .line 946
    .line 947
    invoke-direct {v1, v6, v0}, Lcom/google/android/gms/internal/ads/zzafw;->zzc(ILjava/util/List;)V

    .line 948
    .line 949
    .line 950
    :cond_29
    sget-object v5, Lcom/google/android/gms/internal/ads/zzafw;->zzb:[I

    .line 951
    .line 952
    move v7, v4

    .line 953
    :goto_6
    if-ge v7, v2, :cond_2b

    .line 954
    .line 955
    aget v8, v5, v7

    .line 956
    .line 957
    if-eq v8, v3, :cond_2a

    .line 958
    .line 959
    if-eq v8, v6, :cond_2a

    .line 960
    .line 961
    invoke-direct {v1, v8, v0}, Lcom/google/android/gms/internal/ads/zzafw;->zzc(ILjava/util/List;)V

    .line 962
    .line 963
    .line 964
    :cond_2a
    add-int/lit8 v7, v7, 0x1

    .line 965
    .line 966
    goto :goto_6

    .line 967
    :cond_2b
    new-array v2, v4, [Lcom/google/android/gms/internal/ads/zzaga;

    .line 968
    .line 969
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 970
    .line 971
    .line 972
    move-result-object v0

    .line 973
    check-cast v0, [Lcom/google/android/gms/internal/ads/zzaga;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 974
    .line 975
    monitor-exit p0

    .line 976
    return-object v0

    .line 977
    :goto_7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 978
    throw v0

    .line 979
    :sswitch_data_0
    .sparse-switch
        -0x7e929daa -> :sswitch_1f
        -0x6315f78b -> :sswitch_1e
        -0x6315f787 -> :sswitch_1d
        -0x63118f53 -> :sswitch_1c
        -0x5fc6f775 -> :sswitch_1b
        -0x58abd7ba -> :sswitch_1a
        -0x58a8e8f5 -> :sswitch_19
        -0x58a8e8f2 -> :sswitch_18
        -0x58a7d764 -> :sswitch_17
        -0x58a21830 -> :sswitch_16
        -0x4a681e4e -> :sswitch_15
        -0x405dba54 -> :sswitch_14
        -0x3be2f26c -> :sswitch_13
        -0x3468a12f -> :sswitch_12
        -0x34686c8b -> :sswitch_11
        -0x17118226 -> :sswitch_10
        -0x2974308 -> :sswitch_f
        0xd45707 -> :sswitch_e
        0xb269698 -> :sswitch_d
        0xb269699 -> :sswitch_c
        0xb26980d -> :sswitch_b
        0xb26c538 -> :sswitch_a
        0xb26cbd6 -> :sswitch_9
        0xb26e933 -> :sswitch_8
        0x4f62635d -> :sswitch_7
        0x59976a2d -> :sswitch_6
        0x59ae0c65 -> :sswitch_5
        0x59aeaa01 -> :sswitch_4
        0x59b1cdba -> :sswitch_3
        0x59b1e81e -> :sswitch_2
        0x59b64a32 -> :sswitch_1
        0x79909c15 -> :sswitch_0
    .end sparse-switch

    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_14
        :pswitch_14
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_12
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
