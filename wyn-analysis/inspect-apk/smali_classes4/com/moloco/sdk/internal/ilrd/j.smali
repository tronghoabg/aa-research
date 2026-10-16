.class public final Lcom/moloco/sdk/internal/ilrd/j;
.super Llf/c;
.source "SourceFile"


# instance fields
.field public a:Lcom/moloco/sdk/internal/ilrd/m;

.field public b:LNf/a;

.field public c:[B

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Lcom/moloco/sdk/internal/ilrd/m;

.field public f:I


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/internal/ilrd/m;Llf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/moloco/sdk/internal/ilrd/j;->e:Lcom/moloco/sdk/internal/ilrd/m;

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

    iput-object p1, p0, Lcom/moloco/sdk/internal/ilrd/j;->d:Ljava/lang/Object;

    iget p1, p0, Lcom/moloco/sdk/internal/ilrd/j;->f:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/moloco/sdk/internal/ilrd/j;->f:I

    iget-object p1, p0, Lcom/moloco/sdk/internal/ilrd/j;->e:Lcom/moloco/sdk/internal/ilrd/m;

    invoke-static {p1, p0}, Lcom/moloco/sdk/internal/ilrd/m;->d(Lcom/moloco/sdk/internal/ilrd/m;Llf/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
