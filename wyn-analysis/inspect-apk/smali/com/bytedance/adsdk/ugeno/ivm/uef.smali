.class public abstract Lcom/bytedance/adsdk/ugeno/ivm/uef;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/adsdk/ugeno/bcc/yo$moa;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/adsdk/ugeno/ivm/uef$yo;,
        Lcom/bytedance/adsdk/ugeno/ivm/uef$oa;,
        Lcom/bytedance/adsdk/ugeno/ivm/uef$uef;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Landroid/widget/FrameLayout;",
        "Lcom/bytedance/adsdk/ugeno/bcc/yo$moa;"
    }
.end annotation


# static fields
.field private static final cp:Landroid/view/animation/Interpolator;


# instance fields
.field private ab:Z

.field private bcc:I

.field private bs:Z

.field private cq:Z

.field private cz:I

.field private dhk:I

.field private dj:Ljava/lang/String;

.field private dz:Z

.field private final fz:Ljava/lang/Runnable;

.field private gr:Lcom/bytedance/adsdk/ugeno/ivm/yo;

.field private gsd:Lcom/bytedance/adsdk/ugeno/ivm/uef/uef;

.field private gzw:Landroid/widget/FrameLayout;

.field private ivm:I

.field private final ku:Ljava/lang/Runnable;

.field private lw:I

.field private moa:I

.field protected oa:Lcom/bytedance/adsdk/ugeno/bcc/yo;

.field private oib:I

.field private orq:I

.field private pz:Z

.field private rt:Lcom/bytedance/adsdk/ugeno/ivm/uef$uef;

.field private sy:Z

.field private tpx:I

.field private ue:Landroid/widget/Scroller;

.field protected uef:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation
.end field

.field private wk:Z

.field private wrv:F

.field private xs:I

.field protected yo:Landroid/content/Context;

