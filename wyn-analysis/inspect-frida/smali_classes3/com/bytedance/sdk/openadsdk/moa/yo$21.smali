.class final Lcom/bytedance/sdk/openadsdk/moa/yo$21;
.super Lcom/bytedance/sdk/component/bcc/oa/yo;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/moa/yo;->uef(JLcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/ab/oa/oa;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# instance fields
.field final synthetic lw:Ljava/lang/String;

.field final synthetic moa:J

.field final synthetic oa:Ljava/lang/String;

.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/ab/oa/oa;

.field final synthetic yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/ab/oa/oa;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;JLjava/lang/String;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$21;->uef:Lcom/bytedance/sdk/openadsdk/ab/oa/oa;

    .line 2
    .line 3
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$21;->oa:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p4, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$21;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 6
    .line 7
    iput-wide p5, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$21;->moa:J

    .line 8
    .line 9
    iput-object p7, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$21;->lw:Ljava/lang/String;

    .line 10
    .line 11
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/component/bcc/oa/yo;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$21;->uef:Lcom/bytedance/sdk/openadsdk/ab/oa/oa;

    .line 3
    .line 4
    if-eqz v1, :cond_0

    .line 5
    .line 6
    invoke-interface {v1}, Lcom/bytedance/sdk/openadsdk/ab/oa/oa;->oa()Lorg/json/JSONObject;

    .line 7
    .line 8
    .line 9
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    :try_start_1
    new-instance v2, Lorg/json/JSONObject;

    .line 13
    .line 14
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 15
    .line 16
    .line 17
    move-object v1, v2

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    :try_start_2
    new-instance v1, Lorg/json/JSONObject;

    .line 20
    .line 21
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 22
    .line 23
    .line 24
    :cond_1
    :goto_0
    :try_start_3
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$21;->uef:Lcom/bytedance/sdk/openadsdk/ab/oa/oa;

    .line 25
    .line 26
    if-eqz v2, :cond_6

    .line 27
    .line 28
    invoke-interface {v2}, Lcom/bytedance/sdk/openadsdk/ab/oa/oa;->uef()Lorg/json/JSONObject;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$21;->uef:Lcom/bytedance/sdk/openadsdk/ab/oa/oa;

    .line 33
    .line 34
    invoke-interface {v3}, Lcom/bytedance/sdk/openadsdk/ab/oa/oa;->yo()Lorg/json/JSONObject;

    .line 35
    .line 36
    .line 37
    move-result-object v3
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 38
    const-string v4, "ad_extra_data"

    .line 39
    .line 40
    const-string v5, "pag_json_data"

    .line 41
    .line 42
    const-string v6, "render_sequence"

    .line 43
    .line 44
    if-eqz v2, :cond_4

    .line 45
    .line 46
    if-nez v3, :cond_2

    .line 47
    .line 48
    :try_start_4
    new-instance v3, Lorg/json/JSONObject;

    .line 49
    .line 50
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 51
    .line 52
    .line 53
    :cond_2
    iget-object v7, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$21;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 54
    .line 55
    if-eqz v7, :cond_3

    .line 56
    .line 57
    invoke-virtual {v7}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ix()I

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    invoke-virtual {v2, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 62
    .line 63
    .line 64
    :cond_3
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {v3, v5, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-virtual {v1, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_4
    if-eqz v3, :cond_6

    .line 80
    .line 81
    new-instance v2, Lorg/json/JSONObject;

    .line 82
    .line 83
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 84
    .line 85
    .line 86
    iget-object v7, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$21;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 87
    .line 88
    if-eqz v7, :cond_5

    .line 89
    .line 90
    invoke-virtual {v7}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ix()I

    .line 91
    .line 92
    .line 93
    move-result v7

    .line 94
    invoke-virtual {v2, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 95
    .line 96
    .line 97
    :cond_5
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-virtual {v3, v5, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    invoke-virtual {v1, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 109
    .line 110
    .line 111
    :cond_6
    :goto_1
    const-string v2, "log_extra"

    .line 112
    .line 113
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$21;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 114
    .line 115
    invoke-virtual {v3}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->em()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 120
    .line 121
    .line 122
    const-string v2, "ua_policy"

    .line 123
    .line 124
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$21;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 125
    .line 126
    invoke-virtual {v3}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->us()I

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    .line 135
    .line 136
    .line 137
    goto :goto_2

    .line 138
    :catch_0
    move-object v1, v0

    .line 139
    :catch_1
    :goto_2
    new-instance v2, Lcom/bytedance/sdk/openadsdk/moa/uef$uef;

    .line 140
    .line 141
    iget-wide v3, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$21;->moa:J

    .line 142
    .line 143
    iget-object v5, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$21;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 144
    .line 145
    invoke-direct {v2, v3, v4, v5}, Lcom/bytedance/sdk/openadsdk/moa/uef$uef;-><init>(JLcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    .line 146
    .line 147
    .line 148
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$21;->lw:Ljava/lang/String;

    .line 149
    .line 150
    invoke-virtual {v2, v3}, Lcom/bytedance/sdk/openadsdk/moa/uef$uef;->oa(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/moa/uef$uef;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$21;->oa:Ljava/lang/String;

    .line 155
    .line 156
    invoke-virtual {v2, v3}, Lcom/bytedance/sdk/openadsdk/moa/uef$uef;->yo(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/moa/uef$uef;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$21;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 161
    .line 162
    invoke-virtual {v3}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->iou()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    invoke-virtual {v2, v3}, Lcom/bytedance/sdk/openadsdk/moa/uef$uef;->lw(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/moa/uef$uef;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$21;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 171
    .line 172
    invoke-virtual {v3}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->au()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    invoke-virtual {v2, v3}, Lcom/bytedance/sdk/openadsdk/moa/uef$uef;->bcc(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/moa/uef$uef;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$21;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 181
    .line 182
    invoke-virtual {v3}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->try()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v3

    .line 186
    invoke-virtual {v2, v3}, Lcom/bytedance/sdk/openadsdk/moa/uef$uef;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/moa/uef$uef;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$21;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 191
    .line 192
    invoke-virtual {v3}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->nau()Ljava/util/List;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    invoke-virtual {v2, v3}, Lcom/bytedance/sdk/openadsdk/moa/uef$uef;->uef(Ljava/util/List;)Lcom/bytedance/sdk/openadsdk/moa/uef$uef;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    invoke-virtual {v2, v1}, Lcom/bytedance/sdk/openadsdk/moa/uef$uef;->uef(Lorg/json/JSONObject;)Lcom/bytedance/sdk/openadsdk/moa/uef$uef;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$21;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 205
    .line 206
    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ofp()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    invoke-virtual {v1, v2}, Lcom/bytedance/sdk/openadsdk/moa/uef$uef;->xs(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/moa/uef$uef;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    invoke-virtual {v1, v0}, Lcom/bytedance/sdk/openadsdk/moa/uef$uef;->uef(Lcom/bytedance/sdk/openadsdk/moa/oa/uef;)V

    .line 215
    .line 216
    .line 217
    return-void
.end method
