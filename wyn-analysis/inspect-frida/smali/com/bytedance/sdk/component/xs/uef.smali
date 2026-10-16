.class public Lcom/bytedance/sdk/component/xs/uef;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/sdk/component/xs/uef$oa;,
        Lcom/bytedance/sdk/component/xs/uef$yo;,
        Lcom/bytedance/sdk/component/xs/uef$uef;
    }
.end annotation


# static fields
.field private static oa:Lcom/bytedance/sdk/component/xs/uef$yo;

.field private static uef:Lcom/bytedance/sdk/component/oa/uef/uef/uef/lw;


# instance fields
.field private yo:Lcom/bytedance/sdk/component/oa/uef/dj;


# direct methods
.method private constructor <init>(Lcom/bytedance/sdk/component/xs/uef$uef;)V
    .locals 4

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Lcom/bytedance/sdk/component/oa/uef/dj$uef;

    invoke-direct {v0}, Lcom/bytedance/sdk/component/oa/uef/dj$uef;-><init>()V

    iget v1, p1, Lcom/bytedance/sdk/component/xs/uef$uef;->uef:I

    int-to-long v1, v1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 4
    invoke-virtual {v0, v1, v2, v3}, Lcom/bytedance/sdk/component/oa/uef/dj$uef;->uef(JLjava/util/concurrent/TimeUnit;)Lcom/bytedance/sdk/component/oa/uef/dj$uef;

    move-result-object v0

    iget v1, p1, Lcom/bytedance/sdk/component/xs/uef$uef;->yo:I

    int-to-long v1, v1

    .line 5
    invoke-virtual {v0, v1, v2, v3}, Lcom/bytedance/sdk/component/oa/uef/dj$uef;->yo(JLjava/util/concurrent/TimeUnit;)Lcom/bytedance/sdk/component/oa/uef/dj$uef;

    move-result-object v0

    iget v1, p1, Lcom/bytedance/sdk/component/xs/uef$uef;->oa:I

    int-to-long v1, v1

    .line 6
    invoke-virtual {v0, v1, v2, v3}, Lcom/bytedance/sdk/component/oa/uef/dj$uef;->oa(JLjava/util/concurrent/TimeUnit;)Lcom/bytedance/sdk/component/oa/uef/dj$uef;

    move-result-object v0

    .line 7
    iget-object v1, p1, Lcom/bytedance/sdk/component/xs/uef$uef;->lw:Ljava/util/List;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_0

    .line 8
    iget-object v1, p1, Lcom/bytedance/sdk/component/xs/uef$uef;->lw:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/bytedance/sdk/component/oa/uef/bcc;

    .line 9
    invoke-virtual {v0, v2}, Lcom/bytedance/sdk/component/oa/uef/dj$uef;->uef(Lcom/bytedance/sdk/component/oa/uef/bcc;)Lcom/bytedance/sdk/component/oa/uef/dj$uef;

    goto :goto_0

    .line 10
    :cond_0
    invoke-static {p1}, Lcom/bytedance/sdk/component/xs/uef$uef;->uef(Lcom/bytedance/sdk/component/xs/uef$uef;)Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 11
    invoke-static {p1}, Lcom/bytedance/sdk/component/xs/uef$uef;->uef(Lcom/bytedance/sdk/component/xs/uef$uef;)Landroid/os/Bundle;

    .line 12
    :cond_1
    invoke-static {p1}, Lcom/bytedance/sdk/component/xs/uef$uef;->oa(Lcom/bytedance/sdk/component/xs/uef$uef;)Ljava/util/Set;

    .line 13
    iget-object p1, p1, Lcom/bytedance/sdk/component/xs/uef$uef;->moa:Lcom/bytedance/sdk/component/xs/uef$oa;

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/component/oa/uef/dj$uef;->uef(Lcom/bytedance/sdk/component/xs/uef$oa;)Lcom/bytedance/sdk/component/oa/uef/dj$uef;

    .line 14
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/dj$uef;->uef()Lcom/bytedance/sdk/component/oa/uef/dj;

    move-result-object p1

    iput-object p1, p0, Lcom/bytedance/sdk/component/xs/uef;->yo:Lcom/bytedance/sdk/component/oa/uef/dj;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/bytedance/sdk/component/xs/uef$uef;Lcom/bytedance/sdk/component/xs/uef$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/component/xs/uef;-><init>(Lcom/bytedance/sdk/component/xs/uef$uef;)V

    return-void
