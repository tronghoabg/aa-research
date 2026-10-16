.class public abstract Lcom/bytedance/sdk/component/oa/uef/dj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/sdk/component/oa/uef/dj$uef;
    }
.end annotation


# instance fields
.field public final bcc:Lcom/bytedance/sdk/component/xs/uef$oa;

.field public ivm:J

.field public lw:Ljava/util/concurrent/TimeUnit;

.field public moa:J

.field public oa:J

.field public uef:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/component/oa/uef/bcc;",
            ">;"
        }
    .end annotation
.end field

.field public xs:Ljava/util/concurrent/TimeUnit;

.field public yo:Ljava/util/concurrent/TimeUnit;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/component/oa/uef/dj$uef;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-wide v0, p1, Lcom/bytedance/sdk/component/oa/uef/dj$uef;->yo:J

    .line 5
    .line 6
    iput-wide v0, p0, Lcom/bytedance/sdk/component/oa/uef/dj;->oa:J

    .line 7
    .line 8
    iget-wide v0, p1, Lcom/bytedance/sdk/component/oa/uef/dj$uef;->lw:J

    .line 9
    .line 10
    iput-wide v0, p0, Lcom/bytedance/sdk/component/oa/uef/dj;->moa:J

    .line 11
    .line 12
    iget-wide v0, p1, Lcom/bytedance/sdk/component/oa/uef/dj$uef;->xs:J

    .line 13
    .line 14
    iput-wide v0, p0, Lcom/bytedance/sdk/component/oa/uef/dj;->ivm:J

    .line 15
    .line 16
    iget-object v0, p1, Lcom/bytedance/sdk/component/oa/uef/dj$uef;->uef:Ljava/util/List;

    .line 17
    .line 18
    iget-object v1, p1, Lcom/bytedance/sdk/component/oa/uef/dj$uef;->moa:Ljava/util/concurrent/TimeUnit;

    .line 19
    .line 20
    iput-object v1, p0, Lcom/bytedance/sdk/component/oa/uef/dj;->yo:Ljava/util/concurrent/TimeUnit;

    .line 21
    .line 22
    iget-object v1, p1, Lcom/bytedance/sdk/component/oa/uef/dj$uef;->ivm:Ljava/util/concurrent/TimeUnit;

    .line 23
    .line 24
    iput-object v1, p0, Lcom/bytedance/sdk/component/oa/uef/dj;->lw:Ljava/util/concurrent/TimeUnit;

    .line 25
    .line 26
    iget-object v1, p1, Lcom/bytedance/sdk/component/oa/uef/dj$uef;->bcc:Ljava/util/concurrent/TimeUnit;

    .line 27
    .line 28
    iput-object v1, p0, Lcom/bytedance/sdk/component/oa/uef/dj;->xs:Ljava/util/concurrent/TimeUnit;

    .line 29
    .line 30
    iput-object v0, p0, Lcom/bytedance/sdk/component/oa/uef/dj;->uef:Ljava/util/List;

    .line 31
    .line 32
    iget-object p1, p1, Lcom/bytedance/sdk/component/oa/uef/dj$uef;->oa:Lcom/bytedance/sdk/component/xs/uef$oa;

    .line 33
    .line 34
    iput-object p1, p0, Lcom/bytedance/sdk/component/oa/uef/dj;->bcc:Lcom/bytedance/sdk/component/xs/uef$oa;

    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public abstract oa()Lcom/bytedance/sdk/component/oa/uef/moa;
.end method

.method public abstract uef(Lcom/bytedance/sdk/component/oa/uef/wrv;)Lcom/bytedance/sdk/component/oa/uef/oa;
.end method

.method public uef()Lcom/bytedance/sdk/component/xs/uef$oa;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/oa/uef/dj;->bcc:Lcom/bytedance/sdk/component/xs/uef$oa;

    return-object v0
.end method

.method public yo()Lcom/bytedance/sdk/component/oa/uef/dj$uef;
    .locals 1

    .line 1
    new-instance v0, Lcom/bytedance/sdk/component/oa/uef/dj$uef;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/bytedance/sdk/component/oa/uef/dj$uef;-><init>(Lcom/bytedance/sdk/component/oa/uef/dj;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
