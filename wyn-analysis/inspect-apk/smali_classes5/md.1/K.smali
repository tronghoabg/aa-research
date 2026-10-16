.class public final Lmd/K;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:Lmd/K;


# instance fields
.field public final a:Lmd/e;

.field public final b:Lvd/p;

.field public final c:Lmd/k0;

.field public final d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lmd/K;

    .line 2
    .line 3
    sget-object v1, Lmd/k0;->e:Lmd/k0;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    invoke-direct {v0, v3, v3, v1, v2}, Lmd/K;-><init>(Lmd/e;Lvd/p;Lmd/k0;Z)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lmd/K;->e:Lmd/K;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Lmd/e;Lvd/p;Lmd/k0;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lmd/K;->a:Lmd/e;

    .line 5
    .line 6
    iput-object p2, p0, Lmd/K;->b:Lvd/p;

    .line 7
    .line 8
    const-string p1, "status"

    .line 9
    .line 10
    invoke-static {p3, p1}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iput-object p3, p0, Lmd/K;->c:Lmd/k0;

    .line 14
    .line 15
    iput-boolean p4, p0, Lmd/K;->d:Z

    .line 16
    .line 17
    return-void
.end method

.method public static a(Lmd/k0;)Lmd/K;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lmd/k0;->f()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    xor-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    const-string v1, "error status shouldn\'t be OK"

    .line 8
    .line 9
    invoke-static {v1, v0}, LFe/e;->p(Ljava/lang/String;Z)V

    .line 10
    .line 11
    .line 12
    new-instance v0, Lmd/K;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-direct {v0, v2, v2, p0, v1}, Lmd/K;-><init>(Lmd/e;Lvd/p;Lmd/k0;Z)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public static b(Lmd/e;Lvd/p;)Lmd/K;
    .locals 3

    .line 1
    new-instance v0, Lmd/K;

    .line 2
    .line 3
    const-string v1, "subchannel"

    .line 4
    .line 5
    invoke-static {p0, v1}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v1, Lmd/k0;->e:Lmd/k0;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v0, p0, p1, v1, v2}, Lmd/K;-><init>(Lmd/e;Lvd/p;Lmd/k0;Z)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lmd/K;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    check-cast p1, Lmd/K;

    .line 7
    .line 8
    iget-object v0, p1, Lmd/K;->a:Lmd/e;

    .line 9
    .line 10
    iget-object v1, p0, Lmd/K;->a:Lmd/e;

    .line 11
    .line 12
    invoke-static {v1, v0}, LFe/b;->v(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, Lmd/K;->c:Lmd/k0;

    .line 19
    .line 20
    iget-object v1, p1, Lmd/K;->c:Lmd/k0;

    .line 21
    .line 22
    invoke-static {v0, v1}, LFe/b;->v(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget-object v0, p0, Lmd/K;->b:Lvd/p;

    .line 29
    .line 30
    iget-object v1, p1, Lmd/K;->b:Lvd/p;

    .line 31
    .line 32
    invoke-static {v0, v1}, LFe/b;->v(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    iget-boolean v0, p0, Lmd/K;->d:Z

    .line 39
    .line 40
    iget-boolean p1, p1, Lmd/K;->d:Z

    .line 41
    .line 42
    if-ne v0, p1, :cond_1

    .line 43
    .line 44
    const/4 p1, 0x1

    .line 45
    return p1

    .line 46
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 47
    return p1
.end method

.method public final hashCode()I
    .locals 6

    .line 1
    iget-boolean v0, p0, Lmd/K;->d:Z

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lmd/K;->c:Lmd/k0;

    .line 8
    .line 9
    iget-object v2, p0, Lmd/K;->b:Lvd/p;

    .line 10
    .line 11
    iget-object v3, p0, Lmd/K;->a:Lmd/e;

    .line 12
    .line 13
    const/4 v4, 0x4

    .line 14
    new-array v4, v4, [Ljava/lang/Object;

    .line 15
    .line 16
    const/4 v5, 0x0

    .line 17
    aput-object v3, v4, v5

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    aput-object v1, v4, v3

    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    aput-object v2, v4, v1

    .line 24
    .line 25
    const/4 v1, 0x3

    .line 26
    aput-object v0, v4, v1

    .line 27
    .line 28
    invoke-static {v4}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {p0}, LBa/c;->S(Ljava/lang/Object;)LA7/b0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "subchannel"

    .line 6
    .line 7
    iget-object v2, p0, Lmd/K;->a:Lmd/e;

    .line 8
    .line 9
    invoke-virtual {v0, v2, v1}, LA7/b0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v1, "streamTracerFactory"

    .line 13
    .line 14
    iget-object v2, p0, Lmd/K;->b:Lvd/p;

    .line 15
    .line 16
    invoke-virtual {v0, v2, v1}, LA7/b0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const-string v1, "status"

    .line 20
    .line 21
    iget-object v2, p0, Lmd/K;->c:Lmd/k0;

    .line 22
    .line 23
    invoke-virtual {v0, v2, v1}, LA7/b0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v1, "drop"

    .line 27
    .line 28
    iget-boolean v2, p0, Lmd/K;->d:Z

    .line 29
    .line 30
    invoke-virtual {v0, v1, v2}, LA7/b0;->g(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, LA7/b0;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    return-object v0
.end method
