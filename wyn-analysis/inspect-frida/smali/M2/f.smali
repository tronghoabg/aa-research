.class public final LM2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM2/c;
.implements LR5/c;


# instance fields
.field public final synthetic a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x2

    iput v0, p0, LM2/f;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, LM2/f;->b:I

    const/4 v1, -0x1

    .line 3
    iput v1, p0, LM2/f;->c:I

    .line 4
    iput v0, p0, LM2/f;->d:I

    const/16 v0, 0x10

    .line 5
    new-array v0, v0, [I

    iput-object v0, p0, LM2/f;->f:Ljava/lang/Object;

    .line 6
    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, LM2/f;->e:I

    return-void
.end method

.method public constructor <init>(LR1/c;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LM2/f;->a:I

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iget-object p1, p1, LR1/c;->c:LQ1/o;

    iput-object p1, p0, LM2/f;->f:Ljava/lang/Object;

    const/16 v0, 0xc

    .line 14
    invoke-virtual {p1, v0}, LQ1/o;->G(I)V

    .line 15
    invoke-virtual {p1}, LQ1/o;->y()I

    move-result v0

    and-int/lit16 v0, v0, 0xff

    iput v0, p0, LM2/f;->c:I

    .line 16
    invoke-virtual {p1}, LQ1/o;->y()I

    move-result p1

    iput p1, p0, LM2/f;->b:I

    return-void
.end method

.method public constructor <init>(LR5/b;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LM2/f;->a:I

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iget-object p1, p1, LR5/b;->c:LY4/b;

    iput-object p1, p0, LM2/f;->f:Ljava/lang/Object;

    const/16 v0, 0xc

    .line 9
    invoke-virtual {p1, v0}, LY4/b;->A(I)V

    .line 10
    invoke-virtual {p1}, LY4/b;->t()I

    move-result v0

    and-int/lit16 v0, v0, 0xff

    iput v0, p0, LM2/f;->c:I

    .line 11
    invoke-virtual {p1}, LY4/b;->t()I

    move-result p1

    iput p1, p0, LM2/f;->b:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 3

    .line 1
    iget v0, p0, LM2/f;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/16 v0, 0x8

    .line 7
    .line 8
    iget-object v1, p0, LM2/f;->f:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, LY4/b;

    .line 11
    .line 12
    iget v2, p0, LM2/f;->c:I

    .line 13
    .line 14
    if-ne v2, v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {v1}, LY4/b;->q()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/16 v0, 0x10

    .line 22
    .line 23
    if-ne v2, v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {v1}, LY4/b;->v()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    iget v0, p0, LM2/f;->d:I

    .line 31
    .line 32
    add-int/lit8 v2, v0, 0x1

    .line 33
    .line 34
    iput v2, p0, LM2/f;->d:I

    .line 35
    .line 36
    rem-int/lit8 v0, v0, 0x2

    .line 37
    .line 38
    if-nez v0, :cond_2

    .line 39
    .line 40
    invoke-virtual {v1}, LY4/b;->q()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iput v0, p0, LM2/f;->e:I

    .line 45
    .line 46
    and-int/lit16 v0, v0, 0xf0

    .line 47
    .line 48
    shr-int/lit8 v0, v0, 0x4

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    iget v0, p0, LM2/f;->e:I

    .line 52
    .line 53
    and-int/lit8 v0, v0, 0xf

    .line 54
    .line 55
    :goto_0
    return v0

    .line 56
    :pswitch_0
    const/16 v0, 0x8

    .line 57
    .line 58
    iget-object v1, p0, LM2/f;->f:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v1, LQ1/o;

    .line 61
    .line 62
    iget v2, p0, LM2/f;->c:I

    .line 63
    .line 64
    if-ne v2, v0, :cond_3

    .line 65
    .line 66
    invoke-virtual {v1}, LQ1/o;->u()I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    goto :goto_1

    .line 71
    :cond_3
    const/16 v0, 0x10

    .line 72
    .line 73
    if-ne v2, v0, :cond_4

    .line 74
    .line 75
    invoke-virtual {v1}, LQ1/o;->A()I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    goto :goto_1

    .line 80
    :cond_4
    iget v0, p0, LM2/f;->d:I

    .line 81
    .line 82
    add-int/lit8 v2, v0, 0x1

    .line 83
    .line 84
    iput v2, p0, LM2/f;->d:I

    .line 85
    .line 86
    rem-int/lit8 v0, v0, 0x2

    .line 87
    .line 88
    if-nez v0, :cond_5

    .line 89
    .line 90
    invoke-virtual {v1}, LQ1/o;->u()I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    iput v0, p0, LM2/f;->e:I

    .line 95
    .line 96
    and-int/lit16 v0, v0, 0xf0

    .line 97
    .line 98
    shr-int/lit8 v0, v0, 0x4

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_5
    iget v0, p0, LM2/f;->e:I

    .line 102
    .line 103
    and-int/lit8 v0, v0, 0xf

    .line 104
    .line 105
    :goto_1
    return v0

    .line 106
    nop

    .line 107
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public b(I)V
    .locals 6

    .line 1
    iget v0, p0, LM2/f;->d:I

    .line 2
    .line 3
    iget-object v1, p0, LM2/f;->f:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, [I

    .line 6
    .line 7
    array-length v2, v1

    .line 8
    if-ne v0, v2, :cond_1

    .line 9
    .line 10
    array-length v0, v1

    .line 11
    shl-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    if-ltz v0, :cond_0

    .line 14
    .line 15
    new-array v2, v0, [I

    .line 16
    .line 17
    array-length v3, v1

    .line 18
    iget v4, p0, LM2/f;->b:I

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    const/4 v5, 0x0

    .line 22
    invoke-static {v1, v4, v2, v5, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, LM2/f;->f:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, [I

    .line 28
    .line 29
    invoke-static {v1, v5, v2, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 30
    .line 31
    .line 32
    iput v5, p0, LM2/f;->b:I

    .line 33
    .line 34
    iget v1, p0, LM2/f;->d:I

    .line 35
    .line 36
    add-int/lit8 v1, v1, -0x1

    .line 37
    .line 38
    iput v1, p0, LM2/f;->c:I

    .line 39
    .line 40
    iput-object v2, p0, LM2/f;->f:Ljava/lang/Object;

    .line 41
    .line 42
    add-int/lit8 v0, v0, -0x1

    .line 43
    .line 44
    iput v0, p0, LM2/f;->e:I

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 48
    .line 49
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_1
    :goto_0
    iget v0, p0, LM2/f;->c:I

    .line 54
    .line 55
    add-int/lit8 v0, v0, 0x1

    .line 56
    .line 57
    iget v1, p0, LM2/f;->e:I

    .line 58
    .line 59
    and-int/2addr v0, v1

    .line 60
    iput v0, p0, LM2/f;->c:I

    .line 61
    .line 62
    iget-object v1, p0, LM2/f;->f:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v1, [I

    .line 65
    .line 66
    aput p1, v1, v0

    .line 67
    .line 68
    iget p1, p0, LM2/f;->d:I

    .line 69
    .line 70
    add-int/lit8 p1, p1, 0x1

    .line 71
    .line 72
    iput p1, p0, LM2/f;->d:I

    .line 73
    .line 74
    return-void
.end method

.method public c()I
    .locals 1

    .line 1
    iget v0, p0, LM2/f;->a:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, -0x1

    return v0

    :pswitch_0
    const/4 v0, -0x1

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public d()I
    .locals 1

    .line 1
    iget v0, p0, LM2/f;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, LM2/f;->b:I

    .line 7
    .line 8
    return v0

    .line 9
    :pswitch_0
    iget v0, p0, LM2/f;->b:I

    .line 10
    .line 11
    return v0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public e()I
    .locals 4

    .line 1
    iget v0, p0, LM2/f;->d:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, LM2/f;->f:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, [I

    .line 8
    .line 9
    iget v2, p0, LM2/f;->b:I

    .line 10
    .line 11
    aget v1, v1, v2

    .line 12
    .line 13
    add-int/lit8 v2, v2, 0x1

    .line 14
    .line 15
    iget v3, p0, LM2/f;->e:I

    .line 16
    .line 17
    and-int/2addr v2, v3

    .line 18
    iput v2, p0, LM2/f;->b:I

    .line 19
    .line 20
    add-int/lit8 v0, v0, -0x1

    .line 21
    .line 22
    iput v0, p0, LM2/f;->d:I

    .line 23
    .line 24
    return v1

    .line 25
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 28
    .line 29
    .line 30
    throw v0
.end method
