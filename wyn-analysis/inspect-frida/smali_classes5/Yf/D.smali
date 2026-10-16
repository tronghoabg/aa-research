.class public final LYf/D;
.super Landroid/support/v4/media/session/b;
.source "SourceFile"

# interfaces
.implements LXf/i;


# instance fields
.field public final a:LXf/c;

.field public final b:LYf/I;

.field public final c:LJ5/f;

.field public final d:Lza/a;

.field public e:I

.field public final f:LXf/h;

.field public final g:LYf/q;


# direct methods
.method public constructor <init>(LXf/c;LYf/I;LJ5/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V
    .locals 1

    .line 1
    const-string v0, "json"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "descriptor"

    .line 7
    .line 8
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, LYf/D;->a:LXf/c;

    .line 15
    .line 16
    iput-object p2, p0, LYf/D;->b:LYf/I;

    .line 17
    .line 18
    iput-object p3, p0, LYf/D;->c:LJ5/f;

    .line 19
    .line 20
    iget-object p2, p1, LXf/c;->b:Lza/a;

    .line 21
    .line 22
    iput-object p2, p0, LYf/D;->d:Lza/a;

    .line 23
    .line 24
    const/4 p2, -0x1

    .line 25
    iput p2, p0, LYf/D;->e:I

    .line 26
    .line 27
    iget-object p1, p1, LXf/c;->a:LXf/h;

    .line 28
    .line 29
    iput-object p1, p0, LYf/D;->f:LXf/h;

    .line 30
    .line 31
    iget-boolean p1, p1, LXf/h;->f:Z

    .line 32
    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    const/4 p1, 0x0

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    new-instance p1, LYf/q;

    .line 38
    .line 39
    invoke-direct {p1, p4}, LYf/q;-><init>(Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 40
    .line 41
    .line 42
    :goto_0
    iput-object p1, p0, LYf/D;->g:LYf/q;

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final A()Z
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, LYf/D;->g:LYf/q;

    .line 3
    .line 4
    if-eqz v1, :cond_0

    .line 5
    .line 6
    iget-boolean v1, v1, LYf/q;->b:Z

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v1, v0

    .line 10
    :goto_0
    if-nez v1, :cond_6

    .line 11
    .line 12
    iget-object v1, p0, LYf/D;->c:LJ5/f;

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    invoke-virtual {v1}, LJ5/f;->E()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-virtual {v1, v3}, LJ5/f;->A(I)I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    invoke-virtual {v1}, LJ5/f;->t()Ljava/lang/CharSequence;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    sub-int/2addr v4, v3

    .line 32
    const/4 v5, 0x0

    .line 33
    const/4 v6, 0x4

    .line 34
    if-lt v4, v6, :cond_5

    .line 35
    .line 36
    const/4 v7, -0x1

    .line 37
    if-ne v3, v7, :cond_1

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_1
    move v7, v5

    .line 41
    :goto_1
    if-ge v7, v6, :cond_3

    .line 42
    .line 43
    const-string v8, "null"

    .line 44
    .line 45
    invoke-virtual {v8, v7}, Ljava/lang/String;->charAt(I)C

    .line 46
    .line 47
    .line 48
    move-result v8

    .line 49
    invoke-virtual {v1}, LJ5/f;->t()Ljava/lang/CharSequence;

    .line 50
    .line 51
    .line 52
    move-result-object v9

    .line 53
    add-int v10, v3, v7

    .line 54
    .line 55
    invoke-interface {v9, v10}, Ljava/lang/CharSequence;->charAt(I)C

    .line 56
    .line 57
    .line 58
    move-result v9

    .line 59
    if-eq v8, v9, :cond_2

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_2
    add-int/lit8 v7, v7, 0x1

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    if-le v4, v6, :cond_4

    .line 66
    .line 67
    invoke-virtual {v1}, LJ5/f;->t()Ljava/lang/CharSequence;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    add-int/lit8 v7, v3, 0x4

    .line 72
    .line 73
    invoke-interface {v4, v7}, Ljava/lang/CharSequence;->charAt(I)C

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    invoke-static {v4}, LYf/r;->f(C)B

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    if-nez v4, :cond_4

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_4
    add-int/2addr v3, v6

    .line 85
    iput v3, v1, LJ5/f;->b:I

    .line 86
    .line 87
    const/4 v5, 0x1

    .line 88
    :cond_5
    :goto_2
    if-nez v5, :cond_6

    .line 89
    .line 90
    return v2

    .line 91
    :cond_6
    return v0
.end method

.method public final D(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    const-string v0, "descriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "deserializer"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, LYf/I;->e:LYf/I;

    .line 12
    .line 13
    iget-object v1, p0, LYf/D;->b:LYf/I;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    if-ne v1, v0, :cond_0

    .line 17
    .line 18
    and-int/lit8 v0, p2, 0x1

    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    move v0, v2

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    :goto_0
    iget-object v1, p0, LYf/D;->c:LJ5/f;

    .line 26
    .line 27
    const/4 v3, -0x2

    .line 28
    iget-object v1, v1, LJ5/f;->c:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v1, LE4/n;

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    iget-object v4, v1, LE4/n;->d:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v4, [I

    .line 37
    .line 38
    iget v5, v1, LE4/n;->b:I

    .line 39
    .line 40
    aget v4, v4, v5

    .line 41
    .line 42
    if-ne v4, v3, :cond_1

    .line 43
    .line 44
    iget-object v4, v1, LE4/n;->c:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v4, [Ljava/lang/Object;

    .line 47
    .line 48
    sget-object v6, LYf/s;->a:LYf/s;

    .line 49
    .line 50
    aput-object v6, v4, v5

    .line 51
    .line 52
    :cond_1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/support/v4/media/session/b;->D(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    if-eqz v0, :cond_3

    .line 57
    .line 58
    iget-object p2, v1, LE4/n;->d:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p2, [I

    .line 61
    .line 62
    iget p3, v1, LE4/n;->b:I

    .line 63
    .line 64
    aget p2, p2, p3

    .line 65
    .line 66
    if-eq p2, v3, :cond_2

    .line 67
    .line 68
    add-int/2addr p3, v2

    .line 69
    iput p3, v1, LE4/n;->b:I

    .line 70
    .line 71
    iget-object p2, v1, LE4/n;->c:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p2, [Ljava/lang/Object;

    .line 74
    .line 75
    array-length p4, p2

    .line 76
    if-ne p3, p4, :cond_2

    .line 77
    .line 78
    mul-int/lit8 p3, p3, 0x2

    .line 79
    .line 80
    invoke-static {p2, p3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    const-string p4, "copyOf(...)"

    .line 85
    .line 86
    invoke-static {p2, p4}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    iput-object p2, v1, LE4/n;->c:Ljava/lang/Object;

    .line 90
    .line 91
    iget-object p2, v1, LE4/n;->d:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast p2, [I

    .line 94
    .line 95
    invoke-static {p2, p3}, Ljava/util/Arrays;->copyOf([II)[I

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    invoke-static {p2, p4}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    iput-object p2, v1, LE4/n;->d:Ljava/lang/Object;

    .line 103
    .line 104
    :cond_2
    iget-object p2, v1, LE4/n;->c:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast p2, [Ljava/lang/Object;

    .line 107
    .line 108
    iget p3, v1, LE4/n;->b:I

    .line 109
    .line 110
    aput-object p1, p2, p3

    .line 111
    .line 112
    iget-object p2, v1, LE4/n;->d:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast p2, [I

    .line 115
    .line 116
    aput v3, p2, p3

    .line 117
    .line 118
    :cond_3
    return-object p1
.end method

.method public final E()B
    .locals 6

    .line 1
    iget-object v0, p0, LYf/D;->c:LJ5/f;

    .line 2
    .line 3
    invoke-virtual {v0}, LJ5/f;->i()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    long-to-int v3, v1

    .line 8
    int-to-byte v3, v3

    .line 9
    int-to-long v4, v3

    .line 10
    cmp-long v4, v1, v4

    .line 11
    .line 12
    if-nez v4, :cond_0

    .line 13
    .line 14
    return v3

    .line 15
    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v4, "Failed to parse byte for input \'"

    .line 18
    .line 19
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const/16 v1, 0x27

    .line 26
    .line 27
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const/4 v2, 0x0

    .line 35
    const/4 v3, 0x0

    .line 36
    const/4 v4, 0x6

    .line 37
    invoke-static {v0, v1, v2, v3, v4}, LJ5/f;->r(LJ5/f;Ljava/lang/String;ILjava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    throw v3
.end method

.method public final a()Lza/a;
    .locals 1

    .line 1
    iget-object v0, p0, LYf/D;->d:Lza/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b(Lkotlinx/serialization/descriptors/SerialDescriptor;)LVf/a;
    .locals 9

    .line 1
    const-string v0, "descriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LYf/D;->a:LXf/c;

    .line 7
    .line 8
    invoke-static {v0, p1}, LYf/r;->o(LXf/c;Lkotlinx/serialization/descriptors/SerialDescriptor;)LYf/I;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget-object v2, p0, LYf/D;->c:LJ5/f;

    .line 13
    .line 14
    iget-object v3, v2, LJ5/f;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v3, LE4/n;

    .line 17
    .line 18
    iget v4, v3, LE4/n;->b:I

    .line 19
    .line 20
    const/4 v5, 0x1

    .line 21
    add-int/2addr v4, v5

    .line 22
    iput v4, v3, LE4/n;->b:I

    .line 23
    .line 24
    iget-object v6, v3, LE4/n;->c:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v6, [Ljava/lang/Object;

    .line 27
    .line 28
    array-length v7, v6

    .line 29
    if-ne v4, v7, :cond_0

    .line 30
    .line 31
    mul-int/lit8 v7, v4, 0x2

    .line 32
    .line 33
    invoke-static {v6, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    const-string v8, "copyOf(...)"

    .line 38
    .line 39
    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    iput-object v6, v3, LE4/n;->c:Ljava/lang/Object;

    .line 43
    .line 44
    iget-object v6, v3, LE4/n;->d:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v6, [I

    .line 47
    .line 48
    invoke-static {v6, v7}, Ljava/util/Arrays;->copyOf([II)[I

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    iput-object v6, v3, LE4/n;->d:Ljava/lang/Object;

    .line 56
    .line 57
    :cond_0
    iget-object v3, v3, LE4/n;->c:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v3, [Ljava/lang/Object;

    .line 60
    .line 61
    aput-object p1, v3, v4

    .line 62
    .line 63
    iget-char v3, v1, LYf/I;->a:C

    .line 64
    .line 65
    invoke-virtual {v2, v3}, LJ5/f;->h(C)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2}, LJ5/f;->y()B

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    const/4 v4, 0x4

    .line 73
    if-eq v3, v4, :cond_3

    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    if-eq v3, v5, :cond_2

    .line 80
    .line 81
    const/4 v4, 0x2

    .line 82
    if-eq v3, v4, :cond_2

    .line 83
    .line 84
    const/4 v4, 0x3

    .line 85
    if-eq v3, v4, :cond_2

    .line 86
    .line 87
    iget-object v3, p0, LYf/D;->b:LYf/I;

    .line 88
    .line 89
    if-ne v3, v1, :cond_1

    .line 90
    .line 91
    iget-object v3, v0, LXf/c;->a:LXf/h;

    .line 92
    .line 93
    iget-boolean v3, v3, LXf/h;->f:Z

    .line 94
    .line 95
    if-eqz v3, :cond_1

    .line 96
    .line 97
    return-object p0

    .line 98
    :cond_1
    new-instance v3, LYf/D;

    .line 99
    .line 100
    invoke-direct {v3, v0, v1, v2, p1}, LYf/D;-><init>(LXf/c;LYf/I;LJ5/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 101
    .line 102
    .line 103
    return-object v3

    .line 104
    :cond_2
    new-instance v3, LYf/D;

    .line 105
    .line 106
    invoke-direct {v3, v0, v1, v2, p1}, LYf/D;-><init>(LXf/c;LYf/I;LJ5/f;Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 107
    .line 108
    .line 109
    return-object v3

    .line 110
    :cond_3
    const-string p1, "Unexpected leading comma"

    .line 111
    .line 112
    const/4 v0, 0x6

    .line 113
    const/4 v1, 0x0

    .line 114
    const/4 v3, 0x0

    .line 115
    invoke-static {v2, p1, v1, v3, v0}, LJ5/f;->r(LJ5/f;Ljava/lang/String;ILjava/lang/String;I)V

    .line 116
    .line 117
    .line 118
    throw v3
.end method

.method public final c(Lkotlinx/serialization/descriptors/SerialDescriptor;)V
    .locals 5

    .line 1
    const-string v0, "descriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Lkotlinx/serialization/descriptors/SerialDescriptor;->d()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, -0x1

    .line 11
    iget-object v2, p0, LYf/D;->a:LXf/c;

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    invoke-static {v2, p1}, LYf/r;->k(LXf/c;Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    :cond_0
    invoke-virtual {p0, p1}, LYf/D;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-ne v0, v1, :cond_0

    .line 26
    .line 27
    :cond_1
    iget-object p1, p0, LYf/D;->c:LJ5/f;

    .line 28
    .line 29
    invoke-virtual {p1}, LJ5/f;->G()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_4

    .line 34
    .line 35
    iget-object v0, p0, LYf/D;->b:LYf/I;

    .line 36
    .line 37
    iget-char v0, v0, LYf/I;->b:C

    .line 38
    .line 39
    invoke-virtual {p1, v0}, LJ5/f;->h(C)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p1, LJ5/f;->c:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, LE4/n;

    .line 45
    .line 46
    iget v0, p1, LE4/n;->b:I

    .line 47
    .line 48
    iget-object v2, p1, LE4/n;->d:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v2, [I

    .line 51
    .line 52
    aget v3, v2, v0

    .line 53
    .line 54
    const/4 v4, -0x2

    .line 55
    if-ne v3, v4, :cond_2

    .line 56
    .line 57
    aput v1, v2, v0

    .line 58
    .line 59
    add-int/2addr v0, v1

    .line 60
    iput v0, p1, LE4/n;->b:I

    .line 61
    .line 62
    :cond_2
    iget v0, p1, LE4/n;->b:I

    .line 63
    .line 64
    if-eq v0, v1, :cond_3

    .line 65
    .line 66
    add-int/2addr v0, v1

    .line 67
    iput v0, p1, LE4/n;->b:I

    .line 68
    .line 69
    :cond_3
    return-void

    .line 70
    :cond_4
    iget-object v0, v2, LXf/c;->a:LXf/h;

    .line 71
    .line 72
    const-string v0, ""

    .line 73
    .line 74
    invoke-static {p1, v0}, LYf/r;->l(LJ5/f;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    const/4 p1, 0x0

    .line 78
    throw p1
.end method

.method public final d()LXf/c;
    .locals 1

    .line 1
    iget-object v0, p0, LYf/D;->a:LXf/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e(Lkotlinx/serialization/descriptors/SerialDescriptor;)I
    .locals 3

    .line 1
    const-string v0, "enumDescriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LYf/D;->w()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, " at path "

    .line 13
    .line 14
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v2, p0, LYf/D;->c:LJ5/f;

    .line 18
    .line 19
    iget-object v2, v2, LJ5/f;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, LE4/n;

    .line 22
    .line 23
    invoke-virtual {v2}, LE4/n;->j()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iget-object v2, p0, LYf/D;->a:LXf/c;

    .line 35
    .line 36
    invoke-static {p1, v2, v0, v1}, LYf/r;->j(Lkotlinx/serialization/descriptors/SerialDescriptor;LXf/c;Ljava/lang/String;Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    return p1
.end method

.method public final g()Lkotlinx/serialization/json/b;
    .locals 3

    .line 1
    new-instance v0, LYf/B;

    .line 2
    .line 3
    iget-object v1, p0, LYf/D;->a:LXf/c;

    .line 4
    .line 5
    iget-object v1, v1, LXf/c;->a:LXf/h;

    .line 6
    .line 7
    iget-object v2, p0, LYf/D;->c:LJ5/f;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2}, LYf/B;-><init>(LXf/h;LJ5/f;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, LYf/B;->b()Lkotlinx/serialization/json/b;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
.end method

.method public final h()I
    .locals 6

    .line 1
    iget-object v0, p0, LYf/D;->c:LJ5/f;

    .line 2
    .line 3
    invoke-virtual {v0}, LJ5/f;->i()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    long-to-int v3, v1

    .line 8
    int-to-long v4, v3

    .line 9
    cmp-long v4, v1, v4

    .line 10
    .line 11
    if-nez v4, :cond_0

    .line 12
    .line 13
    return v3

    .line 14
    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v4, "Failed to parse int for input \'"

    .line 17
    .line 18
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const/16 v1, 0x27

    .line 25
    .line 26
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const/4 v2, 0x0

    .line 34
    const/4 v3, 0x0

    .line 35
    const/4 v4, 0x6

    .line 36
    invoke-static {v0, v1, v2, v3, v4}, LJ5/f;->r(LJ5/f;Ljava/lang/String;ILjava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    throw v3
.end method

.method public final k()J
    .locals 2

    .line 1
    iget-object v0, p0, LYf/D;->c:LJ5/f;

    .line 2
    .line 3
    invoke-virtual {v0}, LJ5/f;->i()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final m(Lkotlinx/serialization/descriptors/SerialDescriptor;)I
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "descriptor"

    .line 6
    .line 7
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v2, v0, LYf/D;->b:LYf/I;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    iget-object v4, v0, LYf/D;->c:LJ5/f;

    .line 17
    .line 18
    const-string v5, "object"

    .line 19
    .line 20
    const/4 v6, 0x1

    .line 21
    const/4 v7, -0x1

    .line 22
    const/4 v8, 0x0

    .line 23
    const/4 v9, 0x6

    .line 24
    const/4 v10, 0x0

    .line 25
    const/16 v11, 0x3a

    .line 26
    .line 27
    iget-object v12, v0, LYf/D;->a:LXf/c;

    .line 28
    .line 29
    iget-object v13, v4, LJ5/f;->c:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v13, LE4/n;

    .line 32
    .line 33
    if-eqz v3, :cond_e

    .line 34
    .line 35
    const/4 v1, 0x2

    .line 36
    if-eq v3, v1, :cond_4

    .line 37
    .line 38
    invoke-virtual {v4}, LJ5/f;->G()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    invoke-virtual {v4}, LJ5/f;->c()Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_2

    .line 47
    .line 48
    iget v3, v0, LYf/D;->e:I

    .line 49
    .line 50
    if-eq v3, v7, :cond_1

    .line 51
    .line 52
    if-eqz v1, :cond_0

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    const-string v1, "Expected end of the array or comma"

    .line 56
    .line 57
    invoke-static {v4, v1, v8, v10, v9}, LJ5/f;->r(LJ5/f;Ljava/lang/String;ILjava/lang/String;I)V

    .line 58
    .line 59
    .line 60
    throw v10

    .line 61
    :cond_1
    :goto_0
    add-int/lit8 v7, v3, 0x1

    .line 62
    .line 63
    iput v7, v0, LYf/D;->e:I

    .line 64
    .line 65
    goto/16 :goto_e

    .line 66
    .line 67
    :cond_2
    if-nez v1, :cond_3

    .line 68
    .line 69
    goto/16 :goto_e

    .line 70
    .line 71
    :cond_3
    iget-object v1, v12, LXf/c;->a:LXf/h;

    .line 72
    .line 73
    const-string v1, "array"

    .line 74
    .line 75
    invoke-static {v4, v1}, LYf/r;->l(LJ5/f;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw v10

    .line 79
    :cond_4
    iget v1, v0, LYf/D;->e:I

    .line 80
    .line 81
    rem-int/lit8 v3, v1, 0x2

    .line 82
    .line 83
    if-eqz v3, :cond_5

    .line 84
    .line 85
    move v3, v6

    .line 86
    goto :goto_1

    .line 87
    :cond_5
    move v3, v8

    .line 88
    :goto_1
    if-eqz v3, :cond_6

    .line 89
    .line 90
    if-eq v1, v7, :cond_7

    .line 91
    .line 92
    invoke-virtual {v4}, LJ5/f;->G()Z

    .line 93
    .line 94
    .line 95
    move-result v8

    .line 96
    goto :goto_2

    .line 97
    :cond_6
    invoke-virtual {v4, v11}, LJ5/f;->h(C)V

    .line 98
    .line 99
    .line 100
    :cond_7
    :goto_2
    invoke-virtual {v4}, LJ5/f;->c()Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-eqz v1, :cond_c

    .line 105
    .line 106
    if-eqz v3, :cond_b

    .line 107
    .line 108
    iget v1, v0, LYf/D;->e:I

    .line 109
    .line 110
    const/4 v3, 0x4

    .line 111
    if-ne v1, v7, :cond_9

    .line 112
    .line 113
    iget v1, v4, LJ5/f;->b:I

    .line 114
    .line 115
    if-nez v8, :cond_8

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_8
    const-string v2, "Unexpected leading comma"

    .line 119
    .line 120
    invoke-static {v4, v2, v1, v10, v3}, LJ5/f;->r(LJ5/f;Ljava/lang/String;ILjava/lang/String;I)V

    .line 121
    .line 122
    .line 123
    throw v10

    .line 124
    :cond_9
    iget v1, v4, LJ5/f;->b:I

    .line 125
    .line 126
    if-eqz v8, :cond_a

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_a
    const-string v2, "Expected comma after the key-value pair"

    .line 130
    .line 131
    invoke-static {v4, v2, v1, v10, v3}, LJ5/f;->r(LJ5/f;Ljava/lang/String;ILjava/lang/String;I)V

    .line 132
    .line 133
    .line 134
    throw v10

    .line 135
    :cond_b
    :goto_3
    iget v1, v0, LYf/D;->e:I

    .line 136
    .line 137
    add-int/lit8 v7, v1, 0x1

    .line 138
    .line 139
    iput v7, v0, LYf/D;->e:I

    .line 140
    .line 141
    goto/16 :goto_e

    .line 142
    .line 143
    :cond_c
    if-nez v8, :cond_d

    .line 144
    .line 145
    goto/16 :goto_e

    .line 146
    .line 147
    :cond_d
    iget-object v1, v12, LXf/c;->a:LXf/h;

    .line 148
    .line 149
    invoke-static {v4, v5}, LYf/r;->l(LJ5/f;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    throw v10

    .line 153
    :cond_e
    invoke-virtual {v4}, LJ5/f;->G()Z

    .line 154
    .line 155
    .line 156
    move-result v3

    .line 157
    :goto_4
    invoke-virtual {v4}, LJ5/f;->c()Z

    .line 158
    .line 159
    .line 160
    move-result v14

    .line 161
    const/16 v15, 0x40

    .line 162
    .line 163
    const-wide/16 v16, 0x1

    .line 164
    .line 165
    iget-object v10, v0, LYf/D;->g:LYf/q;

    .line 166
    .line 167
    if-eqz v14, :cond_23

    .line 168
    .line 169
    iget-object v3, v0, LYf/D;->f:LXf/h;

    .line 170
    .line 171
    iget-boolean v14, v3, LXf/h;->c:Z

    .line 172
    .line 173
    if-eqz v14, :cond_f

    .line 174
    .line 175
    invoke-virtual {v4}, LJ5/f;->m()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    goto :goto_5

    .line 180
    :cond_f
    invoke-virtual {v4}, LJ5/f;->e()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    :goto_5
    invoke-virtual {v4, v11}, LJ5/f;->h(C)V

    .line 185
    .line 186
    .line 187
    invoke-static {v1, v12, v3}, LYf/r;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;LXf/c;Ljava/lang/String;)I

    .line 188
    .line 189
    .line 190
    move-result v11

    .line 191
    move/from16 v19, v6

    .line 192
    .line 193
    const/4 v6, -0x3

    .line 194
    if-eq v11, v6, :cond_12

    .line 195
    .line 196
    if-eqz v10, :cond_10

    .line 197
    .line 198
    iget-object v1, v10, LYf/q;->a:LWf/w;

    .line 199
    .line 200
    if-ge v11, v15, :cond_11

    .line 201
    .line 202
    iget-wide v3, v1, LWf/w;->c:J

    .line 203
    .line 204
    shl-long v5, v16, v11

    .line 205
    .line 206
    or-long/2addr v3, v5

    .line 207
    iput-wide v3, v1, LWf/w;->c:J

    .line 208
    .line 209
    :cond_10
    :goto_6
    move v7, v11

    .line 210
    goto/16 :goto_e

    .line 211
    .line 212
    :cond_11
    ushr-int/lit8 v3, v11, 0x6

    .line 213
    .line 214
    add-int/lit8 v3, v3, -0x1

    .line 215
    .line 216
    and-int/lit8 v4, v11, 0x3f

    .line 217
    .line 218
    iget-object v1, v1, LWf/w;->d:[J

    .line 219
    .line 220
    aget-wide v5, v1, v3

    .line 221
    .line 222
    shl-long v7, v16, v4

    .line 223
    .line 224
    or-long/2addr v5, v7

    .line 225
    aput-wide v5, v1, v3

    .line 226
    .line 227
    goto :goto_6

    .line 228
    :cond_12
    invoke-static {v12, v1}, LYf/r;->k(LXf/c;Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 229
    .line 230
    .line 231
    move-result v6

    .line 232
    if-nez v6, :cond_15

    .line 233
    .line 234
    iget v1, v13, LE4/n;->b:I

    .line 235
    .line 236
    iget-object v2, v13, LE4/n;->d:Ljava/lang/Object;

    .line 237
    .line 238
    check-cast v2, [I

    .line 239
    .line 240
    aget v5, v2, v1

    .line 241
    .line 242
    const/4 v6, -0x2

    .line 243
    if-ne v5, v6, :cond_13

    .line 244
    .line 245
    aput v7, v2, v1

    .line 246
    .line 247
    add-int/2addr v1, v7

    .line 248
    iput v1, v13, LE4/n;->b:I

    .line 249
    .line 250
    :cond_13
    iget v1, v13, LE4/n;->b:I

    .line 251
    .line 252
    if-eq v1, v7, :cond_14

    .line 253
    .line 254
    add-int/2addr v1, v7

    .line 255
    iput v1, v13, LE4/n;->b:I

    .line 256
    .line 257
    :cond_14
    iget v1, v4, LJ5/f;->b:I

    .line 258
    .line 259
    invoke-virtual {v4, v8, v1}, LJ5/f;->F(II)Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    invoke-static {v9, v1, v3}, LBf/k;->A0(ILjava/lang/String;Ljava/lang/String;)I

    .line 264
    .line 265
    .line 266
    move-result v1

    .line 267
    new-instance v2, LYf/o;

    .line 268
    .line 269
    const-string v5, "Encountered an unknown key \'"

    .line 270
    .line 271
    const-string v6, "\' at offset "

    .line 272
    .line 273
    const-string v7, " at path: "

    .line 274
    .line 275
    invoke-static {v1, v5, v3, v6, v7}, Lcb/a;->k(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 276
    .line 277
    .line 278
    move-result-object v3

    .line 279
    invoke-virtual {v13}, LE4/n;->j()Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v5

    .line 283
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    const-string v5, "\nUse \'ignoreUnknownKeys = true\' in \'Json {}\' builder or \'@JsonIgnoreUnknownKeys\' annotation to ignore unknown keys.\nJSON input: "

    .line 287
    .line 288
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v4}, LJ5/f;->t()Ljava/lang/CharSequence;

    .line 292
    .line 293
    .line 294
    move-result-object v4

    .line 295
    invoke-static {v4, v1}, LYf/r;->m(Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 300
    .line 301
    .line 302
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v1

    .line 306
    const/4 v3, 0x0

    .line 307
    invoke-direct {v2, v1, v3}, LYf/o;-><init>(Ljava/lang/String;I)V

    .line 308
    .line 309
    .line 310
    throw v2

    .line 311
    :cond_15
    new-instance v6, Ljava/util/ArrayList;

    .line 312
    .line 313
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v4}, LJ5/f;->y()B

    .line 317
    .line 318
    .line 319
    move-result v3

    .line 320
    const/16 v11, 0x8

    .line 321
    .line 322
    if-eq v3, v11, :cond_16

    .line 323
    .line 324
    if-eq v3, v9, :cond_16

    .line 325
    .line 326
    invoke-virtual {v4}, LJ5/f;->l()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move/from16 v10, v19

    .line 330
    .line 331
    goto/16 :goto_b

    .line 332
    .line 333
    :cond_16
    :goto_7
    invoke-virtual {v4}, LJ5/f;->y()B

    .line 334
    .line 335
    .line 336
    move-result v3

    .line 337
    move/from16 v10, v19

    .line 338
    .line 339
    if-ne v3, v10, :cond_18

    .line 340
    .line 341
    if-eqz v14, :cond_17

    .line 342
    .line 343
    invoke-virtual {v4}, LJ5/f;->l()Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    goto :goto_8

    .line 347
    :cond_17
    invoke-virtual {v4}, LJ5/f;->e()Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    :goto_8
    move/from16 v19, v10

    .line 351
    .line 352
    goto :goto_7

    .line 353
    :cond_18
    if-eq v3, v11, :cond_21

    .line 354
    .line 355
    if-ne v3, v9, :cond_19

    .line 356
    .line 357
    goto/16 :goto_9

    .line 358
    .line 359
    :cond_19
    const/16 v15, 0x9

    .line 360
    .line 361
    const-string v7, "List is empty."

    .line 362
    .line 363
    if-ne v3, v15, :cond_1c

    .line 364
    .line 365
    invoke-static {v6}, Lff/o;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v3

    .line 369
    check-cast v3, Ljava/lang/Number;

    .line 370
    .line 371
    invoke-virtual {v3}, Ljava/lang/Number;->byteValue()B

    .line 372
    .line 373
    .line 374
    move-result v3

    .line 375
    if-ne v3, v11, :cond_1b

    .line 376
    .line 377
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 378
    .line 379
    .line 380
    move-result v3

    .line 381
    if-nez v3, :cond_1a

    .line 382
    .line 383
    invoke-static {v6}, Lr7/e;->z(Ljava/util/List;)I

    .line 384
    .line 385
    .line 386
    move-result v3

    .line 387
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    goto :goto_a

    .line 391
    :cond_1a
    new-instance v1, Ljava/util/NoSuchElementException;

    .line 392
    .line 393
    invoke-direct {v1, v7}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 394
    .line 395
    .line 396
    throw v1

    .line 397
    :cond_1b
    iget v1, v4, LJ5/f;->b:I

    .line 398
    .line 399
    new-instance v2, Ljava/lang/StringBuilder;

    .line 400
    .line 401
    const-string v3, "found ] instead of } at path: "

    .line 402
    .line 403
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 404
    .line 405
    .line 406
    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 407
    .line 408
    .line 409
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v2

    .line 413
    invoke-virtual {v4}, LJ5/f;->t()Ljava/lang/CharSequence;

    .line 414
    .line 415
    .line 416
    move-result-object v3

    .line 417
    invoke-static {v1, v3, v2}, LYf/r;->c(ILjava/lang/CharSequence;Ljava/lang/String;)LYf/o;

    .line 418
    .line 419
    .line 420
    move-result-object v1

    .line 421
    throw v1

    .line 422
    :cond_1c
    const/4 v15, 0x7

    .line 423
    if-ne v3, v15, :cond_1f

    .line 424
    .line 425
    invoke-static {v6}, Lff/o;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v3

    .line 429
    check-cast v3, Ljava/lang/Number;

    .line 430
    .line 431
    invoke-virtual {v3}, Ljava/lang/Number;->byteValue()B

    .line 432
    .line 433
    .line 434
    move-result v3

    .line 435
    if-ne v3, v9, :cond_1e

    .line 436
    .line 437
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 438
    .line 439
    .line 440
    move-result v3

    .line 441
    if-nez v3, :cond_1d

    .line 442
    .line 443
    invoke-static {v6}, Lr7/e;->z(Ljava/util/List;)I

    .line 444
    .line 445
    .line 446
    move-result v3

    .line 447
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    goto :goto_a

    .line 451
    :cond_1d
    new-instance v1, Ljava/util/NoSuchElementException;

    .line 452
    .line 453
    invoke-direct {v1, v7}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 454
    .line 455
    .line 456
    throw v1

    .line 457
    :cond_1e
    iget v1, v4, LJ5/f;->b:I

    .line 458
    .line 459
    new-instance v2, Ljava/lang/StringBuilder;

    .line 460
    .line 461
    const-string v3, "found } instead of ] at path: "

    .line 462
    .line 463
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 464
    .line 465
    .line 466
    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 467
    .line 468
    .line 469
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 470
    .line 471
    .line 472
    move-result-object v2

    .line 473
    invoke-virtual {v4}, LJ5/f;->t()Ljava/lang/CharSequence;

    .line 474
    .line 475
    .line 476
    move-result-object v3

    .line 477
    invoke-static {v1, v3, v2}, LYf/r;->c(ILjava/lang/CharSequence;Ljava/lang/String;)LYf/o;

    .line 478
    .line 479
    .line 480
    move-result-object v1

    .line 481
    throw v1

    .line 482
    :cond_1f
    const/16 v7, 0xa

    .line 483
    .line 484
    if-eq v3, v7, :cond_20

    .line 485
    .line 486
    goto :goto_a

    .line 487
    :cond_20
    const-string v1, "Unexpected end of input due to malformed JSON during ignoring unknown keys"

    .line 488
    .line 489
    const/4 v2, 0x0

    .line 490
    invoke-static {v4, v1, v8, v2, v9}, LJ5/f;->r(LJ5/f;Ljava/lang/String;ILjava/lang/String;I)V

    .line 491
    .line 492
    .line 493
    throw v2

    .line 494
    :cond_21
    :goto_9
    invoke-static {v3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 495
    .line 496
    .line 497
    move-result-object v3

    .line 498
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 499
    .line 500
    .line 501
    :goto_a
    invoke-virtual {v4}, LJ5/f;->f()B

    .line 502
    .line 503
    .line 504
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 505
    .line 506
    .line 507
    move-result v3

    .line 508
    if-nez v3, :cond_22

    .line 509
    .line 510
    :goto_b
    invoke-virtual {v4}, LJ5/f;->G()Z

    .line 511
    .line 512
    .line 513
    move-result v3

    .line 514
    move v6, v10

    .line 515
    const/4 v7, -0x1

    .line 516
    const/4 v10, 0x0

    .line 517
    const/16 v11, 0x3a

    .line 518
    .line 519
    goto/16 :goto_4

    .line 520
    .line 521
    :cond_22
    move/from16 v19, v10

    .line 522
    .line 523
    const/4 v7, -0x1

    .line 524
    goto/16 :goto_7

    .line 525
    .line 526
    :cond_23
    if-nez v3, :cond_2a

    .line 527
    .line 528
    if-eqz v10, :cond_28

    .line 529
    .line 530
    iget-object v1, v10, LYf/q;->a:LWf/w;

    .line 531
    .line 532
    iget-object v3, v1, LWf/w;->a:Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 533
    .line 534
    invoke-interface {v3}, Lkotlinx/serialization/descriptors/SerialDescriptor;->d()I

    .line 535
    .line 536
    .line 537
    move-result v4

    .line 538
    :cond_24
    iget-wide v5, v1, LWf/w;->c:J

    .line 539
    .line 540
    const-wide/16 v9, -0x1

    .line 541
    .line 542
    cmp-long v7, v5, v9

    .line 543
    .line 544
    iget-object v11, v1, LWf/w;->b:LYf/p;

    .line 545
    .line 546
    if-eqz v7, :cond_25

    .line 547
    .line 548
    not-long v5, v5

    .line 549
    invoke-static {v5, v6}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 550
    .line 551
    .line 552
    move-result v5

    .line 553
    iget-wide v6, v1, LWf/w;->c:J

    .line 554
    .line 555
    shl-long v9, v16, v5

    .line 556
    .line 557
    or-long/2addr v6, v9

    .line 558
    iput-wide v6, v1, LWf/w;->c:J

    .line 559
    .line 560
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 561
    .line 562
    .line 563
    move-result-object v6

    .line 564
    invoke-virtual {v11, v3, v6}, LYf/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 565
    .line 566
    .line 567
    move-result-object v6

    .line 568
    check-cast v6, Ljava/lang/Boolean;

    .line 569
    .line 570
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 571
    .line 572
    .line 573
    move-result v6

    .line 574
    if-eqz v6, :cond_24

    .line 575
    .line 576
    move v7, v5

    .line 577
    goto :goto_e

    .line 578
    :cond_25
    if-le v4, v15, :cond_28

    .line 579
    .line 580
    iget-object v1, v1, LWf/w;->d:[J

    .line 581
    .line 582
    array-length v4, v1

    .line 583
    :goto_c
    if-ge v8, v4, :cond_28

    .line 584
    .line 585
    add-int/lit8 v5, v8, 0x1

    .line 586
    .line 587
    mul-int/lit8 v6, v5, 0x40

    .line 588
    .line 589
    aget-wide v14, v1, v8

    .line 590
    .line 591
    :goto_d
    cmp-long v7, v14, v9

    .line 592
    .line 593
    if-eqz v7, :cond_27

    .line 594
    .line 595
    not-long v9, v14

    .line 596
    invoke-static {v9, v10}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 597
    .line 598
    .line 599
    move-result v7

    .line 600
    shl-long v9, v16, v7

    .line 601
    .line 602
    or-long/2addr v14, v9

    .line 603
    add-int/2addr v7, v6

    .line 604
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 605
    .line 606
    .line 607
    move-result-object v9

    .line 608
    invoke-virtual {v11, v3, v9}, LYf/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 609
    .line 610
    .line 611
    move-result-object v9

    .line 612
    check-cast v9, Ljava/lang/Boolean;

    .line 613
    .line 614
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 615
    .line 616
    .line 617
    move-result v9

    .line 618
    if-eqz v9, :cond_26

    .line 619
    .line 620
    aput-wide v14, v1, v8

    .line 621
    .line 622
    goto :goto_e

    .line 623
    :cond_26
    const-wide/16 v9, -0x1

    .line 624
    .line 625
    goto :goto_d

    .line 626
    :cond_27
    aput-wide v14, v1, v8

    .line 627
    .line 628
    move v8, v5

    .line 629
    const-wide/16 v9, -0x1

    .line 630
    .line 631
    goto :goto_c

    .line 632
    :cond_28
    const/4 v7, -0x1

    .line 633
    :goto_e
    sget-object v1, LYf/I;->e:LYf/I;

    .line 634
    .line 635
    if-eq v2, v1, :cond_29

    .line 636
    .line 637
    iget-object v1, v13, LE4/n;->d:Ljava/lang/Object;

    .line 638
    .line 639
    check-cast v1, [I

    .line 640
    .line 641
    iget v2, v13, LE4/n;->b:I

    .line 642
    .line 643
    aput v7, v1, v2

    .line 644
    .line 645
    :cond_29
    return v7

    .line 646
    :cond_2a
    iget-object v1, v12, LXf/c;->a:LXf/h;

    .line 647
    .line 648
    invoke-static {v4, v5}, LYf/r;->l(LJ5/f;Ljava/lang/String;)V

    .line 649
    .line 650
    .line 651
    const/16 v18, 0x0

    .line 652
    .line 653
    throw v18
.end method

.method public final o(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Decoder;
    .locals 2

    .line 1
    const-string v0, "descriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, LYf/F;->a(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    new-instance p1, LYf/n;

    .line 13
    .line 14
    iget-object v0, p0, LYf/D;->c:LJ5/f;

    .line 15
    .line 16
    iget-object v1, p0, LYf/D;->a:LXf/c;

    .line 17
    .line 18
    invoke-direct {p1, v0, v1}, LYf/n;-><init>(LJ5/f;LXf/c;)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    return-object p0
.end method

.method public final p()S
    .locals 6

    .line 1
    iget-object v0, p0, LYf/D;->c:LJ5/f;

    .line 2
    .line 3
    invoke-virtual {v0}, LJ5/f;->i()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    long-to-int v3, v1

    .line 8
    int-to-short v3, v3

    .line 9
    int-to-long v4, v3

    .line 10
    cmp-long v4, v1, v4

    .line 11
    .line 12
    if-nez v4, :cond_0

    .line 13
    .line 14
    return v3

    .line 15
    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v4, "Failed to parse short for input \'"

    .line 18
    .line 19
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const/16 v1, 0x27

    .line 26
    .line 27
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const/4 v2, 0x0

    .line 35
    const/4 v3, 0x0

    .line 36
    const/4 v4, 0x6

    .line 37
    invoke-static {v0, v1, v2, v3, v4}, LJ5/f;->r(LJ5/f;Ljava/lang/String;ILjava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    throw v3
.end method

.method public final q()F
    .locals 5

    .line 1
    iget-object v0, p0, LYf/D;->c:LJ5/f;

    .line 2
    .line 3
    invoke-virtual {v0}, LJ5/f;->l()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x0

    .line 8
    :try_start_0
    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 9
    .line 10
    .line 11
    move-result v1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    iget-object v3, p0, LYf/D;->a:LXf/c;

    .line 13
    .line 14
    iget-object v3, v3, LXf/c;->a:LXf/h;

    .line 15
    .line 16
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    const v4, 0x7f7fffff    # Float.MAX_VALUE

    .line 21
    .line 22
    .line 23
    cmpg-float v3, v3, v4

    .line 24
    .line 25
    if-gtz v3, :cond_0

    .line 26
    .line 27
    return v1

    .line 28
    :cond_0
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-static {v0, v1}, LYf/r;->p(LJ5/f;Ljava/lang/Number;)V

    .line 33
    .line 34
    .line 35
    throw v2

    .line 36
    :catch_0
    const-string v3, "Failed to parse type \'float\' for input \'"

    .line 37
    .line 38
    const/16 v4, 0x27

    .line 39
    .line 40
    invoke-static {v4, v3, v1}, Lka/n;->f(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    const/4 v3, 0x6

    .line 45
    const/4 v4, 0x0

    .line 46
    invoke-static {v0, v1, v4, v2, v3}, LJ5/f;->r(LJ5/f;Ljava/lang/String;ILjava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    throw v2
.end method

.method public final s()D
    .locals 9

    .line 1
    iget-object v0, p0, LYf/D;->c:LJ5/f;

    .line 2
    .line 3
    invoke-virtual {v0}, LJ5/f;->l()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x0

    .line 8
    :try_start_0
    invoke-static {v1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 9
    .line 10
    .line 11
    move-result-wide v3
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    iget-object v1, p0, LYf/D;->a:LXf/c;

    .line 13
    .line 14
    iget-object v1, v1, LXf/c;->a:LXf/h;

    .line 15
    .line 16
    invoke-static {v3, v4}, Ljava/lang/Math;->abs(D)D

    .line 17
    .line 18
    .line 19
    move-result-wide v5

    .line 20
    const-wide v7, 0x7fefffffffffffffL    # Double.MAX_VALUE

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    cmpg-double v1, v5, v7

    .line 26
    .line 27
    if-gtz v1, :cond_0

    .line 28
    .line 29
    return-wide v3

    .line 30
    :cond_0
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-static {v0, v1}, LYf/r;->p(LJ5/f;Ljava/lang/Number;)V

    .line 35
    .line 36
    .line 37
    throw v2

    .line 38
    :catch_0
    const-string v3, "Failed to parse type \'double\' for input \'"

    .line 39
    .line 40
    const/16 v4, 0x27

    .line 41
    .line 42
    invoke-static {v4, v3, v1}, Lka/n;->f(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    const/4 v3, 0x6

    .line 47
    const/4 v4, 0x0

    .line 48
    invoke-static {v0, v1, v4, v2, v3}, LJ5/f;->r(LJ5/f;Ljava/lang/String;ILjava/lang/String;I)V

    .line 49
    .line 50
    .line 51
    throw v2
.end method

.method public final t()Z
    .locals 11

    .line 1
    iget-object v0, p0, LYf/D;->c:LJ5/f;

    .line 2
    .line 3
    invoke-virtual {v0}, LJ5/f;->E()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {v0}, LJ5/f;->t()Ljava/lang/CharSequence;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const-string v3, "EOF"

    .line 16
    .line 17
    const/4 v4, 0x6

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x0

    .line 20
    if-eq v1, v2, :cond_7

    .line 21
    .line 22
    invoke-virtual {v0}, LJ5/f;->t()Ljava/lang/CharSequence;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-interface {v2, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    const/4 v7, 0x1

    .line 31
    const/16 v8, 0x22

    .line 32
    .line 33
    if-ne v2, v8, :cond_0

    .line 34
    .line 35
    add-int/lit8 v1, v1, 0x1

    .line 36
    .line 37
    move v2, v7

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move v2, v5

    .line 40
    :goto_0
    invoke-virtual {v0, v1}, LJ5/f;->A(I)I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    invoke-virtual {v0}, LJ5/f;->t()Ljava/lang/CharSequence;

    .line 45
    .line 46
    .line 47
    move-result-object v9

    .line 48
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    .line 49
    .line 50
    .line 51
    move-result v9

    .line 52
    if-ge v1, v9, :cond_6

    .line 53
    .line 54
    const/4 v9, -0x1

    .line 55
    if-eq v1, v9, :cond_6

    .line 56
    .line 57
    invoke-virtual {v0}, LJ5/f;->t()Ljava/lang/CharSequence;

    .line 58
    .line 59
    .line 60
    move-result-object v9

    .line 61
    add-int/lit8 v10, v1, 0x1

    .line 62
    .line 63
    invoke-interface {v9, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    or-int/lit8 v1, v1, 0x20

    .line 68
    .line 69
    const/16 v9, 0x66

    .line 70
    .line 71
    if-eq v1, v9, :cond_2

    .line 72
    .line 73
    const/16 v9, 0x74

    .line 74
    .line 75
    if-ne v1, v9, :cond_1

    .line 76
    .line 77
    const-string v1, "rue"

    .line 78
    .line 79
    invoke-virtual {v0, v10, v1}, LJ5/f;->d(ILjava/lang/String;)V

    .line 80
    .line 81
    .line 82
    move v1, v7

    .line 83
    goto :goto_1

    .line 84
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    const-string v2, "Expected valid boolean literal prefix, but had \'"

    .line 87
    .line 88
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, LJ5/f;->l()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    const/16 v2, 0x27

    .line 99
    .line 100
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-static {v0, v1, v5, v6, v4}, LJ5/f;->r(LJ5/f;Ljava/lang/String;ILjava/lang/String;I)V

    .line 108
    .line 109
    .line 110
    throw v6

    .line 111
    :cond_2
    const-string v1, "alse"

    .line 112
    .line 113
    invoke-virtual {v0, v10, v1}, LJ5/f;->d(ILjava/lang/String;)V

    .line 114
    .line 115
    .line 116
    move v1, v5

    .line 117
    :goto_1
    if-eqz v2, :cond_5

    .line 118
    .line 119
    iget v2, v0, LJ5/f;->b:I

    .line 120
    .line 121
    invoke-virtual {v0}, LJ5/f;->t()Ljava/lang/CharSequence;

    .line 122
    .line 123
    .line 124
    move-result-object v9

    .line 125
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    .line 126
    .line 127
    .line 128
    move-result v9

    .line 129
    if-eq v2, v9, :cond_4

    .line 130
    .line 131
    invoke-virtual {v0}, LJ5/f;->t()Ljava/lang/CharSequence;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    iget v3, v0, LJ5/f;->b:I

    .line 136
    .line 137
    invoke-interface {v2, v3}, Ljava/lang/CharSequence;->charAt(I)C

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    if-ne v2, v8, :cond_3

    .line 142
    .line 143
    iget v2, v0, LJ5/f;->b:I

    .line 144
    .line 145
    add-int/2addr v2, v7

    .line 146
    iput v2, v0, LJ5/f;->b:I

    .line 147
    .line 148
    return v1

    .line 149
    :cond_3
    const-string v1, "Expected closing quotation mark"

    .line 150
    .line 151
    invoke-static {v0, v1, v5, v6, v4}, LJ5/f;->r(LJ5/f;Ljava/lang/String;ILjava/lang/String;I)V

    .line 152
    .line 153
    .line 154
    throw v6

    .line 155
    :cond_4
    invoke-static {v0, v3, v5, v6, v4}, LJ5/f;->r(LJ5/f;Ljava/lang/String;ILjava/lang/String;I)V

    .line 156
    .line 157
    .line 158
    throw v6

    .line 159
    :cond_5
    return v1

    .line 160
    :cond_6
    invoke-static {v0, v3, v5, v6, v4}, LJ5/f;->r(LJ5/f;Ljava/lang/String;ILjava/lang/String;I)V

    .line 161
    .line 162
    .line 163
    throw v6

    .line 164
    :cond_7
    invoke-static {v0, v3, v5, v6, v4}, LJ5/f;->r(LJ5/f;Ljava/lang/String;ILjava/lang/String;I)V

    .line 165
    .line 166
    .line 167
    throw v6
.end method

.method public final u()C
    .locals 5

    .line 1
    iget-object v0, p0, LYf/D;->c:LJ5/f;

    .line 2
    .line 3
    invoke-virtual {v0}, LJ5/f;->l()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x1

    .line 12
    const/4 v4, 0x0

    .line 13
    if-ne v2, v3, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0

    .line 20
    :cond_0
    const-string v2, "Expected single char, but got \'"

    .line 21
    .line 22
    const/16 v3, 0x27

    .line 23
    .line 24
    invoke-static {v3, v2, v1}, Lka/n;->f(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const/4 v2, 0x6

    .line 29
    const/4 v3, 0x0

    .line 30
    invoke-static {v0, v1, v4, v3, v2}, LJ5/f;->r(LJ5/f;Ljava/lang/String;ILjava/lang/String;I)V

    .line 31
    .line 32
    .line 33
    throw v3
.end method

.method public final w()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, LYf/D;->f:LXf/h;

    .line 2
    .line 3
    iget-object v1, p0, LYf/D;->c:LJ5/f;

    .line 4
    .line 5
    iget-boolean v0, v0, LXf/h;->c:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v1}, LJ5/f;->m()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    invoke-virtual {v1}, LJ5/f;->j()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0
.end method

.method public final z(Lkotlinx/serialization/KSerializer;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, LYf/D;->a:LXf/c;

    .line 2
    .line 3
    iget-object v1, p0, LYf/D;->c:LJ5/f;

    .line 4
    .line 5
    iget-object v2, v1, LJ5/f;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, LE4/n;

    .line 8
    .line 9
    const-string v3, "Expected "

    .line 10
    .line 11
    const-string v4, "deserializer"

    .line 12
    .line 13
    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    :try_start_0
    instance-of v5, p1, LSf/d;

    .line 18
    .line 19
    if-eqz v5, :cond_5

    .line 20
    .line 21
    iget-object v5, v0, LXf/c;->a:LXf/h;

    .line 22
    .line 23
    move-object v5, p1

    .line 24
    check-cast v5, LSf/d;

    .line 25
    .line 26
    invoke-virtual {v5}, LSf/d;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    invoke-static {v0, v5}, LYf/r;->g(LXf/c;Lkotlinx/serialization/descriptors/SerialDescriptor;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    iget-object v6, p0, LYf/D;->f:LXf/h;

    .line 35
    .line 36
    iget-boolean v6, v6, LXf/h;->c:Z

    .line 37
    .line 38
    invoke-virtual {v1, v5, v6}, LJ5/f;->x(Ljava/lang/String;Z)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    const/4 v6, 0x0

    .line 43
    if-nez v5, :cond_4

    .line 44
    .line 45
    instance-of v1, p1, LSf/d;

    .line 46
    .line 47
    if-eqz v1, :cond_3

    .line 48
    .line 49
    iget-object v1, v0, LXf/c;->a:LXf/h;

    .line 50
    .line 51
    move-object v1, p1

    .line 52
    check-cast v1, LSf/d;

    .line 53
    .line 54
    invoke-virtual {v1}, LSf/d;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-static {v0, v1}, LYf/r;->g(LXf/c;Lkotlinx/serialization/descriptors/SerialDescriptor;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {p0}, LYf/D;->g()Lkotlinx/serialization/json/b;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    move-object v5, p1

    .line 67
    check-cast v5, LSf/d;

    .line 68
    .line 69
    invoke-virtual {v5}, LSf/d;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    invoke-interface {v5}, Lkotlinx/serialization/descriptors/SerialDescriptor;->h()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    instance-of v7, v1, Lkotlinx/serialization/json/c;

    .line 78
    .line 79
    const/4 v8, -0x1

    .line 80
    if-eqz v7, :cond_2

    .line 81
    .line 82
    check-cast v1, Lkotlinx/serialization/json/c;

    .line 83
    .line 84
    invoke-virtual {v1, v0}, Lkotlinx/serialization/json/c;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    check-cast v0, Lkotlinx/serialization/json/b;

    .line 89
    .line 90
    if-eqz v0, :cond_1

    .line 91
    .line 92
    invoke-static {v0}, LXf/j;->d(Lkotlinx/serialization/json/b;)Lkotlinx/serialization/json/d;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    instance-of v3, v0, Lkotlinx/serialization/json/JsonNull;

    .line 97
    .line 98
    if-eqz v3, :cond_0

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_0
    invoke-virtual {v0}, Lkotlinx/serialization/json/d;->a()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v0
    :try_end_0
    .catch LSf/b; {:try_start_0 .. :try_end_0} :catch_0

    .line 105
    goto :goto_1

    .line 106
    :catch_0
    move-exception p1

    .line 107
    goto/16 :goto_2

    .line 108
    .line 109
    :cond_1
    :goto_0
    move-object v0, v6

    .line 110
    :goto_1
    :try_start_1
    check-cast p1, LSf/d;

    .line 111
    .line 112
    invoke-static {p1, p0, v0}, Landroid/support/v4/media/session/b;->e0(LSf/d;LVf/a;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw v6
    :try_end_1
    .catch LSf/f; {:try_start_1 .. :try_end_1} :catch_1

    .line 116
    :catch_1
    move-exception p1

    .line 117
    :try_start_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1}, Lkotlinx/serialization/json/c;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-static {v8, v0, p1}, LYf/r;->c(ILjava/lang/CharSequence;Ljava/lang/String;)LYf/o;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    throw p1

    .line 133
    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    .line 134
    .line 135
    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    const-class v0, Lkotlinx/serialization/json/c;

    .line 139
    .line 140
    sget-object v3, Lkotlin/jvm/internal/H;->a:Lkotlin/jvm/internal/I;

    .line 141
    .line 142
    invoke-virtual {v3, v0}, Lkotlin/jvm/internal/I;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-interface {v0}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    const-string v0, ", but had "

    .line 154
    .line 155
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    invoke-virtual {v3, v0}, Lkotlin/jvm/internal/I;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-interface {v0}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    const-string v0, " as the serialized body of "

    .line 174
    .line 175
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    const-string v0, " at element: "

    .line 182
    .line 183
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v2}, LE4/n;->j()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    invoke-static {v8, v0, p1}, LYf/r;->c(ILjava/lang/CharSequence;Ljava/lang/String;)LYf/o;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    throw p1

    .line 206
    :cond_3
    invoke-interface {p1, p0}, Lkotlinx/serialization/KSerializer;->deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object p1
    :try_end_2
    .catch LSf/b; {:try_start_2 .. :try_end_2} :catch_0

    .line 210
    return-object p1

    .line 211
    :cond_4
    :try_start_3
    check-cast p1, LSf/d;

    .line 212
    .line 213
    invoke-static {p1, p0, v5}, Landroid/support/v4/media/session/b;->e0(LSf/d;LVf/a;Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    throw v6
    :try_end_3
    .catch LSf/f; {:try_start_3 .. :try_end_3} :catch_2

    .line 217
    :catch_2
    move-exception p1

    .line 218
    :try_start_4
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    const/16 v3, 0xa

    .line 226
    .line 227
    invoke-static {v0, v3}, LBf/k;->P0(Ljava/lang/String;C)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    const-string v5, "."

    .line 232
    .line 233
    invoke-static {v0, v5}, LBf/k;->F0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object p1

    .line 241
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    const-string v5, ""

    .line 245
    .line 246
    invoke-static {v3, p1, v5}, LBf/k;->L0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    const/4 v3, 0x2

    .line 251
    invoke-static {v1, v0, v4, p1, v3}, LJ5/f;->r(LJ5/f;Ljava/lang/String;ILjava/lang/String;I)V

    .line 252
    .line 253
    .line 254
    throw v6

    .line 255
    :cond_5
    invoke-interface {p1, p0}, Lkotlinx/serialization/KSerializer;->deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object p1
    :try_end_4
    .catch LSf/b; {:try_start_4 .. :try_end_4} :catch_0

    .line 259
    return-object p1

    .line 260
    :goto_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    const-string v1, "at path"

    .line 268
    .line 269
    invoke-static {v0, v1, v4}, LBf/k;->n0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 270
    .line 271
    .line 272
    move-result v0

    .line 273
    if-eqz v0, :cond_6

    .line 274
    .line 275
    throw p1

    .line 276
    :cond_6
    new-instance v0, LSf/b;

    .line 277
    .line 278
    new-instance v1, Ljava/lang/StringBuilder;

    .line 279
    .line 280
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 281
    .line 282
    .line 283
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v3

    .line 287
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    const-string v3, " at path: "

    .line 291
    .line 292
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v2}, LE4/n;->j()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v2

    .line 299
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 300
    .line 301
    .line 302
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v1

    .line 306
    iget-object v2, p1, LSf/b;->a:Ljava/util/ArrayList;

    .line 307
    .line 308
    invoke-direct {v0, v2, v1, p1}, LSf/b;-><init>(Ljava/util/ArrayList;Ljava/lang/String;LSf/b;)V

    .line 309
    .line 310
    .line 311
    throw v0
.end method
