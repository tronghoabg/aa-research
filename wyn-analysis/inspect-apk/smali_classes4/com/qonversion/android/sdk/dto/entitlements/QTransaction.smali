.class public final Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lhb/s;
    generateAdapter = true
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001a\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001Be\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\u0008\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\u0008\u0001\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0001\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0008\u0001\u0010\n\u001a\u00020\u000b\u0012\u0008\u0008\u0001\u0010\u000c\u001a\u00020\r\u0012\u0008\u0008\u0001\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010%\u001a\u00020\u000bH\u00c6\u0003J\t\u0010&\u001a\u00020\rH\u00c6\u0003J\t\u0010\'\u001a\u00020\u000fH\u00c6\u0003Ji\u0010(\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u00032\n\u0008\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0003\u0010\u0006\u001a\u00020\u00072\n\u0008\u0003\u0010\u0008\u001a\u0004\u0018\u00010\u00072\n\u0008\u0003\u0010\t\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0003\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0003\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0003\u0010\u000e\u001a\u00020\u000fH\u00c6\u0001J\u0013\u0010)\u001a\u00020*2\u0008\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010,\u001a\u00020-H\u00d6\u0001J\t\u0010.\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0013\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u0014R\u0011\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001e\u00a8\u0006/"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;",
        "",
        "originalTransactionId",
        "",
        "transactionId",
        "offerCode",
        "transactionDate",
        "Ljava/util/Date;",
        "expirationDate",
        "transactionRevocationDate",
        "ownershipType",
        "Lcom/qonversion/android/sdk/dto/entitlements/QTransactionOwnershipType;",
        "type",
        "Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;",
        "environment",
        "Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lcom/qonversion/android/sdk/dto/entitlements/QTransactionOwnershipType;Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;)V",
        "getEnvironment",
        "()Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;",
        "getExpirationDate",
        "()Ljava/util/Date;",
        "getOfferCode",
        "()Ljava/lang/String;",
        "getOriginalTransactionId",
        "getOwnershipType",
        "()Lcom/qonversion/android/sdk/dto/entitlements/QTransactionOwnershipType;",
        "getTransactionDate",
        "getTransactionId",
        "getTransactionRevocationDate",
        "getType",
        "()Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
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
.field private final environment:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final expirationDate:Ljava/util/Date;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final offerCode:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final originalTransactionId:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final ownershipType:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionOwnershipType;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final transactionDate:Ljava/util/Date;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final transactionId:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final transactionRevocationDate:Ljava/util/Date;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final type:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lcom/qonversion/android/sdk/dto/entitlements/QTransactionOwnershipType;Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Lhb/o;
            name = "original_transaction_id"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lhb/o;
            name = "transaction_id"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lhb/o;
            name = "offer_code"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/util/Date;
        .annotation runtime Lhb/o;
            name = "transaction_timestamp"
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
    .param p6    # Ljava/util/Date;
        .annotation runtime Lhb/o;
            name = "transaction_revoke_timestamp"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p7    # Lcom/qonversion/android/sdk/dto/entitlements/QTransactionOwnershipType;
        .annotation runtime Lhb/o;
            name = "ownership_type"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;
        .annotation runtime Lhb/o;
            name = "type"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p9    # Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;
        .annotation runtime Lhb/o;
            name = "environment"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "originalTransactionId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "transactionId"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "transactionDate"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "ownershipType"

    .line 17
    .line 18
    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "type"

    .line 22
    .line 23
    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "environment"

    .line 27
    .line 28
    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->originalTransactionId:Ljava/lang/String;

    .line 35
    .line 36
    iput-object p2, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->transactionId:Ljava/lang/String;

    .line 37
    .line 38
    iput-object p3, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->offerCode:Ljava/lang/String;

    .line 39
    .line 40
    iput-object p4, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->transactionDate:Ljava/util/Date;

    .line 41
    .line 42
    iput-object p5, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->expirationDate:Ljava/util/Date;

    .line 43
    .line 44
    iput-object p6, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->transactionRevocationDate:Ljava/util/Date;

    .line 45
    .line 46
    iput-object p7, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->ownershipType:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionOwnershipType;

    .line 47
    .line 48
    iput-object p8, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->type:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    .line 49
    .line 50
    iput-object p9, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->environment:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;

    .line 51
    .line 52
    return-void
.end method

.method public static synthetic copy$default(Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lcom/qonversion/android/sdk/dto/entitlements/QTransactionOwnershipType;Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;ILjava/lang/Object;)Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-object p1, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->originalTransactionId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->transactionId:Ljava/lang/String;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-object p3, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->offerCode:Ljava/lang/String;

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-object p4, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->transactionDate:Ljava/util/Date;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->expirationDate:Ljava/util/Date;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p6, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->transactionRevocationDate:Ljava/util/Date;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p7, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->ownershipType:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionOwnershipType;

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-object p8, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->type:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-object p9, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->environment:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;

    :cond_8
    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p11}, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lcom/qonversion/android/sdk/dto/entitlements/QTransactionOwnershipType;Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;)Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->originalTransactionId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->transactionId:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->offerCode:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/util/Date;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->transactionDate:Ljava/util/Date;

    return-object v0
.end method

.method public final component5()Ljava/util/Date;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->expirationDate:Ljava/util/Date;

    return-object v0
.end method

.method public final component6()Ljava/util/Date;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->transactionRevocationDate:Ljava/util/Date;

    return-object v0
.end method

