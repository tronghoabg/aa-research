.class public final Lnet/zetetic/database/sqlcipher/SQLiteDebug;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/zetetic/database/sqlcipher/SQLiteDebug$PagerStats;,
        Lnet/zetetic/database/sqlcipher/SQLiteDebug$DbStats;
    }
.end annotation


# static fields
.field public static final a:Z

.field public static final b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    invoke-static {}, Lnet/zetetic/database/Logger;->b()Lnet/zetetic/database/LogTarget;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "SQLiteLog"

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    invoke-interface {v0, v2, v1}, Lnet/zetetic/database/LogTarget;->b(ILjava/lang/String;)Z

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lnet/zetetic/database/Logger;->b()Lnet/zetetic/database/LogTarget;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "SQLiteStatements"

    .line 16
    .line 17
    invoke-interface {v0, v2, v1}, Lnet/zetetic/database/LogTarget;->b(ILjava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    sput-boolean v0, Lnet/zetetic/database/sqlcipher/SQLiteDebug;->a:Z

    .line 22
    .line 23
    invoke-static {}, Lnet/zetetic/database/Logger;->b()Lnet/zetetic/database/LogTarget;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, "SQLiteTime"

    .line 28
    .line 29
    invoke-interface {v0, v2, v1}, Lnet/zetetic/database/LogTarget;->b(ILjava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    sput-boolean v0, Lnet/zetetic/database/sqlcipher/SQLiteDebug;->b:Z

    .line 34
    .line 35
    return-void
.end method

.method private static native nativeGetPagerStats(Lnet/zetetic/database/sqlcipher/SQLiteDebug$PagerStats;)V
.end method
