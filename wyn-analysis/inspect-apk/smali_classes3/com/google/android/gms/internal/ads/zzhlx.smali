.class final Lcom/google/android/gms/internal/ads/zzhlx;
.super Lcom/google/android/gms/internal/ads/zzibx;
.source "SourceFile"


# direct methods
.method public static final zza(Lcom/google/android/gms/internal/ads/zzico;)Lcom/google/android/gms/internal/ads/zzibr;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzico;->zzm()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p0, v0}, Lcom/google/android/gms/internal/ads/zzhlx;->zzc(Lcom/google/android/gms/internal/ads/zzico;I)Lcom/google/android/gms/internal/ads/zzibr;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-static {p0, v0}, Lcom/google/android/gms/internal/ads/zzhlx;->zzb(Lcom/google/android/gms/internal/ads/zzico;I)Lcom/google/android/gms/internal/ads/zzibr;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    new-instance v0, Ljava/util/ArrayDeque;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 19
    .line 20
    .line 21
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzico;->zzf()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_8

    .line 26
    .line 27
    instance-of v2, v1, Lcom/google/android/gms/internal/ads/zzibt;

    .line 28
    .line 29
    if-eqz v2, :cond_3

    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzico;->zzh()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzhlz;->zza(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_2

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    new-instance p0, Ljava/io/IOException;

    .line 43
    .line 44
    const-string v0, "illegal characters in string"

    .line 45
    .line 46
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p0

    .line 50
    :cond_3
    const/4 v2, 0x0

    .line 51
    :goto_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzico;->zzm()I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    invoke-static {p0, v3}, Lcom/google/android/gms/internal/ads/zzhlx;->zzc(Lcom/google/android/gms/internal/ads/zzico;I)Lcom/google/android/gms/internal/ads/zzibr;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    if-nez v4, :cond_4

    .line 60
    .line 61
    invoke-static {p0, v3}, Lcom/google/android/gms/internal/ads/zzhlx;->zzb(Lcom/google/android/gms/internal/ads/zzico;I)Lcom/google/android/gms/internal/ads/zzibr;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    goto :goto_2

    .line 66
    :cond_4
    move-object v3, v4

    .line 67
    :goto_2
    instance-of v5, v1, Lcom/google/android/gms/internal/ads/zzibq;

    .line 68
    .line 69
    if-eqz v5, :cond_5

    .line 70
    .line 71
    move-object v2, v1

    .line 72
    check-cast v2, Lcom/google/android/gms/internal/ads/zzibq;

    .line 73
    .line 74
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzibq;->zza(Lcom/google/android/gms/internal/ads/zzibr;)V

    .line 75
    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_5
    move-object v5, v1

    .line 79
    check-cast v5, Lcom/google/android/gms/internal/ads/zzibt;

    .line 80
    .line 81
    invoke-virtual {v5, v2}, Lcom/google/android/gms/internal/ads/zzibt;->zzc(Ljava/lang/String;)Z

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    if-nez v6, :cond_7

    .line 86
    .line 87
    invoke-virtual {v5, v2, v3}, Lcom/google/android/gms/internal/ads/zzibt;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzibr;)V

    .line 88
    .line 89
    .line 90
    :goto_3
    if-eqz v4, :cond_1

    .line 91
    .line 92
    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->size()I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    const/16 v2, 0x64

    .line 100
    .line 101
    if-gt v1, v2, :cond_6

    .line 102
    .line 103
    move-object v1, v3

    .line 104
    goto :goto_0

    .line 105
    :cond_6
    new-instance p0, Ljava/io/IOException;

    .line 106
    .line 107
    const-string v0, "too many recursions"

    .line 108
    .line 109
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    throw p0

    .line 113
    :cond_7
    new-instance p0, Ljava/io/IOException;

    .line 114
    .line 115
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    const-string v1, "duplicate key: "

    .line 120
    .line 121
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    throw p0

    .line 129
    :cond_8
    instance-of v2, v1, Lcom/google/android/gms/internal/ads/zzibq;

    .line 130
    .line 131
    if-eqz v2, :cond_9

    .line 132
    .line 133
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzico;->zzc()V

    .line 134
    .line 135
    .line 136
    goto :goto_4

    .line 137
    :cond_9
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzico;->zze()V

    .line 138
    .line 139
    .line 140
    :goto_4
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    if-eqz v2, :cond_a

    .line 145
    .line 146
    return-object v1

    .line 147
    :cond_a
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeLast()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    check-cast v1, Lcom/google/android/gms/internal/ads/zzibr;

    .line 152
    .line 153
    goto/16 :goto_0
.end method

.method private static final zzb(Lcom/google/android/gms/internal/ads/zzico;I)Lcom/google/android/gms/internal/ads/zzibr;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    add-int/lit8 v0, p1, -0x1

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    if-eq v0, v1, :cond_3

    .line 5
    .line 6
    const/4 v1, 0x6

    .line 7
    if-eq v0, v1, :cond_2

    .line 8
    .line 9
    const/4 v1, 0x7

    .line 10
    if-eq v0, v1, :cond_1

    .line 11
    .line 12
    const/16 v1, 0x8

    .line 13
    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzico;->zzk()V

    .line 17
    .line 18
    .line 19
    sget-object p0, Lcom/google/android/gms/internal/ads/zzibs;->zza:Lcom/google/android/gms/internal/ads/zzibs;

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzicp;->zza(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 27
    .line 28
    const-string v0, "Unexpected token: "

    .line 29
    .line 30
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p1

    .line 38
    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/ads/zzibv;

    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzico;->zzj()Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/ads/zzibv;-><init>(Ljava/lang/Boolean;)V

    .line 49
    .line 50
    .line 51
    return-object p1

    .line 52
    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzico;->zzi()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    new-instance p1, Lcom/google/android/gms/internal/ads/zzibv;

    .line 57
    .line 58
    new-instance v0, Lcom/google/android/gms/internal/ads/zzhly;

    .line 59
    .line 60
    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzhly;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/zzibv;-><init>(Ljava/lang/Number;)V

    .line 64
    .line 65
    .line 66
    return-object p1

    .line 67
    :cond_3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzico;->zzi()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzhlz;->zza(Ljava/lang/String;)Z

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    if-eqz p1, :cond_4

    .line 76
    .line 77
    new-instance p1, Lcom/google/android/gms/internal/ads/zzibv;

    .line 78
    .line 79
    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/ads/zzibv;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    return-object p1

    .line 83
    :cond_4
    new-instance p0, Ljava/io/IOException;

    .line 84
    .line 85
    const-string p1, "illegal characters in string"

    .line 86
    .line 87
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    throw p0
.end method

.method private static final zzc(Lcom/google/android/gms/internal/ads/zzico;I)Lcom/google/android/gms/internal/ads/zzibr;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    add-int/lit8 p1, p1, -0x1

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x2

    .line 6
    if-eq p1, v0, :cond_0

    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzico;->zzd()V

    .line 11
    .line 12
    .line 13
    new-instance p0, Lcom/google/android/gms/internal/ads/zzibt;

    .line 14
    .line 15
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzibt;-><init>()V

    .line 16
    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzico;->zzb()V

    .line 20
    .line 21
    .line 22
    new-instance p0, Lcom/google/android/gms/internal/ads/zzibq;

    .line 23
    .line 24
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzibq;-><init>()V

    .line 25
    .line 26
    .line 27
    return-object p0
.end method
