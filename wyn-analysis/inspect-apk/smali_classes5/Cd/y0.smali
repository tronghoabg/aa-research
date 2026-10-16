.class public final LCd/y0;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/r;


# instance fields
.field public synthetic a:LFd/c;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LCd/y0;->b:Ljava/lang/String;

    .line 2
    .line 3
    const/4 p1, 0x4

    .line 4
    invoke-direct {p0, p1, p2}, Llf/j;-><init>(ILjf/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LDd/f;

    .line 2
    .line 3
    check-cast p2, LFd/c;

    .line 4
    .line 5
    check-cast p4, Ljf/c;

    .line 6
    .line 7
    new-instance p1, LCd/y0;

    .line 8
    .line 9
    iget-object p3, p0, LCd/y0;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-direct {p1, p3, p4}, LCd/y0;-><init>(Ljava/lang/String;Ljf/c;)V

    .line 12
    .line 13
    .line 14
    iput-object p2, p1, LCd/y0;->a:LFd/c;

    .line 15
    .line 16
    sget-object p2, Lef/C;->a:Lef/C;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, LCd/y0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LCd/y0;->a:LFd/c;

    .line 7
    .line 8
    sget-object v0, LCd/z0;->a:Lvg/b;

    .line 9
    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "Adding User-Agent header: agent for "

    .line 13
    .line 14
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v2, p1, LFd/c;->a:LJd/B;

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-interface {v0, v1}, Lvg/b;->s(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    sget-object v0, LJd/p;->a:Ljava/util/List;

    .line 30
    .line 31
    iget-object v0, p0, LCd/y0;->b:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const-string v1, "User-Agent"

    .line 38
    .line 39
    iget-object p1, p1, LFd/c;->c:LJd/n;

    .line 40
    .line 41
    invoke-virtual {p1, v1, v0}, LA7/B0;->z(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    sget-object p1, Lef/C;->a:Lef/C;

    .line 45
    .line 46
    return-object p1
.end method
