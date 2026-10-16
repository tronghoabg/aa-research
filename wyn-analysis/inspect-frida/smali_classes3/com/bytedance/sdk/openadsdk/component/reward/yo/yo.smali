.class public Lcom/bytedance/sdk/openadsdk/component/reward/yo/yo;
.super Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;
.source "SourceFile"


# static fields
.field private static sy:Lcom/bytedance/sdk/openadsdk/uef/yo/oa;


# instance fields
.field private bs:Lcom/bytedance/sdk/openadsdk/uef/yo/oa;

.field private oib:J


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Landroid/view/ViewGroup;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;-><init>(Landroid/app/Activity;Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Landroid/view/ViewGroup;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    move-object p1, p0

    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 6
    .line 7
    .line 8
    move-result-wide p2

    .line 9
    iput-wide p2, p1, Lcom/bytedance/sdk/openadsdk/component/reward/yo/yo;->oib:J

    .line 10
    .line 11
    return-void
.end method

.method private bs()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->moa()Lcom/bytedance/sdk/openadsdk/core/model/uef;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    :goto_0
    return-void

    .line 13
    :cond_1
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/uef;->lw()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-eqz v1, :cond_2

    .line 18
    .line 19
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_2

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 34
    .line 35
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->wrv:Landroid/content/Context;

    .line 36
    .line 37
    invoke-static {v3, v2}, Lcom/bytedance/sdk/openadsdk/oem/IPBroadcastReceiver;->oa(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 42
    .line 43
    if-eqz v1, :cond_9

    .line 44
    .line 45
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->nj()Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    if-nez v1, :cond_3

    .line 50
    .line 51
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 52
    .line 53
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->lpy()Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    if-nez v1, :cond_3

    .line 58
    .line 59
    goto/16 :goto_3

    .line 60
    .line 61
    :cond_3
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 62
    .line 63
    const/4 v2, 0x1

    .line 64
    invoke-virtual {v1, v2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->sy(I)V

    .line 65
    .line 66
    .line 67
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 68
    .line 69
    const-string v3, "show_start"

    .line 70
    .line 71
    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->ivm:Ljava/lang/String;

    .line 72
    .line 73
    const/4 v5, 0x0

    .line 74
    invoke-static {v1, v3, v4, v5}, Lcom/bytedance/sdk/openadsdk/moa/zjm;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->moa:Landroid/app/Activity;

    .line 78
    .line 79
    if-nez v1, :cond_4

    .line 80
    .line 81
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->wrv:Landroid/content/Context;

    .line 82
    .line 83
    :cond_4
    if-nez v1, :cond_5

    .line 84
    .line 85
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    :cond_5
    new-instance v3, Landroid/content/Intent;

    .line 90
    .line 91
    const-class v4, Lcom/bytedance/sdk/openadsdk/activity/single/TTFullScreenExpressVideoActivity;

    .line 92
    .line 93
    invoke-direct {v3, v1, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 94
    .line 95
    .line 96
    const-string v4, "start_show_time"

    .line 97
    .line 98
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 99
    .line 100
    .line 101
    move-result-wide v6

    .line 102
    invoke-virtual {v3, v4, v6, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 103
    .line 104
    .line 105
    const-string v4, "enable_new_arch"

    .line 106
    .line 107
    iget-boolean v6, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->wk:Z

    .line 108
    .line 109
    invoke-virtual {v3, v4, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 110
    .line 111
    .line 112
    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->moa:Landroid/app/Activity;

    .line 113
    .line 114
    iget-boolean v6, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->yo:Z

    .line 115
    .line 116
    iget-object v7, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->uef:Ljava/lang/String;

    .line 117
    .line 118
    invoke-static {v3, v4, v6, v0, v7}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/yo;->uef(Landroid/content/Intent;Landroid/app/Activity;ZLcom/bytedance/sdk/openadsdk/core/model/uef;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->wk:Z

    .line 122
    .line 123
    if-eqz v0, :cond_6

    .line 124
    .line 125
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/cp;->uef()Lcom/bytedance/sdk/openadsdk/core/cp;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->uef:Ljava/lang/String;

    .line 130
    .line 131
    iget-object v6, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/yo;->bs:Lcom/bytedance/sdk/openadsdk/uef/yo/oa;

    .line 132
    .line 133
    invoke-virtual {v0, v4, v6}, Lcom/bytedance/sdk/openadsdk/core/cp;->uef(Ljava/lang/String;Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_6
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/cp;->uef()Lcom/bytedance/sdk/openadsdk/core/cp;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/yo;->bs:Lcom/bytedance/sdk/openadsdk/uef/yo/oa;

    .line 142
    .line 143
    invoke-virtual {v0, v4}, Lcom/bytedance/sdk/openadsdk/core/cp;->uef(Lcom/bytedance/sdk/openadsdk/uef/yo/oa;)V

    .line 144
    .line 145
    .line 146
    :goto_2
    iput-object v5, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/yo;->bs:Lcom/bytedance/sdk/openadsdk/uef/yo/oa;

    .line 147
    .line 148
    const-string v0, "back_up"

    .line 149
    .line 150
    invoke-virtual {v3, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 151
    .line 152
    .line 153
    const-string v0, "start_activity_async"

    .line 154
    .line 155
    const/4 v4, 0x0

    .line 156
    invoke-static {v0, v4}, Lcom/bytedance/sdk/openadsdk/gzw/lw;->uef(Ljava/lang/String;I)I

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    if-ne v0, v2, :cond_7

    .line 161
    .line 162
    move v4, v2

    .line 163
    :cond_7
    if-eqz v4, :cond_8

    .line 164
    .line 165
    new-instance v0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/yo$2;

    .line 166
    .line 167
    invoke-direct {v0, p0}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/yo$2;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/yo/yo;)V

    .line 168
    .line 169
    .line 170
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/sy/yo;->uef(Lcom/bytedance/sdk/openadsdk/sy/moa;)V

    .line 171
    .line 172
    .line 173
    :cond_8
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 174
    .line 175
    .line 176
    move-result-wide v5

    .line 177
    new-instance v0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/yo$3;

    .line 178
    .line 179
    invoke-direct {v0, p0, v4, v5, v6}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/yo$3;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/yo/yo;ZJ)V

    .line 180
    .line 181
    .line 182
    invoke-static {v1, v3, v0, v2}, Lcom/bytedance/sdk/component/utils/oa;->uef(Landroid/content/Context;Landroid/content/Intent;Lcom/bytedance/sdk/component/utils/oa$oa;Z)Z

    .line 183
    .line 184
    .line 185
    return-void

    .line 186
    :cond_9
    :goto_3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 187
    .line 188
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->ivm:Ljava/lang/String;

    .line 189
    .line 190
    const-string v2, "video_or_image_empty"

    .line 191
    .line 192
    const-string v3, "show_ad_fail"

    .line 193
    .line 194
    invoke-static {v0, v3, v1, v2}, Lcom/bytedance/sdk/openadsdk/moa/zjm;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    return-void
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/component/reward/yo/yo;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/yo;->bs()V

    return-void
.end method


# virtual methods
.method public dj()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/yo;->bs:Lcom/bytedance/sdk/openadsdk/uef/yo/oa;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/uef/yo/oa;->uef()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 10
    .line 11
    const-string v1, "show"

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/moa/zjm;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;I)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public finalize()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->wk:Z

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    sput-object v0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/yo;->sy:Lcom/bytedance/sdk/openadsdk/uef/yo/oa;

    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public oa(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->wk:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/yo;->bs:Lcom/bytedance/sdk/openadsdk/uef/yo/oa;

    .line 6
    .line 7
    sput-object v0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/yo;->sy:Lcom/bytedance/sdk/openadsdk/uef/yo/oa;

    .line 8
    .line 9
    :cond_0
    invoke-super {p0, p1}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->oa(Landroid/os/Bundle;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public onRenderFail(Landroid/view/View;Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->onRenderFail(Landroid/view/View;Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/wk;->yo()Landroid/os/Handler;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    new-instance p2, Lcom/bytedance/sdk/openadsdk/component/reward/yo/yo$1;

    .line 9
    .line 10
    invoke-direct {p2, p0}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/yo$1;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/yo/yo;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public uef(ZILjava/lang/String;ILjava/lang/String;I)V
    .locals 0

    .line 1
    return-void
.end method

.method public uef(ZZ)V
    .locals 2

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->uef:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 4
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/cp;->uef()Lcom/bytedance/sdk/openadsdk/core/cp;

    move-result-object v0

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->uef:Ljava/lang/String;

    invoke-virtual {v0, v1, p1, p2}, Lcom/bytedance/sdk/openadsdk/core/cp;->uef(Ljava/lang/String;ZZ)V

    .line 5
    :cond_0
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->wk:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->uef:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 6
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/cp;->uef()Lcom/bytedance/sdk/openadsdk/core/cp;

    move-result-object v0

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->uef:Ljava/lang/String;

    invoke-virtual {v0, v1, p1, p2}, Lcom/bytedance/sdk/openadsdk/core/cp;->uef(Ljava/lang/String;ZZ)V

    :cond_1
    return-void
.end method

.method public wk()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/yo;->bs:Lcom/bytedance/sdk/openadsdk/uef/yo/oa;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/uef/yo/oa;->oa()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 13
    .line 14
    const-string v1, "close"

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-static {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/moa/zjm;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;I)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public wrv()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/yo;->bs:Lcom/bytedance/sdk/openadsdk/uef/yo/oa;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/api/PAGAdWrapperListener;->onAdClicked()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public xs()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->xs()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->cq:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->ab()V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->moa:Landroid/app/Activity;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->moa:Landroid/app/Activity;

    .line 22
    .line 23
    invoke-virtual {v1}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-virtual {p0, v0, v1}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/yo;->uef(ZZ)V

    .line 28
    .line 29
    .line 30
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->wk:Z

    .line 31
    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/yo;->bs:Lcom/bytedance/sdk/openadsdk/uef/yo/oa;

    .line 36
    .line 37
    :cond_1
    return-void
.end method

.method public yo(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->yo(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->wk:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/cp;->uef()Lcom/bytedance/sdk/openadsdk/core/cp;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->uef:Ljava/lang/String;

    .line 13
    .line 14
    const-class v1, Lcom/bytedance/sdk/openadsdk/uef/yo/oa;

    .line 15
    .line 16
    invoke-virtual {p1, v0, v1}, Lcom/bytedance/sdk/openadsdk/core/cp;->uef(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Lcom/bytedance/sdk/openadsdk/uef/yo/oa;

    .line 21
    .line 22
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/yo;->bs:Lcom/bytedance/sdk/openadsdk/uef/yo/oa;

    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/cp;->uef()Lcom/bytedance/sdk/openadsdk/core/cp;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/cp;->yo()Lcom/bytedance/sdk/openadsdk/uef/yo/oa;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/yo;->bs:Lcom/bytedance/sdk/openadsdk/uef/yo/oa;

    .line 34
    .line 35
    if-nez v0, :cond_1

    .line 36
    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    sget-object p1, Lcom/bytedance/sdk/openadsdk/component/reward/yo/yo;->sy:Lcom/bytedance/sdk/openadsdk/uef/yo/oa;

    .line 40
    .line 41
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/yo;->bs:Lcom/bytedance/sdk/openadsdk/uef/yo/oa;

    .line 42
    .line 43
    const/4 p1, 0x0

    .line 44
    sput-object p1, Lcom/bytedance/sdk/openadsdk/component/reward/yo/yo;->sy:Lcom/bytedance/sdk/openadsdk/uef/yo/oa;

    .line 45
    .line 46
    :cond_1
    return-void
.end method
