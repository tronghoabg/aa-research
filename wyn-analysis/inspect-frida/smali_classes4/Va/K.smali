.class public final LVa/K;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:[C

.field public static final e:[B

.field public static f:I = 0x0

.field public static g:I = 0x1


# instance fields
.field public a:LVa/J;

.field public b:Ljava/util/List;

.field public c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x27

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LVa/K;->d:[C

    .line 9
    .line 10
    const/16 v0, 0x25

    .line 11
    .line 12
    new-array v0, v0, [B

    .line 13
    .line 14
    fill-array-data v0, :array_1

    .line 15
    .line 16
    .line 17
    sput-object v0, LVa/K;->e:[B

    .line 18
    .line 19
    return-void

    .line 20
    nop

    .line 21
    :array_0
    .array-data 2
        0x1635s
        0x14d6s
        0x13eds
        0x1eees
        0x76s
        0x280s
        0x3848s
        0x3abbs
        0x3d90s
        0x3084s
        0x33e1s
        -0x6562s
        -0x6789s
        -0x60b4s
        -0x6da7s
        -0x6ecds
        0x3996s
        0x6ffds
        0x6d24s
        0x6a16s
        0x671ds
        0x6472s
        0x613es
        0x7e45s
        0x7b54s
        0x78e8s
        0x7595s
        0x729cs
        0x4feds
        0x4ce5s
        0x49c2s
        0x46d8s
        0x440es
        0x4131s
        0x5e05s
        0x5b65s
        0x5870s
        0x554cs
        0x525bs
    .end array-data

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    nop

    .line 65
    :array_1
    .array-data 1
        -0x1dt
        -0x59t
        -0x5ct
        0x4at
        -0x5ct
        -0x55t
        -0x1et
        0x22t
        -0x36t
        -0x40t
        -0x34t
        -0x1ft
        0x8t
        -0x1t
        0xft
        -0xdt
        -0x59t
        0x5at
        -0x5ft
        -0x5at
        0x75t
        -0x79t
        -0x60t
        0x53t
        0x58t
        -0x49t
        0x53t
        0x7ct
        -0x75t
        0x5at
        -0x5et
        0x48t
        -0x59t
        -0x52t
        0x59t
        -0x5at
        0x75t
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
    add-int/lit8 p1, p1, 0x23

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
    sget-object p1, LVa/K;->e:[B

    .line 20
    .line 21
    const v2, 0x6530aeb1

    .line 22
    .line 23
    .line 24
    add-int/2addr v2, p4

    .line 25
    aget-byte p1, p1, v2

    .line 26
    .line 27
    add-int/lit8 p1, p1, 0x23

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
    const v2, -0x6530aeaf

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
    const p2, 0x4ef58b92    # 2.0597824E9f

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
    sget-object p0, LVa/K;->e:[B

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

.method public static c(IIC)Ljava/lang/String;
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
    sget-object v3, LVa/K;->d:[C

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
    const-wide v7, -0x23ab390fce52fd12L    # -6.040641090697958E136

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
.method public final b(Ljava/lang/String;)Z
    .locals 9

    .line 1
    sget v0, LVa/K;->g:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x35

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/K;->f:I

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    const/4 v1, 0x0

    .line 11
    :try_start_0
    sget-object v2, LVa/I;->a:[I

    .line 12
    .line 13
    iget-object v3, p0, LVa/K;->a:LVa/J;

    .line 14
    .line 15
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    aget v2, v2, v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    if-eq v2, v0, :cond_8

    .line 22
    .line 23
    const/4 v3, 0x2

    .line 24
    iget-object v4, p0, LVa/K;->b:Ljava/util/List;

    .line 25
    .line 26
    if-eq v2, v3, :cond_7

    .line 27
    .line 28
    const/4 v5, 0x3

    .line 29
    const/16 v6, 0x49

    .line 30
    .line 31
    if-eq v2, v5, :cond_0

    .line 32
    .line 33
    const/4 v5, 0x4

    .line 34
    if-eq v2, v5, :cond_4

    .line 35
    .line 36
    goto/16 :goto_2

    .line 37
    .line 38
    :cond_0
    :try_start_1
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 39
    .line 40
    .line 41
    move-result v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 42
    if-lez v2, :cond_4

    .line 43
    .line 44
    sget v2, LVa/K;->g:I

    .line 45
    .line 46
    add-int/lit8 v2, v2, 0x77

    .line 47
    .line 48
    rem-int/lit16 v5, v2, 0x80

    .line 49
    .line 50
    sput v5, LVa/K;->f:I

    .line 51
    .line 52
    rem-int/2addr v2, v3

    .line 53
    if-eqz v2, :cond_1

    .line 54
    .line 55
    :try_start_2
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    check-cast v2, Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {p1, v2}, LVa/pb;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-gez p1, :cond_3

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :catch_0
    move-exception p1

    .line 69
    goto :goto_1

    .line 70
    :cond_1
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    check-cast v2, Ljava/lang/String;

    .line 75
    .line 76
    invoke-static {p1, v2}, LVa/pb;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 77
    .line 78
    .line 79
    move-result p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 80
    if-gez p1, :cond_3

    .line 81
    .line 82
    :goto_0
    sget p1, LVa/K;->f:I

    .line 83
    .line 84
    add-int/2addr p1, v6

    .line 85
    rem-int/lit16 v2, p1, 0x80

    .line 86
    .line 87
    sput v2, LVa/K;->g:I

    .line 88
    .line 89
    rem-int/2addr p1, v3

    .line 90
    if-nez p1, :cond_2

    .line 91
    .line 92
    return v1

    .line 93
    :cond_2
    return v0

    .line 94
    :cond_3
    return v1

    .line 95
    :cond_4
    :try_start_3
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    if-lez v2, :cond_9

    .line 100
    .line 101
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    check-cast v2, Ljava/lang/String;

    .line 106
    .line 107
    invoke-static {p1, v2}, LVa/pb;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 108
    .line 109
    .line 110
    move-result p1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 111
    if-ltz p1, :cond_6

    .line 112
    .line 113
    sget p1, LVa/K;->f:I

    .line 114
    .line 115
    add-int/lit8 p1, p1, 0x11

    .line 116
    .line 117
    rem-int/lit16 p1, p1, 0x80

    .line 118
    .line 119
    sput p1, LVa/K;->g:I

    .line 120
    .line 121
    add-int/lit8 p1, p1, 0x1f

    .line 122
    .line 123
    rem-int/lit16 v2, p1, 0x80

    .line 124
    .line 125
    sput v2, LVa/K;->f:I

    .line 126
    .line 127
    rem-int/2addr p1, v3

    .line 128
    if-eqz p1, :cond_5

    .line 129
    .line 130
    div-int/2addr v6, v1

    .line 131
    :cond_5
    return v0

    .line 132
    :cond_6
    return v1

    .line 133
    :cond_7
    :try_start_4
    invoke-interface {v4, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result p1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 137
    return p1

    .line 138
    :cond_8
    return v0

    .line 139
    :goto_1
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 140
    .line 141
    .line 142
    move-result-wide v2

    .line 143
    const-wide/16 v4, 0x0

    .line 144
    .line 145
    cmp-long v2, v2, v4

    .line 146
    .line 147
    sub-int/2addr v0, v2

    .line 148
    int-to-short v0, v0

    .line 149
    const v2, -0x4df58b4f

    .line 150
    .line 151
    .line 152
    invoke-static {v1, v1, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 153
    .line 154
    .line 155
    move-result v3

    .line 156
    add-int/2addr v3, v2

    .line 157
    invoke-static {v1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    rsub-int/lit8 v2, v2, -0x24

    .line 162
    .line 163
    const v6, -0x6530aea2

    .line 164
    .line 165
    .line 166
    invoke-static {v1}, Landroid/graphics/Color;->alpha(I)I

    .line 167
    .line 168
    .line 169
    move-result v7

    .line 170
    sub-int/2addr v6, v7

    .line 171
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 172
    .line 173
    .line 174
    move-result-wide v7

    .line 175
    cmp-long v4, v7, v4

    .line 176
    .line 177
    rsub-int/lit8 v4, v4, 0x5a

    .line 178
    .line 179
    int-to-byte v4, v4

    .line 180
    invoke-static {v3, v2, v4, v0, v6}, LVa/K;->a(IIBSI)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    invoke-static {v1, v1, v1, v1}, Landroid/graphics/Color;->argb(IIII)I

    .line 189
    .line 190
    .line 191
    move-result v2

    .line 192
    add-int/lit16 v2, v2, 0x6fb8

    .line 193
    .line 194
    int-to-char v2, v2

    .line 195
    invoke-static {v1, v1, v1, v1}, Landroid/graphics/Color;->argb(IIII)I

    .line 196
    .line 197
    .line 198
    move-result v3

    .line 199
    add-int/lit8 v3, v3, 0x11

    .line 200
    .line 201
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    .line 202
    .line 203
    .line 204
    move-result v4

    .line 205
    shr-int/lit8 v4, v4, 0x10

    .line 206
    .line 207
    rsub-int/lit8 v4, v4, 0x16

    .line 208
    .line 209
    invoke-static {v3, v4, v2}, LVa/K;->c(IIC)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    invoke-static {v0, v2, p1, v1}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 218
    .line 219
    .line 220
    :cond_9
    :goto_2
    return v1
.end method
