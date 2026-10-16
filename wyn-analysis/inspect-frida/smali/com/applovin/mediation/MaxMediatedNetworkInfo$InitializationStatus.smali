.class public final enum Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/applovin/mediation/MaxMediatedNetworkInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "InitializationStatus"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum DOES_NOT_APPLY:Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;

.field public static final enum INITIALIZED_FAILURE:Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;

.field public static final enum INITIALIZED_SUCCESS:Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;

.field public static final enum INITIALIZED_UNKNOWN:Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;

.field public static final enum INITIALIZING:Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;

.field public static final enum NOT_INITIALIZED:Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;

.field private static final synthetic b:[Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;


# instance fields
.field private final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;

    .line 2
    .line 3
    const/4 v1, -0x4

    .line 4
    const-string v2, "NOT_INITIALIZED"

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    invoke-direct {v0, v2, v3, v1}, Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;-><init>(Ljava/lang/String;II)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;->NOT_INITIALIZED:Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;

    .line 11
    .line 12
    new-instance v0, Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;

    .line 13
    .line 14
    const/4 v1, -0x3

    .line 15
    const-string v2, "DOES_NOT_APPLY"

    .line 16
    .line 17
    const/4 v4, 0x1

    .line 18
    invoke-direct {v0, v2, v4, v1}, Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;-><init>(Ljava/lang/String;II)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;->DOES_NOT_APPLY:Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;

    .line 22
    .line 23
    new-instance v0, Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;

    .line 24
    .line 25
    const/4 v1, 0x2

    .line 26
    const/4 v2, -0x2

    .line 27
    const-string v5, "INITIALIZING"

    .line 28
    .line 29
    invoke-direct {v0, v5, v1, v2}, Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;-><init>(Ljava/lang/String;II)V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;->INITIALIZING:Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;

    .line 33
    .line 34
    new-instance v0, Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;

    .line 35
    .line 36
    const/4 v1, 0x3

    .line 37
    const/4 v2, -0x1

    .line 38
    const-string v5, "INITIALIZED_UNKNOWN"

    .line 39
    .line 40
    invoke-direct {v0, v5, v1, v2}, Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;-><init>(Ljava/lang/String;II)V

    .line 41
    .line 42
    .line 43
    sput-object v0, Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;->INITIALIZED_UNKNOWN:Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;

    .line 44
    .line 45
    new-instance v0, Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;

    .line 46
    .line 47
    const-string v1, "INITIALIZED_FAILURE"

    .line 48
    .line 49
    const/4 v2, 0x4

    .line 50
    invoke-direct {v0, v1, v2, v3}, Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;-><init>(Ljava/lang/String;II)V

    .line 51
    .line 52
    .line 53
    sput-object v0, Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;->INITIALIZED_FAILURE:Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;

    .line 54
    .line 55
    new-instance v0, Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;

    .line 56
    .line 57
    const-string v1, "INITIALIZED_SUCCESS"

    .line 58
    .line 59
    const/4 v2, 0x5

    .line 60
    invoke-direct {v0, v1, v2, v4}, Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;-><init>(Ljava/lang/String;II)V

    .line 61
    .line 62
    .line 63
    sput-object v0, Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;->INITIALIZED_SUCCESS:Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;

    .line 64
    .line 65
    invoke-static {}, Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;->a()[Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    sput-object v0, Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;->b:[Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;

    .line 70
    .line 71
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;->a:I

    .line 5
    .line 6
    return-void
.end method

.method private static synthetic a()[Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;
    .locals 3

    .line 1
    const/4 v0, 0x6

    .line 2
    new-array v0, v0, [Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;

    .line 3
    .line 4
    sget-object v1, Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;->NOT_INITIALIZED:Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-object v1, v0, v2

    .line 8
    .line 9
    sget-object v1, Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;->DOES_NOT_APPLY:Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    aput-object v1, v0, v2

    .line 13
    .line 14
    sget-object v1, Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;->INITIALIZING:Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    aput-object v1, v0, v2

    .line 18
    .line 19
    sget-object v1, Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;->INITIALIZED_UNKNOWN:Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;

    .line 20
    .line 21
    const/4 v2, 0x3

    .line 22
    aput-object v1, v0, v2

    .line 23
    .line 24
    sget-object v1, Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;->INITIALIZED_FAILURE:Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;

    .line 25
    .line 26
    const/4 v2, 0x4

    .line 27
    aput-object v1, v0, v2

    .line 28
    .line 29
    sget-object v1, Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;->INITIALIZED_SUCCESS:Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;

    .line 30
    .line 31
    const/4 v2, 0x5

    .line 32
    aput-object v1, v0, v2

    .line 33
    .line 34
    return-object v0
.end method

.method public static fromCode(I)Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;
    .locals 5

    .line 1
    invoke-static {}, Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;->values()[Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    :goto_0
    if-ge v2, v1, :cond_1

    .line 8
    .line 9
    aget-object v3, v0, v2

    .line 10
    .line 11
    invoke-virtual {v3}, Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;->getCode()I

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    if-ne v4, p0, :cond_0

    .line 16
    .line 17
    return-object v3

    .line 18
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    sget-object p0, Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;->NOT_INITIALIZED:Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;

    .line 22
    .line 23
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;
    .locals 1

    .line 1
    const-class v0, Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;
    .locals 1

    .line 1
    sget-object v0, Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;->b:[Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public getCode()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/applovin/mediation/MaxMediatedNetworkInfo$InitializationStatus;->a:I

    .line 2
    .line 3
    return v0
.end method
