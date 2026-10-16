.class public final Lcom/moloco/sdk/internal/services/bidtoken/u;
.super Llf/c;
.source "SourceFile"


# instance fields
.field public a:LG9/e;

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:LG9/e;

.field public d:I


# direct methods
.method public constructor <init>(LG9/e;Llf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/moloco/sdk/internal/services/bidtoken/u;->c:LG9/e;

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

    iput-object p1, p0, Lcom/moloco/sdk/internal/services/bidtoken/u;->b:Ljava/lang/Object;

    iget p1, p0, Lcom/moloco/sdk/internal/services/bidtoken/u;->d:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/moloco/sdk/internal/services/bidtoken/u;->d:I

    iget-object p1, p0, Lcom/moloco/sdk/internal/services/bidtoken/u;->c:LG9/e;

    invoke-virtual {p1, p0}, LG9/e;->c(Llf/c;)Ljava/lang/Enum;

    move-result-object p1

    return-object p1
.end method
