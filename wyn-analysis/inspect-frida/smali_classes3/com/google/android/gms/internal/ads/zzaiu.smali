.class final Lcom/google/android/gms/internal/ads/zzaiu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzaga;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzeu;

.field private zzb:Lcom/google/android/gms/internal/ads/zzagd;

.field private zzc:I

.field private zzd:I

.field private zze:I

.field private zzf:J

.field private zzg:Lcom/google/android/gms/internal/ads/zzajb;

.field private zzh:Lcom/google/android/gms/internal/ads/zzagb;

.field private zzi:Lcom/google/android/gms/internal/ads/zzahi;

.field private zzj:Lcom/google/android/gms/internal/ads/zzami;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/google/android/gms/internal/ads/zzeu;

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzeu;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaiu;->zza:Lcom/google/android/gms/internal/ads/zzeu;

    .line 11
    .line 12
    const-wide/16 v0, -0x1

    .line 13
    .line 14
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzaiu;->zzf:J

    .line 15
    .line 16
    return-void
.end method

.method private final zzh(Lcom/google/android/gms/internal/ads/zzagb;)I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaiu;->zza:Lcom/google/android/gms/internal/ads/zzeu;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzeu;->zza(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-interface {p1, v2, v3, v1}, Lcom/google/android/gms/internal/ads/zzagb;->zzi([BII)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzt()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1
.end method

.method private final zzi(Lcom/google/android/gms/internal/ads/zzagb;)I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaiu;->zza:Lcom/google/android/gms/internal/ads/zzeu;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzeu;->zza(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-interface {p1, v2, v3, v1}, Lcom/google/android/gms/internal/ads/zzagb;->zzi([BII)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzt()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    add-int/lit8 p1, p1, -0x2

    .line 20
    .line 21
    return p1
.end method

.method private final zzj()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaiu;->zzb:Lcom/google/android/gms/internal/ads/zzagd;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzagd;->zzv()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaiu;->zzb:Lcom/google/android/gms/internal/ads/zzagd;

    .line 10
    .line 11
    new-instance v1, Lcom/google/android/gms/internal/ads/zzahc;

    .line 12
    .line 13
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    const-wide/16 v4, 0x0

    .line 19
    .line 20
    invoke-direct {v1, v2, v3, v4, v5}, Lcom/google/android/gms/internal/ads/zzahc;-><init>(JJ)V

    .line 21
    .line 22
    .line 23
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzagd;->zzw(Lcom/google/android/gms/internal/ads/zzahd;)V

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x6

    .line 27
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzaiu;->zzc:I

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzagb;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzaiu;->zzh(Lcom/google/android/gms/internal/ads/zzagb;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const v1, 0xffd8

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-ne v0, v1, :cond_4

    .line 10
    .line 11
    :cond_0
    :goto_0
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzaiu;->zzh(Lcom/google/android/gms/internal/ads/zzagb;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzaiu;->zzd:I

    .line 16
    .line 17
    const v1, 0xffda

    .line 18
    .line 19
    .line 20
    if-ne v0, v1, :cond_1

    .line 21
    .line 22
    goto :goto_2

    .line 23
    :cond_1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzaiu;->zzi(Lcom/google/android/gms/internal/ads/zzagb;)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-ltz v0, :cond_4

    .line 28
    .line 29
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzaiu;->zzd:I

    .line 30
    .line 31
    const v3, 0xffe1

    .line 32
    .line 33
    .line 34
    if-eq v1, v3, :cond_2

    .line 35
    .line 36
    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/zzagb;->zzk(I)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzaiu;->zza:Lcom/google/android/gms/internal/ads/zzeu;

    .line 41
    .line 42
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzeu;->zza(I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-interface {p1, v3, v2, v0}, Lcom/google/android/gms/internal/ads/zzagb;->zzi([BII)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzM(C)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    const-string v3, "http://ns.adobe.com/xap/1.0/"

    .line 57
    .line 58
    invoke-static {v0, v3}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-nez v0, :cond_3

    .line 63
    .line 64
    move v0, v2

    .line 65
    goto :goto_1

    .line 66
    :cond_3
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzM(C)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaix;->zzb(Ljava/lang/String;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    :goto_1
    if-eqz v0, :cond_0

    .line 75
    .line 76
    const/4 p1, 0x1

    .line 77
    return p1

    .line 78
    :cond_4
    :goto_2
    return v2
.end method

.method public final synthetic zzb()Ljava/util/List;
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/f;->a(Lcom/google/android/gms/internal/ads/zzaga;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final zzc(Lcom/google/android/gms/internal/ads/zzagd;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaiu;->zzb:Lcom/google/android/gms/internal/ads/zzagd;

    return-void
.end method

.method public final zzd(Lcom/google/android/gms/internal/ads/zzagb;Lcom/google/android/gms/internal/ads/zzaha;)I
    .locals 27
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
    move-object/from16 v2, p2

    .line 6
    .line 7
    const/4 v3, -0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x1

    .line 10
    iget v6, v0, Lcom/google/android/gms/internal/ads/zzaiu;->zzc:I

    .line 11
    .line 12
    const/4 v7, 0x4

    .line 13
    const/4 v8, 0x2

    .line 14
    const-wide/16 v9, -0x1

    .line 15
    .line 16
    if-eqz v6, :cond_1a

    .line 17
    .line 18
    if-eq v6, v5, :cond_19

    .line 19
    .line 20
    if-eq v6, v8, :cond_a

    .line 21
    .line 22
    const/4 v8, 0x5

    .line 23
    if-eq v6, v7, :cond_5

    .line 24
    .line 25
    if-eq v6, v8, :cond_1

    .line 26
    .line 27
    const/4 v1, 0x6

    .line 28
    if-ne v6, v1, :cond_0

    .line 29
    .line 30
    return v3

    .line 31
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 32
    .line 33
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 34
    .line 35
    .line 36
    throw v1

    .line 37
    :cond_1
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzaiu;->zzi:Lcom/google/android/gms/internal/ads/zzahi;

    .line 38
    .line 39
    if-eqz v3, :cond_2

    .line 40
    .line 41
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzaiu;->zzh:Lcom/google/android/gms/internal/ads/zzagb;

    .line 42
    .line 43
    if-eq v1, v3, :cond_3

    .line 44
    .line 45
    :cond_2
    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzaiu;->zzh:Lcom/google/android/gms/internal/ads/zzagb;

    .line 46
    .line 47
    new-instance v3, Lcom/google/android/gms/internal/ads/zzahi;

    .line 48
    .line 49
    iget-wide v6, v0, Lcom/google/android/gms/internal/ads/zzaiu;->zzf:J

    .line 50
    .line 51
    invoke-direct {v3, v1, v6, v7}, Lcom/google/android/gms/internal/ads/zzahi;-><init>(Lcom/google/android/gms/internal/ads/zzagb;J)V

    .line 52
    .line 53
    .line 54
    iput-object v3, v0, Lcom/google/android/gms/internal/ads/zzaiu;->zzi:Lcom/google/android/gms/internal/ads/zzahi;

    .line 55
    .line 56
    :cond_3
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzaiu;->zzj:Lcom/google/android/gms/internal/ads/zzami;

    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzaiu;->zzi:Lcom/google/android/gms/internal/ads/zzahi;

    .line 62
    .line 63
    invoke-virtual {v1, v3, v2}, Lcom/google/android/gms/internal/ads/zzami;->zzd(Lcom/google/android/gms/internal/ads/zzagb;Lcom/google/android/gms/internal/ads/zzaha;)I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-ne v1, v5, :cond_4

    .line 68
    .line 69
    iget-wide v3, v2, Lcom/google/android/gms/internal/ads/zzaha;->zza:J

    .line 70
    .line 71
    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/zzaiu;->zzf:J

    .line 72
    .line 73
    add-long/2addr v3, v5

    .line 74
    iput-wide v3, v2, Lcom/google/android/gms/internal/ads/zzaha;->zza:J

    .line 75
    .line 76
    :cond_4
    return v1

    .line 77
    :cond_5
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzagb;->zzn()J

    .line 78
    .line 79
    .line 80
    move-result-wide v9

    .line 81
    iget-wide v11, v0, Lcom/google/android/gms/internal/ads/zzaiu;->zzf:J

    .line 82
    .line 83
    cmp-long v3, v9, v11

    .line 84
    .line 85
    if-nez v3, :cond_9

    .line 86
    .line 87
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzaiu;->zza:Lcom/google/android/gms/internal/ads/zzeu;

    .line 88
    .line 89
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-interface {v1, v2, v4, v5, v5}, Lcom/google/android/gms/internal/ads/zzagb;->zzh([BIIZ)Z

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    if-nez v2, :cond_6

    .line 98
    .line 99
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzaiu;->zzj()V

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_6
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzagb;->zzl()V

    .line 104
    .line 105
    .line 106
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzaiu;->zzj:Lcom/google/android/gms/internal/ads/zzami;

    .line 107
    .line 108
    if-nez v2, :cond_7

    .line 109
    .line 110
    new-instance v2, Lcom/google/android/gms/internal/ads/zzami;

    .line 111
    .line 112
    sget-object v3, Lcom/google/android/gms/internal/ads/zzanq;->zza:Lcom/google/android/gms/internal/ads/zzanq;

    .line 113
    .line 114
    const/16 v6, 0x8

    .line 115
    .line 116
    invoke-direct {v2, v3, v6}, Lcom/google/android/gms/internal/ads/zzami;-><init>(Lcom/google/android/gms/internal/ads/zzanq;I)V

    .line 117
    .line 118
    .line 119
    iput-object v2, v0, Lcom/google/android/gms/internal/ads/zzaiu;->zzj:Lcom/google/android/gms/internal/ads/zzami;

    .line 120
    .line 121
    :cond_7
    new-instance v2, Lcom/google/android/gms/internal/ads/zzahi;

    .line 122
    .line 123
    iget-wide v9, v0, Lcom/google/android/gms/internal/ads/zzaiu;->zzf:J

    .line 124
    .line 125
    invoke-direct {v2, v1, v9, v10}, Lcom/google/android/gms/internal/ads/zzahi;-><init>(Lcom/google/android/gms/internal/ads/zzagb;J)V

    .line 126
    .line 127
    .line 128
    iput-object v2, v0, Lcom/google/android/gms/internal/ads/zzaiu;->zzi:Lcom/google/android/gms/internal/ads/zzahi;

    .line 129
    .line 130
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzaiu;->zzj:Lcom/google/android/gms/internal/ads/zzami;

    .line 131
    .line 132
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzami;->zza(Lcom/google/android/gms/internal/ads/zzagb;)Z

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    if-eqz v1, :cond_8

    .line 137
    .line 138
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzaiu;->zzj:Lcom/google/android/gms/internal/ads/zzami;

    .line 139
    .line 140
    new-instance v2, Lcom/google/android/gms/internal/ads/zzahk;

    .line 141
    .line 142
    iget-wide v9, v0, Lcom/google/android/gms/internal/ads/zzaiu;->zzf:J

    .line 143
    .line 144
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzaiu;->zzb:Lcom/google/android/gms/internal/ads/zzagd;

    .line 145
    .line 146
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    invoke-direct {v2, v9, v10, v3}, Lcom/google/android/gms/internal/ads/zzahk;-><init>(JLcom/google/android/gms/internal/ads/zzagd;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzami;->zzc(Lcom/google/android/gms/internal/ads/zzagd;)V

    .line 153
    .line 154
    .line 155
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzaiu;->zzg:Lcom/google/android/gms/internal/ads/zzajb;

    .line 156
    .line 157
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzaiu;->zzb:Lcom/google/android/gms/internal/ads/zzagd;

    .line 161
    .line 162
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    const/16 v3, 0x400

    .line 166
    .line 167
    invoke-interface {v2, v3, v7}, Lcom/google/android/gms/internal/ads/zzagd;->zzs(II)Lcom/google/android/gms/internal/ads/zzahm;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    new-instance v3, Lcom/google/android/gms/internal/ads/zzt;

    .line 172
    .line 173
    invoke-direct {v3}, Lcom/google/android/gms/internal/ads/zzt;-><init>()V

    .line 174
    .line 175
    .line 176
    const-string v6, "image/jpeg"

    .line 177
    .line 178
    invoke-virtual {v3, v6}, Lcom/google/android/gms/internal/ads/zzt;->zzn(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 179
    .line 180
    .line 181
    new-instance v6, Lcom/google/android/gms/internal/ads/zzap;

    .line 182
    .line 183
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    new-array v5, v5, [Lcom/google/android/gms/internal/ads/zzao;

    .line 189
    .line 190
    aput-object v1, v5, v4

    .line 191
    .line 192
    invoke-direct {v6, v9, v10, v5}, Lcom/google/android/gms/internal/ads/zzap;-><init>(J[Lcom/google/android/gms/internal/ads/zzao;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v3, v6}, Lcom/google/android/gms/internal/ads/zzt;->zzl(Lcom/google/android/gms/internal/ads/zzap;)Lcom/google/android/gms/internal/ads/zzt;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzt;->zzP()Lcom/google/android/gms/internal/ads/zzv;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    invoke-interface {v2, v1}, Lcom/google/android/gms/internal/ads/zzahm;->zzA(Lcom/google/android/gms/internal/ads/zzv;)V

    .line 203
    .line 204
    .line 205
    iput v8, v0, Lcom/google/android/gms/internal/ads/zzaiu;->zzc:I

    .line 206
    .line 207
    goto :goto_0

    .line 208
    :cond_8
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzaiu;->zzj()V

    .line 209
    .line 210
    .line 211
    :goto_0
    return v4

    .line 212
    :cond_9
    iput-wide v11, v2, Lcom/google/android/gms/internal/ads/zzaha;->zza:J

    .line 213
    .line 214
    return v5

    .line 215
    :cond_a
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzaiu;->zzd:I

    .line 216
    .line 217
    const v6, 0xffe1

    .line 218
    .line 219
    .line 220
    if-ne v2, v6, :cond_17

    .line 221
    .line 222
    new-instance v2, Lcom/google/android/gms/internal/ads/zzeu;

    .line 223
    .line 224
    iget v6, v0, Lcom/google/android/gms/internal/ads/zzaiu;->zze:I

    .line 225
    .line 226
    invoke-direct {v2, v6}, Lcom/google/android/gms/internal/ads/zzeu;-><init>(I)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 230
    .line 231
    .line 232
    move-result-object v6

    .line 233
    iget v7, v0, Lcom/google/android/gms/internal/ads/zzaiu;->zze:I

    .line 234
    .line 235
    invoke-interface {v1, v6, v4, v7}, Lcom/google/android/gms/internal/ads/zzagb;->zzc([BII)V

    .line 236
    .line 237
    .line 238
    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzaiu;->zzg:Lcom/google/android/gms/internal/ads/zzajb;

    .line 239
    .line 240
    if-nez v6, :cond_18

    .line 241
    .line 242
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/zzeu;->zzM(C)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v6

    .line 246
    const-string v7, "http://ns.adobe.com/xap/1.0/"

    .line 247
    .line 248
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    move-result v6

    .line 252
    if-eqz v6, :cond_18

    .line 253
    .line 254
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/zzeu;->zzM(C)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    if-eqz v2, :cond_18

    .line 259
    .line 260
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzagb;->zzo()J

    .line 261
    .line 262
    .line 263
    move-result-wide v6

    .line 264
    cmp-long v1, v6, v9

    .line 265
    .line 266
    const/4 v11, 0x0

    .line 267
    if-nez v1, :cond_b

    .line 268
    .line 269
    goto/16 :goto_5

    .line 270
    .line 271
    :cond_b
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzaix;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzaiw;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    if-nez v1, :cond_c

    .line 276
    .line 277
    goto/16 :goto_5

    .line 278
    .line 279
    :cond_c
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzaiw;->zzb:Ljava/util/List;

    .line 280
    .line 281
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 282
    .line 283
    .line 284
    move-result v12

    .line 285
    if-ge v12, v8, :cond_d

    .line 286
    .line 287
    goto/16 :goto_5

    .line 288
    .line 289
    :cond_d
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 290
    .line 291
    .line 292
    move-result v8

    .line 293
    add-int/2addr v8, v3

    .line 294
    move-wide v13, v9

    .line 295
    move-wide v15, v13

    .line 296
    move-wide/from16 v19, v15

    .line 297
    .line 298
    move-wide/from16 v21, v19

    .line 299
    .line 300
    :goto_1
    if-ltz v8, :cond_14

    .line 301
    .line 302
    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v12

    .line 306
    check-cast v12, Lcom/google/android/gms/internal/ads/zzaiv;

    .line 307
    .line 308
    move/from16 v17, v3

    .line 309
    .line 310
    iget-object v3, v12, Lcom/google/android/gms/internal/ads/zzaiv;->zza:Ljava/lang/String;

    .line 311
    .line 312
    move-wide/from16 v23, v9

    .line 313
    .line 314
    const-string v9, "video/mp4"

    .line 315
    .line 316
    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 317
    .line 318
    .line 319
    move-result v9

    .line 320
    if-nez v9, :cond_e

    .line 321
    .line 322
    const-string v9, "video/quicktime"

    .line 323
    .line 324
    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 325
    .line 326
    .line 327
    move-result v3

    .line 328
    if-eqz v3, :cond_f

    .line 329
    .line 330
    :cond_e
    move v3, v5

    .line 331
    goto :goto_2

    .line 332
    :cond_f
    move v3, v4

    .line 333
    :goto_2
    if-nez v8, :cond_10

    .line 334
    .line 335
    iget-wide v9, v12, Lcom/google/android/gms/internal/ads/zzaiv;->zzc:J

    .line 336
    .line 337
    sub-long/2addr v6, v9

    .line 338
    const-wide/16 v9, 0x0

    .line 339
    .line 340
    :goto_3
    move-wide/from16 v25, v9

    .line 341
    .line 342
    move-wide v9, v6

    .line 343
    move-wide/from16 v6, v25

    .line 344
    .line 345
    goto :goto_4

    .line 346
    :cond_10
    iget-wide v9, v12, Lcom/google/android/gms/internal/ads/zzaiv;->zzb:J

    .line 347
    .line 348
    sub-long v9, v6, v9

    .line 349
    .line 350
    goto :goto_3

    .line 351
    :goto_4
    if-eqz v3, :cond_11

    .line 352
    .line 353
    cmp-long v3, v6, v9

    .line 354
    .line 355
    if-eqz v3, :cond_11

    .line 356
    .line 357
    sub-long v21, v9, v6

    .line 358
    .line 359
    move-wide/from16 v19, v6

    .line 360
    .line 361
    :cond_11
    if-nez v8, :cond_12

    .line 362
    .line 363
    move-wide v15, v9

    .line 364
    :cond_12
    if-nez v8, :cond_13

    .line 365
    .line 366
    move-wide v13, v6

    .line 367
    :cond_13
    add-int/lit8 v8, v8, -0x1

    .line 368
    .line 369
    move/from16 v3, v17

    .line 370
    .line 371
    move-wide/from16 v9, v23

    .line 372
    .line 373
    goto :goto_1

    .line 374
    :cond_14
    move-wide/from16 v23, v9

    .line 375
    .line 376
    cmp-long v2, v19, v23

    .line 377
    .line 378
    if-eqz v2, :cond_16

    .line 379
    .line 380
    cmp-long v2, v21, v23

    .line 381
    .line 382
    if-eqz v2, :cond_16

    .line 383
    .line 384
    cmp-long v2, v13, v23

    .line 385
    .line 386
    if-eqz v2, :cond_16

    .line 387
    .line 388
    cmp-long v2, v15, v23

    .line 389
    .line 390
    if-nez v2, :cond_15

    .line 391
    .line 392
    goto :goto_5

    .line 393
    :cond_15
    iget-wide v1, v1, Lcom/google/android/gms/internal/ads/zzaiw;->zza:J

    .line 394
    .line 395
    new-instance v12, Lcom/google/android/gms/internal/ads/zzajb;

    .line 396
    .line 397
    move-wide/from16 v17, v1

    .line 398
    .line 399
    invoke-direct/range {v12 .. v22}, Lcom/google/android/gms/internal/ads/zzajb;-><init>(JJJJJ)V

    .line 400
    .line 401
    .line 402
    move-object v11, v12

    .line 403
    :cond_16
    :goto_5
    iput-object v11, v0, Lcom/google/android/gms/internal/ads/zzaiu;->zzg:Lcom/google/android/gms/internal/ads/zzajb;

    .line 404
    .line 405
    if-eqz v11, :cond_18

    .line 406
    .line 407
    iget-wide v1, v11, Lcom/google/android/gms/internal/ads/zzajb;->zzd:J

    .line 408
    .line 409
    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/zzaiu;->zzf:J

    .line 410
    .line 411
    goto :goto_6

    .line 412
    :cond_17
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzaiu;->zze:I

    .line 413
    .line 414
    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/zzagb;->zzf(I)V

    .line 415
    .line 416
    .line 417
    :cond_18
    :goto_6
    iput v4, v0, Lcom/google/android/gms/internal/ads/zzaiu;->zzc:I

    .line 418
    .line 419
    return v4

    .line 420
    :cond_19
    invoke-direct/range {p0 .. p1}, Lcom/google/android/gms/internal/ads/zzaiu;->zzi(Lcom/google/android/gms/internal/ads/zzagb;)I

    .line 421
    .line 422
    .line 423
    move-result v2

    .line 424
    iput v2, v0, Lcom/google/android/gms/internal/ads/zzaiu;->zze:I

    .line 425
    .line 426
    invoke-interface {v1, v8}, Lcom/google/android/gms/internal/ads/zzagb;->zzf(I)V

    .line 427
    .line 428
    .line 429
    iput v8, v0, Lcom/google/android/gms/internal/ads/zzaiu;->zzc:I

    .line 430
    .line 431
    return v4

    .line 432
    :cond_1a
    move-wide/from16 v23, v9

    .line 433
    .line 434
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzaiu;->zza:Lcom/google/android/gms/internal/ads/zzeu;

    .line 435
    .line 436
    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/ads/zzeu;->zza(I)V

    .line 437
    .line 438
    .line 439
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 440
    .line 441
    .line 442
    move-result-object v3

    .line 443
    invoke-interface {v1, v3, v4, v8}, Lcom/google/android/gms/internal/ads/zzagb;->zzc([BII)V

    .line 444
    .line 445
    .line 446
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzt()I

    .line 447
    .line 448
    .line 449
    move-result v1

    .line 450
    iput v1, v0, Lcom/google/android/gms/internal/ads/zzaiu;->zzd:I

    .line 451
    .line 452
    const v2, 0xffda

    .line 453
    .line 454
    .line 455
    if-ne v1, v2, :cond_1c

    .line 456
    .line 457
    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzaiu;->zzf:J

    .line 458
    .line 459
    cmp-long v1, v1, v23

    .line 460
    .line 461
    if-eqz v1, :cond_1b

    .line 462
    .line 463
    iput v7, v0, Lcom/google/android/gms/internal/ads/zzaiu;->zzc:I

    .line 464
    .line 465
    goto :goto_7

    .line 466
    :cond_1b
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzaiu;->zzj()V

    .line 467
    .line 468
    .line 469
    goto :goto_7

    .line 470
    :cond_1c
    const v2, 0xffd0

    .line 471
    .line 472
    .line 473
    if-lt v1, v2, :cond_1d

    .line 474
    .line 475
    const v2, 0xffd9

    .line 476
    .line 477
    .line 478
    if-le v1, v2, :cond_1e

    .line 479
    .line 480
    :cond_1d
    const v2, 0xff01

    .line 481
    .line 482
    .line 483
    if-eq v1, v2, :cond_1e

    .line 484
    .line 485
    iput v5, v0, Lcom/google/android/gms/internal/ads/zzaiu;->zzc:I

    .line 486
    .line 487
    :cond_1e
    :goto_7
    return v4
.end method

.method public final zze(JJ)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzaiu;->zzc:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaiu;->zzj:Lcom/google/android/gms/internal/ads/zzami;

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzaiu;->zzc:I

    .line 15
    .line 16
    const/4 v1, 0x5

    .line 17
    if-ne v0, v1, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaiu;->zzj:Lcom/google/android/gms/internal/ads/zzami;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/zzami;->zze(JJ)V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
.end method

.method public final zzf()V
    .locals 0

    return-void
.end method

.method public final synthetic zzg()Lcom/google/android/gms/internal/ads/zzaga;
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/f;->b(Lcom/google/android/gms/internal/ads/zzaga;)Lcom/google/android/gms/internal/ads/zzaga;

    move-result-object v0

    return-object v0
.end method
