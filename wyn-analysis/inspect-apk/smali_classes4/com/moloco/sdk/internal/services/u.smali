.class public final Lcom/moloco/sdk/internal/services/u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/lifecycle/o;

.field public final b:Lcom/moloco/sdk/internal/services/m;

.field public final c:LKd/a;

.field public d:Z


# direct methods
.method public constructor <init>(Landroidx/lifecycle/o;Lcom/moloco/sdk/internal/services/m;)V
    .locals 1

    .line 1
    const-string v0, "lifecycle"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fgBgListener"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/moloco/sdk/internal/services/u;->a:Landroidx/lifecycle/o;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/moloco/sdk/internal/services/u;->b:Lcom/moloco/sdk/internal/services/m;

    .line 17
    .line 18
    sget-object p1, LEf/S;->a:LLf/e;

    .line 19
    .line 20
    sget-object p1, LJf/n;->a:LFf/e;

    .line 21
    .line 22
    iget-object p1, p1, LFf/e;->e:LFf/e;

    .line 23
    .line 24
    invoke-static {p1}, LEf/H;->c(Ljf/h;)LKd/a;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, Lcom/moloco/sdk/internal/services/u;->c:LKd/a;

    .line 29
    .line 30
    return-void
.end method
