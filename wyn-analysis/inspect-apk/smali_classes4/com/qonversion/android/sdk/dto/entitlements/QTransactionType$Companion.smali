.class public final Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u00a2\u0006\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType$Companion;",
        "",
        "()V",
        "fromType",
        "Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;",
        "type",
        "",
        "fromType$sdk_release",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromType$sdk_release(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    sparse-switch v0, :sswitch_data_0

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :sswitch_0
    const-string v0, "intro_renewed"

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-nez p1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    sget-object p1, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;->IntroRenewed:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    .line 24
    .line 25
    return-object p1

    .line 26
    :sswitch_1
    const-string v0, "subscription_started"

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-nez p1, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    sget-object p1, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;->SubscriptionStarted:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    .line 36
    .line 37
    return-object p1

    .line 38
    :sswitch_2
    const-string v0, "trial_started"

    .line 39
    .line 40
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-nez p1, :cond_2

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    sget-object p1, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;->TrialStarted:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    .line 48
    .line 49
    return-object p1

    .line 50
    :sswitch_3
    const-string v0, "intro_started"

    .line 51
    .line 52
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-nez p1, :cond_3

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_3
    sget-object p1, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;->IntroStarted:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    .line 60
    .line 61
    return-object p1

    .line 62
    :sswitch_4
    const-string v0, "subscription_renewed"

    .line 63
    .line 64
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-nez p1, :cond_4

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_4
    sget-object p1, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;->SubscriptionRenewed:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    .line 72
    .line 73
    return-object p1

    .line 74
    :sswitch_5
    const-string v0, "non_consumable_purchase"

    .line 75
    .line 76
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    if-nez p1, :cond_5

    .line 81
    .line 82
    :goto_0
    sget-object p1, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;->Unknown:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    .line 83
    .line 84
    return-object p1

    .line 85
    :cond_5
    sget-object p1, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;->NonConsumablePurchase:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    .line 86
    .line 87
    return-object p1

    .line 88
    nop

    .line 89
    :sswitch_data_0
    .sparse-switch
        -0x7d22d915 -> :sswitch_5
        -0x3da4c536 -> :sswitch_4
        -0x3870de52 -> :sswitch_3
        -0x358a7fa8 -> :sswitch_2
        0x1028d35f -> :sswitch_1
        0x79c18919 -> :sswitch_0
    .end sparse-switch
.end method
