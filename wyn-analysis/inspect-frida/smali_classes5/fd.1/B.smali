.class public final Lfd/B;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public synthetic a:Ljava/lang/Object;

.field public final synthetic b:Lx1/e;

.field public final synthetic c:D


# direct methods
.method public constructor <init>(Lx1/e;DLjf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lfd/B;->b:Lx1/e;

    .line 2
    .line 3
    iput-wide p2, p0, Lfd/B;->c:D

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p4}, Llf/j;-><init>(ILjf/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 4

    .line 1
    new-instance v0, Lfd/B;

    .line 2
    .line 3
    iget-object v1, p0, Lfd/B;->b:Lx1/e;

    .line 4
    .line 5
    iget-wide v2, p0, Lfd/B;->c:D

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, v3, p2}, Lfd/B;-><init>(Lx1/e;DLjf/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lfd/B;->a:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lx1/b;

    .line 2
    .line 3
    check-cast p2, Ljf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lfd/B;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lfd/B;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lfd/B;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lfd/B;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lx1/b;

    .line 4
    .line 5
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 6
    .line 7
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    new-instance p1, Ljava/lang/Double;

    .line 11
    .line 12
    iget-wide v1, p0, Lfd/B;->c:D

    .line 13
    .line 14
    invoke-direct {p1, v1, v2}, Ljava/lang/Double;-><init>(D)V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lfd/B;->b:Lx1/e;

    .line 18
    .line 19
    invoke-virtual {v0, v1, p1}, Lx1/b;->c(Lx1/e;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    sget-object p1, Lef/C;->a:Lef/C;

    .line 23
    .line 24
    return-object p1
.end method
