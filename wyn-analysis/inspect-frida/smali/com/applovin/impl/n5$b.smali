.class Lcom/applovin/impl/n5$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/applovin/impl/m5$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/applovin/impl/n5;->o()Lcom/applovin/impl/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/applovin/impl/n5;


# direct methods
.method public constructor <init>(Lcom/applovin/impl/n5;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/applovin/impl/n5$b;->a:Lcom/applovin/impl/n5;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/applovin/impl/n5$b;->a:Lcom/applovin/impl/n5;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lcom/applovin/impl/n5;->a(Lcom/applovin/impl/n5;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Lcom/applovin/impl/n5$b;->a:Lcom/applovin/impl/n5;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/applovin/impl/n5;->a(Lcom/applovin/impl/n5;)Lcom/applovin/impl/sdk/ad/a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0, p1}, Lcom/applovin/impl/sdk/ad/a;->d(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lcom/applovin/impl/n5$b;->a:Lcom/applovin/impl/n5;

    .line 17
    .line 18
    invoke-static {p1}, Lcom/applovin/impl/n5;->a(Lcom/applovin/impl/n5;)Lcom/applovin/impl/sdk/ad/a;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const/4 v0, 0x1

    .line 23
    invoke-virtual {p1, v0}, Lcom/applovin/impl/sdk/ad/b;->b(Z)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lcom/applovin/impl/n5$b;->a:Lcom/applovin/impl/n5;

    .line 27
    .line 28
    iget-object p1, p1, Lcom/applovin/impl/j5;->c:Lcom/applovin/impl/sdk/o;

    .line 29
    .line 30
    invoke-static {}, Lcom/applovin/impl/sdk/o;->a()Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_0

    .line 35
    .line 36
    iget-object p1, p0, Lcom/applovin/impl/n5$b;->a:Lcom/applovin/impl/n5;

    .line 37
    .line 38
    iget-object v0, p1, Lcom/applovin/impl/j5;->c:Lcom/applovin/impl/sdk/o;

    .line 39
    .line 40
    iget-object p1, p1, Lcom/applovin/impl/j5;->b:Ljava/lang/String;

    .line 41
    .line 42
    new-instance v1, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string v2, "Finish caching non-video resources for ad #"

    .line 45
    .line 46
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    iget-object v2, p0, Lcom/applovin/impl/n5$b;->a:Lcom/applovin/impl/n5;

    .line 50
    .line 51
    invoke-static {v2}, Lcom/applovin/impl/n5;->a(Lcom/applovin/impl/n5;)Lcom/applovin/impl/sdk/ad/a;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v2}, Lcom/applovin/impl/sdk/ad/AppLovinAdImpl;->getAdIdNumber()J

    .line 56
    .line 57
    .line 58
    move-result-wide v2

    .line 59
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v0, p1, v1}, Lcom/applovin/impl/sdk/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    :cond_0
    iget-object p1, p0, Lcom/applovin/impl/n5$b;->a:Lcom/applovin/impl/n5;

    .line 70
    .line 71
    iget-object v0, p1, Lcom/applovin/impl/j5;->c:Lcom/applovin/impl/sdk/o;

    .line 72
    .line 73
    iget-object p1, p1, Lcom/applovin/impl/j5;->b:Ljava/lang/String;

    .line 74
    .line 75
    new-instance v1, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    const-string v2, "Ad updated with cachedHTML = "

    .line 78
    .line 79
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    iget-object v2, p0, Lcom/applovin/impl/n5$b;->a:Lcom/applovin/impl/n5;

    .line 83
    .line 84
    invoke-static {v2}, Lcom/applovin/impl/n5;->a(Lcom/applovin/impl/n5;)Lcom/applovin/impl/sdk/ad/a;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-virtual {v2}, Lcom/applovin/impl/sdk/ad/a;->g1()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-virtual {v0, p1, v1}, Lcom/applovin/impl/sdk/o;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    return-void
.end method
