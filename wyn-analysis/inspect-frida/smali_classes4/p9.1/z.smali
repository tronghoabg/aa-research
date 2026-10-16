.class public final Lp9/z;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lr9/l;

.field public final b:LE5/n0;

.field public final c:Ljava/util/HashMap;

.field public final d:Ljava/util/HashMap;

.field public final e:Ljava/util/LinkedHashSet;

.field public final f:Ljava/util/HashMap;

.field public final g:Ljava/util/HashMap;

.field public final h:LY2/B;

.field public final i:Ljava/util/HashMap;

.field public final j:Ljava/util/HashMap;

.field public final k:LR1/i;

.field public l:Ln9/e;

.field public m:LQ1/n;


# direct methods
.method public constructor <init>(Lr9/l;LE5/n0;Ln9/e;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp9/z;->a:Lr9/l;

    .line 5
    .line 6
    iput-object p2, p0, Lp9/z;->b:LE5/n0;

    .line 7
    .line 8
    new-instance p1, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lp9/z;->c:Ljava/util/HashMap;

    .line 14
    .line 15
    new-instance p1, Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lp9/z;->d:Ljava/util/HashMap;

    .line 21
    .line 22
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 23
    .line 24
    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Lp9/z;->e:Ljava/util/LinkedHashSet;

    .line 28
    .line 29
    new-instance p1, Ljava/util/HashMap;

    .line 30
    .line 31
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lp9/z;->f:Ljava/util/HashMap;

    .line 35
    .line 36
    new-instance p1, Ljava/util/HashMap;

    .line 37
    .line 38
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, Lp9/z;->g:Ljava/util/HashMap;

    .line 42
    .line 43
    new-instance p1, LY2/B;

    .line 44
    .line 45
    const/16 p2, 0x18

    .line 46
    .line 47
    const/4 v0, 0x0

    .line 48
    invoke-direct {p1, v0, p2}, LY2/B;-><init>(BI)V

    .line 49
    .line 50
    .line 51
    iput-object p1, p0, Lp9/z;->h:LY2/B;

    .line 52
    .line 53
    new-instance p1, Ljava/util/HashMap;

    .line 54
    .line 55
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object p1, p0, Lp9/z;->i:Ljava/util/HashMap;

    .line 59
    .line 60
    new-instance p1, LR1/i;

    .line 61
    .line 62
    const/4 p2, 0x1

    .line 63
    invoke-direct {p1, p2, p2}, LR1/i;-><init>(II)V

    .line 64
    .line 65
    .line 66
    iput-object p1, p0, Lp9/z;->k:LR1/i;

    .line 67
    .line 68
    iput-object p3, p0, Lp9/z;->l:Ln9/e;

    .line 69
    .line 70
    new-instance p1, Ljava/util/HashMap;

    .line 71
    .line 72
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 73
    .line 74
    .line 75
    iput-object p1, p0, Lp9/z;->j:Ljava/util/HashMap;

    .line 76
    .line 77
    return-void
.end method

.method public static varargs e(Lmd/k0;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    iget-object v1, p0, Lmd/k0;->a:Lmd/j0;

    .line 3
    .line 4
    iget-object v2, p0, Lmd/k0;->b:Ljava/lang/String;

    .line 5
    .line 6
    if-eqz v2, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const-string v2, ""

    .line 10
    .line 11
    :goto_0
    sget-object v3, Lmd/j0;->l:Lmd/j0;

    .line 12
    .line 13
    if-ne v1, v3, :cond_1

    .line 14
    .line 15
    const-string v3, "requires an index"

    .line 16
    .line 17
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    sget-object v2, Lmd/j0;->j:Lmd/j0;

    .line 25
    .line 26
    if-ne v1, v2, :cond_2

    .line 27
    .line 28
    :goto_1
    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    new-array p2, v0, [Ljava/lang/Object;

    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    aput-object p1, p2, v1

    .line 36
    .line 37
    const/4 p1, 0x1

    .line 38
    aput-object p0, p2, p1

    .line 39
    .line 40
    const-string p0, "Firestore"

    .line 41
    .line 42
    const-string p1, "%s: %s"

    .line 43
    .line 44
    invoke-static {p0, p1, v0, p2}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    :cond_2
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    iget-object v2, p0, Lp9/z;->m:LQ1/n;

    .line 4
    .line 5
    if-eqz v2, :cond_0

    .line 6
    .line 7
    move v2, v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v2, v0

    .line 10
    :goto_0
    const-string v3, "Trying to call %s before setting callback"

    .line 11
    .line 12
    new-array v1, v1, [Ljava/lang/Object;

    .line 13
    .line 14
    aput-object p1, v1, v0

    .line 15
    .line 16
    invoke-static {v2, v3, v1}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final b(Lc9/c;LC8/i;)V
    .locals 11

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, Lp9/z;->c:Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    iget-object v4, p0, Lp9/z;->a:Lr9/l;

    .line 26
    .line 27
    if-eqz v3, :cond_7

    .line 28
    .line 29
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    check-cast v3, Ljava/util/Map$Entry;

    .line 34
    .line 35
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Lp9/w;

    .line 40
    .line 41
    iget-object v5, v3, Lp9/w;->c:Lp9/C;

    .line 42
    .line 43
    const/4 v6, 0x0

    .line 44
    invoke-virtual {v5, p1, v6}, Lp9/C;->d(Lc9/c;LA7/b0;)LA7/b0;

    .line 45
    .line 46
    .line 47
    move-result-object v7

    .line 48
    iget-boolean v8, v7, LA7/b0;->b:Z

    .line 49
    .line 50
    const/4 v9, 0x0

    .line 51
    if-eqz v8, :cond_1

    .line 52
    .line 53
    iget-object v8, v3, Lp9/w;->a:Lp9/u;

    .line 54
    .line 55
    invoke-virtual {v4, v8, v9}, Lr9/l;->b(Lp9/u;Z)Lba/a;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    iget-object v4, v4, Lba/a;->b:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v4, Lc9/c;

    .line 62
    .line 63
    invoke-virtual {v5, v4, v7}, Lp9/C;->d(Lc9/c;LA7/b0;)LA7/b0;

    .line 64
    .line 65
    .line 66
    move-result-object v7

    .line 67
    :cond_1
    iget v4, v3, Lp9/w;->b:I

    .line 68
    .line 69
    if-nez p2, :cond_2

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    iget-object v6, p2, LC8/i;->c:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v6, Ljava/util/Map;

    .line 79
    .line 80
    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    move-object v6, v5

    .line 85
    check-cast v6, Lv9/t;

    .line 86
    .line 87
    :goto_1
    const/4 v5, 0x1

    .line 88
    if-eqz p2, :cond_3

    .line 89
    .line 90
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 91
    .line 92
    .line 93
    move-result-object v8

    .line 94
    iget-object v10, p2, LC8/i;->d:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v10, Ljava/util/Map;

    .line 97
    .line 98
    invoke-interface {v10, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v8

    .line 102
    if-eqz v8, :cond_3

    .line 103
    .line 104
    move v9, v5

    .line 105
    :cond_3
    iget-object v3, v3, Lp9/w;->c:Lp9/C;

    .line 106
    .line 107
    invoke-virtual {v3, v7, v6, v9}, Lp9/C;->a(LA7/b0;Lv9/t;Z)LX2/j;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    iget-object v6, v3, LX2/j;->c:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v6, Ljava/util/List;

    .line 114
    .line 115
    invoke-virtual {p0, v4, v6}, Lp9/z;->l(ILjava/util/List;)V

    .line 116
    .line 117
    .line 118
    iget-object v3, v3, LX2/j;->b:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v3, Lp9/D;

    .line 121
    .line 122
    if-eqz v3, :cond_0

    .line 123
    .line 124
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    new-instance v6, Lc9/d;

    .line 128
    .line 129
    new-instance v7, Ljava/util/ArrayList;

    .line 130
    .line 131
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 132
    .line 133
    .line 134
    sget-object v8, Ls9/h;->b:Lq6/d;

    .line 135
    .line 136
    invoke-direct {v6, v7, v8}, Lc9/d;-><init>(Ljava/util/List;Ljava/util/Comparator;)V

    .line 137
    .line 138
    .line 139
    new-instance v7, Lc9/d;

    .line 140
    .line 141
    new-instance v9, Ljava/util/ArrayList;

    .line 142
    .line 143
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 144
    .line 145
    .line 146
    invoke-direct {v7, v9, v8}, Lc9/d;-><init>(Ljava/util/List;Ljava/util/Comparator;)V

    .line 147
    .line 148
    .line 149
    iget-object v8, v3, Lp9/D;->d:Ljava/util/ArrayList;

    .line 150
    .line 151
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 152
    .line 153
    .line 154
    move-result-object v8

    .line 155
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 156
    .line 157
    .line 158
    move-result v9

    .line 159
    if-eqz v9, :cond_6

    .line 160
    .line 161
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v9

    .line 165
    check-cast v9, Lp9/f;

    .line 166
    .line 167
    iget-object v10, v9, Lp9/f;->a:Lp9/e;

    .line 168
    .line 169
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    .line 170
    .line 171
    .line 172
    move-result v10

    .line 173
    iget-object v9, v9, Lp9/f;->b:Ls9/k;

    .line 174
    .line 175
    if-eqz v10, :cond_5

    .line 176
    .line 177
    if-eq v10, v5, :cond_4

    .line 178
    .line 179
    goto :goto_2

    .line 180
    :cond_4
    iget-object v9, v9, Ls9/k;->a:Ls9/h;

    .line 181
    .line 182
    invoke-virtual {v6, v9}, Lc9/d;->a(Ljava/lang/Object;)Lc9/d;

    .line 183
    .line 184
    .line 185
    move-result-object v6

    .line 186
    goto :goto_2

    .line 187
    :cond_5
    iget-object v9, v9, Ls9/k;->a:Ls9/h;

    .line 188
    .line 189
    invoke-virtual {v7, v9}, Lc9/d;->a(Ljava/lang/Object;)Lc9/d;

    .line 190
    .line 191
    .line 192
    move-result-object v7

    .line 193
    goto :goto_2

    .line 194
    :cond_6
    new-instance v5, Lr9/m;

    .line 195
    .line 196
    iget-boolean v3, v3, Lp9/D;->e:Z

    .line 197
    .line 198
    invoke-direct {v5, v4, v3, v6, v7}, Lr9/m;-><init>(IZLc9/d;Lc9/d;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    goto/16 :goto_0

    .line 205
    .line 206
    :cond_7
    iget-object p1, p0, Lp9/z;->m:LQ1/n;

    .line 207
    .line 208
    invoke-virtual {p1, v0}, LQ1/n;->e(Ljava/util/List;)V

    .line 209
    .line 210
    .line 211
    new-instance p1, Lr9/i;

    .line 212
    .line 213
    const/4 p2, 0x1

    .line 214
    invoke-direct {p1, v4, v1, p2}, Lr9/i;-><init>(Lr9/l;Ljava/util/ArrayList;I)V

    .line 215
    .line 216
    .line 217
    iget-object p2, v4, Lr9/l;->a:Lp7/b;

    .line 218
    .line 219
    const-string v0, "notifyLocalViewChanges"

    .line 220
    .line 221
    invoke-virtual {p2, v0, p1}, Lp7/b;->P(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 222
    .line 223
    .line 224
    return-void
.end method

.method public final c(LC8/i;)V
    .locals 10

    .line 1
    const-string v0, "handleRemoteEvent"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lp9/z;->a(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, LC8/i;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/util/Map;

    .line 9
    .line 10
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_4

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Ljava/util/Map$Entry;

    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Ljava/lang/Integer;

    .line 35
    .line 36
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Lv9/t;

    .line 41
    .line 42
    iget-object v3, p0, Lp9/z;->g:Ljava/util/HashMap;

    .line 43
    .line 44
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    check-cast v2, Lp9/y;

    .line 49
    .line 50
    if-eqz v2, :cond_0

    .line 51
    .line 52
    iget-object v3, v1, Lv9/t;->c:Lc9/d;

    .line 53
    .line 54
    iget-object v3, v3, Lc9/d;->a:Lc9/c;

    .line 55
    .line 56
    invoke-virtual {v3}, Lc9/c;->size()I

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    iget-object v4, v1, Lv9/t;->d:Lc9/d;

    .line 61
    .line 62
    iget-object v5, v4, Lc9/d;->a:Lc9/c;

    .line 63
    .line 64
    invoke-virtual {v5}, Lc9/c;->size()I

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    add-int/2addr v5, v3

    .line 69
    iget-object v3, v1, Lv9/t;->e:Lc9/d;

    .line 70
    .line 71
    iget-object v6, v3, Lc9/d;->a:Lc9/c;

    .line 72
    .line 73
    invoke-virtual {v6}, Lc9/c;->size()I

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    add-int/2addr v6, v5

    .line 78
    const/4 v5, 0x1

    .line 79
    const/4 v7, 0x0

    .line 80
    if-gt v6, v5, :cond_1

    .line 81
    .line 82
    move v6, v5

    .line 83
    goto :goto_1

    .line 84
    :cond_1
    move v6, v7

    .line 85
    :goto_1
    const-string v8, "Limbo resolution for single document contains multiple changes."

    .line 86
    .line 87
    new-array v9, v7, [Ljava/lang/Object;

    .line 88
    .line 89
    invoke-static {v6, v8, v9}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    iget-object v1, v1, Lv9/t;->c:Lc9/d;

    .line 93
    .line 94
    iget-object v1, v1, Lc9/d;->a:Lc9/c;

    .line 95
    .line 96
    invoke-virtual {v1}, Lc9/c;->size()I

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    if-lez v1, :cond_2

    .line 101
    .line 102
    iput-boolean v5, v2, Lp9/y;->b:Z

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_2
    iget-object v1, v4, Lc9/d;->a:Lc9/c;

    .line 106
    .line 107
    invoke-virtual {v1}, Lc9/c;->size()I

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-lez v1, :cond_3

    .line 112
    .line 113
    iget-boolean v1, v2, Lp9/y;->b:Z

    .line 114
    .line 115
    const-string v2, "Received change for limbo target document without add."

    .line 116
    .line 117
    new-array v3, v7, [Ljava/lang/Object;

    .line 118
    .line 119
    invoke-static {v1, v2, v3}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_3
    iget-object v1, v3, Lc9/d;->a:Lc9/c;

    .line 124
    .line 125
    invoke-virtual {v1}, Lc9/c;->size()I

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    if-lez v1, :cond_0

    .line 130
    .line 131
    iget-boolean v1, v2, Lp9/y;->b:Z

    .line 132
    .line 133
    const-string v3, "Received remove for limbo target document without add."

    .line 134
    .line 135
    new-array v4, v7, [Ljava/lang/Object;

    .line 136
    .line 137
    invoke-static {v1, v3, v4}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    iput-boolean v7, v2, Lp9/y;->b:Z

    .line 141
    .line 142
    goto :goto_0

    .line 143
    :cond_4
    iget-object v0, p0, Lp9/z;->a:Lr9/l;

    .line 144
    .line 145
    new-instance v1, LA5/g;

    .line 146
    .line 147
    iget-object v2, p1, LC8/i;->b:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v2, Ls9/o;

    .line 150
    .line 151
    const/16 v3, 0x12

    .line 152
    .line 153
    invoke-direct {v1, v0, p1, v2, v3}, LA5/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 154
    .line 155
    .line 156
    iget-object v0, v0, Lr9/l;->a:Lp7/b;

    .line 157
    .line 158
    const-string v2, "Apply remote event"

    .line 159
    .line 160
    invoke-virtual {v0, v2, v1}, Lp7/b;->O(Ljava/lang/String;Lw9/o;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    check-cast v0, Lc9/c;

    .line 165
    .line 166
    invoke-virtual {p0, v0, p1}, Lp9/z;->b(Lc9/c;LC8/i;)V

    .line 167
    .line 168
    .line 169
    return-void
.end method

.method public final d(Lp9/u;Z)I
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    const-string v4, "listen"

    .line 8
    .line 9
    invoke-virtual {v0, v4}, Lp9/z;->a(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v4, v0, Lp9/z;->c:Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-virtual {v4, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v5

    .line 18
    xor-int/2addr v5, v3

    .line 19
    const-string v6, "We already listen to query: %s"

    .line 20
    .line 21
    new-array v7, v3, [Ljava/lang/Object;

    .line 22
    .line 23
    aput-object v1, v7, v2

    .line 24
    .line 25
    invoke-static {v5, v6, v7}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Lp9/u;->i()Lp9/A;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    iget-object v6, v0, Lp9/z;->a:Lr9/l;

    .line 33
    .line 34
    invoke-virtual {v6, v5}, Lr9/l;->a(Lp9/A;)Lr9/S;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    iget v7, v5, Lr9/S;->b:I

    .line 39
    .line 40
    invoke-virtual {v6, v1, v3}, Lr9/l;->b(Lp9/u;Z)Lba/a;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    iget-object v8, v0, Lp9/z;->d:Ljava/util/HashMap;

    .line 45
    .line 46
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object v9

    .line 50
    invoke-virtual {v8, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v9

    .line 54
    if-eqz v9, :cond_0

    .line 55
    .line 56
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 57
    .line 58
    .line 59
    move-result-object v9

    .line 60
    invoke-virtual {v8, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v9

    .line 64
    check-cast v9, Ljava/util/List;

    .line 65
    .line 66
    invoke-interface {v9, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v9

    .line 70
    check-cast v9, Lp9/u;

    .line 71
    .line 72
    invoke-virtual {v4, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v9

    .line 76
    check-cast v9, Lp9/w;

    .line 77
    .line 78
    iget-object v9, v9, Lp9/w;->c:Lp9/C;

    .line 79
    .line 80
    iget v9, v9, Lp9/C;->a:I

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_0
    move v9, v3

    .line 84
    :goto_0
    const/4 v10, 0x3

    .line 85
    if-ne v9, v10, :cond_1

    .line 86
    .line 87
    move v13, v3

    .line 88
    goto :goto_1

    .line 89
    :cond_1
    move v13, v2

    .line 90
    :goto_1
    new-instance v11, Lv9/t;

    .line 91
    .line 92
    sget-object v14, Ls9/h;->c:Lc9/d;

    .line 93
    .line 94
    iget-object v12, v5, Lr9/S;->g:Lcom/google/protobuf/ByteString;

    .line 95
    .line 96
    move-object v15, v14

    .line 97
    move-object/from16 v16, v14

    .line 98
    .line 99
    invoke-direct/range {v11 .. v16}, Lv9/t;-><init>(Lcom/google/protobuf/ByteString;ZLc9/d;Lc9/d;Lc9/d;)V

    .line 100
    .line 101
    .line 102
    new-instance v9, Lp9/C;

    .line 103
    .line 104
    iget-object v10, v6, Lba/a;->c:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v10, Lc9/d;

    .line 107
    .line 108
    invoke-direct {v9, v1, v10}, Lp9/C;-><init>(Lp9/u;Lc9/d;)V

    .line 109
    .line 110
    .line 111
    const/4 v10, 0x0

    .line 112
    iget-object v6, v6, Lba/a;->b:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v6, Lc9/c;

    .line 115
    .line 116
    invoke-virtual {v9, v6, v10}, Lp9/C;->d(Lc9/c;LA7/b0;)LA7/b0;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    invoke-virtual {v9, v6, v11, v2}, Lp9/C;->a(LA7/b0;Lv9/t;Z)LX2/j;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    iget-object v6, v2, LX2/j;->c:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v6, Ljava/util/List;

    .line 127
    .line 128
    invoke-virtual {v0, v7, v6}, Lp9/z;->l(ILjava/util/List;)V

    .line 129
    .line 130
    .line 131
    new-instance v6, Lp9/w;

    .line 132
    .line 133
    invoke-direct {v6, v1, v7, v9}, Lp9/w;-><init>(Lp9/u;ILp9/C;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v4, v1, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    invoke-virtual {v8, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v4

    .line 147
    if-nez v4, :cond_2

    .line 148
    .line 149
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    new-instance v6, Ljava/util/ArrayList;

    .line 154
    .line 155
    invoke-direct {v6, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v8, v4, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    :cond_2
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    invoke-virtual {v8, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    check-cast v3, Ljava/util/List;

    .line 170
    .line 171
    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    iget-object v1, v0, Lp9/z;->m:LQ1/n;

    .line 175
    .line 176
    iget-object v2, v2, LX2/j;->b:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast v2, Lp9/D;

    .line 179
    .line 180
    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    invoke-virtual {v1, v2}, LQ1/n;->e(Ljava/util/List;)V

    .line 185
    .line 186
    .line 187
    if-eqz p2, :cond_3

    .line 188
    .line 189
    iget-object v1, v0, Lp9/z;->b:LE5/n0;

    .line 190
    .line 191
    invoke-virtual {v1, v5}, LE5/n0;->j(Lr9/S;)V

    .line 192
    .line 193
    .line 194
    :cond_3
    iget v1, v5, Lr9/S;->b:I

    .line 195
    .line 196
    return v1
.end method

.method public final f(ILmd/k0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lp9/z;->i:Ljava/util/HashMap;

    .line 2
    .line 3
    iget-object v1, p0, Lp9/z;->l:Ln9/e;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/util/Map;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    if-eqz p2, :cond_0

    .line 26
    .line 27
    invoke-static {p2}, Lw9/p;->g(Lmd/k0;)Lm9/G;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-virtual {v1, p2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/4 p2, 0x0

    .line 36
    invoke-virtual {v1, p2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    :goto_0
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    :cond_1
    return-void
.end method

.method public final g()V
    .locals 9

    .line 1
    :goto_0
    iget-object v0, p0, Lp9/z;->e:Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lp9/z;->f:Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/16 v3, 0x64

    .line 16
    .line 17
    if-ge v2, v3, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Ls9/h;

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lp9/z;->k:LR1/i;

    .line 33
    .line 34
    iget v5, v0, LR1/i;->b:I

    .line 35
    .line 36
    add-int/lit8 v3, v5, 0x2

    .line 37
    .line 38
    iput v3, v0, LR1/i;->b:I

    .line 39
    .line 40
    iget-object v0, p0, Lp9/z;->g:Ljava/util/HashMap;

    .line 41
    .line 42
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    new-instance v4, Lp9/y;

    .line 47
    .line 48
    invoke-direct {v4, v2}, Lp9/y;-><init>(Ls9/h;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    new-instance v3, Lr9/S;

    .line 62
    .line 63
    iget-object v0, v2, Ls9/h;->a:Ls9/m;

    .line 64
    .line 65
    new-instance v1, Lp9/u;

    .line 66
    .line 67
    const/4 v2, 0x0

    .line 68
    invoke-direct {v1, v0, v2}, Lp9/u;-><init>(Ls9/m;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1}, Lp9/u;->i()Lp9/A;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    sget-object v8, Lr9/y;->d:Lr9/y;

    .line 76
    .line 77
    const-wide/16 v6, -0x1

    .line 78
    .line 79
    invoke-direct/range {v3 .. v8}, Lr9/S;-><init>(Lp9/A;IJLr9/y;)V

    .line 80
    .line 81
    .line 82
    iget-object v0, p0, Lp9/z;->b:LE5/n0;

    .line 83
    .line 84
    invoke-virtual {v0, v3}, LE5/n0;->j(Lr9/S;)V

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_0
    return-void
.end method

.method public final h(ILmd/k0;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lp9/z;->d:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_2

    .line 22
    .line 23
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Lp9/u;

    .line 28
    .line 29
    iget-object v3, p0, Lp9/z;->c:Ljava/util/HashMap;

    .line 30
    .line 31
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2}, Lmd/k0;->f()Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-nez v3, :cond_0

    .line 39
    .line 40
    iget-object v3, p0, Lp9/z;->m:LQ1/n;

    .line 41
    .line 42
    iget-object v3, v3, LQ1/n;->c:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v3, Ljava/util/HashMap;

    .line 45
    .line 46
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    check-cast v4, Lp9/h;

    .line 51
    .line 52
    if-eqz v4, :cond_1

    .line 53
    .line 54
    iget-object v4, v4, Lp9/h;->a:Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-eqz v5, :cond_1

    .line 65
    .line 66
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    check-cast v5, Lp9/v;

    .line 71
    .line 72
    invoke-static {p2}, Lw9/p;->g(Lmd/k0;)Lm9/G;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    iget-object v5, v5, Lp9/v;->c:Lp9/b;

    .line 77
    .line 78
    const/4 v7, 0x0

    .line 79
    invoke-virtual {v5, v7, v6}, Lp9/b;->a(Ljava/lang/Object;Lm9/G;)V

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_1
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    const-string v3, "Listen for %s failed"

    .line 87
    .line 88
    const/4 v4, 0x1

    .line 89
    new-array v4, v4, [Ljava/lang/Object;

    .line 90
    .line 91
    const/4 v5, 0x0

    .line 92
    aput-object v2, v4, v5

    .line 93
    .line 94
    invoke-static {p2, v3, v4}, Lp9/z;->e(Lmd/k0;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    invoke-virtual {v0, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    iget-object p2, p0, Lp9/z;->h:LY2/B;

    .line 106
    .line 107
    invoke-virtual {p2, p1}, LY2/B;->z(I)Lc9/d;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-virtual {p2, p1}, LY2/B;->C(I)Lc9/d;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0}, Lc9/d;->iterator()Ljava/util/Iterator;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    :cond_3
    :goto_2
    move-object v0, p1

    .line 119
    check-cast v0, LA7/v;

    .line 120
    .line 121
    iget-object v1, v0, LA7/v;->b:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v1, Ljava/util/Iterator;

    .line 124
    .line 125
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    if-eqz v1, :cond_4

    .line 130
    .line 131
    invoke-virtual {v0}, LA7/v;->next()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    check-cast v0, Ls9/h;

    .line 136
    .line 137
    invoke-virtual {p2, v0}, LY2/B;->l(Ls9/h;)Z

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    if-nez v1, :cond_3

    .line 142
    .line 143
    invoke-virtual {p0, v0}, Lp9/z;->i(Ls9/h;)V

    .line 144
    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_4
    return-void
.end method

.method public final i(Ls9/h;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lp9/z;->e:Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lp9/z;->f:Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Ljava/lang/Integer;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    iget-object v2, p0, Lp9/z;->b:LE5/n0;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    invoke-virtual {v2, v3}, LE5/n0;->x(I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lp9/z;->g:Ljava/util/HashMap;

    .line 29
    .line 30
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lp9/z;->g()V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void
.end method

.method public final j(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lp9/z;->j:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Ljava/util/List;

    .line 22
    .line 23
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 38
    .line 39
    const/4 v3, 0x0

    .line 40
    invoke-virtual {v2, v3}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    :cond_1
    return-void
.end method

.method public final k(Lp9/u;Z)V
    .locals 5

    .line 1
    const-string v0, "stopListening"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lp9/z;->a(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lp9/z;->c:Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Lp9/w;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v3, v2

    .line 20
    :goto_0
    const-string v4, "Trying to stop listening to a query not found"

    .line 21
    .line 22
    new-array v2, v2, [Ljava/lang/Object;

    .line 23
    .line 24
    invoke-static {v3, v4, v2}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    iget v0, v1, Lp9/w;->b:I

    .line 31
    .line 32
    iget-object v1, p0, Lp9/z;->d:Ljava/util/HashMap;

    .line 33
    .line 34
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, Ljava/util/List;

    .line 43
    .line 44
    invoke-interface {v1, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    iget-object p1, p0, Lp9/z;->a:Lr9/l;

    .line 54
    .line 55
    new-instance v1, LE5/c;

    .line 56
    .line 57
    const/16 v2, 0x9

    .line 58
    .line 59
    invoke-direct {v1, p1, v0, v2}, LE5/c;-><init>(Ljava/lang/Object;II)V

    .line 60
    .line 61
    .line 62
    iget-object p1, p1, Lr9/l;->a:Lp7/b;

    .line 63
    .line 64
    const-string v2, "Release target"

    .line 65
    .line 66
    invoke-virtual {p1, v2, v1}, Lp7/b;->P(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 67
    .line 68
    .line 69
    if-eqz p2, :cond_1

    .line 70
    .line 71
    iget-object p1, p0, Lp9/z;->b:LE5/n0;

    .line 72
    .line 73
    invoke-virtual {p1, v0}, LE5/n0;->x(I)V

    .line 74
    .line 75
    .line 76
    :cond_1
    sget-object p1, Lmd/k0;->e:Lmd/k0;

    .line 77
    .line 78
    invoke-virtual {p0, v0, p1}, Lp9/z;->h(ILmd/k0;)V

    .line 79
    .line 80
    .line 81
    :cond_2
    return-void
.end method

.method public final l(ILjava/util/List;)V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_3

    .line 12
    .line 13
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Lp9/r;

    .line 18
    .line 19
    iget-object v3, v2, Lp9/r;->a:Lp9/q;

    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    const-string v4, "z"

    .line 26
    .line 27
    iget-object v5, p0, Lp9/z;->h:LY2/B;

    .line 28
    .line 29
    iget-object v6, v2, Lp9/r;->b:Ls9/h;

    .line 30
    .line 31
    if-eqz v3, :cond_2

    .line 32
    .line 33
    if-ne v3, v1, :cond_1

    .line 34
    .line 35
    new-array v2, v1, [Ljava/lang/Object;

    .line 36
    .line 37
    aput-object v6, v2, v0

    .line 38
    .line 39
    const-string v3, "Document no longer in limbo: %s"

    .line 40
    .line 41
    invoke-static {v4, v3, v1, v2}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    new-instance v2, Lr9/c;

    .line 48
    .line 49
    invoke-direct {v2, v6, p1}, Lr9/c;-><init>(Ls9/h;I)V

    .line 50
    .line 51
    .line 52
    iget-object v3, v5, LY2/B;->b:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v3, Lc9/d;

    .line 55
    .line 56
    invoke-virtual {v3, v2}, Lc9/d;->c(Ljava/lang/Object;)Lc9/d;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    iput-object v3, v5, LY2/B;->b:Ljava/lang/Object;

    .line 61
    .line 62
    iget-object v3, v5, LY2/B;->c:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v3, Lc9/d;

    .line 65
    .line 66
    invoke-virtual {v3, v2}, Lc9/d;->c(Ljava/lang/Object;)Lc9/d;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    iput-object v2, v5, LY2/B;->c:Ljava/lang/Object;

    .line 71
    .line 72
    invoke-virtual {v5, v6}, LY2/B;->l(Ls9/h;)Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-nez v2, :cond_0

    .line 77
    .line 78
    invoke-virtual {p0, v6}, Lp9/z;->i(Ls9/h;)V

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_1
    iget-object p1, v2, Lp9/r;->a:Lp9/q;

    .line 83
    .line 84
    new-array p2, v1, [Ljava/lang/Object;

    .line 85
    .line 86
    aput-object p1, p2, v0

    .line 87
    .line 88
    const-string p1, "Unknown limbo change type: %s"

    .line 89
    .line 90
    invoke-static {p1, p2}, LA6/c;->s(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    const/4 p1, 0x0

    .line 94
    throw p1

    .line 95
    :cond_2
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    new-instance v2, Lr9/c;

    .line 99
    .line 100
    invoke-direct {v2, v6, p1}, Lr9/c;-><init>(Ls9/h;I)V

    .line 101
    .line 102
    .line 103
    iget-object v3, v5, LY2/B;->b:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v3, Lc9/d;

    .line 106
    .line 107
    invoke-virtual {v3, v2}, Lc9/d;->a(Ljava/lang/Object;)Lc9/d;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    iput-object v3, v5, LY2/B;->b:Ljava/lang/Object;

    .line 112
    .line 113
    iget-object v3, v5, LY2/B;->c:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v3, Lc9/d;

    .line 116
    .line 117
    invoke-virtual {v3, v2}, Lc9/d;->a(Ljava/lang/Object;)Lc9/d;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    iput-object v2, v5, LY2/B;->c:Ljava/lang/Object;

    .line 122
    .line 123
    iget-object v2, p0, Lp9/z;->f:Ljava/util/HashMap;

    .line 124
    .line 125
    invoke-virtual {v2, v6}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    if-nez v2, :cond_0

    .line 130
    .line 131
    iget-object v2, p0, Lp9/z;->e:Ljava/util/LinkedHashSet;

    .line 132
    .line 133
    invoke-virtual {v2, v6}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    if-nez v3, :cond_0

    .line 138
    .line 139
    new-array v3, v1, [Ljava/lang/Object;

    .line 140
    .line 141
    aput-object v6, v3, v0

    .line 142
    .line 143
    const-string v5, "New document in limbo: %s"

    .line 144
    .line 145
    invoke-static {v4, v5, v1, v3}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v2, v6}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0}, Lp9/z;->g()V

    .line 152
    .line 153
    .line 154
    goto/16 :goto_0

    .line 155
    .line 156
    :cond_3
    return-void
.end method
