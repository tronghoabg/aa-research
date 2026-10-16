.class public final Lp0/q;
.super Lp0/n;
.source "SourceFile"


# instance fields
.field public c:I

.field public final synthetic d:Lp0/r;


# direct methods
.method public constructor <init>(Lp0/r;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp0/q;->d:Lp0/r;

    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    iput p1, p0, Lp0/q;->c:I

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final A(Lp0/f;)V
    .locals 10

    .line 1
    iget-object v0, p1, Lp0/f;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

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
    const/4 v4, 0x1

    .line 10
    const-string v5, "layoutCoordinates not set"

    .line 11
    .line 12
    const/4 v6, 0x2

    .line 13
    iget-object v7, p0, Lp0/q;->d:Lp0/r;

    .line 14
    .line 15
    if-ge v3, v1, :cond_3

    .line 16
    .line 17
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v8

    .line 21
    check-cast v8, Lp0/k;

    .line 22
    .line 23
    invoke-virtual {v8}, Lp0/k;->b()Z

    .line 24
    .line 25
    .line 26
    move-result v8

    .line 27
    if-eqz v8, :cond_2

    .line 28
    .line 29
    iget v0, p0, Lp0/q;->c:I

    .line 30
    .line 31
    if-ne v0, v6, :cond_1

    .line 32
    .line 33
    iget-object v0, p0, Lp0/n;->a:Lr0/k;

    .line 34
    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    sget-wide v1, Ld0/c;->b:J

    .line 38
    .line 39
    check-cast v0, Lt0/y;

    .line 40
    .line 41
    invoke-virtual {v0, v1, v2}, Lt0/y;->W(J)J

    .line 42
    .line 43
    .line 44
    move-result-wide v0

    .line 45
    new-instance v2, Lp0/p;

    .line 46
    .line 47
    const/4 v3, 0x0

    .line 48
    invoke-direct {v2, v7, v3}, Lp0/p;-><init>(Lp0/r;I)V

    .line 49
    .line 50
    .line 51
    invoke-static {p1, v0, v1, v2, v4}, Lcom/moloco/sdk/internal/publisher/H;->u0(Lp0/f;JLtf/l;Z)V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 56
    .line 57
    invoke-direct {p1, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p1

    .line 61
    :cond_1
    :goto_1
    const/4 p1, 0x3

    .line 62
    iput p1, p0, Lp0/q;->c:I

    .line 63
    .line 64
    return-void

    .line 65
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    iget-object v1, p0, Lp0/n;->a:Lr0/k;

    .line 69
    .line 70
    if-eqz v1, :cond_7

    .line 71
    .line 72
    sget-wide v8, Ld0/c;->b:J

    .line 73
    .line 74
    check-cast v1, Lt0/y;

    .line 75
    .line 76
    invoke-virtual {v1, v8, v9}, Lt0/y;->W(J)J

    .line 77
    .line 78
    .line 79
    move-result-wide v8

    .line 80
    new-instance v1, LA/W;

    .line 81
    .line 82
    const/16 v3, 0x15

    .line 83
    .line 84
    invoke-direct {v1, v3, p0, v7}, LA/W;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    invoke-static {p1, v8, v9, v1, v2}, Lcom/moloco/sdk/internal/publisher/H;->u0(Lp0/f;JLtf/l;Z)V

    .line 88
    .line 89
    .line 90
    iget v1, p0, Lp0/q;->c:I

    .line 91
    .line 92
    if-ne v1, v6, :cond_6

    .line 93
    .line 94
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    :goto_2
    if-ge v2, v1, :cond_4

    .line 99
    .line 100
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    check-cast v3, Lp0/k;

    .line 105
    .line 106
    invoke-virtual {v3}, Lp0/k;->a()V

    .line 107
    .line 108
    .line 109
    add-int/lit8 v2, v2, 0x1

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_4
    iget-object p1, p1, Lp0/f;->b:LE5/b;

    .line 113
    .line 114
    if-nez p1, :cond_5

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_5
    iget-boolean v0, v7, Lp0/r;->c:Z

    .line 118
    .line 119
    xor-int/2addr v0, v4

    .line 120
    iput-boolean v0, p1, LE5/b;->b:Z

    .line 121
    .line 122
    :cond_6
    :goto_3
    return-void

    .line 123
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 124
    .line 125
    invoke-direct {p1, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    throw p1
.end method

.method public final a()V
    .locals 10

    .line 1
    iget v0, p0, Lp0/q;->c:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 7
    .line 8
    .line 9
    move-result-wide v2

    .line 10
    new-instance v0, Lp0/p;

    .line 11
    .line 12
    iget-object v1, p0, Lp0/q;->d:Lp0/r;

    .line 13
    .line 14
    const/4 v4, 0x1

    .line 15
    invoke-direct {v0, v1, v4}, Lp0/p;-><init>(Lp0/r;I)V

    .line 16
    .line 17
    .line 18
    const/4 v8, 0x0

    .line 19
    const/4 v9, 0x0

    .line 20
    const/4 v6, 0x3

    .line 21
    const/4 v7, 0x0

    .line 22
    move-wide v4, v2

    .line 23
    invoke-static/range {v2 .. v9}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const/4 v3, 0x0

    .line 28
    invoke-virtual {v2, v3}, Landroid/view/MotionEvent;->setSource(I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v2}, Lp0/p;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Landroid/view/MotionEvent;->recycle()V

    .line 35
    .line 36
    .line 37
    const/4 v0, 0x1

    .line 38
    iput v0, p0, Lp0/q;->c:I

    .line 39
    .line 40
    iput-boolean v3, v1, Lp0/r;->c:Z

    .line 41
    .line 42
    :cond_0
    return-void
.end method

.method public final n(Lp0/f;Lp0/g;J)V
    .locals 6

    .line 1
    const-string p3, "pointerEvent"

    .line 2
    .line 3
    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p3, p0, Lp0/q;->d:Lp0/r;

    .line 7
    .line 8
    iget-boolean p4, p3, Lp0/r;->c:Z

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    const/4 v1, 0x1

    .line 12
    iget-object v2, p1, Lp0/f;->a:Ljava/util/List;

    .line 13
    .line 14
    if-nez p4, :cond_2

    .line 15
    .line 16
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 17
    .line 18
    .line 19
    move-result p4

    .line 20
    move v3, v0

    .line 21
    :goto_0
    if-ge v3, p4, :cond_1

    .line 22
    .line 23
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    check-cast v4, Lp0/k;

    .line 28
    .line 29
    invoke-static {v4}, Landroid/support/v4/media/session/b;->N(Lp0/k;)Z

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    if-nez v5, :cond_2

    .line 34
    .line 35
    invoke-static {v4}, Landroid/support/v4/media/session/b;->P(Lp0/k;)Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_0

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    move p4, v0

    .line 46
    goto :goto_2

    .line 47
    :cond_2
    :goto_1
    move p4, v1

    .line 48
    :goto_2
    iget v3, p0, Lp0/q;->c:I

    .line 49
    .line 50
    sget-object v4, Lp0/g;->c:Lp0/g;

    .line 51
    .line 52
    const/4 v5, 0x3

    .line 53
    if-eq v3, v5, :cond_4

    .line 54
    .line 55
    sget-object v3, Lp0/g;->a:Lp0/g;

    .line 56
    .line 57
    if-ne p2, v3, :cond_3

    .line 58
    .line 59
    if-eqz p4, :cond_3

    .line 60
    .line 61
    invoke-virtual {p0, p1}, Lp0/q;->A(Lp0/f;)V

    .line 62
    .line 63
    .line 64
    :cond_3
    if-ne p2, v4, :cond_4

    .line 65
    .line 66
    if-nez p4, :cond_4

    .line 67
    .line 68
    invoke-virtual {p0, p1}, Lp0/q;->A(Lp0/f;)V

    .line 69
    .line 70
    .line 71
    :cond_4
    if-ne p2, v4, :cond_7

    .line 72
    .line 73
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    move p2, v0

    .line 78
    :goto_3
    if-ge p2, p1, :cond_6

    .line 79
    .line 80
    invoke-interface {v2, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p4

    .line 84
    check-cast p4, Lp0/k;

    .line 85
    .line 86
    invoke-static {p4}, Landroid/support/v4/media/session/b;->P(Lp0/k;)Z

    .line 87
    .line 88
    .line 89
    move-result p4

    .line 90
    if-nez p4, :cond_5

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_5
    add-int/lit8 p2, p2, 0x1

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_6
    iput v1, p0, Lp0/q;->c:I

    .line 97
    .line 98
    iput-boolean v0, p3, Lp0/r;->c:Z

    .line 99
    .line 100
    :cond_7
    :goto_4
    return-void
.end method
