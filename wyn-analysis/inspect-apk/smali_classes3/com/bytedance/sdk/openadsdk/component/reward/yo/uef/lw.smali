.class public Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/component/reward/wrv$uef;


# instance fields
.field private bcc:J

.field private cz:Lcom/bytedance/sdk/openadsdk/component/reward/yo/ivm;

.field private ivm:Ljava/lang/String;

.field private lw:Ljava/lang/String;

.field private moa:Landroid/app/Activity;

.field private final oa:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final uef:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private xs:I

.field private yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
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
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;->uef:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;->oa:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 18
    .line 19
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;->moa:Landroid/app/Activity;

    .line 22
    .line 23
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;->lw:Ljava/lang/String;

    .line 24
    .line 25
    iput-object p4, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;->ivm:Ljava/lang/String;

    .line 26
    .line 27
    return-void
.end method

.method public static synthetic oa(Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;->oa:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object p0
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;)Lcom/bytedance/sdk/openadsdk/component/reward/yo/ivm;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/yo/ivm;

    return-object p0
.end method

.method private yo()Lorg/json/JSONObject;
    .locals 6

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    new-instance v1, Lorg/json/JSONObject;

    .line 4
    .line 5
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 6
    .line 7
    .line 8
    :try_start_0
    const-string v2, "oversea_version_type"

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 12
    .line 13
    .line 14
    const-string v2, "reward_name"

    .line 15
    .line 16
    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 17
    .line 18
    invoke-virtual {v4}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ot()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    invoke-virtual {v1, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 23
    .line 24
    .line 25
    const-string v2, "reward_amount"

    .line 26
    .line 27
    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 28
    .line 29
    invoke-virtual {v4}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->jkf()I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    invoke-virtual {v1, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 34
    .line 35
    .line 36
    const-string v2, "network"

    .line 37
    .line 38
    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;->moa:Landroid/app/Activity;

    .line 39
    .line 40
    invoke-virtual {v4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-static {v4}, Lcom/bytedance/sdk/component/utils/sy;->yo(Landroid/content/Context;)I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    invoke-virtual {v1, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 49
    .line 50
    .line 51
    const-string v2, "sdk_version"

    .line 52
    .line 53
    const-string v4, "8.0.0.5"

    .line 54
    .line 55
    invoke-virtual {v1, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 56
    .line 57
    .line 58
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 59
    .line 60
    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->us()I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    const-string v4, "unKnow"

    .line 65
    .line 66
    const/4 v5, 0x2

    .line 67
    if-ne v2, v5, :cond_0

    .line 68
    .line 69
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/gb;->oa()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    goto :goto_0

    .line 74
    :catchall_0
    move-exception v1

    .line 75
    goto :goto_1

    .line 76
    :cond_0
    if-ne v2, v3, :cond_1

    .line 77
    .line 78
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/gb;->moa()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    :cond_1
    :goto_0
    const-string v2, "user_agent"

    .line 83
    .line 84
    invoke-virtual {v1, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 85
    .line 86
    .line 87
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 88
    .line 89
    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->zec()Lorg/json/JSONObject;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    if-eqz v2, :cond_2

    .line 94
    .line 95
    const-string v3, "gaid"

    .line 96
    .line 97
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->uef()Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    invoke-virtual {v4}, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->oa()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 106
    .line 107
    .line 108
    :cond_2
    const-string v3, "extra"

    .line 109
    .line 110
    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 111
    .line 112
    .line 113
    const-string v2, "media_extra"

    .line 114
    .line 115
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;->ivm:Ljava/lang/String;

    .line 116
    .line 117
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 118
    .line 119
    .line 120
    const-string v2, "video_duration"

    .line 121
    .line 122
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 123
    .line 124
    invoke-virtual {v3}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->nj()Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    invoke-virtual {v3}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;->ivm()D

    .line 129
    .line 130
    .line 131
    move-result-wide v3

    .line 132
    invoke-virtual {v1, v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 133
    .line 134
    .line 135
    const-string v2, "play_start_ts"

    .line 136
    .line 137
    iget-wide v3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;->bcc:J

    .line 138
    .line 139
    invoke-virtual {v1, v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 140
    .line 141
    .line 142
    const-string v2, "play_end_ts"

    .line 143
    .line 144
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 145
    .line 146
    .line 147
    move-result-wide v3

    .line 148
    invoke-virtual {v1, v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 149
    .line 150
    .line 151
    const-string v2, "duration"

    .line 152
    .line 153
    iget v3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;->xs:I

    .line 154
    .line 155
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 156
    .line 157
    .line 158
    const-string v2, "user_id"

    .line 159
    .line 160
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;->lw:Ljava/lang/String;

    .line 161
    .line 162
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 163
    .line 164
    .line 165
    const-string v2, "trans_id"

    .line 166
    .line 167
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/ue;->uef()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    const-string v4, "-"

    .line 172
    .line 173
    invoke-virtual {v3, v4, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 178
    .line 179
    .line 180
    return-object v1

    .line 181
    :goto_1
    const-string v2, "RewardFullRewardManager"

    .line 182
    .line 183
    invoke-static {v2, v0, v1}, Lcom/bytedance/sdk/component/utils/dhk;->uef(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 184
    .line 185
    .line 186
    const/4 v0, 0x0

    .line 187
    return-object v0
.end method


# virtual methods
.method public oa()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->sk()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;->uef:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    :cond_0
    return-void
.end method

.method public uef()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    if-nez v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;->uef:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->cz(Z)V

    :cond_1
    :goto_0
    return-void
.end method

.method public uef(I)V
    .locals 3

    .line 5
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;->uef:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x0

    const/16 v0, 0xd

    const-wide/16 v1, 0x0

    .line 6
    invoke-virtual {p0, v1, v2, p1, v0}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;->uef(JII)V

    return-void
.end method

.method public uef(JII)V
    .locals 7

    .line 8
    iput p3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;->xs:I

    .line 9
    iput-wide p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;->bcc:J

    .line 10
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;->uef:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 11
    :cond_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;->uef:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 12
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->moa()Lcom/bytedance/sdk/openadsdk/core/settings/dj;

    move-result-object p1

    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {p3}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->jnk()I

    move-result p3

    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->bs(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 13
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;->oa:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 14
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/yo/ivm;

    if-eqz v0, :cond_1

    .line 15
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->jkf()I

    move-result v2

    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ot()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    const-string v5, ""

    const/4 v1, 0x1

    move v6, p4

    invoke-interface/range {v0 .. v6}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/ivm;->oa(ZILjava/lang/String;ILjava/lang/String;I)V

    :cond_1
    :goto_0
    return-void

    :cond_2
    move v6, p4

    .line 16
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;->yo()Lorg/json/JSONObject;

    move-result-object p1

    .line 17
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->yo()Lcom/bytedance/sdk/openadsdk/core/gzw;

    move-result-object p2

    new-instance p3, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw$1;

    invoke-direct {p3, p0, v6}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw$1;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;I)V

    invoke-interface {p2, p1, p3}, Lcom/bytedance/sdk/openadsdk/core/gzw;->uef(Lorg/json/JSONObject;Lcom/bytedance/sdk/openadsdk/core/gzw$oa;)V

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/component/reward/yo/ivm;)V
    .locals 0

    .line 7
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/lw;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/yo/ivm;

    return-void
.end method
