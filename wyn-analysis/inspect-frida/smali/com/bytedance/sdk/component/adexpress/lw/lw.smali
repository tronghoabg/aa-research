.class public Lcom/bytedance/sdk/component/adexpress/lw/lw;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static bcc:I = 0xa

.field private static volatile cz:Lcom/bytedance/sdk/component/adexpress/lw/lw; = null

.field private static ivm:I = 0xa

.field private static final lw:[B


# instance fields
.field private moa:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/bytedance/sdk/component/adexpress/lw/moa;",
            ">;"
        }
    .end annotation
.end field

.field private oa:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/component/cz/ivm;",
            ">;"
        }
    .end annotation
.end field

.field private uef:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/component/cz/ivm;",
            ">;"
        }
    .end annotation
.end field

.field private final xs:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private yo:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/bytedance/sdk/component/adexpress/lw/yo;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    sput-object v0, Lcom/bytedance/sdk/component/adexpress/lw/lw;->lw:[B

    .line 5
    .line 6
    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/lw;->xs:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    new-instance v0, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/lw;->uef:Ljava/util/List;

    .line 18
    .line 19
    new-instance v0, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/lw;->oa:Ljava/util/List;

    .line 25
    .line 26
    new-instance v0, Ljava/util/HashMap;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/lw;->yo:Ljava/util/Map;

    .line 32
    .line 33
    new-instance v0, Ljava/util/HashMap;

    .line 34
    .line 35
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/lw;->moa:Ljava/util/Map;

    .line 39
    .line 40
    invoke-static {}, Lcom/bytedance/sdk/component/adexpress/uef/uef/uef;->uef()Lcom/bytedance/sdk/component/adexpress/uef/uef/uef;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/adexpress/uef/uef/uef;->yo()Lcom/bytedance/sdk/component/adexpress/uef/uef/yo;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    if-eqz v0, :cond_0

    .line 49
    .line 50
    invoke-interface {v0}, Lcom/bytedance/sdk/component/adexpress/uef/uef/yo;->zjm()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    sput v1, Lcom/bytedance/sdk/component/adexpress/lw/lw;->ivm:I

    .line 55
    .line 56
    invoke-interface {v0}, Lcom/bytedance/sdk/component/adexpress/uef/uef/yo;->dj()I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    sput v0, Lcom/bytedance/sdk/component/adexpress/lw/lw;->bcc:I

    .line 61
    .line 62
    :cond_0
    return-void
.end method

.method public static uef()Lcom/bytedance/sdk/component/adexpress/lw/lw;
    .locals 2

    .line 1
    sget-object v0, Lcom/bytedance/sdk/component/adexpress/lw/lw;->cz:Lcom/bytedance/sdk/component/adexpress/lw/lw;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/bytedance/sdk/component/adexpress/lw/lw;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/bytedance/sdk/component/adexpress/lw/lw;->cz:Lcom/bytedance/sdk/component/adexpress/lw/lw;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/bytedance/sdk/component/adexpress/lw/lw;

    invoke-direct {v1}, Lcom/bytedance/sdk/component/adexpress/lw/lw;-><init>()V

    sput-object v1, Lcom/bytedance/sdk/component/adexpress/lw/lw;->cz:Lcom/bytedance/sdk/component/adexpress/lw/lw;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    .line 5
    :cond_0
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    monitor-exit v0

    throw v1

    .line 6
    :cond_1
    :goto_2
    sget-object v0, Lcom/bytedance/sdk/component/adexpress/lw/lw;->cz:Lcom/bytedance/sdk/component/adexpress/lw/lw;

    return-object v0
.end method

.method private xs(Lcom/bytedance/sdk/component/cz/ivm;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_2

    .line 4
    :cond_0
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/cz/ivm;->getScene()Lcom/bytedance/sdk/component/cz/ivm$yo;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {v0}, Lcom/bytedance/sdk/component/utils/pz;->oa(Lcom/bytedance/sdk/component/cz/ivm$yo;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-static {p1}, Lcom/bytedance/sdk/component/utils/pz;->uef(Lcom/bytedance/sdk/component/cz/ivm;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/lw;->uef:Ljava/util/List;

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    sget v1, Lcom/bytedance/sdk/component/adexpress/lw/lw;->ivm:I

    .line 25
    .line 26
    if-lt v0, v1, :cond_3

    .line 27
    .line 28
    :try_start_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    instance-of v1, v0, Landroid/content/MutableContextWrapper;

    .line 33
    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    move-object v1, v0

    .line 37
    check-cast v1, Landroid/content/MutableContextWrapper;

    .line 38
    .line 39
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v1, v0}, Landroid/content/MutableContextWrapper;->setBaseContext(Landroid/content/Context;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception p1

    .line 48
    goto :goto_1

    .line 49
    :cond_2
    :goto_0
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/cz/ivm;->ab()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_3
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/lw;->uef:Ljava/util/List;

    .line 58
    .line 59
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_4

    .line 64
    .line 65
    :try_start_1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    instance-of v1, v0, Landroid/content/MutableContextWrapper;

    .line 70
    .line 71
    if-eqz v1, :cond_4

    .line 72
    .line 73
    move-object v1, v0

    .line 74
    check-cast v1, Landroid/content/MutableContextWrapper;

    .line 75
    .line 76
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {v1, v0}, Landroid/content/MutableContextWrapper;->setBaseContext(Landroid/content/Context;)V

    .line 81
    .line 82
    .line 83
    const/4 v0, 0x1

    .line 84
    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/component/cz/ivm;->setRecycler(Z)V

    .line 85
    .line 86
    .line 87
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/lw;->uef:Ljava/util/List;

    .line 88
    .line 89
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/adexpress/lw/lw;->yo()I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :catchall_1
    move-exception p1

    .line 97
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/adexpress/lw/lw;->yo()I

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    :cond_4
    :goto_2
    return-void
.end method


# virtual methods
.method public ivm(Lcom/bytedance/sdk/component/cz/ivm;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/cz/ivm;->getWebView()Landroid/webkit/WebView;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    :goto_0
    return-void

    .line 11
    :cond_1
    iget-object v1, p0, Lcom/bytedance/sdk/component/adexpress/lw/lw;->yo:Ljava/util/Map;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lcom/bytedance/sdk/component/adexpress/lw/yo;

    .line 26
    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/component/adexpress/lw/yo;->uef(Lcom/bytedance/sdk/component/adexpress/lw/oa;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    const-string v0, "SDK_INJECT_GLOBAL"

    .line 34
    .line 35
    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/component/cz/ivm;->b_(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public lw(Lcom/bytedance/sdk/component/cz/ivm;)Z
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return p1

    .line 5
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    instance-of v1, v0, Landroid/content/MutableContextWrapper;

    .line 10
    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    move-object v1, v0

    .line 14
    check-cast v1, Landroid/content/MutableContextWrapper;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v1, v0}, Landroid/content/MutableContextWrapper;->setBaseContext(Landroid/content/Context;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    :goto_0
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/cz/ivm;->ab()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    goto :goto_2

    .line 30
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    :goto_2
    const/4 p1, 0x1

    .line 34
    return p1
.end method

.method public moa()I
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/lw;->oa:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public moa(Lcom/bytedance/sdk/component/cz/ivm;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-static {p1}, Lcom/bytedance/sdk/component/utils/pz;->oa(Lcom/bytedance/sdk/component/cz/ivm;)V

    .line 2
    const-string v0, "SDK_INJECT_GLOBAL"

    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/component/cz/ivm;->b_(Ljava/lang/String;)V

    .line 3
    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/component/adexpress/lw/lw;->ivm(Lcom/bytedance/sdk/component/cz/ivm;)V

    .line 4
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/component/adexpress/lw/lw;->xs(Lcom/bytedance/sdk/component/cz/ivm;)V

    return-void
.end method

.method public oa(Landroid/content/Context;Ljava/lang/String;)Lcom/bytedance/sdk/component/cz/ivm;
    .locals 5

    .line 1
    sget-object v0, Lcom/bytedance/sdk/component/cz/ivm$yo;->oa:Lcom/bytedance/sdk/component/cz/ivm$yo;

    invoke-static {v0}, Lcom/bytedance/sdk/component/utils/pz;->oa(Lcom/bytedance/sdk/component/cz/ivm$yo;)Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-eqz v1, :cond_1

    .line 2
    invoke-static {p2}, Lcom/bytedance/sdk/component/adexpress/moa/lw;->uef(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-static {v0}, Lcom/bytedance/sdk/component/utils/pz;->uef(Lcom/bytedance/sdk/component/cz/ivm$yo;)I

    move-result p2

    if-gt p2, v2, :cond_0

    return-object v4

    .line 3
    :cond_0
    invoke-static {p1, v4, v3, v0}, Lcom/bytedance/sdk/component/utils/pz;->uef(Landroid/content/Context;Landroid/util/AttributeSet;ILcom/bytedance/sdk/component/cz/ivm$yo;)Lcom/bytedance/sdk/component/cz/ivm;

    move-result-object p1

    return-object p1

    .line 4
    :cond_1
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/adexpress/lw/lw;->moa()I

    move-result v0

    if-gtz v0, :cond_2

    return-object v4

    .line 5
    :cond_2
    invoke-static {p2}, Lcom/bytedance/sdk/component/adexpress/moa/lw;->uef(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-virtual {p0}, Lcom/bytedance/sdk/component/adexpress/lw/lw;->moa()I

    move-result p2

    if-gt p2, v2, :cond_3

    .line 6
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/adexpress/lw/lw;->moa()I

    return-object v4

    .line 7
    :cond_3
    iget-object p2, p0, Lcom/bytedance/sdk/component/adexpress/lw/lw;->oa:Ljava/util/List;

    invoke-interface {p2, v3}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/bytedance/sdk/component/cz/ivm;

    if-nez p2, :cond_4

    return-object v4

    .line 8
    :cond_4
    :try_start_0
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 9
    instance-of v1, v0, Landroid/content/MutableContextWrapper;

    if-eqz v1, :cond_5

    .line 10
    check-cast v0, Landroid/content/MutableContextWrapper;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/MutableContextWrapper;->setBaseContext(Landroid/content/Context;)V

    .line 11
    invoke-virtual {p2, v3}, Lcom/bytedance/sdk/component/cz/ivm;->setRecycler(Z)V

    .line 12
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/adexpress/lw/lw;->moa()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_5
    return-object p2

    .line 13
    :catchall_0
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/adexpress/lw/lw;->moa()I

    return-object v4
.end method

.method public oa()V
    .locals 4

    .line 30
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/lw;->uef:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bytedance/sdk/component/cz/ivm;

    if-eqz v1, :cond_0

    .line 31
    :try_start_0
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    .line 32
    instance-of v3, v2, Landroid/content/MutableContextWrapper;

    if-eqz v3, :cond_1

    .line 33
    move-object v3, v2

    check-cast v3, Landroid/content/MutableContextWrapper;

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v3, v2}, Landroid/content/MutableContextWrapper;->setBaseContext(Landroid/content/Context;)V

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_2

    .line 34
    :cond_1
    :goto_1
    invoke-virtual {v1}, Lcom/bytedance/sdk/component/cz/ivm;->ab()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 35
    :goto_2
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    goto :goto_0

    .line 36
    :cond_2
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/lw;->uef:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 37
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/lw;->oa:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bytedance/sdk/component/cz/ivm;

    if-eqz v1, :cond_3

    .line 38
    :try_start_1
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    .line 39
    instance-of v3, v2, Landroid/content/MutableContextWrapper;

    if-eqz v3, :cond_4

    .line 40
    move-object v3, v2

    check-cast v3, Landroid/content/MutableContextWrapper;

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v3, v2}, Landroid/content/MutableContextWrapper;->setBaseContext(Landroid/content/Context;)V

    goto :goto_4

    :catchall_1
    move-exception v1

    goto :goto_5

    .line 41
    :cond_4
    :goto_4
    invoke-virtual {v1}, Lcom/bytedance/sdk/component/cz/ivm;->ab()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    .line 42
    :goto_5
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    goto :goto_3

    .line 43
    :cond_5
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/lw;->oa:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public oa(I)V
    .locals 1

    .line 44
    sget-object v0, Lcom/bytedance/sdk/component/adexpress/lw/lw;->lw:[B

    monitor-enter v0

    .line 45
    :try_start_0
    sput p1, Lcom/bytedance/sdk/component/adexpress/lw/lw;->bcc:I

    .line 46
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public oa(Lcom/bytedance/sdk/component/cz/ivm;)V
    .locals 2

    if-nez p1, :cond_0

    goto :goto_2

    .line 14
    :cond_0
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/cz/ivm;->getScene()Lcom/bytedance/sdk/component/cz/ivm$yo;

    move-result-object v0

    invoke-static {v0}, Lcom/bytedance/sdk/component/utils/pz;->oa(Lcom/bytedance/sdk/component/cz/ivm$yo;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 15
    invoke-static {p1}, Lcom/bytedance/sdk/component/utils/pz;->uef(Lcom/bytedance/sdk/component/cz/ivm;)V

    return-void

    .line 16
    :cond_1
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/lw;->oa:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    sget v1, Lcom/bytedance/sdk/component/adexpress/lw/lw;->bcc:I

    if-lt v0, v1, :cond_3

    .line 17
    :try_start_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 18
    instance-of v1, v0, Landroid/content/MutableContextWrapper;

    if-eqz v1, :cond_2

    .line 19
    move-object v1, v0

    check-cast v1, Landroid/content/MutableContextWrapper;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/MutableContextWrapper;->setBaseContext(Landroid/content/Context;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 20
    :cond_2
    :goto_0
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/cz/ivm;->ab()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    .line 21
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    return-void

    .line 22
    :cond_3
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/lw;->oa:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 23
    :try_start_1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 24
    instance-of v1, v0, Landroid/content/MutableContextWrapper;

    if-eqz v1, :cond_4

    .line 25
    move-object v1, v0

    check-cast v1, Landroid/content/MutableContextWrapper;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/MutableContextWrapper;->setBaseContext(Landroid/content/Context;)V

    const/4 v0, 0x1

    .line 26
    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/component/cz/ivm;->setRecycler(Z)V

    .line 27
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/lw;->oa:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 28
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/adexpress/lw/lw;->moa()I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    return-void

    :catchall_1
    move-exception p1

    .line 29
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/adexpress/lw/lw;->moa()I

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    :cond_4
    :goto_2
    return-void
.end method

.method public uef(Landroid/content/Context;Ljava/lang/String;)Lcom/bytedance/sdk/component/cz/ivm;
    .locals 3

    .line 7
    sget-object v0, Lcom/bytedance/sdk/component/cz/ivm$yo;->yo:Lcom/bytedance/sdk/component/cz/ivm$yo;

    invoke-static {v0}, Lcom/bytedance/sdk/component/utils/pz;->oa(Lcom/bytedance/sdk/component/cz/ivm$yo;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 8
    invoke-static {p2}, Lcom/bytedance/sdk/component/adexpress/moa/lw;->uef(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-static {v0}, Lcom/bytedance/sdk/component/utils/pz;->uef(Lcom/bytedance/sdk/component/cz/ivm$yo;)I

    move-result p2

    const/4 v1, 0x1

    if-gt p2, v1, :cond_0

    return-object v2

    :cond_0
    const/4 p2, 0x0

    .line 9
    invoke-static {p1, v2, p2, v0}, Lcom/bytedance/sdk/component/utils/pz;->uef(Landroid/content/Context;Landroid/util/AttributeSet;ILcom/bytedance/sdk/component/cz/ivm$yo;)Lcom/bytedance/sdk/component/cz/ivm;

    move-result-object p1

    return-object p1

    :cond_1
    return-object v2
.end method

.method public uef(I)V
    .locals 1

    .line 36
    sget-object v0, Lcom/bytedance/sdk/component/adexpress/lw/lw;->lw:[B

    monitor-enter v0

    .line 37
    :try_start_0
    sput p1, Lcom/bytedance/sdk/component/adexpress/lw/lw;->ivm:I

    .line 38
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public uef(Landroid/webkit/WebView;Lcom/bytedance/sdk/component/uef/dhk;Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_2

    if-eqz p2, :cond_2

    .line 26
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 27
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/lw;->moa:Ljava/util/Map;

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bytedance/sdk/component/adexpress/lw/moa;

    if-eqz v0, :cond_1

    .line 28
    invoke-virtual {v0, p2}, Lcom/bytedance/sdk/component/adexpress/lw/moa;->uef(Lcom/bytedance/sdk/component/uef/dhk;)V

    goto :goto_0

    .line 29
    :cond_1
    new-instance v0, Lcom/bytedance/sdk/component/adexpress/lw/moa;

    invoke-direct {v0, p2}, Lcom/bytedance/sdk/component/adexpress/lw/moa;-><init>(Lcom/bytedance/sdk/component/uef/dhk;)V

    .line 30
    iget-object p2, p0, Lcom/bytedance/sdk/component/adexpress/lw/lw;->moa:Ljava/util/Map;

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    :goto_0
    invoke-virtual {p1, v0, p3}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public uef(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_2

    .line 32
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 33
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/lw;->moa:Ljava/util/Map;

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bytedance/sdk/component/adexpress/lw/moa;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 34
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/component/adexpress/lw/moa;->uef(Lcom/bytedance/sdk/component/uef/dhk;)V

    .line 35
    :cond_1
    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/component/cz/ivm;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 10
    :cond_0
    invoke-static {p1}, Lcom/bytedance/sdk/component/utils/pz;->oa(Lcom/bytedance/sdk/component/cz/ivm;)V

    .line 11
    const-string v0, "SDK_INJECT_GLOBAL"

    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/component/cz/ivm;->b_(Ljava/lang/String;)V

    .line 12
    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/component/adexpress/lw/lw;->ivm(Lcom/bytedance/sdk/component/cz/ivm;)V

    .line 13
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/cz/ivm;->getScene()Lcom/bytedance/sdk/component/cz/ivm$yo;

    move-result-object v0

    invoke-static {v0}, Lcom/bytedance/sdk/component/utils/pz;->oa(Lcom/bytedance/sdk/component/cz/ivm$yo;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 14
    invoke-static {p1}, Lcom/bytedance/sdk/component/utils/pz;->uef(Lcom/bytedance/sdk/component/cz/ivm;)V

    return-void

    .line 15
    :cond_1
    :try_start_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 16
    instance-of v1, v0, Landroid/content/MutableContextWrapper;

    if-eqz v1, :cond_2

    .line 17
    move-object v1, v0

    check-cast v1, Landroid/content/MutableContextWrapper;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/MutableContextWrapper;->setBaseContext(Landroid/content/Context;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 18
    :cond_2
    :goto_0
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/cz/ivm;->ab()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    .line 19
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/component/cz/ivm;Lcom/bytedance/sdk/component/adexpress/lw/oa;)V
    .locals 3

    if-eqz p1, :cond_3

    if-nez p2, :cond_0

    goto :goto_1

    .line 20
    :cond_0
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/cz/ivm;->getWebView()Landroid/webkit/WebView;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    .line 21
    :cond_1
    iget-object v1, p0, Lcom/bytedance/sdk/component/adexpress/lw/lw;->yo:Ljava/util/Map;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bytedance/sdk/component/adexpress/lw/yo;

    if-eqz v1, :cond_2

    .line 22
    invoke-virtual {v1, p2}, Lcom/bytedance/sdk/component/adexpress/lw/yo;->uef(Lcom/bytedance/sdk/component/adexpress/lw/oa;)V

    goto :goto_0

    .line 23
    :cond_2
    new-instance v1, Lcom/bytedance/sdk/component/adexpress/lw/yo;

    invoke-direct {v1, p2}, Lcom/bytedance/sdk/component/adexpress/lw/yo;-><init>(Lcom/bytedance/sdk/component/adexpress/lw/oa;)V

    .line 24
    iget-object p2, p0, Lcom/bytedance/sdk/component/adexpress/lw/lw;->yo:Ljava/util/Map;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    :goto_0
    const-string p2, "SDK_INJECT_GLOBAL"

    invoke-virtual {p1, v1, p2}, Lcom/bytedance/sdk/component/cz/ivm;->uef(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_3
    :goto_1
    return-void
.end method

.method public yo()I
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/lw;->uef:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public yo(Landroid/content/Context;Ljava/lang/String;)Lcom/bytedance/sdk/component/cz/ivm;
    .locals 5

    .line 5
    sget-object v0, Lcom/bytedance/sdk/component/cz/ivm$yo;->uef:Lcom/bytedance/sdk/component/cz/ivm$yo;

    invoke-static {v0}, Lcom/bytedance/sdk/component/utils/pz;->oa(Lcom/bytedance/sdk/component/cz/ivm$yo;)Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-eqz v1, :cond_1

    .line 6
    invoke-static {p2}, Lcom/bytedance/sdk/component/adexpress/moa/lw;->uef(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-static {v0}, Lcom/bytedance/sdk/component/utils/pz;->uef(Lcom/bytedance/sdk/component/cz/ivm$yo;)I

    move-result p2

    if-gt p2, v2, :cond_0

    return-object v4

    .line 7
    :cond_0
    invoke-static {p1, v4, v3, v0}, Lcom/bytedance/sdk/component/utils/pz;->uef(Landroid/content/Context;Landroid/util/AttributeSet;ILcom/bytedance/sdk/component/cz/ivm$yo;)Lcom/bytedance/sdk/component/cz/ivm;

    move-result-object p1

    return-object p1

    .line 8
    :cond_1
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/adexpress/lw/lw;->yo()I

    move-result v0

    if-gtz v0, :cond_2

    return-object v4

    .line 9
    :cond_2
    invoke-static {p2}, Lcom/bytedance/sdk/component/adexpress/moa/lw;->uef(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-virtual {p0}, Lcom/bytedance/sdk/component/adexpress/lw/lw;->yo()I

    move-result p2

    if-gt p2, v2, :cond_3

    .line 10
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/adexpress/lw/lw;->yo()I

    return-object v4

    .line 11
    :cond_3
    iget-object p2, p0, Lcom/bytedance/sdk/component/adexpress/lw/lw;->uef:Ljava/util/List;

    invoke-interface {p2, v3}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/bytedance/sdk/component/cz/ivm;

    if-nez p2, :cond_4

    return-object v4

    .line 12
    :cond_4
    :try_start_0
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 13
    instance-of v1, v0, Landroid/content/MutableContextWrapper;

    if-eqz v1, :cond_5

    .line 14
    check-cast v0, Landroid/content/MutableContextWrapper;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/MutableContextWrapper;->setBaseContext(Landroid/content/Context;)V

    .line 15
    invoke-virtual {p2, v3}, Lcom/bytedance/sdk/component/cz/ivm;->setRecycler(Z)V

    .line 16
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/adexpress/lw/lw;->yo()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_5
    return-object p2

    .line 17
    :catchall_0
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/adexpress/lw/lw;->yo()I

    return-object v4
.end method

.method public yo(Lcom/bytedance/sdk/component/cz/ivm;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-static {p1}, Lcom/bytedance/sdk/component/utils/pz;->oa(Lcom/bytedance/sdk/component/cz/ivm;)V

    .line 2
    const-string v0, "SDK_INJECT_GLOBAL"

    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/component/cz/ivm;->b_(Ljava/lang/String;)V

    .line 3
    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/component/adexpress/lw/lw;->ivm(Lcom/bytedance/sdk/component/cz/ivm;)V

    .line 4
    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/component/adexpress/lw/lw;->oa(Lcom/bytedance/sdk/component/cz/ivm;)V

    return-void
.end method
