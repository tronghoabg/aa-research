.class public final LD6/e1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx6/m;


# instance fields
.field public final a:Lcom/google/android/gms/internal/ads/zzbmi;

.field public final b:Lcom/google/android/gms/internal/ads/zzbnc;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzbmi;Lcom/google/android/gms/internal/ads/zzbnc;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/google/android/gms/ads/VideoController;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/google/android/gms/ads/VideoController;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LD6/e1;->a:Lcom/google/android/gms/internal/ads/zzbmi;

    .line 10
    .line 11
    iput-object p2, p0, LD6/e1;->b:Lcom/google/android/gms/internal/ads/zzbnc;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, LD6/e1;->a:Lcom/google/android/gms/internal/ads/zzbmi;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzbmi;->zzk()Z

    .line 4
    .line 5
    .line 6
    move-result v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    return v0

    .line 8
    :catch_0
    move-exception v0

    .line 9
    const-string v1, ""

    .line 10
    .line 11
    invoke-static {v1, v0}, LH6/l;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    return v0
.end method
