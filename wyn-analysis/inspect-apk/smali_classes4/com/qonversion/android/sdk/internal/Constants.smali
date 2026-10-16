.class public final Lcom/qonversion/android/sdk/internal/Constants;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0010\u0006\n\u0002\u0008\u0003\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/Constants;",
        "",
        "()V",
        "CRASH_LOGS_URL",
        "",
        "CRASH_LOG_FILE_SUFFIX",
        "INTERNAL_SERVER_ERROR_MAX",
        "",
        "INTERNAL_SERVER_ERROR_MIN",
        "IS_HISTORICAL_DATA_SYNCED",
        "PREFS_ORIGINAL_USER_ID_KEY",
        "PREFS_PARTNER_IDENTITY_ID_KEY",
        "PREFS_PREFIX",
        "PREFS_QONVERSION_USER_ID_KEY",
        "PRICE_MICROS_DIVIDER",
        "",
        "USER_ID_PREFIX",
        "USER_ID_SEPARATOR",
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
.field public static final CRASH_LOGS_URL:Ljava/lang/String; = "https://sdk-logs.qonversion.io/sdk.log"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final CRASH_LOG_FILE_SUFFIX:Ljava/lang/String; = ".qonversion.stacktrace"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final INSTANCE:Lcom/qonversion/android/sdk/internal/Constants;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final INTERNAL_SERVER_ERROR_MAX:I = 0x257

.field public static final INTERNAL_SERVER_ERROR_MIN:I = 0x1f4

.field public static final IS_HISTORICAL_DATA_SYNCED:Ljava/lang/String; = "com.qonversion.keys.is_historical_data_synced"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final PREFS_ORIGINAL_USER_ID_KEY:Ljava/lang/String; = "com.qonversion.keys.originalUserID"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final PREFS_PARTNER_IDENTITY_ID_KEY:Ljava/lang/String; = "com.qonversion.keys.partnerIdentityUserID"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final PREFS_PREFIX:Ljava/lang/String; = "com.qonversion.keys"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final PREFS_QONVERSION_USER_ID_KEY:Ljava/lang/String; = "com.qonversion.keys.storedUserID"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final PRICE_MICROS_DIVIDER:D = 1000000.0

.field public static final USER_ID_PREFIX:Ljava/lang/String; = "QON"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final USER_ID_SEPARATOR:Ljava/lang/String; = "_"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/qonversion/android/sdk/internal/Constants;

    invoke-direct {v0}, Lcom/qonversion/android/sdk/internal/Constants;-><init>()V

    sput-object v0, Lcom/qonversion/android/sdk/internal/Constants;->INSTANCE:Lcom/qonversion/android/sdk/internal/Constants;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
