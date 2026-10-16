.class public final LE/z;
.super LYf/f;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;
.implements Lk1/r;
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final c:LE/S;

.field public d:Z

.field public e:Lk1/v0;


# direct methods
.method public constructor <init>(LE/S;)V
    .locals 1

    .line 1
    const-string v0, "composeInsets"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p1, LE/S;->p:Z

    .line 7
    .line 8
    xor-int/lit8 v0, v0, 0x1

    .line 9
    .line 10
    invoke-direct {p0, v0}, LYf/f;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, LE/z;->c:LE/S;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(Lk1/g0;)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, LE/z;->d:Z

    .line 3
    .line 4
    iget-object v0, p0, LE/z;->e:Lk1/v0;

    .line 5
    .line 6
    iget-object p1, p1, Lk1/g0;->a:Lk1/f0;

    .line 7
    .line 8
    invoke-virtual {p1}, Lk1/f0;->a()J

    .line 9
    .line 10
    .line 11
    move-result-wide v1

    .line 12
    const-wide/16 v3, 0x0

    .line 13
    .line 14
    cmp-long v1, v1, v3

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p1}, Lk1/f0;->c()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    iget-object v1, p0, LE/z;->c:LE/S;

    .line 25
    .line 26
    invoke-virtual {v1, v0, p1}, LE/S;->a(Lk1/v0;I)V

    .line 27
    .line 28
    .line 29
    :cond_0
    const/4 p1, 0x0

    .line 30
    iput-object p1, p0, LE/z;->e:Lk1/v0;

    .line 31
    .line 32
    return-void
.end method

.method public final b(Lk1/g0;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, LE/z;->d:Z

    .line 3
    .line 4
    return-void
.end method

.method public final c(Lk1/v0;Ljava/util/List;)Lk1/v0;
    .locals 1

    .line 1
    const-string v0, "insets"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "runningAnimations"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p2, 0x0

    .line 12
    iget-object v0, p0, LE/z;->c:LE/S;

    .line 13
    .line 14
    invoke-virtual {v0, p1, p2}, LE/S;->a(Lk1/v0;I)V

    .line 15
    .line 16
    .line 17
    iget-boolean p2, v0, LE/S;->p:Z

    .line 18
    .line 19
    if-eqz p2, :cond_0

    .line 20
    .line 21
    sget-object p1, Lk1/v0;->b:Lk1/v0;

    .line 22
    .line 23
    const-string p2, "CONSUMED"

    .line 24
    .line 25
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-object p1
.end method

.method public final d(Lk1/g0;Lba/a;)Lba/a;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, LE/z;->d:Z

    .line 3
    .line 4
    return-object p2
.end method

.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 1

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/View;->requestApplyInsets()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 1

    .line 1
    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final run()V
    .locals 3

    .line 1
    iget-boolean v0, p0, LE/z;->d:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, LE/z;->d:Z

    .line 7
    .line 8
    iget-object v1, p0, LE/z;->e:Lk1/v0;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iget-object v2, p0, LE/z;->c:LE/S;

    .line 13
    .line 14
    invoke-virtual {v2, v1, v0}, LE/S;->a(Lk1/v0;I)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, LE/z;->e:Lk1/v0;

    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final v(Landroid/view/View;Lk1/v0;)Lk1/v0;
    .locals 2

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, LE/z;->d:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iput-object p2, p0, LE/z;->e:Lk1/v0;

    .line 11
    .line 12
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 13
    .line 14
    const/16 v1, 0x1e

    .line 15
    .line 16
    if-ne v0, v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {p1, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 19
    .line 20
    .line 21
    return-object p2

    .line 22
    :cond_0
    const/4 p1, 0x0

    .line 23
    iget-object v0, p0, LE/z;->c:LE/S;

    .line 24
    .line 25
    invoke-virtual {v0, p2, p1}, LE/S;->a(Lk1/v0;I)V

    .line 26
    .line 27
    .line 28
    iget-boolean p1, v0, LE/S;->p:Z

    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    sget-object p1, Lk1/v0;->b:Lk1/v0;

    .line 33
    .line 34
    const-string p2, "CONSUMED"

    .line 35
    .line 36
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-object p1

    .line 40
    :cond_1
    return-object p2
.end method
