.class Lcom/applovin/impl/m6$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/applovin/impl/q0$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/applovin/impl/m6;-><init>(Lcom/applovin/impl/sdk/network/a;Lcom/applovin/impl/sdk/k;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/applovin/impl/sdk/k;

.field final synthetic b:Lcom/applovin/impl/m6;


# direct methods
.method public constructor <init>(Lcom/applovin/impl/m6;Lcom/applovin/impl/sdk/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/applovin/impl/m6$a;->b:Lcom/applovin/impl/m6;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/applovin/impl/m6$a;->a:Lcom/applovin/impl/sdk/k;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Object;)V
    .locals 5

    const/16 p1, 0xc8

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-lt p2, p1, :cond_1

    const/16 p1, 0x1f4

    if-lt p2, p1, :cond_0

    goto :goto_0

    :cond_0
    move p1, v0

    goto :goto_1

    :cond_1
    :goto_0
    move p1, v1

    :goto_1
    const/16 v2, 0x1ad

    if-ne p2, v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    move v2, v0

    :goto_2
    const/16 v3, -0x3f1

    if-eq p2, v3, :cond_3

    goto :goto_3

    .line 3
    :cond_3
    iget-object v3, p0, Lcom/applovin/impl/m6$a;->b:Lcom/applovin/impl/m6;

    invoke-static {v3}, Lcom/applovin/impl/m6;->a(Lcom/applovin/impl/m6;)Lcom/applovin/impl/sdk/network/a;

    move-result-object v3

    invoke-virtual {v3}, Lcom/applovin/impl/sdk/network/a;->q()Z

    move-result v3

    if-eqz v3, :cond_4

    :goto_3
    move v3, v1

    goto :goto_4

    :cond_4
    move v3, v0

    :goto_4
    const/16 v4, -0x384

    if-eq p2, v4, :cond_5

    const/16 v4, -0x3e8

    if-eq p2, v4, :cond_5

    move v4, v1

    goto :goto_5

    :cond_5
    move v4, v0

    :goto_5
    if-eqz v3, :cond_e

    if-eqz v4, :cond_e

    if-nez p1, :cond_6

    if-nez v2, :cond_6

    .line 4
    iget-object p1, p0, Lcom/applovin/impl/m6$a;->b:Lcom/applovin/impl/m6;

    invoke-static {p1}, Lcom/applovin/impl/m6;->a(Lcom/applovin/impl/m6;)Lcom/applovin/impl/sdk/network/a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/applovin/impl/sdk/network/a;->p()Z

    move-result p1

    if-eqz p1, :cond_e

    .line 5
    :cond_6
    iget-object p1, p0, Lcom/applovin/impl/m6$a;->b:Lcom/applovin/impl/m6;

    invoke-static {p1}, Lcom/applovin/impl/m6;->a(Lcom/applovin/impl/m6;)Lcom/applovin/impl/sdk/network/a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/applovin/impl/sdk/network/a;->a()Ljava/lang/String;

    move-result-object p1

    .line 6
    iget-object v2, p0, Lcom/applovin/impl/m6$a;->b:Lcom/applovin/impl/m6;

    invoke-static {v2}, Lcom/applovin/impl/m6;->a(Lcom/applovin/impl/m6;)Lcom/applovin/impl/sdk/network/a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/applovin/impl/sdk/network/a;->j()I

    move-result v2

    if-lez v2, :cond_c

    .line 7
    iget-object p3, p0, Lcom/applovin/impl/m6$a;->b:Lcom/applovin/impl/m6;

    iget-object p3, p3, Lcom/applovin/impl/j5;->c:Lcom/applovin/impl/sdk/o;

    invoke-static {}, Lcom/applovin/impl/sdk/o;->a()Z

    move-result p3

    if-eqz p3, :cond_7

    iget-object p3, p0, Lcom/applovin/impl/m6$a;->b:Lcom/applovin/impl/m6;

    iget-object p4, p3, Lcom/applovin/impl/j5;->c:Lcom/applovin/impl/sdk/o;

    iget-object p3, p3, Lcom/applovin/impl/j5;->b:Ljava/lang/String;

    const-string v2, "Unable to send request due to server failure (code "

    const-string v3, "). "

    .line 8
    invoke-static {p2, v2, v3}, Lpd/f;->l(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    .line 9
    iget-object v2, p0, Lcom/applovin/impl/m6$a;->b:Lcom/applovin/impl/m6;

    .line 10
    invoke-static {v2}, Lcom/applovin/impl/m6;->a(Lcom/applovin/impl/m6;)Lcom/applovin/impl/sdk/network/a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/applovin/impl/sdk/network/a;->j()I

    move-result v2

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " attempts left, retrying in "

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v3, p0, Lcom/applovin/impl/m6$a;->b:Lcom/applovin/impl/m6;

    invoke-static {v3}, Lcom/applovin/impl/m6;->a(Lcom/applovin/impl/m6;)Lcom/applovin/impl/sdk/network/a;

    move-result-object v3

    invoke-virtual {v3}, Lcom/applovin/impl/sdk/network/a;->k()I

    move-result v3

    int-to-long v3, v3

    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v2

    invoke-virtual {p2, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, " seconds..."

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 11
    invoke-virtual {p4, p3, p2}, Lcom/applovin/impl/sdk/o;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    :cond_7
    iget-object p2, p0, Lcom/applovin/impl/m6$a;->b:Lcom/applovin/impl/m6;

    invoke-static {p2}, Lcom/applovin/impl/m6;->a(Lcom/applovin/impl/m6;)Lcom/applovin/impl/sdk/network/a;

    move-result-object p2

    invoke-virtual {p2}, Lcom/applovin/impl/sdk/network/a;->j()I

    move-result p2

    sub-int/2addr p2, v1

    .line 13
    iget-object p3, p0, Lcom/applovin/impl/m6$a;->b:Lcom/applovin/impl/m6;

    invoke-static {p3}, Lcom/applovin/impl/m6;->a(Lcom/applovin/impl/m6;)Lcom/applovin/impl/sdk/network/a;

    move-result-object p3

    invoke-virtual {p3, p2}, Lcom/applovin/impl/sdk/network/a;->a(I)V

    if-nez p2, :cond_9

    .line 14
    iget-object p2, p0, Lcom/applovin/impl/m6$a;->b:Lcom/applovin/impl/m6;

    invoke-static {p2}, Lcom/applovin/impl/m6;->b(Lcom/applovin/impl/m6;)Lcom/applovin/impl/y4;

    move-result-object p3

    invoke-static {p2, p3}, Lcom/applovin/impl/m6;->a(Lcom/applovin/impl/m6;Lcom/applovin/impl/y4;)V

    .line 15
    invoke-static {p1}, Lcom/applovin/impl/sdk/utils/StringUtils;->isValidString(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_9

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    const/4 p3, 0x4

    if-lt p2, p3, :cond_9

    .line 16
    iget-object p2, p0, Lcom/applovin/impl/m6$a;->b:Lcom/applovin/impl/m6;

    iget-object p2, p2, Lcom/applovin/impl/j5;->c:Lcom/applovin/impl/sdk/o;

    invoke-static {}, Lcom/applovin/impl/sdk/o;->a()Z

    move-result p2

    if-eqz p2, :cond_8

    iget-object p2, p0, Lcom/applovin/impl/m6$a;->b:Lcom/applovin/impl/m6;

    iget-object p3, p2, Lcom/applovin/impl/j5;->c:Lcom/applovin/impl/sdk/o;

    iget-object p2, p2, Lcom/applovin/impl/j5;->b:Ljava/lang/String;

    const-string p4, "Switching to backup endpoint "

    invoke-virtual {p4, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p2, p4}, Lcom/applovin/impl/sdk/o;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    :cond_8
    iget-object p2, p0, Lcom/applovin/impl/m6$a;->b:Lcom/applovin/impl/m6;

    invoke-static {p2}, Lcom/applovin/impl/m6;->a(Lcom/applovin/impl/m6;)Lcom/applovin/impl/sdk/network/a;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/applovin/impl/sdk/network/a;->a(Ljava/lang/String;)V

    move v0, v1

    .line 18
    :cond_9
    iget-object p1, p0, Lcom/applovin/impl/m6$a;->a:Lcom/applovin/impl/sdk/k;

    sget-object p2, Lcom/applovin/impl/y4;->l3:Lcom/applovin/impl/y4;

    invoke-virtual {p1, p2}, Lcom/applovin/impl/sdk/k;->a(Lcom/applovin/impl/y4;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_a

    if-eqz v0, :cond_a

    const-wide/16 p1, 0x0

    goto :goto_6

    .line 19
    :cond_a
    iget-object p1, p0, Lcom/applovin/impl/m6$a;->b:Lcom/applovin/impl/m6;

    invoke-static {p1}, Lcom/applovin/impl/m6;->a(Lcom/applovin/impl/m6;)Lcom/applovin/impl/sdk/network/a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/applovin/impl/sdk/network/a;->n()Z

    move-result p1

    if-eqz p1, :cond_b

    .line 20
    sget-object p1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object p2, p0, Lcom/applovin/impl/m6$a;->b:Lcom/applovin/impl/m6;

    invoke-static {p2}, Lcom/applovin/impl/m6;->a(Lcom/applovin/impl/m6;)Lcom/applovin/impl/sdk/network/a;

    move-result-object p2

    invoke-virtual {p2}, Lcom/applovin/impl/sdk/network/a;->c()I

    move-result p2

    int-to-double p2, p2

    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    invoke-static {v0, v1, p2, p3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide p2

    double-to-long p2, p2

    invoke-virtual {p1, p2, p3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide p1

    goto :goto_6

    .line 21
    :cond_b
    iget-object p1, p0, Lcom/applovin/impl/m6$a;->b:Lcom/applovin/impl/m6;

    invoke-static {p1}, Lcom/applovin/impl/m6;->a(Lcom/applovin/impl/m6;)Lcom/applovin/impl/sdk/network/a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/applovin/impl/sdk/network/a;->k()I

    move-result p1

    int-to-long p1, p1

    .line 22
    :goto_6
    iget-object p3, p0, Lcom/applovin/impl/m6$a;->a:Lcom/applovin/impl/sdk/k;

    invoke-virtual {p3}, Lcom/applovin/impl/sdk/k;->r0()Lcom/applovin/impl/e6;

    move-result-object p3

    iget-object p4, p0, Lcom/applovin/impl/m6$a;->b:Lcom/applovin/impl/m6;

    invoke-static {p4}, Lcom/applovin/impl/m6;->c(Lcom/applovin/impl/m6;)Lcom/applovin/impl/e6$b;

    move-result-object v0

    invoke-virtual {p3, p4, v0, p1, p2}, Lcom/applovin/impl/e6;->a(Lcom/applovin/impl/j5;Lcom/applovin/impl/e6$b;J)V

    return-void

    :cond_c
    if-eqz p1, :cond_d

    .line 23
    iget-object v0, p0, Lcom/applovin/impl/m6$a;->b:Lcom/applovin/impl/m6;

    invoke-static {v0}, Lcom/applovin/impl/m6;->a(Lcom/applovin/impl/m6;)Lcom/applovin/impl/sdk/network/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/applovin/impl/sdk/network/a;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_d

    .line 24
    iget-object p1, p0, Lcom/applovin/impl/m6$a;->b:Lcom/applovin/impl/m6;

    invoke-static {p1}, Lcom/applovin/impl/m6;->d(Lcom/applovin/impl/m6;)Lcom/applovin/impl/y4;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/applovin/impl/m6;->a(Lcom/applovin/impl/m6;Lcom/applovin/impl/y4;)V

    goto :goto_7

    .line 25
    :cond_d
    iget-object p1, p0, Lcom/applovin/impl/m6$a;->b:Lcom/applovin/impl/m6;

    invoke-static {p1}, Lcom/applovin/impl/m6;->b(Lcom/applovin/impl/m6;)Lcom/applovin/impl/y4;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/applovin/impl/m6;->a(Lcom/applovin/impl/m6;Lcom/applovin/impl/y4;)V

    .line 26
    :goto_7
    iget-object p1, p0, Lcom/applovin/impl/m6$a;->b:Lcom/applovin/impl/m6;

    invoke-static {p1}, Lcom/applovin/impl/m6;->a(Lcom/applovin/impl/m6;)Lcom/applovin/impl/sdk/network/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/applovin/impl/sdk/network/a;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, p2, p3, p4}, Lcom/applovin/impl/m6;->a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Object;)V

    return-void

    .line 27
    :cond_e
    iget-object p1, p0, Lcom/applovin/impl/m6$a;->b:Lcom/applovin/impl/m6;

    invoke-static {p1}, Lcom/applovin/impl/m6;->a(Lcom/applovin/impl/m6;)Lcom/applovin/impl/sdk/network/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/applovin/impl/sdk/network/a;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, p2, p3, p4}, Lcom/applovin/impl/m6;->a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/Object;I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/applovin/impl/m6$a;->b:Lcom/applovin/impl/m6;

    invoke-static {v0}, Lcom/applovin/impl/m6;->a(Lcom/applovin/impl/m6;)Lcom/applovin/impl/sdk/network/a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/applovin/impl/sdk/network/a;->a(I)V

    .line 2
    iget-object v0, p0, Lcom/applovin/impl/m6$a;->b:Lcom/applovin/impl/m6;

    invoke-virtual {v0, p1, p2, p3}, Lcom/applovin/impl/m6;->a(Ljava/lang/String;Ljava/lang/Object;I)V

    return-void
.end method
