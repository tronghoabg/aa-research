.class public final LX/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/ListIterator;
.implements Luf/a;


# instance fields
.field public final synthetic a:I

.field public b:I

.field public c:I

.field public d:I

.field public final e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LX/p;I)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LX/v;->a:I

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, LX/v;->e:Ljava/lang/Object;

    add-int/lit8 p2, p2, -0x1

    .line 14
    iput p2, p0, LX/v;->b:I

    const/4 p2, -0x1

    .line 15
    iput p2, p0, LX/v;->c:I

    .line 16
    invoke-virtual {p1}, LX/p;->d()I

    move-result p1

    iput p1, p0, LX/v;->d:I

    return-void
.end method

.method public constructor <init>(Lgf/a;I)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LX/v;->a:I

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, LX/v;->e:Ljava/lang/Object;

    .line 19
    iput p2, p0, LX/v;->b:I

    const/4 p2, -0x1

    .line 20
    iput p2, p0, LX/v;->c:I

    .line 21
    invoke-static {p1}, Lgf/a;->d(Lgf/a;)I

    move-result p1

    iput p1, p0, LX/v;->d:I

    return-void
.end method

.method public constructor <init>(Lgf/b;I)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LX/v;->a:I

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, LX/v;->e:Ljava/lang/Object;

    .line 9
    iput p2, p0, LX/v;->b:I

    const/4 p2, -0x1

    .line 10
    iput p2, p0, LX/v;->c:I

    .line 11
    invoke-static {p1}, Lgf/b;->d(Lgf/b;)I

    move-result p1

    iput p1, p0, LX/v;->d:I

    return-void
.end method

.method public constructor <init>(Lt0/h;II)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, LX/v;->a:I

    and-int/lit8 p3, p3, 0x1

    const/4 v0, 0x0

    if-eqz p3, :cond_0

    move p2, v0

    .line 1
    :cond_0
    iget p3, p1, Lt0/h;->d:I

    .line 2
    invoke-direct {p0, p1, p2, v0, p3}, LX/v;-><init>(Lt0/h;III)V

    return-void
.end method

