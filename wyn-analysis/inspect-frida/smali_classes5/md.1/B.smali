.class public final Lmd/B;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lmd/A;

.field public final c:J

.field public final d:Lod/o0;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lmd/A;JLod/o0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lmd/B;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lmd/B;->b:Lmd/A;

    .line 7
    .line 8
    iput-wide p3, p0, Lmd/B;->c:J

    .line 9
    .line 10
    iput-object p5, p0, Lmd/B;->d:Lod/o0;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    instance-of v0, p1, Lmd/B;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lmd/B;

    .line 6
    .line 7
    iget-object v0, p1, Lmd/B;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v1, p0, Lmd/B;->a:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v1, v0}, LFe/b;->v(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lmd/B;->b:Lmd/A;

    .line 18
    .line 19
    iget-object v1, p1, Lmd/B;->b:Lmd/A;

    .line 20
    .line 21
    invoke-static {v0, v1}, LFe/b;->v(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iget-wide v0, p0, Lmd/B;->c:J

    .line 28
    .line 29
    iget-wide v2, p1, Lmd/B;->c:J

    .line 30
    .line 31
    cmp-long v0, v0, v2

    .line 32
    .line 33
    if-nez v0, :cond_0

    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    invoke-static {v0, v0}, LFe/b;->v(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    iget-object v0, p0, Lmd/B;->d:Lod/o0;

    .line 43
    .line 44
    iget-object p1, p1, Lmd/B;->d:Lod/o0;

    .line 45
    .line 46
    invoke-static {v0, p1}, LFe/b;->v(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_0

    .line 51
    .line 52
    const/4 p1, 0x1

    .line 53
    return p1

    .line 54
    :cond_0
    const/4 p1, 0x0

    .line 55
    return p1
.end method

.method public final hashCode()I
    .locals 6

    .line 1
    iget-wide v0, p0, Lmd/B;->c:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lmd/B;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v2, p0, Lmd/B;->b:Lmd/A;

    .line 10
    .line 11
    iget-object v3, p0, Lmd/B;->d:Lod/o0;

    .line 12
    .line 13
    const/4 v4, 0x5

    .line 14
    new-array v4, v4, [Ljava/lang/Object;

    .line 15
    .line 16
    const/4 v5, 0x0

    .line 17
    aput-object v1, v4, v5

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    aput-object v2, v4, v1

    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    aput-object v0, v4, v1

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    const/4 v1, 0x3

    .line 27
    aput-object v0, v4, v1

    .line 28
    .line 29
    const/4 v0, 0x4

    .line 30
    aput-object v3, v4, v0

    .line 31
    .line 32
    invoke-static {v4}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    invoke-static {p0}, LBa/c;->S(Ljava/lang/Object;)LA7/b0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "description"

    .line 6
    .line 7
    iget-object v2, p0, Lmd/B;->a:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v0, v2, v1}, LA7/b0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v1, "severity"

    .line 13
    .line 14
    iget-object v2, p0, Lmd/B;->b:Lmd/A;

    .line 15
    .line 16
    invoke-virtual {v0, v2, v1}, LA7/b0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const-string v1, "timestampNanos"

    .line 20
    .line 21
    iget-wide v2, p0, Lmd/B;->c:J

    .line 22
    .line 23
    invoke-virtual {v0, v2, v3, v1}, LA7/b0;->e(JLjava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v1, "channelRef"

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    invoke-virtual {v0, v2, v1}, LA7/b0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const-string v1, "subchannelRef"

    .line 33
    .line 34
    iget-object v2, p0, Lmd/B;->d:Lod/o0;

    .line 35
    .line 36
    invoke-virtual {v0, v2, v1}, LA7/b0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, LA7/b0;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    return-object v0
.end method
