.class public final LVa/A;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:[B

.field public static e:I = 0x0

.field public static f:I = 0x1


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const/16 v0, 0x88

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LVa/A;->d:[B

    .line 9
    .line 10
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    const-wide/16 v2, -0x1

    .line 15
    .line 16
    cmp-long v0, v0, v2

    .line 17
    .line 18
    add-int/lit8 v0, v0, -0x1

    .line 19
    .line 20
    int-to-short v0, v0

    .line 21
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    shr-int/lit8 v1, v1, 0x16

    .line 26
    .line 27
    const v2, -0x6146d71f

    .line 28
    .line 29
    .line 30
    sub-int/2addr v2, v1

    .line 31
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    shr-int/lit8 v1, v1, 0x10

    .line 36
    .line 37
    add-int/lit8 v1, v1, -0x27

    .line 38
    .line 39
    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    shr-int/lit8 v3, v3, 0x8

    .line 44
    .line 45
    const v4, 0x11f86486

    .line 46
    .line 47
    .line 48
    sub-int/2addr v4, v3

    .line 49
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    shr-int/lit8 v3, v3, 0x16

    .line 54
    .line 55
    rsub-int/lit8 v3, v3, 0x4

    .line 56
    .line 57
    int-to-byte v3, v3

    .line 58
    invoke-static {v2, v1, v3, v0, v4}, LVa/A;->a(IIBSI)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    sget v0, LVa/A;->e:I

    .line 66
    .line 67
    add-int/lit8 v0, v0, 0x1d

    .line 68
    .line 69
    rem-int/lit16 v0, v0, 0x80

    .line 70
    .line 71
    sput v0, LVa/A;->f:I

    .line 72
    .line 73
    return-void

    .line 74
    nop

    .line 75
    :array_0
    .array-data 1
        0x4ct
        -0x42t
        -0x79t
        0x78t
        -0x7dt
        0x8t
        -0x49t
        -0x47t
        0x49t
        0x4bt
        -0xbt
        0x72t
        0x4dt
        -0x4ct
        0x47t
        -0x5ft
        0x4at
        -0x49t
        0x4dt
        0x4at
        -0x73t
        0xft
        -0x41t
        -0x4ft
        -0x7at
        0x76t
        -0x78t
        -0x4et
        0x47t
        0x75t
        -0x4ft
        0x4et
        -0x4et
        -0x42t
        0xct
        -0x2t
        -0x39t
        0x38t
        -0x3dt
        0x48t
        -0x9t
        -0x7t
        0x9t
        0xbt
        -0x4bt
        0x32t
        0xdt
        -0xct
        0x7t
        -0x1ft
        0xat
        -0x9t
        0xdt
        0xat
        -0x33t
        0x4ft
        -0x1t
        -0xft
        -0x3at
        0x4ct
        -0x4et
        -0xet
        0x7t
        0x35t
        -0xft
        0xet
        -0xet
        -0x2t
        -0x67t
        0x6bt
        0x52t
        -0x53t
        0x56t
        -0x23t
        0x62t
        0x6ct
        -0x64t
        -0x62t
        0x20t
        -0x59t
        -0x68t
        0x61t
        -0x6et
        0x74t
        -0x61t
        0x62t
        -0x68t
        -0x61t
        0x58t
        -0x26t
        0x6at
        0x64t
        0x53t
        -0x55t
        0x55t
        0x67t
        -0x6et
        -0x60t
        0x64t
        -0x65t
        0x67t
        0x6bt
        -0x4bt
        0x7dt
        -0xdt
        0x40t
        0x76t
        -0x78t
        0x43t
        0x49t
        -0x4ct
        -0x4at
        0x49t
        0x49t
        -0x5ct
        -0x4bt
        0xft
        -0x27t
        0x9t
        -0x1ft
        0x7t
        0x16t
        -0x3et
        0xct
        0x28t
        -0x25t
        0x7t
        0x18t
        -0x1bt
        0x37t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
    .end array-data
.end method

.method public static a(IIBSI)Ljava/lang/String;
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
    add-int/lit8 p1, p1, 0x36

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    const/4 v3, -0x1

    .line 13
    if-ne p1, v3, :cond_0

    .line 14
    .line 15
    move v3, v2

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v3, 0x0

    .line 18
    :goto_0
    if-eqz v3, :cond_1

    .line 19
    .line 20
    sget-object p1, LVa/A;->d:[B

    .line 21
    .line 22
    const v4, -0x11f86412

    .line 23
    .line 24
    .line 25
    add-int/2addr v4, p4

    .line 26
    aget-byte p1, p1, v4

    .line 27
    .line 28
    add-int/lit8 p1, p1, 0x36

    .line 29
    .line 30
    int-to-byte p1, p1

    .line 31
    goto :goto_1

    .line 32
    :catchall_0
    move-exception p0

    .line 33
    goto :goto_3

    .line 34
    :cond_1
    :goto_1
    if-lez p1, :cond_2

    .line 35
    .line 36
    add-int/2addr p4, p1

    .line 37
    const v4, 0x11f86414

    .line 38
    .line 39
    .line 40
    sub-int/2addr p4, v4

    .line 41
    add-int/2addr p4, v3

    .line 42
    sput p4, LVa/pb;->F:I

    .line 43
    .line 44
    sput-byte p2, LVa/pb;->G:B

    .line 45
    .line 46
    const p2, 0x6146d750

    .line 47
    .line 48
    .line 49
    add-int/2addr p0, p2

    .line 50
    int-to-char p0, p0

    .line 51
    sput-char p0, LVa/pb;->H:C

    .line 52
    .line 53
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    sget-char p0, LVa/pb;->H:C

    .line 57
    .line 58
    sput-char p0, LVa/pb;->I:C

    .line 59
    .line 60
    sput v2, LVa/pb;->E:I

    .line 61
    .line 62
    :goto_2
    sget p0, LVa/pb;->E:I

    .line 63
    .line 64
    if-ge p0, p1, :cond_2

    .line 65
    .line 66
    sget-object p0, LVa/A;->d:[B

    .line 67
    .line 68
    sget p2, LVa/pb;->F:I

    .line 69
    .line 70
    add-int/lit8 p4, p2, -0x1

    .line 71
    .line 72
    sput p4, LVa/pb;->F:I

    .line 73
    .line 74
    aget-byte p0, p0, p2

    .line 75
    .line 76
    sget-char p2, LVa/pb;->I:C

    .line 77
    .line 78
    add-int/2addr p0, p3

    .line 79
    int-to-byte p0, p0

    .line 80
    sget-byte p4, LVa/pb;->G:B

    .line 81
    .line 82
    xor-int/2addr p0, p4

    .line 83
    add-int/2addr p2, p0

    .line 84
    int-to-char p0, p2

    .line 85
    sput-char p0, LVa/pb;->H:C

    .line 86
    .line 87
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    sget-char p0, LVa/pb;->H:C

    .line 91
    .line 92
    sput-char p0, LVa/pb;->I:C

    .line 93
    .line 94
    sget p0, LVa/pb;->E:I

    .line 95
    .line 96
    add-int/2addr p0, v2

    .line 97
    sput p0, LVa/pb;->E:I

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 105
    return-object p0

    .line 106
    :goto_3
    monitor-exit v0

    .line 107
    throw p0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, ""

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    sget v2, LVa/A;->e:I

    .line 11
    .line 12
    add-int/lit8 v2, v2, 0x45

    .line 13
    .line 14
    rem-int/lit16 v2, v2, 0x80

    .line 15
    .line 16
    sput v2, LVa/A;->f:I

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object p0, v1

    .line 20
    :goto_0
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-static {v1}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    int-to-short p0, p0

    .line 28
    const-wide/16 v2, 0x0

    .line 29
    .line 30
    invoke-static {v2, v3}, Landroid/widget/ExpandableListView;->getPackedPositionType(J)I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    const v3, -0x6146d721

    .line 35
    .line 36
    .line 37
    sub-int/2addr v3, v2

    .line 38
    const/4 v2, 0x0

    .line 39
    invoke-static {v2}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    add-int/lit8 v4, v4, -0x34

    .line 44
    .line 45
    const v5, 0x11f86486

    .line 46
    .line 47
    .line 48
    invoke-static {v2}, Landroid/graphics/Color;->green(I)I

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    add-int/2addr v6, v5

    .line 53
    invoke-static {v2}, Landroid/graphics/Color;->blue(I)I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    rsub-int/lit8 v2, v2, -0x60

    .line 58
    .line 59
    int-to-byte v2, v2

    .line 60
    invoke-static {v3, v4, v2, p0, v6}, LVa/A;->a(IIBSI)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-virtual {p0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    if-eqz p1, :cond_1

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_1
    move-object p1, v1

    .line 75
    :goto_1
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    sget p1, LVa/A;->e:I

    .line 83
    .line 84
    add-int/lit8 p1, p1, 0x41

    .line 85
    .line 86
    rem-int/lit16 p1, p1, 0x80

    .line 87
    .line 88
    sput p1, LVa/A;->f:I

    .line 89
    .line 90
    return-object p0
.end method
