.class public final LD6/X0;
.super LD6/v0;
.source "SourceFile"


# virtual methods
.method public final zze(LD6/K0;)V
    .locals 5

    .line 1
    invoke-static {}, LD6/Z0;->d()LD6/Z0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, LD6/Z0;->k:Lx6/p;

    .line 6
    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    move-object v2, v1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance v2, Lx6/c;

    .line 15
    .line 16
    iget-object v3, p1, LD6/K0;->b:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v4, p1, LD6/K0;->c:Ljava/lang/String;

    .line 19
    .line 20
    iget p1, p1, LD6/K0;->a:I

    .line 21
    .line 22
    invoke-direct {v2, p1, v3, v4, v1}, Lx6/a;-><init>(ILjava/lang/String;Ljava/lang/String;Lx6/a;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    check-cast v0, La2/c;

    .line 26
    .line 27
    iget-object p1, v0, La2/c;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, Ltc/g;

    .line 30
    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    iget v0, v2, Lx6/a;->a:I

    .line 34
    .line 35
    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iget-object v1, v2, Lx6/a;->b:Ljava/lang/String;

    .line 40
    .line 41
    iget-object v2, v2, Lx6/a;->c:Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {p1, v0, v1, v2}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_1
    invoke-virtual {p1, v1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    :cond_2
    return-void
.end method
