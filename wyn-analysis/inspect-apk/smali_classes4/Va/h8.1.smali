.class public final LVa/h8;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final g:[C

.field public static h:I = 0x0

.field public static i:I = 0x1


# instance fields
.field public a:Ljava/lang/String;

.field public b:Lcom/ironsource/adqualitysdk/sdk/ISAdQualityAdType;

.field public c:Lorg/json/JSONObject;

.field public d:Ljava/util/List;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x32

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LVa/h8;->g:[C

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 2
        0x6d60s
        -0x1c2ds
        0x7018s
        -0x3eb5s
        -0x2730s
        0x566bs
        -0x3a67s
        0x74f2s
        -0x1dc7s
        0x1162s
        0x70s
        -0x7121s
        0x1d0es
        -0x53a5s
        0x3a95s
        -0x363bs
        0x61s
        -0x7123s
        0x1d08s
        -0x53ads
        0x3a8es
        -0x3621s
        0x5800s
        -0x18a5s
        0x7595s
        0x4dds
        0x76s
        -0x7129s
        0x1d19s
        -0x53b3s
        0x3abes
        -0x3621s
        0x5818s
        -0x18bas
        0x7595s
        0x4dcs
        0x77s
        -0x7125s
        0x1d1es
        -0x5394s
        0x3a91s
        -0x362ds
        0x5803s
        -0x18bfs
        0x75b7s
        0x4cbs
        -0x6ce8s
        0x225es
        -0x4f73s
        0x3fd4s
    .end array-data
.end method

.method public static b(IIC)Ljava/lang/String;
    .locals 9

    .line 1
    sget-object v0, LVa/Ab;->u:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-array v1, p1, [C

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    sput v2, LVa/Ab;->t:I

    .line 8
    .line 9
    :goto_0
    sget v2, LVa/Ab;->t:I

    .line 10
    .line 11
    if-ge v2, p1, :cond_0

    .line 12
    .line 13
    sget-object v3, LVa/h8;->g:[C

    .line 14
    .line 15
    add-int v4, p0, v2

    .line 16
    .line 17
    aget-char v3, v3, v4

    .line 18
    .line 19
    int-to-long v3, v3

    .line 20
    int-to-long v5, v2

    .line 21
    const-wide v7, 0x1de138a2c1e78ebeL    # 9.34537289985163E-165

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    mul-long/2addr v5, v7

    .line 27
    xor-long/2addr v3, v5

    .line 28
    int-to-long v5, p2

    .line 29
    xor-long/2addr v3, v5

    .line 30
    long-to-int v3, v3

    .line 31
    int-to-char v3, v3

    .line 32
    aput-char v3, v1, v2

    .line 33
    .line 34
    add-int/lit8 v2, v2, 0x1

    .line 35
    .line 36
    sput v2, LVa/Ab;->t:I

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    move-exception p0

    .line 40
    goto :goto_1

    .line 41
    :cond_0
    new-instance p0, Ljava/lang/String;

    .line 42
    .line 43
    invoke-direct {p0, v1}, Ljava/lang/String;-><init>([C)V

    .line 44
    .line 45
    .line 46
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    return-object p0

    .line 48
    :goto_1
    monitor-exit v0

    .line 49
    throw p0
.end method


# virtual methods
.method public final a()Lorg/json/JSONObject;
    .locals 2

    .line 1
    sget v0, LVa/h8;->h:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1b

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/h8;->i:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    div-int/2addr v0, v0

    .line 15
    :cond_0
    add-int/lit8 v1, v1, 0x25

    .line 16
    .line 17
    rem-int/lit16 v1, v1, 0x80

    .line 18
    .line 19
    sput v1, LVa/h8;->h:I

    .line 20
    .line 21
    iget-object v0, p0, LVa/h8;->c:Lorg/json/JSONObject;

    .line 22
    .line 23
    return-object v0
.end method
