.class public final LM0/j;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/a;


# instance fields
.field public final synthetic i:Landroid/content/Context;

.field public final synthetic j:LN/m;

.field public final synthetic k:Lo0/c;

.field public final synthetic l:Ltf/l;

.field public final synthetic m:LW/c;

.field public final synthetic n:Ljava/lang/String;

.field public final synthetic o:Lt0/M;


# direct methods
.method public constructor <init>(Landroid/content/Context;LN/m;Lo0/c;Ltf/l;LW/c;Ljava/lang/String;Lt0/M;)V
    .locals 0

    .line 1
    iput-object p1, p0, LM0/j;->i:Landroid/content/Context;

    .line 2
    .line 3
    iput-object p2, p0, LM0/j;->j:LN/m;

    .line 4
    .line 5
    iput-object p3, p0, LM0/j;->k:Lo0/c;

    .line 6
    .line 7
    iput-object p4, p0, LM0/j;->l:Ltf/l;

    .line 8
    .line 9
    iput-object p5, p0, LM0/j;->m:LW/c;

    .line 10
    .line 11
    iput-object p6, p0, LM0/j;->n:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p7, p0, LM0/j;->o:Lt0/M;

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    new-instance v0, LM0/o;

    .line 2
    .line 3
    const-string v1, "context"

    .line 4
    .line 5
    iget-object v2, p0, LM0/j;->i:Landroid/content/Context;

    .line 6
    .line 7
    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v1, "dispatcher"

    .line 11
    .line 12
    iget-object v3, p0, LM0/j;->k:Lo0/c;

    .line 13
    .line 14
    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, LM0/j;->j:LN/m;

    .line 18
    .line 19
    invoke-direct {v0, v2, v1, v3}, LM0/i;-><init>(Landroid/content/Context;LN/m;Lo0/c;)V

    .line 20
    .line 21
    .line 22
    sget-object v1, LM0/m;->k:LM0/m;

    .line 23
    .line 24
    iput-object v1, v0, LM0/o;->v:Ltf/l;

    .line 25
    .line 26
    iget-object v1, p0, LM0/j;->l:Ltf/l;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, LM0/o;->setFactory(Ltf/l;)V

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    iget-object v2, p0, LM0/j;->m:LW/c;

    .line 33
    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    iget-object v3, p0, LM0/j;->n:Ljava/lang/String;

    .line 37
    .line 38
    invoke-interface {v2, v3}, LW/c;->c(Ljava/lang/String;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    move-object v2, v1

    .line 44
    :goto_0
    instance-of v3, v2, Landroid/util/SparseArray;

    .line 45
    .line 46
    if-eqz v3, :cond_1

    .line 47
    .line 48
    move-object v1, v2

    .line 49
    check-cast v1, Landroid/util/SparseArray;

    .line 50
    .line 51
    :cond_1
    if-eqz v1, :cond_2

    .line 52
    .line 53
    invoke-virtual {v0}, LM0/o;->getTypedView$ui_release()Landroid/view/View;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    if-eqz v2, :cond_2

    .line 58
    .line 59
    invoke-virtual {v2, v1}, Landroid/view/View;->restoreHierarchyState(Landroid/util/SparseArray;)V

    .line 60
    .line 61
    .line 62
    :cond_2
    iget-object v1, p0, LM0/j;->o:Lt0/M;

    .line 63
    .line 64
    iput-object v0, v1, Lt0/M;->a:Ljava/lang/Object;

    .line 65
    .line 66
    invoke-virtual {v0}, LM0/i;->getLayoutNode()Lt0/t;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    return-object v0
.end method
