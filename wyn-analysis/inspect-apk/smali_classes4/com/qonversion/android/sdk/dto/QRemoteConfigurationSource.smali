.class public final Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lhb/s;
    generateAdapter = true
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B9\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0008\u0012\n\u0008\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0008H\u00c6\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c0\u0003\u00a2\u0006\u0002\u0008\u001aJ=\u0010\u001b\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0003\u0010\u0007\u001a\u00020\u00082\n\u0008\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001J\t\u0010!\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0016\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\""
    }
    d2 = {
        "Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;",
        "",
        "id",
        "",
        "name",
        "assignmentType",
        "Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;",
        "type",
        "Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType;",
        "contextKeyApi",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType;Ljava/lang/String;)V",
        "getAssignmentType",
        "()Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;",
        "contextKey",
        "getContextKey",
        "()Ljava/lang/String;",
        "getContextKeyApi$sdk_release",
        "getId",
        "getName",
        "getType",
        "()Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component5$sdk_release",
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
.field private final assignmentType:Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final contextKey:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final contextKeyApi:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
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

.field private final type:Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType;Ljava/lang/String;)V
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
    .param p3    # Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;
        .annotation runtime Lhb/o;
            name = "assignment_type"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType;
        .annotation runtime Lhb/o;
            name = "type"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lhb/o;
            name = "context_key"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/Nullable;
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
    const-string v0, "assignmentType"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "type"

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
    iput-object p1, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->id:Ljava/lang/String;

    .line 25
    .line 26
    iput-object p2, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->name:Ljava/lang/String;

    .line 27
    .line 28
    iput-object p3, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->assignmentType:Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;

    .line 29
    .line 30
    iput-object p4, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->type:Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType;

    .line 31
    .line 32
    iput-object p5, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->contextKeyApi:Ljava/lang/String;

    .line 33
    .line 34
    const/4 p1, 0x0

    .line 35
    if-eqz p5, :cond_0

    .line 36
    .line 37
    invoke-interface {p5}, Ljava/lang/CharSequence;->length()I

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    if-lez p2, :cond_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    move-object p5, p1

    .line 45
    :goto_0
    iput-object p5, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->contextKey:Ljava/lang/String;

    .line 46
    .line 47
    return-void
.end method

.method public static synthetic copy$default(Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType;Ljava/lang/String;ILjava/lang/Object;)Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->name:Ljava/lang/String;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->assignmentType:Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->type:Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->contextKeyApi:Ljava/lang/String;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->copy(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType;Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->assignmentType:Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;

    return-object v0
.end method

.method public final component4()Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->type:Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType;

    return-object v0
.end method

.method public final component5$sdk_release()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->contextKeyApi:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType;Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;
    .locals 7
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
    .param p3    # Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;
        .annotation runtime Lhb/o;
            name = "assignment_type"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType;
        .annotation runtime Lhb/o;
            name = "type"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lhb/o;
            name = "context_key"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "assignmentType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType;Ljava/lang/String;)V

    return-object v1
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
    instance-of v1, p1, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;

    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->assignmentType:Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;

    iget-object v3, p1, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->assignmentType:Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->type:Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType;

    iget-object v3, p1, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->type:Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->contextKeyApi:Ljava/lang/String;

    iget-object p1, p1, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->contextKeyApi:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getAssignmentType()Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->assignmentType:Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getContextKey()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->contextKey:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getContextKeyApi$sdk_release()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->contextKeyApi:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->id:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getType()Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->type:Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->id:Ljava/lang/String;

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
    iget-object v2, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->name:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, LN0/a;->c(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->assignmentType:Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    add-int/2addr v2, v0

    .line 23
    mul-int/2addr v2, v1

    .line 24
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->type:Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    add-int/2addr v0, v2

    .line 31
    mul-int/2addr v0, v1

    .line 32
    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->contextKeyApi:Ljava/lang/String;

    .line 33
    .line 34
    if-nez v1, :cond_0

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    :goto_0
    add-int/2addr v0, v1

    .line 43
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->id:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->name:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->assignmentType:Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->type:Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->contextKeyApi:Ljava/lang/String;

    .line 10
    .line 11
    const-string v5, "QRemoteConfigurationSource(id="

    .line 12
    .line 13
    const-string v6, ", name="

    .line 14
    .line 15
    const-string v7, ", assignmentType="

    .line 16
    .line 17
    invoke-static {v5, v0, v6, v1, v7}, LA7/p0;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v1, ", type="

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v1, ", contextKeyApi="

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v1, ")"

    .line 38
    .line 39
    invoke-static {v0, v4, v1}, Lwg/b;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    return-object v0
.end method
