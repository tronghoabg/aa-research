.class public final Lcom/google/android/gms/internal/ads/zzcsl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzcsb;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzecz;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzecz;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcsl;->zza:Lcom/google/android/gms/internal/ads/zzecz;

    return-void
.end method


# virtual methods
.method public final zza(Lorg/json/JSONObject;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbix;->zzkL:Lcom/google/android/gms/internal/ads/zzbio;

    .line 2
    .line 3
    sget-object v1, LD6/s;->e:LD6/s;

    .line 4
    .line 5
    iget-object v1, v1, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcsl;->zza:Lcom/google/android/gms/internal/ads/zzecz;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzecz;->zzp(Lorg/json/JSONObject;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method
