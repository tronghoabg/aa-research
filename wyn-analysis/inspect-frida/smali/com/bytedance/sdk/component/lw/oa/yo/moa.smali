.class public Lcom/bytedance/sdk/component/lw/oa/yo/moa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/component/lw/dj;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/bytedance/sdk/component/lw/dj;"
    }
.end annotation


# instance fields
.field private bcc:Z

.field private cz:Z

.field private dj:I

.field private ivm:I

.field private lw:I

.field private moa:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private oa:Ljava/lang/String;

.field private uef:Ljava/lang/String;

.field private xs:Ljava/util/Map;
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

.field private zjm:Lcom/bytedance/sdk/component/lw/xs;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ivm()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/moa;->cz:Z

    .line 2
    .line 3
    return v0
.end method

.method public lw()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/moa;->bcc:Z

    .line 2
    .line 3
    return v0
.end method

.method public moa()Ljava/util/Map;
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
    iget-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/moa;->xs:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public oa()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/moa;->yo:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public uef(Lcom/bytedance/sdk/component/lw/oa/yo/yo;Ljava/lang/Object;)Lcom/bytedance/sdk/component/lw/oa/yo/moa;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bytedance/sdk/component/lw/oa/yo/yo;",
            "TT;)",
            "Lcom/bytedance/sdk/component/lw/oa/yo/moa;"
        }
    .end annotation

    .line 1
    iput-object p2, p0, Lcom/bytedance/sdk/component/lw/oa/yo/moa;->yo:Ljava/lang/Object;

    .line 2
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->bcc()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/bytedance/sdk/component/lw/oa/yo/moa;->uef:Ljava/lang/String;

    .line 3
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->uef()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/bytedance/sdk/component/lw/oa/yo/moa;->oa:Ljava/lang/String;

    .line 4
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->oa()I

    move-result p2

    iput p2, p0, Lcom/bytedance/sdk/component/lw/oa/yo/moa;->lw:I

    .line 5
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->yo()I

    move-result p2

    iput p2, p0, Lcom/bytedance/sdk/component/lw/oa/yo/moa;->ivm:I

    .line 6
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->wrv()Z

    move-result p2

    iput-boolean p2, p0, Lcom/bytedance/sdk/component/lw/oa/yo/moa;->cz:Z

    .line 7
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->dz()Lcom/bytedance/sdk/component/lw/xs;

    move-result-object p2

    iput-object p2, p0, Lcom/bytedance/sdk/component/lw/oa/yo/moa;->zjm:Lcom/bytedance/sdk/component/lw/xs;

    .line 8
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->wk()I

    move-result p1

    iput p1, p0, Lcom/bytedance/sdk/component/lw/oa/yo/moa;->dj:I

    return-object p0
.end method

.method public uef(Lcom/bytedance/sdk/component/lw/oa/yo/yo;Ljava/lang/Object;Ljava/util/Map;Z)Lcom/bytedance/sdk/component/lw/oa/yo/moa;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bytedance/sdk/component/lw/oa/yo/yo;",
            "TT;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;Z)",
            "Lcom/bytedance/sdk/component/lw/oa/yo/moa;"
        }
    .end annotation

    .line 9
    iput-object p3, p0, Lcom/bytedance/sdk/component/lw/oa/yo/moa;->xs:Ljava/util/Map;

    .line 10
    iput-boolean p4, p0, Lcom/bytedance/sdk/component/lw/oa/yo/moa;->bcc:Z

    .line 11
    invoke-virtual {p0, p1, p2}, Lcom/bytedance/sdk/component/lw/oa/yo/moa;->uef(Lcom/bytedance/sdk/component/lw/oa/yo/yo;Ljava/lang/Object;)Lcom/bytedance/sdk/component/lw/oa/yo/moa;

    move-result-object p1

    return-object p1
.end method

.method public uef()Ljava/lang/String;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/moa;->oa:Ljava/lang/String;

    return-object v0
.end method

.method public uef(Ljava/lang/Object;)V
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/moa;->yo:Ljava/lang/Object;

    iput-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/moa;->moa:Ljava/lang/Object;

    .line 14
    iput-object p1, p0, Lcom/bytedance/sdk/component/lw/oa/yo/moa;->yo:Ljava/lang/Object;

    return-void
.end method

.method public xs()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/moa;->dj:I

    .line 2
    .line 3
    return v0
.end method

.method public yo()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/moa;->moa:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method
