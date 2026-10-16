.class public final Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/unity3d/services/core/di/IServiceComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005\u00a2\u0006\u0002\u0010\u0002J>\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u00060\u00042\u0006\u0010\u0008\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u000cH\u0086\u0002\u00f8\u0001\u0000\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;",
        "Lcom/unity3d/services/core/di/IServiceComponent;",
        "()V",
        "invoke",
        "",
        "",
        "Lkotlin/Function0;",
        "Lcom/unity3d/ads/adplayer/ExposedFunction;",
        "adData",
        "adDataRefreshToken",
        "impressionConfig",
        "adObject",
        "Lcom/unity3d/ads/core/data/model/AdObject;",
        "Companion",
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


# static fields
.field public static final Companion:Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final KEY_ACTION:Ljava/lang/String; = "action"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final KEY_AD_DATA:Ljava/lang/String; = "adData"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final KEY_AD_DATA_REFRESH_TOKEN:Ljava/lang/String; = "adDataRefreshToken"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final KEY_AD_REFRESH_INVALIDATION_REASON:Ljava/lang/String; = "invalidationReason"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final KEY_AD_STRING:Ljava/lang/String; = "adString"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final KEY_AD_TYPE:Ljava/lang/String; = "type"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final KEY_AD_UNIT_ID:Ljava/lang/String; = "adUnitId"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final KEY_DOWNLOAD_PRIORITY:Ljava/lang/String; = "priority"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final KEY_DOWNLOAD_URL:Ljava/lang/String; = "url"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final KEY_EXTRAS:Ljava/lang/String; = "extras"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final KEY_IMPRESSION_CONFIG:Ljava/lang/String; = "impressionConfig"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final KEY_IMPRESSION_OPPORTUNITY_ID:Ljava/lang/String; = "impressionOpportunityId"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final KEY_IS_HEADER_BIDDING:Ljava/lang/String; = "isHeaderBidding"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final KEY_LOAD_OPTIONS:Ljava/lang/String; = "loadOptions"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final KEY_NATIVE_CONTEXT:Ljava/lang/String; = "nativeContext"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final KEY_OMID:Ljava/lang/String; = "openMeasurement"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final KEY_OMJS_SERVICE:Ljava/lang/String; = "serviceFilePath"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final KEY_OMJS_SESSION:Ljava/lang/String; = "sessionFilePath"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final KEY_OM_PARTNER:Ljava/lang/String; = "partnerName"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final KEY_OM_PARTNER_VERSION:Ljava/lang/String; = "partnerVersion"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final KEY_OM_VERSION:Ljava/lang/String; = "version"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final KEY_PACKAGE_NAME:Ljava/lang/String; = "packageName"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final KEY_PLACEMENT_ID:Ljava/lang/String; = "placementId"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final KEY_PLACEMENT_NAME:Ljava/lang/String; = "placementName"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final KEY_PRIVACY_UPDATE_CONTENT:Ljava/lang/String; = "content"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final KEY_PRIVACY_UPDATE_VERSION:Ljava/lang/String; = "version"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final KEY_QUERY_ID:Ljava/lang/String; = "queryId"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final KEY_TRACKING_TOKEN:Ljava/lang/String; = "trackingToken"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final KEY_USE_ACTIVITY_FOR_RESULT:Ljava/lang/String; = "useActivityForResult"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final KEY_VIDEO_LENGTH:Ljava/lang/String; = "videoLength"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;->Companion:Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$Companion;

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
.method public getServiceProvider()Lcom/unity3d/services/core/di/IServiceProvider;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/unity3d/services/core/di/IServiceComponent$DefaultImpls;->getServiceProvider(Lcom/unity3d/services/core/di/IServiceComponent;)Lcom/unity3d/services/core/di/IServiceProvider;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final invoke(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/ads/core/data/model/AdObject;)Ljava/util/Map;
    .locals 53
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/unity3d/ads/core/data/model/AdObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/unity3d/ads/core/data/model/AdObject;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ltf/a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    move-object/from16 v5, p4

    .line 2
    .line 3
    const-string v0, "adData"

    .line 4
    .line 5
    move-object/from16 v1, p1

    .line 6
    .line 7
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v0, "adDataRefreshToken"

    .line 11
    .line 12
    move-object/from16 v2, p2

    .line 13
    .line 14
    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-string v0, "impressionConfig"

    .line 18
    .line 19
    move-object/from16 v3, p3

    .line 20
    .line 21
    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const-string v0, "adObject"

    .line 25
    .line 26
    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-static {v1}, Lcom/unity3d/ads/core/data/model/AdData;->constructor-impl(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v3}, Lcom/unity3d/ads/core/data/model/ImpressionConfig;->constructor-impl(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-static {v2}, Lcom/unity3d/ads/core/data/model/AdDataRefreshToken;->constructor-impl(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    move-object v2, v0

    .line 42
    new-instance v0, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$1;

    .line 43
    .line 44
    move-object/from16 v1, p0

    .line 45
    .line 46
    invoke-direct/range {v0 .. v5}, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$1;-><init>(Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/ads/core/data/model/AdObject;)V

    .line 47
    .line 48
    .line 49
    new-instance v2, Lef/k;

    .line 50
    .line 51
    const-string v3, "com.unity3d.services.ads.api.AdViewer.getAdContext"

    .line 52
    .line 53
    invoke-direct {v2, v3, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    new-instance v0, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$2;

    .line 57
    .line 58
    invoke-direct {v0, v1}, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$2;-><init>(Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;)V

    .line 59
    .line 60
    .line 61
    new-instance v3, Lef/k;

    .line 62
    .line 63
    const-string v4, "com.unity3d.services.core.api.DeviceInfo.getConnectionType"

    .line 64
    .line 65
    invoke-direct {v3, v4, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    new-instance v0, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$3;

    .line 69
    .line 70
    invoke-direct {v0, v1}, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$3;-><init>(Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;)V

    .line 71
    .line 72
    .line 73
    new-instance v4, Lef/k;

    .line 74
    .line 75
    const-string v6, "com.unity3d.services.core.api.DeviceInfo.getDeviceVolume"

    .line 76
    .line 77
    invoke-direct {v4, v6, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    new-instance v0, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$4;

    .line 81
    .line 82
    invoke-direct {v0, v1}, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$4;-><init>(Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;)V

    .line 83
    .line 84
    .line 85
    new-instance v6, Lef/k;

    .line 86
    .line 87
    const-string v7, "com.unity3d.services.core.api.DeviceInfo.getDeviceMaxVolume"

    .line 88
    .line 89
    invoke-direct {v6, v7, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    new-instance v0, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$5;

    .line 93
    .line 94
    invoke-direct {v0, v1}, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$5;-><init>(Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;)V

    .line 95
    .line 96
    .line 97
    new-instance v7, Lef/k;

    .line 98
    .line 99
    const-string v8, "com.unity3d.services.core.api.DeviceInfo.getScreenHeight"

    .line 100
    .line 101
    invoke-direct {v7, v8, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    new-instance v0, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$6;

    .line 105
    .line 106
    invoke-direct {v0, v1}, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$6;-><init>(Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;)V

    .line 107
    .line 108
    .line 109
    new-instance v8, Lef/k;

    .line 110
    .line 111
    const-string v9, "com.unity3d.services.core.api.DeviceInfo.getScreenWidth"

    .line 112
    .line 113
    invoke-direct {v8, v9, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    new-instance v0, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$7;

    .line 117
    .line 118
    invoke-direct {v0, v5, v1}, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$7;-><init>(Lcom/unity3d/ads/core/data/model/AdObject;Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;)V

    .line 119
    .line 120
    .line 121
    new-instance v9, Lef/k;

    .line 122
    .line 123
    const-string v10, "com.unity3d.services.ads.api.AdViewer.openUrl"

    .line 124
    .line 125
    invoke-direct {v9, v10, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    new-instance v0, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$8;

    .line 129
    .line 130
    invoke-direct {v0, v5}, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$8;-><init>(Lcom/unity3d/ads/core/data/model/AdObject;)V

    .line 131
    .line 132
    .line 133
    new-instance v10, Lef/k;

    .line 134
    .line 135
    const-string v11, "com.unity3d.services.ads.api.AdViewer.setOrientation"

    .line 136
    .line 137
    invoke-direct {v10, v11, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    new-instance v0, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$9;

    .line 141
    .line 142
    invoke-direct {v0, v1, v5}, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$9;-><init>(Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;Lcom/unity3d/ads/core/data/model/AdObject;)V

    .line 143
    .line 144
    .line 145
    new-instance v11, Lef/k;

    .line 146
    .line 147
    const-string v12, "com.unity3d.services.ads.api.AdViewer.sendOperativeEvent"

    .line 148
    .line 149
    invoke-direct {v11, v12, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    sget-object v0, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$10;->INSTANCE:Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$10;

    .line 153
    .line 154
    new-instance v12, Lef/k;

    .line 155
    .line 156
    const-string v13, "com.unity3d.services.core.api.Storage.write"

    .line 157
    .line 158
    invoke-direct {v12, v13, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    sget-object v0, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$11;->INSTANCE:Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$11;

    .line 162
    .line 163
    new-instance v13, Lef/k;

    .line 164
    .line 165
    const-string v14, "com.unity3d.services.core.api.Storage.read"

    .line 166
    .line 167
    invoke-direct {v13, v14, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    sget-object v0, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$12;->INSTANCE:Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$12;

    .line 171
    .line 172
    new-instance v14, Lef/k;

    .line 173
    .line 174
    const-string v15, "com.unity3d.services.core.api.Storage.delete"

    .line 175
    .line 176
    invoke-direct {v14, v15, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    sget-object v0, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$13;->INSTANCE:Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$13;

    .line 180
    .line 181
    new-instance v15, Lef/k;

    .line 182
    .line 183
    move-object/from16 p1, v2

    .line 184
    .line 185
    const-string v2, "com.unity3d.services.core.api.Storage.clear"

    .line 186
    .line 187
    invoke-direct {v15, v2, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    sget-object v0, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$14;->INSTANCE:Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$14;

    .line 191
    .line 192
    new-instance v2, Lef/k;

    .line 193
    .line 194
    move-object/from16 p2, v3

    .line 195
    .line 196
    const-string v3, "com.unity3d.services.core.api.Storage.getKeys"

    .line 197
    .line 198
    invoke-direct {v2, v3, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    sget-object v0, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$15;->INSTANCE:Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$15;

    .line 202
    .line 203
    new-instance v3, Lef/k;

    .line 204
    .line 205
    move-object/from16 p3, v2

    .line 206
    .line 207
    const-string v2, "com.unity3d.services.core.api.Storage.get"

    .line 208
    .line 209
    invoke-direct {v3, v2, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    sget-object v0, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$16;->INSTANCE:Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$16;

    .line 213
    .line 214
    new-instance v2, Lef/k;

    .line 215
    .line 216
    move-object/from16 v16, v3

    .line 217
    .line 218
    const-string v3, "com.unity3d.services.core.api.Storage.set"

    .line 219
    .line 220
    invoke-direct {v2, v3, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    new-instance v0, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$17;

    .line 224
    .line 225
    invoke-direct {v0, v1}, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$17;-><init>(Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;)V

    .line 226
    .line 227
    .line 228
    new-instance v3, Lef/k;

    .line 229
    .line 230
    move-object/from16 v17, v2

    .line 231
    .line 232
    const-string v2, "com.unity3d.services.ads.api.AdViewer.getPrivacyFsm"

    .line 233
    .line 234
    invoke-direct {v3, v2, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    new-instance v0, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$18;

    .line 238
    .line 239
    invoke-direct {v0, v1}, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$18;-><init>(Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;)V

    .line 240
    .line 241
    .line 242
    new-instance v2, Lef/k;

    .line 243
    .line 244
    move-object/from16 v18, v3

    .line 245
    .line 246
    const-string v3, "com.unity3d.services.ads.api.AdViewer.setPrivacyFsm"

    .line 247
    .line 248
    invoke-direct {v2, v3, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    new-instance v0, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$19;

    .line 252
    .line 253
    invoke-direct {v0, v1}, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$19;-><init>(Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;)V

    .line 254
    .line 255
    .line 256
    new-instance v3, Lef/k;

    .line 257
    .line 258
    move-object/from16 v19, v2

    .line 259
    .line 260
    const-string v2, "com.unity3d.services.ads.api.AdViewer.getPrivacyPayload"

    .line 261
    .line 262
    invoke-direct {v3, v2, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    new-instance v0, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$20;

    .line 266
    .line 267
    invoke-direct {v0, v1}, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$20;-><init>(Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;)V

    .line 268
    .line 269
    .line 270
    new-instance v2, Lef/k;

    .line 271
    .line 272
    move-object/from16 v20, v3

    .line 273
    .line 274
    const-string v3, "com.unity3d.services.ads.api.AdViewer.setPrivacyPayload"

    .line 275
    .line 276
    invoke-direct {v2, v3, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    new-instance v0, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$21;

    .line 280
    .line 281
    invoke-direct {v0, v1}, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$21;-><init>(Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;)V

    .line 282
    .line 283
    .line 284
    new-instance v3, Lef/k;

    .line 285
    .line 286
    move-object/from16 v21, v2

    .line 287
    .line 288
    const-string v2, "com.unity3d.services.ads.api.AdViewer.getPrivacyAllowedPii"

    .line 289
    .line 290
    invoke-direct {v3, v2, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    new-instance v0, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$22;

    .line 294
    .line 295
    invoke-direct {v0, v1}, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$22;-><init>(Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;)V

    .line 296
    .line 297
    .line 298
    new-instance v2, Lef/k;

    .line 299
    .line 300
    move-object/from16 v22, v3

    .line 301
    .line 302
    const-string v3, "com.unity3d.services.ads.api.AdViewer.setPrivacyAllowedPii"

    .line 303
    .line 304
    invoke-direct {v2, v3, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 305
    .line 306
    .line 307
    new-instance v0, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$23;

    .line 308
    .line 309
    invoke-direct {v0, v1}, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$23;-><init>(Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;)V

    .line 310
    .line 311
    .line 312
    new-instance v3, Lef/k;

    .line 313
    .line 314
    move-object/from16 v23, v2

    .line 315
    .line 316
    const-string v2, "com.unity3d.services.ads.api.AdViewer.getSessionToken"

    .line 317
    .line 318
    invoke-direct {v3, v2, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 319
    .line 320
    .line 321
    new-instance v0, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$24;

    .line 322
    .line 323
    invoke-direct {v0, v1, v5}, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$24;-><init>(Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;Lcom/unity3d/ads/core/data/model/AdObject;)V

    .line 324
    .line 325
    .line 326
    new-instance v2, Lef/k;

    .line 327
    .line 328
    move-object/from16 v24, v3

    .line 329
    .line 330
    const-string v3, "com.unity3d.services.ads.api.AdViewer.markCampaignStateAsShown"

    .line 331
    .line 332
    invoke-direct {v2, v3, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 333
    .line 334
    .line 335
    new-instance v0, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$25;

    .line 336
    .line 337
    invoke-direct {v0, v1, v5}, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$25;-><init>(Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;Lcom/unity3d/ads/core/data/model/AdObject;)V

    .line 338
    .line 339
    .line 340
    new-instance v3, Lef/k;

    .line 341
    .line 342
    move-object/from16 v25, v2

    .line 343
    .line 344
    const-string v2, "com.unity3d.services.ads.api.AdViewer.refreshAdData"

    .line 345
    .line 346
    invoke-direct {v3, v2, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 347
    .line 348
    .line 349
    new-instance v0, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$26;

    .line 350
    .line 351
    invoke-direct {v0, v1, v5}, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$26;-><init>(Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;Lcom/unity3d/ads/core/data/model/AdObject;)V

    .line 352
    .line 353
    .line 354
    new-instance v2, Lef/k;

    .line 355
    .line 356
    move-object/from16 v26, v3

    .line 357
    .line 358
    const-string v3, "com.unity3d.services.ads.api.AdViewer.updateCampaignState"

    .line 359
    .line 360
    invoke-direct {v2, v3, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 361
    .line 362
    .line 363
    new-instance v0, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$27;

    .line 364
    .line 365
    invoke-direct {v0, v5}, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$27;-><init>(Lcom/unity3d/ads/core/data/model/AdObject;)V

    .line 366
    .line 367
    .line 368
    new-instance v3, Lef/k;

    .line 369
    .line 370
    move-object/from16 v27, v2

    .line 371
    .line 372
    const-string v2, "com.unity3d.services.ads.api.AdViewer.updateTrackingToken"

    .line 373
    .line 374
    invoke-direct {v3, v2, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 375
    .line 376
    .line 377
    new-instance v0, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$28;

    .line 378
    .line 379
    invoke-direct {v0, v1}, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$28;-><init>(Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;)V

    .line 380
    .line 381
    .line 382
    new-instance v2, Lef/k;

    .line 383
    .line 384
    move-object/from16 v28, v3

    .line 385
    .line 386
    const-string v3, "com.unity3d.services.ads.api.AdViewer.sendPrivacyUpdateRequest"

    .line 387
    .line 388
    invoke-direct {v2, v3, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 389
    .line 390
    .line 391
    new-instance v0, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$29;

    .line 392
    .line 393
    invoke-direct {v0, v1, v5}, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$29;-><init>(Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;Lcom/unity3d/ads/core/data/model/AdObject;)V

    .line 394
    .line 395
    .line 396
    new-instance v3, Lef/k;

    .line 397
    .line 398
    move-object/from16 v29, v2

    .line 399
    .line 400
    const-string v2, "com.unity3d.services.ads.api.AdViewer.sendDiagnosticEvent"

    .line 401
    .line 402
    invoke-direct {v3, v2, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 403
    .line 404
    .line 405
    new-instance v0, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$30;

    .line 406
    .line 407
    invoke-direct {v0, v1}, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$30;-><init>(Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;)V

    .line 408
    .line 409
    .line 410
    new-instance v2, Lef/k;

    .line 411
    .line 412
    move-object/from16 v30, v3

    .line 413
    .line 414
    const-string v3, "com.unity3d.services.ads.api.AdViewer.incrementBannerImpressionCount"

    .line 415
    .line 416
    invoke-direct {v2, v3, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 417
    .line 418
    .line 419
    new-instance v0, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$31;

    .line 420
    .line 421
    invoke-direct {v0, v1, v5}, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$31;-><init>(Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;Lcom/unity3d/ads/core/data/model/AdObject;)V

    .line 422
    .line 423
    .line 424
    new-instance v3, Lef/k;

    .line 425
    .line 426
    move-object/from16 v31, v2

    .line 427
    .line 428
    const-string v2, "com.unity3d.services.ads.api.AdViewer.download"

    .line 429
    .line 430
    invoke-direct {v3, v2, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 431
    .line 432
    .line 433
    new-instance v0, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$32;

    .line 434
    .line 435
    invoke-direct {v0, v1, v5}, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$32;-><init>(Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;Lcom/unity3d/ads/core/data/model/AdObject;)V

    .line 436
    .line 437
    .line 438
    new-instance v2, Lef/k;

    .line 439
    .line 440
    move-object/from16 v32, v3

    .line 441
    .line 442
    const-string v3, "com.unity3d.services.ads.api.AdViewer.downloadWithProgress"

    .line 443
    .line 444
    invoke-direct {v2, v3, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 445
    .line 446
    .line 447
    new-instance v0, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$33;

    .line 448
    .line 449
    invoke-direct {v0, v1}, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$33;-><init>(Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;)V

    .line 450
    .line 451
    .line 452
    new-instance v3, Lef/k;

    .line 453
    .line 454
    move-object/from16 v33, v2

    .line 455
    .line 456
    const-string v2, "com.unity3d.services.ads.api.AdViewer.isFileCached"

    .line 457
    .line 458
    invoke-direct {v3, v2, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 459
    .line 460
    .line 461
    new-instance v0, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$34;

    .line 462
    .line 463
    invoke-direct {v0, v1, v5}, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$34;-><init>(Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;Lcom/unity3d/ads/core/data/model/AdObject;)V

    .line 464
    .line 465
    .line 466
    new-instance v2, Lef/k;

    .line 467
    .line 468
    move-object/from16 v34, v3

    .line 469
    .line 470
    const-string v3, "com.unity3d.services.ads.api.AdViewer.omidStartSession"

    .line 471
    .line 472
    invoke-direct {v2, v3, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 473
    .line 474
    .line 475
    new-instance v0, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$35;

    .line 476
    .line 477
    invoke-direct {v0, v1, v5}, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$35;-><init>(Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;Lcom/unity3d/ads/core/data/model/AdObject;)V

    .line 478
    .line 479
    .line 480
    new-instance v3, Lef/k;

    .line 481
    .line 482
    move-object/from16 v35, v2

    .line 483
    .line 484
    const-string v2, "com.unity3d.services.ads.api.AdViewer.omidFinishSession"

    .line 485
    .line 486
    invoke-direct {v3, v2, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 487
    .line 488
    .line 489
    new-instance v0, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$36;

    .line 490
    .line 491
    invoke-direct {v0, v1, v5}, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$36;-><init>(Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;Lcom/unity3d/ads/core/data/model/AdObject;)V

    .line 492
    .line 493
    .line 494
    new-instance v2, Lef/k;

    .line 495
    .line 496
    move-object/from16 v36, v3

    .line 497
    .line 498
    const-string v3, "com.unity3d.services.ads.api.AdViewer.omidImpression"

    .line 499
    .line 500
    invoke-direct {v2, v3, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 501
    .line 502
    .line 503
    new-instance v0, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$37;

    .line 504
    .line 505
    invoke-direct {v0, v1}, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$37;-><init>(Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;)V

    .line 506
    .line 507
    .line 508
    new-instance v3, Lef/k;

    .line 509
    .line 510
    move-object/from16 v37, v2

    .line 511
    .line 512
    const-string v2, "com.unity3d.services.ads.api.AdViewer.omidGetData"

    .line 513
    .line 514
    invoke-direct {v3, v2, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 515
    .line 516
    .line 517
    new-instance v0, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$38;

    .line 518
    .line 519
    invoke-direct {v0, v1}, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$38;-><init>(Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;)V

    .line 520
    .line 521
    .line 522
    new-instance v2, Lef/k;

    .line 523
    .line 524
    move-object/from16 v38, v3

    .line 525
    .line 526
    const-string v3, "com.unity3d.services.ads.api.AdViewer.isAttributionAvailable"

    .line 527
    .line 528
    invoke-direct {v2, v3, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 529
    .line 530
    .line 531
    new-instance v0, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$39;

    .line 532
    .line 533
    invoke-direct {v0, v1, v5}, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$39;-><init>(Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;Lcom/unity3d/ads/core/data/model/AdObject;)V

    .line 534
    .line 535
    .line 536
    new-instance v3, Lef/k;

    .line 537
    .line 538
    move-object/from16 v39, v2

    .line 539
    .line 540
    const-string v2, "com.unity3d.services.ads.api.AdViewer.attributionRegisterView"

    .line 541
    .line 542
    invoke-direct {v3, v2, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 543
    .line 544
    .line 545
    new-instance v0, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$40;

    .line 546
    .line 547
    invoke-direct {v0, v1, v5}, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$40;-><init>(Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;Lcom/unity3d/ads/core/data/model/AdObject;)V

    .line 548
    .line 549
    .line 550
    new-instance v2, Lef/k;

    .line 551
    .line 552
    move-object/from16 v40, v3

    .line 553
    .line 554
    const-string v3, "com.unity3d.services.ads.api.AdViewer.attributionRegisterClick"

    .line 555
    .line 556
    invoke-direct {v2, v3, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 557
    .line 558
    .line 559
    new-instance v0, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$41;

    .line 560
    .line 561
    invoke-direct {v0, v1, v5}, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$41;-><init>(Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;Lcom/unity3d/ads/core/data/model/AdObject;)V

    .line 562
    .line 563
    .line 564
    new-instance v3, Lef/k;

    .line 565
    .line 566
    move-object/from16 v41, v2

    .line 567
    .line 568
    const-string v2, "com.unity3d.services.ads.api.AdViewer.loadScarAd"

    .line 569
    .line 570
    invoke-direct {v3, v2, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 571
    .line 572
    .line 573
    sget-object v0, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$42;->INSTANCE:Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$42;

    .line 574
    .line 575
    new-instance v2, Lef/k;

    .line 576
    .line 577
    move-object/from16 v42, v3

    .line 578
    .line 579
    const-string v3, "com.unity3d.services.ads.api.AdViewer.showScarAd"

    .line 580
    .line 581
    invoke-direct {v2, v3, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 582
    .line 583
    .line 584
    new-instance v0, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$43;

    .line 585
    .line 586
    invoke-direct {v0, v1, v5}, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$43;-><init>(Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;Lcom/unity3d/ads/core/data/model/AdObject;)V

    .line 587
    .line 588
    .line 589
    new-instance v3, Lef/k;

    .line 590
    .line 591
    move-object/from16 v43, v2

    .line 592
    .line 593
    const-string v2, "com.unity3d.services.ads.api.AdViewer.hbTokenIncrementWins"

    .line 594
    .line 595
    invoke-direct {v3, v2, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 596
    .line 597
    .line 598
    new-instance v0, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$44;

    .line 599
    .line 600
    invoke-direct {v0, v1}, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$44;-><init>(Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;)V

    .line 601
    .line 602
    .line 603
    new-instance v2, Lef/k;

    .line 604
    .line 605
    move-object/from16 v44, v3

    .line 606
    .line 607
    const-string v3, "com.unity3d.services.ads.api.AdViewer.hbTokenIncrementStarts"

    .line 608
    .line 609
    invoke-direct {v2, v3, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 610
    .line 611
    .line 612
    new-instance v0, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$45;

    .line 613
    .line 614
    invoke-direct {v0, v1}, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$45;-><init>(Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;)V

    .line 615
    .line 616
    .line 617
    new-instance v3, Lef/k;

    .line 618
    .line 619
    move-object/from16 v45, v2

    .line 620
    .line 621
    const-string v2, "com.unity3d.services.ads.api.AdViewer.hbTokenReset"

    .line 622
    .line 623
    invoke-direct {v3, v2, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 624
    .line 625
    .line 626
    new-instance v0, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$46;

    .line 627
    .line 628
    invoke-direct {v0, v1, v5}, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$46;-><init>(Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;Lcom/unity3d/ads/core/data/model/AdObject;)V

    .line 629
    .line 630
    .line 631
    new-instance v2, Lef/k;

    .line 632
    .line 633
    move-object/from16 v46, v3

    .line 634
    .line 635
    const-string v3, "com.unity3d.services.ads.api.AdViewer.loadOfferwallAd"

    .line 636
    .line 637
    invoke-direct {v2, v3, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 638
    .line 639
    .line 640
    sget-object v0, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$47;->INSTANCE:Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$47;

    .line 641
    .line 642
    new-instance v3, Lef/k;

    .line 643
    .line 644
    move-object/from16 v47, v2

    .line 645
    .line 646
    const-string v2, "com.unity3d.services.ads.api.AdViewer.showOfferwallAd"

    .line 647
    .line 648
    invoke-direct {v3, v2, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 649
    .line 650
    .line 651
    new-instance v0, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$48;

    .line 652
    .line 653
    invoke-direct {v0, v1}, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$48;-><init>(Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;)V

    .line 654
    .line 655
    .line 656
    new-instance v2, Lef/k;

    .line 657
    .line 658
    move-object/from16 v48, v3

    .line 659
    .line 660
    const-string v3, "com.unity3d.services.ads.api.AdViewer.isOfferwallAdReady"

    .line 661
    .line 662
    invoke-direct {v2, v3, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 663
    .line 664
    .line 665
    new-instance v0, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$49;

    .line 666
    .line 667
    invoke-direct {v0, v1}, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$49;-><init>(Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;)V

    .line 668
    .line 669
    .line 670
    new-instance v3, Lef/k;

    .line 671
    .line 672
    move-object/from16 v49, v2

    .line 673
    .line 674
    const-string v2, "com.unity3d.services.core.api.Request.get"

    .line 675
    .line 676
    invoke-direct {v3, v2, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 677
    .line 678
    .line 679
    new-instance v0, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$50;

    .line 680
    .line 681
    invoke-direct {v0, v1}, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$50;-><init>(Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;)V

    .line 682
    .line 683
    .line 684
    new-instance v2, Lef/k;

    .line 685
    .line 686
    move-object/from16 v50, v3

    .line 687
    .line 688
    const-string v3, "com.unity3d.services.core.api.Request.post"

    .line 689
    .line 690
    invoke-direct {v2, v3, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 691
    .line 692
    .line 693
    new-instance v0, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$51;

    .line 694
    .line 695
    invoke-direct {v0, v1}, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$51;-><init>(Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;)V

    .line 696
    .line 697
    .line 698
    new-instance v3, Lef/k;

    .line 699
    .line 700
    move-object/from16 v51, v2

    .line 701
    .line 702
    const-string v2, "com.unity3d.services.core.api.Request.head"

    .line 703
    .line 704
    invoke-direct {v3, v2, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 705
    .line 706
    .line 707
    new-instance v0, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$52;

    .line 708
    .line 709
    invoke-direct {v0, v5}, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$52;-><init>(Lcom/unity3d/ads/core/data/model/AdObject;)V

    .line 710
    .line 711
    .line 712
    new-instance v2, Lef/k;

    .line 713
    .line 714
    move-object/from16 v52, v3

    .line 715
    .line 716
    const-string v3, "com.unity3d.services.ads.api.AdViewer.setOpportunityTTL"

    .line 717
    .line 718
    invoke-direct {v2, v3, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 719
    .line 720
    .line 721
    new-instance v0, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$53;

    .line 722
    .line 723
    invoke-direct {v0, v1, v5}, Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer$invoke$53;-><init>(Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;Lcom/unity3d/ads/core/data/model/AdObject;)V

    .line 724
    .line 725
    .line 726
    new-instance v3, Lef/k;

    .line 727
    .line 728
    const-string v5, "com.unity3d.services.ads.api.AdViewer.getExtra"

    .line 729
    .line 730
    invoke-direct {v3, v5, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 731
    .line 732
    .line 733
    const/16 v0, 0x35

    .line 734
    .line 735
    new-array v0, v0, [Lef/k;

    .line 736
    .line 737
    const/4 v5, 0x0

    .line 738
    aput-object p1, v0, v5

    .line 739
    .line 740
    const/4 v5, 0x1

    .line 741
    aput-object p2, v0, v5

    .line 742
    .line 743
    const/4 v5, 0x2

    .line 744
    aput-object v4, v0, v5

    .line 745
    .line 746
    const/4 v4, 0x3

    .line 747
    aput-object v6, v0, v4

    .line 748
    .line 749
    const/4 v4, 0x4

    .line 750
    aput-object v7, v0, v4

    .line 751
    .line 752
    const/4 v4, 0x5

    .line 753
    aput-object v8, v0, v4

    .line 754
    .line 755
    const/4 v4, 0x6

    .line 756
    aput-object v9, v0, v4

    .line 757
    .line 758
    const/4 v4, 0x7

    .line 759
    aput-object v10, v0, v4

    .line 760
    .line 761
    const/16 v4, 0x8

    .line 762
    .line 763
    aput-object v11, v0, v4

    .line 764
    .line 765
    const/16 v4, 0x9

    .line 766
    .line 767
    aput-object v12, v0, v4

    .line 768
    .line 769
    const/16 v4, 0xa

    .line 770
    .line 771
    aput-object v13, v0, v4

    .line 772
    .line 773
    const/16 v4, 0xb

    .line 774
    .line 775
    aput-object v14, v0, v4

    .line 776
    .line 777
    const/16 v4, 0xc

    .line 778
    .line 779
    aput-object v15, v0, v4

    .line 780
    .line 781
    const/16 v4, 0xd

    .line 782
    .line 783
    aput-object p3, v0, v4

    .line 784
    .line 785
    const/16 v4, 0xe

    .line 786
    .line 787
    aput-object v16, v0, v4

    .line 788
    .line 789
    const/16 v4, 0xf

    .line 790
    .line 791
    aput-object v17, v0, v4

    .line 792
    .line 793
    const/16 v4, 0x10

    .line 794
    .line 795
    aput-object v18, v0, v4

    .line 796
    .line 797
    const/16 v4, 0x11

    .line 798
    .line 799
    aput-object v19, v0, v4

    .line 800
    .line 801
    const/16 v4, 0x12

    .line 802
    .line 803
    aput-object v20, v0, v4

    .line 804
    .line 805
    const/16 v4, 0x13

    .line 806
    .line 807
    aput-object v21, v0, v4

    .line 808
    .line 809
    const/16 v4, 0x14

    .line 810
    .line 811
    aput-object v22, v0, v4

    .line 812
    .line 813
    const/16 v4, 0x15

    .line 814
    .line 815
    aput-object v23, v0, v4

    .line 816
    .line 817
    const/16 v4, 0x16

    .line 818
    .line 819
    aput-object v24, v0, v4

    .line 820
    .line 821
    const/16 v4, 0x17

    .line 822
    .line 823
    aput-object v25, v0, v4

    .line 824
    .line 825
    const/16 v4, 0x18

    .line 826
    .line 827
    aput-object v26, v0, v4

    .line 828
    .line 829
    const/16 v4, 0x19

    .line 830
    .line 831
    aput-object v27, v0, v4

    .line 832
    .line 833
    const/16 v4, 0x1a

    .line 834
    .line 835
    aput-object v28, v0, v4

    .line 836
    .line 837
    const/16 v4, 0x1b

    .line 838
    .line 839
    aput-object v29, v0, v4

    .line 840
    .line 841
    const/16 v4, 0x1c

    .line 842
    .line 843
    aput-object v30, v0, v4

    .line 844
    .line 845
    const/16 v4, 0x1d

    .line 846
    .line 847
    aput-object v31, v0, v4

    .line 848
    .line 849
    const/16 v4, 0x1e

    .line 850
    .line 851
    aput-object v32, v0, v4

    .line 852
    .line 853
    const/16 v4, 0x1f

    .line 854
    .line 855
    aput-object v33, v0, v4

    .line 856
    .line 857
    const/16 v4, 0x20

    .line 858
    .line 859
    aput-object v34, v0, v4

    .line 860
    .line 861
    const/16 v4, 0x21

    .line 862
    .line 863
    aput-object v35, v0, v4

    .line 864
    .line 865
    const/16 v4, 0x22

    .line 866
    .line 867
    aput-object v36, v0, v4

    .line 868
    .line 869
    const/16 v4, 0x23

    .line 870
    .line 871
    aput-object v37, v0, v4

    .line 872
    .line 873
    const/16 v4, 0x24

    .line 874
    .line 875
    aput-object v38, v0, v4

    .line 876
    .line 877
    const/16 v4, 0x25

    .line 878
    .line 879
    aput-object v39, v0, v4

    .line 880
    .line 881
    const/16 v4, 0x26

    .line 882
    .line 883
    aput-object v40, v0, v4

    .line 884
    .line 885
    const/16 v4, 0x27

    .line 886
    .line 887
    aput-object v41, v0, v4

    .line 888
    .line 889
    const/16 v4, 0x28

    .line 890
    .line 891
    aput-object v42, v0, v4

    .line 892
    .line 893
    const/16 v4, 0x29

    .line 894
    .line 895
    aput-object v43, v0, v4

    .line 896
    .line 897
    const/16 v4, 0x2a

    .line 898
    .line 899
    aput-object v44, v0, v4

    .line 900
    .line 901
    const/16 v4, 0x2b

    .line 902
    .line 903
    aput-object v45, v0, v4

    .line 904
    .line 905
    const/16 v4, 0x2c

    .line 906
    .line 907
    aput-object v46, v0, v4

    .line 908
    .line 909
    const/16 v4, 0x2d

    .line 910
    .line 911
    aput-object v47, v0, v4

    .line 912
    .line 913
    const/16 v4, 0x2e

    .line 914
    .line 915
    aput-object v48, v0, v4

    .line 916
    .line 917
    const/16 v4, 0x2f

    .line 918
    .line 919
    aput-object v49, v0, v4

    .line 920
    .line 921
    const/16 v4, 0x30

    .line 922
    .line 923
    aput-object v50, v0, v4

    .line 924
    .line 925
    const/16 v4, 0x31

    .line 926
    .line 927
    aput-object v51, v0, v4

    .line 928
    .line 929
    const/16 v4, 0x32

    .line 930
    .line 931
    aput-object v52, v0, v4

    .line 932
    .line 933
    const/16 v4, 0x33

    .line 934
    .line 935
    aput-object v2, v0, v4

    .line 936
    .line 937
    const/16 v2, 0x34

    .line 938
    .line 939
    aput-object v3, v0, v2

    .line 940
    .line 941
    invoke-static {v0}, Lff/A;->R([Lef/k;)Ljava/util/Map;

    .line 942
    .line 943
    .line 944
    move-result-object v0

    .line 945
    return-object v0
.end method
