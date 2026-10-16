.class public final enum Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "RecurrenceMode"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0007\u0008\u0086\u0081\u0002\u0018\u0000 \t2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;",
        "",
        "code",
        "",
        "(Ljava/lang/String;II)V",
        "InfiniteRecurring",
        "FiniteRecurring",
        "NonRecurring",
        "Unknown",
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

.field private static final synthetic $VALUES:[Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;

.field public static final Companion:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final enum FiniteRecurring:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;

.field public static final enum InfiniteRecurring:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;

.field public static final enum NonRecurring:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;

.field public static final enum Unknown:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;


# instance fields
.field private final code:I


# direct methods
.method private static final synthetic $values()[Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;

    sget-object v1, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;->InfiniteRecurring:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;->FiniteRecurring:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;->NonRecurring:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;->Unknown:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;

    .line 2
    .line 3
    const-string v1, "InfiniteRecurring"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    invoke-direct {v0, v1, v2, v3}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;-><init>(Ljava/lang/String;II)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;->InfiniteRecurring:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;

    .line 11
    .line 12
    new-instance v0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;

    .line 13
    .line 14
    const-string v1, "FiniteRecurring"

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    invoke-direct {v0, v1, v3, v2}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;-><init>(Ljava/lang/String;II)V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;->FiniteRecurring:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;

    .line 21
    .line 22
    new-instance v0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;

    .line 23
    .line 24
    const-string v1, "NonRecurring"

    .line 25
    .line 26
    const/4 v3, 0x3

    .line 27
    invoke-direct {v0, v1, v2, v3}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;-><init>(Ljava/lang/String;II)V

    .line 28
    .line 29
    .line 30
    sput-object v0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;->NonRecurring:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;

    .line 31
    .line 32
    new-instance v0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;

    .line 33
    .line 34
    const-string v1, "Unknown"

    .line 35
    .line 36
    const/4 v2, -0x1

    .line 37
    invoke-direct {v0, v1, v3, v2}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;-><init>(Ljava/lang/String;II)V

    .line 38
    .line 39
    .line 40
    sput-object v0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;->Unknown:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;

    .line 41
    .line 42
    invoke-static {}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;->$values()[Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sput-object v0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;->$VALUES:[Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;

    .line 47
    .line 48
    invoke-static {v0}, Lic/d;->t([Ljava/lang/Enum;)Lmf/b;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    sput-object v0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;->$ENTRIES:Lmf/a;

    .line 53
    .line 54
    new-instance v0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode$Companion;

    .line 55
    .line 56
    const/4 v1, 0x0

    .line 57
    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 58
    .line 59
    .line 60
    sput-object v0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;->Companion:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode$Companion;

    .line 61
    .line 62
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;->code:I

    .line 5
    .line 6
    return-void
.end method

.method public static final synthetic access$getCode$p(Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;->code:I

    .line 2
    .line 3
    return p0
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
    sget-object v0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;->$ENTRIES:Lmf/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;
    .locals 1

    const-class v0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;

    return-object p0
.end method

.method public static values()[Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;
    .locals 1

    sget-object v0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;->$VALUES:[Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;

    return-object v0
.end method
