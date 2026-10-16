.class public final enum Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000c\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;",
        "",
        "days",
        "",
        "(Ljava/lang/String;II)V",
        "getDays",
        "()I",
        "Week",
        "TwoWeeks",
        "Month",
        "TwoMonths",
        "ThreeMonths",
        "SixMonths",
        "Year",
        "Unlimited",
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

.field private static final synthetic $VALUES:[Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

.field public static final enum Month:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

.field public static final enum SixMonths:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

.field public static final enum ThreeMonths:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

.field public static final enum TwoMonths:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

.field public static final enum TwoWeeks:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

.field public static final enum Unlimited:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

.field public static final enum Week:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

.field public static final enum Year:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;


# instance fields
.field private final days:I


# direct methods
.method private static final synthetic $values()[Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;
    .locals 3

    const/16 v0, 0x8

    new-array v0, v0, [Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    sget-object v1, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;->Week:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;->TwoWeeks:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;->Month:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;->TwoMonths:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;->ThreeMonths:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;->SixMonths:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;->Year:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;->Unlimited:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    .line 2
    .line 3
    const-string v1, "Week"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x7

    .line 7
    invoke-direct {v0, v1, v2, v3}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;-><init>(Ljava/lang/String;II)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;->Week:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    .line 11
    .line 12
    new-instance v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    .line 13
    .line 14
    const/16 v1, 0xe

    .line 15
    .line 16
    const-string v2, "TwoWeeks"

    .line 17
    .line 18
    const/4 v4, 0x1

    .line 19
    invoke-direct {v0, v2, v4, v1}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;-><init>(Ljava/lang/String;II)V

    .line 20
    .line 21
    .line 22
    sput-object v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;->TwoWeeks:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    .line 23
    .line 24
    new-instance v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    .line 25
    .line 26
    const/16 v1, 0x1e

    .line 27
    .line 28
    const-string v2, "Month"

    .line 29
    .line 30
    const/4 v4, 0x2

    .line 31
    invoke-direct {v0, v2, v4, v1}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;-><init>(Ljava/lang/String;II)V

    .line 32
    .line 33
    .line 34
    sput-object v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;->Month:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    .line 35
    .line 36
    new-instance v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    .line 37
    .line 38
    const/16 v1, 0x3c

    .line 39
    .line 40
    const-string v2, "TwoMonths"

    .line 41
    .line 42
    const/4 v4, 0x3

    .line 43
    invoke-direct {v0, v2, v4, v1}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;-><init>(Ljava/lang/String;II)V

    .line 44
    .line 45
    .line 46
    sput-object v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;->TwoMonths:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    .line 47
    .line 48
    new-instance v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    .line 49
    .line 50
    const/16 v1, 0x5a

    .line 51
    .line 52
    const-string v2, "ThreeMonths"

    .line 53
    .line 54
    const/4 v4, 0x4

    .line 55
    invoke-direct {v0, v2, v4, v1}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;-><init>(Ljava/lang/String;II)V

    .line 56
    .line 57
    .line 58
    sput-object v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;->ThreeMonths:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    .line 59
    .line 60
    new-instance v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    .line 61
    .line 62
    const/16 v1, 0xb4

    .line 63
    .line 64
    const-string v2, "SixMonths"

    .line 65
    .line 66
    const/4 v4, 0x5

    .line 67
    invoke-direct {v0, v2, v4, v1}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;-><init>(Ljava/lang/String;II)V

    .line 68
    .line 69
    .line 70
    sput-object v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;->SixMonths:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    .line 71
    .line 72
    new-instance v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    .line 73
    .line 74
    const/16 v1, 0x16d

    .line 75
    .line 76
    const-string v2, "Year"

    .line 77
    .line 78
    const/4 v4, 0x6

    .line 79
    invoke-direct {v0, v2, v4, v1}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;-><init>(Ljava/lang/String;II)V

    .line 80
    .line 81
    .line 82
    sput-object v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;->Year:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    .line 83
    .line 84
    new-instance v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    .line 85
    .line 86
    const-string v1, "Unlimited"

    .line 87
    .line 88
    const v2, 0x7fffffff

    .line 89
    .line 90
    .line 91
    invoke-direct {v0, v1, v3, v2}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;-><init>(Ljava/lang/String;II)V

    .line 92
    .line 93
    .line 94
    sput-object v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;->Unlimited:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    .line 95
    .line 96
    invoke-static {}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;->$values()[Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    sput-object v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;->$VALUES:[Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    .line 101
    .line 102
    invoke-static {v0}, Lic/d;->t([Ljava/lang/Enum;)Lmf/b;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    sput-object v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;->$ENTRIES:Lmf/a;

    .line 107
    .line 108
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
    iput p3, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;->days:I

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
    sget-object v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;->$ENTRIES:Lmf/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;
    .locals 1

    const-class v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    return-object p0
.end method

.method public static values()[Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;
    .locals 1

    sget-object v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;->$VALUES:[Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    return-object v0
.end method


# virtual methods
.method public final getDays()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;->days:I

    .line 2
    .line 3
    return v0
.end method
