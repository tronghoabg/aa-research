.class public final Lp/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp/x;
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public a:Landroid/content/Context;

.field public b:Landroid/view/LayoutInflater;

.field public c:Lp/k;

.field public d:Landroidx/appcompat/view/menu/ExpandedMenuView;

.field public e:Lp/w;

.field public f:Lp/f;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp/g;->a:Landroid/content/Context;

    .line 5
    .line 6
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lp/g;->b:Landroid/view/LayoutInflater;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final b(Landroid/content/Context;Lp/k;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lp/g;->a:Landroid/content/Context;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lp/g;->a:Landroid/content/Context;

    .line 6
    .line 7
    iget-object v0, p0, Lp/g;->b:Landroid/view/LayoutInflater;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Lp/g;->b:Landroid/view/LayoutInflater;

    .line 16
    .line 17
    :cond_0
    iput-object p2, p0, Lp/g;->c:Lp/k;

    .line 18
    .line 19
    iget-object p1, p0, Lp/g;->f:Lp/f;

    .line 20
    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    invoke-virtual {p1}, Lp/f;->notifyDataSetChanged()V

    .line 24
    .line 25
    .line 26
    :cond_1
    return-void
.end method

.method public final c(Lp/w;)V
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public final d()V
    .locals 1

    .line 1
    iget-object v0, p0, Lp/g;->f:Lp/f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lp/f;->notifyDataSetChanged()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final e(Lp/m;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public final f(Lp/m;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public final g()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final h(Lp/D;)Z
    .locals 5

    .line 1
    invoke-virtual {p1}, Lp/k;->hasVisibleItems()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :cond_0
    new-instance v0, Lp/l;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, Lp/l;->a:Lp/D;

    .line 15
    .line 16
    new-instance v1, Lj/e;

    .line 17
    .line 18
    iget-object v2, p1, Lp/k;->a:Landroid/content/Context;

    .line 19
    .line 20
    invoke-direct {v1, v2}, Lj/e;-><init>(Landroid/content/Context;)V

    .line 21
    .line 22
    .line 23
    new-instance v3, Lp/g;

    .line 24
    .line 25
    invoke-virtual {v1}, Lj/e;->getContext()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-direct {v3, v4}, Lp/g;-><init>(Landroid/content/Context;)V

    .line 30
    .line 31
    .line 32
    iput-object v3, v0, Lp/l;->c:Lp/g;

    .line 33
    .line 34
    iput-object v0, v3, Lp/g;->e:Lp/w;

    .line 35
    .line 36
    invoke-virtual {p1, v3, v2}, Lp/k;->b(Lp/x;Landroid/content/Context;)V

    .line 37
    .line 38
    .line 39
    iget-object v2, v0, Lp/l;->c:Lp/g;

    .line 40
    .line 41
    iget-object v3, v2, Lp/g;->f:Lp/f;

    .line 42
    .line 43
    if-nez v3, :cond_1

    .line 44
    .line 45
    new-instance v3, Lp/f;

    .line 46
    .line 47
    invoke-direct {v3, v2}, Lp/f;-><init>(Lp/g;)V

    .line 48
    .line 49
    .line 50
    iput-object v3, v2, Lp/g;->f:Lp/f;

    .line 51
    .line 52
    :cond_1
    iget-object v2, v2, Lp/g;->f:Lp/f;

    .line 53
    .line 54
    iget-object v3, v1, Lj/e;->a:Lj/b;

    .line 55
    .line 56
    iput-object v2, v3, Lj/b;->k:Ljava/lang/Object;

    .line 57
    .line 58
    iput-object v0, v3, Lj/b;->l:Landroid/content/DialogInterface$OnClickListener;

    .line 59
    .line 60
    iget-object v2, p1, Lp/k;->o:Landroid/view/View;

    .line 61
    .line 62
    if-eqz v2, :cond_2

    .line 63
    .line 64
    iput-object v2, v3, Lj/b;->e:Landroid/view/View;

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    iget-object v2, p1, Lp/k;->n:Landroid/graphics/drawable/Drawable;

    .line 68
    .line 69
    iput-object v2, v3, Lj/b;->c:Landroid/graphics/drawable/Drawable;

    .line 70
    .line 71
    iget-object v2, p1, Lp/k;->m:Ljava/lang/CharSequence;

    .line 72
    .line 73
    invoke-virtual {v1, v2}, Lj/e;->setTitle(Ljava/lang/CharSequence;)Lj/e;

    .line 74
    .line 75
    .line 76
    :goto_0
    iput-object v0, v3, Lj/b;->j:Lp/l;

    .line 77
    .line 78
    invoke-virtual {v1}, Lj/e;->create()Lj/f;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    iput-object v1, v0, Lp/l;->b:Lj/f;

    .line 83
    .line 84
    invoke-virtual {v1, v0}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 85
    .line 86
    .line 87
    iget-object v1, v0, Lp/l;->b:Lj/f;

    .line 88
    .line 89
    invoke-virtual {v1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-virtual {v1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    const/16 v2, 0x3eb

    .line 98
    .line 99
    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 100
    .line 101
    iget v2, v1, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 102
    .line 103
    const/high16 v3, 0x20000

    .line 104
    .line 105
    or-int/2addr v2, v3

    .line 106
    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 107
    .line 108
    iget-object v0, v0, Lp/l;->b:Lj/f;

    .line 109
    .line 110
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 111
    .line 112
    .line 113
    iget-object v0, p0, Lp/g;->e:Lp/w;

    .line 114
    .line 115
    if-eqz v0, :cond_3

    .line 116
    .line 117
    invoke-interface {v0, p1}, Lp/w;->F(Lp/k;)Z

    .line 118
    .line 119
    .line 120
    :cond_3
    const/4 p1, 0x1

    .line 121
    return p1
.end method

.method public final l(Lp/k;Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lp/g;->e:Lp/w;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1, p2}, Lp/w;->l(Lp/k;Z)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    .line 1
    iget-object p1, p0, Lp/g;->c:Lp/k;

    .line 2
    .line 3
    iget-object p2, p0, Lp/g;->f:Lp/f;

    .line 4
    .line 5
    invoke-virtual {p2, p3}, Lp/f;->b(I)Lp/m;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    const/4 p3, 0x0

    .line 10
    invoke-virtual {p1, p2, p0, p3}, Lp/k;->q(Landroid/view/MenuItem;Lp/x;I)Z

    .line 11
    .line 12
    .line 13
    return-void
.end method
