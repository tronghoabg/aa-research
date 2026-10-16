.class public final LEf/u0;
.super LEf/q0;
.source "SourceFile"


# instance fields
.field public final synthetic e:I

.field public final f:LMf/i;

.field public final synthetic g:LEf/z0;


# direct methods
.method public synthetic constructor <init>(LEf/z0;LMf/i;I)V
    .locals 0

    .line 1
    iput p3, p0, LEf/u0;->e:I

    iput-object p1, p0, LEf/u0;->g:LEf/z0;

    invoke-direct {p0}, LJf/j;-><init>()V

    iput-object p2, p0, LEf/u0;->f:LMf/i;

    return-void
.end method


# virtual methods
.method public final i()Z
    .locals 1

    .line 1
    iget v0, p0, LEf/u0;->e:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    return v0

    :pswitch_0
    const/4 v0, 0x0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final j(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget p1, p0, LEf/u0;->e:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object p1, Lef/C;->a:Lef/C;

    .line 7
    .line 8
    iget-object v0, p0, LEf/u0;->f:LMf/i;

    .line 9
    .line 10
    check-cast v0, LMf/h;

    .line 11
    .line 12
    iget-object v1, p0, LEf/u0;->g:LEf/z0;

    .line 13
    .line 14
    invoke-virtual {v0, v1, p1}, LMf/h;->g(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    iget-object p1, p0, LEf/u0;->g:LEf/z0;

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    sget-object v0, LEf/z0;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    instance-of v1, v0, LEf/x;

    .line 30
    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-static {v0}, LEf/H;->N(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    :goto_0
    iget-object v1, p0, LEf/u0;->f:LMf/i;

    .line 39
    .line 40
    check-cast v1, LMf/h;

    .line 41
    .line 42
    invoke-virtual {v1, p1, v0}, LMf/h;->g(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
