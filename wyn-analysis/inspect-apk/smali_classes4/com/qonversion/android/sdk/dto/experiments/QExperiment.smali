.class public final Lcom/qonversion/android/sdk/dto/experiments/QExperiment;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lhb/s;
    generateAdapter = true
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B#\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u000b\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/dto/experiments/QExperiment;",
        "",
        "id",
        "",
        "name",
        "group",
        "Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroup;",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroup;)V",
        "getGroup",
        "()Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroup;",
        "getId",
        "()Ljava/lang/String;",
        "getName",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
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
.field private final group:Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroup;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final id:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final name:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroup;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Lhb/o;
            name = "uid"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lhb/o;
            name = "name"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroup;
        .annotation runtime Lhb/o;
            name = "group"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "id"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "name"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "group"

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
    iput-object p1, p0, Lcom/qonversion/android/sdk/dto/experiments/QExperiment;->id:Ljava/lang/String;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/qonversion/android/sdk/dto/experiments/QExperiment;->name:Ljava/lang/String;

    .line 22
    .line 23
    iput-object p3, p0, Lcom/qonversion/android/sdk/dto/experiments/QExperiment;->group:Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroup;

    .line 24
    .line 25
    return-void
.end method

.method public static synthetic copy$default(Lcom/qonversion/android/sdk/dto/experiments/QExperiment;Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroup;ILjava/lang/Object;)Lcom/qonversion/android/sdk/dto/experiments/QExperiment;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/qonversion/android/sdk/dto/experiments/QExperiment;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/qonversion/android/sdk/dto/experiments/QExperiment;->name:Ljava/lang/String;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/qonversion/android/sdk/dto/experiments/QExperiment;->group:Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroup;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/qonversion/android/sdk/dto/experiments/QExperiment;->copy(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroup;)Lcom/qonversion/android/sdk/dto/experiments/QExperiment;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/experiments/QExperiment;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/experiments/QExperiment;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroup;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/experiments/QExperiment;->group:Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroup;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroup;)Lcom/qonversion/android/sdk/dto/experiments/QExperiment;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Lhb/o;
            name = "uid"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lhb/o;
            name = "name"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroup;
        .annotation runtime Lhb/o;
            name = "group"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "group"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/qonversion/android/sdk/dto/experiments/QExperiment;

    invoke-direct {v0, p1, p2, p3}, Lcom/qonversion/android/sdk/dto/experiments/QExperiment;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroup;)V

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
    instance-of v1, p1, Lcom/qonversion/android/sdk/dto/experiments/QExperiment;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/qonversion/android/sdk/dto/experiments/QExperiment;

    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/experiments/QExperiment;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/qonversion/android/sdk/dto/experiments/QExperiment;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/experiments/QExperiment;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/qonversion/android/sdk/dto/experiments/QExperiment;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/experiments/QExperiment;->group:Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroup;

    iget-object p1, p1, Lcom/qonversion/android/sdk/dto/experiments/QExperiment;->group:Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroup;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getGroup()Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroup;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/experiments/QExperiment;->group:Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroup;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/experiments/QExperiment;->id:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/experiments/QExperiment;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/experiments/QExperiment;->id:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, Lcom/qonversion/android/sdk/dto/experiments/QExperiment;->name:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, LN0/a;->c(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/experiments/QExperiment;->group:Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroup;

    .line 17
    .line 18
    invoke-virtual {v1}, Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroup;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    add-int/2addr v1, v0

    .line 23
    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/experiments/QExperiment;->id:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/experiments/QExperiment;->name:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/qonversion/android/sdk/dto/experiments/QExperiment;->group:Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroup;

    .line 6
    .line 7
    const-string v3, "QExperiment(id="

    .line 8
    .line 9
    const-string v4, ", name="

    .line 10
    .line 11
    const-string v5, ", group="

    .line 12
    .line 13
    invoke-static {v3, v0, v4, v1, v5}, LA7/p0;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ")"

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0
.end method
