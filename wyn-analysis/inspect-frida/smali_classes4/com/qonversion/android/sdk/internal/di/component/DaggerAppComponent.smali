.class public final Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/qonversion/android/sdk/internal/di/component/AppComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;
    }
.end annotation


# instance fields
.field private activityProvider:Ldf/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/a;"
        }
    .end annotation
.end field

.field private provideApiErrorMapperProvider:Ldf/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/a;"
        }
    .end annotation
.end field

.field private provideApiHelperProvider:Ldf/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/a;"
        }
    .end annotation
.end field

.field private provideAppStateProvider:Ldf/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/a;"
        }
    .end annotation
.end field

.field private provideApplicationProvider:Ldf/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/a;"
        }
    .end annotation
.end field

.field private provideAutomationsEventMapperProvider:Ldf/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/a;"
        }
    .end annotation
.end field

.field private provideAutomationsManagerProvider:Ldf/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/a;"
        }
    .end annotation
.end field

.field private provideConfigProvider:Ldf/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/a;"
        }
    .end annotation
.end field

.field private provideEnvironmentProvider:Ldf/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/a;"
        }
    .end annotation
.end field

.field private provideFallbackServiceProvider:Ldf/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/a;"
        }
    .end annotation
.end field

.field private provideHeadersInterceptorProvider:Ldf/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/a;"
        }
    .end annotation
.end field

.field private provideHeadersProvider:Ldf/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/a;"
        }
    .end annotation
.end field

.field private provideIdentityManagerProvider:Ldf/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/a;"
        }
    .end annotation
.end field

.field private provideIncrementalDelayCalculatorProvider:Ldf/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/a;"
        }
    .end annotation
.end field

.field private provideLaunchResultCacheWrapperProvider:Ldf/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/a;"
        }
    .end annotation
.end field

.field private provideLoggerProvider:Ldf/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/a;"
        }
    .end annotation
.end field

.field private provideMoshiProvider:Ldf/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/a;"
        }
    .end annotation
.end field

.field private provideOkHttpClientProvider:Ldf/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/a;"
        }
    .end annotation
.end field

.field private providePropertiesStorageProvider:Ldf/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/a;"
        }
    .end annotation
.end field

.field private providePurchasesCacheProvider:Ldf/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/a;"
        }
    .end annotation
.end field

.field private provideQonversionRepositoryProvider:Ldf/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/a;"
        }
    .end annotation
.end field

.field private provideRateLimiterProvider:Ldf/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/a;"
        }
    .end annotation
.end field

.field private provideRepositoryProvider:Ldf/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/a;"
        }
    .end annotation
.end field

.field private provideRetrofitProvider:Ldf/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/a;"
        }
    .end annotation
.end field

.field private provideSharedPreferencesCacheProvider:Ldf/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/a;"
        }
    .end annotation
.end field

.field private provideSharedPreferencesProvider:Ldf/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/a;"
        }
    .end annotation
.end field

.field private provideTokenStorageProvider:Ldf/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/a;"
        }
    .end annotation
.end field

.field private provideUserInfoServiceProvider:Ldf/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/a;"
        }
    .end annotation
.end field

.field private provideUserPropertiesManagerProvider:Ldf/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/a;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/qonversion/android/sdk/internal/di/module/AppModule;Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;Lcom/qonversion/android/sdk/internal/di/module/ServicesModule;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-direct/range {p0 .. p5}, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->initialize(Lcom/qonversion/android/sdk/internal/di/module/AppModule;Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;Lcom/qonversion/android/sdk/internal/di/module/ServicesModule;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/qonversion/android/sdk/internal/di/module/AppModule;Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;Lcom/qonversion/android/sdk/internal/di/module/ServicesModule;I)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;-><init>(Lcom/qonversion/android/sdk/internal/di/module/AppModule;Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;Lcom/qonversion/android/sdk/internal/di/module/ServicesModule;)V

    return-void
.end method

