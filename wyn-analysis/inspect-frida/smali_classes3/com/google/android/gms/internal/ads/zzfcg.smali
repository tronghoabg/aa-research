.class public final Lcom/google/android/gms/internal/ads/zzfcg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfcs;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzhcp;

.field private final zzb:Landroid/content/Context;

.field private final zzc:LH6/a;

.field private final zzd:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzhcp;Landroid/content/Context;LH6/a;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfcg;->zza:Lcom/google/android/gms/internal/ads/zzhcp;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfcg;->zzb:Landroid/content/Context;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzfcg;->zzc:LH6/a;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzfcg;->zzd:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final zza()Lp8/p;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfcf;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzfcf;-><init>(Lcom/google/android/gms/internal/ads/zzfcg;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfcg;->zza:Lcom/google/android/gms/internal/ads/zzhcp;

    .line 7
    .line 8
    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/zzhcp;->zzc(Ljava/util/concurrent/Callable;)Lp8/p;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
.end method

.method public final zzb()I
    .locals 1

    const/16 v0, 0x23

    return v0
.end method

.method public final zzc()Lcom/google/android/gms/internal/ads/zzfch;
    .locals 10

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfch;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfcg;->zzb:Landroid/content/Context;

    .line 4
    .line 5
    invoke-static {v1}, Lp7/c;->a(Landroid/content/Context;)LE0/a;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {v2}, LE0/a;->e()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    sget-object v3, LC6/n;->D:LC6/n;

    .line 14
    .line 15
    iget-object v3, v3, LC6/n;->c:LG6/U;

    .line 16
    .line 17
    move-object v3, v1

    .line 18
    move v1, v2

    .line 19
    invoke-static {v3}, LG6/U;->f(Landroid/content/Context;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzfcg;->zzc:LH6/a;

    .line 24
    .line 25
    iget-object v4, v4, LH6/a;->a:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {}, Landroid/os/Process;->myUid()I

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    const/4 v6, 0x0

    .line 32
    if-eqz v5, :cond_1

    .line 33
    .line 34
    const/16 v7, 0x3e8

    .line 35
    .line 36
    if-ne v5, v7, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move v5, v6

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    :goto_0
    const/4 v5, 0x1

    .line 42
    :goto_1
    invoke-virtual {v3}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    if-nez v7, :cond_2

    .line 47
    .line 48
    move v7, v6

    .line 49
    goto :goto_2

    .line 50
    :cond_2
    iget v7, v7, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    .line 51
    .line 52
    :goto_2
    const-string v8, "com.google.android.gms.ads.dynamite"

    .line 53
    .line 54
    invoke-static {v3, v8, v6}, Lr7/d;->d(Landroid/content/Context;Ljava/lang/String;Z)I

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    invoke-static {v3, v8}, Lr7/d;->a(Landroid/content/Context;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    iget-object v8, p0, Lcom/google/android/gms/internal/ads/zzfcg;->zzd:Ljava/lang/String;

    .line 63
    .line 64
    move v9, v7

    .line 65
    move v7, v3

    .line 66
    move-object v3, v4

    .line 67
    move v4, v5

    .line 68
    move v5, v9

    .line 69
    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/internal/ads/zzfch;-><init>(ZZLjava/lang/String;ZIIILjava/lang/String;)V

    .line 70
    .line 71
    .line 72
    return-object v0
.end method
