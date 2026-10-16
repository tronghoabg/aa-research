.class public abstract Lcom/bytedance/sdk/component/adexpress/lw/uef;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/component/adexpress/oa/dj;
.implements Lcom/bytedance/sdk/component/adexpress/oa/moa;
.implements Lcom/bytedance/sdk/component/adexpress/theme/uef;
.implements Lcom/bytedance/sdk/component/adexpress/uef;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/bytedance/sdk/component/adexpress/oa/dj;",
        "Lcom/bytedance/sdk/component/adexpress/oa/moa<",
        "Lcom/bytedance/sdk/component/cz/ivm;",
        ">;",
        "Lcom/bytedance/sdk/component/adexpress/theme/uef;",
        "Lcom/bytedance/sdk/component/adexpress/uef;"
    }
.end annotation


# instance fields
.field private bcc:Ljava/lang/String;

.field private cq:Z

.field private cz:Ljava/lang/String;

.field private dj:Lcom/bytedance/sdk/component/adexpress/oa/bcc;

.field private dz:I

.field protected ivm:Ljava/util/concurrent/atomic/AtomicBoolean;

.field protected lw:I

.field protected moa:Lcom/bytedance/sdk/component/cz/ivm;

.field protected oa:Z

.field protected uef:Lorg/json/JSONObject;

.field private wk:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private wrv:Lcom/bytedance/sdk/component/adexpress/oa/cq;

.field private xs:Landroid/content/Context;

.field protected yo:Z

