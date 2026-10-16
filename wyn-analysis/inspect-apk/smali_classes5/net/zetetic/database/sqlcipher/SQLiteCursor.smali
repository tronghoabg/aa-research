.class public Lnet/zetetic/database/sqlcipher/SQLiteCursor;
.super Lnet/zetetic/database/AbstractWindowedCursor;
.source "SourceFile"


# instance fields
.field public final l:[Ljava/lang/String;

.field public final m:Lnet/zetetic/database/sqlcipher/SQLiteQuery;

.field public final n:Lnet/zetetic/database/sqlcipher/SQLiteCursorDriver;

.field public o:I

.field public p:I

.field public q:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Lnet/zetetic/database/sqlcipher/SQLiteCursorDriver;Ljava/lang/String;Lnet/zetetic/database/sqlcipher/SQLiteQuery;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lnet/zetetic/database/AbstractWindowedCursor;-><init>()V

    const/4 p2, -0x1

    .line 3
    iput p2, p0, Lnet/zetetic/database/sqlcipher/SQLiteCursor;->o:I

    if-eqz p3, :cond_0

    .line 4
    iput-object p1, p0, Lnet/zetetic/database/sqlcipher/SQLiteCursor;->n:Lnet/zetetic/database/sqlcipher/SQLiteCursorDriver;

    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Lnet/zetetic/database/sqlcipher/SQLiteCursor;->q:Ljava/util/HashMap;

    .line 6
    iput-object p3, p0, Lnet/zetetic/database/sqlcipher/SQLiteCursor;->m:Lnet/zetetic/database/sqlcipher/SQLiteQuery;

    .line 7
    iget-object p1, p3, Lnet/zetetic/database/sqlcipher/SQLiteProgram;->e:[Ljava/lang/String;

    iput-object p1, p0, Lnet/zetetic/database/sqlcipher/SQLiteCursor;->l:[Ljava/lang/String;

    return-void

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "query object cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Lnet/zetetic/database/sqlcipher/SQLiteDatabase;Lnet/zetetic/database/sqlcipher/SQLiteCursorDriver;Ljava/lang/String;Lnet/zetetic/database/sqlcipher/SQLiteQuery;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-direct {p0, p2, p3, p4}, Lnet/zetetic/database/sqlcipher/SQLiteCursor;-><init>(Lnet/zetetic/database/sqlcipher/SQLiteCursorDriver;Ljava/lang/String;Lnet/zetetic/database/sqlcipher/SQLiteQuery;)V

    return-void
.end method


# virtual methods
.method public final b(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/zetetic/database/AbstractWindowedCursor;->k:Lnet/zetetic/database/CursorWindow;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v1, v0, Lnet/zetetic/database/CursorWindow;->c:I

    .line 6
    .line 7
    if-lt p1, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Lnet/zetetic/database/CursorWindow;->y()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    add-int/2addr v0, v1

    .line 14
    if-lt p1, v0, :cond_1

    .line 15
    .line 16
    :cond_0
    invoke-virtual {p0, p1}, Lnet/zetetic/database/sqlcipher/SQLiteCursor;->h(I)V

    .line 17
    .line 18
    .line 19
    :cond_1
    return-void
.end method

.method public final close()V
    .locals 1

    .line 1
    invoke-super {p0}, Lnet/zetetic/database/AbstractCursor;->close()V

    .line 2
    .line 3
    .line 4
    monitor-enter p0

    .line 5
    :try_start_0
    iget-object v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteCursor;->m:Lnet/zetetic/database/sqlcipher/SQLiteQuery;

    .line 6
    .line 7
    invoke-virtual {v0}, Lnet/zetetic/database/sqlcipher/SQLiteClosable;->d()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteCursor;->n:Lnet/zetetic/database/sqlcipher/SQLiteCursorDriver;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    monitor-exit p0

    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception v0

    .line 18
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    throw v0
.end method

.method public final deactivate()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lnet/zetetic/database/AbstractWindowedCursor;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteCursor;->n:Lnet/zetetic/database/sqlcipher/SQLiteCursorDriver;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final finalize()V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lnet/zetetic/database/AbstractWindowedCursor;->k:Lnet/zetetic/database/CursorWindow;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lnet/zetetic/database/sqlcipher/SQLiteCursor;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :catchall_0
    move-exception v0

    .line 10
    goto :goto_1

    .line 11
    :cond_0
    :goto_0
    invoke-super {p0}, Lnet/zetetic/database/AbstractCursor;->finalize()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :goto_1
    invoke-super {p0}, Lnet/zetetic/database/AbstractCursor;->finalize()V

    .line 16
    .line 17
    .line 18
    throw v0
.end method

.method public final getColumnIndex(Ljava/lang/String;)I
    .locals 6

    .line 1
    iget-object v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteCursor;->q:Ljava/util/HashMap;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteCursor;->l:[Ljava/lang/String;

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    new-instance v2, Ljava/util/HashMap;

    .line 9
    .line 10
    const/high16 v3, 0x3f800000    # 1.0f

    .line 11
    .line 12
    invoke-direct {v2, v1, v3}, Ljava/util/HashMap;-><init>(IF)V

    .line 13
    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    :goto_0
    if-ge v3, v1, :cond_0

    .line 17
    .line 18
    aget-object v4, v0, v3

    .line 19
    .line 20
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    invoke-virtual {v2, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    add-int/lit8 v3, v3, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iput-object v2, p0, Lnet/zetetic/database/sqlcipher/SQLiteCursor;->q:Ljava/util/HashMap;

    .line 31
    .line 32
    :cond_1
    const/16 v0, 0x2e

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Ljava/lang/String;->lastIndexOf(I)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    const/4 v1, -0x1

    .line 39
    if-eq v0, v1, :cond_2

    .line 40
    .line 41
    new-instance v2, Ljava/lang/Exception;

    .line 42
    .line 43
    invoke-direct {v2}, Ljava/lang/Exception;-><init>()V

    .line 44
    .line 45
    .line 46
    const-string v3, "requesting column name with table name -- "

    .line 47
    .line 48
    invoke-virtual {v3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    const-string v4, "SQLiteCursor"

    .line 53
    .line 54
    invoke-static {v2, v4, v3}, Lnet/zetetic/database/Logger;->a(Ljava/lang/Exception;Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    add-int/lit8 v0, v0, 0x1

    .line 58
    .line 59
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    :cond_2
    iget-object v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteCursor;->q:Ljava/util/HashMap;

    .line 64
    .line 65
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    check-cast p1, Ljava/lang/Integer;

    .line 70
    .line 71
    if-eqz p1, :cond_3

    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    return p1

    .line 78
    :cond_3
    return v1
.end method

.method public final getColumnNames()[Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteCursor;->l:[Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCount()I
    .locals 2

    .line 1
    iget v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteCursor;->o:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-virtual {p0, v0}, Lnet/zetetic/database/sqlcipher/SQLiteCursor;->h(I)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteCursor;->o:I

    .line 11
    .line 12
    return v0
.end method

.method public final h(I)V
    .locals 9

    .line 1
    const-string v0, "SQLiteCursor"

    .line 2
    .line 3
    const-string v1, "received count(*) from native_fill_window: "

    .line 4
    .line 5
    iget-object v2, p0, Lnet/zetetic/database/sqlcipher/SQLiteCursor;->m:Lnet/zetetic/database/sqlcipher/SQLiteQuery;

    .line 6
    .line 7
    iget-object v3, v2, Lnet/zetetic/database/sqlcipher/SQLiteProgram;->b:Lnet/zetetic/database/sqlcipher/SQLiteDatabase;

    .line 8
    .line 9
    invoke-virtual {v3}, Lnet/zetetic/database/sqlcipher/SQLiteDatabase;->J()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    iget-object v4, p0, Lnet/zetetic/database/AbstractWindowedCursor;->k:Lnet/zetetic/database/CursorWindow;

    .line 14
    .line 15
    const/4 v5, -0x1

    .line 16
    const/4 v6, 0x0

    .line 17
    if-nez v4, :cond_2

    .line 18
    .line 19
    new-instance v4, Lnet/zetetic/database/CursorWindow;

    .line 20
    .line 21
    const/16 v7, 0x4000

    .line 22
    .line 23
    invoke-direct {v4, v3, v7}, Lnet/zetetic/database/CursorWindow;-><init>(Ljava/lang/String;I)V

    .line 24
    .line 25
    .line 26
    iget-object v3, p0, Lnet/zetetic/database/AbstractWindowedCursor;->k:Lnet/zetetic/database/CursorWindow;

    .line 27
    .line 28
    if-eq v4, v3, :cond_1

    .line 29
    .line 30
    if-eqz v3, :cond_0

    .line 31
    .line 32
    invoke-virtual {v3}, Lnet/zetetic/database/sqlcipher/SQLiteClosable;->d()V

    .line 33
    .line 34
    .line 35
    iput-object v6, p0, Lnet/zetetic/database/AbstractWindowedCursor;->k:Lnet/zetetic/database/CursorWindow;

    .line 36
    .line 37
    :cond_0
    iput-object v4, p0, Lnet/zetetic/database/AbstractWindowedCursor;->k:Lnet/zetetic/database/CursorWindow;

    .line 38
    .line 39
    :cond_1
    iput v5, p0, Lnet/zetetic/database/sqlcipher/SQLiteCursor;->o:I

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    invoke-virtual {v4}, Lnet/zetetic/database/CursorWindow;->h()V

    .line 43
    .line 44
    .line 45
    :goto_0
    :try_start_0
    iget v3, p0, Lnet/zetetic/database/sqlcipher/SQLiteCursor;->o:I

    .line 46
    .line 47
    const/4 v4, 0x3

    .line 48
    const/4 v7, 0x0

    .line 49
    if-ne v3, v5, :cond_4

    .line 50
    .line 51
    invoke-static {p1, v7}, Ljava/lang/Math;->max(II)I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    iget-object v7, p0, Lnet/zetetic/database/AbstractWindowedCursor;->k:Lnet/zetetic/database/CursorWindow;

    .line 56
    .line 57
    const/4 v8, 0x1

    .line 58
    invoke-virtual {v2, v7, v3, p1, v8}, Lnet/zetetic/database/sqlcipher/SQLiteQuery;->i(Lnet/zetetic/database/CursorWindow;IIZ)I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    iput p1, p0, Lnet/zetetic/database/sqlcipher/SQLiteCursor;->o:I

    .line 63
    .line 64
    iget-object p1, p0, Lnet/zetetic/database/AbstractWindowedCursor;->k:Lnet/zetetic/database/CursorWindow;

    .line 65
    .line 66
    invoke-virtual {p1}, Lnet/zetetic/database/CursorWindow;->y()I

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    iput p1, p0, Lnet/zetetic/database/sqlcipher/SQLiteCursor;->p:I

    .line 71
    .line 72
    invoke-static {}, Lnet/zetetic/database/Logger;->b()Lnet/zetetic/database/LogTarget;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-interface {p1, v4, v0}, Lnet/zetetic/database/LogTarget;->b(ILjava/lang/String;)Z

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    if-eqz p1, :cond_3

    .line 81
    .line 82
    new-instance p1, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    iget v1, p0, Lnet/zetetic/database/sqlcipher/SQLiteCursor;->o:I

    .line 88
    .line 89
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-static {}, Lnet/zetetic/database/Logger;->b()Lnet/zetetic/database/LogTarget;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-interface {v1, v4, v6, v0, p1}, Lnet/zetetic/database/LogTarget;->a(ILjava/lang/Exception;Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :catch_0
    move-exception p1

    .line 105
    goto :goto_1

    .line 106
    :cond_3
    return-void

    .line 107
    :cond_4
    iget v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteCursor;->p:I

    .line 108
    .line 109
    div-int/2addr v0, v4

    .line 110
    sub-int v0, p1, v0

    .line 111
    .line 112
    invoke-static {v0, v7}, Ljava/lang/Math;->max(II)I

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    iget-object v1, p0, Lnet/zetetic/database/AbstractWindowedCursor;->k:Lnet/zetetic/database/CursorWindow;

    .line 117
    .line 118
    invoke-virtual {v2, v1, v0, p1, v7}, Lnet/zetetic/database/sqlcipher/SQLiteQuery;->i(Lnet/zetetic/database/CursorWindow;IIZ)I
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :goto_1
    iget-object v0, p0, Lnet/zetetic/database/AbstractWindowedCursor;->k:Lnet/zetetic/database/CursorWindow;

    .line 123
    .line 124
    if-eqz v0, :cond_6

    .line 125
    .line 126
    if-eqz v0, :cond_5

    .line 127
    .line 128
    invoke-virtual {v0}, Lnet/zetetic/database/sqlcipher/SQLiteClosable;->d()V

    .line 129
    .line 130
    .line 131
    iput-object v6, p0, Lnet/zetetic/database/AbstractWindowedCursor;->k:Lnet/zetetic/database/CursorWindow;

    .line 132
    .line 133
    :cond_5
    iput-object v6, p0, Lnet/zetetic/database/AbstractWindowedCursor;->k:Lnet/zetetic/database/CursorWindow;

    .line 134
    .line 135
    :cond_6
    iput v5, p0, Lnet/zetetic/database/sqlcipher/SQLiteCursor;->o:I

    .line 136
    .line 137
    throw p1
.end method

.method public final requery()Z
    .locals 6

    .line 1
    iget-boolean v0, p0, Lnet/zetetic/database/AbstractCursor;->b:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    monitor-enter p0

    .line 8
    :try_start_0
    iget-object v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteCursor;->m:Lnet/zetetic/database/sqlcipher/SQLiteQuery;

    .line 9
    .line 10
    iget-object v0, v0, Lnet/zetetic/database/sqlcipher/SQLiteProgram;->b:Lnet/zetetic/database/sqlcipher/SQLiteDatabase;

    .line 11
    .line 12
    invoke-virtual {v0}, Lnet/zetetic/database/sqlcipher/SQLiteDatabase;->isOpen()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    monitor-exit p0

    .line 19
    return v1

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    iget-object v0, p0, Lnet/zetetic/database/AbstractWindowedCursor;->k:Lnet/zetetic/database/CursorWindow;

    .line 23
    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    invoke-virtual {v0}, Lnet/zetetic/database/CursorWindow;->h()V

    .line 27
    .line 28
    .line 29
    :cond_2
    const/4 v0, -0x1

    .line 30
    iput v0, p0, Lnet/zetetic/database/AbstractCursor;->a:I

    .line 31
    .line 32
    iput v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteCursor;->o:I

    .line 33
    .line 34
    iget-object v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteCursor;->n:Lnet/zetetic/database/sqlcipher/SQLiteCursorDriver;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    :try_start_1
    invoke-super {p0}, Lnet/zetetic/database/AbstractCursor;->requery()Z
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0

    .line 41
    .line 42
    .line 43
    const/4 v0, 0x1

    .line 44
    return v0

    .line 45
    :catch_0
    move-exception v0

    .line 46
    const-string v2, "SQLiteCursor"

    .line 47
    .line 48
    new-instance v3, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    const-string v4, "requery() failed "

    .line 51
    .line 52
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-static {}, Lnet/zetetic/database/Logger;->b()Lnet/zetetic/database/LogTarget;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    const/4 v5, 0x5

    .line 71
    invoke-interface {v4, v5, v0, v2, v3}, Lnet/zetetic/database/LogTarget;->a(ILjava/lang/Exception;Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    :goto_0
    return v1

    .line 75
    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 76
    throw v0
.end method
