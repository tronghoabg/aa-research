.class public final Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState$Companion$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u00a2\u0006\u0002\u0008\u0007J\u0015\u0010\u0008\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0000\u00a2\u0006\u0002\u0008\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState$Companion;",
        "",
        "()V",
        "fromProductRenewState",
        "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;",
        "renewState",
        "Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;",
        "fromProductRenewState$sdk_release",
        "fromType",
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
    invoke-direct {p0}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromProductRenewState$sdk_release(Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;)Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "renewState"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState$Companion$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    aget p1, v0, p1

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    if-eq p1, v0, :cond_3

    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    if-eq p1, v0, :cond_2

    .line 19
    .line 20
    const/4 v0, 0x3

    .line 21
    if-eq p1, v0, :cond_1

    .line 22
    .line 23
    const/4 v0, 0x4

    .line 24
    if-eq p1, v0, :cond_0

    .line 25
    .line 26
    sget-object p1, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;->Unknown:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;

    .line 27
    .line 28
    return-object p1

    .line 29
    :cond_0
    sget-object p1, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;->BillingIssue:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;

    .line 30
    .line 31
    return-object p1

    .line 32
    :cond_1
    sget-object p1, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;->Canceled:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;

    .line 33
    .line 34
    return-object p1

    .line 35
    :cond_2
    sget-object p1, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;->WillRenew:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;

    .line 36
    .line 37
    return-object p1

    .line 38
    :cond_3
    sget-object p1, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;->NonRenewable:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;

    .line 39
    .line 40
    return-object p1
.end method

.method public final fromType$sdk_release(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;
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
    const-string v0, "will_renew"

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
    sget-object p1, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;->WillRenew:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;

    .line 24
    .line 25
    return-object p1

    .line 26
    :sswitch_1
    const-string v0, "canceled"

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
    sget-object p1, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;->Canceled:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;

    .line 36
    .line 37
    return-object p1

    .line 38
    :sswitch_2
    const-string v0, "non_renewable"

    .line 39
    .line 40
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-eqz p1, :cond_2

    .line 45
    .line 46
    sget-object p1, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;->NonRenewable:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;

    .line 47
    .line 48
    return-object p1

    .line 49
    :sswitch_3
    const-string v0, "billing_issue"

    .line 50
    .line 51
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-nez p1, :cond_3

    .line 56
    .line 57
    :cond_2
    :goto_0
    sget-object p1, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;->Unknown:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;

    .line 58
    .line 59
    return-object p1

    .line 60
    :cond_3
    sget-object p1, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;->BillingIssue:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;

    .line 61
    .line 62
    return-object p1

    .line 63
    :sswitch_data_0
    .sparse-switch
        -0x46f4d9eb -> :sswitch_3
        -0x1bd5258b -> :sswitch_2
        -0x7577b67 -> :sswitch_1
        0x2ae777e0 -> :sswitch_0
    .end sparse-switch
.end method
