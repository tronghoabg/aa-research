.class public final Lcom/moloco/sdk/internal/publisher/o0;
.super Llf/c;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Lcom/moloco/sdk/K0;

.field public f:J

.field public synthetic g:Ljava/lang/Object;

.field public final synthetic h:Lcom/moloco/sdk/internal/publisher/r0;

.field public i:I


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/internal/publisher/r0;Llf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/moloco/sdk/internal/publisher/o0;->h:Lcom/moloco/sdk/internal/publisher/r0;

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
    .locals 8

    iput-object p1, p0, Lcom/moloco/sdk/internal/publisher/o0;->g:Ljava/lang/Object;

    iget p1, p0, Lcom/moloco/sdk/internal/publisher/o0;->i:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/moloco/sdk/internal/publisher/o0;->i:I

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/o0;->h:Lcom/moloco/sdk/internal/publisher/r0;

    const/4 v1, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v7, p0

    invoke-static/range {v0 .. v7}, Lcom/moloco/sdk/internal/publisher/r0;->a(Lcom/moloco/sdk/internal/publisher/r0;Lcom/moloco/sdk/internal/A;JLcom/moloco/sdk/internal/services/init/u;Lcom/moloco/sdk/acm/recorder/c;Lcom/moloco/sdk/acm/l;Llf/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
