.class public Lcom/bytedance/sdk/component/utils/gzw;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/sdk/component/utils/gzw$uef;,
        Lcom/bytedance/sdk/component/utils/gzw$oa;
    }
.end annotation


# static fields
.field private static uef:Lcom/bytedance/sdk/component/utils/gzw$oa;


# direct methods
.method public static uef(Lcom/bytedance/sdk/component/utils/gzw$oa;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/bytedance/sdk/component/utils/gzw;->uef:Lcom/bytedance/sdk/component/utils/gzw$oa;

    return-void
.end method

.method public static uef(Ljava/lang/String;Lcom/bytedance/sdk/component/utils/gzw$uef;)V
    .locals 2

    .line 2
    sget-object v0, Lcom/bytedance/sdk/component/utils/gzw;->uef:Lcom/bytedance/sdk/component/utils/gzw$oa;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 3
    invoke-interface {v0, p0, v1, p1}, Lcom/bytedance/sdk/component/utils/gzw$oa;->uef(Ljava/lang/String;ZLcom/bytedance/sdk/component/utils/gzw$uef;)V

    return-void
.end method
