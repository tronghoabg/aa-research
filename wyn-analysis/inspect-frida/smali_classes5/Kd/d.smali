.class public final LKd/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LLd/c;

.field public b:I

.field public c:I

.field public d:LKd/c;


# direct methods
.method public constructor <init>(LLd/c;)V
    .locals 1

    .line 1
    const-string v0, "builder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LKd/d;->a:LLd/c;

    .line 10
    .line 11
    sget-object p1, LKd/f;->b:LKd/e;

    .line 12
    .line 13
    invoke-virtual {p1}, LWd/c;->C()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, LKd/c;

    .line 18
    .line 19
    iput-object p1, p0, LKd/d;->d:LKd/c;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)LLd/b;
    .locals 4

    .line 1
    iget v0, p0, LKd/d;->b:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    sget v0, LLd/f;->a:I

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-static {p1, v1, v0}, LLd/f;->a(Ljava/lang/CharSequence;II)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iget v1, p0, LKd/d;->c:I

    .line 22
    .line 23
    rem-int/2addr v0, v1

    .line 24
    :goto_0
    iget-object v1, p0, LKd/d;->d:LKd/c;

    .line 25
    .line 26
    mul-int/lit8 v2, v0, 0x6

    .line 27
    .line 28
    invoke-virtual {v1, v2}, LKd/c;->a(I)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    const/4 v3, -0x1

    .line 33
    if-eq v1, v3, :cond_2

    .line 34
    .line 35
    invoke-virtual {p0, p1, v2}, LKd/d;->b(Ljava/lang/CharSequence;I)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    iget-object p1, p0, LKd/d;->d:LKd/c;

    .line 42
    .line 43
    add-int/lit8 v0, v2, 0x3

    .line 44
    .line 45
    invoke-virtual {p1, v0}, LKd/c;->a(I)I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    iget-object v0, p0, LKd/d;->d:LKd/c;

    .line 50
    .line 51
    add-int/lit8 v2, v2, 0x4

    .line 52
    .line 53
    invoke-virtual {v0, v2}, LKd/c;->a(I)I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    iget-object v1, p0, LKd/d;->a:LLd/c;

    .line 58
    .line 59
    invoke-virtual {v1, p1, v0}, LLd/c;->subSequence(II)Ljava/lang/CharSequence;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    check-cast p1, LLd/b;

    .line 64
    .line 65
    return-object p1

    .line 66
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 67
    .line 68
    iget v1, p0, LKd/d;->c:I

    .line 69
    .line 70
    rem-int/2addr v0, v1

    .line 71
    goto :goto_0

    .line 72
    :cond_2
    :goto_1
    const/4 p1, 0x0

    .line 73
    return-object p1
.end method

