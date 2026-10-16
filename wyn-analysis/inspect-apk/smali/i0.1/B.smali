.class public abstract Li0/B;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LA0/p;


# virtual methods
.method public abstract a(Lg0/d;)V
.end method

.method public b()Ltf/a;
    .locals 1

    .line 1
    iget-object v0, p0, Li0/B;->a:LA0/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Li0/B;->b()Ltf/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0}, Ltf/a;->invoke()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public d(LA0/p;)V
    .locals 0

    .line 1
    iput-object p1, p0, Li0/B;->a:LA0/p;

    .line 2
    .line 3
    return-void
.end method
