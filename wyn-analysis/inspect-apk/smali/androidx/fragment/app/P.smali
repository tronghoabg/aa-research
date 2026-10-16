.class public final Landroidx/fragment/app/P;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final synthetic a:Landroidx/fragment/app/l0;

.field public final synthetic b:Landroidx/fragment/app/Q;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/Q;Landroidx/fragment/app/l0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/fragment/app/P;->b:Landroidx/fragment/app/Q;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/fragment/app/P;->a:Landroidx/fragment/app/l0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Landroidx/fragment/app/P;->a:Landroidx/fragment/app/l0;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/fragment/app/l0;->k()V

    .line 4
    .line 5
    .line 6
    iget-object p1, p1, Landroidx/fragment/app/l0;->c:Landroidx/fragment/app/F;

    .line 7
    .line 8
    iget-object p1, p1, Landroidx/fragment/app/F;->mView:Landroid/view/View;

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Landroid/view/ViewGroup;

    .line 15
    .line 16
    iget-object v0, p0, Landroidx/fragment/app/P;->b:Landroidx/fragment/app/Q;

    .line 17
    .line 18
    iget-object v0, v0, Landroidx/fragment/app/Q;->a:Landroidx/fragment/app/e0;

    .line 19
    .line 20
    invoke-static {p1, v0}, Landroidx/fragment/app/o;->j(Landroid/view/ViewGroup;Landroidx/fragment/app/e0;)Landroidx/fragment/app/o;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1}, Landroidx/fragment/app/o;->i()V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    return-void
.end method
