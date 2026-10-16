.class Lcom/bytedance/adsdk/oa/ivm$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/adsdk/oa/dj;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/adsdk/oa/ivm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/bytedance/adsdk/oa/dj<",
        "Ljava/lang/Throwable;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic uef:Lcom/bytedance/adsdk/oa/ivm;


# direct methods
.method public constructor <init>(Lcom/bytedance/adsdk/oa/ivm;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/adsdk/oa/ivm$7;->uef:Lcom/bytedance/adsdk/oa/ivm;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic uef(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lcom/bytedance/adsdk/oa/ivm$7;->uef(Ljava/lang/Throwable;)V

    return-void
.end method

.method public uef(Ljava/lang/Throwable;)V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/ivm$7;->uef:Lcom/bytedance/adsdk/oa/ivm;

    invoke-static {v0}, Lcom/bytedance/adsdk/oa/ivm;->uef(Lcom/bytedance/adsdk/oa/ivm;)I

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/ivm$7;->uef:Lcom/bytedance/adsdk/oa/ivm;

    invoke-static {v0}, Lcom/bytedance/adsdk/oa/ivm;->uef(Lcom/bytedance/adsdk/oa/ivm;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/bytedance/adsdk/oa/ivm;->setImageResource(I)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/ivm$7;->uef:Lcom/bytedance/adsdk/oa/ivm;

    invoke-static {v0}, Lcom/bytedance/adsdk/oa/ivm;->oa(Lcom/bytedance/adsdk/oa/ivm;)Lcom/bytedance/adsdk/oa/dj;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-static {}, Lcom/bytedance/adsdk/oa/ivm;->xs()Lcom/bytedance/adsdk/oa/dj;

    move-result-object v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/ivm$7;->uef:Lcom/bytedance/adsdk/oa/ivm;

    invoke-static {v0}, Lcom/bytedance/adsdk/oa/ivm;->oa(Lcom/bytedance/adsdk/oa/ivm;)Lcom/bytedance/adsdk/oa/dj;

    move-result-object v0

    .line 5
    :goto_0
    invoke-interface {v0, p1}, Lcom/bytedance/adsdk/oa/dj;->uef(Ljava/lang/Object;)V

    return-void
.end method
