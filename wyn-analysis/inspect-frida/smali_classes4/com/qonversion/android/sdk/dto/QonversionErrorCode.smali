.class public final enum Lcom/qonversion/android/sdk/dto/QonversionErrorCode;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/qonversion/android/sdk/dto/QonversionErrorCode;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u001d\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017j\u0002\u0008\u0018j\u0002\u0008\u0019j\u0002\u0008\u001aj\u0002\u0008\u001bj\u0002\u0008\u001cj\u0002\u0008\u001dj\u0002\u0008\u001ej\u0002\u0008\u001f\u00a8\u0006 "
    }
    d2 = {
        "Lcom/qonversion/android/sdk/dto/QonversionErrorCode;",
        "",
        "specification",
        "",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getSpecification",
        "()Ljava/lang/String;",
        "Unknown",
        "PlayStoreError",
        "BillingUnavailable",
        "PurchasePending",
        "PurchaseUnspecified",
        "PurchaseInvalid",
        "PurchaseCanceled",
        "ProductNotOwned",
        "ProductAlreadyOwned",
        "FeatureNotSupported",
        "StoreProductNotAvailable",
        "NetworkConnectionFailed",
        "ResponseParsingFailed",
        "BackendError",
        "ProductNotFound",
        "OfferingsNotFound",
        "LaunchError",
        "InvalidCredentials",
        "InvalidClientUid",
        "UnknownClientPlatform",
        "FraudPurchase",
        "ProjectConfigError",
        "InvalidStoreCredentials",
        "RemoteConfigurationNotAvailable",
        "ApiRateLimitExceeded",
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

.field private static final synthetic $VALUES:[Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

.field public static final enum ApiRateLimitExceeded:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

.field public static final enum BackendError:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

.field public static final enum BillingUnavailable:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

.field public static final enum FeatureNotSupported:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

.field public static final enum FraudPurchase:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

.field public static final enum InvalidClientUid:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

.field public static final enum InvalidCredentials:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

.field public static final enum InvalidStoreCredentials:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

.field public static final enum LaunchError:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

.field public static final enum NetworkConnectionFailed:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

.field public static final enum OfferingsNotFound:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

.field public static final enum PlayStoreError:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

.field public static final enum ProductAlreadyOwned:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

.field public static final enum ProductNotFound:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

.field public static final enum ProductNotOwned:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

.field public static final enum ProjectConfigError:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

.field public static final enum PurchaseCanceled:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

.field public static final enum PurchaseInvalid:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

.field public static final enum PurchasePending:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

.field public static final enum PurchaseUnspecified:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

.field public static final enum RemoteConfigurationNotAvailable:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

.field public static final enum ResponseParsingFailed:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

.field public static final enum StoreProductNotAvailable:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

.field public static final enum Unknown:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

.field public static final enum UnknownClientPlatform:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;


# instance fields
.field private final specification:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lcom/qonversion/android/sdk/dto/QonversionErrorCode;
    .locals 3

    const/16 v0, 0x19

    new-array v0, v0, [Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    sget-object v1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->Unknown:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->PlayStoreError:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->BillingUnavailable:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->PurchasePending:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->PurchaseUnspecified:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->PurchaseInvalid:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->PurchaseCanceled:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->ProductNotOwned:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->ProductAlreadyOwned:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->FeatureNotSupported:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->StoreProductNotAvailable:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/16 v2, 0xa

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->NetworkConnectionFailed:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/16 v2, 0xb

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->ResponseParsingFailed:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/16 v2, 0xc

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->BackendError:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/16 v2, 0xd

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->ProductNotFound:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/16 v2, 0xe

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->OfferingsNotFound:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/16 v2, 0xf

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->LaunchError:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/16 v2, 0x10

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->InvalidCredentials:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/16 v2, 0x11

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->InvalidClientUid:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/16 v2, 0x12

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->UnknownClientPlatform:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/16 v2, 0x13

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->FraudPurchase:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/16 v2, 0x14

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->ProjectConfigError:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/16 v2, 0x15

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->InvalidStoreCredentials:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/16 v2, 0x16

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->RemoteConfigurationNotAvailable:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/16 v2, 0x17

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->ApiRateLimitExceeded:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/16 v2, 0x18

    aput-object v1, v0, v2

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 2
    .line 3
    const-string v1, "Unknown error"

    .line 4
    .line 5
    const-string v2, "Unknown"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v2, v3, v1}, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->Unknown:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 12
    .line 13
    new-instance v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 14
    .line 15
    const-string v1, "There was an issue with the Play Store service"

    .line 16
    .line 17
    const-string v2, "PlayStoreError"

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    invoke-direct {v0, v2, v3, v1}, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->PlayStoreError:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 24
    .line 25
    new-instance v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 26
    .line 27
    const-string v1, "The Billing service is unavailable on the device"

    .line 28
    .line 29
    const-string v2, "BillingUnavailable"

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    invoke-direct {v0, v2, v3, v1}, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->BillingUnavailable:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 36
    .line 37
    new-instance v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 38
    .line 39
    const-string v1, "Purchase is pending"

    .line 40
    .line 41
    const-string v2, "PurchasePending"

    .line 42
    .line 43
    const/4 v3, 0x3

    .line 44
    invoke-direct {v0, v2, v3, v1}, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->PurchasePending:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 48
    .line 49
    new-instance v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 50
    .line 51
    const-string v1, "Unspecified state of the purchase"

    .line 52
    .line 53
    const-string v2, "PurchaseUnspecified"

    .line 54
    .line 55
    const/4 v3, 0x4

    .line 56
    invoke-direct {v0, v2, v3, v1}, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sput-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->PurchaseUnspecified:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 60
    .line 61
    new-instance v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 62
    .line 63
    const-string v1, "Failure of purchase"

    .line 64
    .line 65
    const-string v2, "PurchaseInvalid"

    .line 66
    .line 67
    const/4 v3, 0x5

    .line 68
    invoke-direct {v0, v2, v3, v1}, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 69
    .line 70
    .line 71
    sput-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->PurchaseInvalid:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 72
    .line 73
    new-instance v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 74
    .line 75
    const-string v1, "User pressed back or canceled a dialog for purchase"

    .line 76
    .line 77
    const-string v2, "PurchaseCanceled"

    .line 78
    .line 79
    const/4 v3, 0x6

    .line 80
    invoke-direct {v0, v2, v3, v1}, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 81
    .line 82
    .line 83
    sput-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->PurchaseCanceled:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 84
    .line 85
    new-instance v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 86
    .line 87
    const-string v1, "Failed to consume purchase since item is not owned"

    .line 88
    .line 89
    const-string v2, "ProductNotOwned"

    .line 90
    .line 91
    const/4 v3, 0x7

    .line 92
    invoke-direct {v0, v2, v3, v1}, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 93
    .line 94
    .line 95
    sput-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->ProductNotOwned:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 96
    .line 97
    new-instance v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 98
    .line 99
    const-string v1, "Failed to purchase since item is already owned"

    .line 100
    .line 101
    const-string v2, "ProductAlreadyOwned"

    .line 102
    .line 103
    const/16 v3, 0x8

    .line 104
    .line 105
    invoke-direct {v0, v2, v3, v1}, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 106
    .line 107
    .line 108
    sput-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->ProductAlreadyOwned:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 109
    .line 110
    new-instance v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 111
    .line 112
    const-string v1, "The requested feature is not supported"

    .line 113
    .line 114
    const-string v2, "FeatureNotSupported"

    .line 115
    .line 116
    const/16 v3, 0x9

    .line 117
    .line 118
    invoke-direct {v0, v2, v3, v1}, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 119
    .line 120
    .line 121
    sput-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->FeatureNotSupported:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 122
    .line 123
    new-instance v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 124
    .line 125
    const-string v1, "Requested product is not available for purchase or its product id was not found"

    .line 126
    .line 127
    const-string v2, "StoreProductNotAvailable"

    .line 128
    .line 129
    const/16 v3, 0xa

    .line 130
    .line 131
    invoke-direct {v0, v2, v3, v1}, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 132
    .line 133
    .line 134
    sput-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->StoreProductNotAvailable:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 135
    .line 136
    new-instance v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 137
    .line 138
    const-string v1, "There was a network issue. Please make sure that the Internet connection is available on the device"

    .line 139
    .line 140
    const-string v2, "NetworkConnectionFailed"

    .line 141
    .line 142
    const/16 v3, 0xb

    .line 143
    .line 144
    invoke-direct {v0, v2, v3, v1}, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 145
    .line 146
    .line 147
    sput-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->NetworkConnectionFailed:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 148
    .line 149
    new-instance v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 150
    .line 151
    const-string v1, "A problem occurred while serializing or deserializing data"

    .line 152
    .line 153
    const-string v2, "ResponseParsingFailed"

    .line 154
    .line 155
    const/16 v3, 0xc

    .line 156
    .line 157
    invoke-direct {v0, v2, v3, v1}, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 158
    .line 159
    .line 160
    sput-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->ResponseParsingFailed:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 161
    .line 162
    new-instance v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 163
    .line 164
    const-string v1, "There was a backend error"

    .line 165
    .line 166
    const-string v2, "BackendError"

    .line 167
    .line 168
    const/16 v3, 0xd

    .line 169
    .line 170
    invoke-direct {v0, v2, v3, v1}, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 171
    .line 172
    .line 173
    sput-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->BackendError:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 174
    .line 175
    new-instance v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 176
    .line 177
    const-string v1, "Failed to purchase since the Qonversion product was not found"

    .line 178
    .line 179
    const-string v2, "ProductNotFound"

    .line 180
    .line 181
    const/16 v3, 0xe

    .line 182
    .line 183
    invoke-direct {v0, v2, v3, v1}, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 184
    .line 185
    .line 186
    sput-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->ProductNotFound:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 187
    .line 188
    new-instance v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 189
    .line 190
    const-string v1, "No offerings found"

    .line 191
    .line 192
    const-string v2, "OfferingsNotFound"

    .line 193
    .line 194
    const/16 v3, 0xf

    .line 195
    .line 196
    invoke-direct {v0, v2, v3, v1}, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 197
    .line 198
    .line 199
    sput-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->OfferingsNotFound:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 200
    .line 201
    new-instance v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 202
    .line 203
    const-string v1, "There was an error while launching Qonversion SDK"

    .line 204
    .line 205
    const-string v2, "LaunchError"

    .line 206
    .line 207
    const/16 v3, 0x10

    .line 208
    .line 209
    invoke-direct {v0, v2, v3, v1}, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 210
    .line 211
    .line 212
    sput-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->LaunchError:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 213
    .line 214
    new-instance v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 215
    .line 216
    const-string v1, "Access token is invalid or not set"

    .line 217
    .line 218
    const-string v2, "InvalidCredentials"

    .line 219
    .line 220
    const/16 v3, 0x11

    .line 221
    .line 222
    invoke-direct {v0, v2, v3, v1}, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 223
    .line 224
    .line 225
    sput-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->InvalidCredentials:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 226
    .line 227
    new-instance v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 228
    .line 229
    const-string v1, "Client Uid is invalid or not set"

    .line 230
    .line 231
    const-string v2, "InvalidClientUid"

    .line 232
    .line 233
    const/16 v3, 0x12

    .line 234
    .line 235
    invoke-direct {v0, v2, v3, v1}, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 236
    .line 237
    .line 238
    sput-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->InvalidClientUid:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 239
    .line 240
    new-instance v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 241
    .line 242
    const-string v1, "The current platform is not supported"

    .line 243
    .line 244
    const-string v2, "UnknownClientPlatform"

    .line 245
    .line 246
    const/16 v3, 0x13

    .line 247
    .line 248
    invoke-direct {v0, v2, v3, v1}, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 249
    .line 250
    .line 251
    sput-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->UnknownClientPlatform:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 252
    .line 253
    new-instance v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 254
    .line 255
    const-string v1, "Fraud purchase was detected"

    .line 256
    .line 257
    const-string v2, "FraudPurchase"

    .line 258
    .line 259
    const/16 v3, 0x14

    .line 260
    .line 261
    invoke-direct {v0, v2, v3, v1}, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 262
    .line 263
    .line 264
    sput-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->FraudPurchase:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 265
    .line 266
    new-instance v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 267
    .line 268
    const-string v1, "The project is not configured or configured incorrectly in the Qonversion Dashboard"

    .line 269
    .line 270
    const-string v2, "ProjectConfigError"

    .line 271
    .line 272
    const/16 v3, 0x15

    .line 273
    .line 274
    invoke-direct {v0, v2, v3, v1}, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 275
    .line 276
    .line 277
    sput-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->ProjectConfigError:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 278
    .line 279
    new-instance v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 280
    .line 281
    const-string v1, "This account does not have access to the requested application"

    .line 282
    .line 283
    const-string v2, "InvalidStoreCredentials"

    .line 284
    .line 285
    const/16 v3, 0x16

    .line 286
    .line 287
    invoke-direct {v0, v2, v3, v1}, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 288
    .line 289
    .line 290
    sput-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->InvalidStoreCredentials:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 291
    .line 292
    new-instance v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 293
    .line 294
    const-string v1, "Remote configuration is not available for the current user or for the provided context key"

    .line 295
    .line 296
    const-string v2, "RemoteConfigurationNotAvailable"

    .line 297
    .line 298
    const/16 v3, 0x17

    .line 299
    .line 300
    invoke-direct {v0, v2, v3, v1}, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 301
    .line 302
    .line 303
    sput-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->RemoteConfigurationNotAvailable:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 304
    .line 305
    new-instance v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 306
    .line 307
    const-string v1, "API requests rate limit exceeded"

    .line 308
    .line 309
    const-string v2, "ApiRateLimitExceeded"

    .line 310
    .line 311
    const/16 v3, 0x18

    .line 312
    .line 313
    invoke-direct {v0, v2, v3, v1}, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 314
    .line 315
    .line 316
    sput-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->ApiRateLimitExceeded:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 317
    .line 318
    invoke-static {}, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->$values()[Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    sput-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->$VALUES:[Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 323
    .line 324
    invoke-static {v0}, Lic/d;->t([Ljava/lang/Enum;)Lmf/b;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    sput-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->$ENTRIES:Lmf/a;

    .line 329
    .line 330
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
    iput-object p3, p0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->specification:Ljava/lang/String;

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
    sget-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->$ENTRIES:Lmf/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/QonversionErrorCode;
    .locals 1

    const-class v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    return-object p0
.end method

.method public static values()[Lcom/qonversion/android/sdk/dto/QonversionErrorCode;
    .locals 1

    sget-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->$VALUES:[Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    return-object v0
.end method


# virtual methods
.method public final getSpecification()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->specification:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
