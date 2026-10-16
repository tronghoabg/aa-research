.class public final Lcom/moloco/sdk/internal/services/bidtoken/v;
.super Llf/c;
.source "SourceFile"


# instance fields
.field public a:LG9/e;

.field public b:Lcom/moloco/sdk/internal/services/bidtoken/m;

.field public c:Lcom/moloco/sdk/internal/bidtoken/a;

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:LG9/e;

.field public f:I


# direct methods
.method public constructor <init>(LG9/e;Llf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/moloco/sdk/internal/services/bidtoken/v;->e:LG9/e;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Llf/c;-><init>(Ljf/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/moloco/sdk/internal/services/bidtoken/v;->d:Ljava/lang/Object;

    iget p1, p0, Lcom/moloco/sdk/internal/services/bidtoken/v;->f:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/moloco/sdk/internal/services/bidtoken/v;->f:I

    iget-object p1, p0, Lcom/moloco/sdk/internal/services/bidtoken/v;->e:LG9/e;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, LG9/e;->d(Lcom/moloco/sdk/internal/services/bidtoken/m;Llf/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
