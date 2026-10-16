.class public final synthetic Lk1/W;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:La2/c;

.field public final synthetic b:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(La2/c;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk1/W;->a:La2/c;

    iput-object p2, p0, Lk1/W;->b:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lk1/W;->a:La2/c;

    .line 2
    .line 3
    iget-object p1, p1, La2/c;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, Lj/H;

    .line 6
    .line 7
    iget-object p1, p1, Lj/H;->i:Landroidx/appcompat/widget/ActionBarContainer;

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Landroid/view/View;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 16
    .line 17
    .line 18
    return-void
.end method
