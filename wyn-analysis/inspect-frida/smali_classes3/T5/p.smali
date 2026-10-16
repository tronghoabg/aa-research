.class public final LT5/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT5/f;
.implements LY2/h;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/String;

.field public c:Z

.field public final d:[Z

.field public e:J

.field public f:J

.field public final g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public final j:Ljava/lang/Object;

.field public final k:Ljava/lang/Object;

.field public final l:Ljava/lang/Object;

.field public final m:Ljava/lang/Object;

.field public final n:Ljava/lang/Object;

.field public final o:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LS3/s;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, LT5/p;->a:I

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, LT5/p;->g:Ljava/lang/Object;

    const/4 p1, 0x3

    .line 13
    new-array p1, p1, [Z

    iput-object p1, p0, LT5/p;->d:[Z

    .line 14
    new-instance p1, LT5/s;

    const/16 v0, 0x20

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, LT5/s;-><init>(II)V

    iput-object p1, p0, LT5/p;->j:Ljava/lang/Object;

    .line 15
    new-instance p1, LT5/s;

    const/16 v0, 0x21

    invoke-direct {p1, v0, v1}, LT5/s;-><init>(II)V

    iput-object p1, p0, LT5/p;->k:Ljava/lang/Object;

    .line 16
    new-instance p1, LT5/s;

    const/16 v0, 0x22

    invoke-direct {p1, v0, v1}, LT5/s;-><init>(II)V

    iput-object p1, p0, LT5/p;->l:Ljava/lang/Object;

    .line 17
    new-instance p1, LT5/s;

    const/16 v0, 0x27

    invoke-direct {p1, v0, v1}, LT5/s;-><init>(II)V

    iput-object p1, p0, LT5/p;->m:Ljava/lang/Object;

    .line 18
    new-instance p1, LT5/s;

    const/16 v0, 0x28

    invoke-direct {p1, v0, v1}, LT5/s;-><init>(II)V

    iput-object p1, p0, LT5/p;->n:Ljava/lang/Object;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 19
    iput-wide v0, p0, LT5/p;->f:J

    .line 20
    new-instance p1, LY4/b;

    invoke-direct {p1}, LY4/b;-><init>()V

    iput-object p1, p0, LT5/p;->o:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lb7/k;)V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, LT5/p;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LT5/p;->g:Ljava/lang/Object;

    const/4 p1, 0x3

    .line 3
    new-array p1, p1, [Z

    iput-object p1, p0, LT5/p;->d:[Z

    .line 4
    new-instance p1, LT5/s;

    const/16 v0, 0x20

    const/4 v1, 0x1

    invoke-direct {p1, v0, v1}, LT5/s;-><init>(II)V

    iput-object p1, p0, LT5/p;->j:Ljava/lang/Object;

    .line 5
    new-instance p1, LT5/s;

    const/16 v0, 0x21

    invoke-direct {p1, v0, v1}, LT5/s;-><init>(II)V

    iput-object p1, p0, LT5/p;->k:Ljava/lang/Object;

    .line 6
    new-instance p1, LT5/s;

    const/16 v0, 0x22

    invoke-direct {p1, v0, v1}, LT5/s;-><init>(II)V

    iput-object p1, p0, LT5/p;->l:Ljava/lang/Object;

    .line 7
    new-instance p1, LT5/s;

    const/16 v0, 0x27

    invoke-direct {p1, v0, v1}, LT5/s;-><init>(II)V

    iput-object p1, p0, LT5/p;->m:Ljava/lang/Object;

    .line 8
    new-instance p1, LT5/s;

    const/16 v0, 0x28

    invoke-direct {p1, v0, v1}, LT5/s;-><init>(II)V

    iput-object p1, p0, LT5/p;->n:Ljava/lang/Object;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 9
    iput-wide v0, p0, LT5/p;->f:J

    .line 10
    new-instance p1, LQ1/o;

    invoke-direct {p1}, LQ1/o;-><init>()V

    iput-object p1, p0, LT5/p;->o:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget v0, p0, LT5/p;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    iput-wide v0, p0, LT5/p;->e:J

    .line 9
    .line 10
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    iput-wide v0, p0, LT5/p;->f:J

    .line 16
    .line 17
    iget-object v0, p0, LT5/p;->d:[Z

    .line 18
    .line 19
    invoke-static {v0}, LR1/n;->a([Z)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, LT5/p;->j:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, LT5/s;

    .line 25
    .line 26
    invoke-virtual {v0}, LT5/s;->d()V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, LT5/p;->k:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, LT5/s;

    .line 32
    .line 33
    invoke-virtual {v0}, LT5/s;->d()V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, LT5/p;->l:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, LT5/s;

    .line 39
    .line 40
    invoke-virtual {v0}, LT5/s;->d()V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, LT5/p;->m:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, LT5/s;

    .line 46
    .line 47
    invoke-virtual {v0}, LT5/s;->d()V

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, LT5/p;->n:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, LT5/s;

    .line 53
    .line 54
    invoke-virtual {v0}, LT5/s;->d()V

    .line 55
    .line 56
    .line 57
    iget-object v0, p0, LT5/p;->g:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v0, Lb7/k;

    .line 60
    .line 61
    iget-object v0, v0, Lb7/k;->d:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v0, LR1/q;

    .line 64
    .line 65
    const/4 v1, 0x0

    .line 66
    invoke-virtual {v0, v1}, LR1/q;->p(I)V

    .line 67
    .line 68
    .line 69
    iget-object v0, p0, LT5/p;->i:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v0, LT5/o;

    .line 72
    .line 73
    if-eqz v0, :cond_0

    .line 74
    .line 75
    iput-boolean v1, v0, LT5/o;->e:Z

    .line 76
    .line 77
    iput-boolean v1, v0, LT5/o;->f:Z

    .line 78
    .line 79
    iput-boolean v1, v0, LT5/o;->g:Z

    .line 80
    .line 81
    iput-boolean v1, v0, LT5/o;->h:Z

    .line 82
    .line 83
    iput-boolean v1, v0, LT5/o;->i:Z

    .line 84
    .line 85
    :cond_0
    return-void

    .line 86
    :pswitch_0
    const-wide/16 v0, 0x0

    .line 87
    .line 88
    iput-wide v0, p0, LT5/p;->e:J

    .line 89
    .line 90
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    iput-wide v0, p0, LT5/p;->f:J

    .line 96
    .line 97
    iget-object v0, p0, LT5/p;->d:[Z

    .line 98
    .line 99
    invoke-static {v0}, Lu6/a;->l([Z)V

    .line 100
    .line 101
    .line 102
    iget-object v0, p0, LT5/p;->j:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v0, LT5/s;

    .line 105
    .line 106
    invoke-virtual {v0}, LT5/s;->d()V

    .line 107
    .line 108
    .line 109
    iget-object v0, p0, LT5/p;->k:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v0, LT5/s;

    .line 112
    .line 113
    invoke-virtual {v0}, LT5/s;->d()V

    .line 114
    .line 115
    .line 116
    iget-object v0, p0, LT5/p;->l:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v0, LT5/s;

    .line 119
    .line 120
    invoke-virtual {v0}, LT5/s;->d()V

    .line 121
    .line 122
    .line 123
    iget-object v0, p0, LT5/p;->m:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v0, LT5/s;

    .line 126
    .line 127
    invoke-virtual {v0}, LT5/s;->d()V

    .line 128
    .line 129
    .line 130
    iget-object v0, p0, LT5/p;->n:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v0, LT5/s;

    .line 133
    .line 134
    invoke-virtual {v0}, LT5/s;->d()V

    .line 135
    .line 136
    .line 137
    iget-object v0, p0, LT5/p;->i:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v0, LT5/o;

    .line 140
    .line 141
    if-eqz v0, :cond_1

    .line 142
    .line 143
    const/4 v1, 0x0

    .line 144
    iput-boolean v1, v0, LT5/o;->e:Z

    .line 145
    .line 146
    iput-boolean v1, v0, LT5/o;->f:Z

    .line 147
    .line 148
    iput-boolean v1, v0, LT5/o;->g:Z

    .line 149
    .line 150
    iput-boolean v1, v0, LT5/o;->h:Z

    .line 151
    .line 152
    iput-boolean v1, v0, LT5/o;->i:Z

    .line 153
    .line 154
    :cond_1
    return-void

    .line 155
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(II[B)V
    .locals 3

    .line 1
    iget v0, p0, LT5/p;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LT5/p;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LT5/o;

    .line 9
    .line 10
    iget-boolean v1, v0, LT5/o;->e:Z

    .line 11
    .line 12
    if-eqz v1, :cond_2

    .line 13
    .line 14
    add-int/lit8 v1, p1, 0x2

    .line 15
    .line 16
    iget v2, v0, LT5/o;->c:I

    .line 17
    .line 18
    sub-int/2addr v1, v2

    .line 19
    if-ge v1, p2, :cond_1

    .line 20
    .line 21
    aget-byte v1, p3, v1

    .line 22
    .line 23
    and-int/lit16 v1, v1, 0x80

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move v1, v2

    .line 31
    :goto_0
    iput-boolean v1, v0, LT5/o;->f:Z

    .line 32
    .line 33
    iput-boolean v2, v0, LT5/o;->e:Z

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    sub-int v1, p2, p1

    .line 37
    .line 38
    add-int/2addr v1, v2

    .line 39
    iput v1, v0, LT5/o;->c:I

    .line 40
    .line 41
    :cond_2
    :goto_1
    iget-boolean v0, p0, LT5/p;->c:Z

    .line 42
    .line 43
    if-nez v0, :cond_3

    .line 44
    .line 45
    iget-object v0, p0, LT5/p;->j:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, LT5/s;

    .line 48
    .line 49
    invoke-virtual {v0, p1, p2, p3}, LT5/s;->a(II[B)V

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, LT5/p;->k:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, LT5/s;

    .line 55
    .line 56
    invoke-virtual {v0, p1, p2, p3}, LT5/s;->a(II[B)V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, LT5/p;->l:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v0, LT5/s;

    .line 62
    .line 63
    invoke-virtual {v0, p1, p2, p3}, LT5/s;->a(II[B)V

    .line 64
    .line 65
    .line 66
    :cond_3
    iget-object v0, p0, LT5/p;->m:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v0, LT5/s;

    .line 69
    .line 70
    invoke-virtual {v0, p1, p2, p3}, LT5/s;->a(II[B)V

    .line 71
    .line 72
    .line 73
    iget-object v0, p0, LT5/p;->n:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v0, LT5/s;

    .line 76
    .line 77
    invoke-virtual {v0, p1, p2, p3}, LT5/s;->a(II[B)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :pswitch_0
    iget-object v0, p0, LT5/p;->i:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v0, LT5/o;

    .line 84
    .line 85
    iget-boolean v1, v0, LT5/o;->e:Z

    .line 86
    .line 87
    if-eqz v1, :cond_6

    .line 88
    .line 89
    add-int/lit8 v1, p1, 0x2

    .line 90
    .line 91
    iget v2, v0, LT5/o;->c:I

    .line 92
    .line 93
    sub-int/2addr v1, v2

    .line 94
    if-ge v1, p2, :cond_5

    .line 95
    .line 96
    aget-byte v1, p3, v1

    .line 97
    .line 98
    and-int/lit16 v1, v1, 0x80

    .line 99
    .line 100
    const/4 v2, 0x0

    .line 101
    if-eqz v1, :cond_4

    .line 102
    .line 103
    const/4 v1, 0x1

    .line 104
    goto :goto_2

    .line 105
    :cond_4
    move v1, v2

    .line 106
    :goto_2
    iput-boolean v1, v0, LT5/o;->f:Z

    .line 107
    .line 108
    iput-boolean v2, v0, LT5/o;->e:Z

    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_5
    sub-int v1, p2, p1

    .line 112
    .line 113
    add-int/2addr v1, v2

    .line 114
    iput v1, v0, LT5/o;->c:I

    .line 115
    .line 116
    :cond_6
    :goto_3
    iget-boolean v0, p0, LT5/p;->c:Z

    .line 117
    .line 118
    if-nez v0, :cond_7

    .line 119
    .line 120
    iget-object v0, p0, LT5/p;->j:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v0, LT5/s;

    .line 123
    .line 124
    invoke-virtual {v0, p1, p2, p3}, LT5/s;->a(II[B)V

    .line 125
    .line 126
    .line 127
    iget-object v0, p0, LT5/p;->k:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v0, LT5/s;

    .line 130
    .line 131
    invoke-virtual {v0, p1, p2, p3}, LT5/s;->a(II[B)V

    .line 132
    .line 133
    .line 134
    iget-object v0, p0, LT5/p;->l:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v0, LT5/s;

    .line 137
    .line 138
    invoke-virtual {v0, p1, p2, p3}, LT5/s;->a(II[B)V

    .line 139
    .line 140
    .line 141
    :cond_7
    iget-object v0, p0, LT5/p;->m:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v0, LT5/s;

    .line 144
    .line 145
    invoke-virtual {v0, p1, p2, p3}, LT5/s;->a(II[B)V

    .line 146
    .line 147
    .line 148
    iget-object v0, p0, LT5/p;->n:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v0, LT5/s;

    .line 151
    .line 152
    invoke-virtual {v0, p1, p2, p3}, LT5/s;->a(II[B)V

    .line 153
    .line 154
    .line 155
    return-void

    .line 156
    nop

    .line 157
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public c(LY4/b;)V
    .locals 44

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v3, 0x3

    .line 6
    const/4 v5, 0x1

    .line 7
    iget-object v6, v0, LT5/p;->h:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v6, LJ5/w;

    .line 10
    .line 11
    invoke-static {v6}, Lu6/a;->j(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    sget v6, Lu6/v;->a:I

    .line 15
    .line 16
    :goto_0
    invoke-virtual {v1}, LY4/b;->a()I

    .line 17
    .line 18
    .line 19
    move-result v6

    .line 20
    if-lez v6, :cond_3e

    .line 21
    .line 22
    iget v6, v1, LY4/b;->b:I

    .line 23
    .line 24
    iget v7, v1, LY4/b;->c:I

    .line 25
    .line 26
    iget-object v8, v1, LY4/b;->a:[B

    .line 27
    .line 28
    iget-wide v9, v0, LT5/p;->e:J

    .line 29
    .line 30
    invoke-virtual {v1}, LY4/b;->a()I

    .line 31
    .line 32
    .line 33
    move-result v11

    .line 34
    int-to-long v11, v11

    .line 35
    add-long/2addr v9, v11

    .line 36
    iput-wide v9, v0, LT5/p;->e:J

    .line 37
    .line 38
    iget-object v9, v0, LT5/p;->h:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v9, LJ5/w;

    .line 41
    .line 42
    invoke-virtual {v1}, LY4/b;->a()I

    .line 43
    .line 44
    .line 45
    move-result v10

    .line 46
    invoke-interface {v9, v10, v1}, LJ5/w;->c(ILY4/b;)V

    .line 47
    .line 48
    .line 49
    :goto_1
    if-ge v6, v7, :cond_3d

    .line 50
    .line 51
    iget-object v9, v0, LT5/p;->d:[Z

    .line 52
    .line 53
    invoke-static {v8, v6, v7, v9}, Lu6/a;->r([BII[Z)I

    .line 54
    .line 55
    .line 56
    move-result v9

    .line 57
    if-ne v9, v7, :cond_0

    .line 58
    .line 59
    invoke-virtual {v0, v6, v7, v8}, LT5/p;->b(II[B)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_0
    add-int/lit8 v10, v9, 0x3

    .line 64
    .line 65
    aget-byte v11, v8, v10

    .line 66
    .line 67
    and-int/lit8 v11, v11, 0x7e

    .line 68
    .line 69
    shr-int/2addr v11, v5

    .line 70
    sub-int v12, v9, v6

    .line 71
    .line 72
    if-lez v12, :cond_1

    .line 73
    .line 74
    invoke-virtual {v0, v6, v9, v8}, LT5/p;->b(II[B)V

    .line 75
    .line 76
    .line 77
    :cond_1
    sub-int v6, v7, v9

    .line 78
    .line 79
    iget-wide v13, v0, LT5/p;->e:J

    .line 80
    .line 81
    int-to-long v2, v6

    .line 82
    sub-long/2addr v13, v2

    .line 83
    const/4 v2, 0x0

    .line 84
    if-gez v12, :cond_2

    .line 85
    .line 86
    neg-int v3, v12

    .line 87
    :goto_2
    move v12, v10

    .line 88
    goto :goto_3

    .line 89
    :cond_2
    move v3, v2

    .line 90
    goto :goto_2

    .line 91
    :goto_3
    iget-wide v9, v0, LT5/p;->f:J

    .line 92
    .line 93
    iget-object v15, v0, LT5/p;->i:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v15, LT5/o;

    .line 96
    .line 97
    iget-boolean v4, v0, LT5/p;->c:Z

    .line 98
    .line 99
    iget-boolean v5, v15, LT5/o;->i:Z

    .line 100
    .line 101
    const-wide v17, -0x7fffffffffffffffL    # -4.9E-324

    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    if-eqz v5, :cond_4

    .line 107
    .line 108
    iget-boolean v5, v15, LT5/o;->f:Z

    .line 109
    .line 110
    if-eqz v5, :cond_4

    .line 111
    .line 112
    iget-boolean v4, v15, LT5/o;->b:Z

    .line 113
    .line 114
    iput-boolean v4, v15, LT5/o;->l:Z

    .line 115
    .line 116
    iput-boolean v2, v15, LT5/o;->i:Z

    .line 117
    .line 118
    :cond_3
    move/from16 v19, v3

    .line 119
    .line 120
    goto :goto_5

    .line 121
    :cond_4
    iget-boolean v5, v15, LT5/o;->g:Z

    .line 122
    .line 123
    if-nez v5, :cond_5

    .line 124
    .line 125
    iget-boolean v5, v15, LT5/o;->f:Z

    .line 126
    .line 127
    if-eqz v5, :cond_3

    .line 128
    .line 129
    :cond_5
    if-eqz v4, :cond_7

    .line 130
    .line 131
    iget-boolean v4, v15, LT5/o;->h:Z

    .line 132
    .line 133
    if-eqz v4, :cond_7

    .line 134
    .line 135
    iget-wide v4, v15, LT5/o;->a:J

    .line 136
    .line 137
    move/from16 v19, v3

    .line 138
    .line 139
    sub-long v2, v13, v4

    .line 140
    .line 141
    long-to-int v2, v2

    .line 142
    add-int v28, v6, v2

    .line 143
    .line 144
    iget-wide v2, v15, LT5/o;->k:J

    .line 145
    .line 146
    cmp-long v23, v2, v17

    .line 147
    .line 148
    if-nez v23, :cond_6

    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_6
    iget-boolean v1, v15, LT5/o;->l:Z

    .line 152
    .line 153
    move/from16 v26, v1

    .line 154
    .line 155
    move-wide/from16 v24, v2

    .line 156
    .line 157
    iget-wide v1, v15, LT5/o;->j:J

    .line 158
    .line 159
    sub-long/2addr v4, v1

    .line 160
    long-to-int v1, v4

    .line 161
    iget-object v2, v15, LT5/o;->m:Ljava/lang/Object;

    .line 162
    .line 163
    move-object/from16 v23, v2

    .line 164
    .line 165
    check-cast v23, LJ5/w;

    .line 166
    .line 167
    const/16 v29, 0x0

    .line 168
    .line 169
    move/from16 v27, v1

    .line 170
    .line 171
    invoke-interface/range {v23 .. v29}, LJ5/w;->b(JIIILJ5/v;)V

    .line 172
    .line 173
    .line 174
    goto :goto_4

    .line 175
    :cond_7
    move/from16 v19, v3

    .line 176
    .line 177
    :goto_4
    iget-wide v1, v15, LT5/o;->a:J

    .line 178
    .line 179
    iput-wide v1, v15, LT5/o;->j:J

    .line 180
    .line 181
    iget-wide v1, v15, LT5/o;->d:J

    .line 182
    .line 183
    iput-wide v1, v15, LT5/o;->k:J

    .line 184
    .line 185
    iget-boolean v1, v15, LT5/o;->b:Z

    .line 186
    .line 187
    iput-boolean v1, v15, LT5/o;->l:Z

    .line 188
    .line 189
    const/4 v1, 0x1

    .line 190
    iput-boolean v1, v15, LT5/o;->h:Z

    .line 191
    .line 192
    :goto_5
    iget-boolean v1, v0, LT5/p;->c:Z

    .line 193
    .line 194
    iget-object v4, v0, LT5/p;->l:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast v4, LT5/s;

    .line 197
    .line 198
    iget-object v5, v0, LT5/p;->k:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast v5, LT5/s;

    .line 201
    .line 202
    iget-object v15, v0, LT5/p;->j:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast v15, LT5/s;

    .line 205
    .line 206
    if-nez v1, :cond_2e

    .line 207
    .line 208
    move/from16 v1, v19

    .line 209
    .line 210
    invoke-virtual {v15, v1}, LT5/s;->b(I)Z

    .line 211
    .line 212
    .line 213
    invoke-virtual {v5, v1}, LT5/s;->b(I)Z

    .line 214
    .line 215
    .line 216
    invoke-virtual {v4, v1}, LT5/s;->b(I)Z

    .line 217
    .line 218
    .line 219
    iget-boolean v3, v15, LT5/s;->d:Z

    .line 220
    .line 221
    if-eqz v3, :cond_2d

    .line 222
    .line 223
    iget-boolean v3, v5, LT5/s;->d:Z

    .line 224
    .line 225
    if-eqz v3, :cond_2d

    .line 226
    .line 227
    iget-boolean v3, v4, LT5/s;->d:Z

    .line 228
    .line 229
    if-eqz v3, :cond_2d

    .line 230
    .line 231
    iget-object v3, v0, LT5/p;->h:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast v3, LJ5/w;

    .line 234
    .line 235
    iget-object v2, v0, LT5/p;->b:Ljava/lang/String;

    .line 236
    .line 237
    move/from16 v25, v6

    .line 238
    .line 239
    iget v6, v15, LT5/s;->f:I

    .line 240
    .line 241
    move/from16 v26, v7

    .line 242
    .line 243
    iget v7, v5, LT5/s;->f:I

    .line 244
    .line 245
    add-int/2addr v7, v6

    .line 246
    move/from16 v27, v7

    .line 247
    .line 248
    iget v7, v4, LT5/s;->f:I

    .line 249
    .line 250
    add-int v7, v27, v7

    .line 251
    .line 252
    new-array v7, v7, [B

    .line 253
    .line 254
    move-object/from16 v27, v8

    .line 255
    .line 256
    iget-object v8, v15, LT5/s;->e:Ljava/lang/Object;

    .line 257
    .line 258
    check-cast v8, [B

    .line 259
    .line 260
    move/from16 v28, v12

    .line 261
    .line 262
    const/4 v12, 0x0

    .line 263
    invoke-static {v8, v12, v7, v12, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 264
    .line 265
    .line 266
    iget-object v6, v5, LT5/s;->e:Ljava/lang/Object;

    .line 267
    .line 268
    check-cast v6, [B

    .line 269
    .line 270
    iget v8, v15, LT5/s;->f:I

    .line 271
    .line 272
    move/from16 v29, v11

    .line 273
    .line 274
    iget v11, v5, LT5/s;->f:I

    .line 275
    .line 276
    invoke-static {v6, v12, v7, v8, v11}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 277
    .line 278
    .line 279
    iget-object v6, v4, LT5/s;->e:Ljava/lang/Object;

    .line 280
    .line 281
    check-cast v6, [B

    .line 282
    .line 283
    iget v8, v15, LT5/s;->f:I

    .line 284
    .line 285
    iget v11, v5, LT5/s;->f:I

    .line 286
    .line 287
    add-int/2addr v8, v11

    .line 288
    iget v11, v4, LT5/s;->f:I

    .line 289
    .line 290
    invoke-static {v6, v12, v7, v8, v11}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 291
    .line 292
    .line 293
    new-instance v6, LJ5/y;

    .line 294
    .line 295
    iget-object v8, v5, LT5/s;->e:Ljava/lang/Object;

    .line 296
    .line 297
    check-cast v8, [B

    .line 298
    .line 299
    iget v11, v5, LT5/s;->f:I

    .line 300
    .line 301
    move-object/from16 v30, v7

    .line 302
    .line 303
    const/4 v7, 0x7

    .line 304
    invoke-direct {v6, v12, v8, v11, v7}, LJ5/y;-><init>(I[BII)V

    .line 305
    .line 306
    .line 307
    const/16 v7, 0x2c

    .line 308
    .line 309
    invoke-virtual {v6, v7}, LJ5/y;->t(I)V

    .line 310
    .line 311
    .line 312
    const/4 v7, 0x3

    .line 313
    invoke-virtual {v6, v7}, LJ5/y;->i(I)I

    .line 314
    .line 315
    .line 316
    move-result v8

    .line 317
    invoke-virtual {v6}, LJ5/y;->s()V

    .line 318
    .line 319
    .line 320
    const/4 v7, 0x2

    .line 321
    invoke-virtual {v6, v7}, LJ5/y;->i(I)I

    .line 322
    .line 323
    .line 324
    move-result v31

    .line 325
    invoke-virtual {v6}, LJ5/y;->h()Z

    .line 326
    .line 327
    .line 328
    move-result v32

    .line 329
    const/4 v7, 0x5

    .line 330
    invoke-virtual {v6, v7}, LJ5/y;->i(I)I

    .line 331
    .line 332
    .line 333
    move-result v33

    .line 334
    const/4 v7, 0x0

    .line 335
    const/16 v34, 0x0

    .line 336
    .line 337
    :goto_6
    const/16 v11, 0x20

    .line 338
    .line 339
    if-ge v7, v11, :cond_9

    .line 340
    .line 341
    invoke-virtual {v6}, LJ5/y;->h()Z

    .line 342
    .line 343
    .line 344
    move-result v11

    .line 345
    const/16 v22, 0x1

    .line 346
    .line 347
    if-eqz v11, :cond_8

    .line 348
    .line 349
    shl-int v11, v22, v7

    .line 350
    .line 351
    or-int v11, v34, v11

    .line 352
    .line 353
    move/from16 v34, v11

    .line 354
    .line 355
    :cond_8
    add-int/lit8 v7, v7, 0x1

    .line 356
    .line 357
    goto :goto_6

    .line 358
    :cond_9
    const/16 v22, 0x1

    .line 359
    .line 360
    const/4 v7, 0x6

    .line 361
    new-array v11, v7, [I

    .line 362
    .line 363
    const/4 v12, 0x0

    .line 364
    :goto_7
    if-ge v12, v7, :cond_a

    .line 365
    .line 366
    const/16 v7, 0x8

    .line 367
    .line 368
    invoke-virtual {v6, v7}, LJ5/y;->i(I)I

    .line 369
    .line 370
    .line 371
    move-result v21

    .line 372
    aput v21, v11, v12

    .line 373
    .line 374
    add-int/lit8 v12, v12, 0x1

    .line 375
    .line 376
    const/4 v7, 0x6

    .line 377
    const/16 v22, 0x1

    .line 378
    .line 379
    goto :goto_7

    .line 380
    :cond_a
    const/16 v7, 0x8

    .line 381
    .line 382
    invoke-virtual {v6, v7}, LJ5/y;->i(I)I

    .line 383
    .line 384
    .line 385
    move-result v36

    .line 386
    move/from16 v21, v7

    .line 387
    .line 388
    const/4 v7, 0x0

    .line 389
    const/4 v12, 0x0

    .line 390
    :goto_8
    if-ge v12, v8, :cond_d

    .line 391
    .line 392
    invoke-virtual {v6}, LJ5/y;->h()Z

    .line 393
    .line 394
    .line 395
    move-result v37

    .line 396
    if-eqz v37, :cond_b

    .line 397
    .line 398
    add-int/lit8 v7, v7, 0x59

    .line 399
    .line 400
    :cond_b
    invoke-virtual {v6}, LJ5/y;->h()Z

    .line 401
    .line 402
    .line 403
    move-result v37

    .line 404
    if-eqz v37, :cond_c

    .line 405
    .line 406
    add-int/lit8 v7, v7, 0x8

    .line 407
    .line 408
    :cond_c
    const/16 v22, 0x1

    .line 409
    .line 410
    add-int/lit8 v12, v12, 0x1

    .line 411
    .line 412
    goto :goto_8

    .line 413
    :cond_d
    invoke-virtual {v6, v7}, LJ5/y;->t(I)V

    .line 414
    .line 415
    .line 416
    if-lez v8, :cond_e

    .line 417
    .line 418
    rsub-int/lit8 v7, v8, 0x8

    .line 419
    .line 420
    const/16 v16, 0x2

    .line 421
    .line 422
    mul-int/lit8 v7, v7, 0x2

    .line 423
    .line 424
    invoke-virtual {v6, v7}, LJ5/y;->t(I)V

    .line 425
    .line 426
    .line 427
    :cond_e
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 428
    .line 429
    .line 430
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 431
    .line 432
    .line 433
    move-result v7

    .line 434
    const/4 v12, 0x3

    .line 435
    if-ne v7, v12, :cond_f

    .line 436
    .line 437
    invoke-virtual {v6}, LJ5/y;->s()V

    .line 438
    .line 439
    .line 440
    :cond_f
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 441
    .line 442
    .line 443
    move-result v12

    .line 444
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 445
    .line 446
    .line 447
    move-result v37

    .line 448
    invoke-virtual {v6}, LJ5/y;->h()Z

    .line 449
    .line 450
    .line 451
    move-result v38

    .line 452
    if-eqz v38, :cond_13

    .line 453
    .line 454
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 455
    .line 456
    .line 457
    move-result v38

    .line 458
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 459
    .line 460
    .line 461
    move-result v39

    .line 462
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 463
    .line 464
    .line 465
    move-result v40

    .line 466
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 467
    .line 468
    .line 469
    move-result v41

    .line 470
    move-object/from16 v42, v11

    .line 471
    .line 472
    const/4 v11, 0x1

    .line 473
    if-eq v7, v11, :cond_11

    .line 474
    .line 475
    const/4 v11, 0x2

    .line 476
    if-ne v7, v11, :cond_10

    .line 477
    .line 478
    goto :goto_a

    .line 479
    :cond_10
    const/16 v43, 0x1

    .line 480
    .line 481
    :goto_9
    const/4 v11, 0x1

    .line 482
    goto :goto_b

    .line 483
    :cond_11
    :goto_a
    const/16 v43, 0x2

    .line 484
    .line 485
    goto :goto_9

    .line 486
    :goto_b
    if-ne v7, v11, :cond_12

    .line 487
    .line 488
    const/4 v7, 0x2

    .line 489
    goto :goto_c

    .line 490
    :cond_12
    const/4 v7, 0x1

    .line 491
    :goto_c
    add-int v38, v38, v39

    .line 492
    .line 493
    mul-int v38, v38, v43

    .line 494
    .line 495
    sub-int v12, v12, v38

    .line 496
    .line 497
    add-int v40, v40, v41

    .line 498
    .line 499
    mul-int v40, v40, v7

    .line 500
    .line 501
    sub-int v37, v37, v40

    .line 502
    .line 503
    goto :goto_d

    .line 504
    :cond_13
    move-object/from16 v42, v11

    .line 505
    .line 506
    :goto_d
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 507
    .line 508
    .line 509
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 510
    .line 511
    .line 512
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 513
    .line 514
    .line 515
    move-result v7

    .line 516
    invoke-virtual {v6}, LJ5/y;->h()Z

    .line 517
    .line 518
    .line 519
    move-result v11

    .line 520
    if-eqz v11, :cond_14

    .line 521
    .line 522
    const/4 v11, 0x0

    .line 523
    goto :goto_e

    .line 524
    :cond_14
    move v11, v8

    .line 525
    :goto_e
    if-gt v11, v8, :cond_15

    .line 526
    .line 527
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 528
    .line 529
    .line 530
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 531
    .line 532
    .line 533
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 534
    .line 535
    .line 536
    const/16 v22, 0x1

    .line 537
    .line 538
    add-int/lit8 v11, v11, 0x1

    .line 539
    .line 540
    goto :goto_e

    .line 541
    :cond_15
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 542
    .line 543
    .line 544
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 545
    .line 546
    .line 547
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 548
    .line 549
    .line 550
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 551
    .line 552
    .line 553
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 554
    .line 555
    .line 556
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 557
    .line 558
    .line 559
    invoke-virtual {v6}, LJ5/y;->h()Z

    .line 560
    .line 561
    .line 562
    move-result v8

    .line 563
    const/4 v11, 0x4

    .line 564
    if-eqz v8, :cond_1b

    .line 565
    .line 566
    invoke-virtual {v6}, LJ5/y;->h()Z

    .line 567
    .line 568
    .line 569
    move-result v8

    .line 570
    if-eqz v8, :cond_1b

    .line 571
    .line 572
    const/4 v8, 0x0

    .line 573
    :goto_f
    if-ge v8, v11, :cond_1b

    .line 574
    .line 575
    move/from16 v35, v7

    .line 576
    .line 577
    move/from16 v38, v11

    .line 578
    .line 579
    const/4 v11, 0x0

    .line 580
    :goto_10
    const/4 v7, 0x6

    .line 581
    if-ge v11, v7, :cond_1a

    .line 582
    .line 583
    invoke-virtual {v6}, LJ5/y;->h()Z

    .line 584
    .line 585
    .line 586
    move-result v39

    .line 587
    if-nez v39, :cond_17

    .line 588
    .line 589
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 590
    .line 591
    .line 592
    move/from16 v22, v11

    .line 593
    .line 594
    const/16 v40, 0x1

    .line 595
    .line 596
    :cond_16
    const/4 v7, 0x3

    .line 597
    goto :goto_12

    .line 598
    :cond_17
    const/4 v7, 0x1

    .line 599
    shl-int/lit8 v22, v8, 0x1

    .line 600
    .line 601
    add-int/lit8 v22, v22, 0x4

    .line 602
    .line 603
    move/from16 v40, v7

    .line 604
    .line 605
    shl-int v7, v40, v22

    .line 606
    .line 607
    move/from16 v22, v11

    .line 608
    .line 609
    const/16 v11, 0x40

    .line 610
    .line 611
    invoke-static {v11, v7}, Ljava/lang/Math;->min(II)I

    .line 612
    .line 613
    .line 614
    move-result v7

    .line 615
    move/from16 v11, v40

    .line 616
    .line 617
    if-le v8, v11, :cond_18

    .line 618
    .line 619
    invoke-virtual {v6}, LJ5/y;->n()I

    .line 620
    .line 621
    .line 622
    :cond_18
    move/from16 v40, v11

    .line 623
    .line 624
    const/4 v11, 0x0

    .line 625
    :goto_11
    if-ge v11, v7, :cond_16

    .line 626
    .line 627
    invoke-virtual {v6}, LJ5/y;->n()I

    .line 628
    .line 629
    .line 630
    add-int/lit8 v11, v11, 0x1

    .line 631
    .line 632
    goto :goto_11

    .line 633
    :goto_12
    if-ne v8, v7, :cond_19

    .line 634
    .line 635
    move v11, v7

    .line 636
    goto :goto_13

    .line 637
    :cond_19
    move/from16 v11, v40

    .line 638
    .line 639
    :goto_13
    add-int v11, v22, v11

    .line 640
    .line 641
    goto :goto_10

    .line 642
    :cond_1a
    const/4 v7, 0x3

    .line 643
    const/16 v40, 0x1

    .line 644
    .line 645
    add-int/lit8 v8, v8, 0x1

    .line 646
    .line 647
    move/from16 v7, v35

    .line 648
    .line 649
    move/from16 v11, v38

    .line 650
    .line 651
    goto :goto_f

    .line 652
    :cond_1b
    move/from16 v35, v7

    .line 653
    .line 654
    move/from16 v38, v11

    .line 655
    .line 656
    const/4 v7, 0x3

    .line 657
    const/4 v11, 0x2

    .line 658
    invoke-virtual {v6, v11}, LJ5/y;->t(I)V

    .line 659
    .line 660
    .line 661
    invoke-virtual {v6}, LJ5/y;->h()Z

    .line 662
    .line 663
    .line 664
    move-result v8

    .line 665
    if-eqz v8, :cond_1c

    .line 666
    .line 667
    const/16 v8, 0x8

    .line 668
    .line 669
    invoke-virtual {v6, v8}, LJ5/y;->t(I)V

    .line 670
    .line 671
    .line 672
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 673
    .line 674
    .line 675
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 676
    .line 677
    .line 678
    invoke-virtual {v6}, LJ5/y;->s()V

    .line 679
    .line 680
    .line 681
    :cond_1c
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 682
    .line 683
    .line 684
    move-result v8

    .line 685
    const/4 v7, 0x0

    .line 686
    const/4 v11, 0x0

    .line 687
    const/16 v20, 0x0

    .line 688
    .line 689
    :goto_14
    if-ge v11, v8, :cond_23

    .line 690
    .line 691
    if-eqz v11, :cond_1d

    .line 692
    .line 693
    invoke-virtual {v6}, LJ5/y;->h()Z

    .line 694
    .line 695
    .line 696
    move-result v20

    .line 697
    :cond_1d
    if-eqz v20, :cond_20

    .line 698
    .line 699
    invoke-virtual {v6}, LJ5/y;->s()V

    .line 700
    .line 701
    .line 702
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 703
    .line 704
    .line 705
    move/from16 v40, v8

    .line 706
    .line 707
    const/4 v8, 0x0

    .line 708
    :goto_15
    if-gt v8, v7, :cond_1f

    .line 709
    .line 710
    invoke-virtual {v6}, LJ5/y;->h()Z

    .line 711
    .line 712
    .line 713
    move-result v41

    .line 714
    if-eqz v41, :cond_1e

    .line 715
    .line 716
    invoke-virtual {v6}, LJ5/y;->s()V

    .line 717
    .line 718
    .line 719
    :cond_1e
    const/16 v22, 0x1

    .line 720
    .line 721
    add-int/lit8 v8, v8, 0x1

    .line 722
    .line 723
    goto :goto_15

    .line 724
    :cond_1f
    move/from16 v43, v11

    .line 725
    .line 726
    const/16 v22, 0x1

    .line 727
    .line 728
    goto :goto_18

    .line 729
    :cond_20
    move/from16 v40, v8

    .line 730
    .line 731
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 732
    .line 733
    .line 734
    move-result v7

    .line 735
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 736
    .line 737
    .line 738
    move-result v8

    .line 739
    add-int v41, v7, v8

    .line 740
    .line 741
    move/from16 v43, v11

    .line 742
    .line 743
    const/4 v11, 0x0

    .line 744
    :goto_16
    if-ge v11, v7, :cond_21

    .line 745
    .line 746
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 747
    .line 748
    .line 749
    invoke-virtual {v6}, LJ5/y;->s()V

    .line 750
    .line 751
    .line 752
    const/16 v22, 0x1

    .line 753
    .line 754
    add-int/lit8 v11, v11, 0x1

    .line 755
    .line 756
    goto :goto_16

    .line 757
    :cond_21
    const/16 v22, 0x1

    .line 758
    .line 759
    const/4 v7, 0x0

    .line 760
    :goto_17
    if-ge v7, v8, :cond_22

    .line 761
    .line 762
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 763
    .line 764
    .line 765
    invoke-virtual {v6}, LJ5/y;->s()V

    .line 766
    .line 767
    .line 768
    add-int/lit8 v7, v7, 0x1

    .line 769
    .line 770
    goto :goto_17

    .line 771
    :cond_22
    move/from16 v7, v41

    .line 772
    .line 773
    :goto_18
    add-int/lit8 v11, v43, 0x1

    .line 774
    .line 775
    move/from16 v8, v40

    .line 776
    .line 777
    goto :goto_14

    .line 778
    :cond_23
    const/16 v22, 0x1

    .line 779
    .line 780
    invoke-virtual {v6}, LJ5/y;->h()Z

    .line 781
    .line 782
    .line 783
    move-result v7

    .line 784
    if-eqz v7, :cond_24

    .line 785
    .line 786
    const/4 v7, 0x0

    .line 787
    :goto_19
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 788
    .line 789
    .line 790
    move-result v8

    .line 791
    if-ge v7, v8, :cond_24

    .line 792
    .line 793
    const/16 v19, 0x5

    .line 794
    .line 795
    add-int/lit8 v8, v35, 0x5

    .line 796
    .line 797
    invoke-virtual {v6, v8}, LJ5/y;->t(I)V

    .line 798
    .line 799
    .line 800
    add-int/lit8 v7, v7, 0x1

    .line 801
    .line 802
    const/16 v22, 0x1

    .line 803
    .line 804
    goto :goto_19

    .line 805
    :cond_24
    const/4 v11, 0x2

    .line 806
    invoke-virtual {v6, v11}, LJ5/y;->t(I)V

    .line 807
    .line 808
    .line 809
    invoke-virtual {v6}, LJ5/y;->h()Z

    .line 810
    .line 811
    .line 812
    move-result v7

    .line 813
    if-eqz v7, :cond_2c

    .line 814
    .line 815
    invoke-virtual {v6}, LJ5/y;->h()Z

    .line 816
    .line 817
    .line 818
    move-result v7

    .line 819
    if-eqz v7, :cond_27

    .line 820
    .line 821
    const/16 v7, 0x8

    .line 822
    .line 823
    invoke-virtual {v6, v7}, LJ5/y;->i(I)I

    .line 824
    .line 825
    .line 826
    move-result v11

    .line 827
    const/16 v7, 0xff

    .line 828
    .line 829
    if-ne v11, v7, :cond_25

    .line 830
    .line 831
    const/16 v7, 0x10

    .line 832
    .line 833
    invoke-virtual {v6, v7}, LJ5/y;->i(I)I

    .line 834
    .line 835
    .line 836
    move-result v11

    .line 837
    invoke-virtual {v6, v7}, LJ5/y;->i(I)I

    .line 838
    .line 839
    .line 840
    move-result v8

    .line 841
    if-eqz v11, :cond_27

    .line 842
    .line 843
    if-eqz v8, :cond_27

    .line 844
    .line 845
    int-to-float v7, v11

    .line 846
    int-to-float v8, v8

    .line 847
    div-float v8, v7, v8

    .line 848
    .line 849
    goto :goto_1a

    .line 850
    :cond_25
    const/16 v7, 0x11

    .line 851
    .line 852
    if-ge v11, v7, :cond_26

    .line 853
    .line 854
    sget-object v7, Lu6/a;->e:[F

    .line 855
    .line 856
    aget v8, v7, v11

    .line 857
    .line 858
    goto :goto_1a

    .line 859
    :cond_26
    const-string v7, "Unexpected aspect_ratio_idc value: "

    .line 860
    .line 861
    const-string v8, "H265Reader"

    .line 862
    .line 863
    invoke-static {v11, v7, v8}, LA7/p0;->u(ILjava/lang/String;Ljava/lang/String;)V

    .line 864
    .line 865
    .line 866
    :cond_27
    const/high16 v8, 0x3f800000    # 1.0f

    .line 867
    .line 868
    :goto_1a
    invoke-virtual {v6}, LJ5/y;->h()Z

    .line 869
    .line 870
    .line 871
    move-result v7

    .line 872
    if-eqz v7, :cond_28

    .line 873
    .line 874
    invoke-virtual {v6}, LJ5/y;->s()V

    .line 875
    .line 876
    .line 877
    :cond_28
    invoke-virtual {v6}, LJ5/y;->h()Z

    .line 878
    .line 879
    .line 880
    move-result v7

    .line 881
    if-eqz v7, :cond_29

    .line 882
    .line 883
    move/from16 v7, v38

    .line 884
    .line 885
    invoke-virtual {v6, v7}, LJ5/y;->t(I)V

    .line 886
    .line 887
    .line 888
    invoke-virtual {v6}, LJ5/y;->h()Z

    .line 889
    .line 890
    .line 891
    move-result v7

    .line 892
    if-eqz v7, :cond_29

    .line 893
    .line 894
    const/16 v7, 0x18

    .line 895
    .line 896
    invoke-virtual {v6, v7}, LJ5/y;->t(I)V

    .line 897
    .line 898
    .line 899
    :cond_29
    invoke-virtual {v6}, LJ5/y;->h()Z

    .line 900
    .line 901
    .line 902
    move-result v7

    .line 903
    if-eqz v7, :cond_2a

    .line 904
    .line 905
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 906
    .line 907
    .line 908
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 909
    .line 910
    .line 911
    :cond_2a
    invoke-virtual {v6}, LJ5/y;->s()V

    .line 912
    .line 913
    .line 914
    invoke-virtual {v6}, LJ5/y;->h()Z

    .line 915
    .line 916
    .line 917
    move-result v6

    .line 918
    const/4 v11, 0x2

    .line 919
    if-eqz v6, :cond_2b

    .line 920
    .line 921
    mul-int/lit8 v37, v37, 0x2

    .line 922
    .line 923
    :cond_2b
    move/from16 v6, v37

    .line 924
    .line 925
    move-object/from16 v35, v42

    .line 926
    .line 927
    goto :goto_1b

    .line 928
    :cond_2c
    const/4 v11, 0x2

    .line 929
    move/from16 v6, v37

    .line 930
    .line 931
    move-object/from16 v35, v42

    .line 932
    .line 933
    const/high16 v8, 0x3f800000    # 1.0f

    .line 934
    .line 935
    :goto_1b
    invoke-static/range {v31 .. v36}, Lu6/a;->c(IZII[II)Ljava/lang/String;

    .line 936
    .line 937
    .line 938
    move-result-object v7

    .line 939
    new-instance v11, LE5/S;

    .line 940
    .line 941
    invoke-direct {v11}, LE5/S;-><init>()V

    .line 942
    .line 943
    .line 944
    iput-object v2, v11, LE5/S;->a:Ljava/lang/String;

    .line 945
    .line 946
    const-string v2, "video/hevc"

    .line 947
    .line 948
    iput-object v2, v11, LE5/S;->k:Ljava/lang/String;

    .line 949
    .line 950
    iput-object v7, v11, LE5/S;->h:Ljava/lang/String;

    .line 951
    .line 952
    iput v12, v11, LE5/S;->p:I

    .line 953
    .line 954
    iput v6, v11, LE5/S;->q:I

    .line 955
    .line 956
    iput v8, v11, LE5/S;->t:F

    .line 957
    .line 958
    invoke-static/range {v30 .. v30}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 959
    .line 960
    .line 961
    move-result-object v2

    .line 962
    iput-object v2, v11, LE5/S;->m:Ljava/util/List;

    .line 963
    .line 964
    new-instance v2, LE5/T;

    .line 965
    .line 966
    invoke-direct {v2, v11}, LE5/T;-><init>(LE5/S;)V

    .line 967
    .line 968
    .line 969
    invoke-interface {v3, v2}, LJ5/w;->a(LE5/T;)V

    .line 970
    .line 971
    .line 972
    const/4 v11, 0x1

    .line 973
    iput-boolean v11, v0, LT5/p;->c:Z

    .line 974
    .line 975
    goto :goto_1c

    .line 976
    :cond_2d
    move/from16 v25, v6

    .line 977
    .line 978
    move/from16 v26, v7

    .line 979
    .line 980
    move-object/from16 v27, v8

    .line 981
    .line 982
    move/from16 v29, v11

    .line 983
    .line 984
    move/from16 v28, v12

    .line 985
    .line 986
    goto :goto_1c

    .line 987
    :cond_2e
    move/from16 v25, v6

    .line 988
    .line 989
    move/from16 v26, v7

    .line 990
    .line 991
    move-object/from16 v27, v8

    .line 992
    .line 993
    move/from16 v29, v11

    .line 994
    .line 995
    move/from16 v28, v12

    .line 996
    .line 997
    move/from16 v1, v19

    .line 998
    .line 999
    :goto_1c
    iget-object v2, v0, LT5/p;->m:Ljava/lang/Object;

    .line 1000
    .line 1001
    check-cast v2, LT5/s;

    .line 1002
    .line 1003
    invoke-virtual {v2, v1}, LT5/s;->b(I)Z

    .line 1004
    .line 1005
    .line 1006
    move-result v3

    .line 1007
    iget-object v6, v0, LT5/p;->g:Ljava/lang/Object;

    .line 1008
    .line 1009
    check-cast v6, LS3/s;

    .line 1010
    .line 1011
    iget-object v6, v6, LS3/s;->c:Ljava/lang/Object;

    .line 1012
    .line 1013
    check-cast v6, [LJ5/w;

    .line 1014
    .line 1015
    iget-object v7, v0, LT5/p;->o:Ljava/lang/Object;

    .line 1016
    .line 1017
    check-cast v7, LY4/b;

    .line 1018
    .line 1019
    if-eqz v3, :cond_2f

    .line 1020
    .line 1021
    iget-object v3, v2, LT5/s;->e:Ljava/lang/Object;

    .line 1022
    .line 1023
    check-cast v3, [B

    .line 1024
    .line 1025
    iget v8, v2, LT5/s;->f:I

    .line 1026
    .line 1027
    invoke-static {v8, v3}, Lu6/a;->C(I[B)I

    .line 1028
    .line 1029
    .line 1030
    move-result v3

    .line 1031
    iget-object v8, v2, LT5/s;->e:Ljava/lang/Object;

    .line 1032
    .line 1033
    check-cast v8, [B

    .line 1034
    .line 1035
    invoke-virtual {v7, v3, v8}, LY4/b;->y(I[B)V

    .line 1036
    .line 1037
    .line 1038
    const/4 v3, 0x5

    .line 1039
    invoke-virtual {v7, v3}, LY4/b;->B(I)V

    .line 1040
    .line 1041
    .line 1042
    invoke-static {v9, v10, v7, v6}, LFe/g;->w(JLY4/b;[LJ5/w;)V

    .line 1043
    .line 1044
    .line 1045
    :cond_2f
    iget-object v3, v0, LT5/p;->n:Ljava/lang/Object;

    .line 1046
    .line 1047
    check-cast v3, LT5/s;

    .line 1048
    .line 1049
    invoke-virtual {v3, v1}, LT5/s;->b(I)Z

    .line 1050
    .line 1051
    .line 1052
    move-result v1

    .line 1053
    if-eqz v1, :cond_30

    .line 1054
    .line 1055
    iget-object v1, v3, LT5/s;->e:Ljava/lang/Object;

    .line 1056
    .line 1057
    check-cast v1, [B

    .line 1058
    .line 1059
    iget v8, v3, LT5/s;->f:I

    .line 1060
    .line 1061
    invoke-static {v8, v1}, Lu6/a;->C(I[B)I

    .line 1062
    .line 1063
    .line 1064
    move-result v1

    .line 1065
    iget-object v8, v3, LT5/s;->e:Ljava/lang/Object;

    .line 1066
    .line 1067
    check-cast v8, [B

    .line 1068
    .line 1069
    invoke-virtual {v7, v1, v8}, LY4/b;->y(I[B)V

    .line 1070
    .line 1071
    .line 1072
    const/4 v1, 0x5

    .line 1073
    invoke-virtual {v7, v1}, LY4/b;->B(I)V

    .line 1074
    .line 1075
    .line 1076
    invoke-static {v9, v10, v7, v6}, LFe/g;->w(JLY4/b;[LJ5/w;)V

    .line 1077
    .line 1078
    .line 1079
    :cond_30
    iget-wide v6, v0, LT5/p;->f:J

    .line 1080
    .line 1081
    iget-object v1, v0, LT5/p;->i:Ljava/lang/Object;

    .line 1082
    .line 1083
    check-cast v1, LT5/o;

    .line 1084
    .line 1085
    iget-boolean v8, v0, LT5/p;->c:Z

    .line 1086
    .line 1087
    const/4 v12, 0x0

    .line 1088
    iput-boolean v12, v1, LT5/o;->f:Z

    .line 1089
    .line 1090
    iput-boolean v12, v1, LT5/o;->g:Z

    .line 1091
    .line 1092
    iput-wide v6, v1, LT5/o;->d:J

    .line 1093
    .line 1094
    iput v12, v1, LT5/o;->c:I

    .line 1095
    .line 1096
    iput-wide v13, v1, LT5/o;->a:J

    .line 1097
    .line 1098
    move/from16 v6, v29

    .line 1099
    .line 1100
    const/16 v11, 0x20

    .line 1101
    .line 1102
    if-lt v6, v11, :cond_31

    .line 1103
    .line 1104
    const/16 v7, 0x28

    .line 1105
    .line 1106
    if-ne v6, v7, :cond_32

    .line 1107
    .line 1108
    :cond_31
    move-object v9, v15

    .line 1109
    const/4 v11, 0x1

    .line 1110
    const/4 v12, 0x0

    .line 1111
    goto :goto_21

    .line 1112
    :cond_32
    iget-boolean v7, v1, LT5/o;->h:Z

    .line 1113
    .line 1114
    if-eqz v7, :cond_35

    .line 1115
    .line 1116
    iget-boolean v7, v1, LT5/o;->i:Z

    .line 1117
    .line 1118
    if-nez v7, :cond_35

    .line 1119
    .line 1120
    if-eqz v8, :cond_34

    .line 1121
    .line 1122
    move-wide v7, v13

    .line 1123
    move-object v9, v15

    .line 1124
    iget-wide v14, v1, LT5/o;->k:J

    .line 1125
    .line 1126
    cmp-long v10, v14, v17

    .line 1127
    .line 1128
    if-nez v10, :cond_33

    .line 1129
    .line 1130
    goto :goto_1d

    .line 1131
    :cond_33
    iget-boolean v10, v1, LT5/o;->l:Z

    .line 1132
    .line 1133
    iget-wide v11, v1, LT5/o;->j:J

    .line 1134
    .line 1135
    sub-long/2addr v7, v11

    .line 1136
    long-to-int v7, v7

    .line 1137
    iget-object v8, v1, LT5/o;->m:Ljava/lang/Object;

    .line 1138
    .line 1139
    move-object v13, v8

    .line 1140
    check-cast v13, LJ5/w;

    .line 1141
    .line 1142
    const/16 v19, 0x0

    .line 1143
    .line 1144
    move/from16 v17, v7

    .line 1145
    .line 1146
    move/from16 v16, v10

    .line 1147
    .line 1148
    move/from16 v18, v25

    .line 1149
    .line 1150
    invoke-interface/range {v13 .. v19}, LJ5/w;->b(JIIILJ5/v;)V

    .line 1151
    .line 1152
    .line 1153
    :goto_1d
    const/4 v12, 0x0

    .line 1154
    goto :goto_1e

    .line 1155
    :cond_34
    move-object v9, v15

    .line 1156
    goto :goto_1d

    .line 1157
    :goto_1e
    iput-boolean v12, v1, LT5/o;->h:Z

    .line 1158
    .line 1159
    :goto_1f
    const/16 v11, 0x20

    .line 1160
    .line 1161
    goto :goto_20

    .line 1162
    :cond_35
    move-object v9, v15

    .line 1163
    const/4 v12, 0x0

    .line 1164
    goto :goto_1f

    .line 1165
    :goto_20
    if-gt v11, v6, :cond_36

    .line 1166
    .line 1167
    const/16 v7, 0x23

    .line 1168
    .line 1169
    if-le v6, v7, :cond_37

    .line 1170
    .line 1171
    :cond_36
    const/16 v7, 0x27

    .line 1172
    .line 1173
    if-ne v6, v7, :cond_38

    .line 1174
    .line 1175
    :cond_37
    iget-boolean v7, v1, LT5/o;->i:Z

    .line 1176
    .line 1177
    const/4 v11, 0x1

    .line 1178
    xor-int/2addr v7, v11

    .line 1179
    iput-boolean v7, v1, LT5/o;->g:Z

    .line 1180
    .line 1181
    iput-boolean v11, v1, LT5/o;->i:Z

    .line 1182
    .line 1183
    :goto_21
    const/16 v7, 0x10

    .line 1184
    .line 1185
    goto :goto_22

    .line 1186
    :cond_38
    const/4 v11, 0x1

    .line 1187
    goto :goto_21

    .line 1188
    :goto_22
    if-lt v6, v7, :cond_39

    .line 1189
    .line 1190
    const/16 v7, 0x15

    .line 1191
    .line 1192
    if-gt v6, v7, :cond_39

    .line 1193
    .line 1194
    move v7, v11

    .line 1195
    goto :goto_23

    .line 1196
    :cond_39
    move v7, v12

    .line 1197
    :goto_23
    iput-boolean v7, v1, LT5/o;->b:Z

    .line 1198
    .line 1199
    if-nez v7, :cond_3a

    .line 1200
    .line 1201
    const/16 v7, 0x9

    .line 1202
    .line 1203
    if-gt v6, v7, :cond_3b

    .line 1204
    .line 1205
    :cond_3a
    move v12, v11

    .line 1206
    :cond_3b
    iput-boolean v12, v1, LT5/o;->e:Z

    .line 1207
    .line 1208
    iget-boolean v1, v0, LT5/p;->c:Z

    .line 1209
    .line 1210
    if-nez v1, :cond_3c

    .line 1211
    .line 1212
    invoke-virtual {v9, v6}, LT5/s;->e(I)V

    .line 1213
    .line 1214
    .line 1215
    invoke-virtual {v5, v6}, LT5/s;->e(I)V

    .line 1216
    .line 1217
    .line 1218
    invoke-virtual {v4, v6}, LT5/s;->e(I)V

    .line 1219
    .line 1220
    .line 1221
    :cond_3c
    invoke-virtual {v2, v6}, LT5/s;->e(I)V

    .line 1222
    .line 1223
    .line 1224
    invoke-virtual {v3, v6}, LT5/s;->e(I)V

    .line 1225
    .line 1226
    .line 1227
    move-object/from16 v1, p1

    .line 1228
    .line 1229
    move v5, v11

    .line 1230
    move/from16 v7, v26

    .line 1231
    .line 1232
    move-object/from16 v8, v27

    .line 1233
    .line 1234
    move/from16 v6, v28

    .line 1235
    .line 1236
    const/4 v3, 0x3

    .line 1237
    goto/16 :goto_1

    .line 1238
    .line 1239
    :cond_3d
    move-object/from16 v1, p1

    .line 1240
    .line 1241
    goto/16 :goto_0

    .line 1242
    .line 1243
    :cond_3e
    return-void
.end method

.method public final d(IJ)V
    .locals 2

    .line 1
    iget p1, p0, LT5/p;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iput-wide p2, p0, LT5/p;->f:J

    .line 7
    .line 8
    return-void

    .line 9
    :pswitch_0
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    cmp-long p1, p2, v0

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    iput-wide p2, p0, LT5/p;->f:J

    .line 19
    .line 20
    :cond_0
    return-void

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public e(LQ1/o;)V
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    iget-object v3, v0, LT5/p;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v3, Ls2/C;

    .line 9
    .line 10
    invoke-static {v3}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    sget v3, LQ1/x;->a:I

    .line 14
    .line 15
    :goto_0
    invoke-virtual {v1}, LQ1/o;->a()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-lez v3, :cond_19

    .line 20
    .line 21
    iget v3, v1, LQ1/o;->b:I

    .line 22
    .line 23
    iget v4, v1, LQ1/o;->c:I

    .line 24
    .line 25
    iget-object v5, v1, LQ1/o;->a:[B

    .line 26
    .line 27
    iget-wide v6, v0, LT5/p;->e:J

    .line 28
    .line 29
    invoke-virtual {v1}, LQ1/o;->a()I

    .line 30
    .line 31
    .line 32
    move-result v8

    .line 33
    int-to-long v8, v8

    .line 34
    add-long/2addr v6, v8

    .line 35
    iput-wide v6, v0, LT5/p;->e:J

    .line 36
    .line 37
    iget-object v6, v0, LT5/p;->h:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v6, Ls2/C;

    .line 40
    .line 41
    invoke-virtual {v1}, LQ1/o;->a()I

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    invoke-interface {v6, v7, v1}, Ls2/C;->e(ILQ1/o;)V

    .line 46
    .line 47
    .line 48
    :goto_1
    if-ge v3, v4, :cond_18

    .line 49
    .line 50
    iget-object v6, v0, LT5/p;->d:[Z

    .line 51
    .line 52
    invoke-static {v5, v3, v4, v6}, LR1/n;->b([BII[Z)I

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    if-ne v6, v4, :cond_0

    .line 57
    .line 58
    invoke-virtual {v0, v3, v4, v5}, LT5/p;->b(II[B)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_0
    add-int/lit8 v7, v6, 0x3

    .line 63
    .line 64
    aget-byte v8, v5, v7

    .line 65
    .line 66
    and-int/lit8 v8, v8, 0x7e

    .line 67
    .line 68
    const/4 v9, 0x1

    .line 69
    shr-int/2addr v8, v9

    .line 70
    sub-int v10, v6, v3

    .line 71
    .line 72
    if-lez v10, :cond_1

    .line 73
    .line 74
    invoke-virtual {v0, v3, v6, v5}, LT5/p;->b(II[B)V

    .line 75
    .line 76
    .line 77
    :cond_1
    sub-int v3, v4, v6

    .line 78
    .line 79
    iget-wide v11, v0, LT5/p;->e:J

    .line 80
    .line 81
    int-to-long v13, v3

    .line 82
    sub-long/2addr v11, v13

    .line 83
    const/4 v6, 0x0

    .line 84
    if-gez v10, :cond_2

    .line 85
    .line 86
    neg-int v10, v10

    .line 87
    goto :goto_2

    .line 88
    :cond_2
    move v10, v6

    .line 89
    :goto_2
    iget-wide v13, v0, LT5/p;->f:J

    .line 90
    .line 91
    iget-object v15, v0, LT5/p;->i:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v15, LT5/o;

    .line 94
    .line 95
    iget-boolean v2, v0, LT5/p;->c:Z

    .line 96
    .line 97
    iget-boolean v9, v15, LT5/o;->i:Z

    .line 98
    .line 99
    if-eqz v9, :cond_4

    .line 100
    .line 101
    iget-boolean v9, v15, LT5/o;->f:Z

    .line 102
    .line 103
    if-eqz v9, :cond_4

    .line 104
    .line 105
    iget-boolean v2, v15, LT5/o;->b:Z

    .line 106
    .line 107
    iput-boolean v2, v15, LT5/o;->l:Z

    .line 108
    .line 109
    iput-boolean v6, v15, LT5/o;->i:Z

    .line 110
    .line 111
    :cond_3
    move v2, v7

    .line 112
    goto :goto_4

    .line 113
    :cond_4
    iget-boolean v9, v15, LT5/o;->g:Z

    .line 114
    .line 115
    if-nez v9, :cond_5

    .line 116
    .line 117
    iget-boolean v9, v15, LT5/o;->f:Z

    .line 118
    .line 119
    if-eqz v9, :cond_3

    .line 120
    .line 121
    :cond_5
    if-eqz v2, :cond_6

    .line 122
    .line 123
    iget-boolean v2, v15, LT5/o;->h:Z

    .line 124
    .line 125
    if-eqz v2, :cond_6

    .line 126
    .line 127
    move v2, v7

    .line 128
    iget-wide v6, v15, LT5/o;->a:J

    .line 129
    .line 130
    sub-long v6, v11, v6

    .line 131
    .line 132
    long-to-int v6, v6

    .line 133
    add-int/2addr v6, v3

    .line 134
    invoke-virtual {v15, v6}, LT5/o;->a(I)V

    .line 135
    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_6
    move v2, v7

    .line 139
    :goto_3
    iget-wide v6, v15, LT5/o;->a:J

    .line 140
    .line 141
    iput-wide v6, v15, LT5/o;->j:J

    .line 142
    .line 143
    iget-wide v6, v15, LT5/o;->d:J

    .line 144
    .line 145
    iput-wide v6, v15, LT5/o;->k:J

    .line 146
    .line 147
    iget-boolean v6, v15, LT5/o;->b:Z

    .line 148
    .line 149
    iput-boolean v6, v15, LT5/o;->l:Z

    .line 150
    .line 151
    const/4 v6, 0x1

    .line 152
    iput-boolean v6, v15, LT5/o;->h:Z

    .line 153
    .line 154
    :goto_4
    iget-boolean v6, v0, LT5/p;->c:Z

    .line 155
    .line 156
    iget-object v7, v0, LT5/p;->g:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v7, Lb7/k;

    .line 159
    .line 160
    iget-object v15, v0, LT5/p;->l:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v15, LT5/s;

    .line 163
    .line 164
    iget-object v9, v0, LT5/p;->k:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v9, LT5/s;

    .line 167
    .line 168
    iget-object v1, v0, LT5/p;->j:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v1, LT5/s;

    .line 171
    .line 172
    iget-object v7, v7, Lb7/k;->d:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v7, LR1/q;

    .line 175
    .line 176
    if-nez v6, :cond_a

    .line 177
    .line 178
    invoke-virtual {v1, v10}, LT5/s;->b(I)Z

    .line 179
    .line 180
    .line 181
    invoke-virtual {v9, v10}, LT5/s;->b(I)Z

    .line 182
    .line 183
    .line 184
    invoke-virtual {v15, v10}, LT5/s;->b(I)Z

    .line 185
    .line 186
    .line 187
    iget-boolean v6, v1, LT5/s;->d:Z

    .line 188
    .line 189
    if-eqz v6, :cond_a

    .line 190
    .line 191
    iget-boolean v6, v9, LT5/s;->d:Z

    .line 192
    .line 193
    if-eqz v6, :cond_a

    .line 194
    .line 195
    iget-boolean v6, v15, LT5/s;->d:Z

    .line 196
    .line 197
    if-eqz v6, :cond_a

    .line 198
    .line 199
    iget-object v6, v0, LT5/p;->b:Ljava/lang/String;

    .line 200
    .line 201
    move/from16 v17, v2

    .line 202
    .line 203
    iget v2, v1, LT5/s;->f:I

    .line 204
    .line 205
    move/from16 v18, v4

    .line 206
    .line 207
    iget v4, v9, LT5/s;->f:I

    .line 208
    .line 209
    add-int/2addr v4, v2

    .line 210
    move/from16 v19, v4

    .line 211
    .line 212
    iget v4, v15, LT5/s;->f:I

    .line 213
    .line 214
    add-int v4, v19, v4

    .line 215
    .line 216
    new-array v4, v4, [B

    .line 217
    .line 218
    move-object/from16 v19, v5

    .line 219
    .line 220
    iget-object v5, v1, LT5/s;->e:Ljava/lang/Object;

    .line 221
    .line 222
    check-cast v5, [B

    .line 223
    .line 224
    move/from16 v20, v3

    .line 225
    .line 226
    const/4 v3, 0x0

    .line 227
    invoke-static {v5, v3, v4, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 228
    .line 229
    .line 230
    iget-object v2, v9, LT5/s;->e:Ljava/lang/Object;

    .line 231
    .line 232
    check-cast v2, [B

    .line 233
    .line 234
    iget v5, v1, LT5/s;->f:I

    .line 235
    .line 236
    move/from16 v16, v8

    .line 237
    .line 238
    iget v8, v9, LT5/s;->f:I

    .line 239
    .line 240
    invoke-static {v2, v3, v4, v5, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 241
    .line 242
    .line 243
    iget-object v2, v15, LT5/s;->e:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast v2, [B

    .line 246
    .line 247
    iget v5, v1, LT5/s;->f:I

    .line 248
    .line 249
    iget v8, v9, LT5/s;->f:I

    .line 250
    .line 251
    add-int/2addr v5, v8

    .line 252
    iget v8, v15, LT5/s;->f:I

    .line 253
    .line 254
    invoke-static {v2, v3, v4, v5, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 255
    .line 256
    .line 257
    move-object v2, v9

    .line 258
    iget-object v3, v2, LT5/s;->e:Ljava/lang/Object;

    .line 259
    .line 260
    check-cast v3, [B

    .line 261
    .line 262
    iget v5, v2, LT5/s;->f:I

    .line 263
    .line 264
    const/4 v8, 0x0

    .line 265
    const/4 v9, 0x3

    .line 266
    invoke-static {v3, v9, v5, v8}, LR1/n;->g([BIILVa/X7;)LR1/j;

    .line 267
    .line 268
    .line 269
    move-result-object v3

    .line 270
    iget-object v5, v3, LR1/j;->a:LR1/g;

    .line 271
    .line 272
    if-eqz v5, :cond_7

    .line 273
    .line 274
    iget-object v8, v5, LR1/g;->e:[I

    .line 275
    .line 276
    iget v9, v5, LR1/g;->f:I

    .line 277
    .line 278
    move-object/from16 v27, v4

    .line 279
    .line 280
    iget v4, v5, LR1/g;->a:I

    .line 281
    .line 282
    move/from16 v21, v4

    .line 283
    .line 284
    iget-boolean v4, v5, LR1/g;->b:Z

    .line 285
    .line 286
    move/from16 v22, v4

    .line 287
    .line 288
    iget v4, v5, LR1/g;->c:I

    .line 289
    .line 290
    iget v5, v5, LR1/g;->d:I

    .line 291
    .line 292
    move/from16 v23, v4

    .line 293
    .line 294
    move/from16 v24, v5

    .line 295
    .line 296
    move-object/from16 v25, v8

    .line 297
    .line 298
    move/from16 v26, v9

    .line 299
    .line 300
    invoke-static/range {v21 .. v26}, LQ1/a;->b(IZII[II)Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v8

    .line 304
    goto :goto_5

    .line 305
    :cond_7
    move-object/from16 v27, v4

    .line 306
    .line 307
    :goto_5
    new-instance v4, LN1/m;

    .line 308
    .line 309
    invoke-direct {v4}, LN1/m;-><init>()V

    .line 310
    .line 311
    .line 312
    iput-object v6, v4, LN1/m;->a:Ljava/lang/String;

    .line 313
    .line 314
    const-string v5, "video/hevc"

    .line 315
    .line 316
    invoke-static {v5}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v5

    .line 320
    iput-object v5, v4, LN1/m;->m:Ljava/lang/String;

    .line 321
    .line 322
    iput-object v8, v4, LN1/m;->j:Ljava/lang/String;

    .line 323
    .line 324
    iget v5, v3, LR1/j;->d:I

    .line 325
    .line 326
    iput v5, v4, LN1/m;->t:I

    .line 327
    .line 328
    iget v5, v3, LR1/j;->e:I

    .line 329
    .line 330
    iput v5, v4, LN1/m;->u:I

    .line 331
    .line 332
    iget v5, v3, LR1/j;->b:I

    .line 333
    .line 334
    add-int/lit8 v32, v5, 0x8

    .line 335
    .line 336
    iget v5, v3, LR1/j;->c:I

    .line 337
    .line 338
    add-int/lit8 v33, v5, 0x8

    .line 339
    .line 340
    new-instance v28, LN1/f;

    .line 341
    .line 342
    iget v5, v3, LR1/j;->j:I

    .line 343
    .line 344
    const/16 v34, 0x0

    .line 345
    .line 346
    iget v6, v3, LR1/j;->h:I

    .line 347
    .line 348
    iget v8, v3, LR1/j;->i:I

    .line 349
    .line 350
    move/from16 v31, v5

    .line 351
    .line 352
    move/from16 v29, v6

    .line 353
    .line 354
    move/from16 v30, v8

    .line 355
    .line 356
    invoke-direct/range {v28 .. v34}, LN1/f;-><init>(IIIII[B)V

    .line 357
    .line 358
    .line 359
    move-object/from16 v5, v28

    .line 360
    .line 361
    iput-object v5, v4, LN1/m;->A:LN1/f;

    .line 362
    .line 363
    iget v5, v3, LR1/j;->f:F

    .line 364
    .line 365
    iput v5, v4, LN1/m;->x:F

    .line 366
    .line 367
    iget v3, v3, LR1/j;->g:I

    .line 368
    .line 369
    iput v3, v4, LN1/m;->o:I

    .line 370
    .line 371
    invoke-static/range {v27 .. v27}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 372
    .line 373
    .line 374
    move-result-object v3

    .line 375
    iput-object v3, v4, LN1/m;->p:Ljava/util/List;

    .line 376
    .line 377
    new-instance v3, LN1/n;

    .line 378
    .line 379
    invoke-direct {v3, v4}, LN1/n;-><init>(LN1/m;)V

    .line 380
    .line 381
    .line 382
    iget-object v4, v0, LT5/p;->h:Ljava/lang/Object;

    .line 383
    .line 384
    check-cast v4, Ls2/C;

    .line 385
    .line 386
    invoke-interface {v4, v3}, Ls2/C;->c(LN1/n;)V

    .line 387
    .line 388
    .line 389
    const/4 v4, -0x1

    .line 390
    iget v3, v3, LN1/n;->p:I

    .line 391
    .line 392
    if-eq v3, v4, :cond_8

    .line 393
    .line 394
    const/4 v4, 0x1

    .line 395
    goto :goto_6

    .line 396
    :cond_8
    const/4 v4, 0x0

    .line 397
    :goto_6
    invoke-static {v4}, LFe/e;->x(Z)V

    .line 398
    .line 399
    .line 400
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 401
    .line 402
    .line 403
    if-ltz v3, :cond_9

    .line 404
    .line 405
    const/4 v4, 0x1

    .line 406
    goto :goto_7

    .line 407
    :cond_9
    const/4 v4, 0x0

    .line 408
    :goto_7
    invoke-static {v4}, LQ1/k;->g(Z)V

    .line 409
    .line 410
    .line 411
    iput v3, v7, LR1/q;->a:I

    .line 412
    .line 413
    invoke-virtual {v7, v3}, LR1/q;->p(I)V

    .line 414
    .line 415
    .line 416
    const/4 v6, 0x1

    .line 417
    iput-boolean v6, v0, LT5/p;->c:Z

    .line 418
    .line 419
    goto :goto_8

    .line 420
    :cond_a
    move/from16 v17, v2

    .line 421
    .line 422
    move/from16 v20, v3

    .line 423
    .line 424
    move/from16 v18, v4

    .line 425
    .line 426
    move-object/from16 v19, v5

    .line 427
    .line 428
    move/from16 v16, v8

    .line 429
    .line 430
    move-object v2, v9

    .line 431
    :goto_8
    iget-object v3, v0, LT5/p;->m:Ljava/lang/Object;

    .line 432
    .line 433
    check-cast v3, LT5/s;

    .line 434
    .line 435
    invoke-virtual {v3, v10}, LT5/s;->b(I)Z

    .line 436
    .line 437
    .line 438
    move-result v4

    .line 439
    const/4 v5, 0x5

    .line 440
    iget-object v6, v0, LT5/p;->o:Ljava/lang/Object;

    .line 441
    .line 442
    check-cast v6, LQ1/o;

    .line 443
    .line 444
    if-eqz v4, :cond_b

    .line 445
    .line 446
    iget-object v4, v3, LT5/s;->e:Ljava/lang/Object;

    .line 447
    .line 448
    check-cast v4, [B

    .line 449
    .line 450
    iget v8, v3, LT5/s;->f:I

    .line 451
    .line 452
    invoke-static {v8, v4}, LR1/n;->k(I[B)I

    .line 453
    .line 454
    .line 455
    move-result v4

    .line 456
    iget-object v8, v3, LT5/s;->e:Ljava/lang/Object;

    .line 457
    .line 458
    check-cast v8, [B

    .line 459
    .line 460
    invoke-virtual {v6, v4, v8}, LQ1/o;->E(I[B)V

    .line 461
    .line 462
    .line 463
    invoke-virtual {v6, v5}, LQ1/o;->H(I)V

    .line 464
    .line 465
    .line 466
    invoke-virtual {v7, v13, v14, v6}, LR1/q;->m(JLQ1/o;)V

    .line 467
    .line 468
    .line 469
    :cond_b
    iget-object v4, v0, LT5/p;->n:Ljava/lang/Object;

    .line 470
    .line 471
    check-cast v4, LT5/s;

    .line 472
    .line 473
    invoke-virtual {v4, v10}, LT5/s;->b(I)Z

    .line 474
    .line 475
    .line 476
    move-result v8

    .line 477
    if-eqz v8, :cond_c

    .line 478
    .line 479
    iget-object v8, v4, LT5/s;->e:Ljava/lang/Object;

    .line 480
    .line 481
    check-cast v8, [B

    .line 482
    .line 483
    iget v9, v4, LT5/s;->f:I

    .line 484
    .line 485
    invoke-static {v9, v8}, LR1/n;->k(I[B)I

    .line 486
    .line 487
    .line 488
    move-result v8

    .line 489
    iget-object v9, v4, LT5/s;->e:Ljava/lang/Object;

    .line 490
    .line 491
    check-cast v9, [B

    .line 492
    .line 493
    invoke-virtual {v6, v8, v9}, LQ1/o;->E(I[B)V

    .line 494
    .line 495
    .line 496
    invoke-virtual {v6, v5}, LQ1/o;->H(I)V

    .line 497
    .line 498
    .line 499
    invoke-virtual {v7, v13, v14, v6}, LR1/q;->m(JLQ1/o;)V

    .line 500
    .line 501
    .line 502
    :cond_c
    iget-wide v5, v0, LT5/p;->f:J

    .line 503
    .line 504
    iget-object v7, v0, LT5/p;->i:Ljava/lang/Object;

    .line 505
    .line 506
    check-cast v7, LT5/o;

    .line 507
    .line 508
    iget-boolean v8, v0, LT5/p;->c:Z

    .line 509
    .line 510
    const/4 v9, 0x0

    .line 511
    iput-boolean v9, v7, LT5/o;->f:Z

    .line 512
    .line 513
    iput-boolean v9, v7, LT5/o;->g:Z

    .line 514
    .line 515
    iput-wide v5, v7, LT5/o;->d:J

    .line 516
    .line 517
    iput v9, v7, LT5/o;->c:I

    .line 518
    .line 519
    iput-wide v11, v7, LT5/o;->a:J

    .line 520
    .line 521
    const/16 v5, 0x20

    .line 522
    .line 523
    move/from16 v6, v16

    .line 524
    .line 525
    if-lt v6, v5, :cond_d

    .line 526
    .line 527
    const/16 v10, 0x28

    .line 528
    .line 529
    if-ne v6, v10, :cond_e

    .line 530
    .line 531
    :cond_d
    const/4 v8, 0x1

    .line 532
    const/4 v9, 0x0

    .line 533
    goto :goto_a

    .line 534
    :cond_e
    iget-boolean v10, v7, LT5/o;->h:Z

    .line 535
    .line 536
    if-eqz v10, :cond_10

    .line 537
    .line 538
    iget-boolean v10, v7, LT5/o;->i:Z

    .line 539
    .line 540
    if-nez v10, :cond_10

    .line 541
    .line 542
    if-eqz v8, :cond_f

    .line 543
    .line 544
    move/from16 v8, v20

    .line 545
    .line 546
    invoke-virtual {v7, v8}, LT5/o;->a(I)V

    .line 547
    .line 548
    .line 549
    :cond_f
    const/4 v9, 0x0

    .line 550
    iput-boolean v9, v7, LT5/o;->h:Z

    .line 551
    .line 552
    goto :goto_9

    .line 553
    :cond_10
    const/4 v9, 0x0

    .line 554
    :goto_9
    if-gt v5, v6, :cond_11

    .line 555
    .line 556
    const/16 v5, 0x23

    .line 557
    .line 558
    if-le v6, v5, :cond_12

    .line 559
    .line 560
    :cond_11
    const/16 v5, 0x27

    .line 561
    .line 562
    if-ne v6, v5, :cond_13

    .line 563
    .line 564
    :cond_12
    iget-boolean v5, v7, LT5/o;->i:Z

    .line 565
    .line 566
    const/4 v8, 0x1

    .line 567
    xor-int/2addr v5, v8

    .line 568
    iput-boolean v5, v7, LT5/o;->g:Z

    .line 569
    .line 570
    iput-boolean v8, v7, LT5/o;->i:Z

    .line 571
    .line 572
    goto :goto_a

    .line 573
    :cond_13
    const/4 v8, 0x1

    .line 574
    :goto_a
    const/16 v5, 0x10

    .line 575
    .line 576
    if-lt v6, v5, :cond_14

    .line 577
    .line 578
    const/16 v5, 0x15

    .line 579
    .line 580
    if-gt v6, v5, :cond_14

    .line 581
    .line 582
    move v5, v8

    .line 583
    goto :goto_b

    .line 584
    :cond_14
    move v5, v9

    .line 585
    :goto_b
    iput-boolean v5, v7, LT5/o;->b:Z

    .line 586
    .line 587
    if-nez v5, :cond_15

    .line 588
    .line 589
    const/16 v5, 0x9

    .line 590
    .line 591
    if-gt v6, v5, :cond_16

    .line 592
    .line 593
    :cond_15
    move v9, v8

    .line 594
    :cond_16
    iput-boolean v9, v7, LT5/o;->e:Z

    .line 595
    .line 596
    iget-boolean v5, v0, LT5/p;->c:Z

    .line 597
    .line 598
    if-nez v5, :cond_17

    .line 599
    .line 600
    invoke-virtual {v1, v6}, LT5/s;->e(I)V

    .line 601
    .line 602
    .line 603
    invoke-virtual {v2, v6}, LT5/s;->e(I)V

    .line 604
    .line 605
    .line 606
    invoke-virtual {v15, v6}, LT5/s;->e(I)V

    .line 607
    .line 608
    .line 609
    :cond_17
    invoke-virtual {v3, v6}, LT5/s;->e(I)V

    .line 610
    .line 611
    .line 612
    invoke-virtual {v4, v6}, LT5/s;->e(I)V

    .line 613
    .line 614
    .line 615
    move-object/from16 v1, p1

    .line 616
    .line 617
    move/from16 v3, v17

    .line 618
    .line 619
    move/from16 v4, v18

    .line 620
    .line 621
    move-object/from16 v5, v19

    .line 622
    .line 623
    const/4 v2, 0x3

    .line 624
    goto/16 :goto_1

    .line 625
    .line 626
    :cond_18
    move-object/from16 v1, p1

    .line 627
    .line 628
    goto/16 :goto_0

    .line 629
    .line 630
    :cond_19
    return-void
.end method

.method public f(Ls2/o;LT5/B;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, LT5/B;->a()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, LT5/B;->b()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p2, LT5/B;->f:Ljava/lang/String;

    .line 8
    .line 9
    iput-object v0, p0, LT5/p;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p2}, LT5/B;->b()V

    .line 12
    .line 13
    .line 14
    iget v0, p2, LT5/B;->e:I

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    invoke-interface {p1, v0, v1}, Ls2/o;->m(II)Ls2/C;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, LT5/p;->h:Ljava/lang/Object;

    .line 22
    .line 23
    new-instance v1, LT5/o;

    .line 24
    .line 25
    invoke-direct {v1, v0}, LT5/o;-><init>(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, LT5/p;->i:Ljava/lang/Object;

    .line 29
    .line 30
    iget-object v0, p0, LT5/p;->g:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Lb7/k;

    .line 33
    .line 34
    invoke-virtual {v0, p1, p2}, Lb7/k;->q(Ls2/o;LT5/B;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public g(LJ5/m;LT5/B;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, LT5/B;->a()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, LT5/B;->b()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p2, LT5/B;->f:Ljava/lang/String;

    .line 8
    .line 9
    iput-object v0, p0, LT5/p;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p2}, LT5/B;->b()V

    .line 12
    .line 13
    .line 14
    iget v0, p2, LT5/B;->e:I

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    invoke-interface {p1, v0, v1}, LJ5/m;->m(II)LJ5/w;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, LT5/p;->h:Ljava/lang/Object;

    .line 22
    .line 23
    new-instance v1, LT5/o;

    .line 24
    .line 25
    invoke-direct {v1, v0}, LT5/o;-><init>(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, LT5/p;->i:Ljava/lang/Object;

    .line 29
    .line 30
    iget-object v0, p0, LT5/p;->g:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, LS3/s;

    .line 33
    .line 34
    invoke-virtual {v0, p1, p2}, LS3/s;->k(LJ5/m;LT5/B;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public h(Z)V
    .locals 5

    .line 1
    iget-object v0, p0, LT5/p;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ls2/C;

    .line 4
    .line 5
    invoke-static {v0}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    sget v0, LQ1/x;->a:I

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    iget-object p1, p0, LT5/p;->g:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p1, Lb7/k;

    .line 15
    .line 16
    iget-object p1, p1, Lb7/k;->d:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p1, LR1/q;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-virtual {p1, v0}, LR1/q;->p(I)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, LT5/p;->i:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, LT5/o;

    .line 27
    .line 28
    iget-wide v1, p0, LT5/p;->e:J

    .line 29
    .line 30
    iget-boolean v3, p1, LT5/o;->b:Z

    .line 31
    .line 32
    iput-boolean v3, p1, LT5/o;->l:Z

    .line 33
    .line 34
    iget-wide v3, p1, LT5/o;->a:J

    .line 35
    .line 36
    sub-long v3, v1, v3

    .line 37
    .line 38
    long-to-int v3, v3

    .line 39
    invoke-virtual {p1, v3}, LT5/o;->a(I)V

    .line 40
    .line 41
    .line 42
    iget-wide v3, p1, LT5/o;->a:J

    .line 43
    .line 44
    iput-wide v3, p1, LT5/o;->j:J

    .line 45
    .line 46
    iput-wide v1, p1, LT5/o;->a:J

    .line 47
    .line 48
    invoke-virtual {p1, v0}, LT5/o;->a(I)V

    .line 49
    .line 50
    .line 51
    iput-boolean v0, p1, LT5/o;->h:Z

    .line 52
    .line 53
    :cond_0
    return-void
.end method

.method public i()V
    .locals 0

    .line 1
    return-void
.end method
