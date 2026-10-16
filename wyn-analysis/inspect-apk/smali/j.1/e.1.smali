.class public Lj/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lj/b;

.field public final b:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-static {p1, v0}, Lj/f;->e(Landroid/content/Context;I)I

    move-result v0

    invoke-direct {p0, p1, v0}, Lj/e;-><init>(Landroid/content/Context;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Lj/b;

    new-instance v1, Landroid/view/ContextThemeWrapper;

    .line 4
    invoke-static {p1, p2}, Lj/f;->e(Landroid/content/Context;I)I

    move-result v2

    invoke-direct {v1, p1, v2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    invoke-direct {v0, v1}, Lj/b;-><init>(Landroid/view/ContextThemeWrapper;)V

    iput-object v0, p0, Lj/e;->a:Lj/b;

    .line 5
    iput p2, p0, Lj/e;->b:I

    return-void
.end method


# virtual methods
.method public create()Lj/f;
    .locals 11

    .line 1
    new-instance v0, Lj/f;

    .line 2
    .line 3
    iget-object v1, p0, Lj/e;->a:Lj/b;

    .line 4
    .line 5
    iget-object v2, v1, Lj/b;->a:Landroid/view/ContextThemeWrapper;

    .line 6
    .line 7
    iget v3, p0, Lj/e;->b:I

    .line 8
    .line 9
    invoke-direct {v0, v2, v3}, Lj/f;-><init>(Landroid/view/ContextThemeWrapper;I)V

    .line 10
    .line 11
    .line 12
    iget-object v2, v1, Lj/b;->e:Landroid/view/View;

    .line 13
    .line 14
    iget-object v3, v0, Lj/f;->f:Lj/d;

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    iput-object v2, v3, Lj/d;->v:Landroid/view/View;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object v2, v1, Lj/b;->d:Ljava/lang/CharSequence;

    .line 23
    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    iput-object v2, v3, Lj/d;->d:Ljava/lang/CharSequence;

    .line 27
    .line 28
    iget-object v5, v3, Lj/d;->t:Landroid/widget/TextView;

    .line 29
    .line 30
    if-eqz v5, :cond_1

    .line 31
    .line 32
    invoke-virtual {v5, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    iget-object v2, v1, Lj/b;->c:Landroid/graphics/drawable/Drawable;

    .line 36
    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    iput-object v2, v3, Lj/d;->r:Landroid/graphics/drawable/Drawable;

    .line 40
    .line 41
    iget-object v5, v3, Lj/d;->s:Landroid/widget/ImageView;

    .line 42
    .line 43
    if-eqz v5, :cond_2

    .line 44
    .line 45
    invoke-virtual {v5, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 46
    .line 47
    .line 48
    iget-object v5, v3, Lj/d;->s:Landroid/widget/ImageView;

    .line 49
    .line 50
    invoke-virtual {v5, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 51
    .line 52
    .line 53
    :cond_2
    :goto_0
    iget-object v2, v1, Lj/b;->f:Ljava/lang/CharSequence;

    .line 54
    .line 55
    if-nez v2, :cond_3

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    iget-object v5, v1, Lj/b;->g:Landroid/content/DialogInterface$OnClickListener;

    .line 59
    .line 60
    const/4 v6, -0x1

    .line 61
    invoke-virtual {v3, v6, v2, v5}, Lj/d;->c(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 62
    .line 63
    .line 64
    :goto_1
    iget-object v2, v1, Lj/b;->h:Ljava/lang/CharSequence;

    .line 65
    .line 66
    if-nez v2, :cond_4

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_4
    iget-object v5, v1, Lj/b;->i:Landroid/content/DialogInterface$OnClickListener;

    .line 70
    .line 71
    const/4 v6, -0x2

    .line 72
    invoke-virtual {v3, v6, v2, v5}, Lj/d;->c(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 73
    .line 74
    .line 75
    :goto_2
    iget-object v2, v1, Lj/b;->k:Ljava/lang/Object;

    .line 76
    .line 77
    const/4 v5, 0x1

    .line 78
    const/4 v6, 0x0

    .line 79
    if-eqz v2, :cond_9

    .line 80
    .line 81
    iget v2, v3, Lj/d;->z:I

    .line 82
    .line 83
    iget-object v7, v1, Lj/b;->b:Landroid/view/LayoutInflater;

    .line 84
    .line 85
    invoke-virtual {v7, v2, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    check-cast v2, Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 90
    .line 91
    iget-boolean v7, v1, Lj/b;->n:Z

    .line 92
    .line 93
    if-eqz v7, :cond_5

    .line 94
    .line 95
    iget v7, v3, Lj/d;->A:I

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_5
    iget v7, v3, Lj/d;->B:I

    .line 99
    .line 100
    :goto_3
    iget-object v8, v1, Lj/b;->k:Ljava/lang/Object;

    .line 101
    .line 102
    if-eqz v8, :cond_6

    .line 103
    .line 104
    goto :goto_4

    .line 105
    :cond_6
    new-instance v8, Lj/c;

    .line 106
    .line 107
    iget-object v9, v1, Lj/b;->a:Landroid/view/ContextThemeWrapper;

    .line 108
    .line 109
    const v10, 0x1020014

    .line 110
    .line 111
    .line 112
    invoke-direct {v8, v9, v7, v10, v6}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;II[Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    :goto_4
    iput-object v8, v3, Lj/d;->w:Landroid/widget/ListAdapter;

    .line 116
    .line 117
    iget v7, v1, Lj/b;->o:I

    .line 118
    .line 119
    iput v7, v3, Lj/d;->x:I

    .line 120
    .line 121
    iget-object v7, v1, Lj/b;->l:Landroid/content/DialogInterface$OnClickListener;

    .line 122
    .line 123
    if-eqz v7, :cond_7

    .line 124
    .line 125
    new-instance v7, Lj/a;

    .line 126
    .line 127
    invoke-direct {v7, v1, v3}, Lj/a;-><init>(Lj/b;Lj/d;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2, v7}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 131
    .line 132
    .line 133
    :cond_7
    iget-boolean v7, v1, Lj/b;->n:Z

    .line 134
    .line 135
    if-eqz v7, :cond_8

    .line 136
    .line 137
    invoke-virtual {v2, v5}, Landroid/widget/AbsListView;->setChoiceMode(I)V

    .line 138
    .line 139
    .line 140
    :cond_8
    iput-object v2, v3, Lj/d;->e:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 141
    .line 142
    :cond_9
    iget-object v2, v1, Lj/b;->m:Landroid/view/View;

    .line 143
    .line 144
    if-eqz v2, :cond_a

    .line 145
    .line 146
    iput-object v2, v3, Lj/d;->f:Landroid/view/View;

    .line 147
    .line 148
    iput-boolean v4, v3, Lj/d;->g:Z

    .line 149
    .line 150
    :cond_a
    invoke-virtual {v0, v5}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0, v5}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0, v6}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0, v6}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 160
    .line 161
    .line 162
    iget-object v1, v1, Lj/b;->j:Lp/l;

    .line 163
    .line 164
    if-eqz v1, :cond_b

    .line 165
    .line 166
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 167
    .line 168
    .line 169
    :cond_b
    return-object v0
.end method

.method public getContext()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Lj/e;->a:Lj/b;

    .line 2
    .line 3
    iget-object v0, v0, Lj/b;->a:Landroid/view/ContextThemeWrapper;

    .line 4
    .line 5
    return-object v0
.end method

.method public setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Lj/e;
    .locals 2

    .line 1
    iget-object v0, p0, Lj/e;->a:Lj/b;

    .line 2
    .line 3
    iget-object v1, v0, Lj/b;->a:Landroid/view/ContextThemeWrapper;

    .line 4
    .line 5
    invoke-virtual {v1, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, v0, Lj/b;->h:Ljava/lang/CharSequence;

    .line 10
    .line 11
    iput-object p2, v0, Lj/b;->i:Landroid/content/DialogInterface$OnClickListener;

    .line 12
    .line 13
    return-object p0
.end method

.method public setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Lj/e;
    .locals 2

    .line 1
    iget-object v0, p0, Lj/e;->a:Lj/b;

    .line 2
    .line 3
    iget-object v1, v0, Lj/b;->a:Landroid/view/ContextThemeWrapper;

    .line 4
    .line 5
    invoke-virtual {v1, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, v0, Lj/b;->f:Ljava/lang/CharSequence;

    .line 10
    .line 11
    iput-object p2, v0, Lj/b;->g:Landroid/content/DialogInterface$OnClickListener;

    .line 12
    .line 13
    return-object p0
.end method

.method public setTitle(Ljava/lang/CharSequence;)Lj/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lj/e;->a:Lj/b;

    .line 2
    .line 3
    iput-object p1, v0, Lj/b;->d:Ljava/lang/CharSequence;

    .line 4
    .line 5
    return-object p0
.end method

.method public setView(Landroid/view/View;)Lj/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lj/e;->a:Lj/b;

    .line 2
    .line 3
    iput-object p1, v0, Lj/b;->m:Landroid/view/View;

    .line 4
    .line 5
    return-object p0
.end method
