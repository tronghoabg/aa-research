.class public Lcom/bytedance/sdk/component/lw/uef/yo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/component/lw/ivm;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/bytedance/sdk/component/lw/ivm;"
    }
.end annotation


# instance fields
.field private lw:Lcom/bytedance/sdk/component/lw/xs;

.field private moa:Ljava/lang/String;

.field private oa:I

.field uef:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private yo:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ILjava/lang/Object;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITT;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/bytedance/sdk/component/lw/uef/yo;->oa:I

    .line 3
    iput-object p2, p0, Lcom/bytedance/sdk/component/lw/uef/yo;->yo:Ljava/lang/Object;

    .line 4
    iput-object p3, p0, Lcom/bytedance/sdk/component/lw/uef/yo;->moa:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(ILjava/lang/Object;Ljava/lang/String;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITT;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 5
    invoke-direct {p0, p1, p2, p3}, Lcom/bytedance/sdk/component/lw/uef/yo;-><init>(ILjava/lang/Object;Ljava/lang/String;)V

    .line 6
    iput-object p4, p0, Lcom/bytedance/sdk/component/lw/uef/yo;->uef:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public oa()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/lw/uef/yo;->yo:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public uef()I
    .locals 1

    .line 2
    iget v0, p0, Lcom/bytedance/sdk/component/lw/uef/yo;->oa:I

    return v0
.end method

.method public uef(Lcom/bytedance/sdk/component/lw/xs;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/component/lw/uef/yo;->lw:Lcom/bytedance/sdk/component/lw/xs;

    return-void
.end method

.method public yo()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/lw/uef/yo;->moa:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
