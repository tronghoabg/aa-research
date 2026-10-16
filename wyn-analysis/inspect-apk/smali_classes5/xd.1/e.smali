.class public final Lxd/e;
.super Lxd/c;
.source "SourceFile"


# instance fields
.field public final f:[B

.field public final g:Z


# direct methods
.method public constructor <init>(Lwd/c;LFd/b;LGd/a;[B)V
    .locals 1

    .line 1
    const-string v0, "client"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lxd/c;-><init>(Lwd/c;)V

    .line 7
    .line 8
    .line 9
    iput-object p4, p0, Lxd/e;->f:[B

    .line 10
    .line 11
    new-instance p1, Lxd/f;

    .line 12
    .line 13
    invoke-direct {p1, p0, p2}, Lxd/f;-><init>(Lxd/e;LFd/b;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lxd/c;->b:LFd/b;

    .line 17
    .line 18
    new-instance p1, LGd/a;

    .line 19
    .line 20
    invoke-direct {p1, p0, p4, p3}, LGd/a;-><init>(Lxd/e;[BLGd/a;)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lxd/c;->c:LGd/a;

    .line 24
    .line 25
    invoke-static {p3}, Lff/B;->h(LGd/a;)Ljava/lang/Long;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    array-length p3, p4

    .line 30
    int-to-long p3, p3

    .line 31
    invoke-interface {p2}, LFd/b;->h()LJd/s;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-static {p1, p3, p4, p2}, Lp7/b;->j(Ljava/lang/Long;JLJd/s;)V

    .line 36
    .line 37
    .line 38
    const/4 p1, 0x1

    .line 39
    iput-boolean p1, p0, Lxd/e;->g:Z

    .line 40
    .line 41
    return-void
.end method


# virtual methods
.method public final c()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lxd/e;->g:Z

    .line 2
    .line 3
    return v0
.end method

.method public final f()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lxd/e;->f:[B

    .line 2
    .line 3
    invoke-static {v0}, Lio/ktor/utils/io/N;->a([B)Lio/ktor/utils/io/a0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
