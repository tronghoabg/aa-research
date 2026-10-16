.class Lcom/bytedance/adsdk/oa/ivm$6;
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
        "Lcom/bytedance/adsdk/oa/xs;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic uef:Lcom/bytedance/adsdk/oa/ivm;


# direct methods
.method public constructor <init>(Lcom/bytedance/adsdk/oa/ivm;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/adsdk/oa/ivm$6;->uef:Lcom/bytedance/adsdk/oa/ivm;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public uef(Lcom/bytedance/adsdk/oa/xs;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bytedance/adsdk/oa/ivm$6;->uef:Lcom/bytedance/adsdk/oa/ivm;

    invoke-virtual {v0, p1}, Lcom/bytedance/adsdk/oa/ivm;->setComposition(Lcom/bytedance/adsdk/oa/xs;)V

    return-void
.end method

.method public bridge synthetic uef(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/bytedance/adsdk/oa/xs;

    invoke-virtual {p0, p1}, Lcom/bytedance/adsdk/oa/ivm$6;->uef(Lcom/bytedance/adsdk/oa/xs;)V

    return-void
.end method
