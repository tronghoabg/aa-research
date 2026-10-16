.class public final LM7/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LM7/a;->a:I

    iput-object p1, p0, LM7/a;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 1
    iget p2, p0, LM7/a;->a:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LM7/a;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Landroidx/appcompat/widget/SearchView;

    .line 9
    .line 10
    iget-object p2, p1, Landroidx/appcompat/widget/SearchView;->x:Landroid/view/View;

    .line 11
    .line 12
    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    .line 13
    .line 14
    .line 15
    move-result p3

    .line 16
    const/4 p4, 0x1

    .line 17
    if-le p3, p4, :cond_2

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object p3

    .line 23
    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 24
    .line 25
    .line 26
    move-result-object p3

    .line 27
    iget-object p4, p1, Landroidx/appcompat/widget/SearchView;->r:Landroid/view/View;

    .line 28
    .line 29
    invoke-virtual {p4}, Landroid/view/View;->getPaddingLeft()I

    .line 30
    .line 31
    .line 32
    move-result p4

    .line 33
    new-instance p5, Landroid/graphics/Rect;

    .line 34
    .line 35
    invoke-direct {p5}, Landroid/graphics/Rect;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-static {p1}, Lq/v1;->a(Landroid/view/View;)Z

    .line 39
    .line 40
    .line 41
    move-result p6

    .line 42
    iget-boolean p7, p1, Landroidx/appcompat/widget/SearchView;->M:Z

    .line 43
    .line 44
    if-eqz p7, :cond_0

    .line 45
    .line 46
    const p7, 0x7f070029

    .line 47
    .line 48
    .line 49
    invoke-virtual {p3, p7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 50
    .line 51
    .line 52
    move-result p7

    .line 53
    const p8, 0x7f07002a

    .line 54
    .line 55
    .line 56
    invoke-virtual {p3, p8}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 57
    .line 58
    .line 59
    move-result p3

    .line 60
    add-int/2addr p3, p7

    .line 61
    goto :goto_0

    .line 62
    :cond_0
    const/4 p3, 0x0

    .line 63
    :goto_0
    iget-object p1, p1, Landroidx/appcompat/widget/SearchView;->p:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 64
    .line 65
    invoke-virtual {p1}, Landroid/widget/AutoCompleteTextView;->getDropDownBackground()Landroid/graphics/drawable/Drawable;

    .line 66
    .line 67
    .line 68
    move-result-object p7

    .line 69
    invoke-virtual {p7, p5}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 70
    .line 71
    .line 72
    if-eqz p6, :cond_1

    .line 73
    .line 74
    iget p6, p5, Landroid/graphics/Rect;->left:I

    .line 75
    .line 76
    neg-int p6, p6

    .line 77
    goto :goto_1

    .line 78
    :cond_1
    iget p6, p5, Landroid/graphics/Rect;->left:I

    .line 79
    .line 80
    add-int/2addr p6, p3

    .line 81
    sub-int p6, p4, p6

    .line 82
    .line 83
    :goto_1
    invoke-virtual {p1, p6}, Landroid/widget/AutoCompleteTextView;->setDropDownHorizontalOffset(I)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    .line 87
    .line 88
    .line 89
    move-result p2

    .line 90
    iget p6, p5, Landroid/graphics/Rect;->left:I

    .line 91
    .line 92
    add-int/2addr p2, p6

    .line 93
    iget p5, p5, Landroid/graphics/Rect;->right:I

    .line 94
    .line 95
    add-int/2addr p2, p5

    .line 96
    add-int/2addr p2, p3

    .line 97
    sub-int/2addr p2, p4

    .line 98
    invoke-virtual {p1, p2}, Landroid/widget/AutoCompleteTextView;->setDropDownWidth(I)V

    .line 99
    .line 100
    .line 101
    :cond_2
    return-void

    .line 102
    :pswitch_0
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    iget-object p2, p0, LM7/a;->b:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast p2, Lad/c;

    .line 109
    .line 110
    iget p3, p2, Lad/c;->i:I

    .line 111
    .line 112
    if-eq p1, p3, :cond_3

    .line 113
    .line 114
    iget-object p3, p2, Lad/n;->b:LG9/e;

    .line 115
    .line 116
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    new-instance p4, Ljava/util/HashMap;

    .line 120
    .line 121
    invoke-direct {p4}, Ljava/util/HashMap;-><init>()V

    .line 122
    .line 123
    .line 124
    iget p5, p2, Lad/i;->a:I

    .line 125
    .line 126
    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 127
    .line 128
    .line 129
    move-result-object p5

    .line 130
    const-string p6, "adId"

    .line 131
    .line 132
    invoke-virtual {p4, p6, p5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    const-string p5, "eventName"

    .line 136
    .line 137
    const-string p6, "onFluidAdHeightChanged"

    .line 138
    .line 139
    invoke-virtual {p4, p5, p6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 143
    .line 144
    .line 145
    move-result-object p5

    .line 146
    const-string p6, "height"

    .line 147
    .line 148
    invoke-virtual {p4, p6, p5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    invoke-virtual {p3, p4}, LG9/e;->w(Ljava/util/HashMap;)V

    .line 152
    .line 153
    .line 154
    :cond_3
    iput p1, p2, Lad/c;->i:I

    .line 155
    .line 156
    return-void

    .line 157
    :pswitch_1
    const/4 p1, 0x0

    .line 158
    throw p1

    .line 159
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
