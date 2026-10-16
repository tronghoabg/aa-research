.class public final LEf/v0;
.super Llf/i;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:LEf/C0;

.field public b:LJf/j;

.field public c:I

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:LEf/z0;


# direct methods
.method public constructor <init>(LEf/z0;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LEf/v0;->e:LEf/z0;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Llf/i;-><init>(ILjf/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 2

    .line 1
    new-instance v0, LEf/v0;

    .line 2
    .line 3
    iget-object v1, p0, LEf/v0;->e:LEf/z0;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, LEf/v0;-><init>(LEf/z0;Ljf/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, LEf/v0;->d:Ljava/lang/Object;

    .line 9
    .line 10
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
    invoke-virtual {p0, p1, p2}, LEf/v0;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LEf/v0;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LEf/v0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    iget v1, p0, LEf/v0;->c:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    if-eqz v1, :cond_2

    .line 8
    .line 9
    if-eq v1, v3, :cond_1

    .line 10
    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, LEf/v0;->b:LJf/j;

    .line 14
    .line 15
    iget-object v3, p0, LEf/v0;->a:LEf/C0;

    .line 16
    .line 17
    iget-object v4, p0, LEf/v0;->d:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v4, LAf/m;

    .line 20
    .line 21
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p1

    .line 33
    :cond_1
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_2
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, LEf/v0;->d:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, LAf/m;

    .line 43
    .line 44
    iget-object v1, p0, LEf/v0;->e:LEf/z0;

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    sget-object v4, LEf/z0;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 50
    .line 51
    invoke-virtual {v4, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    instance-of v4, v1, LEf/r;

    .line 56
    .line 57
    if-eqz v4, :cond_3

    .line 58
    .line 59
    check-cast v1, LEf/r;

    .line 60
    .line 61
    iget-object v1, v1, LEf/r;->e:LEf/s;

    .line 62
    .line 63
    iput v3, p0, LEf/v0;->c:I

    .line 64
    .line 65
    invoke-virtual {p1, v1, p0}, LAf/m;->c(Ljava/lang/Object;Llf/a;)V

    .line 66
    .line 67
    .line 68
    return-object v0

    .line 69
    :cond_3
    instance-of v3, v1, LEf/h0;

    .line 70
    .line 71
    if-eqz v3, :cond_5

    .line 72
    .line 73
    check-cast v1, LEf/h0;

    .line 74
    .line 75
    invoke-interface {v1}, LEf/h0;->b()LEf/C0;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    if-eqz v1, :cond_5

    .line 80
    .line 81
    sget-object v3, LJf/j;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 82
    .line 83
    invoke-virtual {v3, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    const-string v4, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"

    .line 88
    .line 89
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    check-cast v3, LJf/j;

    .line 93
    .line 94
    move-object v4, v3

    .line 95
    move-object v3, v1

    .line 96
    move-object v1, v4

    .line 97
    move-object v4, p1

    .line 98
    :goto_0
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    if-nez p1, :cond_5

    .line 103
    .line 104
    instance-of p1, v1, LEf/r;

    .line 105
    .line 106
    if-eqz p1, :cond_4

    .line 107
    .line 108
    move-object p1, v1

    .line 109
    check-cast p1, LEf/r;

    .line 110
    .line 111
    iput-object v4, p0, LEf/v0;->d:Ljava/lang/Object;

    .line 112
    .line 113
    iput-object v3, p0, LEf/v0;->a:LEf/C0;

    .line 114
    .line 115
    iput-object v1, p0, LEf/v0;->b:LJf/j;

    .line 116
    .line 117
    iput v2, p0, LEf/v0;->c:I

    .line 118
    .line 119
    iget-object p1, p1, LEf/r;->e:LEf/s;

    .line 120
    .line 121
    invoke-virtual {v4, p1, p0}, LAf/m;->c(Ljava/lang/Object;Llf/a;)V

    .line 122
    .line 123
    .line 124
    sget-object p1, Lkf/a;->a:Lkf/a;

    .line 125
    .line 126
    return-object v0

    .line 127
    :cond_4
    :goto_1
    invoke-virtual {v1}, LJf/j;->f()LJf/j;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    goto :goto_0

    .line 132
    :cond_5
    :goto_2
    sget-object p1, Lef/C;->a:Lef/C;

    .line 133
    .line 134
    return-object p1
.end method
