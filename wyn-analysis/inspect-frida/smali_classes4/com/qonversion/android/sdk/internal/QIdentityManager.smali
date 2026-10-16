.class public final Lcom/qonversion/android/sdk/internal/QIdentityManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\u0000\u0018\u00002\u00020\u0001B\u0019\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\u000c2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0013R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00088F\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/QIdentityManager;",
        "",
        "Lcom/qonversion/android/sdk/internal/repository/QRepository;",
        "repository",
        "Lcom/qonversion/android/sdk/internal/services/QUserInfoService;",
        "userInfoService",
        "<init>",
        "(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/services/QUserInfoService;)V",
        "",
        "userID",
        "Lcom/qonversion/android/sdk/internal/IdentityManagerCallback;",
        "callback",
        "Lef/C;",
        "identify",
        "(Ljava/lang/String;Lcom/qonversion/android/sdk/internal/IdentityManagerCallback;)V",
        "",
        "logoutIfNeeded",
        "()Z",
        "Lcom/qonversion/android/sdk/internal/repository/QRepository;",
        "Lcom/qonversion/android/sdk/internal/services/QUserInfoService;",
        "getCurrentPartnersIdentityId",
        "()Ljava/lang/String;",
        "currentPartnersIdentityId",
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
.field private final repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final userInfoService:Lcom/qonversion/android/sdk/internal/services/QUserInfoService;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/services/QUserInfoService;)V
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/internal/repository/QRepository;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/internal/services/QUserInfoService;
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
    const-string v0, "userInfoService"

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
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QIdentityManager;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QIdentityManager;->userInfoService:Lcom/qonversion/android/sdk/internal/services/QUserInfoService;

    .line 17
    .line 18
    return-void
.end method

.method public static final synthetic access$getUserInfoService$p(Lcom/qonversion/android/sdk/internal/QIdentityManager;)Lcom/qonversion/android/sdk/internal/services/QUserInfoService;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/qonversion/android/sdk/internal/QIdentityManager;->userInfoService:Lcom/qonversion/android/sdk/internal/services/QUserInfoService;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final getCurrentPartnersIdentityId()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QIdentityManager;->userInfoService:Lcom/qonversion/android/sdk/internal/services/QUserInfoService;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;->getPartnersIdentityId()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final identify(Ljava/lang/String;Lcom/qonversion/android/sdk/internal/IdentityManagerCallback;)V
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/internal/IdentityManagerCallback;
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
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QIdentityManager;->userInfoService:Lcom/qonversion/android/sdk/internal/services/QUserInfoService;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;->obtainUserID()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QIdentityManager;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    .line 18
    .line 19
    new-instance v2, Lcom/qonversion/android/sdk/internal/QIdentityManager$identify$1;

    .line 20
    .line 21
    invoke-direct {v2, p0, p1, p2}, Lcom/qonversion/android/sdk/internal/QIdentityManager$identify$1;-><init>(Lcom/qonversion/android/sdk/internal/QIdentityManager;Ljava/lang/String;Lcom/qonversion/android/sdk/internal/IdentityManagerCallback;)V

    .line 22
    .line 23
    .line 24
    new-instance v3, Lcom/qonversion/android/sdk/internal/QIdentityManager$identify$2;

    .line 25
    .line 26
    invoke-direct {v3, p2}, Lcom/qonversion/android/sdk/internal/QIdentityManager$identify$2;-><init>(Lcom/qonversion/android/sdk/internal/IdentityManagerCallback;)V

    .line 27
    .line 28
    .line 29
    invoke-interface {v1, p1, v0, v2, v3}, Lcom/qonversion/android/sdk/internal/repository/QRepository;->identify(Ljava/lang/String;Ljava/lang/String;Ltf/l;Ltf/l;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final logoutIfNeeded()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QIdentityManager;->userInfoService:Lcom/qonversion/android/sdk/internal/services/QUserInfoService;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;->logoutIfNeeded()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
