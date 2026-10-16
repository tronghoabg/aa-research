.class public Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private ab:I

.field private bcc:Ljava/lang/String;

.field private bs:Ljava/lang/String;

.field private cq:I

.field private cz:Z

.field private dhk:Z

.field private dj:I

.field private dz:Ljava/lang/String;

.field private gr:I

.field private gsd:I

.field private gzw:I

.field private ivm:Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;

.field public lw:I

.field public final moa:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public oa:Ljava/lang/String;

.field private oib:Z

.field private orq:I

.field private pz:Lorg/json/JSONObject;

.field private rt:I

.field private sy:J

.field private tpx:I

.field private ue:I

.field protected uef:F

.field private wk:I

.field private wrv:I

.field private xs:Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;

.field public yo:I

.field private zjm:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;II)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const v0, 0x32000

    .line 5
    .line 6
    .line 7
    iput v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->dj:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->wrv:I

    .line 11
    .line 12
    iput v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->cq:I

    .line 13
    .line 14
    const/high16 v1, -0x40800000    # -1.0f

    .line 15
    .line 16
    iput v1, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->uef:F

    .line 17
    .line 18
    iput v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->tpx:I

    .line 19
    .line 20
    iput v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->orq:I

    .line 21
    .line 22
    new-instance v1, Ljava/util/HashMap;

    .line 23
    .line 24
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v1, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->moa:Ljava/util/HashMap;

    .line 28
    .line 29
    const/16 v1, 0x2710

    .line 30
    .line 31
    iput v1, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->gzw:I

    .line 32
    .line 33
    iput v1, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->gsd:I

    .line 34
    .line 35
    iput v1, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->rt:I

    .line 36
    .line 37
    iput v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->gr:I

    .line 38
    .line 39
    const/4 v0, 0x1

    .line 40
    iput v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->lw:I

    .line 41
    .line 42
    new-instance v0, Lorg/json/JSONObject;

    .line 43
    .line 44
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->pz:Lorg/json/JSONObject;

    .line 48
    .line 49
    iput-object p1, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->bcc:Ljava/lang/String;

    .line 50
    .line 51
    iput-object p2, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;

    .line 52
    .line 53
    iput-object p3, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->xs:Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;

    .line 54
    .line 55
    iput p4, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->tpx:I

    .line 56
    .line 57
    iput p5, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->orq:I

    .line 58
    .line 59
    return-void
.end method


# virtual methods
.method public ab()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->dz()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->xs:Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->dj()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->dj()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0

    .line 23
    :cond_1
    const/4 v0, 0x0

    .line 24
    return-object v0
.end method

.method public bcc()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->wk:I

    return v0
.end method

.method public bcc(I)V
    .locals 0

    .line 2
    iput p1, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->gr:I

    return-void
.end method

.method public bs()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->dz()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->xs:Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->dz()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->dz()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0

    .line 23
    :cond_1
    const/4 v0, 0x0

    .line 24
    return-object v0
.end method

.method public cq()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->dz()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->xs:Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->tpx()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0

    .line 14
    :cond_0
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->tpx()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    return v0

    .line 23
    :cond_1
    const/4 v0, 0x1

    .line 24
    return v0
.end method

.method public cz()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->ab:I

    .line 2
    .line 3
    return v0
.end method

.method public dhk()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->gsd:I

    .line 2
    .line 3
    return v0
.end method

.method public dj()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->oib:Z

    .line 2
    .line 3
    return v0
.end method

.method public dz()Z
    .locals 3

    .line 1
    iget v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->orq:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->xs:Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->dj()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    invoke-static {}, Lcom/bykv/vk/openvk/uef/uef/uef/yo;->lw()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/4 v2, 0x2

    .line 25
    if-ne v0, v2, :cond_0

    .line 26
    .line 27
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 28
    .line 29
    const/16 v2, 0x1a

    .line 30
    .line 31
    if-lt v0, v2, :cond_1

    .line 32
    .line 33
    return v1

    .line 34
    :cond_0
    iget v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->tpx:I

    .line 35
    .line 36
    if-ne v0, v1, :cond_1

    .line 37
    .line 38
    return v1

    .line 39
    :cond_1
    const/4 v0, 0x0

    .line 40
    return v0