.method public static builder()Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;
    .locals 2

    .line 1
    new-instance v0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method private getQRemoteConfigService()Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;
    .locals 2

    .line 1
    new-instance v0, Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideRepositoryProvider:Ldf/a;

    .line 4
    .line 5
    invoke-interface {v1}, Ldf/a;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Lcom/qonversion/android/sdk/internal/repository/QRepository;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;-><init>(Lcom/qonversion/android/sdk/internal/repository/QRepository;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method private initialize(Lcom/qonversion/android/sdk/internal/di/module/AppModule;Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;Lcom/qonversion/android/sdk/internal/di/module/ServicesModule;)V
    .locals 8

    .line 1
    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvideApplicationFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/AppModule;)Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvideApplicationFactory;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, LTb/a;->a(Ldf/a;)Ldf/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideApplicationProvider:Ldf/a;

    .line 10
    .line 11
    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvideConfigFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/AppModule;)Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvideConfigFactory;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, LTb/a;->a(Ldf/a;)Ldf/a;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideConfigProvider:Ldf/a;

    .line 20
    .line 21
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideApplicationProvider:Ldf/a;

    .line 22
    .line 23
    invoke-static {p1, v0}, Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvideSharedPreferencesFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/AppModule;Ldf/a;)Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvideSharedPreferencesFactory;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0}, LTb/a;->a(Ldf/a;)Ldf/a;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideSharedPreferencesProvider:Ldf/a;

    .line 32
    .line 33
    invoke-static {p1, v0}, Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvideSharedPreferencesCacheFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/AppModule;Ldf/a;)Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvideSharedPreferencesCacheFactory;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {v0}, LTb/a;->a(Ldf/a;)Ldf/a;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideSharedPreferencesCacheProvider:Ldf/a;

    .line 42
    .line 43
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideApplicationProvider:Ldf/a;

    .line 44
    .line 45
    invoke-static {p2, v0}, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideEnvironmentFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;Ldf/a;)Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideEnvironmentFactory;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-static {v0}, LTb/a;->a(Ldf/a;)Ldf/a;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideEnvironmentProvider:Ldf/a;

    .line 54
    .line 55
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideConfigProvider:Ldf/a;

    .line 56
    .line 57
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideSharedPreferencesCacheProvider:Ldf/a;

    .line 58
    .line 59
    invoke-static {p2, v1, v2, v0}, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideHeadersProviderFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;Ldf/a;Ldf/a;Ldf/a;)Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideHeadersProviderFactory;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-static {v0}, LTb/a;->a(Ldf/a;)Ldf/a;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideHeadersProvider:Ldf/a;

    .line 68
    .line 69
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideConfigProvider:Ldf/a;

    .line 70
    .line 71
    invoke-static {p3, v0}, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideApiHelperFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;Ldf/a;)Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideApiHelperFactory;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-static {v0}, LTb/a;->a(Ldf/a;)Ldf/a;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideApiHelperProvider:Ldf/a;

    .line 80
    .line 81
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideHeadersProvider:Ldf/a;

    .line 82
    .line 83
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideConfigProvider:Ldf/a;

    .line 84
    .line 85
    invoke-static {p3, v1, v2, v0}, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideHeadersInterceptorFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;Ldf/a;Ldf/a;Ldf/a;)Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideHeadersInterceptorFactory;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-static {v0}, LTb/a;->a(Ldf/a;)Ldf/a;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideHeadersInterceptorProvider:Ldf/a;

    .line 94
    .line 95
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideApplicationProvider:Ldf/a;

    .line 96
    .line 97
    invoke-static {p3, v1, v0}, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideOkHttpClientFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;Ldf/a;Ldf/a;)Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideOkHttpClientFactory;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-static {v0}, LTb/a;->a(Ldf/a;)Ldf/a;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideOkHttpClientProvider:Ldf/a;

    .line 106
    .line 107
    invoke-static {p3}, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideMoshiFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;)Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideMoshiFactory;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-static {v0}, LTb/a;->a(Ldf/a;)Ldf/a;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideMoshiProvider:Ldf/a;

    .line 116
    .line 117
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideOkHttpClientProvider:Ldf/a;

    .line 118
    .line 119
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideConfigProvider:Ldf/a;

    .line 120
    .line 121
    invoke-static {p3, v1, v0, v2}, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideRetrofitFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;Ldf/a;Ldf/a;Ldf/a;)Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideRetrofitFactory;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-static {v0}, LTb/a;->a(Ldf/a;)Ldf/a;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideRetrofitProvider:Ldf/a;

    .line 130
    .line 131
    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvideLoggerFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/AppModule;)Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvideLoggerFactory;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-static {v0}, LTb/a;->a(Ldf/a;)Ldf/a;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideLoggerProvider:Ldf/a;

    .line 140
    .line 141
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideApiHelperProvider:Ldf/a;

    .line 142
    .line 143
    invoke-static {p2, v0}, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideApiErrorMapperFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;Ldf/a;)Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideApiErrorMapperFactory;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-static {v0}, LTb/a;->a(Ldf/a;)Ldf/a;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideApiErrorMapperProvider:Ldf/a;

    .line 152
    .line 153
    invoke-static {p4}, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideIncrementalDelayCalculatorFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;)Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideIncrementalDelayCalculatorFactory;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-static {v0}, LTb/a;->a(Ldf/a;)Ldf/a;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideIncrementalDelayCalculatorProvider:Ldf/a;

    .line 162
    .line 163
    invoke-static {p3}, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideRateLimiterFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;)Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideRateLimiterFactory;

    .line 164
    .line 165
    .line 166
    move-result-object p3

    .line 167
    invoke-static {p3}, LTb/a;->a(Ldf/a;)Ldf/a;

    .line 168
    .line 169
    .line 170
    move-result-object v7

    .line 171
    iput-object v7, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideRateLimiterProvider:Ldf/a;

    .line 172
    .line 173
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideRetrofitProvider:Ldf/a;

    .line 174
    .line 175
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideEnvironmentProvider:Ldf/a;

    .line 176
    .line 177
    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideConfigProvider:Ldf/a;

    .line 178
    .line 179
    iget-object v4, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideLoggerProvider:Ldf/a;

    .line 180
    .line 181
    iget-object v5, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideApiErrorMapperProvider:Ldf/a;

    .line 182
    .line 183
    iget-object v6, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideIncrementalDelayCalculatorProvider:Ldf/a;

    .line 184
    .line 185
    move-object v0, p2

    .line 186
    invoke-static/range {v0 .. v7}, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideRepositoryFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;Ldf/a;Ldf/a;Ldf/a;Ldf/a;Ldf/a;Ldf/a;Ldf/a;)Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideRepositoryFactory;

    .line 187
    .line 188
    .line 189
    move-result-object p2

    .line 190
    invoke-static {p2}, LTb/a;->a(Ldf/a;)Ldf/a;

    .line 191
    .line 192
    .line 193
    move-result-object p2

    .line 194
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideRepositoryProvider:Ldf/a;

    .line 195
    .line 196
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideRetrofitProvider:Ldf/a;

    .line 197
    .line 198
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideEnvironmentProvider:Ldf/a;

    .line 199
    .line 200
    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideConfigProvider:Ldf/a;

    .line 201
    .line 202
    iget-object v4, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideLoggerProvider:Ldf/a;

    .line 203
    .line 204
    iget-object v5, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideApiErrorMapperProvider:Ldf/a;

    .line 205
    .line 206
    iget-object v6, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideIncrementalDelayCalculatorProvider:Ldf/a;

    .line 207
    .line 208
    invoke-static/range {v0 .. v6}, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideQonversionRepositoryFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;Ldf/a;Ldf/a;Ldf/a;Ldf/a;Ldf/a;Ldf/a;)Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideQonversionRepositoryFactory;

    .line 209
    .line 210
    .line 211
    move-result-object p2

    .line 212
    invoke-static {p2}, LTb/a;->a(Ldf/a;)Ldf/a;

    .line 213
    .line 214
    .line 215
    move-result-object p2

    .line 216
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideQonversionRepositoryProvider:Ldf/a;

    .line 217
    .line 218
    iget-object p2, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideSharedPreferencesCacheProvider:Ldf/a;

    .line 219
    .line 220
    invoke-static {p1, p2}, Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvidePurchasesCacheFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/AppModule;Ldf/a;)Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvidePurchasesCacheFactory;

    .line 221
    .line 222
    .line 223
    move-result-object p2

    .line 224
    invoke-static {p2}, LTb/a;->a(Ldf/a;)Ldf/a;

    .line 225
    .line 226
    .line 227
    move-result-object p2

    .line 228
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->providePurchasesCacheProvider:Ldf/a;

    .line 229
    .line 230
    iget-object p2, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideApplicationProvider:Ldf/a;

    .line 231
    .line 232
    iget-object p3, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideMoshiProvider:Ldf/a;

    .line 233
    .line 234
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideLoggerProvider:Ldf/a;

    .line 235
    .line 236
    invoke-static {p1, p2, p3, v1}, Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvideFallbackServiceFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/AppModule;Ldf/a;Ldf/a;Ldf/a;)Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvideFallbackServiceFactory;

    .line 237
    .line 238
    .line 239
    move-result-object p2

    .line 240
    invoke-static {p2}, LTb/a;->a(Ldf/a;)Ldf/a;

    .line 241
    .line 242
    .line 243
    move-result-object p2

    .line 244
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideFallbackServiceProvider:Ldf/a;

    .line 245
    .line 246
    iget-object p3, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideMoshiProvider:Ldf/a;

    .line 247
    .line 248
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideSharedPreferencesCacheProvider:Ldf/a;

    .line 249
    .line 250
    invoke-static {p1, p3, v1, p2}, Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvideLaunchResultCacheWrapperFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/AppModule;Ldf/a;Ldf/a;Ldf/a;)Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvideLaunchResultCacheWrapperFactory;

    .line 251
    .line 252
    .line 253
    move-result-object p2

    .line 254
    invoke-static {p2}, LTb/a;->a(Ldf/a;)Ldf/a;

    .line 255
    .line 256
    .line 257
    move-result-object p2

    .line 258
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideLaunchResultCacheWrapperProvider:Ldf/a;

    .line 259
    .line 260
    iget-object p2, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideLoggerProvider:Ldf/a;

    .line 261
    .line 262
    invoke-static {p4, p2}, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideAutomationsEventMapperFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;Ldf/a;)Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideAutomationsEventMapperFactory;

    .line 263
    .line 264
    .line 265
    move-result-object p2

    .line 266
    invoke-static {p2}, LTb/a;->a(Ldf/a;)Ldf/a;

    .line 267
    .line 268
    .line 269
    move-result-object p2

    .line 270
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideAutomationsEventMapperProvider:Ldf/a;

    .line 271
    .line 272
    iget-object p2, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideApplicationProvider:Ldf/a;

    .line 273
    .line 274
    invoke-static {p2}, Lcom/qonversion/android/sdk/automations/internal/ActivityProvider_Factory;->create(Ldf/a;)Lcom/qonversion/android/sdk/automations/internal/ActivityProvider_Factory;

    .line 275
    .line 276
    .line 277
    move-result-object p2

    .line 278
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->activityProvider:Ldf/a;

    .line 279
    .line 280
    iget-object p3, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideRepositoryProvider:Ldf/a;

    .line 281
    .line 282
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideAutomationsEventMapperProvider:Ldf/a;

    .line 283
    .line 284
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideApplicationProvider:Ldf/a;

    .line 285
    .line 286
    invoke-static {p4, p3, v1, v2, p2}, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideAutomationsManagerFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;Ldf/a;Ldf/a;Ldf/a;Ldf/a;)Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideAutomationsManagerFactory;

    .line 287
    .line 288
    .line 289
    move-result-object p2

    .line 290
    invoke-static {p2}, LTb/a;->a(Ldf/a;)Ldf/a;

    .line 291
    .line 292
    .line 293
    move-result-object p2

    .line 294
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideAutomationsManagerProvider:Ldf/a;

    .line 295
    .line 296
    iget-object p2, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideSharedPreferencesProvider:Ldf/a;

    .line 297
    .line 298
    invoke-static {v0, p2}, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideTokenStorageFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;Ldf/a;)Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideTokenStorageFactory;

    .line 299
    .line 300
    .line 301
    move-result-object p2

    .line 302
    invoke-static {p2}, LTb/a;->a(Ldf/a;)Ldf/a;

    .line 303
    .line 304
    .line 305
    move-result-object p2

    .line 306
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideTokenStorageProvider:Ldf/a;

    .line 307
    .line 308
    iget-object p3, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideSharedPreferencesCacheProvider:Ldf/a;

    .line 309
    .line 310
    invoke-static {p5, p3, p2}, Lcom/qonversion/android/sdk/internal/di/module/ServicesModule_ProvideUserInfoServiceFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/ServicesModule;Ldf/a;Ldf/a;)Lcom/qonversion/android/sdk/internal/di/module/ServicesModule_ProvideUserInfoServiceFactory;

    .line 311
    .line 312
    .line 313
    move-result-object p2

    .line 314
    invoke-static {p2}, LTb/a;->a(Ldf/a;)Ldf/a;

    .line 315
    .line 316
    .line 317
    move-result-object p2

    .line 318
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideUserInfoServiceProvider:Ldf/a;

    .line 319
    .line 320
    iget-object p3, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideRepositoryProvider:Ldf/a;

    .line 321
    .line 322
    invoke-static {p4, p3, p2}, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideIdentityManagerFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;Ldf/a;Ldf/a;)Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideIdentityManagerFactory;

    .line 323
    .line 324
    .line 325
    move-result-object p2

    .line 326
    invoke-static {p2}, LTb/a;->a(Ldf/a;)Ldf/a;

    .line 327
    .line 328
    .line 329
    move-result-object p2

    .line 330
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideIdentityManagerProvider:Ldf/a;

    .line 331
    .line 332
    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvidePropertiesStorageFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;)Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvidePropertiesStorageFactory;

    .line 333
    .line 334
    .line 335
    move-result-object p2

    .line 336
    invoke-static {p2}, LTb/a;->a(Ldf/a;)Ldf/a;

    .line 337
    .line 338
    .line 339
    move-result-object p2

    .line 340
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->providePropertiesStorageProvider:Ldf/a;

    .line 341
    .line 342
    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvideAppStateProviderFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/AppModule;)Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvideAppStateProviderFactory;

    .line 343
    .line 344
    .line 345
    move-result-object p1

    .line 346
    invoke-static {p1}, LTb/a;->a(Ldf/a;)Ldf/a;

    .line 347
    .line 348
    .line 349
    move-result-object v5

    .line 350
    iput-object v5, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideAppStateProvider:Ldf/a;

    .line 351
    .line 352
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideApplicationProvider:Ldf/a;

    .line 353
    .line 354
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideRepositoryProvider:Ldf/a;

    .line 355
    .line 356
    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->providePropertiesStorageProvider:Ldf/a;

    .line 357
    .line 358
    iget-object v4, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideIncrementalDelayCalculatorProvider:Ldf/a;

    .line 359
    .line 360
    iget-object v6, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideLoggerProvider:Ldf/a;

    .line 361
    .line 362
    move-object v0, p4

    .line 363
    invoke-static/range {v0 .. v6}, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideUserPropertiesManagerFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;Ldf/a;Ldf/a;Ldf/a;Ldf/a;Ldf/a;Ldf/a;)Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideUserPropertiesManagerFactory;

    .line 364
    .line 365
    .line 366
    move-result-object p1

    .line 367
    invoke-static {p1}, LTb/a;->a(Ldf/a;)Ldf/a;

    .line 368
    .line 369
    .line 370
    move-result-object p1

    .line 371
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideUserPropertiesManagerProvider:Ldf/a;

    .line 372
    .line 373
    return-void
