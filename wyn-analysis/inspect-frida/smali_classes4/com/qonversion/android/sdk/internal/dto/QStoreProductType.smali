.class public final enum Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/internal/dto/QStoreProductType$Companion;,
        Lcom/qonversion/android/sdk/internal/dto/QStoreProductType$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0008\u0080\u0081\u0002\u0018\u0000 \u00082\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0008B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;",
        "",
        "(Ljava/lang/String;I)V",
        "toProductType",
        "",
        "toSkuType",
        "InApp",
        "Subscription",
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

.field private static final synthetic $VALUES:[Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;

.field public static final Companion:Lcom/qonversion/android/sdk/internal/dto/QStoreProductType$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final enum InApp:Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;

.field public static final enum Subscription:Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;


# direct methods
.method private static final synthetic $values()[Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;

    sget-object v1, Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;->InApp:Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;->Subscription:Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;

    .line 2
    .line 3
    const-string v1, "InApp"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;->InApp:Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;

    .line 10
    .line 11
    new-instance v0, Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;

    .line 12
    .line 13
    const-string v1, "Subscription"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;->Subscription:Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;

    .line 20
    .line 21
    invoke-static {}, Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;->$values()[Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;->$VALUES:[Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;

    .line 26
    .line 27
    invoke-static {v0}, Lic/d;->t([Ljava/lang/Enum;)Lmf/b;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;->$ENTRIES:Lmf/a;

    .line 32
    .line 33
    new-instance v0, Lcom/qonversion/android/sdk/internal/dto/QStoreProductType$Companion;

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/internal/dto/QStoreProductType$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;->Companion:Lcom/qonversion/android/sdk/internal/dto/QStoreProductType$Companion;

    .line 40
    .line 41
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
    sget-object v0, Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;->$ENTRIES:Lmf/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;
    .locals 1

    const-class v0, Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;

    return-object p0
.end method

.method public static values()[Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;
    .locals 1

    sget-object v0, Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;->$VALUES:[Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;

    return-object v0
.end method


# virtual methods
.method public final toProductType()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/qonversion/android/sdk/internal/dto/QStoreProductType$WhenMappings;->$EnumSwitchMapping$0:[I

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
    const/4 v1, 0x1

    .line 10
    if-eq v0, v1, :cond_1

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    const-string v0, "subs"

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    new-instance v0, LE5/Q;

    .line 19
    .line 20
    const/16 v1, 0x9

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-direct {v0, v2, v1}, LE5/Q;-><init>(BI)V

    .line 24
    .line 25
    .line 26
    throw v0

    .line 27
    :cond_1
    const-string v0, "inapp"

    .line 28
    .line 29
    return-object v0
.end method

.method public final toSkuType()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/qonversion/android/sdk/internal/dto/QStoreProductType$WhenMappings;->$EnumSwitchMapping$0:[I

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
    const/4 v1, 0x1

    .line 10
    if-eq v0, v1, :cond_1

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    const-string v0, "subs"

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    new-instance v0, LE5/Q;

    .line 19
    .line 20
    const/16 v1, 0x9

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-direct {v0, v2, v1}, LE5/Q;-><init>(BI)V

    .line 24
    .line 25
    .line 26
    throw v0

    .line 27
    :cond_1
    const-string v0, "inapp"

    .line 28
    .line 29
    return-object v0
.end method
