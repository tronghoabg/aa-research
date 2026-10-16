.class public Lcom/bytedance/sdk/component/ivm/uef/uef;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/sdk/component/ivm/uef/uef$uef;
    }
.end annotation


# instance fields
.field private bcc:Lcom/bytedance/sdk/component/ivm/uef/lw;

.field private cz:Z

.field private dj:I

.field private ivm:Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;

.field private lw:Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;

.field private moa:Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;

.field private oa:Lcom/bytedance/sdk/component/ivm/uef/oa/yo;

.field private uef:Lcom/bytedance/sdk/component/ivm/uef/uef/lw;

.field private wrv:J

.field private xs:Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;

.field private yo:Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;

.field private zjm:I


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xc8

    .line 3
    iput v0, p0, Lcom/bytedance/sdk/component/ivm/uef/uef;->zjm:I

    const/16 v0, 0xa

    .line 4
    iput v0, p0, Lcom/bytedance/sdk/component/ivm/uef/uef;->dj:I

    return-void
.end method

.method public synthetic constructor <init>(Lcom/bytedance/sdk/component/ivm/uef/uef$1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/bytedance/sdk/component/ivm/uef/uef;-><init>()V

    return-void
.end method

.method public static synthetic moa(Lcom/bytedance/sdk/component/ivm/uef/uef;Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;)Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/component/ivm/uef/uef;->ivm:Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;

    return-object p1
.end method

.method public static synthetic oa(Lcom/bytedance/sdk/component/ivm/uef/uef;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/bytedance/sdk/component/ivm/uef/uef;->zjm:I

    return p1
.end method

.method public static synthetic oa(Lcom/bytedance/sdk/component/ivm/uef/uef;Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;)Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/bytedance/sdk/component/ivm/uef/uef;->moa:Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;

    return-object p1
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/component/ivm/uef/uef;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/bytedance/sdk/component/ivm/uef/uef;->dj:I

    return p1
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/component/ivm/uef/uef;J)J
    .locals 0

    .line 2
    iput-wide p1, p0, Lcom/bytedance/sdk/component/ivm/uef/uef;->wrv:J

    return-wide p1
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/component/ivm/uef/uef;Lcom/bytedance/sdk/component/ivm/uef/lw;)Lcom/bytedance/sdk/component/ivm/uef/lw;
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/bytedance/sdk/component/ivm/uef/uef;->bcc:Lcom/bytedance/sdk/component/ivm/uef/lw;

    return-object p1
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/component/ivm/uef/uef;Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;)Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;
    .locals 0

    .line 4
    iput-object p1, p0, Lcom/bytedance/sdk/component/ivm/uef/uef;->yo:Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;

    return-object p1
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/component/ivm/uef/uef;Lcom/bytedance/sdk/component/ivm/uef/oa/yo;)Lcom/bytedance/sdk/component/ivm/uef/oa/yo;
    .locals 0

    .line 5
    iput-object p1, p0, Lcom/bytedance/sdk/component/ivm/uef/uef;->oa:Lcom/bytedance/sdk/component/ivm/uef/oa/yo;

    return-object p1
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/component/ivm/uef/uef;Lcom/bytedance/sdk/component/ivm/uef/uef/lw;)Lcom/bytedance/sdk/component/ivm/uef/uef/lw;
    .locals 0

    .line 6
    iput-object p1, p0, Lcom/bytedance/sdk/component/ivm/uef/uef;->uef:Lcom/bytedance/sdk/component/ivm/uef/uef/lw;

    return-object p1
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/component/ivm/uef/uef;Z)Z
    .locals 0

    .line 7
    iput-boolean p1, p0, Lcom/bytedance/sdk/component/ivm/uef/uef;->cz:Z

    return p1
.end method

.method public static synthetic yo(Lcom/bytedance/sdk/component/ivm/uef/uef;Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;)Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/component/ivm/uef/uef;->lw:Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;

    return-object p1
.end method


# virtual methods
.method public bcc()Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/ivm/uef/uef;->moa:Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;

    .line 2
    .line 3
    return-object v0
.end method

.method public cz()Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/ivm/uef/uef;->lw:Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;

    .line 2
    .line 3
    return-object v0
.end method

.method public dj()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/component/ivm/uef/uef;->zjm:I

    .line 2
    .line 3
    return v0
.end method

.method public ivm()Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/ivm/uef/uef;->xs:Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;

    .line 2
    .line 3
    return-object v0
.end method

.method public lw()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/bytedance/sdk/component/ivm/uef/uef;->wrv:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public moa()Lcom/bytedance/sdk/component/ivm/uef/lw;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/component/ivm/uef/uef;->bcc:Lcom/bytedance/sdk/component/ivm/uef/lw;

    return-object v0
.end method

.method public oa()Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/component/ivm/uef/uef;->ivm:Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;

    return-object v0
.end method

.method public uef()Lcom/bytedance/sdk/component/ivm/uef/uef/lw;
    .locals 1

    .line 8
    iget-object v0, p0, Lcom/bytedance/sdk/component/ivm/uef/uef;->uef:Lcom/bytedance/sdk/component/ivm/uef/uef/lw;

    return-object v0
.end method

.method public wrv()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/component/ivm/uef/uef;->dj:I

    .line 2
    .line 3
    return v0
.end method

.method public xs()Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/ivm/uef/uef;->yo:Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;

    .line 2
    .line 3
    return-object v0
.end method

.method public yo()Z
    .locals 1

    .line 2
    iget-boolean v0, p0, Lcom/bytedance/sdk/component/ivm/uef/uef;->cz:Z

    return v0
.end method

.method public zjm()Lcom/bytedance/sdk/component/ivm/uef/oa/yo;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/ivm/uef/uef;->oa:Lcom/bytedance/sdk/component/ivm/uef/oa/yo;

    .line 2
    .line 3
    return-object v0
.end method