.end method


# virtual methods
.method public appStateProvider()Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideAppStateProvider:Ldf/a;

    .line 2
    .line 3
    invoke-interface {v0}, Ldf/a;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;

    .line 8
    .line 9
    return-object v0
.end method

.method public automationsManager()Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideAutomationsManagerProvider:Ldf/a;

    .line 2
    .line 3
    invoke-interface {v0}, Ldf/a;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    .line 8
    .line 9
    return-object v0
.end method

.method public exceptionManager()Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;
    .locals 5

    .line 1
    new-instance v0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideRepositoryProvider:Ldf/a;

    .line 4
    .line 5
    invoke-interface {v1}, Ldf/a;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Lcom/qonversion/android/sdk/internal/repository/QRepository;

    .line 10
    .line 11
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideConfigProvider:Ldf/a;

    .line 12
    .line 13
    invoke-interface {v2}, Ldf/a;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Lcom/qonversion/android/sdk/internal/InternalConfig;

    .line 18
    .line 19
    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideHeadersProvider:Ldf/a;

    .line 20
    .line 21
    invoke-interface {v3}, Ldf/a;->get()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    check-cast v3, Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;

    .line 26
    .line 27
    iget-object v4, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideMoshiProvider:Ldf/a;

    .line 28
    .line 29
    invoke-interface {v4}, Ldf/a;->get()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    check-cast v4, Lhb/K;

    .line 34
    .line 35
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;-><init>(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;Lhb/K;)V

    .line 36
    .line 37
    .line 38
    return-object v0
