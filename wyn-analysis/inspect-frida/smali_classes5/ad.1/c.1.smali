.class public final Lad/c;
.super Lad/n;
.source "SourceFile"


# instance fields
.field public h:Landroid/widget/ScrollView;

.field public i:I


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lad/n;->g:Ly6/c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Lx6/j;->a()V

    .line 7
    .line 8
    .line 9
    iput-object v1, p0, Lad/n;->g:Ly6/c;

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lad/c;->h:Landroid/widget/ScrollView;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 16
    .line 17
    .line 18
    iput-object v1, p0, Lad/c;->h:Landroid/widget/ScrollView;

    .line 19
    .line 20
    :cond_1
    return-void
.end method

.method public final b()Lio/flutter/plugin/platform/e;
    .locals 3

    .line 1
    iget-object v0, p0, Lad/n;->g:Ly6/c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    iget-object v0, p0, Lad/c;->h:Landroid/widget/ScrollView;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    new-instance v1, Lad/N;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-direct {v1, v0, v2}, Lad/N;-><init>(Landroid/view/View;I)V

    .line 15
    .line 16
    .line 17
    return-object v1

    .line 18
    :cond_1
    iget-object v0, p0, Lad/n;->b:LG9/e;

    .line 19
    .line 20
    iget-object v2, v0, LG9/e;->b:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v2, Landroid/app/Activity;

    .line 23
    .line 24
    if-nez v2, :cond_2

    .line 25
    .line 26
    const-string v0, "FluidAdManagerBannerAd"

    .line 27
    .line 28
    const-string v2, "Tried to create container view before plugin is attached to an activity."

    .line 29
    .line 30
    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-object v2, v1

    .line 34
    goto :goto_0

    .line 35
    :cond_2
    new-instance v2, Landroid/widget/ScrollView;

    .line 36
    .line 37
    iget-object v0, v0, LG9/e;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, Landroid/app/Activity;

    .line 40
    .line 41
    invoke-direct {v2, v0}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    .line 42
    .line 43
    .line 44
    :goto_0
    if-nez v2, :cond_3

    .line 45
    .line 46
    :goto_1
    return-object v1

    .line 47
    :cond_3
    const/4 v0, 0x0

    .line 48
    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2, v0}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2, v0}, Landroid/view/View;->setHorizontalScrollBarEnabled(Z)V

    .line 55
    .line 56
    .line 57
    iput-object v2, p0, Lad/c;->h:Landroid/widget/ScrollView;

    .line 58
    .line 59
    iget-object v0, p0, Lad/n;->g:Ly6/c;

    .line 60
    .line 61
    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 62
    .line 63
    .line 64
    new-instance v0, Lad/N;

    .line 65
    .line 66
    iget-object v1, p0, Lad/n;->g:Ly6/c;

    .line 67
    .line 68
    const/4 v2, 0x0

    .line 69
    invoke-direct {v0, v1, v2}, Lad/N;-><init>(Landroid/view/View;I)V

    .line 70
    .line 71
    .line 72
    return-object v0
.end method

.method public final onAdLoaded()V
    .locals 3

    .line 1
    iget-object v0, p0, Lad/n;->g:Ly6/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, LM7/a;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v1, p0, v2}, LM7/a;-><init>(Ljava/lang/Object;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lad/n;->g:Ly6/c;

    .line 15
    .line 16
    invoke-virtual {v0}, Lx6/j;->getResponseInfo()Lx6/t;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object v1, p0, Lad/n;->b:LG9/e;

    .line 21
    .line 22
    iget v2, p0, Lad/i;->a:I

    .line 23
    .line 24
    invoke-virtual {v1, v2, v0}, LG9/e;->z(ILx6/t;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method
