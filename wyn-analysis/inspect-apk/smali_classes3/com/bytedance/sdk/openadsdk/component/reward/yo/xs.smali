.class public Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs;
.super Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/component/reward/yo/ivm;


# static fields
.field private static oib:Lcom/bytedance/sdk/openadsdk/uef/lw/uef;


# instance fields
.field public bs:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;

.field private dhk:J

.field private orq:Ljava/lang/String;

.field private sy:Lcom/bytedance/sdk/openadsdk/uef/lw/uef;

.field private tpx:Ljava/lang/String;


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
    iput-wide p2, p1, Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs;->dhk:J

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
    goto/16 :goto_2

    .line 6
    .line 7
    :cond_0
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->moa()Lcom/bytedance/sdk/openadsdk/core/model/uef;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_7

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/uef;->ivm()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    goto/16 :goto_2

    .line 20
    .line 21
    :cond_1
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/uef;->xs()Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/uef;->lw()Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    if-eqz v2, :cond_2

    .line 30
    .line 31
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_2

    .line 40
    .line 41
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    check-cast v3, Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 46
    .line 47
    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->wrv:Landroid/content/Context;

    .line 48
    .line 49
    invoke-static {v4, v3}, Lcom/bytedance/sdk/openadsdk/oem/IPBroadcastReceiver;->oa(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    const/4 v2, 0x1

    .line 54
    invoke-virtual {v1, v2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->sy(I)V

    .line 55
    .line 56
    .line 57
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->moa:Landroid/app/Activity;

    .line 58
    .line 59
    if-nez v3, :cond_3

    .line 60
    .line 61
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->wrv:Landroid/content/Context;

    .line 62
    .line 63
    :cond_3
    if-nez v3, :cond_4

    .line 64
    .line 65
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    :cond_4
    new-instance v4, Landroid/content/Intent;

    .line 70
    .line 71
    const-class v5, Lcom/bytedance/sdk/openadsdk/activity/single/TTRewardExpressVideoActivity;

    .line 72
    .line 73
    invoke-direct {v4, v3, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 74
    .line 75
    .line 76
    iget-object v5, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->moa:Landroid/app/Activity;

    .line 77
    .line 78
    iget-boolean v6, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->yo:Z

    .line 79
    .line 80
    iget-object v7, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->uef:Ljava/lang/String;

    .line 81
    .line 82
    invoke-static {v4, v5, v6, v0, v7}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/yo;->uef(Landroid/content/Intent;Landroid/app/Activity;ZLcom/bytedance/sdk/openadsdk/core/model/uef;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    const-string v0, "media_extra"

    .line 86
    .line 87
    iget-object v5, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs;->tpx:Ljava/lang/String;

    .line 88
    .line 89
    invoke-virtual {v4, v0, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 90
    .line 91
    .line 92
    const-string v0, "user_id"

    .line 93
    .line 94
    iget-object v5, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs;->orq:Ljava/lang/String;

    .line 95
    .line 96
    invoke-virtual {v4, v0, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 97
    .line 98
    .line 99
    const-string v0, "start_show_time"

    .line 100
    .line 101
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 102
    .line 103
    .line 104
    move-result-wide v5

    .line 105
    invoke-virtual {v4, v0, v5, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 106
    .line 107
    .line 108
    const-string v0, "enable_new_arch"

    .line 109
    .line 110
    iget-boolean v5, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->wk:Z

    .line 111
    .line 112
    invoke-virtual {v4, v0, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 113
    .line 114
    .line 115
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->wk:Z

    .line 116
    .line 117
    if-eqz v0, :cond_5

    .line 118
    .line 119
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/cp;->uef()Lcom/bytedance/sdk/openadsdk/core/cp;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    iget-object v5, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->uef:Ljava/lang/String;

    .line 124
    .line 125
    iget-object v6, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs;->sy:Lcom/bytedance/sdk/openadsdk/uef/lw/uef;

    .line 126
    .line 127
    invoke-virtual {v0, v5, v6}, Lcom/bytedance/sdk/openadsdk/core/cp;->uef(Ljava/lang/String;Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_5
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/cp;->uef()Lcom/bytedance/sdk/openadsdk/core/cp;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    iget-object v5, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs;->sy:Lcom/bytedance/sdk/openadsdk/uef/lw/uef;

    .line 136
    .line 137
    invoke-virtual {v0, v5}, Lcom/bytedance/sdk/openadsdk/core/cp;->uef(Lcom/bytedance/sdk/openadsdk/uef/lw/uef;)V

    .line 138
    .line 139
    .line 140
    :goto_1
    const/4 v0, 0x0

    .line 141
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs;->sy:Lcom/bytedance/sdk/openadsdk/uef/lw/uef;

    .line 142
    .line 143
    const-string v0, "back_up"

    .line 144
    .line 145
    invoke-virtual {v4, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 146
    .line 147
    .line 148
    const-string v0, "start_activity_async"

    .line 149
    .line 150
    const/4 v5, 0x0

    .line 151
    invoke-static {v0, v5}, Lcom/bytedance/sdk/openadsdk/gzw/lw;->uef(Ljava/lang/String;I)I

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    if-ne v0, v2, :cond_6

    .line 156
    .line 157
    new-instance v0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs$2;

    .line 158
    .line 159
    invoke-direct {v0, p0}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs$2;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs;)V

    .line 160
    .line 161
    .line 162
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/sy/yo;->uef(Lcom/bytedance/sdk/openadsdk/sy/moa;)V

    .line 163
    .line 164
    .line 165
    :cond_6
    new-instance v0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs$3;

    .line 166
    .line 167
    invoke-direct {v0, p0, v1}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs$3;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    .line 168
    .line 169
    .line 170
    invoke-static {v3, v4, v0, v2}, Lcom/bytedance/sdk/component/utils/oa;->uef(Landroid/content/Context;Landroid/content/Intent;Lcom/bytedance/sdk/component/utils/oa$oa;Z)Z

    .line 171
    .line 172
    .line 173
    :cond_7
    :goto_2
    return-void
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs;->bs()V

    return-void
.end method

.method private yo(ZILjava/lang/String;ILjava/lang/String;I)V
    .locals 10

    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "invoke callback onRewardVerify: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "; "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "UnifyRewardBundle"

    invoke-static {v1, v0}, Lcom/bytedance/sdk/component/utils/dhk;->uef(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    new-instance v2, Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs$4;

    move-object v3, p0

    move v4, p1

    move v5, p2

    move-object v6, p3

    move v7, p4

    move-object v8, p5

    move/from16 v9, p6

    invoke-direct/range {v2 .. v9}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs$4;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs;ZILjava/lang/String;ILjava/lang/String;I)V

    invoke-static {v2}, Lcom/bytedance/sdk/openadsdk/utils/km;->uef(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method public cq()V
    .locals 7

    .line 1
    invoke-super {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->cq()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs;->bs:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-wide v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->dz:J

    .line 9
    .line 10
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 11
    .line 12
    .line 13
    move-result-wide v3

    .line 14
    iget-wide v5, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->dz:J

    .line 15
    .line 16
    sub-long/2addr v3, v5

    .line 17
    long-to-int v3, v3

    .line 18
    const/16 v4, 0xe

    .line 19
    .line 20
    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;->uef(JII)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public dj()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs;->sy:Lcom/bytedance/sdk/openadsdk/uef/lw/uef;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/uef/lw/uef;->uef()V

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
    sput-object v0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs;->oib:Lcom/bytedance/sdk/openadsdk/uef/lw/uef;

    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public ivm()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->ivm()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public lw()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->xs:Lcom/bytedance/sdk/openadsdk/component/reward/uef/wk;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wk;->uef(Lcom/bytedance/sdk/openadsdk/component/reward/yo/ivm;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->lw()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public oa(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->wk:Z

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs;->sy:Lcom/bytedance/sdk/openadsdk/uef/lw/uef;

    sput-object v0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs;->oib:Lcom/bytedance/sdk/openadsdk/uef/lw/uef;

    .line 3
    :cond_0
    invoke-super {p0, p1}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->oa(Landroid/os/Bundle;)V

    .line 4
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs;->bs:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;

    if-eqz p1, :cond_1

    .line 5
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;->uef()V

    :cond_1
    return-void
.end method

.method public oa(ZILjava/lang/String;ILjava/lang/String;I)V
    .locals 0

    .line 6
    invoke-direct/range {p0 .. p6}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs;->yo(ZILjava/lang/String;ILjava/lang/String;I)V

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
    new-instance p2, Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs$1;

    .line 9
    .line 10
    invoke-direct {p2, p0}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs$1;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public uef(JI)V
    .locals 2

    .line 14
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs;->bs:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;

    if-eqz v0, :cond_0

    const/16 v1, 0xd

    .line 15
    invoke-virtual {v0, p1, p2, p3, v1}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;->uef(JII)V

    :cond_0
    return-void
.end method

.method public uef(Landroid/os/Bundle;)V
    .locals 5

    .line 2
    invoke-super {p0, p1}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->uef(Landroid/os/Bundle;)V

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->moa:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    const-string v1, "media_extra"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs;->tpx:Ljava/lang/String;

    .line 5
    const-string v1, "user_id"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs;->orq:Ljava/lang/String;

    .line 6
    :cond_0
    new-instance v0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->moa:Landroid/app/Activity;

    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs;->orq:Ljava/lang/String;

    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs;->tpx:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;-><init>(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs;->bs:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;

    .line 7
    invoke-virtual {v0, p0}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;->uef(Lcom/bytedance/sdk/openadsdk/component/reward/yo/ivm;)V

    if-eqz p1, :cond_1

    .line 8
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs;->bs:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;->oa()V

    :cond_1
    return-void
.end method

.method public uef(ZILjava/lang/String;ILjava/lang/String;I)V
    .locals 6

    .line 9
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs;->sy:Lcom/bytedance/sdk/openadsdk/uef/lw/uef;

    if-eqz v0, :cond_0

    move v1, p1

    move v2, p2

    move-object v3, p3

    move v4, p4

    move-object v5, p5

    .line 10
    invoke-interface/range {v0 .. v5}, Lcom/bytedance/sdk/openadsdk/uef/lw/uef;->uef(ZILjava/lang/String;ILjava/lang/String;)V

    .line 11
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {p1, v1, p6}, Lcom/bytedance/sdk/openadsdk/component/reward/wrv;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;ZI)V

    :cond_0
    return-void
.end method

.method public uef(ZZ)V
    .locals 2

    .line 12
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->wk:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->uef:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 13
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/cp;->uef()Lcom/bytedance/sdk/openadsdk/core/cp;

    move-result-object v0

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->uef:Ljava/lang/String;

    invoke-virtual {v0, v1, p1, p2}, Lcom/bytedance/sdk/openadsdk/core/cp;->uef(Ljava/lang/String;ZZ)V

    :cond_0
    return-void
.end method

.method public wk()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs;->sy:Lcom/bytedance/sdk/openadsdk/uef/lw/uef;

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
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 10
    .line 11
    const-string v1, "close"

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

.method public wrv()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs;->sy:Lcom/bytedance/sdk/openadsdk/uef/lw/uef;

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
    invoke-virtual {p0, v0, v1}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs;->uef(ZZ)V

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
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs;->sy:Lcom/bytedance/sdk/openadsdk/uef/lw/uef;

    .line 36
    .line 37
    :cond_1
    return-void
.end method

.method public yo()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->yo()V

    return-void
.end method

.method public yo(Landroid/os/Bundle;)V
    .locals 2

    .line 2
    invoke-super {p0, p1}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->yo(Landroid/os/Bundle;)V

    .line 3
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->wk:Z

    if-eqz v0, :cond_0

    .line 4
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/cp;->uef()Lcom/bytedance/sdk/openadsdk/core/cp;

    move-result-object p1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->uef:Ljava/lang/String;

    const-class v1, Lcom/bytedance/sdk/openadsdk/uef/lw/uef;

    invoke-virtual {p1, v0, v1}, Lcom/bytedance/sdk/openadsdk/core/cp;->uef(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/bytedance/sdk/openadsdk/uef/lw/uef;

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs;->sy:Lcom/bytedance/sdk/openadsdk/uef/lw/uef;

    return-void

    .line 5
    :cond_0
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/cp;->uef()Lcom/bytedance/sdk/openadsdk/core/cp;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/cp;->oa()Lcom/bytedance/sdk/openadsdk/uef/lw/uef;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs;->sy:Lcom/bytedance/sdk/openadsdk/uef/lw/uef;

    if-nez v0, :cond_1

    if-eqz p1, :cond_1

    .line 6
    sget-object p1, Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs;->oib:Lcom/bytedance/sdk/openadsdk/uef/lw/uef;

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs;->sy:Lcom/bytedance/sdk/openadsdk/uef/lw/uef;

    const/4 p1, 0x0

    .line 7
    sput-object p1, Lcom/bytedance/sdk/openadsdk/component/reward/yo/xs;->oib:Lcom/bytedance/sdk/openadsdk/uef/lw/uef;

    :cond_1
    return-void
.end method
