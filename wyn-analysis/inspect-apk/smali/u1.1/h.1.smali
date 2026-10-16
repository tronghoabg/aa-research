.class public final Lu1/h;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:Ljava/util/Iterator;

.field public b:Lu1/d;

.field public c:Ljava/lang/Object;

.field public d:I

.field public synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/util/List;

.field public final synthetic g:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/ArrayList;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu1/h;->f:Ljava/util/List;

    .line 2
    .line 3
    iput-object p2, p0, Lu1/h;->g:Ljava/util/ArrayList;

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
    .locals 3

    .line 1
    new-instance v0, Lu1/h;

    .line 2
    .line 3
    iget-object v1, p0, Lu1/h;->g:Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object v2, p0, Lu1/h;->f:Ljava/util/List;

    .line 6
    .line 7
    invoke-direct {v0, v2, v1, p2}, Lu1/h;-><init>(Ljava/util/List;Ljava/util/ArrayList;Ljf/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lu1/h;->e:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p2, Ljf/c;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lu1/h;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lu1/h;

    .line 8
    .line 9
    sget-object p2, Lef/C;->a:Lef/C;

    .line 10
    .line 11
    invoke-virtual {p1, p2}, Lu1/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    iget v1, p0, Lu1/h;->d:I

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
    iget-object v1, p0, Lu1/h;->a:Ljava/util/Iterator;

    .line 14
    .line 15
    check-cast v1, Ljava/util/Iterator;

    .line 16
    .line 17
    iget-object v4, p0, Lu1/h;->e:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v4, Ljava/util/List;

    .line 20
    .line 21
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

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
    iget-object v1, p0, Lu1/h;->c:Ljava/lang/Object;

    .line 34
    .line 35
    iget-object v4, p0, Lu1/h;->b:Lu1/d;

    .line 36
    .line 37
    iget-object v5, p0, Lu1/h;->a:Ljava/util/Iterator;

    .line 38
    .line 39
    check-cast v5, Ljava/util/Iterator;

    .line 40
    .line 41
    iget-object v6, p0, Lu1/h;->e:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v6, Ljava/util/List;

    .line 44
    .line 45
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    move-object v8, v6

    .line 49
    move-object v6, v4

    .line 50
    move-object v4, v8

    .line 51
    goto :goto_1

    .line 52
    :cond_2
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iget-object p1, p0, Lu1/h;->e:Ljava/lang/Object;

    .line 56
    .line 57
    iget-object v1, p0, Lu1/h;->f:Ljava/util/List;

    .line 58
    .line 59
    check-cast v1, Ljava/lang/Iterable;

    .line 60
    .line 61
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    iget-object v4, p0, Lu1/h;->g:Ljava/util/ArrayList;

    .line 66
    .line 67
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    if-eqz v5, :cond_6

    .line 72
    .line 73
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    check-cast v5, Lu1/d;

    .line 78
    .line 79
    iput-object v4, p0, Lu1/h;->e:Ljava/lang/Object;

    .line 80
    .line 81
    move-object v6, v1

    .line 82
    check-cast v6, Ljava/util/Iterator;

    .line 83
    .line 84
    iput-object v6, p0, Lu1/h;->a:Ljava/util/Iterator;

    .line 85
    .line 86
    iput-object v5, p0, Lu1/h;->b:Lu1/d;

    .line 87
    .line 88
    iput-object p1, p0, Lu1/h;->c:Ljava/lang/Object;

    .line 89
    .line 90
    iput v3, p0, Lu1/h;->d:I

    .line 91
    .line 92
    invoke-interface {v5, p1, p0}, Lu1/d;->shouldMigrate(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    if-ne v6, v0, :cond_3

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_3
    move-object v8, v1

    .line 100
    move-object v1, p1

    .line 101
    move-object p1, v6

    .line 102
    move-object v6, v5

    .line 103
    move-object v5, v8

    .line 104
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    .line 105
    .line 106
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    if-eqz p1, :cond_5

    .line 111
    .line 112
    new-instance p1, Lu1/g;

    .line 113
    .line 114
    const/4 v7, 0x0

    .line 115
    invoke-direct {p1, v6, v7}, Lu1/g;-><init>(Lu1/d;Ljf/c;)V

    .line 116
    .line 117
    .line 118
    invoke-interface {v4, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    iput-object v4, p0, Lu1/h;->e:Ljava/lang/Object;

    .line 122
    .line 123
    move-object p1, v5

    .line 124
    check-cast p1, Ljava/util/Iterator;

    .line 125
    .line 126
    iput-object p1, p0, Lu1/h;->a:Ljava/util/Iterator;

    .line 127
    .line 128
    iput-object v7, p0, Lu1/h;->b:Lu1/d;

    .line 129
    .line 130
    iput-object v7, p0, Lu1/h;->c:Ljava/lang/Object;

    .line 131
    .line 132
    iput v2, p0, Lu1/h;->d:I

    .line 133
    .line 134
    invoke-interface {v6, v1, p0}, Lu1/d;->migrate(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    if-ne p1, v0, :cond_4

    .line 139
    .line 140
    :goto_2
    return-object v0

    .line 141
    :cond_4
    :goto_3
    move-object v1, v5

    .line 142
    goto :goto_0

    .line 143
    :cond_5
    move-object p1, v1

    .line 144
    goto :goto_3

    .line 145
    :cond_6
    return-object p1
.end method
