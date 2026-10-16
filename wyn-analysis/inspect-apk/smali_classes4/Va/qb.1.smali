.class public abstract LVa/qb;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Lorg/json/JSONObject;

.field public static b:Lorg/json/JSONObject;

.field public static final c:[C

.field public static d:I

.field public static e:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0xc7

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LVa/qb;->c:[C

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    sput-object v0, LVa/qb;->a:Lorg/json/JSONObject;

    .line 12
    .line 13
    const/16 v0, 0x63

    .line 14
    .line 15
    rem-int/lit16 v0, v0, 0x80

    .line 16
    .line 17
    sput v0, LVa/qb;->e:I

    .line 18
    .line 19
    return-void

    .line 20
    nop

    .line 21
    :array_0
    .array-data 2
        0x8es
        0x32s
        0x6ds
        0x6fs
        0x66s
        0x64s
        0x5ds
        0x64s
        0x6es
        0x6as
        0x6fs
        0x5bs
        0x3as
        0x6cs
        0x59s
        0x62s
        0x73s
        0x69s
        0x69s
        0x6bs
        0x70s
        0x4bs
        0x43s
        0x6as
        0x6bs
        0x6es
        0x74s
        0x6cs
        0x66s
        0x43s
        0x47s
        0x6bs
        0x44s
        0x49s
        0x70s
        0x70s
        0x72s
        0x5bs
        0x5bs
        0x6bs
        0x66s
        0x6as
        0x67s
        0x57s
        0x62s
        0x73s
        0x69s
        0x69s
        0x6bs
        0x70s
        0x4bs
        0x46s
        0x6es
        0x70s
        0x6cs
        0x43s
        0x49s
        0x6bs
        0x66s
        0x6ds
        0x32s
        0x6fs
        0x71s
        0x6es
        0x49s
        0x47s
        0x69s
        0x65s
        0x6bs
        0x6as
        0x6bs
        0x49s
        0x43s
        0x6as
        0x6bs
        0x6es
        0x74s
        0x6cs
        0x6cs
        0x49s
        0x49s
        0x70s
        0x70s
        0x72s
        0x5bs
        0x36s
        0x6ds
        0x71s
        0x6bs
        0x92s
        0x11fs
        0x11bs
        0x11es
        0x5es
        0xd3s
        0xeas
        0xe8s
        0xe8s
        0xc1s
        0xbbs
        0xdes
        0xe4s
        0xecs
        0xe6s
        0xe3s
        0xe2s
        0xbbs
        0xbes
        0xe1s
        0xe1s
        0xe6s
        0xe8s
        0xeds
        0xc4s
        0xc2s
        0xecs
        0xe2s
        0xdcs
        0xdes
        0xc7s
        0xa5s
        0x38s
        0x71s
        0x75s
        0x72s
        0x86s
        0x110s
        0x112s
        0x113s
        0x31s
        0x69s
        0x6es
        0x6es
        0x69s
        0x64s
        0x6bs
        0x6es
        0x6fs
        0x6fs
        0x6es
        0x76s
        0x38s
        0x6cs
        0x6bs
        0x6es
        0x69s
        0x3as
        0x6bs
        0x67s
        0x6bs
        0x6cs
        0x36s
        0x67s
        0x6bs
        0x72s
        0x38s
        0x71s
        0x6as
        0x67s
        0x79s
        0xecs
        0xeds
        0xf3s
        0x4as
        0x95s
        0x94s
        0x99s
        0x36s
        0x67s
        0x6as
        0x71s
        0x96s
        0x12es
        0x128s
        0x125s
        0x77s
        0xf5s
        0xf5s
        0xecs
        0xfds
        0xf1s
        0x102s
        0xfes
        0x38s
        0x6as
        0x64s
        0x66s
        0x67s
        0x6es
        0x70s
        0x93s
        0x130s
        0x137s
        0x133s
        0x8ds
        0x117s
        0x11cs
        0x11cs
        0x117s
    .end array-data
.end method

.method public static declared-synchronized a()Lorg/json/JSONObject;
    .locals 4

    .line 1
    const-class v0, LVa/qb;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget v1, LVa/qb;->d:I

    .line 5
    .line 6
    add-int/lit8 v1, v1, 0x43

    .line 7
    .line 8
    rem-int/lit16 v2, v1, 0x80

    .line 9
    .line 10
    sput v2, LVa/qb;->e:I

    .line 11
    .line 12
    rem-int/lit8 v1, v1, 0x2

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    sget-object v1, LVa/qb;->b:Lorg/json/JSONObject;

    .line 17
    .line 18
    add-int/lit8 v2, v2, 0x47

    .line 19
    .line 20
    rem-int/lit16 v3, v2, 0x80

    .line 21
    .line 22
    sput v3, LVa/qb;->d:I

    .line 23
    .line 24
    rem-int/lit8 v2, v2, 0x2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 25
    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    const/16 v2, 0x39

    .line 29
    .line 30
    :try_start_1
    div-int/lit8 v2, v2, 0x0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31
    .line 32
    monitor-exit v0

    .line 33
    return-object v1

    .line 34
    :catchall_0
    move-exception v1

    .line 35
    :try_start_2
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 36
    :catchall_1
    move-exception v1

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    monitor-exit v0

    .line 39
    return-object v1

    .line 40
    :cond_1
    const/4 v1, 0x0

    .line 41
    :try_start_3
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 42
    :catchall_2
    move-exception v1

    .line 43
    :try_start_4
    throw v1

    .line 44
    :goto_0
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 45
    throw v1
.end method

.method public static declared-synchronized b()Lorg/json/JSONObject;
    .locals 6

    .line 1
    const-class v0, LVa/qb;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget v1, LVa/qb;->e:I

    .line 5
    .line 6
    add-int/lit8 v1, v1, 0x65

    .line 7
    .line 8
    rem-int/lit16 v2, v1, 0x80

    .line 9
    .line 10
    sput v2, LVa/qb;->d:I

    .line 11
    .line 12
    rem-int/lit8 v1, v1, 0x2

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    sget-object v1, LVa/qb;->a:Lorg/json/JSONObject;

    .line 17
    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    new-instance v1, Lorg/json/JSONObject;

    .line 21
    .line 22
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v1, LVa/qb;->a:Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    :try_start_1
    const-string v2, "\u0000"

    .line 28
    .line 29
    const/4 v3, 0x1

    .line 30
    const/4 v4, 0x0

    .line 31
    const/16 v5, 0xa5

    .line 32
    .line 33
    filled-new-array {v4, v3, v5, v3}, [I

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-static {v2, v4, v3}, LVa/qb;->j(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    const/4 v4, -0x1

    .line 46
    invoke-virtual {v1, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 47
    .line 48
    .line 49
    sget-object v1, LVa/qb;->a:Lorg/json/JSONObject;

    .line 50
    .line 51
    const-string v2, "\u7351\u4edd"

    .line 52
    .line 53
    const-string v5, ""

    .line 54
    .line 55
    invoke-static {v5}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    sub-int/2addr v3, v5

    .line 60
    invoke-static {v3, v2}, LVa/qb;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {v1, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 69
    .line 70
    .line 71
    :try_start_2
    sget v1, LVa/qb;->e:I

    .line 72
    .line 73
    add-int/lit8 v1, v1, 0x43

    .line 74
    .line 75
    rem-int/lit16 v1, v1, 0x80

    .line 76
    .line 77
    sput v1, LVa/qb;->d:I

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :catchall_0
    move-exception v1

    .line 81
    goto :goto_1

    .line 82
    :catch_0
    :cond_0
    :goto_0
    sget-object v1, LVa/qb;->a:Lorg/json/JSONObject;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 83
    .line 84
    monitor-exit v0

    .line 85
    return-object v1

    .line 86
    :cond_1
    const/4 v1, 0x0

    .line 87
    :try_start_3
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 88
    :catchall_1
    move-exception v1

    .line 89
    :try_start_4
    throw v1

    .line 90
    :goto_1
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 91
    throw v1
.end method

.method public static c()Lorg/json/JSONObject;
    .locals 2

    .line 1
    sget v0, LVa/qb;->d:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x49

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/qb;->e:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-static {}, LVa/qb;->a()Lorg/json/JSONObject;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, LVa/Ab;->u(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0

    .line 22
    :cond_0
    invoke-static {}, LVa/qb;->a()Lorg/json/JSONObject;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v0}, LVa/Ab;->u(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 27
    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    throw v0
.end method

.method public static d()Lorg/json/JSONObject;
    .locals 3

    .line 1
    sget v0, LVa/qb;->d:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x2b

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/qb;->e:I

    .line 8
    .line 9
    invoke-static {}, LVa/qb;->b()Lorg/json/JSONObject;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, LVa/Ab;->u(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget v1, LVa/qb;->e:I

    .line 18
    .line 19
    add-int/lit8 v1, v1, 0x47

    .line 20
    .line 21
    rem-int/lit16 v2, v1, 0x80

    .line 22
    .line 23
    sput v2, LVa/qb;->d:I

    .line 24
    .line 25
    rem-int/lit8 v1, v1, 0x2

    .line 26
    .line 27
    if-nez v1, :cond_0

    .line 28
    .line 29
    return-object v0

    .line 30
    :cond_0
    const/4 v0, 0x0

    .line 31
    throw v0
.end method

.method public static e(II)Z
    .locals 6

    .line 1
    sget v0, LVa/qb;->e:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0xd

    .line 4
    .line 5
    rem-int/lit16 v2, v1, 0x80

    .line 6
    .line 7
    sput v2, LVa/qb;->d:I

    .line 8
    .line 9
    rem-int/lit8 v1, v1, 0x2

    .line 10
    .line 11
    if-nez v1, :cond_6

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    if-ltz p0, :cond_4

    .line 15
    .line 16
    if-ltz p1, :cond_4

    .line 17
    .line 18
    add-int/lit8 v0, v0, 0x4b

    .line 19
    .line 20
    rem-int/lit16 v2, v0, 0x80

    .line 21
    .line 22
    sput v2, LVa/qb;->d:I

    .line 23
    .line 24
    rem-int/lit8 v0, v0, 0x2

    .line 25
    .line 26
    const/4 v2, 0x1

    .line 27
    const/16 v3, 0xa5

    .line 28
    .line 29
    const-string v4, "\u0000"

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    invoke-static {}, LVa/qb;->d()Lorg/json/JSONObject;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    filled-new-array {v1, v2, v3, v2}, [I

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-static {v4, v3, v1}, LVa/qb;->j(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    :goto_0
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    goto :goto_1

    .line 54
    :cond_0
    invoke-static {}, LVa/qb;->d()Lorg/json/JSONObject;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    filled-new-array {v1, v2, v3, v2}, [I

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-static {v4, v3, v2}, LVa/qb;->j(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    goto :goto_0

    .line 67
    :goto_1
    sget v3, LVa/qb;->e:I

    .line 68
    .line 69
    add-int/lit8 v4, v3, 0x45

    .line 70
    .line 71
    rem-int/lit16 v5, v4, 0x80

    .line 72
    .line 73
    sput v5, LVa/qb;->d:I

    .line 74
    .line 75
    rem-int/lit8 v4, v4, 0x2

    .line 76
    .line 77
    if-eqz v4, :cond_1

    .line 78
    .line 79
    const/16 v4, 0xb

    .line 80
    .line 81
    div-int/2addr v4, v1

    .line 82
    :cond_1
    if-gt p0, v0, :cond_4

    .line 83
    .line 84
    add-int/lit8 v3, v3, 0x11

    .line 85
    .line 86
    rem-int/lit16 p0, v3, 0x80

    .line 87
    .line 88
    sput p0, LVa/qb;->d:I

    .line 89
    .line 90
    rem-int/lit8 v3, v3, 0x2

    .line 91
    .line 92
    const-string p0, "\u7351\u4edd"

    .line 93
    .line 94
    const-string v0, ""

    .line 95
    .line 96
    if-eqz v3, :cond_2

    .line 97
    .line 98
    invoke-static {}, LVa/qb;->d()Lorg/json/JSONObject;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    invoke-static {v0, v0}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    rsub-int/lit8 v0, v0, 0x1

    .line 107
    .line 108
    :goto_2
    invoke-static {v0, p0}, LVa/qb;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    invoke-virtual {p0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    invoke-virtual {v3, p0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 117
    .line 118
    .line 119
    move-result p0

    .line 120
    goto :goto_3

    .line 121
    :cond_2
    invoke-static {}, LVa/qb;->d()Lorg/json/JSONObject;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    invoke-static {v0, v0}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    add-int/2addr v0, v2

    .line 130
    goto :goto_2

    .line 131
    :goto_3
    if-gt p1, p0, :cond_4

    .line 132
    .line 133
    sget p0, LVa/qb;->d:I

    .line 134
    .line 135
    add-int/lit8 p0, p0, 0x65

    .line 136
    .line 137
    rem-int/lit16 p1, p0, 0x80

    .line 138
    .line 139
    sput p1, LVa/qb;->e:I

    .line 140
    .line 141
    rem-int/lit8 p0, p0, 0x2

    .line 142
    .line 143
    if-nez p0, :cond_3

    .line 144
    .line 145
    return v1

    .line 146
    :cond_3
    return v2

    .line 147
    :cond_4
    sget p0, LVa/qb;->e:I

    .line 148
    .line 149
    add-int/lit8 p0, p0, 0x5d

    .line 150
    .line 151
    rem-int/lit16 p1, p0, 0x80

    .line 152
    .line 153
    sput p1, LVa/qb;->d:I

    .line 154
    .line 155
    rem-int/lit8 p0, p0, 0x2

    .line 156
    .line 157
    if-eqz p0, :cond_5

    .line 158
    .line 159
    const/16 p0, 0x8

    .line 160
    .line 161
    div-int/2addr p0, v1

    .line 162
    :cond_5
    return v1

    .line 163
    :cond_6
    const/4 p0, 0x0

    .line 164
    throw p0
.end method

.method public static f(ILjava/lang/String;)Ljava/lang/String;
    .locals 11

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
    sget-object v0, LVa/Ab;->F:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    array-length v1, p1

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
    array-length v5, p1

    .line 22
    if-ge v4, v5, :cond_1

    .line 23
    .line 24
    aget-char v5, p1, v4

    .line 25
    .line 26
    aput-char v5, v3, v2

    .line 27
    .line 28
    add-int/lit8 v4, v4, 0x1

    .line 29
    .line 30
    aget-char v4, p1, v4

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
    add-int/lit16 v10, v10, 0x26de

    .line 52
    .line 53
    xor-int/2addr v9, v10

    .line 54
    ushr-int/lit8 v10, v8, 0x5

    .line 55
    .line 56
    add-int/lit16 v10, v10, 0x3c22

    .line 57
    .line 58
    xor-int/2addr v9, v10

    .line 59
    sub-int/2addr v7, v9

    .line 60
    int-to-char v7, v7

    .line 61
    aput-char v7, v3, v5

    .line 62
    .line 63
    add-int v9, v7, v4

    .line 64
    .line 65
    shl-int/lit8 v10, v7, 0x4

    .line 66
    .line 67
    add-int/lit16 v10, v10, 0x3a38

    .line 68
    .line 69
    xor-int/2addr v9, v10

    .line 70
    ushr-int/lit8 v7, v7, 0x5

    .line 71
    .line 72
    add-int/lit16 v7, v7, 0x4ab9

    .line 73
    .line 74
    xor-int/2addr v7, v9

    .line 75
    sub-int/2addr v8, v7

    .line 76
    int-to-char v7, v8

    .line 77
    aput-char v7, v3, v2

    .line 78
    .line 79
    const v7, 0x9e37

    .line 80
    .line 81
    .line 82
    sub-int/2addr v4, v7

    .line 83
    add-int/lit8 v6, v6, 0x1

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :catchall_0
    move-exception p0

    .line 87
    goto :goto_2

    .line 88
    :cond_0
    sget v4, LVa/Ab;->E:I

    .line 89
    .line 90
    aget-char v6, v3, v2

    .line 91
    .line 92
    aput-char v6, v1, v4

    .line 93
    .line 94
    add-int/lit8 v6, v4, 0x1

    .line 95
    .line 96
    aget-char v5, v3, v5

    .line 97
    .line 98
    aput-char v5, v1, v6

    .line 99
    .line 100
    add-int/lit8 v4, v4, 0x2

    .line 101
    .line 102
    sput v4, LVa/Ab;->E:I

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_1
    new-instance p1, Ljava/lang/String;

    .line 106
    .line 107
    invoke-direct {p1, v1, v2, p0}, Ljava/lang/String;-><init>([CII)V

    .line 108
    .line 109
    .line 110
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 111
    return-object p1

    .line 112
    :goto_2
    monitor-exit v0

    .line 113
    throw p0
.end method

.method public static declared-synchronized g(Landroid/app/Activity;)V
    .locals 2

    .line 1
    const-class v0, LVa/qb;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget v1, LVa/qb;->e:I

    .line 5
    .line 6
    add-int/lit8 v1, v1, 0x71

    .line 7
    .line 8
    rem-int/lit16 v1, v1, 0x80

    .line 9
    .line 10
    sput v1, LVa/qb;->d:I

    .line 11
    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-static {p0}, LVa/qb;->i(Landroid/content/Context;)V

    .line 19
    .line 20
    .line 21
    sget p0, LVa/qb;->e:I

    .line 22
    .line 23
    add-int/lit8 p0, p0, 0x43

    .line 24
    .line 25
    rem-int/lit16 p0, p0, 0x80

    .line 26
    .line 27
    sput p0, LVa/qb;->d:I

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p0

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    :goto_0
    sget p0, LVa/qb;->e:I

    .line 33
    .line 34
    add-int/lit8 p0, p0, 0x43

    .line 35
    .line 36
    rem-int/lit16 v1, p0, 0x80

    .line 37
    .line 38
    sput v1, LVa/qb;->d:I

    .line 39
    .line 40
    rem-int/lit8 p0, p0, 0x2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    if-eqz p0, :cond_1

    .line 43
    .line 44
    const/16 p0, 0xf

    .line 45
    .line 46
    :try_start_1
    div-int/lit8 p0, p0, 0x0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 47
    .line 48
    monitor-exit v0

    .line 49
    return-void

    .line 50
    :catchall_1
    move-exception p0

    .line 51
    :try_start_2
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 52
    :cond_1
    monitor-exit v0

    .line 53
    return-void

    .line 54
    :goto_1
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 55
    throw p0
.end method

.method public static h(Landroid/content/Context;Lorg/json/JSONObject;Z)V
    .locals 11

    .line 1
    const-string v0, "\u0000\u0001\u0001\u0001"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    :try_start_0
    const-string v3, "\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"

    .line 6
    .line 7
    const/16 v4, 0x81

    .line 8
    .line 9
    const/16 v5, 0xc

    .line 10
    .line 11
    filled-new-array {v4, v5, v2, v2}, [I

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    invoke-static {v3, v4, v2}, LVa/qb;->j(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {p0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    check-cast v3, Landroid/net/ConnectivityManager;

    .line 28
    .line 29
    const-string v4, "\u0000\u0000\u0001\u0001\u0001"

    .line 30
    .line 31
    const/16 v5, 0x8d

    .line 32
    .line 33
    const/4 v6, 0x5

    .line 34
    filled-new-array {v5, v6, v2, v2}, [I

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    invoke-static {v4, v5, v2}, LVa/qb;->j(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-virtual {p0, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    check-cast p0, Landroid/telephony/TelephonyManager;

    .line 51
    .line 52
    invoke-virtual {v3, v2}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;

    .line 53
    .line 54
    .line 55
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    if-eqz v3, :cond_0

    .line 57
    .line 58
    sget v4, LVa/qb;->d:I

    .line 59
    .line 60
    add-int/lit8 v4, v4, 0x5b

    .line 61
    .line 62
    rem-int/lit16 v4, v4, 0x80

    .line 63
    .line 64
    sput v4, LVa/qb;->e:I

    .line 65
    .line 66
    :try_start_1
    const-string v4, "\u2bee\uf8a3\u5715\ue27e"

    .line 67
    .line 68
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 69
    .line 70
    .line 71
    move-result-wide v7

    .line 72
    const-wide/16 v9, 0x0

    .line 73
    .line 74
    cmp-long v5, v7, v9

    .line 75
    .line 76
    rsub-int/lit8 v5, v5, 0x5

    .line 77
    .line 78
    invoke-static {v5, v4}, LVa/qb;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    invoke-virtual {v3}, Landroid/net/NetworkInfo;->getState()Landroid/net/NetworkInfo$State;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    invoke-virtual {p1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v3}, Landroid/net/NetworkInfo;->getState()Landroid/net/NetworkInfo$State;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    sget-object v5, Landroid/net/NetworkInfo$State;->CONNECTED:Landroid/net/NetworkInfo$State;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 98
    .line 99
    if-ne v4, v5, :cond_0

    .line 100
    .line 101
    sget v4, LVa/qb;->e:I

    .line 102
    .line 103
    add-int/lit8 v4, v4, 0x71

    .line 104
    .line 105
    rem-int/lit16 v4, v4, 0x80

    .line 106
    .line 107
    sput v4, LVa/qb;->d:I

    .line 108
    .line 109
    :try_start_2
    const-string v4, "\u0000\u0000\u0001\u0000\u0001"

    .line 110
    .line 111
    const/16 v5, 0x92

    .line 112
    .line 113
    const/4 v7, 0x3

    .line 114
    filled-new-array {v5, v6, v2, v7}, [I

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    invoke-static {v4, v5, v1}, LVa/qb;->j(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    invoke-virtual {v3}, Landroid/net/NetworkInfo;->getType()I

    .line 127
    .line 128
    .line 129
    move-result v5

    .line 130
    invoke-virtual {p1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 131
    .line 132
    .line 133
    const-string v4, "\u0001\u0001\u0000\u0000"

    .line 134
    .line 135
    const/16 v5, 0x97

    .line 136
    .line 137
    const/4 v6, 0x4

    .line 138
    filled-new-array {v5, v6, v2, v2}, [I

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    invoke-static {v4, v5, v2}, LVa/qb;->j(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    invoke-virtual {v3}, Landroid/net/NetworkInfo;->getTypeName()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v5

    .line 154
    invoke-virtual {p1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 155
    .line 156
    .line 157
    const-string v4, "\u2bee\uf8a3\ube2c\u07ab\uf3c1\u67c8"

    .line 158
    .line 159
    invoke-static {v2, v2, v2}, Landroid/graphics/Color;->rgb(III)I

    .line 160
    .line 161
    .line 162
    move-result v5

    .line 163
    const v8, -0xfffffb

    .line 164
    .line 165
    .line 166
    sub-int/2addr v8, v5

    .line 167
    invoke-static {v8, v4}, LVa/qb;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v4

    .line 171
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v4

    .line 175
    invoke-virtual {v3}, Landroid/net/NetworkInfo;->getSubtype()I

    .line 176
    .line 177
    .line 178
    move-result v5

    .line 179
    invoke-virtual {p1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 180
    .line 181
    .line 182
    const/16 v4, 0x9b

    .line 183
    .line 184
    filled-new-array {v4, v6, v2, v2}, [I

    .line 185
    .line 186
    .line 187
    move-result-object v4

    .line 188
    invoke-static {v0, v4, v1}, LVa/qb;->j(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v4

    .line 192
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v4

    .line 196
    invoke-virtual {v3}, Landroid/net/NetworkInfo;->getSubtypeName()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v3

    .line 200
    invoke-virtual {p1, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 201
    .line 202
    .line 203
    const-string v3, "\u2bee\uf8a3\uce5d\ue3ee"

    .line 204
    .line 205
    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    .line 206
    .line 207
    .line 208
    move-result v4

    .line 209
    int-to-byte v4, v4

    .line 210
    sub-int/2addr v7, v4

    .line 211
    invoke-static {v7, v3}, LVa/qb;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v3

    .line 215
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getNetworkOperator()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v4

    .line 223
    invoke-virtual {p1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 224
    .line 225
    .line 226
    const/16 v3, 0x9f

    .line 227
    .line 228
    const/16 v4, 0x85

    .line 229
    .line 230
    filled-new-array {v3, v6, v4, v2}, [I

    .line 231
    .line 232
    .line 233
    move-result-object v3

    .line 234
    invoke-static {v0, v3, v2}, LVa/qb;->j(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v3

    .line 238
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v3

    .line 242
    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getNetworkOperatorName()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v4

    .line 246
    invoke-virtual {p1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 247
    .line 248
    .line 249
    const-string v3, "\u0001\u0000\u0001\u0001"

    .line 250
    .line 251
    const/16 v4, 0xa3

    .line 252
    .line 253
    const/16 v5, 0x32

    .line 254
    .line 255
    filled-new-array {v4, v6, v5, v2}, [I

    .line 256
    .line 257
    .line 258
    move-result-object v4

    .line 259
    invoke-static {v3, v4, v1}, LVa/qb;->j(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v3

    .line 263
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v3

    .line 267
    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getNetworkCountryIso()Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v4

    .line 271
    invoke-virtual {p1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 272
    .line 273
    .line 274
    if-eqz p2, :cond_0

    .line 275
    .line 276
    const-string p2, "\u0001\u0001\u0001\u0000"

    .line 277
    .line 278
    const/16 v3, 0xa7

    .line 279
    .line 280
    filled-new-array {v3, v6, v2, v2}, [I

    .line 281
    .line 282
    .line 283
    move-result-object v3

    .line 284
    invoke-static {p2, v3, v2}, LVa/qb;->j(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object p2

    .line 288
    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object p2

    .line 292
    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getSimOperator()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v3

    .line 296
    invoke-virtual {p1, p2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 297
    .line 298
    .line 299
    const/16 p2, 0xab

    .line 300
    .line 301
    const/16 v3, 0xbe

    .line 302
    .line 303
    filled-new-array {p2, v6, v3, v2}, [I

    .line 304
    .line 305
    .line 306
    move-result-object p2

    .line 307
    invoke-static {v0, p2, v1}, LVa/qb;->j(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object p2

    .line 311
    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object p2

    .line 315
    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getSimOperatorName()Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object p0

    .line 319
    invoke-virtual {p1, p2, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 320
    .line 321
    .line 322
    sget p0, LVa/qb;->e:I

    .line 323
    .line 324
    add-int/lit8 p0, p0, 0x43

    .line 325
    .line 326
    rem-int/lit16 p0, p0, 0x80

    .line 327
    .line 328
    sput p0, LVa/qb;->d:I

    .line 329
    .line 330
    return-void

    .line 331
    :catchall_0
    move-exception p0

    .line 332
    goto :goto_0

    .line 333
    :cond_0
    return-void

    .line 334
    :goto_0
    const/16 p1, 0xb

    .line 335
    .line 336
    const/16 p2, 0xa

    .line 337
    .line 338
    filled-new-array {v1, p1, v2, p2}, [I

    .line 339
    .line 340
    .line 341
    move-result-object p1

    .line 342
    const-string p2, "\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001"

    .line 343
    .line 344
    invoke-static {p2, p1, v2}, LVa/qb;->j(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object p1

    .line 348
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object p1

    .line 352
    invoke-static {v2, v2}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 353
    .line 354
    .line 355
    move-result p2

    .line 356
    add-int/lit8 p2, p2, 0x21

    .line 357
    .line 358
    const-string v0, "\ua7a6\uf206\uf111\u978e\u5d2a\u56a0\ueb07\u7e3b\u001b\u6266\u4e54\u5147\ubb9e\u307a\uc440\u3a1c\ua76a\u14d7\uda6f\uc327\u4cdf\u0c5c\u49b1\ua927\u6eaa\u5591\ud234\u167c\u0a4c\ufb91\ub1bc\u8771\u0ebf\u13c7"

    .line 359
    .line 360
    invoke-static {p2, v0}, LVa/qb;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object p2

    .line 364
    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object p2

    .line 368
    invoke-static {p1, p2, p0}, LVa/Ab;->R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 369
    .line 370
    .line 371
    return-void
.end method

.method public static declared-synchronized i(Landroid/content/Context;)V
    .locals 12

    .line 1
    const-class v0, LVa/qb;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget v1, LVa/qb;->d:I

    .line 5
    .line 6
    add-int/lit8 v1, v1, 0x71

    .line 7
    .line 8
    rem-int/lit16 v1, v1, 0x80

    .line 9
    .line 10
    sput v1, LVa/qb;->e:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 11
    .line 12
    if-eqz p0, :cond_5

    .line 13
    .line 14
    const/16 v1, 0xa

    .line 15
    .line 16
    const/16 v2, 0xb

    .line 17
    .line 18
    const/4 v3, 0x1

    .line 19
    const/4 v4, 0x0

    .line 20
    :try_start_1
    const-string v5, "\u9526\u3743\uf8bc\ua4ac\u564a\u663e"

    .line 21
    .line 22
    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    .line 23
    .line 24
    .line 25
    move-result v6

    .line 26
    shr-int/lit8 v6, v6, 0x8

    .line 27
    .line 28
    rsub-int/lit8 v6, v6, 0x6

    .line 29
    .line 30
    invoke-static {v6, v5}, LVa/qb;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    invoke-virtual {p0, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    check-cast v5, Landroid/view/WindowManager;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 43
    .line 44
    const/4 v6, 0x0

    .line 45
    if-eqz v5, :cond_2

    .line 46
    .line 47
    :try_start_2
    sget v7, LVa/qb;->d:I

    .line 48
    .line 49
    add-int/lit8 v7, v7, 0x63

    .line 50
    .line 51
    rem-int/lit16 v7, v7, 0x80

    .line 52
    .line 53
    sput v7, LVa/qb;->e:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 54
    .line 55
    :try_start_3
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 56
    .line 57
    const/16 v8, 0x1e

    .line 58
    .line 59
    if-lt v7, v8, :cond_2

    .line 60
    .line 61
    :try_start_4
    sget v7, LVa/qb;->e:I

    .line 62
    .line 63
    add-int/lit8 v7, v7, 0xf

    .line 64
    .line 65
    rem-int/lit16 v8, v7, 0x80

    .line 66
    .line 67
    sput v8, LVa/qb;->d:I

    .line 68
    .line 69
    rem-int/lit8 v7, v7, 0x2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 70
    .line 71
    if-eqz v7, :cond_0

    .line 72
    .line 73
    :try_start_5
    invoke-static {v5}, LA7/N0;->x(Landroid/view/WindowManager;)Landroid/view/WindowMetrics;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    invoke-static {v5}, LA7/N0;->g(Landroid/view/WindowMetrics;)Landroid/graphics/Rect;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    const/16 v7, 0x9

    .line 82
    .line 83
    div-int/2addr v7, v4

    .line 84
    if-eqz v5, :cond_2

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :catchall_0
    move-exception v5

    .line 88
    goto :goto_1

    .line 89
    :cond_0
    invoke-static {v5}, LA7/N0;->x(Landroid/view/WindowManager;)Landroid/view/WindowMetrics;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    invoke-static {v5}, LA7/N0;->g(Landroid/view/WindowMetrics;)Landroid/graphics/Rect;

    .line 94
    .line 95
    .line 96
    move-result-object v5
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 97
    if-eqz v5, :cond_2

    .line 98
    .line 99
    :goto_0
    :try_start_6
    sget v7, LVa/qb;->d:I

    .line 100
    .line 101
    add-int/lit8 v7, v7, 0x37

    .line 102
    .line 103
    rem-int/lit16 v8, v7, 0x80

    .line 104
    .line 105
    sput v8, LVa/qb;->e:I

    .line 106
    .line 107
    rem-int/lit8 v7, v7, 0x2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 108
    .line 109
    if-eqz v7, :cond_1

    .line 110
    .line 111
    :try_start_7
    invoke-virtual {v5}, Landroid/graphics/Rect;->height()I

    .line 112
    .line 113
    .line 114
    move-result v7

    .line 115
    invoke-virtual {v5}, Landroid/graphics/Rect;->width()I

    .line 116
    .line 117
    .line 118
    move-result v5

    .line 119
    invoke-static {v7, v5}, LVa/qb;->k(II)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 120
    .line 121
    .line 122
    monitor-exit v0

    .line 123
    return-void

    .line 124
    :cond_1
    :try_start_8
    invoke-virtual {v5}, Landroid/graphics/Rect;->height()I

    .line 125
    .line 126
    .line 127
    move-result v7

    .line 128
    invoke-virtual {v5}, Landroid/graphics/Rect;->width()I

    .line 129
    .line 130
    .line 131
    move-result v5

    .line 132
    invoke-static {v7, v5}, LVa/qb;->k(II)V

    .line 133
    .line 134
    .line 135
    throw v6
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 136
    :catchall_1
    move-exception p0

    .line 137
    goto/16 :goto_5

    .line 138
    .line 139
    :goto_1
    :try_start_9
    const-string v7, "\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001"

    .line 140
    .line 141
    filled-new-array {v3, v2, v4, v1}, [I

    .line 142
    .line 143
    .line 144
    move-result-object v8

    .line 145
    invoke-static {v7, v8, v4}, LVa/qb;->j(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v7

    .line 149
    invoke-virtual {v7}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v7

    .line 153
    const-string v8, "\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001"

    .line 154
    .line 155
    const/16 v9, 0xc

    .line 156
    .line 157
    const/16 v10, 0x30

    .line 158
    .line 159
    const/16 v11, 0x1a

    .line 160
    .line 161
    filled-new-array {v9, v10, v4, v11}, [I

    .line 162
    .line 163
    .line 164
    move-result-object v9

    .line 165
    invoke-static {v8, v9, v3}, LVa/qb;->j(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v8

    .line 169
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v8

    .line 173
    invoke-static {v7, v8, v5}, LVa/Ab;->R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 174
    .line 175
    .line 176
    goto :goto_2

    .line 177
    :catchall_2
    move-exception p0

    .line 178
    goto :goto_3

    .line 179
    :cond_2
    :goto_2
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 180
    .line 181
    .line 182
    move-result-object p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 183
    if-eqz p0, :cond_5

    .line 184
    .line 185
    :try_start_a
    sget v5, LVa/qb;->e:I

    .line 186
    .line 187
    add-int/lit8 v5, v5, 0x31

    .line 188
    .line 189
    rem-int/lit16 v5, v5, 0x80

    .line 190
    .line 191
    sput v5, LVa/qb;->d:I
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 192
    .line 193
    :try_start_b
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    sget v5, LVa/qb;->d:I

    .line 198
    .line 199
    add-int/lit8 v5, v5, 0x5b

    .line 200
    .line 201
    rem-int/lit16 v7, v5, 0x80

    .line 202
    .line 203
    sput v7, LVa/qb;->e:I

    .line 204
    .line 205
    rem-int/lit8 v5, v5, 0x2

    .line 206
    .line 207
    if-eqz v5, :cond_4

    .line 208
    .line 209
    if-eqz p0, :cond_3

    .line 210
    .line 211
    iget v5, p0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 212
    .line 213
    iget p0, p0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 214
    .line 215
    invoke-static {v5, p0}, LVa/qb;->k(II)V

    .line 216
    .line 217
    .line 218
    sget p0, LVa/qb;->d:I

    .line 219
    .line 220
    add-int/lit8 p0, p0, 0x19

    .line 221
    .line 222
    rem-int/lit16 p0, p0, 0x80

    .line 223
    .line 224
    sput p0, LVa/qb;->e:I
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 225
    .line 226
    :cond_3
    :try_start_c
    sget p0, LVa/qb;->e:I

    .line 227
    .line 228
    add-int/lit8 p0, p0, 0x3b

    .line 229
    .line 230
    rem-int/lit16 p0, p0, 0x80

    .line 231
    .line 232
    sput p0, LVa/qb;->d:I
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    .line 233
    .line 234
    goto :goto_4

    .line 235
    :cond_4
    :try_start_d
    throw v6
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    .line 236
    :goto_3
    :try_start_e
    const-string v5, "\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001"

    .line 237
    .line 238
    filled-new-array {v3, v2, v4, v1}, [I

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    invoke-static {v5, v1, v4}, LVa/qb;->j(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    const-string v2, "\ua7a6\uf206\uf111\u978e\u5d2a\u56a0\u4cdf\u0c5c\u8aff\uaca1\u7bae\u8df4\u98b8\u634c\u4e54\u5147\ue3cc\ufc22\ub7f2\u9749\u964b\u7393\u00fe\u597b\u3cb4\ud848\u02e7\ud586\u1d22\u1436\u00b7\u19d9\u0d8b\u9386\uec01\uaf95\u6c8b\ub676\u09bf\u1b72\uff3c\u65b2\u6ff1\ufc01"

    .line 251
    .line 252
    const-string v3, ""

    .line 253
    .line 254
    const-string v5, ""

    .line 255
    .line 256
    invoke-static {v3, v5, v4}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    .line 257
    .line 258
    .line 259
    move-result v3

    .line 260
    add-int/lit8 v3, v3, 0x2c

    .line 261
    .line 262
    invoke-static {v3, v2}, LVa/qb;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v2

    .line 266
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    invoke-static {v1, v2, p0}, LVa/Ab;->R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    .line 271
    .line 272
    .line 273
    monitor-exit v0

    .line 274
    return-void

    .line 275
    :cond_5
    :goto_4
    :try_start_f
    sget p0, LVa/qb;->d:I

    .line 276
    .line 277
    add-int/lit8 p0, p0, 0x6b

    .line 278
    .line 279
    rem-int/lit16 p0, p0, 0x80

    .line 280
    .line 281
    sput p0, LVa/qb;->e:I
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_1

    .line 282
    .line 283
    monitor-exit v0

    .line 284
    return-void

    .line 285
    :goto_5
    :try_start_10
    monitor-exit v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_1

    .line 286
    throw p0
.end method

.method public static j(Ljava/lang/String;[IZ)Ljava/lang/String;
    .locals 12

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    const-string v0, "ISO-8859-1"

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    :cond_0
    check-cast p0, [B

    .line 10
    .line 11
    sget-object v0, LVa/Ab;->z:Ljava/lang/Object;

    .line 12
    .line 13
    monitor-enter v0

    .line 14
    const/4 v1, 0x0

    .line 15
    :try_start_0
    aget v2, p1, v1

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    aget v4, p1, v3

    .line 19
    .line 20
    const/4 v5, 0x2

    .line 21
    aget v6, p1, v5

    .line 22
    .line 23
    const/4 v7, 0x3

    .line 24
    aget v7, p1, v7

    .line 25
    .line 26
    sget-object v8, LVa/qb;->c:[C

    .line 27
    .line 28
    new-array v9, v4, [C

    .line 29
    .line 30
    invoke-static {v8, v2, v9, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 31
    .line 32
    .line 33
    if-eqz p0, :cond_3

    .line 34
    .line 35
    new-array v2, v4, [C

    .line 36
    .line 37
    sput v1, LVa/Ab;->y:I

    .line 38
    .line 39
    move v8, v1

    .line 40
    :goto_0
    sget v10, LVa/Ab;->y:I

    .line 41
    .line 42
    if-ge v10, v4, :cond_2

    .line 43
    .line 44
    aget-byte v11, p0, v10

    .line 45
    .line 46
    if-ne v11, v3, :cond_1

    .line 47
    .line 48
    aget-char v11, v9, v10

    .line 49
    .line 50
    shl-int/2addr v11, v3

    .line 51
    add-int/2addr v11, v3

    .line 52
    sub-int/2addr v11, v8

    .line 53
    int-to-char v8, v11

    .line 54
    aput-char v8, v2, v10

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :catchall_0
    move-exception p0

    .line 58
    goto :goto_4

    .line 59
    :cond_1
    aget-char v11, v9, v10

    .line 60
    .line 61
    shl-int/2addr v11, v3

    .line 62
    sub-int/2addr v11, v8

    .line 63
    int-to-char v8, v11

    .line 64
    aput-char v8, v2, v10

    .line 65
    .line 66
    :goto_1
    aget-char v8, v2, v10

    .line 67
    .line 68
    add-int/lit8 v10, v10, 0x1

    .line 69
    .line 70
    sput v10, LVa/Ab;->y:I

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_2
    move-object v9, v2

    .line 74
    :cond_3
    if-lez v7, :cond_4

    .line 75
    .line 76
    new-array p0, v4, [C

    .line 77
    .line 78
    invoke-static {v9, v1, p0, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 79
    .line 80
    .line 81
    sub-int v2, v4, v7

    .line 82
    .line 83
    invoke-static {p0, v1, v9, v2, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 84
    .line 85
    .line 86
    invoke-static {p0, v7, v9, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 87
    .line 88
    .line 89
    :cond_4
    if-eqz p2, :cond_6

    .line 90
    .line 91
    new-array p0, v4, [C

    .line 92
    .line 93
    sput v1, LVa/Ab;->y:I

    .line 94
    .line 95
    :goto_2
    sget p2, LVa/Ab;->y:I

    .line 96
    .line 97
    if-ge p2, v4, :cond_5

    .line 98
    .line 99
    sub-int v2, v4, p2

    .line 100
    .line 101
    sub-int/2addr v2, v3

    .line 102
    aget-char v2, v9, v2

    .line 103
    .line 104
    aput-char v2, p0, p2

    .line 105
    .line 106
    add-int/lit8 p2, p2, 0x1

    .line 107
    .line 108
    sput p2, LVa/Ab;->y:I

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_5
    move-object v9, p0

    .line 112
    :cond_6
    if-lez v6, :cond_7

    .line 113
    .line 114
    sput v1, LVa/Ab;->y:I

    .line 115
    .line 116
    :goto_3
    sget p0, LVa/Ab;->y:I

    .line 117
    .line 118
    if-ge p0, v4, :cond_7

    .line 119
    .line 120
    aget-char p2, v9, p0

    .line 121
    .line 122
    aget v1, p1, v5

    .line 123
    .line 124
    sub-int/2addr p2, v1

    .line 125
    int-to-char p2, p2

    .line 126
    aput-char p2, v9, p0

    .line 127
    .line 128
    add-int/lit8 p0, p0, 0x1

    .line 129
    .line 130
    sput p0, LVa/Ab;->y:I

    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_7
    new-instance p0, Ljava/lang/String;

    .line 134
    .line 135
    invoke-direct {p0, v9}, Ljava/lang/String;-><init>([C)V

    .line 136
    .line 137
    .line 138
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 139
    return-object p0

    .line 140
    :goto_4
    monitor-exit v0

    .line 141
    throw p0
.end method

.method public static k(II)V
    .locals 9

    .line 1
    if-lez p0, :cond_2

    .line 2
    .line 3
    sget v0, LVa/qb;->e:I

    .line 4
    .line 5
    add-int/lit8 v1, v0, 0x5

    .line 6
    .line 7
    rem-int/lit16 v2, v1, 0x80

    .line 8
    .line 9
    sput v2, LVa/qb;->d:I

    .line 10
    .line 11
    rem-int/lit8 v1, v1, 0x2

    .line 12
    .line 13
    const/16 v2, 0xb

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    const/4 v4, 0x0

    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    if-lez p1, :cond_0

    .line 20
    .line 21
    add-int/2addr v0, v2

    .line 22
    rem-int/lit16 v0, v0, 0x80

    .line 23
    .line 24
    sput v0, LVa/qb;->d:I

    .line 25
    .line 26
    :try_start_0
    invoke-static {}, LVa/qb;->b()Lorg/json/JSONObject;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const-string v1, "\u0000"

    .line 31
    .line 32
    const/16 v5, 0xa5

    .line 33
    .line 34
    filled-new-array {v4, v3, v5, v3}, [I

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    invoke-static {v1, v5, v3}, LVa/qb;->j(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 47
    .line 48
    .line 49
    const-string p1, "\u7351\u4edd"

    .line 50
    .line 51
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 52
    .line 53
    .line 54
    move-result-wide v5

    .line 55
    const-wide/16 v7, 0x0

    .line 56
    .line 57
    cmp-long v1, v5, v7

    .line 58
    .line 59
    invoke-static {v1, p1}, LVa/qb;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {v0, p1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :catchall_0
    move-exception p0

    .line 72
    goto :goto_0

    .line 73
    :cond_0
    return-void

    .line 74
    :cond_1
    const/4 p0, 0x0

    .line 75
    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    :goto_0
    const/16 p1, 0xa

    .line 77
    .line 78
    filled-new-array {v3, v2, v4, p1}, [I

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    const-string v0, "\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001"

    .line 83
    .line 84
    invoke-static {v0, p1, v4}, LVa/qb;->j(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    const/16 v0, 0x3c

    .line 93
    .line 94
    const/16 v1, 0x19

    .line 95
    .line 96
    filled-new-array {v0, v1, v4, v4}, [I

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    const-string v1, "\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001"

    .line 101
    .line 102
    invoke-static {v1, v0, v3}, LVa/qb;->j(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-static {p1, v0, p0}, LVa/Ab;->R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 111
    .line 112
    .line 113
    :cond_2
    return-void
.end method
