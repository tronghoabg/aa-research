.class Lcom/bytedance/sdk/openadsdk/ivm/uef$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/ivm/uef;->oa()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/ivm/uef;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/ivm/uef;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/ivm/uef$1;->uef:Lcom/bytedance/sdk/openadsdk/ivm/uef;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .line 1
    const-string v0, "&"

    .line 2
    .line 3
    const-string v1, "1,3,5&session"

    .line 4
    .line 5
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/ivm/uef$1;->uef:Lcom/bytedance/sdk/openadsdk/ivm/uef;

    .line 6
    .line 7
    const-string v3, "feature_switch"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-static {v3, v4}, Lcom/bytedance/sdk/openadsdk/gzw/lw;->uef(Ljava/lang/String;Z)Z

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    invoke-static {v2, v3}, Lcom/bytedance/sdk/openadsdk/ivm/uef;->uef(Lcom/bytedance/sdk/openadsdk/ivm/uef;Z)Z

    .line 15
    .line 16
    .line 17
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/ivm/uef$1;->uef:Lcom/bytedance/sdk/openadsdk/ivm/uef;

    .line 18
    .line 19
    invoke-static {v2}, Lcom/bytedance/sdk/openadsdk/ivm/uef;->uef(Lcom/bytedance/sdk/openadsdk/ivm/uef;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_0

    .line 24
    .line 25
    goto/16 :goto_0

    .line 26
    .line 27
    :cond_0
    :try_start_0
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/ivm/uef$1;->uef:Lcom/bytedance/sdk/openadsdk/ivm/uef;

    .line 28
    .line 29
    const-string v3, "exclude_banner_native"

    .line 30
    .line 31
    invoke-static {v3, v4}, Lcom/bytedance/sdk/openadsdk/gzw/lw;->uef(Ljava/lang/String;Z)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    invoke-static {v2, v3}, Lcom/bytedance/sdk/openadsdk/ivm/uef;->oa(Lcom/bytedance/sdk/openadsdk/ivm/uef;Z)Z

    .line 36
    .line 37
    .line 38
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/ivm/uef$1;->uef:Lcom/bytedance/sdk/openadsdk/ivm/uef;

    .line 39
    .line 40
    const-string v3, "feature_timer_interval"

    .line 41
    .line 42
    const/16 v4, 0x2710

    .line 43
    .line 44
    invoke-static {v3, v4}, Lcom/bytedance/sdk/openadsdk/gzw/lw;->uef(Ljava/lang/String;I)I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    invoke-static {v2, v3}, Lcom/bytedance/sdk/openadsdk/ivm/uef;->uef(Lcom/bytedance/sdk/openadsdk/ivm/uef;I)I

    .line 49
    .line 50
    .line 51
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/ivm/uef$1;->uef:Lcom/bytedance/sdk/openadsdk/ivm/uef;

    .line 52
    .line 53
    const-string v3, "enable_feature_cids"

    .line 54
    .line 55
    const/4 v4, 0x1

    .line 56
    invoke-static {v3, v4}, Lcom/bytedance/sdk/openadsdk/gzw/lw;->uef(Ljava/lang/String;Z)Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    invoke-static {v2, v3}, Lcom/bytedance/sdk/openadsdk/ivm/uef;->yo(Lcom/bytedance/sdk/openadsdk/ivm/uef;Z)Z

    .line 61
    .line 62
    .line 63
    const-string v2, "pag_ad_show_cnt"

    .line 64
    .line 65
    invoke-static {v2, v1}, Lcom/bytedance/sdk/openadsdk/gzw/lw;->uef(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {v2, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    const-string v3, "pag_ad_click_cnt"

    .line 74
    .line 75
    invoke-static {v3, v1}, Lcom/bytedance/sdk/openadsdk/gzw/lw;->uef(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-virtual {v3, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    const-string v5, "pag_video_play_cnt"

    .line 84
    .line 85
    invoke-static {v5, v1}, Lcom/bytedance/sdk/openadsdk/gzw/lw;->uef(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    invoke-virtual {v5, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    const-string v6, "pag_dislike_cnt"

    .line 94
    .line 95
    const-string v7, "1,3,5session"

    .line 96
    .line 97
    invoke-static {v6, v7}, Lcom/bytedance/sdk/openadsdk/gzw/lw;->uef(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    const-string v7, ","

    .line 102
    .line 103
    invoke-virtual {v6, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    iget-object v7, p0, Lcom/bytedance/sdk/openadsdk/ivm/uef$1;->uef:Lcom/bytedance/sdk/openadsdk/ivm/uef;

    .line 108
    .line 109
    invoke-static {v7, v2}, Lcom/bytedance/sdk/openadsdk/ivm/uef;->uef(Lcom/bytedance/sdk/openadsdk/ivm/uef;[Ljava/lang/String;)Z

    .line 110
    .line 111
    .line 112
    move-result v8

    .line 113
    invoke-static {v7, v8}, Lcom/bytedance/sdk/openadsdk/ivm/uef;->moa(Lcom/bytedance/sdk/openadsdk/ivm/uef;Z)Z

    .line 114
    .line 115
    .line 116
    iget-object v7, p0, Lcom/bytedance/sdk/openadsdk/ivm/uef$1;->uef:Lcom/bytedance/sdk/openadsdk/ivm/uef;

    .line 117
    .line 118
    invoke-static {v7, v3}, Lcom/bytedance/sdk/openadsdk/ivm/uef;->uef(Lcom/bytedance/sdk/openadsdk/ivm/uef;[Ljava/lang/String;)Z

    .line 119
    .line 120
    .line 121
    move-result v8

    .line 122
    invoke-static {v7, v8}, Lcom/bytedance/sdk/openadsdk/ivm/uef;->lw(Lcom/bytedance/sdk/openadsdk/ivm/uef;Z)Z

    .line 123
    .line 124
    .line 125
    iget-object v7, p0, Lcom/bytedance/sdk/openadsdk/ivm/uef$1;->uef:Lcom/bytedance/sdk/openadsdk/ivm/uef;

    .line 126
    .line 127
    invoke-static {v7, v5}, Lcom/bytedance/sdk/openadsdk/ivm/uef;->uef(Lcom/bytedance/sdk/openadsdk/ivm/uef;[Ljava/lang/String;)Z

    .line 128
    .line 129
    .line 130
    move-result v8

    .line 131
    invoke-static {v7, v8}, Lcom/bytedance/sdk/openadsdk/ivm/uef;->ivm(Lcom/bytedance/sdk/openadsdk/ivm/uef;Z)Z

    .line 132
    .line 133
    .line 134
    iget-object v7, p0, Lcom/bytedance/sdk/openadsdk/ivm/uef$1;->uef:Lcom/bytedance/sdk/openadsdk/ivm/uef;

    .line 135
    .line 136
    invoke-static {v7, v2}, Lcom/bytedance/sdk/openadsdk/ivm/uef;->oa(Lcom/bytedance/sdk/openadsdk/ivm/uef;[Ljava/lang/String;)[I

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    invoke-static {v7, v2}, Lcom/bytedance/sdk/openadsdk/ivm/uef;->uef(Lcom/bytedance/sdk/openadsdk/ivm/uef;[I)[I

    .line 141
    .line 142
    .line 143
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/ivm/uef$1;->uef:Lcom/bytedance/sdk/openadsdk/ivm/uef;

    .line 144
    .line 145
    invoke-static {v2, v3}, Lcom/bytedance/sdk/openadsdk/ivm/uef;->oa(Lcom/bytedance/sdk/openadsdk/ivm/uef;[Ljava/lang/String;)[I

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    invoke-static {v2, v3}, Lcom/bytedance/sdk/openadsdk/ivm/uef;->oa(Lcom/bytedance/sdk/openadsdk/ivm/uef;[I)[I

    .line 150
    .line 151
    .line 152
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/ivm/uef$1;->uef:Lcom/bytedance/sdk/openadsdk/ivm/uef;

    .line 153
    .line 154
    invoke-static {v2, v5}, Lcom/bytedance/sdk/openadsdk/ivm/uef;->oa(Lcom/bytedance/sdk/openadsdk/ivm/uef;[Ljava/lang/String;)[I

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    invoke-static {v2, v3}, Lcom/bytedance/sdk/openadsdk/ivm/uef;->yo(Lcom/bytedance/sdk/openadsdk/ivm/uef;[I)[I

    .line 159
    .line 160
    .line 161
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/ivm/uef$1;->uef:Lcom/bytedance/sdk/openadsdk/ivm/uef;

    .line 162
    .line 163
    invoke-static {v2, v6}, Lcom/bytedance/sdk/openadsdk/ivm/uef;->yo(Lcom/bytedance/sdk/openadsdk/ivm/uef;[Ljava/lang/String;)[I

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    invoke-static {v2, v3}, Lcom/bytedance/sdk/openadsdk/ivm/uef;->moa(Lcom/bytedance/sdk/openadsdk/ivm/uef;[I)[I

    .line 168
    .line 169
    .line 170
    const-string v2, "pag_landingPage_stay_time"

    .line 171
    .line 172
    invoke-static {v2, v1}, Lcom/bytedance/sdk/openadsdk/gzw/lw;->uef(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    invoke-virtual {v2, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    const-string v3, "pag_video_stay_time"

    .line 181
    .line 182
    invoke-static {v3, v1}, Lcom/bytedance/sdk/openadsdk/gzw/lw;->uef(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    invoke-virtual {v1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/ivm/uef$1;->uef:Lcom/bytedance/sdk/openadsdk/ivm/uef;

    .line 191
    .line 192
    invoke-static {v1, v2}, Lcom/bytedance/sdk/openadsdk/ivm/uef;->uef(Lcom/bytedance/sdk/openadsdk/ivm/uef;[Ljava/lang/String;)Z

    .line 193
    .line 194
    .line 195
    move-result v3

    .line 196
    invoke-static {v1, v3}, Lcom/bytedance/sdk/openadsdk/ivm/uef;->xs(Lcom/bytedance/sdk/openadsdk/ivm/uef;Z)Z

    .line 197
    .line 198
    .line 199
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/ivm/uef$1;->uef:Lcom/bytedance/sdk/openadsdk/ivm/uef;

    .line 200
    .line 201
    invoke-static {v1, v0}, Lcom/bytedance/sdk/openadsdk/ivm/uef;->uef(Lcom/bytedance/sdk/openadsdk/ivm/uef;[Ljava/lang/String;)Z

    .line 202
    .line 203
    .line 204
    move-result v3

    .line 205
    invoke-static {v1, v3}, Lcom/bytedance/sdk/openadsdk/ivm/uef;->bcc(Lcom/bytedance/sdk/openadsdk/ivm/uef;Z)Z

    .line 206
    .line 207
    .line 208
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/ivm/uef$1;->uef:Lcom/bytedance/sdk/openadsdk/ivm/uef;

    .line 209
    .line 210
    invoke-static {v1, v2}, Lcom/bytedance/sdk/openadsdk/ivm/uef;->oa(Lcom/bytedance/sdk/openadsdk/ivm/uef;[Ljava/lang/String;)[I

    .line 211
    .line 212
    .line 213
    move-result-object v2

    .line 214
    invoke-static {v1, v2}, Lcom/bytedance/sdk/openadsdk/ivm/uef;->lw(Lcom/bytedance/sdk/openadsdk/ivm/uef;[I)[I

    .line 215
    .line 216
    .line 217
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/ivm/uef$1;->uef:Lcom/bytedance/sdk/openadsdk/ivm/uef;

    .line 218
    .line 219
    invoke-static {v1, v0}, Lcom/bytedance/sdk/openadsdk/ivm/uef;->oa(Lcom/bytedance/sdk/openadsdk/ivm/uef;[Ljava/lang/String;)[I

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    invoke-static {v1, v0}, Lcom/bytedance/sdk/openadsdk/ivm/uef;->ivm(Lcom/bytedance/sdk/openadsdk/ivm/uef;[I)[I

    .line 224
    .line 225
    .line 226
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/ivm/uef$1;->uef:Lcom/bytedance/sdk/openadsdk/ivm/uef;

    .line 227
    .line 228
    const-string v1, "pag_video_30p_session"

    .line 229
    .line 230
    invoke-static {v1, v4}, Lcom/bytedance/sdk/openadsdk/gzw/lw;->uef(Ljava/lang/String;Z)Z

    .line 231
    .line 232
    .line 233
    move-result v1

    .line 234
    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/ivm/uef;->cz(Lcom/bytedance/sdk/openadsdk/ivm/uef;Z)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 235
    .line 236
    .line 237
    :catchall_0
    :goto_0
    return-void
.end method
