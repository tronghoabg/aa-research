.class public Lcom/bytedance/sdk/openadsdk/core/dhk;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private oa:Z

.field private uef:Ljava/lang/String;

.field private final yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/dhk;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public oa()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dhk;->uef:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public uef(Ljava/lang/String;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/dhk;->uef:Ljava/lang/String;

    return-void
.end method

.method public uef(Z)V
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/core/dhk;->oa:Z

    return-void
.end method

.method public uef()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/dhk;->oa:Z

    return v0
.end method
