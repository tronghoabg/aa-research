.class public final enum Lcom/qonversion/android/sdk/dto/QAttributionProvider;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/qonversion/android/sdk/dto/QAttributionProvider;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/dto/QAttributionProvider;",
        "",
        "id",
        "",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getId",
        "()Ljava/lang/String;",
        "AppsFlyer",
        "Branch",
        "Adjust",
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

.field private static final synthetic $VALUES:[Lcom/qonversion/android/sdk/dto/QAttributionProvider;

.field public static final enum Adjust:Lcom/qonversion/android/sdk/dto/QAttributionProvider;

.field public static final enum AppsFlyer:Lcom/qonversion/android/sdk/dto/QAttributionProvider;

.field public static final enum Branch:Lcom/qonversion/android/sdk/dto/QAttributionProvider;


# instance fields
.field private final id:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lcom/qonversion/android/sdk/dto/QAttributionProvider;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/qonversion/android/sdk/dto/QAttributionProvider;

    sget-object v1, Lcom/qonversion/android/sdk/dto/QAttributionProvider;->AppsFlyer:Lcom/qonversion/android/sdk/dto/QAttributionProvider;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/QAttributionProvider;->Branch:Lcom/qonversion/android/sdk/dto/QAttributionProvider;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/QAttributionProvider;->Adjust:Lcom/qonversion/android/sdk/dto/QAttributionProvider;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/qonversion/android/sdk/dto/QAttributionProvider;

    .line 2
    .line 3
    const-string v1, "appsflyer"

    .line 4
    .line 5
    const-string v2, "AppsFlyer"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v2, v3, v1}, Lcom/qonversion/android/sdk/dto/QAttributionProvider;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lcom/qonversion/android/sdk/dto/QAttributionProvider;->AppsFlyer:Lcom/qonversion/android/sdk/dto/QAttributionProvider;

    .line 12
    .line 13
    new-instance v0, Lcom/qonversion/android/sdk/dto/QAttributionProvider;

    .line 14
    .line 15
    const-string v1, "branch"

    .line 16
    .line 17
    const-string v2, "Branch"

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    invoke-direct {v0, v2, v3, v1}, Lcom/qonversion/android/sdk/dto/QAttributionProvider;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lcom/qonversion/android/sdk/dto/QAttributionProvider;->Branch:Lcom/qonversion/android/sdk/dto/QAttributionProvider;

    .line 24
    .line 25
    new-instance v0, Lcom/qonversion/android/sdk/dto/QAttributionProvider;

    .line 26
    .line 27
    const-string v1, "adjust"

    .line 28
    .line 29
    const-string v2, "Adjust"

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    invoke-direct {v0, v2, v3, v1}, Lcom/qonversion/android/sdk/dto/QAttributionProvider;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lcom/qonversion/android/sdk/dto/QAttributionProvider;->Adjust:Lcom/qonversion/android/sdk/dto/QAttributionProvider;

    .line 36
    .line 37
    invoke-static {}, Lcom/qonversion/android/sdk/dto/QAttributionProvider;->$values()[Lcom/qonversion/android/sdk/dto/QAttributionProvider;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sput-object v0, Lcom/qonversion/android/sdk/dto/QAttributionProvider;->$VALUES:[Lcom/qonversion/android/sdk/dto/QAttributionProvider;

    .line 42
    .line 43
    invoke-static {v0}, Lic/d;->t([Ljava/lang/Enum;)Lmf/b;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sput-object v0, Lcom/qonversion/android/sdk/dto/QAttributionProvider;->$ENTRIES:Lmf/a;

    .line 48
    .line 49
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
    iput-object p3, p0, Lcom/qonversion/android/sdk/dto/QAttributionProvider;->id:Ljava/lang/String;

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
    sget-object v0, Lcom/qonversion/android/sdk/dto/QAttributionProvider;->$ENTRIES:Lmf/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/QAttributionProvider;
    .locals 1

    const-class v0, Lcom/qonversion/android/sdk/dto/QAttributionProvider;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/qonversion/android/sdk/dto/QAttributionProvider;

    return-object p0
.end method

.method public static values()[Lcom/qonversion/android/sdk/dto/QAttributionProvider;
    .locals 1

    sget-object v0, Lcom/qonversion/android/sdk/dto/QAttributionProvider;->$VALUES:[Lcom/qonversion/android/sdk/dto/QAttributionProvider;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/qonversion/android/sdk/dto/QAttributionProvider;

    return-object v0
.end method


# virtual methods
.method public final getId()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/QAttributionProvider;->id:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
