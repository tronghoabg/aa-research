.class final Lcom/bytedance/sdk/openadsdk/bcc/uef$6;
.super Lcom/bytedance/sdk/component/bcc/oa/yo;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/bcc/uef;->lw(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/InitConfig;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# instance fields
.field final synthetic oa:Landroid/content/Context;

.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/InitConfig;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/InitConfig;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/bcc/uef$6;->uef:Lcom/bytedance/sdk/openadsdk/InitConfig;

    .line 2
    .line 3
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/bcc/uef$6;->oa:Landroid/content/Context;

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
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/bcc/uef$6;->uef:Lcom/bytedance/sdk/openadsdk/InitConfig;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/InitConfig;->getData()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/wk;->uef(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/bcc/uef$6;->oa:Landroid/content/Context;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/bcc/uef$6;->uef:Lcom/bytedance/sdk/openadsdk/InitConfig;

    .line 13
    .line 14
    invoke-interface {v1}, Lcom/bytedance/sdk/openadsdk/InitConfig;->getAppId()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/gzw/lw;->uef(Landroid/content/Context;Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/gzw/moa;

    .line 19
    .line 20
    .line 21
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/gzw/lw;->uef()V

    .line 22
    .line 23
    .line 24
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/sy/yo;->uef()Lcom/bytedance/sdk/openadsdk/sy/uef;

    .line 25
    .line 26
    .line 27
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/sy/yo;->oa()V

    .line 28
    .line 29
    .line 30
    new-instance v0, Lcom/bytedance/sdk/openadsdk/utils/bs;

    .line 31
    .line 32
    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/utils/bs;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/orq;->uef()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    mul-int/lit8 v0, v0, 0xa

    .line 40
    .line 41
    invoke-static {v0}, Lcom/bytedance/sdk/component/adexpress/uef/oa/ivm;->uef(I)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/bcc/uef$6;->oa:Landroid/content/Context;

    .line 45
    .line 46
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/moa/uef/oa;->uef(Landroid/content/Context;)V

    .line 47
    .line 48
    .line 49
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/ab;->uef()Lcom/bytedance/sdk/openadsdk/core/ab;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/ab;->oa()V

    .line 54
    .line 55
    .line 56
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/wrv/yo;->uef()V

    .line 57
    .line 58
    .line 59
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/cq/yo;->uef()V

    .line 60
    .line 61
    .line 62
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/bcc/uef$6;->oa:Landroid/content/Context;

    .line 63
    .line 64
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->uef(Landroid/content/Context;)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    sput v0, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->lw:I

    .line 69
    .line 70
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/bcc/uef$6;->oa:Landroid/content/Context;

    .line 71
    .line 72
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->oa(Landroid/content/Context;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    sput-object v0, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->moa:Ljava/lang/String;

    .line 77
    .line 78
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/gsd/oa/xs;->oa()V

    .line 79
    .line 80
    .line 81
    const-string v0, "video_cache_config"

    .line 82
    .line 83
    sget-object v1, Lcom/bytedance/sdk/openadsdk/gzw/oa;->uef:Lcom/bytedance/sdk/openadsdk/gzw/oa$uef;

    .line 84
    .line 85
    const/4 v2, 0x0

    .line 86
    invoke-static {v0, v2, v1}, Lcom/bytedance/sdk/openadsdk/gzw/lw;->uef(Ljava/lang/String;Ljava/lang/Object;Lcom/bytedance/sdk/openadsdk/gzw/oa$uef;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    check-cast v0, Lorg/json/JSONObject;

    .line 91
    .line 92
    invoke-static {v0}, Lcom/bykv/vk/openvk/uef/uef/oa/uef;->uef(Lorg/json/JSONObject;)V

    .line 93
    .line 94
    .line 95
    const/4 v0, 0x0

    .line 96
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/CacheDirFactory;->getICacheDir(I)Lcom/bykv/vk/openvk/uef/uef/uef/uef/oa;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-static {v0}, Lcom/bykv/vk/openvk/uef/uef/oa/uef;->uef(Lcom/bykv/vk/openvk/uef/uef/uef/uef/oa;)V

    .line 101
    .line 102
    .line 103
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->moa()Lcom/bytedance/sdk/openadsdk/core/settings/dj;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->vyg()Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-nez v1, :cond_1

    .line 112
    .line 113
    monitor-enter v0

    .line 114
    :try_start_0
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->vyg()Z

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    if-nez v1, :cond_0

    .line 119
    .line 120
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->yo()V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->pu()V

    .line 124
    .line 125
    .line 126
    goto :goto_0

    .line 127
    :catchall_0
    move-exception v1

    .line 128
    goto :goto_1

    .line 129
    :cond_0
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 130
    goto :goto_2

    .line 131
    :goto_1
    monitor-exit v0

    .line 132
    throw v1

    .line 133
    :cond_1
    :goto_2
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/wk;->ivm()V

    .line 134
    .line 135
    .line 136
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/DeviceUtils;->dj()V

    .line 137
    .line 138
    .line 139
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/bcc/uef$6;->oa:Landroid/content/Context;

    .line 140
    .line 141
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/bcc/uef;->uef(Landroid/content/Context;)V

    .line 142
    .line 143
    .line 144
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/bcc/uef$6;->oa:Landroid/content/Context;

    .line 145
    .line 146
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/utils/DeviceUtils;->uef(Landroid/content/Context;)V

    .line 147
    .line 148
    .line 149
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/bcc/uef$6;->oa:Landroid/content/Context;

    .line 150
    .line 151
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/utils/DeviceUtils;->dj(Landroid/content/Context;)V

    .line 152
    .line 153
    .line 154
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/bcc/uef$6;->oa:Landroid/content/Context;

    .line 155
    .line 156
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/utils/DeviceUtils;->wrv(Landroid/content/Context;)V

    .line 157
    .line 158
    .line 159
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/ab/uef;->uef()V

    .line 160
    .line 161
    .line 162
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/settings/moa;->uef()V

    .line 163
    .line 164
    .line 165
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/ab/moa;->moa()V

    .line 166
    .line 167
    .line 168
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/bcc/uef$6;->oa:Landroid/content/Context;

    .line 169
    .line 170
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/utils/gb;->cz(Landroid/content/Context;)V

    .line 171
    .line 172
    .line 173
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/moa/yo;->uef()V

    .line 174
    .line 175
    .line 176
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/bcc/uef;->yo()V

    .line 177
    .line 178
    .line 179
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/wrv/yo;->oa()V

    .line 180
    .line 181
    .line 182
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/lw/uef;->uef()Lcom/bytedance/sdk/openadsdk/core/lw/uef;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/lw/uef;->oa()V

    .line 187
    .line 188
    .line 189
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/wk;->oa()Landroid/os/Handler;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    invoke-static {v0}, Lcom/bytedance/sdk/component/bcc/oa/moa;->uef(Landroid/os/Handler;)V

    .line 194
    .line 195
    .line 196
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/component/xs/uef;->lw()Z

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    if-eqz v0, :cond_2

    .line 201
    .line 202
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/common/sy;->uef()Lcom/bytedance/sdk/openadsdk/common/sy;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/common/sy;->moa()V

    .line 207
    .line 208
    .line 209
    :cond_2
    new-instance v0, Lcom/bytedance/sdk/openadsdk/bcc/uef$6$1;

    .line 210
    .line 211
    invoke-direct {v0, p0}, Lcom/bytedance/sdk/openadsdk/bcc/uef$6$1;-><init>(Lcom/bytedance/sdk/openadsdk/bcc/uef$6;)V

    .line 212
    .line 213
    .line 214
    invoke-static {v0}, Lcom/bytedance/sdk/component/utils/oa;->uef(Lcom/bytedance/sdk/component/utils/oa$uef;)V

    .line 215
    .line 216
    .line 217
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/gb;->yo()V

    .line 218
    .line 219
    .line 220
    new-instance v0, Lcom/bytedance/sdk/openadsdk/bcc/uef$6$2;

    .line 221
    .line 222
    invoke-direct {v0, p0}, Lcom/bytedance/sdk/openadsdk/bcc/uef$6$2;-><init>(Lcom/bytedance/sdk/openadsdk/bcc/uef$6;)V

    .line 223
    .line 224
    .line 225
    invoke-static {v0}, Lcom/bytedance/sdk/component/utils/gzw;->uef(Lcom/bytedance/sdk/component/utils/gzw$oa;)V

    .line 226
    .line 227
    .line 228
    const-string v0, "webview_reuse_config"

    .line 229
    .line 230
    invoke-static {v0, v2}, Lcom/bytedance/sdk/openadsdk/gzw/lw;->uef(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    invoke-static {v0}, Lcom/bytedance/sdk/component/utils/pz;->uef(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    const-string v0, "video_play_config"

    .line 238
    .line 239
    invoke-static {v0, v2}, Lcom/bytedance/sdk/openadsdk/gzw/lw;->uef(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    invoke-static {v0}, Lcom/bykv/vk/openvk/uef/uef/oa/uef;->uef(Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/ab/yo;->uef()V

    .line 247
    .line 248
    .line 249
    return-void
.end method
