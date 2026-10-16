.class public Lnet/zetetic/database/sqlcipher/SupportHelper;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo3/d;


# instance fields
.field public final a:Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;


# direct methods
.method public constructor <init>(Lo3/b;[BLnet/zetetic/database/sqlcipher/SQLiteDatabaseHook;Z)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    .line 1
    invoke-direct/range {v0 .. v5}, Lnet/zetetic/database/sqlcipher/SupportHelper;-><init>(Lo3/b;[BLnet/zetetic/database/sqlcipher/SQLiteDatabaseHook;ZI)V

    return-void
.end method

.method public constructor <init>(Lo3/b;[BLnet/zetetic/database/sqlcipher/SQLiteDatabaseHook;ZI)V
    .locals 9

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Lnet/zetetic/database/sqlcipher/SupportHelper$1;

    iget-object v1, p1, Lo3/b;->a:Landroid/content/Context;

    iget-object v2, p1, Lo3/b;->c:LN2/j;

    iget v4, v2, LN2/j;->b:I

    iget-object v2, p1, Lo3/b;->b:Ljava/lang/String;

    move-object v8, p1

    move-object v3, p2

    move-object v6, p3

    move v7, p4

    move v5, p5

    invoke-direct/range {v0 .. v8}, Lnet/zetetic/database/sqlcipher/SupportHelper$1;-><init>(Landroid/content/Context;Ljava/lang/String;[BIILnet/zetetic/database/sqlcipher/SQLiteDatabaseHook;ZLo3/b;)V

    iput-object v0, p0, Lnet/zetetic/database/sqlcipher/SupportHelper;->a:Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;

    return-void
.end method


# virtual methods
.method public final I()Lo3/a;
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/zetetic/database/sqlcipher/SupportHelper;->a:Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    :try_start_0
    invoke-virtual {v0, v1}, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;->a(Z)Lnet/zetetic/database/sqlcipher/SQLiteDatabase;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    monitor-exit v0

    .line 10
    return-object v1

    .line 11
    :catchall_0
    move-exception v1

    .line 12
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    throw v1
.end method

.method public final close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/zetetic/database/sqlcipher/SupportHelper;->a:Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;

    .line 2
    .line 3
    invoke-virtual {v0}, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setWriteAheadLoggingEnabled(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/zetetic/database/sqlcipher/SupportHelper;->a:Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;->setWriteAheadLoggingEnabled(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
