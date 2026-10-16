.class public final LVa/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVa/jb;
.implements LVa/Ia;


# static fields
.field public static b:I = 0x0

.field public static c:I = 0x1


# instance fields
.field public synthetic a:LVa/x;


# direct methods
.method public static synthetic e(Landroid/app/Activity;)Lorg/json/JSONObject;
    .locals 2

    .line 1
    sget v0, LVa/p;->c:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x3b

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/p;->b:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-static {p0}, LVa/p;->g(Landroid/app/Activity;)Lorg/json/JSONObject;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    sget v0, LVa/p;->b:I

    .line 18
    .line 19
    add-int/lit8 v0, v0, 0x4b

    .line 20
    .line 21
    rem-int/lit16 v1, v0, 0x80

    .line 22
    .line 23
    sput v1, LVa/p;->c:I

    .line 24
    .line 25
    rem-int/lit8 v0, v0, 0x2

    .line 26
    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    const/16 v0, 0x12

    .line 30
    .line 31
    div-int/lit8 v0, v0, 0x0

    .line 32
    .line 33
    :cond_0
    return-object p0

    .line 34
    :cond_1
    invoke-static {p0}, LVa/p;->g(Landroid/app/Activity;)Lorg/json/JSONObject;

    .line 35
    .line 36
    .line 37
    const/4 p0, 0x0

    .line 38
    throw p0
.end method

