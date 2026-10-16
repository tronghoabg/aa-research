.class public Lcom/bytedance/sdk/openadsdk/ab/uef;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic oa()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/ab/uef;->yo()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static uef()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/km;->ivm()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lcom/bytedance/sdk/openadsdk/ab/uef$1;

    .line 8
    .line 9
    const-string v1, "DailyTaskHelper"

    .line 10
    .line 11
    invoke-direct {v0, v1}, Lcom/bytedance/sdk/openadsdk/ab/uef$1;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/utils/km;->uef(Lcom/bytedance/sdk/component/bcc/oa/yo;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/ab/uef;->yo()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method private static yo()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/gr;->uef()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
