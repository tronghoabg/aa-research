.class public final LD6/t1;
.super LD6/A;
.source "SourceFile"


# instance fields
.field public final a:Lx6/d;

.field public final b:Lcom/google/android/gms/internal/ads/zzbss;


# direct methods
.method public constructor <init>(Lx6/d;Lcom/google/android/gms/internal/ads/zzbss;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LD6/A;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LD6/t1;->a:Lx6/d;

    .line 5
    .line 6
    iput-object p2, p0, LD6/t1;->b:Lcom/google/android/gms/internal/ads/zzbss;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final zzb()V
    .locals 2

    .line 1
    iget-object v0, p0, LD6/t1;->a:Lx6/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, LD6/t1;->b:Lcom/google/android/gms/internal/ads/zzbss;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lx6/d;->onAdLoaded(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final zzc(LD6/K0;)V
    .locals 1

    .line 1
    iget-object v0, p0, LD6/t1;->a:Lx6/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, LD6/K0;->W()Lx6/l;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {v0, p1}, Lx6/d;->onAdFailedToLoad(Lx6/l;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method