.method public final component7()Lcom/qonversion/android/sdk/dto/entitlements/QTransactionOwnershipType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->ownershipType:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionOwnershipType;

    return-object v0
.end method

.method public final component8()Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->type:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    return-object v0
.end method

.method public final component9()Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->environment:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lcom/qonversion/android/sdk/dto/entitlements/QTransactionOwnershipType;Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;)Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;
    .locals 11
    .param p1    # Ljava/lang/String;
        .annotation runtime Lhb/o;
            name = "original_transaction_id"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lhb/o;
            name = "transaction_id"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lhb/o;
            name = "offer_code"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/util/Date;
        .annotation runtime Lhb/o;
            name = "transaction_timestamp"
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
    .param p6    # Ljava/util/Date;
        .annotation runtime Lhb/o;
            name = "transaction_revoke_timestamp"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p7    # Lcom/qonversion/android/sdk/dto/entitlements/QTransactionOwnershipType;
        .annotation runtime Lhb/o;
            name = "ownership_type"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;
        .annotation runtime Lhb/o;
            name = "type"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p9    # Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;
        .annotation runtime Lhb/o;
            name = "environment"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "originalTransactionId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transactionId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transactionDate"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ownershipType"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "environment"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    invoke-direct/range {v1 .. v10}, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lcom/qonversion/android/sdk/dto/entitlements/QTransactionOwnershipType;Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;)V

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
    instance-of v1, p1, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;

    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->originalTransactionId:Ljava/lang/String;

    iget-object v3, p1, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->originalTransactionId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->transactionId:Ljava/lang/String;

    iget-object v3, p1, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->transactionId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->offerCode:Ljava/lang/String;

    iget-object v3, p1, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->offerCode:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->transactionDate:Ljava/util/Date;

    iget-object v3, p1, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->transactionDate:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->expirationDate:Ljava/util/Date;

    iget-object v3, p1, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->expirationDate:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->transactionRevocationDate:Ljava/util/Date;

    iget-object v3, p1, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->transactionRevocationDate:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->ownershipType:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionOwnershipType;

    iget-object v3, p1, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->ownershipType:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionOwnershipType;

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->type:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    iget-object v3, p1, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->type:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->environment:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;

    iget-object p1, p1, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->environment:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;

    if-eq v1, p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getEnvironment()Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->environment:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getExpirationDate()Ljava/util/Date;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->expirationDate:Ljava/util/Date;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getOfferCode()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->offerCode:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getOriginalTransactionId()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->originalTransactionId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getOwnershipType()Lcom/qonversion/android/sdk/dto/entitlements/QTransactionOwnershipType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->ownershipType:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionOwnershipType;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTransactionDate()Ljava/util/Date;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->transactionDate:Ljava/util/Date;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTransactionId()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->transactionId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTransactionRevocationDate()Ljava/util/Date;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->transactionRevocationDate:Ljava/util/Date;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getType()Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->type:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->originalTransactionId:Ljava/lang/String;

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
    iget-object v2, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->transactionId:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, LN0/a;->c(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->offerCode:Ljava/lang/String;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    move v2, v3

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    :goto_0
    add-int/2addr v0, v2

    .line 28
    mul-int/2addr v0, v1

    .line 29
    iget-object v2, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->transactionDate:Ljava/util/Date;

    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    add-int/2addr v2, v0

    .line 36
    mul-int/2addr v2, v1

    .line 37
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->expirationDate:Ljava/util/Date;

    .line 38
    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    move v0, v3

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    invoke-virtual {v0}, Ljava/util/Date;->hashCode()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    :goto_1
    add-int/2addr v2, v0

    .line 48
    mul-int/2addr v2, v1

    .line 49
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->transactionRevocationDate:Ljava/util/Date;

    .line 50
    .line 51
    if-nez v0, :cond_2

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_2
    invoke-virtual {v0}, Ljava/util/Date;->hashCode()I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    :goto_2
    add-int/2addr v2, v3

    .line 59
    mul-int/2addr v2, v1

    .line 60
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->ownershipType:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionOwnershipType;

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    add-int/2addr v0, v2

    .line 67
    mul-int/2addr v0, v1

    .line 68
    iget-object v2, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->type:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    .line 69
    .line 70
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    add-int/2addr v2, v0

    .line 75
    mul-int/2addr v2, v1

    .line 76
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->environment:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;

    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    add-int/2addr v0, v2

    .line 83
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 12
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->originalTransactionId:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->transactionId:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->offerCode:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->transactionDate:Ljava/util/Date;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->expirationDate:Ljava/util/Date;

    .line 10
    .line 11
    iget-object v5, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->transactionRevocationDate:Ljava/util/Date;

    .line 12
    .line 13
    iget-object v6, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->ownershipType:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionOwnershipType;

    .line 14
    .line 15
    iget-object v7, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->type:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    .line 16
    .line 17
    iget-object v8, p0, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->environment:Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;

    .line 18
    .line 19
    const-string v9, "QTransaction(originalTransactionId="

    .line 20
    .line 21
    const-string v10, ", transactionId="

    .line 22
    .line 23
    const-string v11, ", offerCode="

    .line 24
    .line 25
    invoke-static {v9, v0, v10, v1, v11}, LA7/p0;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v1, ", transactionDate="

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v1, ", expirationDate="

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v1, ", transactionRevocationDate="

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string v1, ", ownershipType="

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v1, ", type="

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v1, ", environment="

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string v1, ")"

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    return-object v0
.end method
