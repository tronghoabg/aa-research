.class public final Lp/e;
.super Lp/s;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnKeyListener;
.implements Landroid/widget/PopupWindow$OnDismissListener;


# instance fields
.field public final b:Landroid/content/Context;

.field public final c:I

.field public final d:I

.field public final e:Z

.field public final f:Landroid/os/Handler;

.field public final g:Ljava/util/ArrayList;

.field public final h:Ljava/util/ArrayList;

.field public final i:LE9/d;

.field public final j:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/T;

.field public final k:Lac/a;

.field public l:I

.field public m:I

.field public n:Landroid/view/View;

.field public o:Landroid/view/View;

.field public p:I

.field public q:Z

.field public r:Z

.field public s:I

.field public t:I

.field public u:Z

.field public v:Z

.field public w:Lp/w;

.field public x:Landroid/view/ViewTreeObserver;

.field public y:Lp/t;

.field public z:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/View;IZ)V
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    .line 4
    .line 5
    new-instance v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v1, p0, Lp/e;->g:Ljava/util/ArrayList;

    .line 11
    .line 12
    new-instance v1, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, Lp/e;->h:Ljava/util/ArrayList;

    .line 18
    .line 19
    new-instance v1, LE9/d;

    .line 20
    .line 21
    const/4 v2, 0x3

    .line 22
    invoke-direct {v1, p0, v2}, LE9/d;-><init>(Ljava/lang/Object;I)V

    .line 23
    .line 24
    .line 25
    iput-object v1, p0, Lp/e;->i:LE9/d;

    .line 26
    .line 27
    new-instance v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/T;

    .line 28
    .line 29
    invoke-direct {v1, p0, v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/T;-><init>(Ljava/lang/Object;I)V

    .line 30
    .line 31
    .line 32
    iput-object v1, p0, Lp/e;->j:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/T;

    .line 33
    .line 34
    new-instance v1, Lac/a;

    .line 35
    .line 36
    const/16 v2, 0xe

    .line 37
    .line 38
    invoke-direct {v1, p0, v2}, Lac/a;-><init>(Ljava/lang/Object;I)V

    .line 39
    .line 40
    .line 41
    iput-object v1, p0, Lp/e;->k:Lac/a;

    .line 42
    .line 43
    const/4 v1, 0x0

    .line 44
    iput v1, p0, Lp/e;->l:I

    .line 45
    .line 46
    iput v1, p0, Lp/e;->m:I

    .line 47
    .line 48
    iput-object p1, p0, Lp/e;->b:Landroid/content/Context;

    .line 49
    .line 50
    iput-object p2, p0, Lp/e;->n:Landroid/view/View;

    .line 51
    .line 52
    iput p3, p0, Lp/e;->d:I

    .line 53
    .line 54
    iput-boolean p4, p0, Lp/e;->e:Z

    .line 55
    .line 56
    iput-boolean v1, p0, Lp/e;->u:Z

    .line 57
    .line 58
    sget-object p3, Lk1/S;->a:Ljava/util/WeakHashMap;

    .line 59
    .line 60
    invoke-virtual {p2}, Landroid/view/View;->getLayoutDirection()I

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    const/4 p3, 0x1

    .line 65
    if-ne p2, p3, :cond_0

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    move v1, p3

    .line 69
    :goto_0
    iput v1, p0, Lp/e;->p:I

    .line 70
    .line 71
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    iget p2, p2, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 80
    .line 81
    div-int/2addr p2, v0

    .line 82
    const p3, 0x7f070017

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, p3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    iput p1, p0, Lp/e;->c:I

    .line 94
    .line 95
    new-instance p1, Landroid/os/Handler;

    .line 96
    .line 97
    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    .line 98
    .line 99
    .line 100
    iput-object p1, p0, Lp/e;->f:Landroid/os/Handler;

    .line 101
    .line 102
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lp/e;->h:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-lez v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lp/d;

    .line 15
    .line 16
    iget-object v0, v0, Lp/d;->a:Lq/L0;

    .line 17
    .line 18
    iget-object v0, v0, Lq/F0;->z:Lq/w;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    return v0

    .line 28
    :cond_0
    return v2
.end method

.method public final c(Lp/w;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lp/e;->w:Lp/w;

    .line 2
    .line 3
    return-void
.end method

.method public final d()V
    .locals 3

    .line 1
    iget-object v0, p0, Lp/e;->h:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lp/d;

    .line 18
    .line 19
    iget-object v1, v1, Lp/d;->a:Lq/L0;

    .line 20
    .line 21
    iget-object v1, v1, Lq/F0;->c:Lq/t0;

    .line 22
    .line 23
    invoke-virtual {v1}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    instance-of v2, v1, Landroid/widget/HeaderViewListAdapter;

    .line 28
    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    check-cast v1, Landroid/widget/HeaderViewListAdapter;

    .line 32
    .line 33
    invoke-virtual {v1}, Landroid/widget/HeaderViewListAdapter;->getWrappedAdapter()Landroid/widget/ListAdapter;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Lp/h;

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    check-cast v1, Lp/h;

    .line 41
    .line 42
    :goto_1
    invoke-virtual {v1}, Lp/h;->notifyDataSetChanged()V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    return-void
.end method

.method public final dismiss()V
    .locals 4

    .line 1
    iget-object v0, p0, Lp/e;->h:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-lez v1, :cond_1

    .line 8
    .line 9
    new-array v2, v1, [Lp/d;

    .line 10
    .line 11
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, [Lp/d;

    .line 16
    .line 17
    add-int/lit8 v1, v1, -0x1

    .line 18
    .line 19
    :goto_0
    if-ltz v1, :cond_1

    .line 20
    .line 21
    aget-object v2, v0, v1

    .line 22
    .line 23
    iget-object v3, v2, Lp/d;->a:Lq/L0;

    .line 24
    .line 25
    iget-object v3, v3, Lq/F0;->z:Lq/w;

    .line 26
    .line 27
    invoke-virtual {v3}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    iget-object v2, v2, Lp/d;->a:Lq/L0;

    .line 34
    .line 35
    invoke-virtual {v2}, Lq/F0;->dismiss()V

    .line 36
    .line 37
    .line 38
    :cond_0
    add-int/lit8 v1, v1, -0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    return-void
.end method

.method public final g()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final h(Lp/D;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lp/e;->h:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lp/d;

    .line 19
    .line 20
    iget-object v3, v1, Lp/d;->b:Lp/k;

    .line 21
    .line 22
    if-ne p1, v3, :cond_0

    .line 23
    .line 24
    iget-object p1, v1, Lp/d;->a:Lq/L0;

    .line 25
    .line 26
    iget-object p1, p1, Lq/F0;->c:Lq/t0;

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 29
    .line 30
    .line 31
    return v2

    .line 32
    :cond_1
    invoke-virtual {p1}, Lp/k;->hasVisibleItems()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Lp/e;->i(Lp/k;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lp/e;->w:Lp/w;

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    invoke-interface {v0, p1}, Lp/w;->F(Lp/k;)Z

    .line 46
    .line 47
    .line 48
    :cond_2
    return v2

    .line 49
    :cond_3
    const/4 p1, 0x0

    .line 50
    return p1
.end method

.method public final i(Lp/k;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lp/e;->b:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {p1, p0, v0}, Lp/k;->b(Lp/x;Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lp/e;->a()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lp/e;->u(Lp/k;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-object v0, p0, Lp/e;->g:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final k(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lp/e;->n:Landroid/view/View;

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lp/e;->n:Landroid/view/View;

    .line 6
    .line 7
    iget v0, p0, Lp/e;->l:I

    .line 8
    .line 9
    sget-object v1, Lk1/S;->a:Ljava/util/WeakHashMap;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/view/View;->getLayoutDirection()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-static {v0, p1}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    iput p1, p0, Lp/e;->m:I

    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public final l(Lp/k;Z)V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object v1, p0, Lp/e;->h:Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    const/4 v3, 0x0

    .line 9
    move v4, v3

    .line 10
    :goto_0
    if-ge v4, v2, :cond_1

    .line 11
    .line 12
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v5

    .line 16
    check-cast v5, Lp/d;

    .line 17
    .line 18
    iget-object v5, v5, Lp/d;->b:Lp/k;

    .line 19
    .line 20
    if-ne p1, v5, :cond_0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    add-int/2addr v4, v0

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 v4, -0x1

    .line 26
    :goto_1
    if-gez v4, :cond_2

    .line 27
    .line 28
    goto/16 :goto_4

    .line 29
    .line 30
    :cond_2
    add-int/lit8 v2, v4, 0x1

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    if-ge v2, v5, :cond_3

    .line 37
    .line 38
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    check-cast v2, Lp/d;

    .line 43
    .line 44
    iget-object v2, v2, Lp/d;->b:Lp/k;

    .line 45
    .line 46
    invoke-virtual {v2, v3}, Lp/k;->c(Z)V

    .line 47
    .line 48
    .line 49
    :cond_3
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    check-cast v2, Lp/d;

    .line 54
    .line 55
    iget-object v4, v2, Lp/d;->b:Lp/k;

    .line 56
    .line 57
    invoke-virtual {v4, p0}, Lp/k;->r(Lp/x;)V

    .line 58
    .line 59
    .line 60
    iget-boolean v4, p0, Lp/e;->z:Z

    .line 61
    .line 62
    iget-object v2, v2, Lp/d;->a:Lq/L0;

    .line 63
    .line 64
    const/4 v5, 0x0

    .line 65
    if-eqz v4, :cond_4

    .line 66
    .line 67
    iget-object v4, v2, Lq/F0;->z:Lq/w;

    .line 68
    .line 69
    invoke-static {v4, v5}, Lq/H0;->b(Landroid/widget/PopupWindow;Landroid/transition/Transition;)V

    .line 70
    .line 71
    .line 72
    iget-object v4, v2, Lq/F0;->z:Lq/w;

    .line 73
    .line 74
    invoke-virtual {v4, v3}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    .line 75
    .line 76
    .line 77
    :cond_4
    invoke-virtual {v2}, Lq/F0;->dismiss()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    if-lez v2, :cond_5

    .line 85
    .line 86
    add-int/lit8 v4, v2, -0x1

    .line 87
    .line 88
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    check-cast v4, Lp/d;

    .line 93
    .line 94
    iget v4, v4, Lp/d;->c:I

    .line 95
    .line 96
    iput v4, p0, Lp/e;->p:I

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_5
    iget-object v4, p0, Lp/e;->n:Landroid/view/View;

    .line 100
    .line 101
    sget-object v6, Lk1/S;->a:Ljava/util/WeakHashMap;

    .line 102
    .line 103
    invoke-virtual {v4}, Landroid/view/View;->getLayoutDirection()I

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    if-ne v4, v0, :cond_6

    .line 108
    .line 109
    move v4, v3

    .line 110
    goto :goto_2

    .line 111
    :cond_6
    move v4, v0

    .line 112
    :goto_2
    iput v4, p0, Lp/e;->p:I

    .line 113
    .line 114
    :goto_3
    if-nez v2, :cond_a

    .line 115
    .line 116
    invoke-virtual {p0}, Lp/e;->dismiss()V

    .line 117
    .line 118
    .line 119
    iget-object p2, p0, Lp/e;->w:Lp/w;

    .line 120
    .line 121
    if-eqz p2, :cond_7

    .line 122
    .line 123
    invoke-interface {p2, p1, v0}, Lp/w;->l(Lp/k;Z)V

    .line 124
    .line 125
    .line 126
    :cond_7
    iget-object p1, p0, Lp/e;->x:Landroid/view/ViewTreeObserver;

    .line 127
    .line 128
    if-eqz p1, :cond_9

    .line 129
    .line 130
    invoke-virtual {p1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    if-eqz p1, :cond_8

    .line 135
    .line 136
    iget-object p1, p0, Lp/e;->x:Landroid/view/ViewTreeObserver;

    .line 137
    .line 138
    iget-object p2, p0, Lp/e;->i:LE9/d;

    .line 139
    .line 140
    invoke-virtual {p1, p2}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 141
    .line 142
    .line 143
    :cond_8
    iput-object v5, p0, Lp/e;->x:Landroid/view/ViewTreeObserver;

    .line 144
    .line 145
    :cond_9
    iget-object p1, p0, Lp/e;->o:Landroid/view/View;

    .line 146
    .line 147
    iget-object p2, p0, Lp/e;->j:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/T;

    .line 148
    .line 149
    invoke-virtual {p1, p2}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 150
    .line 151
    .line 152
    iget-object p1, p0, Lp/e;->y:Lp/t;

    .line 153
    .line 154
    invoke-virtual {p1}, Lp/t;->onDismiss()V

    .line 155
    .line 156
    .line 157
    return-void

    .line 158
    :cond_a
    if-eqz p2, :cond_b

    .line 159
    .line 160
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    check-cast p1, Lp/d;

    .line 165
    .line 166
    iget-object p1, p1, Lp/d;->b:Lp/k;

    .line 167
    .line 168
    invoke-virtual {p1, v3}, Lp/k;->c(Z)V

    .line 169
    .line 170
    .line 171
    :cond_b
    :goto_4
    return-void
.end method

.method public final m(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lp/e;->u:Z

    .line 2
    .line 3
    return-void
.end method

.method public final n()Lq/t0;
    .locals 2

    .line 1
    iget-object v0, p0, Lp/e;->h:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    return-object v0

    .line 11
    :cond_0
    const/4 v1, 0x1

    .line 12
    invoke-static {v0, v1}, Lka/n;->e(Ljava/util/ArrayList;I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lp/d;

    .line 17
    .line 18
    iget-object v0, v0, Lp/d;->a:Lq/L0;

    .line 19
    .line 20
    iget-object v0, v0, Lq/F0;->c:Lq/t0;

    .line 21
    .line 22
    return-object v0
.end method

.method public final o(I)V
    .locals 2

    .line 1
    iget v0, p0, Lp/e;->l:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lp/e;->l:I

    .line 6
    .line 7
    iget-object v0, p0, Lp/e;->n:Landroid/view/View;

    .line 8
    .line 9
    sget-object v1, Lk1/S;->a:Ljava/util/WeakHashMap;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-static {p1, v0}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    iput p1, p0, Lp/e;->m:I

    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public final onDismiss()V
    .locals 6

    .line 1
    iget-object v0, p0, Lp/e;->h:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    :goto_0
    if-ge v3, v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    check-cast v4, Lp/d;

    .line 16
    .line 17
    iget-object v5, v4, Lp/d;->a:Lq/L0;

    .line 18
    .line 19
    iget-object v5, v5, Lq/F0;->z:Lq/w;

    .line 20
    .line 21
    invoke-virtual {v5}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    if-nez v5, :cond_0

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 v4, 0x0

    .line 32
    :goto_1
    if-eqz v4, :cond_2

    .line 33
    .line 34
    iget-object v0, v4, Lp/d;->b:Lp/k;

    .line 35
    .line 36
    invoke-virtual {v0, v2}, Lp/k;->c(Z)V

    .line 37
    .line 38
    .line 39
    :cond_2
    return-void
.end method

.method public final onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 p3, 0x1

    .line 6
    if-ne p1, p3, :cond_0

    .line 7
    .line 8
    const/16 p1, 0x52

    .line 9
    .line 10
    if-ne p2, p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lp/e;->dismiss()V

    .line 13
    .line 14
    .line 15
    return p3

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    return p1
.end method

.method public final p(I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lp/e;->q:Z

    .line 3
    .line 4
    iput p1, p0, Lp/e;->s:I

    .line 5
    .line 6
    return-void
.end method

.method public final q(Landroid/widget/PopupWindow$OnDismissListener;)V
    .locals 0

    .line 1
    check-cast p1, Lp/t;

    .line 2
    .line 3
    iput-object p1, p0, Lp/e;->y:Lp/t;

    .line 4
    .line 5
    return-void
.end method

.method public final r(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lp/e;->v:Z

    .line 2
    .line 3
    return-void
.end method

.method public final s(I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lp/e;->r:Z

    .line 3
    .line 4
    iput p1, p0, Lp/e;->t:I

    .line 5
    .line 6
    return-void
.end method

.method public final show()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lp/e;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    iget-object v0, p0, Lp/e;->g:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Lp/k;

    .line 25
    .line 26
    invoke-virtual {p0, v2}, Lp/e;->u(Lp/k;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lp/e;->n:Landroid/view/View;

    .line 34
    .line 35
    iput-object v0, p0, Lp/e;->o:Landroid/view/View;

    .line 36
    .line 37
    if-eqz v0, :cond_4

    .line 38
    .line 39
    iget-object v1, p0, Lp/e;->x:Landroid/view/ViewTreeObserver;

    .line 40
    .line 41
    if-nez v1, :cond_2

    .line 42
    .line 43
    const/4 v1, 0x1

    .line 44
    goto :goto_1

    .line 45
    :cond_2
    const/4 v1, 0x0

    .line 46
    :goto_1
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iput-object v0, p0, Lp/e;->x:Landroid/view/ViewTreeObserver;

    .line 51
    .line 52
    if-eqz v1, :cond_3

    .line 53
    .line 54
    iget-object v1, p0, Lp/e;->i:LE9/d;

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 57
    .line 58
    .line 59
    :cond_3
    iget-object v0, p0, Lp/e;->o:Landroid/view/View;

    .line 60
    .line 61
    iget-object v1, p0, Lp/e;->j:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/T;

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 64
    .line 65
    .line 66
    :cond_4
    :goto_2
    return-void
.end method

.method public final u(Lp/k;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v3, v0, Lp/e;->b:Landroid/content/Context;

    .line 6
    .line 7
    invoke-static {v3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 8
    .line 9
    .line 10
    move-result-object v4

    .line 11
    new-instance v5, Lp/h;

    .line 12
    .line 13
    iget-boolean v6, v0, Lp/e;->e:Z

    .line 14
    .line 15
    const v7, 0x7f0d000b

    .line 16
    .line 17
    .line 18
    invoke-direct {v5, v1, v4, v6, v7}, Lp/h;-><init>(Lp/k;Landroid/view/LayoutInflater;ZI)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lp/e;->a()Z

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    const/4 v7, 0x1

    .line 26
    if-nez v6, :cond_0

    .line 27
    .line 28
    iget-boolean v6, v0, Lp/e;->u:Z

    .line 29
    .line 30
    if-eqz v6, :cond_0

    .line 31
    .line 32
    iput-boolean v7, v5, Lp/h;->c:Z

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {v0}, Lp/e;->a()Z

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    if-eqz v6, :cond_1

    .line 40
    .line 41
    invoke-static {v1}, Lp/s;->t(Lp/k;)Z

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    iput-boolean v6, v5, Lp/h;->c:Z

    .line 46
    .line 47
    :cond_1
    :goto_0
    iget v6, v0, Lp/e;->c:I

    .line 48
    .line 49
    invoke-static {v5, v3, v6}, Lp/s;->j(Landroid/widget/ListAdapter;Landroid/content/Context;I)I

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    new-instance v8, Lq/L0;

    .line 54
    .line 55
    iget v9, v0, Lp/e;->d:I

    .line 56
    .line 57
    const/4 v10, 0x0

    .line 58
    invoke-direct {v8, v3, v10, v9}, Lq/F0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 59
    .line 60
    .line 61
    iget-object v3, v8, Lq/F0;->z:Lq/w;

    .line 62
    .line 63
    iget-object v9, v0, Lp/e;->k:Lac/a;

    .line 64
    .line 65
    iput-object v9, v8, Lq/L0;->D:Lac/a;

    .line 66
    .line 67
    iput-object v0, v8, Lq/F0;->p:Landroid/widget/AdapterView$OnItemClickListener;

    .line 68
    .line 69
    invoke-virtual {v3, v0}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 70
    .line 71
    .line 72
    iget-object v9, v0, Lp/e;->n:Landroid/view/View;

    .line 73
    .line 74
    iput-object v9, v8, Lq/F0;->o:Landroid/view/View;

    .line 75
    .line 76
    iget v9, v0, Lp/e;->m:I

    .line 77
    .line 78
    iput v9, v8, Lq/F0;->l:I

    .line 79
    .line 80
    iput-boolean v7, v8, Lq/F0;->y:Z

    .line 81
    .line 82
    invoke-virtual {v3, v7}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 83
    .line 84
    .line 85
    const/4 v9, 0x2

    .line 86
    invoke-virtual {v3, v9}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v8, v5}, Lq/F0;->k(Landroid/widget/ListAdapter;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v8, v6}, Lq/F0;->p(I)V

    .line 93
    .line 94
    .line 95
    iget v5, v0, Lp/e;->m:I

    .line 96
    .line 97
    iput v5, v8, Lq/F0;->l:I

    .line 98
    .line 99
    iget-object v5, v0, Lp/e;->h:Ljava/util/ArrayList;

    .line 100
    .line 101
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 102
    .line 103
    .line 104
    move-result v11

    .line 105
    if-lez v11, :cond_b

    .line 106
    .line 107
    invoke-static {v5, v7}, Lka/n;->e(Ljava/util/ArrayList;I)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v11

    .line 111
    check-cast v11, Lp/d;

    .line 112
    .line 113
    iget-object v12, v11, Lp/d;->b:Lp/k;

    .line 114
    .line 115
    iget-object v13, v12, Lp/k;->f:Ljava/util/ArrayList;

    .line 116
    .line 117
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 118
    .line 119
    .line 120
    move-result v13

    .line 121
    const/4 v14, 0x0

    .line 122
    :goto_1
    if-ge v14, v13, :cond_3

    .line 123
    .line 124
    invoke-virtual {v12, v14}, Lp/k;->getItem(I)Landroid/view/MenuItem;

    .line 125
    .line 126
    .line 127
    move-result-object v15

    .line 128
    invoke-interface {v15}, Landroid/view/MenuItem;->hasSubMenu()Z

    .line 129
    .line 130
    .line 131
    move-result v16

    .line 132
    if-eqz v16, :cond_2

    .line 133
    .line 134
    invoke-interface {v15}, Landroid/view/MenuItem;->getSubMenu()Landroid/view/SubMenu;

    .line 135
    .line 136
    .line 137
    move-result-object v9

    .line 138
    if-ne v1, v9, :cond_2

    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_2
    add-int/2addr v14, v7

    .line 142
    const/4 v9, 0x2

    .line 143
    goto :goto_1

    .line 144
    :cond_3
    move-object v15, v10

    .line 145
    :goto_2
    if-nez v15, :cond_4

    .line 146
    .line 147
    move/from16 v18, v7

    .line 148
    .line 149
    move-object v2, v10

    .line 150
    const/16 v17, 0x0

    .line 151
    .line 152
    goto :goto_7

    .line 153
    :cond_4
    iget-object v9, v11, Lp/d;->a:Lq/L0;

    .line 154
    .line 155
    iget-object v9, v9, Lq/F0;->c:Lq/t0;

    .line 156
    .line 157
    invoke-virtual {v9}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    .line 158
    .line 159
    .line 160
    move-result-object v12

    .line 161
    instance-of v13, v12, Landroid/widget/HeaderViewListAdapter;

    .line 162
    .line 163
    if-eqz v13, :cond_5

    .line 164
    .line 165
    check-cast v12, Landroid/widget/HeaderViewListAdapter;

    .line 166
    .line 167
    invoke-virtual {v12}, Landroid/widget/HeaderViewListAdapter;->getHeadersCount()I

    .line 168
    .line 169
    .line 170
    move-result v13

    .line 171
    invoke-virtual {v12}, Landroid/widget/HeaderViewListAdapter;->getWrappedAdapter()Landroid/widget/ListAdapter;

    .line 172
    .line 173
    .line 174
    move-result-object v12

    .line 175
    check-cast v12, Lp/h;

    .line 176
    .line 177
    goto :goto_3

    .line 178
    :cond_5
    check-cast v12, Lp/h;

    .line 179
    .line 180
    const/4 v13, 0x0

    .line 181
    :goto_3
    invoke-virtual {v12}, Lp/h;->getCount()I

    .line 182
    .line 183
    .line 184
    move-result v14

    .line 185
    const/4 v10, 0x0

    .line 186
    const/16 v17, 0x0

    .line 187
    .line 188
    :goto_4
    const/4 v2, -0x1

    .line 189
    move/from16 v18, v7

    .line 190
    .line 191
    if-ge v10, v14, :cond_7

    .line 192
    .line 193
    invoke-virtual {v12, v10}, Lp/h;->b(I)Lp/m;

    .line 194
    .line 195
    .line 196
    move-result-object v7

    .line 197
    if-ne v15, v7, :cond_6

    .line 198
    .line 199
    goto :goto_5

    .line 200
    :cond_6
    add-int/lit8 v10, v10, 0x1

    .line 201
    .line 202
    move/from16 v7, v18

    .line 203
    .line 204
    goto :goto_4

    .line 205
    :cond_7
    move v10, v2

    .line 206
    :goto_5
    if-ne v10, v2, :cond_9

    .line 207
    .line 208
    :cond_8
    :goto_6
    const/4 v2, 0x0

    .line 209
    goto :goto_7

    .line 210
    :cond_9
    add-int/2addr v10, v13

    .line 211
    invoke-virtual {v9}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    .line 212
    .line 213
    .line 214
    move-result v2

    .line 215
    sub-int/2addr v10, v2

    .line 216
    if-ltz v10, :cond_8

    .line 217
    .line 218
    invoke-virtual {v9}, Landroid/view/ViewGroup;->getChildCount()I

    .line 219
    .line 220
    .line 221
    move-result v2

    .line 222
    if-lt v10, v2, :cond_a

    .line 223
    .line 224
    goto :goto_6

    .line 225
    :cond_a
    invoke-virtual {v9, v10}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    goto :goto_7

    .line 230
    :cond_b
    move/from16 v18, v7

    .line 231
    .line 232
    const/16 v17, 0x0

    .line 233
    .line 234
    const/4 v2, 0x0

    .line 235
    const/4 v11, 0x0

    .line 236
    :goto_7
    if-eqz v2, :cond_17

    .line 237
    .line 238
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 239
    .line 240
    const/16 v9, 0x1c

    .line 241
    .line 242
    if-gt v7, v9, :cond_d

    .line 243
    .line 244
    sget-object v7, Lq/L0;->E:Ljava/lang/reflect/Method;

    .line 245
    .line 246
    if-eqz v7, :cond_c

    .line 247
    .line 248
    move/from16 v9, v18

    .line 249
    .line 250
    :try_start_0
    new-array v10, v9, [Ljava/lang/Object;

    .line 251
    .line 252
    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 253
    .line 254
    aput-object v9, v10, v17

    .line 255
    .line 256
    invoke-virtual {v7, v3, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 257
    .line 258
    .line 259
    :cond_c
    :goto_8
    const/4 v7, 0x0

    .line 260
    goto :goto_9

    .line 261
    :catch_0
    const-string v7, "MenuPopupWindow"

    .line 262
    .line 263
    const-string v9, "Could not invoke setTouchModal() on PopupWindow. Oh well."

    .line 264
    .line 265
    invoke-static {v7, v9}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 266
    .line 267
    .line 268
    goto :goto_8

    .line 269
    :cond_d
    move/from16 v7, v17

    .line 270
    .line 271
    invoke-static {v3, v7}, Lq/I0;->a(Landroid/widget/PopupWindow;Z)V

    .line 272
    .line 273
    .line 274
    goto :goto_8

    .line 275
    :goto_9
    invoke-static {v3, v7}, Lq/H0;->a(Landroid/widget/PopupWindow;Landroid/transition/Transition;)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 279
    .line 280
    .line 281
    move-result v3

    .line 282
    const/16 v18, 0x1

    .line 283
    .line 284
    add-int/lit8 v3, v3, -0x1

    .line 285
    .line 286
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v3

    .line 290
    check-cast v3, Lp/d;

    .line 291
    .line 292
    iget-object v3, v3, Lp/d;->a:Lq/L0;

    .line 293
    .line 294
    iget-object v3, v3, Lq/F0;->c:Lq/t0;

    .line 295
    .line 296
    const/4 v7, 0x2

    .line 297
    new-array v9, v7, [I

    .line 298
    .line 299
    invoke-virtual {v3, v9}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 300
    .line 301
    .line 302
    new-instance v7, Landroid/graphics/Rect;

    .line 303
    .line 304
    invoke-direct {v7}, Landroid/graphics/Rect;-><init>()V

    .line 305
    .line 306
    .line 307
    iget-object v10, v0, Lp/e;->o:Landroid/view/View;

    .line 308
    .line 309
    invoke-virtual {v10, v7}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 310
    .line 311
    .line 312
    iget v10, v0, Lp/e;->p:I

    .line 313
    .line 314
    const/4 v12, 0x1

    .line 315
    if-ne v10, v12, :cond_f

    .line 316
    .line 317
    const/16 v17, 0x0

    .line 318
    .line 319
    aget v9, v9, v17

    .line 320
    .line 321
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 322
    .line 323
    .line 324
    move-result v3

    .line 325
    add-int/2addr v3, v9

    .line 326
    add-int/2addr v3, v6

    .line 327
    iget v7, v7, Landroid/graphics/Rect;->right:I

    .line 328
    .line 329
    if-le v3, v7, :cond_e

    .line 330
    .line 331
    move/from16 v3, v17

    .line 332
    .line 333
    :goto_a
    const/4 v9, 0x1

    .line 334
    goto :goto_c

    .line 335
    :cond_e
    :goto_b
    const/4 v3, 0x1

    .line 336
    goto :goto_a

    .line 337
    :cond_f
    const/16 v17, 0x0

    .line 338
    .line 339
    aget v3, v9, v17

    .line 340
    .line 341
    sub-int/2addr v3, v6

    .line 342
    if-gez v3, :cond_10

    .line 343
    .line 344
    goto :goto_b

    .line 345
    :cond_10
    const/4 v3, 0x0

    .line 346
    goto :goto_a

    .line 347
    :goto_c
    if-ne v3, v9, :cond_11

    .line 348
    .line 349
    const/4 v9, 0x1

    .line 350
    goto :goto_d

    .line 351
    :cond_11
    const/4 v9, 0x0

    .line 352
    :goto_d
    iput v3, v0, Lp/e;->p:I

    .line 353
    .line 354
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 355
    .line 356
    const/16 v7, 0x1a

    .line 357
    .line 358
    const/4 v10, 0x5

    .line 359
    if-lt v3, v7, :cond_12

    .line 360
    .line 361
    iput-object v2, v8, Lq/F0;->o:Landroid/view/View;

    .line 362
    .line 363
    const/4 v3, 0x0

    .line 364
    const/4 v7, 0x0

    .line 365
    goto :goto_e

    .line 366
    :cond_12
    const/4 v7, 0x2

    .line 367
    new-array v3, v7, [I

    .line 368
    .line 369
    iget-object v12, v0, Lp/e;->n:Landroid/view/View;

    .line 370
    .line 371
    invoke-virtual {v12, v3}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 372
    .line 373
    .line 374
    new-array v7, v7, [I

    .line 375
    .line 376
    invoke-virtual {v2, v7}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 377
    .line 378
    .line 379
    iget v12, v0, Lp/e;->m:I

    .line 380
    .line 381
    and-int/lit8 v12, v12, 0x7

    .line 382
    .line 383
    const/16 v17, 0x0

    .line 384
    .line 385
    if-ne v12, v10, :cond_13

    .line 386
    .line 387
    aget v12, v3, v17

    .line 388
    .line 389
    iget-object v13, v0, Lp/e;->n:Landroid/view/View;

    .line 390
    .line 391
    invoke-virtual {v13}, Landroid/view/View;->getWidth()I

    .line 392
    .line 393
    .line 394
    move-result v13

    .line 395
    add-int/2addr v13, v12

    .line 396
    aput v13, v3, v17

    .line 397
    .line 398
    aget v12, v7, v17

    .line 399
    .line 400
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 401
    .line 402
    .line 403
    move-result v13

    .line 404
    add-int/2addr v13, v12

    .line 405
    aput v13, v7, v17

    .line 406
    .line 407
    :cond_13
    aget v12, v7, v17

    .line 408
    .line 409
    aget v13, v3, v17

    .line 410
    .line 411
    sub-int/2addr v12, v13

    .line 412
    const/16 v18, 0x1

    .line 413
    .line 414
    aget v7, v7, v18

    .line 415
    .line 416
    aget v3, v3, v18

    .line 417
    .line 418
    sub-int/2addr v7, v3

    .line 419
    move v3, v7

    .line 420
    move v7, v12

    .line 421
    :goto_e
    iget v12, v0, Lp/e;->m:I

    .line 422
    .line 423
    and-int/2addr v12, v10

    .line 424
    if-ne v12, v10, :cond_15

    .line 425
    .line 426
    if-eqz v9, :cond_14

    .line 427
    .line 428
    add-int/2addr v7, v6

    .line 429
    goto :goto_f

    .line 430
    :cond_14
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 431
    .line 432
    .line 433
    move-result v2

    .line 434
    sub-int/2addr v7, v2

    .line 435
    goto :goto_f

    .line 436
    :cond_15
    if-eqz v9, :cond_16

    .line 437
    .line 438
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 439
    .line 440
    .line 441
    move-result v2

    .line 442
    add-int/2addr v7, v2

    .line 443
    goto :goto_f

    .line 444
    :cond_16
    sub-int/2addr v7, v6

    .line 445
    :goto_f
    iput v7, v8, Lq/F0;->f:I

    .line 446
    .line 447
    const/4 v9, 0x1

    .line 448
    iput-boolean v9, v8, Lq/F0;->k:Z

    .line 449
    .line 450
    iput-boolean v9, v8, Lq/F0;->j:Z

    .line 451
    .line 452
    invoke-virtual {v8, v3}, Lq/F0;->g(I)V

    .line 453
    .line 454
    .line 455
    goto :goto_11

    .line 456
    :cond_17
    iget-boolean v2, v0, Lp/e;->q:Z

    .line 457
    .line 458
    if-eqz v2, :cond_18

    .line 459
    .line 460
    iget v2, v0, Lp/e;->s:I

    .line 461
    .line 462
    iput v2, v8, Lq/F0;->f:I

    .line 463
    .line 464
    :cond_18
    iget-boolean v2, v0, Lp/e;->r:Z

    .line 465
    .line 466
    if-eqz v2, :cond_19

    .line 467
    .line 468
    iget v2, v0, Lp/e;->t:I

    .line 469
    .line 470
    invoke-virtual {v8, v2}, Lq/F0;->g(I)V

    .line 471
    .line 472
    .line 473
    :cond_19
    iget-object v2, v0, Lp/s;->a:Landroid/graphics/Rect;

    .line 474
    .line 475
    if-eqz v2, :cond_1a

    .line 476
    .line 477
    new-instance v7, Landroid/graphics/Rect;

    .line 478
    .line 479
    invoke-direct {v7, v2}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 480
    .line 481
    .line 482
    goto :goto_10

    .line 483
    :cond_1a
    const/4 v7, 0x0

    .line 484
    :goto_10
    iput-object v7, v8, Lq/F0;->x:Landroid/graphics/Rect;

    .line 485
    .line 486
    :goto_11
    new-instance v2, Lp/d;

    .line 487
    .line 488
    iget v3, v0, Lp/e;->p:I

    .line 489
    .line 490
    invoke-direct {v2, v8, v1, v3}, Lp/d;-><init>(Lq/L0;Lp/k;I)V

    .line 491
    .line 492
    .line 493
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 494
    .line 495
    .line 496
    invoke-virtual {v8}, Lq/F0;->show()V

    .line 497
    .line 498
    .line 499
    iget-object v2, v8, Lq/F0;->c:Lq/t0;

    .line 500
    .line 501
    invoke-virtual {v2, v0}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 502
    .line 503
    .line 504
    if-nez v11, :cond_1b

    .line 505
    .line 506
    iget-boolean v3, v0, Lp/e;->v:Z

    .line 507
    .line 508
    if-eqz v3, :cond_1b

    .line 509
    .line 510
    iget-object v3, v1, Lp/k;->m:Ljava/lang/CharSequence;

    .line 511
    .line 512
    if-eqz v3, :cond_1b

    .line 513
    .line 514
    const v3, 0x7f0d0012

    .line 515
    .line 516
    .line 517
    const/4 v7, 0x0

    .line 518
    invoke-virtual {v4, v3, v2, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 519
    .line 520
    .line 521
    move-result-object v3

    .line 522
    check-cast v3, Landroid/widget/FrameLayout;

    .line 523
    .line 524
    const v4, 0x1020016

    .line 525
    .line 526
    .line 527
    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 528
    .line 529
    .line 530
    move-result-object v4

    .line 531
    check-cast v4, Landroid/widget/TextView;

    .line 532
    .line 533
    invoke-virtual {v3, v7}, Landroid/view/View;->setEnabled(Z)V

    .line 534
    .line 535
    .line 536
    iget-object v1, v1, Lp/k;->m:Ljava/lang/CharSequence;

    .line 537
    .line 538
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 539
    .line 540
    .line 541
    const/4 v1, 0x0

    .line 542
    invoke-virtual {v2, v3, v1, v7}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;Ljava/lang/Object;Z)V

    .line 543
    .line 544
    .line 545
    invoke-virtual {v8}, Lq/F0;->show()V

    .line 546
    .line 547
    .line 548
    :cond_1b
    return-void
.end method
