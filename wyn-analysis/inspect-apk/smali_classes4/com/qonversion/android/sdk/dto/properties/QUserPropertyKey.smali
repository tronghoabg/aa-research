.class public final enum Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0015\u0008\u0086\u0081\u0002\u0018\u0000 \u00172\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0017B\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;",
        "",
        "userPropertyCode",
        "",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getUserPropertyCode",
        "()Ljava/lang/String;",
        "Email",
        "Name",
        "KochavaDeviceId",
        "AppsFlyerUserId",
        "AdjustAdId",
        "CustomUserId",
        "FacebookAttribution",
        "FirebaseAppInstanceId",
        "AppSetId",
        "AdvertisingId",
        "AppMetricaDeviceId",
        "AppMetricaUserProfileId",
        "PushWooshHwId",
        "PushWooshUserId",
        "TenjinAnalyticsInstallationId",
        "Custom",
        "Companion",
        "sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lmf/a;

.field private static final synthetic $VALUES:[Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

.field public static final enum AdjustAdId:Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

.field public static final enum AdvertisingId:Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

.field public static final enum AppMetricaDeviceId:Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

.field public static final enum AppMetricaUserProfileId:Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

.field public static final enum AppSetId:Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

.field public static final enum AppsFlyerUserId:Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

.field public static final Companion:Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final enum Custom:Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

.field public static final enum CustomUserId:Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

.field public static final enum Email:Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

.field public static final enum FacebookAttribution:Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

.field public static final enum FirebaseAppInstanceId:Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

.field public static final enum KochavaDeviceId:Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

.field public static final enum Name:Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

.field public static final enum PushWooshHwId:Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

.field public static final enum PushWooshUserId:Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

.field public static final enum TenjinAnalyticsInstallationId:Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;


# instance fields
.field private final userPropertyCode:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;
    .locals 3

    const/16 v0, 0x10

    new-array v0, v0, [Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    sget-object v1, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;->Email:Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;->Name:Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;->KochavaDeviceId:Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;->AppsFlyerUserId:Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;->AdjustAdId:Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;->CustomUserId:Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;->FacebookAttribution:Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;->FirebaseAppInstanceId:Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;->AppSetId:Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;->AdvertisingId:Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;->AppMetricaDeviceId:Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    const/16 v2, 0xa

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;->AppMetricaUserProfileId:Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    const/16 v2, 0xb

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;->PushWooshHwId:Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    const/16 v2, 0xc

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;->PushWooshUserId:Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    const/16 v2, 0xd

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;->TenjinAnalyticsInstallationId:Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    const/16 v2, 0xe

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;->Custom:Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    const/16 v2, 0xf

    aput-object v1, v0, v2

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    .line 2
    .line 3
    const-string v1, "_q_email"

    .line 4
    .line 5
    const-string v2, "Email"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v2, v3, v1}, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;->Email:Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    .line 12
    .line 13
    new-instance v0, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    .line 14
    .line 15
    const-string v1, "_q_name"

    .line 16
    .line 17
    const-string v2, "Name"

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    invoke-direct {v0, v2, v3, v1}, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;->Name:Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    .line 24
    .line 25
    new-instance v0, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    .line 26
    .line 27
    const-string v1, "_q_kochava_device_id"

    .line 28
    .line 29
    const-string v2, "KochavaDeviceId"

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    invoke-direct {v0, v2, v3, v1}, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;->KochavaDeviceId:Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    .line 36
    .line 37
    new-instance v0, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    .line 38
    .line 39
    const-string v1, "_q_appsflyer_user_id"

    .line 40
    .line 41
    const-string v2, "AppsFlyerUserId"

    .line 42
    .line 43
    const/4 v3, 0x3

    .line 44
    invoke-direct {v0, v2, v3, v1}, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;->AppsFlyerUserId:Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    .line 48
    .line 49
    new-instance v0, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    .line 50
    .line 51
    const-string v1, "_q_adjust_adid"

    .line 52
    .line 53
    const-string v2, "AdjustAdId"

    .line 54
    .line 55
    const/4 v3, 0x4

    .line 56
    invoke-direct {v0, v2, v3, v1}, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sput-object v0, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;->AdjustAdId:Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    .line 60
    .line 61
    new-instance v0, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    .line 62
    .line 63
    const-string v1, "_q_custom_user_id"

    .line 64
    .line 65
    const-string v2, "CustomUserId"

    .line 66
    .line 67
    const/4 v3, 0x5

    .line 68
    invoke-direct {v0, v2, v3, v1}, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 69
    .line 70
    .line 71
    sput-object v0, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;->CustomUserId:Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    .line 72
    .line 73
    new-instance v0, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    .line 74
    .line 75
    const-string v1, "_q_fb_attribution"

    .line 76
    .line 77
    const-string v2, "FacebookAttribution"

    .line 78
    .line 79
    const/4 v3, 0x6

    .line 80
    invoke-direct {v0, v2, v3, v1}, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 81
    .line 82
    .line 83
    sput-object v0, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;->FacebookAttribution:Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    .line 84
    .line 85
    new-instance v0, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    .line 86
    .line 87
    const-string v1, "_q_firebase_instance_id"

    .line 88
    .line 89
    const-string v2, "FirebaseAppInstanceId"

    .line 90
    .line 91
    const/4 v3, 0x7

    .line 92
    invoke-direct {v0, v2, v3, v1}, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 93
    .line 94
    .line 95
    sput-object v0, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;->FirebaseAppInstanceId:Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    .line 96
    .line 97
    new-instance v0, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    .line 98
    .line 99
    const-string v1, "_q_app_set_id"

    .line 100
    .line 101
    const-string v2, "AppSetId"

    .line 102
    .line 103
    const/16 v3, 0x8

    .line 104
    .line 105
    invoke-direct {v0, v2, v3, v1}, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 106
    .line 107
    .line 108
    sput-object v0, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;->AppSetId:Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    .line 109
    .line 110
    new-instance v0, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    .line 111
    .line 112
    const-string v1, "_q_advertising_id"

    .line 113
    .line 114
    const-string v2, "AdvertisingId"

    .line 115
    .line 116
    const/16 v3, 0x9

    .line 117
    .line 118
    invoke-direct {v0, v2, v3, v1}, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 119
    .line 120
    .line 121
    sput-object v0, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;->AdvertisingId:Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    .line 122
    .line 123
    new-instance v0, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    .line 124
    .line 125
    const-string v1, "_q_appmetrica_device_id"

    .line 126
    .line 127
    const-string v2, "AppMetricaDeviceId"

    .line 128
    .line 129
    const/16 v3, 0xa

    .line 130
    .line 131
    invoke-direct {v0, v2, v3, v1}, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 132
    .line 133
    .line 134
    sput-object v0, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;->AppMetricaDeviceId:Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    .line 135
    .line 136
    new-instance v0, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    .line 137
    .line 138
    const-string v1, "_q_appmetrica_user_profile_id"

    .line 139
    .line 140
    const-string v2, "AppMetricaUserProfileId"

    .line 141
    .line 142
    const/16 v3, 0xb

    .line 143
    .line 144
    invoke-direct {v0, v2, v3, v1}, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 145
    .line 146
    .line 147
    sput-object v0, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;->AppMetricaUserProfileId:Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    .line 148
    .line 149
    new-instance v0, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    .line 150
    .line 151
    const-string v1, "_q_pushwoosh_hwid"

    .line 152
    .line 153
    const-string v2, "PushWooshHwId"

    .line 154
    .line 155
    const/16 v3, 0xc

    .line 156
    .line 157
    invoke-direct {v0, v2, v3, v1}, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 158
    .line 159
    .line 160
    sput-object v0, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;->PushWooshHwId:Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    .line 161
    .line 162
    new-instance v0, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    .line 163
    .line 164
    const-string v1, "_q_pushwoosh_user_id"

    .line 165
    .line 166
    const-string v2, "PushWooshUserId"

    .line 167
    .line 168
    const/16 v3, 0xd

    .line 169
    .line 170
    invoke-direct {v0, v2, v3, v1}, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 171
    .line 172
    .line 173
    sput-object v0, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;->PushWooshUserId:Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    .line 174
    .line 175
    new-instance v0, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    .line 176
    .line 177
    const-string v1, "_q_tenjin_aiid"

    .line 178
    .line 179
    const-string v2, "TenjinAnalyticsInstallationId"

    .line 180
    .line 181
    const/16 v3, 0xe

    .line 182
    .line 183
    invoke-direct {v0, v2, v3, v1}, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 184
    .line 185
    .line 186
    sput-object v0, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;->TenjinAnalyticsInstallationId:Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    .line 187
    .line 188
    new-instance v0, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    .line 189
    .line 190
    const-string v1, ""

    .line 191
    .line 192
    const-string v2, "Custom"

    .line 193
    .line 194
    const/16 v3, 0xf

    .line 195
    .line 196
    invoke-direct {v0, v2, v3, v1}, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 197
    .line 198
    .line 199
    sput-object v0, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;->Custom:Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    .line 200
    .line 201
    invoke-static {}, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;->$values()[Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    sput-object v0, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;->$VALUES:[Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    .line 206
    .line 207
    invoke-static {v0}, Lic/d;->t([Ljava/lang/Enum;)Lmf/b;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    sput-object v0, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;->$ENTRIES:Lmf/a;

    .line 212
    .line 213
    new-instance v0, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey$Companion;

    .line 214
    .line 215
    const/4 v1, 0x0

    .line 216
    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 217
    .line 218
    .line 219
    sput-object v0, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;->Companion:Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey$Companion;

    .line 220
    .line 221
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;->userPropertyCode:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static getEntries()Lmf/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lmf/a;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;->$ENTRIES:Lmf/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;
    .locals 1

    const-class v0, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    return-object p0
.end method

.method public static values()[Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;
    .locals 1

    sget-object v0, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;->$VALUES:[Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    return-object v0
.end method


# virtual methods
.method public final getUserPropertyCode()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;->userPropertyCode:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
