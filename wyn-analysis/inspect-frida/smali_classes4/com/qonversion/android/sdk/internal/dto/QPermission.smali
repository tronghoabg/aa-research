.class public final Lcom/qonversion/android/sdk/internal/dto/QPermission;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lhb/s;
    generateAdapter = true
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008)\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0008\u0081\u0008\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0008\u0012\n\u0008\u0001\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0008\u0003\u0010\n\u001a\u00020\u000b\u0012\u0008\u0008\u0001\u0010\u000c\u001a\u00020\r\u0012\u0008\u0008\u0003\u0010\u000e\u001a\u00020\r\u0012\n\u0008\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0003\u0010\u0013\u001a\u00020\u0014\u0012\n\u0008\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0008\u0012\u000e\u0008\u0003\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0017\u00a2\u0006\u0002\u0010\u0019J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\u0014H\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\u000f\u00106\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0017H\u00c6\u0003J\t\u00107\u001a\u00020\u0003H\u00c6\u0003J\t\u00108\u001a\u00020\u0006H\u00c6\u0003J\t\u00109\u001a\u00020\u0008H\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\t\u0010;\u001a\u00020\u000bH\u00c6\u0003J\u000e\u0010<\u001a\u00020\rH\u00c0\u0003\u00a2\u0006\u0002\u0008=J\t\u0010>\u001a\u00020\rH\u00c6\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\u00b1\u0001\u0010@\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0003\u0010\u0007\u001a\u00020\u00082\n\u0008\u0003\u0010\t\u001a\u0004\u0018\u00010\u00082\u0008\u0008\u0003\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0003\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0003\u0010\u000e\u001a\u00020\r2\n\u0008\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00082\n\u0008\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00082\n\u0008\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00082\n\u0008\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0003\u0010\u0013\u001a\u00020\u00142\n\u0008\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00082\u000e\u0008\u0003\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0017H\u00c6\u0001J\u0013\u0010A\u001a\u00020B2\u0008\u0010C\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010D\u001a\u00020\rH\u00d6\u0001J\u0006\u0010E\u001a\u00020BJ\t\u0010F\u001a\u00020\u0003H\u00d6\u0001R\u0014\u0010\u000c\u001a\u00020\rX\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001dR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u001dR\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010!R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010#R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010#R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010#R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010(R\u0011\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010\u001bR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010+R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008,\u0010\u001dR\u0017\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0017\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010.R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u0010\u001d\u00a8\u0006G"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/dto/QPermission;",
        "",
        "permissionID",
        "",
        "productID",
        "renewState",
        "Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;",
        "startedDate",
        "Ljava/util/Date;",
        "expirationDate",
        "source",
        "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;",
        "active",
        "",
        "renewsCount",
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
        "(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;Ljava/util/Date;Ljava/util/Date;Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;IILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;Ljava/util/Date;Ljava/util/List;)V",
        "getActive$sdk_release",
        "()I",
        "getAutoRenewDisableDate",
        "()Ljava/util/Date;",
        "getExpirationDate",
        "getFirstPurchaseDate",
        "getGrantType",
        "()Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;",
        "getLastActivatedOfferCode",
        "()Ljava/lang/String;",
        "getLastPurchaseDate",
        "getPermissionID",
        "getProductID",
        "getRenewState",
        "()Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;",
        "getRenewsCount",
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
        "component5",
        "component6",
        "component7",
        "component7$sdk_release",
        "component8",
        "component9",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "isActive",
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
.field private final active:I

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

