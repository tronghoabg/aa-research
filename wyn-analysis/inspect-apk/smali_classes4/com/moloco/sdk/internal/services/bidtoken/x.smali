.class public final Lcom/moloco/sdk/internal/services/bidtoken/x;
.super Llf/c;
.source "SourceFile"


# instance fields
.field public a:Lcom/moloco/sdk/internal/services/bidtoken/A;

.field public b:Ljava/lang/Object;

.field public c:Lcom/moloco/sdk/internal/services/bidtoken/m;

.field public d:Lcom/moloco/sdk/acm/l;

.field public e:Z

.field public f:Z

.field public synthetic g:Ljava/lang/Object;

.field public final synthetic h:Lcom/moloco/sdk/internal/services/bidtoken/A;

.field public i:I


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/internal/services/bidtoken/A;Llf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/moloco/sdk/internal/services/bidtoken/x;->h:Lcom/moloco/sdk/internal/services/bidtoken/A;

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
    .locals 6

    iput-object p1, p0, Lcom/moloco/sdk/internal/services/bidtoken/x;->g:Ljava/lang/Object;

    iget p1, p0, Lcom/moloco/sdk/internal/services/bidtoken/x;->i:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/moloco/sdk/internal/services/bidtoken/x;->i:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/moloco/sdk/internal/services/bidtoken/x;->h:Lcom/moloco/sdk/internal/services/bidtoken/A;

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v5, p0

    invoke-virtual/range {v0 .. v5}, Lcom/moloco/sdk/internal/services/bidtoken/A;->a(Lcom/moloco/sdk/acm/recorder/c;Lcom/moloco/sdk/internal/services/bidtoken/m;ZZLlf/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
