.class public final LIf/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LHf/m;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lkotlin/jvm/internal/G;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/E;Lkotlin/jvm/internal/G;LGf/t;Lkotlin/jvm/internal/E;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LIf/m;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIf/m;->c:Ljava/lang/Object;

    iput-object p2, p0, LIf/m;->b:Lkotlin/jvm/internal/G;

    iput-object p3, p0, LIf/m;->d:Ljava/lang/Object;

    iput-object p4, p0, LIf/m;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/internal/G;LEf/E;LIf/o;LHf/m;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LIf/m;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIf/m;->b:Lkotlin/jvm/internal/G;

    iput-object p2, p0, LIf/m;->c:Ljava/lang/Object;

    iput-object p3, p0, LIf/m;->d:Ljava/lang/Object;

    iput-object p4, p0, LIf/m;->e:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;
    .locals 8

    .line 1
    sget-object v0, Lef/C;->a:Lef/C;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget v2, p0, LIf/m;->a:I

    .line 5
    .line 6
    packed-switch v2, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    iget-object v4, p0, LIf/m;->b:Lkotlin/jvm/internal/G;

    .line 16
    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    iget-object p1, p0, LIf/m;->e:Ljava/lang/Object;

    .line 20
    .line 21
    move-object v5, p1

    .line 22
    check-cast v5, Lkotlin/jvm/internal/E;

    .line 23
    .line 24
    iget-object p1, p0, LIf/m;->c:Ljava/lang/Object;

    .line 25
    .line 26
    move-object v3, p1

    .line 27
    check-cast v3, Lkotlin/jvm/internal/E;

    .line 28
    .line 29
    iget p1, v3, Lkotlin/jvm/internal/E;->a:I

    .line 30
    .line 31
    if-eqz p1, :cond_3

    .line 32
    .line 33
    iget-object p1, v4, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 34
    .line 35
    if-eqz p1, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    new-instance v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/w0;

    .line 39
    .line 40
    const/4 v7, 0x0

    .line 41
    iget-object p1, p0, LIf/m;->d:Ljava/lang/Object;

    .line 42
    .line 43
    move-object v6, p1

    .line 44
    check-cast v6, LGf/t;

    .line 45
    .line 46
    invoke-direct/range {v2 .. v7}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/w0;-><init>(Lkotlin/jvm/internal/E;Lkotlin/jvm/internal/G;Lkotlin/jvm/internal/E;LGf/t;Ljf/c;)V

    .line 47
    .line 48
    .line 49
    const/4 p1, 0x3

    .line 50
    invoke-static {v6, v1, v2, p1}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    iput-object p1, v4, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    iget-object p1, v4, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p1, LEf/m0;

    .line 60
    .line 61
    if-eqz p1, :cond_2

    .line 62
    .line 63
    invoke-interface {p1, v1}, LEf/m0;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 64
    .line 65
    .line 66
    :cond_2
    iput-object v1, v4, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 67
    .line 68
    :cond_3
    :goto_0
    return-object v0

    .line 69
    :pswitch_0
    instance-of v2, p2, LIf/l;

    .line 70
    .line 71
    if-eqz v2, :cond_4

    .line 72
    .line 73
    move-object v2, p2

    .line 74
    check-cast v2, LIf/l;

    .line 75
    .line 76
    iget v3, v2, LIf/l;->e:I

    .line 77
    .line 78
    const/high16 v4, -0x80000000

    .line 79
    .line 80
    and-int v5, v3, v4

    .line 81
    .line 82
    if-eqz v5, :cond_4

    .line 83
    .line 84
    sub-int/2addr v3, v4

    .line 85
    iput v3, v2, LIf/l;->e:I

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_4
    new-instance v2, LIf/l;

    .line 89
    .line 90
    invoke-direct {v2, p0, p2}, LIf/l;-><init>(LIf/m;Ljf/c;)V

    .line 91
    .line 92
    .line 93
    :goto_1
    iget-object p2, v2, LIf/l;->c:Ljava/lang/Object;

    .line 94
    .line 95
    sget-object v3, Lkf/a;->a:Lkf/a;

    .line 96
    .line 97
    iget v4, v2, LIf/l;->e:I

    .line 98
    .line 99
    const/4 v5, 0x1

    .line 100
    if-eqz v4, :cond_6

    .line 101
    .line 102
    if-ne v4, v5, :cond_5

    .line 103
    .line 104
    iget-object p1, v2, LIf/l;->b:Ljava/lang/Object;

    .line 105
    .line 106
    iget-object v2, v2, LIf/l;->a:LIf/m;

    .line 107
    .line 108
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 113
    .line 114
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 115
    .line 116
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    throw p1

    .line 120
    :cond_6
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    iget-object p2, p0, LIf/m;->b:Lkotlin/jvm/internal/G;

    .line 124
    .line 125
    iget-object p2, p2, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast p2, LEf/m0;

    .line 128
    .line 129
    if-eqz p2, :cond_7

    .line 130
    .line 131
    new-instance v4, LIf/p;

    .line 132
    .line 133
    const-string v6, "Child of the scoped flow was cancelled"

    .line 134
    .line 135
    invoke-direct {v4, v6}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    invoke-interface {p2, v4}, LEf/m0;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 139
    .line 140
    .line 141
    iput-object p0, v2, LIf/l;->a:LIf/m;

    .line 142
    .line 143
    iput-object p1, v2, LIf/l;->b:Ljava/lang/Object;

    .line 144
    .line 145
    iput v5, v2, LIf/l;->e:I

    .line 146
    .line 147
    invoke-interface {p2, v2}, LEf/m0;->join(Ljf/c;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object p2

    .line 151
    if-ne p2, v3, :cond_7

    .line 152
    .line 153
    move-object v0, v3

    .line 154
    goto :goto_3

    .line 155
    :cond_7
    move-object v2, p0

    .line 156
    :goto_2
    iget-object p2, v2, LIf/m;->b:Lkotlin/jvm/internal/G;

    .line 157
    .line 158
    sget-object v3, LEf/F;->a:LEf/F;

    .line 159
    .line 160
    new-instance v3, LIf/k;

    .line 161
    .line 162
    iget-object v4, v2, LIf/m;->e:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v4, LHf/m;

    .line 165
    .line 166
    iget-object v6, v2, LIf/m;->d:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v6, LIf/o;

    .line 169
    .line 170
    invoke-direct {v3, v6, v4, p1, v1}, LIf/k;-><init>(LIf/o;LHf/m;Ljava/lang/Object;Ljf/c;)V

    .line 171
    .line 172
    .line 173
    iget-object p1, v2, LIf/m;->c:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast p1, LEf/E;

    .line 176
    .line 177
    invoke-static {p1, v1, v3, v5}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    iput-object p1, p2, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 182
    .line 183
    :goto_3
    return-object v0

    .line 184
    nop

    .line 185
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
