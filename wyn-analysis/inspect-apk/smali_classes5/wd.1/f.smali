.class public abstract Lwd/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LAd/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    :try_start_0
    new-instance v0, Lio/ktor/client/engine/android/AndroidEngineContainer;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/ktor/client/engine/android/AndroidEngineContainer;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    new-array v1, v1, [Lwd/e;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    aput-object v0, v1, v2

    .line 11
    .line 12
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    const-string v1, "iterator(...)"

    .line 21
    .line 22
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v0}, LAf/n;->S(Ljava/util/Iterator;)LAf/k;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, LAf/n;->X(LAf/k;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Lwd/e;

    .line 34
    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    sget-object v0, LAd/a;->a:LAd/a;

    .line 38
    .line 39
    sput-object v0, Lwd/f;->a:LAd/a;

    .line 40
    .line 41
    return-void

    .line 42
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string v1, "Failed to find HTTP client engine implementation: consider adding client engine dependency. See https://ktor.io/docs/http-client-engines.html"

    .line 45
    .line 46
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw v0

    .line 50
    :catchall_0
    move-exception v0

    .line 51
    new-instance v1, Ljava/util/ServiceConfigurationError;

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-direct {v1, v2, v0}, Ljava/util/ServiceConfigurationError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 58
    .line 59
    .line 60
    throw v1
.end method

.method public static final a(Ltf/l;)Lwd/c;
    .locals 5

    .line 1
    const-string v0, "engineFactory"

    .line 2
    .line 3
    sget-object v1, Lwd/f;->a:LAd/a;

    .line 4
    .line 5
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lwd/d;

    .line 9
    .line 10
    invoke-direct {v0}, Lwd/d;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-interface {p0, v0}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    iget-object p0, v0, Lwd/d;->d:Lcom/moloco/sdk/internal/publisher/d;

    .line 17
    .line 18
    const-string v1, "block"

    .line 19
    .line 20
    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    new-instance v1, LAd/e;

    .line 24
    .line 25
    new-instance v2, LAd/h;

    .line 26
    .line 27
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 28
    .line 29
    .line 30
    new-instance v3, LAd/g;

    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    invoke-direct {v3, v4}, LAd/g;-><init>(I)V

    .line 34
    .line 35
    .line 36
    iput-object v3, v2, LAd/h;->a:LAd/g;

    .line 37
    .line 38
    new-instance v3, LAd/g;

    .line 39
    .line 40
    const/4 v4, 0x1

    .line 41
    invoke-direct {v3, v4}, LAd/g;-><init>(I)V

    .line 42
    .line 43
    .line 44
    iput-object v3, v2, LAd/h;->b:LAd/g;

    .line 45
    .line 46
    invoke-virtual {p0, v2}, Lcom/moloco/sdk/internal/publisher/d;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    invoke-direct {v1, v2}, LAd/e;-><init>(LAd/h;)V

    .line 50
    .line 51
    .line 52
    new-instance p0, Lwd/c;

    .line 53
    .line 54
    invoke-direct {p0, v1, v0}, Lwd/c;-><init>(LAd/e;Lwd/d;)V

    .line 55
    .line 56
    .line 57
    sget-object v0, LEf/l0;->a:LEf/l0;

    .line 58
    .line 59
    iget-object v2, p0, Lwd/c;->d:Ljf/h;

    .line 60
    .line 61
    invoke-interface {v2, v0}, Ljf/h;->get(Ljf/g;)Ljf/f;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    check-cast v0, LEf/m0;

    .line 69
    .line 70
    new-instance v2, Lqf/j;

    .line 71
    .line 72
    const/4 v3, 0x2

    .line 73
    invoke-direct {v2, v1, v3}, Lqf/j;-><init>(Ljava/lang/Object;I)V

    .line 74
    .line 75
    .line 76
    invoke-interface {v0, v2}, LEf/m0;->invokeOnCompletion(Ltf/l;)LEf/U;

    .line 77
    .line 78
    .line 79
    return-object p0
.end method
