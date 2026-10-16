.class public final Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/internal/storage/PurchasesCache$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\"\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u0000 (2\u00020\u0001:\u0001(B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u000f\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0012\u0010\u000eJ!\u0010\u0017\u001a\u00020\t2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013\u00a2\u0006\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u001bR\u001c\u0010\u001e\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010\"R \u0010%\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u000f0$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u0010&R&\u0010\'\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00130$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010&\u00a8\u0006)"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;",
        "",
        "Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;",
        "preferences",
        "<init>",
        "(Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;)V",
        "",
        "Lcom/qonversion/android/sdk/internal/purchase/Purchase;",
        "purchases",
        "Lef/C;",
        "savePurchasesAsJson",
        "(Ljava/util/Set;)V",
        "purchase",
        "savePurchase",
        "(Lcom/qonversion/android/sdk/internal/purchase/Purchase;)V",
        "",
        "loadPurchases",
        "()Ljava/util/Set;",
        "clearPurchase",
        "",
        "",
        "Lcom/qonversion/android/sdk/dto/QPurchaseOptions;",
        "options",
        "saveProcessingPurchasesOptions",
        "(Ljava/util/Map;)V",
        "loadProcessingPurchasesOptions",
        "()Ljava/util/Map;",
        "Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;",
        "Lhb/K;",
        "kotlin.jvm.PlatformType",
        "moshi",
        "Lhb/K;",
        "Ljava/lang/reflect/Type;",
        "collectionPurchaseType",
        "Ljava/lang/reflect/Type;",
        "collectionPurchaseOptionsType",
        "Lhb/r;",
        "purchasesJsonAdapter",
        "Lhb/r;",
        "purchasesOptionsJsonAdapter",
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
.field public static final Companion:Lcom/qonversion/android/sdk/internal/storage/PurchasesCache$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final MAX_OLD_PURCHASES_NUMBER:I = 0x1

.field private static final MAX_PURCHASES_NUMBER:I = 0x5

.field private static final PURCHASE_KEY:Ljava/lang/String; = "purchase"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final PURCHASE_OPTIONS_KEY:Ljava/lang/String; = "purchase_options"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final collectionPurchaseOptionsType:Ljava/lang/reflect/Type;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final collectionPurchaseType:Ljava/lang/reflect/Type;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final moshi:Lhb/K;

