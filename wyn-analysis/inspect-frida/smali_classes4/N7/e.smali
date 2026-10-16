.class public final LN7/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh6/g;


# instance fields
.field public final synthetic a:I

.field public b:Z

.field public c:I

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 4

    iput p1, p0, LN7/e;->a:I

    packed-switch p1, :pswitch_data_0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void

    .line 1
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance p1, Lh6/j;

    const/4 v0, 0x1

    .line 3
    invoke-direct {p1, v0}, LH5/h;-><init>(I)V

    .line 4
    iput-object p1, p0, LN7/e;->d:Ljava/lang/Object;

    .line 5
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, LN7/e;->e:Ljava/lang/Object;

    const/4 p1, 0x0

    move v0, p1

    :goto_0
    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    .line 6
    iget-object v1, p0, LN7/e;->e:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayDeque;

    new-instance v2, Lh6/d;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lh6/d;-><init>(Lh6/g;I)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayDeque;->addFirst(Ljava/lang/Object;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 7
    :cond_0
    iput p1, p0, LN7/e;->c:I

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(LDd/c;Landroid/view/KeyEvent;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, LN7/e;->a:I

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LN7/e;->e:Ljava/lang/Object;

    .line 9
    iget-object p1, p1, LDd/c;->b:Ljava/lang/Object;

    check-cast p1, [Lkc/x;

    array-length p1, p1

    iput p1, p0, LN7/e;->c:I

    const/4 p1, 0x0

    .line 10
    iput-boolean p1, p0, LN7/e;->b:Z

    .line 11
    iput-object p2, p0, LN7/e;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LN7/e;->a:I

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LN7/e;->e:Ljava/lang/Object;

    .line 15
    new-instance p1, LA7/V;

    const/16 v0, 0x10

    invoke-direct {p1, p0, v0}, LA7/V;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, LN7/e;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/sidesheet/SideSheetBehavior;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LN7/e;->a:I

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LN7/e;->e:Ljava/lang/Object;

    .line 13
    new-instance p1, Lcom/applovin/adview/a;

    const/16 v0, 0x15

    invoke-direct {p1, p0, v0}, Lcom/applovin/adview/a;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, LN7/e;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(J)V
    .locals 0

    .line 1
    return-void
.end method

.method public b()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-boolean v0, p0, LN7/e;->b:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Lu6/a;->i(Z)V

    .line 6
    .line 7
    .line 8
    iget v0, p0, LN7/e;->c:I

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    if-ne v0, v1, :cond_2

    .line 12
    .line 13
    iget-object v0, p0, LN7/e;->e:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Ljava/util/ArrayDeque;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    move-object v1, v0

    .line 29
    check-cast v1, Lh6/d;

    .line 30
    .line 31
    iget-object v0, p0, LN7/e;->d:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Lh6/j;

    .line 34
    .line 35
    const/4 v2, 0x4

    .line 36
    invoke-virtual {v0, v2}, LH5/a;->h(I)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    const/4 v7, 0x0

    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    invoke-virtual {v1, v2}, LH5/a;->b(I)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    new-instance v4, LA2/c;

    .line 48
    .line 49
    iget-wide v2, v0, LH5/h;->f:J

    .line 50
    .line 51
    iget-object v5, v0, LH5/h;->d:Ljava/nio/ByteBuffer;

    .line 52
    .line 53
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->array()[B

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    array-length v8, v5

    .line 65
    invoke-virtual {v6, v5, v7, v8}, Landroid/os/Parcel;->unmarshall([BII)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v6, v7}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 69
    .line 70
    .line 71
    const-class v5, Landroid/os/Bundle;

    .line 72
    .line 73
    invoke-virtual {v5}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    invoke-virtual {v6, v5}, Landroid/os/Parcel;->readBundle(Ljava/lang/ClassLoader;)Landroid/os/Bundle;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    invoke-virtual {v6}, Landroid/os/Parcel;->recycle()V

    .line 82
    .line 83
    .line 84
    const-string v6, "c"

    .line 85
    .line 86
    invoke-virtual {v5, v6}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    sget-object v6, Lh6/b;->s:Lcom/applovin/impl/Z0;

    .line 94
    .line 95
    invoke-static {v6, v5}, Lu6/a;->s(LE5/g;Ljava/util/ArrayList;)Ll8/e0;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    invoke-direct {v4, v2, v3, v5}, LA2/c;-><init>(JLl8/e0;)V

    .line 100
    .line 101
    .line 102
    iget-wide v2, v0, LH5/h;->f:J

    .line 103
    .line 104
    const-wide/16 v5, 0x0

    .line 105
    .line 106
    invoke-virtual/range {v1 .. v6}, Lh6/d;->q(JLh6/f;J)V

    .line 107
    .line 108
    .line 109
    :goto_0
    invoke-virtual {v0}, LH5/h;->o()V

    .line 110
    .line 111
    .line 112
    iput v7, p0, LN7/e;->c:I

    .line 113
    .line 114
    return-object v1

    .line 115
    :cond_2
    :goto_1
    const/4 v0, 0x0

    .line 116
    return-object v0
.end method

.method public c()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-boolean v0, p0, LN7/e;->b:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    xor-int/2addr v0, v1

    .line 5
    invoke-static {v0}, Lu6/a;->i(Z)V

    .line 6
    .line 7
    .line 8
    iget v0, p0, LN7/e;->c:I

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    return-object v0

    .line 14
    :cond_0
    iput v1, p0, LN7/e;->c:I

    .line 15
    .line 16
    iget-object v0, p0, LN7/e;->d:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lh6/j;

    .line 19
    .line 20
    return-object v0
.end method

.method public d(Lh6/j;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, LN7/e;->b:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    xor-int/2addr v0, v1

    .line 5
    invoke-static {v0}, Lu6/a;->i(Z)V

    .line 6
    .line 7
    .line 8
    iget v0, p0, LN7/e;->c:I

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    move v0, v1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v0, v2

    .line 16
    :goto_0
    invoke-static {v0}, Lu6/a;->i(Z)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, LN7/e;->d:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Lh6/j;

    .line 22
    .line 23
    if-ne v0, p1, :cond_1

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    move v1, v2

    .line 27
    :goto_1
    invoke-static {v1}, Lu6/a;->e(Z)V

    .line 28
    .line 29
    .line 30
    const/4 p1, 0x2

    .line 31
    iput p1, p0, LN7/e;->c:I

    .line 32
    .line 33
    return-void
.end method

.method public e()Lcom/google/android/gms/common/api/internal/V;
    .locals 4

    .line 1
    iget-object v0, p0, LN7/e;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/google/android/gms/common/api/internal/w;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    const-string v1, "execute parameter required"

    .line 11
    .line 12
    invoke-static {v1, v0}, Lcom/google/android/gms/common/internal/v;->a(Ljava/lang/String;Z)V

    .line 13
    .line 14
    .line 15
    new-instance v0, Lcom/google/android/gms/common/api/internal/V;

    .line 16
    .line 17
    iget-object v1, p0, LN7/e;->e:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, [Ld7/d;

    .line 20
    .line 21
    iget-boolean v2, p0, LN7/e;->b:Z

    .line 22
    .line 23
    iget v3, p0, LN7/e;->c:I

    .line 24
    .line 25
    invoke-direct {v0, p0, v1, v2, v3}, Lcom/google/android/gms/common/api/internal/V;-><init>(LN7/e;[Ld7/d;ZI)V

    .line 26
    .line 27
    .line 28
    return-object v0
.end method

.method public f(I)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iget v1, p0, LN7/e;->a:I

    .line 3
    .line 4
    packed-switch v1, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, LN7/e;->e:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 10
    .line 11
    iget-object v2, v1, Lcom/google/android/material/sidesheet/SideSheetBehavior;->o:Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iput p1, p0, LN7/e;->c:I

    .line 23
    .line 24
    iget-boolean p1, p0, LN7/e;->b:Z

    .line 25
    .line 26
    if-nez p1, :cond_1

    .line 27
    .line 28
    iget-object p1, v1, Lcom/google/android/material/sidesheet/SideSheetBehavior;->o:Ljava/lang/ref/WeakReference;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, Landroid/view/View;

    .line 35
    .line 36
    iget-object v1, p0, LN7/e;->d:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v1, Lcom/applovin/adview/a;

    .line 39
    .line 40
    sget-object v2, Lk1/S;->a:Ljava/util/WeakHashMap;

    .line 41
    .line 42
    invoke-virtual {p1, v1}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 43
    .line 44
    .line 45
    iput-boolean v0, p0, LN7/e;->b:Z

    .line 46
    .line 47
    :cond_1
    :goto_0
    return-void

    .line 48
    :pswitch_0
    iget-object v1, p0, LN7/e;->e:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 51
    .line 52
    iget-object v2, v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->U:Ljava/lang/ref/WeakReference;

    .line 53
    .line 54
    if-eqz v2, :cond_3

    .line 55
    .line 56
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    if-nez v2, :cond_2

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    iput p1, p0, LN7/e;->c:I

    .line 64
    .line 65
    iget-boolean p1, p0, LN7/e;->b:Z

    .line 66
    .line 67
    if-nez p1, :cond_3

    .line 68
    .line 69
    iget-object p1, v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->U:Ljava/lang/ref/WeakReference;

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    check-cast p1, Landroid/view/View;

    .line 76
    .line 77
    iget-object v1, p0, LN7/e;->d:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v1, LA7/V;

    .line 80
    .line 81
    sget-object v2, Lk1/S;->a:Ljava/util/WeakHashMap;

    .line 82
    .line 83
    invoke-virtual {p1, v1}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 84
    .line 85
    .line 86
    iput-boolean v0, p0, LN7/e;->b:Z

    .line 87
    .line 88
    :cond_3
    :goto_1
    return-void

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public flush()V
    .locals 1

    .line 1
    iget-boolean v0, p0, LN7/e;->b:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Lu6/a;->i(Z)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LN7/e;->d:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lh6/j;

    .line 11
    .line 12
    invoke-virtual {v0}, LH5/h;->o()V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput v0, p0, LN7/e;->c:I

    .line 17
    .line 18
    return-void
.end method

.method public release()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LN7/e;->b:Z

    .line 3
    .line 4
    return-void
.end method
