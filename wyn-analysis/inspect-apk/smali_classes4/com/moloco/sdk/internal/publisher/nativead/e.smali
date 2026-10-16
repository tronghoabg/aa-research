.class public final Lcom/moloco/sdk/internal/publisher/nativead/e;
.super Llf/c;
.source "SourceFile"


# instance fields
.field public a:Lcom/moloco/sdk/internal/publisher/nativead/o;

.field public b:Ljava/lang/String;

.field public c:Lcom/moloco/sdk/acm/l;

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Lcom/moloco/sdk/internal/publisher/nativead/o;

.field public f:I


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/internal/publisher/nativead/o;Llf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/moloco/sdk/internal/publisher/nativead/e;->e:Lcom/moloco/sdk/internal/publisher/nativead/o;

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
    .locals 3

    iput-object p1, p0, Lcom/moloco/sdk/internal/publisher/nativead/e;->d:Ljava/lang/Object;

    iget p1, p0, Lcom/moloco/sdk/internal/publisher/nativead/e;->f:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/moloco/sdk/internal/publisher/nativead/e;->f:I

    const-wide/16 v0, 0x0

    iget-object p1, p0, Lcom/moloco/sdk/internal/publisher/nativead/e;->e:Lcom/moloco/sdk/internal/publisher/nativead/o;

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v1, p0}, Lcom/moloco/sdk/internal/publisher/nativead/o;->b(Lcom/moloco/sdk/internal/publisher/nativead/o;Lcom/moloco/sdk/internal/publisher/nativead/model/h;JLlf/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
