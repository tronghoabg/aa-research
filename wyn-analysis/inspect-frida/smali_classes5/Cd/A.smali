.class public final LCd/A;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public synthetic a:Ljava/lang/Object;

.field public final synthetic b:Z


# direct methods
.method public constructor <init>(ZLjf/c;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LCd/A;->b:Z

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Llf/j;-><init>(ILjf/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 2

    .line 1
    new-instance v0, LCd/A;

    .line 2
    .line 3
    iget-boolean v1, p0, LCd/A;->b:Z

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, LCd/A;-><init>(ZLjf/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, LCd/A;->a:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LFd/c;

    .line 2
    .line 3
    check-cast p2, Ljf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LCd/A;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LCd/A;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LCd/A;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LCd/A;->a:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, LFd/c;

    .line 9
    .line 10
    iget-object p1, p1, LFd/c;->f:LNd/d;

    .line 11
    .line 12
    sget-object v0, LCd/F;->c:LNd/a;

    .line 13
    .line 14
    new-instance v1, LCd/z;

    .line 15
    .line 16
    iget-boolean v2, p0, LCd/A;->b:Z

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-direct {v1, v2, v3}, LCd/z;-><init>(ZI)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v0, v1}, LNd/d;->a(LNd/a;Ltf/a;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    sget-object p1, Lef/C;->a:Lef/C;

    .line 26
    .line 27
    return-object p1
.end method
