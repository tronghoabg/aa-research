.class public Lcom/bytedance/sdk/openadsdk/activity/single/oa;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/sdk/openadsdk/activity/single/oa$yo;,
        Lcom/bytedance/sdk/openadsdk/activity/single/oa$uef;,
        Lcom/bytedance/sdk/openadsdk/activity/single/oa$moa;,
        Lcom/bytedance/sdk/openadsdk/activity/single/oa$oa;,
        Lcom/bytedance/sdk/openadsdk/activity/single/oa$lw;
    }
.end annotation


# static fields
.field private static oa:Lcom/bytedance/sdk/openadsdk/uef/lw/uef;

.field private static yo:Lcom/bytedance/sdk/openadsdk/uef/yo/oa;


# instance fields
.field private ab:Ljava/lang/Runnable;

.field private bcc:Lcom/bytedance/sdk/openadsdk/uef/yo/oa;

.field private final bs:Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv$oa;

.field private cq:Landroid/app/Activity;

.field private final cz:Z

.field private final dhk:Z

.field private dj:Lcom/bytedance/sdk/openadsdk/activity/single/yo;

.field private dz:I

.field private final ivm:Lcom/bytedance/sdk/openadsdk/cq/zjm;

.field private final lw:Landroid/os/Bundle;

.field private final moa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

.field private oib:Z

.field private sy:Z

.field private final tpx:Z

.field public uef:Lcom/bytedance/sdk/openadsdk/component/reward/wrv;

.field private wk:Landroid/os/Bundle;

.field private final wrv:Z

.field private xs:Lcom/bytedance/sdk/openadsdk/uef/lw/uef;

.field private final zjm:Z


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Z)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/os/Bundle;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->lw:Landroid/os/Bundle;

    .line 10
    .line 11
    new-instance v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv$oa;

    .line 12
    .line 13
    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv$oa;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->bs:Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv$oa;

    .line 17
    .line 18
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->moa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 19
    .line 20
    iput-boolean p3, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->oib:Z

    .line 21
    .line 22
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->cq:Landroid/app/Activity;

    .line 23
    .line 24
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/gzw/lw;->zjm()Z

    .line 25
    .line 26
    .line 27
    move-result p3

    .line 28
    iput-boolean p3, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->tpx:Z

    .line 29
    .line 30
    new-instance p3, Lcom/bytedance/sdk/openadsdk/cq/zjm;

    .line 31
    .line 32
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-direct {p3, p1}, Lcom/bytedance/sdk/openadsdk/cq/zjm;-><init>(Landroid/content/Context;)V

    .line 37
    .line 38
    .line 39
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->ivm:Lcom/bytedance/sdk/openadsdk/cq/zjm;

    .line 40
    .line 41
    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->gem()Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->cz:Z

    .line 46
    .line 47
    const/4 p3, 0x0

    .line 48
    const/4 v0, 0x1

    .line 49
    if-eqz p1, :cond_0

    .line 50
    .line 51
    const/16 v1, 0x27

    .line 52
    .line 53
    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->wxf()I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-ne v1, v2, :cond_0

    .line 58
    .line 59
    move v1, v0

    .line 60
    goto :goto_0

    .line 61
    :cond_0
    move v1, p3

    .line 62
    :goto_0
    iput-boolean v1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->zjm:Z

    .line 63
    .line 64
    if-eqz p1, :cond_1

    .line 65
    .line 66
    const/16 p1, 0x28

    .line 67
    .line 68
    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->wxf()I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-ne p1, v1, :cond_1

    .line 73
    .line 74
    move p1, v0

    .line 75
    goto :goto_1

    .line 76
    :cond_1
    move p1, p3

    .line 77
    :goto_1
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->wrv:Z

    .line 78
    .line 79
    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->wxf()I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    const/16 v1, 0x2b

    .line 84
    .line 85
    if-eq p1, v1, :cond_3

    .line 86
    .line 87
    const/16 v1, 0x2c

    .line 88
    .line 89
    if-ne p1, v1, :cond_2

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_2
    new-instance p1, Lcom/bytedance/sdk/openadsdk/activity/single/cz;

    .line 93
    .line 94
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->cq:Landroid/app/Activity;

    .line 95
    .line 96
    invoke-direct {p1, v1, p2, p0}, Lcom/bytedance/sdk/openadsdk/activity/single/cz;-><init>(Landroid/app/Activity;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/activity/single/oa;)V

    .line 97
    .line 98
    .line 99
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->dj:Lcom/bytedance/sdk/openadsdk/activity/single/yo;

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_3
    :goto_2
    new-instance p1, Lcom/bytedance/sdk/openadsdk/activity/single/moa;

    .line 103
    .line 104
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->cq:Landroid/app/Activity;

    .line 105
    .line 106
    invoke-direct {p1, v1, p2, p0}, Lcom/bytedance/sdk/openadsdk/activity/single/moa;-><init>(Landroid/app/Activity;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/activity/single/oa;)V

    .line 107
    .line 108
    .line 109
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->dj:Lcom/bytedance/sdk/openadsdk/activity/single/yo;

    .line 110
    .line 111
    :goto_3
    const-string p1, "adapt_decor_size"

    .line 112
    .line 113
    invoke-static {p1, p3}, Lcom/bytedance/sdk/openadsdk/gzw/lw;->uef(Ljava/lang/String;I)I

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    if-ne p1, v0, :cond_4

    .line 118
    .line 119
    move p3, v0

    .line 120
    :cond_4
    iput-boolean p3, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->dhk:Z

    .line 121
    .line 122
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->dj:Lcom/bytedance/sdk/openadsdk/activity/single/yo;

    .line 123
    .line 124
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->uef()V

    .line 125
    .line 126
    .line 127
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->lz()V

    .line 128
    .line 129
    .line 130
    return-void
