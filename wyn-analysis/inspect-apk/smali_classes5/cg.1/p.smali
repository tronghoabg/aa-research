.class public final Lcg/p;
.super Lcg/J;
.source "SourceFile"


# instance fields
.field public e:Lcg/J;


# direct methods
.method public constructor <init>(Lcg/J;)V
    .locals 1

    .line 1
    const-string v0, "delegate"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcg/p;->e:Lcg/J;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a()Lcg/J;
    .locals 1

    .line 1
    iget-object v0, p0, Lcg/p;->e:Lcg/J;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcg/J;->a()Lcg/J;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final b()Lcg/J;
    .locals 1

    .line 1
    iget-object v0, p0, Lcg/p;->e:Lcg/J;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcg/J;->b()Lcg/J;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final c()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcg/p;->e:Lcg/J;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcg/J;->c()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final d(J)Lcg/J;
    .locals 1

    .line 1
    iget-object v0, p0, Lcg/p;->e:Lcg/J;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lcg/J;->d(J)Lcg/J;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final e()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcg/p;->e:Lcg/J;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcg/J;->e()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final f()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcg/p;->e:Lcg/J;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcg/J;->f()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final g(JLjava/util/concurrent/TimeUnit;)Lcg/J;
    .locals 1

    .line 1
    const-string v0, "unit"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcg/p;->e:Lcg/J;

    .line 7
    .line 8
    invoke-virtual {v0, p1, p2, p3}, Lcg/J;->g(JLjava/util/concurrent/TimeUnit;)Lcg/J;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method
