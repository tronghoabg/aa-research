.class public final synthetic LR8/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LR8/s;

.field public final synthetic c:Lio/flutter/plugins/firebase/crashlytics/FlutterError;


# direct methods
.method public synthetic constructor <init>(LR8/s;Lio/flutter/plugins/firebase/crashlytics/FlutterError;I)V
    .locals 0

    .line 1
    iput p3, p0, LR8/p;->a:I

    iput-object p1, p0, LR8/p;->b:LR8/s;

    iput-object p2, p0, LR8/p;->c:Lio/flutter/plugins/firebase/crashlytics/FlutterError;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget v0, p0, LR8/p;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LR8/p;->b:LR8/s;

    .line 7
    .line 8
    iget-object v1, v0, LR8/s;->h:LR8/m;

    .line 9
    .line 10
    iget-object v2, v0, LR8/s;->c:LS3/s;

    .line 11
    .line 12
    iget-object v3, v2, LS3/s;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v3, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 15
    .line 16
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    const-string v4, "com.crashlytics.on-demand.recorded-exceptions"

    .line 25
    .line 26
    invoke-virtual {v1, v4, v3}, LR8/m;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iget-object v1, v0, LR8/s;->h:LR8/m;

    .line 30
    .line 31
    iget-object v2, v2, LS3/s;->c:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v2, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    const-string v3, "com.crashlytics.on-demand.dropped-exceptions"

    .line 44
    .line 45
    invoke-virtual {v1, v3, v2}, LR8/m;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    iget-object v0, v0, LR8/s;->h:LR8/m;

    .line 49
    .line 50
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    iget-object v2, v0, LR8/m;->o:LK3/r;

    .line 55
    .line 56
    if-nez v2, :cond_0

    .line 57
    .line 58
    const-string v0, "settingsProvider not set"

    .line 59
    .line 60
    const/4 v1, 0x0

    .line 61
    const-string v2, "FirebaseCrashlytics"

    .line 62
    .line 63
    invoke-static {v2, v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    iget-object v3, p0, LR8/p;->c:Lio/flutter/plugins/firebase/crashlytics/FlutterError;

    .line 68
    .line 69
    const/4 v4, 0x1

    .line 70
    invoke-virtual {v0, v2, v1, v3, v4}, LR8/m;->g(LK3/r;Ljava/lang/Thread;Ljava/lang/Throwable;Z)V

    .line 71
    .line 72
    .line 73
    :goto_0
    return-void

    .line 74
    :pswitch_0
    iget-object v0, p0, LR8/p;->b:LR8/s;

    .line 75
    .line 76
    iget-object v0, v0, LR8/s;->h:LR8/m;

    .line 77
    .line 78
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 86
    .line 87
    .line 88
    move-result-wide v1

    .line 89
    iget-object v3, v0, LR8/m;->n:LR8/u;

    .line 90
    .line 91
    if-eqz v3, :cond_1

    .line 92
    .line 93
    iget-object v3, v3, LR8/u;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 94
    .line 95
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    if-eqz v3, :cond_1

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_1
    const-wide/16 v5, 0x3e8

    .line 103
    .line 104
    div-long v2, v1, v5

    .line 105
    .line 106
    invoke-virtual {v0}, LR8/m;->e()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    const-string v1, "FirebaseCrashlytics"

    .line 111
    .line 112
    const/4 v5, 0x0

    .line 113
    if-nez v6, :cond_2

    .line 114
    .line 115
    const-string v0, "Tried to write a non-fatal exception while no session was open."

    .line 116
    .line 117
    invoke-static {v1, v0, v5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 118
    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_2
    iget-object v0, v0, LR8/m;->m:LD6/o;

    .line 122
    .line 123
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    const-string v7, "Persisting non-fatal event for session "

    .line 127
    .line 128
    invoke-virtual {v7, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v7

    .line 132
    const/4 v8, 0x2

    .line 133
    invoke-static {v1, v8}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 134
    .line 135
    .line 136
    move-result v8

    .line 137
    if-eqz v8, :cond_3

    .line 138
    .line 139
    invoke-static {v1, v7, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 140
    .line 141
    .line 142
    :cond_3
    iget-object v5, p0, LR8/p;->c:Lio/flutter/plugins/firebase/crashlytics/FlutterError;

    .line 143
    .line 144
    const-string v7, "error"

    .line 145
    .line 146
    const/4 v8, 0x0

    .line 147
    move-object v1, v0

    .line 148
    invoke-virtual/range {v1 .. v8}, LD6/o;->h(JLjava/lang/Thread;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 149
    .line 150
    .line 151
    :goto_1
    return-void

    .line 152
    nop

    .line 153
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
