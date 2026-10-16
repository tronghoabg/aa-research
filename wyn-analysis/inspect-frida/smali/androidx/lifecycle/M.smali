.class public final Landroidx/lifecycle/M;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/t;


# instance fields
.field public final synthetic a:Landroidx/lifecycle/m;

.field public final synthetic b:Lkotlin/jvm/internal/G;

.field public final synthetic c:LEf/E;

.field public final synthetic d:Landroidx/lifecycle/m;

.field public final synthetic e:LEf/n;

.field public final synthetic f:LNf/d;

.field public final synthetic g:LG1/c;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/m;Lkotlin/jvm/internal/G;LEf/E;Landroidx/lifecycle/m;LEf/n;LNf/d;LG1/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/lifecycle/M;->a:Landroidx/lifecycle/m;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/lifecycle/M;->b:Lkotlin/jvm/internal/G;

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/lifecycle/M;->c:LEf/E;

    .line 9
    .line 10
    iput-object p4, p0, Landroidx/lifecycle/M;->d:Landroidx/lifecycle/m;

    .line 11
    .line 12
    iput-object p5, p0, Landroidx/lifecycle/M;->e:LEf/n;

    .line 13
    .line 14
    iput-object p6, p0, Landroidx/lifecycle/M;->f:LNf/d;

    .line 15
    .line 16
    iput-object p7, p0, Landroidx/lifecycle/M;->g:LG1/c;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final onStateChanged(Landroidx/lifecycle/v;Landroidx/lifecycle/m;)V
    .locals 3

    .line 1
    iget-object p1, p0, Landroidx/lifecycle/M;->b:Lkotlin/jvm/internal/G;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/lifecycle/M;->a:Landroidx/lifecycle/m;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-ne p2, v0, :cond_0

    .line 7
    .line 8
    new-instance p2, Landroidx/lifecycle/L;

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/lifecycle/M;->f:LNf/d;

    .line 11
    .line 12
    iget-object v2, p0, Landroidx/lifecycle/M;->g:LG1/c;

    .line 13
    .line 14
    invoke-direct {p2, v0, v2, v1}, Landroidx/lifecycle/L;-><init>(LNf/d;LG1/c;Ljf/c;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x3

    .line 18
    iget-object v2, p0, Landroidx/lifecycle/M;->c:LEf/E;

    .line 19
    .line 20
    invoke-static {v2, v1, p2, v0}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    iput-object p2, p1, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    iget-object v0, p0, Landroidx/lifecycle/M;->d:Landroidx/lifecycle/m;

    .line 28
    .line 29
    if-ne p2, v0, :cond_2

    .line 30
    .line 31
    iget-object v0, p1, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, LEf/m0;

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-interface {v0, v1}, LEf/m0;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    iput-object v1, p1, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 41
    .line 42
    :cond_2
    sget-object p1, Landroidx/lifecycle/m;->ON_DESTROY:Landroidx/lifecycle/m;

    .line 43
    .line 44
    if-ne p2, p1, :cond_3

    .line 45
    .line 46
    sget-object p1, Lef/C;->a:Lef/C;

    .line 47
    .line 48
    iget-object p2, p0, Landroidx/lifecycle/M;->e:LEf/n;

    .line 49
    .line 50
    invoke-virtual {p2, p1}, LEf/n;->resumeWith(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    :cond_3
    return-void
.end method
