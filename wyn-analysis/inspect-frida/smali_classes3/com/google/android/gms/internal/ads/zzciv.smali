.class public final Lcom/google/android/gms/internal/ads/zzciv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzbpx;


# instance fields
.field private zza:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static zzb(Landroid/content/Context;Ljava/util/Map;Ljava/lang/String;I)I
    .locals 2

    .line 1
    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ljava/lang/String;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    :try_start_0
    sget-object v0, LD6/q;->g:LD6/q;

    .line 10
    .line 11
    iget-object v0, v0, LD6/q;->a:LH6/f;

    .line 12
    .line 13
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-static {p0, v0}, LH6/f;->b(Landroid/content/Context;I)I

    .line 18
    .line 19
    .line 20
    move-result p3
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    goto :goto_0

    .line 22
    :catch_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    add-int/lit8 p0, p0, 0x22

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    new-instance v1, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    add-int/2addr p0, v0

    .line 35
    invoke-direct {v1, p0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 36
    .line 37
    .line 38
    const-string p0, "Could not parse "

    .line 39
    .line 40
    const-string v0, " in a video GMSG: "

    .line 41
    .line 42
    invoke-static {v1, p0, p2, v0, p1}, Lka/n;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    sget v0, LG6/L;->b:I

    .line 47
    .line 48
    invoke-static {p0}, LH6/l;->f(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    :cond_0
    :goto_0
    invoke-static {}, LG6/L;->m()Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    if-eqz p0, :cond_1

    .line 56
    .line 57
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    add-int/lit8 p0, p0, 0x1e

    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    add-int/2addr p0, v0

    .line 76
    add-int/lit8 p0, p0, 0x6

    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    add-int/2addr v0, p0

    .line 83
    new-instance p0, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    add-int/lit8 v0, v0, 0x1

    .line 86
    .line 87
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 88
    .line 89
    .line 90
    const-string v0, "Parse pixels for "

    .line 91
    .line 92
    const-string v1, ", got string "

    .line 93
    .line 94
    invoke-static {p0, v0, p2, v1, p1}, Lka/n;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    const-string p1, ", int "

    .line 98
    .line 99
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    const-string p1, "."

    .line 106
    .line 107
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-static {p0}, LG6/L;->k(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    :cond_1
    return p3
.end method

.method private static zzc(Lcom/google/android/gms/internal/ads/zzchi;Ljava/util/Map;)V
    .locals 5

    .line 1
    const-string v0, "minBufferMs"

    .line 2
    .line 3
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    const-string v1, "maxBufferMs"

    .line 10
    .line 11
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Ljava/lang/String;

    .line 16
    .line 17
    const-string v2, "bufferForPlaybackMs"

    .line 18
    .line 19
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Ljava/lang/String;

    .line 24
    .line 25
    const-string v3, "bufferForPlaybackAfterRebufferMs"

    .line 26
    .line 27
    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Ljava/lang/String;

    .line 32
    .line 33
    const-string v4, "socketReceiveBufferSize"

    .line 34
    .line 35
    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Ljava/lang/String;

    .line 40
    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    :try_start_0
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    invoke-virtual {p0, v4}, Lcom/google/android/gms/internal/ads/zzchi;->zzx(I)V

    .line 48
    .line 49
    .line 50
    :cond_0
    if-eqz v1, :cond_1

    .line 51
    .line 52
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    invoke-virtual {p0, v4}, Lcom/google/android/gms/internal/ads/zzchi;->zzy(I)V

    .line 57
    .line 58
    .line 59
    :cond_1
    if-eqz v2, :cond_2

    .line 60
    .line 61
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/ads/zzchi;->zzz(I)V

    .line 66
    .line 67
    .line 68
    :cond_2
    if-eqz v3, :cond_3

    .line 69
    .line 70
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/ads/zzchi;->zzA(I)V

    .line 75
    .line 76
    .line 77
    :cond_3
    if-eqz p1, :cond_4

    .line 78
    .line 79
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzchi;->zzB(I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :catch_0
    const-string p0, "Could not parse buffer parameters in loadControl video GMSG: ("

    .line 88
    .line 89
    const-string p1, ", "

    .line 90
    .line 91
    const-string v2, ")"

    .line 92
    .line 93
    invoke-static {p0, v0, p1, v1, v2}, LR8/v;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    sget p1, LG6/L;->b:I

    .line 98
    .line 99
    invoke-static {p0}, LH6/l;->f(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    :cond_4
    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    move-object/from16 v3, p1

    .line 7
    .line 8
    check-cast v3, Lcom/google/android/gms/internal/ads/zzchu;

    .line 9
    .line 10
    const-string v4, "action"

    .line 11
    .line 12
    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    check-cast v4, Ljava/lang/String;

    .line 17
    .line 18
    const-string v5, "All demuxed URLs are empty for playback: "

    .line 19
    .line 20
    if-nez v4, :cond_0

    .line 21
    .line 22
    sget v1, LG6/L;->b:I

    .line 23
    .line 24
    const-string v1, "Action missing from video GMSG."

    .line 25
    .line 26
    invoke-static {v1}, LH6/l;->f(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    const-string v6, "playerId"

    .line 31
    .line 32
    invoke-interface {v1, v6}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v7

    .line 36
    if-eqz v7, :cond_1

    .line 37
    .line 38
    invoke-interface {v1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    check-cast v6, Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    goto :goto_0

    .line 53
    :cond_1
    const/4 v6, 0x0

    .line 54
    :goto_0
    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/zzchu;->zzdm()Lcom/google/android/gms/internal/ads/zzchj;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    if-eqz v7, :cond_2

    .line 59
    .line 60
    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/zzchu;->zzdm()Lcom/google/android/gms/internal/ads/zzchj;

    .line 61
    .line 62
    .line 63
    move-result-object v7

    .line 64
    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzchj;->zza()Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    goto :goto_1

    .line 69
    :cond_2
    const/4 v7, 0x0

    .line 70
    :goto_1
    const-string v9, "load"

    .line 71
    .line 72
    if-eqz v6, :cond_3

    .line 73
    .line 74
    if-eqz v7, :cond_3

    .line 75
    .line 76
    invoke-virtual {v6, v7}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v10

    .line 80
    if-nez v10, :cond_3

    .line 81
    .line 82
    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v10

    .line 86
    if-nez v10, :cond_3

    .line 87
    .line 88
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 89
    .line 90
    new-instance v1, Ljava/lang/StringBuilder;

    .line 91
    .line 92
    const-string v2, "Event intended for player "

    .line 93
    .line 94
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    const-string v2, ", but sent to player "

    .line 101
    .line 102
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    const-string v2, " - event ignored"

    .line 109
    .line 110
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    sget v2, LG6/L;->b:I

    .line 118
    .line 119
    invoke-static {v1}, LH6/l;->e(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :cond_3
    const/4 v7, 0x3

    .line 124
    invoke-static {v7}, LH6/l;->j(I)Z

    .line 125
    .line 126
    .line 127
    move-result v7

    .line 128
    if-eqz v7, :cond_4

    .line 129
    .line 130
    new-instance v7, Lorg/json/JSONObject;

    .line 131
    .line 132
    invoke-direct {v7, v1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 133
    .line 134
    .line 135
    const-string v10, "google.afma.Notify_dt"

    .line 136
    .line 137
    invoke-virtual {v7, v10}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v7}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v7

    .line 144
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 145
    .line 146
    .line 147
    move-result v10

    .line 148
    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v11

    .line 152
    add-int/lit8 v10, v10, 0xd

    .line 153
    .line 154
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 155
    .line 156
    .line 157
    move-result v11

    .line 158
    new-instance v12, Ljava/lang/StringBuilder;

    .line 159
    .line 160
    add-int/2addr v10, v11

    .line 161
    invoke-direct {v12, v10}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 162
    .line 163
    .line 164
    const-string v10, "Video GMSG: "

    .line 165
    .line 166
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    const-string v10, " "

    .line 173
    .line 174
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v7

    .line 184
    invoke-static {v7}, LH6/l;->a(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    :cond_4
    const-string v7, "background"

    .line 188
    .line 189
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v7

    .line 193
    const-string v10, "color"

    .line 194
    .line 195
    if-eqz v7, :cond_6

    .line 196
    .line 197
    invoke-interface {v1, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    check-cast v1, Ljava/lang/String;

    .line 202
    .line 203
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 204
    .line 205
    .line 206
    move-result v2

    .line 207
    if-eqz v2, :cond_5

    .line 208
    .line 209
    const-string v1, "Color parameter missing from background video GMSG."

    .line 210
    .line 211
    invoke-static {v1}, LH6/l;->f(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    return-void

    .line 215
    :cond_5
    :try_start_0
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 216
    .line 217
    .line 218
    move-result v1

    .line 219
    invoke-interface {v3, v1}, Lcom/google/android/gms/internal/ads/zzchu;->setBackgroundColor(I)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 220
    .line 221
    .line 222
    return-void

    .line 223
    :catch_0
    const-string v1, "Invalid color parameter in background video GMSG."

    .line 224
    .line 225
    invoke-static {v1}, LH6/l;->f(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    return-void

    .line 229
    :cond_6
    const-string v7, "playerBackground"

    .line 230
    .line 231
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    move-result v7

    .line 235
    if-eqz v7, :cond_8

    .line 236
    .line 237
    invoke-interface {v1, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    check-cast v1, Ljava/lang/String;

    .line 242
    .line 243
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 244
    .line 245
    .line 246
    move-result v2

    .line 247
    if-eqz v2, :cond_7

    .line 248
    .line 249
    const-string v1, "Color parameter missing from playerBackground video GMSG."

    .line 250
    .line 251
    invoke-static {v1}, LH6/l;->f(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    return-void

    .line 255
    :cond_7
    :try_start_1
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 256
    .line 257
    .line 258
    move-result v1

    .line 259
    invoke-interface {v3, v1}, Lcom/google/android/gms/internal/ads/zzchu;->zzv(I)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    .line 260
    .line 261
    .line 262
    return-void

    .line 263
    :catch_1
    const-string v1, "Invalid color parameter in playerBackground video GMSG."

    .line 264
    .line 265
    invoke-static {v1}, LH6/l;->f(Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    return-void

    .line 269
    :cond_8
    const-string v7, "decoderProps"

    .line 270
    .line 271
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    move-result v10

    .line 275
    const-string v11, "onVideoEvent"

    .line 276
    .line 277
    const-string v12, "event"

    .line 278
    .line 279
    const/4 v13, 0x0

    .line 280
    if-eqz v10, :cond_b

    .line 281
    .line 282
    const-string v4, "mimeTypes"

    .line 283
    .line 284
    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    check-cast v1, Ljava/lang/String;

    .line 289
    .line 290
    if-nez v1, :cond_9

    .line 291
    .line 292
    const-string v1, "No MIME types specified for decoder properties inspection."

    .line 293
    .line 294
    invoke-static {v1}, LH6/l;->f(Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    new-instance v1, Ljava/util/HashMap;

    .line 298
    .line 299
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v1, v12, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    const-string v2, "error"

    .line 306
    .line 307
    const-string v4, "missingMimeTypes"

    .line 308
    .line 309
    invoke-virtual {v1, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    invoke-interface {v3, v11, v1}, Lcom/google/android/gms/internal/ads/zzbst;->zze(Ljava/lang/String;Ljava/util/Map;)V

    .line 313
    .line 314
    .line 315
    return-void

    .line 316
    :cond_9
    new-instance v5, Ljava/util/HashMap;

    .line 317
    .line 318
    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 319
    .line 320
    .line 321
    const-string v6, ","

    .line 322
    .line 323
    invoke-virtual {v1, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v1

    .line 327
    array-length v6, v1

    .line 328
    :goto_2
    if-ge v13, v6, :cond_a

    .line 329
    .line 330
    aget-object v8, v1, v13

    .line 331
    .line 332
    invoke-virtual {v8}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v9

    .line 336
    invoke-static {v9}, LG6/J;->a(Ljava/lang/String;)Ljava/util/List;

    .line 337
    .line 338
    .line 339
    move-result-object v9

    .line 340
    invoke-virtual {v5, v8, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    add-int/2addr v13, v2

    .line 344
    goto :goto_2

    .line 345
    :cond_a
    new-instance v1, Ljava/util/HashMap;

    .line 346
    .line 347
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 348
    .line 349
    .line 350
    invoke-virtual {v1, v12, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    invoke-virtual {v1, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    invoke-interface {v3, v11, v1}, Lcom/google/android/gms/internal/ads/zzbst;->zze(Ljava/lang/String;Ljava/util/Map;)V

    .line 357
    .line 358
    .line 359
    return-void

    .line 360
    :cond_b
    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/zzchu;->zzdm()Lcom/google/android/gms/internal/ads/zzchj;

    .line 361
    .line 362
    .line 363
    move-result-object v7

    .line 364
    if-nez v7, :cond_c

    .line 365
    .line 366
    const-string v1, "Could not get underlay container for a video GMSG."

    .line 367
    .line 368
    invoke-static {v1}, LH6/l;->f(Ljava/lang/String;)V

    .line 369
    .line 370
    .line 371
    return-void

    .line 372
    :cond_c
    const-string v10, "new"

    .line 373
    .line 374
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 375
    .line 376
    .line 377
    move-result v10

    .line 378
    const-string v14, "position"

    .line 379
    .line 380
    invoke-virtual {v4, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 381
    .line 382
    .line 383
    move-result v14

    .line 384
    const-string v15, "y"

    .line 385
    .line 386
    const-string v8, "x"

    .line 387
    .line 388
    if-nez v10, :cond_2c

    .line 389
    .line 390
    if-eqz v14, :cond_d

    .line 391
    .line 392
    goto/16 :goto_b

    .line 393
    .line 394
    :cond_d
    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/zzchu;->zzh()Lcom/google/android/gms/internal/ads/zzcmh;

    .line 395
    .line 396
    .line 397
    move-result-object v10

    .line 398
    const-string v14, "currentTime"

    .line 399
    .line 400
    if-eqz v10, :cond_10

    .line 401
    .line 402
    const-string v2, "timeupdate"

    .line 403
    .line 404
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 405
    .line 406
    .line 407
    move-result v2

    .line 408
    if-eqz v2, :cond_f

    .line 409
    .line 410
    invoke-interface {v1, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object v1

    .line 414
    check-cast v1, Ljava/lang/String;

    .line 415
    .line 416
    if-nez v1, :cond_e

    .line 417
    .line 418
    const-string v1, "currentTime parameter missing from timeupdate video GMSG."

    .line 419
    .line 420
    invoke-static {v1}, LH6/l;->f(Ljava/lang/String;)V

    .line 421
    .line 422
    .line 423
    return-void

    .line 424
    :cond_e
    :try_start_2
    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 425
    .line 426
    .line 427
    move-result v2

    .line 428
    invoke-virtual {v10, v2}, Lcom/google/android/gms/internal/ads/zzcmh;->zzd(F)V
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_2

    .line 429
    .line 430
    .line 431
    return-void

    .line 432
    :catch_2
    const-string v2, "Could not parse currentTime parameter from timeupdate video GMSG: "

    .line 433
    .line 434
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    move-result-object v1

    .line 438
    invoke-static {v1}, LH6/l;->f(Ljava/lang/String;)V

    .line 439
    .line 440
    .line 441
    return-void

    .line 442
    :cond_f
    const-string v2, "skip"

    .line 443
    .line 444
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 445
    .line 446
    .line 447
    move-result v2

    .line 448
    if-eqz v2, :cond_10

    .line 449
    .line 450
    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/zzcmh;->zzr()V

    .line 451
    .line 452
    .line 453
    return-void

    .line 454
    :cond_10
    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzchj;->zzd()Lcom/google/android/gms/internal/ads/zzchi;

    .line 455
    .line 456
    .line 457
    move-result-object v2

    .line 458
    if-nez v2, :cond_11

    .line 459
    .line 460
    new-instance v1, Ljava/util/HashMap;

    .line 461
    .line 462
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 463
    .line 464
    .line 465
    const-string v2, "no_video_view"

    .line 466
    .line 467
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 468
    .line 469
    .line 470
    invoke-interface {v3, v11, v1}, Lcom/google/android/gms/internal/ads/zzbst;->zze(Ljava/lang/String;Ljava/util/Map;)V

    .line 471
    .line 472
    .line 473
    return-void

    .line 474
    :cond_11
    const-string v7, "click"

    .line 475
    .line 476
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 477
    .line 478
    .line 479
    move-result v7

    .line 480
    if-eqz v7, :cond_12

    .line 481
    .line 482
    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/zzchu;->getContext()Landroid/content/Context;

    .line 483
    .line 484
    .line 485
    move-result-object v3

    .line 486
    invoke-static {v3, v1, v8, v13}, Lcom/google/android/gms/internal/ads/zzciv;->zzb(Landroid/content/Context;Ljava/util/Map;Ljava/lang/String;I)I

    .line 487
    .line 488
    .line 489
    move-result v4

    .line 490
    invoke-static {v3, v1, v15, v13}, Lcom/google/android/gms/internal/ads/zzciv;->zzb(Landroid/content/Context;Ljava/util/Map;Ljava/lang/String;I)I

    .line 491
    .line 492
    .line 493
    move-result v1

    .line 494
    int-to-float v10, v4

    .line 495
    int-to-float v11, v1

    .line 496
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 497
    .line 498
    .line 499
    move-result-wide v5

    .line 500
    const/4 v9, 0x0

    .line 501
    const/4 v12, 0x0

    .line 502
    move-wide v7, v5

    .line 503
    invoke-static/range {v5 .. v12}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 504
    .line 505
    .line 506
    move-result-object v1

    .line 507
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzchi;->zzC(Landroid/view/MotionEvent;)V

    .line 508
    .line 509
    .line 510
    invoke-virtual {v1}, Landroid/view/MotionEvent;->recycle()V

    .line 511
    .line 512
    .line 513
    return-void

    .line 514
    :cond_12
    invoke-virtual {v4, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 515
    .line 516
    .line 517
    move-result v7

    .line 518
    if-eqz v7, :cond_14

    .line 519
    .line 520
    const-string v3, "time"

    .line 521
    .line 522
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object v1

    .line 526
    check-cast v1, Ljava/lang/String;

    .line 527
    .line 528
    if-nez v1, :cond_13

    .line 529
    .line 530
    const-string v1, "Time parameter missing from currentTime video GMSG."

    .line 531
    .line 532
    invoke-static {v1}, LH6/l;->f(Ljava/lang/String;)V

    .line 533
    .line 534
    .line 535
    return-void

    .line 536
    :cond_13
    :try_start_3
    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 537
    .line 538
    .line 539
    move-result v3

    .line 540
    const/high16 v4, 0x447a0000    # 1000.0f

    .line 541
    .line 542
    mul-float/2addr v3, v4

    .line 543
    float-to-int v3, v3

    .line 544
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzchi;->zzt(I)V
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_3

    .line 545
    .line 546
    .line 547
    return-void

    .line 548
    :catch_3
    const-string v2, "Could not parse time parameter from currentTime video GMSG: "

    .line 549
    .line 550
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 551
    .line 552
    .line 553
    move-result-object v1

    .line 554
    invoke-static {v1}, LH6/l;->f(Ljava/lang/String;)V

    .line 555
    .line 556
    .line 557
    return-void

    .line 558
    :cond_14
    const-string v7, "hide"

    .line 559
    .line 560
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 561
    .line 562
    .line 563
    move-result v7

    .line 564
    if-eqz v7, :cond_15

    .line 565
    .line 566
    const/4 v7, 0x4

    .line 567
    invoke-virtual {v2, v7}, Landroid/view/View;->setVisibility(I)V

    .line 568
    .line 569
    .line 570
    return-void

    .line 571
    :cond_15
    const-string v7, "remove"

    .line 572
    .line 573
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 574
    .line 575
    .line 576
    move-result v7

    .line 577
    if-eqz v7, :cond_16

    .line 578
    .line 579
    const/16 v1, 0x8

    .line 580
    .line 581
    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 582
    .line 583
    .line 584
    return-void

    .line 585
    :cond_16
    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 586
    .line 587
    .line 588
    move-result v7

    .line 589
    if-eqz v7, :cond_17

    .line 590
    .line 591
    invoke-virtual {v2, v6}, Lcom/google/android/gms/internal/ads/zzchi;->zzq(Ljava/lang/Integer;)V

    .line 592
    .line 593
    .line 594
    return-void

    .line 595
    :cond_17
    const-string v6, "loadControl"

    .line 596
    .line 597
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 598
    .line 599
    .line 600
    move-result v6

    .line 601
    if-eqz v6, :cond_18

    .line 602
    .line 603
    invoke-static {v2, v1}, Lcom/google/android/gms/internal/ads/zzciv;->zzc(Lcom/google/android/gms/internal/ads/zzchi;Ljava/util/Map;)V

    .line 604
    .line 605
    .line 606
    return-void

    .line 607
    :cond_18
    const-string v6, "muted"

    .line 608
    .line 609
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 610
    .line 611
    .line 612
    move-result v7

    .line 613
    if-eqz v7, :cond_1a

    .line 614
    .line 615
    invoke-interface {v1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 616
    .line 617
    .line 618
    move-result-object v1

    .line 619
    check-cast v1, Ljava/lang/String;

    .line 620
    .line 621
    invoke-static {v1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 622
    .line 623
    .line 624
    move-result v1

    .line 625
    if-eqz v1, :cond_19

    .line 626
    .line 627
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzchi;->zzu()V

    .line 628
    .line 629
    .line 630
    return-void

    .line 631
    :cond_19
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzchi;->zzv()V

    .line 632
    .line 633
    .line 634
    return-void

    .line 635
    :cond_1a
    const-string v6, "pause"

    .line 636
    .line 637
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 638
    .line 639
    .line 640
    move-result v6

    .line 641
    if-eqz v6, :cond_1b

    .line 642
    .line 643
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzchi;->zzr()V

    .line 644
    .line 645
    .line 646
    return-void

    .line 647
    :cond_1b
    const-string v6, "play"

    .line 648
    .line 649
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 650
    .line 651
    .line 652
    move-result v6

    .line 653
    if-eqz v6, :cond_1c

    .line 654
    .line 655
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzchi;->zzs()V

    .line 656
    .line 657
    .line 658
    return-void

    .line 659
    :cond_1c
    const-string v6, "show"

    .line 660
    .line 661
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 662
    .line 663
    .line 664
    move-result v6

    .line 665
    if-eqz v6, :cond_1d

    .line 666
    .line 667
    invoke-virtual {v2, v13}, Landroid/view/View;->setVisibility(I)V

    .line 668
    .line 669
    .line 670
    return-void

    .line 671
    :cond_1d
    const-string v6, "src"

    .line 672
    .line 673
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 674
    .line 675
    .line 676
    move-result v7

    .line 677
    if-eqz v7, :cond_27

    .line 678
    .line 679
    invoke-interface {v1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 680
    .line 681
    .line 682
    move-result-object v4

    .line 683
    check-cast v4, Ljava/lang/String;

    .line 684
    .line 685
    sget-object v6, Lcom/google/android/gms/internal/ads/zzbix;->zzcR:Lcom/google/android/gms/internal/ads/zzbio;

    .line 686
    .line 687
    sget-object v7, LD6/s;->e:LD6/s;

    .line 688
    .line 689
    iget-object v7, v7, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 690
    .line 691
    invoke-virtual {v7, v6}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 692
    .line 693
    .line 694
    move-result-object v6

    .line 695
    check-cast v6, Ljava/lang/Boolean;

    .line 696
    .line 697
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 698
    .line 699
    .line 700
    move-result v6

    .line 701
    if-eqz v6, :cond_1f

    .line 702
    .line 703
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 704
    .line 705
    .line 706
    move-result v6

    .line 707
    if-nez v6, :cond_1e

    .line 708
    .line 709
    goto :goto_3

    .line 710
    :cond_1e
    const-string v1, "Src parameter missing from src video GMSG."

    .line 711
    .line 712
    invoke-static {v1}, LH6/l;->f(Ljava/lang/String;)V

    .line 713
    .line 714
    .line 715
    return-void

    .line 716
    :cond_1f
    :goto_3
    const-string v6, "periodicReportIntervalMs"

    .line 717
    .line 718
    invoke-interface {v1, v6}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 719
    .line 720
    .line 721
    move-result v7

    .line 722
    if-nez v7, :cond_20

    .line 723
    .line 724
    :goto_4
    const/4 v6, 0x1

    .line 725
    const/4 v8, 0x0

    .line 726
    goto :goto_5

    .line 727
    :cond_20
    :try_start_4
    invoke-interface {v1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 728
    .line 729
    .line 730
    move-result-object v7

    .line 731
    check-cast v7, Ljava/lang/String;

    .line 732
    .line 733
    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 734
    .line 735
    .line 736
    move-result v7

    .line 737
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 738
    .line 739
    .line 740
    move-result-object v8
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_4

    .line 741
    const/4 v6, 0x1

    .line 742
    goto :goto_5

    .line 743
    :catch_4
    invoke-interface {v1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 744
    .line 745
    .line 746
    move-result-object v6

    .line 747
    check-cast v6, Ljava/lang/String;

    .line 748
    .line 749
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 750
    .line 751
    .line 752
    move-result-object v6

    .line 753
    const-string v7, "Video gmsg invalid numeric parameter \'periodicReportIntervalMs\': "

    .line 754
    .line 755
    invoke-virtual {v7, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 756
    .line 757
    .line 758
    move-result-object v6

    .line 759
    invoke-static {v6}, LH6/l;->f(Ljava/lang/String;)V

    .line 760
    .line 761
    .line 762
    goto :goto_4

    .line 763
    :goto_5
    new-array v7, v6, [Ljava/lang/String;

    .line 764
    .line 765
    aput-object v4, v7, v13

    .line 766
    .line 767
    const-string v6, "demuxed"

    .line 768
    .line 769
    invoke-interface {v1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 770
    .line 771
    .line 772
    move-result-object v1

    .line 773
    check-cast v1, Ljava/lang/String;

    .line 774
    .line 775
    if-eqz v1, :cond_25

    .line 776
    .line 777
    :try_start_5
    new-instance v6, Lorg/json/JSONArray;

    .line 778
    .line 779
    invoke-direct {v6, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 780
    .line 781
    .line 782
    new-instance v7, Ljava/util/ArrayList;

    .line 783
    .line 784
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 785
    .line 786
    .line 787
    move v9, v13

    .line 788
    :goto_6
    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    .line 789
    .line 790
    .line 791
    move-result v10

    .line 792
    if-ge v9, v10, :cond_23

    .line 793
    .line 794
    invoke-virtual {v6, v9}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 795
    .line 796
    .line 797
    move-result-object v10

    .line 798
    sget-object v11, Lcom/google/android/gms/internal/ads/zzbix;->zzcR:Lcom/google/android/gms/internal/ads/zzbio;

    .line 799
    .line 800
    sget-object v12, LD6/s;->e:LD6/s;

    .line 801
    .line 802
    iget-object v12, v12, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 803
    .line 804
    invoke-virtual {v12, v11}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 805
    .line 806
    .line 807
    move-result-object v11

    .line 808
    check-cast v11, Ljava/lang/Boolean;

    .line 809
    .line 810
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    .line 811
    .line 812
    .line 813
    move-result v11

    .line 814
    if-eqz v11, :cond_22

    .line 815
    .line 816
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 817
    .line 818
    .line 819
    move-result v11

    .line 820
    if-nez v11, :cond_21

    .line 821
    .line 822
    goto :goto_8

    .line 823
    :cond_21
    :goto_7
    const/16 v16, 0x1

    .line 824
    .line 825
    goto :goto_9

    .line 826
    :cond_22
    :goto_8
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 827
    .line 828
    .line 829
    goto :goto_7

    .line 830
    :goto_9
    add-int/lit8 v9, v9, 0x1

    .line 831
    .line 832
    goto :goto_6

    .line 833
    :cond_23
    sget-object v6, Lcom/google/android/gms/internal/ads/zzbix;->zzcR:Lcom/google/android/gms/internal/ads/zzbio;

    .line 834
    .line 835
    sget-object v9, LD6/s;->e:LD6/s;

    .line 836
    .line 837
    iget-object v9, v9, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 838
    .line 839
    invoke-virtual {v9, v6}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 840
    .line 841
    .line 842
    move-result-object v6

    .line 843
    check-cast v6, Ljava/lang/Boolean;

    .line 844
    .line 845
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 846
    .line 847
    .line 848
    move-result v6

    .line 849
    if-eqz v6, :cond_24

    .line 850
    .line 851
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 852
    .line 853
    .line 854
    move-result v6

    .line 855
    if-eqz v6, :cond_24

    .line 856
    .line 857
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 858
    .line 859
    .line 860
    move-result v6

    .line 861
    add-int/lit8 v6, v6, 0x29

    .line 862
    .line 863
    new-instance v7, Ljava/lang/StringBuilder;

    .line 864
    .line 865
    invoke-direct {v7, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 866
    .line 867
    .line 868
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 869
    .line 870
    .line 871
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 872
    .line 873
    .line 874
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 875
    .line 876
    .line 877
    move-result-object v5

    .line 878
    invoke-static {v5}, LH6/l;->f(Ljava/lang/String;)V

    .line 879
    .line 880
    .line 881
    goto/16 :goto_10

    .line 882
    .line 883
    :cond_24
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 884
    .line 885
    .line 886
    move-result v5

    .line 887
    new-array v5, v5, [Ljava/lang/String;

    .line 888
    .line 889
    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 890
    .line 891
    .line 892
    move-result-object v5

    .line 893
    move-object v7, v5

    .line 894
    check-cast v7, [Ljava/lang/String;
    :try_end_5
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_5

    .line 895
    .line 896
    goto :goto_a

    .line 897
    :catch_5
    const-string v5, "Malformed demuxed URL list for playback: "

    .line 898
    .line 899
    invoke-virtual {v5, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 900
    .line 901
    .line 902
    move-result-object v1

    .line 903
    invoke-static {v1}, LH6/l;->f(Ljava/lang/String;)V

    .line 904
    .line 905
    .line 906
    const/4 v6, 0x1

    .line 907
    new-array v7, v6, [Ljava/lang/String;

    .line 908
    .line 909
    aput-object v4, v7, v13

    .line 910
    .line 911
    :cond_25
    :goto_a
    if-eqz v8, :cond_26

    .line 912
    .line 913
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 914
    .line 915
    .line 916
    move-result v1

    .line 917
    invoke-interface {v3, v1}, Lcom/google/android/gms/internal/ads/zzchu;->zzo(I)V

    .line 918
    .line 919
    .line 920
    :cond_26
    invoke-virtual {v2, v4, v7}, Lcom/google/android/gms/internal/ads/zzchi;->zzo(Ljava/lang/String;[Ljava/lang/String;)V

    .line 921
    .line 922
    .line 923
    return-void

    .line 924
    :cond_27
    const-string v5, "touchMove"

    .line 925
    .line 926
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 927
    .line 928
    .line 929
    move-result v5

    .line 930
    if-eqz v5, :cond_28

    .line 931
    .line 932
    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/zzchu;->getContext()Landroid/content/Context;

    .line 933
    .line 934
    .line 935
    move-result-object v4

    .line 936
    const-string v5, "dx"

    .line 937
    .line 938
    invoke-static {v4, v1, v5, v13}, Lcom/google/android/gms/internal/ads/zzciv;->zzb(Landroid/content/Context;Ljava/util/Map;Ljava/lang/String;I)I

    .line 939
    .line 940
    .line 941
    move-result v5

    .line 942
    const-string v6, "dy"

    .line 943
    .line 944
    invoke-static {v4, v1, v6, v13}, Lcom/google/android/gms/internal/ads/zzciv;->zzb(Landroid/content/Context;Ljava/util/Map;Ljava/lang/String;I)I

    .line 945
    .line 946
    .line 947
    move-result v1

    .line 948
    int-to-float v4, v5

    .line 949
    int-to-float v1, v1

    .line 950
    invoke-virtual {v2, v4, v1}, Lcom/google/android/gms/internal/ads/zzchi;->zzp(FF)V

    .line 951
    .line 952
    .line 953
    iget-boolean v1, v0, Lcom/google/android/gms/internal/ads/zzciv;->zza:Z

    .line 954
    .line 955
    if-nez v1, :cond_33

    .line 956
    .line 957
    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/zzchu;->zzl()V

    .line 958
    .line 959
    .line 960
    const/4 v6, 0x1

    .line 961
    iput-boolean v6, v0, Lcom/google/android/gms/internal/ads/zzciv;->zza:Z

    .line 962
    .line 963
    return-void

    .line 964
    :cond_28
    const-string v3, "volume"

    .line 965
    .line 966
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 967
    .line 968
    .line 969
    move-result v5

    .line 970
    if-eqz v5, :cond_2a

    .line 971
    .line 972
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 973
    .line 974
    .line 975
    move-result-object v1

    .line 976
    check-cast v1, Ljava/lang/String;

    .line 977
    .line 978
    if-nez v1, :cond_29

    .line 979
    .line 980
    const-string v1, "Level parameter missing from volume video GMSG."

    .line 981
    .line 982
    invoke-static {v1}, LH6/l;->f(Ljava/lang/String;)V

    .line 983
    .line 984
    .line 985
    return-void

    .line 986
    :cond_29
    :try_start_6
    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 987
    .line 988
    .line 989
    move-result v3

    .line 990
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzchi;->zzw(F)V
    :try_end_6
    .catch Ljava/lang/NumberFormatException; {:try_start_6 .. :try_end_6} :catch_6

    .line 991
    .line 992
    .line 993
    return-void

    .line 994
    :catch_6
    const-string v2, "Could not parse volume parameter from volume video GMSG: "

    .line 995
    .line 996
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 997
    .line 998
    .line 999
    move-result-object v1

    .line 1000
    invoke-static {v1}, LH6/l;->f(Ljava/lang/String;)V

    .line 1001
    .line 1002
    .line 1003
    return-void

    .line 1004
    :cond_2a
    const-string v1, "watermark"

    .line 1005
    .line 1006
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1007
    .line 1008
    .line 1009
    move-result v1

    .line 1010
    if-eqz v1, :cond_2b

    .line 1011
    .line 1012
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzchi;->zzD()V

    .line 1013
    .line 1014
    .line 1015
    return-void

    .line 1016
    :cond_2b
    const-string v1, "Unknown video action: "

    .line 1017
    .line 1018
    invoke-virtual {v1, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1019
    .line 1020
    .line 1021
    move-result-object v1

    .line 1022
    invoke-static {v1}, LH6/l;->f(Ljava/lang/String;)V

    .line 1023
    .line 1024
    .line 1025
    return-void

    .line 1026
    :cond_2c
    :goto_b
    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/zzchu;->getContext()Landroid/content/Context;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v2

    .line 1030
    invoke-static {v2, v1, v8, v13}, Lcom/google/android/gms/internal/ads/zzciv;->zzb(Landroid/content/Context;Ljava/util/Map;Ljava/lang/String;I)I

    .line 1031
    .line 1032
    .line 1033
    move-result v14

    .line 1034
    invoke-static {v2, v1, v15, v13}, Lcom/google/android/gms/internal/ads/zzciv;->zzb(Landroid/content/Context;Ljava/util/Map;Ljava/lang/String;I)I

    .line 1035
    .line 1036
    .line 1037
    move-result v15

    .line 1038
    const-string v4, "w"

    .line 1039
    .line 1040
    const/4 v5, -0x1

    .line 1041
    invoke-static {v2, v1, v4, v5}, Lcom/google/android/gms/internal/ads/zzciv;->zzb(Landroid/content/Context;Ljava/util/Map;Ljava/lang/String;I)I

    .line 1042
    .line 1043
    .line 1044
    move-result v4

    .line 1045
    sget-object v6, Lcom/google/android/gms/internal/ads/zzbix;->zzeT:Lcom/google/android/gms/internal/ads/zzbio;

    .line 1046
    .line 1047
    sget-object v8, LD6/s;->e:LD6/s;

    .line 1048
    .line 1049
    iget-object v9, v8, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 1050
    .line 1051
    invoke-virtual {v9, v6}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v9

    .line 1055
    check-cast v9, Ljava/lang/Boolean;

    .line 1056
    .line 1057
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1058
    .line 1059
    .line 1060
    move-result v9

    .line 1061
    const-string v11, "."

    .line 1062
    .line 1063
    if-eqz v9, :cond_2e

    .line 1064
    .line 1065
    if-ne v4, v5, :cond_2d

    .line 1066
    .line 1067
    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/zzchu;->zzy()I

    .line 1068
    .line 1069
    .line 1070
    move-result v4

    .line 1071
    goto :goto_c

    .line 1072
    :cond_2d
    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/zzchu;->zzy()I

    .line 1073
    .line 1074
    .line 1075
    move-result v9

    .line 1076
    invoke-static {v4, v9}, Ljava/lang/Math;->min(II)I

    .line 1077
    .line 1078
    .line 1079
    move-result v4

    .line 1080
    goto :goto_c

    .line 1081
    :cond_2e
    invoke-static {}, LG6/L;->m()Z

    .line 1082
    .line 1083
    .line 1084
    move-result v9

    .line 1085
    if-eqz v9, :cond_2f

    .line 1086
    .line 1087
    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/zzchu;->zzy()I

    .line 1088
    .line 1089
    .line 1090
    move-result v9

    .line 1091
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1092
    .line 1093
    .line 1094
    move-result-object v12

    .line 1095
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 1096
    .line 1097
    .line 1098
    move-result v12

    .line 1099
    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v13

    .line 1103
    add-int/lit8 v12, v12, 0x48

    .line 1104
    .line 1105
    const/4 v5, 0x4

    .line 1106
    invoke-static {v12, v5, v13}, LA7/p0;->g(IILjava/lang/String;)I

    .line 1107
    .line 1108
    .line 1109
    move-result v12

    .line 1110
    invoke-static {v14}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v5

    .line 1114
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 1115
    .line 1116
    .line 1117
    move-result v5

    .line 1118
    add-int/2addr v5, v12

    .line 1119
    const/16 v16, 0x1

    .line 1120
    .line 1121
    add-int/lit8 v5, v5, 0x1

    .line 1122
    .line 1123
    new-instance v12, Ljava/lang/StringBuilder;

    .line 1124
    .line 1125
    invoke-direct {v12, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1126
    .line 1127
    .line 1128
    const-string v5, "Calculate width with original width "

    .line 1129
    .line 1130
    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1131
    .line 1132
    .line 1133
    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1134
    .line 1135
    .line 1136
    const-string v5, ", videoHost.getVideoBoundingWidth() "

    .line 1137
    .line 1138
    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1139
    .line 1140
    .line 1141
    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1142
    .line 1143
    .line 1144
    const-string v5, ", x "

    .line 1145
    .line 1146
    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1147
    .line 1148
    .line 1149
    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1150
    .line 1151
    .line 1152
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1153
    .line 1154
    .line 1155
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1156
    .line 1157
    .line 1158
    move-result-object v5

    .line 1159
    invoke-static {v5}, LG6/L;->k(Ljava/lang/String;)V

    .line 1160
    .line 1161
    .line 1162
    :cond_2f
    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/zzchu;->zzy()I

    .line 1163
    .line 1164
    .line 1165
    move-result v5

    .line 1166
    sub-int/2addr v5, v14

    .line 1167
    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    .line 1168
    .line 1169
    .line 1170
    move-result v4

    .line 1171
    :goto_c
    const-string v5, "h"

    .line 1172
    .line 1173
    const/4 v9, -0x1

    .line 1174
    invoke-static {v2, v1, v5, v9}, Lcom/google/android/gms/internal/ads/zzciv;->zzb(Landroid/content/Context;Ljava/util/Map;Ljava/lang/String;I)I

    .line 1175
    .line 1176
    .line 1177
    move-result v2

    .line 1178
    iget-object v5, v8, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 1179
    .line 1180
    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 1181
    .line 1182
    .line 1183
    move-result-object v5

    .line 1184
    check-cast v5, Ljava/lang/Boolean;

    .line 1185
    .line 1186
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1187
    .line 1188
    .line 1189
    move-result v5

    .line 1190
    if-eqz v5, :cond_31

    .line 1191
    .line 1192
    if-ne v2, v9, :cond_30

    .line 1193
    .line 1194
    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/zzchu;->zzx()I

    .line 1195
    .line 1196
    .line 1197
    move-result v2

    .line 1198
    :goto_d
    move/from16 v17, v2

    .line 1199
    .line 1200
    goto :goto_e

    .line 1201
    :cond_30
    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/zzchu;->zzx()I

    .line 1202
    .line 1203
    .line 1204
    move-result v3

    .line 1205
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    .line 1206
    .line 1207
    .line 1208
    move-result v2

    .line 1209
    goto :goto_d

    .line 1210
    :cond_31
    invoke-static {}, LG6/L;->m()Z

    .line 1211
    .line 1212
    .line 1213
    move-result v5

    .line 1214
    if-eqz v5, :cond_32

    .line 1215
    .line 1216
    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/zzchu;->zzx()I

    .line 1217
    .line 1218
    .line 1219
    move-result v5

    .line 1220
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1221
    .line 1222
    .line 1223
    move-result-object v6

    .line 1224
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 1225
    .line 1226
    .line 1227
    move-result v6

    .line 1228
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1229
    .line 1230
    .line 1231
    move-result-object v8

    .line 1232
    add-int/lit8 v6, v6, 0x4b

    .line 1233
    .line 1234
    const/4 v9, 0x4

    .line 1235
    invoke-static {v6, v9, v8}, LA7/p0;->g(IILjava/lang/String;)I

    .line 1236
    .line 1237
    .line 1238
    move-result v6

    .line 1239
    invoke-static {v15}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1240
    .line 1241
    .line 1242
    move-result-object v8

    .line 1243
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 1244
    .line 1245
    .line 1246
    move-result v8

    .line 1247
    add-int/2addr v8, v6

    .line 1248
    const/16 v16, 0x1

    .line 1249
    .line 1250
    add-int/lit8 v8, v8, 0x1

    .line 1251
    .line 1252
    new-instance v6, Ljava/lang/StringBuilder;

    .line 1253
    .line 1254
    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1255
    .line 1256
    .line 1257
    const-string v8, "Calculate height with original height "

    .line 1258
    .line 1259
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1260
    .line 1261
    .line 1262
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1263
    .line 1264
    .line 1265
    const-string v8, ", videoHost.getVideoBoundingHeight() "

    .line 1266
    .line 1267
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1268
    .line 1269
    .line 1270
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1271
    .line 1272
    .line 1273
    const-string v5, ", y "

    .line 1274
    .line 1275
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1276
    .line 1277
    .line 1278
    invoke-virtual {v6, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1279
    .line 1280
    .line 1281
    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1282
    .line 1283
    .line 1284
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1285
    .line 1286
    .line 1287
    move-result-object v5

    .line 1288
    invoke-static {v5}, LG6/L;->k(Ljava/lang/String;)V

    .line 1289
    .line 1290
    .line 1291
    :cond_32
    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/zzchu;->zzx()I

    .line 1292
    .line 1293
    .line 1294
    move-result v3

    .line 1295
    sub-int/2addr v3, v15

    .line 1296
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    .line 1297
    .line 1298
    .line 1299
    move-result v2

    .line 1300
    goto :goto_d

    .line 1301
    :goto_e
    :try_start_7
    const-string v2, "player"

    .line 1302
    .line 1303
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1304
    .line 1305
    .line 1306
    move-result-object v2

    .line 1307
    check-cast v2, Ljava/lang/String;

    .line 1308
    .line 1309
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1310
    .line 1311
    .line 1312
    move-result v13
    :try_end_7
    .catch Ljava/lang/NumberFormatException; {:try_start_7 .. :try_end_7} :catch_7

    .line 1313
    move/from16 v18, v13

    .line 1314
    .line 1315
    goto :goto_f

    .line 1316
    :catch_7
    const/16 v18, 0x0

    .line 1317
    .line 1318
    :goto_f
    const-string v2, "spherical"

    .line 1319
    .line 1320
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1321
    .line 1322
    .line 1323
    move-result-object v2

    .line 1324
    check-cast v2, Ljava/lang/String;

    .line 1325
    .line 1326
    invoke-static {v2}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 1327
    .line 1328
    .line 1329
    move-result v19

    .line 1330
    if-eqz v10, :cond_34

    .line 1331
    .line 1332
    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzchj;->zzd()Lcom/google/android/gms/internal/ads/zzchi;

    .line 1333
    .line 1334
    .line 1335
    move-result-object v2

    .line 1336
    if-nez v2, :cond_34

    .line 1337
    .line 1338
    new-instance v2, Lcom/google/android/gms/internal/ads/zzcht;

    .line 1339
    .line 1340
    const-string v3, "flags"

    .line 1341
    .line 1342
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1343
    .line 1344
    .line 1345
    move-result-object v3

    .line 1346
    check-cast v3, Ljava/lang/String;

    .line 1347
    .line 1348
    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/zzcht;-><init>(Ljava/lang/String;)V

    .line 1349
    .line 1350
    .line 1351
    move-object/from16 v20, v2

    .line 1352
    .line 1353
    move/from16 v16, v4

    .line 1354
    .line 1355
    move-object v13, v7

    .line 1356
    invoke-virtual/range {v13 .. v20}, Lcom/google/android/gms/internal/ads/zzchj;->zzc(IIIIIZLcom/google/android/gms/internal/ads/zzcht;)V

    .line 1357
    .line 1358
    .line 1359
    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzchj;->zzd()Lcom/google/android/gms/internal/ads/zzchi;

    .line 1360
    .line 1361
    .line 1362
    move-result-object v2

    .line 1363
    if-eqz v2, :cond_33

    .line 1364
    .line 1365
    invoke-static {v2, v1}, Lcom/google/android/gms/internal/ads/zzciv;->zzc(Lcom/google/android/gms/internal/ads/zzchi;Ljava/util/Map;)V

    .line 1366
    .line 1367
    .line 1368
    :cond_33
    :goto_10
    return-void

    .line 1369
    :cond_34
    move-object v13, v7

    .line 1370
    move/from16 v2, v17

    .line 1371
    .line 1372
    invoke-virtual {v13, v14, v15, v4, v2}, Lcom/google/android/gms/internal/ads/zzchj;->zzb(IIII)V

    .line 1373
    .line 1374
    .line 1375
    return-void
.end method
