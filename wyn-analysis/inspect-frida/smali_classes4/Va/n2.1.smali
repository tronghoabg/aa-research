.class public final LVa/n2;
.super Ljava/util/WeakHashMap;
.source "SourceFile"

# interfaces
.implements LVa/H9;


# static fields
.field public static c:I = 0x0

.field public static d:I = 0x1


# instance fields
.field public final a:LVa/Ra;

.field public final synthetic b:LVa/o2;


# direct methods
.method public constructor <init>(LVa/o2;Ljava/util/WeakHashMap;LVa/Ra;)V
    .locals 0

    .line 1
    iput-object p1, p0, LVa/n2;->b:LVa/o2;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Ljava/util/WeakHashMap;-><init>(Ljava/util/Map;)V

    .line 4
    .line 5
    .line 6
    iput-object p3, p0, LVa/n2;->a:LVa/Ra;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;Ljava/lang/ref/WeakReference;)Ljava/lang/ref/WeakReference;
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    sget v2, LVa/n2;->d:I

    .line 4
    .line 5
    add-int/lit8 v2, v2, 0x11

    .line 6
    .line 7
    rem-int/lit16 v2, v2, 0x80

    .line 8
    .line 9
    sput v2, LVa/n2;->c:I

    .line 10
    .line 11
    iget-object v2, p0, LVa/n2;->b:LVa/o2;

    .line 12
    .line 13
    iget-object v3, p0, LVa/n2;->a:LVa/Ra;

    .line 14
    .line 15
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    shr-int/lit8 v4, v4, 0x10

    .line 20
    .line 21
    add-int/lit8 v4, v4, 0x17

    .line 22
    .line 23
    const-wide/16 v5, 0x0

    .line 24
    .line 25
    invoke-static {v5, v6}, Landroid/widget/ExpandableListView;->getPackedPositionType(J)I

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    add-int/lit16 v5, v5, 0x11b

    .line 30
    .line 31
    const-string v6, "\u0013\uffed\u0000\u0013\u0008\u0015\u0004\uffe0\u0003\ufff6\u0004\u0000\n\uffe7\u0000\u0012\u0007\uffec\u0000\u000f\uffcd\u000f\u0014"

    .line 32
    .line 33
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    shr-int/lit8 v7, v7, 0x16

    .line 38
    .line 39
    add-int/2addr v7, v1

    .line 40
    invoke-virtual {v6}, Ljava/lang/String;->toCharArray()[C

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    sget-object v8, LVa/Ab;->x:Ljava/lang/Object;

    .line 45
    .line 46
    monitor-enter v8

    .line 47
    :try_start_0
    new-array v9, v4, [C

    .line 48
    .line 49
    sput v0, LVa/Ab;->v:I

    .line 50
    .line 51
    :goto_0
    sget v10, LVa/Ab;->v:I

    .line 52
    .line 53
    if-ge v10, v4, :cond_0

    .line 54
    .line 55
    aget-char v11, v6, v10

    .line 56
    .line 57
    add-int/2addr v11, v5

    .line 58
    int-to-char v11, v11

    .line 59
    aput-char v11, v9, v10

    .line 60
    .line 61
    add-int/lit16 v11, v11, -0xba

    .line 62
    .line 63
    int-to-char v11, v11

    .line 64
    aput-char v11, v9, v10

    .line 65
    .line 66
    add-int/2addr v10, v1

    .line 67
    sput v10, LVa/Ab;->v:I

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :catchall_0
    move-exception p1

    .line 71
    goto :goto_1

    .line 72
    :cond_0
    if-lez v7, :cond_1

    .line 73
    .line 74
    sput v7, LVa/Ab;->w:I

    .line 75
    .line 76
    new-array v5, v4, [C

    .line 77
    .line 78
    invoke-static {v9, v0, v5, v0, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 79
    .line 80
    .line 81
    sget v6, LVa/Ab;->w:I

    .line 82
    .line 83
    sub-int v7, v4, v6

    .line 84
    .line 85
    invoke-static {v5, v0, v9, v7, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 86
    .line 87
    .line 88
    sget v6, LVa/Ab;->w:I

    .line 89
    .line 90
    sub-int/2addr v4, v6

    .line 91
    invoke-static {v5, v6, v9, v0, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 92
    .line 93
    .line 94
    :cond_1
    new-instance v4, Ljava/lang/String;

    .line 95
    .line 96
    invoke-direct {v4, v9}, Ljava/lang/String;-><init>([C)V

    .line 97
    .line 98
    .line 99
    monitor-exit v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    const/4 v5, 0x2

    .line 105
    new-array v5, v5, [Ljava/lang/Object;

    .line 106
    .line 107
    aput-object p1, v5, v0

    .line 108
    .line 109
    aput-object p2, v5, v1

    .line 110
    .line 111
    invoke-virtual {v2, p0, v3, v4, v5}, LVa/Z0;->B0(LVa/H9;LVa/Ra;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    invoke-super {p0, p1, p2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    check-cast p1, Ljava/lang/ref/WeakReference;

    .line 119
    .line 120
    sget p2, LVa/n2;->d:I

    .line 121
    .line 122
    add-int/lit8 p2, p2, 0x59

    .line 123
    .line 124
    rem-int/lit16 p2, p2, 0x80

    .line 125
    .line 126
    sput p2, LVa/n2;->c:I

    .line 127
    .line 128
    return-object p1

    .line 129
    :goto_1
    monitor-exit v8

    .line 130
    throw p1
.end method

.method public final d()Ljava/lang/Object;
    .locals 3

    .line 1
    sget v0, LVa/n2;->c:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x6d

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/n2;->d:I

    .line 8
    .line 9
    add-int/lit8 v0, v0, 0x39

    .line 10
    .line 11
    rem-int/lit16 v1, v0, 0x80

    .line 12
    .line 13
    sput v1, LVa/n2;->c:I

    .line 14
    .line 15
    rem-int/lit8 v0, v0, 0x2

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    if-nez v0, :cond_2

    .line 19
    .line 20
    add-int/lit8 v1, v1, 0x5f

    .line 21
    .line 22
    rem-int/lit16 v0, v1, 0x80

    .line 23
    .line 24
    sput v0, LVa/n2;->d:I

    .line 25
    .line 26
    rem-int/lit8 v1, v1, 0x2

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    add-int/lit8 v0, v0, 0x6f

    .line 31
    .line 32
    rem-int/lit16 v1, v0, 0x80

    .line 33
    .line 34
    sput v1, LVa/n2;->c:I

    .line 35
    .line 36
    rem-int/lit8 v0, v0, 0x2

    .line 37
    .line 38
    if-nez v0, :cond_0

    .line 39
    .line 40
    return-object p0

    .line 41
    :cond_0
    throw v2

    .line 42
    :cond_1
    throw v2

    .line 43
    :cond_2
    throw v2
.end method

.method public final synthetic put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    sget v0, LVa/n2;->c:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x47

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/n2;->d:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    check-cast p1, Landroid/view/View;

    .line 12
    .line 13
    check-cast p2, Ljava/lang/ref/WeakReference;

    .line 14
    .line 15
    invoke-virtual {p0, p1, p2}, LVa/n2;->a(Landroid/view/View;Ljava/lang/ref/WeakReference;)Ljava/lang/ref/WeakReference;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    const/16 p2, 0x2c

    .line 22
    .line 23
    div-int/lit8 p2, p2, 0x0

    .line 24
    .line 25
    :cond_0
    return-object p1
.end method
