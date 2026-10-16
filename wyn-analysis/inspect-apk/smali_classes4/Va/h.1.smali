.class public final LVa/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final p:[B

.field public static q:I = 0x0

.field public static r:I = 0x1


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Z

.field public e:Ljava/lang/String;

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:Z

.field public j:Z

.field public k:Z

.field public l:Ljava/util/ArrayList;

.field public m:Ljava/util/ArrayList;

.field public n:Ljava/util/ArrayList;

.field public o:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x7a

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LVa/h;->p:[B

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 1
        -0x2t
        0x6t
        -0xat
        0x8t
        0x2t
        0x11t
        -0x27t
        0x12t
        -0x4t
        0x13t
        -0xet
        0x3t
        0x11t
        -0x2t
        -0x5t
        -0x4t
        0x25t
        -0x26t
        0x1bt
        -0x1ft
        0x9t
        0x6t
        0x9t
        -0x4t
        -0x3t
        0x29t
        -0x34t
        0x12t
        -0x4t
        0x13t
        -0xct
        -0x3t
        0xet
        -0xet
        -0xet
        -0x2t
        0x6t
        0x9t
        -0x4t
        -0x3t
        0x29t
        -0x22t
        -0x8t
        -0x2t
        -0x3t
        0xat
        0x25t
        -0x1ft
        -0x3t
        0xet
        -0xet
        -0xet
        -0x2t
        0x4t
        0x7t
        -0x9t
        0xft
        -0x10t
        0x12t
        -0x15t
        0x15t
        0x17t
        -0x1bt
        -0xet
        -0x2t
        0x29t
        -0x17t
        -0x11t
        -0x2t
        -0x4t
        0x33t
        -0x20t
        -0xet
        -0x2t
        0x3t
        -0x4t
        -0xdt
        0xat
        0x14t
        -0x1at
        0x5t
        0x8t
        0x14t
        -0x21t
        0x1ft
        -0x24t
        -0x4t
        0x12t
        -0x4t
        0x13t
        -0x1dt
        0x0t
        0xet
        0x2t
        -0xct
        -0x3t
        0x2t
        -0xdt
        0x3t
        0x1t
        0x7t
        0x1et
        -0x26t
        0x1bt
        -0x1ft
        0xet
        -0x4t
        -0xbt
        0xbt
        -0xdt
        0xdt
        -0xbt
        0x11t
        0x2t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
    .end array-data
.end method

.method public static synthetic a(LVa/h;)Ljava/util/List;
    .locals 2

    .line 1
    sget v0, LVa/h;->r:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/h;->q:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    iget-object p0, p0, LVa/h;->m:Ljava/util/ArrayList;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/16 v0, 0x4e

    .line 16
    .line 17
    div-int/lit8 v0, v0, 0x0

    .line 18
    .line 19
    :cond_0
    add-int/lit8 v1, v1, 0x75

    .line 20
    .line 21
    rem-int/lit16 v0, v1, 0x80

    .line 22
    .line 23
    sput v0, LVa/h;->r:I

    .line 24
    .line 25
    rem-int/lit8 v1, v1, 0x2

    .line 26
    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_1
    const/4 p0, 0x0

    .line 31
    throw p0
.end method

.method public static synthetic b(LVa/h;)Ljava/util/List;
    .locals 3

    .line 1
    sget v0, LVa/h;->r:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x5

    .line 4
    .line 5
    rem-int/lit16 v2, v1, 0x80

    .line 6
    .line 7
    sput v2, LVa/h;->q:I

    .line 8
    .line 9
    rem-int/lit8 v1, v1, 0x2

    .line 10
    .line 11
    iget-object p0, p0, LVa/h;->n:Ljava/util/ArrayList;

    .line 12
    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    add-int/lit8 v0, v0, 0x6b

    .line 16
    .line 17
    rem-int/lit16 v1, v0, 0x80

    .line 18
    .line 19
    sput v1, LVa/h;->q:I

    .line 20
    .line 21
    rem-int/lit8 v0, v0, 0x2

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    const/16 v0, 0x3b

    .line 26
    .line 27
    div-int/lit8 v0, v0, 0x0

    .line 28
    .line 29
    :cond_0
    return-object p0

    .line 30
    :cond_1
    const/4 p0, 0x0

    .line 31
    throw p0
.end method

.method public static c(IIBSI)Ljava/lang/String;
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
    add-int/lit8 p4, p4, 0x5d

    .line 10
    .line 11
    const/4 v2, -0x1

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x1

    .line 14
    if-ne p4, v2, :cond_0

    .line 15
    .line 16
    move v3, v4

    .line 17
    :cond_0
    if-eqz v3, :cond_1

    .line 18
    .line 19
    sget-object p4, LVa/h;->p:[B

    .line 20
    .line 21
    const v2, 0x26f46a8e

    .line 22
    .line 23
    .line 24
    add-int/2addr v2, p0

    .line 25
    aget-byte p4, p4, v2

    .line 26
    .line 27
    add-int/lit8 p4, p4, 0x5d

    .line 28
    .line 29
    int-to-byte p4, p4

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
    if-lez p4, :cond_2

    .line 34
    .line 35
    add-int/2addr p0, p4

    .line 36
    const v2, -0x26f46a8c

    .line 37
    .line 38
    .line 39
    sub-int/2addr p0, v2

    .line 40
    add-int/2addr p0, v3

    .line 41
    sput p0, LVa/pb;->F:I

    .line 42
    .line 43
    sput-byte p2, LVa/pb;->G:B

    .line 44
    .line 45
    const p0, 0x2887e131

    .line 46
    .line 47
    .line 48
    add-int/2addr p1, p0

    .line 49
    int-to-char p0, p1

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
    if-ge p0, p4, :cond_2

    .line 64
    .line 65
    sget-object p0, LVa/h;->p:[B

    .line 66
    .line 67
    sget p1, LVa/pb;->F:I

    .line 68
    .line 69
    add-int/lit8 p2, p1, -0x1

    .line 70
    .line 71
    sput p2, LVa/pb;->F:I

    .line 72
    .line 73
    aget-byte p0, p0, p1

    .line 74
    .line 75
    sget-char p1, LVa/pb;->I:C

    .line 76
    .line 77
    add-int/2addr p0, p3

    .line 78
    int-to-byte p0, p0

    .line 79
    sget-byte p2, LVa/pb;->G:B

    .line 80
    .line 81
    xor-int/2addr p0, p2

    .line 82
    add-int/2addr p1, p0

    .line 83
    int-to-char p0, p1

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

.method public static synthetic d(LVa/h;)Z
    .locals 2

    .line 1
    sget v0, LVa/h;->r:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x5d

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/h;->q:I

    .line 8
    .line 9
    iget-boolean p0, p0, LVa/h;->h:Z

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x67

    .line 12
    .line 13
    rem-int/lit16 v1, v0, 0x80

    .line 14
    .line 15
    sput v1, LVa/h;->r:I

    .line 16
    .line 17
    rem-int/lit8 v0, v0, 0x2

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    return p0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    throw p0
.end method

.method public static e(ILjava/lang/String;)Ljava/lang/String;
    .locals 6

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
    sget-object v0, LVa/a;->u:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    sput p0, LVa/a;->t:I

    .line 11
    .line 12
    array-length p0, p1

    .line 13
    new-array p0, p0, [C

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
    array-length v2, p1

    .line 21
    if-ge v1, v2, :cond_0

    .line 22
    .line 23
    aget-char v2, p1, v1

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
    const-wide v4, 0x437caeaab01c1eL

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
    aput-char v2, p0, v1

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
    new-instance p1, Ljava/lang/String;

    .line 48
    .line 49
    invoke-direct {p1, p0}, Ljava/lang/String;-><init>([C)V

    .line 50
    .line 51
    .line 52
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    return-object p1

    .line 54
    :goto_1
    monitor-exit v0

    .line 55
    throw p0
.end method

.method public static synthetic f(LVa/h;)Ljava/util/List;
    .locals 3

    .line 1
    sget v0, LVa/h;->q:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x3b

    .line 4
    .line 5
    rem-int/lit16 v2, v1, 0x80

    .line 6
    .line 7
    sput v2, LVa/h;->r:I

    .line 8
    .line 9
    rem-int/lit8 v1, v1, 0x2

    .line 10
    .line 11
    iget-object p0, p0, LVa/h;->l:Ljava/util/ArrayList;

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    const/16 v1, 0x19

    .line 16
    .line 17
    div-int/lit8 v1, v1, 0x0

    .line 18
    .line 19
    :cond_0
    add-int/lit8 v0, v0, 0x3

    .line 20
    .line 21
    rem-int/lit16 v0, v0, 0x80

    .line 22
    .line 23
    sput v0, LVa/h;->r:I

    .line 24
    .line 25
    return-object p0
.end method
