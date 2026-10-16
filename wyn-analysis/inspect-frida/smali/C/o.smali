.class public abstract LC/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LC/h;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LC/h;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2}, Llf/j;-><init>(ILjf/c;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, LC/o;->a:LC/h;

    .line 9
    .line 10
    return-void
.end method

.method public static final a(Lp0/s;Lp0/g;ZLlf/a;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p3, LC/i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, LC/i;

    .line 7
    .line 8
    iget v1, v0, LC/i;->e:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, LC/i;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LC/i;

    .line 21
    .line 22
    invoke-direct {v0, p3}, Llf/c;-><init>(Ljf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, LC/i;->d:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, LC/i;->e:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-boolean p0, v0, LC/i;->c:Z

    .line 37
    .line 38
    iget-object p1, v0, LC/i;->b:Lp0/g;

    .line 39
    .line 40
    iget-object p2, v0, LC/i;->a:Lp0/s;

    .line 41
    .line 42
    invoke-static {p3}, LFe/e;->U(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    move-object v9, p2

    .line 46
    move p2, p0

    .line 47
    move-object p0, v9

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p0

    .line 57
    :cond_2
    invoke-static {p3}, LFe/e;->U(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    :cond_3
    iput-object p0, v0, LC/i;->a:Lp0/s;

    .line 61
    .line 62
    iput-object p1, v0, LC/i;->b:Lp0/g;

    .line 63
    .line 64
    iput-boolean p2, v0, LC/i;->c:Z

    .line 65
    .line 66
    iput v3, v0, LC/i;->e:I

    .line 67
    .line 68
    invoke-virtual {p0, p1, v0}, Lp0/s;->e(Lp0/g;Llf/a;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p3

    .line 72
    if-ne p3, v1, :cond_4

    .line 73
    .line 74
    return-object v1

    .line 75
    :cond_4
    :goto_1
    check-cast p3, Lp0/f;

    .line 76
    .line 77
    iget-object v2, p3, Lp0/f;->a:Ljava/util/List;

    .line 78
    .line 79
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    const/4 v5, 0x0

    .line 84
    move v6, v5

    .line 85
    :goto_2
    if-ge v6, v4, :cond_8

    .line 86
    .line 87
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    check-cast v7, Lp0/k;

    .line 92
    .line 93
    if-eqz p2, :cond_6

    .line 94
    .line 95
    const-string v8, "<this>"

    .line 96
    .line 97
    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v7}, Lp0/k;->b()Z

    .line 101
    .line 102
    .line 103
    move-result v8

    .line 104
    if-nez v8, :cond_5

    .line 105
    .line 106
    iget-boolean v8, v7, Lp0/k;->g:Z

    .line 107
    .line 108
    if-nez v8, :cond_5

    .line 109
    .line 110
    iget-boolean v7, v7, Lp0/k;->d:Z

    .line 111
    .line 112
    if-eqz v7, :cond_5

    .line 113
    .line 114
    move v7, v3

    .line 115
    goto :goto_3

    .line 116
    :cond_5
    move v7, v5

    .line 117
    goto :goto_3

    .line 118
    :cond_6
    invoke-static {v7}, Landroid/support/v4/media/session/b;->N(Lp0/k;)Z

    .line 119
    .line 120
    .line 121
    move-result v7

    .line 122
    :goto_3
    if-nez v7, :cond_7

    .line 123
    .line 124
    move v2, v5

    .line 125
    goto :goto_4

    .line 126
    :cond_7
    add-int/lit8 v6, v6, 0x1

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_8
    move v2, v3

    .line 130
    :goto_4
    if-eqz v2, :cond_3

    .line 131
    .line 132
    iget-object p0, p3, Lp0/f;->a:Ljava/util/List;

    .line 133
    .line 134
    invoke-interface {p0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    return-object p0
.end method

.method public static final b(Lp0/s;Llf/a;)Ljava/lang/Object;
    .locals 13

    .line 1
    instance-of v0, p1, LC/n;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, LC/n;

    .line 7
    .line 8
    iget v1, v0, LC/n;->c:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, LC/n;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LC/n;

    .line 21
    .line 22
    invoke-direct {v0, p1}, Llf/c;-><init>(Ljf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, LC/n;->b:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, LC/n;->c:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x0

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    if-eq v2, v3, :cond_2

    .line 37
    .line 38
    if-ne v2, v4, :cond_1

    .line 39
    .line 40
    iget-object p0, v0, LC/n;->a:Lp0/s;

    .line 41
    .line 42
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_5

    .line 46
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p0

    .line 54
    :cond_2
    iget-object p0, v0, LC/n;->a:Lp0/s;

    .line 55
    .line 56
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    :cond_4
    sget-object p1, Lp0/g;->b:Lp0/g;

    .line 64
    .line 65
    iput-object p0, v0, LC/n;->a:Lp0/s;

    .line 66
    .line 67
    iput v3, v0, LC/n;->c:I

    .line 68
    .line 69
    invoke-virtual {p0, p1, v0}, Lp0/s;->e(Lp0/g;Llf/a;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    if-ne p1, v1, :cond_5

    .line 74
    .line 75
    goto :goto_4

    .line 76
    :cond_5
    :goto_1
    check-cast p1, Lp0/f;

    .line 77
    .line 78
    iget-object v2, p1, Lp0/f;->a:Ljava/util/List;

    .line 79
    .line 80
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    move v7, v5

    .line 85
    :goto_2
    iget-object v8, p1, Lp0/f;->a:Ljava/util/List;

    .line 86
    .line 87
    if-ge v7, v6, :cond_c

    .line 88
    .line 89
    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v9

    .line 93
    check-cast v9, Lp0/k;

    .line 94
    .line 95
    invoke-static {v9}, Landroid/support/v4/media/session/b;->O(Lp0/k;)Z

    .line 96
    .line 97
    .line 98
    move-result v9

    .line 99
    if-nez v9, :cond_b

    .line 100
    .line 101
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    move v2, v5

    .line 106
    :goto_3
    if-ge v2, p1, :cond_7

    .line 107
    .line 108
    invoke-interface {v8, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    check-cast v6, Lp0/k;

    .line 113
    .line 114
    invoke-virtual {v6}, Lp0/k;->b()Z

    .line 115
    .line 116
    .line 117
    move-result v7

    .line 118
    if-nez v7, :cond_9

    .line 119
    .line 120
    iget-object v7, p0, Lp0/s;->e:Lp0/t;

    .line 121
    .line 122
    iget-wide v9, v7, Lp0/t;->i:J

    .line 123
    .line 124
    invoke-virtual {p0}, Lp0/s;->h()J

    .line 125
    .line 126
    .line 127
    move-result-wide v11

    .line 128
    invoke-static {v6, v9, v10, v11, v12}, Landroid/support/v4/media/session/b;->k0(Lp0/k;JJ)Z

    .line 129
    .line 130
    .line 131
    move-result v6

    .line 132
    if-eqz v6, :cond_6

    .line 133
    .line 134
    goto :goto_7

    .line 135
    :cond_6
    add-int/lit8 v2, v2, 0x1

    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_7
    sget-object p1, Lp0/g;->c:Lp0/g;

    .line 139
    .line 140
    iput-object p0, v0, LC/n;->a:Lp0/s;

    .line 141
    .line 142
    iput v4, v0, LC/n;->c:I

    .line 143
    .line 144
    invoke-virtual {p0, p1, v0}, Lp0/s;->e(Lp0/g;Llf/a;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    if-ne p1, v1, :cond_8

    .line 149
    .line 150
    :goto_4
    return-object v1

    .line 151
    :cond_8
    :goto_5
    check-cast p1, Lp0/f;

    .line 152
    .line 153
    iget-object p1, p1, Lp0/f;->a:Ljava/util/List;

    .line 154
    .line 155
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    move v6, v5

    .line 160
    :goto_6
    if-ge v6, v2, :cond_4

    .line 161
    .line 162
    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v7

    .line 166
    check-cast v7, Lp0/k;

    .line 167
    .line 168
    invoke-virtual {v7}, Lp0/k;->b()Z

    .line 169
    .line 170
    .line 171
    move-result v7

    .line 172
    if-eqz v7, :cond_a

    .line 173
    .line 174
    :cond_9
    :goto_7
    const/4 p0, 0x0

    .line 175
    return-object p0

    .line 176
    :cond_a
    add-int/lit8 v6, v6, 0x1

    .line 177
    .line 178
    goto :goto_6

    .line 179
    :cond_b
    add-int/lit8 v7, v7, 0x1

    .line 180
    .line 181
    goto :goto_2

    .line 182
    :cond_c
    invoke-interface {v8, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    return-object p0
.end method
