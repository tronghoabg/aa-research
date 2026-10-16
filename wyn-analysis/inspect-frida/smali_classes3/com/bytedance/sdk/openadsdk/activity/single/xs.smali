.class public Lcom/bytedance/sdk/openadsdk/activity/single/xs;
.super Lcom/bytedance/sdk/openadsdk/activity/single/uef;
.source "SourceFile"


# static fields
.field private static dhk:Ljava/lang/String;

.field private static gsd:Ljava/lang/String;

.field private static gzw:Ljava/lang/String;

.field private static orq:Ljava/lang/String;

.field private static tpx:Ljava/lang/String;


# instance fields
.field private rt:I


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/activity/single/oa;Lcom/bytedance/sdk/openadsdk/core/model/gzw;IIZ)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lcom/bytedance/sdk/openadsdk/activity/single/uef;-><init>(Lcom/bytedance/sdk/openadsdk/activity/single/oa;Lcom/bytedance/sdk/openadsdk/core/model/gzw;IIZ)V

    .line 2
    .line 3
    .line 4
    move-object p1, p0

    .line 5
    const/4 p2, -0x1

    .line 6
    iput p2, p1, Lcom/bytedance/sdk/openadsdk/activity/single/xs;->rt:I

    .line 7
    .line 8
    return-void
.end method

.method public static synthetic oa(Lcom/bytedance/sdk/openadsdk/activity/single/xs;Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/bytedance/sdk/openadsdk/activity/single/uef;->uef(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method private ou()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->tpx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->dxx()V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;-><init>()V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 14
    .line 15
    iget-object v1, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->tpx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;

    .line 16
    .line 17
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->cq()J

    .line 18
    .line 19
    .line 20
    move-result-wide v1

    .line 21
    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->oa(J)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 25
    .line 26
    iget-object v1, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->tpx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;

    .line 27
    .line 28
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->gr()J

    .line 29
    .line 30
    .line 31
    move-result-wide v1

    .line 32
    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->moa(J)V

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 36
    .line 37
    iget-object v1, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->tpx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;

    .line 38
    .line 39
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->bs()J

    .line 40
    .line 41
    .line 42
    move-result-wide v1

    .line 43
    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->yo(J)V

    .line 44
    .line 45
    .line 46
    const/4 v1, 0x3

    .line 47
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->yo(I)V

    .line 48
    .line 49
    .line 50
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 51
    .line 52
    iget-object v1, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->tpx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;

    .line 53
    .line 54
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->rt()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->moa(I)V

    .line 59
    .line 60
    .line 61
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 62
    .line 63
    iget-object v1, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->tpx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;

    .line 64
    .line 65
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->oa()J

    .line 66
    .line 67
    .line 68
    move-result-wide v1

    .line 69
    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->uef(J)V

    .line 70
    .line 71
    .line 72
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 73
    .line 74
    iget-object v1, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->tpx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;

    .line 75
    .line 76
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->bcc()Lcom/bykv/vk/openvk/uef/uef/uef/oa/uef;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 81
    .line 82
    iget-object v2, v2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->tpx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;

    .line 83
    .line 84
    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->lw()Lcom/bytedance/sdk/openadsdk/moa/xs;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-static {v1, v0, v2}, Lcom/bytedance/sdk/openadsdk/moa/lw/uef/uef;->uef(Lcom/bykv/vk/openvk/uef/uef/uef/oa/uef;Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;Lcom/bytedance/sdk/openadsdk/moa/xs;)V

    .line 89
    .line 90
    .line 91
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 92
    .line 93
    iget v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->ivm:I

    .line 94
    .line 95
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/pz;->yo(I)V

    .line 96
    .line 97
    .line 98
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 99
    .line 100
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->tpx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;

    .line 101
    .line 102
    const-string v1, "skip"

    .line 103
    .line 104
    const/4 v2, 0x0

    .line 105
    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->uef(Ljava/lang/String;Z)V

    .line 106
    .line 107
    .line 108
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 109
    .line 110
    iget-boolean v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->yo:Z

    .line 111
    .line 112
    if-eqz v0, :cond_0

    .line 113
    .line 114
    const/4 v0, 0x1

    .line 115
    const/4 v1, 0x4

    .line 116
    invoke-virtual {p0, v0, v1}, Lcom/bytedance/sdk/openadsdk/activity/single/uef;->uef(ZI)V

    .line 117
    .line 118
    .line 119
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 120
    .line 121
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 122
    .line 123
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-eqz v0, :cond_1

    .line 128
    .line 129
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 130
    .line 131
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->cq:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 132
    .line 133
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    if-nez v0, :cond_1

    .line 138
    .line 139
    :cond_0
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->swd()V

    .line 140
    .line 141
    .line 142
    :cond_1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 143
    .line 144
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 145
    .line 146
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->odd()Lcom/bytedance/sdk/openadsdk/core/model/moa;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    if-eqz v0, :cond_2

    .line 151
    .line 152
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/moa;->uef()Lcom/bytedance/sdk/openadsdk/core/dz/moa;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    if-eqz v0, :cond_2

    .line 157
    .line 158
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 159
    .line 160
    iget-object v1, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->tpx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;

    .line 161
    .line 162
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->cq()J

    .line 163
    .line 164
    .line 165
    move-result-wide v1

    .line 166
    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->ivm(J)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->lw(J)V

    .line 170
    .line 171
    .line 172
    :cond_2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 173
    .line 174
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 175
    .line 176
    const/4 v1, 0x5

    .line 177
    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/gsd/oa/lw;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;I)V

    .line 178
    .line 179
    .line 180
    return-void
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/activity/single/xs;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/activity/single/xs;->ou()V

    return-void
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/activity/single/xs;Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 0

    .line 2
    invoke-super {p0, p1, p2}, Lcom/bytedance/sdk/openadsdk/activity/single/uef;->uef(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/activity/single/xs;ZZLjava/lang/Runnable;)Z
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2, p3}, Lcom/bytedance/sdk/openadsdk/activity/single/xs;->uef(ZZLjava/lang/Runnable;)Z

    move-result p0

    return p0
