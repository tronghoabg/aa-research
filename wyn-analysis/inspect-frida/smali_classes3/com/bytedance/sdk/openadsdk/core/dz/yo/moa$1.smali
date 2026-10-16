.class final Lcom/bytedance/sdk/openadsdk/core/dz/yo/moa$1;
.super Lcom/bytedance/sdk/component/xs/uef/uef;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/core/dz/yo/moa;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/core/model/lw$uef;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# instance fields
.field final synthetic moa:Ljava/lang/String;

.field final synthetic oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/core/model/lw$uef;

.field final synthetic yo:J


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/core/model/lw$uef;Lcom/bytedance/sdk/openadsdk/core/model/gzw;JLjava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/dz/yo/moa$1;->uef:Lcom/bytedance/sdk/openadsdk/core/model/lw$uef;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/dz/yo/moa$1;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 4
    .line 5
    iput-wide p3, p0, Lcom/bytedance/sdk/openadsdk/core/dz/yo/moa$1;->yo:J

    .line 6
    .line 7
    iput-object p5, p0, Lcom/bytedance/sdk/openadsdk/core/dz/yo/moa$1;->moa:Ljava/lang/String;

    .line 8
    .line 9
    invoke-direct {p0}, Lcom/bytedance/sdk/component/xs/uef/uef;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public uef(Lcom/bytedance/sdk/component/xs/oa/yo;Lcom/bytedance/sdk/component/xs/oa;)V
    .locals 5

    .line 1
    invoke-virtual {p2}, Lcom/bytedance/sdk/component/xs/oa;->ivm()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p2}, Lcom/bytedance/sdk/component/xs/oa;->lw()Ljava/io/File;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p2}, Lcom/bytedance/sdk/component/xs/oa;->lw()Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/dz/yo/moa$1;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {p2}, Lcom/bytedance/sdk/component/xs/oa;->lw()Ljava/io/File;

    move-result-object p2

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/yo/moa$1;->uef:Lcom/bytedance/sdk/openadsdk/core/model/lw$uef;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    iget-wide v3, p0, Lcom/bytedance/sdk/openadsdk/core/dz/yo/moa$1;->yo:J

    sub-long/2addr v1, v3

    invoke-static {p1, p2, v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/core/dz/yo/moa;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/io/File;Lcom/bytedance/sdk/openadsdk/core/model/lw$uef;J)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/dz/yo/moa$1;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/dz/yo/moa$1;->uef:Lcom/bytedance/sdk/openadsdk/core/model/lw$uef;

    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/core/model/lw$uef;->yo()Ljava/lang/String;

    move-result-object p2

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/bytedance/sdk/openadsdk/core/dz/yo/moa$1;->yo:J

    sub-long/2addr v0, v2

    const/4 v2, 0x0

    invoke-static {p1, p2, v2, v0, v1}, Lcom/bytedance/sdk/openadsdk/core/dz/yo/moa;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;ZJ)V

    .line 4
    :goto_0
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/dz/yo/moa;->uef()Lj$/util/concurrent/ConcurrentHashMap;

    move-result-object p1

    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/dz/yo/moa$1;->moa:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lj$/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/component/xs/oa/yo;Ljava/io/IOException;)V
    .locals 4

    .line 5
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/dz/yo/moa$1;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/dz/yo/moa$1;->uef:Lcom/bytedance/sdk/openadsdk/core/model/lw$uef;

    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/core/model/lw$uef;->yo()Ljava/lang/String;

    move-result-object p2

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/bytedance/sdk/openadsdk/core/dz/yo/moa$1;->yo:J

    sub-long/2addr v0, v2

    const/4 v2, 0x0

    invoke-static {p1, p2, v2, v0, v1}, Lcom/bytedance/sdk/openadsdk/core/dz/yo/moa;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;ZJ)V

    .line 6
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/dz/yo/moa;->uef()Lj$/util/concurrent/ConcurrentHashMap;

    move-result-object p1

    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/dz/yo/moa$1;->moa:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lj$/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
