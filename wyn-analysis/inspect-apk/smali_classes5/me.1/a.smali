.class public final Lme/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod/t;
.implements Lr9/z;
.implements Lr9/A;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;


# direct methods
.method public varargs constructor <init>(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lme/a;->a:Ljava/lang/Object;

    .line 4
    iput-object p2, p0, Lme/a;->b:Ljava/lang/Object;

    .line 5
    iput-object p3, p0, Lme/a;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lme/a;->c:Ljava/lang/Object;

    iput-object p2, p0, Lme/a;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static t(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    goto :goto_0

    .line 5
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getModifiers()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    and-int/lit8 v1, v1, 0x1

    .line 10
    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-static {p0, p1, p2}, Lme/a;->t(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :cond_1
    invoke-virtual {p0, p1, p2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 23
    .line 24
    .line 25
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1

    .line 26
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 27
    .line 28
    .line 29
    move-result p1
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_0

    .line 30
    and-int/lit8 p1, p1, 0x1

    .line 31
    .line 32
    if-nez p1, :cond_2

    .line 33
    .line 34
    :goto_0
    return-object v0

    .line 35
    :cond_2
    return-object p0

    .line 36
    :catch_0
    move-object v0, p0

    .line 37
    :catch_1
    return-object v0
.end method


# virtual methods
.method public A(Ls9/h;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lme/a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lr9/t;

    .line 4
    .line 5
    iget-object v1, v0, Lr9/t;->h:Lr9/u;

    .line 6
    .line 7
    iget-object v1, v1, Lr9/u;->b:LY2/B;

    .line 8
    .line 9
    invoke-virtual {v1, p1}, LY2/B;->l(Ls9/h;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    iget-object v0, v0, Lr9/t;->e:Ljava/util/HashMap;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Ljava/util/Collection;

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_3

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Lr9/s;

    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    new-instance v2, Lr9/c;

    .line 44
    .line 45
    const/4 v3, 0x0

    .line 46
    invoke-direct {v2, p1, v3}, Lr9/c;-><init>(Ls9/h;I)V

    .line 47
    .line 48
    .line 49
    iget-object v1, v1, Lr9/s;->b:Lc9/d;

    .line 50
    .line 51
    invoke-virtual {v1, v2}, Lc9/d;->b(Lr9/c;)LA7/v;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    iget-object v2, v1, LA7/v;->b:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v2, Ljava/util/Iterator;

    .line 58
    .line 59
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-nez v2, :cond_2

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    invoke-virtual {v1}, LA7/v;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    check-cast v1, Lr9/c;

    .line 71
    .line 72
    iget-object v1, v1, Lr9/c;->a:Ls9/h;

    .line 73
    .line 74
    invoke-virtual {v1, p1}, Ls9/h;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    :goto_0
    if-eqz v3, :cond_1

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    iget-object v0, p0, Lme/a;->a:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v0, LY2/B;

    .line 84
    .line 85
    if-eqz v0, :cond_4

    .line 86
    .line 87
    invoke-virtual {v0, p1}, LY2/B;->l(Ls9/h;)Z

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-eqz p1, :cond_4

    .line 92
    .line 93
    :goto_1
    const/4 p1, 0x1

    .line 94
    return p1

    .line 95
    :cond_4
    const/4 p1, 0x0

    .line 96
    return p1
.end method

.method public B(Ls9/h;)Ls9/k;
    .locals 1

    .line 1
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Lme/a;->y(Ljava/lang/Iterable;)Ljava/util/HashMap;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Ls9/k;

    .line 14
    .line 15
    return-object p1
.end method

.method public C(Lp9/u;Ls9/b;Ljava/util/Set;LR1/i;)Ljava/util/HashMap;
    .locals 7

    .line 1
    iget-object v0, p1, Lp9/u;->f:Ls9/m;

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    new-instance v5, Laa/f;

    .line 8
    .line 9
    const/16 v0, 0x18

    .line 10
    .line 11
    invoke-direct {v5, v0, p1, p3}, Laa/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    const v4, 0x7fffffff

    .line 15
    .line 16
    .line 17
    move-object v1, p0

    .line 18
    move-object v3, p2

    .line 19
    move-object v6, p4

    .line 20
    invoke-virtual/range {v1 .. v6}, Lme/a;->r(Ljava/util/List;Ls9/b;ILaa/f;LR1/i;)Ljava/util/HashMap;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1
.end method

.method public D()Lac/a;
    .locals 3

    .line 1
    new-instance v0, Lac/a;

    .line 2
    .line 3
    iget-object v1, p0, Lme/a;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, LC8/i;

    .line 6
    .line 7
    const/16 v2, 0x14

    .line 8
    .line 9
    invoke-direct {v0, v1, v2}, Lac/a;-><init>(Ljava/lang/Object;I)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public E()V
    .locals 4

    .line 1
    iget-object v0, p0, Lme/a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/concurrent/ScheduledFuture;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v0, v1

    .line 11
    :goto_0
    const-string v2, "Caller should have verified scheduledFuture is non-null."

    .line 12
    .line 13
    new-array v3, v1, [Ljava/lang/Object;

    .line 14
    .line 15
    invoke-static {v0, v2, v3}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput-object v0, p0, Lme/a;->b:Ljava/lang/Object;

    .line 20
    .line 21
    iget-object v0, p0, Lme/a;->c:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Lw9/e;

    .line 24
    .line 25
    iget-object v0, v0, Lw9/e;->b:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    new-array v1, v1, [Ljava/lang/Object;

    .line 32
    .line 33
    const-string v2, "Delayed task not found."

    .line 34
    .line 35
    invoke-static {v0, v2, v1}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public F(Ls9/k;Ls9/o;)V
    .locals 10

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x4

    .line 3
    const/4 v2, 0x0

    .line 4
    const/4 v3, 0x1

    .line 5
    sget-object v4, Ls9/o;->b:Ls9/o;

    .line 6
    .line 7
    invoke-virtual {p2, v4}, Ls9/o;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v4

    .line 11
    xor-int/2addr v4, v3

    .line 12
    new-array v5, v2, [Ljava/lang/Object;

    .line 13
    .line 14
    const-string v6, "Cannot add document to the RemoteDocumentCache with a read time of zero"

    .line 15
    .line 16
    invoke-static {v4, v6, v5}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-object v4, p0, Lme/a;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v4, La2/v;

    .line 22
    .line 23
    invoke-static {}, Lu9/c;->k()Lu9/b;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    invoke-virtual {p1}, Ls9/k;->e()Z

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    iget-object v4, v4, La2/v;->b:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v4, Lv9/o;

    .line 34
    .line 35
    iget-object v7, p1, Ls9/k;->a:Ls9/h;

    .line 36
    .line 37
    if-eqz v6, :cond_0

    .line 38
    .line 39
    invoke-static {}, Lu9/f;->f()Lu9/e;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    invoke-virtual {v4, v7}, Lv9/o;->h(Ls9/h;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-virtual {v6, v4}, Lu9/e;->a(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    iget-object v4, p1, Ls9/k;->c:Ls9/o;

    .line 51
    .line 52
    iget-object v4, v4, Ls9/o;->a:Ls8/q;

    .line 53
    .line 54
    invoke-static {v4}, Lv9/o;->l(Ls8/q;)Lcom/google/protobuf/Timestamp;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-virtual {v6, v4}, Lu9/e;->b(Lcom/google/protobuf/Timestamp;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v6}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    check-cast v4, Lu9/f;

    .line 66
    .line 67
    invoke-virtual {v5, v4}, Lu9/b;->c(Lu9/f;)V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_0
    invoke-virtual {p1}, Ls9/k;->d()Z

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    if-eqz v6, :cond_1

    .line 76
    .line 77
    invoke-static {}, Lka/H;->g()Lka/F;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    invoke-virtual {v4, v7}, Lv9/o;->h(Ls9/h;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    invoke-virtual {v6, v4}, Lka/F;->b(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    iget-object v4, p1, Ls9/k;->e:Ls9/l;

    .line 89
    .line 90
    invoke-virtual {v4}, Ls9/l;->b()Lka/C1;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    invoke-virtual {v4}, Lka/C1;->s()Lka/p0;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    invoke-virtual {v4}, Lka/p0;->getFieldsMap()Ljava/util/Map;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    invoke-virtual {v6, v4}, Lka/F;->a(Ljava/util/Map;)V

    .line 103
    .line 104
    .line 105
    iget-object v4, p1, Ls9/k;->c:Ls9/o;

    .line 106
    .line 107
    iget-object v4, v4, Ls9/o;->a:Ls8/q;

    .line 108
    .line 109
    invoke-static {v4}, Lv9/o;->l(Ls8/q;)Lcom/google/protobuf/Timestamp;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    invoke-virtual {v6, v4}, Lka/F;->c(Lcom/google/protobuf/Timestamp;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v6}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    check-cast v4, Lka/H;

    .line 121
    .line 122
    invoke-virtual {v5, v4}, Lu9/b;->a(Lka/H;)V

    .line 123
    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_1
    iget v6, p1, Ls9/k;->b:I

    .line 127
    .line 128
    invoke-static {v6, v1}, LA/f;->b(II)Z

    .line 129
    .line 130
    .line 131
    move-result v6

    .line 132
    if-eqz v6, :cond_2

    .line 133
    .line 134
    invoke-static {}, Lu9/m;->f()Lu9/l;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    invoke-virtual {v4, v7}, Lv9/o;->h(Ls9/h;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    invoke-virtual {v6, v4}, Lu9/l;->a(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    iget-object v4, p1, Ls9/k;->c:Ls9/o;

    .line 146
    .line 147
    iget-object v4, v4, Ls9/o;->a:Ls8/q;

    .line 148
    .line 149
    invoke-static {v4}, Lv9/o;->l(Ls8/q;)Lcom/google/protobuf/Timestamp;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    invoke-virtual {v6, v4}, Lu9/l;->b(Lcom/google/protobuf/Timestamp;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v6}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    check-cast v4, Lu9/m;

    .line 161
    .line 162
    invoke-virtual {v5, v4}, Lu9/b;->d(Lu9/m;)V

    .line 163
    .line 164
    .line 165
    :goto_0
    iget p1, p1, Ls9/k;->f:I

    .line 166
    .line 167
    invoke-static {p1, v0}, LA/f;->b(II)Z

    .line 168
    .line 169
    .line 170
    move-result p1

    .line 171
    invoke-virtual {v5, p1}, Lu9/b;->b(Z)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v5}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    check-cast p1, Lu9/c;

    .line 179
    .line 180
    iget-object v4, v7, Ls9/h;->a:Ls9/m;

    .line 181
    .line 182
    invoke-static {v4}, Lka/e0;->n(Ls9/e;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v4

    .line 186
    iget-object v5, v7, Ls9/h;->a:Ls9/m;

    .line 187
    .line 188
    iget-object v5, v5, Ls9/e;->a:Ljava/util/List;

    .line 189
    .line 190
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 191
    .line 192
    .line 193
    move-result v5

    .line 194
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 195
    .line 196
    .line 197
    move-result-object v5

    .line 198
    iget-object p2, p2, Ls9/o;->a:Ls8/q;

    .line 199
    .line 200
    iget-wide v8, p2, Ls8/q;->a:J

    .line 201
    .line 202
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 203
    .line 204
    .line 205
    move-result-object v6

    .line 206
    iget p2, p2, Ls8/q;->b:I

    .line 207
    .line 208
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 209
    .line 210
    .line 211
    move-result-object p2

    .line 212
    invoke-interface {p1}, Lcom/google/protobuf/MessageLite;->toByteArray()[B

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    const/4 v8, 0x5

    .line 217
    new-array v8, v8, [Ljava/lang/Object;

    .line 218
    .line 219
    aput-object v4, v8, v2

    .line 220
    .line 221
    aput-object v5, v8, v3

    .line 222
    .line 223
    aput-object v6, v8, v0

    .line 224
    .line 225
    const/4 v0, 0x3

    .line 226
    aput-object p2, v8, v0

    .line 227
    .line 228
    aput-object p1, v8, v1

    .line 229
    .line 230
    iget-object p1, p0, Lme/a;->a:Ljava/lang/Object;

    .line 231
    .line 232
    check-cast p1, Lr9/K;

    .line 233
    .line 234
    const-string p2, "INSERT OR REPLACE INTO remote_documents (path, path_length, read_time_seconds, read_time_nanos, contents) VALUES (?, ?, ?, ?, ?)"

    .line 235
    .line 236
    invoke-virtual {p1, p2, v8}, Lr9/K;->f0(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 237
    .line 238
    .line 239
    iget-object p1, p0, Lme/a;->c:Ljava/lang/Object;

    .line 240
    .line 241
    check-cast p1, Lr9/f;

    .line 242
    .line 243
    invoke-virtual {v7}, Ls9/h;->d()Ls9/m;

    .line 244
    .line 245
    .line 246
    move-result-object p2

    .line 247
    invoke-interface {p1, p2}, Lr9/f;->u(Ls9/m;)V

    .line 248
    .line 249
    .line 250
    return-void

    .line 251
    :cond_2
    const-string p2, "Cannot encode invalid document %s"

    .line 252
    .line 253
    new-array v0, v3, [Ljava/lang/Object;

    .line 254
    .line 255
    aput-object p1, v0, v2

    .line 256
    .line 257
    invoke-static {p2, v0}, LA6/c;->s(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    const/4 p1, 0x0

    .line 261
    throw p1
.end method

.method public G(Lw9/f;Ljava/util/HashMap;Landroid/database/Cursor;Laa/f;)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p3, v0}, Landroid/database/Cursor;->getBlob(I)[B

    .line 3
    .line 4
    .line 5
    move-result-object v3

    .line 6
    const/4 v0, 0x1

    .line 7
    invoke-interface {p3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 8
    .line 9
    .line 10
    move-result v4

    .line 11
    const/4 v0, 0x2

    .line 12
    invoke-interface {p3, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 13
    .line 14
    .line 15
    move-result v5

    .line 16
    invoke-interface {p3}, Landroid/database/Cursor;->isLast()Z

    .line 17
    .line 18
    .line 19
    move-result p3

    .line 20
    if-eqz p3, :cond_0

    .line 21
    .line 22
    sget-object p1, Lw9/k;->b:Lcom/applovin/impl/T0;

    .line 23
    .line 24
    :cond_0
    new-instance v1, LMb/a;

    .line 25
    .line 26
    move-object v2, p0

    .line 27
    move-object v7, p2

    .line 28
    move-object v6, p4

    .line 29
    invoke-direct/range {v1 .. v7}, LMb/a;-><init>(Lme/a;[BIILaa/f;Ljava/util/HashMap;)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public K(Lr9/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lme/a;->c:Ljava/lang/Object;

    .line 2
    .line 3
    return-void
.end method

.method public a(Ls9/h;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lme/a;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashSet;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public b(Ls9/h;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lme/a;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashSet;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public c(Ls9/h;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lme/a;->A(Ls9/h;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lme/a;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ljava/util/HashSet;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object v0, p0, Lme/a;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Ljava/util/HashSet;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public d()J
    .locals 2

    .line 1
    const-wide/16 v0, -0x1

    .line 2
    .line 3
    return-wide v0
.end method

.method public e(LL4/g;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lme/a;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lod/q;

    .line 4
    .line 5
    invoke-static {}, LXd/b;->c()V

    .line 6
    .line 7
    .line 8
    :try_start_0
    iget-object v1, v0, Lod/q;->b:LXd/c;

    .line 9
    .line 10
    invoke-static {}, LXd/b;->a()V

    .line 11
    .line 12
    .line 13
    invoke-static {}, LXd/b;->b()V

    .line 14
    .line 15
    .line 16
    iget-object v0, v0, Lod/q;->c:Ljava/util/concurrent/Executor;

    .line 17
    .line 18
    new-instance v1, Lod/n;

    .line 19
    .line 20
    invoke-direct {v1, p0, p1}, Lod/n;-><init>(Lme/a;LL4/g;)V

    .line 21
    .line 22
    .line 23
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    sget-object p1, LXd/b;->a:LXd/a;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    :try_start_1
    sget-object v0, LXd/b;->a:LXd/a;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_1
    move-exception v0

    .line 40
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 41
    .line 42
    .line 43
    :goto_0
    throw p1
.end method

.method public f(Lmd/b0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lme/a;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lod/q;

    .line 4
    .line 5
    invoke-static {}, LXd/b;->c()V

    .line 6
    .line 7
    .line 8
    :try_start_0
    iget-object v1, v0, Lod/q;->b:LXd/c;

    .line 9
    .line 10
    invoke-static {}, LXd/b;->a()V

    .line 11
    .line 12
    .line 13
    invoke-static {}, LXd/b;->b()V

    .line 14
    .line 15
    .line 16
    iget-object v0, v0, Lod/q;->c:Ljava/util/concurrent/Executor;

    .line 17
    .line 18
    new-instance v1, Lod/n;

    .line 19
    .line 20
    invoke-direct {v1, p0, p1}, Lod/n;-><init>(Lme/a;Lmd/b0;)V

    .line 21
    .line 22
    .line 23
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    sget-object p1, LXd/b;->a:LXd/a;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    :try_start_1
    sget-object v0, LXd/b;->a:LXd/a;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_1
    move-exception v0

    .line 40
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 41
    .line 42
    .line 43
    :goto_0
    throw p1
.end method

.method public g(Ls9/h;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lme/a;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashSet;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public h()V
    .locals 3

    .line 1
    iget-object v0, p0, Lme/a;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lod/q;

    .line 4
    .line 5
    iget-object v1, v0, Lod/q;->a:LF6/r;

    .line 6
    .line 7
    iget-object v1, v1, LF6/r;->e:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Lmd/c0;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    sget-object v2, Lmd/c0;->a:Lmd/c0;

    .line 15
    .line 16
    if-eq v1, v2, :cond_1

    .line 17
    .line 18
    sget-object v2, Lmd/c0;->b:Lmd/c0;

    .line 19
    .line 20
    if-ne v1, v2, :cond_0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    invoke-static {}, LXd/b;->c()V

    .line 24
    .line 25
    .line 26
    :try_start_0
    invoke-static {}, LXd/b;->a()V

    .line 27
    .line 28
    .line 29
    invoke-static {}, LXd/b;->b()V

    .line 30
    .line 31
    .line 32
    iget-object v0, v0, Lod/q;->c:Ljava/util/concurrent/Executor;

    .line 33
    .line 34
    new-instance v1, Lod/p;

    .line 35
    .line 36
    invoke-direct {v1, p0}, Lod/p;-><init>(Lme/a;)V

    .line 37
    .line 38
    .line 39
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    .line 42
    sget-object v0, LXd/b;->a:LXd/a;

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :catchall_0
    move-exception v0

    .line 49
    :try_start_1
    sget-object v1, LXd/b;->a:LXd/a;

    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :catchall_1
    move-exception v1

    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    :goto_0
    throw v0

    .line 60
    :cond_1
    :goto_1
    return-void
.end method

.method public i()V
    .locals 5

    .line 1
    iget-object v0, p0, Lme/a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lr9/t;

    .line 4
    .line 5
    new-instance v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-object v2, p0, Lme/a;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, Ljava/util/HashSet;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Ls9/h;

    .line 29
    .line 30
    invoke-virtual {p0, v3}, Lme/a;->A(Ls9/h;)Z

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-nez v4, :cond_0

    .line 35
    .line 36
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    iget-object v0, v0, Lr9/t;->j:LX2/j;

    .line 41
    .line 42
    invoke-virtual {v0, v1}, LX2/j;->z(Ljava/util/ArrayList;)V

    .line 43
    .line 44
    .line 45
    const/4 v0, 0x0

    .line 46
    iput-object v0, p0, Lme/a;->c:Ljava/lang/Object;

    .line 47
    .line 48
    return-void
.end method

.method public j()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lme/a;->c:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public k(LY2/B;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lme/a;->a:Ljava/lang/Object;

    .line 2
    .line 3
    return-void
.end method

.method public l(Lr9/S;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lme/a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lr9/t;

    .line 4
    .line 5
    iget v1, p1, Lr9/S;->b:I

    .line 6
    .line 7
    iget-object v0, v0, Lr9/t;->h:Lr9/u;

    .line 8
    .line 9
    iget-object v2, v0, Lr9/u;->b:LY2/B;

    .line 10
    .line 11
    invoke-virtual {v2, v1}, LY2/B;->z(I)Lc9/d;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Lc9/d;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    :goto_0
    move-object v2, v1

    .line 20
    check-cast v2, LA7/v;

    .line 21
    .line 22
    iget-object v3, v2, LA7/v;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v3, Ljava/util/Iterator;

    .line 25
    .line 26
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_0

    .line 31
    .line 32
    invoke-virtual {v2}, LA7/v;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Ls9/h;

    .line 37
    .line 38
    iget-object v3, p0, Lme/a;->c:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v3, Ljava/util/HashSet;

    .line 41
    .line 42
    invoke-virtual {v3, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    iget-object v1, v0, Lr9/u;->a:Ljava/util/HashMap;

    .line 47
    .line 48
    iget-object v2, p1, Lr9/S;->a:Lp9/A;

    .line 49
    .line 50
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    iget-object v0, v0, Lr9/u;->b:LY2/B;

    .line 54
    .line 55
    iget p1, p1, Lr9/S;->b:I

    .line 56
    .line 57
    invoke-virtual {v0, p1}, LY2/B;->C(I)Lc9/d;

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public m(Lmd/k0;Lod/s;Lmd/b0;)V
    .locals 0

    .line 1
    invoke-static {}, LXd/b;->c()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    iget-object p2, p0, Lme/a;->c:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p2, Lod/q;

    .line 7
    .line 8
    iget-object p2, p2, Lod/q;->b:LXd/c;

    .line 9
    .line 10
    invoke-static {}, LXd/b;->a()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1, p3}, Lme/a;->o(Lmd/k0;Lmd/b0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    .line 16
    sget-object p1, LXd/b;->a:LXd/a;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    :try_start_1
    sget-object p2, LXd/b;->a:LXd/a;

    .line 24
    .line 25
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catchall_1
    move-exception p2

    .line 30
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    throw p1
.end method

.method public n()V
    .locals 2

    .line 1
    iget-object v0, p0, Lme/a;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lw9/e;

    .line 4
    .line 5
    invoke-virtual {v0}, Lw9/e;->d()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lme/a;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ljava/util/concurrent/ScheduledFuture;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lme/a;->E()V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public o(Lmd/k0;Lmd/b0;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lme/a;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lod/q;

    .line 4
    .line 5
    iget-object v1, v0, Lod/q;->i:Lmd/c;

    .line 6
    .line 7
    iget-object v1, v1, Lmd/c;->a:Lmd/r;

    .line 8
    .line 9
    iget-object v2, v0, Lod/q;->f:Lmd/q;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    :cond_0
    iget-object v2, p1, Lmd/k0;->a:Lmd/j0;

    .line 18
    .line 19
    sget-object v3, Lmd/j0;->d:Lmd/j0;

    .line 20
    .line 21
    if-ne v2, v3, :cond_1

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-virtual {v1}, Lmd/r;->a()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    new-instance p1, LN/J0;

    .line 32
    .line 33
    const/4 p2, 0x2

    .line 34
    const/4 v1, 0x0

    .line 35
    invoke-direct {p1, v1, p2}, LN/J0;-><init>(BI)V

    .line 36
    .line 37
    .line 38
    iget-object p2, v0, Lod/q;->j:Lod/r;

    .line 39
    .line 40
    invoke-interface {p2, p1}, Lod/r;->i(LN/J0;)V

    .line 41
    .line 42
    .line 43
    sget-object p2, Lmd/k0;->h:Lmd/k0;

    .line 44
    .line 45
    new-instance v1, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string v2, "ClientCall was cancelled at or after deadline. "

    .line 48
    .line 49
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {p2, p1}, Lmd/k0;->b(Ljava/lang/String;)Lmd/k0;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    new-instance p2, Lmd/b0;

    .line 64
    .line 65
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 66
    .line 67
    .line 68
    :cond_1
    invoke-static {}, LXd/b;->b()V

    .line 69
    .line 70
    .line 71
    new-instance v1, Lod/o;

    .line 72
    .line 73
    invoke-direct {v1, p0, p1, p2}, Lod/o;-><init>(Lme/a;Lmd/k0;Lmd/b0;)V

    .line 74
    .line 75
    .line 76
    iget-object p1, v0, Lod/q;->c:Ljava/util/concurrent/Executor;

    .line 77
    .line 78
    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 79
    .line 80
    .line 81
    return-void
.end method

.method public p(ILio/flutter/view/e;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lme/a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/flutter/embedding/engine/FlutterJNI;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lio/flutter/embedding/engine/FlutterJNI;->dispatchSemanticsAction(ILio/flutter/view/e;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public q(ILio/flutter/view/e;Ljava/io/Serializable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lme/a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/flutter/embedding/engine/FlutterJNI;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3}, Lio/flutter/embedding/engine/FlutterJNI;->dispatchSemanticsAction(ILio/flutter/view/e;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public r(Ljava/util/List;Ls9/b;ILaa/f;LR1/i;)Ljava/util/HashMap;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    move-object/from16 v2, p5

    .line 6
    .line 7
    iget-object v3, v0, Ls9/b;->a:Ls9/o;

    .line 8
    .line 9
    iget-object v3, v3, Ls9/o;->a:Ls8/q;

    .line 10
    .line 11
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    const-string v5, " UNION "

    .line 16
    .line 17
    const-string v6, "SELECT contents, read_time_seconds, read_time_nanos, path FROM remote_documents WHERE path >= ? AND path < ? AND path_length = ? AND (read_time_seconds > ? OR ( read_time_seconds = ? AND read_time_nanos > ?) OR ( read_time_seconds = ? AND read_time_nanos = ? and path > ?)) "

    .line 18
    .line 19
    invoke-static {v4, v6, v5}, Lw9/p;->h(ILjava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    const-string v5, "ORDER BY read_time_seconds, read_time_nanos, path LIMIT ?"

    .line 24
    .line 25
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    mul-int/lit8 v5, v5, 0x9

    .line 33
    .line 34
    const/4 v6, 0x1

    .line 35
    add-int/2addr v5, v6

    .line 36
    new-array v5, v5, [Ljava/lang/Object;

    .line 37
    .line 38
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    const/4 v8, 0x0

    .line 43
    move v9, v8

    .line 44
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v10

    .line 48
    if-eqz v10, :cond_1

    .line 49
    .line 50
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v10

    .line 54
    check-cast v10, Ls9/m;

    .line 55
    .line 56
    invoke-static {v10}, Lka/e0;->n(Ls9/e;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v11

    .line 60
    add-int/lit8 v12, v9, 0x1

    .line 61
    .line 62
    aput-object v11, v5, v9

    .line 63
    .line 64
    add-int/lit8 v13, v9, 0x2

    .line 65
    .line 66
    new-instance v14, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    invoke-direct {v14, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->length()I

    .line 72
    .line 73
    .line 74
    move-result v11

    .line 75
    sub-int/2addr v11, v6

    .line 76
    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->charAt(I)C

    .line 77
    .line 78
    .line 79
    move-result v15

    .line 80
    move/from16 v16, v6

    .line 81
    .line 82
    if-ne v15, v6, :cond_0

    .line 83
    .line 84
    :goto_1
    move-object/from16 v17, v4

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_0
    move v6, v8

    .line 88
    goto :goto_1

    .line 89
    :goto_2
    const-string v4, "successor may only operate on paths generated by encode"

    .line 90
    .line 91
    move-object/from16 p1, v7

    .line 92
    .line 93
    new-array v7, v8, [Ljava/lang/Object;

    .line 94
    .line 95
    invoke-static {v6, v4, v7}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    add-int/lit8 v15, v15, 0x1

    .line 99
    .line 100
    int-to-char v4, v15

    .line 101
    invoke-virtual {v14, v11, v4}, Ljava/lang/StringBuilder;->setCharAt(IC)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    aput-object v4, v5, v12

    .line 109
    .line 110
    add-int/lit8 v4, v9, 0x3

    .line 111
    .line 112
    iget-object v6, v10, Ls9/e;->a:Ljava/util/List;

    .line 113
    .line 114
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 115
    .line 116
    .line 117
    move-result v6

    .line 118
    add-int/lit8 v6, v6, 0x1

    .line 119
    .line 120
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 121
    .line 122
    .line 123
    move-result-object v6

    .line 124
    aput-object v6, v5, v13

    .line 125
    .line 126
    add-int/lit8 v6, v9, 0x4

    .line 127
    .line 128
    iget-wide v10, v3, Ls8/q;->a:J

    .line 129
    .line 130
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 131
    .line 132
    .line 133
    move-result-object v7

    .line 134
    aput-object v7, v5, v4

    .line 135
    .line 136
    add-int/lit8 v4, v9, 0x5

    .line 137
    .line 138
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 139
    .line 140
    .line 141
    move-result-object v7

    .line 142
    aput-object v7, v5, v6

    .line 143
    .line 144
    add-int/lit8 v6, v9, 0x6

    .line 145
    .line 146
    iget v7, v3, Ls8/q;->b:I

    .line 147
    .line 148
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 149
    .line 150
    .line 151
    move-result-object v12

    .line 152
    aput-object v12, v5, v4

    .line 153
    .line 154
    add-int/lit8 v4, v9, 0x7

    .line 155
    .line 156
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 157
    .line 158
    .line 159
    move-result-object v10

    .line 160
    aput-object v10, v5, v6

    .line 161
    .line 162
    add-int/lit8 v6, v9, 0x8

    .line 163
    .line 164
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 165
    .line 166
    .line 167
    move-result-object v7

    .line 168
    aput-object v7, v5, v4

    .line 169
    .line 170
    add-int/lit8 v9, v9, 0x9

    .line 171
    .line 172
    iget-object v4, v0, Ls9/b;->b:Ls9/h;

    .line 173
    .line 174
    iget-object v4, v4, Ls9/h;->a:Ls9/m;

    .line 175
    .line 176
    invoke-static {v4}, Lka/e0;->n(Ls9/e;)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v4

    .line 180
    aput-object v4, v5, v6

    .line 181
    .line 182
    move-object/from16 v7, p1

    .line 183
    .line 184
    move/from16 v6, v16

    .line 185
    .line 186
    move-object/from16 v4, v17

    .line 187
    .line 188
    goto/16 :goto_0

    .line 189
    .line 190
    :cond_1
    move-object/from16 v17, v4

    .line 191
    .line 192
    move/from16 v16, v6

    .line 193
    .line 194
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    aput-object v0, v5, v9

    .line 199
    .line 200
    new-instance v0, Lw9/f;

    .line 201
    .line 202
    invoke-direct {v0}, Lw9/f;-><init>()V

    .line 203
    .line 204
    .line 205
    new-instance v3, Ljava/util/HashMap;

    .line 206
    .line 207
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 208
    .line 209
    .line 210
    iget-object v4, v1, Lme/a;->a:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v4, Lr9/K;

    .line 213
    .line 214
    invoke-virtual/range {v17 .. v17}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v6

    .line 218
    invoke-virtual {v4, v6}, Lr9/K;->g0(Ljava/lang/String;)Lne/a;

    .line 219
    .line 220
    .line 221
    move-result-object v4

    .line 222
    invoke-virtual {v4, v5}, Lne/a;->b([Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v4}, Lne/a;->i()Landroid/database/Cursor;

    .line 226
    .line 227
    .line 228
    move-result-object v4

    .line 229
    :cond_2
    :goto_3
    :try_start_0
    invoke-interface {v4}, Landroid/database/Cursor;->moveToNext()Z

    .line 230
    .line 231
    .line 232
    move-result v5

    .line 233
    if-eqz v5, :cond_3

    .line 234
    .line 235
    move-object/from16 v5, p4

    .line 236
    .line 237
    invoke-virtual {v1, v0, v3, v4, v5}, Lme/a;->G(Lw9/f;Ljava/util/HashMap;Landroid/database/Cursor;Laa/f;)V

    .line 238
    .line 239
    .line 240
    if-eqz v2, :cond_2

    .line 241
    .line 242
    iget v6, v2, LR1/i;->b:I

    .line 243
    .line 244
    add-int/lit8 v6, v6, 0x1

    .line 245
    .line 246
    iput v6, v2, LR1/i;->b:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 247
    .line 248
    goto :goto_3

    .line 249
    :goto_4
    move-object v2, v0

    .line 250
    goto :goto_5

    .line 251
    :cond_3
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v0}, Lw9/f;->b()V

    .line 255
    .line 256
    .line 257
    return-object v3

    .line 258
    :catchall_0
    move-exception v0

    .line 259
    goto :goto_4

    .line 260
    :goto_5
    if-eqz v4, :cond_4

    .line 261
    .line 262
    :try_start_1
    invoke-interface {v4}, Landroid/database/Cursor;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 263
    .line 264
    .line 265
    goto :goto_6

    .line 266
    :catchall_1
    move-exception v0

    .line 267
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 268
    .line 269
    .line 270
    :cond_4
    :goto_6
    throw v2
.end method

.method public s(Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 2

    .line 1
    iget-object v0, p0, Lme/a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, Lme/a;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, [Ljava/lang/Class;

    .line 8
    .line 9
    invoke-static {p1, v0, v1}, Lme/a;->t(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lme/a;->a:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Ljava/lang/Class;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    :cond_0
    return-object p1
.end method

.method public varargs u(Ljavax/net/ssl/SSLSocket;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Lme/a;->s(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    :try_start_0
    invoke-virtual {v0, p1, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    return-object p1

    .line 16
    :catch_0
    move-exception p1

    .line 17
    new-instance p2, Ljava/lang/AssertionError;

    .line 18
    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v2, "Unexpectedly could not call: "

    .line 22
    .line 23
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-direct {p2, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 37
    .line 38
    .line 39
    throw p2

    .line 40
    :cond_0
    new-instance p2, Ljava/lang/AssertionError;

    .line 41
    .line 42
    new-instance v0, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string v1, "Method "

    .line 45
    .line 46
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, Lme/a;->b:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v1, Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string v1, " not supported for object "

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-direct {p2, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    throw p2
.end method

.method public varargs v(Ljavax/net/ssl/SSLSocket;[Ljava/lang/Object;)V
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Lme/a;->s(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 6
    .line 7
    .line 8
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    :try_start_1
    invoke-virtual {v0, p1, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_1

    .line 13
    .line 14
    .line 15
    :catch_0
    :goto_0
    return-void

    .line 16
    :catch_1
    move-exception p1

    .line 17
    invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    instance-of p2, p1, Ljava/lang/RuntimeException;

    .line 22
    .line 23
    if-eqz p2, :cond_1

    .line 24
    .line 25
    check-cast p1, Ljava/lang/RuntimeException;

    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    new-instance p2, Ljava/lang/AssertionError;

    .line 29
    .line 30
    const-string v0, "Unexpected exception"

    .line 31
    .line 32
    invoke-direct {p2, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 36
    .line 37
    .line 38
    throw p2
.end method

.method public varargs w(Ljavax/net/ssl/SSLSocket;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p0, p1, p2}, Lme/a;->u(Ljavax/net/ssl/SSLSocket;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object p1

    .line 6
    :catch_0
    move-exception p1

    .line 7
    invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    instance-of p2, p1, Ljava/lang/RuntimeException;

    .line 12
    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    check-cast p1, Ljava/lang/RuntimeException;

    .line 16
    .line 17
    throw p1

    .line 18
    :cond_0
    new-instance p2, Ljava/lang/AssertionError;

    .line 19
    .line 20
    const-string v0, "Unexpected exception"

    .line 21
    .line 22
    invoke-direct {p2, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 26
    .line 27
    .line 28
    throw p2
.end method

.method public x(Ljava/lang/String;Ls9/b;I)Ljava/util/Map;
    .locals 7

    .line 1
    iget-object v0, p0, Lme/a;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lr9/f;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lr9/f;->t(Ljava/lang/String;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v2, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Ls9/m;

    .line 33
    .line 34
    invoke-virtual {v1, p1}, Ls9/e;->a(Ljava/lang/String;)Ls9/e;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Ls9/m;

    .line 39
    .line 40
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-eqz p1, :cond_1

    .line 49
    .line 50
    sget-object p1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 51
    .line 52
    return-object p1

    .line 53
    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    mul-int/lit8 p1, p1, 0x9

    .line 58
    .line 59
    const/16 v0, 0x384

    .line 60
    .line 61
    if-ge p1, v0, :cond_2

    .line 62
    .line 63
    const/4 v6, 0x0

    .line 64
    const/4 v5, 0x0

    .line 65
    move-object v1, p0

    .line 66
    move-object v3, p2

    .line 67
    move v4, p3

    .line 68
    invoke-virtual/range {v1 .. v6}, Lme/a;->r(Ljava/util/List;Ls9/b;ILaa/f;LR1/i;)Ljava/util/HashMap;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    return-object p1

    .line 73
    :cond_2
    move v3, p3

    .line 74
    move-object p1, v2

    .line 75
    move-object v2, p2

    .line 76
    new-instance p2, Ljava/util/HashMap;

    .line 77
    .line 78
    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    .line 79
    .line 80
    .line 81
    const/4 p3, 0x0

    .line 82
    move v0, p3

    .line 83
    :goto_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-ge v0, v1, :cond_3

    .line 88
    .line 89
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    add-int/lit8 v6, v0, 0x64

    .line 94
    .line 95
    invoke-static {v1, v6}, Ljava/lang/Math;->min(II)I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    invoke-virtual {p1, v0, v1}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    const/4 v5, 0x0

    .line 104
    const/4 v4, 0x0

    .line 105
    move-object v0, p0

    .line 106
    invoke-virtual/range {v0 .. v5}, Lme/a;->r(Ljava/util/List;Ls9/b;ILaa/f;LR1/i;)Ljava/util/HashMap;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-virtual {p2, v1}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 111
    .line 112
    .line 113
    move v0, v6

    .line 114
    goto :goto_1

    .line 115
    :cond_3
    sget-object p1, Ls9/b;->e:Lq6/d;

    .line 116
    .line 117
    sget-object v0, Lw9/p;->a:Lm9/B;

    .line 118
    .line 119
    invoke-virtual {p2}, Ljava/util/HashMap;->size()I

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    if-gt v0, v3, :cond_4

    .line 124
    .line 125
    return-object p2

    .line 126
    :cond_4
    new-instance v0, Ljava/util/ArrayList;

    .line 127
    .line 128
    invoke-virtual {p2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 129
    .line 130
    .line 131
    move-result-object p2

    .line 132
    invoke-direct {v0, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 133
    .line 134
    .line 135
    new-instance p2, LV5/s;

    .line 136
    .line 137
    const/4 v1, 0x4

    .line 138
    invoke-direct {p2, p1, v1}, LV5/s;-><init>(Ljava/lang/Object;I)V

    .line 139
    .line 140
    .line 141
    invoke-static {v0, p2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 142
    .line 143
    .line 144
    new-instance p1, Ljava/util/HashMap;

    .line 145
    .line 146
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 147
    .line 148
    .line 149
    :goto_2
    if-ge p3, v3, :cond_5

    .line 150
    .line 151
    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p2

    .line 155
    check-cast p2, Ljava/util/Map$Entry;

    .line 156
    .line 157
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object p2

    .line 161
    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    check-cast v1, Ljava/util/Map$Entry;

    .line 166
    .line 167
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    invoke-virtual {p1, p2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    add-int/lit8 p3, p3, 0x1

    .line 175
    .line 176
    goto :goto_2

    .line 177
    :cond_5
    return-object p1
.end method

.method public y(Ljava/lang/Iterable;)Ljava/util/HashMap;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

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
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Ls9/h;

    .line 26
    .line 27
    iget-object v3, v2, Ls9/h;->a:Ls9/m;

    .line 28
    .line 29
    invoke-static {v3}, Lka/e0;->n(Ls9/e;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    invoke-static {v2}, Ls9/k;->g(Ls9/h;)Ls9/k;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    new-instance p1, LR1/q;

    .line 45
    .line 46
    iget-object v2, p0, Lme/a;->a:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v2, Lr9/K;

    .line 49
    .line 50
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 51
    .line 52
    .line 53
    const/4 v3, 0x0

    .line 54
    iput v3, p1, LR1/q;->a:I

    .line 55
    .line 56
    iput-object v2, p1, LR1/q;->b:Ljava/lang/Object;

    .line 57
    .line 58
    const-string v2, "SELECT contents, read_time_seconds, read_time_nanos FROM remote_documents WHERE path IN ("

    .line 59
    .line 60
    iput-object v2, p1, LR1/q;->c:Ljava/lang/Object;

    .line 61
    .line 62
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 63
    .line 64
    iput-object v2, p1, LR1/q;->e:Ljava/lang/Object;

    .line 65
    .line 66
    const-string v2, ") ORDER BY path"

    .line 67
    .line 68
    iput-object v2, p1, LR1/q;->d:Ljava/lang/Object;

    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    iput-object v1, p1, LR1/q;->f:Ljava/lang/Object;

    .line 75
    .line 76
    new-instance v1, Lw9/f;

    .line 77
    .line 78
    invoke-direct {v1}, Lw9/f;-><init>()V

    .line 79
    .line 80
    .line 81
    :goto_1
    iget-object v2, p1, LR1/q;->f:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v2, Ljava/util/Iterator;

    .line 84
    .line 85
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-eqz v2, :cond_3

    .line 90
    .line 91
    invoke-virtual {p1}, LR1/q;->w()Lne/a;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-virtual {v2}, Lne/a;->i()Landroid/database/Cursor;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    :goto_2
    :try_start_0
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    if-eqz v3, :cond_1

    .line 104
    .line 105
    const/4 v3, 0x0

    .line 106
    invoke-virtual {p0, v1, v0, v2, v3}, Lme/a;->G(Lw9/f;Ljava/util/HashMap;Landroid/database/Cursor;Laa/f;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 107
    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_1
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 111
    .line 112
    .line 113
    goto :goto_1

    .line 114
    :catchall_0
    move-exception p1

    .line 115
    if-eqz v2, :cond_2

    .line 116
    .line 117
    :try_start_1
    invoke-interface {v2}, Landroid/database/Cursor;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 118
    .line 119
    .line 120
    goto :goto_3

    .line 121
    :catchall_1
    move-exception v0

    .line 122
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 123
    .line 124
    .line 125
    :cond_2
    :goto_3
    throw p1

    .line 126
    :cond_3
    invoke-virtual {v1}, Lw9/f;->b()V

    .line 127
    .line 128
    .line 129
    return-object v0
.end method

.method public z(Ljava/util/ArrayList;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    sget-object v1, Ls9/g;->a:Lc9/b;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Ls9/h;

    .line 30
    .line 31
    iget-object v3, v2, Ls9/h;->a:Ls9/m;

    .line 32
    .line 33
    invoke-static {v3}, Lka/e0;->n(Ls9/e;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    sget-object v3, Ls9/o;->b:Ls9/o;

    .line 41
    .line 42
    invoke-static {v2, v3}, Ls9/k;->h(Ls9/h;Ls9/o;)Ls9/k;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {v1, v2, v3}, Lc9/c;->g(Ljava/lang/Object;Ljava/lang/Object;)Lc9/c;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-eqz v2, :cond_3

    .line 62
    .line 63
    new-instance v2, Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-direct {v2, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 66
    .line 67
    .line 68
    const/4 v3, 0x0

    .line 69
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    if-eqz v4, :cond_2

    .line 74
    .line 75
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    rsub-int v4, v4, 0x384

    .line 80
    .line 81
    if-ge v3, v4, :cond_2

    .line 82
    .line 83
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    add-int/lit8 v3, v3, 0x1

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->toArray()[Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    new-instance v3, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    const-string v4, "DELETE FROM remote_documents WHERE path IN ("

    .line 100
    .line 101
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    array-length v4, v2

    .line 105
    const-string v5, ", "

    .line 106
    .line 107
    const-string v6, "?"

    .line 108
    .line 109
    invoke-static {v4, v6, v5}, Lw9/p;->h(ILjava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    const-string v4, ")"

    .line 117
    .line 118
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    iget-object v4, p0, Lme/a;->a:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v4, Lr9/K;

    .line 128
    .line 129
    invoke-virtual {v4, v3, v2}, Lr9/K;->f0(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_3
    iget-object p1, p0, Lme/a;->c:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast p1, Lr9/f;

    .line 136
    .line 137
    invoke-interface {p1, v1}, Lr9/f;->n(Lc9/c;)V

    .line 138
    .line 139
    .line 140
    return-void
.end method
