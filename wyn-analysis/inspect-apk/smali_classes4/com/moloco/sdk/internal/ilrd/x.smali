.class public final synthetic Lcom/moloco/sdk/internal/ilrd/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/a;


# instance fields
.field public final synthetic a:Lcom/google/protobuf/Internal$ListAdapter;

.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Lcom/moloco/sdk/internal/ilrd/A;


# direct methods
.method public synthetic constructor <init>(Lcom/google/protobuf/Internal$ListAdapter;Landroid/content/Context;Lcom/moloco/sdk/internal/ilrd/A;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/moloco/sdk/internal/ilrd/x;->a:Lcom/google/protobuf/Internal$ListAdapter;

    iput-object p2, p0, Lcom/moloco/sdk/internal/ilrd/x;->b:Landroid/content/Context;

    iput-object p3, p0, Lcom/moloco/sdk/internal/ilrd/x;->c:Lcom/moloco/sdk/internal/ilrd/A;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 12

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lcom/moloco/sdk/J0;->c:Lcom/moloco/sdk/J0;

    .line 7
    .line 8
    iget-object v2, p0, Lcom/moloco/sdk/internal/ilrd/x;->a:Lcom/google/protobuf/Internal$ListAdapter;

    .line 9
    .line 10
    invoke-virtual {v2, v1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    iget-object v3, p0, Lcom/moloco/sdk/internal/ilrd/x;->b:Landroid/content/Context;

    .line 15
    .line 16
    iget-object v4, p0, Lcom/moloco/sdk/internal/ilrd/x;->c:Lcom/moloco/sdk/internal/ilrd/A;

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    sget-object v5, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 21
    .line 22
    const/16 v10, 0xc

    .line 23
    .line 24
    const/4 v11, 0x0

    .line 25
    const-string v6, "IlrdService"

    .line 26
    .line 27
    const-string v7, "Adding AppLovin as ILRD provider"

    .line 28
    .line 29
    const/4 v8, 0x0

    .line 30
    const/4 v9, 0x0

    .line 31
    invoke-static/range {v5 .. v11}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    new-instance v1, Lcom/moloco/sdk/internal/ilrd/provider/d;

    .line 35
    .line 36
    iget-object v5, v4, Lcom/moloco/sdk/internal/ilrd/A;->a:LKd/a;

    .line 37
    .line 38
    invoke-direct {v1, v3, v5}, Lcom/moloco/sdk/internal/ilrd/provider/d;-><init>(Landroid/content/Context;LKd/a;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    :cond_0
    sget-object v1, Lcom/moloco/sdk/J0;->d:Lcom/moloco/sdk/J0;

    .line 45
    .line 46
    invoke-virtual {v2, v1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_1

    .line 51
    .line 52
    sget-object v5, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 53
    .line 54
    const/16 v10, 0xc

    .line 55
    .line 56
    const/4 v11, 0x0

    .line 57
    const-string v6, "IlrdService"

    .line 58
    .line 59
    const-string v7, "Adding IronSource as ILRD provider"

    .line 60
    .line 61
    const/4 v8, 0x0

    .line 62
    const/4 v9, 0x0

    .line 63
    invoke-static/range {v5 .. v11}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    new-instance v1, Lcom/moloco/sdk/internal/ilrd/provider/g;

    .line 67
    .line 68
    iget-object v2, v4, Lcom/moloco/sdk/internal/ilrd/A;->a:LKd/a;

    .line 69
    .line 70
    invoke-direct {v1, v3, v2}, Lcom/moloco/sdk/internal/ilrd/provider/g;-><init>(Landroid/content/Context;LKd/a;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    :cond_1
    invoke-static {v0}, Lff/o;->S0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    return-object v0
.end method
