.class public final Lcom/moloco/sdk/internal/services/e;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public final synthetic a:Lcom/moloco/sdk/internal/services/g;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/internal/services/g;Ljava/lang/String;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/moloco/sdk/internal/services/e;->a:Lcom/moloco/sdk/internal/services/g;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/moloco/sdk/internal/services/e;->b:Ljava/lang/String;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Llf/j;-><init>(ILjf/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 2

    .line 1
    new-instance p1, Lcom/moloco/sdk/internal/services/e;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/moloco/sdk/internal/services/e;->a:Lcom/moloco/sdk/internal/services/g;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/moloco/sdk/internal/services/e;->b:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/moloco/sdk/internal/services/e;-><init>(Lcom/moloco/sdk/internal/services/g;Ljava/lang/String;Ljf/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LEf/E;

    .line 2
    .line 3
    check-cast p2, Ljf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/moloco/sdk/internal/services/e;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/moloco/sdk/internal/services/e;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lcom/moloco/sdk/internal/services/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/moloco/sdk/internal/services/e;->a:Lcom/moloco/sdk/internal/services/g;

    .line 7
    .line 8
    iget-object p1, p1, Lcom/moloco/sdk/internal/services/g;->a:Landroid/content/SharedPreferences;

    .line 9
    .line 10
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-object v0, p0, Lcom/moloco/sdk/internal/services/e;->b:Ljava/lang/String;

    .line 15
    .line 16
    invoke-interface {p1, v0}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 21
    .line 22
    .line 23
    sget-object p1, Lef/C;->a:Lef/C;

    .line 24
    .line 25
    return-object p1
.end method
