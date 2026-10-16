.class public final LKd/b;
.super Llf/i;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:Ljava/util/Iterator;

.field public b:[I

.field public c:I

.field public d:I

.field public e:I

.field public synthetic f:Ljava/lang/Object;

.field public final synthetic g:LKd/c;


# direct methods
.method public constructor <init>(LKd/c;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LKd/b;->g:LKd/c;

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
    new-instance v0, LKd/b;

    .line 2
    .line 3
    iget-object v1, p0, LKd/b;->g:LKd/c;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, LKd/b;-><init>(LKd/c;Ljf/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, LKd/b;->f:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, LKd/b;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LKd/b;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LKd/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    iget v1, p0, LKd/b;->e:I

    .line 4
    .line 5
    iget-object v2, p0, LKd/b;->g:LKd/c;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    if-ne v1, v4, :cond_0

    .line 12
    .line 13
    iget v1, p0, LKd/b;->d:I

    .line 14
    .line 15
    iget v5, p0, LKd/b;->c:I

    .line 16
    .line 17
    iget-object v6, p0, LKd/b;->b:[I

    .line 18
    .line 19
    iget-object v7, p0, LKd/b;->a:Ljava/util/Iterator;

    .line 20
    .line 21
    check-cast v7, Ljava/util/Iterator;

    .line 22
    .line 23
    iget-object v8, p0, LKd/b;->f:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v8, LAf/m;

    .line 26
    .line 27
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    move-object p1, v8

    .line 31
    goto :goto_2

    .line 32
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 33
    .line 34
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 35
    .line 36
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw p1

    .line 40
    :cond_1
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iget-object p1, p0, LKd/b;->f:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, LAf/m;

    .line 46
    .line 47
    iget-object v1, v2, LKd/c;->a:Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    move v5, v3

    .line 54
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    if-eqz v6, :cond_4

    .line 59
    .line 60
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    check-cast v6, [I

    .line 65
    .line 66
    move-object v7, v6

    .line 67
    move v6, v5

    .line 68
    move-object v5, v1

    .line 69
    move v1, v3

    .line 70
    :goto_1
    array-length v8, v7

    .line 71
    if-ge v1, v8, :cond_3

    .line 72
    .line 73
    invoke-virtual {v2, v6}, LKd/c;->a(I)I

    .line 74
    .line 75
    .line 76
    move-result v8

    .line 77
    const/4 v9, -0x1

    .line 78
    if-eq v8, v9, :cond_2

    .line 79
    .line 80
    new-instance v2, Ljava/lang/Integer;

    .line 81
    .line 82
    invoke-direct {v2, v6}, Ljava/lang/Integer;-><init>(I)V

    .line 83
    .line 84
    .line 85
    iput-object p1, p0, LKd/b;->f:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v5, Ljava/util/Iterator;

    .line 88
    .line 89
    iput-object v5, p0, LKd/b;->a:Ljava/util/Iterator;

    .line 90
    .line 91
    iput-object v7, p0, LKd/b;->b:[I

    .line 92
    .line 93
    iput v6, p0, LKd/b;->c:I

    .line 94
    .line 95
    iput v1, p0, LKd/b;->d:I

    .line 96
    .line 97
    iput v4, p0, LKd/b;->e:I

    .line 98
    .line 99
    invoke-virtual {p1, v2, p0}, LAf/m;->c(Ljava/lang/Object;Llf/a;)V

    .line 100
    .line 101
    .line 102
    sget-object p1, Lkf/a;->a:Lkf/a;

    .line 103
    .line 104
    return-object v0

    .line 105
    :cond_2
    move-object v10, v7

    .line 106
    move-object v7, v5

    .line 107
    move v5, v6

    .line 108
    move-object v6, v10

    .line 109
    :goto_2
    add-int/lit8 v1, v1, 0x6

    .line 110
    .line 111
    add-int/lit8 v5, v5, 0x6

    .line 112
    .line 113
    move-object v10, v6

    .line 114
    move v6, v5

    .line 115
    move-object v5, v7

    .line 116
    move-object v7, v10

    .line 117
    goto :goto_1

    .line 118
    :cond_3
    move-object v1, v5

    .line 119
    move v5, v6

    .line 120
    goto :goto_0

    .line 121
    :cond_4
    sget-object p1, Lef/C;->a:Lef/C;

    .line 122
    .line 123
    return-object p1
.end method
