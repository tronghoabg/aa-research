.class public final LVa/s8;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:[C

.field public static f:I = 0x0

.field public static g:I = 0x1


# instance fields
.field public final a:Ljava/lang/Object;

.field public b:Z

.field public c:Z

.field public d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v0, v0, [C

    .line 3
    .line 4
    const/16 v1, 0xec

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-char v1, v0, v2

    .line 8
    .line 9
    sput-object v0, LVa/s8;->e:[C

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LVa/s8;->a:Ljava/lang/Object;

    .line 5
    .line 6
    return-void
.end method

.method public static f(I)Ljava/lang/String;
    .locals 6

    .line 1
    const-string v0, "\u0081"

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
    sget-object v2, LVa/s8;->e:[C

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
    add-int/lit16 v5, v5, -0xca

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


# virtual methods
.method public final a()Ljava/lang/Number;
    .locals 5

    .line 1
    sget v0, LVa/s8;->f:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x33

    .line 4
    .line 5
    rem-int/lit16 v2, v1, 0x80

    .line 6
    .line 7
    sput v2, LVa/s8;->g:I

    .line 8
    .line 9
    rem-int/lit8 v1, v1, 0x2

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    iget-object v3, p0, LVa/s8;->a:Ljava/lang/Object;

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    instance-of v1, v3, Ljava/lang/Integer;

    .line 17
    .line 18
    const/16 v4, 0x1a

    .line 19
    .line 20
    div-int/lit8 v4, v4, 0x0

    .line 21
    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    instance-of v1, v3, Ljava/lang/Integer;

    .line 26
    .line 27
    if-eqz v1, :cond_3

    .line 28
    .line 29
    :cond_1
    check-cast v3, Ljava/lang/Integer;

    .line 30
    .line 31
    add-int/lit8 v0, v0, 0xb

    .line 32
    .line 33
    rem-int/lit16 v1, v0, 0x80

    .line 34
    .line 35
    sput v1, LVa/s8;->g:I

    .line 36
    .line 37
    rem-int/lit8 v0, v0, 0x2

    .line 38
    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    return-object v3

    .line 42
    :cond_2
    throw v2

    .line 43
    :cond_3
    :goto_0
    instance-of v0, v3, Ljava/lang/Long;

    .line 44
    .line 45
    if-eqz v0, :cond_4

    .line 46
    .line 47
    check-cast v3, Ljava/lang/Long;

    .line 48
    .line 49
    return-object v3

    .line 50
    :cond_4
    instance-of v0, v3, Ljava/lang/Double;

    .line 51
    .line 52
    if-eqz v0, :cond_5

    .line 53
    .line 54
    check-cast v3, Ljava/lang/Double;

    .line 55
    .line 56
    return-object v3

    .line 57
    :cond_5
    return-object v2
.end method

.method public final b()Z
    .locals 2

    .line 1
    sget v0, LVa/s8;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x3f

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/s8;->g:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-boolean v0, p0, LVa/s8;->b:Z

    .line 14
    .line 15
    return v0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    throw v0
.end method

.method public final c()Ljava/lang/Object;
    .locals 1

    .line 1
    sget v0, LVa/s8;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0xb

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/s8;->g:I

    .line 8
    .line 9
    iget-object v0, p0, LVa/s8;->a:Ljava/lang/Object;

    .line 10
    .line 11
    return-object v0
.end method

.method public final d(Z)V
    .locals 2

    .line 1
    sget v0, LVa/s8;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x73

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/s8;->g:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iput-boolean p1, p0, LVa/s8;->b:Z

    .line 14
    .line 15
    const/16 p1, 0x1c

    .line 16
    .line 17
    div-int/lit8 p1, p1, 0x0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iput-boolean p1, p0, LVa/s8;->b:Z

    .line 21
    .line 22
    :goto_0
    sput v1, LVa/s8;->g:I

    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    const/16 p1, 0x63

    .line 27
    .line 28
    div-int/lit8 p1, p1, 0x0

    .line 29
    .line 30
    :cond_1
    return-void
.end method

.method public final e()Z
    .locals 6

    .line 1
    sget v0, LVa/s8;->g:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x31

    .line 4
    .line 5
    rem-int/lit16 v2, v1, 0x80

    .line 6
    .line 7
    sput v2, LVa/s8;->f:I

    .line 8
    .line 9
    rem-int/lit8 v1, v1, 0x2

    .line 10
    .line 11
    iget-object v3, p0, LVa/s8;->a:Ljava/lang/Object;

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    const/4 v5, 0x1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    div-int/2addr v1, v4

    .line 19
    if-nez v3, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    if-nez v3, :cond_2

    .line 23
    .line 24
    :goto_0
    add-int/lit8 v2, v2, 0xd

    .line 25
    .line 26
    rem-int/lit16 v0, v2, 0x80

    .line 27
    .line 28
    sput v0, LVa/s8;->g:I

    .line 29
    .line 30
    rem-int/lit8 v2, v2, 0x2

    .line 31
    .line 32
    if-nez v2, :cond_1

    .line 33
    .line 34
    return v5

    .line 35
    :cond_1
    return v4

    .line 36
    :cond_2
    instance-of v1, v3, Ljava/lang/Boolean;

    .line 37
    .line 38
    if-eqz v1, :cond_3

    .line 39
    .line 40
    check-cast v3, Ljava/lang/Boolean;

    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    return v0

    .line 47
    :cond_3
    instance-of v1, v3, Ljava/lang/Integer;

    .line 48
    .line 49
    if-eqz v1, :cond_5

    .line 50
    .line 51
    check-cast v3, Ljava/lang/Integer;

    .line 52
    .line 53
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_4

    .line 58
    .line 59
    return v5

    .line 60
    :cond_4
    return v4

    .line 61
    :cond_5
    instance-of v1, v3, Ljava/lang/Long;

    .line 62
    .line 63
    if-eqz v1, :cond_7

    .line 64
    .line 65
    add-int/lit8 v0, v0, 0x7d

    .line 66
    .line 67
    rem-int/lit16 v0, v0, 0x80

    .line 68
    .line 69
    sput v0, LVa/s8;->f:I

    .line 70
    .line 71
    check-cast v3, Ljava/lang/Long;

    .line 72
    .line 73
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 74
    .line 75
    .line 76
    move-result-wide v0

    .line 77
    const-wide/16 v2, 0x0

    .line 78
    .line 79
    cmp-long v0, v0, v2

    .line 80
    .line 81
    if-eqz v0, :cond_6

    .line 82
    .line 83
    return v5

    .line 84
    :cond_6
    return v4

    .line 85
    :cond_7
    instance-of v0, v3, Ljava/lang/Double;

    .line 86
    .line 87
    if-eqz v0, :cond_9

    .line 88
    .line 89
    check-cast v3, Ljava/lang/Double;

    .line 90
    .line 91
    invoke-virtual {v3}, Ljava/lang/Number;->doubleValue()D

    .line 92
    .line 93
    .line 94
    move-result-wide v0

    .line 95
    const-wide/16 v2, 0x0

    .line 96
    .line 97
    cmpl-double v0, v0, v2

    .line 98
    .line 99
    if-eqz v0, :cond_8

    .line 100
    .line 101
    sget v0, LVa/s8;->f:I

    .line 102
    .line 103
    add-int/lit8 v0, v0, 0x15

    .line 104
    .line 105
    rem-int/lit16 v0, v0, 0x80

    .line 106
    .line 107
    sput v0, LVa/s8;->g:I

    .line 108
    .line 109
    return v5

    .line 110
    :cond_8
    return v4

    .line 111
    :cond_9
    instance-of v0, v3, Ljava/lang/String;

    .line 112
    .line 113
    if-eqz v0, :cond_b

    .line 114
    .line 115
    check-cast v3, Ljava/lang/String;

    .line 116
    .line 117
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-nez v0, :cond_a

    .line 122
    .line 123
    sget v0, LVa/s8;->f:I

    .line 124
    .line 125
    add-int/lit8 v0, v0, 0x69

    .line 126
    .line 127
    rem-int/lit16 v0, v0, 0x80

    .line 128
    .line 129
    sput v0, LVa/s8;->g:I

    .line 130
    .line 131
    add-int/lit8 v0, v0, 0x6d

    .line 132
    .line 133
    rem-int/lit16 v0, v0, 0x80

    .line 134
    .line 135
    sput v0, LVa/s8;->f:I

    .line 136
    .line 137
    return v5

    .line 138
    :cond_a
    return v4

    .line 139
    :cond_b
    return v5
.end method

.method public final g()Z
    .locals 3

    .line 1
    sget v0, LVa/s8;->g:I

    .line 2
    .line 3
    iget-boolean v1, p0, LVa/s8;->c:Z

    .line 4
    .line 5
    add-int/lit8 v0, v0, 0xf

    .line 6
    .line 7
    rem-int/lit16 v2, v0, 0x80

    .line 8
    .line 9
    sput v2, LVa/s8;->f:I

    .line 10
    .line 11
    rem-int/lit8 v0, v0, 0x2

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    return v1

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    sget v0, LVa/s8;->g:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/s8;->f:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    iget-object v1, p0, LVa/s8;->a:Ljava/lang/Object;

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    instance-of v0, v1, Ljava/lang/String;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    new-instance v0, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    shr-int/lit8 v2, v2, 0x8

    .line 29
    .line 30
    add-int/lit8 v2, v2, 0x7f

    .line 31
    .line 32
    invoke-static {v2}, LVa/s8;->f(I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-wide/16 v1, 0x0

    .line 47
    .line 48
    invoke-static {v1, v2}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    add-int/lit16 v1, v1, 0x80

    .line 53
    .line 54
    invoke-static {v1}, LVa/s8;->f(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    sget v1, LVa/s8;->f:I

    .line 70
    .line 71
    add-int/lit8 v1, v1, 0x6d

    .line 72
    .line 73
    rem-int/lit16 v1, v1, 0x80

    .line 74
    .line 75
    sput v1, LVa/s8;->g:I

    .line 76
    .line 77
    return-object v0

    .line 78
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    return-object v0

    .line 91
    :cond_1
    instance-of v0, v1, Ljava/lang/String;

    .line 92
    .line 93
    const/4 v0, 0x0

    .line 94
    throw v0
.end method
