.class public final Lcom/moloco/sdk/internal/services/bidtoken/n;
.super Llf/c;
.source "SourceFile"


# instance fields
.field public a:Lcom/moloco/sdk/internal/services/bidtoken/o;

.field public b:Lcom/moloco/sdk/acm/recorder/b;

.field public c:LNf/a;

.field public d:Lcom/moloco/sdk/acm/l;

.field public e:Ljava/lang/String;

.field public synthetic f:Ljava/lang/Object;

.field public final synthetic g:Lcom/moloco/sdk/internal/services/bidtoken/o;

.field public h:I


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/internal/services/bidtoken/o;Llf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/moloco/sdk/internal/services/bidtoken/n;->g:Lcom/moloco/sdk/internal/services/bidtoken/o;

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

    iput-object p1, p0, Lcom/moloco/sdk/internal/services/bidtoken/n;->f:Ljava/lang/Object;

    iget p1, p0, Lcom/moloco/sdk/internal/services/bidtoken/n;->h:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/moloco/sdk/internal/services/bidtoken/n;->h:I

    iget-object p1, p0, Lcom/moloco/sdk/internal/services/bidtoken/n;->g:Lcom/moloco/sdk/internal/services/bidtoken/o;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lcom/moloco/sdk/internal/services/bidtoken/o;->a(Lcom/moloco/sdk/acm/recorder/b;Llf/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
