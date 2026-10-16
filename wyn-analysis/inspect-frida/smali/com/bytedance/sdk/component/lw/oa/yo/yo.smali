.class public Lcom/bytedance/sdk/component/lw/oa/yo/yo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/component/lw/cz;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/sdk/component/lw/oa/yo/yo$uef;,
        Lcom/bytedance/sdk/component/lw/oa/yo/yo$oa;
    }
.end annotation


# instance fields
.field private ab:Lcom/bytedance/sdk/component/lw/oib;

.field private bcc:I

.field private bs:I

.field private cp:[B

.field private volatile cq:Z

.field private cz:I

.field private dhk:Lcom/bytedance/sdk/component/lw/xs;

.field private dj:I

.field private dz:Z

.field private gr:Ljava/util/concurrent/ExecutorService;

.field private gsd:I

.field private gzw:Lcom/bytedance/sdk/component/lw/oa;

.field private ivm:Landroid/widget/ImageView$ScaleType;

.field private lw:Lcom/bytedance/sdk/component/lw/ab;

.field private moa:Ljava/lang/String;

.field private oa:Ljava/lang/String;

.field private oib:Z

.field private orq:Lcom/bytedance/sdk/component/lw/oa/yo/ivm;

.field private pz:Lcom/bytedance/sdk/component/lw/dz;

.field private rt:I

.field private final sy:Landroid/os/Handler;

.field private tpx:I

.field private ue:Z

.field uef:Ljava/util/concurrent/Future;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Future<",
            "*>;"
        }
    .end annotation
.end field

.field private wk:Z

.field private wrv:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/widget/ImageView;",
            ">;"
        }
    .end annotation
.end field

.field private xs:Landroid/graphics/Bitmap$Config;

.field private yo:Ljava/lang/String;

.field private zjm:Lcom/bytedance/sdk/component/lw/bcc;


