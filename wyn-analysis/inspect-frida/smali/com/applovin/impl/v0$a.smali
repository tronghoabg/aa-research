.class public final enum Lcom/applovin/impl/v0$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/applovin/impl/v0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field public static final enum b:Lcom/applovin/impl/v0$a;

.field public static final enum c:Lcom/applovin/impl/v0$a;

.field public static final enum d:Lcom/applovin/impl/v0$a;

.field public static final enum e:Lcom/applovin/impl/v0$a;

.field private static final synthetic f:[Lcom/applovin/impl/v0$a;


# instance fields
.field private final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/applovin/impl/v0$a;

    .line 2
    .line 3
    const-string v1, "NONE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, Lcom/applovin/impl/v0$a;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/applovin/impl/v0$a;->b:Lcom/applovin/impl/v0$a;

    .line 10
    .line 11
    new-instance v0, Lcom/applovin/impl/v0$a;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    const/16 v2, 0x3e8

    .line 15
    .line 16
    const-string v3, "IS_AL_GDPR"

    .line 17
    .line 18
    invoke-direct {v0, v3, v1, v2}, Lcom/applovin/impl/v0$a;-><init>(Ljava/lang/String;II)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lcom/applovin/impl/v0$a;->c:Lcom/applovin/impl/v0$a;

    .line 22
    .line 23
    new-instance v0, Lcom/applovin/impl/v0$a;

    .line 24
    .line 25
    const/4 v1, 0x2

    .line 26
    const/16 v2, 0x3e9

    .line 27
    .line 28
    const-string v3, "IS_ELIGIBLE_FOR_TERMS_AND_PRIVACY_POLICY_ALERT"

    .line 29
    .line 30
    invoke-direct {v0, v3, v1, v2}, Lcom/applovin/impl/v0$a;-><init>(Ljava/lang/String;II)V

    .line 31
    .line 32
    .line 33
    sput-object v0, Lcom/applovin/impl/v0$a;->d:Lcom/applovin/impl/v0$a;

    .line 34
    .line 35
    new-instance v0, Lcom/applovin/impl/v0$a;

    .line 36
    .line 37
    const/4 v1, 0x3

    .line 38
    const/16 v2, 0x3ea

    .line 39
    .line 40
    const-string v3, "HAS_TERMS_OF_SERVICE_URI"

    .line 41
    .line 42
    invoke-direct {v0, v3, v1, v2}, Lcom/applovin/impl/v0$a;-><init>(Ljava/lang/String;II)V

    .line 43
    .line 44
    .line 45
    sput-object v0, Lcom/applovin/impl/v0$a;->e:Lcom/applovin/impl/v0$a;

    .line 46
    .line 47
    invoke-static {}, Lcom/applovin/impl/v0$a;->a()[Lcom/applovin/impl/v0$a;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    sput-object v0, Lcom/applovin/impl/v0$a;->f:[Lcom/applovin/impl/v0$a;

    .line 52
    .line 53
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lcom/applovin/impl/v0$a;->a:I

    .line 5
    .line 6
    return-void
.end method

.method private static synthetic a()[Lcom/applovin/impl/v0$a;
    .locals 3

    .line 1
    const/4 v0, 0x4

    .line 2
    new-array v0, v0, [Lcom/applovin/impl/v0$a;

    .line 3
    .line 4
    sget-object v1, Lcom/applovin/impl/v0$a;->b:Lcom/applovin/impl/v0$a;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-object v1, v0, v2

    .line 8
    .line 9
    sget-object v1, Lcom/applovin/impl/v0$a;->c:Lcom/applovin/impl/v0$a;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    aput-object v1, v0, v2

    .line 13
    .line 14
    sget-object v1, Lcom/applovin/impl/v0$a;->d:Lcom/applovin/impl/v0$a;

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    aput-object v1, v0, v2

    .line 18
    .line 19
    sget-object v1, Lcom/applovin/impl/v0$a;->e:Lcom/applovin/impl/v0$a;

    .line 20
    .line 21
    const/4 v2, 0x3

    .line 22
    aput-object v1, v0, v2

    .line 23
    .line 24
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/applovin/impl/v0$a;
    .locals 1

    .line 1
    const-class v0, Lcom/applovin/impl/v0$a;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/applovin/impl/v0$a;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/applovin/impl/v0$a;
    .locals 1

    .line 1
    sget-object v0, Lcom/applovin/impl/v0$a;->f:[Lcom/applovin/impl/v0$a;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/applovin/impl/v0$a;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/applovin/impl/v0$a;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public b()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/applovin/impl/v0$a;->a:I

    .line 2
    .line 3
    return v0
.end method
