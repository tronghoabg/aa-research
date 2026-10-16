.class public Lcom/bytedance/sdk/openadsdk/core/zjm/dz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/adsdk/ugeno/core/sy;
.implements Lcom/bytedance/sdk/component/adexpress/oa/cz;


# instance fields
.field private ivm:Z

.field private lw:J

.field private final moa:Ljava/lang/String;

.field private final oa:Ljava/lang/String;

.field private final uef:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

.field private final yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/moa/moa/lw;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/dz;->uef:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/dz;->oa:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/dz;->moa:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/dz;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 11
    .line 12
    iput-boolean p5, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/dz;->ivm:Z

    .line 13
    .line 14
    return-void
.end method

.method public static synthetic oa(Lcom/bytedance/sdk/openadsdk/core/zjm/dz;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/dz;->oa:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/core/zjm/dz;)Lcom/bytedance/sdk/openadsdk/core/model/gzw;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/dz;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    return-object p0
.end method


# virtual methods
.method public bcc()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/dz;->uef:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/moa/moa/moa;->dz()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public cz()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/dz;->uef:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/moa/moa/moa;->oa()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public ivm()V
    .locals 2

    .line 7
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/dz;->uef:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/bytedance/sdk/openadsdk/moa/moa/lw;->uef(Z)V

    .line 8
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/dz;->uef:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/moa/moa/oa;->wrv()V

    .line 9
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/zjm/dz$2;

    const-string v1, "native_success"

    invoke-direct {v0, p0, v1}, Lcom/bytedance/sdk/openadsdk/core/zjm/dz$2;-><init>(Lcom/bytedance/sdk/openadsdk/core/zjm/dz;Ljava/lang/String;)V

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/utils/km;->oa(Lcom/bytedance/sdk/component/bcc/oa/yo;I)V

    return-void
.end method

.method public ivm(I)V
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    .line 2
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/dz;->uef:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    const-string v0, "dynamic_render2_success"

    invoke-interface {p1, v0}, Lcom/bytedance/sdk/openadsdk/moa/moa/uef;->xs(Ljava/lang/String;)V

    .line 3
    const-string p1, "dynamic2_render"

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/dz;->uef:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    const-string v0, "dynamic_render_success"

    invoke-interface {p1, v0}, Lcom/bytedance/sdk/openadsdk/moa/moa/uef;->xs(Ljava/lang/String;)V

    const-string p1, "dynamic_backup_native_render"

    .line 5
    :goto_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/dz;->uef:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/bytedance/sdk/openadsdk/moa/moa/lw;->uef(Z)V

    .line 6
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/zjm/dz$1;

    const-string v1, "dynamic_success"

    invoke-direct {v0, p0, v1, p1}, Lcom/bytedance/sdk/openadsdk/core/zjm/dz$1;-><init>(Lcom/bytedance/sdk/openadsdk/core/zjm/dz;Ljava/lang/String;Ljava/lang/String;)V

    const/16 p1, 0xa

    invoke-static {v0, p1}, Lcom/bytedance/sdk/openadsdk/utils/km;->oa(Lcom/bytedance/sdk/component/bcc/oa/yo;I)V

    return-void
.end method

.method public lw()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/dz;->uef:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/moa/moa/moa;->oa()V

    return-void
.end method

.method public lw(I)V
    .locals 1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    .line 2
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/dz;->uef:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    const-string v0, "dynamic_sub_render2_end"

    invoke-interface {p1, v0}, Lcom/bytedance/sdk/openadsdk/moa/moa/uef;->moa(Ljava/lang/String;)V

    return-void

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/dz;->uef:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    const-string v0, "dynamic_sub_render_end"

    invoke-interface {p1, v0}, Lcom/bytedance/sdk/openadsdk/moa/moa/uef;->moa(Ljava/lang/String;)V

    return-void
.end method

.method public moa()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/dz;->uef:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/moa/moa/moa;->uef()V

    return-void
.end method

