.class public Lcom/bytedance/sdk/openadsdk/core/dz/moa;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private ab:J

.field public bcc:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;",
            ">;"
        }
    .end annotation
.end field

.field private bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

.field private final cq:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public cz:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;",
            ">;"
        }
    .end annotation
.end field

.field private dhk:Z

.field public dj:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/core/dz/oa/oa;",
            ">;"
        }
    .end annotation
.end field

.field private final dz:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public ivm:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;",
            ">;"
        }
    .end annotation
.end field

.field public lw:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;",
            ">;"
        }
    .end annotation
.end field

.field public moa:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;",
            ">;"
        }
    .end annotation
.end field

.field public oa:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;",
            ">;"
        }
    .end annotation
.end field

.field private oib:Z

.field private orq:Ljava/lang/String;

.field private sy:Z

.field private tpx:Ljava/lang/String;

.field public uef:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;",
            ">;"
        }
    .end annotation
.end field

.field private wk:Z

.field public wrv:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/core/dz/oa/uef;",
            ">;"
        }
    .end annotation
.end field

.field public xs:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;",
            ">;"
        }
    .end annotation
.end field

.field public yo:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;",
            ">;"
        }
    .end annotation
.end field

.field public zjm:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->cq:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->dz:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 18
    .line 19
    new-instance v0, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->uef:Ljava/util/List;

    .line 25
    .line 26
    new-instance v0, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->oa:Ljava/util/List;

    .line 32
    .line 33
    new-instance v0, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->yo:Ljava/util/List;

    .line 39
    .line 40
    new-instance v0, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->moa:Ljava/util/List;

    .line 46
    .line 47
    new-instance v0, Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->lw:Ljava/util/List;

    .line 53
    .line 54
    new-instance v0, Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 57
    .line 58
    .line 59
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->ivm:Ljava/util/List;

    .line 60
    .line 61
    new-instance v0, Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 64
    .line 65
    .line 66
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->xs:Ljava/util/List;

    .line 67
    .line 68
    new-instance v0, Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 71
    .line 72
    .line 73
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->bcc:Ljava/util/List;

    .line 74
    .line 75
    new-instance v0, Ljava/util/ArrayList;

    .line 76
    .line 77
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 78
    .line 79
    .line 80
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->cz:Ljava/util/List;

    .line 81
    .line 82
    new-instance v0, Ljava/util/ArrayList;

    .line 83
    .line 84
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 85
    .line 86
    .line 87
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->zjm:Ljava/util/List;

    .line 88
    .line 89
    new-instance v0, Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 92
    .line 93
    .line 94
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->dj:Ljava/util/List;

    .line 95
    .line 96
    new-instance v0, Ljava/util/ArrayList;

    .line 97
    .line 98
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 99
    .line 100
    .line 101
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->wrv:Ljava/util/List;

    .line 102
    .line 103
    return-void
.end method

.method private uef()Ljava/lang/String;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->orq:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 74
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->orq:Ljava/lang/String;

    .line 75
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->orq:Ljava/lang/String;

    return-object v0
.end method

