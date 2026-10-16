.class public final Lcom/qonversion/android/sdk/dto/QRemoteConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lhb/s;
    generateAdapter = true
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0010\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B5\u0008\u0000\u0012\u0014\u0008\u0001\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003\u0012\n\u0008\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0002\u0010\tJ\u0015\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0008H\u00c0\u0003\u00a2\u0006\u0002\u0008\u0019J7\u0010\u001a\u001a\u00020\u00002\u0014\u0008\u0003\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\n\u0008\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0008\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0008H\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\r2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u0004H\u00d6\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0014\u0010\u000c\u001a\u00020\rX\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00088F\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0008X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0014\u00a8\u0006 "
    }
    d2 = {
        "Lcom/qonversion/android/sdk/dto/QRemoteConfig;",
        "",
        "payload",
        "",
        "",
        "experiment",
        "Lcom/qonversion/android/sdk/dto/experiments/QExperiment;",
        "sourceApi",
        "Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;",
        "(Ljava/util/Map;Lcom/qonversion/android/sdk/dto/experiments/QExperiment;Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;)V",
        "getExperiment",
        "()Lcom/qonversion/android/sdk/dto/experiments/QExperiment;",
        "isCorrect",
        "",
        "isCorrect$sdk_release",
        "()Z",
        "getPayload",
        "()Ljava/util/Map;",
        "source",
        "getSource",
        "()Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;",
        "getSourceApi$sdk_release",
        "component1",
        "component2",
        "component3",
        "component3$sdk_release",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
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
.field private final experiment:Lcom/qonversion/android/sdk/dto/experiments/QExperiment;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final isCorrect:Z

.field private final payload:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final sourceApi:Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/Map;Lcom/qonversion/android/sdk/dto/experiments/QExperiment;Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;)V
    .locals 1
    .param p1    # Ljava/util/Map;
        .annotation runtime Lhb/o;
            name = "payload"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/dto/experiments/QExperiment;
        .annotation runtime Lhb/o;
            name = "experiment"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;
        .annotation runtime Lhb/o;
            name = "source"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/qonversion/android/sdk/dto/experiments/QExperiment;",
            "Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "payload"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfig;->payload:Ljava/util/Map;

    .line 10
    .line 11
    iput-object p2, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfig;->experiment:Lcom/qonversion/android/sdk/dto/experiments/QExperiment;

    .line 12
    .line 13
    iput-object p3, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfig;->sourceApi:Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;

    .line 14
    .line 15
    if-eqz p3, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    :goto_0
    iput-boolean p1, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfig;->isCorrect:Z

    .line 21
    .line 22
    return-void
.end method

.method public static synthetic copy$default(Lcom/qonversion/android/sdk/dto/QRemoteConfig;Ljava/util/Map;Lcom/qonversion/android/sdk/dto/experiments/QExperiment;Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;ILjava/lang/Object;)Lcom/qonversion/android/sdk/dto/QRemoteConfig;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfig;->payload:Ljava/util/Map;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfig;->experiment:Lcom/qonversion/android/sdk/dto/experiments/QExperiment;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfig;->sourceApi:Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/qonversion/android/sdk/dto/QRemoteConfig;->copy(Ljava/util/Map;Lcom/qonversion/android/sdk/dto/experiments/QExperiment;Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;)Lcom/qonversion/android/sdk/dto/QRemoteConfig;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfig;->payload:Ljava/util/Map;

    return-object v0
.end method

.method public final component2()Lcom/qonversion/android/sdk/dto/experiments/QExperiment;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfig;->experiment:Lcom/qonversion/android/sdk/dto/experiments/QExperiment;

    return-object v0
.end method

.method public final component3$sdk_release()Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfig;->sourceApi:Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;

    return-object v0
.end method

.method public final copy(Ljava/util/Map;Lcom/qonversion/android/sdk/dto/experiments/QExperiment;Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;)Lcom/qonversion/android/sdk/dto/QRemoteConfig;
    .locals 1
    .param p1    # Ljava/util/Map;
        .annotation runtime Lhb/o;
            name = "payload"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/dto/experiments/QExperiment;
        .annotation runtime Lhb/o;
            name = "experiment"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;
        .annotation runtime Lhb/o;
            name = "source"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/qonversion/android/sdk/dto/experiments/QExperiment;",
            "Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;",
            ")",
            "Lcom/qonversion/android/sdk/dto/QRemoteConfig;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/qonversion/android/sdk/dto/QRemoteConfig;

    invoke-direct {v0, p1, p2, p3}, Lcom/qonversion/android/sdk/dto/QRemoteConfig;-><init>(Ljava/util/Map;Lcom/qonversion/android/sdk/dto/experiments/QExperiment;Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;)V

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
    instance-of v1, p1, Lcom/qonversion/android/sdk/dto/QRemoteConfig;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/qonversion/android/sdk/dto/QRemoteConfig;

    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfig;->payload:Ljava/util/Map;

    iget-object v3, p1, Lcom/qonversion/android/sdk/dto/QRemoteConfig;->payload:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfig;->experiment:Lcom/qonversion/android/sdk/dto/experiments/QExperiment;

    iget-object v3, p1, Lcom/qonversion/android/sdk/dto/QRemoteConfig;->experiment:Lcom/qonversion/android/sdk/dto/experiments/QExperiment;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfig;->sourceApi:Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;

    iget-object p1, p1, Lcom/qonversion/android/sdk/dto/QRemoteConfig;->sourceApi:Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getExperiment()Lcom/qonversion/android/sdk/dto/experiments/QExperiment;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfig;->experiment:Lcom/qonversion/android/sdk/dto/experiments/QExperiment;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPayload()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfig;->payload:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSource()Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfig;->sourceApi:Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final getSourceApi$sdk_release()Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfig;->sourceApi:Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfig;->payload:Ljava/util/Map;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfig;->experiment:Lcom/qonversion/android/sdk/dto/experiments/QExperiment;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/qonversion/android/sdk/dto/experiments/QExperiment;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfig;->sourceApi:Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public final isCorrect$sdk_release()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfig;->isCorrect:Z

    .line 2
    .line 3
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfig;->payload:Ljava/util/Map;

    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfig;->experiment:Lcom/qonversion/android/sdk/dto/experiments/QExperiment;

    iget-object v2, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfig;->sourceApi:Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "QRemoteConfig(payload="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", experiment="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", sourceApi="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
