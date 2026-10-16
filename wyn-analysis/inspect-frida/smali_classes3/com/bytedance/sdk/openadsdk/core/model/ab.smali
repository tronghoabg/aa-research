.class public Lcom/bytedance/sdk/openadsdk/core/model/ab;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/component/adexpress/yo;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;
    }
.end annotation


# instance fields
.field public ab:Ljava/lang/String;

.field public bcc:I

.field public bs:I

.field public cq:Lorg/json/JSONObject;

.field public cz:Lorg/json/JSONObject;

.field public final dj:Z

.field public dz:Z

.field public final ivm:J

.field public final lw:J

.field public final moa:F

.field public final oa:F

.field public final uef:F

.field public wk:I

.field public wrv:I

.field public final xs:Ljava/lang/String;

.field public final yo:F

.field public zjm:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lcom/bytedance/sdk/openadsdk/core/yo/yo$uef;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/ab;->dz:Z

    .line 4
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->uef(Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;)F

    move-result v0

    iput v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/ab;->uef:F

    .line 5
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->oa(Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;)F

    move-result v0

    iput v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/ab;->oa:F

    .line 6
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->yo(Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;)F

    move-result v0

    iput v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/ab;->yo:F

    .line 7
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->moa(Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;)F

    move-result v0

    iput v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/ab;->moa:F

    .line 8
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->lw(Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/ab;->lw:J

    .line 9
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->ivm(Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/ab;->ivm:J

    .line 10
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->xs(Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/ab;->xs:Ljava/lang/String;

    .line 11
    iget-object v0, p1, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->uef:Landroid/util/SparseArray;

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/ab;->zjm:Landroid/util/SparseArray;

    .line 12
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->bcc(Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/ab;->dj:Z

    .line 13
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->cz(Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;)I

    move-result v0

    iput v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/ab;->bcc:I

    .line 14
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->zjm(Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;)Lorg/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/ab;->cz:Lorg/json/JSONObject;

    .line 15
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->dj(Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;)I

    move-result v0

    iput v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/ab;->wrv:I

    .line 16
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->wrv(Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;)Lorg/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/ab;->cq:Lorg/json/JSONObject;

    .line 17
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->cq(Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/ab;->dz:Z

    .line 18
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->dz(Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;)I

    move-result v0

    iput v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/ab;->wk:I

    .line 19
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->wk(Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/ab;->ab:Ljava/lang/String;

    .line 20
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->ab(Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;)I

    move-result p1

    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/model/ab;->bs:I

    return-void
.end method

.method public synthetic constructor <init>(Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;Lcom/bytedance/sdk/openadsdk/core/model/ab$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/core/model/ab;-><init>(Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;)V

    return-void
.end method
