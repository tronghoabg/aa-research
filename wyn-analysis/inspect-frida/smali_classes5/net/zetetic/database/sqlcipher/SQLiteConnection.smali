.class public final Lnet/zetetic/database/sqlcipher/SQLiteConnection;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/CancellationSignal$OnCancelListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/zetetic/database/sqlcipher/SQLiteConnection$OperationLog;,
        Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatementCache;,
        Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;,
        Lnet/zetetic/database/sqlcipher/SQLiteConnection$Operation;
    }
.end annotation


# static fields
.field public static final m:[Ljava/lang/String;

.field public static final n:[B


# instance fields
.field public final a:Lnet/zetetic/database/sqlcipher/CloseGuard;

.field public final b:Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool;

.field public final c:Lnet/zetetic/database/sqlcipher/SQLiteDatabaseConfiguration;

.field public final d:I

.field public final e:Z

.field public final f:Z

.field public final g:Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatementCache;

.field public h:Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;

.field public final i:Lnet/zetetic/database/sqlcipher/SQLiteConnection$OperationLog;

.field public j:J

.field public k:Z

.field public l:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v1, v0, [Ljava/lang/String;

    .line 3
    .line 4
    sput-object v1, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->m:[Ljava/lang/String;

    .line 5
    .line 6
    new-array v0, v0, [B

    .line 7
    .line 8
    sput-object v0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->n:[B

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool;Lnet/zetetic/database/sqlcipher/SQLiteDatabaseConfiguration;IZ)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lnet/zetetic/database/sqlcipher/CloseGuard;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->a:Lnet/zetetic/database/sqlcipher/CloseGuard;

    .line 10
    .line 11
    new-instance v1, Lnet/zetetic/database/sqlcipher/SQLiteConnection$OperationLog;

    .line 12
    .line 13
    invoke-direct {v1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection$OperationLog;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->i:Lnet/zetetic/database/sqlcipher/SQLiteConnection$OperationLog;

    .line 17
    .line 18
    iput-object p1, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->b:Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool;

    .line 19
    .line 20
    new-instance p1, Lnet/zetetic/database/sqlcipher/SQLiteDatabaseConfiguration;

    .line 21
    .line 22
    invoke-direct {p1, p2}, Lnet/zetetic/database/sqlcipher/SQLiteDatabaseConfiguration;-><init>(Lnet/zetetic/database/sqlcipher/SQLiteDatabaseConfiguration;)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->c:Lnet/zetetic/database/sqlcipher/SQLiteDatabaseConfiguration;

    .line 26
    .line 27
    iput p3, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->d:I

    .line 28
    .line 29
    iput-boolean p4, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->e:Z

    .line 30
    .line 31
    iget p2, p2, Lnet/zetetic/database/sqlcipher/SQLiteDatabaseConfiguration;->c:I

    .line 32
    .line 33
    const/4 p3, 0x1

    .line 34
    and-int/2addr p2, p3

    .line 35
    if-eqz p2, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 p3, 0x0

    .line 39
    :goto_0
    iput-boolean p3, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->f:Z

    .line 40
    .line 41
    new-instance p2, Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatementCache;

    .line 42
    .line 43
    iget p1, p1, Lnet/zetetic/database/sqlcipher/SQLiteDatabaseConfiguration;->d:I

    .line 44
    .line 45
    invoke-direct {p2, p0, p1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatementCache;-><init>(Lnet/zetetic/database/sqlcipher/SQLiteConnection;I)V

    .line 46
    .line 47
    .line 48
    iput-object p2, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->g:Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatementCache;

    .line 49
    .line 50
    invoke-virtual {v0}, Lnet/zetetic/database/sqlcipher/CloseGuard;->a()V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "0"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const-string p0, "OFF"

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string v0, "1"

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    const-string p0, "NORMAL"

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_1
    const-string v0, "2"

    .line 24
    .line 25
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    const-string p0, "FULL"

    .line 32
    .line 33
    :cond_2
    return-object p0
.end method

.method private static native nativeBindBlob(JJI[B)V
.end method

.method private static native nativeBindDouble(JJID)V
.end method

.method private static native nativeBindLong(JJIJ)V
.end method

.method private static native nativeBindNull(JJI)V
.end method

.method private static native nativeBindString(JJILjava/lang/String;)V
.end method

.method private static native nativeCancel(J)V
.end method

.method private static native nativeClose(J)V
.end method

.method private static native nativeExecute(JJ)V
.end method

.method private static native nativeExecuteForBlobFileDescriptor(JJ)I
.end method

.method private static native nativeExecuteForChangedRowCount(JJ)I
.end method

.method private static native nativeExecuteForCursorWindow(JJJIIZ)J
.end method

.method private static native nativeExecuteForLastInsertedRowId(JJ)J
.end method

.method private static native nativeExecuteForLong(JJ)J
.end method

.method private static native nativeExecuteForString(JJ)Ljava/lang/String;
.end method

.method private static native nativeExecuteRaw(JJ)V
.end method

.method private static native nativeFinalizeStatement(JJ)V
.end method

.method private static native nativeGetColumnCount(JJ)I
.end method

.method private static native nativeGetColumnName(JJI)Ljava/lang/String;
.end method

.method private static native nativeGetDbLookaside(J)I
.end method

.method private static native nativeGetParameterCount(JJ)I
.end method

.method private static native nativeHasCodec()Z
.end method

.method private static native nativeIsReadOnly(JJ)Z
.end method

.method private static native nativeKey(J[B)I
.end method

.method private static native nativeOpen(Ljava/lang/String;ILjava/lang/String;ZZ)J
.end method

.method private static native nativePrepareStatement(JLjava/lang/String;)J
.end method

.method private static native nativeReKey(J[B)I
.end method

.method private static native nativeRegisterCustomFunction(JLnet/zetetic/database/sqlcipher/SQLiteCustomFunction;)V
.end method

.method private static native nativeRegisterLocalizedCollators(JLjava/lang/String;)V
.end method

.method private static native nativeResetCancel(JZ)V
.end method

.method private static native nativeResetStatementAndClearBindings(JJ)V
.end method

.method public static o()Z
    .locals 1

    .line 1
    invoke-static {}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->nativeHasCodec()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;
    .locals 12

    .line 1
    iget-object v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->g:Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatementCache;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    const/4 v3, 0x0

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    iget-boolean v4, v1, Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;->g:Z

    .line 14
    .line 15
    if-nez v4, :cond_0

    .line 16
    .line 17
    return-object v1

    .line 18
    :cond_0
    move v4, v2

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    move v4, v3

    .line 21
    :goto_0
    iget-wide v5, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->j:J

    .line 22
    .line 23
    invoke-static {v5, v6, p1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->nativePrepareStatement(JLjava/lang/String;)J

    .line 24
    .line 25
    .line 26
    move-result-wide v5

    .line 27
    :try_start_0
    iget-wide v7, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->j:J

    .line 28
    .line 29
    invoke-static {v7, v8, v5, v6}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->nativeGetParameterCount(JJ)I

    .line 30
    .line 31
    .line 32
    move-result v7

    .line 33
    invoke-static {p1}, Lnet/zetetic/database/DatabaseUtils;->a(Ljava/lang/String;)I

    .line 34
    .line 35
    .line 36
    move-result v8

    .line 37
    iget-wide v9, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->j:J

    .line 38
    .line 39
    invoke-static {v9, v10, v5, v6}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->nativeIsReadOnly(JJ)Z

    .line 40
    .line 41
    .line 42
    move-result v9

    .line 43
    iget-object v10, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->h:Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;

    .line 44
    .line 45
    if-eqz v10, :cond_2

    .line 46
    .line 47
    iget-object v11, v10, Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;->a:Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;

    .line 48
    .line 49
    iput-object v11, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->h:Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;

    .line 50
    .line 51
    const/4 v11, 0x0

    .line 52
    iput-object v11, v10, Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;->a:Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;

    .line 53
    .line 54
    iput-boolean v3, v10, Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;->f:Z

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    new-instance v10, Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;

    .line 58
    .line 59
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 60
    .line 61
    .line 62
    :goto_1
    iput-object p1, v10, Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;->b:Ljava/lang/String;

    .line 63
    .line 64
    iput-wide v5, v10, Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;->c:J

    .line 65
    .line 66
    iput v7, v10, Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;->d:I

    .line 67
    .line 68
    iput-boolean v9, v10, Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;->e:Z
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 69
    .line 70
    if-nez v4, :cond_4

    .line 71
    .line 72
    const/4 v1, 0x2

    .line 73
    if-eq v8, v1, :cond_3

    .line 74
    .line 75
    if-ne v8, v2, :cond_4

    .line 76
    .line 77
    :cond_3
    :try_start_1
    invoke-virtual {v0, p1, v10}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    iput-boolean v2, v10, Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;->f:Z
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :catch_0
    move-exception p1

    .line 84
    move-object v1, v10

    .line 85
    goto :goto_3

    .line 86
    :cond_4
    :goto_2
    iput-boolean v2, v10, Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;->g:Z

    .line 87
    .line 88
    return-object v10

    .line 89
    :catch_1
    move-exception p1

    .line 90
    :goto_3
    if-eqz v1, :cond_5

    .line 91
    .line 92
    iget-boolean v0, v1, Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;->f:Z

    .line 93
    .line 94
    if-nez v0, :cond_6

    .line 95
    .line 96
    :cond_5
    iget-wide v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->j:J

    .line 97
    .line 98
    invoke-static {v0, v1, v5, v6}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->nativeFinalizeStatement(JJ)V

    .line 99
    .line 100
    .line 101
    :cond_6
    throw p1
.end method

.method public final b(Landroid/os/CancellationSignal;)V
    .locals 4

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/os/CancellationSignal;->throwIfCanceled()V

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->l:I

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    add-int/2addr v0, v1

    .line 10
    iput v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->l:I

    .line 11
    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    iget-wide v2, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->j:J

    .line 15
    .line 16
    invoke-static {v2, v3, v1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->nativeResetCancel(JZ)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, p0}, Landroid/os/CancellationSignal;->setOnCancelListener(Landroid/os/CancellationSignal$OnCancelListener;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public final c(Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;[Ljava/lang/Object;)V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p2, :cond_0

    .line 3
    .line 4
    array-length v1, p2

    .line 5
    goto :goto_0

    .line 6
    :cond_0
    move v1, v0

    .line 7
    :goto_0
    iget v2, p1, Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;->d:I

    .line 8
    .line 9
    if-ne v1, v2, :cond_9

    .line 10
    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    goto/16 :goto_4

    .line 14
    .line 15
    :cond_1
    iget-wide v5, p1, Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;->c:J

    .line 16
    .line 17
    :goto_1
    if-ge v0, v1, :cond_8

    .line 18
    .line 19
    aget-object p1, p2, v0

    .line 20
    .line 21
    invoke-static {p1}, Lnet/zetetic/database/DatabaseUtils;->b(Ljava/lang/Object;)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_7

    .line 26
    .line 27
    const/4 v3, 0x1

    .line 28
    if-eq v2, v3, :cond_6

    .line 29
    .line 30
    const/4 v3, 0x2

    .line 31
    if-eq v2, v3, :cond_5

    .line 32
    .line 33
    const/4 v3, 0x4

    .line 34
    if-eq v2, v3, :cond_4

    .line 35
    .line 36
    instance-of v2, p1, Ljava/lang/Boolean;

    .line 37
    .line 38
    if-eqz v2, :cond_3

    .line 39
    .line 40
    iget-wide v3, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->j:J

    .line 41
    .line 42
    add-int/lit8 v7, v0, 0x1

    .line 43
    .line 44
    check-cast p1, Ljava/lang/Boolean;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_2

    .line 51
    .line 52
    const-wide/16 v8, 0x1

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    const-wide/16 v8, 0x0

    .line 56
    .line 57
    :goto_2
    invoke-static/range {v3 .. v9}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->nativeBindLong(JJIJ)V

    .line 58
    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_3
    iget-wide v3, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->j:J

    .line 62
    .line 63
    add-int/lit8 v7, v0, 0x1

    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v8

    .line 69
    invoke-static/range {v3 .. v8}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->nativeBindString(JJILjava/lang/String;)V

    .line 70
    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_4
    iget-wide v3, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->j:J

    .line 74
    .line 75
    add-int/lit8 v7, v0, 0x1

    .line 76
    .line 77
    move-object v8, p1

    .line 78
    check-cast v8, [B

    .line 79
    .line 80
    invoke-static/range {v3 .. v8}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->nativeBindBlob(JJI[B)V

    .line 81
    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_5
    iget-wide v3, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->j:J

    .line 85
    .line 86
    add-int/lit8 v7, v0, 0x1

    .line 87
    .line 88
    check-cast p1, Ljava/lang/Number;

    .line 89
    .line 90
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    .line 91
    .line 92
    .line 93
    move-result-wide v8

    .line 94
    invoke-static/range {v3 .. v9}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->nativeBindDouble(JJID)V

    .line 95
    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_6
    iget-wide v3, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->j:J

    .line 99
    .line 100
    add-int/lit8 v7, v0, 0x1

    .line 101
    .line 102
    check-cast p1, Ljava/lang/Number;

    .line 103
    .line 104
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 105
    .line 106
    .line 107
    move-result-wide v8

    .line 108
    invoke-static/range {v3 .. v9}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->nativeBindLong(JJIJ)V

    .line 109
    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_7
    iget-wide v2, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->j:J

    .line 113
    .line 114
    add-int/lit8 p1, v0, 0x1

    .line 115
    .line 116
    invoke-static {v2, v3, v5, v6, p1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->nativeBindNull(JJI)V

    .line 117
    .line 118
    .line 119
    :goto_3
    add-int/lit8 v0, v0, 0x1

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_8
    :goto_4
    return-void

    .line 123
    :cond_9
    new-instance p2, Landroid/database/sqlite/SQLiteBindOrColumnIndexOutOfRangeException;

    .line 124
    .line 125
    new-instance v0, Ljava/lang/StringBuilder;

    .line 126
    .line 127
    const-string v2, "Expected "

    .line 128
    .line 129
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    iget p1, p1, Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;->d:I

    .line 133
    .line 134
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    const-string p1, " bind arguments but "

    .line 138
    .line 139
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    const-string p1, " were provided."

    .line 146
    .line 147
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    invoke-direct {p2, p1}, Landroid/database/sqlite/SQLiteBindOrColumnIndexOutOfRangeException;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    throw p2
.end method

.method public final e([B)V
    .locals 5

    .line 1
    iget-wide v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->j:J

    .line 2
    .line 3
    invoke-static {v0, v1, p1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->nativeReKey(J[B)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const-string v0, "Database rekey operation returned:"

    .line 8
    .line 9
    invoke-static {p1, v0}, Lka/n;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {}, Lnet/zetetic/database/Logger;->b()Lnet/zetetic/database/LogTarget;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/4 v2, 0x4

    .line 18
    const/4 v3, 0x0

    .line 19
    const-string v4, "SQLiteConnection"

    .line 20
    .line 21
    invoke-interface {v1, v2, v3, v4, v0}, Lnet/zetetic/database/LogTarget;->a(ILjava/lang/Exception;Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    if-nez p1, :cond_0

    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    new-instance v0, Landroid/database/sqlite/SQLiteException;

    .line 28
    .line 29
    const-string v1, "Failed to rekey database, result code:"

    .line 30
    .line 31
    invoke-static {p1, v1}, Lka/n;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-direct {v0, p1}, Landroid/database/sqlite/SQLiteException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v0
.end method

.method public final f(Landroid/os/CancellationSignal;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->l:I

    .line 4
    .line 5
    add-int/lit8 v0, v0, -0x1

    .line 6
    .line 7
    iput v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->l:I

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-virtual {p1, v0}, Landroid/os/CancellationSignal;->setOnCancelListener(Landroid/os/CancellationSignal$OnCancelListener;)V

    .line 13
    .line 14
    .line 15
    iget-wide v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->j:J

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    invoke-static {v0, v1, p1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->nativeResetCancel(JZ)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public final finalize()V
    .locals 7

    .line 1
    :try_start_0
    iget-object v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->b:Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-wide v2, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->j:J

    .line 7
    .line 8
    const-wide/16 v4, 0x0

    .line 9
    .line 10
    cmp-long v2, v2, v4

    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    new-instance v2, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v3, "A SQLiteConnection object for database \'"

    .line 17
    .line 18
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget-object v3, v0, Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool;->d:Lnet/zetetic/database/sqlcipher/SQLiteDatabaseConfiguration;

    .line 22
    .line 23
    iget-object v3, v3, Lnet/zetetic/database/sqlcipher/SQLiteDatabaseConfiguration;->b:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v3, "\' was leaked!  Please fix your application to end transactions in progress properly and to close the database when it is no longer needed."

    .line 29
    .line 30
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    const-string v3, "SQLiteConnectionPool"

    .line 38
    .line 39
    invoke-static {}, Lnet/zetetic/database/Logger;->b()Lnet/zetetic/database/LogTarget;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    const/4 v5, 0x5

    .line 44
    const/4 v6, 0x0

    .line 45
    invoke-interface {v4, v5, v6, v3, v2}, Lnet/zetetic/database/LogTarget;->a(ILjava/lang/Exception;Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    iget-object v0, v0, Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :catchall_0
    move-exception v0

    .line 55
    goto :goto_1

    .line 56
    :cond_0
    :goto_0
    invoke-virtual {p0, v1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->g(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    .line 58
    .line 59
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :goto_1
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 64
    .line 65
    .line 66
    throw v0
.end method

.method public final g(Z)V
    .locals 6

    .line 1
    iget-object v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->a:Lnet/zetetic/database/sqlcipher/CloseGuard;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p1, v0, Lnet/zetetic/database/sqlcipher/CloseGuard;->a:Ljava/lang/Throwable;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const-string v1, "A resource was acquired at attached stack trace but never released. See java.io.Closeable for information on avoiding resource leaks."

    .line 10
    .line 11
    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 12
    .line 13
    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    iput-object p1, v0, Lnet/zetetic/database/sqlcipher/CloseGuard;->a:Ljava/lang/Throwable;

    .line 16
    .line 17
    iget-wide v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->j:J

    .line 18
    .line 19
    const-wide/16 v2, 0x0

    .line 20
    .line 21
    cmp-long v0, v0, v2

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    iget-object v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->i:Lnet/zetetic/database/sqlcipher/SQLiteConnection$OperationLog;

    .line 26
    .line 27
    const-string v1, "close"

    .line 28
    .line 29
    invoke-virtual {v0, v1, p1, p1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection$OperationLog;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    :try_start_0
    iget-object v1, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->g:Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatementCache;

    .line 34
    .line 35
    invoke-virtual {v1}, Landroid/util/LruCache;->evictAll()V

    .line 36
    .line 37
    .line 38
    iget-wide v4, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->j:J

    .line 39
    .line 40
    invoke-static {v4, v5}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->nativeClose(J)V

    .line 41
    .line 42
    .line 43
    iput-wide v2, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->j:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    invoke-virtual {v0, p1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection$OperationLog;->b(I)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :catchall_0
    move-exception v1

    .line 50
    invoke-virtual {v0, p1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection$OperationLog;->b(I)V

    .line 51
    .line 52
    .line 53
    throw v1

    .line 54
    :cond_1
    return-void
.end method

.method public final h(Ljava/lang/String;[Ljava/lang/Object;Landroid/os/CancellationSignal;)V
    .locals 6

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->i:Lnet/zetetic/database/sqlcipher/SQLiteConnection$OperationLog;

    .line 4
    .line 5
    const-string v1, "execute"

    .line 6
    .line 7
    invoke-virtual {v0, v1, p1, p2}, Lnet/zetetic/database/sqlcipher/SQLiteConnection$OperationLog;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    :try_start_0
    invoke-virtual {p0, p1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->a(Ljava/lang/String;)Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;

    .line 12
    .line 13
    .line 14
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    :try_start_1
    invoke-virtual {p0, p1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->w(Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p1, p2}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->c(Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;[Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p3}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->b(Landroid/os/CancellationSignal;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 22
    .line 23
    .line 24
    :try_start_2
    iget-wide v2, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->j:J

    .line 25
    .line 26
    iget-wide v4, p1, Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;->c:J

    .line 27
    .line 28
    invoke-static {v2, v3, v4, v5}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->nativeExecute(JJ)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 29
    .line 30
    .line 31
    :try_start_3
    invoke-virtual {p0, p3}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->f(Landroid/os/CancellationSignal;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 32
    .line 33
    .line 34
    :try_start_4
    invoke-virtual {p0, p1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->s(Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;)V
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection$OperationLog;->b(I)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :catchall_0
    move-exception p1

    .line 42
    goto :goto_2

    .line 43
    :catch_0
    move-exception p1

    .line 44
    goto :goto_1

    .line 45
    :catchall_1
    move-exception p2

    .line 46
    goto :goto_0

    .line 47
    :catchall_2
    move-exception p2

    .line 48
    :try_start_5
    invoke-virtual {p0, p3}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->f(Landroid/os/CancellationSignal;)V

    .line 49
    .line 50
    .line 51
    throw p2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 52
    :goto_0
    :try_start_6
    invoke-virtual {p0, p1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->s(Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;)V

    .line 53
    .line 54
    .line 55
    throw p2
    :try_end_6
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 56
    :goto_1
    :try_start_7
    invoke-virtual {v0, p1, v1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection$OperationLog;->d(Ljava/lang/RuntimeException;I)V

    .line 57
    .line 58
    .line 59
    throw p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 60
    :goto_2
    invoke-virtual {v0, v1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection$OperationLog;->b(I)V

    .line 61
    .line 62
    .line 63
    throw p1

    .line 64
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 65
    .line 66
    const-string p2, "sql must not be null."

    .line 67
    .line 68
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw p1
.end method

.method public final i(Ljava/lang/String;[Ljava/lang/Object;)I
    .locals 6

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->i:Lnet/zetetic/database/sqlcipher/SQLiteConnection$OperationLog;

    .line 4
    .line 5
    const-string v1, "executeForChangedRowCount"

    .line 6
    .line 7
    invoke-virtual {v0, v1, p1, p2}, Lnet/zetetic/database/sqlcipher/SQLiteConnection$OperationLog;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    :try_start_0
    invoke-virtual {p0, p1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->a(Ljava/lang/String;)Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;

    .line 12
    .line 13
    .line 14
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    :try_start_1
    invoke-virtual {p0, p1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->w(Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p1, p2}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->c(Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 19
    .line 20
    .line 21
    :try_start_2
    iget-wide v2, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->j:J

    .line 22
    .line 23
    iget-wide v4, p1, Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;->c:J

    .line 24
    .line 25
    invoke-static {v2, v3, v4, v5}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->nativeExecuteForChangedRowCount(JJ)I

    .line 26
    .line 27
    .line 28
    move-result p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 29
    :try_start_3
    invoke-virtual {p0, p1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->s(Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;)V
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection$OperationLog;->c(I)V

    .line 33
    .line 34
    .line 35
    return p2

    .line 36
    :catchall_0
    move-exception p1

    .line 37
    goto :goto_1

    .line 38
    :catch_0
    move-exception p1

    .line 39
    goto :goto_0

    .line 40
    :catchall_1
    move-exception p2

    .line 41
    :try_start_4
    throw p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 42
    :catchall_2
    move-exception p2

    .line 43
    :try_start_5
    invoke-virtual {p0, p1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->s(Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;)V

    .line 44
    .line 45
    .line 46
    throw p2
    :try_end_5
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 47
    :goto_0
    :try_start_6
    invoke-virtual {v0, p1, v1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection$OperationLog;->d(Ljava/lang/RuntimeException;I)V

    .line 48
    .line 49
    .line 50
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 51
    :goto_1
    invoke-virtual {v0, v1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection$OperationLog;->c(I)V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 56
    .line 57
    const-string p2, "sql must not be null."

    .line 58
    .line 59
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p1
.end method

.method public final j(Ljava/lang/String;[Ljava/lang/Object;Lnet/zetetic/database/CursorWindow;IIZLandroid/os/CancellationSignal;)I
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    move-object/from16 v4, p7

    .line 10
    .line 11
    iget-object v5, v1, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->i:Lnet/zetetic/database/sqlcipher/SQLiteConnection$OperationLog;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    invoke-virtual {v3}, Lnet/zetetic/database/sqlcipher/SQLiteClosable;->a()V

    .line 18
    .line 19
    .line 20
    :try_start_0
    const-string v6, "executeForCursorWindow"

    .line 21
    .line 22
    invoke-virtual {v5, v6, v0, v2}, Lnet/zetetic/database/sqlcipher/SQLiteConnection$OperationLog;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 23
    .line 24
    .line 25
    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 26
    :try_start_1
    invoke-virtual/range {p0 .. p1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->a(Ljava/lang/String;)Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;

    .line 27
    .line 28
    .line 29
    move-result-object v7
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    :try_start_2
    invoke-virtual {v1, v7}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->w(Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v7, v2}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->c(Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;[Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v4}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->b(Landroid/os/CancellationSignal;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 37
    .line 38
    .line 39
    :try_start_3
    iget-wide v8, v1, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->j:J

    .line 40
    .line 41
    iget-wide v10, v7, Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;->c:J

    .line 42
    .line 43
    iget-wide v12, v3, Lnet/zetetic/database/CursorWindow;->b:J

    .line 44
    .line 45
    move/from16 v14, p4

    .line 46
    .line 47
    move/from16 v15, p5

    .line 48
    .line 49
    move/from16 v16, p6

    .line 50
    .line 51
    invoke-static/range {v8 .. v16}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->nativeExecuteForCursorWindow(JJJIIZ)J

    .line 52
    .line 53
    .line 54
    move-result-wide v8

    .line 55
    const/16 v0, 0x20

    .line 56
    .line 57
    shr-long v10, v8, v0

    .line 58
    .line 59
    long-to-int v0, v10

    .line 60
    long-to-int v2, v8

    .line 61
    invoke-virtual {v3}, Lnet/zetetic/database/CursorWindow;->y()I

    .line 62
    .line 63
    .line 64
    iput v0, v3, Lnet/zetetic/database/CursorWindow;->c:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 65
    .line 66
    :try_start_4
    invoke-virtual {v1, v4}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->f(Landroid/os/CancellationSignal;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 67
    .line 68
    .line 69
    :try_start_5
    invoke-virtual {v1, v7}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->s(Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;)V
    :try_end_5
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 70
    .line 71
    .line 72
    :try_start_6
    invoke-virtual {v5, v6}, Lnet/zetetic/database/sqlcipher/SQLiteConnection$OperationLog;->c(I)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 73
    .line 74
    .line 75
    invoke-virtual {v3}, Lnet/zetetic/database/sqlcipher/SQLiteClosable;->d()V

    .line 76
    .line 77
    .line 78
    return v2

    .line 79
    :catchall_0
    move-exception v0

    .line 80
    goto :goto_2

    .line 81
    :catch_0
    move-exception v0

    .line 82
    goto :goto_1

    .line 83
    :catchall_1
    move-exception v0

    .line 84
    goto :goto_0

    .line 85
    :catchall_2
    move-exception v0

    .line 86
    :try_start_7
    invoke-virtual {v1, v4}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->f(Landroid/os/CancellationSignal;)V

    .line 87
    .line 88
    .line 89
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 90
    :goto_0
    :try_start_8
    invoke-virtual {v1, v7}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->s(Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;)V

    .line 91
    .line 92
    .line 93
    throw v0
    :try_end_8
    .catch Ljava/lang/RuntimeException; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 94
    :goto_1
    :try_start_9
    invoke-virtual {v5, v0, v6}, Lnet/zetetic/database/sqlcipher/SQLiteConnection$OperationLog;->d(Ljava/lang/RuntimeException;I)V

    .line 95
    .line 96
    .line 97
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 98
    :goto_2
    :try_start_a
    invoke-virtual {v5, v6}, Lnet/zetetic/database/sqlcipher/SQLiteConnection$OperationLog;->c(I)V

    .line 99
    .line 100
    .line 101
    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 102
    :catchall_3
    move-exception v0

    .line 103
    invoke-virtual {v3}, Lnet/zetetic/database/sqlcipher/SQLiteClosable;->d()V

    .line 104
    .line 105
    .line 106
    throw v0

    .line 107
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 108
    .line 109
    const-string v2, "window must not be null."

    .line 110
    .line 111
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    throw v0

    .line 115
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 116
    .line 117
    const-string v2, "sql must not be null."

    .line 118
    .line 119
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    throw v0
.end method

.method public final k(Ljava/lang/String;[Ljava/lang/Object;)J
    .locals 6

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->i:Lnet/zetetic/database/sqlcipher/SQLiteConnection$OperationLog;

    .line 4
    .line 5
    const-string v1, "executeForLastInsertedRowId"

    .line 6
    .line 7
    invoke-virtual {v0, v1, p1, p2}, Lnet/zetetic/database/sqlcipher/SQLiteConnection$OperationLog;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    :try_start_0
    invoke-virtual {p0, p1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->a(Ljava/lang/String;)Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;

    .line 12
    .line 13
    .line 14
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    :try_start_1
    invoke-virtual {p0, p1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->w(Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p1, p2}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->c(Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 19
    .line 20
    .line 21
    :try_start_2
    iget-wide v2, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->j:J

    .line 22
    .line 23
    iget-wide v4, p1, Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;->c:J

    .line 24
    .line 25
    invoke-static {v2, v3, v4, v5}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->nativeExecuteForLastInsertedRowId(JJ)J

    .line 26
    .line 27
    .line 28
    move-result-wide v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 29
    :try_start_3
    invoke-virtual {p0, p1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->s(Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;)V
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection$OperationLog;->b(I)V

    .line 33
    .line 34
    .line 35
    return-wide v2

    .line 36
    :catchall_0
    move-exception p1

    .line 37
    goto :goto_1

    .line 38
    :catch_0
    move-exception p1

    .line 39
    goto :goto_0

    .line 40
    :catchall_1
    move-exception p2

    .line 41
    :try_start_4
    throw p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 42
    :catchall_2
    move-exception p2

    .line 43
    :try_start_5
    invoke-virtual {p0, p1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->s(Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;)V

    .line 44
    .line 45
    .line 46
    throw p2
    :try_end_5
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 47
    :goto_0
    :try_start_6
    invoke-virtual {v0, p1, v1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection$OperationLog;->d(Ljava/lang/RuntimeException;I)V

    .line 48
    .line 49
    .line 50
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 51
    :goto_1
    invoke-virtual {v0, v1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection$OperationLog;->b(I)V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 56
    .line 57
    const-string p2, "sql must not be null."

    .line 58
    .line 59
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p1
.end method

.method public final l(Ljava/lang/String;[Ljava/lang/Object;)J
    .locals 6

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->i:Lnet/zetetic/database/sqlcipher/SQLiteConnection$OperationLog;

    .line 4
    .line 5
    const-string v1, "executeForLong"

    .line 6
    .line 7
    invoke-virtual {v0, v1, p1, p2}, Lnet/zetetic/database/sqlcipher/SQLiteConnection$OperationLog;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    :try_start_0
    invoke-virtual {p0, p1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->a(Ljava/lang/String;)Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;

    .line 12
    .line 13
    .line 14
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    :try_start_1
    invoke-virtual {p0, p1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->w(Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p1, p2}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->c(Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 19
    .line 20
    .line 21
    :try_start_2
    iget-wide v2, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->j:J

    .line 22
    .line 23
    iget-wide v4, p1, Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;->c:J

    .line 24
    .line 25
    invoke-static {v2, v3, v4, v5}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->nativeExecuteForLong(JJ)J

    .line 26
    .line 27
    .line 28
    move-result-wide v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 29
    :try_start_3
    invoke-virtual {p0, p1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->s(Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;)V
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection$OperationLog;->b(I)V

    .line 33
    .line 34
    .line 35
    return-wide v2

    .line 36
    :catchall_0
    move-exception p1

    .line 37
    goto :goto_1

    .line 38
    :catch_0
    move-exception p1

    .line 39
    goto :goto_0

    .line 40
    :catchall_1
    move-exception p2

    .line 41
    :try_start_4
    throw p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 42
    :catchall_2
    move-exception p2

    .line 43
    :try_start_5
    invoke-virtual {p0, p1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->s(Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;)V

    .line 44
    .line 45
    .line 46
    throw p2
    :try_end_5
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 47
    :goto_0
    :try_start_6
    invoke-virtual {v0, p1, v1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection$OperationLog;->d(Ljava/lang/RuntimeException;I)V

    .line 48
    .line 49
    .line 50
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 51
    :goto_1
    invoke-virtual {v0, v1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection$OperationLog;->b(I)V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 56
    .line 57
    const-string p2, "sql must not be null."

    .line 58
    .line 59
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p1
.end method

.method public final m(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->i:Lnet/zetetic/database/sqlcipher/SQLiteConnection$OperationLog;

    .line 4
    .line 5
    const-string v1, "executeForString"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {v0, v1, p1, v2}, Lnet/zetetic/database/sqlcipher/SQLiteConnection$OperationLog;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    :try_start_0
    invoke-virtual {p0, p1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->a(Ljava/lang/String;)Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;

    .line 13
    .line 14
    .line 15
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    :try_start_1
    invoke-virtual {p0, p1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->w(Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p1, v2}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->c(Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 20
    .line 21
    .line 22
    :try_start_2
    iget-wide v2, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->j:J

    .line 23
    .line 24
    iget-wide v4, p1, Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;->c:J

    .line 25
    .line 26
    invoke-static {v2, v3, v4, v5}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->nativeExecuteForString(JJ)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 30
    :try_start_3
    invoke-virtual {p0, p1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->s(Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;)V
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection$OperationLog;->b(I)V

    .line 34
    .line 35
    .line 36
    return-object v2

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    goto :goto_1

    .line 39
    :catch_0
    move-exception p1

    .line 40
    goto :goto_0

    .line 41
    :catchall_1
    move-exception v2

    .line 42
    :try_start_4
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 43
    :catchall_2
    move-exception v2

    .line 44
    :try_start_5
    invoke-virtual {p0, p1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->s(Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;)V

    .line 45
    .line 46
    .line 47
    throw v2
    :try_end_5
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 48
    :goto_0
    :try_start_6
    invoke-virtual {v0, p1, v1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection$OperationLog;->d(Ljava/lang/RuntimeException;I)V

    .line 49
    .line 50
    .line 51
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 52
    :goto_1
    invoke-virtual {v0, v1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection$OperationLog;->b(I)V

    .line 53
    .line 54
    .line 55
    throw p1

    .line 56
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 57
    .line 58
    const-string v0, "sql must not be null."

    .line 59
    .line 60
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw p1
.end method

.method public final n(Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;)V
    .locals 4

    .line 1
    iget-wide v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->j:J

    .line 2
    .line 3
    iget-wide v2, p1, Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;->c:J

    .line 4
    .line 5
    invoke-static {v0, v1, v2, v3}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->nativeFinalizeStatement(JJ)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p1, Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;->b:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->h:Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;

    .line 12
    .line 13
    iput-object v0, p1, Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;->a:Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;

    .line 14
    .line 15
    iput-object p1, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->h:Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;

    .line 16
    .line 17
    return-void
.end method

.method public final onCancel()V
    .locals 2

    .line 1
    iget-wide v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->j:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->nativeCancel(J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final p()V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    iget-object v2, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->c:Lnet/zetetic/database/sqlcipher/SQLiteDatabaseConfiguration;

    .line 4
    .line 5
    iget-object v3, v2, Lnet/zetetic/database/sqlcipher/SQLiteDatabaseConfiguration;->a:Ljava/lang/String;

    .line 6
    .line 7
    iget v4, v2, Lnet/zetetic/database/sqlcipher/SQLiteDatabaseConfiguration;->c:I

    .line 8
    .line 9
    iget-object v2, v2, Lnet/zetetic/database/sqlcipher/SQLiteDatabaseConfiguration;->b:Ljava/lang/String;

    .line 10
    .line 11
    sget-boolean v5, Lnet/zetetic/database/sqlcipher/SQLiteDebug;->a:Z

    .line 12
    .line 13
    sget-boolean v6, Lnet/zetetic/database/sqlcipher/SQLiteDebug;->b:Z

    .line 14
    .line 15
    invoke-static {v3, v4, v2, v5, v6}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->nativeOpen(Ljava/lang/String;ILjava/lang/String;ZZ)J

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    iput-wide v2, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->j:J

    .line 20
    .line 21
    iget-object v4, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->c:Lnet/zetetic/database/sqlcipher/SQLiteDatabaseConfiguration;

    .line 22
    .line 23
    iget-object v5, v4, Lnet/zetetic/database/sqlcipher/SQLiteDatabaseConfiguration;->g:Lnet/zetetic/database/sqlcipher/SQLiteDatabaseHook;

    .line 24
    .line 25
    iget-object v4, v4, Lnet/zetetic/database/sqlcipher/SQLiteDatabaseConfiguration;->f:[B

    .line 26
    .line 27
    if-eqz v4, :cond_0

    .line 28
    .line 29
    array-length v5, v4

    .line 30
    if-lez v5, :cond_0

    .line 31
    .line 32
    invoke-static {v2, v3, v4}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->nativeKey(J[B)I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    const-string v3, "SQLiteConnection"

    .line 37
    .line 38
    const-string v4, "Database keying operation returned:"

    .line 39
    .line 40
    invoke-static {v2, v4}, Lka/n;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-static {}, Lnet/zetetic/database/Logger;->b()Lnet/zetetic/database/LogTarget;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    const/4 v5, 0x4

    .line 49
    invoke-interface {v4, v5, v1, v3, v2}, Lnet/zetetic/database/LogTarget;->a(ILjava/lang/Exception;Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    :cond_0
    iget-object v2, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->c:Lnet/zetetic/database/sqlcipher/SQLiteDatabaseConfiguration;

    .line 53
    .line 54
    iget-object v2, v2, Lnet/zetetic/database/sqlcipher/SQLiteDatabaseConfiguration;->g:Lnet/zetetic/database/sqlcipher/SQLiteDatabaseHook;

    .line 55
    .line 56
    if-eqz v2, :cond_1

    .line 57
    .line 58
    invoke-interface {v2, p0}, Lnet/zetetic/database/sqlcipher/SQLiteDatabaseHook;->a(Lnet/zetetic/database/sqlcipher/SQLiteConnection;)V

    .line 59
    .line 60
    .line 61
    :cond_1
    iget-object v2, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->c:Lnet/zetetic/database/sqlcipher/SQLiteDatabaseConfiguration;

    .line 62
    .line 63
    iget-object v2, v2, Lnet/zetetic/database/sqlcipher/SQLiteDatabaseConfiguration;->f:[B

    .line 64
    .line 65
    if-eqz v2, :cond_2

    .line 66
    .line 67
    array-length v2, v2

    .line 68
    if-lez v2, :cond_2

    .line 69
    .line 70
    const-string v2, "SELECT COUNT(*) FROM sqlite_schema;"

    .line 71
    .line 72
    invoke-virtual {p0, v2, v1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->l(Ljava/lang/String;[Ljava/lang/Object;)J

    .line 73
    .line 74
    .line 75
    :cond_2
    iget-object v2, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->c:Lnet/zetetic/database/sqlcipher/SQLiteDatabaseConfiguration;

    .line 76
    .line 77
    iget-object v2, v2, Lnet/zetetic/database/sqlcipher/SQLiteDatabaseConfiguration;->a:Ljava/lang/String;

    .line 78
    .line 79
    const-string v3, ":memory:"

    .line 80
    .line 81
    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-nez v2, :cond_4

    .line 86
    .line 87
    iget-boolean v2, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->f:Z

    .line 88
    .line 89
    if-nez v2, :cond_4

    .line 90
    .line 91
    sget-object v2, Lnet/zetetic/database/sqlcipher/SQLiteDatabase;->j:Ljava/util/WeakHashMap;

    .line 92
    .line 93
    invoke-static {}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->nativeHasCodec()Z

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    if-nez v2, :cond_4

    .line 98
    .line 99
    sget-object v2, Lnet/zetetic/database/sqlcipher/SQLiteGlobal;->a:Ljava/lang/Object;

    .line 100
    .line 101
    monitor-enter v2

    .line 102
    :try_start_0
    sget v3, Lnet/zetetic/database/sqlcipher/SQLiteGlobal;->b:I

    .line 103
    .line 104
    if-nez v3, :cond_3

    .line 105
    .line 106
    new-instance v3, Landroid/os/StatFs;

    .line 107
    .line 108
    const-string v4, "/data"

    .line 109
    .line 110
    invoke-direct {v3, v4}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v3}, Landroid/os/StatFs;->getBlockSize()I

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    sput v3, Lnet/zetetic/database/sqlcipher/SQLiteGlobal;->b:I

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :catchall_0
    move-exception v0

    .line 121
    goto :goto_1

    .line 122
    :cond_3
    :goto_0
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 123
    const/16 v2, 0x1000

    .line 124
    .line 125
    int-to-long v2, v2

    .line 126
    const-string v4, "PRAGMA page_size"

    .line 127
    .line 128
    invoke-virtual {p0, v4, v1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->l(Ljava/lang/String;[Ljava/lang/Object;)J

    .line 129
    .line 130
    .line 131
    move-result-wide v4

    .line 132
    cmp-long v2, v4, v2

    .line 133
    .line 134
    if-eqz v2, :cond_4

    .line 135
    .line 136
    const-string v2, "PRAGMA page_size=4096"

    .line 137
    .line 138
    invoke-virtual {p0, v2, v1, v1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->h(Ljava/lang/String;[Ljava/lang/Object;Landroid/os/CancellationSignal;)V

    .line 139
    .line 140
    .line 141
    goto :goto_2

    .line 142
    :goto_1
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 143
    throw v0

    .line 144
    :cond_4
    :goto_2
    iget-boolean v2, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->f:Z

    .line 145
    .line 146
    if-nez v2, :cond_5

    .line 147
    .line 148
    iget-object v2, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->c:Lnet/zetetic/database/sqlcipher/SQLiteDatabaseConfiguration;

    .line 149
    .line 150
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    const-string v2, "PRAGMA foreign_keys"

    .line 154
    .line 155
    invoke-virtual {p0, v2, v1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->l(Ljava/lang/String;[Ljava/lang/Object;)J

    .line 156
    .line 157
    .line 158
    move-result-wide v2

    .line 159
    const-wide/16 v4, 0x0

    .line 160
    .line 161
    cmp-long v2, v2, v4

    .line 162
    .line 163
    if-eqz v2, :cond_5

    .line 164
    .line 165
    const-string v2, "PRAGMA foreign_keys="

    .line 166
    .line 167
    invoke-static {v4, v5, v2}, LA7/p0;->k(JLjava/lang/String;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    invoke-virtual {p0, v2, v1, v1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->h(Ljava/lang/String;[Ljava/lang/Object;Landroid/os/CancellationSignal;)V

    .line 172
    .line 173
    .line 174
    :cond_5
    iget-object v2, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->c:Lnet/zetetic/database/sqlcipher/SQLiteDatabaseConfiguration;

    .line 175
    .line 176
    iget-object v2, v2, Lnet/zetetic/database/sqlcipher/SQLiteDatabaseConfiguration;->a:Ljava/lang/String;

    .line 177
    .line 178
    const-string v3, ":memory:"

    .line 179
    .line 180
    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 181
    .line 182
    .line 183
    move-result v2

    .line 184
    if-nez v2, :cond_6

    .line 185
    .line 186
    iget-boolean v2, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->f:Z

    .line 187
    .line 188
    if-nez v2, :cond_6

    .line 189
    .line 190
    const/16 v2, 0x2710

    .line 191
    .line 192
    int-to-long v2, v2

    .line 193
    const-string v4, "PRAGMA journal_size_limit"

    .line 194
    .line 195
    invoke-virtual {p0, v4, v1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->l(Ljava/lang/String;[Ljava/lang/Object;)J

    .line 196
    .line 197
    .line 198
    move-result-wide v4

    .line 199
    cmp-long v2, v4, v2

    .line 200
    .line 201
    if-eqz v2, :cond_6

    .line 202
    .line 203
    const-string v2, "PRAGMA journal_size_limit=10000"

    .line 204
    .line 205
    invoke-virtual {p0, v2, v1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->l(Ljava/lang/String;[Ljava/lang/Object;)J

    .line 206
    .line 207
    .line 208
    :cond_6
    iget-object v2, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->c:Lnet/zetetic/database/sqlcipher/SQLiteDatabaseConfiguration;

    .line 209
    .line 210
    iget-object v2, v2, Lnet/zetetic/database/sqlcipher/SQLiteDatabaseConfiguration;->a:Ljava/lang/String;

    .line 211
    .line 212
    const-string v3, ":memory:"

    .line 213
    .line 214
    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 215
    .line 216
    .line 217
    move-result v2

    .line 218
    if-nez v2, :cond_7

    .line 219
    .line 220
    iget-boolean v2, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->f:Z

    .line 221
    .line 222
    if-nez v2, :cond_7

    .line 223
    .line 224
    const/16 v2, 0x3e8

    .line 225
    .line 226
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    .line 227
    .line 228
    .line 229
    move-result v2

    .line 230
    int-to-long v2, v2

    .line 231
    const-string v4, "PRAGMA wal_autocheckpoint"

    .line 232
    .line 233
    invoke-virtual {p0, v4, v1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->l(Ljava/lang/String;[Ljava/lang/Object;)J

    .line 234
    .line 235
    .line 236
    move-result-wide v4

    .line 237
    cmp-long v4, v4, v2

    .line 238
    .line 239
    if-eqz v4, :cond_7

    .line 240
    .line 241
    new-instance v4, Ljava/lang/StringBuilder;

    .line 242
    .line 243
    const-string v5, "PRAGMA wal_autocheckpoint="

    .line 244
    .line 245
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    invoke-virtual {p0, v2, v1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->l(Ljava/lang/String;[Ljava/lang/Object;)J

    .line 256
    .line 257
    .line 258
    :cond_7
    invoke-virtual {p0}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->v()V

    .line 259
    .line 260
    .line 261
    invoke-static {}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->nativeHasCodec()Z

    .line 262
    .line 263
    .line 264
    move-result v1

    .line 265
    if-nez v1, :cond_8

    .line 266
    .line 267
    invoke-virtual {p0}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->u()V

    .line 268
    .line 269
    .line 270
    :cond_8
    iget-object v1, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->c:Lnet/zetetic/database/sqlcipher/SQLiteDatabaseConfiguration;

    .line 271
    .line 272
    iget-object v1, v1, Lnet/zetetic/database/sqlcipher/SQLiteDatabaseConfiguration;->h:Ljava/util/ArrayList;

    .line 273
    .line 274
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 275
    .line 276
    .line 277
    move-result v1

    .line 278
    const/4 v2, 0x0

    .line 279
    :goto_3
    if-ge v2, v1, :cond_9

    .line 280
    .line 281
    iget-object v3, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->c:Lnet/zetetic/database/sqlcipher/SQLiteDatabaseConfiguration;

    .line 282
    .line 283
    iget-object v3, v3, Lnet/zetetic/database/sqlcipher/SQLiteDatabaseConfiguration;->h:Ljava/util/ArrayList;

    .line 284
    .line 285
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v3

    .line 289
    check-cast v3, Lnet/zetetic/database/sqlcipher/SQLiteCustomFunction;

    .line 290
    .line 291
    iget-wide v4, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->j:J

    .line 292
    .line 293
    invoke-static {v4, v5, v3}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->nativeRegisterCustomFunction(JLnet/zetetic/database/sqlcipher/SQLiteCustomFunction;)V

    .line 294
    .line 295
    .line 296
    add-int/2addr v2, v0

    .line 297
    goto :goto_3

    .line 298
    :cond_9
    return-void
.end method

.method public final q(Ljava/lang/String;Lnet/zetetic/database/sqlcipher/SQLiteStatementInfo;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->i:Lnet/zetetic/database/sqlcipher/SQLiteConnection$OperationLog;

    .line 2
    .line 3
    const-string v1, "prepare"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-virtual {v0, v1, p1, v2}, Lnet/zetetic/database/sqlcipher/SQLiteConnection$OperationLog;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    :try_start_0
    invoke-virtual {p0, p1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->a(Ljava/lang/String;)Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;

    .line 11
    .line 12
    .line 13
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 14
    :try_start_1
    iget v2, p1, Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;->d:I

    .line 15
    .line 16
    iput v2, p2, Lnet/zetetic/database/sqlcipher/SQLiteStatementInfo;->a:I

    .line 17
    .line 18
    iget-boolean v2, p1, Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;->e:Z

    .line 19
    .line 20
    iput-boolean v2, p2, Lnet/zetetic/database/sqlcipher/SQLiteStatementInfo;->c:Z

    .line 21
    .line 22
    iget-wide v2, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->j:J

    .line 23
    .line 24
    iget-wide v4, p1, Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;->c:J

    .line 25
    .line 26
    invoke-static {v2, v3, v4, v5}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->nativeGetColumnCount(JJ)I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_0

    .line 31
    .line 32
    sget-object v2, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->m:[Ljava/lang/String;

    .line 33
    .line 34
    iput-object v2, p2, Lnet/zetetic/database/sqlcipher/SQLiteStatementInfo;->b:[Ljava/lang/String;

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :catchall_0
    move-exception p2

    .line 38
    goto :goto_2

    .line 39
    :cond_0
    new-array v3, v2, [Ljava/lang/String;

    .line 40
    .line 41
    iput-object v3, p2, Lnet/zetetic/database/sqlcipher/SQLiteStatementInfo;->b:[Ljava/lang/String;

    .line 42
    .line 43
    const/4 v3, 0x0

    .line 44
    :goto_0
    if-ge v3, v2, :cond_1

    .line 45
    .line 46
    iget-object v4, p2, Lnet/zetetic/database/sqlcipher/SQLiteStatementInfo;->b:[Ljava/lang/String;

    .line 47
    .line 48
    iget-wide v5, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->j:J

    .line 49
    .line 50
    iget-wide v7, p1, Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;->c:J

    .line 51
    .line 52
    invoke-static {v5, v6, v7, v8, v3}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->nativeGetColumnName(JJI)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    aput-object v5, v4, v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 57
    .line 58
    add-int/lit8 v3, v3, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    :goto_1
    :try_start_2
    invoke-virtual {p0, p1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->s(Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection$OperationLog;->b(I)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :catchall_1
    move-exception p1

    .line 69
    goto :goto_4

    .line 70
    :catch_0
    move-exception p1

    .line 71
    goto :goto_3

    .line 72
    :goto_2
    :try_start_3
    invoke-virtual {p0, p1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->s(Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;)V

    .line 73
    .line 74
    .line 75
    throw p2
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 76
    :goto_3
    :try_start_4
    invoke-virtual {v0, p1, v1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection$OperationLog;->d(Ljava/lang/RuntimeException;I)V

    .line 77
    .line 78
    .line 79
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 80
    :goto_4
    invoke-virtual {v0, v1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection$OperationLog;->b(I)V

    .line 81
    .line 82
    .line 83
    throw p1
.end method

.method public final r(Lnet/zetetic/database/sqlcipher/SQLiteDatabaseConfiguration;)V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->k:Z

    .line 3
    .line 4
    iget-object v1, p1, Lnet/zetetic/database/sqlcipher/SQLiteDatabaseConfiguration;->h:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    move v2, v0

    .line 11
    :goto_0
    iget-object v3, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->c:Lnet/zetetic/database/sqlcipher/SQLiteDatabaseConfiguration;

    .line 12
    .line 13
    if-ge v2, v1, :cond_1

    .line 14
    .line 15
    iget-object v4, p1, Lnet/zetetic/database/sqlcipher/SQLiteDatabaseConfiguration;->h:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    check-cast v4, Lnet/zetetic/database/sqlcipher/SQLiteCustomFunction;

    .line 22
    .line 23
    iget-object v3, v3, Lnet/zetetic/database/sqlcipher/SQLiteDatabaseConfiguration;->h:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-nez v3, :cond_0

    .line 30
    .line 31
    iget-wide v5, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->j:J

    .line 32
    .line 33
    invoke-static {v5, v6, v4}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->nativeRegisterCustomFunction(JLnet/zetetic/database/sqlcipher/SQLiteCustomFunction;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    iget v1, p1, Lnet/zetetic/database/sqlcipher/SQLiteDatabaseConfiguration;->c:I

    .line 43
    .line 44
    iget v2, v3, Lnet/zetetic/database/sqlcipher/SQLiteDatabaseConfiguration;->c:I

    .line 45
    .line 46
    xor-int/2addr v1, v2

    .line 47
    const/high16 v2, 0x20000000

    .line 48
    .line 49
    and-int/2addr v1, v2

    .line 50
    if-eqz v1, :cond_2

    .line 51
    .line 52
    const/4 v0, 0x1

    .line 53
    :cond_2
    iget-object v1, p1, Lnet/zetetic/database/sqlcipher/SQLiteDatabaseConfiguration;->e:Ljava/util/Locale;

    .line 54
    .line 55
    iget-object v2, v3, Lnet/zetetic/database/sqlcipher/SQLiteDatabaseConfiguration;->e:Ljava/util/Locale;

    .line 56
    .line 57
    invoke-virtual {v1, v2}, Ljava/util/Locale;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    invoke-virtual {v3, p1}, Lnet/zetetic/database/sqlcipher/SQLiteDatabaseConfiguration;->a(Lnet/zetetic/database/sqlcipher/SQLiteDatabaseConfiguration;)V

    .line 62
    .line 63
    .line 64
    if-eqz v0, :cond_3

    .line 65
    .line 66
    invoke-virtual {p0}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->v()V

    .line 67
    .line 68
    .line 69
    :cond_3
    if-nez v1, :cond_4

    .line 70
    .line 71
    invoke-virtual {p0}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->u()V

    .line 72
    .line 73
    .line 74
    :cond_4
    return-void
.end method

.method public final s(Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p1, Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;->g:Z

    .line 3
    .line 4
    iget-boolean v0, p1, Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;->f:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    :try_start_0
    iget-wide v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->j:J

    .line 9
    .line 10
    iget-wide v2, p1, Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;->c:J

    .line 11
    .line 12
    invoke-static {v0, v1, v2, v3}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->nativeResetStatementAndClearBindings(JJ)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :catch_0
    iget-object v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->g:Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatementCache;

    .line 17
    .line 18
    iget-object p1, p1, Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;->b:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Landroid/util/LruCache;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    invoke-virtual {p0, p1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->n(Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final t(Ljava/lang/String;)V
    .locals 5

    .line 1
    const-string v0, "PRAGMA journal_mode="

    .line 2
    .line 3
    const-string v1, "PRAGMA journal_mode"

    .line 4
    .line 5
    invoke-virtual {p0, v1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-nez v2, :cond_1

    .line 14
    .line 15
    :try_start_0
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p0, v0}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result v0
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catch_0
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v2, "Could not change the database journal mode of \'"

    .line 33
    .line 34
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-object v2, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->c:Lnet/zetetic/database/sqlcipher/SQLiteDatabaseConfiguration;

    .line 38
    .line 39
    iget-object v2, v2, Lnet/zetetic/database/sqlcipher/SQLiteDatabaseConfiguration;->b:Ljava/lang/String;

    .line 40
    .line 41
    const-string v3, "\' from \'"

    .line 42
    .line 43
    const-string v4, "\' to \'"

    .line 44
    .line 45
    invoke-static {v0, v2, v3, v1, v4}, Lka/n;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const-string v1, "\' because the database is locked.  This usually means that there are other open connections to the database which prevents the database from enabling or disabling write-ahead logging mode.  Proceeding without changing the journal mode."

    .line 49
    .line 50
    invoke-static {v0, p1, v1}, Lwg/b;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-static {}, Lnet/zetetic/database/Logger;->b()Lnet/zetetic/database/LogTarget;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    const/4 v1, 0x5

    .line 59
    const/4 v2, 0x0

    .line 60
    const-string v3, "SQLiteConnection"

    .line 61
    .line 62
    invoke-interface {v0, v1, v2, v3, p1}, Lnet/zetetic/database/LogTarget;->a(ILjava/lang/Exception;Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    :cond_1
    :goto_0
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "SQLiteConnection: "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->c:Lnet/zetetic/database/sqlcipher/SQLiteDatabaseConfiguration;

    .line 9
    .line 10
    iget-object v1, v1, Lnet/zetetic/database/sqlcipher/SQLiteDatabaseConfiguration;->a:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v1, " ("

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget v1, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->d:I

    .line 21
    .line 22
    const-string v2, ")"

    .line 23
    .line 24
    invoke-static {v1, v2, v0}, LA7/p0;->j(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    return-object v0
.end method

.method public final u()V
    .locals 7

    .line 1
    iget-object v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->c:Lnet/zetetic/database/sqlcipher/SQLiteDatabaseConfiguration;

    .line 2
    .line 3
    iget v1, v0, Lnet/zetetic/database/sqlcipher/SQLiteDatabaseConfiguration;->c:I

    .line 4
    .line 5
    and-int/lit8 v1, v1, 0x10

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v1, v0, Lnet/zetetic/database/sqlcipher/SQLiteDatabaseConfiguration;->e:Ljava/util/Locale;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/util/Locale;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iget-wide v2, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->j:J

    .line 17
    .line 18
    invoke-static {v2, v3, v1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->nativeRegisterLocalizedCollators(JLjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget-boolean v2, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->f:Z

    .line 22
    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    :try_start_0
    const-string v2, "CREATE TABLE IF NOT EXISTS android_metadata (locale TEXT)"

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-virtual {p0, v2, v3, v3}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->h(Ljava/lang/String;[Ljava/lang/Object;Landroid/os/CancellationSignal;)V

    .line 30
    .line 31
    .line 32
    const-string v2, "SELECT locale FROM android_metadata UNION SELECT NULL ORDER BY locale DESC LIMIT 1"

    .line 33
    .line 34
    invoke-virtual {p0, v2}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_2

    .line 45
    .line 46
    :goto_0
    return-void

    .line 47
    :catch_0
    move-exception v2

    .line 48
    goto :goto_1

    .line 49
    :cond_2
    const-string v2, "BEGIN"

    .line 50
    .line 51
    invoke-virtual {p0, v2, v3, v3}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->h(Ljava/lang/String;[Ljava/lang/Object;Landroid/os/CancellationSignal;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    .line 53
    .line 54
    :try_start_1
    const-string v2, "DELETE FROM android_metadata"

    .line 55
    .line 56
    invoke-virtual {p0, v2, v3, v3}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->h(Ljava/lang/String;[Ljava/lang/Object;Landroid/os/CancellationSignal;)V

    .line 57
    .line 58
    .line 59
    const-string v2, "INSERT INTO android_metadata (locale) VALUES(?)"

    .line 60
    .line 61
    const/4 v4, 0x1

    .line 62
    new-array v4, v4, [Ljava/lang/Object;

    .line 63
    .line 64
    const/4 v5, 0x0

    .line 65
    aput-object v1, v4, v5

    .line 66
    .line 67
    invoke-virtual {p0, v2, v4, v3}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->h(Ljava/lang/String;[Ljava/lang/Object;Landroid/os/CancellationSignal;)V

    .line 68
    .line 69
    .line 70
    const-string v2, "REINDEX LOCALIZED"

    .line 71
    .line 72
    invoke-virtual {p0, v2, v3, v3}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->h(Ljava/lang/String;[Ljava/lang/Object;Landroid/os/CancellationSignal;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 73
    .line 74
    .line 75
    :try_start_2
    const-string v2, "COMMIT"

    .line 76
    .line 77
    invoke-virtual {p0, v2, v3, v3}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->h(Ljava/lang/String;[Ljava/lang/Object;Landroid/os/CancellationSignal;)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :catchall_0
    move-exception v2

    .line 82
    const-string v4, "ROLLBACK"

    .line 83
    .line 84
    invoke-virtual {p0, v4, v3, v3}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->h(Ljava/lang/String;[Ljava/lang/Object;Landroid/os/CancellationSignal;)V

    .line 85
    .line 86
    .line 87
    throw v2
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0

    .line 88
    :goto_1
    new-instance v3, Landroid/database/sqlite/SQLiteException;

    .line 89
    .line 90
    new-instance v4, Ljava/lang/StringBuilder;

    .line 91
    .line 92
    const-string v5, "Failed to change locale for db \'"

    .line 93
    .line 94
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    iget-object v0, v0, Lnet/zetetic/database/sqlcipher/SQLiteDatabaseConfiguration;->b:Ljava/lang/String;

    .line 98
    .line 99
    const-string v5, "\' to \'"

    .line 100
    .line 101
    const-string v6, "\'."

    .line 102
    .line 103
    invoke-static {v4, v0, v5, v1, v6}, Lka/n;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-direct {v3, v0, v2}, Landroid/database/sqlite/SQLiteException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 108
    .line 109
    .line 110
    throw v3
.end method

.method public final v()V
    .locals 5

    .line 1
    iget-object v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->c:Lnet/zetetic/database/sqlcipher/SQLiteDatabaseConfiguration;

    .line 2
    .line 3
    iget-object v1, v0, Lnet/zetetic/database/sqlcipher/SQLiteDatabaseConfiguration;->a:Ljava/lang/String;

    .line 4
    .line 5
    const-string v2, ":memory:"

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    iget-boolean v1, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->f:Z

    .line 14
    .line 15
    if-nez v1, :cond_1

    .line 16
    .line 17
    iget v0, v0, Lnet/zetetic/database/sqlcipher/SQLiteDatabaseConfiguration;->c:I

    .line 18
    .line 19
    const/high16 v1, 0x20000000

    .line 20
    .line 21
    and-int/2addr v0, v1

    .line 22
    const/4 v1, 0x0

    .line 23
    const-string v2, "PRAGMA synchronous="

    .line 24
    .line 25
    const-string v3, "normal"

    .line 26
    .line 27
    const-string v4, "PRAGMA synchronous"

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    const-string v0, "WAL"

    .line 32
    .line 33
    invoke-virtual {p0, v0}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->t(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v4}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {v0}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {v3}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-virtual {v0, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_1

    .line 53
    .line 54
    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {p0, v0, v1, v1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->h(Ljava/lang/String;[Ljava/lang/Object;Landroid/os/CancellationSignal;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_0
    const-string v0, "delete"

    .line 63
    .line 64
    invoke-virtual {p0, v0}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->t(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, v4}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-static {v0}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-static {v3}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    invoke-virtual {v0, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-nez v0, :cond_1

    .line 84
    .line 85
    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {p0, v0, v1, v1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->h(Ljava/lang/String;[Ljava/lang/Object;Landroid/os/CancellationSignal;)V

    .line 90
    .line 91
    .line 92
    :cond_1
    return-void
.end method

.method public final w(Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->k:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-boolean p1, p1, Lnet/zetetic/database/sqlcipher/SQLiteConnection$PreparedStatement;->e:Z

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance p1, Landroid/database/sqlite/SQLiteException;

    .line 11
    .line 12
    const-string v0, "Cannot execute this statement because it might modify the database but the connection is read-only."

    .line 13
    .line 14
    invoke-direct {p1, v0}, Landroid/database/sqlite/SQLiteException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw p1

    .line 18
    :cond_1
    :goto_0
    return-void
.end method