.method public constructor <init>(Lt0/h;III)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, LX/v;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LX/v;->e:Ljava/lang/Object;

    .line 4
    iput p2, p0, LX/v;->b:I

    .line 5
    iput p3, p0, LX/v;->c:I

    .line 6
    iput p4, p0, LX/v;->d:I

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, LX/v;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lgf/a;

    .line 4
    .line 5
    iget-object v0, v0, Lgf/a;->e:Lgf/b;

    .line 6
    .line 7
    invoke-static {v0}, Lgf/b;->d(Lgf/b;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget v1, p0, LX/v;->d:I

    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    .line 19
    .line 20
    .line 21
    throw v0
.end method

.method public final add(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, LX/v;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 7
    .line 8
    const-string v0, "Operation is not supported for read-only collection"

    .line 9
    .line 10
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p1

    .line 14
    :pswitch_0
    invoke-virtual {p0}, LX/v;->c()V

    .line 15
    .line 16
    .line 17
    iget v0, p0, LX/v;->b:I

    .line 18
    .line 19
    add-int/lit8 v1, v0, 0x1

    .line 20
    .line 21
    iput v1, p0, LX/v;->b:I

    .line 22
    .line 23
    iget-object v1, p0, LX/v;->e:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, Lgf/b;

    .line 26
    .line 27
    invoke-virtual {v1, v0, p1}, Lgf/b;->add(ILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    const/4 p1, -0x1

    .line 31
    iput p1, p0, LX/v;->c:I

    .line 32
    .line 33
    invoke-static {v1}, Lgf/b;->d(Lgf/b;)I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    iput p1, p0, LX/v;->d:I

    .line 38
    .line 39
    return-void

    .line 40
    :pswitch_1
    invoke-virtual {p0}, LX/v;->a()V

    .line 41
    .line 42
    .line 43
    iget v0, p0, LX/v;->b:I

    .line 44
    .line 45
    add-int/lit8 v1, v0, 0x1

    .line 46
    .line 47
    iput v1, p0, LX/v;->b:I

    .line 48
    .line 49
    iget-object v1, p0, LX/v;->e:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v1, Lgf/a;

    .line 52
    .line 53
    invoke-virtual {v1, v0, p1}, Lgf/a;->add(ILjava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    const/4 p1, -0x1

    .line 57
    iput p1, p0, LX/v;->c:I

    .line 58
    .line 59
    invoke-static {v1}, Lgf/a;->d(Lgf/a;)I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    iput p1, p0, LX/v;->d:I

    .line 64
    .line 65
    return-void

    .line 66
    :pswitch_2
    invoke-virtual {p0}, LX/v;->d()V

    .line 67
    .line 68
    .line 69
    iget v0, p0, LX/v;->b:I

    .line 70
    .line 71
    add-int/lit8 v0, v0, 0x1

    .line 72
    .line 73
    iget-object v1, p0, LX/v;->e:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v1, LX/p;

    .line 76
    .line 77
    invoke-virtual {v1, v0, p1}, LX/p;->add(ILjava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    const/4 p1, -0x1

    .line 81
    iput p1, p0, LX/v;->c:I

    .line 82
    .line 83
    iget p1, p0, LX/v;->b:I

    .line 84
    .line 85
    add-int/lit8 p1, p1, 0x1

    .line 86
    .line 87
    iput p1, p0, LX/v;->b:I

    .line 88
    .line 89
    invoke-virtual {v1}, LX/p;->d()I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    iput p1, p0, LX/v;->d:I

    .line 94
    .line 95
    return-void

    .line 96
    nop

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public c()V
    .locals 2

    .line 1
    iget-object v0, p0, LX/v;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lgf/b;

    .line 4
    .line 5
    invoke-static {v0}, Lgf/b;->d(Lgf/b;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget v1, p0, LX/v;->d:I

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    .line 17
    .line 18
    .line 19
    throw v0
.end method

.method public d()V
    .locals 2

    .line 1
    iget-object v0, p0, LX/v;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LX/p;

    .line 4
    .line 5
    invoke-virtual {v0}, LX/p;->d()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget v1, p0, LX/v;->d:I

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    .line 17
    .line 18
    .line 19
    throw v0
.end method

.method public final hasNext()Z
    .locals 3

    .line 1
    iget v0, p0, LX/v;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, LX/v;->b:I

    .line 7
    .line 8
    iget v1, p0, LX/v;->d:I

    .line 9
    .line 10
    if-ge v0, v1, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    return v0

    .line 16
    :pswitch_0
    iget v0, p0, LX/v;->b:I

    .line 17
    .line 18
    iget-object v1, p0, LX/v;->e:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Lgf/b;

    .line 21
    .line 22
    iget v1, v1, Lgf/b;->b:I

    .line 23
    .line 24
    if-ge v0, v1, :cond_1

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    const/4 v0, 0x0

    .line 29
    :goto_1
    return v0

    .line 30
    :pswitch_1
    iget v0, p0, LX/v;->b:I

    .line 31
    .line 32
    iget-object v1, p0, LX/v;->e:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, Lgf/a;

    .line 35
    .line 36
    iget v1, v1, Lgf/a;->c:I

    .line 37
    .line 38
    if-ge v0, v1, :cond_2

    .line 39
    .line 40
    const/4 v0, 0x1

    .line 41
    goto :goto_2

    .line 42
    :cond_2
    const/4 v0, 0x0

    .line 43
    :goto_2
    return v0

    .line 44
    :pswitch_2
    iget v0, p0, LX/v;->b:I

    .line 45
    .line 46
    iget-object v1, p0, LX/v;->e:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v1, LX/p;

    .line 49
    .line 50
    invoke-virtual {v1}, LX/p;->size()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    const/4 v2, 0x1

    .line 55
    sub-int/2addr v1, v2

    .line 56
    if-ge v0, v1, :cond_3

    .line 57
    .line 58
    goto :goto_3

    .line 59
    :cond_3
    const/4 v2, 0x0

    .line 60
    :goto_3
    return v2

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final hasPrevious()Z
    .locals 2

    .line 1
    iget v0, p0, LX/v;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, LX/v;->b:I

    .line 7
    .line 8
    iget v1, p0, LX/v;->c:I

    .line 9
    .line 10
    if-le v0, v1, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    return v0

    .line 16
    :pswitch_0
    iget v0, p0, LX/v;->b:I

    .line 17
    .line 18
    if-lez v0, :cond_1

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    const/4 v0, 0x0

    .line 23
    :goto_1
    return v0

    .line 24
    :pswitch_1
    iget v0, p0, LX/v;->b:I

    .line 25
    .line 26
    if-lez v0, :cond_2

    .line 27
    .line 28
    const/4 v0, 0x1

    .line 29
    goto :goto_2

    .line 30
    :cond_2
    const/4 v0, 0x0

    .line 31
    :goto_2
    return v0

    .line 32
    :pswitch_2
    iget v0, p0, LX/v;->b:I

    .line 33
    .line 34
    if-ltz v0, :cond_3

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    goto :goto_3

    .line 38
    :cond_3
    const/4 v0, 0x0

    .line 39
    :goto_3
    return v0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, LX/v;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LX/v;->e:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lt0/h;

    .line 9
    .line 10
    iget-object v0, v0, Lt0/h;->a:[Ljava/lang/Object;

    .line 11
    .line 12
    iget v1, p0, LX/v;->b:I

    .line 13
    .line 14
    add-int/lit8 v2, v1, 0x1

    .line 15
    .line 16
    iput v2, p0, LX/v;->b:I

    .line 17
    .line 18
    aget-object v0, v0, v1

    .line 19
    .line 20
    return-object v0

    .line 21
    :pswitch_0
    invoke-virtual {p0}, LX/v;->c()V

    .line 22
    .line 23
    .line 24
    iget v0, p0, LX/v;->b:I

    .line 25
    .line 26
    iget-object v1, p0, LX/v;->e:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Lgf/b;

    .line 29
    .line 30
    iget v2, v1, Lgf/b;->b:I

    .line 31
    .line 32
    if-ge v0, v2, :cond_0

    .line 33
    .line 34
    add-int/lit8 v2, v0, 0x1

    .line 35
    .line 36
    iput v2, p0, LX/v;->b:I

    .line 37
    .line 38
    iput v0, p0, LX/v;->c:I

    .line 39
    .line 40
    iget-object v1, v1, Lgf/b;->a:[Ljava/lang/Object;

    .line 41
    .line 42
    aget-object v0, v1, v0

    .line 43
    .line 44
    return-object v0

    .line 45
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 46
    .line 47
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 48
    .line 49
    .line 50
    throw v0

    .line 51
    :pswitch_1
    invoke-virtual {p0}, LX/v;->a()V

    .line 52
    .line 53
    .line 54
    iget v0, p0, LX/v;->b:I

    .line 55
    .line 56
    iget-object v1, p0, LX/v;->e:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v1, Lgf/a;

    .line 59
    .line 60
    iget v2, v1, Lgf/a;->c:I

    .line 61
    .line 62
    if-ge v0, v2, :cond_1

    .line 63
    .line 64
    add-int/lit8 v2, v0, 0x1

    .line 65
    .line 66
    iput v2, p0, LX/v;->b:I

    .line 67
    .line 68
    iput v0, p0, LX/v;->c:I

    .line 69
    .line 70
    iget-object v2, v1, Lgf/a;->a:[Ljava/lang/Object;

    .line 71
    .line 72
    iget v1, v1, Lgf/a;->b:I

    .line 73
    .line 74
    add-int/2addr v1, v0

    .line 75
    aget-object v0, v2, v1

    .line 76
    .line 77
    return-object v0

    .line 78
    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 79
    .line 80
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 81
    .line 82
    .line 83
    throw v0

    .line 84
    :pswitch_2
    invoke-virtual {p0}, LX/v;->d()V

    .line 85
    .line 86
    .line 87
    iget v0, p0, LX/v;->b:I

    .line 88
    .line 89
    add-int/lit8 v0, v0, 0x1

    .line 90
    .line 91
    iput v0, p0, LX/v;->c:I

    .line 92
    .line 93
    iget-object v1, p0, LX/v;->e:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v1, LX/p;

    .line 96
    .line 97
    invoke-virtual {v1}, LX/p;->size()I

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    invoke-static {v0, v2}, LX/q;->a(II)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1, v0}, LX/p;->get(I)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    iput v0, p0, LX/v;->b:I

    .line 109
    .line 110
    return-object v1

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final nextIndex()I
    .locals 2

    .line 1
    iget v0, p0, LX/v;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, LX/v;->b:I

    .line 7
    .line 8
    iget v1, p0, LX/v;->c:I

    .line 9
    .line 10
    sub-int/2addr v0, v1

    .line 11
    return v0

    .line 12
    :pswitch_0
    iget v0, p0, LX/v;->b:I

    .line 13
    .line 14
    return v0

    .line 15
    :pswitch_1
    iget v0, p0, LX/v;->b:I

    .line 16
    .line 17
    return v0

    .line 18
    :pswitch_2
    iget v0, p0, LX/v;->b:I

    .line 19
    .line 20
    add-int/lit8 v0, v0, 0x1

    .line 21
    .line 22
    return v0

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final previous()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, LX/v;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LX/v;->e:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lt0/h;

    .line 9
    .line 10
    iget-object v0, v0, Lt0/h;->a:[Ljava/lang/Object;

    .line 11
    .line 12
    iget v1, p0, LX/v;->b:I

    .line 13
    .line 14
    add-int/lit8 v1, v1, -0x1

    .line 15
    .line 16
    iput v1, p0, LX/v;->b:I

    .line 17
    .line 18
    aget-object v0, v0, v1

    .line 19
    .line 20
    return-object v0

    .line 21
    :pswitch_0
    invoke-virtual {p0}, LX/v;->c()V

    .line 22
    .line 23
    .line 24
    iget v0, p0, LX/v;->b:I

    .line 25
    .line 26
    if-lez v0, :cond_0

    .line 27
    .line 28
    add-int/lit8 v0, v0, -0x1

    .line 29
    .line 30
    iput v0, p0, LX/v;->b:I

    .line 31
    .line 32
    iput v0, p0, LX/v;->c:I

    .line 33
    .line 34
    iget-object v1, p0, LX/v;->e:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v1, Lgf/b;

    .line 37
    .line 38
    iget-object v1, v1, Lgf/b;->a:[Ljava/lang/Object;

    .line 39
    .line 40
    aget-object v0, v1, v0

    .line 41
    .line 42
    return-object v0

    .line 43
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 44
    .line 45
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 46
    .line 47
    .line 48
    throw v0

    .line 49
    :pswitch_1
    invoke-virtual {p0}, LX/v;->a()V

    .line 50
    .line 51
    .line 52
    iget v0, p0, LX/v;->b:I

    .line 53
    .line 54
    if-lez v0, :cond_1

    .line 55
    .line 56
    add-int/lit8 v0, v0, -0x1

    .line 57
    .line 58
    iput v0, p0, LX/v;->b:I

    .line 59
    .line 60
    iput v0, p0, LX/v;->c:I

    .line 61
    .line 62
    iget-object v1, p0, LX/v;->e:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v1, Lgf/a;

    .line 65
    .line 66
    iget-object v2, v1, Lgf/a;->a:[Ljava/lang/Object;

    .line 67
    .line 68
    iget v1, v1, Lgf/a;->b:I

    .line 69
    .line 70
    add-int/2addr v1, v0

    .line 71
    aget-object v0, v2, v1

    .line 72
    .line 73
    return-object v0

    .line 74
    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 75
    .line 76
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 77
    .line 78
    .line 79
    throw v0

    .line 80
    :pswitch_2
    invoke-virtual {p0}, LX/v;->d()V

    .line 81
    .line 82
    .line 83
    iget v0, p0, LX/v;->b:I

    .line 84
    .line 85
    iget-object v1, p0, LX/v;->e:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v1, LX/p;

    .line 88
    .line 89
    invoke-virtual {v1}, LX/p;->size()I

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    invoke-static {v0, v2}, LX/q;->a(II)V

    .line 94
    .line 95
    .line 96
    iget v0, p0, LX/v;->b:I

    .line 97
    .line 98
    iput v0, p0, LX/v;->c:I

    .line 99
    .line 100
    invoke-virtual {v1, v0}, LX/p;->get(I)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    iget v1, p0, LX/v;->b:I

    .line 105
    .line 106
    add-int/lit8 v1, v1, -0x1

    .line 107
    .line 108
    iput v1, p0, LX/v;->b:I

    .line 109
    .line 110
    return-object v0

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final previousIndex()I
    .locals 2

    .line 1
    iget v0, p0, LX/v;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, LX/v;->b:I

    .line 7
    .line 8
    iget v1, p0, LX/v;->c:I

    .line 9
    .line 10
    sub-int/2addr v0, v1

    .line 11
    add-int/lit8 v0, v0, -0x1

    .line 12
    .line 13
    return v0

    .line 14
    :pswitch_0
    iget v0, p0, LX/v;->b:I

    .line 15
    .line 16
    add-int/lit8 v0, v0, -0x1

    .line 17
    .line 18
    return v0

    .line 19
    :pswitch_1
    iget v0, p0, LX/v;->b:I

    .line 20
    .line 21
    add-int/lit8 v0, v0, -0x1

    .line 22
    .line 23
    return v0

    .line 24
    :pswitch_2
    iget v0, p0, LX/v;->b:I

    .line 25
    .line 26
    return v0

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final remove()V
    .locals 3

    .line 1
    iget v0, p0, LX/v;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 7
    .line 8
    const-string v1, "Operation is not supported for read-only collection"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0

    .line 14
    :pswitch_0
    invoke-virtual {p0}, LX/v;->c()V

    .line 15
    .line 16
    .line 17
    iget v0, p0, LX/v;->c:I

    .line 18
    .line 19
    const/4 v1, -0x1

    .line 20
    if-eq v0, v1, :cond_0

    .line 21
    .line 22
    iget-object v2, p0, LX/v;->e:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v2, Lgf/b;

    .line 25
    .line 26
    invoke-virtual {v2, v0}, Lgf/b;->c(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    iget v0, p0, LX/v;->c:I

    .line 30
    .line 31
    iput v0, p0, LX/v;->b:I

    .line 32
    .line 33
    iput v1, p0, LX/v;->c:I

    .line 34
    .line 35
    invoke-static {v2}, Lgf/b;->d(Lgf/b;)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    iput v0, p0, LX/v;->d:I

    .line 40
    .line 41
    return-void

    .line 42
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string v1, "Call next() or previous() before removing element from the iterator."

    .line 45
    .line 46
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw v0

    .line 50
    :pswitch_1
    invoke-virtual {p0}, LX/v;->a()V

    .line 51
    .line 52
    .line 53
    iget v0, p0, LX/v;->c:I

    .line 54
    .line 55
    const/4 v1, -0x1

    .line 56
    if-eq v0, v1, :cond_1

    .line 57
    .line 58
    iget-object v2, p0, LX/v;->e:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v2, Lgf/a;

    .line 61
    .line 62
    invoke-virtual {v2, v0}, Lgf/a;->c(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    iget v0, p0, LX/v;->c:I

    .line 66
    .line 67
    iput v0, p0, LX/v;->b:I

    .line 68
    .line 69
    iput v1, p0, LX/v;->c:I

    .line 70
    .line 71
    invoke-static {v2}, Lgf/a;->d(Lgf/a;)I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    iput v0, p0, LX/v;->d:I

    .line 76
    .line 77
    return-void

    .line 78
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 79
    .line 80
    const-string v1, "Call next() or previous() before removing element from the iterator."

    .line 81
    .line 82
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    throw v0

    .line 86
    :pswitch_2
    invoke-virtual {p0}, LX/v;->d()V

    .line 87
    .line 88
    .line 89
    iget v0, p0, LX/v;->b:I

    .line 90
    .line 91
    iget-object v1, p0, LX/v;->e:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v1, LX/p;

    .line 94
    .line 95
    invoke-virtual {v1, v0}, LX/p;->remove(I)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    iget v0, p0, LX/v;->b:I

    .line 99
    .line 100
    const/4 v2, -0x1

    .line 101
    add-int/2addr v0, v2

    .line 102
    iput v0, p0, LX/v;->b:I

    .line 103
    .line 104
    iput v2, p0, LX/v;->c:I

    .line 105
    .line 106
    invoke-virtual {v1}, LX/p;->d()I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    iput v0, p0, LX/v;->d:I

    .line 111
    .line 112
    return-void

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final set(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, LX/v;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 7
    .line 8
    const-string v0, "Operation is not supported for read-only collection"

    .line 9
    .line 10
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p1

    .line 14
    :pswitch_0
    invoke-virtual {p0}, LX/v;->c()V

    .line 15
    .line 16
    .line 17
    iget v0, p0, LX/v;->c:I

    .line 18
    .line 19
    const/4 v1, -0x1

    .line 20
    if-eq v0, v1, :cond_0

    .line 21
    .line 22
    iget-object v1, p0, LX/v;->e:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, Lgf/b;

    .line 25
    .line 26
    invoke-virtual {v1, v0, p1}, Lgf/b;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 31
    .line 32
    const-string v0, "Call next() or previous() before replacing element from the iterator."

    .line 33
    .line 34
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p1

    .line 38
    :pswitch_1
    invoke-virtual {p0}, LX/v;->a()V

    .line 39
    .line 40
    .line 41
    iget v0, p0, LX/v;->c:I

    .line 42
    .line 43
    const/4 v1, -0x1

    .line 44
    if-eq v0, v1, :cond_1

    .line 45
    .line 46
    iget-object v1, p0, LX/v;->e:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v1, Lgf/a;

    .line 49
    .line 50
    invoke-virtual {v1, v0, p1}, Lgf/a;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    const-string v0, "Call next() or previous() before replacing element from the iterator."

    .line 57
    .line 58
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw p1

    .line 62
    :pswitch_2
    invoke-virtual {p0}, LX/v;->d()V

    .line 63
    .line 64
    .line 65
    iget v0, p0, LX/v;->c:I

    .line 66
    .line 67
    if-ltz v0, :cond_2

    .line 68
    .line 69
    iget-object v1, p0, LX/v;->e:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v1, LX/p;

    .line 72
    .line 73
    invoke-virtual {v1, v0, p1}, LX/p;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1}, LX/p;->d()I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    iput p1, p0, LX/v;->d:I

    .line 81
    .line 82
    return-void

    .line 83
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 84
    .line 85
    const-string v0, "Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()"

    .line 86
    .line 87
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    throw p1

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
