.class public Lcom/bytedance/sdk/openadsdk/core/oib;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static uef(Landroid/content/Context;ZLorg/json/JSONObject;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;ILandroid/webkit/WebView;Lcom/bytedance/sdk/openadsdk/core/widget/lw;)V
    .locals 13

    .line 1
    move-object v0, p2

    .line 2
    move-object/from16 v2, p3

    .line 3
    .line 4
    move-object/from16 v4, p4

    .line 5
    .line 6
    move-object/from16 v1, p6

    .line 7
    .line 8
    const-string v3, "landingStyle"

    .line 9
    .line 10
    invoke-virtual {p2, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    const-string v5, "url"

    .line 15
    .line 16
    invoke-virtual {p2, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    const-string v6, "fallback_url"

    .line 21
    .line 22
    invoke-virtual {p2, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v7

    .line 26
    const-string v8, "title"

    .line 27
    .line 28
    const-string v9, ""

    .line 29
    .line 30
    invoke-virtual {p2, v8, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v8

    .line 34
    const-string v9, "only_loading"

    .line 35
    .line 36
    const/4 v10, 0x0

    .line 37
    invoke-virtual {p2, v9, v10}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 38
    .line 39
    .line 40
    move-result v9

    .line 41
    const/4 v11, 0x1

    .line 42
    if-ne v9, v11, :cond_0

    .line 43
    .line 44
    move v9, v11

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    move v9, v10

    .line 47
    :goto_0
    :try_start_0
    const-string v12, "is_activity"

    .line 48
    .line 49
    invoke-virtual {p2, v12, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    .line 51
    .line 52
    :catch_0
    invoke-static {v2, v4, v11, p2}, Lcom/bytedance/sdk/openadsdk/moa/yo;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;ILorg/json/JSONObject;)V

    .line 53
    .line 54
    .line 55
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_1

    .line 60
    .line 61
    goto/16 :goto_4

    .line 62
    .line 63
    :cond_1
    const/4 v0, 0x2

    .line 64
    const/4 v12, -0x1

    .line 65
    if-nez v3, :cond_4

    .line 66
    .line 67
    const/4 p0, 0x0

    .line 68
    if-eqz v1, :cond_2

    .line 69
    .line 70
    invoke-virtual {v1, v5}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-static {v2, v4, v0, p0}, Lcom/bytedance/sdk/openadsdk/moa/yo;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;ILorg/json/JSONObject;)V

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_2
    invoke-static {v2, v4, v12, p0}, Lcom/bytedance/sdk/openadsdk/moa/yo;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;ILorg/json/JSONObject;)V

    .line 78
    .line 79
    .line 80
    :cond_3
    :goto_1
    move v10, v11

    .line 81
    goto/16 :goto_3

    .line 82
    .line 83
    :cond_4
    if-eq v3, v11, :cond_5

    .line 84
    .line 85
    const/16 v1, 0x8

    .line 86
    .line 87
    if-ne v3, v1, :cond_6

    .line 88
    .line 89
    :cond_5
    move-object v1, v5

    .line 90
    goto :goto_2

    .line 91
    :cond_6
    if-ne v3, v0, :cond_7

    .line 92
    .line 93
    invoke-static {p0, v5, v2, v4}, Lcom/bytedance/sdk/openadsdk/utils/gsd;->uef(Landroid/content/Context;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;)Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-nez v0, :cond_3

    .line 98
    .line 99
    new-instance v0, Lcom/bytedance/sdk/openadsdk/ab/uef/oa;

    .line 100
    .line 101
    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/ab/uef/oa;-><init>()V

    .line 102
    .line 103
    .line 104
    sget-object v1, Lcom/bytedance/sdk/openadsdk/moa/oa$uef;->oa:Ljava/lang/String;

    .line 105
    .line 106
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/ab/uef/oa;->uef(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, v2}, Lcom/bytedance/sdk/openadsdk/ab/uef/oa;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0, v4}, Lcom/bytedance/sdk/openadsdk/ab/uef/oa;->oa(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, v12}, Lcom/bytedance/sdk/openadsdk/ab/uef/oa;->uef(I)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, v10}, Lcom/bytedance/sdk/openadsdk/ab/uef/oa;->uef(Z)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ykf()I

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/ab/uef/oa;->oa(I)V

    .line 126
    .line 127
    .line 128
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/moa/yo;->uef(Lcom/bytedance/sdk/openadsdk/ab/uef/oa;)V

    .line 129
    .line 130
    .line 131
    new-instance v0, Ljava/util/HashMap;

    .line 132
    .line 133
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 134
    .line 135
    .line 136
    const-string v1, "deeplink_url"

    .line 137
    .line 138
    invoke-virtual {v0, v1, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    const-string v3, "jsb_deeplink"

    .line 149
    .line 150
    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    const-string v1, "open_fallback_url"

    .line 154
    .line 155
    invoke-static {v2, v4, v1, v0}, Lcom/bytedance/sdk/openadsdk/moa/yo;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 156
    .line 157
    .line 158
    sget-object v0, Lcom/bytedance/sdk/openadsdk/moa/oa$uef;->oa:Ljava/lang/String;

    .line 159
    .line 160
    invoke-static {p0, v7, v2, v0, v11}, Lcom/bytedance/sdk/openadsdk/utils/gsd;->uef(Landroid/content/Context;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Z)Z

    .line 161
    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_7
    const/4 v0, 0x3

    .line 165
    if-ne v3, v0, :cond_8

    .line 166
    .line 167
    new-instance v6, Lcom/bytedance/sdk/openadsdk/core/dhk;

    .line 168
    .line 169
    invoke-direct {v6, v2}, Lcom/bytedance/sdk/openadsdk/core/dhk;-><init>(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v6, v8}, Lcom/bytedance/sdk/openadsdk/core/dhk;->uef(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v6, v9}, Lcom/bytedance/sdk/openadsdk/core/dhk;->uef(Z)V

    .line 176
    .line 177
    .line 178
    move-object v1, v5

    .line 179
    const/4 v5, 0x0

    .line 180
    move-object v0, p0

    .line 181
    move/from16 v3, p5

    .line 182
    .line 183
    invoke-static/range {v0 .. v6}, Lcom/bytedance/sdk/openadsdk/core/pu;->uef(Landroid/content/Context;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;ILjava/lang/String;ZLcom/bytedance/sdk/openadsdk/core/dhk;)V

    .line 184
    .line 185
    .line 186
    goto :goto_1

    .line 187
    :goto_2
    new-instance v3, Lcom/bytedance/sdk/openadsdk/ab/uef/oa;

    .line 188
    .line 189
    invoke-direct {v3}, Lcom/bytedance/sdk/openadsdk/ab/uef/oa;-><init>()V

    .line 190
    .line 191
    .line 192
    sget-object v5, Lcom/bytedance/sdk/openadsdk/moa/oa$uef;->oa:Ljava/lang/String;

    .line 193
    .line 194
    invoke-virtual {v3, v5}, Lcom/bytedance/sdk/openadsdk/ab/uef/oa;->uef(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v3, v2}, Lcom/bytedance/sdk/openadsdk/ab/uef/oa;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v3, v4}, Lcom/bytedance/sdk/openadsdk/ab/uef/oa;->oa(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v3, v12}, Lcom/bytedance/sdk/openadsdk/ab/uef/oa;->uef(I)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v3, v10}, Lcom/bytedance/sdk/openadsdk/ab/uef/oa;->uef(Z)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ykf()I

    .line 210
    .line 211
    .line 212
    move-result v4

    .line 213
    invoke-virtual {v3, v4}, Lcom/bytedance/sdk/openadsdk/ab/uef/oa;->oa(I)V

    .line 214
    .line 215
    .line 216
    invoke-static {v3}, Lcom/bytedance/sdk/openadsdk/moa/yo;->uef(Lcom/bytedance/sdk/openadsdk/ab/uef/oa;)V

    .line 217
    .line 218
    .line 219
    sget-object v3, Lcom/bytedance/sdk/openadsdk/moa/oa$uef;->oa:Ljava/lang/String;

    .line 220
    .line 221
    invoke-static {p0, v1, v2, v3, v11}, Lcom/bytedance/sdk/openadsdk/utils/gsd;->uef(Landroid/content/Context;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Z)Z

    .line 222
    .line 223
    .line 224
    goto/16 :goto_1

    .line 225
    .line 226
    :cond_8
    :goto_3
    if-eqz p7, :cond_9

    .line 227
    .line 228
    if-eqz v10, :cond_9

    .line 229
    .line 230
    invoke-interface/range {p7 .. p7}, Lcom/bytedance/sdk/openadsdk/core/widget/lw;->uef()V

    .line 231
    .line 232
    .line 233
    :cond_9
    :goto_4
    return-void
.end method
