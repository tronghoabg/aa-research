.class Lcom/bytedance/adsdk/ugeno/yoga/oa/uef$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/adsdk/ugeno/yoga/oa/uef;->uef(Lcom/bytedance/adsdk/ugeno/cz/moa/uef;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic oa:Lcom/bytedance/adsdk/ugeno/yoga/oa/uef;

.field final synthetic uef:Lcom/bytedance/adsdk/ugeno/cz/moa/uef;


# direct methods
.method public constructor <init>(Lcom/bytedance/adsdk/ugeno/yoga/oa/uef;Lcom/bytedance/adsdk/ugeno/cz/moa/uef;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/bytedance/adsdk/ugeno/yoga/oa/uef$3;->oa:Lcom/bytedance/adsdk/ugeno/yoga/oa/uef;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/bytedance/adsdk/ugeno/yoga/oa/uef$3;->uef:Lcom/bytedance/adsdk/ugeno/cz/moa/uef;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/yoga/oa/uef$3;->oa:Lcom/bytedance/adsdk/ugeno/yoga/oa/uef;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/bytedance/adsdk/ugeno/yoga/oa/uef;->wk(Lcom/bytedance/adsdk/ugeno/yoga/oa/uef;)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/yoga/oa/uef$3;->oa:Lcom/bytedance/adsdk/ugeno/yoga/oa/uef;

    .line 11
    .line 12
    invoke-static {v0}, Lcom/bytedance/adsdk/ugeno/yoga/oa/uef;->ab(Lcom/bytedance/adsdk/ugeno/yoga/oa/uef;)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lcom/bytedance/adsdk/ugeno/yoga/oa/yo;

    .line 17
    .line 18
    iget-object v1, p0, Lcom/bytedance/adsdk/ugeno/yoga/oa/uef$3;->uef:Lcom/bytedance/adsdk/ugeno/cz/moa/uef;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lcom/bytedance/adsdk/ugeno/yoga/oa/yo;->uef(Landroid/view/View;)Lcom/bytedance/adsdk/ugeno/yoga/zjm;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    iget-object v1, p0, Lcom/bytedance/adsdk/ugeno/yoga/oa/uef$3;->oa:Lcom/bytedance/adsdk/ugeno/yoga/oa/uef;

    .line 28
    .line 29
    invoke-static {v1}, Lcom/bytedance/adsdk/ugeno/yoga/oa/uef;->bs(Lcom/bytedance/adsdk/ugeno/yoga/oa/uef;)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    int-to-float v2, v1

    .line 38
    invoke-virtual {v0, v2}, Lcom/bytedance/adsdk/ugeno/yoga/zjm;->moa(F)V

    .line 39
    .line 40
    .line 41
    iget-object v2, p0, Lcom/bytedance/adsdk/ugeno/yoga/oa/uef$3;->oa:Lcom/bytedance/adsdk/ugeno/yoga/oa/uef;

    .line 42
    .line 43
    invoke-static {v2}, Lcom/bytedance/adsdk/ugeno/yoga/oa/uef;->sy(Lcom/bytedance/adsdk/ugeno/yoga/oa/uef;)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    int-to-float v3, v2

    .line 52
    invoke-virtual {v0, v3}, Lcom/bytedance/adsdk/ugeno/yoga/zjm;->ivm(F)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/yoga/oa/uef$3;->uef:Lcom/bytedance/adsdk/ugeno/cz/moa/uef;

    .line 56
    .line 57
    iget-object v3, p0, Lcom/bytedance/adsdk/ugeno/yoga/oa/uef$3;->oa:Lcom/bytedance/adsdk/ugeno/yoga/oa/uef;

    .line 58
    .line 59
    invoke-static {v3}, Lcom/bytedance/adsdk/ugeno/yoga/oa/uef;->oib(Lcom/bytedance/adsdk/ugeno/yoga/oa/uef;)F

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    invoke-virtual {v0, v3}, Lcom/bytedance/adsdk/ugeno/cz/moa/uef;->setCornerRadius(F)V

    .line 64
    .line 65
    .line 66
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/yoga/oa/uef$3;->oa:Lcom/bytedance/adsdk/ugeno/yoga/oa/uef;

    .line 67
    .line 68
    invoke-static {v0}, Lcom/bytedance/adsdk/ugeno/yoga/oa/uef;->dhk(Lcom/bytedance/adsdk/ugeno/yoga/oa/uef;)Landroid/view/View;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 73
    .line 74
    .line 75
    if-gtz v1, :cond_3

    .line 76
    .line 77
    if-lez v2, :cond_2

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_2
    :goto_0
    return-void

    .line 81
    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/yoga/oa/uef$3;->oa:Lcom/bytedance/adsdk/ugeno/yoga/oa/uef;

    .line 82
    .line 83
    invoke-static {v0}, Lcom/bytedance/adsdk/ugeno/yoga/oa/uef;->tpx(Lcom/bytedance/adsdk/ugeno/yoga/oa/uef;)Landroid/view/View;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 92
    .line 93
    .line 94
    return-void
.end method
