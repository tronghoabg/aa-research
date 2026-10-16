.class public final Lu0/M0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN/p;
.implements Landroidx/lifecycle/t;


# instance fields
.field public final a:Lu0/n;

.field public final b:LN/s;

.field public c:Z

.field public d:Landroidx/lifecycle/o;

.field public e:LV/d;


# direct methods
.method public constructor <init>(Lu0/n;LN/s;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu0/M0;->a:Lu0/n;

    .line 5
    .line 6
    iput-object p2, p0, Lu0/M0;->b:LN/s;

    .line 7
    .line 8
    sget-object p1, Lu0/K;->a:LV/d;

    .line 9
    .line 10
    iput-object p1, p0, Lu0/M0;->e:LV/d;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lu0/M0;->b:LN/s;

    .line 2
    .line 3
    iget-boolean v0, v0, LN/s;->r:Z

    .line 4
    .line 5
    return v0
.end method

.method public final b(LV/d;)V
    .locals 2

    .line 1
    const-string v0, "content"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LA/W;

    .line 7
    .line 8
    const/16 v1, 0x19

    .line 9
    .line 10
    invoke-direct {v0, v1, p0, p1}, LA/W;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lu0/M0;->a:Lu0/n;

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Lu0/n;->setOnViewTreeOwnersAvailable(Ltf/l;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final dispose()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lu0/M0;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lu0/M0;->c:Z

    .line 7
    .line 8
    iget-object v0, p0, Lu0/M0;->a:Lu0/n;

    .line 9
    .line 10
    invoke-virtual {v0}, Lu0/n;->getView()Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const v1, 0x7f0a02d3

    .line 15
    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-virtual {v0, v1, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lu0/M0;->d:Landroidx/lifecycle/o;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {v0, p0}, Landroidx/lifecycle/o;->c(Landroidx/lifecycle/u;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    iget-object v0, p0, Lu0/M0;->b:LN/s;

    .line 29
    .line 30
    invoke-virtual {v0}, LN/s;->dispose()V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final onStateChanged(Landroidx/lifecycle/v;Landroidx/lifecycle/m;)V
    .locals 0

    .line 1
    sget-object p1, Landroidx/lifecycle/m;->ON_DESTROY:Landroidx/lifecycle/m;

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lu0/M0;->dispose()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    sget-object p1, Landroidx/lifecycle/m;->ON_CREATE:Landroidx/lifecycle/m;

    .line 10
    .line 11
    if-ne p2, p1, :cond_1

    .line 12
    .line 13
    iget-boolean p1, p0, Lu0/M0;->c:Z

    .line 14
    .line 15
    if-nez p1, :cond_1

    .line 16
    .line 17
    iget-object p1, p0, Lu0/M0;->e:LV/d;

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Lu0/M0;->b(LV/d;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    return-void
.end method
