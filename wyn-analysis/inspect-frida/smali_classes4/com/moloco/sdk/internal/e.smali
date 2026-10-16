.class public final Lcom/moloco/sdk/internal/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/moloco/sdk/K0;

.field public final b:Lcom/moloco/sdk/internal/services/events/c;

.field public final c:Lcom/moloco/sdk/internal/services/B;

.field public final d:Lef/p;


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/K0;Lcom/moloco/sdk/internal/services/events/c;Lcom/moloco/sdk/internal/services/B;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/moloco/sdk/internal/e;->a:Lcom/moloco/sdk/K0;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/moloco/sdk/internal/e;->b:Lcom/moloco/sdk/internal/services/events/c;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/moloco/sdk/internal/e;->c:Lcom/moloco/sdk/internal/services/B;

    .line 9
    .line 10
    new-instance p1, LAf/q;

    .line 11
    .line 12
    const/4 p2, 0x7

    .line 13
    invoke-direct {p1, p0, p2}, LAf/q;-><init>(Ljava/lang/Object;I)V

    .line 14
    .line 15
    .line 16
    invoke-static {p1}, LFe/c;->z(Ltf/a;)Lef/p;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Lcom/moloco/sdk/internal/e;->d:Lef/p;

    .line 21
    .line 22
    return-void
.end method
