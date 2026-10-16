.class public Lcom/bytedance/adsdk/oa/yo/oa/oa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/adsdk/oa/yo/oa/yo;


# instance fields
.field private final lw:Z

.field private final moa:Z

.field private final oa:Lcom/bytedance/adsdk/oa/yo/uef/cq;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bytedance/adsdk/oa/yo/uef/cq<",
            "Landroid/graphics/PointF;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field private final uef:Ljava/lang/String;

.field private final yo:Lcom/bytedance/adsdk/oa/yo/uef/ivm;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/bytedance/adsdk/oa/yo/uef/cq;Lcom/bytedance/adsdk/oa/yo/uef/ivm;ZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/bytedance/adsdk/oa/yo/uef/cq<",
            "Landroid/graphics/PointF;",
            "Landroid/graphics/PointF;",
            ">;",
            "Lcom/bytedance/adsdk/oa/yo/uef/ivm;",
            "ZZ)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bytedance/adsdk/oa/yo/oa/oa;->uef:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/bytedance/adsdk/oa/yo/oa/oa;->oa:Lcom/bytedance/adsdk/oa/yo/uef/cq;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/bytedance/adsdk/oa/yo/oa/oa;->yo:Lcom/bytedance/adsdk/oa/yo/uef/ivm;

    .line 9
    .line 10
    iput-boolean p4, p0, Lcom/bytedance/adsdk/oa/yo/oa/oa;->moa:Z

    .line 11
    .line 12
    iput-boolean p5, p0, Lcom/bytedance/adsdk/oa/yo/oa/oa;->lw:Z

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public lw()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/adsdk/oa/yo/oa/oa;->lw:Z

    .line 2
    .line 3
    return v0
.end method

.method public moa()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/adsdk/oa/yo/oa/oa;->moa:Z

    .line 2
    .line 3
    return v0
.end method

.method public oa()Lcom/bytedance/adsdk/oa/yo/uef/cq;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/bytedance/adsdk/oa/yo/uef/cq<",
            "Landroid/graphics/PointF;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/yo/oa/oa;->oa:Lcom/bytedance/adsdk/oa/yo/uef/cq;

    .line 2
    .line 3
    return-object v0
.end method

.method public uef(Lcom/bytedance/adsdk/oa/cz;Lcom/bytedance/adsdk/oa/xs;Lcom/bytedance/adsdk/oa/yo/yo/uef;)Lcom/bytedance/adsdk/oa/uef/uef/yo;
    .locals 0

    .line 1
    new-instance p2, Lcom/bytedance/adsdk/oa/uef/uef/ivm;

    invoke-direct {p2, p1, p3, p0}, Lcom/bytedance/adsdk/oa/uef/uef/ivm;-><init>(Lcom/bytedance/adsdk/oa/cz;Lcom/bytedance/adsdk/oa/yo/yo/uef;Lcom/bytedance/adsdk/oa/yo/oa/oa;)V

    return-object p2
.end method

.method public uef()Ljava/lang/String;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/yo/oa/oa;->uef:Ljava/lang/String;

    return-object v0
.end method

.method public yo()Lcom/bytedance/adsdk/oa/yo/uef/ivm;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/yo/oa/oa;->yo:Lcom/bytedance/adsdk/oa/yo/uef/ivm;

    .line 2
    .line 3
    return-object v0
.end method
