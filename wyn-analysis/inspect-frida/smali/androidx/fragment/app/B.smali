.class public final Landroidx/fragment/app/B;
.super Landroidx/fragment/app/D;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lt/a;

.field public final synthetic b:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic c:Lh/a;

.field public final synthetic d:Lg/b;

.field public final synthetic e:Landroidx/fragment/app/F;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/F;Lt/a;Ljava/util/concurrent/atomic/AtomicReference;Lh/a;Lg/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/fragment/app/B;->e:Landroidx/fragment/app/F;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/fragment/app/B;->a:Lt/a;

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/fragment/app/B;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 9
    .line 10
    iput-object p4, p0, Landroidx/fragment/app/B;->c:Lh/a;

    .line 11
    .line 12
    iput-object p5, p0, Landroidx/fragment/app/B;->d:Lg/b;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/B;->e:Landroidx/fragment/app/F;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/F;->generateActivityResultKey()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, p0, Landroidx/fragment/app/B;->a:Lt/a;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-interface {v2, v3}, Lt/a;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    check-cast v2, Lg/h;

    .line 15
    .line 16
    iget-object v3, p0, Landroidx/fragment/app/B;->c:Lh/a;

    .line 17
    .line 18
    iget-object v4, p0, Landroidx/fragment/app/B;->d:Lg/b;

    .line 19
    .line 20
    invoke-virtual {v2, v1, v0, v3, v4}, Lg/h;->c(Ljava/lang/String;Landroidx/lifecycle/v;Lh/a;Lg/b;)Lg/e;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object v1, p0, Landroidx/fragment/app/B;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 25
    .line 26
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method
