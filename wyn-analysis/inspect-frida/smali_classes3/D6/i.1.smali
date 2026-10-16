.class public final LD6/i;
.super LD6/p;
.source "SourceFile"


# instance fields
.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:LD6/x1;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Lcom/google/android/gms/internal/ads/zzbvj;

.field public final synthetic f:LD6/o;


# direct methods
.method public constructor <init>(LD6/o;Landroid/content/Context;LD6/x1;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbvj;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, LD6/i;->b:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p3, p0, LD6/i;->c:LD6/x1;

    .line 7
    .line 8
    iput-object p4, p0, LD6/i;->d:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p5, p0, LD6/i;->e:Lcom/google/android/gms/internal/ads/zzbvj;

    .line 11
    .line 12
    invoke-static {p1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, LD6/i;->f:LD6/o;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LD6/i;->b:Landroid/content/Context;

    .line 2
    .line 3
    const-string v1, "app_open"

    .line 4
    .line 5
    invoke-static {v0, v1}, LD6/o;->k(Landroid/content/Context;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, LD6/i1;

    .line 9
    .line 10
    invoke-direct {v0}, LD6/K;-><init>()V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public final synthetic b()Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, LD6/i;->f:LD6/o;

    .line 2
    .line 3
    iget-object v0, v0, LD6/o;->a:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v1, v0

    .line 6
    check-cast v1, LD6/u1;

    .line 7
    .line 8
    iget-object v5, p0, LD6/i;->e:Lcom/google/android/gms/internal/ads/zzbvj;

    .line 9
    .line 10
    const/4 v6, 0x4

    .line 11
    iget-object v2, p0, LD6/i;->b:Landroid/content/Context;

    .line 12
    .line 13
    iget-object v3, p0, LD6/i;->c:LD6/x1;

    .line 14
    .line 15
    iget-object v4, p0, LD6/i;->d:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual/range {v1 .. v6}, LD6/u1;->a(Landroid/content/Context;LD6/x1;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbvj;I)LD6/L;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0
.end method

.method public final c(LD6/d0;)Ljava/lang/Object;
    .locals 6

    .line 1
    new-instance v1, Lq7/b;

    .line 2
    .line 3
    iget-object v0, p0, LD6/i;->b:Landroid/content/Context;

    .line 4
    .line 5
    invoke-direct {v1, v0}, Lq7/b;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object v2, p0, LD6/i;->c:LD6/x1;

    .line 9
    .line 10
    iget-object v3, p0, LD6/i;->d:Ljava/lang/String;

    .line 11
    .line 12
    iget-object v4, p0, LD6/i;->e:Lcom/google/android/gms/internal/ads/zzbvj;

    .line 13
    .line 14
    const v5, 0xf9960b0

    .line 15
    .line 16
    .line 17
    move-object v0, p1

    .line 18
    invoke-interface/range {v0 .. v5}, LD6/d0;->O(Lq7/a;LD6/x1;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbvj;I)LD6/L;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
.end method
