.class public final LVa/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# static fields
.field public static b:I = 0x0

.field public static c:I = 0x1


# instance fields
.field public synthetic a:LVa/x;


# direct methods
.method public static a(Ljava/lang/String;IIIZ)Ljava/lang/String;
    .locals 5

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
    sget-object v0, LVa/Ab;->x:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    new-array v1, p2, [C

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    sput v2, LVa/Ab;->v:I

    .line 14
    .line 15
    :goto_0
    sget v3, LVa/Ab;->v:I

    .line 16
    .line 17
    if-ge v3, p2, :cond_0

    .line 18
    .line 19
    aget-char v4, p0, v3

    .line 20
    .line 21
    add-int/2addr v4, p3

    .line 22
    int-to-char v4, v4

    .line 23
    aput-char v4, v1, v3

    .line 24
    .line 25
    add-int/lit16 v4, v4, -0xa2

    .line 26
    .line 27
    int-to-char v4, v4

    .line 28
    aput-char v4, v1, v3

    .line 29
    .line 30
    add-int/lit8 v3, v3, 0x1

    .line 31
    .line 32
    sput v3, LVa/Ab;->v:I

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception p0

    .line 36
    goto :goto_2

    .line 37
    :cond_0
    if-lez p1, :cond_1

    .line 38
    .line 39
    sput p1, LVa/Ab;->w:I

    .line 40
    .line 41
    new-array p0, p2, [C

    .line 42
    .line 43
    invoke-static {v1, v2, p0, v2, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 44
    .line 45
    .line 46
    sget p1, LVa/Ab;->w:I

    .line 47
    .line 48
    sub-int p3, p2, p1

    .line 49
    .line 50
    invoke-static {p0, v2, v1, p3, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 51
    .line 52
    .line 53
    sget p1, LVa/Ab;->w:I

    .line 54
    .line 55
    sub-int p3, p2, p1

    .line 56
    .line 57
    invoke-static {p0, p1, v1, v2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 58
    .line 59
    .line 60
    :cond_1
    if-eqz p4, :cond_3

    .line 61
    .line 62
    new-array p0, p2, [C

    .line 63
    .line 64
    sput v2, LVa/Ab;->v:I

    .line 65
    .line 66
    :goto_1
    sget p1, LVa/Ab;->v:I

    .line 67
    .line 68
    if-ge p1, p2, :cond_2

    .line 69
    .line 70
    sub-int p3, p2, p1

    .line 71
    .line 72
    add-int/lit8 p3, p3, -0x1

    .line 73
    .line 74
    aget-char p3, v1, p3

    .line 75
    .line 76
    aput-char p3, p0, p1

    .line 77
    .line 78
    add-int/lit8 p1, p1, 0x1

    .line 79
    .line 80
    sput p1, LVa/Ab;->v:I

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_2
    move-object v1, p0

    .line 84
    :cond_3
    new-instance p0, Ljava/lang/String;

    .line 85
    .line 86
    invoke-direct {p0, v1}, Ljava/lang/String;-><init>([C)V

    .line 87
    .line 88
    .line 89
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    return-object p0

    .line 91
    :goto_2
    monitor-exit v0

    .line 92
    throw p0
.end method


# virtual methods
.method public final uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 8

    .line 1
    sget v0, LVa/s;->c:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x3f

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/s;->b:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-static {v0, v0, v0}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    add-int/lit8 v1, v1, 0x4

    .line 15
    .line 16
    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    shr-int/lit8 v2, v2, 0x8

    .line 21
    .line 22
    rsub-int/lit8 v2, v2, 0x9

    .line 23
    .line 24
    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    .line 25
    .line 26
    .line 27
    move-result-wide v3

    .line 28
    const-wide/16 v5, 0x0

    .line 29
    .line 30
    cmp-long v3, v3, v5

    .line 31
    .line 32
    rsub-int v3, v3, 0x10b

    .line 33
    .line 34
    const-string v4, "\u000c\u0001\ufffb\u000b\uffd9\u0006\ufff9\u0004\u0011"

    .line 35
    .line 36
    invoke-static {v4, v1, v2, v3, v0}, LVa/s;->a(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-static {v0}, Landroid/graphics/Color;->green(I)I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    add-int/lit8 v2, v2, 0xe

    .line 49
    .line 50
    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    const/4 v4, 0x0

    .line 55
    cmpl-float v3, v3, v4

    .line 56
    .line 57
    rsub-int/lit8 v3, v3, 0x12

    .line 58
    .line 59
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    shr-int/lit8 v5, v5, 0x10

    .line 64
    .line 65
    add-int/lit16 v5, v5, 0x108

    .line 66
    .line 67
    const-string v6, "\n\uffff\ufffd\u0012\uffff\uffba\u000e\u0002\u0001\u000f\ufffb\ufffd\u0008\uffef\u0008\t\u0003\u000e"

    .line 68
    .line 69
    const/4 v7, 0x1

    .line 70
    invoke-static {v6, v2, v3, v5, v7}, LVa/s;->a(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    const-string v3, ""

    .line 79
    .line 80
    const/16 v5, 0x30

    .line 81
    .line 82
    invoke-static {v3, v5}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    rsub-int/lit8 v3, v3, 0x8

    .line 87
    .line 88
    const v5, -0xfffff7

    .line 89
    .line 90
    .line 91
    invoke-static {v0, v0, v0}, Landroid/graphics/Color;->rgb(III)I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    sub-int/2addr v5, v0

    .line 96
    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    cmpl-float v0, v0, v4

    .line 101
    .line 102
    add-int/lit16 v0, v0, 0x105

    .line 103
    .line 104
    const-string v4, "\u0008\u0000\ufffe\uffff\u0002\u0000\ufffe\u000f\ufff1"

    .line 105
    .line 106
    invoke-static {v4, v3, v5, v0, v7}, LVa/s;->a(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-static {v1, v2, v0, p2}, LVa/Ab;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 115
    .line 116
    .line 117
    iget-object v0, p0, LVa/s;->a:LVa/x;

    .line 118
    .line 119
    invoke-virtual {v0}, LVa/x;->w()V

    .line 120
    .line 121
    .line 122
    sget v1, LVa/x;->s:I

    .line 123
    .line 124
    add-int/lit8 v1, v1, 0x17

    .line 125
    .line 126
    rem-int/lit16 v1, v1, 0x80

    .line 127
    .line 128
    sput v1, LVa/x;->r:I

    .line 129
    .line 130
    iget-object v0, v0, LVa/x;->n:Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 131
    .line 132
    add-int/lit8 v1, v1, 0x35

    .line 133
    .line 134
    rem-int/lit16 v1, v1, 0x80

    .line 135
    .line 136
    sput v1, LVa/x;->s:I

    .line 137
    .line 138
    if-eqz v0, :cond_0

    .line 139
    .line 140
    add-int/lit8 v1, v1, 0x17

    .line 141
    .line 142
    rem-int/lit16 v1, v1, 0x80

    .line 143
    .line 144
    sput v1, LVa/x;->r:I

    .line 145
    .line 146
    add-int/lit8 v1, v1, 0x35

    .line 147
    .line 148
    rem-int/lit16 v1, v1, 0x80

    .line 149
    .line 150
    sput v1, LVa/x;->s:I

    .line 151
    .line 152
    invoke-interface {v0, p1, p2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 153
    .line 154
    .line 155
    return-void

    .line 156
    :cond_0
    :try_start_0
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 157
    .line 158
    .line 159
    move-result p1

    .line 160
    invoke-static {p1}, Landroid/os/Process;->killProcess(I)V

    .line 161
    .line 162
    .line 163
    const/16 p1, 0xa

    .line 164
    .line 165
    invoke-static {p1}, Ljava/lang/System;->exit(I)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 166
    .line 167
    .line 168
    sget p1, LVa/s;->b:I

    .line 169
    .line 170
    add-int/lit8 p1, p1, 0x69

    .line 171
    .line 172
    rem-int/lit16 p1, p1, 0x80

    .line 173
    .line 174
    sput p1, LVa/s;->c:I

    .line 175
    .line 176
    :catch_0
    return-void
.end method
