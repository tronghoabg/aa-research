.class public final LVc/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luc/i;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, LVc/d;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/google/firebase/firestore/FirebaseFirestore;[B)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LVc/d;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LVc/d;->c:Ljava/lang/Object;

    .line 4
    iput-object p2, p0, LVc/d;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final onCancel(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget p1, p0, LVc/d;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LVc/d;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Landroid/content/Context;

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, LVc/d;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lx4/i;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void

    .line 22
    :pswitch_0
    iget-object p1, p0, LVc/d;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p1, Luc/h;

    .line 25
    .line 26
    invoke-virtual {p1}, Luc/h;->b()V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onListen(Ljava/lang/Object;Luc/g;)V
    .locals 5

    .line 1
    iget p1, p0, LVc/d;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LVc/d;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Landroid/content/Context;

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    new-instance p1, Landroid/content/IntentFilter;

    .line 14
    .line 15
    const-string v0, "android.location.PROVIDERS_CHANGED"

    .line 16
    .line 17
    invoke-direct {p1, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-string v0, "android.intent.action.PROVIDER_CHANGED"

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    new-instance v0, Lx4/i;

    .line 26
    .line 27
    check-cast p2, Luc/h;

    .line 28
    .line 29
    invoke-direct {v0, p2}, Lx4/i;-><init>(Luc/h;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, LVc/d;->d:Ljava/lang/Object;

    .line 33
    .line 34
    iget-object p2, p0, LVc/d;->c:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p2, Landroid/content/Context;

    .line 37
    .line 38
    const/4 v1, 0x2

    .line 39
    invoke-static {p2, v0, p1, v1}, LY0/e;->registerReceiver(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;

    .line 40
    .line 41
    .line 42
    :goto_0
    return-void

    .line 43
    :pswitch_0
    check-cast p2, Luc/h;

    .line 44
    .line 45
    iput-object p2, p0, LVc/d;->b:Ljava/lang/Object;

    .line 46
    .line 47
    iget-object p1, p0, LVc/d;->c:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p1, Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 50
    .line 51
    iget-object v0, p0, LVc/d;->d:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, [B

    .line 54
    .line 55
    new-instance v1, Ljava/io/ByteArrayInputStream;

    .line 56
    .line 57
    invoke-direct {v1, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 58
    .line 59
    .line 60
    new-instance v0, Lm9/N;

    .line 61
    .line 62
    invoke-direct {v0}, Lm9/N;-><init>()V

    .line 63
    .line 64
    .line 65
    iget-object p1, p1, Lcom/google/firebase/firestore/FirebaseFirestore;->k:LDd/c;

    .line 66
    .line 67
    monitor-enter p1

    .line 68
    :try_start_0
    invoke-virtual {p1}, LDd/c;->C()V

    .line 69
    .line 70
    .line 71
    iget-object v2, p1, LDd/c;->c:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v2, Lp9/n;

    .line 74
    .line 75
    invoke-virtual {v2}, Lp9/n;->e()V

    .line 76
    .line 77
    .line 78
    new-instance v3, Lo9/f;

    .line 79
    .line 80
    iget-object v4, v2, Lp9/n;->e:Lo9/g;

    .line 81
    .line 82
    invoke-direct {v3, v4, v1}, Lo9/f;-><init>(Lo9/g;Ljava/io/ByteArrayInputStream;)V

    .line 83
    .line 84
    .line 85
    new-instance v1, Lcom/applovin/impl/mediation/ads/f;

    .line 86
    .line 87
    const/16 v4, 0x1b

    .line 88
    .line 89
    invoke-direct {v1, v2, v3, v0, v4}, Lcom/applovin/impl/mediation/ads/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 90
    .line 91
    .line 92
    iget-object v2, v2, Lp9/n;->d:Lw9/e;

    .line 93
    .line 94
    invoke-virtual {v2, v1}, Lw9/e;->a(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    .line 96
    .line 97
    monitor-exit p1

    .line 98
    new-instance p1, LVc/c;

    .line 99
    .line 100
    const/4 v1, 0x0

    .line 101
    invoke-direct {p1, p2, v1}, LVc/c;-><init>(Luc/h;I)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, p1}, Lm9/N;->a(LVc/c;)V

    .line 105
    .line 106
    .line 107
    new-instance p1, LA5/h;

    .line 108
    .line 109
    const/16 v1, 0x16

    .line 110
    .line 111
    invoke-direct {p1, v1, p0, p2}, LA5/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, p1}, Lm9/N;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :catchall_0
    move-exception p2

    .line 119
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 120
    throw p2

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
