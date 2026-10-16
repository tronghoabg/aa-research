.class public abstract LVa/D7;
.super LVa/pb;
.source "SourceFile"


# static fields
.field public static final K:[B

.field public static L:I = 0x0

.field public static M:I = 0x1


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
    sput-object v0, LVa/D7;->K:[B

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 1
        -0x57t
        0x12t
        -0x9t
        0x4et
        -0x47t
        -0x7t
        0x5t
        -0xbt
        0x13t
        -0x4t
        -0xdt
        0xft
        0x43t
        -0x52t
        0x3t
        -0x3t
        0x0t
        0x2dt
        -0x53t
        0xct
        -0xbt
        0x11t
        0x41t
        -0x48t
        -0xct
        0xbt
        -0xet
        0x57t
        -0x53t
        0xet
        -0xet
        0x0t
        0x12t
        -0xbt
        0x9t
        0x43t
        -0x44t
        -0xat
        0xdt
        0x41t
        0x0t
        0x0t
        0x0t
    .end array-data
.end method

.method public static A0(Ljava/util/ArrayList;)I
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const-class v1, Ljava/lang/String;

    .line 3
    .line 4
    invoke-static {p0, v0, v1}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Ljava/lang/String;

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    invoke-static {p0, v2, v1}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v0, p0}, LVa/pb;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0
.end method

.method public static B0()LVa/da;
    .locals 2

    .line 1
    invoke-static {}, LVa/ha;->j()LVa/ha;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    new-instance v0, LVa/da;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, v1}, LVa/da;-><init>(I)V

    .line 12
    .line 13
    .line 14
    new-instance v1, LVa/ea;

    .line 15
    .line 16
    invoke-direct {v1}, LVa/ea;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v1, v0, LVa/da;->O:LVa/ca;

    .line 20
    .line 21
    return-object v0
.end method

