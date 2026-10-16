.class public Lcom/bytedance/sdk/component/utils/wk;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static oa:I = 0x4

.field private static uef:Z = false

.field private static yo:Ljava/lang/String; = ""


# direct methods
.method public static oa()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    sput-boolean v0, Lcom/bytedance/sdk/component/utils/wk;->uef:Z

    .line 3
    .line 4
    const/4 v0, 0x7

    .line 5
    invoke-static {v0}, Lcom/bytedance/sdk/component/utils/wk;->uef(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static uef()V
    .locals 1

    const/4 v0, 0x1

    .line 3
    sput-boolean v0, Lcom/bytedance/sdk/component/utils/wk;->uef:Z

    const/4 v0, 0x3

    .line 4
    invoke-static {v0}, Lcom/bytedance/sdk/component/utils/wk;->uef(I)V

    return-void
.end method

.method public static uef(I)V
    .locals 0

    .line 2
    sput p0, Lcom/bytedance/sdk/component/utils/wk;->oa:I

    return-void
.end method

.method public static uef(Ljava/lang/String;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/bytedance/sdk/component/utils/wk;->yo:Ljava/lang/String;

    return-void
.end method

.method public static yo()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/bytedance/sdk/component/utils/wk;->uef:Z

    .line 2
    .line 3
    return v0
.end method
