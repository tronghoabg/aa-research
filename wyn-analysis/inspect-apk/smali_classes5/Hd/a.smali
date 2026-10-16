.class public abstract LHd/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lwa/a;

.field public static final b:Lwa/a;

.field public static final c:Lwa/a;

.field public static final d:Lwa/a;

.field public static final e:Lwa/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lwa/a;

    .line 2
    .line 3
    const/16 v1, 0x13

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lwa/a;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, LHd/a;->a:Lwa/a;

    .line 9
    .line 10
    new-instance v0, Lwa/a;

    .line 11
    .line 12
    const/16 v1, 0x13

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lwa/a;-><init>(I)V

    .line 15
    .line 16
    .line 17
    sput-object v0, LHd/a;->b:Lwa/a;

    .line 18
    .line 19
    new-instance v0, Lwa/a;

    .line 20
    .line 21
    const/16 v1, 0x13

    .line 22
    .line 23
    invoke-direct {v0, v1}, Lwa/a;-><init>(I)V

    .line 24
    .line 25
    .line 26
    sput-object v0, LHd/a;->c:Lwa/a;

    .line 27
    .line 28
    new-instance v0, Lwa/a;

    .line 29
    .line 30
    const/16 v1, 0x13

    .line 31
    .line 32
    invoke-direct {v0, v1}, Lwa/a;-><init>(I)V

    .line 33
    .line 34
    .line 35
    sput-object v0, LHd/a;->d:Lwa/a;

    .line 36
    .line 37
    new-instance v0, Lwa/a;

    .line 38
    .line 39
    const/16 v1, 0x13

    .line 40
    .line 41
    invoke-direct {v0, v1}, Lwa/a;-><init>(I)V

    .line 42
    .line 43
    .line 44
    sput-object v0, LHd/a;->e:Lwa/a;

    .line 45
    .line 46
    return-void
.end method

.method public static final a(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    .locals 3

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    move-object v0, p0

    .line 7
    :goto_0
    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    .line 8
    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    move-object v1, v0

    .line 12
    check-cast v1, Ljava/util/concurrent/CancellationException;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    if-nez v0, :cond_2

    .line 31
    .line 32
    :goto_1
    return-object p0

    .line 33
    :cond_2
    return-object v0
.end method
