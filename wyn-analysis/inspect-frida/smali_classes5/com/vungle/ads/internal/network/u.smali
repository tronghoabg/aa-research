.class public final Lcom/vungle/ads/internal/network/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/Interceptor;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final intercept(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;
    .locals 5

    .line 1
    const-string v0, "chain"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Lokhttp3/Interceptor$Chain;->request()Lokhttp3/Request;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, v0, Lokhttp3/Request;->d:Lokhttp3/RequestBody;

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    iget-object v2, v0, Lokhttp3/Request;->c:Lokhttp3/Headers;

    .line 15
    .line 16
    const-string v3, "Content-Encoding"

    .line 17
    .line 18
    invoke-virtual {v2, v3}, Lokhttp3/Headers;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v0}, Lokhttp3/Request;->b()Lokhttp3/Request$Builder;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const-string v4, "gzip"

    .line 30
    .line 31
    invoke-virtual {v2, v3, v4}, Lokhttp3/Request$Builder;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    new-instance v3, Lcg/g;

    .line 35
    .line 36
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 37
    .line 38
    .line 39
    new-instance v4, Lcg/q;

    .line 40
    .line 41
    invoke-direct {v4, v3}, Lcg/q;-><init>(Lcg/g;)V

    .line 42
    .line 43
    .line 44
    invoke-static {v4}, Lcg/b;->c(Lcg/F;)Lcg/A;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-virtual {v1, v4}, Lokhttp3/RequestBody;->writeTo(Lcg/h;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v4}, Lcg/A;->close()V

    .line 52
    .line 53
    .line 54
    new-instance v4, Lcom/vungle/ads/internal/network/t;

    .line 55
    .line 56
    invoke-direct {v4, v1, v3}, Lcom/vungle/ads/internal/network/t;-><init>(Lokhttp3/RequestBody;Lcg/g;)V

    .line 57
    .line 58
    .line 59
    iget-object v0, v0, Lokhttp3/Request;->b:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v2, v0, v4}, Lokhttp3/Request$Builder;->f(Ljava/lang/String;Lokhttp3/RequestBody;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2}, Lokhttp3/Request$Builder;->b()Lokhttp3/Request;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-interface {p1, v0}, Lokhttp3/Interceptor$Chain;->a(Lokhttp3/Request;)Lokhttp3/Response;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    return-object p1

    .line 73
    :cond_1
    :goto_0
    invoke-interface {p1, v0}, Lokhttp3/Interceptor$Chain;->a(Lokhttp3/Request;)Lokhttp3/Response;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    return-object p1
.end method
