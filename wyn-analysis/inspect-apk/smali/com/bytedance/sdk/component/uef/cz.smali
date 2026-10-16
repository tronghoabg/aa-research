.class public Lcom/bytedance/sdk/component/uef/cz;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field bcc:Lcom/bytedance/sdk/component/uef/dj;

.field cq:Z

.field cz:Lcom/bytedance/sdk/component/uef/wrv;

.field final dj:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field ivm:Z

.field lw:Landroid/content/Context;

.field moa:Lcom/bytedance/sdk/component/uef/xs;

.field oa:Lcom/bytedance/sdk/component/uef/uef;

.field uef:Landroid/webkit/WebView;

.field final wrv:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field xs:Z

.field yo:Ljava/lang/String;

.field zjm:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    const-string v0, "IESJSBridge"

    iput-object v0, p0, Lcom/bytedance/sdk/component/uef/cz;->yo:Ljava/lang/String;

    .line 9
    const-string v0, "host"

    iput-object v0, p0, Lcom/bytedance/sdk/component/uef/cz;->zjm:Ljava/lang/String;

    .line 10
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lcom/bytedance/sdk/component/uef/cz;->dj:Ljava/util/Set;

    .line 11
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lcom/bytedance/sdk/component/uef/cz;->wrv:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Landroid/webkit/WebView;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    const-string v0, "IESJSBridge"

    iput-object v0, p0, Lcom/bytedance/sdk/component/uef/cz;->yo:Ljava/lang/String;

    .line 3
    const-string v0, "host"

    iput-object v0, p0, Lcom/bytedance/sdk/component/uef/cz;->zjm:Ljava/lang/String;

    .line 4
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lcom/bytedance/sdk/component/uef/cz;->dj:Ljava/util/Set;

    .line 5
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lcom/bytedance/sdk/component/uef/cz;->wrv:Ljava/util/Set;

    .line 6
    iput-object p1, p0, Lcom/bytedance/sdk/component/uef/cz;->uef:Landroid/webkit/WebView;

    return-void
.end method

.method private oa()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/component/uef/cz;->uef:Landroid/webkit/WebView;

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/bytedance/sdk/component/uef/cz;->cq:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/bytedance/sdk/component/uef/cz;->oa:Lcom/bytedance/sdk/component/uef/uef;

    if-eqz v0, :cond_2

    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/component/uef/cz;->yo:Ljava/lang/String;

    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/bytedance/sdk/component/uef/cz;->uef:Landroid/webkit/WebView;

    if-nez v0, :cond_2

    :cond_1
    iget-object v0, p0, Lcom/bytedance/sdk/component/uef/cz;->moa:Lcom/bytedance/sdk/component/uef/xs;

    if-eqz v0, :cond_2

    return-void

    .line 4
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Requested arguments aren\'t set properly when building JsBridge."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public oa(Z)Lcom/bytedance/sdk/component/uef/cz;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/bytedance/sdk/component/uef/cz;->xs:Z

    return-object p0
.end method

.method public uef(Lcom/bytedance/sdk/component/uef/uef;)Lcom/bytedance/sdk/component/uef/cz;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/component/uef/cz;->oa:Lcom/bytedance/sdk/component/uef/uef;

    return-object p0
.end method

.method public uef(Lcom/bytedance/sdk/component/uef/zjm;)Lcom/bytedance/sdk/component/uef/cz;
    .locals 0

    .line 3
    invoke-static {p1}, Lcom/bytedance/sdk/component/uef/xs;->uef(Lcom/bytedance/sdk/component/uef/zjm;)Lcom/bytedance/sdk/component/uef/xs;

    move-result-object p1

    iput-object p1, p0, Lcom/bytedance/sdk/component/uef/cz;->moa:Lcom/bytedance/sdk/component/uef/xs;

    return-object p0
.end method

.method public uef(Ljava/lang/String;)Lcom/bytedance/sdk/component/uef/cz;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/bytedance/sdk/component/uef/cz;->yo:Ljava/lang/String;

    return-object p0
.end method

.method public uef(Z)Lcom/bytedance/sdk/component/uef/cz;
    .locals 0

    .line 4
    iput-boolean p1, p0, Lcom/bytedance/sdk/component/uef/cz;->ivm:Z

    return-object p0
.end method

.method public uef()Lcom/bytedance/sdk/component/uef/wk;
    .locals 1

    .line 5
    invoke-direct {p0}, Lcom/bytedance/sdk/component/uef/cz;->oa()V

    .line 6
    new-instance v0, Lcom/bytedance/sdk/component/uef/wk;

    invoke-direct {v0, p0}, Lcom/bytedance/sdk/component/uef/wk;-><init>(Lcom/bytedance/sdk/component/uef/cz;)V

    return-object v0
.end method
