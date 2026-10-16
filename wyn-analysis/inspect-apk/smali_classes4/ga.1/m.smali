.class public final Lga/m;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public synthetic a:Ljava/lang/Object;

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lx1/e;

.field public final synthetic d:Lga/n;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lx1/e;Lga/n;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lga/m;->b:Ljava/lang/Object;

    .line 2
    .line 3
    iput-object p2, p0, Lga/m;->c:Lx1/e;

    .line 4
    .line 5
    iput-object p3, p0, Lga/m;->d:Lga/n;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Llf/j;-><init>(ILjf/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 4

    .line 1
    new-instance v0, Lga/m;

    .line 2
    .line 3
    iget-object v1, p0, Lga/m;->c:Lx1/e;

    .line 4
    .line 5
    iget-object v2, p0, Lga/m;->d:Lga/n;

    .line 6
    .line 7
    iget-object v3, p0, Lga/m;->b:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {v0, v3, v1, v2, p2}, Lga/m;-><init>(Ljava/lang/Object;Lx1/e;Lga/n;Ljf/c;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, Lga/m;->a:Ljava/lang/Object;

    .line 13
    .line 14
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lx1/b;

    .line 2
    .line 3
    check-cast p2, Ljf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lga/m;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lga/m;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lga/m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lga/m;->a:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lx1/b;

    .line 9
    .line 10
    iget-object v0, p0, Lga/m;->b:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object v1, p0, Lga/m;->c:Lx1/e;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1, v1, v0}, Lx1/b;->c(Lx1/e;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    const-string v0, "key"

    .line 24
    .line 25
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Lx1/b;->a()V

    .line 29
    .line 30
    .line 31
    iget-object v0, p1, Lx1/b;->a:Ljava/util/LinkedHashMap;

    .line 32
    .line 33
    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    :goto_0
    iget-object v0, p0, Lga/m;->d:Lga/n;

    .line 37
    .line 38
    invoke-static {v0, p1}, Lga/n;->a(Lga/n;Lx1/b;)V

    .line 39
    .line 40
    .line 41
    sget-object p1, Lef/C;->a:Lef/C;

    .line 42
    .line 43
    return-object p1
.end method
