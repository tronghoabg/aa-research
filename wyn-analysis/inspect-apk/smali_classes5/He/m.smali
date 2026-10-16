.class public abstract LHe/m;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 2
    .line 3
    const-string v1, "rx2.scheduler.drift-tolerance"

    .line 4
    .line 5
    const-wide/16 v2, 0xf

    .line 6
    .line 7
    invoke-static {v1, v2, v3}, Ljava/lang/Long;->getLong(Ljava/lang/String;J)Ljava/lang/Long;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public abstract a()LHe/l;
.end method

.method public b(Ljava/lang/Runnable;)LJe/b;
    .locals 1

    .line 1
    sget-object v0, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LHe/m;->c(Ljava/lang/Runnable;)LJe/b;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public c(Ljava/lang/Runnable;)LJe/b;
    .locals 3

    .line 1
    sget-object v0, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 2
    .line 3
    invoke-virtual {p0}, LHe/m;->a()LHe/l;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    new-instance v2, LHe/k;

    .line 8
    .line 9
    invoke-direct {v2, p1, v1}, LHe/k;-><init>(Ljava/lang/Runnable;LHe/l;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v2, v0}, LHe/l;->a(Ljava/lang/Runnable;Ljava/util/concurrent/TimeUnit;)LJe/b;

    .line 13
    .line 14
    .line 15
    return-object v2
.end method
