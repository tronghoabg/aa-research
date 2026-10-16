.class Lcom/bytedance/adsdk/ugeno/moa/cz$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/adsdk/ugeno/moa/cz;->uef(Lcom/bytedance/adsdk/ugeno/oa/yo;Ljava/lang/String;Ljava/util/List;Lcom/bytedance/adsdk/ugeno/moa/ivm;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic lw:Lcom/bytedance/adsdk/ugeno/moa/cz;

.field final synthetic moa:Ljava/util/List;

.field final synthetic oa:I

.field final synthetic uef:Ljava/lang/String;

.field final synthetic yo:Lcom/bytedance/adsdk/ugeno/oa/yo;


# direct methods
.method public constructor <init>(Lcom/bytedance/adsdk/ugeno/moa/cz;Ljava/lang/String;ILcom/bytedance/adsdk/ugeno/oa/yo;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/bytedance/adsdk/ugeno/moa/cz$1;->lw:Lcom/bytedance/adsdk/ugeno/moa/cz;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/bytedance/adsdk/ugeno/moa/cz$1;->uef:Ljava/lang/String;

    .line 4
    .line 5
    iput p3, p0, Lcom/bytedance/adsdk/ugeno/moa/cz$1;->oa:I

    .line 6
    .line 7
    iput-object p4, p0, Lcom/bytedance/adsdk/ugeno/moa/cz$1;->yo:Lcom/bytedance/adsdk/ugeno/oa/yo;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/bytedance/adsdk/ugeno/moa/cz$1;->moa:Ljava/util/List;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "trigger on.name is "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lcom/bytedance/adsdk/ugeno/moa/cz$1;->uef:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, " and delay time is up "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget v1, p0, Lcom/bytedance/adsdk/ugeno/moa/cz$1;->oa:I

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, "GesThrough_UGEveFacade"

    .line 28
    .line 29
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/moa/cz$1;->lw:Lcom/bytedance/adsdk/ugeno/moa/cz;

    .line 33
    .line 34
    invoke-static {v0}, Lcom/bytedance/adsdk/ugeno/moa/cz;->uef(Lcom/bytedance/adsdk/ugeno/moa/cz;)Lcom/bytedance/adsdk/ugeno/core/lw;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/moa/cz$1;->lw:Lcom/bytedance/adsdk/ugeno/moa/cz;

    .line 41
    .line 42
    invoke-static {v0}, Lcom/bytedance/adsdk/ugeno/moa/cz;->uef(Lcom/bytedance/adsdk/ugeno/moa/cz;)Lcom/bytedance/adsdk/ugeno/core/lw;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iget-object v1, p0, Lcom/bytedance/adsdk/ugeno/moa/cz$1;->yo:Lcom/bytedance/adsdk/ugeno/oa/yo;

    .line 47
    .line 48
    iget-object v2, p0, Lcom/bytedance/adsdk/ugeno/moa/cz$1;->uef:Ljava/lang/String;

    .line 49
    .line 50
    iget-object v3, p0, Lcom/bytedance/adsdk/ugeno/moa/cz$1;->moa:Ljava/util/List;

    .line 51
    .line 52
    invoke-interface {v0, v1, v2, v3}, Lcom/bytedance/adsdk/ugeno/core/lw;->uef(Lcom/bytedance/adsdk/ugeno/oa/yo;Ljava/lang/String;Ljava/util/List;)V

    .line 53
    .line 54
    .line 55
    :cond_0
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/moa/cz$1;->lw:Lcom/bytedance/adsdk/ugeno/moa/cz;

    .line 56
    .line 57
    iget-object v1, p0, Lcom/bytedance/adsdk/ugeno/moa/cz$1;->uef:Ljava/lang/String;

    .line 58
    .line 59
    iget-object v2, p0, Lcom/bytedance/adsdk/ugeno/moa/cz$1;->moa:Ljava/util/List;

    .line 60
    .line 61
    invoke-static {v0, v1, v2}, Lcom/bytedance/adsdk/ugeno/moa/cz;->uef(Lcom/bytedance/adsdk/ugeno/moa/cz;Ljava/lang/String;Ljava/util/List;)V

    .line 62
    .line 63
    .line 64
    return-void
.end method
