.class public final LVa/V0;
.super LVa/W0;
.source "SourceFile"


# static fields
.field public static final V:[C

.field public static W:I = 0x0

.field public static X:I = 0x1


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0xb

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LVa/V0;->V:[C

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 2
        -0x53e5s
        -0x19bfs
        0x38eds
        0x7305s
        -0x7a80s
        -0x27d1s
        0x1255s
        -0x5b25s
        -0x95s
        0x319as
        0x4438s
    .end array-data
.end method


# virtual methods
.method public final t0()Ljava/lang/String;
    .locals 2

    .line 1
    sget v0, LVa/V0;->X:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x7

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/V0;->W:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-static {}, Lcom/google/android/gms/ads/MobileAds;->getVersion()Lx6/u;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lx6/u;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sget v1, LVa/V0;->W:I

    .line 22
    .line 23
    add-int/lit8 v1, v1, 0x63

    .line 24
    .line 25
    rem-int/lit16 v1, v1, 0x80

    .line 26
    .line 27
    sput v1, LVa/V0;->X:I

    .line 28
    .line 29
    return-object v0

    .line 30
    :cond_0
    invoke-static {}, Lcom/google/android/gms/ads/MobileAds;->getVersion()Lx6/u;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, Lx6/u;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    throw v0
.end method

.method public final w0(Ljava/lang/String;)Ljava/lang/Class;
    .locals 12

    .line 1
    sget v0, LVa/V0;->W:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x39

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/V0;->X:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const v1, -0x73888e7a

    .line 12
    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/16 v3, 0x2f

    .line 22
    .line 23
    div-int/2addr v3, v2

    .line 24
    if-eq v0, v1, :cond_1

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eq v0, v1, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    const v0, 0xac4d

    .line 35
    .line 36
    .line 37
    invoke-static {v2}, Landroid/graphics/Color;->alpha(I)I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    add-int/2addr v1, v0

    .line 42
    int-to-char v0, v1

    .line 43
    invoke-static {v2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    invoke-static {v2, v2}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    .line 48
    .line 49
    .line 50
    move-result-wide v3

    .line 51
    const-wide/16 v5, 0x0

    .line 52
    .line 53
    cmp-long v3, v3, v5

    .line 54
    .line 55
    rsub-int/lit8 v3, v3, 0xa

    .line 56
    .line 57
    sget-object v4, LVa/Ab;->u:Ljava/lang/Object;

    .line 58
    .line 59
    monitor-enter v4

    .line 60
    :try_start_0
    new-array v5, v3, [C

    .line 61
    .line 62
    sput v2, LVa/Ab;->t:I

    .line 63
    .line 64
    :goto_0
    sget v2, LVa/Ab;->t:I

    .line 65
    .line 66
    if-ge v2, v3, :cond_2

    .line 67
    .line 68
    sget-object v6, LVa/V0;->V:[C

    .line 69
    .line 70
    add-int v7, v1, v2

    .line 71
    .line 72
    aget-char v6, v6, v7

    .line 73
    .line 74
    int-to-long v6, v6

    .line 75
    int-to-long v8, v2

    .line 76
    const-wide v10, -0x1966effd956ab597L    # -1.7038931876168145E186

    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    mul-long/2addr v8, v10

    .line 82
    xor-long/2addr v6, v8

    .line 83
    int-to-long v8, v0

    .line 84
    xor-long/2addr v6, v8

    .line 85
    long-to-int v6, v6

    .line 86
    int-to-char v6, v6

    .line 87
    aput-char v6, v5, v2

    .line 88
    .line 89
    add-int/lit8 v2, v2, 0x1

    .line 90
    .line 91
    sput v2, LVa/Ab;->t:I

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :catchall_0
    move-exception p1

    .line 95
    goto :goto_2

    .line 96
    :cond_2
    new-instance v0, Ljava/lang/String;

    .line 97
    .line 98
    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    .line 99
    .line 100
    .line 101
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 102
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    const/4 v1, 0x1

    .line 111
    if-eq v0, v1, :cond_3

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_3
    sget v0, LVa/V0;->X:I

    .line 115
    .line 116
    add-int/lit8 v0, v0, 0x3

    .line 117
    .line 118
    rem-int/lit16 v1, v0, 0x80

    .line 119
    .line 120
    sput v1, LVa/V0;->W:I

    .line 121
    .line 122
    rem-int/lit8 v0, v0, 0x2

    .line 123
    .line 124
    if-eqz v0, :cond_4

    .line 125
    .line 126
    :goto_1
    invoke-super {p0, p1}, LVa/W0;->w0(Ljava/lang/String;)Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    return-object p1

    .line 131
    :cond_4
    const-class p1, Lx6/u;

    .line 132
    .line 133
    return-object p1

    .line 134
    :goto_2
    monitor-exit v4

    .line 135
    throw p1
.end method
