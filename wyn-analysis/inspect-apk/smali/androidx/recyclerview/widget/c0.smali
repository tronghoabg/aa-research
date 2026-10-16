.class public final Landroidx/recyclerview/widget/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public b:Ljava/util/ArrayList;

.field public final c:Ljava/util/ArrayList;

.field public final d:Ljava/util/List;

.field public e:I

.field public f:I

.field public g:Landroidx/recyclerview/widget/b0;

.field public final synthetic h:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/recyclerview/widget/c0;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 5
    .line 6
    new-instance p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Landroidx/recyclerview/widget/c0;->a:Ljava/util/ArrayList;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, Landroidx/recyclerview/widget/c0;->b:Ljava/util/ArrayList;

    .line 15
    .line 16
    new-instance v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Landroidx/recyclerview/widget/c0;->c:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-static {p1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Landroidx/recyclerview/widget/c0;->d:Ljava/util/List;

    .line 28
    .line 29
    const/4 p1, 0x2

    .line 30
    iput p1, p0, Landroidx/recyclerview/widget/c0;->e:I

    .line 31
    .line 32
    iput p1, p0, Landroidx/recyclerview/widget/c0;->f:I

    .line 33
    .line 34
    return-void
.end method

.method public static d(Landroid/view/ViewGroup;Z)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    sub-int/2addr v0, v1

    .line 7
    :goto_0
    if-ltz v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    instance-of v3, v2, Landroid/view/ViewGroup;

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    check-cast v2, Landroid/view/ViewGroup;

    .line 18
    .line 19
    invoke-static {v2, v1}, Landroidx/recyclerview/widget/c0;->d(Landroid/view/ViewGroup;Z)V

    .line 20
    .line 21
    .line 22
    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    if-nez p1, :cond_2

    .line 26
    .line 27
    return-void

    .line 28
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    const/4 v0, 0x4

    .line 33
    if-ne p1, v0, :cond_3

    .line 34
    .line 35
    const/4 p1, 0x0

    .line 36
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 51
    .line 52
    .line 53
    return-void
.end method


# virtual methods
.method public final a(Landroidx/recyclerview/widget/m0;Z)V
    .locals 5

    .line 1
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->clearNestedRecyclerViewIfNotNested(Landroidx/recyclerview/widget/m0;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Landroidx/recyclerview/widget/m0;->itemView:Landroid/view/View;

    .line 5
    .line 6
    iget-object v1, p0, Landroidx/recyclerview/widget/c0;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 7
    .line 8
    iget-object v2, v1, Landroidx/recyclerview/widget/RecyclerView;->mAccessibilityDelegate:Landroidx/recyclerview/widget/o0;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    iget-object v2, v2, Landroidx/recyclerview/widget/o0;->e:Landroidx/recyclerview/widget/n0;

    .line 14
    .line 15
    instance-of v4, v2, Landroidx/recyclerview/widget/n0;

    .line 16
    .line 17
    if-eqz v4, :cond_0

    .line 18
    .line 19
    iget-object v2, v2, Landroidx/recyclerview/widget/n0;->e:Ljava/util/WeakHashMap;

    .line 20
    .line 21
    invoke-virtual {v2, v0}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Lk1/b;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move-object v2, v3

    .line 29
    :goto_0
    invoke-static {v0, v2}, Lk1/S;->m(Landroid/view/View;Lk1/b;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    if-eqz p2, :cond_4

    .line 33
    .line 34
    iget-object p2, v1, Landroidx/recyclerview/widget/RecyclerView;->mRecyclerListeners:Ljava/util/List;

    .line 35
    .line 36
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    if-gtz p2, :cond_3

    .line 41
    .line 42
    iget-object p2, v1, Landroidx/recyclerview/widget/RecyclerView;->mAdapter:Landroidx/recyclerview/widget/I;

    .line 43
    .line 44
    if-eqz p2, :cond_2

    .line 45
    .line 46
    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/I;->onViewRecycled(Landroidx/recyclerview/widget/m0;)V

    .line 47
    .line 48
    .line 49
    :cond_2
    iget-object p2, v1, Landroidx/recyclerview/widget/RecyclerView;->mState:Landroidx/recyclerview/widget/j0;

    .line 50
    .line 51
    if-eqz p2, :cond_4

    .line 52
    .line 53
    iget-object p2, v1, Landroidx/recyclerview/widget/RecyclerView;->mViewInfoStore:Landroidx/recyclerview/widget/A0;

    .line 54
    .line 55
    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/A0;->d(Landroidx/recyclerview/widget/m0;)V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    iget-object p1, v1, Landroidx/recyclerview/widget/RecyclerView;->mRecyclerListeners:Ljava/util/List;

    .line 60
    .line 61
    const/4 p2, 0x0

    .line 62
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    new-instance p1, Ljava/lang/ClassCastException;

    .line 70
    .line 71
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 72
    .line 73
    .line 74
    throw p1

    .line 75
    :cond_4
    :goto_1
    iput-object v3, p1, Landroidx/recyclerview/widget/m0;->mBindingAdapter:Landroidx/recyclerview/widget/I;

    .line 76
    .line 77
    iput-object v3, p1, Landroidx/recyclerview/widget/m0;->mOwnerRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    .line 78
    .line 79
    invoke-virtual {p0}, Landroidx/recyclerview/widget/c0;->c()Landroidx/recyclerview/widget/b0;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1}, Landroidx/recyclerview/widget/m0;->getItemViewType()I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/b0;->a(I)Landroidx/recyclerview/widget/a0;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    iget-object v1, v1, Landroidx/recyclerview/widget/a0;->a:Ljava/util/ArrayList;

    .line 95
    .line 96
    iget-object p2, p2, Landroidx/recyclerview/widget/b0;->a:Landroid/util/SparseArray;

    .line 97
    .line 98
    invoke-virtual {p2, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    check-cast p2, Landroidx/recyclerview/widget/a0;

    .line 103
    .line 104
    iget p2, p2, Landroidx/recyclerview/widget/a0;->b:I

    .line 105
    .line 106
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-gt p2, v0, :cond_5

    .line 111
    .line 112
    return-void

    .line 113
    :cond_5
    invoke-virtual {p1}, Landroidx/recyclerview/widget/m0;->resetInternal()V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    return-void
.end method

.method public final b(I)I
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/c0;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    if-ltz p1, :cond_1

    .line 4
    .line 5
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->mState:Landroidx/recyclerview/widget/j0;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroidx/recyclerview/widget/j0;->b()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-ge p1, v1, :cond_1

    .line 12
    .line 13
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->mState:Landroidx/recyclerview/widget/j0;

    .line 14
    .line 15
    iget-boolean v1, v1, Landroidx/recyclerview/widget/j0;->g:Z

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    return p1

    .line 20
    :cond_0
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->mAdapterHelper:Landroidx/recyclerview/widget/b;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-virtual {v0, p1, v1}, Landroidx/recyclerview/widget/b;->f(II)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    return p1

    .line 28
    :cond_1
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    .line 29
    .line 30
    const-string v2, "invalid position "

    .line 31
    .line 32
    const-string v3, ". State item count is "

    .line 33
    .line 34
    invoke-static {p1, v2, v3}, Lpd/f;->l(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->mState:Landroidx/recyclerview/widget/j0;

    .line 39
    .line 40
    invoke-virtual {v2}, Landroidx/recyclerview/widget/j0;->b()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->exceptionLabel()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-direct {v1, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw v1
.end method

.method public final c()Landroidx/recyclerview/widget/b0;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/c0;->g:Landroidx/recyclerview/widget/b0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/recyclerview/widget/b0;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v1, Landroid/util/SparseArray;

    .line 11
    .line 12
    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v1, v0, Landroidx/recyclerview/widget/b0;->a:Landroid/util/SparseArray;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput v1, v0, Landroidx/recyclerview/widget/b0;->b:I

    .line 19
    .line 20
    iput-object v0, p0, Landroidx/recyclerview/widget/c0;->g:Landroidx/recyclerview/widget/b0;

    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/c0;->g:Landroidx/recyclerview/widget/b0;

    .line 23
    .line 24
    return-object v0
.end method

.method public final e()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/c0;->c:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    add-int/lit8 v1, v1, -0x1

    .line 8
    .line 9
    :goto_0
    if-ltz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/c0;->f(I)V

    .line 12
    .line 13
    .line 14
    add-int/lit8 v1, v1, -0x1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 18
    .line 19
    .line 20
    sget-boolean v0, Landroidx/recyclerview/widget/RecyclerView;->ALLOW_THREAD_GAP_WORK:Z

    .line 21
    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    iget-object v0, p0, Landroidx/recyclerview/widget/c0;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 25
    .line 26
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->mPrefetchRegistry:Landroidx/recyclerview/widget/q;

    .line 27
    .line 28
    iget-object v1, v0, Landroidx/recyclerview/widget/q;->c:[I

    .line 29
    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    const/4 v2, -0x1

    .line 33
    invoke-static {v1, v2}, Ljava/util/Arrays;->fill([II)V

    .line 34
    .line 35
    .line 36
    :cond_1
    const/4 v1, 0x0

    .line 37
    iput v1, v0, Landroidx/recyclerview/widget/q;->d:I

    .line 38
    .line 39
    :cond_2
    return-void
.end method

.method public final f(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/c0;->c:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Landroidx/recyclerview/widget/m0;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-virtual {p0, v1, v2}, Landroidx/recyclerview/widget/c0;->a(Landroidx/recyclerview/widget/m0;Z)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final g(Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->getChildViewHolderInt(Landroid/view/View;)Landroidx/recyclerview/widget/m0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/recyclerview/widget/m0;->isTmpDetached()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-object v2, p0, Landroidx/recyclerview/widget/c0;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {v2, p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {v0}, Landroidx/recyclerview/widget/m0;->isScrap()Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    invoke-virtual {v0}, Landroidx/recyclerview/widget/m0;->unScrap()V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    invoke-virtual {v0}, Landroidx/recyclerview/widget/m0;->wasReturnedFromScrap()Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    invoke-virtual {v0}, Landroidx/recyclerview/widget/m0;->clearReturnedFromScrapFlag()V

    .line 34
    .line 35
    .line 36
    :cond_2
    :goto_0
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/c0;->h(Landroidx/recyclerview/widget/m0;)V

    .line 37
    .line 38
    .line 39
    iget-object p1, v2, Landroidx/recyclerview/widget/RecyclerView;->mItemAnimator:Landroidx/recyclerview/widget/P;

    .line 40
    .line 41
    if-eqz p1, :cond_3

    .line 42
    .line 43
    invoke-virtual {v0}, Landroidx/recyclerview/widget/m0;->isRecyclable()Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-nez p1, :cond_3

    .line 48
    .line 49
    iget-object p1, v2, Landroidx/recyclerview/widget/RecyclerView;->mItemAnimator:Landroidx/recyclerview/widget/P;

    .line 50
    .line 51
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/P;->d(Landroidx/recyclerview/widget/m0;)V

    .line 52
    .line 53
    .line 54
    :cond_3
    return-void
.end method

.method public final h(Landroidx/recyclerview/widget/m0;)V
    .locals 11

    .line 1
    invoke-virtual {p1}, Landroidx/recyclerview/widget/m0;->isScrap()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Landroidx/recyclerview/widget/c0;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    if-nez v0, :cond_e

    .line 10
    .line 11
    iget-object v0, p1, Landroidx/recyclerview/widget/m0;->itemView:Landroid/view/View;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    goto/16 :goto_8

    .line 20
    .line 21
    :cond_0
    invoke-virtual {p1}, Landroidx/recyclerview/widget/m0;->isTmpDetached()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_d

    .line 26
    .line 27
    invoke-virtual {p1}, Landroidx/recyclerview/widget/m0;->shouldIgnore()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_c

    .line 32
    .line 33
    invoke-virtual {p1}, Landroidx/recyclerview/widget/m0;->doesTransientStatePreventRecycling()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iget-object v4, v1, Landroidx/recyclerview/widget/RecyclerView;->mAdapter:Landroidx/recyclerview/widget/I;

    .line 38
    .line 39
    if-eqz v4, :cond_1

    .line 40
    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    invoke-virtual {v4, p1}, Landroidx/recyclerview/widget/I;->onFailedToRecycleView(Landroidx/recyclerview/widget/m0;)Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-eqz v4, :cond_1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    invoke-virtual {p1}, Landroidx/recyclerview/widget/m0;->isRecyclable()Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-eqz v4, :cond_a

    .line 55
    .line 56
    :goto_0
    iget v4, p0, Landroidx/recyclerview/widget/c0;->f:I

    .line 57
    .line 58
    if-lez v4, :cond_8

    .line 59
    .line 60
    const/16 v4, 0x20e

    .line 61
    .line 62
    invoke-virtual {p1, v4}, Landroidx/recyclerview/widget/m0;->hasAnyOfTheFlags(I)Z

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-nez v4, :cond_8

    .line 67
    .line 68
    iget-object v4, p0, Landroidx/recyclerview/widget/c0;->c:Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    iget v6, p0, Landroidx/recyclerview/widget/c0;->f:I

    .line 75
    .line 76
    if-lt v5, v6, :cond_2

    .line 77
    .line 78
    if-lez v5, :cond_2

    .line 79
    .line 80
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/c0;->f(I)V

    .line 81
    .line 82
    .line 83
    add-int/lit8 v5, v5, -0x1

    .line 84
    .line 85
    :cond_2
    sget-boolean v6, Landroidx/recyclerview/widget/RecyclerView;->ALLOW_THREAD_GAP_WORK:Z

    .line 86
    .line 87
    if-eqz v6, :cond_7

    .line 88
    .line 89
    if-lez v5, :cond_7

    .line 90
    .line 91
    iget-object v6, v1, Landroidx/recyclerview/widget/RecyclerView;->mPrefetchRegistry:Landroidx/recyclerview/widget/q;

    .line 92
    .line 93
    iget v7, p1, Landroidx/recyclerview/widget/m0;->mPosition:I

    .line 94
    .line 95
    iget-object v8, v6, Landroidx/recyclerview/widget/q;->c:[I

    .line 96
    .line 97
    if-eqz v8, :cond_4

    .line 98
    .line 99
    iget v8, v6, Landroidx/recyclerview/widget/q;->d:I

    .line 100
    .line 101
    mul-int/lit8 v8, v8, 0x2

    .line 102
    .line 103
    move v9, v2

    .line 104
    :goto_1
    if-ge v9, v8, :cond_4

    .line 105
    .line 106
    iget-object v10, v6, Landroidx/recyclerview/widget/q;->c:[I

    .line 107
    .line 108
    aget v10, v10, v9

    .line 109
    .line 110
    if-ne v10, v7, :cond_3

    .line 111
    .line 112
    goto :goto_4

    .line 113
    :cond_3
    add-int/lit8 v9, v9, 0x2

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_4
    add-int/lit8 v5, v5, -0x1

    .line 117
    .line 118
    :goto_2
    if-ltz v5, :cond_6

    .line 119
    .line 120
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v6

    .line 124
    check-cast v6, Landroidx/recyclerview/widget/m0;

    .line 125
    .line 126
    iget v6, v6, Landroidx/recyclerview/widget/m0;->mPosition:I

    .line 127
    .line 128
    iget-object v7, v1, Landroidx/recyclerview/widget/RecyclerView;->mPrefetchRegistry:Landroidx/recyclerview/widget/q;

    .line 129
    .line 130
    iget-object v8, v7, Landroidx/recyclerview/widget/q;->c:[I

    .line 131
    .line 132
    if-eqz v8, :cond_6

    .line 133
    .line 134
    iget v8, v7, Landroidx/recyclerview/widget/q;->d:I

    .line 135
    .line 136
    mul-int/lit8 v8, v8, 0x2

    .line 137
    .line 138
    move v9, v2

    .line 139
    :goto_3
    if-ge v9, v8, :cond_6

    .line 140
    .line 141
    iget-object v10, v7, Landroidx/recyclerview/widget/q;->c:[I

    .line 142
    .line 143
    aget v10, v10, v9

    .line 144
    .line 145
    if-ne v10, v6, :cond_5

    .line 146
    .line 147
    add-int/lit8 v5, v5, -0x1

    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_5
    add-int/lit8 v9, v9, 0x2

    .line 151
    .line 152
    goto :goto_3

    .line 153
    :cond_6
    add-int/2addr v5, v3

    .line 154
    :cond_7
    :goto_4
    invoke-virtual {v4, v5, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    move v4, v3

    .line 158
    goto :goto_5

    .line 159
    :cond_8
    move v4, v2

    .line 160
    :goto_5
    if-nez v4, :cond_9

    .line 161
    .line 162
    invoke-virtual {p0, p1, v3}, Landroidx/recyclerview/widget/c0;->a(Landroidx/recyclerview/widget/m0;Z)V

    .line 163
    .line 164
    .line 165
    :goto_6
    move v2, v4

    .line 166
    goto :goto_7

    .line 167
    :cond_9
    move v3, v2

    .line 168
    goto :goto_6

    .line 169
    :cond_a
    move v3, v2

    .line 170
    :goto_7
    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView;->mViewInfoStore:Landroidx/recyclerview/widget/A0;

    .line 171
    .line 172
    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/A0;->d(Landroidx/recyclerview/widget/m0;)V

    .line 173
    .line 174
    .line 175
    if-nez v2, :cond_b

    .line 176
    .line 177
    if-nez v3, :cond_b

    .line 178
    .line 179
    if-eqz v0, :cond_b

    .line 180
    .line 181
    const/4 v0, 0x0

    .line 182
    iput-object v0, p1, Landroidx/recyclerview/widget/m0;->mBindingAdapter:Landroidx/recyclerview/widget/I;

    .line 183
    .line 184
    iput-object v0, p1, Landroidx/recyclerview/widget/m0;->mOwnerRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    .line 185
    .line 186
    :cond_b
    return-void

    .line 187
    :cond_c
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 188
    .line 189
    new-instance v0, Ljava/lang/StringBuilder;

    .line 190
    .line 191
    const-string v2, "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle."

    .line 192
    .line 193
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    invoke-static {v1, v0}, LVa/M6;->m(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    throw p1

    .line 204
    :cond_d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 205
    .line 206
    new-instance v2, Ljava/lang/StringBuilder;

    .line 207
    .line 208
    const-string v3, "Tmp detached view should be removed from RecyclerView before it can be recycled: "

    .line 209
    .line 210
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    invoke-static {v1, v2}, LVa/M6;->m(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    throw v0

    .line 224
    :cond_e
    :goto_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 225
    .line 226
    new-instance v4, Ljava/lang/StringBuilder;

    .line 227
    .line 228
    const-string v5, "Scrapped or attached views may not be recycled. isScrap:"

    .line 229
    .line 230
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {p1}, Landroidx/recyclerview/widget/m0;->isScrap()Z

    .line 234
    .line 235
    .line 236
    move-result v5

    .line 237
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    const-string v5, " isAttached:"

    .line 241
    .line 242
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    iget-object p1, p1, Landroidx/recyclerview/widget/m0;->itemView:Landroid/view/View;

    .line 246
    .line 247
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    if-eqz p1, :cond_f

    .line 252
    .line 253
    move v2, v3

    .line 254
    :cond_f
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->exceptionLabel()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object p1

    .line 261
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object p1

    .line 268
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    throw v0
.end method

.method public final i(Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->getChildViewHolderInt(Landroid/view/View;)Landroidx/recyclerview/widget/m0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/16 v0, 0xc

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/m0;->hasAnyOfTheFlags(I)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget-object v1, p0, Landroidx/recyclerview/widget/c0;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 12
    .line 13
    if-nez v0, :cond_2

    .line 14
    .line 15
    invoke-virtual {p1}, Landroidx/recyclerview/widget/m0;->isUpdated()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/RecyclerView;->canReuseUpdatedViewHolder(Landroidx/recyclerview/widget/m0;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/c0;->b:Ljava/util/ArrayList;

    .line 29
    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    new-instance v0, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, Landroidx/recyclerview/widget/c0;->b:Ljava/util/ArrayList;

    .line 38
    .line 39
    :cond_1
    const/4 v0, 0x1

    .line 40
    invoke-virtual {p1, p0, v0}, Landroidx/recyclerview/widget/m0;->setScrapContainer(Landroidx/recyclerview/widget/c0;Z)V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Landroidx/recyclerview/widget/c0;->b:Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_2
    :goto_0
    invoke-virtual {p1}, Landroidx/recyclerview/widget/m0;->isInvalid()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_4

    .line 54
    .line 55
    invoke-virtual {p1}, Landroidx/recyclerview/widget/m0;->isRemoved()Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-nez v0, :cond_4

    .line 60
    .line 61
    iget-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->mAdapter:Landroidx/recyclerview/widget/I;

    .line 62
    .line 63
    invoke-virtual {v0}, Landroidx/recyclerview/widget/I;->hasStableIds()Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_3

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 71
    .line 72
    new-instance v0, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    const-string v2, "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."

    .line 75
    .line 76
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-static {v1, v0}, LVa/M6;->m(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw p1

    .line 87
    :cond_4
    :goto_1
    const/4 v0, 0x0

    .line 88
    invoke-virtual {p1, p0, v0}, Landroidx/recyclerview/widget/m0;->setScrapContainer(Landroidx/recyclerview/widget/c0;Z)V

    .line 89
    .line 90
    .line 91
    iget-object v0, p0, Landroidx/recyclerview/widget/c0;->a:Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    return-void
.end method

.method public final j(IJ)Landroidx/recyclerview/widget/m0;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v4, v0, Landroidx/recyclerview/widget/c0;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    .line 9
    if-ltz v1, :cond_41

    .line 10
    .line 11
    iget-object v5, v4, Landroidx/recyclerview/widget/RecyclerView;->mState:Landroidx/recyclerview/widget/j0;

    .line 12
    .line 13
    invoke-virtual {v5}, Landroidx/recyclerview/widget/j0;->b()I

    .line 14
    .line 15
    .line 16
    move-result v5

    .line 17
    if-ge v1, v5, :cond_41

    .line 18
    .line 19
    iget-object v5, v4, Landroidx/recyclerview/widget/RecyclerView;->mState:Landroidx/recyclerview/widget/j0;

    .line 20
    .line 21
    iget-boolean v5, v5, Landroidx/recyclerview/widget/j0;->g:Z

    .line 22
    .line 23
    const/4 v6, 0x0

    .line 24
    const/4 v7, 0x0

    .line 25
    const/16 v8, 0x20

    .line 26
    .line 27
    if-eqz v5, :cond_6

    .line 28
    .line 29
    iget-object v5, v0, Landroidx/recyclerview/widget/c0;->b:Ljava/util/ArrayList;

    .line 30
    .line 31
    if-eqz v5, :cond_4

    .line 32
    .line 33
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-nez v5, :cond_0

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_0
    move v9, v6

    .line 41
    :goto_0
    if-ge v9, v5, :cond_2

    .line 42
    .line 43
    iget-object v10, v0, Landroidx/recyclerview/widget/c0;->b:Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v10

    .line 49
    check-cast v10, Landroidx/recyclerview/widget/m0;

    .line 50
    .line 51
    invoke-virtual {v10}, Landroidx/recyclerview/widget/m0;->wasReturnedFromScrap()Z

    .line 52
    .line 53
    .line 54
    move-result v11

    .line 55
    if-nez v11, :cond_1

    .line 56
    .line 57
    invoke-virtual {v10}, Landroidx/recyclerview/widget/m0;->getLayoutPosition()I

    .line 58
    .line 59
    .line 60
    move-result v11

    .line 61
    if-ne v11, v1, :cond_1

    .line 62
    .line 63
    invoke-virtual {v10, v8}, Landroidx/recyclerview/widget/m0;->addFlags(I)V

    .line 64
    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_1
    add-int/2addr v9, v3

    .line 68
    goto :goto_0

    .line 69
    :cond_2
    iget-object v9, v4, Landroidx/recyclerview/widget/RecyclerView;->mAdapter:Landroidx/recyclerview/widget/I;

    .line 70
    .line 71
    invoke-virtual {v9}, Landroidx/recyclerview/widget/I;->hasStableIds()Z

    .line 72
    .line 73
    .line 74
    move-result v9

    .line 75
    if-eqz v9, :cond_4

    .line 76
    .line 77
    iget-object v9, v4, Landroidx/recyclerview/widget/RecyclerView;->mAdapterHelper:Landroidx/recyclerview/widget/b;

    .line 78
    .line 79
    invoke-virtual {v9, v1, v6}, Landroidx/recyclerview/widget/b;->f(II)I

    .line 80
    .line 81
    .line 82
    move-result v9

    .line 83
    if-lez v9, :cond_4

    .line 84
    .line 85
    iget-object v10, v4, Landroidx/recyclerview/widget/RecyclerView;->mAdapter:Landroidx/recyclerview/widget/I;

    .line 86
    .line 87
    invoke-virtual {v10}, Landroidx/recyclerview/widget/I;->getItemCount()I

    .line 88
    .line 89
    .line 90
    move-result v10

    .line 91
    if-ge v9, v10, :cond_4

    .line 92
    .line 93
    iget-object v10, v4, Landroidx/recyclerview/widget/RecyclerView;->mAdapter:Landroidx/recyclerview/widget/I;

    .line 94
    .line 95
    invoke-virtual {v10, v9}, Landroidx/recyclerview/widget/I;->getItemId(I)J

    .line 96
    .line 97
    .line 98
    move-result-wide v9

    .line 99
    move v11, v6

    .line 100
    :goto_1
    if-ge v11, v5, :cond_4

    .line 101
    .line 102
    iget-object v12, v0, Landroidx/recyclerview/widget/c0;->b:Ljava/util/ArrayList;

    .line 103
    .line 104
    invoke-virtual {v12, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v12

    .line 108
    check-cast v12, Landroidx/recyclerview/widget/m0;

    .line 109
    .line 110
    invoke-virtual {v12}, Landroidx/recyclerview/widget/m0;->wasReturnedFromScrap()Z

    .line 111
    .line 112
    .line 113
    move-result v13

    .line 114
    if-nez v13, :cond_3

    .line 115
    .line 116
    invoke-virtual {v12}, Landroidx/recyclerview/widget/m0;->getItemId()J

    .line 117
    .line 118
    .line 119
    move-result-wide v13

    .line 120
    cmp-long v13, v13, v9

    .line 121
    .line 122
    if-nez v13, :cond_3

    .line 123
    .line 124
    invoke-virtual {v12, v8}, Landroidx/recyclerview/widget/m0;->addFlags(I)V

    .line 125
    .line 126
    .line 127
    move-object v10, v12

    .line 128
    goto :goto_3

    .line 129
    :cond_3
    add-int/2addr v11, v3

    .line 130
    goto :goto_1

    .line 131
    :cond_4
    :goto_2
    move-object v10, v7

    .line 132
    :goto_3
    if-eqz v10, :cond_5

    .line 133
    .line 134
    move v5, v3

    .line 135
    goto :goto_4

    .line 136
    :cond_5
    move v5, v6

    .line 137
    goto :goto_4

    .line 138
    :cond_6
    move v5, v6

    .line 139
    move-object v10, v7

    .line 140
    :goto_4
    iget-object v9, v0, Landroidx/recyclerview/widget/c0;->c:Ljava/util/ArrayList;

    .line 141
    .line 142
    iget-object v11, v0, Landroidx/recyclerview/widget/c0;->a:Ljava/util/ArrayList;

    .line 143
    .line 144
    if-nez v10, :cond_1a

    .line 145
    .line 146
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 147
    .line 148
    .line 149
    move-result v10

    .line 150
    move v12, v6

    .line 151
    :goto_5
    if-ge v12, v10, :cond_9

    .line 152
    .line 153
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v13

    .line 157
    check-cast v13, Landroidx/recyclerview/widget/m0;

    .line 158
    .line 159
    invoke-virtual {v13}, Landroidx/recyclerview/widget/m0;->wasReturnedFromScrap()Z

    .line 160
    .line 161
    .line 162
    move-result v14

    .line 163
    if-nez v14, :cond_8

    .line 164
    .line 165
    invoke-virtual {v13}, Landroidx/recyclerview/widget/m0;->getLayoutPosition()I

    .line 166
    .line 167
    .line 168
    move-result v14

    .line 169
    if-ne v14, v1, :cond_8

    .line 170
    .line 171
    invoke-virtual {v13}, Landroidx/recyclerview/widget/m0;->isInvalid()Z

    .line 172
    .line 173
    .line 174
    move-result v14

    .line 175
    if-nez v14, :cond_8

    .line 176
    .line 177
    iget-object v14, v4, Landroidx/recyclerview/widget/RecyclerView;->mState:Landroidx/recyclerview/widget/j0;

    .line 178
    .line 179
    iget-boolean v14, v14, Landroidx/recyclerview/widget/j0;->g:Z

    .line 180
    .line 181
    if-nez v14, :cond_7

    .line 182
    .line 183
    invoke-virtual {v13}, Landroidx/recyclerview/widget/m0;->isRemoved()Z

    .line 184
    .line 185
    .line 186
    move-result v14

    .line 187
    if-nez v14, :cond_8

    .line 188
    .line 189
    :cond_7
    invoke-virtual {v13, v8}, Landroidx/recyclerview/widget/m0;->addFlags(I)V

    .line 190
    .line 191
    .line 192
    move/from16 v16, v3

    .line 193
    .line 194
    move-object v10, v13

    .line 195
    goto/16 :goto_9

    .line 196
    .line 197
    :cond_8
    add-int/2addr v12, v3

    .line 198
    goto :goto_5

    .line 199
    :cond_9
    iget-object v10, v4, Landroidx/recyclerview/widget/RecyclerView;->mChildHelper:Landroidx/recyclerview/widget/c;

    .line 200
    .line 201
    iget-object v10, v10, Landroidx/recyclerview/widget/c;->c:Ljava/util/ArrayList;

    .line 202
    .line 203
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 204
    .line 205
    .line 206
    move-result v12

    .line 207
    move v13, v6

    .line 208
    :goto_6
    if-ge v13, v12, :cond_b

    .line 209
    .line 210
    invoke-virtual {v10, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v14

    .line 214
    check-cast v14, Landroid/view/View;

    .line 215
    .line 216
    invoke-static {v14}, Landroidx/recyclerview/widget/RecyclerView;->getChildViewHolderInt(Landroid/view/View;)Landroidx/recyclerview/widget/m0;

    .line 217
    .line 218
    .line 219
    move-result-object v15

    .line 220
    move/from16 v16, v3

    .line 221
    .line 222
    invoke-virtual {v15}, Landroidx/recyclerview/widget/m0;->getLayoutPosition()I

    .line 223
    .line 224
    .line 225
    move-result v3

    .line 226
    if-ne v3, v1, :cond_a

    .line 227
    .line 228
    invoke-virtual {v15}, Landroidx/recyclerview/widget/m0;->isInvalid()Z

    .line 229
    .line 230
    .line 231
    move-result v3

    .line 232
    if-nez v3, :cond_a

    .line 233
    .line 234
    invoke-virtual {v15}, Landroidx/recyclerview/widget/m0;->isRemoved()Z

    .line 235
    .line 236
    .line 237
    move-result v3

    .line 238
    if-nez v3, :cond_a

    .line 239
    .line 240
    goto :goto_7

    .line 241
    :cond_a
    add-int/lit8 v13, v13, 0x1

    .line 242
    .line 243
    move/from16 v3, v16

    .line 244
    .line 245
    goto :goto_6

    .line 246
    :cond_b
    move/from16 v16, v3

    .line 247
    .line 248
    move-object v14, v7

    .line 249
    :goto_7
    if-eqz v14, :cond_f

    .line 250
    .line 251
    invoke-static {v14}, Landroidx/recyclerview/widget/RecyclerView;->getChildViewHolderInt(Landroid/view/View;)Landroidx/recyclerview/widget/m0;

    .line 252
    .line 253
    .line 254
    move-result-object v3

    .line 255
    iget-object v10, v4, Landroidx/recyclerview/widget/RecyclerView;->mChildHelper:Landroidx/recyclerview/widget/c;

    .line 256
    .line 257
    iget-object v12, v10, Landroidx/recyclerview/widget/c;->a:Landroidx/recyclerview/widget/G;

    .line 258
    .line 259
    iget-object v12, v12, Landroidx/recyclerview/widget/G;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 260
    .line 261
    invoke-virtual {v12, v14}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 262
    .line 263
    .line 264
    move-result v12

    .line 265
    if-ltz v12, :cond_e

    .line 266
    .line 267
    iget-object v13, v10, Landroidx/recyclerview/widget/c;->b:LA2/d;

    .line 268
    .line 269
    invoke-virtual {v13, v12}, LA2/d;->J(I)Z

    .line 270
    .line 271
    .line 272
    move-result v15

    .line 273
    if-eqz v15, :cond_d

    .line 274
    .line 275
    invoke-virtual {v13, v12}, LA2/d;->G(I)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v10, v14}, Landroidx/recyclerview/widget/c;->l(Landroid/view/View;)V

    .line 279
    .line 280
    .line 281
    iget-object v10, v4, Landroidx/recyclerview/widget/RecyclerView;->mChildHelper:Landroidx/recyclerview/widget/c;

    .line 282
    .line 283
    invoke-virtual {v10, v14}, Landroidx/recyclerview/widget/c;->j(Landroid/view/View;)I

    .line 284
    .line 285
    .line 286
    move-result v10

    .line 287
    if-eq v10, v2, :cond_c

    .line 288
    .line 289
    iget-object v12, v4, Landroidx/recyclerview/widget/RecyclerView;->mChildHelper:Landroidx/recyclerview/widget/c;

    .line 290
    .line 291
    invoke-virtual {v12, v10}, Landroidx/recyclerview/widget/c;->c(I)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v0, v14}, Landroidx/recyclerview/widget/c0;->i(Landroid/view/View;)V

    .line 295
    .line 296
    .line 297
    const/16 v10, 0x2020

    .line 298
    .line 299
    invoke-virtual {v3, v10}, Landroidx/recyclerview/widget/m0;->addFlags(I)V

    .line 300
    .line 301
    .line 302
    move-object v10, v3

    .line 303
    goto :goto_9

    .line 304
    :cond_c
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 305
    .line 306
    new-instance v2, Ljava/lang/StringBuilder;

    .line 307
    .line 308
    const-string v5, "layout index should not be -1 after unhiding a view:"

    .line 309
    .line 310
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 314
    .line 315
    .line 316
    invoke-static {v4, v2}, LVa/M6;->m(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v2

    .line 320
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 321
    .line 322
    .line 323
    throw v1

    .line 324
    :cond_d
    new-instance v1, Ljava/lang/RuntimeException;

    .line 325
    .line 326
    new-instance v2, Ljava/lang/StringBuilder;

    .line 327
    .line 328
    const-string v3, "trying to unhide a view that was not hidden"

    .line 329
    .line 330
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v2

    .line 340
    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    throw v1

    .line 344
    :cond_e
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 345
    .line 346
    new-instance v2, Ljava/lang/StringBuilder;

    .line 347
    .line 348
    const-string v3, "view is not a child, cannot hide "

    .line 349
    .line 350
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 354
    .line 355
    .line 356
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v2

    .line 360
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 361
    .line 362
    .line 363
    throw v1

    .line 364
    :cond_f
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 365
    .line 366
    .line 367
    move-result v3

    .line 368
    move v10, v6

    .line 369
    :goto_8
    if-ge v10, v3, :cond_11

    .line 370
    .line 371
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v12

    .line 375
    check-cast v12, Landroidx/recyclerview/widget/m0;

    .line 376
    .line 377
    invoke-virtual {v12}, Landroidx/recyclerview/widget/m0;->isInvalid()Z

    .line 378
    .line 379
    .line 380
    move-result v13

    .line 381
    if-nez v13, :cond_10

    .line 382
    .line 383
    invoke-virtual {v12}, Landroidx/recyclerview/widget/m0;->getLayoutPosition()I

    .line 384
    .line 385
    .line 386
    move-result v13

    .line 387
    if-ne v13, v1, :cond_10

    .line 388
    .line 389
    invoke-virtual {v12}, Landroidx/recyclerview/widget/m0;->isAttachedToTransitionOverlay()Z

    .line 390
    .line 391
    .line 392
    move-result v13

    .line 393
    if-nez v13, :cond_10

    .line 394
    .line 395
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-object v10, v12

    .line 399
    goto :goto_9

    .line 400
    :cond_10
    add-int/lit8 v10, v10, 0x1

    .line 401
    .line 402
    goto :goto_8

    .line 403
    :cond_11
    move-object v10, v7

    .line 404
    :goto_9
    if-eqz v10, :cond_1b

    .line 405
    .line 406
    invoke-virtual {v10}, Landroidx/recyclerview/widget/m0;->isRemoved()Z

    .line 407
    .line 408
    .line 409
    move-result v3

    .line 410
    if-eqz v3, :cond_12

    .line 411
    .line 412
    iget-object v3, v4, Landroidx/recyclerview/widget/RecyclerView;->mState:Landroidx/recyclerview/widget/j0;

    .line 413
    .line 414
    iget-boolean v3, v3, Landroidx/recyclerview/widget/j0;->g:Z

    .line 415
    .line 416
    goto :goto_a

    .line 417
    :cond_12
    iget v3, v10, Landroidx/recyclerview/widget/m0;->mPosition:I

    .line 418
    .line 419
    if-ltz v3, :cond_19

    .line 420
    .line 421
    iget-object v12, v4, Landroidx/recyclerview/widget/RecyclerView;->mAdapter:Landroidx/recyclerview/widget/I;

    .line 422
    .line 423
    invoke-virtual {v12}, Landroidx/recyclerview/widget/I;->getItemCount()I

    .line 424
    .line 425
    .line 426
    move-result v12

    .line 427
    if-ge v3, v12, :cond_19

    .line 428
    .line 429
    iget-object v3, v4, Landroidx/recyclerview/widget/RecyclerView;->mState:Landroidx/recyclerview/widget/j0;

    .line 430
    .line 431
    iget-boolean v3, v3, Landroidx/recyclerview/widget/j0;->g:Z

    .line 432
    .line 433
    if-nez v3, :cond_14

    .line 434
    .line 435
    iget-object v3, v4, Landroidx/recyclerview/widget/RecyclerView;->mAdapter:Landroidx/recyclerview/widget/I;

    .line 436
    .line 437
    iget v12, v10, Landroidx/recyclerview/widget/m0;->mPosition:I

    .line 438
    .line 439
    invoke-virtual {v3, v12}, Landroidx/recyclerview/widget/I;->getItemViewType(I)I

    .line 440
    .line 441
    .line 442
    move-result v3

    .line 443
    invoke-virtual {v10}, Landroidx/recyclerview/widget/m0;->getItemViewType()I

    .line 444
    .line 445
    .line 446
    move-result v12

    .line 447
    if-eq v3, v12, :cond_14

    .line 448
    .line 449
    :cond_13
    move v3, v6

    .line 450
    goto :goto_a

    .line 451
    :cond_14
    iget-object v3, v4, Landroidx/recyclerview/widget/RecyclerView;->mAdapter:Landroidx/recyclerview/widget/I;

    .line 452
    .line 453
    invoke-virtual {v3}, Landroidx/recyclerview/widget/I;->hasStableIds()Z

    .line 454
    .line 455
    .line 456
    move-result v3

    .line 457
    if-eqz v3, :cond_15

    .line 458
    .line 459
    invoke-virtual {v10}, Landroidx/recyclerview/widget/m0;->getItemId()J

    .line 460
    .line 461
    .line 462
    move-result-wide v12

    .line 463
    iget-object v3, v4, Landroidx/recyclerview/widget/RecyclerView;->mAdapter:Landroidx/recyclerview/widget/I;

    .line 464
    .line 465
    iget v14, v10, Landroidx/recyclerview/widget/m0;->mPosition:I

    .line 466
    .line 467
    invoke-virtual {v3, v14}, Landroidx/recyclerview/widget/I;->getItemId(I)J

    .line 468
    .line 469
    .line 470
    move-result-wide v14

    .line 471
    cmp-long v3, v12, v14

    .line 472
    .line 473
    if-nez v3, :cond_13

    .line 474
    .line 475
    :cond_15
    move/from16 v3, v16

    .line 476
    .line 477
    :goto_a
    if-nez v3, :cond_18

    .line 478
    .line 479
    const/4 v3, 0x4

    .line 480
    invoke-virtual {v10, v3}, Landroidx/recyclerview/widget/m0;->addFlags(I)V

    .line 481
    .line 482
    .line 483
    invoke-virtual {v10}, Landroidx/recyclerview/widget/m0;->isScrap()Z

    .line 484
    .line 485
    .line 486
    move-result v3

    .line 487
    if-eqz v3, :cond_16

    .line 488
    .line 489
    iget-object v3, v10, Landroidx/recyclerview/widget/m0;->itemView:Landroid/view/View;

    .line 490
    .line 491
    invoke-virtual {v4, v3, v6}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 492
    .line 493
    .line 494
    invoke-virtual {v10}, Landroidx/recyclerview/widget/m0;->unScrap()V

    .line 495
    .line 496
    .line 497
    goto :goto_b

    .line 498
    :cond_16
    invoke-virtual {v10}, Landroidx/recyclerview/widget/m0;->wasReturnedFromScrap()Z

    .line 499
    .line 500
    .line 501
    move-result v3

    .line 502
    if-eqz v3, :cond_17

    .line 503
    .line 504
    invoke-virtual {v10}, Landroidx/recyclerview/widget/m0;->clearReturnedFromScrapFlag()V

    .line 505
    .line 506
    .line 507
    :cond_17
    :goto_b
    invoke-virtual {v0, v10}, Landroidx/recyclerview/widget/c0;->h(Landroidx/recyclerview/widget/m0;)V

    .line 508
    .line 509
    .line 510
    move-object v10, v7

    .line 511
    goto :goto_c

    .line 512
    :cond_18
    move/from16 v5, v16

    .line 513
    .line 514
    goto :goto_c

    .line 515
    :cond_19
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    .line 516
    .line 517
    new-instance v2, Ljava/lang/StringBuilder;

    .line 518
    .line 519
    const-string v3, "Inconsistency detected. Invalid view holder adapter position"

    .line 520
    .line 521
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 522
    .line 523
    .line 524
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 525
    .line 526
    .line 527
    invoke-static {v4, v2}, LVa/M6;->m(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 528
    .line 529
    .line 530
    move-result-object v2

    .line 531
    invoke-direct {v1, v2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 532
    .line 533
    .line 534
    throw v1

    .line 535
    :cond_1a
    move/from16 v16, v3

    .line 536
    .line 537
    :cond_1b
    :goto_c
    const-wide/16 v17, 0x0

    .line 538
    .line 539
    const-wide v19, 0x7fffffffffffffffL

    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    if-nez v10, :cond_2f

    .line 545
    .line 546
    iget-object v3, v4, Landroidx/recyclerview/widget/RecyclerView;->mAdapterHelper:Landroidx/recyclerview/widget/b;

    .line 547
    .line 548
    invoke-virtual {v3, v1, v6}, Landroidx/recyclerview/widget/b;->f(II)I

    .line 549
    .line 550
    .line 551
    move-result v3

    .line 552
    if-ltz v3, :cond_2e

    .line 553
    .line 554
    move/from16 v21, v2

    .line 555
    .line 556
    iget-object v2, v4, Landroidx/recyclerview/widget/RecyclerView;->mAdapter:Landroidx/recyclerview/widget/I;

    .line 557
    .line 558
    invoke-virtual {v2}, Landroidx/recyclerview/widget/I;->getItemCount()I

    .line 559
    .line 560
    .line 561
    move-result v2

    .line 562
    if-ge v3, v2, :cond_2e

    .line 563
    .line 564
    iget-object v2, v4, Landroidx/recyclerview/widget/RecyclerView;->mAdapter:Landroidx/recyclerview/widget/I;

    .line 565
    .line 566
    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/I;->getItemViewType(I)I

    .line 567
    .line 568
    .line 569
    move-result v2

    .line 570
    const-wide/16 v22, 0x3

    .line 571
    .line 572
    iget-object v12, v4, Landroidx/recyclerview/widget/RecyclerView;->mAdapter:Landroidx/recyclerview/widget/I;

    .line 573
    .line 574
    invoke-virtual {v12}, Landroidx/recyclerview/widget/I;->hasStableIds()Z

    .line 575
    .line 576
    .line 577
    move-result v12

    .line 578
    if-eqz v12, :cond_23

    .line 579
    .line 580
    iget-object v10, v4, Landroidx/recyclerview/widget/RecyclerView;->mAdapter:Landroidx/recyclerview/widget/I;

    .line 581
    .line 582
    invoke-virtual {v10, v3}, Landroidx/recyclerview/widget/I;->getItemId(I)J

    .line 583
    .line 584
    .line 585
    move-result-wide v12

    .line 586
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 587
    .line 588
    .line 589
    move-result v10

    .line 590
    add-int/lit8 v10, v10, -0x1

    .line 591
    .line 592
    :goto_d
    if-ltz v10, :cond_1f

    .line 593
    .line 594
    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 595
    .line 596
    .line 597
    move-result-object v24

    .line 598
    const-wide/16 v25, 0x4

    .line 599
    .line 600
    move-object/from16 v14, v24

    .line 601
    .line 602
    check-cast v14, Landroidx/recyclerview/widget/m0;

    .line 603
    .line 604
    invoke-virtual {v14}, Landroidx/recyclerview/widget/m0;->getItemId()J

    .line 605
    .line 606
    .line 607
    move-result-wide v27

    .line 608
    cmp-long v15, v27, v12

    .line 609
    .line 610
    if-nez v15, :cond_1e

    .line 611
    .line 612
    invoke-virtual {v14}, Landroidx/recyclerview/widget/m0;->wasReturnedFromScrap()Z

    .line 613
    .line 614
    .line 615
    move-result v15

    .line 616
    if-nez v15, :cond_1e

    .line 617
    .line 618
    invoke-virtual {v14}, Landroidx/recyclerview/widget/m0;->getItemViewType()I

    .line 619
    .line 620
    .line 621
    move-result v15

    .line 622
    if-ne v2, v15, :cond_1d

    .line 623
    .line 624
    invoke-virtual {v14, v8}, Landroidx/recyclerview/widget/m0;->addFlags(I)V

    .line 625
    .line 626
    .line 627
    invoke-virtual {v14}, Landroidx/recyclerview/widget/m0;->isRemoved()Z

    .line 628
    .line 629
    .line 630
    move-result v8

    .line 631
    if-eqz v8, :cond_1c

    .line 632
    .line 633
    iget-object v8, v4, Landroidx/recyclerview/widget/RecyclerView;->mState:Landroidx/recyclerview/widget/j0;

    .line 634
    .line 635
    iget-boolean v8, v8, Landroidx/recyclerview/widget/j0;->g:Z

    .line 636
    .line 637
    if-nez v8, :cond_1c

    .line 638
    .line 639
    const/4 v8, 0x2

    .line 640
    const/16 v9, 0xe

    .line 641
    .line 642
    invoke-virtual {v14, v8, v9}, Landroidx/recyclerview/widget/m0;->setFlags(II)V

    .line 643
    .line 644
    .line 645
    :cond_1c
    move-object v10, v14

    .line 646
    goto :goto_f

    .line 647
    :cond_1d
    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 648
    .line 649
    .line 650
    iget-object v15, v14, Landroidx/recyclerview/widget/m0;->itemView:Landroid/view/View;

    .line 651
    .line 652
    invoke-virtual {v4, v15, v6}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 653
    .line 654
    .line 655
    iget-object v14, v14, Landroidx/recyclerview/widget/m0;->itemView:Landroid/view/View;

    .line 656
    .line 657
    invoke-static {v14}, Landroidx/recyclerview/widget/RecyclerView;->getChildViewHolderInt(Landroid/view/View;)Landroidx/recyclerview/widget/m0;

    .line 658
    .line 659
    .line 660
    move-result-object v14

    .line 661
    iput-object v7, v14, Landroidx/recyclerview/widget/m0;->mScrapContainer:Landroidx/recyclerview/widget/c0;

    .line 662
    .line 663
    iput-boolean v6, v14, Landroidx/recyclerview/widget/m0;->mInChangeScrap:Z

    .line 664
    .line 665
    invoke-virtual {v14}, Landroidx/recyclerview/widget/m0;->clearReturnedFromScrapFlag()V

    .line 666
    .line 667
    .line 668
    invoke-virtual {v0, v14}, Landroidx/recyclerview/widget/c0;->h(Landroidx/recyclerview/widget/m0;)V

    .line 669
    .line 670
    .line 671
    :cond_1e
    add-int/lit8 v10, v10, -0x1

    .line 672
    .line 673
    goto :goto_d

    .line 674
    :cond_1f
    const-wide/16 v25, 0x4

    .line 675
    .line 676
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 677
    .line 678
    .line 679
    move-result v8

    .line 680
    add-int/lit8 v8, v8, -0x1

    .line 681
    .line 682
    :goto_e
    if-ltz v8, :cond_21

    .line 683
    .line 684
    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 685
    .line 686
    .line 687
    move-result-object v10

    .line 688
    check-cast v10, Landroidx/recyclerview/widget/m0;

    .line 689
    .line 690
    invoke-virtual {v10}, Landroidx/recyclerview/widget/m0;->getItemId()J

    .line 691
    .line 692
    .line 693
    move-result-wide v14

    .line 694
    cmp-long v11, v14, v12

    .line 695
    .line 696
    if-nez v11, :cond_22

    .line 697
    .line 698
    invoke-virtual {v10}, Landroidx/recyclerview/widget/m0;->isAttachedToTransitionOverlay()Z

    .line 699
    .line 700
    .line 701
    move-result v11

    .line 702
    if-nez v11, :cond_22

    .line 703
    .line 704
    invoke-virtual {v10}, Landroidx/recyclerview/widget/m0;->getItemViewType()I

    .line 705
    .line 706
    .line 707
    move-result v11

    .line 708
    if-ne v2, v11, :cond_20

    .line 709
    .line 710
    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 711
    .line 712
    .line 713
    goto :goto_f

    .line 714
    :cond_20
    invoke-virtual {v0, v8}, Landroidx/recyclerview/widget/c0;->f(I)V

    .line 715
    .line 716
    .line 717
    :cond_21
    move-object v10, v7

    .line 718
    goto :goto_f

    .line 719
    :cond_22
    add-int/lit8 v8, v8, -0x1

    .line 720
    .line 721
    goto :goto_e

    .line 722
    :goto_f
    if-eqz v10, :cond_24

    .line 723
    .line 724
    iput v3, v10, Landroidx/recyclerview/widget/m0;->mPosition:I

    .line 725
    .line 726
    move/from16 v5, v16

    .line 727
    .line 728
    goto :goto_10

    .line 729
    :cond_23
    const-wide/16 v25, 0x4

    .line 730
    .line 731
    :cond_24
    :goto_10
    if-nez v10, :cond_28

    .line 732
    .line 733
    invoke-virtual {v0}, Landroidx/recyclerview/widget/c0;->c()Landroidx/recyclerview/widget/b0;

    .line 734
    .line 735
    .line 736
    move-result-object v3

    .line 737
    iget-object v3, v3, Landroidx/recyclerview/widget/b0;->a:Landroid/util/SparseArray;

    .line 738
    .line 739
    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 740
    .line 741
    .line 742
    move-result-object v3

    .line 743
    check-cast v3, Landroidx/recyclerview/widget/a0;

    .line 744
    .line 745
    if-eqz v3, :cond_26

    .line 746
    .line 747
    iget-object v3, v3, Landroidx/recyclerview/widget/a0;->a:Ljava/util/ArrayList;

    .line 748
    .line 749
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 750
    .line 751
    .line 752
    move-result v8

    .line 753
    if-nez v8, :cond_26

    .line 754
    .line 755
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 756
    .line 757
    .line 758
    move-result v8

    .line 759
    add-int/lit8 v8, v8, -0x1

    .line 760
    .line 761
    :goto_11
    if-ltz v8, :cond_26

    .line 762
    .line 763
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 764
    .line 765
    .line 766
    move-result-object v9

    .line 767
    check-cast v9, Landroidx/recyclerview/widget/m0;

    .line 768
    .line 769
    invoke-virtual {v9}, Landroidx/recyclerview/widget/m0;->isAttachedToTransitionOverlay()Z

    .line 770
    .line 771
    .line 772
    move-result v9

    .line 773
    if-nez v9, :cond_25

    .line 774
    .line 775
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 776
    .line 777
    .line 778
    move-result-object v3

    .line 779
    check-cast v3, Landroidx/recyclerview/widget/m0;

    .line 780
    .line 781
    goto :goto_12

    .line 782
    :cond_25
    add-int/lit8 v8, v8, -0x1

    .line 783
    .line 784
    goto :goto_11

    .line 785
    :cond_26
    move-object v3, v7

    .line 786
    :goto_12
    if-eqz v3, :cond_27

    .line 787
    .line 788
    invoke-virtual {v3}, Landroidx/recyclerview/widget/m0;->resetInternal()V

    .line 789
    .line 790
    .line 791
    sget-boolean v8, Landroidx/recyclerview/widget/RecyclerView;->FORCE_INVALIDATE_DISPLAY_LIST:Z

    .line 792
    .line 793
    if-eqz v8, :cond_27

    .line 794
    .line 795
    iget-object v8, v3, Landroidx/recyclerview/widget/m0;->itemView:Landroid/view/View;

    .line 796
    .line 797
    instance-of v9, v8, Landroid/view/ViewGroup;

    .line 798
    .line 799
    if-eqz v9, :cond_27

    .line 800
    .line 801
    check-cast v8, Landroid/view/ViewGroup;

    .line 802
    .line 803
    invoke-static {v8, v6}, Landroidx/recyclerview/widget/c0;->d(Landroid/view/ViewGroup;Z)V

    .line 804
    .line 805
    .line 806
    :cond_27
    move-object v10, v3

    .line 807
    :cond_28
    if-nez v10, :cond_30

    .line 808
    .line 809
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    .line 810
    .line 811
    .line 812
    move-result-wide v8

    .line 813
    cmp-long v3, p2, v19

    .line 814
    .line 815
    if-eqz v3, :cond_2b

    .line 816
    .line 817
    iget-object v3, v0, Landroidx/recyclerview/widget/c0;->g:Landroidx/recyclerview/widget/b0;

    .line 818
    .line 819
    invoke-virtual {v3, v2}, Landroidx/recyclerview/widget/b0;->a(I)Landroidx/recyclerview/widget/a0;

    .line 820
    .line 821
    .line 822
    move-result-object v3

    .line 823
    iget-wide v10, v3, Landroidx/recyclerview/widget/a0;->c:J

    .line 824
    .line 825
    cmp-long v3, v10, v17

    .line 826
    .line 827
    if-eqz v3, :cond_2a

    .line 828
    .line 829
    add-long/2addr v10, v8

    .line 830
    cmp-long v3, v10, p2

    .line 831
    .line 832
    if-gez v3, :cond_29

    .line 833
    .line 834
    goto :goto_13

    .line 835
    :cond_29
    move v3, v6

    .line 836
    goto :goto_14

    .line 837
    :cond_2a
    :goto_13
    move/from16 v3, v16

    .line 838
    .line 839
    :goto_14
    if-nez v3, :cond_2b

    .line 840
    .line 841
    return-object v7

    .line 842
    :cond_2b
    iget-object v3, v4, Landroidx/recyclerview/widget/RecyclerView;->mAdapter:Landroidx/recyclerview/widget/I;

    .line 843
    .line 844
    invoke-virtual {v3, v4, v2}, Landroidx/recyclerview/widget/I;->createViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/m0;

    .line 845
    .line 846
    .line 847
    move-result-object v10

    .line 848
    sget-boolean v3, Landroidx/recyclerview/widget/RecyclerView;->ALLOW_THREAD_GAP_WORK:Z

    .line 849
    .line 850
    if-eqz v3, :cond_2c

    .line 851
    .line 852
    iget-object v3, v10, Landroidx/recyclerview/widget/m0;->itemView:Landroid/view/View;

    .line 853
    .line 854
    invoke-static {v3}, Landroidx/recyclerview/widget/RecyclerView;->findNestedRecyclerView(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView;

    .line 855
    .line 856
    .line 857
    move-result-object v3

    .line 858
    if-eqz v3, :cond_2c

    .line 859
    .line 860
    new-instance v11, Ljava/lang/ref/WeakReference;

    .line 861
    .line 862
    invoke-direct {v11, v3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 863
    .line 864
    .line 865
    iput-object v11, v10, Landroidx/recyclerview/widget/m0;->mNestedRecyclerView:Ljava/lang/ref/WeakReference;

    .line 866
    .line 867
    :cond_2c
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    .line 868
    .line 869
    .line 870
    move-result-wide v11

    .line 871
    iget-object v3, v0, Landroidx/recyclerview/widget/c0;->g:Landroidx/recyclerview/widget/b0;

    .line 872
    .line 873
    sub-long/2addr v11, v8

    .line 874
    invoke-virtual {v3, v2}, Landroidx/recyclerview/widget/b0;->a(I)Landroidx/recyclerview/widget/a0;

    .line 875
    .line 876
    .line 877
    move-result-object v2

    .line 878
    iget-wide v8, v2, Landroidx/recyclerview/widget/a0;->c:J

    .line 879
    .line 880
    cmp-long v3, v8, v17

    .line 881
    .line 882
    if-nez v3, :cond_2d

    .line 883
    .line 884
    goto :goto_15

    .line 885
    :cond_2d
    div-long v8, v8, v25

    .line 886
    .line 887
    mul-long v8, v8, v22

    .line 888
    .line 889
    div-long v11, v11, v25

    .line 890
    .line 891
    add-long/2addr v11, v8

    .line 892
    :goto_15
    iput-wide v11, v2, Landroidx/recyclerview/widget/a0;->c:J

    .line 893
    .line 894
    goto :goto_16

    .line 895
    :cond_2e
    new-instance v2, Ljava/lang/IndexOutOfBoundsException;

    .line 896
    .line 897
    const-string v5, "Inconsistency detected. Invalid item position "

    .line 898
    .line 899
    const-string v6, "(offset:"

    .line 900
    .line 901
    const-string v7, ").state:"

    .line 902
    .line 903
    invoke-static {v5, v1, v6, v3, v7}, LR8/v;->h(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 904
    .line 905
    .line 906
    move-result-object v1

    .line 907
    iget-object v3, v4, Landroidx/recyclerview/widget/RecyclerView;->mState:Landroidx/recyclerview/widget/j0;

    .line 908
    .line 909
    invoke-virtual {v3}, Landroidx/recyclerview/widget/j0;->b()I

    .line 910
    .line 911
    .line 912
    move-result v3

    .line 913
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 914
    .line 915
    .line 916
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->exceptionLabel()Ljava/lang/String;

    .line 917
    .line 918
    .line 919
    move-result-object v3

    .line 920
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 921
    .line 922
    .line 923
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 924
    .line 925
    .line 926
    move-result-object v1

    .line 927
    invoke-direct {v2, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 928
    .line 929
    .line 930
    throw v2

    .line 931
    :cond_2f
    const-wide/16 v22, 0x3

    .line 932
    .line 933
    const-wide/16 v25, 0x4

    .line 934
    .line 935
    :cond_30
    :goto_16
    if-eqz v5, :cond_31

    .line 936
    .line 937
    iget-object v2, v4, Landroidx/recyclerview/widget/RecyclerView;->mState:Landroidx/recyclerview/widget/j0;

    .line 938
    .line 939
    iget-boolean v2, v2, Landroidx/recyclerview/widget/j0;->g:Z

    .line 940
    .line 941
    if-nez v2, :cond_31

    .line 942
    .line 943
    const/16 v2, 0x2000

    .line 944
    .line 945
    invoke-virtual {v10, v2}, Landroidx/recyclerview/widget/m0;->hasAnyOfTheFlags(I)Z

    .line 946
    .line 947
    .line 948
    move-result v3

    .line 949
    if-eqz v3, :cond_31

    .line 950
    .line 951
    invoke-virtual {v10, v6, v2}, Landroidx/recyclerview/widget/m0;->setFlags(II)V

    .line 952
    .line 953
    .line 954
    iget-object v2, v4, Landroidx/recyclerview/widget/RecyclerView;->mState:Landroidx/recyclerview/widget/j0;

    .line 955
    .line 956
    iget-boolean v2, v2, Landroidx/recyclerview/widget/j0;->j:Z

    .line 957
    .line 958
    if-eqz v2, :cond_31

    .line 959
    .line 960
    invoke-static {v10}, Landroidx/recyclerview/widget/P;->b(Landroidx/recyclerview/widget/m0;)V

    .line 961
    .line 962
    .line 963
    iget-object v2, v4, Landroidx/recyclerview/widget/RecyclerView;->mItemAnimator:Landroidx/recyclerview/widget/P;

    .line 964
    .line 965
    invoke-virtual {v10}, Landroidx/recyclerview/widget/m0;->getUnmodifiedPayloads()Ljava/util/List;

    .line 966
    .line 967
    .line 968
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 969
    .line 970
    .line 971
    new-instance v2, Landroidx/recyclerview/widget/O;

    .line 972
    .line 973
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 974
    .line 975
    .line 976
    invoke-virtual {v2, v10}, Landroidx/recyclerview/widget/O;->a(Landroidx/recyclerview/widget/m0;)V

    .line 977
    .line 978
    .line 979
    invoke-virtual {v4, v10, v2}, Landroidx/recyclerview/widget/RecyclerView;->recordAnimationInfoIfBouncedHiddenView(Landroidx/recyclerview/widget/m0;Landroidx/recyclerview/widget/O;)V

    .line 980
    .line 981
    .line 982
    :cond_31
    iget-object v2, v4, Landroidx/recyclerview/widget/RecyclerView;->mState:Landroidx/recyclerview/widget/j0;

    .line 983
    .line 984
    iget-boolean v2, v2, Landroidx/recyclerview/widget/j0;->g:Z

    .line 985
    .line 986
    if-eqz v2, :cond_32

    .line 987
    .line 988
    invoke-virtual {v10}, Landroidx/recyclerview/widget/m0;->isBound()Z

    .line 989
    .line 990
    .line 991
    move-result v2

    .line 992
    if-eqz v2, :cond_32

    .line 993
    .line 994
    iput v1, v10, Landroidx/recyclerview/widget/m0;->mPreLayoutPosition:I

    .line 995
    .line 996
    goto :goto_17

    .line 997
    :cond_32
    invoke-virtual {v10}, Landroidx/recyclerview/widget/m0;->isBound()Z

    .line 998
    .line 999
    .line 1000
    move-result v2

    .line 1001
    if-eqz v2, :cond_34

    .line 1002
    .line 1003
    invoke-virtual {v10}, Landroidx/recyclerview/widget/m0;->needsUpdate()Z

    .line 1004
    .line 1005
    .line 1006
    move-result v2

    .line 1007
    if-nez v2, :cond_34

    .line 1008
    .line 1009
    invoke-virtual {v10}, Landroidx/recyclerview/widget/m0;->isInvalid()Z

    .line 1010
    .line 1011
    .line 1012
    move-result v2

    .line 1013
    if-eqz v2, :cond_33

    .line 1014
    .line 1015
    goto :goto_18

    .line 1016
    :cond_33
    :goto_17
    move v1, v6

    .line 1017
    move/from16 v3, v16

    .line 1018
    .line 1019
    goto/16 :goto_1d

    .line 1020
    .line 1021
    :cond_34
    :goto_18
    iget-object v2, v4, Landroidx/recyclerview/widget/RecyclerView;->mAdapterHelper:Landroidx/recyclerview/widget/b;

    .line 1022
    .line 1023
    invoke-virtual {v2, v1, v6}, Landroidx/recyclerview/widget/b;->f(II)I

    .line 1024
    .line 1025
    .line 1026
    move-result v2

    .line 1027
    iput-object v7, v10, Landroidx/recyclerview/widget/m0;->mBindingAdapter:Landroidx/recyclerview/widget/I;

    .line 1028
    .line 1029
    iput-object v4, v10, Landroidx/recyclerview/widget/m0;->mOwnerRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    .line 1030
    .line 1031
    invoke-virtual {v10}, Landroidx/recyclerview/widget/m0;->getItemViewType()I

    .line 1032
    .line 1033
    .line 1034
    move-result v3

    .line 1035
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    .line 1036
    .line 1037
    .line 1038
    move-result-wide v8

    .line 1039
    cmp-long v11, p2, v19

    .line 1040
    .line 1041
    if-eqz v11, :cond_35

    .line 1042
    .line 1043
    iget-object v11, v0, Landroidx/recyclerview/widget/c0;->g:Landroidx/recyclerview/widget/b0;

    .line 1044
    .line 1045
    invoke-virtual {v11, v3}, Landroidx/recyclerview/widget/b0;->a(I)Landroidx/recyclerview/widget/a0;

    .line 1046
    .line 1047
    .line 1048
    move-result-object v3

    .line 1049
    iget-wide v11, v3, Landroidx/recyclerview/widget/a0;->d:J

    .line 1050
    .line 1051
    cmp-long v3, v11, v17

    .line 1052
    .line 1053
    if-eqz v3, :cond_35

    .line 1054
    .line 1055
    add-long/2addr v11, v8

    .line 1056
    cmp-long v3, v11, p2

    .line 1057
    .line 1058
    if-gez v3, :cond_33

    .line 1059
    .line 1060
    :cond_35
    iget-object v3, v4, Landroidx/recyclerview/widget/RecyclerView;->mAdapter:Landroidx/recyclerview/widget/I;

    .line 1061
    .line 1062
    invoke-virtual {v3, v10, v2}, Landroidx/recyclerview/widget/I;->bindViewHolder(Landroidx/recyclerview/widget/m0;I)V

    .line 1063
    .line 1064
    .line 1065
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    .line 1066
    .line 1067
    .line 1068
    move-result-wide v2

    .line 1069
    iget-object v11, v0, Landroidx/recyclerview/widget/c0;->g:Landroidx/recyclerview/widget/b0;

    .line 1070
    .line 1071
    invoke-virtual {v10}, Landroidx/recyclerview/widget/m0;->getItemViewType()I

    .line 1072
    .line 1073
    .line 1074
    move-result v12

    .line 1075
    sub-long/2addr v2, v8

    .line 1076
    invoke-virtual {v11, v12}, Landroidx/recyclerview/widget/b0;->a(I)Landroidx/recyclerview/widget/a0;

    .line 1077
    .line 1078
    .line 1079
    move-result-object v8

    .line 1080
    iget-wide v11, v8, Landroidx/recyclerview/widget/a0;->d:J

    .line 1081
    .line 1082
    cmp-long v9, v11, v17

    .line 1083
    .line 1084
    if-nez v9, :cond_36

    .line 1085
    .line 1086
    goto :goto_19

    .line 1087
    :cond_36
    div-long v11, v11, v25

    .line 1088
    .line 1089
    mul-long v11, v11, v22

    .line 1090
    .line 1091
    div-long v2, v2, v25

    .line 1092
    .line 1093
    add-long/2addr v2, v11

    .line 1094
    :goto_19
    iput-wide v2, v8, Landroidx/recyclerview/widget/a0;->d:J

    .line 1095
    .line 1096
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->isAccessibilityEnabled()Z

    .line 1097
    .line 1098
    .line 1099
    move-result v2

    .line 1100
    if-eqz v2, :cond_3c

    .line 1101
    .line 1102
    iget-object v2, v10, Landroidx/recyclerview/widget/m0;->itemView:Landroid/view/View;

    .line 1103
    .line 1104
    sget-object v3, Lk1/S;->a:Ljava/util/WeakHashMap;

    .line 1105
    .line 1106
    invoke-virtual {v2}, Landroid/view/View;->getImportantForAccessibility()I

    .line 1107
    .line 1108
    .line 1109
    move-result v3

    .line 1110
    if-nez v3, :cond_37

    .line 1111
    .line 1112
    move/from16 v3, v16

    .line 1113
    .line 1114
    invoke-virtual {v2, v3}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 1115
    .line 1116
    .line 1117
    goto :goto_1a

    .line 1118
    :cond_37
    move/from16 v3, v16

    .line 1119
    .line 1120
    :goto_1a
    iget-object v8, v4, Landroidx/recyclerview/widget/RecyclerView;->mAccessibilityDelegate:Landroidx/recyclerview/widget/o0;

    .line 1121
    .line 1122
    if-nez v8, :cond_38

    .line 1123
    .line 1124
    goto :goto_1c

    .line 1125
    :cond_38
    iget-object v8, v8, Landroidx/recyclerview/widget/o0;->e:Landroidx/recyclerview/widget/n0;

    .line 1126
    .line 1127
    instance-of v9, v8, Landroidx/recyclerview/widget/n0;

    .line 1128
    .line 1129
    if-eqz v9, :cond_3b

    .line 1130
    .line 1131
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1132
    .line 1133
    .line 1134
    invoke-static {v2}, Lk1/S;->d(Landroid/view/View;)Landroid/view/View$AccessibilityDelegate;

    .line 1135
    .line 1136
    .line 1137
    move-result-object v9

    .line 1138
    if-nez v9, :cond_39

    .line 1139
    .line 1140
    goto :goto_1b

    .line 1141
    :cond_39
    instance-of v7, v9, Lk1/a;

    .line 1142
    .line 1143
    if-eqz v7, :cond_3a

    .line 1144
    .line 1145
    check-cast v9, Lk1/a;

    .line 1146
    .line 1147
    iget-object v7, v9, Lk1/a;->a:Lk1/b;

    .line 1148
    .line 1149
    goto :goto_1b

    .line 1150
    :cond_3a
    new-instance v7, Lk1/b;

    .line 1151
    .line 1152
    invoke-direct {v7, v9}, Lk1/b;-><init>(Landroid/view/View$AccessibilityDelegate;)V

    .line 1153
    .line 1154
    .line 1155
    :goto_1b
    if-eqz v7, :cond_3b

    .line 1156
    .line 1157
    if-eq v7, v8, :cond_3b

    .line 1158
    .line 1159
    iget-object v9, v8, Landroidx/recyclerview/widget/n0;->e:Ljava/util/WeakHashMap;

    .line 1160
    .line 1161
    invoke-virtual {v9, v2, v7}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1162
    .line 1163
    .line 1164
    :cond_3b
    invoke-static {v2, v8}, Lk1/S;->m(Landroid/view/View;Lk1/b;)V

    .line 1165
    .line 1166
    .line 1167
    goto :goto_1c

    .line 1168
    :cond_3c
    move/from16 v3, v16

    .line 1169
    .line 1170
    :goto_1c
    iget-object v2, v4, Landroidx/recyclerview/widget/RecyclerView;->mState:Landroidx/recyclerview/widget/j0;

    .line 1171
    .line 1172
    iget-boolean v2, v2, Landroidx/recyclerview/widget/j0;->g:Z

    .line 1173
    .line 1174
    if-eqz v2, :cond_3d

    .line 1175
    .line 1176
    iput v1, v10, Landroidx/recyclerview/widget/m0;->mPreLayoutPosition:I

    .line 1177
    .line 1178
    :cond_3d
    move v1, v3

    .line 1179
    :goto_1d
    iget-object v2, v10, Landroidx/recyclerview/widget/m0;->itemView:Landroid/view/View;

    .line 1180
    .line 1181
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1182
    .line 1183
    .line 1184
    move-result-object v2

    .line 1185
    if-nez v2, :cond_3e

    .line 1186
    .line 1187
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1188
    .line 1189
    .line 1190
    move-result-object v2

    .line 1191
    check-cast v2, Landroidx/recyclerview/widget/W;

    .line 1192
    .line 1193
    iget-object v4, v10, Landroidx/recyclerview/widget/m0;->itemView:Landroid/view/View;

    .line 1194
    .line 1195
    invoke-virtual {v4, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1196
    .line 1197
    .line 1198
    goto :goto_1e

    .line 1199
    :cond_3e
    invoke-virtual {v4, v2}, Landroidx/recyclerview/widget/RecyclerView;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    .line 1200
    .line 1201
    .line 1202
    move-result v7

    .line 1203
    if-nez v7, :cond_3f

    .line 1204
    .line 1205
    invoke-virtual {v4, v2}, Landroidx/recyclerview/widget/RecyclerView;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;

    .line 1206
    .line 1207
    .line 1208
    move-result-object v2

    .line 1209
    check-cast v2, Landroidx/recyclerview/widget/W;

    .line 1210
    .line 1211
    iget-object v4, v10, Landroidx/recyclerview/widget/m0;->itemView:Landroid/view/View;

    .line 1212
    .line 1213
    invoke-virtual {v4, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1214
    .line 1215
    .line 1216
    goto :goto_1e

    .line 1217
    :cond_3f
    check-cast v2, Landroidx/recyclerview/widget/W;

    .line 1218
    .line 1219
    :goto_1e
    iput-object v10, v2, Landroidx/recyclerview/widget/W;->a:Landroidx/recyclerview/widget/m0;

    .line 1220
    .line 1221
    if-eqz v5, :cond_40

    .line 1222
    .line 1223
    if-eqz v1, :cond_40

    .line 1224
    .line 1225
    goto :goto_1f

    .line 1226
    :cond_40
    move v3, v6

    .line 1227
    :goto_1f
    iput-boolean v3, v2, Landroidx/recyclerview/widget/W;->d:Z

    .line 1228
    .line 1229
    return-object v10

    .line 1230
    :cond_41
    new-instance v2, Ljava/lang/IndexOutOfBoundsException;

    .line 1231
    .line 1232
    const-string v3, "Invalid item position "

    .line 1233
    .line 1234
    const-string v5, "("

    .line 1235
    .line 1236
    const-string v6, "). Item count:"

    .line 1237
    .line 1238
    invoke-static {v3, v1, v5, v1, v6}, LR8/v;->h(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 1239
    .line 1240
    .line 1241
    move-result-object v1

    .line 1242
    iget-object v3, v4, Landroidx/recyclerview/widget/RecyclerView;->mState:Landroidx/recyclerview/widget/j0;

    .line 1243
    .line 1244
    invoke-virtual {v3}, Landroidx/recyclerview/widget/j0;->b()I

    .line 1245
    .line 1246
    .line 1247
    move-result v3

    .line 1248
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1249
    .line 1250
    .line 1251
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->exceptionLabel()Ljava/lang/String;

    .line 1252
    .line 1253
    .line 1254
    move-result-object v3

    .line 1255
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1256
    .line 1257
    .line 1258
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1259
    .line 1260
    .line 1261
    move-result-object v1

    .line 1262
    invoke-direct {v2, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 1263
    .line 1264
    .line 1265
    throw v2
.end method

.method public final k(Landroidx/recyclerview/widget/m0;)V
    .locals 1

    .line 1
    iget-boolean v0, p1, Landroidx/recyclerview/widget/m0;->mInChangeScrap:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/recyclerview/widget/c0;->b:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/c0;->a:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    :goto_0
    const/4 v0, 0x0

    .line 17
    iput-object v0, p1, Landroidx/recyclerview/widget/m0;->mScrapContainer:Landroidx/recyclerview/widget/c0;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    iput-boolean v0, p1, Landroidx/recyclerview/widget/m0;->mInChangeScrap:Z

    .line 21
    .line 22
    invoke-virtual {p1}, Landroidx/recyclerview/widget/m0;->clearReturnedFromScrapFlag()V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final l()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/c0;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->mLayout:Landroidx/recyclerview/widget/V;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget v0, v0, Landroidx/recyclerview/widget/V;->mPrefetchMaxCountObserved:I

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    iget v1, p0, Landroidx/recyclerview/widget/c0;->e:I

    .line 12
    .line 13
    add-int/2addr v1, v0

    .line 14
    iput v1, p0, Landroidx/recyclerview/widget/c0;->f:I

    .line 15
    .line 16
    iget-object v0, p0, Landroidx/recyclerview/widget/c0;->c:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    add-int/lit8 v1, v1, -0x1

    .line 23
    .line 24
    :goto_1
    if-ltz v1, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    iget v3, p0, Landroidx/recyclerview/widget/c0;->f:I

    .line 31
    .line 32
    if-le v2, v3, :cond_1

    .line 33
    .line 34
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/c0;->f(I)V

    .line 35
    .line 36
    .line 37
    add-int/lit8 v1, v1, -0x1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    return-void
.end method
