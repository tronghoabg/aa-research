.class Lcom/bytedance/sdk/component/lw/oa/oa/yo$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/component/lw/oa/oa/yo;->oa(Lcom/bytedance/sdk/component/lw/oa;Lcom/bytedance/sdk/component/lw/oa/yo/ivm;Ljava/lang/String;[B)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic lw:Lcom/bytedance/sdk/component/lw/oa/oa/yo;

.field final synthetic moa:[B

.field final synthetic oa:Lcom/bytedance/sdk/component/lw/oa;

.field final synthetic uef:Lcom/bytedance/sdk/component/lw/oa/yo/ivm;

.field final synthetic yo:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/component/lw/oa/oa/yo;Lcom/bytedance/sdk/component/lw/oa/yo/ivm;Lcom/bytedance/sdk/component/lw/oa;Ljava/lang/String;[B)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/component/lw/oa/oa/yo$1;->lw:Lcom/bytedance/sdk/component/lw/oa/oa/yo;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/bytedance/sdk/component/lw/oa/oa/yo$1;->uef:Lcom/bytedance/sdk/component/lw/oa/yo/ivm;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/bytedance/sdk/component/lw/oa/oa/yo$1;->oa:Lcom/bytedance/sdk/component/lw/oa;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/bytedance/sdk/component/lw/oa/oa/yo$1;->yo:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/bytedance/sdk/component/lw/oa/oa/yo$1;->moa:[B

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/oa/yo$1;->uef:Lcom/bytedance/sdk/component/lw/oa/yo/ivm;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/bytedance/sdk/component/lw/oa/oa/yo$1;->oa:Lcom/bytedance/sdk/component/lw/oa;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/component/lw/oa/yo/ivm;->yo(Lcom/bytedance/sdk/component/lw/oa;)Lcom/bytedance/sdk/component/lw/yo;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lcom/bytedance/sdk/component/lw/oa/oa/yo$1;->yo:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v2, p0, Lcom/bytedance/sdk/component/lw/oa/oa/yo$1;->moa:[B

    .line 12
    .line 13
    invoke-interface {v0, v1, v2}, Lcom/bytedance/sdk/component/lw/uef;->uef(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    return-void
.end method
