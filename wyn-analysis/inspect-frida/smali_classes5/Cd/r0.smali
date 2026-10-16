.class public final LCd/r0;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/q;


# instance fields
.field public final synthetic a:I

.field public b:I

.field public synthetic c:LRd/e;

.field public final synthetic d:Ltf/q;


# direct methods
.method public synthetic constructor <init>(Ltf/q;Ljf/c;I)V
    .locals 0

    .line 1
    iput p3, p0, LCd/r0;->a:I

    iput-object p1, p0, LCd/r0;->d:Ltf/q;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Llf/j;-><init>(ILjf/c;)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, LCd/r0;->a:I

    .line 2
    .line 3
    check-cast p1, LRd/e;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p3, Ljf/c;

    .line 9
    .line 10
    new-instance p2, LCd/r0;

    .line 11
    .line 12
    iget-object v0, p0, LCd/r0;->d:Ltf/q;

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    invoke-direct {p2, v0, p3, v1}, LCd/r0;-><init>(Ltf/q;Ljf/c;I)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p2, LCd/r0;->c:LRd/e;

    .line 19
    .line 20
    sget-object p1, Lef/C;->a:Lef/C;

    .line 21
    .line 22
    invoke-virtual {p2, p1}, LCd/r0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1

    .line 27
    :pswitch_0
    check-cast p3, Ljf/c;

    .line 28
    .line 29
    new-instance p2, LCd/r0;

    .line 30
    .line 31
    iget-object v0, p0, LCd/r0;->d:Ltf/q;

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    invoke-direct {p2, v0, p3, v1}, LCd/r0;-><init>(Ltf/q;Ljf/c;I)V

    .line 35
    .line 36
    .line 37
    iput-object p1, p2, LCd/r0;->c:LRd/e;

    .line 38
    .line 39
    sget-object p1, Lef/C;->a:Lef/C;

    .line 40
    .line 41
    invoke-virtual {p2, p1}, LCd/r0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    return-object p1

    .line 46
    :pswitch_1
    check-cast p2, LGd/c;

    .line 47
    .line 48
    check-cast p3, Ljf/c;

    .line 49
    .line 50
    new-instance p2, LCd/r0;

    .line 51
    .line 52
    iget-object v0, p0, LCd/r0;->d:Ltf/q;

    .line 53
    .line 54
    const/4 v1, 0x0

    .line 55
    invoke-direct {p2, v0, p3, v1}, LCd/r0;-><init>(Ltf/q;Ljf/c;I)V

    .line 56
    .line 57
    .line 58
    iput-object p1, p2, LCd/r0;->c:LRd/e;

    .line 59
    .line 60
    sget-object p1, Lef/C;->a:Lef/C;

    .line 61
    .line 62
    invoke-virtual {p2, p1}, LCd/r0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    return-object p1

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    const/4 v1, 0x0

    .line 2
    const/4 v2, 0x2

    .line 3
    sget-object v3, Lef/C;->a:Lef/C;

    .line 4
    .line 5
    iget-object v4, p0, LCd/r0;->d:Ltf/q;

    .line 6
    .line 7
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    const/4 v5, 0x1

    .line 10
    iget v6, p0, LCd/r0;->a:I

    .line 11
    .line 12
    packed-switch v6, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 16
    .line 17
    iget v2, p0, LCd/r0;->b:I

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    if-ne v2, v5, :cond_0

    .line 22
    .line 23
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

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
    iget-object v8, p0, LCd/r0;->c:LRd/e;

    .line 37
    .line 38
    iget-object p1, v8, LRd/e;->a:Ljava/lang/Object;

    .line 39
    .line 40
    new-instance v6, LCd/v0;

    .line 41
    .line 42
    const-string v11, "proceed(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"

    .line 43
    .line 44
    const/16 v12, 0x8

    .line 45
    .line 46
    const/4 v7, 0x1

    .line 47
    const-class v9, LRd/e;

    .line 48
    .line 49
    const-string v10, "proceed"

    .line 50
    .line 51
    invoke-direct/range {v6 .. v12}, Lkotlin/jvm/internal/a;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 52
    .line 53
    .line 54
    iput v5, p0, LCd/r0;->b:I

    .line 55
    .line 56
    invoke-interface {v4, p1, v6, p0}, Ltf/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    if-ne p1, v1, :cond_2

    .line 61
    .line 62
    move-object v3, v1

    .line 63
    :cond_2
    :goto_0
    return-object v3

    .line 64
    :pswitch_0
    sget-object v6, Lkf/a;->a:Lkf/a;

    .line 65
    .line 66
    iget v7, p0, LCd/r0;->b:I

    .line 67
    .line 68
    if-eqz v7, :cond_5

    .line 69
    .line 70
    if-eq v7, v5, :cond_4

    .line 71
    .line 72
    if-ne v7, v2, :cond_3

    .line 73
    .line 74
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    goto :goto_4

    .line 78
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 79
    .line 80
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw p1

    .line 84
    :cond_4
    iget-object v5, p0, LCd/r0;->c:LRd/e;

    .line 85
    .line 86
    :try_start_0
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 87
    .line 88
    .line 89
    goto :goto_5

    .line 90
    :catchall_0
    move-exception v0

    .line 91
    :goto_1
    move-object p1, v0

    .line 92
    goto :goto_2

    .line 93
    :cond_5
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    iget-object p1, p0, LCd/r0;->c:LRd/e;

    .line 97
    .line 98
    :try_start_1
    iput-object p1, p0, LCd/r0;->c:LRd/e;

    .line 99
    .line 100
    iput v5, p0, LCd/r0;->b:I

    .line 101
    .line 102
    invoke-virtual {p1, p0}, LRd/e;->d(Ljf/c;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 106
    if-ne p1, v6, :cond_7

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :catchall_1
    move-exception v0

    .line 110
    move-object v5, p1

    .line 111
    goto :goto_1

    .line 112
    :goto_2
    iget-object v0, v5, LRd/e;->a:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v0, LFd/c;

    .line 115
    .line 116
    sget-object v5, LCd/F;->a:Lvg/b;

    .line 117
    .line 118
    new-instance v5, LCd/E;

    .line 119
    .line 120
    invoke-direct {v5, v0}, LCd/E;-><init>(LFd/c;)V

    .line 121
    .line 122
    .line 123
    iput-object v1, p0, LCd/r0;->c:LRd/e;

    .line 124
    .line 125
    iput v2, p0, LCd/r0;->b:I

    .line 126
    .line 127
    invoke-interface {v4, v5, p1, p0}, Ltf/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    if-ne p1, v6, :cond_6

    .line 132
    .line 133
    :goto_3
    move-object v3, v6

    .line 134
    goto :goto_5

    .line 135
    :cond_6
    :goto_4
    check-cast p1, Ljava/lang/Throwable;

    .line 136
    .line 137
    if-nez p1, :cond_8

    .line 138
    .line 139
    :cond_7
    :goto_5
    return-object v3

    .line 140
    :cond_8
    throw p1

    .line 141
    :pswitch_1
    sget-object v6, Lkf/a;->a:Lkf/a;

    .line 142
    .line 143
    iget v7, p0, LCd/r0;->b:I

    .line 144
    .line 145
    if-eqz v7, :cond_b

    .line 146
    .line 147
    if-eq v7, v5, :cond_a

    .line 148
    .line 149
    if-ne v7, v2, :cond_9

    .line 150
    .line 151
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    goto :goto_9

    .line 155
    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 156
    .line 157
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    throw p1

    .line 161
    :cond_a
    iget-object v5, p0, LCd/r0;->c:LRd/e;

    .line 162
    .line 163
    :try_start_2
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 164
    .line 165
    .line 166
    goto :goto_a

    .line 167
    :catchall_2
    move-exception v0

    .line 168
    :goto_6
    move-object p1, v0

    .line 169
    goto :goto_7

    .line 170
    :cond_b
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    iget-object p1, p0, LCd/r0;->c:LRd/e;

    .line 174
    .line 175
    :try_start_3
    iput-object p1, p0, LCd/r0;->c:LRd/e;

    .line 176
    .line 177
    iput v5, p0, LCd/r0;->b:I

    .line 178
    .line 179
    invoke-virtual {p1, p0}, LRd/e;->d(Ljf/c;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 183
    if-ne p1, v6, :cond_d

    .line 184
    .line 185
    goto :goto_8

    .line 186
    :catchall_3
    move-exception v0

    .line 187
    move-object v5, p1

    .line 188
    goto :goto_6

    .line 189
    :goto_7
    iget-object v0, v5, LRd/e;->a:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast v0, Lxd/c;

    .line 192
    .line 193
    invoke-virtual {v0}, Lxd/c;->d()LFd/b;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    iput-object v1, p0, LCd/r0;->c:LRd/e;

    .line 198
    .line 199
    iput v2, p0, LCd/r0;->b:I

    .line 200
    .line 201
    invoke-interface {v4, v0, p1, p0}, Ltf/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    if-ne p1, v6, :cond_c

    .line 206
    .line 207
    :goto_8
    move-object v3, v6

    .line 208
    goto :goto_a

    .line 209
    :cond_c
    :goto_9
    check-cast p1, Ljava/lang/Throwable;

    .line 210
    .line 211
    if-nez p1, :cond_e

    .line 212
    .line 213
    :cond_d
    :goto_a
    return-object v3

    .line 214
    :cond_e
    throw p1

    .line 215
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