.end method

.method private lz()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->moa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->nyn()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Lcom/bytedance/sdk/openadsdk/component/reward/wrv;

    .line 10
    .line 11
    new-instance v1, Lcom/bytedance/sdk/openadsdk/activity/single/oa$1;

    .line 12
    .line 13
    invoke-direct {v1, p0}, Lcom/bytedance/sdk/openadsdk/activity/single/oa$1;-><init>(Lcom/bytedance/sdk/openadsdk/activity/single/oa;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v1}, Lcom/bytedance/sdk/openadsdk/component/reward/wrv;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/wrv$uef;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/wrv;

    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public static synthetic oa(Lcom/bytedance/sdk/openadsdk/activity/single/oa;)Lcom/bytedance/sdk/openadsdk/activity/single/yo;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->dj:Lcom/bytedance/sdk/openadsdk/activity/single/yo;

    return-object p0
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/activity/single/oa;)Lcom/bytedance/sdk/openadsdk/uef/lw/uef;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->xs:Lcom/bytedance/sdk/openadsdk/uef/lw/uef;

    return-object p0
.end method


# virtual methods
.method public ab()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->oib()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->tpx()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->xs:Lcom/bytedance/sdk/openadsdk/uef/lw/uef;

    .line 12
    .line 13
    invoke-static {v0}, Lj$/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->bcc:Lcom/bytedance/sdk/openadsdk/uef/yo/oa;

    .line 17
    .line 18
    invoke-static {v0}, Lj$/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->xs:Lcom/bytedance/sdk/openadsdk/uef/lw/uef;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/uef/lw/uef;->uef()V

    .line 26
    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->bcc:Lcom/bytedance/sdk/openadsdk/uef/yo/oa;

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/uef/yo/oa;->uef()V

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_2
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->dj()Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->af()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    goto :goto_0

    .line 48
    :cond_3
    const/4 v0, 0x0

    .line 49
    :goto_0
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->moa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 50
    .line 51
    const-string v2, "show"

    .line 52
    .line 53
    invoke-static {v1, v2, v0}, Lcom/bytedance/sdk/openadsdk/moa/zjm;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;I)V

    .line 54
    .line 55
    .line 56
    :goto_1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->ab:Ljava/lang/Runnable;

    .line 57
    .line 58
    if-eqz v0, :cond_4

    .line 59
    .line 60
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 61
    .line 62
    .line 63
    const/4 v0, 0x0

    .line 64
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->ab:Ljava/lang/Runnable;

    .line 65
    .line 66
    :cond_4
    :goto_2
    return-void
.end method

.method public bcc()Landroid/app/Activity;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->dj:Lcom/bytedance/sdk/openadsdk/activity/single/yo;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->cq:Landroid/app/Activity;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->uef:Landroid/app/Activity;

    .line 9
    .line 10
    return-object v0
.end method

