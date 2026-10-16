.class Lcom/bytedance/sdk/openadsdk/core/settings/dj$6$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/core/dj/moa;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/core/settings/dj$6;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/core/settings/dj$6;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/core/settings/dj$6;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/settings/dj$6$1;->uef:Lcom/bytedance/sdk/openadsdk/core/settings/dj$6;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public uef(Z)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    new-instance p1, Lcom/bytedance/sdk/openadsdk/core/settings/cz;

    .line 5
    .line 6
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/settings/dj$6$1;->uef:Lcom/bytedance/sdk/openadsdk/core/settings/dj$6;

    .line 7
    .line 8
    iget-object v1, v1, Lcom/bytedance/sdk/openadsdk/core/settings/dj$6;->oa:Lcom/bytedance/sdk/openadsdk/core/settings/dj;

    .line 9
    .line 10
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->uef(Lcom/bytedance/sdk/openadsdk/core/settings/dj;)Lcom/bytedance/sdk/openadsdk/core/settings/bcc;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/core/settings/dj$6$1;->uef:Lcom/bytedance/sdk/openadsdk/core/settings/dj$6;

    .line 15
    .line 16
    iget-object v3, v3, Lcom/bytedance/sdk/openadsdk/core/settings/dj$6;->oa:Lcom/bytedance/sdk/openadsdk/core/settings/dj;

    .line 17
    .line 18
    invoke-static {v3}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->oa(Lcom/bytedance/sdk/openadsdk/core/settings/dj;)Lcom/bytedance/sdk/openadsdk/core/settings/uef;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    const/4 v4, 0x1

    .line 23
    new-array v4, v4, [Lcom/bytedance/sdk/openadsdk/core/settings/lw;

    .line 24
    .line 25
    aput-object v3, v4, v0

    .line 26
    .line 27
    invoke-direct {p1, v1, v2, v4}, Lcom/bytedance/sdk/openadsdk/core/settings/cz;-><init>(Lcom/bytedance/sdk/openadsdk/core/settings/cz$uef;Lcom/bytedance/sdk/openadsdk/core/settings/bcc;[Lcom/bytedance/sdk/openadsdk/core/settings/lw;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/settings/cz;->run()V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/settings/dj$6$1;->uef:Lcom/bytedance/sdk/openadsdk/core/settings/dj$6;

    .line 35
    .line 36
    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/core/settings/dj$6;->oa:Lcom/bytedance/sdk/openadsdk/core/settings/dj;

    .line 37
    .line 38
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->yo(Lcom/bytedance/sdk/openadsdk/core/settings/dj;)Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 43
    .line 44
    .line 45
    return-void
.end method
