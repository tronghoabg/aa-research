.class Lcom/bytedance/sdk/component/uef/ivm$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/component/uef/yo$uef;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/component/uef/ivm;->uef(Lcom/bytedance/sdk/component/uef/dz;Lcom/bytedance/sdk/component/uef/yo;Lcom/bytedance/sdk/component/uef/lw;)Lcom/bytedance/sdk/component/uef/ivm$uef;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic oa:Lcom/bytedance/sdk/component/uef/dz;

.field final synthetic uef:Lcom/bytedance/sdk/component/uef/yo;

.field final synthetic yo:Lcom/bytedance/sdk/component/uef/ivm;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/component/uef/ivm;Lcom/bytedance/sdk/component/uef/yo;Lcom/bytedance/sdk/component/uef/dz;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/component/uef/ivm$1;->yo:Lcom/bytedance/sdk/component/uef/ivm;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/bytedance/sdk/component/uef/ivm$1;->uef:Lcom/bytedance/sdk/component/uef/yo;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/bytedance/sdk/component/uef/ivm$1;->oa:Lcom/bytedance/sdk/component/uef/dz;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public uef(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/uef/ivm$1;->yo:Lcom/bytedance/sdk/component/uef/ivm;

    invoke-static {v0}, Lcom/bytedance/sdk/component/uef/ivm;->uef(Lcom/bytedance/sdk/component/uef/ivm;)Lcom/bytedance/sdk/component/uef/uef;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/component/uef/ivm$1;->yo:Lcom/bytedance/sdk/component/uef/ivm;

    invoke-static {v0}, Lcom/bytedance/sdk/component/uef/ivm;->uef(Lcom/bytedance/sdk/component/uef/ivm;)Lcom/bytedance/sdk/component/uef/uef;

    move-result-object v0

    iget-object v1, p0, Lcom/bytedance/sdk/component/uef/ivm$1;->yo:Lcom/bytedance/sdk/component/uef/ivm;

    invoke-static {v1}, Lcom/bytedance/sdk/component/uef/ivm;->oa(Lcom/bytedance/sdk/component/uef/ivm;)Lcom/bytedance/sdk/component/uef/xs;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/bytedance/sdk/component/uef/xs;->uef(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lcom/bytedance/sdk/component/uef/ivm$1;->uef:Lcom/bytedance/sdk/component/uef/yo;

    invoke-virtual {v1}, Lcom/bytedance/sdk/component/uef/oa;->oa()Z

    move-result v1

    invoke-static {p1, v1}, Lcom/bytedance/sdk/component/uef/oib;->uef(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lcom/bytedance/sdk/component/uef/ivm$1;->oa:Lcom/bytedance/sdk/component/uef/dz;

    invoke-virtual {v0, p1, v1}, Lcom/bytedance/sdk/component/uef/uef;->oa(Ljava/lang/String;Lcom/bytedance/sdk/component/uef/dz;)V

    .line 3
    iget-object p1, p0, Lcom/bytedance/sdk/component/uef/ivm$1;->yo:Lcom/bytedance/sdk/component/uef/ivm;

    invoke-static {p1}, Lcom/bytedance/sdk/component/uef/ivm;->yo(Lcom/bytedance/sdk/component/uef/ivm;)Ljava/util/Set;

    move-result-object p1

    iget-object v0, p0, Lcom/bytedance/sdk/component/uef/ivm$1;->uef:Lcom/bytedance/sdk/component/uef/yo;

    invoke-interface {p1, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public uef(Ljava/lang/Throwable;)V
    .locals 2

    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/component/uef/ivm$1;->yo:Lcom/bytedance/sdk/component/uef/ivm;

    invoke-static {v0}, Lcom/bytedance/sdk/component/uef/ivm;->uef(Lcom/bytedance/sdk/component/uef/ivm;)Lcom/bytedance/sdk/component/uef/uef;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/component/uef/ivm$1;->yo:Lcom/bytedance/sdk/component/uef/ivm;

    invoke-static {v0}, Lcom/bytedance/sdk/component/uef/ivm;->uef(Lcom/bytedance/sdk/component/uef/ivm;)Lcom/bytedance/sdk/component/uef/uef;

    move-result-object v0

    invoke-static {p1}, Lcom/bytedance/sdk/component/uef/oib;->uef(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lcom/bytedance/sdk/component/uef/ivm$1;->oa:Lcom/bytedance/sdk/component/uef/dz;

    invoke-virtual {v0, p1, v1}, Lcom/bytedance/sdk/component/uef/uef;->oa(Ljava/lang/String;Lcom/bytedance/sdk/component/uef/dz;)V

    .line 6
    iget-object p1, p0, Lcom/bytedance/sdk/component/uef/ivm$1;->yo:Lcom/bytedance/sdk/component/uef/ivm;

    invoke-static {p1}, Lcom/bytedance/sdk/component/uef/ivm;->yo(Lcom/bytedance/sdk/component/uef/ivm;)Ljava/util/Set;

    move-result-object p1

    iget-object v0, p0, Lcom/bytedance/sdk/component/uef/ivm$1;->uef:Lcom/bytedance/sdk/component/uef/yo;

    invoke-interface {p1, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method
