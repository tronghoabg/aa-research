.class public final Lcom/qonversion/android/sdk/internal/services/QUserInfoService;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/internal/services/QUserInfoService$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0019\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\u0011\u0010\nJ\r\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0018\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/services/QUserInfoService;",
        "",
        "Lcom/qonversion/android/sdk/internal/storage/Cache;",
        "preferences",
        "Lcom/qonversion/android/sdk/internal/storage/TokenStorage;",
        "tokenStorage",
        "<init>",
        "(Lcom/qonversion/android/sdk/internal/storage/Cache;Lcom/qonversion/android/sdk/internal/storage/TokenStorage;)V",
        "",
        "generateRandomUserID",
        "()Ljava/lang/String;",
        "obtainUserID",
        "userID",
        "Lef/C;",
        "storeQonversionUserId",
        "(Ljava/lang/String;)V",
        "storePartnersIdentityId",
        "getPartnersIdentityId",
        "",
        "logoutIfNeeded",
        "()Z",
        "deleteUser",
        "()V",
        "Lcom/qonversion/android/sdk/internal/storage/Cache;",
        "Lcom/qonversion/android/sdk/internal/storage/TokenStorage;",
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
.field public static final Companion:Lcom/qonversion/android/sdk/internal/services/QUserInfoService$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final TEST_UID:Ljava/lang/String; = "40egafre6_e_"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final preferences:Lcom/qonversion/android/sdk/internal/storage/Cache;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final tokenStorage:Lcom/qonversion/android/sdk/internal/storage/TokenStorage;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/qonversion/android/sdk/internal/services/QUserInfoService$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/internal/services/QUserInfoService$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;->Companion:Lcom/qonversion/android/sdk/internal/services/QUserInfoService$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/qonversion/android/sdk/internal/storage/Cache;Lcom/qonversion/android/sdk/internal/storage/TokenStorage;)V
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/internal/storage/Cache;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/internal/storage/TokenStorage;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "preferences"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "tokenStorage"

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
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;->preferences:Lcom/qonversion/android/sdk/internal/storage/Cache;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;->tokenStorage:Lcom/qonversion/android/sdk/internal/storage/TokenStorage;

    .line 17
    .line 18
    return-void
.end method

.method private final generateRandomUserID()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "toString(...)"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v1, "-"

    .line 15
    .line 16
    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-string v2, "compile(...)"

    .line 21
    .line 22
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-string v1, ""

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const-string v1, "replaceAll(...)"

    .line 36
    .line 37
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const-string v1, "QON_"

    .line 41
    .line 42
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    return-object v0
.end method


# virtual methods
.method public final deleteUser()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;->preferences:Lcom/qonversion/android/sdk/internal/storage/Cache;

    .line 2
    .line 3
    const-string v1, "com.qonversion.keys.originalUserID"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-interface {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/storage/Cache;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;->preferences:Lcom/qonversion/android/sdk/internal/storage/Cache;

    .line 10
    .line 11
    const-string v1, "com.qonversion.keys.storedUserID"

    .line 12
    .line 13
    invoke-interface {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/storage/Cache;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;->preferences:Lcom/qonversion/android/sdk/internal/storage/Cache;

    .line 17
    .line 18
    const-string v1, "com.qonversion.keys.partnerIdentityUserID"

    .line 19
    .line 20
    invoke-interface {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/storage/Cache;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;->tokenStorage:Lcom/qonversion/android/sdk/internal/storage/TokenStorage;

    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/storage/TokenStorage;->delete()V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final getPartnersIdentityId()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;->preferences:Lcom/qonversion/android/sdk/internal/storage/Cache;

    .line 2
    .line 3
    const-string v1, "com.qonversion.keys.partnerIdentityUserID"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-interface {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/storage/Cache;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
.end method

.method public final logoutIfNeeded()Z
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;->preferences:Lcom/qonversion/android/sdk/internal/storage/Cache;

    .line 2
    .line 3
    const-string v1, "com.qonversion.keys.originalUserID"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-interface {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/storage/Cache;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;->preferences:Lcom/qonversion/android/sdk/internal/storage/Cache;

    .line 11
    .line 12
    const-string v3, "com.qonversion.keys.storedUserID"

    .line 13
    .line 14
    invoke-interface {v1, v3, v2}, Lcom/qonversion/android/sdk/internal/storage/Cache;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iget-object v4, p0, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;->preferences:Lcom/qonversion/android/sdk/internal/storage/Cache;

    .line 19
    .line 20
    const-string v5, "com.qonversion.keys.partnerIdentityUserID"

    .line 21
    .line 22
    invoke-interface {v4, v5, v2}, Lcom/qonversion/android/sdk/internal/storage/Cache;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    return v0

    .line 33
    :cond_0
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;->preferences:Lcom/qonversion/android/sdk/internal/storage/Cache;

    .line 34
    .line 35
    invoke-interface {v1, v3, v0}, Lcom/qonversion/android/sdk/internal/storage/Cache;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/4 v0, 0x1

    .line 39
    return v0
.end method

.method public final obtainUserID()Ljava/lang/String;
    .locals 5
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;->preferences:Lcom/qonversion/android/sdk/internal/storage/Cache;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "com.qonversion.keys.storedUserID"

    .line 5
    .line 6
    invoke-interface {v0, v2, v1}, Lcom/qonversion/android/sdk/internal/storage/Cache;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v1, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    :goto_0
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;->tokenStorage:Lcom/qonversion/android/sdk/internal/storage/TokenStorage;

    .line 22
    .line 23
    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/storage/TokenStorage;->load()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;->tokenStorage:Lcom/qonversion/android/sdk/internal/storage/TokenStorage;

    .line 28
    .line 29
    invoke-virtual {v3}, Lcom/qonversion/android/sdk/internal/storage/TokenStorage;->delete()V

    .line 30
    .line 31
    .line 32
    :goto_1
    const-string v3, "40egafre6_e_"

    .line 33
    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-nez v4, :cond_2

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_2
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-eqz v4, :cond_4

    .line 48
    .line 49
    :cond_3
    :goto_2
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;->generateRandomUserID()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    :cond_4
    if-eqz v0, :cond_7

    .line 54
    .line 55
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-nez v4, :cond_5

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_5
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_6

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_6
    return-object v1

    .line 70
    :cond_7
    :goto_3
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;->preferences:Lcom/qonversion/android/sdk/internal/storage/Cache;

    .line 71
    .line 72
    invoke-interface {v0, v2, v1}, Lcom/qonversion/android/sdk/internal/storage/Cache;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;->preferences:Lcom/qonversion/android/sdk/internal/storage/Cache;

    .line 76
    .line 77
    const-string v2, "com.qonversion.keys.originalUserID"

    .line 78
    .line 79
    invoke-interface {v0, v2, v1}, Lcom/qonversion/android/sdk/internal/storage/Cache;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    return-object v1
.end method

.method public final storePartnersIdentityId(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "userID"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;->preferences:Lcom/qonversion/android/sdk/internal/storage/Cache;

    .line 7
    .line 8
    const-string v1, "com.qonversion.keys.partnerIdentityUserID"

    .line 9
    .line 10
    invoke-interface {v0, v1, p1}, Lcom/qonversion/android/sdk/internal/storage/Cache;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final storeQonversionUserId(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "userID"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;->preferences:Lcom/qonversion/android/sdk/internal/storage/Cache;

    .line 7
    .line 8
    const-string v1, "com.qonversion.keys.storedUserID"

    .line 9
    .line 10
    invoke-interface {v0, v1, p1}, Lcom/qonversion/android/sdk/internal/storage/Cache;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
