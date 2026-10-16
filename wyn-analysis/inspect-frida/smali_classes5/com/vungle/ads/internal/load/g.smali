.class public abstract Lcom/vungle/ads/internal/load/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/vungle/ads/internal/network/VungleApiClient;

.field public final c:Lcom/vungle/ads/internal/executor/a;

.field public final d:Lcom/vungle/ads/internal/omsdk/c;

.field public final e:Lcom/vungle/ads/internal/downloader/m;

.field public final f:Lcom/vungle/ads/internal/util/PathProvider;

.field public final g:Lcom/vungle/ads/internal/load/b;

.field public final h:Ljava/util/concurrent/atomic/AtomicLong;

.field public final i:Ljava/util/LinkedHashSet;

.field public j:Lcom/vungle/ads/internal/load/a;

.field public k:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public l:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final m:Ljava/util/ArrayList;

.field public n:Lcom/vungle/ads/internal/model/h0;

.field public o:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public p:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final q:Lcom/vungle/ads/internal/n2;

.field public r:Lcom/vungle/ads/internal/m2;

.field public s:Lcom/vungle/ads/internal/m2;

.field public t:Lcom/vungle/ads/internal/n2;

.field public u:Lcom/vungle/ads/internal/n2;

.field public v:Lcom/vungle/ads/internal/n2;

.field public w:Lcom/vungle/ads/internal/n2;

.field public x:Lcom/vungle/ads/internal/util/s;

.field public y:J


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/vungle/ads/internal/network/VungleApiClient;Lcom/vungle/ads/internal/executor/d;Lcom/vungle/ads/internal/omsdk/c;Lcom/vungle/ads/internal/downloader/m;Lcom/vungle/ads/internal/util/PathProvider;Lcom/vungle/ads/internal/load/b;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "vungleApiClient"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "sdkExecutors"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "omInjector"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "downloader"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "pathProvider"

    .line 27
    .line 28
    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string v0, "adRequest"

    .line 32
    .line 33
    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, Lcom/vungle/ads/internal/load/g;->a:Landroid/content/Context;

    .line 40
    .line 41
    iput-object p2, p0, Lcom/vungle/ads/internal/load/g;->b:Lcom/vungle/ads/internal/network/VungleApiClient;

    .line 42
    .line 43
    iput-object p3, p0, Lcom/vungle/ads/internal/load/g;->c:Lcom/vungle/ads/internal/executor/a;

    .line 44
    .line 45
    iput-object p4, p0, Lcom/vungle/ads/internal/load/g;->d:Lcom/vungle/ads/internal/omsdk/c;

    .line 46
    .line 47
    iput-object p5, p0, Lcom/vungle/ads/internal/load/g;->e:Lcom/vungle/ads/internal/downloader/m;

    .line 48
    .line 49
    iput-object p6, p0, Lcom/vungle/ads/internal/load/g;->f:Lcom/vungle/ads/internal/util/PathProvider;

    .line 50
    .line 51
    iput-object p7, p0, Lcom/vungle/ads/internal/load/g;->g:Lcom/vungle/ads/internal/load/b;

    .line 52
    .line 53
    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    .line 54
    .line 55
    const-wide/16 p2, 0x0

    .line 56
    .line 57
    invoke-direct {p1, p2, p3}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 58
    .line 59
    .line 60
    iput-object p1, p0, Lcom/vungle/ads/internal/load/g;->h:Ljava/util/concurrent/atomic/AtomicLong;

    .line 61
    .line 62
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 63
    .line 64
    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 65
    .line 66
    .line 67
    iput-object p1, p0, Lcom/vungle/ads/internal/load/g;->i:Ljava/util/LinkedHashSet;

    .line 68
    .line 69
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 70
    .line 71
    const/4 p2, 0x0

    .line 72
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 73
    .line 74
    .line 75
    iput-object p1, p0, Lcom/vungle/ads/internal/load/g;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 76
    .line 77
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 78
    .line 79
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 80
    .line 81
    .line 82
    iput-object p1, p0, Lcom/vungle/ads/internal/load/g;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 83
    .line 84
    new-instance p1, Ljava/util/ArrayList;

    .line 85
    .line 86
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 87
    .line 88
    .line 89
    iput-object p1, p0, Lcom/vungle/ads/internal/load/g;->m:Ljava/util/ArrayList;

    .line 90
    .line 91
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 92
    .line 93
    const/4 p2, 0x1

    .line 94
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 95
    .line 96
    .line 97
    iput-object p1, p0, Lcom/vungle/ads/internal/load/g;->o:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 98
    .line 99
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 100
    .line 101
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 102
    .line 103
    .line 104
    iput-object p1, p0, Lcom/vungle/ads/internal/load/g;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 105
    .line 106
    new-instance p1, Lcom/vungle/ads/internal/n2;

    .line 107
    .line 108
    sget-object p2, Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;->AD_REQUEST_TO_RESPONSE_DURATION_MS:Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;

    .line 109
    .line 110
    invoke-direct {p1, p2}, Lcom/vungle/ads/internal/n2;-><init>(Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;)V

    .line 111
    .line 112
    .line 113
    iput-object p1, p0, Lcom/vungle/ads/internal/load/g;->q:Lcom/vungle/ads/internal/n2;

    .line 114
    .line 115
    new-instance p1, Lcom/vungle/ads/internal/m2;

    .line 116
    .line 117
    sget-object p2, Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;->ASSET_FILE_SIZE:Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;

    .line 118
    .line 119
    invoke-direct {p1, p2}, Lcom/vungle/ads/internal/m2;-><init>(Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;)V

    .line 120
    .line 121
    .line 122
    iput-object p1, p0, Lcom/vungle/ads/internal/load/g;->r:Lcom/vungle/ads/internal/m2;

    .line 123
    .line 124
    new-instance p1, Lcom/vungle/ads/internal/m2;

    .line 125
    .line 126
    sget-object p2, Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;->TEMPLATE_HTML_SIZE:Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;

    .line 127
    .line 128
    invoke-direct {p1, p2}, Lcom/vungle/ads/internal/m2;-><init>(Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;)V

    .line 129
    .line 130
    .line 131
    iput-object p1, p0, Lcom/vungle/ads/internal/load/g;->s:Lcom/vungle/ads/internal/m2;

    .line 132
    .line 133
    new-instance p1, Lcom/vungle/ads/internal/n2;

    .line 134
    .line 135
    sget-object p2, Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;->ASSET_DOWNLOAD_DURATION_MS:Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;

    .line 136
    .line 137
    invoke-direct {p1, p2}, Lcom/vungle/ads/internal/n2;-><init>(Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;)V

    .line 138
    .line 139
    .line 140
    iput-object p1, p0, Lcom/vungle/ads/internal/load/g;->t:Lcom/vungle/ads/internal/n2;

    .line 141
    .line 142
    new-instance p1, Lcom/vungle/ads/internal/n2;

    .line 143
    .line 144
    sget-object p2, Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;->AD_REQUIRED_DOWNLOAD_DURATION_MS:Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;

    .line 145
    .line 146
    invoke-direct {p1, p2}, Lcom/vungle/ads/internal/n2;-><init>(Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;)V

    .line 147
    .line 148
    .line 149
    iput-object p1, p0, Lcom/vungle/ads/internal/load/g;->u:Lcom/vungle/ads/internal/n2;

    .line 150
    .line 151
    new-instance p1, Lcom/vungle/ads/internal/n2;

    .line 152
    .line 153
    sget-object p2, Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;->AD_OPTIONAL_DOWNLOAD_DURATION_MS:Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;

    .line 154
    .line 155
    invoke-direct {p1, p2}, Lcom/vungle/ads/internal/n2;-><init>(Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;)V

    .line 156
    .line 157
    .line 158
    iput-object p1, p0, Lcom/vungle/ads/internal/load/g;->v:Lcom/vungle/ads/internal/n2;

    .line 159
    .line 160
    new-instance p1, Lcom/vungle/ads/internal/n2;

    .line 161
    .line 162
    sget-object p2, Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;->AD_PRELOAD_TO_READY_DURATION_MS:Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;

    .line 163
    .line 164
    invoke-direct {p1, p2}, Lcom/vungle/ads/internal/n2;-><init>(Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;)V

    .line 165
    .line 166
    .line 167
    iput-object p1, p0, Lcom/vungle/ads/internal/load/g;->w:Lcom/vungle/ads/internal/n2;

    .line 168
    .line 169
    return-void
