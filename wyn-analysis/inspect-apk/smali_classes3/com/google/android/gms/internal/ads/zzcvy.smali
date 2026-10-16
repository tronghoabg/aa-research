.class final synthetic Lcom/google/android/gms/internal/ads/zzcvy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzden;


# instance fields
.field private final synthetic zza:Landroid/content/Context;

.field private final synthetic zzb:LH6/a;

.field private final synthetic zzc:Lcom/google/android/gms/internal/ads/zzfkn;

.field private final synthetic zzd:Lcom/google/android/gms/internal/ads/zzflg;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;LH6/a;Lcom/google/android/gms/internal/ads/zzfkn;Lcom/google/android/gms/internal/ads/zzflg;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcvy;->zza:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzcvy;->zzb:LH6/a;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzcvy;->zzc:Lcom/google/android/gms/internal/ads/zzfkn;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzcvy;->zzd:Lcom/google/android/gms/internal/ads/zzflg;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final zzg()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcvy;->zzd:Lcom/google/android/gms/internal/ads/zzflg;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzcvy;->zzc:Lcom/google/android/gms/internal/ads/zzfkn;

    .line 4
    .line 5
    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzfkn;->zzC:Lorg/json/JSONObject;

    .line 6
    .line 7
    sget-object v2, LC6/n;->D:LC6/n;

    .line 8
    .line 9
    iget-object v2, v2, LC6/n;->o:LG6/m;

    .line 10
    .line 11
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzcvy;->zzb:LH6/a;

    .line 12
    .line 13
    iget-object v3, v3, LH6/a;->a:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzflg;->zzg:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzcvy;->zza:Landroid/content/Context;

    .line 22
    .line 23
    invoke-virtual {v2, v4, v3, v1, v0}, LG6/m;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    return-void
.end method
