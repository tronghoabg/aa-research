.class public final enum Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0008\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H\u0000\u00a2\u0006\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;",
        "",
        "(Ljava/lang/String;I)V",
        "toReplacementMode",
        "",
        "toReplacementMode$sdk_release",
        "ChargeFullPrice",
        "ChargeProratedPrice",
        "WithTimeProration",
        "Deferred",
        "WithoutProration",
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

.field private static final synthetic $VALUES:[Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

.field public static final enum ChargeFullPrice:Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

.field public static final enum ChargeProratedPrice:Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

.field public static final enum Deferred:Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

.field public static final enum Unknown:Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

.field public static final enum WithTimeProration:Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

.field public static final enum WithoutProration:Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;


# direct methods
.method private static final synthetic $values()[Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    sget-object v1, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;->ChargeFullPrice:Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;->ChargeProratedPrice:Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;->WithTimeProration:Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;->Deferred:Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;->WithoutProration:Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;->Unknown:Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    .line 2
    .line 3
    const-string v1, "ChargeFullPrice"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;->ChargeFullPrice:Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    .line 10
    .line 11
    new-instance v0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    .line 12
    .line 13
    const-string v1, "ChargeProratedPrice"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;->ChargeProratedPrice:Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    .line 20
    .line 21
    new-instance v0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    .line 22
    .line 23
    const-string v1, "WithTimeProration"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;->WithTimeProration:Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    .line 30
    .line 31
    new-instance v0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    .line 32
    .line 33
    const-string v1, "Deferred"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;->Deferred:Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    .line 40
    .line 41
    new-instance v0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    .line 42
    .line 43
    const-string v1, "WithoutProration"

    .line 44
    .line 45
    const/4 v2, 0x4

    .line 46
    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;-><init>(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;->WithoutProration:Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    .line 50
    .line 51
    new-instance v0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    .line 52
    .line 53
    const-string v1, "Unknown"

    .line 54
    .line 55
    const/4 v2, 0x5

    .line 56
    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;-><init>(Ljava/lang/String;I)V

    .line 57
    .line 58
    .line 59
    sput-object v0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;->Unknown:Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    .line 60
    .line 61
    invoke-static {}, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;->$values()[Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    sput-object v0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;->$VALUES:[Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    .line 66
    .line 67
    invoke-static {v0}, Lic/d;->t([Ljava/lang/Enum;)Lmf/b;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    sput-object v0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;->$ENTRIES:Lmf/a;

    .line 72
    .line 73
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
    sget-object v0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;->$ENTRIES:Lmf/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;
    .locals 1

    const-class v0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    return-object p0
.end method

.method public static values()[Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;
    .locals 1

    sget-object v0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;->$VALUES:[Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    return-object v0
.end method


# virtual methods
.method public final toReplacementMode$sdk_release()I
    .locals 4

    .line 1
    sget-object v0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget v0, v0, v1

    .line 8
    .line 9
    const/4 v1, 0x5

    .line 10
    const/4 v2, 0x1

    .line 11
    if-eq v0, v2, :cond_4

    .line 12
    .line 13
    const/4 v3, 0x2

    .line 14
    if-eq v0, v3, :cond_3

    .line 15
    .line 16
    const/4 v3, 0x3

    .line 17
    if-eq v0, v3, :cond_2

    .line 18
    .line 19
    const/4 v2, 0x4

    .line 20
    if-eq v0, v2, :cond_1

    .line 21
    .line 22
    if-eq v0, v1, :cond_0

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    return v0

    .line 26
    :cond_0
    return v3

    .line 27
    :cond_1
    const/4 v0, 0x6

    .line 28
    return v0

    .line 29
    :cond_2
    return v2

    .line 30
    :cond_3
    return v3

    .line 31
    :cond_4
    return v1
.end method
