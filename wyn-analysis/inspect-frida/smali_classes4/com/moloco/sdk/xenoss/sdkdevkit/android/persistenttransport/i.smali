.class public final Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/i;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:I

.field public final synthetic b:Lwd/c;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:[B

.field public final synthetic f:LJd/f;


# direct methods
.method public constructor <init>(Lwd/c;Ljava/lang/String;Ljava/lang/String;[BLJd/f;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/i;->b:Lwd/c;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/i;->c:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/i;->d:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/i;->e:[B

    .line 8
    .line 9
    iput-object p5, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/i;->f:LJd/f;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, Llf/j;-><init>(ILjf/c;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 7

    .line 1
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/i;

    .line 2
    .line 3
    iget-object v4, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/i;->e:[B

    .line 4
    .line 5
    iget-object v5, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/i;->f:LJd/f;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/i;->b:Lwd/c;

    .line 8
    .line 9
    iget-object v2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/i;->c:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/i;->d:Ljava/lang/String;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/i;-><init>(Lwd/c;Ljava/lang/String;Ljava/lang/String;[BLJd/f;Ljf/c;)V

    .line 15
    .line 16
    .line 17
    return-object v0
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
    invoke-virtual {p0, p1, p2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/i;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/i;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    iget v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/i;->a:I

    .line 4
    .line 5
    iget-object v2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/i;->c:Ljava/lang/String;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v3, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto/16 :goto_1

    .line 16
    .line 17
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 18
    .line 19
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 20
    .line 21
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw p1

    .line 25
    :cond_1
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    new-instance p1, LFd/c;

    .line 29
    .line 30
    invoke-direct {p1}, LFd/c;-><init>()V

    .line 31
    .line 32
    .line 33
    sget-object v1, LJd/s;->c:LJd/s;

    .line 34
    .line 35
    invoke-virtual {p1, v1}, LFd/c;->c(LJd/s;)V

    .line 36
    .line 37
    .line 38
    invoke-static {p1, v2}, LFd/e;->b(LFd/c;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/i;->d:Ljava/lang/String;

    .line 42
    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    invoke-static {v1}, LBf/k;->y0(Ljava/lang/CharSequence;)Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    xor-int/2addr v4, v3

    .line 50
    if-ne v4, v3, :cond_2

    .line 51
    .line 52
    new-instance v4, LAf/r;

    .line 53
    .line 54
    const/16 v5, 0x1a

    .line 55
    .line 56
    invoke-direct {v4, v1, v5}, LAf/r;-><init>(Ljava/lang/Object;I)V

    .line 57
    .line 58
    .line 59
    invoke-static {p1, v4}, LFd/e;->a(LJd/r;Ltf/l;)V

    .line 60
    .line 61
    .line 62
    :cond_2
    const/4 v1, 0x0

    .line 63
    const-class v4, [B

    .line 64
    .line 65
    iget-object v5, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/i;->e:[B

    .line 66
    .line 67
    if-nez v5, :cond_3

    .line 68
    .line 69
    sget-object v5, LMd/a;->a:LMd/a;

    .line 70
    .line 71
    iput-object v5, p1, LFd/c;->d:Ljava/lang/Object;

    .line 72
    .line 73
    sget-object v5, Lkotlin/jvm/internal/H;->a:Lkotlin/jvm/internal/I;

    .line 74
    .line 75
    invoke-virtual {v5, v4}, Lkotlin/jvm/internal/I;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    :try_start_0
    invoke-static {v4}, Lkotlin/jvm/internal/H;->b(Ljava/lang/Class;)Lkotlin/reflect/KType;

    .line 80
    .line 81
    .line 82
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    :catchall_0
    new-instance v4, LSd/a;

    .line 84
    .line 85
    invoke-direct {v4, v5, v1}, LSd/a;-><init>(Lkotlin/reflect/KClass;Lkotlin/reflect/KType;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1, v4}, LFd/c;->b(LSd/a;)V

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_3
    instance-of v6, v5, LMd/c;

    .line 93
    .line 94
    if-eqz v6, :cond_4

    .line 95
    .line 96
    iput-object v5, p1, LFd/c;->d:Ljava/lang/Object;

    .line 97
    .line 98
    invoke-virtual {p1, v1}, LFd/c;->b(LSd/a;)V

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_4
    iput-object v5, p1, LFd/c;->d:Ljava/lang/Object;

    .line 103
    .line 104
    sget-object v5, Lkotlin/jvm/internal/H;->a:Lkotlin/jvm/internal/I;

    .line 105
    .line 106
    invoke-virtual {v5, v4}, Lkotlin/jvm/internal/I;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    :try_start_1
    invoke-static {v4}, Lkotlin/jvm/internal/H;->b(Ljava/lang/Class;)Lkotlin/reflect/KType;

    .line 111
    .line 112
    .line 113
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 114
    :catchall_1
    new-instance v4, LSd/a;

    .line 115
    .line 116
    invoke-direct {v4, v5, v1}, LSd/a;-><init>(Lkotlin/reflect/KClass;Lkotlin/reflect/KType;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1, v4}, LFd/c;->b(LSd/a;)V

    .line 120
    .line 121
    .line 122
    :goto_0
    iget-object v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/i;->f:LJd/f;

    .line 123
    .line 124
    invoke-static {p1, v1}, Lff/B;->j(LFd/c;LJd/f;)V

    .line 125
    .line 126
    .line 127
    const-wide/16 v4, 0x1388

    .line 128
    .line 129
    invoke-static {p1, v4, v5}, LA6/h;->d(LFd/c;J)V

    .line 130
    .line 131
    .line 132
    sget-object v1, LJd/s;->c:LJd/s;

    .line 133
    .line 134
    invoke-virtual {p1, v1}, LFd/c;->c(LJd/s;)V

    .line 135
    .line 136
    .line 137
    new-instance v1, LS3/s;

    .line 138
    .line 139
    iget-object v4, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/i;->b:Lwd/c;

    .line 140
    .line 141
    invoke-direct {v1, p1, v4}, LS3/s;-><init>(LFd/c;Lwd/c;)V

    .line 142
    .line 143
    .line 144
    iput v3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/i;->a:I

    .line 145
    .line 146
    invoke-virtual {v1, p0}, LS3/s;->p(Llf/c;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    if-ne p1, v0, :cond_5

    .line 151
    .line 152
    return-object v0

    .line 153
    :cond_5
    :goto_1
    check-cast p1, LGd/a;

    .line 154
    .line 155
    invoke-virtual {p1}, LGd/a;->e()LJd/v;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    sget-object v4, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 160
    .line 161
    new-instance v0, Ljava/lang/StringBuilder;

    .line 162
    .line 163
    const-string v1, "Response status: "

    .line 164
    .line 165
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    const-string v1, " for url: "

    .line 172
    .line 173
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v6

    .line 183
    const-string v5, "HttpClient"

    .line 184
    .line 185
    const/4 v7, 0x0

    .line 186
    const/4 v8, 0x4

    .line 187
    const/4 v9, 0x0

    .line 188
    invoke-static/range {v4 .. v9}, Lcom/moloco/sdk/internal/MolocoLogger;->debugBuildLog$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    sget-object v0, LJd/v;->c:LJd/v;

    .line 192
    .line 193
    invoke-virtual {p1, v0}, LJd/v;->a(LJd/v;)I

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    if-ltz v0, :cond_6

    .line 198
    .line 199
    sget-object v0, LJd/v;->k:LJd/v;

    .line 200
    .line 201
    invoke-virtual {p1, v0}, LJd/v;->a(LJd/v;)I

    .line 202
    .line 203
    .line 204
    move-result p1

    .line 205
    if-gez p1, :cond_6

    .line 206
    .line 207
    goto :goto_2

    .line 208
    :cond_6
    const/4 v3, 0x0

    .line 209
    :goto_2
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    return-object p1
.end method
