.class public final Lcom/moloco/sdk/internal/publisher/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LHf/e0;

.field public final b:Lcom/moloco/sdk/internal/services/k;

.field public final c:Lcom/moloco/sdk/internal/publisher/u;

.field public final d:Ltf/l;

.field public final e:LLf/e;


# direct methods
.method public constructor <init>(LHf/e0;Lcom/moloco/sdk/internal/services/k;Lcom/moloco/sdk/internal/publisher/u;Ltf/l;)V
    .locals 1

    .line 1
    const-string v0, "initializationState"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "timeProviderService"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/moloco/sdk/internal/publisher/s;->a:LHf/e0;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/moloco/sdk/internal/publisher/s;->b:Lcom/moloco/sdk/internal/services/k;

    .line 17
    .line 18
    iput-object p3, p0, Lcom/moloco/sdk/internal/publisher/s;->c:Lcom/moloco/sdk/internal/publisher/u;

    .line 19
    .line 20
    iput-object p4, p0, Lcom/moloco/sdk/internal/publisher/s;->d:Ltf/l;

    .line 21
    .line 22
    sget-object p1, LEf/S;->a:LLf/e;

    .line 23
    .line 24
    iput-object p1, p0, Lcom/moloco/sdk/internal/publisher/s;->e:LLf/e;

    .line 25
    .line 26
    return-void
.end method

