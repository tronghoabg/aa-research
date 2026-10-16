.class public final Lcom/moloco/sdk/internal/publisher/nativead/f;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public final synthetic a:Lcom/moloco/sdk/internal/publisher/s0;

.field public final synthetic b:Lcom/moloco/sdk/internal/r;

.field public final synthetic c:Lcom/moloco/sdk/internal/ortb/model/d;


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/internal/publisher/s0;Lcom/moloco/sdk/internal/r;Lcom/moloco/sdk/internal/ortb/model/d;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/moloco/sdk/internal/publisher/nativead/f;->a:Lcom/moloco/sdk/internal/publisher/s0;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/moloco/sdk/internal/publisher/nativead/f;->b:Lcom/moloco/sdk/internal/r;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/moloco/sdk/internal/publisher/nativead/f;->c:Lcom/moloco/sdk/internal/ortb/model/d;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Llf/j;-><init>(ILjf/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 3

    .line 1
    new-instance p1, Lcom/moloco/sdk/internal/publisher/nativead/f;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/nativead/f;->b:Lcom/moloco/sdk/internal/r;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/moloco/sdk/internal/publisher/nativead/f;->c:Lcom/moloco/sdk/internal/ortb/model/d;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/moloco/sdk/internal/publisher/nativead/f;->a:Lcom/moloco/sdk/internal/publisher/s0;

    .line 8
    .line 9
    invoke-direct {p1, v2, v0, v1, p2}, Lcom/moloco/sdk/internal/publisher/nativead/f;-><init>(Lcom/moloco/sdk/internal/publisher/s0;Lcom/moloco/sdk/internal/r;Lcom/moloco/sdk/internal/ortb/model/d;Ljf/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LEf/E;

    .line 2
    .line 3
    check-cast p2, Ljf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/moloco/sdk/internal/publisher/nativead/f;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/moloco/sdk/internal/publisher/nativead/f;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lcom/moloco/sdk/internal/publisher/nativead/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/moloco/sdk/internal/publisher/nativead/f;->c:Lcom/moloco/sdk/internal/ortb/model/d;

    .line 7
    .line 8
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/nativead/f;->a:Lcom/moloco/sdk/internal/publisher/s0;

    .line 9
    .line 10
    check-cast v0, Lcom/moloco/sdk/internal/publisher/C;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/moloco/sdk/internal/publisher/nativead/f;->b:Lcom/moloco/sdk/internal/r;

    .line 13
    .line 14
    invoke-virtual {v0, v1, p1}, Lcom/moloco/sdk/internal/publisher/C;->a(Lcom/moloco/sdk/internal/r;Lcom/moloco/sdk/internal/ortb/model/d;)V

    .line 15
    .line 16
    .line 17
    sget-object p1, Lef/C;->a:Lef/C;

    .line 18
    .line 19
    return-object p1
.end method
