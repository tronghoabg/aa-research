.class public final Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\nB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0008R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper;",
        "",
        "logger",
        "Lcom/qonversion/android/sdk/internal/logger/Logger;",
        "(Lcom/qonversion/android/sdk/internal/logger/Logger;)V",
        "getEventFromRemoteMessage",
        "Lcom/qonversion/android/sdk/automations/dto/AutomationsEvent;",
        "messageData",
        "",
        "",
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
.field public static final Companion:Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final EVENT:Ljava/lang/String; = "qonv.event"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final EVENT_DATE:Ljava/lang/String; = "happened"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final EVENT_NAME:Ljava/lang/String; = "name"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final EVENT_PRODUCT_ID:Ljava/lang/String; = "product_id"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final logger:Lcom/qonversion/android/sdk/internal/logger/Logger;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper;->Companion:Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/qonversion/android/sdk/internal/logger/Logger;)V
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/internal/logger/Logger;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "logger"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final getEventFromRemoteMessage(Ljava/util/Map;)Lcom/qonversion/android/sdk/automations/dto/AutomationsEvent;
    .locals 6
    .param p1    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/qonversion/android/sdk/automations/dto/AutomationsEvent;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    const-string v0, "messageData"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    :try_start_0
    const-string v1, "qonv.event"

    .line 8
    .line 9
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Ljava/lang/String;

    .line 14
    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    new-instance v1, Lorg/json/JSONObject;

    .line 19
    .line 20
    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const-string p1, "name"

    .line 24
    .line 25
    invoke-virtual {v1, p1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-nez v2, :cond_1

    .line 37
    .line 38
    return-object v0

    .line 39
    :cond_1
    const-string v2, "happened"

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    .line 42
    .line 43
    .line 44
    move-result-wide v2

    .line 45
    const-wide/16 v4, 0x0

    .line 46
    .line 47
    cmp-long v4, v2, v4

    .line 48
    .line 49
    if-nez v4, :cond_2

    .line 50
    .line 51
    new-instance v2, Ljava/util/Date;

    .line 52
    .line 53
    invoke-static {}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getCurrentTimeInMillis()J

    .line 54
    .line 55
    .line 56
    move-result-wide v3

    .line 57
    invoke-direct {v2, v3, v4}, Ljava/util/Date;-><init>(J)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    new-instance v4, Ljava/util/Date;

    .line 62
    .line 63
    invoke-static {v2, v3}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->secondsToMilliSeconds(J)J

    .line 64
    .line 65
    .line 66
    move-result-wide v2

    .line 67
    invoke-direct {v4, v2, v3}, Ljava/util/Date;-><init>(J)V

    .line 68
    .line 69
    .line 70
    move-object v2, v4

    .line 71
    :goto_0
    const-string v3, "product_id"

    .line 72
    .line 73
    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-lez v3, :cond_3

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_3
    move-object v1, v0

    .line 88
    :goto_1
    sget-object v3, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;->Companion:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType$Companion;

    .line 89
    .line 90
    invoke-virtual {v3, p1}, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType$Companion;->fromType(Ljava/lang/String;)Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    sget-object v3, Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;->Unknown:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    .line 95
    .line 96
    if-eq p1, v3, :cond_4

    .line 97
    .line 98
    new-instance v3, Lcom/qonversion/android/sdk/automations/dto/AutomationsEvent;

    .line 99
    .line 100
    invoke-direct {v3, p1, v2, v1}, Lcom/qonversion/android/sdk/automations/dto/AutomationsEvent;-><init>(Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;Ljava/util/Date;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 101
    .line 102
    .line 103
    return-object v3

    .line 104
    :cond_4
    return-object v0

    .line 105
    :catch_0
    iget-object p1, p0, Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    .line 106
    .line 107
    const-string v1, "getEventFromRemoteMessage() -> Failed to retrieve event that triggered push notification"

    .line 108
    .line 109
    invoke-interface {p1, v1}, Lcom/qonversion/android/sdk/internal/logger/Logger;->error(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    return-object v0
.end method
