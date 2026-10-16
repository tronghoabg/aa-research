.class public Lcom/bytedance/sdk/openadsdk/wrv/uef/wrv;
.super Lcom/bytedance/sdk/component/uef/sy;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bytedance/sdk/component/uef/sy<",
        "Lorg/json/JSONObject;",
        "Lorg/json/JSONObject;",
        ">;"
    }
.end annotation


# static fields
.field private static final uef:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final oa:Lcom/bytedance/sdk/openadsdk/core/oyt;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    const-string v1, "getCurrentCountdownStatus"

    .line 4
    .line 5
    const-string v2, "popupRenderDidFinish"

    .line 6
    .line 7
    const-string v3, "popupShow"

    .line 8
    .line 9
    const-string v4, "popupDismiss"

    .line 10
    .line 11
    const-string v5, "changeCountdownStatus"

    .line 12
    .line 13
    filled-new-array {v3, v4, v5, v1, v2}, [Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 22
    .line 23
    .line 24
    sput-object v0, Lcom/bytedance/sdk/openadsdk/wrv/uef/wrv;->uef:Ljava/util/HashSet;

    .line 25
    .line 26
    return-void
.end method

.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/core/oyt;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/bytedance/sdk/component/uef/sy;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/wrv/uef/wrv;->oa:Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 5
    .line 6
    return-void
.end method

.method public static uef(Lcom/bytedance/sdk/component/uef/wk;Lcom/bytedance/sdk/openadsdk/core/oyt;)V
    .locals 2

    .line 2
    sget-object v0, Lcom/bytedance/sdk/openadsdk/wrv/uef/wrv;->uef:Ljava/util/HashSet;

    new-instance v1, Lcom/bytedance/sdk/openadsdk/wrv/uef/wrv;

    invoke-direct {v1, p1}, Lcom/bytedance/sdk/openadsdk/wrv/uef/wrv;-><init>(Lcom/bytedance/sdk/openadsdk/core/oyt;)V

    invoke-virtual {p0, v0, v1}, Lcom/bytedance/sdk/component/uef/wk;->uef(Ljava/util/Set;Lcom/bytedance/sdk/component/uef/sy;)Lcom/bytedance/sdk/component/uef/wk;

    return-void
.end method


# virtual methods
.method public bridge synthetic uef(Ljava/lang/String;Ljava/lang/Object;Lcom/bytedance/sdk/component/uef/lw;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    check-cast p2, Lorg/json/JSONObject;

    invoke-virtual {p0, p1, p2, p3}, Lcom/bytedance/sdk/openadsdk/wrv/uef/wrv;->uef(Ljava/lang/String;Lorg/json/JSONObject;Lcom/bytedance/sdk/component/uef/lw;)Lorg/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public uef(Ljava/lang/String;Lorg/json/JSONObject;Lcom/bytedance/sdk/component/uef/lw;)Lorg/json/JSONObject;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p3, 0x0

    const/4 v0, -0x1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v1, "changeCountdownStatus"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x4

    goto :goto_0

    :sswitch_1
    const-string v1, "popupRenderDidFinish"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x3

    goto :goto_0

    :sswitch_2
    const-string v1, "getCurrentCountdownStatus"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x2

    goto :goto_0

    :sswitch_3
    const-string v1, "popupShow"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v0, 0x1

    goto :goto_0

    :sswitch_4
    const-string v1, "popupDismiss"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_0

    :cond_4
    const/4 v0, 0x0

    :goto_0
    packed-switch v0, :pswitch_data_0

    return-object p3

    .line 4
    :pswitch_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/wrv/uef/wrv;->oa:Lcom/bytedance/sdk/openadsdk/core/oyt;

    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/core/oyt;->dj(Lorg/json/JSONObject;)V

    return-object p3

    .line 5
    :pswitch_1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/wrv/uef/wrv;->oa:Lcom/bytedance/sdk/openadsdk/core/oyt;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/oyt;->sy()V

    return-object p3

    .line 6
    :pswitch_2
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/wrv/uef/wrv;->oa:Lcom/bytedance/sdk/openadsdk/core/oyt;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/oyt;->bs()Lorg/json/JSONObject;

    move-result-object p1

    return-object p1

    .line 7
    :pswitch_3
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/wrv/uef/wrv;->oa:Lcom/bytedance/sdk/openadsdk/core/oyt;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/oyt;->wk()V

    return-object p3

    .line 8
    :pswitch_4
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/wrv/uef/wrv;->oa:Lcom/bytedance/sdk/openadsdk/core/oyt;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/oyt;->ab()V

    return-object p3

    :sswitch_data_0
    .sparse-switch
        -0x3655ffc2 -> :sswitch_4
        -0x24ba7637 -> :sswitch_3
        -0x1b656640 -> :sswitch_2
        0x1f4402b0 -> :sswitch_1
        0x5aa0b7b3 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
