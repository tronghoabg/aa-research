.class public Lk1/i0;
.super Lk1/l0;
.source "SourceFile"


# instance fields
.field public final c:Landroid/view/WindowInsets$Builder;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lk1/l0;-><init>()V

    .line 2
    invoke-static {}, Lio/flutter/plugin/platform/o;->h()Landroid/view/WindowInsets$Builder;

    move-result-object v0

    iput-object v0, p0, Lk1/i0;->c:Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public constructor <init>(Lk1/v0;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lk1/l0;-><init>(Lk1/v0;)V

    .line 4
    invoke-virtual {p1}, Lk1/v0;->f()Landroid/view/WindowInsets;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 5
    invoke-static {p1}, Lio/flutter/plugin/platform/o;->i(Landroid/view/WindowInsets;)Landroid/view/WindowInsets$Builder;

    move-result-object p1

    goto :goto_0

    .line 6
    :cond_0
    invoke-static {}, Lio/flutter/plugin/platform/o;->h()Landroid/view/WindowInsets$Builder;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lk1/i0;->c:Landroid/view/WindowInsets$Builder;

    return-void
.end method


# virtual methods
.method public b()Lk1/v0;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lk1/l0;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lk1/i0;->c:Landroid/view/WindowInsets$Builder;

    .line 5
    .line 6
    invoke-static {v0}, Lio/flutter/plugin/platform/o;->j(Landroid/view/WindowInsets$Builder;)Landroid/view/WindowInsets;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-static {v1, v0}, Lk1/v0;->g(Landroid/view/View;Landroid/view/WindowInsets;)Lk1/v0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Lk1/l0;->b:[Lb1/c;

    .line 16
    .line 17
    iget-object v2, v0, Lk1/v0;->a:Lk1/s0;

    .line 18
    .line 19
    invoke-virtual {v2, v1}, Lk1/s0;->q([Lb1/c;)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method public d(Lb1/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk1/i0;->c:Landroid/view/WindowInsets$Builder;

    .line 2
    .line 3
    invoke-virtual {p1}, Lb1/c;->d()Landroid/graphics/Insets;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {v0, p1}, Lio/flutter/plugin/platform/o;->C(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public e(Lb1/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk1/i0;->c:Landroid/view/WindowInsets$Builder;

    .line 2
    .line 3
    invoke-virtual {p1}, Lb1/c;->d()Landroid/graphics/Insets;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {v0, p1}, Lio/flutter/plugin/platform/o;->w(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public f(Lb1/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk1/i0;->c:Landroid/view/WindowInsets$Builder;

    .line 2
    .line 3
    invoke-virtual {p1}, Lb1/c;->d()Landroid/graphics/Insets;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {v0, p1}, Lio/flutter/plugin/platform/o;->A(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public g(Lb1/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk1/i0;->c:Landroid/view/WindowInsets$Builder;

    .line 2
    .line 3
    invoke-virtual {p1}, Lb1/c;->d()Landroid/graphics/Insets;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {v0, p1}, Lio/flutter/plugin/platform/o;->p(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public h(Lb1/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk1/i0;->c:Landroid/view/WindowInsets$Builder;

    .line 2
    .line 3
    invoke-virtual {p1}, Lb1/c;->d()Landroid/graphics/Insets;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {v0, p1}, Lio/flutter/plugin/platform/o;->D(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
