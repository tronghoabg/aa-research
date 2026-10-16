.class public final Lcom/moloco/sdk/internal/services/events/b;
.super Llf/c;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/moloco/sdk/internal/services/events/c;

.field public d:I


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/internal/services/events/c;Llf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/moloco/sdk/internal/services/events/b;->c:Lcom/moloco/sdk/internal/services/events/c;

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

    iput-object p1, p0, Lcom/moloco/sdk/internal/services/events/b;->b:Ljava/lang/Object;

    iget p1, p0, Lcom/moloco/sdk/internal/services/events/b;->d:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/moloco/sdk/internal/services/events/b;->d:I

    iget-object v0, p0, Lcom/moloco/sdk/internal/services/events/b;->c:Lcom/moloco/sdk/internal/services/events/c;

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v5, p0

    invoke-virtual/range {v0 .. v5}, Lcom/moloco/sdk/internal/services/events/c;->a(JLBa/c;Ljava/lang/String;Llf/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
