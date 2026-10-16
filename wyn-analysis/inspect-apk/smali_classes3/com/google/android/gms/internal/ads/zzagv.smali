.class public final Lcom/google/android/gms/internal/ads/zzagv;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzeu;


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
    const/16 v1, 0xa

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzeu;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzagv;->zza:Lcom/google/android/gms/internal/ads/zzeu;

    .line 12
    .line 13
    return-void
.end method

.method private final zzb(Lcom/google/android/gms/internal/ads/zzagb;I)Z
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :cond_0
    rem-int/lit8 v2, v1, 0xa

    .line 4
    .line 5
    const/16 v3, 0xa

    .line 6
    .line 7
    if-nez v2, :cond_2

    .line 8
    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzagv;->zza:Lcom/google/android/gms/internal/ads/zzeu;

    .line 12
    .line 13
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    const/16 v6, 0x9

    .line 22
    .line 23
    invoke-static {v5, v3, v4, v0, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 24
    .line 25
    .line 26
    :cond_1
    move v4, v0

    .line 27
    goto :goto_0

    .line 28
    :cond_2
    move v4, v2

    .line 29
    :goto_0
    const/4 v5, 0x1

    .line 30
    if-nez v1, :cond_3

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_3
    move v3, v5

    .line 34
    :goto_1
    :try_start_0
    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzagv;->zza:Lcom/google/android/gms/internal/ads/zzeu;

    .line 35
    .line 36
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    add-int/lit8 v2, v2, 0xa

    .line 41
    .line 42
    sub-int v8, v2, v3

    .line 43
    .line 44
    invoke-interface {p1, v7, v8, v3}, Lcom/google/android/gms/internal/ads/zzagb;->zzi([BII)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    .line 46
    .line 47
    invoke-virtual {v6, v4}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v6, v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzf(I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzeu;->zzq()I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    const v3, 0x494433

    .line 58
    .line 59
    .line 60
    if-ne v2, v3, :cond_4

    .line 61
    .line 62
    return v5

    .line 63
    :cond_4
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzeu;->zzr()I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzagy;->zza(I)I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    const/4 v3, -0x1

    .line 72
    if-eq v2, v3, :cond_5

    .line 73
    .line 74
    return v0

    .line 75
    :cond_5
    if-nez v1, :cond_6

    .line 76
    .line 77
    const/16 v2, 0x14

    .line 78
    .line 79
    invoke-virtual {v6, v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzc(I)V

    .line 80
    .line 81
    .line 82
    :cond_6
    add-int/lit8 v1, v1, 0x1

    .line 83
    .line 84
    if-le v1, p2, :cond_0

    .line 85
    .line 86
    :catch_0
    return v0
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzagb;Lcom/google/android/gms/internal/ads/zzajo;I)Lcom/google/android/gms/internal/ads/zzap;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    invoke-direct {p0, p1, p3}, Lcom/google/android/gms/internal/ads/zzagv;->zzb(Lcom/google/android/gms/internal/ads/zzagb;I)Z

    .line 5
    .line 6
    .line 7
    move-result v3

    .line 8
    if-eqz v3, :cond_1

    .line 9
    .line 10
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzagv;->zza:Lcom/google/android/gms/internal/ads/zzeu;

    .line 11
    .line 12
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzg()I

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    const/4 v5, 0x6

    .line 17
    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzG()I

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    add-int/lit8 v6, v5, 0xa

    .line 25
    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    new-array v0, v6, [B

    .line 29
    .line 30
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    const/16 v7, 0xa

    .line 35
    .line 36
    invoke-static {v3, v4, v0, v1, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 37
    .line 38
    .line 39
    invoke-interface {p1, v0, v7, v5}, Lcom/google/android/gms/internal/ads/zzagb;->zzi([BII)V

    .line 40
    .line 41
    .line 42
    new-instance v3, Lcom/google/android/gms/internal/ads/zzajc;

    .line 43
    .line 44
    invoke-direct {v3}, Lcom/google/android/gms/internal/ads/zzajc;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-static {v0, v6, p2, v3}, Lcom/google/android/gms/internal/ads/zzajr;->zza([BILcom/google/android/gms/internal/ads/zzajo;Lcom/google/android/gms/internal/ads/zzajc;)Lcom/google/android/gms/internal/ads/zzap;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    goto :goto_1

    .line 52
    :cond_0
    invoke-interface {p1, v5}, Lcom/google/android/gms/internal/ads/zzagb;->zzk(I)V

    .line 53
    .line 54
    .line 55
    :goto_1
    add-int/2addr v2, v6

    .line 56
    goto :goto_0

    .line 57
    :cond_1
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzagb;->zzl()V

    .line 58
    .line 59
    .line 60
    invoke-interface {p1, v2}, Lcom/google/android/gms/internal/ads/zzagb;->zzk(I)V

    .line 61
    .line 62
    .line 63
    return-object v0
.end method
