.class public final Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$DeviceInfo;,
        Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionInfo;,
        Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionTrace;,
        Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionTraceElement;
    }
.end annotation

.annotation runtime Lhb/s;
    generateAdapter = true
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0008\u0081\u0008\u0018\u00002\u00020\u0001:\u0004\u0015\u0016\u0017\u0018B\u0019\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000c\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;",
        "",
        "log",
        "Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionInfo;",
        "deviceInfo",
        "Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$DeviceInfo;",
        "(Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionInfo;Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$DeviceInfo;)V",
        "getDeviceInfo",
        "()Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$DeviceInfo;",
        "getLog",
        "()Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionInfo;",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "DeviceInfo",
        "ExceptionInfo",
        "ExceptionTrace",
        "ExceptionTraceElement",
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
.field private final deviceInfo:Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$DeviceInfo;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final log:Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionInfo;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionInfo;Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$DeviceInfo;)V
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionInfo;
        .annotation runtime Lhb/o;
            name = "exception"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$DeviceInfo;
        .annotation runtime Lhb/o;
            name = "device"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "log"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "deviceInfo"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;->log:Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionInfo;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;->deviceInfo:Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$DeviceInfo;

    .line 17
    .line 18
    return-void
.end method

.method public static synthetic copy$default(Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionInfo;Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$DeviceInfo;ILjava/lang/Object;)Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;->log:Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionInfo;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;->deviceInfo:Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$DeviceInfo;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;->copy(Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionInfo;Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$DeviceInfo;)Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionInfo;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;->log:Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionInfo;

    return-object v0
.end method

.method public final component2()Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$DeviceInfo;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;->deviceInfo:Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$DeviceInfo;

    return-object v0
.end method

.method public final copy(Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionInfo;Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$DeviceInfo;)Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionInfo;
        .annotation runtime Lhb/o;
            name = "exception"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$DeviceInfo;
        .annotation runtime Lhb/o;
            name = "device"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "log"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;

    invoke-direct {v0, p1, p2}, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;-><init>(Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionInfo;Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$DeviceInfo;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;->log:Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionInfo;

    iget-object v3, p1, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;->log:Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionInfo;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;->deviceInfo:Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$DeviceInfo;

    iget-object p1, p1, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;->deviceInfo:Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$DeviceInfo;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getDeviceInfo()Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$DeviceInfo;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;->deviceInfo:Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$DeviceInfo;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getLog()Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionInfo;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;->log:Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionInfo;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;->log:Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionInfo;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionInfo;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;->deviceInfo:Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$DeviceInfo;

    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$DeviceInfo;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;->log:Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionInfo;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;->deviceInfo:Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$DeviceInfo;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "CrashRequest(log="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", deviceInfo="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
