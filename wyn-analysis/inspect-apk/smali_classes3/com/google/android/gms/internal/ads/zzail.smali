.class public final Lcom/google/android/gms/internal/ads/zzail;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzaga;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzeu;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzeu;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzeu;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzeu;

.field private final zze:Lcom/google/android/gms/internal/ads/zzaim;

.field private zzf:Lcom/google/android/gms/internal/ads/zzagd;

.field private zzg:I

.field private zzh:Z

.field private zzi:J

.field private zzj:I

.field private zzk:I

.field private zzl:I

.field private zzm:J

.field private zzn:Z

.field private zzo:Lcom/google/android/gms/internal/ads/zzaij;

.field private zzp:Lcom/google/android/gms/internal/ads/zzaip;


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
    const/4 v1, 0x4

    .line 7
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzeu;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzail;->zza:Lcom/google/android/gms/internal/ads/zzeu;

    .line 11
    .line 12
    new-instance v0, Lcom/google/android/gms/internal/ads/zzeu;

    .line 13
    .line 14
    const/16 v1, 0x9

    .line 15
    .line 16
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzeu;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzail;->zzb:Lcom/google/android/gms/internal/ads/zzeu;

    .line 20
    .line 21
    new-instance v0, Lcom/google/android/gms/internal/ads/zzeu;

    .line 22
    .line 23
    const/16 v1, 0xb

    .line 24
    .line 25
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzeu;-><init>(I)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzail;->zzc:Lcom/google/android/gms/internal/ads/zzeu;

    .line 29
    .line 30
    new-instance v0, Lcom/google/android/gms/internal/ads/zzeu;

    .line 31
    .line 32
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzeu;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzail;->zzd:Lcom/google/android/gms/internal/ads/zzeu;

    .line 36
    .line 37
    new-instance v0, Lcom/google/android/gms/internal/ads/zzaim;

    .line 38
    .line 39
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzaim;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzail;->zze:Lcom/google/android/gms/internal/ads/zzaim;

    .line 43
    .line 44
    const/4 v0, 0x1

    .line 45
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzail;->zzg:I

    .line 46
    .line 47
    return-void
.end method

