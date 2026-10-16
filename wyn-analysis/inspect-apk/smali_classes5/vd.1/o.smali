.class public final Lvd/o;
.super Lmd/i;
.source "SourceFile"


# instance fields
.field public final synthetic b:Lvd/p;


# direct methods
.method public constructor <init>(Lvd/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lvd/o;->b:Lvd/p;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final m(Lmd/k0;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lvd/o;->b:Lvd/p;

    .line 2
    .line 3
    iget-object v0, v0, Lvd/p;->a:Lvd/k;

    .line 4
    .line 5
    invoke-virtual {p1}, Lmd/k0;->f()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iget-object v1, v0, Lvd/k;->a:Lvd/m;

    .line 10
    .line 11
    iget-object v2, v1, Lvd/m;->e:LS3/i;

    .line 12
    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    iget-object v1, v1, Lvd/m;->f:LW9/u;

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    if-eqz p1, :cond_1

    .line 21
    .line 22
    iget-object p1, v0, Lvd/k;->b:Lt6/q;

    .line 23
    .line 24
    iget-object p1, p1, Lt6/q;->a:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Ljava/util/concurrent/atomic/AtomicLong;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    iget-object p1, v0, Lvd/k;->b:Lt6/q;

    .line 33
    .line 34
    iget-object p1, p1, Lt6/q;->b:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p1, Ljava/util/concurrent/atomic/AtomicLong;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    .line 39
    .line 40
    .line 41
    return-void
.end method
