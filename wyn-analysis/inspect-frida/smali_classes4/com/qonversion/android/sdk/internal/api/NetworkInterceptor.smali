.class public final Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/Interceptor;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u001f\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;",
        "Lokhttp3/Interceptor;",
        "headersProvider",
        "Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;",
        "apiHelper",
        "Lcom/qonversion/android/sdk/internal/api/ApiHelper;",
        "config",
        "Lcom/qonversion/android/sdk/internal/InternalConfig;",
        "(Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;Lcom/qonversion/android/sdk/internal/api/ApiHelper;Lcom/qonversion/android/sdk/internal/InternalConfig;)V",
        "intercept",
        "Lokhttp3/Response;",
        "chain",
        "Lokhttp3/Interceptor$Chain;",
        "Companion",
        "sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final FATAL_ERRORS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final apiHelper:Lcom/qonversion/android/sdk/internal/api/ApiHelper;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final config:Lcom/qonversion/android/sdk/internal/InternalConfig;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final headersProvider:Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;->Companion:Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor$Companion;

    .line 8
    .line 9
    const/16 v0, 0x191

    .line 10
    .line 11
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/16 v1, 0x192

    .line 16
    .line 17
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const/16 v2, 0x193

    .line 22
    .line 23
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const/4 v3, 0x3

    .line 28
    new-array v3, v3, [Ljava/lang/Integer;

    .line 29
    .line 30
    const/4 v4, 0x0

    .line 31
    aput-object v0, v3, v4

    .line 32
    .line 33
    const/4 v0, 0x1

    .line 34
    aput-object v1, v3, v0

    .line 35
    .line 36
    const/4 v0, 0x2

    .line 37
    aput-object v2, v3, v0

    .line 38
    .line 39
    invoke-static {v3}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    sput-object v0, Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;->FATAL_ERRORS:Ljava/util/List;

    .line 44
    .line 45
    return-void
.end method

.method public constructor <init>(Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;Lcom/qonversion/android/sdk/internal/api/ApiHelper;Lcom/qonversion/android/sdk/internal/InternalConfig;)V
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/internal/api/ApiHelper;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/qonversion/android/sdk/internal/InternalConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "headersProvider"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "apiHelper"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "config"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;->headersProvider:Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;->apiHelper:Lcom/qonversion/android/sdk/internal/api/ApiHelper;

    .line 22
    .line 23
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;->config:Lcom/qonversion/android/sdk/internal/InternalConfig;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public intercept(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;
    .locals 5
    .param p1    # Lokhttp3/Interceptor$Chain;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "chain"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;->config:Lcom/qonversion/android/sdk/internal/InternalConfig;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/InternalConfig;->getFatalError()Lcom/qonversion/android/sdk/internal/HttpError;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    new-instance v1, Lokhttp3/Response$Builder;

    .line 15
    .line 16
    invoke-direct {v1}, Lokhttp3/Response$Builder;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/HttpError;->getCode()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    iput v2, v1, Lokhttp3/Response$Builder;->c:I

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    const-string v3, ""

    .line 27
    .line 28
    invoke-static {v2, v3}, Lokhttp3/ResponseBody;->create(Lokhttp3/MediaType;Ljava/lang/String;)Lokhttp3/ResponseBody;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    iput-object v2, v1, Lokhttp3/Response$Builder;->g:Lokhttp3/ResponseBody;

    .line 33
    .line 34
    sget-object v2, Lokhttp3/Protocol;->f:Lokhttp3/Protocol;

    .line 35
    .line 36
    iput-object v2, v1, Lokhttp3/Response$Builder;->b:Lokhttp3/Protocol;

    .line 37
    .line 38
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/HttpError;->getMessage()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const-string v2, "message"

    .line 43
    .line 44
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    iput-object v0, v1, Lokhttp3/Response$Builder;->d:Ljava/lang/String;

    .line 48
    .line 49
    invoke-interface {p1}, Lokhttp3/Interceptor$Chain;->request()Lokhttp3/Request;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    const-string v0, "request"

    .line 54
    .line 55
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    iput-object p1, v1, Lokhttp3/Response$Builder;->a:Lokhttp3/Request;

    .line 59
    .line 60
    invoke-virtual {v1}, Lokhttp3/Response$Builder;->a()Lokhttp3/Response;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    return-object p1

    .line 65
    :cond_0
    invoke-interface {p1}, Lokhttp3/Interceptor$Chain;->request()Lokhttp3/Request;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {v0}, Lokhttp3/Request;->b()Lokhttp3/Request$Builder;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;->headersProvider:Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;

    .line 74
    .line 75
    iget-object v0, v0, Lokhttp3/Request;->c:Lokhttp3/Headers;

    .line 76
    .line 77
    invoke-virtual {v2, v0}, Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;->getHeaders(Lokhttp3/Headers;)Lokhttp3/Headers;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {v1, v0}, Lokhttp3/Request$Builder;->e(Lokhttp3/Headers;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1}, Lokhttp3/Request$Builder;->b()Lokhttp3/Request;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-interface {p1, v0}, Lokhttp3/Interceptor$Chain;->a(Lokhttp3/Request;)Lokhttp3/Response;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    sget-object v1, Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;->FATAL_ERRORS:Ljava/util/List;

    .line 93
    .line 94
    iget v2, p1, Lokhttp3/Response;->d:I

    .line 95
    .line 96
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-interface {v1, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-eqz v1, :cond_1

    .line 105
    .line 106
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;->apiHelper:Lcom/qonversion/android/sdk/internal/api/ApiHelper;

    .line 107
    .line 108
    invoke-virtual {v1, v0}, Lcom/qonversion/android/sdk/internal/api/ApiHelper;->isDeprecatedEndpoint(Lokhttp3/Request;)Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-eqz v0, :cond_1

    .line 113
    .line 114
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;->config:Lcom/qonversion/android/sdk/internal/InternalConfig;

    .line 115
    .line 116
    new-instance v1, Lcom/qonversion/android/sdk/internal/HttpError;

    .line 117
    .line 118
    iget-object v3, p1, Lokhttp3/Response;->c:Ljava/lang/String;

    .line 119
    .line 120
    const-string v4, "message(...)"

    .line 121
    .line 122
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    invoke-direct {v1, v2, v3}, Lcom/qonversion/android/sdk/internal/HttpError;-><init>(ILjava/lang/String;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/internal/InternalConfig;->setFatalError(Lcom/qonversion/android/sdk/internal/HttpError;)V

    .line 129
    .line 130
    .line 131
    :cond_1
    return-object p1
.end method
