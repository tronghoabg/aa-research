.class public Lcom/applovin/impl/s4;
.super Lcom/applovin/impl/r2;
.source "SourceFile"


# instance fields
.field private final n:Lcom/applovin/impl/p0$a;

.field private final o:Landroid/content/Context;

.field private final p:Z


# direct methods
.method public constructor <init>(Lcom/applovin/impl/p0$a;ZLandroid/content/Context;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/applovin/impl/r2$c;->f:Lcom/applovin/impl/r2$c;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/applovin/impl/r2;-><init>(Lcom/applovin/impl/r2$c;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/applovin/impl/s4;->n:Lcom/applovin/impl/p0$a;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/applovin/impl/s4;->o:Landroid/content/Context;

    .line 9
    .line 10
    new-instance p3, Landroid/text/SpannedString;

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/applovin/impl/p0$a;->a()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-direct {p3, p1}, Landroid/text/SpannedString;-><init>(Ljava/lang/CharSequence;)V

    .line 17
    .line 18
    .line 19
    iput-object p3, p0, Lcom/applovin/impl/r2;->c:Landroid/text/SpannedString;

    .line 20
    .line 21
    iput-boolean p2, p0, Lcom/applovin/impl/s4;->p:Z

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public f()Landroid/text/SpannedString;
    .locals 3

    .line 1
    new-instance v0, Landroid/text/SpannedString;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/applovin/impl/s4;->n:Lcom/applovin/impl/p0$a;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/applovin/impl/s4;->o:Landroid/content/Context;

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Lcom/applovin/impl/p0$a;->a(Landroid/content/Context;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Landroid/text/SpannedString;-><init>(Ljava/lang/CharSequence;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public o()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public p()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/applovin/impl/s4;->n:Lcom/applovin/impl/p0$a;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/applovin/impl/s4;->o:Landroid/content/Context;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/applovin/impl/p0$a;->b(Landroid/content/Context;)Ljava/lang/Boolean;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-boolean v1, p0, Lcom/applovin/impl/s4;->p:Z

    .line 12
    .line 13
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    return v0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    return v0
.end method
