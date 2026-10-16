.class public abstract Lhb/r;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public final failOnUnknown()Lhb/r;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhb/r;"
        }
    .end annotation

    .line 1
    new-instance v0, Lhb/p;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, p0, v1}, Lhb/p;-><init>(Lhb/r;I)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public final fromJson(Lcg/i;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcg/i;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 10
    new-instance v0, Lhb/x;

    invoke-direct {v0, p1}, Lhb/x;-><init>(Lcg/i;)V

    .line 11
    invoke-virtual {p0, v0}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public abstract fromJson(Lhb/w;)Ljava/lang/Object;
.end method

.method public final fromJson(Ljava/lang/String;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Lcg/g;

    .line 2
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-virtual {v0, p1}, Lcg/g;->d0(Ljava/lang/String;)V

    .line 4
    new-instance p1, Lhb/x;

    invoke-direct {p1, v0}, Lhb/x;-><init>(Lcg/i;)V

    .line 5
    invoke-virtual {p0, p1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v0

    .line 6
    invoke-virtual {p0}, Lhb/r;->isLenient()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p1}, Lhb/x;->P()Lhb/v;

    move-result-object p1

    sget-object v1, Lhb/v;->j:Lhb/v;

    if-ne p1, v1, :cond_0

    goto :goto_0

    .line 7
    :cond_0
    new-instance p1, LE5/Q;

    .line 8
    const-string v0, "JSON document was not fully consumed."

    const/16 v1, 0xb

    invoke-direct {p1, v0, v1}, LE5/Q;-><init>(Ljava/lang/String;I)V

    .line 9
    throw p1

    :cond_1
    :goto_0
    return-object v0
.end method

.method public final fromJsonValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lhb/A;

    .line 2
    .line 3
    invoke-direct {v0}, Lhb/w;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, v0, Lhb/w;->b:[I

    .line 7
    .line 8
    iget v2, v0, Lhb/w;->a:I

    .line 9
    .line 10
    const/4 v3, 0x7

    .line 11
    aput v3, v1, v2

    .line 12
    .line 13
    const/16 v1, 0x20

    .line 14
    .line 15
    new-array v1, v1, [Ljava/lang/Object;

    .line 16
    .line 17
    iput-object v1, v0, Lhb/A;->g:[Ljava/lang/Object;

    .line 18
    .line 19
    add-int/lit8 v3, v2, 0x1

    .line 20
    .line 21
    iput v3, v0, Lhb/w;->a:I

    .line 22
    .line 23
    aput-object p1, v1, v2

    .line 24
    .line 25
    :try_start_0
    invoke-virtual {p0, v0}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    return-object p1

    .line 30
    :catch_0
    move-exception p1

    .line 31
    new-instance v0, Ljava/lang/AssertionError;

    .line 32
    .line 33
    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    throw v0
.end method

.method public indent(Ljava/lang/String;)Lhb/r;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lhb/r;"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance v0, Lhb/g;

    .line 4
    .line 5
    invoke-direct {v0, p1, p0}, Lhb/g;-><init>(Ljava/lang/String;Lhb/r;)V

    .line 6
    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 10
    .line 11
    const-string v0, "indent == null"

    .line 12
    .line 13
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    throw p1
.end method

.method public isLenient()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final lenient()Lhb/r;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhb/r;"
        }
    .end annotation

    .line 1
    new-instance v0, Lhb/p;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p0, v1}, Lhb/p;-><init>(Lhb/r;I)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public final nonNull()Lhb/r;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhb/r;"
        }
    .end annotation

    .line 1
    instance-of v0, p0, Lib/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Lib/a;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lib/a;-><init>(Lhb/r;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public final nullSafe()Lhb/r;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhb/r;"
        }
    .end annotation

    .line 1
    instance-of v0, p0, Lib/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Lib/b;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lib/b;-><init>(Lhb/r;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public final serializeNulls()Lhb/r;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhb/r;"
        }
    .end annotation

    .line 1
    new-instance v0, Lhb/p;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lhb/p;-><init>(Lhb/r;I)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public final toJson(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcg/g;

    .line 2
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 3
    :try_start_0
    invoke-virtual {p0, v0, p1}, Lhb/r;->toJson(Lcg/h;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    invoke-virtual {v0}, Lcg/g;->readUtf8()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    .line 5
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public final toJson(Lcg/h;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcg/h;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 6
    new-instance v0, Lhb/y;

    invoke-direct {v0, p1}, Lhb/y;-><init>(Lcg/h;)V

    .line 7
    invoke-virtual {p0, v0, p2}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    return-void
.end method

.method public abstract toJson(Lhb/C;Ljava/lang/Object;)V
.end method

.method public final toJsonValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lhb/B;

    .line 2
    .line 3
    invoke-direct {v0}, Lhb/C;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x20

    .line 7
    .line 8
    new-array v1, v1, [Ljava/lang/Object;

    .line 9
    .line 10
    iput-object v1, v0, Lhb/B;->j:[Ljava/lang/Object;

    .line 11
    .line 12
    const/4 v1, 0x6

    .line 13
    invoke-virtual {v0, v1}, Lhb/C;->B(I)V

    .line 14
    .line 15
    .line 16
    :try_start_0
    invoke-virtual {p0, v0, p1}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget p1, v0, Lhb/C;->a:I

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    if-gt p1, v1, :cond_1

    .line 23
    .line 24
    if-ne p1, v1, :cond_0

    .line 25
    .line 26
    iget-object v2, v0, Lhb/C;->b:[I

    .line 27
    .line 28
    sub-int/2addr p1, v1

    .line 29
    aget p1, v2, p1

    .line 30
    .line 31
    const/4 v1, 0x7

    .line 32
    if-ne p1, v1, :cond_1

    .line 33
    .line 34
    :cond_0
    iget-object p1, v0, Lhb/B;->j:[Ljava/lang/Object;

    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    aget-object p1, p1, v0

    .line 38
    .line 39
    return-object p1

    .line 40
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    const-string v0, "Incomplete document"

    .line 43
    .line 44
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    :catch_0
    move-exception p1

    .line 49
    new-instance v0, Ljava/lang/AssertionError;

    .line 50
    .line 51
    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    throw v0
.end method
