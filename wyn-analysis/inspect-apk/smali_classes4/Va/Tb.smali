.class public final LVa/Tb;
.super LVa/Pb;
.source "SourceFile"

# interfaces
.implements LVa/db;


# static fields
.field public static final r:Ljava/lang/String;

.field public static s:I = 0x0

.field public static t:I = 0x1


# instance fields
.field public k:LVa/q;

.field public l:Ljava/lang/Class;

.field public m:Z

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:LVa/Sb;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

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
    add-int/lit8 v0, v0, 0x26

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-static {v1, v1, v1, v1}, Landroid/graphics/Color;->argb(IIII)I

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    rsub-int/lit8 v4, v4, 0x8

    .line 17
    .line 18
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 19
    .line 20
    .line 21
    move-result-wide v5

    .line 22
    cmp-long v2, v5, v2

    .line 23
    .line 24
    add-int/lit16 v2, v2, 0xb9

    .line 25
    .line 26
    const-string v3, "\uffca\uffdd\u0000\uffef\u0004\u000b\u0013\n\uffff\u000b\t\uffca\u0005\u000e\u000b\n\u000f\u000b\u0011\u000e\uffff\u0001\uffca\ufffd\u0000\r\u0011\ufffd\u0008\u0005\u0010\u0015\u000f\u0000\u0007\uffca\u000f\u0000\u0007"

    .line 27
    .line 28
    invoke-static {v3, v0, v4, v2, v1}, LVa/Tb;->Q(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    sput-object v0, LVa/Tb;->r:Ljava/lang/String;

    .line 37
    .line 38
    sget v0, LVa/Tb;->t:I

    .line 39
    .line 40
    add-int/lit8 v0, v0, 0x39

    .line 41
    .line 42
    rem-int/lit16 v1, v0, 0x80

    .line 43
    .line 44
    sput v1, LVa/Tb;->s:I

    .line 45
    .line 46
    rem-int/lit8 v0, v0, 0x2

    .line 47
    .line 48
    if-nez v0, :cond_0

    .line 49
    .line 50
    return-void

    .line 51
    :cond_0
    const/4 v0, 0x0

    .line 52
    throw v0
.end method

.method public static E(Landroid/app/Activity;)Ljava/lang/String;
    .locals 2

    .line 1
    sget v0, LVa/Tb;->s:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x6d

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/Tb;->t:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :cond_0
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    throw p0
.end method

.method public static synthetic F(LVa/Tb;)LVa/Sb;
    .locals 2

    .line 1
    sget v0, LVa/Tb;->s:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x75

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/Tb;->t:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    iget-object p0, p0, LVa/Tb;->q:LVa/Sb;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const/16 v0, 0x62

    .line 16
    .line 17
    div-int/lit8 v0, v0, 0x0

    .line 18
    .line 19
    :cond_0
    add-int/lit8 v1, v1, 0x6b

    .line 20
    .line 21
    rem-int/lit16 v1, v1, 0x80

    .line 22
    .line 23
    sput v1, LVa/Tb;->s:I

    .line 24
    .line 25
    return-object p0
.end method

.method public static synthetic H(LVa/Tb;Z)V
    .locals 2

    .line 1
    sget v0, LVa/Tb;->t:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x3f

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/Tb;->s:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    iput-boolean p1, p0, LVa/Tb;->n:Z

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    add-int/lit8 v1, v1, 0x1d

    .line 16
    .line 17
    rem-int/lit16 v1, v1, 0x80

    .line 18
    .line 19
    sput v1, LVa/Tb;->t:I

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    throw p0
.end method

.method public static synthetic K(LVa/Tb;Z)V
    .locals 2

    .line 1
    sget v0, LVa/Tb;->s:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x43

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/Tb;->t:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    iput-boolean p1, p0, LVa/Tb;->m:Z

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    div-int/lit8 p0, p0, 0x0

    .line 17
    .line 18
    :cond_0
    add-int/lit8 v1, v1, 0x4f

    .line 19
    .line 20
    rem-int/lit16 v1, v1, 0x80

    .line 21
    .line 22
    sput v1, LVa/Tb;->s:I

    .line 23
    .line 24
    return-void
.end method

.method public static synthetic L(LVa/Tb;)Z
    .locals 2

    .line 1
    sget v0, LVa/Tb;->s:I

    .line 2
    .line 3
    iget-boolean p0, p0, LVa/Tb;->n:Z

    .line 4
    .line 5
    add-int/lit8 v0, v0, 0x57

    .line 6
    .line 7
    rem-int/lit16 v1, v0, 0x80

    .line 8
    .line 9
    sput v1, LVa/Tb;->t:I

    .line 10
    .line 11
    rem-int/lit8 v0, v0, 0x2

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const/16 v0, 0x45

    .line 16
    .line 17
    div-int/lit8 v0, v0, 0x0

    .line 18
    .line 19
    :cond_0
    return p0
.end method

.method public static synthetic N(LVa/Tb;)Z
    .locals 2

    .line 1
    sget v0, LVa/Tb;->t:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1d

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/Tb;->s:I

    .line 8
    .line 9
    iget-boolean p0, p0, LVa/Tb;->m:Z

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x45

    .line 12
    .line 13
    rem-int/lit16 v1, v0, 0x80

    .line 14
    .line 15
    sput v1, LVa/Tb;->t:I

    .line 16
    .line 17
    rem-int/lit8 v0, v0, 0x2

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    const/16 v0, 0x33

    .line 22
    .line 23
    div-int/lit8 v0, v0, 0x0

    .line 24
    .line 25
    :cond_0
    return p0
.end method

.method public static O(LVa/Tb;)LVa/db;
    .locals 3

    .line 1
    sget v0, LVa/Tb;->t:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x53

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/Tb;->s:I

    .line 8
    .line 9
    iget-object p0, p0, LVa/Tb;->k:LVa/q;

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x29

    .line 12
    .line 13
    rem-int/lit16 v1, v0, 0x80

    .line 14
    .line 15
    sput v1, LVa/Tb;->t:I

    .line 16
    .line 17
    rem-int/lit8 v0, v0, 0x2

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    add-int/lit8 v1, v1, 0x59

    .line 23
    .line 24
    rem-int/lit16 v0, v1, 0x80

    .line 25
    .line 26
    sput v0, LVa/Tb;->s:I

    .line 27
    .line 28
    rem-int/lit8 v1, v1, 0x2

    .line 29
    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_0
    throw v2

    .line 34
    :cond_1
    throw v2
.end method

.method public static synthetic P(LVa/Tb;Z)V
    .locals 1

    .line 1
    sget v0, LVa/Tb;->t:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x75

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/Tb;->s:I

    .line 8
    .line 9
    iput-boolean p1, p0, LVa/Tb;->p:Z

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0xf

    .line 12
    .line 13
    rem-int/lit16 p0, v0, 0x80

    .line 14
    .line 15
    sput p0, LVa/Tb;->t:I

    .line 16
    .line 17
    rem-int/lit8 v0, v0, 0x2

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    throw p0
.end method

.method public static Q(Ljava/lang/String;IIIZ)Ljava/lang/String;
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
    add-int/2addr v4, p3

    .line 22
    int-to-char v4, v4

    .line 23
    aput-char v4, v1, v3

    .line 24
    .line 25
    add-int/lit8 v4, v4, -0x56

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
    if-lez p2, :cond_1

    .line 38
    .line 39
    sput p2, LVa/Ab;->w:I

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

.method public static synthetic S(LVa/Tb;Landroid/app/Activity;)Z
    .locals 2

    .line 1
    sget v0, LVa/Tb;->t:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x61

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/Tb;->s:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, p1}, LVa/Tb;->D(Landroid/app/Activity;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    sget p1, LVa/Tb;->t:I

    .line 18
    .line 19
    add-int/lit8 p1, p1, 0x4b

    .line 20
    .line 21
    rem-int/lit16 p1, p1, 0x80

    .line 22
    .line 23
    sput p1, LVa/Tb;->s:I

    .line 24
    .line 25
    return p0

    .line 26
    :cond_0
    invoke-virtual {p0, p1}, LVa/Tb;->D(Landroid/app/Activity;)Z

    .line 27
    .line 28
    .line 29
    const/4 p0, 0x0

    .line 30
    throw p0
.end method


# virtual methods
.method public final A()LVa/Lb;
    .locals 2

    .line 1
    sget v0, LVa/Tb;->s:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x19

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/Tb;->t:I

    .line 8
    .line 9
    add-int/lit8 v0, v0, 0xb

    .line 10
    .line 11
    rem-int/lit16 v1, v0, 0x80

    .line 12
    .line 13
    sput v1, LVa/Tb;->s:I

    .line 14
    .line 15
    rem-int/lit8 v0, v0, 0x2

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    throw v0
.end method

.method public final synthetic B(Ljava/lang/Object;Ljava/util/ArrayList;)V
    .locals 2

    .line 1
    sget v0, LVa/Tb;->s:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x55

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/Tb;->t:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    check-cast p1, Landroid/app/Activity;

    .line 13
    .line 14
    invoke-virtual {p0, p1, p2}, LVa/Tb;->J(Landroid/app/Activity;Ljava/util/ArrayList;)V

    .line 15
    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    sget p1, LVa/Tb;->t:I

    .line 20
    .line 21
    add-int/lit8 p1, p1, 0x45

    .line 22
    .line 23
    rem-int/lit16 p2, p1, 0x80

    .line 24
    .line 25
    sput p2, LVa/Tb;->s:I

    .line 26
    .line 27
    rem-int/lit8 p1, p1, 0x2

    .line 28
    .line 29
    if-nez p1, :cond_0

    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    throw v1

    .line 33
    :cond_1
    throw v1
.end method

.method public final C()LVa/b;
    .locals 3

    .line 1
    new-instance v0, LVa/b;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, LVa/b;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget v1, LVa/Tb;->t:I

    .line 8
    .line 9
    add-int/lit8 v1, v1, 0x3d

    .line 10
    .line 11
    rem-int/lit16 v2, v1, 0x80

    .line 12
    .line 13
    sput v2, LVa/Tb;->s:I

    .line 14
    .line 15
    rem-int/lit8 v1, v1, 0x2

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    throw v0
.end method

.method public final D(Landroid/app/Activity;)Z
    .locals 5

    .line 1
    sget v0, LVa/Tb;->s:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x59

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/Tb;->t:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_3

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget-object v0, p0, LVa/Tb;->l:Ljava/lang/Class;

    .line 19
    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    iget-object v2, p0, LVa/Tb;->q:LVa/Sb;

    .line 23
    .line 24
    sget v3, LVa/Sb;->s:I

    .line 25
    .line 26
    add-int/lit8 v3, v3, 0x29

    .line 27
    .line 28
    rem-int/lit16 v4, v3, 0x80

    .line 29
    .line 30
    sput v4, LVa/Sb;->t:I

    .line 31
    .line 32
    rem-int/lit8 v3, v3, 0x2

    .line 33
    .line 34
    if-eqz v3, :cond_1

    .line 35
    .line 36
    iget-boolean v1, v2, LVa/Sb;->o:Z

    .line 37
    .line 38
    const/4 v2, 0x1

    .line 39
    if-eq v1, v2, :cond_0

    .line 40
    .line 41
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    sget v0, LVa/Tb;->s:I

    .line 46
    .line 47
    add-int/lit8 v0, v0, 0x67

    .line 48
    .line 49
    rem-int/lit16 v0, v0, 0x80

    .line 50
    .line 51
    sput v0, LVa/Tb;->t:I

    .line 52
    .line 53
    return p1

    .line 54
    :cond_0
    sget v1, LVa/Tb;->t:I

    .line 55
    .line 56
    add-int/lit8 v1, v1, 0x3

    .line 57
    .line 58
    rem-int/lit16 v1, v1, 0x80

    .line 59
    .line 60
    sput v1, LVa/Tb;->s:I

    .line 61
    .line 62
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    return p1

    .line 67
    :cond_1
    iget-boolean p1, v2, LVa/Sb;->o:Z

    .line 68
    .line 69
    throw v1

    .line 70
    :cond_2
    const/4 p1, 0x0

    .line 71
    return p1

    .line 72
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    throw v1
.end method

.method public final G(LVa/Ba;)V
    .locals 4

    .line 1
    sget v0, LVa/Tb;->t:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x25

    .line 4
    .line 5
    rem-int/lit16 v1, v1, 0x80

    .line 6
    .line 7
    sput v1, LVa/Tb;->s:I

    .line 8
    .line 9
    iget-object v1, p0, LVa/Tb;->q:LVa/Sb;

    .line 10
    .line 11
    sget v2, LVa/Sb;->t:I

    .line 12
    .line 13
    add-int/lit8 v2, v2, 0xb

    .line 14
    .line 15
    rem-int/lit16 v3, v2, 0x80

    .line 16
    .line 17
    sput v3, LVa/Sb;->s:I

    .line 18
    .line 19
    rem-int/lit8 v2, v2, 0x2

    .line 20
    .line 21
    if-nez v2, :cond_2

    .line 22
    .line 23
    iget-boolean v1, v1, LVa/Sb;->p:Z

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    add-int/lit8 v0, v0, 0x7

    .line 28
    .line 29
    rem-int/lit16 v0, v0, 0x80

    .line 30
    .line 31
    sput v0, LVa/Tb;->s:I

    .line 32
    .line 33
    invoke-static {p1}, LVa/Cb;->g(LVa/Ba;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    invoke-static {p1}, LVa/Cb;->c(LVa/Ba;)V

    .line 38
    .line 39
    .line 40
    sget p1, LVa/Tb;->s:I

    .line 41
    .line 42
    add-int/lit8 p1, p1, 0x6b

    .line 43
    .line 44
    rem-int/lit16 v0, p1, 0x80

    .line 45
    .line 46
    sput v0, LVa/Tb;->t:I

    .line 47
    .line 48
    rem-int/lit8 p1, p1, 0x2

    .line 49
    .line 50
    if-nez p1, :cond_1

    .line 51
    .line 52
    const/16 p1, 0x1d

    .line 53
    .line 54
    div-int/lit8 p1, p1, 0x0

    .line 55
    .line 56
    :cond_1
    return-void

    .line 57
    :cond_2
    iget-boolean p1, v1, LVa/Sb;->p:Z

    .line 58
    .line 59
    const/4 p1, 0x0

    .line 60
    throw p1
.end method

.method public final I(Landroid/app/Activity;)V
    .locals 2

    .line 1
    sget v0, LVa/Tb;->t:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x51

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/Tb;->s:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, p1}, LVa/Pb;->y(Landroid/view/KeyEvent$Callback;)V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    :goto_0
    iput-boolean p1, p0, LVa/Tb;->m:Z

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    invoke-virtual {p0, p1}, LVa/Pb;->y(Landroid/view/KeyEvent$Callback;)V

    .line 21
    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    goto :goto_0

    .line 25
    :goto_1
    sget p1, LVa/Tb;->t:I

    .line 26
    .line 27
    add-int/lit8 p1, p1, 0x25

    .line 28
    .line 29
    rem-int/lit16 v0, p1, 0x80

    .line 30
    .line 31
    sput v0, LVa/Tb;->s:I

    .line 32
    .line 33
    rem-int/lit8 p1, p1, 0x2

    .line 34
    .line 35
    if-nez p1, :cond_1

    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    const/4 p1, 0x0

    .line 39
    throw p1
.end method

.method public final J(Landroid/app/Activity;Ljava/util/ArrayList;)V
    .locals 11

    .line 1
    sget v0, LVa/Tb;->s:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x39

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/Tb;->t:I

    .line 8
    .line 9
    iget-object v0, p0, LVa/Tb;->q:LVa/Sb;

    .line 10
    .line 11
    sget v1, LVa/Sb;->t:I

    .line 12
    .line 13
    add-int/lit8 v1, v1, 0x39

    .line 14
    .line 15
    rem-int/lit16 v1, v1, 0x80

    .line 16
    .line 17
    sput v1, LVa/Sb;->s:I

    .line 18
    .line 19
    iget v4, v0, LVa/Sb;->n:I

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x73

    .line 22
    .line 23
    rem-int/lit16 v1, v1, 0x80

    .line 24
    .line 25
    sput v1, LVa/Sb;->t:I

    .line 26
    .line 27
    iget-object v5, v0, LVa/Sb;->m:Ljava/lang/String;

    .line 28
    .line 29
    add-int/lit8 v1, v1, 0x3

    .line 30
    .line 31
    rem-int/lit16 v2, v1, 0x80

    .line 32
    .line 33
    sput v2, LVa/Sb;->s:I

    .line 34
    .line 35
    rem-int/lit8 v1, v1, 0x2

    .line 36
    .line 37
    if-nez v1, :cond_0

    .line 38
    .line 39
    iget-object v9, v0, LVa/Ob;->k:Ljava/util/ArrayList;

    .line 40
    .line 41
    const/4 v6, 0x0

    .line 42
    const/4 v7, 0x0

    .line 43
    const-class v3, Landroid/webkit/WebView;

    .line 44
    .line 45
    const/4 v8, 0x0

    .line 46
    move-object v2, p1

    .line 47
    move-object v10, p2

    .line 48
    invoke-static/range {v2 .. v10}, LVa/Bb;->c(Landroid/app/Activity;Ljava/lang/Class;ILjava/lang/String;ZZLjava/util/List;Ljava/util/List;Ljava/util/ArrayList;)V

    .line 49
    .line 50
    .line 51
    sget p1, LVa/Tb;->t:I

    .line 52
    .line 53
    add-int/lit8 p1, p1, 0x5

    .line 54
    .line 55
    rem-int/lit16 p1, p1, 0x80

    .line 56
    .line 57
    sput p1, LVa/Tb;->s:I

    .line 58
    .line 59
    return-void

    .line 60
    :cond_0
    const/4 p1, 0x0

    .line 61
    throw p1
.end method

.method public final M(Lorg/json/JSONObject;)V
    .locals 13

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    new-instance v2, LVa/Sb;

    .line 6
    .line 7
    invoke-direct {v2}, LVa/Ob;-><init>()V

    .line 8
    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    iput-boolean v3, v2, LVa/Sb;->p:Z

    .line 12
    .line 13
    new-array v4, v1, [I

    .line 14
    .line 15
    fill-array-data v4, :array_0

    .line 16
    .line 17
    .line 18
    invoke-static {v3}, Landroid/graphics/Color;->blue(I)I

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    rsub-int/lit8 v5, v5, 0xe

    .line 23
    .line 24
    invoke-static {v5, v4}, LVa/Sb;->c(I[I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    sget v5, LVa/Sb;->s:I

    .line 37
    .line 38
    iput-object v4, v2, LVa/Sb;->l:Ljava/lang/String;

    .line 39
    .line 40
    add-int/lit8 v5, v5, 0x41

    .line 41
    .line 42
    rem-int/lit16 v4, v5, 0x80

    .line 43
    .line 44
    sput v4, LVa/Sb;->t:I

    .line 45
    .line 46
    rem-int/lit8 v5, v5, 0x2

    .line 47
    .line 48
    const/4 v4, 0x0

    .line 49
    if-eqz v5, :cond_7

    .line 50
    .line 51
    const/16 v5, 0xc

    .line 52
    .line 53
    new-array v5, v5, [I

    .line 54
    .line 55
    fill-array-data v5, :array_1

    .line 56
    .line 57
    .line 58
    invoke-static {v3}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    rsub-int/lit8 v6, v6, 0x15

    .line 63
    .line 64
    invoke-static {v6, v5}, LVa/Sb;->c(I[I)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    sget v6, LVa/Sb;->t:I

    .line 77
    .line 78
    add-int/lit8 v6, v6, 0x5d

    .line 79
    .line 80
    rem-int/lit16 v7, v6, 0x80

    .line 81
    .line 82
    sput v7, LVa/Sb;->s:I

    .line 83
    .line 84
    rem-int/lit8 v6, v6, 0x2

    .line 85
    .line 86
    if-nez v6, :cond_6

    .line 87
    .line 88
    iput-object v5, v2, LVa/Sb;->m:Ljava/lang/String;

    .line 89
    .line 90
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    shr-int/lit8 v5, v5, 0x18

    .line 95
    .line 96
    rsub-int/lit8 v5, v5, 0x2d

    .line 97
    .line 98
    int-to-byte v5, v5

    .line 99
    const-wide/16 v6, 0x0

    .line 100
    .line 101
    invoke-static {v6, v7}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    .line 102
    .line 103
    .line 104
    move-result v8

    .line 105
    add-int/lit8 v8, v8, 0x9

    .line 106
    .line 107
    const-string v9, "\u0001\u0002\u0003\u0004\u0005\u0002\u0001\u0000\u0091"

    .line 108
    .line 109
    invoke-static {v5, v8, v9}, LVa/Sb;->b(BILjava/lang/String;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    const/4 v8, -0x1

    .line 118
    invoke-virtual {p1, v5, v8}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    sget v8, LVa/Sb;->t:I

    .line 123
    .line 124
    const/4 v9, 0x1

    .line 125
    add-int/2addr v8, v9

    .line 126
    rem-int/lit16 v10, v8, 0x80

    .line 127
    .line 128
    sput v10, LVa/Sb;->s:I

    .line 129
    .line 130
    rem-int/lit8 v8, v8, 0x2

    .line 131
    .line 132
    if-eqz v8, :cond_0

    .line 133
    .line 134
    iput v5, v2, LVa/Sb;->n:I

    .line 135
    .line 136
    const/16 v5, 0x5f

    .line 137
    .line 138
    div-int/2addr v5, v3

    .line 139
    goto :goto_0

    .line 140
    :cond_0
    iput v5, v2, LVa/Sb;->n:I

    .line 141
    .line 142
    :goto_0
    new-array v5, v0, [I

    .line 143
    .line 144
    fill-array-data v5, :array_2

    .line 145
    .line 146
    .line 147
    invoke-static {v3}, Landroid/graphics/Color;->blue(I)I

    .line 148
    .line 149
    .line 150
    move-result v8

    .line 151
    add-int/lit8 v8, v8, 0x11

    .line 152
    .line 153
    invoke-static {v8, v5}, LVa/Sb;->c(I[I)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v5

    .line 157
    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v5

    .line 161
    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 162
    .line 163
    .line 164
    move-result v5

    .line 165
    sget v8, LVa/Sb;->t:I

    .line 166
    .line 167
    add-int/lit8 v8, v8, 0x13

    .line 168
    .line 169
    rem-int/lit16 v8, v8, 0x80

    .line 170
    .line 171
    sput v8, LVa/Sb;->s:I

    .line 172
    .line 173
    iput-boolean v5, v2, LVa/Sb;->o:Z

    .line 174
    .line 175
    add-int/lit8 v8, v8, 0x69

    .line 176
    .line 177
    rem-int/lit16 v8, v8, 0x80

    .line 178
    .line 179
    sput v8, LVa/Sb;->t:I

    .line 180
    .line 181
    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    .line 182
    .line 183
    .line 184
    move-result v5

    .line 185
    shr-int/lit8 v5, v5, 0x10

    .line 186
    .line 187
    add-int/lit8 v5, v5, 0x71

    .line 188
    .line 189
    int-to-byte v5, v5

    .line 190
    invoke-static {v3, v3}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 191
    .line 192
    .line 193
    move-result v8

    .line 194
    add-int/lit8 v8, v8, 0x13

    .line 195
    .line 196
    const-string v10, "\u0008\t\n\u000b\u0008\u0006\u0008\u0005\u0008\t\r\u000e\u000f\u0010\r\u0004\u0006\u0008\u00ea"

    .line 197
    .line 198
    invoke-static {v5, v8, v10}, LVa/Sb;->b(BILjava/lang/String;)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v5

    .line 202
    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v5

    .line 206
    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 207
    .line 208
    .line 209
    move-result v5

    .line 210
    sget v8, LVa/Sb;->t:I

    .line 211
    .line 212
    add-int/lit8 v8, v8, 0x9

    .line 213
    .line 214
    rem-int/lit16 v10, v8, 0x80

    .line 215
    .line 216
    sput v10, LVa/Sb;->s:I

    .line 217
    .line 218
    rem-int/lit8 v8, v8, 0x2

    .line 219
    .line 220
    if-eqz v8, :cond_1

    .line 221
    .line 222
    iput-boolean v5, v2, LVa/Sb;->p:Z

    .line 223
    .line 224
    const/16 v5, 0x34

    .line 225
    .line 226
    div-int/2addr v5, v3

    .line 227
    goto :goto_1

    .line 228
    :cond_1
    iput-boolean v5, v2, LVa/Sb;->p:Z

    .line 229
    .line 230
    :goto_1
    add-int/lit8 v10, v10, 0x21

    .line 231
    .line 232
    rem-int/lit16 v10, v10, 0x80

    .line 233
    .line 234
    sput v10, LVa/Sb;->t:I

    .line 235
    .line 236
    invoke-static {v3, v3, v3}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 237
    .line 238
    .line 239
    move-result v5

    .line 240
    add-int/lit8 v5, v5, 0x1a

    .line 241
    .line 242
    int-to-byte v5, v5

    .line 243
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 244
    .line 245
    .line 246
    move-result-wide v10

    .line 247
    cmp-long v8, v10, v6

    .line 248
    .line 249
    rsub-int/lit8 v8, v8, 0xb

    .line 250
    .line 251
    const-string v10, "\u0013\u000c\u0015\r\u0002\u0017\u0013\u0000\t\n"

    .line 252
    .line 253
    invoke-static {v5, v8, v10}, LVa/Sb;->b(BILjava/lang/String;)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v5

    .line 257
    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v5

    .line 261
    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v5

    .line 265
    iput-object v5, v2, LVa/Ob;->a:Ljava/lang/String;

    .line 266
    .line 267
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    .line 268
    .line 269
    .line 270
    move-result v5

    .line 271
    shr-int/lit8 v5, v5, 0x10

    .line 272
    .line 273
    rsub-int/lit8 v5, v5, 0x39

    .line 274
    .line 275
    int-to-byte v5, v5

    .line 276
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 277
    .line 278
    .line 279
    move-result-wide v11

    .line 280
    cmp-long v8, v11, v6

    .line 281
    .line 282
    rsub-int/lit8 v8, v8, 0xa

    .line 283
    .line 284
    const-string v11, "\u0016\u0017\u0011\u001d\u0013\u0004\u001c\u0000\u00b1"

    .line 285
    .line 286
    invoke-static {v5, v8, v11}, LVa/Sb;->b(BILjava/lang/String;)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v5

    .line 290
    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v5

    .line 294
    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v5

    .line 298
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 299
    .line 300
    .line 301
    move-result v5

    .line 302
    const-string v8, ""

    .line 303
    .line 304
    if-eqz v5, :cond_2

    .line 305
    .line 306
    goto :goto_2

    .line 307
    :cond_2
    invoke-static {v3}, Landroid/graphics/Color;->green(I)I

    .line 308
    .line 309
    .line 310
    move-result v4

    .line 311
    rsub-int/lit8 v4, v4, 0x39

    .line 312
    .line 313
    int-to-byte v4, v4

    .line 314
    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    .line 315
    .line 316
    .line 317
    move-result v5

    .line 318
    shr-int/lit8 v5, v5, 0x10

    .line 319
    .line 320
    rsub-int/lit8 v5, v5, 0x9

    .line 321
    .line 322
    invoke-static {v4, v5, v11}, LVa/Sb;->b(BILjava/lang/String;)Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v4

    .line 326
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v4

    .line 330
    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v4

    .line 334
    const v5, -0x440d587a

    .line 335
    .line 336
    .line 337
    const v11, 0x50c8d905

    .line 338
    .line 339
    .line 340
    filled-new-array {v5, v11}, [I

    .line 341
    .line 342
    .line 343
    move-result-object v5

    .line 344
    invoke-static {v8, v8, v3}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    .line 345
    .line 346
    .line 347
    move-result v11

    .line 348
    rsub-int/lit8 v11, v11, 0x1

    .line 349
    .line 350
    invoke-static {v11, v5}, LVa/Sb;->c(I[I)Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v5

    .line 354
    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v5

    .line 358
    invoke-virtual {v4, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v4

    .line 362
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 363
    .line 364
    .line 365
    move-result-object v4

    .line 366
    :goto_2
    iput-object v4, v2, LVa/Ob;->b:Ljava/util/List;

    .line 367
    .line 368
    new-array v4, v1, [I

    .line 369
    .line 370
    fill-array-data v4, :array_3

    .line 371
    .line 372
    .line 373
    invoke-static {v3, v3}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    .line 374
    .line 375
    .line 376
    move-result-wide v11

    .line 377
    cmp-long v5, v11, v6

    .line 378
    .line 379
    rsub-int/lit8 v5, v5, 0xd

    .line 380
    .line 381
    invoke-static {v5, v4}, LVa/Sb;->c(I[I)Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v4

    .line 385
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v4

    .line 389
    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 390
    .line 391
    .line 392
    move-result v4

    .line 393
    iput-boolean v4, v2, LVa/Ob;->c:Z

    .line 394
    .line 395
    new-array v4, v1, [I

    .line 396
    .line 397
    fill-array-data v4, :array_4

    .line 398
    .line 399
    .line 400
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    .line 401
    .line 402
    .line 403
    move-result v5

    .line 404
    shr-int/lit8 v5, v5, 0x10

    .line 405
    .line 406
    rsub-int/lit8 v5, v5, 0xd

    .line 407
    .line 408
    invoke-static {v5, v4}, LVa/Sb;->c(I[I)Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object v4

    .line 412
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object v4

    .line 416
    invoke-virtual {p1, v4, v9}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 417
    .line 418
    .line 419
    move-result v4

    .line 420
    iput-boolean v4, v2, LVa/Ob;->d:Z

    .line 421
    .line 422
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    .line 423
    .line 424
    .line 425
    move-result-wide v4

    .line 426
    const-wide/16 v6, -0x1

    .line 427
    .line 428
    cmp-long v4, v4, v6

    .line 429
    .line 430
    add-int/lit8 v4, v4, 0x19

    .line 431
    .line 432
    int-to-byte v4, v4

    .line 433
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    .line 434
    .line 435
    .line 436
    move-result v5

    .line 437
    shr-int/lit8 v5, v5, 0x10

    .line 438
    .line 439
    rsub-int/lit8 v5, v5, 0xa

    .line 440
    .line 441
    invoke-static {v4, v5, v10}, LVa/Sb;->b(BILjava/lang/String;)Ljava/lang/String;

    .line 442
    .line 443
    .line 444
    move-result-object v4

    .line 445
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 446
    .line 447
    .line 448
    move-result-object v4

    .line 449
    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object v4

    .line 453
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 454
    .line 455
    .line 456
    move-result v4

    .line 457
    if-eqz v4, :cond_4

    .line 458
    .line 459
    new-array v4, v1, [I

    .line 460
    .line 461
    fill-array-data v4, :array_5

    .line 462
    .line 463
    .line 464
    invoke-static {v3}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 465
    .line 466
    .line 467
    move-result v5

    .line 468
    rsub-int/lit8 v5, v5, 0x10

    .line 469
    .line 470
    invoke-static {v5, v4}, LVa/Sb;->c(I[I)Ljava/lang/String;

    .line 471
    .line 472
    .line 473
    move-result-object v4

    .line 474
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    move-result-object v4

    .line 478
    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 479
    .line 480
    .line 481
    move-result v4

    .line 482
    if-nez v4, :cond_4

    .line 483
    .line 484
    new-array v4, v0, [I

    .line 485
    .line 486
    fill-array-data v4, :array_6

    .line 487
    .line 488
    .line 489
    const/16 v5, 0x30

    .line 490
    .line 491
    invoke-static {v8, v5, v3, v3}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    .line 492
    .line 493
    .line 494
    move-result v5

    .line 495
    rsub-int/lit8 v5, v5, 0x11

    .line 496
    .line 497
    invoke-static {v5, v4}, LVa/Sb;->c(I[I)Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object v4

    .line 501
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 502
    .line 503
    .line 504
    move-result-object v4

    .line 505
    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 506
    .line 507
    .line 508
    move-result v4

    .line 509
    if-eqz v4, :cond_3

    .line 510
    .line 511
    goto :goto_3

    .line 512
    :cond_3
    move v9, v3

    .line 513
    :cond_4
    :goto_3
    iput-boolean v9, v2, LVa/Ob;->f:Z

    .line 514
    .line 515
    new-array v4, v1, [I

    .line 516
    .line 517
    fill-array-data v4, :array_7

    .line 518
    .line 519
    .line 520
    invoke-static {v3, v3, v3, v3}, Landroid/graphics/Color;->argb(IIII)I

    .line 521
    .line 522
    .line 523
    move-result v5

    .line 524
    add-int/lit8 v5, v5, 0x10

    .line 525
    .line 526
    invoke-static {v5, v4}, LVa/Sb;->c(I[I)Ljava/lang/String;

    .line 527
    .line 528
    .line 529
    move-result-object v4

    .line 530
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 531
    .line 532
    .line 533
    move-result-object v4

    .line 534
    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 535
    .line 536
    .line 537
    move-result v4

    .line 538
    iput-boolean v4, v2, LVa/Ob;->g:Z

    .line 539
    .line 540
    const/4 v4, 0x6

    .line 541
    new-array v4, v4, [I

    .line 542
    .line 543
    fill-array-data v4, :array_8

    .line 544
    .line 545
    .line 546
    const v5, 0x100000a

    .line 547
    .line 548
    .line 549
    invoke-static {v3, v3, v3}, Landroid/graphics/Color;->rgb(III)I

    .line 550
    .line 551
    .line 552
    move-result v9

    .line 553
    add-int/2addr v9, v5

    .line 554
    invoke-static {v9, v4}, LVa/Sb;->c(I[I)Ljava/lang/String;

    .line 555
    .line 556
    .line 557
    move-result-object v4

    .line 558
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 559
    .line 560
    .line 561
    move-result-object v4

    .line 562
    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 563
    .line 564
    .line 565
    move-result v4

    .line 566
    iput-boolean v4, v2, LVa/Ob;->h:Z

    .line 567
    .line 568
    new-array v0, v0, [I

    .line 569
    .line 570
    fill-array-data v0, :array_9

    .line 571
    .line 572
    .line 573
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    .line 574
    .line 575
    .line 576
    move-result v4

    .line 577
    shr-int/lit8 v4, v4, 0x10

    .line 578
    .line 579
    add-int/lit8 v4, v4, 0x13

    .line 580
    .line 581
    invoke-static {v4, v0}, LVa/Sb;->c(I[I)Ljava/lang/String;

    .line 582
    .line 583
    .line 584
    move-result-object v0

    .line 585
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 586
    .line 587
    .line 588
    move-result-object v0

    .line 589
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 590
    .line 591
    .line 592
    move-result v0

    .line 593
    iput-boolean v0, v2, LVa/Ob;->e:Z

    .line 594
    .line 595
    invoke-static {v8}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    .line 596
    .line 597
    .line 598
    move-result v0

    .line 599
    rsub-int/lit8 v0, v0, 0x49

    .line 600
    .line 601
    int-to-byte v0, v0

    .line 602
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    .line 603
    .line 604
    .line 605
    move-result v4

    .line 606
    shr-int/lit8 v1, v4, 0x8

    .line 607
    .line 608
    rsub-int/lit8 v1, v1, 0x11

    .line 609
    .line 610
    const-string v4, "\u001b\u0014\u0006\n\u0003\u001c\u0007\u0005\u0002\u0017\u000f\u0007\u0008\u0013\u0007\u0002\u00bd"

    .line 611
    .line 612
    invoke-static {v0, v1, v4}, LVa/Sb;->b(BILjava/lang/String;)Ljava/lang/String;

    .line 613
    .line 614
    .line 615
    move-result-object v0

    .line 616
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 617
    .line 618
    .line 619
    move-result-object v0

    .line 620
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 621
    .line 622
    .line 623
    move-result v0

    .line 624
    iput-boolean v0, v2, LVa/Ob;->i:Z

    .line 625
    .line 626
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 627
    .line 628
    .line 629
    move-result v0

    .line 630
    shr-int/lit8 v0, v0, 0x16

    .line 631
    .line 632
    rsub-int/lit8 v0, v0, 0x66

    .line 633
    .line 634
    int-to-byte v0, v0

    .line 635
    invoke-static {v3, v3}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    .line 636
    .line 637
    .line 638
    move-result v1

    .line 639
    add-int/lit8 v1, v1, 0x9

    .line 640
    .line 641
    const-string v4, "\u0002\u001c\u001c\u001d\u0015\u0012\u0010\u000e\u00da"

    .line 642
    .line 643
    invoke-static {v0, v1, v4}, LVa/Sb;->b(BILjava/lang/String;)Ljava/lang/String;

    .line 644
    .line 645
    .line 646
    move-result-object v0

    .line 647
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 648
    .line 649
    .line 650
    move-result-object v0

    .line 651
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 652
    .line 653
    .line 654
    move-result v0

    .line 655
    iput-boolean v0, v2, LVa/Ob;->j:Z

    .line 656
    .line 657
    invoke-static {v8, v3}, Landroid/text/TextUtils;->getOffsetBefore(Ljava/lang/CharSequence;I)I

    .line 658
    .line 659
    .line 660
    move-result v0

    .line 661
    add-int/lit8 v0, v0, 0x6c

    .line 662
    .line 663
    int-to-byte v0, v0

    .line 664
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    .line 665
    .line 666
    .line 667
    move-result-wide v3

    .line 668
    cmp-long v1, v3, v6

    .line 669
    .line 670
    rsub-int/lit8 v1, v1, 0xe

    .line 671
    .line 672
    const-string v3, "\u001c\u0005\u0002\u0001\u0013\u0019\u0011\u0003 \u0012\u0010\u0015\u00d1"

    .line 673
    .line 674
    invoke-static {v0, v1, v3}, LVa/Sb;->b(BILjava/lang/String;)Ljava/lang/String;

    .line 675
    .line 676
    .line 677
    move-result-object v0

    .line 678
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 679
    .line 680
    .line 681
    move-result-object v0

    .line 682
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 683
    .line 684
    .line 685
    move-result-object p1

    .line 686
    invoke-static {p1}, LVa/Ab;->i(Lorg/json/JSONArray;)Ljava/util/ArrayList;

    .line 687
    .line 688
    .line 689
    move-result-object p1

    .line 690
    if-eqz p1, :cond_5

    .line 691
    .line 692
    iput-object p1, v2, LVa/Ob;->k:Ljava/util/ArrayList;

    .line 693
    .line 694
    :cond_5
    iput-object v2, p0, LVa/Pb;->j:LVa/Ob;

    .line 695
    .line 696
    iput-object v2, p0, LVa/Tb;->q:LVa/Sb;

    .line 697
    .line 698
    new-instance p1, LVa/v;

    .line 699
    .line 700
    const/16 v0, 0x1b

    .line 701
    .line 702
    invoke-direct {p1, p0, v0}, LVa/v;-><init>(Ljava/lang/Object;I)V

    .line 703
    .line 704
    .line 705
    invoke-static {p1}, LVa/Cb;->j(LVa/Ba;)V

    .line 706
    .line 707
    .line 708
    sget p1, LVa/Tb;->t:I

    .line 709
    .line 710
    add-int/lit8 p1, p1, 0x53

    .line 711
    .line 712
    rem-int/lit16 p1, p1, 0x80

    .line 713
    .line 714
    sput p1, LVa/Tb;->s:I

    .line 715
    .line 716
    return-void

    .line 717
    :cond_6
    iput-object v5, v2, LVa/Sb;->m:Ljava/lang/String;

    .line 718
    .line 719
    throw v4

    .line 720
    :cond_7
    throw v4

    .line 721
    :array_0
    .array-data 4
        0x69b9de5
        0x6fa88620
        0xda2d446
        -0x11865008
        -0x29112ee4
        -0x31893542
        -0x16423464
        0x7f84dbd1
    .end array-data

    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    :array_1
    .array-data 4
        -0x6874b627
        -0x3e224246
        0x2794fe63
        0x41164ecb
        0x7642d5b7
        0x11bf2e
        0x265f433d
        0x5171c5c7
        -0x2df2f609
        0x208b3fff
        -0x3e416b36
        0x58e5e660
    .end array-data

    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    :array_2
    .array-data 4
        0x72a54a63
        0x48e437bc    # 467389.88f
        0x45178288
        0x45c4c78c
        0x5b90d657
        -0x40dfbccd
        -0x56e0bbd0
        -0x3d0442fc
        -0x232eab01
        0x39aeb210
    .end array-data

    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    :array_3
    .array-data 4
        -0x65408c65
        0x1075d167
        0x545ffbe7
        0x14be0eb4
        0xf7e96cf
        0x39507e00
        -0xdcb9b3a
        0x7a775e04
    .end array-data

    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    :array_4
    .array-data 4
        0x52371b6c
        0x5e501e18
        -0x3fbfd335
        0x612d8eee    # 2.0009912E20f
        0x6d1fa368
        -0x62e67a0c
        -0x7edb9641
        0x38cc05f0
    .end array-data

    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    :array_5
    .array-data 4
        -0x65408c65
        0x1075d167
        0x545ffbe7
        0x14be0eb4
        0x3ffe2219
        -0xcb535e3
        0x30d86508
        0x38559f7d
    .end array-data

    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    :array_6
    .array-data 4
        -0x65408c65
        0x1075d167
        0x549e2ae4
        0x79f69949
        -0x51904ffe
        -0x7282a8b
        -0x7ae8a324
        -0x58c7b76c
        -0x142aa60e
        -0x6c53474e
    .end array-data

    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    :array_7
    .array-data 4
        -0x65408c65
        0x1075d167
        0x545ffbe7
        0x14be0eb4
        0x3ffe2219
        -0xcb535e3
        0x30d86508
        0x38559f7d
    .end array-data

    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    :array_8
    .array-data 4
        -0x362c0bb6
        0xbdd8c7d
        -0x6da1d8dd
        0x3283d6a5
        -0x64f7cc75
        -0x78665168
    .end array-data

    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    :array_9
    .array-data 4
        0x5d3c70ba
        0x6b42fb9a
        0x6e0fc28f
        -0x3cbb3138
        -0x75632d96
        -0x61131d5
        0x545ffbe7
        0x14be0eb4
        -0x4a325efc
        -0x477bd3fd
    .end array-data
.end method

.method public final R(LVa/q;)V
    .locals 1

    .line 1
    sget v0, LVa/Tb;->t:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x5d

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/Tb;->s:I

    .line 8
    .line 9
    iput-object p1, p0, LVa/Tb;->k:LVa/q;

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x69

    .line 12
    .line 13
    rem-int/lit16 p1, v0, 0x80

    .line 14
    .line 15
    sput p1, LVa/Tb;->t:I

    .line 16
    .line 17
    rem-int/lit8 v0, v0, 0x2

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    const/16 p1, 0x21

    .line 22
    .line 23
    div-int/lit8 p1, p1, 0x0

    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public final b(Landroid/app/Activity;)V
    .locals 2

    .line 1
    new-instance v0, LVa/Qb;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1}, LVa/Qb;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iput-object p0, v0, LVa/Qb;->e:LVa/Tb;

    .line 8
    .line 9
    iput-object p1, v0, LVa/Qb;->d:Landroid/app/Activity;

    .line 10
    .line 11
    invoke-static {v0}, LVa/Cb;->e(LVa/Ba;)V

    .line 12
    .line 13
    .line 14
    sget p1, LVa/Tb;->s:I

    .line 15
    .line 16
    add-int/lit8 p1, p1, 0x29

    .line 17
    .line 18
    rem-int/lit16 p1, p1, 0x80

    .line 19
    .line 20
    sput p1, LVa/Tb;->t:I

    .line 21
    .line 22
    return-void
.end method

.method public final d(Landroid/app/Activity;)V
    .locals 2

    .line 1
    new-instance v0, LVa/Qb;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1}, LVa/Qb;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iput-object p0, v0, LVa/Qb;->e:LVa/Tb;

    .line 8
    .line 9
    iput-object p1, v0, LVa/Qb;->d:Landroid/app/Activity;

    .line 10
    .line 11
    invoke-static {v0}, LVa/Cb;->e(LVa/Ba;)V

    .line 12
    .line 13
    .line 14
    sget p1, LVa/Tb;->t:I

    .line 15
    .line 16
    add-int/lit8 p1, p1, 0x3d

    .line 17
    .line 18
    rem-int/lit16 p1, p1, 0x80

    .line 19
    .line 20
    sput p1, LVa/Tb;->s:I

    .line 21
    .line 22
    return-void
.end method

.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    new-instance v0, LVa/Rb;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LVa/Rb;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iput-object p0, v0, LVa/Rb;->f:LVa/Tb;

    .line 8
    .line 9
    iput-object p1, v0, LVa/Rb;->d:Landroid/app/Activity;

    .line 10
    .line 11
    iput-object p2, v0, LVa/Rb;->e:Landroid/os/Bundle;

    .line 12
    .line 13
    invoke-virtual {p0, v0}, LVa/Tb;->G(LVa/Ba;)V

    .line 14
    .line 15
    .line 16
    sget p1, LVa/Tb;->s:I

    .line 17
    .line 18
    add-int/lit8 p1, p1, 0x1b

    .line 19
    .line 20
    rem-int/lit16 p1, p1, 0x80

    .line 21
    .line 22
    sput p1, LVa/Tb;->t:I

    .line 23
    .line 24
    return-void
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 2

    .line 1
    new-instance v0, LVa/Qb;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p0, p1, v1}, LVa/Qb;-><init>(LVa/Tb;Landroid/app/Activity;I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0}, LVa/Tb;->G(LVa/Ba;)V

    .line 8
    .line 9
    .line 10
    sget p1, LVa/Tb;->s:I

    .line 11
    .line 12
    add-int/lit8 p1, p1, 0x33

    .line 13
    .line 14
    rem-int/lit16 v0, p1, 0x80

    .line 15
    .line 16
    sput v0, LVa/Tb;->t:I

    .line 17
    .line 18
    rem-int/lit8 p1, p1, 0x2

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    const/4 p1, 0x0

    .line 24
    throw p1
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 2

    .line 1
    new-instance v0, LVa/Qb;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LVa/Qb;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iput-object p0, v0, LVa/Qb;->e:LVa/Tb;

    .line 8
    .line 9
    iput-object p1, v0, LVa/Qb;->d:Landroid/app/Activity;

    .line 10
    .line 11
    invoke-static {v0}, LVa/Cb;->e(LVa/Ba;)V

    .line 12
    .line 13
    .line 14
    sget p1, LVa/Tb;->s:I

    .line 15
    .line 16
    add-int/lit8 p1, p1, 0x63

    .line 17
    .line 18
    rem-int/lit16 v0, p1, 0x80

    .line 19
    .line 20
    sput v0, LVa/Tb;->t:I

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

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 2

    .line 1
    new-instance v0, LVa/Qb;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    invoke-direct {v0, p0, p1, v1}, LVa/Qb;-><init>(LVa/Tb;Landroid/app/Activity;I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0}, LVa/Tb;->G(LVa/Ba;)V

    .line 8
    .line 9
    .line 10
    sget p1, LVa/Tb;->s:I

    .line 11
    .line 12
    add-int/lit8 p1, p1, 0x43

    .line 13
    .line 14
    rem-int/lit16 p1, p1, 0x80

    .line 15
    .line 16
    sput p1, LVa/Tb;->t:I

    .line 17
    .line 18
    return-void
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    new-instance v0, LVa/Rb;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, LVa/Rb;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iput-object p0, v0, LVa/Rb;->f:LVa/Tb;

    .line 8
    .line 9
    iput-object p1, v0, LVa/Rb;->d:Landroid/app/Activity;

    .line 10
    .line 11
    iput-object p2, v0, LVa/Rb;->e:Landroid/os/Bundle;

    .line 12
    .line 13
    invoke-virtual {p0, v0}, LVa/Tb;->G(LVa/Ba;)V

    .line 14
    .line 15
    .line 16
    sget p1, LVa/Tb;->s:I

    .line 17
    .line 18
    add-int/lit8 p1, p1, 0x47

    .line 19
    .line 20
    rem-int/lit16 p1, p1, 0x80

    .line 21
    .line 22
    sput p1, LVa/Tb;->t:I

    .line 23
    .line 24
    return-void
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 2

    .line 1
    new-instance v0, LVa/Qb;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-direct {v0, v1}, LVa/Qb;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iput-object p0, v0, LVa/Qb;->e:LVa/Tb;

    .line 8
    .line 9
    iput-object p1, v0, LVa/Qb;->d:Landroid/app/Activity;

    .line 10
    .line 11
    invoke-static {v0}, LVa/Cb;->e(LVa/Ba;)V

    .line 12
    .line 13
    .line 14
    sget p1, LVa/Tb;->s:I

    .line 15
    .line 16
    add-int/lit8 p1, p1, 0xf

    .line 17
    .line 18
    rem-int/lit16 v0, p1, 0x80

    .line 19
    .line 20
    sput v0, LVa/Tb;->t:I

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

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 2

    .line 1
    new-instance v0, LVa/Qb;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-direct {v0, p0, p1, v1}, LVa/Qb;-><init>(LVa/Tb;Landroid/app/Activity;I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0}, LVa/Tb;->G(LVa/Ba;)V

    .line 8
    .line 9
    .line 10
    sget p1, LVa/Tb;->s:I

    .line 11
    .line 12
    add-int/lit8 p1, p1, 0x13

    .line 13
    .line 14
    rem-int/lit16 p1, p1, 0x80

    .line 15
    .line 16
    sput p1, LVa/Tb;->t:I

    .line 17
    .line 18
    return-void
.end method

.method public final t(Ljava/lang/Object;)Landroid/view/View;
    .locals 3

    .line 1
    sget v0, LVa/Tb;->s:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x6f

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/Tb;->t:I

    .line 8
    .line 9
    check-cast p1, Landroid/app/Activity;

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x3

    .line 12
    .line 13
    rem-int/lit16 v0, v0, 0x80

    .line 14
    .line 15
    sput v0, LVa/Tb;->s:I

    .line 16
    .line 17
    const v0, 0x1020002

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    sget v0, LVa/Tb;->s:I

    .line 25
    .line 26
    add-int/lit8 v1, v0, 0x1d

    .line 27
    .line 28
    rem-int/lit16 v2, v1, 0x80

    .line 29
    .line 30
    sput v2, LVa/Tb;->t:I

    .line 31
    .line 32
    rem-int/lit8 v1, v1, 0x2

    .line 33
    .line 34
    if-nez v1, :cond_0

    .line 35
    .line 36
    const/16 v1, 0x29

    .line 37
    .line 38
    div-int/lit8 v1, v1, 0x0

    .line 39
    .line 40
    :cond_0
    add-int/lit8 v0, v0, 0x41

    .line 41
    .line 42
    rem-int/lit16 v1, v0, 0x80

    .line 43
    .line 44
    sput v1, LVa/Tb;->t:I

    .line 45
    .line 46
    rem-int/lit8 v0, v0, 0x2

    .line 47
    .line 48
    if-nez v0, :cond_1

    .line 49
    .line 50
    const/16 v0, 0x45

    .line 51
    .line 52
    div-int/lit8 v0, v0, 0x0

    .line 53
    .line 54
    :cond_1
    return-object p1
.end method
