.class public final Lcom/google/android/gms/internal/ads/zzdr;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic zza:I

.field private static final zzb:[B

.field private static final zzc:[Ljava/lang/String;

.field private static final zzd:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x4

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzdr;->zzb:[B

    const-string v0, "B"

    const-string v1, "C"

    const-string v2, ""

    const-string v3, "A"

    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzdr;->zzc:[Ljava/lang/String;

    const-string v0, "^\\D?(\\d+)$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzdr;->zzd:Ljava/util/regex/Pattern;

    return-void

    nop

    :array_0
    .array-data 1
        0x0t
        0x0t
        0x0t
        0x1t
    .end array-data
.end method

.method public static zza(BBBB)Lcom/google/android/gms/internal/ads/zzgwt;
    .locals 4

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    aput-byte v1, v0, v2

    .line 8
    .line 9
    aput-byte v1, v0, v1

    .line 10
    .line 11
    const/4 v2, 0x2

    .line 12
    aput-byte p0, v0, v2

    .line 13
    .line 14
    const/4 p0, 0x3

    .line 15
    aput-byte v2, v0, p0

    .line 16
    .line 17
    const/4 v2, 0x4

    .line 18
    aput-byte v1, v0, v2

    .line 19
    .line 20
    const/4 v3, 0x5

    .line 21
    aput-byte p1, v0, v3

    .line 22
    .line 23
    const/4 p1, 0x6

    .line 24
    aput-byte p0, v0, p1

    .line 25
    .line 26
    const/4 p0, 0x7

    .line 27
    aput-byte v1, v0, p0

    .line 28
    .line 29
    const/16 p0, 0x8

    .line 30
    .line 31
    aput-byte p2, v0, p0

    .line 32
    .line 33
    const/16 p0, 0x9

    .line 34
    .line 35
    aput-byte v2, v0, p0

    .line 36
    .line 37
    const/16 p0, 0xa

    .line 38
    .line 39
    aput-byte v1, v0, p0

    .line 40
    .line 41
    const/16 p0, 0xb

    .line 42
    .line 43
    aput-byte p3, v0, p0

    .line 44
    .line 45
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgwt;->zzj(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzgwt;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0
.end method

.method public static zzb(III)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    const/4 v0, 0x3

    .line 14
    new-array v0, v0, [Ljava/lang/Object;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    aput-object p0, v0, v1

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    aput-object p1, v0, p0

    .line 21
    .line 22
    const/4 p0, 0x2

    .line 23
    aput-object p2, v0, p0

    .line 24
    .line 25
    const-string p0, "avc1.%02X%02X%02X"

    .line 26
    .line 27
    invoke-static {p0, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method

.method public static zzc(IZII[II)Ljava/lang/String;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    new-instance v1, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    sget-object v2, Lcom/google/android/gms/internal/ads/zzdr;->zzc:[Ljava/lang/String;

    .line 5
    .line 6
    aget-object p0, v2, p0

    .line 7
    .line 8
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object p3

    .line 16
    const/4 v2, 0x1

    .line 17
    if-eq v2, p1, :cond_0

    .line 18
    .line 19
    const/16 p1, 0x4c

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/16 p1, 0x48

    .line 23
    .line 24
    :goto_0
    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object p5

    .line 32
    const/4 v3, 0x5

    .line 33
    new-array v3, v3, [Ljava/lang/Object;

    .line 34
    .line 35
    aput-object p0, v3, v0

    .line 36
    .line 37
    aput-object p2, v3, v2

    .line 38
    .line 39
    const/4 p0, 0x2

    .line 40
    aput-object p3, v3, p0

    .line 41
    .line 42
    const/4 p0, 0x3

    .line 43
    aput-object p1, v3, p0

    .line 44
    .line 45
    const/4 p0, 0x4

    .line 46
    aput-object p5, v3, p0

    .line 47
    .line 48
    sget-object p0, Lcom/google/android/gms/internal/ads/zzfm;->zza:Ljava/lang/String;

    .line 49
    .line 50
    sget-object p0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 51
    .line 52
    const-string p1, "hvc1.%s%d.%X.%c%d"

    .line 53
    .line 54
    invoke-static {p0, p1, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-direct {v1, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    const/4 p0, 0x6

    .line 62
    :goto_1
    if-lez p0, :cond_1

    .line 63
    .line 64
    add-int/lit8 p1, p0, -0x1

    .line 65
    .line 66
    aget p2, p4, p1

    .line 67
    .line 68
    if-nez p2, :cond_1

    .line 69
    .line 70
    move p0, p1

    .line 71
    goto :goto_1

    .line 72
    :cond_1
    move p1, v0

    .line 73
    :goto_2
    if-ge p1, p0, :cond_2

    .line 74
    .line 75
    aget p2, p4, p1

    .line 76
    .line 77
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    new-array p3, v2, [Ljava/lang/Object;

    .line 82
    .line 83
    aput-object p2, p3, v0

    .line 84
    .line 85
    const-string p2, ".%02X"

    .line 86
    .line 87
    invoke-static {p2, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    add-int/2addr p1, v2

    .line 95
    goto :goto_2

    .line 96
    :cond_2
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    return-object p0
.end method

.method public static zzd([B)Ljava/lang/String;
    .locals 5

    .line 1
    array-length v0, p0

    .line 2
    const/16 v1, 0x11

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    if-lt v0, v1, :cond_0

    .line 7
    .line 8
    move v1, v3

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v1, v2

    .line 11
    :goto_0
    const-string v4, "Invalid APV CSD length: %s"

    .line 12
    .line 13
    invoke-static {v1, v4, v0}, Lcom/google/android/gms/internal/ads/zzgtr;->zzd(ZLjava/lang/String;I)V

    .line 14
    .line 15
    .line 16
    aget-byte v0, p0, v2

    .line 17
    .line 18
    if-ne v0, v3, :cond_1

    .line 19
    .line 20
    move v2, v3

    .line 21
    :cond_1
    const-string v1, "Invalid APV CSD version: %s"

    .line 22
    .line 23
    invoke-static {v2, v1, v0}, Lcom/google/android/gms/internal/ads/zzgtr;->zzd(ZLjava/lang/String;I)V

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x5

    .line 27
    aget-byte v0, p0, v0

    .line 28
    .line 29
    and-int/lit16 v0, v0, 0xff

    .line 30
    .line 31
    const/4 v1, 0x6

    .line 32
    aget-byte v1, p0, v1

    .line 33
    .line 34
    and-int/lit16 v1, v1, 0xff

    .line 35
    .line 36
    const/4 v2, 0x7

    .line 37
    aget-byte p0, p0, v2

    .line 38
    .line 39
    and-int/lit16 p0, p0, 0xff

    .line 40
    .line 41
    sget-object v2, Lcom/google/android/gms/internal/ads/zzfm;->zza:Ljava/lang/String;

    .line 42
    .line 43
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 44
    .line 45
    const-string v2, "apv1.apvf"

    .line 46
    .line 47
    const-string v3, ".apvl"

    .line 48
    .line 49
    const-string v4, ".apvb"

    .line 50
    .line 51
    invoke-static {v2, v0, v3, v1, v4}, LR8/v;->h(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0
.end method

.method public static zze(Lcom/google/android/gms/internal/ads/zzv;)Landroid/util/Pair;
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzdr;->zzf(Lcom/google/android/gms/internal/ads/zzv;)Lcom/google/android/gms/internal/ads/zzdq;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzdq;->zzc()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    new-instance v0, Landroid/util/Pair;

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzdq;->zza()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzdq;->zzb()I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-direct {v0, v1, p0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    return-object v0

    .line 35
    :cond_0
    const/4 p0, 0x0

    .line 36
    return-object p0
.end method

.method public static zzf(Lcom/google/android/gms/internal/ads/zzv;)Lcom/google/android/gms/internal/ads/zzdq;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "Unrecognized MP4A profile: -1"

    .line 4
    .line 5
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzv;->zzk:Ljava/lang/String;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-nez v2, :cond_0

    .line 9
    .line 10
    return-object v3

    .line 11
    :cond_0
    const-string v4, "\\."

    .line 12
    .line 13
    invoke-virtual {v2, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzv;->zzp:Ljava/lang/String;

    .line 18
    .line 19
    const-string v6, "video/dolby-vision"

    .line 20
    .line 21
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    const/16 v10, 0x80

    .line 26
    .line 27
    const/16 v11, 0x1000

    .line 28
    .line 29
    const/16 v12, 0x40

    .line 30
    .line 31
    const/16 v13, 0x20

    .line 32
    .line 33
    const/16 v14, 0x10

    .line 34
    .line 35
    const/16 v15, 0x8

    .line 36
    .line 37
    move-object/from16 v16, v3

    .line 38
    .line 39
    const/4 v3, 0x3

    .line 40
    const/16 v17, 0x800

    .line 41
    .line 42
    const/4 v6, 0x4

    .line 43
    const/16 v18, 0x400

    .line 44
    .line 45
    const/4 v7, 0x2

    .line 46
    const/16 v19, 0x200

    .line 47
    .line 48
    const-string v8, "CodecSpecificDataUtil"

    .line 49
    .line 50
    const/16 v20, 0x100

    .line 51
    .line 52
    const/4 v9, 0x1

    .line 53
    if-eqz v5, :cond_8

    .line 54
    .line 55
    array-length v0, v4

    .line 56
    const-string v1, "Ignoring malformed Dolby Vision codec string: "

    .line 57
    .line 58
    if-ge v0, v3, :cond_1

    .line 59
    .line 60
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-static {v8, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    return-object v16

    .line 68
    :cond_1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzdr;->zzd:Ljava/util/regex/Pattern;

    .line 69
    .line 70
    aget-object v3, v4, v9

    .line 71
    .line 72
    invoke-virtual {v0, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-nez v3, :cond_2

    .line 81
    .line 82
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-static {v8, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    return-object v16

    .line 90
    :cond_2
    invoke-virtual {v0, v9}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    const/16 v2, 0x61f

    .line 102
    .line 103
    if-eq v1, v2, :cond_4

    .line 104
    .line 105
    packed-switch v1, :pswitch_data_0

    .line 106
    .line 107
    .line 108
    :cond_3
    move-object/from16 v1, v16

    .line 109
    .line 110
    goto/16 :goto_0

    .line 111
    .line 112
    :pswitch_0
    const-string v1, "09"

    .line 113
    .line 114
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    if-eqz v1, :cond_3

    .line 119
    .line 120
    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    goto/16 :goto_0

    .line 125
    .line 126
    :pswitch_1
    const-string v1, "08"

    .line 127
    .line 128
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    if-eqz v1, :cond_3

    .line 133
    .line 134
    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    goto/16 :goto_0

    .line 139
    .line 140
    :pswitch_2
    const-string v1, "07"

    .line 141
    .line 142
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    if-eqz v1, :cond_3

    .line 147
    .line 148
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    goto/16 :goto_0

    .line 153
    .line 154
    :pswitch_3
    const-string v1, "06"

    .line 155
    .line 156
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    if-eqz v1, :cond_3

    .line 161
    .line 162
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    goto :goto_0

    .line 167
    :pswitch_4
    const-string v1, "05"

    .line 168
    .line 169
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v1

    .line 173
    if-eqz v1, :cond_3

    .line 174
    .line 175
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    goto :goto_0

    .line 180
    :pswitch_5
    const-string v1, "04"

    .line 181
    .line 182
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    if-eqz v1, :cond_3

    .line 187
    .line 188
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    goto :goto_0

    .line 193
    :pswitch_6
    const-string v1, "03"

    .line 194
    .line 195
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v1

    .line 199
    if-eqz v1, :cond_3

    .line 200
    .line 201
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    goto :goto_0

    .line 206
    :pswitch_7
    const-string v1, "02"

    .line 207
    .line 208
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v1

    .line 212
    if-eqz v1, :cond_3

    .line 213
    .line 214
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    goto :goto_0

    .line 219
    :pswitch_8
    const-string v1, "01"

    .line 220
    .line 221
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v1

    .line 225
    if-eqz v1, :cond_3

    .line 226
    .line 227
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    goto :goto_0

    .line 232
    :pswitch_9
    const-string v1, "00"

    .line 233
    .line 234
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result v1

    .line 238
    if-eqz v1, :cond_3

    .line 239
    .line 240
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    goto :goto_0

    .line 245
    :cond_4
    const-string v1, "10"

    .line 246
    .line 247
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    move-result v1

    .line 251
    if-eqz v1, :cond_3

    .line 252
    .line 253
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    :goto_0
    if-nez v1, :cond_5

    .line 258
    .line 259
    const-string v1, "Unknown Dolby Vision profile string: "

    .line 260
    .line 261
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    invoke-static {v8, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    sget-object v0, Lcom/google/android/gms/internal/ads/zzdq;->zza:Lcom/google/android/gms/internal/ads/zzdq;

    .line 269
    .line 270
    return-object v0

    .line 271
    :cond_5
    aget-object v0, v4, v7

    .line 272
    .line 273
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 274
    .line 275
    .line 276
    move-result v2

    .line 277
    packed-switch v2, :pswitch_data_1

    .line 278
    .line 279
    .line 280
    packed-switch v2, :pswitch_data_2

    .line 281
    .line 282
    .line 283
    :cond_6
    move-object/from16 v2, v16

    .line 284
    .line 285
    goto/16 :goto_1

    .line 286
    .line 287
    :pswitch_a
    const-string v2, "13"

    .line 288
    .line 289
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    move-result v2

    .line 293
    if-eqz v2, :cond_6

    .line 294
    .line 295
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 296
    .line 297
    .line 298
    move-result-object v2

    .line 299
    goto/16 :goto_1

    .line 300
    .line 301
    :pswitch_b
    const-string v2, "12"

    .line 302
    .line 303
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    move-result v2

    .line 307
    if-eqz v2, :cond_6

    .line 308
    .line 309
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 310
    .line 311
    .line 312
    move-result-object v2

    .line 313
    goto/16 :goto_1

    .line 314
    .line 315
    :pswitch_c
    const-string v2, "11"

    .line 316
    .line 317
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    move-result v2

    .line 321
    if-eqz v2, :cond_6

    .line 322
    .line 323
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 324
    .line 325
    .line 326
    move-result-object v2

    .line 327
    goto/16 :goto_1

    .line 328
    .line 329
    :pswitch_d
    const-string v2, "10"

    .line 330
    .line 331
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    move-result v2

    .line 335
    if-eqz v2, :cond_6

    .line 336
    .line 337
    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 338
    .line 339
    .line 340
    move-result-object v2

    .line 341
    goto/16 :goto_1

    .line 342
    .line 343
    :pswitch_e
    const-string v2, "09"

    .line 344
    .line 345
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 346
    .line 347
    .line 348
    move-result v2

    .line 349
    if-eqz v2, :cond_6

    .line 350
    .line 351
    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 352
    .line 353
    .line 354
    move-result-object v2

    .line 355
    goto/16 :goto_1

    .line 356
    .line 357
    :pswitch_f
    const-string v2, "08"

    .line 358
    .line 359
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 360
    .line 361
    .line 362
    move-result v2

    .line 363
    if-eqz v2, :cond_6

    .line 364
    .line 365
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 366
    .line 367
    .line 368
    move-result-object v2

    .line 369
    goto :goto_1

    .line 370
    :pswitch_10
    const-string v2, "07"

    .line 371
    .line 372
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 373
    .line 374
    .line 375
    move-result v2

    .line 376
    if-eqz v2, :cond_6

    .line 377
    .line 378
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 379
    .line 380
    .line 381
    move-result-object v2

    .line 382
    goto :goto_1

    .line 383
    :pswitch_11
    const-string v2, "06"

    .line 384
    .line 385
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    move-result v2

    .line 389
    if-eqz v2, :cond_6

    .line 390
    .line 391
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 392
    .line 393
    .line 394
    move-result-object v2

    .line 395
    goto :goto_1

    .line 396
    :pswitch_12
    const-string v2, "05"

    .line 397
    .line 398
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 399
    .line 400
    .line 401
    move-result v2

    .line 402
    if-eqz v2, :cond_6

    .line 403
    .line 404
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 405
    .line 406
    .line 407
    move-result-object v2

    .line 408
    goto :goto_1

    .line 409
    :pswitch_13
    const-string v2, "04"

    .line 410
    .line 411
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 412
    .line 413
    .line 414
    move-result v2

    .line 415
    if-eqz v2, :cond_6

    .line 416
    .line 417
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 418
    .line 419
    .line 420
    move-result-object v2

    .line 421
    goto :goto_1

    .line 422
    :pswitch_14
    const-string v2, "03"

    .line 423
    .line 424
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 425
    .line 426
    .line 427
    move-result v2

    .line 428
    if-eqz v2, :cond_6

    .line 429
    .line 430
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 431
    .line 432
    .line 433
    move-result-object v2

    .line 434
    goto :goto_1

    .line 435
    :pswitch_15
    const-string v2, "02"

    .line 436
    .line 437
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 438
    .line 439
    .line 440
    move-result v2

    .line 441
    if-eqz v2, :cond_6

    .line 442
    .line 443
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 444
    .line 445
    .line 446
    move-result-object v2

    .line 447
    goto :goto_1

    .line 448
    :pswitch_16
    const-string v2, "01"

    .line 449
    .line 450
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 451
    .line 452
    .line 453
    move-result v2

    .line 454
    if-eqz v2, :cond_6

    .line 455
    .line 456
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 457
    .line 458
    .line 459
    move-result-object v2

    .line 460
    :goto_1
    if-nez v2, :cond_7

    .line 461
    .line 462
    const-string v1, "Unknown Dolby Vision level string: "

    .line 463
    .line 464
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 465
    .line 466
    .line 467
    move-result-object v0

    .line 468
    invoke-static {v8, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 469
    .line 470
    .line 471
    return-object v16

    .line 472
    :cond_7
    new-instance v0, Lcom/google/android/gms/internal/ads/zzdq;

    .line 473
    .line 474
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 475
    .line 476
    .line 477
    move-result v1

    .line 478
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 479
    .line 480
    .line 481
    move-result v2

    .line 482
    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzdq;-><init>(II)V

    .line 483
    .line 484
    .line 485
    return-object v0

    .line 486
    :cond_8
    const/4 v5, 0x0

    .line 487
    move/from16 v21, v10

    .line 488
    .line 489
    aget-object v10, v4, v5

    .line 490
    .line 491
    invoke-virtual {v10}, Ljava/lang/String;->hashCode()I

    .line 492
    .line 493
    .line 494
    move-result v22

    .line 495
    move/from16 v23, v11

    .line 496
    .line 497
    move/from16 v24, v12

    .line 498
    .line 499
    const/4 v12, -0x1

    .line 500
    sparse-switch v22, :sswitch_data_0

    .line 501
    .line 502
    .line 503
    goto/16 :goto_2

    .line 504
    .line 505
    :sswitch_0
    const-string v11, "vvi1"

    .line 506
    .line 507
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 508
    .line 509
    .line 510
    move-result v10

    .line 511
    if-eqz v10, :cond_9

    .line 512
    .line 513
    const/4 v10, 0x7

    .line 514
    goto/16 :goto_3

    .line 515
    .line 516
    :sswitch_1
    const-string v11, "vvc1"

    .line 517
    .line 518
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 519
    .line 520
    .line 521
    move-result v10

    .line 522
    if-eqz v10, :cond_9

    .line 523
    .line 524
    const/4 v10, 0x6

    .line 525
    goto/16 :goto_3

    .line 526
    .line 527
    :sswitch_2
    const-string v11, "vp09"

    .line 528
    .line 529
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 530
    .line 531
    .line 532
    move-result v10

    .line 533
    if-eqz v10, :cond_9

    .line 534
    .line 535
    move v10, v3

    .line 536
    goto/16 :goto_3

    .line 537
    .line 538
    :sswitch_3
    const-string v11, "s263"

    .line 539
    .line 540
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 541
    .line 542
    .line 543
    move-result v10

    .line 544
    if-eqz v10, :cond_9

    .line 545
    .line 546
    move v10, v5

    .line 547
    goto/16 :goto_3

    .line 548
    .line 549
    :sswitch_4
    const-string v11, "mp4a"

    .line 550
    .line 551
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 552
    .line 553
    .line 554
    move-result v10

    .line 555
    if-eqz v10, :cond_9

    .line 556
    .line 557
    const/16 v10, 0xa

    .line 558
    .line 559
    goto :goto_3

    .line 560
    :sswitch_5
    const-string v11, "iamf"

    .line 561
    .line 562
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 563
    .line 564
    .line 565
    move-result v10

    .line 566
    if-eqz v10, :cond_9

    .line 567
    .line 568
    const/16 v10, 0xc

    .line 569
    .line 570
    goto :goto_3

    .line 571
    :sswitch_6
    const-string v11, "hvc1"

    .line 572
    .line 573
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 574
    .line 575
    .line 576
    move-result v10

    .line 577
    if-eqz v10, :cond_9

    .line 578
    .line 579
    const/4 v10, 0x5

    .line 580
    goto :goto_3

    .line 581
    :sswitch_7
    const-string v11, "hev1"

    .line 582
    .line 583
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 584
    .line 585
    .line 586
    move-result v10

    .line 587
    if-eqz v10, :cond_9

    .line 588
    .line 589
    move v10, v6

    .line 590
    goto :goto_3

    .line 591
    :sswitch_8
    const-string v11, "avc2"

    .line 592
    .line 593
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 594
    .line 595
    .line 596
    move-result v10

    .line 597
    if-eqz v10, :cond_9

    .line 598
    .line 599
    move v10, v7

    .line 600
    goto :goto_3

    .line 601
    :sswitch_9
    const-string v11, "avc1"

    .line 602
    .line 603
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 604
    .line 605
    .line 606
    move-result v10

    .line 607
    if-eqz v10, :cond_9

    .line 608
    .line 609
    move v10, v9

    .line 610
    goto :goto_3

    .line 611
    :sswitch_a
    const-string v11, "av01"

    .line 612
    .line 613
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 614
    .line 615
    .line 616
    move-result v10

    .line 617
    if-eqz v10, :cond_9

    .line 618
    .line 619
    move v10, v15

    .line 620
    goto :goto_3

    .line 621
    :sswitch_b
    const-string v11, "apv1"

    .line 622
    .line 623
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 624
    .line 625
    .line 626
    move-result v10

    .line 627
    if-eqz v10, :cond_9

    .line 628
    .line 629
    const/16 v10, 0x9

    .line 630
    .line 631
    goto :goto_3

    .line 632
    :sswitch_c
    const-string v11, "ac-4"

    .line 633
    .line 634
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 635
    .line 636
    .line 637
    move-result v10

    .line 638
    if-eqz v10, :cond_9

    .line 639
    .line 640
    const/16 v10, 0xb

    .line 641
    .line 642
    goto :goto_3

    .line 643
    :cond_9
    :goto_2
    move v10, v12

    .line 644
    :goto_3
    const/16 v25, 0x2000

    .line 645
    .line 646
    const/16 v11, 0x14

    .line 647
    .line 648
    packed-switch v10, :pswitch_data_3

    .line 649
    .line 650
    .line 651
    return-object v16

    .line 652
    :pswitch_17
    array-length v0, v4

    .line 653
    if-ge v0, v6, :cond_a

    .line 654
    .line 655
    const-string v0, "Ignoring malformed IAMF codec string: "

    .line 656
    .line 657
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 658
    .line 659
    .line 660
    move-result-object v0

    .line 661
    invoke-static {v8, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 662
    .line 663
    .line 664
    return-object v16

    .line 665
    :cond_a
    :try_start_0
    aget-object v0, v4, v9

    .line 666
    .line 667
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 668
    .line 669
    .line 670
    move-result v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 671
    aget-object v1, v4, v3

    .line 672
    .line 673
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 674
    .line 675
    .line 676
    move-result v2

    .line 677
    sparse-switch v2, :sswitch_data_1

    .line 678
    .line 679
    .line 680
    goto :goto_4

    .line 681
    :sswitch_d
    const-string v2, "mp4a"

    .line 682
    .line 683
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 684
    .line 685
    .line 686
    move-result v2

    .line 687
    if-eqz v2, :cond_b

    .line 688
    .line 689
    move v2, v9

    .line 690
    goto :goto_5

    .line 691
    :sswitch_e
    const-string v2, "ipcm"

    .line 692
    .line 693
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 694
    .line 695
    .line 696
    move-result v2

    .line 697
    if-eqz v2, :cond_b

    .line 698
    .line 699
    move v2, v3

    .line 700
    goto :goto_5

    .line 701
    :sswitch_f
    const-string v2, "fLaC"

    .line 702
    .line 703
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 704
    .line 705
    .line 706
    move-result v2

    .line 707
    if-eqz v2, :cond_b

    .line 708
    .line 709
    move v2, v7

    .line 710
    goto :goto_5

    .line 711
    :sswitch_10
    const-string v2, "Opus"

    .line 712
    .line 713
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 714
    .line 715
    .line 716
    move-result v2

    .line 717
    if-eqz v2, :cond_b

    .line 718
    .line 719
    move v2, v5

    .line 720
    goto :goto_5

    .line 721
    :cond_b
    :goto_4
    move v2, v12

    .line 722
    :goto_5
    if-eqz v2, :cond_18

    .line 723
    .line 724
    if-eq v2, v9, :cond_14

    .line 725
    .line 726
    if-eq v2, v7, :cond_10

    .line 727
    .line 728
    if-eq v2, v3, :cond_c

    .line 729
    .line 730
    const-string v0, "Unrecognized codec identifier for IAMF auxiliary profile: "

    .line 731
    .line 732
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 733
    .line 734
    .line 735
    move-result-object v0

    .line 736
    invoke-static {v8, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 737
    .line 738
    .line 739
    :goto_6
    move v0, v12

    .line 740
    goto/16 :goto_7

    .line 741
    .line 742
    :cond_c
    if-eqz v0, :cond_f

    .line 743
    .line 744
    if-eq v0, v9, :cond_e

    .line 745
    .line 746
    if-eq v0, v7, :cond_d

    .line 747
    .line 748
    const/16 v1, 0x1f

    .line 749
    .line 750
    invoke-static {v0, v1}, LA7/p0;->f(II)I

    .line 751
    .line 752
    .line 753
    move-result v1

    .line 754
    const-string v2, "Unrecognized IAMF PCM profile: "

    .line 755
    .line 756
    invoke-static {v1, v0, v2, v8}, Lcb/a;->o(IILjava/lang/String;Ljava/lang/String;)V

    .line 757
    .line 758
    .line 759
    goto :goto_6

    .line 760
    :cond_d
    const v0, 0x1040008

    .line 761
    .line 762
    .line 763
    goto/16 :goto_7

    .line 764
    .line 765
    :cond_e
    const v0, 0x1020008

    .line 766
    .line 767
    .line 768
    goto :goto_7

    .line 769
    :cond_f
    const v0, 0x1010008

    .line 770
    .line 771
    .line 772
    goto :goto_7

    .line 773
    :cond_10
    if-eqz v0, :cond_13

    .line 774
    .line 775
    if-eq v0, v9, :cond_12

    .line 776
    .line 777
    if-eq v0, v7, :cond_11

    .line 778
    .line 779
    invoke-static {v0, v13}, LA7/p0;->f(II)I

    .line 780
    .line 781
    .line 782
    move-result v1

    .line 783
    const-string v2, "Unrecognized IAMF FLAC profile: "

    .line 784
    .line 785
    invoke-static {v1, v0, v2, v8}, Lcb/a;->o(IILjava/lang/String;Ljava/lang/String;)V

    .line 786
    .line 787
    .line 788
    goto :goto_6

    .line 789
    :cond_11
    const v0, 0x1040004

    .line 790
    .line 791
    .line 792
    goto :goto_7

    .line 793
    :cond_12
    const v0, 0x1020004

    .line 794
    .line 795
    .line 796
    goto :goto_7

    .line 797
    :cond_13
    const v0, 0x1010004

    .line 798
    .line 799
    .line 800
    goto :goto_7

    .line 801
    :cond_14
    if-eqz v0, :cond_17

    .line 802
    .line 803
    if-eq v0, v9, :cond_16

    .line 804
    .line 805
    if-eq v0, v7, :cond_15

    .line 806
    .line 807
    const/16 v1, 0x1f

    .line 808
    .line 809
    invoke-static {v0, v1}, LA7/p0;->f(II)I

    .line 810
    .line 811
    .line 812
    move-result v1

    .line 813
    const-string v2, "Unrecognized IAMF AAC profile: "

    .line 814
    .line 815
    invoke-static {v1, v0, v2, v8}, Lcb/a;->o(IILjava/lang/String;Ljava/lang/String;)V

    .line 816
    .line 817
    .line 818
    goto :goto_6

    .line 819
    :cond_15
    const v0, 0x1040002

    .line 820
    .line 821
    .line 822
    goto :goto_7

    .line 823
    :cond_16
    const v0, 0x1020002

    .line 824
    .line 825
    .line 826
    goto :goto_7

    .line 827
    :cond_17
    const v0, 0x1010002

    .line 828
    .line 829
    .line 830
    goto :goto_7

    .line 831
    :cond_18
    if-eqz v0, :cond_1b

    .line 832
    .line 833
    if-eq v0, v9, :cond_1a

    .line 834
    .line 835
    if-eq v0, v7, :cond_19

    .line 836
    .line 837
    invoke-static {v0, v13}, LA7/p0;->f(II)I

    .line 838
    .line 839
    .line 840
    move-result v1

    .line 841
    const-string v2, "Unrecognized IAMF Opus profile: "

    .line 842
    .line 843
    invoke-static {v1, v0, v2, v8}, Lcb/a;->o(IILjava/lang/String;Ljava/lang/String;)V

    .line 844
    .line 845
    .line 846
    goto :goto_6

    .line 847
    :cond_19
    const v0, 0x1040001

    .line 848
    .line 849
    .line 850
    goto :goto_7

    .line 851
    :cond_1a
    const v0, 0x1020001

    .line 852
    .line 853
    .line 854
    goto :goto_7

    .line 855
    :cond_1b
    const v0, 0x1010001

    .line 856
    .line 857
    .line 858
    :goto_7
    if-ne v0, v12, :cond_1c

    .line 859
    .line 860
    sget-object v0, Lcom/google/android/gms/internal/ads/zzdq;->zza:Lcom/google/android/gms/internal/ads/zzdq;

    .line 861
    .line 862
    return-object v0

    .line 863
    :cond_1c
    new-instance v1, Lcom/google/android/gms/internal/ads/zzdq;

    .line 864
    .line 865
    invoke-direct {v1, v0, v5}, Lcom/google/android/gms/internal/ads/zzdq;-><init>(II)V

    .line 866
    .line 867
    .line 868
    return-object v1

    .line 869
    :catch_0
    move-exception v0

    .line 870
    aget-object v1, v4, v9

    .line 871
    .line 872
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 873
    .line 874
    .line 875
    move-result-object v1

    .line 876
    const-string v2, "Ignoring malformed primary profile in IAMF codec string: "

    .line 877
    .line 878
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 879
    .line 880
    .line 881
    move-result-object v1

    .line 882
    invoke-static {v8, v1, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 883
    .line 884
    .line 885
    goto/16 :goto_19

    .line 886
    .line 887
    :pswitch_18
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzv;->zzk:Ljava/lang/String;

    .line 888
    .line 889
    array-length v1, v4

    .line 890
    const-string v2, "Ignoring malformed AC-4 codec string: "

    .line 891
    .line 892
    if-eq v1, v6, :cond_1d

    .line 893
    .line 894
    invoke-static {v0, v2, v8}, Lcb/a;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 895
    .line 896
    .line 897
    return-object v16

    .line 898
    :cond_1d
    :try_start_1
    aget-object v1, v4, v9

    .line 899
    .line 900
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 901
    .line 902
    .line 903
    move-result v1

    .line 904
    aget-object v5, v4, v7

    .line 905
    .line 906
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 907
    .line 908
    .line 909
    move-result v5

    .line 910
    aget-object v4, v4, v3

    .line 911
    .line 912
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 913
    .line 914
    .line 915
    move-result v0
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 916
    if-eqz v1, :cond_23

    .line 917
    .line 918
    if-eq v1, v9, :cond_21

    .line 919
    .line 920
    if-eq v1, v7, :cond_1f

    .line 921
    .line 922
    :cond_1e
    move v2, v12

    .line 923
    goto :goto_8

    .line 924
    :cond_1f
    if-ne v5, v9, :cond_20

    .line 925
    .line 926
    const/16 v2, 0x402

    .line 927
    .line 928
    goto :goto_8

    .line 929
    :cond_20
    if-ne v5, v7, :cond_1e

    .line 930
    .line 931
    const/16 v2, 0x404

    .line 932
    .line 933
    goto :goto_8

    .line 934
    :cond_21
    if-nez v5, :cond_22

    .line 935
    .line 936
    const/16 v2, 0x201

    .line 937
    .line 938
    goto :goto_8

    .line 939
    :cond_22
    if-ne v5, v9, :cond_1e

    .line 940
    .line 941
    const/16 v2, 0x202

    .line 942
    .line 943
    goto :goto_8

    .line 944
    :cond_23
    if-nez v5, :cond_1e

    .line 945
    .line 946
    const/16 v2, 0x101

    .line 947
    .line 948
    :goto_8
    if-ne v2, v12, :cond_24

    .line 949
    .line 950
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 951
    .line 952
    .line 953
    move-result-object v0

    .line 954
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 955
    .line 956
    .line 957
    move-result v0

    .line 958
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 959
    .line 960
    .line 961
    move-result-object v2

    .line 962
    add-int/lit8 v0, v0, 0x17

    .line 963
    .line 964
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 965
    .line 966
    .line 967
    move-result v2

    .line 968
    new-instance v3, Ljava/lang/StringBuilder;

    .line 969
    .line 970
    add-int/2addr v0, v2

    .line 971
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 972
    .line 973
    .line 974
    const-string v0, "Unknown AC-4 profile: "

    .line 975
    .line 976
    const-string v2, "."

    .line 977
    .line 978
    invoke-static {v1, v5, v0, v2, v3}, Lcom/google/android/gms/internal/consent_sdk/a;->u(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 979
    .line 980
    .line 981
    move-result-object v0

    .line 982
    invoke-static {v8, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 983
    .line 984
    .line 985
    sget-object v0, Lcom/google/android/gms/internal/ads/zzdq;->zza:Lcom/google/android/gms/internal/ads/zzdq;

    .line 986
    .line 987
    return-object v0

    .line 988
    :cond_24
    if-eqz v0, :cond_28

    .line 989
    .line 990
    if-eq v0, v9, :cond_27

    .line 991
    .line 992
    if-eq v0, v7, :cond_26

    .line 993
    .line 994
    if-eq v0, v3, :cond_25

    .line 995
    .line 996
    if-eq v0, v6, :cond_29

    .line 997
    .line 998
    move v14, v12

    .line 999
    goto :goto_9

    .line 1000
    :cond_25
    move v14, v15

    .line 1001
    goto :goto_9

    .line 1002
    :cond_26
    move v14, v6

    .line 1003
    goto :goto_9

    .line 1004
    :cond_27
    move v14, v7

    .line 1005
    goto :goto_9

    .line 1006
    :cond_28
    move v14, v9

    .line 1007
    :cond_29
    :goto_9
    if-ne v14, v12, :cond_2a

    .line 1008
    .line 1009
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v1

    .line 1013
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 1014
    .line 1015
    .line 1016
    move-result v1

    .line 1017
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1018
    .line 1019
    add-int/2addr v1, v11

    .line 1020
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1021
    .line 1022
    .line 1023
    const-string v1, "Unknown AC-4 level: "

    .line 1024
    .line 1025
    invoke-static {v2, v1, v0, v8}, Lcb/a;->v(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;)V

    .line 1026
    .line 1027
    .line 1028
    sget-object v0, Lcom/google/android/gms/internal/ads/zzdq;->zza:Lcom/google/android/gms/internal/ads/zzdq;

    .line 1029
    .line 1030
    return-object v0

    .line 1031
    :cond_2a
    new-instance v0, Lcom/google/android/gms/internal/ads/zzdq;

    .line 1032
    .line 1033
    invoke-direct {v0, v2, v14}, Lcom/google/android/gms/internal/ads/zzdq;-><init>(II)V

    .line 1034
    .line 1035
    .line 1036
    return-object v0

    .line 1037
    :catch_1
    invoke-static {v0, v2, v8}, Lcb/a;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1038
    .line 1039
    .line 1040
    goto/16 :goto_19

    .line 1041
    .line 1042
    :pswitch_19
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzv;->zzk:Ljava/lang/String;

    .line 1043
    .line 1044
    array-length v2, v4

    .line 1045
    const-string v10, "Ignoring malformed MP4A codec string: "

    .line 1046
    .line 1047
    if-eq v2, v3, :cond_2b

    .line 1048
    .line 1049
    invoke-static {v0, v10, v8}, Lcb/a;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1050
    .line 1051
    .line 1052
    return-object v16

    .line 1053
    :cond_2b
    :try_start_2
    aget-object v2, v4, v9

    .line 1054
    .line 1055
    invoke-static {v2, v14}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 1056
    .line 1057
    .line 1058
    move-result v2

    .line 1059
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzas;->zze(I)Ljava/lang/String;

    .line 1060
    .line 1061
    .line 1062
    move-result-object v2

    .line 1063
    const-string v13, "audio/mp4a-latm"

    .line 1064
    .line 1065
    invoke-virtual {v13, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1066
    .line 1067
    .line 1068
    move-result v2

    .line 1069
    if-eqz v2, :cond_33

    .line 1070
    .line 1071
    aget-object v2, v4, v7

    .line 1072
    .line 1073
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1074
    .line 1075
    .line 1076
    move-result v2

    .line 1077
    const/16 v4, 0x11

    .line 1078
    .line 1079
    if-eq v2, v4, :cond_31

    .line 1080
    .line 1081
    if-eq v2, v11, :cond_30

    .line 1082
    .line 1083
    const/16 v4, 0x17

    .line 1084
    .line 1085
    if-eq v2, v4, :cond_2f

    .line 1086
    .line 1087
    const/16 v4, 0x1d

    .line 1088
    .line 1089
    if-eq v2, v4, :cond_2e

    .line 1090
    .line 1091
    const/16 v4, 0x27

    .line 1092
    .line 1093
    if-eq v2, v4, :cond_2d

    .line 1094
    .line 1095
    const/16 v4, 0x2a

    .line 1096
    .line 1097
    if-eq v2, v4, :cond_2c

    .line 1098
    .line 1099
    packed-switch v2, :pswitch_data_4

    .line 1100
    .line 1101
    .line 1102
    move v3, v12

    .line 1103
    goto :goto_a

    .line 1104
    :pswitch_1a
    const/4 v3, 0x6

    .line 1105
    goto :goto_a

    .line 1106
    :pswitch_1b
    const/4 v3, 0x5

    .line 1107
    goto :goto_a

    .line 1108
    :pswitch_1c
    move v3, v6

    .line 1109
    goto :goto_a

    .line 1110
    :pswitch_1d
    move v3, v7

    .line 1111
    goto :goto_a

    .line 1112
    :pswitch_1e
    move v3, v9

    .line 1113
    goto :goto_a

    .line 1114
    :cond_2c
    const/16 v3, 0x2a

    .line 1115
    .line 1116
    goto :goto_a

    .line 1117
    :cond_2d
    const/16 v3, 0x27

    .line 1118
    .line 1119
    goto :goto_a

    .line 1120
    :cond_2e
    const/16 v3, 0x1d

    .line 1121
    .line 1122
    goto :goto_a

    .line 1123
    :cond_2f
    const/16 v3, 0x17

    .line 1124
    .line 1125
    goto :goto_a

    .line 1126
    :cond_30
    move v3, v11

    .line 1127
    goto :goto_a

    .line 1128
    :cond_31
    const/16 v3, 0x11

    .line 1129
    .line 1130
    :goto_a
    :pswitch_1f
    if-ne v3, v12, :cond_32

    .line 1131
    .line 1132
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1133
    .line 1134
    const/16 v3, 0x1d

    .line 1135
    .line 1136
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1137
    .line 1138
    .line 1139
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1140
    .line 1141
    .line 1142
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1143
    .line 1144
    .line 1145
    move-result-object v1

    .line 1146
    invoke-static {v8, v1}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 1147
    .line 1148
    .line 1149
    sget-object v0, Lcom/google/android/gms/internal/ads/zzdq;->zza:Lcom/google/android/gms/internal/ads/zzdq;

    .line 1150
    .line 1151
    return-object v0

    .line 1152
    :cond_32
    new-instance v1, Lcom/google/android/gms/internal/ads/zzdq;

    .line 1153
    .line 1154
    invoke-direct {v1, v3, v5}, Lcom/google/android/gms/internal/ads/zzdq;-><init>(II)V
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_2

    .line 1155
    .line 1156
    .line 1157
    return-object v1

    .line 1158
    :cond_33
    return-object v16

    .line 1159
    :catch_2
    invoke-static {v0, v10, v8}, Lcb/a;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1160
    .line 1161
    .line 1162
    goto/16 :goto_19

    .line 1163
    .line 1164
    :pswitch_20
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzv;->zzk:Ljava/lang/String;

    .line 1165
    .line 1166
    array-length v0, v4

    .line 1167
    const-string v2, "Ignoring malformed APV codec string: "

    .line 1168
    .line 1169
    if-ge v0, v6, :cond_34

    .line 1170
    .line 1171
    invoke-static {v1, v2, v8}, Lcb/a;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1172
    .line 1173
    .line 1174
    return-object v16

    .line 1175
    :cond_34
    :try_start_3
    aget-object v0, v4, v9

    .line 1176
    .line 1177
    invoke-virtual {v0, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 1178
    .line 1179
    .line 1180
    move-result-object v0

    .line 1181
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1182
    .line 1183
    .line 1184
    move-result v0

    .line 1185
    aget-object v5, v4, v7

    .line 1186
    .line 1187
    invoke-virtual {v5, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 1188
    .line 1189
    .line 1190
    move-result-object v5

    .line 1191
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1192
    .line 1193
    .line 1194
    move-result v5

    .line 1195
    aget-object v3, v4, v3

    .line 1196
    .line 1197
    invoke-virtual {v3, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 1198
    .line 1199
    .line 1200
    move-result-object v3

    .line 1201
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1202
    .line 1203
    .line 1204
    move-result v1
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_3

    .line 1205
    const/16 v2, 0x21

    .line 1206
    .line 1207
    if-ne v0, v2, :cond_35

    .line 1208
    .line 1209
    goto :goto_b

    .line 1210
    :cond_35
    const/16 v2, 0x2c

    .line 1211
    .line 1212
    if-ne v0, v2, :cond_37

    .line 1213
    .line 1214
    move/from16 v9, v25

    .line 1215
    .line 1216
    :goto_b
    invoke-static {v5, v1}, Lcom/google/android/gms/internal/ads/zzdr;->zzi(II)I

    .line 1217
    .line 1218
    .line 1219
    move-result v0

    .line 1220
    if-ne v0, v12, :cond_36

    .line 1221
    .line 1222
    sget-object v0, Lcom/google/android/gms/internal/ads/zzdq;->zza:Lcom/google/android/gms/internal/ads/zzdq;

    .line 1223
    .line 1224
    return-object v0

    .line 1225
    :cond_36
    new-instance v1, Lcom/google/android/gms/internal/ads/zzdq;

    .line 1226
    .line 1227
    invoke-direct {v1, v9, v0}, Lcom/google/android/gms/internal/ads/zzdq;-><init>(II)V

    .line 1228
    .line 1229
    .line 1230
    return-object v1

    .line 1231
    :cond_37
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1232
    .line 1233
    .line 1234
    move-result-object v1

    .line 1235
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 1236
    .line 1237
    .line 1238
    move-result v1

    .line 1239
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1240
    .line 1241
    add-int/lit8 v1, v1, 0x1a

    .line 1242
    .line 1243
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1244
    .line 1245
    .line 1246
    const-string v1, "Unrecognized APV profile: "

    .line 1247
    .line 1248
    invoke-static {v2, v1, v0, v8}, Lcb/a;->v(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;)V

    .line 1249
    .line 1250
    .line 1251
    sget-object v0, Lcom/google/android/gms/internal/ads/zzdq;->zza:Lcom/google/android/gms/internal/ads/zzdq;

    .line 1252
    .line 1253
    return-object v0

    .line 1254
    :catch_3
    move-exception v0

    .line 1255
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1256
    .line 1257
    .line 1258
    move-result-object v1

    .line 1259
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1260
    .line 1261
    .line 1262
    move-result-object v1

    .line 1263
    invoke-static {v8, v1, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1264
    .line 1265
    .line 1266
    goto/16 :goto_19

    .line 1267
    .line 1268
    :pswitch_21
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzv;->zzk:Ljava/lang/String;

    .line 1269
    .line 1270
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzv;->zzF:Lcom/google/android/gms/internal/ads/zzi;

    .line 1271
    .line 1272
    array-length v2, v4

    .line 1273
    const-string v10, "Ignoring malformed AV1 codec string: "

    .line 1274
    .line 1275
    if-ge v2, v6, :cond_38

    .line 1276
    .line 1277
    invoke-static {v1, v10, v8}, Lcb/a;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1278
    .line 1279
    .line 1280
    return-object v16

    .line 1281
    :cond_38
    :try_start_4
    aget-object v2, v4, v9

    .line 1282
    .line 1283
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1284
    .line 1285
    .line 1286
    move-result v2

    .line 1287
    aget-object v11, v4, v7

    .line 1288
    .line 1289
    invoke-virtual {v11, v5, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 1290
    .line 1291
    .line 1292
    move-result-object v5

    .line 1293
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1294
    .line 1295
    .line 1296
    move-result v5

    .line 1297
    aget-object v3, v4, v3

    .line 1298
    .line 1299
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1300
    .line 1301
    .line 1302
    move-result v1
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_4

    .line 1303
    if-eqz v2, :cond_39

    .line 1304
    .line 1305
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1306
    .line 1307
    .line 1308
    move-result-object v0

    .line 1309
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1310
    .line 1311
    .line 1312
    move-result v0

    .line 1313
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1314
    .line 1315
    add-int/lit8 v0, v0, 0x15

    .line 1316
    .line 1317
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1318
    .line 1319
    .line 1320
    const-string v0, "Unknown AV1 profile: "

    .line 1321
    .line 1322
    invoke-static {v1, v0, v2, v8}, Lcb/a;->v(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;)V

    .line 1323
    .line 1324
    .line 1325
    sget-object v0, Lcom/google/android/gms/internal/ads/zzdq;->zza:Lcom/google/android/gms/internal/ads/zzdq;

    .line 1326
    .line 1327
    return-object v0

    .line 1328
    :cond_39
    if-eq v1, v15, :cond_3d

    .line 1329
    .line 1330
    const/16 v2, 0xa

    .line 1331
    .line 1332
    if-eq v1, v2, :cond_3a

    .line 1333
    .line 1334
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1335
    .line 1336
    .line 1337
    move-result-object v0

    .line 1338
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1339
    .line 1340
    .line 1341
    move-result v0

    .line 1342
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1343
    .line 1344
    add-int/lit8 v0, v0, 0x17

    .line 1345
    .line 1346
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1347
    .line 1348
    .line 1349
    const-string v0, "Unknown AV1 bit depth: "

    .line 1350
    .line 1351
    invoke-static {v2, v0, v1, v8}, Lcb/a;->v(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;)V

    .line 1352
    .line 1353
    .line 1354
    sget-object v0, Lcom/google/android/gms/internal/ads/zzdq;->zza:Lcom/google/android/gms/internal/ads/zzdq;

    .line 1355
    .line 1356
    return-object v0

    .line 1357
    :cond_3a
    if-eqz v0, :cond_3c

    .line 1358
    .line 1359
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzi;->zze:[B

    .line 1360
    .line 1361
    if-nez v1, :cond_3b

    .line 1362
    .line 1363
    iget v0, v0, Lcom/google/android/gms/internal/ads/zzi;->zzd:I

    .line 1364
    .line 1365
    const/4 v1, 0x7

    .line 1366
    if-eq v0, v1, :cond_3b

    .line 1367
    .line 1368
    const/4 v1, 0x6

    .line 1369
    if-ne v0, v1, :cond_3c

    .line 1370
    .line 1371
    :cond_3b
    move/from16 v0, v23

    .line 1372
    .line 1373
    goto :goto_c

    .line 1374
    :cond_3c
    move v0, v7

    .line 1375
    goto :goto_c

    .line 1376
    :cond_3d
    move v0, v9

    .line 1377
    :goto_c
    packed-switch v5, :pswitch_data_5

    .line 1378
    .line 1379
    .line 1380
    move v6, v12

    .line 1381
    goto/16 :goto_d

    .line 1382
    .line 1383
    :pswitch_22
    const/high16 v6, 0x800000

    .line 1384
    .line 1385
    goto :goto_d

    .line 1386
    :pswitch_23
    const/high16 v6, 0x400000

    .line 1387
    .line 1388
    goto :goto_d

    .line 1389
    :pswitch_24
    const/high16 v6, 0x200000

    .line 1390
    .line 1391
    goto :goto_d

    .line 1392
    :pswitch_25
    const/high16 v6, 0x100000

    .line 1393
    .line 1394
    goto :goto_d

    .line 1395
    :pswitch_26
    const/high16 v6, 0x80000

    .line 1396
    .line 1397
    goto :goto_d

    .line 1398
    :pswitch_27
    const/high16 v6, 0x40000

    .line 1399
    .line 1400
    goto :goto_d

    .line 1401
    :pswitch_28
    const/high16 v6, 0x20000

    .line 1402
    .line 1403
    goto :goto_d

    .line 1404
    :pswitch_29
    const/high16 v6, 0x10000

    .line 1405
    .line 1406
    goto :goto_d

    .line 1407
    :pswitch_2a
    const v6, 0x8000

    .line 1408
    .line 1409
    .line 1410
    goto :goto_d

    .line 1411
    :pswitch_2b
    const/16 v6, 0x4000

    .line 1412
    .line 1413
    goto :goto_d

    .line 1414
    :pswitch_2c
    move/from16 v6, v25

    .line 1415
    .line 1416
    goto :goto_d

    .line 1417
    :pswitch_2d
    move/from16 v6, v23

    .line 1418
    .line 1419
    goto :goto_d

    .line 1420
    :pswitch_2e
    move/from16 v6, v17

    .line 1421
    .line 1422
    goto :goto_d

    .line 1423
    :pswitch_2f
    move/from16 v6, v18

    .line 1424
    .line 1425
    goto :goto_d

    .line 1426
    :pswitch_30
    move/from16 v6, v19

    .line 1427
    .line 1428
    goto :goto_d

    .line 1429
    :pswitch_31
    move/from16 v6, v20

    .line 1430
    .line 1431
    goto :goto_d

    .line 1432
    :pswitch_32
    move/from16 v6, v21

    .line 1433
    .line 1434
    goto :goto_d

    .line 1435
    :pswitch_33
    move/from16 v6, v24

    .line 1436
    .line 1437
    goto :goto_d

    .line 1438
    :pswitch_34
    move v6, v13

    .line 1439
    goto :goto_d

    .line 1440
    :pswitch_35
    move v6, v14

    .line 1441
    goto :goto_d

    .line 1442
    :pswitch_36
    move v6, v15

    .line 1443
    goto :goto_d

    .line 1444
    :pswitch_37
    move v6, v7

    .line 1445
    goto :goto_d

    .line 1446
    :pswitch_38
    move v6, v9

    .line 1447
    :goto_d
    :pswitch_39
    if-ne v6, v12, :cond_3e

    .line 1448
    .line 1449
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1450
    .line 1451
    .line 1452
    move-result-object v0

    .line 1453
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1454
    .line 1455
    .line 1456
    move-result v0

    .line 1457
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1458
    .line 1459
    add-int/lit8 v0, v0, 0x13

    .line 1460
    .line 1461
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1462
    .line 1463
    .line 1464
    const-string v0, "Unknown AV1 level: "

    .line 1465
    .line 1466
    invoke-static {v1, v0, v5, v8}, Lcb/a;->v(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;)V

    .line 1467
    .line 1468
    .line 1469
    sget-object v0, Lcom/google/android/gms/internal/ads/zzdq;->zza:Lcom/google/android/gms/internal/ads/zzdq;

    .line 1470
    .line 1471
    return-object v0

    .line 1472
    :cond_3e
    new-instance v1, Lcom/google/android/gms/internal/ads/zzdq;

    .line 1473
    .line 1474
    invoke-direct {v1, v0, v6}, Lcom/google/android/gms/internal/ads/zzdq;-><init>(II)V

    .line 1475
    .line 1476
    .line 1477
    return-object v1

    .line 1478
    :catch_4
    invoke-static {v1, v10, v8}, Lcb/a;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1479
    .line 1480
    .line 1481
    goto/16 :goto_19

    .line 1482
    .line 1483
    :pswitch_3a
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzv;->zzk:Ljava/lang/String;

    .line 1484
    .line 1485
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzv;->zzF:Lcom/google/android/gms/internal/ads/zzi;

    .line 1486
    .line 1487
    array-length v2, v4

    .line 1488
    const-string v10, "Ignoring malformed VVC codec string: "

    .line 1489
    .line 1490
    if-ge v2, v3, :cond_3f

    .line 1491
    .line 1492
    invoke-static {v1, v10, v8}, Lcb/a;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1493
    .line 1494
    .line 1495
    return-object v16

    .line 1496
    :cond_3f
    :try_start_5
    aget-object v2, v4, v9

    .line 1497
    .line 1498
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1499
    .line 1500
    .line 1501
    move-result v1
    :try_end_5
    .catch Ljava/lang/NumberFormatException; {:try_start_5 .. :try_end_5} :catch_5

    .line 1502
    if-ne v1, v9, :cond_42

    .line 1503
    .line 1504
    if-eqz v0, :cond_40

    .line 1505
    .line 1506
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzi;->zzd:I

    .line 1507
    .line 1508
    const/4 v2, 0x6

    .line 1509
    if-ne v1, v2, :cond_40

    .line 1510
    .line 1511
    move/from16 v0, v23

    .line 1512
    .line 1513
    goto :goto_e

    .line 1514
    :cond_40
    if-eqz v0, :cond_41

    .line 1515
    .line 1516
    iget v0, v0, Lcom/google/android/gms/internal/ads/zzi;->zzf:I

    .line 1517
    .line 1518
    if-ne v0, v15, :cond_41

    .line 1519
    .line 1520
    move v0, v9

    .line 1521
    goto :goto_e

    .line 1522
    :cond_41
    move v0, v7

    .line 1523
    goto :goto_e

    .line 1524
    :cond_42
    const/16 v0, 0x41

    .line 1525
    .line 1526
    if-ne v1, v0, :cond_45

    .line 1527
    .line 1528
    move v0, v6

    .line 1529
    :goto_e
    aget-object v1, v4, v7

    .line 1530
    .line 1531
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 1532
    .line 1533
    .line 1534
    move-result v2

    .line 1535
    sparse-switch v2, :sswitch_data_2

    .line 1536
    .line 1537
    .line 1538
    goto/16 :goto_f

    .line 1539
    .line 1540
    :sswitch_11
    const-string v2, "L144"

    .line 1541
    .line 1542
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1543
    .line 1544
    .line 1545
    move-result v2

    .line 1546
    if-eqz v2, :cond_43

    .line 1547
    .line 1548
    const/16 v3, 0x15

    .line 1549
    .line 1550
    goto/16 :goto_10

    .line 1551
    .line 1552
    :sswitch_12
    const-string v2, "L128"

    .line 1553
    .line 1554
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1555
    .line 1556
    .line 1557
    move-result v2

    .line 1558
    if-eqz v2, :cond_43

    .line 1559
    .line 1560
    const/16 v3, 0x13

    .line 1561
    .line 1562
    goto/16 :goto_10

    .line 1563
    .line 1564
    :sswitch_13
    const-string v2, "L112"

    .line 1565
    .line 1566
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1567
    .line 1568
    .line 1569
    move-result v2

    .line 1570
    if-eqz v2, :cond_43

    .line 1571
    .line 1572
    const/16 v3, 0x11

    .line 1573
    .line 1574
    goto/16 :goto_10

    .line 1575
    .line 1576
    :sswitch_14
    const-string v2, "H144"

    .line 1577
    .line 1578
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1579
    .line 1580
    .line 1581
    move-result v2

    .line 1582
    if-eqz v2, :cond_43

    .line 1583
    .line 1584
    const/16 v3, 0x16

    .line 1585
    .line 1586
    goto/16 :goto_10

    .line 1587
    .line 1588
    :sswitch_15
    const-string v2, "H128"

    .line 1589
    .line 1590
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1591
    .line 1592
    .line 1593
    move-result v2

    .line 1594
    if-eqz v2, :cond_43

    .line 1595
    .line 1596
    move v3, v11

    .line 1597
    goto/16 :goto_10

    .line 1598
    .line 1599
    :sswitch_16
    const-string v2, "H112"

    .line 1600
    .line 1601
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1602
    .line 1603
    .line 1604
    move-result v2

    .line 1605
    if-eqz v2, :cond_43

    .line 1606
    .line 1607
    const/16 v3, 0x12

    .line 1608
    .line 1609
    goto/16 :goto_10

    .line 1610
    .line 1611
    :sswitch_17
    const-string v2, "L96"

    .line 1612
    .line 1613
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1614
    .line 1615
    .line 1616
    move-result v2

    .line 1617
    if-eqz v2, :cond_43

    .line 1618
    .line 1619
    const/16 v3, 0xf

    .line 1620
    .line 1621
    goto/16 :goto_10

    .line 1622
    .line 1623
    :sswitch_18
    const-string v2, "L86"

    .line 1624
    .line 1625
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1626
    .line 1627
    .line 1628
    move-result v2

    .line 1629
    if-eqz v2, :cond_43

    .line 1630
    .line 1631
    const/16 v3, 0xd

    .line 1632
    .line 1633
    goto/16 :goto_10

    .line 1634
    .line 1635
    :sswitch_19
    const-string v2, "L83"

    .line 1636
    .line 1637
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1638
    .line 1639
    .line 1640
    move-result v2

    .line 1641
    if-eqz v2, :cond_43

    .line 1642
    .line 1643
    const/16 v3, 0xb

    .line 1644
    .line 1645
    goto/16 :goto_10

    .line 1646
    .line 1647
    :sswitch_1a
    const-string v2, "L80"

    .line 1648
    .line 1649
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1650
    .line 1651
    .line 1652
    move-result v2

    .line 1653
    if-eqz v2, :cond_43

    .line 1654
    .line 1655
    const/16 v3, 0x9

    .line 1656
    .line 1657
    goto/16 :goto_10

    .line 1658
    .line 1659
    :sswitch_1b
    const-string v2, "L67"

    .line 1660
    .line 1661
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1662
    .line 1663
    .line 1664
    move-result v2

    .line 1665
    if-eqz v2, :cond_43

    .line 1666
    .line 1667
    const/4 v3, 0x7

    .line 1668
    goto/16 :goto_10

    .line 1669
    .line 1670
    :sswitch_1c
    const-string v2, "L64"

    .line 1671
    .line 1672
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1673
    .line 1674
    .line 1675
    move-result v2

    .line 1676
    if-eqz v2, :cond_43

    .line 1677
    .line 1678
    const/4 v3, 0x5

    .line 1679
    goto/16 :goto_10

    .line 1680
    .line 1681
    :sswitch_1d
    const-string v2, "L51"

    .line 1682
    .line 1683
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1684
    .line 1685
    .line 1686
    move-result v2

    .line 1687
    if-eqz v2, :cond_43

    .line 1688
    .line 1689
    move v3, v6

    .line 1690
    goto/16 :goto_10

    .line 1691
    .line 1692
    :sswitch_1e
    const-string v2, "L48"

    .line 1693
    .line 1694
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1695
    .line 1696
    .line 1697
    move-result v2

    .line 1698
    if-eqz v2, :cond_43

    .line 1699
    .line 1700
    goto/16 :goto_10

    .line 1701
    .line 1702
    :sswitch_1f
    const-string v2, "L35"

    .line 1703
    .line 1704
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1705
    .line 1706
    .line 1707
    move-result v2

    .line 1708
    if-eqz v2, :cond_43

    .line 1709
    .line 1710
    move v3, v7

    .line 1711
    goto :goto_10

    .line 1712
    :sswitch_20
    const-string v2, "L32"

    .line 1713
    .line 1714
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1715
    .line 1716
    .line 1717
    move-result v2

    .line 1718
    if-eqz v2, :cond_43

    .line 1719
    .line 1720
    move v3, v9

    .line 1721
    goto :goto_10

    .line 1722
    :sswitch_21
    const-string v2, "L16"

    .line 1723
    .line 1724
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1725
    .line 1726
    .line 1727
    move-result v2

    .line 1728
    if-eqz v2, :cond_43

    .line 1729
    .line 1730
    move v3, v5

    .line 1731
    goto :goto_10

    .line 1732
    :sswitch_22
    const-string v2, "H96"

    .line 1733
    .line 1734
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1735
    .line 1736
    .line 1737
    move-result v2

    .line 1738
    if-eqz v2, :cond_43

    .line 1739
    .line 1740
    move v3, v14

    .line 1741
    goto :goto_10

    .line 1742
    :sswitch_23
    const-string v2, "H86"

    .line 1743
    .line 1744
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1745
    .line 1746
    .line 1747
    move-result v2

    .line 1748
    if-eqz v2, :cond_43

    .line 1749
    .line 1750
    const/16 v3, 0xe

    .line 1751
    .line 1752
    goto :goto_10

    .line 1753
    :sswitch_24
    const-string v2, "H83"

    .line 1754
    .line 1755
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1756
    .line 1757
    .line 1758
    move-result v2

    .line 1759
    if-eqz v2, :cond_43

    .line 1760
    .line 1761
    const/16 v3, 0xc

    .line 1762
    .line 1763
    goto :goto_10

    .line 1764
    :sswitch_25
    const-string v2, "H80"

    .line 1765
    .line 1766
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1767
    .line 1768
    .line 1769
    move-result v2

    .line 1770
    if-eqz v2, :cond_43

    .line 1771
    .line 1772
    const/16 v3, 0xa

    .line 1773
    .line 1774
    goto :goto_10

    .line 1775
    :sswitch_26
    const-string v2, "H67"

    .line 1776
    .line 1777
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1778
    .line 1779
    .line 1780
    move-result v2

    .line 1781
    if-eqz v2, :cond_43

    .line 1782
    .line 1783
    move v3, v15

    .line 1784
    goto :goto_10

    .line 1785
    :sswitch_27
    const-string v2, "H64"

    .line 1786
    .line 1787
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1788
    .line 1789
    .line 1790
    move-result v2

    .line 1791
    if-eqz v2, :cond_43

    .line 1792
    .line 1793
    const/4 v3, 0x6

    .line 1794
    goto :goto_10

    .line 1795
    :cond_43
    :goto_f
    move v3, v12

    .line 1796
    :goto_10
    packed-switch v3, :pswitch_data_6

    .line 1797
    .line 1798
    .line 1799
    move-object/from16 v3, v16

    .line 1800
    .line 1801
    goto/16 :goto_11

    .line 1802
    .line 1803
    :pswitch_3b
    const/high16 v2, 0x400000

    .line 1804
    .line 1805
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1806
    .line 1807
    .line 1808
    move-result-object v3

    .line 1809
    goto/16 :goto_11

    .line 1810
    .line 1811
    :pswitch_3c
    const/high16 v2, 0x200000

    .line 1812
    .line 1813
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1814
    .line 1815
    .line 1816
    move-result-object v3

    .line 1817
    goto/16 :goto_11

    .line 1818
    .line 1819
    :pswitch_3d
    const/high16 v2, 0x100000

    .line 1820
    .line 1821
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1822
    .line 1823
    .line 1824
    move-result-object v3

    .line 1825
    goto/16 :goto_11

    .line 1826
    .line 1827
    :pswitch_3e
    const/high16 v2, 0x80000

    .line 1828
    .line 1829
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1830
    .line 1831
    .line 1832
    move-result-object v3

    .line 1833
    goto/16 :goto_11

    .line 1834
    .line 1835
    :pswitch_3f
    const/high16 v2, 0x40000

    .line 1836
    .line 1837
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1838
    .line 1839
    .line 1840
    move-result-object v3

    .line 1841
    goto/16 :goto_11

    .line 1842
    .line 1843
    :pswitch_40
    const/high16 v2, 0x20000

    .line 1844
    .line 1845
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1846
    .line 1847
    .line 1848
    move-result-object v3

    .line 1849
    goto :goto_11

    .line 1850
    :pswitch_41
    const/high16 v2, 0x10000

    .line 1851
    .line 1852
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1853
    .line 1854
    .line 1855
    move-result-object v3

    .line 1856
    goto :goto_11

    .line 1857
    :pswitch_42
    const v2, 0x8000

    .line 1858
    .line 1859
    .line 1860
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1861
    .line 1862
    .line 1863
    move-result-object v3

    .line 1864
    goto :goto_11

    .line 1865
    :pswitch_43
    const/16 v2, 0x4000

    .line 1866
    .line 1867
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1868
    .line 1869
    .line 1870
    move-result-object v3

    .line 1871
    goto :goto_11

    .line 1872
    :pswitch_44
    invoke-static/range {v25 .. v25}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1873
    .line 1874
    .line 1875
    move-result-object v3

    .line 1876
    goto :goto_11

    .line 1877
    :pswitch_45
    invoke-static/range {v23 .. v23}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1878
    .line 1879
    .line 1880
    move-result-object v3

    .line 1881
    goto :goto_11

    .line 1882
    :pswitch_46
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1883
    .line 1884
    .line 1885
    move-result-object v3

    .line 1886
    goto :goto_11

    .line 1887
    :pswitch_47
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1888
    .line 1889
    .line 1890
    move-result-object v3

    .line 1891
    goto :goto_11

    .line 1892
    :pswitch_48
    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1893
    .line 1894
    .line 1895
    move-result-object v3

    .line 1896
    goto :goto_11

    .line 1897
    :pswitch_49
    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1898
    .line 1899
    .line 1900
    move-result-object v3

    .line 1901
    goto :goto_11

    .line 1902
    :pswitch_4a
    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1903
    .line 1904
    .line 1905
    move-result-object v3

    .line 1906
    goto :goto_11

    .line 1907
    :pswitch_4b
    invoke-static/range {v24 .. v24}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1908
    .line 1909
    .line 1910
    move-result-object v3

    .line 1911
    goto :goto_11

    .line 1912
    :pswitch_4c
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1913
    .line 1914
    .line 1915
    move-result-object v3

    .line 1916
    goto :goto_11

    .line 1917
    :pswitch_4d
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1918
    .line 1919
    .line 1920
    move-result-object v3

    .line 1921
    goto :goto_11

    .line 1922
    :pswitch_4e
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1923
    .line 1924
    .line 1925
    move-result-object v3

    .line 1926
    goto :goto_11

    .line 1927
    :pswitch_4f
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1928
    .line 1929
    .line 1930
    move-result-object v3

    .line 1931
    goto :goto_11

    .line 1932
    :pswitch_50
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1933
    .line 1934
    .line 1935
    move-result-object v3

    .line 1936
    goto :goto_11

    .line 1937
    :pswitch_51
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1938
    .line 1939
    .line 1940
    move-result-object v3

    .line 1941
    :goto_11
    if-nez v3, :cond_44

    .line 1942
    .line 1943
    const-string v0, "Unknown VVC level string: "

    .line 1944
    .line 1945
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1946
    .line 1947
    .line 1948
    move-result-object v0

    .line 1949
    invoke-static {v8, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 1950
    .line 1951
    .line 1952
    sget-object v0, Lcom/google/android/gms/internal/ads/zzdq;->zza:Lcom/google/android/gms/internal/ads/zzdq;

    .line 1953
    .line 1954
    return-object v0

    .line 1955
    :cond_44
    new-instance v1, Lcom/google/android/gms/internal/ads/zzdq;

    .line 1956
    .line 1957
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 1958
    .line 1959
    .line 1960
    move-result v2

    .line 1961
    invoke-direct {v1, v0, v2}, Lcom/google/android/gms/internal/ads/zzdq;-><init>(II)V

    .line 1962
    .line 1963
    .line 1964
    return-object v1

    .line 1965
    :cond_45
    aget-object v0, v4, v9

    .line 1966
    .line 1967
    const-string v1, "Unknown VVC profile IDC: "

    .line 1968
    .line 1969
    invoke-static {v0, v1, v8}, Lcb/a;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1970
    .line 1971
    .line 1972
    sget-object v0, Lcom/google/android/gms/internal/ads/zzdq;->zza:Lcom/google/android/gms/internal/ads/zzdq;

    .line 1973
    .line 1974
    return-object v0

    .line 1975
    :catch_5
    invoke-static {v1, v10, v8}, Lcb/a;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1976
    .line 1977
    .line 1978
    goto/16 :goto_19

    .line 1979
    .line 1980
    :pswitch_52
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzv;->zzk:Ljava/lang/String;

    .line 1981
    .line 1982
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzv;->zzF:Lcom/google/android/gms/internal/ads/zzi;

    .line 1983
    .line 1984
    invoke-static {v1, v4, v0}, Lcom/google/android/gms/internal/ads/zzdr;->zzg(Ljava/lang/String;[Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzi;)Lcom/google/android/gms/internal/ads/zzdq;

    .line 1985
    .line 1986
    .line 1987
    move-result-object v0

    .line 1988
    return-object v0

    .line 1989
    :pswitch_53
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzv;->zzk:Ljava/lang/String;

    .line 1990
    .line 1991
    array-length v1, v4

    .line 1992
    const-string v2, "Ignoring malformed VP9 codec string: "

    .line 1993
    .line 1994
    if-ge v1, v3, :cond_46

    .line 1995
    .line 1996
    invoke-static {v0, v2, v8}, Lcb/a;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1997
    .line 1998
    .line 1999
    return-object v16

    .line 2000
    :cond_46
    :try_start_6
    aget-object v1, v4, v9

    .line 2001
    .line 2002
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 2003
    .line 2004
    .line 2005
    move-result v1

    .line 2006
    aget-object v4, v4, v7

    .line 2007
    .line 2008
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 2009
    .line 2010
    .line 2011
    move-result v0
    :try_end_6
    .catch Ljava/lang/NumberFormatException; {:try_start_6 .. :try_end_6} :catch_6

    .line 2012
    if-eqz v1, :cond_4a

    .line 2013
    .line 2014
    if-eq v1, v9, :cond_49

    .line 2015
    .line 2016
    if-eq v1, v7, :cond_48

    .line 2017
    .line 2018
    if-eq v1, v3, :cond_47

    .line 2019
    .line 2020
    move v2, v12

    .line 2021
    goto :goto_12

    .line 2022
    :cond_47
    move v2, v15

    .line 2023
    goto :goto_12

    .line 2024
    :cond_48
    move v2, v6

    .line 2025
    goto :goto_12

    .line 2026
    :cond_49
    move v2, v7

    .line 2027
    goto :goto_12

    .line 2028
    :cond_4a
    move v2, v9

    .line 2029
    :goto_12
    if-ne v2, v12, :cond_4b

    .line 2030
    .line 2031
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 2032
    .line 2033
    .line 2034
    move-result-object v0

    .line 2035
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 2036
    .line 2037
    .line 2038
    move-result v0

    .line 2039
    new-instance v2, Ljava/lang/StringBuilder;

    .line 2040
    .line 2041
    add-int/lit8 v0, v0, 0x15

    .line 2042
    .line 2043
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 2044
    .line 2045
    .line 2046
    const-string v0, "Unknown VP9 profile: "

    .line 2047
    .line 2048
    invoke-static {v2, v0, v1, v8}, Lcb/a;->v(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;)V

    .line 2049
    .line 2050
    .line 2051
    sget-object v0, Lcom/google/android/gms/internal/ads/zzdq;->zza:Lcom/google/android/gms/internal/ads/zzdq;

    .line 2052
    .line 2053
    return-object v0

    .line 2054
    :cond_4b
    const/16 v1, 0xa

    .line 2055
    .line 2056
    if-eq v0, v1, :cond_54

    .line 2057
    .line 2058
    const/16 v1, 0xb

    .line 2059
    .line 2060
    if-eq v0, v1, :cond_53

    .line 2061
    .line 2062
    if-eq v0, v11, :cond_55

    .line 2063
    .line 2064
    const/16 v1, 0x15

    .line 2065
    .line 2066
    if-eq v0, v1, :cond_52

    .line 2067
    .line 2068
    const/16 v1, 0x1e

    .line 2069
    .line 2070
    if-eq v0, v1, :cond_51

    .line 2071
    .line 2072
    const/16 v1, 0x1f

    .line 2073
    .line 2074
    if-eq v0, v1, :cond_50

    .line 2075
    .line 2076
    const/16 v1, 0x28

    .line 2077
    .line 2078
    if-eq v0, v1, :cond_4f

    .line 2079
    .line 2080
    const/16 v1, 0x29

    .line 2081
    .line 2082
    if-eq v0, v1, :cond_4e

    .line 2083
    .line 2084
    const/16 v1, 0x32

    .line 2085
    .line 2086
    if-eq v0, v1, :cond_4d

    .line 2087
    .line 2088
    const/16 v1, 0x33

    .line 2089
    .line 2090
    if-eq v0, v1, :cond_4c

    .line 2091
    .line 2092
    packed-switch v0, :pswitch_data_7

    .line 2093
    .line 2094
    .line 2095
    move v6, v12

    .line 2096
    goto :goto_13

    .line 2097
    :pswitch_54
    move/from16 v6, v25

    .line 2098
    .line 2099
    goto :goto_13

    .line 2100
    :pswitch_55
    move/from16 v6, v23

    .line 2101
    .line 2102
    goto :goto_13

    .line 2103
    :pswitch_56
    move/from16 v6, v17

    .line 2104
    .line 2105
    goto :goto_13

    .line 2106
    :cond_4c
    move/from16 v6, v19

    .line 2107
    .line 2108
    goto :goto_13

    .line 2109
    :cond_4d
    move/from16 v6, v20

    .line 2110
    .line 2111
    goto :goto_13

    .line 2112
    :cond_4e
    move/from16 v6, v21

    .line 2113
    .line 2114
    goto :goto_13

    .line 2115
    :cond_4f
    move/from16 v6, v24

    .line 2116
    .line 2117
    goto :goto_13

    .line 2118
    :cond_50
    move v6, v13

    .line 2119
    goto :goto_13

    .line 2120
    :cond_51
    move v6, v14

    .line 2121
    goto :goto_13

    .line 2122
    :cond_52
    move v6, v15

    .line 2123
    goto :goto_13

    .line 2124
    :cond_53
    move v6, v7

    .line 2125
    goto :goto_13

    .line 2126
    :cond_54
    move v6, v9

    .line 2127
    :cond_55
    :goto_13
    if-ne v6, v12, :cond_56

    .line 2128
    .line 2129
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 2130
    .line 2131
    .line 2132
    move-result-object v1

    .line 2133
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 2134
    .line 2135
    .line 2136
    move-result v1

    .line 2137
    new-instance v2, Ljava/lang/StringBuilder;

    .line 2138
    .line 2139
    add-int/lit8 v1, v1, 0x13

    .line 2140
    .line 2141
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 2142
    .line 2143
    .line 2144
    const-string v1, "Unknown VP9 level: "

    .line 2145
    .line 2146
    invoke-static {v2, v1, v0, v8}, Lcb/a;->v(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;)V

    .line 2147
    .line 2148
    .line 2149
    sget-object v0, Lcom/google/android/gms/internal/ads/zzdq;->zza:Lcom/google/android/gms/internal/ads/zzdq;

    .line 2150
    .line 2151
    return-object v0

    .line 2152
    :cond_56
    new-instance v0, Lcom/google/android/gms/internal/ads/zzdq;

    .line 2153
    .line 2154
    invoke-direct {v0, v2, v6}, Lcom/google/android/gms/internal/ads/zzdq;-><init>(II)V

    .line 2155
    .line 2156
    .line 2157
    return-object v0

    .line 2158
    :catch_6
    invoke-static {v0, v2, v8}, Lcb/a;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2159
    .line 2160
    .line 2161
    goto/16 :goto_19

    .line 2162
    .line 2163
    :pswitch_57
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzv;->zzk:Ljava/lang/String;

    .line 2164
    .line 2165
    array-length v1, v4

    .line 2166
    const-string v2, "Ignoring malformed AVC codec string: "

    .line 2167
    .line 2168
    if-ge v1, v7, :cond_57

    .line 2169
    .line 2170
    invoke-static {v0, v2, v8}, Lcb/a;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2171
    .line 2172
    .line 2173
    return-object v16

    .line 2174
    :cond_57
    :try_start_7
    aget-object v10, v4, v9

    .line 2175
    .line 2176
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 2177
    .line 2178
    .line 2179
    move-result v10

    .line 2180
    const/4 v11, 0x6

    .line 2181
    if-ne v10, v11, :cond_58

    .line 2182
    .line 2183
    aget-object v1, v4, v9

    .line 2184
    .line 2185
    invoke-virtual {v1, v5, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 2186
    .line 2187
    .line 2188
    move-result-object v1

    .line 2189
    invoke-static {v1, v14}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 2190
    .line 2191
    .line 2192
    move-result v1

    .line 2193
    aget-object v3, v4, v9

    .line 2194
    .line 2195
    invoke-virtual {v3, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 2196
    .line 2197
    .line 2198
    move-result-object v3

    .line 2199
    invoke-static {v3, v14}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 2200
    .line 2201
    .line 2202
    move-result v0

    .line 2203
    goto :goto_14

    .line 2204
    :cond_58
    if-lt v1, v3, :cond_62

    .line 2205
    .line 2206
    aget-object v1, v4, v9

    .line 2207
    .line 2208
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 2209
    .line 2210
    .line 2211
    move-result v1

    .line 2212
    aget-object v3, v4, v7

    .line 2213
    .line 2214
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 2215
    .line 2216
    .line 2217
    move-result v0
    :try_end_7
    .catch Ljava/lang/NumberFormatException; {:try_start_7 .. :try_end_7} :catch_7

    .line 2218
    :goto_14
    const/16 v2, 0x42

    .line 2219
    .line 2220
    if-eq v1, v2, :cond_5e

    .line 2221
    .line 2222
    const/16 v2, 0x4d

    .line 2223
    .line 2224
    if-eq v1, v2, :cond_5f

    .line 2225
    .line 2226
    const/16 v2, 0x58

    .line 2227
    .line 2228
    if-eq v1, v2, :cond_5d

    .line 2229
    .line 2230
    const/16 v2, 0x64

    .line 2231
    .line 2232
    if-eq v1, v2, :cond_5c

    .line 2233
    .line 2234
    const/16 v2, 0x6e

    .line 2235
    .line 2236
    if-eq v1, v2, :cond_5b

    .line 2237
    .line 2238
    const/16 v2, 0x7a

    .line 2239
    .line 2240
    if-eq v1, v2, :cond_5a

    .line 2241
    .line 2242
    const/16 v2, 0xf4

    .line 2243
    .line 2244
    if-eq v1, v2, :cond_59

    .line 2245
    .line 2246
    move v7, v12

    .line 2247
    goto :goto_15

    .line 2248
    :cond_59
    move/from16 v7, v24

    .line 2249
    .line 2250
    goto :goto_15

    .line 2251
    :cond_5a
    move v7, v13

    .line 2252
    goto :goto_15

    .line 2253
    :cond_5b
    move v7, v14

    .line 2254
    goto :goto_15

    .line 2255
    :cond_5c
    move v7, v15

    .line 2256
    goto :goto_15

    .line 2257
    :cond_5d
    move v7, v6

    .line 2258
    goto :goto_15

    .line 2259
    :cond_5e
    move v7, v9

    .line 2260
    :cond_5f
    :goto_15
    if-ne v7, v12, :cond_60

    .line 2261
    .line 2262
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 2263
    .line 2264
    .line 2265
    move-result-object v0

    .line 2266
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 2267
    .line 2268
    .line 2269
    move-result v0

    .line 2270
    new-instance v2, Ljava/lang/StringBuilder;

    .line 2271
    .line 2272
    add-int/lit8 v0, v0, 0x15

    .line 2273
    .line 2274
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 2275
    .line 2276
    .line 2277
    const-string v0, "Unknown AVC profile: "

    .line 2278
    .line 2279
    invoke-static {v2, v0, v1, v8}, Lcb/a;->v(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;)V

    .line 2280
    .line 2281
    .line 2282
    sget-object v0, Lcom/google/android/gms/internal/ads/zzdq;->zza:Lcom/google/android/gms/internal/ads/zzdq;

    .line 2283
    .line 2284
    return-object v0

    .line 2285
    :cond_60
    packed-switch v0, :pswitch_data_8

    .line 2286
    .line 2287
    .line 2288
    packed-switch v0, :pswitch_data_9

    .line 2289
    .line 2290
    .line 2291
    packed-switch v0, :pswitch_data_a

    .line 2292
    .line 2293
    .line 2294
    packed-switch v0, :pswitch_data_b

    .line 2295
    .line 2296
    .line 2297
    packed-switch v0, :pswitch_data_c

    .line 2298
    .line 2299
    .line 2300
    move v6, v12

    .line 2301
    goto :goto_16

    .line 2302
    :pswitch_58
    const/high16 v6, 0x10000

    .line 2303
    .line 2304
    goto :goto_16

    .line 2305
    :pswitch_59
    const v6, 0x8000

    .line 2306
    .line 2307
    .line 2308
    goto :goto_16

    .line 2309
    :pswitch_5a
    const/16 v6, 0x4000

    .line 2310
    .line 2311
    goto :goto_16

    .line 2312
    :pswitch_5b
    move/from16 v6, v25

    .line 2313
    .line 2314
    goto :goto_16

    .line 2315
    :pswitch_5c
    move/from16 v6, v23

    .line 2316
    .line 2317
    goto :goto_16

    .line 2318
    :pswitch_5d
    move/from16 v6, v17

    .line 2319
    .line 2320
    goto :goto_16

    .line 2321
    :pswitch_5e
    move/from16 v6, v18

    .line 2322
    .line 2323
    goto :goto_16

    .line 2324
    :pswitch_5f
    move/from16 v6, v19

    .line 2325
    .line 2326
    goto :goto_16

    .line 2327
    :pswitch_60
    move/from16 v6, v20

    .line 2328
    .line 2329
    goto :goto_16

    .line 2330
    :pswitch_61
    move/from16 v6, v21

    .line 2331
    .line 2332
    goto :goto_16

    .line 2333
    :pswitch_62
    move/from16 v6, v24

    .line 2334
    .line 2335
    goto :goto_16

    .line 2336
    :pswitch_63
    move v6, v13

    .line 2337
    goto :goto_16

    .line 2338
    :pswitch_64
    move v6, v14

    .line 2339
    goto :goto_16

    .line 2340
    :pswitch_65
    move v6, v15

    .line 2341
    goto :goto_16

    .line 2342
    :pswitch_66
    move v6, v9

    .line 2343
    :goto_16
    :pswitch_67
    if-ne v6, v12, :cond_61

    .line 2344
    .line 2345
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 2346
    .line 2347
    .line 2348
    move-result-object v1

    .line 2349
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 2350
    .line 2351
    .line 2352
    move-result v1

    .line 2353
    new-instance v2, Ljava/lang/StringBuilder;

    .line 2354
    .line 2355
    add-int/lit8 v1, v1, 0x13

    .line 2356
    .line 2357
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 2358
    .line 2359
    .line 2360
    const-string v1, "Unknown AVC level: "

    .line 2361
    .line 2362
    invoke-static {v2, v1, v0, v8}, Lcb/a;->v(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;)V

    .line 2363
    .line 2364
    .line 2365
    sget-object v0, Lcom/google/android/gms/internal/ads/zzdq;->zza:Lcom/google/android/gms/internal/ads/zzdq;

    .line 2366
    .line 2367
    return-object v0

    .line 2368
    :cond_61
    new-instance v0, Lcom/google/android/gms/internal/ads/zzdq;

    .line 2369
    .line 2370
    invoke-direct {v0, v7, v6}, Lcom/google/android/gms/internal/ads/zzdq;-><init>(II)V

    .line 2371
    .line 2372
    .line 2373
    return-object v0

    .line 2374
    :cond_62
    :try_start_8
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 2375
    .line 2376
    .line 2377
    move-result-object v1

    .line 2378
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 2379
    .line 2380
    .line 2381
    move-result v1

    .line 2382
    add-int/lit8 v1, v1, 0x25

    .line 2383
    .line 2384
    new-instance v3, Ljava/lang/StringBuilder;

    .line 2385
    .line 2386
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 2387
    .line 2388
    .line 2389
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2390
    .line 2391
    .line 2392
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2393
    .line 2394
    .line 2395
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2396
    .line 2397
    .line 2398
    move-result-object v1

    .line 2399
    invoke-static {v8, v1}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_8
    .catch Ljava/lang/NumberFormatException; {:try_start_8 .. :try_end_8} :catch_7

    .line 2400
    .line 2401
    .line 2402
    return-object v16

    .line 2403
    :catch_7
    invoke-static {v0, v2, v8}, Lcb/a;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2404
    .line 2405
    .line 2406
    goto/16 :goto_19

    .line 2407
    .line 2408
    :pswitch_68
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzv;->zzk:Ljava/lang/String;

    .line 2409
    .line 2410
    array-length v1, v4

    .line 2411
    const-string v2, "Ignoring malformed H263 codec string: "

    .line 2412
    .line 2413
    if-ge v1, v3, :cond_63

    .line 2414
    .line 2415
    invoke-static {v0, v2, v8}, Lcb/a;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2416
    .line 2417
    .line 2418
    return-object v16

    .line 2419
    :cond_63
    :try_start_9
    aget-object v1, v4, v9

    .line 2420
    .line 2421
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 2422
    .line 2423
    .line 2424
    move-result v1

    .line 2425
    aget-object v3, v4, v7

    .line 2426
    .line 2427
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 2428
    .line 2429
    .line 2430
    move-result v0
    :try_end_9
    .catch Ljava/lang/NumberFormatException; {:try_start_9 .. :try_end_9} :catch_8

    .line 2431
    packed-switch v1, :pswitch_data_d

    .line 2432
    .line 2433
    .line 2434
    move v2, v12

    .line 2435
    goto :goto_17

    .line 2436
    :pswitch_69
    move/from16 v2, v20

    .line 2437
    .line 2438
    goto :goto_17

    .line 2439
    :pswitch_6a
    move/from16 v2, v21

    .line 2440
    .line 2441
    goto :goto_17

    .line 2442
    :pswitch_6b
    move/from16 v2, v24

    .line 2443
    .line 2444
    goto :goto_17

    .line 2445
    :pswitch_6c
    move v2, v13

    .line 2446
    goto :goto_17

    .line 2447
    :pswitch_6d
    move v2, v14

    .line 2448
    goto :goto_17

    .line 2449
    :pswitch_6e
    move v2, v15

    .line 2450
    goto :goto_17

    .line 2451
    :pswitch_6f
    move v2, v6

    .line 2452
    goto :goto_17

    .line 2453
    :pswitch_70
    move v2, v7

    .line 2454
    goto :goto_17

    .line 2455
    :pswitch_71
    move v2, v9

    .line 2456
    :goto_17
    if-ne v2, v12, :cond_64

    .line 2457
    .line 2458
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 2459
    .line 2460
    .line 2461
    move-result-object v0

    .line 2462
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 2463
    .line 2464
    .line 2465
    move-result v0

    .line 2466
    new-instance v2, Ljava/lang/StringBuilder;

    .line 2467
    .line 2468
    add-int/lit8 v0, v0, 0x16

    .line 2469
    .line 2470
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 2471
    .line 2472
    .line 2473
    const-string v0, "Unknown H263 profile: "

    .line 2474
    .line 2475
    invoke-static {v2, v0, v1, v8}, Lcb/a;->v(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;)V

    .line 2476
    .line 2477
    .line 2478
    sget-object v0, Lcom/google/android/gms/internal/ads/zzdq;->zza:Lcom/google/android/gms/internal/ads/zzdq;

    .line 2479
    .line 2480
    return-object v0

    .line 2481
    :cond_64
    const/16 v1, 0xa

    .line 2482
    .line 2483
    if-eq v0, v1, :cond_6c

    .line 2484
    .line 2485
    if-eq v0, v11, :cond_6b

    .line 2486
    .line 2487
    const/16 v1, 0x1e

    .line 2488
    .line 2489
    if-eq v0, v1, :cond_6a

    .line 2490
    .line 2491
    const/16 v1, 0x28

    .line 2492
    .line 2493
    if-eq v0, v1, :cond_69

    .line 2494
    .line 2495
    const/16 v1, 0x2d

    .line 2496
    .line 2497
    if-eq v0, v1, :cond_68

    .line 2498
    .line 2499
    const/16 v1, 0x32

    .line 2500
    .line 2501
    if-eq v0, v1, :cond_67

    .line 2502
    .line 2503
    const/16 v1, 0x3c

    .line 2504
    .line 2505
    if-eq v0, v1, :cond_66

    .line 2506
    .line 2507
    const/16 v1, 0x46

    .line 2508
    .line 2509
    if-eq v0, v1, :cond_65

    .line 2510
    .line 2511
    move v10, v12

    .line 2512
    goto :goto_18

    .line 2513
    :cond_65
    move/from16 v10, v21

    .line 2514
    .line 2515
    goto :goto_18

    .line 2516
    :cond_66
    move/from16 v10, v24

    .line 2517
    .line 2518
    goto :goto_18

    .line 2519
    :cond_67
    move v10, v13

    .line 2520
    goto :goto_18

    .line 2521
    :cond_68
    move v10, v14

    .line 2522
    goto :goto_18

    .line 2523
    :cond_69
    move v10, v15

    .line 2524
    goto :goto_18

    .line 2525
    :cond_6a
    move v10, v6

    .line 2526
    goto :goto_18

    .line 2527
    :cond_6b
    move v10, v7

    .line 2528
    goto :goto_18

    .line 2529
    :cond_6c
    move v10, v9

    .line 2530
    :goto_18
    if-ne v10, v12, :cond_6d

    .line 2531
    .line 2532
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 2533
    .line 2534
    .line 2535
    move-result-object v1

    .line 2536
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 2537
    .line 2538
    .line 2539
    move-result v1

    .line 2540
    new-instance v2, Ljava/lang/StringBuilder;

    .line 2541
    .line 2542
    add-int/2addr v1, v11

    .line 2543
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 2544
    .line 2545
    .line 2546
    const-string v1, "Unknown H263 level: "

    .line 2547
    .line 2548
    invoke-static {v2, v1, v0, v8}, Lcb/a;->v(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;)V

    .line 2549
    .line 2550
    .line 2551
    sget-object v0, Lcom/google/android/gms/internal/ads/zzdq;->zza:Lcom/google/android/gms/internal/ads/zzdq;

    .line 2552
    .line 2553
    return-object v0

    .line 2554
    :cond_6d
    new-instance v0, Lcom/google/android/gms/internal/ads/zzdq;

    .line 2555
    .line 2556
    invoke-direct {v0, v2, v10}, Lcom/google/android/gms/internal/ads/zzdq;-><init>(II)V

    .line 2557
    .line 2558
    .line 2559
    return-object v0

    .line 2560
    :catch_8
    invoke-static {v0, v2, v8}, Lcb/a;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2561
    .line 2562
    .line 2563
    :goto_19
    return-object v16

    .line 2564
    nop

    .line 2565
    :pswitch_data_0
    .packed-switch 0x600
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 2566
    .line 2567
    .line 2568
    .line 2569
    .line 2570
    .line 2571
    .line 2572
    .line 2573
    .line 2574
    .line 2575
    .line 2576
    .line 2577
    .line 2578
    .line 2579
    .line 2580
    .line 2581
    .line 2582
    .line 2583
    .line 2584
    .line 2585
    .line 2586
    .line 2587
    .line 2588
    .line 2589
    :pswitch_data_1
    .packed-switch 0x601
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
    .end packed-switch

    .line 2590
    .line 2591
    .line 2592
    .line 2593
    .line 2594
    .line 2595
    .line 2596
    .line 2597
    .line 2598
    .line 2599
    .line 2600
    .line 2601
    .line 2602
    .line 2603
    .line 2604
    .line 2605
    .line 2606
    .line 2607
    .line 2608
    .line 2609
    .line 2610
    .line 2611
    :pswitch_data_2
    .packed-switch 0x61f
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
    .end packed-switch

    .line 2612
    .line 2613
    .line 2614
    .line 2615
    .line 2616
    .line 2617
    .line 2618
    .line 2619
    .line 2620
    .line 2621
    .line 2622
    .line 2623
    :sswitch_data_0
    .sparse-switch
        0x2d9149 -> :sswitch_c
        0x2dcaea -> :sswitch_b
        0x2dd8f6 -> :sswitch_a
        0x2ddf23 -> :sswitch_9
        0x2ddf24 -> :sswitch_8
        0x30d038 -> :sswitch_7
        0x310dbc -> :sswitch_6
        0x3134b1 -> :sswitch_5
        0x333790 -> :sswitch_4
        0x35091c -> :sswitch_3
        0x374e43 -> :sswitch_2
        0x376aee -> :sswitch_1
        0x376ba8 -> :sswitch_0
    .end sparse-switch

    .line 2624
    .line 2625
    .line 2626
    .line 2627
    .line 2628
    .line 2629
    .line 2630
    .line 2631
    .line 2632
    .line 2633
    .line 2634
    .line 2635
    .line 2636
    .line 2637
    .line 2638
    .line 2639
    .line 2640
    .line 2641
    .line 2642
    .line 2643
    .line 2644
    .line 2645
    .line 2646
    .line 2647
    .line 2648
    .line 2649
    .line 2650
    .line 2651
    .line 2652
    .line 2653
    .line 2654
    .line 2655
    .line 2656
    .line 2657
    .line 2658
    .line 2659
    .line 2660
    .line 2661
    .line 2662
    .line 2663
    .line 2664
    .line 2665
    .line 2666
    .line 2667
    .line 2668
    .line 2669
    .line 2670
    .line 2671
    .line 2672
    .line 2673
    .line 2674
    .line 2675
    .line 2676
    .line 2677
    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_68
        :pswitch_57
        :pswitch_57
        :pswitch_53
        :pswitch_52
        :pswitch_52
        :pswitch_3a
        :pswitch_3a
        :pswitch_21
        :pswitch_20
        :pswitch_19
        :pswitch_18
        :pswitch_17
    .end packed-switch

    .line 2678
    .line 2679
    .line 2680
    .line 2681
    .line 2682
    .line 2683
    .line 2684
    .line 2685
    .line 2686
    .line 2687
    .line 2688
    .line 2689
    .line 2690
    .line 2691
    .line 2692
    .line 2693
    .line 2694
    .line 2695
    .line 2696
    .line 2697
    .line 2698
    .line 2699
    .line 2700
    .line 2701
    .line 2702
    .line 2703
    .line 2704
    .line 2705
    .line 2706
    .line 2707
    :sswitch_data_1
    .sparse-switch
        0x259c5f -> :sswitch_10
        0x2f8728 -> :sswitch_f
        0x316bd1 -> :sswitch_e
        0x333790 -> :sswitch_d
    .end sparse-switch

    .line 2708
    .line 2709
    .line 2710
    .line 2711
    .line 2712
    .line 2713
    .line 2714
    .line 2715
    .line 2716
    .line 2717
    .line 2718
    .line 2719
    .line 2720
    .line 2721
    .line 2722
    .line 2723
    .line 2724
    .line 2725
    :pswitch_data_4
    .packed-switch 0x1
        :pswitch_1e
        :pswitch_1d
        :pswitch_1f
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
    .end packed-switch

    .line 2726
    .line 2727
    .line 2728
    .line 2729
    .line 2730
    .line 2731
    .line 2732
    .line 2733
    .line 2734
    .line 2735
    .line 2736
    .line 2737
    .line 2738
    .line 2739
    .line 2740
    .line 2741
    :pswitch_data_5
    .packed-switch 0x0
        :pswitch_38
        :pswitch_37
        :pswitch_39
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
    .end packed-switch

    .line 2742
    .line 2743
    .line 2744
    .line 2745
    .line 2746
    .line 2747
    .line 2748
    .line 2749
    .line 2750
    .line 2751
    .line 2752
    .line 2753
    .line 2754
    .line 2755
    .line 2756
    .line 2757
    .line 2758
    .line 2759
    .line 2760
    .line 2761
    .line 2762
    .line 2763
    .line 2764
    .line 2765
    .line 2766
    .line 2767
    .line 2768
    .line 2769
    .line 2770
    .line 2771
    .line 2772
    .line 2773
    .line 2774
    .line 2775
    .line 2776
    .line 2777
    .line 2778
    .line 2779
    .line 2780
    .line 2781
    .line 2782
    .line 2783
    .line 2784
    .line 2785
    .line 2786
    .line 2787
    .line 2788
    .line 2789
    .line 2790
    .line 2791
    .line 2792
    .line 2793
    :sswitch_data_2
    .sparse-switch
        0x11506 -> :sswitch_27
        0x11509 -> :sswitch_26
        0x11540 -> :sswitch_25
        0x11543 -> :sswitch_24
        0x11546 -> :sswitch_23
        0x11565 -> :sswitch_22
        0x12371 -> :sswitch_21
        0x123ab -> :sswitch_20
        0x123ae -> :sswitch_1f
        0x123d0 -> :sswitch_1e
        0x123e8 -> :sswitch_1d
        0x1240a -> :sswitch_1c
        0x1240d -> :sswitch_1b
        0x12444 -> :sswitch_1a
        0x12447 -> :sswitch_19
        0x1244a -> :sswitch_18
        0x12469 -> :sswitch_17
        0x2178ca -> :sswitch_16
        0x2178ef -> :sswitch_15
        0x217929 -> :sswitch_14
        0x234a46 -> :sswitch_13
        0x234a6b -> :sswitch_12
        0x234aa5 -> :sswitch_11
    .end sparse-switch

    .line 2794
    .line 2795
    .line 2796
    .line 2797
    .line 2798
    .line 2799
    .line 2800
    .line 2801
    .line 2802
    .line 2803
    .line 2804
    .line 2805
    .line 2806
    .line 2807
    .line 2808
    .line 2809
    .line 2810
    .line 2811
    .line 2812
    .line 2813
    .line 2814
    .line 2815
    .line 2816
    .line 2817
    .line 2818
    .line 2819
    .line 2820
    .line 2821
    .line 2822
    .line 2823
    .line 2824
    .line 2825
    .line 2826
    .line 2827
    .line 2828
    .line 2829
    .line 2830
    .line 2831
    .line 2832
    .line 2833
    .line 2834
    .line 2835
    .line 2836
    .line 2837
    .line 2838
    .line 2839
    .line 2840
    .line 2841
    .line 2842
    .line 2843
    .line 2844
    .line 2845
    .line 2846
    .line 2847
    .line 2848
    .line 2849
    .line 2850
    .line 2851
    .line 2852
    .line 2853
    .line 2854
    .line 2855
    .line 2856
    .line 2857
    .line 2858
    .line 2859
    .line 2860
    .line 2861
    .line 2862
    .line 2863
    .line 2864
    .line 2865
    .line 2866
    .line 2867
    .line 2868
    .line 2869
    .line 2870
    .line 2871
    .line 2872
    .line 2873
    .line 2874
    .line 2875
    .line 2876
    .line 2877
    .line 2878
    .line 2879
    .line 2880
    .line 2881
    .line 2882
    .line 2883
    .line 2884
    .line 2885
    .line 2886
    .line 2887
    :pswitch_data_6
    .packed-switch 0x0
        :pswitch_51
        :pswitch_50
        :pswitch_4f
        :pswitch_4e
        :pswitch_4d
        :pswitch_4c
        :pswitch_4b
        :pswitch_4a
        :pswitch_49
        :pswitch_48
        :pswitch_47
        :pswitch_46
        :pswitch_45
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
    .end packed-switch

    .line 2888
    .line 2889
    .line 2890
    .line 2891
    .line 2892
    .line 2893
    .line 2894
    .line 2895
    .line 2896
    .line 2897
    .line 2898
    .line 2899
    .line 2900
    .line 2901
    .line 2902
    .line 2903
    .line 2904
    .line 2905
    .line 2906
    .line 2907
    .line 2908
    .line 2909
    .line 2910
    .line 2911
    .line 2912
    .line 2913
    .line 2914
    .line 2915
    .line 2916
    .line 2917
    .line 2918
    .line 2919
    .line 2920
    .line 2921
    .line 2922
    .line 2923
    .line 2924
    .line 2925
    .line 2926
    .line 2927
    .line 2928
    .line 2929
    .line 2930
    .line 2931
    .line 2932
    .line 2933
    .line 2934
    .line 2935
    .line 2936
    .line 2937
    :pswitch_data_7
    .packed-switch 0x3c
        :pswitch_56
        :pswitch_55
        :pswitch_54
    .end packed-switch

    .line 2938
    .line 2939
    .line 2940
    .line 2941
    .line 2942
    .line 2943
    .line 2944
    .line 2945
    .line 2946
    .line 2947
    :pswitch_data_8
    .packed-switch 0xa
        :pswitch_66
        :pswitch_67
        :pswitch_65
        :pswitch_64
    .end packed-switch

    .line 2948
    .line 2949
    .line 2950
    .line 2951
    .line 2952
    .line 2953
    .line 2954
    .line 2955
    .line 2956
    .line 2957
    .line 2958
    .line 2959
    :pswitch_data_9
    .packed-switch 0x14
        :pswitch_63
        :pswitch_62
        :pswitch_61
    .end packed-switch

    .line 2960
    .line 2961
    .line 2962
    .line 2963
    .line 2964
    .line 2965
    .line 2966
    .line 2967
    .line 2968
    .line 2969
    :pswitch_data_a
    .packed-switch 0x1e
        :pswitch_60
        :pswitch_5f
        :pswitch_5e
    .end packed-switch

    .line 2970
    .line 2971
    .line 2972
    .line 2973
    .line 2974
    .line 2975
    .line 2976
    .line 2977
    .line 2978
    .line 2979
    :pswitch_data_b
    .packed-switch 0x28
        :pswitch_5d
        :pswitch_5c
        :pswitch_5b
    .end packed-switch

    .line 2980
    .line 2981
    .line 2982
    .line 2983
    .line 2984
    .line 2985
    .line 2986
    .line 2987
    .line 2988
    .line 2989
    :pswitch_data_c
    .packed-switch 0x32
        :pswitch_5a
        :pswitch_59
        :pswitch_58
    .end packed-switch

    .line 2990
    .line 2991
    .line 2992
    .line 2993
    .line 2994
    .line 2995
    .line 2996
    .line 2997
    .line 2998
    .line 2999
    :pswitch_data_d
    .packed-switch 0x0
        :pswitch_71
        :pswitch_70
        :pswitch_6f
        :pswitch_6e
        :pswitch_6d
        :pswitch_6c
        :pswitch_6b
        :pswitch_6a
        :pswitch_69
    .end packed-switch
.end method

.method public static zzg(Ljava/lang/String;[Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzi;)Lcom/google/android/gms/internal/ads/zzdq;
    .locals 10

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    const-string v2, "CodecSpecificDataUtil"

    .line 4
    .line 5
    const-string v3, "Ignoring malformed HEVC codec string: "

    .line 6
    .line 7
    const/4 v4, 0x4

    .line 8
    if-ge v0, v4, :cond_0

    .line 9
    .line 10
    invoke-static {p0, v3, v2}, Lcb/a;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-object v1

    .line 14
    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/ads/zzdr;->zzd:Ljava/util/regex/Pattern;

    .line 15
    .line 16
    const/4 v5, 0x1

    .line 17
    aget-object v6, p1, v5

    .line 18
    .line 19
    invoke-virtual {v0, v6}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    if-nez v6, :cond_1

    .line 28
    .line 29
    invoke-static {p0, v3, v2}, Lcb/a;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-object v1

    .line 33
    :cond_1
    invoke-virtual {v0, v5}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    const-string v0, "1"

    .line 38
    .line 39
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    const/16 v3, 0x1000

    .line 44
    .line 45
    const/4 v6, 0x6

    .line 46
    const/4 v7, 0x2

    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    move p0, v5

    .line 50
    goto :goto_0

    .line 51
    :cond_2
    const-string v0, "2"

    .line 52
    .line 53
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_6

    .line 58
    .line 59
    if-eqz p2, :cond_3

    .line 60
    .line 61
    iget p0, p2, Lcom/google/android/gms/internal/ads/zzi;->zzd:I

    .line 62
    .line 63
    if-ne p0, v6, :cond_3

    .line 64
    .line 65
    move p0, v3

    .line 66
    goto :goto_0

    .line 67
    :cond_3
    move p0, v7

    .line 68
    :goto_0
    const/4 p2, 0x3

    .line 69
    aget-object p1, p1, p2

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    const/16 v8, 0x10

    .line 76
    .line 77
    const/16 v9, 0x8

    .line 78
    .line 79
    sparse-switch v0, :sswitch_data_0

    .line 80
    .line 81
    .line 82
    goto/16 :goto_1

    .line 83
    .line 84
    :sswitch_0
    const-string p2, "L186"

    .line 85
    .line 86
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result p2

    .line 90
    if-eqz p2, :cond_4

    .line 91
    .line 92
    const/16 v6, 0xc

    .line 93
    .line 94
    goto/16 :goto_2

    .line 95
    .line 96
    :sswitch_1
    const-string p2, "L183"

    .line 97
    .line 98
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result p2

    .line 102
    if-eqz p2, :cond_4

    .line 103
    .line 104
    const/16 v6, 0xb

    .line 105
    .line 106
    goto/16 :goto_2

    .line 107
    .line 108
    :sswitch_2
    const-string p2, "L180"

    .line 109
    .line 110
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result p2

    .line 114
    if-eqz p2, :cond_4

    .line 115
    .line 116
    const/16 v6, 0xa

    .line 117
    .line 118
    goto/16 :goto_2

    .line 119
    .line 120
    :sswitch_3
    const-string p2, "L156"

    .line 121
    .line 122
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result p2

    .line 126
    if-eqz p2, :cond_4

    .line 127
    .line 128
    const/16 v6, 0x9

    .line 129
    .line 130
    goto/16 :goto_2

    .line 131
    .line 132
    :sswitch_4
    const-string p2, "L153"

    .line 133
    .line 134
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result p2

    .line 138
    if-eqz p2, :cond_4

    .line 139
    .line 140
    move v6, v9

    .line 141
    goto/16 :goto_2

    .line 142
    .line 143
    :sswitch_5
    const-string p2, "L150"

    .line 144
    .line 145
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result p2

    .line 149
    if-eqz p2, :cond_4

    .line 150
    .line 151
    const/4 v6, 0x7

    .line 152
    goto/16 :goto_2

    .line 153
    .line 154
    :sswitch_6
    const-string p2, "L123"

    .line 155
    .line 156
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result p2

    .line 160
    if-eqz p2, :cond_4

    .line 161
    .line 162
    goto/16 :goto_2

    .line 163
    .line 164
    :sswitch_7
    const-string p2, "L120"

    .line 165
    .line 166
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result p2

    .line 170
    if-eqz p2, :cond_4

    .line 171
    .line 172
    const/4 v6, 0x5

    .line 173
    goto/16 :goto_2

    .line 174
    .line 175
    :sswitch_8
    const-string p2, "H186"

    .line 176
    .line 177
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result p2

    .line 181
    if-eqz p2, :cond_4

    .line 182
    .line 183
    const/16 v6, 0x19

    .line 184
    .line 185
    goto/16 :goto_2

    .line 186
    .line 187
    :sswitch_9
    const-string p2, "H183"

    .line 188
    .line 189
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result p2

    .line 193
    if-eqz p2, :cond_4

    .line 194
    .line 195
    const/16 v6, 0x18

    .line 196
    .line 197
    goto/16 :goto_2

    .line 198
    .line 199
    :sswitch_a
    const-string p2, "H180"

    .line 200
    .line 201
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result p2

    .line 205
    if-eqz p2, :cond_4

    .line 206
    .line 207
    const/16 v6, 0x17

    .line 208
    .line 209
    goto/16 :goto_2

    .line 210
    .line 211
    :sswitch_b
    const-string p2, "H156"

    .line 212
    .line 213
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    move-result p2

    .line 217
    if-eqz p2, :cond_4

    .line 218
    .line 219
    const/16 v6, 0x16

    .line 220
    .line 221
    goto/16 :goto_2

    .line 222
    .line 223
    :sswitch_c
    const-string p2, "H153"

    .line 224
    .line 225
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result p2

    .line 229
    if-eqz p2, :cond_4

    .line 230
    .line 231
    const/16 v6, 0x15

    .line 232
    .line 233
    goto/16 :goto_2

    .line 234
    .line 235
    :sswitch_d
    const-string p2, "H150"

    .line 236
    .line 237
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result p2

    .line 241
    if-eqz p2, :cond_4

    .line 242
    .line 243
    const/16 v6, 0x14

    .line 244
    .line 245
    goto/16 :goto_2

    .line 246
    .line 247
    :sswitch_e
    const-string p2, "H123"

    .line 248
    .line 249
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    move-result p2

    .line 253
    if-eqz p2, :cond_4

    .line 254
    .line 255
    const/16 v6, 0x13

    .line 256
    .line 257
    goto/16 :goto_2

    .line 258
    .line 259
    :sswitch_f
    const-string p2, "H120"

    .line 260
    .line 261
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result p2

    .line 265
    if-eqz p2, :cond_4

    .line 266
    .line 267
    const/16 v6, 0x12

    .line 268
    .line 269
    goto/16 :goto_2

    .line 270
    .line 271
    :sswitch_10
    const-string p2, "L93"

    .line 272
    .line 273
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    move-result p2

    .line 277
    if-eqz p2, :cond_4

    .line 278
    .line 279
    move v6, v4

    .line 280
    goto/16 :goto_2

    .line 281
    .line 282
    :sswitch_11
    const-string v0, "L90"

    .line 283
    .line 284
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    move-result v0

    .line 288
    if-eqz v0, :cond_4

    .line 289
    .line 290
    move v6, p2

    .line 291
    goto :goto_2

    .line 292
    :sswitch_12
    const-string p2, "L63"

    .line 293
    .line 294
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 295
    .line 296
    .line 297
    move-result p2

    .line 298
    if-eqz p2, :cond_4

    .line 299
    .line 300
    move v6, v7

    .line 301
    goto :goto_2

    .line 302
    :sswitch_13
    const-string p2, "L60"

    .line 303
    .line 304
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    move-result p2

    .line 308
    if-eqz p2, :cond_4

    .line 309
    .line 310
    move v6, v5

    .line 311
    goto :goto_2

    .line 312
    :sswitch_14
    const-string p2, "L30"

    .line 313
    .line 314
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 315
    .line 316
    .line 317
    move-result p2

    .line 318
    if-eqz p2, :cond_4

    .line 319
    .line 320
    const/4 v6, 0x0

    .line 321
    goto :goto_2

    .line 322
    :sswitch_15
    const-string p2, "H93"

    .line 323
    .line 324
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 325
    .line 326
    .line 327
    move-result p2

    .line 328
    if-eqz p2, :cond_4

    .line 329
    .line 330
    const/16 v6, 0x11

    .line 331
    .line 332
    goto :goto_2

    .line 333
    :sswitch_16
    const-string p2, "H90"

    .line 334
    .line 335
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 336
    .line 337
    .line 338
    move-result p2

    .line 339
    if-eqz p2, :cond_4

    .line 340
    .line 341
    move v6, v8

    .line 342
    goto :goto_2

    .line 343
    :sswitch_17
    const-string p2, "H63"

    .line 344
    .line 345
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 346
    .line 347
    .line 348
    move-result p2

    .line 349
    if-eqz p2, :cond_4

    .line 350
    .line 351
    const/16 v6, 0xf

    .line 352
    .line 353
    goto :goto_2

    .line 354
    :sswitch_18
    const-string p2, "H60"

    .line 355
    .line 356
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 357
    .line 358
    .line 359
    move-result p2

    .line 360
    if-eqz p2, :cond_4

    .line 361
    .line 362
    const/16 v6, 0xe

    .line 363
    .line 364
    goto :goto_2

    .line 365
    :sswitch_19
    const-string p2, "H30"

    .line 366
    .line 367
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    move-result p2

    .line 371
    if-eqz p2, :cond_4

    .line 372
    .line 373
    const/16 v6, 0xd

    .line 374
    .line 375
    goto :goto_2

    .line 376
    :cond_4
    :goto_1
    const/4 v6, -0x1

    .line 377
    :goto_2
    packed-switch v6, :pswitch_data_0

    .line 378
    .line 379
    .line 380
    goto/16 :goto_3

    .line 381
    .line 382
    :pswitch_0
    const/high16 p2, 0x2000000

    .line 383
    .line 384
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 385
    .line 386
    .line 387
    move-result-object v1

    .line 388
    goto/16 :goto_3

    .line 389
    .line 390
    :pswitch_1
    const/high16 p2, 0x800000

    .line 391
    .line 392
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 393
    .line 394
    .line 395
    move-result-object v1

    .line 396
    goto/16 :goto_3

    .line 397
    .line 398
    :pswitch_2
    const/high16 p2, 0x200000

    .line 399
    .line 400
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 401
    .line 402
    .line 403
    move-result-object v1

    .line 404
    goto/16 :goto_3

    .line 405
    .line 406
    :pswitch_3
    const/high16 p2, 0x80000

    .line 407
    .line 408
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 409
    .line 410
    .line 411
    move-result-object v1

    .line 412
    goto/16 :goto_3

    .line 413
    .line 414
    :pswitch_4
    const/high16 p2, 0x20000

    .line 415
    .line 416
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 417
    .line 418
    .line 419
    move-result-object v1

    .line 420
    goto/16 :goto_3

    .line 421
    .line 422
    :pswitch_5
    const p2, 0x8000

    .line 423
    .line 424
    .line 425
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 426
    .line 427
    .line 428
    move-result-object v1

    .line 429
    goto/16 :goto_3

    .line 430
    .line 431
    :pswitch_6
    const/16 p2, 0x2000

    .line 432
    .line 433
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 434
    .line 435
    .line 436
    move-result-object v1

    .line 437
    goto/16 :goto_3

    .line 438
    .line 439
    :pswitch_7
    const/16 p2, 0x800

    .line 440
    .line 441
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 442
    .line 443
    .line 444
    move-result-object v1

    .line 445
    goto/16 :goto_3

    .line 446
    .line 447
    :pswitch_8
    const/16 p2, 0x200

    .line 448
    .line 449
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 450
    .line 451
    .line 452
    move-result-object v1

    .line 453
    goto/16 :goto_3

    .line 454
    .line 455
    :pswitch_9
    const/16 p2, 0x80

    .line 456
    .line 457
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 458
    .line 459
    .line 460
    move-result-object v1

    .line 461
    goto/16 :goto_3

    .line 462
    .line 463
    :pswitch_a
    const/16 p2, 0x20

    .line 464
    .line 465
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 466
    .line 467
    .line 468
    move-result-object v1

    .line 469
    goto :goto_3

    .line 470
    :pswitch_b
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 471
    .line 472
    .line 473
    move-result-object v1

    .line 474
    goto :goto_3

    .line 475
    :pswitch_c
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 476
    .line 477
    .line 478
    move-result-object v1

    .line 479
    goto :goto_3

    .line 480
    :pswitch_d
    const/high16 p2, 0x1000000

    .line 481
    .line 482
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 483
    .line 484
    .line 485
    move-result-object v1

    .line 486
    goto :goto_3

    .line 487
    :pswitch_e
    const/high16 p2, 0x400000

    .line 488
    .line 489
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 490
    .line 491
    .line 492
    move-result-object v1

    .line 493
    goto :goto_3

    .line 494
    :pswitch_f
    const/high16 p2, 0x100000

    .line 495
    .line 496
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 497
    .line 498
    .line 499
    move-result-object v1

    .line 500
    goto :goto_3

    .line 501
    :pswitch_10
    const/high16 p2, 0x40000

    .line 502
    .line 503
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 504
    .line 505
    .line 506
    move-result-object v1

    .line 507
    goto :goto_3

    .line 508
    :pswitch_11
    const/high16 p2, 0x10000

    .line 509
    .line 510
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 511
    .line 512
    .line 513
    move-result-object v1

    .line 514
    goto :goto_3

    .line 515
    :pswitch_12
    const/16 p2, 0x4000

    .line 516
    .line 517
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 518
    .line 519
    .line 520
    move-result-object v1

    .line 521
    goto :goto_3

    .line 522
    :pswitch_13
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 523
    .line 524
    .line 525
    move-result-object v1

    .line 526
    goto :goto_3

    .line 527
    :pswitch_14
    const/16 p2, 0x400

    .line 528
    .line 529
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 530
    .line 531
    .line 532
    move-result-object v1

    .line 533
    goto :goto_3

    .line 534
    :pswitch_15
    const/16 p2, 0x100

    .line 535
    .line 536
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 537
    .line 538
    .line 539
    move-result-object v1

    .line 540
    goto :goto_3

    .line 541
    :pswitch_16
    const/16 p2, 0x40

    .line 542
    .line 543
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 544
    .line 545
    .line 546
    move-result-object v1

    .line 547
    goto :goto_3

    .line 548
    :pswitch_17
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 549
    .line 550
    .line 551
    move-result-object v1

    .line 552
    goto :goto_3

    .line 553
    :pswitch_18
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 554
    .line 555
    .line 556
    move-result-object v1

    .line 557
    goto :goto_3

    .line 558
    :pswitch_19
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 559
    .line 560
    .line 561
    move-result-object v1

    .line 562
    :goto_3
    if-nez v1, :cond_5

    .line 563
    .line 564
    const-string p0, "Unknown HEVC level string: "

    .line 565
    .line 566
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 567
    .line 568
    .line 569
    move-result-object p0

    .line 570
    invoke-static {v2, p0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 571
    .line 572
    .line 573
    sget-object p0, Lcom/google/android/gms/internal/ads/zzdq;->zza:Lcom/google/android/gms/internal/ads/zzdq;

    .line 574
    .line 575
    return-object p0

    .line 576
    :cond_5
    new-instance p1, Lcom/google/android/gms/internal/ads/zzdq;

    .line 577
    .line 578
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 579
    .line 580
    .line 581
    move-result p2

    .line 582
    invoke-direct {p1, p0, p2}, Lcom/google/android/gms/internal/ads/zzdq;-><init>(II)V

    .line 583
    .line 584
    .line 585
    return-object p1

    .line 586
    :cond_6
    const-string p1, "Unknown HEVC profile string: "

    .line 587
    .line 588
    invoke-static {p0, p1, v2}, Lcb/a;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 589
    .line 590
    .line 591
    sget-object p0, Lcom/google/android/gms/internal/ads/zzdq;->zza:Lcom/google/android/gms/internal/ads/zzdq;

    .line 592
    .line 593
    return-object p0

    .line 594
    nop

    .line 595
    :sswitch_data_0
    .sparse-switch
        0x114a5 -> :sswitch_19
        0x11502 -> :sswitch_18
        0x11505 -> :sswitch_17
        0x1155f -> :sswitch_16
        0x11562 -> :sswitch_15
        0x123a9 -> :sswitch_14
        0x12406 -> :sswitch_13
        0x12409 -> :sswitch_12
        0x12463 -> :sswitch_11
        0x12466 -> :sswitch_10
        0x2178e7 -> :sswitch_f
        0x2178ea -> :sswitch_e
        0x217944 -> :sswitch_d
        0x217947 -> :sswitch_c
        0x21794a -> :sswitch_b
        0x2179a1 -> :sswitch_a
        0x2179a4 -> :sswitch_9
        0x2179a7 -> :sswitch_8
        0x234a63 -> :sswitch_7
        0x234a66 -> :sswitch_6
        0x234ac0 -> :sswitch_5
        0x234ac3 -> :sswitch_4
        0x234ac6 -> :sswitch_3
        0x234b1d -> :sswitch_2
        0x234b20 -> :sswitch_1
        0x234b23 -> :sswitch_0
    .end sparse-switch

    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
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
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static zzh([BII)[B
    .locals 4

    .line 1
    add-int/lit8 v0, p2, 0x4

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    sget-object v1, Lcom/google/android/gms/internal/ads/zzdr;->zzb:[B

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x4

    .line 9
    invoke-static {v1, v2, v0, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 10
    .line 11
    .line 12
    invoke-static {p0, p1, v0, v3, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method private static zzi(II)I
    .locals 7

    .line 1
    const/16 v0, 0x17

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x1

    .line 6
    const/4 v4, -0x1

    .line 7
    const-string v5, "CodecSpecificDataUtil"

    .line 8
    .line 9
    const-string v6, "Unrecognized APV band: "

    .line 10
    .line 11
    sparse-switch p0, :sswitch_data_0

    .line 12
    .line 13
    .line 14
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    new-instance v0, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    add-int/lit8 p1, p1, 0x1e

    .line 25
    .line 26
    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 27
    .line 28
    .line 29
    const-string p1, "Unrecognized APV level index: "

    .line 30
    .line 31
    invoke-static {v0, p1, p0, v5}, Lcb/a;->v(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return v4

    .line 35
    :sswitch_0
    if-eqz p1, :cond_3

    .line 36
    .line 37
    if-eq p1, v3, :cond_2

    .line 38
    .line 39
    if-eq p1, v2, :cond_1

    .line 40
    .line 41
    if-eq p1, v1, :cond_0

    .line 42
    .line 43
    invoke-static {p1, v0}, LA7/p0;->f(II)I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    invoke-static {p0, p1, v6, v5}, Lcb/a;->o(IILjava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return v4

    .line 51
    :cond_0
    const p0, 0x200008

    .line 52
    .line 53
    .line 54
    return p0

    .line 55
    :cond_1
    const p0, 0x200004

    .line 56
    .line 57
    .line 58
    return p0

    .line 59
    :cond_2
    const p0, 0x200002

    .line 60
    .line 61
    .line 62
    return p0

    .line 63
    :cond_3
    const p0, 0x200001

    .line 64
    .line 65
    .line 66
    return p0

    .line 67
    :sswitch_1
    if-eqz p1, :cond_7

    .line 68
    .line 69
    if-eq p1, v3, :cond_6

    .line 70
    .line 71
    if-eq p1, v2, :cond_5

    .line 72
    .line 73
    if-eq p1, v1, :cond_4

    .line 74
    .line 75
    invoke-static {p1, v0}, LA7/p0;->f(II)I

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    invoke-static {p0, p1, v6, v5}, Lcb/a;->o(IILjava/lang/String;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    return v4

    .line 83
    :cond_4
    const p0, 0x100008

    .line 84
    .line 85
    .line 86
    return p0

    .line 87
    :cond_5
    const p0, 0x100004

    .line 88
    .line 89
    .line 90
    return p0

    .line 91
    :cond_6
    const p0, 0x100002

    .line 92
    .line 93
    .line 94
    return p0

    .line 95
    :cond_7
    const p0, 0x100001

    .line 96
    .line 97
    .line 98
    return p0

    .line 99
    :sswitch_2
    if-eqz p1, :cond_b

    .line 100
    .line 101
    if-eq p1, v3, :cond_a

    .line 102
    .line 103
    if-eq p1, v2, :cond_9

    .line 104
    .line 105
    if-eq p1, v1, :cond_8

    .line 106
    .line 107
    invoke-static {p1, v0}, LA7/p0;->f(II)I

    .line 108
    .line 109
    .line 110
    move-result p0

    .line 111
    invoke-static {p0, p1, v6, v5}, Lcb/a;->o(IILjava/lang/String;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    return v4

    .line 115
    :cond_8
    const p0, 0x80008

    .line 116
    .line 117
    .line 118
    return p0

    .line 119
    :cond_9
    const p0, 0x80004

    .line 120
    .line 121
    .line 122
    return p0

    .line 123
    :cond_a
    const p0, 0x80002

    .line 124
    .line 125
    .line 126
    return p0

    .line 127
    :cond_b
    const p0, 0x80001

    .line 128
    .line 129
    .line 130
    return p0

    .line 131
    :sswitch_3
    if-eqz p1, :cond_f

    .line 132
    .line 133
    if-eq p1, v3, :cond_e

    .line 134
    .line 135
    if-eq p1, v2, :cond_d

    .line 136
    .line 137
    if-eq p1, v1, :cond_c

    .line 138
    .line 139
    invoke-static {p1, v0}, LA7/p0;->f(II)I

    .line 140
    .line 141
    .line 142
    move-result p0

    .line 143
    invoke-static {p0, p1, v6, v5}, Lcb/a;->o(IILjava/lang/String;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    return v4

    .line 147
    :cond_c
    const p0, 0x40008

    .line 148
    .line 149
    .line 150
    return p0

    .line 151
    :cond_d
    const p0, 0x40004

    .line 152
    .line 153
    .line 154
    return p0

    .line 155
    :cond_e
    const p0, 0x40002

    .line 156
    .line 157
    .line 158
    return p0

    .line 159
    :cond_f
    const p0, 0x40001

    .line 160
    .line 161
    .line 162
    return p0

    .line 163
    :sswitch_4
    if-eqz p1, :cond_13

    .line 164
    .line 165
    if-eq p1, v3, :cond_12

    .line 166
    .line 167
    if-eq p1, v2, :cond_11

    .line 168
    .line 169
    if-eq p1, v1, :cond_10

    .line 170
    .line 171
    invoke-static {p1, v0}, LA7/p0;->f(II)I

    .line 172
    .line 173
    .line 174
    move-result p0

    .line 175
    invoke-static {p0, p1, v6, v5}, Lcb/a;->o(IILjava/lang/String;Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    return v4

    .line 179
    :cond_10
    const p0, 0x20008

    .line 180
    .line 181
    .line 182
    return p0

    .line 183
    :cond_11
    const p0, 0x20004

    .line 184
    .line 185
    .line 186
    return p0

    .line 187
    :cond_12
    const p0, 0x20002

    .line 188
    .line 189
    .line 190
    return p0

    .line 191
    :cond_13
    const p0, 0x20001

    .line 192
    .line 193
    .line 194
    return p0

    .line 195
    :sswitch_5
    if-eqz p1, :cond_17

    .line 196
    .line 197
    if-eq p1, v3, :cond_16

    .line 198
    .line 199
    if-eq p1, v2, :cond_15

    .line 200
    .line 201
    if-eq p1, v1, :cond_14

    .line 202
    .line 203
    invoke-static {p1, v0}, LA7/p0;->f(II)I

    .line 204
    .line 205
    .line 206
    move-result p0

    .line 207
    invoke-static {p0, p1, v6, v5}, Lcb/a;->o(IILjava/lang/String;Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    return v4

    .line 211
    :cond_14
    const p0, 0x10008

    .line 212
    .line 213
    .line 214
    return p0

    .line 215
    :cond_15
    const p0, 0x10004

    .line 216
    .line 217
    .line 218
    return p0

    .line 219
    :cond_16
    const p0, 0x10002

    .line 220
    .line 221
    .line 222
    return p0

    .line 223
    :cond_17
    const p0, 0x10001

    .line 224
    .line 225
    .line 226
    return p0

    .line 227
    :sswitch_6
    if-eqz p1, :cond_1b

    .line 228
    .line 229
    if-eq p1, v3, :cond_1a

    .line 230
    .line 231
    if-eq p1, v2, :cond_19

    .line 232
    .line 233
    if-eq p1, v1, :cond_18

    .line 234
    .line 235
    invoke-static {p1, v0}, LA7/p0;->f(II)I

    .line 236
    .line 237
    .line 238
    move-result p0

    .line 239
    invoke-static {p0, p1, v6, v5}, Lcb/a;->o(IILjava/lang/String;Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    return v4

    .line 243
    :cond_18
    const p0, 0x8008

    .line 244
    .line 245
    .line 246
    return p0

    .line 247
    :cond_19
    const p0, 0x8004

    .line 248
    .line 249
    .line 250
    return p0

    .line 251
    :cond_1a
    const p0, 0x8002

    .line 252
    .line 253
    .line 254
    return p0

    .line 255
    :cond_1b
    const p0, 0x8001

    .line 256
    .line 257
    .line 258
    return p0

    .line 259
    :sswitch_7
    if-eqz p1, :cond_1f

    .line 260
    .line 261
    if-eq p1, v3, :cond_1e

    .line 262
    .line 263
    if-eq p1, v2, :cond_1d

    .line 264
    .line 265
    if-eq p1, v1, :cond_1c

    .line 266
    .line 267
    invoke-static {p1, v0}, LA7/p0;->f(II)I

    .line 268
    .line 269
    .line 270
    move-result p0

    .line 271
    invoke-static {p0, p1, v6, v5}, Lcb/a;->o(IILjava/lang/String;Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    return v4

    .line 275
    :cond_1c
    const/16 p0, 0x4008

    .line 276
    .line 277
    return p0

    .line 278
    :cond_1d
    const/16 p0, 0x4004

    .line 279
    .line 280
    return p0

    .line 281
    :cond_1e
    const/16 p0, 0x4002

    .line 282
    .line 283
    return p0

    .line 284
    :cond_1f
    const/16 p0, 0x4001

    .line 285
    .line 286
    return p0

    .line 287
    :sswitch_8
    if-eqz p1, :cond_23

    .line 288
    .line 289
    if-eq p1, v3, :cond_22

    .line 290
    .line 291
    if-eq p1, v2, :cond_21

    .line 292
    .line 293
    if-eq p1, v1, :cond_20

    .line 294
    .line 295
    invoke-static {p1, v0}, LA7/p0;->f(II)I

    .line 296
    .line 297
    .line 298
    move-result p0

    .line 299
    invoke-static {p0, p1, v6, v5}, Lcb/a;->o(IILjava/lang/String;Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    return v4

    .line 303
    :cond_20
    const/16 p0, 0x2008

    .line 304
    .line 305
    return p0

    .line 306
    :cond_21
    const/16 p0, 0x2004

    .line 307
    .line 308
    return p0

    .line 309
    :cond_22
    const/16 p0, 0x2002

    .line 310
    .line 311
    return p0

    .line 312
    :cond_23
    const/16 p0, 0x2001

    .line 313
    .line 314
    return p0

    .line 315
    :sswitch_9
    if-eqz p1, :cond_27

    .line 316
    .line 317
    if-eq p1, v3, :cond_26

    .line 318
    .line 319
    if-eq p1, v2, :cond_25

    .line 320
    .line 321
    if-eq p1, v1, :cond_24

    .line 322
    .line 323
    invoke-static {p1, v0}, LA7/p0;->f(II)I

    .line 324
    .line 325
    .line 326
    move-result p0

    .line 327
    invoke-static {p0, p1, v6, v5}, Lcb/a;->o(IILjava/lang/String;Ljava/lang/String;)V

    .line 328
    .line 329
    .line 330
    return v4

    .line 331
    :cond_24
    const/16 p0, 0x1008

    .line 332
    .line 333
    return p0

    .line 334
    :cond_25
    const/16 p0, 0x1004

    .line 335
    .line 336
    return p0

    .line 337
    :cond_26
    const/16 p0, 0x1002

    .line 338
    .line 339
    return p0

    .line 340
    :cond_27
    const/16 p0, 0x1001

    .line 341
    .line 342
    return p0

    .line 343
    :sswitch_a
    if-eqz p1, :cond_2b

    .line 344
    .line 345
    if-eq p1, v3, :cond_2a

    .line 346
    .line 347
    if-eq p1, v2, :cond_29

    .line 348
    .line 349
    if-eq p1, v1, :cond_28

    .line 350
    .line 351
    invoke-static {p1, v0}, LA7/p0;->f(II)I

    .line 352
    .line 353
    .line 354
    move-result p0

    .line 355
    invoke-static {p0, p1, v6, v5}, Lcb/a;->o(IILjava/lang/String;Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    return v4

    .line 359
    :cond_28
    const/16 p0, 0x808

    .line 360
    .line 361
    return p0

    .line 362
    :cond_29
    const/16 p0, 0x804

    .line 363
    .line 364
    return p0

    .line 365
    :cond_2a
    const/16 p0, 0x802

    .line 366
    .line 367
    return p0

    .line 368
    :cond_2b
    const/16 p0, 0x801

    .line 369
    .line 370
    return p0

    .line 371
    :sswitch_b
    if-eqz p1, :cond_2f

    .line 372
    .line 373
    if-eq p1, v3, :cond_2e

    .line 374
    .line 375
    if-eq p1, v2, :cond_2d

    .line 376
    .line 377
    if-eq p1, v1, :cond_2c

    .line 378
    .line 379
    invoke-static {p1, v0}, LA7/p0;->f(II)I

    .line 380
    .line 381
    .line 382
    move-result p0

    .line 383
    invoke-static {p0, p1, v6, v5}, Lcb/a;->o(IILjava/lang/String;Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    return v4

    .line 387
    :cond_2c
    const/16 p0, 0x408

    .line 388
    .line 389
    return p0

    .line 390
    :cond_2d
    const/16 p0, 0x404

    .line 391
    .line 392
    return p0

    .line 393
    :cond_2e
    const/16 p0, 0x402

    .line 394
    .line 395
    return p0

    .line 396
    :cond_2f
    const/16 p0, 0x401

    .line 397
    .line 398
    return p0

    .line 399
    :sswitch_c
    if-eqz p1, :cond_33

    .line 400
    .line 401
    if-eq p1, v3, :cond_32

    .line 402
    .line 403
    if-eq p1, v2, :cond_31

    .line 404
    .line 405
    if-eq p1, v1, :cond_30

    .line 406
    .line 407
    invoke-static {p1, v0}, LA7/p0;->f(II)I

    .line 408
    .line 409
    .line 410
    move-result p0

    .line 411
    invoke-static {p0, p1, v6, v5}, Lcb/a;->o(IILjava/lang/String;Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    return v4

    .line 415
    :cond_30
    const/16 p0, 0x208

    .line 416
    .line 417
    return p0

    .line 418
    :cond_31
    const/16 p0, 0x204

    .line 419
    .line 420
    return p0

    .line 421
    :cond_32
    const/16 p0, 0x202

    .line 422
    .line 423
    return p0

    .line 424
    :cond_33
    const/16 p0, 0x201

    .line 425
    .line 426
    return p0

    .line 427
    :sswitch_d
    if-eqz p1, :cond_37

    .line 428
    .line 429
    if-eq p1, v3, :cond_36

    .line 430
    .line 431
    if-eq p1, v2, :cond_35

    .line 432
    .line 433
    if-eq p1, v1, :cond_34

    .line 434
    .line 435
    invoke-static {p1, v0}, LA7/p0;->f(II)I

    .line 436
    .line 437
    .line 438
    move-result p0

    .line 439
    invoke-static {p0, p1, v6, v5}, Lcb/a;->o(IILjava/lang/String;Ljava/lang/String;)V

    .line 440
    .line 441
    .line 442
    return v4

    .line 443
    :cond_34
    const/16 p0, 0x108

    .line 444
    .line 445
    return p0

    .line 446
    :cond_35
    const/16 p0, 0x104

    .line 447
    .line 448
    return p0

    .line 449
    :cond_36
    const/16 p0, 0x102

    .line 450
    .line 451
    return p0

    .line 452
    :cond_37
    const/16 p0, 0x101

    .line 453
    .line 454
    return p0

    .line 455
    :sswitch_data_0
    .sparse-switch
        0x1e -> :sswitch_d
        0x21 -> :sswitch_c
        0x3c -> :sswitch_b
        0x3f -> :sswitch_a
        0x5a -> :sswitch_9
        0x5d -> :sswitch_8
        0x78 -> :sswitch_7
        0x7b -> :sswitch_6
        0x96 -> :sswitch_5
        0x99 -> :sswitch_4
        0xb4 -> :sswitch_3
        0xb7 -> :sswitch_2
        0xd2 -> :sswitch_1
        0xd5 -> :sswitch_0
    .end sparse-switch
.end method
