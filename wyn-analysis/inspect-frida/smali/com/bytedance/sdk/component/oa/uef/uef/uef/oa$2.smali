.class Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa$2;
.super Lcom/bytedance/sdk/component/bcc/oa/yo;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->uef(Lcom/bytedance/sdk/component/oa/uef/yo;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic oa:Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;

.field final synthetic uef:Lcom/bytedance/sdk/component/oa/uef/yo;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;Ljava/lang/String;ILcom/bytedance/sdk/component/oa/uef/yo;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa$2;->oa:Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;

    .line 2
    .line 3
    iput-object p4, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa$2;->uef:Lcom/bytedance/sdk/component/oa/uef/yo;

    .line 4
    .line 5
    invoke-direct {p0, p2, p3}, Lcom/bytedance/sdk/component/bcc/oa/yo;-><init>(Ljava/lang/String;I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa$2;->oa:Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->oa()Lcom/bytedance/sdk/component/oa/uef/dz;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa$2;->uef:Lcom/bytedance/sdk/component/oa/uef/yo;

    .line 10
    .line 11
    iget-object v1, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa$2;->oa:Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;

    .line 12
    .line 13
    new-instance v2, Ljava/io/IOException;

    .line 14
    .line 15
    const-string v3, "response is null"

    .line 16
    .line 17
    invoke-direct {v2, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v0, v1, v2}, Lcom/bytedance/sdk/component/oa/uef/yo;->uef(Lcom/bytedance/sdk/component/oa/uef/oa;Ljava/io/IOException;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :catch_0
    move-exception v0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object v1, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa$2;->uef:Lcom/bytedance/sdk/component/oa/uef/yo;

    .line 27
    .line 28
    iget-object v2, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa$2;->oa:Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;

    .line 29
    .line 30
    invoke-interface {v1, v2, v0}, Lcom/bytedance/sdk/component/oa/uef/yo;->uef(Lcom/bytedance/sdk/component/oa/uef/oa;Lcom/bytedance/sdk/component/oa/uef/dz;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :goto_0
    iget-object v1, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa$2;->uef:Lcom/bytedance/sdk/component/oa/uef/yo;

    .line 35
    .line 36
    iget-object v2, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa$2;->oa:Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;

    .line 37
    .line 38
    invoke-interface {v1, v2, v0}, Lcom/bytedance/sdk/component/oa/uef/yo;->uef(Lcom/bytedance/sdk/component/oa/uef/oa;Ljava/io/IOException;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method