.end method

.method public gr()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->zjm:Z

    .line 2
    .line 3
    return v0
.end method

.method public gsd()Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->xs:Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;

    .line 2
    .line 3
    return-object v0
.end method

.method public gzw()Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;

    .line 2
    .line 3
    return-object v0
.end method

.method public ivm()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->dz()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->xs:Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;

    invoke-virtual {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->wk()I

    move-result v0

    return v0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->wk()I

    move-result v0

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public ivm(I)V
    .locals 0

    .line 5
    iput p1, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->gsd:I

    return-void
.end method

.method public declared-synchronized lw(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->moa:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public lw()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->bcc:Ljava/lang/String;

    return-object v0
.end method

.method public lw(I)V
    .locals 0

    .line 3
    iput p1, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->gzw:I

    return-void
.end method

.method public moa()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->pz:Lorg/json/JSONObject;

    const-string v1, "pitaya_cache_size"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public moa(I)V
    .locals 0

    .line 3
    iput p1, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->yo:I

    return-void
.end method

.method public moa(Ljava/lang/String;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->oa:Ljava/lang/String;

    return-void
.end method

.method public oa(I)V
    .locals 0

    .line 3
    iput p1, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->wk:I

    return-void
.end method

.method public oa(Ljava/lang/String;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->dz:Ljava/lang/String;

    return-void
.end method

.method public oa(Z)V
    .locals 0

    .line 4
    iput-boolean p1, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->cz:Z

    return-void
.end method

.method public oa()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->ue:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public oib()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->gzw:I

    .line 2
    .line 3
    return v0
.end method

.method public orq()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->gr:I

    .line 2
    .line 3
    return v0
.end method

.method public rt()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->cz:Z

    .line 2
    .line 3
    return v0
.end method

.method public sy()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->tpx:I

    .line 2
    .line 3
    return v0
.end method

.method public tpx()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->rt:I

    .line 2
    .line 3
    return v0
.end method

.method public uef(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->ue:I

    return-void
.end method

.method public uef(J)V
    .locals 0

    .line 4
    iput-wide p1, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->sy:J

    return-void
.end method

.method public uef(Ljava/lang/String;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->bcc:Ljava/lang/String;

    return-void
.end method

.method public declared-synchronized uef(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    monitor-enter p0

    .line 6
    :try_start_0
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->moa:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public uef(Z)V
    .locals 0

    .line 5
    iput-boolean p1, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->oib:Z

    return-void
.end method

.method public uef()Z
    .locals 3

    .line 2
    iget v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->ue:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v2, 0x2

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    return v1
.end method

.method public wk()F
    .locals 3

    .line 1
    iget v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->uef:F

    .line 2
    .line 3
    const/high16 v1, -0x40800000    # -1.0f

    .line 4
    .line 5
    cmpl-float v2, v0, v1

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    return v0

    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->dz()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->xs:Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->bcc()F

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    return v0

    .line 23
    :cond_1
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;

    .line 24
    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->bcc()F

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    return v0

    .line 32
    :cond_2
    return v1
.end method

.method public wrv()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->dz()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->xs:Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->lw()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    return-wide v0

    .line 14
    :cond_0
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->ivm:Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->lw()J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    return-wide v0

    .line 23
    :cond_1
    const-wide/16 v0, 0x0

    .line 24
    .line 25
    return-wide v0
.end method

.method public xs(I)V
    .locals 0

    .line 2
    iput p1, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->rt:I

    return-void
.end method

.method public xs()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->dhk:Z

    return v0
.end method

.method public yo()Lorg/json/JSONObject;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->pz:Lorg/json/JSONObject;

    return-object v0
.end method

.method public yo(I)V
    .locals 0

    .line 2
    iput p1, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->ab:I

    return-void
.end method

.method public yo(Ljava/lang/String;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->bs:Ljava/lang/String;

    return-void
.end method

.method public yo(Z)V
    .locals 0

    .line 4
    iput-boolean p1, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->zjm:Z

    return-void
.end method

.method public zjm()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->sy:J

    .line 2
    .line 3
    return-wide v0
.end method
