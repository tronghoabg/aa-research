.class public final LD6/b;
.super LD6/p;
.source "SourceFile"


# instance fields
.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lcom/google/android/gms/internal/ads/zzbvf;


# direct methods
.method public constructor <init>(LD6/o;Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbvf;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, LD6/b;->b:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p3, p0, LD6/b;->c:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p4, p0, LD6/b;->d:Lcom/google/android/gms/internal/ads/zzbvf;

    .line 9
    .line 10
    invoke-static {p1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LD6/b;->b:Landroid/content/Context;

    .line 2
    .line 3
    const-string v1, "rewarded"

    .line 4
    .line 5
    invoke-static {v0, v1}, LD6/o;->k(Landroid/content/Context;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, LD6/l1;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzcco;-><init>()V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public final bridge synthetic b()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, LD6/b;->d:Lcom/google/android/gms/internal/ads/zzbvf;

    .line 2
    .line 3
    iget-object v1, p0, LD6/b;->b:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v2, p0, LD6/b;->c:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v1, v2, v0}, Lcom/google/android/gms/internal/ads/zzcdb;->zza(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbvj;)Lcom/google/android/gms/internal/ads/zzccp;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public final c(LD6/d0;)Ljava/lang/Object;
    .locals 4

    .line 1
    new-instance v0, Lq7/b;

    .line 2
    .line 3
    iget-object v1, p0, LD6/b;->b:Landroid/content/Context;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lq7/b;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, LD6/b;->d:Lcom/google/android/gms/internal/ads/zzbvf;

    .line 9
    .line 10
    const v2, 0xf9960b0

    .line 11
    .line 12
    .line 13
    iget-object v3, p0, LD6/b;->c:Ljava/lang/String;

    .line 14
    .line 15
    invoke-interface {p1, v0, v3, v1, v2}, LD6/d0;->A(Lq7/a;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbvj;I)Lcom/google/android/gms/internal/ads/zzccp;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1
.end method
