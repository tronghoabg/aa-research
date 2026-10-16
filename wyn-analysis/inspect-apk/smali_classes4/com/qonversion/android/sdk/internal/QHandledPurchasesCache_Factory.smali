.class public final Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldf/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldf/a;"
    }
.end annotation


# static fields
.field private static final INSTANCE:Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache_Factory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache_Factory;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache_Factory;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache_Factory;->INSTANCE:Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache_Factory;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static create()Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache_Factory;
    .locals 1

    .line 1
    sget-object v0, Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache_Factory;->INSTANCE:Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache_Factory;

    .line 2
    .line 3
    return-object v0
.end method

.method public static newInstance()Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;
    .locals 1

    .line 1
    new-instance v0, Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public get()Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;
    .locals 1

    .line 2
    new-instance v0, Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;

    invoke-direct {v0}, Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;-><init>()V

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache_Factory;->get()Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;

    move-result-object v0

    return-object v0
.end method
