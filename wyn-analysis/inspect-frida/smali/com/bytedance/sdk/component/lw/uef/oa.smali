.class public Lcom/bytedance/sdk/component/lw/uef/oa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/component/lw/lw;


# instance fields
.field private moa:Lcom/bytedance/sdk/component/lw/dz;

.field private oa:Z

.field private uef:Ljava/lang/String;

.field private yo:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;ZZLcom/bytedance/sdk/component/lw/dz;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bytedance/sdk/component/lw/uef/oa;->uef:Ljava/lang/String;

    .line 5
    .line 6
    iput-boolean p2, p0, Lcom/bytedance/sdk/component/lw/uef/oa;->oa:Z

    .line 7
    .line 8
    iput-boolean p3, p0, Lcom/bytedance/sdk/component/lw/uef/oa;->yo:Z

    .line 9
    .line 10
    iput-object p4, p0, Lcom/bytedance/sdk/component/lw/uef/oa;->moa:Lcom/bytedance/sdk/component/lw/dz;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public oa()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/component/lw/uef/oa;->oa:Z

    .line 2
    .line 3
    return v0
.end method

.method public uef()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/lw/uef/oa;->uef:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public yo()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/component/lw/uef/oa;->yo:Z

    .line 2
    .line 3
    return v0
.end method
