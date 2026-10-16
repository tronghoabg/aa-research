.class public final Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008/\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u000f\u0008\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u008f\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0008\u0012\u000c\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u001b\u00a2\u0006\u0002\u0010\u001dJ\t\u00106\u001a\u00020\u0006H\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010:\u001a\u00020\u0018H\u00c6\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\u000f\u0010<\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u001bH\u00c6\u0003J\t\u0010=\u001a\u00020\u0008H\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\u000e\u0010?\u001a\u00020\u000bH\u00c0\u0003\u00a2\u0006\u0002\u0008@J\t\u0010A\u001a\u00020\rH\u00c6\u0003J\t\u0010B\u001a\u00020\u0006H\u00c6\u0003J\t\u0010C\u001a\u00020\u0010H\u00c6\u0003J\t\u0010D\u001a\u00020\u0012H\u00c6\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\u00b1\u0001\u0010F\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00122\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00182\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00082\u000e\u0008\u0002\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u001bH\u00c6\u0001J\u0013\u0010G\u001a\u00020\u000b2\u0008\u0010H\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010I\u001a\u00020\u0012H\u00d6\u0001J\t\u0010J\u001a\u00020\u0006H\u00d6\u0001R\u0014\u0010\n\u001a\u00020\u000bX\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001fR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010!R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010!R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010!R\u0011\u0010\u0017\u001a\u00020\u0018\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010%R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\'R\u0011\u0010(\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\u0008(\u0010\u001fR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010\'R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010!R\u0011\u0010\u000e\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010\'R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008,\u0010-R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008.\u0010/R\u0011\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00080\u00101R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00082\u0010!R\u0017\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u001b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00083\u00104R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00085\u0010!\u00a8\u0006K"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;",
        "",
        "permission",
        "Lcom/qonversion/android/sdk/internal/dto/QPermission;",
        "(Lcom/qonversion/android/sdk/internal/dto/QPermission;)V",
        "id",
        "",
        "startedDate",
        "Ljava/util/Date;",
        "expirationDate",
        "active",
        "",
        "source",
        "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;",
        "productId",
        "renewState",
        "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;",
        "renewsCount",
        "",
        "trialStartDate",
        "firstPurchaseDate",
        "lastPurchaseDate",
        "lastActivatedOfferCode",
        "grantType",
        "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;",
        "autoRenewDisableDate",
        "transactions",
        "",
        "Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;",
        "(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;ZLcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;ILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;Ljava/util/Date;Ljava/util/List;)V",
        "getActive$sdk_release",
        "()Z",
        "getAutoRenewDisableDate",
        "()Ljava/util/Date;",
        "getExpirationDate",
        "getFirstPurchaseDate",
        "getGrantType",
        "()Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;",
        "getId",
        "()Ljava/lang/String;",
        "isActive",
        "getLastActivatedOfferCode",
        "getLastPurchaseDate",
        "getProductId",
        "getRenewState",
        "()Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;",
        "getRenewsCount",
        "()I",
        "getSource",
        "()Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;",
        "getStartedDate",
        "getTransactions",
        "()Ljava/util/List;",
        "getTrialStartDate",
        "component1",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component2",
        "component3",
        "component4",
        "component4$sdk_release",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "equals",
        "other",
        "hashCode",
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
.field private final active:Z

.field private final autoRenewDisableDate:Ljava/util/Date;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final expirationDate:Ljava/util/Date;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final firstPurchaseDate:Ljava/util/Date;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final grantType:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final id:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final lastActivatedOfferCode:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final lastPurchaseDate:Ljava/util/Date;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final productId:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final renewState:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final renewsCount:I

