.class final Lcom/google/android/gms/internal/ads/zzbzy;
.super Lcom/google/android/gms/internal/ads/zzcep;
.source "SourceFile"


# instance fields
.field final synthetic zza:LQ6/b;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzbzz;LQ6/b;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzbzy;->zza:LQ6/b;

    .line 2
    .line 3
    invoke-static {p1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzcep;-><init>()V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final zzb(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbzy;->zza:LQ6/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LQ6/b;->onFailure(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final zzc(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    new-instance p2, LQ6/a;

    .line 2
    .line 3
    new-instance p3, LD6/c1;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-direct {p3, p1, v0}, LD6/c1;-><init>(Ljava/lang/String;Z)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p2, p3}, LQ6/a;-><init>(LD6/c1;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbzy;->zza:LQ6/b;

    .line 13
    .line 14
    invoke-virtual {p1, p2}, LQ6/b;->onSuccess(LQ6/a;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
