.class public Lp9/j;
.super Lp9/k;
.source "SourceFile"


# instance fields
.field public final a:Lp9/i;

.field public final b:Lka/C1;

.field public final c:Ls9/j;


# direct methods
.method public constructor <init>(Ls9/j;Lp9/i;Lka/C1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp9/j;->c:Ls9/j;

    .line 5
    .line 6
    iput-object p2, p0, Lp9/j;->a:Lp9/i;

    .line 7
    .line 8
    iput-object p3, p0, Lp9/j;->b:Lka/C1;

    .line 9
    .line 10
    return-void
.end method

.method public static e(Ls9/j;Lp9/i;Lka/C1;)Lp9/j;
    .locals 6

    .line 1
    sget-object v0, Ls9/j;->b:Ls9/j;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ls9/e;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    sget-object v1, Lp9/i;->i:Lp9/i;

    .line 8
    .line 9
    sget-object v2, Lp9/i;->h:Lp9/i;

    .line 10
    .line 11
    sget-object v3, Lp9/i;->k:Lp9/i;

    .line 12
    .line 13
    sget-object v4, Lp9/i;->j:Lp9/i;

    .line 14
    .line 15
    const/4 v5, 0x0

    .line 16
    if-eqz v0, :cond_3

    .line 17
    .line 18
    if-ne p1, v4, :cond_0

    .line 19
    .line 20
    new-instance p1, Lp9/p;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    invoke-direct {p1, p0, p2, v0}, Lp9/p;-><init>(Ls9/j;Lka/C1;I)V

    .line 24
    .line 25
    .line 26
    return-object p1

    .line 27
    :cond_0
    if-ne p1, v3, :cond_1

    .line 28
    .line 29
    new-instance p1, Lp9/p;

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    invoke-direct {p1, p0, p2, v0}, Lp9/p;-><init>(Ls9/j;Lka/C1;I)V

    .line 33
    .line 34
    .line 35
    return-object p1

    .line 36
    :cond_1
    if-eq p1, v2, :cond_2

    .line 37
    .line 38
    if-eq p1, v1, :cond_2

    .line 39
    .line 40
    const/4 v0, 0x1

    .line 41
    goto :goto_0

    .line 42
    :cond_2
    move v0, v5

    .line 43
    :goto_0
    iget-object v1, p1, Lp9/i;->a:Ljava/lang/String;

    .line 44
    .line 45
    const-string v2, "queries don\'t make sense on document keys"

    .line 46
    .line 47
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    new-array v2, v5, [Ljava/lang/Object;

    .line 52
    .line 53
    invoke-static {v0, v1, v2}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    new-instance v0, Lp9/p;

    .line 57
    .line 58
    invoke-direct {v0, p0, p1, p2}, Lp9/p;-><init>(Ls9/j;Lp9/i;Lka/C1;)V

    .line 59
    .line 60
    .line 61
    return-object v0

    .line 62
    :cond_3
    if-ne p1, v2, :cond_4

    .line 63
    .line 64
    new-instance p1, Lp9/a;

    .line 65
    .line 66
    const/4 v0, 0x1

    .line 67
    invoke-direct {p1, p0, v2, p2, v0}, Lp9/a;-><init>(Ls9/j;Lp9/i;Lka/C1;I)V

    .line 68
    .line 69
    .line 70
    return-object p1

    .line 71
    :cond_4
    if-ne p1, v4, :cond_5

    .line 72
    .line 73
    new-instance p1, Lp9/o;

    .line 74
    .line 75
    invoke-direct {p1, p0, v4, p2}, Lp9/j;-><init>(Ls9/j;Lp9/i;Lka/C1;)V

    .line 76
    .line 77
    .line 78
    invoke-static {p2}, Ls9/p;->f(Lka/C1;)Z

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    new-array p2, v5, [Ljava/lang/Object;

    .line 83
    .line 84
    const-string v0, "InFilter expects an ArrayValue"

    .line 85
    .line 86
    invoke-static {p0, v0, p2}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    return-object p1

    .line 90
    :cond_5
    if-ne p1, v1, :cond_6

    .line 91
    .line 92
    new-instance p1, Lp9/a;

    .line 93
    .line 94
    const/4 v0, 0x0

    .line 95
    invoke-direct {p1, p0, v1, p2, v0}, Lp9/a;-><init>(Ls9/j;Lp9/i;Lka/C1;I)V

    .line 96
    .line 97
    .line 98
    invoke-static {p2}, Ls9/p;->f(Lka/C1;)Z

    .line 99
    .line 100
    .line 101
    move-result p0

    .line 102
    new-array p2, v5, [Ljava/lang/Object;

    .line 103
    .line 104
    const-string v0, "ArrayContainsAnyFilter expects an ArrayValue"

    .line 105
    .line 106
    invoke-static {p0, v0, p2}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    return-object p1

    .line 110
    :cond_6
    if-ne p1, v3, :cond_7

    .line 111
    .line 112
    new-instance p1, Lp9/a;

    .line 113
    .line 114
    const/4 v0, 0x2

    .line 115
    invoke-direct {p1, p0, v3, p2, v0}, Lp9/a;-><init>(Ls9/j;Lp9/i;Lka/C1;I)V

    .line 116
    .line 117
    .line 118
    invoke-static {p2}, Ls9/p;->f(Lka/C1;)Z

    .line 119
    .line 120
    .line 121
    move-result p0

    .line 122
    new-array p2, v5, [Ljava/lang/Object;

    .line 123
    .line 124
    const-string v0, "NotInFilter expects an ArrayValue"

    .line 125
    .line 126
    invoke-static {p0, v0, p2}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    return-object p1

    .line 130
    :cond_7
    new-instance v0, Lp9/j;

    .line 131
    .line 132
    invoke-direct {v0, p0, p1, p2}, Lp9/j;-><init>(Ls9/j;Lp9/i;Lka/C1;)V

    .line 133
    .line 134
    .line 135
    return-object v0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lp9/j;->c:Ls9/j;

    .line 7
    .line 8
    invoke-virtual {v1}, Ls9/j;->c()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Lp9/j;->a:Lp9/i;

    .line 16
    .line 17
    iget-object v1, v1, Lp9/i;->a:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    sget-object v1, Ls9/p;->a:Lka/C1;

    .line 23
    .line 24
    new-instance v1, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    iget-object v2, p0, Lp9/j;->b:Lka/C1;

    .line 30
    .line 31
    invoke-static {v1, v2}, Ls9/p;->a(Ljava/lang/StringBuilder;Lka/C1;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    return-object v0
.end method

.method public final b()Ljava/util/List;
    .locals 1

    .line 1
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final c()Ljava/util/List;
    .locals 1

    .line 1
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public d(Ls9/k;)Z
    .locals 5

    .line 1
    iget-object p1, p1, Ls9/k;->e:Ls9/l;

    .line 2
    .line 3
    iget-object v0, p0, Lp9/j;->c:Ls9/j;

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Ls9/l;->f(Ls9/j;)Lka/C1;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    sget-object v0, Lp9/i;->e:Lp9/i;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x1

    .line 13
    iget-object v3, p0, Lp9/j;->b:Lka/C1;

    .line 14
    .line 15
    iget-object v4, p0, Lp9/j;->a:Lp9/i;

    .line 16
    .line 17
    if-ne v4, v0, :cond_1

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-static {p1, v3}, Ls9/p;->b(Lka/C1;Lka/C1;)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    invoke-virtual {p0, p1}, Lp9/j;->g(I)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    return v2

    .line 32
    :cond_0
    return v1

    .line 33
    :cond_1
    if-eqz p1, :cond_2

    .line 34
    .line 35
    invoke-static {p1}, Ls9/p;->l(Lka/C1;)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    invoke-static {v3}, Ls9/p;->l(Lka/C1;)I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-ne v0, v4, :cond_2

    .line 44
    .line 45
    invoke-static {p1, v3}, Ls9/p;->b(Lka/C1;Lka/C1;)I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    invoke-virtual {p0, p1}, Lp9/j;->g(I)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-eqz p1, :cond_2

    .line 54
    .line 55
    return v2

    .line 56
    :cond_2
    return v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    instance-of v1, p1, Lp9/j;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    check-cast p1, Lp9/j;

    .line 10
    .line 11
    iget-object v1, p0, Lp9/j;->a:Lp9/i;

    .line 12
    .line 13
    iget-object v2, p1, Lp9/j;->a:Lp9/i;

    .line 14
    .line 15
    if-ne v1, v2, :cond_1

    .line 16
    .line 17
    iget-object v1, p0, Lp9/j;->c:Ls9/j;

    .line 18
    .line 19
    iget-object v2, p1, Lp9/j;->c:Ls9/j;

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Ls9/e;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    iget-object v1, p0, Lp9/j;->b:Lka/C1;

    .line 28
    .line 29
    iget-object p1, p1, Lp9/j;->b:Lka/C1;

    .line 30
    .line 31
    invoke-virtual {v1, p1}, Lcom/google/protobuf/GeneratedMessageLite;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    const/4 p1, 0x1

    .line 38
    return p1

    .line 39
    :cond_1
    :goto_0
    return v0
.end method

.method public final f()Z
    .locals 3

    .line 1
    const/4 v0, 0x6

    .line 2
    new-array v0, v0, [Lp9/i;

    .line 3
    .line 4
    sget-object v1, Lp9/i;->b:Lp9/i;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-object v1, v0, v2

    .line 8
    .line 9
    sget-object v1, Lp9/i;->c:Lp9/i;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    aput-object v1, v0, v2

    .line 13
    .line 14
    sget-object v1, Lp9/i;->f:Lp9/i;

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    aput-object v1, v0, v2

    .line 18
    .line 19
    sget-object v1, Lp9/i;->g:Lp9/i;

    .line 20
    .line 21
    const/4 v2, 0x3

    .line 22
    aput-object v1, v0, v2

    .line 23
    .line 24
    sget-object v1, Lp9/i;->e:Lp9/i;

    .line 25
    .line 26
    const/4 v2, 0x4

    .line 27
    aput-object v1, v0, v2

    .line 28
    .line 29
    sget-object v1, Lp9/i;->k:Lp9/i;

    .line 30
    .line 31
    const/4 v2, 0x5

    .line 32
    aput-object v1, v0, v2

    .line 33
    .line 34
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iget-object v1, p0, Lp9/j;->a:Lp9/i;

    .line 39
    .line 40
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    return v0
.end method

.method public final g(I)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    iget-object v2, p0, Lp9/j;->a:Lp9/i;

    .line 4
    .line 5
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v3

    .line 9
    if-eqz v3, :cond_5

    .line 10
    .line 11
    if-eq v3, v1, :cond_4

    .line 12
    .line 13
    const/4 v4, 0x2

    .line 14
    if-eq v3, v4, :cond_3

    .line 15
    .line 16
    const/4 v4, 0x3

    .line 17
    if-eq v3, v4, :cond_2

    .line 18
    .line 19
    const/4 v4, 0x4

    .line 20
    if-eq v3, v4, :cond_1

    .line 21
    .line 22
    const/4 v4, 0x5

    .line 23
    if-ne v3, v4, :cond_0

    .line 24
    .line 25
    if-ltz p1, :cond_6

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const-string p1, "Unknown FieldFilter operator: %s"

    .line 29
    .line 30
    new-array v1, v1, [Ljava/lang/Object;

    .line 31
    .line 32
    aput-object v2, v1, v0

    .line 33
    .line 34
    invoke-static {p1, v1}, LA6/c;->s(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    const/4 p1, 0x0

    .line 38
    throw p1

    .line 39
    :cond_1
    if-lez p1, :cond_6

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    if-eqz p1, :cond_6

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_3
    if-nez p1, :cond_6

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_4
    if-gtz p1, :cond_6

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_5
    if-gez p1, :cond_6

    .line 52
    .line 53
    :goto_0
    return v1

    .line 54
    :cond_6
    return v0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lp9/j;->a:Lp9/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/lit16 v0, v0, 0x47b

    .line 8
    .line 9
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    iget-object v1, p0, Lp9/j;->c:Ls9/j;

    .line 12
    .line 13
    invoke-virtual {v1}, Ls9/e;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/2addr v1, v0

    .line 18
    mul-int/lit8 v1, v1, 0x1f

    .line 19
    .line 20
    iget-object v0, p0, Lp9/j;->b:Lka/C1;

    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    add-int/2addr v0, v1

    .line 27
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lp9/j;->a()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