.method public static final a(Lcom/moloco/sdk/internal/publisher/s;Ljava/lang/String;Ljava/lang/String;Lcom/moloco/sdk/acm/l;Lcom/moloco/sdk/internal/publisher/c0;Lcom/moloco/sdk/acm/recorder/c;)Lcom/moloco/sdk/publisher/MolocoAdError$AdCreateError;
    .locals 17

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    move-object/from16 v1, p5

    .line 4
    .line 5
    new-instance v2, Lcom/moloco/sdk/acm/h;

    .line 6
    .line 7
    sget-object v3, Lcom/moloco/sdk/internal/client_metrics_data/a;->b:[Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 8
    .line 9
    const-string v3, "create_ad"

    .line 10
    .line 11
    invoke-direct {v2, v3}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    sget-object v3, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 15
    .line 16
    const-string v3, "result"

    .line 17
    .line 18
    const-string v4, "failure"

    .line 19
    .line 20
    invoke-virtual {v2, v3, v4}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const-string v5, "initial_sdk_init_state"

    .line 24
    .line 25
    move-object/from16 v6, p2

    .line 26
    .line 27
    invoke-virtual {v2, v5, v6}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    const-string v6, "ad_type"

    .line 35
    .line 36
    invoke-virtual {v2, v6, v5}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    move-object/from16 v5, p0

    .line 40
    .line 41
    iget-object v5, v5, Lcom/moloco/sdk/internal/publisher/s;->a:LHf/e0;

    .line 42
    .line 43
    invoke-virtual {v5}, LHf/e0;->getValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    check-cast v5, Lcom/moloco/sdk/publisher/Initialization;

    .line 48
    .line 49
    const/4 v6, -0x1

    .line 50
    if-nez v5, :cond_0

    .line 51
    .line 52
    move v5, v6

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    sget-object v7, Lcom/moloco/sdk/internal/publisher/j;->a:[I

    .line 55
    .line 56
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    aget v5, v7, v5

    .line 61
    .line 62
    :goto_0
    const-string v7, "toUpperCase(...)"

    .line 63
    .line 64
    const-string v8, "CREATE_"

    .line 65
    .line 66
    const-string v9, "reason"

    .line 67
    .line 68
    if-eq v5, v6, :cond_3

    .line 69
    .line 70
    const/4 v6, 0x1

    .line 71
    if-eq v5, v6, :cond_2

    .line 72
    .line 73
    const/4 v6, 0x2

    .line 74
    if-ne v5, v6, :cond_1

    .line 75
    .line 76
    invoke-static {}, Lcom/moloco/sdk/service_locator/b;->b()Lcom/moloco/sdk/internal/error/b;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    new-instance v6, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v8

    .line 89
    sget-object v10, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 90
    .line 91
    invoke-virtual {v8, v10}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v8

    .line 95
    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    const-string v7, "_AD_FAILED_SDK_INIT_FAILED"

    .line 102
    .line 103
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    invoke-static {v5, v6}, Lka/e0;->d(Lcom/moloco/sdk/internal/error/b;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, v3, v4}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    const-string v3, "sdk_init_failed"

    .line 117
    .line 118
    invoke-virtual {v0, v9, v3}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1, v0}, Lcom/moloco/sdk/acm/recorder/c;->b(Lcom/moloco/sdk/acm/l;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2, v9, v3}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1, v2}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 128
    .line 129
    .line 130
    sget-object v10, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 131
    .line 132
    const/16 v15, 0xc

    .line 133
    .line 134
    const/16 v16, 0x0

    .line 135
    .line 136
    const-string v11, "AdCreator"

    .line 137
    .line 138
    const-string v12, "Cannot create AdFactory as SDK init was failure"

    .line 139
    .line 140
    const/4 v13, 0x0

    .line 141
    const/4 v14, 0x0

    .line 142
    invoke-static/range {v10 .. v16}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    sget-object v0, Lcom/moloco/sdk/publisher/MolocoAdError$AdCreateError;->SDK_INIT_FAILED:Lcom/moloco/sdk/publisher/MolocoAdError$AdCreateError;

    .line 146
    .line 147
    return-object v0

    .line 148
    :cond_1
    new-instance v0, LE5/Q;

    .line 149
    .line 150
    const/16 v1, 0x9

    .line 151
    .line 152
    const/4 v2, 0x0

    .line 153
    invoke-direct {v0, v2, v1}, LE5/Q;-><init>(BI)V

    .line 154
    .line 155
    .line 156
    throw v0

    .line 157
    :cond_2
    invoke-static {}, Lcom/moloco/sdk/service_locator/b;->b()Lcom/moloco/sdk/internal/error/b;

    .line 158
    .line 159
    .line 160
    move-result-object v5

    .line 161
    const-string v6, "UNABLE_TO_CREATE_AD"

    .line 162
    .line 163
    invoke-static {v5, v6}, Lka/e0;->d(Lcom/moloco/sdk/internal/error/b;Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0, v3, v4}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    const-string v3, "unable_to_create_ad"

    .line 170
    .line 171
    invoke-virtual {v0, v9, v3}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v1, v0}, Lcom/moloco/sdk/acm/recorder/c;->b(Lcom/moloco/sdk/acm/l;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v2, v9, v3}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v1, v2}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 181
    .line 182
    .line 183
    sget-object v10, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 184
    .line 185
    const-string v0, "Could not find the adUnitId that was requested for load: "

    .line 186
    .line 187
    move-object/from16 v1, p1

    .line 188
    .line 189
    invoke-static {v0, v1}, LR8/v;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v12

    .line 193
    const/16 v15, 0xc

    .line 194
    .line 195
    const/16 v16, 0x0

    .line 196
    .line 197
    const-string v11, "AdCreator"

    .line 198
    .line 199
    const/4 v13, 0x0

    .line 200
    const/4 v14, 0x0

    .line 201
    invoke-static/range {v10 .. v16}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    sget-object v0, Lcom/moloco/sdk/publisher/MolocoAdError$AdCreateError;->UNABLE_TO_CREATE_AD:Lcom/moloco/sdk/publisher/MolocoAdError$AdCreateError;

    .line 205
    .line 206
    return-object v0

    .line 207
    :cond_3
    invoke-static {}, Lcom/moloco/sdk/service_locator/b;->b()Lcom/moloco/sdk/internal/error/b;

    .line 208
    .line 209
    .line 210
    move-result-object v5

    .line 211
    new-instance v6, Ljava/lang/StringBuilder;

    .line 212
    .line 213
    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v8

    .line 220
    sget-object v10, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 221
    .line 222
    invoke-virtual {v8, v10}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v8

    .line 226
    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    const-string v7, "_AD_FAILED_SDK_INIT_NOT_COMPLETED"

    .line 233
    .line 234
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v6

    .line 241
    invoke-static {v5, v6}, Lka/e0;->d(Lcom/moloco/sdk/internal/error/b;Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v0, v3, v4}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    const-string v3, "sdk_init_not_completed"

    .line 248
    .line 249
    invoke-virtual {v0, v9, v3}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v1, v0}, Lcom/moloco/sdk/acm/recorder/c;->b(Lcom/moloco/sdk/acm/l;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v2, v9, v3}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v1, v2}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 259
    .line 260
    .line 261
    sget-object v10, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 262
    .line 263
    const/16 v15, 0xc

    .line 264
    .line 265
    const/16 v16, 0x0

    .line 266
    .line 267
    const-string v11, "AdCreator"

    .line 268
    .line 269
    const-string v12, "Cannot retrieve AdFactory as SDK init was not called or not completed"

    .line 270
    .line 271
    const/4 v13, 0x0

    .line 272
    const/4 v14, 0x0

    .line 273
    invoke-static/range {v10 .. v16}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 274
    .line 275
    .line 276
    sget-object v0, Lcom/moloco/sdk/publisher/MolocoAdError$AdCreateError;->SDK_INIT_WAS_NOT_COMPLETED:Lcom/moloco/sdk/publisher/MolocoAdError$AdCreateError;

    .line 277
    .line 278
    return-object v0
