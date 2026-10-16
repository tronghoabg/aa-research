.class public final LVa/vb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# static fields
.field public static final c:[B

.field public static d:I = 0x0

.field public static e:I = 0x1


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:LE5/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x7c

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LVa/vb;->c:[B

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 1
        -0x25t
        -0x29t
        -0x37t
        -0xdt
        -0x50t
        -0x2bt
        -0x23t
        -0x2ft
        -0xat
        0x18t
        0x51t
        0x63t
        0x50t
        0x6bt
        0x54t
        -0x57t
        0x3t
        0x61t
        0x67t
        0x59t
        0x67t
        0x48t
        -0x80t
        0x49t
        0x5ft
        -0x63t
        0x17t
        0x56t
        0x58t
        0x55t
        0x64t
        0x61t
        -0x5bt
        0xat
        0x5ft
        0x59t
        0x5ct
        -0x77t
        0x0t
        -0x1et
        0x27t
        0x11t
        0x23t
        0xbt
        0x1bt
        0x24t
        0x17t
        0x66t
        -0x2bt
        0x14t
        0x16t
        0x13t
        0x22t
        0x1ft
        0x63t
        -0x38t
        0x1dt
        0x17t
        0x1at
        0x47t
        -0x5dt
        -0x66t
        -0x56t
        0x2et
        0x4dt
        0x5ft
        0x4ct
        0x67t
        0x50t
        -0x5bt
        -0x4t
        -0x1bt
        0x1t
        0x31t
        -0x5et
        -0x11t
        -0xat
        -0x1bt
        0x3t
        -0x12t
        -0x1ct
        -0x17t
        -0x8t
        -0xbt
        0x39t
        -0x57t
        -0x17t
        -0xbt
        -0x1bt
        -0x10t
        -0x1t
        -0x12t
        0x37t
        -0x62t
        -0xdt
        -0x13t
        -0x10t
        0x1dt
        -0x16t
        -0x1ct
        -0x1ft
        -0x28t
        -0x1et
        -0x13t
        0x0t
        -0x3ft
        -0x1ft
        -0x2dt
        -0xbt
        -0x2ft
        -0x1bt
        -0x12t
        -0x20t
        0x3t
        -0x4et
        -0xft
        -0x20t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
    .end array-data
.end method

.method public constructor <init>(Ljava/lang/Object;LE5/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LVa/vb;->a:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, LVa/vb;->b:LE5/b;

    .line 7
    .line 8
    return-void
.end method

.method public static a(Ljava/lang/reflect/Method;)Z
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const v1, 0x60b55ba6

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-eq v0, v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-static {v2, v2}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    const-wide/16 v3, 0x0

    .line 21
    .line 22
    cmp-long v0, v0, v3

    .line 23
    .line 24
    add-int/lit8 v0, v0, 0x1f

    .line 25
    .line 26
    int-to-short v0, v0

    .line 27
    const v1, -0x25f5a1ee

    .line 28
    .line 29
    .line 30
    const-string v5, ""

    .line 31
    .line 32
    invoke-static {v5, v2}, Landroid/text/TextUtils;->getOffsetBefore(Ljava/lang/CharSequence;I)I

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    sub-int/2addr v1, v6

    .line 37
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 38
    .line 39
    .line 40
    move-result-wide v6

    .line 41
    cmp-long v3, v6, v3

    .line 42
    .line 43
    rsub-int/lit8 v3, v3, -0x5e

    .line 44
    .line 45
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    .line 46
    .line 47
    .line 48
    move-result-wide v6

    .line 49
    const-wide/16 v8, -0x1

    .line 50
    .line 51
    cmp-long v4, v6, v8

    .line 52
    .line 53
    const v6, 0x652c10a5

    .line 54
    .line 55
    .line 56
    sub-int/2addr v6, v4

    .line 57
    invoke-static {v5}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    int-to-byte v4, v4

    .line 62
    invoke-static {v1, v3, v4, v0, v6}, LVa/vb;->c(IIBSI)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    if-eqz p0, :cond_1

    .line 75
    .line 76
    sget p0, LVa/vb;->e:I

    .line 77
    .line 78
    add-int/lit8 p0, p0, 0x79

    .line 79
    .line 80
    rem-int/lit16 p0, p0, 0x80

    .line 81
    .line 82
    sput p0, LVa/vb;->d:I

    .line 83
    .line 84
    const/4 p0, 0x1

    .line 85
    return p0

    .line 86
    :cond_1
    :goto_0
    sget p0, LVa/vb;->e:I

    .line 87
    .line 88
    add-int/lit8 p0, p0, 0x1b

    .line 89
    .line 90
    rem-int/lit16 v0, p0, 0x80

    .line 91
    .line 92
    sput v0, LVa/vb;->d:I

    .line 93
    .line 94
    rem-int/lit8 p0, p0, 0x2

    .line 95
    .line 96
    if-nez p0, :cond_2

    .line 97
    .line 98
    return v2

    .line 99
    :cond_2
    const/4 p0, 0x0

    .line 100
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
    add-int/lit8 p1, p1, 0x73

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
    sget-object p1, LVa/vb;->c:[B

    .line 20
    .line 21
    const v2, -0x652c1042

    .line 22
    .line 23
    .line 24
    add-int/2addr v2, p4

    .line 25
    aget-byte p1, p1, v2

    .line 26
    .line 27
    add-int/lit8 p1, p1, 0x73

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
    const v2, 0x652c1044

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
    const p2, 0x25f5a255

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
    sget-object p0, LVa/vb;->c:[B

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
.method public final b(Ljava/lang/reflect/Method;)Ljava/lang/Object;
    .locals 8

    .line 1
    sget v0, LVa/vb;->d:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x3d

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/vb;->e:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_4

    .line 13
    .line 14
    if-eqz p1, :cond_2

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const v2, 0x60b55ba6

    .line 25
    .line 26
    .line 27
    if-eq v0, v2, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const-string v0, ""

    .line 31
    .line 32
    const/16 v2, 0x30

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    invoke-static {v0, v2, v3}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    rsub-int/lit8 v4, v4, 0x1d

    .line 40
    .line 41
    int-to-short v4, v4

    .line 42
    const v5, -0x25f5a1ee

    .line 43
    .line 44
    .line 45
    invoke-static {v0, v0}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    sub-int/2addr v5, v6

    .line 50
    invoke-static {v0, v2, v3}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    rsub-int/lit8 v6, v6, -0x60

    .line 55
    .line 56
    const v7, 0x652c10a5

    .line 57
    .line 58
    .line 59
    invoke-static {v0, v2, v3, v3}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CII)I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    add-int/2addr v0, v7

    .line 64
    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    shr-int/lit8 v2, v2, 0x10

    .line 69
    .line 70
    int-to-byte v2, v2

    .line 71
    invoke-static {v5, v6, v2, v4, v0}, LVa/vb;->c(IIBSI)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-eqz p1, :cond_2

    .line 84
    .line 85
    sget p1, LVa/vb;->e:I

    .line 86
    .line 87
    add-int/lit8 p1, p1, 0x7

    .line 88
    .line 89
    rem-int/lit16 p1, p1, 0x80

    .line 90
    .line 91
    sput p1, LVa/vb;->d:I

    .line 92
    .line 93
    add-int/lit8 p1, p1, 0x3f

    .line 94
    .line 95
    rem-int/lit16 v0, p1, 0x80

    .line 96
    .line 97
    sput v0, LVa/vb;->e:I

    .line 98
    .line 99
    rem-int/lit8 p1, p1, 0x2

    .line 100
    .line 101
    if-eqz p1, :cond_1

    .line 102
    .line 103
    iget-object p1, p0, LVa/vb;->a:Ljava/lang/Object;

    .line 104
    .line 105
    return-object p1

    .line 106
    :cond_1
    throw v1

    .line 107
    :cond_2
    :goto_0
    sget p1, LVa/vb;->d:I

    .line 108
    .line 109
    add-int/lit8 p1, p1, 0x1b

    .line 110
    .line 111
    rem-int/lit16 v0, p1, 0x80

    .line 112
    .line 113
    sput v0, LVa/vb;->e:I

    .line 114
    .line 115
    rem-int/lit8 p1, p1, 0x2

    .line 116
    .line 117
    if-eqz p1, :cond_3

    .line 118
    .line 119
    return-object v1

    .line 120
    :cond_3
    throw v1

    .line 121
    :cond_4
    throw v1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    move-object/from16 v3, p3

    .line 6
    .line 7
    iget-object v4, v1, LVa/vb;->a:Ljava/lang/Object;

    .line 8
    .line 9
    sget v0, LVa/vb;->d:I

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x7

    .line 12
    .line 13
    rem-int/lit16 v5, v0, 0x80

    .line 14
    .line 15
    sput v5, LVa/vb;->e:I

    .line 16
    .line 17
    rem-int/lit8 v0, v0, 0x2

    .line 18
    .line 19
    const/4 v5, 0x1

    .line 20
    const/4 v6, 0x0

    .line 21
    const v7, -0x25f5a205

    .line 22
    .line 23
    .line 24
    const v8, -0x25f5a211

    .line 25
    .line 26
    .line 27
    const v9, 0x652c1042

    .line 28
    .line 29
    .line 30
    const/16 v10, 0x30

    .line 31
    .line 32
    const-wide/16 v11, 0x0

    .line 33
    .line 34
    const/4 v13, 0x0

    .line 35
    const-string v14, ""

    .line 36
    .line 37
    const/4 v15, 0x0

    .line 38
    if-nez v0, :cond_0

    .line 39
    .line 40
    invoke-static {v2}, LVa/vb;->a(Ljava/lang/reflect/Method;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    const/16 v16, 0x39

    .line 45
    .line 46
    div-int/lit8 v16, v16, 0x0

    .line 47
    .line 48
    if-eq v0, v5, :cond_1

    .line 49
    .line 50
    goto/16 :goto_0

    .line 51
    .line 52
    :cond_0
    invoke-static {v2}, LVa/vb;->a(Ljava/lang/reflect/Method;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    :cond_1
    :try_start_0
    invoke-virtual {v1, v2}, LVa/vb;->b(Ljava/lang/reflect/Method;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    return-object v0

    .line 63
    :catchall_0
    move-exception v0

    .line 64
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    shr-int/lit8 v3, v3, 0x10

    .line 69
    .line 70
    add-int/lit8 v3, v3, 0x2c

    .line 71
    .line 72
    int-to-short v3, v3

    .line 73
    invoke-static {v13, v13}, Landroid/graphics/PointF;->length(FF)F

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    cmpl-float v4, v4, v13

    .line 78
    .line 79
    sub-int/2addr v7, v4

    .line 80
    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    cmpl-float v4, v4, v13

    .line 85
    .line 86
    rsub-int/lit8 v4, v4, -0x69

    .line 87
    .line 88
    invoke-static {v15}, Landroid/util/TypedValue;->complexToFloat(I)F

    .line 89
    .line 90
    .line 91
    move-result v15

    .line 92
    cmpl-float v13, v15, v13

    .line 93
    .line 94
    sub-int/2addr v9, v13

    .line 95
    invoke-static {v10}, Landroid/text/AndroidCharacter;->getMirror(C)C

    .line 96
    .line 97
    .line 98
    move-result v10

    .line 99
    add-int/lit8 v10, v10, -0x30

    .line 100
    .line 101
    int-to-byte v10, v10

    .line 102
    invoke-static {v7, v4, v10, v3, v9}, LVa/vb;->c(IIBSI)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    new-instance v4, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 113
    .line 114
    .line 115
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 116
    .line 117
    .line 118
    move-result v7

    .line 119
    shr-int/lit8 v7, v7, 0x16

    .line 120
    .line 121
    add-int/lit8 v7, v7, -0x5c

    .line 122
    .line 123
    int-to-short v7, v7

    .line 124
    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    .line 125
    .line 126
    .line 127
    move-result-wide v9

    .line 128
    cmp-long v9, v9, v11

    .line 129
    .line 130
    add-int/2addr v9, v8

    .line 131
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 132
    .line 133
    .line 134
    move-result-wide v15

    .line 135
    cmp-long v8, v15, v11

    .line 136
    .line 137
    rsub-int/lit8 v8, v8, -0x54

    .line 138
    .line 139
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    .line 140
    .line 141
    .line 142
    move-result v10

    .line 143
    shr-int/lit8 v10, v10, 0x10

    .line 144
    .line 145
    const v11, 0x652c104b

    .line 146
    .line 147
    .line 148
    sub-int/2addr v11, v10

    .line 149
    invoke-static {v14}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    .line 150
    .line 151
    .line 152
    move-result v10

    .line 153
    int-to-byte v10, v10

    .line 154
    invoke-static {v9, v8, v10, v7, v11}, LVa/vb;->c(IIBSI)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v7

    .line 158
    invoke-virtual {v7}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v7

    .line 162
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    invoke-static {v3, v2, v0, v5}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 177
    .line 178
    .line 179
    return-object v6

    .line 180
    :cond_2
    :goto_0
    :try_start_1
    iget-object v0, v1, LVa/vb;->b:LE5/b;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 181
    .line 182
    move-object/from16 v16, v6

    .line 183
    .line 184
    move-object/from16 v6, p1

    .line 185
    .line 186
    :try_start_2
    invoke-virtual {v0, v6, v2, v3}, LE5/b;->s(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 187
    .line 188
    .line 189
    move/from16 v18, v8

    .line 190
    .line 191
    move/from16 v19, v9

    .line 192
    .line 193
    move-wide/from16 v20, v11

    .line 194
    .line 195
    goto/16 :goto_3

    .line 196
    .line 197
    :catchall_1
    move-exception v0

    .line 198
    goto :goto_1

    .line 199
    :catchall_2
    move-exception v0

    .line 200
    move-object/from16 v16, v6

    .line 201
    .line 202
    :goto_1
    invoke-static {v14}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    .line 203
    .line 204
    .line 205
    move-result v6

    .line 206
    rsub-int/lit8 v6, v6, 0x2c

    .line 207
    .line 208
    int-to-short v6, v6

    .line 209
    invoke-static {}, Landroid/view/ViewConfiguration;->getMinimumFlingVelocity()I

    .line 210
    .line 211
    .line 212
    move-result v17

    .line 213
    shr-int/lit8 v17, v17, 0x10

    .line 214
    .line 215
    sub-int v7, v7, v17

    .line 216
    .line 217
    invoke-static {v14, v10}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    .line 218
    .line 219
    .line 220
    move-result v17

    .line 221
    move/from16 v18, v8

    .line 222
    .line 223
    rsub-int/lit8 v8, v17, -0x6a

    .line 224
    .line 225
    invoke-static {v15, v15}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 226
    .line 227
    .line 228
    move-result v17

    .line 229
    move/from16 v19, v9

    .line 230
    .line 231
    sub-int v9, v19, v17

    .line 232
    .line 233
    invoke-static {v14, v10, v15}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    .line 234
    .line 235
    .line 236
    move-result v17

    .line 237
    move-wide/from16 v20, v11

    .line 238
    .line 239
    rsub-int/lit8 v11, v17, -0x1

    .line 240
    .line 241
    int-to-byte v11, v11

    .line 242
    invoke-static {v7, v8, v11, v6, v9}, LVa/vb;->c(IIBSI)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v6

    .line 246
    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v6

    .line 250
    new-instance v7, Ljava/lang/StringBuilder;

    .line 251
    .line 252
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 253
    .line 254
    .line 255
    invoke-static {v14, v14}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    .line 256
    .line 257
    .line 258
    move-result v8

    .line 259
    add-int/lit8 v8, v8, -0x1a

    .line 260
    .line 261
    int-to-short v8, v8

    .line 262
    invoke-static/range {v20 .. v21}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    .line 263
    .line 264
    .line 265
    move-result v9

    .line 266
    sub-int v9, v18, v9

    .line 267
    .line 268
    invoke-static {v15, v15}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    .line 269
    .line 270
    .line 271
    move-result v11

    .line 272
    rsub-int/lit8 v11, v11, -0x5c

    .line 273
    .line 274
    const v12, 0x652c1067

    .line 275
    .line 276
    .line 277
    invoke-static {v14, v10, v15}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    .line 278
    .line 279
    .line 280
    move-result v17

    .line 281
    sub-int v12, v12, v17

    .line 282
    .line 283
    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    .line 284
    .line 285
    .line 286
    move-result v17

    .line 287
    cmpl-float v17, v17, v13

    .line 288
    .line 289
    rsub-int/lit8 v10, v17, 0x1

    .line 290
    .line 291
    int-to-byte v10, v10

    .line 292
    invoke-static {v9, v11, v10, v8, v12}, LVa/vb;->c(IIBSI)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v8

    .line 296
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v8

    .line 300
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 301
    .line 302
    .line 303
    if-eqz v4, :cond_3

    .line 304
    .line 305
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v8

    .line 309
    goto :goto_2

    .line 310
    :cond_3
    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    .line 311
    .line 312
    .line 313
    move-result v8

    .line 314
    shr-int/lit8 v8, v8, 0x8

    .line 315
    .line 316
    add-int/lit8 v8, v8, 0x5d

    .line 317
    .line 318
    int-to-short v8, v8

    .line 319
    const v9, -0x25f5a1e7

    .line 320
    .line 321
    .line 322
    invoke-static {v15}, Landroid/graphics/Color;->red(I)I

    .line 323
    .line 324
    .line 325
    move-result v10

    .line 326
    add-int/2addr v10, v9

    .line 327
    invoke-static {v15}, Landroid/graphics/Color;->red(I)I

    .line 328
    .line 329
    .line 330
    move-result v9

    .line 331
    add-int/lit8 v9, v9, -0x6f

    .line 332
    .line 333
    const v11, 0x652c107e

    .line 334
    .line 335
    .line 336
    invoke-static {v15, v15}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 337
    .line 338
    .line 339
    move-result v12

    .line 340
    add-int/2addr v12, v11

    .line 341
    invoke-static {v14, v14}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    .line 342
    .line 343
    .line 344
    move-result v11

    .line 345
    int-to-byte v11, v11

    .line 346
    invoke-static {v10, v9, v11, v8, v12}, LVa/vb;->c(IIBSI)Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v8

    .line 350
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v8

    .line 354
    :goto_2
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 355
    .line 356
    .line 357
    const v8, -0x1000058

    .line 358
    .line 359
    .line 360
    invoke-static {v15, v15, v15}, Landroid/graphics/Color;->rgb(III)I

    .line 361
    .line 362
    .line 363
    move-result v9

    .line 364
    sub-int/2addr v8, v9

    .line 365
    int-to-short v8, v8

    .line 366
    const v9, -0x25f5a235

    .line 367
    .line 368
    .line 369
    invoke-static/range {v20 .. v21}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    .line 370
    .line 371
    .line 372
    move-result v10

    .line 373
    add-int/2addr v10, v9

    .line 374
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 375
    .line 376
    .line 377
    move-result-wide v11

    .line 378
    cmp-long v9, v11, v20

    .line 379
    .line 380
    add-int/lit8 v9, v9, -0x6c

    .line 381
    .line 382
    invoke-static {v15, v13, v13}, Landroid/util/TypedValue;->complexToFraction(IFF)F

    .line 383
    .line 384
    .line 385
    move-result v11

    .line 386
    cmpl-float v11, v11, v13

    .line 387
    .line 388
    const v12, 0x652c1081

    .line 389
    .line 390
    .line 391
    add-int/2addr v11, v12

    .line 392
    invoke-static {v14}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    .line 393
    .line 394
    .line 395
    move-result v12

    .line 396
    int-to-byte v12, v12

    .line 397
    invoke-static {v10, v9, v12, v8, v11}, LVa/vb;->c(IIBSI)Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object v8

    .line 401
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object v8

    .line 405
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 406
    .line 407
    .line 408
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object v8

    .line 412
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 413
    .line 414
    .line 415
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object v7

    .line 419
    invoke-static {v6, v7, v0, v5}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 420
    .line 421
    .line 422
    :goto_3
    if-eqz v4, :cond_4

    .line 423
    .line 424
    invoke-virtual {v2, v4, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    return-object v0

    .line 429
    :cond_4
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 430
    .line 431
    .line 432
    move-result-object v0

    .line 433
    const-class v4, Ljava/lang/Object;

    .line 434
    .line 435
    invoke-virtual {v4, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 436
    .line 437
    .line 438
    move-result v0

    .line 439
    if-eqz v0, :cond_9

    .line 440
    .line 441
    sget v0, LVa/vb;->d:I

    .line 442
    .line 443
    add-int/lit8 v0, v0, 0x1d

    .line 444
    .line 445
    rem-int/lit16 v4, v0, 0x80

    .line 446
    .line 447
    sput v4, LVa/vb;->e:I

    .line 448
    .line 449
    rem-int/lit8 v0, v0, 0x2

    .line 450
    .line 451
    if-nez v0, :cond_5

    .line 452
    .line 453
    const/16 v0, 0x47

    .line 454
    .line 455
    div-int/2addr v0, v15

    .line 456
    if-eqz v3, :cond_8

    .line 457
    .line 458
    goto :goto_4

    .line 459
    :cond_5
    if-eqz v3, :cond_8

    .line 460
    .line 461
    :goto_4
    :try_start_3
    new-instance v0, Ljava/util/ArrayList;

    .line 462
    .line 463
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 464
    .line 465
    .line 466
    array-length v4, v3

    .line 467
    move v6, v15

    .line 468
    :goto_5
    if-ge v6, v4, :cond_7

    .line 469
    .line 470
    aget-object v7, v3, v6

    .line 471
    .line 472
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 473
    .line 474
    .line 475
    move-result-object v8

    .line 476
    invoke-static {v8}, Ljava/lang/reflect/Proxy;->isProxyClass(Ljava/lang/Class;)Z

    .line 477
    .line 478
    .line 479
    move-result v8

    .line 480
    if-eqz v8, :cond_6

    .line 481
    .line 482
    invoke-static {v7}, Ljava/lang/reflect/Proxy;->getInvocationHandler(Ljava/lang/Object;)Ljava/lang/reflect/InvocationHandler;

    .line 483
    .line 484
    .line 485
    move-result-object v7

    .line 486
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 487
    .line 488
    .line 489
    sget v7, LVa/vb;->d:I

    .line 490
    .line 491
    add-int/lit8 v7, v7, 0x6f

    .line 492
    .line 493
    rem-int/lit16 v7, v7, 0x80

    .line 494
    .line 495
    sput v7, LVa/vb;->e:I

    .line 496
    .line 497
    goto :goto_6

    .line 498
    :catchall_3
    move-exception v0

    .line 499
    goto :goto_7

    .line 500
    :cond_6
    :try_start_4
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 501
    .line 502
    .line 503
    sget v7, LVa/vb;->e:I

    .line 504
    .line 505
    add-int/lit8 v7, v7, 0x47

    .line 506
    .line 507
    rem-int/lit16 v7, v7, 0x80

    .line 508
    .line 509
    sput v7, LVa/vb;->d:I

    .line 510
    .line 511
    :goto_6
    add-int/lit8 v6, v6, 0x1

    .line 512
    .line 513
    goto :goto_5

    .line 514
    :cond_7
    :try_start_5
    invoke-virtual {v0}, Ljava/util/ArrayList;->toArray()[Ljava/lang/Object;

    .line 515
    .line 516
    .line 517
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 518
    goto :goto_8

    .line 519
    :goto_7
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 520
    .line 521
    .line 522
    move-result v4

    .line 523
    shr-int/lit8 v4, v4, 0x16

    .line 524
    .line 525
    rsub-int/lit8 v4, v4, 0x2c

    .line 526
    .line 527
    int-to-short v4, v4

    .line 528
    const v6, -0x25f5a204

    .line 529
    .line 530
    .line 531
    const/16 v7, 0x30

    .line 532
    .line 533
    invoke-static {v14, v7, v15}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    .line 534
    .line 535
    .line 536
    move-result v8

    .line 537
    add-int/2addr v8, v6

    .line 538
    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    .line 539
    .line 540
    .line 541
    move-result v6

    .line 542
    shr-int/lit8 v6, v6, 0x10

    .line 543
    .line 544
    add-int/lit8 v6, v6, -0x69

    .line 545
    .line 546
    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    .line 547
    .line 548
    .line 549
    move-result v7

    .line 550
    shr-int/lit8 v7, v7, 0x8

    .line 551
    .line 552
    sub-int v9, v19, v7

    .line 553
    .line 554
    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    .line 555
    .line 556
    .line 557
    move-result-wide v10

    .line 558
    cmp-long v7, v10, v20

    .line 559
    .line 560
    add-int/lit8 v7, v7, -0x1

    .line 561
    .line 562
    int-to-byte v7, v7

    .line 563
    invoke-static {v8, v6, v7, v4, v9}, LVa/vb;->c(IIBSI)Ljava/lang/String;

    .line 564
    .line 565
    .line 566
    move-result-object v4

    .line 567
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 568
    .line 569
    .line 570
    move-result-object v4

    .line 571
    invoke-static {v15}, Landroid/graphics/Color;->alpha(I)I

    .line 572
    .line 573
    .line 574
    move-result v6

    .line 575
    add-int/lit8 v6, v6, 0x10

    .line 576
    .line 577
    int-to-short v6, v6

    .line 578
    const/16 v7, 0x30

    .line 579
    .line 580
    invoke-static {v14, v7, v15}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    .line 581
    .line 582
    .line 583
    move-result v7

    .line 584
    sub-int v8, v18, v7

    .line 585
    .line 586
    invoke-static {v14}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    .line 587
    .line 588
    .line 589
    move-result v7

    .line 590
    rsub-int/lit8 v7, v7, -0x57

    .line 591
    .line 592
    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    .line 593
    .line 594
    .line 595
    move-result v9

    .line 596
    shr-int/lit8 v9, v9, 0x10

    .line 597
    .line 598
    const v10, 0x652c1088

    .line 599
    .line 600
    .line 601
    add-int/2addr v9, v10

    .line 602
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    .line 603
    .line 604
    .line 605
    move-result-wide v10

    .line 606
    const-wide/16 v12, -0x1

    .line 607
    .line 608
    cmp-long v10, v10, v12

    .line 609
    .line 610
    rsub-int/lit8 v10, v10, 0x1

    .line 611
    .line 612
    int-to-byte v10, v10

    .line 613
    invoke-static {v8, v7, v10, v6, v9}, LVa/vb;->c(IIBSI)Ljava/lang/String;

    .line 614
    .line 615
    .line 616
    move-result-object v6

    .line 617
    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 618
    .line 619
    .line 620
    move-result-object v6

    .line 621
    invoke-static {v4, v6, v0, v5}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 622
    .line 623
    .line 624
    :cond_8
    move-object v0, v3

    .line 625
    :goto_8
    invoke-virtual {v2, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 626
    .line 627
    .line 628
    move-result-object v0

    .line 629
    return-object v0

    .line 630
    :cond_9
    return-object v16
.end method
