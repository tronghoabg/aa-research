.class public final Lid/b;
.super Lhd/a;
.source "SourceFile"


# virtual methods
.method public final q()V
    .locals 9

    .line 1
    iget-object v0, p0, Lhd/a;->c:LU1/m;

    .line 2
    .line 3
    check-cast v0, LU1/u;

    .line 4
    .line 5
    invoke-virtual {v0}, LU1/u;->S0()V

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, LU1/u;->M:LN1/n;

    .line 9
    .line 10
    invoke-static {v1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    iget v2, v1, LN1/n;->x:I

    .line 14
    .line 15
    invoke-static {v2}, Lcom/google/android/gms/internal/consent_sdk/a;->b(I)I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v3, 0x2

    .line 20
    iget v4, v1, LN1/n;->u:I

    .line 21
    .line 22
    iget v1, v1, LN1/n;->v:I

    .line 23
    .line 24
    if-eq v2, v3, :cond_1

    .line 25
    .line 26
    const/4 v3, 0x4

    .line 27
    if-ne v2, v3, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move v5, v1

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    :goto_0
    const/4 v2, 0x0

    .line 33
    invoke-static {v2}, Lcom/google/android/gms/internal/consent_sdk/a;->b(I)I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    move v5, v4

    .line 38
    move v4, v1

    .line 39
    :goto_1
    invoke-virtual {v0}, LU1/u;->q0()J

    .line 40
    .line 41
    .line 42
    move-result-wide v6

    .line 43
    iget-object v3, p0, Lhd/a;->d:Lad/L;

    .line 44
    .line 45
    invoke-static {v2}, Lcom/google/android/gms/internal/consent_sdk/a;->i(I)I

    .line 46
    .line 47
    .line 48
    move-result v8

    .line 49
    invoke-virtual/range {v3 .. v8}, Lad/L;->s(IIJI)V

    .line 50
    .line 51
    .line 52
    return-void
.end method
