.class public final Lcom/vungle/ads/internal/model/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LWf/C;


# static fields
.field public static final a:Lcom/vungle/ads/internal/model/g;

.field public static final synthetic b:LWf/d0;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/vungle/ads/internal/model/g;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/vungle/ads/internal/model/g;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/vungle/ads/internal/model/g;->a:Lcom/vungle/ads/internal/model/g;

    .line 7
    .line 8
    new-instance v1, LWf/d0;

    .line 9
    .line 10
    const-string v2, "com.vungle.ads.internal.model.AdPayload.AdUnit"

    .line 11
    .line 12
    const/16 v3, 0x1e

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, LWf/d0;-><init>(Ljava/lang/String;LWf/C;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "id"

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "ad_type"

    .line 24
    .line 25
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "ad_source"

    .line 29
    .line 30
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const-string v0, "expiry"

    .line 34
    .line 35
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const-string v0, "expiry_duration"

    .line 39
    .line 40
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    const-string v0, "deeplink_url"

    .line 44
    .line 45
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    const-string v0, "click_coordinates_enabled"

    .line 49
    .line 50
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 51
    .line 52
    .line 53
    const-string v0, "ad_load_optimization"

    .line 54
    .line 55
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 56
    .line 57
    .line 58
    const-string v0, "mediation_name"

    .line 59
    .line 60
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 61
    .line 62
    .line 63
    const-string v0, "info"

    .line 64
    .line 65
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 66
    .line 67
    .line 68
    const-string v0, "sleep"

    .line 69
    .line 70
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 71
    .line 72
    .line 73
    const-string v0, "error_code"

    .line 74
    .line 75
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 76
    .line 77
    .line 78
    const-string v0, "tpat"

    .line 79
    .line 80
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 81
    .line 82
    .line 83
    const-string v0, "vm_url"

    .line 84
    .line 85
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 86
    .line 87
    .line 88
    const-string v0, "vm_version"

    .line 89
    .line 90
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 91
    .line 92
    .line 93
    const-string v0, "ad_market_id"

    .line 94
    .line 95
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 96
    .line 97
    .line 98
    const-string v0, "notification"

    .line 99
    .line 100
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 101
    .line 102
    .line 103
    const-string v0, "load_ad"

    .line 104
    .line 105
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 106
    .line 107
    .line 108
    const-string v0, "viewability"

    .line 109
    .line 110
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 111
    .line 112
    .line 113
    const-string v0, "template_type"

    .line 114
    .line 115
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 116
    .line 117
    .line 118
    const-string v0, "template_settings"

    .line 119
    .line 120
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 121
    .line 122
    .line 123
    const-string v0, "creative_id"

    .line 124
    .line 125
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 126
    .line 127
    .line 128
    const-string v0, "app_id"

    .line 129
    .line 130
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 131
    .line 132
    .line 133
    const-string v0, "show_close"

    .line 134
    .line 135
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 136
    .line 137
    .line 138
    const-string v0, "show_close_incentivized"

    .line 139
    .line 140
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 141
    .line 142
    .line 143
    const-string v0, "ad_size"

    .line 144
    .line 145
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 146
    .line 147
    .line 148
    const-string v0, "webview_settings"

    .line 149
    .line 150
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 151
    .line 152
    .line 153
    const-string v0, "use_preloading"

    .line 154
    .line 155
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 156
    .line 157
    .line 158
    const-string v0, "ad_partial_download_enabled"

    .line 159
    .line 160
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 161
    .line 162
    .line 163
    const-string v0, "max_download_retry_attempts"

    .line 164
    .line 165
    invoke-virtual {v1, v0, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 166
    .line 167
    .line 168
    sput-object v1, Lcom/vungle/ads/internal/model/g;->b:LWf/d0;

    .line 169
    .line 170
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final childSerializers()[Lkotlinx/serialization/KSerializer;
    .locals 32

    .line 1
    sget-object v0, LWf/q0;->a:LWf/q0;

    .line 2
    .line 3
    invoke-static {v0}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v0}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-static {v0}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    sget-object v4, LWf/J;->a:LWf/J;

    .line 16
    .line 17
    invoke-static {v4}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    invoke-static {v4}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    invoke-static {v0}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 26
    .line 27
    .line 28
    move-result-object v7

    .line 29
    sget-object v8, LWf/f;->a:LWf/f;

    .line 30
    .line 31
    invoke-static {v8}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 32
    .line 33
    .line 34
    move-result-object v9

    .line 35
    invoke-static {v8}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 36
    .line 37
    .line 38
    move-result-object v10

    .line 39
    invoke-static {v0}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 40
    .line 41
    .line 42
    move-result-object v11

    .line 43
    invoke-static {v0}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 44
    .line 45
    .line 46
    move-result-object v12

    .line 47
    invoke-static {v4}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 48
    .line 49
    .line 50
    move-result-object v13

    .line 51
    invoke-static {v4}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 52
    .line 53
    .line 54
    move-result-object v14

    .line 55
    sget-object v15, Lcom/vungle/ads/internal/model/w;->a:Lcom/vungle/ads/internal/model/w;

    .line 56
    .line 57
    invoke-static {v15}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 58
    .line 59
    .line 60
    move-result-object v15

    .line 61
    invoke-static {v0}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 62
    .line 63
    .line 64
    move-result-object v16

    .line 65
    invoke-static {v0}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 66
    .line 67
    .line 68
    move-result-object v17

    .line 69
    invoke-static {v0}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 70
    .line 71
    .line 72
    move-result-object v18

    .line 73
    move-object/from16 v19, v1

    .line 74
    .line 75
    new-instance v1, LWf/c;

    .line 76
    .line 77
    move-object/from16 v20, v2

    .line 78
    .line 79
    const/4 v2, 0x0

    .line 80
    invoke-direct {v1, v0, v2}, LWf/c;-><init>(Lkotlinx/serialization/KSerializer;I)V

    .line 81
    .line 82
    .line 83
    invoke-static {v1}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    move-object/from16 v21, v1

    .line 88
    .line 89
    new-instance v1, LWf/c;

    .line 90
    .line 91
    invoke-direct {v1, v0, v2}, LWf/c;-><init>(Lkotlinx/serialization/KSerializer;I)V

    .line 92
    .line 93
    .line 94
    invoke-static {v1}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    sget-object v22, Lcom/vungle/ads/internal/model/x;->a:Lcom/vungle/ads/internal/model/x;

    .line 99
    .line 100
    invoke-static/range {v22 .. v22}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 101
    .line 102
    .line 103
    move-result-object v22

    .line 104
    invoke-static {v0}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 105
    .line 106
    .line 107
    move-result-object v23

    .line 108
    sget-object v24, Lcom/vungle/ads/internal/model/t;->a:Lcom/vungle/ads/internal/model/t;

    .line 109
    .line 110
    invoke-static/range {v24 .. v24}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 111
    .line 112
    .line 113
    move-result-object v24

    .line 114
    invoke-static {v0}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 115
    .line 116
    .line 117
    move-result-object v25

    .line 118
    invoke-static {v0}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-static {v4}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 123
    .line 124
    .line 125
    move-result-object v26

    .line 126
    invoke-static {v4}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 127
    .line 128
    .line 129
    move-result-object v27

    .line 130
    sget-object v28, Lcom/vungle/ads/internal/model/d;->a:Lcom/vungle/ads/internal/model/d;

    .line 131
    .line 132
    invoke-static/range {v28 .. v28}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 133
    .line 134
    .line 135
    move-result-object v28

    .line 136
    sget-object v29, Lcom/vungle/ads/internal/model/d0;->a:Lcom/vungle/ads/internal/model/d0;

    .line 137
    .line 138
    invoke-static/range {v29 .. v29}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 139
    .line 140
    .line 141
    move-result-object v29

    .line 142
    invoke-static {v8}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 143
    .line 144
    .line 145
    move-result-object v30

    .line 146
    invoke-static {v8}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 147
    .line 148
    .line 149
    move-result-object v8

    .line 150
    invoke-static {v4}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    move/from16 v31, v2

    .line 155
    .line 156
    const/16 v2, 0x1e

    .line 157
    .line 158
    new-array v2, v2, [Lkotlinx/serialization/KSerializer;

    .line 159
    .line 160
    aput-object v19, v2, v31

    .line 161
    .line 162
    const/16 v19, 0x1

    .line 163
    .line 164
    aput-object v20, v2, v19

    .line 165
    .line 166
    const/16 v19, 0x2

    .line 167
    .line 168
    aput-object v3, v2, v19

    .line 169
    .line 170
    const/4 v3, 0x3

    .line 171
    aput-object v5, v2, v3

    .line 172
    .line 173
    const/4 v3, 0x4

    .line 174
    aput-object v6, v2, v3

    .line 175
    .line 176
    const/4 v3, 0x5

    .line 177
    aput-object v7, v2, v3

    .line 178
    .line 179
    const/4 v3, 0x6

    .line 180
    aput-object v9, v2, v3

    .line 181
    .line 182
    const/4 v3, 0x7

    .line 183
    aput-object v10, v2, v3

    .line 184
    .line 185
    const/16 v3, 0x8

    .line 186
    .line 187
    aput-object v11, v2, v3

    .line 188
    .line 189
    const/16 v3, 0x9

    .line 190
    .line 191
    aput-object v12, v2, v3

    .line 192
    .line 193
    const/16 v3, 0xa

    .line 194
    .line 195
    aput-object v13, v2, v3

    .line 196
    .line 197
    const/16 v3, 0xb

    .line 198
    .line 199
    aput-object v14, v2, v3

    .line 200
    .line 201
    const/16 v3, 0xc

    .line 202
    .line 203
    aput-object v15, v2, v3

    .line 204
    .line 205
    const/16 v3, 0xd

    .line 206
    .line 207
    aput-object v16, v2, v3

    .line 208
    .line 209
    const/16 v3, 0xe

    .line 210
    .line 211
    aput-object v17, v2, v3

    .line 212
    .line 213
    const/16 v3, 0xf

    .line 214
    .line 215
    aput-object v18, v2, v3

    .line 216
    .line 217
    const/16 v3, 0x10

    .line 218
    .line 219
    aput-object v21, v2, v3

    .line 220
    .line 221
    const/16 v3, 0x11

    .line 222
    .line 223
    aput-object v1, v2, v3

    .line 224
    .line 225
    const/16 v1, 0x12

    .line 226
    .line 227
    aput-object v22, v2, v1

    .line 228
    .line 229
    const/16 v1, 0x13

    .line 230
    .line 231
    aput-object v23, v2, v1

    .line 232
    .line 233
    const/16 v1, 0x14

    .line 234
    .line 235
    aput-object v24, v2, v1

    .line 236
    .line 237
    const/16 v1, 0x15

    .line 238
    .line 239
    aput-object v25, v2, v1

    .line 240
    .line 241
    const/16 v1, 0x16

    .line 242
    .line 243
    aput-object v0, v2, v1

    .line 244
    .line 245
    const/16 v0, 0x17

    .line 246
    .line 247
    aput-object v26, v2, v0

    .line 248
    .line 249
    const/16 v0, 0x18

    .line 250
    .line 251
    aput-object v27, v2, v0

    .line 252
    .line 253
    const/16 v0, 0x19

    .line 254
    .line 255
    aput-object v28, v2, v0

    .line 256
    .line 257
    const/16 v0, 0x1a

    .line 258
    .line 259
    aput-object v29, v2, v0

    .line 260
    .line 261
    const/16 v0, 0x1b

    .line 262
    .line 263
    aput-object v30, v2, v0

    .line 264
    .line 265
    const/16 v0, 0x1c

    .line 266
    .line 267
    aput-object v8, v2, v0

    .line 268
    .line 269
    const/16 v0, 0x1d

    .line 270
    .line 271
    aput-object v4, v2, v0

    .line 272
    .line 273
    return-object v2
.end method

.method public final deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;
    .locals 65

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "decoder"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v1, Lcom/vungle/ads/internal/model/g;->b:LWf/d0;

    .line 9
    .line 10
    invoke-interface {v0, v1}, Lkotlinx/serialization/encoding/Decoder;->b(Lkotlinx/serialization/descriptors/SerialDescriptor;)LVf/a;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v4, 0x0

    .line 15
    move-object v2, v4

    .line 16
    move-object v3, v2

    .line 17
    move-object v5, v3

    .line 18
    move-object v6, v5

    .line 19
    move-object v7, v6

    .line 20
    move-object v8, v7

    .line 21
    move-object v9, v8

    .line 22
    move-object v10, v9

    .line 23
    move-object v11, v10

    .line 24
    move-object v12, v11

    .line 25
    move-object v13, v12

    .line 26
    move-object v14, v13

    .line 27
    move-object v15, v14

    .line 28
    move-object/from16 v17, v15

    .line 29
    .line 30
    move-object/from16 v18, v17

    .line 31
    .line 32
    move-object/from16 v19, v18

    .line 33
    .line 34
    move-object/from16 v20, v19

    .line 35
    .line 36
    move-object/from16 v21, v20

    .line 37
    .line 38
    move-object/from16 v22, v21

    .line 39
    .line 40
    move-object/from16 v23, v22

    .line 41
    .line 42
    move-object/from16 v24, v23

    .line 43
    .line 44
    move-object/from16 v25, v24

    .line 45
    .line 46
    move-object/from16 v26, v25

    .line 47
    .line 48
    move-object/from16 v27, v26

    .line 49
    .line 50
    move-object/from16 v28, v27

    .line 51
    .line 52
    move-object/from16 v29, v28

    .line 53
    .line 54
    move-object/from16 v30, v29

    .line 55
    .line 56
    move-object/from16 v31, v30

    .line 57
    .line 58
    move-object/from16 v32, v31

    .line 59
    .line 60
    const/16 v33, 0x1

    .line 61
    .line 62
    const/16 v34, 0x0

    .line 63
    .line 64
    :goto_0
    if-eqz v33, :cond_0

    .line 65
    .line 66
    move-object/from16 v35, v6

    .line 67
    .line 68
    invoke-interface {v0, v1}, LVf/a;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;)I

    .line 69
    .line 70
    .line 71
    move-result v6

    .line 72
    move-object/from16 v36, v7

    .line 73
    .line 74
    const/4 v7, 0x2

    .line 75
    packed-switch v6, :pswitch_data_0

    .line 76
    .line 77
    .line 78
    new-instance v0, LSf/i;

    .line 79
    .line 80
    invoke-direct {v0, v6}, LSf/i;-><init>(I)V

    .line 81
    .line 82
    .line 83
    throw v0

    .line 84
    :pswitch_0
    sget-object v6, LWf/J;->a:LWf/J;

    .line 85
    .line 86
    const/16 v7, 0x1d

    .line 87
    .line 88
    invoke-interface {v0, v1, v7, v6, v5}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    const/high16 v7, 0x20000000

    .line 93
    .line 94
    :goto_1
    move-object/from16 v40, v2

    .line 95
    .line 96
    move-object v6, v5

    .line 97
    move/from16 v37, v7

    .line 98
    .line 99
    move-object/from16 v16, v14

    .line 100
    .line 101
    move-object/from16 v5, v18

    .line 102
    .line 103
    move-object/from16 v14, v26

    .line 104
    .line 105
    move-object/from16 v2, v30

    .line 106
    .line 107
    move-object/from16 v7, v32

    .line 108
    .line 109
    move-object/from16 v32, v35

    .line 110
    .line 111
    move-object/from16 v35, v36

    .line 112
    .line 113
    move-object/from16 v36, v3

    .line 114
    .line 115
    move-object/from16 v26, v4

    .line 116
    .line 117
    move-object/from16 v4, v17

    .line 118
    .line 119
    const/4 v3, 0x0

    .line 120
    :goto_2
    move-object/from16 v17, v15

    .line 121
    .line 122
    :goto_3
    move-object v15, v13

    .line 123
    :goto_4
    move-object v13, v12

    .line 124
    move-object v12, v11

    .line 125
    move-object v11, v10

    .line 126
    move-object v10, v9

    .line 127
    move-object v9, v8

    .line 128
    move-object/from16 v8, v21

    .line 129
    .line 130
    goto/16 :goto_c

    .line 131
    .line 132
    :pswitch_1
    sget-object v6, LWf/f;->a:LWf/f;

    .line 133
    .line 134
    const/16 v7, 0x1c

    .line 135
    .line 136
    invoke-interface {v0, v1, v7, v6, v4}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v4

    .line 140
    const/high16 v7, 0x10000000

    .line 141
    .line 142
    goto :goto_1

    .line 143
    :pswitch_2
    sget-object v6, LWf/f;->a:LWf/f;

    .line 144
    .line 145
    const/16 v7, 0x1b

    .line 146
    .line 147
    invoke-interface {v0, v1, v7, v6, v2}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    const/high16 v7, 0x8000000

    .line 152
    .line 153
    goto :goto_1

    .line 154
    :pswitch_3
    sget-object v6, Lcom/vungle/ads/internal/model/d0;->a:Lcom/vungle/ads/internal/model/d0;

    .line 155
    .line 156
    const/16 v7, 0x1a

    .line 157
    .line 158
    invoke-interface {v0, v1, v7, v6, v3}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    const/high16 v7, 0x4000000

    .line 163
    .line 164
    goto :goto_1

    .line 165
    :pswitch_4
    sget-object v6, Lcom/vungle/ads/internal/model/d;->a:Lcom/vungle/ads/internal/model/d;

    .line 166
    .line 167
    const/16 v7, 0x19

    .line 168
    .line 169
    invoke-interface {v0, v1, v7, v6, v15}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v15

    .line 173
    const/high16 v7, 0x2000000

    .line 174
    .line 175
    goto :goto_1

    .line 176
    :pswitch_5
    sget-object v6, LWf/J;->a:LWf/J;

    .line 177
    .line 178
    const/16 v7, 0x18

    .line 179
    .line 180
    invoke-interface {v0, v1, v7, v6, v14}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v14

    .line 184
    const/high16 v7, 0x1000000

    .line 185
    .line 186
    goto :goto_1

    .line 187
    :pswitch_6
    sget-object v6, LWf/J;->a:LWf/J;

    .line 188
    .line 189
    const/16 v7, 0x17

    .line 190
    .line 191
    invoke-interface {v0, v1, v7, v6, v13}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v13

    .line 195
    const/high16 v7, 0x800000

    .line 196
    .line 197
    goto :goto_1

    .line 198
    :pswitch_7
    sget-object v6, LWf/q0;->a:LWf/q0;

    .line 199
    .line 200
    const/16 v7, 0x16

    .line 201
    .line 202
    invoke-interface {v0, v1, v7, v6, v12}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v12

    .line 206
    const/high16 v7, 0x400000

    .line 207
    .line 208
    goto :goto_1

    .line 209
    :pswitch_8
    sget-object v6, LWf/q0;->a:LWf/q0;

    .line 210
    .line 211
    const/16 v7, 0x15

    .line 212
    .line 213
    invoke-interface {v0, v1, v7, v6, v11}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v11

    .line 217
    const/high16 v7, 0x200000

    .line 218
    .line 219
    goto :goto_1

    .line 220
    :pswitch_9
    sget-object v6, Lcom/vungle/ads/internal/model/t;->a:Lcom/vungle/ads/internal/model/t;

    .line 221
    .line 222
    const/16 v7, 0x14

    .line 223
    .line 224
    invoke-interface {v0, v1, v7, v6, v10}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v10

    .line 228
    const/high16 v7, 0x100000

    .line 229
    .line 230
    goto/16 :goto_1

    .line 231
    .line 232
    :pswitch_a
    sget-object v6, LWf/q0;->a:LWf/q0;

    .line 233
    .line 234
    const/16 v7, 0x13

    .line 235
    .line 236
    invoke-interface {v0, v1, v7, v6, v9}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v9

    .line 240
    const/high16 v7, 0x80000

    .line 241
    .line 242
    goto/16 :goto_1

    .line 243
    .line 244
    :pswitch_b
    sget-object v6, Lcom/vungle/ads/internal/model/x;->a:Lcom/vungle/ads/internal/model/x;

    .line 245
    .line 246
    const/16 v7, 0x12

    .line 247
    .line 248
    invoke-interface {v0, v1, v7, v6, v8}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v8

    .line 252
    const/high16 v7, 0x40000

    .line 253
    .line 254
    goto/16 :goto_1

    .line 255
    .line 256
    :pswitch_c
    new-instance v6, LWf/c;

    .line 257
    .line 258
    sget-object v7, LWf/q0;->a:LWf/q0;

    .line 259
    .line 260
    move-object/from16 v40, v2

    .line 261
    .line 262
    const/4 v2, 0x0

    .line 263
    invoke-direct {v6, v7, v2}, LWf/c;-><init>(Lkotlinx/serialization/KSerializer;I)V

    .line 264
    .line 265
    .line 266
    const/16 v2, 0x11

    .line 267
    .line 268
    move-object/from16 v7, v36

    .line 269
    .line 270
    invoke-interface {v0, v1, v2, v6, v7}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v7

    .line 274
    const/high16 v2, 0x20000

    .line 275
    .line 276
    move-object/from16 v6, v35

    .line 277
    .line 278
    move-object/from16 v35, v7

    .line 279
    .line 280
    move-object/from16 v7, v32

    .line 281
    .line 282
    move-object/from16 v32, v6

    .line 283
    .line 284
    move/from16 v37, v2

    .line 285
    .line 286
    move-object/from16 v36, v3

    .line 287
    .line 288
    :goto_5
    move-object v6, v5

    .line 289
    move-object/from16 v16, v14

    .line 290
    .line 291
    move-object/from16 v5, v18

    .line 292
    .line 293
    move-object/from16 v14, v26

    .line 294
    .line 295
    move-object/from16 v2, v30

    .line 296
    .line 297
    :goto_6
    const/4 v3, 0x0

    .line 298
    move-object/from16 v26, v4

    .line 299
    .line 300
    move-object/from16 v4, v17

    .line 301
    .line 302
    goto/16 :goto_2

    .line 303
    .line 304
    :pswitch_d
    move-object/from16 v40, v2

    .line 305
    .line 306
    move-object/from16 v7, v36

    .line 307
    .line 308
    new-instance v2, LWf/c;

    .line 309
    .line 310
    sget-object v6, LWf/q0;->a:LWf/q0;

    .line 311
    .line 312
    move-object/from16 v36, v3

    .line 313
    .line 314
    const/4 v3, 0x0

    .line 315
    invoke-direct {v2, v6, v3}, LWf/c;-><init>(Lkotlinx/serialization/KSerializer;I)V

    .line 316
    .line 317
    .line 318
    move-object/from16 v3, v35

    .line 319
    .line 320
    const/16 v6, 0x10

    .line 321
    .line 322
    invoke-interface {v0, v1, v6, v2, v3}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v6

    .line 326
    const/high16 v2, 0x10000

    .line 327
    .line 328
    move/from16 v37, v2

    .line 329
    .line 330
    move-object/from16 v35, v7

    .line 331
    .line 332
    move-object/from16 v16, v14

    .line 333
    .line 334
    move-object/from16 v14, v26

    .line 335
    .line 336
    move-object/from16 v2, v30

    .line 337
    .line 338
    move-object/from16 v7, v32

    .line 339
    .line 340
    const/4 v3, 0x0

    .line 341
    move-object/from16 v26, v4

    .line 342
    .line 343
    move-object/from16 v32, v6

    .line 344
    .line 345
    move-object/from16 v4, v17

    .line 346
    .line 347
    move-object v6, v5

    .line 348
    move-object/from16 v17, v15

    .line 349
    .line 350
    move-object/from16 v5, v18

    .line 351
    .line 352
    goto/16 :goto_3

    .line 353
    .line 354
    :pswitch_e
    move-object/from16 v40, v2

    .line 355
    .line 356
    move-object/from16 v7, v36

    .line 357
    .line 358
    move-object/from16 v36, v3

    .line 359
    .line 360
    move-object/from16 v3, v35

    .line 361
    .line 362
    sget-object v2, LWf/q0;->a:LWf/q0;

    .line 363
    .line 364
    const/16 v6, 0xf

    .line 365
    .line 366
    move-object/from16 v35, v7

    .line 367
    .line 368
    move-object/from16 v7, v32

    .line 369
    .line 370
    invoke-interface {v0, v1, v6, v2, v7}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v2

    .line 374
    const v7, 0x8000

    .line 375
    .line 376
    .line 377
    move-object/from16 v32, v3

    .line 378
    .line 379
    move-object v6, v5

    .line 380
    move/from16 v37, v7

    .line 381
    .line 382
    move-object/from16 v16, v14

    .line 383
    .line 384
    move-object/from16 v5, v18

    .line 385
    .line 386
    move-object/from16 v14, v26

    .line 387
    .line 388
    const/4 v3, 0x0

    .line 389
    move-object v7, v2

    .line 390
    move-object/from16 v26, v4

    .line 391
    .line 392
    move-object/from16 v4, v17

    .line 393
    .line 394
    move-object/from16 v2, v30

    .line 395
    .line 396
    goto/16 :goto_2

    .line 397
    .line 398
    :pswitch_f
    move-object/from16 v7, v36

    .line 399
    .line 400
    move-object/from16 v36, v3

    .line 401
    .line 402
    move-object/from16 v3, v35

    .line 403
    .line 404
    move-object/from16 v35, v7

    .line 405
    .line 406
    move-object/from16 v40, v2

    .line 407
    .line 408
    move-object/from16 v7, v32

    .line 409
    .line 410
    sget-object v2, LWf/q0;->a:LWf/q0;

    .line 411
    .line 412
    const/16 v6, 0xe

    .line 413
    .line 414
    move-object/from16 v32, v3

    .line 415
    .line 416
    move-object/from16 v3, v31

    .line 417
    .line 418
    invoke-interface {v0, v1, v6, v2, v3}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object v2

    .line 422
    const/16 v3, 0x4000

    .line 423
    .line 424
    move-object/from16 v31, v2

    .line 425
    .line 426
    :goto_7
    move/from16 v37, v3

    .line 427
    .line 428
    goto/16 :goto_5

    .line 429
    .line 430
    :pswitch_10
    move-object/from16 v40, v2

    .line 431
    .line 432
    move-object/from16 v7, v32

    .line 433
    .line 434
    move-object/from16 v32, v35

    .line 435
    .line 436
    move-object/from16 v35, v36

    .line 437
    .line 438
    move-object/from16 v36, v3

    .line 439
    .line 440
    move-object/from16 v3, v31

    .line 441
    .line 442
    sget-object v2, LWf/q0;->a:LWf/q0;

    .line 443
    .line 444
    const/16 v6, 0xd

    .line 445
    .line 446
    move-object/from16 v3, v30

    .line 447
    .line 448
    invoke-interface {v0, v1, v6, v2, v3}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object v2

    .line 452
    const/16 v3, 0x2000

    .line 453
    .line 454
    move/from16 v37, v3

    .line 455
    .line 456
    move-object v6, v5

    .line 457
    move-object/from16 v16, v14

    .line 458
    .line 459
    move-object/from16 v5, v18

    .line 460
    .line 461
    move-object/from16 v14, v26

    .line 462
    .line 463
    goto/16 :goto_6

    .line 464
    .line 465
    :pswitch_11
    move-object/from16 v40, v2

    .line 466
    .line 467
    move-object/from16 v7, v32

    .line 468
    .line 469
    move-object/from16 v32, v35

    .line 470
    .line 471
    move-object/from16 v35, v36

    .line 472
    .line 473
    move-object/from16 v36, v3

    .line 474
    .line 475
    move-object/from16 v3, v30

    .line 476
    .line 477
    sget-object v2, Lcom/vungle/ads/internal/model/w;->a:Lcom/vungle/ads/internal/model/w;

    .line 478
    .line 479
    const/16 v6, 0xc

    .line 480
    .line 481
    move-object/from16 v3, v29

    .line 482
    .line 483
    invoke-interface {v0, v1, v6, v2, v3}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object v3

    .line 487
    const/16 v2, 0x1000

    .line 488
    .line 489
    move/from16 v37, v2

    .line 490
    .line 491
    move-object/from16 v29, v3

    .line 492
    .line 493
    goto/16 :goto_5

    .line 494
    .line 495
    :pswitch_12
    move-object/from16 v40, v2

    .line 496
    .line 497
    move-object/from16 v7, v32

    .line 498
    .line 499
    move-object/from16 v32, v35

    .line 500
    .line 501
    move-object/from16 v35, v36

    .line 502
    .line 503
    move-object/from16 v36, v3

    .line 504
    .line 505
    move-object/from16 v3, v29

    .line 506
    .line 507
    sget-object v2, LWf/J;->a:LWf/J;

    .line 508
    .line 509
    const/16 v6, 0xb

    .line 510
    .line 511
    move-object/from16 v3, v28

    .line 512
    .line 513
    invoke-interface {v0, v1, v6, v2, v3}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    move-result-object v2

    .line 517
    const/16 v3, 0x800

    .line 518
    .line 519
    move-object/from16 v28, v2

    .line 520
    .line 521
    goto :goto_7

    .line 522
    :pswitch_13
    move-object/from16 v40, v2

    .line 523
    .line 524
    move-object/from16 v7, v32

    .line 525
    .line 526
    move-object/from16 v32, v35

    .line 527
    .line 528
    move-object/from16 v35, v36

    .line 529
    .line 530
    move-object/from16 v36, v3

    .line 531
    .line 532
    move-object/from16 v3, v28

    .line 533
    .line 534
    sget-object v2, LWf/J;->a:LWf/J;

    .line 535
    .line 536
    const/16 v6, 0xa

    .line 537
    .line 538
    move-object/from16 v3, v27

    .line 539
    .line 540
    invoke-interface {v0, v1, v6, v2, v3}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    move-result-object v2

    .line 544
    const/16 v3, 0x400

    .line 545
    .line 546
    move-object/from16 v27, v2

    .line 547
    .line 548
    goto :goto_7

    .line 549
    :pswitch_14
    move-object/from16 v40, v2

    .line 550
    .line 551
    move-object/from16 v7, v32

    .line 552
    .line 553
    move-object/from16 v32, v35

    .line 554
    .line 555
    move-object/from16 v35, v36

    .line 556
    .line 557
    move-object/from16 v36, v3

    .line 558
    .line 559
    move-object/from16 v3, v27

    .line 560
    .line 561
    sget-object v2, LWf/q0;->a:LWf/q0;

    .line 562
    .line 563
    const/16 v6, 0x9

    .line 564
    .line 565
    move-object/from16 v3, v26

    .line 566
    .line 567
    invoke-interface {v0, v1, v6, v2, v3}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 568
    .line 569
    .line 570
    move-result-object v2

    .line 571
    const/16 v3, 0x200

    .line 572
    .line 573
    move/from16 v37, v3

    .line 574
    .line 575
    move-object/from16 v26, v4

    .line 576
    .line 577
    move-object v6, v5

    .line 578
    move-object/from16 v16, v14

    .line 579
    .line 580
    move-object/from16 v4, v17

    .line 581
    .line 582
    move-object/from16 v5, v18

    .line 583
    .line 584
    const/4 v3, 0x0

    .line 585
    move-object v14, v2

    .line 586
    :goto_8
    move-object/from16 v17, v15

    .line 587
    .line 588
    move-object/from16 v2, v30

    .line 589
    .line 590
    goto/16 :goto_3

    .line 591
    .line 592
    :pswitch_15
    move-object/from16 v40, v2

    .line 593
    .line 594
    move-object/from16 v7, v32

    .line 595
    .line 596
    move-object/from16 v32, v35

    .line 597
    .line 598
    move-object/from16 v35, v36

    .line 599
    .line 600
    move-object/from16 v36, v3

    .line 601
    .line 602
    move-object/from16 v3, v26

    .line 603
    .line 604
    sget-object v2, LWf/q0;->a:LWf/q0;

    .line 605
    .line 606
    move-object/from16 v6, v25

    .line 607
    .line 608
    move-object/from16 v25, v3

    .line 609
    .line 610
    const/16 v3, 0x8

    .line 611
    .line 612
    invoke-interface {v0, v1, v3, v2, v6}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 613
    .line 614
    .line 615
    move-result-object v2

    .line 616
    const/16 v3, 0x100

    .line 617
    .line 618
    move/from16 v37, v3

    .line 619
    .line 620
    move-object/from16 v26, v4

    .line 621
    .line 622
    move-object v6, v5

    .line 623
    move-object/from16 v16, v14

    .line 624
    .line 625
    move-object/from16 v4, v17

    .line 626
    .line 627
    move-object/from16 v5, v18

    .line 628
    .line 629
    move-object/from16 v14, v25

    .line 630
    .line 631
    const/4 v3, 0x0

    .line 632
    move-object/from16 v25, v2

    .line 633
    .line 634
    goto :goto_8

    .line 635
    :pswitch_16
    move-object/from16 v40, v2

    .line 636
    .line 637
    move-object/from16 v6, v25

    .line 638
    .line 639
    move-object/from16 v25, v26

    .line 640
    .line 641
    move-object/from16 v7, v32

    .line 642
    .line 643
    move-object/from16 v32, v35

    .line 644
    .line 645
    move-object/from16 v35, v36

    .line 646
    .line 647
    move-object/from16 v36, v3

    .line 648
    .line 649
    sget-object v2, LWf/f;->a:LWf/f;

    .line 650
    .line 651
    const/4 v3, 0x7

    .line 652
    move-object/from16 v26, v4

    .line 653
    .line 654
    move-object/from16 v4, v24

    .line 655
    .line 656
    invoke-interface {v0, v1, v3, v2, v4}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 657
    .line 658
    .line 659
    move-result-object v2

    .line 660
    const/16 v3, 0x80

    .line 661
    .line 662
    move-object/from16 v24, v2

    .line 663
    .line 664
    :goto_9
    move/from16 v37, v3

    .line 665
    .line 666
    move-object/from16 v16, v14

    .line 667
    .line 668
    move-object/from16 v4, v17

    .line 669
    .line 670
    move-object/from16 v14, v25

    .line 671
    .line 672
    move-object/from16 v2, v30

    .line 673
    .line 674
    const/4 v3, 0x0

    .line 675
    move-object/from16 v25, v6

    .line 676
    .line 677
    move-object/from16 v17, v15

    .line 678
    .line 679
    move-object v6, v5

    .line 680
    move-object v15, v13

    .line 681
    move-object/from16 v5, v18

    .line 682
    .line 683
    goto/16 :goto_4

    .line 684
    .line 685
    :pswitch_17
    move-object/from16 v40, v2

    .line 686
    .line 687
    move-object/from16 v6, v25

    .line 688
    .line 689
    move-object/from16 v25, v26

    .line 690
    .line 691
    move-object/from16 v7, v32

    .line 692
    .line 693
    move-object/from16 v32, v35

    .line 694
    .line 695
    move-object/from16 v35, v36

    .line 696
    .line 697
    move-object/from16 v36, v3

    .line 698
    .line 699
    move-object/from16 v26, v4

    .line 700
    .line 701
    move-object/from16 v4, v24

    .line 702
    .line 703
    sget-object v2, LWf/f;->a:LWf/f;

    .line 704
    .line 705
    const/4 v3, 0x6

    .line 706
    move-object/from16 v4, v23

    .line 707
    .line 708
    invoke-interface {v0, v1, v3, v2, v4}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 709
    .line 710
    .line 711
    move-result-object v2

    .line 712
    const/16 v3, 0x40

    .line 713
    .line 714
    move-object/from16 v23, v2

    .line 715
    .line 716
    goto :goto_9

    .line 717
    :pswitch_18
    move-object/from16 v40, v2

    .line 718
    .line 719
    move-object/from16 v6, v25

    .line 720
    .line 721
    move-object/from16 v25, v26

    .line 722
    .line 723
    move-object/from16 v7, v32

    .line 724
    .line 725
    move-object/from16 v32, v35

    .line 726
    .line 727
    move-object/from16 v35, v36

    .line 728
    .line 729
    move-object/from16 v36, v3

    .line 730
    .line 731
    move-object/from16 v26, v4

    .line 732
    .line 733
    move-object/from16 v4, v23

    .line 734
    .line 735
    sget-object v2, LWf/q0;->a:LWf/q0;

    .line 736
    .line 737
    const/4 v3, 0x5

    .line 738
    move-object/from16 v4, v22

    .line 739
    .line 740
    invoke-interface {v0, v1, v3, v2, v4}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 741
    .line 742
    .line 743
    move-result-object v2

    .line 744
    const/16 v3, 0x20

    .line 745
    .line 746
    move-object/from16 v22, v2

    .line 747
    .line 748
    goto :goto_9

    .line 749
    :pswitch_19
    move-object/from16 v40, v2

    .line 750
    .line 751
    move-object/from16 v2, v25

    .line 752
    .line 753
    move-object/from16 v25, v26

    .line 754
    .line 755
    move-object/from16 v7, v32

    .line 756
    .line 757
    move-object/from16 v32, v35

    .line 758
    .line 759
    move-object/from16 v35, v36

    .line 760
    .line 761
    const/16 v6, 0x10

    .line 762
    .line 763
    move-object/from16 v36, v3

    .line 764
    .line 765
    move-object/from16 v26, v4

    .line 766
    .line 767
    move-object/from16 v4, v22

    .line 768
    .line 769
    sget-object v3, LWf/J;->a:LWf/J;

    .line 770
    .line 771
    move-object/from16 v6, v21

    .line 772
    .line 773
    move-object/from16 v21, v2

    .line 774
    .line 775
    const/4 v2, 0x4

    .line 776
    invoke-interface {v0, v1, v2, v3, v6}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 777
    .line 778
    .line 779
    move-result-object v2

    .line 780
    move-object v6, v5

    .line 781
    move-object/from16 v16, v14

    .line 782
    .line 783
    move-object/from16 v4, v17

    .line 784
    .line 785
    move-object/from16 v5, v18

    .line 786
    .line 787
    move-object/from16 v14, v25

    .line 788
    .line 789
    const/4 v3, 0x0

    .line 790
    const/16 v37, 0x10

    .line 791
    .line 792
    move-object/from16 v17, v15

    .line 793
    .line 794
    move-object/from16 v25, v21

    .line 795
    .line 796
    move-object v15, v13

    .line 797
    move-object v13, v12

    .line 798
    move-object v12, v11

    .line 799
    move-object v11, v10

    .line 800
    move-object v10, v9

    .line 801
    move-object v9, v8

    .line 802
    move-object v8, v2

    .line 803
    :goto_a
    move-object/from16 v2, v30

    .line 804
    .line 805
    goto/16 :goto_c

    .line 806
    .line 807
    :pswitch_1a
    move-object/from16 v40, v2

    .line 808
    .line 809
    move-object/from16 v6, v21

    .line 810
    .line 811
    move-object/from16 v21, v25

    .line 812
    .line 813
    move-object/from16 v25, v26

    .line 814
    .line 815
    move-object/from16 v7, v32

    .line 816
    .line 817
    move-object/from16 v32, v35

    .line 818
    .line 819
    move-object/from16 v35, v36

    .line 820
    .line 821
    move-object/from16 v36, v3

    .line 822
    .line 823
    move-object/from16 v26, v4

    .line 824
    .line 825
    move-object/from16 v4, v22

    .line 826
    .line 827
    const/16 v3, 0x8

    .line 828
    .line 829
    sget-object v2, LWf/J;->a:LWf/J;

    .line 830
    .line 831
    const/4 v3, 0x3

    .line 832
    move-object/from16 v4, v20

    .line 833
    .line 834
    invoke-interface {v0, v1, v3, v2, v4}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 835
    .line 836
    .line 837
    move-result-object v2

    .line 838
    move-object/from16 v20, v2

    .line 839
    .line 840
    move-object/from16 v16, v14

    .line 841
    .line 842
    move-object/from16 v4, v17

    .line 843
    .line 844
    move-object/from16 v14, v25

    .line 845
    .line 846
    move-object/from16 v2, v30

    .line 847
    .line 848
    const/4 v3, 0x0

    .line 849
    const/16 v37, 0x8

    .line 850
    .line 851
    :goto_b
    move-object/from16 v17, v15

    .line 852
    .line 853
    move-object/from16 v25, v21

    .line 854
    .line 855
    move-object v15, v13

    .line 856
    move-object v13, v12

    .line 857
    move-object v12, v11

    .line 858
    move-object v11, v10

    .line 859
    move-object v10, v9

    .line 860
    move-object v9, v8

    .line 861
    move-object v8, v6

    .line 862
    move-object v6, v5

    .line 863
    move-object/from16 v5, v18

    .line 864
    .line 865
    goto/16 :goto_c

    .line 866
    .line 867
    :pswitch_1b
    move-object/from16 v6, v36

    .line 868
    .line 869
    move-object/from16 v36, v3

    .line 870
    .line 871
    move v3, v7

    .line 872
    move-object/from16 v7, v32

    .line 873
    .line 874
    move-object/from16 v32, v35

    .line 875
    .line 876
    move-object/from16 v35, v6

    .line 877
    .line 878
    move-object/from16 v40, v2

    .line 879
    .line 880
    move-object/from16 v6, v21

    .line 881
    .line 882
    move-object/from16 v21, v25

    .line 883
    .line 884
    move-object/from16 v25, v26

    .line 885
    .line 886
    move-object/from16 v26, v4

    .line 887
    .line 888
    move-object/from16 v4, v20

    .line 889
    .line 890
    sget-object v2, LWf/q0;->a:LWf/q0;

    .line 891
    .line 892
    move-object/from16 v4, v19

    .line 893
    .line 894
    invoke-interface {v0, v1, v3, v2, v4}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 895
    .line 896
    .line 897
    move-result-object v2

    .line 898
    move-object/from16 v19, v2

    .line 899
    .line 900
    move-object/from16 v16, v14

    .line 901
    .line 902
    move-object/from16 v4, v17

    .line 903
    .line 904
    move-object/from16 v14, v25

    .line 905
    .line 906
    move-object/from16 v2, v30

    .line 907
    .line 908
    const/4 v3, 0x0

    .line 909
    const/16 v37, 0x4

    .line 910
    .line 911
    goto :goto_b

    .line 912
    :pswitch_1c
    move-object/from16 v6, v36

    .line 913
    .line 914
    move-object/from16 v36, v3

    .line 915
    .line 916
    move v3, v7

    .line 917
    move-object/from16 v7, v32

    .line 918
    .line 919
    move-object/from16 v32, v35

    .line 920
    .line 921
    move-object/from16 v35, v6

    .line 922
    .line 923
    move-object/from16 v40, v2

    .line 924
    .line 925
    move-object/from16 v6, v21

    .line 926
    .line 927
    move-object/from16 v21, v25

    .line 928
    .line 929
    move-object/from16 v25, v26

    .line 930
    .line 931
    move-object/from16 v26, v4

    .line 932
    .line 933
    move-object/from16 v4, v19

    .line 934
    .line 935
    sget-object v2, LWf/q0;->a:LWf/q0;

    .line 936
    .line 937
    move-object/from16 v16, v4

    .line 938
    .line 939
    move-object/from16 v4, v18

    .line 940
    .line 941
    const/4 v3, 0x1

    .line 942
    invoke-interface {v0, v1, v3, v2, v4}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 943
    .line 944
    .line 945
    move-result-object v2

    .line 946
    move-object/from16 v19, v16

    .line 947
    .line 948
    move-object/from16 v4, v17

    .line 949
    .line 950
    const/4 v3, 0x0

    .line 951
    const/16 v37, 0x2

    .line 952
    .line 953
    move-object/from16 v16, v14

    .line 954
    .line 955
    move-object/from16 v17, v15

    .line 956
    .line 957
    move-object/from16 v14, v25

    .line 958
    .line 959
    move-object v15, v13

    .line 960
    move-object/from16 v25, v21

    .line 961
    .line 962
    move-object v13, v12

    .line 963
    move-object v12, v11

    .line 964
    move-object v11, v10

    .line 965
    move-object v10, v9

    .line 966
    move-object v9, v8

    .line 967
    move-object v8, v6

    .line 968
    move-object v6, v5

    .line 969
    move-object v5, v2

    .line 970
    goto/16 :goto_a

    .line 971
    .line 972
    :pswitch_1d
    move-object/from16 v40, v2

    .line 973
    .line 974
    move-object/from16 v16, v19

    .line 975
    .line 976
    move-object/from16 v6, v21

    .line 977
    .line 978
    move-object/from16 v21, v25

    .line 979
    .line 980
    move-object/from16 v25, v26

    .line 981
    .line 982
    move-object/from16 v7, v32

    .line 983
    .line 984
    move-object/from16 v32, v35

    .line 985
    .line 986
    move-object/from16 v35, v36

    .line 987
    .line 988
    move-object/from16 v36, v3

    .line 989
    .line 990
    move-object/from16 v26, v4

    .line 991
    .line 992
    move-object/from16 v4, v18

    .line 993
    .line 994
    const/4 v3, 0x1

    .line 995
    sget-object v2, LWf/q0;->a:LWf/q0;

    .line 996
    .line 997
    move-object/from16 v3, v17

    .line 998
    .line 999
    move-object/from16 v17, v4

    .line 1000
    .line 1001
    move-object v4, v3

    .line 1002
    const/4 v3, 0x0

    .line 1003
    invoke-interface {v0, v1, v3, v2, v4}, LVf/a;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v4

    .line 1007
    move-object v2, v6

    .line 1008
    move-object v6, v5

    .line 1009
    move-object/from16 v5, v17

    .line 1010
    .line 1011
    move-object/from16 v17, v15

    .line 1012
    .line 1013
    move-object v15, v13

    .line 1014
    move-object v13, v12

    .line 1015
    move-object v12, v11

    .line 1016
    move-object v11, v10

    .line 1017
    move-object v10, v9

    .line 1018
    move-object v9, v8

    .line 1019
    move-object v8, v2

    .line 1020
    move-object/from16 v2, v30

    .line 1021
    .line 1022
    const/16 v37, 0x1

    .line 1023
    .line 1024
    move-object/from16 v16, v14

    .line 1025
    .line 1026
    move-object/from16 v14, v25

    .line 1027
    .line 1028
    move-object/from16 v25, v21

    .line 1029
    .line 1030
    :goto_c
    or-int v34, v34, v37

    .line 1031
    .line 1032
    move-object/from16 v30, v2

    .line 1033
    .line 1034
    move-object/from16 v21, v8

    .line 1035
    .line 1036
    move-object v8, v9

    .line 1037
    move-object v9, v10

    .line 1038
    move-object v10, v11

    .line 1039
    move-object v11, v12

    .line 1040
    move-object v12, v13

    .line 1041
    move-object v13, v15

    .line 1042
    move-object/from16 v15, v17

    .line 1043
    .line 1044
    move-object/from16 v17, v4

    .line 1045
    .line 1046
    move-object/from16 v4, v26

    .line 1047
    .line 1048
    move-object/from16 v26, v14

    .line 1049
    .line 1050
    move-object/from16 v14, v16

    .line 1051
    .line 1052
    move-object/from16 v16, v5

    .line 1053
    .line 1054
    move-object v5, v6

    .line 1055
    move-object/from16 v2, v40

    .line 1056
    .line 1057
    :goto_d
    move-object/from16 v6, v32

    .line 1058
    .line 1059
    move-object/from16 v32, v7

    .line 1060
    .line 1061
    move-object/from16 v7, v35

    .line 1062
    .line 1063
    goto :goto_e

    .line 1064
    :pswitch_1e
    move-object/from16 v40, v2

    .line 1065
    .line 1066
    move-object/from16 v16, v19

    .line 1067
    .line 1068
    move-object/from16 v6, v21

    .line 1069
    .line 1070
    move-object/from16 v21, v25

    .line 1071
    .line 1072
    move-object/from16 v25, v26

    .line 1073
    .line 1074
    move-object/from16 v7, v32

    .line 1075
    .line 1076
    move-object/from16 v32, v35

    .line 1077
    .line 1078
    move-object/from16 v35, v36

    .line 1079
    .line 1080
    move-object/from16 v36, v3

    .line 1081
    .line 1082
    move-object/from16 v26, v4

    .line 1083
    .line 1084
    move-object/from16 v4, v17

    .line 1085
    .line 1086
    move-object/from16 v17, v18

    .line 1087
    .line 1088
    const/4 v3, 0x0

    .line 1089
    move/from16 v33, v3

    .line 1090
    .line 1091
    move-object/from16 v16, v17

    .line 1092
    .line 1093
    move-object/from16 v17, v4

    .line 1094
    .line 1095
    move-object/from16 v4, v26

    .line 1096
    .line 1097
    move-object/from16 v26, v25

    .line 1098
    .line 1099
    move-object/from16 v25, v21

    .line 1100
    .line 1101
    move-object/from16 v21, v6

    .line 1102
    .line 1103
    goto :goto_d

    .line 1104
    :goto_e
    move-object/from16 v18, v16

    .line 1105
    .line 1106
    move-object/from16 v3, v36

    .line 1107
    .line 1108
    goto/16 :goto_0

    .line 1109
    .line 1110
    :cond_0
    move-object/from16 v40, v2

    .line 1111
    .line 1112
    move-object/from16 v36, v3

    .line 1113
    .line 1114
    move-object/from16 v35, v7

    .line 1115
    .line 1116
    move-object/from16 v16, v19

    .line 1117
    .line 1118
    move-object/from16 v7, v32

    .line 1119
    .line 1120
    move-object/from16 v32, v6

    .line 1121
    .line 1122
    move-object/from16 v6, v21

    .line 1123
    .line 1124
    move-object/from16 v21, v25

    .line 1125
    .line 1126
    move-object/from16 v25, v26

    .line 1127
    .line 1128
    move-object/from16 v26, v4

    .line 1129
    .line 1130
    move-object/from16 v4, v17

    .line 1131
    .line 1132
    move-object/from16 v17, v18

    .line 1133
    .line 1134
    invoke-interface {v0, v1}, LVf/a;->c(Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 1135
    .line 1136
    .line 1137
    new-instance v33, Lcom/vungle/ads/internal/model/i;

    .line 1138
    .line 1139
    move-object v0, v4

    .line 1140
    check-cast v0, Ljava/lang/String;

    .line 1141
    .line 1142
    move-object/from16 v18, v17

    .line 1143
    .line 1144
    check-cast v18, Ljava/lang/String;

    .line 1145
    .line 1146
    move-object/from16 v37, v16

    .line 1147
    .line 1148
    check-cast v37, Ljava/lang/String;

    .line 1149
    .line 1150
    move-object/from16 v38, v20

    .line 1151
    .line 1152
    check-cast v38, Ljava/lang/Integer;

    .line 1153
    .line 1154
    move-object/from16 v39, v6

    .line 1155
    .line 1156
    check-cast v39, Ljava/lang/Integer;

    .line 1157
    .line 1158
    check-cast v22, Ljava/lang/String;

    .line 1159
    .line 1160
    move-object/from16 v41, v23

    .line 1161
    .line 1162
    check-cast v41, Ljava/lang/Boolean;

    .line 1163
    .line 1164
    move-object/from16 v42, v24

    .line 1165
    .line 1166
    check-cast v42, Ljava/lang/Boolean;

    .line 1167
    .line 1168
    move-object/from16 v43, v21

    .line 1169
    .line 1170
    check-cast v43, Ljava/lang/String;

    .line 1171
    .line 1172
    move-object/from16 v44, v25

    .line 1173
    .line 1174
    check-cast v44, Ljava/lang/String;

    .line 1175
    .line 1176
    move-object/from16 v45, v27

    .line 1177
    .line 1178
    check-cast v45, Ljava/lang/Integer;

    .line 1179
    .line 1180
    move-object/from16 v46, v28

    .line 1181
    .line 1182
    check-cast v46, Ljava/lang/Integer;

    .line 1183
    .line 1184
    move-object/from16 v47, v29

    .line 1185
    .line 1186
    check-cast v47, Ljava/util/Map;

    .line 1187
    .line 1188
    move-object/from16 v48, v30

    .line 1189
    .line 1190
    check-cast v48, Ljava/lang/String;

    .line 1191
    .line 1192
    move-object/from16 v49, v31

    .line 1193
    .line 1194
    check-cast v49, Ljava/lang/String;

    .line 1195
    .line 1196
    move-object/from16 v50, v7

    .line 1197
    .line 1198
    check-cast v50, Ljava/lang/String;

    .line 1199
    .line 1200
    move-object/from16 v51, v32

    .line 1201
    .line 1202
    check-cast v51, Ljava/util/List;

    .line 1203
    .line 1204
    move-object/from16 v52, v35

    .line 1205
    .line 1206
    check-cast v52, Ljava/util/List;

    .line 1207
    .line 1208
    move-object/from16 v53, v8

    .line 1209
    .line 1210
    check-cast v53, Lcom/vungle/ads/internal/model/z;

    .line 1211
    .line 1212
    move-object/from16 v54, v9

    .line 1213
    .line 1214
    check-cast v54, Ljava/lang/String;

    .line 1215
    .line 1216
    move-object/from16 v55, v10

    .line 1217
    .line 1218
    check-cast v55, Lcom/vungle/ads/internal/model/v;

    .line 1219
    .line 1220
    move-object/from16 v56, v11

    .line 1221
    .line 1222
    check-cast v56, Ljava/lang/String;

    .line 1223
    .line 1224
    move-object/from16 v57, v12

    .line 1225
    .line 1226
    check-cast v57, Ljava/lang/String;

    .line 1227
    .line 1228
    move-object/from16 v58, v13

    .line 1229
    .line 1230
    check-cast v58, Ljava/lang/Integer;

    .line 1231
    .line 1232
    move-object/from16 v59, v14

    .line 1233
    .line 1234
    check-cast v59, Ljava/lang/Integer;

    .line 1235
    .line 1236
    move-object/from16 v60, v15

    .line 1237
    .line 1238
    check-cast v60, Lcom/vungle/ads/internal/model/f;

    .line 1239
    .line 1240
    move-object/from16 v61, v36

    .line 1241
    .line 1242
    check-cast v61, Lcom/vungle/ads/internal/model/f0;

    .line 1243
    .line 1244
    move-object/from16 v62, v40

    .line 1245
    .line 1246
    check-cast v62, Ljava/lang/Boolean;

    .line 1247
    .line 1248
    move-object/from16 v63, v26

    .line 1249
    .line 1250
    check-cast v63, Ljava/lang/Boolean;

    .line 1251
    .line 1252
    move-object/from16 v64, v5

    .line 1253
    .line 1254
    check-cast v64, Ljava/lang/Integer;

    .line 1255
    .line 1256
    move-object/from16 v35, v0

    .line 1257
    .line 1258
    move-object/from16 v36, v18

    .line 1259
    .line 1260
    move-object/from16 v40, v22

    .line 1261
    .line 1262
    invoke-direct/range {v33 .. v64}, Lcom/vungle/ads/internal/model/i;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/vungle/ads/internal/model/z;Ljava/lang/String;Lcom/vungle/ads/internal/model/v;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/vungle/ads/internal/model/f;Lcom/vungle/ads/internal/model/f0;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)V

    .line 1263
    .line 1264
    .line 1265
    return-object v33

    .line 1266
    nop

    .line 1267
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;
    .locals 1

    sget-object v0, Lcom/vungle/ads/internal/model/g;->b:LWf/d0;

    return-object v0
.end method

.method public final serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p2, Lcom/vungle/ads/internal/model/i;

    .line 2
    .line 3
    const-string v0, "encoder"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v0, "value"

    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    sget-object v0, Lcom/vungle/ads/internal/model/g;->b:LWf/d0;

    .line 14
    .line 15
    invoke-interface {p1, v0}, Lkotlinx/serialization/encoding/Encoder;->b(Lkotlinx/serialization/descriptors/SerialDescriptor;)LVf/b;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p2, p1, v0}, Lcom/vungle/ads/internal/model/i;->a(Lcom/vungle/ads/internal/model/i;LVf/b;LWf/d0;)V

    .line 20
    .line 21
    .line 22
    invoke-interface {p1, v0}, LVf/b;->c(Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final typeParametersSerializers()[Lkotlinx/serialization/KSerializer;
    .locals 1

    .line 1
    sget-object v0, LWf/b0;->b:[Lkotlinx/serialization/KSerializer;

    .line 2
    .line 3
    return-object v0
.end method
