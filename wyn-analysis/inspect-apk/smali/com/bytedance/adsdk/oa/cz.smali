.class public Lcom/bytedance/adsdk/oa/cz;
.super Landroid/graphics/drawable/Drawable;
.source "SourceFile"

# interfaces
.implements Landroid/graphics/drawable/Animatable;
.implements Landroid/graphics/drawable/Drawable$Callback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/adsdk/oa/cz$oa;,
        Lcom/bytedance/adsdk/oa/cz$uef;
    }
.end annotation


# instance fields
.field private ab:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroid/graphics/Typeface;",
            ">;"
        }
    .end annotation
.end field

.field private af:Landroid/graphics/Matrix;

.field private bcc:Z

.field private bs:Z

.field private cp:Landroid/graphics/Canvas;

.field private cq:Ljava/lang/String;

.field private cz:Lcom/bytedance/adsdk/oa/cz$oa;

.field private dhk:Lcom/bytedance/adsdk/oa/yo/yo/oa;

.field private final dj:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

.field private dxx:Landroid/graphics/Paint;

.field private dz:Lcom/bytedance/adsdk/oa/moa;

.field private fz:Landroid/graphics/RectF;

.field private gb:Landroid/graphics/Matrix;

.field private gr:Z

.field private gsd:Z

.field private gzw:Z

.field private ivm:Z

.field private km:Landroid/graphics/RectF;

.field private ku:Landroid/graphics/Rect;

.field private final lw:Lcom/bytedance/adsdk/oa/ivm/yo;

.field private lz:Landroid/graphics/Rect;

.field private moa:Lcom/bytedance/adsdk/oa/xs;

.field oa:Lcom/bytedance/adsdk/oa/yo;

.field private oib:Z

.field private orq:Z

.field private oyt:Landroid/graphics/Rect;

.field private pu:Landroid/graphics/RectF;

.field private pz:Landroid/graphics/Bitmap;

.field private rl:Z

.field private rt:Lcom/bytedance/adsdk/oa/oib;

.field private sk:Landroid/view/View;

.field private sy:Z

.field private tpx:I

.field private final ue:Landroid/graphics/Matrix;

.field uef:Ljava/lang/String;

.field private wk:Lcom/bytedance/adsdk/oa/oa/uef;

.field private wrv:Lcom/bytedance/adsdk/oa/oa/oa;

.field private xs:Z

.field yo:Lcom/bytedance/adsdk/oa/dhk;

.field private final zjm:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/bytedance/adsdk/oa/cz$uef;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/bytedance/adsdk/oa/ivm/yo;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/bytedance/adsdk/oa/ivm/yo;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->lw:Lcom/bytedance/adsdk/oa/ivm/yo;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    iput-boolean v1, p0, Lcom/bytedance/adsdk/oa/cz;->ivm:Z

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    iput-boolean v2, p0, Lcom/bytedance/adsdk/oa/cz;->xs:Z

    .line 16
    .line 17
    iput-boolean v2, p0, Lcom/bytedance/adsdk/oa/cz;->bcc:Z

    .line 18
    .line 19
    sget-object v3, Lcom/bytedance/adsdk/oa/cz$oa;->uef:Lcom/bytedance/adsdk/oa/cz$oa;

    .line 20
    .line 21
    iput-object v3, p0, Lcom/bytedance/adsdk/oa/cz;->cz:Lcom/bytedance/adsdk/oa/cz$oa;

    .line 22
    .line 23
    new-instance v3, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v3, p0, Lcom/bytedance/adsdk/oa/cz;->zjm:Ljava/util/ArrayList;

    .line 29
    .line 30
    new-instance v3, Lcom/bytedance/adsdk/oa/cz$1;

    .line 31
    .line 32
    invoke-direct {v3, p0}, Lcom/bytedance/adsdk/oa/cz$1;-><init>(Lcom/bytedance/adsdk/oa/cz;)V

    .line 33
    .line 34
    .line 35
    iput-object v3, p0, Lcom/bytedance/adsdk/oa/cz;->dj:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    .line 36
    .line 37
    iput-boolean v2, p0, Lcom/bytedance/adsdk/oa/cz;->sy:Z

    .line 38
    .line 39
    iput-boolean v1, p0, Lcom/bytedance/adsdk/oa/cz;->oib:Z

    .line 40
    .line 41
    const/16 v1, 0xff

    .line 42
    .line 43
    iput v1, p0, Lcom/bytedance/adsdk/oa/cz;->tpx:I

    .line 44
    .line 45
    sget-object v1, Lcom/bytedance/adsdk/oa/oib;->uef:Lcom/bytedance/adsdk/oa/oib;

    .line 46
    .line 47
    iput-object v1, p0, Lcom/bytedance/adsdk/oa/cz;->rt:Lcom/bytedance/adsdk/oa/oib;

    .line 48
    .line 49
    iput-boolean v2, p0, Lcom/bytedance/adsdk/oa/cz;->gr:Z

    .line 50
    .line 51
    new-instance v1, Landroid/graphics/Matrix;

    .line 52
    .line 53
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object v1, p0, Lcom/bytedance/adsdk/oa/cz;->ue:Landroid/graphics/Matrix;

    .line 57
    .line 58
    iput-boolean v2, p0, Lcom/bytedance/adsdk/oa/cz;->rl:Z

    .line 59
    .line 60
    invoke-virtual {v0, v3}, Lcom/bytedance/adsdk/oa/ivm/uef;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method private dxx()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/adsdk/oa/cz;->ivm:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/bytedance/adsdk/oa/cz;->xs:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0

    .line 12
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 13
    return v0
.end method

.method private fz()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->moa:Lcom/bytedance/adsdk/oa/xs;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v1, p0, Lcom/bytedance/adsdk/oa/cz;->rt:Lcom/bytedance/adsdk/oa/oib;

    .line 7
    .line 8
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/bytedance/adsdk/oa/xs;->uef()Z

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    invoke-virtual {v0}, Lcom/bytedance/adsdk/oa/xs;->oa()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-virtual {v1, v2, v3, v0}, Lcom/bytedance/adsdk/oa/oib;->uef(IZI)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iput-boolean v0, p0, Lcom/bytedance/adsdk/oa/cz;->gr:Z

    .line 23
    .line 24
    return-void
.end method

.method private gb()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Landroid/view/View;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    return v2

    .line 11
    :cond_0
    check-cast v0, Landroid/view/View;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    instance-of v1, v0, Landroid/view/ViewGroup;

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    check-cast v0, Landroid/view/ViewGroup;

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getClipChildren()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    return v0

    .line 31
    :cond_1
    return v2
.end method

.method private km()Landroid/content/Context;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    instance-of v2, v0, Landroid/view/View;

    .line 10
    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    check-cast v0, Landroid/view/View;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0

    .line 20
    :cond_1
    return-object v1
.end method