.method private final zzh(Lcom/google/android/gms/internal/ads/zzagb;)Lcom/google/android/gms/internal/ads/zzeu;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzail;->zzd:Lcom/google/android/gms/internal/ads/zzeu;

    .line 2
    .line 3
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzail;->zzl:I

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzj()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x0

    .line 10
    if-le v1, v2, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzj()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    add-int/2addr v1, v1

    .line 17
    iget v2, p0, Lcom/google/android/gms/internal/ads/zzail;->zzl:I

    .line 18
    .line 19
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    new-array v1, v1, [B

    .line 24
    .line 25
    invoke-virtual {v0, v1, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzb([BI)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 30
    .line 31
    .line 32
    :goto_0
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzail;->zzl:I

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzf(I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iget v2, p0, Lcom/google/android/gms/internal/ads/zzail;->zzl:I

    .line 42
    .line 43
    invoke-interface {p1, v1, v3, v2}, Lcom/google/android/gms/internal/ads/zzagb;->zzc([BII)V

    .line 44
    .line 45
    .line 46
    return-object v0
.end method

.method private final zzi()V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzail;->zzn:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzail;->zzf:Lcom/google/android/gms/internal/ads/zzagd;

    .line 6
    .line 7
    new-instance v1, Lcom/google/android/gms/internal/ads/zzahc;

    .line 8
    .line 9
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    const-wide/16 v4, 0x0

    .line 15
    .line 16
    invoke-direct {v1, v2, v3, v4, v5}, Lcom/google/android/gms/internal/ads/zzahc;-><init>(JJ)V

    .line 17
    .line 18
    .line 19
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzagd;->zzw(Lcom/google/android/gms/internal/ads/zzahd;)V

    .line 20
    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzail;->zzn:Z

    .line 24
    .line 25
    :cond_0
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
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzail;->zza:Lcom/google/android/gms/internal/ads/zzeu;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x3

    .line 8
    const/4 v3, 0x0

    .line 9
    invoke-interface {p1, v1, v3, v2}, Lcom/google/android/gms/internal/ads/zzagb;->zzi([BII)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzx()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const v2, 0x464c56

    .line 20
    .line 21
    .line 22
    if-eq v1, v2, :cond_0

    .line 23
    .line 24
    return v3

    .line 25
    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const/4 v2, 0x2

    .line 30
    invoke-interface {p1, v1, v3, v2}, Lcom/google/android/gms/internal/ads/zzagb;->zzi([BII)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzt()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    and-int/lit16 v1, v1, 0xfa

    .line 41
    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    return v3

    .line 45
    :cond_1
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    const/4 v2, 0x4

    .line 50
    invoke-interface {p1, v1, v3, v2}, Lcom/google/android/gms/internal/ads/zzagb;->zzi([BII)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzagb;->zzl()V

    .line 61
    .line 62
    .line 63
    invoke-interface {p1, v1}, Lcom/google/android/gms/internal/ads/zzagb;->zzk(I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-interface {p1, v1, v3, v2}, Lcom/google/android/gms/internal/ads/zzagb;->zzi([BII)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    if-nez p1, :cond_2

    .line 81
    .line 82
    const/4 p1, 0x1

    .line 83
    return p1

    .line 84
    :cond_2
    return v3
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

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzail;->zzf:Lcom/google/android/gms/internal/ads/zzagd;

    return-void
.end method

.method public final zzd(Lcom/google/android/gms/internal/ads/zzagb;Lcom/google/android/gms/internal/ads/zzaha;)I
    .locals 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    move-object v0, p1

    .line 2
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzail;->zzf:Lcom/google/android/gms/internal/ads/zzagd;

    .line 3
    .line 4
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    :cond_0
    :goto_0
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzail;->zzg:I

    .line 8
    .line 9
    const/4 v2, 0x4

    .line 10
    const/16 v3, 0x9

    .line 11
    .line 12
    const/16 v4, 0x8

    .line 13
    .line 14
    const/4 v5, 0x2

    .line 15
    const/4 v6, 0x0

    .line 16
    const/4 v7, 0x1

    .line 17
    if-eq v1, v7, :cond_e

    .line 18
    .line 19
    const/4 v8, 0x3

    .line 20
    if-eq v1, v5, :cond_d

    .line 21
    .line 22
    if-eq v1, v8, :cond_b

    .line 23
    .line 24
    if-ne v1, v2, :cond_a

    .line 25
    .line 26
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzail;->zzh:Z

    .line 27
    .line 28
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    iget-wide v12, p0, Lcom/google/android/gms/internal/ads/zzail;->zzi:J

    .line 36
    .line 37
    iget-wide v8, p0, Lcom/google/android/gms/internal/ads/zzail;->zzm:J

    .line 38
    .line 39
    add-long/2addr v12, v8

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzail;->zze:Lcom/google/android/gms/internal/ads/zzaim;

    .line 42
    .line 43
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzaim;->zzc()J

    .line 44
    .line 45
    .line 46
    move-result-wide v8

    .line 47
    cmp-long v1, v8, v10

    .line 48
    .line 49
    if-nez v1, :cond_2

    .line 50
    .line 51
    const-wide/16 v12, 0x0

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    iget-wide v12, p0, Lcom/google/android/gms/internal/ads/zzail;->zzm:J

    .line 55
    .line 56
    :goto_1
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzail;->zzk:I

    .line 57
    .line 58
    if-ne v1, v4, :cond_3

    .line 59
    .line 60
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzail;->zzo:Lcom/google/android/gms/internal/ads/zzaij;

    .line 61
    .line 62
    if-eqz v1, :cond_4

    .line 63
    .line 64
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzail;->zzi()V

    .line 65
    .line 66
    .line 67
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzail;->zzo:Lcom/google/android/gms/internal/ads/zzaij;

    .line 68
    .line 69
    invoke-direct/range {p0 .. p1}, Lcom/google/android/gms/internal/ads/zzail;->zzh(Lcom/google/android/gms/internal/ads/zzagb;)Lcom/google/android/gms/internal/ads/zzeu;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-virtual {v1, v3, v12, v13}, Lcom/google/android/gms/internal/ads/zzaio;->zzf(Lcom/google/android/gms/internal/ads/zzeu;J)Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    :goto_2
    move v3, v7

    .line 78
    goto :goto_3

    .line 79
    :cond_3
    move v4, v1

    .line 80
    :cond_4
    if-ne v4, v3, :cond_5

    .line 81
    .line 82
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzail;->zzp:Lcom/google/android/gms/internal/ads/zzaip;

    .line 83
    .line 84
    if-eqz v1, :cond_7

    .line 85
    .line 86
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzail;->zzi()V

    .line 87
    .line 88
    .line 89
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzail;->zzp:Lcom/google/android/gms/internal/ads/zzaip;

    .line 90
    .line 91
    invoke-direct/range {p0 .. p1}, Lcom/google/android/gms/internal/ads/zzail;->zzh(Lcom/google/android/gms/internal/ads/zzagb;)Lcom/google/android/gms/internal/ads/zzeu;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    invoke-virtual {v1, v3, v12, v13}, Lcom/google/android/gms/internal/ads/zzaio;->zzf(Lcom/google/android/gms/internal/ads/zzeu;J)Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    goto :goto_2

    .line 100
    :cond_5
    const/16 v1, 0x12

    .line 101
    .line 102
    if-ne v4, v1, :cond_7

    .line 103
    .line 104
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzail;->zzn:Z

    .line 105
    .line 106
    if-nez v1, :cond_7

    .line 107
    .line 108
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzail;->zze:Lcom/google/android/gms/internal/ads/zzaim;

    .line 109
    .line 110
    invoke-direct/range {p0 .. p1}, Lcom/google/android/gms/internal/ads/zzail;->zzh(Lcom/google/android/gms/internal/ads/zzagb;)Lcom/google/android/gms/internal/ads/zzeu;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    invoke-virtual {v1, v3, v12, v13}, Lcom/google/android/gms/internal/ads/zzaio;->zzf(Lcom/google/android/gms/internal/ads/zzeu;J)Z

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzaim;->zzc()J

    .line 119
    .line 120
    .line 121
    move-result-wide v8

    .line 122
    cmp-long v4, v8, v10

    .line 123
    .line 124
    if-eqz v4, :cond_6

    .line 125
    .line 126
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzail;->zzf:Lcom/google/android/gms/internal/ads/zzagd;

    .line 127
    .line 128
    new-instance v12, Lcom/google/android/gms/internal/ads/zzagw;

    .line 129
    .line 130
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzaim;->zze()[J

    .line 131
    .line 132
    .line 133
    move-result-object v13

    .line 134
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzaim;->zzd()[J

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    invoke-direct {v12, v13, v1, v8, v9}, Lcom/google/android/gms/internal/ads/zzagw;-><init>([J[JJ)V

    .line 139
    .line 140
    .line 141
    invoke-interface {v4, v12}, Lcom/google/android/gms/internal/ads/zzagd;->zzw(Lcom/google/android/gms/internal/ads/zzahd;)V

    .line 142
    .line 143
    .line 144
    iput-boolean v7, p0, Lcom/google/android/gms/internal/ads/zzail;->zzn:Z

    .line 145
    .line 146
    :cond_6
    move v1, v3

    .line 147
    goto :goto_2

    .line 148
    :cond_7
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzail;->zzl:I

    .line 149
    .line 150
    invoke-interface {p1, v1}, Lcom/google/android/gms/internal/ads/zzagb;->zzf(I)V

    .line 151
    .line 152
    .line 153
    move v1, v6

    .line 154
    move v3, v1

    .line 155
    :goto_3
    iget-boolean v4, p0, Lcom/google/android/gms/internal/ads/zzail;->zzh:Z

    .line 156
    .line 157
    if-nez v4, :cond_9

    .line 158
    .line 159
    if-eqz v1, :cond_9

    .line 160
    .line 161
    iput-boolean v7, p0, Lcom/google/android/gms/internal/ads/zzail;->zzh:Z

    .line 162
    .line 163
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzail;->zze:Lcom/google/android/gms/internal/ads/zzaim;

    .line 164
    .line 165
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzaim;->zzc()J

    .line 166
    .line 167
    .line 168
    move-result-wide v7

    .line 169
    cmp-long v1, v7, v10

    .line 170
    .line 171
    if-nez v1, :cond_8

    .line 172
    .line 173
    iget-wide v7, p0, Lcom/google/android/gms/internal/ads/zzail;->zzm:J

    .line 174
    .line 175
    neg-long v8, v7

    .line 176
    goto :goto_4

    .line 177
    :cond_8
    const-wide/16 v8, 0x0

    .line 178
    .line 179
    :goto_4
    iput-wide v8, p0, Lcom/google/android/gms/internal/ads/zzail;->zzi:J

    .line 180
    .line 181
    :cond_9
    iput v2, p0, Lcom/google/android/gms/internal/ads/zzail;->zzj:I

    .line 182
    .line 183
    iput v5, p0, Lcom/google/android/gms/internal/ads/zzail;->zzg:I

    .line 184
    .line 185
    if-eqz v3, :cond_0

    .line 186
    .line 187
    return v6

    .line 188
    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 189
    .line 190
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 191
    .line 192
    .line 193
    throw v0

    .line 194
    :cond_b
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzail;->zzc:Lcom/google/android/gms/internal/ads/zzeu;

    .line 195
    .line 196
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 197
    .line 198
    .line 199
    move-result-object v3

    .line 200
    const/16 v4, 0xb

    .line 201
    .line 202
    invoke-interface {p1, v3, v6, v4, v7}, Lcom/google/android/gms/internal/ads/zzagb;->zzb([BIIZ)Z

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    if-nez v3, :cond_c

    .line 207
    .line 208
    goto :goto_5

    .line 209
    :cond_c
    invoke-virtual {v1, v6}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    .line 213
    .line 214
    .line 215
    move-result v3

    .line 216
    iput v3, p0, Lcom/google/android/gms/internal/ads/zzail;->zzk:I

    .line 217
    .line 218
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzx()I

    .line 219
    .line 220
    .line 221
    move-result v3

    .line 222
    iput v3, p0, Lcom/google/android/gms/internal/ads/zzail;->zzl:I

    .line 223
    .line 224
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzx()I

    .line 225
    .line 226
    .line 227
    move-result v3

    .line 228
    int-to-long v3, v3

    .line 229
    iput-wide v3, p0, Lcom/google/android/gms/internal/ads/zzail;->zzm:J

    .line 230
    .line 231
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    .line 232
    .line 233
    .line 234
    move-result v3

    .line 235
    shl-int/lit8 v3, v3, 0x18

    .line 236
    .line 237
    iget-wide v4, p0, Lcom/google/android/gms/internal/ads/zzail;->zzm:J

    .line 238
    .line 239
    int-to-long v6, v3

    .line 240
    or-long/2addr v4, v6

    .line 241
    const-wide/16 v6, 0x3e8

    .line 242
    .line 243
    mul-long/2addr v4, v6

    .line 244
    iput-wide v4, p0, Lcom/google/android/gms/internal/ads/zzail;->zzm:J

    .line 245
    .line 246
    invoke-virtual {v1, v8}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 247
    .line 248
    .line 249
    iput v2, p0, Lcom/google/android/gms/internal/ads/zzail;->zzg:I

    .line 250
    .line 251
    goto/16 :goto_0

    .line 252
    .line 253
    :cond_d
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzail;->zzj:I

    .line 254
    .line 255
    invoke-interface {p1, v1}, Lcom/google/android/gms/internal/ads/zzagb;->zzf(I)V

    .line 256
    .line 257
    .line 258
    iput v6, p0, Lcom/google/android/gms/internal/ads/zzail;->zzj:I

    .line 259
    .line 260
    iput v8, p0, Lcom/google/android/gms/internal/ads/zzail;->zzg:I

    .line 261
    .line 262
    goto/16 :goto_0

    .line 263
    .line 264
    :cond_e
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzail;->zzb:Lcom/google/android/gms/internal/ads/zzeu;

    .line 265
    .line 266
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 267
    .line 268
    .line 269
    move-result-object v8

    .line 270
    invoke-interface {p1, v8, v6, v3, v7}, Lcom/google/android/gms/internal/ads/zzagb;->zzb([BIIZ)Z

    .line 271
    .line 272
    .line 273
    move-result v8

    .line 274
    if-nez v8, :cond_f

    .line 275
    .line 276
    :goto_5
    const/4 v0, -0x1

    .line 277
    return v0

    .line 278
    :cond_f
    invoke-virtual {v1, v6}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    .line 285
    .line 286
    .line 287
    move-result v2

    .line 288
    and-int/lit8 v6, v2, 0x4

    .line 289
    .line 290
    and-int/2addr v2, v7

    .line 291
    if-eqz v6, :cond_10

    .line 292
    .line 293
    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzail;->zzo:Lcom/google/android/gms/internal/ads/zzaij;

    .line 294
    .line 295
    if-nez v6, :cond_10

    .line 296
    .line 297
    new-instance v6, Lcom/google/android/gms/internal/ads/zzaij;

    .line 298
    .line 299
    iget-object v8, p0, Lcom/google/android/gms/internal/ads/zzail;->zzf:Lcom/google/android/gms/internal/ads/zzagd;

    .line 300
    .line 301
    invoke-interface {v8, v4, v7}, Lcom/google/android/gms/internal/ads/zzagd;->zzs(II)Lcom/google/android/gms/internal/ads/zzahm;

    .line 302
    .line 303
    .line 304
    move-result-object v4

    .line 305
    invoke-direct {v6, v4}, Lcom/google/android/gms/internal/ads/zzaij;-><init>(Lcom/google/android/gms/internal/ads/zzahm;)V

    .line 306
    .line 307
    .line 308
    iput-object v6, p0, Lcom/google/android/gms/internal/ads/zzail;->zzo:Lcom/google/android/gms/internal/ads/zzaij;

    .line 309
    .line 310
    :cond_10
    if-eqz v2, :cond_11

    .line 311
    .line 312
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzail;->zzp:Lcom/google/android/gms/internal/ads/zzaip;

    .line 313
    .line 314
    if-nez v2, :cond_11

    .line 315
    .line 316
    new-instance v2, Lcom/google/android/gms/internal/ads/zzaip;

    .line 317
    .line 318
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzail;->zzf:Lcom/google/android/gms/internal/ads/zzagd;

    .line 319
    .line 320
    invoke-interface {v4, v3, v5}, Lcom/google/android/gms/internal/ads/zzagd;->zzs(II)Lcom/google/android/gms/internal/ads/zzahm;

    .line 321
    .line 322
    .line 323
    move-result-object v3

    .line 324
    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/zzaip;-><init>(Lcom/google/android/gms/internal/ads/zzahm;)V

    .line 325
    .line 326
    .line 327
    iput-object v2, p0, Lcom/google/android/gms/internal/ads/zzail;->zzp:Lcom/google/android/gms/internal/ads/zzaip;

    .line 328
    .line 329
    :cond_11
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzail;->zzf:Lcom/google/android/gms/internal/ads/zzagd;

    .line 330
    .line 331
    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzagd;->zzv()V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 335
    .line 336
    .line 337
    move-result v1

    .line 338
    add-int/lit8 v1, v1, -0x5

    .line 339
    .line 340
    iput v1, p0, Lcom/google/android/gms/internal/ads/zzail;->zzj:I

    .line 341
    .line 342
    iput v5, p0, Lcom/google/android/gms/internal/ads/zzail;->zzg:I

    .line 343
    .line 344
    goto/16 :goto_0
.end method

.method public final zze(JJ)V
    .locals 0

    const-wide/16 p3, 0x0

    cmp-long p1, p1, p3

    const/4 p2, 0x0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzail;->zzg:I

    iput-boolean p2, p0, Lcom/google/android/gms/internal/ads/zzail;->zzh:Z

    goto :goto_0

    :cond_0
    const/4 p1, 0x3

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzail;->zzg:I

    :goto_0
    iput p2, p0, Lcom/google/android/gms/internal/ads/zzail;->zzj:I

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
