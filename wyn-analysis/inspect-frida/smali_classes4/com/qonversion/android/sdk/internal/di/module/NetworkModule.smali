.class public final Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/internal/di/module/NetworkModule$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\r\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\'\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00082\u0006\u0010\u0019\u001a\u00020\u0018H\u0007\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\u0008H\u0007\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0007\u00a2\u0006\u0004\u0008\u001f\u0010 \u00a8\u0006\""
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;",
        "",
        "<init>",
        "()V",
        "Lokhttp3/OkHttpClient;",
        "client",
        "Lhb/K;",
        "moshi",
        "Lcom/qonversion/android/sdk/internal/InternalConfig;",
        "internalConfig",
        "Lzg/T;",
        "provideRetrofit",
        "(Lokhttp3/OkHttpClient;Lhb/K;Lcom/qonversion/android/sdk/internal/InternalConfig;)Lzg/T;",
        "provideMoshi",
        "()Lhb/K;",
        "Landroid/app/Application;",
        "context",
        "Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;",
        "interceptor",
        "provideOkHttpClient",
        "(Landroid/app/Application;Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;)Lokhttp3/OkHttpClient;",
        "Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;",
        "apiHeadersProvider",
        "config",
        "Lcom/qonversion/android/sdk/internal/api/ApiHelper;",
        "apiHelper",
        "provideHeadersInterceptor",
        "(Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/api/ApiHelper;)Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;",
        "provideApiHelper",
        "(Lcom/qonversion/android/sdk/internal/InternalConfig;)Lcom/qonversion/android/sdk/internal/api/ApiHelper;",
        "Lcom/qonversion/android/sdk/internal/api/RateLimiter;",
        "provideRateLimiter",
        "()Lcom/qonversion/android/sdk/internal/api/RateLimiter;",
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
.field private static final CACHE_SIZE:J = 0xa00010L

.field public static final Companion:Lcom/qonversion/android/sdk/internal/di/module/NetworkModule$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final MAX_SIMILAR_API_REQUESTS_PER_SECOND:I = 0x5

.field private static final TIMEOUT:J = 0x1eL


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;->Companion:Lcom/qonversion/android/sdk/internal/di/module/NetworkModule$Companion;

    return-void
