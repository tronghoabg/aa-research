.class final Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/unity3d/ads/core/domain/AndroidLoad;->invoke(Landroid/content/Context;Ljava/lang/String;Lcom/google/protobuf/ByteString;Lgatewayprotocol/v1/HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup;Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;Lcom/unity3d/ads/UnityAdsLoadOptions;Ljf/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Llf/j;",
        "Ltf/p;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "LEf/E;",
        "Lcom/unity3d/ads/core/data/model/LoadResult;",
        "<anonymous>",
        "(LEf/E;)Lcom/unity3d/ads/core/data/model/LoadResult;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation runtime Llf/e;
    c = "com.unity3d.ads.core.domain.AndroidLoad$invoke$2"
    f = "AndroidLoad.kt"
    l = {
        0x60,
        0x64,
        0x75,
        0x79,
        0xa1
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $bannerSize:Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;

.field final synthetic $context:Landroid/content/Context;

.field final synthetic $headerBiddingAdMarkup:Lgatewayprotocol/v1/HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup;

.field final synthetic $loadOptions:Lcom/unity3d/ads/UnityAdsLoadOptions;

.field final synthetic $opportunityId:Lcom/google/protobuf/ByteString;

.field final synthetic $placement:Ljava/lang/String;

.field I$0:I

.field I$1:I

.field J$0:J

.field J$1:J

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field L$6:Ljava/lang/Object;

.field L$7:Ljava/lang/Object;

.field L$8:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/unity3d/ads/core/domain/AndroidLoad;


# direct methods
.method public constructor <init>(Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;Lcom/unity3d/ads/core/domain/AndroidLoad;Lgatewayprotocol/v1/HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup;Lcom/google/protobuf/ByteString;Ljava/lang/String;Lcom/unity3d/ads/UnityAdsLoadOptions;Landroid/content/Context;Ljf/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;",
            "Lcom/unity3d/ads/core/domain/AndroidLoad;",
            "Lgatewayprotocol/v1/HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup;",
            "Lcom/google/protobuf/ByteString;",
            "Ljava/lang/String;",
            "Lcom/unity3d/ads/UnityAdsLoadOptions;",
            "Landroid/content/Context;",
            "Ljf/c<",
            "-",
            "Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->$bannerSize:Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->this$0:Lcom/unity3d/ads/core/domain/AndroidLoad;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->$headerBiddingAdMarkup:Lgatewayprotocol/v1/HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->$opportunityId:Lcom/google/protobuf/ByteString;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->$placement:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p6, p0, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->$loadOptions:Lcom/unity3d/ads/UnityAdsLoadOptions;

    .line 12
    .line 13
    iput-object p7, p0, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->$context:Landroid/content/Context;

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-direct {p0, p1, p8}, Llf/j;-><init>(ILjf/c;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 9
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljf/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljf/c<",
            "*>;)",
            "Ljf/c<",
            "Lef/C;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-instance v0, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->$bannerSize:Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->this$0:Lcom/unity3d/ads/core/domain/AndroidLoad;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->$headerBiddingAdMarkup:Lgatewayprotocol/v1/HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->$opportunityId:Lcom/google/protobuf/ByteString;

    .line 10
    .line 11
    iget-object v5, p0, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->$placement:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v6, p0, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->$loadOptions:Lcom/unity3d/ads/UnityAdsLoadOptions;

    .line 14
    .line 15
    iget-object v7, p0, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->$context:Landroid/content/Context;

    .line 16
    .line 17
    move-object v8, p2

    .line 18
    invoke-direct/range {v0 .. v8}, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;-><init>(Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;Lcom/unity3d/ads/core/domain/AndroidLoad;Lgatewayprotocol/v1/HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup;Lcom/google/protobuf/ByteString;Ljava/lang/String;Lcom/unity3d/ads/UnityAdsLoadOptions;Landroid/content/Context;Ljf/c;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, v0, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$0:Ljava/lang/Object;

    .line 22
    .line 23
    return-object v0
.end method

.method public final invoke(LEf/E;Ljf/c;)Ljava/lang/Object;
    .locals 0
    .param p1    # LEf/E;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljf/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEf/E;",
            "Ljf/c<",
            "-",
            "Lcom/unity3d/ads/core/data/model/LoadResult;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    move-result-object p1

    check-cast p1, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;

    sget-object p2, Lef/C;->a:Lef/C;

    invoke-virtual {p1, p2}, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LEf/E;

    check-cast p2, Ljf/c;

    invoke-virtual {p0, p1, p2}, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->invoke(LEf/E;Ljf/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 39
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    const-string v8, "response.adData"

    .line 4
    .line 5
    sget-object v10, Lkf/a;->a:Lkf/a;

    .line 6
    .line 7
    iget v0, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->label:I

    .line 8
    .line 9
    const/4 v9, 0x1

    .line 10
    const-string v11, "native_load_config_failure_time"

    .line 11
    .line 12
    const-string v12, "native_load_config_success_time"

    .line 13
    .line 14
    const/4 v13, 0x5

    .line 15
    const/4 v7, 0x4

    .line 16
    const/4 v1, 0x3

    .line 17
    const/4 v6, 0x2

    .line 18
    if-eqz v0, :cond_5

    .line 19
    .line 20
    if-eq v0, v9, :cond_4

    .line 21
    .line 22
    if-eq v0, v6, :cond_3

    .line 23
    .line 24
    if-eq v0, v1, :cond_2

    .line 25
    .line 26
    if-eq v0, v7, :cond_1

    .line 27
    .line 28
    if-ne v0, v13, :cond_0

    .line 29
    .line 30
    iget-wide v1, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->J$0:J

    .line 31
    .line 32
    iget v3, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->I$0:I

    .line 33
    .line 34
    iget-object v0, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$1:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 37
    .line 38
    iget-object v4, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$0:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v4, Lcom/unity3d/ads/core/domain/AndroidLoad;

    .line 41
    .line 42
    :try_start_0
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/unity3d/ads/core/data/model/exception/UnityAdsNetworkException; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    .line 44
    .line 45
    move-wide v11, v1

    .line 46
    move-object v2, v0

    .line 47
    move-object/from16 v0, p1

    .line 48
    .line 49
    goto/16 :goto_25

    .line 50
    .line 51
    :catch_0
    move-exception v0

    .line 52
    goto/16 :goto_2b

    .line 53
    .line 54
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 57
    .line 58
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw v0

    .line 62
    :cond_1
    iget-wide v1, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->J$1:J

    .line 63
    .line 64
    iget v3, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->I$1:I

    .line 65
    .line 66
    iget-wide v6, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->J$0:J

    .line 67
    .line 68
    iget v4, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->I$0:I

    .line 69
    .line 70
    iget-object v0, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$7:Ljava/lang/Object;

    .line 71
    .line 72
    move-object/from16 v16, v0

    .line 73
    .line 74
    check-cast v16, Lcom/unity3d/ads/core/data/model/AdObject;

    .line 75
    .line 76
    iget-object v0, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$6:Ljava/lang/Object;

    .line 77
    .line 78
    move-object/from16 v17, v0

    .line 79
    .line 80
    check-cast v17, Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;

    .line 81
    .line 82
    iget-object v0, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$5:Ljava/lang/Object;

    .line 83
    .line 84
    move-object/from16 v18, v0

    .line 85
    .line 86
    check-cast v18, Landroid/content/Context;

    .line 87
    .line 88
    iget-object v0, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$4:Ljava/lang/Object;

    .line 89
    .line 90
    move-object/from16 v19, v0

    .line 91
    .line 92
    check-cast v19, Lcom/unity3d/ads/UnityAdsLoadOptions;

    .line 93
    .line 94
    iget-object v0, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$3:Ljava/lang/Object;

    .line 95
    .line 96
    move-object/from16 v20, v0

    .line 97
    .line 98
    check-cast v20, Ljava/lang/String;

    .line 99
    .line 100
    iget-object v0, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$2:Ljava/lang/Object;

    .line 101
    .line 102
    move-object/from16 v21, v0

    .line 103
    .line 104
    check-cast v21, Lcom/google/protobuf/ByteString;

    .line 105
    .line 106
    iget-object v0, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$1:Ljava/lang/Object;

    .line 107
    .line 108
    move-object/from16 v22, v0

    .line 109
    .line 110
    check-cast v22, Lgatewayprotocol/v1/HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup;

    .line 111
    .line 112
    iget-object v0, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$0:Ljava/lang/Object;

    .line 113
    .line 114
    move-object/from16 v23, v0

    .line 115
    .line 116
    check-cast v23, Lcom/unity3d/ads/core/domain/AndroidLoad;

    .line 117
    .line 118
    :try_start_1
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 119
    .line 120
    .line 121
    move-object/from16 v0, p1

    .line 122
    .line 123
    move-object/from16 v24, v8

    .line 124
    .line 125
    move-object/from16 v15, v16

    .line 126
    .line 127
    move-object/from16 v8, v21

    .line 128
    .line 129
    move-object/from16 v9, v22

    .line 130
    .line 131
    move-object/from16 v22, v11

    .line 132
    .line 133
    move-object/from16 v21, v19

    .line 134
    .line 135
    move-object/from16 v11, v23

    .line 136
    .line 137
    move-object/from16 v23, v12

    .line 138
    .line 139
    move-object/from16 v12, v17

    .line 140
    .line 141
    goto/16 :goto_17

    .line 142
    .line 143
    :catchall_0
    move-exception v0

    .line 144
    move v9, v3

    .line 145
    move v3, v4

    .line 146
    move-wide v13, v6

    .line 147
    move-object/from16 v24, v8

    .line 148
    .line 149
    move-object/from16 v15, v16

    .line 150
    .line 151
    move-object/from16 v8, v21

    .line 152
    .line 153
    move-object/from16 v6, v22

    .line 154
    .line 155
    move-object/from16 v4, v23

    .line 156
    .line 157
    move-object/from16 v22, v11

    .line 158
    .line 159
    move-object/from16 v23, v12

    .line 160
    .line 161
    move-object/from16 v12, v17

    .line 162
    .line 163
    move-object/from16 v21, v19

    .line 164
    .line 165
    goto/16 :goto_1c

    .line 166
    .line 167
    :cond_2
    iget v0, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->I$1:I

    .line 168
    .line 169
    iget-wide v1, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->J$0:J

    .line 170
    .line 171
    iget v3, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->I$0:I

    .line 172
    .line 173
    iget-object v4, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$8:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast v4, Lcom/unity3d/ads/core/data/model/AdObject;

    .line 176
    .line 177
    iget-object v6, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$7:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v6, Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;

    .line 180
    .line 181
    iget-object v14, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$6:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast v14, LEf/E;

    .line 184
    .line 185
    iget-object v14, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$5:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast v14, Landroid/content/Context;

    .line 188
    .line 189
    iget-object v13, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$4:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast v13, Lcom/unity3d/ads/UnityAdsLoadOptions;

    .line 192
    .line 193
    iget-object v7, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$3:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast v7, Ljava/lang/String;

    .line 196
    .line 197
    iget-object v15, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$2:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast v15, Lcom/google/protobuf/ByteString;

    .line 200
    .line 201
    iget-object v9, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$1:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v9, Lgatewayprotocol/v1/HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup;

    .line 204
    .line 205
    move/from16 v21, v0

    .line 206
    .line 207
    iget-object v0, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$0:Ljava/lang/Object;

    .line 208
    .line 209
    move-object/from16 v22, v0

    .line 210
    .line 211
    check-cast v22, Lcom/unity3d/ads/core/domain/AndroidLoad;

    .line 212
    .line 213
    :try_start_2
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_2
    .catch Lcom/unity3d/ads/core/data/model/exception/UnityAdsNetworkException; {:try_start_2 .. :try_end_2} :catch_1

    .line 214
    .line 215
    .line 216
    move-object v0, v15

    .line 217
    move-object v15, v4

    .line 218
    move-object v4, v0

    .line 219
    move-object/from16 v0, v22

    .line 220
    .line 221
    move-object/from16 v22, v11

    .line 222
    .line 223
    move-object v11, v0

    .line 224
    move-object/from16 v0, p1

    .line 225
    .line 226
    move-object/from16 v24, v8

    .line 227
    .line 228
    move-object/from16 v23, v12

    .line 229
    .line 230
    move v8, v3

    .line 231
    move-object v12, v6

    .line 232
    move-object v3, v7

    .line 233
    move-object v6, v9

    .line 234
    move/from16 v9, v21

    .line 235
    .line 236
    move-wide/from16 v37, v1

    .line 237
    .line 238
    move-object v2, v13

    .line 239
    move-object v1, v14

    .line 240
    move-wide/from16 v13, v37

    .line 241
    .line 242
    goto/16 :goto_16

    .line 243
    .line 244
    :catch_1
    move-exception v0

    .line 245
    move-object/from16 v4, v22

    .line 246
    .line 247
    goto/16 :goto_2b

    .line 248
    .line 249
    :cond_3
    iget-wide v1, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->J$1:J

    .line 250
    .line 251
    iget v3, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->I$1:I

    .line 252
    .line 253
    iget-wide v6, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->J$0:J

    .line 254
    .line 255
    iget v4, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->I$0:I

    .line 256
    .line 257
    iget-object v0, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$6:Ljava/lang/Object;

    .line 258
    .line 259
    move-object v8, v0

    .line 260
    check-cast v8, Lcom/unity3d/ads/core/data/model/AdObject;

    .line 261
    .line 262
    iget-object v0, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$5:Ljava/lang/Object;

    .line 263
    .line 264
    move-object v9, v0

    .line 265
    check-cast v9, Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;

    .line 266
    .line 267
    iget-object v0, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$4:Ljava/lang/Object;

    .line 268
    .line 269
    move-object v13, v0

    .line 270
    check-cast v13, Landroid/content/Context;

    .line 271
    .line 272
    iget-object v0, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$3:Ljava/lang/Object;

    .line 273
    .line 274
    move-object v14, v0

    .line 275
    check-cast v14, Lcom/unity3d/ads/UnityAdsLoadOptions;

    .line 276
    .line 277
    iget-object v0, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$2:Ljava/lang/Object;

    .line 278
    .line 279
    move-object v15, v0

    .line 280
    check-cast v15, Ljava/lang/String;

    .line 281
    .line 282
    iget-object v0, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$1:Ljava/lang/Object;

    .line 283
    .line 284
    move-object/from16 v18, v0

    .line 285
    .line 286
    check-cast v18, Lcom/google/protobuf/ByteString;

    .line 287
    .line 288
    iget-object v0, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$0:Ljava/lang/Object;

    .line 289
    .line 290
    move-object/from16 v21, v0

    .line 291
    .line 292
    check-cast v21, Lcom/unity3d/ads/core/domain/AndroidLoad;

    .line 293
    .line 294
    :try_start_3
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 295
    .line 296
    .line 297
    move-object/from16 v0, p1

    .line 298
    .line 299
    move-object/from16 v22, v11

    .line 300
    .line 301
    move-object/from16 v23, v12

    .line 302
    .line 303
    move-object v11, v8

    .line 304
    move-object v8, v10

    .line 305
    goto/16 :goto_a

    .line 306
    .line 307
    :catchall_1
    move-exception v0

    .line 308
    move-object/from16 v22, v11

    .line 309
    .line 310
    move-object/from16 v23, v12

    .line 311
    .line 312
    move-object/from16 v20, v14

    .line 313
    .line 314
    move-object v11, v8

    .line 315
    move-object v8, v10

    .line 316
    move v10, v4

    .line 317
    :goto_0
    move-object/from16 v4, v21

    .line 318
    .line 319
    move-object/from16 v21, v13

    .line 320
    .line 321
    move-wide v13, v6

    .line 322
    goto/16 :goto_d

    .line 323
    .line 324
    :cond_4
    iget v0, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->I$1:I

    .line 325
    .line 326
    iget-wide v1, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->J$0:J

    .line 327
    .line 328
    iget v3, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->I$0:I

    .line 329
    .line 330
    iget-object v4, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$7:Ljava/lang/Object;

    .line 331
    .line 332
    check-cast v4, Lcom/unity3d/ads/core/data/model/AdObject;

    .line 333
    .line 334
    iget-object v7, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$6:Ljava/lang/Object;

    .line 335
    .line 336
    check-cast v7, Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;

    .line 337
    .line 338
    iget-object v8, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$5:Ljava/lang/Object;

    .line 339
    .line 340
    check-cast v8, LEf/E;

    .line 341
    .line 342
    iget-object v8, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$4:Ljava/lang/Object;

    .line 343
    .line 344
    check-cast v8, Landroid/content/Context;

    .line 345
    .line 346
    iget-object v9, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$3:Ljava/lang/Object;

    .line 347
    .line 348
    check-cast v9, Lcom/unity3d/ads/UnityAdsLoadOptions;

    .line 349
    .line 350
    iget-object v13, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$2:Ljava/lang/Object;

    .line 351
    .line 352
    check-cast v13, Ljava/lang/String;

    .line 353
    .line 354
    iget-object v14, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$1:Ljava/lang/Object;

    .line 355
    .line 356
    check-cast v14, Lcom/google/protobuf/ByteString;

    .line 357
    .line 358
    iget-object v15, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$0:Ljava/lang/Object;

    .line 359
    .line 360
    check-cast v15, Lcom/unity3d/ads/core/domain/AndroidLoad;

    .line 361
    .line 362
    :try_start_4
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_4
    .catch Lcom/unity3d/ads/core/data/model/exception/UnityAdsNetworkException; {:try_start_4 .. :try_end_4} :catch_2

    .line 363
    .line 364
    .line 365
    move-object/from16 v22, v11

    .line 366
    .line 367
    move-object/from16 v23, v12

    .line 368
    .line 369
    move-object v6, v14

    .line 370
    move-object v11, v4

    .line 371
    move-object v12, v7

    .line 372
    move-object v4, v13

    .line 373
    move-wide v13, v1

    .line 374
    move-object v1, v8

    .line 375
    move-object v2, v9

    .line 376
    move v9, v0

    .line 377
    move v8, v3

    .line 378
    move-object v3, v10

    .line 379
    const/4 v10, 0x1

    .line 380
    move-object/from16 v0, p1

    .line 381
    .line 382
    goto/16 :goto_9

    .line 383
    .line 384
    :catch_2
    move-exception v0

    .line 385
    :goto_1
    move-object v4, v15

    .line 386
    goto/16 :goto_2b

    .line 387
    .line 388
    :cond_5
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 389
    .line 390
    .line 391
    iget-object v0, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$0:Ljava/lang/Object;

    .line 392
    .line 393
    check-cast v0, LEf/E;

    .line 394
    .line 395
    iget-object v2, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->$bannerSize:Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;

    .line 396
    .line 397
    if-eqz v2, :cond_6

    .line 398
    .line 399
    const/4 v7, 0x1

    .line 400
    goto :goto_2

    .line 401
    :cond_6
    const/4 v7, 0x0

    .line 402
    :goto_2
    invoke-static {}, LCf/e;->b()J

    .line 403
    .line 404
    .line 405
    move-result-wide v13

    .line 406
    iget-object v4, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->this$0:Lcom/unity3d/ads/core/domain/AndroidLoad;

    .line 407
    .line 408
    iget-object v9, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->$headerBiddingAdMarkup:Lgatewayprotocol/v1/HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup;

    .line 409
    .line 410
    iget-object v2, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->$opportunityId:Lcom/google/protobuf/ByteString;

    .line 411
    .line 412
    iget-object v3, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->$placement:Ljava/lang/String;

    .line 413
    .line 414
    iget-object v15, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->$loadOptions:Lcom/unity3d/ads/UnityAdsLoadOptions;

    .line 415
    .line 416
    move-object/from16 v23, v3

    .line 417
    .line 418
    iget-object v3, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->$bannerSize:Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;

    .line 419
    .line 420
    iget-object v6, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->$context:Landroid/content/Context;

    .line 421
    .line 422
    :try_start_5
    invoke-static {v4}, Lcom/unity3d/ads/core/domain/AndroidLoad;->access$getSessionRepository$p(Lcom/unity3d/ads/core/domain/AndroidLoad;)Lcom/unity3d/ads/core/data/repository/SessionRepository;

    .line 423
    .line 424
    .line 425
    move-result-object v21

    .line 426
    invoke-interface/range {v21 .. v21}, Lcom/unity3d/ads/core/data/repository/SessionRepository;->isSdkInitialized()Z

    .line 427
    .line 428
    .line 429
    move-result v21
    :try_end_5
    .catch Lcom/unity3d/ads/core/data/model/exception/UnityAdsNetworkException; {:try_start_5 .. :try_end_5} :catch_16

    .line 430
    if-nez v21, :cond_7

    .line 431
    .line 432
    :try_start_6
    new-instance v28, Lcom/unity3d/ads/core/data/model/LoadResult$Failure;

    .line 433
    .line 434
    sget-object v29, Lgatewayprotocol/v1/ErrorOuterClass$PublicErrorCode;->PUBLIC_ERROR_CODE_LOAD_NOT_INITIALIZED:Lgatewayprotocol/v1/ErrorOuterClass$PublicErrorCode;

    .line 435
    .line 436
    const-string v30, "Unity Ads SDK ad load failed: The Unity Ads SDK is not initialized. Initialize the SDK before loading ads."

    .line 437
    .line 438
    const-string v32, "not_initialized"

    .line 439
    .line 440
    const/16 v33, 0x0

    .line 441
    .line 442
    const/16 v34, 0x0

    .line 443
    .line 444
    const/16 v35, 0x34

    .line 445
    .line 446
    const/16 v36, 0x0

    .line 447
    .line 448
    const/16 v31, 0x0

    .line 449
    .line 450
    invoke-direct/range {v28 .. v36}, Lcom/unity3d/ads/core/data/model/LoadResult$Failure;-><init>(Lgatewayprotocol/v1/ErrorOuterClass$PublicErrorCode;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 451
    .line 452
    .line 453
    :goto_3
    move-object/from16 v0, v28

    .line 454
    .line 455
    goto/16 :goto_2c

    .line 456
    .line 457
    :catch_3
    move-exception v0

    .line 458
    :goto_4
    move v3, v7

    .line 459
    :goto_5
    move-wide v1, v13

    .line 460
    goto/16 :goto_2b

    .line 461
    .line 462
    :cond_7
    if-eqz v7, :cond_8

    .line 463
    .line 464
    sget-object v21, Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;->DIAGNOSTIC_AD_TYPE_BANNER:Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;
    :try_end_6
    .catch Lcom/unity3d/ads/core/data/model/exception/UnityAdsNetworkException; {:try_start_6 .. :try_end_6} :catch_3

    .line 465
    .line 466
    :goto_6
    move-object/from16 v25, v21

    .line 467
    .line 468
    goto :goto_7

    .line 469
    :cond_8
    :try_start_7
    sget-object v21, Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;->DIAGNOSTIC_AD_TYPE_FULLSCREEN:Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;

    .line 470
    .line 471
    goto :goto_6

    .line 472
    :goto_7
    invoke-virtual {v9}, Lgatewayprotocol/v1/HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup;->getAdData()Lcom/google/protobuf/ByteString;

    .line 473
    .line 474
    .line 475
    move-result-object v21

    .line 476
    invoke-virtual/range {v21 .. v21}, Lcom/google/protobuf/ByteString;->isEmpty()Z

    .line 477
    .line 478
    .line 479
    move-result v28
    :try_end_7
    .catch Lcom/unity3d/ads/core/data/model/exception/UnityAdsNetworkException; {:try_start_7 .. :try_end_7} :catch_16

    .line 480
    xor-int/lit8 v24, v28, 0x1

    .line 481
    .line 482
    move-object/from16 v22, v2

    .line 483
    .line 484
    move-object/from16 v21, v4

    .line 485
    .line 486
    move-object/from16 v26, v15

    .line 487
    .line 488
    :try_start_8
    invoke-static/range {v21 .. v26}, Lcom/unity3d/ads/core/domain/AndroidLoad;->access$getTmpAdObject(Lcom/unity3d/ads/core/domain/AndroidLoad;Lcom/google/protobuf/ByteString;Ljava/lang/String;ZLgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;Lcom/unity3d/ads/UnityAdsLoadOptions;)Lcom/unity3d/ads/core/data/model/AdObject;

    .line 489
    .line 490
    .line 491
    move-result-object v15
    :try_end_8
    .catch Lcom/unity3d/ads/core/data/model/exception/UnityAdsNetworkException; {:try_start_8 .. :try_end_8} :catch_13

    .line 492
    move/from16 v2, v24

    .line 493
    .line 494
    move-object/from16 v24, v8

    .line 495
    .line 496
    move v8, v2

    .line 497
    move-object/from16 v2, v21

    .line 498
    .line 499
    move-object/from16 v4, v22

    .line 500
    .line 501
    move-object/from16 v21, v3

    .line 502
    .line 503
    move-object/from16 v22, v11

    .line 504
    .line 505
    move-object/from16 v11, v26

    .line 506
    .line 507
    move v3, v1

    .line 508
    move-object/from16 v1, v23

    .line 509
    .line 510
    move-object/from16 v23, v12

    .line 511
    .line 512
    move-object/from16 v12, v25

    .line 513
    .line 514
    :try_start_9
    iget-object v3, v11, Lcom/unity3d/ads/UnityAdsLoadOptions;->loadConfiguration:Lcom/unity3d/ads/core/data/model/LoadConfigurationInternal;
    :try_end_9
    .catch Lcom/unity3d/ads/core/data/model/exception/UnityAdsNetworkException; {:try_start_9 .. :try_end_9} :catch_15

    .line 515
    .line 516
    if-eqz v3, :cond_9

    .line 517
    .line 518
    move-object/from16 v26, v3

    .line 519
    .line 520
    :try_start_a
    invoke-static {v2}, Lcom/unity3d/ads/core/domain/AndroidLoad;->access$getValidateExtrasSize$p(Lcom/unity3d/ads/core/domain/AndroidLoad;)Lcom/unity3d/ads/core/domain/ValidateExtrasSize;

    .line 521
    .line 522
    .line 523
    move-result-object v3

    .line 524
    move-object/from16 v29, v9

    .line 525
    .line 526
    invoke-virtual/range {v26 .. v26}, Lcom/unity3d/ads/core/data/model/LoadConfigurationInternal;->getExtras()Ljava/util/Map;

    .line 527
    .line 528
    .line 529
    move-result-object v9

    .line 530
    move-object/from16 v26, v10

    .line 531
    .line 532
    const-string v10, "load"

    .line 533
    .line 534
    invoke-virtual {v3, v9, v10, v15}, Lcom/unity3d/ads/core/domain/ValidateExtrasSize;->invoke(Ljava/util/Map;Ljava/lang/String;Lcom/unity3d/ads/core/data/model/AdObject;)V
    :try_end_a
    .catch Lcom/unity3d/ads/core/data/model/exception/UnityAdsNetworkException; {:try_start_a .. :try_end_a} :catch_4

    .line 535
    .line 536
    .line 537
    goto :goto_8

    .line 538
    :catch_4
    move-exception v0

    .line 539
    move-object v4, v2

    .line 540
    goto :goto_4

    .line 541
    :cond_9
    move-object/from16 v29, v9

    .line 542
    .line 543
    move-object/from16 v26, v10

    .line 544
    .line 545
    :goto_8
    if-eqz v28, :cond_d

    .line 546
    .line 547
    :try_start_b
    invoke-static {v2, v7}, Lcom/unity3d/ads/core/domain/AndroidLoad;->access$incrementLoadRequestCount(Lcom/unity3d/ads/core/domain/AndroidLoad;Z)V

    .line 548
    .line 549
    .line 550
    invoke-static {v2}, Lcom/unity3d/ads/core/domain/AndroidLoad;->access$getGetAdRequest$p(Lcom/unity3d/ads/core/domain/AndroidLoad;)Lcom/unity3d/ads/core/domain/GetAdRequest;

    .line 551
    .line 552
    .line 553
    move-result-object v3

    .line 554
    iget-object v9, v11, Lcom/unity3d/ads/UnityAdsLoadOptions;->loadConfiguration:Lcom/unity3d/ads/core/data/model/LoadConfigurationInternal;

    .line 555
    .line 556
    iput-object v2, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$0:Ljava/lang/Object;

    .line 557
    .line 558
    iput-object v4, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$1:Ljava/lang/Object;

    .line 559
    .line 560
    iput-object v1, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$2:Ljava/lang/Object;

    .line 561
    .line 562
    iput-object v11, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$3:Ljava/lang/Object;

    .line 563
    .line 564
    iput-object v6, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$4:Ljava/lang/Object;

    .line 565
    .line 566
    iput-object v0, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$5:Ljava/lang/Object;

    .line 567
    .line 568
    iput-object v12, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$6:Ljava/lang/Object;

    .line 569
    .line 570
    iput-object v15, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$7:Ljava/lang/Object;

    .line 571
    .line 572
    iput v7, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->I$0:I

    .line 573
    .line 574
    iput-wide v13, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->J$0:J

    .line 575
    .line 576
    iput v8, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->I$1:I

    .line 577
    .line 578
    const/4 v10, 0x1

    .line 579
    iput v10, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->label:I
    :try_end_b
    .catch Lcom/unity3d/ads/core/data/model/exception/UnityAdsNetworkException; {:try_start_b .. :try_end_b} :catch_a

    .line 580
    .line 581
    move-object v0, v9

    .line 582
    move-object v9, v2

    .line 583
    move-object v2, v4

    .line 584
    move-object v4, v0

    .line 585
    move-object v0, v3

    .line 586
    move-object/from16 v3, v21

    .line 587
    .line 588
    :try_start_c
    invoke-interface/range {v0 .. v5}, Lcom/unity3d/ads/core/domain/GetAdRequest;->invoke(Ljava/lang/String;Lcom/google/protobuf/ByteString;Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;Lcom/unity3d/ads/core/data/model/LoadConfigurationInternal;Ljf/c;)Ljava/lang/Object;

    .line 589
    .line 590
    .line 591
    move-result-object v0
    :try_end_c
    .catch Lcom/unity3d/ads/core/data/model/exception/UnityAdsNetworkException; {:try_start_c .. :try_end_c} :catch_9

    .line 592
    move-object/from16 v3, v26

    .line 593
    .line 594
    if-ne v0, v3, :cond_a

    .line 595
    .line 596
    move-object v10, v3

    .line 597
    goto/16 :goto_24

    .line 598
    .line 599
    :cond_a
    move-object v4, v1

    .line 600
    move-object v1, v6

    .line 601
    move-object v6, v2

    .line 602
    move-object v2, v11

    .line 603
    move-object v11, v15

    .line 604
    move-object v15, v9

    .line 605
    move v9, v8

    .line 606
    move v8, v7

    .line 607
    :goto_9
    :try_start_d
    check-cast v0, Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;

    .line 608
    .line 609
    invoke-static {v15}, Lcom/unity3d/ads/core/domain/AndroidLoad;->access$getGetRequestPolicy$p(Lcom/unity3d/ads/core/domain/AndroidLoad;)Lcom/unity3d/ads/core/domain/GetRequestPolicy;

    .line 610
    .line 611
    .line 612
    move-result-object v7

    .line 613
    invoke-interface {v7}, Lcom/unity3d/ads/core/domain/GetRequestPolicy;->invoke()Lcom/unity3d/ads/gatewayclient/RequestPolicy;

    .line 614
    .line 615
    .line 616
    move-result-object v7
    :try_end_d
    .catch Lcom/unity3d/ads/core/data/model/exception/UnityAdsNetworkException; {:try_start_d .. :try_end_d} :catch_8

    .line 617
    move-object/from16 p1, v7

    .line 618
    .line 619
    move/from16 v18, v8

    .line 620
    .line 621
    :try_start_e
    invoke-static {}, LCf/e;->b()J

    .line 622
    .line 623
    .line 624
    move-result-wide v7
    :try_end_e
    .catch Lcom/unity3d/ads/core/data/model/exception/UnityAdsNetworkException; {:try_start_e .. :try_end_e} :catch_7

    .line 625
    move-object/from16 v20, v0

    .line 626
    .line 627
    :try_start_f
    invoke-static {v15}, Lcom/unity3d/ads/core/domain/AndroidLoad;->access$getGatewayClient$p(Lcom/unity3d/ads/core/domain/AndroidLoad;)Lcom/unity3d/ads/gatewayclient/GatewayClient;

    .line 628
    .line 629
    .line 630
    move-result-object v0

    .line 631
    sget-object v21, Lcom/unity3d/ads/core/data/model/OperationType;->LOAD:Lcom/unity3d/ads/core/data/model/OperationType;

    .line 632
    .line 633
    iput-object v15, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$0:Ljava/lang/Object;

    .line 634
    .line 635
    iput-object v6, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$1:Ljava/lang/Object;

    .line 636
    .line 637
    iput-object v4, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$2:Ljava/lang/Object;

    .line 638
    .line 639
    iput-object v2, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$3:Ljava/lang/Object;

    .line 640
    .line 641
    iput-object v1, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$4:Ljava/lang/Object;

    .line 642
    .line 643
    iput-object v12, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$5:Ljava/lang/Object;

    .line 644
    .line 645
    iput-object v11, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$6:Ljava/lang/Object;

    .line 646
    .line 647
    const/4 v10, 0x0

    .line 648
    iput-object v10, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$7:Ljava/lang/Object;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_5

    .line 649
    .line 650
    move/from16 v10, v18

    .line 651
    .line 652
    :try_start_10
    iput v10, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->I$0:I

    .line 653
    .line 654
    iput-wide v13, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->J$0:J

    .line 655
    .line 656
    iput v9, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->I$1:I

    .line 657
    .line 658
    iput-wide v7, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->J$1:J

    .line 659
    .line 660
    move-object/from16 v18, v0

    .line 661
    .line 662
    const/4 v0, 0x2

    .line 663
    iput v0, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->label:I
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_4

    .line 664
    .line 665
    move-object/from16 v24, v6

    .line 666
    .line 667
    const/4 v6, 0x1

    .line 668
    move-wide/from16 v27, v7

    .line 669
    .line 670
    const/4 v7, 0x0

    .line 671
    move-object v8, v1

    .line 672
    const/4 v1, 0x0

    .line 673
    move-object/from16 v0, v20

    .line 674
    .line 675
    move-object/from16 v20, v2

    .line 676
    .line 677
    move-object v2, v0

    .line 678
    move-object/from16 v0, v18

    .line 679
    .line 680
    move-object/from16 v18, v4

    .line 681
    .line 682
    move-object/from16 v4, v21

    .line 683
    .line 684
    move-object/from16 v21, v8

    .line 685
    .line 686
    move-object v8, v3

    .line 687
    move-object/from16 v3, p1

    .line 688
    .line 689
    :try_start_11
    invoke-static/range {v0 .. v7}, Lcom/unity3d/ads/gatewayclient/GatewayClient$DefaultImpls;->request$default(Lcom/unity3d/ads/gatewayclient/GatewayClient;Ljava/lang/String;Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;Lcom/unity3d/ads/gatewayclient/RequestPolicy;Lcom/unity3d/ads/core/data/model/OperationType;Ljf/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 690
    .line 691
    .line 692
    move-result-object v0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_3

    .line 693
    if-ne v0, v8, :cond_b

    .line 694
    .line 695
    move-object v10, v8

    .line 696
    goto/16 :goto_24

    .line 697
    .line 698
    :cond_b
    move v3, v9

    .line 699
    move v4, v10

    .line 700
    move-object v9, v12

    .line 701
    move-wide v6, v13

    .line 702
    move-object/from16 v14, v20

    .line 703
    .line 704
    move-object/from16 v13, v21

    .line 705
    .line 706
    move-wide/from16 v1, v27

    .line 707
    .line 708
    move-object/from16 v21, v15

    .line 709
    .line 710
    move-object/from16 v15, v18

    .line 711
    .line 712
    move-object/from16 v18, v24

    .line 713
    .line 714
    :goto_a
    :try_start_12
    check-cast v0, Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_2

    .line 715
    .line 716
    :goto_b
    move-object/from16 v32, v11

    .line 717
    .line 718
    goto :goto_e

    .line 719
    :catchall_2
    move-exception v0

    .line 720
    move v10, v4

    .line 721
    move-object/from16 v20, v14

    .line 722
    .line 723
    goto/16 :goto_0

    .line 724
    .line 725
    :catchall_3
    move-exception v0

    .line 726
    :goto_c
    move v3, v9

    .line 727
    move-object v9, v12

    .line 728
    move-object v4, v15

    .line 729
    move-object/from16 v15, v18

    .line 730
    .line 731
    move-object/from16 v18, v24

    .line 732
    .line 733
    move-wide/from16 v1, v27

    .line 734
    .line 735
    goto :goto_d

    .line 736
    :catchall_4
    move-exception v0

    .line 737
    move-object/from16 v21, v1

    .line 738
    .line 739
    move-object/from16 v20, v2

    .line 740
    .line 741
    move-object/from16 v18, v4

    .line 742
    .line 743
    move-object/from16 v24, v6

    .line 744
    .line 745
    move-wide/from16 v27, v7

    .line 746
    .line 747
    move-object v8, v3

    .line 748
    goto :goto_c

    .line 749
    :catchall_5
    move-exception v0

    .line 750
    move-object/from16 v21, v1

    .line 751
    .line 752
    move-object/from16 v20, v2

    .line 753
    .line 754
    move-object/from16 v24, v6

    .line 755
    .line 756
    move-wide/from16 v27, v7

    .line 757
    .line 758
    move/from16 v10, v18

    .line 759
    .line 760
    move-object v8, v3

    .line 761
    move-object/from16 v18, v4

    .line 762
    .line 763
    goto :goto_c

    .line 764
    :goto_d
    :try_start_13
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 765
    .line 766
    .line 767
    move-result-object v0
    :try_end_13
    .catch Lcom/unity3d/ads/core/data/model/exception/UnityAdsNetworkException; {:try_start_13 .. :try_end_13} :catch_6

    .line 768
    move-wide v6, v13

    .line 769
    move-object/from16 v14, v20

    .line 770
    .line 771
    move-object/from16 v13, v21

    .line 772
    .line 773
    move-object/from16 v21, v4

    .line 774
    .line 775
    move v4, v10

    .line 776
    goto :goto_b

    .line 777
    :goto_e
    :try_start_14
    invoke-static {v1, v2}, LCf/g;->a(J)J

    .line 778
    .line 779
    .line 780
    move-result-wide v1

    .line 781
    invoke-static/range {v21 .. v21}, Lcom/unity3d/ads/core/domain/AndroidLoad;->access$getSendDiagnosticEvent$p(Lcom/unity3d/ads/core/domain/AndroidLoad;)Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;

    .line 782
    .line 783
    .line 784
    move-result-object v27

    .line 785
    instance-of v10, v0, Lef/m;

    .line 786
    .line 787
    if-nez v10, :cond_c

    .line 788
    .line 789
    move-object/from16 v28, v23

    .line 790
    .line 791
    goto :goto_f

    .line 792
    :cond_c
    move-object/from16 v28, v22

    .line 793
    .line 794
    :goto_f
    sget-object v10, LCf/c;->c:LCf/c;

    .line 795
    .line 796
    invoke-static {v1, v2, v10}, LCf/a;->h(JLCf/c;)D

    .line 797
    .line 798
    .line 799
    move-result-wide v1

    .line 800
    new-instance v10, Ljava/lang/Double;

    .line 801
    .line 802
    invoke-direct {v10, v1, v2}, Ljava/lang/Double;-><init>(D)V

    .line 803
    .line 804
    .line 805
    const/16 v31, 0x0

    .line 806
    .line 807
    const/16 v33, 0x0

    .line 808
    .line 809
    const/16 v34, 0x2c

    .line 810
    .line 811
    const/16 v35, 0x0

    .line 812
    .line 813
    const/16 v30, 0x0

    .line 814
    .line 815
    move-object/from16 v29, v10

    .line 816
    .line 817
    invoke-static/range {v27 .. v35}, Lcom/unity3d/ads/core/domain/SendDiagnosticEvent$DefaultImpls;->invoke$default(Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Ljava/lang/String;Ljava/lang/Double;Ljava/util/Map;Ljava/util/Map;Lcom/unity3d/ads/core/data/model/AdObject;Ljava/lang/Integer;ILjava/lang/Object;)V

    .line 818
    .line 819
    .line 820
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V

    .line 821
    .line 822
    .line 823
    check-cast v0, Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;

    .line 824
    .line 825
    invoke-virtual {v0}, Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;->getPayload()Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Payload;

    .line 826
    .line 827
    .line 828
    move-result-object v0

    .line 829
    invoke-virtual {v0}, Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Payload;->getAdResponse()Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;

    .line 830
    .line 831
    .line 832
    move-result-object v0
    :try_end_14
    .catch Lcom/unity3d/ads/core/data/model/exception/UnityAdsNetworkException; {:try_start_14 .. :try_end_14} :catch_5

    .line 833
    move-object v1, v13

    .line 834
    move v13, v4

    .line 835
    move-object v4, v1

    .line 836
    move-wide v11, v6

    .line 837
    move-object v10, v8

    .line 838
    move-object v6, v9

    .line 839
    move-object v1, v14

    .line 840
    move-object/from16 v14, v21

    .line 841
    .line 842
    move v9, v3

    .line 843
    :goto_10
    move-object/from16 v2, v18

    .line 844
    .line 845
    move-object v3, v0

    .line 846
    goto/16 :goto_22

    .line 847
    .line 848
    :catch_5
    move-exception v0

    .line 849
    move v3, v4

    .line 850
    move-wide v1, v6

    .line 851
    :goto_11
    move-object/from16 v4, v21

    .line 852
    .line 853
    goto/16 :goto_2b

    .line 854
    .line 855
    :catch_6
    move-exception v0

    .line 856
    move v3, v10

    .line 857
    goto/16 :goto_5

    .line 858
    .line 859
    :catch_7
    move-exception v0

    .line 860
    move/from16 v10, v18

    .line 861
    .line 862
    :goto_12
    move v3, v10

    .line 863
    move-wide v1, v13

    .line 864
    goto/16 :goto_1

    .line 865
    .line 866
    :catch_8
    move-exception v0

    .line 867
    move v10, v8

    .line 868
    goto :goto_12

    .line 869
    :catch_9
    move-exception v0

    .line 870
    :goto_13
    move v3, v7

    .line 871
    move-object v4, v9

    .line 872
    goto/16 :goto_5

    .line 873
    .line 874
    :catch_a
    move-exception v0

    .line 875
    move-object v9, v2

    .line 876
    goto :goto_13

    .line 877
    :cond_d
    move-object v9, v2

    .line 878
    move-object v2, v4

    .line 879
    move-object/from16 v3, v21

    .line 880
    .line 881
    move-object/from16 v10, v26

    .line 882
    .line 883
    :try_start_15
    invoke-static {v9, v7}, Lcom/unity3d/ads/core/domain/AndroidLoad;->access$incrementLoadRequestAdmCount(Lcom/unity3d/ads/core/domain/AndroidLoad;Z)V

    .line 884
    .line 885
    .line 886
    invoke-static {v9}, Lcom/unity3d/ads/core/domain/AndroidLoad;->access$getGetAdPlayerConfigRequest$p(Lcom/unity3d/ads/core/domain/AndroidLoad;)Lcom/unity3d/ads/core/domain/GetAdPlayerConfigRequest;

    .line 887
    .line 888
    .line 889
    move-result-object v4

    .line 890
    move-object/from16 v21, v3

    .line 891
    .line 892
    invoke-virtual/range {v29 .. v29}, Lgatewayprotocol/v1/HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup;->getConfigurationToken()Lcom/google/protobuf/ByteString;

    .line 893
    .line 894
    .line 895
    move-result-object v3

    .line 896
    move-object/from16 p1, v4

    .line 897
    .line 898
    const-string v4, "headerBiddingAdMarkup.configurationToken"

    .line 899
    .line 900
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_15
    .catch Lcom/unity3d/ads/core/data/model/exception/UnityAdsNetworkException; {:try_start_15 .. :try_end_15} :catch_14

    .line 901
    .line 902
    .line 903
    if-eqz v21, :cond_e

    .line 904
    .line 905
    :try_start_16
    sget-object v4, Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;->AD_FORMAT_BANNER:Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;
    :try_end_16
    .catch Lcom/unity3d/ads/core/data/model/exception/UnityAdsNetworkException; {:try_start_16 .. :try_end_16} :catch_9

    .line 906
    .line 907
    :goto_14
    move-object/from16 v20, v3

    .line 908
    .line 909
    goto :goto_15

    .line 910
    :cond_e
    const/4 v4, 0x0

    .line 911
    goto :goto_14

    .line 912
    :goto_15
    :try_start_17
    iget-object v3, v11, Lcom/unity3d/ads/UnityAdsLoadOptions;->loadConfiguration:Lcom/unity3d/ads/core/data/model/LoadConfigurationInternal;

    .line 913
    .line 914
    iput-object v9, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$0:Ljava/lang/Object;
    :try_end_17
    .catch Lcom/unity3d/ads/core/data/model/exception/UnityAdsNetworkException; {:try_start_17 .. :try_end_17} :catch_14

    .line 915
    .line 916
    move-object/from16 v21, v9

    .line 917
    .line 918
    move-object/from16 v9, v29

    .line 919
    .line 920
    :try_start_18
    iput-object v9, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$1:Ljava/lang/Object;

    .line 921
    .line 922
    iput-object v2, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$2:Ljava/lang/Object;

    .line 923
    .line 924
    iput-object v1, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$3:Ljava/lang/Object;

    .line 925
    .line 926
    iput-object v11, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$4:Ljava/lang/Object;

    .line 927
    .line 928
    iput-object v6, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$5:Ljava/lang/Object;

    .line 929
    .line 930
    iput-object v0, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$6:Ljava/lang/Object;

    .line 931
    .line 932
    iput-object v12, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$7:Ljava/lang/Object;

    .line 933
    .line 934
    iput-object v15, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$8:Ljava/lang/Object;

    .line 935
    .line 936
    iput v7, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->I$0:I

    .line 937
    .line 938
    iput-wide v13, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->J$0:J

    .line 939
    .line 940
    iput v8, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->I$1:I

    .line 941
    .line 942
    const/4 v0, 0x3

    .line 943
    iput v0, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->label:I
    :try_end_18
    .catch Lcom/unity3d/ads/core/data/model/exception/UnityAdsNetworkException; {:try_start_18 .. :try_end_18} :catch_13

    .line 944
    .line 945
    move-object v0, v5

    .line 946
    move-object v5, v3

    .line 947
    move-object/from16 v3, v20

    .line 948
    .line 949
    move-object/from16 v20, v6

    .line 950
    .line 951
    move-object v6, v0

    .line 952
    move-object/from16 v0, p1

    .line 953
    .line 954
    :try_start_19
    invoke-interface/range {v0 .. v6}, Lcom/unity3d/ads/core/domain/GetAdPlayerConfigRequest;->invoke(Ljava/lang/String;Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ByteString;Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;Lcom/unity3d/ads/core/data/model/LoadConfigurationInternal;Ljf/c;)Ljava/lang/Object;

    .line 955
    .line 956
    .line 957
    move-result-object v0
    :try_end_19
    .catch Lcom/unity3d/ads/core/data/model/exception/UnityAdsNetworkException; {:try_start_19 .. :try_end_19} :catch_12

    .line 958
    move-object v5, v6

    .line 959
    if-ne v0, v10, :cond_f

    .line 960
    .line 961
    goto/16 :goto_24

    .line 962
    .line 963
    :cond_f
    move-object v3, v1

    .line 964
    move-object v4, v2

    .line 965
    move-object v6, v9

    .line 966
    move-object v2, v11

    .line 967
    move-object/from16 v1, v20

    .line 968
    .line 969
    move-object/from16 v11, v21

    .line 970
    .line 971
    move v9, v8

    .line 972
    move v8, v7

    .line 973
    :goto_16
    :try_start_1a
    check-cast v0, Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;

    .line 974
    .line 975
    invoke-static {v11}, Lcom/unity3d/ads/core/domain/AndroidLoad;->access$getGetRequestPolicy$p(Lcom/unity3d/ads/core/domain/AndroidLoad;)Lcom/unity3d/ads/core/domain/GetRequestPolicy;

    .line 976
    .line 977
    .line 978
    move-result-object v7

    .line 979
    invoke-interface {v7}, Lcom/unity3d/ads/core/domain/GetRequestPolicy;->invoke()Lcom/unity3d/ads/gatewayclient/RequestPolicy;

    .line 980
    .line 981
    .line 982
    move-result-object v7
    :try_end_1a
    .catch Lcom/unity3d/ads/core/data/model/exception/UnityAdsNetworkException; {:try_start_1a .. :try_end_1a} :catch_11

    .line 983
    move-object/from16 p1, v7

    .line 984
    .line 985
    move/from16 v20, v8

    .line 986
    .line 987
    :try_start_1b
    invoke-static {}, LCf/e;->b()J

    .line 988
    .line 989
    .line 990
    move-result-wide v7
    :try_end_1b
    .catch Lcom/unity3d/ads/core/data/model/exception/UnityAdsNetworkException; {:try_start_1b .. :try_end_1b} :catch_10

    .line 991
    move-object/from16 v21, v0

    .line 992
    .line 993
    :try_start_1c
    invoke-static {v11}, Lcom/unity3d/ads/core/domain/AndroidLoad;->access$getGatewayClient$p(Lcom/unity3d/ads/core/domain/AndroidLoad;)Lcom/unity3d/ads/gatewayclient/GatewayClient;

    .line 994
    .line 995
    .line 996
    move-result-object v0

    .line 997
    sget-object v25, Lcom/unity3d/ads/core/data/model/OperationType;->LOAD_HEADER_BIDDING:Lcom/unity3d/ads/core/data/model/OperationType;

    .line 998
    .line 999
    iput-object v11, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$0:Ljava/lang/Object;

    .line 1000
    .line 1001
    iput-object v6, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$1:Ljava/lang/Object;

    .line 1002
    .line 1003
    iput-object v4, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$2:Ljava/lang/Object;

    .line 1004
    .line 1005
    iput-object v3, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$3:Ljava/lang/Object;

    .line 1006
    .line 1007
    iput-object v2, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$4:Ljava/lang/Object;

    .line 1008
    .line 1009
    iput-object v1, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$5:Ljava/lang/Object;

    .line 1010
    .line 1011
    iput-object v12, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$6:Ljava/lang/Object;

    .line 1012
    .line 1013
    iput-object v15, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$7:Ljava/lang/Object;
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_a

    .line 1014
    .line 1015
    move-object/from16 v27, v1

    .line 1016
    .line 1017
    const/4 v1, 0x0

    .line 1018
    :try_start_1d
    iput-object v1, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$8:Ljava/lang/Object;
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_9

    .line 1019
    .line 1020
    move/from16 v1, v20

    .line 1021
    .line 1022
    :try_start_1e
    iput v1, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->I$0:I

    .line 1023
    .line 1024
    iput-wide v13, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->J$0:J

    .line 1025
    .line 1026
    iput v9, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->I$1:I

    .line 1027
    .line 1028
    iput-wide v7, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->J$1:J

    .line 1029
    .line 1030
    move-object/from16 v20, v0

    .line 1031
    .line 1032
    const/4 v0, 0x4

    .line 1033
    iput v0, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->label:I
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_8

    .line 1034
    .line 1035
    move-object/from16 v18, v6

    .line 1036
    .line 1037
    const/4 v6, 0x1

    .line 1038
    move-wide/from16 v28, v7

    .line 1039
    .line 1040
    const/4 v7, 0x0

    .line 1041
    move v8, v1

    .line 1042
    const/4 v1, 0x0

    .line 1043
    move-object/from16 v0, v21

    .line 1044
    .line 1045
    move-object/from16 v21, v2

    .line 1046
    .line 1047
    move-object v2, v0

    .line 1048
    move v0, v8

    .line 1049
    move-object v8, v4

    .line 1050
    move-object/from16 v4, v25

    .line 1051
    .line 1052
    move/from16 v25, v0

    .line 1053
    .line 1054
    move-object/from16 v0, v20

    .line 1055
    .line 1056
    move-object/from16 v20, v3

    .line 1057
    .line 1058
    move-object/from16 v3, p1

    .line 1059
    .line 1060
    :try_start_1f
    invoke-static/range {v0 .. v7}, Lcom/unity3d/ads/gatewayclient/GatewayClient$DefaultImpls;->request$default(Lcom/unity3d/ads/gatewayclient/GatewayClient;Ljava/lang/String;Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;Lcom/unity3d/ads/gatewayclient/RequestPolicy;Lcom/unity3d/ads/core/data/model/OperationType;Ljf/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v0
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_7

    .line 1064
    if-ne v0, v10, :cond_10

    .line 1065
    .line 1066
    goto/16 :goto_24

    .line 1067
    .line 1068
    :cond_10
    move v3, v9

    .line 1069
    move-wide v6, v13

    .line 1070
    move-object/from16 v9, v18

    .line 1071
    .line 1072
    move/from16 v4, v25

    .line 1073
    .line 1074
    move-object/from16 v18, v27

    .line 1075
    .line 1076
    move-wide/from16 v1, v28

    .line 1077
    .line 1078
    :goto_17
    :try_start_20
    check-cast v0, Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_6

    .line 1079
    .line 1080
    move-object/from16 v13, v18

    .line 1081
    .line 1082
    move-object/from16 v18, v8

    .line 1083
    .line 1084
    move-object v8, v9

    .line 1085
    move v9, v3

    .line 1086
    move v3, v4

    .line 1087
    move-object v4, v11

    .line 1088
    :goto_18
    move-object/from16 v32, v15

    .line 1089
    .line 1090
    move-object/from16 v15, v20

    .line 1091
    .line 1092
    move-object/from16 v14, v21

    .line 1093
    .line 1094
    goto :goto_1d

    .line 1095
    :catchall_6
    move-exception v0

    .line 1096
    move-wide v13, v6

    .line 1097
    move-object v6, v9

    .line 1098
    move v9, v3

    .line 1099
    move v3, v4

    .line 1100
    move-object v4, v11

    .line 1101
    goto :goto_1c

    .line 1102
    :catchall_7
    move-exception v0

    .line 1103
    move-object v4, v11

    .line 1104
    move-object/from16 v6, v18

    .line 1105
    .line 1106
    :goto_19
    move/from16 v3, v25

    .line 1107
    .line 1108
    move-object/from16 v18, v27

    .line 1109
    .line 1110
    move-wide/from16 v1, v28

    .line 1111
    .line 1112
    goto :goto_1c

    .line 1113
    :catchall_8
    move-exception v0

    .line 1114
    move/from16 v25, v1

    .line 1115
    .line 1116
    move-object/from16 v21, v2

    .line 1117
    .line 1118
    move-object/from16 v20, v3

    .line 1119
    .line 1120
    move-object/from16 v18, v6

    .line 1121
    .line 1122
    move-wide/from16 v28, v7

    .line 1123
    .line 1124
    :goto_1a
    move-object v8, v4

    .line 1125
    move-object v4, v11

    .line 1126
    goto :goto_19

    .line 1127
    :catchall_9
    move-exception v0

    .line 1128
    :goto_1b
    move-object/from16 v21, v2

    .line 1129
    .line 1130
    move-object/from16 v18, v6

    .line 1131
    .line 1132
    move-wide/from16 v28, v7

    .line 1133
    .line 1134
    move/from16 v25, v20

    .line 1135
    .line 1136
    move-object/from16 v20, v3

    .line 1137
    .line 1138
    goto :goto_1a

    .line 1139
    :catchall_a
    move-exception v0

    .line 1140
    move-object/from16 v27, v1

    .line 1141
    .line 1142
    goto :goto_1b

    .line 1143
    :goto_1c
    :try_start_21
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 1144
    .line 1145
    .line 1146
    move-result-object v0
    :try_end_21
    .catch Lcom/unity3d/ads/core/data/model/exception/UnityAdsNetworkException; {:try_start_21 .. :try_end_21} :catch_f

    .line 1147
    move-object/from16 v32, v8

    .line 1148
    .line 1149
    move-object v8, v6

    .line 1150
    move-wide v6, v13

    .line 1151
    move-object/from16 v13, v18

    .line 1152
    .line 1153
    move-object/from16 v18, v32

    .line 1154
    .line 1155
    goto :goto_18

    .line 1156
    :goto_1d
    :try_start_22
    invoke-static {v1, v2}, LCf/g;->a(J)J

    .line 1157
    .line 1158
    .line 1159
    move-result-wide v1

    .line 1160
    invoke-static {v4}, Lcom/unity3d/ads/core/domain/AndroidLoad;->access$getSendDiagnosticEvent$p(Lcom/unity3d/ads/core/domain/AndroidLoad;)Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;

    .line 1161
    .line 1162
    .line 1163
    move-result-object v27

    .line 1164
    instance-of v11, v0, Lef/m;

    .line 1165
    .line 1166
    if-nez v11, :cond_11

    .line 1167
    .line 1168
    move-object/from16 v28, v23

    .line 1169
    .line 1170
    goto :goto_1e

    .line 1171
    :cond_11
    move-object/from16 v28, v22

    .line 1172
    .line 1173
    :goto_1e
    sget-object v11, LCf/c;->c:LCf/c;

    .line 1174
    .line 1175
    invoke-static {v1, v2, v11}, LCf/a;->h(JLCf/c;)D

    .line 1176
    .line 1177
    .line 1178
    move-result-wide v1

    .line 1179
    new-instance v11, Ljava/lang/Double;

    .line 1180
    .line 1181
    invoke-direct {v11, v1, v2}, Ljava/lang/Double;-><init>(D)V

    .line 1182
    .line 1183
    .line 1184
    const/16 v31, 0x0

    .line 1185
    .line 1186
    const/16 v33, 0x0

    .line 1187
    .line 1188
    const/16 v34, 0x2c

    .line 1189
    .line 1190
    const/16 v35, 0x0

    .line 1191
    .line 1192
    const/16 v30, 0x0

    .line 1193
    .line 1194
    move-object/from16 v29, v11

    .line 1195
    .line 1196
    invoke-static/range {v27 .. v35}, Lcom/unity3d/ads/core/domain/SendDiagnosticEvent$DefaultImpls;->invoke$default(Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Ljava/lang/String;Ljava/lang/Double;Ljava/util/Map;Ljava/util/Map;Lcom/unity3d/ads/core/data/model/AdObject;Ljava/lang/Integer;ILjava/lang/Object;)V

    .line 1197
    .line 1198
    .line 1199
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V

    .line 1200
    .line 1201
    .line 1202
    check-cast v0, Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;

    .line 1203
    .line 1204
    invoke-virtual {v0}, Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;->hasError()Z

    .line 1205
    .line 1206
    .line 1207
    move-result v1

    .line 1208
    if-eqz v1, :cond_14

    .line 1209
    .line 1210
    new-instance v27, Lcom/unity3d/ads/core/data/model/LoadResult$Failure;

    .line 1211
    .line 1212
    invoke-virtual {v0}, Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;->getError()Lgatewayprotocol/v1/ErrorOuterClass$Error;

    .line 1213
    .line 1214
    .line 1215
    move-result-object v1

    .line 1216
    invoke-virtual {v1}, Lgatewayprotocol/v1/ErrorOuterClass$Error;->getErrorCode()Lgatewayprotocol/v1/ErrorOuterClass$PublicErrorCode;

    .line 1217
    .line 1218
    .line 1219
    move-result-object v1

    .line 1220
    const-string v2, "gatewayAdPlayerConfigResponse.error.errorCode"

    .line 1221
    .line 1222
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1223
    .line 1224
    .line 1225
    invoke-virtual {v0}, Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;->getError()Lgatewayprotocol/v1/ErrorOuterClass$Error;

    .line 1226
    .line 1227
    .line 1228
    move-result-object v2

    .line 1229
    invoke-virtual {v2}, Lgatewayprotocol/v1/ErrorOuterClass$Error;->getErrorCode()Lgatewayprotocol/v1/ErrorOuterClass$PublicErrorCode;

    .line 1230
    .line 1231
    .line 1232
    move-result-object v2

    .line 1233
    if-eqz v2, :cond_13

    .line 1234
    .line 1235
    invoke-static {v2}, Lcom/unity3d/ads/UnityAdsErrorKt;->getLoadErrorMsg(Lgatewayprotocol/v1/ErrorOuterClass$PublicErrorCode;)Ljava/lang/String;

    .line 1236
    .line 1237
    .line 1238
    move-result-object v2

    .line 1239
    if-nez v2, :cond_12

    .line 1240
    .line 1241
    goto :goto_20

    .line 1242
    :cond_12
    :goto_1f
    move-object/from16 v29, v2

    .line 1243
    .line 1244
    goto :goto_21

    .line 1245
    :catch_b
    move-exception v0

    .line 1246
    move-wide v1, v6

    .line 1247
    goto/16 :goto_2b

    .line 1248
    .line 1249
    :cond_13
    :goto_20
    const-string v2, "Internal error"

    .line 1250
    .line 1251
    goto :goto_1f

    .line 1252
    :goto_21
    const-string v31, "gateway"

    .line 1253
    .line 1254
    invoke-virtual {v0}, Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;->getError()Lgatewayprotocol/v1/ErrorOuterClass$Error;

    .line 1255
    .line 1256
    .line 1257
    move-result-object v0

    .line 1258
    invoke-virtual {v0}, Lgatewayprotocol/v1/ErrorOuterClass$Error;->getErrorText()Ljava/lang/String;

    .line 1259
    .line 1260
    .line 1261
    move-result-object v32

    .line 1262
    const/16 v30, 0x0

    .line 1263
    .line 1264
    const/16 v33, 0x0

    .line 1265
    .line 1266
    const/16 v34, 0x24

    .line 1267
    .line 1268
    const/16 v35, 0x0

    .line 1269
    .line 1270
    move-object/from16 v28, v1

    .line 1271
    .line 1272
    invoke-direct/range {v27 .. v35}, Lcom/unity3d/ads/core/data/model/LoadResult$Failure;-><init>(Lgatewayprotocol/v1/ErrorOuterClass$PublicErrorCode;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1273
    .line 1274
    .line 1275
    move-wide v13, v6

    .line 1276
    move-object/from16 v0, v27

    .line 1277
    .line 1278
    move v7, v3

    .line 1279
    goto/16 :goto_2c

    .line 1280
    .line 1281
    :cond_14
    invoke-virtual {v0}, Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;->getPayload()Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Payload;

    .line 1282
    .line 1283
    .line 1284
    move-result-object v0

    .line 1285
    invoke-virtual {v0}, Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse$Payload;->getAdPlayerConfigResponse()Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse;

    .line 1286
    .line 1287
    .line 1288
    move-result-object v0

    .line 1289
    sget-object v1, Lgatewayprotocol/v1/AdResponseKt$Dsl;->Companion:Lgatewayprotocol/v1/AdResponseKt$Dsl$Companion;

    .line 1290
    .line 1291
    invoke-static {}, Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;->newBuilder()Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse$Builder;

    .line 1292
    .line 1293
    .line 1294
    move-result-object v2

    .line 1295
    const-string v11, "newBuilder()"

    .line 1296
    .line 1297
    invoke-static {v2, v11}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1298
    .line 1299
    .line 1300
    invoke-virtual {v1, v2}, Lgatewayprotocol/v1/AdResponseKt$Dsl$Companion;->_create(Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse$Builder;)Lgatewayprotocol/v1/AdResponseKt$Dsl;

    .line 1301
    .line 1302
    .line 1303
    move-result-object v1

    .line 1304
    invoke-virtual {v8}, Lgatewayprotocol/v1/HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup;->getAdData()Lcom/google/protobuf/ByteString;

    .line 1305
    .line 1306
    .line 1307
    move-result-object v2

    .line 1308
    const-string v11, "headerBiddingAdMarkup.adData"

    .line 1309
    .line 1310
    invoke-static {v2, v11}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1311
    .line 1312
    .line 1313
    invoke-virtual {v1, v2}, Lgatewayprotocol/v1/AdResponseKt$Dsl;->setAdData(Lcom/google/protobuf/ByteString;)V

    .line 1314
    .line 1315
    .line 1316
    invoke-virtual {v8}, Lgatewayprotocol/v1/HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup;->getAdDataVersion()I

    .line 1317
    .line 1318
    .line 1319
    move-result v2

    .line 1320
    invoke-virtual {v1, v2}, Lgatewayprotocol/v1/AdResponseKt$Dsl;->setAdDataVersion(I)V

    .line 1321
    .line 1322
    .line 1323
    invoke-virtual {v0}, Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse;->getTrackingToken()Lcom/google/protobuf/ByteString;

    .line 1324
    .line 1325
    .line 1326
    move-result-object v2

    .line 1327
    const-string v8, "response.trackingToken"

    .line 1328
    .line 1329
    invoke-static {v2, v8}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1330
    .line 1331
    .line 1332
    invoke-virtual {v1, v2}, Lgatewayprotocol/v1/AdResponseKt$Dsl;->setTrackingToken(Lcom/google/protobuf/ByteString;)V

    .line 1333
    .line 1334
    .line 1335
    invoke-virtual {v0}, Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse;->getImpressionConfiguration()Lcom/google/protobuf/ByteString;

    .line 1336
    .line 1337
    .line 1338
    move-result-object v2

    .line 1339
    const-string v8, "response.impressionConfiguration"

    .line 1340
    .line 1341
    invoke-static {v2, v8}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1342
    .line 1343
    .line 1344
    invoke-virtual {v1, v2}, Lgatewayprotocol/v1/AdResponseKt$Dsl;->setImpressionConfiguration(Lcom/google/protobuf/ByteString;)V

    .line 1345
    .line 1346
    .line 1347
    invoke-virtual {v0}, Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse;->getImpressionConfigurationVersion()I

    .line 1348
    .line 1349
    .line 1350
    move-result v2

    .line 1351
    invoke-virtual {v1, v2}, Lgatewayprotocol/v1/AdResponseKt$Dsl;->setImpressionConfigurationVersion(I)V

    .line 1352
    .line 1353
    .line 1354
    invoke-virtual {v0}, Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse;->getWebviewConfiguration()Lgatewayprotocol/v1/WebviewConfiguration$WebViewConfiguration;

    .line 1355
    .line 1356
    .line 1357
    move-result-object v2

    .line 1358
    const-string v8, "response.webviewConfiguration"

    .line 1359
    .line 1360
    invoke-static {v2, v8}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1361
    .line 1362
    .line 1363
    invoke-virtual {v1, v2}, Lgatewayprotocol/v1/AdResponseKt$Dsl;->setWebviewConfiguration(Lgatewayprotocol/v1/WebviewConfiguration$WebViewConfiguration;)V

    .line 1364
    .line 1365
    .line 1366
    invoke-virtual {v0}, Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse;->getAdDataRefreshToken()Lcom/google/protobuf/ByteString;

    .line 1367
    .line 1368
    .line 1369
    move-result-object v2

    .line 1370
    const-string v8, "response.adDataRefreshToken"

    .line 1371
    .line 1372
    invoke-static {v2, v8}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1373
    .line 1374
    .line 1375
    invoke-virtual {v1, v2}, Lgatewayprotocol/v1/AdResponseKt$Dsl;->setAdDataRefreshToken(Lcom/google/protobuf/ByteString;)V

    .line 1376
    .line 1377
    .line 1378
    invoke-virtual {v0}, Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse;->getCampaignMetadata()Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignMetadata;

    .line 1379
    .line 1380
    .line 1381
    move-result-object v2

    .line 1382
    const-string v8, "response.campaignMetadata"

    .line 1383
    .line 1384
    invoke-static {v2, v8}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1385
    .line 1386
    .line 1387
    invoke-virtual {v1, v2}, Lgatewayprotocol/v1/AdResponseKt$Dsl;->setCampaignMetadata(Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignMetadata;)V

    .line 1388
    .line 1389
    .line 1390
    invoke-virtual {v0}, Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse;->hasError()Z

    .line 1391
    .line 1392
    .line 1393
    move-result v2

    .line 1394
    if-eqz v2, :cond_15

    .line 1395
    .line 1396
    invoke-virtual {v0}, Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse;->getError()Lgatewayprotocol/v1/ErrorOuterClass$Error;

    .line 1397
    .line 1398
    .line 1399
    move-result-object v2

    .line 1400
    const-string v8, "response.error"

    .line 1401
    .line 1402
    invoke-static {v2, v8}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1403
    .line 1404
    .line 1405
    invoke-virtual {v1, v2}, Lgatewayprotocol/v1/AdResponseKt$Dsl;->setError(Lgatewayprotocol/v1/ErrorOuterClass$Error;)V

    .line 1406
    .line 1407
    .line 1408
    :cond_15
    invoke-virtual {v0}, Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse;->getAdData()Lcom/google/protobuf/ByteString;

    .line 1409
    .line 1410
    .line 1411
    move-result-object v2

    .line 1412
    move-object/from16 v8, v24

    .line 1413
    .line 1414
    invoke-static {v2, v8}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1415
    .line 1416
    .line 1417
    invoke-static {v2}, Lcom/google/protobuf/kotlin/ByteStringsKt;->isNotEmpty(Lcom/google/protobuf/ByteString;)Z

    .line 1418
    .line 1419
    .line 1420
    move-result v2

    .line 1421
    if-eqz v2, :cond_16

    .line 1422
    .line 1423
    invoke-virtual {v0}, Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse;->getAdData()Lcom/google/protobuf/ByteString;

    .line 1424
    .line 1425
    .line 1426
    move-result-object v2

    .line 1427
    invoke-static {v2, v8}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1428
    .line 1429
    .line 1430
    invoke-virtual {v1, v2}, Lgatewayprotocol/v1/AdResponseKt$Dsl;->setAdData(Lcom/google/protobuf/ByteString;)V

    .line 1431
    .line 1432
    .line 1433
    invoke-virtual {v0}, Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse;->getAdDataVersion()I

    .line 1434
    .line 1435
    .line 1436
    move-result v0

    .line 1437
    invoke-virtual {v1, v0}, Lgatewayprotocol/v1/AdResponseKt$Dsl;->setAdDataVersion(I)V

    .line 1438
    .line 1439
    .line 1440
    :cond_16
    invoke-virtual {v1}, Lgatewayprotocol/v1/AdResponseKt$Dsl;->_build()Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;

    .line 1441
    .line 1442
    .line 1443
    move-result-object v0
    :try_end_22
    .catch Lcom/unity3d/ads/core/data/model/exception/UnityAdsNetworkException; {:try_start_22 .. :try_end_22} :catch_b

    .line 1444
    move-wide v1, v6

    .line 1445
    move-object v6, v12

    .line 1446
    move-wide v11, v1

    .line 1447
    move-object v1, v14

    .line 1448
    move-object v14, v4

    .line 1449
    move-object v4, v13

    .line 1450
    move v13, v3

    .line 1451
    goto/16 :goto_10

    .line 1452
    .line 1453
    :goto_22
    :try_start_23
    invoke-static {v14}, Lcom/unity3d/ads/core/domain/AndroidLoad;->access$getHandleGatewayAdResponse$p(Lcom/unity3d/ads/core/domain/AndroidLoad;)Lcom/unity3d/ads/core/domain/HandleGatewayAdResponse;

    .line 1454
    .line 1455
    .line 1456
    move-result-object v0

    .line 1457
    const-string v7, "response"

    .line 1458
    .line 1459
    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1460
    .line 1461
    .line 1462
    if-eqz v9, :cond_17

    .line 1463
    .line 1464
    const/4 v7, 0x1

    .line 1465
    goto :goto_23

    .line 1466
    :cond_17
    const/4 v7, 0x0

    .line 1467
    :goto_23
    iput-object v14, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$0:Ljava/lang/Object;

    .line 1468
    .line 1469
    iput-object v2, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$1:Ljava/lang/Object;

    .line 1470
    .line 1471
    const/4 v8, 0x0

    .line 1472
    iput-object v8, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$2:Ljava/lang/Object;

    .line 1473
    .line 1474
    iput-object v8, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$3:Ljava/lang/Object;

    .line 1475
    .line 1476
    iput-object v8, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$4:Ljava/lang/Object;

    .line 1477
    .line 1478
    iput-object v8, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$5:Ljava/lang/Object;

    .line 1479
    .line 1480
    iput-object v8, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$6:Ljava/lang/Object;

    .line 1481
    .line 1482
    iput-object v8, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$7:Ljava/lang/Object;

    .line 1483
    .line 1484
    iput-object v8, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->L$8:Ljava/lang/Object;

    .line 1485
    .line 1486
    iput v13, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->I$0:I

    .line 1487
    .line 1488
    iput-wide v11, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->J$0:J

    .line 1489
    .line 1490
    const/4 v8, 0x5

    .line 1491
    iput v8, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->label:I
    :try_end_23
    .catch Lcom/unity3d/ads/core/data/model/exception/UnityAdsNetworkException; {:try_start_23 .. :try_end_23} :catch_e

    .line 1492
    .line 1493
    const/4 v8, 0x0

    .line 1494
    move-object v9, v5

    .line 1495
    move-object v5, v15

    .line 1496
    :try_start_24
    invoke-interface/range {v0 .. v9}, Lcom/unity3d/ads/core/domain/HandleGatewayAdResponse;->invoke(Lcom/unity3d/ads/UnityAdsLoadOptions;Lcom/google/protobuf/ByteString;Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;Landroid/content/Context;Ljava/lang/String;Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;ZZLjf/c;)Ljava/lang/Object;

    .line 1497
    .line 1498
    .line 1499
    move-result-object v0
    :try_end_24
    .catch Lcom/unity3d/ads/core/data/model/exception/UnityAdsNetworkException; {:try_start_24 .. :try_end_24} :catch_d

    .line 1500
    move-object v5, v9

    .line 1501
    if-ne v0, v10, :cond_18

    .line 1502
    .line 1503
    :goto_24
    return-object v10

    .line 1504
    :cond_18
    move v3, v13

    .line 1505
    move-object v4, v14

    .line 1506
    :goto_25
    :try_start_25
    check-cast v0, Lcom/unity3d/ads/core/data/model/LoadResult;

    .line 1507
    .line 1508
    instance-of v1, v0, Lcom/unity3d/ads/core/data/model/LoadResult$Success;

    .line 1509
    .line 1510
    if-eqz v1, :cond_1a

    .line 1511
    .line 1512
    invoke-static {v4}, Lcom/unity3d/ads/core/domain/AndroidLoad;->access$getAdRepository$p(Lcom/unity3d/ads/core/domain/AndroidLoad;)Lcom/unity3d/ads/core/data/repository/AdRepository;

    .line 1513
    .line 1514
    .line 1515
    move-result-object v0

    .line 1516
    invoke-interface {v0, v2}, Lcom/unity3d/ads/core/data/repository/AdRepository;->getAd(Lcom/google/protobuf/ByteString;)Lcom/unity3d/ads/core/data/model/AdObject;

    .line 1517
    .line 1518
    .line 1519
    move-result-object v0

    .line 1520
    if-nez v0, :cond_19

    .line 1521
    .line 1522
    new-instance v13, Lcom/unity3d/ads/core/data/model/LoadResult$Failure;

    .line 1523
    .line 1524
    sget-object v14, Lgatewayprotocol/v1/ErrorOuterClass$PublicErrorCode;->PUBLIC_ERROR_CODE_UNSPECIFIED:Lgatewayprotocol/v1/ErrorOuterClass$PublicErrorCode;

    .line 1525
    .line 1526
    const-string v15, "[UnityAds] Ad not found"

    .line 1527
    .line 1528
    const-string v17, "ad_object_not_found"

    .line 1529
    .line 1530
    const/16 v18, 0x0

    .line 1531
    .line 1532
    const/16 v19, 0x0

    .line 1533
    .line 1534
    const/16 v20, 0x34

    .line 1535
    .line 1536
    const/16 v21, 0x0

    .line 1537
    .line 1538
    const/16 v16, 0x0

    .line 1539
    .line 1540
    invoke-direct/range {v13 .. v21}, Lcom/unity3d/ads/core/data/model/LoadResult$Failure;-><init>(Lgatewayprotocol/v1/ErrorOuterClass$PublicErrorCode;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1541
    .line 1542
    .line 1543
    move-object v0, v13

    .line 1544
    goto :goto_26

    .line 1545
    :catch_c
    move-exception v0

    .line 1546
    move-wide v1, v11

    .line 1547
    goto :goto_2b

    .line 1548
    :cond_19
    new-instance v1, Lcom/unity3d/ads/core/data/model/LoadResult$Success;

    .line 1549
    .line 1550
    invoke-direct {v1, v0}, Lcom/unity3d/ads/core/data/model/LoadResult$Success;-><init>(Lcom/unity3d/ads/core/data/model/AdObject;)V

    .line 1551
    .line 1552
    .line 1553
    move-object v0, v1

    .line 1554
    goto :goto_26

    .line 1555
    :cond_1a
    instance-of v1, v0, Lcom/unity3d/ads/core/data/model/LoadResult$Failure;

    .line 1556
    .line 1557
    if-eqz v1, :cond_1b

    .line 1558
    .line 1559
    :goto_26
    move-wide v13, v11

    .line 1560
    :goto_27
    move-object/from16 v28, v0

    .line 1561
    .line 1562
    move v7, v3

    .line 1563
    goto/16 :goto_3

    .line 1564
    .line 1565
    :cond_1b
    new-instance v0, LE5/Q;

    .line 1566
    .line 1567
    const/16 v1, 0x9

    .line 1568
    .line 1569
    const/4 v2, 0x0

    .line 1570
    invoke-direct {v0, v2, v1}, LE5/Q;-><init>(BI)V

    .line 1571
    .line 1572
    .line 1573
    throw v0
    :try_end_25
    .catch Lcom/unity3d/ads/core/data/model/exception/UnityAdsNetworkException; {:try_start_25 .. :try_end_25} :catch_c

    .line 1574
    :catch_d
    move-exception v0

    .line 1575
    move-object v5, v9

    .line 1576
    :goto_28
    move-wide v1, v11

    .line 1577
    move v3, v13

    .line 1578
    move-object v4, v14

    .line 1579
    goto :goto_2b

    .line 1580
    :catch_e
    move-exception v0

    .line 1581
    goto :goto_28

    .line 1582
    :catch_f
    move-exception v0

    .line 1583
    goto/16 :goto_5

    .line 1584
    .line 1585
    :catch_10
    move-exception v0

    .line 1586
    move/from16 v25, v20

    .line 1587
    .line 1588
    :goto_29
    move-object v4, v11

    .line 1589
    move-wide v1, v13

    .line 1590
    move/from16 v3, v25

    .line 1591
    .line 1592
    goto :goto_2b

    .line 1593
    :catch_11
    move-exception v0

    .line 1594
    move/from16 v25, v8

    .line 1595
    .line 1596
    goto :goto_29

    .line 1597
    :catch_12
    move-exception v0

    .line 1598
    move-object v5, v6

    .line 1599
    :goto_2a
    move v3, v7

    .line 1600
    move-wide v1, v13

    .line 1601
    goto/16 :goto_11

    .line 1602
    .line 1603
    :catch_13
    move-exception v0

    .line 1604
    goto :goto_2a

    .line 1605
    :catch_14
    move-exception v0

    .line 1606
    move-object/from16 v21, v9

    .line 1607
    .line 1608
    goto :goto_2a

    .line 1609
    :catch_15
    move-exception v0

    .line 1610
    move-object/from16 v21, v2

    .line 1611
    .line 1612
    goto :goto_2a

    .line 1613
    :catch_16
    move-exception v0

    .line 1614
    move-object/from16 v21, v4

    .line 1615
    .line 1616
    goto/16 :goto_4

    .line 1617
    .line 1618
    :goto_2b
    invoke-static {v4, v0}, Lcom/unity3d/ads/core/domain/AndroidLoad;->access$handleGatewayException(Lcom/unity3d/ads/core/domain/AndroidLoad;Lcom/unity3d/ads/core/data/model/exception/UnityAdsNetworkException;)Lcom/unity3d/ads/core/data/model/LoadResult$Failure;

    .line 1619
    .line 1620
    .line 1621
    move-result-object v0

    .line 1622
    move-wide v13, v1

    .line 1623
    goto :goto_27

    .line 1624
    :goto_2c
    if-nez v7, :cond_1d

    .line 1625
    .line 1626
    iget-object v1, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->this$0:Lcom/unity3d/ads/core/domain/AndroidLoad;

    .line 1627
    .line 1628
    invoke-static {v1}, Lcom/unity3d/ads/core/domain/AndroidLoad;->access$getSessionRepository$p(Lcom/unity3d/ads/core/domain/AndroidLoad;)Lcom/unity3d/ads/core/data/repository/SessionRepository;

    .line 1629
    .line 1630
    .line 1631
    move-result-object v1

    .line 1632
    new-instance v2, LCf/g;

    .line 1633
    .line 1634
    invoke-direct {v2, v13, v14}, LCf/g;-><init>(J)V

    .line 1635
    .line 1636
    .line 1637
    invoke-static {v2}, Lcom/unity3d/ads/core/extensions/TimeExtensionsKt;->elapsedMillis(LCf/f;)D

    .line 1638
    .line 1639
    .line 1640
    move-result-wide v2

    .line 1641
    double-to-int v2, v2

    .line 1642
    invoke-interface {v1, v2}, Lcom/unity3d/ads/core/data/repository/SessionRepository;->setLastLoadLatency(I)V

    .line 1643
    .line 1644
    .line 1645
    instance-of v1, v0, Lcom/unity3d/ads/core/data/model/LoadResult$Success;

    .line 1646
    .line 1647
    if-eqz v1, :cond_1c

    .line 1648
    .line 1649
    iget-object v1, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->this$0:Lcom/unity3d/ads/core/domain/AndroidLoad;

    .line 1650
    .line 1651
    invoke-static {v1}, Lcom/unity3d/ads/core/domain/AndroidLoad;->access$getSessionRepository$p(Lcom/unity3d/ads/core/domain/AndroidLoad;)Lcom/unity3d/ads/core/data/repository/SessionRepository;

    .line 1652
    .line 1653
    .line 1654
    move-result-object v1

    .line 1655
    invoke-interface {v1}, Lcom/unity3d/ads/core/data/repository/SessionRepository;->incrementSuccessCount()V

    .line 1656
    .line 1657
    .line 1658
    goto :goto_2d

    .line 1659
    :cond_1c
    instance-of v1, v0, Lcom/unity3d/ads/core/data/model/LoadResult$Failure;

    .line 1660
    .line 1661
    if-eqz v1, :cond_1d

    .line 1662
    .line 1663
    iget-object v1, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->this$0:Lcom/unity3d/ads/core/domain/AndroidLoad;

    .line 1664
    .line 1665
    invoke-static {v1}, Lcom/unity3d/ads/core/domain/AndroidLoad;->access$getSessionRepository$p(Lcom/unity3d/ads/core/domain/AndroidLoad;)Lcom/unity3d/ads/core/data/repository/SessionRepository;

    .line 1666
    .line 1667
    .line 1668
    move-result-object v1

    .line 1669
    invoke-interface {v1}, Lcom/unity3d/ads/core/data/repository/SessionRepository;->incrementAllErrorsCount()V

    .line 1670
    .line 1671
    .line 1672
    iget-object v1, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->this$0:Lcom/unity3d/ads/core/domain/AndroidLoad;

    .line 1673
    .line 1674
    move-object v2, v0

    .line 1675
    check-cast v2, Lcom/unity3d/ads/core/data/model/LoadResult$Failure;

    .line 1676
    .line 1677
    invoke-static {v1, v2}, Lcom/unity3d/ads/core/domain/AndroidLoad;->access$isCachePhaseFailure(Lcom/unity3d/ads/core/domain/AndroidLoad;Lcom/unity3d/ads/core/data/model/LoadResult$Failure;)Z

    .line 1678
    .line 1679
    .line 1680
    move-result v1

    .line 1681
    if-eqz v1, :cond_1d

    .line 1682
    .line 1683
    iget-object v1, v5, Lcom/unity3d/ads/core/domain/AndroidLoad$invoke$2;->this$0:Lcom/unity3d/ads/core/domain/AndroidLoad;

    .line 1684
    .line 1685
    invoke-static {v1}, Lcom/unity3d/ads/core/domain/AndroidLoad;->access$getSessionRepository$p(Lcom/unity3d/ads/core/domain/AndroidLoad;)Lcom/unity3d/ads/core/data/repository/SessionRepository;

    .line 1686
    .line 1687
    .line 1688
    move-result-object v1

    .line 1689
    invoke-interface {v1}, Lcom/unity3d/ads/core/data/repository/SessionRepository;->incrementCacheTimeoutErrorsCount()V

    .line 1690
    .line 1691
    .line 1692
    :cond_1d
    :goto_2d
    return-object v0
.end method
