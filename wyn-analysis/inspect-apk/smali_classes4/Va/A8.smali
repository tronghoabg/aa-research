.class public final LVa/A8;
.super LVa/y8;
.source "SourceFile"


# static fields
.field public static e:I = 0x0

.field public static f:I = 0x1


# instance fields
.field public final d:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Ljava/util/HashMap;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LVa/A8;->d:Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Ljava/lang/String;

    .line 30
    .line 31
    iget-object v2, p0, LVa/A8;->d:Ljava/util/HashMap;

    .line 32
    .line 33
    invoke-static {v1}, LVa/t8;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    return-void
.end method

.method public static e(ILjava/lang/String;)Ljava/lang/String;
    .locals 9

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
    sget-object v0, LVa/pb;->D:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    const-wide v1, -0x24201287b7b8c4c6L    # -3.6259731451018274E134

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    :try_start_0
    invoke-static {v1, v2, p1, p0}, LVa/pb;->z(J[CI)[C

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const/4 p1, 0x4

    .line 20
    sput p1, LVa/pb;->C:I

    .line 21
    .line 22
    :goto_0
    sget v3, LVa/pb;->C:I

    .line 23
    .line 24
    array-length v4, p0

    .line 25
    if-ge v3, v4, :cond_0

    .line 26
    .line 27
    add-int/lit8 v4, v3, -0x4

    .line 28
    .line 29
    aget-char v5, p0, v3

    .line 30
    .line 31
    rem-int/lit8 v6, v3, 0x4

    .line 32
    .line 33
    aget-char v6, p0, v6

    .line 34
    .line 35
    xor-int/2addr v5, v6

    .line 36
    int-to-long v5, v5

    .line 37
    int-to-long v7, v4

    .line 38
    mul-long/2addr v7, v1

    .line 39
    xor-long/2addr v5, v7

    .line 40
    long-to-int v4, v5

    .line 41
    int-to-char v4, v4

    .line 42
    aput-char v4, p0, v3

    .line 43
    .line 44
    add-int/lit8 v3, v3, 0x1

    .line 45
    .line 46
    sput v3, LVa/pb;->C:I

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception p0

    .line 50
    goto :goto_1

    .line 51
    :cond_0
    new-instance v1, Ljava/lang/String;

    .line 52
    .line 53
    array-length v2, p0

    .line 54
    sub-int/2addr v2, p1

    .line 55
    invoke-direct {v1, p0, p1, v2}, Ljava/lang/String;-><init>([CII)V

    .line 56
    .line 57
    .line 58
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    return-object v1

    .line 60
    :goto_1
    monitor-exit v0

    .line 61
    throw p0
.end method


# virtual methods
.method public final b(LVa/x8;LVa/y7;)LVa/s8;
    .locals 10

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, LVa/A8;->d:Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    const/4 v4, 0x1

    .line 21
    xor-int/2addr v3, v4

    .line 22
    if-eq v3, v4, :cond_0

    .line 23
    .line 24
    sget v3, LVa/A8;->f:I

    .line 25
    .line 26
    add-int/lit8 v3, v3, 0x15

    .line 27
    .line 28
    rem-int/lit16 v3, v3, 0x80

    .line 29
    .line 30
    sput v3, LVa/A8;->e:I

    .line 31
    .line 32
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    check-cast v3, Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    check-cast v4, LVa/y8;

    .line 43
    .line 44
    invoke-virtual {v4, p1, p2}, LVa/y8;->c(LVa/x8;LVa/y7;)LVa/s8;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    :try_start_0
    invoke-virtual {v4}, LVa/s8;->c()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    invoke-virtual {v0, v3, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    .line 54
    .line 55
    sget v3, LVa/A8;->e:I

    .line 56
    .line 57
    add-int/lit8 v3, v3, 0x17

    .line 58
    .line 59
    rem-int/lit16 v3, v3, 0x80

    .line 60
    .line 61
    sput v3, LVa/A8;->f:I

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :catch_0
    new-instance v5, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 67
    .line 68
    .line 69
    const/4 v6, 0x0

    .line 70
    invoke-static {v6}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    const-string v7, "\u34b1\u34f4\u51d2\u6a9a\u770f\u05e6\u0109\ub427\ud82b\u79d0\u6226\u2ad4\ued15\u44ac\u5124\u3f37\uf26e\u5000\u3c4f\ucc32\u877e\ubf66\u2b3d\ud11f\u9458\u8a7c\u1780\ue674\ub9e1"

    .line 75
    .line 76
    invoke-static {v6, v7}, LVa/A8;->e(ILjava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v4}, LVa/s8;->c()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    .line 95
    .line 96
    .line 97
    move-result-wide v6

    .line 98
    const-wide/16 v8, 0x0

    .line 99
    .line 100
    cmp-long v4, v6, v8

    .line 101
    .line 102
    add-int/lit8 v4, v4, -0x1

    .line 103
    .line 104
    const-string v6, "\u2a2a\u2a0a\u3ce6\u07ba\u0f56\u8fdc\u794d\u3e00\uc6e2\u14af\u1a74\ua0ef\uf3da"

    .line 105
    .line 106
    invoke-static {v4, v6}, LVa/A8;->e(ILjava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    new-instance v4, LVa/j8;

    .line 125
    .line 126
    const/4 v5, 0x0

    .line 127
    invoke-direct {v4, p2, p1, v3, v5}, LVa/j8;-><init>(LVa/y7;LVa/x8;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p2}, LVa/y7;->f()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    invoke-virtual {v4, v3}, LVa/j8;->d(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_0
    new-instance p1, LVa/s8;

    .line 139
    .line 140
    invoke-direct {p1, v0}, LVa/s8;-><init>(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    sget v0, LVa/A8;->f:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x79

    .line 4
    .line 5
    rem-int/lit16 v2, v1, 0x80

    .line 6
    .line 7
    sput v2, LVa/A8;->e:I

    .line 8
    .line 9
    rem-int/lit8 v1, v1, 0x2

    .line 10
    .line 11
    if-nez v1, :cond_4

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    if-ne p0, p1, :cond_0

    .line 15
    .line 16
    add-int/lit8 v2, v2, 0x41

    .line 17
    .line 18
    rem-int/lit16 v2, v2, 0x80

    .line 19
    .line 20
    sput v2, LVa/A8;->f:I

    .line 21
    .line 22
    return v1

    .line 23
    :cond_0
    if-eqz p1, :cond_3

    .line 24
    .line 25
    add-int/lit8 v0, v0, 0x63

    .line 26
    .line 27
    rem-int/lit16 v0, v0, 0x80

    .line 28
    .line 29
    sput v0, LVa/A8;->e:I

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const-class v2, LVa/A8;

    .line 36
    .line 37
    if-eq v2, v0, :cond_1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    check-cast p1, LVa/A8;

    .line 41
    .line 42
    iget-object v0, p0, LVa/A8;->d:Ljava/util/HashMap;

    .line 43
    .line 44
    iget-object p1, p1, LVa/A8;->d:Ljava/util/HashMap;

    .line 45
    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    invoke-interface {v0, p1}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    return p1

    .line 53
    :cond_2
    if-nez p1, :cond_3

    .line 54
    .line 55
    return v1

    .line 56
    :cond_3
    :goto_0
    const/4 p1, 0x0

    .line 57
    return p1

    .line 58
    :cond_4
    const/4 p1, 0x0

    .line 59
    throw p1
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    sget v0, LVa/A8;->e:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x21

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/A8;->f:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    iget-object v2, p0, LVa/A8;->d:Ljava/util/HashMap;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    const/16 v0, 0xc

    .line 17
    .line 18
    div-int/2addr v0, v3

    .line 19
    if-eqz v2, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    if-eqz v2, :cond_2

    .line 23
    .line 24
    :goto_0
    add-int/lit8 v1, v1, 0x2f

    .line 25
    .line 26
    rem-int/lit16 v0, v1, 0x80

    .line 27
    .line 28
    sput v0, LVa/A8;->e:I

    .line 29
    .line 30
    rem-int/lit8 v1, v1, 0x2

    .line 31
    .line 32
    invoke-interface {v2}, Ljava/util/Map;->hashCode()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    const/16 v1, 0x59

    .line 39
    .line 40
    div-int/2addr v1, v3

    .line 41
    :cond_1
    return v0

    .line 42
    :cond_2
    add-int/lit8 v1, v1, 0x63

    .line 43
    .line 44
    rem-int/lit16 v0, v1, 0x80

    .line 45
    .line 46
    sput v0, LVa/A8;->e:I

    .line 47
    .line 48
    rem-int/lit8 v1, v1, 0x2

    .line 49
    .line 50
    if-nez v1, :cond_3

    .line 51
    .line 52
    return v3

    .line 53
    :cond_3
    const/4 v0, 0x0

    .line 54
    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 11

    .line 1
    iget-object v0, p0, LVa/A8;->d:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    sget v0, LVa/A8;->e:I

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x71

    .line 12
    .line 13
    rem-int/lit16 v0, v0, 0x80

    .line 14
    .line 15
    sput v0, LVa/A8;->f:I

    .line 16
    .line 17
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    shr-int/lit8 v0, v0, 0x10

    .line 22
    .line 23
    const-string v1, "\ud28c\ud2f7\ufd0b\uc64c\ufe2c\ud99f"

    .line 24
    .line 25
    invoke-static {v0, v1}, LVa/A8;->e(ILjava/lang/String;)Ljava/lang/String;

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
    new-instance v1, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    invoke-static {v2, v2, v2}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    const-string v4, "\ueeaf\ueed4\uf924\uc23e\u0cff\u08fd"

    .line 45
    .line 46
    invoke-static {v3, v4}, LVa/A8;->e(ILjava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    sget v4, LVa/A8;->f:I

    .line 66
    .line 67
    const/4 v5, 0x1

    .line 68
    add-int/2addr v4, v5

    .line 69
    rem-int/lit16 v4, v4, 0x80

    .line 70
    .line 71
    sput v4, LVa/A8;->e:I

    .line 72
    .line 73
    move v4, v5

    .line 74
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    if-eqz v6, :cond_3

    .line 79
    .line 80
    sget v6, LVa/A8;->e:I

    .line 81
    .line 82
    add-int/lit8 v6, v6, 0x3b

    .line 83
    .line 84
    rem-int/lit16 v7, v6, 0x80

    .line 85
    .line 86
    sput v7, LVa/A8;->f:I

    .line 87
    .line 88
    rem-int/lit8 v6, v6, 0x2

    .line 89
    .line 90
    if-eqz v6, :cond_2

    .line 91
    .line 92
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    check-cast v6, Ljava/lang/String;

    .line 97
    .line 98
    if-nez v4, :cond_1

    .line 99
    .line 100
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    shr-int/lit8 v4, v4, 0x16

    .line 105
    .line 106
    const-string v7, "\ud62f\ud603\u9019\uab03\u1dbe\u0f19"

    .line 107
    .line 108
    invoke-static {v4, v7}, LVa/A8;->e(ILjava/lang/String;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    :cond_1
    const-string v4, "\u16f2\u16d0\u47b1\ua45f\u5afc"

    .line 120
    .line 121
    invoke-static {v2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 122
    .line 123
    .line 124
    move-result v7

    .line 125
    invoke-static {v7, v4}, LVa/A8;->e(ILjava/lang/String;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    .line 140
    .line 141
    .line 142
    move-result-wide v7

    .line 143
    const-wide/16 v9, -0x1

    .line 144
    .line 145
    cmp-long v4, v7, v9

    .line 146
    .line 147
    rsub-int/lit8 v4, v4, 0x1

    .line 148
    .line 149
    const-string v7, "\u35e9\u35cb\u73d2\u48d2\ue689\u90dd\ub2dc"

    .line 150
    .line 151
    invoke-static {v4, v7}, LVa/A8;->e(ILjava/lang/String;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    move v4, v2

    .line 170
    goto :goto_0

    .line 171
    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    check-cast v0, Ljava/lang/String;

    .line 176
    .line 177
    const/4 v0, 0x0

    .line 178
    throw v0

    .line 179
    :cond_3
    const-string v0, ""

    .line 180
    .line 181
    const/16 v3, 0x30

    .line 182
    .line 183
    invoke-static {v0, v3, v2}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    .line 184
    .line 185
    .line 186
    move-result v0

    .line 187
    rsub-int/lit8 v0, v0, -0x1

    .line 188
    .line 189
    const-string v2, "\u4cb5\u4c95\ue01f\udb58\u0b3b\u02c3"

    .line 190
    .line 191
    invoke-static {v0, v2}, LVa/A8;->e(ILjava/lang/String;)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    return-object v0
.end method