.method public bs()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->moa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->sk()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method public cp()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->dj:Lcom/bytedance/sdk/openadsdk/activity/single/yo;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->bs()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public cq()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->moa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ab()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public cz()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->dj:Lcom/bytedance/sdk/openadsdk/activity/single/yo;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->cz()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public dhk()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->dj:Lcom/bytedance/sdk/openadsdk/activity/single/yo;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->moa()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public dj()Lcom/bytedance/sdk/openadsdk/activity/single/bcc;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->dj:Lcom/bytedance/sdk/openadsdk/activity/single/yo;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->dj()Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public dxx()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->dj:Lcom/bytedance/sdk/openadsdk/activity/single/yo;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->bcc()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public dz()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->xs:Lcom/bytedance/sdk/openadsdk/uef/lw/uef;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/api/PAGAdWrapperListener;->onAdClicked()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->bcc:Lcom/bytedance/sdk/openadsdk/uef/yo/oa;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/api/PAGAdWrapperListener;->onAdClicked()V

    .line 14
    .line 15
    .line 16
    :cond_1
    return-void
.end method

.method public fz()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->dj:Lcom/bytedance/sdk/openadsdk/activity/single/yo;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->oib()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public gr()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->dj:Lcom/bytedance/sdk/openadsdk/activity/single/yo;

    .line 2
    .line 3
    instance-of v0, v0, Lcom/bytedance/sdk/openadsdk/activity/single/moa;

    .line 4
    .line 5
    return v0
.end method

.method public gsd()Lcom/bytedance/sdk/openadsdk/component/reward/top/yo;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->dj:Lcom/bytedance/sdk/openadsdk/activity/single/yo;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->wrv()Lcom/bytedance/sdk/openadsdk/component/reward/top/yo;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public gzw()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->dj:Lcom/bytedance/sdk/openadsdk/activity/single/yo;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->lw()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public ivm()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->cz:Z

    .line 2
    .line 3
    return v0
.end method

.method public ku()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->dj:Lcom/bytedance/sdk/openadsdk/activity/single/yo;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->sy()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public lw(Lcom/bytedance/sdk/openadsdk/activity/single/TTAdActivity;)V
    .locals 1

    const/4 v0, 0x6

    .line 4
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->dz:I

    .line 5
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->dj:Lcom/bytedance/sdk/openadsdk/activity/single/yo;

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->uef(Landroid/app/Activity;)V

    .line 6
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->bs:Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv$oa;

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv$oa;->uef(Landroid/app/Activity;)V

    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->cq:Landroid/app/Activity;

    return-void
.end method

.method public lw()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->moa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->cz:Z

    if-nez v0, :cond_1

    return v1

    .line 3
    :cond_1
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->zjm:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->wrv:Z

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    return v1

    :cond_3
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public moa(Lcom/bytedance/sdk/openadsdk/activity/single/TTAdActivity;)V
    .locals 0

    const/4 p1, 0x5

    .line 2
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->dz:I

    .line 3
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->dj:Lcom/bytedance/sdk/openadsdk/activity/single/yo;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->xs()V

    return-void
.end method

.method public moa()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->wrv:Z

    return v0
.end method

.method public oa(Lcom/bytedance/sdk/openadsdk/activity/single/TTAdActivity;)V
    .locals 4

    const/4 v0, 0x3

    .line 3
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->dz:I

    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->dj:Lcom/bytedance/sdk/openadsdk/activity/single/yo;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->oa()V

    .line 5
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/wrv;

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/wrv;->oa()V

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->bs:Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv$oa;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->moa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->cgg()I

    move-result v1

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->moa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->gze()F

    move-result v2

    iget-boolean v3, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->dhk:Z

    invoke-virtual {v0, p1, v1, v2, v3}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wrv$oa;->uef(Landroid/app/Activity;IFZ)V

    return-void
.end method

.method public oa(Lcom/bytedance/sdk/openadsdk/activity/single/bcc;)V
    .locals 2

    .line 11
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->cq:Landroid/app/Activity;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->wk:Landroid/os/Bundle;

    invoke-virtual {p1, v0, v1}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->uef(Landroid/app/Activity;Landroid/os/Bundle;)V

    .line 12
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->dz:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    return-void

    .line 13
    :cond_0
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->moa()V

    return-void

    :cond_1
    const/4 v0, 0x0

    .line 14
    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->yo(Z)V

    .line 15
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->dz()V

    return-void

    .line 16
    :cond_2
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->cq()V

    .line 17
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->yo()V

    const/4 v0, 0x1

    .line 18
    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->yo(Z)V

    return-void

    .line 19
    :cond_3
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->cq()V

    return-void
