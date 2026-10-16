.class Lcom/bytedance/sdk/component/oa$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/component/oa;->uef(Lcom/bytedance/sdk/component/oa$oa;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic oa:Z

.field final synthetic uef:Lcom/bytedance/sdk/component/oa$oa;

.field final synthetic yo:Lcom/bytedance/sdk/component/oa;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/component/oa;Lcom/bytedance/sdk/component/oa$oa;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/component/oa$3;->yo:Lcom/bytedance/sdk/component/oa;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/bytedance/sdk/component/oa$3;->uef:Lcom/bytedance/sdk/component/oa$oa;

    .line 4
    .line 5
    iput-boolean p3, p0, Lcom/bytedance/sdk/component/oa$3;->oa:Z

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/oa$3;->yo:Lcom/bytedance/sdk/component/oa;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/bytedance/sdk/component/oa;->bcc(Lcom/bytedance/sdk/component/oa;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object v1, p0, Lcom/bytedance/sdk/component/oa$3;->yo:Lcom/bytedance/sdk/component/oa;

    .line 9
    .line 10
    iget-object v2, p0, Lcom/bytedance/sdk/component/oa$3;->uef:Lcom/bytedance/sdk/component/oa$oa;

    .line 11
    .line 12
    iget-boolean v3, p0, Lcom/bytedance/sdk/component/oa$3;->oa:Z

    .line 13
    .line 14
    invoke-static {v1, v2, v3}, Lcom/bytedance/sdk/component/oa;->oa(Lcom/bytedance/sdk/component/oa;Lcom/bytedance/sdk/component/oa$oa;Z)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception v1

    .line 19
    goto :goto_1

    .line 20
    :catch_0
    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    iget-object v0, p0, Lcom/bytedance/sdk/component/oa$3;->yo:Lcom/bytedance/sdk/component/oa;

    .line 22
    .line 23
    invoke-static {v0}, Lcom/bytedance/sdk/component/oa;->oa(Lcom/bytedance/sdk/component/oa;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    monitor-enter v0

    .line 28
    :try_start_2
    iget-object v1, p0, Lcom/bytedance/sdk/component/oa$3;->yo:Lcom/bytedance/sdk/component/oa;

    .line 29
    .line 30
    invoke-static {v1}, Lcom/bytedance/sdk/component/oa;->cz(Lcom/bytedance/sdk/component/oa;)I

    .line 31
    .line 32
    .line 33
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 34
    return-void

    .line 35
    :catchall_1
    move-exception v1

    .line 36
    monitor-exit v0

    .line 37
    throw v1

    .line 38
    :goto_1
    monitor-exit v0

    .line 39
    throw v1
.end method
