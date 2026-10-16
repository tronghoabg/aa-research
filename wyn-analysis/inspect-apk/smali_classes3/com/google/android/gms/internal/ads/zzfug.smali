.class final synthetic Lcom/google/android/gms/internal/ads/zzfug;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/UnaryOperator;


# instance fields
.field private final synthetic zza:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzfug;->zza:I

    return-void
.end method


# virtual methods
.method public final synthetic andThen(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lj$/util/function/Function$-CC;->$default$andThen(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method

.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, LD6/o1;

    .line 2
    .line 3
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzfug;->zza:I

    .line 4
    .line 5
    new-instance v1, LD6/o1;

    .line 6
    .line 7
    if-gtz v0, :cond_0

    .line 8
    .line 9
    iget v0, p1, LD6/o1;->d:I

    .line 10
    .line 11
    :cond_0
    move v5, v0

    .line 12
    iget-object v2, p1, LD6/o1;->a:Ljava/lang/String;

    .line 13
    .line 14
    iget v3, p1, LD6/o1;->b:I

    .line 15
    .line 16
    iget-object v4, p1, LD6/o1;->c:LD6/v1;

    .line 17
    .line 18
    iget-boolean v6, p1, LD6/o1;->e:Z

    .line 19
    .line 20
    invoke-direct/range {v1 .. v6}, LD6/o1;-><init>(Ljava/lang/String;ILD6/v1;IZ)V

    .line 21
    .line 22
    .line 23
    return-object v1
.end method

.method public final synthetic compose(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lj$/util/function/Function$-CC;->$default$compose(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method