.end method

.method public oa(Lcom/bytedance/sdk/openadsdk/activity/single/bcc;I)V
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->dj:Lcom/bytedance/sdk/openadsdk/activity/single/yo;

    invoke-virtual {v0, p1, p2}, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->oa(Lcom/bytedance/sdk/openadsdk/activity/single/bcc;I)V

    return-void
.end method

.method public oa(Lcom/bytedance/sdk/openadsdk/activity/single/bcc;Lcom/bytedance/sdk/openadsdk/activity/single/oa$lw;)V
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->dj:Lcom/bytedance/sdk/openadsdk/activity/single/yo;

    invoke-virtual {v0, p1, p2}, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->uef(Lcom/bytedance/sdk/openadsdk/activity/single/bcc;Lcom/bytedance/sdk/openadsdk/activity/single/oa$lw;)V

    return-void
.end method

.method public oa(Z)V
    .locals 2

    .line 8
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->moa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    if-eqz v0, :cond_0

    .line 9
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->yo(Z)V

    .line 10
    :cond_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->moa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-static {p1, v0, v1}, Lcom/bytedance/sdk/openadsdk/component/reward/wrv;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;ZI)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public oa()Z
    .locals 1

    .line 2
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->dhk:Z

    return v0
.end method

.method public oib()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->moa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->af()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public orq()Lcom/bytedance/sdk/openadsdk/cq/zjm;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->ivm:Lcom/bytedance/sdk/openadsdk/cq/zjm;

    .line 2
    .line 3
    return-object v0
.end method

.method public pz()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/openadsdk/core/model/gzw;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->dj:Lcom/bytedance/sdk/openadsdk/activity/single/yo;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->wk()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public rt()Lcom/bytedance/sdk/openadsdk/activity/single/bcc;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->dj:Lcom/bytedance/sdk/openadsdk/activity/single/yo;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->cq()Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public sy()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->moa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->cz(Z)V

    .line 7
    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/wrv;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/wrv;->yo()V

    .line 14
    .line 15
    .line 16
    :cond_1
    return-void
.end method

.method public tpx()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->moa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->bcc(Z)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->dj:Lcom/bytedance/sdk/openadsdk/activity/single/yo;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->ab()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public ue()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->sy:Z

    .line 2
    .line 3
    return v0
.end method

.method public uef()Lcom/bytedance/sdk/openadsdk/core/model/gzw;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->moa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    return-object v0
.end method

.method public uef(F)V
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->dj:Lcom/bytedance/sdk/openadsdk/activity/single/yo;

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->uef(F)V

    return-void
.end method

.method public uef(I)V
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->dj:Lcom/bytedance/sdk/openadsdk/activity/single/yo;

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->uef(I)V

    return-void
.end method

.method public uef(Landroid/app/Activity;)V
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->dj:Lcom/bytedance/sdk/openadsdk/activity/single/yo;

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->oa(Landroid/app/Activity;)V

    return-void
.end method

.method public uef(Landroid/view/View;)V
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->dj:Lcom/bytedance/sdk/openadsdk/activity/single/yo;

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->uef(Landroid/view/View;)V

    return-void
.end method