.end method

.method public static final synthetic a(Lcom/vungle/ads/internal/load/g;)Ljava/util/concurrent/atomic/AtomicLong;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/vungle/ads/internal/load/g;->h:Ljava/util/concurrent/atomic/AtomicLong;

    return-object p0
.end method

.method public static final a(Lcom/vungle/ads/internal/load/g;Lcom/vungle/ads/internal/load/b;)V
    .locals 3

    .line 2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    sget-boolean v0, Lcom/vungle/ads/internal/util/u;->a:Z

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "All download completed "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "BaseAdLoader"

    invoke-static {v0, p1}, Lcom/vungle/ads/internal/util/t;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    iget-object p1, p0, Lcom/vungle/ads/internal/load/g;->n:Lcom/vungle/ads/internal/model/h0;

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p1, Lcom/vungle/ads/internal/model/h0;->f:Z

    .line 6
    :cond_0
    invoke-virtual {p0}, Lcom/vungle/ads/internal/load/g;->j()V

    .line 7
    iget-object p1, p0, Lcom/vungle/ads/internal/load/g;->t:Lcom/vungle/ads/internal/n2;

    invoke-virtual {p1}, Lcom/vungle/ads/internal/n2;->d()V

    .line 8
    sget-object p1, Lcom/vungle/ads/internal/AnalyticsClient;->INSTANCE:Lcom/vungle/ads/internal/AnalyticsClient;

    iget-object v0, p0, Lcom/vungle/ads/internal/load/g;->t:Lcom/vungle/ads/internal/n2;

    iget-object v1, p0, Lcom/vungle/ads/internal/load/g;->x:Lcom/vungle/ads/internal/util/s;

    const/4 v2, 0x4

    invoke-static {p1, v0, v1, v2}, Lcom/vungle/ads/internal/AnalyticsClient;->a(Lcom/vungle/ads/internal/AnalyticsClient;Lcom/vungle/ads/internal/n2;Lcom/vungle/ads/internal/util/s;I)V

    .line 9
    iget-object v0, p0, Lcom/vungle/ads/internal/load/g;->v:Lcom/vungle/ads/internal/n2;

    invoke-virtual {v0}, Lcom/vungle/ads/internal/n2;->d()V

    .line 10
    iget-object v0, p0, Lcom/vungle/ads/internal/load/g;->v:Lcom/vungle/ads/internal/n2;

    iget-object p0, p0, Lcom/vungle/ads/internal/load/g;->x:Lcom/vungle/ads/internal/util/s;

    invoke-static {p1, v0, p0, v2}, Lcom/vungle/ads/internal/AnalyticsClient;->a(Lcom/vungle/ads/internal/AnalyticsClient;Lcom/vungle/ads/internal/n2;Lcom/vungle/ads/internal/util/s;I)V

    return-void
.end method