.end method

.method public fallbacksService()Lcom/qonversion/android/sdk/internal/services/QFallbacksService;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideFallbackServiceProvider:Ldf/a;

    .line 2
    .line 3
    invoke-interface {v0}, Ldf/a;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/qonversion/android/sdk/internal/services/QFallbacksService;

    .line 8
    .line 9
    return-object v0
.end method

.method public handledPurchasesCache()Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;
    .locals 1

    .line 1
    new-instance v0, Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public identityManager()Lcom/qonversion/android/sdk/internal/QIdentityManager;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideIdentityManagerProvider:Ldf/a;

    .line 2
    .line 3
    invoke-interface {v0}, Ldf/a;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/qonversion/android/sdk/internal/QIdentityManager;

    .line 8
    .line 9
    return-object v0
.end method

.method public internalConfig()Lcom/qonversion/android/sdk/internal/InternalConfig;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideConfigProvider:Ldf/a;

    .line 2
    .line 3
    invoke-interface {v0}, Ldf/a;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/qonversion/android/sdk/internal/InternalConfig;

    .line 8
    .line 9
    return-object v0
.end method

.method public launchResultCacheWrapper()Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideLaunchResultCacheWrapperProvider:Ldf/a;

    .line 2
    .line 3
    invoke-interface {v0}, Ldf/a;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;

    .line 8
    .line 9
    return-object v0
