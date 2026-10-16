.class final synthetic Lcom/google/android/gms/internal/ads/zzez;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/ads/zzfd;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzfd;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzez;->zza:Lcom/google/android/gms/internal/ads/zzfd;

    return-void
.end method


# virtual methods
.method public final synthetic handleMessage(Landroid/os/Message;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzez;->zza:Lcom/google/android/gms/internal/ads/zzfd;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzfd;->zzb(Landroid/os/Message;)Z

    move-result p1

    return p1
.end method