.method public uef(Landroid/view/View;Z)V
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->dj:Lcom/bytedance/sdk/openadsdk/activity/single/yo;

    invoke-virtual {v0, p1, p2}, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->uef(Landroid/view/View;Z)V

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/activity/single/TTAdActivity;)V
    .locals 0

    const/4 p1, 0x2

    .line 16
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->dz:I

    .line 17
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->dj:Lcom/bytedance/sdk/openadsdk/activity/single/yo;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->ivm()V

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/activity/single/TTAdActivity;Landroid/os/Bundle;I)V
    .locals 1

    if-eqz p1, :cond_0

    .line 19
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 20
    :goto_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->moa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {v0, p1, p2, p3}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/yo;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Landroid/content/Intent;Landroid/os/Bundle;I)V

    .line 21
    iget-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->oib:Z

    if-nez p1, :cond_2

    .line 22
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->xs:Lcom/bytedance/sdk/openadsdk/uef/lw/uef;

    if-eqz p1, :cond_1

    .line 23
    sput-object p1, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->oa:Lcom/bytedance/sdk/openadsdk/uef/lw/uef;

    return-void

    .line 24
    :cond_1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->bcc:Lcom/bytedance/sdk/openadsdk/uef/yo/oa;

    if-eqz p1, :cond_2

    .line 25
    sput-object p1, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->yo:Lcom/bytedance/sdk/openadsdk/uef/yo/oa;

    :cond_2
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/activity/single/TTAdActivity;Landroid/os/Bundle;Lcom/bytedance/sdk/openadsdk/uef/lw/uef;Lcom/bytedance/sdk/openadsdk/uef/yo/oa;)V
    .locals 0

    .line 6
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->wk:Landroid/os/Bundle;

    const/4 p1, 0x1

    .line 7
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->dz:I

    .line 8
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->xs:Lcom/bytedance/sdk/openadsdk/uef/lw/uef;

    .line 9
    iput-object p4, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->bcc:Lcom/bytedance/sdk/openadsdk/uef/yo/oa;

    .line 10
    iget-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->oib:Z

    if-nez p1, :cond_1

    if-eqz p2, :cond_1

    const/4 p1, 0x0

    if-nez p3, :cond_0

    .line 11
    sget-object p3, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->oa:Lcom/bytedance/sdk/openadsdk/uef/lw/uef;

    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->xs:Lcom/bytedance/sdk/openadsdk/uef/lw/uef;

    .line 12
    sput-object p1, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->oa:Lcom/bytedance/sdk/openadsdk/uef/lw/uef;

    :cond_0
    if-nez p4, :cond_1

    .line 13
    sget-object p3, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->yo:Lcom/bytedance/sdk/openadsdk/uef/yo/oa;

    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->bcc:Lcom/bytedance/sdk/openadsdk/uef/yo/oa;

    .line 14
    sput-object p1, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->yo:Lcom/bytedance/sdk/openadsdk/uef/yo/oa;

    .line 15
    :cond_1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->dj:Lcom/bytedance/sdk/openadsdk/activity/single/yo;

    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->uef(Landroid/os/Bundle;)V

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/activity/single/bcc;)V
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->dj:Lcom/bytedance/sdk/openadsdk/activity/single/yo;

    if-nez v0, :cond_0

    return-void

    .line 38
    :cond_0
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->uef(Lcom/bytedance/sdk/openadsdk/activity/single/bcc;)V

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/activity/single/bcc;Lcom/bytedance/sdk/openadsdk/activity/single/oa$lw;)V
    .locals 2

    .line 26
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->dj:Lcom/bytedance/sdk/openadsdk/activity/single/yo;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1, p2}, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->uef(Lcom/bytedance/sdk/openadsdk/activity/single/bcc;Lcom/bytedance/sdk/openadsdk/activity/single/bcc;Lcom/bytedance/sdk/openadsdk/activity/single/oa$lw;)V

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/activity/single/bcc;Z)V
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->dj:Lcom/bytedance/sdk/openadsdk/activity/single/yo;

    if-nez v0, :cond_0

    return-void

    .line 40
    :cond_0
    invoke-virtual {v0, p1, p2}, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->uef(Lcom/bytedance/sdk/openadsdk/activity/single/bcc;Z)V

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/activity/single/bcc;ZILjava/lang/String;ILjava/lang/String;I)V
    .locals 9

    .line 28
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->oib()Z

    move-result v0

    if-nez v0, :cond_0

    .line 29
    new-instance v0, Lcom/bytedance/sdk/openadsdk/activity/single/oa$2;

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    move v6, p5

    move-object v7, p6

    move/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lcom/bytedance/sdk/openadsdk/activity/single/oa$2;-><init>(Lcom/bytedance/sdk/openadsdk/activity/single/oa;Lcom/bytedance/sdk/openadsdk/activity/single/bcc;ZILjava/lang/String;ILjava/lang/String;I)V

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->ab:Ljava/lang/Runnable;

    return-void

    :cond_0
    move/from16 v8, p7

    .line 30
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->bs()Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    .line 31
    :cond_1
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->sy()V

    .line 32
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->xs:Lcom/bytedance/sdk/openadsdk/uef/lw/uef;

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->cq:Landroid/app/Activity;

    if-eqz p1, :cond_2

    .line 33
    new-instance v1, Lcom/bytedance/sdk/openadsdk/activity/single/oa$3;

    move-object v2, p0

    move v3, p2

    move v4, p3

    move-object v5, p4

    move v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/bytedance/sdk/openadsdk/activity/single/oa$3;-><init>(Lcom/bytedance/sdk/openadsdk/activity/single/oa;ZILjava/lang/String;ILjava/lang/String;)V

    move-object p3, v1

    invoke-virtual {p1, p3}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 34
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->moa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {p1, p2, v8}, Lcom/bytedance/sdk/openadsdk/component/reward/wrv;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;ZI)V

    return-void

    .line 35
    :cond_2
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->moa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    const/4 p2, 0x0

    invoke-static {p1, p2, v8}, Lcom/bytedance/sdk/openadsdk/component/reward/wrv;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;ZI)V

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/activity/single/bcc;ZZZI)V
    .locals 6

    .line 47
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->dj:Lcom/bytedance/sdk/openadsdk/activity/single/yo;

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->uef(Lcom/bytedance/sdk/openadsdk/activity/single/bcc;ZZZI)V

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/activity/single/uef;Z)V
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->dj:Lcom/bytedance/sdk/openadsdk/activity/single/yo;

    invoke-virtual {v0, p1, p2}, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->uef(Lcom/bytedance/sdk/openadsdk/activity/single/uef;Z)V

    return-void