# direct methods
.method private constructor <init>(Lcom/bytedance/sdk/component/lw/oa/yo/yo$oa;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->sy:Landroid/os/Handler;

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->oib:Z

    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->cp:[B

    .line 6
    invoke-static {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/yo$oa;->uef(Lcom/bytedance/sdk/component/lw/oa/yo/yo$oa;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->oa:Ljava/lang/String;

    .line 7
    new-instance v0, Lcom/bytedance/sdk/component/lw/oa/yo/yo$uef;

    invoke-static {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/yo$oa;->oa(Lcom/bytedance/sdk/component/lw/oa/yo/yo$oa;)Lcom/bytedance/sdk/component/lw/ab;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/bytedance/sdk/component/lw/oa/yo/yo$uef;-><init>(Lcom/bytedance/sdk/component/lw/oa/yo/yo;Lcom/bytedance/sdk/component/lw/ab;)V

    iput-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->lw:Lcom/bytedance/sdk/component/lw/ab;

    .line 8
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-static {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/yo$oa;->yo(Lcom/bytedance/sdk/component/lw/oa/yo/yo$oa;)Landroid/widget/ImageView;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->wrv:Ljava/lang/ref/WeakReference;

    .line 9
    invoke-static {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/yo$oa;->moa(Lcom/bytedance/sdk/component/lw/oa/yo/yo$oa;)Landroid/widget/ImageView$ScaleType;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->ivm:Landroid/widget/ImageView$ScaleType;

    .line 10
    invoke-static {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/yo$oa;->lw(Lcom/bytedance/sdk/component/lw/oa/yo/yo$oa;)Landroid/graphics/Bitmap$Config;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->xs:Landroid/graphics/Bitmap$Config;

    .line 11
    invoke-static {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/yo$oa;->ivm(Lcom/bytedance/sdk/component/lw/oa/yo/yo$oa;)I

    move-result v0

    iput v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->bcc:I

    .line 12
    invoke-static {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/yo$oa;->xs(Lcom/bytedance/sdk/component/lw/oa/yo/yo$oa;)I

    move-result v0

    iput v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->cz:I

    .line 13
    invoke-static {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/yo$oa;->bcc(Lcom/bytedance/sdk/component/lw/oa/yo/yo$oa;)I

    move-result v0

    iput v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->dj:I

    .line 14
    invoke-static {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/yo$oa;->cz(Lcom/bytedance/sdk/component/lw/oa/yo/yo$oa;)I

    move-result v0

    iput v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->bs:I

    .line 15
    invoke-static {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/yo$oa;->zjm(Lcom/bytedance/sdk/component/lw/oa/yo/yo$oa;)Lcom/bytedance/sdk/component/lw/oib;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->ab:Lcom/bytedance/sdk/component/lw/oib;

    .line 16
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->uef(Lcom/bytedance/sdk/component/lw/oa/yo/yo$oa;)Lcom/bytedance/sdk/component/lw/oa;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->gzw:Lcom/bytedance/sdk/component/lw/oa;

    .line 17
    invoke-static {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/yo$oa;->dj(Lcom/bytedance/sdk/component/lw/oa/yo/yo$oa;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 18
    invoke-static {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/yo$oa;->dj(Lcom/bytedance/sdk/component/lw/oa/yo/yo$oa;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->oa(Ljava/lang/String;)V

    .line 19
    invoke-static {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/yo$oa;->dj(Lcom/bytedance/sdk/component/lw/oa/yo/yo$oa;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->uef(Ljava/lang/String;)V

    .line 20
    :cond_0
    invoke-static {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/yo$oa;->wrv(Lcom/bytedance/sdk/component/lw/oa/yo/yo$oa;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->dz:Z

    .line 21
    invoke-static {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/yo$oa;->cq(Lcom/bytedance/sdk/component/lw/oa/yo/yo$oa;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->wk:Z

    .line 22
    invoke-static {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/yo$oa;->dz(Lcom/bytedance/sdk/component/lw/oa/yo/yo$oa;)Lcom/bytedance/sdk/component/lw/oa/yo/ivm;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->orq:Lcom/bytedance/sdk/component/lw/oa/yo/ivm;

    .line 23
    invoke-static {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/yo$oa;->wk(Lcom/bytedance/sdk/component/lw/oa/yo/yo$oa;)Lcom/bytedance/sdk/component/lw/bcc;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->zjm:Lcom/bytedance/sdk/component/lw/bcc;

    .line 24
    invoke-static {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/yo$oa;->ab(Lcom/bytedance/sdk/component/lw/oa/yo/yo$oa;)I

    move-result v0

    iput v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->rt:I

    .line 25
    invoke-static {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/yo$oa;->bs(Lcom/bytedance/sdk/component/lw/oa/yo/yo$oa;)I

    move-result v0

    iput v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->gsd:I

    .line 26
    invoke-static {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/yo$oa;->sy(Lcom/bytedance/sdk/component/lw/oa/yo/yo$oa;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->gr:Ljava/util/concurrent/ExecutorService;

    .line 27
    invoke-static {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/yo$oa;->oib(Lcom/bytedance/sdk/component/lw/oa/yo/yo$oa;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->ue:Z

    .line 28
    invoke-static {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/yo$oa;->dhk(Lcom/bytedance/sdk/component/lw/oa/yo/yo$oa;)Lcom/bytedance/sdk/component/lw/dz;

    move-result-object p1

    iput-object p1, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->pz:Lcom/bytedance/sdk/component/lw/dz;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/bytedance/sdk/component/lw/oa/yo/yo$oa;Lcom/bytedance/sdk/component/lw/oa/yo/yo$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/component/lw/oa/yo/yo;-><init>(Lcom/bytedance/sdk/component/lw/oa/yo/yo$oa;)V

    return-void
.end method

.method public static synthetic bcc(Lcom/bytedance/sdk/component/lw/oa/yo/yo;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->bs:I

    return p0
.end method

.method public static synthetic cz(Lcom/bytedance/sdk/component/lw/oa/yo/yo;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->yo:Ljava/lang/String;

    return-object p0
.end method

.method private dhk()Lcom/bytedance/sdk/component/lw/cz;
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->orq:Lcom/bytedance/sdk/component/lw/oa/yo/ivm;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->lw:Lcom/bytedance/sdk/component/lw/ab;

    .line 7
    .line 8
    if-eqz v0, :cond_6

    .line 9
    .line 10
    const-string v2, "not init !"

    .line 11
    .line 12
    const/16 v3, 0x3ed

    .line 13
    .line 14
    invoke-interface {v0, v3, v2, v1}, Lcom/bytedance/sdk/component/lw/ab;->uef(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    return-object p0

    .line 18
    :catch_0
    move-exception v0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->uef()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    iget-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->lw:Lcom/bytedance/sdk/component/lw/ab;

    .line 31
    .line 32
    const-string v2, "url is empty"

    .line 33
    .line 34
    const/16 v3, 0x7d0

    .line 35
    .line 36
    invoke-interface {v0, v3, v2, v1}, Lcom/bytedance/sdk/component/lw/ab;->uef(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    return-object p0

    .line 40
    :cond_1
    iget-object v2, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->orq:Lcom/bytedance/sdk/component/lw/oa/yo/ivm;

    .line 41
    .line 42
    invoke-virtual {v2}, Lcom/bytedance/sdk/component/lw/oa/yo/ivm;->xs()Lcom/bytedance/sdk/component/lw/tpx;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    const-string v3, "http://"

    .line 47
    .line 48
    invoke-virtual {v0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-nez v3, :cond_2

    .line 53
    .line 54
    const-string v3, "https://"

    .line 55
    .line 56
    invoke-virtual {v0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-nez v3, :cond_2

    .line 61
    .line 62
    if-eqz v2, :cond_2

    .line 63
    .line 64
    const-string v3, "url is not validate "

    .line 65
    .line 66
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    const/16 v3, 0x3ee

    .line 71
    .line 72
    invoke-interface {v2, v3, v0}, Lcom/bytedance/sdk/component/lw/tpx;->uef(ILjava/lang/String;)V

    .line 73
    .line 74
    .line 75
    :cond_2
    iget-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->gr:Ljava/util/concurrent/ExecutorService;

    .line 76
    .line 77
    if-nez v0, :cond_3

    .line 78
    .line 79
    iget-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->orq:Lcom/bytedance/sdk/component/lw/oa/yo/ivm;

    .line 80
    .line 81
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/lw/oa/yo/ivm;->ivm()Ljava/util/concurrent/ExecutorService;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    :cond_3
    new-instance v0, Lcom/bytedance/sdk/component/lw/oa/yo/yo$1;

    .line 86
    .line 87
    invoke-direct {v0, p0}, Lcom/bytedance/sdk/component/lw/oa/yo/yo$1;-><init>(Lcom/bytedance/sdk/component/lw/oa/yo/yo;)V

    .line 88
    .line 89
    .line 90
    iget-boolean v2, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->ue:Z

    .line 91
    .line 92
    if-eqz v2, :cond_4

    .line 93
    .line 94
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 95
    .line 96
    .line 97
    return-object p0

    .line 98
    :cond_4
    iget-object v2, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->gr:Ljava/util/concurrent/ExecutorService;

    .line 99
    .line 100
    if-eqz v2, :cond_5

    .line 101
    .line 102
    invoke-interface {v2, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    iput-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->uef:Ljava/util/concurrent/Future;

    .line 107
    .line 108
    return-object p0

    .line 109
    :cond_5
    if-eqz v1, :cond_6

    .line 110
    .line 111
    invoke-interface {v1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    iput-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->uef:Ljava/util/concurrent/Future;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 116
    .line 117
    return-object p0

    .line 118
    :goto_0
    const-string v1, "ImageRequest"

    .line 119
    .line 120
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 125
    .line 126
    .line 127
    :cond_6
    return-object p0
.end method

.method public static synthetic ivm(Lcom/bytedance/sdk/component/lw/oa/yo/yo;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->sy:Landroid/os/Handler;

    return-object p0
.end method

.method public static synthetic lw(Lcom/bytedance/sdk/component/lw/oa/yo/yo;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->dj:I

    return p0
.end method

.method public static synthetic moa(Lcom/bytedance/sdk/component/lw/oa/yo/yo;)Ljava/lang/ref/WeakReference;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->wrv:Ljava/lang/ref/WeakReference;

    return-object p0
.end method

.method public static synthetic oa(Lcom/bytedance/sdk/component/lw/oa/yo/yo;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->cq:Z

    return p0
.end method

.method private uef(Lcom/bytedance/sdk/component/lw/oa/yo/yo$oa;)Lcom/bytedance/sdk/component/lw/oa;
    .locals 1

    .line 2
    invoke-static {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/yo$oa;->tpx(Lcom/bytedance/sdk/component/lw/oa/yo/yo$oa;)Lcom/bytedance/sdk/component/lw/oa;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    invoke-static {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/yo$oa;->tpx(Lcom/bytedance/sdk/component/lw/oa/yo/yo$oa;)Lcom/bytedance/sdk/component/lw/oa;

    move-result-object p1

    return-object p1

    .line 4
    :cond_0
    invoke-static {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/yo$oa;->orq(Lcom/bytedance/sdk/component/lw/oa/yo/yo$oa;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 5
    new-instance v0, Ljava/io/File;

    invoke-static {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/yo$oa;->orq(Lcom/bytedance/sdk/component/lw/oa/yo/yo$oa;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/bytedance/sdk/component/lw/oa/yo/uef/oa;->uef(Ljava/io/File;)Lcom/bytedance/sdk/component/lw/oa;

    move-result-object p1

    return-object p1

    .line 6
    :cond_1
    invoke-static {}, Lcom/bytedance/sdk/component/lw/oa/yo/uef/oa;->cz()Lcom/bytedance/sdk/component/lw/oa;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/component/lw/oa/yo/yo;)Lcom/bytedance/sdk/component/lw/oib;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->ab:Lcom/bytedance/sdk/component/lw/oib;

    return-object p0
.end method

.method public static synthetic xs(Lcom/bytedance/sdk/component/lw/oa/yo/yo;)Lcom/bytedance/sdk/component/lw/bcc;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->zjm:Lcom/bytedance/sdk/component/lw/bcc;

    return-object p0
.end method

.method public static synthetic yo(Lcom/bytedance/sdk/component/lw/oa/yo/yo;)Lcom/bytedance/sdk/component/lw/cz;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->dhk()Lcom/bytedance/sdk/component/lw/cz;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public ab()Lcom/bytedance/sdk/component/lw/oa/yo/ivm;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->orq:Lcom/bytedance/sdk/component/lw/oa/yo/ivm;

    .line 2
    .line 3
    return-object v0
.end method

.method public bcc()Ljava/lang/String;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->yo:Ljava/lang/String;

    return-object v0
.end method

.method public bs()Lcom/bytedance/sdk/component/lw/oa;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->gzw:Lcom/bytedance/sdk/component/lw/oa;

    .line 2
    .line 3
    return-object v0
.end method

.method public cq()[B
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->cp:[B

    .line 2
    .line 3
    return-object v0
.end method

.method public cz()Landroid/widget/ImageView$ScaleType;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->ivm:Landroid/widget/ImageView$ScaleType;

    return-object v0
.end method

.method public dj()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->dj:I

    .line 2
    .line 3
    return v0
.end method

.method public dz()Lcom/bytedance/sdk/component/lw/xs;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->dhk:Lcom/bytedance/sdk/component/lw/xs;

    .line 2
    .line 3
    return-object v0
.end method

.method public ivm()Lcom/bytedance/sdk/component/lw/ab;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->lw:Lcom/bytedance/sdk/component/lw/ab;

    return-object v0
.end method

.method public lw()I
    .locals 1

    .line 2
    iget v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->rt:I

    return v0
.end method

.method public moa()I
    .locals 1

    .line 2
    iget v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->gsd:I

    return v0
.end method

.method public oa()I
    .locals 1

    .line 5
    iget v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->bcc:I

    return v0
.end method

.method public oa(Ljava/lang/String;)V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->wrv:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->wrv:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    const v1, 0x413c0901

    invoke-virtual {v0, v1, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 4
    :cond_0
    iput-object p1, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->yo:Ljava/lang/String;

    return-void
.end method

.method public oib()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->bcc()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->dj()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0
.end method

.method public sy()Lcom/bytedance/sdk/component/lw/dz;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->pz:Lcom/bytedance/sdk/component/lw/dz;

    .line 2
    .line 3
    return-object v0
.end method

.method public uef()Ljava/lang/String;
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->oa:Ljava/lang/String;

    return-object v0
.end method

.method public uef(I)V
    .locals 0

    .line 11
    iput p1, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->tpx:I

    return-void
.end method

.method public uef(Ljava/lang/String;)V
    .locals 0

    .line 8
    iput-object p1, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->moa:Ljava/lang/String;

    return-void
.end method

.method public uef(Z)V
    .locals 0

    .line 9
    iput-boolean p1, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->oib:Z

    return-void
.end method

.method public uef([B)V
    .locals 0

    .line 10
    iput-object p1, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->cp:[B

    return-void
.end method

.method public wk()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->tpx:I

    .line 2
    .line 3
    return v0
.end method

.method public wrv()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->oib:Z

    .line 2
    .line 3
    return v0
.end method

.method public xs()Ljava/lang/String;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->moa:Ljava/lang/String;

    return-object v0
.end method

.method public yo()I
    .locals 1

    .line 2
    iget v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->cz:I

    return v0
.end method

.method public zjm()Landroid/graphics/Bitmap$Config;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->xs:Landroid/graphics/Bitmap$Config;

    .line 2
    .line 3
    return-object v0
.end method