.method public final b(Ljava/lang/CharSequence;I)Z
    .locals 8

    .line 1
    iget-object v0, p0, LKd/d;->d:LKd/c;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    add-int/lit8 v2, p2, 0x1

    .line 5
    .line 6
    invoke-virtual {v0, v2}, LKd/c;->a(I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iget-object v2, p0, LKd/d;->d:LKd/c;

    .line 11
    .line 12
    add-int/lit8 p2, p2, 0x2

    .line 13
    .line 14
    invoke-virtual {v2, p2}, LKd/c;->a(I)I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    sget v2, LLd/f;->a:I

    .line 19
    .line 20
    iget-object v2, p0, LKd/d;->a:LLd/c;

    .line 21
    .line 22
    const-string v3, "<this>"

    .line 23
    .line 24
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    sub-int v3, p2, v0

    .line 28
    .line 29
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eq v3, v4, :cond_0

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_0
    move v3, v0

    .line 37
    :goto_0
    if-ge v3, p2, :cond_4

    .line 38
    .line 39
    invoke-virtual {v2, v3}, LLd/c;->charAt(I)C

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    const/16 v5, 0x5b

    .line 44
    .line 45
    const/16 v6, 0x41

    .line 46
    .line 47
    if-gt v6, v4, :cond_1

    .line 48
    .line 49
    if-ge v4, v5, :cond_1

    .line 50
    .line 51
    add-int/lit8 v4, v4, 0x20

    .line 52
    .line 53
    :cond_1
    sub-int v7, v3, v0

    .line 54
    .line 55
    invoke-interface {p1, v7}, Ljava/lang/CharSequence;->charAt(I)C

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    if-gt v6, v7, :cond_2

    .line 60
    .line 61
    if-ge v7, v5, :cond_2

    .line 62
    .line 63
    add-int/lit8 v7, v7, 0x20

    .line 64
    .line 65
    :cond_2
    if-eq v4, v7, :cond_3

    .line 66
    .line 67
    :goto_1
    const/4 p1, 0x0

    .line 68
    return p1

    .line 69
    :cond_3
    add-int/2addr v3, v1

    .line 70
    goto :goto_0

    .line 71
    :cond_4
    return v1
.end method

.method public final c(IIII)V
    .locals 8

    .line 1
    iget v0, p0, LKd/d;->b:I

    .line 2
    .line 3
    int-to-double v1, v0

    .line 4
    iget v3, p0, LKd/d;->c:I

    .line 5
    .line 6
    int-to-double v4, v3

    .line 7
    const-wide/high16 v6, 0x3fe8000000000000L    # 0.75

    .line 8
    .line 9
    mul-double/2addr v4, v6

    .line 10
    cmpl-double v1, v1, v4

    .line 11
    .line 12
    if-ltz v1, :cond_3

    .line 13
    .line 14
    iget-object v1, p0, LKd/d;->d:LKd/c;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    iput v2, p0, LKd/d;->b:I

    .line 18
    .line 19
    mul-int/lit8 v3, v3, 0x2

    .line 20
    .line 21
    or-int/lit16 v3, v3, 0x80

    .line 22
    .line 23
    iput v3, p0, LKd/d;->c:I

    .line 24
    .line 25
    sget-object v3, LKd/f;->b:LKd/e;

    .line 26
    .line 27
    invoke-virtual {v3}, LWd/c;->C()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, LKd/c;

    .line 32
    .line 33
    iget-object v4, v1, LKd/c;->a:Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    mul-int/lit8 v4, v4, 0x2

    .line 40
    .line 41
    or-int/lit8 v4, v4, 0x1

    .line 42
    .line 43
    :goto_0
    if-ge v2, v4, :cond_0

    .line 44
    .line 45
    iget-object v5, v3, LKd/c;->a:Ljava/util/ArrayList;

    .line 46
    .line 47
    sget-object v6, LKd/f;->a:LKd/e;

    .line 48
    .line 49
    invoke-virtual {v6}, LWd/c;->C()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    add-int/lit8 v2, v2, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    iput-object v3, p0, LKd/d;->d:LKd/c;

    .line 60
    .line 61
    new-instance v2, LKd/b;

    .line 62
    .line 63
    const/4 v3, 0x0

    .line 64
    invoke-direct {v2, v1, v3}, LKd/b;-><init>(LKd/c;Ljf/c;)V

    .line 65
    .line 66
    .line 67
    invoke-static {v2}, LS3/f;->x(Ltf/p;)LAf/l;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    :goto_1
    invoke-virtual {v2}, LAf/l;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-eqz v3, :cond_1

    .line 76
    .line 77
    invoke-virtual {v2}, LAf/l;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    check-cast v3, Ljava/lang/Number;

    .line 82
    .line 83
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    add-int/lit8 v4, v3, 0x1

    .line 88
    .line 89
    invoke-virtual {v1, v4}, LKd/c;->a(I)I

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    add-int/lit8 v5, v3, 0x2

    .line 94
    .line 95
    invoke-virtual {v1, v5}, LKd/c;->a(I)I

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    add-int/lit8 v6, v3, 0x3

    .line 100
    .line 101
    invoke-virtual {v1, v6}, LKd/c;->a(I)I

    .line 102
    .line 103
    .line 104
    move-result v6

    .line 105
    add-int/lit8 v3, v3, 0x4

    .line 106
    .line 107
    invoke-virtual {v1, v3}, LKd/c;->a(I)I

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    invoke-virtual {p0, v4, v5, v6, v3}, LKd/d;->c(IIII)V

    .line 112
    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_1
    sget-object v2, LKd/f;->b:LKd/e;

    .line 116
    .line 117
    invoke-virtual {v2, v1}, LWd/c;->S(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    iget v1, p0, LKd/d;->b:I

    .line 121
    .line 122
    if-ne v0, v1, :cond_2

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 126
    .line 127
    const-string p2, "Failed requirement."

    .line 128
    .line 129
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    throw p1

    .line 133
    :cond_3
    :goto_2
    iget-object v0, p0, LKd/d;->a:LLd/c;

    .line 134
    .line 135
    invoke-static {v0, p1, p2}, LLd/f;->a(Ljava/lang/CharSequence;II)I

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    invoke-virtual {v0, p1, p2}, LLd/c;->subSequence(II)Ljava/lang/CharSequence;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    iget v2, p0, LKd/d;->c:I

    .line 148
    .line 149
    rem-int v2, v1, v2

    .line 150
    .line 151
    const/4 v3, -0x1

    .line 152
    move v4, v3

    .line 153
    :goto_3
    iget-object v5, p0, LKd/d;->d:LKd/c;

    .line 154
    .line 155
    mul-int/lit8 v6, v2, 0x6

    .line 156
    .line 157
    invoke-virtual {v5, v6}, LKd/c;->a(I)I

    .line 158
    .line 159
    .line 160
    move-result v5

    .line 161
    if-eq v5, v3, :cond_5

    .line 162
    .line 163
    invoke-virtual {p0, v0, v6}, LKd/d;->b(Ljava/lang/CharSequence;I)Z

    .line 164
    .line 165
    .line 166
    move-result v5

    .line 167
    if-eqz v5, :cond_4

    .line 168
    .line 169
    move v4, v2

    .line 170
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 171
    .line 172
    iget v5, p0, LKd/d;->c:I

    .line 173
    .line 174
    rem-int/2addr v2, v5

    .line 175
    goto :goto_3

    .line 176
    :cond_5
    iget-object v0, p0, LKd/d;->d:LKd/c;

    .line 177
    .line 178
    invoke-virtual {v0, v6, v1}, LKd/c;->b(II)V

    .line 179
    .line 180
    .line 181
    iget-object v0, p0, LKd/d;->d:LKd/c;

    .line 182
    .line 183
    add-int/lit8 v1, v6, 0x1

    .line 184
    .line 185
    invoke-virtual {v0, v1, p1}, LKd/c;->b(II)V

    .line 186
    .line 187
    .line 188
    iget-object p1, p0, LKd/d;->d:LKd/c;

    .line 189
    .line 190
    add-int/lit8 v0, v6, 0x2

    .line 191
    .line 192
    invoke-virtual {p1, v0, p2}, LKd/c;->b(II)V

    .line 193
    .line 194
    .line 195
    iget-object p1, p0, LKd/d;->d:LKd/c;

    .line 196
    .line 197
    add-int/lit8 p2, v6, 0x3

    .line 198
    .line 199
    invoke-virtual {p1, p2, p3}, LKd/c;->b(II)V

    .line 200
    .line 201
    .line 202
    iget-object p1, p0, LKd/d;->d:LKd/c;

    .line 203
    .line 204
    add-int/lit8 p2, v6, 0x4

    .line 205
    .line 206
    invoke-virtual {p1, p2, p4}, LKd/c;->b(II)V

    .line 207
    .line 208
    .line 209
    iget-object p1, p0, LKd/d;->d:LKd/c;

    .line 210
    .line 211
    add-int/lit8 v6, v6, 0x5

    .line 212
    .line 213
    invoke-virtual {p1, v6, v3}, LKd/c;->b(II)V

    .line 214
    .line 215
    .line 216
    if-eq v4, v3, :cond_6

    .line 217
    .line 218
    iget-object p1, p0, LKd/d;->d:LKd/c;

    .line 219
    .line 220
    mul-int/lit8 v4, v4, 0x6

    .line 221
    .line 222
    add-int/lit8 v4, v4, 0x5

    .line 223
    .line 224
    invoke-virtual {p1, v4, v2}, LKd/c;->b(II)V

    .line 225
    .line 226
    .line 227
    :cond_6
    iget p1, p0, LKd/d;->b:I

    .line 228
    .line 229
    add-int/lit8 p1, p1, 0x1

    .line 230
    .line 231
    iput p1, p0, LKd/d;->b:I

    .line 232
    .line 233
    return-void
.end method

.method public final d()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, LKd/d;->b:I

    .line 3
    .line 4
    iput v0, p0, LKd/d;->c:I

    .line 5
    .line 6
    sget-object v0, LKd/f;->b:LKd/e;

    .line 7
    .line 8
    iget-object v1, p0, LKd/d;->d:LKd/c;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, LWd/c;->S(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, LWd/c;->C()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, LKd/c;

    .line 18
    .line 19
    iput-object v0, p0, LKd/d;->d:LKd/c;

    .line 20
    .line 21
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, LKd/f;->a:LKd/e;

    .line 7
    .line 8
    iget-object v1, p0, LKd/d;->d:LKd/c;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance v2, LKd/b;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-direct {v2, v1, v3}, LKd/b;-><init>(LKd/c;Ljf/c;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v2}, LS3/f;->x(Ltf/p;)LAf/l;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    :goto_0
    invoke-virtual {v1}, LAf/l;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    invoke-virtual {v1}, LAf/l;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Ljava/lang/Number;

    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    const-string v3, ""

    .line 40
    .line 41
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 42
    .line 43
    .line 44
    iget-object v3, p0, LKd/d;->d:LKd/c;

    .line 45
    .line 46
    add-int/lit8 v4, v2, 0x1

    .line 47
    .line 48
    invoke-virtual {v3, v4}, LKd/c;->a(I)I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    iget-object v4, p0, LKd/d;->d:LKd/c;

    .line 53
    .line 54
    add-int/lit8 v5, v2, 0x2

    .line 55
    .line 56
    invoke-virtual {v4, v5}, LKd/c;->a(I)I

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    iget-object v5, p0, LKd/d;->a:LLd/c;

    .line 61
    .line 62
    invoke-virtual {v5, v3, v4}, LLd/c;->subSequence(II)Ljava/lang/CharSequence;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 67
    .line 68
    .line 69
    const-string v3, " => "

    .line 70
    .line 71
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 72
    .line 73
    .line 74
    iget-object v3, p0, LKd/d;->d:LKd/c;

    .line 75
    .line 76
    add-int/lit8 v4, v2, 0x3

    .line 77
    .line 78
    invoke-virtual {v3, v4}, LKd/c;->a(I)I

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    iget-object v4, p0, LKd/d;->d:LKd/c;

    .line 83
    .line 84
    add-int/lit8 v2, v2, 0x4

    .line 85
    .line 86
    invoke-virtual {v4, v2}, LKd/c;->a(I)I

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    invoke-virtual {v5, v3, v2}, LLd/c;->subSequence(II)Ljava/lang/CharSequence;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    check-cast v2, LLd/b;

    .line 95
    .line 96
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 97
    .line 98
    .line 99
    const-string v2, "\n"

    .line 100
    .line 101
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 102
    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    return-object v0
.end method
