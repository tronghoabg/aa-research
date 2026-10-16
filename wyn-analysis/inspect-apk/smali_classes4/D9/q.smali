.class public final LD9/q;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# instance fields
.field public final synthetic a:Landroid/view/ViewGroup$LayoutParams;

.field public final synthetic b:I

.field public final synthetic c:LD9/s;


# direct methods
.method public constructor <init>(LD9/s;Landroid/view/ViewGroup$LayoutParams;I)V
    .locals 0

    .line 1
    iput-object p1, p0, LD9/q;->c:LD9/s;

    .line 2
    .line 3
    iput-object p2, p0, LD9/q;->a:Landroid/view/ViewGroup$LayoutParams;

    .line 4
    .line 5
    iput p3, p0, LD9/q;->b:I

    .line 6
    .line 7
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 3

    .line 1
    iget-object p1, p0, LD9/q;->c:LD9/s;

    .line 2
    .line 3
    iget-object v0, p1, LD9/s;->f:LS3/l;

    .line 4
    .line 5
    iget-object v1, p1, LD9/s;->e:Landroid/view/View;

    .line 6
    .line 7
    iget-object v0, v0, LS3/l;->a:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, LE9/c;

    .line 10
    .line 11
    invoke-virtual {v0}, LE9/c;->h()Landroid/view/View$OnClickListener;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, LE9/c;->h()Landroid/view/View$OnClickListener;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0, v1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object v0, p1, LD9/s;->e:Landroid/view/View;

    .line 25
    .line 26
    const/high16 v1, 0x3f800000    # 1.0f

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p1, LD9/s;->e:Landroid/view/View;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationX(F)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, LD9/q;->a:Landroid/view/ViewGroup$LayoutParams;

    .line 38
    .line 39
    iget v1, p0, LD9/q;->b:I

    .line 40
    .line 41
    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 42
    .line 43
    iget-object p1, p1, LD9/s;->e:Landroid/view/View;

    .line 44
    .line 45
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method
