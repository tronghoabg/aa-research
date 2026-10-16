.class public final LVa/f0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final f:[B

.field public static g:I = 0x0

.field public static h:I = 0x1


# instance fields
.field public a:LVa/Eb;

.field public b:Landroid/os/Handler;

.field public c:LVa/x;

.field public d:Ljava/util/HashSet;

.field public e:Ljava/util/HashSet;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x22

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LVa/f0;->f:[B

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 1
        0x2t
        -0x1t
        -0xft
        0x13t
        -0x4t
        -0xdt
        0xft
        0x4t
        -0x15t
        0x11t
        0x2t
        0x2t
        -0x1t
        -0xbt
        0x0t
        0x1t
        -0x5t
        0x1t
        0x14t
        -0x15t
        0x11t
        0x2t
        -0x8t
        0x2t
        0xdt
        0x1t
        -0xat
        0x9t
        0x12t
        -0x21t
        0x6t
        0x9t
        -0x11t
        0x31t
    .end array-data
.end method

.method public static g(SIIIB)Ljava/lang/String;
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
    add-int/lit8 p2, p2, 0x9

    .line 10
    .line 11
    const/4 v2, -0x1

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x1

    .line 14
    if-ne p2, v2, :cond_0

    .line 15
    .line 16
    move v3, v4

    .line 17
    :cond_0
    if-eqz v3, :cond_1

    .line 18
    .line 19
    sget-object p2, LVa/f0;->f:[B

    .line 20
    .line 21
    const v2, 0x5be82822

    .line 22
    .line 23
    .line 24
    add-int/2addr v2, p3

    .line 25
    aget-byte p2, p2, v2

    .line 26
    .line 27
    add-int/lit8 p2, p2, 0x9

    .line 28
    .line 29
    int-to-byte p2, p2

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
    if-lez p2, :cond_2

    .line 34
    .line 35
    add-int/2addr p3, p2

    .line 36
    const v2, -0x5be82820

    .line 37
    .line 38
    .line 39
    sub-int/2addr p3, v2

    .line 40
    add-int/2addr p3, v3

    .line 41
    sput p3, LVa/pb;->F:I

    .line 42
    .line 43
    sput-byte p4, LVa/pb;->G:B

    .line 44
    .line 45
    const p3, -0x6e1df93a

    .line 46
    .line 47
    .line 48
    add-int/2addr p1, p3

    .line 49
    int-to-char p1, p1

    .line 50
    sput-char p1, LVa/pb;->H:C

    .line 51
    .line 52
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    sget-char p1, LVa/pb;->H:C

    .line 56
    .line 57
    sput-char p1, LVa/pb;->I:C

    .line 58
    .line 59
    sput v4, LVa/pb;->E:I

    .line 60
    .line 61
    :goto_1
    sget p1, LVa/pb;->E:I

    .line 62
    .line 63
    if-ge p1, p2, :cond_2

    .line 64
    .line 65
    sget-object p1, LVa/f0;->f:[B

    .line 66
    .line 67
    sget p3, LVa/pb;->F:I

    .line 68
    .line 69
    add-int/lit8 p4, p3, -0x1

    .line 70
    .line 71
    sput p4, LVa/pb;->F:I

    .line 72
    .line 73
    aget-byte p1, p1, p3

    .line 74
    .line 75
    sget-char p3, LVa/pb;->I:C

    .line 76
    .line 77
    add-int/2addr p1, p0

    .line 78
    int-to-byte p1, p1

    .line 79
    sget-byte p4, LVa/pb;->G:B

    .line 80
    .line 81
    xor-int/2addr p1, p4

    .line 82
    add-int/2addr p3, p1

    .line 83
    int-to-char p1, p3

    .line 84
    sput-char p1, LVa/pb;->H:C

    .line 85
    .line 86
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    sget-char p1, LVa/pb;->H:C

    .line 90
    .line 91
    sput-char p1, LVa/pb;->I:C

    .line 92
    .line 93
    sget p1, LVa/pb;->E:I

    .line 94
    .line 95
    add-int/2addr p1, v4

    .line 96
    sput p1, LVa/pb;->E:I

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

.method public static i(Ljava/lang/String;I)Ljava/lang/String;
    .locals 12

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
    sget-object v0, LVa/Ab;->F:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    array-length v1, p0

    .line 11
    new-array v1, v1, [C

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    sput v2, LVa/Ab;->E:I

    .line 15
    .line 16
    const/4 v3, 0x2

    .line 17
    new-array v3, v3, [C

    .line 18
    .line 19
    :goto_0
    sget v4, LVa/Ab;->E:I

    .line 20
    .line 21
    array-length v5, p0

    .line 22
    if-ge v4, v5, :cond_1

    .line 23
    .line 24
    aget-char v5, p0, v4

    .line 25
    .line 26
    aput-char v5, v3, v2

    .line 27
    .line 28
    add-int/lit8 v4, v4, 0x1

    .line 29
    .line 30
    aget-char v4, p0, v4

    .line 31
    .line 32
    const/4 v5, 0x1

    .line 33
    aput-char v4, v3, v5

    .line 34
    .line 35
    const v4, 0xe370

    .line 36
    .line 37
    .line 38
    move v6, v2

    .line 39
    :goto_1
    const/16 v7, 0x10

    .line 40
    .line 41
    if-ge v6, v7, :cond_0

    .line 42
    .line 43
    aget-char v7, v3, v5

    .line 44
    .line 45
    aget-char v8, v3, v2

    .line 46
    .line 47
    add-int v9, v8, v4

    .line 48
    .line 49
    shl-int/lit8 v10, v8, 0x4

    .line 50
    .line 51
    const v11, 0xd7e2

    .line 52
    .line 53
    .line 54
    add-int/2addr v10, v11

    .line 55
    xor-int/2addr v9, v10

    .line 56
    ushr-int/lit8 v10, v8, 0x5

    .line 57
    .line 58
    add-int/lit16 v10, v10, 0x6c8e

    .line 59
    .line 60
    xor-int/2addr v9, v10

    .line 61
    sub-int/2addr v7, v9

    .line 62
    int-to-char v7, v7

    .line 63
    aput-char v7, v3, v5

    .line 64
    .line 65
    add-int v9, v7, v4

    .line 66
    .line 67
    shl-int/lit8 v10, v7, 0x4

    .line 68
    .line 69
    const v11, 0xc827

    .line 70
    .line 71
    .line 72
    add-int/2addr v10, v11

    .line 73
    xor-int/2addr v9, v10

    .line 74
    ushr-int/lit8 v7, v7, 0x5

    .line 75
    .line 76
    const v10, 0xa080

    .line 77
    .line 78
    .line 79
    add-int/2addr v7, v10

    .line 80
    xor-int/2addr v7, v9

    .line 81
    sub-int/2addr v8, v7

    .line 82
    int-to-char v7, v8

    .line 83
    aput-char v7, v3, v2

    .line 84
    .line 85
    const v7, 0x9e37

    .line 86
    .line 87
    .line 88
    sub-int/2addr v4, v7

    .line 89
    add-int/lit8 v6, v6, 0x1

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :catchall_0
    move-exception p0

    .line 93
    goto :goto_2

    .line 94
    :cond_0
    sget v4, LVa/Ab;->E:I

    .line 95
    .line 96
    aget-char v6, v3, v2

    .line 97
    .line 98
    aput-char v6, v1, v4

    .line 99
    .line 100
    add-int/lit8 v6, v4, 0x1

    .line 101
    .line 102
    aget-char v5, v3, v5

    .line 103
    .line 104
    aput-char v5, v1, v6

    .line 105
    .line 106
    add-int/lit8 v4, v4, 0x2

    .line 107
    .line 108
    sput v4, LVa/Ab;->E:I

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_1
    new-instance p0, Ljava/lang/String;

    .line 112
    .line 113
    invoke-direct {p0, v1, v2, p1}, Ljava/lang/String;-><init>([CII)V

    .line 114
    .line 115
    .line 116
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 117
    return-object p0

    .line 118
    :goto_2
    monitor-exit v0

    .line 119
    throw p0
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;)V
    .locals 3

    .line 1
    sget v0, LVa/f0;->g:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1f

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/f0;->h:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const-string v1, "\u0832\u3b49\u622d\u5a66\u5fa5\u7347\u0889\ua5de\u38c5\u4842\u7512\ua27f\ue555\uf235"

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    rem-int/lit8 v0, v0, 0x76

    .line 20
    .line 21
    const/16 v2, 0x39

    .line 22
    .line 23
    shl-int v0, v2, v0

    .line 24
    .line 25
    :goto_0
    invoke-static {v1, v0}, LVa/f0;->i(Ljava/lang/String;I)Ljava/lang/String;

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
    invoke-virtual {p0, v0, p1}, LVa/f0;->f(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_0
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    shr-int/lit8 v0, v0, 0x10

    .line 42
    .line 43
    add-int/lit8 v0, v0, 0xd

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :goto_1
    sget p1, LVa/f0;->g:I

    .line 47
    .line 48
    add-int/lit8 p1, p1, 0x2d

    .line 49
    .line 50
    rem-int/lit16 v0, p1, 0x80

    .line 51
    .line 52
    sput v0, LVa/f0;->h:I

    .line 53
    .line 54
    rem-int/lit8 p1, p1, 0x2

    .line 55
    .line 56
    if-eqz p1, :cond_1

    .line 57
    .line 58
    return-void

    .line 59
    :cond_1
    const/4 p1, 0x0

    .line 60
    throw p1
.end method

.method public final b(Lorg/json/JSONObject;)V
    .locals 6

    .line 1
    sget v0, LVa/f0;->h:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x5b

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/f0;->g:I

    .line 8
    .line 9
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    shr-int/lit8 v0, v0, 0x10

    .line 14
    .line 15
    int-to-short v0, v0

    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-static {v1, v1, v1, v1}, Landroid/graphics/Color;->argb(IIII)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const v3, 0x6e1df99b

    .line 22
    .line 23
    .line 24
    sub-int/2addr v3, v2

    .line 25
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    shr-int/lit8 v2, v2, 0x10

    .line 30
    .line 31
    add-int/lit8 v2, v2, -0xa

    .line 32
    .line 33
    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    int-to-byte v4, v4

    .line 38
    const v5, -0x5be82816

    .line 39
    .line 40
    .line 41
    add-int/2addr v4, v5

    .line 42
    invoke-static {v1}, Landroid/os/Process;->getThreadPriority(I)I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    add-int/lit8 v1, v1, 0x14

    .line 47
    .line 48
    shr-int/lit8 v1, v1, 0x6

    .line 49
    .line 50
    int-to-byte v1, v1

    .line 51
    invoke-static {v0, v3, v2, v4, v1}, LVa/f0;->g(SIIIB)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {p0, v0, p1}, LVa/f0;->f(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 60
    .line 61
    .line 62
    sget p1, LVa/f0;->h:I

    .line 63
    .line 64
    add-int/lit8 p1, p1, 0x75

    .line 65
    .line 66
    rem-int/lit16 p1, p1, 0x80

    .line 67
    .line 68
    sput p1, LVa/f0;->g:I

    .line 69
    .line 70
    return-void
.end method

.method public final c(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    iget-object v1, p0, LVa/f0;->d:Ljava/util/HashSet;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_2

    .line 17
    .line 18
    sget v1, LVa/f0;->g:I

    .line 19
    .line 20
    add-int/lit8 v1, v1, 0x73

    .line 21
    .line 22
    rem-int/lit16 v2, v1, 0x80

    .line 23
    .line 24
    sput v2, LVa/f0;->h:I

    .line 25
    .line 26
    rem-int/lit8 v1, v1, 0x2

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, LVa/ua;

    .line 35
    .line 36
    invoke-interface {v1, p1, p2}, LVa/ua;->a(Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    if-eqz v1, :cond_0

    .line 41
    .line 42
    invoke-static {p2, v1}, LVa/Ab;->g0(Lorg/json/JSONObject;Lorg/json/JSONObject;)V

    .line 43
    .line 44
    .line 45
    sget v1, LVa/f0;->h:I

    .line 46
    .line 47
    add-int/lit8 v1, v1, 0x29

    .line 48
    .line 49
    rem-int/lit16 v1, v1, 0x80

    .line 50
    .line 51
    sput v1, LVa/f0;->g:I

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    check-cast v0, LVa/ua;

    .line 59
    .line 60
    invoke-interface {v0, p1, p2}, LVa/ua;->a(Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 61
    .line 62
    .line 63
    const/4 p1, 0x0

    .line 64
    throw p1

    .line 65
    :cond_2
    return-void
.end method

.method public final d(Lorg/json/JSONObject;)V
    .locals 3

    .line 1
    sget v0, LVa/f0;->h:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x5d

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/f0;->g:I

    .line 8
    .line 9
    iget-object v1, p0, LVa/f0;->a:LVa/Eb;

    .line 10
    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    add-int/lit8 v0, v0, 0x65

    .line 14
    .line 15
    rem-int/lit16 v2, v0, 0x80

    .line 16
    .line 17
    sput v2, LVa/f0;->h:I

    .line 18
    .line 19
    rem-int/lit8 v0, v0, 0x2

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    sget-object v0, LVa/sa;->a:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sget-object v2, LVa/sa;->d:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    invoke-static {p1}, Lcom/ironsource/adqualitysdk/sdk/ISAdQualityAdType;->fromInt(I)Lcom/ironsource/adqualitysdk/sdk/ISAdQualityAdType;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {v1, v0, p1}, LVa/Eb;->adClosed(Ljava/lang/String;Lcom/ironsource/adqualitysdk/sdk/ISAdQualityAdType;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_0
    sget-object v0, LVa/sa;->a:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    sget-object v2, LVa/sa;->d:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    invoke-static {p1}, Lcom/ironsource/adqualitysdk/sdk/ISAdQualityAdType;->fromInt(I)Lcom/ironsource/adqualitysdk/sdk/ISAdQualityAdType;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {v1, v0, p1}, LVa/Eb;->adClosed(Ljava/lang/String;Lcom/ironsource/adqualitysdk/sdk/ISAdQualityAdType;)V

    .line 60
    .line 61
    .line 62
    const/4 p1, 0x0

    .line 63
    throw p1

    .line 64
    :cond_1
    return-void
.end method

.method public final e(LVa/ua;)V
    .locals 1

    .line 1
    sget v0, LVa/f0;->g:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x25

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/f0;->h:I

    .line 8
    .line 9
    iget-object v0, p0, LVa/f0;->d:Ljava/util/HashSet;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    sget p1, LVa/f0;->h:I

    .line 15
    .line 16
    add-int/lit8 p1, p1, 0x7d

    .line 17
    .line 18
    rem-int/lit16 p1, p1, 0x80

    .line 19
    .line 20
    sput p1, LVa/f0;->g:I

    .line 21
    .line 22
    return-void
.end method

.method public final f(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 2

    .line 1
    new-instance v0, LVa/Da;

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    invoke-direct {v0, v1}, LVa/Da;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iput-object p0, v0, LVa/Da;->f:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p1, v0, LVa/Da;->d:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p2, v0, LVa/Da;->e:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object p1, p0, LVa/f0;->b:Landroid/os/Handler;

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 17
    .line 18
    .line 19
    sget p1, LVa/f0;->h:I

    .line 20
    .line 21
    add-int/lit8 p1, p1, 0x79

    .line 22
    .line 23
    rem-int/lit16 p1, p1, 0x80

    .line 24
    .line 25
    sput p1, LVa/f0;->g:I

    .line 26
    .line 27
    return-void
.end method

.method public final h(Lorg/json/JSONObject;)V
    .locals 4

    .line 1
    sget v0, LVa/f0;->g:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x5f

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/f0;->h:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const v1, 0x100000b

    .line 12
    .line 13
    .line 14
    const-string v2, "\u0832\u3b49\u622d\u5a66\u44e1\u604f\u39c2\u2a9e\u290d\ud8b0\ue555\uf235"

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    invoke-static {v3, v3, v3}, Landroid/graphics/Color;->rgb(III)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    shr-int v0, v1, v0

    .line 24
    .line 25
    :goto_0
    invoke-static {v2, v0}, LVa/f0;->i(Ljava/lang/String;I)Ljava/lang/String;

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
    invoke-virtual {p0, v0, p1}, LVa/f0;->f(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    invoke-static {v3, v3, v3}, Landroid/graphics/Color;->rgb(III)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    add-int/2addr v0, v1

    .line 42
    goto :goto_0
.end method

.method public final j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Z)V
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p4

    .line 8
    .line 9
    move-object/from16 v4, p5

    .line 10
    .line 11
    iget-object v5, v1, LVa/f0;->e:Ljava/util/HashSet;

    .line 12
    .line 13
    monitor-enter v5

    .line 14
    :try_start_0
    new-instance v6, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v7, ""

    .line 23
    .line 24
    const/16 v8, 0x30

    .line 25
    .line 26
    const/4 v9, 0x0

    .line 27
    invoke-static {v7, v8, v9, v9}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CII)I

    .line 28
    .line 29
    .line 30
    move-result v7

    .line 31
    const/4 v10, 0x1

    .line 32
    add-int/2addr v7, v10

    .line 33
    int-to-short v7, v7

    .line 34
    invoke-static {v9, v9}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    .line 35
    .line 36
    .line 37
    move-result-wide v11

    .line 38
    const-wide/16 v13, 0x0

    .line 39
    .line 40
    cmp-long v11, v11, v13

    .line 41
    .line 42
    const v12, 0x6e1df975

    .line 43
    .line 44
    .line 45
    add-int/2addr v11, v12

    .line 46
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    .line 47
    .line 48
    .line 49
    move-result v12

    .line 50
    shr-int/lit8 v12, v12, 0x10

    .line 51
    .line 52
    rsub-int/lit8 v12, v12, -0xa

    .line 53
    .line 54
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 55
    .line 56
    .line 57
    move-result-wide v15

    .line 58
    cmp-long v15, v15, v13

    .line 59
    .line 60
    const v16, -0x5be8280d

    .line 61
    .line 62
    .line 63
    add-int v15, v15, v16

    .line 64
    .line 65
    move-wide/from16 v16, v13

    .line 66
    .line 67
    invoke-static {v9}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    .line 68
    .line 69
    .line 70
    move-result v13

    .line 71
    int-to-byte v13, v13

    .line 72
    invoke-static {v7, v11, v12, v15, v13}, LVa/f0;->g(SIIIB)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    invoke-virtual {v7}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    iget-object v7, v1, LVa/f0;->e:Ljava/util/HashSet;

    .line 91
    .line 92
    invoke-virtual {v7, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v7

    .line 96
    if-eqz v7, :cond_0

    .line 97
    .line 98
    if-nez p6, :cond_0

    .line 99
    .line 100
    invoke-static {}, LVa/G;->S()LVa/G;

    .line 101
    .line 102
    .line 103
    move-result-object v7

    .line 104
    invoke-virtual {v7}, LVa/G;->f0()Z

    .line 105
    .line 106
    .line 107
    move-result v7

    .line 108
    if-nez v7, :cond_0

    .line 109
    .line 110
    monitor-exit v5

    .line 111
    return-void

    .line 112
    :catchall_0
    move-exception v0

    .line 113
    goto/16 :goto_7

    .line 114
    .line 115
    :cond_0
    iget-object v7, v1, LVa/f0;->e:Ljava/util/HashSet;

    .line 116
    .line 117
    invoke-virtual {v7, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    monitor-exit v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 121
    invoke-static {}, Ljava/lang/Math;->random()D

    .line 122
    .line 123
    .line 124
    move-result-wide v5

    .line 125
    const-wide/high16 v11, 0x4059000000000000L    # 100.0

    .line 126
    .line 127
    mul-double/2addr v5, v11

    .line 128
    sget v7, LVa/f0;->g:I

    .line 129
    .line 130
    add-int/lit8 v7, v7, 0x5b

    .line 131
    .line 132
    rem-int/lit16 v13, v7, 0x80

    .line 133
    .line 134
    sput v13, LVa/f0;->h:I

    .line 135
    .line 136
    const/4 v13, 0x2

    .line 137
    rem-int/2addr v7, v13

    .line 138
    if-nez v7, :cond_2

    .line 139
    .line 140
    invoke-static {}, LVa/G;->S()LVa/G;

    .line 141
    .line 142
    .line 143
    move-result-object v7

    .line 144
    invoke-virtual {v7}, LVa/G;->P()Z

    .line 145
    .line 146
    .line 147
    move-result v7

    .line 148
    const/4 v15, 0x5

    .line 149
    div-int/2addr v15, v9

    .line 150
    xor-int/2addr v7, v10

    .line 151
    if-eq v7, v10, :cond_3

    .line 152
    .line 153
    :cond_1
    move/from16 p6, v13

    .line 154
    .line 155
    const/16 v18, 0x0

    .line 156
    .line 157
    goto :goto_1

    .line 158
    :cond_2
    invoke-static {}, LVa/G;->S()LVa/G;

    .line 159
    .line 160
    .line 161
    move-result-object v7

    .line 162
    invoke-virtual {v7}, LVa/G;->P()Z

    .line 163
    .line 164
    .line 165
    move-result v7

    .line 166
    if-nez v7, :cond_1

    .line 167
    .line 168
    :cond_3
    invoke-static {}, LVa/G;->S()LVa/G;

    .line 169
    .line 170
    .line 171
    move-result-object v7

    .line 172
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    sget v11, LVa/G;->E:I

    .line 176
    .line 177
    add-int/lit8 v11, v11, 0x1f

    .line 178
    .line 179
    rem-int/lit16 v12, v11, 0x80

    .line 180
    .line 181
    sput v12, LVa/G;->F:I

    .line 182
    .line 183
    rem-int/2addr v11, v13

    .line 184
    const-string v12, "\u0005\u0002\u00cc"

    .line 185
    .line 186
    move/from16 p6, v13

    .line 187
    .line 188
    const/4 v15, 0x0

    .line 189
    const-wide/high16 v13, 0x4014000000000000L    # 5.0

    .line 190
    .line 191
    if-nez v11, :cond_4

    .line 192
    .line 193
    invoke-virtual {v7}, LVa/Mb;->e()Lorg/json/JSONObject;

    .line 194
    .line 195
    .line 196
    move-result-object v7

    .line 197
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    .line 198
    .line 199
    .line 200
    move-result v11

    .line 201
    const/high16 v18, 0x3f800000    # 1.0f

    .line 202
    .line 203
    cmpl-float v11, v11, v18

    .line 204
    .line 205
    add-int/lit8 v11, v11, 0x5

    .line 206
    .line 207
    move/from16 v18, v15

    .line 208
    .line 209
    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    .line 210
    .line 211
    .line 212
    move-result v15

    .line 213
    int-to-byte v15, v15

    .line 214
    const/16 v19, 0x3e

    .line 215
    .line 216
    div-int v15, v19, v15

    .line 217
    .line 218
    :goto_0
    int-to-byte v15, v15

    .line 219
    invoke-static {v15, v11, v12}, LVa/G;->W(BILjava/lang/String;)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v11

    .line 223
    invoke-virtual {v11}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v11

    .line 227
    invoke-virtual {v7, v11, v13, v14}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    .line 228
    .line 229
    .line 230
    move-result-wide v11

    .line 231
    goto :goto_2

    .line 232
    :cond_4
    move/from16 v18, v15

    .line 233
    .line 234
    invoke-virtual {v7}, LVa/Mb;->e()Lorg/json/JSONObject;

    .line 235
    .line 236
    .line 237
    move-result-object v7

    .line 238
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    .line 239
    .line 240
    .line 241
    move-result v11

    .line 242
    cmpl-float v11, v11, v18

    .line 243
    .line 244
    rsub-int/lit8 v11, v11, 0x4

    .line 245
    .line 246
    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    .line 247
    .line 248
    .line 249
    move-result v15

    .line 250
    int-to-byte v15, v15

    .line 251
    rsub-int/lit8 v15, v15, 0x5b

    .line 252
    .line 253
    goto :goto_0

    .line 254
    :goto_1
    sget v7, LVa/f0;->h:I

    .line 255
    .line 256
    add-int/lit8 v7, v7, 0x77

    .line 257
    .line 258
    rem-int/lit16 v13, v7, 0x80

    .line 259
    .line 260
    sput v13, LVa/f0;->g:I

    .line 261
    .line 262
    rem-int/lit8 v7, v7, 0x2

    .line 263
    .line 264
    if-eqz v7, :cond_5

    .line 265
    .line 266
    const/16 v7, 0x22

    .line 267
    .line 268
    div-int/2addr v7, v9

    .line 269
    :cond_5
    :goto_2
    cmpg-double v5, v5, v11

    .line 270
    .line 271
    if-gez v5, :cond_9

    .line 272
    .line 273
    const-string v5, ""

    .line 274
    .line 275
    new-instance v6, Lorg/json/JSONObject;

    .line 276
    .line 277
    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 278
    .line 279
    .line 280
    :try_start_1
    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    .line 281
    .line 282
    .line 283
    move-result v7

    .line 284
    cmpl-float v7, v7, v18

    .line 285
    .line 286
    add-int/2addr v7, v10

    .line 287
    const-string v11, "\ufff7\ufffd\ufffb\u0008\n"

    .line 288
    .line 289
    invoke-static {v5, v9}, Landroid/text/TextUtils;->getOffsetBefore(Ljava/lang/CharSequence;I)I

    .line 290
    .line 291
    .line 292
    move-result v12

    .line 293
    rsub-int/lit8 v12, v12, 0x5

    .line 294
    .line 295
    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    .line 296
    .line 297
    .line 298
    move-result v13

    .line 299
    shr-int/lit8 v13, v13, 0x10

    .line 300
    .line 301
    rsub-int v13, v13, 0x9d

    .line 302
    .line 303
    invoke-static {v11, v7, v12, v13, v9}, LVa/x;->B(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v7

    .line 307
    invoke-virtual {v7}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v7

    .line 311
    move-object/from16 v11, p1

    .line 312
    .line 313
    invoke-virtual {v6, v7, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 314
    .line 315
    .line 316
    invoke-static {v9}, Landroid/graphics/Color;->red(I)I

    .line 317
    .line 318
    .line 319
    move-result v7

    .line 320
    rsub-int/lit8 v7, v7, 0x1

    .line 321
    .line 322
    const-string v11, "\ufffb\ufff9\u0006\u0001\u0007"

    .line 323
    .line 324
    invoke-static {v5, v8, v9}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    .line 325
    .line 326
    .line 327
    move-result v12

    .line 328
    add-int/lit8 v12, v12, 0x6

    .line 329
    .line 330
    invoke-static {v5}, Landroid/os/Process;->getGidForName(Ljava/lang/String;)I

    .line 331
    .line 332
    .line 333
    move-result v13

    .line 334
    add-int/lit16 v13, v13, 0xa0

    .line 335
    .line 336
    invoke-static {v11, v7, v12, v13, v9}, LVa/x;->B(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v7

    .line 340
    invoke-virtual {v7}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v7

    .line 344
    invoke-virtual {v6, v7, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 345
    .line 346
    .line 347
    invoke-static {v5, v8}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    .line 348
    .line 349
    .line 350
    move-result v0

    .line 351
    rsub-int/lit8 v0, v0, 0x1

    .line 352
    .line 353
    const-string v7, "\n\ufffd\ufffd\ufffc\u0007\ufffb"

    .line 354
    .line 355
    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    .line 356
    .line 357
    .line 358
    move-result-wide v11

    .line 359
    cmp-long v11, v11, v16

    .line 360
    .line 361
    add-int/lit8 v11, v11, 0x5

    .line 362
    .line 363
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    .line 364
    .line 365
    .line 366
    move-result v12

    .line 367
    shr-int/lit8 v12, v12, 0x10

    .line 368
    .line 369
    rsub-int v12, v12, 0x9b

    .line 370
    .line 371
    invoke-static {v7, v0, v11, v12, v10}, LVa/x;->B(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    invoke-virtual {v6, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 380
    .line 381
    .line 382
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 383
    .line 384
    .line 385
    move-result v0
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 386
    if-nez v0, :cond_7

    .line 387
    .line 388
    sget v0, LVa/x;->r:I

    .line 389
    .line 390
    add-int/lit8 v0, v0, 0x3b

    .line 391
    .line 392
    rem-int/lit16 v2, v0, 0x80

    .line 393
    .line 394
    sput v2, LVa/x;->s:I

    .line 395
    .line 396
    rem-int/lit8 v0, v0, 0x2

    .line 397
    .line 398
    const-string v2, "\ufcf2\u14f9\u860c\udb48\u0875\ufe24"

    .line 399
    .line 400
    if-nez v0, :cond_6

    .line 401
    .line 402
    :try_start_2
    invoke-static {v9}, Landroid/graphics/Color;->red(I)I

    .line 403
    .line 404
    .line 405
    move-result v0

    .line 406
    shr-int v0, p6, v0

    .line 407
    .line 408
    invoke-static {v2, v0}, LVa/x;->v(Ljava/lang/String;I)Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object v0

    .line 412
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    :goto_3
    invoke-virtual {v6, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 417
    .line 418
    .line 419
    goto :goto_4

    .line 420
    :catch_0
    move-exception v0

    .line 421
    goto :goto_5

    .line 422
    :cond_6
    invoke-static {v9}, Landroid/graphics/Color;->red(I)I

    .line 423
    .line 424
    .line 425
    move-result v0

    .line 426
    rsub-int/lit8 v0, v0, 0x5

    .line 427
    .line 428
    invoke-static {v2, v0}, LVa/x;->v(Ljava/lang/String;I)Ljava/lang/String;

    .line 429
    .line 430
    .line 431
    move-result-object v0

    .line 432
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 433
    .line 434
    .line 435
    move-result-object v0
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    .line 436
    goto :goto_3

    .line 437
    :cond_7
    :goto_4
    if-eqz v4, :cond_8

    .line 438
    .line 439
    sget v0, LVa/x;->r:I

    .line 440
    .line 441
    add-int/lit8 v0, v0, 0x45

    .line 442
    .line 443
    rem-int/lit16 v0, v0, 0x80

    .line 444
    .line 445
    sput v0, LVa/x;->s:I

    .line 446
    .line 447
    :try_start_3
    invoke-static {v6, v4}, LVa/Ab;->g0(Lorg/json/JSONObject;Lorg/json/JSONObject;)V
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_0

    .line 448
    .line 449
    .line 450
    goto :goto_6

    .line 451
    :goto_5
    invoke-static {v9, v9}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 452
    .line 453
    .line 454
    move-result v2

    .line 455
    add-int/lit8 v2, v2, 0x9

    .line 456
    .line 457
    invoke-static {v5, v8}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    .line 458
    .line 459
    .line 460
    move-result v3

    .line 461
    add-int/lit8 v3, v3, 0xa

    .line 462
    .line 463
    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    .line 464
    .line 465
    .line 466
    move-result-wide v4

    .line 467
    cmp-long v4, v4, v16

    .line 468
    .line 469
    rsub-int v4, v4, 0x9c

    .line 470
    .line 471
    const-string v5, "\uffd9\u0006\ufff9\u0004\u0011\u000c\u0001\ufffb\u000b"

    .line 472
    .line 473
    invoke-static {v5, v2, v3, v4, v9}, LVa/x;->B(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 474
    .line 475
    .line 476
    move-result-object v2

    .line 477
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 478
    .line 479
    .line 480
    move-result-object v2

    .line 481
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    .line 482
    .line 483
    .line 484
    move-result v3

    .line 485
    cmpl-float v3, v3, v18

    .line 486
    .line 487
    rsub-int/lit8 v3, v3, 0x1b

    .line 488
    .line 489
    const-string v4, "\u10f4\u6ef3\u395f\ud29d\uedf1\u598f\u62bb\uf86f\u0868\u7dc3\u98bb\u56e5\u623f\u1c1f\uea4d\ue694\u4275\u410d\ua7ae\uddde\u2fbc\u4e89\u9fa6\ucb89\ua0e6\ue875"

    .line 490
    .line 491
    invoke-static {v4, v3}, LVa/x;->v(Ljava/lang/String;I)Ljava/lang/String;

    .line 492
    .line 493
    .line 494
    move-result-object v3

    .line 495
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 496
    .line 497
    .line 498
    move-result-object v3

    .line 499
    invoke-static {v2, v3, v0}, LVa/Ab;->R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 500
    .line 501
    .line 502
    :cond_8
    :goto_6
    const-string v0, "\u637a\ud945\u8e22\u690d\udc05\uae9e\u33b2\u6408"

    .line 503
    .line 504
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    .line 505
    .line 506
    .line 507
    move-result v2

    .line 508
    shr-int/lit8 v2, v2, 0x10

    .line 509
    .line 510
    rsub-int/lit8 v2, v2, 0x8

    .line 511
    .line 512
    invoke-static {v0, v2}, LVa/f0;->i(Ljava/lang/String;I)Ljava/lang/String;

    .line 513
    .line 514
    .line 515
    move-result-object v0

    .line 516
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 517
    .line 518
    .line 519
    move-result-object v0

    .line 520
    invoke-virtual {v1, v0, v6}, LVa/f0;->c(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 521
    .line 522
    .line 523
    iget-object v0, v1, LVa/f0;->c:LVa/x;

    .line 524
    .line 525
    const-string v2, "\u637a\ud945\u8e22\u690d\udc05\uae9e\u33b2\u6408"

    .line 526
    .line 527
    const-string v3, ""

    .line 528
    .line 529
    invoke-static {v3, v8}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    .line 530
    .line 531
    .line 532
    move-result v3

    .line 533
    rsub-int/lit8 v3, v3, 0x7

    .line 534
    .line 535
    invoke-static {v2, v3}, LVa/f0;->i(Ljava/lang/String;I)Ljava/lang/String;

    .line 536
    .line 537
    .line 538
    move-result-object v2

    .line 539
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 540
    .line 541
    .line 542
    move-result-object v2

    .line 543
    invoke-virtual {v0, v2, v6}, LVa/x;->x(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 544
    .line 545
    .line 546
    return-void

    .line 547
    :cond_9
    invoke-static {v9, v9, v9, v9}, Landroid/graphics/Color;->argb(IIII)I

    .line 548
    .line 549
    .line 550
    move-result v0

    .line 551
    int-to-short v0, v0

    .line 552
    const v2, 0x6e1df97f

    .line 553
    .line 554
    .line 555
    invoke-static {v9}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 556
    .line 557
    .line 558
    move-result v3

    .line 559
    sub-int/2addr v2, v3

    .line 560
    invoke-static {v9}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    .line 561
    .line 562
    .line 563
    move-result v3

    .line 564
    add-int/lit8 v3, v3, -0xa

    .line 565
    .line 566
    const v4, -0x5be8283b

    .line 567
    .line 568
    .line 569
    invoke-static {v8}, Landroid/text/AndroidCharacter;->getMirror(C)C

    .line 570
    .line 571
    .line 572
    move-result v5

    .line 573
    add-int/2addr v5, v4

    .line 574
    const/high16 v4, -0x1000000

    .line 575
    .line 576
    invoke-static {v9, v9, v9}, Landroid/graphics/Color;->rgb(III)I

    .line 577
    .line 578
    .line 579
    move-result v6

    .line 580
    sub-int/2addr v4, v6

    .line 581
    int-to-byte v4, v4

    .line 582
    invoke-static {v0, v2, v3, v5, v4}, LVa/f0;->g(SIIIB)Ljava/lang/String;

    .line 583
    .line 584
    .line 585
    move-result-object v0

    .line 586
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 587
    .line 588
    .line 589
    move-result-object v0

    .line 590
    const-string v2, "\uef82\u3854\u80e6\u2cb3\u1d1f\u8138\u2b5b\ub3e1\u7b93\u44ba\ucd30\ub471\uf59e\u17a2\ubea3\u1b2c\u38c5\u4842\ue7bb\u7f5d\u3f53\ud247\u1635\uf9a9\uc541\ud68d\ua15f\u6429\u2b5b\ub3e1\uf84c\u6874\uf8a0\u94a3\u9fc9\ua083\u95c4\u4210\u0fe4\u2075\u5a61\u7e9a\u44e1\u604f\u8678\u9cbe\ua9d8\u4755\ue555\uf235"

    .line 591
    .line 592
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    .line 593
    .line 594
    .line 595
    move-result v3

    .line 596
    shr-int/lit8 v3, v3, 0x10

    .line 597
    .line 598
    rsub-int/lit8 v3, v3, 0x31

    .line 599
    .line 600
    invoke-static {v2, v3}, LVa/f0;->i(Ljava/lang/String;I)Ljava/lang/String;

    .line 601
    .line 602
    .line 603
    move-result-object v2

    .line 604
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 605
    .line 606
    .line 607
    move-result-object v2

    .line 608
    invoke-static {v0, v2}, LVa/Ab;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 609
    .line 610
    .line 611
    return-void

    .line 612
    :goto_7
    monitor-exit v5

    .line 613
    throw v0
.end method
