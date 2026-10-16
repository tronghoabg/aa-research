.class Lcom/bytedance/sdk/component/xs/oa/moa$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/component/oa/uef/yo;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/component/xs/oa/moa;->uef(Lcom/bytedance/sdk/component/xs/uef/uef;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic oa:Lcom/bytedance/sdk/component/xs/oa/moa;

.field final synthetic uef:Lcom/bytedance/sdk/component/xs/uef/uef;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/component/xs/oa/moa;Lcom/bytedance/sdk/component/xs/uef/uef;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/component/xs/oa/moa$1;->oa:Lcom/bytedance/sdk/component/xs/oa/moa;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/bytedance/sdk/component/xs/oa/moa$1;->uef:Lcom/bytedance/sdk/component/xs/uef/uef;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public uef(Lcom/bytedance/sdk/component/oa/uef/oa;Lcom/bytedance/sdk/component/oa/uef/dz;)V
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3
    const-string p1, "content-type"

    iget-object v0, p0, Lcom/bytedance/sdk/component/xs/oa/moa$1;->uef:Lcom/bytedance/sdk/component/xs/uef/uef;

    if-eqz v0, :cond_b

    if-nez p2, :cond_0

    .line 4
    iget-object p1, p0, Lcom/bytedance/sdk/component/xs/oa/moa$1;->oa:Lcom/bytedance/sdk/component/xs/oa/moa;

    new-instance p2, Ljava/io/IOException;

    const-string v1, "No response"

    invoke-direct {p2, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1, p2}, Lcom/bytedance/sdk/component/xs/uef/uef;->uef(Lcom/bytedance/sdk/component/xs/oa/yo;Ljava/io/IOException;)V

    return-void

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/component/xs/oa/moa$1;->oa:Lcom/bytedance/sdk/component/xs/oa/moa;

    invoke-virtual {p2}, Lcom/bytedance/sdk/component/oa/uef/dz;->cz()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/component/xs/oa/yo;->uef(Ljava/lang/String;)V

    const/4 v1, 0x0

    .line 6
    :try_start_0
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 7
    invoke-virtual {p2}, Lcom/bytedance/sdk/component/oa/uef/dz;->xs()Lcom/bytedance/sdk/component/oa/uef/ivm;

    move-result-object v0

    if-eqz v0, :cond_3

    const/4 v2, 0x0

    .line 8
    :goto_0
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/ivm;->uef()I

    move-result v3

    if-ge v2, v3, :cond_3

    .line 9
    invoke-virtual {v0, v2}, Lcom/bytedance/sdk/component/oa/uef/ivm;->uef(I)Ljava/lang/String;

    move-result-object v3

    .line 10
    invoke-virtual {v0, v2}, Lcom/bytedance/sdk/component/oa/uef/ivm;->oa(I)Ljava/lang/String;

    move-result-object v4

    .line 11
    invoke-virtual {v6, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v3, :cond_2

    .line 12
    invoke-virtual {v3, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    if-nez v4, :cond_1

    .line 13
    const-string v3, ""

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_3

    :cond_1
    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    :goto_1
    invoke-virtual {v6, p1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 14
    :cond_3
    invoke-virtual {p2}, Lcom/bytedance/sdk/component/oa/uef/dz;->ivm()Lcom/bytedance/sdk/component/oa/uef/wk;

    move-result-object p1

    .line 15
    invoke-static {v6}, Lcom/bytedance/sdk/component/xs/yo/uef;->uef(Ljava/util/Map;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 16
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/oa/uef/wk;->moa()[B

    move-result-object p1

    .line 17
    new-instance v2, Lcom/bytedance/sdk/component/xs/oa;

    invoke-virtual {p2}, Lcom/bytedance/sdk/component/oa/uef/dz;->moa()Z

    move-result v3

    invoke-virtual {p2}, Lcom/bytedance/sdk/component/oa/uef/dz;->yo()I

    move-result v4

    invoke-virtual {p2}, Lcom/bytedance/sdk/component/oa/uef/dz;->lw()Ljava/lang/String;

    move-result-object v5

    .line 18
    invoke-virtual {p2}, Lcom/bytedance/sdk/component/oa/uef/dz;->oa()J

    move-result-wide v8

    invoke-virtual {p2}, Lcom/bytedance/sdk/component/oa/uef/dz;->uef()J

    move-result-wide v10

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v11}, Lcom/bytedance/sdk/component/xs/oa;-><init>(ZILjava/lang/String;Ljava/util/Map;Ljava/lang/String;JJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    :try_start_1
    invoke-virtual {v2, p1}, Lcom/bytedance/sdk/component/xs/oa;->uef([B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object p1, v0

    move-object v1, v2

    goto :goto_3

    .line 20
    :cond_4
    :try_start_2
    iget-object v0, p0, Lcom/bytedance/sdk/component/xs/oa/moa$1;->oa:Lcom/bytedance/sdk/component/xs/oa/moa;

    iget-boolean v0, v0, Lcom/bytedance/sdk/component/xs/oa/yo;->zjm:Z

    if-eqz v0, :cond_5

    .line 21
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/oa/uef/wk;->moa()[B

    move-result-object v0

    .line 22
    new-instance v7, Ljava/lang/String;

    iget-object v2, p0, Lcom/bytedance/sdk/component/xs/oa/moa$1;->oa:Lcom/bytedance/sdk/component/xs/oa/moa;

    invoke-static {v2, p1}, Lcom/bytedance/sdk/component/xs/oa/moa;->uef(Lcom/bytedance/sdk/component/xs/oa/moa;Lcom/bytedance/sdk/component/oa/uef/wk;)Lcom/bytedance/sdk/component/oa/uef/cz;

    move-result-object p1

    invoke-static {v2, p1}, Lcom/bytedance/sdk/component/xs/oa/moa;->uef(Lcom/bytedance/sdk/component/xs/oa/moa;Lcom/bytedance/sdk/component/oa/uef/cz;)Ljava/nio/charset/Charset;

    move-result-object p1

    invoke-direct {v7, v0, p1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 23
    new-instance v2, Lcom/bytedance/sdk/component/xs/oa;

    invoke-virtual {p2}, Lcom/bytedance/sdk/component/oa/uef/dz;->moa()Z

    move-result v3

    invoke-virtual {p2}, Lcom/bytedance/sdk/component/oa/uef/dz;->yo()I

    move-result v4

    invoke-virtual {p2}, Lcom/bytedance/sdk/component/oa/uef/dz;->lw()Ljava/lang/String;

    move-result-object v5

    .line 24
    invoke-virtual {p2}, Lcom/bytedance/sdk/component/oa/uef/dz;->oa()J

    move-result-wide v8

    invoke-virtual {p2}, Lcom/bytedance/sdk/component/oa/uef/dz;->uef()J

    move-result-wide v10

    invoke-direct/range {v2 .. v11}, Lcom/bytedance/sdk/component/xs/oa;-><init>(ZILjava/lang/String;Ljava/util/Map;Ljava/lang/String;JJ)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 25
    :try_start_3
    invoke-virtual {v2, v0}, Lcom/bytedance/sdk/component/xs/oa;->uef([B)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_2

    :cond_5
    if-eqz p1, :cond_6

    .line 26
    :try_start_4
    new-instance v2, Lcom/bytedance/sdk/component/xs/oa;

    invoke-virtual {p2}, Lcom/bytedance/sdk/component/oa/uef/dz;->moa()Z

    move-result v3

    invoke-virtual {p2}, Lcom/bytedance/sdk/component/oa/uef/dz;->yo()I

    move-result v4

    invoke-virtual {p2}, Lcom/bytedance/sdk/component/oa/uef/dz;->lw()Ljava/lang/String;

    move-result-object v5

    .line 27
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/oa/uef/wk;->oa()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p2}, Lcom/bytedance/sdk/component/oa/uef/dz;->oa()J

    move-result-wide v8

    invoke-virtual {p2}, Lcom/bytedance/sdk/component/oa/uef/dz;->uef()J

    move-result-wide v10

    invoke-direct/range {v2 .. v11}, Lcom/bytedance/sdk/component/xs/oa;-><init>(ZILjava/lang/String;Ljava/util/Map;Ljava/lang/String;JJ)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 28
    :goto_2
    :try_start_5
    iget-object p1, p0, Lcom/bytedance/sdk/component/xs/oa/moa$1;->oa:Lcom/bytedance/sdk/component/xs/oa/moa;

    invoke-static {p1, v2, p2}, Lcom/bytedance/sdk/component/xs/oa/moa;->uef(Lcom/bytedance/sdk/component/xs/oa/moa;Lcom/bytedance/sdk/component/xs/oa;Lcom/bytedance/sdk/component/oa/uef/dz;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_4

    .line 29
    :cond_6
    :try_start_6
    new-instance p1, Ljava/io/IOException;

    invoke-virtual {p2}, Lcom/bytedance/sdk/component/oa/uef/dz;->lw()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 30
    :goto_3
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    move-object v2, v1

    move-object v1, v0

    :goto_4
    if-eqz v2, :cond_7

    .line 31
    iget-object p1, p0, Lcom/bytedance/sdk/component/xs/oa/moa$1;->uef:Lcom/bytedance/sdk/component/xs/uef/uef;

    iget-object p2, p0, Lcom/bytedance/sdk/component/xs/oa/moa$1;->oa:Lcom/bytedance/sdk/component/xs/oa/moa;

    invoke-virtual {p1, p2, v2}, Lcom/bytedance/sdk/component/xs/uef/uef;->uef(Lcom/bytedance/sdk/component/xs/oa/yo;Lcom/bytedance/sdk/component/xs/oa;)V

    return-void

    .line 32
    :cond_7
    iget-object p1, p0, Lcom/bytedance/sdk/component/xs/oa/moa$1;->uef:Lcom/bytedance/sdk/component/xs/uef/uef;

    instance-of v0, p1, Lcom/bytedance/sdk/component/xs/uef/oa;

    const-string v2, "Unexpected exception"

    if-eqz v0, :cond_9

    .line 33
    check-cast p1, Lcom/bytedance/sdk/component/xs/uef/oa;

    iget-object v0, p0, Lcom/bytedance/sdk/component/xs/oa/moa$1;->oa:Lcom/bytedance/sdk/component/xs/oa/moa;

    if-nez v1, :cond_8

    new-instance v1, Ljava/io/IOException;

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    :cond_8
    new-instance v2, Lcom/bytedance/sdk/component/xs/oa;

    .line 34
    invoke-virtual {p2}, Lcom/bytedance/sdk/component/oa/uef/dz;->moa()Z

    move-result v3

    invoke-virtual {p2}, Lcom/bytedance/sdk/component/oa/uef/dz;->yo()I

    move-result v4

    invoke-virtual {p2}, Lcom/bytedance/sdk/component/oa/uef/dz;->lw()Ljava/lang/String;

    move-result-object v5

    .line 35
    invoke-virtual {p2}, Lcom/bytedance/sdk/component/oa/uef/dz;->oa()J

    move-result-wide v8

    invoke-virtual {p2}, Lcom/bytedance/sdk/component/oa/uef/dz;->uef()J

    move-result-wide v10

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v11}, Lcom/bytedance/sdk/component/xs/oa;-><init>(ZILjava/lang/String;Ljava/util/Map;Ljava/lang/String;JJ)V

    .line 36
    invoke-virtual {p1, v0, v1, v2}, Lcom/bytedance/sdk/component/xs/uef/oa;->uef(Lcom/bytedance/sdk/component/xs/oa/yo;Ljava/io/IOException;Lcom/bytedance/sdk/component/xs/oa;)V

    return-void

    .line 37
    :cond_9
    iget-object p2, p0, Lcom/bytedance/sdk/component/xs/oa/moa$1;->oa:Lcom/bytedance/sdk/component/xs/oa/moa;

    if-nez v1, :cond_a

    new-instance v1, Ljava/io/IOException;

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    :cond_a
    invoke-virtual {p1, p2, v1}, Lcom/bytedance/sdk/component/xs/uef/uef;->uef(Lcom/bytedance/sdk/component/xs/oa/yo;Ljava/io/IOException;)V

    :cond_b
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/component/oa/uef/oa;Ljava/io/IOException;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/bytedance/sdk/component/xs/oa/moa$1;->uef:Lcom/bytedance/sdk/component/xs/uef/uef;

    if-eqz p1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/component/xs/oa/moa$1;->oa:Lcom/bytedance/sdk/component/xs/oa/moa;

    invoke-virtual {p1, v0, p2}, Lcom/bytedance/sdk/component/xs/uef/uef;->uef(Lcom/bytedance/sdk/component/xs/oa/yo;Ljava/io/IOException;)V

    :cond_0
    return-void
.end method
