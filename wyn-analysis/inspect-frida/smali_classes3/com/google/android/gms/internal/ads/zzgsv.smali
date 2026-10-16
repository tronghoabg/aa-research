.class final Lcom/google/android/gms/internal/ads/zzgsv;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field zza:Ljava/lang/Object;

.field zzb:I

.field final synthetic zzc:Lcom/google/android/gms/internal/ads/zzgst;

.field final synthetic zzd:Ltf/p;

.field private synthetic zze:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzgst;Ltf/p;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzgsv;->zzc:Lcom/google/android/gms/internal/ads/zzgst;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzgsv;->zzd:Ltf/p;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Llf/j;-><init>(ILjf/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 3

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzgsv;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzgsv;->zzc:Lcom/google/android/gms/internal/ads/zzgst;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzgsv;->zzd:Ltf/p;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, Lcom/google/android/gms/internal/ads/zzgsv;-><init>(Lcom/google/android/gms/internal/ads/zzgst;Ltf/p;Ljf/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lcom/google/android/gms/internal/ads/zzgsv;->zze:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LEf/E;

    .line 2
    .line 3
    check-cast p2, Ljf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzgsv;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/google/android/gms/internal/ads/zzgsv;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzgsv;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzgsv;->zzb:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    if-eq v1, v3, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgsv;->zze:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, LNf/a;

    .line 14
    .line 15
    :try_start_0
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    goto :goto_1

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    goto :goto_2

    .line 21
    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzgsv;->zza:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, Ltf/p;

    .line 24
    .line 25
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzgsv;->zze:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v3, LNf/a;

    .line 28
    .line 29
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    move-object p1, v3

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzgsv;->zze:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p1, LEf/E;

    .line 40
    .line 41
    invoke-static {p1}, LEf/H;->o(LEf/E;)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzgsv;->zzc:Lcom/google/android/gms/internal/ads/zzgst;

    .line 45
    .line 46
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzgsv;->zzd:Ltf/p;

    .line 47
    .line 48
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzgst;->zza()LNf/a;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzgsv;->zze:Ljava/lang/Object;

    .line 53
    .line 54
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzgsv;->zza:Ljava/lang/Object;

    .line 55
    .line 56
    iput v3, p0, Lcom/google/android/gms/internal/ads/zzgsv;->zzb:I

    .line 57
    .line 58
    invoke-static {p1, p0}, Lcom/google/android/gms/internal/ads/zzgsw;->zzc(LNf/a;Ljf/c;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    if-eq v3, v0, :cond_2

    .line 63
    .line 64
    :goto_0
    :try_start_1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzgsv;->zze:Ljava/lang/Object;

    .line 65
    .line 66
    iput-object v2, p0, Lcom/google/android/gms/internal/ads/zzgsv;->zza:Ljava/lang/Object;

    .line 67
    .line 68
    const/4 v3, 0x2

    .line 69
    iput v3, p0, Lcom/google/android/gms/internal/ads/zzgsv;->zzb:I

    .line 70
    .line 71
    invoke-static {v1, p0}, LEf/H;->l(Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 75
    if-eq v1, v0, :cond_2

    .line 76
    .line 77
    move-object v0, p1

    .line 78
    move-object p1, v1

    .line 79
    :goto_1
    invoke-interface {v0, v2}, LNf/a;->a(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    return-object p1

    .line 83
    :catchall_1
    move-exception v0

    .line 84
    move-object v4, v0

    .line 85
    move-object v0, p1

    .line 86
    move-object p1, v4

    .line 87
    :goto_2
    invoke-interface {v0, v2}, LNf/a;->a(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    throw p1

    .line 91
    :cond_2
    return-object v0
.end method
