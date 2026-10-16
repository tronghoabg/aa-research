.class public final LA/c;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# instance fields
.field public final synthetic a:LA/e;

.field public final synthetic b:Ljava/lang/Comparable;


# direct methods
.method public constructor <init>(LA/e;Ljava/lang/Comparable;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LA/c;->a:LA/e;

    .line 2
    .line 3
    iput-object p2, p0, LA/c;->b:Ljava/lang/Comparable;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1, p3}, Llf/j;-><init>(ILjf/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljf/c;)Ljf/c;
    .locals 3

    .line 1
    new-instance v0, LA/c;

    .line 2
    .line 3
    iget-object v1, p0, LA/c;->b:Ljava/lang/Comparable;

    .line 4
    .line 5
    iget-object v2, p0, LA/c;->a:LA/e;

    .line 6
    .line 7
    invoke-direct {v0, v2, v1, p1}, LA/c;-><init>(LA/e;Ljava/lang/Comparable;Ljf/c;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Ljf/c;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LA/c;->create(Ljf/c;)Ljf/c;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, LA/c;

    .line 8
    .line 9
    sget-object v0, Lef/C;->a:Lef/C;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, LA/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-object v0
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
    iget-object p1, p0, LA/c;->a:LA/e;

    .line 7
    .line 8
    invoke-static {p1}, LA/e;->b(LA/e;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LA/c;->b:Ljava/lang/Comparable;

    .line 12
    .line 13
    invoke-static {p1, v0}, LA/e;->a(LA/e;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v1, p1, LA/e;->c:LA/j;

    .line 18
    .line 19
    iget-object v1, v1, LA/j;->f:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, LN/Y;

    .line 22
    .line 23
    invoke-virtual {v1, v0}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p1, LA/e;->e:LN/Y;

    .line 27
    .line 28
    invoke-virtual {p1, v0}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    sget-object p1, Lef/C;->a:Lef/C;

    .line 32
    .line 33
    return-object p1
.end method
