.class final Lj$/util/concurrent/g;
.super Ljava/util/concurrent/CountedCompleter;
.source "SourceFile"


# instance fields
.field a:[Lj$/util/concurrent/l;

.field b:Lj$/util/concurrent/l;

.field c:Lj$/util/concurrent/o;

.field d:Lj$/util/concurrent/o;

.field e:I

.field f:I

.field g:I

.field final h:I

.field i:I

.field final j:Ljava/util/function/Consumer;


# direct methods
.method constructor <init>(Lj$/util/concurrent/g;III[Lj$/util/concurrent/l;Ljava/util/function/Consumer;)V
    .locals 0

    .line 4891
    invoke-direct {p0, p1}, Ljava/util/concurrent/CountedCompleter;-><init>(Ljava/util/concurrent/CountedCompleter;)V

    .line 4892
    iput p2, p0, Lj$/util/concurrent/g;->i:I

    .line 4893
    iput p3, p0, Lj$/util/concurrent/g;->f:I

    iput p3, p0, Lj$/util/concurrent/g;->e:I

    .line 4894
    iput-object p5, p0, Lj$/util/concurrent/g;->a:[Lj$/util/concurrent/l;

    if-nez p5, :cond_0

    const/4 p1, 0x0

    .line 4895
    iput p1, p0, Lj$/util/concurrent/g;->g:I

    iput p1, p0, Lj$/util/concurrent/g;->h:I

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    .line 4897
    array-length p1, p5

    iput p1, p0, Lj$/util/concurrent/g;->g:I

    iput p1, p0, Lj$/util/concurrent/g;->h:I

    goto :goto_0

    .line 4899
    :cond_1
    iput p4, p0, Lj$/util/concurrent/g;->g:I

    .line 4900
    iget p1, p1, Lj$/util/concurrent/g;->h:I

    iput p1, p0, Lj$/util/concurrent/g;->h:I

    .line 5009
    :goto_0
    iput-object p6, p0, Lj$/util/concurrent/g;->j:Ljava/util/function/Consumer;

    return-void
.end method


# virtual methods
.method public final compute()V
    .locals 10

    .line 5013
    iget-object v6, p0, Lj$/util/concurrent/g;->j:Ljava/util/function/Consumer;

    if-eqz v6, :cond_c

    .line 5014
    iget v7, p0, Lj$/util/concurrent/g;->f:I

    :goto_0
    iget v0, p0, Lj$/util/concurrent/g;->i:I

    const/4 v1, 0x1

    if-lez v0, :cond_0

    iget v4, p0, Lj$/util/concurrent/g;->g:I

    add-int v0, v4, v7

    ushr-int/lit8 v3, v0, 0x1

    if-le v3, v7, :cond_0

    .line 5016
    invoke-virtual {p0, v1}, Ljava/util/concurrent/CountedCompleter;->addToPendingCount(I)V

    .line 5017
    new-instance v0, Lj$/util/concurrent/g;

    iget v2, p0, Lj$/util/concurrent/g;->i:I

    ushr-int/2addr v2, v1

    iput v2, p0, Lj$/util/concurrent/g;->i:I

    iput v3, p0, Lj$/util/concurrent/g;->g:I

    iget-object v5, p0, Lj$/util/concurrent/g;->a:[Lj$/util/concurrent/l;

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, Lj$/util/concurrent/g;-><init>(Lj$/util/concurrent/g;III[Lj$/util/concurrent/l;Ljava/util/function/Consumer;)V

    move-object v9, v1

    move-object v1, v0

    move-object v0, v9

    .line 5019
    invoke-virtual {v1}, Ljava/util/concurrent/ForkJoinTask;->fork()Ljava/util/concurrent/ForkJoinTask;

    goto :goto_0

    :cond_0
    move-object v0, p0

    .line 4909
    :goto_1
    iget-object v2, v0, Lj$/util/concurrent/g;->b:Lj$/util/concurrent/l;

    if-eqz v2, :cond_1

    .line 4910
    iget-object v2, v2, Lj$/util/concurrent/l;->d:Lj$/util/concurrent/l;

    :cond_1
    :goto_2
    if-eqz v2, :cond_2

    .line 4914
    iput-object v2, v0, Lj$/util/concurrent/g;->b:Lj$/util/concurrent/l;

    goto/16 :goto_7

    .line 4915
    :cond_2
    iget v2, v0, Lj$/util/concurrent/g;->f:I

    iget v3, v0, Lj$/util/concurrent/g;->g:I

    const/4 v4, 0x0

    if-ge v2, v3, :cond_a

    iget-object v2, v0, Lj$/util/concurrent/g;->a:[Lj$/util/concurrent/l;

    if-eqz v2, :cond_a

    array-length v3, v2

    iget v5, v0, Lj$/util/concurrent/g;->e:I

    if-le v3, v5, :cond_a

    if-gez v5, :cond_3

    goto/16 :goto_6

    .line 4918
    :cond_3
    invoke-static {v2, v5}, Lj$/util/concurrent/ConcurrentHashMap;->k([Lj$/util/concurrent/l;I)Lj$/util/concurrent/l;

    move-result-object v7

    if-eqz v7, :cond_7

    iget v8, v7, Lj$/util/concurrent/l;->a:I

    if-gez v8, :cond_7

    .line 4919
    instance-of v8, v7, Lj$/util/concurrent/h;

    if-eqz v8, :cond_5

    .line 4920
    check-cast v7, Lj$/util/concurrent/h;

    iget-object v7, v7, Lj$/util/concurrent/h;->e:[Lj$/util/concurrent/l;

    iput-object v7, v0, Lj$/util/concurrent/g;->a:[Lj$/util/concurrent/l;

    .line 4938
    iget-object v7, v0, Lj$/util/concurrent/g;->d:Lj$/util/concurrent/o;

    if-eqz v7, :cond_4

    .line 4940
    iget-object v8, v7, Lj$/util/concurrent/o;->d:Lj$/util/concurrent/o;

    iput-object v8, v0, Lj$/util/concurrent/g;->d:Lj$/util/concurrent/o;

    goto :goto_3

    .line 4942
    :cond_4
    new-instance v7, Lj$/util/concurrent/o;

    .line 3304
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 4943
    :goto_3
    iput-object v2, v7, Lj$/util/concurrent/o;->c:[Lj$/util/concurrent/l;

    .line 4944
    iput v3, v7, Lj$/util/concurrent/o;->a:I

    .line 4945
    iput v5, v7, Lj$/util/concurrent/o;->b:I

    .line 4946
    iget-object v2, v0, Lj$/util/concurrent/g;->c:Lj$/util/concurrent/o;

    iput-object v2, v7, Lj$/util/concurrent/o;->d:Lj$/util/concurrent/o;

    .line 4947
    iput-object v7, v0, Lj$/util/concurrent/g;->c:Lj$/util/concurrent/o;

    move-object v2, v4

    goto :goto_2

    .line 4925
    :cond_5
    instance-of v2, v7, Lj$/util/concurrent/q;

    if-eqz v2, :cond_6

    .line 4926
    check-cast v7, Lj$/util/concurrent/q;

    iget-object v2, v7, Lj$/util/concurrent/q;->f:Lj$/util/concurrent/r;

    goto :goto_4

    :cond_6
    move-object v2, v4

    goto :goto_4

    :cond_7
    move-object v2, v7

    .line 4930
    :goto_4
    iget-object v7, v0, Lj$/util/concurrent/g;->c:Lj$/util/concurrent/o;

    if-eqz v7, :cond_9

    .line 4952
    :goto_5
    iget-object v5, v0, Lj$/util/concurrent/g;->c:Lj$/util/concurrent/o;

    if-eqz v5, :cond_8

    iget v7, v0, Lj$/util/concurrent/g;->e:I

    iget v8, v5, Lj$/util/concurrent/o;->a:I

    add-int/2addr v7, v8

    iput v7, v0, Lj$/util/concurrent/g;->e:I

    if-lt v7, v3, :cond_8

    .line 4954
    iget v3, v5, Lj$/util/concurrent/o;->b:I

    iput v3, v0, Lj$/util/concurrent/g;->e:I

    .line 4955
    iget-object v3, v5, Lj$/util/concurrent/o;->c:[Lj$/util/concurrent/l;

    iput-object v3, v0, Lj$/util/concurrent/g;->a:[Lj$/util/concurrent/l;

    .line 4956
    iput-object v4, v5, Lj$/util/concurrent/o;->c:[Lj$/util/concurrent/l;

    .line 4957
    iget-object v3, v5, Lj$/util/concurrent/o;->d:Lj$/util/concurrent/o;

    .line 4958
    iget-object v7, v0, Lj$/util/concurrent/g;->d:Lj$/util/concurrent/o;

    iput-object v7, v5, Lj$/util/concurrent/o;->d:Lj$/util/concurrent/o;

    .line 4959
    iput-object v3, v0, Lj$/util/concurrent/g;->c:Lj$/util/concurrent/o;

    .line 4960
    iput-object v5, v0, Lj$/util/concurrent/g;->d:Lj$/util/concurrent/o;

    move v3, v8

    goto :goto_5

    :cond_8
    if-nez v5, :cond_1

    .line 4962
    iget v4, v0, Lj$/util/concurrent/g;->e:I

    iget v5, v0, Lj$/util/concurrent/g;->h:I

    add-int/2addr v4, v5

    iput v4, v0, Lj$/util/concurrent/g;->e:I

    if-lt v4, v3, :cond_1

    .line 4963
    iget v3, v0, Lj$/util/concurrent/g;->f:I

    add-int/2addr v3, v1

    iput v3, v0, Lj$/util/concurrent/g;->f:I

    iput v3, v0, Lj$/util/concurrent/g;->e:I

    goto/16 :goto_2

    .line 4932
    :cond_9
    iget v4, v0, Lj$/util/concurrent/g;->h:I

    add-int/2addr v5, v4

    iput v5, v0, Lj$/util/concurrent/g;->e:I

    if-lt v5, v3, :cond_1

    .line 4933
    iget v3, v0, Lj$/util/concurrent/g;->f:I

    add-int/2addr v3, v1

    iput v3, v0, Lj$/util/concurrent/g;->f:I

    iput v3, v0, Lj$/util/concurrent/g;->e:I

    goto/16 :goto_2

    .line 4917
    :cond_a
    :goto_6
    iput-object v4, v0, Lj$/util/concurrent/g;->b:Lj$/util/concurrent/l;

    move-object v2, v4

    :goto_7
    if-eqz v2, :cond_b

    .line 5022
    iget-object v2, v2, Lj$/util/concurrent/l;->c:Ljava/lang/Object;

    invoke-interface {v6, v2}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 5023
    :cond_b
    invoke-virtual {p0}, Ljava/util/concurrent/CountedCompleter;->propagateCompletion()V

    return-void

    :cond_c
    move-object v0, p0

    return-void
.end method
