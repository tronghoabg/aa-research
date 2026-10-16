.class public final Lcom/moloco/sdk/internal/publisher/q0;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:J

.field public c:I

.field public final synthetic d:Lcom/moloco/sdk/acm/recorder/c;

.field public final synthetic e:Lcom/moloco/sdk/internal/publisher/r0;

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:Lcom/moloco/sdk/publisher/MediationInfo;

.field public final synthetic h:Lcom/moloco/sdk/internal/services/init/u;


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/acm/recorder/c;Lcom/moloco/sdk/internal/publisher/r0;Ljava/lang/String;Lcom/moloco/sdk/publisher/MediationInfo;Lcom/moloco/sdk/internal/services/init/u;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/moloco/sdk/internal/publisher/q0;->d:Lcom/moloco/sdk/acm/recorder/c;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/moloco/sdk/internal/publisher/q0;->e:Lcom/moloco/sdk/internal/publisher/r0;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/moloco/sdk/internal/publisher/q0;->f:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/moloco/sdk/internal/publisher/q0;->g:Lcom/moloco/sdk/publisher/MediationInfo;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/moloco/sdk/internal/publisher/q0;->h:Lcom/moloco/sdk/internal/services/init/u;

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
    new-instance v0, Lcom/moloco/sdk/internal/publisher/q0;

    .line 2
    .line 3
    iget-object v2, p0, Lcom/moloco/sdk/internal/publisher/q0;->e:Lcom/moloco/sdk/internal/publisher/r0;

    .line 4
    .line 5
    iget-object v3, p0, Lcom/moloco/sdk/internal/publisher/q0;->f:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/moloco/sdk/internal/publisher/q0;->d:Lcom/moloco/sdk/acm/recorder/c;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/moloco/sdk/internal/publisher/q0;->g:Lcom/moloco/sdk/publisher/MediationInfo;

    .line 10
    .line 11
    iget-object v5, p0, Lcom/moloco/sdk/internal/publisher/q0;->h:Lcom/moloco/sdk/internal/services/init/u;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, Lcom/moloco/sdk/internal/publisher/q0;-><init>(Lcom/moloco/sdk/acm/recorder/c;Lcom/moloco/sdk/internal/publisher/r0;Ljava/lang/String;Lcom/moloco/sdk/publisher/MediationInfo;Lcom/moloco/sdk/internal/services/init/u;Ljf/c;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/moloco/sdk/internal/publisher/q0;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/moloco/sdk/internal/publisher/q0;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lcom/moloco/sdk/internal/publisher/q0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    iget v1, p0, Lcom/moloco/sdk/internal/publisher/q0;->c:I

    .line 4
    .line 5
    iget-object v2, p0, Lcom/moloco/sdk/internal/publisher/q0;->e:Lcom/moloco/sdk/internal/publisher/r0;

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x1

    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    if-eq v1, v4, :cond_1

    .line 12
    .line 13
    if-ne v1, v3, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/q0;->a:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lcom/moloco/sdk/internal/A;

    .line 18
    .line 19
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :cond_1
    iget-wide v4, p0, Lcom/moloco/sdk/internal/publisher/q0;->b:J

    .line 32
    .line 33
    iget-object v1, p0, Lcom/moloco/sdk/internal/publisher/q0;->a:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v1, Lcom/moloco/sdk/acm/l;

    .line 36
    .line 37
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    :goto_0
    move-object v10, v1

    .line 41
    goto :goto_1

    .line 42
    :cond_2
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    sget-object v6, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 46
    .line 47
    const/4 v9, 0x0

    .line 48
    const/4 v10, 0x0

    .line 49
    const-string v7, "InitializationHandler"

    .line 50
    .line 51
    const-string v8, "startInitialization switch to Dispatchers.IO"

    .line 52
    .line 53
    const/16 v11, 0xc

    .line 54
    .line 55
    const/4 v12, 0x0

    .line 56
    invoke-static/range {v6 .. v12}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    sget-object p1, Lcom/moloco/sdk/internal/client_metrics_data/c;->b:[Lcom/moloco/sdk/internal/client_metrics_data/c;

    .line 60
    .line 61
    iget-object p1, p0, Lcom/moloco/sdk/internal/publisher/q0;->d:Lcom/moloco/sdk/acm/recorder/c;

    .line 62
    .line 63
    const-string v1, "sdk_init_time"

    .line 64
    .line 65
    invoke-virtual {p1, v1}, Lcom/moloco/sdk/acm/recorder/c;->c(Ljava/lang/String;)Lcom/moloco/sdk/acm/l;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    iget-object p1, v2, Lcom/moloco/sdk/internal/publisher/r0;->a:Lcom/moloco/sdk/internal/services/k;

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 75
    .line 76
    .line 77
    move-result-wide v5

    .line 78
    sget-object p1, Lcom/moloco/sdk/service_locator/f;->a:Lcom/moloco/sdk/service_locator/f;

    .line 79
    .line 80
    sget-object p1, Lcom/moloco/sdk/service_locator/f;->e:Lef/p;

    .line 81
    .line 82
    invoke-virtual {p1}, Lef/p;->getValue()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    check-cast p1, Lcom/moloco/sdk/internal/services/init/s;

    .line 87
    .line 88
    iput-object v1, p0, Lcom/moloco/sdk/internal/publisher/q0;->a:Ljava/lang/Object;

    .line 89
    .line 90
    iput-wide v5, p0, Lcom/moloco/sdk/internal/publisher/q0;->b:J

    .line 91
    .line 92
    iput v4, p0, Lcom/moloco/sdk/internal/publisher/q0;->c:I

    .line 93
    .line 94
    iget-object v4, p0, Lcom/moloco/sdk/internal/publisher/q0;->f:Ljava/lang/String;

    .line 95
    .line 96
    iget-object v7, p0, Lcom/moloco/sdk/internal/publisher/q0;->g:Lcom/moloco/sdk/publisher/MediationInfo;

    .line 97
    .line 98
    invoke-virtual {p1, v4, v7, p0}, Lcom/moloco/sdk/internal/services/init/s;->c(Ljava/lang/String;Lcom/moloco/sdk/publisher/MediationInfo;Llf/c;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    if-ne p1, v0, :cond_3

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_3
    move-wide v4, v5

    .line 106
    goto :goto_0

    .line 107
    :goto_1
    check-cast p1, Lcom/moloco/sdk/internal/A;

    .line 108
    .line 109
    iget-object v1, v2, Lcom/moloco/sdk/internal/publisher/r0;->a:Lcom/moloco/sdk/internal/services/k;

    .line 110
    .line 111
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 115
    .line 116
    .line 117
    move-result-wide v1

    .line 118
    sub-long v6, v1, v4

    .line 119
    .line 120
    iput-object p1, p0, Lcom/moloco/sdk/internal/publisher/q0;->a:Ljava/lang/Object;

    .line 121
    .line 122
    iput v3, p0, Lcom/moloco/sdk/internal/publisher/q0;->c:I

    .line 123
    .line 124
    iget-object v8, p0, Lcom/moloco/sdk/internal/publisher/q0;->h:Lcom/moloco/sdk/internal/services/init/u;

    .line 125
    .line 126
    iget-object v9, p0, Lcom/moloco/sdk/internal/publisher/q0;->d:Lcom/moloco/sdk/acm/recorder/c;

    .line 127
    .line 128
    iget-object v4, p0, Lcom/moloco/sdk/internal/publisher/q0;->e:Lcom/moloco/sdk/internal/publisher/r0;

    .line 129
    .line 130
    move-object v11, p0

    .line 131
    move-object v5, p1

    .line 132
    invoke-static/range {v4 .. v11}, Lcom/moloco/sdk/internal/publisher/r0;->a(Lcom/moloco/sdk/internal/publisher/r0;Lcom/moloco/sdk/internal/A;JLcom/moloco/sdk/internal/services/init/u;Lcom/moloco/sdk/acm/recorder/c;Lcom/moloco/sdk/acm/l;Llf/c;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    if-ne p1, v0, :cond_4

    .line 137
    .line 138
    :goto_2
    return-object v0

    .line 139
    :cond_4
    return-object v5
.end method
