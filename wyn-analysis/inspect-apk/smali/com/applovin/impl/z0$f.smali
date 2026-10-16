.class Lcom/applovin/impl/z0$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/applovin/impl/privacy/cmp/CmpServiceImpl$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/applovin/impl/z0;->c(Lcom/applovin/impl/v0;Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Lcom/applovin/impl/v0;

.field final synthetic c:Landroid/app/Activity;

.field final synthetic d:Lcom/applovin/impl/z0;


# direct methods
.method public constructor <init>(Lcom/applovin/impl/z0;JLcom/applovin/impl/v0;Landroid/app/Activity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/applovin/impl/z0$f;->d:Lcom/applovin/impl/z0;

    .line 2
    .line 3
    iput-wide p2, p0, Lcom/applovin/impl/z0$f;->a:J

    .line 4
    .line 5
    iput-object p4, p0, Lcom/applovin/impl/z0$f;->b:Lcom/applovin/impl/v0;

    .line 6
    .line 7
    iput-object p5, p0, Lcom/applovin/impl/z0$f;->c:Landroid/app/Activity;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public a(Lcom/applovin/sdk/AppLovinCmpError;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/applovin/impl/z0$f;->d:Lcom/applovin/impl/z0;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/applovin/impl/z0;->f(Lcom/applovin/impl/z0;)Lcom/applovin/impl/u0$b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Lcom/applovin/impl/u0$b;->a(Lcom/applovin/sdk/AppLovinCmpError;)V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    iget-wide v2, p0, Lcom/applovin/impl/z0$f;->a:J

    .line 15
    .line 16
    sub-long/2addr v0, v2

    .line 17
    iget-object v2, p0, Lcom/applovin/impl/z0$f;->d:Lcom/applovin/impl/z0;

    .line 18
    .line 19
    invoke-static {v2, p1, v0, v1}, Lcom/applovin/impl/z0;->a(Lcom/applovin/impl/z0;Lcom/applovin/sdk/AppLovinCmpError;J)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lcom/applovin/impl/z0$f;->d:Lcom/applovin/impl/z0;

    .line 23
    .line 24
    iget-object v1, p0, Lcom/applovin/impl/z0$f;->b:Lcom/applovin/impl/v0;

    .line 25
    .line 26
    iget-object v2, p0, Lcom/applovin/impl/z0$f;->c:Landroid/app/Activity;

    .line 27
    .line 28
    if-nez p1, :cond_0

    .line 29
    .line 30
    const/4 p1, 0x1

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 p1, 0x0

    .line 33
    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-static {v0, v1, v2, p1}, Lcom/applovin/impl/z0;->a(Lcom/applovin/impl/z0;Lcom/applovin/impl/v0;Landroid/app/Activity;Ljava/lang/Boolean;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method
