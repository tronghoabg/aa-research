.class public final Lcom/google/android/gms/internal/ads/zzaqn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzaqa;


# instance fields
.field private final zza:Ljava/lang/String;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzeu;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzet;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzeu;

.field private zze:I

.field private zzf:Ljava/lang/String;

.field private zzg:Lcom/google/android/gms/internal/ads/zzahm;

.field private zzh:D

.field private zzi:D

.field private zzj:Z

.field private zzk:Z

.field private zzl:I

.field private zzm:I

.field private zzn:Z

.field private zzo:I

.field private zzp:I

.field private final zzq:Lcom/google/android/gms/internal/ads/zzaqo;

.field private zzr:I

.field private zzs:I

.field private zzt:I

.field private zzu:J

.field private zzv:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string p1, "video/mp2t"

    .line 5
    .line 6
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zza:Ljava/lang/String;

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zze:I

    .line 10
    .line 11
    new-instance p1, Lcom/google/android/gms/internal/ads/zzeu;

    .line 12
    .line 13
    const/16 v0, 0xf

    .line 14
    .line 15
    new-array v0, v0, [B

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    invoke-direct {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzeu;-><init>([BI)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzb:Lcom/google/android/gms/internal/ads/zzeu;

    .line 22
    .line 23
    new-instance p1, Lcom/google/android/gms/internal/ads/zzet;

    .line 24
    .line 25
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzet;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzc:Lcom/google/android/gms/internal/ads/zzet;

    .line 29
    .line 30
    new-instance p1, Lcom/google/android/gms/internal/ads/zzeu;

    .line 31
    .line 32
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzeu;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzd:Lcom/google/android/gms/internal/ads/zzeu;

    .line 36
    .line 37
    new-instance p1, Lcom/google/android/gms/internal/ads/zzaqo;

    .line 38
    .line 39
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzaqo;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzq:Lcom/google/android/gms/internal/ads/zzaqo;

    .line 43
    .line 44
    const p1, -0x7fffffff

    .line 45
    .line 46
    .line 47
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzr:I

    .line 48
    .line 49
    const/4 p1, -0x1

    .line 50
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzs:I

    .line 51
    .line 52
    const-wide/16 v0, -0x1

    .line 53
    .line 54
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzu:J

    .line 55
    .line 56
    const/4 p1, 0x1

    .line 57
    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzk:Z

    .line 58
    .line 59
    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzn:Z

    .line 60
    .line 61
    const-wide/high16 v0, -0x3c20000000000000L    # -9.223372036854776E18

    .line 62
    .line 63
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzh:D

    .line 64
    .line 65
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzi:D

    .line 66
    .line 67
    return-void
.end method

.method private static final zzf(Lcom/google/android/gms/internal/ads/zzeu;Lcom/google/android/gms/internal/ads/zzeu;Z)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzg()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzd()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzeu;->zzd()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzeu;->zzg()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    invoke-virtual {p0, v2, v3, v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzm([BII)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 29
    .line 30
    .line 31
    if-eqz p2, :cond_0

    .line 32
    .line 33
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void
.end method


# virtual methods
.method public final zza()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zze:I

    .line 3
    .line 4
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzm:I

    .line 5
    .line 6
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzb:Lcom/google/android/gms/internal/ads/zzeu;

    .line 7
    .line 8
    const/4 v2, 0x2

    .line 9
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzeu;->zza(I)V

    .line 10
    .line 11
    .line 12
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzo:I

    .line 13
    .line 14
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzp:I

    .line 15
    .line 16
    const v1, -0x7fffffff

    .line 17
    .line 18
    .line 19
    iput v1, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzr:I

    .line 20
    .line 21
    const/4 v1, -0x1

    .line 22
    iput v1, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzs:I

    .line 23
    .line 24
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzt:I

    .line 25
    .line 26
    const-wide/16 v1, -0x1

    .line 27
    .line 28
    iput-wide v1, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzu:J

    .line 29
    .line 30
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzv:Z

    .line 31
    .line 32
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzj:Z

    .line 33
    .line 34
    const/4 v0, 0x1

    .line 35
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzn:Z

    .line 36
    .line 37
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzk:Z

    .line 38
    .line 39
    const-wide/high16 v0, -0x3c20000000000000L    # -9.223372036854776E18

    .line 40
    .line 41
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzh:D

    .line 42
    .line 43
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzi:D

    .line 44
    .line 45
    return-void
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzagd;Lcom/google/android/gms/internal/ads/zzaro;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzaro;->zza()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzaro;->zzc()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzf:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzaro;->zzb()I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    const/4 v0, 0x1

    .line 15
    invoke-interface {p1, p2, v0}, Lcom/google/android/gms/internal/ads/zzagd;->zzs(II)Lcom/google/android/gms/internal/ads/zzahm;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzg:Lcom/google/android/gms/internal/ads/zzahm;

    .line 20
    .line 21
    return-void
.end method

.method public final zzc(JI)V
    .locals 2

    iput p3, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzl:I

    iget-boolean p3, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzk:Z

    if-nez p3, :cond_1

    iget p3, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzp:I

    if-nez p3, :cond_0

    iget-boolean p3, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzn:Z

    if-nez p3, :cond_1

    :cond_0
    const/4 p3, 0x1

    iput-boolean p3, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzj:Z

    :cond_1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p3, p1, v0

    if-eqz p3, :cond_3

    iget-boolean p3, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzj:Z

    long-to-double p1, p1

    if-eqz p3, :cond_2

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzi:D

    return-void

    :cond_2
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzh:D

    :cond_3
    return-void
.end method

.method public final zzd(Lcom/google/android/gms/internal/ads/zzeu;)V
    .locals 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzat;
        }
    .end annotation

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x1

    .line 4
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzg:Lcom/google/android/gms/internal/ads/zzahm;

    .line 5
    .line 6
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzeu;->zzd()I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-lez v3, :cond_13

    .line 14
    .line 15
    iget v3, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zze:I

    .line 16
    .line 17
    if-eqz v3, :cond_f

    .line 18
    .line 19
    if-eq v3, v2, :cond_c

    .line 20
    .line 21
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzq:Lcom/google/android/gms/internal/ads/zzaqo;

    .line 22
    .line 23
    iget v4, v3, Lcom/google/android/gms/internal/ads/zzaqo;->zza:I

    .line 24
    .line 25
    const/16 v5, 0x11

    .line 26
    .line 27
    if-eq v4, v2, :cond_1

    .line 28
    .line 29
    if-ne v4, v5, :cond_2

    .line 30
    .line 31
    :cond_1
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzd:Lcom/google/android/gms/internal/ads/zzeu;

    .line 32
    .line 33
    invoke-static {p1, v4, v2}, Lcom/google/android/gms/internal/ads/zzaqn;->zzf(Lcom/google/android/gms/internal/ads/zzeu;Lcom/google/android/gms/internal/ads/zzeu;Z)V

    .line 34
    .line 35
    .line 36
    :cond_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzeu;->zzd()I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    iget v6, v3, Lcom/google/android/gms/internal/ads/zzaqo;->zzc:I

    .line 41
    .line 42
    iget v7, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzo:I

    .line 43
    .line 44
    sub-int/2addr v6, v7

    .line 45
    invoke-static {v4, v6}, Ljava/lang/Math;->min(II)I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzg:Lcom/google/android/gms/internal/ads/zzahm;

    .line 50
    .line 51
    invoke-interface {v6, p1, v4}, Lcom/google/android/gms/internal/ads/zzahm;->zzc(Lcom/google/android/gms/internal/ads/zzeu;I)V

    .line 52
    .line 53
    .line 54
    iget v6, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzo:I

    .line 55
    .line 56
    add-int/2addr v6, v4

    .line 57
    iput v6, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzo:I

    .line 58
    .line 59
    iget v4, v3, Lcom/google/android/gms/internal/ads/zzaqo;->zzc:I

    .line 60
    .line 61
    if-ne v6, v4, :cond_0

    .line 62
    .line 63
    iget v4, v3, Lcom/google/android/gms/internal/ads/zzaqo;->zza:I

    .line 64
    .line 65
    if-ne v4, v2, :cond_6

    .line 66
    .line 67
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzd:Lcom/google/android/gms/internal/ads/zzeu;

    .line 68
    .line 69
    new-instance v5, Lcom/google/android/gms/internal/ads/zzet;

    .line 70
    .line 71
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    array-length v6, v4

    .line 76
    invoke-direct {v5, v4, v6}, Lcom/google/android/gms/internal/ads/zzet;-><init>([BI)V

    .line 77
    .line 78
    .line 79
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzaqq;->zzb(Lcom/google/android/gms/internal/ads/zzet;)Lcom/google/android/gms/internal/ads/zzaqp;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    iget v5, v4, Lcom/google/android/gms/internal/ads/zzaqp;->zzb:I

    .line 84
    .line 85
    iput v5, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzr:I

    .line 86
    .line 87
    iget v5, v4, Lcom/google/android/gms/internal/ads/zzaqp;->zzc:I

    .line 88
    .line 89
    iput v5, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzs:I

    .line 90
    .line 91
    iget-wide v5, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzu:J

    .line 92
    .line 93
    iget-wide v7, v3, Lcom/google/android/gms/internal/ads/zzaqo;->zzb:J

    .line 94
    .line 95
    cmp-long v3, v5, v7

    .line 96
    .line 97
    if-eqz v3, :cond_5

    .line 98
    .line 99
    iput-wide v7, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzu:J

    .line 100
    .line 101
    iget v3, v4, Lcom/google/android/gms/internal/ads/zzaqp;->zza:I

    .line 102
    .line 103
    const/4 v5, -0x1

    .line 104
    const-string v6, "mhm1"

    .line 105
    .line 106
    if-eq v3, v5, :cond_3

    .line 107
    .line 108
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    new-array v5, v2, [Ljava/lang/Object;

    .line 113
    .line 114
    aput-object v3, v5, v1

    .line 115
    .line 116
    const-string v3, ".%02X"

    .line 117
    .line 118
    invoke-static {v3, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    invoke-virtual {v6, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v6

    .line 126
    :cond_3
    iget-object v3, v4, Lcom/google/android/gms/internal/ads/zzaqp;->zzd:[B

    .line 127
    .line 128
    const/4 v4, 0x0

    .line 129
    if-eqz v3, :cond_4

    .line 130
    .line 131
    array-length v5, v3

    .line 132
    if-lez v5, :cond_4

    .line 133
    .line 134
    sget-object v4, Lcom/google/android/gms/internal/ads/zzfm;->zzb:[B

    .line 135
    .line 136
    invoke-static {v4, v3}, Lcom/google/android/gms/internal/ads/zzgwt;->zzk(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzgwt;

    .line 137
    .line 138
    .line 139
    move-result-object v4

    .line 140
    :cond_4
    new-instance v3, Lcom/google/android/gms/internal/ads/zzt;

    .line 141
    .line 142
    invoke-direct {v3}, Lcom/google/android/gms/internal/ads/zzt;-><init>()V

    .line 143
    .line 144
    .line 145
    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzf:Ljava/lang/String;

    .line 146
    .line 147
    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/ads/zzt;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 148
    .line 149
    .line 150
    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zza:Ljava/lang/String;

    .line 151
    .line 152
    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/ads/zzt;->zzn(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 153
    .line 154
    .line 155
    const-string v5, "audio/mhm1"

    .line 156
    .line 157
    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/ads/zzt;->zzo(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 158
    .line 159
    .line 160
    iget v5, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzr:I

    .line 161
    .line 162
    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/ads/zzt;->zzI(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v3, v6}, Lcom/google/android/gms/internal/ads/zzt;->zzk(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzt;->zzr(Ljava/util/List;)Lcom/google/android/gms/internal/ads/zzt;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzt;->zzP()Lcom/google/android/gms/internal/ads/zzv;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzg:Lcom/google/android/gms/internal/ads/zzahm;

    .line 176
    .line 177
    invoke-interface {v4, v3}, Lcom/google/android/gms/internal/ads/zzahm;->zzA(Lcom/google/android/gms/internal/ads/zzv;)V

    .line 178
    .line 179
    .line 180
    :cond_5
    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzv:Z

    .line 181
    .line 182
    goto :goto_4

    .line 183
    :cond_6
    if-ne v4, v5, :cond_8

    .line 184
    .line 185
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzd:Lcom/google/android/gms/internal/ads/zzeu;

    .line 186
    .line 187
    new-instance v4, Lcom/google/android/gms/internal/ads/zzet;

    .line 188
    .line 189
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    array-length v5, v3

    .line 194
    invoke-direct {v4, v3, v5}, Lcom/google/android/gms/internal/ads/zzet;-><init>([BI)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 198
    .line 199
    .line 200
    move-result v3

    .line 201
    if-eqz v3, :cond_7

    .line 202
    .line 203
    invoke-virtual {v4, v0}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 204
    .line 205
    .line 206
    const/16 v3, 0xd

    .line 207
    .line 208
    invoke-virtual {v4, v3}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 209
    .line 210
    .line 211
    move-result v3

    .line 212
    goto :goto_1

    .line 213
    :cond_7
    move v3, v1

    .line 214
    :goto_1
    iput v3, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzt:I

    .line 215
    .line 216
    goto :goto_4

    .line 217
    :cond_8
    if-ne v4, v0, :cond_b

    .line 218
    .line 219
    iget-boolean v3, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzv:Z

    .line 220
    .line 221
    if-eqz v3, :cond_9

    .line 222
    .line 223
    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzk:Z

    .line 224
    .line 225
    move v7, v2

    .line 226
    goto :goto_2

    .line 227
    :cond_9
    move v7, v1

    .line 228
    :goto_2
    iget v3, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzs:I

    .line 229
    .line 230
    iget v4, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzt:I

    .line 231
    .line 232
    sub-int/2addr v3, v4

    .line 233
    iget v4, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzr:I

    .line 234
    .line 235
    int-to-double v4, v4

    .line 236
    iget-wide v8, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzh:D

    .line 237
    .line 238
    invoke-static {v8, v9}, Ljava/lang/Math;->round(D)J

    .line 239
    .line 240
    .line 241
    move-result-wide v8

    .line 242
    iget-boolean v6, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzj:Z

    .line 243
    .line 244
    if-eqz v6, :cond_a

    .line 245
    .line 246
    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzj:Z

    .line 247
    .line 248
    iget-wide v3, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzi:D

    .line 249
    .line 250
    iput-wide v3, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzh:D

    .line 251
    .line 252
    goto :goto_3

    .line 253
    :cond_a
    int-to-double v10, v3

    .line 254
    const-wide v12, 0x412e848000000000L    # 1000000.0

    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    mul-double/2addr v10, v12

    .line 260
    div-double/2addr v10, v4

    .line 261
    iget-wide v3, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzh:D

    .line 262
    .line 263
    add-double/2addr v3, v10

    .line 264
    iput-wide v3, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzh:D

    .line 265
    .line 266
    :goto_3
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzg:Lcom/google/android/gms/internal/ads/zzahm;

    .line 267
    .line 268
    move-wide v5, v8

    .line 269
    iget v8, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzp:I

    .line 270
    .line 271
    const/4 v9, 0x0

    .line 272
    const/4 v10, 0x0

    .line 273
    invoke-interface/range {v4 .. v10}, Lcom/google/android/gms/internal/ads/zzahm;->zze(JIIILcom/google/android/gms/internal/ads/zzahl;)V

    .line 274
    .line 275
    .line 276
    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzv:Z

    .line 277
    .line 278
    iput v1, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzt:I

    .line 279
    .line 280
    iput v1, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzp:I

    .line 281
    .line 282
    :cond_b
    :goto_4
    iput v2, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zze:I

    .line 283
    .line 284
    goto/16 :goto_0

    .line 285
    .line 286
    :cond_c
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzb:Lcom/google/android/gms/internal/ads/zzeu;

    .line 287
    .line 288
    invoke-static {p1, v3, v1}, Lcom/google/android/gms/internal/ads/zzaqn;->zzf(Lcom/google/android/gms/internal/ads/zzeu;Lcom/google/android/gms/internal/ads/zzeu;Z)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzd()I

    .line 292
    .line 293
    .line 294
    move-result v4

    .line 295
    if-nez v4, :cond_e

    .line 296
    .line 297
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzc:Lcom/google/android/gms/internal/ads/zzet;

    .line 298
    .line 299
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zze()I

    .line 300
    .line 301
    .line 302
    move-result v5

    .line 303
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 304
    .line 305
    .line 306
    move-result-object v6

    .line 307
    invoke-virtual {v4, v6, v5}, Lcom/google/android/gms/internal/ads/zzet;->zzb([BI)V

    .line 308
    .line 309
    .line 310
    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzq:Lcom/google/android/gms/internal/ads/zzaqo;

    .line 311
    .line 312
    invoke-static {v4, v6}, Lcom/google/android/gms/internal/ads/zzaqq;->zza(Lcom/google/android/gms/internal/ads/zzet;Lcom/google/android/gms/internal/ads/zzaqo;)Z

    .line 313
    .line 314
    .line 315
    move-result v4

    .line 316
    if-eqz v4, :cond_d

    .line 317
    .line 318
    iput v1, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzo:I

    .line 319
    .line 320
    iget v4, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzp:I

    .line 321
    .line 322
    iget v7, v6, Lcom/google/android/gms/internal/ads/zzaqo;->zzc:I

    .line 323
    .line 324
    add-int/2addr v7, v5

    .line 325
    add-int/2addr v7, v4

    .line 326
    iput v7, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzp:I

    .line 327
    .line 328
    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 329
    .line 330
    .line 331
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzg:Lcom/google/android/gms/internal/ads/zzahm;

    .line 332
    .line 333
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zze()I

    .line 334
    .line 335
    .line 336
    move-result v5

    .line 337
    invoke-interface {v4, v3, v5}, Lcom/google/android/gms/internal/ads/zzahm;->zzc(Lcom/google/android/gms/internal/ads/zzeu;I)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/ads/zzeu;->zza(I)V

    .line 341
    .line 342
    .line 343
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzd:Lcom/google/android/gms/internal/ads/zzeu;

    .line 344
    .line 345
    iget v4, v6, Lcom/google/android/gms/internal/ads/zzaqo;->zzc:I

    .line 346
    .line 347
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzeu;->zza(I)V

    .line 348
    .line 349
    .line 350
    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzn:Z

    .line 351
    .line 352
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zze:I

    .line 353
    .line 354
    goto/16 :goto_0

    .line 355
    .line 356
    :cond_d
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zze()I

    .line 357
    .line 358
    .line 359
    move-result v4

    .line 360
    const/16 v5, 0xf

    .line 361
    .line 362
    if-ge v4, v5, :cond_0

    .line 363
    .line 364
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zze()I

    .line 365
    .line 366
    .line 367
    move-result v4

    .line 368
    add-int/2addr v4, v2

    .line 369
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzeu;->zzf(I)V

    .line 370
    .line 371
    .line 372
    :cond_e
    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzn:Z

    .line 373
    .line 374
    goto/16 :goto_0

    .line 375
    .line 376
    :cond_f
    iget v3, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzl:I

    .line 377
    .line 378
    and-int/lit8 v4, v3, 0x2

    .line 379
    .line 380
    if-nez v4, :cond_10

    .line 381
    .line 382
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzeu;->zze()I

    .line 383
    .line 384
    .line 385
    move-result v3

    .line 386
    invoke-virtual {p1, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 387
    .line 388
    .line 389
    goto/16 :goto_0

    .line 390
    .line 391
    :cond_10
    and-int/lit8 v3, v3, 0x4

    .line 392
    .line 393
    if-nez v3, :cond_12

    .line 394
    .line 395
    :cond_11
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzeu;->zzd()I

    .line 396
    .line 397
    .line 398
    move-result v3

    .line 399
    if-lez v3, :cond_0

    .line 400
    .line 401
    iget v3, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzm:I

    .line 402
    .line 403
    shl-int/lit8 v3, v3, 0x8

    .line 404
    .line 405
    iput v3, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzm:I

    .line 406
    .line 407
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    .line 408
    .line 409
    .line 410
    move-result v4

    .line 411
    or-int/2addr v3, v4

    .line 412
    iput v3, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzm:I

    .line 413
    .line 414
    const v4, 0xffffff

    .line 415
    .line 416
    .line 417
    and-int/2addr v3, v4

    .line 418
    const v4, 0xc001a5

    .line 419
    .line 420
    .line 421
    if-ne v3, v4, :cond_11

    .line 422
    .line 423
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzeu;->zzg()I

    .line 424
    .line 425
    .line 426
    move-result v3

    .line 427
    add-int/lit8 v3, v3, -0x3

    .line 428
    .line 429
    invoke-virtual {p1, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 430
    .line 431
    .line 432
    iput v1, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zzm:I

    .line 433
    .line 434
    :cond_12
    iput v2, p0, Lcom/google/android/gms/internal/ads/zzaqn;->zze:I

    .line 435
    .line 436
    goto/16 :goto_0

    .line 437
    .line 438
    :cond_13
    return-void
.end method

.method public final zze(Z)V
    .locals 0

    return-void
.end method
