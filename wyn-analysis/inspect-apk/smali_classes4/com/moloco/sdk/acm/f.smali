.class public final Lcom/moloco/sdk/acm/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/moloco/sdk/acm/f;

.field public static b:LS3/i;

.field public static c:Lb7/k;

.field public static d:Lcom/moloco/sdk/acm/n;

.field public static e:Lcom/moloco/sdk/acm/m;

.field public static final f:LNf/d;

.field public static final g:LKd/a;

.field public static final h:Ljava/util/concurrent/atomic/AtomicReference;

.field public static final i:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public static final j:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public static k:LC6/l;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/moloco/sdk/acm/f;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/moloco/sdk/acm/f;->a:Lcom/moloco/sdk/acm/f;

    .line 7
    .line 8
    invoke-static {}, LNf/e;->a()LNf/d;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sput-object v0, Lcom/moloco/sdk/acm/f;->f:LNf/d;

    .line 13
    .line 14
    sget-object v0, LEf/S;->a:LLf/e;

    .line 15
    .line 16
    sget-object v0, LLf/d;->b:LLf/d;

    .line 17
    .line 18
    invoke-static {}, LEf/H;->f()LEf/I0;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0, v1}, Ljf/a;->plus(Ljf/h;)Ljf/h;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v0}, LEf/H;->c(Ljf/h;)LKd/a;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sput-object v0, Lcom/moloco/sdk/acm/f;->g:LKd/a;

    .line 31
    .line 32
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 33
    .line 34
    sget-object v1, Lcom/moloco/sdk/acm/o;->c:Lcom/moloco/sdk/acm/o;

    .line 35
    .line 36
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lcom/moloco/sdk/acm/f;->h:Ljava/util/concurrent/atomic/AtomicReference;

    .line 40
    .line 41
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 42
    .line 43
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 44
    .line 45
    .line 46
    sput-object v0, Lcom/moloco/sdk/acm/f;->i:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 47
    .line 48
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 49
    .line 50
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 51
    .line 52
    .line 53
    sput-object v0, Lcom/moloco/sdk/acm/f;->j:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 54
    .line 55
    return-void
.end method

