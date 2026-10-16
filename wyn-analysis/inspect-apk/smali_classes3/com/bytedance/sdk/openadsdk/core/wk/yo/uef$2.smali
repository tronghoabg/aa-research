.class Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef$2;
.super Lcom/bytedance/sdk/component/xs/uef/uef;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef$uef;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic lw:Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef;

.field final synthetic moa:Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef$uef;

.field final synthetic oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

.field final synthetic uef:Ljava/lang/String;

.field final synthetic yo:Ljava/io/File;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/io/File;Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef$uef;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef$2;->lw:Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef$2;->uef:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef$2;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef$2;->yo:Ljava/io/File;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef$2;->moa:Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef$uef;

    .line 10
    .line 11
    invoke-direct {p0}, Lcom/bytedance/sdk/component/xs/uef/uef;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public uef(Lcom/bytedance/sdk/component/xs/oa/yo;Lcom/bytedance/sdk/component/xs/oa;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef$2;->lw:Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef;

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef;->moa(Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef;)Ljava/util/Set;

    move-result-object p1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef$2;->uef:Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 2
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef$2;->lw:Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef;

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef;->lw(Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef;)Lj$/util/concurrent/ConcurrentHashMap;

    move-result-object p1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef$2;->uef:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lj$/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef$2;->lw:Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef;

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef;->ivm(Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef;)Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef$2;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef$oa;

    if-eqz p1, :cond_0

    .line 4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef$oa;->oa(J)Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef$oa;

    .line 5
    :cond_0
    invoke-virtual {p2}, Lcom/bytedance/sdk/component/xs/oa;->ivm()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Lcom/bytedance/sdk/component/xs/oa;->lw()Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Lcom/bytedance/sdk/component/xs/oa;->lw()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef$2$1;

    const-string v1, "downloadZip"

    invoke-direct {v0, p0, v1, p1, p2}, Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef$2$1;-><init>(Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef$2;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef$oa;Lcom/bytedance/sdk/component/xs/oa;)V

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/utils/km;->yo(Ljava/lang/Runnable;)V

    return-void

    .line 7
    :cond_1
    invoke-virtual {p2}, Lcom/bytedance/sdk/component/xs/oa;->uef()I

    move-result p1

    if-eqz p1, :cond_2

    .line 8
    invoke-virtual {p2}, Lcom/bytedance/sdk/component/xs/oa;->uef()I

    move-result p1

    goto :goto_0

    :cond_2
    const/16 p1, -0x2bc

    .line 9
    :goto_0
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef$2;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    const/4 v0, 0x0

    invoke-static {p2, p1, v0}, Lcom/bytedance/sdk/openadsdk/core/wk/yo/oa;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;ILjava/lang/String;)V

    .line 10
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef$2;->lw:Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef;

    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef$2;->moa:Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef$uef;

    const/4 v0, 0x0

    invoke-static {p1, p2, v0}, Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef;Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef$uef;Z)V

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/component/xs/oa/yo;Ljava/io/IOException;)V
    .locals 1

    .line 11
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef$2;->lw:Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef;

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef;->moa(Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef;)Ljava/util/Set;

    move-result-object p1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef$2;->uef:Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 12
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef$2;->lw:Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef;

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef;->lw(Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef;)Lj$/util/concurrent/ConcurrentHashMap;

    move-result-object p1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef$2;->uef:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lj$/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef$2;->lw:Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef;

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef;->ivm(Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef;)Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef$2;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    .line 15
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef$2;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    const/16 v0, -0x2bc

    invoke-static {p2, v0, p1}, Lcom/bytedance/sdk/openadsdk/core/wk/yo/oa;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;ILjava/lang/String;)V

    .line 16
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef$2;->lw:Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef;

    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef$2;->moa:Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef$uef;

    const/4 v0, 0x0

    invoke-static {p1, p2, v0}, Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef;Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef$uef;Z)V

    return-void
.end method
