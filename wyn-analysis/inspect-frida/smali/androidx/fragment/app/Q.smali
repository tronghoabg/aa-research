.class public final Landroidx/fragment/app/Q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/LayoutInflater$Factory2;


# instance fields
.field public final a:Landroidx/fragment/app/e0;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/e0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/fragment/app/Q;->a:Landroidx/fragment/app/e0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 11

    const/4 v0, 0x0

    .line 2
    const-class v1, Landroidx/fragment/app/FragmentContainerView;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    iget-object v2, p0, Landroidx/fragment/app/Q;->a:Landroidx/fragment/app/e0;

    if-eqz v1, :cond_0

    .line 3
    new-instance p1, Landroidx/fragment/app/FragmentContainerView;

    invoke-direct {p1, p3, p4, v2}, Landroidx/fragment/app/FragmentContainerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;Landroidx/fragment/app/e0;)V

    return-object p1

    .line 4
    :cond_0
    const-string v1, "fragment"

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    const/4 v1, 0x0

    if-nez p2, :cond_1

    goto/16 :goto_6

    .line 5
    :cond_1
    const-string p2, "class"

    invoke-interface {p4, v1, p2}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 6
    sget-object v3, LC1/a;->a:[I

    invoke-virtual {p3, p4, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v3

    if-nez p2, :cond_2

    .line 7
    invoke-virtual {v3, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    :cond_2
    const/4 v4, 0x1

    const/4 v5, -0x1

    .line 8
    invoke-virtual {v3, v4, v5}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v6

    const/4 v7, 0x2

    .line 9
    invoke-virtual {v3, v7}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 10
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    if-eqz p2, :cond_11

    .line 11
    invoke-virtual {p3}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    .line 12
    :try_start_0
    invoke-static {v3, p2}, Landroidx/fragment/app/W;->a(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    .line 13
    const-class v9, Landroidx/fragment/app/F;

    invoke-virtual {v9, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move v3, v0

    :goto_0
    if-nez v3, :cond_3

    goto/16 :goto_6

    :cond_3
    if-eqz p1, :cond_4

    .line 14
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v3

    goto :goto_1

    :cond_4
    move v3, v0

    :goto_1
    if-ne v3, v5, :cond_6

    if-ne v6, v5, :cond_6

    if-eqz v8, :cond_5

    goto :goto_2

    .line 15
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p4}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, ": Must specify unique android:id, android:tag, or have a parent with an id for "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    :goto_2
    if-eq v6, v5, :cond_7

    .line 16
    invoke-virtual {v2, v6}, Landroidx/fragment/app/e0;->B(I)Landroidx/fragment/app/F;

    move-result-object v9

    goto :goto_3

    :cond_7
    move-object v9, v1

    :goto_3
    if-nez v9, :cond_8

    if-eqz v8, :cond_8

    .line 17
    invoke-virtual {v2, v8}, Landroidx/fragment/app/e0;->C(Ljava/lang/String;)Landroidx/fragment/app/F;

    move-result-object v9

    :cond_8
    if-nez v9, :cond_9

    if-eq v3, v5, :cond_9

    .line 18
    invoke-virtual {v2, v3}, Landroidx/fragment/app/e0;->B(I)Landroidx/fragment/app/F;

    move-result-object v9

    .line 19
    :cond_9
    const-string v5, "Fragment "

    const-string v10, "FragmentManager"

    if-nez v9, :cond_b

    .line 20
    invoke-virtual {v2}, Landroidx/fragment/app/e0;->G()Landroidx/fragment/app/W;

    move-result-object v9

    .line 21
    invoke-virtual {p3}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 22
    iget-object p3, v9, Landroidx/fragment/app/W;->a:Landroidx/fragment/app/e0;

    .line 23
    iget-object p3, p3, Landroidx/fragment/app/e0;->v:Landroidx/fragment/app/O;

    .line 24
    iget-object p3, p3, Landroidx/fragment/app/O;->b:Landroidx/fragment/app/FragmentActivity;

    .line 25
    invoke-static {p3, p2, v1}, Landroidx/fragment/app/F;->instantiate(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/fragment/app/F;

    move-result-object v9

    .line 26
    iput-boolean v4, v9, Landroidx/fragment/app/F;->mFromLayout:Z

    if-eqz v6, :cond_a

    move p3, v6

    goto :goto_4

    :cond_a
    move p3, v3

    .line 27
    :goto_4
    iput p3, v9, Landroidx/fragment/app/F;->mFragmentId:I

    .line 28
    iput v3, v9, Landroidx/fragment/app/F;->mContainerId:I

    .line 29
    iput-object v8, v9, Landroidx/fragment/app/F;->mTag:Ljava/lang/String;

    .line 30
    iput-boolean v4, v9, Landroidx/fragment/app/F;->mInLayout:Z

    .line 31
    iput-object v2, v9, Landroidx/fragment/app/F;->mFragmentManager:Landroidx/fragment/app/e0;

    .line 32
    iget-object p3, v2, Landroidx/fragment/app/e0;->v:Landroidx/fragment/app/O;

    .line 33
    iput-object p3, v9, Landroidx/fragment/app/F;->mHost:Landroidx/fragment/app/O;

    .line 34
    iget-object p3, p3, Landroidx/fragment/app/O;->b:Landroidx/fragment/app/FragmentActivity;

    .line 35
    iget-object v1, v9, Landroidx/fragment/app/F;->mSavedFragmentState:Landroid/os/Bundle;

    invoke-virtual {v9, p3, p4, v1}, Landroidx/fragment/app/F;->onInflate(Landroid/content/Context;Landroid/util/AttributeSet;Landroid/os/Bundle;)V

    .line 36
    invoke-virtual {v2, v9}, Landroidx/fragment/app/e0;->a(Landroidx/fragment/app/F;)Landroidx/fragment/app/l0;

    move-result-object p3

    .line 37
    invoke-static {v7}, Landroidx/fragment/app/e0;->J(I)Z

    move-result p4

    if-eqz p4, :cond_c

    .line 38
    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " has been inflated via the <fragment> tag: id=0x"

    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    .line 40
    invoke-static {v10, p4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_5

    .line 41
    :cond_b
    iget-boolean p3, v9, Landroidx/fragment/app/F;->mInLayout:Z

    if-nez p3, :cond_10

    .line 42
    iput-boolean v4, v9, Landroidx/fragment/app/F;->mInLayout:Z

    .line 43
    iput-object v2, v9, Landroidx/fragment/app/F;->mFragmentManager:Landroidx/fragment/app/e0;

    .line 44
    iget-object p3, v2, Landroidx/fragment/app/e0;->v:Landroidx/fragment/app/O;

    .line 45
    iput-object p3, v9, Landroidx/fragment/app/F;->mHost:Landroidx/fragment/app/O;

    .line 46
    iget-object p3, p3, Landroidx/fragment/app/O;->b:Landroidx/fragment/app/FragmentActivity;

    .line 47
    iget-object v1, v9, Landroidx/fragment/app/F;->mSavedFragmentState:Landroid/os/Bundle;

    invoke-virtual {v9, p3, p4, v1}, Landroidx/fragment/app/F;->onInflate(Landroid/content/Context;Landroid/util/AttributeSet;Landroid/os/Bundle;)V

    .line 48
    invoke-virtual {v2, v9}, Landroidx/fragment/app/e0;->g(Landroidx/fragment/app/F;)Landroidx/fragment/app/l0;

    move-result-object p3

    .line 49
    invoke-static {v7}, Landroidx/fragment/app/e0;->J(I)Z

    move-result p4

    if-eqz p4, :cond_c

    .line 50
    new-instance p4, Ljava/lang/StringBuilder;

    const-string v1, "Retained Fragment "

    invoke-direct {p4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " has been re-attached via the <fragment> tag: id=0x"

    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    .line 52
    invoke-static {v10, p4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 53
    :cond_c
    :goto_5
    check-cast p1, Landroid/view/ViewGroup;

    sget-object p4, LD1/d;->a:LD1/c;

    .line 54
    new-instance p4, LD1/e;

    invoke-direct {p4, v9, p1, v0}, LD1/e;-><init>(Landroidx/fragment/app/F;Landroid/view/ViewGroup;I)V

    .line 55
    invoke-static {p4}, LD1/d;->b(LD1/i;)V

    .line 56
    invoke-static {v9}, LD1/d;->a(Landroidx/fragment/app/F;)LD1/c;

    move-result-object p4

    .line 57
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    iput-object p1, v9, Landroidx/fragment/app/F;->mContainer:Landroid/view/ViewGroup;

    .line 59
    invoke-virtual {p3}, Landroidx/fragment/app/l0;->k()V

    .line 60
    invoke-virtual {p3}, Landroidx/fragment/app/l0;->j()V

    .line 61
    iget-object p1, v9, Landroidx/fragment/app/F;->mView:Landroid/view/View;

    if-eqz p1, :cond_f

    if-eqz v6, :cond_d

    .line 62
    invoke-virtual {p1, v6}, Landroid/view/View;->setId(I)V

    .line 63
    :cond_d
    iget-object p1, v9, Landroidx/fragment/app/F;->mView:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_e

    .line 64
    iget-object p1, v9, Landroidx/fragment/app/F;->mView:Landroid/view/View;

    invoke-virtual {p1, v8}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 65
    :cond_e
    iget-object p1, v9, Landroidx/fragment/app/F;->mView:Landroid/view/View;

    new-instance p2, Landroidx/fragment/app/P;

    invoke-direct {p2, p0, p3}, Landroidx/fragment/app/P;-><init>(Landroidx/fragment/app/Q;Landroidx/fragment/app/l0;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 66
    iget-object p1, v9, Landroidx/fragment/app/F;->mView:Landroid/view/View;

    return-object p1

    .line 67
    :cond_f
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p3, " did not create a view."

    .line 68
    invoke-static {v5, p2, p3}, LA7/p0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 69
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 70
    :cond_10
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p4}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, ": Duplicate id 0x"

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, ", tag "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, ", or parent id 0x"

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, " with another fragment for "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_11
    :goto_6
    return-object v1
.end method

.method public final onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0, p1, p2, p3}, Landroidx/fragment/app/Q;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method