.method public moa(I)V
    .locals 1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    .line 2
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/dz;->uef:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    const-string v0, "dynamic_sub_render2_start"

    invoke-interface {p1, v0}, Lcom/bytedance/sdk/openadsdk/moa/moa/uef;->moa(Ljava/lang/String;)V

    return-void

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/dz;->uef:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    const-string v0, "dynamic_sub_render_start"

    invoke-interface {p1, v0}, Lcom/bytedance/sdk/openadsdk/moa/moa/uef;->moa(Ljava/lang/String;)V

    return-void
.end method

.method public oa()V
    .locals 2

    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/dz;->uef:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    const-string v1, "ugen_sub_analysis_end"

    invoke-interface {v0, v1}, Lcom/bytedance/sdk/openadsdk/moa/moa/uef;->lw(Ljava/lang/String;)V

    return-void
.end method

.method public oa(I)V
    .locals 1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    .line 2
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/dz;->uef:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    const-string v0, "dynamic_sub_analysis2_start"

    invoke-interface {p1, v0}, Lcom/bytedance/sdk/openadsdk/moa/moa/uef;->moa(Ljava/lang/String;)V

    return-void

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/dz;->uef:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    const-string v0, "dynamic_sub_analysis_start"

    invoke-interface {p1, v0}, Lcom/bytedance/sdk/openadsdk/moa/moa/uef;->moa(Ljava/lang/String;)V

    return-void
.end method

