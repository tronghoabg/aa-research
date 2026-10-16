.class public final Lcom/qonversion/android/sdk/dto/QRemoteConfigJsonAdapter;
.super Lhb/r;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lhb/r;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R&\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001aR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001a\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/dto/QRemoteConfigJsonAdapter;",
        "Lhb/r;",
        "Lcom/qonversion/android/sdk/dto/QRemoteConfig;",
        "Lhb/K;",
        "moshi",
        "<init>",
        "(Lhb/K;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "Lhb/w;",
        "reader",
        "fromJson",
        "(Lhb/w;)Lcom/qonversion/android/sdk/dto/QRemoteConfig;",
        "Lhb/C;",
        "writer",
        "value_",
        "Lef/C;",
        "toJson",
        "(Lhb/C;Lcom/qonversion/android/sdk/dto/QRemoteConfig;)V",
        "Lhb/u;",
        "options",
        "Lhb/u;",
        "",
        "",
        "mapOfStringAnyAdapter",
        "Lhb/r;",
        "Lcom/qonversion/android/sdk/dto/experiments/QExperiment;",
        "nullableQExperimentAdapter",
        "Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;",
        "nullableQRemoteConfigurationSourceAdapter",
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
.field private final mapOfStringAnyAdapter:Lhb/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhb/r;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final nullableQExperimentAdapter:Lhb/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhb/r;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final nullableQRemoteConfigurationSourceAdapter:Lhb/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhb/r;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final options:Lhb/u;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lhb/K;)V
    .locals 5
    .param p1    # Lhb/K;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "moshi"

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
    const-string v0, "payload"

    .line 10
    .line 11
    const-string v1, "experiment"

    .line 12
    .line 13
    const-string v2, "source"

    .line 14
    .line 15
    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-static {v2}, Lhb/u;->a([Ljava/lang/String;)Lhb/u;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    iput-object v2, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigJsonAdapter;->options:Lhb/u;

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    new-array v2, v2, [Ljava/lang/reflect/Type;

    .line 27
    .line 28
    const-class v3, Ljava/lang/String;

    .line 29
    .line 30
    const/4 v4, 0x0

    .line 31
    aput-object v3, v2, v4

    .line 32
    .line 33
    const-class v3, Ljava/lang/Object;

    .line 34
    .line 35
    const/4 v4, 0x1

    .line 36
    aput-object v3, v2, v4

    .line 37
    .line 38
    const-class v3, Ljava/util/Map;

    .line 39
    .line 40
    invoke-static {v3, v2}, Lhb/P;->f(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lib/d;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    sget-object v3, Lff/x;->a:Lff/x;

    .line 45
    .line 46
    invoke-virtual {p1, v2, v3, v0}, Lhb/K;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lhb/r;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iput-object v0, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigJsonAdapter;->mapOfStringAnyAdapter:Lhb/r;

    .line 51
    .line 52
    const-class v0, Lcom/qonversion/android/sdk/dto/experiments/QExperiment;

    .line 53
    .line 54
    invoke-virtual {p1, v0, v3, v1}, Lhb/K;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lhb/r;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iput-object v0, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigJsonAdapter;->nullableQExperimentAdapter:Lhb/r;

    .line 59
    .line 60
    const-string v0, "sourceApi"

    .line 61
    .line 62
    const-class v1, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;

    .line 63
    .line 64
    invoke-virtual {p1, v1, v3, v0}, Lhb/K;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lhb/r;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    iput-object p1, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigJsonAdapter;->nullableQRemoteConfigurationSourceAdapter:Lhb/r;

    .line 69
    .line 70
    return-void
.end method


# virtual methods
.method public fromJson(Lhb/w;)Lcom/qonversion/android/sdk/dto/QRemoteConfig;
    .locals 6
    .param p1    # Lhb/w;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lhb/w;->b()V

    const/4 v0, 0x0

    move-object v1, v0

    move-object v2, v1

    .line 3
    :goto_0
    invoke-virtual {p1}, Lhb/w;->o()Z

    move-result v3

    const-string v4, "payload"

    if-eqz v3, :cond_5

    .line 4
    iget-object v3, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigJsonAdapter;->options:Lhb/u;

    invoke-virtual {p1, v3}, Lhb/w;->W(Lhb/u;)I

    move-result v3

    const/4 v5, -0x1

    if-eq v3, v5, :cond_4

    if-eqz v3, :cond_2

    const/4 v4, 0x1

    if-eq v3, v4, :cond_1

    const/4 v4, 0x2

    if-eq v3, v4, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    iget-object v2, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigJsonAdapter;->nullableQRemoteConfigurationSourceAdapter:Lhb/r;

    invoke-virtual {v2, p1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;

    goto :goto_0

    .line 6
    :cond_1
    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigJsonAdapter;->nullableQExperimentAdapter:Lhb/r;

    invoke-virtual {v1, p1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qonversion/android/sdk/dto/experiments/QExperiment;

    goto :goto_0

    .line 7
    :cond_2
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigJsonAdapter;->mapOfStringAnyAdapter:Lhb/r;

    invoke-virtual {v0, p1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-eqz v0, :cond_3

    goto :goto_0

    .line 8
    :cond_3
    invoke-static {v4, v4, p1}, Lib/f;->l(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object p1

    throw p1

    .line 9
    :cond_4
    invoke-virtual {p1}, Lhb/w;->Y()V

    .line 10
    invoke-virtual {p1}, Lhb/w;->Z()V

    goto :goto_0

    .line 11
    :cond_5
    invoke-virtual {p1}, Lhb/w;->h()V

    .line 12
    new-instance v3, Lcom/qonversion/android/sdk/dto/QRemoteConfig;

    if-eqz v0, :cond_6

    invoke-direct {v3, v0, v1, v2}, Lcom/qonversion/android/sdk/dto/QRemoteConfig;-><init>(Ljava/util/Map;Lcom/qonversion/android/sdk/dto/experiments/QExperiment;Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;)V

    return-object v3

    .line 13
    :cond_6
    invoke-static {v4, v4, p1}, Lib/f;->f(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object p1

    throw p1
.end method

.method public bridge synthetic fromJson(Lhb/w;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/dto/QRemoteConfigJsonAdapter;->fromJson(Lhb/w;)Lcom/qonversion/android/sdk/dto/QRemoteConfig;

    move-result-object p1

    return-object p1
.end method

.method public toJson(Lhb/C;Lcom/qonversion/android/sdk/dto/QRemoteConfig;)V
    .locals 2
    .param p1    # Lhb/C;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/dto/QRemoteConfig;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p1}, Lhb/C;->b()Lhb/C;

    .line 3
    const-string v0, "payload"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 4
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigJsonAdapter;->mapOfStringAnyAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/dto/QRemoteConfig;->getPayload()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 5
    const-string v0, "experiment"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 6
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigJsonAdapter;->nullableQExperimentAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/dto/QRemoteConfig;->getExperiment()Lcom/qonversion/android/sdk/dto/experiments/QExperiment;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 7
    const-string v0, "source"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 8
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigJsonAdapter;->nullableQRemoteConfigurationSourceAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/dto/QRemoteConfig;->getSourceApi$sdk_release()Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 9
    invoke-virtual {p1}, Lhb/C;->i()Lhb/C;

    return-void

    .line 10
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "value_ was null! Wrap in .nullSafe() to write nullable values."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic toJson(Lhb/C;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/qonversion/android/sdk/dto/QRemoteConfig;

    invoke-virtual {p0, p1, p2}, Lcom/qonversion/android/sdk/dto/QRemoteConfigJsonAdapter;->toJson(Lhb/C;Lcom/qonversion/android/sdk/dto/QRemoteConfig;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const/16 v0, 0x23

    .line 2
    .line 3
    const-string v1, "GeneratedJsonAdapter(QRemoteConfig)"

    .line 4
    .line 5
    const-string v2, "toString(...)"

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lcb/a;->g(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method
