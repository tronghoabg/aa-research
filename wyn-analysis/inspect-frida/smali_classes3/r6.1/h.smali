.class public final Lr6/h;
.super Lr6/j;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final e:I

.field public final f:Z

.field public final g:Z

.field public final h:Z

.field public final i:I

.field public final j:I

.field public final k:I

.field public final l:I

.field public final m:Z


# direct methods
.method public constructor <init>(ILf6/Z;ILr6/f;ILjava/lang/String;)V
    .locals 6

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lr6/j;-><init>(ILf6/Z;I)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    invoke-static {p5, p1}, Lr6/l;->e(IZ)Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    iput-boolean p2, p0, Lr6/h;->f:Z

    .line 10
    .line 11
    iget-object p2, p0, Lr6/j;->d:LE5/T;

    .line 12
    .line 13
    iget p2, p2, LE5/T;->d:I

    .line 14
    .line 15
    iget p3, p4, Lr6/r;->u:I

    .line 16
    .line 17
    not-int p3, p3

    .line 18
    and-int/2addr p2, p3

    .line 19
    and-int/lit8 p3, p2, 0x1

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    if-eqz p3, :cond_0

    .line 23
    .line 24
    move p3, v0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move p3, p1

    .line 27
    :goto_0
    iput-boolean p3, p0, Lr6/h;->g:Z

    .line 28
    .line 29
    and-int/lit8 p2, p2, 0x2

    .line 30
    .line 31
    if-eqz p2, :cond_1

    .line 32
    .line 33
    move p2, v0

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move p2, p1

    .line 36
    :goto_1
    iput-boolean p2, p0, Lr6/h;->h:Z

    .line 37
    .line 38
    iget-object p2, p4, Lr6/r;->s:Ll8/e0;

    .line 39
    .line 40
    invoke-virtual {p2}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 41
    .line 42
    .line 43
    move-result p3

    .line 44
    if-eqz p3, :cond_2

    .line 45
    .line 46
    const-string p3, ""

    .line 47
    .line 48
    invoke-static {p3}, Ll8/K;->n(Ljava/lang/Object;)Ll8/e0;

    .line 49
    .line 50
    .line 51
    move-result-object p3

    .line 52
    goto :goto_2

    .line 53
    :cond_2
    move-object p3, p2

    .line 54
    :goto_2
    move v1, p1

    .line 55
    :goto_3
    iget v2, p3, Ll8/e0;->d:I

    .line 56
    .line 57
    const v3, 0x7fffffff

    .line 58
    .line 59
    .line 60
    if-ge v1, v2, :cond_4

    .line 61
    .line 62
    iget-object v2, p0, Lr6/j;->d:LE5/T;

    .line 63
    .line 64
    invoke-virtual {p3, v1}, Ll8/e0;->get(I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    check-cast v4, Ljava/lang/String;

    .line 69
    .line 70
    iget-boolean v5, p4, Lr6/r;->v:Z

    .line 71
    .line 72
    invoke-static {v2, v4, v5}, Lr6/l;->c(LE5/T;Ljava/lang/String;Z)I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-lez v2, :cond_3

    .line 77
    .line 78
    goto :goto_4

    .line 79
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_4
    move v2, p1

    .line 83
    move v1, v3

    .line 84
    :goto_4
    iput v1, p0, Lr6/h;->i:I

    .line 85
    .line 86
    iput v2, p0, Lr6/h;->j:I

    .line 87
    .line 88
    iget-object p3, p0, Lr6/j;->d:LE5/T;

    .line 89
    .line 90
    iget p3, p3, LE5/T;->e:I

    .line 91
    .line 92
    iget v1, p4, Lr6/r;->t:I

    .line 93
    .line 94
    if-eqz p3, :cond_5

    .line 95
    .line 96
    if-ne p3, v1, :cond_5

    .line 97
    .line 98
    goto :goto_5

    .line 99
    :cond_5
    and-int/2addr p3, v1

    .line 100
    invoke-static {p3}, Ljava/lang/Integer;->bitCount(I)I

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    :goto_5
    iput v3, p0, Lr6/h;->k:I

    .line 105
    .line 106
    iget-object p3, p0, Lr6/j;->d:LE5/T;

    .line 107
    .line 108
    iget p3, p3, LE5/T;->e:I

    .line 109
    .line 110
    and-int/lit16 p3, p3, 0x440

    .line 111
    .line 112
    if-eqz p3, :cond_6

    .line 113
    .line 114
    move p3, v0

    .line 115
    goto :goto_6

    .line 116
    :cond_6
    move p3, p1

    .line 117
    :goto_6
    iput-boolean p3, p0, Lr6/h;->m:Z

    .line 118
    .line 119
    invoke-static {p6}, Lr6/l;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p3

    .line 123
    if-nez p3, :cond_7

    .line 124
    .line 125
    move p3, v0

    .line 126
    goto :goto_7

    .line 127
    :cond_7
    move p3, p1

    .line 128
    :goto_7
    iget-object v1, p0, Lr6/j;->d:LE5/T;

    .line 129
    .line 130
    invoke-static {v1, p6, p3}, Lr6/l;->c(LE5/T;Ljava/lang/String;Z)I

    .line 131
    .line 132
    .line 133
    move-result p3

    .line 134
    iput p3, p0, Lr6/h;->l:I

    .line 135
    .line 136
    if-gtz v2, :cond_a

    .line 137
    .line 138
    invoke-virtual {p2}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 139
    .line 140
    .line 141
    move-result p2

    .line 142
    if-eqz p2, :cond_8

    .line 143
    .line 144
    if-gtz v3, :cond_a

    .line 145
    .line 146
    :cond_8
    iget-boolean p2, p0, Lr6/h;->g:Z

    .line 147
    .line 148
    if-nez p2, :cond_a

    .line 149
    .line 150
    iget-boolean p2, p0, Lr6/h;->h:Z

    .line 151
    .line 152
    if-eqz p2, :cond_9

    .line 153
    .line 154
    if-lez p3, :cond_9

    .line 155
    .line 156
    goto :goto_8

    .line 157
    :cond_9
    move p2, p1

    .line 158
    goto :goto_9

    .line 159
    :cond_a
    :goto_8
    move p2, v0

    .line 160
    :goto_9
    iget-boolean p3, p4, Lr6/f;->K:Z

    .line 161
    .line 162
    invoke-static {p5, p3}, Lr6/l;->e(IZ)Z

    .line 163
    .line 164
    .line 165
    move-result p3

    .line 166
    if-eqz p3, :cond_b

    .line 167
    .line 168
    if-eqz p2, :cond_b

    .line 169
    .line 170
    move p1, v0

    .line 171
    :cond_b
    iput p1, p0, Lr6/h;->e:I

    .line 172
    .line 173
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, Lr6/h;->e:I

    .line 2
    .line 3
    return v0
.end method

.method public final bridge synthetic b(Lr6/j;)Z
    .locals 0

    .line 1
    check-cast p1, Lr6/h;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return p1
.end method

.method public final c(Lr6/h;)I
    .locals 6

    .line 1
    sget-object v0, Ll8/A;->a:Ll8/y;

    .line 2
    .line 3
    iget-boolean v1, p1, Lr6/h;->f:Z

    .line 4
    .line 5
    iget-boolean v2, p0, Lr6/h;->f:Z

    .line 6
    .line 7
    invoke-virtual {v0, v2, v1}, Ll8/y;->c(ZZ)Ll8/A;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget v1, p0, Lr6/h;->i:I

    .line 12
    .line 13
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget v2, p1, Lr6/h;->i:I

    .line 18
    .line 19
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    sget-object v3, Ll8/c0;->c:Ll8/c0;

    .line 24
    .line 25
    invoke-virtual {v0, v1, v2, v3}, Ll8/A;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ll8/A;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget v1, p0, Lr6/h;->j:I

    .line 30
    .line 31
    iget v2, p1, Lr6/h;->j:I

    .line 32
    .line 33
    invoke-virtual {v0, v1, v2}, Ll8/A;->a(II)Ll8/A;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iget v2, p0, Lr6/h;->k:I

    .line 38
    .line 39
    iget v4, p1, Lr6/h;->k:I

    .line 40
    .line 41
    invoke-virtual {v0, v2, v4}, Ll8/A;->a(II)Ll8/A;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget-boolean v4, p0, Lr6/h;->g:Z

    .line 46
    .line 47
    iget-boolean v5, p1, Lr6/h;->g:Z

    .line 48
    .line 49
    invoke-virtual {v0, v4, v5}, Ll8/A;->c(ZZ)Ll8/A;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iget-boolean v4, p0, Lr6/h;->h:Z

    .line 54
    .line 55
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    iget-boolean v5, p1, Lr6/h;->h:Z

    .line 60
    .line 61
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    if-nez v1, :cond_0

    .line 66
    .line 67
    sget-object v3, Ll8/c0;->b:Ll8/c0;

    .line 68
    .line 69
    :cond_0
    invoke-virtual {v0, v4, v5, v3}, Ll8/A;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ll8/A;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iget v1, p0, Lr6/h;->l:I

    .line 74
    .line 75
    iget v3, p1, Lr6/h;->l:I

    .line 76
    .line 77
    invoke-virtual {v0, v1, v3}, Ll8/A;->a(II)Ll8/A;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    if-nez v2, :cond_1

    .line 82
    .line 83
    iget-boolean v1, p0, Lr6/h;->m:Z

    .line 84
    .line 85
    iget-boolean p1, p1, Lr6/h;->m:Z

    .line 86
    .line 87
    invoke-virtual {v0, v1, p1}, Ll8/A;->d(ZZ)Ll8/A;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    :cond_1
    invoke-virtual {v0}, Ll8/A;->e()I

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    return p1
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lr6/h;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lr6/h;->c(Lr6/h;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
