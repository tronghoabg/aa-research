.class public final Lr9/O;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr9/Q;


# instance fields
.field public final a:Lr9/K;

.field public final b:La2/v;

.field public c:I

.field public d:J

.field public e:Ls9/o;

.field public f:J


# direct methods
.method public constructor <init>(Lr9/K;La2/v;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Ls9/o;->b:Ls9/o;

    .line 5
    .line 6
    iput-object v0, p0, Lr9/O;->e:Ls9/o;

    .line 7
    .line 8
    iput-object p1, p0, Lr9/O;->a:Lr9/K;

    .line 9
    .line 10
    iput-object p2, p0, Lr9/O;->b:La2/v;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(Lc9/d;I)V
    .locals 7

    .line 1
    iget-object v0, p0, Lr9/O;->a:Lr9/K;

    .line 2
    .line 3
    iget-object v1, v0, Lr9/K;->l:Landroid/database/sqlite/SQLiteDatabase;

    .line 4
    .line 5
    const-string v2, "DELETE FROM target_documents WHERE target_id = ? AND path = ?"

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {p1}, Lc9/d;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :goto_0
    move-object v2, p1

    .line 16
    check-cast v2, LA7/v;

    .line 17
    .line 18
    iget-object v3, v2, LA7/v;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v3, Ljava/util/Iterator;

    .line 21
    .line 22
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    invoke-virtual {v2}, LA7/v;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Ls9/h;

    .line 33
    .line 34
    iget-object v3, v2, Ls9/h;->a:Ls9/m;

    .line 35
    .line 36
    invoke-static {v3}, Lka/e0;->n(Ls9/e;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    const/4 v5, 0x2

    .line 45
    new-array v5, v5, [Ljava/lang/Object;

    .line 46
    .line 47
    const/4 v6, 0x0

    .line 48
    aput-object v4, v5, v6

    .line 49
    .line 50
    const/4 v4, 0x1

    .line 51
    aput-object v3, v5, v4

    .line 52
    .line 53
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteProgram;->clearBindings()V

    .line 54
    .line 55
    .line 56
    invoke-static {v1, v5}, Lr9/K;->c0(Landroid/database/sqlite/SQLiteProgram;[Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteStatement;->executeUpdateDelete()I

    .line 60
    .line 61
    .line 62
    iget-object v3, v0, Lr9/K;->j:LA7/c0;

    .line 63
    .line 64
    invoke-virtual {v3, v2}, LA7/c0;->m(Ls9/h;)V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    return-void
.end method

.method public final b(Lr9/S;)V
    .locals 7

    .line 1
    invoke-virtual {p0, p1}, Lr9/O;->l(Lr9/S;)V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lr9/O;->c:I

    .line 5
    .line 6
    iget v1, p1, Lr9/S;->b:I

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    if-le v1, v0, :cond_0

    .line 10
    .line 11
    iput v1, p0, Lr9/O;->c:I

    .line 12
    .line 13
    move v0, v2

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    :goto_0
    iget-wide v3, p0, Lr9/O;->d:J

    .line 17
    .line 18
    iget-wide v5, p1, Lr9/S;->c:J

    .line 19
    .line 20
    cmp-long p1, v5, v3

    .line 21
    .line 22
    if-lez p1, :cond_1

    .line 23
    .line 24
    iput-wide v5, p0, Lr9/O;->d:J

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    move v2, v0

    .line 28
    :goto_1
    if-eqz v2, :cond_2

    .line 29
    .line 30
    invoke-virtual {p0}, Lr9/O;->m()V

    .line 31
    .line 32
    .line 33
    :cond_2
    return-void
.end method

.method public final c(Lc9/d;I)V
    .locals 7

    .line 1
    iget-object v0, p0, Lr9/O;->a:Lr9/K;

    .line 2
    .line 3
    iget-object v1, v0, Lr9/K;->l:Landroid/database/sqlite/SQLiteDatabase;

    .line 4
    .line 5
    const-string v2, "INSERT OR IGNORE INTO target_documents (target_id, path) VALUES (?, ?)"

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {p1}, Lc9/d;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :goto_0
    move-object v2, p1

    .line 16
    check-cast v2, LA7/v;

    .line 17
    .line 18
    iget-object v3, v2, LA7/v;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v3, Ljava/util/Iterator;

    .line 21
    .line 22
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    invoke-virtual {v2}, LA7/v;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Ls9/h;

    .line 33
    .line 34
    iget-object v3, v2, Ls9/h;->a:Ls9/m;

    .line 35
    .line 36
    invoke-static {v3}, Lka/e0;->n(Ls9/e;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    const/4 v5, 0x2

    .line 45
    new-array v5, v5, [Ljava/lang/Object;

    .line 46
    .line 47
    const/4 v6, 0x0

    .line 48
    aput-object v4, v5, v6

    .line 49
    .line 50
    const/4 v4, 0x1

    .line 51
    aput-object v3, v5, v4

    .line 52
    .line 53
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteProgram;->clearBindings()V

    .line 54
    .line 55
    .line 56
    invoke-static {v1, v5}, Lr9/K;->c0(Landroid/database/sqlite/SQLiteProgram;[Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteStatement;->executeUpdateDelete()I

    .line 60
    .line 61
    .line 62
    iget-object v3, v0, Lr9/K;->j:LA7/c0;

    .line 63
    .line 64
    invoke-virtual {v3, v2}, LA7/c0;->m(Ls9/h;)V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    return-void
.end method

.method public final d(Lp9/A;)Lr9/S;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1}, Lp9/A;->b()Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    iget-object v2, p0, Lr9/O;->a:Lr9/K;

    .line 7
    .line 8
    const-string v3, "SELECT target_proto FROM targets WHERE canonical_id = ?"

    .line 9
    .line 10
    invoke-virtual {v2, v3}, Lr9/K;->g0(Ljava/lang/String;)Lne/a;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const/4 v3, 0x1

    .line 15
    new-array v3, v3, [Ljava/lang/Object;

    .line 16
    .line 17
    aput-object v1, v3, v0

    .line 18
    .line 19
    invoke-virtual {v2, v3}, Lne/a;->b([Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2}, Lne/a;->i()Landroid/database/Cursor;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const/4 v2, 0x0

    .line 27
    :cond_0
    :goto_0
    :try_start_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    invoke-interface {v1, v0}, Landroid/database/Cursor;->getBlob(I)[B

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {p0, v3}, Lr9/O;->k([B)Lr9/S;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    iget-object v4, v3, Lr9/S;->a:Lp9/A;

    .line 42
    .line 43
    invoke-virtual {p1, v4}, Lp9/A;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    if-eqz v4, :cond_0

    .line 48
    .line 49
    move-object v2, v3

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 52
    .line 53
    .line 54
    return-object v2

    .line 55
    :catchall_0
    move-exception p1

    .line 56
    if-eqz v1, :cond_2

    .line 57
    .line 58
    :try_start_1
    invoke-interface {v1}, Landroid/database/Cursor;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :catchall_1
    move-exception v0

    .line 63
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 64
    .line 65
    .line 66
    :cond_2
    :goto_1
    throw p1
.end method

.method public final e(Ls9/o;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr9/O;->e:Ls9/o;

    .line 2
    .line 3
    invoke-virtual {p0}, Lr9/O;->m()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final f(Lr9/S;)V
    .locals 4

    .line 1
    invoke-virtual {p0, p1}, Lr9/O;->l(Lr9/S;)V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lr9/O;->c:I

    .line 5
    .line 6
    iget v1, p1, Lr9/S;->b:I

    .line 7
    .line 8
    if-le v1, v0, :cond_0

    .line 9
    .line 10
    iput v1, p0, Lr9/O;->c:I

    .line 11
    .line 12
    :cond_0
    iget-wide v0, p0, Lr9/O;->d:J

    .line 13
    .line 14
    iget-wide v2, p1, Lr9/S;->c:J

    .line 15
    .line 16
    cmp-long p1, v2, v0

    .line 17
    .line 18
    if-lez p1, :cond_1

    .line 19
    .line 20
    iput-wide v2, p0, Lr9/O;->d:J

    .line 21
    .line 22
    :cond_1
    iget-wide v0, p0, Lr9/O;->f:J

    .line 23
    .line 24
    const-wide/16 v2, 0x1

    .line 25
    .line 26
    add-long/2addr v0, v2

    .line 27
    iput-wide v0, p0, Lr9/O;->f:J

    .line 28
    .line 29
    invoke-virtual {p0}, Lr9/O;->m()V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final g()I
    .locals 1

    .line 1
    iget v0, p0, Lr9/O;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public final h(I)Lc9/d;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    sget-object v1, Ls9/h;->c:Lc9/d;

    .line 3
    .line 4
    iget-object v2, p0, Lr9/O;->a:Lr9/K;

    .line 5
    .line 6
    const-string v3, "SELECT path FROM target_documents WHERE target_id = ?"

    .line 7
    .line 8
    invoke-virtual {v2, v3}, Lr9/K;->g0(Ljava/lang/String;)Lne/a;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const/4 v3, 0x1

    .line 17
    new-array v3, v3, [Ljava/lang/Object;

    .line 18
    .line 19
    aput-object p1, v3, v0

    .line 20
    .line 21
    invoke-virtual {v2, v3}, Lne/a;->b([Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2}, Lne/a;->i()Landroid/database/Cursor;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    :goto_0
    :try_start_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-static {v2}, Lka/e0;->l(Ljava/lang/String;)Ls9/m;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    new-instance v3, Ls9/h;

    .line 43
    .line 44
    invoke-direct {v3, v2}, Ls9/h;-><init>(Ls9/m;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v3}, Lc9/d;->a(Ljava/lang/Object;)Lc9/d;

    .line 48
    .line 49
    .line 50
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 53
    .line 54
    .line 55
    return-object v1

    .line 56
    :catchall_0
    move-exception v0

    .line 57
    if-eqz p1, :cond_1

    .line 58
    .line 59
    :try_start_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :catchall_1
    move-exception p1

    .line 64
    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    :cond_1
    :goto_1
    throw v0
.end method

.method public final i()Ls9/o;
    .locals 1

    .line 1
    iget-object v0, p0, Lr9/O;->e:Ls9/o;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j(I)V
    .locals 2

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x1

    .line 6
    new-array v0, v0, [Ljava/lang/Object;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    aput-object p1, v0, v1

    .line 10
    .line 11
    iget-object p1, p0, Lr9/O;->a:Lr9/K;

    .line 12
    .line 13
    const-string v1, "DELETE FROM target_documents WHERE target_id = ?"

    .line 14
    .line 15
    invoke-virtual {p1, v1, v0}, Lr9/K;->f0(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final k([B)Lr9/S;
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lr9/O;->b:La2/v;

    .line 2
    .line 3
    invoke-static {p1}, Lu9/j;->s([B)Lu9/j;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {v0, p1}, La2/v;->u(Lu9/j;)Lr9/S;

    .line 8
    .line 9
    .line 10
    move-result-object p1
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    return-object p1

    .line 12
    :catch_0
    move-exception p1

    .line 13
    const-string v0, "TargetData failed to parse: %s"

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    new-array v1, v1, [Ljava/lang/Object;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    aput-object p1, v1, v2

    .line 20
    .line 21
    invoke-static {v0, v1}, LA6/c;->s(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    throw p1
.end method

.method public final l(Lr9/S;)V
    .locals 13

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x2

    .line 4
    iget-object v3, p1, Lr9/S;->a:Lp9/A;

    .line 5
    .line 6
    invoke-virtual {v3}, Lp9/A;->b()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v4

    .line 10
    iget-object v5, p1, Lr9/S;->e:Ls9/o;

    .line 11
    .line 12
    iget-object v6, v5, Ls9/o;->a:Ls8/q;

    .line 13
    .line 14
    iget-object v7, p0, Lr9/O;->b:La2/v;

    .line 15
    .line 16
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    sget-object v8, Lr9/y;->a:Lr9/y;

    .line 20
    .line 21
    iget-object v9, p1, Lr9/S;->d:Lr9/y;

    .line 22
    .line 23
    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v10

    .line 27
    new-array v11, v2, [Ljava/lang/Object;

    .line 28
    .line 29
    aput-object v8, v11, v1

    .line 30
    .line 31
    aput-object v9, v11, v0

    .line 32
    .line 33
    const-string v8, "Only queries with purpose %s may be stored, got %s"

    .line 34
    .line 35
    invoke-static {v10, v8, v11}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-static {}, Lu9/j;->r()Lu9/h;

    .line 39
    .line 40
    .line 41
    move-result-object v8

    .line 42
    iget v9, p1, Lr9/S;->b:I

    .line 43
    .line 44
    invoke-virtual {v8, v9}, Lu9/h;->h(I)V

    .line 45
    .line 46
    .line 47
    iget-wide v10, p1, Lr9/S;->c:J

    .line 48
    .line 49
    invoke-virtual {v8, v10, v11}, Lu9/h;->d(J)V

    .line 50
    .line 51
    .line 52
    iget-object v7, v7, La2/v;->b:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v7, Lv9/o;

    .line 55
    .line 56
    iget-object v12, p1, Lr9/S;->f:Ls9/o;

    .line 57
    .line 58
    iget-object v12, v12, Ls9/o;->a:Ls8/q;

    .line 59
    .line 60
    invoke-static {v12}, Lv9/o;->l(Ls8/q;)Lcom/google/protobuf/Timestamp;

    .line 61
    .line 62
    .line 63
    move-result-object v12

    .line 64
    invoke-virtual {v8, v12}, Lu9/h;->c(Lcom/google/protobuf/Timestamp;)V

    .line 65
    .line 66
    .line 67
    iget-object v5, v5, Ls9/o;->a:Ls8/q;

    .line 68
    .line 69
    invoke-static {v5}, Lv9/o;->l(Ls8/q;)Lcom/google/protobuf/Timestamp;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    invoke-virtual {v8, v5}, Lu9/h;->g(Lcom/google/protobuf/Timestamp;)V

    .line 74
    .line 75
    .line 76
    iget-object p1, p1, Lr9/S;->g:Lcom/google/protobuf/ByteString;

    .line 77
    .line 78
    invoke-virtual {v8, p1}, Lu9/h;->f(Lcom/google/protobuf/ByteString;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v3}, Lp9/A;->e()Z

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    if-eqz v5, :cond_0

    .line 86
    .line 87
    invoke-static {}, Lka/l1;->f()Lka/k1;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    iget-object v7, v7, Lv9/o;->a:Ls9/f;

    .line 92
    .line 93
    iget-object v3, v3, Lp9/A;->d:Ls9/m;

    .line 94
    .line 95
    invoke-static {v7, v3}, Lv9/o;->k(Ls9/f;Ls9/m;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    invoke-virtual {v5, v3}, Lka/k1;->a(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v5}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    check-cast v3, Lka/l1;

    .line 107
    .line 108
    invoke-virtual {v8, v3}, Lu9/h;->b(Lka/l1;)V

    .line 109
    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_0
    invoke-virtual {v7, v3}, Lv9/o;->j(Lp9/A;)Lka/n1;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    invoke-virtual {v8, v3}, Lu9/h;->e(Lka/n1;)V

    .line 117
    .line 118
    .line 119
    :goto_0
    invoke-virtual {v8}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    check-cast v3, Lu9/j;

    .line 124
    .line 125
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    iget-wide v7, v6, Ls8/q;->a:J

    .line 130
    .line 131
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 132
    .line 133
    .line 134
    move-result-object v7

    .line 135
    iget v6, v6, Ls8/q;->b:I

    .line 136
    .line 137
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 138
    .line 139
    .line 140
    move-result-object v6

    .line 141
    invoke-virtual {p1}, Lcom/google/protobuf/ByteString;->toByteArray()[B

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 146
    .line 147
    .line 148
    move-result-object v8

    .line 149
    invoke-virtual {v3}, Lcom/google/protobuf/AbstractMessageLite;->toByteArray()[B

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    const/4 v9, 0x7

    .line 154
    new-array v9, v9, [Ljava/lang/Object;

    .line 155
    .line 156
    aput-object v5, v9, v1

    .line 157
    .line 158
    aput-object v4, v9, v0

    .line 159
    .line 160
    aput-object v7, v9, v2

    .line 161
    .line 162
    const/4 v0, 0x3

    .line 163
    aput-object v6, v9, v0

    .line 164
    .line 165
    const/4 v0, 0x4

    .line 166
    aput-object p1, v9, v0

    .line 167
    .line 168
    const/4 p1, 0x5

    .line 169
    aput-object v8, v9, p1

    .line 170
    .line 171
    const/4 p1, 0x6

    .line 172
    aput-object v3, v9, p1

    .line 173
    .line 174
    iget-object p1, p0, Lr9/O;->a:Lr9/K;

    .line 175
    .line 176
    const-string v0, "INSERT OR REPLACE INTO targets (target_id, canonical_id, snapshot_version_seconds, snapshot_version_nanos, resume_token, last_listen_sequence_number, target_proto) VALUES (?, ?, ?, ?, ?, ?, ?)"

    .line 177
    .line 178
    invoke-virtual {p1, v0, v9}, Lr9/K;->f0(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    return-void
.end method

.method public final m()V
    .locals 7

    .line 1
    iget v0, p0, Lr9/O;->c:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-wide v1, p0, Lr9/O;->d:J

    .line 8
    .line 9
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p0, Lr9/O;->e:Ls9/o;

    .line 14
    .line 15
    iget-object v2, v2, Ls9/o;->a:Ls8/q;

    .line 16
    .line 17
    iget-wide v2, v2, Ls8/q;->a:J

    .line 18
    .line 19
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    iget-object v3, p0, Lr9/O;->e:Ls9/o;

    .line 24
    .line 25
    iget-object v3, v3, Ls9/o;->a:Ls8/q;

    .line 26
    .line 27
    iget v3, v3, Ls8/q;->b:I

    .line 28
    .line 29
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    iget-wide v4, p0, Lr9/O;->f:J

    .line 34
    .line 35
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    const/4 v5, 0x5

    .line 40
    new-array v5, v5, [Ljava/lang/Object;

    .line 41
    .line 42
    const/4 v6, 0x0

    .line 43
    aput-object v0, v5, v6

    .line 44
    .line 45
    const/4 v0, 0x1

    .line 46
    aput-object v1, v5, v0

    .line 47
    .line 48
    const/4 v0, 0x2

    .line 49
    aput-object v2, v5, v0

    .line 50
    .line 51
    const/4 v0, 0x3

    .line 52
    aput-object v3, v5, v0

    .line 53
    .line 54
    const/4 v0, 0x4

    .line 55
    aput-object v4, v5, v0

    .line 56
    .line 57
    iget-object v0, p0, Lr9/O;->a:Lr9/K;

    .line 58
    .line 59
    const-string v1, "UPDATE target_globals SET highest_target_id = ?, highest_listen_sequence_number = ?, last_remote_snapshot_version_seconds = ?, last_remote_snapshot_version_nanos = ?, target_count = ?"

    .line 60
    .line 61
    invoke-virtual {v0, v1, v5}, Lr9/K;->f0(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    return-void
.end method
