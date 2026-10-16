.class Lcom/applovin/impl/z0$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/applovin/impl/privacy/cmp/CmpServiceImpl$f;


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
    iput-object p1, p0, Lcom/applovin/impl/z0$g;->d:Lcom/applovin/impl/z0;

    .line 2
    .line 3
    iput-wide p2, p0, Lcom/applovin/impl/z0$g;->a:J

    .line 4
    .line 5
    iput-object p4, p0, Lcom/applovin/impl/z0$g;->b:Lcom/applovin/impl/v0;

    .line 6
    .line 7
    iput-object p5, p0, Lcom/applovin/impl/z0$g;->c:Landroid/app/Activity;

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
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-wide v2, p0, Lcom/applovin/impl/z0$g;->a:J

    .line 6
    .line 7
    sub-long/2addr v0, v2

    .line 8
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "duration_ms"

    .line 13
    .line 14
    invoke-static {v1, v0}, Lcom/applovin/impl/sdk/utils/CollectionUtils;->hashMap(Ljava/lang/String;Ljava/lang/String;)Ljava/util/HashMap;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    iget-object v1, p0, Lcom/applovin/impl/z0$g;->d:Lcom/applovin/impl/z0;

    .line 21
    .line 22
    invoke-static {v1}, Lcom/applovin/impl/z0;->f(Lcom/applovin/impl/z0;)Lcom/applovin/impl/u0$b;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1, p1}, Lcom/applovin/impl/u0$b;->a(Lcom/applovin/sdk/AppLovinCmpError;)V

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lcom/applovin/impl/z0$g;->d:Lcom/applovin/impl/z0;

    .line 30
    .line 31
    invoke-static {v1, p1}, Lcom/applovin/impl/z0;->a(Lcom/applovin/impl/z0;Lcom/applovin/sdk/AppLovinCmpError;)Ljava/util/HashMap;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lcom/applovin/impl/z0$g;->d:Lcom/applovin/impl/z0;

    .line 39
    .line 40
    invoke-static {p1}, Lcom/applovin/impl/z0;->d(Lcom/applovin/impl/z0;)Lcom/applovin/impl/sdk/k;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p1}, Lcom/applovin/impl/sdk/k;->w0()Lcom/applovin/impl/m7;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    sget-object v1, Lcom/applovin/impl/d2;->t:Lcom/applovin/impl/d2;

    .line 49
    .line 50
    invoke-virtual {p1, v1, v0}, Lcom/applovin/impl/e2;->d(Lcom/applovin/impl/d2;Ljava/util/Map;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    iget-object p1, p0, Lcom/applovin/impl/z0$g;->d:Lcom/applovin/impl/z0;

    .line 55
    .line 56
    invoke-static {p1}, Lcom/applovin/impl/z0;->f(Lcom/applovin/impl/z0;)Lcom/applovin/impl/u0$b;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p1}, Lcom/applovin/impl/u0$b;->c()V

    .line 61
    .line 62
    .line 63
    iget-object p1, p0, Lcom/applovin/impl/z0$g;->d:Lcom/applovin/impl/z0;

    .line 64
    .line 65
    invoke-static {p1}, Lcom/applovin/impl/z0;->d(Lcom/applovin/impl/z0;)Lcom/applovin/impl/sdk/k;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {p1}, Lcom/applovin/impl/sdk/k;->w0()Lcom/applovin/impl/m7;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    sget-object v1, Lcom/applovin/impl/d2;->u:Lcom/applovin/impl/d2;

    .line 74
    .line 75
    invoke-virtual {p1, v1, v0}, Lcom/applovin/impl/e2;->d(Lcom/applovin/impl/d2;Ljava/util/Map;)V

    .line 76
    .line 77
    .line 78
    :goto_0
    iget-object p1, p0, Lcom/applovin/impl/z0$g;->d:Lcom/applovin/impl/z0;

    .line 79
    .line 80
    iget-object v0, p0, Lcom/applovin/impl/z0$g;->b:Lcom/applovin/impl/v0;

    .line 81
    .line 82
    iget-object v1, p0, Lcom/applovin/impl/z0$g;->c:Landroid/app/Activity;

    .line 83
    .line 84
    invoke-static {p1, v0, v1}, Lcom/applovin/impl/z0;->a(Lcom/applovin/impl/z0;Lcom/applovin/impl/v0;Landroid/app/Activity;)V

    .line 85
    .line 86
    .line 87
    return-void
.end method