.field private final lastActivatedOfferCode:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final lastPurchaseDate:Ljava/util/Date;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final permissionID:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final productID:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final renewState:Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;
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
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;Ljava/util/Date;Ljava/util/Date;Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;IILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;Ljava/util/Date;Ljava/util/List;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation runtime Lhb/o;
            name = "id"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lhb/o;
            name = "associated_product"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;
        .annotation runtime Lhb/o;
            name = "renew_state"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/util/Date;
        .annotation runtime Lhb/o;
            name = "started_timestamp"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Ljava/util/Date;
        .annotation runtime Lhb/o;
            name = "expiration_timestamp"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;
        .annotation runtime Lhb/o;
            name = "source"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # I
        .annotation runtime Lhb/o;
            name = "active"
        .end annotation
    .end param
    .param p8    # I
        .annotation runtime Lhb/o;
            name = "renews_count"
        .end annotation
    .end param
    .param p9    # Ljava/util/Date;
        .annotation runtime Lhb/o;
            name = "trial_start_timestamp"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p10    # Ljava/util/Date;
        .annotation runtime Lhb/o;
            name = "first_purchase_timestamp"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p11    # Ljava/util/Date;
        .annotation runtime Lhb/o;
            name = "last_purchase_timestamp"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p12    # Ljava/lang/String;
        .annotation runtime Lhb/o;
            name = "last_activated_offer_code"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p13    # Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;
        .annotation runtime Lhb/o;
            name = "grant_type"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p14    # Ljava/util/Date;
        .annotation runtime Lhb/o;
            name = "auto_renew_disable_timestamp"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p15    # Ljava/util/List;
        .annotation runtime Lhb/o;
            name = "store_transactions"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;",
            "II",
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

    const-string v2, "permissionID"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "productID"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "renewState"

    invoke-static {p3, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "startedDate"

    invoke-static {p4, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "source"

    invoke-static {p6, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "grantType"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "transactions"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->permissionID:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->productID:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->renewState:Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;

    .line 5
    iput-object p4, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->startedDate:Ljava/util/Date;

    .line 6
    iput-object p5, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->expirationDate:Ljava/util/Date;

    .line 7
    iput-object p6, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->source:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;

    .line 8
    iput p7, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->active:I

    .line 9
    iput p8, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->renewsCount:I

    .line 10
    iput-object p9, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->trialStartDate:Ljava/util/Date;

    .line 11
    iput-object p10, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->firstPurchaseDate:Ljava/util/Date;

    .line 12
    iput-object p11, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->lastPurchaseDate:Ljava/util/Date;

    .line 13
    iput-object p12, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->lastActivatedOfferCode:Ljava/lang/String;

    .line 14
    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->grantType:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;

    move-object/from16 p1, p14

    .line 15
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->autoRenewDisableDate:Ljava/util/Date;

    .line 16
    iput-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->transactions:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;Ljava/util/Date;Ljava/util/Date;Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;IILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;Ljava/util/Date;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 18

    move/from16 v0, p16

    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_0

    .line 17
    sget-object v1, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;->Unknown:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;

    move-object v8, v1

    goto :goto_0

    :cond_0
    move-object/from16 v8, p6

    :goto_0
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    move v10, v1

    goto :goto_1

    :cond_1
    move/from16 v10, p8

    :goto_1
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_2

    .line 18
    sget-object v1, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;->Purchase:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;

    move-object v15, v1

    goto :goto_2

    :cond_2
    move-object/from16 v15, p13

    :goto_2
    and-int/lit16 v0, v0, 0x4000

    if-eqz v0, :cond_3

    .line 19
    sget-object v0, Lff/v;->a:Lff/v;

    move-object/from16 v17, v0

    :goto_3
    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move/from16 v9, p7

    move-object/from16 v11, p9

    move-object/from16 v12, p10

    move-object/from16 v13, p11

    move-object/from16 v14, p12

    move-object/from16 v16, p14

    goto :goto_4

    :cond_3
    move-object/from16 v17, p15

    goto :goto_3

    .line 20
    :goto_4
    invoke-direct/range {v2 .. v17}, Lcom/qonversion/android/sdk/internal/dto/QPermission;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;Ljava/util/Date;Ljava/util/Date;Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;IILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;Ljava/util/Date;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/qonversion/android/sdk/internal/dto/QPermission;Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;Ljava/util/Date;Ljava/util/Date;Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;IILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;Ljava/util/Date;Ljava/util/List;ILjava/lang/Object;)Lcom/qonversion/android/sdk/internal/dto/QPermission;
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p16

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->permissionID:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->productID:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->renewState:Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->startedDate:Ljava/util/Date;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->expirationDate:Ljava/util/Date;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->source:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget v8, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->active:I

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget v9, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->renewsCount:I

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->trialStartDate:Ljava/util/Date;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->firstPurchaseDate:Ljava/util/Date;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->lastPurchaseDate:Ljava/util/Date;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->lastActivatedOfferCode:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->grantType:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->autoRenewDisableDate:Ljava/util/Date;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    and-int/lit16 v1, v1, 0x4000

    if-eqz v1, :cond_e

    iget-object v1, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->transactions:Ljava/util/List;

    move-object/from16 p16, v1

    :goto_e
    move-object/from16 p1, v0

    move-object/from16 p2, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move/from16 p8, v8

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
    invoke-virtual/range {p1 .. p16}, Lcom/qonversion/android/sdk/internal/dto/QPermission;->copy(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;Ljava/util/Date;Ljava/util/Date;Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;IILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;Ljava/util/Date;Ljava/util/List;)Lcom/qonversion/android/sdk/internal/dto/QPermission;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->permissionID:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/util/Date;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->firstPurchaseDate:Ljava/util/Date;

    return-object v0
.end method

.method public final component11()Ljava/util/Date;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->lastPurchaseDate:Ljava/util/Date;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->lastActivatedOfferCode:Ljava/lang/String;

    return-object v0
.end method

.method public final component13()Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->grantType:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;

    return-object v0
.end method

.method public final component14()Ljava/util/Date;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->autoRenewDisableDate:Ljava/util/Date;

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

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->transactions:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->productID:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->renewState:Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;

    return-object v0
.end method

.method public final component4()Ljava/util/Date;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->startedDate:Ljava/util/Date;

    return-object v0
.end method

.method public final component5()Ljava/util/Date;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->expirationDate:Ljava/util/Date;

    return-object v0
.end method

.method public final component6()Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->source:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;

    return-object v0
.end method

.method public final component7$sdk_release()I
    .locals 1

    iget v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->active:I

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->renewsCount:I

    return v0
.end method

.method public final component9()Ljava/util/Date;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->trialStartDate:Ljava/util/Date;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;Ljava/util/Date;Ljava/util/Date;Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;IILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;Ljava/util/Date;Ljava/util/List;)Lcom/qonversion/android/sdk/internal/dto/QPermission;
    .locals 17
    .param p1    # Ljava/lang/String;
        .annotation runtime Lhb/o;
            name = "id"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lhb/o;
            name = "associated_product"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;
        .annotation runtime Lhb/o;
            name = "renew_state"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/util/Date;
        .annotation runtime Lhb/o;
            name = "started_timestamp"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Ljava/util/Date;
        .annotation runtime Lhb/o;
            name = "expiration_timestamp"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;
        .annotation runtime Lhb/o;
            name = "source"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # I
        .annotation runtime Lhb/o;
            name = "active"
        .end annotation
    .end param
    .param p8    # I
        .annotation runtime Lhb/o;
            name = "renews_count"
        .end annotation
    .end param
    .param p9    # Ljava/util/Date;
        .annotation runtime Lhb/o;
            name = "trial_start_timestamp"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p10    # Ljava/util/Date;
        .annotation runtime Lhb/o;
            name = "first_purchase_timestamp"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p11    # Ljava/util/Date;
        .annotation runtime Lhb/o;
            name = "last_purchase_timestamp"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p12    # Ljava/lang/String;
        .annotation runtime Lhb/o;
            name = "last_activated_offer_code"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p13    # Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;
        .annotation runtime Lhb/o;
            name = "grant_type"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p14    # Ljava/util/Date;
        .annotation runtime Lhb/o;
            name = "auto_renew_disable_timestamp"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p15    # Ljava/util/List;
        .annotation runtime Lhb/o;
            name = "store_transactions"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;",
            "II",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;",
            "Ljava/util/Date;",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;",
            ">;)",
            "Lcom/qonversion/android/sdk/internal/dto/QPermission;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "permissionID"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "productID"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "renewState"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "startedDate"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "grantType"

    move-object/from16 v14, p13

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transactions"

    move-object/from16 v1, p15

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/qonversion/android/sdk/internal/dto/QPermission;

    move-object/from16 v6, p5

    move/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    invoke-direct/range {v1 .. v16}, Lcom/qonversion/android/sdk/internal/dto/QPermission;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;Ljava/util/Date;Ljava/util/Date;Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;IILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;Ljava/util/Date;Ljava/util/List;)V

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
    instance-of v1, p1, Lcom/qonversion/android/sdk/internal/dto/QPermission;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/qonversion/android/sdk/internal/dto/QPermission;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->permissionID:Ljava/lang/String;

    iget-object v3, p1, Lcom/qonversion/android/sdk/internal/dto/QPermission;->permissionID:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->productID:Ljava/lang/String;

    iget-object v3, p1, Lcom/qonversion/android/sdk/internal/dto/QPermission;->productID:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->renewState:Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;

    iget-object v3, p1, Lcom/qonversion/android/sdk/internal/dto/QPermission;->renewState:Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->startedDate:Ljava/util/Date;

    iget-object v3, p1, Lcom/qonversion/android/sdk/internal/dto/QPermission;->startedDate:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->expirationDate:Ljava/util/Date;

    iget-object v3, p1, Lcom/qonversion/android/sdk/internal/dto/QPermission;->expirationDate:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->source:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;

    iget-object v3, p1, Lcom/qonversion/android/sdk/internal/dto/QPermission;->source:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->active:I

    iget v3, p1, Lcom/qonversion/android/sdk/internal/dto/QPermission;->active:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->renewsCount:I

    iget v3, p1, Lcom/qonversion/android/sdk/internal/dto/QPermission;->renewsCount:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->trialStartDate:Ljava/util/Date;

    iget-object v3, p1, Lcom/qonversion/android/sdk/internal/dto/QPermission;->trialStartDate:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->firstPurchaseDate:Ljava/util/Date;

    iget-object v3, p1, Lcom/qonversion/android/sdk/internal/dto/QPermission;->firstPurchaseDate:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->lastPurchaseDate:Ljava/util/Date;

    iget-object v3, p1, Lcom/qonversion/android/sdk/internal/dto/QPermission;->lastPurchaseDate:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->lastActivatedOfferCode:Ljava/lang/String;

    iget-object v3, p1, Lcom/qonversion/android/sdk/internal/dto/QPermission;->lastActivatedOfferCode:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->grantType:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;

    iget-object v3, p1, Lcom/qonversion/android/sdk/internal/dto/QPermission;->grantType:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->autoRenewDisableDate:Ljava/util/Date;

    iget-object v3, p1, Lcom/qonversion/android/sdk/internal/dto/QPermission;->autoRenewDisableDate:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->transactions:Ljava/util/List;

    iget-object p1, p1, Lcom/qonversion/android/sdk/internal/dto/QPermission;->transactions:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_10

    return v2

    :cond_10
    return v0
