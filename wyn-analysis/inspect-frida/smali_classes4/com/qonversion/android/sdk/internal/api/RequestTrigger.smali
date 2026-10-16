.class public final enum Lcom/qonversion/android/sdk/internal/api/RequestTrigger;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/qonversion/android/sdk/internal/api/RequestTrigger;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000e\u0008\u0080\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/api/RequestTrigger;",
        "",
        "key",
        "",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getKey",
        "()Ljava/lang/String;",
        "Init",
        "Identify",
        "Products",
        "Purchase",
        "UserProperties",
        "Restore",
        "SyncHistoricalData",
        "SyncPurchases",
        "ActualizePermissions",
        "Logout",
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

.field private static final synthetic $VALUES:[Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

.field public static final enum ActualizePermissions:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

.field public static final enum Identify:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

.field public static final enum Init:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

.field public static final enum Logout:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

.field public static final enum Products:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

.field public static final enum Purchase:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

.field public static final enum Restore:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

.field public static final enum SyncHistoricalData:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

.field public static final enum SyncPurchases:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

.field public static final enum UserProperties:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;


# instance fields
.field private final key:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lcom/qonversion/android/sdk/internal/api/RequestTrigger;
    .locals 3

    const/16 v0, 0xa

    new-array v0, v0, [Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    sget-object v1, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->Init:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->Identify:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->Products:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->Purchase:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->UserProperties:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->Restore:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->SyncHistoricalData:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->SyncPurchases:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->ActualizePermissions:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->Logout:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    .line 2
    .line 3
    const-string v1, "Init"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v1}, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->Init:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    .line 10
    .line 11
    new-instance v0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    .line 12
    .line 13
    const-string v1, "Identify"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2, v1}, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->Identify:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    .line 20
    .line 21
    new-instance v0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    .line 22
    .line 23
    const-string v1, "Products"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2, v1}, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->Products:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    .line 30
    .line 31
    new-instance v0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    .line 32
    .line 33
    const-string v1, "Purchase"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v1, v2, v1}, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->Purchase:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    .line 40
    .line 41
    new-instance v0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    .line 42
    .line 43
    const-string v1, "UserProperties"

    .line 44
    .line 45
    const/4 v2, 0x4

    .line 46
    invoke-direct {v0, v1, v2, v1}, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 47
    .line 48
    .line 49
    sput-object v0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->UserProperties:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    .line 50
    .line 51
    new-instance v0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    .line 52
    .line 53
    const-string v1, "Restore"

    .line 54
    .line 55
    const/4 v2, 0x5

    .line 56
    invoke-direct {v0, v1, v2, v1}, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sput-object v0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->Restore:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    .line 60
    .line 61
    new-instance v0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    .line 62
    .line 63
    const-string v1, "SyncHistoricalData"

    .line 64
    .line 65
    const/4 v2, 0x6

    .line 66
    invoke-direct {v0, v1, v2, v1}, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 67
    .line 68
    .line 69
    sput-object v0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->SyncHistoricalData:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    .line 70
    .line 71
    new-instance v0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    .line 72
    .line 73
    const-string v1, "SyncPurchases"

    .line 74
    .line 75
    const/4 v2, 0x7

    .line 76
    invoke-direct {v0, v1, v2, v1}, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 77
    .line 78
    .line 79
    sput-object v0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->SyncPurchases:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    .line 80
    .line 81
    new-instance v0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    .line 82
    .line 83
    const-string v1, "ActualizePermissions"

    .line 84
    .line 85
    const/16 v2, 0x8

    .line 86
    .line 87
    invoke-direct {v0, v1, v2, v1}, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 88
    .line 89
    .line 90
    sput-object v0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->ActualizePermissions:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    .line 91
    .line 92
    new-instance v0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    .line 93
    .line 94
    const-string v1, "Logout"

    .line 95
    .line 96
    const/16 v2, 0x9

    .line 97
    .line 98
    invoke-direct {v0, v1, v2, v1}, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 99
    .line 100
    .line 101
    sput-object v0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->Logout:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    .line 102
    .line 103
    invoke-static {}, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->$values()[Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    sput-object v0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->$VALUES:[Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    .line 108
    .line 109
    invoke-static {v0}, Lic/d;->t([Ljava/lang/Enum;)Lmf/b;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    sput-object v0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->$ENTRIES:Lmf/a;

    .line 114
    .line 115
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
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->key:Ljava/lang/String;

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
    sget-object v0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->$ENTRIES:Lmf/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/qonversion/android/sdk/internal/api/RequestTrigger;
    .locals 1

    const-class v0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    return-object p0
.end method

.method public static values()[Lcom/qonversion/android/sdk/internal/api/RequestTrigger;
    .locals 1

    sget-object v0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->$VALUES:[Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    return-object v0
.end method


# virtual methods
.method public final getKey()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->key:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