.end method

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
.method public final provideApiHelper(Lcom/qonversion/android/sdk/internal/InternalConfig;)Lcom/qonversion/android/sdk/internal/api/ApiHelper;
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/internal/InternalConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lcom/qonversion/android/sdk/internal/di/scope/ApplicationScope;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "internalConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/qonversion/android/sdk/internal/api/ApiHelper;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/InternalConfig;->getApiUrl()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-direct {v0, p1}, Lcom/qonversion/android/sdk/internal/api/ApiHelper;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final provideHeadersInterceptor(Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/api/ApiHelper;)Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/internal/InternalConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/qonversion/android/sdk/internal/api/ApiHelper;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lcom/qonversion/android/sdk/internal/di/scope/ApplicationScope;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "apiHeadersProvider"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "config"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "apiHelper"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;

    .line 17
    .line 18
    invoke-direct {v0, p1, p3, p2}, Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;-><init>(Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;Lcom/qonversion/android/sdk/internal/api/ApiHelper;Lcom/qonversion/android/sdk/internal/InternalConfig;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public final provideMoshi()Lhb/K;
    .locals 2
    .annotation runtime Lcom/qonversion/android/sdk/internal/di/scope/ApplicationScope;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-instance v0, LI9/a;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1}, LI9/a;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Lcom/qonversion/android/sdk/internal/dto/QDateAdapter;

    .line 8
    .line 9
    invoke-direct {v1}, Lcom/qonversion/android/sdk/internal/dto/QDateAdapter;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, LI9/a;->a(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    new-instance v1, Lcom/qonversion/android/sdk/internal/dto/QProductsAdapter;

    .line 16
    .line 17
    invoke-direct {v1}, Lcom/qonversion/android/sdk/internal/dto/QProductsAdapter;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, LI9/a;->a(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    new-instance v1, Lcom/qonversion/android/sdk/internal/dto/QPermissionsAdapter;

    .line 24
    .line 25
    invoke-direct {v1}, Lcom/qonversion/android/sdk/internal/dto/QPermissionsAdapter;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, LI9/a;->a(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    new-instance v1, Lcom/qonversion/android/sdk/internal/dto/QProductRenewStateAdapter;

    .line 32
    .line 33
    invoke-direct {v1}, Lcom/qonversion/android/sdk/internal/dto/QProductRenewStateAdapter;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1}, LI9/a;->a(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    new-instance v1, Lcom/qonversion/android/sdk/internal/dto/QEntitlementSourceAdapter;

    .line 40
    .line 41
    invoke-direct {v1}, Lcom/qonversion/android/sdk/internal/dto/QEntitlementSourceAdapter;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1}, LI9/a;->a(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    new-instance v1, Lcom/qonversion/android/sdk/internal/dto/QOfferingsAdapter;

    .line 48
    .line 49
    invoke-direct {v1}, Lcom/qonversion/android/sdk/internal/dto/QOfferingsAdapter;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, LI9/a;->a(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    new-instance v1, Lcom/qonversion/android/sdk/internal/dto/QOfferingAdapter;

    .line 56
    .line 57
    invoke-direct {v1}, Lcom/qonversion/android/sdk/internal/dto/QOfferingAdapter;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v1}, LI9/a;->a(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    new-instance v1, Lcom/qonversion/android/sdk/internal/dto/QOfferingTagAdapter;

    .line 64
    .line 65
    invoke-direct {v1}, Lcom/qonversion/android/sdk/internal/dto/QOfferingTagAdapter;-><init>()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v1}, LI9/a;->a(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    new-instance v1, Lcom/qonversion/android/sdk/internal/dto/QRemoteConfigListAdapter;

    .line 72
    .line 73
    invoke-direct {v1}, Lcom/qonversion/android/sdk/internal/dto/QRemoteConfigListAdapter;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v1}, LI9/a;->a(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    new-instance v1, Lcom/qonversion/android/sdk/internal/dto/QExperimentGroupTypeAdapter;

    .line 80
    .line 81
    invoke-direct {v1}, Lcom/qonversion/android/sdk/internal/dto/QExperimentGroupTypeAdapter;-><init>()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v1}, LI9/a;->a(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    new-instance v1, Lcom/qonversion/android/sdk/internal/dto/QRemoteConfigurationSourceTypeAdapter;

    .line 88
    .line 89
    invoke-direct {v1}, Lcom/qonversion/android/sdk/internal/dto/QRemoteConfigurationSourceTypeAdapter;-><init>()V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v1}, LI9/a;->a(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    new-instance v1, Lcom/qonversion/android/sdk/internal/dto/QRemoteConfigurationSourceAssignmentTypeAdapter;

    .line 96
    .line 97
    invoke-direct {v1}, Lcom/qonversion/android/sdk/internal/dto/QRemoteConfigurationSourceAssignmentTypeAdapter;-><init>()V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v1}, LI9/a;->a(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    new-instance v1, Lcom/qonversion/android/sdk/internal/dto/QEligibilityStatusAdapter;

    .line 104
    .line 105
    invoke-direct {v1}, Lcom/qonversion/android/sdk/internal/dto/QEligibilityStatusAdapter;-><init>()V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0, v1}, LI9/a;->a(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    new-instance v1, Lcom/qonversion/android/sdk/internal/dto/QEligibilityAdapter;

    .line 112
    .line 113
    invoke-direct {v1}, Lcom/qonversion/android/sdk/internal/dto/QEligibilityAdapter;-><init>()V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, v1}, LI9/a;->a(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    new-instance v1, Lcom/qonversion/android/sdk/internal/dto/QTransactionOwnershipTypeAdapter;

    .line 120
    .line 121
    invoke-direct {v1}, Lcom/qonversion/android/sdk/internal/dto/QTransactionOwnershipTypeAdapter;-><init>()V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0, v1}, LI9/a;->a(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    new-instance v1, Lcom/qonversion/android/sdk/internal/dto/QTransactionTypeAdapter;

    .line 128
    .line 129
    invoke-direct {v1}, Lcom/qonversion/android/sdk/internal/dto/QTransactionTypeAdapter;-><init>()V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0, v1}, LI9/a;->a(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    new-instance v1, Lcom/qonversion/android/sdk/internal/dto/QTransactionEnvironmentAdapter;

    .line 136
    .line 137
    invoke-direct {v1}, Lcom/qonversion/android/sdk/internal/dto/QTransactionEnvironmentAdapter;-><init>()V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0, v1}, LI9/a;->a(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    new-instance v1, Lcom/qonversion/android/sdk/internal/dto/QEntitlementGrantTypeAdapter;

    .line 144
    .line 145
    invoke-direct {v1}, Lcom/qonversion/android/sdk/internal/dto/QEntitlementGrantTypeAdapter;-><init>()V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0, v1}, LI9/a;->a(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    new-instance v1, Lhb/K;

    .line 152
    .line 153
    invoke-direct {v1, v0}, Lhb/K;-><init>(LI9/a;)V

    .line 154
    .line 155
    .line 156
    return-object v1
.end method

.method public final provideOkHttpClient(Landroid/app/Application;Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;)Lokhttp3/OkHttpClient;
    .locals 4
    .param p1    # Landroid/app/Application;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lcom/qonversion/android/sdk/internal/di/scope/ApplicationScope;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "interceptor"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lokhttp3/OkHttpClient$Builder;

    .line 12
    .line 13
    invoke-direct {v0}, Lokhttp3/OkHttpClient$Builder;-><init>()V

    .line 14
    .line 15
    .line 16
    new-instance v1, Lokhttp3/Cache;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const-wide/32 v2, 0xa00010

    .line 23
    .line 24
    .line 25
    invoke-direct {v1, p1, v2, v3}, Lokhttp3/Cache;-><init>(Ljava/io/File;J)V

    .line 26
    .line 27
    .line 28
    iput-object v1, v0, Lokhttp3/OkHttpClient$Builder;->k:Lokhttp3/Cache;

    .line 29
    .line 30
    sget-object p1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 31
    .line 32
    const-wide/16 v1, 0x1e

    .line 33
    .line 34
    invoke-virtual {v0, v1, v2, p1}, Lokhttp3/OkHttpClient$Builder;->b(JLjava/util/concurrent/TimeUnit;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1, v2, p1}, Lokhttp3/OkHttpClient$Builder;->a(JLjava/util/concurrent/TimeUnit;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, v0, Lokhttp3/OkHttpClient$Builder;->c:Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    new-instance p1, Lokhttp3/OkHttpClient;

    .line 46
    .line 47
    invoke-direct {p1, v0}, Lokhttp3/OkHttpClient;-><init>(Lokhttp3/OkHttpClient$Builder;)V

    .line 48
    .line 49
    .line 50
    return-object p1
.end method

.method public final provideRateLimiter()Lcom/qonversion/android/sdk/internal/api/RateLimiter;
    .locals 2
    .annotation runtime Lcom/qonversion/android/sdk/internal/di/scope/ApplicationScope;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-instance v0, Lcom/qonversion/android/sdk/internal/api/RateLimiter;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/internal/api/RateLimiter;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public final provideRetrofit(Lokhttp3/OkHttpClient;Lhb/K;Lcom/qonversion/android/sdk/internal/InternalConfig;)Lzg/T;
    .locals 10
    .param p1    # Lokhttp3/OkHttpClient;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lhb/K;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/qonversion/android/sdk/internal/InternalConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lcom/qonversion/android/sdk/internal/di/scope/ApplicationScope;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    const-string v1, "client"

    .line 3
    .line 4
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    const-string v1, "moshi"

    .line 8
    .line 9
    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v1, "internalConfig"

    .line 13
    .line 14
    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sget-object v1, Lzg/L;->c:Lzg/L;

    .line 18
    .line 19
    new-instance v2, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    new-instance v3, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    new-instance v4, LAg/a;

    .line 30
    .line 31
    invoke-direct {v4, p2}, LAg/a;-><init>(Lhb/K;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    invoke-virtual {p3}, Lcom/qonversion/android/sdk/internal/InternalConfig;->getApiUrl()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    const-string p3, "baseUrl == null"

    .line 42
    .line 43
    invoke-static {p2, p3}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    sget-object p3, Lokhttp3/HttpUrl;->k:Lokhttp3/HttpUrl$Companion;

    .line 47
    .line 48
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-static {p2}, Lokhttp3/HttpUrl$Companion;->c(Ljava/lang/String;)Lokhttp3/HttpUrl;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    iget-object p2, v6, Lokhttp3/HttpUrl;->f:Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 58
    .line 59
    .line 60
    move-result p3

    .line 61
    sub-int/2addr p3, v0

    .line 62
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    const-string p3, ""

    .line 67
    .line 68
    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    if-eqz p2, :cond_2

    .line 73
    .line 74
    invoke-virtual {v1}, Lzg/L;->a()Ljava/util/concurrent/Executor;

    .line 75
    .line 76
    .line 77
    move-result-object v9

    .line 78
    new-instance p2, Ljava/util/ArrayList;

    .line 79
    .line 80
    invoke-direct {p2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 81
    .line 82
    .line 83
    new-instance p3, Lzg/m;

    .line 84
    .line 85
    invoke-direct {p3, v9}, Lzg/m;-><init>(Ljava/util/concurrent/Executor;)V

    .line 86
    .line 87
    .line 88
    iget-boolean v1, v1, Lzg/L;->a:Z

    .line 89
    .line 90
    if-eqz v1, :cond_0

    .line 91
    .line 92
    const/4 v3, 0x2

    .line 93
    new-array v3, v3, [Lzg/d;

    .line 94
    .line 95
    sget-object v4, Lzg/h;->a:Lzg/h;

    .line 96
    .line 97
    const/4 v5, 0x0

    .line 98
    aput-object v4, v3, v5

    .line 99
    .line 100
    aput-object p3, v3, v0

    .line 101
    .line 102
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 103
    .line 104
    .line 105
    move-result-object p3

    .line 106
    goto :goto_0

    .line 107
    :cond_0
    invoke-static {p3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object p3

    .line 111
    :goto_0
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 112
    .line 113
    .line 114
    new-instance p3, Ljava/util/ArrayList;

    .line 115
    .line 116
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 117
    .line 118
    .line 119
    move-result v3

    .line 120
    add-int/2addr v3, v0

    .line 121
    add-int/2addr v3, v1

    .line 122
    invoke-direct {p3, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 123
    .line 124
    .line 125
    new-instance v3, Lzg/b;

    .line 126
    .line 127
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 128
    .line 129
    .line 130
    iput-boolean v0, v3, Lzg/b;->a:Z

    .line 131
    .line 132
    invoke-virtual {p3, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    invoke-virtual {p3, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 136
    .line 137
    .line 138
    if-eqz v1, :cond_1

    .line 139
    .line 140
    sget-object v0, Lzg/y;->a:Lzg/y;

    .line 141
    .line 142
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    goto :goto_1

    .line 147
    :cond_1
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 148
    .line 149
    :goto_1
    invoke-virtual {p3, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 150
    .line 151
    .line 152
    new-instance v4, Lzg/T;

    .line 153
    .line 154
    invoke-static {p3}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 155
    .line 156
    .line 157
    move-result-object v7

    .line 158
    invoke-static {p2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 159
    .line 160
    .line 161
    move-result-object v8

    .line 162
    move-object v5, p1

    .line 163
    invoke-direct/range {v4 .. v9}, Lzg/T;-><init>(Lokhttp3/Call$Factory;Lokhttp3/HttpUrl;Ljava/util/List;Ljava/util/List;Ljava/util/concurrent/Executor;)V

    .line 164
    .line 165
    .line 166
    return-object v4

    .line 167
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 168
    .line 169
    new-instance p2, Ljava/lang/StringBuilder;

    .line 170
    .line 171
    const-string p3, "baseUrl must end in /: "

    .line 172
    .line 173
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object p2

    .line 183
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    throw p1
.end method
