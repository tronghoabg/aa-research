.class public final LVa/O;
.super LVa/Ba;
.source "SourceFile"


# static fields
.field public static h:I = 0x0

.field public static i:I = 0x1


# instance fields
.field public final synthetic c:I

.field public synthetic d:Ljava/lang/Object;

.field public synthetic e:Ljava/lang/Object;

.field public synthetic f:Ljava/lang/Object;

.field public synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LVa/O;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(LVa/V;LVa/B7;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LVa/O;->c:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LVa/O;->g:Ljava/lang/Object;

    iput-object p2, p0, LVa/O;->d:Ljava/lang/Object;

    iput-object p3, p0, LVa/O;->e:Ljava/lang/Object;

    iput-object p4, p0, LVa/O;->f:Ljava/lang/Object;

    return-void
.end method

.method public static b(ILjava/lang/String;)Ljava/lang/String;
    .locals 12

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
    sget-object v0, LVa/Ab;->F:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    array-length v1, p1

    .line 11
    new-array v1, v1, [C

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    sput v2, LVa/Ab;->E:I

    .line 15
    .line 16
    const/4 v3, 0x2

    .line 17
    new-array v3, v3, [C

    .line 18
    .line 19
    :goto_0
    sget v4, LVa/Ab;->E:I

    .line 20
    .line 21
    array-length v5, p1

    .line 22
    if-ge v4, v5, :cond_1

    .line 23
    .line 24
    aget-char v5, p1, v4

    .line 25
    .line 26
    aput-char v5, v3, v2

    .line 27
    .line 28
    add-int/lit8 v4, v4, 0x1

    .line 29
    .line 30
    aget-char v4, p1, v4

    .line 31
    .line 32
    const/4 v5, 0x1

    .line 33
    aput-char v4, v3, v5

    .line 34
    .line 35
    const v4, 0xe370

    .line 36
    .line 37
    .line 38
    move v6, v2

    .line 39
    :goto_1
    const/16 v7, 0x10

    .line 40
    .line 41
    if-ge v6, v7, :cond_0

    .line 42
    .line 43
    aget-char v7, v3, v5

    .line 44
    .line 45
    aget-char v8, v3, v2

    .line 46
    .line 47
    add-int v9, v8, v4

    .line 48
    .line 49
    shl-int/lit8 v10, v8, 0x4

    .line 50
    .line 51
    const v11, 0xa9b0

    .line 52
    .line 53
    .line 54
    add-int/2addr v10, v11

    .line 55
    xor-int/2addr v9, v10

    .line 56
    ushr-int/lit8 v10, v8, 0x5

    .line 57
    .line 58
    const v11, 0xcaa2

    .line 59
    .line 60
    .line 61
    add-int/2addr v10, v11

    .line 62
    xor-int/2addr v9, v10

    .line 63
    sub-int/2addr v7, v9

    .line 64
    int-to-char v7, v7

    .line 65
    aput-char v7, v3, v5

    .line 66
    .line 67
    add-int v9, v7, v4

    .line 68
    .line 69
    shl-int/lit8 v10, v7, 0x4

    .line 70
    .line 71
    add-int/lit16 v10, v10, 0x1c05

    .line 72
    .line 73
    xor-int/2addr v9, v10

    .line 74
    ushr-int/lit8 v7, v7, 0x5

    .line 75
    .line 76
    const v10, 0xe182

    .line 77
    .line 78
    .line 79
    add-int/2addr v7, v10

    .line 80
    xor-int/2addr v7, v9

    .line 81
    sub-int/2addr v8, v7

    .line 82
    int-to-char v7, v8

    .line 83
    aput-char v7, v3, v2

    .line 84
    .line 85
    const v7, 0x9e37

    .line 86
    .line 87
    .line 88
    sub-int/2addr v4, v7

    .line 89
    add-int/lit8 v6, v6, 0x1

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :catchall_0
    move-exception p0

    .line 93
    goto :goto_2

    .line 94
    :cond_0
    sget v4, LVa/Ab;->E:I

    .line 95
    .line 96
    aget-char v6, v3, v2

    .line 97
    .line 98
    aput-char v6, v1, v4

    .line 99
    .line 100
    add-int/lit8 v6, v4, 0x1

    .line 101
    .line 102
    aget-char v5, v3, v5

    .line 103
    .line 104
    aput-char v5, v1, v6

    .line 105
    .line 106
    add-int/lit8 v4, v4, 0x2

    .line 107
    .line 108
    sput v4, LVa/Ab;->E:I

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_1
    new-instance p1, Ljava/lang/String;

    .line 112
    .line 113
    invoke-direct {p1, v1, v2, p0}, Ljava/lang/String;-><init>([CII)V

    .line 114
    .line 115
    .line 116
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 117
    return-object p1

    .line 118
    :goto_2
    monitor-exit v0

    .line 119
    throw p0
.end method

.method public static d(Ljava/lang/String;I)Ljava/lang/String;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, [C

    .line 6
    .line 7
    sget-object v0, LVa/a;->u:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    sput p1, LVa/a;->t:I

    .line 11
    .line 12
    array-length p1, p0

    .line 13
    new-array p1, p1, [C

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    sput v1, LVa/a;->s:I

    .line 17
    .line 18
    :goto_0
    sget v1, LVa/a;->s:I

    .line 19
    .line 20
    array-length v2, p0

    .line 21
    if-ge v1, v2, :cond_0

    .line 22
    .line 23
    aget-char v2, p0, v1

    .line 24
    .line 25
    sget v3, LVa/a;->t:I

    .line 26
    .line 27
    mul-int/2addr v3, v1

    .line 28
    xor-int/2addr v2, v3

    .line 29
    int-to-long v2, v2

    .line 30
    const-wide v4, -0x3c0645bec2653045L    # -2.9661854871399936E19

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    xor-long/2addr v2, v4

    .line 36
    long-to-int v2, v2

    .line 37
    int-to-char v2, v2

    .line 38
    aput-char v2, p1, v1

    .line 39
    .line 40
    add-int/lit8 v1, v1, 0x1

    .line 41
    .line 42
    sput v1, LVa/a;->s:I

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception p0

    .line 46
    goto :goto_1

    .line 47
    :cond_0
    new-instance p0, Ljava/lang/String;

    .line 48
    .line 49
    invoke-direct {p0, p1}, Ljava/lang/String;-><init>([C)V

    .line 50
    .line 51
    .line 52
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    return-object p0

    .line 54
    :goto_1
    monitor-exit v0

    .line 55
    throw p0
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)V
    .locals 8

    .line 1
    iget v0, p0, LVa/O;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, LVa/Ba;->a(Ljava/lang/Throwable;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    sget v0, LVa/O;->h:I

    .line 11
    .line 12
    add-int/lit8 v0, v0, 0x29

    .line 13
    .line 14
    rem-int/lit16 v0, v0, 0x80

    .line 15
    .line 16
    sput v0, LVa/O;->i:I

    .line 17
    .line 18
    iget-object v0, p0, LVa/O;->g:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, LVa/V;

    .line 21
    .line 22
    invoke-static {v0}, LVa/V;->A(LVa/V;)LVa/la;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object v1, p0, LVa/O;->e:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Ljava/lang/String;

    .line 29
    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    sget-object v2, LVa/b0;->f:LVa/b0;

    .line 33
    .line 34
    new-instance v3, LVa/Da;

    .line 35
    .line 36
    const/4 v4, 0x6

    .line 37
    invoke-direct {v3, v0, v1, v2, v4}, LVa/Da;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 38
    .line 39
    .line 40
    invoke-static {v3}, LVa/Cb;->g(LVa/Ba;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    const-string v0, ""

    .line 44
    .line 45
    const/4 v2, 0x0

    .line 46
    invoke-static {v0, v2, v2}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    rsub-int/lit8 v0, v0, 0x10

    .line 51
    .line 52
    const-string v2, "\u77e7\ud24b\ua6f3\u77ae\ue077\u5fea\u9213\u7e69\ud452\u4e09\ueed6\ucfdb\u59bc\uf922\u5668\u07b9"

    .line 53
    .line 54
    invoke-static {v0, v2}, LVa/O;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    new-instance v0, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    shr-int/lit8 v3, v3, 0x16

    .line 72
    .line 73
    rsub-int v3, v3, 0x2da9

    .line 74
    .line 75
    const-string v4, "\ucffe\ue260\u949b\u472f\u796d\u2bd6\ude24\uf04a\ua29a\u553e\u0748\u3999\uec3b\u9e47\ub0ff\u6335\u1545\uc7e5\ufa79\uac53\u5ee0\u7108\u2353\ud5f1\u8800\uba4e\u6cfe\u1f1a\u31e7"

    .line 76
    .line 77
    invoke-static {v4, v3}, LVa/O;->d(Ljava/lang/String;I)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    const/4 v7, 0x1

    .line 96
    const/4 v5, 0x1

    .line 97
    const/4 v6, 0x1

    .line 98
    move-object v4, p1

    .line 99
    invoke-static/range {v2 .. v7}, LVa/Ab;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZZZ)V

    .line 100
    .line 101
    .line 102
    sget p1, LVa/O;->h:I

    .line 103
    .line 104
    add-int/lit8 p1, p1, 0x45

    .line 105
    .line 106
    rem-int/lit16 v0, p1, 0x80

    .line 107
    .line 108
    sput v0, LVa/O;->i:I

    .line 109
    .line 110
    rem-int/lit8 p1, p1, 0x2

    .line 111
    .line 112
    if-eqz p1, :cond_1

    .line 113
    .line 114
    return-void

    .line 115
    :cond_1
    const/4 p1, 0x0

    .line 116
    throw p1

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c()V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, LVa/O;->c:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, LVa/O;->d:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lorg/json/JSONObject;

    .line 11
    .line 12
    invoke-static {v1}, LVa/ba;->f(Lorg/json/JSONObject;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    iget-object v3, v0, LVa/O;->g:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, LVa/ba;

    .line 19
    .line 20
    invoke-static {v3}, LVa/ba;->q(LVa/ba;)Ljava/util/HashMap;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    invoke-virtual {v4, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    check-cast v4, LVa/i;

    .line 29
    .line 30
    iget-object v5, v0, LVa/O;->e:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v5, LVa/ha;

    .line 33
    .line 34
    if-nez v4, :cond_0

    .line 35
    .line 36
    new-instance v4, LVa/i;

    .line 37
    .line 38
    invoke-direct {v4, v1, v5}, LVa/i;-><init>(Lorg/json/JSONObject;LVa/ha;)V

    .line 39
    .line 40
    .line 41
    invoke-static {v3}, LVa/ba;->q(LVa/ba;)Ljava/util/HashMap;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v1, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    invoke-virtual {v4, v1, v5}, LVa/i;->z(Lorg/json/JSONObject;LVa/ha;)V

    .line 50
    .line 51
    .line 52
    :goto_0
    iget-object v1, v0, LVa/O;->f:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v1, LVa/s7;

    .line 55
    .line 56
    invoke-virtual {v4, v1}, LVa/Mb;->l(LVa/Lb;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :pswitch_0
    iget-object v1, v0, LVa/O;->d:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v1, Landroid/view/ViewGroup;

    .line 63
    .line 64
    iget-object v2, v0, LVa/O;->e:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v2, LVa/K7;

    .line 67
    .line 68
    invoke-static {v1, v2}, LVa/cb;->f(Landroid/view/View;LVa/K7;)V

    .line 69
    .line 70
    .line 71
    const/4 v3, 0x0

    .line 72
    :goto_1
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    iget-object v5, v0, LVa/O;->f:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v5, LVa/ab;

    .line 79
    .line 80
    if-ge v3, v4, :cond_3

    .line 81
    .line 82
    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    instance-of v6, v4, Landroid/view/ViewGroup;

    .line 87
    .line 88
    if-eqz v6, :cond_2

    .line 89
    .line 90
    check-cast v4, Landroid/view/ViewGroup;

    .line 91
    .line 92
    sget v6, LVa/cb;->g:I

    .line 93
    .line 94
    add-int/lit8 v6, v6, 0x3d

    .line 95
    .line 96
    rem-int/lit16 v7, v6, 0x80

    .line 97
    .line 98
    sput v7, LVa/cb;->f:I

    .line 99
    .line 100
    rem-int/lit8 v6, v6, 0x2

    .line 101
    .line 102
    iget-object v7, v0, LVa/O;->g:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v7, LVa/cb;

    .line 105
    .line 106
    invoke-virtual {v7, v4, v5}, LVa/cb;->q(Landroid/view/ViewGroup;LVa/ab;)V

    .line 107
    .line 108
    .line 109
    if-nez v6, :cond_1

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_1
    const/4 v1, 0x0

    .line 113
    throw v1

    .line 114
    :cond_2
    invoke-static {v4, v2}, LVa/cb;->f(Landroid/view/View;LVa/K7;)V

    .line 115
    .line 116
    .line 117
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_3
    invoke-virtual {v1, v5}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v1, v5}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 124
    .line 125
    .line 126
    return-void

    .line 127
    :pswitch_1
    iget-object v1, v0, LVa/O;->d:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v1, Ljava/util/List;

    .line 130
    .line 131
    const/4 v2, 0x0

    .line 132
    invoke-interface {v1, v2, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    iget-object v3, v0, LVa/O;->f:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v3, LVa/x8;

    .line 138
    .line 139
    iget-object v4, v0, LVa/O;->g:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v4, LVa/y7;

    .line 142
    .line 143
    iget-object v5, v0, LVa/O;->e:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v5, LVa/r8;

    .line 146
    .line 147
    invoke-virtual {v5, v3, v4, v1}, LVa/r8;->c(LVa/x8;LVa/y7;Ljava/util/List;)LVa/s8;

    .line 148
    .line 149
    .line 150
    invoke-interface {v1, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :pswitch_2
    iget-object v1, v0, LVa/O;->g:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v1, LVa/K7;

    .line 157
    .line 158
    iget-object v1, v1, LVa/K7;->b:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v1, LVa/X9;

    .line 161
    .line 162
    iget-object v2, v0, LVa/O;->e:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v2, Landroid/view/View;

    .line 165
    .line 166
    iget-object v3, v0, LVa/O;->f:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v3, Landroid/view/MotionEvent;

    .line 169
    .line 170
    iget-object v4, v0, LVa/O;->d:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v4, LVa/Y9;

    .line 173
    .line 174
    invoke-interface {v1, v4, v2, v3}, LVa/X9;->a(LVa/Y9;Landroid/view/View;Landroid/view/MotionEvent;)Z

    .line 175
    .line 176
    .line 177
    return-void

    .line 178
    :pswitch_3
    iget-object v1, v0, LVa/O;->d:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v1, LVa/B7;

    .line 181
    .line 182
    invoke-static {v1}, LVa/V;->H(LVa/B7;)Lorg/json/JSONObject;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    const/4 v3, 0x0

    .line 187
    invoke-static {v3, v3}, Landroid/view/KeyEvent;->getDeadChar(II)I

    .line 188
    .line 189
    .line 190
    move-result v4

    .line 191
    add-int/lit16 v4, v4, 0x62ff

    .line 192
    .line 193
    const-string v5, "\ucfde\uad3c"

    .line 194
    .line 195
    invoke-static {v5, v4}, LVa/O;->d(Ljava/lang/String;I)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v4

    .line 199
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v4

    .line 203
    const/4 v6, 0x1

    .line 204
    invoke-virtual {v2, v4, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 205
    .line 206
    .line 207
    iget-object v4, v0, LVa/O;->g:Ljava/lang/Object;

    .line 208
    .line 209
    check-cast v4, LVa/V;

    .line 210
    .line 211
    invoke-static {v4}, LVa/V;->h(LVa/V;)Ljava/util/HashMap;

    .line 212
    .line 213
    .line 214
    move-result-object v7

    .line 215
    invoke-virtual {v1}, LVa/B7;->j()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v8

    .line 219
    invoke-virtual {v7, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v1}, LVa/B7;->h()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v7

    .line 226
    invoke-static {v4}, LVa/V;->A(LVa/V;)LVa/la;

    .line 227
    .line 228
    .line 229
    move-result-object v8

    .line 230
    const-string v9, ""

    .line 231
    .line 232
    invoke-static {v9}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    .line 233
    .line 234
    .line 235
    move-result v10

    .line 236
    const v11, 0xd258

    .line 237
    .line 238
    .line 239
    sub-int/2addr v11, v10

    .line 240
    const-string v10, "\ucfff\u1dab\u6b5a\ub8f1\u869d\ud44a\u21e8\u0f90"

    .line 241
    .line 242
    invoke-static {v10, v11}, LVa/O;->d(Ljava/lang/String;I)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v10

    .line 246
    invoke-virtual {v10}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v10

    .line 250
    invoke-virtual {v10, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result v10

    .line 254
    const/4 v11, 0x0

    .line 255
    const-string v12, "\u77e7\ud24b\ua6f3\u77ae\ue077\u5fea\u9213\u7e69\ud452\u4e09\ueed6\ucfdb\u59bc\uf922\u5668\u07b9"

    .line 256
    .line 257
    iget-object v13, v0, LVa/O;->e:Ljava/lang/Object;

    .line 258
    .line 259
    check-cast v13, Ljava/lang/String;

    .line 260
    .line 261
    if-eqz v10, :cond_4

    .line 262
    .line 263
    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    .line 264
    .line 265
    .line 266
    move-result v3

    .line 267
    cmpl-float v3, v3, v11

    .line 268
    .line 269
    add-int/lit8 v3, v3, 0xf

    .line 270
    .line 271
    invoke-static {v3, v12}, LVa/O;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v3

    .line 275
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v3

    .line 279
    new-instance v4, Ljava/lang/StringBuilder;

    .line 280
    .line 281
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v1}, LVa/B7;->o()Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    invoke-static {v9}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    .line 292
    .line 293
    .line 294
    move-result v1

    .line 295
    rsub-int/lit8 v1, v1, 0x16

    .line 296
    .line 297
    const-string v6, "\u5b27\u464e\uf783\u9643\ueb7d\u3b5b\u927c\ue425\u6796\u1977\uceec\uf753\u092a\u7ad1\ufe8a\u814c\u14a6\u2631\u77ba\u71e5\u3e66\u4b52"

    .line 298
    .line 299
    invoke-static {v1, v6}, LVa/O;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v1

    .line 307
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    invoke-static {v3, v1}, LVa/Ab;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 315
    .line 316
    .line 317
    if-eqz v8, :cond_b

    .line 318
    .line 319
    sget-object v1, LVa/a0;->e:LVa/a0;

    .line 320
    .line 321
    new-instance v3, LVa/Da;

    .line 322
    .line 323
    const/16 v4, 0x8

    .line 324
    .line 325
    invoke-direct {v3, v8, v13, v1, v4}, LVa/Da;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 326
    .line 327
    .line 328
    invoke-static {v3}, LVa/Cb;->g(LVa/Ba;)V

    .line 329
    .line 330
    .line 331
    goto/16 :goto_4

    .line 332
    .line 333
    :cond_4
    invoke-static {v4, v13}, LVa/V;->E(LVa/V;Ljava/lang/String;)Z

    .line 334
    .line 335
    .line 336
    move-result v10

    .line 337
    if-eqz v10, :cond_6

    .line 338
    .line 339
    invoke-static {v3, v3, v3, v3}, Landroid/graphics/Color;->argb(IIII)I

    .line 340
    .line 341
    .line 342
    move-result v4

    .line 343
    add-int/lit8 v4, v4, 0x10

    .line 344
    .line 345
    invoke-static {v4, v12}, LVa/O;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v4

    .line 349
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v4

    .line 353
    new-instance v7, Ljava/lang/StringBuilder;

    .line 354
    .line 355
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 356
    .line 357
    .line 358
    invoke-virtual {v1}, LVa/B7;->o()Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v1

    .line 362
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 363
    .line 364
    .line 365
    const v1, 0xb173

    .line 366
    .line 367
    .line 368
    invoke-static {v3, v3}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    .line 369
    .line 370
    .line 371
    move-result v9

    .line 372
    sub-int/2addr v1, v9

    .line 373
    const-string v9, "\ucf9b\u7eab\uad32\udb8c\u0a19\ub8e1\ue76a\u15ea\u444c\uf2c2\u21e5\u503d\u9ebe\ucd1f\u7bd1\uaa62\ud8e2\u076b\ub5cc\ue450\u132b\u41b1\uf03d\u3ece\u6d15\u9bf2\uca7a\u78f7\ua70f\ud5c8\u04a9\ub333\ue1fb\u101b\u5e98\u8d70\u3be1\u6a41\u98db"

    .line 374
    .line 375
    invoke-static {v9, v1}, LVa/O;->d(Ljava/lang/String;I)Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v1

    .line 379
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v1

    .line 383
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 384
    .line 385
    .line 386
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v1

    .line 390
    invoke-static {v4, v1}, LVa/Ab;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 391
    .line 392
    .line 393
    if-eqz v8, :cond_5

    .line 394
    .line 395
    sget-object v1, LVa/a0;->e:LVa/a0;

    .line 396
    .line 397
    new-instance v4, LVa/Da;

    .line 398
    .line 399
    const/16 v7, 0x8

    .line 400
    .line 401
    invoke-direct {v4, v8, v13, v1, v7}, LVa/Da;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 402
    .line 403
    .line 404
    invoke-static {v4}, LVa/Cb;->g(LVa/Ba;)V

    .line 405
    .line 406
    .line 407
    :cond_5
    invoke-static {v3, v3}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    .line 408
    .line 409
    .line 410
    move-result v1

    .line 411
    rsub-int/lit8 v1, v1, 0x3

    .line 412
    .line 413
    const-string v3, "\u0858\ue84c\udbe2\u8bba"

    .line 414
    .line 415
    invoke-static {v1, v3}, LVa/O;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object v1

    .line 419
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v1

    .line 423
    invoke-virtual {v2, v1, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 424
    .line 425
    .line 426
    goto/16 :goto_4

    .line 427
    .line 428
    :cond_6
    sget v6, LVa/V;->p:I

    .line 429
    .line 430
    add-int/lit8 v6, v6, 0x57

    .line 431
    .line 432
    rem-int/lit16 v10, v6, 0x80

    .line 433
    .line 434
    sput v10, LVa/V;->q:I

    .line 435
    .line 436
    rem-int/lit8 v6, v6, 0x2

    .line 437
    .line 438
    if-eqz v6, :cond_c

    .line 439
    .line 440
    invoke-static {}, LVa/G;->S()LVa/G;

    .line 441
    .line 442
    .line 443
    move-result-object v6

    .line 444
    invoke-virtual {v6}, LVa/G;->B()Z

    .line 445
    .line 446
    .line 447
    move-result v6

    .line 448
    sget v10, LVa/V;->q:I

    .line 449
    .line 450
    add-int/lit8 v10, v10, 0x79

    .line 451
    .line 452
    rem-int/lit16 v10, v10, 0x80

    .line 453
    .line 454
    sput v10, LVa/V;->p:I

    .line 455
    .line 456
    if-nez v6, :cond_a

    .line 457
    .line 458
    sget v6, LVa/O;->h:I

    .line 459
    .line 460
    add-int/lit8 v6, v6, 0x37

    .line 461
    .line 462
    rem-int/lit16 v10, v6, 0x80

    .line 463
    .line 464
    sput v10, LVa/O;->i:I

    .line 465
    .line 466
    rem-int/lit8 v6, v6, 0x2

    .line 467
    .line 468
    if-nez v6, :cond_7

    .line 469
    .line 470
    invoke-static {v1, v7}, LVa/V;->z(LVa/B7;Ljava/lang/String;)Z

    .line 471
    .line 472
    .line 473
    move-result v6

    .line 474
    const/4 v10, 0x2

    .line 475
    div-int/2addr v10, v3

    .line 476
    if-eqz v6, :cond_8

    .line 477
    .line 478
    goto/16 :goto_3

    .line 479
    .line 480
    :cond_7
    invoke-static {v1, v7}, LVa/V;->z(LVa/B7;Ljava/lang/String;)Z

    .line 481
    .line 482
    .line 483
    move-result v6

    .line 484
    if-eqz v6, :cond_8

    .line 485
    .line 486
    goto/16 :goto_3

    .line 487
    .line 488
    :cond_8
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    .line 489
    .line 490
    .line 491
    move-result v6

    .line 492
    shr-int/lit8 v6, v6, 0x10

    .line 493
    .line 494
    add-int/lit16 v6, v6, 0xb11

    .line 495
    .line 496
    const-string v10, "\ucfc8\uc4dc\ud9ea"

    .line 497
    .line 498
    invoke-static {v10, v6}, LVa/O;->d(Ljava/lang/String;I)Ljava/lang/String;

    .line 499
    .line 500
    .line 501
    move-result-object v6

    .line 502
    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 503
    .line 504
    .line 505
    move-result-object v6

    .line 506
    invoke-virtual {v2, v6, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 507
    .line 508
    .line 509
    if-eqz v8, :cond_9

    .line 510
    .line 511
    sget-object v6, LVa/b0;->c:LVa/b0;

    .line 512
    .line 513
    new-instance v10, LVa/Da;

    .line 514
    .line 515
    const/4 v14, 0x6

    .line 516
    invoke-direct {v10, v8, v13, v6, v14}, LVa/Da;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 517
    .line 518
    .line 519
    invoke-static {v10}, LVa/Cb;->g(LVa/Ba;)V

    .line 520
    .line 521
    .line 522
    :cond_9
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 523
    .line 524
    .line 525
    move-result-wide v13

    .line 526
    const-wide/16 v15, 0x0

    .line 527
    .line 528
    cmp-long v6, v13, v15

    .line 529
    .line 530
    rsub-int/lit8 v6, v6, 0x11

    .line 531
    .line 532
    invoke-static {v6, v12}, LVa/O;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 533
    .line 534
    .line 535
    move-result-object v6

    .line 536
    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 537
    .line 538
    .line 539
    move-result-object v17

    .line 540
    new-instance v6, Ljava/lang/StringBuilder;

    .line 541
    .line 542
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 543
    .line 544
    .line 545
    iget-object v8, v0, LVa/O;->f:Ljava/lang/Object;

    .line 546
    .line 547
    check-cast v8, Ljava/lang/String;

    .line 548
    .line 549
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 550
    .line 551
    .line 552
    const/16 v8, 0x30

    .line 553
    .line 554
    invoke-static {v9, v8, v3, v3}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CII)I

    .line 555
    .line 556
    .line 557
    move-result v8

    .line 558
    rsub-int/lit8 v8, v8, 0xc

    .line 559
    .line 560
    const-string v9, "\uc92a\u1dbe\u4137\u4b30\uf5eb\u45f7\u5668\u07b9\u59a2\u2b8a\uf783\u9643\ue28e\u346c"

    .line 561
    .line 562
    invoke-static {v8, v9}, LVa/O;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 563
    .line 564
    .line 565
    move-result-object v8

    .line 566
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 567
    .line 568
    .line 569
    move-result-object v8

    .line 570
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 571
    .line 572
    .line 573
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 574
    .line 575
    .line 576
    invoke-static {v3}, Landroid/graphics/Color;->green(I)I

    .line 577
    .line 578
    .line 579
    move-result v7

    .line 580
    add-int/lit8 v7, v7, 0x26

    .line 581
    .line 582
    const-string v8, "\uceec\uf753\u092a\u7ad1\udc37\u54c6\u86cd\uc270\u68db\ub21a\u86cd\uc270\u26d6\ub4d8\ue9a5\u1d11\u6796\u1977\uc53f\u6ad5\u1c18\u8e8d\uf668\u0dfe\uc909\ud0af\u3b29\u82fe\u5b27\u464e\uf783\u9643\ueb7d\u3b5b\u927c\ue425\u6796\u1977"

    .line 583
    .line 584
    invoke-static {v7, v8}, LVa/O;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 585
    .line 586
    .line 587
    move-result-object v7

    .line 588
    invoke-virtual {v7}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 589
    .line 590
    .line 591
    move-result-object v7

    .line 592
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 593
    .line 594
    .line 595
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 596
    .line 597
    .line 598
    move-result-object v18

    .line 599
    const/16 v19, 0x0

    .line 600
    .line 601
    const/16 v20, 0x1

    .line 602
    .line 603
    const/16 v21, 0x1

    .line 604
    .line 605
    const/16 v22, 0x0

    .line 606
    .line 607
    invoke-static/range {v17 .. v22}, LVa/Ab;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZZZ)V

    .line 608
    .line 609
    .line 610
    invoke-virtual {v1}, LVa/B7;->b()Z

    .line 611
    .line 612
    .line 613
    move-result v6

    .line 614
    if-eqz v6, :cond_b

    .line 615
    .line 616
    invoke-virtual {v4}, LVa/V;->L()Lcom/ironsource/adqualitysdk/sdk/ISAdQualityInitListener;

    .line 617
    .line 618
    .line 619
    move-result-object v4

    .line 620
    sget-object v6, Lcom/ironsource/adqualitysdk/sdk/ISAdQualityInitError;->AD_NETWORK_VERSION_NOT_SUPPORTED_YET:Lcom/ironsource/adqualitysdk/sdk/ISAdQualityInitError;

    .line 621
    .line 622
    new-instance v7, Ljava/lang/StringBuilder;

    .line 623
    .line 624
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 625
    .line 626
    .line 627
    invoke-virtual {v1}, LVa/B7;->o()Ljava/lang/String;

    .line 628
    .line 629
    .line 630
    move-result-object v10

    .line 631
    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 632
    .line 633
    .line 634
    invoke-static {v3}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    .line 635
    .line 636
    .line 637
    move-result v3

    .line 638
    add-int/lit8 v3, v3, 0xe

    .line 639
    .line 640
    invoke-static {v3, v9}, LVa/O;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 641
    .line 642
    .line 643
    move-result-object v3

    .line 644
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 645
    .line 646
    .line 647
    move-result-object v3

    .line 648
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 649
    .line 650
    .line 651
    invoke-virtual {v1}, LVa/B7;->h()Ljava/lang/String;

    .line 652
    .line 653
    .line 654
    move-result-object v1

    .line 655
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 656
    .line 657
    .line 658
    invoke-static/range {v15 .. v16}, Landroid/widget/ExpandableListView;->getPackedPositionType(J)I

    .line 659
    .line 660
    .line 661
    move-result v1

    .line 662
    add-int/lit8 v1, v1, 0x26

    .line 663
    .line 664
    invoke-static {v1, v8}, LVa/O;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 665
    .line 666
    .line 667
    move-result-object v1

    .line 668
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 669
    .line 670
    .line 671
    move-result-object v1

    .line 672
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 673
    .line 674
    .line 675
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 676
    .line 677
    .line 678
    move-result-object v1

    .line 679
    check-cast v4, LVa/Hb;

    .line 680
    .line 681
    invoke-virtual {v4, v6, v1}, LVa/Hb;->adQualitySdkInitFailed(Lcom/ironsource/adqualitysdk/sdk/ISAdQualityInitError;Ljava/lang/String;)V

    .line 682
    .line 683
    .line 684
    sget v1, LVa/O;->i:I

    .line 685
    .line 686
    add-int/lit8 v1, v1, 0x27

    .line 687
    .line 688
    rem-int/lit16 v1, v1, 0x80

    .line 689
    .line 690
    sput v1, LVa/O;->h:I

    .line 691
    .line 692
    goto :goto_4

    .line 693
    :cond_a
    :goto_3
    new-instance v3, LVa/v;

    .line 694
    .line 695
    const/4 v6, 0x1

    .line 696
    invoke-direct {v3, v6}, LVa/v;-><init>(I)V

    .line 697
    .line 698
    .line 699
    iput-object v0, v3, LVa/v;->d:Ljava/lang/Object;

    .line 700
    .line 701
    invoke-static {v3}, LVa/Cb;->e(LVa/Ba;)V

    .line 702
    .line 703
    .line 704
    invoke-static {v4}, LVa/V;->t(LVa/V;)Ljava/util/List;

    .line 705
    .line 706
    .line 707
    move-result-object v3

    .line 708
    check-cast v3, Ljava/util/ArrayList;

    .line 709
    .line 710
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 711
    .line 712
    .line 713
    :cond_b
    :goto_4
    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    .line 714
    .line 715
    .line 716
    move-result v1

    .line 717
    cmpl-float v1, v1, v11

    .line 718
    .line 719
    rsub-int v1, v1, 0x6300

    .line 720
    .line 721
    invoke-static {v5, v1}, LVa/O;->d(Ljava/lang/String;I)Ljava/lang/String;

    .line 722
    .line 723
    .line 724
    move-result-object v1

    .line 725
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 726
    .line 727
    .line 728
    move-result-object v1

    .line 729
    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 730
    .line 731
    .line 732
    return-void

    .line 733
    :cond_c
    invoke-static {}, LVa/G;->S()LVa/G;

    .line 734
    .line 735
    .line 736
    move-result-object v1

    .line 737
    invoke-virtual {v1}, LVa/G;->B()Z

    .line 738
    .line 739
    .line 740
    const/4 v1, 0x0

    .line 741
    throw v1

    .line 742
    nop

    .line 743
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
