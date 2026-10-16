.class public final Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Companion;,
        Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008\u0086\u0008\u0018\u0000 \u00182\u00020\u0001:\u0002\u0018\u0019B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;",
        "",
        "unitCount",
        "",
        "unit",
        "Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;",
        "iso",
        "",
        "(ILcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;Ljava/lang/String;)V",
        "getIso",
        "()Ljava/lang/String;",
        "getUnit",
        "()Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;",
        "getUnitCount",
        "()I",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
        "Companion",
        "Unit",
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
.field public static final Companion:Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final iso:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final unit:Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final unitCount:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;->Companion:Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Companion;

    return-void
.end method

.method public constructor <init>(ILcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;Ljava/lang/String;)V
    .locals 1
    .param p2    # Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "unit"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "iso"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput p1, p0, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;->unitCount:I

    .line 15
    .line 16
    iput-object p2, p0, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;->unit:Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

    .line 17
    .line 18
    iput-object p3, p0, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;->iso:Ljava/lang/String;

    .line 19
    .line 20
    return-void
.end method

.method public static synthetic copy$default(Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;ILcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;Ljava/lang/String;ILjava/lang/Object;)Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget p1, p0, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;->unitCount:I

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;->unit:Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;->iso:Ljava/lang/String;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;->copy(ILcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;->unitCount:I

    return v0
.end method

.method public final component2()Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;->unit:Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;->iso:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(ILcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;
    .locals 1
    .param p2    # Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "unit"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iso"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;

    invoke-direct {v0, p1, p2, p3}, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;-><init>(ILcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;

    iget v1, p0, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;->unitCount:I

    iget v3, p1, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;->unitCount:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;->unit:Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

    iget-object v3, p1, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;->unit:Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;->iso:Ljava/lang/String;

    iget-object p1, p1, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;->iso:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getIso()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;->iso:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getUnit()Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;->unit:Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getUnitCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;->unitCount:I

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;->unitCount:I

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;->unit:Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;->iso:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget v0, p0, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;->unitCount:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;->unit:Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;->iso:Ljava/lang/String;

    .line 6
    .line 7
    new-instance v3, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v4, "QSubscriptionPeriod(unitCount="

    .line 10
    .line 11
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v0, ", unit="

    .line 18
    .line 19
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v0, ", iso="

    .line 26
    .line 27
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v0, ")"

    .line 31
    .line 32
    invoke-static {v3, v2, v0}, Lwg/b;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    return-object v0
.end method