.end method

.method public purchasesCache()Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->providePurchasesCacheProvider:Ldf/a;

    .line 2
    .line 3
    invoke-interface {v0}, Ldf/a;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;

    .line 8
    .line 9
    return-object v0
.end method

.method public qonversionRepository()Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideQonversionRepositoryProvider:Ldf/a;

    .line 2
    .line 3
    invoke-interface {v0}, Ldf/a;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;

    .line 8
    .line 9
    return-object v0
.end method

.method public remoteConfigManager()Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;
    .locals 3

    .line 1
    new-instance v0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->getQRemoteConfigService()Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideFallbackServiceProvider:Ldf/a;

    .line 8
    .line 9
    invoke-interface {v2}, Ldf/a;->get()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, Lcom/qonversion/android/sdk/internal/services/QFallbacksService;

    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;-><init>(Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;Lcom/qonversion/android/sdk/internal/services/QFallbacksService;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public repository()Lcom/qonversion/android/sdk/internal/repository/QRepository;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideRepositoryProvider:Ldf/a;

    .line 2
    .line 3
    invoke-interface {v0}, Ldf/a;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/qonversion/android/sdk/internal/repository/QRepository;

    .line 8
    .line 9
    return-object v0
.end method

.method public sharedPreferencesCache()Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideSharedPreferencesCacheProvider:Ldf/a;

    .line 2
    .line 3
    invoke-interface {v0}, Ldf/a;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;

    .line 8
    .line 9
    return-object v0
.end method

.method public userInfoService()Lcom/qonversion/android/sdk/internal/services/QUserInfoService;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideUserInfoServiceProvider:Ldf/a;

    .line 2
    .line 3
    invoke-interface {v0}, Ldf/a;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;

    .line 8
    .line 9
    return-object v0
.end method

.method public userPropertiesManager()Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->provideUserPropertiesManagerProvider:Ldf/a;

    .line 2
    .line 3
    invoke-interface {v0}, Ldf/a;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    .line 8
    .line 9
    return-object v0
.end method
