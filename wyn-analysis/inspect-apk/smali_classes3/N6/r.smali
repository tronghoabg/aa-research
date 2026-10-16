.class public final LN6/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzhbn;


# instance fields
.field public final a:Lcom/google/android/gms/internal/ads/zzhcp;

.field public final b:Lcom/google/android/gms/internal/ads/zzefn;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzhcp;Lcom/google/android/gms/internal/ads/zzefn;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LN6/r;->a:Lcom/google/android/gms/internal/ads/zzhcp;

    .line 5
    .line 6
    iput-object p2, p0, LN6/r;->b:Lcom/google/android/gms/internal/ads/zzefn;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final bridge synthetic zza(Ljava/lang/Object;)Lp8/p;
    .locals 3

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzcbk;

    .line 2
    .line 3
    iget-object v0, p0, LN6/r;->b:Lcom/google/android/gms/internal/ads/zzefn;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzefn;->zza(Lcom/google/android/gms/internal/ads/zzcbk;)Lp8/p;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, LN6/e;

    .line 10
    .line 11
    const/4 v2, 0x2

    .line 12
    invoke-direct {v1, p1, v2}, LN6/e;-><init>(Ljava/lang/Object;I)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, LN6/r;->a:Lcom/google/android/gms/internal/ads/zzhcp;

    .line 16
    .line 17
    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/ads/zzhcf;->zzj(Lp8/p;Lcom/google/android/gms/internal/ads/zzhbn;Ljava/util/concurrent/Executor;)Lp8/p;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
.end method
