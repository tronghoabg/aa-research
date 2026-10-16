.class public abstract Lcom/bytedance/adsdk/ugeno/moa/moa/yo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/adsdk/ugeno/moa/moa/yo$uef;
    }
.end annotation


# instance fields
.field protected bcc:Ljava/lang/String;

.field protected cz:Ljava/lang/String;

.field protected ivm:Ljava/lang/String;

.field protected lw:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field protected moa:Lcom/bytedance/adsdk/ugeno/moa/ivm$uef;

.field protected oa:Lcom/bytedance/adsdk/ugeno/oa/yo;

.field protected uef:Lcom/bytedance/adsdk/ugeno/moa/dj;

.field protected xs:Ljava/lang/String;

.field protected yo:Lcom/bytedance/adsdk/ugeno/moa/ivm;

.field protected zjm:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->zjm:Landroid/content/Context;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public ivm()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->cz:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public lw()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->bcc:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public moa()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->ivm:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public uef(Lcom/bytedance/adsdk/ugeno/moa/dj;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->uef:Lcom/bytedance/adsdk/ugeno/moa/dj;

    return-void
.end method

.method public uef(Lcom/bytedance/adsdk/ugeno/moa/ivm;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->yo:Lcom/bytedance/adsdk/ugeno/moa/ivm;

    return-void
.end method

.method public uef(Lcom/bytedance/adsdk/ugeno/oa/yo;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->oa:Lcom/bytedance/adsdk/ugeno/oa/yo;

    return-void
.end method

.method public varargs abstract uef([Ljava/lang/Object;)Z
.end method

.method public xs()Lcom/bytedance/adsdk/ugeno/moa/ivm;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->yo:Lcom/bytedance/adsdk/ugeno/moa/ivm;

    .line 2
    .line 3
    return-object v0
.end method

.method public yo()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->yo:Lcom/bytedance/adsdk/ugeno/moa/ivm;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/adsdk/ugeno/moa/ivm;->uef()Lcom/bytedance/adsdk/ugeno/moa/ivm$uef;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iput-object v0, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->moa:Lcom/bytedance/adsdk/ugeno/moa/ivm$uef;

    .line 8
    .line 9
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->yo:Lcom/bytedance/adsdk/ugeno/moa/ivm;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {v0}, Lcom/bytedance/adsdk/ugeno/moa/ivm;->uef()Lcom/bytedance/adsdk/ugeno/moa/ivm$uef;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->moa:Lcom/bytedance/adsdk/ugeno/moa/ivm$uef;

    .line 19
    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    :goto_0
    return-void

    .line 23
    :cond_1
    invoke-virtual {v0}, Lcom/bytedance/adsdk/ugeno/moa/ivm$uef;->yo()Ljava/util/Map;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput-object v0, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->lw:Ljava/util/Map;

    .line 28
    .line 29
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->moa:Lcom/bytedance/adsdk/ugeno/moa/ivm$uef;

    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/bytedance/adsdk/ugeno/moa/ivm$uef;->oa()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput-object v0, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->ivm:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->moa:Lcom/bytedance/adsdk/ugeno/moa/ivm$uef;

    .line 38
    .line 39
    invoke-virtual {v0}, Lcom/bytedance/adsdk/ugeno/moa/ivm$uef;->uef()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iput-object v0, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->xs:Ljava/lang/String;

    .line 44
    .line 45
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->moa:Lcom/bytedance/adsdk/ugeno/moa/ivm$uef;

    .line 46
    .line 47
    invoke-virtual {v0}, Lcom/bytedance/adsdk/ugeno/moa/ivm$uef;->moa()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iput-object v0, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->bcc:Ljava/lang/String;

    .line 52
    .line 53
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->moa:Lcom/bytedance/adsdk/ugeno/moa/ivm$uef;

    .line 54
    .line 55
    invoke-virtual {v0}, Lcom/bytedance/adsdk/ugeno/moa/ivm$uef;->lw()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iput-object v0, p0, Lcom/bytedance/adsdk/ugeno/moa/moa/yo;->cz:Ljava/lang/String;

    .line 60
    .line 61
    return-void
.end method
