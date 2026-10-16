.class public final Lcom/google/android/gms/internal/ads/zzapy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzaqa;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzeu;

.field private final zzb:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final zzc:Ljava/lang/String;

.field private final zzd:I

.field private final zze:Ljava/lang/String;

.field private zzf:Ljava/lang/String;

.field private zzg:Lcom/google/android/gms/internal/ads/zzahm;

.field private zzh:I

.field private zzi:I

.field private zzj:I

.field private zzk:J

.field private zzl:Lcom/google/android/gms/internal/ads/zzv;

.field private zzm:I

.field private zzn:I

.field private zzo:I

.field private zzp:I

.field private zzq:J


# direct methods
.method public constructor <init>(Ljava/lang/String;IILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance p4, Lcom/google/android/gms/internal/ads/zzeu;

    .line 5
    .line 6
    new-array p3, p3, [B

    .line 7
    .line 8
    invoke-direct {p4, p3}, Lcom/google/android/gms/internal/ads/zzeu;-><init>([B)V

    .line 9
    .line 10
    .line 11
    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzapy;->zza:Lcom/google/android/gms/internal/ads/zzeu;

    .line 12
    .line 13
    const/4 p3, 0x0

    .line 14
    iput p3, p0, Lcom/google/android/gms/internal/ads/zzapy;->zzh:I

    .line 15
    .line 16
    const-wide p3, -0x7fffffffffffffffL    # -4.9E-324

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/zzapy;->zzq:J

    .line 22
    .line 23
    new-instance p3, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 24
    .line 25
    invoke-direct {p3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzapy;->zzb:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 29
    .line 30
    const/4 p3, -0x1

    .line 31
    iput p3, p0, Lcom/google/android/gms/internal/ads/zzapy;->zzo:I

    .line 32
    .line 33
    iput p3, p0, Lcom/google/android/gms/internal/ads/zzapy;->zzp:I

    .line 34
    .line 35
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzapy;->zzc:Ljava/lang/String;

    .line 36
    .line 37
    iput p2, p0, Lcom/google/android/gms/internal/ads/zzapy;->zzd:I

    .line 38
    .line 39
    const-string p1, "video/mp2t"

    .line 40
    .line 41
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzapy;->zze:Ljava/lang/String;

    .line 42
    .line 43
    return-void
.end method

.method private final zzf(Lcom/google/android/gms/internal/ads/zzeu;[BI)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzeu;->zzd()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzapy;->zzi:I

    .line 6
    .line 7
    sub-int v1, p3, v1

    .line 8
    .line 9
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzapy;->zzi:I

    .line 14
    .line 15
    invoke-virtual {p1, p2, v1, v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzm([BII)V

    .line 16
    .line 17
    .line 18
    iget p1, p0, Lcom/google/android/gms/internal/ads/zzapy;->zzi:I

    .line 19
    .line 20
    add-int/2addr p1, v0

    .line 21
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzapy;->zzi:I

    .line 22
    .line 23
    if-ne p1, p3, :cond_0

    .line 24
    .line 25
    const/4 p1, 0x1

    .line 26
    return p1

    .line 27
    :cond_0
    const/4 p1, 0x0

    .line 28
    return p1
.end method

.method private final zzg(Lcom/google/android/gms/internal/ads/zzafy;)V
    .locals 4

    .line 1
    iget v0, p1, Lcom/google/android/gms/internal/ads/zzafy;->zzb:I

    .line 2
    .line 3
    const v1, -0x7fffffff

    .line 4
    .line 5
    .line 6
    if-eq v0, v1, :cond_3

    .line 7
    .line 8
    iget v1, p1, Lcom/google/android/gms/internal/ads/zzafy;->zzc:I

    .line 9
    .line 10
    const/4 v2, -0x1

    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzapy;->zzl:Lcom/google/android/gms/internal/ads/zzv;

    .line 15
    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    iget v3, v2, Lcom/google/android/gms/internal/ads/zzv;->zzH:I

    .line 19
    .line 20
    if-ne v1, v3, :cond_1

    .line 21
    .line 22
    iget v3, v2, Lcom/google/android/gms/internal/ads/zzv;->zzJ:I

    .line 23
    .line 24
    if-ne v0, v3, :cond_1

    .line 25
    .line 26
    iget-object v3, p1, Lcom/google/android/gms/internal/ads/zzafy;->zza:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzv;->zzp:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v3, v2}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-nez v2, :cond_3

    .line 35
    .line 36
    :cond_1
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzapy;->zzl:Lcom/google/android/gms/internal/ads/zzv;

    .line 37
    .line 38
    if-nez v2, :cond_2

    .line 39
    .line 40
    new-instance v2, Lcom/google/android/gms/internal/ads/zzt;

    .line 41
    .line 42
    invoke-direct {v2}, Lcom/google/android/gms/internal/ads/zzt;-><init>()V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzv;->zza()Lcom/google/android/gms/internal/ads/zzt;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    :goto_0
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzapy;->zzf:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzt;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 53
    .line 54
    .line 55
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzapy;->zze:Ljava/lang/String;

    .line 56
    .line 57
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzt;->zzn(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 58
    .line 59
    .line 60
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzafy;->zza:Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/ads/zzt;->zzo(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzt;->zzG(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zzt;->zzI(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 69
    .line 70
    .line 71
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzapy;->zzc:Ljava/lang/String;

    .line 72
    .line 73
    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/ads/zzt;->zze(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 74
    .line 75
    .line 76
    iget p1, p0, Lcom/google/android/gms/internal/ads/zzapy;->zzd:I

    .line 77
    .line 78
    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/ads/zzt;->zzg(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzt;->zzP()Lcom/google/android/gms/internal/ads/zzv;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzapy;->zzl:Lcom/google/android/gms/internal/ads/zzv;

    .line 86
    .line 87
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzapy;->zzg:Lcom/google/android/gms/internal/ads/zzahm;

    .line 88
    .line 89
    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzahm;->zzA(Lcom/google/android/gms/internal/ads/zzv;)V

    .line 90
    .line 91
    .line 92
    :cond_3
    :goto_1
    return-void
.end method


# virtual methods
.method public final zza()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzapy;->zzh:I

    .line 3
    .line 4
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzapy;->zzi:I

    .line 5
    .line 6
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzapy;->zzj:I

    .line 7
    .line 8
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    iput-wide v1, p0, Lcom/google/android/gms/internal/ads/zzapy;->zzq:J

    .line 14
    .line 15
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzapy;->zzb:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 18
    .line 19
    .line 20
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
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzapy;->zzf:Ljava/lang/String;

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
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzapy;->zzg:Lcom/google/android/gms/internal/ads/zzahm;

    .line 20
    .line 21
    return-void
.end method

.method public final zzc(JI)V
    .locals 0

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzapy;->zzq:J

    return-void
.end method

.method public final zzd(Lcom/google/android/gms/internal/ads/zzeu;)V
    .locals 18
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzat;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzapy;->zzg:Lcom/google/android/gms/internal/ads/zzahm;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    :cond_0
    :goto_0
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzd()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-lez v2, :cond_14

    .line 15
    .line 16
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzapy;->zzh:I

    .line 17
    .line 18
    const/4 v3, 0x3

    .line 19
    const/4 v4, 0x2

    .line 20
    const/4 v5, 0x0

    .line 21
    const/4 v6, 0x1

    .line 22
    const/4 v7, 0x4

    .line 23
    if-eqz v2, :cond_10

    .line 24
    .line 25
    const/4 v8, 0x7

    .line 26
    const/4 v9, 0x5

    .line 27
    const/4 v10, 0x6

    .line 28
    if-eq v2, v6, :cond_b

    .line 29
    .line 30
    if-eq v2, v4, :cond_a

    .line 31
    .line 32
    const-wide/16 v11, 0x0

    .line 33
    .line 34
    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    if-eq v2, v3, :cond_8

    .line 40
    .line 41
    if-eq v2, v7, :cond_6

    .line 42
    .line 43
    if-eq v2, v9, :cond_3

    .line 44
    .line 45
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzd()I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzapy;->zzm:I

    .line 50
    .line 51
    iget v4, v0, Lcom/google/android/gms/internal/ads/zzapy;->zzi:I

    .line 52
    .line 53
    sub-int/2addr v3, v4

    .line 54
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzapy;->zzg:Lcom/google/android/gms/internal/ads/zzahm;

    .line 59
    .line 60
    invoke-interface {v3, v1, v2}, Lcom/google/android/gms/internal/ads/zzahm;->zzc(Lcom/google/android/gms/internal/ads/zzeu;I)V

    .line 61
    .line 62
    .line 63
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzapy;->zzi:I

    .line 64
    .line 65
    add-int/2addr v3, v2

    .line 66
    iput v3, v0, Lcom/google/android/gms/internal/ads/zzapy;->zzi:I

    .line 67
    .line 68
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzapy;->zzm:I

    .line 69
    .line 70
    if-ne v3, v2, :cond_0

    .line 71
    .line 72
    iget-wide v2, v0, Lcom/google/android/gms/internal/ads/zzapy;->zzq:J

    .line 73
    .line 74
    cmp-long v2, v2, v13

    .line 75
    .line 76
    if-eqz v2, :cond_1

    .line 77
    .line 78
    move v2, v6

    .line 79
    goto :goto_1

    .line 80
    :cond_1
    move v2, v5

    .line 81
    :goto_1
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzgtr;->zzi(Z)V

    .line 82
    .line 83
    .line 84
    iget-object v8, v0, Lcom/google/android/gms/internal/ads/zzapy;->zzg:Lcom/google/android/gms/internal/ads/zzahm;

    .line 85
    .line 86
    iget-wide v9, v0, Lcom/google/android/gms/internal/ads/zzapy;->zzq:J

    .line 87
    .line 88
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzapy;->zzn:I

    .line 89
    .line 90
    if-ne v2, v7, :cond_2

    .line 91
    .line 92
    move v11, v5

    .line 93
    goto :goto_2

    .line 94
    :cond_2
    move v11, v6

    .line 95
    :goto_2
    iget v12, v0, Lcom/google/android/gms/internal/ads/zzapy;->zzm:I

    .line 96
    .line 97
    const/4 v13, 0x0

    .line 98
    const/4 v14, 0x0

    .line 99
    invoke-interface/range {v8 .. v14}, Lcom/google/android/gms/internal/ads/zzahm;->zze(JIIILcom/google/android/gms/internal/ads/zzahl;)V

    .line 100
    .line 101
    .line 102
    iget-wide v2, v0, Lcom/google/android/gms/internal/ads/zzapy;->zzq:J

    .line 103
    .line 104
    iget-wide v6, v0, Lcom/google/android/gms/internal/ads/zzapy;->zzk:J

    .line 105
    .line 106
    add-long/2addr v2, v6

    .line 107
    iput-wide v2, v0, Lcom/google/android/gms/internal/ads/zzapy;->zzq:J

    .line 108
    .line 109
    iput v5, v0, Lcom/google/android/gms/internal/ads/zzapy;->zzh:I

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_3
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzapy;->zza:Lcom/google/android/gms/internal/ads/zzeu;

    .line 113
    .line 114
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    iget v6, v0, Lcom/google/android/gms/internal/ads/zzapy;->zzp:I

    .line 119
    .line 120
    invoke-direct {v0, v1, v4, v6}, Lcom/google/android/gms/internal/ads/zzapy;->zzf(Lcom/google/android/gms/internal/ads/zzeu;[BI)Z

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    if-eqz v4, :cond_0

    .line 125
    .line 126
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzapy;->zzb:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 127
    .line 128
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 129
    .line 130
    .line 131
    move-result-object v6

    .line 132
    invoke-static {v6, v4}, Lcom/google/android/gms/internal/ads/zzafz;->zzf([BLjava/util/concurrent/atomic/AtomicInteger;)Lcom/google/android/gms/internal/ads/zzafy;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    iget v6, v0, Lcom/google/android/gms/internal/ads/zzapy;->zzn:I

    .line 137
    .line 138
    if-ne v6, v3, :cond_4

    .line 139
    .line 140
    invoke-direct {v0, v4}, Lcom/google/android/gms/internal/ads/zzapy;->zzg(Lcom/google/android/gms/internal/ads/zzafy;)V

    .line 141
    .line 142
    .line 143
    :cond_4
    iget v3, v4, Lcom/google/android/gms/internal/ads/zzafy;->zzd:I

    .line 144
    .line 145
    iput v3, v0, Lcom/google/android/gms/internal/ads/zzapy;->zzm:I

    .line 146
    .line 147
    iget-wide v3, v4, Lcom/google/android/gms/internal/ads/zzafy;->zze:J

    .line 148
    .line 149
    cmp-long v6, v3, v13

    .line 150
    .line 151
    if-nez v6, :cond_5

    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_5
    move-wide v11, v3

    .line 155
    :goto_3
    iput-wide v11, v0, Lcom/google/android/gms/internal/ads/zzapy;->zzk:J

    .line 156
    .line 157
    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 158
    .line 159
    .line 160
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzapy;->zzg:Lcom/google/android/gms/internal/ads/zzahm;

    .line 161
    .line 162
    iget v4, v0, Lcom/google/android/gms/internal/ads/zzapy;->zzp:I

    .line 163
    .line 164
    invoke-interface {v3, v2, v4}, Lcom/google/android/gms/internal/ads/zzahm;->zzc(Lcom/google/android/gms/internal/ads/zzeu;I)V

    .line 165
    .line 166
    .line 167
    iput v10, v0, Lcom/google/android/gms/internal/ads/zzapy;->zzh:I

    .line 168
    .line 169
    goto/16 :goto_0

    .line 170
    .line 171
    :cond_6
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzapy;->zza:Lcom/google/android/gms/internal/ads/zzeu;

    .line 172
    .line 173
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    invoke-direct {v0, v1, v3, v10}, Lcom/google/android/gms/internal/ads/zzapy;->zzf(Lcom/google/android/gms/internal/ads/zzeu;[BI)Z

    .line 178
    .line 179
    .line 180
    move-result v3

    .line 181
    if-eqz v3, :cond_0

    .line 182
    .line 183
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzafz;->zzg([B)I

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    iput v2, v0, Lcom/google/android/gms/internal/ads/zzapy;->zzp:I

    .line 192
    .line 193
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzapy;->zzi:I

    .line 194
    .line 195
    if-le v3, v2, :cond_7

    .line 196
    .line 197
    sub-int v2, v3, v2

    .line 198
    .line 199
    sub-int/2addr v3, v2

    .line 200
    iput v3, v0, Lcom/google/android/gms/internal/ads/zzapy;->zzi:I

    .line 201
    .line 202
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzg()I

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    sub-int/2addr v3, v2

    .line 207
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 208
    .line 209
    .line 210
    :cond_7
    iput v9, v0, Lcom/google/android/gms/internal/ads/zzapy;->zzh:I

    .line 211
    .line 212
    goto/16 :goto_0

    .line 213
    .line 214
    :cond_8
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzapy;->zza:Lcom/google/android/gms/internal/ads/zzeu;

    .line 215
    .line 216
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 217
    .line 218
    .line 219
    move-result-object v3

    .line 220
    iget v4, v0, Lcom/google/android/gms/internal/ads/zzapy;->zzo:I

    .line 221
    .line 222
    invoke-direct {v0, v1, v3, v4}, Lcom/google/android/gms/internal/ads/zzapy;->zzf(Lcom/google/android/gms/internal/ads/zzeu;[BI)Z

    .line 223
    .line 224
    .line 225
    move-result v3

    .line 226
    if-eqz v3, :cond_0

    .line 227
    .line 228
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 229
    .line 230
    .line 231
    move-result-object v3

    .line 232
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzafz;->zzd([B)Lcom/google/android/gms/internal/ads/zzafy;

    .line 233
    .line 234
    .line 235
    move-result-object v3

    .line 236
    invoke-direct {v0, v3}, Lcom/google/android/gms/internal/ads/zzapy;->zzg(Lcom/google/android/gms/internal/ads/zzafy;)V

    .line 237
    .line 238
    .line 239
    iget v4, v3, Lcom/google/android/gms/internal/ads/zzafy;->zzd:I

    .line 240
    .line 241
    iput v4, v0, Lcom/google/android/gms/internal/ads/zzapy;->zzm:I

    .line 242
    .line 243
    iget-wide v3, v3, Lcom/google/android/gms/internal/ads/zzafy;->zze:J

    .line 244
    .line 245
    cmp-long v6, v3, v13

    .line 246
    .line 247
    if-nez v6, :cond_9

    .line 248
    .line 249
    goto :goto_4

    .line 250
    :cond_9
    move-wide v11, v3

    .line 251
    :goto_4
    iput-wide v11, v0, Lcom/google/android/gms/internal/ads/zzapy;->zzk:J

    .line 252
    .line 253
    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 254
    .line 255
    .line 256
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzapy;->zzg:Lcom/google/android/gms/internal/ads/zzahm;

    .line 257
    .line 258
    iget v4, v0, Lcom/google/android/gms/internal/ads/zzapy;->zzo:I

    .line 259
    .line 260
    invoke-interface {v3, v2, v4}, Lcom/google/android/gms/internal/ads/zzahm;->zzc(Lcom/google/android/gms/internal/ads/zzeu;I)V

    .line 261
    .line 262
    .line 263
    iput v10, v0, Lcom/google/android/gms/internal/ads/zzapy;->zzh:I

    .line 264
    .line 265
    goto/16 :goto_0

    .line 266
    .line 267
    :cond_a
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzapy;->zza:Lcom/google/android/gms/internal/ads/zzeu;

    .line 268
    .line 269
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 270
    .line 271
    .line 272
    move-result-object v4

    .line 273
    invoke-direct {v0, v1, v4, v8}, Lcom/google/android/gms/internal/ads/zzapy;->zzf(Lcom/google/android/gms/internal/ads/zzeu;[BI)Z

    .line 274
    .line 275
    .line 276
    move-result v4

    .line 277
    if-eqz v4, :cond_0

    .line 278
    .line 279
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 280
    .line 281
    .line 282
    move-result-object v2

    .line 283
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzafz;->zze([B)I

    .line 284
    .line 285
    .line 286
    move-result v2

    .line 287
    iput v2, v0, Lcom/google/android/gms/internal/ads/zzapy;->zzo:I

    .line 288
    .line 289
    iput v3, v0, Lcom/google/android/gms/internal/ads/zzapy;->zzh:I

    .line 290
    .line 291
    goto/16 :goto_0

    .line 292
    .line 293
    :cond_b
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzapy;->zza:Lcom/google/android/gms/internal/ads/zzeu;

    .line 294
    .line 295
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 296
    .line 297
    .line 298
    move-result-object v3

    .line 299
    const/16 v11, 0x12

    .line 300
    .line 301
    invoke-direct {v0, v1, v3, v11}, Lcom/google/android/gms/internal/ads/zzapy;->zzf(Lcom/google/android/gms/internal/ads/zzeu;[BI)Z

    .line 302
    .line 303
    .line 304
    move-result v3

    .line 305
    if-eqz v3, :cond_0

    .line 306
    .line 307
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 308
    .line 309
    .line 310
    move-result-object v12

    .line 311
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzapy;->zzl:Lcom/google/android/gms/internal/ads/zzv;

    .line 312
    .line 313
    if-nez v3, :cond_c

    .line 314
    .line 315
    iget-object v13, v0, Lcom/google/android/gms/internal/ads/zzapy;->zzf:Ljava/lang/String;

    .line 316
    .line 317
    iget-object v14, v0, Lcom/google/android/gms/internal/ads/zzapy;->zzc:Ljava/lang/String;

    .line 318
    .line 319
    iget v15, v0, Lcom/google/android/gms/internal/ads/zzapy;->zzd:I

    .line 320
    .line 321
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzapy;->zze:Ljava/lang/String;

    .line 322
    .line 323
    const/16 v17, 0x0

    .line 324
    .line 325
    move-object/from16 v16, v3

    .line 326
    .line 327
    invoke-static/range {v12 .. v17}, Lcom/google/android/gms/internal/ads/zzafz;->zzb([BLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzq;)Lcom/google/android/gms/internal/ads/zzv;

    .line 328
    .line 329
    .line 330
    move-result-object v3

    .line 331
    iput-object v3, v0, Lcom/google/android/gms/internal/ads/zzapy;->zzl:Lcom/google/android/gms/internal/ads/zzv;

    .line 332
    .line 333
    iget-object v13, v0, Lcom/google/android/gms/internal/ads/zzapy;->zzg:Lcom/google/android/gms/internal/ads/zzahm;

    .line 334
    .line 335
    invoke-interface {v13, v3}, Lcom/google/android/gms/internal/ads/zzahm;->zzA(Lcom/google/android/gms/internal/ads/zzv;)V

    .line 336
    .line 337
    .line 338
    :cond_c
    invoke-static {v12}, Lcom/google/android/gms/internal/ads/zzafz;->zzc([B)I

    .line 339
    .line 340
    .line 341
    move-result v3

    .line 342
    iput v3, v0, Lcom/google/android/gms/internal/ads/zzapy;->zzm:I

    .line 343
    .line 344
    aget-byte v3, v12, v5

    .line 345
    .line 346
    const/4 v13, -0x2

    .line 347
    if-eq v3, v13, :cond_f

    .line 348
    .line 349
    const/4 v13, -0x1

    .line 350
    if-eq v3, v13, :cond_e

    .line 351
    .line 352
    const/16 v13, 0x1f

    .line 353
    .line 354
    if-eq v3, v13, :cond_d

    .line 355
    .line 356
    aget-byte v3, v12, v7

    .line 357
    .line 358
    and-int/2addr v3, v6

    .line 359
    shl-int/2addr v3, v10

    .line 360
    aget-byte v7, v12, v9

    .line 361
    .line 362
    :goto_5
    and-int/lit16 v7, v7, 0xfc

    .line 363
    .line 364
    :goto_6
    shr-int/lit8 v4, v7, 0x2

    .line 365
    .line 366
    or-int/2addr v3, v4

    .line 367
    goto :goto_8

    .line 368
    :cond_d
    aget-byte v3, v12, v9

    .line 369
    .line 370
    and-int/2addr v3, v8

    .line 371
    shl-int/2addr v3, v7

    .line 372
    aget-byte v7, v12, v10

    .line 373
    .line 374
    :goto_7
    and-int/lit8 v7, v7, 0x3c

    .line 375
    .line 376
    goto :goto_6

    .line 377
    :cond_e
    aget-byte v3, v12, v7

    .line 378
    .line 379
    and-int/2addr v3, v8

    .line 380
    shl-int/2addr v3, v7

    .line 381
    aget-byte v7, v12, v8

    .line 382
    .line 383
    goto :goto_7

    .line 384
    :cond_f
    aget-byte v3, v12, v9

    .line 385
    .line 386
    and-int/2addr v3, v6

    .line 387
    shl-int/2addr v3, v10

    .line 388
    aget-byte v7, v12, v7

    .line 389
    .line 390
    goto :goto_5

    .line 391
    :goto_8
    add-int/2addr v3, v6

    .line 392
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzapy;->zzl:Lcom/google/android/gms/internal/ads/zzv;

    .line 393
    .line 394
    iget v4, v4, Lcom/google/android/gms/internal/ads/zzv;->zzJ:I

    .line 395
    .line 396
    mul-int/lit8 v3, v3, 0x20

    .line 397
    .line 398
    int-to-long v6, v3

    .line 399
    invoke-static {v6, v7, v4}, Lcom/google/android/gms/internal/ads/zzfm;->zzu(JI)J

    .line 400
    .line 401
    .line 402
    move-result-wide v3

    .line 403
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/ads/zzhaq;->zza(J)I

    .line 404
    .line 405
    .line 406
    move-result v3

    .line 407
    int-to-long v3, v3

    .line 408
    iput-wide v3, v0, Lcom/google/android/gms/internal/ads/zzapy;->zzk:J

    .line 409
    .line 410
    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 411
    .line 412
    .line 413
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzapy;->zzg:Lcom/google/android/gms/internal/ads/zzahm;

    .line 414
    .line 415
    invoke-interface {v3, v2, v11}, Lcom/google/android/gms/internal/ads/zzahm;->zzc(Lcom/google/android/gms/internal/ads/zzeu;I)V

    .line 416
    .line 417
    .line 418
    iput v10, v0, Lcom/google/android/gms/internal/ads/zzapy;->zzh:I

    .line 419
    .line 420
    goto/16 :goto_0

    .line 421
    .line 422
    :cond_10
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzd()I

    .line 423
    .line 424
    .line 425
    move-result v2

    .line 426
    if-lez v2, :cond_0

    .line 427
    .line 428
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzapy;->zzj:I

    .line 429
    .line 430
    shl-int/lit8 v2, v2, 0x8

    .line 431
    .line 432
    iput v2, v0, Lcom/google/android/gms/internal/ads/zzapy;->zzj:I

    .line 433
    .line 434
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    .line 435
    .line 436
    .line 437
    move-result v8

    .line 438
    or-int/2addr v2, v8

    .line 439
    iput v2, v0, Lcom/google/android/gms/internal/ads/zzapy;->zzj:I

    .line 440
    .line 441
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzafz;->zza(I)I

    .line 442
    .line 443
    .line 444
    move-result v2

    .line 445
    iput v2, v0, Lcom/google/android/gms/internal/ads/zzapy;->zzn:I

    .line 446
    .line 447
    if-eqz v2, :cond_10

    .line 448
    .line 449
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzapy;->zza:Lcom/google/android/gms/internal/ads/zzeu;

    .line 450
    .line 451
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 452
    .line 453
    .line 454
    move-result-object v2

    .line 455
    iget v8, v0, Lcom/google/android/gms/internal/ads/zzapy;->zzj:I

    .line 456
    .line 457
    shr-int/lit8 v9, v8, 0x18

    .line 458
    .line 459
    and-int/lit16 v9, v9, 0xff

    .line 460
    .line 461
    int-to-byte v9, v9

    .line 462
    aput-byte v9, v2, v5

    .line 463
    .line 464
    shr-int/lit8 v9, v8, 0x10

    .line 465
    .line 466
    and-int/lit16 v9, v9, 0xff

    .line 467
    .line 468
    int-to-byte v9, v9

    .line 469
    aput-byte v9, v2, v6

    .line 470
    .line 471
    shr-int/lit8 v9, v8, 0x8

    .line 472
    .line 473
    and-int/lit16 v9, v9, 0xff

    .line 474
    .line 475
    int-to-byte v9, v9

    .line 476
    aput-byte v9, v2, v4

    .line 477
    .line 478
    and-int/lit16 v8, v8, 0xff

    .line 479
    .line 480
    int-to-byte v8, v8

    .line 481
    aput-byte v8, v2, v3

    .line 482
    .line 483
    iput v7, v0, Lcom/google/android/gms/internal/ads/zzapy;->zzi:I

    .line 484
    .line 485
    iput v5, v0, Lcom/google/android/gms/internal/ads/zzapy;->zzj:I

    .line 486
    .line 487
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzapy;->zzn:I

    .line 488
    .line 489
    if-eq v2, v3, :cond_13

    .line 490
    .line 491
    if-ne v2, v7, :cond_11

    .line 492
    .line 493
    goto :goto_9

    .line 494
    :cond_11
    if-ne v2, v6, :cond_12

    .line 495
    .line 496
    iput v6, v0, Lcom/google/android/gms/internal/ads/zzapy;->zzh:I

    .line 497
    .line 498
    goto/16 :goto_0

    .line 499
    .line 500
    :cond_12
    iput v4, v0, Lcom/google/android/gms/internal/ads/zzapy;->zzh:I

    .line 501
    .line 502
    goto/16 :goto_0

    .line 503
    .line 504
    :cond_13
    :goto_9
    iput v7, v0, Lcom/google/android/gms/internal/ads/zzapy;->zzh:I

    .line 505
    .line 506
    goto/16 :goto_0

    .line 507
    .line 508
    :cond_14
    return-void
.end method

.method public final zze(Z)V
    .locals 0

    return-void
.end method
