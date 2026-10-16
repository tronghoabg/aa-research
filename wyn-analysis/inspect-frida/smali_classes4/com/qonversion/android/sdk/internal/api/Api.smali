.class public interface abstract Lcom/qonversion/android/sdk/internal/api/Api;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/internal/api/Api$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00be\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008`\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u00070\u00062\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0004H\'\u00a2\u0006\u0004\u0008\t\u0010\nJ9\u0010\u000e\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u00070\u00062\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u000b2\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0001\u0010\r\u001a\u00020\u000cH\'\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ/\u0010\u0011\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u00070\u00062\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00102\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0004H\'\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J%\u0010\u0015\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00140\u00070\u00062\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0013H\'\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J%\u0010\u0019\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00180\u00070\u00062\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0017H\'\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ%\u0010\u001e\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001d0\u001c0\u00062\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u001bH\'\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ%\u0010\"\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020!0\u001c0\u00062\u0008\u0008\u0001\u0010 \u001a\u00020\u0004H\'\u00a2\u0006\u0004\u0008\"\u0010#J)\u0010&\u001a\u0008\u0012\u0004\u0012\u00020%0\u00062\u0008\u0008\u0001\u0010 \u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020$H\'\u00a2\u0006\u0004\u0008&\u0010\'J;\u0010,\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020+0\u001c0\u00062\u0008\u0008\u0001\u0010(\u001a\u00020\u00042\u0014\u0008\u0001\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040)H\'\u00a2\u0006\u0004\u0008,\u0010-J)\u00100\u001a\u0008\u0012\u0004\u0012\u00020%0\u00062\u0008\u0008\u0001\u0010\u0003\u001a\u00020.2\u0008\u0008\u0003\u0010/\u001a\u00020\u0004H\'\u00a2\u0006\u0004\u00080\u00101J+\u00104\u001a\u0008\u0012\u0004\u0012\u0002030\u00062\u0008\u0008\u0001\u0010(\u001a\u00020\u00042\n\u0008\u0001\u00102\u001a\u0004\u0018\u00010\u0004H\'\u00a2\u0006\u0004\u00084\u00105J/\u00109\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u000203080\u00062\u0008\u0008\u0001\u0010(\u001a\u00020\u00042\u0008\u0008\u0003\u00107\u001a\u000206H\'\u00a2\u0006\u0004\u00089\u0010:J?\u00109\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u000203080\u00062\u0008\u0008\u0001\u0010(\u001a\u00020\u00042\u000e\u0008\u0001\u0010;\u001a\u0008\u0012\u0004\u0012\u00020\u0004082\u0008\u0008\u0001\u0010<\u001a\u000206H\'\u00a2\u0006\u0004\u00089\u0010=J3\u0010@\u001a\u0008\u0012\u0004\u0012\u00020%0\u00062\u0008\u0008\u0001\u0010>\u001a\u00020\u00042\u0008\u0008\u0001\u0010(\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020?H\'\u00a2\u0006\u0004\u0008@\u0010AJ)\u0010B\u001a\u0008\u0012\u0004\u0012\u00020%0\u00062\u0008\u0008\u0001\u0010>\u001a\u00020\u00042\u0008\u0008\u0001\u0010(\u001a\u00020\u0004H\'\u00a2\u0006\u0004\u0008B\u00105J)\u0010C\u001a\u0008\u0012\u0004\u0012\u00020%0\u00062\u0008\u0008\u0001\u0010>\u001a\u00020\u00042\u0008\u0008\u0001\u0010(\u001a\u00020\u0004H\'\u00a2\u0006\u0004\u0008C\u00105J)\u0010D\u001a\u0008\u0012\u0004\u0012\u00020%0\u00062\u0008\u0008\u0001\u0010>\u001a\u00020\u00042\u0008\u0008\u0001\u0010(\u001a\u00020\u0004H\'\u00a2\u0006\u0004\u0008D\u00105J/\u0010H\u001a\u0008\u0012\u0004\u0012\u00020G0\u00062\u0008\u0008\u0001\u0010(\u001a\u00020\u00042\u000e\u0008\u0001\u0010F\u001a\u0008\u0012\u0004\u0012\u00020E08H\'\u00a2\u0006\u0004\u0008H\u0010IJ%\u0010K\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020J080\u00062\u0008\u0008\u0001\u0010(\u001a\u00020\u0004H\'\u00a2\u0006\u0004\u0008K\u0010#\u00a8\u0006L"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/api/Api;",
        "",
        "Lcom/qonversion/android/sdk/internal/dto/request/InitRequest;",
        "request",
        "",
        "trigger",
        "Lzg/c;",
        "Lcom/qonversion/android/sdk/internal/dto/BaseResponse;",
        "Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;",
        "init",
        "(Lcom/qonversion/android/sdk/internal/dto/request/InitRequest;Ljava/lang/String;)Lzg/c;",
        "Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequest;",
        "",
        "attemptNumber",
        "purchase",
        "(Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequest;Ljava/lang/String;I)Lzg/c;",
        "Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;",
        "restore",
        "(Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;Ljava/lang/String;)Lzg/c;",
        "Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;",
        "Lcom/qonversion/android/sdk/internal/dto/Response;",
        "attribution",
        "(Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;)Lzg/c;",
        "Lcom/qonversion/android/sdk/internal/dto/request/EligibilityRequest;",
        "Lcom/qonversion/android/sdk/internal/dto/eligibility/EligibilityResult;",
        "eligibility",
        "(Lcom/qonversion/android/sdk/internal/dto/request/EligibilityRequest;)Lzg/c;",
        "Lcom/qonversion/android/sdk/internal/dto/request/IdentityRequest;",
        "Lcom/qonversion/android/sdk/internal/dto/Data;",
        "Lcom/qonversion/android/sdk/internal/dto/identity/IdentityResult;",
        "identify",
        "(Lcom/qonversion/android/sdk/internal/dto/request/IdentityRequest;)Lzg/c;",
        "screenId",
        "Lcom/qonversion/android/sdk/internal/dto/automations/Screen;",
        "screens",
        "(Ljava/lang/String;)Lzg/c;",
        "Lcom/qonversion/android/sdk/internal/dto/request/ViewsRequest;",
        "Ljava/lang/Void;",
        "views",
        "(Ljava/lang/String;Lcom/qonversion/android/sdk/internal/dto/request/ViewsRequest;)Lzg/c;",
        "userId",
        "",
        "params",
        "Lcom/qonversion/android/sdk/internal/dto/ActionPoints;",
        "actionPoints",
        "(Ljava/lang/String;Ljava/util/Map;)Lzg/c;",
        "Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;",
        "url",
        "crashLogs",
        "(Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;Ljava/lang/String;)Lzg/c;",
        "contextKey",
        "Lcom/qonversion/android/sdk/dto/QRemoteConfig;",
        "remoteConfig",
        "(Ljava/lang/String;Ljava/lang/String;)Lzg/c;",
        "",
        "allContextKeys",
        "",
        "remoteConfigList",
        "(Ljava/lang/String;Z)Lzg/c;",
        "contextKeys",
        "includeEmptyContextKey",
        "(Ljava/lang/String;Ljava/util/List;Z)Lzg/c;",
        "experimentId",
        "Lcom/qonversion/android/sdk/internal/dto/request/AttachUserRequest;",
        "attachUserToExperiment",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/internal/dto/request/AttachUserRequest;)Lzg/c;",
        "detachUserFromExperiment",
        "attachUserToRemoteConfiguration",
        "detachUserFromRemoteConfiguration",
        "Lcom/qonversion/android/sdk/internal/dto/request/data/UserPropertyRequestData;",
        "properties",
        "Lcom/qonversion/android/sdk/internal/dto/SendPropertiesResult;",
        "sendProperties",
        "(Ljava/lang/String;Ljava/util/List;)Lzg/c;",
        "Lcom/qonversion/android/sdk/dto/properties/QUserProperty;",
        "getProperties",
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


# virtual methods
.method public abstract actionPoints(Ljava/lang/String;Ljava/util/Map;)Lzg/c;
    .param p1    # Ljava/lang/String;
        .annotation runtime LBg/s;
            value = "id"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/Map;
        .annotation runtime LBg/u;
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime LBg/f;
        value = "v2/users/{id}/action-points"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lzg/c<",
            "Lcom/qonversion/android/sdk/internal/dto/Data<",
            "Lcom/qonversion/android/sdk/internal/dto/ActionPoints;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract attachUserToExperiment(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/internal/dto/request/AttachUserRequest;)Lzg/c;
    .param p1    # Ljava/lang/String;
        .annotation runtime LBg/s;
            value = "id"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime LBg/s;
            value = "user_id"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/qonversion/android/sdk/internal/dto/request/AttachUserRequest;
        .annotation runtime LBg/a;
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime LBg/o;
        value = "v3/experiments/{id}/users/{user_id}"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/internal/dto/request/AttachUserRequest;",
            ")",
            "Lzg/c<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract attachUserToRemoteConfiguration(Ljava/lang/String;Ljava/lang/String;)Lzg/c;
    .param p1    # Ljava/lang/String;
        .annotation runtime LBg/s;
            value = "id"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime LBg/s;
            value = "user_id"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime LBg/o;
        value = "v3/remote-configurations/{id}/users/{user_id}"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lzg/c<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract attribution(Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;)Lzg/c;
    .param p1    # Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;
        .annotation runtime LBg/a;
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime LBg/o;
        value = "attribution"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;",
            ")",
            "Lzg/c<",
            "Lcom/qonversion/android/sdk/internal/dto/BaseResponse<",
            "Lcom/qonversion/android/sdk/internal/dto/Response;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract crashLogs(Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;Ljava/lang/String;)Lzg/c;
    .param p1    # Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;
        .annotation runtime LBg/a;
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime LBg/y;
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime LBg/k;
        value = {
            "Content-Type: application/json"
        }
    .end annotation

    .annotation runtime LBg/o;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;",
            "Ljava/lang/String;",
            ")",
            "Lzg/c<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract detachUserFromExperiment(Ljava/lang/String;Ljava/lang/String;)Lzg/c;
    .param p1    # Ljava/lang/String;
        .annotation runtime LBg/s;
            value = "id"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime LBg/s;
            value = "user_id"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime LBg/b;
        value = "v3/experiments/{id}/users/{user_id}"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lzg/c<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract detachUserFromRemoteConfiguration(Ljava/lang/String;Ljava/lang/String;)Lzg/c;
    .param p1    # Ljava/lang/String;
        .annotation runtime LBg/s;
            value = "id"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime LBg/s;
            value = "user_id"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime LBg/b;
        value = "v3/remote-configurations/{id}/users/{user_id}"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lzg/c<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract eligibility(Lcom/qonversion/android/sdk/internal/dto/request/EligibilityRequest;)Lzg/c;
    .param p1    # Lcom/qonversion/android/sdk/internal/dto/request/EligibilityRequest;
        .annotation runtime LBg/a;
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime LBg/o;
        value = "v1/products/get"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/dto/request/EligibilityRequest;",
            ")",
            "Lzg/c<",
            "Lcom/qonversion/android/sdk/internal/dto/BaseResponse<",
            "Lcom/qonversion/android/sdk/internal/dto/eligibility/EligibilityResult;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getProperties(Ljava/lang/String;)Lzg/c;
    .param p1    # Ljava/lang/String;
        .annotation runtime LBg/s;
            value = "user_id"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime LBg/f;
        value = "v3/users/{user_id}/properties"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lzg/c<",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/properties/QUserProperty;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract identify(Lcom/qonversion/android/sdk/internal/dto/request/IdentityRequest;)Lzg/c;
    .param p1    # Lcom/qonversion/android/sdk/internal/dto/request/IdentityRequest;
        .annotation runtime LBg/a;
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime LBg/o;
        value = "v2/identities"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/dto/request/IdentityRequest;",
            ")",
            "Lzg/c<",
            "Lcom/qonversion/android/sdk/internal/dto/Data<",
            "Lcom/qonversion/android/sdk/internal/dto/identity/IdentityResult;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract init(Lcom/qonversion/android/sdk/internal/dto/request/InitRequest;Ljava/lang/String;)Lzg/c;
    .param p1    # Lcom/qonversion/android/sdk/internal/dto/request/InitRequest;
        .annotation runtime LBg/a;
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime LBg/i;
            value = "Trigger"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime LBg/o;
        value = "v1/user/init"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/dto/request/InitRequest;",
            "Ljava/lang/String;",
            ")",
            "Lzg/c<",
            "Lcom/qonversion/android/sdk/internal/dto/BaseResponse<",
            "Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract purchase(Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequest;Ljava/lang/String;I)Lzg/c;
    .param p1    # Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequest;
        .annotation runtime LBg/a;
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime LBg/i;
            value = "Trigger"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime LBg/i;
            value = "Attempt"
        .end annotation
    .end param
    .annotation runtime LBg/o;
        value = "v1/user/purchase"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequest;",
            "Ljava/lang/String;",
            "I)",
            "Lzg/c<",
            "Lcom/qonversion/android/sdk/internal/dto/BaseResponse<",
            "Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract remoteConfig(Ljava/lang/String;Ljava/lang/String;)Lzg/c;
    .param p1    # Ljava/lang/String;
        .annotation runtime LBg/t;
            value = "user_id"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime LBg/t;
            value = "context_key"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime LBg/f;
        value = "v3/remote-config"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lzg/c<",
            "Lcom/qonversion/android/sdk/dto/QRemoteConfig;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract remoteConfigList(Ljava/lang/String;Ljava/util/List;Z)Lzg/c;
    .param p1    # Ljava/lang/String;
        .annotation runtime LBg/t;
            value = "user_id"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation runtime LBg/t;
            value = "context_key"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Z
        .annotation runtime LBg/t;
            value = "with_empty_context_key"
        .end annotation
    .end param
    .annotation runtime LBg/f;
        value = "v3/remote-configs"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z)",
            "Lzg/c<",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/QRemoteConfig;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract remoteConfigList(Ljava/lang/String;Z)Lzg/c;
    .param p1    # Ljava/lang/String;
        .annotation runtime LBg/t;
            value = "user_id"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Z
        .annotation runtime LBg/t;
            value = "all_context_keys"
        .end annotation
    .end param
    .annotation runtime LBg/f;
        value = "v3/remote-configs"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z)",
            "Lzg/c<",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/QRemoteConfig;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract restore(Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;Ljava/lang/String;)Lzg/c;
    .param p1    # Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;
        .annotation runtime LBg/a;
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime LBg/i;
            value = "Trigger"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime LBg/o;
        value = "v1/user/restore"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;",
            "Ljava/lang/String;",
            ")",
            "Lzg/c<",
            "Lcom/qonversion/android/sdk/internal/dto/BaseResponse<",
            "Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract screens(Ljava/lang/String;)Lzg/c;
    .param p1    # Ljava/lang/String;
        .annotation runtime LBg/s;
            value = "id"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime LBg/f;
        value = "v2/screens/{id}"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lzg/c<",
            "Lcom/qonversion/android/sdk/internal/dto/Data<",
            "Lcom/qonversion/android/sdk/internal/dto/automations/Screen;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract sendProperties(Ljava/lang/String;Ljava/util/List;)Lzg/c;
    .param p1    # Ljava/lang/String;
        .annotation runtime LBg/s;
            value = "user_id"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation runtime LBg/a;
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime LBg/o;
        value = "v3/users/{user_id}/properties"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/internal/dto/request/data/UserPropertyRequestData;",
            ">;)",
            "Lzg/c<",
            "Lcom/qonversion/android/sdk/internal/dto/SendPropertiesResult;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract views(Ljava/lang/String;Lcom/qonversion/android/sdk/internal/dto/request/ViewsRequest;)Lzg/c;
    .param p1    # Ljava/lang/String;
        .annotation runtime LBg/s;
            value = "id"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/internal/dto/request/ViewsRequest;
        .annotation runtime LBg/a;
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime LBg/o;
        value = "/v2/screens/{id}/views"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/internal/dto/request/ViewsRequest;",
            ")",
            "Lzg/c<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method
