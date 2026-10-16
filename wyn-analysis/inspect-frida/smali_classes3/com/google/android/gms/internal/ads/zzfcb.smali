.class final synthetic Lcom/google/android/gms/internal/ads/zzfcb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/ads/zzfcc;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzfcc;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfcb;->zza:Lcom/google/android/gms/internal/ads/zzfcc;

    return-void
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfcb;->zza:Lcom/google/android/gms/internal/ads/zzfcc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfcc;->zzc()Lcom/google/android/gms/internal/ads/zzfcd;

    move-result-object v0

    return-object v0
.end method
