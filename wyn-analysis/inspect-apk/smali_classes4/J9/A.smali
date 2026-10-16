.class public final synthetic LJ9/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnSuccessListener;
.implements Lcom/google/android/gms/tasks/OnFailureListener;


# instance fields
.field public final synthetic a:LSe/c;


# direct methods
.method public synthetic constructor <init>(LSe/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LJ9/A;->a:LSe/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Ljava/lang/Exception;)V
    .locals 1

    .line 1
    iget-object v0, p0, LJ9/A;->a:LSe/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LSe/c;->onError(Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, LSe/c;->onComplete()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget-object v0, p0, LJ9/A;->a:LSe/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sget-object v2, LMe/a;->a:LMe/a;

    .line 8
    .line 9
    if-eq v1, v2, :cond_2

    .line 10
    .line 11
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, LJe/b;

    .line 16
    .line 17
    if-eq v1, v2, :cond_2

    .line 18
    .line 19
    iget-object v2, v0, LSe/c;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, LHe/h;

    .line 22
    .line 23
    if-nez p1, :cond_0

    .line 24
    .line 25
    :try_start_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 26
    .line 27
    const-string v3, "onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."

    .line 28
    .line 29
    invoke-direct {p1, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-interface {v2, p1}, LHe/h;->onError(Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception p1

    .line 37
    goto :goto_1

    .line 38
    :cond_0
    invoke-interface {v2, p1}, LHe/h;->onSuccess(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    :goto_0
    if-eqz v1, :cond_2

    .line 42
    .line 43
    invoke-interface {v1}, LJe/b;->dispose()V

    .line 44
    .line 45
    .line 46
    goto :goto_2

    .line 47
    :goto_1
    if-eqz v1, :cond_1

    .line 48
    .line 49
    invoke-interface {v1}, LJe/b;->dispose()V

    .line 50
    .line 51
    .line 52
    :cond_1
    throw p1

    .line 53
    :cond_2
    :goto_2
    invoke-virtual {v0}, LSe/c;->onComplete()V

    .line 54
    .line 55
    .line 56
    return-void
.end method
