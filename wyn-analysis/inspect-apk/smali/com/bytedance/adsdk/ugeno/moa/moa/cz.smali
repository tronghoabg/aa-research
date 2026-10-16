.class public Lcom/bytedance/adsdk/ugeno/moa/moa/cz;
.super Lcom/bytedance/adsdk/ugeno/moa/moa/yo;
.source "SourceFile"


# instance fields
.field private cq:Z

.field private dj:F

.field private dz:Lcom/bytedance/adsdk/ugeno/moa/dz;

.field private wrv:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public uef(Lcom/bytedance/adsdk/ugeno/moa/dz;)V
    .locals 0

    .line 29
    iput-object p1, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/cz;->dz:Lcom/bytedance/adsdk/ugeno/moa/dz;

    return-void
.end method

.method public uef(Lcom/bytedance/adsdk/ugeno/oa/yo;Landroid/view/MotionEvent;)Z
    .locals 8

    .line 6
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_7

    const/high16 v2, 0x41700000    # 15.0f

    const/4 v3, 0x0

    if-eq v0, v1, :cond_3

    const/4 v4, 0x2

    if-eq v0, v4, :cond_1

    const/4 v4, 0x3

    if-eq v0, v4, :cond_0

    goto/16 :goto_2

    .line 7
    :cond_0
    iput-boolean v3, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/cz;->cq:Z

    goto :goto_0

    .line 8
    :cond_1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result p1

    .line 9
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result p2

    .line 10
    iget v0, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/cz;->dj:F

    sub-float/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    cmpl-float p1, p1, v2

    if-gez p1, :cond_2

    iget p1, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/cz;->wrv:F

    sub-float/2addr p2, p1

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p1

    cmpl-float p1, p1, v2

    if-ltz p1, :cond_8

    .line 11
    :cond_2
    iput-boolean v1, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/cz;->cq:Z

    goto :goto_2

    .line 12
    :cond_3
    :goto_0
    iget-boolean v0, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/cz;->cq:Z

    const-string v4, "Non-tap event"

    const-string v5, "GesThrough_UGTapEvent"

    const/4 v6, 0x0

    if-eqz v0, :cond_4

    .line 13
    iput-boolean v3, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/cz;->cq:Z

    .line 14
    iput v6, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/cz;->dj:F

    .line 15
    iput v6, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/cz;->wrv:F

    .line 16
    invoke-static {v5, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return v3

    .line 17
    :cond_4
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result v0

    .line 18
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result p2

    .line 19
    iget v7, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/cz;->dj:F

    sub-float/2addr v0, v7

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpl-float v0, v0, v2

    if-gez v0, :cond_6

    iget v0, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/cz;->wrv:F

    sub-float/2addr p2, v0

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p2

    cmpl-float p2, p2, v2

    if-ltz p2, :cond_5

    goto :goto_1

    .line 20
    :cond_5
    const-string p2, "Tap event, direct handling"

    invoke-static {v5, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 21
    iget-object p2, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->uef:Lcom/bytedance/adsdk/ugeno/moa/dj;

    if-eqz p2, :cond_8

    .line 22
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->ivm:Ljava/lang/String;

    iget-object v2, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->yo:Lcom/bytedance/adsdk/ugeno/moa/ivm;

    invoke-virtual {v2}, Lcom/bytedance/adsdk/ugeno/moa/ivm;->oa()Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->yo:Lcom/bytedance/adsdk/ugeno/moa/ivm;

    invoke-interface {p2, p1, v0, v2, v3}, Lcom/bytedance/adsdk/ugeno/moa/dj;->uef(Lcom/bytedance/adsdk/ugeno/oa/yo;Ljava/lang/String;Ljava/util/List;Lcom/bytedance/adsdk/ugeno/moa/ivm;)V

    .line 23
    iput v6, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/cz;->dj:F

    .line 24
    iput v6, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/cz;->wrv:F

    return v1

    .line 25
    :cond_6
    :goto_1
    iput-boolean v3, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/cz;->cq:Z

    .line 26
    invoke-static {v5, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return v3

    .line 27
    :cond_7
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result p1

    iput p1, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/cz;->dj:F

    .line 28
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result p1

    iput p1, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/cz;->wrv:F

    :cond_8
    :goto_2
    return v1
.end method

.method public varargs uef([Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    .line 1
    array-length v1, p1

    if-gtz v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    aget-object p1, p1, v0

    check-cast p1, Landroid/view/MotionEvent;

    .line 3
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/cz;->dz:Lcom/bytedance/adsdk/ugeno/moa/dz;

    if-eqz v0, :cond_1

    .line 4
    iget-object v1, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->oa:Lcom/bytedance/adsdk/ugeno/oa/yo;

    iget-object v2, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->uef:Lcom/bytedance/adsdk/ugeno/moa/dj;

    invoke-interface {v0, v1, p1, v2, p0}, Lcom/bytedance/adsdk/ugeno/moa/dz;->uef(Lcom/bytedance/adsdk/ugeno/oa/yo;Landroid/view/MotionEvent;Lcom/bytedance/adsdk/ugeno/moa/dj;Lcom/bytedance/adsdk/ugeno/moa/moa/yo;)Z

    move-result p1

    return p1

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->oa:Lcom/bytedance/adsdk/ugeno/oa/yo;

    invoke-virtual {p0, v0, p1}, Lcom/bytedance/adsdk/ugeno/moa/moa/cz;->uef(Lcom/bytedance/adsdk/ugeno/oa/yo;Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    return v0
.end method
