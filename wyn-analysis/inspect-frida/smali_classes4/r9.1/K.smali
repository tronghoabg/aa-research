.class public final Lr9/K;
.super Lp7/b;
.source "SourceFile"


# instance fields
.field public final e:Lr9/J;

.field public final f:La2/v;

.field public final g:Lr9/O;

.field public final h:LX2/j;

.field public final i:Lme/a;

.field public final j:LA7/c0;

.field public final k:Lr9/I;

.field public l:Landroid/database/sqlite/SQLiteDatabase;

.field public m:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ls9/f;La2/v;LJ5/n;)V
    .locals 1

    .line 1
    new-instance v0, Lr9/J;

    .line 2
    .line 3
    invoke-static {p2, p3}, Lr9/K;->e0(Ljava/lang/String;Ls9/f;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-direct {v0, p1, p4, p2}, Lr9/J;-><init>(Landroid/content/Context;La2/v;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    new-instance p1, Lr9/I;

    .line 14
    .line 15
    invoke-direct {p1, p0}, Lr9/I;-><init>(Lr9/K;)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lr9/K;->k:Lr9/I;

    .line 19
    .line 20
    iput-object v0, p0, Lr9/K;->e:Lr9/J;

    .line 21
    .line 22
    iput-object p4, p0, Lr9/K;->f:La2/v;

    .line 23
    .line 24
    new-instance p1, Lr9/O;

    .line 25
    .line 26
    invoke-direct {p1, p0, p4}, Lr9/O;-><init>(Lr9/K;La2/v;)V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lr9/K;->g:Lr9/O;

    .line 30
    .line 31
    new-instance p1, LX2/j;

    .line 32
    .line 33
    const/16 p2, 0x1c

    .line 34
    .line 35
    invoke-direct {p1, p2, p0, p4}, LX2/j;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, Lr9/K;->h:LX2/j;

    .line 39
    .line 40
    new-instance p1, Lme/a;

    .line 41
    .line 42
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object p0, p1, Lme/a;->a:Ljava/lang/Object;

    .line 46
    .line 47
    iput-object p4, p1, Lme/a;->b:Ljava/lang/Object;

    .line 48
    .line 49
    iput-object p1, p0, Lr9/K;->i:Lme/a;

    .line 50
    .line 51
    new-instance p1, LA7/c0;

    .line 52
    .line 53
    invoke-direct {p1, p0, p5}, LA7/c0;-><init>(Lr9/K;LJ5/n;)V

    .line 54
    .line 55
    .line 56
    iput-object p1, p0, Lr9/K;->j:LA7/c0;

    .line 57
    .line 58
    return-void
.end method

.method public static c0(Landroid/database/sqlite/SQLiteProgram;[Ljava/lang/Object;)V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    array-length v3, p1

    .line 5
    if-ge v2, v3, :cond_6

    .line 6
    .line 7
    aget-object v3, p1, v2

    .line 8
    .line 9
    if-nez v3, :cond_0

    .line 10
    .line 11
    add-int/lit8 v3, v2, 0x1

    .line 12
    .line 13
    invoke-virtual {p0, v3}, Landroid/database/sqlite/SQLiteProgram;->bindNull(I)V

    .line 14
    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    instance-of v4, v3, Ljava/lang/String;

    .line 18
    .line 19
    if-eqz v4, :cond_1

    .line 20
    .line 21
    add-int/lit8 v4, v2, 0x1

    .line 22
    .line 23
    check-cast v3, Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {p0, v4, v3}, Landroid/database/sqlite/SQLiteProgram;->bindString(ILjava/lang/String;)V

    .line 26
    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    instance-of v4, v3, Ljava/lang/Integer;

    .line 30
    .line 31
    if-eqz v4, :cond_2

    .line 32
    .line 33
    add-int/lit8 v4, v2, 0x1

    .line 34
    .line 35
    check-cast v3, Ljava/lang/Integer;

    .line 36
    .line 37
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    int-to-long v5, v3

    .line 42
    invoke-virtual {p0, v4, v5, v6}, Landroid/database/sqlite/SQLiteProgram;->bindLong(IJ)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    instance-of v4, v3, Ljava/lang/Long;

    .line 47
    .line 48
    if-eqz v4, :cond_3

    .line 49
    .line 50
    add-int/lit8 v4, v2, 0x1

    .line 51
    .line 52
    check-cast v3, Ljava/lang/Long;

    .line 53
    .line 54
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 55
    .line 56
    .line 57
    move-result-wide v5

    .line 58
    invoke-virtual {p0, v4, v5, v6}, Landroid/database/sqlite/SQLiteProgram;->bindLong(IJ)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_3
    instance-of v4, v3, Ljava/lang/Double;

    .line 63
    .line 64
    if-eqz v4, :cond_4

    .line 65
    .line 66
    add-int/lit8 v4, v2, 0x1

    .line 67
    .line 68
    check-cast v3, Ljava/lang/Double;

    .line 69
    .line 70
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    .line 71
    .line 72
    .line 73
    move-result-wide v5

    .line 74
    invoke-virtual {p0, v4, v5, v6}, Landroid/database/sqlite/SQLiteProgram;->bindDouble(ID)V

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_4
    instance-of v4, v3, [B

    .line 79
    .line 80
    if-eqz v4, :cond_5

    .line 81
    .line 82
    add-int/lit8 v4, v2, 0x1

    .line 83
    .line 84
    check-cast v3, [B

    .line 85
    .line 86
    invoke-virtual {p0, v4, v3}, Landroid/database/sqlite/SQLiteProgram;->bindBlob(I[B)V

    .line 87
    .line 88
    .line 89
    :goto_1
    add-int/2addr v2, v0

    .line 90
    goto :goto_0

    .line 91
    :cond_5
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    const/4 p1, 0x2

    .line 96
    new-array p1, p1, [Ljava/lang/Object;

    .line 97
    .line 98
    aput-object v3, p1, v1

    .line 99
    .line 100
    aput-object p0, p1, v0

    .line 101
    .line 102
    const-string p0, "Unknown argument %s of type %s"

    .line 103
    .line 104
    invoke-static {p0, p1}, LA6/c;->s(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    const/4 p0, 0x0

    .line 108
    throw p0

    .line 109
    :cond_6
    return-void
.end method

.method public static d0(Landroid/content/Context;Ls9/f;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p2, p1}, Lr9/K;->e0(Ljava/lang/String;Ls9/f;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const-string p1, "-journal"

    .line 14
    .line 15
    invoke-static {p0, p1}, LN0/a;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const-string p2, "-wal"

    .line 20
    .line 21
    invoke-static {p0, p2}, LN0/a;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    new-instance v0, Ljava/io/File;

    .line 26
    .line 27
    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    new-instance p0, Ljava/io/File;

    .line 31
    .line 32
    invoke-direct {p0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    new-instance p1, Ljava/io/File;

    .line 36
    .line 37
    invoke-direct {p1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :try_start_0
    invoke-static {v0}, LA6/h;->s(Ljava/io/File;)V

    .line 41
    .line 42
    .line 43
    invoke-static {p0}, LA6/h;->s(Ljava/io/File;)V

    .line 44
    .line 45
    .line 46
    invoke-static {p1}, LA6/h;->s(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :catch_0
    move-exception p0

    .line 51
    new-instance p1, Lm9/G;

    .line 52
    .line 53
    new-instance p2, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    const-string v0, "Failed to clear persistence."

    .line 56
    .line 57
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    sget-object p2, Lm9/F;->d:Lm9/F;

    .line 68
    .line 69
    invoke-direct {p1, p0, p2}, Lm9/G;-><init>(Ljava/lang/String;Lm9/F;)V

    .line 70
    .line 71
    .line 72
    throw p1
.end method

.method public static e0(Ljava/lang/String;Ls9/f;)Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, "."

    .line 2
    .line 3
    const-string v1, "utf-8"

    .line 4
    .line 5
    const-string v2, "firestore."

    .line 6
    .line 7
    :try_start_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-static {p0, v1}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-object p0, p1, Ls9/f;->a:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {p0, v1}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    iget-object p0, p1, Ls9/f;->b:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {p0, v1}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    return-object p0

    .line 48
    :catch_0
    move-exception p0

    .line 49
    new-instance p1, Ljava/lang/AssertionError;

    .line 50
    .line 51
    invoke-direct {p1, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    throw p1
.end method


# virtual methods
.method public final B()Lr9/w;
    .locals 2

    .line 1
    new-instance v0, Lac/a;

    .line 2
    .line 3
    const/16 v1, 0x13

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Lac/a;-><init>(Ljava/lang/Object;I)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final D()Lr9/z;
    .locals 1

    .line 1
    iget-object v0, p0, Lr9/K;->j:LA7/c0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final E()Lr9/A;
    .locals 1

    .line 1
    iget-object v0, p0, Lr9/K;->i:Lme/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final G()Lr9/Q;
    .locals 1

    .line 1
    iget-object v0, p0, Lr9/K;->g:Lr9/O;

    .line 2
    .line 3
    return-object v0
.end method

.method public final J()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr9/K;->m:Z

    .line 2
    .line 3
    return v0
.end method

.method public final O(Ljava/lang/String;Lw9/o;)Ljava/lang/Object;
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v1, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    aput-object p1, v1, v2

    .line 6
    .line 7
    const-string p1, "b"

    .line 8
    .line 9
    const-string v2, "Starting transaction: %s"

    .line 10
    .line 11
    invoke-static {p1, v2, v0, v1}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lr9/K;->l:Landroid/database/sqlite/SQLiteDatabase;

    .line 15
    .line 16
    iget-object v0, p0, Lr9/K;->k:Lr9/I;

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransactionWithListener(Landroid/database/sqlite/SQLiteTransactionListener;)V

    .line 19
    .line 20
    .line 21
    :try_start_0
    invoke-interface {p2}, Lw9/o;->get()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-object p2, p0, Lr9/K;->l:Landroid/database/sqlite/SQLiteDatabase;

    .line 26
    .line 27
    invoke-virtual {p2}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    .line 30
    iget-object p2, p0, Lr9/K;->l:Landroid/database/sqlite/SQLiteDatabase;

    .line 31
    .line 32
    invoke-virtual {p2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 33
    .line 34
    .line 35
    return-object p1

    .line 36
    :catchall_0
    move-exception p1

    .line 37
    iget-object p2, p0, Lr9/K;->l:Landroid/database/sqlite/SQLiteDatabase;

    .line 38
    .line 39
    invoke-virtual {p2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 40
    .line 41
    .line 42
    throw p1
.end method

.method public final P(Ljava/lang/String;Ljava/lang/Runnable;)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v1, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    aput-object p1, v1, v2

    .line 6
    .line 7
    const-string p1, "b"

    .line 8
    .line 9
    const-string v2, "Starting transaction: %s"

    .line 10
    .line 11
    invoke-static {p1, v2, v0, v1}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lr9/K;->l:Landroid/database/sqlite/SQLiteDatabase;

    .line 15
    .line 16
    iget-object v0, p0, Lr9/K;->k:Lr9/I;

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransactionWithListener(Landroid/database/sqlite/SQLiteTransactionListener;)V

    .line 19
    .line 20
    .line 21
    :try_start_0
    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lr9/K;->l:Landroid/database/sqlite/SQLiteDatabase;

    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lr9/K;->l:Landroid/database/sqlite/SQLiteDatabase;

    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :catchall_0
    move-exception p1

    .line 36
    iget-object p2, p0, Lr9/K;->l:Landroid/database/sqlite/SQLiteDatabase;

    .line 37
    .line 38
    invoke-virtual {p2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 39
    .line 40
    .line 41
    throw p1
.end method

.method public final S()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lr9/K;->m:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    new-array v2, v1, [Ljava/lang/Object;

    .line 5
    .line 6
    const-string v3, "SQLitePersistence shutdown without start!"

    .line 7
    .line 8
    invoke-static {v0, v3, v2}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iput-boolean v1, p0, Lr9/K;->m:Z

    .line 12
    .line 13
    iget-object v0, p0, Lr9/K;->l:Landroid/database/sqlite/SQLiteDatabase;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteClosable;->close()V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput-object v0, p0, Lr9/K;->l:Landroid/database/sqlite/SQLiteDatabase;

    .line 20
    .line 21
    return-void
.end method

.method public final T()V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lr9/K;->m:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    xor-int/2addr v0, v1

    .line 5
    const/4 v2, 0x0

    .line 6
    new-array v3, v2, [Ljava/lang/Object;

    .line 7
    .line 8
    const-string v4, "SQLitePersistence double-started!"

    .line 9
    .line 10
    invoke-static {v0, v4, v3}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iput-boolean v1, p0, Lr9/K;->m:Z

    .line 14
    .line 15
    :try_start_0
    iget-object v0, p0, Lr9/K;->e:Lr9/J;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Lr9/K;->l:Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    .line 23
    iget-object v0, p0, Lr9/K;->g:Lr9/O;

    .line 24
    .line 25
    iget-object v3, v0, Lr9/O;->a:Lr9/K;

    .line 26
    .line 27
    const-string v4, "SELECT highest_target_id, highest_listen_sequence_number, last_remote_snapshot_version_seconds, last_remote_snapshot_version_nanos, target_count FROM target_globals LIMIT 1"

    .line 28
    .line 29
    invoke-virtual {v3, v4}, Lr9/K;->g0(Ljava/lang/String;)Lne/a;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    new-instance v4, Lr9/D;

    .line 34
    .line 35
    const/4 v5, 0x2

    .line 36
    invoke-direct {v4, v0, v5}, Lr9/D;-><init>(Ljava/lang/Object;I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3}, Lne/a;->i()Landroid/database/Cursor;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    :try_start_1
    invoke-interface {v3}, Landroid/database/Cursor;->moveToFirst()Z

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    if-eqz v5, :cond_0

    .line 48
    .line 49
    invoke-interface {v4, v3}, Lw9/g;->accept(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 50
    .line 51
    .line 52
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 53
    .line 54
    .line 55
    const/4 v3, 0x1

    .line 56
    goto :goto_0

    .line 57
    :catchall_0
    move-exception v0

    .line 58
    goto :goto_2

    .line 59
    :cond_0
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 60
    .line 61
    .line 62
    const/4 v3, 0x0

    .line 63
    :goto_0
    if-ne v3, v1, :cond_1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    move v1, v2

    .line 67
    :goto_1
    const-string v3, "Missing target_globals entry"

    .line 68
    .line 69
    new-array v2, v2, [Ljava/lang/Object;

    .line 70
    .line 71
    invoke-static {v1, v3, v2}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    iget-wide v0, v0, Lr9/O;->d:J

    .line 75
    .line 76
    iget-object v2, p0, Lr9/K;->j:LA7/c0;

    .line 77
    .line 78
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    new-instance v3, LJ5/n;

    .line 82
    .line 83
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 84
    .line 85
    .line 86
    iput-wide v0, v3, LJ5/n;->a:J

    .line 87
    .line 88
    iput-object v3, v2, LA7/c0;->c:Ljava/lang/Object;

    .line 89
    .line 90
    return-void

    .line 91
    :goto_2
    if-eqz v3, :cond_2

    .line 92
    .line 93
    :try_start_2
    invoke-interface {v3}, Landroid/database/Cursor;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 94
    .line 95
    .line 96
    goto :goto_3

    .line 97
    :catchall_1
    move-exception v1

    .line 98
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 99
    .line 100
    .line 101
    :cond_2
    :goto_3
    throw v0

    .line 102
    :catch_0
    move-exception v0

    .line 103
    new-instance v1, Ljava/lang/RuntimeException;

    .line 104
    .line 105
    const-string v2, "Failed to gain exclusive lock to the Cloud Firestore client\'s offline persistence. This generally means you are using Cloud Firestore from multiple processes in your app. Keep in mind that multi-process Android apps execute the code in your Application class in all processes, so you may need to avoid initializing Cloud Firestore in your Application class. If you are intentionally using Cloud Firestore from multiple processes, you can only enable offline persistence (that is, call setPersistenceEnabled(true)) in one of them."

    .line 106
    .line 107
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 108
    .line 109
    .line 110
    throw v1
.end method

.method public final varargs f0(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lr9/K;->l:Landroid/database/sqlite/SQLiteDatabase;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final g0(Ljava/lang/String;)Lne/a;
    .locals 2

    .line 1
    new-instance v0, Lne/a;

    .line 2
    .line 3
    iget-object v1, p0, Lr9/K;->l:Landroid/database/sqlite/SQLiteDatabase;

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object v1, v0, Lne/a;->a:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p1, v0, Lne/a;->b:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final u()Lr9/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lr9/K;->h:LX2/j;

    .line 2
    .line 3
    return-object v0
.end method

.method public final x(Ln9/e;)Lr9/b;
    .locals 2

    .line 1
    new-instance v0, Lmd/J;

    .line 2
    .line 3
    iget-object v1, p0, Lr9/K;->f:La2/v;

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p0, v0, Lmd/J;->a:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object v1, v0, Lmd/J;->b:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object p1, p1, Ln9/e;->a:Ljava/lang/String;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-string p1, ""

    .line 18
    .line 19
    :goto_0
    iput-object p1, v0, Lmd/J;->c:Ljava/lang/Object;

    .line 20
    .line 21
    return-object v0
.end method

.method public final y(Ln9/e;)Lr9/f;
    .locals 2

    .line 1
    new-instance v0, Lr9/F;

    .line 2
    .line 3
    iget-object v1, p0, Lr9/K;->f:La2/v;

    .line 4
    .line 5
    invoke-direct {v0, p0, v1, p1}, Lr9/F;-><init>(Lr9/K;La2/v;Ln9/e;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final z(Ln9/e;Lr9/f;)Lr9/v;
    .locals 2

    .line 1
    new-instance v0, LR1/q;

    .line 2
    .line 3
    iget-object v1, p0, Lr9/K;->f:La2/v;

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p0, v0, LR1/q;->b:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object v1, v0, LR1/q;->c:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object p1, p1, Ln9/e;->a:Ljava/lang/String;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-string p1, ""

    .line 18
    .line 19
    :goto_0
    iput-object p1, v0, LR1/q;->e:Ljava/lang/Object;

    .line 20
    .line 21
    sget-object p1, Lv9/B;->u:Lcom/google/protobuf/ByteString;

    .line 22
    .line 23
    iput-object p1, v0, LR1/q;->f:Ljava/lang/Object;

    .line 24
    .line 25
    iput-object p2, v0, LR1/q;->d:Ljava/lang/Object;

    .line 26
    .line 27
    return-object v0
.end method
