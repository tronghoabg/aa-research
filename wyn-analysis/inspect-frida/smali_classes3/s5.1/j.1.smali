.class public final Ls5/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh9/e;


# static fields
.field public static final a:Ls5/j;

.field public static final b:Lh9/d;

.field public static final c:Lh9/d;

.field public static final d:Lh9/d;

.field public static final e:Lh9/d;

.field public static final f:Lh9/d;

.field public static final g:Lh9/d;

.field public static final h:Lh9/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ls5/j;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ls5/j;->a:Ls5/j;

    .line 7
    .line 8
    const-string v0, "requestTimeMs"

    .line 9
    .line 10
    invoke-static {v0}, Lh9/d;->c(Ljava/lang/String;)Lh9/d;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Ls5/j;->b:Lh9/d;

    .line 15
    .line 16
    const-string v0, "requestUptimeMs"

    .line 17
    .line 18
    invoke-static {v0}, Lh9/d;->c(Ljava/lang/String;)Lh9/d;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sput-object v0, Ls5/j;->c:Lh9/d;

    .line 23
    .line 24
    const-string v0, "clientInfo"

    .line 25
    .line 26
    invoke-static {v0}, Lh9/d;->c(Ljava/lang/String;)Lh9/d;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sput-object v0, Ls5/j;->d:Lh9/d;

    .line 31
    .line 32
    const-string v0, "logSource"

    .line 33
    .line 34
    invoke-static {v0}, Lh9/d;->c(Ljava/lang/String;)Lh9/d;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, Ls5/j;->e:Lh9/d;

    .line 39
    .line 40
    const-string v0, "logSourceName"

    .line 41
    .line 42
    invoke-static {v0}, Lh9/d;->c(Ljava/lang/String;)Lh9/d;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sput-object v0, Ls5/j;->f:Lh9/d;

    .line 47
    .line 48
    const-string v0, "logEvent"

    .line 49
    .line 50
    invoke-static {v0}, Lh9/d;->c(Ljava/lang/String;)Lh9/d;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    sput-object v0, Ls5/j;->g:Lh9/d;

    .line 55
    .line 56
    const-string v0, "qosTier"

    .line 57
    .line 58
    invoke-static {v0}, Lh9/d;->c(Ljava/lang/String;)Lh9/d;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    sput-object v0, Ls5/j;->h:Lh9/d;

    .line 63
    .line 64
    return-void
.end method


# virtual methods
.method public final encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, Ls5/G;

    .line 2
    .line 3
    check-cast p2, Lh9/f;

    .line 4
    .line 5
    check-cast p1, Ls5/u;

    .line 6
    .line 7
    iget-wide v0, p1, Ls5/u;->a:J

    .line 8
    .line 9
    sget-object v2, Ls5/j;->b:Lh9/d;

    .line 10
    .line 11
    invoke-interface {p2, v2, v0, v1}, Lh9/f;->add(Lh9/d;J)Lh9/f;

    .line 12
    .line 13
    .line 14
    iget-wide v0, p1, Ls5/u;->b:J

    .line 15
    .line 16
    sget-object v2, Ls5/j;->c:Lh9/d;

    .line 17
    .line 18
    invoke-interface {p2, v2, v0, v1}, Lh9/f;->add(Lh9/d;J)Lh9/f;

    .line 19
    .line 20
    .line 21
    iget-object v0, p1, Ls5/u;->c:Ls5/o;

    .line 22
    .line 23
    sget-object v1, Ls5/j;->d:Lh9/d;

    .line 24
    .line 25
    invoke-interface {p2, v1, v0}, Lh9/f;->add(Lh9/d;Ljava/lang/Object;)Lh9/f;

    .line 26
    .line 27
    .line 28
    sget-object v0, Ls5/j;->e:Lh9/d;

    .line 29
    .line 30
    iget-object v1, p1, Ls5/u;->d:Ljava/lang/Integer;

    .line 31
    .line 32
    invoke-interface {p2, v0, v1}, Lh9/f;->add(Lh9/d;Ljava/lang/Object;)Lh9/f;

    .line 33
    .line 34
    .line 35
    sget-object v0, Ls5/j;->f:Lh9/d;

    .line 36
    .line 37
    iget-object v1, p1, Ls5/u;->e:Ljava/lang/String;

    .line 38
    .line 39
    invoke-interface {p2, v0, v1}, Lh9/f;->add(Lh9/d;Ljava/lang/Object;)Lh9/f;

    .line 40
    .line 41
    .line 42
    iget-object p1, p1, Ls5/u;->f:Ljava/util/ArrayList;

    .line 43
    .line 44
    sget-object v0, Ls5/j;->g:Lh9/d;

    .line 45
    .line 46
    invoke-interface {p2, v0, p1}, Lh9/f;->add(Lh9/d;Ljava/lang/Object;)Lh9/f;

    .line 47
    .line 48
    .line 49
    sget-object p1, Ls5/K;->a:Ls5/K;

    .line 50
    .line 51
    sget-object v0, Ls5/j;->h:Lh9/d;

    .line 52
    .line 53
    invoke-interface {p2, v0, p1}, Lh9/f;->add(Lh9/d;Ljava/lang/Object;)Lh9/f;

    .line 54
    .line 55
    .line 56
    return-void
.end method
