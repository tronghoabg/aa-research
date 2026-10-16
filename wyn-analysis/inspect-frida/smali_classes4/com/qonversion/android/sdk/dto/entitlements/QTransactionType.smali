.class public final enum Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000c\u0008\u0086\u0081\u0002\u0018\u0000 \u000e2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\r\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;",
        "",
        "type",
        "",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getType",
        "()Ljava/lang/String;",
        "Unknown",
        "SubscriptionStarted",
        "SubscriptionRenewed",
        "TrialStarted",
        "IntroStarted",
        "IntroRenewed",
        "NonConsumablePurchase",
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

.field private static final synthetic $VALUES:[Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

.field public static final Companion:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final enum IntroRenewed:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

.field public static final enum IntroStarted:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

.field public static final enum NonConsumablePurchase:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

.field public static final enum SubscriptionRenewed:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

.field public static final enum SubscriptionStarted:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

.field public static final enum TrialStarted:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

.field public static final enum Unknown:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;


# instance fields
.field private final type:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    sget-object v1, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;->Unknown:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;->SubscriptionStarted:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;->SubscriptionRenewed:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;->TrialStarted:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;->IntroStarted:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;->IntroRenewed:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;->NonConsumablePurchase:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    .line 2
    .line 3
    const-string v1, "unknown"

    .line 4
    .line 5
    const-string v2, "Unknown"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v2, v3, v1}, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;->Unknown:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    .line 12
    .line 13
    new-instance v0, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    .line 14
    .line 15
    const-string v1, "subscription_started"

    .line 16
    .line 17
    const-string v2, "SubscriptionStarted"

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    invoke-direct {v0, v2, v3, v1}, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;->SubscriptionStarted:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    .line 24
    .line 25
    new-instance v0, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    .line 26
    .line 27
    const-string v1, "subscription_renewed"

    .line 28
    .line 29
    const-string v2, "SubscriptionRenewed"

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    invoke-direct {v0, v2, v3, v1}, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;->SubscriptionRenewed:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    .line 36
    .line 37
    new-instance v0, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    .line 38
    .line 39
    const-string v1, "trial_started"

    .line 40
    .line 41
    const-string v2, "TrialStarted"

    .line 42
    .line 43
    const/4 v3, 0x3

    .line 44
    invoke-direct {v0, v2, v3, v1}, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;->TrialStarted:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    .line 48
    .line 49
    new-instance v0, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    .line 50
    .line 51
    const-string v1, "intro_started"

    .line 52
    .line 53
    const-string v2, "IntroStarted"

    .line 54
    .line 55
    const/4 v3, 0x4

    .line 56
    invoke-direct {v0, v2, v3, v1}, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sput-object v0, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;->IntroStarted:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    .line 60
    .line 61
    new-instance v0, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    .line 62
    .line 63
    const-string v1, "intro_renewed"

    .line 64
    .line 65
    const-string v2, "IntroRenewed"

    .line 66
    .line 67
    const/4 v3, 0x5

    .line 68
    invoke-direct {v0, v2, v3, v1}, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 69
    .line 70
    .line 71
    sput-object v0, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;->IntroRenewed:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    .line 72
    .line 73
    new-instance v0, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    .line 74
    .line 75
    const-string v1, "non_consumable_purchase"

    .line 76
    .line 77
    const-string v2, "NonConsumablePurchase"

    .line 78
    .line 79
    const/4 v3, 0x6

    .line 80
    invoke-direct {v0, v2, v3, v1}, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 81
    .line 82
    .line 83
    sput-object v0, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;->NonConsumablePurchase:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    .line 84
    .line 85
    invoke-static {}, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;->$values()[Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    sput-object v0, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;->$VALUES:[Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    .line 90
    .line 91
    invoke-static {v0}, Lic/d;->t([Ljava/lang/Enum;)Lmf/b;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    sput-object v0, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;->$ENTRIES:Lmf/a;

    .line 96
    .line 97
    new-instance v0, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType$Companion;

    .line 98
    .line 99
    const/4 v1, 0x0

    .line 100
    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 101
    .line 102
    .line 103
    sput-object v0, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;->Companion:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType$Companion;

    .line 104
    .line 105
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
    iput-object p3, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;->type:Ljava/lang/String;

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
    sget-object v0, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;->$ENTRIES:Lmf/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;
    .locals 1

    const-class v0, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    return-object p0
.end method

.method public static values()[Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;
    .locals 1

    sget-object v0, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;->$VALUES:[Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    return-object v0
.end method


# virtual methods
.method public final getType()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;->type:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
