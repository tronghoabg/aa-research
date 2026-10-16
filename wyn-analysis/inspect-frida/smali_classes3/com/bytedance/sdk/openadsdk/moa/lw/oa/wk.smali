.class public Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;
    }
.end annotation


# instance fields
.field private lw:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

.field private moa:Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;

.field private oa:Ljava/lang/String;

.field private uef:J

.field private yo:I


# direct methods
.method public constructor <init>(JLjava/lang/String;ILcom/bykv/vk/openvk/uef/uef/uef/yo/yo;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk;->uef:J

    .line 5
    .line 6
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk;->oa:Ljava/lang/String;

    .line 7
    .line 8
    iput p4, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk;->yo:I

    .line 9
    .line 10
    iput-object p5, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk;->moa:Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;

    .line 11
    .line 12
    iput-object p6, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk;->lw:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public lw()Lcom/bytedance/sdk/openadsdk/core/model/gzw;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk;->lw:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 2
    .line 3
    return-object v0
.end method

.method public moa()Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk;->moa:Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;

    .line 2
    .line 3
    return-object v0
.end method

.method public oa()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk;->oa:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public uef()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk;->uef:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public yo()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk;->yo:I

    .line 2
    .line 3
    return v0
.end method