.method public uef()V
    .locals 3

    .line 12
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/dz;->uef:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    const-string v1, "ugen_render_start"

    iget-boolean v2, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/dz;->ivm:Z

    invoke-interface {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/moa/moa/uef;->uef(Ljava/lang/String;Z)V

    .line 13
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/dz;->uef:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    const-string v1, "ugen_sub_analysis_start"

    invoke-interface {v0, v1}, Lcom/bytedance/sdk/openadsdk/moa/moa/uef;->lw(Ljava/lang/String;)V

    return-void
.end method

.method public uef(I)V
    .locals 2

    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/dz;->lw:J

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    .line 6
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/dz;->uef:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    const-string v0, "dynamic_render2_start"

    invoke-interface {p1, v0}, Lcom/bytedance/sdk/openadsdk/moa/moa/uef;->yo(Ljava/lang/String;)V

    return-void

    .line 7
    :cond_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/dz;->uef:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    const-string v0, "dynamic_render_start"

    invoke-interface {p1, v0}, Lcom/bytedance/sdk/openadsdk/moa/moa/uef;->yo(Ljava/lang/String;)V

    return-void
.end method

.method public uef(IILjava/lang/String;Z)V
    .locals 6

    if-nez p4, :cond_0

    .line 8
    iget-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/dz;->uef:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    const/4 v0, 0x1

    invoke-interface {p4, v0}, Lcom/bytedance/sdk/openadsdk/moa/moa/lw;->uef(Z)V

    :cond_0
    const/4 p4, 0x3

    if-ne p1, p4, :cond_1

    .line 9
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/dz;->uef:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    const-string p4, "dynamic_render2_error"

    invoke-interface {p1, p2, p4}, Lcom/bytedance/sdk/openadsdk/moa/moa/uef;->oa(ILjava/lang/String;)V

    goto :goto_0

    .line 10
    :cond_1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/dz;->uef:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    const-string p4, "dynamic_render_error"

    invoke-interface {p1, p2, p4}, Lcom/bytedance/sdk/openadsdk/moa/moa/uef;->oa(ILjava/lang/String;)V

    .line 11
    :goto_0
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/dz;->oa:Ljava/lang/String;

    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/dz;->moa:Ljava/lang/String;

    iget-object v5, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/dz;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    const-string v0, "NDR"

    move v1, p2

    move-object v2, p3

    invoke-static/range {v0 .. v5}, Lcom/bytedance/sdk/openadsdk/core/zjm/wrv;->uef(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    return-void
.end method

.method public uef(ILjava/lang/String;)V
    .locals 7

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/dz;->uef:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    invoke-interface {v0, p1, p2}, Lcom/bytedance/sdk/openadsdk/moa/moa/moa;->uef(ILjava/lang/String;)V

    .line 4
    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/dz;->oa:Ljava/lang/String;

    iget-object v5, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/dz;->moa:Ljava/lang/String;

    iget-object v6, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/dz;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    const-string v1, "Web"

    move v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lcom/bytedance/sdk/openadsdk/core/zjm/wrv;->uef(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    return-void
.end method

.method public uef(Lcom/bytedance/adsdk/ugeno/core/bs;)V
    .locals 9

    .line 14
    invoke-virtual {p1}, Lcom/bytedance/adsdk/ugeno/core/bs;->uef()I

    move-result v0

    if-nez v0, :cond_0

    .line 15
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/dz;->uef:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    const-string v0, "ugen_sub_render_end"

    invoke-interface {p1, v0}, Lcom/bytedance/sdk/openadsdk/moa/moa/uef;->lw(Ljava/lang/String;)V

    .line 16
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/dz;->uef:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    const-string v0, "ugen_render_success"

    invoke-interface {p1, v0}, Lcom/bytedance/sdk/openadsdk/moa/moa/uef;->ivm(Ljava/lang/String;)V

    goto :goto_0

    .line 17
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/dz;->uef:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    invoke-virtual {p1}, Lcom/bytedance/adsdk/ugeno/core/bs;->uef()I

    move-result v1

    const-string v2, "ugen_render_error"

    invoke-interface {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/moa/moa/uef;->yo(ILjava/lang/String;)V

    .line 18
    invoke-virtual {p1}, Lcom/bytedance/adsdk/ugeno/core/bs;->uef()I

    move-result v4

    invoke-virtual {p1}, Lcom/bytedance/adsdk/ugeno/core/bs;->oa()Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/dz;->oa:Ljava/lang/String;

    iget-object v7, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/dz;->moa:Ljava/lang/String;

    iget-object v8, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/dz;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    const-string v3, "UGen"

    invoke-static/range {v3 .. v8}, Lcom/bytedance/sdk/openadsdk/core/zjm/wrv;->uef(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    .line 19
    :goto_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/dz;->uef:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Lcom/bytedance/sdk/openadsdk/moa/moa/lw;->uef(Z)V

    return-void
.end method

.method public uef(Z)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/dz;->uef:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    invoke-interface {v0, p1}, Lcom/bytedance/sdk/openadsdk/moa/moa/ivm;->oa(I)V

    return-void
.end method

.method public xs()V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/dz;->uef:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/moa/moa/oa;->cq()V

    return-void
.end method

.method public xs(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/dz;->uef:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    invoke-interface {v0, p1}, Lcom/bytedance/sdk/openadsdk/moa/moa/oa;->uef(I)V

    return-void
.end method

.method public yo()V
    .locals 2

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/dz;->uef:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    const-string v1, "ugen_sub_render_start"

    invoke-interface {v0, v1}, Lcom/bytedance/sdk/openadsdk/moa/moa/uef;->lw(Ljava/lang/String;)V

    return-void
.end method

.method public yo(I)V
    .locals 1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    .line 1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/dz;->uef:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    const-string v0, "dynamic_sub_analysis2_end"

    invoke-interface {p1, v0}, Lcom/bytedance/sdk/openadsdk/moa/moa/uef;->moa(Ljava/lang/String;)V

    return-void

    .line 2
    :cond_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/dz;->uef:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    const-string v0, "dynamic_sub_analysis_end"

    invoke-interface {p1, v0}, Lcom/bytedance/sdk/openadsdk/moa/moa/uef;->moa(Ljava/lang/String;)V

    return-void
.end method

.method public zjm()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/dz;->uef:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/moa/moa/lw;->zjm()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/dz;->uef:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    .line 7
    .line 8
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/moa/moa/lw;->dj()V

    .line 9
    .line 10
    .line 11
    return-void
.end method
