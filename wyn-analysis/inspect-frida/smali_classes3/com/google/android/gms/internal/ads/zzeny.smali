.class final Lcom/google/android/gms/internal/ads/zzeny;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzdnw;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzfkn;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzbxi;

.field private final zzc:Lx6/b;

.field private zzd:Lcom/google/android/gms/internal/ads/zzddr;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzfkn;Lcom/google/android/gms/internal/ads/zzbxi;Lx6/b;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzeny;->zzd:Lcom/google/android/gms/internal/ads/zzddr;

    .line 6
    .line 7
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzeny;->zza:Lcom/google/android/gms/internal/ads/zzfkn;

    .line 8
    .line 9
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzeny;->zzb:Lcom/google/android/gms/internal/ads/zzbxi;

    .line 10
    .line 11
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzeny;->zzc:Lx6/b;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final zza(ZLandroid/content/Context;Lcom/google/android/gms/internal/ads/zzddm;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzdnv;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzeny;->zzc:Lx6/b;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 p3, 0x1

    .line 8
    const/4 v0, 0x2

    .line 9
    if-eq p1, p3, :cond_1

    .line 10
    .line 11
    if-eq p1, v0, :cond_0

    .line 12
    .line 13
    const/4 p3, 0x5

    .line 14
    if-ne p1, p3, :cond_4

    .line 15
    .line 16
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzeny;->zzb:Lcom/google/android/gms/internal/ads/zzbxi;

    .line 17
    .line 18
    new-instance p3, Lq7/b;

    .line 19
    .line 20
    invoke-direct {p3, p2}, Lq7/b;-><init>(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-interface {p1, p3}, Lcom/google/android/gms/internal/ads/zzbxi;->zzt(Lq7/a;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    goto :goto_2

    .line 30
    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzeny;->zzb:Lcom/google/android/gms/internal/ads/zzbxi;

    .line 31
    .line 32
    new-instance p3, Lq7/b;

    .line 33
    .line 34
    invoke-direct {p3, p2}, Lq7/b;-><init>(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-interface {p1, p3}, Lcom/google/android/gms/internal/ads/zzbxi;->zzm(Lq7/a;)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzeny;->zzb:Lcom/google/android/gms/internal/ads/zzbxi;

    .line 43
    .line 44
    new-instance p3, Lq7/b;

    .line 45
    .line 46
    invoke-direct {p3, p2}, Lq7/b;-><init>(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    invoke-interface {p1, p3}, Lcom/google/android/gms/internal/ads/zzbxi;->zzk(Lq7/a;)Z

    .line 50
    .line 51
    .line 52
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    :goto_0
    if-eqz p1, :cond_4

    .line 54
    .line 55
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzeny;->zzd:Lcom/google/android/gms/internal/ads/zzddr;

    .line 56
    .line 57
    if-nez p1, :cond_2

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    sget-object p2, Lcom/google/android/gms/internal/ads/zzbix;->zzcm:Lcom/google/android/gms/internal/ads/zzbio;

    .line 61
    .line 62
    sget-object p3, LD6/s;->e:LD6/s;

    .line 63
    .line 64
    iget-object p3, p3, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 65
    .line 66
    invoke-virtual {p3, p2}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    check-cast p2, Ljava/lang/Boolean;

    .line 71
    .line 72
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    if-nez p2, :cond_3

    .line 77
    .line 78
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzeny;->zza:Lcom/google/android/gms/internal/ads/zzfkn;

    .line 79
    .line 80
    iget p2, p2, Lcom/google/android/gms/internal/ads/zzfkn;->zzY:I

    .line 81
    .line 82
    if-ne p2, v0, :cond_3

    .line 83
    .line 84
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzddr;->zza()V

    .line 85
    .line 86
    .line 87
    :cond_3
    :goto_1
    return-void

    .line 88
    :cond_4
    new-instance p1, Lcom/google/android/gms/internal/ads/zzdnv;

    .line 89
    .line 90
    const-string p2, "Adapter failed to show."

    .line 91
    .line 92
    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/zzdnv;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    throw p1

    .line 96
    :goto_2
    new-instance p2, Lcom/google/android/gms/internal/ads/zzdnv;

    .line 97
    .line 98
    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/ads/zzdnv;-><init>(Ljava/lang/Throwable;)V

    .line 99
    .line 100
    .line 101
    throw p2
.end method

.method public final zzb()Lcom/google/android/gms/internal/ads/zzfkn;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzeny;->zza:Lcom/google/android/gms/internal/ads/zzfkn;

    return-object v0
.end method

.method public final zzc(Lcom/google/android/gms/internal/ads/zzddr;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzeny;->zzd:Lcom/google/android/gms/internal/ads/zzddr;

    return-void
.end method
