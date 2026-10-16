.class public final Ln2/k;
.super Ln2/m;
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
.method public constructor <init>(ILN1/O;ILn2/i;ILjava/lang/String;)V
    .locals 5

    .line 1
    invoke-direct {p0, p1, p2, p3}, Ln2/m;-><init>(ILN1/O;I)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    invoke-static {p5, p1}, LR8/v;->c(IZ)Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    iput-boolean p2, p0, Ln2/k;->f:Z

    .line 10
    .line 11
    iget-object p2, p0, Ln2/m;->d:LN1/n;

    .line 12
    .line 13
    iget p2, p2, LN1/n;->e:I

    .line 14
    .line 15
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    const/4 p3, 0x1

    .line 19
    and-int/lit8 v0, p2, 0x1

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    move v0, p3

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v0, p1

    .line 26
    :goto_0
    iput-boolean v0, p0, Ln2/k;->g:Z

    .line 27
    .line 28
    and-int/lit8 p2, p2, 0x2

    .line 29
    .line 30
    if-eqz p2, :cond_1

    .line 31
    .line 32
    move p2, p3

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move p2, p1

    .line 35
    :goto_1
    iput-boolean p2, p0, Ln2/k;->h:Z

    .line 36
    .line 37
    iget-object p2, p4, LN1/T;->n:Ll8/e0;

    .line 38
    .line 39
    invoke-virtual {p2}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    const-string v0, ""

    .line 46
    .line 47
    invoke-static {v0}, Ll8/K;->n(Ljava/lang/Object;)Ll8/e0;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    goto :goto_2

    .line 52
    :cond_2
    move-object v0, p2

    .line 53
    :goto_2
    move v1, p1

    .line 54
    :goto_3
    iget v2, v0, Ll8/e0;->d:I

    .line 55
    .line 56
    const v3, 0x7fffffff

    .line 57
    .line 58
    .line 59
    if-ge v1, v2, :cond_4

    .line 60
    .line 61
    iget-object v2, p0, Ln2/m;->d:LN1/n;

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ll8/e0;->get(I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    check-cast v4, Ljava/lang/String;

    .line 68
    .line 69
    invoke-static {v2, v4, p1}, Ln2/o;->c(LN1/n;Ljava/lang/String;Z)I

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-lez v2, :cond_3

    .line 74
    .line 75
    goto :goto_4

    .line 76
    :cond_3
    add-int/2addr v1, p3

    .line 77
    goto :goto_3

    .line 78
    :cond_4
    move v2, p1

    .line 79
    move v1, v3

    .line 80
    :goto_4
    iput v1, p0, Ln2/k;->i:I

    .line 81
    .line 82
    iput v2, p0, Ln2/k;->j:I

    .line 83
    .line 84
    iget-object v0, p0, Ln2/m;->d:LN1/n;

    .line 85
    .line 86
    iget v0, v0, LN1/n;->f:I

    .line 87
    .line 88
    sget-object v1, Ln2/o;->j:Ll8/d0;

    .line 89
    .line 90
    iget v1, p4, LN1/T;->o:I

    .line 91
    .line 92
    if-eqz v0, :cond_5

    .line 93
    .line 94
    if-ne v0, v1, :cond_5

    .line 95
    .line 96
    goto :goto_5

    .line 97
    :cond_5
    and-int/2addr v0, v1

    .line 98
    invoke-static {v0}, Ljava/lang/Integer;->bitCount(I)I

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    :goto_5
    iput v3, p0, Ln2/k;->k:I

    .line 103
    .line 104
    iget-object v0, p0, Ln2/m;->d:LN1/n;

    .line 105
    .line 106
    iget v0, v0, LN1/n;->f:I

    .line 107
    .line 108
    and-int/lit16 v0, v0, 0x440

    .line 109
    .line 110
    if-eqz v0, :cond_6

    .line 111
    .line 112
    move v0, p3

    .line 113
    goto :goto_6

    .line 114
    :cond_6
    move v0, p1

    .line 115
    :goto_6
    iput-boolean v0, p0, Ln2/k;->m:Z

    .line 116
    .line 117
    invoke-static {p6}, Ln2/o;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    if-nez v0, :cond_7

    .line 122
    .line 123
    move v0, p3

    .line 124
    goto :goto_7

    .line 125
    :cond_7
    move v0, p1

    .line 126
    :goto_7
    iget-object v1, p0, Ln2/m;->d:LN1/n;

    .line 127
    .line 128
    invoke-static {v1, p6, v0}, Ln2/o;->c(LN1/n;Ljava/lang/String;Z)I

    .line 129
    .line 130
    .line 131
    move-result p6

    .line 132
    iput p6, p0, Ln2/k;->l:I

    .line 133
    .line 134
    if-gtz v2, :cond_a

    .line 135
    .line 136
    invoke-virtual {p2}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 137
    .line 138
    .line 139
    move-result p2

    .line 140
    if-eqz p2, :cond_8

    .line 141
    .line 142
    if-gtz v3, :cond_a

    .line 143
    .line 144
    :cond_8
    iget-boolean p2, p0, Ln2/k;->g:Z

    .line 145
    .line 146
    if-nez p2, :cond_a

    .line 147
    .line 148
    iget-boolean p2, p0, Ln2/k;->h:Z

    .line 149
    .line 150
    if-eqz p2, :cond_9

    .line 151
    .line 152
    if-lez p6, :cond_9

    .line 153
    .line 154
    goto :goto_8

    .line 155
    :cond_9
    move p2, p1

    .line 156
    goto :goto_9

    .line 157
    :cond_a
    :goto_8
    move p2, p3

    .line 158
    :goto_9
    iget-boolean p4, p4, Ln2/i;->w:Z

    .line 159
    .line 160
    invoke-static {p5, p4}, LR8/v;->c(IZ)Z

    .line 161
    .line 162
    .line 163
    move-result p4

    .line 164
    if-eqz p4, :cond_b

    .line 165
    .line 166
    if-eqz p2, :cond_b

    .line 167
    .line 168
    move p1, p3

    .line 169
    :cond_b
    iput p1, p0, Ln2/k;->e:I

    .line 170
    .line 171
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, Ln2/k;->e:I

    .line 2
    .line 3
    return v0
.end method

.method public final bridge synthetic b(Ln2/m;)Z
    .locals 0

    .line 1
    check-cast p1, Ln2/k;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return p1
.end method

.method public final c(Ln2/k;)I
    .locals 6

    .line 1
    sget-object v0, Ll8/A;->a:Ll8/y;

    .line 2
    .line 3
    iget-boolean v1, p1, Ln2/k;->f:Z

    .line 4
    .line 5
    iget-boolean v2, p0, Ln2/k;->f:Z

    .line 6
    .line 7
    invoke-virtual {v0, v2, v1}, Ll8/y;->c(ZZ)Ll8/A;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget v1, p0, Ln2/k;->i:I

    .line 12
    .line 13
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget v2, p1, Ln2/k;->i:I

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
    iget v1, p0, Ln2/k;->j:I

    .line 30
    .line 31
    iget v2, p1, Ln2/k;->j:I

    .line 32
    .line 33
    invoke-virtual {v0, v1, v2}, Ll8/A;->a(II)Ll8/A;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iget v2, p0, Ln2/k;->k:I

    .line 38
    .line 39
    iget v4, p1, Ln2/k;->k:I

    .line 40
    .line 41
    invoke-virtual {v0, v2, v4}, Ll8/A;->a(II)Ll8/A;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget-boolean v4, p0, Ln2/k;->g:Z

    .line 46
    .line 47
    iget-boolean v5, p1, Ln2/k;->g:Z

    .line 48
    .line 49
    invoke-virtual {v0, v4, v5}, Ll8/A;->c(ZZ)Ll8/A;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iget-boolean v4, p0, Ln2/k;->h:Z

    .line 54
    .line 55
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    iget-boolean v5, p1, Ln2/k;->h:Z

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
    iget v1, p0, Ln2/k;->l:I

    .line 74
    .line 75
    iget v3, p1, Ln2/k;->l:I

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
    iget-boolean v1, p0, Ln2/k;->m:Z

    .line 84
    .line 85
    iget-boolean p1, p1, Ln2/k;->m:Z

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
    check-cast p1, Ln2/k;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ln2/k;->c(Ln2/k;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
