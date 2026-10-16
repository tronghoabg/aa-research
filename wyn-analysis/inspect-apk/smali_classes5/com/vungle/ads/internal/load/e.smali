.class public final Lcom/vungle/ads/internal/load/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lcom/vungle/ads/internal/load/g;

.field public final synthetic b:Lcom/vungle/ads/internal/model/h0;


# direct methods
.method public constructor <init>(Lcom/vungle/ads/internal/load/g;Lcom/vungle/ads/internal/model/h0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/vungle/ads/internal/load/e;->a:Lcom/vungle/ads/internal/load/g;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/vungle/ads/internal/load/e;->b:Lcom/vungle/ads/internal/model/h0;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/vungle/ads/internal/load/e;->a:Lcom/vungle/ads/internal/load/g;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/vungle/ads/internal/load/g;->w:Lcom/vungle/ads/internal/n2;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/vungle/ads/internal/n2;->d()V

    .line 6
    .line 7
    .line 8
    sget-object v0, Lcom/vungle/ads/internal/AnalyticsClient;->INSTANCE:Lcom/vungle/ads/internal/AnalyticsClient;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/vungle/ads/internal/load/e;->a:Lcom/vungle/ads/internal/load/g;

    .line 11
    .line 12
    iget-object v2, v1, Lcom/vungle/ads/internal/load/g;->w:Lcom/vungle/ads/internal/n2;

    .line 13
    .line 14
    iget-object v1, v1, Lcom/vungle/ads/internal/load/g;->x:Lcom/vungle/ads/internal/util/s;

    .line 15
    .line 16
    const/4 v3, 0x4

    .line 17
    invoke-static {v0, v2, v1, v3}, Lcom/vungle/ads/internal/AnalyticsClient;->a(Lcom/vungle/ads/internal/AnalyticsClient;Lcom/vungle/ads/internal/n2;Lcom/vungle/ads/internal/util/s;I)V

    .line 18
    .line 19
    .line 20
    sget-boolean v0, Lcom/vungle/ads/internal/util/u;->a:Z

    .line 21
    .line 22
    const-string v0, "BaseAdLoader"

    .line 23
    .line 24
    const-string v1, "fail to load ad"

    .line 25
    .line 26
    invoke-static {v0, v1}, Lcom/vungle/ads/internal/util/t;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lcom/vungle/ads/internal/load/e;->a:Lcom/vungle/ads/internal/load/g;

    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/vungle/ads/internal/load/g;->i()V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lcom/vungle/ads/internal/load/e;->a:Lcom/vungle/ads/internal/load/g;

    .line 35
    .line 36
    iget-object v0, v0, Lcom/vungle/ads/internal/load/g;->j:Lcom/vungle/ads/internal/load/a;

    .line 37
    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    iget-object v1, p0, Lcom/vungle/ads/internal/load/e;->b:Lcom/vungle/ads/internal/model/h0;

    .line 41
    .line 42
    invoke-interface {v0, v1}, Lcom/vungle/ads/internal/load/a;->onSuccess(Lcom/vungle/ads/internal/model/h0;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    return-void
.end method

.method public final b()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/vungle/ads/internal/load/e;->a:Lcom/vungle/ads/internal/load/g;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/vungle/ads/internal/load/g;->w:Lcom/vungle/ads/internal/n2;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/vungle/ads/internal/n2;->d()V

    .line 6
    .line 7
    .line 8
    sget-object v0, Lcom/vungle/ads/internal/AnalyticsClient;->INSTANCE:Lcom/vungle/ads/internal/AnalyticsClient;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/vungle/ads/internal/load/e;->a:Lcom/vungle/ads/internal/load/g;

    .line 11
    .line 12
    iget-object v2, v1, Lcom/vungle/ads/internal/load/g;->w:Lcom/vungle/ads/internal/n2;

    .line 13
    .line 14
    iget-object v1, v1, Lcom/vungle/ads/internal/load/g;->x:Lcom/vungle/ads/internal/util/s;

    .line 15
    .line 16
    const/4 v3, 0x4

    .line 17
    invoke-static {v0, v2, v1, v3}, Lcom/vungle/ads/internal/AnalyticsClient;->a(Lcom/vungle/ads/internal/AnalyticsClient;Lcom/vungle/ads/internal/n2;Lcom/vungle/ads/internal/util/s;I)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lcom/vungle/ads/internal/load/e;->a:Lcom/vungle/ads/internal/load/g;

    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/vungle/ads/internal/load/g;->i()V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lcom/vungle/ads/internal/load/e;->a:Lcom/vungle/ads/internal/load/g;

    .line 26
    .line 27
    iget-object v0, v0, Lcom/vungle/ads/internal/load/g;->j:Lcom/vungle/ads/internal/load/a;

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    iget-object v1, p0, Lcom/vungle/ads/internal/load/e;->b:Lcom/vungle/ads/internal/model/h0;

    .line 32
    .line 33
    invoke-interface {v0, v1}, Lcom/vungle/ads/internal/load/a;->onSuccess(Lcom/vungle/ads/internal/model/h0;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void
.end method
