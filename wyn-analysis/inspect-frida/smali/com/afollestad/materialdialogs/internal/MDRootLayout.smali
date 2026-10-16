.class public Lcom/afollestad/materialdialogs/internal/MDRootLayout;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# static fields
.field public static final synthetic t:I


# instance fields
.field public final a:[Lcom/afollestad/materialdialogs/internal/MDButton;

.field public b:I

.field public c:Landroid/view/View;

.field public d:Landroid/view/View;

.field public e:Z

.field public f:Z

.field public g:Ll4/i;

.field public h:Z

.field public i:Z

.field public final j:Z

.field public k:Z

.field public final l:I

.field public final m:I

.field public final n:I

.field public o:Ll4/d;

.field public final p:I

.field public final q:Landroid/graphics/Paint;

.field public r:Lm4/c;

.field public final s:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x3

    .line 5
    new-array v0, v0, [Lcom/afollestad/materialdialogs/internal/MDButton;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->a:[Lcom/afollestad/materialdialogs/internal/MDButton;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-boolean v0, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->e:Z

    .line 11
    .line 12
    iput-boolean v0, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->f:Z

    .line 13
    .line 14
    sget-object v1, Ll4/i;->b:Ll4/i;

    .line 15
    .line 16
    iput-object v1, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->g:Ll4/i;

    .line 17
    .line 18
    iput-boolean v0, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->h:Z

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    iput-boolean v1, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->i:Z

    .line 22
    .line 23
    sget-object v2, Ll4/d;->a:Ll4/d;

    .line 24
    .line 25
    iput-object v2, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->o:Ll4/d;

    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    sget-object v3, Ll4/h;->a:[I

    .line 32
    .line 33
    invoke-virtual {p1, p2, v3, v0, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    iput-boolean v1, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->j:Z

    .line 42
    .line 43
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 44
    .line 45
    .line 46
    const p2, 0x7f070290

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    iput p2, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->l:I

    .line 54
    .line 55
    const p2, 0x7f070273

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    iput p2, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->m:I

    .line 63
    .line 64
    const p2, 0x7f070278

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 68
    .line 69
    .line 70
    move-result p2

    .line 71
    iput p2, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->p:I

    .line 72
    .line 73
    const p2, 0x7f070274

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 77
    .line 78
    .line 79
    move-result p2

    .line 80
    iput p2, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->n:I

    .line 81
    .line 82
    new-instance p2, Landroid/graphics/Paint;

    .line 83
    .line 84
    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    .line 85
    .line 86
    .line 87
    iput-object p2, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->q:Landroid/graphics/Paint;

    .line 88
    .line 89
    const p2, 0x7f070286

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 93
    .line 94
    .line 95
    move-result p2

    .line 96
    iput p2, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->s:I

    .line 97
    .line 98
    iget-object p2, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->q:Landroid/graphics/Paint;

    .line 99
    .line 100
    const v1, 0x7f040340

    .line 101
    .line 102
    .line 103
    invoke-static {p1, v1, v0}, Lvf/a;->D(Landroid/content/Context;II)I

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0, v0}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 111
    .line 112
    .line 113
    return-void
.end method

.method public static a(Lcom/afollestad/materialdialogs/internal/MDRootLayout;Landroid/view/ViewGroup;ZZ)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz p2, :cond_1

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    if-lez p2, :cond_1

    .line 13
    .line 14
    iget-object p2, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->c:Landroid/view/View;

    .line 15
    .line 16
    if-eqz p2, :cond_0

    .line 17
    .line 18
    invoke-virtual {p2}, Landroid/view/View;->getVisibility()I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    const/16 v2, 0x8

    .line 23
    .line 24
    if-eq p2, v2, :cond_0

    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    add-int/2addr v2, p2

    .line 35
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    if-le v2, p2, :cond_0

    .line 44
    .line 45
    move p2, v0

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    move p2, v1

    .line 48
    :goto_0
    iput-boolean p2, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->e:Z

    .line 49
    .line 50
    :cond_1
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    if-lez p2, :cond_3

    .line 55
    .line 56
    if-eqz p3, :cond_2

    .line 57
    .line 58
    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 63
    .line 64
    .line 65
    move-result p3

    .line 66
    add-int/2addr p3, p2

    .line 67
    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    .line 68
    .line 69
    .line 70
    move-result p2

    .line 71
    sub-int/2addr p3, p2

    .line 72
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    sub-int/2addr p2, v0

    .line 77
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-ge p3, p1, :cond_2

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_2
    move v0, v1

    .line 89
    :goto_1
    iput-boolean v0, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->f:Z

    .line 90
    .line 91
    :cond_3
    return-void
.end method

.method public static c(Landroid/view/View;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/16 v3, 0x8

    .line 10
    .line 11
    if-eq v2, v3, :cond_0

    .line 12
    .line 13
    move v2, v1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v2, v0

    .line 16
    :goto_0
    if-eqz v2, :cond_2

    .line 17
    .line 18
    instance-of v3, p0, Lcom/afollestad/materialdialogs/internal/MDButton;

    .line 19
    .line 20
    if-eqz v3, :cond_2

    .line 21
    .line 22
    check-cast p0, Lcom/afollestad/materialdialogs/internal/MDButton;

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    if-lez p0, :cond_1

    .line 41
    .line 42
    return v1

    .line 43
    :cond_1
    return v0

    .line 44
    :cond_2
    return v2
.end method


# virtual methods
.method public final b(Landroid/view/ViewGroup;Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->r:Lm4/c;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    instance-of v0, p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Lm4/b;

    .line 10
    .line 11
    invoke-direct {v0, p0, p1, p2}, Lm4/b;-><init>(Lcom/afollestad/materialdialogs/internal/MDRootLayout;Landroid/view/ViewGroup;Z)V

    .line 12
    .line 13
    .line 14
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;)V

    .line 17
    .line 18
    .line 19
    const/4 p2, 0x0

    .line 20
    invoke-virtual {v0, p1, p2, p2}, Lm4/b;->onScrolled(Landroidx/recyclerview/widget/RecyclerView;II)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    new-instance v0, Lm4/c;

    .line 25
    .line 26
    invoke-direct {v0, p0, p1, p2}, Lm4/c;-><init>(Lcom/afollestad/materialdialogs/internal/MDRootLayout;Landroid/view/ViewGroup;Z)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->r:Lm4/c;

    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iget-object p2, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->r:Lm4/c;

    .line 36
    .line 37
    invoke-virtual {p1, p2}, Landroid/view/ViewTreeObserver;->addOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Lm4/c;->onScrollChanged()V

    .line 41
    .line 42
    .line 43
    :cond_1
    return-void
.end method

.method public final d(Landroid/view/View;Z)V
    .locals 6

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_9

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, Landroid/widget/ScrollView;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_4

    .line 9
    .line 10
    check-cast p1, Landroid/widget/ScrollView;

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    sub-int/2addr v2, v3

    .line 36
    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    sub-int/2addr v2, v3

    .line 41
    if-ge v2, v0, :cond_2

    .line 42
    .line 43
    invoke-virtual {p0, p1, p2}, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->b(Landroid/view/ViewGroup;Z)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_2
    :goto_0
    if-eqz p2, :cond_3

    .line 48
    .line 49
    iput-boolean v1, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->e:Z

    .line 50
    .line 51
    :cond_3
    iput-boolean v1, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->f:Z

    .line 52
    .line 53
    return-void

    .line 54
    :cond_4
    instance-of v0, p1, Landroid/widget/AdapterView;

    .line 55
    .line 56
    const/4 v2, 0x1

    .line 57
    if-eqz v0, :cond_c

    .line 58
    .line 59
    check-cast p1, Landroid/widget/AdapterView;

    .line 60
    .line 61
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getLastVisiblePosition()I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    const/4 v3, -0x1

    .line 66
    if-ne v0, v3, :cond_5

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_5
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-nez v0, :cond_6

    .line 74
    .line 75
    move v0, v2

    .line 76
    goto :goto_1

    .line 77
    :cond_6
    move v0, v1

    .line 78
    :goto_1
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getLastVisiblePosition()I

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getCount()I

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    sub-int/2addr v4, v2

    .line 87
    if-ne v3, v4, :cond_7

    .line 88
    .line 89
    move v3, v2

    .line 90
    goto :goto_2

    .line 91
    :cond_7
    move v3, v1

    .line 92
    :goto_2
    if-eqz v0, :cond_b

    .line 93
    .line 94
    if-eqz v3, :cond_b

    .line 95
    .line 96
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-lez v0, :cond_b

    .line 101
    .line 102
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    if-ge v0, v3, :cond_8

    .line 115
    .line 116
    goto :goto_4

    .line 117
    :cond_8
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    sub-int/2addr v0, v2

    .line 122
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    sub-int/2addr v2, v3

    .line 139
    if-le v0, v2, :cond_9

    .line 140
    .line 141
    goto :goto_4

    .line 142
    :cond_9
    :goto_3
    if-eqz p2, :cond_a

    .line 143
    .line 144
    iput-boolean v1, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->e:Z

    .line 145
    .line 146
    :cond_a
    iput-boolean v1, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->f:Z

    .line 147
    .line 148
    return-void

    .line 149
    :cond_b
    :goto_4
    invoke-virtual {p0, p1, p2}, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->b(Landroid/view/ViewGroup;Z)V

    .line 150
    .line 151
    .line 152
    return-void

    .line 153
    :cond_c
    instance-of v0, p1, Landroid/webkit/WebView;

    .line 154
    .line 155
    if-eqz v0, :cond_d

    .line 156
    .line 157
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    new-instance v1, Lm4/a;

    .line 162
    .line 163
    invoke-direct {v1, p0, p1, p2}, Lm4/a;-><init>(Lcom/afollestad/materialdialogs/internal/MDRootLayout;Landroid/view/View;Z)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 167
    .line 168
    .line 169
    return-void

    .line 170
    :cond_d
    instance-of v0, p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 171
    .line 172
    if-eqz v0, :cond_10

    .line 173
    .line 174
    move-object v0, p1

    .line 175
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 176
    .line 177
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/V;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    if-eqz v3, :cond_e

    .line 182
    .line 183
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/V;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    invoke-virtual {v0}, Landroidx/recyclerview/widget/V;->canScrollVertically()Z

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    if-eqz v0, :cond_e

    .line 192
    .line 193
    move v1, v2

    .line 194
    :cond_e
    if-eqz p2, :cond_f

    .line 195
    .line 196
    iput-boolean v1, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->e:Z

    .line 197
    .line 198
    :cond_f
    iput-boolean v1, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->f:Z

    .line 199
    .line 200
    if-eqz v1, :cond_17

    .line 201
    .line 202
    check-cast p1, Landroid/view/ViewGroup;

    .line 203
    .line 204
    invoke-virtual {p0, p1, p2}, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->b(Landroid/view/ViewGroup;Z)V

    .line 205
    .line 206
    .line 207
    return-void

    .line 208
    :cond_10
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 209
    .line 210
    if-eqz v0, :cond_17

    .line 211
    .line 212
    check-cast p1, Landroid/view/ViewGroup;

    .line 213
    .line 214
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    const/4 v3, 0x0

    .line 219
    if-nez v0, :cond_12

    .line 220
    .line 221
    :cond_11
    move-object v4, v3

    .line 222
    goto :goto_6

    .line 223
    :cond_12
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 224
    .line 225
    .line 226
    move-result v0

    .line 227
    sub-int/2addr v0, v2

    .line 228
    :goto_5
    if-ltz v0, :cond_11

    .line 229
    .line 230
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 231
    .line 232
    .line 233
    move-result-object v4

    .line 234
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    .line 235
    .line 236
    .line 237
    move-result v5

    .line 238
    if-nez v5, :cond_13

    .line 239
    .line 240
    invoke-virtual {v4}, Landroid/view/View;->getTop()I

    .line 241
    .line 242
    .line 243
    move-result v5

    .line 244
    if-nez v5, :cond_13

    .line 245
    .line 246
    goto :goto_6

    .line 247
    :cond_13
    add-int/lit8 v0, v0, -0x1

    .line 248
    .line 249
    goto :goto_5

    .line 250
    :goto_6
    invoke-virtual {p0, v4, p2}, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->d(Landroid/view/View;Z)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 254
    .line 255
    .line 256
    move-result p2

    .line 257
    if-nez p2, :cond_14

    .line 258
    .line 259
    goto :goto_8

    .line 260
    :cond_14
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 261
    .line 262
    .line 263
    move-result p2

    .line 264
    sub-int/2addr p2, v2

    .line 265
    :goto_7
    if-ltz p2, :cond_16

    .line 266
    .line 267
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 272
    .line 273
    .line 274
    move-result v2

    .line 275
    if-nez v2, :cond_15

    .line 276
    .line 277
    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    .line 278
    .line 279
    .line 280
    move-result v2

    .line 281
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    .line 282
    .line 283
    .line 284
    move-result v5

    .line 285
    if-ne v2, v5, :cond_15

    .line 286
    .line 287
    move-object v3, v0

    .line 288
    goto :goto_8

    .line 289
    :cond_15
    add-int/lit8 p2, p2, -0x1

    .line 290
    .line 291
    goto :goto_7

    .line 292
    :cond_16
    :goto_8
    if-eq v3, v4, :cond_17

    .line 293
    .line 294
    invoke-virtual {p0, v3, v1}, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->d(Landroid/view/View;Z)V

    .line 295
    .line 296
    .line 297
    :cond_17
    :goto_9
    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 14

    .line 1
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->d:Landroid/view/View;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-boolean v1, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->e:Z

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v1, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->s:I

    .line 17
    .line 18
    sub-int v1, v0, v1

    .line 19
    .line 20
    int-to-float v4, v1

    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    int-to-float v5, v1

    .line 26
    int-to-float v6, v0

    .line 27
    iget-object v7, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->q:Landroid/graphics/Paint;

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    move-object v2, p1

    .line 31
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move-object v2, p1

    .line 36
    :goto_0
    iget-boolean p1, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->f:Z

    .line 37
    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    iget-object p1, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->d:Landroid/view/View;

    .line 41
    .line 42
    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    int-to-float v10, p1

    .line 47
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    int-to-float v11, v0

    .line 52
    iget v0, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->s:I

    .line 53
    .line 54
    add-int/2addr p1, v0

    .line 55
    int-to-float v12, p1

    .line 56
    iget-object v13, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->q:Landroid/graphics/Paint;

    .line 57
    .line 58
    const/4 v9, 0x0

    .line 59
    move-object v8, v2

    .line 60
    invoke-virtual/range {v8 .. v13}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 61
    .line 62
    .line 63
    :cond_1
    return-void
.end method

.method public final onFinishInflate()V
    .locals 6

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->onFinishInflate()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    move v1, v0

    .line 6
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-ge v1, v2, :cond_4

    .line 11
    .line 12
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    const v4, 0x7f0a01b2

    .line 21
    .line 22
    .line 23
    if-ne v3, v4, :cond_0

    .line 24
    .line 25
    iput-object v2, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->c:Landroid/view/View;

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    const v4, 0x7f0a0193

    .line 33
    .line 34
    .line 35
    iget-object v5, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->a:[Lcom/afollestad/materialdialogs/internal/MDButton;

    .line 36
    .line 37
    if-ne v3, v4, :cond_1

    .line 38
    .line 39
    check-cast v2, Lcom/afollestad/materialdialogs/internal/MDButton;

    .line 40
    .line 41
    aput-object v2, v5, v0

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    const v4, 0x7f0a0192

    .line 49
    .line 50
    .line 51
    if-ne v3, v4, :cond_2

    .line 52
    .line 53
    check-cast v2, Lcom/afollestad/materialdialogs/internal/MDButton;

    .line 54
    .line 55
    const/4 v3, 0x1

    .line 56
    aput-object v2, v5, v3

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    const v4, 0x7f0a0194

    .line 64
    .line 65
    .line 66
    if-ne v3, v4, :cond_3

    .line 67
    .line 68
    const/4 v3, 0x2

    .line 69
    check-cast v2, Lcom/afollestad/materialdialogs/internal/MDButton;

    .line 70
    .line 71
    aput-object v2, v5, v3

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_3
    iput-object v2, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->d:Landroid/view/View;

    .line 75
    .line 76
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_4
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    move/from16 v3, p4

    .line 8
    .line 9
    iget-object v4, v0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->c:Landroid/view/View;

    .line 10
    .line 11
    invoke-static {v4}, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->c(Landroid/view/View;)Z

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    if-eqz v4, :cond_0

    .line 16
    .line 17
    iget-object v4, v0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->c:Landroid/view/View;

    .line 18
    .line 19
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    iget-object v5, v0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->c:Landroid/view/View;

    .line 24
    .line 25
    add-int/2addr v4, v2

    .line 26
    invoke-virtual {v5, v1, v2, v3, v4}, Landroid/view/View;->layout(IIII)V

    .line 27
    .line 28
    .line 29
    move v2, v4

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iget-boolean v4, v0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->k:Z

    .line 32
    .line 33
    if-nez v4, :cond_1

    .line 34
    .line 35
    iget-boolean v4, v0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->i:Z

    .line 36
    .line 37
    if-eqz v4, :cond_1

    .line 38
    .line 39
    iget v4, v0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->l:I

    .line 40
    .line 41
    add-int/2addr v2, v4

    .line 42
    :cond_1
    :goto_0
    iget-object v4, v0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->d:Landroid/view/View;

    .line 43
    .line 44
    invoke-static {v4}, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->c(Landroid/view/View;)Z

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-eqz v4, :cond_2

    .line 49
    .line 50
    iget-object v4, v0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->d:Landroid/view/View;

    .line 51
    .line 52
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    add-int/2addr v5, v2

    .line 57
    invoke-virtual {v4, v1, v2, v3, v5}, Landroid/view/View;->layout(IIII)V

    .line 58
    .line 59
    .line 60
    :cond_2
    iget-boolean v2, v0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->h:Z

    .line 61
    .line 62
    const/4 v4, 0x1

    .line 63
    iget-object v6, v0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->a:[Lcom/afollestad/materialdialogs/internal/MDButton;

    .line 64
    .line 65
    if-eqz v2, :cond_4

    .line 66
    .line 67
    iget v2, v0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->m:I

    .line 68
    .line 69
    sub-int v2, p5, v2

    .line 70
    .line 71
    array-length v7, v6

    .line 72
    const/4 v5, 0x0

    .line 73
    :goto_1
    if-ge v5, v7, :cond_10

    .line 74
    .line 75
    aget-object v8, v6, v5

    .line 76
    .line 77
    invoke-static {v8}, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->c(Landroid/view/View;)Z

    .line 78
    .line 79
    .line 80
    move-result v9

    .line 81
    if-eqz v9, :cond_3

    .line 82
    .line 83
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I

    .line 84
    .line 85
    .line 86
    move-result v9

    .line 87
    sub-int v9, v2, v9

    .line 88
    .line 89
    invoke-virtual {v8, v1, v9, v3, v2}, Landroid/view/View;->layout(IIII)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I

    .line 93
    .line 94
    .line 95
    move-result v8

    .line 96
    sub-int/2addr v2, v8

    .line 97
    :cond_3
    add-int/lit8 v5, v5, 0x1

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_4
    iget-boolean v2, v0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->i:Z

    .line 101
    .line 102
    if-eqz v2, :cond_5

    .line 103
    .line 104
    iget v2, v0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->m:I

    .line 105
    .line 106
    sub-int v2, p5, v2

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_5
    move/from16 v2, p5

    .line 110
    .line 111
    :goto_2
    iget v7, v0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->n:I

    .line 112
    .line 113
    sub-int v7, v2, v7

    .line 114
    .line 115
    iget v8, v0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->p:I

    .line 116
    .line 117
    const/4 v9, 0x2

    .line 118
    aget-object v10, v6, v9

    .line 119
    .line 120
    invoke-static {v10}, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->c(Landroid/view/View;)Z

    .line 121
    .line 122
    .line 123
    move-result v10

    .line 124
    sget-object v11, Ll4/d;->c:Ll4/d;

    .line 125
    .line 126
    const/4 v12, -0x1

    .line 127
    if-eqz v10, :cond_7

    .line 128
    .line 129
    iget-object v10, v0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->o:Ll4/d;

    .line 130
    .line 131
    if-ne v10, v11, :cond_6

    .line 132
    .line 133
    add-int v10, v1, v8

    .line 134
    .line 135
    aget-object v13, v6, v9

    .line 136
    .line 137
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I

    .line 138
    .line 139
    .line 140
    move-result v13

    .line 141
    add-int/2addr v13, v10

    .line 142
    move v14, v13

    .line 143
    move v13, v12

    .line 144
    goto :goto_3

    .line 145
    :cond_6
    sub-int v13, v3, v8

    .line 146
    .line 147
    aget-object v10, v6, v9

    .line 148
    .line 149
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredWidth()I

    .line 150
    .line 151
    .line 152
    move-result v10

    .line 153
    sub-int v10, v13, v10

    .line 154
    .line 155
    move v14, v13

    .line 156
    move v13, v10

    .line 157
    :goto_3
    aget-object v15, v6, v9

    .line 158
    .line 159
    invoke-virtual {v15, v10, v7, v14, v2}, Landroid/view/View;->layout(IIII)V

    .line 160
    .line 161
    .line 162
    aget-object v10, v6, v9

    .line 163
    .line 164
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredWidth()I

    .line 165
    .line 166
    .line 167
    move-result v10

    .line 168
    add-int/2addr v8, v10

    .line 169
    goto :goto_4

    .line 170
    :cond_7
    move v13, v12

    .line 171
    :goto_4
    aget-object v10, v6, v4

    .line 172
    .line 173
    invoke-static {v10}, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->c(Landroid/view/View;)Z

    .line 174
    .line 175
    .line 176
    move-result v10

    .line 177
    sget-object v14, Ll4/d;->a:Ll4/d;

    .line 178
    .line 179
    if-eqz v10, :cond_a

    .line 180
    .line 181
    iget-object v10, v0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->o:Ll4/d;

    .line 182
    .line 183
    if-ne v10, v11, :cond_8

    .line 184
    .line 185
    add-int/2addr v8, v1

    .line 186
    aget-object v10, v6, v4

    .line 187
    .line 188
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredWidth()I

    .line 189
    .line 190
    .line 191
    move-result v10

    .line 192
    add-int/2addr v10, v8

    .line 193
    :goto_5
    move v15, v12

    .line 194
    :goto_6
    const/16 p1, 0x0

    .line 195
    .line 196
    goto :goto_7

    .line 197
    :cond_8
    if-ne v10, v14, :cond_9

    .line 198
    .line 199
    sub-int v10, v3, v8

    .line 200
    .line 201
    aget-object v8, v6, v4

    .line 202
    .line 203
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I

    .line 204
    .line 205
    .line 206
    move-result v8

    .line 207
    sub-int v8, v10, v8

    .line 208
    .line 209
    goto :goto_5

    .line 210
    :cond_9
    iget v8, v0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->p:I

    .line 211
    .line 212
    add-int/2addr v8, v1

    .line 213
    aget-object v10, v6, v4

    .line 214
    .line 215
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredWidth()I

    .line 216
    .line 217
    .line 218
    move-result v10

    .line 219
    add-int/2addr v10, v8

    .line 220
    move v15, v10

    .line 221
    goto :goto_6

    .line 222
    :goto_7
    aget-object v5, v6, v4

    .line 223
    .line 224
    invoke-virtual {v5, v8, v7, v10, v2}, Landroid/view/View;->layout(IIII)V

    .line 225
    .line 226
    .line 227
    goto :goto_8

    .line 228
    :cond_a
    const/16 p1, 0x0

    .line 229
    .line 230
    move v15, v12

    .line 231
    :goto_8
    aget-object v5, v6, p1

    .line 232
    .line 233
    invoke-static {v5}, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->c(Landroid/view/View;)Z

    .line 234
    .line 235
    .line 236
    move-result v5

    .line 237
    if-eqz v5, :cond_10

    .line 238
    .line 239
    iget-object v5, v0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->o:Ll4/d;

    .line 240
    .line 241
    if-ne v5, v11, :cond_b

    .line 242
    .line 243
    iget v1, v0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->p:I

    .line 244
    .line 245
    sub-int v1, v3, v1

    .line 246
    .line 247
    aget-object v3, v6, p1

    .line 248
    .line 249
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    .line 250
    .line 251
    .line 252
    move-result v3

    .line 253
    sub-int v3, v1, v3

    .line 254
    .line 255
    goto :goto_b

    .line 256
    :cond_b
    if-ne v5, v14, :cond_c

    .line 257
    .line 258
    iget v3, v0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->p:I

    .line 259
    .line 260
    add-int/2addr v3, v1

    .line 261
    aget-object v1, v6, p1

    .line 262
    .line 263
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 264
    .line 265
    .line 266
    move-result v1

    .line 267
    add-int/2addr v1, v3

    .line 268
    goto :goto_b

    .line 269
    :cond_c
    if-ne v15, v12, :cond_d

    .line 270
    .line 271
    if-eq v13, v12, :cond_d

    .line 272
    .line 273
    aget-object v1, v6, p1

    .line 274
    .line 275
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 276
    .line 277
    .line 278
    move-result v1

    .line 279
    sub-int v15, v13, v1

    .line 280
    .line 281
    goto :goto_a

    .line 282
    :cond_d
    if-ne v13, v12, :cond_e

    .line 283
    .line 284
    if-eq v15, v12, :cond_e

    .line 285
    .line 286
    aget-object v1, v6, p1

    .line 287
    .line 288
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 289
    .line 290
    .line 291
    move-result v1

    .line 292
    :goto_9
    add-int v13, v1, v15

    .line 293
    .line 294
    goto :goto_a

    .line 295
    :cond_e
    if-ne v13, v12, :cond_f

    .line 296
    .line 297
    sub-int v1, v3, v1

    .line 298
    .line 299
    div-int/2addr v1, v9

    .line 300
    aget-object v3, v6, p1

    .line 301
    .line 302
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    .line 303
    .line 304
    .line 305
    move-result v3

    .line 306
    div-int/2addr v3, v9

    .line 307
    sub-int v15, v1, v3

    .line 308
    .line 309
    aget-object v1, v6, p1

    .line 310
    .line 311
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 312
    .line 313
    .line 314
    move-result v1

    .line 315
    goto :goto_9

    .line 316
    :cond_f
    :goto_a
    move v1, v13

    .line 317
    move v3, v15

    .line 318
    :goto_b
    aget-object v5, v6, p1

    .line 319
    .line 320
    invoke-virtual {v5, v3, v7, v1, v2}, Landroid/view/View;->layout(IIII)V

    .line 321
    .line 322
    .line 323
    :cond_10
    iget-object v1, v0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->d:Landroid/view/View;

    .line 324
    .line 325
    invoke-virtual {v0, v1, v4}, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->d(Landroid/view/View;Z)V

    .line 326
    .line 327
    .line 328
    return-void
.end method

.method public final onMeasure(II)V
    .locals 11

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget v2, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->b:I

    .line 10
    .line 11
    if-le v1, v2, :cond_0

    .line 12
    .line 13
    move v1, v2

    .line 14
    :cond_0
    const/4 v2, 0x1

    .line 15
    iput-boolean v2, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->i:Z

    .line 16
    .line 17
    iget-object v3, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->g:Ll4/i;

    .line 18
    .line 19
    sget-object v4, Ll4/i;->a:Ll4/i;

    .line 20
    .line 21
    iget-object v5, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->a:[Lcom/afollestad/materialdialogs/internal/MDButton;

    .line 22
    .line 23
    const/4 v6, 0x0

    .line 24
    if-ne v3, v4, :cond_1

    .line 25
    .line 26
    move v3, v2

    .line 27
    move v8, v6

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    sget-object v4, Ll4/i;->c:Ll4/i;

    .line 30
    .line 31
    if-ne v3, v4, :cond_2

    .line 32
    .line 33
    move v3, v6

    .line 34
    move v8, v3

    .line 35
    goto :goto_1

    .line 36
    :cond_2
    array-length v3, v5

    .line 37
    move v4, v6

    .line 38
    move v7, v4

    .line 39
    move v8, v7

    .line 40
    :goto_0
    if-ge v4, v3, :cond_4

    .line 41
    .line 42
    aget-object v9, v5, v4

    .line 43
    .line 44
    if-eqz v9, :cond_3

    .line 45
    .line 46
    invoke-static {v9}, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->c(Landroid/view/View;)Z

    .line 47
    .line 48
    .line 49
    move-result v10

    .line 50
    if-eqz v10, :cond_3

    .line 51
    .line 52
    invoke-virtual {v9, v6, v6}, Lcom/afollestad/materialdialogs/internal/MDButton;->a(ZZ)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, v9, p1, p2}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v9}, Landroid/view/View;->getMeasuredWidth()I

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    add-int/2addr v7, v8

    .line 63
    move v8, v2

    .line 64
    :cond_3
    add-int/lit8 v4, v4, 0x1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    const v4, 0x7f07028f

    .line 76
    .line 77
    .line 78
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    mul-int/lit8 v3, v3, 0x2

    .line 83
    .line 84
    sub-int v3, v0, v3

    .line 85
    .line 86
    if-le v7, v3, :cond_5

    .line 87
    .line 88
    move v3, v2

    .line 89
    goto :goto_1

    .line 90
    :cond_5
    move v3, v6

    .line 91
    :goto_1
    iput-boolean v3, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->h:Z

    .line 92
    .line 93
    if-eqz v3, :cond_7

    .line 94
    .line 95
    array-length v3, v5

    .line 96
    move v4, v6

    .line 97
    move v7, v4

    .line 98
    :goto_2
    if-ge v4, v3, :cond_8

    .line 99
    .line 100
    aget-object v9, v5, v4

    .line 101
    .line 102
    if-eqz v9, :cond_6

    .line 103
    .line 104
    invoke-static {v9}, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->c(Landroid/view/View;)Z

    .line 105
    .line 106
    .line 107
    move-result v10

    .line 108
    if-eqz v10, :cond_6

    .line 109
    .line 110
    invoke-virtual {v9, v2, v6}, Lcom/afollestad/materialdialogs/internal/MDButton;->a(ZZ)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0, v9, p1, p2}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v9}, Landroid/view/View;->getMeasuredHeight()I

    .line 117
    .line 118
    .line 119
    move-result v8

    .line 120
    add-int/2addr v7, v8

    .line 121
    move v8, v2

    .line 122
    :cond_6
    add-int/lit8 v4, v4, 0x1

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_7
    move v7, v6

    .line 126
    :cond_8
    if-eqz v8, :cond_a

    .line 127
    .line 128
    iget-boolean p1, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->h:Z

    .line 129
    .line 130
    if-eqz p1, :cond_9

    .line 131
    .line 132
    sub-int p1, v1, v7

    .line 133
    .line 134
    iget p2, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->m:I

    .line 135
    .line 136
    mul-int/lit8 p2, p2, 0x2

    .line 137
    .line 138
    move v3, p2

    .line 139
    goto :goto_4

    .line 140
    :cond_9
    iget p1, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->n:I

    .line 141
    .line 142
    sub-int p1, v1, p1

    .line 143
    .line 144
    iget p2, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->m:I

    .line 145
    .line 146
    mul-int/lit8 p2, p2, 0x2

    .line 147
    .line 148
    :goto_3
    move v3, v6

    .line 149
    goto :goto_4

    .line 150
    :cond_a
    iget p1, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->m:I

    .line 151
    .line 152
    mul-int/lit8 p2, p1, 0x2

    .line 153
    .line 154
    move p1, v1

    .line 155
    goto :goto_3

    .line 156
    :goto_4
    iget-object v4, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->c:Landroid/view/View;

    .line 157
    .line 158
    invoke-static {v4}, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->c(Landroid/view/View;)Z

    .line 159
    .line 160
    .line 161
    move-result v4

    .line 162
    const/high16 v5, 0x40000000    # 2.0f

    .line 163
    .line 164
    if-eqz v4, :cond_b

    .line 165
    .line 166
    iget-object v4, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->c:Landroid/view/View;

    .line 167
    .line 168
    invoke-static {v0, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 169
    .line 170
    .line 171
    move-result v7

    .line 172
    invoke-virtual {v4, v7, v6}, Landroid/view/View;->measure(II)V

    .line 173
    .line 174
    .line 175
    iget-object v4, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->c:Landroid/view/View;

    .line 176
    .line 177
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 178
    .line 179
    .line 180
    move-result v4

    .line 181
    sub-int/2addr p1, v4

    .line 182
    goto :goto_5

    .line 183
    :cond_b
    iget-boolean v4, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->k:Z

    .line 184
    .line 185
    if-nez v4, :cond_c

    .line 186
    .line 187
    iget v4, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->l:I

    .line 188
    .line 189
    add-int/2addr p2, v4

    .line 190
    :cond_c
    :goto_5
    iget-object v4, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->d:Landroid/view/View;

    .line 191
    .line 192
    invoke-static {v4}, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->c(Landroid/view/View;)Z

    .line 193
    .line 194
    .line 195
    move-result v4

    .line 196
    if-eqz v4, :cond_10

    .line 197
    .line 198
    iget-object v4, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->d:Landroid/view/View;

    .line 199
    .line 200
    invoke-static {v0, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 201
    .line 202
    .line 203
    move-result v5

    .line 204
    sub-int v7, p1, v3

    .line 205
    .line 206
    const/high16 v9, -0x80000000

    .line 207
    .line 208
    invoke-static {v7, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 209
    .line 210
    .line 211
    move-result v7

    .line 212
    invoke-virtual {v4, v5, v7}, Landroid/view/View;->measure(II)V

    .line 213
    .line 214
    .line 215
    iget-object v4, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->d:Landroid/view/View;

    .line 216
    .line 217
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 218
    .line 219
    .line 220
    move-result v4

    .line 221
    sub-int v5, p1, p2

    .line 222
    .line 223
    if-gt v4, v5, :cond_f

    .line 224
    .line 225
    iget-boolean v4, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->j:Z

    .line 226
    .line 227
    if-eqz v4, :cond_e

    .line 228
    .line 229
    iget-object v4, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->c:Landroid/view/View;

    .line 230
    .line 231
    invoke-static {v4}, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->c(Landroid/view/View;)Z

    .line 232
    .line 233
    .line 234
    move-result v4

    .line 235
    if-nez v4, :cond_e

    .line 236
    .line 237
    if-eqz v8, :cond_d

    .line 238
    .line 239
    goto :goto_6

    .line 240
    :cond_d
    iput-boolean v6, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->i:Z

    .line 241
    .line 242
    iget-object p2, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->d:Landroid/view/View;

    .line 243
    .line 244
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    .line 245
    .line 246
    .line 247
    move-result p2

    .line 248
    add-int/2addr p2, v3

    .line 249
    sub-int v6, p1, p2

    .line 250
    .line 251
    goto :goto_7

    .line 252
    :cond_e
    :goto_6
    iput-boolean v2, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->i:Z

    .line 253
    .line 254
    iget-object v2, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->d:Landroid/view/View;

    .line 255
    .line 256
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    .line 257
    .line 258
    .line 259
    move-result v2

    .line 260
    add-int/2addr v2, p2

    .line 261
    sub-int v6, p1, v2

    .line 262
    .line 263
    goto :goto_7

    .line 264
    :cond_f
    iput-boolean v6, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->i:Z

    .line 265
    .line 266
    goto :goto_7

    .line 267
    :cond_10
    move v6, p1

    .line 268
    :goto_7
    sub-int/2addr v1, v6

    .line 269
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 270
    .line 271
    .line 272
    return-void
.end method

.method public setButtonGravity(Ll4/d;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->o:Ll4/d;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Landroid/content/res/Configuration;->getLayoutDirection()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    const/4 v0, 0x1

    .line 16
    if-ne p1, v0, :cond_2

    .line 17
    .line 18
    iget-object p1, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->o:Ll4/d;

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    const/4 v0, 0x2

    .line 27
    if-eq p1, v0, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    sget-object p1, Ll4/d;->a:Ll4/d;

    .line 31
    .line 32
    iput-object p1, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->o:Ll4/d;

    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    sget-object p1, Ll4/d;->c:Ll4/d;

    .line 36
    .line 37
    iput-object p1, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->o:Ll4/d;

    .line 38
    .line 39
    :cond_2
    :goto_0
    return-void
.end method

.method public setButtonStackedGravity(Ll4/d;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->a:[Lcom/afollestad/materialdialogs/internal/MDButton;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_1

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    invoke-virtual {v3, p1}, Lcom/afollestad/materialdialogs/internal/MDButton;->setStackedGravity(Ll4/d;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    return-void
.end method

.method public setDividerColor(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->q:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setMaxHeight(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->b:I

    .line 2
    .line 3
    return-void
.end method

.method public setStackingBehavior(Ll4/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/afollestad/materialdialogs/internal/MDRootLayout;->g:Ll4/i;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