.end method

.method private uef(ZZLjava/lang/Runnable;)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p2, :cond_0

    .line 30
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->xs:Lcom/bytedance/sdk/openadsdk/activity/single/oa;

    .line 31
    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->cq()Z

    move-result p2

    if-eqz p2, :cond_0

    if-eqz p3, :cond_0

    return v0

    .line 32
    :cond_0
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->moa()Lcom/bytedance/sdk/openadsdk/core/settings/dj;

    move-result-object p2

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget v1, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->ivm:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->bcc(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_3

    if-nez p3, :cond_2

    if-eqz p1, :cond_1

    .line 33
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->swd()V

    return v0

    .line 34
    :cond_1
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/activity/single/xs;->ou()V

    :cond_2
    return v0

    .line 35
    :cond_3
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->xs:Lcom/bytedance/sdk/openadsdk/activity/single/oa;

    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->bs()Z

    move-result p2

    if-eqz p2, :cond_6

    if-nez p3, :cond_5

    if-eqz p1, :cond_4

    .line 36
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->swd()V

    return v0

    .line 37
    :cond_4
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/activity/single/xs;->ou()V

    :cond_5
    return v0

    .line 38
    :cond_6
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p2, p2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->bs:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 39
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p2, p2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->tpx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;

    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->orq()V

    if-eqz p1, :cond_7

    .line 40
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p2, p2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gzw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/cz;

    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/cz;->ivm()V

    .line 41
    :cond_7
    new-instance p2, Lcom/bytedance/sdk/openadsdk/core/widget/oa;

    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->rl()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {p2, v1}, Lcom/bytedance/sdk/openadsdk/core/widget/oa;-><init>(Landroid/content/Context;)V

    .line 42
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/uef;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/oa/oa;

    iput-object p2, v1, Lcom/bytedance/sdk/openadsdk/component/reward/oa/oa;->wrv:Lcom/bytedance/sdk/openadsdk/core/widget/oa;

    if-eqz p1, :cond_8

    .line 43
    sget-object v1, Lcom/bytedance/sdk/openadsdk/activity/single/xs;->dhk:Ljava/lang/String;

    invoke-virtual {p2, v1}, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/widget/oa;

    move-result-object v1

    sget-object v2, Lcom/bytedance/sdk/openadsdk/activity/single/xs;->tpx:Ljava/lang/String;

    .line 44
    invoke-virtual {v1, v2}, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->yo(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/widget/oa;

    move-result-object v1

    sget-object v2, Lcom/bytedance/sdk/openadsdk/activity/single/xs;->orq:Ljava/lang/String;

    .line 45
    invoke-virtual {v1, v2}, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->moa(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/widget/oa;

    goto :goto_0

    .line 46
    :cond_8
    sget-object v1, Lcom/bytedance/sdk/openadsdk/activity/single/xs;->gzw:Ljava/lang/String;

    invoke-virtual {p2, v1}, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/widget/oa;

    move-result-object v1

    sget-object v2, Lcom/bytedance/sdk/openadsdk/activity/single/xs;->gsd:Ljava/lang/String;

    .line 47
    invoke-virtual {v1, v2}, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->yo(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/widget/oa;

    move-result-object v1

    sget-object v2, Lcom/bytedance/sdk/openadsdk/activity/single/xs;->orq:Ljava/lang/String;

    .line 48
    invoke-virtual {v1, v2}, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->moa(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/widget/oa;

    .line 49
    :goto_0
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/uef;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/oa/oa;

    iget-object v1, v1, Lcom/bytedance/sdk/openadsdk/component/reward/oa/oa;->wrv:Lcom/bytedance/sdk/openadsdk/core/widget/oa;

    new-instance v2, Lcom/bytedance/sdk/openadsdk/activity/single/xs$3;

    invoke-direct {v2, p0, p1, p2, p3}, Lcom/bytedance/sdk/openadsdk/activity/single/xs$3;-><init>(Lcom/bytedance/sdk/openadsdk/activity/single/xs;ZLcom/bytedance/sdk/openadsdk/core/widget/oa;Ljava/lang/Runnable;)V

    invoke-virtual {v1, v2}, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->uef(Lcom/bytedance/sdk/openadsdk/core/widget/oa$oa;)Lcom/bytedance/sdk/openadsdk/core/widget/oa;

    move-result-object p1

    .line 50
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/widget/oa;->show()V

    return v0
.end method


# virtual methods
.method public b_()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->xs:Lcom/bytedance/sdk/openadsdk/activity/single/oa;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->yo()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-super {p0}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->b_()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 16
    .line 17
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oyt:Lcom/bytedance/sdk/openadsdk/component/reward/view/dj;

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/view/dj;->zjm()Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    new-instance v1, Lcom/bytedance/sdk/openadsdk/activity/single/xs$1;

    .line 26
    .line 27
    invoke-direct {v1, p0}, Lcom/bytedance/sdk/openadsdk/activity/single/xs$1;-><init>(Lcom/bytedance/sdk/openadsdk/activity/single/xs;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    invoke-virtual {v0, v2, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 41
    .line 42
    iget-object v1, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->dxx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/cq;

    .line 43
    .line 44
    new-instance v2, Lcom/bytedance/sdk/openadsdk/activity/single/xs$2;

    .line 45
    .line 46
    invoke-direct {v2, p0, v0}, Lcom/bytedance/sdk/openadsdk/activity/single/xs$2;-><init>(Lcom/bytedance/sdk/openadsdk/activity/single/xs;Landroid/view/View;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, v2}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/cq;->uef(Lcom/bytedance/sdk/openadsdk/component/reward/top/oa;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public bs()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->etd()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public d_()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public e_()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "rewarded_video"

    .line 2
    .line 3
    return-object v0
.end method

.method public f_()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->pz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/moa;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/uef;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/oa/oa;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/moa;->uef(Lcom/bytedance/sdk/openadsdk/component/reward/oa/oa;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public g_()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 2
    .line 3
    iget-boolean v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gem:Z

    .line 4
    .line 5
    return v0
.end method

.method public km()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->km()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/uef;->lw:Z

    .line 6
    .line 7
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 8
    .line 9
    iget-object v1, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gsd:Lcom/bytedance/sdk/openadsdk/component/reward/view/cz;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Lcom/bytedance/sdk/openadsdk/component/reward/view/cz;->oa(Z)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 15
    .line 16
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->tpx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->gem()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public oa()V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->dxx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/cq;

    const/4 v1, 0x0

    invoke-static {}, Lcom/bytedance/sdk/openadsdk/common/TTAdDislikeToast;->getSkipText()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/cq;->uef(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->dxx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/cq;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/cq;->lw(Z)V

    return-void
.end method

.method public oa(I)V
    .locals 1

    const/16 v0, 0x2710

    if-ne p1, v0, :cond_0

    .line 4
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->etd()V

    :cond_0
    return-void
.end method

.method public uef(Landroid/app/Activity;Lcom/bytedance/sdk/openadsdk/activity/single/oa$lw;)V
    .locals 0

    .line 4
    invoke-super {p0, p1, p2}, Lcom/bytedance/sdk/openadsdk/activity/single/uef;->uef(Landroid/app/Activity;Lcom/bytedance/sdk/openadsdk/activity/single/oa$lw;)V

    .line 5
    invoke-static {p1}, Lcom/bytedance/sdk/component/utils/oa;->uef(Landroid/app/Activity;)Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_1

    .line 6
    :cond_0
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    .line 7
    const-string p2, "media_extra"

    invoke-virtual {p1, p2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->wk:Ljava/lang/String;

    .line 8
    const-string p2, "user_id"

    invoke-virtual {p1, p2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->dz:Ljava/lang/String;

    .line 9
    :try_start_0
    sget-object p1, Lcom/bytedance/sdk/openadsdk/activity/single/xs;->gzw:Ljava/lang/String;

    if-nez p1, :cond_1

    .line 10
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->af:Landroid/content/Context;

    const-string p2, "tt_reward_msg"

    invoke-static {p1, p2}, Lcom/bytedance/sdk/component/utils/orq;->uef(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sput-object p1, Lcom/bytedance/sdk/openadsdk/activity/single/xs;->gzw:Ljava/lang/String;

    .line 11
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->af:Landroid/content/Context;

    const-string p2, "tt_msgPlayable"

    invoke-static {p1, p2}, Lcom/bytedance/sdk/component/utils/orq;->uef(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sput-object p1, Lcom/bytedance/sdk/openadsdk/activity/single/xs;->dhk:Ljava/lang/String;

    .line 12
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->af:Landroid/content/Context;

    const-string p2, "tt_negtiveBtnBtnText"

    invoke-static {p1, p2}, Lcom/bytedance/sdk/component/utils/orq;->uef(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sput-object p1, Lcom/bytedance/sdk/openadsdk/activity/single/xs;->orq:Ljava/lang/String;

    .line 13
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->af:Landroid/content/Context;

    const-string p2, "tt_postiveBtnText"

    invoke-static {p1, p2}, Lcom/bytedance/sdk/component/utils/orq;->uef(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sput-object p1, Lcom/bytedance/sdk/openadsdk/activity/single/xs;->gsd:Ljava/lang/String;

    .line 14
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->af:Landroid/content/Context;

    const-string p2, "tt_postiveBtnTextPlayable"

    invoke-static {p1, p2}, Lcom/bytedance/sdk/component/utils/orq;->uef(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sput-object p1, Lcom/bytedance/sdk/openadsdk/activity/single/xs;->tpx:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 15
    const-string p2, "TTAD.RewardAdScene"

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/bytedance/sdk/component/utils/dhk;->yo(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    if-eqz p1, :cond_2

    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->xs:Lcom/bytedance/sdk/openadsdk/activity/single/oa;

    if-eqz p2, :cond_2

    .line 17
    iget-object p2, p2, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/wrv;

    iput-object p2, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->xvp:Lcom/bytedance/sdk/openadsdk/component/reward/wrv;

    :cond_2
    :goto_1
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;)V
    .locals 2

    .line 57
    iget-boolean v0, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->yo:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    const/4 v1, 0x4

    .line 58
    invoke-virtual {p0, v0, v1}, Lcom/bytedance/sdk/openadsdk/activity/single/uef;->uef(ZI)V

    .line 59
    iget-object v0, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->cq:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_1

    .line 60
    :cond_0
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->swd()V

    .line 61
    :cond_1
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/common/uef;->oa(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;)V

    return-void
.end method

.method public uef(Ljava/lang/String;)V
    .locals 2

    .line 18
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-boolean v1, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gem:Z

    xor-int/lit8 v1, v1, 0x1

    iput-boolean v1, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gem:Z

    .line 19
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gsd:Lcom/bytedance/sdk/openadsdk/component/reward/view/cz;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/view/cz;->uef()Lcom/bytedance/sdk/openadsdk/component/reward/view/yo;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 20
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gsd:Lcom/bytedance/sdk/openadsdk/component/reward/view/cz;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/view/cz;->uef()Lcom/bytedance/sdk/openadsdk/component/reward/view/yo;

    move-result-object v0

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-boolean v1, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gem:Z

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/component/reward/view/yo;->setSoundMute(Z)V

    .line 21
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "will set is Mute "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-boolean v1, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gem:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, " mLastVolume="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v1, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->cp:Lcom/bytedance/sdk/openadsdk/cq/zjm;

    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/cq/zjm;->uef()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 22
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v1, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->tpx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;

    iget-boolean v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gem:Z

    invoke-virtual {v1, v0, p1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->uef(ZLjava/lang/String;)V

    .line 23
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v0, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->ku:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    iget-boolean p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gem:Z

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->lw(Z)V

    .line 24
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    if-eqz p1, :cond_2

    .line 25
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->odd()Lcom/bytedance/sdk/openadsdk/core/model/moa;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 26
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/moa;->uef()Lcom/bytedance/sdk/openadsdk/core/dz/moa;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 27
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-boolean v1, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gem:Z

    if-eqz v1, :cond_1

    .line 28
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->tpx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->cq()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->bcc(J)V

    return-void

    .line 29
    :cond_1
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->tpx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->cq()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->cz(J)V

    :cond_2
    return-void
.end method

.method public uef(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 4

    .line 51
    const-string v0, "skipToNextAd"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->sw:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->xs:Lcom/bytedance/sdk/openadsdk/activity/single/oa;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->rt()Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    move-result-object v0

    if-nez v0, :cond_1

    .line 52
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->xs:Lcom/bytedance/sdk/openadsdk/activity/single/oa;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->yo()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 53
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->oib:Lcom/bytedance/sdk/openadsdk/common/ab;

    if-eqz v0, :cond_1

    .line 54
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v2, v2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {v2}, Lcom/bytedance/sdk/openadsdk/core/model/cp;->yo(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v2

    new-instance v3, Lcom/bytedance/sdk/openadsdk/activity/single/xs$4;

    invoke-direct {v3, p0, p1, p2}, Lcom/bytedance/sdk/openadsdk/activity/single/xs$4;-><init>(Lcom/bytedance/sdk/openadsdk/activity/single/xs;Ljava/lang/String;Lorg/json/JSONObject;)V

    invoke-virtual {v0, v2, v1, v3}, Lcom/bytedance/sdk/openadsdk/common/ab;->uef(ZZLjava/lang/Runnable;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 55
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/model/cp;->yo(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v0

    new-instance v2, Lcom/bytedance/sdk/openadsdk/activity/single/xs$5;

    invoke-direct {v2, p0, p1, p2}, Lcom/bytedance/sdk/openadsdk/activity/single/xs$5;-><init>(Lcom/bytedance/sdk/openadsdk/activity/single/xs;Ljava/lang/String;Lorg/json/JSONObject;)V

    invoke-direct {p0, v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/activity/single/xs;->uef(ZZLjava/lang/Runnable;)Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    return-void

    .line 56
    :cond_1
    invoke-super {p0, p1, p2}, Lcom/bytedance/sdk/openadsdk/activity/single/uef;->uef(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method public xs()Landroid/widget/FrameLayout;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->ivm:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ivm()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gsd:Lcom/bytedance/sdk/openadsdk/component/reward/view/cz;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/view/cz;->oa()Landroid/widget/FrameLayout;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0

    .line 22
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oyt:Lcom/bytedance/sdk/openadsdk/component/reward/view/dj;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/view/dj;->ivm()Landroid/widget/FrameLayout;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    return-object v0

    .line 35
    :cond_1
    const/4 v0, 0x0

    .line 36
    return-object v0
.end method
