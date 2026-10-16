.class public final LVa/c8;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static d:I


# instance fields
.field public a:Z

.field public b:Z

.field public c:Ljava/lang/String;


# direct methods
.method public static a(IIILjava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p3}, Ljava/lang/String;->toCharArray()[C

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    check-cast p3, [C

    .line 6
    .line 7
    sget-object v0, LVa/Ab;->x:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    new-array v1, p0, [C

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
    if-ge v3, p0, :cond_0

    .line 18
    .line 19
    aget-char v4, p3, v3

    .line 20
    .line 21
    add-int/2addr v4, p1

    .line 22
    int-to-char v4, v4

    .line 23
    aput-char v4, v1, v3

    .line 24
    .line 25
    add-int/lit8 v4, v4, -0x6c

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
    if-lez p2, :cond_1

    .line 38
    .line 39
    sput p2, LVa/Ab;->w:I

    .line 40
    .line 41
    new-array p1, p0, [C

    .line 42
    .line 43
    invoke-static {v1, v2, p1, v2, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 44
    .line 45
    .line 46
    sget p2, LVa/Ab;->w:I

    .line 47
    .line 48
    sub-int p3, p0, p2

    .line 49
    .line 50
    invoke-static {p1, v2, v1, p3, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 51
    .line 52
    .line 53
    sget p2, LVa/Ab;->w:I

    .line 54
    .line 55
    sub-int p3, p0, p2

    .line 56
    .line 57
    invoke-static {p1, p2, v1, v2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 58
    .line 59
    .line 60
    :cond_1
    new-array p1, p0, [C

    .line 61
    .line 62
    sput v2, LVa/Ab;->v:I

    .line 63
    .line 64
    :goto_1
    sget p2, LVa/Ab;->v:I

    .line 65
    .line 66
    if-ge p2, p0, :cond_2

    .line 67
    .line 68
    sub-int p3, p0, p2

    .line 69
    .line 70
    add-int/lit8 p3, p3, -0x1

    .line 71
    .line 72
    aget-char p3, v1, p3

    .line 73
    .line 74
    aput-char p3, p1, p2

    .line 75
    .line 76
    add-int/lit8 p2, p2, 0x1

    .line 77
    .line 78
    sput p2, LVa/Ab;->v:I

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_2
    new-instance p0, Ljava/lang/String;

    .line 82
    .line 83
    invoke-direct {p0, p1}, Ljava/lang/String;-><init>([C)V

    .line 84
    .line 85
    .line 86
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 87
    return-object p0

    .line 88
    :goto_2
    monitor-exit v0

    .line 89
    throw p0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    .line 1
    sget v0, LVa/c8;->d:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x3d

    .line 4
    .line 5
    rem-int/lit8 v0, v0, 0x2

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/16 v0, 0x9

    .line 10
    .line 11
    div-int/lit8 v0, v0, 0x0

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, LVa/c8;->c:Ljava/lang/String;

    .line 14
    .line 15
    return-object v0
.end method

.method public final c()Z
    .locals 2

    .line 1
    sget v0, LVa/c8;->d:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x5

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    add-int/lit8 v0, v0, 0x5b

    .line 8
    .line 9
    rem-int/lit16 v1, v0, 0x80

    .line 10
    .line 11
    sput v1, LVa/c8;->d:I

    .line 12
    .line 13
    rem-int/lit8 v0, v0, 0x2

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iget-boolean v0, p0, LVa/c8;->a:Z

    .line 18
    .line 19
    return v0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    throw v0
.end method
