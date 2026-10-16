.class public final Lcom/moloco/sdk/internal/ilrd/y;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public final synthetic a:Lcom/moloco/sdk/internal/ilrd/A;


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/internal/ilrd/A;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/moloco/sdk/internal/ilrd/y;->a:Lcom/moloco/sdk/internal/ilrd/A;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Llf/j;-><init>(ILjf/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 1

    .line 1
    new-instance p1, Lcom/moloco/sdk/internal/ilrd/y;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/moloco/sdk/internal/ilrd/y;->a:Lcom/moloco/sdk/internal/ilrd/A;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/moloco/sdk/internal/ilrd/y;-><init>(Lcom/moloco/sdk/internal/ilrd/A;Ljf/c;)V

    .line 6
    .line 7
    .line 8
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
    invoke-virtual {p0, p1, p2}, Lcom/moloco/sdk/internal/ilrd/y;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/moloco/sdk/internal/ilrd/y;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lcom/moloco/sdk/internal/ilrd/y;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    const/4 v0, 0x0

    .line 2
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 3
    .line 4
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lcom/moloco/sdk/internal/ilrd/y;->a:Lcom/moloco/sdk/internal/ilrd/A;

    .line 8
    .line 9
    iget-object v1, p1, Lcom/moloco/sdk/internal/ilrd/A;->c:Lef/p;

    .line 10
    .line 11
    invoke-virtual {v1}, Lef/p;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_5

    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Lcom/moloco/sdk/internal/ilrd/u;

    .line 32
    .line 33
    invoke-interface {v2}, Lcom/moloco/sdk/internal/ilrd/u;->getState()LHf/v0;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-interface {v3}, LHf/v0;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    check-cast v3, Lcom/moloco/sdk/internal/ilrd/E;

    .line 42
    .line 43
    instance-of v4, v3, Lcom/moloco/sdk/internal/ilrd/B;

    .line 44
    .line 45
    const-string v5, " ILRD: "

    .line 46
    .line 47
    const-string v6, "Failed to subscribe to "

    .line 48
    .line 49
    if-eqz v4, :cond_1

    .line 50
    .line 51
    sget-object v7, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 52
    .line 53
    new-instance v4, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-interface {v2}, Lcom/moloco/sdk/internal/ilrd/u;->a()Lcom/moloco/sdk/internal/ilrd/model/a;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    check-cast v3, Lcom/moloco/sdk/internal/ilrd/B;

    .line 69
    .line 70
    iget-object v2, v3, Lcom/moloco/sdk/internal/ilrd/B;->a:Ljava/lang/String;

    .line 71
    .line 72
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v9

    .line 79
    const/4 v10, 0x0

    .line 80
    const/4 v11, 0x0

    .line 81
    const-string v8, "IlrdService"

    .line 82
    .line 83
    const/16 v12, 0xc

    .line 84
    .line 85
    const/4 v13, 0x0

    .line 86
    invoke-static/range {v7 .. v13}, Lcom/moloco/sdk/internal/MolocoLogger;->warn$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_1
    instance-of v4, v3, Lcom/moloco/sdk/internal/ilrd/D;

    .line 91
    .line 92
    if-eqz v4, :cond_3

    .line 93
    .line 94
    invoke-interface {v2}, Lcom/moloco/sdk/internal/ilrd/u;->b()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    invoke-static {v3}, Lef/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    if-eqz v4, :cond_2

    .line 103
    .line 104
    sget-object v7, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 105
    .line 106
    new-instance v8, Ljava/lang/StringBuilder;

    .line 107
    .line 108
    invoke-direct {v8, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-interface {v2}, Lcom/moloco/sdk/internal/ilrd/u;->a()Lcom/moloco/sdk/internal/ilrd/model/a;

    .line 112
    .line 113
    .line 114
    move-result-object v6

    .line 115
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v9

    .line 128
    const/4 v10, 0x0

    .line 129
    const/4 v11, 0x0

    .line 130
    const-string v8, "IlrdService"

    .line 131
    .line 132
    const/16 v12, 0xc

    .line 133
    .line 134
    const/4 v13, 0x0

    .line 135
    invoke-static/range {v7 .. v13}, Lcom/moloco/sdk/internal/MolocoLogger;->warn$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    :cond_2
    instance-of v4, v3, Lef/m;

    .line 139
    .line 140
    if-nez v4, :cond_0

    .line 141
    .line 142
    check-cast v3, Lef/C;

    .line 143
    .line 144
    iget-object v3, p1, Lcom/moloco/sdk/internal/ilrd/A;->d:Ljava/util/Set;

    .line 145
    .line 146
    invoke-interface {v3, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    invoke-interface {v2}, Lcom/moloco/sdk/internal/ilrd/u;->c()LHf/g0;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    new-instance v3, Lcom/moloco/sdk/internal/ilrd/z;

    .line 154
    .line 155
    const/4 v4, 0x0

    .line 156
    invoke-direct {v3, p1, v4}, Lcom/moloco/sdk/internal/ilrd/z;-><init>(Lcom/moloco/sdk/internal/ilrd/A;Ljf/c;)V

    .line 157
    .line 158
    .line 159
    new-instance v4, LHf/Z;

    .line 160
    .line 161
    invoke-direct {v4, v2, v3, v0}, LHf/Z;-><init>(LHf/l;Ljava/lang/Object;I)V

    .line 162
    .line 163
    .line 164
    iget-object v2, p1, Lcom/moloco/sdk/internal/ilrd/A;->a:LKd/a;

    .line 165
    .line 166
    invoke-static {v4, v2}, LHf/k0;->u(LHf/l;LEf/E;)LEf/H0;

    .line 167
    .line 168
    .line 169
    goto/16 :goto_0

    .line 170
    .line 171
    :cond_3
    instance-of v2, v3, Lcom/moloco/sdk/internal/ilrd/C;

    .line 172
    .line 173
    if-eqz v2, :cond_4

    .line 174
    .line 175
    goto/16 :goto_0

    .line 176
    .line 177
    :cond_4
    new-instance p1, LE5/Q;

    .line 178
    .line 179
    const/16 v1, 0x9

    .line 180
    .line 181
    invoke-direct {p1, v0, v1}, LE5/Q;-><init>(BI)V

    .line 182
    .line 183
    .line 184
    throw p1

    .line 185
    :cond_5
    sget-object p1, Lef/C;->a:Lef/C;

    .line 186
    .line 187
    return-object p1
.end method
