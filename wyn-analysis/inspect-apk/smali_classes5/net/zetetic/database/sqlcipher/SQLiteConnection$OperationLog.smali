.class final Lnet/zetetic/database/sqlcipher/SQLiteConnection$OperationLog;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/zetetic/database/sqlcipher/SQLiteConnection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "OperationLog"
.end annotation


# instance fields
.field public final a:[Lnet/zetetic/database/sqlcipher/SQLiteConnection$Operation;

.field public b:I

.field public c:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x14

    .line 5
    .line 6
    new-array v0, v0, [Lnet/zetetic/database/sqlcipher/SQLiteConnection$Operation;

    .line 7
    .line 8
    iput-object v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection$OperationLog;->a:[Lnet/zetetic/database/sqlcipher/SQLiteConnection$Operation;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I
    .locals 7

    .line 1
    iget-object v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection$OperationLog;->a:[Lnet/zetetic/database/sqlcipher/SQLiteConnection$Operation;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection$OperationLog;->b:I

    .line 5
    .line 6
    add-int/lit8 v1, v1, 0x1

    .line 7
    .line 8
    rem-int/lit8 v1, v1, 0x14

    .line 9
    .line 10
    iget-object v2, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection$OperationLog;->a:[Lnet/zetetic/database/sqlcipher/SQLiteConnection$Operation;

    .line 11
    .line 12
    aget-object v3, v2, v1

    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    if-nez v3, :cond_0

    .line 16
    .line 17
    new-instance v3, Lnet/zetetic/database/sqlcipher/SQLiteConnection$Operation;

    .line 18
    .line 19
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    aput-object v3, v2, v1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception p1

    .line 26
    goto :goto_3

    .line 27
    :cond_0
    iput-boolean v4, v3, Lnet/zetetic/database/sqlcipher/SQLiteConnection$Operation;->g:Z

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    iput-object v2, v3, Lnet/zetetic/database/sqlcipher/SQLiteConnection$Operation;->h:Ljava/lang/RuntimeException;

    .line 31
    .line 32
    iget-object v2, v3, Lnet/zetetic/database/sqlcipher/SQLiteConnection$Operation;->f:Ljava/util/ArrayList;

    .line 33
    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 37
    .line 38
    .line 39
    :cond_1
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 40
    .line 41
    .line 42
    move-result-wide v5

    .line 43
    iput-wide v5, v3, Lnet/zetetic/database/sqlcipher/SQLiteConnection$Operation;->a:J

    .line 44
    .line 45
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 46
    .line 47
    .line 48
    move-result-wide v5

    .line 49
    iput-wide v5, v3, Lnet/zetetic/database/sqlcipher/SQLiteConnection$Operation;->b:J

    .line 50
    .line 51
    iput-object p1, v3, Lnet/zetetic/database/sqlcipher/SQLiteConnection$Operation;->d:Ljava/lang/String;

    .line 52
    .line 53
    iput-object p2, v3, Lnet/zetetic/database/sqlcipher/SQLiteConnection$Operation;->e:Ljava/lang/String;

    .line 54
    .line 55
    if-eqz p3, :cond_4

    .line 56
    .line 57
    iget-object p1, v3, Lnet/zetetic/database/sqlcipher/SQLiteConnection$Operation;->f:Ljava/util/ArrayList;

    .line 58
    .line 59
    if-nez p1, :cond_2

    .line 60
    .line 61
    new-instance p1, Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 64
    .line 65
    .line 66
    iput-object p1, v3, Lnet/zetetic/database/sqlcipher/SQLiteConnection$Operation;->f:Ljava/util/ArrayList;

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 70
    .line 71
    .line 72
    :goto_1
    array-length p1, p3

    .line 73
    if-ge v4, p1, :cond_4

    .line 74
    .line 75
    aget-object p1, p3, v4

    .line 76
    .line 77
    if-eqz p1, :cond_3

    .line 78
    .line 79
    instance-of p2, p1, [B

    .line 80
    .line 81
    if-eqz p2, :cond_3

    .line 82
    .line 83
    iget-object p1, v3, Lnet/zetetic/database/sqlcipher/SQLiteConnection$Operation;->f:Ljava/util/ArrayList;

    .line 84
    .line 85
    sget-object p2, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->n:[B

    .line 86
    .line 87
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_3
    iget-object p2, v3, Lnet/zetetic/database/sqlcipher/SQLiteConnection$Operation;->f:Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_4
    iget p1, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection$OperationLog;->c:I

    .line 100
    .line 101
    add-int/lit8 p2, p1, 0x1

    .line 102
    .line 103
    iput p2, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection$OperationLog;->c:I

    .line 104
    .line 105
    shl-int/lit8 p1, p1, 0x8

    .line 106
    .line 107
    or-int/2addr p1, v1

    .line 108
    iput p1, v3, Lnet/zetetic/database/sqlcipher/SQLiteConnection$Operation;->i:I

    .line 109
    .line 110
    iput v1, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection$OperationLog;->b:I

    .line 111
    .line 112
    monitor-exit v0

    .line 113
    return p1

    .line 114
    :goto_3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 115
    throw p1
.end method

.method public final b(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection$OperationLog;->a:[Lnet/zetetic/database/sqlcipher/SQLiteConnection$Operation;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    and-int/lit16 v1, p1, 0xff

    .line 5
    .line 6
    :try_start_0
    iget-object v2, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection$OperationLog;->a:[Lnet/zetetic/database/sqlcipher/SQLiteConnection$Operation;

    .line 7
    .line 8
    aget-object v1, v2, v1

    .line 9
    .line 10
    iget v2, v1, Lnet/zetetic/database/sqlcipher/SQLiteConnection$Operation;->i:I

    .line 11
    .line 12
    if-ne v2, p1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v1, 0x0

    .line 16
    :goto_0
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 19
    .line 20
    .line 21
    move-result-wide v2

    .line 22
    iput-wide v2, v1, Lnet/zetetic/database/sqlcipher/SQLiteConnection$Operation;->c:J

    .line 23
    .line 24
    const/4 p1, 0x1

    .line 25
    iput-boolean p1, v1, Lnet/zetetic/database/sqlcipher/SQLiteConnection$Operation;->g:Z

    .line 26
    .line 27
    :cond_1
    monitor-exit v0

    .line 28
    return-void

    .line 29
    :catchall_0
    move-exception p1

    .line 30
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    throw p1
.end method

.method public final c(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection$OperationLog;->a:[Lnet/zetetic/database/sqlcipher/SQLiteConnection$Operation;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    and-int/lit16 v1, p1, 0xff

    .line 5
    .line 6
    :try_start_0
    iget-object v2, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection$OperationLog;->a:[Lnet/zetetic/database/sqlcipher/SQLiteConnection$Operation;

    .line 7
    .line 8
    aget-object v1, v2, v1

    .line 9
    .line 10
    iget v2, v1, Lnet/zetetic/database/sqlcipher/SQLiteConnection$Operation;->i:I

    .line 11
    .line 12
    if-ne v2, p1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v1, 0x0

    .line 16
    :goto_0
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 19
    .line 20
    .line 21
    move-result-wide v2

    .line 22
    iput-wide v2, v1, Lnet/zetetic/database/sqlcipher/SQLiteConnection$Operation;->c:J

    .line 23
    .line 24
    const/4 p1, 0x1

    .line 25
    iput-boolean p1, v1, Lnet/zetetic/database/sqlcipher/SQLiteConnection$Operation;->g:Z

    .line 26
    .line 27
    :cond_1
    monitor-exit v0

    .line 28
    return-void

    .line 29
    :catchall_0
    move-exception p1

    .line 30
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    throw p1
.end method

.method public final d(Ljava/lang/RuntimeException;I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection$OperationLog;->a:[Lnet/zetetic/database/sqlcipher/SQLiteConnection$Operation;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    and-int/lit16 v1, p2, 0xff

    .line 5
    .line 6
    :try_start_0
    iget-object v2, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection$OperationLog;->a:[Lnet/zetetic/database/sqlcipher/SQLiteConnection$Operation;

    .line 7
    .line 8
    aget-object v1, v2, v1

    .line 9
    .line 10
    iget v2, v1, Lnet/zetetic/database/sqlcipher/SQLiteConnection$Operation;->i:I

    .line 11
    .line 12
    if-ne v2, p2, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v1, 0x0

    .line 16
    :goto_0
    if-eqz v1, :cond_1

    .line 17
    .line 18
    iput-object p1, v1, Lnet/zetetic/database/sqlcipher/SQLiteConnection$Operation;->h:Ljava/lang/RuntimeException;

    .line 19
    .line 20
    :cond_1
    monitor-exit v0

    .line 21
    return-void

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    throw p1
.end method