.field private final source:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final startedDate:Ljava/util/Date;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final transactions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final trialStartDate:Ljava/util/Date;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/dto/QPermission;)V
    .locals 17
    .param p1    # Lcom/qonversion/android/sdk/internal/dto/QPermission;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "permission"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/dto/QPermission;->getPermissionID()Ljava/lang/String;

    move-result-object v2

    .line 18
    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/dto/QPermission;->getStartedDate()Ljava/util/Date;

    move-result-object v3

    .line 19
    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/dto/QPermission;->getExpirationDate()Ljava/util/Date;

    move-result-object v4

    .line 20
    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/dto/QPermission;->isActive()Z

    move-result v5

    .line 21
    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/dto/QPermission;->getSource()Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;

    move-result-object v6

    .line 22
    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/dto/QPermission;->getProductID()Ljava/lang/String;

    move-result-object v7

    .line 23
    sget-object v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;->Companion:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState$Companion;

    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/dto/QPermission;->getRenewState()Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;

    move-result-object v8

    invoke-virtual {v0, v8}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState$Companion;->fromProductRenewState$sdk_release(Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;)Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;

    move-result-object v8

    .line 24
    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/dto/QPermission;->getRenewsCount()I

    move-result v9

    .line 25
    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/dto/QPermission;->getTrialStartDate()Ljava/util/Date;

    move-result-object v10

    .line 26
    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/dto/QPermission;->getFirstPurchaseDate()Ljava/util/Date;

    move-result-object v11

    .line 27
    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/dto/QPermission;->getLastPurchaseDate()Ljava/util/Date;

    move-result-object v12

    .line 28
    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/dto/QPermission;->getLastActivatedOfferCode()Ljava/lang/String;

    move-result-object v13

    .line 29
    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/dto/QPermission;->getGrantType()Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;

    move-result-object v14

    .line 30
    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/dto/QPermission;->getAutoRenewDisableDate()Ljava/util/Date;

    move-result-object v15

    .line 31
    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/dto/QPermission;->getTransactions()Ljava/util/List;

    move-result-object v16

    move-object/from16 v1, p0

    .line 32
    invoke-direct/range {v1 .. v16}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;-><init>(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;ZLcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;ILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;Ljava/util/Date;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;ZLcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;ILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;Ljava/util/Date;Ljava/util/List;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/Date;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/Date;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p9    # Ljava/util/Date;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p10    # Ljava/util/Date;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p11    # Ljava/util/Date;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p12    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p13    # Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p14    # Ljava/util/Date;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p15    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Z",
            "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;",
            "I",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;",
            "Ljava/util/Date;",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p13

    move-object/from16 v1, p15

    const-string v2, "id"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "startedDate"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "source"

    invoke-static {p5, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "productId"

    invoke-static {p6, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "renewState"

    invoke-static {p7, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "grantType"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "transactions"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->id:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->startedDate:Ljava/util/Date;

    .line 4
    iput-object p3, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->expirationDate:Ljava/util/Date;

    .line 5
    iput-boolean p4, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->active:Z

    .line 6
    iput-object p5, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->source:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;

    .line 7
    iput-object p6, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->productId:Ljava/lang/String;

    .line 8
    iput-object p7, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->renewState:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;

    .line 9
    iput p8, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->renewsCount:I

    .line 10
    iput-object p9, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->trialStartDate:Ljava/util/Date;

    .line 11
    iput-object p10, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->firstPurchaseDate:Ljava/util/Date;

    .line 12
    iput-object p11, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->lastPurchaseDate:Ljava/util/Date;

    .line 13
    iput-object p12, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->lastActivatedOfferCode:Ljava/lang/String;

    .line 14
    iput-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->grantType:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;

    move-object/from16 p1, p14

    .line 15
    iput-object p1, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->autoRenewDisableDate:Ljava/util/Date;

    .line 16
    iput-object v1, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->transactions:Ljava/util/List;

    return-void
.end method

.method public static synthetic copy$default(Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;ZLcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;ILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;Ljava/util/Date;Ljava/util/List;ILjava/lang/Object;)Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p16

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->startedDate:Ljava/util/Date;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->expirationDate:Ljava/util/Date;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-boolean v5, v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->active:Z

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->source:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->productId:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->renewState:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget v9, v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->renewsCount:I

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->trialStartDate:Ljava/util/Date;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->firstPurchaseDate:Ljava/util/Date;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->lastPurchaseDate:Ljava/util/Date;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->lastActivatedOfferCode:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->grantType:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->autoRenewDisableDate:Ljava/util/Date;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    and-int/lit16 v1, v1, 0x4000

    if-eqz v1, :cond_e

    iget-object v1, v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->transactions:Ljava/util/List;

    move-object/from16 p16, v1

    :goto_e
    move-object/from16 p1, v0

    move-object/from16 p2, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    goto :goto_f

    :cond_e
    move-object/from16 p16, p15

    goto :goto_e

    :goto_f
    invoke-virtual/range {p1 .. p16}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->copy(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;ZLcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;ILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;Ljava/util/Date;Ljava/util/List;)Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/util/Date;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->firstPurchaseDate:Ljava/util/Date;

    return-object v0
.end method

.method public final component11()Ljava/util/Date;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->lastPurchaseDate:Ljava/util/Date;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->lastActivatedOfferCode:Ljava/lang/String;

    return-object v0
.end method

.method public final component13()Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->grantType:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;

    return-object v0
.end method

.method public final component14()Ljava/util/Date;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->autoRenewDisableDate:Ljava/util/Date;

    return-object v0
.end method

.method public final component15()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->transactions:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Ljava/util/Date;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->startedDate:Ljava/util/Date;

    return-object v0
.end method

.method public final component3()Ljava/util/Date;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->expirationDate:Ljava/util/Date;

    return-object v0
.end method

.method public final component4$sdk_release()Z
    .locals 1

    iget-boolean v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->active:Z

    return v0
.end method

.method public final component5()Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->source:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->productId:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->renewState:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;

    return-object v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->renewsCount:I

    return v0
.end method

.method public final component9()Ljava/util/Date;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->trialStartDate:Ljava/util/Date;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;ZLcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;ILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;Ljava/util/Date;Ljava/util/List;)Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;
    .locals 17
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/Date;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/Date;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p9    # Ljava/util/Date;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p10    # Ljava/util/Date;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p11    # Ljava/util/Date;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p12    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p13    # Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p14    # Ljava/util/Date;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p15    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Z",
            "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;",
            "I",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;",
            "Ljava/util/Date;",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;",
            ">;)",
            "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "id"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "startedDate"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "productId"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "renewState"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "grantType"

    move-object/from16 v14, p13

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transactions"

    move-object/from16 v1, p15

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;

    move-object/from16 v4, p3

    move/from16 v5, p4

    move/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    invoke-direct/range {v1 .. v16}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;-><init>(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;ZLcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;ILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;Ljava/util/Date;Ljava/util/List;)V

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
    instance-of v1, p1, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;

    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->startedDate:Ljava/util/Date;

    iget-object v3, p1, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->startedDate:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->expirationDate:Ljava/util/Date;

    iget-object v3, p1, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->expirationDate:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->active:Z

    iget-boolean v3, p1, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->active:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->source:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;

    iget-object v3, p1, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->source:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->productId:Ljava/lang/String;

    iget-object v3, p1, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->productId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->renewState:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;

    iget-object v3, p1, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->renewState:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->renewsCount:I

    iget v3, p1, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->renewsCount:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->trialStartDate:Ljava/util/Date;

    iget-object v3, p1, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->trialStartDate:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->firstPurchaseDate:Ljava/util/Date;

    iget-object v3, p1, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->firstPurchaseDate:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->lastPurchaseDate:Ljava/util/Date;

    iget-object v3, p1, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->lastPurchaseDate:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->lastActivatedOfferCode:Ljava/lang/String;

    iget-object v3, p1, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->lastActivatedOfferCode:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->grantType:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;

    iget-object v3, p1, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->grantType:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->autoRenewDisableDate:Ljava/util/Date;

    iget-object v3, p1, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->autoRenewDisableDate:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->transactions:Ljava/util/List;

    iget-object p1, p1, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->transactions:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_10

    return v2

    :cond_10
    return v0
.end method

.method public final getActive$sdk_release()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->active:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getAutoRenewDisableDate()Ljava/util/Date;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->autoRenewDisableDate:Ljava/util/Date;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getExpirationDate()Ljava/util/Date;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->expirationDate:Ljava/util/Date;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getFirstPurchaseDate()Ljava/util/Date;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->firstPurchaseDate:Ljava/util/Date;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getGrantType()Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->grantType:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->id:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getLastActivatedOfferCode()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->lastActivatedOfferCode:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getLastPurchaseDate()Ljava/util/Date;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->lastPurchaseDate:Ljava/util/Date;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getProductId()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->productId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getRenewState()Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->renewState:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getRenewsCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->renewsCount:I

    .line 2
    .line 3
    return v0
.end method

.method public final getSource()Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->source:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getStartedDate()Ljava/util/Date;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->startedDate:Ljava/util/Date;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTransactions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->transactions:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTrialStartDate()Ljava/util/Date;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->trialStartDate:Ljava/util/Date;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->id:Ljava/lang/String;

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
    iget-object v2, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->startedDate:Ljava/util/Date;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->expirationDate:Ljava/util/Date;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    move v0, v3

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v0}, Ljava/util/Date;->hashCode()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    :goto_0
    add-int/2addr v2, v0

    .line 30
    mul-int/2addr v2, v1

    .line 31
    iget-boolean v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->active:Z

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    const/16 v0, 0x4cf

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const/16 v0, 0x4d5

    .line 39
    .line 40
    :goto_1
    add-int/2addr v2, v0

    .line 41
    mul-int/2addr v2, v1

    .line 42
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->source:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    add-int/2addr v0, v2

    .line 49
    mul-int/2addr v0, v1

    .line 50
    iget-object v2, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->productId:Ljava/lang/String;

    .line 51
    .line 52
    invoke-static {v0, v1, v2}, LN0/a;->c(IILjava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iget-object v2, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->renewState:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;

    .line 57
    .line 58
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    add-int/2addr v2, v0

    .line 63
    mul-int/2addr v2, v1

    .line 64
    iget v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->renewsCount:I

    .line 65
    .line 66
    add-int/2addr v2, v0

    .line 67
    mul-int/2addr v2, v1

    .line 68
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->trialStartDate:Ljava/util/Date;

    .line 69
    .line 70
    if-nez v0, :cond_2

    .line 71
    .line 72
    move v0, v3

    .line 73
    goto :goto_2

    .line 74
    :cond_2
    invoke-virtual {v0}, Ljava/util/Date;->hashCode()I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    :goto_2
    add-int/2addr v2, v0

    .line 79
    mul-int/2addr v2, v1

    .line 80
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->firstPurchaseDate:Ljava/util/Date;

    .line 81
    .line 82
    if-nez v0, :cond_3

    .line 83
    .line 84
    move v0, v3

    .line 85
    goto :goto_3

    .line 86
    :cond_3
    invoke-virtual {v0}, Ljava/util/Date;->hashCode()I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    :goto_3
    add-int/2addr v2, v0

    .line 91
    mul-int/2addr v2, v1

    .line 92
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->lastPurchaseDate:Ljava/util/Date;

    .line 93
    .line 94
    if-nez v0, :cond_4

    .line 95
    .line 96
    move v0, v3

    .line 97
    goto :goto_4

    .line 98
    :cond_4
    invoke-virtual {v0}, Ljava/util/Date;->hashCode()I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    :goto_4
    add-int/2addr v2, v0

    .line 103
    mul-int/2addr v2, v1

    .line 104
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->lastActivatedOfferCode:Ljava/lang/String;

    .line 105
    .line 106
    if-nez v0, :cond_5

    .line 107
    .line 108
    move v0, v3

    .line 109
    goto :goto_5

    .line 110
    :cond_5
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    :goto_5
    add-int/2addr v2, v0

    .line 115
    mul-int/2addr v2, v1

    .line 116
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->grantType:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;

    .line 117
    .line 118
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    add-int/2addr v0, v2

    .line 123
    mul-int/2addr v0, v1

    .line 124
    iget-object v2, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->autoRenewDisableDate:Ljava/util/Date;

    .line 125
    .line 126
    if-nez v2, :cond_6

    .line 127
    .line 128
    goto :goto_6

    .line 129
    :cond_6
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    :goto_6
    add-int/2addr v0, v3

    .line 134
    mul-int/2addr v0, v1

    .line 135
    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->transactions:Ljava/util/List;

    .line 136
    .line 137
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    add-int/2addr v1, v0

    .line 142
    return v1
.end method

.method public final isActive()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->active:Z

    .line 2
    .line 3
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 17
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->id:Ljava/lang/String;

    iget-object v2, v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->startedDate:Ljava/util/Date;

    iget-object v3, v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->expirationDate:Ljava/util/Date;

    iget-boolean v4, v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->active:Z

    iget-object v5, v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->source:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;

    iget-object v6, v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->productId:Ljava/lang/String;

    iget-object v7, v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->renewState:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;

    iget v8, v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->renewsCount:I

    iget-object v9, v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->trialStartDate:Ljava/util/Date;

    iget-object v10, v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->firstPurchaseDate:Ljava/util/Date;

    iget-object v11, v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->lastPurchaseDate:Ljava/util/Date;

    iget-object v12, v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->lastActivatedOfferCode:Ljava/lang/String;

    iget-object v13, v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->grantType:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;

    iget-object v14, v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->autoRenewDisableDate:Ljava/util/Date;

    iget-object v15, v0, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->transactions:Ljava/util/List;

    new-instance v0, Ljava/lang/StringBuilder;

    move-object/from16 v16, v15

    const-string v15, "QEntitlement(id="

    invoke-direct {v0, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", startedDate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", expirationDate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", active="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", source="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", productId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", renewState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", renewsCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", trialStartDate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", firstPurchaseDate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", lastPurchaseDate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", lastActivatedOfferCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", grantType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", autoRenewDisableDate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", transactions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