.end method

.method public static ivm()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/bytedance/sdk/component/xs/uef;->oa:Lcom/bytedance/sdk/component/xs/uef$yo;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    invoke-interface {v0}, Lcom/bytedance/sdk/component/xs/uef$yo;->uef()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public static lw()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/bytedance/sdk/component/xs/uef;->uef:Lcom/bytedance/sdk/component/oa/uef/uef/uef/lw;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    invoke-interface {v0}, Lcom/bytedance/sdk/component/oa/uef/uef/uef/lw;->uef()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public static uef()V
    .locals 1

    .line 1
    sget-object v0, Lcom/bytedance/sdk/component/xs/yo/moa$uef;->uef:Lcom/bytedance/sdk/component/xs/yo/moa$uef;

    invoke-static {v0}, Lcom/bytedance/sdk/component/xs/yo/moa;->uef(Lcom/bytedance/sdk/component/xs/yo/moa$uef;)V

    return-void
.end method

.method public static uef(Lcom/bytedance/sdk/component/oa/uef/uef/uef/lw;)V
    .locals 0

    .line 2
    sput-object p0, Lcom/bytedance/sdk/component/xs/uef;->uef:Lcom/bytedance/sdk/component/oa/uef/uef/uef/lw;

    return-void
.end method

.method public static uef(Lcom/bytedance/sdk/component/xs/uef$yo;)V
    .locals 0

    .line 5
    sput-object p0, Lcom/bytedance/sdk/component/xs/uef;->oa:Lcom/bytedance/sdk/component/xs/uef$yo;

    return-void
.end method

.method public static uef(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZII)V
    .locals 9

    .line 3
    sget-object v0, Lcom/bytedance/sdk/component/xs/uef;->oa:Lcom/bytedance/sdk/component/xs/uef$yo;

    if-nez v0, :cond_0

    return-void

    :cond_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move v6, p5

    move v7, p6

    move/from16 v8, p7

    .line 4
    invoke-interface/range {v0 .. v8}, Lcom/bytedance/sdk/component/xs/uef$yo;->uef(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZII)V

    return-void
.end method

.method public static xs()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/bytedance/sdk/component/xs/uef;->oa:Lcom/bytedance/sdk/component/xs/uef$yo;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    invoke-interface {v0}, Lcom/bytedance/sdk/component/xs/uef$yo;->oa()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method


# virtual methods
.method public bcc()Lcom/bytedance/sdk/component/oa/uef/dj;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/xs/uef;->yo:Lcom/bytedance/sdk/component/oa/uef/dj;

    .line 2
    .line 3
    return-object v0
.end method

.method public moa()Lcom/bytedance/sdk/component/xs/oa/uef;
    .locals 2

    .line 1
    new-instance v0, Lcom/bytedance/sdk/component/xs/oa/uef;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/bytedance/sdk/component/xs/uef;->yo:Lcom/bytedance/sdk/component/oa/uef/dj;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/bytedance/sdk/component/xs/oa/uef;-><init>(Lcom/bytedance/sdk/component/oa/uef/dj;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public oa()Lcom/bytedance/sdk/component/xs/oa/moa;
    .locals 2

    .line 1
    new-instance v0, Lcom/bytedance/sdk/component/xs/oa/moa;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/bytedance/sdk/component/xs/uef;->yo:Lcom/bytedance/sdk/component/oa/uef/dj;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/bytedance/sdk/component/xs/oa/moa;-><init>(Lcom/bytedance/sdk/component/oa/uef/dj;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public yo()Lcom/bytedance/sdk/component/xs/oa/oa;
    .locals 2

    .line 1
    new-instance v0, Lcom/bytedance/sdk/component/xs/oa/oa;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/bytedance/sdk/component/xs/uef;->yo:Lcom/bytedance/sdk/component/oa/uef/dj;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/bytedance/sdk/component/xs/oa/oa;-><init>(Lcom/bytedance/sdk/component/oa/uef/dj;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
