.class public final LVa/t9;
.super LVa/r9;
.source "SourceFile"


# static fields
.field public static final c:[C

.field public static d:I = 0x0

.field public static e:I = 0x1


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x14

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LVa/t9;->c:[C

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 2
        0x68s
        0x74s
        0x72s
        0x33s
        0x6ds
        0x7es
        0x75s
        0x77s
        0x7ds
        0x66s
        0x73s
        0x69s
        0x6es
        0x78s
        0x70s
        0x71s
        0x6as
        0x79s
        0x55s
        0x59s
    .end array-data
.end method

.method public static f(ILjava/lang/String;)Ljava/lang/String;
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
    sget-object v1, LVa/t9;->c:[C

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
    add-int/lit8 v4, v4, -0x5

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
.method public final a()Ljava/lang/String;
    .locals 3

    .line 1
    sget v0, LVa/t9;->e:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x6f

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/t9;->d:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const-string v1, "\u0089\u0083\u0088\u0087\u0086\u0085"

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    div-int/lit8 v0, v0, 0x6c

    .line 20
    .line 21
    const/16 v2, 0x54

    .line 22
    .line 23
    ushr-int v0, v2, v0

    .line 24
    .line 25
    :goto_0
    invoke-static {v0, v1}, LVa/t9;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    return-object v0

    .line 34
    :cond_0
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    shr-int/lit8 v0, v0, 0x10

    .line 39
    .line 40
    rsub-int/lit8 v0, v0, 0x7f

    .line 41
    .line 42
    goto :goto_0
.end method

.method public final c()LVa/Z0;
    .locals 3

    .line 1
    new-instance v0, LVa/w2;

    .line 2
    .line 3
    invoke-virtual {p0}, LVa/t9;->a()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, LVa/Z0;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    sget v1, LVa/t9;->e:I

    .line 11
    .line 12
    add-int/lit8 v1, v1, 0x17

    .line 13
    .line 14
    rem-int/lit16 v2, v1, 0x80

    .line 15
    .line 16
    sput v2, LVa/t9;->d:I

    .line 17
    .line 18
    rem-int/lit8 v1, v1, 0x2

    .line 19
    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    throw v0
.end method

.method public final d()Ljava/lang/String;
    .locals 2

    .line 1
    sget v0, LVa/t9;->d:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x61

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/t9;->e:I

    .line 8
    .line 9
    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    cmpl-float v0, v0, v1

    .line 15
    .line 16
    rsub-int/lit8 v0, v0, 0x7f

    .line 17
    .line 18
    const-string v1, "\u0091\u0087\u0086\u0094\u0092\u008b\u0091\u0083\u0091\u0081\u008a\u0090\u0093\u0084\u0092\u008b\u0091\u0083\u0091\u0081\u008a\u0090\u0087\u0084\u008f\u008c\u008e\u0084\u008c\u008d\u0082\u0088\u008c\u008b\u008a\u0084\u0089\u0083\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081"

    .line 19
    .line 20
    invoke-static {v0, v1}, LVa/t9;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sget v1, LVa/t9;->e:I

    .line 29
    .line 30
    add-int/lit8 v1, v1, 0x35

    .line 31
    .line 32
    rem-int/lit16 v1, v1, 0x80

    .line 33
    .line 34
    sput v1, LVa/t9;->d:I

    .line 35
    .line 36
    return-object v0
.end method

.method public final e()Ljava/lang/Class;
    .locals 2

    .line 1
    sget v0, LVa/t9;->d:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x4b

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/t9;->e:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const-class v0, Lcom/hyprmx/android/sdk/placement/PlacementType;

    .line 14
    .line 15
    const/16 v1, 0x36

    .line 16
    .line 17
    div-int/lit8 v1, v1, 0x0

    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_0
    const-class v0, Lcom/hyprmx/android/sdk/placement/PlacementType;

    .line 21
    .line 22
    return-object v0
.end method