.field private zjm:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/bytedance/adsdk/ugeno/ivm/uef$1;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/bytedance/adsdk/ugeno/ivm/uef$1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->cp:Landroid/view/animation/Interpolator;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->uef:Ljava/util/List;

    .line 10
    .line 11
    const/4 v0, -0x1

    .line 12
    iput v0, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->moa:I

    .line 13
    .line 14
    const/16 v1, 0x7d0

    .line 15
    .line 16
    iput v1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->lw:I

    .line 17
    .line 18
    const/16 v1, 0x1f4

    .line 19
    .line 20
    iput v1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->ivm:I

    .line 21
    .line 22
    iput v1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->xs:I

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    iput v1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->bcc:I

    .line 26
    .line 27
    iput v0, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->cz:I

    .line 28
    .line 29
    iput v0, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->zjm:I

    .line 30
    .line 31
    const-string v2, "normal"

    .line 32
    .line 33
    iput-object v2, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->dj:Ljava/lang/String;

    .line 34
    .line 35
    const/high16 v2, 0x3f800000    # 1.0f

    .line 36
    .line 37
    iput v2, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->wrv:F

    .line 38
    .line 39
    const/4 v2, 0x1

    .line 40
    iput-boolean v2, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->cq:Z

    .line 41
    .line 42
    iput-boolean v2, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->dz:Z

    .line 43
    .line 44
    iput-boolean v2, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->wk:Z

    .line 45
    .line 46
    iput-boolean v2, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->ab:Z

    .line 47
    .line 48
    iput v1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->oib:I

    .line 49
    .line 50
    iput v1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->dhk:I

    .line 51
    .line 52
    iput v1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->tpx:I

    .line 53
    .line 54
    iput v1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->orq:I

    .line 55
    .line 56
    iput-boolean v2, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->pz:Z

    .line 57
    .line 58
    new-instance v1, Lcom/bytedance/adsdk/ugeno/ivm/uef$2;

    .line 59
    .line 60
    invoke-direct {v1, p0}, Lcom/bytedance/adsdk/ugeno/ivm/uef$2;-><init>(Lcom/bytedance/adsdk/ugeno/ivm/uef;)V

    .line 61
    .line 62
    .line 63
    iput-object v1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->ku:Ljava/lang/Runnable;

    .line 64
    .line 65
    new-instance v1, Lcom/bytedance/adsdk/ugeno/ivm/uef$3;

    .line 66
    .line 67
    invoke-direct {v1, p0}, Lcom/bytedance/adsdk/ugeno/ivm/uef$3;-><init>(Lcom/bytedance/adsdk/ugeno/ivm/uef;)V

    .line 68
    .line 69
    .line 70
    iput-object v1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->fz:Ljava/lang/Runnable;

    .line 71
    .line 72
    iput-object p1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->yo:Landroid/content/Context;

    .line 73
    .line 74
    new-instance v1, Landroid/widget/FrameLayout;

    .line 75
    .line 76
    invoke-direct {v1, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 77
    .line 78
    .line 79
    iput-object v1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->gzw:Landroid/widget/FrameLayout;

    .line 80
    .line 81
    invoke-virtual {p0}, Lcom/bytedance/adsdk/ugeno/ivm/uef;->uef()Lcom/bytedance/adsdk/ugeno/bcc/yo;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    iput-object p1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->oa:Lcom/bytedance/adsdk/ugeno/bcc/yo;

    .line 86
    .line 87
    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    .line 88
    .line 89
    invoke-direct {p1, v0, v0}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 90
    .line 91
    .line 92
    const/16 v0, 0x11

    .line 93
    .line 94
    iput v0, p1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 95
    .line 96
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->gzw:Landroid/widget/FrameLayout;

    .line 97
    .line 98
    iget-object v1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->oa:Lcom/bytedance/adsdk/ugeno/bcc/yo;

    .line 99
    .line 100
    invoke-virtual {v0, v1, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 101
    .line 102
    .line 103
    iget-object p1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->gzw:Landroid/widget/FrameLayout;

    .line 104
    .line 105
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 106
    .line 107
    .line 108
    return-void
.end method

.method public static synthetic bcc(Lcom/bytedance/adsdk/ugeno/ivm/uef;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->xs:I

    return p0
.end method

.method public static synthetic ivm(Lcom/bytedance/adsdk/ugeno/ivm/uef;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->ab:Z

    return p0
.end method

.method public static synthetic lw(Lcom/bytedance/adsdk/ugeno/ivm/uef;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->lw:I

    return p0
.end method

.method public static synthetic moa(Lcom/bytedance/adsdk/ugeno/ivm/uef;)Ljava/lang/Runnable;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->fz:Ljava/lang/Runnable;

    return-object p0
.end method

.method public static synthetic oa(Lcom/bytedance/adsdk/ugeno/ivm/uef;)F
    .locals 0

    .line 1
    iget p0, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->wrv:F

    return p0
.end method

.method private uef(ILandroid/view/View;)V
    .locals 3

    .line 64
    instance-of v0, p2, Landroid/view/ViewGroup;

    if-eqz v0, :cond_6

    .line 65
    const-string v0, "two_items_tag"

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 66
    :cond_0
    iget-object v1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->uef:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    invoke-static {v2, p1, v1}, Lcom/bytedance/adsdk/ugeno/ivm/moa;->uef(ZII)I

    move-result p1

    .line 67
    iget-object v1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->uef:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_1

    .line 68
    :cond_1
    instance-of v1, p1, Lcom/bytedance/adsdk/ugeno/oa/yo;

    if-eqz v1, :cond_2

    .line 69
    check-cast p1, Lcom/bytedance/adsdk/ugeno/oa/yo;

    invoke-virtual {p1}, Lcom/bytedance/adsdk/ugeno/oa/yo;->dj()Landroid/view/View;

    move-result-object v0

    goto :goto_0

    .line 70
    :cond_2
    instance-of v1, p1, Landroid/view/View;

    if-eqz v1, :cond_3

    .line 71
    move-object v0, p1

    check-cast v0, Landroid/view/View;

    :cond_3
    :goto_0
    if-nez v0, :cond_4

    goto :goto_1

    .line 72
    :cond_4
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    instance-of p1, p1, Landroid/view/ViewGroup;

    if-eqz p1, :cond_5

    .line 73
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 74
    :cond_5
    check-cast p2, Landroid/view/ViewGroup;

    invoke-virtual {p2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_6
    :goto_1
    return-void
.end method

.method public static synthetic uef(Lcom/bytedance/adsdk/ugeno/ivm/uef;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->wk:Z

    return p0
.end method

.method public static synthetic uef(Lcom/bytedance/adsdk/ugeno/ivm/uef;Z)Z
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->pz:Z

    return p1
.end method

.method public static synthetic xs(Lcom/bytedance/adsdk/ugeno/ivm/uef;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->orq:I

    return p0
.end method

.method private xs()Z
    .locals 2

    .line 3
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->uef:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-gt v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->wk:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static synthetic yo(Lcom/bytedance/adsdk/ugeno/ivm/uef;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->dz:Z

    return p0
.end method


# virtual methods
.method public bcc(I)Lcom/bytedance/adsdk/ugeno/ivm/uef;
    .locals 6

    .line 2
    iput p1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->bcc:I

    .line 3
    iget-object v1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->dj:Ljava/lang/String;

    iget v3, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->cz:I

    iget v4, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->zjm:I

    const/4 v5, 0x1

    move-object v0, p0

    move v2, p1

    invoke-virtual/range {v0 .. v5}, Lcom/bytedance/adsdk/ugeno/ivm/uef;->uef(Ljava/lang/String;IIIZ)V

    return-object v0
.end method

.method public cq(I)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, v0, :cond_0

    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->bs:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/bytedance/adsdk/ugeno/ivm/uef;->ivm()V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->gr:Lcom/bytedance/adsdk/ugeno/ivm/yo;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-boolean v1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->wk:Z

    .line 16
    .line 17
    invoke-interface {v0, v1, p1}, Lcom/bytedance/adsdk/ugeno/ivm/yo;->uef(ZI)V

    .line 18
    .line 19
    .line 20
    :cond_1
    return-void
.end method

.method public cz(I)Lcom/bytedance/adsdk/ugeno/ivm/uef;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/bytedance/adsdk/ugeno/ivm/uef<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iput p1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->cz:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->dj:Ljava/lang/String;

    .line 4
    .line 5
    iget v2, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->bcc:I

    .line 6
    .line 7
    iget v4, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->zjm:I

    .line 8
    .line 9
    const/4 v5, 0x1

    .line 10
    move-object v0, p0

    .line 11
    move v3, p1

    .line 12
    invoke-virtual/range {v0 .. v5}, Lcom/bytedance/adsdk/ugeno/ivm/uef;->uef(Ljava/lang/String;IIIZ)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->dz:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-eq v0, v1, :cond_1

    .line 11
    .line 12
    const/4 v1, 0x3

    .line 13
    if-eq v0, v1, :cond_1

    .line 14
    .line 15
    const/4 v1, 0x4

    .line 16
    if-ne v0, v1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    if-nez v0, :cond_2

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/bytedance/adsdk/ugeno/ivm/uef;->ivm()V

    .line 22
    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    :goto_0
    iget-boolean v0, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->bs:Z

    .line 26
    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/bytedance/adsdk/ugeno/ivm/uef;->lw()V

    .line 30
    .line 31
    .line 32
    :cond_2
    :goto_1
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    return p1
.end method

.method public abstract dj(I)Landroid/view/View;
.end method

.method public dz(I)V
    .locals 6

    .line 1
    iget-object v1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->dj:Ljava/lang/String;

    .line 2
    .line 3
    iget v2, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->bcc:I

    .line 4
    .line 5
    iget v3, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->cz:I

    .line 6
    .line 7
    iget v4, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->zjm:I

    .line 8
    .line 9
    const/4 v5, 0x1

    .line 10
    move-object v0, p0

    .line 11
    invoke-virtual/range {v0 .. v5}, Lcom/bytedance/adsdk/ugeno/ivm/uef;->uef(Ljava/lang/String;IIIZ)V

    .line 12
    .line 13
    .line 14
    iget-object v1, v0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->rt:Lcom/bytedance/adsdk/ugeno/ivm/uef$uef;

    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    new-instance v1, Lcom/bytedance/adsdk/ugeno/ivm/uef$uef;

    .line 19
    .line 20
    invoke-direct {v1, p0}, Lcom/bytedance/adsdk/ugeno/ivm/uef$uef;-><init>(Lcom/bytedance/adsdk/ugeno/ivm/uef;)V

    .line 21
    .line 22
    .line 23
    iput-object v1, v0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->rt:Lcom/bytedance/adsdk/ugeno/ivm/uef$uef;

    .line 24
    .line 25
    iget-object v1, v0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->oa:Lcom/bytedance/adsdk/ugeno/bcc/yo;

    .line 26
    .line 27
    invoke-virtual {v1, p0}, Lcom/bytedance/adsdk/ugeno/bcc/yo;->uef(Lcom/bytedance/adsdk/ugeno/bcc/yo$moa;)V

    .line 28
    .line 29
    .line 30
    iget-object v1, v0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->oa:Lcom/bytedance/adsdk/ugeno/bcc/yo;

    .line 31
    .line 32
    iget-object v2, v0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->rt:Lcom/bytedance/adsdk/ugeno/ivm/uef$uef;

    .line 33
    .line 34
    invoke-virtual {v1, v2}, Lcom/bytedance/adsdk/ugeno/bcc/yo;->setAdapter(Lcom/bytedance/adsdk/ugeno/bcc/oa;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    iget-boolean v1, v0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->wk:Z

    .line 38
    .line 39
    const/4 v2, 0x1

    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    const/16 v1, 0x400

    .line 43
    .line 44
    if-lt p1, v1, :cond_1

    .line 45
    .line 46
    iget-object p1, v0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->oa:Lcom/bytedance/adsdk/ugeno/bcc/yo;

    .line 47
    .line 48
    const/16 v1, 0x200

    .line 49
    .line 50
    const/4 v2, 0x0

    .line 51
    invoke-virtual {p1, v1, v2}, Lcom/bytedance/adsdk/ugeno/bcc/yo;->uef(IZ)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_1
    iget-object v1, v0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->oa:Lcom/bytedance/adsdk/ugeno/bcc/yo;

    .line 56
    .line 57
    invoke-virtual {v1, p1, v2}, Lcom/bytedance/adsdk/ugeno/bcc/yo;->uef(IZ)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_2
    if-ltz p1, :cond_4

    .line 62
    .line 63
    iget-object v1, v0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->uef:Ljava/util/List;

    .line 64
    .line 65
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-lt p1, v1, :cond_3

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_3
    iget-object v1, v0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->oa:Lcom/bytedance/adsdk/ugeno/bcc/yo;

    .line 73
    .line 74
    invoke-virtual {v1, p1, v2}, Lcom/bytedance/adsdk/ugeno/bcc/yo;->uef(IZ)V

    .line 75
    .line 76
    .line 77
    :cond_4
    :goto_0
    return-void
.end method

.method public getAdapter()Lcom/bytedance/adsdk/ugeno/bcc/oa;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->oa:Lcom/bytedance/adsdk/ugeno/bcc/yo;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/adsdk/ugeno/bcc/yo;->getAdapter()Lcom/bytedance/adsdk/ugeno/bcc/oa;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getCurrentItem()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->oa:Lcom/bytedance/adsdk/ugeno/bcc/yo;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/adsdk/ugeno/bcc/yo;->getCurrentItem()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getViewPager()Lcom/bytedance/adsdk/ugeno/bcc/yo;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->oa:Lcom/bytedance/adsdk/ugeno/bcc/yo;

    .line 2
    .line 3
    return-object v0
.end method

.method public ivm(I)Lcom/bytedance/adsdk/ugeno/ivm/uef;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->gsd:Lcom/bytedance/adsdk/ugeno/ivm/uef/uef;

    invoke-virtual {v0, p1}, Lcom/bytedance/adsdk/ugeno/ivm/uef/uef;->setSelectedColor(I)V

    return-object p0
.end method

.method public ivm()V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->fz:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public lw(F)Lcom/bytedance/adsdk/ugeno/ivm/uef;
    .locals 0

    .line 5
    iput p1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->wrv:F

    return-object p0
.end method

.method public lw(I)Lcom/bytedance/adsdk/ugeno/ivm/uef;
    .locals 0

    if-gez p1, :cond_0

    .line 2
    iget p1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->lw:I

    .line 3
    :cond_0
    iput p1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->moa:I

    .line 4
    invoke-virtual {p0}, Lcom/bytedance/adsdk/ugeno/ivm/uef;->lw()V

    return-object p0
.end method

.method public lw(Z)Lcom/bytedance/adsdk/ugeno/ivm/uef;
    .locals 0

    .line 6
    iput-boolean p1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->bs:Z

    return-object p0
.end method

.method public lw()V
    .locals 4

    .line 7
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->fz:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 8
    iget v0, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->lw:I

    .line 9
    iget-boolean v1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->pz:Z

    if-eqz v1, :cond_0

    .line 10
    iget v1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->moa:I

    if-lez v1, :cond_0

    move v0, v1

    .line 11
    :cond_0
    iget-object v1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->fz:Ljava/lang/Runnable;

    int-to-long v2, v0

    invoke-virtual {p0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public moa(F)Lcom/bytedance/adsdk/ugeno/ivm/uef;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->gsd:Lcom/bytedance/adsdk/ugeno/ivm/uef/uef;

    invoke-virtual {v0, p1}, Lcom/bytedance/adsdk/ugeno/ivm/uef/uef;->setIndicatorY(F)V

    return-object p0
.end method

.method public moa(I)Lcom/bytedance/adsdk/ugeno/ivm/uef;
    .locals 0

    .line 3
    iput p1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->lw:I

    .line 4
    invoke-virtual {p0}, Lcom/bytedance/adsdk/ugeno/ivm/uef;->lw()V

    return-object p0
.end method

.method public moa(Z)Lcom/bytedance/adsdk/ugeno/ivm/uef;
    .locals 2

    .line 5
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->gsd:Lcom/bytedance/adsdk/ugeno/ivm/uef/uef;

    invoke-virtual {v0, p1}, Lcom/bytedance/adsdk/ugeno/ivm/uef/uef;->setLoop(Z)V

    .line 6
    iget-boolean v0, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->wk:Z

    if-eq v0, p1, :cond_0

    .line 7
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->oa:Lcom/bytedance/adsdk/ugeno/bcc/yo;

    invoke-virtual {v0}, Lcom/bytedance/adsdk/ugeno/bcc/yo;->getCurrentItem()I

    move-result v0

    iget-object v1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->uef:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {p1, v0, v1}, Lcom/bytedance/adsdk/ugeno/ivm/moa;->uef(ZII)I

    move-result v0

    .line 8
    iput-boolean p1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->wk:Z

    .line 9
    iget-object p1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->rt:Lcom/bytedance/adsdk/ugeno/ivm/uef$uef;

    if-eqz p1, :cond_0

    .line 10
    invoke-virtual {p1}, Lcom/bytedance/adsdk/ugeno/bcc/oa;->yo()V

    .line 11
    iget-object p1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->oa:Lcom/bytedance/adsdk/ugeno/bcc/yo;

    invoke-virtual {p1, v0}, Lcom/bytedance/adsdk/ugeno/bcc/yo;->setCurrentItem(I)V

    :cond_0
    return-object p0
.end method

.method public moa()V
    .locals 2

    .line 12
    invoke-virtual {p0}, Lcom/bytedance/adsdk/ugeno/ivm/uef;->ivm()V

    .line 13
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->rt:Lcom/bytedance/adsdk/ugeno/ivm/uef$uef;

    if-eqz v0, :cond_0

    .line 14
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->oa:Lcom/bytedance/adsdk/ugeno/bcc/yo;

    invoke-virtual {v0, p0}, Lcom/bytedance/adsdk/ugeno/bcc/yo;->oa(Lcom/bytedance/adsdk/ugeno/bcc/yo$moa;)V

    .line 15
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->oa:Lcom/bytedance/adsdk/ugeno/bcc/yo;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/bytedance/adsdk/ugeno/bcc/yo;->setAdapter(Lcom/bytedance/adsdk/ugeno/bcc/oa;)V

    .line 16
    iput-object v1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->rt:Lcom/bytedance/adsdk/ugeno/ivm/uef$uef;

    .line 17
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->oa:Lcom/bytedance/adsdk/ugeno/bcc/yo;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 18
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->uef:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 19
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->gsd:Lcom/bytedance/adsdk/ugeno/ivm/uef/uef;

    invoke-virtual {v0}, Lcom/bytedance/adsdk/ugeno/ivm/uef/uef;->yo()V

    :cond_0
    return-void
.end method

.method public oa()Lcom/bytedance/adsdk/ugeno/ivm/uef;
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->gsd:Lcom/bytedance/adsdk/ugeno/ivm/uef/uef;

    invoke-virtual {v0}, Lcom/bytedance/adsdk/ugeno/ivm/uef/uef;->uef()V

    return-object p0
.end method

.method public oa(F)Lcom/bytedance/adsdk/ugeno/ivm/uef;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->gsd:Lcom/bytedance/adsdk/ugeno/ivm/uef/uef;

    float-to-int p1, p1

    invoke-virtual {v0, p1}, Lcom/bytedance/adsdk/ugeno/ivm/uef/uef;->setIndicatorHeight(I)V

    return-object p0
.end method

.method public oa(I)Lcom/bytedance/adsdk/ugeno/ivm/uef;
    .locals 0

    .line 5
    iput p1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->ivm:I

    return-object p0
.end method

.method public oa(Ljava/lang/String;)Lcom/bytedance/adsdk/ugeno/ivm/uef;
    .locals 1

    .line 4
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->gsd:Lcom/bytedance/adsdk/ugeno/ivm/uef/uef;

    invoke-virtual {v0, p1}, Lcom/bytedance/adsdk/ugeno/ivm/uef/uef;->setIndicatorDirection(Ljava/lang/String;)V

    return-object p0
.end method

.method public oa(Z)Lcom/bytedance/adsdk/ugeno/ivm/uef;
    .locals 0

    .line 6
    iput-boolean p1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->ab:Z

    return-object p0
.end method

.method public setOnPageChangeListener(Lcom/bytedance/adsdk/ugeno/ivm/yo;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->gr:Lcom/bytedance/adsdk/ugeno/ivm/yo;

    .line 2
    .line 3
    return-void
.end method

.method public setTwoItems(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->sy:Z

    .line 2
    .line 3
    return-void
.end method

.method public uef(II)Landroid/view/View;
    .locals 4

    .line 34
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->uef:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 35
    new-instance p1, Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    return-object p1

    .line 36
    :cond_0
    invoke-virtual {p0, p2}, Lcom/bytedance/adsdk/ugeno/ivm/uef;->dj(I)Landroid/view/View;

    move-result-object p2

    .line 37
    new-instance v0, Landroid/widget/FrameLayout;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 38
    instance-of v1, p2, Landroid/view/ViewGroup;

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    .line 39
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 40
    :cond_1
    invoke-direct {p0}, Lcom/bytedance/adsdk/ugeno/ivm/uef;->xs()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 41
    const-string v1, "two_items_tag"

    invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 42
    :cond_2
    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    instance-of v1, v1, Landroid/view/ViewGroup;

    if-eqz v1, :cond_3

    .line 43
    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    invoke-virtual {v1, p2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 44
    :cond_3
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v2, -0x1

    invoke-direct {v1, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v3, 0x11

    .line 45
    iput v3, v1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 46
    invoke-virtual {v0, p2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 47
    new-instance p2, Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {p2, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 48
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v1, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, p2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 49
    invoke-direct {p0}, Lcom/bytedance/adsdk/ugeno/ivm/uef;->xs()Z

    move-result p2

    if-eqz p2, :cond_4

    .line 50
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    :cond_4
    return-object v0
.end method

.method public uef()Lcom/bytedance/adsdk/ugeno/bcc/yo;
    .locals 2

    .line 3
    new-instance v0, Lcom/bytedance/adsdk/ugeno/ivm/uef$yo;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/bytedance/adsdk/ugeno/ivm/uef$yo;-><init>(Lcom/bytedance/adsdk/ugeno/ivm/uef;Landroid/content/Context;)V

    return-object v0
.end method

.method public uef(F)Lcom/bytedance/adsdk/ugeno/ivm/uef;
    .locals 1

    .line 8
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->gsd:Lcom/bytedance/adsdk/ugeno/ivm/uef/uef;

    float-to-int p1, p1

    invoke-virtual {v0, p1}, Lcom/bytedance/adsdk/ugeno/ivm/uef/uef;->setIndicatorWidth(I)V

    return-object p0
.end method

.method public uef(I)Lcom/bytedance/adsdk/ugeno/ivm/uef;
    .locals 0

    .line 9
    iput p1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->orq:I

    return-object p0
.end method

.method public uef(Ljava/lang/Object;)Lcom/bytedance/adsdk/ugeno/ivm/uef;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lcom/bytedance/adsdk/ugeno/ivm/uef<",
            "TT;>;"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 51
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->uef:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 52
    iget-boolean p1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->cq:Z

    if-eqz p1, :cond_0

    .line 53
    iget-object p1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->gsd:Lcom/bytedance/adsdk/ugeno/ivm/uef/uef;

    invoke-virtual {p1}, Lcom/bytedance/adsdk/ugeno/ivm/uef/uef;->oa()V

    .line 54
    :cond_0
    iget-object p1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->rt:Lcom/bytedance/adsdk/ugeno/ivm/uef$uef;

    if-eqz p1, :cond_1

    .line 55
    invoke-virtual {p1}, Lcom/bytedance/adsdk/ugeno/bcc/oa;->yo()V

    .line 56
    iget-object p1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->gsd:Lcom/bytedance/adsdk/ugeno/ivm/uef/uef;

    iget v0, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->oib:I

    iget-object v1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->oa:Lcom/bytedance/adsdk/ugeno/bcc/yo;

    invoke-virtual {v1}, Lcom/bytedance/adsdk/ugeno/bcc/yo;->getCurrentItem()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Lcom/bytedance/adsdk/ugeno/ivm/uef/uef;->uef(II)V

    :cond_1
    return-object p0
.end method

.method public uef(Ljava/lang/String;)Lcom/bytedance/adsdk/ugeno/ivm/uef;
    .locals 2

    .line 4
    const-string v0, "rectangle"

    invoke-static {p1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 5
    new-instance p1, Lcom/bytedance/adsdk/ugeno/ivm/uef/yo;

    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->yo:Landroid/content/Context;

    invoke-direct {p1, v0}, Lcom/bytedance/adsdk/ugeno/ivm/uef/yo;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->gsd:Lcom/bytedance/adsdk/ugeno/ivm/uef/uef;

    goto :goto_0

    .line 6
    :cond_0
    new-instance p1, Lcom/bytedance/adsdk/ugeno/ivm/uef/oa;

    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->yo:Landroid/content/Context;

    invoke-direct {p1, v0}, Lcom/bytedance/adsdk/ugeno/ivm/uef/oa;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->gsd:Lcom/bytedance/adsdk/ugeno/ivm/uef/uef;

    .line 7
    :goto_0
    iget-object p1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->gsd:Lcom/bytedance/adsdk/ugeno/ivm/uef/uef;

    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p0, p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-object p0
.end method

.method public uef(Z)Lcom/bytedance/adsdk/ugeno/ivm/uef;
    .locals 0

    .line 10
    iput-boolean p1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->dz:Z

    .line 11
    invoke-virtual {p0}, Lcom/bytedance/adsdk/ugeno/ivm/uef;->lw()V

    return-object p0
.end method

.method public uef(IFI)V
    .locals 3

    .line 57
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->gr:Lcom/bytedance/adsdk/ugeno/ivm/yo;

    if-eqz v0, :cond_0

    .line 58
    iget-boolean v1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->wk:Z

    iget-object v2, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->uef:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v1, p1, v2}, Lcom/bytedance/adsdk/ugeno/ivm/moa;->uef(ZII)I

    move-result v2

    invoke-interface {v0, v1, v2, p2, p3}, Lcom/bytedance/adsdk/ugeno/ivm/yo;->uef(ZIFI)V

    .line 59
    :cond_0
    invoke-direct {p0}, Lcom/bytedance/adsdk/ugeno/ivm/uef;->xs()Z

    move-result p3

    if-eqz p3, :cond_1

    .line 60
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p0, p3}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object p3

    .line 61
    invoke-direct {p0, p1, p3}, Lcom/bytedance/adsdk/ugeno/ivm/uef;->uef(ILandroid/view/View;)V

    const/4 p3, 0x0

    cmpl-float p2, p2, p3

    if-lez p2, :cond_1

    add-int/lit8 p1, p1, 0x1

    .line 62
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p0, p2}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object p2

    .line 63
    invoke-direct {p0, p1, p2}, Lcom/bytedance/adsdk/ugeno/ivm/uef;->uef(ILandroid/view/View;)V

    :cond_1
    return-void
.end method

.method public uef(Ljava/lang/String;IIIZ)V
    .locals 2

    .line 12
    iget-object p5, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->rt:Lcom/bytedance/adsdk/ugeno/ivm/uef$uef;

    if-eqz p5, :cond_0

    .line 13
    invoke-virtual {p5}, Lcom/bytedance/adsdk/ugeno/bcc/oa;->yo()V

    .line 14
    :cond_0
    iget-object p5, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->oa:Lcom/bytedance/adsdk/ugeno/bcc/yo;

    invoke-virtual {p5, p2}, Lcom/bytedance/adsdk/ugeno/bcc/yo;->setPageMargin(I)V

    const/4 p5, 0x1

    const/4 v0, 0x0

    if-gtz p3, :cond_1

    if-lez p4, :cond_3

    .line 15
    :cond_1
    iget v1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->orq:I

    if-ne v1, p5, :cond_2

    .line 16
    iget-object v1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->oa:Lcom/bytedance/adsdk/ugeno/bcc/yo;

    add-int/2addr p3, p2

    add-int/2addr p4, p2

    invoke-virtual {v1, v0, p3, v0, p4}, Landroid/view/View;->setPadding(IIII)V

    goto :goto_0

    .line 17
    :cond_2
    iget-object v1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->oa:Lcom/bytedance/adsdk/ugeno/bcc/yo;

    add-int/2addr p3, p2

    add-int/2addr p4, p2

    invoke-virtual {v1, p3, v0, p4, v0}, Landroid/view/View;->setPadding(IIII)V

    .line 18
    :goto_0
    iget-object p2, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->gzw:Landroid/widget/FrameLayout;

    invoke-virtual {p2, v0}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 19
    iget-object p2, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->oa:Lcom/bytedance/adsdk/ugeno/bcc/yo;

    invoke-virtual {p2, v0}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 20
    iget-object p2, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->oa:Lcom/bytedance/adsdk/ugeno/bcc/yo;

    invoke-virtual {p2, v0}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 21
    :cond_3
    iget p2, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->orq:I

    if-ne p2, p5, :cond_4

    .line 22
    new-instance p2, Lcom/bytedance/adsdk/ugeno/ivm/oa/moa;

    invoke-direct {p2}, Lcom/bytedance/adsdk/ugeno/ivm/oa/moa;-><init>()V

    .line 23
    invoke-virtual {p2, p1}, Lcom/bytedance/adsdk/ugeno/ivm/oa/moa;->uef(Ljava/lang/String;)V

    .line 24
    iget-object p1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->oa:Lcom/bytedance/adsdk/ugeno/bcc/yo;

    invoke-virtual {p1, p5, p2}, Lcom/bytedance/adsdk/ugeno/bcc/yo;->uef(ZLcom/bytedance/adsdk/ugeno/bcc/yo$lw;)V

    .line 25
    iget-object p1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->oa:Lcom/bytedance/adsdk/ugeno/bcc/yo;

    const/4 p2, 0x2

    invoke-virtual {p1, p2}, Landroid/view/View;->setOverScrollMode(I)V

    goto :goto_1

    .line 26
    :cond_4
    const-string p2, "linear"

    invoke-static {p1, p2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_5

    .line 27
    iget-object p1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->oa:Lcom/bytedance/adsdk/ugeno/bcc/yo;

    new-instance p2, Lcom/bytedance/adsdk/ugeno/ivm/oa/yo;

    invoke-direct {p2}, Lcom/bytedance/adsdk/ugeno/ivm/oa/yo;-><init>()V

    invoke-virtual {p1, v0, p2}, Lcom/bytedance/adsdk/ugeno/bcc/yo;->uef(ZLcom/bytedance/adsdk/ugeno/bcc/yo$lw;)V

    goto :goto_1

    .line 28
    :cond_5
    const-string p2, "cube"

    invoke-static {p1, p2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_6

    .line 29
    iget-object p1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->oa:Lcom/bytedance/adsdk/ugeno/bcc/yo;

    new-instance p2, Lcom/bytedance/adsdk/ugeno/ivm/oa/uef;

    invoke-direct {p2}, Lcom/bytedance/adsdk/ugeno/ivm/oa/uef;-><init>()V

    invoke-virtual {p1, v0, p2}, Lcom/bytedance/adsdk/ugeno/bcc/yo;->uef(ZLcom/bytedance/adsdk/ugeno/bcc/yo$lw;)V

    goto :goto_1

    .line 30
    :cond_6
    const-string p2, "fade"

    invoke-static {p1, p2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_7

    .line 31
    iget-object p1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->oa:Lcom/bytedance/adsdk/ugeno/bcc/yo;

    new-instance p2, Lcom/bytedance/adsdk/ugeno/ivm/oa/oa;

    invoke-direct {p2}, Lcom/bytedance/adsdk/ugeno/ivm/oa/oa;-><init>()V

    invoke-virtual {p1, v0, p2}, Lcom/bytedance/adsdk/ugeno/bcc/yo;->uef(ZLcom/bytedance/adsdk/ugeno/bcc/yo$lw;)V

    goto :goto_1

    .line 32
    :cond_7
    iget-object p1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->oa:Lcom/bytedance/adsdk/ugeno/bcc/yo;

    const/4 p2, 0x0

    invoke-virtual {p1, v0, p2}, Lcom/bytedance/adsdk/ugeno/bcc/yo;->uef(ZLcom/bytedance/adsdk/ugeno/bcc/yo$lw;)V

    .line 33
    :goto_1
    iget-object p1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->oa:Lcom/bytedance/adsdk/ugeno/bcc/yo;

    iget p2, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->wrv:F

    float-to-int p2, p2

    invoke-virtual {p1, p2}, Lcom/bytedance/adsdk/ugeno/bcc/yo;->setOffscreenPageLimit(I)V

    return-void
.end method

.method public wrv(I)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->gr:Lcom/bytedance/adsdk/ugeno/ivm/yo;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->wk:Z

    .line 6
    .line 7
    iget-object v1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->uef:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-static {v0, p1, v1}, Lcom/bytedance/adsdk/ugeno/ivm/moa;->uef(ZII)I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    iget-object v2, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->gr:Lcom/bytedance/adsdk/ugeno/ivm/yo;

    .line 18
    .line 19
    iget-boolean v3, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->wk:Z

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    const/4 v1, 0x1

    .line 23
    if-nez v4, :cond_0

    .line 24
    .line 25
    move v6, v1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move v6, v0

    .line 28
    :goto_0
    iget-object v5, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->uef:Ljava/util/List;

    .line 29
    .line 30
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    sub-int/2addr v5, v1

    .line 35
    if-ne v4, v5, :cond_1

    .line 36
    .line 37
    move v7, v1

    .line 38
    :goto_1
    move v5, p1

    .line 39
    goto :goto_2

    .line 40
    :cond_1
    move v7, v0

    .line 41
    goto :goto_1

    .line 42
    :goto_2
    invoke-interface/range {v2 .. v7}, Lcom/bytedance/adsdk/ugeno/ivm/yo;->uef(ZIIZZ)V

    .line 43
    .line 44
    .line 45
    goto :goto_3

    .line 46
    :cond_2
    move v5, p1

    .line 47
    :goto_3
    iget-boolean p1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->cq:Z

    .line 48
    .line 49
    if-eqz p1, :cond_3

    .line 50
    .line 51
    iget-object p1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->gsd:Lcom/bytedance/adsdk/ugeno/ivm/uef/uef;

    .line 52
    .line 53
    invoke-virtual {p1, v5}, Lcom/bytedance/adsdk/ugeno/ivm/uef/uef;->uef(I)V

    .line 54
    .line 55
    .line 56
    :cond_3
    return-void
.end method

.method public xs(I)Lcom/bytedance/adsdk/ugeno/ivm/uef;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->gsd:Lcom/bytedance/adsdk/ugeno/ivm/uef/uef;

    invoke-virtual {v0, p1}, Lcom/bytedance/adsdk/ugeno/ivm/uef/uef;->setUnSelectedColor(I)V

    return-object p0
.end method

.method public yo(F)Lcom/bytedance/adsdk/ugeno/ivm/uef;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->gsd:Lcom/bytedance/adsdk/ugeno/ivm/uef/uef;

    invoke-virtual {v0, p1}, Lcom/bytedance/adsdk/ugeno/ivm/uef/uef;->setIndicatorX(F)V

    return-object p0
.end method

.method public yo(I)Lcom/bytedance/adsdk/ugeno/ivm/uef;
    .locals 2

    .line 3
    iput p1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->xs:I

    .line 4
    iget-object p1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->ue:Landroid/widget/Scroller;

    if-nez p1, :cond_0

    .line 5
    new-instance p1, Lcom/bytedance/adsdk/ugeno/ivm/uef$oa;

    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->yo:Landroid/content/Context;

    sget-object v1, Lcom/bytedance/adsdk/ugeno/ivm/uef;->cp:Landroid/view/animation/Interpolator;

    invoke-direct {p1, p0, v0, v1}, Lcom/bytedance/adsdk/ugeno/ivm/uef$oa;-><init>(Lcom/bytedance/adsdk/ugeno/ivm/uef;Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    iput-object p1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->ue:Landroid/widget/Scroller;

    .line 6
    :cond_0
    iget-object p1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->oa:Lcom/bytedance/adsdk/ugeno/bcc/yo;

    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->ue:Landroid/widget/Scroller;

    invoke-virtual {p1, v0}, Lcom/bytedance/adsdk/ugeno/bcc/yo;->setScroller(Landroid/widget/Scroller;)V

    return-object p0
.end method

.method public yo(Ljava/lang/String;)Lcom/bytedance/adsdk/ugeno/ivm/uef;
    .locals 6

    .line 8
    iput-object p1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->dj:Ljava/lang/String;

    .line 9
    iget v2, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->bcc:I

    iget v3, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->cz:I

    iget v4, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->zjm:I

    const/4 v5, 0x1

    move-object v0, p0

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, Lcom/bytedance/adsdk/ugeno/ivm/uef;->uef(Ljava/lang/String;IIIZ)V

    return-object v0
.end method

.method public yo(Z)Lcom/bytedance/adsdk/ugeno/ivm/uef;
    .locals 0

    .line 7
    iput-boolean p1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->cq:Z

    return-object p0
.end method

.method public yo()V
    .locals 6

    .line 10
    iget-object v1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->dj:Ljava/lang/String;

    iget v2, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->bcc:I

    iget v3, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->cz:I

    iget v4, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->zjm:I

    const/4 v5, 0x1

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/bytedance/adsdk/ugeno/ivm/uef;->uef(Ljava/lang/String;IIIZ)V

    .line 11
    iget-object v1, v0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->rt:Lcom/bytedance/adsdk/ugeno/ivm/uef$uef;

    if-nez v1, :cond_0

    .line 12
    new-instance v1, Lcom/bytedance/adsdk/ugeno/ivm/uef$uef;

    invoke-direct {v1, p0}, Lcom/bytedance/adsdk/ugeno/ivm/uef$uef;-><init>(Lcom/bytedance/adsdk/ugeno/ivm/uef;)V

    iput-object v1, v0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->rt:Lcom/bytedance/adsdk/ugeno/ivm/uef$uef;

    .line 13
    iget-object v1, v0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->oa:Lcom/bytedance/adsdk/ugeno/bcc/yo;

    invoke-virtual {v1, p0}, Lcom/bytedance/adsdk/ugeno/bcc/yo;->uef(Lcom/bytedance/adsdk/ugeno/bcc/yo$moa;)V

    .line 14
    iget-object v1, v0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->oa:Lcom/bytedance/adsdk/ugeno/bcc/yo;

    iget-object v2, v0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->rt:Lcom/bytedance/adsdk/ugeno/ivm/uef$uef;

    invoke-virtual {v1, v2}, Lcom/bytedance/adsdk/ugeno/bcc/yo;->setAdapter(Lcom/bytedance/adsdk/ugeno/bcc/oa;)V

    .line 15
    :cond_0
    iget v1, v0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->oib:I

    if-ltz v1, :cond_1

    iget-object v2, v0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->uef:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lt v1, v2, :cond_2

    :cond_1
    const/4 v1, 0x0

    .line 16
    iput v1, v0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->oib:I

    .line 17
    :cond_2
    iget-boolean v1, v0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->wk:Z

    if-eqz v1, :cond_3

    .line 18
    iget v1, v0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->oib:I

    add-int/lit16 v1, v1, 0x200

    goto :goto_0

    .line 19
    :cond_3
    iget v1, v0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->oib:I

    .line 20
    :goto_0
    iget-object v2, v0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->oa:Lcom/bytedance/adsdk/ugeno/bcc/yo;

    const/4 v3, 0x1

    invoke-virtual {v2, v1, v3}, Lcom/bytedance/adsdk/ugeno/bcc/yo;->uef(IZ)V

    .line 21
    iget-boolean v2, v0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->wk:Z

    if-nez v2, :cond_4

    .line 22
    invoke-virtual {p0, v1}, Lcom/bytedance/adsdk/ugeno/ivm/uef;->wrv(I)V

    .line 23
    :cond_4
    iget-boolean v1, v0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->dz:Z

    if-eqz v1, :cond_5

    .line 24
    invoke-virtual {p0}, Lcom/bytedance/adsdk/ugeno/ivm/uef;->lw()V

    :cond_5
    return-void
.end method

.method public zjm(I)Lcom/bytedance/adsdk/ugeno/ivm/uef;
    .locals 6

    .line 1
    iput p1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->zjm:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->dj:Ljava/lang/String;

    .line 4
    .line 5
    iget v2, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->bcc:I

    .line 6
    .line 7
    iget v3, p0, Lcom/bytedance/adsdk/ugeno/ivm/uef;->cz:I

    .line 8
    .line 9
    const/4 v5, 0x1

    .line 10
    move-object v0, p0

    .line 11
    move v4, p1

    .line 12
    invoke-virtual/range {v0 .. v5}, Lcom/bytedance/adsdk/ugeno/ivm/uef;->uef(Ljava/lang/String;IIIZ)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method
