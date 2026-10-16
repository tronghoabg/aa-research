.class public final LVa/y7;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final k:[C

.field public static l:I = 0x0

.field public static m:I = 0x1


# instance fields
.field public a:LVa/ha;

.field public b:LVa/x8;

.field public c:LVa/Z7;

.field public d:LVa/Z0;

.field public e:LVa/Ra;

.field public f:LVa/v7;

.field public g:LA7/b0;

.field public h:LVa/B7;

.field public i:Lorg/json/JSONObject;

.field public j:LVa/ba;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x27

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LVa/y7;->k:[C

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 2
        0x17cs
        0x18fs
        0x197s
        0x199s
        0x19es
        0x16bs
        0x18es
        0x176s
        0x193s
        0x19ds
        0x198s
        0x19cs
        0x158s
        0x18bs
        0x196s
        0x1a4s
        0x159s
        0x18ds
        0x1a0s
        0x1a3s
        0x190s
        0x19as
        0x170s
        0x19fs
        0x14as
        0x178s
        0x180s
        0x1a1s
        0x16ds
        0x194s
        0x17as
        0x1a2s
        0x174s
        0x17es
        0x173s
        0x16fs
        0x157s
        0x18cs
        0x191s
    .end array-data
.end method

.method public static A(Ljava/lang/String;IIIZ)Ljava/lang/String;
    .locals 5

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
    sget-object v0, LVa/Ab;->x:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    new-array v1, p1, [C

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    sput v2, LVa/Ab;->v:I

    .line 14
    .line 15
    :goto_0
    sget v3, LVa/Ab;->v:I

    .line 16
    .line 17
    if-ge v3, p1, :cond_0

    .line 18
    .line 19
    aget-char v4, p0, v3

    .line 20
    .line 21
    add-int/2addr v4, p2

    .line 22
    int-to-char v4, v4

    .line 23
    aput-char v4, v1, v3

    .line 24
    .line 25
    add-int/lit16 v4, v4, -0x81

    .line 26
    .line 27
    int-to-char v4, v4

    .line 28
    aput-char v4, v1, v3

    .line 29
    .line 30
    add-int/lit8 v3, v3, 0x1

    .line 31
    .line 32
    sput v3, LVa/Ab;->v:I

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception p0

    .line 36
    goto :goto_2

    .line 37
    :cond_0
    if-lez p3, :cond_1

    .line 38
    .line 39
    sput p3, LVa/Ab;->w:I

    .line 40
    .line 41
    new-array p0, p1, [C

    .line 42
    .line 43
    invoke-static {v1, v2, p0, v2, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 44
    .line 45
    .line 46
    sget p2, LVa/Ab;->w:I

    .line 47
    .line 48
    sub-int p3, p1, p2

    .line 49
    .line 50
    invoke-static {p0, v2, v1, p3, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 51
    .line 52
    .line 53
    sget p2, LVa/Ab;->w:I

    .line 54
    .line 55
    sub-int p3, p1, p2

    .line 56
    .line 57
    invoke-static {p0, p2, v1, v2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 58
    .line 59
    .line 60
    :cond_1
    if-eqz p4, :cond_3

    .line 61
    .line 62
    new-array p0, p1, [C

    .line 63
    .line 64
    sput v2, LVa/Ab;->v:I

    .line 65
    .line 66
    :goto_1
    sget p2, LVa/Ab;->v:I

    .line 67
    .line 68
    if-ge p2, p1, :cond_2

    .line 69
    .line 70
    sub-int p3, p1, p2

    .line 71
    .line 72
    add-int/lit8 p3, p3, -0x1

    .line 73
    .line 74
    aget-char p3, v1, p3

    .line 75
    .line 76
    aput-char p3, p0, p2

    .line 77
    .line 78
    add-int/lit8 p2, p2, 0x1

    .line 79
    .line 80
    sput p2, LVa/Ab;->v:I

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_2
    move-object v1, p0

    .line 84
    :cond_3
    new-instance p0, Ljava/lang/String;

    .line 85
    .line 86
    invoke-direct {p0, v1}, Ljava/lang/String;-><init>([C)V

    .line 87
    .line 88
    .line 89
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    return-object p0

    .line 91
    :goto_2
    monitor-exit v0

    .line 92
    throw p0
.end method

.method public static B(LVa/y7;Landroid/app/Activity;)Lorg/json/JSONObject;
    .locals 7

    .line 1
    sget v0, LVa/y7;->l:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x35

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/y7;->m:I

    .line 8
    .line 9
    new-instance v0, Lorg/json/JSONObject;

    .line 10
    .line 11
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 12
    .line 13
    .line 14
    const-wide/16 v1, 0x0

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    :try_start_0
    sget-object v4, LVa/sa;->a:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {p0}, LVa/y7;->u()LVa/B7;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    invoke-virtual {v5}, LVa/B7;->j()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 28
    .line 29
    .line 30
    sget-object v4, LVa/sa;->U:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {p0}, LVa/y7;->u()LVa/B7;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-virtual {v5}, LVa/B7;->n()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 41
    .line 42
    .line 43
    sget-object v4, LVa/sa;->V:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {p0}, LVa/y7;->u()LVa/B7;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p0}, LVa/B7;->g()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-virtual {v0, v4, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 54
    .line 55
    .line 56
    invoke-static {v1, v2}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    add-int/lit8 p0, p0, 0x7

    .line 61
    .line 62
    invoke-static {v1, v2}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    rsub-int v4, v4, 0xe3

    .line 67
    .line 68
    const-string v5, "\ufffe\n\u0002\ufffe\u0000\u0011\uffeb"

    .line 69
    .line 70
    invoke-static {v3}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    add-int/lit8 v6, v6, 0x3

    .line 75
    .line 76
    invoke-static {v5, p0, v4, v6, v3}, LVa/y7;->A(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-virtual {p0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-virtual {v0, p0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :catch_0
    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    .line 97
    .line 98
    .line 99
    move-result-wide p0

    .line 100
    cmp-long p0, p0, v1

    .line 101
    .line 102
    add-int/lit8 p0, p0, 0x7e

    .line 103
    .line 104
    const-string p1, "\u008c\u0082\u008b\u0082\u0085\u008a\u0089\u0088\u0087\u0086\u0082\u0085\u0084\u0083\u0082\u0081"

    .line 105
    .line 106
    invoke-static {p0, p1}, LVa/y7;->v(ILjava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-virtual {p0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-static {v3, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    add-int/lit8 p1, p1, 0x7f

    .line 119
    .line 120
    const-string v1, "\u0085\u0092\u0082\u009e\u00a6\u0084\u0099\u008b\u0084\u008a\u009e\u0099\u0085\u0092\u008e\u0099\u00a7\u008b\u0089\u0085\u008e\u0082\u008c\u0092\u0099\u008c\u0084\u008c\u008c\u00a4"

    .line 121
    .line 122
    invoke-static {p1, v1}, LVa/y7;->v(ILjava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-static {p0, p1}, LVa/Ab;->x(Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    :goto_0
    sget p0, LVa/y7;->m:I

    .line 134
    .line 135
    add-int/lit8 p0, p0, 0x47

    .line 136
    .line 137
    rem-int/lit16 p0, p0, 0x80

    .line 138
    .line 139
    sput p0, LVa/y7;->l:I

    .line 140
    .line 141
    return-object v0
.end method

.method public static synthetic C(LVa/t7;Z)V
    .locals 1

    .line 1
    sget v0, LVa/y7;->m:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x6d

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/y7;->l:I

    .line 8
    .line 9
    invoke-static {p0, p1}, LVa/y7;->i(LVa/xa;Z)V

    .line 10
    .line 11
    .line 12
    sget p0, LVa/y7;->m:I

    .line 13
    .line 14
    add-int/lit8 p0, p0, 0x77

    .line 15
    .line 16
    rem-int/lit16 p1, p0, 0x80

    .line 17
    .line 18
    sput p1, LVa/y7;->l:I

    .line 19
    .line 20
    rem-int/lit8 p0, p0, 0x2

    .line 21
    .line 22
    if-nez p0, :cond_0

    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    const/4 p0, 0x0

    .line 26
    throw p0
.end method

.method public static D(Landroid/app/Activity;Ljava/util/List;)Z
    .locals 2

    .line 1
    sget v0, LVa/y7;->l:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x63

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/y7;->m:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    if-eqz v0, :cond_3

    .line 12
    .line 13
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_2

    .line 18
    .line 19
    sget v0, LVa/y7;->m:I

    .line 20
    .line 21
    add-int/lit8 v0, v0, 0x9

    .line 22
    .line 23
    rem-int/lit16 v0, v0, 0x80

    .line 24
    .line 25
    sput v0, LVa/y7;->l:I

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-interface {p1, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-eqz p0, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    sget p0, LVa/y7;->l:I

    .line 43
    .line 44
    add-int/lit8 p0, p0, 0x75

    .line 45
    .line 46
    rem-int/lit16 p1, p0, 0x80

    .line 47
    .line 48
    sput p1, LVa/y7;->m:I

    .line 49
    .line 50
    rem-int/lit8 p0, p0, 0x2

    .line 51
    .line 52
    const/4 p1, 0x0

    .line 53
    if-nez p0, :cond_1

    .line 54
    .line 55
    const/16 p0, 0xe

    .line 56
    .line 57
    div-int/2addr p0, p1

    .line 58
    :cond_1
    return p1

    .line 59
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 60
    return p0

    .line 61
    :cond_3
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 62
    .line 63
    .line 64
    const/4 p0, 0x0

    .line 65
    throw p0
.end method

.method public static i(LVa/xa;Z)V
    .locals 2

    .line 1
    sget v0, LVa/y7;->l:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x6d

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/y7;->m:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    :try_start_0
    new-instance p1, LVa/v;

    .line 17
    .line 18
    const/16 v0, 0x10

    .line 19
    .line 20
    invoke-direct {p1, v0}, LVa/v;-><init>(I)V

    .line 21
    .line 22
    .line 23
    iput-object p0, p1, LVa/v;->d:Ljava/lang/Object;

    .line 24
    .line 25
    invoke-static {p1}, LVa/Cb;->c(LVa/Ba;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    sget p0, LVa/y7;->m:I

    .line 29
    .line 30
    add-int/lit8 p0, p0, 0xb

    .line 31
    .line 32
    rem-int/lit16 p1, p0, 0x80

    .line 33
    .line 34
    sput p1, LVa/y7;->l:I

    .line 35
    .line 36
    rem-int/lit8 p0, p0, 0x2

    .line 37
    .line 38
    if-nez p0, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    throw v1

    .line 42
    :cond_1
    :try_start_1
    invoke-static {p0}, LVa/Cb;->e(LVa/Ba;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_2
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 47
    :catchall_0
    :goto_0
    return-void
.end method

.method public static synthetic k(Landroid/app/Activity;Ljava/util/List;)Z
    .locals 2

    .line 1
    sget v0, LVa/y7;->m:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x6d

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/y7;->l:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-static {p0, p1}, LVa/y7;->D(Landroid/app/Activity;Ljava/util/List;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0

    .line 18
    :cond_0
    invoke-static {p0, p1}, LVa/y7;->D(Landroid/app/Activity;Ljava/util/List;)Z

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    throw p0
.end method

.method public static l(Ljava/lang/String;)Z
    .locals 2

    .line 1
    sget v0, LVa/y7;->l:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x71

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/y7;->m:I

    .line 8
    .line 9
    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    shr-int/lit8 v0, v0, 0x8

    .line 14
    .line 15
    rsub-int/lit8 v0, v0, 0x7f

    .line 16
    .line 17
    const-string v1, "\u008a\u008a\u008e\u008f\u0092\u008d"

    .line 18
    .line 19
    invoke-static {v0, v1}, LVa/y7;->v(ILjava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    sget v0, LVa/y7;->l:I

    .line 32
    .line 33
    add-int/lit8 v0, v0, 0x49

    .line 34
    .line 35
    rem-int/lit16 v0, v0, 0x80

    .line 36
    .line 37
    sput v0, LVa/y7;->m:I

    .line 38
    .line 39
    return p0
.end method

.method public static n(LVa/p7;LVa/p7;)LVa/s7;
    .locals 3

    .line 1
    sget v0, LVa/y7;->l:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x39

    .line 4
    .line 5
    rem-int/lit16 v2, v1, 0x80

    .line 6
    .line 7
    sput v2, LVa/y7;->m:I

    .line 8
    .line 9
    rem-int/lit8 v1, v1, 0x2

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    new-instance v1, LVa/s7;

    .line 14
    .line 15
    const/16 v2, 0xa

    .line 16
    .line 17
    invoke-direct {v1, v2}, LVa/a;-><init>(I)V

    .line 18
    .line 19
    .line 20
    iput-object p1, v1, LVa/s7;->y:LVa/a;

    .line 21
    .line 22
    iput-object p0, v1, LVa/s7;->z:LVa/a;

    .line 23
    .line 24
    add-int/lit8 v0, v0, 0x65

    .line 25
    .line 26
    rem-int/lit16 v0, v0, 0x80

    .line 27
    .line 28
    sput v0, LVa/y7;->m:I

    .line 29
    .line 30
    return-object v1

    .line 31
    :cond_0
    const/4 p0, 0x0

    .line 32
    throw p0
.end method

.method public static synthetic s(LVa/y7;Ljava/lang/String;ZZLjava/util/List;)V
    .locals 2

    .line 1
    sget v0, LVa/y7;->m:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x15

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/y7;->l:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {p0, p1, p2, p3, p4}, LVa/y7;->j(Ljava/lang/String;ZZLjava/util/List;)V

    .line 13
    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    sget p0, LVa/y7;->l:I

    .line 18
    .line 19
    add-int/lit8 p0, p0, 0x27

    .line 20
    .line 21
    rem-int/lit16 p1, p0, 0x80

    .line 22
    .line 23
    sput p1, LVa/y7;->m:I

    .line 24
    .line 25
    rem-int/lit8 p0, p0, 0x2

    .line 26
    .line 27
    if-eqz p0, :cond_0

    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    throw v1

    .line 31
    :cond_1
    throw v1
.end method

.method public static v(ILjava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "ISO-8859-1"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, [B

    .line 8
    .line 9
    sget-object v0, LVa/a;->x:Ljava/lang/Object;

    .line 10
    .line 11
    monitor-enter v0

    .line 12
    :try_start_0
    sget-object v1, LVa/y7;->k:[C

    .line 13
    .line 14
    array-length v2, p1

    .line 15
    sput v2, LVa/a;->w:I

    .line 16
    .line 17
    new-array v2, v2, [C

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    sput v3, LVa/a;->v:I

    .line 21
    .line 22
    :goto_0
    sget v3, LVa/a;->v:I

    .line 23
    .line 24
    sget v4, LVa/a;->w:I

    .line 25
    .line 26
    if-ge v3, v4, :cond_0

    .line 27
    .line 28
    add-int/lit8 v4, v4, -0x1

    .line 29
    .line 30
    sub-int/2addr v4, v3

    .line 31
    aget-byte v4, p1, v4

    .line 32
    .line 33
    add-int/2addr v4, p0

    .line 34
    aget-char v4, v1, v4

    .line 35
    .line 36
    add-int/lit16 v4, v4, -0x12a

    .line 37
    .line 38
    int-to-char v4, v4

    .line 39
    aput-char v4, v2, v3

    .line 40
    .line 41
    add-int/lit8 v3, v3, 0x1

    .line 42
    .line 43
    sput v3, LVa/a;->v:I

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception p0

    .line 47
    goto :goto_1

    .line 48
    :cond_0
    new-instance p0, Ljava/lang/String;

    .line 49
    .line 50
    invoke-direct {p0, v2}, Ljava/lang/String;-><init>([C)V

    .line 51
    .line 52
    .line 53
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    return-object p0

    .line 55
    :goto_1
    monitor-exit v0

    .line 56
    throw p0
.end method


# virtual methods
.method public final a()Lorg/json/JSONObject;
    .locals 9

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    sget-object v1, LVa/sa;->a:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {p0}, LVa/y7;->u()LVa/B7;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v2}, LVa/B7;->j()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 17
    .line 18
    .line 19
    sget-object v1, LVa/sa;->V:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {p0}, LVa/y7;->u()LVa/B7;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, LVa/B7;->g()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 30
    .line 31
    .line 32
    sget-object v1, LVa/sa;->U:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {p0}, LVa/y7;->u()LVa/B7;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v2}, LVa/B7;->n()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catch_0
    move-exception v1

    .line 47
    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    shr-int/lit8 v2, v2, 0x10

    .line 52
    .line 53
    add-int/lit8 v2, v2, 0x7f

    .line 54
    .line 55
    const-string v3, "\u008c\u0082\u008b\u0082\u0085\u008a\u0089\u0088\u0087\u0086\u0082\u0085\u0084\u0083\u0082\u0081"

    .line 56
    .line 57
    invoke-static {v2, v3}, LVa/y7;->v(ILjava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    new-instance v3, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const-string v4, ""

    .line 71
    .line 72
    const/4 v5, 0x0

    .line 73
    invoke-static {v4, v5, v5}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    add-int/lit8 v4, v4, 0x1b

    .line 78
    .line 79
    const-wide/16 v6, 0x0

    .line 80
    .line 81
    invoke-static {v6, v7}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    rsub-int v6, v6, 0xdf

    .line 86
    .line 87
    invoke-static {v5, v5}, Landroid/view/View;->resolveSize(II)I

    .line 88
    .line 89
    .line 90
    move-result v7

    .line 91
    rsub-int/lit8 v7, v7, 0x1

    .line 92
    .line 93
    const-string v8, "\uffc2\uffe7\u0014\u0014\u0011\u0014\uffc2\u0005\u0014\u0007\u0003\u0016\u000b\u0010\t\uffc2\u0007\u0018\u0007\u0010\u0016\uffc2\u000c\u0015\u0011\u0010\uffdc"

    .line 94
    .line 95
    invoke-static {v8, v4, v6, v7, v5}, LVa/y7;->A(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-static {v2, v1}, LVa/Ab;->x(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    :goto_0
    sget v1, LVa/y7;->l:I

    .line 121
    .line 122
    add-int/lit8 v1, v1, 0x55

    .line 123
    .line 124
    rem-int/lit16 v1, v1, 0x80

    .line 125
    .line 126
    sput v1, LVa/y7;->m:I

    .line 127
    .line 128
    return-object v0
.end method

.method public final b()LVa/Ra;
    .locals 2

    .line 1
    sget v0, LVa/y7;->l:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x2f

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/y7;->m:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, LVa/y7;->e:LVa/Ra;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    throw v0
.end method

.method public final c()LVa/Z0;
    .locals 2

    .line 1
    sget v0, LVa/y7;->m:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0xf

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/y7;->l:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    add-int/lit8 v1, v1, 0x1f

    .line 14
    .line 15
    rem-int/lit16 v1, v1, 0x80

    .line 16
    .line 17
    sput v1, LVa/y7;->m:I

    .line 18
    .line 19
    iget-object v0, p0, LVa/y7;->d:LVa/Z0;

    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    throw v0
.end method

.method public final d()LVa/Z7;
    .locals 2

    .line 1
    sget v0, LVa/y7;->m:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x4b

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/y7;->l:I

    .line 8
    .line 9
    add-int/lit8 v0, v0, 0xd

    .line 10
    .line 11
    rem-int/lit16 v1, v0, 0x80

    .line 12
    .line 13
    sput v1, LVa/y7;->m:I

    .line 14
    .line 15
    rem-int/lit8 v0, v0, 0x2

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, LVa/y7;->c:LVa/Z7;

    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    throw v0
.end method

.method public final e()LVa/x8;
    .locals 1

    .line 1
    sget v0, LVa/y7;->m:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x2d

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/y7;->l:I

    .line 8
    .line 9
    add-int/lit8 v0, v0, 0x5b

    .line 10
    .line 11
    rem-int/lit16 v0, v0, 0x80

    .line 12
    .line 13
    sput v0, LVa/y7;->m:I

    .line 14
    .line 15
    iget-object v0, p0, LVa/y7;->b:LVa/x8;

    .line 16
    .line 17
    return-object v0
.end method

.method public final f()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LVa/y7;->u()LVa/B7;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, LVa/B7;->o()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-static {}, Landroid/view/ViewConfiguration;->getMinimumFlingVelocity()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    shr-int/lit8 v1, v1, 0x10

    .line 22
    .line 23
    rsub-int/lit8 v1, v1, 0x7f

    .line 24
    .line 25
    const-string v2, "\u0091"

    .line 26
    .line 27
    invoke-static {v1, v2}, LVa/y7;->v(ILjava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, LVa/y7;->h()LVa/ha;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v1}, LVa/ha;->b()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    sget v1, LVa/y7;->l:I

    .line 54
    .line 55
    add-int/lit8 v1, v1, 0x25

    .line 56
    .line 57
    rem-int/lit16 v1, v1, 0x80

    .line 58
    .line 59
    sput v1, LVa/y7;->m:I

    .line 60
    .line 61
    return-object v0
.end method

.method public final g(Z)LVa/n7;
    .locals 2

    .line 1
    new-instance v0, LVa/n7;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p0, v0, LVa/n7;->L:LVa/y7;

    .line 7
    .line 8
    iput-boolean p1, v0, LVa/n7;->K:Z

    .line 9
    .line 10
    sget p1, LVa/y7;->l:I

    .line 11
    .line 12
    add-int/lit8 p1, p1, 0x65

    .line 13
    .line 14
    rem-int/lit16 v1, p1, 0x80

    .line 15
    .line 16
    sput v1, LVa/y7;->m:I

    .line 17
    .line 18
    rem-int/lit8 p1, p1, 0x2

    .line 19
    .line 20
    if-nez p1, :cond_0

    .line 21
    .line 22
    const/16 p1, 0x32

    .line 23
    .line 24
    div-int/lit8 p1, p1, 0x0

    .line 25
    .line 26
    :cond_0
    return-object v0
.end method

.method public final h()LVa/ha;
    .locals 2

    .line 1
    sget v0, LVa/y7;->m:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x57

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/y7;->l:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, LVa/y7;->a:LVa/ha;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    throw v0
.end method

.method public final j(Ljava/lang/String;ZZLjava/util/List;)V
    .locals 6

    .line 1
    const-string v0, "\u0002\u000f\u0005\r\n\u000f\u0008\uffc1\u0006\u0017\u0006\u000f\u0015\uffc1\uffe6\u0013\u0013\u0010\u0013\uffc1\t"

    .line 2
    .line 3
    iget-object v1, p0, LVa/y7;->a:LVa/ha;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-object v3, v1

    .line 10
    :goto_0
    iget-object v4, v3, LVa/ha;->a:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v4, LVa/g8;

    .line 13
    .line 14
    sget v5, LVa/g8;->j:I

    .line 15
    .line 16
    add-int/lit8 v5, v5, 0x21

    .line 17
    .line 18
    rem-int/lit16 v5, v5, 0x80

    .line 19
    .line 20
    sput v5, LVa/g8;->i:I

    .line 21
    .line 22
    iget-object v4, v4, LVa/g8;->f:Ljava/util/Map;

    .line 23
    .line 24
    invoke-interface {v4, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    check-cast v4, LVa/c8;

    .line 29
    .line 30
    if-nez v4, :cond_0

    .line 31
    .line 32
    iget-object v3, v3, LVa/ha;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v3, LVa/ha;

    .line 35
    .line 36
    if-eqz v3, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    if-eqz v4, :cond_5

    .line 40
    .line 41
    invoke-virtual {v4}, LVa/c8;->b()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v4}, LVa/c8;->b()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    invoke-virtual {v1, v5}, LVa/ha;->f(Ljava/lang/String;)LVa/r8;

    .line 50
    .line 51
    .line 52
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    if-eqz v1, :cond_4

    .line 54
    .line 55
    sget v3, LVa/y7;->l:I

    .line 56
    .line 57
    add-int/lit8 v3, v3, 0x6f

    .line 58
    .line 59
    rem-int/lit16 v5, v3, 0x80

    .line 60
    .line 61
    sput v5, LVa/y7;->m:I

    .line 62
    .line 63
    rem-int/lit8 v3, v3, 0x2

    .line 64
    .line 65
    if-eqz v3, :cond_3

    .line 66
    .line 67
    :try_start_1
    invoke-virtual {v4}, LVa/c8;->c()Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-ne p2, v3, :cond_5

    .line 72
    .line 73
    sget p2, LVa/c8;->d:I

    .line 74
    .line 75
    add-int/lit8 p2, p2, 0x79

    .line 76
    .line 77
    rem-int/lit16 p2, p2, 0x80

    .line 78
    .line 79
    add-int/lit8 p2, p2, 0x6d

    .line 80
    .line 81
    rem-int/lit16 p2, p2, 0x80

    .line 82
    .line 83
    sput p2, LVa/c8;->d:I

    .line 84
    .line 85
    iget-boolean p2, v4, LVa/c8;->b:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 86
    .line 87
    if-ne p3, p2, :cond_5

    .line 88
    .line 89
    sget p2, LVa/y7;->m:I

    .line 90
    .line 91
    add-int/lit8 p2, p2, 0xb

    .line 92
    .line 93
    rem-int/lit16 p3, p2, 0x80

    .line 94
    .line 95
    sput p3, LVa/y7;->l:I

    .line 96
    .line 97
    rem-int/lit8 p2, p2, 0x2

    .line 98
    .line 99
    if-eqz p2, :cond_1

    .line 100
    .line 101
    :try_start_2
    invoke-static {}, LVa/Kb;->u()LVa/Kb;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    invoke-virtual {p2}, LVa/Kb;->t()Z

    .line 106
    .line 107
    .line 108
    move-result p2

    .line 109
    const/16 p3, 0x49

    .line 110
    .line 111
    div-int/2addr p3, v2

    .line 112
    if-eqz p2, :cond_2

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :catchall_0
    move-exception p2

    .line 116
    goto :goto_2

    .line 117
    :cond_1
    invoke-static {}, LVa/Kb;->u()LVa/Kb;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    invoke-virtual {p2}, LVa/Kb;->t()Z

    .line 122
    .line 123
    .line 124
    move-result p2

    .line 125
    if-eqz p2, :cond_2

    .line 126
    .line 127
    :goto_1
    invoke-virtual {p0}, LVa/y7;->f()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p2

    .line 131
    invoke-static {p2, p1}, LVa/a;->J(Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    :cond_2
    iget-object p2, p0, LVa/y7;->b:LVa/x8;

    .line 135
    .line 136
    invoke-virtual {v1, p2, p0, p4}, LVa/r8;->c(LVa/x8;LVa/y7;Ljava/util/List;)LVa/s8;

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :cond_3
    invoke-virtual {v4}, LVa/c8;->c()Z

    .line 141
    .line 142
    .line 143
    const/4 p2, 0x0

    .line 144
    throw p2

    .line 145
    :cond_4
    new-instance p2, Ljava/lang/StringBuilder;

    .line 146
    .line 147
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 148
    .line 149
    .line 150
    invoke-static {v2, v2, v2, v2}, Landroid/graphics/Color;->argb(IIII)I

    .line 151
    .line 152
    .line 153
    move-result p3

    .line 154
    rsub-int/lit8 p3, p3, 0x15

    .line 155
    .line 156
    invoke-static {v2}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    .line 157
    .line 158
    .line 159
    move-result p4

    .line 160
    rsub-int p4, p4, 0xe0

    .line 161
    .line 162
    const-string v1, ""

    .line 163
    .line 164
    invoke-static {v1, v2}, Landroid/text/TextUtils;->getOffsetBefore(Ljava/lang/CharSequence;I)I

    .line 165
    .line 166
    .line 167
    move-result v1

    .line 168
    add-int/lit8 v1, v1, 0xe

    .line 169
    .line 170
    invoke-static {v0, p3, p4, v1, v2}, LVa/y7;->A(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p3

    .line 174
    invoke-virtual {p3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p3

    .line 178
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p2

    .line 188
    new-instance p3, LVa/k8;

    .line 189
    .line 190
    invoke-direct {p3, p0, v3, p2}, LVa/k8;-><init>(LVa/y7;Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p0}, LVa/y7;->f()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object p2

    .line 197
    invoke-virtual {p3, p2}, LVa/j8;->d(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 198
    .line 199
    .line 200
    :cond_5
    return-void

    .line 201
    :goto_2
    invoke-virtual {p0}, LVa/y7;->f()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object p3

    .line 205
    new-instance p4, Ljava/lang/StringBuilder;

    .line 206
    .line 207
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 208
    .line 209
    .line 210
    const-wide/16 v3, 0x0

    .line 211
    .line 212
    invoke-static {v3, v4}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    .line 213
    .line 214
    .line 215
    move-result v1

    .line 216
    add-int/lit8 v1, v1, 0x16

    .line 217
    .line 218
    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    .line 219
    .line 220
    .line 221
    move-result v3

    .line 222
    const/4 v4, 0x0

    .line 223
    cmpl-float v3, v3, v4

    .line 224
    .line 225
    rsub-int v3, v3, 0xe1

    .line 226
    .line 227
    invoke-static {v2}, Landroid/graphics/Color;->blue(I)I

    .line 228
    .line 229
    .line 230
    move-result v4

    .line 231
    rsub-int/lit8 v4, v4, 0xe

    .line 232
    .line 233
    invoke-static {v0, v1, v3, v4, v2}, LVa/y7;->A(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {p4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    invoke-static {p3, p1, p2}, LVa/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 252
    .line 253
    .line 254
    return-void
.end method

.method public final m(Z)LVa/q7;
    .locals 2

    .line 1
    new-instance v0, LVa/q7;

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    invoke-direct {v0, v1}, LVa/a;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iput-object p0, v0, LVa/q7;->z:LVa/y7;

    .line 9
    .line 10
    iput-boolean p1, v0, LVa/q7;->y:Z

    .line 11
    .line 12
    sget p1, LVa/y7;->l:I

    .line 13
    .line 14
    add-int/lit8 p1, p1, 0x45

    .line 15
    .line 16
    rem-int/lit16 v1, p1, 0x80

    .line 17
    .line 18
    sput v1, LVa/y7;->m:I

    .line 19
    .line 20
    rem-int/lit8 p1, p1, 0x2

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_0
    const/4 p1, 0x0

    .line 26
    throw p1
.end method

.method public final o(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 10

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v0, v1}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    rsub-int/lit8 v2, v2, 0xc

    .line 9
    .line 10
    const/16 v3, 0x30

    .line 11
    .line 12
    invoke-static {v0, v3}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    add-int/lit16 v4, v4, 0xea

    .line 17
    .line 18
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    shr-int/lit8 v5, v5, 0x10

    .line 23
    .line 24
    rsub-int/lit8 v5, v5, 0xc

    .line 25
    .line 26
    const-string v6, "\ufff9\ufffc\ufff7\ufffc\u0001\u000b\u0008\u0004\ufff9\u0011\ufffd\ufffc"

    .line 27
    .line 28
    invoke-static {v6, v2, v4, v5, v1}, LVa/y7;->A(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    iget-object v4, p0, LVa/y7;->h:LVa/B7;

    .line 41
    .line 42
    const/4 v5, 0x1

    .line 43
    const/4 v6, 0x0

    .line 44
    if-eqz v2, :cond_1

    .line 45
    .line 46
    invoke-virtual {v4}, LVa/B7;->a()LVa/f0;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    sget v7, LVa/f0;->h:I

    .line 54
    .line 55
    add-int/lit8 v7, v7, 0x2d

    .line 56
    .line 57
    rem-int/lit16 v7, v7, 0x80

    .line 58
    .line 59
    sput v7, LVa/f0;->g:I

    .line 60
    .line 61
    sget-object v7, LVa/sa;->d:Ljava/lang/String;

    .line 62
    .line 63
    invoke-virtual {p2, v7}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 64
    .line 65
    .line 66
    move-result v7

    .line 67
    iget-object v2, v2, LVa/f0;->a:LVa/Eb;

    .line 68
    .line 69
    if-eqz v2, :cond_3

    .line 70
    .line 71
    sget v8, LVa/f0;->h:I

    .line 72
    .line 73
    add-int/lit8 v8, v8, 0x13

    .line 74
    .line 75
    rem-int/lit16 v9, v8, 0x80

    .line 76
    .line 77
    sput v9, LVa/f0;->g:I

    .line 78
    .line 79
    rem-int/lit8 v8, v8, 0x2

    .line 80
    .line 81
    if-nez v8, :cond_0

    .line 82
    .line 83
    sget-object v8, LVa/sa;->a:Ljava/lang/String;

    .line 84
    .line 85
    invoke-virtual {p2, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v8

    .line 89
    invoke-static {v7}, Lcom/ironsource/adqualitysdk/sdk/ISAdQualityAdType;->fromInt(I)Lcom/ironsource/adqualitysdk/sdk/ISAdQualityAdType;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    invoke-virtual {v2, v8, v7}, LVa/Eb;->adDisplayed(Ljava/lang/String;Lcom/ironsource/adqualitysdk/sdk/ISAdQualityAdType;)V

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_0
    sget-object p1, LVa/sa;->a:Ljava/lang/String;

    .line 98
    .line 99
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-static {v7}, Lcom/ironsource/adqualitysdk/sdk/ISAdQualityAdType;->fromInt(I)Lcom/ironsource/adqualitysdk/sdk/ISAdQualityAdType;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    invoke-virtual {v2, p1, p2}, LVa/Eb;->adDisplayed(Ljava/lang/String;Lcom/ironsource/adqualitysdk/sdk/ISAdQualityAdType;)V

    .line 108
    .line 109
    .line 110
    throw v6

    .line 111
    :cond_1
    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    int-to-byte v2, v2

    .line 116
    add-int/lit8 v2, v2, 0xa

    .line 117
    .line 118
    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    .line 119
    .line 120
    .line 121
    move-result v7

    .line 122
    shr-int/lit8 v7, v7, 0x8

    .line 123
    .line 124
    add-int/lit16 v7, v7, 0xe7

    .line 125
    .line 126
    invoke-static {v1, v1}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    .line 127
    .line 128
    .line 129
    move-result v8

    .line 130
    add-int/lit8 v8, v8, 0x7

    .line 131
    .line 132
    const-string v9, "\ufff9\ufffd\u0006\t\r\uffff\ufffe\ufffb\ufffe"

    .line 133
    .line 134
    invoke-static {v9, v2, v7, v8, v1}, LVa/y7;->A(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v2

    .line 146
    if-eq v2, v5, :cond_2

    .line 147
    .line 148
    goto :goto_0

    .line 149
    :cond_2
    sget v2, LVa/y7;->m:I

    .line 150
    .line 151
    add-int/lit8 v2, v2, 0x5b

    .line 152
    .line 153
    rem-int/lit16 v7, v2, 0x80

    .line 154
    .line 155
    sput v7, LVa/y7;->l:I

    .line 156
    .line 157
    rem-int/lit8 v2, v2, 0x2

    .line 158
    .line 159
    if-nez v2, :cond_12

    .line 160
    .line 161
    invoke-virtual {v4}, LVa/B7;->a()LVa/f0;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    invoke-virtual {v2, p2}, LVa/f0;->d(Lorg/json/JSONObject;)V

    .line 166
    .line 167
    .line 168
    :cond_3
    :goto_0
    sget v2, LVa/y7;->l:I

    .line 169
    .line 170
    add-int/lit8 v2, v2, 0x39

    .line 171
    .line 172
    rem-int/lit16 v7, v2, 0x80

    .line 173
    .line 174
    sput v7, LVa/y7;->m:I

    .line 175
    .line 176
    rem-int/lit8 v2, v2, 0x2

    .line 177
    .line 178
    if-eqz v2, :cond_11

    .line 179
    .line 180
    invoke-virtual {p0}, LVa/y7;->a()Lorg/json/JSONObject;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    invoke-static {v2, p2}, LVa/Ab;->g0(Lorg/json/JSONObject;Lorg/json/JSONObject;)V

    .line 185
    .line 186
    .line 187
    sget v7, LVa/y7;->m:I

    .line 188
    .line 189
    add-int/lit8 v7, v7, 0x25

    .line 190
    .line 191
    rem-int/lit16 v8, v7, 0x80

    .line 192
    .line 193
    sput v8, LVa/y7;->l:I

    .line 194
    .line 195
    rem-int/lit8 v7, v7, 0x2

    .line 196
    .line 197
    if-nez v7, :cond_10

    .line 198
    .line 199
    invoke-static {v2}, LVa/Ab;->u(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    sget-object v7, LVa/sa;->O:Ljava/lang/String;

    .line 204
    .line 205
    invoke-virtual {p1, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result v7

    .line 209
    if-eqz v7, :cond_4

    .line 210
    .line 211
    sget p1, LVa/y7;->l:I

    .line 212
    .line 213
    add-int/lit8 p1, p1, 0x33

    .line 214
    .line 215
    rem-int/lit16 p1, p1, 0x80

    .line 216
    .line 217
    sput p1, LVa/y7;->m:I

    .line 218
    .line 219
    invoke-virtual {v4}, LVa/B7;->a()LVa/f0;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    sget p2, LVa/f0;->g:I

    .line 227
    .line 228
    add-int/lit8 p2, p2, 0x13

    .line 229
    .line 230
    rem-int/lit16 p2, p2, 0x80

    .line 231
    .line 232
    sput p2, LVa/f0;->h:I

    .line 233
    .line 234
    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    .line 235
    .line 236
    .line 237
    move-result-wide v3

    .line 238
    const-wide/16 v6, 0x0

    .line 239
    .line 240
    cmp-long p2, v3, v6

    .line 241
    .line 242
    add-int/lit8 p2, p2, -0x1

    .line 243
    .line 244
    int-to-short p2, p2

    .line 245
    invoke-static {v0, v0, v1}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    .line 246
    .line 247
    .line 248
    move-result v1

    .line 249
    const v3, 0x6e1df99b

    .line 250
    .line 251
    .line 252
    add-int/2addr v1, v3

    .line 253
    invoke-static {v0}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    .line 254
    .line 255
    .line 256
    move-result v0

    .line 257
    rsub-int/lit8 v0, v0, -0xa

    .line 258
    .line 259
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 260
    .line 261
    .line 262
    move-result v3

    .line 263
    shr-int/lit8 v3, v3, 0x16

    .line 264
    .line 265
    const v4, -0x5be82822

    .line 266
    .line 267
    .line 268
    sub-int/2addr v4, v3

    .line 269
    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    .line 270
    .line 271
    .line 272
    move-result-wide v8

    .line 273
    cmp-long v3, v8, v6

    .line 274
    .line 275
    sub-int/2addr v5, v3

    .line 276
    int-to-byte v3, v5

    .line 277
    invoke-static {p2, v1, v0, v4, v3}, LVa/f0;->g(SIIIB)Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object p2

    .line 281
    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object p2

    .line 285
    invoke-virtual {p1, p2, v2}, LVa/f0;->f(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 286
    .line 287
    .line 288
    sget p1, LVa/f0;->g:I

    .line 289
    .line 290
    add-int/lit8 p1, p1, 0x3

    .line 291
    .line 292
    rem-int/lit16 p1, p1, 0x80

    .line 293
    .line 294
    sput p1, LVa/f0;->h:I

    .line 295
    .line 296
    return-void

    .line 297
    :cond_4
    sget-object v7, LVa/sa;->P:Ljava/lang/String;

    .line 298
    .line 299
    invoke-virtual {p1, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    move-result v7

    .line 303
    if-eq v7, v5, :cond_d

    .line 304
    .line 305
    sget-object v0, LVa/sa;->N:Ljava/lang/String;

    .line 306
    .line 307
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    move-result v0

    .line 311
    if-eqz v0, :cond_6

    .line 312
    .line 313
    sget p1, LVa/y7;->l:I

    .line 314
    .line 315
    add-int/lit8 p1, p1, 0x7

    .line 316
    .line 317
    rem-int/lit16 p2, p1, 0x80

    .line 318
    .line 319
    sput p2, LVa/y7;->m:I

    .line 320
    .line 321
    rem-int/lit8 p1, p1, 0x2

    .line 322
    .line 323
    if-eqz p1, :cond_5

    .line 324
    .line 325
    invoke-virtual {v4}, LVa/B7;->a()LVa/f0;

    .line 326
    .line 327
    .line 328
    move-result-object p1

    .line 329
    invoke-virtual {p1, v2}, LVa/f0;->h(Lorg/json/JSONObject;)V

    .line 330
    .line 331
    .line 332
    return-void

    .line 333
    :cond_5
    invoke-virtual {v4}, LVa/B7;->a()LVa/f0;

    .line 334
    .line 335
    .line 336
    move-result-object p1

    .line 337
    invoke-virtual {p1, v2}, LVa/f0;->h(Lorg/json/JSONObject;)V

    .line 338
    .line 339
    .line 340
    throw v6

    .line 341
    :cond_6
    sget-object v0, LVa/sa;->M:Ljava/lang/String;

    .line 342
    .line 343
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 344
    .line 345
    .line 346
    move-result v0

    .line 347
    if-eqz v0, :cond_7

    .line 348
    .line 349
    sget p1, LVa/y7;->m:I

    .line 350
    .line 351
    add-int/lit8 p1, p1, 0x7

    .line 352
    .line 353
    rem-int/lit16 p1, p1, 0x80

    .line 354
    .line 355
    sput p1, LVa/y7;->l:I

    .line 356
    .line 357
    invoke-virtual {v4}, LVa/B7;->a()LVa/f0;

    .line 358
    .line 359
    .line 360
    move-result-object p1

    .line 361
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 362
    .line 363
    .line 364
    sget p2, LVa/f0;->h:I

    .line 365
    .line 366
    add-int/lit8 p2, p2, 0x55

    .line 367
    .line 368
    rem-int/lit16 p2, p2, 0x80

    .line 369
    .line 370
    sput p2, LVa/f0;->g:I

    .line 371
    .line 372
    invoke-static {v1, v1, v1, v1}, Landroid/graphics/Color;->argb(IIII)I

    .line 373
    .line 374
    .line 375
    move-result p2

    .line 376
    rsub-int/lit8 p2, p2, 0xa

    .line 377
    .line 378
    const-string v0, "\u0832\u3b49\u622d\u5a66\uca91\u8e39\u7a27\u98de\u19c6\ud3e0"

    .line 379
    .line 380
    invoke-static {v0, p2}, LVa/f0;->i(Ljava/lang/String;I)Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object p2

    .line 384
    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object p2

    .line 388
    invoke-virtual {p1, p2, v2}, LVa/f0;->f(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 389
    .line 390
    .line 391
    sget p1, LVa/f0;->h:I

    .line 392
    .line 393
    add-int/lit8 p1, p1, 0x71

    .line 394
    .line 395
    rem-int/lit16 p2, p1, 0x80

    .line 396
    .line 397
    sput p2, LVa/f0;->g:I

    .line 398
    .line 399
    rem-int/lit8 p1, p1, 0x2

    .line 400
    .line 401
    if-eqz p1, :cond_e

    .line 402
    .line 403
    const/16 p1, 0x2f

    .line 404
    .line 405
    div-int/2addr p1, v1

    .line 406
    return-void

    .line 407
    :cond_7
    sget-object v0, LVa/sa;->Q:Ljava/lang/String;

    .line 408
    .line 409
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 410
    .line 411
    .line 412
    move-result v0

    .line 413
    if-nez v0, :cond_b

    .line 414
    .line 415
    sget-object v0, LVa/sa;->S:Ljava/lang/String;

    .line 416
    .line 417
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 418
    .line 419
    .line 420
    move-result v0

    .line 421
    xor-int/2addr v0, v5

    .line 422
    if-eq v0, v5, :cond_8

    .line 423
    .line 424
    invoke-virtual {v4}, LVa/B7;->a()LVa/f0;

    .line 425
    .line 426
    .line 427
    move-result-object p1

    .line 428
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 429
    .line 430
    .line 431
    sget p2, LVa/f0;->h:I

    .line 432
    .line 433
    add-int/lit8 p2, p2, 0x19

    .line 434
    .line 435
    rem-int/lit16 p2, p2, 0x80

    .line 436
    .line 437
    sput p2, LVa/f0;->g:I

    .line 438
    .line 439
    invoke-static {v1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 440
    .line 441
    .line 442
    move-result p2

    .line 443
    add-int/lit8 p2, p2, 0xf

    .line 444
    .line 445
    const-string v0, "\u0832\u3b49\u622d\u5a66\u7cb6\u33b2\u1ea6\u722c\u6dc8\uac8b\u0889\ua5de\ua674\u6bd2\uef0c\u22a9"

    .line 446
    .line 447
    invoke-static {v0, p2}, LVa/f0;->i(Ljava/lang/String;I)Ljava/lang/String;

    .line 448
    .line 449
    .line 450
    move-result-object p2

    .line 451
    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 452
    .line 453
    .line 454
    move-result-object p2

    .line 455
    invoke-virtual {p1, p2, v2}, LVa/f0;->f(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 456
    .line 457
    .line 458
    sget p1, LVa/f0;->h:I

    .line 459
    .line 460
    add-int/lit8 p1, p1, 0x59

    .line 461
    .line 462
    rem-int/lit16 p1, p1, 0x80

    .line 463
    .line 464
    sput p1, LVa/f0;->g:I

    .line 465
    .line 466
    return-void

    .line 467
    :cond_8
    sget-object v0, LVa/sa;->R:Ljava/lang/String;

    .line 468
    .line 469
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 470
    .line 471
    .line 472
    move-result v0

    .line 473
    if-eqz v0, :cond_a

    .line 474
    .line 475
    sget p1, LVa/y7;->m:I

    .line 476
    .line 477
    add-int/lit8 p1, p1, 0x79

    .line 478
    .line 479
    rem-int/lit16 p2, p1, 0x80

    .line 480
    .line 481
    sput p2, LVa/y7;->l:I

    .line 482
    .line 483
    rem-int/lit8 p1, p1, 0x2

    .line 484
    .line 485
    if-nez p1, :cond_9

    .line 486
    .line 487
    invoke-virtual {v4}, LVa/B7;->a()LVa/f0;

    .line 488
    .line 489
    .line 490
    move-result-object p1

    .line 491
    invoke-virtual {p1, v2}, LVa/f0;->a(Lorg/json/JSONObject;)V

    .line 492
    .line 493
    .line 494
    return-void

    .line 495
    :cond_9
    invoke-virtual {v4}, LVa/B7;->a()LVa/f0;

    .line 496
    .line 497
    .line 498
    move-result-object p1

    .line 499
    invoke-virtual {p1, v2}, LVa/f0;->a(Lorg/json/JSONObject;)V

    .line 500
    .line 501
    .line 502
    throw v6

    .line 503
    :cond_a
    invoke-virtual {v4}, LVa/B7;->a()LVa/f0;

    .line 504
    .line 505
    .line 506
    move-result-object v0

    .line 507
    invoke-virtual {v0, p1, p2}, LVa/f0;->f(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 508
    .line 509
    .line 510
    return-void

    .line 511
    :cond_b
    sget p1, LVa/y7;->l:I

    .line 512
    .line 513
    add-int/lit8 p1, p1, 0x2b

    .line 514
    .line 515
    rem-int/lit16 p2, p1, 0x80

    .line 516
    .line 517
    sput p2, LVa/y7;->m:I

    .line 518
    .line 519
    rem-int/lit8 p1, p1, 0x2

    .line 520
    .line 521
    if-eqz p1, :cond_c

    .line 522
    .line 523
    invoke-virtual {v4}, LVa/B7;->a()LVa/f0;

    .line 524
    .line 525
    .line 526
    move-result-object p1

    .line 527
    invoke-virtual {p1, v2}, LVa/f0;->b(Lorg/json/JSONObject;)V

    .line 528
    .line 529
    .line 530
    return-void

    .line 531
    :cond_c
    invoke-virtual {v4}, LVa/B7;->a()LVa/f0;

    .line 532
    .line 533
    .line 534
    move-result-object p1

    .line 535
    invoke-virtual {p1, v2}, LVa/f0;->b(Lorg/json/JSONObject;)V

    .line 536
    .line 537
    .line 538
    throw v6

    .line 539
    :cond_d
    invoke-virtual {v4}, LVa/B7;->a()LVa/f0;

    .line 540
    .line 541
    .line 542
    move-result-object p1

    .line 543
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 544
    .line 545
    .line 546
    sget p2, LVa/f0;->g:I

    .line 547
    .line 548
    add-int/lit8 p2, p2, 0x23

    .line 549
    .line 550
    rem-int/lit16 p2, p2, 0x80

    .line 551
    .line 552
    sput p2, LVa/f0;->h:I

    .line 553
    .line 554
    invoke-static {v0, v3}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    .line 555
    .line 556
    .line 557
    move-result p2

    .line 558
    add-int/lit8 p2, p2, 0xc

    .line 559
    .line 560
    const-string v0, "\u0832\u3b49\u622d\u5a66\u0889\ua5de\u1d1f\u8138\uf6ad\u56af\ue555\uf235"

    .line 561
    .line 562
    invoke-static {v0, p2}, LVa/f0;->i(Ljava/lang/String;I)Ljava/lang/String;

    .line 563
    .line 564
    .line 565
    move-result-object p2

    .line 566
    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 567
    .line 568
    .line 569
    move-result-object p2

    .line 570
    invoke-virtual {p1, p2, v2}, LVa/f0;->f(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 571
    .line 572
    .line 573
    sget p1, LVa/f0;->g:I

    .line 574
    .line 575
    add-int/lit8 p1, p1, 0x6d

    .line 576
    .line 577
    rem-int/lit16 p2, p1, 0x80

    .line 578
    .line 579
    sput p2, LVa/f0;->h:I

    .line 580
    .line 581
    rem-int/lit8 p1, p1, 0x2

    .line 582
    .line 583
    if-eqz p1, :cond_f

    .line 584
    .line 585
    :cond_e
    return-void

    .line 586
    :cond_f
    throw v6

    .line 587
    :cond_10
    throw v6

    .line 588
    :cond_11
    invoke-virtual {p0}, LVa/y7;->a()Lorg/json/JSONObject;

    .line 589
    .line 590
    .line 591
    move-result-object p1

    .line 592
    invoke-static {p1, p2}, LVa/Ab;->g0(Lorg/json/JSONObject;Lorg/json/JSONObject;)V

    .line 593
    .line 594
    .line 595
    throw v6

    .line 596
    :cond_12
    invoke-virtual {v4}, LVa/B7;->a()LVa/f0;

    .line 597
    .line 598
    .line 599
    move-result-object p1

    .line 600
    invoke-virtual {p1, p2}, LVa/f0;->d(Lorg/json/JSONObject;)V

    .line 601
    .line 602
    .line 603
    throw v6
.end method

.method public final p(Z)LVa/p7;
    .locals 2

    .line 1
    new-instance v0, LVa/p7;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-direct {v0, v1}, LVa/a;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iput-object p0, v0, LVa/p7;->z:LVa/y7;

    .line 9
    .line 10
    iput-boolean p1, v0, LVa/p7;->y:Z

    .line 11
    .line 12
    sget p1, LVa/y7;->l:I

    .line 13
    .line 14
    add-int/lit8 p1, p1, 0x69

    .line 15
    .line 16
    rem-int/lit16 p1, p1, 0x80

    .line 17
    .line 18
    sput p1, LVa/y7;->m:I

    .line 19
    .line 20
    return-object v0
.end method

.method public final q(Ljava/lang/String;)LVa/r8;
    .locals 2

    .line 1
    sget v0, LVa/y7;->m:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x7

    .line 4
    .line 5
    rem-int/lit16 v1, v1, 0x80

    .line 6
    .line 7
    sput v1, LVa/y7;->l:I

    .line 8
    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x5

    .line 12
    .line 13
    rem-int/lit16 v1, v0, 0x80

    .line 14
    .line 15
    sput v1, LVa/y7;->l:I

    .line 16
    .line 17
    rem-int/lit8 v0, v0, 0x2

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, LVa/y7;->h()LVa/ha;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0, p1}, LVa/ha;->f(Ljava/lang/String;)LVa/r8;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    const/16 v0, 0x39

    .line 30
    .line 31
    div-int/lit8 v0, v0, 0x0

    .line 32
    .line 33
    return-object p1

    .line 34
    :cond_0
    invoke-virtual {p0}, LVa/y7;->h()LVa/ha;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0, p1}, LVa/ha;->f(Ljava/lang/String;)LVa/r8;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    return-object p1

    .line 43
    :cond_1
    const/4 p1, 0x0

    .line 44
    return-object p1
.end method

.method public final r(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_2

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {v1}, LVa/y7;->l(Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0, v1}, LVa/y7;->w(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    sget v1, LVa/y7;->m:I

    .line 38
    .line 39
    add-int/lit8 v1, v1, 0x3b

    .line 40
    .line 41
    rem-int/lit16 v1, v1, 0x80

    .line 42
    .line 43
    sput v1, LVa/y7;->l:I

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    sget v1, LVa/y7;->l:I

    .line 50
    .line 51
    add-int/lit8 v1, v1, 0x17

    .line 52
    .line 53
    rem-int/lit16 v1, v1, 0x80

    .line 54
    .line 55
    sput v1, LVa/y7;->m:I

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    sget p1, LVa/y7;->m:I

    .line 59
    .line 60
    add-int/lit8 p1, p1, 0x51

    .line 61
    .line 62
    rem-int/lit16 v1, p1, 0x80

    .line 63
    .line 64
    sput v1, LVa/y7;->l:I

    .line 65
    .line 66
    rem-int/lit8 p1, p1, 0x2

    .line 67
    .line 68
    if-eqz p1, :cond_3

    .line 69
    .line 70
    const/16 p1, 0x42

    .line 71
    .line 72
    div-int/lit8 p1, p1, 0x0

    .line 73
    .line 74
    :cond_3
    return-object v0
.end method

.method public final t(Ljava/lang/String;Ljava/util/List;)V
    .locals 2

    .line 1
    new-instance v0, LVa/u7;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LVa/u7;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iput-object p0, v0, LVa/u7;->f:LVa/y7;

    .line 8
    .line 9
    iput-object p1, v0, LVa/u7;->d:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p2, v0, LVa/u7;->e:Ljava/util/List;

    .line 12
    .line 13
    invoke-static {v0}, LVa/Cb;->j(LVa/Ba;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, LVa/u7;

    .line 17
    .line 18
    const/4 v1, 0x2

    .line 19
    invoke-direct {v0, v1}, LVa/u7;-><init>(I)V

    .line 20
    .line 21
    .line 22
    iput-object p0, v0, LVa/u7;->f:LVa/y7;

    .line 23
    .line 24
    iput-object p1, v0, LVa/u7;->d:Ljava/lang/String;

    .line 25
    .line 26
    iput-object p2, v0, LVa/u7;->e:Ljava/util/List;

    .line 27
    .line 28
    invoke-static {v0}, LVa/Cb;->g(LVa/Ba;)V

    .line 29
    .line 30
    .line 31
    new-instance v0, LVa/u7;

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    invoke-direct {v0, v1}, LVa/u7;-><init>(I)V

    .line 35
    .line 36
    .line 37
    iput-object p0, v0, LVa/u7;->f:LVa/y7;

    .line 38
    .line 39
    iput-object p1, v0, LVa/u7;->d:Ljava/lang/String;

    .line 40
    .line 41
    iput-object p2, v0, LVa/u7;->e:Ljava/util/List;

    .line 42
    .line 43
    const/4 p1, 0x1

    .line 44
    invoke-static {v0, p1}, LVa/y7;->i(LVa/xa;Z)V

    .line 45
    .line 46
    .line 47
    sget p1, LVa/y7;->l:I

    .line 48
    .line 49
    add-int/lit8 p1, p1, 0x69

    .line 50
    .line 51
    rem-int/lit16 p2, p1, 0x80

    .line 52
    .line 53
    sput p2, LVa/y7;->m:I

    .line 54
    .line 55
    rem-int/lit8 p1, p1, 0x2

    .line 56
    .line 57
    if-nez p1, :cond_0

    .line 58
    .line 59
    const/16 p1, 0x37

    .line 60
    .line 61
    div-int/lit8 p1, p1, 0x0

    .line 62
    .line 63
    :cond_0
    return-void
.end method

.method public final u()LVa/B7;
    .locals 2

    .line 1
    sget v0, LVa/y7;->m:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x53

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/y7;->l:I

    .line 8
    .line 9
    add-int/lit8 v0, v0, 0x7b

    .line 10
    .line 11
    rem-int/lit16 v1, v0, 0x80

    .line 12
    .line 13
    sput v1, LVa/y7;->m:I

    .line 14
    .line 15
    rem-int/lit8 v0, v0, 0x2

    .line 16
    .line 17
    iget-object v1, p0, LVa/y7;->h:LVa/B7;

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    const/16 v0, 0x49

    .line 22
    .line 23
    div-int/lit8 v0, v0, 0x0

    .line 24
    .line 25
    :cond_0
    return-object v1
.end method

.method public final w(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    sget v0, LVa/y7;->l:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x17

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/y7;->m:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const-string v1, "\u008a\u008a\u008e\u008f\u0092\u008d"

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, LVa/y7;->c()LVa/Z0;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    shl-int/lit8 v2, v2, 0x61

    .line 24
    .line 25
    const/16 v3, 0x2a

    .line 26
    .line 27
    div-int/2addr v3, v2

    .line 28
    invoke-static {v3, v1}, LVa/y7;->v(ILjava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-static {p1, v1}, LVa/pb;->j0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {v0, p1}, LVa/Z0;->s0(Ljava/lang/String;)Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    if-eqz p1, :cond_1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-virtual {p0}, LVa/y7;->c()LVa/Z0;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    shr-int/lit8 v2, v2, 0x10

    .line 56
    .line 57
    add-int/lit8 v2, v2, 0x7f

    .line 58
    .line 59
    invoke-static {v2, v1}, LVa/y7;->v(ILjava/lang/String;)Ljava/lang/String;

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
    invoke-static {p1, v1}, LVa/pb;->j0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {v0, p1}, LVa/Z0;->s0(Ljava/lang/String;)Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    if-eqz p1, :cond_1

    .line 76
    .line 77
    :goto_0
    sget v0, LVa/y7;->l:I

    .line 78
    .line 79
    add-int/lit8 v0, v0, 0x3

    .line 80
    .line 81
    rem-int/lit16 v0, v0, 0x80

    .line 82
    .line 83
    sput v0, LVa/y7;->m:I

    .line 84
    .line 85
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    return-object p1

    .line 90
    :cond_1
    const/4 p1, 0x0

    .line 91
    return-object p1
.end method

.method public final x(Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 9

    .line 1
    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

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
    add-int/lit8 v0, v0, 0x7e

    .line 10
    .line 11
    const-string v1, "\u00a0\u0089\u0095\u0082\u008c\u009f\u008a\u009e"

    .line 12
    .line 13
    invoke-static {v0, v1}, LVa/y7;->v(ILjava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {}, Landroid/view/ViewConfiguration;->getMinimumFlingVelocity()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    shr-int/lit8 v1, v1, 0x10

    .line 30
    .line 31
    add-int/lit8 v1, v1, 0x7f

    .line 32
    .line 33
    const-string v2, "\u00a0\u0089\u0095\u0082\u008c\u009f\u008a\u009e"

    .line 34
    .line 35
    invoke-static {v1, v2}, LVa/y7;->v(ILjava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    const/4 v1, 0x0

    .line 47
    invoke-static {v1, v1}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    add-int/lit8 v2, v2, 0x7f

    .line 52
    .line 53
    const-string v3, "\u008a\u00a1\u0085\u0092\u0082\u009e\u008b\u0089"

    .line 54
    .line 55
    invoke-static {v2, v3}, LVa/y7;->v(ILjava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    const/4 v3, 0x0

    .line 68
    if-eqz v2, :cond_3

    .line 69
    .line 70
    sget v2, LVa/y7;->l:I

    .line 71
    .line 72
    add-int/lit8 v2, v2, 0x69

    .line 73
    .line 74
    rem-int/lit16 v2, v2, 0x80

    .line 75
    .line 76
    sput v2, LVa/y7;->m:I

    .line 77
    .line 78
    invoke-virtual {p0}, LVa/y7;->u()LVa/B7;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    monitor-enter v2

    .line 83
    :try_start_0
    sget v4, LVa/B7;->i:I

    .line 84
    .line 85
    add-int/lit8 v4, v4, 0x21

    .line 86
    .line 87
    rem-int/lit16 v5, v4, 0x80

    .line 88
    .line 89
    sput v5, LVa/B7;->h:I

    .line 90
    .line 91
    rem-int/lit8 v4, v4, 0x2

    .line 92
    .line 93
    if-nez v4, :cond_2

    .line 94
    .line 95
    iget-object v4, v2, LVa/B7;->g:LVa/Xa;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 96
    .line 97
    monitor-exit v2

    .line 98
    sget v2, LVa/y7;->l:I

    .line 99
    .line 100
    add-int/lit8 v2, v2, 0x31

    .line 101
    .line 102
    rem-int/lit16 v2, v2, 0x80

    .line 103
    .line 104
    sput v2, LVa/y7;->m:I

    .line 105
    .line 106
    if-eqz v4, :cond_3

    .line 107
    .line 108
    sget v2, LVa/Xa;->n:I

    .line 109
    .line 110
    add-int/lit8 v2, v2, 0x1b

    .line 111
    .line 112
    rem-int/lit16 v2, v2, 0x80

    .line 113
    .line 114
    sput v2, LVa/Xa;->m:I

    .line 115
    .line 116
    iget-object v2, v4, LVa/Xa;->f:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v2, Ljava/lang/String;

    .line 119
    .line 120
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    if-nez v2, :cond_0

    .line 125
    .line 126
    invoke-static {v1}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    add-int/lit16 v2, v2, 0x80

    .line 131
    .line 132
    const-string v5, "\u008a\u00a1\u0085\u0092\u0082\u009e\u008b\u0089"

    .line 133
    .line 134
    invoke-static {v2, v5}, LVa/y7;->v(ILjava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    :try_start_1
    invoke-static {v1}, Landroid/graphics/Color;->alpha(I)I

    .line 146
    .line 147
    .line 148
    move-result v2

    .line 149
    add-int/lit8 v2, v2, 0x7f

    .line 150
    .line 151
    const-string v5, "\u0085\u0092\u0082\u009e\u008b\u00a3\u0084\u00a2\u008a\u009e"

    .line 152
    .line 153
    invoke-static {v2, v5}, LVa/y7;->v(ILjava/lang/String;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    new-instance v5, Ljava/lang/StringBuilder;

    .line 162
    .line 163
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    sget v0, LVa/Xa;->n:I

    .line 170
    .line 171
    add-int/lit8 v0, v0, 0x1b

    .line 172
    .line 173
    rem-int/lit16 v0, v0, 0x80

    .line 174
    .line 175
    sput v0, LVa/Xa;->m:I

    .line 176
    .line 177
    iget-object v0, v4, LVa/Xa;->f:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v0, Ljava/lang/String;

    .line 180
    .line 181
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    invoke-virtual {p1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 189
    .line 190
    .line 191
    :catch_0
    :cond_0
    sget v0, LVa/Xa;->n:I

    .line 192
    .line 193
    add-int/lit8 v0, v0, 0x2f

    .line 194
    .line 195
    rem-int/lit16 v2, v0, 0x80

    .line 196
    .line 197
    sput v2, LVa/Xa;->m:I

    .line 198
    .line 199
    rem-int/lit8 v0, v0, 0x2

    .line 200
    .line 201
    if-nez v0, :cond_1

    .line 202
    .line 203
    add-int/lit8 v2, v2, 0x33

    .line 204
    .line 205
    rem-int/lit16 v2, v2, 0x80

    .line 206
    .line 207
    sput v2, LVa/Xa;->n:I

    .line 208
    .line 209
    iget-boolean v0, v4, LVa/Xa;->b:Z

    .line 210
    .line 211
    const/4 v2, 0x1

    .line 212
    xor-int/2addr v0, v2

    .line 213
    if-eq v0, v2, :cond_3

    .line 214
    .line 215
    sget v0, LVa/y7;->l:I

    .line 216
    .line 217
    add-int/lit8 v0, v0, 0x2b

    .line 218
    .line 219
    rem-int/lit16 v0, v0, 0x80

    .line 220
    .line 221
    sput v0, LVa/y7;->m:I

    .line 222
    .line 223
    :try_start_2
    invoke-static {v1, v1}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    .line 224
    .line 225
    .line 226
    move-result v0

    .line 227
    rsub-int/lit8 v0, v0, 0x7f

    .line 228
    .line 229
    const-string v4, "\u008a\u00a1\u008e\u008c\u0085\u00a0\u00a4\u0082\u008a\u0098"

    .line 230
    .line 231
    invoke-static {v0, v4}, LVa/y7;->v(ILjava/lang/String;)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1

    .line 240
    .line 241
    .line 242
    goto :goto_1

    .line 243
    :cond_1
    throw v3

    .line 244
    :catchall_0
    move-exception p1

    .line 245
    goto :goto_0

    .line 246
    :cond_2
    :try_start_3
    throw v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 247
    :catchall_1
    move-exception p1

    .line 248
    :try_start_4
    throw p1

    .line 249
    :goto_0
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 250
    throw p1

    .line 251
    :catch_1
    :cond_3
    :goto_1
    invoke-virtual {p1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 256
    .line 257
    .line 258
    move-result v2

    .line 259
    if-eqz v2, :cond_a

    .line 260
    .line 261
    sget v2, LVa/y7;->m:I

    .line 262
    .line 263
    add-int/lit8 v2, v2, 0x47

    .line 264
    .line 265
    rem-int/lit16 v2, v2, 0x80

    .line 266
    .line 267
    sput v2, LVa/y7;->l:I

    .line 268
    .line 269
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v2

    .line 273
    check-cast v2, Ljava/lang/String;

    .line 274
    .line 275
    sget v4, LVa/y7;->l:I

    .line 276
    .line 277
    add-int/lit8 v4, v4, 0x7

    .line 278
    .line 279
    rem-int/lit16 v5, v4, 0x80

    .line 280
    .line 281
    sput v5, LVa/y7;->m:I

    .line 282
    .line 283
    rem-int/lit8 v4, v4, 0x2

    .line 284
    .line 285
    if-nez v4, :cond_4

    .line 286
    .line 287
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v4

    .line 291
    instance-of v5, v4, Ljava/lang/String;

    .line 292
    .line 293
    const/16 v6, 0x56

    .line 294
    .line 295
    div-int/2addr v6, v1

    .line 296
    if-eqz v5, :cond_7

    .line 297
    .line 298
    goto :goto_3

    .line 299
    :cond_4
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v4

    .line 303
    instance-of v5, v4, Ljava/lang/String;

    .line 304
    .line 305
    if-eqz v5, :cond_7

    .line 306
    .line 307
    :goto_3
    check-cast v4, Ljava/lang/String;

    .line 308
    .line 309
    invoke-static {v4}, LVa/y7;->l(Ljava/lang/String;)Z

    .line 310
    .line 311
    .line 312
    move-result v5

    .line 313
    if-eqz v5, :cond_6

    .line 314
    .line 315
    invoke-virtual {p0, v4}, LVa/y7;->w(Ljava/lang/String;)Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v5

    .line 319
    if-eqz v5, :cond_5

    .line 320
    .line 321
    :try_start_5
    invoke-virtual {p1, v2, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_5
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_2

    .line 322
    .line 323
    .line 324
    goto :goto_4

    .line 325
    :cond_5
    invoke-virtual {p0}, LVa/y7;->f()Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object p1

    .line 329
    new-instance v0, Ljava/lang/StringBuilder;

    .line 330
    .line 331
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 332
    .line 333
    .line 334
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    .line 335
    .line 336
    .line 337
    move-result v2

    .line 338
    shr-int/lit8 v2, v2, 0x10

    .line 339
    .line 340
    add-int/lit8 v2, v2, 0x6

    .line 341
    .line 342
    const-string v5, ""

    .line 343
    .line 344
    invoke-static {v5}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    .line 345
    .line 346
    .line 347
    move-result v6

    .line 348
    rsub-int v6, v6, 0xda

    .line 349
    .line 350
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    .line 351
    .line 352
    .line 353
    move-result v7

    .line 354
    shr-int/lit8 v7, v7, 0x10

    .line 355
    .line 356
    rsub-int/lit8 v7, v7, 0x2

    .line 357
    .line 358
    const-string v8, "\u001a\uffc7\uffea\u0013\u0008\u001a"

    .line 359
    .line 360
    invoke-static {v8, v2, v6, v7, v1}, LVa/y7;->A(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v1

    .line 364
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v1

    .line 368
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 369
    .line 370
    .line 371
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 372
    .line 373
    .line 374
    const/16 v1, 0x30

    .line 375
    .line 376
    invoke-static {v5, v1}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    .line 377
    .line 378
    .line 379
    move-result v1

    .line 380
    add-int/lit16 v1, v1, 0x80

    .line 381
    .line 382
    const-string v2, "\u0096\u0098\u0085\u0082\u008a\u0099\u008c\u0082\u008b\u0082\u0085\u008a\u0089\u008f\u0099\u00a7\u008b\u0089\u0085\u008c\u0084\u00a6\u008e\u0099\u00a5\u0099\u0087\u008b\u0098\u0084\u0095\u0099\u0085\u0084\u008b\u0099"

    .line 383
    .line 384
    invoke-static {v1, v2}, LVa/y7;->v(ILjava/lang/String;)Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object v1

    .line 388
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v1

    .line 392
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v0

    .line 399
    invoke-static {p1, v0}, LVa/a;->J(Ljava/lang/String;Ljava/lang/String;)V

    .line 400
    .line 401
    .line 402
    return-object v3

    .line 403
    :cond_6
    sget v2, LVa/y7;->l:I

    .line 404
    .line 405
    add-int/lit8 v2, v2, 0x6f

    .line 406
    .line 407
    rem-int/lit16 v2, v2, 0x80

    .line 408
    .line 409
    sput v2, LVa/y7;->m:I

    .line 410
    .line 411
    goto :goto_4

    .line 412
    :cond_7
    instance-of v5, v4, Lorg/json/JSONArray;

    .line 413
    .line 414
    if-eqz v5, :cond_8

    .line 415
    .line 416
    :try_start_6
    check-cast v4, Lorg/json/JSONArray;

    .line 417
    .line 418
    invoke-static {v4}, LVa/Ab;->L(Lorg/json/JSONArray;)Ljava/util/ArrayList;

    .line 419
    .line 420
    .line 421
    move-result-object v4

    .line 422
    invoke-virtual {p0, v4}, LVa/y7;->r(Ljava/util/List;)Ljava/util/ArrayList;

    .line 423
    .line 424
    .line 425
    move-result-object v4

    .line 426
    new-instance v5, Lorg/json/JSONArray;

    .line 427
    .line 428
    invoke-direct {v5, v4}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {p1, v2, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_6
    .catch Lorg/json/JSONException; {:try_start_6 .. :try_end_6} :catch_2

    .line 432
    .line 433
    .line 434
    :catch_2
    :cond_8
    :goto_4
    sget v2, LVa/y7;->l:I

    .line 435
    .line 436
    add-int/lit8 v2, v2, 0x6b

    .line 437
    .line 438
    rem-int/lit16 v4, v2, 0x80

    .line 439
    .line 440
    sput v4, LVa/y7;->m:I

    .line 441
    .line 442
    rem-int/lit8 v2, v2, 0x2

    .line 443
    .line 444
    if-eqz v2, :cond_9

    .line 445
    .line 446
    goto/16 :goto_2

    .line 447
    .line 448
    :cond_9
    throw v3

    .line 449
    :cond_a
    return-object p1
.end method

.method public final y(Ljava/lang/String;LVa/h8;)V
    .locals 10

    .line 1
    sget v0, LVa/y7;->l:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x19

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/y7;->m:I

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    rem-int/2addr v0, v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v0, :cond_9

    .line 13
    .line 14
    invoke-virtual {p2}, LVa/h8;->a()Lorg/json/JSONObject;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    invoke-virtual {p0, p2}, LVa/y7;->x(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    if-eqz p2, :cond_8

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-static {v0}, Landroid/graphics/Color;->blue(I)I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    rsub-int/lit8 v3, v3, 0x12

    .line 30
    .line 31
    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    shr-int/lit8 v4, v4, 0x8

    .line 36
    .line 37
    add-int/lit16 v4, v4, 0xea

    .line 38
    .line 39
    const-string v5, "\uffeb\u0010\u0007\ufffc\u000b\u0006\u000c\ufffa\uffff\uffdb\ufffc\u000b\ufffc\ufffa\u000b\u0000\u0006\u0005"

    .line 40
    .line 41
    invoke-static {v0, v0}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    .line 42
    .line 43
    .line 44
    move-result-wide v6

    .line 45
    const-wide/16 v8, 0x0

    .line 46
    .line 47
    cmp-long v6, v6, v8

    .line 48
    .line 49
    rsub-int/lit8 v6, v6, 0x3

    .line 50
    .line 51
    invoke-static {v5, v3, v4, v6, v0}, LVa/y7;->A(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-virtual {p2, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-eqz v3, :cond_8

    .line 64
    .line 65
    sget v3, LVa/y7;->l:I

    .line 66
    .line 67
    add-int/lit8 v3, v3, 0x19

    .line 68
    .line 69
    rem-int/lit16 v3, v3, 0x80

    .line 70
    .line 71
    sput v3, LVa/y7;->m:I

    .line 72
    .line 73
    invoke-static {v0, v0, v0}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    rsub-int/lit8 v3, v3, 0x12

    .line 78
    .line 79
    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    shr-int/lit8 v4, v4, 0x10

    .line 84
    .line 85
    add-int/lit16 v4, v4, 0xea

    .line 86
    .line 87
    const-string v5, "\uffeb\u0010\u0007\ufffc\u000b\u0006\u000c\ufffa\uffff\uffdb\ufffc\u000b\ufffc\ufffa\u000b\u0000\u0006\u0005"

    .line 88
    .line 89
    const-string v6, ""

    .line 90
    .line 91
    const-string v7, ""

    .line 92
    .line 93
    invoke-static {v6, v7, v0, v0}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    .line 94
    .line 95
    .line 96
    move-result v6

    .line 97
    add-int/lit8 v6, v6, 0x4

    .line 98
    .line 99
    invoke-static {v5, v3, v4, v6, v0}, LVa/y7;->A(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    invoke-virtual {p2, v3, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    invoke-static {v3}, LVa/hb;->a(Ljava/lang/String;)LVa/hb;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    const v5, -0x62b40cf1

    .line 120
    .line 121
    .line 122
    const/4 v6, 0x1

    .line 123
    if-eq v4, v5, :cond_2

    .line 124
    .line 125
    const v5, -0x2ef42410

    .line 126
    .line 127
    .line 128
    if-eq v4, v5, :cond_1

    .line 129
    .line 130
    const v5, 0x373aa5

    .line 131
    .line 132
    .line 133
    if-eq v4, v5, :cond_0

    .line 134
    .line 135
    goto/16 :goto_0

    .line 136
    .line 137
    :cond_0
    invoke-static {v0, v0, v0}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 138
    .line 139
    .line 140
    move-result v4

    .line 141
    add-int/lit8 v4, v4, 0x4

    .line 142
    .line 143
    invoke-static {v0, v0}, Landroid/view/View;->getDefaultSize(II)I

    .line 144
    .line 145
    .line 146
    move-result v5

    .line 147
    rsub-int v5, v5, 0xef

    .line 148
    .line 149
    invoke-static {v0}, Landroid/graphics/Color;->green(I)I

    .line 150
    .line 151
    .line 152
    move-result v7

    .line 153
    add-int/2addr v7, v6

    .line 154
    const-string v8, "\u0008\t\ufff7\ufffb"

    .line 155
    .line 156
    invoke-static {v8, v4, v5, v7, v6}, LVa/y7;->A(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v4

    .line 164
    invoke-virtual {p1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result p1

    .line 168
    if-eqz p1, :cond_3

    .line 169
    .line 170
    sget p1, LVa/y7;->l:I

    .line 171
    .line 172
    add-int/lit8 p1, p1, 0x3b

    .line 173
    .line 174
    rem-int/lit16 p1, p1, 0x80

    .line 175
    .line 176
    sput p1, LVa/y7;->m:I

    .line 177
    .line 178
    move p1, v6

    .line 179
    goto :goto_1

    .line 180
    :cond_1
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 181
    .line 182
    .line 183
    move-result v4

    .line 184
    shr-int/lit8 v4, v4, 0x16

    .line 185
    .line 186
    add-int/lit8 v4, v4, 0x6

    .line 187
    .line 188
    invoke-static {v0}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 189
    .line 190
    .line 191
    move-result v5

    .line 192
    add-int/lit16 v5, v5, 0xef

    .line 193
    .line 194
    invoke-static {v0, v0, v0, v0}, Landroid/graphics/Color;->argb(IIII)I

    .line 195
    .line 196
    .line 197
    move-result v7

    .line 198
    add-int/lit8 v7, v7, 0x4

    .line 199
    .line 200
    const-string v8, "\ufff6\u0000\ufffb\t\t\u0001"

    .line 201
    .line 202
    invoke-static {v8, v4, v5, v7, v6}, LVa/y7;->A(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v4

    .line 206
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v4

    .line 210
    invoke-virtual {p1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result p1

    .line 214
    if-eqz p1, :cond_3

    .line 215
    .line 216
    sget p1, LVa/y7;->m:I

    .line 217
    .line 218
    add-int/lit8 p1, p1, 0x55

    .line 219
    .line 220
    rem-int/lit16 p1, p1, 0x80

    .line 221
    .line 222
    sput p1, LVa/y7;->l:I

    .line 223
    .line 224
    move p1, v1

    .line 225
    goto :goto_1

    .line 226
    :cond_2
    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    .line 227
    .line 228
    .line 229
    move-result v4

    .line 230
    shr-int/lit8 v4, v4, 0x8

    .line 231
    .line 232
    add-int/lit8 v4, v4, 0x8

    .line 233
    .line 234
    invoke-static {v0, v0}, Landroid/view/KeyEvent;->getDeadChar(II)I

    .line 235
    .line 236
    .line 237
    move-result v5

    .line 238
    rsub-int v5, v5, 0xee

    .line 239
    .line 240
    invoke-static {v0}, Landroid/graphics/Color;->blue(I)I

    .line 241
    .line 242
    .line 243
    move-result v7

    .line 244
    rsub-int/lit8 v7, v7, 0x7

    .line 245
    .line 246
    const-string v8, "\ufff6\u0007\ufffc\t\ufffc\u0007\u000c\ufff4"

    .line 247
    .line 248
    invoke-static {v8, v4, v5, v7, v0}, LVa/y7;->A(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v4

    .line 252
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v4

    .line 256
    invoke-virtual {p1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    move-result p1

    .line 260
    if-nez p1, :cond_4

    .line 261
    .line 262
    :cond_3
    :goto_0
    const/4 p1, -0x1

    .line 263
    goto :goto_1

    .line 264
    :cond_4
    sget p1, LVa/y7;->m:I

    .line 265
    .line 266
    add-int/lit8 p1, p1, 0x6f

    .line 267
    .line 268
    rem-int/lit16 p1, p1, 0x80

    .line 269
    .line 270
    sput p1, LVa/y7;->l:I

    .line 271
    .line 272
    move p1, v0

    .line 273
    :goto_1
    if-eqz p1, :cond_7

    .line 274
    .line 275
    if-eq p1, v6, :cond_6

    .line 276
    .line 277
    if-eq p1, v1, :cond_5

    .line 278
    .line 279
    goto :goto_2

    .line 280
    :cond_5
    invoke-static {v0, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 281
    .line 282
    .line 283
    move-result p1

    .line 284
    rsub-int/lit8 p1, p1, 0xd

    .line 285
    .line 286
    invoke-static {}, Landroid/view/ViewConfiguration;->getEdgeSlop()I

    .line 287
    .line 288
    .line 289
    move-result v1

    .line 290
    shr-int/lit8 v1, v1, 0x10

    .line 291
    .line 292
    add-int/lit16 v1, v1, 0xe7

    .line 293
    .line 294
    invoke-static {v0}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 295
    .line 296
    .line 297
    move-result v0

    .line 298
    add-int/lit8 v0, v0, 0x3

    .line 299
    .line 300
    const-string v4, "\uffff\u0003\u0010\uffff\u0007\ufffb\uffe8\r\r\ufffb\u0006\uffdd\u0011"

    .line 301
    .line 302
    invoke-static {v4, p1, v1, v0, v6}, LVa/y7;->A(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object p1

    .line 306
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object p1

    .line 310
    invoke-virtual {p2, p1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v2

    .line 314
    goto :goto_2

    .line 315
    :cond_6
    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    .line 316
    .line 317
    .line 318
    move-result p1

    .line 319
    shr-int/lit8 p1, p1, 0x10

    .line 320
    .line 321
    rsub-int/lit8 p1, p1, 0x7f

    .line 322
    .line 323
    const-string v0, "\u0082\u0083\u008e\u009a\u008a\u008a\u008e\u008f\u009d\u009c\u0082\u0089\u009b\u0087\u008e"

    .line 324
    .line 325
    invoke-static {p1, v0}, LVa/y7;->v(ILjava/lang/String;)Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object p1

    .line 329
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object p1

    .line 333
    invoke-virtual {p2, p1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    goto :goto_2

    .line 338
    :cond_7
    const/4 p1, 0x0

    .line 339
    invoke-static {p1, p1}, Landroid/graphics/PointF;->length(FF)F

    .line 340
    .line 341
    .line 342
    move-result v0

    .line 343
    cmpl-float p1, v0, p1

    .line 344
    .line 345
    rsub-int/lit8 p1, p1, 0x7f

    .line 346
    .line 347
    const-string v0, "\u0082\u0083\u008e\u009a\u0094\u0085\u0089\u0093\u0089\u0085\u0092\u0086\u0087\u008e"

    .line 348
    .line 349
    invoke-static {p1, v0}, LVa/y7;->v(ILjava/lang/String;)Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object p1

    .line 353
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object p1

    .line 357
    invoke-virtual {p2, p1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v2

    .line 361
    :goto_2
    if-eqz v3, :cond_8

    .line 362
    .line 363
    sget p1, LVa/y7;->m:I

    .line 364
    .line 365
    add-int/lit8 p1, p1, 0x3f

    .line 366
    .line 367
    rem-int/lit16 p1, p1, 0x80

    .line 368
    .line 369
    sput p1, LVa/y7;->l:I

    .line 370
    .line 371
    invoke-static {}, LVa/ib;->d()LVa/ib;

    .line 372
    .line 373
    .line 374
    move-result-object p1

    .line 375
    monitor-enter p1

    .line 376
    :try_start_0
    iget-object p2, p1, LVa/ib;->c:Ljava/lang/Object;

    .line 377
    .line 378
    check-cast p2, Landroid/os/Handler;

    .line 379
    .line 380
    new-instance v0, LVa/Da;

    .line 381
    .line 382
    const/16 v1, 0x16

    .line 383
    .line 384
    invoke-direct {v0, v1}, LVa/Da;-><init>(I)V

    .line 385
    .line 386
    .line 387
    iput-object p1, v0, LVa/Da;->f:Ljava/lang/Object;

    .line 388
    .line 389
    iput-object v2, v0, LVa/Da;->d:Ljava/lang/Object;

    .line 390
    .line 391
    iput-object v3, v0, LVa/Da;->e:Ljava/lang/Object;

    .line 392
    .line 393
    invoke-virtual {p2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 394
    .line 395
    .line 396
    monitor-exit p1

    .line 397
    return-void

    .line 398
    :catchall_0
    move-exception p2

    .line 399
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 400
    throw p2

    .line 401
    :cond_8
    return-void

    .line 402
    :cond_9
    invoke-virtual {p2}, LVa/h8;->a()Lorg/json/JSONObject;

    .line 403
    .line 404
    .line 405
    move-result-object p1

    .line 406
    invoke-virtual {p0, p1}, LVa/y7;->x(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 407
    .line 408
    .line 409
    throw v2
.end method

.method public final z()Landroid/content/Context;
    .locals 3

    .line 1
    sget v0, LVa/y7;->l:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x4b

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/y7;->m:I

    .line 8
    .line 9
    invoke-virtual {p0}, LVa/y7;->u()LVa/B7;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    sget v1, LVa/B7;->i:I

    .line 17
    .line 18
    add-int/lit8 v1, v1, 0xd

    .line 19
    .line 20
    rem-int/lit16 v1, v1, 0x80

    .line 21
    .line 22
    sput v1, LVa/B7;->h:I

    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x6d

    .line 25
    .line 26
    rem-int/lit16 v2, v1, 0x80

    .line 27
    .line 28
    sput v2, LVa/B7;->i:I

    .line 29
    .line 30
    rem-int/lit8 v1, v1, 0x2

    .line 31
    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    sget v1, LVa/y7;->l:I

    .line 35
    .line 36
    add-int/lit8 v1, v1, 0x5f

    .line 37
    .line 38
    rem-int/lit16 v1, v1, 0x80

    .line 39
    .line 40
    sput v1, LVa/y7;->m:I

    .line 41
    .line 42
    iget-object v0, v0, LVa/B7;->e:Landroid/content/Context;

    .line 43
    .line 44
    return-object v0

    .line 45
    :cond_0
    const/4 v0, 0x0

    .line 46
    throw v0
.end method
