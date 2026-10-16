.class public abstract LJ5/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public b:I

.field public final c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 5

    const/4 v0, 0x1

    iput v0, p0, LJ5/f;->a:I

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance v0, LE4/n;

    const/16 v1, 0x8

    const/4 v2, 0x0

    .line 11
    invoke-direct {v0, v2, v1}, LE4/n;-><init>(SI)V

    .line 12
    new-array v2, v1, [Ljava/lang/Object;

    iput-object v2, v0, LE4/n;->c:Ljava/lang/Object;

    .line 13
    new-array v2, v1, [I

    const/4 v3, 0x0

    :goto_0
    const/4 v4, -0x1

    if-ge v3, v1, :cond_0

    aput v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iput-object v2, v0, LE4/n;->d:Ljava/lang/Object;

    .line 14
    iput v4, v0, LE4/n;->b:I

    .line 15
    iput-object v0, p0, LJ5/f;->c:Ljava/lang/Object;

    .line 16
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, LJ5/f;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LJ5/c;LJ5/e;JJJJJI)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LJ5/f;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, LJ5/f;->d:Ljava/lang/Object;

    .line 3
    iput p13, p0, LJ5/f;->b:I

    move-object p2, p1

    .line 4
    new-instance p1, LJ5/a;

    invoke-direct/range {p1 .. p12}, LJ5/a;-><init>(LJ5/c;JJJJJ)V

    iput-object p1, p0, LJ5/f;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ls2/e;Ls2/g;JJJJJI)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LJ5/f;->a:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p2, p0, LJ5/f;->d:Ljava/lang/Object;

    .line 7
    iput p13, p0, LJ5/f;->b:I

    move-object p2, p1

    .line 8
    new-instance p1, Ls2/d;

    invoke-direct/range {p1 .. p12}, Ls2/d;-><init>(Ls2/e;JJJJJ)V

    iput-object p1, p0, LJ5/f;->c:Ljava/lang/Object;

    return-void
.end method

.method public static B(LJ5/h;JLJ5/n;)I
    .locals 2

    .line 1
    iget-wide v0, p0, LJ5/h;->d:J

    .line 2
    .line 3
    cmp-long p0, p1, v0

    .line 4
    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return p0

    .line 9
    :cond_0
    iput-wide p1, p3, LJ5/n;->a:J

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0
.end method

.method public static C(Ls2/j;JLJ5/n;)I
    .locals 2

    .line 1
    iget-wide v0, p0, Ls2/j;->d:J

    .line 2
    .line 3
    cmp-long p0, p1, v0

    .line 4
    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return p0

    .line 9
    :cond_0
    iput-wide p1, p3, LJ5/n;->a:J

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0
.end method

