.class public final LVa/Fb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVa/X;


# static fields
.field public static final c:[B


# instance fields
.field public synthetic a:Ljava/lang/String;

.field public synthetic b:LVa/Ga;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x6

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    sput-object v0, LVa/Fb;->c:[B

    .line 8
    .line 9
    return-void

    .line 10
    nop

    .line 11
    :array_0
    .array-data 1
        -0xbt
        -0x1t
        -0x2t
        0x0t
        -0x4t
        0x0t
    .end array-data
.end method


# virtual methods
.method public final a()V
    .locals 12

    .line 1
    invoke-static {}, LVa/G;->S()LVa/G;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, ""

    .line 6
    .line 7
    invoke-static {v1}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-static {v2, v2}, Landroid/view/KeyEvent;->getDeadChar(II)I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    const v4, -0x40ba4d7

    .line 17
    .line 18
    .line 19
    sub-int/2addr v4, v3

    .line 20
    invoke-static {v2, v2}, Landroid/view/KeyEvent;->getDeadChar(II)I

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    shr-int/lit8 v6, v6, 0x10

    .line 29
    .line 30
    int-to-byte v6, v6

    .line 31
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 32
    .line 33
    .line 34
    move-result-wide v7

    .line 35
    const-wide/16 v9, 0x0

    .line 36
    .line 37
    cmp-long v7, v7, v9

    .line 38
    .line 39
    const/4 v8, -0x1

    .line 40
    add-int/2addr v7, v8

    .line 41
    int-to-short v7, v7

    .line 42
    sget-object v9, LVa/pb;->J:Ljava/lang/Object;

    .line 43
    .line 44
    monitor-enter v9

    .line 45
    :try_start_0
    new-instance v10, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 48
    .line 49
    .line 50
    add-int/lit8 v5, v5, 0x6

    .line 51
    .line 52
    const/4 v11, 0x1

    .line 53
    if-ne v5, v8, :cond_0

    .line 54
    .line 55
    move v8, v11

    .line 56
    goto :goto_0

    .line 57
    :cond_0
    move v8, v2

    .line 58
    :goto_0
    if-eqz v8, :cond_1

    .line 59
    .line 60
    sget-object v5, LVa/Fb;->c:[B

    .line 61
    .line 62
    rsub-int/lit8 v3, v3, 0x0

    .line 63
    .line 64
    aget-byte v3, v5, v3

    .line 65
    .line 66
    add-int/lit8 v3, v3, 0x14

    .line 67
    .line 68
    int-to-byte v5, v3

    .line 69
    goto :goto_1

    .line 70
    :catchall_0
    move-exception v0

    .line 71
    goto :goto_3

    .line 72
    :cond_1
    :goto_1
    if-lez v5, :cond_2

    .line 73
    .line 74
    add-int/2addr v4, v5

    .line 75
    const v3, -0x40ba4d5

    .line 76
    .line 77
    .line 78
    sub-int/2addr v4, v3

    .line 79
    add-int/2addr v4, v8

    .line 80
    sput v4, LVa/pb;->F:I

    .line 81
    .line 82
    sput-byte v6, LVa/pb;->G:B

    .line 83
    .line 84
    add-int/lit8 v1, v1, 0x74

    .line 85
    .line 86
    int-to-char v1, v1

    .line 87
    sput-char v1, LVa/pb;->H:C

    .line 88
    .line 89
    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    sget-char v1, LVa/pb;->H:C

    .line 93
    .line 94
    sput-char v1, LVa/pb;->I:C

    .line 95
    .line 96
    sput v11, LVa/pb;->E:I

    .line 97
    .line 98
    :goto_2
    sget v1, LVa/pb;->E:I

    .line 99
    .line 100
    if-ge v1, v5, :cond_2

    .line 101
    .line 102
    sget-object v1, LVa/Fb;->c:[B

    .line 103
    .line 104
    sget v3, LVa/pb;->F:I

    .line 105
    .line 106
    add-int/lit8 v4, v3, -0x1

    .line 107
    .line 108
    sput v4, LVa/pb;->F:I

    .line 109
    .line 110
    aget-byte v1, v1, v3

    .line 111
    .line 112
    sget-char v3, LVa/pb;->I:C

    .line 113
    .line 114
    add-int/2addr v1, v7

    .line 115
    int-to-byte v1, v1

    .line 116
    sget-byte v4, LVa/pb;->G:B

    .line 117
    .line 118
    xor-int/2addr v1, v4

    .line 119
    add-int/2addr v3, v1

    .line 120
    int-to-char v1, v3

    .line 121
    sput-char v1, LVa/pb;->H:C

    .line 122
    .line 123
    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    sget-char v1, LVa/pb;->H:C

    .line 127
    .line 128
    sput-char v1, LVa/pb;->I:C

    .line 129
    .line 130
    sget v1, LVa/pb;->E:I

    .line 131
    .line 132
    add-int/2addr v1, v11

    .line 133
    sput v1, LVa/pb;->E:I

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_2
    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    monitor-exit v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 141
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    iget-object v3, p0, LVa/Fb;->a:Ljava/lang/String;

    .line 146
    .line 147
    invoke-virtual {v0, v1, v3}, LVa/G;->V(Ljava/lang/String;Ljava/lang/String;)Z

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    if-nez v0, :cond_4

    .line 152
    .line 153
    iget-object v0, p0, LVa/Fb;->b:LVa/Ga;

    .line 154
    .line 155
    iget-object v0, v0, LVa/Ga;->h:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v0, LVa/Kb;

    .line 158
    .line 159
    sget v1, LVa/Kb;->x:I

    .line 160
    .line 161
    add-int/lit8 v1, v1, 0x1b

    .line 162
    .line 163
    rem-int/lit16 v3, v1, 0x80

    .line 164
    .line 165
    sput v3, LVa/Kb;->w:I

    .line 166
    .line 167
    rem-int/lit8 v1, v1, 0x2

    .line 168
    .line 169
    if-eqz v1, :cond_3

    .line 170
    .line 171
    invoke-virtual {v0, v2}, LVa/Kb;->s(Z)V

    .line 172
    .line 173
    .line 174
    return-void

    .line 175
    :cond_3
    invoke-virtual {v0, v11}, LVa/Kb;->s(Z)V

    .line 176
    .line 177
    .line 178
    :cond_4
    return-void

    .line 179
    :goto_3
    monitor-exit v9

    .line 180
    throw v0
.end method
