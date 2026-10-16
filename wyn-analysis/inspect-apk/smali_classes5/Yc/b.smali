.class public final synthetic LYc/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:J

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(LDd/c;Loc/d;La2/v;J)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, LYc/b;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYc/b;->c:Ljava/lang/Object;

    iput-object p2, p0, LYc/b;->d:Ljava/lang/Object;

    iput-object p3, p0, LYc/b;->e:Ljava/lang/Object;

    iput-wide p4, p0, LYc/b;->b:J

    return-void
.end method

.method public synthetic constructor <init>(Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;JLcom/vungle/ads/internal/util/s;Ljava/lang/String;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, LYc/b;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYc/b;->c:Ljava/lang/Object;

    iput-wide p2, p0, LYc/b;->b:J

    iput-object p4, p0, LYc/b;->d:Ljava/lang/Object;

    iput-object p5, p0, LYc/b;->e:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget v0, p0, LYc/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LYc/b;->d:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lcom/vungle/ads/internal/util/s;

    .line 9
    .line 10
    iget-object v1, p0, LYc/b;->e:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ljava/lang/String;

    .line 13
    .line 14
    iget-object v2, p0, LYc/b;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;

    .line 17
    .line 18
    iget-wide v3, p0, LYc/b;->b:J

    .line 19
    .line 20
    invoke-static {v2, v3, v4, v0, v1}, Lcom/vungle/ads/internal/AnalyticsClient;->b(Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;JLcom/vungle/ads/internal/util/s;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_0
    iget-object v0, p0, LYc/b;->c:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, LDd/c;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, LYc/b;->d:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, Loc/d;

    .line 34
    .line 35
    iget-object v1, v1, Loc/d;->d:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v1, LM/y;

    .line 38
    .line 39
    iget-object v1, v1, LM/y;->c:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, Ljava/lang/String;

    .line 42
    .line 43
    sget-object v2, Lka/e0;->h:Landroid/content/Context;

    .line 44
    .line 45
    invoke-virtual {v2}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    iget-object v3, v0, LDd/c;->b:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v3, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 52
    .line 53
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-nez v3, :cond_2

    .line 58
    .line 59
    iget-object v3, p0, LYc/b;->e:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v3, La2/v;

    .line 62
    .line 63
    const-string v4, "FLTFireBGExecutor"

    .line 64
    .line 65
    if-eqz v3, :cond_0

    .line 66
    .line 67
    new-instance v5, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    const-string v6, "Creating background FlutterEngine instance, with args: "

    .line 70
    .line 71
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v3}, La2/v;->z()[Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    invoke-static {v6}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    invoke-static {v4, v5}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    new-instance v5, Llc/b;

    .line 93
    .line 94
    sget-object v6, Lka/e0;->h:Landroid/content/Context;

    .line 95
    .line 96
    invoke-virtual {v3}, La2/v;->z()[Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-direct {v5, v6, v3}, Llc/b;-><init>(Landroid/content/Context;[Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    iput-object v5, v0, LDd/c;->d:Ljava/lang/Object;

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_0
    const-string v3, "Creating background FlutterEngine instance."

    .line 107
    .line 108
    invoke-static {v4, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 109
    .line 110
    .line 111
    new-instance v3, Llc/b;

    .line 112
    .line 113
    sget-object v5, Lka/e0;->h:Landroid/content/Context;

    .line 114
    .line 115
    const/4 v6, 0x0

    .line 116
    invoke-direct {v3, v5, v6}, Llc/b;-><init>(Landroid/content/Context;[Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    iput-object v3, v0, LDd/c;->d:Ljava/lang/Object;

    .line 120
    .line 121
    :goto_0
    iget-wide v5, p0, LYc/b;->b:J

    .line 122
    .line 123
    invoke-static {v5, v6}, Lio/flutter/view/FlutterCallbackInformation;->lookupCallbackInformation(J)Lio/flutter/view/FlutterCallbackInformation;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    if-nez v3, :cond_1

    .line 128
    .line 129
    const-string v0, "Failed to find registered callback"

    .line 130
    .line 131
    invoke-static {v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 132
    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_1
    iget-object v4, v0, LDd/c;->d:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v4, Llc/b;

    .line 138
    .line 139
    iget-object v4, v4, Llc/b;->c:Lmc/b;

    .line 140
    .line 141
    new-instance v5, Luc/r;

    .line 142
    .line 143
    const-string v6, "plugins.flutter.io/firebase_messaging_background"

    .line 144
    .line 145
    invoke-direct {v5, v4, v6}, Luc/r;-><init>(Luc/f;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    iput-object v5, v0, LDd/c;->c:Ljava/lang/Object;

    .line 149
    .line 150
    invoke-virtual {v5, v0}, Luc/r;->b(Luc/p;)V

    .line 151
    .line 152
    .line 153
    new-instance v0, LG9/e;

    .line 154
    .line 155
    const/16 v5, 0x1d

    .line 156
    .line 157
    invoke-direct {v0, v2, v1, v3, v5}, LG9/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v4, v0}, Lmc/b;->c(LG9/e;)V

    .line 161
    .line 162
    .line 163
    :cond_2
    :goto_1
    return-void

    .line 164
    nop

    .line 165
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
