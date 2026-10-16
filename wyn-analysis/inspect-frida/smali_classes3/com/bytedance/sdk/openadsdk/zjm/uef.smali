.class public Lcom/bytedance/sdk/openadsdk/zjm/uef;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/component/lw/wk;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public uef(Ljava/lang/String;)Lcom/bytedance/sdk/component/lw/zjm;
    .locals 1

    .line 1
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/zjm/moa;->uef()Lcom/bytedance/sdk/component/lw/wk;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/bytedance/sdk/component/lw/wk;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/component/lw/zjm;

    move-result-object p1

    return-object p1
.end method

.method public uef(Ljava/lang/String;Ljava/lang/String;)Ljava/io/InputStream;
    .locals 1

    .line 2
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/zjm/moa;->uef()Lcom/bytedance/sdk/component/lw/wk;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/bytedance/sdk/component/lw/wk;->uef(Ljava/lang/String;Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p1

    return-object p1
.end method

.method public uef(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .line 3
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/zjm/moa;->uef()Lcom/bytedance/sdk/component/lw/wk;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lcom/bytedance/sdk/component/lw/wk;->uef(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method
