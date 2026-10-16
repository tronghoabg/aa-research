.class public final LVa/U9;
.super LVa/G9;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnSeekCompleteListener;


# instance fields
.field public b:LVa/T9;


# direct methods
.method public static a(Ljava/lang/String;I)Ljava/lang/String;
    .locals 11

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
    add-int/lit16 v10, v10, 0x26de

    .line 52
    .line 53
    xor-int/2addr v9, v10

    .line 54
    ushr-int/lit8 v10, v8, 0x5

    .line 55
    .line 56
    add-int/lit16 v10, v10, 0x43ff

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
    add-int/lit16 v10, v10, 0x1a4e

    .line 68
    .line 69
    xor-int/2addr v9, v10

    .line 70
    ushr-int/lit8 v7, v7, 0x5

    .line 71
    .line 72
    const v10, 0xba5d

    .line 73
    .line 74
    .line 75
    add-int/2addr v7, v10

    .line 76
    xor-int/2addr v7, v9

    .line 77
    sub-int/2addr v8, v7

    .line 78
    int-to-char v7, v8

    .line 79
    aput-char v7, v3, v2

    .line 80
    .line 81
    const v7, 0x9e37

    .line 82
    .line 83
    .line 84
    sub-int/2addr v4, v7

    .line 85
    add-int/lit8 v6, v6, 0x1

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :catchall_0
    move-exception p0

    .line 89
    goto :goto_2

    .line 90
    :cond_0
    sget v4, LVa/Ab;->E:I

    .line 91
    .line 92
    aget-char v6, v3, v2

    .line 93
    .line 94
    aput-char v6, v1, v4

    .line 95
    .line 96
    add-int/lit8 v6, v4, 0x1

    .line 97
    .line 98
    aget-char v5, v3, v5

    .line 99
    .line 100
    aput-char v5, v1, v6

    .line 101
    .line 102
    add-int/lit8 v4, v4, 0x2

    .line 103
    .line 104
    sput v4, LVa/Ab;->E:I

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_1
    new-instance p0, Ljava/lang/String;

    .line 108
    .line 109
    invoke-direct {p0, v1, v2, p1}, Ljava/lang/String;-><init>([CII)V

    .line 110
    .line 111
    .line 112
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    return-object p0

    .line 114
    :goto_2
    monitor-exit v0

    .line 115
    throw p0
.end method


# virtual methods
.method public final onSeekComplete(Landroid/media/MediaPlayer;)V
    .locals 5

    .line 1
    :try_start_0
    iget-object v0, p0, LVa/U9;->b:LVa/T9;

    .line 2
    .line 3
    invoke-interface {v0, p0, p1}, LVa/T9;->a(LVa/U9;Landroid/media/MediaPlayer;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :catchall_0
    move-exception v0

    .line 8
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    shr-int/lit8 v1, v1, 0x16

    .line 13
    .line 14
    rsub-int/lit8 v1, v1, 0x1f

    .line 15
    .line 16
    const-string v2, "\ud2bd\u7aa3\u5879\u3337\ud64d\u0ed7\u22e2\u6656\u7937\u5bb0\u044e\u829b\ud16b\u8179\u72a2\u4227\u4591\u5533\ud322\ud89c\ue8c6\ucca9\ud519\u3ce9\u2a59\u269c\u128f\uf688\u51de\u1bb4\uaf56\ud81d"

    .line 17
    .line 18
    invoke-static {v2, v1}, LVa/U9;->a(Ljava/lang/String;I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const/4 v2, 0x0

    .line 27
    invoke-static {v2}, Landroid/graphics/Color;->green(I)I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    rsub-int/lit8 v3, v3, 0x23

    .line 32
    .line 33
    const-string v4, "\ub38f\u6871\u6154\u4afa\uaf0c\uab30\u0143\uc888\uff2e\u19e3\u96db\u39eb\u72a2\u4227\u4591\u5533\ud322\ud89c\ue8c6\ucca9\u84d1\u6100\u3cfb\u7c8e\u1b83\u3ea5\u79f3\uf6df\u834d\ub4bd\u4a27\u931c\ua3b5\u93f7\u5504\u1cda"

    .line 34
    .line 35
    invoke-static {v4, v3}, LVa/U9;->a(Ljava/lang/String;I)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-static {v1, v3, v0, v2}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 44
    .line 45
    .line 46
    :goto_0
    iget-object v0, p0, LVa/G9;->a:Ljava/lang/Object;

    .line 47
    .line 48
    if-eqz v0, :cond_0

    .line 49
    .line 50
    check-cast v0, Landroid/media/MediaPlayer$OnSeekCompleteListener;

    .line 51
    .line 52
    invoke-interface {v0, p1}, Landroid/media/MediaPlayer$OnSeekCompleteListener;->onSeekComplete(Landroid/media/MediaPlayer;)V

    .line 53
    .line 54
    .line 55
    :cond_0
    return-void
.end method
