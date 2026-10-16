.class final synthetic Lcom/google/android/gms/internal/ads/zzdbo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzgti;


# instance fields
.field private final synthetic zza:Landroid/content/Context;

.field private final synthetic zzb:LH6/a;

.field private final synthetic zzc:Lcom/google/android/gms/internal/ads/zzflg;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;LH6/a;Lcom/google/android/gms/internal/ads/zzflg;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdbo;->zza:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzdbo;->zzb:LH6/a;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzdbo;->zzc:Lcom/google/android/gms/internal/ads/zzflg;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzfkn;

    .line 2
    .line 3
    new-instance v0, LG6/j;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdbo;->zza:Landroid/content/Context;

    .line 6
    .line 7
    invoke-direct {v0, v1}, LG6/j;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p1, Lcom/google/android/gms/internal/ads/zzfkn;->zzB:Ljava/lang/String;

    .line 11
    .line 12
    iput-object v1, v0, LG6/j;->c:Ljava/lang/String;

    .line 13
    .line 14
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzfkn;->zzC:Lorg/json/JSONObject;

    .line 15
    .line 16
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, v0, LG6/j;->f:Ljava/lang/String;

    .line 21
    .line 22
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzdbo;->zzb:LH6/a;

    .line 23
    .line 24
    iget-object p1, p1, LH6/a;->a:Ljava/lang/String;

    .line 25
    .line 26
    iput-object p1, v0, LG6/j;->e:Ljava/lang/String;

    .line 27
    .line 28
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzdbo;->zzc:Lcom/google/android/gms/internal/ads/zzflg;

    .line 29
    .line 30
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzflg;->zzg:Ljava/lang/String;

    .line 31
    .line 32
    iput-object p1, v0, LG6/j;->d:Ljava/lang/String;

    .line 33
    .line 34
    return-object v0
.end method
