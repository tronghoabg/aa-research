.class Lcom/applovin/impl/o5$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/applovin/impl/e0$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/applovin/impl/o5;->r()Lcom/applovin/impl/e0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/applovin/impl/d8;

.field final synthetic b:Lcom/applovin/impl/o5;


# direct methods
.method public constructor <init>(Lcom/applovin/impl/o5;Lcom/applovin/impl/d8;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/applovin/impl/o5$d;->b:Lcom/applovin/impl/o5;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/applovin/impl/o5$d;->a:Lcom/applovin/impl/d8;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Landroid/net/Uri;)V
    .locals 4

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lcom/applovin/impl/o5$d;->b:Lcom/applovin/impl/o5;

    .line 4
    .line 5
    iget-object v0, v0, Lcom/applovin/impl/j5;->c:Lcom/applovin/impl/sdk/o;

    .line 6
    .line 7
    invoke-static {}, Lcom/applovin/impl/sdk/o;->a()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/applovin/impl/o5$d;->b:Lcom/applovin/impl/o5;

    .line 14
    .line 15
    iget-object v1, v0, Lcom/applovin/impl/j5;->c:Lcom/applovin/impl/sdk/o;

    .line 16
    .line 17
    iget-object v0, v0, Lcom/applovin/impl/j5;->b:Ljava/lang/String;

    .line 18
    .line 19
    new-instance v2, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v3, "Video file successfully cached into: "

    .line 22
    .line 23
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v1, v0, v2}, Lcom/applovin/impl/sdk/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    iget-object v0, p0, Lcom/applovin/impl/o5$d;->a:Lcom/applovin/impl/d8;

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Lcom/applovin/impl/d8;->a(Landroid/net/Uri;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    iget-object p1, p0, Lcom/applovin/impl/o5$d;->b:Lcom/applovin/impl/o5;

    .line 43
    .line 44
    iget-object p1, p1, Lcom/applovin/impl/j5;->c:Lcom/applovin/impl/sdk/o;

    .line 45
    .line 46
    invoke-static {}, Lcom/applovin/impl/sdk/o;->a()Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_2

    .line 51
    .line 52
    iget-object p1, p0, Lcom/applovin/impl/o5$d;->b:Lcom/applovin/impl/o5;

    .line 53
    .line 54
    iget-object v0, p1, Lcom/applovin/impl/j5;->c:Lcom/applovin/impl/sdk/o;

    .line 55
    .line 56
    iget-object p1, p1, Lcom/applovin/impl/j5;->b:Ljava/lang/String;

    .line 57
    .line 58
    new-instance v1, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    const-string v2, "Failed to cache video file: "

    .line 61
    .line 62
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    iget-object v2, p0, Lcom/applovin/impl/o5$d;->a:Lcom/applovin/impl/d8;

    .line 66
    .line 67
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {v0, p1, v1}, Lcom/applovin/impl/sdk/o;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    :cond_2
    return-void
.end method
