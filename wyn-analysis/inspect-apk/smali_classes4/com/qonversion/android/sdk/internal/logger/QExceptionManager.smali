.class public final Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/qonversion/android/sdk/internal/logger/ExceptionManager;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B)\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000fH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u000c2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010!R\u001a\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u00140\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'R\u001c\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u001b0(8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008)\u0010*\u00a8\u0006+"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;",
        "Lcom/qonversion/android/sdk/internal/logger/ExceptionManager;",
        "Lcom/qonversion/android/sdk/internal/repository/QRepository;",
        "repository",
        "Lcom/qonversion/android/sdk/internal/InternalConfig;",
        "intervalConfig",
        "Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;",
        "headersProvider",
        "Lhb/K;",
        "moshi",
        "<init>",
        "(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;Lhb/K;)V",
        "Lef/C;",
        "sendCrashReportsInBackground",
        "()V",
        "",
        "",
        "getAvailableReportNames",
        "()Ljava/util/List;",
        "filename",
        "Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionInfo;",
        "getContentOfCrashReport",
        "(Ljava/lang/String;)Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionInfo;",
        "exception",
        "Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;",
        "prepareCrashData",
        "(Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionInfo;)Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;",
        "Landroid/content/Context;",
        "context",
        "initialize",
        "(Landroid/content/Context;)V",
        "Lcom/qonversion/android/sdk/internal/repository/QRepository;",
        "Lcom/qonversion/android/sdk/internal/InternalConfig;",
        "Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;",
        "Lhb/r;",
        "exceptionAdapter",
        "Lhb/r;",
        "Ljava/io/File;",
        "reportsDir",
        "Ljava/io/File;",
        "Ljava/lang/ref/WeakReference;",
        "contextRef",
        "Ljava/lang/ref/WeakReference;",
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


# instance fields
.field private contextRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private final exceptionAdapter:Lhb/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhb/r;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final headersProvider:Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final intervalConfig:Lcom/qonversion/android/sdk/internal/InternalConfig;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private reportsDir:Ljava/io/File;

.field private final repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;Lhb/K;)V
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/internal/repository/QRepository;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/internal/InternalConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lhb/K;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "repository"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "intervalConfig"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "headersProvider"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "moshi"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    .line 25
    .line 26
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;->intervalConfig:Lcom/qonversion/android/sdk/internal/InternalConfig;

    .line 27
    .line 28
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;->headersProvider:Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;

    .line 29
    .line 30
    const-class p1, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionInfo;

    .line 31
    .line 32
    invoke-virtual {p4, p1}, Lhb/K;->a(Ljava/lang/Class;)Lhb/r;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;->exceptionAdapter:Lhb/r;

    .line 37
    .line 38
    return-void
.end method

