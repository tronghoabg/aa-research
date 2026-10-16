.class public final Lio/ktor/utils/io/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/ktor/utils/io/t;
.implements Lio/ktor/utils/io/J;


# static fields
.field public static final synthetic f:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field volatile synthetic _closedCause:Ljava/lang/Object;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:LPf/a;

.field public final c:Ljava/lang/Object;

.field public final d:LPf/a;

.field public final e:LPf/a;

.field private volatile flushBufferSize:I

.field volatile synthetic suspensionSlot:Ljava/lang/Object;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "suspensionSlot"

    const-class v1, Lio/ktor/utils/io/m;

    const-class v2, Ljava/lang/Object;

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lio/ktor/utils/io/m;->f:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "_closedCause"

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lio/ktor/utils/io/m;->g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LPf/a;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lio/ktor/utils/io/m;->b:LPf/a;

    .line 10
    .line 11
    new-instance v0, Ljava/lang/Object;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lio/ktor/utils/io/m;->c:Ljava/lang/Object;

    .line 17
    .line 18
    sget-object v0, Lio/ktor/utils/io/c;->b:Lio/ktor/utils/io/c;

    .line 19
    .line 20
    iput-object v0, p0, Lio/ktor/utils/io/m;->suspensionSlot:Ljava/lang/Object;

    .line 21
    .line 22
    new-instance v0, LPf/a;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lio/ktor/utils/io/m;->d:LPf/a;

    .line 28
    .line 29
    new-instance v0, LPf/a;

    .line 30
    .line 31
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Lio/ktor/utils/io/m;->e:LPf/a;

    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    iput-object v0, p0, Lio/ktor/utils/io/m;->_closedCause:Ljava/lang/Object;

    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/ktor/utils/io/m;->_closedCause:Ljava/lang/Object;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Lio/ktor/utils/io/S;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lio/ktor/utils/io/S;-><init>(Ljava/lang/Throwable;)V

    .line 9
    .line 10
    .line 11
    sget-object p1, Lio/ktor/utils/io/m;->g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 12
    .line 13
    :cond_1
    const/4 v1, 0x0

    .line 14
    invoke-virtual {p1, p0, v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_2

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_2
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    :goto_0
    sget-object p1, Lio/ktor/utils/io/Q;->a:Lio/ktor/utils/io/Q;

    .line 28
    .line 29
    invoke-virtual {v0, p1}, Lio/ktor/utils/io/S;->a(Ltf/l;)Ljava/lang/Throwable;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p0, p1}, Lio/ktor/utils/io/m;->i(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final b()Ljava/lang/Throwable;
    .locals 2

    .line 1
    iget-object v0, p0, Lio/ktor/utils/io/m;->_closedCause:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/ktor/utils/io/S;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v1, Lio/ktor/utils/io/Q;->a:Lio/ktor/utils/io/Q;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lio/ktor/utils/io/S;->a(Ltf/l;)Ljava/lang/Throwable;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return-object v0
.end method

.method public final c()LPf/a;
    .locals 2

    .line 1
    iget-object v0, p0, Lio/ktor/utils/io/m;->_closedCause:Ljava/lang/Object;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-object v0, p0, Lio/ktor/utils/io/m;->_closedCause:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lio/ktor/utils/io/S;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    sget-object v1, Lio/ktor/utils/io/l;->a:Lio/ktor/utils/io/l;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lio/ktor/utils/io/S;->a(Ltf/l;)Ljava/lang/Throwable;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    throw v0

    .line 21
    :cond_1
    :goto_0
    new-instance v0, Lio/ktor/utils/io/V;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-direct {v0, v1, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    throw v0

    .line 28
    :cond_2
    iget-object v0, p0, Lio/ktor/utils/io/m;->e:LPf/a;

    .line 29
    .line 30
    return-object v0
.end method

.method public final d()LPf/a;
    .locals 2

    .line 1
    iget-object v0, p0, Lio/ktor/utils/io/m;->_closedCause:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/ktor/utils/io/S;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    sget-object v1, Lio/ktor/utils/io/k;->a:Lio/ktor/utils/io/k;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lio/ktor/utils/io/S;->a(Ltf/l;)Ljava/lang/Throwable;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    throw v0

    .line 17
    :cond_1
    :goto_0
    iget-object v0, p0, Lio/ktor/utils/io/m;->d:LPf/a;

    .line 18
    .line 19
    invoke-virtual {v0}, LPf/a;->exhausted()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    invoke-virtual {p0}, Lio/ktor/utils/io/m;->k()V

    .line 26
    .line 27
    .line 28
    :cond_2
    iget-object v0, p0, Lio/ktor/utils/io/m;->d:LPf/a;

    .line 29
    .line 30
    return-object v0
.end method

.method public final e(Llf/c;)Ljava/lang/Object;
    .locals 12

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    instance-of v1, p1, Lio/ktor/utils/io/i;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, p1

    .line 8
    check-cast v1, Lio/ktor/utils/io/i;

    .line 9
    .line 10
    iget v2, v1, Lio/ktor/utils/io/i;->d:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Lio/ktor/utils/io/i;->d:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Lio/ktor/utils/io/i;

    .line 23
    .line 24
    invoke-direct {v1, p0, p1}, Lio/ktor/utils/io/i;-><init>(Lio/ktor/utils/io/m;Llf/c;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p1, v1, Lio/ktor/utils/io/i;->b:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v2, Lkf/a;->a:Lkf/a;

    .line 30
    .line 31
    iget v3, v1, Lio/ktor/utils/io/i;->d:I

    .line 32
    .line 33
    sget-object v4, Lef/C;->a:Lef/C;

    .line 34
    .line 35
    const/high16 v5, 0x100000

    .line 36
    .line 37
    const/4 v6, 0x1

    .line 38
    if-eqz v3, :cond_2

    .line 39
    .line 40
    if-ne v3, v6, :cond_1

    .line 41
    .line 42
    iget-object v3, v1, Lio/ktor/utils/io/i;->a:Lio/ktor/utils/io/m;

    .line 43
    .line 44
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p1

    .line 56
    :cond_2
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Lio/ktor/utils/io/m;->b()Ljava/lang/Throwable;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    if-nez p1, :cond_11

    .line 64
    .line 65
    invoke-virtual {p0}, Lio/ktor/utils/io/m;->j()V

    .line 66
    .line 67
    .line 68
    iget p1, p0, Lio/ktor/utils/io/m;->flushBufferSize:I

    .line 69
    .line 70
    if-ge p1, v5, :cond_3

    .line 71
    .line 72
    goto/16 :goto_5

    .line 73
    .line 74
    :cond_3
    move-object v3, p0

    .line 75
    :cond_4
    :goto_1
    iget p1, p0, Lio/ktor/utils/io/m;->flushBufferSize:I

    .line 76
    .line 77
    if-lt p1, v5, :cond_10

    .line 78
    .line 79
    iget-object p1, p0, Lio/ktor/utils/io/m;->_closedCause:Ljava/lang/Object;

    .line 80
    .line 81
    if-nez p1, :cond_10

    .line 82
    .line 83
    iput-object v3, v1, Lio/ktor/utils/io/i;->a:Lio/ktor/utils/io/m;

    .line 84
    .line 85
    iput v6, v1, Lio/ktor/utils/io/i;->d:I

    .line 86
    .line 87
    new-instance p1, LEf/n;

    .line 88
    .line 89
    invoke-static {v1}, LA6/h;->A(Ljf/c;)Ljf/c;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    invoke-direct {p1, v6, v7}, LEf/n;-><init>(ILjf/c;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1}, LEf/n;->t()V

    .line 97
    .line 98
    .line 99
    new-instance v7, Lio/ktor/utils/io/f;

    .line 100
    .line 101
    invoke-direct {v7, p1}, Lio/ktor/utils/io/f;-><init>(LEf/n;)V

    .line 102
    .line 103
    .line 104
    iget-object v8, v3, Lio/ktor/utils/io/m;->suspensionSlot:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v8, Lio/ktor/utils/io/g;

    .line 107
    .line 108
    instance-of v9, v8, Lio/ktor/utils/io/a;

    .line 109
    .line 110
    if-nez v9, :cond_7

    .line 111
    .line 112
    sget-object v10, Lio/ktor/utils/io/m;->f:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 113
    .line 114
    :cond_5
    invoke-virtual {v10, v3, v8, v7}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v11

    .line 118
    if-eqz v11, :cond_6

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_6
    invoke-virtual {v10, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v11

    .line 125
    if-eq v11, v8, :cond_5

    .line 126
    .line 127
    invoke-virtual {v7}, Lio/ktor/utils/io/f;->resume()V

    .line 128
    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_7
    :goto_2
    instance-of v10, v8, Lio/ktor/utils/io/f;

    .line 132
    .line 133
    sget-object v11, Lio/ktor/utils/io/c;->b:Lio/ktor/utils/io/c;

    .line 134
    .line 135
    if-eqz v10, :cond_8

    .line 136
    .line 137
    check-cast v8, Lio/ktor/utils/io/e;

    .line 138
    .line 139
    new-instance v7, LCd/s0;

    .line 140
    .line 141
    invoke-interface {v8}, Lio/ktor/utils/io/e;->b()Ljava/lang/Throwable;

    .line 142
    .line 143
    .line 144
    move-result-object v9

    .line 145
    const-string v10, "write"

    .line 146
    .line 147
    invoke-direct {v7, v10, v9, v0}, LCd/s0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;I)V

    .line 148
    .line 149
    .line 150
    invoke-interface {v8, v7}, Lio/ktor/utils/io/e;->a(Ljava/lang/Throwable;)V

    .line 151
    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_8
    instance-of v10, v8, Lio/ktor/utils/io/e;

    .line 155
    .line 156
    if-eqz v10, :cond_9

    .line 157
    .line 158
    check-cast v8, Lio/ktor/utils/io/e;

    .line 159
    .line 160
    invoke-interface {v8}, Lio/ktor/utils/io/e;->resume()V

    .line 161
    .line 162
    .line 163
    goto :goto_3

    .line 164
    :cond_9
    if-eqz v9, :cond_a

    .line 165
    .line 166
    check-cast v8, Lio/ktor/utils/io/a;

    .line 167
    .line 168
    iget-object v8, v8, Lio/ktor/utils/io/a;->b:Ljava/lang/Throwable;

    .line 169
    .line 170
    invoke-virtual {v7, v8}, Lio/ktor/utils/io/f;->a(Ljava/lang/Throwable;)V

    .line 171
    .line 172
    .line 173
    goto :goto_4

    .line 174
    :cond_a
    invoke-static {v8, v11}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v7

    .line 178
    if-eqz v7, :cond_f

    .line 179
    .line 180
    :goto_3
    iget v7, p0, Lio/ktor/utils/io/m;->flushBufferSize:I

    .line 181
    .line 182
    if-lt v7, v5, :cond_b

    .line 183
    .line 184
    iget-object v7, p0, Lio/ktor/utils/io/m;->_closedCause:Ljava/lang/Object;

    .line 185
    .line 186
    if-nez v7, :cond_b

    .line 187
    .line 188
    goto :goto_4

    .line 189
    :cond_b
    iget-object v7, v3, Lio/ktor/utils/io/m;->suspensionSlot:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast v7, Lio/ktor/utils/io/g;

    .line 192
    .line 193
    instance-of v8, v7, Lio/ktor/utils/io/f;

    .line 194
    .line 195
    if-eqz v8, :cond_e

    .line 196
    .line 197
    sget-object v8, Lio/ktor/utils/io/m;->f:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 198
    .line 199
    :cond_c
    invoke-virtual {v8, v3, v7, v11}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result v9

    .line 203
    if-eqz v9, :cond_d

    .line 204
    .line 205
    check-cast v7, Lio/ktor/utils/io/e;

    .line 206
    .line 207
    invoke-interface {v7}, Lio/ktor/utils/io/e;->resume()V

    .line 208
    .line 209
    .line 210
    goto :goto_4

    .line 211
    :cond_d
    invoke-virtual {v8, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v9

    .line 215
    if-eq v9, v7, :cond_c

    .line 216
    .line 217
    :cond_e
    :goto_4
    invoke-virtual {p1}, LEf/n;->s()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object p1

    .line 221
    sget-object v7, Lkf/a;->a:Lkf/a;

    .line 222
    .line 223
    if-ne p1, v2, :cond_4

    .line 224
    .line 225
    return-object v2

    .line 226
    :cond_f
    new-instance p1, LE5/Q;

    .line 227
    .line 228
    const/4 v1, 0x0

    .line 229
    invoke-direct {p1, v1, v0}, LE5/Q;-><init>(BI)V

    .line 230
    .line 231
    .line 232
    throw p1

    .line 233
    :cond_10
    :goto_5
    return-object v4

    .line 234
    :cond_11
    throw p1
.end method

.method public final f(Ljf/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lio/ktor/utils/io/j;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lio/ktor/utils/io/j;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/utils/io/j;->c:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lio/ktor/utils/io/j;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/utils/io/j;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lio/ktor/utils/io/j;-><init>(Lio/ktor/utils/io/m;Ljf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lio/ktor/utils/io/j;->a:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/utils/io/j;->c:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    :try_start_0
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    goto :goto_2

    .line 40
    :catchall_0
    move-exception p1

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    :try_start_1
    iput v3, v0, Lio/ktor/utils/io/j;->c:I

    .line 54
    .line 55
    invoke-virtual {p0, v0}, Lio/ktor/utils/io/m;->e(Llf/c;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 59
    if-ne p1, v1, :cond_3

    .line 60
    .line 61
    return-object v1

    .line 62
    :goto_1
    invoke-static {p1}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 63
    .line 64
    .line 65
    :cond_3
    :goto_2
    sget-object p1, Lio/ktor/utils/io/N;->b:Lio/ktor/utils/io/S;

    .line 66
    .line 67
    :cond_4
    sget-object v0, Lio/ktor/utils/io/m;->g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 68
    .line 69
    const/4 v1, 0x0

    .line 70
    invoke-virtual {v0, p0, v1, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    sget-object v3, Lef/C;->a:Lef/C;

    .line 75
    .line 76
    if-eqz v2, :cond_5

    .line 77
    .line 78
    invoke-virtual {p0, v1}, Lio/ktor/utils/io/m;->i(Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    return-object v3

    .line 82
    :cond_5
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    if-eqz v0, :cond_4

    .line 87
    .line 88
    return-object v3
.end method

.method public final g(ILlf/c;)Ljava/lang/Object;
    .locals 13

    .line 1
    const/4 v0, 0x0

    .line 2
    const/16 v1, 0x9

    .line 3
    .line 4
    instance-of v2, p2, Lio/ktor/utils/io/h;

    .line 5
    .line 6
    if-eqz v2, :cond_0

    .line 7
    .line 8
    move-object v2, p2

    .line 9
    check-cast v2, Lio/ktor/utils/io/h;

    .line 10
    .line 11
    iget v3, v2, Lio/ktor/utils/io/h;->e:I

    .line 12
    .line 13
    const/high16 v4, -0x80000000

    .line 14
    .line 15
    and-int v5, v3, v4

    .line 16
    .line 17
    if-eqz v5, :cond_0

    .line 18
    .line 19
    sub-int/2addr v3, v4

    .line 20
    iput v3, v2, Lio/ktor/utils/io/h;->e:I

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance v2, Lio/ktor/utils/io/h;

    .line 24
    .line 25
    invoke-direct {v2, p0, p2}, Lio/ktor/utils/io/h;-><init>(Lio/ktor/utils/io/m;Llf/c;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    iget-object p2, v2, Lio/ktor/utils/io/h;->c:Ljava/lang/Object;

    .line 29
    .line 30
    sget-object v3, Lkf/a;->a:Lkf/a;

    .line 31
    .line 32
    iget v4, v2, Lio/ktor/utils/io/h;->e:I

    .line 33
    .line 34
    const/4 v5, 0x1

    .line 35
    if-eqz v4, :cond_2

    .line 36
    .line 37
    if-ne v4, v5, :cond_1

    .line 38
    .line 39
    iget p1, v2, Lio/ktor/utils/io/h;->a:I

    .line 40
    .line 41
    iget-object v4, v2, Lio/ktor/utils/io/h;->b:Lio/ktor/utils/io/m;

    .line 42
    .line 43
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 48
    .line 49
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_2
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Lio/ktor/utils/io/m;->b()Ljava/lang/Throwable;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    if-nez p2, :cond_13

    .line 63
    .line 64
    iget-object p2, p0, Lio/ktor/utils/io/m;->d:LPf/a;

    .line 65
    .line 66
    iget-wide v6, p2, LPf/a;->c:J

    .line 67
    .line 68
    int-to-long v8, p1

    .line 69
    cmp-long p2, v6, v8

    .line 70
    .line 71
    if-ltz p2, :cond_3

    .line 72
    .line 73
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 74
    .line 75
    return-object p1

    .line 76
    :cond_3
    move-object v4, p0

    .line 77
    :cond_4
    :goto_1
    iget p2, p0, Lio/ktor/utils/io/m;->flushBufferSize:I

    .line 78
    .line 79
    int-to-long v6, p2

    .line 80
    iget-object p2, p0, Lio/ktor/utils/io/m;->d:LPf/a;

    .line 81
    .line 82
    iget-wide v8, p2, LPf/a;->c:J

    .line 83
    .line 84
    add-long/2addr v6, v8

    .line 85
    int-to-long v8, p1

    .line 86
    cmp-long p2, v6, v8

    .line 87
    .line 88
    if-gez p2, :cond_10

    .line 89
    .line 90
    iget-object p2, p0, Lio/ktor/utils/io/m;->_closedCause:Ljava/lang/Object;

    .line 91
    .line 92
    if-nez p2, :cond_10

    .line 93
    .line 94
    iput-object v4, v2, Lio/ktor/utils/io/h;->b:Lio/ktor/utils/io/m;

    .line 95
    .line 96
    iput p1, v2, Lio/ktor/utils/io/h;->a:I

    .line 97
    .line 98
    iput v5, v2, Lio/ktor/utils/io/h;->e:I

    .line 99
    .line 100
    new-instance p2, LEf/n;

    .line 101
    .line 102
    invoke-static {v2}, LA6/h;->A(Ljf/c;)Ljf/c;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    invoke-direct {p2, v5, v6}, LEf/n;-><init>(ILjf/c;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p2}, LEf/n;->t()V

    .line 110
    .line 111
    .line 112
    new-instance v6, Lio/ktor/utils/io/d;

    .line 113
    .line 114
    invoke-direct {v6, p2}, Lio/ktor/utils/io/d;-><init>(LEf/n;)V

    .line 115
    .line 116
    .line 117
    iget-object v7, v4, Lio/ktor/utils/io/m;->suspensionSlot:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v7, Lio/ktor/utils/io/g;

    .line 120
    .line 121
    instance-of v10, v7, Lio/ktor/utils/io/a;

    .line 122
    .line 123
    if-nez v10, :cond_7

    .line 124
    .line 125
    sget-object v11, Lio/ktor/utils/io/m;->f:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 126
    .line 127
    :cond_5
    invoke-virtual {v11, v4, v7, v6}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v12

    .line 131
    if-eqz v12, :cond_6

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_6
    invoke-virtual {v11, v4}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v12

    .line 138
    if-eq v12, v7, :cond_5

    .line 139
    .line 140
    invoke-virtual {v6}, Lio/ktor/utils/io/d;->resume()V

    .line 141
    .line 142
    .line 143
    goto :goto_4

    .line 144
    :cond_7
    :goto_2
    instance-of v11, v7, Lio/ktor/utils/io/d;

    .line 145
    .line 146
    sget-object v12, Lio/ktor/utils/io/c;->b:Lio/ktor/utils/io/c;

    .line 147
    .line 148
    if-eqz v11, :cond_8

    .line 149
    .line 150
    check-cast v7, Lio/ktor/utils/io/e;

    .line 151
    .line 152
    new-instance v6, LCd/s0;

    .line 153
    .line 154
    invoke-interface {v7}, Lio/ktor/utils/io/e;->b()Ljava/lang/Throwable;

    .line 155
    .line 156
    .line 157
    move-result-object v10

    .line 158
    const-string v11, "read"

    .line 159
    .line 160
    invoke-direct {v6, v11, v10, v1}, LCd/s0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;I)V

    .line 161
    .line 162
    .line 163
    invoke-interface {v7, v6}, Lio/ktor/utils/io/e;->a(Ljava/lang/Throwable;)V

    .line 164
    .line 165
    .line 166
    goto :goto_3

    .line 167
    :cond_8
    instance-of v11, v7, Lio/ktor/utils/io/e;

    .line 168
    .line 169
    if-eqz v11, :cond_9

    .line 170
    .line 171
    check-cast v7, Lio/ktor/utils/io/e;

    .line 172
    .line 173
    invoke-interface {v7}, Lio/ktor/utils/io/e;->resume()V

    .line 174
    .line 175
    .line 176
    goto :goto_3

    .line 177
    :cond_9
    if-eqz v10, :cond_a

    .line 178
    .line 179
    check-cast v7, Lio/ktor/utils/io/a;

    .line 180
    .line 181
    iget-object v7, v7, Lio/ktor/utils/io/a;->b:Ljava/lang/Throwable;

    .line 182
    .line 183
    invoke-virtual {v6, v7}, Lio/ktor/utils/io/d;->a(Ljava/lang/Throwable;)V

    .line 184
    .line 185
    .line 186
    goto :goto_4

    .line 187
    :cond_a
    invoke-static {v7, v12}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v6

    .line 191
    if-eqz v6, :cond_f

    .line 192
    .line 193
    :goto_3
    iget v6, p0, Lio/ktor/utils/io/m;->flushBufferSize:I

    .line 194
    .line 195
    int-to-long v6, v6

    .line 196
    iget-object v10, p0, Lio/ktor/utils/io/m;->d:LPf/a;

    .line 197
    .line 198
    iget-wide v10, v10, LPf/a;->c:J

    .line 199
    .line 200
    add-long/2addr v6, v10

    .line 201
    cmp-long v6, v6, v8

    .line 202
    .line 203
    if-gez v6, :cond_b

    .line 204
    .line 205
    iget-object v6, p0, Lio/ktor/utils/io/m;->_closedCause:Ljava/lang/Object;

    .line 206
    .line 207
    if-nez v6, :cond_b

    .line 208
    .line 209
    goto :goto_4

    .line 210
    :cond_b
    iget-object v6, v4, Lio/ktor/utils/io/m;->suspensionSlot:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v6, Lio/ktor/utils/io/g;

    .line 213
    .line 214
    instance-of v7, v6, Lio/ktor/utils/io/d;

    .line 215
    .line 216
    if-eqz v7, :cond_e

    .line 217
    .line 218
    sget-object v7, Lio/ktor/utils/io/m;->f:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 219
    .line 220
    :cond_c
    invoke-virtual {v7, v4, v6, v12}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    move-result v8

    .line 224
    if-eqz v8, :cond_d

    .line 225
    .line 226
    check-cast v6, Lio/ktor/utils/io/e;

    .line 227
    .line 228
    invoke-interface {v6}, Lio/ktor/utils/io/e;->resume()V

    .line 229
    .line 230
    .line 231
    goto :goto_4

    .line 232
    :cond_d
    invoke-virtual {v7, v4}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v8

    .line 236
    if-eq v8, v6, :cond_c

    .line 237
    .line 238
    :cond_e
    :goto_4
    invoke-virtual {p2}, LEf/n;->s()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object p2

    .line 242
    sget-object v6, Lkf/a;->a:Lkf/a;

    .line 243
    .line 244
    if-ne p2, v3, :cond_4

    .line 245
    .line 246
    return-object v3

    .line 247
    :cond_f
    new-instance p1, LE5/Q;

    .line 248
    .line 249
    invoke-direct {p1, v0, v1}, LE5/Q;-><init>(BI)V

    .line 250
    .line 251
    .line 252
    throw p1

    .line 253
    :cond_10
    iget-object p1, p0, Lio/ktor/utils/io/m;->d:LPf/a;

    .line 254
    .line 255
    iget-wide p1, p1, LPf/a;->c:J

    .line 256
    .line 257
    const-wide/32 v1, 0x100000

    .line 258
    .line 259
    .line 260
    cmp-long p1, p1, v1

    .line 261
    .line 262
    if-gez p1, :cond_11

    .line 263
    .line 264
    invoke-virtual {p0}, Lio/ktor/utils/io/m;->k()V

    .line 265
    .line 266
    .line 267
    :cond_11
    iget-object p1, p0, Lio/ktor/utils/io/m;->d:LPf/a;

    .line 268
    .line 269
    iget-wide p1, p1, LPf/a;->c:J

    .line 270
    .line 271
    cmp-long p1, p1, v8

    .line 272
    .line 273
    if-ltz p1, :cond_12

    .line 274
    .line 275
    move v0, v5

    .line 276
    :cond_12
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 277
    .line 278
    .line 279
    move-result-object p1

    .line 280
    return-object p1

    .line 281
    :cond_13
    throw p2
.end method

.method public final h()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/ktor/utils/io/m;->b()Ljava/lang/Throwable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lio/ktor/utils/io/m;->_closedCause:Ljava/lang/Object;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget v0, p0, Lio/ktor/utils/io/m;->flushBufferSize:I

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lio/ktor/utils/io/m;->d:LPf/a;

    .line 16
    .line 17
    invoke-virtual {v0}, LPf/a;->exhausted()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    return v0

    .line 26
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 27
    return v0
.end method

.method public final i(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance v0, Lio/ktor/utils/io/a;

    .line 4
    .line 5
    invoke-direct {v0, p1}, Lio/ktor/utils/io/a;-><init>(Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    sget-object v0, Lio/ktor/utils/io/g;->a:Lio/ktor/utils/io/b;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    sget-object v0, Lio/ktor/utils/io/b;->b:Lio/ktor/utils/io/a;

    .line 15
    .line 16
    :goto_0
    sget-object v1, Lio/ktor/utils/io/m;->f:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 17
    .line 18
    invoke-virtual {v1, p0, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lio/ktor/utils/io/g;

    .line 23
    .line 24
    instance-of v1, v0, Lio/ktor/utils/io/e;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    check-cast v0, Lio/ktor/utils/io/e;

    .line 29
    .line 30
    invoke-interface {v0, p1}, Lio/ktor/utils/io/e;->a(Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    return-void
.end method

.method public final j()V
    .locals 4

    .line 1
    iget-object v0, p0, Lio/ktor/utils/io/m;->e:LPf/a;

    .line 2
    .line 3
    invoke-virtual {v0}, LPf/a;->exhausted()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p0, Lio/ktor/utils/io/m;->c:Ljava/lang/Object;

    .line 11
    .line 12
    monitor-enter v0

    .line 13
    :try_start_0
    iget-object v1, p0, Lio/ktor/utils/io/m;->e:LPf/a;

    .line 14
    .line 15
    iget-wide v2, v1, LPf/a;->c:J

    .line 16
    .line 17
    long-to-int v2, v2

    .line 18
    iget-object v3, p0, Lio/ktor/utils/io/m;->b:LPf/a;

    .line 19
    .line 20
    invoke-virtual {v3, v1}, LPf/a;->h(LPf/d;)J

    .line 21
    .line 22
    .line 23
    iget v1, p0, Lio/ktor/utils/io/m;->flushBufferSize:I

    .line 24
    .line 25
    add-int/2addr v1, v2

    .line 26
    iput v1, p0, Lio/ktor/utils/io/m;->flushBufferSize:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    monitor-exit v0

    .line 29
    iget-object v0, p0, Lio/ktor/utils/io/m;->suspensionSlot:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Lio/ktor/utils/io/g;

    .line 32
    .line 33
    instance-of v1, v0, Lio/ktor/utils/io/d;

    .line 34
    .line 35
    if-eqz v1, :cond_3

    .line 36
    .line 37
    sget-object v1, Lio/ktor/utils/io/m;->f:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 38
    .line 39
    sget-object v2, Lio/ktor/utils/io/c;->b:Lio/ktor/utils/io/c;

    .line 40
    .line 41
    :cond_1
    invoke-virtual {v1, p0, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_2

    .line 46
    .line 47
    check-cast v0, Lio/ktor/utils/io/e;

    .line 48
    .line 49
    invoke-interface {v0}, Lio/ktor/utils/io/e;->resume()V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_2
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    if-eq v3, v0, :cond_1

    .line 58
    .line 59
    :cond_3
    :goto_0
    return-void

    .line 60
    :catchall_0
    move-exception v1

    .line 61
    monitor-exit v0

    .line 62
    throw v1
.end method

.method public final k()V
    .locals 4

    .line 1
    iget-object v0, p0, Lio/ktor/utils/io/m;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lio/ktor/utils/io/m;->b:LPf/a;

    .line 5
    .line 6
    iget-object v2, p0, Lio/ktor/utils/io/m;->d:LPf/a;

    .line 7
    .line 8
    invoke-virtual {v1, v2}, LPf/a;->i(LPf/a;)J

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    iput v1, p0, Lio/ktor/utils/io/m;->flushBufferSize:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    monitor-exit v0

    .line 15
    iget-object v0, p0, Lio/ktor/utils/io/m;->suspensionSlot:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lio/ktor/utils/io/g;

    .line 18
    .line 19
    instance-of v1, v0, Lio/ktor/utils/io/f;

    .line 20
    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    sget-object v1, Lio/ktor/utils/io/m;->f:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 24
    .line 25
    sget-object v2, Lio/ktor/utils/io/c;->b:Lio/ktor/utils/io/c;

    .line 26
    .line 27
    :cond_0
    invoke-virtual {v1, p0, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    check-cast v0, Lio/ktor/utils/io/e;

    .line 34
    .line 35
    invoke-interface {v0}, Lio/ktor/utils/io/e;->resume()V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    if-eq v3, v0, :cond_0

    .line 44
    .line 45
    :cond_2
    return-void

    .line 46
    :catchall_0
    move-exception v1

    .line 47
    monitor-exit v0

    .line 48
    throw v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "ByteChannel["

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const/16 v1, 0x5d

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0
.end method
