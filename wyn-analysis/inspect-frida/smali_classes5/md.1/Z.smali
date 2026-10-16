.class public final Lmd/Z;
.super Lmd/Y;
.source "SourceFile"


# instance fields
.field public final e:Lmd/a0;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLmd/a0;)V
    .locals 2

    .line 1
    invoke-direct {p0, p2, p1, p3}, Lmd/Y;-><init>(ZLjava/lang/String;Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    const-string p2, "-bin"

    .line 5
    .line 6
    invoke-virtual {p1, p2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iput-object p3, p0, Lmd/Z;->e:Lmd/a0;

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    new-instance p3, Ljava/lang/IllegalArgumentException;

    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    new-array v0, v0, [Ljava/lang/Object;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    aput-object p1, v0, v1

    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    aput-object p2, v0, p1

    .line 25
    .line 26
    const-string p1, "ASCII header is named %s.  Only binary headers may end with %s"

    .line 27
    .line 28
    invoke-static {p1, v0}, LFe/g;->E(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-direct {p3, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p3
.end method


# virtual methods
.method public final a([B)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lmd/Z;->e:Lmd/a0;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lmd/a0;->g([B)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final b(Ljava/lang/Object;)[B
    .locals 1

    .line 1
    iget-object v0, p0, Lmd/Z;->e:Lmd/a0;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lmd/a0;->a(Ljava/lang/Object;)[B

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const-string v0, "null marshaller.toAsciiString()"

    .line 8
    .line 9
    invoke-static {p1, v0}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method
