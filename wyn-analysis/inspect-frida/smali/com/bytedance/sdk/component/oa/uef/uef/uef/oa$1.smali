.class Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/component/oa/uef/bcc;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->oa()Lcom/bytedance/sdk/component/oa/uef/dz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic uef:Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa$1;->uef:Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public uef(Lcom/bytedance/sdk/component/oa/uef/bcc$uef;)Lcom/bytedance/sdk/component/oa/uef/dz;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa$1;->uef:Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;

    .line 2
    .line 3
    invoke-interface {p1}, Lcom/bytedance/sdk/component/oa/uef/bcc$uef;->uef()Lcom/bytedance/sdk/component/oa/uef/wrv;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/component/oa/uef/uef/uef/oa;->uef(Lcom/bytedance/sdk/component/oa/uef/wrv;)Lcom/bytedance/sdk/component/oa/uef/dz;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method
