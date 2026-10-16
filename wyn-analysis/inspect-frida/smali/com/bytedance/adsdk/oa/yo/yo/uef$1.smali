.class Lcom/bytedance/adsdk/oa/yo/yo/uef$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/adsdk/oa/uef/oa/uef$uef;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/adsdk/oa/yo/yo/uef;->wrv()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic uef:Lcom/bytedance/adsdk/oa/yo/yo/uef;


# direct methods
.method public constructor <init>(Lcom/bytedance/adsdk/oa/yo/yo/uef;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/adsdk/oa/yo/yo/uef$1;->uef:Lcom/bytedance/adsdk/oa/yo/yo/uef;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public uef()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/yo/yo/uef$1;->uef:Lcom/bytedance/adsdk/oa/yo/yo/uef;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/bytedance/adsdk/oa/yo/yo/uef;->yo(Lcom/bytedance/adsdk/oa/yo/yo/uef;)Lcom/bytedance/adsdk/oa/uef/oa/moa;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lcom/bytedance/adsdk/oa/uef/oa/moa;->cz()F

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/high16 v2, 0x3f800000    # 1.0f

    .line 12
    .line 13
    cmpl-float v1, v1, v2

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v1, 0x0

    .line 20
    :goto_0
    invoke-static {v0, v1}, Lcom/bytedance/adsdk/oa/yo/yo/uef;->uef(Lcom/bytedance/adsdk/oa/yo/yo/uef;Z)V

    .line 21
    .line 22
    .line 23
    return-void
.end method
