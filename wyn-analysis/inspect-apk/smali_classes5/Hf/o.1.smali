.class public final LHf/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LHf/l;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LHf/o;->a:I

    iput-object p1, p0, LHf/o;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LHf/o;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    check-cast p1, Ljava/util/List;

    iput-object p1, p0, LHf/o;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final collect(LHf/m;Ljf/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, LHf/o;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, LHf/f;

    .line 7
    .line 8
    const/4 v1, 0x5

    .line 9
    invoke-direct {v0, p1, v1}, LHf/f;-><init>(LHf/m;I)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, LHf/o;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p1, LHf/f0;

    .line 15
    .line 16
    invoke-virtual {p1, v0, p2}, LHf/f0;->collect(LHf/m;Ljf/c;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    sget-object p2, Lkf/a;->a:Lkf/a;

    .line 21
    .line 22
    if-ne p1, p2, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    sget-object p1, Lef/C;->a:Lef/C;

    .line 26
    .line 27
    :goto_0
    return-object p1

    .line 28
    :pswitch_0
    new-instance v0, LHf/f;

    .line 29
    .line 30
    const/4 v1, 0x4

    .line 31
    invoke-direct {v0, p1, v1}, LHf/f;-><init>(LHf/m;I)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, LHf/o;->b:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p1, LHf/g0;

    .line 37
    .line 38
    invoke-interface {p1, v0, p2}, LHf/l;->collect(LHf/m;Ljf/c;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    sget-object p2, Lkf/a;->a:Lkf/a;

    .line 43
    .line 44
    if-ne p1, p2, :cond_1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    sget-object p1, Lef/C;->a:Lef/C;

    .line 48
    .line 49
    :goto_1
    return-object p1

    .line 50
    :pswitch_1
    iget-object v0, p0, LHf/o;->b:Ljava/lang/Object;

    .line 51
    .line 52
    invoke-interface {p1, v0, p2}, LHf/m;->emit(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    sget-object p2, Lkf/a;->a:Lkf/a;

    .line 57
    .line 58
    if-ne p1, p2, :cond_2

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_2
    sget-object p1, Lef/C;->a:Lef/C;

    .line 62
    .line 63
    :goto_2
    return-object p1

    .line 64
    :pswitch_2
    instance-of v0, p2, LHf/n;

    .line 65
    .line 66
    if-eqz v0, :cond_3

    .line 67
    .line 68
    move-object v0, p2

    .line 69
    check-cast v0, LHf/n;

    .line 70
    .line 71
    iget v1, v0, LHf/n;->b:I

    .line 72
    .line 73
    const/high16 v2, -0x80000000

    .line 74
    .line 75
    and-int v3, v1, v2

    .line 76
    .line 77
    if-eqz v3, :cond_3

    .line 78
    .line 79
    sub-int/2addr v1, v2

    .line 80
    iput v1, v0, LHf/n;->b:I

    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_3
    new-instance v0, LHf/n;

    .line 84
    .line 85
    invoke-direct {v0, p0, p2}, LHf/n;-><init>(LHf/o;Ljf/c;)V

    .line 86
    .line 87
    .line 88
    :goto_3
    iget-object p2, v0, LHf/n;->a:Ljava/lang/Object;

    .line 89
    .line 90
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 91
    .line 92
    iget v2, v0, LHf/n;->b:I

    .line 93
    .line 94
    const/4 v3, 0x1

    .line 95
    if-eqz v2, :cond_5

    .line 96
    .line 97
    if-ne v2, v3, :cond_4

    .line 98
    .line 99
    iget-object p1, v0, LHf/n;->e:Ljava/util/Iterator;

    .line 100
    .line 101
    check-cast p1, Ljava/util/Iterator;

    .line 102
    .line 103
    iget-object v2, v0, LHf/n;->d:LHf/m;

    .line 104
    .line 105
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    move-object p2, v2

    .line 109
    goto :goto_4

    .line 110
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 111
    .line 112
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 113
    .line 114
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    throw p1

    .line 118
    :cond_5
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    iget-object p2, p0, LHf/o;->b:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast p2, Ljava/util/List;

    .line 124
    .line 125
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    move-object v5, p2

    .line 130
    move-object p2, p1

    .line 131
    move-object p1, v5

    .line 132
    :cond_6
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    if-eqz v2, :cond_7

    .line 137
    .line 138
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    iput-object p2, v0, LHf/n;->d:LHf/m;

    .line 143
    .line 144
    move-object v4, p1

    .line 145
    check-cast v4, Ljava/util/Iterator;

    .line 146
    .line 147
    iput-object v4, v0, LHf/n;->e:Ljava/util/Iterator;

    .line 148
    .line 149
    iput v3, v0, LHf/n;->b:I

    .line 150
    .line 151
    invoke-interface {p2, v2, v0}, LHf/m;->emit(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    if-ne v2, v1, :cond_6

    .line 156
    .line 157
    goto :goto_5

    .line 158
    :cond_7
    sget-object v1, Lef/C;->a:Lef/C;

    .line 159
    .line 160
    :goto_5
    return-object v1

    .line 161
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