.method private uef(Lcom/bytedance/sdk/openadsdk/core/dz/ivm;I)V
    .locals 2

    .line 58
    invoke-static {}, Lcom/bytedance/sdk/component/utils/cz;->oa()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/bytedance/sdk/openadsdk/core/dz/moa$1;

    invoke-direct {v1, p0, p1, p2}, Lcom/bytedance/sdk/openadsdk/core/dz/moa$1;-><init>(Lcom/bytedance/sdk/openadsdk/core/dz/moa;Lcom/bytedance/sdk/openadsdk/core/dz/ivm;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private uef(Ljava/lang/String;)V
    .locals 3

    .line 59
    :try_start_0
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->wk:Z

    if-eqz v0, :cond_0

    .line 60
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 61
    const-string v1, "event"

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 62
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->tpx:Ljava/lang/String;

    const-string v2, "vast_play_track"

    invoke-static {p1, v1, v2, v0}, Lcom/bytedance/sdk/openadsdk/moa/yo;->oa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void

    .line 63
    :cond_0
    const-string v0, "firstQuartile"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 64
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->tpx:Ljava/lang/String;

    const-string v2, "track_first_quartile"

    invoke-static {p1, v0, v2, v1}, Lcom/bytedance/sdk/openadsdk/moa/yo;->oa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void

    .line 65
    :cond_1
    const-string v0, "midpoint"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 66
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->tpx:Ljava/lang/String;

    const-string v2, "track_midpoint"

    invoke-static {p1, v0, v2, v1}, Lcom/bytedance/sdk/openadsdk/moa/yo;->oa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void

    .line 67
    :cond_2
    const-string v0, "thirdQuartile"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 68
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->tpx:Ljava/lang/String;

    const-string v2, "track_third_quartile"

    invoke-static {p1, v0, v2, v1}, Lcom/bytedance/sdk/openadsdk/moa/yo;->oa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_3
    return-void
.end method

.method private uef(JLjava/util/List;Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;",
            ">;",
            "Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef;",
            ")Z"
        }
    .end annotation

    const/4 v5, 0x0

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    move-object v4, p4

    .line 76
    invoke-direct/range {v0 .. v5}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->uef(JLjava/util/List;Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef;Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;)Z

    move-result p1

    return p1
.end method

.method private uef(JLjava/util/List;Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef;Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;)Z
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;",
            ">;",
            "Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef;",
            "Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;",
            ")Z"
        }
    .end annotation

    .line 69
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 70
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->nj()Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 71
    invoke-virtual {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->dj()Ljava/lang/String;

    move-result-object v1

    :cond_0
    move-object v7, v1

    .line 72
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->uef()Ljava/lang/String;

    move-result-object v9

    move-wide v5, p1

    move-object v3, p3

    move-object v4, p4

    move-object v8, p5

    invoke-static/range {v2 .. v9}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/util/List;Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef;JLjava/lang/String;Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method


# virtual methods
.method public bcc(J)V
    .locals 7

    .line 1
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->cz:Ljava/util/List;

    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->wk:Z

    const/4 v6, 0x0

    if-eqz v0, :cond_0

    move-object v5, v6

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    long-to-float v2, p1

    const-string v4, "mute"

    invoke-direct {v0, v4, v1, v2}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;F)V

    move-object v5, v0

    :goto_0
    const/4 v4, 0x0

    move-object v0, p0

    move-wide v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->uef(JLjava/util/List;Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef;Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 2
    iget-boolean p1, v0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->wk:Z

    if-nez p1, :cond_1

    .line 3
    iget-object p1, v0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object p2, v0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->tpx:Ljava/lang/String;

    const-string v1, "track_mute"

    invoke-static {p1, p2, v1, v6}, Lcom/bytedance/sdk/openadsdk/moa/yo;->oa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    :cond_1
    return-void
.end method

.method public bcc(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/core/dz/oa/oa;",
            ">;)V"
        }
    .end annotation

    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->dj:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 5
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->dj:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    return-void
.end method

.method public cz(J)V
    .locals 7

    .line 1
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->zjm:Ljava/util/List;

    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->wk:Z

    const/4 v6, 0x0

    if-eqz v0, :cond_0

    move-object v5, v6

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    long-to-float v2, p1

    const-string v4, "unmute"

    invoke-direct {v0, v4, v1, v2}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;F)V

    move-object v5, v0

    :goto_0
    const/4 v4, 0x0

    move-object v0, p0

    move-wide v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->uef(JLjava/util/List;Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef;Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 2
    iget-boolean p1, v0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->wk:Z

    if-nez p1, :cond_1

    .line 3
    iget-object p1, v0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object p2, v0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->tpx:Ljava/lang/String;

    const-string v1, "track_unmute"

    invoke-static {p1, p2, v1, v6}, Lcom/bytedance/sdk/openadsdk/moa/yo;->oa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    :cond_1
    return-void
.end method

.method public cz(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/core/dz/oa/uef;",
            ">;)V"
        }
    .end annotation

    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->wrv:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 5
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->wrv:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    return-void
.end method

.method public dj(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->cz:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public ivm(J)V
    .locals 7

    .line 1
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->xs:Ljava/util/List;

    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->wk:Z

    const/4 v6, 0x0

    if-eqz v0, :cond_0

    move-object v5, v6

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;

    const-string v1, "skip"

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-direct {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    move-object v5, v0

    :goto_0
    const/4 v4, 0x0

    move-object v0, p0

    move-wide v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->uef(JLjava/util/List;Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef;Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 2
    iget-boolean p1, v0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->wk:Z

    if-nez p1, :cond_1

    .line 3
    iget-object p1, v0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object p2, v0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->tpx:Ljava/lang/String;

    const-string v1, "track_skip"

    invoke-static {p1, p2, v1, v6}, Lcom/bytedance/sdk/openadsdk/moa/yo;->oa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    :cond_1
    return-void
.end method

.method public ivm(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;",
            ">;)V"
        }
    .end annotation

    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->xs:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public lw(J)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->dz:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->ivm:Ljava/util/List;

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, v0, v1}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->uef(JLjava/util/List;Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef;)Z

    :cond_0
    return-void
.end method

.method public lw(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;",
            ">;)V"
        }
    .end annotation

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->ivm:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public moa(J)V
    .locals 6

    .line 1
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->lw:Ljava/util/List;

    new-instance v5, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;

    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->wk:Z

    if-eqz v0, :cond_0

    const-string v0, "video_progress"

    goto :goto_0

    :cond_0
    const-string v0, "complete"

    :goto_0
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {v5, v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;F)V

    const/4 v4, 0x0

    move-object v0, p0

    move-wide v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->uef(JLjava/util/List;Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef;Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 2
    iget-boolean p1, v0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->wk:Z

    if-nez p1, :cond_1

    .line 3
    iget-object p1, v0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object p2, v0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->tpx:Ljava/lang/String;

    const-string v1, "track_complete"

    const/4 v2, 0x0

    invoke-static {p1, p2, v1, v2}, Lcom/bytedance/sdk/openadsdk/moa/yo;->oa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    :cond_1
    return-void
.end method

.method public moa(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;",
            ">;)V"
        }
    .end annotation

    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->lw:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public oa(J)V
    .locals 7

    .line 1
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->yo:Ljava/util/List;

    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->wk:Z

    const/4 v6, 0x0

    if-eqz v0, :cond_0

    move-object v5, v6

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    long-to-float v2, p1

    const-string v4, "pause"

    invoke-direct {v0, v4, v1, v2}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;F)V

    move-object v5, v0

    :goto_0
    const/4 v4, 0x0

    move-object v0, p0

    move-wide v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->uef(JLjava/util/List;Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef;Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 2
    iget-boolean p1, v0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->wk:Z

    if-nez p1, :cond_1

    .line 3
    iget-object p1, v0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object p2, v0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->tpx:Ljava/lang/String;

    const-string v1, "track_pause"

    invoke-static {p1, p2, v1, v6}, Lcom/bytedance/sdk/openadsdk/moa/yo;->oa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    :cond_1
    return-void
.end method

.method public oa(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;",
            ">;)V"
        }
    .end annotation

    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->yo:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public uef(JF)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JF)",
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;",
            ">;"
        }
    .end annotation

    .line 77
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    move v2, v1

    .line 78
    :goto_0
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->dj:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    .line 79
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->dj:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/bytedance/sdk/openadsdk/core/dz/oa/oa;

    .line 80
    invoke-virtual {v3, p3}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/oa;->uef(F)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 81
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 82
    :cond_1
    :goto_1
    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->wrv:Ljava/util/List;

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p3

    if-ge v1, p3, :cond_3

    .line 83
    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->wrv:Ljava/util/List;

    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/bytedance/sdk/openadsdk/core/dz/oa/uef;

    .line 84
    invoke-virtual {p3, p1, p2}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/uef;->uef(J)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 85
    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    return-object v0
.end method

.method public uef(IJJ)V
    .locals 7

    .line 36
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->ab:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    goto/16 :goto_3

    .line 37
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->ab:J

    long-to-float v0, p2

    long-to-float p4, p4

    div-float/2addr v0, p4

    .line 38
    invoke-virtual {p0, p2, p3, v0}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->uef(JF)Ljava/util/List;

    move-result-object v4

    const/4 p4, 0x6

    const/4 p5, 0x0

    const/4 v1, 0x1

    if-eq p1, p4, :cond_4

    const/4 p4, 0x7

    if-eq p1, p4, :cond_3

    const/16 p4, 0x8

    if-eq p1, p4, :cond_2

    const/16 p4, 0xf

    if-eq p1, p4, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 39
    invoke-interface {v4, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;

    .line 40
    instance-of p1, p1, Lcom/bytedance/sdk/openadsdk/core/dz/oa/uef;

    if-eqz p1, :cond_5

    .line 41
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->tpx:Ljava/lang/String;

    const-string v1, "track_start"

    invoke-static {p1, p4, v1, p5}, Lcom/bytedance/sdk/openadsdk/moa/yo;->oa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 42
    new-instance p5, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;

    const-string p1, "start"

    iget-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-direct {p5, p1, p4, v0}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;F)V

    goto :goto_0

    .line 43
    :cond_2
    const-string p1, "thirdQuartile"

    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->uef(Ljava/lang/String;)V

    .line 44
    iput-boolean v1, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->dhk:Z

    .line 45
    iget-boolean p4, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->wk:Z

    const/high16 v0, 0x3f400000    # 0.75f

    if-nez p4, :cond_5

    .line 46
    new-instance p5, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;

    iget-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-direct {p5, p1, p4, v0}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;F)V

    goto :goto_0

    .line 47
    :cond_3
    const-string p1, "midpoint"

    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->uef(Ljava/lang/String;)V

    .line 48
    iput-boolean v1, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->oib:Z

    .line 49
    iget-boolean p4, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->wk:Z

    const/high16 v0, 0x3f000000    # 0.5f

    if-nez p4, :cond_5

    .line 50
    new-instance p5, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;

    iget-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-direct {p5, p1, p4, v0}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;F)V

    goto :goto_0

    .line 51
    :cond_4
    iget-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->sy:Z

    if-nez p1, :cond_5

    .line 52
    const-string p1, "firstQuartile"

    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->uef(Ljava/lang/String;)V

    .line 53
    iput-boolean v1, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->sy:Z

    .line 54
    iget-boolean p4, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->wk:Z

    const/high16 v0, 0x3e800000    # 0.25f

    if-nez p4, :cond_5

    .line 55
    new-instance p5, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;

    iget-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-direct {p5, p1, p4, v0}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;F)V

    .line 56
    :cond_5
    :goto_0
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_7

    if-eqz p5, :cond_6

    :goto_1
    move-object v6, p5

    goto :goto_2

    .line 57
    :cond_6
    new-instance p5, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;

    const-string p1, "video_progress"

    iget-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-direct {p5, p1, p4, v0}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;F)V

    goto :goto_1

    :goto_2
    const/4 v5, 0x0

    move-object v1, p0

    move-wide v2, p2

    invoke-direct/range {v1 .. v6}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->uef(JLjava/util/List;Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef;Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;)Z

    :cond_7
    :goto_3
    return-void
