.class public final Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;",
        "",
        "randomizer",
        "Ljava/util/Random;",
        "(Ljava/util/Random;)V",
        "countDelay",
        "",
        "minDelay",
        "retriesCount",
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
.field public static final Companion:Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final FACTOR:F = 2.4f

.field private static final JITTER:F = 0.4f

.field private static final MAX_DELAY:I = 0x3e8


# instance fields
.field private final randomizer:Ljava/util/Random;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;->Companion:Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/util/Random;)V
    .locals 1
    .param p1    # Ljava/util/Random;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "randomizer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;->randomizer:Ljava/util/Random;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final countDelay(II)I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 1
    int-to-float p1, p1

    .line 2
    const v0, 0x4019999a    # 2.4f

    .line 3
    .line 4
    .line 5
    float-to-double v0, v0

    .line 6
    int-to-double v2, p2

    .line 7
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    double-to-float p2, v0

    .line 12
    add-float/2addr p1, p2

    .line 13
    const p2, 0x3ecccccd    # 0.4f

    .line 14
    .line 15
    .line 16
    mul-float/2addr p2, p1

    .line 17
    invoke-static {p2}, Lvf/a;->H(F)I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    const v0, 0x7fffffff

    .line 22
    .line 23
    .line 24
    if-eq p2, v0, :cond_0

    .line 25
    .line 26
    add-int/lit8 p2, p2, 0x1

    .line 27
    .line 28
    :cond_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;->randomizer:Ljava/util/Random;

    .line 29
    .line 30
    invoke-virtual {v0, p2}, Ljava/util/Random;->nextInt(I)I

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    int-to-float p2, p2

    .line 35
    add-float/2addr p1, p2

    .line 36
    invoke-static {p1}, Lvf/a;->H(F)I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    const/16 p2, 0x3e8

    .line 41
    .line 42
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    return p1
.end method
