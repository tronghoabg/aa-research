.class final Lcom/google/android/gms/internal/ads/zzgit;
.super Lcom/google/android/gms/internal/ads/zzgji;
.source "SourceFile"


# instance fields
.field private final zza:Landroid/content/Context;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzaxt;Lcom/google/android/gms/internal/ads/zzgie;Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzgqo;)V
    .locals 7

    .line 1
    const/16 v0, 0x73

    .line 2
    .line 3
    invoke-virtual {p4, v0}, Lcom/google/android/gms/internal/ads/zzgqo;->zza(I)Lcom/google/android/gms/internal/ads/zzgqm;

    .line 4
    .line 5
    .line 6
    move-result-object v6

    .line 7
    const-string v2, "oMAI9M+rfpAXD2NxGp+nC5qJwKDENlbYG7lXxNGFquSBEXZr9ZbCp8YKXYADPdQS"

    .line 8
    .line 9
    const-string v3, "GTycQamaBLKET6mxwzojHIa3a0Qk/f4p0jfnV7pjl+o="

    .line 10
    .line 11
    move-object v1, p0

    .line 12
    move-object v4, p1

    .line 13
    move-object v5, p2

    .line 14
    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/zzgji;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzaxt;Lcom/google/android/gms/internal/ads/zzgie;Lcom/google/android/gms/internal/ads/zzgqm;)V

    .line 15
    .line 16
    .line 17
    iput-object p3, v1, Lcom/google/android/gms/internal/ads/zzgit;->zza:Landroid/content/Context;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/reflect/Method;Lcom/google/android/gms/internal/ads/zzaxt;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalAccessException;,
            Ljava/lang/reflect/InvocationTargetException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgit;->zza:Landroid/content/Context;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    new-array v2, v1, [Ljava/lang/Object;

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    aput-object v0, v2, v3

    .line 8
    .line 9
    const-string v0, ""

    .line 10
    .line 11
    invoke-virtual {p1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, [Ljava/lang/Object;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    monitor-enter p2

    .line 21
    :try_start_0
    aget-object v0, p1, v3

    .line 22
    .line 23
    check-cast v0, Ljava/lang/Integer;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    int-to-long v2, v0

    .line 30
    invoke-virtual {p2, v2, v3}, Lcom/google/android/gms/internal/ads/zzaxt;->zzO(J)Lcom/google/android/gms/internal/ads/zzaxt;

    .line 31
    .line 32
    .line 33
    aget-object v0, p1, v1

    .line 34
    .line 35
    check-cast v0, Ljava/lang/Integer;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    int-to-long v2, v0

    .line 42
    invoke-virtual {p2, v2, v3}, Lcom/google/android/gms/internal/ads/zzaxt;->zzd(J)Lcom/google/android/gms/internal/ads/zzaxt;

    .line 43
    .line 44
    .line 45
    const/4 v0, 0x2

    .line 46
    aget-object v2, p1, v0

    .line 47
    .line 48
    check-cast v2, Ljava/lang/Integer;

    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    int-to-long v2, v2

    .line 55
    invoke-virtual {p2, v2, v3}, Lcom/google/android/gms/internal/ads/zzaxt;->zze(J)Lcom/google/android/gms/internal/ads/zzaxt;

    .line 56
    .line 57
    .line 58
    const/4 v2, 0x3

    .line 59
    aget-object v3, p1, v2

    .line 60
    .line 61
    check-cast v3, Ljava/lang/Integer;

    .line 62
    .line 63
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    int-to-long v3, v3

    .line 68
    invoke-virtual {p2, v3, v4}, Lcom/google/android/gms/internal/ads/zzaxt;->zzab(J)Lcom/google/android/gms/internal/ads/zzaxt;

    .line 69
    .line 70
    .line 71
    const/4 v3, 0x4

    .line 72
    aget-object v3, p1, v3

    .line 73
    .line 74
    check-cast v3, Ljava/lang/Boolean;

    .line 75
    .line 76
    if-nez v3, :cond_0

    .line 77
    .line 78
    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/ads/zzaxt;->zzaf(I)Lcom/google/android/gms/internal/ads/zzaxt;

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :catchall_0
    move-exception p1

    .line 83
    goto :goto_4

    .line 84
    :cond_0
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    if-eq v1, v3, :cond_1

    .line 89
    .line 90
    move v3, v1

    .line 91
    goto :goto_0

    .line 92
    :cond_1
    move v3, v0

    .line 93
    :goto_0
    invoke-virtual {p2, v3}, Lcom/google/android/gms/internal/ads/zzaxt;->zzaf(I)Lcom/google/android/gms/internal/ads/zzaxt;

    .line 94
    .line 95
    .line 96
    :goto_1
    const/4 v3, 0x5

    .line 97
    aget-object p1, p1, v3

    .line 98
    .line 99
    check-cast p1, Ljava/lang/Boolean;

    .line 100
    .line 101
    if-nez p1, :cond_2

    .line 102
    .line 103
    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/ads/zzaxt;->zzae(I)Lcom/google/android/gms/internal/ads/zzaxt;

    .line 104
    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    if-eq v1, p1, :cond_3

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_3
    move v1, v0

    .line 115
    :goto_2
    invoke-virtual {p2, v1}, Lcom/google/android/gms/internal/ads/zzaxt;->zzae(I)Lcom/google/android/gms/internal/ads/zzaxt;

    .line 116
    .line 117
    .line 118
    :goto_3
    monitor-exit p2

    .line 119
    return-void

    .line 120
    :goto_4
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 121
    throw p1
.end method
