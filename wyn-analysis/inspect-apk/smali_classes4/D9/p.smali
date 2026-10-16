.class public final LD9/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:F

.field public final synthetic b:F

.field public final synthetic c:F

.field public final synthetic d:F

.field public final synthetic e:LD9/s;


# direct methods
.method public constructor <init>(LD9/s;FFFF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LD9/p;->e:LD9/s;

    .line 5
    .line 6
    iput p2, p0, LD9/p;->a:F

    .line 7
    .line 8
    iput p3, p0, LD9/p;->b:F

    .line 9
    .line 10
    iput p4, p0, LD9/p;->c:F

    .line 11
    .line 12
    iput p5, p0, LD9/p;->d:F

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, LD9/p;->b:F

    .line 6
    .line 7
    mul-float/2addr v0, v1

    .line 8
    iget v1, p0, LD9/p;->a:F

    .line 9
    .line 10
    add-float/2addr v0, v1

    .line 11
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    iget v1, p0, LD9/p;->d:F

    .line 16
    .line 17
    mul-float/2addr p1, v1

    .line 18
    iget v1, p0, LD9/p;->c:F

    .line 19
    .line 20
    add-float/2addr p1, v1

    .line 21
    iget-object v1, p0, LD9/p;->e:LD9/s;

    .line 22
    .line 23
    invoke-virtual {v1, v0}, LD9/s;->c(F)V

    .line 24
    .line 25
    .line 26
    iget-object v0, v1, LD9/s;->e:Landroid/view/View;

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 29
    .line 30
    .line 31
    return-void
.end method
