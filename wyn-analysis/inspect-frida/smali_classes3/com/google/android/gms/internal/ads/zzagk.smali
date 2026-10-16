.class public final Lcom/google/android/gms/internal/ads/zzagk;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static zza(Lcom/google/android/gms/internal/ads/zzagb;Z)Lcom/google/android/gms/internal/ads/zzap;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    move-object p1, v0

    .line 5
    goto :goto_0

    .line 6
    :cond_0
    sget-object p1, Lcom/google/android/gms/internal/ads/zzajr;->zza:Lcom/google/android/gms/internal/ads/zzajo;

    .line 7
    .line 8
    :goto_0
    new-instance v1, Lcom/google/android/gms/internal/ads/zzagv;

    .line 9
    .line 10
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzagv;-><init>()V

    .line 11
    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-virtual {v1, p0, p1, v2}, Lcom/google/android/gms/internal/ads/zzagv;->zza(Lcom/google/android/gms/internal/ads/zzagb;Lcom/google/android/gms/internal/ads/zzajo;I)Lcom/google/android/gms/internal/ads/zzap;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    if-eqz p0, :cond_2

    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzap;->zza()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-nez p1, :cond_1

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    return-object p0

    .line 28
    :cond_2
    :goto_1
    return-object v0
.end method

.method public static zzb(Lcom/google/android/gms/internal/ads/zzagb;Lcom/google/android/gms/internal/ads/zzagj;)Z
    .locals 20
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzagb;->zzl()V

    .line 6
    .line 7
    .line 8
    new-instance v2, Lcom/google/android/gms/internal/ads/zzet;

    .line 9
    .line 10
    const/4 v3, 0x4

    .line 11
    new-array v4, v3, [B

    .line 12
    .line 13
    invoke-direct {v2, v4, v3}, Lcom/google/android/gms/internal/ads/zzet;-><init>([BI)V

    .line 14
    .line 15
    .line 16
    iget-object v4, v2, Lcom/google/android/gms/internal/ads/zzet;->zza:[B

    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    invoke-interface {v0, v4, v5, v3}, Lcom/google/android/gms/internal/ads/zzagb;->zzi([BII)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    const/4 v6, 0x7

    .line 27
    invoke-virtual {v2, v6}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    const/16 v7, 0x18

    .line 32
    .line 33
    invoke-virtual {v2, v7}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    add-int/2addr v2, v3

    .line 38
    if-nez v6, :cond_0

    .line 39
    .line 40
    const/16 v2, 0x26

    .line 41
    .line 42
    new-array v6, v2, [B

    .line 43
    .line 44
    invoke-interface {v0, v6, v5, v2}, Lcom/google/android/gms/internal/ads/zzagb;->zzc([BII)V

    .line 45
    .line 46
    .line 47
    new-instance v0, Lcom/google/android/gms/internal/ads/zzagn;

    .line 48
    .line 49
    invoke-direct {v0, v6, v3}, Lcom/google/android/gms/internal/ads/zzagn;-><init>([BI)V

    .line 50
    .line 51
    .line 52
    iput-object v0, v1, Lcom/google/android/gms/internal/ads/zzagj;->zza:Lcom/google/android/gms/internal/ads/zzagn;

    .line 53
    .line 54
    return v4

    .line 55
    :cond_0
    iget-object v7, v1, Lcom/google/android/gms/internal/ads/zzagj;->zza:Lcom/google/android/gms/internal/ads/zzagn;

    .line 56
    .line 57
    if-eqz v7, :cond_4

    .line 58
    .line 59
    const/4 v8, 0x3

    .line 60
    if-ne v6, v8, :cond_1

    .line 61
    .line 62
    new-instance v3, Lcom/google/android/gms/internal/ads/zzeu;

    .line 63
    .line 64
    invoke-direct {v3, v2}, Lcom/google/android/gms/internal/ads/zzeu;-><init>(I)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    invoke-interface {v0, v6, v5, v2}, Lcom/google/android/gms/internal/ads/zzagb;->zzc([BII)V

    .line 72
    .line 73
    .line 74
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzagk;->zzc(Lcom/google/android/gms/internal/ads/zzeu;)Lcom/google/android/gms/internal/ads/zzagm;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-virtual {v7, v0}, Lcom/google/android/gms/internal/ads/zzagn;->zze(Lcom/google/android/gms/internal/ads/zzagm;)Lcom/google/android/gms/internal/ads/zzagn;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    iput-object v0, v1, Lcom/google/android/gms/internal/ads/zzagj;->zza:Lcom/google/android/gms/internal/ads/zzagn;

    .line 83
    .line 84
    return v4

    .line 85
    :cond_1
    if-ne v6, v3, :cond_2

    .line 86
    .line 87
    new-instance v6, Lcom/google/android/gms/internal/ads/zzeu;

    .line 88
    .line 89
    invoke-direct {v6, v2}, Lcom/google/android/gms/internal/ads/zzeu;-><init>(I)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 93
    .line 94
    .line 95
    move-result-object v8

    .line 96
    invoke-interface {v0, v8, v5, v2}, Lcom/google/android/gms/internal/ads/zzagb;->zzc([BII)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v6, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 100
    .line 101
    .line 102
    invoke-static {v6, v5, v5}, Lcom/google/android/gms/internal/ads/zzhg;->zzb(Lcom/google/android/gms/internal/ads/zzeu;ZZ)Lcom/google/android/gms/internal/ads/zzhd;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzhd;->zza:[Ljava/lang/String;

    .line 107
    .line 108
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaho;->zzb(Ljava/util/List;)Lcom/google/android/gms/internal/ads/zzap;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {v7, v0}, Lcom/google/android/gms/internal/ads/zzagn;->zzd(Lcom/google/android/gms/internal/ads/zzap;)Lcom/google/android/gms/internal/ads/zzap;

    .line 117
    .line 118
    .line 119
    move-result-object v19

    .line 120
    iget v9, v7, Lcom/google/android/gms/internal/ads/zzagn;->zza:I

    .line 121
    .line 122
    iget v10, v7, Lcom/google/android/gms/internal/ads/zzagn;->zzb:I

    .line 123
    .line 124
    iget v11, v7, Lcom/google/android/gms/internal/ads/zzagn;->zzc:I

    .line 125
    .line 126
    iget v12, v7, Lcom/google/android/gms/internal/ads/zzagn;->zzd:I

    .line 127
    .line 128
    iget v13, v7, Lcom/google/android/gms/internal/ads/zzagn;->zze:I

    .line 129
    .line 130
    iget v14, v7, Lcom/google/android/gms/internal/ads/zzagn;->zzg:I

    .line 131
    .line 132
    iget v15, v7, Lcom/google/android/gms/internal/ads/zzagn;->zzh:I

    .line 133
    .line 134
    iget-wide v2, v7, Lcom/google/android/gms/internal/ads/zzagn;->zzj:J

    .line 135
    .line 136
    iget-object v0, v7, Lcom/google/android/gms/internal/ads/zzagn;->zzk:Lcom/google/android/gms/internal/ads/zzagm;

    .line 137
    .line 138
    new-instance v8, Lcom/google/android/gms/internal/ads/zzagn;

    .line 139
    .line 140
    move-object/from16 v18, v0

    .line 141
    .line 142
    move-wide/from16 v16, v2

    .line 143
    .line 144
    invoke-direct/range {v8 .. v19}, Lcom/google/android/gms/internal/ads/zzagn;-><init>(IIIIIIIJLcom/google/android/gms/internal/ads/zzagm;Lcom/google/android/gms/internal/ads/zzap;)V

    .line 145
    .line 146
    .line 147
    iput-object v8, v1, Lcom/google/android/gms/internal/ads/zzagj;->zza:Lcom/google/android/gms/internal/ads/zzagn;

    .line 148
    .line 149
    return v4

    .line 150
    :cond_2
    const/4 v8, 0x6

    .line 151
    if-ne v6, v8, :cond_3

    .line 152
    .line 153
    new-instance v6, Lcom/google/android/gms/internal/ads/zzeu;

    .line 154
    .line 155
    invoke-direct {v6, v2}, Lcom/google/android/gms/internal/ads/zzeu;-><init>(I)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 159
    .line 160
    .line 161
    move-result-object v8

    .line 162
    invoke-interface {v0, v8, v5, v2}, Lcom/google/android/gms/internal/ads/zzagb;->zzc([BII)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v6, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 166
    .line 167
    .line 168
    invoke-static {v6}, Lcom/google/android/gms/internal/ads/zzajg;->zzb(Lcom/google/android/gms/internal/ads/zzeu;)Lcom/google/android/gms/internal/ads/zzajg;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgwt;->zzj(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzgwt;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    new-instance v2, Lcom/google/android/gms/internal/ads/zzap;

    .line 177
    .line 178
    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/ads/zzap;-><init>(Ljava/util/List;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v7, v2}, Lcom/google/android/gms/internal/ads/zzagn;->zzd(Lcom/google/android/gms/internal/ads/zzap;)Lcom/google/android/gms/internal/ads/zzap;

    .line 182
    .line 183
    .line 184
    move-result-object v19

    .line 185
    iget v9, v7, Lcom/google/android/gms/internal/ads/zzagn;->zza:I

    .line 186
    .line 187
    iget v10, v7, Lcom/google/android/gms/internal/ads/zzagn;->zzb:I

    .line 188
    .line 189
    iget v11, v7, Lcom/google/android/gms/internal/ads/zzagn;->zzc:I

    .line 190
    .line 191
    iget v12, v7, Lcom/google/android/gms/internal/ads/zzagn;->zzd:I

    .line 192
    .line 193
    iget v13, v7, Lcom/google/android/gms/internal/ads/zzagn;->zze:I

    .line 194
    .line 195
    iget v14, v7, Lcom/google/android/gms/internal/ads/zzagn;->zzg:I

    .line 196
    .line 197
    iget v15, v7, Lcom/google/android/gms/internal/ads/zzagn;->zzh:I

    .line 198
    .line 199
    iget-wide v2, v7, Lcom/google/android/gms/internal/ads/zzagn;->zzj:J

    .line 200
    .line 201
    iget-object v0, v7, Lcom/google/android/gms/internal/ads/zzagn;->zzk:Lcom/google/android/gms/internal/ads/zzagm;

    .line 202
    .line 203
    new-instance v8, Lcom/google/android/gms/internal/ads/zzagn;

    .line 204
    .line 205
    move-object/from16 v18, v0

    .line 206
    .line 207
    move-wide/from16 v16, v2

    .line 208
    .line 209
    invoke-direct/range {v8 .. v19}, Lcom/google/android/gms/internal/ads/zzagn;-><init>(IIIIIIIJLcom/google/android/gms/internal/ads/zzagm;Lcom/google/android/gms/internal/ads/zzap;)V

    .line 210
    .line 211
    .line 212
    iput-object v8, v1, Lcom/google/android/gms/internal/ads/zzagj;->zza:Lcom/google/android/gms/internal/ads/zzagn;

    .line 213
    .line 214
    return v4

    .line 215
    :cond_3
    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/ads/zzagb;->zzf(I)V

    .line 216
    .line 217
    .line 218
    return v4

    .line 219
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 220
    .line 221
    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 222
    .line 223
    .line 224
    throw v0
.end method

.method public static zzc(Lcom/google/android/gms/internal/ads/zzeu;)Lcom/google/android/gms/internal/ads/zzagm;
    .locals 12

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzx()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzg()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    int-to-long v1, v1

    .line 14
    int-to-long v3, v0

    .line 15
    div-int/lit8 v0, v0, 0x12

    .line 16
    .line 17
    new-array v5, v0, [J

    .line 18
    .line 19
    new-array v6, v0, [J

    .line 20
    .line 21
    const/4 v7, 0x0

    .line 22
    :goto_0
    if-ge v7, v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzD()J

    .line 25
    .line 26
    .line 27
    move-result-wide v8

    .line 28
    const-wide/16 v10, -0x1

    .line 29
    .line 30
    cmp-long v10, v8, v10

    .line 31
    .line 32
    if-nez v10, :cond_0

    .line 33
    .line 34
    invoke-static {v5, v7}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    invoke-static {v6, v7}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    goto :goto_1

    .line 43
    :cond_0
    aput-wide v8, v5, v7

    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzD()J

    .line 46
    .line 47
    .line 48
    move-result-wide v8

    .line 49
    aput-wide v8, v6, v7

    .line 50
    .line 51
    const/4 v8, 0x2

    .line 52
    invoke-virtual {p0, v8}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 53
    .line 54
    .line 55
    add-int/lit8 v7, v7, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    :goto_1
    add-long/2addr v1, v3

    .line 59
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzg()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    int-to-long v3, v0

    .line 64
    sub-long/2addr v1, v3

    .line 65
    long-to-int v0, v1

    .line 66
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 67
    .line 68
    .line 69
    new-instance p0, Lcom/google/android/gms/internal/ads/zzagm;

    .line 70
    .line 71
    invoke-direct {p0, v5, v6}, Lcom/google/android/gms/internal/ads/zzagm;-><init>([J[J)V

    .line 72
    .line 73
    .line 74
    return-object p0
.end method
