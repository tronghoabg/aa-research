.class public final Luc/r;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Luc/f;

.field public final b:Ljava/lang/String;

.field public final c:Luc/s;

.field public final d:Lab/b;


# direct methods
.method public constructor <init>(Luc/f;Ljava/lang/String;)V
    .locals 2

    .line 1
    sget-object v0, Luc/x;->b:Luc/x;

    const/4 v1, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0, v1}, Luc/r;-><init>(Luc/f;Ljava/lang/String;Luc/s;Lab/b;)V

    return-void
.end method

.method public constructor <init>(Luc/f;Ljava/lang/String;Luc/s;Lab/b;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Luc/r;->a:Luc/f;

    .line 5
    iput-object p2, p0, Luc/r;->b:Ljava/lang/String;

    .line 6
    iput-object p3, p0, Luc/r;->c:Luc/s;

    .line 7
    iput-object p4, p0, Luc/r;->d:Lab/b;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/Object;Luc/q;)V
    .locals 1

    .line 1
    new-instance v0, Luc/o;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Luc/o;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Luc/r;->c:Luc/s;

    .line 7
    .line 8
    invoke-interface {p1, v0}, Luc/s;->d(Luc/o;)Ljava/nio/ByteBuffer;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-nez p3, :cond_0

    .line 13
    .line 14
    const/4 p2, 0x0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p2, Luc/a;

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    invoke-direct {p2, v0, p0, p3}, Luc/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    :goto_0
    iget-object p3, p0, Luc/r;->a:Luc/f;

    .line 23
    .line 24
    iget-object v0, p0, Luc/r;->b:Ljava/lang/String;

    .line 25
    .line 26
    invoke-interface {p3, v0, p1, p2}, Luc/f;->j(Ljava/lang/String;Ljava/nio/ByteBuffer;Luc/e;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final b(Luc/p;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Luc/r;->b:Ljava/lang/String;

    .line 3
    .line 4
    iget-object v2, p0, Luc/r;->a:Luc/f;

    .line 5
    .line 6
    iget-object v3, p0, Luc/r;->d:Lab/b;

    .line 7
    .line 8
    if-eqz v3, :cond_1

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    new-instance v0, Lt6/q;

    .line 14
    .line 15
    invoke-direct {v0, p0, p1}, Lt6/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-interface {v2, v1, v0, v3}, Luc/f;->i(Ljava/lang/String;Luc/d;Lab/b;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    if-nez p1, :cond_2

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_2
    new-instance v0, Lt6/q;

    .line 26
    .line 27
    invoke-direct {v0, p0, p1}, Lt6/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    :goto_1
    invoke-interface {v2, v1, v0}, Luc/f;->l(Ljava/lang/String;Luc/d;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method
