.class public final LAf/w;
.super Llf/i;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/util/Iterator;

.field public c:I

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Lef/k;

.field public final synthetic f:LAf/j;

.field public final synthetic g:Ltf/p;


# direct methods
.method public constructor <init>(Lef/k;LAf/j;Ltf/p;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LAf/w;->e:Lef/k;

    .line 2
    .line 3
    iput-object p2, p0, LAf/w;->f:LAf/j;

    .line 4
    .line 5
    iput-object p3, p0, LAf/w;->g:Ltf/p;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Llf/i;-><init>(ILjf/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 4

    .line 1
    new-instance v0, LAf/w;

    .line 2
    .line 3
    iget-object v1, p0, LAf/w;->f:LAf/j;

    .line 4
    .line 5
    iget-object v2, p0, LAf/w;->g:Ltf/p;

    .line 6
    .line 7
    iget-object v3, p0, LAf/w;->e:Lef/k;

    .line 8
    .line 9
    invoke-direct {v0, v3, v1, v2, p2}, LAf/w;-><init>(Lef/k;LAf/j;Ltf/p;Ljf/c;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, LAf/w;->d:Ljava/lang/Object;

    .line 13
    .line 14
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LAf/m;

    .line 2
    .line 3
    check-cast p2, Ljf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LAf/w;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LAf/w;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LAf/w;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, LAf/w;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LAf/m;

    .line 4
    .line 5
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 6
    .line 7
    iget v2, p0, LAf/w;->c:I

    .line 8
    .line 9
    iget-object v3, p0, LAf/w;->e:Lef/k;

    .line 10
    .line 11
    const/4 v4, 0x1

    .line 12
    if-eqz v2, :cond_3

    .line 13
    .line 14
    const/4 v5, 0x2

    .line 15
    if-eq v2, v4, :cond_1

    .line 16
    .line 17
    if-ne v2, v5, :cond_0

    .line 18
    .line 19
    iget-object v2, p0, LAf/w;->b:Ljava/util/Iterator;

    .line 20
    .line 21
    check-cast v2, Ljava/util/Iterator;

    .line 22
    .line 23
    iget-object v3, p0, LAf/w;->a:Ljava/lang/Object;

    .line 24
    .line 25
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 30
    .line 31
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 32
    .line 33
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw p1

    .line 37
    :cond_1
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, LAf/w;->f:LAf/j;

    .line 41
    .line 42
    invoke-virtual {p1}, LAf/j;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_2

    .line 51
    .line 52
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    iget-object v4, p0, LAf/w;->g:Ltf/p;

    .line 57
    .line 58
    invoke-interface {v4, v3, p1}, Ltf/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iput-object v0, p0, LAf/w;->d:Ljava/lang/Object;

    .line 63
    .line 64
    iput-object p1, p0, LAf/w;->a:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v2, Ljava/util/Iterator;

    .line 67
    .line 68
    iput-object v2, p0, LAf/w;->b:Ljava/util/Iterator;

    .line 69
    .line 70
    iput v5, p0, LAf/w;->c:I

    .line 71
    .line 72
    invoke-virtual {v0, p1, p0}, LAf/m;->c(Ljava/lang/Object;Llf/a;)V

    .line 73
    .line 74
    .line 75
    return-object v1

    .line 76
    :cond_2
    sget-object p1, Lef/C;->a:Lef/C;

    .line 77
    .line 78
    return-object p1

    .line 79
    :cond_3
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    iput-object v0, p0, LAf/w;->d:Ljava/lang/Object;

    .line 83
    .line 84
    iput v4, p0, LAf/w;->c:I

    .line 85
    .line 86
    invoke-virtual {v0, v3, p0}, LAf/m;->c(Ljava/lang/Object;Llf/a;)V

    .line 87
    .line 88
    .line 89
    return-object v1
.end method
