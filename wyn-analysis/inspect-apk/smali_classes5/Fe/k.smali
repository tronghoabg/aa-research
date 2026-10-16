.class public final LFe/k;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public final synthetic a:LFe/m;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public constructor <init>(LFe/m;Ljava/lang/String;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LFe/k;->a:LFe/m;

    .line 2
    .line 3
    iput-object p2, p0, LFe/k;->b:Ljava/lang/String;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Llf/j;-><init>(ILjf/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 2

    .line 1
    new-instance p1, LFe/k;

    .line 2
    .line 3
    iget-object v0, p0, LFe/k;->a:LFe/m;

    .line 4
    .line 5
    iget-object v1, p0, LFe/k;->b:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, LFe/k;-><init>(LFe/m;Ljava/lang/String;Ljf/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
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
    invoke-virtual {p0, p1, p2}, LFe/k;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LFe/k;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LFe/k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LFe/k;->a:LFe/m;

    .line 7
    .line 8
    iget-object v0, p1, LA7/B0;->a:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lac/a;

    .line 11
    .line 12
    iget-object v1, p0, LFe/k;->b:Ljava/lang/String;

    .line 13
    .line 14
    const-string v2, "ScreenPresenter -> opening the screen with id "

    .line 15
    .line 16
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v0, v2}, Lac/a;->O(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p1, LFe/m;->c:LFe/h;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    new-instance v0, Lae/f;

    .line 29
    .line 30
    sget-object v2, Lae/e;->f:Lae/e;

    .line 31
    .line 32
    sget-object v3, Lae/c;->g:Lae/c;

    .line 33
    .line 34
    invoke-direct {v0, v2, v3, v1}, Lae/f;-><init>(Lae/e;Lae/c;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-object v2, p1, LFe/h;->c:Lre/c;

    .line 38
    .line 39
    if-eqz v2, :cond_0

    .line 40
    .line 41
    invoke-virtual {v2, v0}, Lre/c;->f(Lae/f;)V

    .line 42
    .line 43
    .line 44
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Landroidx/fragment/app/F;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    const-string v3, "null cannot be cast to non-null type io.qonversion.nocodes.internal.screen.view.ScreenActivity"

    .line 49
    .line 50
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    check-cast p1, Lio/qonversion/nocodes/internal/screen/view/ScreenActivity;

    .line 54
    .line 55
    sget v3, Lio/qonversion/nocodes/internal/screen/view/ScreenActivity;->b:I

    .line 56
    .line 57
    const/4 v3, 0x1

    .line 58
    const/4 v4, 0x0

    .line 59
    invoke-virtual {p1, v4, v1, v3}, Lio/qonversion/nocodes/internal/screen/view/ScreenActivity;->C(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 60
    .line 61
    .line 62
    if-eqz v2, :cond_1

    .line 63
    .line 64
    invoke-virtual {v2, v0}, Lre/c;->e(Lae/f;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :catch_0
    if-eqz v2, :cond_1

    .line 69
    .line 70
    invoke-virtual {v2, v0}, Lre/c;->b(Lae/f;)V

    .line 71
    .line 72
    .line 73
    :cond_1
    :goto_0
    sget-object p1, Lef/C;->a:Lef/C;

    .line 74
    .line 75
    return-object p1
.end method
