.class public final Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus$Companion$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus$Companion;",
        "",
        "()V",
        "fromProductType",
        "Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;",
        "productType",
        "Lcom/qonversion/android/sdk/dto/products/QProductType;",
        "fromType",
        "type",
        "",
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
    invoke-direct {p0}, Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromProductType(Lcom/qonversion/android/sdk/dto/products/QProductType;)Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;
    .locals 2
    .param p1    # Lcom/qonversion/android/sdk/dto/products/QProductType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "productType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus$Companion$WhenMappings;->$EnumSwitchMapping$0:[I

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
    if-eq p1, v0, :cond_3

    .line 19
    .line 20
    const/4 v0, 0x3

    .line 21
    if-eq p1, v0, :cond_2

    .line 22
    .line 23
    const/4 v0, 0x4

    .line 24
    if-eq p1, v0, :cond_1

    .line 25
    .line 26
    const/4 v0, 0x5

    .line 27
    if-ne p1, v0, :cond_0

    .line 28
    .line 29
    sget-object p1, Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;->Unknown:Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;

    .line 30
    .line 31
    return-object p1

    .line 32
    :cond_0
    new-instance p1, LE5/Q;

    .line 33
    .line 34
    const/16 v0, 0x9

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    invoke-direct {p1, v1, v0}, LE5/Q;-><init>(BI)V

    .line 38
    .line 39
    .line 40
    throw p1

    .line 41
    :cond_1
    sget-object p1, Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;->NonIntroOrTrialProduct:Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;

    .line 42
    .line 43
    return-object p1

    .line 44
    :cond_2
    sget-object p1, Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;->Ineligible:Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;

    .line 45
    .line 46
    return-object p1

    .line 47
    :cond_3
    sget-object p1, Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;->Eligible:Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;

    .line 48
    .line 49
    return-object p1
.end method

.method public final fromType(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;
    .locals 2
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
    const v1, -0x3e7994b2

    .line 11
    .line 12
    .line 13
    if-eq v0, v1, :cond_3

    .line 14
    .line 15
    const v1, 0x5d2e28f

    .line 16
    .line 17
    .line 18
    if-eq v0, v1, :cond_2

    .line 19
    .line 20
    const v1, 0x36f97fa9

    .line 21
    .line 22
    .line 23
    if-eq v0, v1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const-string v0, "intro_or_trial_eligible"

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
    sget-object p1, Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;->Eligible:Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;

    .line 36
    .line 37
    return-object p1

    .line 38
    :cond_2
    const-string v0, "non_intro_or_trial_product"

    .line 39
    .line 40
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-eqz p1, :cond_4

    .line 45
    .line 46
    sget-object p1, Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;->NonIntroOrTrialProduct:Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;

    .line 47
    .line 48
    return-object p1

    .line 49
    :cond_3
    const-string v0, "intro_or_trial_ineligible"

    .line 50
    .line 51
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-nez p1, :cond_5

    .line 56
    .line 57
    :cond_4
    :goto_0
    sget-object p1, Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;->Unknown:Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;

    .line 58
    .line 59
    return-object p1

    .line 60
    :cond_5
    sget-object p1, Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;->Ineligible:Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;

    .line 61
    .line 62
    return-object p1
.end method
