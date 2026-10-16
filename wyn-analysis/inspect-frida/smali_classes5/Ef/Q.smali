.class public final LEf/Q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# instance fields
.field public final a:LEf/A;


# direct methods
.method public constructor <init>(LEf/A;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LEf/Q;->a:LEf/A;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final execute(Ljava/lang/Runnable;)V
    .locals 3

    .line 1
    sget-object v0, Ljf/i;->a:Ljf/i;

    .line 2
    .line 3
    iget-object v1, p0, LEf/Q;->a:LEf/A;

    .line 4
    .line 5
    invoke-static {v1, v0}, LJf/b;->j(LEf/A;Ljf/h;)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    invoke-static {v1, v0, p1}, LJf/b;->i(LEf/A;Ljf/h;Ljava/lang/Runnable;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LEf/Q;->a:LEf/A;

    .line 2
    .line 3
    invoke-virtual {v0}, LEf/A;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
