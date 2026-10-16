.class public final LJ5/p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:I

.field public final j:I

.field public final k:J

.field public final l:Ljava/lang/Object;

.field public final m:Landroid/os/Parcelable;


# direct methods
.method public constructor <init>(IIIIIIIJLS3/e;LW5/c;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LJ5/p;->a:I

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput p1, p0, LJ5/p;->b:I

    .line 36
    iput p2, p0, LJ5/p;->c:I

    .line 37
    iput p3, p0, LJ5/p;->d:I

    .line 38
    iput p4, p0, LJ5/p;->e:I

    .line 39
    iput p5, p0, LJ5/p;->f:I

    .line 40
    invoke-static {p5}, LJ5/p;->f(I)I

    move-result p1

    iput p1, p0, LJ5/p;->g:I

    .line 41
    iput p6, p0, LJ5/p;->h:I

    .line 42
    iput p7, p0, LJ5/p;->i:I

    .line 43
    invoke-static {p7}, LJ5/p;->a(I)I

    move-result p1

    iput p1, p0, LJ5/p;->j:I

    .line 44
    iput-wide p8, p0, LJ5/p;->k:J

    .line 45
    iput-object p10, p0, LJ5/p;->l:Ljava/lang/Object;

    .line 46
    iput-object p11, p0, LJ5/p;->m:Landroid/os/Parcelable;

    return-void
.end method

.method public constructor <init>(IIIIIIIJLY2/B;LN1/B;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LJ5/p;->a:I

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput p1, p0, LJ5/p;->b:I

    .line 49
    iput p2, p0, LJ5/p;->c:I

    .line 50
    iput p3, p0, LJ5/p;->d:I

    .line 51
    iput p4, p0, LJ5/p;->e:I

    .line 52
    iput p5, p0, LJ5/p;->f:I

    .line 53
    invoke-static {p5}, LJ5/p;->g(I)I

    move-result p1

    iput p1, p0, LJ5/p;->g:I

    .line 54
    iput p6, p0, LJ5/p;->h:I

    .line 55
    iput p7, p0, LJ5/p;->i:I

    .line 56
    invoke-static {p7}, LJ5/p;->b(I)I

    move-result p1

    iput p1, p0, LJ5/p;->j:I

    .line 57
    iput-wide p8, p0, LJ5/p;->k:J

    .line 58
    iput-object p10, p0, LJ5/p;->l:Ljava/lang/Object;

    .line 59
    iput-object p11, p0, LJ5/p;->m:Landroid/os/Parcelable;

    return-void
.end method

.method public constructor <init>([BII)V
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x5

    const/4 v2, 0x3

    const/16 v3, 0x14

    const/16 v4, 0x18

    const/16 v5, 0x10

    const/4 v6, 0x1

    const/4 v7, 0x0

    iput p3, p0, LJ5/p;->a:I

    packed-switch p3, :pswitch_data_0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance p3, LJ5/y;

    .line 3
    array-length v8, p1

    const/4 v9, 0x6

    invoke-direct {p3, p1, v8, v9, v7}, LJ5/y;-><init>([BIIB)V

    mul-int/lit8 p2, p2, 0x8

    .line 4
    invoke-virtual {p3, p2}, LJ5/y;->q(I)V

    .line 5
    invoke-virtual {p3, v5}, LJ5/y;->i(I)I

    move-result p1

    iput p1, p0, LJ5/p;->b:I

    .line 6
    invoke-virtual {p3, v5}, LJ5/y;->i(I)I

    move-result p1

    iput p1, p0, LJ5/p;->c:I

    .line 7
    invoke-virtual {p3, v4}, LJ5/y;->i(I)I

    move-result p1

    iput p1, p0, LJ5/p;->d:I

    .line 8
    invoke-virtual {p3, v4}, LJ5/y;->i(I)I

    move-result p1

    iput p1, p0, LJ5/p;->e:I

    .line 9
    invoke-virtual {p3, v3}, LJ5/y;->i(I)I

    move-result p1

    iput p1, p0, LJ5/p;->f:I

    .line 10
    invoke-static {p1}, LJ5/p;->f(I)I

    move-result p1

    iput p1, p0, LJ5/p;->g:I

    .line 11
    invoke-virtual {p3, v2}, LJ5/y;->i(I)I

    move-result p1

    add-int/2addr p1, v6

    iput p1, p0, LJ5/p;->h:I

    .line 12
    invoke-virtual {p3, v1}, LJ5/y;->i(I)I

    move-result p1

    add-int/2addr p1, v6

    iput p1, p0, LJ5/p;->i:I

    .line 13
    invoke-static {p1}, LJ5/p;->a(I)I

    move-result p1

    iput p1, p0, LJ5/p;->j:I

    const/4 p1, 0x4

    .line 14
    invoke-virtual {p3, p1}, LJ5/y;->i(I)I

    move-result p1

    const/16 p2, 0x20

    invoke-virtual {p3, p2}, LJ5/y;->i(I)I

    move-result p3

    sget v1, Lu6/v;->a:I

    int-to-long v1, p1

    const-wide v3, 0xffffffffL

    and-long/2addr v1, v3

    shl-long p1, v1, p2

    int-to-long v1, p3

    and-long/2addr v1, v3

    or-long/2addr p1, v1

    .line 15
    iput-wide p1, p0, LJ5/p;->k:J

    .line 16
    iput-object v0, p0, LJ5/p;->l:Ljava/lang/Object;

    .line 17
    iput-object v0, p0, LJ5/p;->m:Landroid/os/Parcelable;

    return-void

    .line 18
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    new-instance p3, LJ5/y;

    .line 20
    array-length v8, p1

    invoke-direct {p3, p1, v8, v6, v7}, LJ5/y;-><init>([BIIB)V

    mul-int/lit8 p2, p2, 0x8

    .line 21
    invoke-virtual {p3, p2}, LJ5/y;->q(I)V

    .line 22
    invoke-virtual {p3, v5}, LJ5/y;->i(I)I

    move-result p1

    iput p1, p0, LJ5/p;->b:I

    .line 23
    invoke-virtual {p3, v5}, LJ5/y;->i(I)I

    move-result p1

    iput p1, p0, LJ5/p;->c:I

    .line 24
    invoke-virtual {p3, v4}, LJ5/y;->i(I)I

    move-result p1

    iput p1, p0, LJ5/p;->d:I

    .line 25
    invoke-virtual {p3, v4}, LJ5/y;->i(I)I

    move-result p1

    iput p1, p0, LJ5/p;->e:I

    .line 26
    invoke-virtual {p3, v3}, LJ5/y;->i(I)I

    move-result p1

    iput p1, p0, LJ5/p;->f:I

    .line 27
    invoke-static {p1}, LJ5/p;->g(I)I

    move-result p1

    iput p1, p0, LJ5/p;->g:I

    .line 28
    invoke-virtual {p3, v2}, LJ5/y;->i(I)I

    move-result p1

    add-int/2addr p1, v6

    iput p1, p0, LJ5/p;->h:I

    .line 29
    invoke-virtual {p3, v1}, LJ5/y;->i(I)I

    move-result p1

    add-int/2addr p1, v6

    iput p1, p0, LJ5/p;->i:I

    .line 30
    invoke-static {p1}, LJ5/p;->b(I)I

    move-result p1

    iput p1, p0, LJ5/p;->j:I

    const/16 p1, 0x24

    .line 31
    invoke-virtual {p3, p1}, LJ5/y;->k(I)J

    move-result-wide p1

    iput-wide p1, p0, LJ5/p;->k:J

    .line 32
    iput-object v0, p0, LJ5/p;->l:Ljava/lang/Object;

    .line 33
    iput-object v0, p0, LJ5/p;->m:Landroid/os/Parcelable;

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public static a(I)I
    .locals 1

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    if-eq p0, v0, :cond_4

    .line 4
    .line 5
    const/16 v0, 0xc

    .line 6
    .line 7
    if-eq p0, v0, :cond_3

    .line 8
    .line 9
    const/16 v0, 0x10

    .line 10
    .line 11
    if-eq p0, v0, :cond_2

    .line 12
    .line 13
    const/16 v0, 0x14

    .line 14
    .line 15
    if-eq p0, v0, :cond_1

    .line 16
    .line 17
    const/16 v0, 0x18

    .line 18
    .line 19
    if-eq p0, v0, :cond_0

    .line 20
    .line 21
    const/4 p0, -0x1

    .line 22
    return p0

    .line 23
    :cond_0
    const/4 p0, 0x6

    .line 24
    return p0

    .line 25
    :cond_1
    const/4 p0, 0x5

    .line 26
    return p0

    .line 27
    :cond_2
    const/4 p0, 0x4

    .line 28
    return p0

    .line 29
    :cond_3
    const/4 p0, 0x2

    .line 30
    return p0

    .line 31
    :cond_4
    const/4 p0, 0x1

    .line 32
    return p0
.end method

.method public static b(I)I
    .locals 1

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    if-eq p0, v0, :cond_4

    .line 4
    .line 5
    const/16 v0, 0xc

    .line 6
    .line 7
    if-eq p0, v0, :cond_3

    .line 8
    .line 9
    const/16 v0, 0x10

    .line 10
    .line 11
    if-eq p0, v0, :cond_2

    .line 12
    .line 13
    const/16 v0, 0x14

    .line 14
    .line 15
    if-eq p0, v0, :cond_1

    .line 16
    .line 17
    const/16 v0, 0x18

    .line 18
    .line 19
    if-eq p0, v0, :cond_0

    .line 20
    .line 21
    const/4 p0, -0x1

    .line 22
    return p0

    .line 23
    :cond_0
    const/4 p0, 0x6

    .line 24
    return p0

    .line 25
    :cond_1
    const/4 p0, 0x5

    .line 26
    return p0

    .line 27
    :cond_2
    const/4 p0, 0x4

    .line 28
    return p0

    .line 29
    :cond_3
    const/4 p0, 0x2

    .line 30
    return p0

    .line 31
    :cond_4
    const/4 p0, 0x1

    .line 32
    return p0
.end method

.method public static f(I)I
    .locals 0

    .line 1
    sparse-switch p0, :sswitch_data_0

    .line 2
    .line 3
    .line 4
    const/4 p0, -0x1

    .line 5
    return p0

    .line 6
    :sswitch_0
    const/4 p0, 0x3

    .line 7
    return p0

    .line 8
    :sswitch_1
    const/4 p0, 0x2

    .line 9
    return p0

    .line 10
    :sswitch_2
    const/16 p0, 0xb

    .line 11
    .line 12
    return p0

    .line 13
    :sswitch_3
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :sswitch_4
    const/16 p0, 0xa

    .line 16
    .line 17
    return p0

    .line 18
    :sswitch_5
    const/16 p0, 0x9

    .line 19
    .line 20
    return p0

    .line 21
    :sswitch_6
    const/16 p0, 0x8

    .line 22
    .line 23
    return p0

    .line 24
    :sswitch_7
    const/4 p0, 0x7

    .line 25
    return p0

    .line 26
    :sswitch_8
    const/4 p0, 0x6

    .line 27
    return p0

    .line 28
    :sswitch_9
    const/4 p0, 0x5

    .line 29
    return p0

    .line 30
    :sswitch_a
    const/4 p0, 0x4

    .line 31
    return p0

    .line 32
    nop

    .line 33
    :sswitch_data_0
    .sparse-switch
        0x1f40 -> :sswitch_a
        0x3e80 -> :sswitch_9
        0x5622 -> :sswitch_8
        0x5dc0 -> :sswitch_7
        0x7d00 -> :sswitch_6
        0xac44 -> :sswitch_5
        0xbb80 -> :sswitch_4
        0x15888 -> :sswitch_3
        0x17700 -> :sswitch_2
        0x2b110 -> :sswitch_1
        0x2ee00 -> :sswitch_0
    .end sparse-switch
.end method

.method public static g(I)I
    .locals 0

    .line 1
    sparse-switch p0, :sswitch_data_0

    .line 2
    .line 3
    .line 4
    const/4 p0, -0x1

    .line 5
    return p0

    .line 6
    :sswitch_0
    const/4 p0, 0x3

    .line 7
    return p0

    .line 8
    :sswitch_1
    const/4 p0, 0x2

    .line 9
    return p0

    .line 10
    :sswitch_2
    const/16 p0, 0xb

    .line 11
    .line 12
    return p0

    .line 13
    :sswitch_3
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :sswitch_4
    const/16 p0, 0xa

    .line 16
    .line 17
    return p0

    .line 18
    :sswitch_5
    const/16 p0, 0x9

    .line 19
    .line 20
    return p0

    .line 21
    :sswitch_6
    const/16 p0, 0x8

    .line 22
    .line 23
    return p0

    .line 24
    :sswitch_7
    const/4 p0, 0x7

    .line 25
    return p0

    .line 26
    :sswitch_8
    const/4 p0, 0x6

    .line 27
    return p0

    .line 28
    :sswitch_9
    const/4 p0, 0x5

    .line 29
    return p0

    .line 30
    :sswitch_a
    const/4 p0, 0x4

    .line 31
    return p0

    .line 32
    nop

    .line 33
    :sswitch_data_0
    .sparse-switch
        0x1f40 -> :sswitch_a
        0x3e80 -> :sswitch_9
        0x5622 -> :sswitch_8
        0x5dc0 -> :sswitch_7
        0x7d00 -> :sswitch_6
        0xac44 -> :sswitch_5
        0xbb80 -> :sswitch_4
        0x15888 -> :sswitch_3
        0x17700 -> :sswitch_2
        0x2b110 -> :sswitch_1
        0x2ee00 -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public final c()J
    .locals 4

    .line 1
    iget v0, p0, LJ5/p;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    iget-wide v2, p0, LJ5/p;->k:J

    .line 9
    .line 10
    cmp-long v0, v2, v0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const-wide/32 v0, 0xf4240

    .line 21
    .line 22
    .line 23
    mul-long/2addr v2, v0

    .line 24
    iget v0, p0, LJ5/p;->f:I

    .line 25
    .line 26
    int-to-long v0, v0

    .line 27
    div-long v0, v2, v0

    .line 28
    .line 29
    :goto_0
    return-wide v0

    .line 30
    :pswitch_0
    const-wide/16 v0, 0x0

    .line 31
    .line 32
    iget-wide v2, p0, LJ5/p;->k:J

    .line 33
    .line 34
    cmp-long v0, v2, v0

    .line 35
    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    const-wide/32 v0, 0xf4240

    .line 45
    .line 46
    .line 47
    mul-long/2addr v2, v0

    .line 48
    iget v0, p0, LJ5/p;->f:I

    .line 49
    .line 50
    int-to-long v0, v0

    .line 51
    div-long v0, v2, v0

    .line 52
    .line 53
    :goto_1
    return-wide v0

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public d([BLW5/c;)LE5/T;
    .locals 3

    .line 1
    const/4 v0, 0x4

    .line 2
    const/16 v1, -0x80

    .line 3
    .line 4
    aput-byte v1, p1, v0

    .line 5
    .line 6
    iget v0, p0, LJ5/p;->e:I

    .line 7
    .line 8
    if-lez v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v0, -0x1

    .line 12
    :goto_0
    iget-object v1, p0, LJ5/p;->m:Landroid/os/Parcelable;

    .line 13
    .line 14
    check-cast v1, LW5/c;

    .line 15
    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    if-nez p2, :cond_2

    .line 20
    .line 21
    move-object p2, v1

    .line 22
    goto :goto_1

    .line 23
    :cond_2
    iget-object p2, p2, LW5/c;->a:[LW5/b;

    .line 24
    .line 25
    invoke-virtual {v1, p2}, LW5/c;->c([LW5/b;)LW5/c;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    :goto_1
    new-instance v1, LE5/S;

    .line 30
    .line 31
    invoke-direct {v1}, LE5/S;-><init>()V

    .line 32
    .line 33
    .line 34
    const-string v2, "audio/flac"

    .line 35
    .line 36
    iput-object v2, v1, LE5/S;->k:Ljava/lang/String;

    .line 37
    .line 38
    iput v0, v1, LE5/S;->l:I

    .line 39
    .line 40
    iget v0, p0, LJ5/p;->h:I

    .line 41
    .line 42
    iput v0, v1, LE5/S;->x:I

    .line 43
    .line 44
    iget v0, p0, LJ5/p;->f:I

    .line 45
    .line 46
    iput v0, v1, LE5/S;->y:I

    .line 47
    .line 48
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iput-object p1, v1, LE5/S;->m:Ljava/util/List;

    .line 53
    .line 54
    iput-object p2, v1, LE5/S;->i:LW5/c;

    .line 55
    .line 56
    new-instance p1, LE5/T;

    .line 57
    .line 58
    invoke-direct {p1, v1}, LE5/T;-><init>(LE5/S;)V

    .line 59
    .line 60
    .line 61
    return-object p1
.end method

.method public e([BLN1/B;)LN1/n;
    .locals 3

    .line 1
    const/4 v0, 0x4

    .line 2
    const/16 v1, -0x80

    .line 3
    .line 4
    aput-byte v1, p1, v0

    .line 5
    .line 6
    iget v0, p0, LJ5/p;->e:I

    .line 7
    .line 8
    if-lez v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v0, -0x1

    .line 12
    :goto_0
    iget-object v1, p0, LJ5/p;->m:Landroid/os/Parcelable;

    .line 13
    .line 14
    check-cast v1, LN1/B;

    .line 15
    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    invoke-virtual {v1, p2}, LN1/B;->e(LN1/B;)LN1/B;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    :goto_1
    new-instance v1, LN1/m;

    .line 24
    .line 25
    invoke-direct {v1}, LN1/m;-><init>()V

    .line 26
    .line 27
    .line 28
    const-string v2, "audio/flac"

    .line 29
    .line 30
    invoke-static {v2}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    iput-object v2, v1, LN1/m;->m:Ljava/lang/String;

    .line 35
    .line 36
    iput v0, v1, LN1/m;->n:I

    .line 37
    .line 38
    iget v0, p0, LJ5/p;->h:I

    .line 39
    .line 40
    iput v0, v1, LN1/m;->B:I

    .line 41
    .line 42
    iget v0, p0, LJ5/p;->f:I

    .line 43
    .line 44
    iput v0, v1, LN1/m;->C:I

    .line 45
    .line 46
    iget v0, p0, LJ5/p;->i:I

    .line 47
    .line 48
    invoke-static {v0}, LQ1/x;->y(I)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iput v0, v1, LN1/m;->D:I

    .line 53
    .line 54
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iput-object p1, v1, LN1/m;->p:Ljava/util/List;

    .line 59
    .line 60
    iput-object p2, v1, LN1/m;->k:LN1/B;

    .line 61
    .line 62
    new-instance p1, LN1/n;

    .line 63
    .line 64
    invoke-direct {p1, v1}, LN1/n;-><init>(LN1/m;)V

    .line 65
    .line 66
    .line 67
    return-object p1
.end method
