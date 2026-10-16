.class public final LVa/ha;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVa/jb;


# static fields
.field public static c:LVa/ha; = null

.field public static final d:[B

.field public static e:I = 0x0

.field public static f:I = 0x1


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x2b

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LVa/ha;->d:[B

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 1
        0xet
        0xbt
        0x2ct
        -0x2at
        -0xft
        0x1dt
        -0x5t
        0x26t
        -0x29t
        -0x10t
        0x70t
        0x7ct
        -0x74t
        0x74t
        -0x72t
        -0x7ft
        -0x64t
        0x50t
        0x71t
        -0x63t
        0x7bt
        -0x5at
        0x57t
        0x70t
        0xet
        -0x41t
        0x45t
        -0x45t
        0x43t
        -0x4dt
        -0x48t
        -0x51t
        0x6bt
        0x4ct
        -0x60t
        0x46t
        -0x65t
        0x64t
        -0x4et
        -0x63t
        0x0t
        0x0t
        0x0t
    .end array-data
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, LVa/ha;->b:Ljava/lang/Object;

    iput-object p2, p0, LVa/ha;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized e()V
    .locals 2

    .line 1
    const-class v0, LVa/ha;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :try_start_0
    sput-object v1, LVa/ha;->c:LVa/ha;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    monitor-exit v0

    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception v1

    .line 10
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 11
    throw v1
.end method

.method public static h(Ljava/lang/Class;LVa/ia;Ljava/util/ArrayList;)V
    .locals 8

    .line 1
    iget v0, p1, LVa/ia;->O:I

    .line 2
    .line 3
    iget-boolean v1, p1, LVa/ca;->K:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_2

    .line 7
    .line 8
    iget v3, p1, LVa/ca;->L:I

    .line 9
    .line 10
    new-array v4, v2, [Ljava/lang/reflect/Method;

    .line 11
    .line 12
    if-eqz p0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    invoke-virtual {p0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    invoke-static {v4, v5}, LVa/ub;->l([Ljava/lang/reflect/Method;[Ljava/lang/reflect/Method;)[Ljava/lang/reflect/Method;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    move v1, v2

    .line 38
    :goto_0
    if-eqz p0, :cond_1

    .line 39
    .line 40
    if-eq v1, v3, :cond_1

    .line 41
    .line 42
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    invoke-static {v4, v5}, LVa/ub;->l([Ljava/lang/reflect/Method;[Ljava/lang/reflect/Method;)[Ljava/lang/reflect/Method;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    invoke-virtual {p0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-static {v4, v5}, LVa/ub;->l([Ljava/lang/reflect/Method;[Ljava/lang/reflect/Method;)[Ljava/lang/reflect/Method;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    add-int/lit8 v1, v1, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    goto :goto_1

    .line 70
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    :goto_1
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    :cond_3
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-eqz v1, :cond_e

    .line 87
    .line 88
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    check-cast v1, Ljava/lang/reflect/Method;

    .line 93
    .line 94
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    iget v4, p1, LVa/ca;->M:I

    .line 99
    .line 100
    and-int/2addr v3, v4

    .line 101
    if-ne v3, v4, :cond_5

    .line 102
    .line 103
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    iget v4, p1, LVa/ca;->N:I

    .line 108
    .line 109
    and-int/2addr v3, v4

    .line 110
    if-eqz v3, :cond_4

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_4
    iget-object v3, p1, LVa/ia;->R:Ljava/util/ArrayList;

    .line 114
    .line 115
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v3

    .line 123
    if-eqz v3, :cond_6

    .line 124
    .line 125
    :cond_5
    :goto_3
    move v4, v2

    .line 126
    goto :goto_6

    .line 127
    :cond_6
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    iget v4, p1, LVa/ia;->T:I

    .line 132
    .line 133
    const/4 v5, -0x1

    .line 134
    if-eq v4, v5, :cond_7

    .line 135
    .line 136
    array-length v5, v3

    .line 137
    if-eq v4, v5, :cond_7

    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_7
    iget-object v4, p1, LVa/ia;->S:Ljava/util/List;

    .line 141
    .line 142
    if-eqz v4, :cond_a

    .line 143
    .line 144
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 145
    .line 146
    .line 147
    move-result v5

    .line 148
    array-length v6, v3

    .line 149
    if-eq v5, v6, :cond_8

    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_8
    move v5, v2

    .line 153
    :goto_4
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 154
    .line 155
    .line 156
    move-result v6

    .line 157
    if-ge v5, v6, :cond_a

    .line 158
    .line 159
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v6

    .line 163
    check-cast v6, Ljava/lang/Class;

    .line 164
    .line 165
    aget-object v7, v3, v5

    .line 166
    .line 167
    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v6

    .line 171
    if-nez v6, :cond_9

    .line 172
    .line 173
    goto :goto_3

    .line 174
    :cond_9
    add-int/lit8 v5, v5, 0x1

    .line 175
    .line 176
    goto :goto_4

    .line 177
    :cond_a
    iget-object v3, p1, LVa/ia;->P:Ljava/lang/Class;

    .line 178
    .line 179
    const/4 v4, 0x1

    .line 180
    if-eqz v3, :cond_c

    .line 181
    .line 182
    iget-boolean v5, p1, LVa/ia;->Q:Z

    .line 183
    .line 184
    if-eqz v5, :cond_b

    .line 185
    .line 186
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    iget-object v5, p1, LVa/ia;->P:Ljava/lang/Class;

    .line 191
    .line 192
    invoke-virtual {v3, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v3

    .line 196
    goto :goto_5

    .line 197
    :cond_b
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    move-result-object v5

    .line 201
    invoke-virtual {v3, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 202
    .line 203
    .line 204
    move-result v3

    .line 205
    goto :goto_5

    .line 206
    :cond_c
    move v3, v4

    .line 207
    :goto_5
    if-eqz v3, :cond_5

    .line 208
    .line 209
    if-nez v0, :cond_d

    .line 210
    .line 211
    goto :goto_6

    .line 212
    :cond_d
    add-int/lit8 v0, v0, -0x1

    .line 213
    .line 214
    goto :goto_3

    .line 215
    :goto_6
    if-eqz v4, :cond_3

    .line 216
    .line 217
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    goto/16 :goto_2

    .line 221
    .line 222
    :cond_e
    return-void
.end method

.method public static declared-synchronized j()LVa/ha;
    .locals 5

    .line 1
    const-class v0, LVa/ha;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, LVa/ha;->c:LVa/ha;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, LVa/ha;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    new-instance v2, LVa/ba;

    .line 14
    .line 15
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v2, v1, LVa/ha;->a:Ljava/lang/Object;

    .line 19
    .line 20
    new-instance v2, LVa/la;

    .line 21
    .line 22
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    shr-int/lit8 v3, v3, 0x10

    .line 30
    .line 31
    rsub-int/lit8 v3, v3, 0x7f

    .line 32
    .line 33
    const-string v4, "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081"

    .line 34
    .line 35
    invoke-static {v3, v4}, LVa/la;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    new-instance v3, Ljava/util/HashMap;

    .line 43
    .line 44
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object v3, v2, LVa/la;->a:Ljava/util/HashMap;

    .line 48
    .line 49
    iput-object v2, v1, LVa/ha;->b:Ljava/lang/Object;

    .line 50
    .line 51
    sput-object v1, LVa/ha;->c:LVa/ha;

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :catchall_0
    move-exception v1

    .line 55
    goto :goto_1

    .line 56
    :cond_0
    :goto_0
    sget-object v1, LVa/ha;->c:LVa/ha;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    .line 58
    monitor-exit v0

    .line 59
    return-object v1

    .line 60
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 61
    throw v1
.end method

.method public static l(IIBSI)Ljava/lang/String;
    .locals 5

    .line 1
    sget-object v0, LVa/pb;->J:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    add-int/lit8 p1, p1, 0x5f

    .line 10
    .line 11
    const/4 v2, -0x1

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x1

    .line 14
    if-ne p1, v2, :cond_0

    .line 15
    .line 16
    move v3, v4

    .line 17
    :cond_0
    if-eqz v3, :cond_1

    .line 18
    .line 19
    sget-object p1, LVa/ha;->d:[B

    .line 20
    .line 21
    const v2, -0x4e6ebcc8

    .line 22
    .line 23
    .line 24
    add-int/2addr v2, p4

    .line 25
    aget-byte p1, p1, v2

    .line 26
    .line 27
    add-int/lit8 p1, p1, 0x5f

    .line 28
    .line 29
    int-to-byte p1, p1

    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception p0

    .line 32
    goto :goto_2

    .line 33
    :cond_1
    :goto_0
    if-lez p1, :cond_2

    .line 34
    .line 35
    add-int/2addr p4, p1

    .line 36
    const v2, 0x4e6ebcca

    .line 37
    .line 38
    .line 39
    sub-int/2addr p4, v2

    .line 40
    add-int/2addr p4, v3

    .line 41
    sput p4, LVa/pb;->F:I

    .line 42
    .line 43
    sput-byte p2, LVa/pb;->G:B

    .line 44
    .line 45
    const p2, -0xb3126d3

    .line 46
    .line 47
    .line 48
    add-int/2addr p0, p2

    .line 49
    int-to-char p0, p0

    .line 50
    sput-char p0, LVa/pb;->H:C

    .line 51
    .line 52
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    sget-char p0, LVa/pb;->H:C

    .line 56
    .line 57
    sput-char p0, LVa/pb;->I:C

    .line 58
    .line 59
    sput v4, LVa/pb;->E:I

    .line 60
    .line 61
    :goto_1
    sget p0, LVa/pb;->E:I

    .line 62
    .line 63
    if-ge p0, p1, :cond_2

    .line 64
    .line 65
    sget-object p0, LVa/ha;->d:[B

    .line 66
    .line 67
    sget p2, LVa/pb;->F:I

    .line 68
    .line 69
    add-int/lit8 p4, p2, -0x1

    .line 70
    .line 71
    sput p4, LVa/pb;->F:I

    .line 72
    .line 73
    aget-byte p0, p0, p2

    .line 74
    .line 75
    sget-char p2, LVa/pb;->I:C

    .line 76
    .line 77
    add-int/2addr p0, p3

    .line 78
    int-to-byte p0, p0

    .line 79
    sget-byte p4, LVa/pb;->G:B

    .line 80
    .line 81
    xor-int/2addr p0, p4

    .line 82
    add-int/2addr p2, p0

    .line 83
    int-to-char p0, p2

    .line 84
    sput-char p0, LVa/pb;->H:C

    .line 85
    .line 86
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    sget-char p0, LVa/pb;->H:C

    .line 90
    .line 91
    sput-char p0, LVa/pb;->I:C

    .line 92
    .line 93
    sget p0, LVa/pb;->E:I

    .line 94
    .line 95
    add-int/2addr p0, v4

    .line 96
    sput p0, LVa/pb;->E:I

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 104
    return-object p0

    .line 105
    :goto_2
    monitor-exit v0

    .line 106
    throw p0
.end method


# virtual methods
.method public a(Landroid/app/Activity;)V
    .locals 7

    .line 1
    sget v0, LVa/ha;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x6f

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/ha;->e:I

    .line 8
    .line 9
    const-string v0, ""

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-static {v0, v1, v1}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    int-to-short v2, v2

    .line 17
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    shr-int/lit8 v3, v3, 0x8

    .line 22
    .line 23
    const v4, 0xb312742

    .line 24
    .line 25
    .line 26
    sub-int/2addr v4, v3

    .line 27
    invoke-static {v0, v0, v1}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    rsub-int/lit8 v3, v3, -0x54

    .line 32
    .line 33
    const v5, 0x4e6ebcc7    # 1.0013373E9f

    .line 34
    .line 35
    .line 36
    invoke-static {v0}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    sub-int/2addr v5, v6

    .line 41
    const/16 v6, 0x30

    .line 42
    .line 43
    invoke-static {v0, v6}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;C)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    rsub-int/lit8 v0, v0, 0xe

    .line 48
    .line 49
    int-to-byte v0, v0

    .line 50
    invoke-static {v4, v3, v0, v2, v5}, LVa/ha;->l(IIBSI)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iget-object v2, p0, LVa/ha;->a:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v2, Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-virtual {p0, v0, p1, v2}, LVa/ha;->i(Ljava/lang/String;Landroid/app/Activity;Ljava/util/ArrayList;)V

    .line 63
    .line 64
    .line 65
    sget p1, LVa/ha;->e:I

    .line 66
    .line 67
    add-int/lit8 p1, p1, 0x4f

    .line 68
    .line 69
    rem-int/lit16 v0, p1, 0x80

    .line 70
    .line 71
    sput v0, LVa/ha;->f:I

    .line 72
    .line 73
    rem-int/lit8 p1, p1, 0x2

    .line 74
    .line 75
    if-nez p1, :cond_0

    .line 76
    .line 77
    const/16 p1, 0x2a

    .line 78
    .line 79
    div-int/2addr p1, v1

    .line 80
    :cond_0
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, LVa/ha;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LVa/g8;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget v1, LVa/g8;->i:I

    .line 9
    .line 10
    add-int/lit8 v1, v1, 0x61

    .line 11
    .line 12
    rem-int/lit16 v1, v1, 0x80

    .line 13
    .line 14
    sput v1, LVa/g8;->j:I

    .line 15
    .line 16
    iget-object v0, v0, LVa/g8;->a:Ljava/lang/String;

    .line 17
    .line 18
    return-object v0
.end method

.method public c(LVa/na;LVa/x8;LVa/y7;Ljava/util/List;)Z
    .locals 2

    .line 1
    iget-object v0, p0, LVa/ha;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LA7/B0;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0, p1}, LA7/B0;->d0(LVa/na;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    return v1

    .line 15
    :cond_0
    iget-object v0, p0, LVa/ha;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, LVa/r8;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    new-instance v0, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {v0, p4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, LVa/ha;->b:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p1, LVa/r8;

    .line 32
    .line 33
    invoke-virtual {p1, p2, p3, v0}, LVa/r8;->c(LVa/x8;LVa/y7;Ljava/util/List;)LVa/s8;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p1}, LVa/s8;->e()Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    return p1

    .line 42
    :cond_1
    const/4 p1, 0x1

    .line 43
    return p1
.end method

.method public d(Landroid/app/Activity;)V
    .locals 6

    .line 1
    sget v0, LVa/ha;->e:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x37

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/ha;->f:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-static {v0, v0, v0}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    int-to-short v0, v0

    .line 15
    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    shr-int/lit8 v1, v1, 0x10

    .line 20
    .line 21
    const v2, 0xb312742

    .line 22
    .line 23
    .line 24
    add-int/2addr v1, v2

    .line 25
    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    .line 26
    .line 27
    .line 28
    move-result-wide v2

    .line 29
    const-wide/16 v4, 0x0

    .line 30
    .line 31
    cmp-long v2, v2, v4

    .line 32
    .line 33
    rsub-int/lit8 v2, v2, -0x4f

    .line 34
    .line 35
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    shr-int/lit8 v3, v3, 0x8

    .line 40
    .line 41
    const v4, 0x4e6ebcd2

    .line 42
    .line 43
    .line 44
    add-int/2addr v3, v4

    .line 45
    invoke-static {}, Landroid/view/ViewConfiguration;->getMinimumFlingVelocity()I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    shr-int/lit8 v4, v4, 0x10

    .line 50
    .line 51
    rsub-int/lit8 v4, v4, -0x71

    .line 52
    .line 53
    int-to-byte v4, v4

    .line 54
    invoke-static {v1, v2, v4, v0, v3}, LVa/ha;->l(IIBSI)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iget-object v1, p0, LVa/ha;->a:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v1, Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-virtual {p0, v0, p1, v1}, LVa/ha;->i(Ljava/lang/String;Landroid/app/Activity;Ljava/util/ArrayList;)V

    .line 67
    .line 68
    .line 69
    sget p1, LVa/ha;->e:I

    .line 70
    .line 71
    add-int/lit8 p1, p1, 0x1f

    .line 72
    .line 73
    rem-int/lit16 p1, p1, 0x80

    .line 74
    .line 75
    sput p1, LVa/ha;->f:I

    .line 76
    .line 77
    return-void
.end method

.method public f(Ljava/lang/String;)LVa/r8;
    .locals 3

    .line 1
    move-object v0, p0

    .line 2
    :goto_0
    iget-object v1, v0, LVa/ha;->a:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v1, LVa/g8;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    sget v2, LVa/g8;->i:I

    .line 10
    .line 11
    add-int/lit8 v2, v2, 0x17

    .line 12
    .line 13
    rem-int/lit16 v2, v2, 0x80

    .line 14
    .line 15
    sput v2, LVa/g8;->j:I

    .line 16
    .line 17
    iget-object v1, v1, LVa/g8;->g:Ljava/util/Map;

    .line 18
    .line 19
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, LVa/r8;

    .line 24
    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    iget-object v0, v0, LVa/ha;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, LVa/ha;

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    return-object v1
.end method

.method public g()Ljava/util/ArrayList;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-object v1, p0, LVa/ha;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, LVa/g8;

    .line 6
    .line 7
    sget v2, LVa/g8;->i:I

    .line 8
    .line 9
    add-int/lit8 v2, v2, 0x59

    .line 10
    .line 11
    rem-int/lit16 v2, v2, 0x80

    .line 12
    .line 13
    sput v2, LVa/g8;->j:I

    .line 14
    .line 15
    add-int/lit8 v2, v2, 0x61

    .line 16
    .line 17
    rem-int/lit16 v3, v2, 0x80

    .line 18
    .line 19
    sput v3, LVa/g8;->i:I

    .line 20
    .line 21
    rem-int/lit8 v2, v2, 0x2

    .line 22
    .line 23
    if-nez v2, :cond_1

    .line 24
    .line 25
    iget-object v1, v1, LVa/g8;->d:Ljava/util/List;

    .line 26
    .line 27
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, LVa/ha;->b:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, LVa/ha;

    .line 33
    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    invoke-virtual {v1}, LVa/ha;->g()Ljava/util/ArrayList;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 41
    .line 42
    .line 43
    :cond_0
    return-object v0

    .line 44
    :cond_1
    const/4 v0, 0x0

    .line 45
    throw v0
.end method

.method public i(Ljava/lang/String;Landroid/app/Activity;Ljava/util/ArrayList;)V
    .locals 6

    .line 1
    sget v0, LVa/ha;->e:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0xd

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/ha;->f:I

    .line 8
    .line 9
    invoke-static {p2, p3}, LVa/y7;->k(Landroid/app/Activity;Ljava/util/List;)Z

    .line 10
    .line 11
    .line 12
    move-result p3

    .line 13
    if-eqz p3, :cond_0

    .line 14
    .line 15
    new-instance p3, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-static {v0}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    int-to-short v1, v1

    .line 26
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    shr-int/lit8 v2, v2, 0x10

    .line 31
    .line 32
    const v3, 0xb312714

    .line 33
    .line 34
    .line 35
    sub-int/2addr v3, v2

    .line 36
    invoke-static {v0, v0}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    add-int/lit8 v2, v2, -0x4e

    .line 41
    .line 42
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    shr-int/lit8 v4, v4, 0x18

    .line 47
    .line 48
    const v5, 0x4e6ebce0

    .line 49
    .line 50
    .line 51
    sub-int/2addr v5, v4

    .line 52
    invoke-static {v0}, Landroid/graphics/Color;->blue(I)I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    add-int/lit8 v4, v4, -0x4e

    .line 57
    .line 58
    int-to-byte v4, v4

    .line 59
    invoke-static {v3, v2, v4, v1, v5}, LVa/ha;->l(IIBSI)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 78
    .line 79
    .line 80
    move-result-object p3

    .line 81
    iget-object v1, p0, LVa/ha;->b:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v1, LVa/y7;

    .line 84
    .line 85
    const/4 v2, 0x1

    .line 86
    invoke-static {v1, p1, v2, v0, p3}, LVa/y7;->s(LVa/y7;Ljava/lang/String;ZZLjava/util/List;)V

    .line 87
    .line 88
    .line 89
    new-instance p3, LVa/Da;

    .line 90
    .line 91
    const/16 v0, 0xa

    .line 92
    .line 93
    invoke-direct {p3, v0}, LVa/Da;-><init>(I)V

    .line 94
    .line 95
    .line 96
    iput-object p0, p3, LVa/Da;->f:Ljava/lang/Object;

    .line 97
    .line 98
    iput-object p1, p3, LVa/Da;->d:Ljava/lang/Object;

    .line 99
    .line 100
    iput-object p2, p3, LVa/Da;->e:Ljava/lang/Object;

    .line 101
    .line 102
    invoke-static {p3}, LVa/Cb;->j(LVa/Ba;)V

    .line 103
    .line 104
    .line 105
    sget p1, LVa/ha;->e:I

    .line 106
    .line 107
    add-int/lit8 p1, p1, 0x1d

    .line 108
    .line 109
    rem-int/lit16 p1, p1, 0x80

    .line 110
    .line 111
    sput p1, LVa/ha;->f:I

    .line 112
    .line 113
    :cond_0
    return-void
.end method

.method public k()LVa/lb;
    .locals 11

    .line 1
    iget-object v0, p0, LVa/ha;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lorg/json/JSONObject;

    .line 4
    .line 5
    iget-object v1, p0, LVa/ha;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/lang/String;

    .line 8
    .line 9
    sget v2, LVa/pb;->k:I

    .line 10
    .line 11
    add-int/lit8 v2, v2, 0x69

    .line 12
    .line 13
    rem-int/lit16 v2, v2, 0x80

    .line 14
    .line 15
    sput v2, LVa/pb;->j:I

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    :try_start_0
    invoke-static {v1}, LVa/pb;->g(Ljava/lang/String;)Ljava/net/HttpURLConnection;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {v1, v0}, LVa/pb;->p0(Ljava/net/HttpURLConnection;Lorg/json/JSONObject;)[B

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {}, LVa/pb;->S()J

    .line 27
    .line 28
    .line 29
    move-result-wide v3

    .line 30
    invoke-virtual {v1}, Ljava/net/URLConnection;->connect()V

    .line 31
    .line 32
    .line 33
    new-instance v5, Ljava/io/DataOutputStream;

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    invoke-direct {v5, v6}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v5, v0}, Ljava/io/OutputStream;->write([B)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v5}, Ljava/io/OutputStream;->flush()V

    .line 46
    .line 47
    .line 48
    invoke-static {v5}, LVa/pb;->b0(Ljava/io/Closeable;)V

    .line 49
    .line 50
    .line 51
    sget v0, LVa/pb;->j:I

    .line 52
    .line 53
    add-int/lit8 v0, v0, 0x4f

    .line 54
    .line 55
    rem-int/lit16 v5, v0, 0x80

    .line 56
    .line 57
    sput v5, LVa/pb;->k:I

    .line 58
    .line 59
    rem-int/lit8 v0, v0, 0x2

    .line 60
    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    invoke-static {v1}, LVa/pb;->f(Ljava/net/HttpURLConnection;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v8

    .line 67
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 68
    .line 69
    .line 70
    move-result v10

    .line 71
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
    const/16 v0, 0x190

    .line 76
    .line 77
    if-lt v10, v0, :cond_1

    .line 78
    .line 79
    sget v0, LVa/pb;->k:I

    .line 80
    .line 81
    add-int/lit8 v0, v0, 0x4b

    .line 82
    .line 83
    rem-int/lit16 v5, v0, 0x80

    .line 84
    .line 85
    sput v5, LVa/pb;->j:I

    .line 86
    .line 87
    rem-int/lit8 v0, v0, 0x2

    .line 88
    .line 89
    if-nez v0, :cond_0

    .line 90
    .line 91
    :try_start_1
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :catchall_0
    move-exception v0

    .line 96
    goto :goto_1

    .line 97
    :cond_0
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 98
    .line 99
    .line 100
    throw v2

    .line 101
    :cond_1
    :goto_0
    new-instance v5, LVa/lb;

    .line 102
    .line 103
    invoke-static {}, LVa/pb;->S()J

    .line 104
    .line 105
    .line 106
    move-result-wide v0

    .line 107
    sub-long v6, v0, v3

    .line 108
    .line 109
    invoke-direct/range {v5 .. v10}, LVa/lb;-><init>(JLjava/lang/String;Ljava/lang/String;I)V

    .line 110
    .line 111
    .line 112
    return-object v5

    .line 113
    :cond_2
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 114
    :goto_1
    const v1, -0x2ca66661

    .line 115
    .line 116
    .line 117
    const v3, -0xa10d4b6

    .line 118
    .line 119
    .line 120
    const v4, -0x41dec187

    .line 121
    .line 122
    .line 123
    const v5, -0x6fc3056

    .line 124
    .line 125
    .line 126
    filled-new-array {v4, v5, v1, v3}, [I

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    const/4 v3, 0x0

    .line 131
    invoke-static {v3}, Landroid/graphics/Color;->green(I)I

    .line 132
    .line 133
    .line 134
    move-result v4

    .line 135
    add-int/lit8 v4, v4, 0x8

    .line 136
    .line 137
    invoke-static {v4, v1}, LVa/pb;->p(I[I)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    new-instance v4, Ljava/lang/StringBuilder;

    .line 146
    .line 147
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 148
    .line 149
    .line 150
    const/16 v5, 0xe

    .line 151
    .line 152
    new-array v5, v5, [I

    .line 153
    .line 154
    fill-array-data v5, :array_0

    .line 155
    .line 156
    .line 157
    invoke-static {v3}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    add-int/lit8 v3, v3, 0x1d

    .line 162
    .line 163
    invoke-static {v3, v5}, LVa/pb;->p(I[I)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    invoke-static {v1, v3, v0}, LVa/Ab;->R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 186
    .line 187
    .line 188
    return-object v2

    .line 189
    :array_0
    .array-data 4
        0x501bf870    # 1.0467E10f
        0x32b97286
        -0x1766547f
        0x562c15bb
        -0x1d7b3e5c
        -0x66ab8c72
        -0xbef40c0
        0x45f1a263
        -0x19713288
        -0x3d41170c
        -0x7ed09bdc
        -0x416d4217
        -0x6cb01abf
        -0x388ce9c4
    .end array-data
.end method

.method public m()Ljava/util/ArrayList;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-object v1, p0, LVa/ha;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, LVa/g8;

    .line 6
    .line 7
    sget v2, LVa/g8;->j:I

    .line 8
    .line 9
    add-int/lit8 v2, v2, 0x29

    .line 10
    .line 11
    rem-int/lit16 v3, v2, 0x80

    .line 12
    .line 13
    sput v3, LVa/g8;->i:I

    .line 14
    .line 15
    rem-int/lit8 v2, v2, 0x2

    .line 16
    .line 17
    if-nez v2, :cond_1

    .line 18
    .line 19
    iget-object v1, v1, LVa/g8;->e:Ljava/util/List;

    .line 20
    .line 21
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, LVa/ha;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, LVa/ha;

    .line 27
    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    invoke-virtual {v1}, LVa/ha;->m()Ljava/util/ArrayList;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 35
    .line 36
    .line 37
    :cond_0
    return-object v0

    .line 38
    :cond_1
    const/4 v0, 0x0

    .line 39
    throw v0
.end method