.method public static a(Lcom/moloco/sdk/acm/h;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/moloco/sdk/acm/f;->h:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lcom/moloco/sdk/acm/o;->a:Lcom/moloco/sdk/acm/o;

    .line 8
    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    sget-object v0, Lcom/moloco/sdk/acm/f;->j:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    const-string p0, "AndroidClientMetrics"

    .line 17
    .line 18
    const-string v0, "Moloco Client Metrics not initialized"

    .line 19
    .line 20
    invoke-static {p0, v0}, Lcom/moloco/sdk/acm/services/e;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    new-instance v0, Lcom/moloco/sdk/acm/c;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-direct {v0, p0, v1}, Lcom/moloco/sdk/acm/c;-><init>(Lcom/moloco/sdk/acm/h;Ljf/c;)V

    .line 28
    .line 29
    .line 30
    const/4 p0, 0x3

    .line 31
    sget-object v2, Lcom/moloco/sdk/acm/f;->g:LKd/a;

    .line 32
    .line 33
    invoke-static {v2, v1, v0, p0}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public static b(Lcom/moloco/sdk/acm/l;)V
    .locals 5

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-wide v0, p0, Lcom/moloco/sdk/acm/l;->b:J

    .line 7
    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    cmp-long v0, v0, v2

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/moloco/sdk/acm/l;->a:Lcom/moloco/sdk/acm/services/f;

    .line 15
    .line 16
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 17
    .line 18
    .line 19
    move-result-wide v1

    .line 20
    iget-object v0, v0, Lcom/moloco/sdk/acm/services/f;->a:Ljava/util/concurrent/atomic/AtomicLong;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 23
    .line 24
    .line 25
    move-result-wide v3

    .line 26
    sub-long/2addr v1, v3

    .line 27
    iput-wide v1, p0, Lcom/moloco/sdk/acm/l;->b:J

    .line 28
    .line 29
    :cond_0
    sget-object v0, Lcom/moloco/sdk/acm/f;->h:Ljava/util/concurrent/atomic/AtomicReference;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sget-object v1, Lcom/moloco/sdk/acm/o;->a:Lcom/moloco/sdk/acm/o;

    .line 36
    .line 37
    if-eq v0, v1, :cond_1

    .line 38
    .line 39
    sget-object v0, Lcom/moloco/sdk/acm/f;->i:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 40
    .line 41
    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    const-string p0, "AndroidClientMetrics"

    .line 45
    .line 46
    const-string v0, "Moloco Client Metrics not initialized"

    .line 47
    .line 48
    invoke-static {p0, v0}, Lcom/moloco/sdk/acm/services/e;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_1
    new-instance v0, Lcom/moloco/sdk/acm/d;

    .line 53
    .line 54
    const/4 v1, 0x0

    .line 55
    invoke-direct {v0, p0, v1}, Lcom/moloco/sdk/acm/d;-><init>(Lcom/moloco/sdk/acm/l;Ljf/c;)V

    .line 56
    .line 57
    .line 58
    const/4 p0, 0x3

    .line 59
    sget-object v2, Lcom/moloco/sdk/acm/f;->g:LKd/a;

    .line 60
    .line 61
    invoke-static {v2, v1, v0, p0}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public static d(Lcom/moloco/sdk/acm/m;Llf/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/acm/m;->a:Ljava/lang/String;

    .line 2
    .line 3
    sget-object v1, Lcom/moloco/sdk/acm/f;->d:Lcom/moloco/sdk/acm/n;

    .line 4
    .line 5
    const-string v2, "opsConfig"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-eqz v1, :cond_3

    .line 9
    .line 10
    iput-object v0, v1, Lcom/moloco/sdk/acm/n;->b:Ljava/lang/String;

    .line 11
    .line 12
    iget-object p0, p0, Lcom/moloco/sdk/acm/m;->b:Ljava/lang/Long;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    sget-object p0, Lcom/moloco/sdk/acm/f;->d:Lcom/moloco/sdk/acm/n;

    .line 19
    .line 20
    if-eqz p0, :cond_2

    .line 21
    .line 22
    iput-wide v0, p0, Lcom/moloco/sdk/acm/n;->c:J

    .line 23
    .line 24
    sget-object p0, Lcom/moloco/sdk/acm/f;->k:LC6/l;

    .line 25
    .line 26
    if-eqz p0, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0, p1}, LC6/l;->h(Llf/c;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    sget-object p1, Lkf/a;->a:Lkf/a;

    .line 33
    .line 34
    if-ne p0, p1, :cond_0

    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_0
    sget-object p0, Lef/C;->a:Lef/C;

    .line 38
    .line 39
    return-object p0

    .line 40
    :cond_1
    const-string p0, "requestScheduler"

    .line 41
    .line 42
    invoke-static {p0}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw v3

    .line 46
    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw v3

    .line 50
    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw v3
.end method


# virtual methods
.method public final c(Lcom/moloco/sdk/acm/m;Ljf/c;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p2, Lcom/moloco/sdk/acm/e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/moloco/sdk/acm/e;

    .line 7
    .line 8
    iget v1, v0, Lcom/moloco/sdk/acm/e;->e:I

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
    iput v1, v0, Lcom/moloco/sdk/acm/e;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/moloco/sdk/acm/e;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcom/moloco/sdk/acm/e;-><init>(Lcom/moloco/sdk/acm/f;Ljf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/moloco/sdk/acm/e;->c:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, Lcom/moloco/sdk/acm/e;->e:I

    .line 30
    .line 31
    sget-object v3, Lef/C;->a:Lef/C;

    .line 32
    .line 33
    const/4 v4, 0x2

    .line 34
    const/4 v5, 0x1

    .line 35
    const/4 v6, 0x0

    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    if-eq v2, v5, :cond_2

    .line 39
    .line 40
    if-ne v2, v4, :cond_1

    .line 41
    .line 42
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-object v3

    .line 46
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_2
    iget-object p1, v0, Lcom/moloco/sdk/acm/e;->b:LNf/d;

    .line 55
    .line 56
    iget-object v0, v0, Lcom/moloco/sdk/acm/e;->a:Lcom/moloco/sdk/acm/m;

    .line 57
    .line 58
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    move-object p2, p1

    .line 62
    move-object p1, v0

    .line 63
    goto :goto_2

    .line 64
    :cond_3
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    sget-object p2, Lcom/moloco/sdk/acm/f;->h:Ljava/util/concurrent/atomic/AtomicReference;

    .line 68
    .line 69
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    sget-object v2, Lcom/moloco/sdk/acm/o;->a:Lcom/moloco/sdk/acm/o;

    .line 74
    .line 75
    const-string v7, "AndroidClientMetrics"

    .line 76
    .line 77
    if-eq p2, v2, :cond_6

    .line 78
    .line 79
    sget-object p2, Lcom/moloco/sdk/acm/services/e;->a:LKd/a;

    .line 80
    .line 81
    sget-boolean p2, Lcom/moloco/sdk/acm/services/e;->c:Z

    .line 82
    .line 83
    if-nez p2, :cond_4

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_4
    invoke-static {v7}, Lcom/moloco/sdk/acm/services/e;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    const-string v2, "ACM updateConfig called when the SDK was not initialized. Initialize the SDK first."

    .line 91
    .line 92
    invoke-static {v2}, Lcom/moloco/sdk/acm/services/e;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    invoke-static {p2, v2, v6}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 97
    .line 98
    .line 99
    invoke-static {p2, v2}, Lcom/moloco/sdk/acm/services/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    :goto_1
    iput-object p1, v0, Lcom/moloco/sdk/acm/e;->a:Lcom/moloco/sdk/acm/m;

    .line 103
    .line 104
    sget-object p2, Lcom/moloco/sdk/acm/f;->f:LNf/d;

    .line 105
    .line 106
    iput-object p2, v0, Lcom/moloco/sdk/acm/e;->b:LNf/d;

    .line 107
    .line 108
    iput v5, v0, Lcom/moloco/sdk/acm/e;->e:I

    .line 109
    .line 110
    invoke-virtual {p2, v0}, LNf/d;->b(Ljf/c;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    if-ne v0, v1, :cond_5

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_5
    :goto_2
    :try_start_0
    sput-object p1, Lcom/moloco/sdk/acm/f;->e:Lcom/moloco/sdk/acm/m;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 118
    .line 119
    invoke-interface {p2, v6}, LNf/a;->a(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    return-object v3

    .line 123
    :catchall_0
    move-exception p1

    .line 124
    invoke-interface {p2, v6}, LNf/a;->a(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    throw p1

    .line 128
    :cond_6
    const-string p2, "ACM update called. ACM initialized already, proceeding with update"

    .line 129
    .line 130
    invoke-static {v7, p2}, Lcom/moloco/sdk/acm/services/e;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    iput v4, v0, Lcom/moloco/sdk/acm/e;->e:I

    .line 134
    .line 135
    invoke-static {p1, v0}, Lcom/moloco/sdk/acm/f;->d(Lcom/moloco/sdk/acm/m;Llf/c;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    if-ne p1, v1, :cond_7

    .line 140
    .line 141
    :goto_3
    return-object v1

    .line 142
    :cond_7
    return-object v3
.end method
