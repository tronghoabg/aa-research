.class public Lcom/bytedance/sdk/component/uef/wk;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private volatile lw:Z

.field private final moa:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/component/uef/wrv;",
            ">;"
        }
    .end annotation
.end field

.field private final oa:Landroid/webkit/WebView;

.field private final uef:Lcom/bytedance/sdk/component/uef/uef;

.field private final yo:Lcom/bytedance/sdk/component/uef/cz;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/component/uef/cz;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/bytedance/sdk/component/uef/wk;->moa:Ljava/util/List;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    iput-boolean v1, p0, Lcom/bytedance/sdk/component/uef/wk;->lw:Z

    .line 13
    .line 14
    iput-object p1, p0, Lcom/bytedance/sdk/component/uef/wk;->yo:Lcom/bytedance/sdk/component/uef/cz;

    .line 15
    .line 16
    iget-object v1, p1, Lcom/bytedance/sdk/component/uef/cz;->uef:Landroid/webkit/WebView;

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    iget-object v1, p1, Lcom/bytedance/sdk/component/uef/cz;->oa:Lcom/bytedance/sdk/component/uef/uef;

    .line 21
    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    new-instance v1, Lcom/bytedance/sdk/component/uef/dhk;

    .line 25
    .line 26
    invoke-direct {v1}, Lcom/bytedance/sdk/component/uef/dhk;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v1, p0, Lcom/bytedance/sdk/component/uef/wk;->uef:Lcom/bytedance/sdk/component/uef/uef;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iput-object v1, p0, Lcom/bytedance/sdk/component/uef/wk;->uef:Lcom/bytedance/sdk/component/uef/uef;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    iget-object v1, p1, Lcom/bytedance/sdk/component/uef/cz;->oa:Lcom/bytedance/sdk/component/uef/uef;

    .line 36
    .line 37
    iput-object v1, p0, Lcom/bytedance/sdk/component/uef/wk;->uef:Lcom/bytedance/sdk/component/uef/uef;

    .line 38
    .line 39
    :goto_0
    iget-object v1, p0, Lcom/bytedance/sdk/component/uef/wk;->uef:Lcom/bytedance/sdk/component/uef/uef;

    .line 40
    .line 41
    invoke-virtual {v1, p1}, Lcom/bytedance/sdk/component/uef/uef;->yo(Lcom/bytedance/sdk/component/uef/cz;)V

    .line 42
    .line 43
    .line 44
    iget-object v1, p1, Lcom/bytedance/sdk/component/uef/cz;->uef:Landroid/webkit/WebView;

    .line 45
    .line 46
    iput-object v1, p0, Lcom/bytedance/sdk/component/uef/wk;->oa:Landroid/webkit/WebView;

    .line 47
    .line 48
    iget-object v1, p1, Lcom/bytedance/sdk/component/uef/cz;->cz:Lcom/bytedance/sdk/component/uef/wrv;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    iget-boolean p1, p1, Lcom/bytedance/sdk/component/uef/cz;->xs:Z

    .line 54
    .line 55
    invoke-static {p1}, Lcom/bytedance/sdk/component/uef/oib;->uef(Z)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method private oa()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/component/uef/wk;->lw:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 6
    .line 7
    const-string v1, "JsBridge2 is already released!!!"

    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Lcom/bytedance/sdk/component/uef/bcc;->uef(Ljava/lang/RuntimeException;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public static uef(Landroid/webkit/WebView;)Lcom/bytedance/sdk/component/uef/cz;
    .locals 1

    .line 1
    new-instance v0, Lcom/bytedance/sdk/component/uef/cz;

    invoke-direct {v0, p0}, Lcom/bytedance/sdk/component/uef/cz;-><init>(Landroid/webkit/WebView;)V

    return-object v0
.end method


# virtual methods
.method public uef(Ljava/lang/String;Lcom/bytedance/sdk/component/uef/moa;)Lcom/bytedance/sdk/component/uef/wk;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/bytedance/sdk/component/uef/moa<",
            "**>;)",
            "Lcom/bytedance/sdk/component/uef/wk;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0, p2}, Lcom/bytedance/sdk/component/uef/wk;->uef(Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/sdk/component/uef/moa;)Lcom/bytedance/sdk/component/uef/wk;

    move-result-object p1

    return-object p1
.end method

.method public uef(Ljava/lang/String;Lcom/bytedance/sdk/component/uef/yo$oa;)Lcom/bytedance/sdk/component/uef/wk;
    .locals 1

    const/4 v0, 0x0

    .line 8
    invoke-virtual {p0, p1, v0, p2}, Lcom/bytedance/sdk/component/uef/wk;->uef(Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/sdk/component/uef/yo$oa;)Lcom/bytedance/sdk/component/uef/wk;

    move-result-object p1

    return-object p1
.end method

.method public uef(Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/sdk/component/uef/moa;)Lcom/bytedance/sdk/component/uef/wk;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/bytedance/sdk/component/uef/moa<",
            "**>;)",
            "Lcom/bytedance/sdk/component/uef/wk;"
        }
    .end annotation

    .line 4
    invoke-direct {p0}, Lcom/bytedance/sdk/component/uef/wk;->oa()V

    .line 5
    iget-object p2, p0, Lcom/bytedance/sdk/component/uef/wk;->uef:Lcom/bytedance/sdk/component/uef/uef;

    iget-object p2, p2, Lcom/bytedance/sdk/component/uef/uef;->xs:Lcom/bytedance/sdk/component/uef/ivm;

    invoke-virtual {p2, p1, p3}, Lcom/bytedance/sdk/component/uef/ivm;->uef(Ljava/lang/String;Lcom/bytedance/sdk/component/uef/moa;)V

    return-object p0
