.class Lcom/bytedance/adsdk/ugeno/bcc/yo$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/adsdk/ugeno/bcc/yo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic uef:Lcom/bytedance/adsdk/ugeno/bcc/yo;


# direct methods
.method public constructor <init>(Lcom/bytedance/adsdk/ugeno/bcc/yo;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/adsdk/ugeno/bcc/yo$3;->uef:Lcom/bytedance/adsdk/ugeno/bcc/yo;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/bcc/yo$3;->uef:Lcom/bytedance/adsdk/ugeno/bcc/yo;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Lcom/bytedance/adsdk/ugeno/bcc/yo;->setScrollState(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/bcc/yo$3;->uef:Lcom/bytedance/adsdk/ugeno/bcc/yo;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/bytedance/adsdk/ugeno/bcc/yo;->yo()V

    .line 10
    .line 11
    .line 12
    return-void
.end method
