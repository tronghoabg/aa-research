.class public final Lcom/bytedance/sdk/component/oa/uef/uef$uef;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/sdk/component/oa/uef/uef;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "uef"
.end annotation


# instance fields
.field uef:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public oa()Lcom/bytedance/sdk/component/oa/uef/uef;
    .locals 1

    .line 1
    new-instance v0, Lcom/bytedance/sdk/component/oa/uef/uef;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/bytedance/sdk/component/oa/uef/uef;-><init>(Lcom/bytedance/sdk/component/oa/uef/uef$uef;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public uef()Lcom/bytedance/sdk/component/oa/uef/uef$uef;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/bytedance/sdk/component/oa/uef/uef$uef;->uef:Z

    .line 3
    .line 4
    return-object p0
.end method