.end method

.method public static final b(Lcom/moloco/sdk/internal/publisher/s;Ltf/l;Lcom/moloco/sdk/internal/publisher/c0;Lcom/moloco/sdk/acm/recorder/c;Llf/c;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p4

    .line 8
    .line 9
    instance-of v4, v3, Lcom/moloco/sdk/internal/publisher/k;

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    move-object v4, v3

    .line 14
    check-cast v4, Lcom/moloco/sdk/internal/publisher/k;

    .line 15
    .line 16
    iget v5, v4, Lcom/moloco/sdk/internal/publisher/k;->f:I

    .line 17
    .line 18
    const/high16 v6, -0x80000000

    .line 19
    .line 20
    and-int v7, v5, v6

    .line 21
    .line 22
    if-eqz v7, :cond_0

    .line 23
    .line 24
    sub-int/2addr v5, v6

    .line 25
    iput v5, v4, Lcom/moloco/sdk/internal/publisher/k;->f:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v4, Lcom/moloco/sdk/internal/publisher/k;

    .line 29
    .line 30
    invoke-direct {v4, v0, v3}, Lcom/moloco/sdk/internal/publisher/k;-><init>(Lcom/moloco/sdk/internal/publisher/s;Llf/c;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object v3, v4, Lcom/moloco/sdk/internal/publisher/k;->d:Ljava/lang/Object;

    .line 34
    .line 35
    sget-object v5, Lkf/a;->a:Lkf/a;

    .line 36
    .line 37
    iget v6, v4, Lcom/moloco/sdk/internal/publisher/k;->f:I

    .line 38
    .line 39
    const/4 v7, 0x1

    .line 40
    if-eqz v6, :cond_2

    .line 41
    .line 42
    if-ne v6, v7, :cond_1

    .line 43
    .line 44
    iget-object v0, v4, Lcom/moloco/sdk/internal/publisher/k;->c:Lcom/moloco/sdk/acm/l;

    .line 45
    .line 46
    iget-object v1, v4, Lcom/moloco/sdk/internal/publisher/k;->b:Lcom/moloco/sdk/acm/recorder/c;

    .line 47
    .line 48
    iget-object v2, v4, Lcom/moloco/sdk/internal/publisher/k;->a:Lcom/moloco/sdk/internal/publisher/c0;

    .line 49
    .line 50
    invoke-static {v3}, LFe/e;->U(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    move-object/from16 v17, v2

    .line 54
    .line 55
    move-object v2, v1

    .line 56
    move-object/from16 v1, v17

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 60
    .line 61
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 62
    .line 63
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw v0

    .line 67
    :cond_2
    invoke-static {v3}, LFe/e;->U(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    sget-object v3, Lcom/moloco/sdk/internal/client_metrics_data/c;->b:[Lcom/moloco/sdk/internal/client_metrics_data/c;

    .line 71
    .line 72
    const-string v3, "create_ad_await_ad_factory_time_ms"

    .line 73
    .line 74
    invoke-virtual {v2, v3}, Lcom/moloco/sdk/acm/recorder/c;->c(Ljava/lang/String;)Lcom/moloco/sdk/acm/l;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    iget-object v0, v0, Lcom/moloco/sdk/internal/publisher/s;->c:Lcom/moloco/sdk/internal/publisher/u;

    .line 79
    .line 80
    iget-object v6, v0, Lcom/moloco/sdk/internal/publisher/u;->a:Ljava/util/Map;

    .line 81
    .line 82
    invoke-interface {v6, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    check-cast v6, LCf/a;

    .line 87
    .line 88
    if-eqz v6, :cond_3

    .line 89
    .line 90
    iget-wide v8, v6, LCf/a;->a:J

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_3
    iget-wide v8, v0, Lcom/moloco/sdk/internal/publisher/u;->b:J

    .line 94
    .line 95
    :goto_1
    sget-object v10, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 96
    .line 97
    new-instance v0, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    const-string v6, "Waiting for AdFactory with timeout: "

    .line 100
    .line 101
    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-static {v8, v9}, LCf/a;->j(J)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v12

    .line 115
    const/16 v15, 0xc

    .line 116
    .line 117
    const/16 v16, 0x0

    .line 118
    .line 119
    const-string v11, "AdCreator"

    .line 120
    .line 121
    const/4 v13, 0x0

    .line 122
    const/4 v14, 0x0

    .line 123
    invoke-static/range {v10 .. v16}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    new-instance v0, Lcom/moloco/sdk/internal/publisher/l;

    .line 127
    .line 128
    const/4 v6, 0x0

    .line 129
    move-object/from16 v10, p1

    .line 130
    .line 131
    invoke-direct {v0, v10, v6}, Lcom/moloco/sdk/internal/publisher/l;-><init>(Ltf/l;Ljf/c;)V

    .line 132
    .line 133
    .line 134
    iput-object v1, v4, Lcom/moloco/sdk/internal/publisher/k;->a:Lcom/moloco/sdk/internal/publisher/c0;

    .line 135
    .line 136
    iput-object v2, v4, Lcom/moloco/sdk/internal/publisher/k;->b:Lcom/moloco/sdk/acm/recorder/c;

    .line 137
    .line 138
    iput-object v3, v4, Lcom/moloco/sdk/internal/publisher/k;->c:Lcom/moloco/sdk/acm/l;

    .line 139
    .line 140
    iput v7, v4, Lcom/moloco/sdk/internal/publisher/k;->f:I

    .line 141
    .line 142
    invoke-static {v8, v9, v0, v4}, LEf/H;->S(JLtf/p;Llf/c;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    if-ne v0, v5, :cond_4

    .line 147
    .line 148
    return-object v5

    .line 149
    :cond_4
    move-object/from16 v17, v3

    .line 150
    .line 151
    move-object v3, v0

    .line 152
    move-object/from16 v0, v17

    .line 153
    .line 154
    :goto_2
    move-object v4, v3

    .line 155
    check-cast v4, Lcom/moloco/sdk/internal/e;

    .line 156
    .line 157
    sget-object v8, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 158
    .line 159
    new-instance v5, Ljava/lang/StringBuilder;

    .line 160
    .line 161
    const-string v6, "AdFactory received: "

    .line 162
    .line 163
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    if-eqz v4, :cond_5

    .line 167
    .line 168
    goto :goto_3

    .line 169
    :cond_5
    const/4 v7, 0x0

    .line 170
    :goto_3
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v10

    .line 177
    const/16 v13, 0xc

    .line 178
    .line 179
    const/4 v14, 0x0

    .line 180
    const-string v9, "AdCreator"

    .line 181
    .line 182
    const/4 v11, 0x0

    .line 183
    const/4 v12, 0x0

    .line 184
    invoke-static/range {v8 .. v14}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    sget-object v5, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 188
    .line 189
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    const-string v5, "ad_type"

    .line 194
    .line 195
    invoke-virtual {v0, v5, v1}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    if-eqz v4, :cond_6

    .line 199
    .line 200
    const-string v1, "success"

    .line 201
    .line 202
    goto :goto_4

    .line 203
    :cond_6
    const-string v1, "failure"

    .line 204
    .line 205
    :goto_4
    const-string v4, "result"

    .line 206
    .line 207
    invoke-virtual {v0, v4, v1}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v2, v0}, Lcom/moloco/sdk/acm/recorder/c;->b(Lcom/moloco/sdk/acm/l;)V

    .line 211
    .line 212
    .line 213
    return-object v3
.end method

.method public static final c(Lcom/moloco/sdk/internal/publisher/s;)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/moloco/sdk/internal/publisher/s;->a:LHf/e0;

    .line 2
    .line 3
    invoke-virtual {p0}, LHf/e0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/moloco/sdk/publisher/Initialization;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    const-string v0, "toLowerCase(...)"

    .line 24
    .line 25
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_0
    const-string p0, "not_invoked_or_in_progress"

    .line 30
    .line 31
    return-object p0
.end method
