.class public final Lcom/unity3d/ads/core/data/manager/AndroidOmidManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/unity3d/ads/core/data/manager/OmidManager;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J7\u0010\u0011\u001a\u00020\u00102\u0008\u0010\n\u001a\u0004\u0018\u00010\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J7\u0010\u0013\u001a\u00020\u00102\u0008\u0010\n\u001a\u0004\u0018\u00010\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0012J7\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\"\u0010#J\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020!H\u0016\u00a2\u0006\u0004\u0008&\u0010\'R\u0014\u0010(\u001a\u00020\u001b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008(\u0010)R\u0014\u0010,\u001a\u00020\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008*\u0010+\u00a8\u0006-"
    }
    d2 = {
        "Lcom/unity3d/ads/core/data/manager/AndroidOmidManager;",
        "Lcom/unity3d/ads/core/data/manager/OmidManager;",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "Lef/C;",
        "activate",
        "(Landroid/content/Context;)V",
        "LMa/i;",
        "partner",
        "Landroid/webkit/WebView;",
        "adView",
        "",
        "contentUrl",
        "customReferenceData",
        "LMa/d;",
        "createHtmlAdSessionContext",
        "(LMa/i;Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;)LMa/d;",
        "createJavaScriptAdSessionContext",
        "LMa/f;",
        "creativeType",
        "LMa/g;",
        "impressionType",
        "LMa/h;",
        "owner",
        "mediaEventsOwner",
        "",
        "isolateVerificationScripts",
        "LMa/c;",
        "createAdSessionConfiguration",
        "(LMa/f;LMa/g;LMa/h;LMa/h;Z)LMa/c;",
        "adSessionConfiguration",
        "LMa/b;",
        "createAdSession",
        "(LMa/c;LMa/d;)LMa/b;",
        "adSession",
        "LMa/a;",
        "createAdEvents",
        "(LMa/b;)LMa/a;",
        "isActive",
        "()Z",
        "getVersion",
        "()Ljava/lang/String;",
        "version",
        "unity-ads_defaultRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
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
.method public activate(Landroid/content/Context;)V
    .locals 5
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    const-string v1, "context"

    .line 3
    .line 4
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    sget-object v1, LLa/a;->a:Ls8/b;

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const-string v2, "Application Context cannot be null"

    .line 14
    .line 15
    invoke-static {p1, v2}, Lr7/e;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-boolean v2, v1, Ls8/b;->b:Z

    .line 19
    .line 20
    if-nez v2, :cond_3

    .line 21
    .line 22
    iput-boolean v0, v1, Ls8/b;->b:Z

    .line 23
    .line 24
    invoke-static {}, LOa/h;->b()LOa/h;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iget-object v2, v1, LOa/h;->b:Lm9/S;

    .line 29
    .line 30
    new-instance v2, Lc8/e;

    .line 31
    .line 32
    const/16 v3, 0x17

    .line 33
    .line 34
    invoke-direct {v2, v3}, Lc8/e;-><init>(I)V

    .line 35
    .line 36
    .line 37
    new-instance v3, Landroid/os/Handler;

    .line 38
    .line 39
    invoke-direct {v3}, Landroid/os/Handler;-><init>()V

    .line 40
    .line 41
    .line 42
    new-instance v4, LNa/a;

    .line 43
    .line 44
    invoke-direct {v4, v3, p1, v2, v1}, LNa/a;-><init>(Landroid/os/Handler;Landroid/content/Context;Lc8/e;LOa/h;)V

    .line 45
    .line 46
    .line 47
    iput-object v4, v1, LOa/h;->c:LNa/a;

    .line 48
    .line 49
    sget-object v1, LOa/b;->d:LOa/b;

    .line 50
    .line 51
    instance-of v2, p1, Landroid/app/Application;

    .line 52
    .line 53
    if-eqz v2, :cond_0

    .line 54
    .line 55
    move-object v3, p1

    .line 56
    check-cast v3, Landroid/app/Application;

    .line 57
    .line 58
    invoke-virtual {v3, v1}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 59
    .line 60
    .line 61
    :cond_0
    const-string v1, "uimode"

    .line 62
    .line 63
    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    check-cast v1, Landroid/app/UiModeManager;

    .line 68
    .line 69
    sput-object v1, Lka/e0;->g:Landroid/app/UiModeManager;

    .line 70
    .line 71
    sget-object v1, LRa/b;->a:Landroid/view/WindowManager;

    .line 72
    .line 73
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    .line 82
    .line 83
    sput v1, LRa/b;->c:F

    .line 84
    .line 85
    const-string v1, "window"

    .line 86
    .line 87
    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    check-cast v1, Landroid/view/WindowManager;

    .line 92
    .line 93
    sput-object v1, LRa/b;->a:Landroid/view/WindowManager;

    .line 94
    .line 95
    new-instance v1, Landroid/content/IntentFilter;

    .line 96
    .line 97
    const-string v3, "android.media.action.HDMI_AUDIO_PLUG"

    .line 98
    .line 99
    invoke-direct {v1, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    new-instance v3, LG6/Q;

    .line 103
    .line 104
    invoke-direct {v3, v0}, LG6/Q;-><init>(I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1, v3, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 108
    .line 109
    .line 110
    sget-object v1, LOa/f;->b:LOa/f;

    .line 111
    .line 112
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    iput-object v3, v1, LOa/f;->a:Landroid/content/Context;

    .line 117
    .line 118
    sget-object v1, LOa/a;->f:LOa/a;

    .line 119
    .line 120
    iget-boolean v3, v1, LOa/a;->c:Z

    .line 121
    .line 122
    if-nez v3, :cond_3

    .line 123
    .line 124
    iget-object v3, v1, LOa/a;->d:LOa/e;

    .line 125
    .line 126
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    if-eqz v2, :cond_1

    .line 130
    .line 131
    check-cast p1, Landroid/app/Application;

    .line 132
    .line 133
    invoke-virtual {p1, v3}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 134
    .line 135
    .line 136
    :cond_1
    iput-object v1, v3, LOa/e;->c:LOa/d;

    .line 137
    .line 138
    iput-boolean v0, v3, LOa/e;->a:Z

    .line 139
    .line 140
    new-instance p1, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 141
    .line 142
    invoke-direct {p1}, Landroid/app/ActivityManager$RunningAppProcessInfo;-><init>()V

    .line 143
    .line 144
    .line 145
    invoke-static {p1}, Landroid/app/ActivityManager;->getMyMemoryState(Landroid/app/ActivityManager$RunningAppProcessInfo;)V

    .line 146
    .line 147
    .line 148
    iget p1, p1, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    .line 149
    .line 150
    const/16 v2, 0x64

    .line 151
    .line 152
    if-ne p1, v2, :cond_2

    .line 153
    .line 154
    move p1, v0

    .line 155
    goto :goto_0

    .line 156
    :cond_2
    const/4 p1, 0x0

    .line 157
    :goto_0
    iput-boolean p1, v3, LOa/e;->b:Z

    .line 158
    .line 159
    iget-boolean p1, v3, LOa/e;->b:Z

    .line 160
    .line 161
    iput-boolean p1, v1, LOa/a;->e:Z

    .line 162
    .line 163
    iput-boolean v0, v1, LOa/a;->c:Z

    .line 164
    .line 165
    :cond_3
    return-void
.end method

.method public createAdEvents(LMa/b;)LMa/a;
    .locals 2
    .param p1    # LMa/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "adSession"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    check-cast p1, LMa/j;

    .line 7
    .line 8
    iget-object v0, p1, LMa/j;->e:LQa/a;

    .line 9
    .line 10
    iget-object v1, v0, LQa/a;->c:LMa/a;

    .line 11
    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    iget-boolean v1, p1, LMa/j;->g:Z

    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    new-instance v1, LMa/a;

    .line 19
    .line 20
    invoke-direct {v1, p1}, LMa/a;-><init>(LMa/j;)V

    .line 21
    .line 22
    .line 23
    iput-object v1, v0, LQa/a;->c:LMa/a;

    .line 24
    .line 25
    return-object v1

    .line 26
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 27
    .line 28
    const-string v0, "AdSession is finished"

    .line 29
    .line 30
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw p1

    .line 34
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 35
    .line 36
    const-string v0, "AdEvents already exists for AdSession"

    .line 37
    .line 38
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw p1
.end method

.method public createAdSession(LMa/c;LMa/d;)LMa/b;
    .locals 1
    .param p1    # LMa/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # LMa/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "adSessionConfiguration"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "context"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, LLa/a;->a:Ls8/b;

    .line 12
    .line 13
    iget-boolean v0, v0, Ls8/b;->b:Z

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    new-instance v0, LMa/j;

    .line 18
    .line 19
    invoke-direct {v0, p1, p2}, LMa/j;-><init>(LMa/c;LMa/d;)V

    .line 20
    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string p2, "Method called before OM SDK activation"

    .line 26
    .line 27
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p1
.end method

.method public createAdSessionConfiguration(LMa/f;LMa/g;LMa/h;LMa/h;Z)LMa/c;
    .locals 9
    .param p1    # LMa/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # LMa/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # LMa/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # LMa/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "creativeType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "impressionType"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "owner"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "mediaEventsOwner"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    sget-object v0, LMa/h;->d:LMa/h;

    .line 22
    .line 23
    if-eq p3, v0, :cond_4

    .line 24
    .line 25
    sget-object v0, LMa/f;->b:LMa/f;

    .line 26
    .line 27
    sget-object v1, LMa/h;->b:LMa/h;

    .line 28
    .line 29
    const-string v2, "ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript"

    .line 30
    .line 31
    if-ne p1, v0, :cond_1

    .line 32
    .line 33
    if-eq p3, v1, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 37
    .line 38
    invoke-direct {p1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw p1

    .line 42
    :cond_1
    :goto_0
    sget-object v0, LMa/g;->b:LMa/g;

    .line 43
    .line 44
    if-ne p2, v0, :cond_3

    .line 45
    .line 46
    if-eq p3, v1, :cond_2

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 50
    .line 51
    invoke-direct {p1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_3
    :goto_1
    new-instance v3, LMa/c;

    .line 56
    .line 57
    move-object v4, p1

    .line 58
    move-object v5, p2

    .line 59
    move-object v6, p3

    .line 60
    move-object v7, p4

    .line 61
    move v8, p5

    .line 62
    invoke-direct/range {v3 .. v8}, LMa/c;-><init>(LMa/f;LMa/g;LMa/h;LMa/h;Z)V

    .line 63
    .line 64
    .line 65
    return-object v3

    .line 66
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 67
    .line 68
    const-string p2, "Impression owner is none"

    .line 69
    .line 70
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw p1
.end method

.method public createHtmlAdSessionContext(LMa/i;Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;)LMa/d;
    .locals 6
    .param p1    # LMa/i;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Landroid/webkit/WebView;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "Partner is null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lr7/e;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "WebView is null"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lr7/e;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    if-eqz p4, :cond_1

    .line 12
    .line 13
    invoke-virtual {p4}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/16 v1, 0x100

    .line 18
    .line 19
    if-gt v0, v1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 23
    .line 24
    const-string p2, "CustomReferenceData is greater than 256 characters"

    .line 25
    .line 26
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p1

    .line 30
    :cond_1
    :goto_0
    new-instance v0, LMa/d;

    .line 31
    .line 32
    sget-object v5, LMa/e;->b:LMa/e;

    .line 33
    .line 34
    move-object v1, p1

    .line 35
    move-object v2, p2

    .line 36
    move-object v3, p3

    .line 37
    move-object v4, p4

    .line 38
    invoke-direct/range {v0 .. v5}, LMa/d;-><init>(LMa/i;Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;LMa/e;)V

    .line 39
    .line 40
    .line 41
    return-object v0
.end method

.method public createJavaScriptAdSessionContext(LMa/i;Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;)LMa/d;
    .locals 6
    .param p1    # LMa/i;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Landroid/webkit/WebView;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "Partner is null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lr7/e;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "WebView is null"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lr7/e;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    if-eqz p4, :cond_1

    .line 12
    .line 13
    invoke-virtual {p4}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/16 v1, 0x100

    .line 18
    .line 19
    if-gt v0, v1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 23
    .line 24
    const-string p2, "CustomReferenceData is greater than 256 characters"

    .line 25
    .line 26
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p1

    .line 30
    :cond_1
    :goto_0
    new-instance v0, LMa/d;

    .line 31
    .line 32
    sget-object v5, LMa/e;->c:LMa/e;

    .line 33
    .line 34
    move-object v1, p1

    .line 35
    move-object v2, p2

    .line 36
    move-object v3, p3

    .line 37
    move-object v4, p4

    .line 38
    invoke-direct/range {v0 .. v5}, LMa/d;-><init>(LMa/i;Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;LMa/e;)V

    .line 39
    .line 40
    .line 41
    return-object v0
.end method

.method public getVersion()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "1.4.9-Unity3d"

    .line 2
    .line 3
    return-object v0
.end method

.method public isActive()Z
    .locals 1

    .line 1
    sget-object v0, LLa/a;->a:Ls8/b;

    .line 2
    .line 3
    iget-boolean v0, v0, Ls8/b;->b:Z

    .line 4
    .line 5
    return v0
.end method
