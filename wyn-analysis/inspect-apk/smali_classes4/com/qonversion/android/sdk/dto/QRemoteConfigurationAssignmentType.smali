.class public final enum Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0008\u0008\u0086\u0081\u0002\u0018\u0000 \n2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;",
        "",
        "type",
        "",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getType",
        "()Ljava/lang/String;",
        "Auto",
        "Manual",
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

.field private static final synthetic $VALUES:[Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;

.field public static final enum Auto:Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;

.field public static final Companion:Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final enum Manual:Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;

.field public static final enum Unknown:Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;


# instance fields
.field private final type:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;

    sget-object v1, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;->Auto:Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;->Manual:Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;->Unknown:Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;

    .line 2
    .line 3
    const-string v1, "auto"

    .line 4
    .line 5
    const-string v2, "Auto"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v2, v3, v1}, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;->Auto:Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;

    .line 12
    .line 13
    new-instance v0, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;

    .line 14
    .line 15
    const-string v1, "manual"

    .line 16
    .line 17
    const-string v2, "Manual"

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    invoke-direct {v0, v2, v3, v1}, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;->Manual:Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;

    .line 24
    .line 25
    new-instance v0, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;

    .line 26
    .line 27
    const-string v1, "unknown"

    .line 28
    .line 29
    const-string v2, "Unknown"

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    invoke-direct {v0, v2, v3, v1}, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;->Unknown:Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;

    .line 36
    .line 37
    invoke-static {}, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;->$values()[Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sput-object v0, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;->$VALUES:[Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;

    .line 42
    .line 43
    invoke-static {v0}, Lic/d;->t([Ljava/lang/Enum;)Lmf/b;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sput-object v0, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;->$ENTRIES:Lmf/a;

    .line 48
    .line 49
    new-instance v0, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType$Companion;

    .line 50
    .line 51
    const/4 v1, 0x0

    .line 52
    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 53
    .line 54
    .line 55
    sput-object v0, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;->Companion:Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType$Companion;

    .line 56
    .line 57
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
    iput-object p3, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;->type:Ljava/lang/String;

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
    sget-object v0, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;->$ENTRIES:Lmf/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;
    .locals 1

    const-class v0, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;

    return-object p0
.end method

.method public static values()[Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;
    .locals 1

    sget-object v0, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;->$VALUES:[Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;

    return-object v0
.end method


# virtual methods
.method public final getType()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;->type:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
