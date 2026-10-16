.class public final enum Lcom/applovin/impl/e3$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/applovin/impl/e3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation


# static fields
.field public static final enum d:Lcom/applovin/impl/e3$b;

.field public static final enum e:Lcom/applovin/impl/e3$b;

.field public static final enum f:Lcom/applovin/impl/e3$b;

.field public static final enum g:Lcom/applovin/impl/e3$b;

.field public static final enum h:Lcom/applovin/impl/e3$b;

.field private static final synthetic i:[Lcom/applovin/impl/e3$b;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:I

.field private final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    new-instance v0, Lcom/applovin/impl/e3$b;

    .line 2
    .line 3
    const/high16 v4, -0x10000

    .line 4
    .line 5
    const-string v5, "This network does not support test mode."

    .line 6
    .line 7
    const-string v1, "NOT_SUPPORTED"

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    const-string v3, "Not Supported"

    .line 11
    .line 12
    invoke-direct/range {v0 .. v5}, Lcom/applovin/impl/e3$b;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lcom/applovin/impl/e3$b;->d:Lcom/applovin/impl/e3$b;

    .line 16
    .line 17
    new-instance v1, Lcom/applovin/impl/e3$b;

    .line 18
    .line 19
    const/high16 v5, -0x10000

    .line 20
    .line 21
    const-string v6, "Please address all the integration issue(s) marked in red above."

    .line 22
    .line 23
    const-string v2, "INVALID_INTEGRATION"

    .line 24
    .line 25
    const/4 v3, 0x1

    .line 26
    const-string v4, "Invalid Integration"

    .line 27
    .line 28
    invoke-direct/range {v1 .. v6}, Lcom/applovin/impl/e3$b;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)V

    .line 29
    .line 30
    .line 31
    sput-object v1, Lcom/applovin/impl/e3$b;->e:Lcom/applovin/impl/e3$b;

    .line 32
    .line 33
    new-instance v2, Lcom/applovin/impl/e3$b;

    .line 34
    .line 35
    const/high16 v6, -0x10000

    .line 36
    .line 37
    const-string v7, "Please configure this network in your MAX dashboard."

    .line 38
    .line 39
    const-string v3, "NOT_INITIALIZED"

    .line 40
    .line 41
    const/4 v4, 0x2

    .line 42
    const-string v5, "Not Initialized"

    .line 43
    .line 44
    invoke-direct/range {v2 .. v7}, Lcom/applovin/impl/e3$b;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v2, Lcom/applovin/impl/e3$b;->f:Lcom/applovin/impl/e3$b;

    .line 48
    .line 49
    new-instance v3, Lcom/applovin/impl/e3$b;

    .line 50
    .line 51
    const v7, -0xffff01

    .line 52
    .line 53
    .line 54
    const-string v8, "Please re-launch the app to enable test ads."

    .line 55
    .line 56
    const-string v4, "DISABLED"

    .line 57
    .line 58
    const/4 v5, 0x3

    .line 59
    const-string v6, "Enable"

    .line 60
    .line 61
    invoke-direct/range {v3 .. v8}, Lcom/applovin/impl/e3$b;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)V

    .line 62
    .line 63
    .line 64
    sput-object v3, Lcom/applovin/impl/e3$b;->g:Lcom/applovin/impl/e3$b;

    .line 65
    .line 66
    new-instance v4, Lcom/applovin/impl/e3$b;

    .line 67
    .line 68
    const v8, -0xffff01

    .line 69
    .line 70
    .line 71
    const-string v9, ""

    .line 72
    .line 73
    const-string v5, "READY"

    .line 74
    .line 75
    const/4 v6, 0x4

    .line 76
    const-string v7, ""

    .line 77
    .line 78
    invoke-direct/range {v4 .. v9}, Lcom/applovin/impl/e3$b;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)V

    .line 79
    .line 80
    .line 81
    sput-object v4, Lcom/applovin/impl/e3$b;->h:Lcom/applovin/impl/e3$b;

    .line 82
    .line 83
    invoke-static {}, Lcom/applovin/impl/e3$b;->a()[Lcom/applovin/impl/e3$b;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    sput-object v0, Lcom/applovin/impl/e3$b;->i:[Lcom/applovin/impl/e3$b;

    .line 88
    .line 89
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lcom/applovin/impl/e3$b;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput p4, p0, Lcom/applovin/impl/e3$b;->b:I

    .line 7
    .line 8
    iput-object p5, p0, Lcom/applovin/impl/e3$b;->c:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method

.method private static synthetic a()[Lcom/applovin/impl/e3$b;
    .locals 3

    .line 1
    const/4 v0, 0x5

    .line 2
    new-array v0, v0, [Lcom/applovin/impl/e3$b;

    .line 3
    .line 4
    sget-object v1, Lcom/applovin/impl/e3$b;->d:Lcom/applovin/impl/e3$b;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-object v1, v0, v2

    .line 8
    .line 9
    sget-object v1, Lcom/applovin/impl/e3$b;->e:Lcom/applovin/impl/e3$b;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    aput-object v1, v0, v2

    .line 13
    .line 14
    sget-object v1, Lcom/applovin/impl/e3$b;->f:Lcom/applovin/impl/e3$b;

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    aput-object v1, v0, v2

    .line 18
    .line 19
    sget-object v1, Lcom/applovin/impl/e3$b;->g:Lcom/applovin/impl/e3$b;

    .line 20
    .line 21
    const/4 v2, 0x3

    .line 22
    aput-object v1, v0, v2

    .line 23
    .line 24
    sget-object v1, Lcom/applovin/impl/e3$b;->h:Lcom/applovin/impl/e3$b;

    .line 25
    .line 26
    const/4 v2, 0x4

    .line 27
    aput-object v1, v0, v2

    .line 28
    .line 29
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/applovin/impl/e3$b;
    .locals 1

    .line 1
    const-class v0, Lcom/applovin/impl/e3$b;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/applovin/impl/e3$b;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/applovin/impl/e3$b;
    .locals 1

    .line 1
    sget-object v0, Lcom/applovin/impl/e3$b;->i:[Lcom/applovin/impl/e3$b;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/applovin/impl/e3$b;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/applovin/impl/e3$b;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/applovin/impl/e3$b;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/applovin/impl/e3$b;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public d()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/applovin/impl/e3$b;->b:I

    .line 2
    .line 3
    return v0
.end method
