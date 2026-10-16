.class Lnet/zetetic/database/sqlcipher/SupportHelper$1;
.super Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnet/zetetic/database/sqlcipher/SupportHelper;-><init>(Lo3/b;[BLnet/zetetic/database/sqlcipher/SQLiteDatabaseHook;ZI)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic l:Lo3/b;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;[BIILnet/zetetic/database/sqlcipher/SQLiteDatabaseHook;ZLo3/b;)V
    .locals 10

    .line 1
    move-object/from16 v0, p8

    .line 2
    .line 3
    iput-object v0, p0, Lnet/zetetic/database/sqlcipher/SupportHelper$1;->l:Lo3/b;

    .line 4
    .line 5
    const/4 v4, 0x0

    .line 6
    const/4 v7, 0x0

    .line 7
    move-object v0, p0

    .line 8
    move-object v1, p1

    .line 9
    move-object v2, p2

    .line 10
    move-object v3, p3

    .line 11
    move v5, p4

    .line 12
    move v6, p5

    .line 13
    move-object/from16 v8, p6

    .line 14
    .line 15
    move/from16 v9, p7

    .line 16
    .line 17
    invoke-direct/range {v0 .. v9}, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;[BLnet/zetetic/database/sqlcipher/SQLiteDatabase$CursorFactory;IILnet/zetetic/database/DatabaseErrorHandler;Lnet/zetetic/database/sqlcipher/SQLiteDatabaseHook;Z)V

    .line 18
    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final b(Lnet/zetetic/database/sqlcipher/SQLiteDatabase;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/zetetic/database/sqlcipher/SupportHelper$1;->l:Lo3/b;

    .line 2
    .line 3
    iget-object v0, v0, Lo3/b;->c:LN2/j;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, LN2/j;->i(Lo3/a;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final d(Lnet/zetetic/database/sqlcipher/SQLiteDatabase;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/zetetic/database/sqlcipher/SupportHelper$1;->l:Lo3/b;

    .line 2
    .line 3
    iget-object v0, v0, Lo3/b;->c:LN2/j;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, LN2/j;->j(Lo3/a;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final h(Lnet/zetetic/database/sqlcipher/SQLiteDatabase;II)V
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/zetetic/database/sqlcipher/SupportHelper$1;->l:Lo3/b;

    .line 2
    .line 3
    iget-object v0, v0, Lo3/b;->c:LN2/j;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3}, LN2/j;->k(Lo3/a;II)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final i(Lnet/zetetic/database/sqlcipher/SQLiteDatabase;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/zetetic/database/sqlcipher/SupportHelper$1;->l:Lo3/b;

    .line 2
    .line 3
    iget-object v0, v0, Lo3/b;->c:LN2/j;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, LN2/j;->l(Lo3/a;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final o(Lnet/zetetic/database/sqlcipher/SQLiteDatabase;II)V
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/zetetic/database/sqlcipher/SupportHelper$1;->l:Lo3/b;

    .line 2
    .line 3
    iget-object v0, v0, Lo3/b;->c:LN2/j;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3}, LN2/j;->m(Lo3/a;II)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