.method private lz()Lcom/bytedance/adsdk/oa/oa/oa;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->wrv:Lcom/bytedance/adsdk/oa/oa/oa;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/bytedance/adsdk/oa/cz;->km()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Lcom/bytedance/adsdk/oa/oa/oa;->uef(Landroid/content/Context;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->wrv:Lcom/bytedance/adsdk/oa/oa/oa;

    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->wrv:Lcom/bytedance/adsdk/oa/oa/oa;

    .line 19
    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    new-instance v0, Lcom/bytedance/adsdk/oa/oa/oa;

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iget-object v2, p0, Lcom/bytedance/adsdk/oa/cz;->cq:Ljava/lang/String;

    .line 29
    .line 30
    iget-object v3, p0, Lcom/bytedance/adsdk/oa/cz;->dz:Lcom/bytedance/adsdk/oa/moa;

    .line 31
    .line 32
    iget-object v4, p0, Lcom/bytedance/adsdk/oa/cz;->moa:Lcom/bytedance/adsdk/oa/xs;

    .line 33
    .line 34
    invoke-virtual {v4}, Lcom/bytedance/adsdk/oa/xs;->ab()Ljava/util/Map;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/bytedance/adsdk/oa/oa/oa;-><init>(Landroid/graphics/drawable/Drawable$Callback;Ljava/lang/String;Lcom/bytedance/adsdk/oa/moa;Ljava/util/Map;)V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->wrv:Lcom/bytedance/adsdk/oa/oa/oa;

    .line 42
    .line 43
    :cond_1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->wrv:Lcom/bytedance/adsdk/oa/oa/oa;

    .line 44
    .line 45
    return-object v0
.end method

.method public static synthetic oa(Lcom/bytedance/adsdk/oa/cz;)Lcom/bytedance/adsdk/oa/ivm/yo;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/adsdk/oa/cz;->lw:Lcom/bytedance/adsdk/oa/ivm/yo;

    return-object p0
.end method

.method private oa(II)V
    .locals 3

    .line 24
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->pz:Landroid/graphics/Bitmap;

    const/4 v1, 0x1

    if-eqz v0, :cond_3

    .line 25
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    if-lt v0, p1, :cond_3

    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->pz:Landroid/graphics/Bitmap;

    .line 26
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    if-ge v0, p2, :cond_0

    goto :goto_1

    .line 27
    :cond_0
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->pz:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    if-gt v0, p1, :cond_2

    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->pz:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    if-le v0, p2, :cond_1

    goto :goto_0

    :cond_1
    return-void

    .line 28
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->pz:Landroid/graphics/Bitmap;

    const/4 v2, 0x0

    invoke-static {v0, v2, v2, p1, p2}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lcom/bytedance/adsdk/oa/cz;->pz:Landroid/graphics/Bitmap;

    .line 29
    iget-object p2, p0, Lcom/bytedance/adsdk/oa/cz;->cp:Landroid/graphics/Canvas;

    invoke-virtual {p2, p1}, Landroid/graphics/Canvas;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 30
    iput-boolean v1, p0, Lcom/bytedance/adsdk/oa/cz;->rl:Z

    return-void

    .line 31
    :cond_3
    :goto_1
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {p1, p2, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lcom/bytedance/adsdk/oa/cz;->pz:Landroid/graphics/Bitmap;

    .line 32
    iget-object p2, p0, Lcom/bytedance/adsdk/oa/cz;->cp:Landroid/graphics/Canvas;

    invoke-virtual {p2, p1}, Landroid/graphics/Canvas;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 33
    iput-boolean v1, p0, Lcom/bytedance/adsdk/oa/cz;->rl:Z

    return-void
.end method

.method private oyt()Lcom/bytedance/adsdk/oa/oa/uef;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return-object v0

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->wk:Lcom/bytedance/adsdk/oa/oa/uef;

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    new-instance v0, Lcom/bytedance/adsdk/oa/oa/uef;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget-object v2, p0, Lcom/bytedance/adsdk/oa/cz;->oa:Lcom/bytedance/adsdk/oa/yo;

    .line 20
    .line 21
    invoke-direct {v0, v1, v2}, Lcom/bytedance/adsdk/oa/oa/uef;-><init>(Landroid/graphics/drawable/Drawable$Callback;Lcom/bytedance/adsdk/oa/yo;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->wk:Lcom/bytedance/adsdk/oa/oa/uef;

    .line 25
    .line 26
    iget-object v1, p0, Lcom/bytedance/adsdk/oa/cz;->uef:Ljava/lang/String;

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Lcom/bytedance/adsdk/oa/oa/uef;->uef(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->wk:Lcom/bytedance/adsdk/oa/oa/uef;

    .line 34
    .line 35
    return-object v0
.end method

.method private pu()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->cp:Landroid/graphics/Canvas;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Landroid/graphics/Canvas;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/graphics/Canvas;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->cp:Landroid/graphics/Canvas;

    .line 12
    .line 13
    new-instance v0, Landroid/graphics/RectF;

    .line 14
    .line 15
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->pu:Landroid/graphics/RectF;

    .line 19
    .line 20
    new-instance v0, Landroid/graphics/Matrix;

    .line 21
    .line 22
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->gb:Landroid/graphics/Matrix;

    .line 26
    .line 27
    new-instance v0, Landroid/graphics/Matrix;

    .line 28
    .line 29
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->af:Landroid/graphics/Matrix;

    .line 33
    .line 34
    new-instance v0, Landroid/graphics/Rect;

    .line 35
    .line 36
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->ku:Landroid/graphics/Rect;

    .line 40
    .line 41
    new-instance v0, Landroid/graphics/RectF;

    .line 42
    .line 43
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->fz:Landroid/graphics/RectF;

    .line 47
    .line 48
    new-instance v0, Lcom/bytedance/adsdk/oa/uef/uef;

    .line 49
    .line 50
    invoke-direct {v0}, Lcom/bytedance/adsdk/oa/uef/uef;-><init>()V

    .line 51
    .line 52
    .line 53
    iput-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->dxx:Landroid/graphics/Paint;

    .line 54
    .line 55
    new-instance v0, Landroid/graphics/Rect;

    .line 56
    .line 57
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 58
    .line 59
    .line 60
    iput-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->lz:Landroid/graphics/Rect;

    .line 61
    .line 62
    new-instance v0, Landroid/graphics/Rect;

    .line 63
    .line 64
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 65
    .line 66
    .line 67
    iput-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->oyt:Landroid/graphics/Rect;

    .line 68
    .line 69
    new-instance v0, Landroid/graphics/RectF;

    .line 70
    .line 71
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 72
    .line 73
    .line 74
    iput-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->km:Landroid/graphics/RectF;

    .line 75
    .line 76
    return-void
.end method

.method public static synthetic uef(Lcom/bytedance/adsdk/oa/cz;)Lcom/bytedance/adsdk/oa/yo/yo/oa;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/adsdk/oa/cz;->dhk:Lcom/bytedance/adsdk/oa/yo/yo/oa;

    return-object p0
.end method

.method private uef(Landroid/content/Context;)V
    .locals 6

    .line 35
    iget-object v4, p0, Lcom/bytedance/adsdk/oa/cz;->moa:Lcom/bytedance/adsdk/oa/xs;

    if-nez v4, :cond_0

    return-void

    .line 36
    :cond_0
    new-instance v0, Lcom/bytedance/adsdk/oa/yo/yo/oa;

    .line 37
    invoke-static {v4}, Lcom/bytedance/adsdk/oa/lw/orq;->uef(Lcom/bytedance/adsdk/oa/xs;)Lcom/bytedance/adsdk/oa/yo/yo/lw;

    move-result-object v2

    invoke-virtual {v4}, Lcom/bytedance/adsdk/oa/xs;->cq()Ljava/util/List;

    move-result-object v3

    move-object v1, p0

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lcom/bytedance/adsdk/oa/yo/yo/oa;-><init>(Lcom/bytedance/adsdk/oa/cz;Lcom/bytedance/adsdk/oa/yo/yo/lw;Ljava/util/List;Lcom/bytedance/adsdk/oa/xs;Landroid/content/Context;)V

    iput-object v0, v1, Lcom/bytedance/adsdk/oa/cz;->dhk:Lcom/bytedance/adsdk/oa/yo/yo/oa;

    .line 38
    iget-boolean p1, v1, Lcom/bytedance/adsdk/oa/cz;->gzw:Z

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    .line 39
    invoke-virtual {v0, p1}, Lcom/bytedance/adsdk/oa/yo/yo/oa;->uef(Z)V

    .line 40
    :cond_1
    iget-object p1, v1, Lcom/bytedance/adsdk/oa/cz;->dhk:Lcom/bytedance/adsdk/oa/yo/yo/oa;

    iget-boolean v0, v1, Lcom/bytedance/adsdk/oa/cz;->oib:Z

    invoke-virtual {p1, v0}, Lcom/bytedance/adsdk/oa/yo/yo/oa;->oa(Z)V

    return-void
.end method

.method private uef(Landroid/graphics/Canvas;)V
    .locals 5

    .line 78
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->dhk:Lcom/bytedance/adsdk/oa/yo/yo/oa;

    .line 79
    iget-object v1, p0, Lcom/bytedance/adsdk/oa/cz;->moa:Lcom/bytedance/adsdk/oa/xs;

    if-eqz v0, :cond_2

    if-nez v1, :cond_0

    goto :goto_0

    .line 80
    :cond_0
    iget-object v2, p0, Lcom/bytedance/adsdk/oa/cz;->ue:Landroid/graphics/Matrix;

    invoke-virtual {v2}, Landroid/graphics/Matrix;->reset()V

    .line 81
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v2

    .line 82
    invoke-virtual {v2}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    .line 83
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v1}, Lcom/bytedance/adsdk/oa/xs;->moa()Landroid/graphics/Rect;

    move-result-object v4

    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v3, v4

    .line 84
    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {v1}, Lcom/bytedance/adsdk/oa/xs;->moa()Landroid/graphics/Rect;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v4, v1

    .line 85
    iget-object v1, p0, Lcom/bytedance/adsdk/oa/cz;->ue:Landroid/graphics/Matrix;

    invoke-virtual {v1, v3, v4}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 86
    iget-object v1, p0, Lcom/bytedance/adsdk/oa/cz;->ue:Landroid/graphics/Matrix;

    iget v3, v2, Landroid/graphics/Rect;->left:I

    int-to-float v3, v3

    iget v2, v2, Landroid/graphics/Rect;->top:I

    int-to-float v2, v2

    invoke-virtual {v1, v3, v2}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 87
    :cond_1
    iget-object v1, p0, Lcom/bytedance/adsdk/oa/cz;->ue:Landroid/graphics/Matrix;

    iget v2, p0, Lcom/bytedance/adsdk/oa/cz;->tpx:I

    invoke-virtual {v0, p1, v1, v2}, Lcom/bytedance/adsdk/oa/yo/yo/uef;->uef(Landroid/graphics/Canvas;Landroid/graphics/Matrix;I)V

    :cond_2
    :goto_0
    return-void
.end method

.method private uef(Landroid/graphics/Canvas;Lcom/bytedance/adsdk/oa/yo/yo/oa;)V
    .locals 8

    .line 88
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->moa:Lcom/bytedance/adsdk/oa/xs;

    if-eqz v0, :cond_5

    if-nez p2, :cond_0

    goto/16 :goto_1

    .line 89
    :cond_0
    invoke-direct {p0}, Lcom/bytedance/adsdk/oa/cz;->pu()V

    .line 90
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->gb:Landroid/graphics/Matrix;

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->getMatrix(Landroid/graphics/Matrix;)V

    .line 91
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->ku:Landroid/graphics/Rect;

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->getClipBounds(Landroid/graphics/Rect;)Z

    .line 92
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->ku:Landroid/graphics/Rect;

    iget-object v1, p0, Lcom/bytedance/adsdk/oa/cz;->fz:Landroid/graphics/RectF;

    invoke-direct {p0, v0, v1}, Lcom/bytedance/adsdk/oa/cz;->uef(Landroid/graphics/Rect;Landroid/graphics/RectF;)V

    .line 93
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->gb:Landroid/graphics/Matrix;

    iget-object v1, p0, Lcom/bytedance/adsdk/oa/cz;->fz:Landroid/graphics/RectF;

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 94
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->fz:Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/bytedance/adsdk/oa/cz;->ku:Landroid/graphics/Rect;

    invoke-direct {p0, v0, v1}, Lcom/bytedance/adsdk/oa/cz;->uef(Landroid/graphics/RectF;Landroid/graphics/Rect;)V

    .line 95
    iget-boolean v0, p0, Lcom/bytedance/adsdk/oa/cz;->oib:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 96
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->pu:Landroid/graphics/RectF;

    invoke-virtual {p0}, Lcom/bytedance/adsdk/oa/cz;->getIntrinsicWidth()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p0}, Lcom/bytedance/adsdk/oa/cz;->getIntrinsicHeight()I

    move-result v3

    int-to-float v3, v3

    const/4 v4, 0x0

    invoke-virtual {v0, v4, v4, v2, v3}, Landroid/graphics/RectF;->set(FFFF)V

    goto :goto_0

    .line 97
    :cond_1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->pu:Landroid/graphics/RectF;

    const/4 v2, 0x0

    invoke-virtual {p2, v0, v2, v1}, Lcom/bytedance/adsdk/oa/yo/yo/oa;->uef(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V

    .line 98
    :goto_0
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->gb:Landroid/graphics/Matrix;

    iget-object v2, p0, Lcom/bytedance/adsdk/oa/cz;->pu:Landroid/graphics/RectF;

    invoke-virtual {v0, v2}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 99
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    .line 100
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p0}, Lcom/bytedance/adsdk/oa/cz;->getIntrinsicWidth()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v2, v3

    .line 101
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0}, Lcom/bytedance/adsdk/oa/cz;->getIntrinsicHeight()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v0, v3

    .line 102
    iget-object v3, p0, Lcom/bytedance/adsdk/oa/cz;->pu:Landroid/graphics/RectF;

    invoke-direct {p0, v3, v2, v0}, Lcom/bytedance/adsdk/oa/cz;->uef(Landroid/graphics/RectF;FF)V

    .line 103
    invoke-direct {p0}, Lcom/bytedance/adsdk/oa/cz;->gb()Z

    move-result v3

    if-nez v3, :cond_2

    .line 104
    iget-object v3, p0, Lcom/bytedance/adsdk/oa/cz;->pu:Landroid/graphics/RectF;

    iget-object v4, p0, Lcom/bytedance/adsdk/oa/cz;->ku:Landroid/graphics/Rect;

    iget v5, v4, Landroid/graphics/Rect;->left:I

    int-to-float v5, v5

    iget v6, v4, Landroid/graphics/Rect;->top:I

    int-to-float v6, v6

    iget v7, v4, Landroid/graphics/Rect;->right:I

    int-to-float v7, v7

    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    int-to-float v4, v4

    invoke-virtual {v3, v5, v6, v7, v4}, Landroid/graphics/RectF;->intersect(FFFF)Z

    .line 105
    :cond_2
    iget-object v3, p0, Lcom/bytedance/adsdk/oa/cz;->pu:Landroid/graphics/RectF;

    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    move-result v3

    float-to-double v3, v3

    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v3

    double-to-int v3, v3

    .line 106
    iget-object v4, p0, Lcom/bytedance/adsdk/oa/cz;->pu:Landroid/graphics/RectF;

    invoke-virtual {v4}, Landroid/graphics/RectF;->height()F

    move-result v4

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v4

    double-to-int v4, v4

    if-eqz v3, :cond_5

    if-nez v4, :cond_3

    goto :goto_1

    .line 107
    :cond_3
    invoke-direct {p0, v3, v4}, Lcom/bytedance/adsdk/oa/cz;->oa(II)V

    .line 108
    iget-boolean v5, p0, Lcom/bytedance/adsdk/oa/cz;->rl:Z

    if-eqz v5, :cond_4

    .line 109
    iget-object v5, p0, Lcom/bytedance/adsdk/oa/cz;->ue:Landroid/graphics/Matrix;

    iget-object v6, p0, Lcom/bytedance/adsdk/oa/cz;->gb:Landroid/graphics/Matrix;

    invoke-virtual {v5, v6}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 110
    iget-object v5, p0, Lcom/bytedance/adsdk/oa/cz;->ue:Landroid/graphics/Matrix;

    invoke-virtual {v5, v2, v0}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 111
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->ue:Landroid/graphics/Matrix;

    iget-object v2, p0, Lcom/bytedance/adsdk/oa/cz;->pu:Landroid/graphics/RectF;

    iget v5, v2, Landroid/graphics/RectF;->left:F

    neg-float v5, v5

    iget v2, v2, Landroid/graphics/RectF;->top:F

    neg-float v2, v2

    invoke-virtual {v0, v5, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 112
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->pz:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Landroid/graphics/Bitmap;->eraseColor(I)V

    .line 113
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->cp:Landroid/graphics/Canvas;

    iget-object v2, p0, Lcom/bytedance/adsdk/oa/cz;->ue:Landroid/graphics/Matrix;

    iget v5, p0, Lcom/bytedance/adsdk/oa/cz;->tpx:I

    invoke-virtual {p2, v0, v2, v5}, Lcom/bytedance/adsdk/oa/yo/yo/uef;->uef(Landroid/graphics/Canvas;Landroid/graphics/Matrix;I)V

    .line 114
    iget-object p2, p0, Lcom/bytedance/adsdk/oa/cz;->gb:Landroid/graphics/Matrix;

    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->af:Landroid/graphics/Matrix;

    invoke-virtual {p2, v0}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 115
    iget-object p2, p0, Lcom/bytedance/adsdk/oa/cz;->af:Landroid/graphics/Matrix;

    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->km:Landroid/graphics/RectF;

    iget-object v2, p0, Lcom/bytedance/adsdk/oa/cz;->pu:Landroid/graphics/RectF;

    invoke-virtual {p2, v0, v2}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z

    .line 116
    iget-object p2, p0, Lcom/bytedance/adsdk/oa/cz;->km:Landroid/graphics/RectF;

    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->oyt:Landroid/graphics/Rect;

    invoke-direct {p0, p2, v0}, Lcom/bytedance/adsdk/oa/cz;->uef(Landroid/graphics/RectF;Landroid/graphics/Rect;)V

    .line 117
    :cond_4
    iget-object p2, p0, Lcom/bytedance/adsdk/oa/cz;->lz:Landroid/graphics/Rect;

    invoke-virtual {p2, v1, v1, v3, v4}, Landroid/graphics/Rect;->set(IIII)V

    .line 118
    iget-object p2, p0, Lcom/bytedance/adsdk/oa/cz;->pz:Landroid/graphics/Bitmap;

    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->lz:Landroid/graphics/Rect;

    iget-object v1, p0, Lcom/bytedance/adsdk/oa/cz;->oyt:Landroid/graphics/Rect;

    iget-object v2, p0, Lcom/bytedance/adsdk/oa/cz;->dxx:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, v0, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    :cond_5
    :goto_1
    return-void
.end method

.method private uef(Landroid/graphics/Rect;Landroid/graphics/RectF;)V
    .locals 3

    .line 125
    iget v0, p1, Landroid/graphics/Rect;->left:I

    int-to-float v0, v0

    iget v1, p1, Landroid/graphics/Rect;->top:I

    int-to-float v1, v1

    iget v2, p1, Landroid/graphics/Rect;->right:I

    int-to-float v2, v2

    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    int-to-float p1, p1

    invoke-virtual {p2, v0, v1, v2, p1}, Landroid/graphics/RectF;->set(FFFF)V

    return-void
.end method

.method private uef(Landroid/graphics/RectF;FF)V
    .locals 3

    .line 126
    iget v0, p1, Landroid/graphics/RectF;->left:F

    mul-float/2addr v0, p2

    iget v1, p1, Landroid/graphics/RectF;->top:F

    mul-float/2addr v1, p3

    iget v2, p1, Landroid/graphics/RectF;->right:F

    mul-float/2addr v2, p2

    iget p2, p1, Landroid/graphics/RectF;->bottom:F

    mul-float/2addr p2, p3

    invoke-virtual {p1, v0, v1, v2, p2}, Landroid/graphics/RectF;->set(FFFF)V

    return-void
.end method

.method private uef(Landroid/graphics/RectF;Landroid/graphics/Rect;)V
    .locals 5

    .line 119
    iget v0, p1, Landroid/graphics/RectF;->left:F

    float-to-double v0, v0

    .line 120
    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-int v0, v0

    iget v1, p1, Landroid/graphics/RectF;->top:F

    float-to-double v1, v1

    .line 121
    invoke-static {v1, v2}, Ljava/lang/Math;->floor(D)D

    move-result-wide v1

    double-to-int v1, v1

    iget v2, p1, Landroid/graphics/RectF;->right:F

    float-to-double v2, v2

    .line 122
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v2, v2

    iget p1, p1, Landroid/graphics/RectF;->bottom:F

    float-to-double v3, p1

    .line 123
    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v3

    double-to-int p1, v3

    .line 124
    invoke-virtual {p2, v0, v1, v2, p1}, Landroid/graphics/Rect;->set(IIII)V

    return-void
.end method


# virtual methods
.method public ab()F
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->lw:Lcom/bytedance/adsdk/oa/ivm/yo;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/adsdk/oa/ivm/yo;->zjm()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public bcc()Lcom/bytedance/adsdk/oa/sy;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->moa:Lcom/bytedance/adsdk/oa/xs;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/bytedance/adsdk/oa/xs;->yo()Lcom/bytedance/adsdk/oa/sy;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public bcc(Z)V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->lw:Lcom/bytedance/adsdk/oa/ivm/yo;

    invoke-virtual {v0, p1}, Lcom/bytedance/adsdk/oa/ivm/yo;->yo(Z)V

    return-void
.end method

.method public bs()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->lw:Lcom/bytedance/adsdk/oa/ivm/yo;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/adsdk/oa/ivm/uef;->removeAllUpdateListeners()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->lw:Lcom/bytedance/adsdk/oa/ivm/yo;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/bytedance/adsdk/oa/cz;->dj:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lcom/bytedance/adsdk/oa/ivm/uef;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public cp()F
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->lw:Lcom/bytedance/adsdk/oa/ivm/yo;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/adsdk/oa/ivm/yo;->ivm()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public cq()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->dhk:Lcom/bytedance/adsdk/oa/yo/yo/oa;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->zjm:Ljava/util/ArrayList;

    .line 6
    .line 7
    new-instance v1, Lcom/bytedance/adsdk/oa/cz$7;

    .line 8
    .line 9
    invoke-direct {v1, p0}, Lcom/bytedance/adsdk/oa/cz$7;-><init>(Lcom/bytedance/adsdk/oa/cz;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-direct {p0}, Lcom/bytedance/adsdk/oa/cz;->fz()V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Lcom/bytedance/adsdk/oa/cz;->dxx()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/bytedance/adsdk/oa/cz;->tpx()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_3

    .line 30
    .line 31
    :cond_1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->lw:Lcom/bytedance/adsdk/oa/ivm/yo;

    .line 38
    .line 39
    invoke-virtual {v0}, Lcom/bytedance/adsdk/oa/ivm/yo;->dz()V

    .line 40
    .line 41
    .line 42
    sget-object v0, Lcom/bytedance/adsdk/oa/cz$oa;->uef:Lcom/bytedance/adsdk/oa/cz$oa;

    .line 43
    .line 44
    iput-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->cz:Lcom/bytedance/adsdk/oa/cz$oa;

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    sget-object v0, Lcom/bytedance/adsdk/oa/cz$oa;->yo:Lcom/bytedance/adsdk/oa/cz$oa;

    .line 48
    .line 49
    iput-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->cz:Lcom/bytedance/adsdk/oa/cz$oa;

    .line 50
    .line 51
    :cond_3
    :goto_0
    invoke-direct {p0}, Lcom/bytedance/adsdk/oa/cz;->dxx()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_5

    .line 56
    .line 57
    invoke-virtual {p0}, Lcom/bytedance/adsdk/oa/cz;->ab()F

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    const/4 v1, 0x0

    .line 62
    cmpg-float v0, v0, v1

    .line 63
    .line 64
    if-gez v0, :cond_4

    .line 65
    .line 66
    invoke-virtual {p0}, Lcom/bytedance/adsdk/oa/cz;->dz()F

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    goto :goto_1

    .line 71
    :cond_4
    invoke-virtual {p0}, Lcom/bytedance/adsdk/oa/cz;->wk()F

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    :goto_1
    float-to-int v0, v0

    .line 76
    invoke-virtual {p0, v0}, Lcom/bytedance/adsdk/oa/cz;->yo(I)V

    .line 77
    .line 78
    .line 79
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->lw:Lcom/bytedance/adsdk/oa/ivm/yo;

    .line 80
    .line 81
    invoke-virtual {v0}, Lcom/bytedance/adsdk/oa/ivm/yo;->wrv()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-nez v0, :cond_5

    .line 89
    .line 90
    sget-object v0, Lcom/bytedance/adsdk/oa/cz$oa;->uef:Lcom/bytedance/adsdk/oa/cz$oa;

    .line 91
    .line 92
    iput-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->cz:Lcom/bytedance/adsdk/oa/cz$oa;

    .line 93
    .line 94
    :cond_5
    return-void
.end method

.method public cz()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/adsdk/oa/cz;->gsd:Z

    .line 2
    .line 3
    return v0
.end method

.method public dhk()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->lw:Lcom/bytedance/adsdk/oa/ivm/yo;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->getRepeatMode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public dj()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->dhk:Lcom/bytedance/adsdk/oa/yo/yo/oa;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->zjm:Ljava/util/ArrayList;

    .line 6
    .line 7
    new-instance v1, Lcom/bytedance/adsdk/oa/cz$6;

    .line 8
    .line 9
    invoke-direct {v1, p0}, Lcom/bytedance/adsdk/oa/cz$6;-><init>(Lcom/bytedance/adsdk/oa/cz;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-direct {p0}, Lcom/bytedance/adsdk/oa/cz;->fz()V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Lcom/bytedance/adsdk/oa/cz;->dxx()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/bytedance/adsdk/oa/cz;->tpx()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_3

    .line 30
    .line 31
    :cond_1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->lw:Lcom/bytedance/adsdk/oa/ivm/yo;

    .line 38
    .line 39
    invoke-virtual {v0}, Lcom/bytedance/adsdk/oa/ivm/yo;->dj()V

    .line 40
    .line 41
    .line 42
    sget-object v0, Lcom/bytedance/adsdk/oa/cz$oa;->uef:Lcom/bytedance/adsdk/oa/cz$oa;

    .line 43
    .line 44
    iput-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->cz:Lcom/bytedance/adsdk/oa/cz$oa;

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    sget-object v0, Lcom/bytedance/adsdk/oa/cz$oa;->oa:Lcom/bytedance/adsdk/oa/cz$oa;

    .line 48
    .line 49
    iput-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->cz:Lcom/bytedance/adsdk/oa/cz$oa;

    .line 50
    .line 51
    :cond_3
    :goto_0
    invoke-direct {p0}, Lcom/bytedance/adsdk/oa/cz;->dxx()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_5

    .line 56
    .line 57
    invoke-virtual {p0}, Lcom/bytedance/adsdk/oa/cz;->ab()F

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    const/4 v1, 0x0

    .line 62
    cmpg-float v0, v0, v1

    .line 63
    .line 64
    if-gez v0, :cond_4

    .line 65
    .line 66
    invoke-virtual {p0}, Lcom/bytedance/adsdk/oa/cz;->dz()F

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    goto :goto_1

    .line 71
    :cond_4
    invoke-virtual {p0}, Lcom/bytedance/adsdk/oa/cz;->wk()F

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    :goto_1
    float-to-int v0, v0

    .line 76
    invoke-virtual {p0, v0}, Lcom/bytedance/adsdk/oa/cz;->yo(I)V

    .line 77
    .line 78
    .line 79
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->lw:Lcom/bytedance/adsdk/oa/ivm/yo;

    .line 80
    .line 81
    invoke-virtual {v0}, Lcom/bytedance/adsdk/oa/ivm/yo;->wrv()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-nez v0, :cond_5

    .line 89
    .line 90
    sget-object v0, Lcom/bytedance/adsdk/oa/cz$oa;->uef:Lcom/bytedance/adsdk/oa/cz$oa;

    .line 91
    .line 92
    iput-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->cz:Lcom/bytedance/adsdk/oa/cz$oa;

    .line 93
    .line 94
    :cond_5
    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 2

    .line 1
    const-string v0, "Drawable#draw"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/bytedance/adsdk/oa/lw;->uef(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-boolean v1, p0, Lcom/bytedance/adsdk/oa/cz;->gr:Z

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lcom/bytedance/adsdk/oa/cz;->dhk:Lcom/bytedance/adsdk/oa/yo/yo/oa;

    .line 11
    .line 12
    invoke-direct {p0, p1, v1}, Lcom/bytedance/adsdk/oa/cz;->uef(Landroid/graphics/Canvas;Lcom/bytedance/adsdk/oa/yo/yo/oa;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-direct {p0, p1}, Lcom/bytedance/adsdk/oa/cz;->uef(Landroid/graphics/Canvas;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    :catchall_0
    :goto_0
    const/4 p1, 0x0

    .line 20
    iput-boolean p1, p0, Lcom/bytedance/adsdk/oa/cz;->rl:Z

    .line 21
    .line 22
    invoke-static {v0}, Lcom/bytedance/adsdk/oa/lw;->oa(Ljava/lang/String;)F

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public dz()F
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->lw:Lcom/bytedance/adsdk/oa/ivm/yo;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/adsdk/oa/ivm/yo;->wk()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getAlpha()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/adsdk/oa/cz;->tpx:I

    .line 2
    .line 3
    return v0
.end method

.method public getIntrinsicHeight()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->moa:Lcom/bytedance/adsdk/oa/xs;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, -0x1

    .line 6
    return v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Lcom/bytedance/adsdk/oa/xs;->moa()Landroid/graphics/Rect;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    return v0
.end method

.method public getIntrinsicWidth()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->moa:Lcom/bytedance/adsdk/oa/xs;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, -0x1

    .line 6
    return v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Lcom/bytedance/adsdk/oa/xs;->moa()Landroid/graphics/Rect;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    return v0
.end method

.method public getOpacity()I
    .locals 1

    const/4 v0, -0x3

    return v0
.end method

.method public gr()Lcom/bytedance/adsdk/oa/xs;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->moa:Lcom/bytedance/adsdk/oa/xs;

    .line 2
    .line 3
    return-object v0
.end method

.method public gsd()Lcom/bytedance/adsdk/oa/dhk;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->yo:Lcom/bytedance/adsdk/oa/dhk;

    .line 2
    .line 3
    return-object v0
.end method

.method public gzw()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->lw:Lcom/bytedance/adsdk/oa/ivm/yo;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/bytedance/adsdk/oa/ivm/yo;->isRunning()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0

    .line 14
    :cond_0
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->cz:Lcom/bytedance/adsdk/oa/cz$oa;

    .line 15
    .line 16
    sget-object v1, Lcom/bytedance/adsdk/oa/cz$oa;->oa:Lcom/bytedance/adsdk/oa/cz$oa;

    .line 17
    .line 18
    if-eq v0, v1, :cond_2

    .line 19
    .line 20
    sget-object v1, Lcom/bytedance/adsdk/oa/cz$oa;->yo:Lcom/bytedance/adsdk/oa/cz$oa;

    .line 21
    .line 22
    if-ne v0, v1, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 v0, 0x0

    .line 26
    return v0

    .line 27
    :cond_2
    :goto_0
    const/4 v0, 0x1

    .line 28
    return v0
.end method

.method public invalidateDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-interface {p1, p0}, Landroid/graphics/drawable/Drawable$Callback;->invalidateDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public invalidateSelf()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/adsdk/oa/cz;->rl:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lcom/bytedance/adsdk/oa/cz;->rl:Z

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-interface {v0, p0}, Landroid/graphics/drawable/Drawable$Callback;->invalidateDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 16
    .line 17
    .line 18
    :cond_1
    :goto_0
    return-void
.end method

.method public isRunning()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/bytedance/adsdk/oa/cz;->orq()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public ivm()Lcom/bytedance/adsdk/oa/oib;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/adsdk/oa/cz;->gr:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/bytedance/adsdk/oa/oib;->yo:Lcom/bytedance/adsdk/oa/oib;

    return-object v0

    :cond_0
    sget-object v0, Lcom/bytedance/adsdk/oa/oib;->oa:Lcom/bytedance/adsdk/oa/oib;

    return-object v0
.end method

.method public ivm(Ljava/lang/String;)Lcom/bytedance/adsdk/oa/zjm;
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->moa:Lcom/bytedance/adsdk/oa/xs;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 4
    :cond_0
    invoke-virtual {v0}, Lcom/bytedance/adsdk/oa/xs;->ab()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/bytedance/adsdk/oa/zjm;

    return-object p1
.end method

.method public ivm(Z)V
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/bytedance/adsdk/oa/cz;->bcc:Z

    return-void
.end method

.method public ku()Landroid/graphics/RectF;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->pu:Landroid/graphics/RectF;

    .line 2
    .line 3
    return-object v0
.end method

.method public lw(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 1

    .line 4
    invoke-direct {p0}, Lcom/bytedance/adsdk/oa/cz;->lz()Lcom/bytedance/adsdk/oa/oa/oa;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {v0, p1}, Lcom/bytedance/adsdk/oa/oa/oa;->uef(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public lw(I)V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->lw:Lcom/bytedance/adsdk/oa/ivm/yo;

    invoke-virtual {v0, p1}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    return-void
.end method

.method public lw(Z)V
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/bytedance/adsdk/oa/cz;->gsd:Z

    return-void
.end method

.method public lw()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/adsdk/oa/cz;->sy:Z

    return v0
.end method

.method public moa()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->cq:Ljava/lang/String;

    return-object v0
.end method

.method public moa(F)V
    .locals 3

    .line 19
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->moa:Lcom/bytedance/adsdk/oa/xs;

    if-nez v0, :cond_0

    .line 20
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->zjm:Ljava/util/ArrayList;

    new-instance v1, Lcom/bytedance/adsdk/oa/cz$5;

    invoke-direct {v1, p0, p1}, Lcom/bytedance/adsdk/oa/cz$5;-><init>(Lcom/bytedance/adsdk/oa/cz;F)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 21
    :cond_0
    const-string v0, "Drawable#setProgress"

    invoke-static {v0}, Lcom/bytedance/adsdk/oa/lw;->uef(Ljava/lang/String;)V

    .line 22
    iget-object v1, p0, Lcom/bytedance/adsdk/oa/cz;->lw:Lcom/bytedance/adsdk/oa/ivm/yo;

    iget-object v2, p0, Lcom/bytedance/adsdk/oa/cz;->moa:Lcom/bytedance/adsdk/oa/xs;

    invoke-virtual {v2, p1}, Lcom/bytedance/adsdk/oa/xs;->uef(F)F

    move-result p1

    invoke-virtual {v1, p1}, Lcom/bytedance/adsdk/oa/ivm/yo;->uef(F)V

    .line 23
    invoke-static {v0}, Lcom/bytedance/adsdk/oa/lw;->oa(Ljava/lang/String;)F

    return-void
.end method

.method public moa(I)V
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->lw:Lcom/bytedance/adsdk/oa/ivm/yo;

    invoke-virtual {v0, p1}, Lcom/bytedance/adsdk/oa/ivm/yo;->setRepeatMode(I)V

    return-void
.end method

.method public moa(Ljava/lang/String;)V
    .locals 3

    .line 6
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->moa:Lcom/bytedance/adsdk/oa/xs;

    if-nez v0, :cond_0

    .line 7
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->zjm:Ljava/util/ArrayList;

    new-instance v1, Lcom/bytedance/adsdk/oa/cz$2;

    invoke-direct {v1, p0, p1}, Lcom/bytedance/adsdk/oa/cz$2;-><init>(Lcom/bytedance/adsdk/oa/cz;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 8
    :cond_0
    invoke-virtual {v0, p1}, Lcom/bytedance/adsdk/oa/xs;->yo(Ljava/lang/String;)Lcom/bytedance/adsdk/oa/yo/ivm;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 9
    iget p1, v0, Lcom/bytedance/adsdk/oa/yo/ivm;->uef:F

    float-to-int p1, p1

    .line 10
    iget v0, v0, Lcom/bytedance/adsdk/oa/yo/ivm;->oa:F

    float-to-int v0, v0

    add-int/2addr v0, p1

    invoke-virtual {p0, p1, v0}, Lcom/bytedance/adsdk/oa/cz;->uef(II)V

    return-void

    .line 11
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot find marker with name "

    const-string v2, "."

    .line 12
    invoke-static {v1, p1, v2}, LA7/p0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 13
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public moa(Z)V
    .locals 1

    .line 2
    iget-boolean v0, p0, Lcom/bytedance/adsdk/oa/cz;->gzw:Z

    if-ne v0, p1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iput-boolean p1, p0, Lcom/bytedance/adsdk/oa/cz;->gzw:Z

    .line 4
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->dhk:Lcom/bytedance/adsdk/oa/yo/yo/oa;

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {v0, p1}, Lcom/bytedance/adsdk/oa/yo/yo/oa;->uef(Z)V

    :cond_1
    :goto_0
    return-void
.end method

.method public oa()Lcom/bytedance/adsdk/oa/yo/yo/oa;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->dhk:Lcom/bytedance/adsdk/oa/yo/yo/oa;

    return-object v0
.end method

.method public oa(F)V
    .locals 3

    .line 7
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->moa:Lcom/bytedance/adsdk/oa/xs;

    if-nez v0, :cond_0

    .line 8
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->zjm:Ljava/util/ArrayList;

    new-instance v1, Lcom/bytedance/adsdk/oa/cz$11;

    invoke-direct {v1, p0, p1}, Lcom/bytedance/adsdk/oa/cz$11;-><init>(Lcom/bytedance/adsdk/oa/cz;F)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 9
    :cond_0
    iget-object v1, p0, Lcom/bytedance/adsdk/oa/cz;->lw:Lcom/bytedance/adsdk/oa/ivm/yo;

    invoke-virtual {v0}, Lcom/bytedance/adsdk/oa/xs;->ivm()F

    move-result v0

    iget-object v2, p0, Lcom/bytedance/adsdk/oa/cz;->moa:Lcom/bytedance/adsdk/oa/xs;

    invoke-virtual {v2}, Lcom/bytedance/adsdk/oa/xs;->xs()F

    move-result v2

    invoke-static {v0, v2, p1}, Lcom/bytedance/adsdk/oa/ivm/lw;->uef(FFF)F

    move-result p1

    invoke-virtual {v1, p1}, Lcom/bytedance/adsdk/oa/ivm/yo;->oa(F)V

    return-void
.end method

.method public oa(I)V
    .locals 2

    .line 4
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->moa:Lcom/bytedance/adsdk/oa/xs;

    if-nez v0, :cond_0

    .line 5
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->zjm:Ljava/util/ArrayList;

    new-instance v1, Lcom/bytedance/adsdk/oa/cz$10;

    invoke-direct {v1, p0, p1}, Lcom/bytedance/adsdk/oa/cz$10;-><init>(Lcom/bytedance/adsdk/oa/cz;I)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->lw:Lcom/bytedance/adsdk/oa/ivm/yo;

    int-to-float p1, p1

    const v1, 0x3f7d70a4    # 0.99f

    add-float/2addr p1, v1

    invoke-virtual {v0, p1}, Lcom/bytedance/adsdk/oa/ivm/yo;->oa(F)V

    return-void
.end method

.method public oa(Landroid/animation/Animator$AnimatorListener;)V
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->lw:Lcom/bytedance/adsdk/oa/ivm/yo;

    invoke-virtual {v0, p1}, Lcom/bytedance/adsdk/oa/ivm/uef;->removeListener(Landroid/animation/Animator$AnimatorListener;)V

    return-void
.end method

.method public oa(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->lw:Lcom/bytedance/adsdk/oa/ivm/yo;

    invoke-virtual {v0, p1}, Lcom/bytedance/adsdk/oa/ivm/uef;->removeUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    return-void
.end method

.method public oa(Ljava/lang/String;)V
    .locals 3

    .line 10
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->moa:Lcom/bytedance/adsdk/oa/xs;

    if-nez v0, :cond_0

    .line 11
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->zjm:Ljava/util/ArrayList;

    new-instance v1, Lcom/bytedance/adsdk/oa/cz$12;

    invoke-direct {v1, p0, p1}, Lcom/bytedance/adsdk/oa/cz$12;-><init>(Lcom/bytedance/adsdk/oa/cz;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 12
    :cond_0
    invoke-virtual {v0, p1}, Lcom/bytedance/adsdk/oa/xs;->yo(Ljava/lang/String;)Lcom/bytedance/adsdk/oa/yo/ivm;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 13
    iget p1, v0, Lcom/bytedance/adsdk/oa/yo/ivm;->uef:F

    float-to-int p1, p1

    invoke-virtual {p0, p1}, Lcom/bytedance/adsdk/oa/cz;->uef(I)V

    return-void

    .line 14
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot find marker with name "

    const-string v2, "."

    .line 15
    invoke-static {v1, p1, v2}, LA7/p0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 16
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public oa(Z)V
    .locals 0

    .line 3
    iput-boolean p1, p0, Lcom/bytedance/adsdk/oa/cz;->sy:Z

    return-void
.end method

.method public oib()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->lw:Lcom/bytedance/adsdk/oa/ivm/yo;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/adsdk/oa/ivm/yo;->xs()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    float-to-int v0, v0

    .line 8
    return v0
.end method

.method public orq()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->lw:Lcom/bytedance/adsdk/oa/ivm/yo;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Lcom/bytedance/adsdk/oa/ivm/yo;->isRunning()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public pz()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->zjm:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->lw:Lcom/bytedance/adsdk/oa/ivm/yo;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/bytedance/adsdk/oa/ivm/yo;->cq()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    sget-object v0, Lcom/bytedance/adsdk/oa/cz$oa;->uef:Lcom/bytedance/adsdk/oa/cz$oa;

    .line 18
    .line 19
    iput-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->cz:Lcom/bytedance/adsdk/oa/cz$oa;

    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public rt()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->ab:Ljava/util/Map;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->yo:Lcom/bytedance/adsdk/oa/dhk;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->moa:Lcom/bytedance/adsdk/oa/xs;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/bytedance/adsdk/oa/xs;->dz()Landroid/util/SparseArray;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-lez v0, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    return v0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    return v0
.end method

.method public scheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-interface {p1, p0, p2, p3, p4}, Landroid/graphics/drawable/Drawable$Callback;->scheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setAlpha(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/bytedance/adsdk/oa/cz;->tpx:I

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/bytedance/adsdk/oa/cz;->invalidateSelf()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    return-void
.end method

.method public setVisible(ZZ)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-super {p0, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    iget-object p1, p0, Lcom/bytedance/adsdk/oa/cz;->cz:Lcom/bytedance/adsdk/oa/cz$oa;

    .line 12
    .line 13
    sget-object v0, Lcom/bytedance/adsdk/oa/cz$oa;->oa:Lcom/bytedance/adsdk/oa/cz$oa;

    .line 14
    .line 15
    if-ne p1, v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/bytedance/adsdk/oa/cz;->dj()V

    .line 18
    .line 19
    .line 20
    return p2

    .line 21
    :cond_0
    sget-object v0, Lcom/bytedance/adsdk/oa/cz$oa;->yo:Lcom/bytedance/adsdk/oa/cz$oa;

    .line 22
    .line 23
    if-ne p1, v0, :cond_3

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/bytedance/adsdk/oa/cz;->cq()V

    .line 26
    .line 27
    .line 28
    return p2

    .line 29
    :cond_1
    iget-object p1, p0, Lcom/bytedance/adsdk/oa/cz;->lw:Lcom/bytedance/adsdk/oa/ivm/yo;

    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/bytedance/adsdk/oa/ivm/yo;->isRunning()Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_2

    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/bytedance/adsdk/oa/cz;->pz()V

    .line 38
    .line 39
    .line 40
    sget-object p1, Lcom/bytedance/adsdk/oa/cz$oa;->yo:Lcom/bytedance/adsdk/oa/cz$oa;

    .line 41
    .line 42
    iput-object p1, p0, Lcom/bytedance/adsdk/oa/cz;->cz:Lcom/bytedance/adsdk/oa/cz$oa;

    .line 43
    .line 44
    return p2

    .line 45
    :cond_2
    if-eqz v0, :cond_3

    .line 46
    .line 47
    sget-object p1, Lcom/bytedance/adsdk/oa/cz$oa;->uef:Lcom/bytedance/adsdk/oa/cz$oa;

    .line 48
    .line 49
    iput-object p1, p0, Lcom/bytedance/adsdk/oa/cz;->cz:Lcom/bytedance/adsdk/oa/cz$oa;

    .line 50
    .line 51
    :cond_3
    return p2
.end method

.method public start()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Landroid/view/View;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Landroid/view/View;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/View;->isInEditMode()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-virtual {p0}, Lcom/bytedance/adsdk/oa/cz;->dj()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public stop()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/bytedance/adsdk/oa/cz;->wrv()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public sy()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->lw:Lcom/bytedance/adsdk/oa/ivm/yo;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/adsdk/oa/ivm/uef;->removeAllListeners()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public tpx()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->lw:Lcom/bytedance/adsdk/oa/ivm/yo;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->getRepeatCount()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public ue()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->zjm:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->lw:Lcom/bytedance/adsdk/oa/ivm/yo;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/bytedance/adsdk/oa/ivm/yo;->cancel()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    sget-object v0, Lcom/bytedance/adsdk/oa/cz$oa;->uef:Lcom/bytedance/adsdk/oa/cz$oa;

    .line 18
    .line 19
    iput-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->cz:Lcom/bytedance/adsdk/oa/cz$oa;

    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public uef(Ljava/lang/String;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 1

    .line 63
    invoke-direct {p0}, Lcom/bytedance/adsdk/oa/cz;->lz()Lcom/bytedance/adsdk/oa/oa/oa;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 64
    :cond_0
    invoke-virtual {v0, p1, p2}, Lcom/bytedance/adsdk/oa/oa/oa;->uef(Ljava/lang/String;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 65
    invoke-virtual {p0}, Lcom/bytedance/adsdk/oa/cz;->invalidateSelf()V

    return-object p1
.end method

.method public uef(Lcom/bytedance/adsdk/oa/yo/yo;)Landroid/graphics/Typeface;
    .locals 3

    .line 66
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->ab:Ljava/util/Map;

    if-eqz v0, :cond_2

    .line 67
    invoke-virtual {p1}, Lcom/bytedance/adsdk/oa/yo/yo;->uef()Ljava/lang/String;

    move-result-object v1

    .line 68
    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 69
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Typeface;

    return-object p1

    .line 70
    :cond_0
    invoke-virtual {p1}, Lcom/bytedance/adsdk/oa/yo/yo;->oa()Ljava/lang/String;

    move-result-object v1

    .line 71
    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 72
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Typeface;

    return-object p1

    .line 73
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/bytedance/adsdk/oa/yo/yo;->uef()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/bytedance/adsdk/oa/yo/yo;->yo()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 74
    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 75
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Typeface;

    return-object p1

    .line 76
    :cond_2
    invoke-direct {p0}, Lcom/bytedance/adsdk/oa/cz;->oyt()Lcom/bytedance/adsdk/oa/oa/uef;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 77
    invoke-virtual {v0, p1}, Lcom/bytedance/adsdk/oa/oa/uef;->uef(Lcom/bytedance/adsdk/oa/yo/yo;)Landroid/graphics/Typeface;

    move-result-object p1

    return-object p1

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method

.method public uef()Landroid/view/View;
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->sk:Landroid/view/View;

    return-object v0
.end method

.method public uef(F)V
    .locals 2

    .line 44
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->moa:Lcom/bytedance/adsdk/oa/xs;

    if-nez v0, :cond_0

    .line 45
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->zjm:Ljava/util/ArrayList;

    new-instance v1, Lcom/bytedance/adsdk/oa/cz$9;

    invoke-direct {v1, p0, p1}, Lcom/bytedance/adsdk/oa/cz$9;-><init>(Lcom/bytedance/adsdk/oa/cz;F)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 46
    :cond_0
    invoke-virtual {v0}, Lcom/bytedance/adsdk/oa/xs;->ivm()F

    move-result v0

    iget-object v1, p0, Lcom/bytedance/adsdk/oa/cz;->moa:Lcom/bytedance/adsdk/oa/xs;

    invoke-virtual {v1}, Lcom/bytedance/adsdk/oa/xs;->xs()F

    move-result v1

    invoke-static {v0, v1, p1}, Lcom/bytedance/adsdk/oa/ivm/lw;->uef(FFF)F

    move-result p1

    float-to-int p1, p1

    invoke-virtual {p0, p1}, Lcom/bytedance/adsdk/oa/cz;->uef(I)V

    return-void
.end method

.method public uef(I)V
    .locals 2

    .line 41
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->moa:Lcom/bytedance/adsdk/oa/xs;

    if-nez v0, :cond_0

    .line 42
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->zjm:Ljava/util/ArrayList;

    new-instance v1, Lcom/bytedance/adsdk/oa/cz$8;

    invoke-direct {v1, p0, p1}, Lcom/bytedance/adsdk/oa/cz$8;-><init>(Lcom/bytedance/adsdk/oa/cz;I)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 43
    :cond_0
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->lw:Lcom/bytedance/adsdk/oa/ivm/yo;

    invoke-virtual {v0, p1}, Lcom/bytedance/adsdk/oa/ivm/yo;->uef(I)V

    return-void
.end method

.method public uef(II)V
    .locals 2

    .line 47
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->moa:Lcom/bytedance/adsdk/oa/xs;

    if-nez v0, :cond_0

    .line 48
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->zjm:Ljava/util/ArrayList;

    new-instance v1, Lcom/bytedance/adsdk/oa/cz$3;

    invoke-direct {v1, p0, p1, p2}, Lcom/bytedance/adsdk/oa/cz$3;-><init>(Lcom/bytedance/adsdk/oa/cz;II)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 49
    :cond_0
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->lw:Lcom/bytedance/adsdk/oa/ivm/yo;

    int-to-float p1, p1

    int-to-float p2, p2

    const v1, 0x3f7d70a4    # 0.99f

    add-float/2addr p2, v1

    invoke-virtual {v0, p1, p2}, Lcom/bytedance/adsdk/oa/ivm/yo;->uef(FF)V

    return-void
.end method

.method public uef(Landroid/animation/Animator$AnimatorListener;)V
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->lw:Lcom/bytedance/adsdk/oa/ivm/yo;

    invoke-virtual {v0, p1}, Lcom/bytedance/adsdk/oa/ivm/uef;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    return-void
.end method

.method public uef(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->lw:Lcom/bytedance/adsdk/oa/ivm/yo;

    invoke-virtual {v0, p1}, Lcom/bytedance/adsdk/oa/ivm/uef;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    return-void
.end method

.method public uef(Landroid/view/View;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/bytedance/adsdk/oa/cz;->sk:Landroid/view/View;

    return-void
.end method

.method public uef(Lcom/bytedance/adsdk/oa/dhk;)V
    .locals 0

    .line 62
    iput-object p1, p0, Lcom/bytedance/adsdk/oa/cz;->yo:Lcom/bytedance/adsdk/oa/dhk;

    return-void
.end method

.method public uef(Lcom/bytedance/adsdk/oa/moa;)V
    .locals 1

    .line 53
    iput-object p1, p0, Lcom/bytedance/adsdk/oa/cz;->dz:Lcom/bytedance/adsdk/oa/moa;

    .line 54
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->wrv:Lcom/bytedance/adsdk/oa/oa/oa;

    if-eqz v0, :cond_0

    .line 55
    invoke-virtual {v0, p1}, Lcom/bytedance/adsdk/oa/oa/oa;->uef(Lcom/bytedance/adsdk/oa/moa;)V

    :cond_0
    return-void
.end method

.method public uef(Lcom/bytedance/adsdk/oa/oib;)V
    .locals 0

    .line 33
    iput-object p1, p0, Lcom/bytedance/adsdk/oa/cz;->rt:Lcom/bytedance/adsdk/oa/oib;

    .line 34
    invoke-direct {p0}, Lcom/bytedance/adsdk/oa/cz;->fz()V

    return-void
.end method

.method public uef(Lcom/bytedance/adsdk/oa/yo;)V
    .locals 1

    .line 56
    iput-object p1, p0, Lcom/bytedance/adsdk/oa/cz;->oa:Lcom/bytedance/adsdk/oa/yo;

    .line 57
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->wk:Lcom/bytedance/adsdk/oa/oa/uef;

    if-eqz v0, :cond_0

    .line 58
    invoke-virtual {v0, p1}, Lcom/bytedance/adsdk/oa/oa/uef;->uef(Lcom/bytedance/adsdk/oa/yo;)V

    :cond_0
    return-void
.end method

.method public uef(Ljava/lang/Boolean;)V
    .locals 0

    .line 52
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, p0, Lcom/bytedance/adsdk/oa/cz;->ivm:Z

    return-void
.end method

.method public uef(Ljava/lang/String;)V
    .locals 0

    .line 13
    iput-object p1, p0, Lcom/bytedance/adsdk/oa/cz;->cq:Ljava/lang/String;

    return-void
.end method

.method public uef(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroid/graphics/Typeface;",
            ">;)V"
        }
    .end annotation

    .line 59
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->ab:Ljava/util/Map;

    if-ne p1, v0, :cond_0

    return-void

    .line 60
    :cond_0
    iput-object p1, p0, Lcom/bytedance/adsdk/oa/cz;->ab:Ljava/util/Map;

    .line 61
    invoke-virtual {p0}, Lcom/bytedance/adsdk/oa/cz;->invalidateSelf()V

    return-void
.end method

.method public uef(Z)V
    .locals 1

    .line 8
    iget-boolean v0, p0, Lcom/bytedance/adsdk/oa/cz;->oib:Z

    if-eq p1, v0, :cond_1

    .line 9
    iput-boolean p1, p0, Lcom/bytedance/adsdk/oa/cz;->oib:Z

    .line 10
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->dhk:Lcom/bytedance/adsdk/oa/yo/yo/oa;

    if-eqz v0, :cond_0

    .line 11
    invoke-virtual {v0, p1}, Lcom/bytedance/adsdk/oa/yo/yo/oa;->oa(Z)V

    .line 12
    :cond_0
    invoke-virtual {p0}, Lcom/bytedance/adsdk/oa/cz;->invalidateSelf()V

    :cond_1
    return-void
.end method

.method public uef(ZLandroid/content/Context;)V
    .locals 1

    .line 4
    iget-boolean v0, p0, Lcom/bytedance/adsdk/oa/cz;->bs:Z

    if-ne v0, p1, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    iput-boolean p1, p0, Lcom/bytedance/adsdk/oa/cz;->bs:Z

    .line 6
    iget-object p1, p0, Lcom/bytedance/adsdk/oa/cz;->moa:Lcom/bytedance/adsdk/oa/xs;

    if-eqz p1, :cond_1

    .line 7
    invoke-direct {p0, p2}, Lcom/bytedance/adsdk/oa/cz;->uef(Landroid/content/Context;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public uef(Lcom/bytedance/adsdk/oa/xs;Landroid/content/Context;)Z
    .locals 2

    .line 14
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->moa:Lcom/bytedance/adsdk/oa/xs;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 v0, 0x1

    .line 15
    iput-boolean v0, p0, Lcom/bytedance/adsdk/oa/cz;->rl:Z

    .line 16
    invoke-virtual {p0}, Lcom/bytedance/adsdk/oa/cz;->zjm()V

    .line 17
    iput-object p1, p0, Lcom/bytedance/adsdk/oa/cz;->moa:Lcom/bytedance/adsdk/oa/xs;

    .line 18
    invoke-direct {p0, p2}, Lcom/bytedance/adsdk/oa/cz;->uef(Landroid/content/Context;)V

    .line 19
    iget-object p2, p0, Lcom/bytedance/adsdk/oa/cz;->lw:Lcom/bytedance/adsdk/oa/ivm/yo;

    invoke-virtual {p2, p1}, Lcom/bytedance/adsdk/oa/ivm/yo;->uef(Lcom/bytedance/adsdk/oa/xs;)V

    .line 20
    iget-object p2, p0, Lcom/bytedance/adsdk/oa/cz;->lw:Lcom/bytedance/adsdk/oa/ivm/yo;

    invoke-virtual {p2}, Lcom/bytedance/adsdk/oa/ivm/yo;->getAnimatedFraction()F

    move-result p2

    invoke-virtual {p0, p2}, Lcom/bytedance/adsdk/oa/cz;->moa(F)V

    .line 21
    new-instance p2, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/bytedance/adsdk/oa/cz;->zjm:Ljava/util/ArrayList;

    invoke-direct {p2, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    .line 22
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 23
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bytedance/adsdk/oa/cz$uef;

    if-eqz v1, :cond_1

    .line 24
    invoke-interface {v1, p1}, Lcom/bytedance/adsdk/oa/cz$uef;->uef(Lcom/bytedance/adsdk/oa/xs;)V

    .line 25
    :cond_1
    invoke-interface {p2}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 26
    :cond_2
    iget-object p2, p0, Lcom/bytedance/adsdk/oa/cz;->zjm:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->clear()V

    .line 27
    iget-boolean p2, p0, Lcom/bytedance/adsdk/oa/cz;->orq:Z

    invoke-virtual {p1, p2}, Lcom/bytedance/adsdk/oa/xs;->oa(Z)V

    .line 28
    invoke-direct {p0}, Lcom/bytedance/adsdk/oa/cz;->fz()V

    .line 29
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object p1

    .line 30
    instance-of p2, p1, Landroid/widget/ImageView;

    if-eqz p2, :cond_3

    .line 31
    check-cast p1, Landroid/widget/ImageView;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 32
    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_3
    return v0
.end method

.method public unscheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-interface {p1, p0, p2}, Landroid/graphics/drawable/Drawable$Callback;->unscheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public wk()F
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->lw:Lcom/bytedance/adsdk/oa/ivm/yo;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/adsdk/oa/ivm/yo;->ab()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public wrv()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->zjm:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->lw:Lcom/bytedance/adsdk/oa/ivm/yo;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/bytedance/adsdk/oa/ivm/yo;->wrv()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    sget-object v0, Lcom/bytedance/adsdk/oa/cz$oa;->uef:Lcom/bytedance/adsdk/oa/cz$oa;

    .line 18
    .line 19
    iput-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->cz:Lcom/bytedance/adsdk/oa/cz$oa;

    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public xs(Ljava/lang/String;)V
    .locals 1

    .line 3
    iput-object p1, p0, Lcom/bytedance/adsdk/oa/cz;->uef:Ljava/lang/String;

    .line 4
    invoke-direct {p0}, Lcom/bytedance/adsdk/oa/cz;->oyt()Lcom/bytedance/adsdk/oa/oa/uef;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {v0, p1}, Lcom/bytedance/adsdk/oa/oa/uef;->uef(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public xs(Z)V
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/bytedance/adsdk/oa/cz;->xs:Z

    return-void
.end method

.method public xs()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/adsdk/oa/cz;->gr:Z

    return v0
.end method

.method public yo(F)V
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->lw:Lcom/bytedance/adsdk/oa/ivm/yo;

    invoke-virtual {v0, p1}, Lcom/bytedance/adsdk/oa/ivm/yo;->yo(F)V

    return-void
.end method

.method public yo(I)V
    .locals 2

    .line 18
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->moa:Lcom/bytedance/adsdk/oa/xs;

    if-nez v0, :cond_0

    .line 19
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->zjm:Ljava/util/ArrayList;

    new-instance v1, Lcom/bytedance/adsdk/oa/cz$4;

    invoke-direct {v1, p0, p1}, Lcom/bytedance/adsdk/oa/cz$4;-><init>(Lcom/bytedance/adsdk/oa/cz;I)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 20
    :cond_0
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->lw:Lcom/bytedance/adsdk/oa/ivm/yo;

    int-to-float p1, p1

    invoke-virtual {v0, p1}, Lcom/bytedance/adsdk/oa/ivm/yo;->uef(F)V

    return-void
.end method

.method public yo(Ljava/lang/String;)V
    .locals 3

    .line 5
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->moa:Lcom/bytedance/adsdk/oa/xs;

    if-nez v0, :cond_0

    .line 6
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->zjm:Ljava/util/ArrayList;

    new-instance v1, Lcom/bytedance/adsdk/oa/cz$13;

    invoke-direct {v1, p0, p1}, Lcom/bytedance/adsdk/oa/cz$13;-><init>(Lcom/bytedance/adsdk/oa/cz;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 7
    :cond_0
    invoke-virtual {v0, p1}, Lcom/bytedance/adsdk/oa/xs;->yo(Ljava/lang/String;)Lcom/bytedance/adsdk/oa/yo/ivm;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 8
    iget p1, v0, Lcom/bytedance/adsdk/oa/yo/ivm;->uef:F

    iget v0, v0, Lcom/bytedance/adsdk/oa/yo/ivm;->oa:F

    add-float/2addr p1, v0

    float-to-int p1, p1

    invoke-virtual {p0, p1}, Lcom/bytedance/adsdk/oa/cz;->oa(I)V

    return-void

    .line 9
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot find marker with name "

    const-string v2, "."

    .line 10
    invoke-static {v1, p1, v2}, LA7/p0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 11
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public yo(Z)V
    .locals 1

    .line 2
    iput-boolean p1, p0, Lcom/bytedance/adsdk/oa/cz;->orq:Z

    .line 3
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->moa:Lcom/bytedance/adsdk/oa/xs;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0, p1}, Lcom/bytedance/adsdk/oa/xs;->oa(Z)V

    :cond_0
    return-void
.end method

.method public yo()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/adsdk/oa/cz;->oib:Z

    return v0
.end method

.method public zjm()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->lw:Lcom/bytedance/adsdk/oa/ivm/yo;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/adsdk/oa/ivm/yo;->isRunning()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->lw:Lcom/bytedance/adsdk/oa/ivm/yo;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/bytedance/adsdk/oa/ivm/yo;->cancel()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    sget-object v0, Lcom/bytedance/adsdk/oa/cz$oa;->uef:Lcom/bytedance/adsdk/oa/cz$oa;

    .line 21
    .line 22
    iput-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->cz:Lcom/bytedance/adsdk/oa/cz$oa;

    .line 23
    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    iput-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->moa:Lcom/bytedance/adsdk/oa/xs;

    .line 26
    .line 27
    iput-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->dhk:Lcom/bytedance/adsdk/oa/yo/yo/oa;

    .line 28
    .line 29
    iput-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->wrv:Lcom/bytedance/adsdk/oa/oa/oa;

    .line 30
    .line 31
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/cz;->lw:Lcom/bytedance/adsdk/oa/ivm/yo;

    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/bytedance/adsdk/oa/ivm/yo;->bcc()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/bytedance/adsdk/oa/cz;->invalidateSelf()V

    .line 37
    .line 38
    .line 39
    return-void
.end method
