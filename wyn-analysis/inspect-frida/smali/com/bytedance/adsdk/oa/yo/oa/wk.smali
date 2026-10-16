.class public Lcom/bytedance/adsdk/oa/yo/oa/wk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/adsdk/oa/yo/oa/yo;


# instance fields
.field private final ivm:Z

.field private final lw:Lcom/bytedance/adsdk/oa/yo/uef/moa;

.field private final moa:Lcom/bytedance/adsdk/oa/yo/uef/uef;

.field private final oa:Landroid/graphics/Path$FillType;

.field private final uef:Z

.field private final yo:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLandroid/graphics/Path$FillType;Lcom/bytedance/adsdk/oa/yo/uef/uef;Lcom/bytedance/adsdk/oa/yo/uef/moa;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bytedance/adsdk/oa/yo/oa/wk;->yo:Ljava/lang/String;

    .line 5
    .line 6
    iput-boolean p2, p0, Lcom/bytedance/adsdk/oa/yo/oa/wk;->uef:Z

    .line 7
    .line 8
    iput-object p3, p0, Lcom/bytedance/adsdk/oa/yo/oa/wk;->oa:Landroid/graphics/Path$FillType;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/bytedance/adsdk/oa/yo/oa/wk;->moa:Lcom/bytedance/adsdk/oa/yo/uef/uef;

    .line 11
    .line 12
    iput-object p5, p0, Lcom/bytedance/adsdk/oa/yo/oa/wk;->lw:Lcom/bytedance/adsdk/oa/yo/uef/moa;

    .line 13
    .line 14
    iput-boolean p6, p0, Lcom/bytedance/adsdk/oa/yo/oa/wk;->ivm:Z

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public lw()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/adsdk/oa/yo/oa/wk;->ivm:Z

    .line 2
    .line 3
    return v0
.end method

.method public moa()Landroid/graphics/Path$FillType;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/yo/oa/wk;->oa:Landroid/graphics/Path$FillType;

    .line 2
    .line 3
    return-object v0
.end method

.method public oa()Lcom/bytedance/adsdk/oa/yo/uef/uef;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/yo/oa/wk;->moa:Lcom/bytedance/adsdk/oa/yo/uef/uef;

    .line 2
    .line 3
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "ShapeFill{color=, fillEnabled="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-boolean v1, p0, Lcom/bytedance/adsdk/oa/yo/oa/wk;->uef:Z

    .line 9
    .line 10
    const/16 v2, 0x7d

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, LA7/p0;->p(Ljava/lang/StringBuilder;ZC)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
.end method

.method public uef(Lcom/bytedance/adsdk/oa/cz;Lcom/bytedance/adsdk/oa/xs;Lcom/bytedance/adsdk/oa/yo/yo/uef;)Lcom/bytedance/adsdk/oa/uef/uef/yo;
    .locals 0

    .line 2
    new-instance p2, Lcom/bytedance/adsdk/oa/uef/uef/xs;

    invoke-direct {p2, p1, p3, p0}, Lcom/bytedance/adsdk/oa/uef/uef/xs;-><init>(Lcom/bytedance/adsdk/oa/cz;Lcom/bytedance/adsdk/oa/yo/yo/uef;Lcom/bytedance/adsdk/oa/yo/oa/wk;)V

    return-object p2
.end method

.method public uef()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/yo/oa/wk;->yo:Ljava/lang/String;

    return-object v0
.end method

.method public yo()Lcom/bytedance/adsdk/oa/yo/uef/moa;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/yo/oa/wk;->lw:Lcom/bytedance/adsdk/oa/yo/uef/moa;

    .line 2
    .line 3
    return-object v0
.end method
