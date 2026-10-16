.class Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/component/oa/uef/yo;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->uef()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic uef:Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;


# direct methods
.method public constructor <init>(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public uef(Lcom/bytedance/sdk/component/oa/uef/oa;Lcom/bytedance/sdk/component/oa/uef/dz;)V
    .locals 17
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v1, p0

    if-eqz p2, :cond_12

    const/4 v2, 0x0

    .line 2
    :try_start_0
    iget-object v0, v1, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;

    invoke-virtual/range {p2 .. p2}, Lcom/bytedance/sdk/component/oa/uef/dz;->moa()Z

    move-result v3

    invoke-static {v0, v3}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->uef(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;Z)Z

    .line 3
    iget-object v0, v1, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;

    invoke-static {v0}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->uef(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 4
    invoke-virtual/range {p2 .. p2}, Lcom/bytedance/sdk/component/oa/uef/dz;->ivm()Lcom/bytedance/sdk/component/oa/uef/wk;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 5
    :try_start_1
    iget-object v0, v1, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;

    invoke-static {v0}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->uef(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;)Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz v3, :cond_0

    .line 6
    iget-object v0, v1, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;

    invoke-virtual {v3}, Lcom/bytedance/sdk/component/oa/uef/wk;->uef()J

    move-result-wide v4

    iget-object v6, v1, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;

    invoke-static {v6}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->oa(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;)J

    move-result-wide v6

    add-long/2addr v4, v6

    invoke-static {v0, v4, v5}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->uef(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;J)J

    .line 7
    invoke-virtual {v3}, Lcom/bytedance/sdk/component/oa/uef/wk;->yo()Ljava/io/InputStream;

    move-result-object v2

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_9

    :cond_0
    :goto_0
    if-nez v2, :cond_3

    .line 8
    iget-object v0, v1, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;

    const-string v4, "input_stream is empty"

    const/16 v5, 0x7533

    invoke-static {v0, v5, v4}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->uef(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;ILjava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v2, :cond_1

    .line 9
    :try_start_2
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    :cond_1
    if-eqz v3, :cond_2

    .line 10
    invoke-virtual {v3}, Lcom/bytedance/sdk/component/oa/uef/wk;->close()V

    .line 11
    :cond_2
    invoke-virtual/range {p2 .. p2}, Lcom/bytedance/sdk/component/oa/uef/dz;->close()V

    .line 12
    iget-object v0, v1, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;

    invoke-static {v0}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->uef(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;)Z

    move-result v0

    if-eqz v0, :cond_e

    iget-object v0, v1, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;

    invoke-static {v0}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->cz(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v2

    iget-object v0, v1, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;

    invoke-static {v0}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->yo(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;)J

    move-result-wide v4

    cmp-long v0, v2, v4

    if-nez v0, :cond_e

    .line 13
    :goto_1
    iget-object v0, v1, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;

    invoke-static {v0}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->zjm(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    return-void

    .line 14
    :cond_3
    :try_start_3
    invoke-static {}, Lcom/bykv/vk/openvk/uef/uef/oa/uef;->xs()I

    move-result v0

    .line 15
    new-array v4, v0, [B

    .line 16
    iget-object v5, v1, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;

    invoke-static {v5}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->oa(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;)J

    move-result-wide v5

    .line 17
    iget-object v7, v1, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;

    invoke-static {v7}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->yo(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;)J

    iget-object v7, v1, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;

    invoke-static {v7}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->oa(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;)J

    iget-object v7, v1, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;

    invoke-static {v7}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->moa(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;)Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;

    move-result-object v7

    invoke-virtual {v7}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->ab()Ljava/lang/String;

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    move-wide v11, v7

    move v10, v9

    :goto_2
    sub-int v13, v0, v10

    .line 18
    invoke-virtual {v2, v4, v10, v13}, Ljava/io/InputStream;->read([BII)I

    move-result v13

    const/4 v14, -0x1

    if-eq v13, v14, :cond_8

    add-int/2addr v10, v13

    int-to-long v13, v13

    add-long/2addr v11, v13

    int-to-long v13, v0

    .line 19
    rem-long v13, v11, v13

    cmp-long v13, v13, v7

    if-eqz v13, :cond_5

    iget-object v13, v1, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;

    invoke-static {v13}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->yo(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;)J

    move-result-wide v13

    iget-object v15, v1, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;

    invoke-static {v15}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->oa(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;)J

    move-result-wide v15

    sub-long/2addr v13, v15

    cmp-long v13, v11, v13

    if-nez v13, :cond_4

    goto :goto_3

    :cond_4
    move v13, v9

    goto :goto_4

    :cond_5
    :goto_3
    const/4 v13, 0x1

    .line 20
    :goto_4
    iget-object v14, v1, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;

    invoke-static {v14}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->yo(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;)J

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v15, ", waitingAtPost="

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v14, v1, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;

    invoke-static {v14}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->lw(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;)J

    if-eqz v13, :cond_7

    .line 21
    iget-object v13, v1, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;

    invoke-static {v13}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->ivm(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;)Ljava/lang/Object;

    move-result-object v13

    monitor-enter v13
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 22
    :try_start_4
    iget-object v14, v1, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;

    invoke-static {v14}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->xs(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;)Ljava/io/RandomAccessFile;

    move-result-object v14

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/Long;->intValue()I

    move-result v15

    iget-object v7, v1, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;

    invoke-static {v7}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->moa(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;)Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;

    move-result-object v7

    invoke-virtual {v7}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->bs()Ljava/lang/String;

    move-result-object v7

    invoke-static {v14, v4, v15, v10, v7}, Lcom/bykv/vk/openvk/uef/uef/oa/moa/oa;->uef(Ljava/io/RandomAccessFile;[BIILjava/lang/String;)V

    .line 23
    iget-object v7, v1, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;

    invoke-static {v7}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->bcc(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;)Z

    move-result v7

    if-eqz v7, :cond_6

    iget-object v7, v1, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;

    invoke-static {v7}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->lw(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;)J

    move-result-wide v7

    const-wide/16 v14, -0x1

    cmp-long v7, v7, v14

    if-lez v7, :cond_6

    iget-object v7, v1, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;

    invoke-static {v7}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->oa(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;)J

    move-result-wide v7

    add-long/2addr v7, v11

    iget-object v14, v1, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;

    invoke-static {v14}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->lw(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;)J

    move-result-wide v14

    cmp-long v7, v7, v14

    if-ltz v7, :cond_6

    .line 24
    iget-object v7, v1, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;

    invoke-static {v7}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->ivm(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->notify()V

    goto :goto_5

    :catchall_1
    move-exception v0

    goto :goto_6

    .line 25
    :cond_6
    :goto_5
    monitor-exit v13
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    int-to-long v7, v10

    add-long/2addr v5, v7

    move v10, v9

    goto :goto_7

    :goto_6
    :try_start_5
    monitor-exit v13

    throw v0

    :cond_7
    :goto_7
    const-wide/16 v7, 0x0

    goto/16 :goto_2

    .line 26
    :cond_8
    iget-object v0, v1, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;

    invoke-static {v0}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->oa(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;)J

    iget-object v0, v1, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;

    invoke-static {v0}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->yo(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;)J

    iget-object v0, v1, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;

    invoke-static {v0}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->yo(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;)J

    iget-object v0, v1, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;

    invoke-static {v0}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->oa(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;)J
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_8

    :catchall_2
    move-exception v0

    move-object v3, v2

    goto :goto_9

    .line 27
    :cond_9
    :try_start_6
    iget-object v0, v1, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;

    invoke-virtual/range {p2 .. p2}, Lcom/bytedance/sdk/component/oa/uef/dz;->yo()I

    move-result v3

    invoke-virtual/range {p2 .. p2}, Lcom/bytedance/sdk/component/oa/uef/dz;->lw()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v3, v4}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->uef(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;ILjava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    move-object v3, v2

    :goto_8
    if-eqz v2, :cond_a

    .line 28
    :try_start_7
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    :cond_a
    if-eqz v3, :cond_b

    .line 29
    invoke-virtual {v3}, Lcom/bytedance/sdk/component/oa/uef/wk;->close()V

    .line 30
    :cond_b
    invoke-virtual/range {p2 .. p2}, Lcom/bytedance/sdk/component/oa/uef/dz;->close()V

    .line 31
    iget-object v0, v1, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;

    invoke-static {v0}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->uef(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;)Z

    move-result v0

    if-eqz v0, :cond_e

    iget-object v0, v1, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;

    invoke-static {v0}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->cz(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v2

    iget-object v0, v1, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;

    invoke-static {v0}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->yo(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;)J

    move-result-wide v4
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    cmp-long v0, v2, v4

    if-nez v0, :cond_e

    goto/16 :goto_1

    .line 32
    :goto_9
    :try_start_8
    iget-object v4, v1, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/16 v5, 0x7531

    invoke-static {v4, v5, v0}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->uef(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;ILjava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    if-eqz v2, :cond_c

    .line 33
    :try_start_9
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    :cond_c
    if-eqz v3, :cond_d

    .line 34
    invoke-virtual {v3}, Lcom/bytedance/sdk/component/oa/uef/wk;->close()V

    .line 35
    :cond_d
    invoke-virtual/range {p2 .. p2}, Lcom/bytedance/sdk/component/oa/uef/dz;->close()V

    .line 36
    iget-object v0, v1, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;

    invoke-static {v0}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->uef(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;)Z

    move-result v0

    if-eqz v0, :cond_e

    iget-object v0, v1, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;

    invoke-static {v0}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->cz(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v2

    iget-object v0, v1, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;

    invoke-static {v0}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->yo(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;)J

    move-result-wide v4

    cmp-long v0, v2, v4

    if-nez v0, :cond_e

    .line 37
    iget-object v0, v1, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;

    invoke-static {v0}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->zjm(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    :catchall_3
    :cond_e
    return-void

    :catchall_4
    move-exception v0

    if-eqz v2, :cond_f

    .line 38
    :try_start_a
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    :cond_f
    if-eqz v3, :cond_10

    .line 39
    invoke-virtual {v3}, Lcom/bytedance/sdk/component/oa/uef/wk;->close()V

    .line 40
    :cond_10
    invoke-virtual/range {p2 .. p2}, Lcom/bytedance/sdk/component/oa/uef/dz;->close()V

    .line 41
    iget-object v2, v1, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;

    invoke-static {v2}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->uef(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;)Z

    move-result v2

    if-eqz v2, :cond_11

    iget-object v2, v1, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;

    invoke-static {v2}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->cz(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;)Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->length()J

    move-result-wide v2

    iget-object v4, v1, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;

    invoke-static {v4}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->yo(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;)J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-nez v2, :cond_11

    .line 42
    iget-object v2, v1, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;

    invoke-static {v2}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->zjm(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 43
    :catchall_5
    :cond_11
    throw v0

    .line 44
    :cond_12
    iget-object v0, v1, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;

    const/16 v2, 0x7532

    const-string v3, "response is empty"

    invoke-static {v0, v2, v3}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->uef(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;ILjava/lang/String;)V

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/component/oa/uef/oa;Ljava/io/IOException;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa$1;->uef:Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;

    const/16 v0, 0x7530

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, v0, p2}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;->uef(Lcom/bykv/vk/openvk/uef/uef/oa/uef/uef/oa;ILjava/lang/String;)V

    return-void
.end method
