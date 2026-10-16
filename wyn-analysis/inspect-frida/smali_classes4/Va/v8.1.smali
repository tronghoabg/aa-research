.class public final LVa/v8;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static c:I = 0x0

.field public static d:I = 0x1


# instance fields
.field public final a:LVa/u8;

.field public final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(LVa/u8;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LVa/v8;->a:LVa/u8;

    .line 5
    .line 6
    iput-object p2, p0, LVa/v8;->b:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 2

    .line 1
    sget v0, LVa/v8;->c:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x11

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/v8;->d:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    invoke-virtual {p0}, LVa/v8;->d()LVa/u8;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v1, LVa/u8;->b:LVa/u8;

    .line 18
    .line 19
    if-ne v0, v1, :cond_0

    .line 20
    .line 21
    sget v0, LVa/v8;->c:I

    .line 22
    .line 23
    add-int/lit8 v0, v0, 0x4d

    .line 24
    .line 25
    rem-int/lit16 v0, v0, 0x80

    .line 26
    .line 27
    sput v0, LVa/v8;->d:I

    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    return v0

    .line 31
    :cond_0
    sget v0, LVa/v8;->c:I

    .line 32
    .line 33
    add-int/lit8 v0, v0, 0x13

    .line 34
    .line 35
    rem-int/lit16 v1, v0, 0x80

    .line 36
    .line 37
    sput v1, LVa/v8;->d:I

    .line 38
    .line 39
    rem-int/lit8 v0, v0, 0x2

    .line 40
    .line 41
    const/4 v1, 0x0

    .line 42
    if-nez v0, :cond_1

    .line 43
    .line 44
    const/16 v0, 0xe

    .line 45
    .line 46
    div-int/2addr v0, v1

    .line 47
    :cond_1
    return v1

    .line 48
    :cond_2
    invoke-virtual {p0}, LVa/v8;->d()LVa/u8;

    .line 49
    .line 50
    .line 51
    sget-object v0, LVa/u8;->a:LVa/u8;

    .line 52
    .line 53
    const/4 v0, 0x0

    .line 54
    throw v0
.end method

.method public final b()Z
    .locals 2

    .line 1
    sget v0, LVa/v8;->c:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1d

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/v8;->d:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, LVa/v8;->d()LVa/u8;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v1, LVa/u8;->f:LVa/u8;

    .line 18
    .line 19
    if-ne v0, v1, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    return v0

    .line 23
    :cond_0
    sget v0, LVa/v8;->c:I

    .line 24
    .line 25
    add-int/lit8 v0, v0, 0x3

    .line 26
    .line 27
    rem-int/lit16 v0, v0, 0x80

    .line 28
    .line 29
    sput v0, LVa/v8;->d:I

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    return v0

    .line 33
    :cond_1
    invoke-virtual {p0}, LVa/v8;->d()LVa/u8;

    .line 34
    .line 35
    .line 36
    sget-object v0, LVa/u8;->a:LVa/u8;

    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    throw v0
.end method

.method public final c()Z
    .locals 2

    .line 1
    sget v0, LVa/v8;->d:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x77

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/v8;->c:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, LVa/v8;->d()LVa/u8;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v1, LVa/u8;->g:LVa/u8;

    .line 18
    .line 19
    if-ne v0, v1, :cond_0

    .line 20
    .line 21
    sget v0, LVa/v8;->d:I

    .line 22
    .line 23
    add-int/lit8 v0, v0, 0x33

    .line 24
    .line 25
    rem-int/lit16 v0, v0, 0x80

    .line 26
    .line 27
    sput v0, LVa/v8;->c:I

    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    return v0

    .line 31
    :cond_0
    const/4 v0, 0x0

    .line 32
    return v0

    .line 33
    :cond_1
    invoke-virtual {p0}, LVa/v8;->d()LVa/u8;

    .line 34
    .line 35
    .line 36
    sget-object v0, LVa/u8;->a:LVa/u8;

    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    throw v0
.end method

.method public final d()LVa/u8;
    .locals 1

    .line 1
    sget v0, LVa/v8;->d:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x7b

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/v8;->c:I

    .line 8
    .line 9
    iget-object v0, p0, LVa/v8;->a:LVa/u8;

    .line 10
    .line 11
    return-object v0
.end method

.method public final e()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, LVa/v8;->d()LVa/u8;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, LVa/u8;->e:LVa/u8;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    sget v0, LVa/v8;->d:I

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x63

    .line 12
    .line 13
    rem-int/lit16 v0, v0, 0x80

    .line 14
    .line 15
    sput v0, LVa/v8;->c:I

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_0
    sget v0, LVa/v8;->c:I

    .line 20
    .line 21
    add-int/lit8 v0, v0, 0x31

    .line 22
    .line 23
    rem-int/lit16 v0, v0, 0x80

    .line 24
    .line 25
    sput v0, LVa/v8;->d:I

    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    return v0
.end method

.method public final f()Ljava/lang/String;
    .locals 2

    .line 1
    sget v0, LVa/v8;->c:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x4f

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/v8;->d:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, LVa/v8;->b:Ljava/lang/String;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    throw v0
.end method

.method public final g()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, LVa/v8;->d()LVa/u8;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, LVa/u8;->d:LVa/u8;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    sget v0, LVa/v8;->c:I

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x29

    .line 12
    .line 13
    rem-int/lit16 v0, v0, 0x80

    .line 14
    .line 15
    sput v0, LVa/v8;->d:I

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_0
    sget v0, LVa/v8;->d:I

    .line 20
    .line 21
    add-int/lit8 v0, v0, 0x67

    .line 22
    .line 23
    rem-int/lit16 v0, v0, 0x80

    .line 24
    .line 25
    sput v0, LVa/v8;->c:I

    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    return v0
.end method

.method public final h(Ljava/lang/String;)Z
    .locals 2

    .line 1
    sget v0, LVa/v8;->c:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x4d

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/v8;->d:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    iget-object v1, p0, LVa/v8;->b:Ljava/lang/String;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    sget v0, LVa/v8;->d:I

    .line 20
    .line 21
    add-int/lit8 v0, v0, 0x5b

    .line 22
    .line 23
    rem-int/lit16 v0, v0, 0x80

    .line 24
    .line 25
    sput v0, LVa/v8;->c:I

    .line 26
    .line 27
    return p1

    .line 28
    :cond_0
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 9

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, LVa/v8;->a:LVa/u8;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, "\u67b0"

    .line 12
    .line 13
    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    shr-int/lit8 v2, v2, 0x8

    .line 18
    .line 19
    add-int/lit16 v2, v2, 0x94d

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/String;->toCharArray()[C

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, [C

    .line 26
    .line 27
    sget-object v3, LVa/a;->u:Ljava/lang/Object;

    .line 28
    .line 29
    monitor-enter v3

    .line 30
    :try_start_0
    sput v2, LVa/a;->t:I

    .line 31
    .line 32
    array-length v2, v1

    .line 33
    new-array v2, v2, [C

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    sput v4, LVa/a;->s:I

    .line 37
    .line 38
    :goto_0
    sget v4, LVa/a;->s:I

    .line 39
    .line 40
    array-length v5, v1

    .line 41
    if-ge v4, v5, :cond_0

    .line 42
    .line 43
    aget-char v5, v1, v4

    .line 44
    .line 45
    sget v6, LVa/a;->t:I

    .line 46
    .line 47
    mul-int/2addr v6, v4

    .line 48
    xor-int/2addr v5, v6

    .line 49
    int-to-long v5, v5

    .line 50
    const-wide v7, 0x638a72c9ef678aL

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    xor-long/2addr v5, v7

    .line 56
    long-to-int v5, v5

    .line 57
    int-to-char v5, v5

    .line 58
    aput-char v5, v2, v4

    .line 59
    .line 60
    add-int/lit8 v4, v4, 0x1

    .line 61
    .line 62
    sput v4, LVa/a;->s:I

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :catchall_0
    move-exception v0

    .line 66
    goto :goto_1

    .line 67
    :cond_0
    new-instance v1, Ljava/lang/String;

    .line 68
    .line 69
    invoke-direct {v1, v2}, Ljava/lang/String;-><init>([C)V

    .line 70
    .line 71
    .line 72
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    iget-object v1, p0, LVa/v8;->b:Ljava/lang/String;

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    sget v1, LVa/v8;->d:I

    .line 90
    .line 91
    add-int/lit8 v1, v1, 0x49

    .line 92
    .line 93
    rem-int/lit16 v1, v1, 0x80

    .line 94
    .line 95
    sput v1, LVa/v8;->c:I

    .line 96
    .line 97
    return-object v0

    .line 98
    :goto_1
    monitor-exit v3

    .line 99
    throw v0
.end method
