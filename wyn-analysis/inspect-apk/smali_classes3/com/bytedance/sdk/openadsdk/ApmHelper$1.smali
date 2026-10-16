.class final Lcom/bytedance/sdk/openadsdk/ApmHelper$1;
.super Lcom/bytedance/sdk/component/bcc/oa/yo;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/ApmHelper;->initApm(Landroid/content/Context;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# instance fields
.field final synthetic oa:Ljava/lang/String;

.field final synthetic uef:Landroid/content/Context;


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/ApmHelper$1;->uef:Landroid/content/Context;

    .line 2
    .line 3
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/ApmHelper$1;->oa:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/component/bcc/oa/yo;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/ApmHelper;->uef()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->moa()Lcom/bytedance/sdk/openadsdk/core/settings/dj;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->ix()Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    invoke-static {v3}, Lcom/bytedance/sdk/openadsdk/ApmHelper;->uef(Z)Z

    .line 19
    .line 20
    .line 21
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/gb;->sy()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/ApmHelper;->oa()Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-eqz v4, :cond_1

    .line 30
    .line 31
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-nez v4, :cond_1

    .line 36
    .line 37
    iget-object v4, v0, Lcom/bytedance/sdk/openadsdk/ApmHelper$1;->oa:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v4}, Lcom/bytedance/sdk/openadsdk/ApmHelper;->uef(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    const-string v11, "com.iab.omid.library.bytedance2"

    .line 43
    .line 44
    const-string v12, "com.bytedance.adsdk"

    .line 45
    .line 46
    const-string v5, "com.bytedance.sdk.component"

    .line 47
    .line 48
    const-string v6, "com.bytedance.sdk.mediation"

    .line 49
    .line 50
    const-string v7, "com.bytedance.sdk.openadsdk"

    .line 51
    .line 52
    const-string v8, "com.com.bytedance.overseas.sdk"

    .line 53
    .line 54
    const-string v9, "com.pgl.ssdk"

    .line 55
    .line 56
    const-string v10, "com.bykv.vk"

    .line 57
    .line 58
    filled-new-array/range {v5 .. v12}, [Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v18

    .line 62
    iget-object v4, v0, Lcom/bytedance/sdk/openadsdk/ApmHelper$1;->uef:Landroid/content/Context;

    .line 63
    .line 64
    invoke-static {v4}, Lcom/bytedance/sdk/openadsdk/core/cq;->uef(Landroid/content/Context;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    :try_start_0
    const-string v5, "apm_crash_wait_time"

    .line 69
    .line 70
    const/16 v6, 0x2710

    .line 71
    .line 72
    invoke-static {v5, v6}, Lcom/bytedance/sdk/openadsdk/gzw/lw;->uef(Ljava/lang/String;I)I

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    int-to-long v5, v5

    .line 77
    invoke-static {v5, v6}, Lcom/apm/insight/Npth;->setCrashWaitTime(J)V

    .line 78
    .line 79
    .line 80
    invoke-static {v2}, Lcom/apm/insight/Npth;->enableLoopMonitor(Z)V

    .line 81
    .line 82
    .line 83
    invoke-static {v2}, Lcom/apm/insight/Npth;->enableAnrInfo(Z)V

    .line 84
    .line 85
    .line 86
    invoke-static {v2}, Lcom/apm/insight/Npth;->enableNativeDump(Z)V

    .line 87
    .line 88
    .line 89
    invoke-static {v2}, Lcom/apm/insight/Npth;->enableActivityDump(Z)V

    .line 90
    .line 91
    .line 92
    invoke-static {v2}, Lcom/apm/insight/Npth;->enableMessageDump(Z)V

    .line 93
    .line 94
    .line 95
    new-instance v5, Lcom/bytedance/sdk/openadsdk/ApmHelper$1$1;

    .line 96
    .line 97
    invoke-direct {v5, v0}, Lcom/bytedance/sdk/openadsdk/ApmHelper$1$1;-><init>(Lcom/bytedance/sdk/openadsdk/ApmHelper$1;)V

    .line 98
    .line 99
    .line 100
    invoke-static {v5}, Lcom/apm/insight/MonitorCrash;->setCustomRequestHeaderCallback(Lcom/apm/insight/CustomRequestHeader;)V

    .line 101
    .line 102
    .line 103
    iget-object v13, v0, Lcom/bytedance/sdk/openadsdk/ApmHelper$1;->uef:Landroid/content/Context;

    .line 104
    .line 105
    const-string v14, "10000001"

    .line 106
    .line 107
    const-string v17, "8.0.0.5"

    .line 108
    .line 109
    const-wide/16 v15, 0x1f45

    .line 110
    .line 111
    invoke-static/range {v13 .. v18}, Lcom/apm/insight/MonitorCrash;->initSDK(Landroid/content/Context;Ljava/lang/String;JLjava/lang/String;[Ljava/lang/String;)Lcom/apm/insight/MonitorCrash;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    new-instance v6, Lcom/bytedance/sdk/openadsdk/ApmHelper$1$2;

    .line 116
    .line 117
    invoke-direct {v6, v0, v5}, Lcom/bytedance/sdk/openadsdk/ApmHelper$1$2;-><init>(Lcom/bytedance/sdk/openadsdk/ApmHelper$1;Lcom/apm/insight/MonitorCrash;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v5, v6}, Lcom/apm/insight/MonitorCrash;->setCustomDataCallback(Lcom/apm/insight/AttachUserData;)Lcom/apm/insight/MonitorCrash;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->dv()Z

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    if-eqz v1, :cond_0

    .line 128
    .line 129
    invoke-virtual {v5}, Lcom/apm/insight/MonitorCrash;->config()Lcom/apm/insight/MonitorCrash$Config;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    const-string v6, "libnms.so"

    .line 134
    .line 135
    const-string v7, "libtobEmbedPagEncrypt.so"

    .line 136
    .line 137
    const-string v8, "tt_ugen_layout.so"

    .line 138
    .line 139
    filled-new-array {v6, v7, v8}, [Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v6

    .line 143
    invoke-virtual {v1, v6}, Lcom/apm/insight/MonitorCrash$Config;->setSoList([Ljava/lang/String;)Lcom/apm/insight/MonitorCrash$Config;

    .line 144
    .line 145
    .line 146
    :cond_0
    invoke-virtual {v5}, Lcom/apm/insight/MonitorCrash;->config()Lcom/apm/insight/MonitorCrash$Config;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    invoke-virtual {v1, v4}, Lcom/apm/insight/MonitorCrash$Config;->setDeviceId(Ljava/lang/String;)Lcom/apm/insight/MonitorCrash$Config;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v5, v3}, Lcom/apm/insight/MonitorCrash;->setReportUrl(Ljava/lang/String;)Lcom/apm/insight/MonitorCrash;

    .line 154
    .line 155
    .line 156
    const-string v1, "host_appid"

    .line 157
    .line 158
    iget-object v6, v0, Lcom/bytedance/sdk/openadsdk/ApmHelper$1;->oa:Ljava/lang/String;

    .line 159
    .line 160
    invoke-virtual {v5, v1, v6}, Lcom/apm/insight/MonitorCrash;->addTags(Ljava/lang/String;Ljava/lang/String;)Lcom/apm/insight/MonitorCrash;

    .line 161
    .line 162
    .line 163
    const-string v1, "sdk_version"

    .line 164
    .line 165
    const-string v6, "8.0.0.5"

    .line 166
    .line 167
    invoke-virtual {v5, v1, v6}, Lcom/apm/insight/MonitorCrash;->addTags(Ljava/lang/String;Ljava/lang/String;)Lcom/apm/insight/MonitorCrash;

    .line 168
    .line 169
    .line 170
    new-instance v1, Lcom/bytedance/sdk/openadsdk/ApmHelper$1$3;

    .line 171
    .line 172
    invoke-direct {v1, v0, v5}, Lcom/bytedance/sdk/openadsdk/ApmHelper$1$3;-><init>(Lcom/bytedance/sdk/openadsdk/ApmHelper$1;Lcom/apm/insight/MonitorCrash;)V

    .line 173
    .line 174
    .line 175
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/ApmHelper;->uef(Lcom/bytedance/sdk/openadsdk/ApmHelper$oa;)Lcom/bytedance/sdk/openadsdk/ApmHelper$oa;

    .line 176
    .line 177
    .line 178
    const/4 v1, 0x1

    .line 179
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/ApmHelper;->oa(Z)Z

    .line 180
    .line 181
    .line 182
    invoke-static {v4, v3}, Lcom/bytedance/sdk/openadsdk/ApmHelper;->uef(Ljava/lang/String;Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/ApmHelper;->moa()Lcom/bytedance/sdk/openadsdk/ApmHelper$uef;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    const/4 v3, 0x0

    .line 190
    invoke-static {v3}, Lcom/bytedance/sdk/openadsdk/ApmHelper;->uef(Lcom/bytedance/sdk/openadsdk/ApmHelper$uef;)Lcom/bytedance/sdk/openadsdk/ApmHelper$uef;

    .line 191
    .line 192
    .line 193
    if-eqz v1, :cond_1

    .line 194
    .line 195
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/ApmHelper;->lw()Lcom/bytedance/sdk/openadsdk/ApmHelper$oa;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    iget-object v4, v1, Lcom/bytedance/sdk/openadsdk/ApmHelper$uef;->uef:Ljava/lang/String;

    .line 200
    .line 201
    iget-object v5, v1, Lcom/bytedance/sdk/openadsdk/ApmHelper$uef;->oa:Ljava/lang/String;

    .line 202
    .line 203
    iget-object v1, v1, Lcom/bytedance/sdk/openadsdk/ApmHelper$uef;->yo:Ljava/lang/Throwable;

    .line 204
    .line 205
    invoke-interface {v3, v4, v5, v1}, Lcom/bytedance/sdk/openadsdk/ApmHelper$oa;->uef(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 206
    .line 207
    .line 208
    goto :goto_0

    .line 209
    :catchall_0
    invoke-static {v2}, Lcom/bytedance/sdk/openadsdk/ApmHelper;->oa(Z)Z

    .line 210
    .line 211
    .line 212
    :cond_1
    :goto_0
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/ApmHelper;->ivm()Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 217
    .line 218
    .line 219
    return-void
.end method
