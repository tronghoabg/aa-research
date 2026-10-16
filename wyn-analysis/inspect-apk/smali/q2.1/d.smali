.class public final Lq2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public final synthetic a:I

.field public final b:Landroid/os/Handler;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lq2/e;Ld2/j;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lq2/d;->a:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq2/d;->c:Ljava/lang/Object;

    .line 5
    invoke-static {p0}, LQ1/x;->m(Landroid/os/Handler$Callback;)Landroid/os/Handler;

    move-result-object p1

    iput-object p1, p0, Lq2/d;->b:Landroid/os/Handler;

    .line 6
    invoke-interface {p2, p0, p1}, Ld2/j;->L(Lq2/d;Landroid/os/Handler;)V

    return-void
.end method

.method public constructor <init>(Lv6/f;LV5/k;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lq2/d;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq2/d;->c:Ljava/lang/Object;

    .line 2
    invoke-static {p0}, Lu6/v;->j(Lq2/d;)Landroid/os/Handler;

    move-result-object p1

    iput-object p1, p0, Lq2/d;->b:Landroid/os/Handler;

    .line 3
    invoke-interface {p2, p0, p1}, LV5/k;->v(Lq2/d;Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method public a(J)V
    .locals 10

    .line 1
    iget-object v0, p0, Lq2/d;->c:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, Lq2/e;

    .line 5
    .line 6
    iget-object v0, v1, Lq2/e;->h1:Lq2/d;

    .line 7
    .line 8
    if-ne p0, v0, :cond_6

    .line 9
    .line 10
    iget-object v0, v1, Ld2/q;->K:Ld2/j;

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    const-wide v2, 0x7fffffffffffffffL

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    cmp-long v0, p1, v2

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    iput-boolean v2, v1, Ld2/q;->v0:Z

    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    :try_start_0
    invoke-virtual {v1, p1, p2}, Ld2/q;->F0(J)V

    .line 29
    .line 30
    .line 31
    iget-object v0, v1, Lq2/e;->c1:LN1/Y;

    .line 32
    .line 33
    sget-object v3, LN1/Y;->d:LN1/Y;

    .line 34
    .line 35
    invoke-virtual {v0, v3}, LN1/Y;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    iget-object v5, v1, Lq2/e;->E0:LX2/j;

    .line 40
    .line 41
    if-nez v3, :cond_2

    .line 42
    .line 43
    iget-object v3, v1, Lq2/e;->d1:LN1/Y;

    .line 44
    .line 45
    invoke-virtual {v0, v3}, LN1/Y;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-nez v3, :cond_2

    .line 50
    .line 51
    iput-object v0, v1, Lq2/e;->d1:LN1/Y;

    .line 52
    .line 53
    invoke-virtual {v5, v0}, LX2/j;->Y(LN1/Y;)V

    .line 54
    .line 55
    .line 56
    :cond_2
    iget-object v0, v1, Ld2/q;->x0:LH5/e;

    .line 57
    .line 58
    iget v3, v0, LH5/e;->f:I

    .line 59
    .line 60
    add-int/2addr v3, v2

    .line 61
    iput v3, v0, LH5/e;->f:I

    .line 62
    .line 63
    iget-object v0, v1, Lq2/e;->H0:Lq2/m;

    .line 64
    .line 65
    iget v3, v0, Lq2/m;->d:I

    .line 66
    .line 67
    const/4 v4, 0x3

    .line 68
    if-eq v3, v4, :cond_3

    .line 69
    .line 70
    move v3, v2

    .line 71
    goto :goto_0

    .line 72
    :cond_3
    const/4 v3, 0x0

    .line 73
    :goto_0
    iput v4, v0, Lq2/m;->d:I

    .line 74
    .line 75
    iget-object v4, v0, Lq2/m;->k:LQ1/q;

    .line 76
    .line 77
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 81
    .line 82
    .line 83
    move-result-wide v6

    .line 84
    invoke-static {v6, v7}, LQ1/x;->K(J)J

    .line 85
    .line 86
    .line 87
    move-result-wide v6

    .line 88
    iput-wide v6, v0, Lq2/m;->f:J

    .line 89
    .line 90
    if-eqz v3, :cond_5

    .line 91
    .line 92
    iget-object v6, v1, Lq2/e;->P0:Landroid/view/Surface;

    .line 93
    .line 94
    if-eqz v6, :cond_5

    .line 95
    .line 96
    iget-object v0, v5, LX2/j;->b:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v0, Landroid/os/Handler;

    .line 99
    .line 100
    if-eqz v0, :cond_4

    .line 101
    .line 102
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 103
    .line 104
    .line 105
    move-result-wide v7

    .line 106
    new-instance v4, Lcom/applovin/impl/W;

    .line 107
    .line 108
    const/4 v9, 0x2

    .line 109
    invoke-direct/range {v4 .. v9}, Lcom/applovin/impl/W;-><init>(Ljava/lang/Object;Ljava/lang/Object;JI)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 113
    .line 114
    .line 115
    :cond_4
    iput-boolean v2, v1, Lq2/e;->S0:Z

    .line 116
    .line 117
    :cond_5
    invoke-virtual {v1, p1, p2}, Lq2/e;->m0(J)V
    :try_end_0
    .catch LU1/j; {:try_start_0 .. :try_end_0} :catch_0

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :catch_0
    move-exception v0

    .line 122
    move-object p1, v0

    .line 123
    iput-object p1, v1, Ld2/q;->w0:LU1/j;

    .line 124
    .line 125
    :cond_6
    :goto_1
    return-void
.end method

.method public final handleMessage(Landroid/os/Message;)Z
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    const/16 v1, 0x20

    .line 3
    .line 4
    const-wide v2, 0xffffffffL

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    iget v5, p0, Lq2/d;->a:I

    .line 11
    .line 12
    packed-switch v5, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iget v5, p1, Landroid/os/Message;->what:I

    .line 16
    .line 17
    if-eqz v5, :cond_0

    .line 18
    .line 19
    move v0, v4

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget v4, p1, Landroid/os/Message;->arg1:I

    .line 22
    .line 23
    iget p1, p1, Landroid/os/Message;->arg2:I

    .line 24
    .line 25
    sget v5, Lu6/v;->a:I

    .line 26
    .line 27
    int-to-long v4, v4

    .line 28
    and-long/2addr v4, v2

    .line 29
    shl-long/2addr v4, v1

    .line 30
    int-to-long v6, p1

    .line 31
    and-long/2addr v2, v6

    .line 32
    or-long/2addr v2, v4

    .line 33
    iget-object p1, p0, Lq2/d;->c:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, Lv6/f;

    .line 36
    .line 37
    iget-object v1, p1, Lv6/f;->l1:Lq2/d;

    .line 38
    .line 39
    if-eq p0, v1, :cond_1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    const-wide v4, 0x7fffffffffffffffL

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    cmp-long v1, v2, v4

    .line 48
    .line 49
    if-nez v1, :cond_2

    .line 50
    .line 51
    iput-boolean v0, p1, LV5/q;->x0:Z

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    :try_start_0
    invoke-virtual {p1, v2, v3}, LV5/q;->o0(J)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Lv6/f;->w0()V

    .line 58
    .line 59
    .line 60
    iget-object v1, p1, LV5/q;->z0:LH5/e;

    .line 61
    .line 62
    iget v4, v1, LH5/e;->f:I

    .line 63
    .line 64
    add-int/2addr v4, v0

    .line 65
    iput v4, v1, LH5/e;->f:I

    .line 66
    .line 67
    invoke-virtual {p1}, Lv6/f;->v0()V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, v2, v3}, Lv6/f;->X(J)V
    :try_end_0
    .catch LE5/o; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :catch_0
    move-exception v1

    .line 75
    iput-object v1, p1, LV5/q;->y0:LE5/o;

    .line 76
    .line 77
    :goto_0
    return v0

    .line 78
    :pswitch_0
    iget v5, p1, Landroid/os/Message;->what:I

    .line 79
    .line 80
    if-eqz v5, :cond_3

    .line 81
    .line 82
    move v0, v4

    .line 83
    goto :goto_1

    .line 84
    :cond_3
    iget v4, p1, Landroid/os/Message;->arg1:I

    .line 85
    .line 86
    iget p1, p1, Landroid/os/Message;->arg2:I

    .line 87
    .line 88
    sget v5, LQ1/x;->a:I

    .line 89
    .line 90
    int-to-long v4, v4

    .line 91
    and-long/2addr v4, v2

    .line 92
    shl-long/2addr v4, v1

    .line 93
    int-to-long v6, p1

    .line 94
    and-long/2addr v2, v6

    .line 95
    or-long/2addr v2, v4

    .line 96
    invoke-virtual {p0, v2, v3}, Lq2/d;->a(J)V

    .line 97
    .line 98
    .line 99
    :goto_1
    return v0

    .line 100
    nop

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
