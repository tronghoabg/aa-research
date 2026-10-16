.class public final LVa/v1;
.super Ljava/util/HashMap;
.source "SourceFile"

# interfaces
.implements LVa/H9;


# static fields
.field public static c:I = 0x0

.field public static d:I = 0x1


# instance fields
.field public final a:LVa/Ra;

.field public final synthetic b:LVa/x1;


# direct methods
.method public constructor <init>(LVa/x1;Ljava/util/HashMap;LVa/Ra;)V
    .locals 0

    .line 1
    iput-object p1, p0, LVa/v1;->b:LVa/x1;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 4
    .line 5
    .line 6
    iput-object p3, p0, LVa/v1;->a:LVa/Ra;

    .line 7
    .line 8
    return-void
.end method

.method public static a(I)Ljava/lang/String;
    .locals 10

    .line 1
    const-string v0, "\u9a36\u544b\uc8e5\u9a72\udd38\ue457\udae9\u7f64\ubecf\uf9fc\ufe6c\u242e\ud343\u8675\u930d\u009b\uf785\ua2d5\u48b5\ued75\u080e\u4fbd\u6c28\uc9da\u2d77\u1419\u01cf\ub6f8\u41ee\u30f1\u2567"

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
    const-wide v2, 0x7de2795085248927L    # 2.416372884128998E298

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
.method public final c(Ljava/lang/String;Lcom/amazon/device/ads/DTBFetchManager;)Lcom/amazon/device/ads/DTBFetchManager;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x2

    .line 4
    sget v3, LVa/v1;->d:I

    .line 5
    .line 6
    add-int/lit8 v3, v3, 0x43

    .line 7
    .line 8
    rem-int/lit16 v4, v3, 0x80

    .line 9
    .line 10
    sput v4, LVa/v1;->c:I

    .line 11
    .line 12
    rem-int/2addr v3, v2

    .line 13
    iget-object v4, p0, LVa/v1;->a:LVa/Ra;

    .line 14
    .line 15
    iget-object v5, p0, LVa/v1;->b:LVa/x1;

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    rem-int/lit8 v2, v2, 0x2a

    .line 24
    .line 25
    sub-int/2addr v0, v2

    .line 26
    invoke-static {v0}, LVa/v1;->a(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const/4 v2, 0x5

    .line 35
    new-array v2, v2, [Ljava/lang/Object;

    .line 36
    .line 37
    aput-object p1, v2, v1

    .line 38
    .line 39
    aput-object p2, v2, v1

    .line 40
    .line 41
    invoke-virtual {v5, p0, v4, v0, v2}, LVa/Z0;->B0(LVa/H9;LVa/Ra;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    :goto_0
    invoke-super {p0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, Lcom/amazon/device/ads/DTBFetchManager;

    .line 49
    .line 50
    return-object p1

    .line 51
    :cond_0
    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    shr-int/lit8 v3, v3, 0x10

    .line 56
    .line 57
    rsub-int/lit8 v3, v3, 0x1

    .line 58
    .line 59
    invoke-static {v3}, LVa/v1;->a(I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    new-array v2, v2, [Ljava/lang/Object;

    .line 68
    .line 69
    aput-object p1, v2, v0

    .line 70
    .line 71
    aput-object p2, v2, v1

    .line 72
    .line 73
    invoke-virtual {v5, p0, v4, v3, v2}, LVa/Z0;->B0(LVa/H9;LVa/Ra;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    goto :goto_0
.end method

.method public final d()Ljava/lang/Object;
    .locals 3

    .line 1
    sget v0, LVa/v1;->c:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x19

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/v1;->d:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    add-int/lit8 v1, v1, 0x29

    .line 15
    .line 16
    rem-int/lit16 v0, v1, 0x80

    .line 17
    .line 18
    sput v0, LVa/v1;->c:I

    .line 19
    .line 20
    rem-int/lit8 v1, v1, 0x2

    .line 21
    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    const/16 v0, 0x47

    .line 25
    .line 26
    div-int/lit8 v0, v0, 0x0

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_0
    throw v2

    .line 30
    :cond_1
    add-int/lit8 v1, v1, 0x29

    .line 31
    .line 32
    rem-int/lit16 v0, v1, 0x80

    .line 33
    .line 34
    sput v0, LVa/v1;->c:I

    .line 35
    .line 36
    rem-int/lit8 v1, v1, 0x2

    .line 37
    .line 38
    if-nez v1, :cond_2

    .line 39
    .line 40
    return-object p0

    .line 41
    :cond_2
    throw v2
.end method

.method public final synthetic put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    sget v0, LVa/v1;->c:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x47

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/v1;->d:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    check-cast p1, Ljava/lang/String;

    .line 12
    .line 13
    check-cast p2, Lcom/amazon/device/ads/DTBFetchManager;

    .line 14
    .line 15
    invoke-virtual {p0, p1, p2}, LVa/v1;->c(Ljava/lang/String;Lcom/amazon/device/ads/DTBFetchManager;)Lcom/amazon/device/ads/DTBFetchManager;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    const/16 p2, 0x40

    .line 22
    .line 23
    div-int/lit8 p2, p2, 0x0

    .line 24
    .line 25
    :cond_0
    sget p2, LVa/v1;->d:I

    .line 26
    .line 27
    add-int/lit8 p2, p2, 0x1d

    .line 28
    .line 29
    rem-int/lit16 v0, p2, 0x80

    .line 30
    .line 31
    sput v0, LVa/v1;->c:I

    .line 32
    .line 33
    rem-int/lit8 p2, p2, 0x2

    .line 34
    .line 35
    if-eqz p2, :cond_1

    .line 36
    .line 37
    const/16 p2, 0x4b

    .line 38
    .line 39
    div-int/lit8 p2, p2, 0x0

    .line 40
    .line 41
    :cond_1
    return-object p1
.end method