.end method

.method public uef(J)V
    .locals 7

    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->cq:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5
    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->oa:Ljava/util/List;

    new-instance v6, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;

    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->wk:Z

    if-eqz v0, :cond_0

    const-string v0, "show_impression"

    goto :goto_0

    :cond_0
    const-string v0, "impression"

    :goto_0
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-direct {v6, v0, v1}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    const/4 v5, 0x0

    move-object v1, p0

    move-wide v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->uef(JLjava/util/List;Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef;Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 6
    iget-boolean p1, v1, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->wk:Z

    if-nez p1, :cond_2

    .line 7
    iget-object p1, v1, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object p2, v1, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->tpx:Ljava/lang/String;

    const-string v0, "track_impression"

    const/4 v2, 0x0

    invoke-static {p1, p2, v0, v2}, Lcom/bytedance/sdk/openadsdk/moa/yo;->oa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void

    :cond_1
    move-object v1, p0

    :cond_2
    return-void
.end method

.method public uef(JJLcom/bytedance/sdk/openadsdk/core/dz/ivm;)V
    .locals 9

    .line 8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->ab:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    goto/16 :goto_4

    :cond_0
    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_b

    cmp-long v2, p3, v0

    if-lez v2, :cond_b

    .line 9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->ab:J

    long-to-float v2, p1

    long-to-float p3, p3

    div-float/2addr v2, p3

    .line 10
    invoke-virtual {p0, p1, p2, v2}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->uef(JF)Ljava/util/List;

    move-result-object v6

    const/high16 p3, 0x3e800000    # 0.25f

    cmpl-float p4, v2, p3

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ltz p4, :cond_4

    .line 11
    iget-boolean p4, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->sy:Z

    if-nez p4, :cond_4

    .line 12
    const-string p4, "firstQuartile"

    invoke-direct {p0, p4}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->uef(Ljava/lang/String;)V

    .line 13
    iput-boolean v4, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->sy:Z

    if-eqz p5, :cond_1

    const/4 v2, 0x6

    .line 14
    invoke-direct {p0, p5, v2}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->uef(Lcom/bytedance/sdk/openadsdk/core/dz/ivm;I)V

    .line 15
    :cond_1
    iget-boolean p5, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->wk:Z

    if-nez p5, :cond_2

    .line 16
    new-instance p5, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-direct {p5, p4, v2, p3}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;F)V

    :goto_0
    move v2, p3

    goto :goto_1

    :cond_2
    move v2, p3

    :cond_3
    move-object p5, v3

    goto :goto_1

    :cond_4
    const/high16 p3, 0x3f000000    # 0.5f

    cmpl-float p4, v2, p3

    if-ltz p4, :cond_6

    .line 17
    iget-boolean p4, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->oib:Z

    if-nez p4, :cond_6

    .line 18
    const-string p4, "midpoint"

    invoke-direct {p0, p4}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->uef(Ljava/lang/String;)V

    .line 19
    iput-boolean v4, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->oib:Z

    if-eqz p5, :cond_5

    const/4 v2, 0x7

    .line 20
    invoke-direct {p0, p5, v2}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->uef(Lcom/bytedance/sdk/openadsdk/core/dz/ivm;I)V

    .line 21
    :cond_5
    iget-boolean p5, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->wk:Z

    if-nez p5, :cond_2

    .line 22
    new-instance p5, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-direct {p5, p4, v2, p3}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;F)V

    goto :goto_0

    :cond_6
    const/high16 p3, 0x3f400000    # 0.75f

    cmpl-float p4, v2, p3

    if-ltz p4, :cond_3

    .line 23
    iget-boolean p4, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->dhk:Z

    if-nez p4, :cond_3

    .line 24
    const-string p4, "thirdQuartile"

    invoke-direct {p0, p4}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->uef(Ljava/lang/String;)V

    .line 25
    iput-boolean v4, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->dhk:Z

    if-eqz p5, :cond_7

    const/16 v2, 0x8

    .line 26
    invoke-direct {p0, p5, v2}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->uef(Lcom/bytedance/sdk/openadsdk/core/dz/ivm;I)V

    .line 27
    :cond_7
    iget-boolean p5, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->wk:Z

    if-nez p5, :cond_2

    .line 28
    new-instance p5, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-direct {p5, p4, v2, p3}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;F)V

    goto :goto_0

    :goto_1
    const p3, 0x3cf5c28f    # 0.03f

    cmpg-float p3, v2, p3

    if-gez p3, :cond_8

    const/4 v2, 0x0

    .line 29
    :cond_8
    iget-boolean p3, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->wk:Z

    if-nez p3, :cond_9

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result p3

    if-nez p3, :cond_9

    const/4 p3, 0x0

    .line 30
    invoke-interface {v6, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;

    .line 31
    instance-of p4, p3, Lcom/bytedance/sdk/openadsdk/core/dz/oa/uef;

    if-eqz p4, :cond_9

    check-cast p3, Lcom/bytedance/sdk/openadsdk/core/dz/oa/uef;

    invoke-virtual {p3}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/uef;->uef()J

    move-result-wide p3

    cmp-long p3, p3, v0

    if-nez p3, :cond_9

    .line 32
    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->tpx:Ljava/lang/String;

    const-string p5, "track_start"

    invoke-static {p3, p4, p5, v3}, Lcom/bytedance/sdk/openadsdk/moa/yo;->oa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 33
    new-instance p5, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;

    const-string p3, "start"

    iget-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-direct {p5, p3, p4, v2}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;F)V

    .line 34
    :cond_9
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result p3

    if-nez p3, :cond_b

    if-eqz p5, :cond_a

    :goto_2
    move-object v8, p5

    goto :goto_3

    .line 35
    :cond_a
    new-instance p5, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;

    const-string p3, "video_progress"

    iget-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-direct {p5, p3, p4, v2}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;F)V

    goto :goto_2

    :goto_3
    const/4 v7, 0x0

    move-object v3, p0

    move-wide v4, p1

    invoke-direct/range {v3 .. v8}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->uef(JLjava/util/List;Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef;Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;)Z

    :cond_b
    :goto_4
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/dz/moa;)V
    .locals 1

    .line 106
    iget-object v0, p1, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->uef:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->zjm(Ljava/util/List;)V

    .line 107
    iget-object v0, p1, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->oa:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->uef(Ljava/util/List;)V

    .line 108
    iget-object v0, p1, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->yo:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->oa(Ljava/util/List;)V

    .line 109
    iget-object v0, p1, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->moa:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->yo(Ljava/util/List;)V

    .line 110
    iget-object v0, p1, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->lw:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->moa(Ljava/util/List;)V

    .line 111
    iget-object v0, p1, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->ivm:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->lw(Ljava/util/List;)V

    .line 112
    iget-object v0, p1, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->xs:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->ivm(Ljava/util/List;)V

    .line 113
    iget-object v0, p1, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->bcc:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->xs(Ljava/util/List;)V

    .line 114
    iget-object v0, p1, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->cz:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->dj(Ljava/util/List;)V

    .line 115
    iget-object v0, p1, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->zjm:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->wrv(Ljava/util/List;)V

    .line 116
    iget-object v0, p1, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->dj:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->bcc(Ljava/util/List;)V

    .line 117
    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->wrv:Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->cz(Ljava/util/List;)V

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef;)V
    .locals 7

    .line 1
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->uef:Ljava/util/List;

    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->wk:Z

    const/4 v6, 0x0

    if-eqz v0, :cond_0

    move-object v5, v6

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    const/4 v2, 0x0

    const-string v4, "error"

    invoke-direct {v0, v4, v1, v2}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;F)V

    move-object v5, v0

    :goto_0
    const-wide/16 v1, -0x1

    move-object v0, p0

    move-object v4, p1

    invoke-direct/range {v0 .. v5}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->uef(JLjava/util/List;Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef;Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 2
    iget-boolean p1, v0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->wk:Z

    if-nez p1, :cond_1

    .line 3
    iget-object p1, v0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object v1, v0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->tpx:Ljava/lang/String;

    const-string v2, "track_error"

    invoke-static {p1, v1, v2, v6}, Lcom/bytedance/sdk/openadsdk/moa/yo;->oa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    :cond_1
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V
    .locals 1

    .line 99
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 100
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->lw()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->tpx:Ljava/lang/String;

    .line 101
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ebe()Z

    move-result p1

    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->wk:Z

    return-void
.end method

.method public uef(Ljava/lang/String;F)V
    .locals 1

    .line 104
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    cmpg-float v0, p2, v0

    if-gez v0, :cond_0

    goto :goto_0

    .line 105
    :cond_0
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/dz/oa/oa$uef;

    invoke-direct {v0, p1, p2}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/oa$uef;-><init>(Ljava/lang/String;F)V

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/oa$uef;->uef()Lcom/bytedance/sdk/openadsdk/core/dz/oa/oa;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->bcc(Ljava/util/List;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public uef(Ljava/lang/String;J)V
    .locals 2

    .line 102
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-gez v0, :cond_0

    goto :goto_0

    .line 103
    :cond_0
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/dz/oa/uef$uef;

    invoke-direct {v0, p1, p2, p3}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/uef$uef;-><init>(Ljava/lang/String;J)V

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/uef$uef;->uef()Lcom/bytedance/sdk/openadsdk/core/dz/oa/uef;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->cz(Ljava/util/List;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public uef(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;",
            ">;)V"
        }
    .end annotation

    .line 86
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->oa:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public uef(Lorg/json/JSONObject;)V
    .locals 2

    .line 87
    const-string v0, "errorTrackers"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;->uef(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->zjm(Ljava/util/List;)V

    .line 88
    const-string v0, "impressionTrackers"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;->uef(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->uef(Ljava/util/List;)V

    .line 89
    const-string v0, "pauseTrackers"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;->uef(Lorg/json/JSONArray;Z)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->oa(Ljava/util/List;)V

    .line 90
    const-string v0, "resumeTrackers"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;->uef(Lorg/json/JSONArray;Z)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->yo(Ljava/util/List;)V

    .line 91
    const-string v0, "completeTrackers"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;->uef(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->moa(Ljava/util/List;)V

    .line 92
    const-string v0, "closeTrackers"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;->uef(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->lw(Ljava/util/List;)V

    .line 93
    const-string v0, "skipTrackers"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;->uef(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->ivm(Ljava/util/List;)V

    .line 94
    const-string v0, "clickTrackers"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;->uef(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->xs(Ljava/util/List;)V

    .line 95
    const-string v0, "muteTrackers"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;->uef(Lorg/json/JSONArray;Z)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->dj(Ljava/util/List;)V

    .line 96
    const-string v0, "unMuteTrackers"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;->uef(Lorg/json/JSONArray;Z)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->wrv(Ljava/util/List;)V

    .line 97
    const-string v0, "fractionalTrackers"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;->oa(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->bcc(Ljava/util/List;)V

    .line 98
    const-string v0, "absoluteTrackers"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;->yo(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->cz(Ljava/util/List;)V

    return-void
.end method

.method public wrv(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->zjm:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public xs(J)V
    .locals 6

    .line 1
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->bcc:Ljava/util/List;

    new-instance v5, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;

    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->wk:Z

    if-eqz v0, :cond_0

    const-string v0, "click"

    goto :goto_0

    :cond_0
    const-string v0, "clickTracking"

    :goto_0
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-direct {v5, v0, v1}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    const/4 v4, 0x0

    move-object v0, p0

    move-wide v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->uef(JLjava/util/List;Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef;Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 2
    iget-boolean p1, v0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->wk:Z

    if-nez p1, :cond_1

    .line 3
    iget-object p1, v0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object p2, v0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->tpx:Ljava/lang/String;

    const-string v1, "track_video_click"

    const/4 v2, 0x0

    invoke-static {p1, p2, v1, v2}, Lcom/bytedance/sdk/openadsdk/moa/yo;->oa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    :cond_1
    return-void
.end method

.method public xs(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;",
            ">;)V"
        }
    .end annotation

    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->bcc:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public yo(J)V
    .locals 7

    .line 1
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->moa:Ljava/util/List;

    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->wk:Z

    const/4 v6, 0x0

    if-eqz v0, :cond_0

    move-object v5, v6

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    long-to-float v2, p1

    const-string v4, "resume"

    invoke-direct {v0, v4, v1, v2}, Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;F)V

    move-object v5, v0

    :goto_0
    const/4 v4, 0x0

    move-object v0, p0

    move-wide v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->uef(JLjava/util/List;Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef;Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo$oa;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 2
    iget-boolean p1, v0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->wk:Z

    if-nez p1, :cond_1

    .line 3
    iget-object p1, v0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->bs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object p2, v0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->tpx:Ljava/lang/String;

    const-string v1, "track_resume"

    invoke-static {p1, p2, v1, v6}, Lcom/bytedance/sdk/openadsdk/moa/yo;->oa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    :cond_1
    return-void
.end method

.method public yo(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;",
            ">;)V"
        }
    .end annotation

    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->moa:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public zjm(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/core/dz/oa/yo;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->uef:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method
