.class public Lcom/bytedance/sdk/component/lw/oa/yo/uef/oa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/component/lw/oa;
.implements Ljava/lang/Cloneable;


# static fields
.field private static volatile cz:Lcom/bytedance/sdk/component/lw/oa;


# instance fields
.field private bcc:Ljava/io/File;

.field private ivm:Z

.field private lw:Z

.field private moa:I

.field private oa:I

.field private uef:J

.field private xs:Z

.field private yo:I


# direct methods
.method public constructor <init>(IIIJLjava/io/File;)V
    .locals 11

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p2, :cond_0

    move v8, v1

    goto :goto_0

    :cond_0
    move v8, v0

    :goto_0
    const-wide/16 v2, 0x0

    cmp-long v2, p4, v2

    if-eqz v2, :cond_1

    move v9, v1

    :goto_1
    move-object v2, p0

    move v3, p1

    move v4, p2

    move v5, p3

    move-wide v6, p4

    move-object/from16 v10, p6

    goto :goto_2

    :cond_1
    move v9, v0

    goto :goto_1

    .line 1
    :goto_2
    invoke-direct/range {v2 .. v10}, Lcom/bytedance/sdk/component/lw/oa/yo/uef/oa;-><init>(IIIJZZLjava/io/File;)V

    return-void
.end method

.method public constructor <init>(IIIJZZLjava/io/File;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p4, p0, Lcom/bytedance/sdk/component/lw/oa/yo/uef/oa;->uef:J

    .line 4
    iput p1, p0, Lcom/bytedance/sdk/component/lw/oa/yo/uef/oa;->oa:I

    .line 5
    iput p2, p0, Lcom/bytedance/sdk/component/lw/oa/yo/uef/oa;->yo:I

    .line 6
    iput p3, p0, Lcom/bytedance/sdk/component/lw/oa/yo/uef/oa;->moa:I

    .line 7
    iput-boolean p6, p0, Lcom/bytedance/sdk/component/lw/oa/yo/uef/oa;->lw:Z

    .line 8
    iput-boolean p7, p0, Lcom/bytedance/sdk/component/lw/oa/yo/uef/oa;->ivm:Z

    .line 9
    iput-object p8, p0, Lcom/bytedance/sdk/component/lw/oa/yo/uef/oa;->bcc:Ljava/io/File;

    if-eqz p3, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 10
    :goto_0
    iput-boolean p1, p0, Lcom/bytedance/sdk/component/lw/oa/yo/uef/oa;->xs:Z

    return-void
.end method

.method public static cz()Lcom/bytedance/sdk/component/lw/oa;
    .locals 1

    .line 1
    sget-object v0, Lcom/bytedance/sdk/component/lw/oa/yo/uef/oa;->cz:Lcom/bytedance/sdk/component/lw/oa;

    .line 2
    .line 3
    return-object v0
.end method

.method public static uef(Ljava/io/File;)Lcom/bytedance/sdk/component/lw/oa;
    .locals 11

    .line 5
    invoke-virtual {p0}, Ljava/io/File;->mkdirs()Z

    .line 6
    sget-object v0, Lcom/bytedance/sdk/component/lw/oa/yo/uef/oa;->cz:Lcom/bytedance/sdk/component/lw/oa;

    if-nez v0, :cond_0

    const/16 v0, 0xa

    const/16 v1, 0xe

    const-wide/16 v2, 0x14

    :goto_0
    move v6, v0

    move v7, v1

    move-wide v8, v2

    goto :goto_1

    .line 7
    :cond_0
    sget-object v0, Lcom/bytedance/sdk/component/lw/oa/yo/uef/oa;->cz:Lcom/bytedance/sdk/component/lw/oa;

    invoke-interface {v0}, Lcom/bytedance/sdk/component/lw/oa;->uef()J

    move-result-wide v2

    .line 8
    sget-object v0, Lcom/bytedance/sdk/component/lw/oa/yo/uef/oa;->cz:Lcom/bytedance/sdk/component/lw/oa;

    invoke-interface {v0}, Lcom/bytedance/sdk/component/lw/oa;->yo()I

    move-result v0

    .line 9
    sget-object v1, Lcom/bytedance/sdk/component/lw/oa/yo/uef/oa;->cz:Lcom/bytedance/sdk/component/lw/oa;

    invoke-interface {v1}, Lcom/bytedance/sdk/component/lw/oa;->moa()I

    move-result v1

    goto :goto_0

    .line 10
    :goto_1
    new-instance v4, Lcom/bytedance/sdk/component/lw/oa/yo/uef/oa;

    const/4 v5, 0x0

    move-object v10, p0

    invoke-direct/range {v4 .. v10}, Lcom/bytedance/sdk/component/lw/oa/yo/uef/oa;-><init>(IIIJLjava/io/File;)V

    return-object v4
.end method

.method public static uef(Landroid/content/Context;Lcom/bytedance/sdk/component/lw/oa;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 2
    sput-object p1, Lcom/bytedance/sdk/component/lw/oa/yo/uef/oa;->cz:Lcom/bytedance/sdk/component/lw/oa;

    return-void

    .line 3
    :cond_0
    new-instance p1, Ljava/io/File;

    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p0

    const-string v0, "image"

    invoke-direct {p1, p0, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 4
    invoke-static {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/uef/oa;->uef(Ljava/io/File;)Lcom/bytedance/sdk/component/lw/oa;

    move-result-object p0

    sput-object p0, Lcom/bytedance/sdk/component/lw/oa/yo/uef/oa;->cz:Lcom/bytedance/sdk/component/lw/oa;

    return-void
.end method


# virtual methods
.method public bcc()Ljava/io/File;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/uef/oa;->bcc:Ljava/io/File;

    .line 2
    .line 3
    return-object v0
.end method

.method public ivm()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/uef/oa;->xs:Z

    .line 2
    .line 3
    return v0
.end method

.method public lw()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/uef/oa;->lw:Z

    .line 2
    .line 3
    return v0
.end method

.method public moa()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/uef/oa;->moa:I

    .line 2
    .line 3
    return v0
.end method

.method public oa()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/uef/oa;->oa:I

    .line 2
    .line 3
    return v0
.end method

.method public uef()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/uef/oa;->uef:J

    return-wide v0
.end method

.method public xs()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/uef/oa;->ivm:Z

    .line 2
    .line 3
    return v0
.end method

.method public yo()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/uef/oa;->yo:I

    .line 2
    .line 3
    return v0
.end method
