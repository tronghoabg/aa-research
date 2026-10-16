.class public final Lcom/moloco/sdk/internal/ortb/d;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public final synthetic a:Lcom/moloco/sdk/internal/ortb/e;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/internal/ortb/e;Ljava/lang/String;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/moloco/sdk/internal/ortb/d;->a:Lcom/moloco/sdk/internal/ortb/e;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/moloco/sdk/internal/ortb/d;->b:Ljava/lang/String;

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
    new-instance p1, Lcom/moloco/sdk/internal/ortb/d;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/moloco/sdk/internal/ortb/d;->a:Lcom/moloco/sdk/internal/ortb/e;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/moloco/sdk/internal/ortb/d;->b:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/moloco/sdk/internal/ortb/d;-><init>(Lcom/moloco/sdk/internal/ortb/e;Ljava/lang/String;Ljf/c;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/moloco/sdk/internal/ortb/d;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/moloco/sdk/internal/ortb/d;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lcom/moloco/sdk/internal/ortb/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
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
    :try_start_0
    iget-object p1, p0, Lcom/moloco/sdk/internal/ortb/d;->a:Lcom/moloco/sdk/internal/ortb/e;

    .line 7
    .line 8
    iget-object p1, p1, Lcom/moloco/sdk/internal/ortb/e;->a:LXf/c;

    .line 9
    .line 10
    iget-object v0, p0, Lcom/moloco/sdk/internal/ortb/d;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    sget-object v1, Lcom/moloco/sdk/internal/ortb/model/y;->Companion:Lcom/moloco/sdk/internal/ortb/model/g$b;

    .line 16
    .line 17
    invoke-virtual {v1}, Lcom/moloco/sdk/internal/ortb/model/g$b;->serializer()Lkotlinx/serialization/KSerializer;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {p1, v0, v1}, LXf/c;->a(Ljava/lang/String;Lkotlinx/serialization/KSerializer;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Lcom/moloco/sdk/internal/ortb/model/y;

    .line 26
    .line 27
    invoke-static {p1}, Lcom/moloco/sdk/internal/ortb/g;->a(Lcom/moloco/sdk/internal/ortb/model/y;)Lcom/moloco/sdk/internal/ortb/model/y;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    new-instance v0, Lcom/moloco/sdk/internal/z;

    .line 32
    .line 33
    invoke-direct {v0, p1}, Lcom/moloco/sdk/internal/z;-><init>(Ljava/lang/Object;)V
    :try_end_0
    .catch LSf/b; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    .line 35
    .line 36
    return-object v0

    .line 37
    :catch_0
    move-exception p1

    .line 38
    goto :goto_0

    .line 39
    :catch_1
    move-exception p1

    .line 40
    goto :goto_1

    .line 41
    :catch_2
    move-exception p1

    .line 42
    goto :goto_2

    .line 43
    :goto_0
    new-instance v0, Lcom/moloco/sdk/internal/y;

    .line 44
    .line 45
    new-instance v1, Lcom/moloco/sdk/internal/ortb/a;

    .line 46
    .line 47
    invoke-direct {v1, p1}, Lcom/moloco/sdk/internal/ortb/a;-><init>(Ljava/lang/Exception;)V

    .line 48
    .line 49
    .line 50
    invoke-direct {v0, v1}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto :goto_3

    .line 54
    :goto_1
    throw p1

    .line 55
    :goto_2
    new-instance v0, Lcom/moloco/sdk/internal/y;

    .line 56
    .line 57
    new-instance v1, Lcom/moloco/sdk/internal/ortb/b;

    .line 58
    .line 59
    iget-object p1, p1, LSf/b;->a:Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-direct {v1, p1}, Lcom/moloco/sdk/internal/ortb/b;-><init>(Ljava/util/ArrayList;)V

    .line 62
    .line 63
    .line 64
    invoke-direct {v0, v1}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    :goto_3
    return-object v0
.end method
