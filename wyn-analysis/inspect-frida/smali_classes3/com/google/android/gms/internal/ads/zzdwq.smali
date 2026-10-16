.class public final Lcom/google/android/gms/internal/ads/zzdwq;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Landroid/content/Context;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzbaw;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzbke;

.field private final zzd:LH6/a;

.field private final zze:LC6/a;

.field private final zzf:Lcom/google/android/gms/internal/ads/zzbhw;

.field private final zzg:Lcom/google/android/gms/internal/ads/zzdga;

.field private final zzh:Lcom/google/android/gms/internal/ads/zzekz;

.field private final zzi:Lcom/google/android/gms/internal/ads/zzflk;

.field private final zzj:Lcom/google/android/gms/internal/ads/zzdzt;

.field private final zzk:Lcom/google/android/gms/internal/ads/zzcna;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzclr;Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzbaw;Lcom/google/android/gms/internal/ads/zzbke;LH6/a;LC6/a;Lcom/google/android/gms/internal/ads/zzbhw;Lcom/google/android/gms/internal/ads/zzdga;Lcom/google/android/gms/internal/ads/zzekz;Lcom/google/android/gms/internal/ads/zzflk;Lcom/google/android/gms/internal/ads/zzdzt;Lcom/google/android/gms/internal/ads/zzcna;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzdwq;->zza:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzdwq;->zzb:Lcom/google/android/gms/internal/ads/zzbaw;

    .line 7
    .line 8
    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzdwq;->zzc:Lcom/google/android/gms/internal/ads/zzbke;

    .line 9
    .line 10
    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzdwq;->zzd:LH6/a;

    .line 11
    .line 12
    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzdwq;->zze:LC6/a;

    .line 13
    .line 14
    iput-object p7, p0, Lcom/google/android/gms/internal/ads/zzdwq;->zzf:Lcom/google/android/gms/internal/ads/zzbhw;

    .line 15
    .line 16
    iput-object p8, p0, Lcom/google/android/gms/internal/ads/zzdwq;->zzg:Lcom/google/android/gms/internal/ads/zzdga;

    .line 17
    .line 18
    iput-object p9, p0, Lcom/google/android/gms/internal/ads/zzdwq;->zzh:Lcom/google/android/gms/internal/ads/zzekz;

    .line 19
    .line 20
    iput-object p10, p0, Lcom/google/android/gms/internal/ads/zzdwq;->zzi:Lcom/google/android/gms/internal/ads/zzflk;

    .line 21
    .line 22
    iput-object p11, p0, Lcom/google/android/gms/internal/ads/zzdwq;->zzj:Lcom/google/android/gms/internal/ads/zzdzt;

    .line 23
    .line 24
    iput-object p12, p0, Lcom/google/android/gms/internal/ads/zzdwq;->zzk:Lcom/google/android/gms/internal/ads/zzcna;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final zza(LD6/x1;Lcom/google/android/gms/internal/ads/zzfkn;Lcom/google/android/gms/internal/ads/zzfkq;)Lcom/google/android/gms/internal/ads/zzclb;
    .locals 18
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzclq;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzcnl;->zza(LD6/x1;)Lcom/google/android/gms/internal/ads/zzcnl;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    move-object/from16 v1, p1

    .line 8
    .line 9
    iget-object v3, v1, LD6/x1;->a:Ljava/lang/String;

    .line 10
    .line 11
    new-instance v10, Lcom/google/android/gms/internal/ads/zzdwf;

    .line 12
    .line 13
    invoke-direct {v10, v0}, Lcom/google/android/gms/internal/ads/zzdwf;-><init>(Lcom/google/android/gms/internal/ads/zzdwq;)V

    .line 14
    .line 15
    .line 16
    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzdwq;->zzb:Lcom/google/android/gms/internal/ads/zzbaw;

    .line 17
    .line 18
    iget-object v15, v0, Lcom/google/android/gms/internal/ads/zzdwq;->zzh:Lcom/google/android/gms/internal/ads/zzekz;

    .line 19
    .line 20
    iget-object v7, v0, Lcom/google/android/gms/internal/ads/zzdwq;->zzc:Lcom/google/android/gms/internal/ads/zzbke;

    .line 21
    .line 22
    iget-object v11, v0, Lcom/google/android/gms/internal/ads/zzdwq;->zze:LC6/a;

    .line 23
    .line 24
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzdwq;->zzi:Lcom/google/android/gms/internal/ads/zzflk;

    .line 25
    .line 26
    move-object/from16 v16, v1

    .line 27
    .line 28
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzdwq;->zza:Landroid/content/Context;

    .line 29
    .line 30
    iget-object v8, v0, Lcom/google/android/gms/internal/ads/zzdwq;->zzd:LH6/a;

    .line 31
    .line 32
    iget-object v12, v0, Lcom/google/android/gms/internal/ads/zzdwq;->zzf:Lcom/google/android/gms/internal/ads/zzbhw;

    .line 33
    .line 34
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzdwq;->zzj:Lcom/google/android/gms/internal/ads/zzdzt;

    .line 35
    .line 36
    move-object/from16 v17, v4

    .line 37
    .line 38
    const/4 v4, 0x0

    .line 39
    const/4 v5, 0x0

    .line 40
    const/4 v9, 0x0

    .line 41
    move-object/from16 v13, p2

    .line 42
    .line 43
    move-object/from16 v14, p3

    .line 44
    .line 45
    invoke-static/range {v1 .. v17}, Lcom/google/android/gms/internal/ads/zzclr;->zza(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzcnl;Ljava/lang/String;ZZLcom/google/android/gms/internal/ads/zzbaw;Lcom/google/android/gms/internal/ads/zzbke;LH6/a;Lcom/google/android/gms/internal/ads/zzbjm;LC6/h;LC6/a;Lcom/google/android/gms/internal/ads/zzbhw;Lcom/google/android/gms/internal/ads/zzfkn;Lcom/google/android/gms/internal/ads/zzfkq;Lcom/google/android/gms/internal/ads/zzekz;Lcom/google/android/gms/internal/ads/zzflk;Lcom/google/android/gms/internal/ads/zzdzt;)Lcom/google/android/gms/internal/ads/zzclb;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    sget-object v2, Lcom/google/android/gms/internal/ads/zzbix;->zzpK:Lcom/google/android/gms/internal/ads/zzbio;

    .line 50
    .line 51
    sget-object v3, LD6/s;->e:LD6/s;

    .line 52
    .line 53
    iget-object v3, v3, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 54
    .line 55
    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    check-cast v2, Ljava/lang/Boolean;

    .line 60
    .line 61
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-eqz v2, :cond_0

    .line 66
    .line 67
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzdwq;->zzk:Lcom/google/android/gms/internal/ads/zzcna;

    .line 68
    .line 69
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzclb;->zzD()Landroid/webkit/WebView;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzcna;->zza(Landroid/webkit/WebView;)V

    .line 74
    .line 75
    .line 76
    :cond_0
    return-object v1
.end method

.method public final synthetic zzb()Lcom/google/android/gms/internal/ads/zzdga;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdwq;->zzg:Lcom/google/android/gms/internal/ads/zzdga;

    return-object v0
.end method
