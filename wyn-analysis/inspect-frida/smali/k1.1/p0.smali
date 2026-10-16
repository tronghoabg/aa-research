.class public Lk1/p0;
.super Lk1/o0;
.source "SourceFile"


# instance fields
.field public o:Lb1/c;

.field public p:Lb1/c;

.field public q:Lb1/c;


# direct methods
.method public constructor <init>(Lk1/v0;Landroid/view/WindowInsets;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lk1/o0;-><init>(Lk1/v0;Landroid/view/WindowInsets;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Lk1/p0;->o:Lb1/c;

    .line 6
    .line 7
    iput-object p1, p0, Lk1/p0;->p:Lb1/c;

    .line 8
    .line 9
    iput-object p1, p0, Lk1/p0;->q:Lb1/c;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public h()Lb1/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lk1/p0;->p:Lb1/c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lk1/m0;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-static {v0}, Lio/flutter/plugin/platform/o;->t(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lb1/c;->c(Landroid/graphics/Insets;)Lb1/c;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lk1/p0;->p:Lb1/c;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lk1/p0;->p:Lb1/c;

    .line 18
    .line 19
    return-object v0
.end method

.method public j()Lb1/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lk1/p0;->o:Lb1/c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lk1/m0;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-static {v0}, Lio/flutter/plugin/platform/o;->x(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lb1/c;->c(Landroid/graphics/Insets;)Lb1/c;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lk1/p0;->o:Lb1/c;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lk1/p0;->o:Lb1/c;

    .line 18
    .line 19
    return-object v0
.end method

.method public l()Lb1/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lk1/p0;->q:Lb1/c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lk1/m0;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-static {v0}, Lio/flutter/plugin/platform/o;->d(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lb1/c;->c(Landroid/graphics/Insets;)Lb1/c;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lk1/p0;->q:Lb1/c;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lk1/p0;->q:Lb1/c;

    .line 18
    .line 19
    return-object v0
.end method

.method public m(IIII)Lk1/v0;
    .locals 1

    .line 1
    iget-object v0, p0, Lk1/m0;->c:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-static {v0, p1, p2, p3, p4}, Lio/flutter/plugin/platform/o;->k(Landroid/view/WindowInsets;IIII)Landroid/view/WindowInsets;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 p2, 0x0

    .line 8
    invoke-static {p2, p1}, Lk1/v0;->g(Landroid/view/View;Landroid/view/WindowInsets;)Lk1/v0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public s(Lb1/c;)V
    .locals 0

    .line 1
    return-void
.end method
