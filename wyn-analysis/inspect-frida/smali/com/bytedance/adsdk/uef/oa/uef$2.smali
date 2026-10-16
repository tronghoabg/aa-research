.class Lcom/bytedance/adsdk/uef/oa/uef$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/adsdk/uef/oa/yo/uef;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/adsdk/uef/oa/uef;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic oa:Lcom/bytedance/adsdk/uef/oa/yo/uef;

.field final synthetic uef:Lcom/bytedance/adsdk/uef/oa/yo/uef/ivm;


# direct methods
.method public constructor <init>(Lcom/bytedance/adsdk/uef/oa/yo/uef/ivm;Lcom/bytedance/adsdk/uef/oa/yo/uef;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/bytedance/adsdk/uef/oa/uef$2;->uef:Lcom/bytedance/adsdk/uef/oa/yo/uef/ivm;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/bytedance/adsdk/uef/oa/uef$2;->oa:Lcom/bytedance/adsdk/uef/oa/yo/uef;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public uef(Ljava/lang/String;ILjava/util/Deque;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/Deque<",
            "Lcom/bytedance/adsdk/uef/oa/oa/uef;",
            ">;)I"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/uef/oa/uef$2;->uef:Lcom/bytedance/adsdk/uef/oa/yo/uef/ivm;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/bytedance/adsdk/uef/oa/uef$2;->oa:Lcom/bytedance/adsdk/uef/oa/yo/uef;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3, v1}, Lcom/bytedance/adsdk/uef/oa/yo/uef/ivm;->uef(Ljava/lang/String;ILjava/util/Deque;Lcom/bytedance/adsdk/uef/oa/yo/uef;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method
