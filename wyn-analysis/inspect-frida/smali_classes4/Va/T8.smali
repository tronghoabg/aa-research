.class public final LVa/T8;
.super LVa/y8;
.source "SourceFile"


# static fields
.field public static final d:LVa/T8;

.field public static e:I = 0x0

.field public static f:I = 0x1


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LVa/T8;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LVa/T8;->d:LVa/T8;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    add-int/lit8 v0, v0, 0x35

    .line 10
    .line 11
    rem-int/lit16 v0, v0, 0x80

    .line 12
    .line 13
    sput v0, LVa/T8;->e:I

    .line 14
    .line 15
    return-void
.end method

.method public static e(I)Ljava/lang/String;
    .locals 10

    .line 1
    const-string v0, "\u6d69\ua83b\u6d07\u16c6\udfad\u95ca\u6da2\u674d"

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [C

    .line 8
    .line 9
    sget-object v1, LVa/pb;->D:Ljava/lang/Object;

    .line 10
    .line 11
    monitor-enter v1

    .line 12
    const-wide v2, -0x2ad01aebf764c27cL    # -2.2323841667566587E102

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    :try_start_0
    invoke-static {v2, v3, v0, p0}, LVa/pb;->z(J[CI)[C

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const/4 v0, 0x4

    .line 22
    sput v0, LVa/pb;->C:I

    .line 23
    .line 24
    :goto_0
    sget v4, LVa/pb;->C:I

    .line 25
    .line 26
    array-length v5, p0

    .line 27
    if-ge v4, v5, :cond_0

    .line 28
    .line 29
    add-int/lit8 v5, v4, -0x4

    .line 30
    .line 31
    aget-char v6, p0, v4

    .line 32
    .line 33
    rem-int/lit8 v7, v4, 0x4

    .line 34
    .line 35
    aget-char v7, p0, v7

    .line 36
    .line 37
    xor-int/2addr v6, v7

    .line 38
    int-to-long v6, v6

    .line 39
    int-to-long v8, v5

    .line 40
    mul-long/2addr v8, v2

    .line 41
    xor-long/2addr v6, v8

    .line 42
    long-to-int v5, v6

    .line 43
    int-to-char v5, v5

    .line 44
    aput-char v5, p0, v4

    .line 45
    .line 46
    add-int/lit8 v4, v4, 0x1

    .line 47
    .line 48
    sput v4, LVa/pb;->C:I

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    move-exception p0

    .line 52
    goto :goto_1

    .line 53
    :cond_0
    new-instance v2, Ljava/lang/String;

    .line 54
    .line 55
    array-length v3, p0

    .line 56
    sub-int/2addr v3, v0

    .line 57
    invoke-direct {v2, p0, v0, v3}, Ljava/lang/String;-><init>([CII)V

    .line 58
    .line 59
    .line 60
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    return-object v2

    .line 62
    :goto_1
    monitor-exit v1

    .line 63
    throw p0
.end method


# virtual methods
.method public final b(LVa/x8;LVa/y7;)LVa/s8;
    .locals 2

    .line 1
    new-instance p1, LVa/s8;

    .line 2
    .line 3
    const/4 p2, 0x0

    .line 4
    invoke-direct {p1, p2}, LVa/s8;-><init>(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    sget v0, LVa/T8;->e:I

    .line 8
    .line 9
    add-int/lit8 v0, v0, 0x61

    .line 10
    .line 11
    rem-int/lit16 v1, v0, 0x80

    .line 12
    .line 13
    sput v1, LVa/T8;->f:I

    .line 14
    .line 15
    rem-int/lit8 v0, v0, 0x2

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_0
    throw p2
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    sget v0, LVa/T8;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x9

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/T8;->e:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, -0x1

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-static {v1}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    ushr-int v0, v2, v0

    .line 20
    .line 21
    invoke-static {v0}, LVa/T8;->e(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0

    .line 30
    :cond_0
    invoke-static {v1}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    sub-int/2addr v2, v0

    .line 35
    invoke-static {v2}, LVa/T8;->e(I)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    goto :goto_0
.end method
