.class public final Lcom/moloco/sdk/internal/services/bidtoken/s;
.super Llf/c;
.source "SourceFile"


# instance fields
.field public a:LR8/a;

.field public b:Lcom/moloco/sdk/acm/recorder/b;

.field public c:Ljava/lang/String;

.field public d:Lcom/moloco/sdk/internal/services/bidtoken/g;

.field public e:LNf/d;

.field public synthetic f:Ljava/lang/Object;

.field public final synthetic g:LR8/a;

.field public h:I


# direct methods
.method public constructor <init>(LR8/a;Llf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/moloco/sdk/internal/services/bidtoken/s;->g:LR8/a;

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

    .line 1
    iput-object p1, p0, Lcom/moloco/sdk/internal/services/bidtoken/s;->f:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lcom/moloco/sdk/internal/services/bidtoken/s;->h:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lcom/moloco/sdk/internal/services/bidtoken/s;->h:I

    .line 9
    .line 10
    iget-object p1, p0, Lcom/moloco/sdk/internal/services/bidtoken/s;->g:LR8/a;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, v0, v0, p0}, LR8/a;->a(Lcom/moloco/sdk/acm/recorder/b;Ljava/lang/String;Lcom/moloco/sdk/internal/services/bidtoken/g;Llf/c;)Ljava/io/Serializable;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 18
    .line 19
    if-ne p1, v0, :cond_0

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    new-instance v0, Lef/n;

    .line 23
    .line 24
    invoke-direct {v0, p1}, Lef/n;-><init>(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-object v0
.end method
