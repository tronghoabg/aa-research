.class public final Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/n;


# instance fields
.field public final a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;

.field public final b:LKd/a;

.field public final c:LHf/j0;

.field public final d:LHf/x0;


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/S;)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/o;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;

    .line 7
    .line 8
    invoke-static {}, LEf/H;->e()LKd/a;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    iput-object v2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/o;->b:LKd/a;

    .line 13
    .line 14
    iget-object v3, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->l:Ls6/C;

    .line 15
    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    invoke-virtual {p2, v3}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/S;->a(Landroid/view/View;)LHf/l;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    if-nez p2, :cond_1

    .line 23
    .line 24
    :cond_0
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 25
    .line 26
    new-instance v3, LHf/o;

    .line 27
    .line 28
    invoke-direct {v3, p2, v1}, LHf/o;-><init>(Ljava/lang/Object;I)V

    .line 29
    .line 30
    .line 31
    move-object p2, v3

    .line 32
    :cond_1
    sget-object v3, LHf/n0;->a:LHf/p0;

    .line 33
    .line 34
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 35
    .line 36
    invoke-static {p2, v2, v3, v4}, LHf/k0;->x(LHf/l;LEf/E;LHf/o0;Ljava/lang/Object;)LHf/e0;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    sget-object v3, LGf/a;->a:LGf/a;

    .line 41
    .line 42
    const/4 v3, 0x2

    .line 43
    invoke-static {v1, v0, v3}, LHf/k0;->b(III)LHf/j0;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    iput-object v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/o;->c:LHf/j0;

    .line 48
    .line 49
    iget-object p1, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->i:LHf/x0;

    .line 50
    .line 51
    invoke-virtual {p1}, LHf/x0;->getValue()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    check-cast v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/a;

    .line 56
    .line 57
    iget-object v4, p2, LHf/e0;->a:LHf/c0;

    .line 58
    .line 59
    check-cast v4, LHf/x0;

    .line 60
    .line 61
    invoke-virtual {v4}, LHf/x0;->getValue()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    check-cast v4, Ljava/lang/Boolean;

    .line 66
    .line 67
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    invoke-static {v3, v4}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/a;->a(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/a;Z)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/a;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-static {v3}, LHf/k0;->c(Ljava/lang/Object;)LHf/x0;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    iput-object v3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/o;->d:LHf/x0;

    .line 80
    .line 81
    new-instance v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/m;

    .line 82
    .line 83
    const/4 v4, 0x0

    .line 84
    invoke-direct {v3, p0, v4}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/m;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/o;Ljf/c;)V

    .line 85
    .line 86
    .line 87
    new-instance v5, LHf/a0;

    .line 88
    .line 89
    invoke-direct {v5, p2, v1, v3}, LHf/a0;-><init>(LHf/l;LHf/l;Ltf/q;)V

    .line 90
    .line 91
    .line 92
    invoke-static {v5, v2}, LHf/k0;->u(LHf/l;LEf/E;)LEf/H0;

    .line 93
    .line 94
    .line 95
    new-instance v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/K;

    .line 96
    .line 97
    const/4 v3, 0x3

    .line 98
    const/4 v5, 0x4

    .line 99
    invoke-direct {v1, v3, v4, v5}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/K;-><init>(ILjf/c;I)V

    .line 100
    .line 101
    .line 102
    new-instance v3, LHf/a0;

    .line 103
    .line 104
    invoke-direct {v3, p1, p2, v1}, LHf/a0;-><init>(LHf/l;LHf/l;Ltf/q;)V

    .line 105
    .line 106
    .line 107
    new-instance p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/n;

    .line 108
    .line 109
    invoke-direct {p1, p0, v4}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/n;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/o;Ljf/c;)V

    .line 110
    .line 111
    .line 112
    new-instance p2, LHf/Z;

    .line 113
    .line 114
    invoke-direct {p2, v3, p1, v0}, LHf/Z;-><init>(LHf/l;Ljava/lang/Object;I)V

    .line 115
    .line 116
    .line 117
    invoke-static {p2, v2}, LHf/k0;->u(LHf/l;LEf/E;)LEf/H0;

    .line 118
    .line 119
    .line 120
    return-void
.end method


# virtual methods
.method public final destroy()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/o;->b:LKd/a;

    .line 3
    .line 4
    invoke-static {v1, v0}, LEf/H;->j(LEf/E;Ljava/util/concurrent/CancellationException;)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/o;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/videoplayer/j;->destroy()V

    .line 10
    .line 11
    .line 12
    return-void
.end method
