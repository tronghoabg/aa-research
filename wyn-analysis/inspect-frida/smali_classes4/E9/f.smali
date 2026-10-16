.class public final LE9/f;
.super LE9/c;
.source "SourceFile"


# instance fields
.field public d:Lcom/google/firebase/inappmessaging/display/internal/layout/FiamFrameLayout;

.field public e:Landroid/view/ViewGroup;

.field public f:Landroid/widget/ImageView;

.field public g:Landroid/widget/Button;


# virtual methods
.method public final g()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, LE9/f;->e:Landroid/view/ViewGroup;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i()Landroid/widget/ImageView;
    .locals 1

    .line 1
    iget-object v0, p0, LE9/f;->f:Landroid/widget/ImageView;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j()Landroid/view/ViewGroup;
    .locals 1

    .line 1
    iget-object v0, p0, LE9/f;->d:Lcom/google/firebase/inappmessaging/display/internal/layout/FiamFrameLayout;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k(Ljava/util/HashMap;LB9/a;)Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
    .locals 4

    .line 1
    iget-object v0, p0, LE9/c;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/LayoutInflater;

    .line 4
    .line 5
    const v1, 0x7f0d0044

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const v1, 0x7f0a015a

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lcom/google/firebase/inappmessaging/display/internal/layout/FiamFrameLayout;

    .line 21
    .line 22
    iput-object v1, p0, LE9/f;->d:Lcom/google/firebase/inappmessaging/display/internal/layout/FiamFrameLayout;

    .line 23
    .line 24
    const v1, 0x7f0a0159

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Landroid/view/ViewGroup;

    .line 32
    .line 33
    iput-object v1, p0, LE9/f;->e:Landroid/view/ViewGroup;

    .line 34
    .line 35
    const v1, 0x7f0a015b

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, Landroid/widget/ImageView;

    .line 43
    .line 44
    iput-object v1, p0, LE9/f;->f:Landroid/widget/ImageView;

    .line 45
    .line 46
    const v1, 0x7f0a00b1

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Landroid/widget/Button;

    .line 54
    .line 55
    iput-object v0, p0, LE9/f;->g:Landroid/widget/Button;

    .line 56
    .line 57
    iget-object v0, p0, LE9/f;->f:Landroid/widget/ImageView;

    .line 58
    .line 59
    iget-object v1, p0, LE9/c;->b:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v1, LD9/k;

    .line 62
    .line 63
    invoke-virtual {v1}, LD9/k;->a()I

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setMaxHeight(I)V

    .line 68
    .line 69
    .line 70
    iget-object v0, p0, LE9/f;->f:Landroid/widget/ImageView;

    .line 71
    .line 72
    invoke-virtual {v1}, LD9/k;->b()I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setMaxWidth(I)V

    .line 77
    .line 78
    .line 79
    iget-object v0, p0, LE9/c;->a:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v0, LN9/h;

    .line 82
    .line 83
    iget-object v1, v0, LN9/h;->a:Lcom/google/firebase/inappmessaging/model/MessageType;

    .line 84
    .line 85
    sget-object v3, Lcom/google/firebase/inappmessaging/model/MessageType;->IMAGE_ONLY:Lcom/google/firebase/inappmessaging/model/MessageType;

    .line 86
    .line 87
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-eqz v1, :cond_2

    .line 92
    .line 93
    check-cast v0, LN9/g;

    .line 94
    .line 95
    iget-object v1, p0, LE9/f;->f:Landroid/widget/ImageView;

    .line 96
    .line 97
    iget-object v3, v0, LN9/g;->c:LN9/f;

    .line 98
    .line 99
    if-eqz v3, :cond_1

    .line 100
    .line 101
    iget-object v3, v3, LN9/f;->a:Ljava/lang/String;

    .line 102
    .line 103
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    if-eqz v3, :cond_0

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_0
    const/4 v3, 0x0

    .line 111
    goto :goto_1

    .line 112
    :cond_1
    :goto_0
    const/16 v3, 0x8

    .line 113
    .line 114
    :goto_1
    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 115
    .line 116
    .line 117
    iget-object v1, p0, LE9/f;->f:Landroid/widget/ImageView;

    .line 118
    .line 119
    iget-object v0, v0, LN9/g;->d:LN9/a;

    .line 120
    .line 121
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    check-cast p1, Landroid/view/View$OnClickListener;

    .line 126
    .line 127
    invoke-virtual {v1, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 128
    .line 129
    .line 130
    :cond_2
    iget-object p1, p0, LE9/f;->d:Lcom/google/firebase/inappmessaging/display/internal/layout/FiamFrameLayout;

    .line 131
    .line 132
    invoke-virtual {p1, p2}, Lcom/google/firebase/inappmessaging/display/internal/layout/FiamFrameLayout;->setDismissListener(Landroid/view/View$OnClickListener;)V

    .line 133
    .line 134
    .line 135
    iget-object p1, p0, LE9/f;->g:Landroid/widget/Button;

    .line 136
    .line 137
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 138
    .line 139
    .line 140
    return-object v2
.end method
