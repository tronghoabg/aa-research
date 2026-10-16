.class public abstract LVa/A4;
.super LVa/Z0;
.source "SourceFile"


# static fields
.field public static final R:[C

.field public static S:I = 0x0

.field public static T:I = 0x1


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v0, v0, [C

    .line 3
    .line 4
    const v1, 0xba36

    .line 5
    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    aput-char v1, v0, v2

    .line 9
    .line 10
    sput-object v0, LVa/A4;->R:[C

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final t0()Ljava/lang/String;
    .locals 13

    .line 1
    sget v0, LVa/A4;->T:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0xd

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/A4;->S:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, LVa/Z0;->u0()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/16 v2, 0x4f

    .line 19
    .line 20
    div-int/2addr v2, v1

    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {p0}, LVa/Z0;->u0()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    :goto_0
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    shr-int/lit8 v2, v2, 0x16

    .line 35
    .line 36
    const v3, 0xba69

    .line 37
    .line 38
    .line 39
    add-int/2addr v2, v3

    .line 40
    int-to-char v2, v2

    .line 41
    invoke-static {v1}, Landroid/graphics/Color;->red(I)I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    const/16 v4, 0x30

    .line 46
    .line 47
    invoke-static {v4}, Landroid/text/AndroidCharacter;->getMirror(C)C

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    rsub-int/lit8 v4, v4, 0x31

    .line 52
    .line 53
    sget-object v5, LVa/Ab;->u:Ljava/lang/Object;

    .line 54
    .line 55
    monitor-enter v5

    .line 56
    :try_start_0
    new-array v6, v4, [C

    .line 57
    .line 58
    sput v1, LVa/Ab;->t:I

    .line 59
    .line 60
    :goto_1
    sget v1, LVa/Ab;->t:I

    .line 61
    .line 62
    if-ge v1, v4, :cond_1

    .line 63
    .line 64
    sget-object v7, LVa/A4;->R:[C

    .line 65
    .line 66
    add-int v8, v3, v1

    .line 67
    .line 68
    aget-char v7, v7, v8

    .line 69
    .line 70
    int-to-long v7, v7

    .line 71
    int-to-long v9, v1

    .line 72
    const-wide v11, 0x47f65ee37e1f64d3L    # 4.7577129458263765E38

    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    mul-long/2addr v9, v11

    .line 78
    xor-long/2addr v7, v9

    .line 79
    int-to-long v9, v2

    .line 80
    xor-long/2addr v7, v9

    .line 81
    long-to-int v7, v7

    .line 82
    int-to-char v7, v7

    .line 83
    aput-char v7, v6, v1

    .line 84
    .line 85
    add-int/lit8 v1, v1, 0x1

    .line 86
    .line 87
    sput v1, LVa/Ab;->t:I

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :catchall_0
    move-exception v0

    .line 91
    goto :goto_2

    .line 92
    :cond_1
    new-instance v1, Ljava/lang/String;

    .line 93
    .line 94
    invoke-direct {v1, v6}, Ljava/lang/String;-><init>([C)V

    .line 95
    .line 96
    .line 97
    monitor-exit v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 98
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    const/4 v1, 0x1

    .line 107
    aget-object v0, v0, v1

    .line 108
    .line 109
    return-object v0

    .line 110
    :goto_2
    monitor-exit v5

    .line 111
    throw v0

    .line 112
    :cond_2
    sget v0, LVa/A4;->S:I

    .line 113
    .line 114
    add-int/lit8 v0, v0, 0x3b

    .line 115
    .line 116
    rem-int/lit16 v1, v0, 0x80

    .line 117
    .line 118
    sput v1, LVa/A4;->T:I

    .line 119
    .line 120
    rem-int/lit8 v0, v0, 0x2

    .line 121
    .line 122
    const/4 v1, 0x0

    .line 123
    if-eqz v0, :cond_3

    .line 124
    .line 125
    return-object v1

    .line 126
    :cond_3
    throw v1
.end method