.method public static C0(Ljava/util/ArrayList;)Landroid/view/View;
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    const-class v1, Landroid/view/View;

    .line 3
    .line 4
    invoke-static {p0, v0, v1}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    move-object v2, v1

    .line 9
    check-cast v2, Landroid/view/View;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    const-class v3, Ljava/lang/Class;

    .line 13
    .line 14
    invoke-static {p0, v1, v3}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    move-object v3, v1

    .line 19
    check-cast v3, Ljava/lang/Class;

    .line 20
    .line 21
    const/4 v1, 0x2

    .line 22
    const-class v4, Ljava/lang/Boolean;

    .line 23
    .line 24
    invoke-static {p0, v1, v4}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, Ljava/lang/Boolean;

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    sget-object p0, LVa/Bb;->a:Landroid/graphics/Rect;

    .line 35
    .line 36
    new-instance v9, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 39
    .line 40
    .line 41
    const/4 v4, 0x0

    .line 42
    const/4 v5, 0x1

    .line 43
    const/4 v7, 0x0

    .line 44
    const/4 v8, 0x0

    .line 45
    invoke-static/range {v2 .. v9}, LVa/Bb;->d(Landroid/view/View;Ljava/lang/Class;Ljava/lang/String;ZZLjava/util/List;Ljava/util/List;Ljava/util/ArrayList;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-nez p0, :cond_0

    .line 53
    .line 54
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    check-cast p0, Landroid/view/View;

    .line 59
    .line 60
    return-object p0

    .line 61
    :cond_0
    const/4 p0, 0x0

    .line 62
    return-object p0
.end method

.method public static D0(Ljava/util/ArrayList;)Ljava/lang/Object;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const-class v1, Landroid/util/Pair;

    .line 3
    .line 4
    invoke-static {p0, v0, v1}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Landroid/util/Pair;

    .line 9
    .line 10
    iget-object p0, p0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 11
    .line 12
    return-object p0
.end method

.method public static E0(IIBSI)Ljava/lang/String;
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
    add-int/lit8 p1, p1, 0x53

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
    sget-object p1, LVa/D7;->K:[B

    .line 20
    .line 21
    const v2, -0x7825944a

    .line 22
    .line 23
    .line 24
    add-int/2addr v2, p4

    .line 25
    aget-byte p1, p1, v2

    .line 26
    .line 27
    add-int/lit8 p1, p1, 0x53

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
    const v2, 0x7825944c

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
    const p2, 0x56bd92f3

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
    sget-object p0, LVa/D7;->K:[B

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

.method public static F0(Ljava/util/ArrayList;)Ljava/lang/reflect/Method;
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    const-class v1, LVa/ia;

    .line 3
    .line 4
    invoke-static {p0, v0, v1}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, LVa/ia;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    instance-of v2, v2, Ljava/lang/Class;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    const-class v2, Ljava/lang/Class;

    .line 21
    .line 22
    invoke-static {p0, v1, v2}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, Ljava/lang/Class;

    .line 27
    .line 28
    new-instance v2, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-static {p0, v0, v2}, LVa/ha;->h(Ljava/lang/Class;LVa/ia;Ljava/util/ArrayList;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    if-nez p0, :cond_0

    .line 41
    .line 42
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    check-cast p0, Ljava/lang/reflect/Method;

    .line 47
    .line 48
    return-object p0

    .line 49
    :cond_0
    return-object v3

    .line 50
    :cond_1
    const-class v2, Ljava/lang/Object;

    .line 51
    .line 52
    invoke-static {p0, v1, v2}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    new-instance v2, Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-static {p0, v0, v2}, LVa/ha;->h(Ljava/lang/Class;LVa/ia;Ljava/util/ArrayList;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    if-nez p0, :cond_2

    .line 73
    .line 74
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    check-cast p0, Ljava/lang/reflect/Method;

    .line 79
    .line 80
    return-object p0

    .line 81
    :cond_2
    return-object v3
.end method

.method public static G0()LVa/da;
    .locals 3

    .line 1
    new-instance v0, LVa/da;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, LVa/da;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v1, LVa/ia;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance v2, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v2, v1, LVa/ia;->R:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {v1}, LVa/ia;->q0()V

    .line 20
    .line 21
    .line 22
    iput-object v1, v0, LVa/da;->O:LVa/ca;

    .line 23
    .line 24
    return-object v0
.end method

.method public static H0(Ljava/util/ArrayList;)Ljava/lang/Object;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const-class v1, Landroid/content/Context;

    .line 3
    .line 4
    invoke-static {p0, v0, v1}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Landroid/content/Context;

    .line 9
    .line 10
    invoke-static {p0}, LVa/pb;->T(Landroid/content/Context;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static I0(Ljava/util/ArrayList;)Ljava/lang/reflect/Field;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    instance-of v1, v1, Ljava/lang/Class;

    .line 7
    .line 8
    const-class v2, Ljava/lang/Class;

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-static {p0, v0, v2}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Ljava/lang/Class;

    .line 18
    .line 19
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    instance-of v1, v1, Ljava/lang/Class;

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    invoke-static {p0, v3, v2}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Ljava/lang/Class;

    .line 32
    .line 33
    invoke-static {}, LVa/ha;->j()LVa/ha;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iget-object v1, v1, LVa/ha;->a:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v1, LVa/ba;

    .line 40
    .line 41
    invoke-virtual {v1, v0, p0}, LVa/ba;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Field;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    :cond_0
    const-class v1, LVa/ea;

    .line 47
    .line 48
    invoke-static {p0, v3, v1}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    check-cast p0, LVa/ea;

    .line 53
    .line 54
    invoke-static {}, LVa/ha;->j()LVa/ha;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    iget-object v1, v1, LVa/ha;->a:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v1, LVa/ba;

    .line 61
    .line 62
    invoke-virtual {v1, v0, p0}, LVa/ba;->p(Ljava/lang/Class;LVa/ea;)Ljava/lang/reflect/Field;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0

    .line 67
    :cond_1
    const-class v1, Ljava/lang/Object;

    .line 68
    .line 69
    invoke-static {p0, v0, v1}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-static {p0, v3, v2}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    check-cast p0, Ljava/lang/Class;

    .line 78
    .line 79
    invoke-static {}, LVa/ha;->j()LVa/ha;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    iget-object v1, v1, LVa/ha;->a:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v1, LVa/ba;

    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {v1, v0, p0}, LVa/ba;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Field;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    return-object p0
.end method

.method public static J0(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    const-class v1, Ljava/lang/String;

    .line 3
    .line 4
    invoke-static {p0, v0, v1}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    check-cast v2, Ljava/lang/String;

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    instance-of v4, v4, Ljava/lang/String;

    .line 16
    .line 17
    if-eqz v4, :cond_1

    .line 18
    .line 19
    invoke-static {p0, v3, v1}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, Ljava/lang/String;

    .line 24
    .line 25
    sget v1, LVa/pb;->x:I

    .line 26
    .line 27
    add-int/lit8 v1, v1, 0x1f

    .line 28
    .line 29
    rem-int/lit16 v4, v1, 0x80

    .line 30
    .line 31
    sput v4, LVa/pb;->w:I

    .line 32
    .line 33
    rem-int/lit8 v1, v1, 0x2

    .line 34
    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    invoke-static {v2, p0, v3}, LVa/pb;->F(Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/ArrayList;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0

    .line 42
    :cond_0
    invoke-static {v2, p0, v0}, LVa/pb;->F(Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/ArrayList;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :cond_1
    new-instance v1, Lorg/json/JSONArray;

    .line 48
    .line 49
    const-class v4, Ljava/util/List;

    .line 50
    .line 51
    invoke-static {p0, v3, v4}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    check-cast p0, Ljava/util/Collection;

    .line 56
    .line 57
    invoke-direct {v1, p0}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 58
    .line 59
    .line 60
    new-instance p0, Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 63
    .line 64
    .line 65
    move v4, v0

    .line 66
    :goto_0
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    if-ge v4, v5, :cond_3

    .line 71
    .line 72
    sget v5, LVa/pb;->x:I

    .line 73
    .line 74
    add-int/lit8 v5, v5, 0x77

    .line 75
    .line 76
    rem-int/lit16 v6, v5, 0x80

    .line 77
    .line 78
    sput v6, LVa/pb;->w:I

    .line 79
    .line 80
    rem-int/lit8 v5, v5, 0x2

    .line 81
    .line 82
    if-eqz v5, :cond_2

    .line 83
    .line 84
    invoke-virtual {v1, v4}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    invoke-static {v2, v5, v3}, LVa/pb;->F(Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/ArrayList;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    invoke-virtual {p0, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 93
    .line 94
    .line 95
    add-int/lit8 v4, v4, 0x69

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_2
    invoke-virtual {v1, v4}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    invoke-static {v2, v5, v0}, LVa/pb;->F(Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/ArrayList;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    invoke-virtual {p0, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 107
    .line 108
    .line 109
    add-int/lit8 v4, v4, 0x1

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_3
    sget v0, LVa/pb;->x:I

    .line 113
    .line 114
    add-int/lit8 v0, v0, 0x31

    .line 115
    .line 116
    rem-int/lit16 v1, v0, 0x80

    .line 117
    .line 118
    sput v1, LVa/pb;->w:I

    .line 119
    .line 120
    rem-int/lit8 v0, v0, 0x2

    .line 121
    .line 122
    if-nez v0, :cond_4

    .line 123
    .line 124
    return-object p0

    .line 125
    :cond_4
    const/4 p0, 0x0

    .line 126
    throw p0
.end method

.method public static K0(Ljava/util/ArrayList;)Lorg/json/JSONObject;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const-class v1, Lorg/json/JSONObject;

    .line 3
    .line 4
    invoke-static {p0, v0, v1}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lorg/json/JSONObject;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x1

    .line 15
    if-le v1, v2, :cond_0

    .line 16
    .line 17
    const-class v1, Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-static {p0, v2, v1}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    :cond_0
    invoke-static {v0, v2}, LVa/Ab;->X(Lorg/json/JSONObject;Z)Lorg/json/JSONObject;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
.end method

.method public static L0(LVa/y7;Ljava/util/ArrayList;)V
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-class v1, Ljava/lang/String;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-static {v0, v2, v1}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    move-object v4, v1

    .line 11
    check-cast v4, Ljava/lang/String;

    .line 12
    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual/range {p0 .. p0}, LVa/y7;->f()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-static {v2, v2}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    .line 26
    .line 27
    .line 28
    move-result-wide v5

    .line 29
    const-wide/16 v7, 0x0

    .line 30
    .line 31
    cmp-long v3, v5, v7

    .line 32
    .line 33
    rsub-int v3, v3, 0x617d

    .line 34
    .line 35
    int-to-char v3, v3

    .line 36
    const-string v5, "\u0000\u0000\u0000\u0000"

    .line 37
    .line 38
    const-string v6, "\u8bcc\u3470\u7ea3\u0b61"

    .line 39
    .line 40
    const-string v9, "\uff40"

    .line 41
    .line 42
    const v10, -0x5ccb8f75

    .line 43
    .line 44
    .line 45
    invoke-static {v7, v8}, Landroid/widget/ExpandableListView;->getPackedPositionType(J)I

    .line 46
    .line 47
    .line 48
    move-result v7

    .line 49
    add-int/2addr v7, v10

    .line 50
    invoke-virtual {v9}, Ljava/lang/String;->toCharArray()[C

    .line 51
    .line 52
    .line 53
    move-result-object v8

    .line 54
    invoke-virtual {v6}, Ljava/lang/String;->toCharArray()[C

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    invoke-virtual {v5}, Ljava/lang/String;->toCharArray()[C

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    sget-object v9, LVa/a;->r:Ljava/lang/Object;

    .line 63
    .line 64
    monitor-enter v9

    .line 65
    :try_start_0
    invoke-virtual {v6}, [C->clone()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    check-cast v6, [C

    .line 70
    .line 71
    invoke-virtual {v5}, [C->clone()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    check-cast v5, [C

    .line 76
    .line 77
    aget-char v10, v6, v2

    .line 78
    .line 79
    xor-int/2addr v3, v10

    .line 80
    int-to-char v3, v3

    .line 81
    aput-char v3, v6, v2

    .line 82
    .line 83
    const/4 v3, 0x2

    .line 84
    aget-char v10, v5, v3

    .line 85
    .line 86
    int-to-char v7, v7

    .line 87
    add-int/2addr v10, v7

    .line 88
    int-to-char v7, v10

    .line 89
    aput-char v7, v5, v3

    .line 90
    .line 91
    array-length v7, v8

    .line 92
    new-array v10, v7, [C

    .line 93
    .line 94
    sput v2, LVa/a;->q:I

    .line 95
    .line 96
    :goto_0
    sget v11, LVa/a;->q:I

    .line 97
    .line 98
    if-ge v11, v7, :cond_0

    .line 99
    .line 100
    add-int/lit8 v12, v11, 0x2

    .line 101
    .line 102
    rem-int/lit8 v12, v12, 0x4

    .line 103
    .line 104
    add-int/lit8 v13, v11, 0x3

    .line 105
    .line 106
    rem-int/lit8 v13, v13, 0x4

    .line 107
    .line 108
    rem-int/lit8 v14, v11, 0x4

    .line 109
    .line 110
    aget-char v14, v6, v14

    .line 111
    .line 112
    mul-int/lit16 v14, v14, 0x7fce

    .line 113
    .line 114
    aget-char v12, v5, v12

    .line 115
    .line 116
    add-int/2addr v14, v12

    .line 117
    const v15, 0xffff

    .line 118
    .line 119
    .line 120
    rem-int/2addr v14, v15

    .line 121
    int-to-char v14, v14

    .line 122
    move/from16 v16, v15

    .line 123
    .line 124
    aget-char v15, v6, v13

    .line 125
    .line 126
    mul-int/lit16 v15, v15, 0x7fce

    .line 127
    .line 128
    add-int/2addr v15, v12

    .line 129
    div-int v15, v15, v16

    .line 130
    .line 131
    int-to-char v12, v15

    .line 132
    aput-char v12, v5, v13

    .line 133
    .line 134
    aput-char v14, v6, v13

    .line 135
    .line 136
    aget-char v12, v8, v11

    .line 137
    .line 138
    xor-int/2addr v12, v14

    .line 139
    int-to-long v12, v12

    .line 140
    int-to-long v14, v2

    .line 141
    xor-long/2addr v12, v14

    .line 142
    const v14, 0xf189

    .line 143
    .line 144
    .line 145
    int-to-long v14, v14

    .line 146
    xor-long/2addr v12, v14

    .line 147
    long-to-int v12, v12

    .line 148
    int-to-char v12, v12

    .line 149
    aput-char v12, v10, v11

    .line 150
    .line 151
    add-int/lit8 v11, v11, 0x1

    .line 152
    .line 153
    sput v11, LVa/a;->q:I

    .line 154
    .line 155
    goto :goto_0

    .line 156
    :catchall_0
    move-exception v0

    .line 157
    goto/16 :goto_4

    .line 158
    .line 159
    :cond_0
    new-instance v5, Ljava/lang/String;

    .line 160
    .line 161
    invoke-direct {v5, v10}, Ljava/lang/String;-><init>([C)V

    .line 162
    .line 163
    .line 164
    monitor-exit v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 165
    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v5

    .line 169
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 173
    .line 174
    .line 175
    move-result v5

    .line 176
    invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v5

    .line 180
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v5

    .line 187
    const-class v1, Ljava/lang/Throwable;

    .line 188
    .line 189
    const/4 v6, 0x1

    .line 190
    invoke-static {v0, v6, v1}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    move-object v6, v1

    .line 195
    check-cast v6, Ljava/lang/Throwable;

    .line 196
    .line 197
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    if-le v1, v3, :cond_5

    .line 202
    .line 203
    const-class v1, Lorg/json/JSONObject;

    .line 204
    .line 205
    invoke-static {v0, v3, v1}, LVa/pb;->P(Ljava/util/List;ILjava/lang/Class;)Z

    .line 206
    .line 207
    .line 208
    move-result v1

    .line 209
    if-eqz v1, :cond_4

    .line 210
    .line 211
    const-class v1, Lorg/json/JSONObject;

    .line 212
    .line 213
    invoke-static {v0, v3, v1}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    check-cast v1, Lorg/json/JSONObject;

    .line 218
    .line 219
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 220
    .line 221
    .line 222
    move-result v3

    .line 223
    const/4 v7, 0x3

    .line 224
    if-le v3, v7, :cond_2

    .line 225
    .line 226
    const-class v3, Ljava/lang/Boolean;

    .line 227
    .line 228
    invoke-static {v0, v7, v3}, LVa/pb;->P(Ljava/util/List;ILjava/lang/Class;)Z

    .line 229
    .line 230
    .line 231
    move-result v3

    .line 232
    if-nez v3, :cond_1

    .line 233
    .line 234
    goto :goto_1

    .line 235
    :cond_1
    const-class v2, Ljava/lang/Boolean;

    .line 236
    .line 237
    invoke-static {v0, v7, v2}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    check-cast v0, Ljava/lang/Boolean;

    .line 242
    .line 243
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 244
    .line 245
    .line 246
    move-result v2

    .line 247
    :cond_2
    :goto_1
    move-object v7, v1

    .line 248
    :cond_3
    :goto_2
    move v8, v2

    .line 249
    goto :goto_3

    .line 250
    :cond_4
    const-class v1, Ljava/lang/Boolean;

    .line 251
    .line 252
    invoke-static {v0, v3, v1}, LVa/pb;->P(Ljava/util/List;ILjava/lang/Class;)Z

    .line 253
    .line 254
    .line 255
    move-result v1

    .line 256
    const/4 v7, 0x0

    .line 257
    if-eqz v1, :cond_3

    .line 258
    .line 259
    const-class v1, Ljava/lang/Boolean;

    .line 260
    .line 261
    invoke-static {v0, v3, v1}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    check-cast v0, Ljava/lang/Boolean;

    .line 266
    .line 267
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 268
    .line 269
    .line 270
    move-result v2

    .line 271
    goto :goto_2

    .line 272
    :goto_3
    invoke-virtual/range {p0 .. p0}, LVa/y7;->f()Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v3

    .line 276
    invoke-static/range {v3 .. v8}, LVa/Ab;->Q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Lorg/json/JSONObject;Z)V

    .line 277
    .line 278
    .line 279
    return-void

    .line 280
    :cond_5
    invoke-virtual/range {p0 .. p0}, LVa/y7;->f()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v3

    .line 284
    const/4 v7, 0x0

    .line 285
    const/4 v8, 0x0

    .line 286
    invoke-static/range {v3 .. v8}, LVa/Ab;->Q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Lorg/json/JSONObject;Z)V

    .line 287
    .line 288
    .line 289
    return-void

    .line 290
    :goto_4
    monitor-exit v9

    .line 291
    throw v0
.end method

.method public static M0(Ljava/util/ArrayList;)Z
    .locals 6

    .line 1
    sget v0, LVa/D7;->M:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x63

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/D7;->L:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    const-class v1, Ljava/lang/Object;

    .line 11
    .line 12
    invoke-static {p0, v0, v1}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const/4 v2, 0x1

    .line 17
    const-class v3, Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {p0, v2, v3}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    check-cast v3, Ljava/lang/String;

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    const-class v5, Ljava/util/List;

    .line 27
    .line 28
    invoke-static {p0, v4, v5}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    check-cast p0, Ljava/util/List;

    .line 33
    .line 34
    invoke-static {v1, v3, p0}, LVa/ub;->k(Ljava/lang/Object;Ljava/lang/String;Ljava/util/List;)Ljava/lang/reflect/Method;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    if-eqz p0, :cond_1

    .line 39
    .line 40
    sget p0, LVa/D7;->L:I

    .line 41
    .line 42
    add-int/lit8 p0, p0, 0x17

    .line 43
    .line 44
    rem-int/lit16 v1, p0, 0x80

    .line 45
    .line 46
    sput v1, LVa/D7;->M:I

    .line 47
    .line 48
    rem-int/2addr p0, v4

    .line 49
    if-nez p0, :cond_0

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    return v2

    .line 53
    :cond_1
    :goto_0
    return v0
.end method

.method public static N0(LVa/y7;Ljava/util/ArrayList;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const-class v1, Lorg/json/JSONObject;

    .line 3
    .line 4
    invoke-static {p1, v0, v1}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Lorg/json/JSONObject;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    sget v0, LVa/y7;->m:I

    .line 14
    .line 15
    add-int/lit8 v0, v0, 0x2d

    .line 16
    .line 17
    rem-int/lit16 v0, v0, 0x80

    .line 18
    .line 19
    sput v0, LVa/y7;->l:I

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    invoke-static {p1, v0}, LVa/Ab;->X(Lorg/json/JSONObject;Z)Lorg/json/JSONObject;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, LVa/y7;->i:Lorg/json/JSONObject;

    .line 27
    .line 28
    sget p0, LVa/y7;->l:I

    .line 29
    .line 30
    add-int/lit8 p0, p0, 0xf

    .line 31
    .line 32
    rem-int/lit16 p1, p0, 0x80

    .line 33
    .line 34
    sput p1, LVa/y7;->m:I

    .line 35
    .line 36
    rem-int/lit8 p0, p0, 0x2

    .line 37
    .line 38
    if-eqz p0, :cond_0

    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    const/4 p0, 0x0

    .line 42
    throw p0
.end method

.method public static O0(Ljava/util/ArrayList;)Landroid/webkit/WebView;
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    const-class v1, Landroid/app/Activity;

    .line 3
    .line 4
    invoke-static {p0, v0, v1}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    move-object v2, v1

    .line 9
    check-cast v2, Landroid/app/Activity;

    .line 10
    .line 11
    new-instance v1, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    const/4 v11, 0x0

    .line 21
    const/4 v4, 0x1

    .line 22
    if-le v3, v4, :cond_2

    .line 23
    .line 24
    const-class v3, Ljava/lang/Integer;

    .line 25
    .line 26
    invoke-static {p0, v4, v3}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Ljava/lang/Integer;

    .line 31
    .line 32
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    const/4 v5, 0x2

    .line 41
    if-le v4, v5, :cond_1

    .line 42
    .line 43
    const-class v4, Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {p0, v5, v4}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    check-cast v4, Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    const/4 v6, 0x3

    .line 56
    if-le v5, v6, :cond_0

    .line 57
    .line 58
    const-class v1, Ljava/util/List;

    .line 59
    .line 60
    invoke-static {p0, v6, v1}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    move-object v1, p0

    .line 65
    check-cast v1, Ljava/util/List;

    .line 66
    .line 67
    :cond_0
    move-object v9, v1

    .line 68
    move-object v5, v4

    .line 69
    move v4, v3

    .line 70
    goto :goto_1

    .line 71
    :cond_1
    :goto_0
    move-object v9, v1

    .line 72
    move v4, v3

    .line 73
    move-object v5, v11

    .line 74
    goto :goto_1

    .line 75
    :cond_2
    const/4 v3, -0x1

    .line 76
    goto :goto_0

    .line 77
    :goto_1
    sget-object p0, LVa/Bb;->a:Landroid/graphics/Rect;

    .line 78
    .line 79
    new-instance v10, Ljava/util/ArrayList;

    .line 80
    .line 81
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 82
    .line 83
    .line 84
    const-class v3, Landroid/webkit/WebView;

    .line 85
    .line 86
    const/4 v7, 0x0

    .line 87
    const/4 v6, 0x1

    .line 88
    const/4 v8, 0x0

    .line 89
    invoke-static/range {v2 .. v10}, LVa/Bb;->c(Landroid/app/Activity;Ljava/lang/Class;ILjava/lang/String;ZZLjava/util/List;Ljava/util/List;Ljava/util/ArrayList;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    if-lez p0, :cond_3

    .line 97
    .line 98
    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    move-object v11, p0

    .line 103
    check-cast v11, Landroid/view/View;

    .line 104
    .line 105
    :cond_3
    check-cast v11, Landroid/webkit/WebView;

    .line 106
    .line 107
    return-object v11
.end method

.method public static P0(Ljava/util/ArrayList;)Ljava/lang/String;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    const-class v1, Ljava/lang/String;

    .line 3
    .line 4
    invoke-static {p0, v0, v1}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    check-cast v2, Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    const/4 v4, 0x1

    .line 15
    const/4 v5, 0x2

    .line 16
    if-le v3, v5, :cond_0

    .line 17
    .line 18
    const-class v3, Ljava/lang/Boolean;

    .line 19
    .line 20
    invoke-static {p0, v5, v3}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    check-cast v3, Ljava/lang/Boolean;

    .line 25
    .line 26
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move v3, v4

    .line 32
    :goto_0
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    instance-of v6, v6, Ljava/lang/String;

    .line 37
    .line 38
    if-eqz v6, :cond_1

    .line 39
    .line 40
    invoke-static {p0, v4, v1}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    check-cast p0, Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {v2, p0, v3}, LVa/pb;->q(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :cond_1
    new-instance v1, Lorg/json/JSONArray;

    .line 52
    .line 53
    const-class v6, Ljava/util/List;

    .line 54
    .line 55
    invoke-static {p0, v4, v6}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    check-cast p0, Ljava/util/Collection;

    .line 60
    .line 61
    invoke-direct {v1, p0}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 62
    .line 63
    .line 64
    sget p0, LVa/pb;->w:I

    .line 65
    .line 66
    add-int/lit8 p0, p0, 0x3b

    .line 67
    .line 68
    rem-int/lit16 v6, p0, 0x80

    .line 69
    .line 70
    sput v6, LVa/pb;->x:I

    .line 71
    .line 72
    rem-int/2addr p0, v5

    .line 73
    if-nez p0, :cond_2

    .line 74
    .line 75
    move v0, v4

    .line 76
    :cond_2
    :goto_1
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    if-ge v0, p0, :cond_4

    .line 81
    .line 82
    sget p0, LVa/pb;->w:I

    .line 83
    .line 84
    add-int/lit8 p0, p0, 0x59

    .line 85
    .line 86
    rem-int/lit16 p0, p0, 0x80

    .line 87
    .line 88
    sput p0, LVa/pb;->x:I

    .line 89
    .line 90
    invoke-virtual {v1, v0}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-static {v2, p0, v3}, LVa/pb;->q(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    if-eqz p0, :cond_3

    .line 99
    .line 100
    return-object p0

    .line 101
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_4
    const/4 p0, 0x0

    .line 105
    return-object p0
.end method

.method public static Q0(Ljava/util/ArrayList;)Ljava/util/List;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    instance-of v1, v1, Ljava/lang/Class;

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-le v1, v2, :cond_0

    .line 16
    .line 17
    const-class v1, Ljava/lang/Class;

    .line 18
    .line 19
    invoke-static {p0, v0, v1}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Ljava/lang/Class;

    .line 24
    .line 25
    const-class v1, LVa/ea;

    .line 26
    .line 27
    invoke-static {p0, v2, v1}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, LVa/ea;

    .line 32
    .line 33
    invoke-static {}, LVa/ha;->j()LVa/ha;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iget-object v1, v1, LVa/ha;->a:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v1, LVa/ba;

    .line 40
    .line 41
    new-instance v2, Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, v0, p0, v2}, LVa/ba;->h(Ljava/lang/Class;LVa/ea;Ljava/util/ArrayList;)V

    .line 47
    .line 48
    .line 49
    return-object v2

    .line 50
    :cond_0
    new-instance p0, Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 53
    .line 54
    .line 55
    return-object p0

    .line 56
    :cond_1
    const-class v1, Ljava/lang/Object;

    .line 57
    .line 58
    invoke-static {p0, v0, v1}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-le v3, v2, :cond_2

    .line 67
    .line 68
    const-class v0, Ljava/lang/Boolean;

    .line 69
    .line 70
    invoke-static {p0, v2, v0}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    check-cast p0, Ljava/lang/Boolean;

    .line 75
    .line 76
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    :cond_2
    invoke-static {}, LVa/ha;->j()LVa/ha;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    const/4 v1, -0x1

    .line 92
    const/4 v2, 0x0

    .line 93
    invoke-static {p0, v0, v1, v2}, LVa/ba;->i(Ljava/lang/Class;ZILjava/util/List;)[Ljava/lang/reflect/Field;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    return-object p0
.end method

.method public static R0(Ljava/util/ArrayList;)V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    const-class v1, Landroid/content/Context;

    .line 3
    .line 4
    invoke-static {p0, v0, v1}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    check-cast v1, Landroid/content/Context;

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    const-class v3, Landroid/content/BroadcastReceiver;

    .line 12
    .line 13
    invoke-static {p0, v2, v3}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, Landroid/content/BroadcastReceiver;

    .line 18
    .line 19
    const/4 v4, 0x2

    .line 20
    const-class v5, Landroid/content/IntentFilter;

    .line 21
    .line 22
    invoke-static {p0, v4, v5}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, Landroid/content/IntentFilter;

    .line 27
    .line 28
    invoke-static {v1}, LVa/pb;->T(Landroid/content/Context;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    sget v5, LVa/pb;->y:I

    .line 33
    .line 34
    add-int/lit8 v5, v5, 0x45

    .line 35
    .line 36
    rem-int/lit16 v5, v5, 0x80

    .line 37
    .line 38
    sput v5, LVa/pb;->z:I

    .line 39
    .line 40
    :try_start_0
    const-string v5, "\u2b4f\u7d8d\u86f0\u2f2b\u701a\u9960\u23a6\u749c\u9dc7\u2625\u4f0c\u907f\u3aa8\u439a\u94fe\u3d34"

    .line 41
    .line 42
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    shr-int/lit8 v6, v6, 0x10

    .line 47
    .line 48
    rsub-int v6, v6, 0x56d5

    .line 49
    .line 50
    invoke-static {v6, v5}, LVa/pb;->f0(ILjava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    new-array v6, v4, [Ljava/lang/Object;

    .line 59
    .line 60
    aput-object v3, v6, v0

    .line 61
    .line 62
    aput-object p0, v6, v2

    .line 63
    .line 64
    invoke-static {v6}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    invoke-static {v1, v5, v6}, LVa/ub;->k(Ljava/lang/Object;Ljava/lang/String;Ljava/util/List;)Ljava/lang/reflect/Method;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    new-array v4, v4, [Ljava/lang/Object;

    .line 73
    .line 74
    aput-object v3, v4, v0

    .line 75
    .line 76
    aput-object p0, v4, v2

    .line 77
    .line 78
    invoke-virtual {v5, v1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 79
    .line 80
    .line 81
    sget p0, LVa/pb;->z:I

    .line 82
    .line 83
    add-int/lit8 p0, p0, 0x33

    .line 84
    .line 85
    rem-int/lit16 p0, p0, 0x80

    .line 86
    .line 87
    sput p0, LVa/pb;->y:I

    .line 88
    .line 89
    :catch_0
    return-void
.end method

.method public static S0(Ljava/util/ArrayList;)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    const-class v1, Lorg/json/JSONObject;

    .line 3
    .line 4
    invoke-static {p0, v0, v1}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lorg/json/JSONObject;

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    invoke-static {p0, v2, v1}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Lorg/json/JSONObject;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    const/4 v4, 0x2

    .line 22
    if-le v3, v4, :cond_0

    .line 23
    .line 24
    const-class v2, Ljava/lang/Boolean;

    .line 25
    .line 26
    invoke-static {p0, v4, v2}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, Ljava/lang/Boolean;

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    :cond_0
    invoke-static {v0, v1, v2}, LVa/Ab;->S(Lorg/json/JSONObject;Lorg/json/JSONObject;Z)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public static T0(Ljava/util/ArrayList;)Ljava/lang/Class;
    .locals 3

    .line 1
    sget v0, LVa/D7;->L:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0xb

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/D7;->M:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const-class v1, Ljava/lang/Class;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    invoke-static {p0, v0, v1}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    :goto_0
    check-cast p0, Ljava/lang/Class;

    .line 22
    .line 23
    invoke-static {p0, v2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :cond_0
    invoke-static {p0, v2, v1}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    goto :goto_0
.end method

.method public static U0(LVa/y7;Ljava/util/ArrayList;)Ljava/lang/Object;
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    const-class v1, Ljava/lang/Class;

    .line 3
    .line 4
    invoke-static {p1, v0, v1}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    check-cast v1, Ljava/lang/Class;

    .line 9
    .line 10
    new-instance v2, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    const-class v4, Ljava/util/List;

    .line 20
    .line 21
    const/4 v5, 0x1

    .line 22
    if-le v3, v5, :cond_0

    .line 23
    .line 24
    invoke-static {p1, v5, v4}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Ljava/util/List;

    .line 29
    .line 30
    sget v3, LVa/D7;->M:I

    .line 31
    .line 32
    add-int/lit8 v3, v3, 0x7d

    .line 33
    .line 34
    rem-int/lit16 v3, v3, 0x80

    .line 35
    .line 36
    sput v3, LVa/D7;->L:I

    .line 37
    .line 38
    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    const/4 v5, 0x2

    .line 43
    const/4 v6, 0x0

    .line 44
    if-le v3, v5, :cond_1

    .line 45
    .line 46
    invoke-static {p1, v5, v4}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    check-cast p1, Ljava/util/List;

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    move-object p1, v6

    .line 54
    :goto_0
    if-eqz p1, :cond_3

    .line 55
    .line 56
    sget v3, LVa/D7;->M:I

    .line 57
    .line 58
    add-int/lit8 v3, v3, 0x31

    .line 59
    .line 60
    rem-int/lit16 v3, v3, 0x80

    .line 61
    .line 62
    sput v3, LVa/D7;->L:I

    .line 63
    .line 64
    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    new-array v3, v3, [Ljava/lang/Class;

    .line 69
    .line 70
    invoke-interface {p1, v3}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    sget v4, LVa/ub;->d:I

    .line 74
    .line 75
    add-int/lit8 v4, v4, 0x4b

    .line 76
    .line 77
    rem-int/lit16 v4, v4, 0x80

    .line 78
    .line 79
    sput v4, LVa/ub;->c:I

    .line 80
    .line 81
    invoke-virtual {v1, v3}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-interface {v2}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    invoke-virtual {v3, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    sget v4, LVa/ub;->d:I

    .line 94
    .line 95
    add-int/lit8 v4, v4, 0x77

    .line 96
    .line 97
    rem-int/lit16 v7, v4, 0x80

    .line 98
    .line 99
    sput v7, LVa/ub;->c:I

    .line 100
    .line 101
    rem-int/2addr v4, v5

    .line 102
    if-nez v4, :cond_2

    .line 103
    .line 104
    return-object v3

    .line 105
    :cond_2
    throw v6

    .line 106
    :catch_0
    move-exception v3

    .line 107
    goto :goto_1

    .line 108
    :cond_3
    invoke-static {v1, v2}, LVa/ub;->i(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 112
    sget p1, LVa/D7;->M:I

    .line 113
    .line 114
    add-int/lit8 p1, p1, 0x75

    .line 115
    .line 116
    rem-int/lit16 p1, p1, 0x80

    .line 117
    .line 118
    sput p1, LVa/D7;->L:I

    .line 119
    .line 120
    return-object p0

    .line 121
    :goto_1
    invoke-virtual {p0}, LVa/y7;->u()LVa/B7;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    invoke-virtual {p0}, LVa/B7;->j()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    new-instance v4, Ljava/lang/StringBuilder;

    .line 130
    .line 131
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 132
    .line 133
    .line 134
    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    .line 135
    .line 136
    .line 137
    move-result v5

    .line 138
    shr-int/lit8 v5, v5, 0x8

    .line 139
    .line 140
    int-to-short v5, v5

    .line 141
    const-string v7, ""

    .line 142
    .line 143
    invoke-static {v7, v7}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    .line 144
    .line 145
    .line 146
    move-result v8

    .line 147
    const v9, -0x56bd92ae

    .line 148
    .line 149
    .line 150
    add-int/2addr v8, v9

    .line 151
    invoke-static {v7, v7, v0}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    .line 152
    .line 153
    .line 154
    move-result v9

    .line 155
    add-int/lit8 v9, v9, -0x40

    .line 156
    .line 157
    const v10, 0x7825944b

    .line 158
    .line 159
    .line 160
    invoke-static {v0}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    add-int/2addr v0, v10

    .line 165
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 166
    .line 167
    .line 168
    move-result v10

    .line 169
    shr-int/lit8 v10, v10, 0x16

    .line 170
    .line 171
    int-to-byte v10, v10

    .line 172
    invoke-static {v8, v9, v10, v5, v0}, LVa/D7;->E0(IIBSI)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    .line 191
    .line 192
    .line 193
    move-result v0

    .line 194
    shr-int/lit8 v0, v0, 0x10

    .line 195
    .line 196
    int-to-short v0, v0

    .line 197
    const/16 v1, 0x30

    .line 198
    .line 199
    invoke-static {v7, v1}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    .line 200
    .line 201
    .line 202
    move-result v5

    .line 203
    const v8, -0x56bd92d2

    .line 204
    .line 205
    .line 206
    add-int/2addr v5, v8

    .line 207
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    .line 208
    .line 209
    .line 210
    move-result v9

    .line 211
    shr-int/lit8 v9, v9, 0x10

    .line 212
    .line 213
    add-int/lit8 v9, v9, -0x48

    .line 214
    .line 215
    const v10, 0x7825945d

    .line 216
    .line 217
    .line 218
    invoke-static {v7, v1}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    .line 219
    .line 220
    .line 221
    move-result v11

    .line 222
    add-int/2addr v11, v10

    .line 223
    invoke-static {v7}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    .line 224
    .line 225
    .line 226
    move-result v10

    .line 227
    int-to-byte v10, v10

    .line 228
    invoke-static {v5, v9, v10, v0, v11}, LVa/D7;->E0(IIBSI)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    if-eqz p1, :cond_4

    .line 243
    .line 244
    new-instance v0, Ljava/lang/StringBuilder;

    .line 245
    .line 246
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 247
    .line 248
    .line 249
    invoke-static {v7}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    .line 250
    .line 251
    .line 252
    move-result v2

    .line 253
    int-to-short v2, v2

    .line 254
    invoke-static {v7, v1}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;C)I

    .line 255
    .line 256
    .line 257
    move-result v5

    .line 258
    add-int/2addr v5, v8

    .line 259
    invoke-static {v7}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    .line 260
    .line 261
    .line 262
    move-result v7

    .line 263
    rsub-int/lit8 v7, v7, -0x46

    .line 264
    .line 265
    invoke-static {}, Landroid/view/ViewConfiguration;->getMinimumFlingVelocity()I

    .line 266
    .line 267
    .line 268
    move-result v8

    .line 269
    shr-int/lit8 v8, v8, 0x10

    .line 270
    .line 271
    const v9, 0x78259466

    .line 272
    .line 273
    .line 274
    sub-int/2addr v9, v8

    .line 275
    invoke-static {v1}, Landroid/text/AndroidCharacter;->getMirror(C)C

    .line 276
    .line 277
    .line 278
    move-result v1

    .line 279
    add-int/lit8 v1, v1, -0x30

    .line 280
    .line 281
    int-to-byte v1, v1

    .line 282
    invoke-static {v5, v7, v1, v2, v9}, LVa/D7;->E0(IIBSI)Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v7

    .line 300
    :cond_4
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object p1

    .line 307
    invoke-static {p0, p1, v3}, LVa/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 308
    .line 309
    .line 310
    return-object v6
.end method

.method public static V0(Ljava/util/ArrayList;)Ljava/lang/reflect/Field;
    .locals 11

    .line 1
    const-class v0, Ljava/lang/Class;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {p0, v1, v0}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Ljava/lang/Class;

    .line 9
    .line 10
    const-class v2, Ljava/lang/String;

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    invoke-static {p0, v3, v2}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {}, LVa/ha;->j()LVa/ha;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    iget-object v2, v2, LVa/ha;->a:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v2, LVa/ba;

    .line 26
    .line 27
    const-class v4, LVa/ba;

    .line 28
    .line 29
    monitor-enter v4

    .line 30
    :try_start_0
    iget-object v5, v2, LVa/ba;->c:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v5, Ljava/util/ArrayList;

    .line 33
    .line 34
    if-nez v5, :cond_0

    .line 35
    .line 36
    new-instance v5, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object v5, v2, LVa/ba;->c:Ljava/lang/Object;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception p0

    .line 45
    goto :goto_4

    .line 46
    :cond_0
    :goto_0
    iget-object v5, v2, LVa/ba;->c:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v5, Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V

    .line 51
    .line 52
    .line 53
    iget-object v5, v2, LVa/ba;->c:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v5, Ljava/util/ArrayList;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    .line 57
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 58
    .line 59
    .line 60
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 61
    goto :goto_1

    .line 62
    :catch_0
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Class;->getFields()[Ljava/lang/reflect/Field;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    :goto_1
    array-length v6, v0

    .line 67
    move v7, v1

    .line 68
    :goto_2
    if-ge v7, v6, :cond_2

    .line 69
    .line 70
    aget-object v8, v0, v7

    .line 71
    .line 72
    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    move-result-object v9

    .line 76
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v9

    .line 80
    invoke-virtual {v9}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v9

    .line 84
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v10

    .line 88
    invoke-virtual {v9, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 89
    .line 90
    .line 91
    move-result v9

    .line 92
    if-eqz v9, :cond_1

    .line 93
    .line 94
    invoke-virtual {v8, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    :cond_1
    add-int/lit8 v7, v7, 0x1

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_2
    iget-object p0, v2, LVa/ba;->c:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast p0, Ljava/util/ArrayList;

    .line 106
    .line 107
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 108
    .line 109
    .line 110
    move-result p0

    .line 111
    if-nez p0, :cond_3

    .line 112
    .line 113
    iget-object p0, v2, LVa/ba;->c:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast p0, Ljava/util/ArrayList;

    .line 116
    .line 117
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    check-cast p0, Ljava/lang/reflect/Field;

    .line 122
    .line 123
    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 124
    goto :goto_3

    .line 125
    :cond_3
    monitor-exit v4

    .line 126
    const/4 p0, 0x0

    .line 127
    :goto_3
    return-object p0

    .line 128
    :goto_4
    monitor-exit v4

    .line 129
    throw p0
.end method

.method public static W0(Ljava/util/ArrayList;)V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    const-class v1, Landroid/content/Context;

    .line 3
    .line 4
    invoke-static {p0, v0, v1}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    check-cast v1, Landroid/content/Context;

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    const-class v3, Landroid/content/BroadcastReceiver;

    .line 12
    .line 13
    invoke-static {p0, v2, v3}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Landroid/content/BroadcastReceiver;

    .line 18
    .line 19
    invoke-static {v1}, LVa/pb;->T(Landroid/content/Context;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    sget v3, LVa/pb;->y:I

    .line 24
    .line 25
    add-int/lit8 v3, v3, 0x73

    .line 26
    .line 27
    rem-int/lit16 v4, v3, 0x80

    .line 28
    .line 29
    sput v4, LVa/pb;->z:I

    .line 30
    .line 31
    rem-int/lit8 v3, v3, 0x2

    .line 32
    .line 33
    const v4, 0x8064

    .line 34
    .line 35
    .line 36
    const-string v5, "\u2b48\uab36\u2b85\uaa77\u2ace\uaaad\u2910\ua98a\u2870\ua8c2\u289d\uaf0f\u2fe2\uae79\u2ed2\uaea0\u2d08\uadfa"

    .line 37
    .line 38
    if-nez v3, :cond_0

    .line 39
    .line 40
    :try_start_0
    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    .line 41
    .line 42
    .line 43
    move-result-wide v6

    .line 44
    const-wide/16 v8, 0x1

    .line 45
    .line 46
    cmp-long v3, v6, v8

    .line 47
    .line 48
    rem-int/2addr v4, v3

    .line 49
    invoke-static {v4, v5}, LVa/pb;->f0(ILjava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    new-array v4, v0, [Ljava/lang/Object;

    .line 58
    .line 59
    aput-object p0, v4, v2

    .line 60
    .line 61
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-static {v1, v3, v4}, LVa/ub;->k(Ljava/lang/Object;Ljava/lang/String;Ljava/util/List;)Ljava/lang/reflect/Method;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    new-array v2, v2, [Ljava/lang/Object;

    .line 70
    .line 71
    aput-object p0, v2, v0

    .line 72
    .line 73
    invoke-virtual {v3, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_0
    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    .line 78
    .line 79
    .line 80
    move-result-wide v6

    .line 81
    const-wide/16 v8, 0x0

    .line 82
    .line 83
    cmp-long v3, v6, v8

    .line 84
    .line 85
    add-int/2addr v3, v4

    .line 86
    invoke-static {v3, v5}, LVa/pb;->f0(ILjava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    new-array v4, v2, [Ljava/lang/Object;

    .line 95
    .line 96
    aput-object p0, v4, v0

    .line 97
    .line 98
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    invoke-static {v1, v3, v4}, LVa/ub;->k(Ljava/lang/Object;Ljava/lang/String;Ljava/util/List;)Ljava/lang/reflect/Method;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    new-array v2, v2, [Ljava/lang/Object;

    .line 107
    .line 108
    aput-object p0, v2, v0

    .line 109
    .line 110
    invoke-virtual {v3, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 111
    .line 112
    .line 113
    :catch_0
    :goto_0
    return-void
.end method

.method public static X0(Ljava/util/ArrayList;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const-class v1, Ljava/lang/String;

    .line 3
    .line 4
    invoke-static {p0, v0, v1}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {p0}, LVa/pb;->O(Ljava/lang/String;)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0
.end method

.method public static Y0(Ljava/util/ArrayList;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const-class v1, Landroid/view/View;

    .line 3
    .line 4
    invoke-static {p0, v0, v1}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Landroid/view/View;

    .line 9
    .line 10
    sget-object v0, LVa/Bb;->a:Landroid/graphics/Rect;

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Landroid/view/View;->getHitRect(Landroid/graphics/Rect;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0
.end method

.method public static q0(Ljava/util/ArrayList;)Ljava/lang/String;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    const-class v1, Ljava/lang/String;

    .line 3
    .line 4
    invoke-static {p0, v0, v1}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Ljava/lang/String;

    .line 9
    .line 10
    sget v1, LVa/pb;->w:I

    .line 11
    .line 12
    add-int/lit8 v1, v1, 0x5b

    .line 13
    .line 14
    rem-int/lit16 v2, v1, 0x80

    .line 15
    .line 16
    sput v2, LVa/pb;->x:I

    .line 17
    .line 18
    rem-int/lit8 v1, v1, 0x2

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    if-eqz v1, :cond_3

    .line 22
    .line 23
    if-eqz p0, :cond_2

    .line 24
    .line 25
    invoke-static {}, LVa/Cb;->h()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_2

    .line 30
    .line 31
    invoke-static {p0}, LVa/pb;->O(Ljava/lang/String;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-nez v1, :cond_0

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_0
    :try_start_0
    invoke-static {p0, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    new-instance v1, Ljava/io/ByteArrayInputStream;

    .line 43
    .line 44
    invoke-direct {v1, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 45
    .line 46
    .line 47
    new-instance p0, Ljava/util/zip/GZIPInputStream;

    .line 48
    .line 49
    invoke-direct {p0, v1}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    .line 50
    .line 51
    .line 52
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    .line 53
    .line 54
    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 55
    .line 56
    .line 57
    const/16 v3, 0x2000

    .line 58
    .line 59
    new-array v3, v3, [B

    .line 60
    .line 61
    :goto_0
    rsub-int v4, v0, 0x2000

    .line 62
    .line 63
    invoke-virtual {p0, v3, v0, v4}, Ljava/io/InputStream;->read([BII)I

    .line 64
    .line 65
    .line 66
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    const/4 v5, -0x1

    .line 68
    if-eq v4, v5, :cond_1

    .line 69
    .line 70
    sget v5, LVa/pb;->w:I

    .line 71
    .line 72
    add-int/2addr v0, v4

    .line 73
    add-int/lit8 v5, v5, 0x35

    .line 74
    .line 75
    rem-int/lit16 v5, v5, 0x80

    .line 76
    .line 77
    sput v5, LVa/pb;->x:I

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_1
    :try_start_1
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 84
    .line 85
    .line 86
    new-instance p0, Ljava/lang/String;

    .line 87
    .line 88
    const-string v0, "\u0001\u0000\u0001\u0001\u0001"

    .line 89
    .line 90
    const/4 v1, 0x3

    .line 91
    const/16 v4, 0x28

    .line 92
    .line 93
    const/4 v5, 0x5

    .line 94
    const/16 v6, 0x53

    .line 95
    .line 96
    filled-new-array {v4, v5, v6, v1}, [I

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    const/4 v4, 0x1

    .line 101
    invoke-static {v0, v1, v4}, LVa/pb;->Y(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-direct {p0, v3, v0}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 110
    .line 111
    .line 112
    return-object p0

    .line 113
    :catchall_0
    :cond_2
    :goto_1
    return-object v2

    .line 114
    :cond_3
    throw v2
.end method

.method public static r0(Ljava/util/ArrayList;)Landroid/media/MediaPlayer;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    const-class v1, Landroid/widget/VideoView;

    .line 3
    .line 4
    invoke-static {p0, v0, v1}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Landroid/widget/VideoView;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    :try_start_0
    invoke-static {v0}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    rsub-int/lit8 v3, v3, 0xc

    .line 16
    .line 17
    const-string v4, "\u0017\u0014\u0003\u0007\u0012\u000c\u001a\u000f\n\u0018\u0004\u0007"

    .line 18
    .line 19
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    shr-int/lit8 v5, v5, 0x10

    .line 24
    .line 25
    rsub-int/lit8 v5, v5, 0x5c

    .line 26
    .line 27
    int-to-byte v5, v5

    .line 28
    invoke-static {v5, v3, v4}, LVa/pb;->A(BILjava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-static {v1, v3}, LVa/pb;->E(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 37
    .line 38
    .line 39
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    sget v3, LVa/pb;->t:I

    .line 43
    .line 44
    add-int/lit8 v3, v3, 0x51

    .line 45
    .line 46
    rem-int/lit16 v4, v3, 0x80

    .line 47
    .line 48
    sput v4, LVa/pb;->u:I

    .line 49
    .line 50
    rem-int/lit8 v3, v3, 0x2

    .line 51
    .line 52
    if-eqz v3, :cond_0

    .line 53
    .line 54
    :try_start_1
    invoke-virtual {v1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    check-cast p0, Landroid/media/MediaPlayer;

    .line 59
    .line 60
    return-object p0

    .line 61
    :catch_0
    move-exception p0

    .line 62
    goto :goto_0

    .line 63
    :cond_0
    invoke-virtual {v1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    check-cast p0, Landroid/media/MediaPlayer;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 68
    .line 69
    :try_start_2
    throw v2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 70
    :catchall_0
    move-exception p0

    .line 71
    throw p0

    .line 72
    :goto_0
    const-string v1, ""

    .line 73
    .line 74
    invoke-static {v1, v0}, Landroid/text/TextUtils;->getOffsetAfter(Ljava/lang/CharSequence;I)I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    add-int/lit8 v1, v1, 0xc

    .line 79
    .line 80
    const/16 v3, 0x30

    .line 81
    .line 82
    invoke-static {v3}, Landroid/text/AndroidCharacter;->getMirror(C)C

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    add-int/lit8 v3, v3, 0x2d

    .line 87
    .line 88
    int-to-byte v3, v3

    .line 89
    const-string v4, "\n\u0002\n\u000b\u0006\u0011\u0007\u000f\u0000\u000e\u0011\u0002"

    .line 90
    .line 91
    invoke-static {v3, v1, v4}, LVa/pb;->A(BILjava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-static {v0}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    rsub-int/lit8 v3, v3, 0x7f

    .line 104
    .line 105
    const-string v4, "\u0084\u0089\u00a0\u0081\u0091\u009f\u0081\u0086\u0083\u0089\u008c\u0092\u0089\u008d\u009e\u0082\u0086\u009e\u0084\u0085\u0084\u0084\u0089"

    .line 106
    .line 107
    invoke-static {v3, v4}, LVa/pb;->W(ILjava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    invoke-static {v1, v3, p0, v0}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 116
    .line 117
    .line 118
    :cond_1
    sget p0, LVa/pb;->u:I

    .line 119
    .line 120
    add-int/lit8 p0, p0, 0x55

    .line 121
    .line 122
    rem-int/lit16 p0, p0, 0x80

    .line 123
    .line 124
    sput p0, LVa/pb;->t:I

    .line 125
    .line 126
    return-object v2
.end method

.method public static s0()J
    .locals 2

    .line 1
    invoke-static {}, LVa/pb;->S()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public static t0(Ljava/util/ArrayList;)Landroid/view/View;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const-class v1, Landroid/app/Activity;

    .line 3
    .line 4
    invoke-static {p0, v0, v1}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Landroid/app/Activity;

    .line 9
    .line 10
    sget-object v0, LVa/Bb;->a:Landroid/graphics/Rect;

    .line 11
    .line 12
    const v0, 0x1020002

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public static u0(Ljava/util/ArrayList;)Ljava/lang/Object;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const-class v1, Landroid/util/Pair;

    .line 3
    .line 4
    invoke-static {p0, v0, v1}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Landroid/util/Pair;

    .line 9
    .line 10
    iget-object p0, p0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 11
    .line 12
    return-object p0
.end method

.method public static v0(Ljava/util/ArrayList;)Ljava/lang/reflect/Field;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const-class v1, Ljava/lang/Class;

    .line 3
    .line 4
    invoke-static {p0, v0, v1}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Ljava/lang/Class;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    const-class v2, LVa/ea;

    .line 12
    .line 13
    invoke-static {p0, v1, v2}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, LVa/ea;

    .line 18
    .line 19
    invoke-static {}, LVa/ha;->j()LVa/ha;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iget-object v1, v1, LVa/ha;->a:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, LVa/ba;

    .line 26
    .line 27
    invoke-virtual {v1, v0, p0}, LVa/ba;->p(Ljava/lang/Class;LVa/ea;)Ljava/lang/reflect/Field;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method

.method public static w0(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    const-class v1, LVa/ia;

    .line 3
    .line 4
    invoke-static {p0, v0, v1}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, LVa/ia;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    instance-of v2, v2, Ljava/lang/Class;

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    const-class v2, Ljava/lang/Class;

    .line 20
    .line 21
    invoke-static {p0, v1, v2}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, Ljava/lang/Class;

    .line 26
    .line 27
    new-instance v1, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-static {p0, v0, v1}, LVa/ha;->h(Ljava/lang/Class;LVa/ia;Ljava/util/ArrayList;)V

    .line 33
    .line 34
    .line 35
    return-object v1

    .line 36
    :cond_0
    const-class v2, Ljava/lang/Object;

    .line 37
    .line 38
    invoke-static {p0, v1, v2}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    new-instance v1, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-static {p0, v0, v1}, LVa/ha;->h(Ljava/lang/Class;LVa/ia;Ljava/util/ArrayList;)V

    .line 52
    .line 53
    .line 54
    return-object v1
.end method

.method public static x0(LVa/y7;)Lorg/json/JSONObject;
    .locals 1

    .line 1
    sget v0, LVa/y7;->l:I

    .line 2
    .line 3
    iget-object p0, p0, LVa/y7;->i:Lorg/json/JSONObject;

    .line 4
    .line 5
    add-int/lit8 v0, v0, 0x31

    .line 6
    .line 7
    rem-int/lit16 v0, v0, 0x80

    .line 8
    .line 9
    sput v0, LVa/y7;->m:I

    .line 10
    .line 11
    return-object p0
.end method

.method public static y0(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    const-class v1, Ljava/lang/Object;

    .line 3
    .line 4
    invoke-static {p0, v0, v1}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    const/4 v2, 0x1

    .line 9
    const-class v3, Ljava/util/List;

    .line 10
    .line 11
    invoke-static {p0, v2, v3}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    check-cast v3, Ljava/util/List;

    .line 16
    .line 17
    const/4 v4, 0x2

    .line 18
    const-class v5, Ljava/lang/Integer;

    .line 19
    .line 20
    invoke-static {p0, v4, v5}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, Ljava/lang/Integer;

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    invoke-static {}, LVa/ha;->j()LVa/ha;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    iget-object v5, v5, LVa/ha;->b:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v5, LVa/la;

    .line 37
    .line 38
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    new-instance v5, LVa/ka;

    .line 42
    .line 43
    const/4 v6, 0x0

    .line 44
    invoke-direct {v5, v6}, LVa/ka;-><init>(I)V

    .line 45
    .line 46
    .line 47
    new-instance v6, LVa/ba;

    .line 48
    .line 49
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 50
    .line 51
    .line 52
    new-instance v7, LVa/ja;

    .line 53
    .line 54
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 55
    .line 56
    .line 57
    const/4 v8, -0x1

    .line 58
    iput v8, v7, LVa/ja;->f:I

    .line 59
    .line 60
    iput v8, v7, LVa/ja;->g:I

    .line 61
    .line 62
    iput v8, v7, LVa/ja;->i:I

    .line 63
    .line 64
    iput-boolean v2, v7, LVa/ja;->m:Z

    .line 65
    .line 66
    iput-object v7, v6, LVa/ba;->a:Ljava/lang/Object;

    .line 67
    .line 68
    iput v8, v7, LVa/ja;->j:I

    .line 69
    .line 70
    iput v8, v7, LVa/ja;->k:I

    .line 71
    .line 72
    iput v8, v7, LVa/ja;->l:I

    .line 73
    .line 74
    iput v8, v7, LVa/ja;->h:I

    .line 75
    .line 76
    iput-object v5, v6, LVa/ba;->b:Ljava/lang/Object;

    .line 77
    .line 78
    const/4 v5, 0x0

    .line 79
    iput-object v5, v6, LVa/ba;->c:Ljava/lang/Object;

    .line 80
    .line 81
    iput-object v3, v7, LVa/ja;->d:Ljava/util/List;

    .line 82
    .line 83
    iput p0, v7, LVa/ja;->e:I

    .line 84
    .line 85
    const-class p0, LVa/ka;

    .line 86
    .line 87
    iput-object p0, v7, LVa/ja;->b:Ljava/lang/Class;

    .line 88
    .line 89
    iput-object v5, v7, LVa/ja;->c:Ljava/lang/Class;

    .line 90
    .line 91
    new-instance p0, LF6/r;

    .line 92
    .line 93
    invoke-direct {p0, v6}, LF6/r;-><init>(LVa/ba;)V

    .line 94
    .line 95
    .line 96
    iput-boolean v2, p0, LF6/r;->b:Z

    .line 97
    .line 98
    invoke-static {v1, p0, v0, v5}, LVa/la;->l(Ljava/lang/Object;LF6/r;ILVa/na;)LVa/na;

    .line 99
    .line 100
    .line 101
    new-instance v0, Ljava/util/ArrayList;

    .line 102
    .line 103
    iget-object p0, p0, LF6/r;->f:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast p0, Ljava/util/HashSet;

    .line 106
    .line 107
    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 108
    .line 109
    .line 110
    sget p0, LVa/la;->c:I

    .line 111
    .line 112
    add-int/lit8 p0, p0, 0x2d

    .line 113
    .line 114
    rem-int/lit16 v1, p0, 0x80

    .line 115
    .line 116
    sput v1, LVa/la;->d:I

    .line 117
    .line 118
    rem-int/2addr p0, v4

    .line 119
    if-eqz p0, :cond_0

    .line 120
    .line 121
    return-object v0

    .line 122
    :cond_0
    throw v5
.end method

.method public static z0(Ljava/util/ArrayList;)C
    .locals 3

    .line 1
    sget v0, LVa/D7;->L:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x3b

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/D7;->M:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    const-class v1, Ljava/lang/Number;

    .line 11
    .line 12
    invoke-static {p0, v0, v1}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Ljava/lang/Number;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    int-to-char p0, p0

    .line 23
    sget v1, LVa/D7;->M:I

    .line 24
    .line 25
    add-int/lit8 v1, v1, 0x33

    .line 26
    .line 27
    rem-int/lit16 v2, v1, 0x80

    .line 28
    .line 29
    sput v2, LVa/D7;->L:I

    .line 30
    .line 31
    rem-int/lit8 v1, v1, 0x2

    .line 32
    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    const/16 v1, 0x10

    .line 36
    .line 37
    div-int/2addr v1, v0

    .line 38
    :cond_0
    return p0
.end method
