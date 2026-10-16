.class public final synthetic Lcom/qonversion/android/sdk/internal/billing/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ltf/l;

.field public final synthetic b:Lcom/qonversion/android/sdk/internal/billing/BillingError;


# direct methods
.method public synthetic constructor <init>(Ltf/l;Lcom/qonversion/android/sdk/internal/billing/BillingError;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/f;->a:Ltf/l;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/billing/f;->b:Lcom/qonversion/android/sdk/internal/billing/BillingError;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/f;->b:Lcom/qonversion/android/sdk/internal/billing/BillingError;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/billing/f;->a:Ltf/l;

    invoke-static {v1, v0}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->a(Ltf/l;Lcom/qonversion/android/sdk/internal/billing/BillingError;)V

    return-void
.end method
