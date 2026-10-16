.class public final Lcg/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcg/F;


# virtual methods
.method public final E(Lcg/g;J)V
    .locals 1

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, p2, p3}, Lcg/g;->skip(J)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final close()V
    .locals 0

    .line 1
    return-void
.end method

.method public final flush()V
    .locals 0

    .line 1
    return-void
.end method

.method public final timeout()Lcg/J;
    .locals 1

    .line 1
    sget-object v0, Lcg/J;->d:Lcg/I;

    .line 2
    .line 3
    return-object v0
.end method
