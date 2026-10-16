.class Lcom/bytedance/sdk/openadsdk/component/xs$4;
.super Lcom/bytedance/sdk/openadsdk/core/orq;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/component/xs;->oa()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic oa:Lcom/bytedance/sdk/openadsdk/utils/pu;

.field uef:Z

.field final synthetic yo:Lcom/bytedance/sdk/openadsdk/component/xs;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/component/xs;Lcom/bytedance/sdk/openadsdk/utils/pu;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/xs$4;->yo:Lcom/bytedance/sdk/openadsdk/component/xs;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/xs$4;->oa:Lcom/bytedance/sdk/openadsdk/utils/pu;

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/core/orq;-><init>()V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/component/xs$4;->uef:Z

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public uef()Ljava/lang/String;
    .locals 4

    .line 1
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/component/xs/uef;->lw()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/common/sy;->uef()Lcom/bytedance/sdk/openadsdk/common/sy;

    move-result-object v0

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/xs$4;->yo:Lcom/bytedance/sdk/openadsdk/component/xs;

    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/component/xs;->yo(Lcom/bytedance/sdk/openadsdk/component/xs;)Lcom/bytedance/sdk/openadsdk/AdSlot;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/common/sy;->uef(Lcom/bytedance/sdk/openadsdk/AdSlot;)Lcom/bytedance/sdk/openadsdk/component/lw/oa;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/xs$4;->yo:Lcom/bytedance/sdk/openadsdk/component/xs;

    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/component/xs;->yo(Lcom/bytedance/sdk/openadsdk/component/xs;)Lcom/bytedance/sdk/openadsdk/AdSlot;

    move-result-object v1

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/lw/oa;->moa()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/bytedance/sdk/openadsdk/AdSlot;->setCacheTime(J)V

    .line 4
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/lw/oa;->oa()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/xs$4;->yo:Lcom/bytedance/sdk/openadsdk/component/xs;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/component/xs;->lw(Lcom/bytedance/sdk/openadsdk/component/xs;)Lcom/bytedance/sdk/openadsdk/component/ivm;

    move-result-object v0

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/xs$4;->yo:Lcom/bytedance/sdk/openadsdk/component/xs;

    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/component/xs;->moa(Lcom/bytedance/sdk/openadsdk/component/xs;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/component/ivm;->yo(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public uef(ILjava/lang/String;)V
    .locals 4

    .line 18
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/xs$4;->yo:Lcom/bytedance/sdk/openadsdk/component/xs;

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/component/xs;->uef(Lcom/bytedance/sdk/openadsdk/component/xs;I)I

    .line 19
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/xs$4;->yo:Lcom/bytedance/sdk/openadsdk/component/xs;

    new-instance v1, Lcom/bytedance/sdk/openadsdk/component/lw/yo;

    const/4 v2, 0x2

    const/16 v3, 0x64

    invoke-direct {v1, v2, v3, p1, p2}, Lcom/bytedance/sdk/openadsdk/component/lw/yo;-><init>(IIILjava/lang/String;)V

    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/component/xs;->uef(Lcom/bytedance/sdk/openadsdk/component/xs;Lcom/bytedance/sdk/openadsdk/component/lw/yo;)V

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/model/uef;Lcom/bytedance/sdk/openadsdk/core/model/yo;)V
    .locals 4

    if-nez p1, :cond_0

    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/uef;->xs()Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    move-result-object v0

    if-nez v0, :cond_1

    :goto_0
    return-void

    .line 21
    :cond_1
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/xs$4;->yo:Lcom/bytedance/sdk/openadsdk/component/xs;

    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/component/xs;->uef(Lcom/bytedance/sdk/openadsdk/component/xs;)Lcom/bytedance/sdk/openadsdk/core/model/fz;

    move-result-object v1

    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/model/fz;->zjm()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->yo(I)V

    .line 22
    iget-boolean v1, p0, Lcom/bytedance/sdk/openadsdk/component/xs$4;->uef:Z

    if-eqz v1, :cond_2

    .line 23
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/xs$4;->yo:Lcom/bytedance/sdk/openadsdk/component/xs;

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/component/xs;->lw(Lcom/bytedance/sdk/openadsdk/component/xs;)Lcom/bytedance/sdk/openadsdk/component/ivm;

    move-result-object p1

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->cl()Lcom/bytedance/sdk/openadsdk/AdSlot;

    move-result-object p2

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ofp()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, p2, v1}, Lcom/bytedance/sdk/openadsdk/component/ivm;->uef(Lcom/bytedance/sdk/openadsdk/AdSlot;Ljava/lang/String;)V

    .line 24
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/xs$4;->yo:Lcom/bytedance/sdk/openadsdk/component/xs;

    new-instance p2, Lcom/bytedance/sdk/openadsdk/component/lw/yo;

    const/16 v1, 0x65

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {p2, v3, v1, v0, v2}, Lcom/bytedance/sdk/openadsdk/component/lw/yo;-><init>(IILcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/core/model/uef;)V

    invoke-static {p1, p2}, Lcom/bytedance/sdk/openadsdk/component/xs;->uef(Lcom/bytedance/sdk/openadsdk/component/xs;Lcom/bytedance/sdk/openadsdk/component/lw/yo;)V

    return-void

    .line 25
    :cond_2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/xs$4;->yo:Lcom/bytedance/sdk/openadsdk/component/xs;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/component/xs;->yo(Lcom/bytedance/sdk/openadsdk/component/xs;)Lcom/bytedance/sdk/openadsdk/AdSlot;

    move-result-object v1

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/xs$4;->oa:Lcom/bytedance/sdk/openadsdk/utils/pu;

    invoke-static {v0, p1, p2, v1, v2}, Lcom/bytedance/sdk/openadsdk/component/xs;->uef(Lcom/bytedance/sdk/openadsdk/component/xs;Lcom/bytedance/sdk/openadsdk/core/model/uef;Lcom/bytedance/sdk/openadsdk/core/model/yo;Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/utils/pu;)V

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/model/uef;)Z
    .locals 3

    if-eqz p1, :cond_3

    .line 6
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/uef;->ivm()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 7
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/uef;->xs()Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 8
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->lw(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v1

    .line 9
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ku()Z

    move-result v2

    if-nez v2, :cond_2

    if-eqz v1, :cond_2

    invoke-static {}, Lcom/bytedance/sdk/openadsdk/component/xs/uef;->ivm()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 10
    :cond_0
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/xs$4;->yo:Lcom/bytedance/sdk/openadsdk/component/xs;

    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/component/xs;->lw(Lcom/bytedance/sdk/openadsdk/component/xs;)Lcom/bytedance/sdk/openadsdk/component/ivm;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/bytedance/sdk/openadsdk/component/ivm;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Ljava/lang/String;

    move-result-object v1

    .line 11
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    .line 12
    iput-boolean v1, p0, Lcom/bytedance/sdk/openadsdk/component/xs$4;->uef:Z

    .line 13
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/uef;->xs()Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    move-result-object p1

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/component/moa/uef;->oa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    goto :goto_1

    .line 14
    :cond_1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/xs$4;->yo:Lcom/bytedance/sdk/openadsdk/component/xs;

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/component/xs;->lw(Lcom/bytedance/sdk/openadsdk/component/xs;)Lcom/bytedance/sdk/openadsdk/component/ivm;

    move-result-object p1

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->cl()Lcom/bytedance/sdk/openadsdk/AdSlot;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/bytedance/sdk/openadsdk/component/ivm;->oa(Lcom/bytedance/sdk/openadsdk/AdSlot;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/component/xs$4;->uef:Z

    goto :goto_1

    .line 15
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/xs$4;->yo:Lcom/bytedance/sdk/openadsdk/component/xs;

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/component/xs;->lw(Lcom/bytedance/sdk/openadsdk/component/xs;)Lcom/bytedance/sdk/openadsdk/component/ivm;

    move-result-object p1

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->cl()Lcom/bytedance/sdk/openadsdk/AdSlot;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/bytedance/sdk/openadsdk/component/ivm;->oa(Lcom/bytedance/sdk/openadsdk/AdSlot;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/component/xs$4;->uef:Z

    .line 16
    :goto_1
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/dz/yo/moa;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    .line 17
    :cond_3
    iget-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/component/xs$4;->uef:Z

    return p1
.end method
