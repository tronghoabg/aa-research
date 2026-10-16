.class public final Ls6/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE5/u0;
.implements Landroid/view/View$OnLayoutChangeListener;
.implements Landroid/view/View$OnClickListener;
.implements Ls6/s;
.implements Ls6/k;


# instance fields
.field public final a:LE5/H0;

.field public b:Ljava/lang/Object;

.field public final synthetic c:Ls6/C;


# direct methods
.method public constructor <init>(Ls6/C;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ls6/z;->c:Ls6/C;

    .line 5
    .line 6
    new-instance p1, LE5/H0;

    .line 7
    .line 8
    invoke-direct {p1}, LE5/H0;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Ls6/z;->a:LE5/H0;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final synthetic B()V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic E(LE5/d0;I)V
    .locals 0

    .line 1
    return-void
.end method

.method public final F(Lh6/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ls6/z;->c:Ls6/C;

    .line 2
    .line 3
    iget-object v0, v0, Ls6/C;->g:Lcom/google/android/exoplayer2/ui/SubtitleView;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p1, p1, Lh6/c;->a:Ll8/K;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/ui/SubtitleView;->setCues(Ljava/util/List;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final synthetic G(LE5/o;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic I(LE5/f0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic a(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public final b(I)V
    .locals 1

    .line 1
    iget-object p1, p0, Ls6/z;->c:Ls6/C;

    .line 2
    .line 3
    invoke-virtual {p1}, Ls6/C;->i()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ls6/C;->k()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ls6/C;->b()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-boolean v0, p1, Ls6/C;->w:Z

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object p1, p1, Ls6/C;->j:Ls6/t;

    .line 20
    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1}, Ls6/t;->f()V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void

    .line 27
    :cond_1
    const/4 v0, 0x0

    .line 28
    invoke-virtual {p1, v0}, Ls6/C;->c(Z)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final synthetic c(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic d(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic e(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic f(Ljava/util/List;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic g(II)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic h(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public final i(IZ)V
    .locals 0

    .line 1
    iget-object p1, p0, Ls6/z;->c:Ls6/C;

    .line 2
    .line 3
    invoke-virtual {p1}, Ls6/C;->i()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ls6/C;->b()Z

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    if-eqz p2, :cond_1

    .line 11
    .line 12
    iget-boolean p2, p1, Ls6/C;->w:Z

    .line 13
    .line 14
    if-eqz p2, :cond_1

    .line 15
    .line 16
    iget-object p1, p1, Ls6/C;->j:Ls6/t;

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    invoke-virtual {p1}, Ls6/t;->f()V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void

    .line 24
    :cond_1
    const/4 p2, 0x0

    .line 25
    invoke-virtual {p1, p2}, Ls6/C;->c(Z)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final synthetic j(F)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic k(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic l(IZ)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic m(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic n(LE5/t0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Ls6/z;->c:Ls6/C;

    .line 2
    .line 3
    invoke-virtual {p1}, Ls6/C;->g()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 1
    check-cast p1, Landroid/view/TextureView;

    .line 2
    .line 3
    iget-object p2, p0, Ls6/z;->c:Ls6/C;

    .line 4
    .line 5
    iget p2, p2, Ls6/C;->y:I

    .line 6
    .line 7
    invoke-static {p1, p2}, Ls6/C;->a(Landroid/view/TextureView;I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final p(LE5/v0;LE5/v0;I)V
    .locals 0

    .line 1
    iget-object p1, p0, Ls6/z;->c:Ls6/C;

    .line 2
    .line 3
    invoke-virtual {p1}, Ls6/C;->b()Z

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    iget-boolean p2, p1, Ls6/C;->w:Z

    .line 10
    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    iget-object p1, p1, Ls6/C;->j:Ls6/t;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Ls6/t;->f()V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final synthetic q(LE5/s0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic r(LE5/r0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic s(LE5/n;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic t(IZ)V
    .locals 0

    .line 1
    return-void
.end method

.method public final u(LE5/L0;)V
    .locals 7

    .line 1
    iget-object p1, p0, Ls6/z;->c:Ls6/C;

    .line 2
    .line 3
    iget-object v0, p1, Ls6/C;->m:LE5/w0;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    check-cast v0, LE5/I;

    .line 9
    .line 10
    invoke-virtual {v0}, LE5/I;->o0()LE5/J0;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, LE5/J0;->p()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x0

    .line 19
    const/4 v4, 0x0

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    iput-object v4, p0, Ls6/z;->b:Ljava/lang/Object;

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    invoke-virtual {v0}, LE5/I;->p0()LE5/L0;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    iget-object v2, v2, LE5/L0;->a:Ll8/K;

    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    iget-object v5, p0, Ls6/z;->a:LE5/H0;

    .line 36
    .line 37
    if-nez v2, :cond_2

    .line 38
    .line 39
    invoke-virtual {v0}, LE5/I;->Q0()V

    .line 40
    .line 41
    .line 42
    iget-object v2, v0, LE5/I;->j0:LE5/q0;

    .line 43
    .line 44
    iget-object v2, v2, LE5/q0;->a:LE5/J0;

    .line 45
    .line 46
    invoke-virtual {v2}, LE5/J0;->p()Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_1

    .line 51
    .line 52
    move v0, v3

    .line 53
    goto :goto_0

    .line 54
    :cond_1
    iget-object v0, v0, LE5/I;->j0:LE5/q0;

    .line 55
    .line 56
    iget-object v2, v0, LE5/q0;->a:LE5/J0;

    .line 57
    .line 58
    iget-object v0, v0, LE5/q0;->b:Lf6/z;

    .line 59
    .line 60
    iget-object v0, v0, Lf6/x;->a:Ljava/lang/Object;

    .line 61
    .line 62
    invoke-virtual {v2, v0}, LE5/J0;->b(Ljava/lang/Object;)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    :goto_0
    const/4 v2, 0x1

    .line 67
    invoke-virtual {v1, v0, v5, v2}, LE5/J0;->f(ILE5/H0;Z)LE5/H0;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iget-object v0, v0, LE5/H0;->b:Ljava/lang/Object;

    .line 72
    .line 73
    iput-object v0, p0, Ls6/z;->b:Ljava/lang/Object;

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_2
    iget-object v2, p0, Ls6/z;->b:Ljava/lang/Object;

    .line 77
    .line 78
    if-eqz v2, :cond_4

    .line 79
    .line 80
    invoke-virtual {v1, v2}, LE5/J0;->b(Ljava/lang/Object;)I

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    const/4 v6, -0x1

    .line 85
    if-eq v2, v6, :cond_3

    .line 86
    .line 87
    invoke-virtual {v1, v2, v5, v3}, LE5/J0;->f(ILE5/H0;Z)LE5/H0;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    iget v1, v1, LE5/H0;->c:I

    .line 92
    .line 93
    invoke-virtual {v0}, LE5/I;->l0()I

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-ne v0, v1, :cond_3

    .line 98
    .line 99
    return-void

    .line 100
    :cond_3
    iput-object v4, p0, Ls6/z;->b:Ljava/lang/Object;

    .line 101
    .line 102
    :cond_4
    :goto_1
    invoke-virtual {p1, v3}, Ls6/C;->l(Z)V

    .line 103
    .line 104
    .line 105
    return-void
.end method

.method public final synthetic v(Lr6/r;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final w()V
    .locals 2

    .line 1
    iget-object v0, p0, Ls6/z;->c:Ls6/C;

    .line 2
    .line 3
    iget-object v0, v0, Ls6/C;->c:Landroid/view/View;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x4

    .line 8
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final x(Lv6/o;)V
    .locals 0

    .line 1
    iget-object p1, p0, Ls6/z;->c:Ls6/C;

    .line 2
    .line 3
    invoke-virtual {p1}, Ls6/C;->h()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final synthetic y(LE5/o;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic z(LW5/c;)V
    .locals 0

    .line 1
    return-void
.end method
