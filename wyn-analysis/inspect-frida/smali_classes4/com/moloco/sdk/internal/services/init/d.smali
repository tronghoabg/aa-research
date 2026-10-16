.class public final Lcom/moloco/sdk/internal/services/init/d;
.super Llf/c;
.source "SourceFile"


# instance fields
.field public a:Lcom/moloco/sdk/internal/services/init/f;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Lcom/moloco/sdk/acm/recorder/c;

.field public e:Lcom/moloco/sdk/acm/l;

.field public f:Lcom/moloco/sdk/internal/services/F;

.field public g:Lcom/moloco/sdk/internal/services/w;

.field public synthetic h:Ljava/lang/Object;

.field public final synthetic i:Lcom/moloco/sdk/internal/services/init/f;

.field public j:I


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/internal/services/init/f;Llf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/moloco/sdk/internal/services/init/d;->i:Lcom/moloco/sdk/internal/services/init/f;

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

    iput-object p1, p0, Lcom/moloco/sdk/internal/services/init/d;->h:Ljava/lang/Object;

    iget p1, p0, Lcom/moloco/sdk/internal/services/init/d;->j:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/moloco/sdk/internal/services/init/d;->j:I

    iget-object p1, p0, Lcom/moloco/sdk/internal/services/init/d;->i:Lcom/moloco/sdk/internal/services/init/f;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, v0, p0}, Lcom/moloco/sdk/internal/services/init/f;->a(Ljava/lang/String;Lcom/moloco/sdk/publisher/MediationInfo;Lcom/moloco/sdk/acm/recorder/b;Llf/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
