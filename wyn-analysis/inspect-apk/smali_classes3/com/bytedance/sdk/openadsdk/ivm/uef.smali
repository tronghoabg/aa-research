.class public Lcom/bytedance/sdk/openadsdk/ivm/uef;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile uef:Lcom/bytedance/sdk/openadsdk/ivm/uef;


# instance fields
.field private ab:Z

.field private bcc:[I

.field private bs:Z

.field private cq:Z

.field private cz:[I

.field private dj:Z

.field private dz:Z

.field private ivm:[I

.field private lw:[I

.field private moa:Z

.field private oa:Z

.field private wk:I

.field private wrv:[I

.field private xs:[I

.field private yo:Z

.field private zjm:Z


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/ivm/uef;->oa()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static synthetic bcc(Lcom/bytedance/sdk/openadsdk/ivm/uef;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/ivm/uef;->dj:Z

    return p1
.end method

.method public static synthetic cz(Lcom/bytedance/sdk/openadsdk/ivm/uef;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/ivm/uef;->cq:Z

    return p1
.end method

.method public static synthetic ivm(Lcom/bytedance/sdk/openadsdk/ivm/uef;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/ivm/uef;->moa:Z

    return p1
.end method

.method public static synthetic ivm(Lcom/bytedance/sdk/openadsdk/ivm/uef;[I)[I
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/ivm/uef;->cz:[I

    return-object p1
.end method

.method public static synthetic lw(Lcom/bytedance/sdk/openadsdk/ivm/uef;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/ivm/uef;->yo:Z

    return p1
.end method

.method public static synthetic lw(Lcom/bytedance/sdk/openadsdk/ivm/uef;[I)[I
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/ivm/uef;->bcc:[I

    return-object p1
.end method

.method public static synthetic moa(Lcom/bytedance/sdk/openadsdk/ivm/uef;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/ivm/uef;->oa:Z

    return p1
.end method

.method public static synthetic moa(Lcom/bytedance/sdk/openadsdk/ivm/uef;[I)[I
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/ivm/uef;->wrv:[I

    return-object p1
.end method

.method public static synthetic oa(Lcom/bytedance/sdk/openadsdk/ivm/uef;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/ivm/uef;->bs:Z

    return p1
.end method

.method public static synthetic oa(Lcom/bytedance/sdk/openadsdk/ivm/uef;[I)[I
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/ivm/uef;->ivm:[I

    return-object p1
.end method

.method public static synthetic oa(Lcom/bytedance/sdk/openadsdk/ivm/uef;[Ljava/lang/String;)[I
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/ivm/uef;->oa([Ljava/lang/String;)[I

    move-result-object p0

    return-object p0
.end method

.method private oa([Ljava/lang/String;)[I
    .locals 2

    .line 5
    array-length v0, p1

    const/4 v1, 0x0

    if-lez v0, :cond_0

    .line 6
    aget-object p1, p1, v1

    const-string v0, ","

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/ivm/uef;->yo([Ljava/lang/String;)[I

    move-result-object p1

    return-object p1

    .line 7
    :cond_0
    new-array p1, v1, [I

    return-object p1
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/ivm/uef;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/ivm/uef;->wk:I

    return p1
.end method

.method public static uef()Lcom/bytedance/sdk/openadsdk/ivm/uef;
    .locals 2

    .line 6
    sget-object v0, Lcom/bytedance/sdk/openadsdk/ivm/uef;->uef:Lcom/bytedance/sdk/openadsdk/ivm/uef;

    if-nez v0, :cond_1

    .line 7
    const-class v0, Lcom/bytedance/sdk/openadsdk/core/yo;

    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lcom/bytedance/sdk/openadsdk/ivm/uef;->uef:Lcom/bytedance/sdk/openadsdk/ivm/uef;

    if-nez v1, :cond_0

    .line 9
    new-instance v1, Lcom/bytedance/sdk/openadsdk/ivm/uef;

    invoke-direct {v1}, Lcom/bytedance/sdk/openadsdk/ivm/uef;-><init>()V

    sput-object v1, Lcom/bytedance/sdk/openadsdk/ivm/uef;->uef:Lcom/bytedance/sdk/openadsdk/ivm/uef;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    .line 10
    :cond_0
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    monitor-exit v0

    throw v1

    .line 11
    :cond_1
    :goto_2
    sget-object v0, Lcom/bytedance/sdk/openadsdk/ivm/uef;->uef:Lcom/bytedance/sdk/openadsdk/ivm/uef;

    return-object v0
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/ivm/uef;)Z
    .locals 0

    .line 2
    iget-boolean p0, p0, Lcom/bytedance/sdk/openadsdk/ivm/uef;->dz:Z

    return p0
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/ivm/uef;Z)Z
    .locals 0

    .line 3
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/ivm/uef;->dz:Z

    return p1
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/ivm/uef;[Ljava/lang/String;)Z
    .locals 0

    .line 4
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/ivm/uef;->uef([Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private uef([Ljava/lang/String;)Z
    .locals 4

    .line 12
    array-length v0, p1

    const/4 v1, 0x2

    const/4 v2, 0x1

    const-string v3, "session"

    if-ne v0, v1, :cond_0

    .line 13
    aget-object p1, p1, v2

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 14
    :cond_0
    array-length v0, p1

    const/4 v1, 0x0

    if-ne v0, v2, :cond_1

    .line 15
    aget-object p1, p1, v1

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    return v1
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/ivm/uef;[I)[I
    .locals 0

    .line 5
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/ivm/uef;->lw:[I

    return-object p1
.end method

.method public static synthetic xs(Lcom/bytedance/sdk/openadsdk/ivm/uef;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/ivm/uef;->zjm:Z

    return p1
.end method

.method public static synthetic yo(Lcom/bytedance/sdk/openadsdk/ivm/uef;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/ivm/uef;->ab:Z

    return p1
.end method

.method public static synthetic yo(Lcom/bytedance/sdk/openadsdk/ivm/uef;[I)[I
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/ivm/uef;->xs:[I

    return-object p1
.end method

.method public static synthetic yo(Lcom/bytedance/sdk/openadsdk/ivm/uef;[Ljava/lang/String;)[I
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/ivm/uef;->yo([Ljava/lang/String;)[I

    move-result-object p0

    return-object p0
.end method

.method private yo([Ljava/lang/String;)[I
    .locals 7

    .line 4
    array-length v0, p1

    new-array v1, v0, [I

    .line 5
    array-length v2, p1

    const/4 v3, 0x0

    move v4, v3

    move v5, v4

    :goto_0
    if-ge v4, v2, :cond_1

    aget-object v6, p1, v4

    .line 6
    :try_start_0
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    aput v6, v1, v5
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    if-gtz v6, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v5, v5, 0x1

    :catch_0
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    if-eq v5, v0, :cond_2

    .line 7
    new-array p1, v5, [I

    .line 8
    invoke-static {v1, v3, p1, v3, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object p1

    :cond_2
    return-object v1
.end method


# virtual methods
.method public ab()[I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/ivm/uef;->wrv:[I

    .line 2
    .line 3
    return-object v0
.end method

.method public bcc()Z
    .locals 1

    .line 2
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/ivm/uef;->moa:Z

    return v0
.end method

.method public bs()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/ivm/uef;->cq:Z

    .line 2
    .line 3
    return v0
.end method

.method public cq()[I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/ivm/uef;->cz:[I

    .line 2
    .line 3
    return-object v0
.end method

.method public cz()[I
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/ivm/uef;->lw:[I

    return-object v0
.end method

.method public dj()[I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/ivm/uef;->xs:[I

    .line 2
    .line 3
    return-object v0
.end method

.method public dz()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/ivm/uef;->zjm:Z

    .line 2
    .line 3
    return v0
.end method

.method public ivm()Z
    .locals 1

    .line 3
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/ivm/uef;->oa:Z

    return v0
.end method

.method public lw()Z
    .locals 1

    .line 3
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/ivm/uef;->ab:Z

    return v0
.end method

.method public moa()I
    .locals 1

    .line 3
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/ivm/uef;->wk:I

    return v0
.end method

.method public oa()V
    .locals 2

    .line 4
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/wk;->oa()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/bytedance/sdk/openadsdk/ivm/uef$1;

    invoke-direct {v1, p0}, Lcom/bytedance/sdk/openadsdk/ivm/uef$1;-><init>(Lcom/bytedance/sdk/openadsdk/ivm/uef;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public sy()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/ivm/uef;->bs:Z

    .line 2
    .line 3
    return v0
.end method

.method public wk()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/ivm/uef;->dj:Z

    .line 2
    .line 3
    return v0
.end method

.method public wrv()[I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/ivm/uef;->bcc:[I

    .line 2
    .line 3
    return-object v0
.end method

.method public xs()Z
    .locals 1

    .line 2
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/ivm/uef;->yo:Z

    return v0
.end method

.method public yo()Z
    .locals 1

    .line 9
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/ivm/uef;->dz:Z

    return v0
.end method

.method public zjm()[I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/ivm/uef;->ivm:[I

    .line 2
    .line 3
    return-object v0
.end method
