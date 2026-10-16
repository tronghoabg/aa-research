.class public final Lcom/moloco/sdk/internal/services/C;
.super Llf/c;
.source "SourceFile"


# instance fields
.field public synthetic a:Ljava/lang/Object;

.field public final synthetic b:Lcom/moloco/sdk/internal/services/E;

.field public c:I


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/internal/services/E;Llf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/moloco/sdk/internal/services/C;->b:Lcom/moloco/sdk/internal/services/E;

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
    .locals 2

    iput-object p1, p0, Lcom/moloco/sdk/internal/services/C;->a:Ljava/lang/Object;

    iget p1, p0, Lcom/moloco/sdk/internal/services/C;->c:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/moloco/sdk/internal/services/C;->c:I

    iget-object p1, p0, Lcom/moloco/sdk/internal/services/C;->b:Lcom/moloco/sdk/internal/services/E;

    const-wide/16 v0, 0x0

    invoke-virtual {p1, v0, v1, p0}, Lcom/moloco/sdk/internal/services/E;->a(JLlf/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
