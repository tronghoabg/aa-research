.class public final enum Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\t\u0008\u0086\u0081\u0002\u0018\u0000 \u000b2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\u0008\u0002\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;",
        "",
        "tag",
        "",
        "(Ljava/lang/String;ILjava/lang/Integer;)V",
        "getTag",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "Unknown",
        "None",
        "Main",
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

.field private static final synthetic $VALUES:[Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;

.field public static final Companion:Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final enum Main:Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;

.field public static final enum None:Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;

.field public static final enum Unknown:Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;


# instance fields
.field private final tag:Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;

    sget-object v1, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;->Unknown:Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;->None:Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;->Main:Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    const-string v2, "Unknown"

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-direct {v0, v2, v3, v1}, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;-><init>(Ljava/lang/String;ILjava/lang/Integer;)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;->Unknown:Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;

    .line 15
    .line 16
    new-instance v0, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;

    .line 17
    .line 18
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const-string v2, "None"

    .line 23
    .line 24
    const/4 v3, 0x1

    .line 25
    invoke-direct {v0, v2, v3, v1}, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;-><init>(Ljava/lang/String;ILjava/lang/Integer;)V

    .line 26
    .line 27
    .line 28
    sput-object v0, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;->None:Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;

    .line 29
    .line 30
    new-instance v0, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;

    .line 31
    .line 32
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    const-string v2, "Main"

    .line 37
    .line 38
    const/4 v3, 0x2

    .line 39
    invoke-direct {v0, v2, v3, v1}, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;-><init>(Ljava/lang/String;ILjava/lang/Integer;)V

    .line 40
    .line 41
    .line 42
    sput-object v0, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;->Main:Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;

    .line 43
    .line 44
    invoke-static {}, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;->$values()[Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    sput-object v0, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;->$VALUES:[Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;

    .line 49
    .line 50
    invoke-static {v0}, Lic/d;->t([Ljava/lang/Enum;)Lmf/b;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    sput-object v0, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;->$ENTRIES:Lmf/a;

    .line 55
    .line 56
    new-instance v0, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag$Companion;

    .line 57
    .line 58
    const/4 v1, 0x0

    .line 59
    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 60
    .line 61
    .line 62
    sput-object v0, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;->Companion:Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag$Companion;

    .line 63
    .line 64
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/Integer;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;->tag:Ljava/lang/Integer;

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
    sget-object v0, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;->$ENTRIES:Lmf/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;
    .locals 1

    const-class v0, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;

    return-object p0
.end method

.method public static values()[Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;
    .locals 1

    sget-object v0, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;->$VALUES:[Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;

    return-object v0
.end method


# virtual methods
.method public final getTag()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;->tag:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method
