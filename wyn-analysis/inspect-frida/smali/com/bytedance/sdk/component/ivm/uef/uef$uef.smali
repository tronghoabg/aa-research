.class public Lcom/bytedance/sdk/component/ivm/uef/uef$uef;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/sdk/component/ivm/uef/uef;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "uef"
.end annotation


# instance fields
.field private bcc:Z

.field private cz:I

.field private dj:J

.field private ivm:Lcom/bytedance/sdk/component/ivm/uef/lw;

.field private lw:Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;

.field private moa:Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;

.field private oa:Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;

.field private uef:Lcom/bytedance/sdk/component/ivm/uef/oa/yo;

.field private xs:Lcom/bytedance/sdk/component/ivm/uef/uef/lw;

.field private yo:Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;

.field private zjm:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x1388

    .line 5
    .line 6
    iput v0, p0, Lcom/bytedance/sdk/component/ivm/uef/uef$uef;->cz:I

    .line 7
    .line 8
    const/16 v0, 0xa

    .line 9
    .line 10
    iput v0, p0, Lcom/bytedance/sdk/component/ivm/uef/uef$uef;->zjm:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public oa(I)Lcom/bytedance/sdk/component/ivm/uef/uef$uef;
    .locals 0

    .line 2
    iput p1, p0, Lcom/bytedance/sdk/component/ivm/uef/uef$uef;->zjm:I

    return-object p0
.end method

.method public oa(Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;)Lcom/bytedance/sdk/component/ivm/uef/uef$uef;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/component/ivm/uef/uef$uef;->yo:Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;

    return-object p0
.end method

.method public uef(I)Lcom/bytedance/sdk/component/ivm/uef/uef$uef;
    .locals 0

    .line 6
    iput p1, p0, Lcom/bytedance/sdk/component/ivm/uef/uef$uef;->cz:I

    return-object p0
.end method

.method public uef(J)Lcom/bytedance/sdk/component/ivm/uef/uef$uef;
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/bytedance/sdk/component/ivm/uef/uef$uef;->dj:J

    return-object p0
.end method

.method public uef(Lcom/bytedance/sdk/component/ivm/uef/lw;)Lcom/bytedance/sdk/component/ivm/uef/uef$uef;
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/bytedance/sdk/component/ivm/uef/uef$uef;->ivm:Lcom/bytedance/sdk/component/ivm/uef/lw;

    return-object p0
.end method

.method public uef(Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;)Lcom/bytedance/sdk/component/ivm/uef/uef$uef;
    .locals 0

    .line 4
    iput-object p1, p0, Lcom/bytedance/sdk/component/ivm/uef/uef$uef;->oa:Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;

    return-object p0
.end method

.method public uef(Lcom/bytedance/sdk/component/ivm/uef/oa/yo;)Lcom/bytedance/sdk/component/ivm/uef/uef$uef;
    .locals 0

    .line 5
    iput-object p1, p0, Lcom/bytedance/sdk/component/ivm/uef/uef$uef;->uef:Lcom/bytedance/sdk/component/ivm/uef/oa/yo;

    return-object p0
.end method

.method public uef(Lcom/bytedance/sdk/component/ivm/uef/uef/lw;)Lcom/bytedance/sdk/component/ivm/uef/uef$uef;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/bytedance/sdk/component/ivm/uef/uef$uef;->xs:Lcom/bytedance/sdk/component/ivm/uef/uef/lw;

    return-object p0
.end method

