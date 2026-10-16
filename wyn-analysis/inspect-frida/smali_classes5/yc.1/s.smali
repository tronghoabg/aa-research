.class public final Lyc/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lyc/B;

.field public b:Lyc/u;

.field public c:Lyc/w;

.field public d:Ljava/lang/Boolean;

.field public e:Ljava/lang/Boolean;


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_2

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const-class v3, Lyc/s;

    .line 13
    .line 14
    if-eq v3, v2, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    check-cast p1, Lyc/s;

    .line 18
    .line 19
    iget-object v2, p0, Lyc/s;->a:Lyc/B;

    .line 20
    .line 21
    iget-object v3, p1, Lyc/s;->a:Lyc/B;

    .line 22
    .line 23
    invoke-virtual {v2, v3}, Lyc/B;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_2

    .line 28
    .line 29
    iget-object v2, p0, Lyc/s;->b:Lyc/u;

    .line 30
    .line 31
    iget-object v3, p1, Lyc/s;->b:Lyc/u;

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    iget-object v2, p0, Lyc/s;->c:Lyc/w;

    .line 40
    .line 41
    iget-object v3, p1, Lyc/s;->c:Lyc/w;

    .line 42
    .line 43
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_2

    .line 48
    .line 49
    iget-object v2, p0, Lyc/s;->d:Ljava/lang/Boolean;

    .line 50
    .line 51
    iget-object v3, p1, Lyc/s;->d:Ljava/lang/Boolean;

    .line 52
    .line 53
    invoke-virtual {v2, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_2

    .line 58
    .line 59
    iget-object v2, p0, Lyc/s;->e:Ljava/lang/Boolean;

    .line 60
    .line 61
    iget-object p1, p1, Lyc/s;->e:Ljava/lang/Boolean;

    .line 62
    .line 63
    invoke-virtual {v2, p1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-eqz p1, :cond_2

    .line 68
    .line 69
    return v0

    .line 70
    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 7

    .line 1
    iget-object v0, p0, Lyc/s;->a:Lyc/B;

    .line 2
    .line 3
    iget-object v1, p0, Lyc/s;->b:Lyc/u;

    .line 4
    .line 5
    iget-object v2, p0, Lyc/s;->c:Lyc/w;

    .line 6
    .line 7
    iget-object v3, p0, Lyc/s;->d:Ljava/lang/Boolean;

    .line 8
    .line 9
    iget-object v4, p0, Lyc/s;->e:Ljava/lang/Boolean;

    .line 10
    .line 11
    const/4 v5, 0x5

    .line 12
    new-array v5, v5, [Ljava/lang/Object;

    .line 13
    .line 14
    const/4 v6, 0x0

    .line 15
    aput-object v0, v5, v6

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    aput-object v1, v5, v0

    .line 19
    .line 20
    const/4 v0, 0x2

    .line 21
    aput-object v2, v5, v0

    .line 22
    .line 23
    const/4 v0, 0x3

    .line 24
    aput-object v3, v5, v0

    .line 25
    .line 26
    const/4 v0, 0x4

    .line 27
    aput-object v4, v5, v0

    .line 28
    .line 29
    invoke-static {v5}, Lj$/util/Objects;->hash([Ljava/lang/Object;)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    return v0
.end method
