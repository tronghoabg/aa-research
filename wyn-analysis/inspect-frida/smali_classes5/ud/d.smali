.class public final Lud/d;
.super Lmd/e;
.source "SourceFile"


# instance fields
.field public final d:Lud/a;

.field public e:Lcom/google/protobuf/MessageLite;

.field public f:Z


# direct methods
.method public constructor <init>(Lud/a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lud/d;->f:Z

    .line 6
    .line 7
    iput-object p1, p0, Lud/d;->d:Lud/a;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final i(Lmd/k0;Lmd/b0;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lmd/k0;->f()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lud/d;->d:Lud/a;

    .line 6
    .line 7
    if-eqz v0, :cond_3

    .line 8
    .line 9
    iget-boolean p1, p0, Lud/d;->f:Z

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    sget-object p1, Lmd/k0;->m:Lmd/k0;

    .line 14
    .line 15
    const-string v0, "No value received for unary call"

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    new-instance v0, Lmd/m0;

    .line 22
    .line 23
    invoke-direct {v0, p1, p2}, Lmd/m0;-><init>(Lmd/k0;Lmd/b0;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v0}, Lud/a;->j(Ljava/lang/Throwable;)Z

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object p1, p0, Lud/d;->e:Lcom/google/protobuf/MessageLite;

    .line 30
    .line 31
    if-nez p1, :cond_1

    .line 32
    .line 33
    sget-object p1, Lp8/m;->g:Ljava/lang/Object;

    .line 34
    .line 35
    :cond_1
    sget-object p2, Lp8/m;->f:Lic/d;

    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    invoke-virtual {p2, v1, v0, p1}, Lic/d;->i(Lp8/m;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    const/4 p1, 0x0

    .line 45
    invoke-static {v1, p1}, Lp8/m;->c(Lp8/m;Z)V

    .line 46
    .line 47
    .line 48
    :cond_2
    return-void

    .line 49
    :cond_3
    new-instance v0, Lmd/m0;

    .line 50
    .line 51
    invoke-direct {v0, p1, p2}, Lmd/m0;-><init>(Lmd/k0;Lmd/b0;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v0}, Lud/a;->j(Ljava/lang/Throwable;)Z

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public final k(Lmd/b0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final l(Lcom/google/protobuf/MessageLite;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lud/d;->f:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lud/d;->e:Lcom/google/protobuf/MessageLite;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    iput-boolean p1, p0, Lud/d;->f:Z

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    sget-object p1, Lmd/k0;->m:Lmd/k0;

    .line 12
    .line 13
    const-string v0, "More than one value received for unary call"

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Lmd/k0;->a()Lmd/m0;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    throw p1
.end method
