.class public Lcom/applovin/impl/r2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/applovin/impl/r2$b;,
        Lcom/applovin/impl/r2$c;
    }
.end annotation


# instance fields
.field protected a:Lcom/applovin/impl/r2$c;

.field protected b:Z

.field protected c:Landroid/text/SpannedString;

.field protected d:Landroid/text/SpannedString;

.field protected e:Ljava/lang/String;

.field protected f:Ljava/lang/String;

.field protected g:I

.field protected h:I

.field protected i:I

.field protected j:I

.field protected k:I

.field protected l:I

.field protected m:Z


# direct methods
.method private constructor <init>(Lcom/applovin/impl/r2$b;)V
    .locals 2

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 11
    iput v0, p0, Lcom/applovin/impl/r2;->g:I

    .line 12
    iput v0, p0, Lcom/applovin/impl/r2;->h:I

    const/high16 v1, -0x1000000

    .line 13
    iput v1, p0, Lcom/applovin/impl/r2;->i:I

    .line 14
    iput v1, p0, Lcom/applovin/impl/r2;->j:I

    .line 15
    iput v0, p0, Lcom/applovin/impl/r2;->k:I

    .line 16
    iput v0, p0, Lcom/applovin/impl/r2;->l:I

    .line 17
    iget-object v0, p1, Lcom/applovin/impl/r2$b;->a:Lcom/applovin/impl/r2$c;

    iput-object v0, p0, Lcom/applovin/impl/r2;->a:Lcom/applovin/impl/r2$c;

    .line 18
    iget-boolean v0, p1, Lcom/applovin/impl/r2$b;->b:Z

    iput-boolean v0, p0, Lcom/applovin/impl/r2;->b:Z

    .line 19
    iget-object v0, p1, Lcom/applovin/impl/r2$b;->c:Landroid/text/SpannedString;

    iput-object v0, p0, Lcom/applovin/impl/r2;->c:Landroid/text/SpannedString;

    .line 20
    iget-object v0, p1, Lcom/applovin/impl/r2$b;->d:Landroid/text/SpannedString;

    iput-object v0, p0, Lcom/applovin/impl/r2;->d:Landroid/text/SpannedString;

    .line 21
    iget-object v0, p1, Lcom/applovin/impl/r2$b;->e:Ljava/lang/String;

    iput-object v0, p0, Lcom/applovin/impl/r2;->e:Ljava/lang/String;

    .line 22
    iget-object v0, p1, Lcom/applovin/impl/r2$b;->f:Ljava/lang/String;

    iput-object v0, p0, Lcom/applovin/impl/r2;->f:Ljava/lang/String;

    .line 23
    iget v0, p1, Lcom/applovin/impl/r2$b;->g:I

    iput v0, p0, Lcom/applovin/impl/r2;->g:I

    .line 24
    iget v0, p1, Lcom/applovin/impl/r2$b;->h:I

    iput v0, p0, Lcom/applovin/impl/r2;->h:I

    .line 25
    iget v0, p1, Lcom/applovin/impl/r2$b;->i:I

    iput v0, p0, Lcom/applovin/impl/r2;->i:I

    .line 26
    iget v0, p1, Lcom/applovin/impl/r2$b;->j:I

    iput v0, p0, Lcom/applovin/impl/r2;->j:I

    .line 27
    iget v0, p1, Lcom/applovin/impl/r2$b;->k:I

    iput v0, p0, Lcom/applovin/impl/r2;->k:I

    .line 28
    iget v0, p1, Lcom/applovin/impl/r2$b;->l:I

    iput v0, p0, Lcom/applovin/impl/r2;->l:I

    .line 29
    iget-boolean p1, p1, Lcom/applovin/impl/r2$b;->m:Z

    iput-boolean p1, p0, Lcom/applovin/impl/r2;->m:Z

    return-void
.end method

.method public synthetic constructor <init>(Lcom/applovin/impl/r2$b;Lcom/applovin/impl/r2$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/applovin/impl/r2;-><init>(Lcom/applovin/impl/r2$b;)V

    return-void
.end method

.method public constructor <init>(Lcom/applovin/impl/r2$c;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lcom/applovin/impl/r2;->g:I

    .line 4
    iput v0, p0, Lcom/applovin/impl/r2;->h:I

    const/high16 v1, -0x1000000

    .line 5
    iput v1, p0, Lcom/applovin/impl/r2;->i:I

    .line 6
    iput v1, p0, Lcom/applovin/impl/r2;->j:I

    .line 7
    iput v0, p0, Lcom/applovin/impl/r2;->k:I

    .line 8
    iput v0, p0, Lcom/applovin/impl/r2;->l:I

    .line 9
    iput-object p1, p0, Lcom/applovin/impl/r2;->a:Lcom/applovin/impl/r2$c;

    return-void
.end method

.method public static a()Lcom/applovin/impl/r2$b;
    .locals 1

    .line 1
    sget-object v0, Lcom/applovin/impl/r2$c;->f:Lcom/applovin/impl/r2$c;

    invoke-static {v0}, Lcom/applovin/impl/r2;->a(Lcom/applovin/impl/r2$c;)Lcom/applovin/impl/r2$b;

    move-result-object v0

    return-object v0
.end method

.method public static a(Lcom/applovin/impl/r2$c;)Lcom/applovin/impl/r2$b;
    .locals 1

    .line 2
    new-instance v0, Lcom/applovin/impl/r2$b;

    invoke-direct {v0, p0}, Lcom/applovin/impl/r2$b;-><init>(Lcom/applovin/impl/r2$c;)V

    return-object v0
.end method

.method public static n()I
    .locals 1

    .line 1
    sget-object v0, Lcom/applovin/impl/r2$c;->g:Lcom/applovin/impl/r2$c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/applovin/impl/r2$c;->c()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/applovin/impl/r2;->f:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/applovin/impl/r2;->e:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public d()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/applovin/impl/r2;->h:I

    .line 2
    .line 3
    return v0
.end method

.method public e()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/applovin/impl/r2;->l:I

    .line 2
    .line 3
    return v0
.end method

.method public f()Landroid/text/SpannedString;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/applovin/impl/r2;->d:Landroid/text/SpannedString;

    .line 2
    .line 3
    return-object v0
.end method

.method public g()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/applovin/impl/r2;->j:I

    .line 2
    .line 3
    return v0
.end method

.method public h()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/applovin/impl/r2;->g:I

    .line 2
    .line 3
    return v0
.end method

.method public i()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/applovin/impl/r2;->k:I

    .line 2
    .line 3
    return v0
.end method

.method public j()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/applovin/impl/r2;->a:Lcom/applovin/impl/r2$c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/applovin/impl/r2$c;->b()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public k()Landroid/text/SpannedString;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/applovin/impl/r2;->c:Landroid/text/SpannedString;

    .line 2
    .line 3
    return-object v0
.end method

.method public l()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/applovin/impl/r2;->i:I

    .line 2
    .line 3
    return v0
.end method

.method public m()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/applovin/impl/r2;->a:Lcom/applovin/impl/r2$c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/applovin/impl/r2$c;->c()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public o()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/applovin/impl/r2;->b:Z

    .line 2
    .line 3
    return v0
.end method

.method public p()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/applovin/impl/r2;->m:Z

    .line 2
    .line 3
    return v0
.end method
