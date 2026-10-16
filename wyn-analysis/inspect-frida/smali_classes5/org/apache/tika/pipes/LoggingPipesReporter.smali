.class public Lorg/apache/tika/pipes/LoggingPipesReporter;
.super Lorg/apache/tika/pipes/PipesReporter;
.source "SourceFile"


# instance fields
.field LOGGER:Lvg/b;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/apache/tika/pipes/PipesReporter;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, Lorg/apache/tika/pipes/LoggingPipesReporter;

    .line 5
    .line 6
    invoke-static {v0}, Lvg/d;->b(Ljava/lang/Class;)Lvg/b;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lorg/apache/tika/pipes/LoggingPipesReporter;->LOGGER:Lvg/b;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public error(Ljava/lang/String;)V
    .locals 2

    .line 2
    iget-object v0, p0, Lorg/apache/tika/pipes/LoggingPipesReporter;->LOGGER:Lvg/b;

    const-string v1, "error {}"

    invoke-interface {v0, v1, p1}, Lvg/b;->o(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public error(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/LoggingPipesReporter;->LOGGER:Lvg/b;

    const-string v1, "pipes error"

    invoke-interface {v0, v1, p1}, Lvg/b;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public report(Lorg/apache/tika/pipes/FetchEmitTuple;Lorg/apache/tika/pipes/PipesResult;J)V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/LoggingPipesReporter;->LOGGER:Lvg/b;

    .line 2
    .line 3
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    const/4 p4, 0x3

    .line 8
    new-array p4, p4, [Ljava/lang/Object;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    aput-object p1, p4, v1

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    aput-object p2, p4, p1

    .line 15
    .line 16
    const/4 p1, 0x2

    .line 17
    aput-object p3, p4, p1

    .line 18
    .line 19
    const-string p1, "{} {} {}"

    .line 20
    .line 21
    invoke-interface {v0, p1, p4}, Lvg/b;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method
