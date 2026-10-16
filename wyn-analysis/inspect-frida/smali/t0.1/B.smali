.class public final Lt0/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/a;
.implements Lt0/J;
.implements Ls0/c;


# static fields
.field public static final e:Lt0/j;


# instance fields
.field public a:Lt0/C;

.field public final b:Ls0/a;

.field public final c:LP/d;

.field public d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lt0/j;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1}, Lt0/j;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lt0/B;->e:Lt0/j;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lt0/C;Ls0/a;)V
    .locals 1

    .line 1
    const-string v0, "provider"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "modifier"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lt0/B;->a:Lt0/C;

    .line 15
    .line 16
    iput-object p2, p0, Lt0/B;->b:Ls0/a;

    .line 17
    .line 18
    new-instance p1, LP/d;

    .line 19
    .line 20
    const/16 p2, 0x10

    .line 21
    .line 22
    new-array p2, p2, [La2/v;

    .line 23
    .line 24
    invoke-direct {p1, p2}, LP/d;-><init>([Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Lt0/B;->c:LP/d;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final a(La2/v;)Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lt0/B;->c:LP/d;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, LP/d;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lt0/B;->a:Lt0/C;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lt0/C;->b(La2/v;)Ls0/b;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    iget-object p1, p1, La2/v;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p1, Ltf/a;

    .line 22
    .line 23
    invoke-interface {p1}, Ltf/a;->invoke()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1

    .line 28
    :cond_0
    invoke-interface {v0}, Ls0/b;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1
.end method

.method public final b()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lt0/B;->d:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lt0/B;->c:LP/d;

    .line 7
    .line 8
    invoke-virtual {v0}, LP/d;->e()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lt0/B;->a:Lt0/C;

    .line 12
    .line 13
    iget-object v0, v0, Lt0/C;->a:Lt0/t;

    .line 14
    .line 15
    invoke-static {v0}, LS3/f;->E(Lt0/t;)Lt0/I;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lu0/n;

    .line 20
    .line 21
    invoke-virtual {v0}, Lu0/n;->getSnapshotObserver()Lt0/K;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sget-object v1, Lt0/e;->m:Lt0/e;

    .line 26
    .line 27
    new-instance v2, Lt0/p;

    .line 28
    .line 29
    const/4 v3, 0x3

    .line 30
    invoke-direct {v2, p0, v3}, Lt0/p;-><init>(Ljava/lang/Object;I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p0, v1, v2}, Lt0/K;->a(Lt0/J;Ltf/l;Ltf/a;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lt0/B;->b()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lef/C;->a:Lef/C;

    .line 5
    .line 6
    return-object v0
.end method

.method public final n()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lt0/B;->d:Z

    .line 2
    .line 3
    return v0
.end method