.method public static f(ILjava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, [C

    .line 6
    .line 7
    sget-object v0, LVa/pb;->D:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    const-wide v1, 0x12faaaa5fe854e19L    # 3.021695587709985E-217

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    :try_start_0
    invoke-static {v1, v2, p1, p0}, LVa/pb;->z(J[CI)[C

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const/4 p1, 0x4

    .line 20
    sput p1, LVa/pb;->C:I

    .line 21
    .line 22
    :goto_0
    sget v3, LVa/pb;->C:I

    .line 23
    .line 24
    array-length v4, p0

    .line 25
    if-ge v3, v4, :cond_0

    .line 26
    .line 27
    add-int/lit8 v4, v3, -0x4

    .line 28
    .line 29
    aget-char v5, p0, v3

    .line 30
    .line 31
    rem-int/lit8 v6, v3, 0x4

    .line 32
    .line 33
    aget-char v6, p0, v6

    .line 34
    .line 35
    xor-int/2addr v5, v6

    .line 36
    int-to-long v5, v5

    .line 37
    int-to-long v7, v4

    .line 38
    mul-long/2addr v7, v1

    .line 39
    xor-long/2addr v5, v7

    .line 40
    long-to-int v4, v5

    .line 41
    int-to-char v4, v4

    .line 42
    aput-char v4, p0, v3

    .line 43
    .line 44
    add-int/lit8 v3, v3, 0x1

    .line 45
    .line 46
    sput v3, LVa/pb;->C:I

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception p0

    .line 50
    goto :goto_1

    .line 51
    :cond_0
    new-instance v1, Ljava/lang/String;

    .line 52
    .line 53
    array-length v2, p0

    .line 54
    sub-int/2addr v2, p1

    .line 55
    invoke-direct {v1, p0, p1, v2}, Ljava/lang/String;-><init>([CII)V

    .line 56
    .line 57
    .line 58
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    return-object v1

    .line 60
    :goto_1
    monitor-exit v0

    .line 61
    throw p0
.end method

.method public static g(Landroid/app/Activity;)Lorg/json/JSONObject;
    .locals 6

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    const-wide/16 v1, 0x0

    .line 7
    .line 8
    :try_start_0
    const-string v3, "\u13e2\u1383\u17b7\u59cd\u0e9f\u92d9\u7503\u2be7\udfdd\u9f06\uda6c"

    .line 9
    .line 10
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 11
    .line 12
    .line 13
    move-result-wide v4

    .line 14
    cmp-long v4, v4, v1

    .line 15
    .line 16
    invoke-static {v4, v3}, LVa/p;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {v0, v3, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    .line 34
    .line 35
    sget p0, LVa/p;->b:I

    .line 36
    .line 37
    add-int/lit8 p0, p0, 0x3d

    .line 38
    .line 39
    rem-int/lit16 p0, p0, 0x80

    .line 40
    .line 41
    sput p0, LVa/p;->c:I

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catch_0
    invoke-static {}, Landroid/view/ViewConfiguration;->getEdgeSlop()I

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    shr-int/lit8 p0, p0, 0x10

    .line 49
    .line 50
    add-int/lit8 p0, p0, 0x1

    .line 51
    .line 52
    const-string v3, "\u6f3a\u6f7b\ua665\ue812\uc38d\u5fde\udf47\u5727\u6e1b\u3560\u1772\u17ac\u1f81"

    .line 53
    .line 54
    invoke-static {p0, v3}, LVa/p;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-virtual {p0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-static {v1, v2}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    neg-int v1, v1

    .line 67
    const-string v2, "\u1528\u156d\u3665\u780e\uc48b\u58cb\u6aea\u2d3e\ufe53\u80ce\u107c\ua205\u6584\uc686\uc81f\udbba\ubc24\u8f2a\u81b6\u13cd\uf4d1\u57d1\ub920\u4b61\u0ca5\u1023\u72c3\u8490\u471d\ud81a"

    .line 68
    .line 69
    invoke-static {v1, v2}, LVa/p;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-static {p0, v1}, LVa/Ab;->x(Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    :goto_0
    sget p0, LVa/p;->b:I

    .line 81
    .line 82
    add-int/lit8 p0, p0, 0x1

    .line 83
    .line 84
    rem-int/lit16 v1, p0, 0x80

    .line 85
    .line 86
    sput v1, LVa/p;->c:I

    .line 87
    .line 88
    rem-int/lit8 p0, p0, 0x2

    .line 89
    .line 90
    if-eqz p0, :cond_0

    .line 91
    .line 92
    return-object v0

    .line 93
    :cond_0
    const/4 p0, 0x0

    .line 94
    throw p0
.end method


# virtual methods
.method public a(Landroid/app/Activity;)V
    .locals 2

    .line 1
    new-instance v0, LVa/o;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LVa/o;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iput-object p0, v0, LVa/o;->e:LVa/p;

    .line 8
    .line 9
    iput-object p1, v0, LVa/o;->d:Landroid/app/Activity;

    .line 10
    .line 11
    invoke-static {v0}, LVa/Cb;->j(LVa/Ba;)V

    .line 12
    .line 13
    .line 14
    sget p1, LVa/p;->b:I

    .line 15
    .line 16
    add-int/lit8 p1, p1, 0x69

    .line 17
    .line 18
    rem-int/lit16 v0, p1, 0x80

    .line 19
    .line 20
    sput v0, LVa/p;->c:I

    .line 21
    .line 22
    rem-int/lit8 p1, p1, 0x2

    .line 23
    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    const/4 p1, 0x0

    .line 28
    throw p1
.end method

.method public b(LVa/lb;Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p1, p0, LVa/p;->a:LVa/x;

    .line 2
    .line 3
    invoke-static {p1}, LVa/x;->f(LVa/x;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public c(LVa/lb;)V
    .locals 0

    .line 1
    iget-object p1, p0, LVa/p;->a:LVa/x;

    .line 2
    .line 3
    invoke-static {p1}, LVa/x;->f(LVa/x;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, LVa/x;->D(LVa/x;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public d(Landroid/app/Activity;)V
    .locals 2

    .line 1
    new-instance v0, LVa/o;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, LVa/o;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iput-object p0, v0, LVa/o;->e:LVa/p;

    .line 8
    .line 9
    iput-object p1, v0, LVa/o;->d:Landroid/app/Activity;

    .line 10
    .line 11
    invoke-static {v0}, LVa/Cb;->j(LVa/Ba;)V

    .line 12
    .line 13
    .line 14
    sget p1, LVa/p;->c:I

    .line 15
    .line 16
    add-int/lit8 p1, p1, 0x53

    .line 17
    .line 18
    rem-int/lit16 v0, p1, 0x80

    .line 19
    .line 20
    sput v0, LVa/p;->b:I

    .line 21
    .line 22
    rem-int/lit8 p1, p1, 0x2

    .line 23
    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    const/16 p1, 0x20

    .line 27
    .line 28
    div-int/lit8 p1, p1, 0x0

    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method public h(Ljava/util/ArrayList;)V
    .locals 7

    .line 1
    iget-object v0, p0, LVa/p;->a:LVa/x;

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-static {v0}, LVa/x;->f(LVa/x;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    new-instance v1, Ljava/util/PriorityQueue;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/util/PriorityQueue;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, LVa/Sa;

    .line 33
    .line 34
    new-instance v3, LVa/l;

    .line 35
    .line 36
    invoke-direct {v3, v2}, LVa/l;-><init>(LVa/Sa;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v3}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    check-cast v2, LVa/l;

    .line 53
    .line 54
    :goto_1
    const/4 v3, 0x0

    .line 55
    if-eqz v2, :cond_8

    .line 56
    .line 57
    sget v4, LVa/x;->s:I

    .line 58
    .line 59
    add-int/lit8 v4, v4, 0x35

    .line 60
    .line 61
    rem-int/lit16 v5, v4, 0x80

    .line 62
    .line 63
    sput v5, LVa/x;->r:I

    .line 64
    .line 65
    rem-int/lit8 v4, v4, 0x2

    .line 66
    .line 67
    if-eqz v4, :cond_2

    .line 68
    .line 69
    invoke-virtual {v0, v2}, LVa/x;->r(LVa/l;)Z

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    const/4 v5, 0x1

    .line 74
    div-int/lit8 v5, v5, 0x0

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_2
    invoke-virtual {v0, v2}, LVa/x;->r(LVa/l;)Z

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    :goto_2
    if-eqz v4, :cond_6

    .line 82
    .line 83
    invoke-virtual {v2}, LVa/l;->g()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    if-eqz v4, :cond_5

    .line 92
    .line 93
    sget v4, LVa/x;->r:I

    .line 94
    .line 95
    add-int/lit8 v5, v4, 0x75

    .line 96
    .line 97
    rem-int/lit16 v6, v5, 0x80

    .line 98
    .line 99
    sput v6, LVa/x;->s:I

    .line 100
    .line 101
    rem-int/lit8 v5, v5, 0x2

    .line 102
    .line 103
    if-nez v5, :cond_3

    .line 104
    .line 105
    iget-object v5, v0, LVa/x;->e:LVa/n;

    .line 106
    .line 107
    const/16 v6, 0x54

    .line 108
    .line 109
    div-int/lit8 v6, v6, 0x0

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_3
    iget-object v5, v0, LVa/x;->e:LVa/n;

    .line 113
    .line 114
    :goto_3
    add-int/lit8 v4, v4, 0x67

    .line 115
    .line 116
    rem-int/lit16 v6, v4, 0x80

    .line 117
    .line 118
    sput v6, LVa/x;->s:I

    .line 119
    .line 120
    rem-int/lit8 v4, v4, 0x2

    .line 121
    .line 122
    if-eqz v4, :cond_4

    .line 123
    .line 124
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    sget v3, LVa/lb;->e:I

    .line 128
    .line 129
    add-int/lit8 v3, v3, 0x57

    .line 130
    .line 131
    rem-int/lit16 v3, v3, 0x80

    .line 132
    .line 133
    sput v3, LVa/lb;->f:I

    .line 134
    .line 135
    add-int/lit8 v3, v3, 0x57

    .line 136
    .line 137
    rem-int/lit16 v3, v3, 0x80

    .line 138
    .line 139
    sput v3, LVa/lb;->e:I

    .line 140
    .line 141
    iget-object v3, v5, LVa/lb;->c:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v3, LVa/H;

    .line 144
    .line 145
    invoke-virtual {v3}, LVa/H;->c()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    invoke-virtual {v2, v3}, LVa/l;->h(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    goto :goto_4

    .line 153
    :cond_4
    throw v3

    .line 154
    :cond_5
    :goto_4
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    goto :goto_5

    .line 158
    :cond_6
    sget v4, LVa/x;->s:I

    .line 159
    .line 160
    add-int/lit8 v4, v4, 0x7

    .line 161
    .line 162
    rem-int/lit16 v5, v4, 0x80

    .line 163
    .line 164
    sput v5, LVa/x;->r:I

    .line 165
    .line 166
    rem-int/lit8 v4, v4, 0x2

    .line 167
    .line 168
    if-nez v4, :cond_7

    .line 169
    .line 170
    iget-object v3, v0, LVa/x;->d:LVa/cb;

    .line 171
    .line 172
    invoke-virtual {v2}, LVa/l;->d()LVa/Sa;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    invoke-static {}, LVa/Ra;->k()Landroid/os/Handler;

    .line 180
    .line 181
    .line 182
    move-result-object v4

    .line 183
    new-instance v5, LVa/y;

    .line 184
    .line 185
    const/16 v6, 0x10

    .line 186
    .line 187
    invoke-direct {v5, v6}, LVa/y;-><init>(I)V

    .line 188
    .line 189
    .line 190
    iput-object v3, v5, LVa/y;->e:Ljava/lang/Object;

    .line 191
    .line 192
    iput-object v2, v5, LVa/y;->d:Ljava/lang/Object;

    .line 193
    .line 194
    invoke-virtual {v4, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 195
    .line 196
    .line 197
    sget v2, LVa/cb;->k:I

    .line 198
    .line 199
    add-int/lit8 v2, v2, 0x4d

    .line 200
    .line 201
    rem-int/lit16 v2, v2, 0x80

    .line 202
    .line 203
    sput v2, LVa/cb;->l:I

    .line 204
    .line 205
    :goto_5
    invoke-virtual {v1}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    check-cast v2, LVa/l;

    .line 210
    .line 211
    goto/16 :goto_1

    .line 212
    .line 213
    :cond_7
    iget-object p1, v0, LVa/x;->d:LVa/cb;

    .line 214
    .line 215
    throw v3

    .line 216
    :cond_8
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 217
    .line 218
    .line 219
    move-result v1

    .line 220
    if-nez v1, :cond_b

    .line 221
    .line 222
    sget v1, LVa/x;->r:I

    .line 223
    .line 224
    add-int/lit8 v1, v1, 0x7

    .line 225
    .line 226
    rem-int/lit16 v2, v1, 0x80

    .line 227
    .line 228
    sput v2, LVa/x;->s:I

    .line 229
    .line 230
    rem-int/lit8 v1, v1, 0x2

    .line 231
    .line 232
    if-nez v1, :cond_9

    .line 233
    .line 234
    invoke-virtual {v0, p1, p0}, LVa/x;->q(Ljava/util/ArrayList;LVa/p;)V

    .line 235
    .line 236
    .line 237
    const/16 p1, 0x1f

    .line 238
    .line 239
    div-int/lit8 p1, p1, 0x0

    .line 240
    .line 241
    goto :goto_6

    .line 242
    :cond_9
    invoke-virtual {v0, p1, p0}, LVa/x;->q(Ljava/util/ArrayList;LVa/p;)V

    .line 243
    .line 244
    .line 245
    :goto_6
    sget p1, LVa/x;->s:I

    .line 246
    .line 247
    add-int/lit8 p1, p1, 0x3d

    .line 248
    .line 249
    rem-int/lit16 v1, p1, 0x80

    .line 250
    .line 251
    sput v1, LVa/x;->r:I

    .line 252
    .line 253
    rem-int/lit8 p1, p1, 0x2

    .line 254
    .line 255
    if-nez p1, :cond_a

    .line 256
    .line 257
    goto :goto_7

    .line 258
    :cond_a
    throw v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 259
    :cond_b
    :goto_7
    return-void

    .line 260
    :catch_0
    invoke-static {v0}, LVa/x;->f(LVa/x;)V

    .line 261
    .line 262
    .line 263
    return-void
.end method
