.class public final Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/n;
.implements Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/g;


# instance fields
.field public final a:Ltf/a;

.field public final b:LKd/a;

.field public final c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/O;

.field public d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/k;

.field public final e:LE4/n;

.field public final f:LHf/j0;

.field public final g:LHf/j0;

.field public final h:LHf/e0;


# direct methods
.method public constructor <init>(LS8/d;LKd/a;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/O;LHf/j0;)V
    .locals 1

    .line 1
    const-string v0, "scope"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "webView"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "mraidJsCommands"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/t;->a:Ltf/a;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/t;->b:LKd/a;

    .line 22
    .line 23
    iput-object p3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/t;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/O;

    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/t;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/k;

    .line 27
    .line 28
    new-instance p3, LE4/n;

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    invoke-direct {p3, v0, p2}, LE4/n;-><init>(ILKd/a;)V

    .line 32
    .line 33
    .line 34
    iput-object p3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/t;->e:LE4/n;

    .line 35
    .line 36
    const/4 p3, 0x7

    .line 37
    invoke-static {v0, v0, p3}, LHf/k0;->b(III)LHf/j0;

    .line 38
    .line 39
    .line 40
    move-result-object p3

    .line 41
    iput-object p3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/t;->f:LHf/j0;

    .line 42
    .line 43
    iput-object p3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/t;->g:LHf/j0;

    .line 44
    .line 45
    new-instance p3, LHf/o;

    .line 46
    .line 47
    const/4 v0, 0x2

    .line 48
    invoke-direct {p3, p4, v0}, LHf/o;-><init>(Ljava/lang/Object;I)V

    .line 49
    .line 50
    .line 51
    sget-object p4, LHf/n0;->a:LHf/p0;

    .line 52
    .line 53
    invoke-static {p3, p2, p4, p1}, LHf/k0;->x(LHf/l;LEf/E;LHf/o0;Ljava/lang/Object;)LHf/e0;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/t;->h:LHf/e0;

    .line 58
    .line 59
    return-void
.end method


# virtual methods
.method public final destroy()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/t;->a:Ltf/a;

    .line 2
    .line 3
    invoke-interface {v0}, Ltf/a;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final l()LHf/v0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/t;->e:LE4/n;

    .line 2
    .line 3
    iget-object v0, v0, LE4/n;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, LHf/e0;

    .line 6
    .line 7
    return-object v0
.end method