.end method

.method public uef(Ljava/util/Map;Lcom/bytedance/sdk/openadsdk/activity/single/bcc;FF)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/bytedance/sdk/openadsdk/activity/single/bcc;",
            "FF)V"
        }
    .end annotation

    .line 45
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->dj:Lcom/bytedance/sdk/openadsdk/activity/single/yo;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->uef(Ljava/util/Map;Lcom/bytedance/sdk/openadsdk/activity/single/bcc;FF)V

    return-void
.end method

.method public uef(Z)V
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->dj:Lcom/bytedance/sdk/openadsdk/activity/single/yo;

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->uef(Z)V

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/activity/single/bcc;I)Z
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->dj:Lcom/bytedance/sdk/openadsdk/activity/single/yo;

    invoke-virtual {v0, p1, p2}, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->uef(Lcom/bytedance/sdk/openadsdk/activity/single/bcc;I)Z

    move-result p1

    return p1
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 3
    :cond_0
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->cq(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v1

    if-eqz v1, :cond_1

    return v0

    .line 4
    :cond_1
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->nl()Z

    move-result v1

    if-eqz v1, :cond_2

    return v0

    .line 5
    :cond_2
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->hzk()Lcom/bytedance/sdk/openadsdk/core/model/gr;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->hzk()Lcom/bytedance/sdk/openadsdk/core/model/gr;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gr;->moa()I

    move-result p1

    if-lez p1, :cond_3

    const/4 p1, 0x1

    return p1

    :cond_3
    return v0
.end method

.method public wk()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->xs:Lcom/bytedance/sdk/openadsdk/uef/lw/uef;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/uef/lw/uef;->oa()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->bcc:Lcom/bytedance/sdk/openadsdk/uef/yo/oa;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/uef/yo/oa;->oa()V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->dj()Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->af()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    goto :goto_0

    .line 28
    :cond_2
    const/4 v0, 0x0

    .line 29
    :goto_0
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->moa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 30
    .line 31
    const-string v2, "close"

    .line 32
    .line 33
    invoke-static {v1, v2, v0}, Lcom/bytedance/sdk/openadsdk/moa/zjm;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;I)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public wrv()Landroid/os/Bundle;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->lw:Landroid/os/Bundle;

    .line 2
    .line 3
    return-object v0
.end method

.method public xs()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->cq:Landroid/app/Activity;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public yo(Lcom/bytedance/sdk/openadsdk/activity/single/TTAdActivity;)V
    .locals 0

    const/4 p1, 0x4

    .line 2
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->dz:I

    .line 3
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->dj:Lcom/bytedance/sdk/openadsdk/activity/single/yo;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->yo()V

    .line 4
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/wrv;

    if-eqz p1, :cond_0

    .line 5
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/component/reward/wrv;->uef()V

    :cond_0
    return-void
.end method

.method public yo(Z)V
    .locals 0

    .line 6
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->sy:Z

    return-void
.end method

.method public yo()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->tpx:Z

    return v0
.end method

.method public zjm()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->dj:Lcom/bytedance/sdk/openadsdk/activity/single/yo;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->zjm()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
