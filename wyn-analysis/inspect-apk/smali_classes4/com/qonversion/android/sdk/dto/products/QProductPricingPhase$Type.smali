.class public final enum Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Type"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0007\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;",
        "",
        "(Ljava/lang/String;I)V",
        "Regular",
        "FreeTrial",
        "DiscountedSinglePayment",
        "DiscountedRecurringPayment",
        "Unknown",
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

.field private static final synthetic $VALUES:[Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;

.field public static final enum DiscountedRecurringPayment:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;

.field public static final enum DiscountedSinglePayment:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;

.field public static final enum FreeTrial:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;

.field public static final enum Regular:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;

.field public static final enum Unknown:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;


# direct methods
.method private static final synthetic $values()[Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;

    sget-object v1, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;->Regular:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;->FreeTrial:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;->DiscountedSinglePayment:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;->DiscountedRecurringPayment:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;->Unknown:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;

    .line 2
    .line 3
    const-string v1, "Regular"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;->Regular:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;

    .line 10
    .line 11
    new-instance v0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;

    .line 12
    .line 13
    const-string v1, "FreeTrial"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;->FreeTrial:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;

    .line 20
    .line 21
    new-instance v0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;

    .line 22
    .line 23
    const-string v1, "DiscountedSinglePayment"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;->DiscountedSinglePayment:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;

    .line 30
    .line 31
    new-instance v0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;

    .line 32
    .line 33
    const-string v1, "DiscountedRecurringPayment"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;->DiscountedRecurringPayment:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;

    .line 40
    .line 41
    new-instance v0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;

    .line 42
    .line 43
    const-string v1, "Unknown"

    .line 44
    .line 45
    const/4 v2, 0x4

    .line 46
    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;-><init>(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;->Unknown:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;

    .line 50
    .line 51
    invoke-static {}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;->$values()[Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sput-object v0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;->$VALUES:[Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;

    .line 56
    .line 57
    invoke-static {v0}, Lic/d;->t([Ljava/lang/Enum;)Lmf/b;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    sput-object v0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;->$ENTRIES:Lmf/a;

    .line 62
    .line 63
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
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
    sget-object v0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;->$ENTRIES:Lmf/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;
    .locals 1

    const-class v0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;

    return-object p0
.end method

.method public static values()[Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;
    .locals 1

    sget-object v0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;->$VALUES:[Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;

    return-object v0
.end method
