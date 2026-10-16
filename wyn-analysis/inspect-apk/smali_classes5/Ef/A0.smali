.class public final LEf/A0;
.super LEf/L;
.source "SourceFile"


# instance fields
.field public final d:Ljf/c;


# direct methods
.method public constructor <init>(Ljf/h;Ltf/p;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, LEf/a;-><init>(Ljf/h;Z)V

    .line 3
    .line 4
    .line 5
    invoke-static {p0, p0, p2}, LA6/h;->q(Ljf/c;Ljf/c;Ltf/p;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, LEf/A0;->d:Ljf/c;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final Q()V
    .locals 2

    .line 1
    iget-object v0, p0, LEf/A0;->d:Ljf/c;

    .line 2
    .line 3
    :try_start_0
    invoke-static {v0}, LA6/h;->A(Ljf/c;)Ljf/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lef/C;->a:Lef/C;

    .line 8
    .line 9
    invoke-static {v1, v0}, LJf/b;->h(Ljava/lang/Object;Ljf/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    invoke-static {p0, v0}, Lr7/e;->v(Ljf/c;Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    throw v0
.end method
