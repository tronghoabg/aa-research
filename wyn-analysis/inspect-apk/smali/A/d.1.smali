.class public final LA/d;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# instance fields
.field public final synthetic a:LA/e;


# direct methods
.method public constructor <init>(LA/e;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LA/d;->a:LA/e;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1, p2}, Llf/j;-><init>(ILjf/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljf/c;)Ljf/c;
    .locals 2

    .line 1
    new-instance v0, LA/d;

    .line 2
    .line 3
    iget-object v1, p0, LA/d;->a:LA/e;

    .line 4
    .line 5
    invoke-direct {v0, v1, p1}, LA/d;-><init>(LA/e;Ljf/c;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Ljf/c;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LA/d;->create(Ljf/c;)Ljf/c;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, LA/d;

    .line 8
    .line 9
    sget-object v0, Lef/C;->a:Lef/C;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, LA/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LA/d;->a:LA/e;

    .line 7
    .line 8
    invoke-static {p1}, LA/e;->b(LA/e;)V

    .line 9
    .line 10
    .line 11
    sget-object p1, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    return-object p1
.end method
