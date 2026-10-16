.class Lcom/bytedance/sdk/openadsdk/ab/moa$17;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/ab/oa;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/ab/moa;->oa(Lcom/bytedance/sdk/openadsdk/ab/uef/moa;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic oa:Lcom/bytedance/sdk/openadsdk/ab/moa;

.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/ab/uef/moa;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/ab/moa;Lcom/bytedance/sdk/openadsdk/ab/uef/moa;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/ab/moa$17;->oa:Lcom/bytedance/sdk/openadsdk/ab/moa;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/ab/moa$17;->uef:Lcom/bytedance/sdk/openadsdk/ab/uef/moa;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public uef()Lcom/bytedance/sdk/openadsdk/ab/uef/yo;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/ab/moa$17;->uef:Lcom/bytedance/sdk/openadsdk/ab/uef/moa;

    .line 2
    .line 3
    return-object v0
.end method
