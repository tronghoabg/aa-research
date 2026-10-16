.class public Lcom/bytedance/sdk/component/ivm/uef/moa/uef/uef;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/component/ivm/uef/moa/uef;


# instance fields
.field private bcc:Ljava/lang/String;

.field private cz:B

.field private dj:I

.field private ivm:J

.field private lw:J

.field private moa:B

.field private oa:Lcom/bytedance/sdk/component/ivm/uef/moa/uef/oa;

.field protected uef:Lorg/json/JSONObject;

.field private xs:J

.field private yo:B

.field private zjm:Ljava/lang/String;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/bytedance/sdk/component/ivm/uef/moa/uef/oa;)V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/bytedance/sdk/component/ivm/uef/moa/uef/uef;->bcc:Ljava/lang/String;

    .line 6
    iput-object p2, p0, Lcom/bytedance/sdk/component/ivm/uef/moa/uef/uef;->oa:Lcom/bytedance/sdk/component/ivm/uef/moa/uef/oa;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/bytedance/sdk/component/ivm/uef/moa/uef/uef;->bcc:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/bytedance/sdk/component/ivm/uef/moa/uef/uef;->uef:Lorg/json/JSONObject;

    return-void
.end method


# virtual methods
.method public bcc()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/bytedance/sdk/component/ivm/uef/moa/uef/uef;->ivm:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public cz()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/component/ivm/uef/moa/uef/uef;->dj:I

    .line 2
    .line 3
    return v0
.end method

.method public declared-synchronized ivm()Lorg/json/JSONObject;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/sdk/component/ivm/uef/moa/uef/uef;->uef:Lorg/json/JSONObject;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/bytedance/sdk/component/ivm/uef/moa/uef/uef;->oa:Lcom/bytedance/sdk/component/ivm/uef/moa/uef/oa;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/ivm/uef/moa/uef/uef;->zjm()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-interface {v0, v1}, Lcom/bytedance/sdk/component/ivm/uef/moa/uef/oa;->uef(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Lcom/bytedance/sdk/component/ivm/uef/moa/uef/uef;->uef:Lorg/json/JSONObject;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/bytedance/sdk/component/ivm/uef/moa/uef/uef;->uef:Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    monitor-exit p0

    .line 26
    return-object v0

    .line 27
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    throw v0
.end method

.method public lw()B
    .locals 1

    .line 1
    iget-byte v0, p0, Lcom/bytedance/sdk/component/ivm/uef/moa/uef/uef;->moa:B

    .line 2
    .line 3
    return v0
.end method

.method public moa()B
    .locals 1

    .line 1
    iget-byte v0, p0, Lcom/bytedance/sdk/component/ivm/uef/moa/uef/uef;->yo:B

    .line 2
    .line 3
    return v0
.end method

.method public oa()B
    .locals 1

    .line 1
    iget-byte v0, p0, Lcom/bytedance/sdk/component/ivm/uef/moa/uef/uef;->cz:B

    return v0
.end method

.method public oa(B)V
    .locals 0

    .line 2
    iput-byte p1, p0, Lcom/bytedance/sdk/component/ivm/uef/moa/uef/uef;->yo:B

    return-void
.end method

.method public oa(J)V
    .locals 0

    .line 3
    iput-wide p1, p0, Lcom/bytedance/sdk/component/ivm/uef/moa/uef/uef;->ivm:J

    return-void
.end method

.method public uef()Lcom/bytedance/sdk/component/ivm/uef/moa/uef/oa;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/ivm/uef/moa/uef/uef;->oa:Lcom/bytedance/sdk/component/ivm/uef/moa/uef/oa;

    return-object v0
.end method

.method public uef(B)V
    .locals 0

    .line 2
    iput-byte p1, p0, Lcom/bytedance/sdk/component/ivm/uef/moa/uef/uef;->cz:B

    return-void
.end method

.method public uef(I)V
    .locals 0

    .line 4
    iput p1, p0, Lcom/bytedance/sdk/component/ivm/uef/moa/uef/uef;->dj:I

    return-void
.end method

.method public uef(J)V
    .locals 0

    .line 3
    iput-wide p1, p0, Lcom/bytedance/sdk/component/ivm/uef/moa/uef/uef;->lw:J

    return-void
.end method

.method public xs()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/bytedance/sdk/component/ivm/uef/moa/uef/uef;->lw:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public yo()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/ivm/uef/moa/uef/uef;->bcc:Ljava/lang/String;

    return-object v0
.end method

.method public yo(B)V
    .locals 0

    .line 3
    iput-byte p1, p0, Lcom/bytedance/sdk/component/ivm/uef/moa/uef/uef;->moa:B

    return-void
.end method

.method public yo(J)V
    .locals 0

    .line 2
    iput-wide p1, p0, Lcom/bytedance/sdk/component/ivm/uef/moa/uef/uef;->xs:J

    return-void
.end method

.method public zjm()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/ivm/uef/moa/uef/uef;->zjm:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
