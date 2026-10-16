.class public final LVd/c;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public final synthetic a:LVd/d;

.field public final synthetic b:I


# direct methods
.method public constructor <init>(LVd/d;ILjf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LVd/c;->a:LVd/d;

    .line 2
    .line 3
    iput p2, p0, LVd/c;->b:I

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Llf/j;-><init>(ILjf/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 2

    .line 1
    new-instance p1, LVd/c;

    .line 2
    .line 3
    iget-object v0, p0, LVd/c;->a:LVd/d;

    .line 4
    .line 5
    iget v1, p0, LVd/c;->b:I

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, LVd/c;-><init>(LVd/d;ILjf/c;)V

    .line 8
    .line 9
    .line 10
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
    invoke-virtual {p0, p1, p2}, LVd/c;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LVd/c;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LVd/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    move-wide v2, v0

    .line 9
    :goto_0
    iget-object p1, p0, LVd/c;->a:LVd/d;

    .line 10
    .line 11
    iget-object v4, p1, LVd/d;->d:LPf/a;

    .line 12
    .line 13
    invoke-static {v4}, LFe/b;->C(LPf/i;)J

    .line 14
    .line 15
    .line 16
    move-result-wide v4

    .line 17
    iget v6, p0, LVd/c;->b:I

    .line 18
    .line 19
    int-to-long v6, v6

    .line 20
    cmp-long v4, v4, v6

    .line 21
    .line 22
    iget-object v5, p1, LVd/d;->b:LPf/b;

    .line 23
    .line 24
    const-wide/16 v6, -0x1

    .line 25
    .line 26
    if-gez v4, :cond_0

    .line 27
    .line 28
    cmp-long v4, v2, v0

    .line 29
    .line 30
    if-ltz v4, :cond_0

    .line 31
    .line 32
    :try_start_0
    iget-object p1, p1, LVd/d;->d:LPf/a;

    .line 33
    .line 34
    const-wide v2, 0x7fffffffffffffffL

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    invoke-virtual {v5, p1, v2, v3}, LPf/b;->j(LPf/a;J)J

    .line 40
    .line 41
    .line 42
    move-result-wide v2
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    goto :goto_0

    .line 44
    :catch_0
    move-wide v2, v6

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    cmp-long v0, v2, v6

    .line 47
    .line 48
    if-nez v0, :cond_1

    .line 49
    .line 50
    invoke-virtual {v5}, LPf/b;->close()V

    .line 51
    .line 52
    .line 53
    iget-object v0, p1, LVd/d;->e:LEf/o0;

    .line 54
    .line 55
    invoke-virtual {v0}, LEf/o0;->Y()Z

    .line 56
    .line 57
    .line 58
    new-instance v0, Lio/ktor/utils/io/S;

    .line 59
    .line 60
    const/4 v1, 0x0

    .line 61
    invoke-direct {v0, v1}, Lio/ktor/utils/io/S;-><init>(Ljava/lang/Throwable;)V

    .line 62
    .line 63
    .line 64
    iput-object v0, p1, LVd/d;->c:Lio/ktor/utils/io/S;

    .line 65
    .line 66
    :cond_1
    sget-object p1, Lef/C;->a:Lef/C;

    .line 67
    .line 68
    return-object p1
.end method