.method public static synthetic r(LJ5/f;Ljava/lang/String;ILjava/lang/String;I)V
    .locals 1

    .line 1
    and-int/lit8 v0, p4, 0x2

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget p2, p0, LJ5/f;->b:I

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    const-string p3, ""

    .line 12
    .line 13
    :cond_1
    invoke-virtual {p0, p2, p1, p3}, LJ5/f;->q(ILjava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    throw p0
.end method

.method public static w(C)Z
    .locals 1

    .line 1
    const/16 v0, 0x2c

    .line 2
    .line 3
    if-eq p0, v0, :cond_0

    .line 4
    .line 5
    const/16 v0, 0x3a

    .line 6
    .line 7
    if-eq p0, v0, :cond_0

    .line 8
    .line 9
    const/16 v0, 0x5d

    .line 10
    .line 11
    if-eq p0, v0, :cond_0

    .line 12
    .line 13
    const/16 v0, 0x7d

    .line 14
    .line 15
    if-eq p0, v0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
.end method


# virtual methods
.method public abstract A(I)I
.end method

.method public D(J)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v2, p1

    .line 4
    .line 5
    iget v1, v0, LJ5/f;->a:I

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, LJ5/f;->e:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, LJ5/b;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    iget-wide v4, v1, LJ5/b;->a:J

    .line 17
    .line 18
    cmp-long v1, v4, v2

    .line 19
    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance v1, LJ5/b;

    .line 24
    .line 25
    iget-object v4, v0, LJ5/f;->c:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v4, Ls2/d;

    .line 28
    .line 29
    iget-object v5, v4, Ls2/d;->a:Ls2/e;

    .line 30
    .line 31
    invoke-interface {v5, v2, v3}, Ls2/e;->a(J)J

    .line 32
    .line 33
    .line 34
    move-result-wide v5

    .line 35
    iget-wide v10, v4, Ls2/d;->e:J

    .line 36
    .line 37
    iget-wide v12, v4, Ls2/d;->f:J

    .line 38
    .line 39
    move-wide v8, v5

    .line 40
    iget-wide v6, v4, Ls2/d;->c:J

    .line 41
    .line 42
    iget-wide v4, v4, Ls2/d;->d:J

    .line 43
    .line 44
    const/4 v14, 0x1

    .line 45
    move-wide v15, v8

    .line 46
    move-wide v8, v4

    .line 47
    move-wide v4, v15

    .line 48
    invoke-direct/range {v1 .. v14}, LJ5/b;-><init>(JJJJJJI)V

    .line 49
    .line 50
    .line 51
    iput-object v1, v0, LJ5/f;->e:Ljava/lang/Object;

    .line 52
    .line 53
    :goto_0
    return-void

    .line 54
    :pswitch_0
    iget-object v1, v0, LJ5/f;->e:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v1, LJ5/b;

    .line 57
    .line 58
    if-eqz v1, :cond_1

    .line 59
    .line 60
    iget-wide v4, v1, LJ5/b;->a:J

    .line 61
    .line 62
    cmp-long v1, v4, v2

    .line 63
    .line 64
    if-nez v1, :cond_1

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_1
    new-instance v1, LJ5/b;

    .line 68
    .line 69
    iget-object v4, v0, LJ5/f;->c:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v4, LJ5/a;

    .line 72
    .line 73
    iget-object v5, v4, LJ5/a;->a:LJ5/c;

    .line 74
    .line 75
    invoke-interface {v5, v2, v3}, LJ5/c;->a(J)J

    .line 76
    .line 77
    .line 78
    move-result-wide v5

    .line 79
    iget-wide v10, v4, LJ5/a;->e:J

    .line 80
    .line 81
    iget-wide v12, v4, LJ5/a;->f:J

    .line 82
    .line 83
    move-wide v8, v5

    .line 84
    iget-wide v6, v4, LJ5/a;->c:J

    .line 85
    .line 86
    iget-wide v4, v4, LJ5/a;->d:J

    .line 87
    .line 88
    const/4 v14, 0x0

    .line 89
    move-wide v15, v8

    .line 90
    move-wide v8, v4

    .line 91
    move-wide v4, v15

    .line 92
    invoke-direct/range {v1 .. v14}, LJ5/b;-><init>(JJJJJJI)V

    .line 93
    .line 94
    .line 95
    iput-object v1, v0, LJ5/f;->e:Ljava/lang/Object;

    .line 96
    .line 97
    :goto_1
    return-void

    .line 98
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public abstract E()I
.end method

.method public F(II)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, LJ5/f;->t()Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1, p2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public G()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, LJ5/f;->E()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, LJ5/f;->t()Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-ge v0, v2, :cond_1

    .line 14
    .line 15
    const/4 v2, -0x1

    .line 16
    if-ne v0, v2, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-interface {v1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/16 v1, 0x2c

    .line 24
    .line 25
    if-ne v0, v1, :cond_1

    .line 26
    .line 27
    iget v0, p0, LJ5/f;->b:I

    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    add-int/2addr v0, v1

    .line 31
    iput v0, p0, LJ5/f;->b:I

    .line 32
    .line 33
    return v1

    .line 34
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 35
    return v0
.end method

.method public H(C)V
    .locals 6

    .line 1
    iget v0, p0, LJ5/f;->b:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-lez v0, :cond_1

    .line 5
    .line 6
    const/16 v2, 0x22

    .line 7
    .line 8
    if-ne p1, v2, :cond_1

    .line 9
    .line 10
    add-int/lit8 v2, v0, -0x1

    .line 11
    .line 12
    :try_start_0
    iput v2, p0, LJ5/f;->b:I

    .line 13
    .line 14
    invoke-virtual {p0}, LJ5/f;->l()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    iput v0, p0, LJ5/f;->b:I

    .line 19
    .line 20
    const-string v0, "null"

    .line 21
    .line 22
    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget p1, p0, LJ5/f;->b:I

    .line 30
    .line 31
    add-int/lit8 p1, p1, -0x1

    .line 32
    .line 33
    const-string v0, "Use \'coerceInputValues = true\' in \'Json {}\' builder to coerce nulls if property has a default value."

    .line 34
    .line 35
    const-string v2, "Expected string literal but \'null\' literal was found"

    .line 36
    .line 37
    invoke-virtual {p0, p1, v2, v0}, LJ5/f;->q(ILjava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw v1

    .line 41
    :catchall_0
    move-exception p1

    .line 42
    iput v0, p0, LJ5/f;->b:I

    .line 43
    .line 44
    throw p1

    .line 45
    :cond_1
    :goto_0
    invoke-static {p1}, LYf/r;->f(C)B

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    invoke-static {p1}, LYf/r;->r(B)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    iget v0, p0, LJ5/f;->b:I

    .line 54
    .line 55
    add-int/lit8 v2, v0, -0x1

    .line 56
    .line 57
    invoke-virtual {p0}, LJ5/f;->t()Ljava/lang/CharSequence;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-eq v0, v3, :cond_3

    .line 66
    .line 67
    if-gez v2, :cond_2

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    invoke-virtual {p0}, LJ5/f;->t()Ljava/lang/CharSequence;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-interface {v0, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    goto :goto_2

    .line 83
    :cond_3
    :goto_1
    const-string v0, "EOF"

    .line 84
    .line 85
    :goto_2
    const-string v3, "Expected "

    .line 86
    .line 87
    const-string v4, ", but had \'"

    .line 88
    .line 89
    const-string v5, "\' instead"

    .line 90
    .line 91
    invoke-static {v3, p1, v4, v0, v5}, LR8/v;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    const/4 v0, 0x4

    .line 96
    invoke-static {p0, p1, v2, v1, v0}, LJ5/f;->r(LJ5/f;Ljava/lang/String;ILjava/lang/String;I)V

    .line 97
    .line 98
    .line 99
    throw v1
.end method

.method public a(Ljava/lang/CharSequence;I)I
    .locals 3

    .line 1
    add-int/lit8 v0, p2, 0x4

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-lt v0, v1, :cond_1

    .line 8
    .line 9
    iput p2, p0, LJ5/f;->b:I

    .line 10
    .line 11
    invoke-virtual {p0}, LJ5/f;->o()V

    .line 12
    .line 13
    .line 14
    iget p2, p0, LJ5/f;->b:I

    .line 15
    .line 16
    add-int/lit8 p2, p2, 0x4

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-ge p2, v0, :cond_0

    .line 23
    .line 24
    iget p2, p0, LJ5/f;->b:I

    .line 25
    .line 26
    invoke-virtual {p0, p1, p2}, LJ5/f;->a(Ljava/lang/CharSequence;I)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    return p1

    .line 31
    :cond_0
    const-string p1, "Unexpected EOF during unicode escape"

    .line 32
    .line 33
    const/4 p2, 0x0

    .line 34
    const/4 v0, 0x0

    .line 35
    const/4 v1, 0x6

    .line 36
    invoke-static {p0, p1, p2, v0, v1}, LJ5/f;->r(LJ5/f;Ljava/lang/String;ILjava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    throw v0

    .line 40
    :cond_1
    invoke-virtual {p0, p1, p2}, LJ5/f;->s(Ljava/lang/CharSequence;I)I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    shl-int/lit8 v1, v1, 0xc

    .line 45
    .line 46
    add-int/lit8 v2, p2, 0x1

    .line 47
    .line 48
    invoke-virtual {p0, p1, v2}, LJ5/f;->s(Ljava/lang/CharSequence;I)I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    shl-int/lit8 v2, v2, 0x8

    .line 53
    .line 54
    add-int/2addr v1, v2

    .line 55
    add-int/lit8 v2, p2, 0x2

    .line 56
    .line 57
    invoke-virtual {p0, p1, v2}, LJ5/f;->s(Ljava/lang/CharSequence;I)I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    shl-int/lit8 v2, v2, 0x4

    .line 62
    .line 63
    add-int/2addr v1, v2

    .line 64
    add-int/lit8 p2, p2, 0x3

    .line 65
    .line 66
    invoke-virtual {p0, p1, p2}, LJ5/f;->s(Ljava/lang/CharSequence;I)I

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    add-int/2addr p1, v1

    .line 71
    int-to-char p1, p1

    .line 72
    iget-object p2, p0, LJ5/f;->e:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p2, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    return v0
.end method

.method public b(II)V
    .locals 2

    .line 1
    iget-object v0, p0, LJ5/f;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-virtual {p0}, LJ5/f;->t()Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1, p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public abstract c()Z
.end method

.method public d(ILjava/lang/String;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, LJ5/f;->t()Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    sub-int/2addr v0, p1

    .line 10
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x6

    .line 15
    const/4 v3, 0x0

    .line 16
    const/4 v4, 0x0

    .line 17
    if-lt v0, v1, :cond_2

    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    move v1, v3

    .line 24
    :goto_0
    if-ge v1, v0, :cond_1

    .line 25
    .line 26
    invoke-virtual {p2, v1}, Ljava/lang/String;->charAt(I)C

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    invoke-virtual {p0}, LJ5/f;->t()Ljava/lang/CharSequence;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    add-int v7, p1, v1

    .line 35
    .line 36
    invoke-interface {v6, v7}, Ljava/lang/CharSequence;->charAt(I)C

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    or-int/lit8 v6, v6, 0x20

    .line 41
    .line 42
    if-ne v5, v6, :cond_0

    .line 43
    .line 44
    add-int/lit8 v1, v1, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    const-string p2, "Expected valid boolean literal prefix, but had \'"

    .line 50
    .line 51
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, LJ5/f;->l()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const/16 p2, 0x27

    .line 62
    .line 63
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-static {p0, p1, v3, v4, v2}, LJ5/f;->r(LJ5/f;Ljava/lang/String;ILjava/lang/String;I)V

    .line 71
    .line 72
    .line 73
    throw v4

    .line 74
    :cond_1
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 75
    .line 76
    .line 77
    move-result p2

    .line 78
    add-int/2addr p2, p1

    .line 79
    iput p2, p0, LJ5/f;->b:I

    .line 80
    .line 81
    return-void

    .line 82
    :cond_2
    const-string p1, "Unexpected end of boolean literal"

    .line 83
    .line 84
    invoke-static {p0, p1, v3, v4, v2}, LJ5/f;->r(LJ5/f;Ljava/lang/String;ILjava/lang/String;I)V

    .line 85
    .line 86
    .line 87
    throw v4
.end method

.method public abstract e()Ljava/lang/String;
.end method

.method public abstract f()B
.end method

.method public g(B)B
    .locals 5

    .line 1
    invoke-virtual {p0}, LJ5/f;->f()B

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eq v0, p1, :cond_2

    .line 6
    .line 7
    invoke-static {p1}, LYf/r;->r(B)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget v0, p0, LJ5/f;->b:I

    .line 12
    .line 13
    add-int/lit8 v1, v0, -0x1

    .line 14
    .line 15
    invoke-virtual {p0}, LJ5/f;->t()Ljava/lang/CharSequence;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eq v0, v2, :cond_1

    .line 24
    .line 25
    if-gez v1, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {p0}, LJ5/f;->t()Ljava/lang/CharSequence;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    :goto_0
    const-string v0, "EOF"

    .line 42
    .line 43
    :goto_1
    const-string v2, "Expected "

    .line 44
    .line 45
    const-string v3, ", but had \'"

    .line 46
    .line 47
    const-string v4, "\' instead"

    .line 48
    .line 49
    invoke-static {v2, p1, v3, v0, v4}, LR8/v;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    const/4 v0, 0x4

    .line 54
    const/4 v2, 0x0

    .line 55
    invoke-static {p0, p1, v1, v2, v0}, LJ5/f;->r(LJ5/f;Ljava/lang/String;ILjava/lang/String;I)V

    .line 56
    .line 57
    .line 58
    throw v2

    .line 59
    :cond_2
    return v0
.end method

.method public abstract h(C)V
.end method

.method public i()J
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, LJ5/f;->E()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {v0, v1}, LJ5/f;->A(I)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {v0}, LJ5/f;->t()Ljava/lang/CharSequence;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const-string v3, "EOF"

    .line 20
    .line 21
    const/4 v4, 0x6

    .line 22
    const/4 v5, 0x0

    .line 23
    const/4 v6, 0x0

    .line 24
    if-ge v1, v2, :cond_1d

    .line 25
    .line 26
    const/4 v2, -0x1

    .line 27
    if-eq v1, v2, :cond_1d

    .line 28
    .line 29
    invoke-virtual {v0}, LJ5/f;->t()Ljava/lang/CharSequence;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-interface {v2, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    const/16 v8, 0x22

    .line 38
    .line 39
    if-ne v2, v8, :cond_1

    .line 40
    .line 41
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    invoke-virtual {v0}, LJ5/f;->t()Ljava/lang/CharSequence;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eq v1, v2, :cond_0

    .line 52
    .line 53
    const/4 v2, 0x1

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    invoke-static {v0, v3, v5, v6, v4}, LJ5/f;->r(LJ5/f;Ljava/lang/String;ILjava/lang/String;I)V

    .line 56
    .line 57
    .line 58
    throw v6

    .line 59
    :cond_1
    move v2, v5

    .line 60
    :goto_0
    move v11, v1

    .line 61
    move v7, v5

    .line 62
    move v12, v7

    .line 63
    move v13, v12

    .line 64
    const-wide/16 v9, 0x0

    .line 65
    .line 66
    const-wide/16 v14, 0x0

    .line 67
    .line 68
    const-wide/16 v16, 0x0

    .line 69
    .line 70
    :goto_1
    invoke-virtual {v0}, LJ5/f;->t()Ljava/lang/CharSequence;

    .line 71
    .line 72
    .line 73
    move-result-object v18

    .line 74
    invoke-interface/range {v18 .. v18}, Ljava/lang/CharSequence;->length()I

    .line 75
    .line 76
    .line 77
    move-result v8

    .line 78
    const-string v4, "Numeric value overflow"

    .line 79
    .line 80
    if-eq v11, v8, :cond_f

    .line 81
    .line 82
    invoke-virtual {v0}, LJ5/f;->t()Ljava/lang/CharSequence;

    .line 83
    .line 84
    .line 85
    move-result-object v8

    .line 86
    invoke-interface {v8, v11}, Ljava/lang/CharSequence;->charAt(I)C

    .line 87
    .line 88
    .line 89
    move-result v8

    .line 90
    const/16 v5, 0x65

    .line 91
    .line 92
    if-eq v8, v5, :cond_3

    .line 93
    .line 94
    const/16 v5, 0x45

    .line 95
    .line 96
    if-ne v8, v5, :cond_2

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_2
    move/from16 v19, v2

    .line 100
    .line 101
    const/4 v5, 0x0

    .line 102
    goto :goto_3

    .line 103
    :cond_3
    :goto_2
    if-nez v12, :cond_2

    .line 104
    .line 105
    if-eq v11, v1, :cond_4

    .line 106
    .line 107
    add-int/lit8 v11, v11, 0x1

    .line 108
    .line 109
    const/4 v4, 0x6

    .line 110
    const/4 v5, 0x0

    .line 111
    const/4 v7, 0x1

    .line 112
    const/16 v8, 0x22

    .line 113
    .line 114
    const/4 v12, 0x1

    .line 115
    goto :goto_1

    .line 116
    :cond_4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 117
    .line 118
    const-string v2, "Unexpected symbol "

    .line 119
    .line 120
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    const-string v2, " in numeric literal"

    .line 127
    .line 128
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    const/4 v2, 0x6

    .line 136
    const/4 v5, 0x0

    .line 137
    invoke-static {v0, v1, v5, v6, v2}, LJ5/f;->r(LJ5/f;Ljava/lang/String;ILjava/lang/String;I)V

    .line 138
    .line 139
    .line 140
    throw v6

    .line 141
    :goto_3
    const-string v2, "Unexpected symbol \'-\' in numeric literal"

    .line 142
    .line 143
    const/16 v5, 0x2d

    .line 144
    .line 145
    if-ne v8, v5, :cond_6

    .line 146
    .line 147
    if-eqz v12, :cond_6

    .line 148
    .line 149
    if-eq v11, v1, :cond_5

    .line 150
    .line 151
    add-int/lit8 v11, v11, 0x1

    .line 152
    .line 153
    move/from16 v2, v19

    .line 154
    .line 155
    const/4 v4, 0x6

    .line 156
    const/4 v5, 0x0

    .line 157
    const/4 v7, 0x0

    .line 158
    :goto_4
    const/16 v8, 0x22

    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_5
    const/4 v4, 0x6

    .line 162
    const/4 v5, 0x0

    .line 163
    invoke-static {v0, v2, v5, v6, v4}, LJ5/f;->r(LJ5/f;Ljava/lang/String;ILjava/lang/String;I)V

    .line 164
    .line 165
    .line 166
    throw v6

    .line 167
    :cond_6
    const/16 v5, 0x2b

    .line 168
    .line 169
    if-ne v8, v5, :cond_8

    .line 170
    .line 171
    if-eqz v12, :cond_8

    .line 172
    .line 173
    if-eq v11, v1, :cond_7

    .line 174
    .line 175
    add-int/lit8 v11, v11, 0x1

    .line 176
    .line 177
    move/from16 v2, v19

    .line 178
    .line 179
    const/4 v4, 0x6

    .line 180
    const/4 v5, 0x0

    .line 181
    const/4 v7, 0x1

    .line 182
    goto :goto_4

    .line 183
    :cond_7
    const-string v1, "Unexpected symbol \'+\' in numeric literal"

    .line 184
    .line 185
    const/4 v2, 0x0

    .line 186
    const/4 v5, 0x6

    .line 187
    invoke-static {v0, v1, v2, v6, v5}, LJ5/f;->r(LJ5/f;Ljava/lang/String;ILjava/lang/String;I)V

    .line 188
    .line 189
    .line 190
    throw v6

    .line 191
    :cond_8
    move/from16 v21, v12

    .line 192
    .line 193
    const/4 v12, 0x0

    .line 194
    const/16 v5, 0x2d

    .line 195
    .line 196
    if-ne v8, v5, :cond_a

    .line 197
    .line 198
    if-ne v11, v1, :cond_9

    .line 199
    .line 200
    add-int/lit8 v11, v11, 0x1

    .line 201
    .line 202
    move v5, v12

    .line 203
    move/from16 v2, v19

    .line 204
    .line 205
    move/from16 v12, v21

    .line 206
    .line 207
    const/4 v4, 0x6

    .line 208
    const/16 v8, 0x22

    .line 209
    .line 210
    const/4 v13, 0x1

    .line 211
    goto/16 :goto_1

    .line 212
    .line 213
    :cond_9
    const/4 v4, 0x6

    .line 214
    invoke-static {v0, v2, v12, v6, v4}, LJ5/f;->r(LJ5/f;Ljava/lang/String;ILjava/lang/String;I)V

    .line 215
    .line 216
    .line 217
    throw v6

    .line 218
    :cond_a
    invoke-static {v8}, LYf/r;->f(C)B

    .line 219
    .line 220
    .line 221
    move-result v2

    .line 222
    if-nez v2, :cond_e

    .line 223
    .line 224
    add-int/lit8 v11, v11, 0x1

    .line 225
    .line 226
    add-int/lit8 v2, v8, -0x30

    .line 227
    .line 228
    if-ltz v2, :cond_d

    .line 229
    .line 230
    const/16 v5, 0xa

    .line 231
    .line 232
    if-ge v2, v5, :cond_d

    .line 233
    .line 234
    if-eqz v21, :cond_b

    .line 235
    .line 236
    int-to-long v4, v5

    .line 237
    mul-long/2addr v9, v4

    .line 238
    int-to-long v4, v2

    .line 239
    add-long/2addr v9, v4

    .line 240
    move/from16 v2, v19

    .line 241
    .line 242
    move/from16 v12, v21

    .line 243
    .line 244
    const/4 v4, 0x6

    .line 245
    const/4 v5, 0x0

    .line 246
    goto :goto_4

    .line 247
    :cond_b
    move/from16 v20, v7

    .line 248
    .line 249
    int-to-long v6, v5

    .line 250
    mul-long/2addr v14, v6

    .line 251
    int-to-long v5, v2

    .line 252
    sub-long/2addr v14, v5

    .line 253
    cmp-long v2, v14, v16

    .line 254
    .line 255
    if-gtz v2, :cond_c

    .line 256
    .line 257
    move/from16 v2, v19

    .line 258
    .line 259
    move/from16 v7, v20

    .line 260
    .line 261
    move/from16 v12, v21

    .line 262
    .line 263
    const/4 v4, 0x6

    .line 264
    const/4 v5, 0x0

    .line 265
    const/4 v6, 0x0

    .line 266
    goto :goto_4

    .line 267
    :cond_c
    const/4 v2, 0x6

    .line 268
    const/4 v5, 0x0

    .line 269
    const/4 v12, 0x0

    .line 270
    invoke-static {v0, v4, v5, v12, v2}, LJ5/f;->r(LJ5/f;Ljava/lang/String;ILjava/lang/String;I)V

    .line 271
    .line 272
    .line 273
    throw v12

    .line 274
    :cond_d
    move-object v12, v6

    .line 275
    const/4 v2, 0x6

    .line 276
    const/4 v5, 0x0

    .line 277
    new-instance v1, Ljava/lang/StringBuilder;

    .line 278
    .line 279
    const-string v3, "Unexpected symbol \'"

    .line 280
    .line 281
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 285
    .line 286
    .line 287
    const-string v3, "\' in numeric literal"

    .line 288
    .line 289
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    invoke-static {v0, v1, v5, v12, v2}, LJ5/f;->r(LJ5/f;Ljava/lang/String;ILjava/lang/String;I)V

    .line 297
    .line 298
    .line 299
    throw v12

    .line 300
    :cond_e
    :goto_5
    move/from16 v20, v7

    .line 301
    .line 302
    goto :goto_6

    .line 303
    :cond_f
    move/from16 v19, v2

    .line 304
    .line 305
    move/from16 v21, v12

    .line 306
    .line 307
    goto :goto_5

    .line 308
    :goto_6
    if-eq v11, v1, :cond_10

    .line 309
    .line 310
    const/4 v2, 0x1

    .line 311
    goto :goto_7

    .line 312
    :cond_10
    const/4 v2, 0x0

    .line 313
    :goto_7
    if-eq v1, v11, :cond_11

    .line 314
    .line 315
    if-eqz v13, :cond_12

    .line 316
    .line 317
    add-int/lit8 v5, v11, -0x1

    .line 318
    .line 319
    if-eq v1, v5, :cond_11

    .line 320
    .line 321
    goto :goto_8

    .line 322
    :cond_11
    const/4 v2, 0x6

    .line 323
    const/4 v5, 0x0

    .line 324
    const/4 v12, 0x0

    .line 325
    goto/16 :goto_c

    .line 326
    .line 327
    :cond_12
    :goto_8
    if-eqz v19, :cond_15

    .line 328
    .line 329
    if-eqz v2, :cond_14

    .line 330
    .line 331
    invoke-virtual {v0}, LJ5/f;->t()Ljava/lang/CharSequence;

    .line 332
    .line 333
    .line 334
    move-result-object v1

    .line 335
    invoke-interface {v1, v11}, Ljava/lang/CharSequence;->charAt(I)C

    .line 336
    .line 337
    .line 338
    move-result v1

    .line 339
    const/16 v2, 0x22

    .line 340
    .line 341
    if-ne v1, v2, :cond_13

    .line 342
    .line 343
    add-int/lit8 v11, v11, 0x1

    .line 344
    .line 345
    goto :goto_9

    .line 346
    :cond_13
    const-string v1, "Expected closing quotation mark"

    .line 347
    .line 348
    const/4 v2, 0x6

    .line 349
    const/4 v5, 0x0

    .line 350
    const/4 v12, 0x0

    .line 351
    invoke-static {v0, v1, v5, v12, v2}, LJ5/f;->r(LJ5/f;Ljava/lang/String;ILjava/lang/String;I)V

    .line 352
    .line 353
    .line 354
    throw v12

    .line 355
    :cond_14
    const/4 v2, 0x6

    .line 356
    const/4 v5, 0x0

    .line 357
    const/4 v12, 0x0

    .line 358
    invoke-static {v0, v3, v5, v12, v2}, LJ5/f;->r(LJ5/f;Ljava/lang/String;ILjava/lang/String;I)V

    .line 359
    .line 360
    .line 361
    throw v12

    .line 362
    :cond_15
    :goto_9
    iput v11, v0, LJ5/f;->b:I

    .line 363
    .line 364
    if-eqz v21, :cond_1a

    .line 365
    .line 366
    long-to-double v1, v14

    .line 367
    const-wide/high16 v5, 0x4024000000000000L    # 10.0

    .line 368
    .line 369
    if-nez v20, :cond_16

    .line 370
    .line 371
    long-to-double v7, v9

    .line 372
    neg-double v7, v7

    .line 373
    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->pow(DD)D

    .line 374
    .line 375
    .line 376
    move-result-wide v5

    .line 377
    goto :goto_a

    .line 378
    :cond_16
    move/from16 v7, v20

    .line 379
    .line 380
    const/4 v3, 0x1

    .line 381
    if-ne v7, v3, :cond_19

    .line 382
    .line 383
    long-to-double v7, v9

    .line 384
    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->pow(DD)D

    .line 385
    .line 386
    .line 387
    move-result-wide v5

    .line 388
    :goto_a
    mul-double/2addr v1, v5

    .line 389
    const-wide/high16 v5, 0x43e0000000000000L    # 9.223372036854776E18

    .line 390
    .line 391
    cmpl-double v3, v1, v5

    .line 392
    .line 393
    if-gtz v3, :cond_18

    .line 394
    .line 395
    const-wide/high16 v5, -0x3c20000000000000L    # -9.223372036854776E18

    .line 396
    .line 397
    cmpg-double v3, v1, v5

    .line 398
    .line 399
    if-ltz v3, :cond_18

    .line 400
    .line 401
    invoke-static {v1, v2}, Ljava/lang/Math;->floor(D)D

    .line 402
    .line 403
    .line 404
    move-result-wide v5

    .line 405
    cmpg-double v3, v5, v1

    .line 406
    .line 407
    if-nez v3, :cond_17

    .line 408
    .line 409
    double-to-long v14, v1

    .line 410
    goto :goto_b

    .line 411
    :cond_17
    new-instance v3, Ljava/lang/StringBuilder;

    .line 412
    .line 413
    const-string v4, "Can\'t convert "

    .line 414
    .line 415
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 416
    .line 417
    .line 418
    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 419
    .line 420
    .line 421
    const-string v1, " to Long"

    .line 422
    .line 423
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 424
    .line 425
    .line 426
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    move-result-object v1

    .line 430
    const/4 v2, 0x6

    .line 431
    const/4 v5, 0x0

    .line 432
    const/4 v12, 0x0

    .line 433
    invoke-static {v0, v1, v5, v12, v2}, LJ5/f;->r(LJ5/f;Ljava/lang/String;ILjava/lang/String;I)V

    .line 434
    .line 435
    .line 436
    throw v12

    .line 437
    :cond_18
    const/4 v2, 0x6

    .line 438
    const/4 v5, 0x0

    .line 439
    const/4 v12, 0x0

    .line 440
    invoke-static {v0, v4, v5, v12, v2}, LJ5/f;->r(LJ5/f;Ljava/lang/String;ILjava/lang/String;I)V

    .line 441
    .line 442
    .line 443
    throw v12

    .line 444
    :cond_19
    new-instance v1, LE5/Q;

    .line 445
    .line 446
    const/16 v2, 0x9

    .line 447
    .line 448
    const/4 v3, 0x0

    .line 449
    invoke-direct {v1, v3, v2}, LE5/Q;-><init>(BI)V

    .line 450
    .line 451
    .line 452
    throw v1

    .line 453
    :cond_1a
    :goto_b
    if-eqz v13, :cond_1b

    .line 454
    .line 455
    return-wide v14

    .line 456
    :cond_1b
    const-wide/high16 v1, -0x8000000000000000L

    .line 457
    .line 458
    cmp-long v1, v14, v1

    .line 459
    .line 460
    if-eqz v1, :cond_1c

    .line 461
    .line 462
    neg-long v1, v14

    .line 463
    return-wide v1

    .line 464
    :cond_1c
    const/4 v2, 0x6

    .line 465
    const/4 v5, 0x0

    .line 466
    const/4 v12, 0x0

    .line 467
    invoke-static {v0, v4, v5, v12, v2}, LJ5/f;->r(LJ5/f;Ljava/lang/String;ILjava/lang/String;I)V

    .line 468
    .line 469
    .line 470
    throw v12

    .line 471
    :goto_c
    const-string v1, "Expected numeric literal"

    .line 472
    .line 473
    invoke-static {v0, v1, v5, v12, v2}, LJ5/f;->r(LJ5/f;Ljava/lang/String;ILjava/lang/String;I)V

    .line 474
    .line 475
    .line 476
    throw v12

    .line 477
    :cond_1d
    move v2, v4

    .line 478
    move-object v12, v6

    .line 479
    invoke-static {v0, v3, v5, v12, v2}, LJ5/f;->r(LJ5/f;Ljava/lang/String;ILjava/lang/String;I)V

    .line 480
    .line 481
    .line 482
    throw v12
.end method

.method public j()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, LJ5/f;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    iput-object v1, p0, LJ5/f;->d:Ljava/lang/Object;

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    invoke-virtual {p0}, LJ5/f;->e()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0
.end method

.method public k(Ljava/lang/CharSequence;II)Ljava/lang/String;
    .locals 9

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, p3}, Ljava/lang/CharSequence;->charAt(I)C

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    move v2, v1

    .line 12
    :goto_0
    const/16 v3, 0x22

    .line 13
    .line 14
    const/4 v4, 0x1

    .line 15
    if-eq v0, v3, :cond_8

    .line 16
    .line 17
    const-string v3, "Unexpected EOF"

    .line 18
    .line 19
    const/4 v5, 0x4

    .line 20
    const/4 v6, 0x0

    .line 21
    const/16 v7, 0x5c

    .line 22
    .line 23
    const/4 v8, -0x1

    .line 24
    if-ne v0, v7, :cond_5

    .line 25
    .line 26
    invoke-virtual {p0, p2, p3}, LJ5/f;->b(II)V

    .line 27
    .line 28
    .line 29
    add-int/lit8 p3, p3, 0x1

    .line 30
    .line 31
    invoke-virtual {p0, p3}, LJ5/f;->A(I)I

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    const/4 p3, 0x6

    .line 36
    if-eq p2, v8, :cond_4

    .line 37
    .line 38
    invoke-virtual {p0}, LJ5/f;->t()Ljava/lang/CharSequence;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    add-int/lit8 v2, p2, 0x1

    .line 43
    .line 44
    invoke-interface {v0, p2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    const/16 v0, 0x75

    .line 49
    .line 50
    if-ne p2, v0, :cond_0

    .line 51
    .line 52
    invoke-virtual {p0}, LJ5/f;->t()Ljava/lang/CharSequence;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    invoke-virtual {p0, p2, v2}, LJ5/f;->a(Ljava/lang/CharSequence;I)I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    goto :goto_2

    .line 61
    :cond_0
    if-ge p2, v0, :cond_1

    .line 62
    .line 63
    sget-object v0, LYf/i;->a:[C

    .line 64
    .line 65
    aget-char v0, v0, p2

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    move v0, v1

    .line 69
    :goto_1
    if-eqz v0, :cond_3

    .line 70
    .line 71
    iget-object p2, p0, LJ5/f;->e:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p2, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    :goto_2
    invoke-virtual {p0, v2}, LJ5/f;->A(I)I

    .line 79
    .line 80
    .line 81
    move-result p2

    .line 82
    if-eq p2, v8, :cond_2

    .line 83
    .line 84
    :goto_3
    move p3, p2

    .line 85
    move v2, v4

    .line 86
    goto :goto_4

    .line 87
    :cond_2
    invoke-static {p0, v3, p2, v6, v5}, LJ5/f;->r(LJ5/f;Ljava/lang/String;ILjava/lang/String;I)V

    .line 88
    .line 89
    .line 90
    throw v6

    .line 91
    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    .line 92
    .line 93
    const-string v0, "Invalid escaped char \'"

    .line 94
    .line 95
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    const/16 p2, 0x27

    .line 102
    .line 103
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-static {p0, p1, v1, v6, p3}, LJ5/f;->r(LJ5/f;Ljava/lang/String;ILjava/lang/String;I)V

    .line 111
    .line 112
    .line 113
    throw v6

    .line 114
    :cond_4
    const-string p1, "Expected escape sequence to continue, got EOF"

    .line 115
    .line 116
    invoke-static {p0, p1, v1, v6, p3}, LJ5/f;->r(LJ5/f;Ljava/lang/String;ILjava/lang/String;I)V

    .line 117
    .line 118
    .line 119
    throw v6

    .line 120
    :cond_5
    add-int/lit8 p3, p3, 0x1

    .line 121
    .line 122
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-lt p3, v0, :cond_7

    .line 127
    .line 128
    invoke-virtual {p0, p2, p3}, LJ5/f;->b(II)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0, p3}, LJ5/f;->A(I)I

    .line 132
    .line 133
    .line 134
    move-result p2

    .line 135
    if-eq p2, v8, :cond_6

    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_6
    invoke-static {p0, v3, p2, v6, v5}, LJ5/f;->r(LJ5/f;Ljava/lang/String;ILjava/lang/String;I)V

    .line 139
    .line 140
    .line 141
    throw v6

    .line 142
    :cond_7
    :goto_4
    invoke-interface {p1, p3}, Ljava/lang/CharSequence;->charAt(I)C

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    goto/16 :goto_0

    .line 147
    .line 148
    :cond_8
    if-nez v2, :cond_9

    .line 149
    .line 150
    invoke-virtual {p0, p2, p3}, LJ5/f;->F(II)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    goto :goto_5

    .line 155
    :cond_9
    invoke-virtual {p0, p2, p3}, LJ5/f;->n(II)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    :goto_5
    add-int/2addr p3, v4

    .line 160
    iput p3, p0, LJ5/f;->b:I

    .line 161
    .line 162
    return-object p1
.end method

.method public l()Ljava/lang/String;
    .locals 6

    .line 1
    iget-object v0, p0, LJ5/f;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/String;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iput-object v1, p0, LJ5/f;->d:Ljava/lang/Object;

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    invoke-virtual {p0}, LJ5/f;->E()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-virtual {p0}, LJ5/f;->t()Ljava/lang/CharSequence;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-ge v0, v2, :cond_7

    .line 27
    .line 28
    const/4 v2, -0x1

    .line 29
    if-eq v0, v2, :cond_7

    .line 30
    .line 31
    invoke-virtual {p0}, LJ5/f;->t()Ljava/lang/CharSequence;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-interface {v3, v0}, Ljava/lang/CharSequence;->charAt(I)C

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    invoke-static {v3}, LYf/r;->f(C)B

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    const/4 v4, 0x1

    .line 44
    if-ne v3, v4, :cond_1

    .line 45
    .line 46
    invoke-virtual {p0}, LJ5/f;->j()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    return-object v0

    .line 51
    :cond_1
    const/4 v5, 0x0

    .line 52
    if-nez v3, :cond_6

    .line 53
    .line 54
    move v1, v5

    .line 55
    :cond_2
    :goto_0
    invoke-virtual {p0}, LJ5/f;->t()Ljava/lang/CharSequence;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-interface {v3, v0}, Ljava/lang/CharSequence;->charAt(I)C

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    invoke-static {v3}, LYf/r;->f(C)B

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-nez v3, :cond_4

    .line 68
    .line 69
    add-int/lit8 v0, v0, 0x1

    .line 70
    .line 71
    invoke-virtual {p0}, LJ5/f;->t()Ljava/lang/CharSequence;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    if-lt v0, v3, :cond_2

    .line 80
    .line 81
    iget v1, p0, LJ5/f;->b:I

    .line 82
    .line 83
    invoke-virtual {p0, v1, v0}, LJ5/f;->b(II)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, v0}, LJ5/f;->A(I)I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-ne v1, v2, :cond_3

    .line 91
    .line 92
    iput v0, p0, LJ5/f;->b:I

    .line 93
    .line 94
    invoke-virtual {p0, v5, v5}, LJ5/f;->n(II)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    return-object v0

    .line 99
    :cond_3
    move v0, v1

    .line 100
    move v1, v4

    .line 101
    goto :goto_0

    .line 102
    :cond_4
    if-nez v1, :cond_5

    .line 103
    .line 104
    iget v1, p0, LJ5/f;->b:I

    .line 105
    .line 106
    invoke-virtual {p0, v1, v0}, LJ5/f;->F(II)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    goto :goto_1

    .line 111
    :cond_5
    iget v1, p0, LJ5/f;->b:I

    .line 112
    .line 113
    invoke-virtual {p0, v1, v0}, LJ5/f;->n(II)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    :goto_1
    iput v0, p0, LJ5/f;->b:I

    .line 118
    .line 119
    return-object v1

    .line 120
    :cond_6
    new-instance v2, Ljava/lang/StringBuilder;

    .line 121
    .line 122
    const-string v3, "Expected beginning of the string, but got "

    .line 123
    .line 124
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0}, LJ5/f;->t()Ljava/lang/CharSequence;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    invoke-interface {v3, v0}, Ljava/lang/CharSequence;->charAt(I)C

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    const/4 v2, 0x6

    .line 143
    invoke-static {p0, v0, v5, v1, v2}, LJ5/f;->r(LJ5/f;Ljava/lang/String;ILjava/lang/String;I)V

    .line 144
    .line 145
    .line 146
    throw v1

    .line 147
    :cond_7
    const/4 v2, 0x4

    .line 148
    const-string v3, "EOF"

    .line 149
    .line 150
    invoke-static {p0, v3, v0, v1, v2}, LJ5/f;->r(LJ5/f;Ljava/lang/String;ILjava/lang/String;I)V

    .line 151
    .line 152
    .line 153
    throw v1
.end method

.method public m()Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p0}, LJ5/f;->l()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "null"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, LJ5/f;->t()Ljava/lang/CharSequence;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget v2, p0, LJ5/f;->b:I

    .line 18
    .line 19
    add-int/lit8 v2, v2, -0x1

    .line 20
    .line 21
    invoke-interface {v1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/16 v2, 0x22

    .line 26
    .line 27
    if-ne v1, v2, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const-string v0, "Unexpected \'null\' value instead of string literal"

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    const/4 v2, 0x0

    .line 34
    const/4 v3, 0x6

    .line 35
    invoke-static {p0, v0, v1, v2, v3}, LJ5/f;->r(LJ5/f;Ljava/lang/String;ILjava/lang/String;I)V

    .line 36
    .line 37
    .line 38
    throw v2

    .line 39
    :cond_1
    :goto_0
    return-object v0
.end method

.method public n(II)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0, p1, p2}, LJ5/f;->b(II)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, LJ5/f;->e:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p1, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    const-string v0, "toString(...)"

    .line 13
    .line 14
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 19
    .line 20
    .line 21
    return-object p2
.end method

.method public o()V
    .locals 0

    .line 1
    return-void
.end method

.method public p()V
    .locals 4

    .line 1
    invoke-virtual {p0}, LJ5/f;->f()B

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0xa

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v1, "Expected EOF after parsing, but had "

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, LJ5/f;->t()Ljava/lang/CharSequence;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget v2, p0, LJ5/f;->b:I

    .line 22
    .line 23
    add-int/lit8 v2, v2, -0x1

    .line 24
    .line 25
    invoke-interface {v1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v1, " instead"

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    const/4 v1, 0x6

    .line 42
    const/4 v2, 0x0

    .line 43
    const/4 v3, 0x0

    .line 44
    invoke-static {p0, v0, v2, v3, v1}, LJ5/f;->r(LJ5/f;Ljava/lang/String;ILjava/lang/String;I)V

    .line 45
    .line 46
    .line 47
    throw v3
.end method

.method public q(ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "message"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "hint"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const-string p3, ""

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const-string v0, "\n"

    .line 21
    .line 22
    invoke-virtual {v0, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p3

    .line 26
    :goto_0
    const-string v0, " at path: "

    .line 27
    .line 28
    invoke-static {p2, v0}, LA7/p0;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    iget-object v0, p0, LJ5/f;->c:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, LE4/n;

    .line 35
    .line 36
    invoke-virtual {v0}, LE4/n;->j()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    invoke-virtual {p0}, LJ5/f;->t()Ljava/lang/CharSequence;

    .line 51
    .line 52
    .line 53
    move-result-object p3

    .line 54
    invoke-static {p1, p3, p2}, LYf/r;->c(ILjava/lang/CharSequence;Ljava/lang/String;)LYf/o;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    throw p1
.end method

.method public s(Ljava/lang/CharSequence;I)I
    .locals 2

    .line 1
    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/16 p2, 0x30

    .line 6
    .line 7
    if-gt p2, p1, :cond_0

    .line 8
    .line 9
    const/16 v0, 0x3a

    .line 10
    .line 11
    if-ge p1, v0, :cond_0

    .line 12
    .line 13
    sub-int/2addr p1, p2

    .line 14
    return p1

    .line 15
    :cond_0
    const/16 p2, 0x61

    .line 16
    .line 17
    if-gt p2, p1, :cond_1

    .line 18
    .line 19
    const/16 p2, 0x67

    .line 20
    .line 21
    if-ge p1, p2, :cond_1

    .line 22
    .line 23
    add-int/lit8 p1, p1, -0x57

    .line 24
    .line 25
    return p1

    .line 26
    :cond_1
    const/16 p2, 0x41

    .line 27
    .line 28
    if-gt p2, p1, :cond_2

    .line 29
    .line 30
    const/16 p2, 0x47

    .line 31
    .line 32
    if-ge p1, p2, :cond_2

    .line 33
    .line 34
    add-int/lit8 p1, p1, -0x37

    .line 35
    .line 36
    return p1

    .line 37
    :cond_2
    new-instance p2, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    const-string v0, "Invalid toHexChar char \'"

    .line 40
    .line 41
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string p1, "\' in unicode escape"

    .line 48
    .line 49
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    const/4 p2, 0x6

    .line 57
    const/4 v0, 0x0

    .line 58
    const/4 v1, 0x0

    .line 59
    invoke-static {p0, p1, v0, v1, p2}, LJ5/f;->r(LJ5/f;Ljava/lang/String;ILjava/lang/String;I)V

    .line 60
    .line 61
    .line 62
    throw v1
.end method

.method public abstract t()Ljava/lang/CharSequence;
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget v0, p0, LJ5/f;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v1, "JsonReader(source=\'"

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, LJ5/f;->t()Ljava/lang/CharSequence;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v1, "\', currentPosition="

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget v1, p0, LJ5/f;->b:I

    .line 31
    .line 32
    const/16 v2, 0x29

    .line 33
    .line 34
    invoke-static {v0, v1, v2}, LVa/M6;->r(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    return-object v0

    .line 39
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public u(LJ5/h;LJ5/n;)I
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    :goto_0
    iget-object v3, v0, LJ5/f;->e:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, LJ5/b;

    .line 10
    .line 11
    invoke-static {v3}, Lu6/a;->j(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-wide v4, v3, LJ5/b;->f:J

    .line 15
    .line 16
    iget-wide v6, v3, LJ5/b;->g:J

    .line 17
    .line 18
    iget-wide v8, v3, LJ5/b;->h:J

    .line 19
    .line 20
    sub-long/2addr v6, v4

    .line 21
    iget v10, v0, LJ5/f;->b:I

    .line 22
    .line 23
    int-to-long v10, v10

    .line 24
    cmp-long v6, v6, v10

    .line 25
    .line 26
    const/4 v7, 0x0

    .line 27
    iget-object v10, v0, LJ5/f;->d:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v10, LJ5/e;

    .line 30
    .line 31
    if-gtz v6, :cond_0

    .line 32
    .line 33
    iput-object v7, v0, LJ5/f;->e:Ljava/lang/Object;

    .line 34
    .line 35
    invoke-interface {v10}, LJ5/e;->s()V

    .line 36
    .line 37
    .line 38
    invoke-static {v1, v4, v5, v2}, LJ5/f;->B(LJ5/h;JLJ5/n;)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    return v1

    .line 43
    :cond_0
    iget-wide v4, v1, LJ5/h;->d:J

    .line 44
    .line 45
    sub-long v4, v8, v4

    .line 46
    .line 47
    const-wide/16 v11, 0x0

    .line 48
    .line 49
    cmp-long v6, v4, v11

    .line 50
    .line 51
    if-ltz v6, :cond_6

    .line 52
    .line 53
    const-wide/32 v13, 0x40000

    .line 54
    .line 55
    .line 56
    cmp-long v6, v4, v13

    .line 57
    .line 58
    if-gtz v6, :cond_6

    .line 59
    .line 60
    long-to-int v4, v4

    .line 61
    invoke-virtual {v1, v4}, LJ5/h;->j(I)V

    .line 62
    .line 63
    .line 64
    const/4 v4, 0x0

    .line 65
    iput v4, v1, LJ5/h;->f:I

    .line 66
    .line 67
    iget-wide v4, v3, LJ5/b;->b:J

    .line 68
    .line 69
    invoke-interface {v10, v1, v4, v5}, LJ5/e;->t(LJ5/h;J)LJ5/d;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    const/4 v5, -0x3

    .line 74
    iget v6, v4, LJ5/d;->a:I

    .line 75
    .line 76
    if-eq v6, v5, :cond_5

    .line 77
    .line 78
    const/4 v5, -0x2

    .line 79
    iget-wide v8, v4, LJ5/d;->b:J

    .line 80
    .line 81
    move-wide v15, v11

    .line 82
    iget-wide v11, v4, LJ5/d;->c:J

    .line 83
    .line 84
    if-eq v6, v5, :cond_4

    .line 85
    .line 86
    const/4 v4, -0x1

    .line 87
    if-eq v6, v4, :cond_3

    .line 88
    .line 89
    if-nez v6, :cond_2

    .line 90
    .line 91
    iget-wide v3, v1, LJ5/h;->d:J

    .line 92
    .line 93
    sub-long v3, v11, v3

    .line 94
    .line 95
    cmp-long v5, v3, v15

    .line 96
    .line 97
    if-ltz v5, :cond_1

    .line 98
    .line 99
    cmp-long v5, v3, v13

    .line 100
    .line 101
    if-gtz v5, :cond_1

    .line 102
    .line 103
    long-to-int v3, v3

    .line 104
    invoke-virtual {v1, v3}, LJ5/h;->j(I)V

    .line 105
    .line 106
    .line 107
    :cond_1
    iput-object v7, v0, LJ5/f;->e:Ljava/lang/Object;

    .line 108
    .line 109
    invoke-interface {v10}, LJ5/e;->s()V

    .line 110
    .line 111
    .line 112
    invoke-static {v1, v11, v12, v2}, LJ5/f;->B(LJ5/h;JLJ5/n;)I

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    return v1

    .line 117
    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 118
    .line 119
    const-string v2, "Invalid case"

    .line 120
    .line 121
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    throw v1

    .line 125
    :cond_3
    iput-wide v8, v3, LJ5/b;->e:J

    .line 126
    .line 127
    iput-wide v11, v3, LJ5/b;->g:J

    .line 128
    .line 129
    iget-wide v4, v3, LJ5/b;->d:J

    .line 130
    .line 131
    iget-wide v6, v3, LJ5/b;->f:J

    .line 132
    .line 133
    iget-wide v13, v3, LJ5/b;->c:J

    .line 134
    .line 135
    move-wide/from16 v17, v4

    .line 136
    .line 137
    iget-wide v4, v3, LJ5/b;->b:J

    .line 138
    .line 139
    move-wide v15, v4

    .line 140
    move-wide/from16 v21, v6

    .line 141
    .line 142
    move-wide/from16 v19, v8

    .line 143
    .line 144
    move-wide/from16 v23, v11

    .line 145
    .line 146
    move-wide/from16 v25, v13

    .line 147
    .line 148
    invoke-static/range {v15 .. v26}, LJ5/b;->a(JJJJJJ)J

    .line 149
    .line 150
    .line 151
    move-result-wide v4

    .line 152
    iput-wide v4, v3, LJ5/b;->h:J

    .line 153
    .line 154
    goto/16 :goto_0

    .line 155
    .line 156
    :cond_4
    move-wide v4, v8

    .line 157
    move-wide v6, v11

    .line 158
    iput-wide v4, v3, LJ5/b;->d:J

    .line 159
    .line 160
    iput-wide v6, v3, LJ5/b;->f:J

    .line 161
    .line 162
    iget-wide v8, v3, LJ5/b;->e:J

    .line 163
    .line 164
    iget-wide v10, v3, LJ5/b;->g:J

    .line 165
    .line 166
    iget-wide v12, v3, LJ5/b;->c:J

    .line 167
    .line 168
    iget-wide v14, v3, LJ5/b;->b:J

    .line 169
    .line 170
    move-wide/from16 v17, v4

    .line 171
    .line 172
    move-wide/from16 v21, v6

    .line 173
    .line 174
    move-wide/from16 v19, v8

    .line 175
    .line 176
    move-wide/from16 v23, v10

    .line 177
    .line 178
    move-wide/from16 v25, v12

    .line 179
    .line 180
    move-wide v15, v14

    .line 181
    invoke-static/range {v15 .. v26}, LJ5/b;->a(JJJJJJ)J

    .line 182
    .line 183
    .line 184
    move-result-wide v4

    .line 185
    iput-wide v4, v3, LJ5/b;->h:J

    .line 186
    .line 187
    goto/16 :goto_0

    .line 188
    .line 189
    :cond_5
    iput-object v7, v0, LJ5/f;->e:Ljava/lang/Object;

    .line 190
    .line 191
    invoke-interface {v10}, LJ5/e;->s()V

    .line 192
    .line 193
    .line 194
    invoke-static {v1, v8, v9, v2}, LJ5/f;->B(LJ5/h;JLJ5/n;)I

    .line 195
    .line 196
    .line 197
    move-result v1

    .line 198
    return v1

    .line 199
    :cond_6
    invoke-static {v1, v8, v9, v2}, LJ5/f;->B(LJ5/h;JLJ5/n;)I

    .line 200
    .line 201
    .line 202
    move-result v1

    .line 203
    return v1
.end method

.method public v(Ls2/j;LJ5/n;)I
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    :goto_0
    iget-object v3, v0, LJ5/f;->e:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, LJ5/b;

    .line 10
    .line 11
    invoke-static {v3}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-wide v4, v3, LJ5/b;->f:J

    .line 15
    .line 16
    iget-wide v6, v3, LJ5/b;->g:J

    .line 17
    .line 18
    iget-wide v8, v3, LJ5/b;->h:J

    .line 19
    .line 20
    sub-long/2addr v6, v4

    .line 21
    iget v10, v0, LJ5/f;->b:I

    .line 22
    .line 23
    int-to-long v10, v10

    .line 24
    cmp-long v6, v6, v10

    .line 25
    .line 26
    const/4 v7, 0x0

    .line 27
    iget-object v10, v0, LJ5/f;->d:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v10, Ls2/g;

    .line 30
    .line 31
    if-gtz v6, :cond_0

    .line 32
    .line 33
    iput-object v7, v0, LJ5/f;->e:Ljava/lang/Object;

    .line 34
    .line 35
    invoke-interface {v10}, Ls2/g;->s()V

    .line 36
    .line 37
    .line 38
    invoke-static {v1, v4, v5, v2}, LJ5/f;->C(Ls2/j;JLJ5/n;)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    return v1

    .line 43
    :cond_0
    iget-wide v4, v1, Ls2/j;->d:J

    .line 44
    .line 45
    sub-long v4, v8, v4

    .line 46
    .line 47
    const-wide/16 v11, 0x0

    .line 48
    .line 49
    cmp-long v6, v4, v11

    .line 50
    .line 51
    if-ltz v6, :cond_6

    .line 52
    .line 53
    const-wide/32 v13, 0x40000

    .line 54
    .line 55
    .line 56
    cmp-long v6, v4, v13

    .line 57
    .line 58
    if-gtz v6, :cond_6

    .line 59
    .line 60
    long-to-int v4, v4

    .line 61
    invoke-virtual {v1, v4}, Ls2/j;->j(I)V

    .line 62
    .line 63
    .line 64
    const/4 v4, 0x0

    .line 65
    iput v4, v1, Ls2/j;->f:I

    .line 66
    .line 67
    iget-wide v4, v3, LJ5/b;->b:J

    .line 68
    .line 69
    invoke-interface {v10, v1, v4, v5}, Ls2/g;->I(Ls2/j;J)Ls2/f;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    const/4 v5, -0x3

    .line 74
    iget v6, v4, Ls2/f;->a:I

    .line 75
    .line 76
    if-eq v6, v5, :cond_5

    .line 77
    .line 78
    const/4 v5, -0x2

    .line 79
    iget-wide v8, v4, Ls2/f;->b:J

    .line 80
    .line 81
    move-wide v15, v11

    .line 82
    iget-wide v11, v4, Ls2/f;->c:J

    .line 83
    .line 84
    if-eq v6, v5, :cond_4

    .line 85
    .line 86
    const/4 v4, -0x1

    .line 87
    if-eq v6, v4, :cond_3

    .line 88
    .line 89
    if-nez v6, :cond_2

    .line 90
    .line 91
    iget-wide v3, v1, Ls2/j;->d:J

    .line 92
    .line 93
    sub-long v3, v11, v3

    .line 94
    .line 95
    cmp-long v5, v3, v15

    .line 96
    .line 97
    if-ltz v5, :cond_1

    .line 98
    .line 99
    cmp-long v5, v3, v13

    .line 100
    .line 101
    if-gtz v5, :cond_1

    .line 102
    .line 103
    long-to-int v3, v3

    .line 104
    invoke-virtual {v1, v3}, Ls2/j;->j(I)V

    .line 105
    .line 106
    .line 107
    :cond_1
    iput-object v7, v0, LJ5/f;->e:Ljava/lang/Object;

    .line 108
    .line 109
    invoke-interface {v10}, Ls2/g;->s()V

    .line 110
    .line 111
    .line 112
    invoke-static {v1, v11, v12, v2}, LJ5/f;->C(Ls2/j;JLJ5/n;)I

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    return v1

    .line 117
    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 118
    .line 119
    const-string v2, "Invalid case"

    .line 120
    .line 121
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    throw v1

    .line 125
    :cond_3
    iput-wide v8, v3, LJ5/b;->e:J

    .line 126
    .line 127
    iput-wide v11, v3, LJ5/b;->g:J

    .line 128
    .line 129
    iget-wide v4, v3, LJ5/b;->d:J

    .line 130
    .line 131
    iget-wide v6, v3, LJ5/b;->f:J

    .line 132
    .line 133
    iget-wide v13, v3, LJ5/b;->c:J

    .line 134
    .line 135
    move-wide/from16 v17, v4

    .line 136
    .line 137
    iget-wide v4, v3, LJ5/b;->b:J

    .line 138
    .line 139
    move-wide v15, v4

    .line 140
    move-wide/from16 v21, v6

    .line 141
    .line 142
    move-wide/from16 v19, v8

    .line 143
    .line 144
    move-wide/from16 v23, v11

    .line 145
    .line 146
    move-wide/from16 v25, v13

    .line 147
    .line 148
    invoke-static/range {v15 .. v26}, LJ5/b;->b(JJJJJJ)J

    .line 149
    .line 150
    .line 151
    move-result-wide v4

    .line 152
    iput-wide v4, v3, LJ5/b;->h:J

    .line 153
    .line 154
    goto/16 :goto_0

    .line 155
    .line 156
    :cond_4
    move-wide v4, v8

    .line 157
    move-wide v6, v11

    .line 158
    iput-wide v4, v3, LJ5/b;->d:J

    .line 159
    .line 160
    iput-wide v6, v3, LJ5/b;->f:J

    .line 161
    .line 162
    iget-wide v8, v3, LJ5/b;->e:J

    .line 163
    .line 164
    iget-wide v10, v3, LJ5/b;->g:J

    .line 165
    .line 166
    iget-wide v12, v3, LJ5/b;->c:J

    .line 167
    .line 168
    iget-wide v14, v3, LJ5/b;->b:J

    .line 169
    .line 170
    move-wide/from16 v17, v4

    .line 171
    .line 172
    move-wide/from16 v21, v6

    .line 173
    .line 174
    move-wide/from16 v19, v8

    .line 175
    .line 176
    move-wide/from16 v23, v10

    .line 177
    .line 178
    move-wide/from16 v25, v12

    .line 179
    .line 180
    move-wide v15, v14

    .line 181
    invoke-static/range {v15 .. v26}, LJ5/b;->b(JJJJJJ)J

    .line 182
    .line 183
    .line 184
    move-result-wide v4

    .line 185
    iput-wide v4, v3, LJ5/b;->h:J

    .line 186
    .line 187
    goto/16 :goto_0

    .line 188
    .line 189
    :cond_5
    iput-object v7, v0, LJ5/f;->e:Ljava/lang/Object;

    .line 190
    .line 191
    invoke-interface {v10}, Ls2/g;->s()V

    .line 192
    .line 193
    .line 194
    invoke-static {v1, v8, v9, v2}, LJ5/f;->C(Ls2/j;JLJ5/n;)I

    .line 195
    .line 196
    .line 197
    move-result v1

    .line 198
    return v1

    .line 199
    :cond_6
    invoke-static {v1, v8, v9, v2}, LJ5/f;->C(Ls2/j;JLJ5/n;)I

    .line 200
    .line 201
    .line 202
    move-result v1

    .line 203
    return v1
.end method

.method public abstract x(Ljava/lang/String;Z)Ljava/lang/String;
.end method

.method public y()B
    .locals 5

    .line 1
    invoke-virtual {p0}, LJ5/f;->t()Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, LJ5/f;->b:I

    .line 6
    .line 7
    :goto_0
    invoke-virtual {p0, v1}, LJ5/f;->A(I)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, -0x1

    .line 12
    const/16 v3, 0xa

    .line 13
    .line 14
    if-eq v1, v2, :cond_1

    .line 15
    .line 16
    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/16 v4, 0x9

    .line 21
    .line 22
    if-eq v2, v4, :cond_0

    .line 23
    .line 24
    if-eq v2, v3, :cond_0

    .line 25
    .line 26
    const/16 v3, 0xd

    .line 27
    .line 28
    if-eq v2, v3, :cond_0

    .line 29
    .line 30
    const/16 v3, 0x20

    .line 31
    .line 32
    if-eq v2, v3, :cond_0

    .line 33
    .line 34
    iput v1, p0, LJ5/f;->b:I

    .line 35
    .line 36
    invoke-static {v2}, LYf/r;->f(C)B

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    return v0

    .line 41
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    iput v1, p0, LJ5/f;->b:I

    .line 45
    .line 46
    return v3
.end method

.method public z(Z)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, LJ5/f;->y()B

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz p1, :cond_1

    .line 7
    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {p0}, LJ5/f;->l()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    if-eq v0, v1, :cond_2

    .line 19
    .line 20
    :goto_0
    const/4 p1, 0x0

    .line 21
    return-object p1

    .line 22
    :cond_2
    invoke-virtual {p0}, LJ5/f;->j()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    :goto_1
    iput-object p1, p0, LJ5/f;->d:Ljava/lang/Object;

    .line 27
    .line 28
    return-object p1
.end method
