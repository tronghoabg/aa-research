.class public Lcom/bytedance/sdk/component/lw/oa/oa/moa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/component/lw/oa/oa/ivm;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/bytedance/sdk/component/lw/oa/oa/ivm;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private oa(Lcom/bytedance/sdk/component/lw/oa/yo/yo;[BLcom/bytedance/sdk/component/lw/oa/yo/uef;)V
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->ab()Lcom/bytedance/sdk/component/lw/oa/yo/ivm;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/bytedance/sdk/component/lw/oa/yo/oa/uef;

    .line 6
    .line 7
    invoke-direct {v1}, Lcom/bytedance/sdk/component/lw/oa/yo/oa/uef;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v2, Lcom/bytedance/sdk/component/lw/oa/oa/moa$2;

    .line 11
    .line 12
    invoke-direct {v2, p0, p3, p1, p2}, Lcom/bytedance/sdk/component/lw/oa/oa/moa$2;-><init>(Lcom/bytedance/sdk/component/lw/oa/oa/moa;Lcom/bytedance/sdk/component/lw/oa/yo/uef;Lcom/bytedance/sdk/component/lw/oa/yo/yo;[B)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, p2, v0, v2}, Lcom/bytedance/sdk/component/lw/oa/yo/oa/uef;->uef([BLcom/bytedance/sdk/component/lw/oa/yo/ivm;Lcom/bytedance/sdk/component/lw/oa/yo/oa/uef$uef;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    const/16 p2, 0x7d0

    .line 21
    .line 22
    const-string v0, "decode gif error"

    .line 23
    .line 24
    invoke-virtual {p3, p2, v0, p1}, Lcom/bytedance/sdk/component/lw/oa/yo/uef;->uef(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/component/lw/oa/oa/moa;Lcom/bytedance/sdk/component/lw/oa/yo/yo;[BZLcom/bytedance/sdk/component/lw/oa/yo/uef;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/bytedance/sdk/component/lw/oa/oa/moa;->uef(Lcom/bytedance/sdk/component/lw/oa/yo/yo;[BZLcom/bytedance/sdk/component/lw/oa/yo/uef;)V

    return-void
.end method

.method private uef(Lcom/bytedance/sdk/component/lw/oa/yo/yo;[BLcom/bytedance/sdk/component/lw/oa/yo/uef;)V
    .locals 2

    .line 18
    :try_start_0
    new-instance v0, Lcom/bytedance/sdk/component/lw/oa/yo/oa/uef;

    invoke-direct {v0}, Lcom/bytedance/sdk/component/lw/oa/yo/oa/uef;-><init>()V

    .line 19
    new-instance v1, Lcom/bytedance/sdk/component/lw/oa/oa/moa$1;

    invoke-direct {v1, p0, p3, p1, p2}, Lcom/bytedance/sdk/component/lw/oa/oa/moa$1;-><init>(Lcom/bytedance/sdk/component/lw/oa/oa/moa;Lcom/bytedance/sdk/component/lw/oa/yo/uef;Lcom/bytedance/sdk/component/lw/oa/yo/yo;[B)V

    invoke-virtual {v0, p2, v1}, Lcom/bytedance/sdk/component/lw/oa/yo/oa/uef;->uef([BLcom/bytedance/sdk/component/lw/oa/yo/oa/uef$uef;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    const/16 p2, 0x7d0

    .line 20
    const-string v0, "decode webp animation error"

    invoke-virtual {p3, p2, v0, p1}, Lcom/bytedance/sdk/component/lw/oa/yo/uef;->uef(ILjava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method private uef(Lcom/bytedance/sdk/component/lw/oa/yo/yo;[BZLcom/bytedance/sdk/component/lw/oa/yo/uef;)V
    .locals 5

    .line 22
    const-string v0, "decode failed bitmap null"

    const/16 v1, 0x3ea

    :try_start_0
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->ab()Lcom/bytedance/sdk/component/lw/oa/yo/ivm;

    move-result-object v2

    .line 23
    invoke-virtual {v2, p1}, Lcom/bytedance/sdk/component/lw/oa/yo/ivm;->uef(Lcom/bytedance/sdk/component/lw/oa/yo/yo;)Lcom/bytedance/sdk/component/lw/oa/yo/oa/oa;

    move-result-object v3

    .line 24
    invoke-virtual {v3, p2, v2}, Lcom/bytedance/sdk/component/lw/oa/yo/oa/oa;->uef([BLcom/bytedance/sdk/component/lw/oa/yo/ivm;)Landroid/graphics/Bitmap;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 25
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->bcc()Ljava/lang/String;

    invoke-virtual {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->uef()Ljava/lang/String;

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getByteCount()I

    .line 26
    new-instance v0, Lcom/bytedance/sdk/component/lw/oa/yo/moa;

    invoke-direct {v0}, Lcom/bytedance/sdk/component/lw/oa/yo/moa;-><init>()V

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, p1, p2, v3, v4}, Lcom/bytedance/sdk/component/lw/oa/yo/moa;->uef(Lcom/bytedance/sdk/component/lw/oa/yo/yo;Ljava/lang/Object;Ljava/util/Map;Z)Lcom/bytedance/sdk/component/lw/oa/yo/moa;

    move-result-object v0

    invoke-virtual {p4, v0}, Lcom/bytedance/sdk/component/lw/oa/yo/uef;->uef(Lcom/bytedance/sdk/component/lw/dj;)V

    if-eqz p3, :cond_0

    .line 27
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->bs()Lcom/bytedance/sdk/component/lw/oa;

    move-result-object p3

    invoke-virtual {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->bcc()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p3, v2, v0, p2}, Lcom/bytedance/sdk/component/lw/oa/oa/moa;->uef(Lcom/bytedance/sdk/component/lw/oa;Lcom/bytedance/sdk/component/lw/oa/yo/ivm;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    return-void

    :catchall_0
    move-exception p2

    goto :goto_0

    :cond_0
    return-void

    .line 28
    :cond_1
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->bcc()Ljava/lang/String;

    invoke-virtual {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->uef()Ljava/lang/String;

    .line 29
    new-instance p2, Ljava/lang/Exception;

    invoke-direct {p2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-virtual {p4, v1, v0, p2}, Lcom/bytedance/sdk/component/lw/oa/yo/uef;->uef(ILjava/lang/String;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    .line 30
    :goto_0
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->bcc()Ljava/lang/String;

    invoke-virtual {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->uef()Ljava/lang/String;

    .line 31
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p3, "decode failed:"

    invoke-direct {p1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, v1, p1, p2}, Lcom/bytedance/sdk/component/lw/oa/yo/uef;->uef(ILjava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method private uef(Lcom/bytedance/sdk/component/lw/oa;Lcom/bytedance/sdk/component/lw/oa/yo/ivm;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 1

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 32
    invoke-interface {p1}, Lcom/bytedance/sdk/component/lw/oa;->lw()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 33
    invoke-virtual {p2, p1}, Lcom/bytedance/sdk/component/lw/oa/yo/ivm;->uef(Lcom/bytedance/sdk/component/lw/oa;)Lcom/bytedance/sdk/component/lw/bs;

    move-result-object p1

    invoke-interface {p1, p3, p4}, Lcom/bytedance/sdk/component/lw/uef;->uef(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method


# virtual methods
.method public uef()Ljava/lang/String;
    .locals 1

    .line 21
    const-string v0, "decode"

    return-object v0
.end method

.method public uef(Lcom/bytedance/sdk/component/lw/oa/yo/yo;Lcom/bytedance/sdk/component/lw/oib;Lcom/bytedance/sdk/component/lw/oa/yo/uef;)Z
    .locals 5

    .line 2
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->cq()[B

    move-result-object p2

    const/4 v0, 0x0

    if-nez p2, :cond_0

    .line 3
    new-instance p1, Ljava/lang/Exception;

    const-string p2, "imageData is empty"

    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    const/16 v1, 0x7d0

    invoke-virtual {p3, v1, p2, p1}, Lcom/bytedance/sdk/component/lw/oa/yo/uef;->uef(ILjava/lang/String;Ljava/lang/Throwable;)V

    return v0

    .line 4
    :cond_0
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->dj()I

    move-result v1

    .line 5
    array-length v2, p2

    invoke-virtual {p1, v2}, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->uef(I)V

    const/4 v2, 0x2

    const/16 v3, 0x3e9

    const/4 v4, 0x1

    if-eq v1, v2, :cond_5

    const/4 v2, 0x3

    if-eq v1, v2, :cond_4

    .line 6
    invoke-static {p2}, Lcom/bytedance/sdk/component/utils/ivm;->oa([B)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 7
    invoke-direct {p0, p1, p2, p3}, Lcom/bytedance/sdk/component/lw/oa/oa/moa;->oa(Lcom/bytedance/sdk/component/lw/oa/yo/yo;[BLcom/bytedance/sdk/component/lw/oa/yo/uef;)V

    goto :goto_0

    .line 8
    :cond_1
    invoke-static {p2, v0}, Lcom/bytedance/sdk/component/utils/dj;->uef([BI)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 9
    invoke-direct {p0, p1, p2, p3}, Lcom/bytedance/sdk/component/lw/oa/oa/moa;->uef(Lcom/bytedance/sdk/component/lw/oa/yo/yo;[BLcom/bytedance/sdk/component/lw/oa/yo/uef;)V

    goto :goto_0

    .line 10
    :cond_2
    invoke-static {p2}, Lcom/bytedance/sdk/component/utils/ivm;->uef([B)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 11
    invoke-direct {p0, p1, p2, v4, p3}, Lcom/bytedance/sdk/component/lw/oa/oa/moa;->uef(Lcom/bytedance/sdk/component/lw/oa/yo/yo;[BZLcom/bytedance/sdk/component/lw/oa/yo/uef;)V

    goto :goto_0

    .line 12
    :cond_3
    new-instance p1, Ljava/lang/Exception;

    const-string p2, "not supprot image type"

    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    const-string p2, "is not supprot image type"

    invoke-virtual {p3, v3, p2, p1}, Lcom/bytedance/sdk/component/lw/oa/yo/uef;->uef(ILjava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 13
    :cond_4
    new-instance v1, Lcom/bytedance/sdk/component/lw/oa/yo/moa;

    invoke-direct {v1}, Lcom/bytedance/sdk/component/lw/oa/yo/moa;-><init>()V

    const/4 v2, 0x0

    invoke-static {p2}, Lcom/bytedance/sdk/component/utils/ivm;->oa([B)Z

    move-result v3

    invoke-virtual {v1, p1, p2, v2, v3}, Lcom/bytedance/sdk/component/lw/oa/yo/moa;->uef(Lcom/bytedance/sdk/component/lw/oa/yo/yo;Ljava/lang/Object;Ljava/util/Map;Z)Lcom/bytedance/sdk/component/lw/oa/yo/moa;

    move-result-object p1

    invoke-virtual {p3, p1}, Lcom/bytedance/sdk/component/lw/oa/yo/uef;->uef(Lcom/bytedance/sdk/component/lw/dj;)V

    goto :goto_0

    .line 14
    :cond_5
    invoke-static {p2}, Lcom/bytedance/sdk/component/utils/ivm;->oa([B)Z

    move-result v1

    if-nez v1, :cond_6

    invoke-static {p2, v0}, Lcom/bytedance/sdk/component/utils/dj;->uef([BI)Z

    move-result v1

    if-eqz v1, :cond_7

    :cond_6
    move v4, v0

    .line 15
    :cond_7
    invoke-static {p2}, Lcom/bytedance/sdk/component/utils/ivm;->uef([B)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 16
    invoke-direct {p0, p1, p2, v4, p3}, Lcom/bytedance/sdk/component/lw/oa/oa/moa;->uef(Lcom/bytedance/sdk/component/lw/oa/yo/yo;[BZLcom/bytedance/sdk/component/lw/oa/yo/uef;)V

    goto :goto_0

    .line 17
    :cond_8
    new-instance p1, Ljava/lang/Exception;

    const-string p2, "not image format"

    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    const-string p2, "result type is bit but data not image"

    invoke-virtual {p3, v3, p2, p1}, Lcom/bytedance/sdk/component/lw/oa/yo/uef;->uef(ILjava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return v0
.end method
