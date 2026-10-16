.class public final Lcom/google/android/gms/internal/ads/zzaoi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzans;


# static fields
.field private static final zza:Ljava/util/regex/Pattern;


# instance fields
.field private final zzb:Z

.field private final zzc:Lcom/google/android/gms/internal/ads/zzaoh;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzeu;

.field private zze:Ljava/util/Map;

.field private zzf:F

.field private zzg:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzaoi;->zza:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzaoi;-><init>(Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, -0x800001

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzaoi;->zzf:F

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzaoi;->zzg:F

    new-instance v0, Lcom/google/android/gms/internal/ads/zzeu;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzeu;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaoi;->zzd:Lcom/google/android/gms/internal/ads/zzeu;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 3
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzaoi;->zzb:Z

    .line 4
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzfm;->zzj([B)Ljava/lang/String;

    move-result-object v0

    const-string v2, "Format:"

    .line 5
    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzgtr;->zza(Z)V

    .line 6
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaoh;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzaoh;

    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaoi;->zzc:Lcom/google/android/gms/internal/ads/zzaoh;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzeu;

    .line 9
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/zzeu;-><init>([B)V

    sget-object p1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/internal/ads/zzaoi;->zzb(Lcom/google/android/gms/internal/ads/zzeu;Ljava/nio/charset/Charset;)V

    return-void

    :cond_0
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzaoi;->zzb:Z

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaoi;->zzc:Lcom/google/android/gms/internal/ads/zzaoh;

    return-void
.end method

.method private final zzb(Lcom/google/android/gms/internal/ads/zzeu;Ljava/nio/charset/Charset;)V
    .locals 6

    .line 1
    :cond_0
    :goto_0
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzeu;->zzN(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_e

    .line 6
    .line 7
    const-string v1, "[Script Info]"

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/16 v2, 0x5b

    .line 14
    .line 15
    if-eqz v1, :cond_6

    .line 16
    .line 17
    :catch_0
    :cond_1
    :goto_1
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzeu;->zzN(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzeu;->zzd()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzeu;->zzp(Ljava/nio/charset/Charset;)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eq v1, v2, :cond_0

    .line 34
    .line 35
    :cond_2
    const-string v1, ":"

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    array-length v1, v0

    .line 42
    const/4 v3, 0x2

    .line 43
    if-ne v1, v3, :cond_1

    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    aget-object v3, v0, v1

    .line 47
    .line 48
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzgsz;->zza(Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    const/4 v5, 0x1

    .line 61
    packed-switch v4, :pswitch_data_0

    .line 62
    .line 63
    .line 64
    goto :goto_2

    .line 65
    :pswitch_0
    const-string v1, "playresy"

    .line 66
    .line 67
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_3

    .line 72
    .line 73
    move v1, v5

    .line 74
    goto :goto_3

    .line 75
    :pswitch_1
    const-string v4, "playresx"

    .line 76
    .line 77
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-eqz v3, :cond_3

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_3
    :goto_2
    const/4 v1, -0x1

    .line 85
    :goto_3
    if-eqz v1, :cond_5

    .line 86
    .line 87
    if-eq v1, v5, :cond_4

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_4
    :try_start_0
    aget-object v0, v0, v5

    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzaoi;->zzg:F

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_5
    aget-object v0, v0, v5

    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzaoi;->zzf:F
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_6
    const-string v1, "[V4+ Styles]"

    .line 117
    .line 118
    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    const-string v3, "SsaParser"

    .line 123
    .line 124
    if-eqz v1, :cond_c

    .line 125
    .line 126
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 127
    .line 128
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 129
    .line 130
    .line 131
    const/4 v1, 0x0

    .line 132
    :cond_7
    :goto_4
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzeu;->zzN(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    if-eqz v4, :cond_b

    .line 137
    .line 138
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzeu;->zzd()I

    .line 139
    .line 140
    .line 141
    move-result v5

    .line 142
    if-eqz v5, :cond_8

    .line 143
    .line 144
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzeu;->zzp(Ljava/nio/charset/Charset;)I

    .line 145
    .line 146
    .line 147
    move-result v5

    .line 148
    if-eq v5, v2, :cond_b

    .line 149
    .line 150
    :cond_8
    const-string v5, "Format:"

    .line 151
    .line 152
    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 153
    .line 154
    .line 155
    move-result v5

    .line 156
    if-eqz v5, :cond_9

    .line 157
    .line 158
    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzaoj;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzaoj;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    goto :goto_4

    .line 163
    :cond_9
    const-string v5, "Style:"

    .line 164
    .line 165
    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 166
    .line 167
    .line 168
    move-result v5

    .line 169
    if-eqz v5, :cond_7

    .line 170
    .line 171
    if-nez v1, :cond_a

    .line 172
    .line 173
    const-string v5, "Skipping \'Style:\' line before \'Format:\' line: "

    .line 174
    .line 175
    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v4

    .line 179
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    goto :goto_4

    .line 183
    :cond_a
    invoke-static {v4, v1}, Lcom/google/android/gms/internal/ads/zzaol;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzaoj;)Lcom/google/android/gms/internal/ads/zzaol;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    if-eqz v4, :cond_7

    .line 188
    .line 189
    iget-object v5, v4, Lcom/google/android/gms/internal/ads/zzaol;->zza:Ljava/lang/String;

    .line 190
    .line 191
    invoke-interface {v0, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    goto :goto_4

    .line 195
    :cond_b
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaoi;->zze:Ljava/util/Map;

    .line 196
    .line 197
    goto/16 :goto_0

    .line 198
    .line 199
    :cond_c
    const-string v1, "[V4 Styles]"

    .line 200
    .line 201
    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 202
    .line 203
    .line 204
    move-result v1

    .line 205
    if-eqz v1, :cond_d

    .line 206
    .line 207
    const-string v0, "[V4 Styles] are not supported"

    .line 208
    .line 209
    invoke-static {v3, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzb(Ljava/lang/String;Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    goto/16 :goto_0

    .line 213
    .line 214
    :cond_d
    const-string v1, "[Events]"

    .line 215
    .line 216
    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 217
    .line 218
    .line 219
    move-result v0

    .line 220
    if-eqz v0, :cond_0

    .line 221
    .line 222
    :cond_e
    return-void

    .line 223
    :pswitch_data_0
    .packed-switch 0x70092d0c
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static zzc(Ljava/lang/String;)J
    .locals 10

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzaoi;->zza:Ljava/util/regex/Pattern;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    return-wide v0

    .line 23
    :cond_0
    const/4 v0, 0x1

    .line 24
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sget-object v1, Lcom/google/android/gms/internal/ads/zzfm;->zza:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 31
    .line 32
    .line 33
    move-result-wide v0

    .line 34
    const-wide v2, 0xd693a400L

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    mul-long/2addr v0, v2

    .line 40
    const/4 v2, 0x2

    .line 41
    invoke-virtual {p0, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 46
    .line 47
    .line 48
    move-result-wide v2

    .line 49
    const-wide/32 v4, 0x3938700

    .line 50
    .line 51
    .line 52
    mul-long/2addr v2, v4

    .line 53
    const/4 v4, 0x3

    .line 54
    invoke-virtual {p0, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 59
    .line 60
    .line 61
    move-result-wide v4

    .line 62
    const-wide/32 v6, 0xf4240

    .line 63
    .line 64
    .line 65
    mul-long/2addr v4, v6

    .line 66
    const/4 v6, 0x4

    .line 67
    invoke-virtual {p0, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 72
    .line 73
    .line 74
    move-result-wide v6

    .line 75
    const-wide/16 v8, 0x2710

    .line 76
    .line 77
    mul-long/2addr v6, v8

    .line 78
    add-long/2addr v0, v2

    .line 79
    add-long/2addr v0, v4

    .line 80
    add-long/2addr v0, v6

    .line 81
    return-wide v0
.end method

.method private static zzd(I)F
    .locals 1

    if-eqz p0, :cond_2

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    const p0, -0x800001

    return p0

    :cond_0
    const p0, 0x3f733333    # 0.95f

    return p0

    :cond_1
    const/high16 p0, 0x3f000000    # 0.5f

    return p0

    :cond_2
    const p0, 0x3d4ccccd    # 0.05f

    return p0
.end method

.method private static zze(JLjava/util/List;Ljava/util/List;)I
    .locals 3

    .line 1
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 6
    .line 7
    if-ltz v0, :cond_2

    .line 8
    .line 9
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Ljava/lang/Long;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 16
    .line 17
    .line 18
    move-result-wide v1

    .line 19
    cmp-long v1, v1, p0

    .line 20
    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    return v0

    .line 24
    :cond_1
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Ljava/lang/Long;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 31
    .line 32
    .line 33
    move-result-wide v1

    .line 34
    cmp-long v1, v1, p0

    .line 35
    .line 36
    if-gez v1, :cond_0

    .line 37
    .line 38
    add-int/lit8 v0, v0, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    const/4 v0, 0x0

    .line 42
    :goto_0
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-interface {p2, v0, p0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    if-nez v0, :cond_3

    .line 50
    .line 51
    new-instance p0, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    add-int/lit8 p0, v0, -0x1

    .line 58
    .line 59
    new-instance p1, Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-interface {p3, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, Ljava/util/Collection;

    .line 66
    .line 67
    invoke-direct {p1, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 68
    .line 69
    .line 70
    move-object p0, p1

    .line 71
    :goto_1
    invoke-interface {p3, v0, p0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    return v0
.end method


# virtual methods
.method public final zza([BIILcom/google/android/gms/internal/ads/zzanr;Lcom/google/android/gms/internal/ads/zzdu;)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    new-instance v2, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v3, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    add-int v4, v1, p3

    .line 16
    .line 17
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzaoi;->zzd:Lcom/google/android/gms/internal/ads/zzeu;

    .line 18
    .line 19
    move-object/from16 v6, p1

    .line 20
    .line 21
    invoke-virtual {v5, v6, v4}, Lcom/google/android/gms/internal/ads/zzeu;->zzb([BI)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v5, v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzeu;->zzR()Ljava/nio/charset/Charset;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    if-nez v1, :cond_0

    .line 32
    .line 33
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 34
    .line 35
    :cond_0
    iget-boolean v4, v0, Lcom/google/android/gms/internal/ads/zzaoi;->zzb:Z

    .line 36
    .line 37
    if-nez v4, :cond_1

    .line 38
    .line 39
    invoke-direct {v0, v5, v1}, Lcom/google/android/gms/internal/ads/zzaoi;->zzb(Lcom/google/android/gms/internal/ads/zzeu;Ljava/nio/charset/Charset;)V

    .line 40
    .line 41
    .line 42
    const/4 v4, 0x0

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzaoi;->zzc:Lcom/google/android/gms/internal/ads/zzaoh;

    .line 45
    .line 46
    :goto_0
    invoke-virtual {v5, v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzN(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    const/4 v8, -0x1

    .line 51
    if-eqz v7, :cond_18

    .line 52
    .line 53
    const-string v11, "Format:"

    .line 54
    .line 55
    invoke-virtual {v7, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 56
    .line 57
    .line 58
    move-result v11

    .line 59
    if-eqz v11, :cond_2

    .line 60
    .line 61
    invoke-static {v7}, Lcom/google/android/gms/internal/ads/zzaoh;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzaoh;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    goto :goto_0

    .line 66
    :cond_2
    const-string v11, "Dialogue:"

    .line 67
    .line 68
    invoke-virtual {v7, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 69
    .line 70
    .line 71
    move-result v12

    .line 72
    if-eqz v12, :cond_3

    .line 73
    .line 74
    const-string v12, "SsaParser"

    .line 75
    .line 76
    if-nez v4, :cond_4

    .line 77
    .line 78
    const-string v8, "Skipping dialogue line before complete format: "

    .line 79
    .line 80
    invoke-virtual {v8, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    invoke-static {v12, v7}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    :cond_3
    :goto_1
    move-object/from16 v16, v1

    .line 88
    .line 89
    move-object/from16 v19, v4

    .line 90
    .line 91
    move-object/from16 v20, v5

    .line 92
    .line 93
    goto/16 :goto_e

    .line 94
    .line 95
    :cond_4
    invoke-virtual {v7, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 96
    .line 97
    .line 98
    move-result v11

    .line 99
    invoke-static {v11}, Lcom/google/android/gms/internal/ads/zzgtr;->zza(Z)V

    .line 100
    .line 101
    .line 102
    const/16 v11, 0x9

    .line 103
    .line 104
    invoke-virtual {v7, v11}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v11

    .line 108
    iget v13, v4, Lcom/google/android/gms/internal/ads/zzaoh;->zzf:I

    .line 109
    .line 110
    const-string v14, ","

    .line 111
    .line 112
    invoke-virtual {v11, v14, v13}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v11

    .line 116
    array-length v14, v11

    .line 117
    if-eq v14, v13, :cond_5

    .line 118
    .line 119
    const-string v8, "Skipping dialogue line with fewer columns than format: "

    .line 120
    .line 121
    invoke-virtual {v8, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v7

    .line 125
    invoke-static {v12, v7}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_5
    iget v13, v4, Lcom/google/android/gms/internal/ads/zzaoh;->zza:I

    .line 130
    .line 131
    if-eq v13, v8, :cond_6

    .line 132
    .line 133
    :try_start_0
    aget-object v13, v11, v13

    .line 134
    .line 135
    invoke-virtual {v13}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v13

    .line 139
    invoke-static {v13}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 140
    .line 141
    .line 142
    move-result v13
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 143
    goto :goto_2

    .line 144
    :catch_0
    iget v13, v4, Lcom/google/android/gms/internal/ads/zzaoh;->zza:I

    .line 145
    .line 146
    aget-object v13, v11, v13

    .line 147
    .line 148
    const-string v14, "Fail to parse layer: "

    .line 149
    .line 150
    invoke-static {v13, v14, v12}, Lcb/a;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    :cond_6
    const/4 v13, 0x0

    .line 154
    :goto_2
    iget v14, v4, Lcom/google/android/gms/internal/ads/zzaoh;->zzb:I

    .line 155
    .line 156
    aget-object v14, v11, v14

    .line 157
    .line 158
    invoke-static {v14}, Lcom/google/android/gms/internal/ads/zzaoi;->zzc(Ljava/lang/String;)J

    .line 159
    .line 160
    .line 161
    move-result-wide v14

    .line 162
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    cmp-long v18, v14, v16

    .line 168
    .line 169
    const-string v6, "Skipping invalid timing: "

    .line 170
    .line 171
    if-nez v18, :cond_7

    .line 172
    .line 173
    invoke-virtual {v6, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v6

    .line 177
    invoke-static {v12, v6}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    goto :goto_1

    .line 181
    :cond_7
    iget v9, v4, Lcom/google/android/gms/internal/ads/zzaoh;->zzc:I

    .line 182
    .line 183
    aget-object v9, v11, v9

    .line 184
    .line 185
    move-object/from16 p4, v11

    .line 186
    .line 187
    invoke-static {v9}, Lcom/google/android/gms/internal/ads/zzaoi;->zzc(Ljava/lang/String;)J

    .line 188
    .line 189
    .line 190
    move-result-wide v10

    .line 191
    cmp-long v9, v10, v16

    .line 192
    .line 193
    if-eqz v9, :cond_8

    .line 194
    .line 195
    cmp-long v9, v10, v14

    .line 196
    .line 197
    if-gtz v9, :cond_9

    .line 198
    .line 199
    :cond_8
    move-object/from16 v16, v1

    .line 200
    .line 201
    move-object/from16 v19, v4

    .line 202
    .line 203
    move-object/from16 v20, v5

    .line 204
    .line 205
    goto/16 :goto_d

    .line 206
    .line 207
    :cond_9
    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzaoi;->zze:Ljava/util/Map;

    .line 208
    .line 209
    if-eqz v6, :cond_a

    .line 210
    .line 211
    iget v7, v4, Lcom/google/android/gms/internal/ads/zzaoh;->zzd:I

    .line 212
    .line 213
    if-eq v7, v8, :cond_a

    .line 214
    .line 215
    aget-object v7, p4, v7

    .line 216
    .line 217
    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v7

    .line 221
    invoke-interface {v6, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v6

    .line 225
    check-cast v6, Lcom/google/android/gms/internal/ads/zzaol;

    .line 226
    .line 227
    goto :goto_3

    .line 228
    :cond_a
    const/4 v6, 0x0

    .line 229
    :goto_3
    iget v7, v4, Lcom/google/android/gms/internal/ads/zzaoh;->zze:I

    .line 230
    .line 231
    aget-object v7, p4, v7

    .line 232
    .line 233
    invoke-static {v7}, Lcom/google/android/gms/internal/ads/zzaok;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzaok;

    .line 234
    .line 235
    .line 236
    move-result-object v9

    .line 237
    invoke-static {v7}, Lcom/google/android/gms/internal/ads/zzaok;->zzb(Ljava/lang/String;)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v7

    .line 241
    const-string v8, "\\N"

    .line 242
    .line 243
    move-object/from16 v16, v1

    .line 244
    .line 245
    const-string v1, "\n"

    .line 246
    .line 247
    invoke-virtual {v7, v8, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v7

    .line 251
    const-string v8, "\\n"

    .line 252
    .line 253
    invoke-virtual {v7, v8, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    const-string v7, "\\h"

    .line 258
    .line 259
    const-string v8, "\u00a0"

    .line 260
    .line 261
    invoke-virtual {v1, v7, v8}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    iget v7, v0, Lcom/google/android/gms/internal/ads/zzaoi;->zzf:F

    .line 266
    .line 267
    iget v8, v0, Lcom/google/android/gms/internal/ads/zzaoi;->zzg:F

    .line 268
    .line 269
    new-instance v0, Landroid/text/SpannableString;

    .line 270
    .line 271
    invoke-direct {v0, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 272
    .line 273
    .line 274
    new-instance v1, Lcom/google/android/gms/internal/ads/zzcx;

    .line 275
    .line 276
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzcx;-><init>()V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzcx;->zza(Ljava/lang/CharSequence;)Lcom/google/android/gms/internal/ads/zzcx;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v1, v13}, Lcom/google/android/gms/internal/ads/zzcx;->zzq(I)Lcom/google/android/gms/internal/ads/zzcx;

    .line 283
    .line 284
    .line 285
    const v17, -0x800001

    .line 286
    .line 287
    .line 288
    if-eqz v6, :cond_12

    .line 289
    .line 290
    iget-object v13, v6, Lcom/google/android/gms/internal/ads/zzaol;->zzc:Ljava/lang/Integer;

    .line 291
    .line 292
    move-object/from16 v19, v4

    .line 293
    .line 294
    if-eqz v13, :cond_b

    .line 295
    .line 296
    new-instance v4, Landroid/text/style/ForegroundColorSpan;

    .line 297
    .line 298
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 299
    .line 300
    .line 301
    move-result v13

    .line 302
    invoke-direct {v4, v13}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v0}, Landroid/text/SpannableString;->length()I

    .line 306
    .line 307
    .line 308
    move-result v13

    .line 309
    move-object/from16 v20, v5

    .line 310
    .line 311
    move/from16 v21, v7

    .line 312
    .line 313
    const/4 v5, 0x0

    .line 314
    const/16 v7, 0x21

    .line 315
    .line 316
    invoke-virtual {v0, v4, v5, v13, v7}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 317
    .line 318
    .line 319
    goto :goto_4

    .line 320
    :cond_b
    move-object/from16 v20, v5

    .line 321
    .line 322
    move/from16 v21, v7

    .line 323
    .line 324
    :goto_4
    iget v4, v6, Lcom/google/android/gms/internal/ads/zzaol;->zzj:I

    .line 325
    .line 326
    const/4 v5, 0x3

    .line 327
    if-ne v4, v5, :cond_c

    .line 328
    .line 329
    iget-object v4, v6, Lcom/google/android/gms/internal/ads/zzaol;->zzd:Ljava/lang/Integer;

    .line 330
    .line 331
    if-eqz v4, :cond_c

    .line 332
    .line 333
    new-instance v7, Landroid/text/style/BackgroundColorSpan;

    .line 334
    .line 335
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 336
    .line 337
    .line 338
    move-result v4

    .line 339
    invoke-direct {v7, v4}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    .line 340
    .line 341
    .line 342
    invoke-virtual {v0}, Landroid/text/SpannableString;->length()I

    .line 343
    .line 344
    .line 345
    move-result v4

    .line 346
    const/16 v5, 0x21

    .line 347
    .line 348
    const/4 v13, 0x0

    .line 349
    invoke-virtual {v0, v7, v13, v4, v5}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 350
    .line 351
    .line 352
    :cond_c
    iget v4, v6, Lcom/google/android/gms/internal/ads/zzaol;->zze:F

    .line 353
    .line 354
    cmpl-float v5, v4, v17

    .line 355
    .line 356
    if-eqz v5, :cond_d

    .line 357
    .line 358
    cmpl-float v5, v8, v17

    .line 359
    .line 360
    if-eqz v5, :cond_d

    .line 361
    .line 362
    div-float/2addr v4, v8

    .line 363
    const/4 v5, 0x1

    .line 364
    invoke-virtual {v1, v4, v5}, Lcom/google/android/gms/internal/ads/zzcx;->zzl(FI)Lcom/google/android/gms/internal/ads/zzcx;

    .line 365
    .line 366
    .line 367
    :cond_d
    iget-boolean v4, v6, Lcom/google/android/gms/internal/ads/zzaol;->zzf:Z

    .line 368
    .line 369
    if-eqz v4, :cond_e

    .line 370
    .line 371
    iget-boolean v5, v6, Lcom/google/android/gms/internal/ads/zzaol;->zzg:Z

    .line 372
    .line 373
    if-eqz v5, :cond_e

    .line 374
    .line 375
    new-instance v4, Landroid/text/style/StyleSpan;

    .line 376
    .line 377
    const/4 v5, 0x3

    .line 378
    invoke-direct {v4, v5}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {v0}, Landroid/text/SpannableString;->length()I

    .line 382
    .line 383
    .line 384
    move-result v5

    .line 385
    const/16 v7, 0x21

    .line 386
    .line 387
    const/4 v13, 0x0

    .line 388
    invoke-virtual {v0, v4, v13, v5, v7}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 389
    .line 390
    .line 391
    goto :goto_5

    .line 392
    :cond_e
    const/16 v7, 0x21

    .line 393
    .line 394
    const/4 v13, 0x0

    .line 395
    if-eqz v4, :cond_f

    .line 396
    .line 397
    new-instance v4, Landroid/text/style/StyleSpan;

    .line 398
    .line 399
    const/4 v5, 0x1

    .line 400
    invoke-direct {v4, v5}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v0}, Landroid/text/SpannableString;->length()I

    .line 404
    .line 405
    .line 406
    move-result v5

    .line 407
    invoke-virtual {v0, v4, v13, v5, v7}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 408
    .line 409
    .line 410
    goto :goto_5

    .line 411
    :cond_f
    iget-boolean v4, v6, Lcom/google/android/gms/internal/ads/zzaol;->zzg:Z

    .line 412
    .line 413
    if-eqz v4, :cond_10

    .line 414
    .line 415
    new-instance v4, Landroid/text/style/StyleSpan;

    .line 416
    .line 417
    const/4 v5, 0x2

    .line 418
    invoke-direct {v4, v5}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 419
    .line 420
    .line 421
    invoke-virtual {v0}, Landroid/text/SpannableString;->length()I

    .line 422
    .line 423
    .line 424
    move-result v5

    .line 425
    invoke-virtual {v0, v4, v13, v5, v7}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 426
    .line 427
    .line 428
    :cond_10
    :goto_5
    iget-boolean v4, v6, Lcom/google/android/gms/internal/ads/zzaol;->zzh:Z

    .line 429
    .line 430
    if-eqz v4, :cond_11

    .line 431
    .line 432
    new-instance v4, Landroid/text/style/UnderlineSpan;

    .line 433
    .line 434
    invoke-direct {v4}, Landroid/text/style/UnderlineSpan;-><init>()V

    .line 435
    .line 436
    .line 437
    invoke-virtual {v0}, Landroid/text/SpannableString;->length()I

    .line 438
    .line 439
    .line 440
    move-result v5

    .line 441
    invoke-virtual {v0, v4, v13, v5, v7}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 442
    .line 443
    .line 444
    :cond_11
    iget-boolean v4, v6, Lcom/google/android/gms/internal/ads/zzaol;->zzi:Z

    .line 445
    .line 446
    if-eqz v4, :cond_13

    .line 447
    .line 448
    new-instance v4, Landroid/text/style/StrikethroughSpan;

    .line 449
    .line 450
    invoke-direct {v4}, Landroid/text/style/StrikethroughSpan;-><init>()V

    .line 451
    .line 452
    .line 453
    invoke-virtual {v0}, Landroid/text/SpannableString;->length()I

    .line 454
    .line 455
    .line 456
    move-result v5

    .line 457
    invoke-virtual {v0, v4, v13, v5, v7}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 458
    .line 459
    .line 460
    goto :goto_6

    .line 461
    :cond_12
    move-object/from16 v19, v4

    .line 462
    .line 463
    move-object/from16 v20, v5

    .line 464
    .line 465
    move/from16 v21, v7

    .line 466
    .line 467
    :cond_13
    :goto_6
    iget v0, v9, Lcom/google/android/gms/internal/ads/zzaok;->zza:I

    .line 468
    .line 469
    const/4 v4, -0x1

    .line 470
    if-eq v0, v4, :cond_14

    .line 471
    .line 472
    goto :goto_7

    .line 473
    :cond_14
    if-eqz v6, :cond_15

    .line 474
    .line 475
    iget v0, v6, Lcom/google/android/gms/internal/ads/zzaol;->zzb:I

    .line 476
    .line 477
    goto :goto_7

    .line 478
    :cond_15
    const/4 v0, -0x1

    .line 479
    :goto_7
    const-string v4, "Unknown alignment: "

    .line 480
    .line 481
    const/16 v5, 0x13

    .line 482
    .line 483
    packed-switch v0, :pswitch_data_0

    .line 484
    .line 485
    .line 486
    :pswitch_0
    invoke-static {v0, v5}, LA7/p0;->f(II)I

    .line 487
    .line 488
    .line 489
    move-result v6

    .line 490
    invoke-static {v6, v0, v4, v12}, Lcb/a;->o(IILjava/lang/String;Ljava/lang/String;)V

    .line 491
    .line 492
    .line 493
    :pswitch_1
    const/4 v6, 0x0

    .line 494
    goto :goto_8

    .line 495
    :pswitch_2
    sget-object v6, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    .line 496
    .line 497
    goto :goto_8

    .line 498
    :pswitch_3
    sget-object v6, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    .line 499
    .line 500
    goto :goto_8

    .line 501
    :pswitch_4
    sget-object v6, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    .line 502
    .line 503
    :goto_8
    invoke-virtual {v1, v6}, Lcom/google/android/gms/internal/ads/zzcx;->zzd(Landroid/text/Layout$Alignment;)Lcom/google/android/gms/internal/ads/zzcx;

    .line 504
    .line 505
    .line 506
    const/high16 v6, -0x80000000

    .line 507
    .line 508
    packed-switch v0, :pswitch_data_1

    .line 509
    .line 510
    .line 511
    :pswitch_5
    invoke-static {v0, v5}, LA7/p0;->f(II)I

    .line 512
    .line 513
    .line 514
    move-result v7

    .line 515
    invoke-static {v7, v0, v4, v12}, Lcb/a;->o(IILjava/lang/String;Ljava/lang/String;)V

    .line 516
    .line 517
    .line 518
    :pswitch_6
    move v7, v6

    .line 519
    goto :goto_9

    .line 520
    :pswitch_7
    const/4 v7, 0x2

    .line 521
    goto :goto_9

    .line 522
    :pswitch_8
    const/4 v7, 0x1

    .line 523
    goto :goto_9

    .line 524
    :pswitch_9
    const/4 v7, 0x0

    .line 525
    :goto_9
    invoke-virtual {v1, v7}, Lcom/google/android/gms/internal/ads/zzcx;->zzj(I)Lcom/google/android/gms/internal/ads/zzcx;

    .line 526
    .line 527
    .line 528
    packed-switch v0, :pswitch_data_2

    .line 529
    .line 530
    .line 531
    :pswitch_a
    invoke-static {v0, v5}, LA7/p0;->f(II)I

    .line 532
    .line 533
    .line 534
    move-result v5

    .line 535
    invoke-static {v5, v0, v4, v12}, Lcb/a;->o(IILjava/lang/String;Ljava/lang/String;)V

    .line 536
    .line 537
    .line 538
    goto :goto_a

    .line 539
    :pswitch_b
    const/4 v6, 0x0

    .line 540
    goto :goto_a

    .line 541
    :pswitch_c
    const/4 v6, 0x1

    .line 542
    goto :goto_a

    .line 543
    :pswitch_d
    const/4 v6, 0x2

    .line 544
    :goto_a
    :pswitch_e
    invoke-virtual {v1, v6}, Lcom/google/android/gms/internal/ads/zzcx;->zzg(I)Lcom/google/android/gms/internal/ads/zzcx;

    .line 545
    .line 546
    .line 547
    iget-object v0, v9, Lcom/google/android/gms/internal/ads/zzaok;->zzb:Landroid/graphics/PointF;

    .line 548
    .line 549
    if-eqz v0, :cond_16

    .line 550
    .line 551
    cmpl-float v4, v8, v17

    .line 552
    .line 553
    if-eqz v4, :cond_16

    .line 554
    .line 555
    cmpl-float v4, v21, v17

    .line 556
    .line 557
    if-eqz v4, :cond_16

    .line 558
    .line 559
    iget v4, v0, Landroid/graphics/PointF;->x:F

    .line 560
    .line 561
    div-float v4, v4, v21

    .line 562
    .line 563
    invoke-virtual {v1, v4}, Lcom/google/android/gms/internal/ads/zzcx;->zzi(F)Lcom/google/android/gms/internal/ads/zzcx;

    .line 564
    .line 565
    .line 566
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 567
    .line 568
    div-float/2addr v0, v8

    .line 569
    const/4 v13, 0x0

    .line 570
    invoke-virtual {v1, v0, v13}, Lcom/google/android/gms/internal/ads/zzcx;->zzf(FI)Lcom/google/android/gms/internal/ads/zzcx;

    .line 571
    .line 572
    .line 573
    goto :goto_b

    .line 574
    :cond_16
    const/4 v13, 0x0

    .line 575
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzcx;->zzk()I

    .line 576
    .line 577
    .line 578
    move-result v0

    .line 579
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaoi;->zzd(I)F

    .line 580
    .line 581
    .line 582
    move-result v0

    .line 583
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzcx;->zzi(F)Lcom/google/android/gms/internal/ads/zzcx;

    .line 584
    .line 585
    .line 586
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzcx;->zzh()I

    .line 587
    .line 588
    .line 589
    move-result v0

    .line 590
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaoi;->zzd(I)F

    .line 591
    .line 592
    .line 593
    move-result v0

    .line 594
    invoke-virtual {v1, v0, v13}, Lcom/google/android/gms/internal/ads/zzcx;->zzf(FI)Lcom/google/android/gms/internal/ads/zzcx;

    .line 595
    .line 596
    .line 597
    :goto_b
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzcx;->zzr()Lcom/google/android/gms/internal/ads/zzcy;

    .line 598
    .line 599
    .line 600
    move-result-object v0

    .line 601
    invoke-static {v14, v15, v3, v2}, Lcom/google/android/gms/internal/ads/zzaoi;->zze(JLjava/util/List;Ljava/util/List;)I

    .line 602
    .line 603
    .line 604
    move-result v1

    .line 605
    invoke-static {v10, v11, v3, v2}, Lcom/google/android/gms/internal/ads/zzaoi;->zze(JLjava/util/List;Ljava/util/List;)I

    .line 606
    .line 607
    .line 608
    move-result v4

    .line 609
    :goto_c
    if-ge v1, v4, :cond_17

    .line 610
    .line 611
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 612
    .line 613
    .line 614
    move-result-object v5

    .line 615
    check-cast v5, Ljava/util/List;

    .line 616
    .line 617
    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 618
    .line 619
    .line 620
    add-int/lit8 v1, v1, 0x1

    .line 621
    .line 622
    goto :goto_c

    .line 623
    :goto_d
    invoke-virtual {v6, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 624
    .line 625
    .line 626
    move-result-object v0

    .line 627
    invoke-static {v12, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 628
    .line 629
    .line 630
    :cond_17
    :goto_e
    move-object/from16 v0, p0

    .line 631
    .line 632
    move-object/from16 v1, v16

    .line 633
    .line 634
    move-object/from16 v4, v19

    .line 635
    .line 636
    move-object/from16 v5, v20

    .line 637
    .line 638
    goto/16 :goto_0

    .line 639
    .line 640
    :cond_18
    const/4 v13, 0x0

    .line 641
    move v5, v13

    .line 642
    :goto_f
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 643
    .line 644
    .line 645
    move-result v0

    .line 646
    if-ge v5, v0, :cond_1c

    .line 647
    .line 648
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 649
    .line 650
    .line 651
    move-result-object v0

    .line 652
    move-object v7, v0

    .line 653
    check-cast v7, Ljava/util/List;

    .line 654
    .line 655
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 656
    .line 657
    .line 658
    move-result v0

    .line 659
    if-eqz v0, :cond_1a

    .line 660
    .line 661
    if-eqz v5, :cond_19

    .line 662
    .line 663
    move-object/from16 v0, p5

    .line 664
    .line 665
    const/4 v4, -0x1

    .line 666
    :goto_10
    const/4 v1, 0x1

    .line 667
    goto :goto_11

    .line 668
    :cond_19
    move v5, v13

    .line 669
    :cond_1a
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 670
    .line 671
    .line 672
    move-result v0

    .line 673
    const/4 v4, -0x1

    .line 674
    add-int/2addr v0, v4

    .line 675
    if-eq v5, v0, :cond_1b

    .line 676
    .line 677
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 678
    .line 679
    .line 680
    move-result-object v0

    .line 681
    check-cast v0, Ljava/lang/Long;

    .line 682
    .line 683
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 684
    .line 685
    .line 686
    move-result-wide v8

    .line 687
    add-int/lit8 v0, v5, 0x1

    .line 688
    .line 689
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 690
    .line 691
    .line 692
    move-result-object v0

    .line 693
    check-cast v0, Ljava/lang/Long;

    .line 694
    .line 695
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 696
    .line 697
    .line 698
    move-result-wide v0

    .line 699
    sub-long v10, v0, v8

    .line 700
    .line 701
    new-instance v6, Lcom/google/android/gms/internal/ads/zzank;

    .line 702
    .line 703
    invoke-direct/range {v6 .. v11}, Lcom/google/android/gms/internal/ads/zzank;-><init>(Ljava/util/List;JJ)V

    .line 704
    .line 705
    .line 706
    move-object/from16 v0, p5

    .line 707
    .line 708
    invoke-interface {v0, v6}, Lcom/google/android/gms/internal/ads/zzdu;->zza(Ljava/lang/Object;)V

    .line 709
    .line 710
    .line 711
    goto :goto_10

    .line 712
    :goto_11
    add-int/2addr v5, v1

    .line 713
    goto :goto_f

    .line 714
    :cond_1b
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 715
    .line 716
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 717
    .line 718
    .line 719
    throw v0

    .line 720
    :cond_1c
    return-void

    .line 721
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_1
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_4
        :pswitch_3
        :pswitch_2
    .end packed-switch

    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    :pswitch_data_1
    .packed-switch -0x1
        :pswitch_6
        :pswitch_5
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_9
        :pswitch_8
        :pswitch_7
    .end packed-switch

    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    :pswitch_data_2
    .packed-switch -0x1
        :pswitch_e
        :pswitch_a
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_b
        :pswitch_b
        :pswitch_b
    .end packed-switch
.end method
