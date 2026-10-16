.class public final Ldb/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqc/b;
.implements Luc/p;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001bB\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000cH\u0016J\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J)\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00162\u0012\u0010\u0017\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00190\u0018\"\u00020\u0019H\u0002\u00a2\u0006\u0002\u0010\u001aR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/ryanheise/audio_session/AudioSessionPlugin;",
        "Lio/flutter/embedding/engine/plugins/FlutterPlugin;",
        "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;",
        "<init>",
        "()V",
        "channel",
        "Lio/flutter/plugin/common/MethodChannel;",
        "androidAudioManager",
        "Lcom/ryanheise/audio_session/AndroidAudioManager;",
        "onAttachedToEngine",
        "",
        "flutterPluginBinding",
        "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;",
        "onDetachedFromEngine",
        "binding",
        "onMethodCall",
        "call",
        "Lio/flutter/plugin/common/MethodCall;",
        "result",
        "Lio/flutter/plugin/common/MethodChannel$Result;",
        "invokeMethod",
        "method",
        "",
        "args",
        "",
        "",
        "(Ljava/lang/String;[Ljava/lang/Object;)V",
        "Companion",
        "audio_session_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static c:Ljava/util/Map;

.field public static final d:Ljava/util/ArrayList;


# instance fields
.field public a:Luc/r;

