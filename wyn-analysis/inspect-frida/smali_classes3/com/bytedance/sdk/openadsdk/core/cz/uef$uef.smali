.class Lcom/bytedance/sdk/openadsdk/core/cz/uef$uef;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/sdk/openadsdk/core/cz/uef;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "uef"
.end annotation


# instance fields
.field private final oa:Ljava/lang/String;

.field private final uef:J


# direct methods
.method private constructor <init>(JLjava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Lcom/bytedance/sdk/openadsdk/core/cz/uef$uef;->uef:J

    .line 4
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/core/cz/uef$uef;->oa:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(JLjava/lang/String;Lcom/bytedance/sdk/openadsdk/core/cz/uef$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/bytedance/sdk/openadsdk/core/cz/uef$uef;-><init>(JLjava/lang/String;)V

    return-void
.end method

.method public static synthetic oa(Lcom/bytedance/sdk/openadsdk/core/cz/uef$uef;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/core/cz/uef$uef;->oa:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/core/cz/uef$uef;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/core/cz/uef$uef;->uef:J

    .line 2
    .line 3
    return-wide v0
.end method
