.class public final LN2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LS1/g;


# instance fields
.field public final synthetic a:I

.field public b:I

.field public c:I

.field public d:Z

.field public final e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 1
    iput p1, p0, LN2/e;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance p1, LN2/f;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-direct {p1, v0}, LN2/f;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, LN2/e;->e:Ljava/lang/Object;

    .line 16
    .line 17
    new-instance p1, LQ1/o;

    .line 18
    .line 19
    const v0, 0xfe01

    .line 20
    .line 21
    .line 22
    new-array v0, v0, [B

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-direct {p1, v0, v1}, LQ1/o;-><init>([BI)V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, LN2/e;->f:Ljava/lang/Object;

    .line 29
    .line 30
    const/4 p1, -0x1

    .line 31
    iput p1, p0, LN2/e;->b:I

    .line 32
    .line 33
    return-void

    .line 34
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    new-instance p1, LN2/f;

    .line 38
    .line 39
    const/4 v0, 0x1

    .line 40
    invoke-direct {p1, v0}, LN2/f;-><init>(I)V

    .line 41
    .line 42
    .line 43
    iput-object p1, p0, LN2/e;->e:Ljava/lang/Object;

    .line 44
    .line 45
    new-instance p1, LY4/b;

    .line 46
    .line 47
    const v0, 0xfe01

    .line 48
    .line 49
    .line 50
    new-array v0, v0, [B

    .line 51
    .line 52
    const/4 v1, 0x0

    .line 53
    invoke-direct {p1, v0, v1}, LY4/b;-><init>([BI)V

    .line 54
    .line 55
    .line 56
    iput-object p1, p0, LN2/e;->f:Ljava/lang/Object;

    .line 57
    .line 58
    const/4 p1, -0x1

    .line 59
    iput p1, p0, LN2/e;->b:I

    .line 60
    .line 61
    return-void

    .line 62
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    .line 64
    .line 65
    new-instance p1, LS1/v;

    .line 66
    .line 67
    const/4 v0, 0x0

    .line 68
    invoke-direct {p1, v0}, LS1/v;-><init>(I)V

    .line 69
    .line 70
    .line 71
    iput-object p1, p0, LN2/e;->e:Ljava/lang/Object;

    .line 72
    .line 73
    const/16 p1, 0x1f40

    .line 74
    .line 75
    iput p1, p0, LN2/e;->b:I

    .line 76
    .line 77
    iput p1, p0, LN2/e;->c:I

    .line 78
    .line 79
    return-void

    .line 80
    nop

    .line 81
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(I)I
    .locals 5

    .line 1
    iget v0, p0, LN2/e;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput v0, p0, LN2/e;->c:I

    .line 8
    .line 9
    :cond_0
    iget v1, p0, LN2/e;->c:I

    .line 10
    .line 11
    add-int v2, p1, v1

    .line 12
    .line 13
    iget-object v3, p0, LN2/e;->e:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, LN2/f;

    .line 16
    .line 17
    iget v4, v3, LN2/f;->c:I

    .line 18
    .line 19
    if-ge v2, v4, :cond_1

    .line 20
    .line 21
    iget-object v2, v3, LN2/f;->f:[I

    .line 22
    .line 23
    add-int/lit8 v3, v1, 0x1

    .line 24
    .line 25
    iput v3, p0, LN2/e;->c:I

    .line 26
    .line 27
    add-int/2addr v1, p1

    .line 28
    aget v1, v2, v1

    .line 29
    .line 30
    add-int/2addr v0, v1

    .line 31
    const/16 v2, 0xff

    .line 32
    .line 33
    if-eq v1, v2, :cond_0

    .line 34
    .line 35
    :cond_1
    return v0

    .line 36
    :pswitch_0
    const/4 v0, 0x0

    .line 37
    iput v0, p0, LN2/e;->c:I

    .line 38
    .line 39
    :cond_2
    iget v1, p0, LN2/e;->c:I

    .line 40
    .line 41
    add-int v2, p1, v1

    .line 42
    .line 43
    iget-object v3, p0, LN2/e;->e:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v3, LN2/f;

    .line 46
    .line 47
    iget v4, v3, LN2/f;->c:I

    .line 48
    .line 49
    if-ge v2, v4, :cond_3

    .line 50
    .line 51
    iget-object v2, v3, LN2/f;->f:[I

    .line 52
    .line 53
    add-int/lit8 v3, v1, 0x1

    .line 54
    .line 55
    iput v3, p0, LN2/e;->c:I

    .line 56
    .line 57
    add-int/2addr v1, p1

    .line 58
    aget v1, v2, v1

    .line 59
    .line 60
    add-int/2addr v0, v1

    .line 61
    const/16 v2, 0xff

    .line 62
    .line 63
    if-eq v1, v2, :cond_2

    .line 64
    .line 65
    :cond_3
    return v0

    .line 66
    nop

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public b()LS1/h;
    .locals 6

    .line 1
    new-instance v0, LS1/o;

    .line 2
    .line 3
    iget-object v1, p0, LN2/e;->f:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/lang/String;

    .line 6
    .line 7
    iget-boolean v4, p0, LN2/e;->d:Z

    .line 8
    .line 9
    iget v2, p0, LN2/e;->b:I

    .line 10
    .line 11
    iget v3, p0, LN2/e;->c:I

    .line 12
    .line 13
    iget-object v5, p0, LN2/e;->e:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v5, LS1/v;

    .line 16
    .line 17
    invoke-direct/range {v0 .. v5}, LS1/o;-><init>(Ljava/lang/String;IIZLS1/v;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public c(LJ5/h;)Z
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    move v2, v0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    move v2, v1

    .line 8
    :goto_0
    invoke-static {v2}, Lu6/a;->i(Z)V

    .line 9
    .line 10
    .line 11
    iget-boolean v2, p0, LN2/e;->d:Z

    .line 12
    .line 13
    iget-object v3, p0, LN2/e;->f:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, LY4/b;

    .line 16
    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    iput-boolean v1, p0, LN2/e;->d:Z

    .line 20
    .line 21
    invoke-virtual {v3, v1}, LY4/b;->x(I)V

    .line 22
    .line 23
    .line 24
    :cond_1
    :goto_1
    iget-boolean v2, p0, LN2/e;->d:Z

    .line 25
    .line 26
    if-nez v2, :cond_9

    .line 27
    .line 28
    iget v2, p0, LN2/e;->b:I

    .line 29
    .line 30
    iget-object v4, p0, LN2/e;->e:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v4, LN2/f;

    .line 33
    .line 34
    if-gez v2, :cond_4

    .line 35
    .line 36
    const-wide/16 v5, -0x1

    .line 37
    .line 38
    invoke-virtual {v4, p1, v5, v6}, LN2/f;->c(LJ5/h;J)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_6

    .line 43
    .line 44
    invoke-virtual {v4, p1, v0}, LN2/f;->a(LJ5/h;Z)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-nez v2, :cond_2

    .line 49
    .line 50
    goto :goto_4

    .line 51
    :cond_2
    iget v2, v4, LN2/f;->d:I

    .line 52
    .line 53
    iget v5, v4, LN2/f;->a:I

    .line 54
    .line 55
    and-int/2addr v5, v0

    .line 56
    if-ne v5, v0, :cond_3

    .line 57
    .line 58
    iget v5, v3, LY4/b;->c:I

    .line 59
    .line 60
    if-nez v5, :cond_3

    .line 61
    .line 62
    invoke-virtual {p0, v1}, LN2/e;->a(I)I

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    add-int/2addr v2, v5

    .line 67
    iget v5, p0, LN2/e;->c:I

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_3
    move v5, v1

    .line 71
    :goto_2
    :try_start_0
    invoke-virtual {p1, v2}, LJ5/h;->j(I)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    .line 73
    .line 74
    iput v5, p0, LN2/e;->b:I

    .line 75
    .line 76
    :cond_4
    iget v2, p0, LN2/e;->b:I

    .line 77
    .line 78
    invoke-virtual {p0, v2}, LN2/e;->a(I)I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    iget v5, p0, LN2/e;->b:I

    .line 83
    .line 84
    iget v6, p0, LN2/e;->c:I

    .line 85
    .line 86
    add-int/2addr v5, v6

    .line 87
    if-lez v2, :cond_7

    .line 88
    .line 89
    iget v6, v3, LY4/b;->c:I

    .line 90
    .line 91
    add-int/2addr v6, v2

    .line 92
    invoke-virtual {v3, v6}, LY4/b;->b(I)V

    .line 93
    .line 94
    .line 95
    iget-object v6, v3, LY4/b;->a:[B

    .line 96
    .line 97
    iget v7, v3, LY4/b;->c:I

    .line 98
    .line 99
    :try_start_1
    invoke-virtual {p1, v6, v7, v2, v1}, LJ5/h;->f([BIIZ)Z
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0

    .line 100
    .line 101
    .line 102
    iget v6, v3, LY4/b;->c:I

    .line 103
    .line 104
    add-int/2addr v6, v2

    .line 105
    invoke-virtual {v3, v6}, LY4/b;->z(I)V

    .line 106
    .line 107
    .line 108
    iget-object v2, v4, LN2/f;->f:[I

    .line 109
    .line 110
    add-int/lit8 v6, v5, -0x1

    .line 111
    .line 112
    aget v2, v2, v6

    .line 113
    .line 114
    const/16 v6, 0xff

    .line 115
    .line 116
    if-eq v2, v6, :cond_5

    .line 117
    .line 118
    move v2, v0

    .line 119
    goto :goto_3

    .line 120
    :cond_5
    move v2, v1

    .line 121
    :goto_3
    iput-boolean v2, p0, LN2/e;->d:Z

    .line 122
    .line 123
    goto :goto_5

    .line 124
    :catch_0
    :cond_6
    :goto_4
    return v1

    .line 125
    :cond_7
    :goto_5
    iget v2, v4, LN2/f;->c:I

    .line 126
    .line 127
    if-ne v5, v2, :cond_8

    .line 128
    .line 129
    const/4 v5, -0x1

    .line 130
    :cond_8
    iput v5, p0, LN2/e;->b:I

    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_9
    return v0
.end method

.method public d(Ls2/j;)Z
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    move v2, v0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    move v2, v1

    .line 8
    :goto_0
    invoke-static {v2}, LQ1/k;->g(Z)V

    .line 9
    .line 10
    .line 11
    iget-boolean v2, p0, LN2/e;->d:Z

    .line 12
    .line 13
    iget-object v3, p0, LN2/e;->f:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, LQ1/o;

    .line 16
    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    iput-boolean v1, p0, LN2/e;->d:Z

    .line 20
    .line 21
    invoke-virtual {v3, v1}, LQ1/o;->D(I)V

    .line 22
    .line 23
    .line 24
    :cond_1
    :goto_1
    iget-boolean v2, p0, LN2/e;->d:Z

    .line 25
    .line 26
    if-nez v2, :cond_9

    .line 27
    .line 28
    iget v2, p0, LN2/e;->b:I

    .line 29
    .line 30
    iget-object v4, p0, LN2/e;->e:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v4, LN2/f;

    .line 33
    .line 34
    if-gez v2, :cond_4

    .line 35
    .line 36
    const-wide/16 v5, -0x1

    .line 37
    .line 38
    invoke-virtual {v4, p1, v5, v6}, LN2/f;->d(Ls2/j;J)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_6

    .line 43
    .line 44
    invoke-virtual {v4, p1, v0}, LN2/f;->b(Ls2/j;Z)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-nez v2, :cond_2

    .line 49
    .line 50
    goto :goto_4

    .line 51
    :cond_2
    iget v2, v4, LN2/f;->d:I

    .line 52
    .line 53
    iget v5, v4, LN2/f;->a:I

    .line 54
    .line 55
    and-int/2addr v5, v0

    .line 56
    if-ne v5, v0, :cond_3

    .line 57
    .line 58
    iget v5, v3, LQ1/o;->c:I

    .line 59
    .line 60
    if-nez v5, :cond_3

    .line 61
    .line 62
    invoke-virtual {p0, v1}, LN2/e;->a(I)I

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    add-int/2addr v2, v5

    .line 67
    iget v5, p0, LN2/e;->c:I

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_3
    move v5, v1

    .line 71
    :goto_2
    :try_start_0
    invoke-virtual {p1, v2}, Ls2/j;->j(I)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    .line 73
    .line 74
    iput v5, p0, LN2/e;->b:I

    .line 75
    .line 76
    :cond_4
    iget v2, p0, LN2/e;->b:I

    .line 77
    .line 78
    invoke-virtual {p0, v2}, LN2/e;->a(I)I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    iget v5, p0, LN2/e;->b:I

    .line 83
    .line 84
    iget v6, p0, LN2/e;->c:I

    .line 85
    .line 86
    add-int/2addr v5, v6

    .line 87
    if-lez v2, :cond_7

    .line 88
    .line 89
    iget v6, v3, LQ1/o;->c:I

    .line 90
    .line 91
    add-int/2addr v6, v2

    .line 92
    invoke-virtual {v3, v6}, LQ1/o;->b(I)V

    .line 93
    .line 94
    .line 95
    iget-object v6, v3, LQ1/o;->a:[B

    .line 96
    .line 97
    iget v7, v3, LQ1/o;->c:I

    .line 98
    .line 99
    :try_start_1
    invoke-virtual {p1, v6, v7, v2, v1}, Ls2/j;->f([BIIZ)Z
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0

    .line 100
    .line 101
    .line 102
    iget v6, v3, LQ1/o;->c:I

    .line 103
    .line 104
    add-int/2addr v6, v2

    .line 105
    invoke-virtual {v3, v6}, LQ1/o;->F(I)V

    .line 106
    .line 107
    .line 108
    iget-object v2, v4, LN2/f;->f:[I

    .line 109
    .line 110
    add-int/lit8 v6, v5, -0x1

    .line 111
    .line 112
    aget v2, v2, v6

    .line 113
    .line 114
    const/16 v6, 0xff

    .line 115
    .line 116
    if-eq v2, v6, :cond_5

    .line 117
    .line 118
    move v2, v0

    .line 119
    goto :goto_3

    .line 120
    :cond_5
    move v2, v1

    .line 121
    :goto_3
    iput-boolean v2, p0, LN2/e;->d:Z

    .line 122
    .line 123
    goto :goto_5

    .line 124
    :catch_0
    :cond_6
    :goto_4
    return v1

    .line 125
    :cond_7
    :goto_5
    iget v2, v4, LN2/f;->c:I

    .line 126
    .line 127
    if-ne v5, v2, :cond_8

    .line 128
    .line 129
    const/4 v5, -0x1

    .line 130
    :cond_8
    iput v5, p0, LN2/e;->b:I

    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_9
    return v0
.end method

.method public e(Ljava/util/HashMap;)V
    .locals 2

    .line 1
    iget-object v0, p0, LN2/e;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LS1/v;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    const/4 v1, 0x0

    .line 7
    :try_start_0
    iput-object v1, v0, LS1/v;->c:Ljava/util/Map;

    .line 8
    .line 9
    iget-object v1, v0, LS1/v;->b:Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 12
    .line 13
    .line 14
    iget-object v1, v0, LS1/v;->b:Ljava/util/HashMap;

    .line 15
    .line 16
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    monitor-exit v0

    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    throw p1
.end method
