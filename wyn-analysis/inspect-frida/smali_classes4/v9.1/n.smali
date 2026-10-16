.class public final synthetic Lv9/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LX8/c;

.field public final synthetic c:Lnd/b;


# direct methods
.method public synthetic constructor <init>(LX8/c;Lnd/b;I)V
    .locals 0

    .line 1
    iput p3, p0, Lv9/n;->a:I

    iput-object p1, p0, Lv9/n;->b:LX8/c;

    iput-object p2, p0, Lv9/n;->c:Lnd/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget v0, p0, Lv9/n;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lv9/n;->b:LX8/c;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lv9/n;->c:Lnd/b;

    .line 12
    .line 13
    invoke-virtual {v1}, Lnd/b;->n()Lmd/S;

    .line 14
    .line 15
    .line 16
    sget-object v1, Lw9/k;->c:Lp2/a;

    .line 17
    .line 18
    new-instance v2, LG8/c;

    .line 19
    .line 20
    const/16 v3, 0xb

    .line 21
    .line 22
    invoke-direct {v2, v0, v3}, LG8/c;-><init>(Ljava/lang/Object;I)V

    .line 23
    .line 24
    .line 25
    invoke-static {v1, v2}, Lcom/google/android/gms/tasks/Tasks;->call(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iput-object v1, v0, LX8/c;->a:Ljava/lang/Object;

    .line 30
    .line 31
    return-void

    .line 32
    :pswitch_0
    iget-object v0, p0, Lv9/n;->c:Lnd/b;

    .line 33
    .line 34
    iget-object v1, p0, Lv9/n;->b:LX8/c;

    .line 35
    .line 36
    invoke-virtual {v1, v0}, LX8/c;->e(Lnd/b;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :pswitch_1
    iget-object v0, p0, Lv9/n;->b:LX8/c;

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    new-instance v1, Lv9/n;

    .line 46
    .line 47
    iget-object v2, p0, Lv9/n;->c:Lnd/b;

    .line 48
    .line 49
    const/4 v3, 0x3

    .line 50
    invoke-direct {v1, v0, v2, v3}, Lv9/n;-><init>(LX8/c;Lnd/b;I)V

    .line 51
    .line 52
    .line 53
    iget-object v0, v0, LX8/c;->b:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, Lw9/e;

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Lw9/e;->a(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :pswitch_2
    iget-object v0, p0, Lv9/n;->b:LX8/c;

    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    const/4 v1, 0x0

    .line 67
    new-array v2, v1, [Ljava/lang/Object;

    .line 68
    .line 69
    const/4 v3, 0x1

    .line 70
    const-string v4, "GrpcCallProvider"

    .line 71
    .line 72
    const-string v5, "connectivityAttemptTimer elapsed. Resetting the channel."

    .line 73
    .line 74
    invoke-static {v4, v5, v3, v2}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    iget-object v2, v0, LX8/c;->d:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v2, Lme/a;

    .line 80
    .line 81
    if-eqz v2, :cond_0

    .line 82
    .line 83
    new-array v1, v1, [Ljava/lang/Object;

    .line 84
    .line 85
    const-string v2, "Clearing the connectivityAttemptTimer"

    .line 86
    .line 87
    invoke-static {v4, v2, v3, v1}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    iget-object v1, v0, LX8/c;->d:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v1, Lme/a;

    .line 93
    .line 94
    invoke-virtual {v1}, Lme/a;->n()V

    .line 95
    .line 96
    .line 97
    const/4 v1, 0x0

    .line 98
    iput-object v1, v0, LX8/c;->d:Ljava/lang/Object;

    .line 99
    .line 100
    :cond_0
    new-instance v1, Lv9/n;

    .line 101
    .line 102
    iget-object v2, p0, Lv9/n;->c:Lnd/b;

    .line 103
    .line 104
    const/4 v3, 0x4

    .line 105
    invoke-direct {v1, v0, v2, v3}, Lv9/n;-><init>(LX8/c;Lnd/b;I)V

    .line 106
    .line 107
    .line 108
    iget-object v0, v0, LX8/c;->b:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v0, Lw9/e;

    .line 111
    .line 112
    invoke-virtual {v0, v1}, Lw9/e;->a(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    .line 113
    .line 114
    .line 115
    return-void

    .line 116
    :pswitch_3
    iget-object v0, p0, Lv9/n;->c:Lnd/b;

    .line 117
    .line 118
    iget-object v1, p0, Lv9/n;->b:LX8/c;

    .line 119
    .line 120
    invoke-virtual {v1, v0}, LX8/c;->e(Lnd/b;)V

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    nop

    .line 125
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
