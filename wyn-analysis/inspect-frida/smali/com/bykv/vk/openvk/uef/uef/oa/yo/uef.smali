.class public abstract Lcom/bykv/vk/openvk/uef/uef/oa/yo/uef;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bykv/vk/openvk/uef/uef/oa/yo/yo;


# instance fields
.field private bcc:Lcom/bykv/vk/openvk/uef/uef/oa/yo/yo$moa;

.field private ivm:Lcom/bykv/vk/openvk/uef/uef/oa/yo/yo$xs;

.field private lw:Lcom/bykv/vk/openvk/uef/uef/oa/yo/yo$ivm;

.field private moa:Lcom/bykv/vk/openvk/uef/uef/oa/yo/yo$uef;

.field private oa:Lcom/bykv/vk/openvk/uef/uef/oa/yo/yo$lw;

.field protected uef:Z

.field private xs:Lcom/bykv/vk/openvk/uef/uef/oa/yo/yo$yo;

.field private yo:Lcom/bykv/vk/openvk/uef/uef/oa/yo/yo$oa;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/yo/uef;->uef:Z

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final moa()V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/yo/uef;->lw:Lcom/bykv/vk/openvk/uef/uef/oa/yo/yo$ivm;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p0}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/yo$ivm;->yo(Lcom/bykv/vk/openvk/uef/uef/oa/yo/yo;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    :catchall_0
    :cond_0
    return-void
.end method

.method public final oa()V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/yo/uef;->oa:Lcom/bykv/vk/openvk/uef/uef/oa/yo/yo$lw;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p0}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/yo$lw;->oa(Lcom/bykv/vk/openvk/uef/uef/oa/yo/yo;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    return-void
.end method

.method public final oa(II)Z
    .locals 2

    const/4 v0, 0x0

    .line 3
    :try_start_0
    iget-object v1, p0, Lcom/bykv/vk/openvk/uef/uef/oa/yo/uef;->bcc:Lcom/bykv/vk/openvk/uef/uef/oa/yo/yo$moa;

    if-eqz v1, :cond_0

    invoke-interface {v1, p0, p1, p2}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/yo$moa;->oa(Lcom/bykv/vk/openvk/uef/uef/oa/yo/yo;II)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :catchall_0
    :cond_0
    return v0
.end method

.method public uef()V
    .locals 1

    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/yo/uef;->oa:Lcom/bykv/vk/openvk/uef/uef/oa/yo/yo$lw;

    .line 9
    iput-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/yo/uef;->moa:Lcom/bykv/vk/openvk/uef/uef/oa/yo/yo$uef;

    .line 10
    iput-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/yo/uef;->yo:Lcom/bykv/vk/openvk/uef/uef/oa/yo/yo$oa;

    .line 11
    iput-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/yo/uef;->lw:Lcom/bykv/vk/openvk/uef/uef/oa/yo/yo$ivm;

    .line 12
    iput-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/yo/uef;->ivm:Lcom/bykv/vk/openvk/uef/uef/oa/yo/yo$xs;

    .line 13
    iput-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/yo/uef;->xs:Lcom/bykv/vk/openvk/uef/uef/oa/yo/yo$yo;

    .line 14
    iput-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/yo/uef;->bcc:Lcom/bykv/vk/openvk/uef/uef/oa/yo/yo$moa;

    return-void
.end method

.method public final uef(I)V
    .locals 1

    .line 15
    :try_start_0
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/yo/uef;->moa:Lcom/bykv/vk/openvk/uef/uef/oa/yo/yo$uef;

    if-eqz v0, :cond_0

    .line 16
    invoke-interface {v0, p0, p1}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/yo$uef;->uef(Lcom/bykv/vk/openvk/uef/uef/oa/yo/yo;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    return-void
.end method

.method public final uef(IIII)V
    .locals 6

    .line 17
    :try_start_0
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/yo/uef;->ivm:Lcom/bykv/vk/openvk/uef/uef/oa/yo/yo$xs;

    if-eqz v0, :cond_0

    move-object v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    .line 18
    invoke-interface/range {v0 .. v5}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/yo$xs;->uef(Lcom/bykv/vk/openvk/uef/uef/oa/yo/yo;IIII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    return-void
.end method

.method public final uef(Lcom/bykv/vk/openvk/uef/uef/oa/yo/yo$ivm;)V
    .locals 0

    .line 4
    iput-object p1, p0, Lcom/bykv/vk/openvk/uef/uef/oa/yo/uef;->lw:Lcom/bykv/vk/openvk/uef/uef/oa/yo/yo$ivm;

    return-void
.end method

.method public final uef(Lcom/bykv/vk/openvk/uef/uef/oa/yo/yo$lw;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bykv/vk/openvk/uef/uef/oa/yo/uef;->oa:Lcom/bykv/vk/openvk/uef/uef/oa/yo/yo$lw;

    return-void
.end method

.method public final uef(Lcom/bykv/vk/openvk/uef/uef/oa/yo/yo$moa;)V
    .locals 0

    .line 6
    iput-object p1, p0, Lcom/bykv/vk/openvk/uef/uef/oa/yo/uef;->bcc:Lcom/bykv/vk/openvk/uef/uef/oa/yo/yo$moa;

    return-void
.end method

.method public final uef(Lcom/bykv/vk/openvk/uef/uef/oa/yo/yo$oa;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/bykv/vk/openvk/uef/uef/oa/yo/uef;->yo:Lcom/bykv/vk/openvk/uef/uef/oa/yo/yo$oa;

    return-void
.end method

.method public final uef(Lcom/bykv/vk/openvk/uef/uef/oa/yo/yo$uef;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/bykv/vk/openvk/uef/uef/oa/yo/uef;->moa:Lcom/bykv/vk/openvk/uef/uef/oa/yo/yo$uef;

    return-void
.end method

.method public final uef(Lcom/bykv/vk/openvk/uef/uef/oa/yo/yo$xs;)V
    .locals 0

    .line 7
    iput-object p1, p0, Lcom/bykv/vk/openvk/uef/uef/oa/yo/uef;->ivm:Lcom/bykv/vk/openvk/uef/uef/oa/yo/yo$xs;

    return-void
.end method

.method public final uef(Lcom/bykv/vk/openvk/uef/uef/oa/yo/yo$yo;)V
    .locals 0

    .line 5
    iput-object p1, p0, Lcom/bykv/vk/openvk/uef/uef/oa/yo/uef;->xs:Lcom/bykv/vk/openvk/uef/uef/oa/yo/yo$yo;

    return-void
.end method

.method public uef(Z)V
    .locals 0

    .line 20
    iput-boolean p1, p0, Lcom/bykv/vk/openvk/uef/uef/oa/yo/uef;->uef:Z

    return-void
.end method

.method public final uef(II)Z
    .locals 2

    const/4 v0, 0x0

    .line 19
    :try_start_0
    iget-object v1, p0, Lcom/bykv/vk/openvk/uef/uef/oa/yo/uef;->xs:Lcom/bykv/vk/openvk/uef/uef/oa/yo/yo$yo;

    if-eqz v1, :cond_0

    invoke-interface {v1, p0, p1, p2}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/yo$yo;->uef(Lcom/bykv/vk/openvk/uef/uef/oa/yo/yo;II)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :catchall_0
    :cond_0
    return v0
.end method

.method public final yo()V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/yo/uef;->yo:Lcom/bykv/vk/openvk/uef/uef/oa/yo/yo$oa;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p0}, Lcom/bykv/vk/openvk/uef/uef/oa/yo/yo$oa;->uef(Lcom/bykv/vk/openvk/uef/uef/oa/yo/yo;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    :catchall_0
    :cond_0
    return-void
.end method
