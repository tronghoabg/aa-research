.class public final Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/h;
.implements Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/f;
.implements Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/n;


# instance fields
.field public final a:LKd/a;

.field public final b:Lcom/bumptech/glide/f;

.field public final c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/i;

.field public final d:Lba/a;

.field public final e:Lef/p;

.field public final f:LHf/x0;

.field public final g:Lef/p;

.field public final h:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/loader/b;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/events/handlers/c;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/events/handlers/l;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/events/handlers/l;Lcom/moloco/sdk/acm/recorder/c;Z)V
    .locals 7

    .line 1
    const-string v0, "adm"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    sget-object v0, LEf/S;->a:LLf/e;

    .line 10
    .line 11
    sget-object v0, LJf/n;->a:LFf/e;

    .line 12
    .line 13
    invoke-static {v0}, LEf/H;->c(Ljf/h;)LKd/a;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/c;->a:LKd/a;

    .line 18
    .line 19
    new-instance v0, LG9/e;

    .line 20
    .line 21
    invoke-direct {v0, p3, p7}, LG9/e;-><init>(Ljava/util/Set;Lcom/moloco/sdk/acm/recorder/c;)V

    .line 22
    .line 23
    .line 24
    new-instance v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/i;

    .line 25
    .line 26
    move-object v2, p1

    .line 27
    move-object v3, p5

    .line 28
    move-object v4, p6

    .line 29
    move-object v5, p7

    .line 30
    move v6, p8

    .line 31
    invoke-direct/range {v1 .. v6}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/i;-><init>(Landroid/content/Context;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/events/handlers/l;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/events/handlers/l;Lcom/moloco/sdk/acm/recorder/c;Z)V

    .line 32
    .line 33
    .line 34
    new-instance p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/a;

    .line 35
    .line 36
    invoke-direct {p1, v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/a;-><init>(LG9/e;)V

    .line 37
    .line 38
    .line 39
    const-string p3, "AndroidTemplateBridge"

    .line 40
    .line 41
    invoke-virtual {v1, p1, p3}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    new-instance p1, Lcom/bumptech/glide/f;

    .line 45
    .line 46
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object v2, p1, Lcom/bumptech/glide/f;->a:Ljava/lang/Object;

    .line 50
    .line 51
    iput-object v1, p1, Lcom/bumptech/glide/f;->b:Ljava/lang/Object;

    .line 52
    .line 53
    iput-object p4, p1, Lcom/bumptech/glide/f;->c:Ljava/lang/Object;

    .line 54
    .line 55
    sget-object p3, LEf/S;->a:LLf/e;

    .line 56
    .line 57
    sget-object p3, LJf/n;->a:LFf/e;

    .line 58
    .line 59
    invoke-static {p3}, LEf/H;->c(Ljf/h;)LKd/a;

    .line 60
    .line 61
    .line 62
    move-result-object p3

    .line 63
    iput-object p3, p1, Lcom/bumptech/glide/f;->d:Ljava/lang/Object;

    .line 64
    .line 65
    new-instance p4, Lac/a;

    .line 66
    .line 67
    const/4 p5, 0x3

    .line 68
    invoke-direct {p4, v1, p5}, Lac/a;-><init>(Ljava/lang/Object;I)V

    .line 69
    .line 70
    .line 71
    iput-object p4, p1, Lcom/bumptech/glide/f;->e:Ljava/lang/Object;

    .line 72
    .line 73
    new-instance p4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/creative/mraid/d;

    .line 74
    .line 75
    invoke-direct {p4, v2, p1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/creative/mraid/d;-><init>(Landroid/content/Context;Lcom/bumptech/glide/f;)V

    .line 76
    .line 77
    .line 78
    iput-object p4, p1, Lcom/bumptech/glide/f;->f:Ljava/lang/Object;

    .line 79
    .line 80
    sget-object p4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/G;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/G;

    .line 81
    .line 82
    iput-object p4, p1, Lcom/bumptech/glide/f;->g:Ljava/lang/Object;

    .line 83
    .line 84
    new-instance p4, LK3/r;

    .line 85
    .line 86
    invoke-direct {p4, v1, v2, p3}, LK3/r;-><init>(Landroid/webkit/WebView;Landroid/content/Context;LKd/a;)V

    .line 87
    .line 88
    .line 89
    iput-object p4, p1, Lcom/bumptech/glide/f;->h:Ljava/lang/Object;

    .line 90
    .line 91
    new-instance p3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/B;

    .line 92
    .line 93
    sget-object p4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/D;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/D;

    .line 94
    .line 95
    const/4 p5, 0x1

    .line 96
    invoke-direct {p3, p5, p4}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/B;-><init>(ZLcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/D;)V

    .line 97
    .line 98
    .line 99
    invoke-static {p3}, LHf/k0;->c(Ljava/lang/Object;)LHf/x0;

    .line 100
    .line 101
    .line 102
    move-result-object p3

    .line 103
    iput-object p3, p1, Lcom/bumptech/glide/f;->i:Ljava/lang/Object;

    .line 104
    .line 105
    iput-object p3, p1, Lcom/bumptech/glide/f;->j:Ljava/lang/Object;

    .line 106
    .line 107
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/c;->b:Lcom/bumptech/glide/f;

    .line 108
    .line 109
    iget-object p1, p1, Lcom/bumptech/glide/f;->f:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/creative/mraid/d;

    .line 112
    .line 113
    const-string p3, "AndroidMraid"

    .line 114
    .line 115
    invoke-virtual {v1, p1, p3}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    iput-object v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/c;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/i;

    .line 119
    .line 120
    new-instance p1, Lba/a;

    .line 121
    .line 122
    const/4 p3, 0x6

    .line 123
    const/4 p4, 0x0

    .line 124
    invoke-direct {p1, v1, p4, v5, p3}, Lba/a;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    .line 125
    .line 126
    .line 127
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/c;->d:Lba/a;

    .line 128
    .line 129
    new-instance p1, LBf/g;

    .line 130
    .line 131
    const/16 p3, 0x8

    .line 132
    .line 133
    invoke-direct {p1, p3, p2, p0}, LBf/g;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    invoke-static {p1}, LFe/c;->z(Ltf/a;)Lef/p;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/c;->e:Lef/p;

    .line 141
    .line 142
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 143
    .line 144
    invoke-static {p2}, LHf/k0;->c(Ljava/lang/Object;)LHf/x0;

    .line 145
    .line 146
    .line 147
    move-result-object p2

    .line 148
    iput-object p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/c;->f:LHf/x0;

    .line 149
    .line 150
    new-instance p2, LAf/q;

    .line 151
    .line 152
    const/16 p3, 0x14

    .line 153
    .line 154
    invoke-direct {p2, p0, p3}, LAf/q;-><init>(Ljava/lang/Object;I)V

    .line 155
    .line 156
    .line 157
    invoke-static {p2}, LFe/c;->z(Ltf/a;)Lef/p;

    .line 158
    .line 159
    .line 160
    move-result-object p2

    .line 161
    iput-object p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/c;->g:Lef/p;

    .line 162
    .line 163
    invoke-virtual {p1}, Lef/p;->getValue()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    check-cast p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/loader/b;

    .line 168
    .line 169
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/c;->h:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/loader/b;

    .line 170
    .line 171
    return-void
.end method


# virtual methods
.method public final a(JLcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/g;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/c;->e:Lef/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Lef/p;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/loader/b;

    .line 8
    .line 9
    new-instance v1, LX2/j;

    .line 10
    .line 11
    const/16 v2, 0xc

    .line 12
    .line 13
    invoke-direct {v1, v2, p0, p3}, LX2/j;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1, p2, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/loader/b;->a(JLcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/g;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final destroy()V
    .locals 7

    .line 1
    sget-object v0, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 2
    .line 3
    const/4 v3, 0x0

    .line 4
    const/4 v4, 0x0

    .line 5
    const-string v1, "WebviewAd"

    .line 6
    .line 7
    const-string v2, "Ad destroy called"

    .line 8
    .line 9
    const/16 v5, 0xc

    .line 10
    .line 11
    const/4 v6, 0x0

    .line 12
    invoke-static/range {v0 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 16
    .line 17
    iget-object v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/c;->f:LHf/x0;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-virtual {v1, v2, v0}, LHf/x0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/c;->b:Lcom/bumptech/glide/f;

    .line 27
    .line 28
    iget-object v0, v0, Lcom/bumptech/glide/f;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/i;

    .line 31
    .line 32
    const-string v1, "AndroidMraid"

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/c;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/i;

    .line 38
    .line 39
    invoke-virtual {v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/i;->destroy()V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/c;->a:LKd/a;

    .line 43
    .line 44
    invoke-static {v0, v2}, LEf/H;->j(LEf/E;Ljava/util/concurrent/CancellationException;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final isLoaded()LHf/v0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/c;->h:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/loader/b;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/loader/b;->e:LHf/x0;

    .line 4
    .line 5
    return-object v0
.end method

.method public final l()LHf/v0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/c;->g:Lef/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Lef/p;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LHf/v0;

    .line 8
    .line 9
    return-object v0
.end method
