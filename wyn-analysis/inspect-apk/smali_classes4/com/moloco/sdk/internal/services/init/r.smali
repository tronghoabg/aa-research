.class public final Lcom/moloco/sdk/internal/services/init/r;
.super Llf/c;
.source "SourceFile"


# instance fields
.field public a:Lcom/moloco/sdk/acm/recorder/c;

.field public b:Lcom/moloco/sdk/acm/l;

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lcom/moloco/sdk/internal/services/init/s;

.field public e:I


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/internal/services/init/s;Llf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/moloco/sdk/internal/services/init/r;->d:Lcom/moloco/sdk/internal/services/init/s;

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

    iput-object p1, p0, Lcom/moloco/sdk/internal/services/init/r;->c:Ljava/lang/Object;

    iget p1, p0, Lcom/moloco/sdk/internal/services/init/r;->e:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/moloco/sdk/internal/services/init/r;->e:I

    iget-object p1, p0, Lcom/moloco/sdk/internal/services/init/r;->d:Lcom/moloco/sdk/internal/services/init/s;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Lcom/moloco/sdk/internal/services/init/s;->c(Ljava/lang/String;Lcom/moloco/sdk/publisher/MediationInfo;Llf/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
