.class public Lcom/bytedance/sdk/component/bcc/uef;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static uef:Lcom/bytedance/sdk/component/uef;


# direct methods
.method public static uef(Lcom/bytedance/sdk/component/uef;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/bytedance/sdk/component/bcc/uef;->uef:Lcom/bytedance/sdk/component/uef;

    return-void
.end method

.method public static uef(Ljava/lang/Runnable;)V
    .locals 1

    .line 2
    sget-object v0, Lcom/bytedance/sdk/component/bcc/uef;->uef:Lcom/bytedance/sdk/component/uef;

    if-nez v0, :cond_0

    return-void

    .line 3
    :cond_0
    invoke-interface {v0, p0}, Lcom/bytedance/sdk/component/uef;->uef(Ljava/lang/Runnable;)V

    return-void
.end method
