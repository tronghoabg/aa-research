.class public final Lcom/moloco/sdk/internal/ilrd/A;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LKd/a;

.field public final b:Lcom/moloco/sdk/internal/ilrd/m;

.field public final c:Lef/p;

.field public final d:Ljava/util/Set;

.field public e:LEf/H0;


# direct methods
.method public constructor <init>(LKd/a;Landroid/content/Context;Lcom/moloco/sdk/internal/ilrd/m;Lcom/google/protobuf/Internal$ListAdapter;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/moloco/sdk/internal/ilrd/A;->a:LKd/a;

    .line 5
    .line 6
    iput-object p3, p0, Lcom/moloco/sdk/internal/ilrd/A;->b:Lcom/moloco/sdk/internal/ilrd/m;

    .line 7
    .line 8
    new-instance p1, Lcom/moloco/sdk/internal/ilrd/x;

    .line 9
    .line 10
    invoke-direct {p1, p4, p2, p0}, Lcom/moloco/sdk/internal/ilrd/x;-><init>(Lcom/google/protobuf/Internal$ListAdapter;Landroid/content/Context;Lcom/moloco/sdk/internal/ilrd/A;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, LFe/c;->z(Ltf/a;)Lef/p;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Lcom/moloco/sdk/internal/ilrd/A;->c:Lef/p;

    .line 18
    .line 19
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 20
    .line 21
    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-static {p1}, Lj$/util/DesugarCollections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, Lcom/moloco/sdk/internal/ilrd/A;->d:Ljava/util/Set;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final a()Lcom/moloco/sdk/internal/services/bidtoken/providers/o;
    .locals 13

    .line 1
    iget-object v1, p0, Lcom/moloco/sdk/internal/ilrd/A;->b:Lcom/moloco/sdk/internal/ilrd/m;

    .line 2
    .line 3
    monitor-enter v1

    .line 4
    :try_start_0
    invoke-virtual {v1}, Lcom/moloco/sdk/internal/ilrd/m;->c()V

    .line 5
    .line 6
    .line 7
    new-instance v0, Lcom/moloco/sdk/internal/ilrd/f;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v0, v1, v2}, Lcom/moloco/sdk/internal/ilrd/f;-><init>(Lcom/moloco/sdk/internal/ilrd/m;Ljf/c;)V

    .line 11
    .line 12
    .line 13
    iget-object v3, v1, Lcom/moloco/sdk/internal/ilrd/m;->m:LC8/i;

    .line 14
    .line 15
    iget-wide v4, v1, Lcom/moloco/sdk/internal/ilrd/m;->d:J

    .line 16
    .line 17
    invoke-virtual {v3, v4, v5, v0}, LC8/i;->b(JLtf/l;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    monitor-exit v1

    .line 21
    iget-object v0, v1, Lcom/moloco/sdk/internal/ilrd/m;->q:Lcom/moloco/sdk/internal/ilrd/r;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/moloco/sdk/internal/ilrd/r;->b()Lcom/moloco/sdk/internal/ilrd/o;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    new-instance v2, Lcom/moloco/sdk/internal/services/bidtoken/providers/o;

    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/moloco/sdk/internal/ilrd/r;->c()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    iget v11, v1, Lcom/moloco/sdk/internal/ilrd/o;->e:I

    .line 36
    .line 37
    iget v12, v1, Lcom/moloco/sdk/internal/ilrd/o;->f:I

    .line 38
    .line 39
    iget-wide v4, v0, Lcom/moloco/sdk/internal/ilrd/r;->d:J

    .line 40
    .line 41
    iget-wide v6, v1, Lcom/moloco/sdk/internal/ilrd/o;->a:J

    .line 42
    .line 43
    iget v8, v1, Lcom/moloco/sdk/internal/ilrd/o;->b:I

    .line 44
    .line 45
    iget v9, v1, Lcom/moloco/sdk/internal/ilrd/o;->c:I

    .line 46
    .line 47
    iget v10, v1, Lcom/moloco/sdk/internal/ilrd/o;->d:I

    .line 48
    .line 49
    invoke-direct/range {v2 .. v12}, Lcom/moloco/sdk/internal/services/bidtoken/providers/o;-><init>(Ljava/lang/String;JJIIIII)V

    .line 50
    .line 51
    .line 52
    return-object v2

    .line 53
    :cond_0
    sget-object v3, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 54
    .line 55
    const-string v4, "IlrdService"

    .line 56
    .line 57
    const-string v5, "provideDataForBidToken() Session is null"

    .line 58
    .line 59
    const/4 v6, 0x0

    .line 60
    const/4 v7, 0x0

    .line 61
    const/16 v8, 0xc

    .line 62
    .line 63
    const/4 v9, 0x0

    .line 64
    invoke-static/range {v3 .. v9}, Lcom/moloco/sdk/internal/MolocoLogger;->warn$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    return-object v2

    .line 68
    :catchall_0
    move-exception v0

    .line 69
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 70
    throw v0
.end method
