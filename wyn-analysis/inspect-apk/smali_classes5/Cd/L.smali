.class public final LCd/L;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/s;


# instance fields
.field public a:I

.field public synthetic b:LGd/a;

.field public synthetic c:Lio/ktor/utils/io/t;

.field public synthetic d:LSd/a;

.field public final synthetic e:Ljava/nio/charset/Charset;


# direct methods
.method public constructor <init>(Ljava/nio/charset/Charset;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LCd/L;->e:Ljava/nio/charset/Charset;

    .line 2
    .line 3
    const/4 p1, 0x5

    .line 4
    invoke-direct {p0, p1, p2}, Llf/j;-><init>(ILjf/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, LDd/i;

    .line 2
    .line 3
    check-cast p2, LGd/a;

    .line 4
    .line 5
    check-cast p3, Lio/ktor/utils/io/t;

    .line 6
    .line 7
    check-cast p4, LSd/a;

    .line 8
    .line 9
    check-cast p5, Ljf/c;

    .line 10
    .line 11
    new-instance p1, LCd/L;

    .line 12
    .line 13
    iget-object v0, p0, LCd/L;->e:Ljava/nio/charset/Charset;

    .line 14
    .line 15
    invoke-direct {p1, v0, p5}, LCd/L;-><init>(Ljava/nio/charset/Charset;Ljf/c;)V

    .line 16
    .line 17
    .line 18
    iput-object p2, p1, LCd/L;->b:LGd/a;

    .line 19
    .line 20
    iput-object p3, p1, LCd/L;->c:Lio/ktor/utils/io/t;

    .line 21
    .line 22
    iput-object p4, p1, LCd/L;->d:LSd/a;

    .line 23
    .line 24
    sget-object p2, Lef/C;->a:Lef/C;

    .line 25
    .line 26
    invoke-virtual {p1, p2}, LCd/L;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    iget v1, p0, LCd/L;->a:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, LCd/L;->b:LGd/a;

    .line 11
    .line 12
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, LCd/L;->b:LGd/a;

    .line 28
    .line 29
    iget-object v1, p0, LCd/L;->c:Lio/ktor/utils/io/t;

    .line 30
    .line 31
    iget-object v3, p0, LCd/L;->d:LSd/a;

    .line 32
    .line 33
    iget-object v3, v3, LSd/a;->a:Lkotlin/reflect/KClass;

    .line 34
    .line 35
    sget-object v4, Lkotlin/jvm/internal/H;->a:Lkotlin/jvm/internal/I;

    .line 36
    .line 37
    const-class v5, Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/I;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    const/4 v4, 0x0

    .line 48
    if-nez v3, :cond_2

    .line 49
    .line 50
    return-object v4

    .line 51
    :cond_2
    iput-object p1, p0, LCd/L;->b:LGd/a;

    .line 52
    .line 53
    iput-object v4, p0, LCd/L;->c:Lio/ktor/utils/io/t;

    .line 54
    .line 55
    iput v2, p0, LCd/L;->a:I

    .line 56
    .line 57
    invoke-static {v1, p0}, Lio/ktor/utils/io/N;->m(Lio/ktor/utils/io/t;Llf/c;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    if-ne v1, v0, :cond_3

    .line 62
    .line 63
    return-object v0

    .line 64
    :cond_3
    move-object v0, p1

    .line 65
    move-object p1, v1

    .line 66
    :goto_0
    check-cast p1, LPf/i;

    .line 67
    .line 68
    invoke-virtual {v0}, LGd/a;->c()Lxd/c;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    sget-object v1, LCd/N;->a:Lvg/b;

    .line 73
    .line 74
    invoke-virtual {v0}, Lxd/c;->e()LGd/a;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-static {v1}, Lff/B;->f(LGd/a;)Ljava/nio/charset/Charset;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    if-nez v1, :cond_4

    .line 83
    .line 84
    iget-object v1, p0, LCd/L;->e:Ljava/nio/charset/Charset;

    .line 85
    .line 86
    :cond_4
    new-instance v2, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    const-string v3, "Reading response body for "

    .line 89
    .line 90
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0}, Lxd/c;->d()LFd/b;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-interface {v0}, LFd/b;->getUrl()LJd/H;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string v0, " as String with charset "

    .line 105
    .line 106
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    sget-object v2, LCd/N;->a:Lvg/b;

    .line 117
    .line 118
    invoke-interface {v2, v0}, Lvg/b;->s(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    const-string v0, "<this>"

    .line 122
    .line 123
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    const-string v0, "charset"

    .line 127
    .line 128
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    sget-object v0, LBf/a;->a:Ljava/nio/charset/Charset;

    .line 132
    .line 133
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    if-eqz v0, :cond_5

    .line 138
    .line 139
    invoke-static {p1}, LPf/j;->g(LPf/i;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    return-object p1

    .line 144
    :cond_5
    invoke-virtual {v1}, Ljava/nio/charset/Charset;->newDecoder()Ljava/nio/charset/CharsetDecoder;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-static {v0, p1}, Lr7/e;->u(Ljava/nio/charset/CharsetDecoder;LPf/i;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    return-object p1
.end method
