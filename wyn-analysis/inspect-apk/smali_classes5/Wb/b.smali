.class public LWb/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqc/b;


# instance fields
.field public a:Luc/r;

.field public b:Luc/j;

.field public c:LWb/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final onAttachedToEngine(Lqc/a;)V
    .locals 3

    .line 1
    iget-object v0, p1, Lqc/a;->c:Luc/f;

    .line 2
    .line 3
    new-instance v1, Luc/r;

    .line 4
    .line 5
    const-string v2, "dev.fluttercommunity.plus/connectivity"

    .line 6
    .line 7
    invoke-direct {v1, v0, v2}, Luc/r;-><init>(Luc/f;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iput-object v1, p0, LWb/b;->a:Luc/r;

    .line 11
    .line 12
    new-instance v1, Luc/j;

    .line 13
    .line 14
    const-string v2, "dev.fluttercommunity.plus/connectivity_status"

    .line 15
    .line 16
    invoke-direct {v1, v0, v2}, Luc/j;-><init>(Luc/f;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iput-object v1, p0, LWb/b;->b:Luc/j;

    .line 20
    .line 21
    iget-object p1, p1, Lqc/a;->a:Landroid/content/Context;

    .line 22
    .line 23
    const-string v0, "connectivity"

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Landroid/net/ConnectivityManager;

    .line 30
    .line 31
    new-instance v1, Lxa/d;

    .line 32
    .line 33
    const/16 v2, 0x19

    .line 34
    .line 35
    invoke-direct {v1, v0, v2}, Lxa/d;-><init>(Ljava/lang/Object;I)V

    .line 36
    .line 37
    .line 38
    new-instance v0, Ly3/j;

    .line 39
    .line 40
    invoke-direct {v0, v1, v2}, Ly3/j;-><init>(Ljava/lang/Object;I)V

    .line 41
    .line 42
    .line 43
    new-instance v2, LWb/a;

    .line 44
    .line 45
    invoke-direct {v2, p1, v1}, LWb/a;-><init>(Landroid/content/Context;Lxa/d;)V

    .line 46
    .line 47
    .line 48
    iput-object v2, p0, LWb/b;->c:LWb/a;

    .line 49
    .line 50
    iget-object p1, p0, LWb/b;->a:Luc/r;

    .line 51
    .line 52
    invoke-virtual {p1, v0}, Luc/r;->b(Luc/p;)V

    .line 53
    .line 54
    .line 55
    iget-object p1, p0, LWb/b;->b:Luc/j;

    .line 56
    .line 57
    iget-object v0, p0, LWb/b;->c:LWb/a;

    .line 58
    .line 59
    invoke-virtual {p1, v0}, Luc/j;->a(Luc/i;)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public final onDetachedFromEngine(Lqc/a;)V
    .locals 1

    .line 1
    iget-object p1, p0, LWb/b;->a:Luc/r;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p1, v0}, Luc/r;->b(Luc/p;)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, LWb/b;->b:Luc/j;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Luc/j;->a(Luc/i;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, LWb/b;->c:LWb/a;

    .line 13
    .line 14
    invoke-virtual {p1, v0}, LWb/a;->onCancel(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, LWb/b;->a:Luc/r;

    .line 18
    .line 19
    iput-object v0, p0, LWb/b;->b:Luc/j;

    .line 20
    .line 21
    iput-object v0, p0, LWb/b;->c:LWb/a;

    .line 22
    .line 23
    return-void
.end method
