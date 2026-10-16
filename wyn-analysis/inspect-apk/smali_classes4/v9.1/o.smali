.class public final Lv9/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ls9/f;

.field public final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ls9/f;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv9/o;->a:Ls9/f;

    .line 5
    .line 6
    const-string v0, "projects"

    .line 7
    .line 8
    iget-object v1, p1, Ls9/f;->a:Ljava/lang/String;

    .line 9
    .line 10
    const-string v2, "databases"

    .line 11
    .line 12
    iget-object p1, p1, Ls9/f;->b:Ljava/lang/String;

    .line 13
    .line 14
    filled-new-array {v0, v1, v2, p1}, [Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    sget-object v0, Ls9/m;->b:Ls9/m;

    .line 23
    .line 24
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    sget-object p1, Ls9/m;->b:Ls9/m;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    new-instance v0, Ls9/m;

    .line 34
    .line 35
    invoke-direct {v0, p1}, Ls9/e;-><init>(Ljava/util/List;)V

    .line 36
    .line 37
    .line 38
    move-object p1, v0

    .line 39
    :goto_0
    invoke-virtual {p1}, Ls9/m;->c()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iput-object p1, p0, Lv9/o;->b:Ljava/lang/String;

    .line 44
    .line 45
    return-void
.end method

.method public static a(Lka/Z0;)Lp9/k;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-virtual {p0}, Lka/Z0;->h()Lka/Y0;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x2

    .line 12
    const/4 v4, 0x0

    .line 13
    if-eqz v2, :cond_6

    .line 14
    .line 15
    sget-object v5, Lp9/i;->e:Lp9/i;

    .line 16
    .line 17
    sget-object v6, Lp9/i;->d:Lp9/i;

    .line 18
    .line 19
    if-eq v2, v1, :cond_5

    .line 20
    .line 21
    if-ne v2, v3, :cond_4

    .line 22
    .line 23
    invoke-virtual {p0}, Lka/Z0;->i()Lka/g1;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, Lka/g1;->e()Lka/W0;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v2}, Lka/W0;->d()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-static {v2}, Ls9/j;->l(Ljava/lang/String;)Ls9/j;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {p0}, Lka/g1;->f()Lka/f1;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    if-eq v7, v1, :cond_3

    .line 48
    .line 49
    if-eq v7, v3, :cond_2

    .line 50
    .line 51
    const/4 v3, 0x3

    .line 52
    if-eq v7, v3, :cond_1

    .line 53
    .line 54
    const/4 v3, 0x4

    .line 55
    if-ne v7, v3, :cond_0

    .line 56
    .line 57
    sget-object p0, Ls9/p;->b:Lka/C1;

    .line 58
    .line 59
    invoke-static {v2, v5, p0}, Lp9/j;->e(Ls9/j;Lp9/i;Lka/C1;)Lp9/j;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0

    .line 64
    :cond_0
    invoke-virtual {p0}, Lka/g1;->f()Lka/f1;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    new-array v1, v1, [Ljava/lang/Object;

    .line 69
    .line 70
    aput-object p0, v1, v0

    .line 71
    .line 72
    const-string p0, "Unrecognized UnaryFilter.operator %d"

    .line 73
    .line 74
    invoke-static {p0, v1}, LA6/c;->s(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    throw v4

    .line 78
    :cond_1
    sget-object p0, Ls9/p;->a:Lka/C1;

    .line 79
    .line 80
    invoke-static {v2, v5, p0}, Lp9/j;->e(Ls9/j;Lp9/i;Lka/C1;)Lp9/j;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    return-object p0

    .line 85
    :cond_2
    sget-object p0, Ls9/p;->b:Lka/C1;

    .line 86
    .line 87
    invoke-static {v2, v6, p0}, Lp9/j;->e(Ls9/j;Lp9/i;Lka/C1;)Lp9/j;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    return-object p0

    .line 92
    :cond_3
    sget-object p0, Ls9/p;->a:Lka/C1;

    .line 93
    .line 94
    invoke-static {v2, v6, p0}, Lp9/j;->e(Ls9/j;Lp9/i;Lka/C1;)Lp9/j;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    return-object p0

    .line 99
    :cond_4
    invoke-virtual {p0}, Lka/Z0;->h()Lka/Y0;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    new-array v1, v1, [Ljava/lang/Object;

    .line 104
    .line 105
    aput-object p0, v1, v0

    .line 106
    .line 107
    const-string p0, "Unrecognized Filter.filterType %d"

    .line 108
    .line 109
    invoke-static {p0, v1}, LA6/c;->s(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    throw v4

    .line 113
    :cond_5
    invoke-virtual {p0}, Lka/Z0;->g()Lka/U0;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-virtual {p0}, Lka/U0;->f()Lka/W0;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    invoke-virtual {v2}, Lka/W0;->d()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    invoke-static {v2}, Ls9/j;->l(Ljava/lang/String;)Ls9/j;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    invoke-virtual {p0}, Lka/U0;->g()Lka/T0;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 134
    .line 135
    .line 136
    move-result v7

    .line 137
    packed-switch v7, :pswitch_data_0

    .line 138
    .line 139
    .line 140
    const-string p0, "Unhandled FieldFilter.operator %d"

    .line 141
    .line 142
    new-array v1, v1, [Ljava/lang/Object;

    .line 143
    .line 144
    aput-object v3, v1, v0

    .line 145
    .line 146
    invoke-static {p0, v1}, LA6/c;->s(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    throw v4

    .line 150
    :pswitch_0
    sget-object v5, Lp9/i;->k:Lp9/i;

    .line 151
    .line 152
    goto :goto_0

    .line 153
    :pswitch_1
    sget-object v5, Lp9/i;->i:Lp9/i;

    .line 154
    .line 155
    goto :goto_0

    .line 156
    :pswitch_2
    sget-object v5, Lp9/i;->j:Lp9/i;

    .line 157
    .line 158
    goto :goto_0

    .line 159
    :pswitch_3
    sget-object v5, Lp9/i;->h:Lp9/i;

    .line 160
    .line 161
    goto :goto_0

    .line 162
    :pswitch_4
    move-object v5, v6

    .line 163
    goto :goto_0

    .line 164
    :pswitch_5
    sget-object v5, Lp9/i;->g:Lp9/i;

    .line 165
    .line 166
    goto :goto_0

    .line 167
    :pswitch_6
    sget-object v5, Lp9/i;->f:Lp9/i;

    .line 168
    .line 169
    goto :goto_0

    .line 170
    :pswitch_7
    sget-object v5, Lp9/i;->c:Lp9/i;

    .line 171
    .line 172
    goto :goto_0

    .line 173
    :pswitch_8
    sget-object v5, Lp9/i;->b:Lp9/i;

    .line 174
    .line 175
    :goto_0
    :pswitch_9
    invoke-virtual {p0}, Lka/U0;->h()Lka/C1;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    invoke-static {v2, v5, p0}, Lp9/j;->e(Ls9/j;Lp9/i;Lka/C1;)Lp9/j;

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    return-object p0

    .line 184
    :cond_6
    invoke-virtual {p0}, Lka/Z0;->e()Lka/Q0;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    new-instance v2, Ljava/util/ArrayList;

    .line 189
    .line 190
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p0}, Lka/Q0;->e()Lcom/google/protobuf/Internal$ProtobufList;

    .line 194
    .line 195
    .line 196
    move-result-object v5

    .line 197
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 198
    .line 199
    .line 200
    move-result-object v5

    .line 201
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 202
    .line 203
    .line 204
    move-result v6

    .line 205
    if-eqz v6, :cond_7

    .line 206
    .line 207
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v6

    .line 211
    check-cast v6, Lka/Z0;

    .line 212
    .line 213
    invoke-static {v6}, Lv9/o;->a(Lka/Z0;)Lp9/k;

    .line 214
    .line 215
    .line 216
    move-result-object v6

    .line 217
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    goto :goto_1

    .line 221
    :cond_7
    new-instance v5, Lp9/d;

    .line 222
    .line 223
    invoke-virtual {p0}, Lka/Q0;->f()Lka/P0;

    .line 224
    .line 225
    .line 226
    move-result-object p0

    .line 227
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 228
    .line 229
    .line 230
    move-result p0

    .line 231
    if-eq p0, v1, :cond_9

    .line 232
    .line 233
    if-ne p0, v3, :cond_8

    .line 234
    .line 235
    move v1, v3

    .line 236
    goto :goto_2

    .line 237
    :cond_8
    new-array p0, v0, [Ljava/lang/Object;

    .line 238
    .line 239
    const-string v0, "Only AND and OR composite filter types are supported."

    .line 240
    .line 241
    invoke-static {v0, p0}, LA6/c;->s(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    throw v4

    .line 245
    :cond_9
    :goto_2
    invoke-direct {v5, v1, v2}, Lp9/d;-><init>(ILjava/util/List;)V

    .line 246
    .line 247
    .line 248
    return-object v5

    .line 249
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_9
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static d(Lka/Q1;Ls9/o;)Lt9/j;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lka/Q1;->d()Lcom/google/protobuf/Timestamp;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lv9/o;->f(Lcom/google/protobuf/Timestamp;)Ls9/o;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Ls9/o;->b:Ls9/o;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Ls9/o;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object p1, v0

    .line 19
    :goto_0
    invoke-virtual {p0}, Lka/Q1;->c()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    new-instance v1, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 26
    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    :goto_1
    if-ge v2, v0, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0, v2}, Lka/Q1;->b(I)Lka/C1;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    add-int/lit8 v2, v2, 0x1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    new-instance p0, Lt9/j;

    .line 42
    .line 43
    invoke-direct {p0, p1, v1}, Lt9/j;-><init>(Ls9/o;Ljava/util/ArrayList;)V

    .line 44
    .line 45
    .line 46
    return-object p0
.end method

.method public static e(Ljava/lang/String;Lka/h1;)Lp9/A;
    .locals 13

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-static {p0}, Ls9/m;->l(Ljava/lang/String;)Ls9/m;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Lv9/o;->n(Ls9/m;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const-string v3, "Tried to deserialize invalid key %s"

    .line 12
    .line 13
    new-array v4, v1, [Ljava/lang/Object;

    .line 14
    .line 15
    aput-object p0, v4, v0

    .line 16
    .line 17
    invoke-static {v2, v3, v4}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iget-object v2, p0, Ls9/e;->a:Ljava/util/List;

    .line 21
    .line 22
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const/4 v3, 0x4

    .line 27
    if-ne v2, v3, :cond_0

    .line 28
    .line 29
    sget-object p0, Ls9/m;->b:Ls9/m;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-static {p0}, Lv9/o;->m(Ls9/m;)Ls9/m;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    :goto_0
    invoke-virtual {p1}, Lka/h1;->k()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    const/4 v3, 0x0

    .line 41
    if-lez v2, :cond_3

    .line 42
    .line 43
    if-ne v2, v1, :cond_1

    .line 44
    .line 45
    move v2, v1

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    move v2, v0

    .line 48
    :goto_1
    const-string v4, "StructuredQuery.from with more than one collection is not supported."

    .line 49
    .line 50
    new-array v5, v0, [Ljava/lang/Object;

    .line 51
    .line 52
    invoke-static {v2, v4, v5}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Lka/h1;->j()Lka/N0;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {v2}, Lka/N0;->d()Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-eqz v4, :cond_2

    .line 64
    .line 65
    invoke-virtual {v2}, Lka/N0;->e()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    move-object v5, p0

    .line 70
    move-object v6, v2

    .line 71
    goto :goto_2

    .line 72
    :cond_2
    invoke-virtual {v2}, Lka/N0;->e()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-virtual {p0, v2}, Ls9/e;->a(Ljava/lang/String;)Ls9/e;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    check-cast p0, Ls9/m;

    .line 81
    .line 82
    :cond_3
    move-object v5, p0

    .line 83
    move-object v6, v3

    .line 84
    :goto_2
    invoke-virtual {p1}, Lka/h1;->t()Z

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    if-eqz p0, :cond_7

    .line 89
    .line 90
    invoke-virtual {p1}, Lka/h1;->p()Lka/Z0;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-static {p0}, Lv9/o;->a(Lka/Z0;)Lp9/k;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    instance-of v2, p0, Lp9/d;

    .line 99
    .line 100
    if-eqz v2, :cond_6

    .line 101
    .line 102
    move-object v2, p0

    .line 103
    check-cast v2, Lp9/d;

    .line 104
    .line 105
    iget-object v4, v2, Lp9/d;->a:Ljava/util/ArrayList;

    .line 106
    .line 107
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object v7

    .line 111
    :cond_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 112
    .line 113
    .line 114
    move-result v8

    .line 115
    if-eqz v8, :cond_5

    .line 116
    .line 117
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v8

    .line 121
    check-cast v8, Lp9/k;

    .line 122
    .line 123
    instance-of v8, v8, Lp9/d;

    .line 124
    .line 125
    if-eqz v8, :cond_4

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_5
    invoke-virtual {v2}, Lp9/d;->e()Z

    .line 129
    .line 130
    .line 131
    move-result v2

    .line 132
    if-eqz v2, :cond_6

    .line 133
    .line 134
    invoke-static {v4}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    goto :goto_4

    .line 139
    :cond_6
    :goto_3
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    :goto_4
    move-object v7, p0

    .line 144
    goto :goto_5

    .line 145
    :cond_7
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 146
    .line 147
    goto :goto_4

    .line 148
    :goto_5
    invoke-virtual {p1}, Lka/h1;->n()I

    .line 149
    .line 150
    .line 151
    move-result p0

    .line 152
    if-lez p0, :cond_b

    .line 153
    .line 154
    new-instance v2, Ljava/util/ArrayList;

    .line 155
    .line 156
    invoke-direct {v2, p0}, Ljava/util/ArrayList;-><init>(I)V

    .line 157
    .line 158
    .line 159
    move v4, v0

    .line 160
    :goto_6
    if-ge v4, p0, :cond_a

    .line 161
    .line 162
    invoke-virtual {p1, v4}, Lka/h1;->m(I)Lka/b1;

    .line 163
    .line 164
    .line 165
    move-result-object v8

    .line 166
    invoke-virtual {v8}, Lka/b1;->e()Lka/W0;

    .line 167
    .line 168
    .line 169
    move-result-object v9

    .line 170
    invoke-virtual {v9}, Lka/W0;->d()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v9

    .line 174
    invoke-static {v9}, Ls9/j;->l(Ljava/lang/String;)Ls9/j;

    .line 175
    .line 176
    .line 177
    move-result-object v9

    .line 178
    invoke-virtual {v8}, Lka/b1;->d()Lka/R0;

    .line 179
    .line 180
    .line 181
    move-result-object v10

    .line 182
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    .line 183
    .line 184
    .line 185
    move-result v10

    .line 186
    if-eq v10, v1, :cond_9

    .line 187
    .line 188
    const/4 v11, 0x2

    .line 189
    if-ne v10, v11, :cond_8

    .line 190
    .line 191
    goto :goto_7

    .line 192
    :cond_8
    invoke-virtual {v8}, Lka/b1;->d()Lka/R0;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    new-array p1, v1, [Ljava/lang/Object;

    .line 197
    .line 198
    aput-object p0, p1, v0

    .line 199
    .line 200
    const-string p0, "Unrecognized direction %d"

    .line 201
    .line 202
    invoke-static {p0, p1}, LA6/c;->s(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    throw v3

    .line 206
    :cond_9
    move v11, v1

    .line 207
    :goto_7
    new-instance v8, Lp9/t;

    .line 208
    .line 209
    invoke-direct {v8, v11, v9}, Lp9/t;-><init>(ILs9/j;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    add-int/2addr v4, v1

    .line 216
    goto :goto_6

    .line 217
    :cond_a
    :goto_8
    move-object v8, v2

    .line 218
    goto :goto_9

    .line 219
    :cond_b
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 220
    .line 221
    goto :goto_8

    .line 222
    :goto_9
    invoke-virtual {p1}, Lka/h1;->r()Z

    .line 223
    .line 224
    .line 225
    move-result p0

    .line 226
    if-eqz p0, :cond_c

    .line 227
    .line 228
    invoke-virtual {p1}, Lka/h1;->l()Lcom/google/protobuf/Int32Value;

    .line 229
    .line 230
    .line 231
    move-result-object p0

    .line 232
    invoke-virtual {p0}, Lcom/google/protobuf/Int32Value;->getValue()I

    .line 233
    .line 234
    .line 235
    move-result p0

    .line 236
    int-to-long v9, p0

    .line 237
    goto :goto_a

    .line 238
    :cond_c
    const-wide/16 v9, -0x1

    .line 239
    .line 240
    :goto_a
    invoke-virtual {p1}, Lka/h1;->s()Z

    .line 241
    .line 242
    .line 243
    move-result p0

    .line 244
    if-eqz p0, :cond_d

    .line 245
    .line 246
    new-instance p0, Lp9/c;

    .line 247
    .line 248
    invoke-virtual {p1}, Lka/h1;->o()Lka/D;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    invoke-virtual {v0}, Lka/D;->getValuesList()Ljava/util/List;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    invoke-virtual {p1}, Lka/h1;->o()Lka/D;

    .line 257
    .line 258
    .line 259
    move-result-object v2

    .line 260
    invoke-virtual {v2}, Lka/D;->d()Z

    .line 261
    .line 262
    .line 263
    move-result v2

    .line 264
    invoke-direct {p0, v0, v2}, Lp9/c;-><init>(Ljava/util/List;Z)V

    .line 265
    .line 266
    .line 267
    move-object v11, p0

    .line 268
    goto :goto_b

    .line 269
    :cond_d
    move-object v11, v3

    .line 270
    :goto_b
    invoke-virtual {p1}, Lka/h1;->q()Z

    .line 271
    .line 272
    .line 273
    move-result p0

    .line 274
    if-eqz p0, :cond_e

    .line 275
    .line 276
    new-instance v3, Lp9/c;

    .line 277
    .line 278
    invoke-virtual {p1}, Lka/h1;->i()Lka/D;

    .line 279
    .line 280
    .line 281
    move-result-object p0

    .line 282
    invoke-virtual {p0}, Lka/D;->getValuesList()Ljava/util/List;

    .line 283
    .line 284
    .line 285
    move-result-object p0

    .line 286
    invoke-virtual {p1}, Lka/h1;->i()Lka/D;

    .line 287
    .line 288
    .line 289
    move-result-object p1

    .line 290
    invoke-virtual {p1}, Lka/D;->d()Z

    .line 291
    .line 292
    .line 293
    move-result p1

    .line 294
    xor-int/2addr p1, v1

    .line 295
    invoke-direct {v3, p0, p1}, Lp9/c;-><init>(Ljava/util/List;Z)V

    .line 296
    .line 297
    .line 298
    :cond_e
    move-object v12, v3

    .line 299
    new-instance v4, Lp9/A;

    .line 300
    .line 301
    invoke-direct/range {v4 .. v12}, Lp9/A;-><init>(Ls9/m;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JLp9/c;Lp9/c;)V

    .line 302
    .line 303
    .line 304
    return-object v4
.end method

.method public static f(Lcom/google/protobuf/Timestamp;)Ls9/o;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/Timestamp;->getSeconds()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    cmp-long v0, v0, v2

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/google/protobuf/Timestamp;->getNanos()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    sget-object p0, Ls9/o;->b:Ls9/o;

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    new-instance v0, Ls9/o;

    .line 21
    .line 22
    new-instance v1, Ls8/q;

    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/google/protobuf/Timestamp;->getSeconds()J

    .line 25
    .line 26
    .line 27
    move-result-wide v2

    .line 28
    invoke-virtual {p0}, Lcom/google/protobuf/Timestamp;->getNanos()I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    invoke-direct {v1, v2, v3, p0}, Ls8/q;-><init>(JI)V

    .line 33
    .line 34
    .line 35
    invoke-direct {v0, v1}, Ls9/o;-><init>(Ls8/q;)V

    .line 36
    .line 37
    .line 38
    return-object v0
.end method

.method public static g(Lp9/k;)Lka/Z0;
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    instance-of v1, p0, Lp9/j;

    .line 3
    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    if-eqz v1, :cond_5

    .line 7
    .line 8
    check-cast p0, Lp9/j;

    .line 9
    .line 10
    iget-object v1, p0, Lp9/j;->a:Lp9/i;

    .line 11
    .line 12
    sget-object v4, Lp9/i;->d:Lp9/i;

    .line 13
    .line 14
    iget-object v5, p0, Lp9/j;->c:Ls9/j;

    .line 15
    .line 16
    iget-object p0, p0, Lp9/j;->b:Lka/C1;

    .line 17
    .line 18
    if-eq v1, v4, :cond_0

    .line 19
    .line 20
    sget-object v6, Lp9/i;->e:Lp9/i;

    .line 21
    .line 22
    if-ne v1, v6, :cond_4

    .line 23
    .line 24
    :cond_0
    invoke-static {}, Lka/g1;->g()Lka/e1;

    .line 25
    .line 26
    .line 27
    move-result-object v6

    .line 28
    invoke-static {}, Lka/W0;->e()Lka/V0;

    .line 29
    .line 30
    .line 31
    move-result-object v7

    .line 32
    invoke-virtual {v5}, Ls9/j;->c()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v8

    .line 36
    invoke-virtual {v7, v8}, Lka/V0;->a(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v7}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    check-cast v7, Lka/W0;

    .line 44
    .line 45
    invoke-virtual {v6, v7}, Lka/e1;->a(Lka/W0;)V

    .line 46
    .line 47
    .line 48
    sget-object v7, Ls9/p;->a:Lka/C1;

    .line 49
    .line 50
    if-eqz p0, :cond_2

    .line 51
    .line 52
    invoke-virtual {p0}, Lka/C1;->getDoubleValue()D

    .line 53
    .line 54
    .line 55
    move-result-wide v7

    .line 56
    invoke-static {v7, v8}, Ljava/lang/Double;->isNaN(D)Z

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    if-eqz v7, :cond_2

    .line 61
    .line 62
    if-ne v1, v4, :cond_1

    .line 63
    .line 64
    sget-object p0, Lka/f1;->c:Lka/f1;

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    sget-object p0, Lka/f1;->e:Lka/f1;

    .line 68
    .line 69
    :goto_0
    invoke-virtual {v6, p0}, Lka/e1;->b(Lka/f1;)V

    .line 70
    .line 71
    .line 72
    invoke-static {}, Lka/Z0;->j()Lka/X0;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-virtual {p0, v6}, Lka/X0;->c(Lka/e1;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    check-cast p0, Lka/Z0;

    .line 84
    .line 85
    return-object p0

    .line 86
    :cond_2
    if-eqz p0, :cond_4

    .line 87
    .line 88
    invoke-virtual {p0}, Lka/C1;->v()I

    .line 89
    .line 90
    .line 91
    move-result v7

    .line 92
    if-ne v7, v2, :cond_4

    .line 93
    .line 94
    if-ne v1, v4, :cond_3

    .line 95
    .line 96
    sget-object p0, Lka/f1;->d:Lka/f1;

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_3
    sget-object p0, Lka/f1;->f:Lka/f1;

    .line 100
    .line 101
    :goto_1
    invoke-virtual {v6, p0}, Lka/e1;->b(Lka/f1;)V

    .line 102
    .line 103
    .line 104
    invoke-static {}, Lka/Z0;->j()Lka/X0;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-virtual {p0, v6}, Lka/X0;->c(Lka/e1;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    check-cast p0, Lka/Z0;

    .line 116
    .line 117
    return-object p0

    .line 118
    :cond_4
    invoke-static {}, Lka/U0;->i()Lka/S0;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    invoke-static {}, Lka/W0;->e()Lka/V0;

    .line 123
    .line 124
    .line 125
    move-result-object v6

    .line 126
    invoke-virtual {v5}, Ls9/j;->c()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    invoke-virtual {v6, v5}, Lka/V0;->a(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v6}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 134
    .line 135
    .line 136
    move-result-object v5

    .line 137
    check-cast v5, Lka/W0;

    .line 138
    .line 139
    invoke-virtual {v4, v5}, Lka/S0;->a(Lka/W0;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 143
    .line 144
    .line 145
    move-result v5

    .line 146
    packed-switch v5, :pswitch_data_0

    .line 147
    .line 148
    .line 149
    const-string p0, "Unknown operator %d"

    .line 150
    .line 151
    new-array v2, v2, [Ljava/lang/Object;

    .line 152
    .line 153
    aput-object v1, v2, v0

    .line 154
    .line 155
    invoke-static {p0, v2}, LA6/c;->s(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    throw v3

    .line 159
    :pswitch_0
    sget-object v0, Lka/T0;->l:Lka/T0;

    .line 160
    .line 161
    goto :goto_2

    .line 162
    :pswitch_1
    sget-object v0, Lka/T0;->j:Lka/T0;

    .line 163
    .line 164
    goto :goto_2

    .line 165
    :pswitch_2
    sget-object v0, Lka/T0;->k:Lka/T0;

    .line 166
    .line 167
    goto :goto_2

    .line 168
    :pswitch_3
    sget-object v0, Lka/T0;->i:Lka/T0;

    .line 169
    .line 170
    goto :goto_2

    .line 171
    :pswitch_4
    sget-object v0, Lka/T0;->f:Lka/T0;

    .line 172
    .line 173
    goto :goto_2

    .line 174
    :pswitch_5
    sget-object v0, Lka/T0;->e:Lka/T0;

    .line 175
    .line 176
    goto :goto_2

    .line 177
    :pswitch_6
    sget-object v0, Lka/T0;->h:Lka/T0;

    .line 178
    .line 179
    goto :goto_2

    .line 180
    :pswitch_7
    sget-object v0, Lka/T0;->g:Lka/T0;

    .line 181
    .line 182
    goto :goto_2

    .line 183
    :pswitch_8
    sget-object v0, Lka/T0;->d:Lka/T0;

    .line 184
    .line 185
    goto :goto_2

    .line 186
    :pswitch_9
    sget-object v0, Lka/T0;->c:Lka/T0;

    .line 187
    .line 188
    :goto_2
    invoke-virtual {v4, v0}, Lka/S0;->b(Lka/T0;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v4, p0}, Lka/S0;->c(Lka/C1;)V

    .line 192
    .line 193
    .line 194
    invoke-static {}, Lka/Z0;->j()Lka/X0;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    invoke-virtual {p0, v4}, Lka/X0;->b(Lka/S0;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 202
    .line 203
    .line 204
    move-result-object p0

    .line 205
    check-cast p0, Lka/Z0;

    .line 206
    .line 207
    return-object p0

    .line 208
    :cond_5
    instance-of v1, p0, Lp9/d;

    .line 209
    .line 210
    if-eqz v1, :cond_a

    .line 211
    .line 212
    check-cast p0, Lp9/d;

    .line 213
    .line 214
    new-instance v1, Ljava/util/ArrayList;

    .line 215
    .line 216
    iget-object v4, p0, Lp9/d;->a:Ljava/util/ArrayList;

    .line 217
    .line 218
    invoke-static {v4}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 219
    .line 220
    .line 221
    move-result-object v4

    .line 222
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 223
    .line 224
    .line 225
    move-result v4

    .line 226
    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 227
    .line 228
    .line 229
    iget-object v4, p0, Lp9/d;->a:Ljava/util/ArrayList;

    .line 230
    .line 231
    invoke-static {v4}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 232
    .line 233
    .line 234
    move-result-object v4

    .line 235
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 236
    .line 237
    .line 238
    move-result-object v4

    .line 239
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 240
    .line 241
    .line 242
    move-result v5

    .line 243
    if-eqz v5, :cond_6

    .line 244
    .line 245
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v5

    .line 249
    check-cast v5, Lp9/k;

    .line 250
    .line 251
    invoke-static {v5}, Lv9/o;->g(Lp9/k;)Lka/Z0;

    .line 252
    .line 253
    .line 254
    move-result-object v5

    .line 255
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    goto :goto_3

    .line 259
    :cond_6
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 260
    .line 261
    .line 262
    move-result v4

    .line 263
    if-ne v4, v2, :cond_7

    .line 264
    .line 265
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object p0

    .line 269
    check-cast p0, Lka/Z0;

    .line 270
    .line 271
    return-object p0

    .line 272
    :cond_7
    invoke-static {}, Lka/Q0;->g()Lka/O0;

    .line 273
    .line 274
    .line 275
    move-result-object v4

    .line 276
    iget p0, p0, Lp9/d;->b:I

    .line 277
    .line 278
    invoke-static {p0}, LA/f;->f(I)I

    .line 279
    .line 280
    .line 281
    move-result p0

    .line 282
    if-eqz p0, :cond_9

    .line 283
    .line 284
    if-ne p0, v2, :cond_8

    .line 285
    .line 286
    sget-object p0, Lka/P0;->d:Lka/P0;

    .line 287
    .line 288
    goto :goto_4

    .line 289
    :cond_8
    new-array p0, v0, [Ljava/lang/Object;

    .line 290
    .line 291
    const-string v0, "Unrecognized composite filter type."

    .line 292
    .line 293
    invoke-static {v0, p0}, LA6/c;->s(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 294
    .line 295
    .line 296
    throw v3

    .line 297
    :cond_9
    sget-object p0, Lka/P0;->c:Lka/P0;

    .line 298
    .line 299
    :goto_4
    invoke-virtual {v4, p0}, Lka/O0;->b(Lka/P0;)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v4, v1}, Lka/O0;->a(Ljava/util/ArrayList;)V

    .line 303
    .line 304
    .line 305
    invoke-static {}, Lka/Z0;->j()Lka/X0;

    .line 306
    .line 307
    .line 308
    move-result-object p0

    .line 309
    invoke-virtual {p0, v4}, Lka/X0;->a(Lka/O0;)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 313
    .line 314
    .line 315
    move-result-object p0

    .line 316
    check-cast p0, Lka/Z0;

    .line 317
    .line 318
    return-object p0

    .line 319
    :cond_a
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object p0

    .line 323
    new-array v1, v2, [Ljava/lang/Object;

    .line 324
    .line 325
    aput-object p0, v1, v0

    .line 326
    .line 327
    const-string p0, "Unrecognized filter type %s"

    .line 328
    .line 329
    invoke-static {p0, v1}, LA6/c;->s(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 330
    .line 331
    .line 332
    throw v3

    .line 333
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static k(Ls9/f;Ls9/m;)Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, "projects"

    .line 2
    .line 3
    iget-object v1, p0, Ls9/f;->a:Ljava/lang/String;

    .line 4
    .line 5
    const-string v2, "databases"

    .line 6
    .line 7
    iget-object p0, p0, Ls9/f;->b:Ljava/lang/String;

    .line 8
    .line 9
    filled-new-array {v0, v1, v2, p0}, [Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    sget-object v0, Ls9/m;->b:Ls9/m;

    .line 18
    .line 19
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    sget-object p0, Ls9/m;->b:Ls9/m;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v0, Ls9/m;

    .line 29
    .line 30
    invoke-direct {v0, p0}, Ls9/e;-><init>(Ljava/util/List;)V

    .line 31
    .line 32
    .line 33
    move-object p0, v0

    .line 34
    :goto_0
    const-string v0, "documents"

    .line 35
    .line 36
    invoke-virtual {p0, v0}, Ls9/e;->a(Ljava/lang/String;)Ls9/e;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, Ls9/m;

    .line 41
    .line 42
    invoke-virtual {p0, p1}, Ls9/e;->b(Ls9/e;)Ls9/e;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    check-cast p0, Ls9/m;

    .line 47
    .line 48
    invoke-virtual {p0}, Ls9/m;->c()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0
.end method

.method public static l(Ls8/q;)Lcom/google/protobuf/Timestamp;
    .locals 3

    .line 1
    invoke-static {}, Lcom/google/protobuf/Timestamp;->newBuilder()Lcom/google/protobuf/Timestamp$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-wide v1, p0, Ls8/q;->a:J

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/Timestamp$Builder;->setSeconds(J)Lcom/google/protobuf/Timestamp$Builder;

    .line 8
    .line 9
    .line 10
    iget p0, p0, Ls8/q;->b:I

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Lcom/google/protobuf/Timestamp$Builder;->setNanos(I)Lcom/google/protobuf/Timestamp$Builder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Lcom/google/protobuf/Timestamp;

    .line 20
    .line 21
    return-object p0
.end method

.method public static m(Ls9/m;)Ls9/m;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    iget-object v2, p0, Ls9/e;->a:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x4

    .line 10
    if-le v2, v3, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, v3}, Ls9/e;->g(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    const-string v3, "documents"

    .line 17
    .line 18
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    move v2, v1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move v2, v0

    .line 27
    :goto_0
    const-string v3, "Tried to deserialize invalid key %s"

    .line 28
    .line 29
    new-array v1, v1, [Ljava/lang/Object;

    .line 30
    .line 31
    aput-object p0, v1, v0

    .line 32
    .line 33
    invoke-static {v2, v3, v1}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Ls9/e;->j()Ls9/e;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, Ls9/m;

    .line 41
    .line 42
    return-object p0
.end method

.method public static n(Ls9/m;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Ls9/e;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x4

    .line 8
    const/4 v2, 0x0

    .line 9
    if-lt v0, v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, v2}, Ls9/e;->g(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "projects"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    const/4 v0, 0x2

    .line 24
    invoke-virtual {p0, v0}, Ls9/e;->g(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    const-string v0, "databases"

    .line 29
    .line 30
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-eqz p0, :cond_0

    .line 35
    .line 36
    const/4 p0, 0x1

    .line 37
    return p0

    .line 38
    :cond_0
    return v2
.end method


# virtual methods
.method public final b(Ljava/lang/String;)Ls9/h;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-static {p1}, Ls9/m;->l(Ljava/lang/String;)Ls9/m;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, Lv9/o;->n(Ls9/m;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const-string v3, "Tried to deserialize invalid key %s"

    .line 12
    .line 13
    new-array v4, v1, [Ljava/lang/Object;

    .line 14
    .line 15
    aput-object p1, v4, v0

    .line 16
    .line 17
    invoke-static {v2, v3, v4}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v1}, Ls9/e;->g(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iget-object v2, p0, Lv9/o;->a:Ls9/f;

    .line 25
    .line 26
    iget-object v3, v2, Ls9/f;->a:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    new-array v3, v0, [Ljava/lang/Object;

    .line 33
    .line 34
    const-string v4, "Tried to deserialize key from different project."

    .line 35
    .line 36
    invoke-static {v1, v4, v3}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    const/4 v1, 0x3

    .line 40
    invoke-virtual {p1, v1}, Ls9/e;->g(I)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    iget-object v2, v2, Ls9/f;->b:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    const-string v2, "Tried to deserialize key from different database."

    .line 51
    .line 52
    new-array v0, v0, [Ljava/lang/Object;

    .line 53
    .line 54
    invoke-static {v1, v2, v0}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    invoke-static {p1}, Lv9/o;->m(Ls9/m;)Ls9/m;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    new-instance v0, Ls9/h;

    .line 62
    .line 63
    invoke-direct {v0, p1}, Ls9/h;-><init>(Ls9/m;)V

    .line 64
    .line 65
    .line 66
    return-object v0
.end method

.method public final c(Lka/G1;)Lt9/h;
    .locals 11

    .line 1
    invoke-virtual {p1}, Lka/G1;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x2

    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    if-eqz v0, :cond_3

    .line 10
    .line 11
    invoke-virtual {p1}, Lka/G1;->h()Lka/s0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Lka/s0;->d()I

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    invoke-static {v5}, LA/f;->f(I)I

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    if-eqz v5, :cond_2

    .line 24
    .line 25
    if-eq v5, v4, :cond_1

    .line 26
    .line 27
    if-ne v5, v2, :cond_0

    .line 28
    .line 29
    sget-object v0, Lt9/m;->c:Lt9/m;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    new-array p1, v3, [Ljava/lang/Object;

    .line 33
    .line 34
    const-string v0, "Unknown precondition"

    .line 35
    .line 36
    invoke-static {v0, p1}, LA6/c;->s(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    throw v1

    .line 40
    :cond_1
    invoke-virtual {v0}, Lka/s0;->g()Lcom/google/protobuf/Timestamp;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {v0}, Lv9/o;->f(Lcom/google/protobuf/Timestamp;)Ls9/o;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    new-instance v5, Lt9/m;

    .line 49
    .line 50
    invoke-direct {v5, v0, v1}, Lt9/m;-><init>(Ls9/o;Ljava/lang/Boolean;)V

    .line 51
    .line 52
    .line 53
    move-object v0, v5

    .line 54
    goto :goto_0

    .line 55
    :cond_2
    invoke-virtual {v0}, Lka/s0;->f()Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    invoke-static {v0}, Lt9/m;->a(Z)Lt9/m;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    :goto_0
    move-object v9, v0

    .line 64
    goto :goto_1

    .line 65
    :cond_3
    sget-object v0, Lt9/m;->c:Lt9/m;

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :goto_1
    new-instance v10, Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1}, Lka/G1;->n()Lcom/google/protobuf/Internal$ProtobufList;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    if-eqz v5, :cond_9

    .line 86
    .line 87
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    check-cast v5, Lka/Z;

    .line 92
    .line 93
    invoke-virtual {v5}, Lka/Z;->l()I

    .line 94
    .line 95
    .line 96
    move-result v6

    .line 97
    invoke-static {v6}, LA/f;->f(I)I

    .line 98
    .line 99
    .line 100
    move-result v6

    .line 101
    if-eqz v6, :cond_7

    .line 102
    .line 103
    if-eq v6, v4, :cond_6

    .line 104
    .line 105
    const/4 v7, 0x4

    .line 106
    if-eq v6, v7, :cond_5

    .line 107
    .line 108
    const/4 v7, 0x5

    .line 109
    if-ne v6, v7, :cond_4

    .line 110
    .line 111
    new-instance v6, Lt9/g;

    .line 112
    .line 113
    invoke-virtual {v5}, Lka/Z;->h()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v7

    .line 117
    invoke-static {v7}, Ls9/j;->l(Ljava/lang/String;)Ls9/j;

    .line 118
    .line 119
    .line 120
    move-result-object v7

    .line 121
    new-instance v8, Lt9/a;

    .line 122
    .line 123
    invoke-virtual {v5}, Lka/Z;->j()Lka/g;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    invoke-virtual {v5}, Lka/g;->getValuesList()Ljava/util/List;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    invoke-direct {v8, v5}, Lt9/c;-><init>(Ljava/util/List;)V

    .line 132
    .line 133
    .line 134
    invoke-direct {v6, v7, v8}, Lt9/g;-><init>(Ls9/j;Lt9/p;)V

    .line 135
    .line 136
    .line 137
    goto :goto_4

    .line 138
    :cond_4
    const-string p1, "Unknown FieldTransform proto: %s"

    .line 139
    .line 140
    new-array v0, v4, [Ljava/lang/Object;

    .line 141
    .line 142
    aput-object v5, v0, v3

    .line 143
    .line 144
    invoke-static {p1, v0}, LA6/c;->s(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    throw v1

    .line 148
    :cond_5
    new-instance v6, Lt9/g;

    .line 149
    .line 150
    invoke-virtual {v5}, Lka/Z;->h()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v7

    .line 154
    invoke-static {v7}, Ls9/j;->l(Ljava/lang/String;)Ls9/j;

    .line 155
    .line 156
    .line 157
    move-result-object v7

    .line 158
    new-instance v8, Lt9/b;

    .line 159
    .line 160
    invoke-virtual {v5}, Lka/Z;->g()Lka/g;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    invoke-virtual {v5}, Lka/g;->getValuesList()Ljava/util/List;

    .line 165
    .line 166
    .line 167
    move-result-object v5

    .line 168
    invoke-direct {v8, v5}, Lt9/c;-><init>(Ljava/util/List;)V

    .line 169
    .line 170
    .line 171
    invoke-direct {v6, v7, v8}, Lt9/g;-><init>(Ls9/j;Lt9/p;)V

    .line 172
    .line 173
    .line 174
    goto :goto_4

    .line 175
    :cond_6
    new-instance v6, Lt9/g;

    .line 176
    .line 177
    invoke-virtual {v5}, Lka/Z;->h()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v7

    .line 181
    invoke-static {v7}, Ls9/j;->l(Ljava/lang/String;)Ls9/j;

    .line 182
    .line 183
    .line 184
    move-result-object v7

    .line 185
    new-instance v8, Lt9/k;

    .line 186
    .line 187
    invoke-virtual {v5}, Lka/Z;->i()Lka/C1;

    .line 188
    .line 189
    .line 190
    move-result-object v5

    .line 191
    invoke-direct {v8, v5}, Lt9/k;-><init>(Lka/C1;)V

    .line 192
    .line 193
    .line 194
    invoke-direct {v6, v7, v8}, Lt9/g;-><init>(Ls9/j;Lt9/p;)V

    .line 195
    .line 196
    .line 197
    goto :goto_4

    .line 198
    :cond_7
    invoke-virtual {v5}, Lka/Z;->k()Lka/Y;

    .line 199
    .line 200
    .line 201
    move-result-object v6

    .line 202
    sget-object v7, Lka/Y;->c:Lka/Y;

    .line 203
    .line 204
    if-ne v6, v7, :cond_8

    .line 205
    .line 206
    move v6, v4

    .line 207
    goto :goto_3

    .line 208
    :cond_8
    move v6, v3

    .line 209
    :goto_3
    invoke-virtual {v5}, Lka/Z;->k()Lka/Y;

    .line 210
    .line 211
    .line 212
    move-result-object v7

    .line 213
    new-array v8, v4, [Ljava/lang/Object;

    .line 214
    .line 215
    aput-object v7, v8, v3

    .line 216
    .line 217
    const-string v7, "Unknown transform setToServerValue: %s"

    .line 218
    .line 219
    invoke-static {v6, v7, v8}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    new-instance v6, Lt9/g;

    .line 223
    .line 224
    invoke-virtual {v5}, Lka/Z;->h()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v5

    .line 228
    invoke-static {v5}, Ls9/j;->l(Ljava/lang/String;)Ls9/j;

    .line 229
    .line 230
    .line 231
    move-result-object v5

    .line 232
    sget-object v7, Lt9/n;->a:Lt9/n;

    .line 233
    .line 234
    invoke-direct {v6, v5, v7}, Lt9/g;-><init>(Ls9/j;Lt9/p;)V

    .line 235
    .line 236
    .line 237
    :goto_4
    invoke-virtual {v10, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    goto/16 :goto_2

    .line 241
    .line 242
    :cond_9
    invoke-virtual {p1}, Lka/G1;->j()Lka/F1;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 247
    .line 248
    .line 249
    move-result v0

    .line 250
    if-eqz v0, :cond_c

    .line 251
    .line 252
    if-eq v0, v4, :cond_b

    .line 253
    .line 254
    if-ne v0, v2, :cond_a

    .line 255
    .line 256
    new-instance v0, Lt9/q;

    .line 257
    .line 258
    invoke-virtual {p1}, Lka/G1;->o()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object p1

    .line 262
    invoke-virtual {p0, p1}, Lv9/o;->b(Ljava/lang/String;)Ls9/h;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    invoke-direct {v0, p1, v9}, Lt9/h;-><init>(Ls9/h;Lt9/m;)V

    .line 267
    .line 268
    .line 269
    return-object v0

    .line 270
    :cond_a
    invoke-virtual {p1}, Lka/G1;->j()Lka/F1;

    .line 271
    .line 272
    .line 273
    move-result-object p1

    .line 274
    new-array v0, v4, [Ljava/lang/Object;

    .line 275
    .line 276
    aput-object p1, v0, v3

    .line 277
    .line 278
    const-string p1, "Unknown mutation operation: %d"

    .line 279
    .line 280
    invoke-static {p1, v0}, LA6/c;->s(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    throw v1

    .line 284
    :cond_b
    new-instance v0, Lt9/e;

    .line 285
    .line 286
    invoke-virtual {p1}, Lka/G1;->i()Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object p1

    .line 290
    invoke-virtual {p0, p1}, Lv9/o;->b(Ljava/lang/String;)Ls9/h;

    .line 291
    .line 292
    .line 293
    move-result-object p1

    .line 294
    invoke-direct {v0, p1, v9}, Lt9/h;-><init>(Ls9/h;Lt9/m;)V

    .line 295
    .line 296
    .line 297
    return-object v0

    .line 298
    :cond_c
    invoke-virtual {p1}, Lka/G1;->s()Z

    .line 299
    .line 300
    .line 301
    move-result v0

    .line 302
    if-eqz v0, :cond_e

    .line 303
    .line 304
    new-instance v5, Lt9/l;

    .line 305
    .line 306
    invoke-virtual {p1}, Lka/G1;->l()Lka/H;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    invoke-virtual {v0}, Lka/H;->getName()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    invoke-virtual {p0, v0}, Lv9/o;->b(Ljava/lang/String;)Ls9/h;

    .line 315
    .line 316
    .line 317
    move-result-object v6

    .line 318
    invoke-virtual {p1}, Lka/G1;->l()Lka/H;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    invoke-virtual {v0}, Lka/H;->getFieldsMap()Ljava/util/Map;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    invoke-static {v0}, Ls9/l;->e(Ljava/util/Map;)Ls9/l;

    .line 327
    .line 328
    .line 329
    move-result-object v7

    .line 330
    invoke-virtual {p1}, Lka/G1;->m()Lka/Q;

    .line 331
    .line 332
    .line 333
    move-result-object p1

    .line 334
    invoke-virtual {p1}, Lka/Q;->e()I

    .line 335
    .line 336
    .line 337
    move-result v0

    .line 338
    new-instance v1, Ljava/util/HashSet;

    .line 339
    .line 340
    invoke-direct {v1, v0}, Ljava/util/HashSet;-><init>(I)V

    .line 341
    .line 342
    .line 343
    :goto_5
    if-ge v3, v0, :cond_d

    .line 344
    .line 345
    invoke-virtual {p1, v3}, Lka/Q;->d(I)Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v2

    .line 349
    invoke-static {v2}, Ls9/j;->l(Ljava/lang/String;)Ls9/j;

    .line 350
    .line 351
    .line 352
    move-result-object v2

    .line 353
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 354
    .line 355
    .line 356
    add-int/2addr v3, v4

    .line 357
    goto :goto_5

    .line 358
    :cond_d
    new-instance v8, Lt9/f;

    .line 359
    .line 360
    invoke-direct {v8, v1}, Lt9/f;-><init>(Ljava/util/HashSet;)V

    .line 361
    .line 362
    .line 363
    invoke-direct/range {v5 .. v10}, Lt9/l;-><init>(Ls9/h;Ls9/l;Lt9/f;Lt9/m;Ljava/util/List;)V

    .line 364
    .line 365
    .line 366
    return-object v5

    .line 367
    :cond_e
    new-instance v0, Lt9/o;

    .line 368
    .line 369
    invoke-virtual {p1}, Lka/G1;->l()Lka/H;

    .line 370
    .line 371
    .line 372
    move-result-object v1

    .line 373
    invoke-virtual {v1}, Lka/H;->getName()Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object v1

    .line 377
    invoke-virtual {p0, v1}, Lv9/o;->b(Ljava/lang/String;)Ls9/h;

    .line 378
    .line 379
    .line 380
    move-result-object v1

    .line 381
    invoke-virtual {p1}, Lka/G1;->l()Lka/H;

    .line 382
    .line 383
    .line 384
    move-result-object p1

    .line 385
    invoke-virtual {p1}, Lka/H;->getFieldsMap()Ljava/util/Map;

    .line 386
    .line 387
    .line 388
    move-result-object p1

    .line 389
    invoke-static {p1}, Ls9/l;->e(Ljava/util/Map;)Ls9/l;

    .line 390
    .line 391
    .line 392
    move-result-object p1

    .line 393
    invoke-direct {v0, v1, p1, v9, v10}, Lt9/o;-><init>(Ls9/h;Ls9/l;Lt9/m;Ljava/util/List;)V

    .line 394
    .line 395
    .line 396
    return-object v0
.end method

.method public final h(Ls9/h;)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object p1, p1, Ls9/h;->a:Ls9/m;

    .line 2
    .line 3
    iget-object v0, p0, Lv9/o;->a:Ls9/f;

    .line 4
    .line 5
    invoke-static {v0, p1}, Lv9/o;->k(Ls9/f;Ls9/m;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public final i(Lt9/h;)Lka/G1;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-static {}, Lka/G1;->t()Lka/E1;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    instance-of v3, p1, Lt9/o;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-eqz v3, :cond_0

    .line 11
    .line 12
    iget-object v3, p1, Lt9/h;->a:Ls9/h;

    .line 13
    .line 14
    move-object v5, p1

    .line 15
    check-cast v5, Lt9/o;

    .line 16
    .line 17
    iget-object v5, v5, Lt9/o;->d:Ls9/l;

    .line 18
    .line 19
    invoke-static {}, Lka/H;->g()Lka/F;

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    invoke-virtual {p0, v3}, Lv9/o;->h(Ls9/h;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v6, v3}, Lka/F;->b(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v5}, Ls9/l;->b()Lka/C1;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {v3}, Lka/C1;->s()Lka/p0;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {v3}, Lka/p0;->getFieldsMap()Ljava/util/Map;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-virtual {v6, v3}, Lka/F;->a(Ljava/util/Map;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v6}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    check-cast v3, Lka/H;

    .line 50
    .line 51
    invoke-virtual {v2, v3}, Lka/E1;->d(Lka/H;)V

    .line 52
    .line 53
    .line 54
    goto/16 :goto_1

    .line 55
    .line 56
    :cond_0
    instance-of v3, p1, Lt9/l;

    .line 57
    .line 58
    if-eqz v3, :cond_2

    .line 59
    .line 60
    iget-object v3, p1, Lt9/h;->a:Ls9/h;

    .line 61
    .line 62
    move-object v5, p1

    .line 63
    check-cast v5, Lt9/l;

    .line 64
    .line 65
    iget-object v5, v5, Lt9/l;->d:Ls9/l;

    .line 66
    .line 67
    invoke-static {}, Lka/H;->g()Lka/F;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    invoke-virtual {p0, v3}, Lv9/o;->h(Ls9/h;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-virtual {v6, v3}, Lka/F;->b(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v5}, Ls9/l;->b()Lka/C1;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    invoke-virtual {v3}, Lka/C1;->s()Lka/p0;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    invoke-virtual {v3}, Lka/p0;->getFieldsMap()Ljava/util/Map;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    invoke-virtual {v6, v3}, Lka/F;->a(Ljava/util/Map;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v6}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    check-cast v3, Lka/H;

    .line 98
    .line 99
    invoke-virtual {v2, v3}, Lka/E1;->d(Lka/H;)V

    .line 100
    .line 101
    .line 102
    move-object v3, p1

    .line 103
    check-cast v3, Lt9/l;

    .line 104
    .line 105
    invoke-static {}, Lka/Q;->f()Lka/P;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    iget-object v3, v3, Lt9/l;->e:Lt9/f;

    .line 110
    .line 111
    iget-object v3, v3, Lt9/f;->a:Ljava/util/HashSet;

    .line 112
    .line 113
    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 118
    .line 119
    .line 120
    move-result v6

    .line 121
    if-eqz v6, :cond_1

    .line 122
    .line 123
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v6

    .line 127
    check-cast v6, Ls9/j;

    .line 128
    .line 129
    invoke-virtual {v6}, Ls9/j;->c()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v6

    .line 133
    invoke-virtual {v5, v6}, Lka/P;->a(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_1
    invoke-virtual {v5}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    check-cast v3, Lka/Q;

    .line 142
    .line 143
    invoke-virtual {v2, v3}, Lka/E1;->e(Lka/Q;)V

    .line 144
    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_2
    instance-of v3, p1, Lt9/e;

    .line 148
    .line 149
    if-eqz v3, :cond_3

    .line 150
    .line 151
    iget-object v3, p1, Lt9/h;->a:Ls9/h;

    .line 152
    .line 153
    invoke-virtual {p0, v3}, Lv9/o;->h(Ls9/h;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    invoke-virtual {v2, v3}, Lka/E1;->c(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_3
    instance-of v3, p1, Lt9/q;

    .line 162
    .line 163
    if-eqz v3, :cond_d

    .line 164
    .line 165
    iget-object v3, p1, Lt9/h;->a:Ls9/h;

    .line 166
    .line 167
    invoke-virtual {p0, v3}, Lv9/o;->h(Ls9/h;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    invoke-virtual {v2, v3}, Lka/E1;->f(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    :goto_1
    iget-object v3, p1, Lt9/h;->c:Ljava/util/List;

    .line 175
    .line 176
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 181
    .line 182
    .line 183
    move-result v5

    .line 184
    if-eqz v5, :cond_8

    .line 185
    .line 186
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v5

    .line 190
    check-cast v5, Lt9/g;

    .line 191
    .line 192
    iget-object v6, v5, Lt9/g;->b:Lt9/p;

    .line 193
    .line 194
    instance-of v7, v6, Lt9/n;

    .line 195
    .line 196
    iget-object v5, v5, Lt9/g;->a:Ls9/j;

    .line 197
    .line 198
    if-eqz v7, :cond_4

    .line 199
    .line 200
    invoke-static {}, Lka/Z;->m()Lka/X;

    .line 201
    .line 202
    .line 203
    move-result-object v6

    .line 204
    invoke-virtual {v5}, Ls9/j;->c()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v5

    .line 208
    invoke-virtual {v6, v5}, Lka/X;->b(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v6}, Lka/X;->e()V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v6}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 215
    .line 216
    .line 217
    move-result-object v5

    .line 218
    check-cast v5, Lka/Z;

    .line 219
    .line 220
    goto :goto_3

    .line 221
    :cond_4
    instance-of v7, v6, Lt9/b;

    .line 222
    .line 223
    if-eqz v7, :cond_5

    .line 224
    .line 225
    check-cast v6, Lt9/b;

    .line 226
    .line 227
    invoke-static {}, Lka/Z;->m()Lka/X;

    .line 228
    .line 229
    .line 230
    move-result-object v7

    .line 231
    invoke-virtual {v5}, Ls9/j;->c()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v5

    .line 235
    invoke-virtual {v7, v5}, Lka/X;->b(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    invoke-static {}, Lka/g;->g()Lka/f;

    .line 239
    .line 240
    .line 241
    move-result-object v5

    .line 242
    iget-object v6, v6, Lt9/c;->a:Ljava/util/List;

    .line 243
    .line 244
    check-cast v6, Ljava/util/List;

    .line 245
    .line 246
    invoke-virtual {v5, v6}, Lka/f;->a(Ljava/util/List;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v7, v5}, Lka/X;->a(Lka/f;)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v7}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 253
    .line 254
    .line 255
    move-result-object v5

    .line 256
    check-cast v5, Lka/Z;

    .line 257
    .line 258
    goto :goto_3

    .line 259
    :cond_5
    instance-of v7, v6, Lt9/a;

    .line 260
    .line 261
    if-eqz v7, :cond_6

    .line 262
    .line 263
    check-cast v6, Lt9/a;

    .line 264
    .line 265
    invoke-static {}, Lka/Z;->m()Lka/X;

    .line 266
    .line 267
    .line 268
    move-result-object v7

    .line 269
    invoke-virtual {v5}, Ls9/j;->c()Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v5

    .line 273
    invoke-virtual {v7, v5}, Lka/X;->b(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    invoke-static {}, Lka/g;->g()Lka/f;

    .line 277
    .line 278
    .line 279
    move-result-object v5

    .line 280
    iget-object v6, v6, Lt9/c;->a:Ljava/util/List;

    .line 281
    .line 282
    check-cast v6, Ljava/util/List;

    .line 283
    .line 284
    invoke-virtual {v5, v6}, Lka/f;->a(Ljava/util/List;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v7, v5}, Lka/X;->d(Lka/f;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v7}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 291
    .line 292
    .line 293
    move-result-object v5

    .line 294
    check-cast v5, Lka/Z;

    .line 295
    .line 296
    goto :goto_3

    .line 297
    :cond_6
    instance-of v7, v6, Lt9/k;

    .line 298
    .line 299
    if-eqz v7, :cond_7

    .line 300
    .line 301
    check-cast v6, Lt9/k;

    .line 302
    .line 303
    invoke-static {}, Lka/Z;->m()Lka/X;

    .line 304
    .line 305
    .line 306
    move-result-object v7

    .line 307
    invoke-virtual {v5}, Ls9/j;->c()Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v5

    .line 311
    invoke-virtual {v7, v5}, Lka/X;->b(Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    iget-object v5, v6, Lt9/k;->a:Lka/C1;

    .line 315
    .line 316
    invoke-virtual {v7, v5}, Lka/X;->c(Lka/C1;)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v7}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 320
    .line 321
    .line 322
    move-result-object v5

    .line 323
    check-cast v5, Lka/Z;

    .line 324
    .line 325
    :goto_3
    invoke-virtual {v2, v5}, Lka/E1;->a(Lka/Z;)V

    .line 326
    .line 327
    .line 328
    goto/16 :goto_2

    .line 329
    .line 330
    :cond_7
    const-string p1, "Unknown transform: %s"

    .line 331
    .line 332
    new-array v1, v1, [Ljava/lang/Object;

    .line 333
    .line 334
    aput-object v6, v1, v0

    .line 335
    .line 336
    invoke-static {p1, v1}, LA6/c;->s(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 337
    .line 338
    .line 339
    throw v4

    .line 340
    :cond_8
    iget-object p1, p1, Lt9/h;->b:Lt9/m;

    .line 341
    .line 342
    iget-object v3, p1, Lt9/m;->a:Ls9/o;

    .line 343
    .line 344
    iget-object v5, p1, Lt9/m;->b:Ljava/lang/Boolean;

    .line 345
    .line 346
    if-nez v3, :cond_9

    .line 347
    .line 348
    if-nez v5, :cond_9

    .line 349
    .line 350
    goto :goto_6

    .line 351
    :cond_9
    if-nez v3, :cond_a

    .line 352
    .line 353
    if-nez v5, :cond_a

    .line 354
    .line 355
    move v3, v1

    .line 356
    goto :goto_4

    .line 357
    :cond_a
    move v3, v0

    .line 358
    :goto_4
    xor-int/2addr v1, v3

    .line 359
    new-array v3, v0, [Ljava/lang/Object;

    .line 360
    .line 361
    const-string v6, "Can\'t serialize an empty precondition"

    .line 362
    .line 363
    invoke-static {v1, v6, v3}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 364
    .line 365
    .line 366
    invoke-static {}, Lka/s0;->h()Lka/r0;

    .line 367
    .line 368
    .line 369
    move-result-object v1

    .line 370
    iget-object p1, p1, Lt9/m;->a:Ls9/o;

    .line 371
    .line 372
    if-eqz p1, :cond_b

    .line 373
    .line 374
    iget-object p1, p1, Ls9/o;->a:Ls8/q;

    .line 375
    .line 376
    invoke-static {p1}, Lv9/o;->l(Ls8/q;)Lcom/google/protobuf/Timestamp;

    .line 377
    .line 378
    .line 379
    move-result-object p1

    .line 380
    invoke-virtual {v1, p1}, Lka/r0;->b(Lcom/google/protobuf/Timestamp;)V

    .line 381
    .line 382
    .line 383
    invoke-virtual {v1}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 384
    .line 385
    .line 386
    move-result-object p1

    .line 387
    check-cast p1, Lka/s0;

    .line 388
    .line 389
    goto :goto_5

    .line 390
    :cond_b
    if-eqz v5, :cond_c

    .line 391
    .line 392
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 393
    .line 394
    .line 395
    move-result p1

    .line 396
    invoke-virtual {v1, p1}, Lka/r0;->a(Z)V

    .line 397
    .line 398
    .line 399
    invoke-virtual {v1}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 400
    .line 401
    .line 402
    move-result-object p1

    .line 403
    check-cast p1, Lka/s0;

    .line 404
    .line 405
    :goto_5
    invoke-virtual {v2, p1}, Lka/E1;->b(Lka/s0;)V

    .line 406
    .line 407
    .line 408
    :goto_6
    invoke-virtual {v2}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 409
    .line 410
    .line 411
    move-result-object p1

    .line 412
    check-cast p1, Lka/G1;

    .line 413
    .line 414
    return-object p1

    .line 415
    :cond_c
    const-string p1, "Unknown Precondition"

    .line 416
    .line 417
    new-array v0, v0, [Ljava/lang/Object;

    .line 418
    .line 419
    invoke-static {p1, v0}, LA6/c;->s(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 420
    .line 421
    .line 422
    throw v4

    .line 423
    :cond_d
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 424
    .line 425
    .line 426
    move-result-object p1

    .line 427
    new-array v1, v1, [Ljava/lang/Object;

    .line 428
    .line 429
    aput-object p1, v1, v0

    .line 430
    .line 431
    const-string p1, "unknown mutation type %s"

    .line 432
    .line 433
    invoke-static {p1, v1}, LA6/c;->s(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 434
    .line 435
    .line 436
    throw v4
.end method

.method public final j(Lp9/A;)Lka/n1;
    .locals 9

    .line 1
    invoke-static {}, Lka/n1;->g()Lka/m1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lka/h1;->u()Lka/L0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p1, Lp9/A;->d:Ls9/m;

    .line 10
    .line 11
    iget-object v3, p0, Lv9/o;->a:Ls9/f;

    .line 12
    .line 13
    const/4 v4, 0x1

    .line 14
    const/4 v5, 0x0

    .line 15
    iget-object v6, p1, Lp9/A;->e:Ljava/lang/String;

    .line 16
    .line 17
    if-eqz v6, :cond_1

    .line 18
    .line 19
    iget-object v7, v2, Ls9/e;->a:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 22
    .line 23
    .line 24
    move-result v7

    .line 25
    rem-int/lit8 v7, v7, 0x2

    .line 26
    .line 27
    if-nez v7, :cond_0

    .line 28
    .line 29
    move v7, v4

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move v7, v5

    .line 32
    :goto_0
    const-string v8, "Collection Group queries should be within a document path or root."

    .line 33
    .line 34
    new-array v5, v5, [Ljava/lang/Object;

    .line 35
    .line 36
    invoke-static {v7, v8, v5}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-static {v3, v2}, Lv9/o;->k(Ls9/f;Ls9/m;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {v0, v2}, Lka/m1;->a(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-static {}, Lka/N0;->f()Lka/M0;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-virtual {v2, v6}, Lka/M0;->b(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2}, Lka/M0;->a()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, v2}, Lka/L0;->a(Lka/M0;)V

    .line 57
    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_1
    iget-object v6, v2, Ls9/e;->a:Ljava/util/List;

    .line 61
    .line 62
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    rem-int/lit8 v6, v6, 0x2

    .line 67
    .line 68
    if-eqz v6, :cond_2

    .line 69
    .line 70
    move v6, v4

    .line 71
    goto :goto_1

    .line 72
    :cond_2
    move v6, v5

    .line 73
    :goto_1
    const-string v7, "Document queries with filters are not supported."

    .line 74
    .line 75
    new-array v5, v5, [Ljava/lang/Object;

    .line 76
    .line 77
    invoke-static {v6, v7, v5}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2}, Ls9/e;->k()Ls9/e;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    check-cast v5, Ls9/m;

    .line 85
    .line 86
    invoke-static {v3, v5}, Lv9/o;->k(Ls9/f;Ls9/m;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    invoke-virtual {v0, v3}, Lka/m1;->a(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-static {}, Lka/N0;->f()Lka/M0;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-virtual {v2}, Ls9/e;->f()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-virtual {v3, v2}, Lka/M0;->b(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1, v3}, Lka/L0;->a(Lka/M0;)V

    .line 105
    .line 106
    .line 107
    :goto_2
    iget-object v2, p1, Lp9/A;->c:Ljava/util/List;

    .line 108
    .line 109
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    if-lez v3, :cond_3

    .line 114
    .line 115
    new-instance v3, Lp9/d;

    .line 116
    .line 117
    invoke-direct {v3, v4, v2}, Lp9/d;-><init>(ILjava/util/List;)V

    .line 118
    .line 119
    .line 120
    invoke-static {v3}, Lv9/o;->g(Lp9/k;)Lka/Z0;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-virtual {v1, v2}, Lka/L0;->f(Lka/Z0;)V

    .line 125
    .line 126
    .line 127
    :cond_3
    iget-object v2, p1, Lp9/A;->b:Ljava/util/List;

    .line 128
    .line 129
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    if-eqz v3, :cond_5

    .line 138
    .line 139
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    check-cast v3, Lp9/t;

    .line 144
    .line 145
    invoke-static {}, Lka/b1;->f()Lka/a1;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    iget v6, v3, Lp9/t;->a:I

    .line 150
    .line 151
    invoke-static {v6, v4}, LA/f;->b(II)Z

    .line 152
    .line 153
    .line 154
    move-result v6

    .line 155
    if-eqz v6, :cond_4

    .line 156
    .line 157
    sget-object v6, Lka/R0;->c:Lka/R0;

    .line 158
    .line 159
    invoke-virtual {v5, v6}, Lka/a1;->a(Lka/R0;)V

    .line 160
    .line 161
    .line 162
    goto :goto_4

    .line 163
    :cond_4
    sget-object v6, Lka/R0;->d:Lka/R0;

    .line 164
    .line 165
    invoke-virtual {v5, v6}, Lka/a1;->a(Lka/R0;)V

    .line 166
    .line 167
    .line 168
    :goto_4
    invoke-static {}, Lka/W0;->e()Lka/V0;

    .line 169
    .line 170
    .line 171
    move-result-object v6

    .line 172
    iget-object v3, v3, Lp9/t;->b:Ls9/j;

    .line 173
    .line 174
    invoke-virtual {v3}, Ls9/j;->c()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    invoke-virtual {v6, v3}, Lka/V0;->a(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v6}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    check-cast v3, Lka/W0;

    .line 186
    .line 187
    invoke-virtual {v5, v3}, Lka/a1;->b(Lka/W0;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v5}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 191
    .line 192
    .line 193
    move-result-object v3

    .line 194
    check-cast v3, Lka/b1;

    .line 195
    .line 196
    invoke-virtual {v1, v3}, Lka/L0;->b(Lka/b1;)V

    .line 197
    .line 198
    .line 199
    goto :goto_3

    .line 200
    :cond_5
    const-wide/16 v2, -0x1

    .line 201
    .line 202
    iget-wide v5, p1, Lp9/A;->f:J

    .line 203
    .line 204
    cmp-long v2, v5, v2

    .line 205
    .line 206
    if-eqz v2, :cond_6

    .line 207
    .line 208
    invoke-static {}, Lcom/google/protobuf/Int32Value;->newBuilder()Lcom/google/protobuf/Int32Value$Builder;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    long-to-int v3, v5

    .line 213
    invoke-virtual {v2, v3}, Lcom/google/protobuf/Int32Value$Builder;->setValue(I)Lcom/google/protobuf/Int32Value$Builder;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    invoke-virtual {v1, v2}, Lka/L0;->d(Lcom/google/protobuf/Int32Value$Builder;)V

    .line 218
    .line 219
    .line 220
    :cond_6
    iget-object v2, p1, Lp9/A;->g:Lp9/c;

    .line 221
    .line 222
    if-eqz v2, :cond_7

    .line 223
    .line 224
    invoke-static {}, Lka/D;->f()Lka/C;

    .line 225
    .line 226
    .line 227
    move-result-object v3

    .line 228
    iget-object v5, v2, Lp9/c;->b:Ljava/lang/Object;

    .line 229
    .line 230
    invoke-virtual {v3, v5}, Lka/C;->a(Ljava/lang/Iterable;)V

    .line 231
    .line 232
    .line 233
    iget-boolean v2, v2, Lp9/c;->a:Z

    .line 234
    .line 235
    invoke-virtual {v3, v2}, Lka/C;->b(Z)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v1, v3}, Lka/L0;->e(Lka/C;)V

    .line 239
    .line 240
    .line 241
    :cond_7
    iget-object p1, p1, Lp9/A;->h:Lp9/c;

    .line 242
    .line 243
    if-eqz p1, :cond_8

    .line 244
    .line 245
    invoke-static {}, Lka/D;->f()Lka/C;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    iget-object v3, p1, Lp9/c;->b:Ljava/lang/Object;

    .line 250
    .line 251
    invoke-virtual {v2, v3}, Lka/C;->a(Ljava/lang/Iterable;)V

    .line 252
    .line 253
    .line 254
    iget-boolean p1, p1, Lp9/c;->a:Z

    .line 255
    .line 256
    xor-int/2addr p1, v4

    .line 257
    invoke-virtual {v2, p1}, Lka/C;->b(Z)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v1, v2}, Lka/L0;->c(Lka/C;)V

    .line 261
    .line 262
    .line 263
    :cond_8
    invoke-virtual {v0, v1}, Lka/m1;->b(Lka/L0;)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 267
    .line 268
    .line 269
    move-result-object p1

    .line 270
    check-cast p1, Lka/n1;

    .line 271
    .line 272
    return-object p1
.end method