.field private volatile zjm:Lcom/bytedance/sdk/component/adexpress/oa/xs;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/bytedance/sdk/component/adexpress/oa/cq;Lcom/bytedance/sdk/component/adexpress/theme/ThemeStatusBroadcastReceiver;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->oa:Z

    .line 6
    .line 7
    const/16 v1, 0x8

    .line 8
    .line 9
    iput v1, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->lw:I

    .line 10
    .line 11
    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 12
    .line 13
    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->ivm:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 17
    .line 18
    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 19
    .line 20
    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 21
    .line 22
    .line 23
    iput-object v1, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->wk:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 24
    .line 25
    iput-object p1, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->xs:Landroid/content/Context;

    .line 26
    .line 27
    iput-object p2, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->wrv:Lcom/bytedance/sdk/component/adexpress/oa/cq;

    .line 28
    .line 29
    invoke-virtual {p2}, Lcom/bytedance/sdk/component/adexpress/oa/cq;->moa()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->bcc:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {p3, p0}, Lcom/bytedance/sdk/component/adexpress/theme/ThemeStatusBroadcastReceiver;->uef(Lcom/bytedance/sdk/component/adexpress/theme/uef;)V

    .line 36
    .line 37
    .line 38
    invoke-static {}, Lcom/bytedance/sdk/component/adexpress/moa;->oa()Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-eqz p1, :cond_0

    .line 43
    .line 44
    invoke-direct {p0}, Lcom/bytedance/sdk/component/adexpress/lw/uef;->dz()V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_0
    iget-object p1, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->xs:Landroid/content/Context;

    .line 49
    .line 50
    iget-object p2, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->bcc:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {p0, p1, p2}, Lcom/bytedance/sdk/component/adexpress/lw/uef;->uef(Landroid/content/Context;Ljava/lang/String;)Lcom/bytedance/sdk/component/cz/ivm;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    iput-object p1, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->moa:Lcom/bytedance/sdk/component/cz/ivm;

    .line 57
    .line 58
    const-string p2, "WebViewRender"

    .line 59
    .line 60
    if-nez p1, :cond_2

    .line 61
    .line 62
    const-string p1, "initWebView: create WebView"

    .line 63
    .line 64
    invoke-static {p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    invoke-static {}, Lcom/bytedance/sdk/component/adexpress/moa;->uef()Landroid/content/Context;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    if-eqz p1, :cond_1

    .line 72
    .line 73
    new-instance p1, Lcom/bytedance/sdk/component/cz/ivm;

    .line 74
    .line 75
    invoke-static {}, Lcom/bytedance/sdk/component/adexpress/moa;->uef()Landroid/content/Context;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    sget-object p3, Lcom/bytedance/sdk/component/cz/ivm$yo;->uef:Lcom/bytedance/sdk/component/cz/ivm$yo;

    .line 80
    .line 81
    invoke-direct {p1, p2, p3}, Lcom/bytedance/sdk/component/cz/ivm;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/component/cz/ivm$yo;)V

    .line 82
    .line 83
    .line 84
    iput-object p1, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->moa:Lcom/bytedance/sdk/component/cz/ivm;

    .line 85
    .line 86
    :cond_1
    return-void

    .line 87
    :cond_2
    const/4 p1, 0x1

    .line 88
    iput-boolean p1, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->oa:Z

    .line 89
    .line 90
    const-string p1, "initWebView: reuse WebView"

    .line 91
    .line 92
    invoke-static {p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 93
    .line 94
    .line 95
    return-void
.end method

.method private dz()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->xs:Landroid/content/Context;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/bytedance/sdk/component/adexpress/moa;->uef()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-static {}, Lcom/bytedance/sdk/component/adexpress/moa;->uef()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->xs:Landroid/content/Context;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->xs:Landroid/content/Context;

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    iget-object v1, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->bcc:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {p0, v0, v1}, Lcom/bytedance/sdk/component/adexpress/lw/uef;->uef(Landroid/content/Context;Ljava/lang/String;)Lcom/bytedance/sdk/component/cz/ivm;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->moa:Lcom/bytedance/sdk/component/cz/ivm;

    .line 28
    .line 29
    const-string v1, "WebViewRender"

    .line 30
    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    const-string v0, "initWebView: create WebView by act"

    .line 34
    .line 35
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    new-instance v0, Lcom/bytedance/sdk/component/cz/ivm;

    .line 39
    .line 40
    new-instance v1, Landroid/content/MutableContextWrapper;

    .line 41
    .line 42
    iget-object v2, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->xs:Landroid/content/Context;

    .line 43
    .line 44
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-direct {v1, v2}, Landroid/content/MutableContextWrapper;-><init>(Landroid/content/Context;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/adexpress/lw/uef;->uef()Lcom/bytedance/sdk/component/cz/ivm$yo;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-direct {v0, v1, v2}, Lcom/bytedance/sdk/component/cz/ivm;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/component/cz/ivm$yo;)V

    .line 56
    .line 57
    .line 58
    iput-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->moa:Lcom/bytedance/sdk/component/cz/ivm;

    .line 59
    .line 60
    return-void

    .line 61
    :cond_1
    const/4 v0, 0x1

    .line 62
    iput-boolean v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->oa:Z

    .line 63
    .line 64
    const-string v0, "initWebView: reuse WebView"

    .line 65
    .line 66
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 67
    .line 68
    .line 69
    :cond_2
    return-void
.end method

.method private oa(Landroid/app/Activity;)I
    .locals 0

    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    return p1
.end method

.method private uef(FF)V
    .locals 2

    .line 59
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->wrv:Lcom/bytedance/sdk/component/adexpress/oa/cq;

    invoke-virtual {v0}, Lcom/bytedance/sdk/component/adexpress/oa/cq;->lw()Lcom/bytedance/sdk/component/adexpress/oa/cz;

    move-result-object v0

    invoke-interface {v0}, Lcom/bytedance/sdk/component/adexpress/oa/cz;->lw()V

    .line 60
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/adexpress/lw/uef;->yo()I

    move-result v0

    const/16 v1, 0x9

    if-ne v0, v1, :cond_1

    .line 61
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/adexpress/lw/uef;->moa()Lcom/bytedance/sdk/component/cz/ivm;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout$LayoutParams;

    const/4 p2, -0x1

    if-nez p1, :cond_0

    .line 62
    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {p1, p2, p2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 63
    :cond_0
    iput p2, p1, Landroid/widget/FrameLayout$LayoutParams;->width:I

    .line 64
    iput p2, p1, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 65
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/adexpress/lw/uef;->moa()Lcom/bytedance/sdk/component/cz/ivm;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    .line 66
    :cond_1
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->xs:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/bytedance/sdk/component/adexpress/moa/xs;->uef(Landroid/content/Context;F)F

    move-result p1

    float-to-int p1, p1

    .line 67
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->xs:Landroid/content/Context;

    invoke-static {v0, p2}, Lcom/bytedance/sdk/component/adexpress/moa/xs;->uef(Landroid/content/Context;F)F

    move-result p2

    float-to-int p2, p2

    .line 68
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/adexpress/lw/uef;->moa()Lcom/bytedance/sdk/component/cz/ivm;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    if-nez v0, :cond_2

    .line 69
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v0, p1, p2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 70
    :cond_2
    iput p1, v0, Landroid/widget/FrameLayout$LayoutParams;->width:I

    .line 71
    iput p2, v0, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 72
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/adexpress/lw/uef;->moa()Lcom/bytedance/sdk/component/cz/ivm;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private uef(ILjava/lang/String;)V
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->zjm:Lcom/bytedance/sdk/component/adexpress/oa/xs;

    if-eqz v0, :cond_0

    .line 74
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->zjm:Lcom/bytedance/sdk/component/adexpress/oa/xs;

    invoke-interface {v0, p1, p2}, Lcom/bytedance/sdk/component/adexpress/oa/xs;->uef(ILjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/component/adexpress/lw/uef;Lcom/bytedance/sdk/component/adexpress/oa/dz;FF)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/bytedance/sdk/component/adexpress/lw/uef;->uef(Lcom/bytedance/sdk/component/adexpress/oa/dz;FF)V

    return-void
.end method

.method private uef(Lcom/bytedance/sdk/component/adexpress/oa/dz;FF)V
    .locals 2

    .line 49
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/adexpress/oa/dz;->zjm()I

    .line 50
    iget-boolean v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->yo:Z

    if-eqz v0, :cond_1

    iget-boolean v1, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->cq:Z

    if-nez v1, :cond_1

    .line 51
    invoke-direct {p0, p2, p3}, Lcom/bytedance/sdk/component/adexpress/lw/uef;->uef(FF)V

    .line 52
    iget p2, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->lw:I

    invoke-virtual {p0, p2}, Lcom/bytedance/sdk/component/adexpress/lw/uef;->uef(I)V

    .line 53
    iget-object p2, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->zjm:Lcom/bytedance/sdk/component/adexpress/oa/xs;

    if-eqz p2, :cond_0

    .line 54
    iget-object p2, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->zjm:Lcom/bytedance/sdk/component/adexpress/oa/xs;

    invoke-virtual {p0}, Lcom/bytedance/sdk/component/adexpress/lw/uef;->moa()Lcom/bytedance/sdk/component/cz/ivm;

    move-result-object p3

    invoke-interface {p2, p3, p1}, Lcom/bytedance/sdk/component/adexpress/oa/xs;->uef(Landroid/view/View;Lcom/bytedance/sdk/component/adexpress/oa/dz;)V

    :cond_0
    return-void

    :cond_1
    if-nez v0, :cond_2

    .line 55
    invoke-static {}, Lcom/bytedance/sdk/component/adexpress/lw/lw;->uef()Lcom/bytedance/sdk/component/adexpress/lw/lw;

    move-result-object p2

    iget-object p3, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->moa:Lcom/bytedance/sdk/component/cz/ivm;

    invoke-virtual {p2, p3}, Lcom/bytedance/sdk/component/adexpress/lw/lw;->lw(Lcom/bytedance/sdk/component/cz/ivm;)Z

    .line 56
    :cond_2
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/adexpress/oa/dz;->zjm()I

    move-result p2

    invoke-virtual {p1}, Lcom/bytedance/sdk/component/adexpress/oa/dz;->cz()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p2, p1}, Lcom/bytedance/sdk/component/adexpress/lw/uef;->uef(ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public bcc()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/adexpress/lw/uef;->moa()Lcom/bytedance/sdk/component/cz/ivm;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/adexpress/lw/uef;->moa()Lcom/bytedance/sdk/component/cz/ivm;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/cz/ivm;->getWebView()Landroid/webkit/WebView;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Landroid/webkit/WebView;->resumeTimers()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    .line 19
    :catch_0
    :goto_0
    return-void
.end method

.method public cq()Lcom/bytedance/sdk/component/adexpress/oa/cq;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->wrv:Lcom/bytedance/sdk/component/adexpress/oa/cq;

    .line 2
    .line 3
    return-object v0
.end method

.method public abstract cz()V
.end method

.method public dj()V
    .locals 0

    return-void
.end method

.method public ivm()Lcom/bytedance/sdk/component/cz/ivm;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/adexpress/lw/uef;->moa()Lcom/bytedance/sdk/component/cz/ivm;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public synthetic lw()Landroid/view/View;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/adexpress/lw/uef;->ivm()Lcom/bytedance/sdk/component/cz/ivm;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public moa()Lcom/bytedance/sdk/component/cz/ivm;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->moa:Lcom/bytedance/sdk/component/cz/ivm;

    .line 2
    .line 3
    return-object v0
.end method

.method public oa()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->wrv:Lcom/bytedance/sdk/component/adexpress/oa/cq;

    invoke-virtual {v0}, Lcom/bytedance/sdk/component/adexpress/oa/cq;->gzw()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lcom/bytedance/sdk/component/adexpress/lw/lw;->uef()Lcom/bytedance/sdk/component/adexpress/lw/lw;

    move-result-object v0

    iget-object v1, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->moa:Lcom/bytedance/sdk/component/cz/ivm;

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/component/adexpress/lw/lw;->yo(Lcom/bytedance/sdk/component/cz/ivm;)V

    return-void

    .line 3
    :cond_0
    invoke-static {}, Lcom/bytedance/sdk/component/adexpress/lw/lw;->uef()Lcom/bytedance/sdk/component/adexpress/lw/lw;

    move-result-object v0

    iget-object v1, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->moa:Lcom/bytedance/sdk/component/cz/ivm;

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/component/adexpress/lw/lw;->moa(Lcom/bytedance/sdk/component/cz/ivm;)V

    return-void
.end method

.method public oa(Z)V
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->wk:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method

.method public oa(Lcom/bytedance/sdk/component/adexpress/oa/dz;)Z
    .locals 0

    .line 4
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/adexpress/oa/dz;->oa()Z

    move-result p1

    return p1
.end method

.method public uef()Lcom/bytedance/sdk/component/cz/ivm$yo;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->wrv:Lcom/bytedance/sdk/component/adexpress/oa/cq;

    invoke-virtual {v0}, Lcom/bytedance/sdk/component/adexpress/oa/cq;->gzw()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/bytedance/sdk/component/cz/ivm$yo;->oa:Lcom/bytedance/sdk/component/cz/ivm$yo;

    return-object v0

    :cond_0
    sget-object v0, Lcom/bytedance/sdk/component/cz/ivm$yo;->uef:Lcom/bytedance/sdk/component/cz/ivm$yo;

    return-object v0
.end method

.method public uef(Landroid/content/Context;Ljava/lang/String;)Lcom/bytedance/sdk/component/cz/ivm;
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->wrv:Lcom/bytedance/sdk/component/adexpress/oa/cq;

    invoke-virtual {v0}, Lcom/bytedance/sdk/component/adexpress/oa/cq;->gzw()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    invoke-static {}, Lcom/bytedance/sdk/component/adexpress/lw/lw;->uef()Lcom/bytedance/sdk/component/adexpress/lw/lw;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/bytedance/sdk/component/adexpress/lw/lw;->oa(Landroid/content/Context;Ljava/lang/String;)Lcom/bytedance/sdk/component/cz/ivm;

    move-result-object p1

    return-object p1

    .line 5
    :cond_0
    invoke-static {}, Lcom/bytedance/sdk/component/adexpress/lw/lw;->uef()Lcom/bytedance/sdk/component/adexpress/lw/lw;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/bytedance/sdk/component/adexpress/lw/lw;->yo(Landroid/content/Context;Ljava/lang/String;)Lcom/bytedance/sdk/component/cz/ivm;

    move-result-object p1

    return-object p1
.end method

.method public abstract uef(I)V
.end method

.method public uef(Landroid/app/Activity;)V
    .locals 1

    .line 75
    iget v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->dz:I

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    .line 76
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    iget v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->dz:I

    if-ne p1, v0, :cond_1

    .line 77
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/adexpress/lw/uef;->xs()V

    .line 78
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/adexpress/lw/uef;->wrv()V

    :cond_1
    :goto_0
    return-void
.end method

.method public uef(Landroid/view/View;ILcom/bytedance/sdk/component/adexpress/yo;)V
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->dj:Lcom/bytedance/sdk/component/adexpress/oa/bcc;

    if-eqz v0, :cond_0

    .line 58
    invoke-interface {v0, p1, p2, p3}, Lcom/bytedance/sdk/component/adexpress/oa/bcc;->uef(Landroid/view/View;ILcom/bytedance/sdk/component/adexpress/yo;)V

    :cond_0
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/component/adexpress/oa/bcc;)V
    .locals 0

    .line 7
    iput-object p1, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->dj:Lcom/bytedance/sdk/component/adexpress/oa/bcc;

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/component/adexpress/oa/dz;)V
    .locals 6

    const/16 v0, 0x69

    if-nez p1, :cond_0

    .line 37
    iget-object p1, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->zjm:Lcom/bytedance/sdk/component/adexpress/oa/xs;

    if-eqz p1, :cond_2

    .line 38
    iget-object p1, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->zjm:Lcom/bytedance/sdk/component/adexpress/oa/xs;

    const-string v1, "renderResult is null"

    invoke-interface {p1, v0, v1}, Lcom/bytedance/sdk/component/adexpress/oa/xs;->uef(ILjava/lang/String;)V

    return-void

    .line 39
    :cond_0
    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/component/adexpress/lw/uef;->oa(Lcom/bytedance/sdk/component/adexpress/oa/dz;)Z

    move-result v1

    .line 40
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/adexpress/oa/dz;->yo()D

    move-result-wide v2

    double-to-float v2, v2

    .line 41
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/adexpress/oa/dz;->moa()D

    move-result-wide v3

    double-to-float v3, v3

    .line 42
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/adexpress/lw/uef;->yo()I

    move-result v4

    if-nez v4, :cond_3

    const/4 v4, 0x0

    cmpg-float v5, v2, v4

    if-lez v5, :cond_1

    cmpg-float v4, v3, v4

    if-gtz v4, :cond_3

    .line 43
    :cond_1
    iget-object p1, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->zjm:Lcom/bytedance/sdk/component/adexpress/oa/xs;

    if-eqz p1, :cond_2

    .line 44
    iget-object p1, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->zjm:Lcom/bytedance/sdk/component/adexpress/oa/xs;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "width is "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, "height is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/bytedance/sdk/component/adexpress/oa/xs;->uef(ILjava/lang/String;)V

    :cond_2
    return-void

    .line 45
    :cond_3
    iput-boolean v1, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->yo:Z

    .line 46
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_4

    .line 47
    invoke-direct {p0, p1, v2, v3}, Lcom/bytedance/sdk/component/adexpress/lw/uef;->uef(Lcom/bytedance/sdk/component/adexpress/oa/dz;FF)V

    return-void

    .line 48
    :cond_4
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lcom/bytedance/sdk/component/adexpress/lw/uef$1;

    invoke-direct {v1, p0, p1, v2, v3}, Lcom/bytedance/sdk/component/adexpress/lw/uef$1;-><init>(Lcom/bytedance/sdk/component/adexpress/lw/uef;Lcom/bytedance/sdk/component/adexpress/oa/dz;FF)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/component/adexpress/oa/xs;)V
    .locals 6

    .line 8
    iput-object p1, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->zjm:Lcom/bytedance/sdk/component/adexpress/oa/xs;

    .line 9
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/adexpress/lw/uef;->moa()Lcom/bytedance/sdk/component/cz/ivm;

    move-result-object p1

    const/4 v0, 0x0

    const/16 v1, 0x66

    const/4 v2, 0x1

    if-eqz p1, :cond_8

    invoke-virtual {p0}, Lcom/bytedance/sdk/component/adexpress/lw/uef;->moa()Lcom/bytedance/sdk/component/cz/ivm;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bytedance/sdk/component/cz/ivm;->getWebView()Landroid/webkit/WebView;

    move-result-object p1

    if-nez p1, :cond_0

    goto/16 :goto_2

    .line 10
    :cond_0
    iget-object p1, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->cz:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 11
    iget-object p1, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->zjm:Lcom/bytedance/sdk/component/adexpress/oa/xs;

    const-string v0, "url is empty"

    invoke-interface {p1, v1, v0}, Lcom/bytedance/sdk/component/adexpress/oa/xs;->uef(ILjava/lang/String;)V

    return-void

    .line 12
    :cond_1
    iget-object p1, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->wrv:Lcom/bytedance/sdk/component/adexpress/oa/cq;

    invoke-virtual {p1}, Lcom/bytedance/sdk/component/adexpress/oa/cq;->gzw()Z

    move-result p1

    const-string v3, "data null is "

    const/16 v4, 0x67

    if-nez p1, :cond_3

    .line 13
    iget-object p1, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->uef:Lorg/json/JSONObject;

    invoke-static {p1}, Lcom/bytedance/sdk/component/adexpress/uef/oa/oa;->uef(Lorg/json/JSONObject;)Z

    move-result p1

    if-nez p1, :cond_5

    .line 14
    iget-object p1, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->zjm:Lcom/bytedance/sdk/component/adexpress/oa/xs;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->uef:Lorg/json/JSONObject;

    if-nez v3, :cond_2

    move v0, v2

    :cond_2
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v4, v0}, Lcom/bytedance/sdk/component/adexpress/oa/xs;->uef(ILjava/lang/String;)V

    return-void

    .line 15
    :cond_3
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/adexpress/lw/uef;->yo()I

    move-result p1

    const/16 v5, 0x9

    if-ne p1, v5, :cond_5

    .line 16
    iget-object p1, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->uef:Lorg/json/JSONObject;

    invoke-static {p1}, Lcom/bytedance/sdk/component/adexpress/uef/oa/oa;->oa(Lorg/json/JSONObject;)Z

    move-result p1

    if-nez p1, :cond_5

    .line 17
    iget-object p1, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->zjm:Lcom/bytedance/sdk/component/adexpress/oa/xs;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->uef:Lorg/json/JSONObject;

    if-nez v3, :cond_4

    move v0, v2

    :cond_4
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v4, v0}, Lcom/bytedance/sdk/component/adexpress/oa/xs;->uef(ILjava/lang/String;)V

    return-void

    .line 18
    :cond_5
    iget-object p1, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->wrv:Lcom/bytedance/sdk/component/adexpress/oa/cq;

    invoke-virtual {p1}, Lcom/bytedance/sdk/component/adexpress/oa/cq;->lw()Lcom/bytedance/sdk/component/adexpress/oa/cz;

    move-result-object p1

    iget-boolean v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->oa:Z

    invoke-interface {p1, v0}, Lcom/bytedance/sdk/component/adexpress/oa/cz;->uef(Z)V

    .line 19
    iget-boolean p1, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->oa:Z

    if-eqz p1, :cond_7

    .line 20
    :try_start_0
    iget-object p1, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->wrv:Lcom/bytedance/sdk/component/adexpress/oa/cq;

    invoke-virtual {p1}, Lcom/bytedance/sdk/component/adexpress/oa/cq;->rt()I

    move-result p1

    .line 21
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->wrv:Lcom/bytedance/sdk/component/adexpress/oa/cq;

    invoke-virtual {v0}, Lcom/bytedance/sdk/component/adexpress/oa/cq;->gzw()Z

    move-result v0

    if-eqz v0, :cond_6

    if-ne p1, v2, :cond_6

    .line 22
    iget-object p1, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->wrv:Lcom/bytedance/sdk/component/adexpress/oa/cq;

    invoke-virtual {p1}, Lcom/bytedance/sdk/component/adexpress/oa/cq;->yo()Lorg/json/JSONObject;

    .line 23
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "window.SDK_INJECT_DATA="

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->wrv:Lcom/bytedance/sdk/component/adexpress/oa/cq;

    invoke-virtual {v0}, Lcom/bytedance/sdk/component/adexpress/oa/cq;->yo()Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ";"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 24
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "javascript:window.SDK_RESET_RENDER();"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "window.SDK_TRIGGER_RENDER();"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    .line 25
    :cond_6
    const-string p1, "javascript:window.SDK_RESET_RENDER();window.SDK_TRIGGER_RENDER();"

    .line 26
    :goto_0
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->moa:Lcom/bytedance/sdk/component/cz/ivm;

    invoke-virtual {v0}, Lcom/bytedance/sdk/component/cz/ivm;->bs()V

    .line 27
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->wrv:Lcom/bytedance/sdk/component/adexpress/oa/cq;

    invoke-virtual {v0}, Lcom/bytedance/sdk/component/adexpress/oa/cq;->lw()Lcom/bytedance/sdk/component/adexpress/oa/cz;

    .line 28
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->moa:Lcom/bytedance/sdk/component/cz/ivm;

    invoke-virtual {v0}, Lcom/bytedance/sdk/component/cz/ivm;->getWebView()Landroid/webkit/WebView;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/bytedance/sdk/component/utils/dz;->uef(Landroid/webkit/WebView;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 29
    :goto_1
    invoke-static {}, Lcom/bytedance/sdk/component/adexpress/lw/lw;->uef()Lcom/bytedance/sdk/component/adexpress/lw/lw;

    move-result-object v0

    iget-object v2, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->moa:Lcom/bytedance/sdk/component/cz/ivm;

    invoke-virtual {v0, v2}, Lcom/bytedance/sdk/component/adexpress/lw/lw;->lw(Lcom/bytedance/sdk/component/cz/ivm;)Z

    .line 30
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->zjm:Lcom/bytedance/sdk/component/adexpress/oa/xs;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "load exception is "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lcom/bytedance/sdk/component/adexpress/oa/xs;->uef(ILjava/lang/String;)V

    return-void

    .line 31
    :cond_7
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/adexpress/lw/uef;->moa()Lcom/bytedance/sdk/component/cz/ivm;

    move-result-object p1

    .line 32
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/cz/ivm;->bs()V

    .line 33
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->wrv:Lcom/bytedance/sdk/component/adexpress/oa/cq;

    invoke-virtual {v0}, Lcom/bytedance/sdk/component/adexpress/oa/cq;->lw()Lcom/bytedance/sdk/component/adexpress/oa/cz;

    .line 34
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->cz:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/component/cz/ivm;->a_(Ljava/lang/String;)V

    return-void

    .line 35
    :cond_8
    :goto_2
    iget-object p1, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->zjm:Lcom/bytedance/sdk/component/adexpress/oa/xs;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "SSWebview null is "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bytedance/sdk/component/adexpress/lw/uef;->moa()Lcom/bytedance/sdk/component/cz/ivm;

    move-result-object v4

    if-nez v4, :cond_9

    move v0, v2

    :cond_9
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, " or Webview is null"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lcom/bytedance/sdk/component/adexpress/oa/xs;->uef(ILjava/lang/String;)V

    return-void
.end method

.method public uef(Ljava/lang/String;)V
    .locals 0

    .line 6
    iput-object p1, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->cz:Ljava/lang/String;

    return-void
.end method

.method public uef(Lorg/json/JSONObject;)V
    .locals 0

    .line 79
    iput-object p1, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->uef:Lorg/json/JSONObject;

    return-void
.end method

.method public uef(Z)V
    .locals 0

    .line 36
    iput-boolean p1, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->cq:Z

    return-void
.end method

.method public wrv()V
    .locals 0

    return-void
.end method

.method public xs()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->ivm:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->ivm:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/adexpress/lw/uef;->cz()V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->moa:Lcom/bytedance/sdk/component/cz/ivm;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->moa:Lcom/bytedance/sdk/component/cz/ivm;

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Landroid/view/ViewGroup;

    .line 34
    .line 35
    iget-object v1, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->moa:Lcom/bytedance/sdk/component/cz/ivm;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    const-string v1, "release: webview success = "

    .line 43
    .line 44
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    iget-boolean v1, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->yo:Z

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v1, "; is click backup close button = "

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    iget-object v1, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->wk:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    const-string v1, "WebViewRender"

    .line 71
    .line 72
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 73
    .line 74
    .line 75
    iget-boolean v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->yo:Z

    .line 76
    .line 77
    if-eqz v0, :cond_2

    .line 78
    .line 79
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->wk:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-nez v0, :cond_2

    .line 86
    .line 87
    const-string v0, "release: recycle webview for pool"

    .line 88
    .line 89
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/adexpress/lw/uef;->oa()V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :cond_2
    const-string v0, "release: direct destroy webview"

    .line 97
    .line 98
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 99
    .line 100
    .line 101
    invoke-static {}, Lcom/bytedance/sdk/component/adexpress/lw/lw;->uef()Lcom/bytedance/sdk/component/adexpress/lw/lw;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    iget-object v1, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->moa:Lcom/bytedance/sdk/component/cz/ivm;

    .line 106
    .line 107
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/component/adexpress/lw/lw;->lw(Lcom/bytedance/sdk/component/cz/ivm;)Z

    .line 108
    .line 109
    .line 110
    return-void
.end method

.method public yo()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public zjm()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/adexpress/lw/uef;->dj()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->moa:Lcom/bytedance/sdk/component/cz/ivm;

    .line 5
    .line 6
    invoke-static {v0}, Lcom/bytedance/sdk/component/utils/oa;->uef(Landroid/view/View;)Landroid/app/Activity;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-direct {p0, v0}, Lcom/bytedance/sdk/component/adexpress/lw/uef;->oa(Landroid/app/Activity;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iput v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->dz:I

    .line 17
    .line 18
    :cond_0
    return-void
.end method
