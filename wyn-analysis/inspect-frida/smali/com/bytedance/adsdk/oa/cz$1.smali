.class Lcom/bytedance/adsdk/oa/cz$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/adsdk/oa/cz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic uef:Lcom/bytedance/adsdk/oa/cz;


# direct methods
.method public constructor <init>(Lcom/bytedance/adsdk/oa/cz;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/adsdk/oa/cz$1;->uef:Lcom/bytedance/adsdk/oa/cz;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/bytedance/adsdk/oa/cz$1;->uef:Lcom/bytedance/adsdk/oa/cz;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/bytedance/adsdk/oa/cz;->uef(Lcom/bytedance/adsdk/oa/cz;)Lcom/bytedance/adsdk/oa/yo/yo/oa;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lcom/bytedance/adsdk/oa/cz$1;->uef:Lcom/bytedance/adsdk/oa/cz;

    .line 10
    .line 11
    invoke-static {p1}, Lcom/bytedance/adsdk/oa/cz;->uef(Lcom/bytedance/adsdk/oa/cz;)Lcom/bytedance/adsdk/oa/yo/yo/oa;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz$1;->uef:Lcom/bytedance/adsdk/oa/cz;

    .line 16
    .line 17
    invoke-static {v0}, Lcom/bytedance/adsdk/oa/cz;->oa(Lcom/bytedance/adsdk/oa/cz;)Lcom/bytedance/adsdk/oa/ivm/yo;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Lcom/bytedance/adsdk/oa/ivm/yo;->ivm()F

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-virtual {p1, v0}, Lcom/bytedance/adsdk/oa/yo/yo/oa;->uef(F)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method
