.class public Lcom/bytedance/sdk/openadsdk/sy/uef;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static moa:Landroid/content/Context;

.field private static final oa:[Ljava/lang/String;

.field public static final uef:J

.field private static final yo:J


# instance fields
.field private bcc:Ljava/lang/Boolean;

.field private final cz:Ljava/lang/Runnable;

.field private final dj:Ljava/lang/Runnable;

.field private ivm:Lcom/bytedance/sdk/openadsdk/sy/oa;

.field private final lw:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/bytedance/sdk/openadsdk/sy/moa;",
            ">;"
        }
    .end annotation
.end field

.field private xs:Lcom/bytedance/sdk/openadsdk/sy/yo/uef;

.field private zjm:I


# direct methods
.method static constructor <clinit>()V
    .locals 15

    .line 1
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/sy/moa/uef;->uef()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    sput-wide v0, Lcom/bytedance/sdk/openadsdk/sy/uef;->uef:J

    .line 6
    .line 7
    const-string v13, "is_init"

    .line 8
    .line 9
    const-string v14, "extra"

    .line 10
    .line 11
    const-string v2, "_id"

    .line 12
    .line 13
    const-string v3, "sdk_version"

    .line 14
    .line 15
    const-string v4, "scene"

    .line 16
    .line 17
    const-string v5, "start_count"

    .line 18
    .line 19
    const-string v6, "success_count"

    .line 20
    .line 21
    const-string v7, "fail_count"

    .line 22
    .line 23
    const-string v8, "rit"

    .line 24
    .line 25
    const-string v9, "tag"

    .line 26
    .line 27
    const-string v10, "label"

    .line 28
    .line 29
    const-string v11, "timestamp"

    .line 30
    .line 31
    const-string v12, "mediation"

    .line 32
    .line 33
    filled-new-array/range {v2 .. v14}, [Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    sput-object v0, Lcom/bytedance/sdk/openadsdk/sy/uef;->oa:[Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 40
    .line 41
    .line 42
    move-result-wide v0

    .line 43
    sput-wide v0, Lcom/bytedance/sdk/openadsdk/sy/uef;->yo:J

    .line 44
    .line 45
    return-void
.end method

.method private constructor <init>(Lcom/bytedance/sdk/openadsdk/sy/oa;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/sy/uef;->lw:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Lcom/bytedance/sdk/openadsdk/sy/uef$1;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lcom/bytedance/sdk/openadsdk/sy/uef$1;-><init>(Lcom/bytedance/sdk/openadsdk/sy/uef;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/sy/uef;->cz:Ljava/lang/Runnable;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/sy/uef;->zjm:I

    .line 20
    .line 21
    new-instance v0, Lcom/bytedance/sdk/openadsdk/sy/uef$4;

    .line 22
    .line 23
    invoke-direct {v0, p0}, Lcom/bytedance/sdk/openadsdk/sy/uef$4;-><init>(Lcom/bytedance/sdk/openadsdk/sy/uef;)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/sy/uef;->dj:Ljava/lang/Runnable;

    .line 27
    .line 28
    :try_start_0
    new-instance v0, Lcom/bytedance/sdk/openadsdk/BusMonitorDependWrapper;

    .line 29
    .line 30
    invoke-direct {v0, p1}, Lcom/bytedance/sdk/openadsdk/BusMonitorDependWrapper;-><init>(Lcom/bytedance/sdk/openadsdk/sy/oa;)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/sy/uef;->ivm:Lcom/bytedance/sdk/openadsdk/sy/oa;

    .line 34
    .line 35
    new-instance v0, Lcom/bytedance/sdk/openadsdk/sy/yo/uef;

    .line 36
    .line 37
    invoke-interface {p1}, Lcom/bytedance/sdk/openadsdk/sy/oa;->getContext()Landroid/content/Context;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-direct {v0, v1}, Lcom/bytedance/sdk/openadsdk/sy/yo/uef;-><init>(Landroid/content/Context;)V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/sy/uef;->xs:Lcom/bytedance/sdk/openadsdk/sy/yo/uef;

    .line 45
    .line 46
    invoke-interface {p1}, Lcom/bytedance/sdk/openadsdk/sy/oa;->getContext()Landroid/content/Context;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    sput-object p1, Lcom/bytedance/sdk/openadsdk/sy/uef;->moa:Landroid/content/Context;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 52
    :catchall_0
    return-void
.end method

.method public static synthetic bcc(Lcom/bytedance/sdk/openadsdk/sy/uef;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/bytedance/sdk/openadsdk/sy/uef;->zjm:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic ivm(Lcom/bytedance/sdk/openadsdk/sy/uef;)Lcom/bytedance/sdk/openadsdk/sy/oa;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/sy/uef;->ivm:Lcom/bytedance/sdk/openadsdk/sy/oa;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic lw(Lcom/bytedance/sdk/openadsdk/sy/uef;)Lcom/bytedance/sdk/openadsdk/sy/yo/uef;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/sy/uef;->xs:Lcom/bytedance/sdk/openadsdk/sy/yo/uef;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic moa(Lcom/bytedance/sdk/openadsdk/sy/uef;)I
    .locals 2

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/sy/uef;->zjm:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/bytedance/sdk/openadsdk/sy/uef;->zjm:I

    return v0
.end method

.method private moa()Z
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/sy/uef;->bcc:Ljava/lang/Boolean;

    if-nez v0, :cond_1

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/sy/uef;->ivm:Lcom/bytedance/sdk/openadsdk/sy/oa;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/sy/oa;->getContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/sy/uef;->ivm:Lcom/bytedance/sdk/openadsdk/sy/oa;

    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/sy/oa;->isMonitorOpen()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/sy/uef;->ivm:Lcom/bytedance/sdk/openadsdk/sy/oa;

    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/sy/oa;->getHandler()Lcom/bytedance/sdk/component/bcc/uef/ivm;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/sy/uef;->bcc:Ljava/lang/Boolean;

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/sy/uef;->bcc:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public static synthetic oa()J
    .locals 2

    .line 1
    sget-wide v0, Lcom/bytedance/sdk/openadsdk/sy/uef;->yo:J

    return-wide v0
.end method

.method public static synthetic oa(Lcom/bytedance/sdk/openadsdk/sy/uef;)Ljava/util/ArrayList;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/sy/uef;->lw:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static uef()Landroid/content/Context;
    .locals 1

    .line 4
    sget-object v0, Lcom/bytedance/sdk/openadsdk/sy/uef;->moa:Landroid/content/Context;

    if-eqz v0, :cond_0

    return-object v0

    .line 5
    :cond_0
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/BusMonitorDependWrapper;->getReflectContext()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public static uef(Lcom/bytedance/sdk/openadsdk/sy/oa;)Lcom/bytedance/sdk/openadsdk/sy/uef;
    .locals 1

    .line 3
    new-instance v0, Lcom/bytedance/sdk/openadsdk/sy/uef;

    invoke-direct {v0, p0}, Lcom/bytedance/sdk/openadsdk/sy/uef;-><init>(Lcom/bytedance/sdk/openadsdk/sy/oa;)V

    return-object v0
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/sy/uef;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/sy/uef;->uef(Ljava/util/List;)V

    return-void
.end method

.method private uef(Ljava/util/List;)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/sy/moa;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p1

    if-eqz v0, :cond_a

    .line 11
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_3

    :cond_0
    const/4 v1, 0x0

    .line 12
    :try_start_0
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/sy/uef/uef;->uef()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v2, :cond_9

    .line 13
    :try_start_1
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    const/4 v3, 0x0

    move v10, v3

    .line 14
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v10, v3, :cond_8

    .line 15
    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/bytedance/sdk/openadsdk/sy/moa;

    if-eqz v3, :cond_7

    .line 16
    invoke-interface {v3}, Lcom/bytedance/sdk/openadsdk/sy/moa;->uef()Lcom/bytedance/sdk/openadsdk/sy/oa/uef;

    move-result-object v11

    if-eqz v11, :cond_7

    .line 17
    invoke-virtual {v11}, Lcom/bytedance/sdk/openadsdk/sy/oa/uef;->oa()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11}, Lcom/bytedance/sdk/openadsdk/sy/oa/uef;->yo()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v11}, Lcom/bytedance/sdk/openadsdk/sy/oa/uef;->xs()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v11}, Lcom/bytedance/sdk/openadsdk/sy/oa/uef;->bcc()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v11}, Lcom/bytedance/sdk/openadsdk/sy/oa/uef;->cz()Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v11}, Lcom/bytedance/sdk/openadsdk/sy/oa/uef;->dj()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v11}, Lcom/bytedance/sdk/openadsdk/sy/oa/uef;->wrv()I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v11}, Lcom/bytedance/sdk/openadsdk/sy/oa/uef;->zjm()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v19

    invoke-virtual {v11}, Lcom/bytedance/sdk/openadsdk/sy/oa/uef;->cq()Ljava/lang/String;

    move-result-object v20

    filled-new-array/range {v12 .. v20}, [Ljava/lang/String;

    move-result-object v6

    .line 18
    const-string v3, "monitor_table"

    sget-object v4, Lcom/bytedance/sdk/openadsdk/sy/uef;->oa:[Ljava/lang/String;

    const-string v5, "sdk_version = ? AND scene = ? AND rit = ? AND tag = ? AND label = ? AND mediation = ? AND is_init = ? AND timestamp = ? AND extra = ?"

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v2 .. v9}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 19
    const-string v4, "fail_count"

    const-string v5, "success_count"

    const-string v6, "start_count"

    const-string v7, "_id"

    if-eqz v3, :cond_5

    .line 20
    :try_start_2
    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    move-result v8

    if-eqz v8, :cond_4

    .line 21
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v8

    if-ltz v8, :cond_1

    .line 22
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v8

    .line 23
    invoke-virtual {v11, v8, v9}, Lcom/bytedance/sdk/openadsdk/sy/oa/uef;->uef(J)V

    .line 24
    :cond_1
    invoke-interface {v3, v6}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v8

    if-ltz v8, :cond_2

    .line 25
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getInt(I)I

    move-result v8

    invoke-virtual {v11}, Lcom/bytedance/sdk/openadsdk/sy/oa/uef;->moa()I

    move-result v9

    add-int/2addr v8, v9

    .line 26
    invoke-virtual {v11, v8}, Lcom/bytedance/sdk/openadsdk/sy/oa/uef;->uef(I)V

    .line 27
    :cond_2
    invoke-interface {v3, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v8

    if-ltz v8, :cond_3

    .line 28
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getInt(I)I

    move-result v8

    invoke-virtual {v11}, Lcom/bytedance/sdk/openadsdk/sy/oa/uef;->lw()I

    move-result v9

    add-int/2addr v8, v9

    .line 29
    invoke-virtual {v11, v8}, Lcom/bytedance/sdk/openadsdk/sy/oa/uef;->oa(I)V

    .line 30
    :cond_3
    invoke-interface {v3, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v8

    if-ltz v8, :cond_4

    .line 31
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getInt(I)I

    move-result v8

    invoke-virtual {v11}, Lcom/bytedance/sdk/openadsdk/sy/oa/uef;->ivm()I

    move-result v9

    add-int/2addr v8, v9

    .line 32
    invoke-virtual {v11, v8}, Lcom/bytedance/sdk/openadsdk/sy/oa/uef;->yo(I)V

    .line 33
    :cond_4
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 34
    :cond_5
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 35
    invoke-virtual {v11}, Lcom/bytedance/sdk/openadsdk/sy/oa/uef;->uef()J

    move-result-wide v8

    const-wide/16 v12, 0x0

    cmp-long v8, v8, v12

    if-lez v8, :cond_6

    .line 36
    invoke-virtual {v11}, Lcom/bytedance/sdk/openadsdk/sy/oa/uef;->uef()J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v3, v7, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 37
    :cond_6
    const-string v7, "sdk_version"

    invoke-virtual {v11}, Lcom/bytedance/sdk/openadsdk/sy/oa/uef;->oa()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v7, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    const-string v7, "scene"

    invoke-virtual {v11}, Lcom/bytedance/sdk/openadsdk/sy/oa/uef;->yo()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v7, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    invoke-virtual {v11}, Lcom/bytedance/sdk/openadsdk/sy/oa/uef;->moa()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v3, v6, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 40
    invoke-virtual {v11}, Lcom/bytedance/sdk/openadsdk/sy/oa/uef;->lw()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v3, v5, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 41
    invoke-virtual {v11}, Lcom/bytedance/sdk/openadsdk/sy/oa/uef;->ivm()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 42
    const-string v4, "rit"

    invoke-virtual {v11}, Lcom/bytedance/sdk/openadsdk/sy/oa/uef;->xs()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    const-string v4, "tag"

    invoke-virtual {v11}, Lcom/bytedance/sdk/openadsdk/sy/oa/uef;->bcc()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    const-string v4, "label"

    invoke-virtual {v11}, Lcom/bytedance/sdk/openadsdk/sy/oa/uef;->cz()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    const-string v4, "timestamp"

    invoke-virtual {v11}, Lcom/bytedance/sdk/openadsdk/sy/oa/uef;->zjm()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 46
    const-string v4, "mediation"

    invoke-virtual {v11}, Lcom/bytedance/sdk/openadsdk/sy/oa/uef;->dj()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    const-string v4, "is_init"

    invoke-virtual {v11}, Lcom/bytedance/sdk/openadsdk/sy/oa/uef;->wrv()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 48
    const-string v4, "extra"

    invoke-virtual {v11}, Lcom/bytedance/sdk/openadsdk/sy/oa/uef;->cq()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    const-string v4, "monitor_table"

    const/4 v5, 0x5

    invoke-virtual {v2, v4, v1, v3, v5}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J

    :cond_7
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_0

    .line 50
    :cond_8
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :catchall_0
    move-object v1, v2

    goto :goto_2

    :cond_9
    :goto_1
    if-eqz v2, :cond_a

    .line 51
    :try_start_3
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    return-void

    :catchall_1
    :goto_2
    if-eqz v1, :cond_a

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_2
    :cond_a
    :goto_3
    return-void
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/sy/uef;)Z
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/sy/uef;->moa()Z

    move-result p0

    return p0
.end method

.method public static synthetic xs(Lcom/bytedance/sdk/openadsdk/sy/uef;)Ljava/lang/Runnable;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/sy/uef;->dj:Ljava/lang/Runnable;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic yo(Lcom/bytedance/sdk/openadsdk/sy/uef;)Ljava/lang/Runnable;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/sy/uef;->cz:Ljava/lang/Runnable;

    return-object p0
.end method

.method public static synthetic yo()[Ljava/lang/String;
    .locals 1

    .line 2
    sget-object v0, Lcom/bytedance/sdk/openadsdk/sy/uef;->oa:[Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public uef(Lcom/bytedance/sdk/openadsdk/sy/moa;)V
    .locals 3

    if-eqz p1, :cond_1

    .line 6
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/sy/uef;->moa()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/sy/uef;->ivm:Lcom/bytedance/sdk/openadsdk/sy/oa;

    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/sy/oa;->getHandler()Lcom/bytedance/sdk/component/bcc/uef/ivm;

    move-result-object v0

    .line 8
    new-instance v1, Lcom/bytedance/sdk/openadsdk/sy/uef$2;

    invoke-direct {v1, p0, p1, v0}, Lcom/bytedance/sdk/openadsdk/sy/uef$2;-><init>(Lcom/bytedance/sdk/openadsdk/sy/uef;Lcom/bytedance/sdk/openadsdk/sy/moa;Lcom/bytedance/sdk/component/bcc/uef/ivm;)V

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/component/bcc/uef/ivm;->uef(Ljava/lang/Runnable;)V

    .line 9
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/sy/uef;->cz:Ljava/lang/Runnable;

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/component/bcc/uef/ivm;->oa(Ljava/lang/Runnable;)V

    .line 10
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/sy/uef;->cz:Ljava/lang/Runnable;

    const-wide/16 v1, 0x1388

    invoke-virtual {v0, p1, v1, v2}, Lcom/bytedance/sdk/component/bcc/uef/ivm;->uef(Ljava/lang/Runnable;J)V

    :cond_1
    :goto_0
    return-void
.end method

.method public uef(Z)V
    .locals 5

    .line 52
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/sy/uef;->ivm:Lcom/bytedance/sdk/openadsdk/sy/oa;

    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/sy/oa;->getHandler()Lcom/bytedance/sdk/component/bcc/uef/ivm;

    move-result-object v0

    .line 53
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/sy/uef;->ivm:Lcom/bytedance/sdk/openadsdk/sy/oa;

    if-eqz v1, :cond_2

    if-eqz v0, :cond_2

    invoke-interface {v1}, Lcom/bytedance/sdk/openadsdk/sy/oa;->getContext()Landroid/content/Context;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/sy/uef;->xs:Lcom/bytedance/sdk/openadsdk/sy/yo/uef;

    if-nez v1, :cond_0

    goto :goto_0

    .line 54
    :cond_0
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/sy/uef;->moa()Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    .line 55
    :cond_1
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/sy/uef;->ivm:Lcom/bytedance/sdk/openadsdk/sy/oa;

    invoke-interface {v1}, Lcom/bytedance/sdk/openadsdk/sy/oa;->getOnceLogInterval()I

    move-result v1

    const/16 v2, 0x2710

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 56
    new-instance v2, Lcom/bytedance/sdk/openadsdk/sy/uef$3;

    invoke-direct {v2, p0, p1, v0}, Lcom/bytedance/sdk/openadsdk/sy/uef$3;-><init>(Lcom/bytedance/sdk/openadsdk/sy/uef;ZLcom/bytedance/sdk/component/bcc/uef/ivm;)V

    int-to-long v3, v1

    invoke-virtual {v0, v2, v3, v4}, Lcom/bytedance/sdk/component/bcc/uef/ivm;->uef(Ljava/lang/Runnable;J)V

    :cond_2
    :goto_0
    return-void
.end method
