.class public interface abstract Lcom/bytedance/sdk/openadsdk/core/settings/lw;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/sdk/openadsdk/core/settings/lw$uef;,
        Lcom/bytedance/sdk/openadsdk/core/settings/lw$oa;
    }
.end annotation


# static fields
.field public static final oa:Lcom/bytedance/sdk/openadsdk/core/settings/lw$oa;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bytedance/sdk/openadsdk/core/settings/lw$oa<",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field public static final uef:Lcom/bytedance/sdk/openadsdk/core/settings/lw$oa;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bytedance/sdk/openadsdk/core/settings/lw$oa<",
            "Lorg/json/JSONObject;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/settings/lw$1;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/bytedance/sdk/openadsdk/core/settings/lw;->uef:Lcom/bytedance/sdk/openadsdk/core/settings/lw$oa;

    .line 7
    .line 8
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/settings/lw$2;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/core/settings/lw$2;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/bytedance/sdk/openadsdk/core/settings/lw;->oa:Lcom/bytedance/sdk/openadsdk/core/settings/lw$oa;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public abstract uef(Lorg/json/JSONObject;)V
.end method