.field private final preferences:Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final purchasesJsonAdapter:Lhb/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhb/r;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final purchasesOptionsJsonAdapter:Lhb/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhb/r;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/qonversion/android/sdk/internal/storage/PurchasesCache$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/internal/storage/PurchasesCache$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;->Companion:Lcom/qonversion/android/sdk/internal/storage/PurchasesCache$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;)V
    .locals 5
    .param p1    # Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    const-string v2, "preferences"

    .line 4
    .line 5
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;->preferences:Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;

    .line 12
    .line 13
    new-instance p1, LI9/a;

    .line 14
    .line 15
    const/4 v2, 0x2

    .line 16
    invoke-direct {p1, v2}, LI9/a;-><init>(I)V

    .line 17
    .line 18
    .line 19
    new-instance v3, Lhb/K;

    .line 20
    .line 21
    invoke-direct {v3, p1}, Lhb/K;-><init>(LI9/a;)V

    .line 22
    .line 23
    .line 24
    iput-object v3, p0, Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;->moshi:Lhb/K;

    .line 25
    .line 26
    new-array p1, v1, [Ljava/lang/reflect/Type;

    .line 27
    .line 28
    const-class v4, Lcom/qonversion/android/sdk/internal/purchase/Purchase;

    .line 29
    .line 30
    aput-object v4, p1, v0

    .line 31
    .line 32
    const-class v4, Ljava/util/Set;

    .line 33
    .line 34
    invoke-static {v4, p1}, Lhb/P;->f(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lib/d;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;->collectionPurchaseType:Ljava/lang/reflect/Type;

    .line 39
    .line 40
    new-array v2, v2, [Ljava/lang/reflect/Type;

    .line 41
    .line 42
    const-class v4, Ljava/lang/String;

    .line 43
    .line 44
    aput-object v4, v2, v0

    .line 45
    .line 46
    const-class v0, Lcom/qonversion/android/sdk/dto/QPurchaseOptions;

    .line 47
    .line 48
    aput-object v0, v2, v1

    .line 49
    .line 50
    const-class v0, Ljava/util/Map;

    .line 51
    .line 52
    invoke-static {v0, v2}, Lhb/P;->f(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lib/d;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;->collectionPurchaseOptionsType:Ljava/lang/reflect/Type;

    .line 57
    .line 58
    invoke-virtual {v3, p1}, Lhb/K;->b(Ljava/lang/reflect/Type;)Lhb/r;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    const-string v1, "adapter(...)"

    .line 63
    .line 64
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;->purchasesJsonAdapter:Lhb/r;

    .line 68
    .line 69
    invoke-virtual {v3, v0}, Lhb/K;->b(Ljava/lang/reflect/Type;)Lhb/r;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;->purchasesOptionsJsonAdapter:Lhb/r;

    .line 77
    .line 78
    return-void
.end method

.method private final savePurchasesAsJson(Ljava/util/Set;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/qonversion/android/sdk/internal/purchase/Purchase;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;->purchasesJsonAdapter:Lhb/r;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lhb/r;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const-string v0, "toJson(...)"

    .line 8
    .line 9
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;->preferences:Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;

    .line 13
    .line 14
    const-string v1, "purchase"

    .line 15
    .line 16
    invoke-virtual {v0, v1, p1}, Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final clearPurchase(Lcom/qonversion/android/sdk/internal/purchase/Purchase;)V
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/internal/purchase/Purchase;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "purchase"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;->loadPurchases()Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Ljava/lang/Iterable;

    .line 11
    .line 12
    invoke-static {v0}, Lff/o;->W0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    invoke-direct {p0, v0}, Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;->savePurchasesAsJson(Ljava/util/Set;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final loadProcessingPurchasesOptions()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/dto/QPurchaseOptions;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;->preferences:Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;

    .line 2
    .line 3
    const-string v1, "purchase_options"

    .line 4
    .line 5
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;->purchasesOptionsJsonAdapter:Lhb/r;

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;->getObject(Ljava/lang/String;Lhb/r;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/util/Map;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    sget-object v0, Lff/w;->a:Lff/w;

    .line 16
    .line 17
    :cond_0
    return-object v0
.end method

.method public final loadPurchases()Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/qonversion/android/sdk/internal/purchase/Purchase;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;->preferences:Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;

    .line 2
    .line 3
    const-string v1, "purchase"

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget-object v1, Lff/x;->a:Lff/x;

    .line 12
    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    :try_start_0
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;->purchasesJsonAdapter:Lhb/r;

    .line 23
    .line 24
    invoke-virtual {v2, v0}, Lhb/r;->fromJson(Ljava/lang/String;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Ljava/util/Set;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    return-object v1

    .line 33
    :cond_1
    return-object v0

    .line 34
    :catch_0
    :cond_2
    :goto_0
    return-object v1
.end method

.method public final saveProcessingPurchasesOptions(Ljava/util/Map;)V
    .locals 3
    .param p1    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/dto/QPurchaseOptions;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "options"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;->preferences:Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;

    .line 7
    .line 8
    const-string v1, "purchase_options"

    .line 9
    .line 10
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;->purchasesOptionsJsonAdapter:Lhb/r;

    .line 11
    .line 12
    invoke-virtual {v0, v1, p1, v2}, Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;->putObject(Ljava/lang/String;Ljava/lang/Object;Lhb/r;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final savePurchase(Lcom/qonversion/android/sdk/internal/purchase/Purchase;)V
    .locals 2
    .param p1    # Lcom/qonversion/android/sdk/internal/purchase/Purchase;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "purchase"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;->loadPurchases()Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Ljava/lang/Iterable;

    .line 11
    .line 12
    invoke-static {v0}, Lff/o;->W0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Set;->size()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    const/4 v1, 0x5

    .line 24
    if-lt p1, v1, :cond_0

    .line 25
    .line 26
    invoke-static {v0}, Lff/o;->U0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const/4 v1, 0x1

    .line 31
    invoke-static {p1, v1}, Lff/o;->N0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Ljava/lang/Iterable;

    .line 36
    .line 37
    invoke-static {p1}, Lff/o;->X0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    check-cast p1, Ljava/util/Collection;

    .line 42
    .line 43
    invoke-interface {v0, p1}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    .line 44
    .line 45
    .line 46
    :cond_0
    invoke-direct {p0, v0}, Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;->savePurchasesAsJson(Ljava/util/Set;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method