.method public uef()Lcom/bytedance/sdk/component/ivm/uef/uef;
    .locals 3

    .line 7
    new-instance v0, Lcom/bytedance/sdk/component/ivm/uef/uef;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/bytedance/sdk/component/ivm/uef/uef;-><init>(Lcom/bytedance/sdk/component/ivm/uef/uef$1;)V

    .line 8
    iget-object v1, p0, Lcom/bytedance/sdk/component/ivm/uef/uef$uef;->uef:Lcom/bytedance/sdk/component/ivm/uef/oa/yo;

    invoke-static {v0, v1}, Lcom/bytedance/sdk/component/ivm/uef/uef;->uef(Lcom/bytedance/sdk/component/ivm/uef/uef;Lcom/bytedance/sdk/component/ivm/uef/oa/yo;)Lcom/bytedance/sdk/component/ivm/uef/oa/yo;

    .line 9
    iget-object v1, p0, Lcom/bytedance/sdk/component/ivm/uef/uef$uef;->oa:Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;

    invoke-static {v0, v1}, Lcom/bytedance/sdk/component/ivm/uef/uef;->uef(Lcom/bytedance/sdk/component/ivm/uef/uef;Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;)Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;

    .line 10
    iget-object v1, p0, Lcom/bytedance/sdk/component/ivm/uef/uef$uef;->yo:Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;

    invoke-static {v0, v1}, Lcom/bytedance/sdk/component/ivm/uef/uef;->oa(Lcom/bytedance/sdk/component/ivm/uef/uef;Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;)Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;

    .line 11
    iget-object v1, p0, Lcom/bytedance/sdk/component/ivm/uef/uef$uef;->moa:Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;

    invoke-static {v0, v1}, Lcom/bytedance/sdk/component/ivm/uef/uef;->yo(Lcom/bytedance/sdk/component/ivm/uef/uef;Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;)Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;

    .line 12
    iget-object v1, p0, Lcom/bytedance/sdk/component/ivm/uef/uef$uef;->lw:Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;

    invoke-static {v0, v1}, Lcom/bytedance/sdk/component/ivm/uef/uef;->moa(Lcom/bytedance/sdk/component/ivm/uef/uef;Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;)Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;

    .line 13
    iget-object v1, p0, Lcom/bytedance/sdk/component/ivm/uef/uef$uef;->ivm:Lcom/bytedance/sdk/component/ivm/uef/lw;

    invoke-static {v0, v1}, Lcom/bytedance/sdk/component/ivm/uef/uef;->uef(Lcom/bytedance/sdk/component/ivm/uef/uef;Lcom/bytedance/sdk/component/ivm/uef/lw;)Lcom/bytedance/sdk/component/ivm/uef/lw;

    .line 14
    iget-object v1, p0, Lcom/bytedance/sdk/component/ivm/uef/uef$uef;->xs:Lcom/bytedance/sdk/component/ivm/uef/uef/lw;

    invoke-static {v0, v1}, Lcom/bytedance/sdk/component/ivm/uef/uef;->uef(Lcom/bytedance/sdk/component/ivm/uef/uef;Lcom/bytedance/sdk/component/ivm/uef/uef/lw;)Lcom/bytedance/sdk/component/ivm/uef/uef/lw;

    .line 15
    iget-boolean v1, p0, Lcom/bytedance/sdk/component/ivm/uef/uef$uef;->bcc:Z

    invoke-static {v0, v1}, Lcom/bytedance/sdk/component/ivm/uef/uef;->uef(Lcom/bytedance/sdk/component/ivm/uef/uef;Z)Z

    .line 16
    iget v1, p0, Lcom/bytedance/sdk/component/ivm/uef/uef$uef;->zjm:I

    invoke-static {v0, v1}, Lcom/bytedance/sdk/component/ivm/uef/uef;->uef(Lcom/bytedance/sdk/component/ivm/uef/uef;I)I

    .line 17
    iget v1, p0, Lcom/bytedance/sdk/component/ivm/uef/uef$uef;->cz:I

    invoke-static {v0, v1}, Lcom/bytedance/sdk/component/ivm/uef/uef;->oa(Lcom/bytedance/sdk/component/ivm/uef/uef;I)I

    .line 18
    iget-wide v1, p0, Lcom/bytedance/sdk/component/ivm/uef/uef$uef;->dj:J

    invoke-static {v0, v1, v2}, Lcom/bytedance/sdk/component/ivm/uef/uef;->uef(Lcom/bytedance/sdk/component/ivm/uef/uef;J)J

    return-object v0
.end method

.method public yo(Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;)Lcom/bytedance/sdk/component/ivm/uef/uef$uef;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/component/ivm/uef/uef$uef;->moa:Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;

    .line 2
    .line 3
    return-object p0
.end method
