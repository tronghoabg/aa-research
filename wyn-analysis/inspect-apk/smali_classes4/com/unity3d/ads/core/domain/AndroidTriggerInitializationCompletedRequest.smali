.class public final Lcom/unity3d/ads/core/domain/AndroidTriggerInitializationCompletedRequest;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/unity3d/ads/core/domain/TriggerInitializationCompletedRequest;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\u000cH\u0096B\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0011R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0012\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/unity3d/ads/core/domain/AndroidTriggerInitializationCompletedRequest;",
        "Lcom/unity3d/ads/core/domain/TriggerInitializationCompletedRequest;",
        "Lcom/unity3d/ads/core/domain/GetInitializationCompletedRequest;",
        "getInitializationCompletedRequest",
        "Lcom/unity3d/ads/core/domain/GetRequestPolicy;",
        "getRequestPolicy",
        "Lcom/unity3d/ads/gatewayclient/GatewayClient;",
        "gatewayClient",
        "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;",
        "sendDiagnosticEvent",
        "<init>",
        "(Lcom/unity3d/ads/core/domain/GetInitializationCompletedRequest;Lcom/unity3d/ads/core/domain/GetRequestPolicy;Lcom/unity3d/ads/gatewayclient/GatewayClient;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V",
        "Lef/C;",
        "invoke",
        "(Ljf/c;)Ljava/lang/Object;",
        "Lcom/unity3d/ads/core/domain/GetInitializationCompletedRequest;",
        "Lcom/unity3d/ads/core/domain/GetRequestPolicy;",
        "Lcom/unity3d/ads/gatewayclient/GatewayClient;",
        "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;",
        "unity-ads_defaultRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final gatewayClient:Lcom/unity3d/ads/gatewayclient/GatewayClient;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final getInitializationCompletedRequest:Lcom/unity3d/ads/core/domain/GetInitializationCompletedRequest;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final getRequestPolicy:Lcom/unity3d/ads/core/domain/GetRequestPolicy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final sendDiagnosticEvent:Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/unity3d/ads/core/domain/GetInitializationCompletedRequest;Lcom/unity3d/ads/core/domain/GetRequestPolicy;Lcom/unity3d/ads/gatewayclient/GatewayClient;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V
    .locals 1
    .param p1    # Lcom/unity3d/ads/core/domain/GetInitializationCompletedRequest;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/unity3d/ads/core/domain/GetRequestPolicy;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/unity3d/ads/gatewayclient/GatewayClient;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "getInitializationCompletedRequest"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "getRequestPolicy"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "gatewayClient"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "sendDiagnosticEvent"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lcom/unity3d/ads/core/domain/AndroidTriggerInitializationCompletedRequest;->getInitializationCompletedRequest:Lcom/unity3d/ads/core/domain/GetInitializationCompletedRequest;

    .line 25
    .line 26
    iput-object p2, p0, Lcom/unity3d/ads/core/domain/AndroidTriggerInitializationCompletedRequest;->getRequestPolicy:Lcom/unity3d/ads/core/domain/GetRequestPolicy;

    .line 27
    .line 28
    iput-object p3, p0, Lcom/unity3d/ads/core/domain/AndroidTriggerInitializationCompletedRequest;->gatewayClient:Lcom/unity3d/ads/gatewayclient/GatewayClient;

    .line 29
    .line 30
    iput-object p4, p0, Lcom/unity3d/ads/core/domain/AndroidTriggerInitializationCompletedRequest;->sendDiagnosticEvent:Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public invoke(Ljf/c;)Ljava/lang/Object;
    .locals 29
    .param p1    # Ljf/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljf/c<",
            "-",
            "Lef/C;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    const/4 v4, 0x1

    .line 7
    const/4 v5, 0x2

    .line 8
    instance-of v6, v0, Lcom/unity3d/ads/core/domain/AndroidTriggerInitializationCompletedRequest$invoke$1;

    .line 9
    .line 10
    if-eqz v6, :cond_0

    .line 11
    .line 12
    move-object v6, v0

    .line 13
    check-cast v6, Lcom/unity3d/ads/core/domain/AndroidTriggerInitializationCompletedRequest$invoke$1;

    .line 14
    .line 15
    iget v7, v6, Lcom/unity3d/ads/core/domain/AndroidTriggerInitializationCompletedRequest$invoke$1;->label:I

    .line 16
    .line 17
    const/high16 v8, -0x80000000

    .line 18
    .line 19
    and-int v9, v7, v8

    .line 20
    .line 21
    if-eqz v9, :cond_0

    .line 22
    .line 23
    sub-int/2addr v7, v8

    .line 24
    iput v7, v6, Lcom/unity3d/ads/core/domain/AndroidTriggerInitializationCompletedRequest$invoke$1;->label:I

    .line 25
    .line 26
    :goto_0
    move-object v12, v6

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    new-instance v6, Lcom/unity3d/ads/core/domain/AndroidTriggerInitializationCompletedRequest$invoke$1;

    .line 29
    .line 30
    invoke-direct {v6, v1, v0}, Lcom/unity3d/ads/core/domain/AndroidTriggerInitializationCompletedRequest$invoke$1;-><init>(Lcom/unity3d/ads/core/domain/AndroidTriggerInitializationCompletedRequest;Ljf/c;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :goto_1
    iget-object v0, v12, Lcom/unity3d/ads/core/domain/AndroidTriggerInitializationCompletedRequest$invoke$1;->result:Ljava/lang/Object;

    .line 35
    .line 36
    sget-object v6, Lkf/a;->a:Lkf/a;

    .line 37
    .line 38
    iget v7, v12, Lcom/unity3d/ads/core/domain/AndroidTriggerInitializationCompletedRequest$invoke$1;->label:I

    .line 39
    .line 40
    sget-object v15, Lef/C;->a:Lef/C;

    .line 41
    .line 42
    const-string v8, "reason_debug"

    .line 43
    .line 44
    const-string v9, "reason"

    .line 45
    .line 46
    const-string v10, "operation"

    .line 47
    .line 48
    if-eqz v7, :cond_3

    .line 49
    .line 50
    if-eq v7, v4, :cond_2

    .line 51
    .line 52
    if-ne v7, v5, :cond_1

    .line 53
    .line 54
    iget-wide v6, v12, Lcom/unity3d/ads/core/domain/AndroidTriggerInitializationCompletedRequest$invoke$1;->J$0:J

    .line 55
    .line 56
    iget-object v11, v12, Lcom/unity3d/ads/core/domain/AndroidTriggerInitializationCompletedRequest$invoke$1;->L$0:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v11, Lcom/unity3d/ads/core/domain/AndroidTriggerInitializationCompletedRequest;

    .line 59
    .line 60
    :try_start_0
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    .line 62
    .line 63
    move/from16 v18, v4

    .line 64
    .line 65
    move/from16 v17, v5

    .line 66
    .line 67
    move-object v3, v8

    .line 68
    move-object v5, v9

    .line 69
    move-object v4, v10

    .line 70
    const/16 v16, 0x0

    .line 71
    .line 72
    goto/16 :goto_5

    .line 73
    .line 74
    :catch_0
    move-exception v0

    .line 75
    move/from16 v18, v4

    .line 76
    .line 77
    move/from16 v17, v5

    .line 78
    .line 79
    move-object v3, v8

    .line 80
    move-object v5, v9

    .line 81
    move-object v4, v10

    .line 82
    :goto_2
    const/16 v16, 0x0

    .line 83
    .line 84
    goto/16 :goto_7

    .line 85
    .line 86
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 87
    .line 88
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 89
    .line 90
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw v0

    .line 94
    :cond_2
    iget-wide v13, v12, Lcom/unity3d/ads/core/domain/AndroidTriggerInitializationCompletedRequest$invoke$1;->J$0:J

    .line 95
    .line 96
    iget-object v7, v12, Lcom/unity3d/ads/core/domain/AndroidTriggerInitializationCompletedRequest$invoke$1;->L$0:Ljava/lang/Object;

    .line 97
    .line 98
    move-object v11, v7

    .line 99
    check-cast v11, Lcom/unity3d/ads/core/domain/AndroidTriggerInitializationCompletedRequest;

    .line 100
    .line 101
    :try_start_1
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 102
    .line 103
    .line 104
    move-object v7, v11

    .line 105
    goto :goto_3

    .line 106
    :catch_1
    move-exception v0

    .line 107
    move/from16 v18, v4

    .line 108
    .line 109
    move/from16 v17, v5

    .line 110
    .line 111
    move-object v3, v8

    .line 112
    move-object v5, v9

    .line 113
    move-object v4, v10

    .line 114
    move-wide v6, v13

    .line 115
    goto :goto_2

    .line 116
    :cond_3
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    invoke-static {}, LCf/e;->b()J

    .line 120
    .line 121
    .line 122
    move-result-wide v13

    .line 123
    iget-object v0, v1, Lcom/unity3d/ads/core/domain/AndroidTriggerInitializationCompletedRequest;->sendDiagnosticEvent:Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;

    .line 124
    .line 125
    sget-object v17, Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventType;->DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_COMPLETED_EVENT_REQUEST_STARTED:Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventType;

    .line 126
    .line 127
    const/16 v21, 0x0

    .line 128
    .line 129
    const/16 v22, 0x0

    .line 130
    .line 131
    const/16 v18, 0x0

    .line 132
    .line 133
    const/16 v19, 0x0

    .line 134
    .line 135
    const/16 v20, 0x0

    .line 136
    .line 137
    const/16 v23, 0x3e

    .line 138
    .line 139
    const/16 v24, 0x0

    .line 140
    .line 141
    move-object/from16 v16, v0

    .line 142
    .line 143
    invoke-static/range {v16 .. v24}, Lcom/unity3d/ads/core/domain/SendDiagnosticEvent$DefaultImpls;->invoke$default(Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventType;Ljava/lang/Double;Ljava/util/Map;Ljava/util/Map;Lcom/unity3d/ads/core/data/model/AdObject;Ljava/lang/Integer;ILjava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    :try_start_2
    iget-object v0, v1, Lcom/unity3d/ads/core/domain/AndroidTriggerInitializationCompletedRequest;->getInitializationCompletedRequest:Lcom/unity3d/ads/core/domain/GetInitializationCompletedRequest;

    .line 147
    .line 148
    iput-object v1, v12, Lcom/unity3d/ads/core/domain/AndroidTriggerInitializationCompletedRequest$invoke$1;->L$0:Ljava/lang/Object;

    .line 149
    .line 150
    iput-wide v13, v12, Lcom/unity3d/ads/core/domain/AndroidTriggerInitializationCompletedRequest$invoke$1;->J$0:J

    .line 151
    .line 152
    iput v4, v12, Lcom/unity3d/ads/core/domain/AndroidTriggerInitializationCompletedRequest$invoke$1;->label:I

    .line 153
    .line 154
    invoke-interface {v0, v12}, Lcom/unity3d/ads/core/domain/GetInitializationCompletedRequest;->invoke(Ljf/c;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_7

    .line 158
    if-ne v0, v6, :cond_4

    .line 159
    .line 160
    goto :goto_4

    .line 161
    :cond_4
    move-object v7, v1

    .line 162
    :goto_3
    :try_start_3
    check-cast v0, Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;

    .line 163
    .line 164
    iget-object v11, v7, Lcom/unity3d/ads/core/domain/AndroidTriggerInitializationCompletedRequest;->getRequestPolicy:Lcom/unity3d/ads/core/domain/GetRequestPolicy;

    .line 165
    .line 166
    invoke-interface {v11}, Lcom/unity3d/ads/core/domain/GetRequestPolicy;->invoke()Lcom/unity3d/ads/gatewayclient/RequestPolicy;

    .line 167
    .line 168
    .line 169
    move-result-object v11
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_6

    .line 170
    const/16 v16, 0x0

    .line 171
    .line 172
    :try_start_4
    iget-object v3, v7, Lcom/unity3d/ads/core/domain/AndroidTriggerInitializationCompletedRequest;->gatewayClient:Lcom/unity3d/ads/gatewayclient/GatewayClient;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_5

    .line 173
    .line 174
    move-object/from16 v17, v10

    .line 175
    .line 176
    move-object v10, v11

    .line 177
    :try_start_5
    sget-object v11, Lcom/unity3d/ads/core/data/model/OperationType;->INITIALIZATION_COMPLETED:Lcom/unity3d/ads/core/data/model/OperationType;

    .line 178
    .line 179
    iput-object v7, v12, Lcom/unity3d/ads/core/domain/AndroidTriggerInitializationCompletedRequest$invoke$1;->L$0:Ljava/lang/Object;

    .line 180
    .line 181
    iput-wide v13, v12, Lcom/unity3d/ads/core/domain/AndroidTriggerInitializationCompletedRequest$invoke$1;->J$0:J

    .line 182
    .line 183
    iput v5, v12, Lcom/unity3d/ads/core/domain/AndroidTriggerInitializationCompletedRequest$invoke$1;->label:I
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4

    .line 184
    .line 185
    move-wide/from16 v18, v13

    .line 186
    .line 187
    const/4 v13, 0x1

    .line 188
    const/4 v14, 0x0

    .line 189
    move-object/from16 v20, v8

    .line 190
    .line 191
    const/4 v8, 0x0

    .line 192
    move-object/from16 v28, v7

    .line 193
    .line 194
    move-object v7, v3

    .line 195
    move-object/from16 v3, v20

    .line 196
    .line 197
    move-wide/from16 v20, v18

    .line 198
    .line 199
    move-object/from16 v19, v28

    .line 200
    .line 201
    move/from16 v18, v4

    .line 202
    .line 203
    move-object/from16 v4, v17

    .line 204
    .line 205
    move/from16 v17, v5

    .line 206
    .line 207
    move-object v5, v9

    .line 208
    move-object v9, v0

    .line 209
    :try_start_6
    invoke-static/range {v7 .. v14}, Lcom/unity3d/ads/gatewayclient/GatewayClient$DefaultImpls;->request$default(Lcom/unity3d/ads/gatewayclient/GatewayClient;Ljava/lang/String;Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;Lcom/unity3d/ads/gatewayclient/RequestPolicy;Lcom/unity3d/ads/core/data/model/OperationType;Ljf/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3

    .line 213
    if-ne v0, v6, :cond_5

    .line 214
    .line 215
    :goto_4
    return-object v6

    .line 216
    :cond_5
    move-object/from16 v11, v19

    .line 217
    .line 218
    move-wide/from16 v6, v20

    .line 219
    .line 220
    :goto_5
    :try_start_7
    check-cast v0, Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;

    .line 221
    .line 222
    invoke-virtual {v0}, Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;->hasError()Z

    .line 223
    .line 224
    .line 225
    move-result v8

    .line 226
    if-eqz v8, :cond_6

    .line 227
    .line 228
    iget-object v8, v11, Lcom/unity3d/ads/core/domain/AndroidTriggerInitializationCompletedRequest;->sendDiagnosticEvent:Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;

    .line 229
    .line 230
    sget-object v20, Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventType;->DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_COMPLETED_EVENT_REQUEST_FAILURE_TIME:Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventType;

    .line 231
    .line 232
    new-instance v9, LCf/g;

    .line 233
    .line 234
    invoke-direct {v9, v6, v7}, LCf/g;-><init>(J)V

    .line 235
    .line 236
    .line 237
    invoke-static {v9}, Lcom/unity3d/ads/core/extensions/TimeExtensionsKt;->elapsedMillis(LCf/f;)D

    .line 238
    .line 239
    .line 240
    move-result-wide v9

    .line 241
    new-instance v12, Ljava/lang/Double;

    .line 242
    .line 243
    invoke-direct {v12, v9, v10}, Ljava/lang/Double;-><init>(D)V

    .line 244
    .line 245
    .line 246
    sget-object v9, Lcom/unity3d/ads/core/data/model/OperationType;->INITIALIZATION_COMPLETED:Lcom/unity3d/ads/core/data/model/OperationType;

    .line 247
    .line 248
    invoke-virtual {v9}, Lcom/unity3d/ads/core/data/model/OperationType;->toString()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v9

    .line 252
    new-instance v10, Lef/k;

    .line 253
    .line 254
    invoke-direct {v10, v4, v9}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 255
    .line 256
    .line 257
    const-string v9, "gateway"

    .line 258
    .line 259
    new-instance v13, Lef/k;

    .line 260
    .line 261
    invoke-direct {v13, v5, v9}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v0}, Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;->getError()Lgatewayprotocol/v1/ErrorOuterClass$Error;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    invoke-virtual {v0}, Lgatewayprotocol/v1/ErrorOuterClass$Error;->getErrorText()Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    new-instance v9, Lef/k;

    .line 273
    .line 274
    invoke-direct {v9, v3, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    new-array v0, v2, [Lef/k;

    .line 278
    .line 279
    aput-object v10, v0, v16

    .line 280
    .line 281
    aput-object v13, v0, v18

    .line 282
    .line 283
    aput-object v9, v0, v17

    .line 284
    .line 285
    invoke-static {v0}, Lff/A;->R([Lef/k;)Ljava/util/Map;

    .line 286
    .line 287
    .line 288
    move-result-object v22

    .line 289
    const/16 v24, 0x0

    .line 290
    .line 291
    const/16 v25, 0x0

    .line 292
    .line 293
    const/16 v26, 0x38

    .line 294
    .line 295
    const/16 v27, 0x0

    .line 296
    .line 297
    const/16 v23, 0x0

    .line 298
    .line 299
    move-object/from16 v19, v8

    .line 300
    .line 301
    move-object/from16 v21, v12

    .line 302
    .line 303
    invoke-static/range {v19 .. v27}, Lcom/unity3d/ads/core/domain/SendDiagnosticEvent$DefaultImpls;->invoke$default(Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventType;Ljava/lang/Double;Ljava/util/Map;Ljava/util/Map;Lcom/unity3d/ads/core/data/model/AdObject;Ljava/lang/Integer;ILjava/lang/Object;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_2

    .line 304
    .line 305
    .line 306
    return-object v15

    .line 307
    :catch_2
    move-exception v0

    .line 308
    goto/16 :goto_7

    .line 309
    .line 310
    :cond_6
    iget-object v0, v11, Lcom/unity3d/ads/core/domain/AndroidTriggerInitializationCompletedRequest;->sendDiagnosticEvent:Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;

    .line 311
    .line 312
    sget-object v20, Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventType;->DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_COMPLETED_EVENT_REQUEST_SUCCESS_TIME:Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventType;

    .line 313
    .line 314
    new-instance v2, LCf/g;

    .line 315
    .line 316
    invoke-direct {v2, v6, v7}, LCf/g;-><init>(J)V

    .line 317
    .line 318
    .line 319
    invoke-static {v2}, Lcom/unity3d/ads/core/extensions/TimeExtensionsKt;->elapsedMillis(LCf/f;)D

    .line 320
    .line 321
    .line 322
    move-result-wide v2

    .line 323
    new-instance v4, Ljava/lang/Double;

    .line 324
    .line 325
    invoke-direct {v4, v2, v3}, Ljava/lang/Double;-><init>(D)V

    .line 326
    .line 327
    .line 328
    const/16 v24, 0x0

    .line 329
    .line 330
    const/16 v25, 0x0

    .line 331
    .line 332
    const/16 v22, 0x0

    .line 333
    .line 334
    const/16 v23, 0x0

    .line 335
    .line 336
    const/16 v26, 0x3c

    .line 337
    .line 338
    const/16 v27, 0x0

    .line 339
    .line 340
    move-object/from16 v19, v0

    .line 341
    .line 342
    move-object/from16 v21, v4

    .line 343
    .line 344
    invoke-static/range {v19 .. v27}, Lcom/unity3d/ads/core/domain/SendDiagnosticEvent$DefaultImpls;->invoke$default(Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventType;Ljava/lang/Double;Ljava/util/Map;Ljava/util/Map;Lcom/unity3d/ads/core/data/model/AdObject;Ljava/lang/Integer;ILjava/lang/Object;)V

    .line 345
    .line 346
    .line 347
    return-object v15

    .line 348
    :catch_3
    move-exception v0

    .line 349
    :goto_6
    move-object/from16 v11, v19

    .line 350
    .line 351
    move-wide/from16 v6, v20

    .line 352
    .line 353
    goto :goto_7

    .line 354
    :catch_4
    move-exception v0

    .line 355
    move/from16 v18, v4

    .line 356
    .line 357
    move-object/from16 v19, v7

    .line 358
    .line 359
    move-object v3, v8

    .line 360
    move-wide/from16 v20, v13

    .line 361
    .line 362
    move-object/from16 v4, v17

    .line 363
    .line 364
    move/from16 v17, v5

    .line 365
    .line 366
    move-object v5, v9

    .line 367
    goto :goto_6

    .line 368
    :catch_5
    move-exception v0

    .line 369
    move/from16 v18, v4

    .line 370
    .line 371
    move/from16 v17, v5

    .line 372
    .line 373
    move-object/from16 v19, v7

    .line 374
    .line 375
    move-object v3, v8

    .line 376
    move-object v5, v9

    .line 377
    move-object v4, v10

    .line 378
    move-wide/from16 v20, v13

    .line 379
    .line 380
    goto :goto_6

    .line 381
    :catch_6
    move-exception v0

    .line 382
    move/from16 v18, v4

    .line 383
    .line 384
    move/from16 v17, v5

    .line 385
    .line 386
    move-object/from16 v19, v7

    .line 387
    .line 388
    move-object v3, v8

    .line 389
    move-object v5, v9

    .line 390
    move-object v4, v10

    .line 391
    move-wide/from16 v20, v13

    .line 392
    .line 393
    const/16 v16, 0x0

    .line 394
    .line 395
    goto :goto_6

    .line 396
    :catch_7
    move-exception v0

    .line 397
    move/from16 v18, v4

    .line 398
    .line 399
    move/from16 v17, v5

    .line 400
    .line 401
    move-object v3, v8

    .line 402
    move-object v5, v9

    .line 403
    move-object v4, v10

    .line 404
    const/16 v16, 0x0

    .line 405
    .line 406
    move-object v11, v1

    .line 407
    move-wide v6, v13

    .line 408
    :goto_7
    iget-object v8, v11, Lcom/unity3d/ads/core/domain/AndroidTriggerInitializationCompletedRequest;->sendDiagnosticEvent:Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;

    .line 409
    .line 410
    sget-object v20, Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventType;->DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_COMPLETED_EVENT_REQUEST_FAILURE_TIME:Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventType;

    .line 411
    .line 412
    new-instance v9, LCf/g;

    .line 413
    .line 414
    invoke-direct {v9, v6, v7}, LCf/g;-><init>(J)V

    .line 415
    .line 416
    .line 417
    invoke-static {v9}, Lcom/unity3d/ads/core/extensions/TimeExtensionsKt;->elapsedMillis(LCf/f;)D

    .line 418
    .line 419
    .line 420
    move-result-wide v6

    .line 421
    new-instance v9, Ljava/lang/Double;

    .line 422
    .line 423
    invoke-direct {v9, v6, v7}, Ljava/lang/Double;-><init>(D)V

    .line 424
    .line 425
    .line 426
    sget-object v6, Lcom/unity3d/ads/core/data/model/OperationType;->INITIALIZATION_COMPLETED:Lcom/unity3d/ads/core/data/model/OperationType;

    .line 427
    .line 428
    invoke-virtual {v6}, Lcom/unity3d/ads/core/data/model/OperationType;->toString()Ljava/lang/String;

    .line 429
    .line 430
    .line 431
    move-result-object v6

    .line 432
    new-instance v7, Lef/k;

    .line 433
    .line 434
    invoke-direct {v7, v4, v6}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 435
    .line 436
    .line 437
    new-instance v4, Lef/k;

    .line 438
    .line 439
    const-string v6, "uncaught_exception"

    .line 440
    .line 441
    invoke-direct {v4, v5, v6}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 442
    .line 443
    .line 444
    const/4 v5, 0x0

    .line 445
    move/from16 v10, v16

    .line 446
    .line 447
    move/from16 v6, v18

    .line 448
    .line 449
    invoke-static {v0, v10, v6, v5}, Lcom/unity3d/ads/core/extensions/ExceptionExtensionsKt;->getShortenedStackTrace$default(Ljava/lang/Throwable;IILjava/lang/Object;)Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object v0

    .line 453
    new-instance v5, Lef/k;

    .line 454
    .line 455
    invoke-direct {v5, v3, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 456
    .line 457
    .line 458
    new-array v0, v2, [Lef/k;

    .line 459
    .line 460
    aput-object v7, v0, v10

    .line 461
    .line 462
    aput-object v4, v0, v6

    .line 463
    .line 464
    aput-object v5, v0, v17

    .line 465
    .line 466
    invoke-static {v0}, Lff/A;->R([Lef/k;)Ljava/util/Map;

    .line 467
    .line 468
    .line 469
    move-result-object v22

    .line 470
    const/16 v24, 0x0

    .line 471
    .line 472
    const/16 v25, 0x0

    .line 473
    .line 474
    const/16 v23, 0x0

    .line 475
    .line 476
    const/16 v26, 0x38

    .line 477
    .line 478
    const/16 v27, 0x0

    .line 479
    .line 480
    move-object/from16 v19, v8

    .line 481
    .line 482
    move-object/from16 v21, v9

    .line 483
    .line 484
    invoke-static/range {v19 .. v27}, Lcom/unity3d/ads/core/domain/SendDiagnosticEvent$DefaultImpls;->invoke$default(Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventType;Ljava/lang/Double;Ljava/util/Map;Ljava/util/Map;Lcom/unity3d/ads/core/data/model/AdObject;Ljava/lang/Integer;ILjava/lang/Object;)V

    .line 485
    .line 486
    .line 487
    return-object v15
.end method