.field public b:Ldb/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ldb/e;->d:Ljava/util/ArrayList;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final onAttachedToEngine(Lqc/a;)V
    .locals 6

    .line 1
    const-string v0, "flutterPluginBinding"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, Lqc/a;->c:Luc/f;

    .line 7
    .line 8
    const-string v1, "getBinaryMessenger(...)"

    .line 9
    .line 10
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    new-instance v1, Luc/r;

    .line 14
    .line 15
    const-string v2, "com.ryanheise.audio_session"

    .line 16
    .line 17
    invoke-direct {v1, v0, v2}, Luc/r;-><init>(Luc/f;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iput-object v1, p0, Ldb/e;->a:Luc/r;

    .line 21
    .line 22
    invoke-virtual {v1, p0}, Luc/r;->b(Luc/p;)V

    .line 23
    .line 24
    .line 25
    new-instance v1, Ldb/a;

    .line 26
    .line 27
    iget-object p1, p1, Lqc/a;->a:Landroid/content/Context;

    .line 28
    .line 29
    const-string v2, "getApplicationContext(...)"

    .line 30
    .line 31
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sget-object v2, Ldb/a;->b:LR8/a;

    .line 38
    .line 39
    if-nez v2, :cond_0

    .line 40
    .line 41
    new-instance v2, LR8/a;

    .line 42
    .line 43
    const-string v3, "applicationContext"

    .line 44
    .line 45
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 49
    .line 50
    .line 51
    new-instance v3, Landroid/os/Handler;

    .line 52
    .line 53
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    invoke-direct {v3, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 58
    .line 59
    .line 60
    new-instance v4, Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object v4, v2, LR8/a;->g:Ljava/lang/Object;

    .line 66
    .line 67
    new-instance v4, Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 70
    .line 71
    .line 72
    iput-object v4, v2, LR8/a;->h:Ljava/lang/Object;

    .line 73
    .line 74
    iput-object p1, v2, LR8/a;->d:Ljava/lang/Object;

    .line 75
    .line 76
    const-string v4, "audio"

    .line 77
    .line 78
    invoke-virtual {p1, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    const-string v4, "null cannot be cast to non-null type android.media.AudioManager"

    .line 83
    .line 84
    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    check-cast p1, Landroid/media/AudioManager;

    .line 88
    .line 89
    iput-object p1, v2, LR8/a;->e:Ljava/lang/Object;

    .line 90
    .line 91
    new-instance p1, LW1/c;

    .line 92
    .line 93
    const/4 v4, 0x1

    .line 94
    invoke-direct {p1, v2, v4}, LW1/c;-><init>(Ljava/lang/Object;I)V

    .line 95
    .line 96
    .line 97
    iput-object p1, v2, LR8/a;->f:Ljava/lang/Object;

    .line 98
    .line 99
    iget-object p1, v2, LR8/a;->e:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast p1, Landroid/media/AudioManager;

    .line 102
    .line 103
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    iget-object v4, v2, LR8/a;->f:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v4, LW1/c;

    .line 109
    .line 110
    const-string v5, "null cannot be cast to non-null type android.media.AudioDeviceCallback"

    .line 111
    .line 112
    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1, v4, v3}, Landroid/media/AudioManager;->registerAudioDeviceCallback(Landroid/media/AudioDeviceCallback;Landroid/os/Handler;)V

    .line 116
    .line 117
    .line 118
    sput-object v2, Ldb/a;->b:LR8/a;

    .line 119
    .line 120
    :cond_0
    new-instance p1, Luc/r;

    .line 121
    .line 122
    const-string v2, "com.ryanheise.android_audio_manager"

    .line 123
    .line 124
    invoke-direct {p1, v0, v2}, Luc/r;-><init>(Luc/f;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    iput-object p1, v1, Ldb/a;->a:Luc/r;

    .line 128
    .line 129
    sget-object p1, Ldb/a;->b:LR8/a;

    .line 130
    .line 131
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    iget-object p1, p1, LR8/a;->g:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast p1, Ljava/util/ArrayList;

    .line 137
    .line 138
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    iget-object p1, v1, Ldb/a;->a:Luc/r;

    .line 142
    .line 143
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p1, v1}, Luc/r;->b(Luc/p;)V

    .line 147
    .line 148
    .line 149
    iput-object v1, p0, Ldb/e;->b:Ldb/a;

    .line 150
    .line 151
    sget-object p1, Ldb/e;->d:Ljava/util/ArrayList;

    .line 152
    .line 153
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    return-void
.end method

.method public final onDetachedFromEngine(Lqc/a;)V
    .locals 4

    .line 1
    const-string v0, "binding"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Ldb/e;->a:Luc/r;

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-virtual {p1, v0}, Luc/r;->b(Luc/p;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Ldb/e;->a:Luc/r;

    .line 16
    .line 17
    iget-object p1, p0, Ldb/e;->b:Ldb/a;

    .line 18
    .line 19
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p1, Ldb/a;->a:Luc/r;

    .line 23
    .line 24
    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v0}, Luc/r;->b(Luc/p;)V

    .line 28
    .line 29
    .line 30
    sget-object v1, Ldb/a;->b:LR8/a;

    .line 31
    .line 32
    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object v1, v1, LR8/a;->g:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v1, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    sget-object v1, Ldb/a;->b:LR8/a;

    .line 43
    .line 44
    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iget-object v1, v1, LR8/a;->g:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v1, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-nez v1, :cond_0

    .line 56
    .line 57
    sget-object v1, Ldb/a;->b:LR8/a;

    .line 58
    .line 59
    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, LR8/a;->d()Z

    .line 63
    .line 64
    .line 65
    iget-object v2, v1, LR8/a;->e:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v2, Landroid/media/AudioManager;

    .line 68
    .line 69
    invoke-static {v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    iget-object v3, v1, LR8/a;->f:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v3, LW1/c;

    .line 75
    .line 76
    invoke-virtual {v2, v3}, Landroid/media/AudioManager;->unregisterAudioDeviceCallback(Landroid/media/AudioDeviceCallback;)V

    .line 77
    .line 78
    .line 79
    iput-object v0, v1, LR8/a;->d:Ljava/lang/Object;

    .line 80
    .line 81
    iput-object v0, v1, LR8/a;->e:Ljava/lang/Object;

    .line 82
    .line 83
    sput-object v0, Ldb/a;->b:LR8/a;

    .line 84
    .line 85
    :cond_0
    iput-object v0, p1, Ldb/a;->a:Luc/r;

    .line 86
    .line 87
    iput-object v0, p0, Ldb/e;->b:Ldb/a;

    .line 88
    .line 89
    sget-object p1, Ldb/e;->d:Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    return-void
.end method

.method public final onMethodCall(Luc/o;Luc/q;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, "call"

    .line 3
    .line 4
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p1, Luc/o;->b:Ljava/lang/Object;

    .line 8
    .line 9
    const-string v2, "null cannot be cast to non-null type kotlin.collections.List<*>"

    .line 10
    .line 11
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    check-cast v1, Ljava/util/List;

    .line 15
    .line 16
    iget-object p1, p1, Luc/o;->a:Ljava/lang/String;

    .line 17
    .line 18
    const-string v2, "setConfiguration"

    .line 19
    .line 20
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, Ljava/util/Map;

    .line 31
    .line 32
    sput-object p1, Ldb/e;->c:Ljava/util/Map;

    .line 33
    .line 34
    check-cast p2, Ltc/g;

    .line 35
    .line 36
    const/4 p1, 0x0

    .line 37
    invoke-virtual {p2, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    sget-object p2, Ldb/e;->c:Ljava/util/Map;

    .line 41
    .line 42
    invoke-static {p2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    new-array v1, v1, [Ljava/lang/Object;

    .line 47
    .line 48
    aput-object p2, v1, v0

    .line 49
    .line 50
    sget-object p2, Ldb/e;->d:Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_0

    .line 61
    .line 62
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, Ldb/e;

    .line 67
    .line 68
    invoke-static {v1}, Lff/m;->O0([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    iget-object v0, v0, Ldb/e;->a:Luc/r;

    .line 73
    .line 74
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    const-string v3, "onConfigurationChanged"

    .line 78
    .line 79
    invoke-virtual {v0, v3, v2, p1}, Luc/r;->a(Ljava/lang/String;Ljava/lang/Object;Luc/q;)V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_0
    return-void

    .line 84
    :cond_1
    const-string v0, "getConfiguration"

    .line 85
    .line 86
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-eqz p1, :cond_2

    .line 91
    .line 92
    sget-object p1, Ldb/e;->c:Ljava/util/Map;

    .line 93
    .line 94
    check-cast p2, Ltc/g;

    .line 95
    .line 96
    invoke-virtual {p2, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :cond_2
    check-cast p2, Ltc/g;

    .line 101
    .line 102
    invoke-virtual {p2}, Ltc/g;->c()V

    .line 103
    .line 104
    .line 105
    return-void
.end method
