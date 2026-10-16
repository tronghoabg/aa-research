.class public final Lcom/moloco/sdk/acm/recorder/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/moloco/sdk/acm/recorder/b;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/moloco/sdk/acm/recorder/c;->a:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lcom/moloco/sdk/acm/h;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/acm/recorder/c;->a:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string v1, "mediator"

    .line 13
    .line 14
    invoke-virtual {p1, v1, v0}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sget-object v0, Lcom/moloco/sdk/acm/f;->a:Lcom/moloco/sdk/acm/f;

    .line 18
    .line 19
    invoke-static {p1}, Lcom/moloco/sdk/acm/f;->a(Lcom/moloco/sdk/acm/h;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    :goto_0
    sget-object v0, Lcom/moloco/sdk/acm/f;->a:Lcom/moloco/sdk/acm/f;

    .line 24
    .line 25
    invoke-static {p1}, Lcom/moloco/sdk/acm/f;->a(Lcom/moloco/sdk/acm/h;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final b(Lcom/moloco/sdk/acm/l;)V
    .locals 2

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/moloco/sdk/acm/recorder/c;->a:Ljava/lang/String;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-string v1, "mediator"

    .line 18
    .line 19
    invoke-virtual {p1, v1, v0}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    sget-object v0, Lcom/moloco/sdk/acm/f;->a:Lcom/moloco/sdk/acm/f;

    .line 23
    .line 24
    invoke-static {p1}, Lcom/moloco/sdk/acm/f;->b(Lcom/moloco/sdk/acm/l;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    :goto_0
    sget-object v0, Lcom/moloco/sdk/acm/f;->a:Lcom/moloco/sdk/acm/f;

    .line 29
    .line 30
    invoke-static {p1}, Lcom/moloco/sdk/acm/f;->b(Lcom/moloco/sdk/acm/l;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final c(Ljava/lang/String;)Lcom/moloco/sdk/acm/l;
    .locals 4

    .line 1
    sget-object v0, Lcom/moloco/sdk/acm/f;->h:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lcom/moloco/sdk/acm/o;->a:Lcom/moloco/sdk/acm/o;

    .line 8
    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    const-string v0, "AndroidClientMetrics"

    .line 12
    .line 13
    const-string v1, "Moloco Client Metrics not initialized"

    .line 14
    .line 15
    invoke-static {v0, v1}, Lcom/moloco/sdk/acm/services/e;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    sget-object v0, Lcom/moloco/sdk/acm/l;->Companion:Lcom/moloco/sdk/acm/k;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    new-instance v0, Lcom/moloco/sdk/acm/services/f;

    .line 24
    .line 25
    new-instance v1, Lad/r;

    .line 26
    .line 27
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-direct {v0, v1}, Lcom/moloco/sdk/acm/services/f;-><init>(Lad/r;)V

    .line 31
    .line 32
    .line 33
    new-instance v1, Lcom/moloco/sdk/acm/l;

    .line 34
    .line 35
    invoke-direct {v1, p1, v0}, Lcom/moloco/sdk/acm/l;-><init>(Ljava/lang/String;Lcom/moloco/sdk/acm/services/f;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, v0, Lcom/moloco/sdk/acm/services/f;->a:Ljava/util/concurrent/atomic/AtomicLong;

    .line 39
    .line 40
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 41
    .line 42
    .line 43
    move-result-wide v2

    .line 44
    invoke-virtual {p1, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 45
    .line 46
    .line 47
    return-object v1
.end method
