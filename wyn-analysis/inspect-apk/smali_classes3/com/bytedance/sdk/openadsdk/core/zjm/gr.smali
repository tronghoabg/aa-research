.class public Lcom/bytedance/sdk/openadsdk/core/zjm/gr;
.super Landroid/view/GestureDetector;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/sdk/openadsdk/core/zjm/gr$uef;
    }
.end annotation


# instance fields
.field private final oa:Lcom/bytedance/sdk/openadsdk/core/yo/ivm;

.field private final uef:Lcom/bytedance/sdk/openadsdk/core/zjm/gr$uef;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/zjm/gr$uef;

    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/core/zjm/gr$uef;-><init>()V

    invoke-direct {p0, p1, v0}, Lcom/bytedance/sdk/openadsdk/core/zjm/gr;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/zjm/gr$uef;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/zjm/gr$uef;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    .line 3
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/gr;->uef:Lcom/bytedance/sdk/openadsdk/core/zjm/gr$uef;

    .line 4
    new-instance p1, Lcom/bytedance/sdk/openadsdk/core/yo/ivm;

    invoke-direct {p1}, Lcom/bytedance/sdk/openadsdk/core/yo/ivm;-><init>()V

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/gr;->oa:Lcom/bytedance/sdk/openadsdk/core/yo/ivm;

    const/4 p1, 0x0

    .line 5
    invoke-virtual {p0, p1}, Landroid/view/GestureDetector;->setIsLongpressEnabled(Z)V

    return-void
.end method


# virtual methods
.method public oa()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/gr;->uef:Lcom/bytedance/sdk/openadsdk/core/zjm/gr$uef;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/zjm/gr$uef;->oa()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/gr;->oa:Lcom/bytedance/sdk/openadsdk/core/yo/ivm;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/core/yo/ivm;->uef(Landroid/view/MotionEvent;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
.end method

.method public uef(Landroid/content/Context;Landroid/view/View;)Lcom/bytedance/sdk/openadsdk/core/model/wrv;
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/gr;->oa:Lcom/bytedance/sdk/openadsdk/core/yo/ivm;

    if-nez v0, :cond_0

    .line 3
    new-instance p1, Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;

    invoke-direct {p1}, Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;-><init>()V

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;->uef()Lcom/bytedance/sdk/openadsdk/core/model/wrv;

    move-result-object p1

    return-object p1

    .line 4
    :cond_0
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;

    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;-><init>()V

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/gr;->oa:Lcom/bytedance/sdk/openadsdk/core/yo/ivm;

    iget v1, v1, Lcom/bytedance/sdk/openadsdk/core/yo/ivm;->uef:F

    .line 5
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;->ivm(F)Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;

    move-result-object v0

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/gr;->oa:Lcom/bytedance/sdk/openadsdk/core/yo/ivm;

    iget v1, v1, Lcom/bytedance/sdk/openadsdk/core/yo/ivm;->oa:F

    .line 6
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;->lw(F)Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;

    move-result-object v0

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/gr;->oa:Lcom/bytedance/sdk/openadsdk/core/yo/ivm;

    iget v1, v1, Lcom/bytedance/sdk/openadsdk/core/yo/ivm;->yo:F

    .line 7
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;->moa(F)Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;

    move-result-object v0

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/gr;->oa:Lcom/bytedance/sdk/openadsdk/core/yo/ivm;

    iget v1, v1, Lcom/bytedance/sdk/openadsdk/core/yo/ivm;->moa:F

    .line 8
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;->yo(F)Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;

    move-result-object v0

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/gr;->oa:Lcom/bytedance/sdk/openadsdk/core/yo/ivm;

    iget-wide v1, v1, Lcom/bytedance/sdk/openadsdk/core/yo/ivm;->lw:J

    .line 9
    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;->oa(J)Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;

    move-result-object v0

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/gr;->oa:Lcom/bytedance/sdk/openadsdk/core/yo/ivm;

    iget-wide v1, v1, Lcom/bytedance/sdk/openadsdk/core/yo/ivm;->ivm:J

    .line 10
    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;->uef(J)Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;

    move-result-object v0

    .line 11
    invoke-static {p2}, Lcom/bytedance/sdk/openadsdk/utils/af;->uef(Landroid/view/View;)[I

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;->uef([I)Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;

    move-result-object v0

    .line 12
    invoke-static {p2}, Lcom/bytedance/sdk/openadsdk/utils/af;->yo(Landroid/view/View;)[I

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;->oa([I)Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;

    move-result-object p2

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/gr;->oa:Lcom/bytedance/sdk/openadsdk/core/yo/ivm;

    iget v0, v0, Lcom/bytedance/sdk/openadsdk/core/yo/ivm;->xs:I

    .line 13
    invoke-virtual {p2, v0}, Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;->moa(I)Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;

    move-result-object p2

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/gr;->oa:Lcom/bytedance/sdk/openadsdk/core/yo/ivm;

    iget v0, v0, Lcom/bytedance/sdk/openadsdk/core/yo/ivm;->bcc:I

    .line 14
    invoke-virtual {p2, v0}, Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;->lw(I)Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;

    move-result-object p2

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/gr;->oa:Lcom/bytedance/sdk/openadsdk/core/yo/ivm;

    iget v0, v0, Lcom/bytedance/sdk/openadsdk/core/yo/ivm;->cz:I

    .line 15
    invoke-virtual {p2, v0}, Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;->ivm(I)Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;

    move-result-object p2

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/gr;->oa:Lcom/bytedance/sdk/openadsdk/core/yo/ivm;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/core/yo/ivm;->wrv:Landroid/util/SparseArray;

    .line 16
    invoke-virtual {p2, v0}, Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;->uef(Landroid/util/SparseArray;)Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;

    move-result-object p2

    .line 17
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/zjm;->oa()Lcom/bytedance/sdk/openadsdk/core/zjm;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/zjm;->uef()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    :goto_0
    invoke-virtual {p2, v0}, Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;->oa(I)Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;

    move-result-object p2

    const-string v0, "vessel"

    .line 18
    invoke-virtual {p2, v0}, Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;

    move-result-object p2

    .line 19
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/utils/af;->bcc(Landroid/content/Context;)F

    move-result v0

    invoke-virtual {p2, v0}, Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;->uef(F)Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;

    move-result-object p2

    .line 20
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/utils/af;->zjm(Landroid/content/Context;)I

    move-result v0

    invoke-virtual {p2, v0}, Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;->yo(I)Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;

    move-result-object p2

    .line 21
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/utils/af;->cz(Landroid/content/Context;)F

    move-result p1

    invoke-virtual {p2, p1}, Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;->oa(F)Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;

    move-result-object p1

    .line 22
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;->uef()Lcom/bytedance/sdk/openadsdk/core/model/wrv;

    move-result-object p1

    return-object p1
.end method

.method public uef()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/gr;->uef:Lcom/bytedance/sdk/openadsdk/core/zjm/gr$uef;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/zjm/gr$uef;->uef()V

    return-void
.end method