.method public static final a(Lcom/vungle/ads/internal/load/g;Lcom/vungle/ads/internal/model/b;Lcom/vungle/ads/internal/model/h0;)Z
    .locals 5

    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    if-nez p2, :cond_0

    goto :goto_1

    .line 12
    :cond_0
    invoke-virtual {p1}, Lcom/vungle/ads/internal/model/b;->i()Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_1

    .line 13
    :cond_1
    iget-object v1, p1, Lcom/vungle/ads/internal/model/b;->c:Ljava/lang/String;

    .line 14
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_2

    goto :goto_1

    .line 15
    :cond_2
    new-instance v1, Ljava/io/File;

    .line 16
    iget-object v2, p1, Lcom/vungle/ads/internal/model/b;->c:Ljava/lang/String;

    .line 17
    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 18
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {v1}, Ljava/io/File;->length()J

    move-result-wide v1

    .line 19
    iget-wide v3, p1, Lcom/vungle/ads/internal/model/b;->h:J

    cmp-long p1, v1, v3

    if-nez p1, :cond_5

    .line 20
    iget-object p0, p0, Lcom/vungle/ads/internal/load/g;->f:Lcom/vungle/ads/internal/util/PathProvider;

    invoke-virtual {p2}, Lcom/vungle/ads/internal/model/h0;->h()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/vungle/ads/internal/util/PathProvider;->b(Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    if-eqz p0, :cond_4

    .line 21
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    move-result p0

    if-nez p0, :cond_3

    goto :goto_0

    .line 22
    :cond_3
    sget-object p0, Lcom/vungle/ads/internal/util/n;->a:Lcom/vungle/ads/internal/util/m;

    const/4 p0, 0x1

    return p0

    .line 23
    :cond_4
    :goto_0
    sget-boolean p0, Lcom/vungle/ads/internal/util/u;->a:Z

    const-string p0, "BaseAdLoader"

    const-string p1, "Unable to access Destination Directory"

    invoke-static {p0, p1}, Lcom/vungle/ads/internal/util/t;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    :goto_1
    return v0
.end method

.method public static final synthetic b(Lcom/vungle/ads/internal/load/g;)Ljava/util/LinkedHashSet;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/vungle/ads/internal/load/g;->i:Ljava/util/LinkedHashSet;

    return-object p0
.end method

.method public static final synthetic c(Lcom/vungle/ads/internal/load/g;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/vungle/ads/internal/load/g;->o:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method public static final synthetic d(Lcom/vungle/ads/internal/load/g;)Lcom/vungle/ads/internal/m2;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/vungle/ads/internal/load/g;->r:Lcom/vungle/ads/internal/m2;

    return-object p0
.end method

.method public static final synthetic e(Lcom/vungle/ads/internal/load/g;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/vungle/ads/internal/load/g;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method public static final synthetic f(Lcom/vungle/ads/internal/load/g;)Lcom/vungle/ads/internal/m2;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/vungle/ads/internal/load/g;->s:Lcom/vungle/ads/internal/m2;

    return-object p0
.end method

.method public static final g(Lcom/vungle/ads/internal/load/g;)V
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/vungle/ads/internal/load/g;->u:Lcom/vungle/ads/internal/n2;

    .line 3
    invoke-virtual {v0}, Lcom/vungle/ads/internal/n2;->d()V

    .line 4
    sget-object v0, Lcom/vungle/ads/internal/AnalyticsClient;->INSTANCE:Lcom/vungle/ads/internal/AnalyticsClient;

    iget-object v1, p0, Lcom/vungle/ads/internal/load/g;->u:Lcom/vungle/ads/internal/n2;

    iget-object v2, p0, Lcom/vungle/ads/internal/load/g;->x:Lcom/vungle/ads/internal/util/s;

    const/4 v3, 0x4

    invoke-static {v0, v1, v2, v3}, Lcom/vungle/ads/internal/AnalyticsClient;->a(Lcom/vungle/ads/internal/AnalyticsClient;Lcom/vungle/ads/internal/n2;Lcom/vungle/ads/internal/util/s;I)V

    .line 5
    invoke-virtual {p0}, Lcom/vungle/ads/internal/load/g;->j()V

    return-void
.end method

.method public static final h(Lcom/vungle/ads/internal/load/g;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/vungle/ads/internal/load/g;->q:Lcom/vungle/ads/internal/n2;

    invoke-virtual {v0}, Lcom/vungle/ads/internal/n2;->e()V

    .line 3
    invoke-virtual {p0}, Lcom/vungle/ads/internal/load/g;->k()V

    return-void
.end method


# virtual methods
.method public a(Lcom/vungle/ads/internal/model/h0;)Lcom/vungle/ads/VungleError;
    .locals 5

    const-string v0, "adPayload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 122
    invoke-virtual {p1}, Lcom/vungle/ads/internal/model/h0;->c()Lcom/vungle/ads/internal/model/i;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Lcom/vungle/ads/internal/model/i;->i()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_d

    .line 123
    invoke-virtual {p1}, Lcom/vungle/ads/internal/model/h0;->c()Lcom/vungle/ads/internal/model/i;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/vungle/ads/internal/model/i;->b()Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    .line 124
    :goto_0
    invoke-virtual {p1}, Lcom/vungle/ads/internal/model/h0;->c()Lcom/vungle/ads/internal/model/i;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lcom/vungle/ads/internal/model/i;->i()Ljava/lang/Integer;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, v1

    .line 125
    :goto_1
    invoke-virtual {p1}, Lcom/vungle/ads/internal/model/h0;->c()Lcom/vungle/ads/internal/model/i;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/vungle/ads/internal/model/i;->d()Ljava/lang/String;

    move-result-object v1

    .line 126
    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v3, "Response error: "

    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", Request failed with error: "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    if-nez v0, :cond_3

    goto :goto_2

    .line 127
    :cond_3
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v2, 0x2711

    if-ne v1, v2, :cond_4

    goto :goto_6

    :cond_4
    :goto_2
    if-nez v0, :cond_5

    goto :goto_3

    .line 128
    :cond_5
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v2, 0x2712

    if-ne v1, v2, :cond_6

    goto :goto_6

    :cond_6
    :goto_3
    if-nez v0, :cond_7

    goto :goto_4

    .line 129
    :cond_7
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v2, 0x4e21

    if-ne v1, v2, :cond_8

    goto :goto_6

    :cond_8
    :goto_4
    if-nez v0, :cond_9

    goto :goto_5

    .line 130
    :cond_9
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v2, 0x7531

    if-ne v1, v2, :cond_a

    goto :goto_6

    :cond_a
    :goto_5
    if-nez v0, :cond_b

    goto :goto_7

    .line 131
    :cond_b
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v2, 0x7532

    if-ne v1, v2, :cond_c

    :goto_6
    new-instance v1, Lcom/vungle/ads/AdPayloadError;

    .line 132
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->forNumber(I)Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    move-result-object v0

    const-string v2, "forNumber(errorCode)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 133
    invoke-direct {v1, v0, p1}, Lcom/vungle/ads/AdPayloadError;-><init>(Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;Ljava/lang/String;)V

    return-object v1

    .line 134
    :cond_c
    :goto_7
    new-instance v0, Lcom/vungle/ads/AdPayloadError;

    sget-object v1, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->PLACEMENT_SLEEP:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    invoke-direct {v0, v1, p1}, Lcom/vungle/ads/AdPayloadError;-><init>(Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;Ljava/lang/String;)V

    return-object v0

    .line 135
    :cond_d
    iget-object v0, p0, Lcom/vungle/ads/internal/load/g;->g:Lcom/vungle/ads/internal/load/b;

    invoke-virtual {v0}, Lcom/vungle/ads/internal/load/b;->c()Lcom/vungle/ads/internal/model/i3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/vungle/ads/internal/model/i3;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/vungle/ads/internal/load/g;->n:Lcom/vungle/ads/internal/model/h0;

    if-eqz v2, :cond_e

    invoke-virtual {v2}, Lcom/vungle/ads/internal/model/h0;->D()Ljava/lang/String;

    move-result-object v2

    goto :goto_8

    :cond_e
    move-object v2, v1

    :goto_8
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    .line 136
    const-string p1, "Waterfall request and responses placement don\'t match "

    invoke-static {p1}, Lcom/iab/omid/library/vungle/internal/l;->a(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 137
    iget-object v0, p0, Lcom/vungle/ads/internal/load/g;->n:Lcom/vungle/ads/internal/model/h0;

    if-eqz v0, :cond_f

    invoke-virtual {v0}, Lcom/vungle/ads/internal/model/h0;->D()Ljava/lang/String;

    move-result-object v1

    :cond_f
    const/16 v0, 0x2e

    .line 138
    invoke-static {p1, v1, v0}, LA7/p0;->n(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object p1

    .line 139
    new-instance v0, Lcom/vungle/ads/PlacementMismatchError;

    invoke-direct {v0, p1}, Lcom/vungle/ads/PlacementMismatchError;-><init>(Ljava/lang/String;)V

    return-object v0

    .line 140
    :cond_10
    invoke-virtual {p1}, Lcom/vungle/ads/internal/model/h0;->k()Lcom/vungle/ads/internal/model/i;

    move-result-object v0

    if-eqz v0, :cond_11

    .line 141
    iget-object v0, v0, Lcom/vungle/ads/internal/model/i;->u:Lcom/vungle/ads/internal/model/v;

    goto :goto_9

    :cond_11
    move-object v0, v1

    :goto_9
    if-nez v0, :cond_12

    .line 142
    new-instance v0, Lcom/vungle/ads/AdResponseEmptyError;

    const-string v2, "Missing template settings"

    invoke-direct {v0, v2}, Lcom/vungle/ads/AdResponseEmptyError;-><init>(Ljava/lang/String;)V

    goto/16 :goto_13

    .line 143
    :cond_12
    iget-object v0, v0, Lcom/vungle/ads/internal/model/v;->b:Ljava/util/Map;

    .line 144
    invoke-virtual {p1}, Lcom/vungle/ads/internal/model/h0;->A()Z

    move-result v2

    if-eqz v2, :cond_17

    if-eqz v0, :cond_13

    .line 145
    const-string v2, "MAIN_IMAGE"

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/vungle/ads/internal/model/o;

    if-eqz v2, :cond_13

    .line 146
    iget-object v2, v2, Lcom/vungle/ads/internal/model/o;->a:Ljava/lang/String;

    goto :goto_a

    :cond_13
    move-object v2, v1

    :goto_a
    if-nez v2, :cond_15

    if-eqz v0, :cond_14

    .line 147
    const-string v2, "MAIN_VIDEO"

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/vungle/ads/internal/model/o;

    if-eqz v2, :cond_14

    .line 148
    iget-object v2, v2, Lcom/vungle/ads/internal/model/o;->a:Ljava/lang/String;

    goto :goto_b

    :cond_14
    move-object v2, v1

    :goto_b
    if-nez v2, :cond_15

    .line 149
    new-instance v0, Lcom/vungle/ads/NativeAssetError;

    const-string v2, "Unable to load null main asset."

    invoke-direct {v0, v2}, Lcom/vungle/ads/NativeAssetError;-><init>(Ljava/lang/String;)V

    goto/16 :goto_13

    .line 150
    :cond_15
    const-string v2, "VUNGLE_PRIVACY_ICON_URL"

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/vungle/ads/internal/model/o;

    if-eqz v2, :cond_16

    .line 151
    iget-object v2, v2, Lcom/vungle/ads/internal/model/o;->a:Ljava/lang/String;

    goto :goto_c

    :cond_16
    move-object v2, v1

    :goto_c
    if-nez v2, :cond_1b

    .line 152
    new-instance v0, Lcom/vungle/ads/NativeAssetError;

    const-string v2, "Unable to load null privacy image."

    invoke-direct {v0, v2}, Lcom/vungle/ads/NativeAssetError;-><init>(Ljava/lang/String;)V

    goto/16 :goto_13

    .line 153
    :cond_17
    invoke-virtual {p1}, Lcom/vungle/ads/internal/model/h0;->k()Lcom/vungle/ads/internal/model/i;

    move-result-object v2

    if-eqz v2, :cond_18

    .line 154
    iget-object v2, v2, Lcom/vungle/ads/internal/model/i;->n:Ljava/lang/String;

    goto :goto_d

    :cond_18
    move-object v2, v1

    :goto_d
    if-eqz v2, :cond_23

    .line 155
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_19

    goto/16 :goto_12

    :cond_19
    if-eqz v2, :cond_22

    .line 156
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_1a

    goto/16 :goto_11

    :cond_1a
    invoke-static {v2}, Landroid/webkit/URLUtil;->isHttpsUrl(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_1b

    invoke-static {v2}, Landroid/webkit/URLUtil;->isHttpUrl(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_22

    :cond_1b
    if-eqz v0, :cond_21

    .line 157
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1c
    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_21

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 158
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/vungle/ads/internal/model/o;

    .line 159
    iget-object v3, v3, Lcom/vungle/ads/internal/model/o;->a:Ljava/lang/String;

    if-eqz v3, :cond_20

    .line 160
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_1d

    goto :goto_10

    :cond_1d
    if-eqz v3, :cond_1f

    .line 161
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_1e

    goto :goto_f

    :cond_1e
    invoke-static {v3}, Landroid/webkit/URLUtil;->isHttpsUrl(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1c

    invoke-static {v3}, Landroid/webkit/URLUtil;->isHttpUrl(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1f

    goto :goto_e

    .line 162
    :cond_1f
    :goto_f
    new-instance v0, Lcom/vungle/ads/InvalidAssetUrlError;

    .line 163
    const-string v2, "Invalid asset URL "

    invoke-static {v2, v3}, Lcom/iab/omid/library/vungle/d;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 164
    invoke-direct {v0, v2}, Lcom/vungle/ads/InvalidAssetUrlError;-><init>(Ljava/lang/String;)V

    goto :goto_13

    .line 165
    :cond_20
    :goto_10
    new-instance v0, Lcom/vungle/ads/InvalidAssetUrlError;

    .line 166
    const-string v3, "None asset URL for "

    invoke-static {v3}, Lcom/iab/omid/library/vungle/internal/l;->a(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 167
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/vungle/ads/InvalidAssetUrlError;-><init>(Ljava/lang/String;)V

    goto :goto_13

    :cond_21
    move-object v0, v1

    goto :goto_13

    .line 168
    :cond_22
    :goto_11
    const-string v0, "Failed to load vm url: "

    invoke-static {v0, v2}, Lcom/iab/omid/library/vungle/d;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 169
    new-instance v2, Lcom/vungle/ads/InvalidTemplateURLError;

    invoke-direct {v2, v0}, Lcom/vungle/ads/InvalidTemplateURLError;-><init>(Ljava/lang/String;)V

    move-object v0, v2

    goto :goto_13

    .line 170
    :cond_23
    :goto_12
    new-instance v0, Lcom/vungle/ads/InvalidTemplateURLError;

    const-string v2, "Failed to prepare null vmURL for downloading."

    invoke-direct {v0, v2}, Lcom/vungle/ads/InvalidTemplateURLError;-><init>(Ljava/lang/String;)V

    :goto_13
    if-eqz v0, :cond_24

    return-object v0

    .line 171
    :cond_24
    invoke-virtual {p1}, Lcom/vungle/ads/internal/model/h0;->x()Z

    move-result v0

    if-eqz v0, :cond_26

    .line 172
    new-instance v0, Lcom/vungle/ads/AdExpiredError;

    .line 173
    const-string v2, "The ad markup has expired for playback. Ad expiry: "

    invoke-static {v2}, Lcom/iab/omid/library/vungle/internal/l;->a(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 174
    invoke-virtual {p1}, Lcom/vungle/ads/internal/model/h0;->c()Lcom/vungle/ads/internal/model/i;

    move-result-object p1

    if-eqz p1, :cond_25

    invoke-virtual {p1}, Lcom/vungle/ads/internal/model/i;->c()Ljava/lang/Integer;

    move-result-object v1

    .line 175
    :cond_25
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", device: "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    .line 177
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/vungle/ads/AdExpiredError;-><init>(Ljava/lang/String;)V

    return-object v0

    .line 178
    :cond_26
    invoke-virtual {p1}, Lcom/vungle/ads/internal/model/h0;->h()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_28

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-nez p1, :cond_27

    goto :goto_14

    :cond_27
    return-object v1

    .line 179
    :cond_28
    :goto_14
    new-instance p1, Lcom/vungle/ads/InvalidEventIdError;

    const-string v0, "Event id is invalid."

    invoke-direct {p1, v0}, Lcom/vungle/ads/InvalidEventIdError;-><init>(Ljava/lang/String;)V

    return-object p1
.end method

.method public final a()V
    .locals 4

    .line 28
    iget-object v0, p0, Lcom/vungle/ads/internal/load/g;->e:Lcom/vungle/ads/internal/downloader/m;

    check-cast v0, Lcom/vungle/ads/internal/downloader/h;

    .line 29
    iget-object v1, v0, Lcom/vungle/ads/internal/downloader/h;->d:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 30
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/vungle/ads/internal/downloader/k;

    if-eqz v2, :cond_0

    .line 31
    iget-object v3, v2, Lcom/vungle/ads/internal/downloader/k;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    .line 32
    :cond_1
    iget-object v2, v2, Lcom/vungle/ads/internal/downloader/k;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    goto :goto_0

    .line 33
    :cond_2
    iget-object v0, v0, Lcom/vungle/ads/internal/downloader/h;->d:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    return-void
.end method

.method public final a(Lcom/vungle/ads/VungleError;)V
    .locals 7

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    iget-object v0, p0, Lcom/vungle/ads/internal/load/g;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_9

    iget-object v0, p0, Lcom/vungle/ads/internal/load/g;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 35
    iget-object v0, p0, Lcom/vungle/ads/internal/load/g;->n:Lcom/vungle/ads/internal/model/h0;

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Lcom/vungle/ads/internal/model/h0;->A()Z

    move-result v0

    if-ne v0, v2, :cond_8

    .line 36
    iget-object v0, p0, Lcom/vungle/ads/internal/load/g;->m:Ljava/util/ArrayList;

    .line 37
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 38
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 39
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 40
    move-object v6, v5

    check-cast v6, Lcom/vungle/ads/internal/model/b;

    .line 41
    invoke-virtual {v6}, Lcom/vungle/ads/internal/model/b;->k()Z

    move-result v6

    if-eqz v6, :cond_0

    .line 42
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 43
    :cond_0
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 44
    :cond_1
    check-cast v3, Ljava/util/List;

    check-cast v4, Ljava/util/List;

    .line 45
    instance-of v0, v3, Ljava/util/Collection;

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    .line 46
    :cond_2
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/vungle/ads/internal/model/b;

    .line 47
    invoke-virtual {v3}, Lcom/vungle/ads/internal/model/b;->i()Z

    move-result v3

    if-eqz v3, :cond_3

    move v0, v2

    goto :goto_2

    :cond_4
    :goto_1
    move v0, v1

    .line 48
    :goto_2
    instance-of v3, v4, Ljava/util/Collection;

    if-eqz v3, :cond_5

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_5

    goto :goto_3

    .line 49
    :cond_5
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/vungle/ads/internal/model/b;

    .line 50
    invoke-virtual {v4}, Lcom/vungle/ads/internal/model/b;->i()Z

    move-result v4

    if-nez v4, :cond_6

    move v2, v1

    :cond_7
    :goto_3
    if-eqz v0, :cond_8

    if-eqz v2, :cond_8

    .line 51
    iget-object p1, p0, Lcom/vungle/ads/internal/load/g;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 52
    invoke-virtual {p0}, Lcom/vungle/ads/internal/load/g;->j()V

    return-void

    .line 53
    :cond_8
    iget-object v0, p0, Lcom/vungle/ads/internal/load/g;->j:Lcom/vungle/ads/internal/load/a;

    if-eqz v0, :cond_9

    invoke-interface {v0, p1}, Lcom/vungle/ads/internal/load/a;->onFailure(Lcom/vungle/ads/VungleError;)V

    :cond_9
    return-void
.end method

.method public final a(Lcom/vungle/ads/internal/model/h0;Lcom/vungle/ads/internal/m2;)V
    .locals 5

    const-string v0, "advertisement"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    iput-object p1, p0, Lcom/vungle/ads/internal/load/g;->n:Lcom/vungle/ads/internal/model/h0;

    .line 55
    invoke-virtual {p1}, Lcom/vungle/ads/internal/model/h0;->E()V

    .line 56
    iget-object v0, p0, Lcom/vungle/ads/internal/load/g;->x:Lcom/vungle/ads/internal/util/s;

    invoke-virtual {p1, v0}, Lcom/vungle/ads/internal/model/h0;->a(Lcom/vungle/ads/internal/util/s;)V

    .line 57
    iget-object v0, p0, Lcom/vungle/ads/internal/load/g;->x:Lcom/vungle/ads/internal/util/s;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/vungle/ads/internal/model/h0;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/vungle/ads/internal/util/s;->d(Ljava/lang/String;)V

    .line 58
    :goto_0
    iget-object v0, p0, Lcom/vungle/ads/internal/load/g;->x:Lcom/vungle/ads/internal/util/s;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lcom/vungle/ads/internal/model/h0;->n()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/vungle/ads/internal/util/s;->c(Ljava/lang/String;)V

    .line 59
    :goto_1
    iget-object v0, p0, Lcom/vungle/ads/internal/load/g;->x:Lcom/vungle/ads/internal/util/s;

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, Lcom/vungle/ads/internal/model/h0;->l()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/vungle/ads/internal/util/s;->b(Ljava/lang/String;)V

    .line 60
    :goto_2
    iget-object v0, p0, Lcom/vungle/ads/internal/load/g;->x:Lcom/vungle/ads/internal/util/s;

    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {p1}, Lcom/vungle/ads/internal/model/h0;->t()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/vungle/ads/internal/util/s;->f(Ljava/lang/String;)V

    .line 61
    :goto_3
    iget-object v0, p0, Lcom/vungle/ads/internal/load/g;->x:Lcom/vungle/ads/internal/util/s;

    if-nez v0, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {p1}, Lcom/vungle/ads/internal/model/h0;->u()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/vungle/ads/internal/util/s;->h(Ljava/lang/String;)V

    .line 62
    :goto_4
    iget-object v0, p0, Lcom/vungle/ads/internal/load/g;->x:Lcom/vungle/ads/internal/util/s;

    if-nez v0, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {p1}, Lcom/vungle/ads/internal/model/h0;->B()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/vungle/ads/internal/util/s;->c(Ljava/lang/Boolean;)V

    .line 63
    :goto_5
    iget-object v0, p0, Lcom/vungle/ads/internal/load/g;->x:Lcom/vungle/ads/internal/util/s;

    if-nez v0, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {p1}, Lcom/vungle/ads/internal/model/h0;->b()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/vungle/ads/internal/util/s;->b(Ljava/lang/Boolean;)V

    .line 64
    :goto_6
    iget-object v0, p0, Lcom/vungle/ads/internal/load/g;->x:Lcom/vungle/ads/internal/util/s;

    if-nez v0, :cond_7

    goto :goto_7

    :cond_7
    invoke-virtual {p1}, Lcom/vungle/ads/internal/model/h0;->y()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/vungle/ads/internal/util/s;->a(Ljava/lang/Boolean;)V

    .line 65
    :goto_7
    iget-object v0, p0, Lcom/vungle/ads/internal/load/g;->x:Lcom/vungle/ads/internal/util/s;

    if-nez v0, :cond_8

    goto :goto_8

    :cond_8
    invoke-virtual {p1}, Lcom/vungle/ads/internal/model/h0;->o()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/vungle/ads/internal/util/s;->e(Ljava/lang/String;)V

    .line 66
    :goto_8
    iget-object v0, p0, Lcom/vungle/ads/internal/load/g;->q:Lcom/vungle/ads/internal/n2;

    invoke-virtual {v0}, Lcom/vungle/ads/internal/n2;->d()V

    .line 67
    sget-object v0, Lcom/vungle/ads/internal/AnalyticsClient;->INSTANCE:Lcom/vungle/ads/internal/AnalyticsClient;

    iget-object v1, p0, Lcom/vungle/ads/internal/load/g;->q:Lcom/vungle/ads/internal/n2;

    iget-object v2, p0, Lcom/vungle/ads/internal/load/g;->x:Lcom/vungle/ads/internal/util/s;

    const/4 v3, 0x4

    invoke-static {v0, v1, v2, v3}, Lcom/vungle/ads/internal/AnalyticsClient;->a(Lcom/vungle/ads/internal/AnalyticsClient;Lcom/vungle/ads/internal/n2;Lcom/vungle/ads/internal/util/s;I)V

    .line 68
    invoke-virtual {p1}, Lcom/vungle/ads/internal/model/h0;->f()Lcom/vungle/ads/internal/model/v2;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_9

    .line 69
    sget-object v2, Lcom/vungle/ads/internal/ConfigManager;->INSTANCE:Lcom/vungle/ads/internal/ConfigManager;

    iget-object v3, p0, Lcom/vungle/ads/internal/load/g;->a:Landroid/content/Context;

    invoke-virtual {v2, v3, v0, v1, p2}, Lcom/vungle/ads/internal/ConfigManager;->a(Landroid/content/Context;Lcom/vungle/ads/internal/model/v2;ZLcom/vungle/ads/internal/m2;)V

    .line 70
    :cond_9
    invoke-virtual {p0, p1}, Lcom/vungle/ads/internal/load/g;->a(Lcom/vungle/ads/internal/model/h0;)Lcom/vungle/ads/VungleError;

    move-result-object p2

    if-eqz p2, :cond_a

    .line 71
    iget-object p1, p0, Lcom/vungle/ads/internal/load/g;->x:Lcom/vungle/ads/internal/util/s;

    invoke-virtual {p2, p1}, Lcom/vungle/ads/VungleError;->setLogEntry$vungle_ads_release(Lcom/vungle/ads/internal/util/s;)Lcom/vungle/ads/VungleError;

    move-result-object p1

    invoke-virtual {p1}, Lcom/vungle/ads/VungleError;->logError$vungle_ads_release()Lcom/vungle/ads/VungleError;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/vungle/ads/internal/load/g;->a(Lcom/vungle/ads/VungleError;)V

    return-void

    .line 72
    :cond_a
    iget-object p2, p0, Lcom/vungle/ads/internal/load/g;->f:Lcom/vungle/ads/internal/util/PathProvider;

    invoke-virtual {p1}, Lcom/vungle/ads/internal/model/h0;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/vungle/ads/internal/util/PathProvider;->b(Ljava/lang/String;)Ljava/io/File;

    move-result-object p2

    if-eqz p2, :cond_16

    .line 73
    invoke-virtual {p2}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_16

    invoke-virtual {p2}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_b

    goto/16 :goto_d

    .line 74
    :cond_b
    iget-object v0, p0, Lcom/vungle/ads/internal/load/g;->n:Lcom/vungle/ads/internal/model/h0;

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Lcom/vungle/ads/internal/model/h0;->C()Z

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_c

    .line 75
    :try_start_0
    iget-object v0, p0, Lcom/vungle/ads/internal/load/g;->d:Lcom/vungle/ads/internal/omsdk/c;

    invoke-virtual {v0}, Lcom/vungle/ads/internal/omsdk/c;->b()V

    .line 76
    iget-object v0, p0, Lcom/vungle/ads/internal/load/g;->d:Lcom/vungle/ads/internal/omsdk/c;

    iget-object v2, p0, Lcom/vungle/ads/internal/load/g;->f:Lcom/vungle/ads/internal/util/PathProvider;

    invoke-virtual {v2}, Lcom/vungle/ads/internal/util/PathProvider;->getVmDir()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/vungle/ads/internal/omsdk/c;->a(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_9

    :catch_0
    move-exception v0

    .line 77
    sget-boolean v2, Lcom/vungle/ads/internal/util/u;->a:Z

    .line 78
    const-string v2, "Failed to inject OMSDK: "

    invoke-static {v2}, Lcom/iab/omid/library/vungle/internal/l;->a(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 79
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "BaseAdLoader"

    invoke-static {v4, v3}, Lcom/vungle/ads/internal/util/t;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    new-instance v3, Lcom/vungle/ads/OmSdkJsError;

    .line 81
    sget-object v4, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;->OMSDK_JS_WRITE_FAILED:Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 82
    invoke-static {v2}, Lcom/iab/omid/library/vungle/internal/l;->a(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 83
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 84
    invoke-direct {v3, v4, v0}, Lcom/vungle/ads/OmSdkJsError;-><init>(Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;Ljava/lang/String;)V

    .line 85
    iget-object v0, p0, Lcom/vungle/ads/internal/load/g;->x:Lcom/vungle/ads/internal/util/s;

    invoke-virtual {v3, v0}, Lcom/vungle/ads/VungleError;->setLogEntry$vungle_ads_release(Lcom/vungle/ads/internal/util/s;)Lcom/vungle/ads/VungleError;

    move-result-object v0

    invoke-virtual {v0}, Lcom/vungle/ads/VungleError;->logErrorNoReturnValue$vungle_ads_release()V

    .line 86
    :cond_c
    :goto_9
    iget-object v0, p0, Lcom/vungle/ads/internal/load/g;->a:Landroid/content/Context;

    .line 87
    sget-object v2, Lef/j;->a:Lef/j;

    new-instance v3, Lcom/vungle/ads/internal/load/d;

    invoke-direct {v3, v0}, Lcom/vungle/ads/internal/load/d;-><init>(Landroid/content/Context;)V

    invoke-static {v2, v3}, LFe/c;->y(Lef/j;Ltf/a;)Lef/i;

    move-result-object v0

    .line 88
    invoke-virtual {p1}, Lcom/vungle/ads/internal/model/h0;->c()Lcom/vungle/ads/internal/model/i;

    move-result-object v2

    if-eqz v2, :cond_d

    invoke-virtual {v2}, Lcom/vungle/ads/internal/model/i;->e()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_d

    .line 89
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 90
    new-instance v4, Lcom/vungle/ads/internal/network/p;

    invoke-direct {v4, v3}, Lcom/vungle/ads/internal/network/p;-><init>(Ljava/lang/String;)V

    .line 91
    const-string v3, "load_ad"

    invoke-virtual {v4, v3}, Lcom/vungle/ads/internal/network/p;->b(Ljava/lang/String;)Lcom/vungle/ads/internal/network/p;

    move-result-object v3

    .line 92
    iget-object v4, p0, Lcom/vungle/ads/internal/load/g;->x:Lcom/vungle/ads/internal/util/s;

    invoke-virtual {v3, v4}, Lcom/vungle/ads/internal/network/p;->a(Lcom/vungle/ads/internal/util/s;)Lcom/vungle/ads/internal/network/p;

    move-result-object v3

    .line 93
    invoke-virtual {v3}, Lcom/vungle/ads/internal/network/p;->a()Lcom/vungle/ads/internal/network/q;

    move-result-object v3

    .line 94
    invoke-interface {v0}, Lef/i;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/vungle/ads/internal/network/r;

    .line 95
    invoke-static {v4, v3}, Lcom/vungle/ads/internal/network/r;->a(Lcom/vungle/ads/internal/network/r;Lcom/vungle/ads/internal/network/q;)V

    goto :goto_a

    .line 96
    :cond_d
    iget-object v0, p0, Lcom/vungle/ads/internal/load/g;->m:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_e

    .line 97
    iget-object v0, p0, Lcom/vungle/ads/internal/load/g;->m:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 98
    :cond_e
    iget-object v0, p0, Lcom/vungle/ads/internal/load/g;->m:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Lcom/vungle/ads/internal/model/h0;->a(Ljava/io/File;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 99
    iget-object p1, p0, Lcom/vungle/ads/internal/load/g;->m:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_f

    .line 100
    invoke-virtual {p0}, Lcom/vungle/ads/internal/load/g;->j()V

    return-void

    .line 101
    :cond_f
    iget-object p1, p0, Lcom/vungle/ads/internal/load/g;->t:Lcom/vungle/ads/internal/n2;

    invoke-virtual {p1}, Lcom/vungle/ads/internal/n2;->e()V

    .line 102
    iget-object p1, p0, Lcom/vungle/ads/internal/load/g;->u:Lcom/vungle/ads/internal/n2;

    invoke-virtual {p1}, Lcom/vungle/ads/internal/n2;->e()V

    .line 103
    iget-object p1, p0, Lcom/vungle/ads/internal/load/g;->v:Lcom/vungle/ads/internal/n2;

    invoke-virtual {p1}, Lcom/vungle/ads/internal/n2;->e()V

    .line 104
    iget-object p1, p0, Lcom/vungle/ads/internal/load/g;->h:Ljava/util/concurrent/atomic/AtomicLong;

    iget-object p2, p0, Lcom/vungle/ads/internal/load/g;->m:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    int-to-long v2, p2

    invoke-virtual {p1, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 105
    iget-object p1, p0, Lcom/vungle/ads/internal/load/g;->n:Lcom/vungle/ads/internal/model/h0;

    if-eqz p1, :cond_10

    invoke-virtual {p1}, Lcom/vungle/ads/internal/model/h0;->c()Lcom/vungle/ads/internal/model/i;

    move-result-object p1

    if-eqz p1, :cond_10

    invoke-virtual {p1}, Lcom/vungle/ads/internal/model/i;->f()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_10

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    :cond_10
    const/4 p1, 0x5

    if-le v1, p1, :cond_11

    move v1, p1

    .line 106
    :cond_11
    iget-object p1, p0, Lcom/vungle/ads/internal/load/g;->m:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_b
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_15

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/vungle/ads/internal/model/b;

    .line 107
    new-instance v0, Lcom/vungle/ads/internal/downloader/k;

    .line 108
    iget-boolean v2, p2, Lcom/vungle/ads/internal/model/b;->d:Z

    if-eqz v2, :cond_12

    .line 109
    sget-object v2, Lcom/vungle/ads/internal/downloader/j;->b:Lcom/vungle/ads/internal/downloader/j;

    goto :goto_c

    .line 110
    :cond_12
    sget-object v2, Lcom/vungle/ads/internal/downloader/j;->c:Lcom/vungle/ads/internal/downloader/j;

    .line 111
    :goto_c
    iget-object v3, p0, Lcom/vungle/ads/internal/load/g;->x:Lcom/vungle/ads/internal/util/s;

    invoke-direct {v0, v2, p2, v3, v1}, Lcom/vungle/ads/internal/downloader/k;-><init>(Lcom/vungle/ads/internal/downloader/j;Lcom/vungle/ads/internal/model/b;Lcom/vungle/ads/internal/util/s;I)V

    .line 112
    invoke-virtual {p2}, Lcom/vungle/ads/internal/model/b;->j()Z

    move-result v2

    if-eqz v2, :cond_13

    .line 113
    invoke-virtual {v0}, Lcom/vungle/ads/internal/downloader/k;->g()V

    .line 114
    :cond_13
    invoke-virtual {p2}, Lcom/vungle/ads/internal/model/b;->n()Z

    move-result v2

    if-eqz v2, :cond_14

    .line 115
    iget-object v2, p0, Lcom/vungle/ads/internal/load/g;->i:Ljava/util/LinkedHashSet;

    invoke-virtual {p2}, Lcom/vungle/ads/internal/model/b;->h()Ljava/lang/String;

    move-result-object p2

    invoke-interface {v2, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 116
    :cond_14
    iget-object p2, p0, Lcom/vungle/ads/internal/load/g;->e:Lcom/vungle/ads/internal/downloader/m;

    .line 117
    new-instance v2, Lcom/vungle/ads/internal/load/c;

    invoke-direct {v2, p0}, Lcom/vungle/ads/internal/load/c;-><init>(Lcom/vungle/ads/internal/load/g;)V

    .line 118
    check-cast p2, Lcom/vungle/ads/internal/downloader/h;

    invoke-virtual {p2, v0, v2}, Lcom/vungle/ads/internal/downloader/h;->a(Lcom/vungle/ads/internal/downloader/k;Lcom/vungle/ads/internal/load/c;)V

    goto :goto_b

    :cond_15
    return-void

    .line 119
    :cond_16
    :goto_d
    new-instance p1, Lcom/vungle/ads/AssetWriteError;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Invalid directory. "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/vungle/ads/AssetWriteError;-><init>(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/vungle/ads/internal/load/g;->x:Lcom/vungle/ads/internal/util/s;

    invoke-virtual {p1, p2}, Lcom/vungle/ads/VungleError;->setLogEntry$vungle_ads_release(Lcom/vungle/ads/internal/util/s;)Lcom/vungle/ads/VungleError;

    move-result-object p1

    .line 120
    invoke-virtual {p1}, Lcom/vungle/ads/VungleError;->logError$vungle_ads_release()Lcom/vungle/ads/VungleError;

    move-result-object p1

    .line 121
    invoke-virtual {p0, p1}, Lcom/vungle/ads/internal/load/g;->a(Lcom/vungle/ads/VungleError;)V

    return-void
.end method

.method public final a(Lcom/vungle/ads/internal/s;)V
    .locals 2

    const-string v0, "adLoaderCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    iput-object p1, p0, Lcom/vungle/ads/internal/load/g;->j:Lcom/vungle/ads/internal/load/a;

    .line 26
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/vungle/ads/internal/load/g;->y:J

    .line 27
    iget-object p1, p0, Lcom/vungle/ads/internal/load/g;->c:Lcom/vungle/ads/internal/executor/a;

    check-cast p1, Lcom/vungle/ads/internal/executor/d;

    invoke-virtual {p1}, Lcom/vungle/ads/internal/executor/d;->b()Lcom/vungle/ads/internal/executor/j;

    move-result-object p1

    new-instance v0, LC8/g;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, LC8/g;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v0}, Lcom/vungle/ads/internal/executor/j;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final a(Lcom/vungle/ads/internal/util/s;)V
    .locals 0

    .line 24
    iput-object p1, p0, Lcom/vungle/ads/internal/load/g;->x:Lcom/vungle/ads/internal/util/s;

    return-void
.end method

.method public final b()Lcom/vungle/ads/internal/load/b;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/vungle/ads/internal/load/g;->g:Lcom/vungle/ads/internal/load/b;

    return-object v0
.end method

.method public final c()Lcom/vungle/ads/internal/model/h0;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/vungle/ads/internal/load/g;->n:Lcom/vungle/ads/internal/model/h0;

    return-object v0
.end method

.method public final d()Landroid/content/Context;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/vungle/ads/internal/load/g;->a:Landroid/content/Context;

    return-object v0
.end method

.method public final e()Lcom/vungle/ads/internal/util/s;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/vungle/ads/internal/load/g;->x:Lcom/vungle/ads/internal/util/s;

    return-object v0
.end method

.method public final f()Lcom/vungle/ads/internal/util/PathProvider;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/vungle/ads/internal/load/g;->f:Lcom/vungle/ads/internal/util/PathProvider;

    return-object v0
.end method

.method public final g()Lcom/vungle/ads/internal/executor/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/vungle/ads/internal/load/g;->c:Lcom/vungle/ads/internal/executor/a;

    return-object v0
.end method

.method public final h()Lcom/vungle/ads/internal/network/VungleApiClient;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/vungle/ads/internal/load/g;->b:Lcom/vungle/ads/internal/network/VungleApiClient;

    return-object v0
.end method

.method public abstract i()V
.end method

.method public final j()V
    .locals 8

    .line 1
    iget-object v1, p0, Lcom/vungle/ads/internal/load/g;->n:Lcom/vungle/ads/internal/model/h0;

    .line 2
    .line 3
    if-eqz v1, :cond_2

    .line 4
    .line 5
    iget-object v0, p0, Lcom/vungle/ads/internal/load/g;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_2

    .line 12
    .line 13
    iget-object v0, p0, Lcom/vungle/ads/internal/load/g;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x1

    .line 17
    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    invoke-virtual {v1}, Lcom/vungle/ads/internal/model/h0;->G()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    iget-object v0, p0, Lcom/vungle/ads/internal/load/g;->w:Lcom/vungle/ads/internal/n2;

    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/vungle/ads/internal/n2;->e()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Lcom/vungle/ads/internal/model/h0;->p()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    sget-boolean v0, Lcom/vungle/ads/internal/util/u;->a:Z

    .line 43
    .line 44
    const-string v0, "BaseAdLoader"

    .line 45
    .line 46
    const-string v2, "start preloading"

    .line 47
    .line 48
    invoke-static {v0, v2}, Lcom/vungle/ads/internal/util/t;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 52
    .line 53
    .line 54
    move-result-wide v4

    .line 55
    iget-wide v6, p0, Lcom/vungle/ads/internal/load/g;->y:J

    .line 56
    .line 57
    sub-long/2addr v4, v6

    .line 58
    sget-object v0, Lcom/vungle/ads/internal/presenter/e0;->a:Ljava/util/concurrent/locks/ReentrantLock;

    .line 59
    .line 60
    iget-object v0, p0, Lcom/vungle/ads/internal/load/g;->a:Landroid/content/Context;

    .line 61
    .line 62
    iget-object v2, p0, Lcom/vungle/ads/internal/load/g;->g:Lcom/vungle/ads/internal/load/b;

    .line 63
    .line 64
    invoke-virtual {v2}, Lcom/vungle/ads/internal/load/b;->c()Lcom/vungle/ads/internal/model/i3;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    move-wide v5, v4

    .line 69
    invoke-virtual {v1}, Lcom/vungle/ads/internal/model/h0;->v()Lcom/vungle/ads/internal/model/f0;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    move-wide v6, v5

    .line 74
    new-instance v5, Lcom/vungle/ads/internal/load/e;

    .line 75
    .line 76
    invoke-direct {v5, p0, v1}, Lcom/vungle/ads/internal/load/e;-><init>(Lcom/vungle/ads/internal/load/g;Lcom/vungle/ads/internal/model/h0;)V

    .line 77
    .line 78
    .line 79
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    invoke-static/range {v0 .. v6}, Lcom/vungle/ads/internal/presenter/e0;->a(Landroid/content/Context;Lcom/vungle/ads/internal/model/h0;Lcom/vungle/ads/internal/model/i3;Ljava/lang/String;Lcom/vungle/ads/internal/model/f0;Lcom/vungle/ads/internal/load/e;Ljava/lang/Long;)V

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_0
    invoke-virtual {p0}, Lcom/vungle/ads/internal/load/g;->i()V

    .line 88
    .line 89
    .line 90
    iget-object v0, p0, Lcom/vungle/ads/internal/load/g;->j:Lcom/vungle/ads/internal/load/a;

    .line 91
    .line 92
    if-eqz v0, :cond_1

    .line 93
    .line 94
    invoke-interface {v0, v1}, Lcom/vungle/ads/internal/load/a;->onSuccess(Lcom/vungle/ads/internal/model/h0;)V

    .line 95
    .line 96
    .line 97
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/vungle/ads/internal/load/g;->a:Landroid/content/Context;

    .line 98
    .line 99
    sget-object v1, Lef/j;->a:Lef/j;

    .line 100
    .line 101
    new-instance v2, Lcom/vungle/ads/internal/load/f;

    .line 102
    .line 103
    invoke-direct {v2, v0}, Lcom/vungle/ads/internal/load/f;-><init>(Landroid/content/Context;)V

    .line 104
    .line 105
    .line 106
    invoke-static {v1, v2}, LFe/c;->y(Lef/j;Ltf/a;)Lef/i;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-interface {v0}, Lef/i;->getValue()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    check-cast v0, Lcom/vungle/ads/internal/task/h;

    .line 115
    .line 116
    invoke-static {}, Lcom/vungle/ads/internal/task/k;->a()Lcom/vungle/ads/internal/task/f;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    check-cast v0, Lcom/vungle/ads/internal/task/s;

    .line 121
    .line 122
    invoke-virtual {v0, v1}, Lcom/vungle/ads/internal/task/s;->a(Lcom/vungle/ads/internal/task/f;)V

    .line 123
    .line 124
    .line 125
    :cond_2
    return-void
.end method

.method public abstract k()V
.end method
