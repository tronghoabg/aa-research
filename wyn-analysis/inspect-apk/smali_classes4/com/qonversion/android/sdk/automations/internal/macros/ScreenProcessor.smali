.class public final Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J#\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00042\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJM\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\rH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J=\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;",
        "",
        "<init>",
        "()V",
        "",
        "LBf/f;",
        "matchResults",
        "Lcom/qonversion/android/sdk/automations/internal/macros/Macros;",
        "convertMatchResultToMacros",
        "(Ljava/util/List;)Ljava/util/List;",
        "",
        "originalHtml",
        "macroses",
        "Lkotlin/Function1;",
        "Lef/C;",
        "onComplete",
        "Lcom/qonversion/android/sdk/dto/QonversionError;",
        "onError",
        "processMacroses",
        "(Ljava/lang/String;Ljava/util/List;Ltf/l;Ltf/l;)V",
        "html",
        "processScreen",
        "(Ljava/lang/String;Ltf/l;Ltf/l;)V",
        "Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;",
        "logger",
        "Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;",
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
.field public static final Companion:Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final MACROS_BRACKETS_NUMBER:I = 0x2

.field private static final MACROS_CATEGORY_KEY:Ljava/lang/String; = "category"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final MACROS_ID_KEY:Ljava/lang/String; = "uid"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final MACROS_PRODUCT_CATEGORY:Ljava/lang/String; = "product"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final MACROS_REGEX:Ljava/lang/String; = "\\[\\[.*?\\]\\]"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final MACROS_TYPE_KEY:Ljava/lang/String; = "type"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final logger:Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;->Companion:Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;->logger:Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    .line 10
    .line 11
    return-void
.end method

.method private final convertMatchResultToMacros(Ljava/util/List;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "LBf/f;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/automations/internal/macros/Macros;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Iterable;

    .line 7
    .line 8
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_3

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, LBf/f;

    .line 23
    .line 24
    invoke-virtual {v1}, LBf/f;->a()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {v1}, Lff/o;->q0(Ljava/util/List;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Ljava/lang/String;

    .line 33
    .line 34
    const/4 v2, 0x2

    .line 35
    invoke-static {v2, v1}, LBf/k;->p0(ILjava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    sub-int/2addr v4, v2

    .line 44
    if-gez v4, :cond_0

    .line 45
    .line 46
    const/4 v4, 0x0

    .line 47
    :cond_0
    invoke-static {v4, v3}, LBf/k;->T0(ILjava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    .line 52
    .line 53
    invoke-direct {v3, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const-string v2, "category"

    .line 57
    .line 58
    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    const-string v4, "type"

    .line 63
    .line 64
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    const-string v5, "uid"

    .line 69
    .line 70
    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    const-string v5, "product"

    .line 75
    .line 76
    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eqz v2, :cond_2

    .line 81
    .line 82
    invoke-static {v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-nez v2, :cond_1

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_1
    sget-object v2, Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;->Companion:Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType$Companion;

    .line 93
    .line 94
    invoke-static {v4}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2, v4}, Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType$Companion;->fromType(Ljava/lang/String;)Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    new-instance v4, Lcom/qonversion/android/sdk/automations/internal/macros/Macros;

    .line 102
    .line 103
    invoke-direct {v4, v2, v3, v1}, Lcom/qonversion/android/sdk/automations/internal/macros/Macros;-><init>(Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    goto :goto_0

    .line 110
    :catch_0
    move-exception v1

    .line 111
    goto :goto_2

    .line 112
    :cond_2
    :goto_1
    iget-object v1, p0, Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;->logger:Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    .line 113
    .line 114
    const-string v2, "Invalid macros value"

    .line 115
    .line 116
    invoke-virtual {v1, v2}, Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;->error(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 117
    .line 118
    .line 119
    goto :goto_0

    .line 120
    :goto_2
    iget-object v2, p0, Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;->logger:Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    .line 121
    .line 122
    new-instance v3, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    const-string v4, "Failed to parse screen macros. "

    .line 125
    .line 126
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-virtual {v2, v1}, Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;->error(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_3
    return-object v0
.end method

.method private final processMacroses(Ljava/lang/String;Ljava/util/List;Ltf/l;Ltf/l;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/automations/internal/macros/Macros;",
            ">;",
            "Ltf/l;",
            "Ltf/l;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {p3, p1}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    sget-object v0, Lcom/qonversion/android/sdk/Qonversion;->Companion:Lcom/qonversion/android/sdk/Qonversion$Companion;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/Qonversion$Companion;->getSharedInstance()Lcom/qonversion/android/sdk/Qonversion;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v1, Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor$processMacroses$1;

    .line 18
    .line 19
    invoke-direct {v1, p1, p2, p3, p4}, Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor$processMacroses$1;-><init>(Ljava/lang/String;Ljava/util/List;Ltf/l;Ltf/l;)V

    .line 20
    .line 21
    .line 22
    invoke-interface {v0, v1}, Lcom/qonversion/android/sdk/Qonversion;->products(Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final processScreen(Ljava/lang/String;Ltf/l;Ltf/l;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ltf/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ltf/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ltf/l;",
            "Ltf/l;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "html"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onComplete"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "onError"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, LBf/i;

    .line 17
    .line 18
    const-string v1, "\\[\\[.*?\\]\\]"

    .line 19
    .line 20
    invoke-direct {v0, v1}, LBf/i;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p1}, LBf/i;->a(Ljava/lang/CharSequence;)LAf/j;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0}, LAf/n;->e0(LAf/k;)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-direct {p0, v0}, Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;->convertMatchResultToMacros(Ljava/util/List;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    new-instance v1, Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor$processScreen$1;

    .line 36
    .line 37
    invoke-direct {v1, p2}, Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor$processScreen$1;-><init>(Ltf/l;)V

    .line 38
    .line 39
    .line 40
    new-instance p2, Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor$processScreen$2;

    .line 41
    .line 42
    invoke-direct {p2, p3}, Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor$processScreen$2;-><init>(Ltf/l;)V

    .line 43
    .line 44
    .line 45
    invoke-direct {p0, p1, v0, v1, p2}, Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;->processMacroses(Ljava/lang/String;Ljava/util/List;Ltf/l;Ltf/l;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method
