.class public Lcom/bytedance/sdk/openadsdk/core/dz/oa/uef$uef;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/sdk/openadsdk/core/dz/oa/uef;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "uef"
.end annotation


# instance fields
.field private final oa:J

.field private final uef:Ljava/lang/String;

.field private yo:Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$yo;


# direct methods
.method public constructor <init>(Ljava/lang/String;J)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$yo;->uef:Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$yo;

    .line 5
    .line 6
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/oa/uef$uef;->yo:Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$yo;

    .line 7
    .line 8
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/dz/oa/uef$uef;->uef:Ljava/lang/String;

    .line 9
    .line 10
    iput-wide p2, p0, Lcom/bytedance/sdk/openadsdk/core/dz/oa/uef$uef;->oa:J

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public uef()Lcom/bytedance/sdk/openadsdk/core/dz/oa/uef;
    .locals 6

    .line 1
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/dz/oa/uef;

    .line 2
    .line 3
    iget-wide v1, p0, Lcom/bytedance/sdk/openadsdk/core/dz/oa/uef$uef;->oa:J

    .line 4
    .line 5
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/core/dz/oa/uef$uef;->uef:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/core/dz/oa/uef$uef;->yo:Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$yo;

    .line 8
    .line 9
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-direct/range {v0 .. v5}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/uef;-><init>(JLjava/lang/String;Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$yo;Ljava/lang/Boolean;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method
