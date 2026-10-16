.class public Lcom/applovin/impl/t0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/StringBuilder;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/applovin/impl/t0;->a:Ljava/lang/StringBuilder;

    .line 10
    .line 11
    return-void
.end method

.method private a(Lcom/applovin/impl/v0;)Ljava/lang/String;
    .locals 2

    .line 10
    invoke-virtual {p1}, Lcom/applovin/impl/v0;->d()Lcom/applovin/impl/v0$b;

    move-result-object v0

    .line 11
    sget-object v1, Lcom/applovin/impl/v0$b;->c:Lcom/applovin/impl/v0$b;

    if-ne v0, v1, :cond_0

    .line 12
    check-cast p1, Lcom/applovin/impl/y0;

    invoke-virtual {p1}, Lcom/applovin/impl/y0;->g()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 13
    :cond_0
    sget-object v1, Lcom/applovin/impl/v0$b;->g:Lcom/applovin/impl/v0$b;

    if-ne v0, v1, :cond_1

    .line 14
    invoke-virtual {p1}, Lcom/applovin/impl/v0;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/applovin/impl/sdk/utils/StringUtils;->emptyIfNull(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 15
    :cond_1
    invoke-virtual {p1}, Lcom/applovin/impl/v0;->e()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/applovin/impl/sdk/utils/StringUtils;->emptyIfNull(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private a(Ljava/lang/String;)V
    .locals 1

    .line 9
    iget-object v0, p0, Lcom/applovin/impl/t0;->a:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\n"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method private a(Ljava/lang/String;J)V
    .locals 1

    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " after "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, "ms"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/applovin/impl/t0;->a(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 7
    iget-object v0, p0, Lcom/applovin/impl/t0;->a:Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->setLength(I)V

    return-void
.end method

.method public a(Lcom/applovin/impl/v0;J)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/applovin/impl/v0;->d()Lcom/applovin/impl/v0$b;

    move-result-object v0

    sget-object v1, Lcom/applovin/impl/v0$b;->g:Lcom/applovin/impl/v0$b;

    if-ne v0, v1, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-direct {p0, p1}, Lcom/applovin/impl/t0;->a(Lcom/applovin/impl/v0;)Ljava/lang/String;

    move-result-object p1

    .line 3
    invoke-direct {p0, p1, p2, p3}, Lcom/applovin/impl/t0;->a(Ljava/lang/String;J)V

    return-void
.end method

.method public a(Lcom/applovin/impl/v0;ZJ)V
    .locals 1

    .line 4
    invoke-direct {p0, p1}, Lcom/applovin/impl/t0;->a(Lcom/applovin/impl/v0;)Ljava/lang/String;

    move-result-object p1

    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 6
    invoke-direct {p0, p1, p3, p4}, Lcom/applovin/impl/t0;->a(Ljava/lang/String;J)V

    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    const-string v0, "Invalid Activity"

    invoke-direct {p0, v0}, Lcom/applovin/impl/t0;->a(Ljava/lang/String;)V

    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    .line 2
    const-string v0, "Invalid state: "

    .line 3
    invoke-static {v0, p1}, LR8/v;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 4
    invoke-direct {p0, p1}, Lcom/applovin/impl/t0;->a(Ljava/lang/String;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/applovin/impl/t0;->a:Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