.end method

.method public uef(Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/sdk/component/uef/yo$oa;)Lcom/bytedance/sdk/component/uef/wk;
    .locals 0

    .line 9
    invoke-direct {p0}, Lcom/bytedance/sdk/component/uef/wk;->oa()V

    .line 10
    iget-object p2, p0, Lcom/bytedance/sdk/component/uef/wk;->uef:Lcom/bytedance/sdk/component/uef/uef;

    iget-object p2, p2, Lcom/bytedance/sdk/component/uef/uef;->xs:Lcom/bytedance/sdk/component/uef/ivm;

    invoke-virtual {p2, p1, p3}, Lcom/bytedance/sdk/component/uef/ivm;->uef(Ljava/lang/String;Lcom/bytedance/sdk/component/uef/yo$oa;)V

    return-object p0
.end method

.method public uef(Ljava/util/Set;Lcom/bytedance/sdk/component/uef/sy;)Lcom/bytedance/sdk/component/uef/wk;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/bytedance/sdk/component/uef/sy<",
            "**>;)",
            "Lcom/bytedance/sdk/component/uef/wk;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p0, p1, v0, p2}, Lcom/bytedance/sdk/component/uef/wk;->uef(Ljava/util/Set;Ljava/lang/String;Lcom/bytedance/sdk/component/uef/sy;)Lcom/bytedance/sdk/component/uef/wk;

    move-result-object p1

    return-object p1
.end method

.method public uef(Ljava/util/Set;Ljava/lang/String;Lcom/bytedance/sdk/component/uef/sy;)Lcom/bytedance/sdk/component/uef/wk;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/bytedance/sdk/component/uef/sy<",
            "**>;)",
            "Lcom/bytedance/sdk/component/uef/wk;"
        }
    .end annotation

    .line 6
    invoke-direct {p0}, Lcom/bytedance/sdk/component/uef/wk;->oa()V

    .line 7
    iget-object p2, p0, Lcom/bytedance/sdk/component/uef/wk;->uef:Lcom/bytedance/sdk/component/uef/uef;

    iget-object p2, p2, Lcom/bytedance/sdk/component/uef/uef;->xs:Lcom/bytedance/sdk/component/uef/ivm;

    invoke-virtual {p2, p1, p3}, Lcom/bytedance/sdk/component/uef/ivm;->uef(Ljava/util/Set;Lcom/bytedance/sdk/component/uef/sy;)V

    return-object p0
.end method

.method public uef()V
    .locals 2

    .line 11
    iget-boolean v0, p0, Lcom/bytedance/sdk/component/uef/wk;->lw:Z

    if-eqz v0, :cond_0

    goto :goto_1

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/component/uef/wk;->uef:Lcom/bytedance/sdk/component/uef/uef;

    invoke-virtual {v0}, Lcom/bytedance/sdk/component/uef/uef;->oa()V

    const/4 v0, 0x1

    .line 13
    iput-boolean v0, p0, Lcom/bytedance/sdk/component/uef/wk;->lw:Z

    .line 14
    iget-object v0, p0, Lcom/bytedance/sdk/component/uef/wk;->moa:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method