.end method

.method public final getActive$sdk_release()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->active:I

    .line 2
    .line 3
    return v0
.end method

.method public final getAutoRenewDisableDate()Ljava/util/Date;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->autoRenewDisableDate:Ljava/util/Date;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getExpirationDate()Ljava/util/Date;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->expirationDate:Ljava/util/Date;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getFirstPurchaseDate()Ljava/util/Date;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->firstPurchaseDate:Ljava/util/Date;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getGrantType()Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->grantType:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getLastActivatedOfferCode()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->lastActivatedOfferCode:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getLastPurchaseDate()Ljava/util/Date;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->lastPurchaseDate:Ljava/util/Date;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPermissionID()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->permissionID:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getProductID()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->productID:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getRenewState()Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->renewState:Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getRenewsCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->renewsCount:I

    .line 2
    .line 3
    return v0
.end method

.method public final getSource()Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->source:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getStartedDate()Ljava/util/Date;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->startedDate:Ljava/util/Date;

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
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->transactions:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTrialStartDate()Ljava/util/Date;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->trialStartDate:Ljava/util/Date;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->permissionID:Ljava/lang/String;

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
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->productID:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, LN0/a;->c(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->renewState:Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;

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
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->startedDate:Ljava/util/Date;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/util/Date;->hashCode()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    add-int/2addr v0, v2

    .line 31
    mul-int/2addr v0, v1

    .line 32
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->expirationDate:Ljava/util/Date;

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    if-nez v2, :cond_0

    .line 36
    .line 37
    move v2, v3

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    :goto_0
    add-int/2addr v0, v2

    .line 44
    mul-int/2addr v0, v1

    .line 45
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->source:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;

    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    add-int/2addr v2, v0

    .line 52
    mul-int/2addr v2, v1

    .line 53
    iget v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->active:I

    .line 54
    .line 55
    add-int/2addr v2, v0

    .line 56
    mul-int/2addr v2, v1

    .line 57
    iget v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->renewsCount:I

    .line 58
    .line 59
    add-int/2addr v2, v0

    .line 60
    mul-int/2addr v2, v1

    .line 61
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->trialStartDate:Ljava/util/Date;

    .line 62
    .line 63
    if-nez v0, :cond_1

    .line 64
    .line 65
    move v0, v3

    .line 66
    goto :goto_1

    .line 67
    :cond_1
    invoke-virtual {v0}, Ljava/util/Date;->hashCode()I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    :goto_1
    add-int/2addr v2, v0

    .line 72
    mul-int/2addr v2, v1

    .line 73
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->firstPurchaseDate:Ljava/util/Date;

    .line 74
    .line 75
    if-nez v0, :cond_2

    .line 76
    .line 77
    move v0, v3

    .line 78
    goto :goto_2

    .line 79
    :cond_2
    invoke-virtual {v0}, Ljava/util/Date;->hashCode()I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    :goto_2
    add-int/2addr v2, v0

    .line 84
    mul-int/2addr v2, v1

    .line 85
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->lastPurchaseDate:Ljava/util/Date;

    .line 86
    .line 87
    if-nez v0, :cond_3

    .line 88
    .line 89
    move v0, v3

    .line 90
    goto :goto_3

    .line 91
    :cond_3
    invoke-virtual {v0}, Ljava/util/Date;->hashCode()I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    :goto_3
    add-int/2addr v2, v0

    .line 96
    mul-int/2addr v2, v1

    .line 97
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->lastActivatedOfferCode:Ljava/lang/String;

    .line 98
    .line 99
    if-nez v0, :cond_4

    .line 100
    .line 101
    move v0, v3

    .line 102
    goto :goto_4

    .line 103
    :cond_4
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    :goto_4
    add-int/2addr v2, v0

    .line 108
    mul-int/2addr v2, v1

    .line 109
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->grantType:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;

    .line 110
    .line 111
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    add-int/2addr v0, v2

    .line 116
    mul-int/2addr v0, v1

    .line 117
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->autoRenewDisableDate:Ljava/util/Date;

    .line 118
    .line 119
    if-nez v2, :cond_5

    .line 120
    .line 121
    goto :goto_5

    .line 122
    :cond_5
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    :goto_5
    add-int/2addr v0, v3

    .line 127
    mul-int/2addr v0, v1

    .line 128
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->transactions:Ljava/util/List;

    .line 129
    .line 130
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    add-int/2addr v1, v0

    .line 135
    return v1
.end method

.method public final isActive()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->active:I

    .line 2
    .line 3
    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->toBoolean(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 18
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->permissionID:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->productID:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->renewState:Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;

    .line 8
    .line 9
    iget-object v4, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->startedDate:Ljava/util/Date;

    .line 10
    .line 11
    iget-object v5, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->expirationDate:Ljava/util/Date;

    .line 12
    .line 13
    iget-object v6, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->source:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;

    .line 14
    .line 15
    iget v7, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->active:I

    .line 16
    .line 17
    iget v8, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->renewsCount:I

    .line 18
    .line 19
    iget-object v9, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->trialStartDate:Ljava/util/Date;

    .line 20
    .line 21
    iget-object v10, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->firstPurchaseDate:Ljava/util/Date;

    .line 22
    .line 23
    iget-object v11, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->lastPurchaseDate:Ljava/util/Date;

    .line 24
    .line 25
    iget-object v12, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->lastActivatedOfferCode:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v13, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->grantType:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;

    .line 28
    .line 29
    iget-object v14, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->autoRenewDisableDate:Ljava/util/Date;

    .line 30
    .line 31
    iget-object v15, v0, Lcom/qonversion/android/sdk/internal/dto/QPermission;->transactions:Ljava/util/List;

    .line 32
    .line 33
    const-string v0, "QPermission(permissionID="

    .line 34
    .line 35
    move-object/from16 v16, v15

    .line 36
    .line 37
    const-string v15, ", productID="

    .line 38
    .line 39
    move-object/from16 v17, v14

    .line 40
    .line 41
    const-string v14, ", renewState="

    .line 42
    .line 43
    invoke-static {v0, v1, v15, v2, v14}, LA7/p0;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v1, ", startedDate="

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string v1, ", expirationDate="

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string v1, ", source="

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string v1, ", active="

    .line 75
    .line 76
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string v1, ", renewsCount="

    .line 80
    .line 81
    const-string v2, ", trialStartDate="

    .line 82
    .line 83
    invoke-static {v7, v8, v1, v2, v0}, LR8/v;->i(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    const-string v1, ", firstPurchaseDate="

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    const-string v1, ", lastPurchaseDate="

    .line 98
    .line 99
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    const-string v1, ", lastActivatedOfferCode="

    .line 106
    .line 107
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    const-string v1, ", grantType="

    .line 114
    .line 115
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    const-string v1, ", autoRenewDisableDate="

    .line 122
    .line 123
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    move-object/from16 v1, v17

    .line 127
    .line 128
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    const-string v1, ", transactions="

    .line 132
    .line 133
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    move-object/from16 v1, v16

    .line 137
    .line 138
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    const-string v1, ")"

    .line 142
    .line 143
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    return-object v0
.end method
