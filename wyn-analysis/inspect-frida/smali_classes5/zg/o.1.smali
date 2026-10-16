.class public final Lzg/o;
.super Lzg/q;
.source "SourceFile"


# instance fields
.field public final d:Lzg/e;


# direct methods
.method public constructor <init>(Lzg/P;Lokhttp3/Call$Factory;Lzg/j;Lzg/e;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lzg/q;-><init>(Lzg/P;Lokhttp3/Call$Factory;Lzg/j;)V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lzg/o;->d:Lzg/e;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final b(Lzg/w;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lzg/o;->d:Lzg/e;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lzg/e;->e(Lzg/w;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lzg/c;

    .line 8
    .line 9
    array-length v0, p2

    .line 10
    const/4 v1, 0x1

    .line 11
    sub-int/2addr v0, v1

    .line 12
    aget-object p2, p2, v0

    .line 13
    .line 14
    check-cast p2, Ljf/c;

    .line 15
    .line 16
    :try_start_0
    new-instance v0, LEf/n;

    .line 17
    .line 18
    invoke-static {p2}, LA6/h;->A(Ljf/c;)Ljf/c;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-direct {v0, v1, v2}, LEf/n;-><init>(ILjf/c;)V

    .line 23
    .line 24
    .line 25
    new-instance v1, Lzg/s;

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    invoke-direct {v1, p1, v2}, Lzg/s;-><init>(Lzg/c;I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, LEf/n;->v(Ltf/l;)V

    .line 32
    .line 33
    .line 34
    new-instance v1, Ltc/j;

    .line 35
    .line 36
    invoke-direct {v1, v0}, Ltc/j;-><init>(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-interface {p1, v1}, Lzg/c;->i(Lzg/f;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, LEf/n;->s()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    sget-object p2, Lkf/a;->a:Lkf/a;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    .line 48
    return-object p1

    .line 49
    :catch_0
    move-exception p1

    .line 50
    invoke-static {p1, p2}, Lzg/a0;->n(Ljava/lang/Exception;Ljf/c;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    return-object p1
.end method
