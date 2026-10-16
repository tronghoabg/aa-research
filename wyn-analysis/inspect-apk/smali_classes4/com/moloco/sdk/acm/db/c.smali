.class public final Lcom/moloco/sdk/acm/db/c;
.super Llf/c;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/util/List;

.field public c:Ljava/util/ArrayList;

.field public synthetic d:Ljava/lang/Object;

.field public e:I


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/moloco/sdk/acm/db/c;->d:Ljava/lang/Object;

    iget p1, p0, Lcom/moloco/sdk/acm/db/c;->e:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/moloco/sdk/acm/db/c;->e:I

    const/4 p1, 0x0

    invoke-static {p1, p0}, Lcom/moloco/sdk/internal/publisher/H;->K(Lcom/moloco/sdk/acm/db/e;Ljf/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
