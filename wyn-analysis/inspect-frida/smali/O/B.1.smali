.class public final LO/B;
.super LFe/b;
.source "SourceFile"


# instance fields
.field public b:[LO/A;

.field public c:I

.field public d:[I

.field public e:I

.field public f:[Ljava/lang/Object;

.field public g:I

.field public h:I

.field public i:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x10

    .line 5
    .line 6
    new-array v1, v0, [LO/A;

    .line 7
    .line 8
    iput-object v1, p0, LO/B;->b:[LO/A;

    .line 9
    .line 10
    new-array v1, v0, [I

    .line 11
    .line 12
    iput-object v1, p0, LO/B;->d:[I

    .line 13
    .line 14
    new-array v0, v0, [Ljava/lang/Object;

    .line 15
    .line 16
    iput-object v0, p0, LO/B;->f:[Ljava/lang/Object;

    .line 17
    .line 18
    return-void
.end method

.method public static final W(LO/B;I)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    return p0

    .line 8
    :cond_0
    rsub-int/lit8 p0, p1, 0x20

    .line 9
    .line 10
    const/4 p1, -0x1

    .line 11
    ushr-int p0, p1, p0

    .line 12
    .line 13
    return p0
.end method


# virtual methods
.method public final X()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, LO/B;->c:I

    .line 3
    .line 4
    iput v0, p0, LO/B;->e:I

    .line 5
    .line 6
    iget-object v1, p0, LO/B;->f:[Ljava/lang/Object;

    .line 7
    .line 8
    iget v2, p0, LO/B;->g:I

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-static {v1, v0, v2, v3}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iput v0, p0, LO/B;->g:I

    .line 15
    .line 16
    return-void
.end method

.method public final Y(LE9/c;LN/y0;Lq/s1;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, LO/B;->a0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    new-instance v0, LG4/f;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p0, v0, LG4/f;->d:Ljava/lang/Object;

    .line 13
    .line 14
    :goto_0
    iget-object v1, v0, LG4/f;->d:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, LO/B;

    .line 17
    .line 18
    iget-object v2, v1, LO/B;->b:[LO/A;

    .line 19
    .line 20
    iget v3, v0, LG4/f;->a:I

    .line 21
    .line 22
    aget-object v2, v2, v3

    .line 23
    .line 24
    invoke-static {v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2, v0, p1, p2, p3}, LO/A;->a(LG4/f;LE9/c;LN/y0;Lq/s1;)V

    .line 28
    .line 29
    .line 30
    iget v2, v0, LG4/f;->a:I

    .line 31
    .line 32
    iget v3, v1, LO/B;->c:I

    .line 33
    .line 34
    if-lt v2, v3, :cond_0

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_0
    iget-object v3, v1, LO/B;->b:[LO/A;

    .line 38
    .line 39
    aget-object v2, v3, v2

    .line 40
    .line 41
    invoke-static {v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iget v3, v0, LG4/f;->b:I

    .line 45
    .line 46
    iget v4, v2, LO/A;->a:I

    .line 47
    .line 48
    add-int/2addr v3, v4

    .line 49
    iput v3, v0, LG4/f;->b:I

    .line 50
    .line 51
    iget v3, v0, LG4/f;->c:I

    .line 52
    .line 53
    iget v2, v2, LO/A;->b:I

    .line 54
    .line 55
    add-int/2addr v3, v2

    .line 56
    iput v3, v0, LG4/f;->c:I

    .line 57
    .line 58
    iget v2, v0, LG4/f;->a:I

    .line 59
    .line 60
    add-int/lit8 v2, v2, 0x1

    .line 61
    .line 62
    iput v2, v0, LG4/f;->a:I

    .line 63
    .line 64
    iget v1, v1, LO/B;->c:I

    .line 65
    .line 66
    if-ge v2, v1, :cond_1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    :goto_1
    invoke-virtual {p0}, LO/B;->X()V

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method public final Z()Z
    .locals 1

    .line 1
    iget v0, p0, LO/B;->c:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public final a0()Z
    .locals 1

    .line 1
    iget v0, p0, LO/B;->c:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public final b0()LO/A;
    .locals 2

    .line 1
    iget-object v0, p0, LO/B;->b:[LO/A;

    .line 2
    .line 3
    iget v1, p0, LO/B;->c:I

    .line 4
    .line 5
    add-int/lit8 v1, v1, -0x1

    .line 6
    .line 7
    aget-object v0, v0, v1

    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final c0(LO/A;)V
    .locals 4

    .line 1
    iget v0, p1, LO/A;->a:I

    .line 2
    .line 3
    iget v1, p1, LO/A;->b:I

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, p1}, LO/B;->d0(LO/A;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v3, "Cannot push "

    .line 16
    .line 17
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string p1, " without arguments because it expects "

    .line 24
    .line 25
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string p1, " ints and "

    .line 32
    .line 33
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string p1, " objects."

    .line 40
    .line 41
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-static {p1}, LN/d;->O(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/4 p1, 0x0

    .line 52
    throw p1
.end method

.method public final d0(LO/A;)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, LO/B;->h:I

    .line 3
    .line 4
    iput v0, p0, LO/B;->i:I

    .line 5
    .line 6
    iget v0, p0, LO/B;->c:I

    .line 7
    .line 8
    iget-object v1, p0, LO/B;->b:[LO/A;

    .line 9
    .line 10
    array-length v2, v1

    .line 11
    const/16 v3, 0x400

    .line 12
    .line 13
    const-string v4, "copyOf(this, newSize)"

    .line 14
    .line 15
    if-ne v0, v2, :cond_1

    .line 16
    .line 17
    if-le v0, v3, :cond_0

    .line 18
    .line 19
    move v2, v3

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v2, v0

    .line 22
    :goto_0
    add-int/2addr v0, v2

    .line 23
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    check-cast v0, [LO/A;

    .line 31
    .line 32
    iput-object v0, p0, LO/B;->b:[LO/A;

    .line 33
    .line 34
    :cond_1
    iget v0, p0, LO/B;->e:I

    .line 35
    .line 36
    iget v1, p1, LO/A;->a:I

    .line 37
    .line 38
    add-int/2addr v0, v1

    .line 39
    iget-object v1, p0, LO/B;->d:[I

    .line 40
    .line 41
    array-length v2, v1

    .line 42
    if-le v0, v2, :cond_4

    .line 43
    .line 44
    if-le v2, v3, :cond_2

    .line 45
    .line 46
    move v5, v3

    .line 47
    goto :goto_1

    .line 48
    :cond_2
    move v5, v2

    .line 49
    :goto_1
    add-int/2addr v2, v5

    .line 50
    if-ge v2, v0, :cond_3

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_3
    move v0, v2

    .line 54
    :goto_2
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    iput-object v0, p0, LO/B;->d:[I

    .line 62
    .line 63
    :cond_4
    iget v0, p0, LO/B;->g:I

    .line 64
    .line 65
    iget v1, p1, LO/A;->b:I

    .line 66
    .line 67
    add-int/2addr v0, v1

    .line 68
    iget-object v2, p0, LO/B;->f:[Ljava/lang/Object;

    .line 69
    .line 70
    array-length v5, v2

    .line 71
    if-le v0, v5, :cond_7

    .line 72
    .line 73
    if-le v5, v3, :cond_5

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_5
    move v3, v5

    .line 77
    :goto_3
    add-int/2addr v5, v3

    .line 78
    if-ge v5, v0, :cond_6

    .line 79
    .line 80
    goto :goto_4

    .line 81
    :cond_6
    move v0, v5

    .line 82
    :goto_4
    invoke-static {v2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    iput-object v0, p0, LO/B;->f:[Ljava/lang/Object;

    .line 90
    .line 91
    :cond_7
    iget-object v0, p0, LO/B;->b:[LO/A;

    .line 92
    .line 93
    iget v2, p0, LO/B;->c:I

    .line 94
    .line 95
    add-int/lit8 v3, v2, 0x1

    .line 96
    .line 97
    iput v3, p0, LO/B;->c:I

    .line 98
    .line 99
    aput-object p1, v0, v2

    .line 100
    .line 101
    iget v0, p0, LO/B;->e:I

    .line 102
    .line 103
    iget p1, p1, LO/A;->a:I

    .line 104
    .line 105
    add-int/2addr v0, p1

    .line 106
    iput v0, p0, LO/B;->e:I

    .line 107
    .line 108
    iget p1, p0, LO/B;->g:I

    .line 109
    .line 110
    add-int/2addr p1, v1

    .line 111
    iput p1, p0, LO/B;->g:I

    .line 112
    .line 113
    return-void
.end method
