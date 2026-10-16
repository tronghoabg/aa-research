.class public final Lcom/moloco/sdk/internal/services/analytics/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/n;

.field public final b:Lcom/moloco/sdk/internal/services/events/c;

.field public final c:Lcom/moloco/sdk/internal/services/events/e;


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/n;Lcom/moloco/sdk/internal/services/events/c;Lcom/moloco/sdk/internal/services/events/e;)V
    .locals 1

    .line 1
    const-string v0, "persistentHttpRequest"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "configService"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/moloco/sdk/internal/services/analytics/c;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/n;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/moloco/sdk/internal/services/analytics/c;->b:Lcom/moloco/sdk/internal/services/events/c;

    .line 17
    .line 18
    iput-object p3, p0, Lcom/moloco/sdk/internal/services/analytics/c;->c:Lcom/moloco/sdk/internal/services/events/e;

    .line 19
    .line 20
    return-void
.end method
