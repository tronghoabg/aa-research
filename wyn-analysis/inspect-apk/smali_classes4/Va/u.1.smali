.class public final LVa/u;
.super LVa/Ba;
.source "SourceFile"


# static fields
.field public static final e:[C

.field public static f:I = 0x0

.field public static g:I = 0x1


# instance fields
.field public final synthetic c:I

.field public synthetic d:LVa/x;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x7

    .line 2
    new-array v0, v0, [C

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    sput-object v0, LVa/u;->e:[C

    .line 8
    .line 9
    return-void

    .line 10
    nop

    .line 11
    :array_0
    .array-data 2
        0xd8s
        0xd4s
        0xc3s
        0xd7s
        0xc9s
        0xd2s
        0xc8s
    .end array-data
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LVa/u;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(ILjava/lang/String;)Ljava/lang/String;
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
    const-wide v1, -0x78fbbd929246e89cL

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

.method public static d(I)Ljava/lang/String;
    .locals 6

    .line 1
    const-string v0, "\u0087\u0086\u0085\u0083\u0084\u0084\u0085\u0084\u0083\u0082\u0081"

    .line 2
    .line 3
    const-string v1, "ISO-8859-1"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, [B

    .line 10
    .line 11
    sget-object v1, LVa/a;->x:Ljava/lang/Object;

    .line 12
    .line 13
    monitor-enter v1

    .line 14
    :try_start_0
    sget-object v2, LVa/u;->e:[C

    .line 15
    .line 16
    array-length v3, v0

    .line 17
    sput v3, LVa/a;->w:I

    .line 18
    .line 19
    new-array v3, v3, [C

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    sput v4, LVa/a;->v:I

    .line 23
    .line 24
    :goto_0
    sget v4, LVa/a;->v:I

    .line 25
    .line 26
    sget v5, LVa/a;->w:I

    .line 27
    .line 28
    if-ge v4, v5, :cond_0

    .line 29
    .line 30
    add-int/lit8 v5, v5, -0x1

    .line 31
    .line 32
    sub-int/2addr v5, v4

    .line 33
    aget-byte v5, v0, v5

    .line 34
    .line 35
    add-int/2addr v5, p0

    .line 36
    aget-char v5, v2, v5

    .line 37
    .line 38
    add-int/lit8 v5, v5, -0x64

    .line 39
    .line 40
    int-to-char v5, v5

    .line 41
    aput-char v5, v3, v4

    .line 42
    .line 43
    add-int/lit8 v4, v4, 0x1

    .line 44
    .line 45
    sput v4, LVa/a;->v:I

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :catchall_0
    move-exception p0

    .line 49
    goto :goto_1

    .line 50
    :cond_0
    new-instance p0, Ljava/lang/String;

    .line 51
    .line 52
    invoke-direct {p0, v3}, Ljava/lang/String;-><init>([C)V

    .line 53
    .line 54
    .line 55
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    return-object p0

    .line 57
    :goto_1
    monitor-exit v1

    .line 58
    throw p0
.end method

.method public static e(I)Ljava/lang/String;
    .locals 7

    .line 1
    const-string v0, "\ue74d\ucb86\ubef8\u6127\u5460\u0741\ueb90\udecf\u8132\u740a\u274e\u0bae\ufef9"

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
    sget-object v1, LVa/a;->u:Ljava/lang/Object;

    .line 10
    .line 11
    monitor-enter v1

    .line 12
    :try_start_0
    sput p0, LVa/a;->t:I

    .line 13
    .line 14
    array-length p0, v0

    .line 15
    new-array p0, p0, [C

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    sput v2, LVa/a;->s:I

    .line 19
    .line 20
    :goto_0
    sget v2, LVa/a;->s:I

    .line 21
    .line 22
    array-length v3, v0

    .line 23
    if-ge v2, v3, :cond_0

    .line 24
    .line 25
    aget-char v3, v0, v2

    .line 26
    .line 27
    sget v4, LVa/a;->t:I

    .line 28
    .line 29
    mul-int/2addr v4, v2

    .line 30
    xor-int/2addr v3, v4

    .line 31
    int-to-long v3, v3

    .line 32
    const-wide v5, -0x319a4fa7969718c7L    # -4.677841710648587E69

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    xor-long/2addr v3, v5

    .line 38
    long-to-int v3, v3

    .line 39
    int-to-char v3, v3

    .line 40
    aput-char v3, p0, v2

    .line 41
    .line 42
    add-int/lit8 v2, v2, 0x1

    .line 43
    .line 44
    sput v2, LVa/a;->s:I

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception p0

    .line 48
    goto :goto_1

    .line 49
    :cond_0
    new-instance v0, Ljava/lang/String;

    .line 50
    .line 51
    invoke-direct {v0, p0}, Ljava/lang/String;-><init>([C)V

    .line 52
    .line 53
    .line 54
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    return-object v0

    .line 56
    :goto_1
    monitor-exit v1

    .line 57
    throw p0
.end method


# virtual methods
.method public final c()V
    .locals 5

    .line 1
    iget v0, p0, LVa/u;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LVa/u;->d:LVa/x;

    .line 7
    .line 8
    invoke-static {v0}, LVa/x;->o(LVa/x;)LVa/Ra;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-string v2, ""

    .line 13
    .line 14
    invoke-static {v2}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    add-int/lit16 v2, v2, 0x2cd0

    .line 19
    .line 20
    invoke-static {v2}, LVa/u;->e(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v1, v2}, LVa/Ra;->d(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    shr-int/lit8 v1, v1, 0x18

    .line 36
    .line 37
    rsub-int v1, v1, 0x2ccf

    .line 38
    .line 39
    invoke-static {v1}, LVa/u;->e(I)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    new-instance v2, Lorg/json/JSONObject;

    .line 48
    .line 49
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1, v2}, LVa/x;->x(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :pswitch_0
    sget v0, LVa/u;->f:I

    .line 57
    .line 58
    add-int/lit8 v0, v0, 0x7

    .line 59
    .line 60
    rem-int/lit16 v1, v0, 0x80

    .line 61
    .line 62
    sput v1, LVa/u;->g:I

    .line 63
    .line 64
    rem-int/lit8 v0, v0, 0x2

    .line 65
    .line 66
    iget-object v1, p0, LVa/u;->d:LVa/x;

    .line 67
    .line 68
    const/4 v2, 0x0

    .line 69
    if-nez v0, :cond_0

    .line 70
    .line 71
    :try_start_0
    invoke-static {v1}, LVa/x;->g(LVa/x;)V

    .line 72
    .line 73
    .line 74
    const/16 v0, 0x8

    .line 75
    .line 76
    div-int/2addr v0, v2

    .line 77
    goto :goto_0

    .line 78
    :catchall_0
    move-exception v0

    .line 79
    goto :goto_1

    .line 80
    :cond_0
    invoke-static {v1}, LVa/x;->g(LVa/x;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    .line 82
    .line 83
    :goto_0
    sget v0, LVa/u;->g:I

    .line 84
    .line 85
    add-int/lit8 v0, v0, 0x73

    .line 86
    .line 87
    rem-int/lit16 v1, v0, 0x80

    .line 88
    .line 89
    sput v1, LVa/u;->f:I

    .line 90
    .line 91
    rem-int/lit8 v0, v0, 0x2

    .line 92
    .line 93
    if-eqz v0, :cond_1

    .line 94
    .line 95
    const/16 v0, 0x15

    .line 96
    .line 97
    div-int/2addr v0, v2

    .line 98
    goto :goto_2

    .line 99
    :goto_1
    const/high16 v3, 0x1000000

    .line 100
    .line 101
    invoke-static {v2, v2, v2}, Landroid/graphics/Color;->rgb(III)I

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    add-int/2addr v2, v3

    .line 106
    const-string v3, "\u1c14\ud977\u1c55\ud70e\ubcea\uce7d\uf9a7\ufaaa\u41fd\uadf7\u5b3f\u1f35\ua747"

    .line 107
    .line 108
    invoke-static {v2, v3}, LVa/u;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 117
    .line 118
    .line 119
    move-result v3

    .line 120
    shr-int/lit8 v3, v3, 0x16

    .line 121
    .line 122
    const-string v4, "\u1695\u770d\u16d0\u803c\u412d\u601b\uae86\u076e\u4b77\u03d9\u0c17\ue2f4\uaddb\ua5ed\u69bd\u400f\u0e42\u4739\uc721\u1f87\u60b0\ufac7\u2540\ufd32\uc565\u9c5f\u82d6\u58be\u2798\u3fe9\ue077\u36c0\u9806\ud131\u3de1"

    .line 123
    .line 124
    invoke-static {v3, v4}, LVa/u;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    invoke-static {v2, v3, v0}, LVa/Ab;->B(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 133
    .line 134
    .line 135
    invoke-static {v1}, LVa/x;->f(LVa/x;)V

    .line 136
    .line 137
    .line 138
    :cond_1
    :goto_2
    return-void

    .line 139
    :pswitch_1
    iget-object v0, p0, LVa/u;->d:LVa/x;

    .line 140
    .line 141
    invoke-static {v0}, LVa/x;->o(LVa/x;)LVa/Ra;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    .line 146
    .line 147
    .line 148
    move-result v2

    .line 149
    shr-int/lit8 v2, v2, 0x10

    .line 150
    .line 151
    add-int/lit8 v2, v2, 0x7f

    .line 152
    .line 153
    invoke-static {v2}, LVa/u;->d(I)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    invoke-virtual {v1, v2}, LVa/Ra;->d(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    const-string v1, ""

    .line 165
    .line 166
    invoke-static {v1}, Landroid/os/Process;->getGidForName(Ljava/lang/String;)I

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    rsub-int/lit8 v1, v1, 0x7e

    .line 171
    .line 172
    invoke-static {v1}, LVa/u;->d(I)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    new-instance v2, Lorg/json/JSONObject;

    .line 181
    .line 182
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v0, v1, v2}, LVa/x;->x(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 186
    .line 187
    .line 188
    return-void

    .line 189
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
