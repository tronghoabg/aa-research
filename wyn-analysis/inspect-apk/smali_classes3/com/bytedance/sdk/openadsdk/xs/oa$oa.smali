.class Lcom/bytedance/sdk/openadsdk/xs/oa$oa;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/sdk/openadsdk/xs/oa;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "oa"
.end annotation


# static fields
.field private static final uef:Lcom/bytedance/sdk/openadsdk/xs/oa;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/bytedance/sdk/openadsdk/xs/oa;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/bytedance/sdk/openadsdk/xs/oa;-><init>(Lcom/bytedance/sdk/openadsdk/xs/oa$1;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/bytedance/sdk/openadsdk/xs/oa$oa;->uef:Lcom/bytedance/sdk/openadsdk/xs/oa;

    .line 8
    .line 9
    return-void
.end method

.method public static synthetic uef()Lcom/bytedance/sdk/openadsdk/xs/oa;
    .locals 1

    .line 1
    sget-object v0, Lcom/bytedance/sdk/openadsdk/xs/oa$oa;->uef:Lcom/bytedance/sdk/openadsdk/xs/oa;

    .line 2
    .line 3
    return-object v0
.end method
