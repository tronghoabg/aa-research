.class public Lcom/bytedance/sdk/component/xs/oa/uef;
.super Lcom/bytedance/sdk/component/xs/oa/yo;
.source "SourceFile"


# instance fields
.field private volatile dj:Z

.field public oa:Ljava/io/File;

.field public uef:Ljava/io/File;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/component/oa/uef/dj;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/component/xs/oa/yo;-><init>(Lcom/bytedance/sdk/component/oa/uef/dj;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static ivm(Ljava/util/Map;)J
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)J"
        }
    .end annotation

    .line 1
    const-string v0, "content-length"

    .line 2
    .line 3
    invoke-interface {p0, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Ljava/lang/String;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const-string v0, "Content-Length"

    .line 17
    .line 18
    invoke-interface {p0, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, Ljava/lang/String;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 p0, 0x0

    .line 32
    :goto_0
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    const-wide/16 v1, 0x0

    .line 37
    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    return-wide v1

    .line 41
    :cond_2
    if-eqz p0, :cond_3

    .line 42
    .line 43
    :try_start_0
    invoke-static {p0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 48
    .line 49
    .line 50
    move-result-wide v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    return-wide v0

    .line 52
    :catchall_0
    :cond_3
    return-wide v1
.end method

.method private static lw(Ljava/util/Map;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    .line 1
    const-string v0, "Accept-Ranges"

    .line 2
    .line 3
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/CharSequence;

    .line 8
    .line 9
    const-string v1, "bytes"

    .line 10
    .line 11
    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v2, 0x1

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    return v2

    .line 19
    :cond_0
    const-string v0, "accept-ranges"

    .line 20
    .line 21
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Ljava/lang/CharSequence;

    .line 26
    .line 27
    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    return v2

    .line 34
    :cond_1
    const-string v0, "Content-Range"

    .line 35
    .line 36
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_2

    .line 47
    .line 48
    const-string v0, "content-range"

    .line 49
    .line 50
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    move-object v0, p0

    .line 55
    check-cast v0, Ljava/lang/String;

    .line 56
    .line 57
    :cond_2
    if-eqz v0, :cond_3

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-eqz p0, :cond_3

    .line 64
    .line 65
    return v2

    .line 66
    :cond_3
    const/4 p0, 0x0

    .line 67
    return p0
.end method

.method public static synthetic oa(Lcom/bytedance/sdk/component/xs/oa/uef;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/bytedance/sdk/component/xs/oa/uef;->dj:Z

    return p0
.end method

.method public static synthetic oa(Ljava/util/Map;)Z
    .locals 0

    .line 2
    invoke-static {p0}, Lcom/bytedance/sdk/component/xs/oa/uef;->lw(Ljava/util/Map;)Z

    move-result p0

    return p0
.end method

.method public static synthetic uef(Ljava/util/Map;)J
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/bytedance/sdk/component/xs/oa/uef;->ivm(Ljava/util/Map;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/component/xs/oa/uef;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/bytedance/sdk/component/xs/oa/uef;->zjm()V

    return-void
.end method

.method private static xs(Ljava/util/Map;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    .line 1
    const-string v0, "Content-Encoding"

    .line 2
    .line 3
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/CharSequence;

    .line 8
    .line 9
    const-string v0, "gzip"

    .line 10
    .line 11
    invoke-static {p0, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public static synthetic yo(Ljava/util/Map;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/bytedance/sdk/component/xs/oa/uef;->xs(Ljava/util/Map;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private zjm()V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/sdk/component/xs/oa/uef;->uef:Ljava/io/File;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/File;->delete()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    .line 5
    .line 6
    :catchall_0
    :try_start_1
    iget-object v0, p0, Lcom/bytedance/sdk/component/xs/oa/uef;->oa:Ljava/io/File;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/io/File;->delete()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 9
    .line 10
    .line 11
    :catchall_1
    return-void
.end method


# virtual methods
.method public oa()V
    .locals 1

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lcom/bytedance/sdk/component/xs/oa/uef;->dj:Z

    .line 4
    invoke-super {p0}, Lcom/bytedance/sdk/component/xs/oa/yo;->oa()V

    return-void
.end method

.method public uef()Lcom/bytedance/sdk/component/xs/oa;
    .locals 21

    move-object/from16 v1, p0

    .line 48
    iget-object v0, v1, Lcom/bytedance/sdk/component/xs/oa/uef;->uef:Ljava/io/File;

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    iget-object v3, v1, Lcom/bytedance/sdk/component/xs/oa/uef;->oa:Ljava/io/File;

    if-nez v3, :cond_1

    :cond_0
    move-object/from16 v16, v2

    goto/16 :goto_c

    .line 49
    :cond_1
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    const-wide/16 v3, 0x0

    if-eqz v0, :cond_2

    iget-object v0, v1, Lcom/bytedance/sdk/component/xs/oa/uef;->uef:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v5

    cmp-long v0, v5, v3

    if-eqz v0, :cond_2

    .line 50
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    .line 51
    new-instance v5, Lcom/bytedance/sdk/component/xs/oa;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v6, 0x1

    const/16 v7, 0xc8

    const-string v8, "Success"

    move-wide v13, v11

    invoke-direct/range {v5 .. v14}, Lcom/bytedance/sdk/component/xs/oa;-><init>(ZILjava/lang/String;Ljava/util/Map;Ljava/lang/String;JJ)V

    .line 52
    iget-object v0, v1, Lcom/bytedance/sdk/component/xs/oa/uef;->uef:Ljava/io/File;

    invoke-virtual {v5, v0}, Lcom/bytedance/sdk/component/xs/oa;->uef(Ljava/io/File;)V

    return-object v5

    .line 53
    :cond_2
    iget-object v0, v1, Lcom/bytedance/sdk/component/xs/oa/uef;->oa:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v5

    cmp-long v0, v5, v3

    if-gez v0, :cond_3

    move-wide v5, v3

    .line 54
    :cond_3
    new-instance v0, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    invoke-direct {v0}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;-><init>()V

    .line 55
    invoke-virtual {v1}, Lcom/bytedance/sdk/component/xs/oa/yo;->moa()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v7}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->uef(Ljava/lang/Object;)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    .line 56
    invoke-virtual {v1, v0}, Lcom/bytedance/sdk/component/xs/oa/yo;->uef(Lcom/bytedance/sdk/component/oa/uef/wrv$uef;)V

    .line 57
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "bytes="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v8, "-"

    .line 58
    invoke-static {v7, v5, v6, v8}, LVa/M6;->s(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 59
    const-string v9, "Range"

    invoke-virtual {v1, v9, v7}, Lcom/bytedance/sdk/component/xs/oa/yo;->oa(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    iget-object v7, v1, Lcom/bytedance/sdk/component/xs/oa/yo;->bcc:Ljava/lang/String;

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    const-string v9, "DownloadExecutor"

    if-eqz v7, :cond_4

    .line 61
    const-string v0, "execute: Url is Empty"

    invoke-static {v9, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object v2

    .line 62
    :cond_4
    :try_start_0
    iget-object v7, v1, Lcom/bytedance/sdk/component/xs/oa/yo;->bcc:Ljava/lang/String;

    invoke-virtual {v0, v7}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->oa(Ljava/lang/String;)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_2

    .line 63
    invoke-virtual {v1, v0}, Lcom/bytedance/sdk/component/xs/oa/yo;->oa(Lcom/bytedance/sdk/component/oa/uef/wrv$uef;)V

    .line 64
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->uef()Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    move-result-object v0

    .line 65
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->oa()Lcom/bytedance/sdk/component/oa/uef/wrv;

    move-result-object v0

    .line 66
    :try_start_1
    iget-object v7, v1, Lcom/bytedance/sdk/component/xs/oa/yo;->yo:Lcom/bytedance/sdk/component/oa/uef/dj;

    invoke-virtual {v7, v0}, Lcom/bytedance/sdk/component/oa/uef/dj;->uef(Lcom/bytedance/sdk/component/oa/uef/wrv;)Lcom/bytedance/sdk/component/oa/uef/oa;

    move-result-object v0

    if-nez v0, :cond_5

    return-object v2

    .line 67
    :cond_5
    invoke-interface {v0}, Lcom/bytedance/sdk/component/oa/uef/oa;->oa()Lcom/bytedance/sdk/component/oa/uef/dz;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 68
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/dz;->cz()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Lcom/bytedance/sdk/component/xs/oa/yo;->uef(Ljava/lang/String;)V

    goto :goto_0

    :catch_0
    move-object/from16 v16, v2

    goto/16 :goto_a

    :cond_6
    :goto_0
    if-eqz v0, :cond_1b

    .line 69
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/dz;->moa()Z

    move-result v7

    if-eqz v7, :cond_1b

    .line 70
    new-instance v13, Ljava/util/HashMap;

    invoke-direct {v13}, Ljava/util/HashMap;-><init>()V

    .line 71
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/dz;->xs()Lcom/bytedance/sdk/component/oa/uef/ivm;

    move-result-object v7

    const/4 v9, 0x0

    if-eqz v7, :cond_7

    move v10, v9

    .line 72
    :goto_1
    invoke-virtual {v7}, Lcom/bytedance/sdk/component/oa/uef/ivm;->uef()I

    move-result v11

    if-ge v10, v11, :cond_7

    .line 73
    invoke-virtual {v7, v10}, Lcom/bytedance/sdk/component/oa/uef/ivm;->uef(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v7, v10}, Lcom/bytedance/sdk/component/oa/uef/ivm;->oa(I)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v13, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_7
    move v7, v9

    .line 74
    new-instance v9, Lcom/bytedance/sdk/component/xs/oa;

    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/dz;->moa()Z

    move-result v10

    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/dz;->yo()I

    move-result v11

    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/dz;->lw()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/dz;->oa()J

    move-result-wide v15

    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/dz;->uef()J

    move-result-wide v17

    const/4 v14, 0x0

    invoke-direct/range {v9 .. v18}, Lcom/bytedance/sdk/component/xs/oa;-><init>(ZILjava/lang/String;Ljava/util/Map;Ljava/lang/String;JJ)V

    .line 75
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/dz;->ivm()Lcom/bytedance/sdk/component/oa/uef/wk;

    move-result-object v10

    invoke-virtual {v10}, Lcom/bytedance/sdk/component/oa/uef/wk;->uef()J

    move-result-wide v10

    cmp-long v12, v10, v3

    if-gtz v12, :cond_8

    .line 76
    invoke-static {v13}, Lcom/bytedance/sdk/component/xs/oa/uef;->ivm(Ljava/util/Map;)J

    move-result-wide v10

    .line 77
    :cond_8
    iget-object v12, v1, Lcom/bytedance/sdk/component/xs/oa/uef;->oa:Ljava/io/File;

    invoke-virtual {v12}, Ljava/io/File;->length()J

    move-result-wide v14

    .line 78
    invoke-static {v13}, Lcom/bytedance/sdk/component/xs/oa/uef;->lw(Ljava/util/Map;)Z

    move-result v12
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    move-object/from16 v16, v2

    const/4 v2, -0x1

    if-eqz v12, :cond_9

    add-long/2addr v10, v14

    .line 79
    :try_start_2
    const-string v7, "Content-Range"

    invoke-virtual {v13, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    .line 80
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v18

    if-nez v18, :cond_9

    move-wide/from16 v18, v3

    .line 81
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "bytes "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide/16 v14, 0x1

    sub-long v14, v10, v14

    invoke-virtual {v3, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 82
    invoke-static {v7, v3}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    move-result v3

    if-ne v3, v2, :cond_a

    .line 83
    iget-object v0, v1, Lcom/bytedance/sdk/component/xs/oa/uef;->oa:Ljava/io/File;

    invoke-static {v0}, Lj$/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 84
    invoke-direct {v1}, Lcom/bytedance/sdk/component/xs/oa/uef;->zjm()V

    return-object v16

    :cond_9
    move-wide/from16 v18, v3

    :cond_a
    cmp-long v3, v10, v18

    if-lez v3, :cond_c

    .line 85
    iget-object v3, v1, Lcom/bytedance/sdk/component/xs/oa/uef;->oa:Ljava/io/File;

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_c

    iget-object v3, v1, Lcom/bytedance/sdk/component/xs/oa/uef;->oa:Ljava/io/File;

    invoke-virtual {v3}, Ljava/io/File;->length()J

    move-result-wide v3

    cmp-long v3, v3, v10

    if-nez v3, :cond_c

    .line 86
    iget-object v0, v1, Lcom/bytedance/sdk/component/xs/oa/uef;->oa:Ljava/io/File;

    iget-object v2, v1, Lcom/bytedance/sdk/component/xs/oa/uef;->uef:Ljava/io/File;

    invoke-virtual {v0, v2}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 87
    iget-object v0, v1, Lcom/bytedance/sdk/component/xs/oa/uef;->uef:Ljava/io/File;

    invoke-virtual {v9, v0}, Lcom/bytedance/sdk/component/xs/oa;->uef(Ljava/io/File;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    return-object v9

    :cond_b
    return-object v16

    .line 88
    :cond_c
    :try_start_3
    new-instance v3, Ljava/io/RandomAccessFile;

    iget-object v4, v1, Lcom/bytedance/sdk/component/xs/oa/uef;->oa:Ljava/io/File;

    const-string v7, "rw"

    invoke-direct {v3, v4, v7}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz v12, :cond_d

    .line 89
    :try_start_4
    invoke-virtual {v3, v5, v6}, Ljava/io/RandomAccessFile;->seek(J)V

    move-wide v7, v5

    goto :goto_3

    :cond_d
    move-wide/from16 v7, v18

    .line 90
    invoke-virtual {v3, v7, v8}, Ljava/io/RandomAccessFile;->setLength(J)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :catchall_0
    :goto_2
    const-wide/16 v7, 0x0

    goto :goto_3

    :catchall_1
    move-object/from16 v3, v16

    goto :goto_2

    .line 91
    :goto_3
    :try_start_5
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/dz;->ivm()Lcom/bytedance/sdk/component/oa/uef/wk;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/wk;->yo()Ljava/io/InputStream;

    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_a

    .line 92
    :try_start_6
    invoke-static {v13}, Lcom/bytedance/sdk/component/xs/oa/uef;->xs(Ljava/util/Map;)Z

    move-result v4

    if-eqz v4, :cond_e

    instance-of v4, v0, Ljava/util/zip/GZIPInputStream;

    if-nez v4, :cond_e

    .line 93
    new-instance v4, Ljava/util/zip/GZIPInputStream;

    invoke-direct {v4, v0}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    move-object v0, v4

    :cond_e
    const/16 v4, 0x4000

    .line 94
    new-array v4, v4, [B

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    :goto_4
    rsub-int v2, v13, 0x4000

    .line 95
    invoke-virtual {v0, v4, v13, v2}, Ljava/io/InputStream;->read([BII)I

    move-result v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_9

    move-object/from16 v20, v0

    const/4 v0, -0x1

    if-eq v2, v0, :cond_12

    add-int/2addr v13, v2

    int-to-long v0, v2

    add-long/2addr v14, v0

    const-wide/16 v0, 0x4000

    .line 96
    :try_start_7
    rem-long v0, v14, v0

    const-wide/16 v18, 0x0

    cmp-long v0, v0, v18

    if-eqz v0, :cond_10

    sub-long v0, v10, v5

    cmp-long v0, v14, v0

    if-nez v0, :cond_f

    goto :goto_6

    :cond_f
    :goto_5
    move-object/from16 v1, p0

    goto :goto_7

    .line 97
    :cond_10
    :goto_6
    invoke-virtual {v3, v7, v8}, Ljava/io/RandomAccessFile;->seek(J)V

    const/4 v0, 0x0

    .line 98
    invoke-virtual {v3, v4, v0, v13}, Ljava/io/RandomAccessFile;->write([BII)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    int-to-long v0, v13

    add-long/2addr v7, v0

    const/4 v13, 0x0

    goto :goto_5

    .line 99
    :goto_7
    :try_start_8
    iget-boolean v0, v1, Lcom/bytedance/sdk/component/xs/oa/uef;->dj:Z

    if-nez v0, :cond_11

    move-object/from16 v0, v20

    const/4 v2, -0x1

    goto :goto_4

    .line 100
    :cond_11
    new-instance v0, Ljava/io/IOException;

    const-string v2, "net is cancel"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_2
    move-object/from16 v1, p0

    goto :goto_8

    :cond_12
    if-eqz v2, :cond_13

    .line 101
    invoke-virtual {v3, v7, v8}, Ljava/io/RandomAccessFile;->seek(J)V

    const/4 v7, 0x0

    .line 102
    invoke-virtual {v3, v4, v7, v13}, Ljava/io/RandomAccessFile;->write([BII)V

    :cond_13
    const-wide/16 v18, 0x0

    if-eqz v12, :cond_14

    cmp-long v0, v5, v18

    if-nez v0, :cond_15

    .line 103
    :cond_14
    iget-object v0, v1, Lcom/bytedance/sdk/component/xs/oa/uef;->oa:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v10

    :cond_15
    cmp-long v0, v10, v18

    if-lez v0, :cond_17

    .line 104
    iget-object v0, v1, Lcom/bytedance/sdk/component/xs/oa/uef;->oa:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_17

    iget-object v0, v1, Lcom/bytedance/sdk/component/xs/oa/uef;->oa:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v4

    cmp-long v0, v4, v10

    if-nez v0, :cond_17

    .line 105
    iget-object v0, v1, Lcom/bytedance/sdk/component/xs/oa/uef;->oa:Ljava/io/File;

    iget-object v2, v1, Lcom/bytedance/sdk/component/xs/oa/uef;->uef:Ljava/io/File;

    invoke-virtual {v0, v2}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_16

    .line 106
    iget-object v0, v1, Lcom/bytedance/sdk/component/xs/oa/uef;->uef:Ljava/io/File;

    invoke-virtual {v9, v0}, Lcom/bytedance/sdk/component/xs/oa;->uef(Ljava/io/File;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_b

    .line 107
    :try_start_9
    invoke-virtual/range {v20 .. v20}, Ljava/io/InputStream;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 108
    :catchall_3
    :try_start_a
    invoke-virtual {v3}, Ljava/io/RandomAccessFile;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    :catchall_4
    return-object v9

    .line 109
    :cond_16
    :try_start_b
    invoke-virtual/range {v20 .. v20}, Ljava/io/InputStream;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    .line 110
    :catchall_5
    :try_start_c
    invoke-virtual {v3}, Ljava/io/RandomAccessFile;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    :catchall_6
    return-object v16

    .line 111
    :cond_17
    :try_start_d
    iget-object v0, v1, Lcom/bytedance/sdk/component/xs/oa/uef;->oa:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->length()J
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_b

    .line 112
    :try_start_e
    invoke-virtual/range {v20 .. v20}, Ljava/io/InputStream;->close()V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_7

    .line 113
    :catchall_7
    :try_start_f
    invoke-virtual {v3}, Ljava/io/RandomAccessFile;->close()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_8

    :catchall_8
    return-object v16

    :catchall_9
    move-object/from16 v20, v0

    goto :goto_8

    :catchall_a
    move-object/from16 v20, v16

    :catchall_b
    :goto_8
    if-nez v12, :cond_19

    .line 114
    :try_start_10
    invoke-direct {v1}, Lcom/bytedance/sdk/component/xs/oa/uef;->zjm()V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_c

    goto :goto_9

    :catchall_c
    move-exception v0

    if-eqz v20, :cond_18

    .line 115
    :try_start_11
    invoke-virtual/range {v20 .. v20}, Ljava/io/InputStream;->close()V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_d

    .line 116
    :catchall_d
    :cond_18
    :try_start_12
    invoke-virtual {v3}, Ljava/io/RandomAccessFile;->close()V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_e

    .line 117
    :catchall_e
    :try_start_13
    throw v0
    :try_end_13
    .catch Ljava/io/IOException; {:try_start_13 .. :try_end_13} :catch_1

    :cond_19
    :goto_9
    if-eqz v20, :cond_1a

    .line 118
    :try_start_14
    invoke-virtual/range {v20 .. v20}, Ljava/io/InputStream;->close()V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_f

    .line 119
    :catchall_f
    :cond_1a
    :try_start_15
    invoke-virtual {v3}, Ljava/io/RandomAccessFile;->close()V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_10

    :catchall_10
    return-object v16

    :cond_1b
    move-object/from16 v16, v2

    goto :goto_b

    .line 120
    :catch_1
    :goto_a
    invoke-direct {v1}, Lcom/bytedance/sdk/component/xs/oa/uef;->zjm()V

    :goto_b
    return-object v16

    :catch_2
    move-object/from16 v16, v2

    .line 121
    const-string v0, "execute: Url is not a valid HTTP or HTTPS URL"

    invoke-static {v9, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_c
    return-object v16
.end method

.method public uef(Lcom/bytedance/sdk/component/xs/uef/uef;)V
    .locals 13

    .line 17
    iget-object v0, p0, Lcom/bytedance/sdk/component/xs/oa/uef;->uef:Ljava/io/File;

    if-eqz v0, :cond_7

    iget-object v1, p0, Lcom/bytedance/sdk/component/xs/oa/uef;->oa:Ljava/io/File;

    if-nez v1, :cond_0

    goto/16 :goto_1

    .line 18
    :cond_0
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/bytedance/sdk/component/xs/oa/uef;->uef:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v3

    cmp-long v0, v3, v1

    if-eqz v0, :cond_1

    if-eqz p1, :cond_1

    .line 19
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    .line 20
    new-instance v3, Lcom/bytedance/sdk/component/xs/oa;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v4, 0x1

    const/16 v5, 0xc8

    const-string v6, "Success"

    move-wide v11, v9

    invoke-direct/range {v3 .. v12}, Lcom/bytedance/sdk/component/xs/oa;-><init>(ZILjava/lang/String;Ljava/util/Map;Ljava/lang/String;JJ)V

    .line 21
    iget-object v0, p0, Lcom/bytedance/sdk/component/xs/oa/uef;->uef:Ljava/io/File;

    invoke-virtual {v3, v0}, Lcom/bytedance/sdk/component/xs/oa;->uef(Ljava/io/File;)V

    .line 22
    invoke-virtual {p1, p0, v3}, Lcom/bytedance/sdk/component/xs/uef/uef;->uef(Lcom/bytedance/sdk/component/xs/oa/yo;Lcom/bytedance/sdk/component/xs/oa;)V

    return-void

    .line 23
    :cond_1
    iget-object v0, p0, Lcom/bytedance/sdk/component/xs/oa/uef;->oa:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v3

    cmp-long v0, v3, v1

    if-gez v0, :cond_2

    goto :goto_0

    :cond_2
    move-wide v1, v3

    .line 24
    :goto_0
    new-instance v0, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    invoke-direct {v0}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;-><init>()V

    .line 25
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/xs/oa/yo;->moa()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->uef(Ljava/lang/Object;)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    .line 26
    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/component/xs/oa/yo;->uef(Lcom/bytedance/sdk/component/oa/uef/wrv$uef;)V

    .line 27
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "bytes="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v4, "-"

    .line 28
    invoke-static {v3, v1, v2, v4}, LVa/M6;->s(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 29
    const-string v4, "Range"

    invoke-virtual {p0, v4, v3}, Lcom/bytedance/sdk/component/xs/oa/yo;->oa(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    iget-object v3, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->bcc:Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 31
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Url is Empty"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0, v0}, Lcom/bytedance/sdk/component/xs/uef/uef;->uef(Lcom/bytedance/sdk/component/xs/oa/yo;Ljava/io/IOException;)V

    return-void

    .line 32
    :cond_3
    :try_start_0
    iget-object v3, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->bcc:Ljava/lang/String;

    invoke-virtual {v0, v3}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->oa(Ljava/lang/String;)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    .line 33
    iget-object v3, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->lw:Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_4

    .line 34
    iget-object v3, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->lw:Ljava/lang/String;

    invoke-virtual {v0, v3}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    .line 35
    :cond_4
    iget v3, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->ivm:I

    if-lez v3, :cond_5

    .line 36
    invoke-virtual {v0, v3}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->uef(I)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    :cond_5
    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/component/xs/oa/yo;->oa(Lcom/bytedance/sdk/component/oa/uef/wrv$uef;)V

    .line 38
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->uef()Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    move-result-object v0

    .line 39
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->oa()Lcom/bytedance/sdk/component/oa/uef/wrv;

    move-result-object v0

    .line 40
    iget-object v3, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->yo:Lcom/bytedance/sdk/component/oa/uef/dj;

    invoke-virtual {v3, v0}, Lcom/bytedance/sdk/component/oa/uef/dj;->uef(Lcom/bytedance/sdk/component/oa/uef/wrv;)Lcom/bytedance/sdk/component/oa/uef/oa;

    move-result-object v0

    if-nez v0, :cond_6

    .line 41
    new-instance v0, Ljava/io/IOException;

    const-string v1, "new call error"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0, v0}, Lcom/bytedance/sdk/component/xs/uef/uef;->uef(Lcom/bytedance/sdk/component/xs/oa/yo;Ljava/io/IOException;)V

    return-void

    .line 42
    :cond_6
    new-instance v3, Lcom/bytedance/sdk/component/xs/oa/uef$1;

    invoke-direct {v3, p0, p1, v1, v2}, Lcom/bytedance/sdk/component/xs/oa/uef$1;-><init>(Lcom/bytedance/sdk/component/xs/oa/uef;Lcom/bytedance/sdk/component/xs/uef/uef;J)V

    invoke-interface {v0, v3}, Lcom/bytedance/sdk/component/oa/uef/oa;->uef(Lcom/bytedance/sdk/component/oa/uef/yo;)V

    return-void

    .line 43
    :catch_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Url is not a valid HTTP or HTTPS URL"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0, v0}, Lcom/bytedance/sdk/component/xs/uef/uef;->uef(Lcom/bytedance/sdk/component/xs/oa/yo;Ljava/io/IOException;)V

    return-void

    :cond_7
    :goto_1
    if-eqz p1, :cond_8

    .line 44
    new-instance v0, Ljava/io/IOException;

    const-string v1, "File info is null, please exec setFileInfo(String dir, String fileName)"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0, v0}, Lcom/bytedance/sdk/component/xs/uef/uef;->uef(Lcom/bytedance/sdk/component/xs/oa/yo;Ljava/io/IOException;)V

    :cond_8
    return-void
.end method

.method public uef(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 3
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 4
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 5
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 6
    :cond_0
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_1

    .line 7
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 8
    :cond_1
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/bytedance/sdk/component/xs/oa/uef;->uef:Ljava/io/File;

    .line 9
    new-instance v0, Ljava/io/File;

    const-string v1, ".temp"

    .line 10
    invoke-static {p2, v1}, LN0/a;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 11
    invoke-direct {v0, p1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/bytedance/sdk/component/xs/oa/uef;->oa:Ljava/io/File;

    return-void
.end method
