.class public final enum Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/moloco/sdk/publisher/MolocoAdError;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ErrorType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0016\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017j\u0002\u0008\u0018j\u0002\u0008\u0019j\u0002\u0008\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;",
        "",
        "description",
        "",
        "errorCode",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;I)V",
        "getDescription",
        "()Ljava/lang/String;",
        "getErrorCode",
        "()I",
        "UNKNOWN",
        "SDK_INIT_ERROR",
        "SDK_PERSISTENT_HTTP_REQUEST_FAILED_TO_INIT",
        "SDK_INVALID_CONFIGURATION",
        "AD_LOAD_FAILED",
        "AD_LOAD_FAILED_SDK_NOT_INIT",
        "AD_LOAD_TIMEOUT_ERROR",
        "AD_LOAD_LIMIT_REACHED",
        "AD_LOAD_BID_FAILED",
        "AD_LOAD_WEBVIEW_FAILED",
        "AD_SHOW_ERROR",
        "AD_SHOW_ERROR_NOT_LOADED",
        "AD_SHOW_ERROR_ALREADY_DISPLAYING",
        "AD_BID_PARSE_ERROR",
        "AD_SIGNAL_COLLECTION_FAILED",
        "moloco-sdk_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lmf/a;

.field private static final synthetic $VALUES:[Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

.field public static final enum AD_BID_PARSE_ERROR:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

.field public static final enum AD_LOAD_BID_FAILED:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

.field public static final enum AD_LOAD_FAILED:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

.field public static final enum AD_LOAD_FAILED_SDK_NOT_INIT:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

.field public static final enum AD_LOAD_LIMIT_REACHED:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

.field public static final enum AD_LOAD_TIMEOUT_ERROR:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

.field public static final enum AD_LOAD_WEBVIEW_FAILED:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

.field public static final enum AD_SHOW_ERROR:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

.field public static final enum AD_SHOW_ERROR_ALREADY_DISPLAYING:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

.field public static final enum AD_SHOW_ERROR_NOT_LOADED:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

.field public static final enum AD_SIGNAL_COLLECTION_FAILED:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

.field public static final enum SDK_INIT_ERROR:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

.field public static final enum SDK_INVALID_CONFIGURATION:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

.field public static final enum SDK_PERSISTENT_HTTP_REQUEST_FAILED_TO_INIT:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

.field public static final enum UNKNOWN:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;


# instance fields
.field private final description:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final errorCode:I


# direct methods
.method private static final synthetic $values()[Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;
    .locals 3

    const/16 v0, 0xf

    new-array v0, v0, [Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    sget-object v1, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->UNKNOWN:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->SDK_INIT_ERROR:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->SDK_PERSISTENT_HTTP_REQUEST_FAILED_TO_INIT:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->SDK_INVALID_CONFIGURATION:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->AD_LOAD_FAILED:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->AD_LOAD_FAILED_SDK_NOT_INIT:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->AD_LOAD_TIMEOUT_ERROR:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->AD_LOAD_LIMIT_REACHED:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->AD_LOAD_BID_FAILED:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sget-object v1, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->AD_LOAD_WEBVIEW_FAILED:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    sget-object v1, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->AD_SHOW_ERROR:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    const/16 v2, 0xa

    aput-object v1, v0, v2

    sget-object v1, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->AD_SHOW_ERROR_NOT_LOADED:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    const/16 v2, 0xb

    aput-object v1, v0, v2

    sget-object v1, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->AD_SHOW_ERROR_ALREADY_DISPLAYING:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    const/16 v2, 0xc

    aput-object v1, v0, v2

    sget-object v1, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->AD_BID_PARSE_ERROR:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    const/16 v2, 0xd

    aput-object v1, v0, v2

    sget-object v1, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->AD_SIGNAL_COLLECTION_FAILED:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    const/16 v2, 0xe

    aput-object v1, v0, v2

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    .line 2
    .line 3
    const-string v1, "UNKNOWN"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "Generic failure error code"

    .line 7
    .line 8
    const/4 v4, -0x1

    .line 9
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->UNKNOWN:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    .line 13
    .line 14
    new-instance v0, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    .line 15
    .line 16
    const-string v1, "SDK_INIT_ERROR"

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    const-string v3, "SDK initialization error"

    .line 20
    .line 21
    const/16 v4, 0x3e8

    .line 22
    .line 23
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->SDK_INIT_ERROR:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    .line 27
    .line 28
    new-instance v0, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    .line 29
    .line 30
    const-string v1, "SDK_PERSISTENT_HTTP_REQUEST_FAILED_TO_INIT"

    .line 31
    .line 32
    const/4 v2, 0x2

    .line 33
    const-string v3, "WorkManager crash that prevents us from creating a persistent http request client"

    .line 34
    .line 35
    const/16 v4, 0x3e9

    .line 36
    .line 37
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    sput-object v0, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->SDK_PERSISTENT_HTTP_REQUEST_FAILED_TO_INIT:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    .line 41
    .line 42
    new-instance v0, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    .line 43
    .line 44
    const-string v1, "SDK_INVALID_CONFIGURATION"

    .line 45
    .line 46
    const/4 v2, 0x3

    .line 47
    const-string v3, "Ad object cannot be created, due to invalid configuration"

    .line 48
    .line 49
    const/16 v4, 0x3ea

    .line 50
    .line 51
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 52
    .line 53
    .line 54
    sput-object v0, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->SDK_INVALID_CONFIGURATION:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    .line 55
    .line 56
    new-instance v0, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    .line 57
    .line 58
    const-string v1, "AD_LOAD_FAILED"

    .line 59
    .line 60
    const/4 v2, 0x4

    .line 61
    const-string v3, "Ad is not loaded"

    .line 62
    .line 63
    const/16 v4, 0x7d0

    .line 64
    .line 65
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 66
    .line 67
    .line 68
    sput-object v0, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->AD_LOAD_FAILED:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    .line 69
    .line 70
    new-instance v0, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    .line 71
    .line 72
    const-string v1, "AD_LOAD_FAILED_SDK_NOT_INIT"

    .line 73
    .line 74
    const/4 v2, 0x5

    .line 75
    const-string v3, "Ad load failed because SDK was not initialized"

    .line 76
    .line 77
    const/16 v4, 0x7d1

    .line 78
    .line 79
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 80
    .line 81
    .line 82
    sput-object v0, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->AD_LOAD_FAILED_SDK_NOT_INIT:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    .line 83
    .line 84
    new-instance v0, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    .line 85
    .line 86
    const-string v1, "AD_LOAD_TIMEOUT_ERROR"

    .line 87
    .line 88
    const/4 v2, 0x6

    .line 89
    const-string v3, "Ad failed to load because the request timed out"

    .line 90
    .line 91
    const/16 v4, 0x7d3

    .line 92
    .line 93
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 94
    .line 95
    .line 96
    sput-object v0, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->AD_LOAD_TIMEOUT_ERROR:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    .line 97
    .line 98
    new-instance v0, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    .line 99
    .line 100
    const-string v1, "AD_LOAD_LIMIT_REACHED"

    .line 101
    .line 102
    const/4 v2, 0x7

    .line 103
    const-string v3, "Ad load limit reached"

    .line 104
    .line 105
    const/16 v4, 0x7d4

    .line 106
    .line 107
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 108
    .line 109
    .line 110
    sput-object v0, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->AD_LOAD_LIMIT_REACHED:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    .line 111
    .line 112
    new-instance v0, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    .line 113
    .line 114
    const-string v1, "AD_LOAD_BID_FAILED"

    .line 115
    .line 116
    const/16 v2, 0x8

    .line 117
    .line 118
    const-string v3, "Ad failed to load because bid request failed or no fill"

    .line 119
    .line 120
    const/16 v4, 0x7d5

    .line 121
    .line 122
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 123
    .line 124
    .line 125
    sput-object v0, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->AD_LOAD_BID_FAILED:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    .line 126
    .line 127
    new-instance v0, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    .line 128
    .line 129
    const-string v1, "AD_LOAD_WEBVIEW_FAILED"

    .line 130
    .line 131
    const/16 v2, 0x9

    .line 132
    .line 133
    const-string v3, "Ad failed to load because Webview was *not* available"

    .line 134
    .line 135
    const/16 v4, 0x7d6

    .line 136
    .line 137
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 138
    .line 139
    .line 140
    sput-object v0, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->AD_LOAD_WEBVIEW_FAILED:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    .line 141
    .line 142
    new-instance v0, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    .line 143
    .line 144
    const-string v1, "AD_SHOW_ERROR"

    .line 145
    .line 146
    const/16 v2, 0xa

    .line 147
    .line 148
    const-string v3, "Ad show failed despite a successful ad load. Internal renderer error"

    .line 149
    .line 150
    const/16 v4, 0xbb8

    .line 151
    .line 152
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 153
    .line 154
    .line 155
    sput-object v0, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->AD_SHOW_ERROR:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    .line 156
    .line 157
    new-instance v0, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    .line 158
    .line 159
    const-string v1, "AD_SHOW_ERROR_NOT_LOADED"

    .line 160
    .line 161
    const/16 v2, 0xb

    .line 162
    .line 163
    const-string v3, "Ad show failed because ad load was not called"

    .line 164
    .line 165
    const/16 v4, 0xbb9

    .line 166
    .line 167
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 168
    .line 169
    .line 170
    sput-object v0, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->AD_SHOW_ERROR_NOT_LOADED:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    .line 171
    .line 172
    new-instance v0, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    .line 173
    .line 174
    const-string v1, "AD_SHOW_ERROR_ALREADY_DISPLAYING"

    .line 175
    .line 176
    const/16 v2, 0xc

    .line 177
    .line 178
    const-string v3, "Ad show failed because show() was invoked multiple times when ad was already rendering"

    .line 179
    .line 180
    const/16 v4, 0xbba

    .line 181
    .line 182
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 183
    .line 184
    .line 185
    sput-object v0, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->AD_SHOW_ERROR_ALREADY_DISPLAYING:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    .line 186
    .line 187
    new-instance v0, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    .line 188
    .line 189
    const-string v1, "AD_BID_PARSE_ERROR"

    .line 190
    .line 191
    const/16 v2, 0xd

    .line 192
    .line 193
    const-string v3, "The bid response received was not parseable by the SDK"

    .line 194
    .line 195
    const/16 v4, 0xfa0

    .line 196
    .line 197
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 198
    .line 199
    .line 200
    sput-object v0, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->AD_BID_PARSE_ERROR:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    .line 201
    .line 202
    new-instance v0, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    .line 203
    .line 204
    const-string v1, "AD_SIGNAL_COLLECTION_FAILED"

    .line 205
    .line 206
    const/16 v2, 0xe

    .line 207
    .line 208
    const-string v3, "The bid token couldn\u2019t be retrieved."

    .line 209
    .line 210
    const/16 v4, 0x1388

    .line 211
    .line 212
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 213
    .line 214
    .line 215
    sput-object v0, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->AD_SIGNAL_COLLECTION_FAILED:Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    .line 216
    .line 217
    invoke-static {}, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->$values()[Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    sput-object v0, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->$VALUES:[Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    .line 222
    .line 223
    invoke-static {v0}, Lic/d;->t([Ljava/lang/Enum;)Lmf/b;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    sput-object v0, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->$ENTRIES:Lmf/a;

    .line 228
    .line 229
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->description:Ljava/lang/String;

    .line 5
    .line 6
    iput p4, p0, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->errorCode:I

    .line 7
    .line 8
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
    sget-object v0, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->$ENTRIES:Lmf/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;
    .locals 1

    .line 1
    const-class v0, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;
    .locals 1

    .line 1
    sget-object v0, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->$VALUES:[Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final getDescription()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->description:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getErrorCode()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;->errorCode:I

    .line 2
    .line 3
    return v0
.end method
