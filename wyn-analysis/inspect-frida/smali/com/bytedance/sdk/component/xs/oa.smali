.class public Lcom/bytedance/sdk/component/xs/oa;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private bcc:Ljava/io/File;

.field private final cz:Z

.field final ivm:J

.field final lw:J

.field final moa:Ljava/lang/String;

.field final oa:Ljava/lang/String;

.field final uef:I

.field xs:Lcom/bytedance/sdk/component/oa/uef/zjm;

.field final yo:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private zjm:[B


# direct methods
.method public constructor <init>(ZILjava/lang/String;Ljava/util/Map;Ljava/lang/String;JJ)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZI",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "JJ)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/bytedance/sdk/component/xs/oa;->bcc:Ljava/io/File;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/bytedance/sdk/component/xs/oa;->zjm:[B

    .line 8
    .line 9
    iput-boolean p1, p0, Lcom/bytedance/sdk/component/xs/oa;->cz:Z

    .line 10
    .line 11
    iput p2, p0, Lcom/bytedance/sdk/component/xs/oa;->uef:I

    .line 12
    .line 13
    iput-object p3, p0, Lcom/bytedance/sdk/component/xs/oa;->oa:Ljava/lang/String;

    .line 14
    .line 15
    iput-object p4, p0, Lcom/bytedance/sdk/component/xs/oa;->yo:Ljava/util/Map;

    .line 16
    .line 17
    iput-object p5, p0, Lcom/bytedance/sdk/component/xs/oa;->moa:Ljava/lang/String;

    .line 18
    .line 19
    iput-wide p6, p0, Lcom/bytedance/sdk/component/xs/oa;->lw:J

    .line 20
    .line 21
    iput-wide p8, p0, Lcom/bytedance/sdk/component/xs/oa;->ivm:J

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public ivm()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/component/xs/oa;->cz:Z

    .line 2
    .line 3
    return v0
.end method

.method public lw()Ljava/io/File;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/xs/oa;->bcc:Ljava/io/File;

    .line 2
    .line 3
    return-object v0
.end method

.method public moa()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/xs/oa;->moa:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public oa()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/xs/oa;->oa:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public uef()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/component/xs/oa;->uef:I

    return v0
.end method

.method public uef(Lcom/bytedance/sdk/component/oa/uef/zjm;)V
    .locals 0

    .line 4
    iput-object p1, p0, Lcom/bytedance/sdk/component/xs/oa;->xs:Lcom/bytedance/sdk/component/oa/uef/zjm;

    return-void
.end method

.method public uef(Ljava/io/File;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/bytedance/sdk/component/xs/oa;->bcc:Ljava/io/File;

    return-void
.end method

.method public uef([B)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/bytedance/sdk/component/xs/oa;->zjm:[B

    return-void
.end method

.method public xs()Lcom/bytedance/sdk/component/oa/uef/zjm;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/xs/oa;->xs:Lcom/bytedance/sdk/component/oa/uef/zjm;

    .line 2
    .line 3
    return-object v0
.end method

.method public yo()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/xs/oa;->yo:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method
