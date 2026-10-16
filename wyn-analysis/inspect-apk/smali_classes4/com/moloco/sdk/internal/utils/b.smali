.class public final Lcom/moloco/sdk/internal/utils/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljf/f;


# instance fields
.field public final a:Lcom/moloco/sdk/internal/utils/c;


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/internal/utils/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/moloco/sdk/internal/utils/b;->a:Lcom/moloco/sdk/internal/utils/c;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final fold(Ljava/lang/Object;Ltf/p;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p2, p1, p0}, Ltf/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final get(Ljf/g;)Ljf/f;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LFe/e;->C(Ljf/f;Ljf/g;)Ljf/f;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final getKey()Ljf/g;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/internal/utils/b;->a:Lcom/moloco/sdk/internal/utils/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final minusKey(Ljf/g;)Ljf/h;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LFe/e;->N(Ljf/f;Ljf/g;)Ljf/h;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final plus(Ljf/h;)Ljf/h;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LFe/e;->O(Ljf/f;Ljf/h;)Ljf/h;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
