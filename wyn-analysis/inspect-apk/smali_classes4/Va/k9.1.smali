.class public final LVa/k9;
.super LVa/m9;
.source "SourceFile"


# static fields
.field public static final h:[C


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x2b

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LVa/k9;->h:[C

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 2
        0x63s
        -0x3936s
        -0x72d9s
        0x53c1s
        0x1af6s
        -0x1ec0s
        -0x5856s
        0x6ee6s
        0x354cs
        -0x454s
        -0x3de4s
        -0x768cs
        0x4fd9s
        0x164fs
        -0x228bs
        -0x5c31s
        0x6a3bs
        0x30dbs
        -0x80bs
        -0x41b1s
        -0x7b7fs
        0x4be7s
        0x124fs
        -0x2749s
        -0x60f5s
        0x6679s
        0x2ca9s
        -0xcb7s
        -0x4593s
        -0x7f3fs
        0x473fs
        0xdd5s
        -0x2b37s
        -0x64d5s
        0x6183s
        0x28fbs
        -0x10e6s
        -0x4a77s
        0x7c3fs
        0x4364s
        0x99bs
        -0x2ff7s
        -0x6887s
    .end array-data
.end method


# virtual methods
.method public final d()Ljava/lang/String;
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0, v0}, Landroid/view/View;->resolveSize(II)I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    int-to-char v1, v1

    .line 7
    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    int-to-byte v2, v2

    .line 12
    add-int/lit8 v2, v2, 0x1

    .line 13
    .line 14
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    shr-int/lit8 v3, v3, 0x10

    .line 19
    .line 20
    add-int/lit8 v3, v3, 0x2b

    .line 21
    .line 22
    sget-object v4, LVa/Ab;->u:Ljava/lang/Object;

    .line 23
    .line 24
    monitor-enter v4

    .line 25
    :try_start_0
    new-array v5, v3, [C

    .line 26
    .line 27
    sput v0, LVa/Ab;->t:I

    .line 28
    .line 29
    :goto_0
    sget v0, LVa/Ab;->t:I

    .line 30
    .line 31
    if-ge v0, v3, :cond_0

    .line 32
    .line 33
    sget-object v6, LVa/k9;->h:[C

    .line 34
    .line 35
    add-int v7, v2, v0

    .line 36
    .line 37
    aget-char v6, v6, v7

    .line 38
    .line 39
    int-to-long v6, v6

    .line 40
    int-to-long v8, v0

    .line 41
    const-wide v10, -0x53321e7436ef395bL    # -7.162539760891853E-93

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    mul-long/2addr v8, v10

    .line 47
    xor-long/2addr v6, v8

    .line 48
    int-to-long v8, v1

    .line 49
    xor-long/2addr v6, v8

    .line 50
    long-to-int v6, v6

    .line 51
    int-to-char v6, v6

    .line 52
    aput-char v6, v5, v0

    .line 53
    .line 54
    add-int/lit8 v0, v0, 0x1

    .line 55
    .line 56
    sput v0, LVa/Ab;->t:I

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :catchall_0
    move-exception v0

    .line 60
    goto :goto_1

    .line 61
    :cond_0
    new-instance v0, Ljava/lang/String;

    .line 62
    .line 63
    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    .line 64
    .line 65
    .line 66
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    return-object v0

    .line 72
    :goto_1
    monitor-exit v4

    .line 73
    throw v0
.end method

.method public final e()Ljava/lang/Class;
    .locals 1

    .line 1
    const-class v0, Lcom/bytedance/sdk/openadsdk/api/init/PAGSdk;

    .line 2
    .line 3
    return-object v0
.end method
