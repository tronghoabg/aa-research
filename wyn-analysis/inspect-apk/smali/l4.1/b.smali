.class public final Ll4/b;
.super Landroidx/recyclerview/widget/I;
.source "SourceFile"


# instance fields
.field public final i:Ll4/g;

.field public final j:I

.field public k:Ll4/g;


# direct methods
.method public constructor <init>(Ll4/g;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/I;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll4/b;->i:Ll4/g;

    .line 5
    .line 6
    iput p2, p0, Ll4/b;->j:I

    .line 7
    .line 8
    iget-object p1, p1, Ll4/g;->c:Ll4/e;

    .line 9
    .line 10
    iget-object p1, p1, Ll4/e;->f:Ll4/d;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final getItemCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Ll4/b;->i:Ll4/g;

    .line 2
    .line 3
    iget-object v0, v0, Ll4/g;->c:Ll4/e;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    return v0
.end method

.method public final onBindViewHolder(Landroidx/recyclerview/widget/m0;I)V
    .locals 13

    .line 1
    const v0, -0x101009e

    .line 2
    .line 3
    .line 4
    const v1, 0x10100a0

    .line 5
    .line 6
    .line 7
    const v2, -0x10100a0

    .line 8
    .line 9
    .line 10
    const v3, 0x101009e

    .line 11
    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    const/4 v5, 0x2

    .line 15
    const/4 v6, 0x1

    .line 16
    check-cast p1, Ll4/a;

    .line 17
    .line 18
    iget-object v7, p1, Landroidx/recyclerview/widget/m0;->itemView:Landroid/view/View;

    .line 19
    .line 20
    iget-object v7, p0, Ll4/b;->i:Ll4/g;

    .line 21
    .line 22
    iget-object v8, v7, Ll4/g;->c:Ll4/e;

    .line 23
    .line 24
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iget-object v8, v7, Ll4/g;->c:Ll4/e;

    .line 28
    .line 29
    iget v9, v8, Ll4/e;->B:I

    .line 30
    .line 31
    iget-object v9, p1, Landroidx/recyclerview/widget/m0;->itemView:Landroid/view/View;

    .line 32
    .line 33
    invoke-virtual {v9, v6}, Landroid/view/View;->setEnabled(Z)V

    .line 34
    .line 35
    .line 36
    iget v7, v7, Ll4/g;->p:I

    .line 37
    .line 38
    invoke-static {v7}, LA/f;->f(I)I

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    const/4 v9, 0x0

    .line 43
    iget-object p1, p1, Ll4/a;->c:Landroid/widget/CompoundButton;

    .line 44
    .line 45
    if-eq v7, v6, :cond_1

    .line 46
    .line 47
    if-eq v7, v5, :cond_0

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_0
    check-cast p1, Landroid/widget/CheckBox;

    .line 51
    .line 52
    throw v9

    .line 53
    :cond_1
    check-cast p1, Landroid/widget/RadioButton;

    .line 54
    .line 55
    iget v7, v8, Ll4/e;->u:I

    .line 56
    .line 57
    if-ne v7, p2, :cond_2

    .line 58
    .line 59
    move p2, v6

    .line 60
    goto :goto_0

    .line 61
    :cond_2
    move p2, v4

    .line 62
    :goto_0
    iget v7, v8, Ll4/e;->n:I

    .line 63
    .line 64
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 65
    .line 66
    .line 67
    move-result-object v8

    .line 68
    const v10, 0x1010036

    .line 69
    .line 70
    .line 71
    invoke-static {v8, v10, v4}, Lvf/a;->D(Landroid/content/Context;II)I

    .line 72
    .line 73
    .line 74
    move-result v8

    .line 75
    invoke-static {v8}, Lvf/a;->y(I)Z

    .line 76
    .line 77
    .line 78
    move-result v8

    .line 79
    if-eqz v8, :cond_3

    .line 80
    .line 81
    const/high16 v8, -0x1000000

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_3
    const/4 v8, -0x1

    .line 85
    :goto_1
    const v10, 0x3e99999a    # 0.3f

    .line 86
    .line 87
    .line 88
    invoke-static {v10, v8}, Lvf/a;->h(FI)I

    .line 89
    .line 90
    .line 91
    move-result v8

    .line 92
    new-instance v10, Landroid/content/res/ColorStateList;

    .line 93
    .line 94
    const/4 v11, 0x4

    .line 95
    new-array v11, v11, [[I

    .line 96
    .line 97
    filled-new-array {v3, v2}, [I

    .line 98
    .line 99
    .line 100
    move-result-object v12

    .line 101
    aput-object v12, v11, v4

    .line 102
    .line 103
    filled-new-array {v3, v1}, [I

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    aput-object v3, v11, v6

    .line 108
    .line 109
    filled-new-array {v0, v2}, [I

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    aput-object v2, v11, v5

    .line 114
    .line 115
    filled-new-array {v0, v1}, [I

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    const/4 v1, 0x3

    .line 120
    aput-object v0, v11, v1

    .line 121
    .line 122
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    const v1, 0x7f040109

    .line 127
    .line 128
    .line 129
    invoke-static {v0, v1, v4}, Lvf/a;->D(Landroid/content/Context;II)I

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    filled-new-array {v0, v7, v8, v8}, [I

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-direct {v10, v11, v0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p1, v10}, Landroid/widget/CompoundButton;->setButtonTintList(Landroid/content/res/ColorStateList;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p1, p2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p1, v6}, Landroid/view/View;->setEnabled(Z)V

    .line 147
    .line 148
    .line 149
    :goto_2
    throw v9
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/m0;
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    iget v0, p0, Ll4/b;->j:I

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-object p2, p0, Ll4/b;->i:Ll4/g;

    .line 17
    .line 18
    iget-object v0, p2, Ll4/g;->c:Ll4/e;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    iget-object v0, v0, Ll4/e;->a:Landroid/content/Context;

    .line 24
    .line 25
    const v1, 0x7f040347

    .line 26
    .line 27
    .line 28
    invoke-static {v0, v1}, Lvf/a;->E(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {p2}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-static {p2, v1}, Lvf/a;->E(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 44
    .line 45
    .line 46
    new-instance p2, Ll4/a;

    .line 47
    .line 48
    invoke-direct {p2, p1, p0}, Ll4/a;-><init>(Landroid/view/View;Ll4/b;)V

    .line 49
    .line 50
    .line 51
    return-object p2
.end method
