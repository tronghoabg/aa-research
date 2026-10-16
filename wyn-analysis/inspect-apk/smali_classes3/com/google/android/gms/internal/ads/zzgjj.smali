.class final Lcom/google/android/gms/internal/ads/zzgjj;
.super Lcom/google/android/gms/internal/ads/zzgji;
.source "SourceFile"


# instance fields
.field private final zza:Ljava/util/Map;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzgen;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzaxt;Lcom/google/android/gms/internal/ads/zzgie;Lcom/google/android/gms/internal/ads/zzgen;Ljava/util/Map;Lcom/google/android/gms/internal/ads/zzgqo;)V
    .locals 7

    .line 1
    const/16 v0, 0x7a

    .line 2
    .line 3
    invoke-virtual {p5, v0}, Lcom/google/android/gms/internal/ads/zzgqo;->zza(I)Lcom/google/android/gms/internal/ads/zzgqm;

    .line 4
    .line 5
    .line 6
    move-result-object v6

    .line 7
    const-string v2, "0llJphW+1AJxnxbH/gLXWqExBUUJf0DQ3WuxUSKByDNRS1LORshIg0jq004o4mzE"

    .line 8
    .line 9
    const-string v3, "HgFzVQOFBY50xlS1g5v9F7L61Tt5netYE+jncsHeWeQ="

    .line 10
    .line 11
    move-object v1, p0

    .line 12
    move-object v4, p1

    .line 13
    move-object v5, p2

    .line 14
    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/zzgji;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzaxt;Lcom/google/android/gms/internal/ads/zzgie;Lcom/google/android/gms/internal/ads/zzgqm;)V

    .line 15
    .line 16
    .line 17
    iput-object p4, v1, Lcom/google/android/gms/internal/ads/zzgjj;->zza:Ljava/util/Map;

    .line 18
    .line 19
    iput-object p3, v1, Lcom/google/android/gms/internal/ads/zzgjj;->zzb:Lcom/google/android/gms/internal/ads/zzgen;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/reflect/Method;Lcom/google/android/gms/internal/ads/zzaxt;)V
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalAccessException;,
            Ljava/lang/reflect/InvocationTargetException;
        }
    .end annotation

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    new-array v1, v0, [Ljava/lang/Long;

    .line 4
    .line 5
    const-wide/16 v2, -0x1

    .line 6
    .line 7
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-static {v1, v2}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzgjj;->zza:Ljava/util/Map;

    .line 15
    .line 16
    const-string v4, "tcq"

    .line 17
    .line 18
    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    check-cast v4, Ljava/lang/Long;

    .line 23
    .line 24
    invoke-static {v4, v2}, Lcom/google/android/gms/internal/ads/zzgto;->zza(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    check-cast v4, Ljava/lang/Long;

    .line 29
    .line 30
    const/4 v5, 0x0

    .line 31
    aput-object v4, v1, v5

    .line 32
    .line 33
    const-string v4, "tpq"

    .line 34
    .line 35
    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    check-cast v4, Ljava/lang/Long;

    .line 40
    .line 41
    invoke-static {v4, v2}, Lcom/google/android/gms/internal/ads/zzgto;->zza(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    check-cast v4, Ljava/lang/Long;

    .line 46
    .line 47
    const/4 v6, 0x1

    .line 48
    aput-object v4, v1, v6

    .line 49
    .line 50
    const-string v4, "tcv"

    .line 51
    .line 52
    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    check-cast v4, Ljava/lang/Long;

    .line 57
    .line 58
    invoke-static {v4, v2}, Lcom/google/android/gms/internal/ads/zzgto;->zza(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    check-cast v4, Ljava/lang/Long;

    .line 63
    .line 64
    const/4 v7, 0x2

    .line 65
    aput-object v4, v1, v7

    .line 66
    .line 67
    const-string v4, "tpv"

    .line 68
    .line 69
    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    check-cast v4, Ljava/lang/Long;

    .line 74
    .line 75
    invoke-static {v4, v2}, Lcom/google/android/gms/internal/ads/zzgto;->zza(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    check-cast v4, Ljava/lang/Long;

    .line 80
    .line 81
    const/4 v8, 0x3

    .line 82
    aput-object v4, v1, v8

    .line 83
    .line 84
    const-string v4, "tchv"

    .line 85
    .line 86
    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    check-cast v4, Ljava/lang/Long;

    .line 91
    .line 92
    invoke-static {v4, v2}, Lcom/google/android/gms/internal/ads/zzgto;->zza(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    check-cast v4, Ljava/lang/Long;

    .line 97
    .line 98
    const/4 v9, 0x4

    .line 99
    aput-object v4, v1, v9

    .line 100
    .line 101
    const-string v4, "tphv"

    .line 102
    .line 103
    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    check-cast v4, Ljava/lang/Long;

    .line 108
    .line 109
    invoke-static {v4, v2}, Lcom/google/android/gms/internal/ads/zzgto;->zza(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    check-cast v4, Ljava/lang/Long;

    .line 114
    .line 115
    const/4 v10, 0x5

    .line 116
    aput-object v4, v1, v10

    .line 117
    .line 118
    const-string v4, "tcc"

    .line 119
    .line 120
    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    check-cast v4, Ljava/lang/Long;

    .line 125
    .line 126
    invoke-static {v4, v2}, Lcom/google/android/gms/internal/ads/zzgto;->zza(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    check-cast v4, Ljava/lang/Long;

    .line 131
    .line 132
    const/4 v11, 0x6

    .line 133
    aput-object v4, v1, v11

    .line 134
    .line 135
    const-string v4, "tpc"

    .line 136
    .line 137
    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    check-cast v4, Ljava/lang/Long;

    .line 142
    .line 143
    invoke-static {v4, v2}, Lcom/google/android/gms/internal/ads/zzgto;->zza(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    check-cast v4, Ljava/lang/Long;

    .line 148
    .line 149
    const/4 v12, 0x7

    .line 150
    aput-object v4, v1, v12

    .line 151
    .line 152
    const-string v4, "tst"

    .line 153
    .line 154
    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    check-cast v3, Ljava/lang/Long;

    .line 159
    .line 160
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/ads/zzgto;->zza(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    check-cast v3, Ljava/lang/Long;

    .line 165
    .line 166
    const/16 v4, 0x8

    .line 167
    .line 168
    aput-object v3, v1, v4

    .line 169
    .line 170
    move v3, v5

    .line 171
    :goto_0
    if-ge v3, v0, :cond_1

    .line 172
    .line 173
    aget-object v4, v1, v3

    .line 174
    .line 175
    if-nez v4, :cond_0

    .line 176
    .line 177
    aput-object v2, v1, v3

    .line 178
    .line 179
    :cond_0
    add-int/2addr v3, v6

    .line 180
    goto :goto_0

    .line 181
    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgjj;->zzb:Lcom/google/android/gms/internal/ads/zzgen;

    .line 182
    .line 183
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 184
    .line 185
    .line 186
    move-result v0

    .line 187
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    new-array v2, v7, [Ljava/lang/Object;

    .line 192
    .line 193
    aput-object v1, v2, v5

    .line 194
    .line 195
    aput-object v0, v2, v6

    .line 196
    .line 197
    const-string v0, ""

    .line 198
    .line 199
    invoke-virtual {p1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    check-cast p1, [Ljava/lang/Long;

    .line 204
    .line 205
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    monitor-enter p2

    .line 209
    :try_start_0
    aget-object v0, p1, v5

    .line 210
    .line 211
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 212
    .line 213
    .line 214
    move-result-wide v0

    .line 215
    invoke-virtual {p2, v0, v1}, Lcom/google/android/gms/internal/ads/zzaxt;->zzac(J)Lcom/google/android/gms/internal/ads/zzaxt;

    .line 216
    .line 217
    .line 218
    aget-object v0, p1, v6

    .line 219
    .line 220
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 221
    .line 222
    .line 223
    move-result-wide v0

    .line 224
    invoke-virtual {p2, v0, v1}, Lcom/google/android/gms/internal/ads/zzaxt;->zzs(J)Lcom/google/android/gms/internal/ads/zzaxt;

    .line 225
    .line 226
    .line 227
    aget-object v0, p1, v7

    .line 228
    .line 229
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 230
    .line 231
    .line 232
    move-result-wide v0

    .line 233
    invoke-virtual {p2, v0, v1}, Lcom/google/android/gms/internal/ads/zzaxt;->zzn(J)Lcom/google/android/gms/internal/ads/zzaxt;

    .line 234
    .line 235
    .line 236
    aget-object v0, p1, v8

    .line 237
    .line 238
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 239
    .line 240
    .line 241
    move-result-wide v0

    .line 242
    invoke-virtual {p2, v0, v1}, Lcom/google/android/gms/internal/ads/zzaxt;->zzk(J)Lcom/google/android/gms/internal/ads/zzaxt;

    .line 243
    .line 244
    .line 245
    aget-object v0, p1, v9

    .line 246
    .line 247
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 248
    .line 249
    .line 250
    move-result-wide v0

    .line 251
    invoke-virtual {p2, v0, v1}, Lcom/google/android/gms/internal/ads/zzaxt;->zzY(J)Lcom/google/android/gms/internal/ads/zzaxt;

    .line 252
    .line 253
    .line 254
    aget-object v0, p1, v10

    .line 255
    .line 256
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 257
    .line 258
    .line 259
    move-result-wide v0

    .line 260
    invoke-virtual {p2, v0, v1}, Lcom/google/android/gms/internal/ads/zzaxt;->zzZ(J)Lcom/google/android/gms/internal/ads/zzaxt;

    .line 261
    .line 262
    .line 263
    aget-object v0, p1, v11

    .line 264
    .line 265
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 266
    .line 267
    .line 268
    move-result-wide v0

    .line 269
    invoke-virtual {p2, v0, v1}, Lcom/google/android/gms/internal/ads/zzaxt;->zzF(J)Lcom/google/android/gms/internal/ads/zzaxt;

    .line 270
    .line 271
    .line 272
    aget-object p1, p1, v12

    .line 273
    .line 274
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 275
    .line 276
    .line 277
    move-result-wide v0

    .line 278
    invoke-virtual {p2, v0, v1}, Lcom/google/android/gms/internal/ads/zzaxt;->zzG(J)Lcom/google/android/gms/internal/ads/zzaxt;

    .line 279
    .line 280
    .line 281
    monitor-exit p2

    .line 282
    return-void

    .line 283
    :catchall_0
    move-exception p1

    .line 284
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 285
    throw p1
.end method