.method public static synthetic a(Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;->sendCrashReportsInBackground$lambda$2(Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;)V

    return-void
.end method

.method public static final synthetic access$getContextRef$p(Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;)Ljava/lang/ref/WeakReference;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;->contextRef:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic b(Ljava/io/File;Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;->getAvailableReportNames$lambda$3(Ljava/io/File;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private final getAvailableReportNames()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;->reportsDir:Ljava/io/File;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "reportsDir"

    .line 5
    .line 6
    if-eqz v0, :cond_4

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    sget-object v3, Lff/v;->a:Lff/v;

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;->reportsDir:Ljava/io/File;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/io/File;->mkdir()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    return-object v3

    .line 27
    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw v1

    .line 31
    :cond_1
    new-instance v0, LR8/h;

    .line 32
    .line 33
    const/4 v4, 0x4

    .line 34
    invoke-direct {v0, v4}, LR8/h;-><init>(I)V

    .line 35
    .line 36
    .line 37
    iget-object v4, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;->reportsDir:Ljava/io/File;

    .line 38
    .line 39
    if-eqz v4, :cond_3

    .line 40
    .line 41
    invoke-virtual {v4, v0}, Ljava/io/File;->list(Ljava/io/FilenameFilter;)[Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    invoke-static {v0}, Lff/m;->L0([Ljava/lang/Object;)Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    return-object v0

    .line 52
    :cond_2
    return-object v3

    .line 53
    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw v1

    .line 57
    :cond_4
    invoke-static {v2}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw v1
.end method

.method private static final getAvailableReportNames$lambda$3(Ljava/io/File;Ljava/lang/String;)Z
    .locals 1

    .line 1
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    const-string v0, ".qonversion.stacktrace"

    .line 6
    .line 7
    invoke-static {p1, v0, p0}, LBf/r;->b0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method private final getContentOfCrashReport(Ljava/lang/String;)Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionInfo;
    .locals 6

    .line 1
    const-string v0, "QExceptionManager"

    .line 2
    .line 3
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;->contextRef:Ljava/lang/ref/WeakReference;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_5

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Landroid/content/Context;

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    return-object v2

    .line 17
    :cond_0
    invoke-virtual {v1, p1}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    if-eqz v3, :cond_4

    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-eqz v4, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move-object v3, v2

    .line 31
    :goto_0
    if-nez v3, :cond_2

    .line 32
    .line 33
    goto :goto_4

    .line 34
    :cond_2
    new-instance v3, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    :try_start_0
    new-instance v4, Ljava/io/BufferedReader;

    .line 40
    .line 41
    new-instance v5, Ljava/io/InputStreamReader;

    .line 42
    .line 43
    invoke-virtual {v1, p1}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-direct {v5, p1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    .line 48
    .line 49
    .line 50
    invoke-direct {v4, v5}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    .line 52
    .line 53
    :goto_1
    :try_start_1
    invoke-virtual {v4}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    if-eqz p1, :cond_3

    .line 58
    .line 59
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const/16 p1, 0xa

    .line 63
    .line 64
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :catchall_0
    move-exception p1

    .line 69
    goto :goto_2

    .line 70
    :cond_3
    :try_start_2
    invoke-interface {v4}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 71
    .line 72
    .line 73
    goto :goto_3

    .line 74
    :goto_2
    :try_start_3
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 75
    :catchall_1
    move-exception v1

    .line 76
    :try_start_4
    invoke-static {v4, p1}, LBa/c;->n(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 77
    .line 78
    .line 79
    throw v1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 80
    :catch_0
    move-exception p1

    .line 81
    const-string v1, "Failed to read crash report from the file"

    .line 82
    .line 83
    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 84
    .line 85
    .line 86
    :goto_3
    :try_start_5
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;->exceptionAdapter:Lhb/r;

    .line 87
    .line 88
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-virtual {p1, v1}, Lhb/r;->fromJson(Ljava/lang/String;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    check-cast p1, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionInfo;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    .line 97
    .line 98
    move-object v2, p1

    .line 99
    goto :goto_4

    .line 100
    :catch_1
    move-exception p1

    .line 101
    const-string v1, "Failed to parse JSON from the crash report file"

    .line 102
    .line 103
    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 104
    .line 105
    .line 106
    :cond_4
    :goto_4
    return-object v2

    .line 107
    :cond_5
    const-string p1, "contextRef"

    .line 108
    .line 109
    invoke-static {p1}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    throw v2
.end method

.method private final prepareCrashData(Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionInfo;)Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;
    .locals 8

    .line 1
    new-instance v0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;

    .line 2
    .line 3
    new-instance v1, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$DeviceInfo;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;->headersProvider:Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;

    .line 6
    .line 7
    invoke-virtual {v2}, Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;->getPlatform()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;->headersProvider:Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;

    .line 12
    .line 13
    invoke-virtual {v3}, Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;->getPlatformVersion()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    iget-object v4, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;->headersProvider:Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;

    .line 18
    .line 19
    invoke-virtual {v4}, Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;->getSource()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    iget-object v5, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;->headersProvider:Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;

    .line 24
    .line 25
    invoke-virtual {v5}, Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;->getSourceVersion()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    iget-object v6, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;->headersProvider:Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;

    .line 30
    .line 31
    invoke-virtual {v6}, Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;->getProjectKey()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    iget-object v7, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;->intervalConfig:Lcom/qonversion/android/sdk/internal/InternalConfig;

    .line 36
    .line 37
    invoke-virtual {v7}, Lcom/qonversion/android/sdk/internal/InternalConfig;->getUid()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    invoke-direct/range {v1 .. v7}, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$DeviceInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-direct {v0, p1, v1}, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;-><init>(Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionInfo;Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$DeviceInfo;)V

    .line 45
    .line 46
    .line 47
    return-object v0
.end method

.method private final sendCrashReportsInBackground()V
    .locals 3

    .line 1
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "newSingleThreadExecutor(...)"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lcom/applovin/adview/a;

    .line 11
    .line 12
    const/16 v2, 0xd

    .line 13
    .line 14
    invoke-direct {v1, p0, v2}, Lcom/applovin/adview/a;-><init>(Ljava/lang/Object;I)V

    .line 15
    .line 16
    .line 17
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method private static final sendCrashReportsInBackground$lambda$2(Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;)V
    .locals 5

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;->getAvailableReportNames()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Ljava/lang/Iterable;

    .line 11
    .line 12
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Ljava/lang/String;

    .line 27
    .line 28
    invoke-direct {p0, v1}, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;->getContentOfCrashReport(Ljava/lang/String;)Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionInfo;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    invoke-direct {p0, v2}, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;->prepareCrashData(Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionInfo;)Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    .line 39
    .line 40
    new-instance v4, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager$sendCrashReportsInBackground$1$1$1$1;

    .line 41
    .line 42
    invoke-direct {v4, p0, v1}, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager$sendCrashReportsInBackground$1$1$1$1;-><init>(Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    sget-object v1, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager$sendCrashReportsInBackground$1$1$1$2;->INSTANCE:Lcom/qonversion/android/sdk/internal/logger/QExceptionManager$sendCrashReportsInBackground$1$1$1$2;

    .line 46
    .line 47
    invoke-interface {v3, v2, v4, v1}, Lcom/qonversion/android/sdk/internal/repository/QRepository;->crashReport(Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;Ltf/a;Ltf/l;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    return-void
.end method


# virtual methods
.method public initialize(Landroid/content/Context;)V
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "getFilesDir(...)"

    .line 11
    .line 12
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;->reportsDir:Ljava/io/File;

    .line 16
    .line 17
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 18
    .line 19
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;->contextRef:Ljava/lang/ref/WeakReference;

    .line 23
    .line 24
    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->isDebuggable(Landroid/content/Context;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    new-instance v1, Lcom/qonversion/android/sdk/internal/logger/ExceptionHandler;

    .line 36
    .line 37
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    const-string v2, "getPackageName(...)"

    .line 42
    .line 43
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;->reportsDir:Ljava/io/File;

    .line 47
    .line 48
    if-eqz v2, :cond_1

    .line 49
    .line 50
    invoke-direct {v1, p1, v0, v2}, Lcom/qonversion/android/sdk/internal/logger/ExceptionHandler;-><init>(Ljava/lang/String;Ljava/lang/Thread$UncaughtExceptionHandler;Ljava/io/File;)V

    .line 51
    .line 52
    .line 53
    invoke-static {v1}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    .line 54
    .line 55
    .line 56
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;->sendCrashReportsInBackground()V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_1
    const-string p1, "reportsDir"

    .line 61
    .line 62
    invoke-static {p1}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    const/4 p1, 0x0

    .line 66
    throw p1
.end method
