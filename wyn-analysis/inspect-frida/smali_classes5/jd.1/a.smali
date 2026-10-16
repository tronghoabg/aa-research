.class public final Ljd/a;
.super Lhd/a;
.source "SourceFile"


# instance fields
.field public e:Z


# virtual methods
.method public final q()V
    .locals 8

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
    iget-object v1, v0, LU1/u;->b0:LN1/Y;

    .line 9
    .line 10
    iget v3, v1, LN1/Y;->a:I

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    iget v4, v1, LN1/Y;->b:I

    .line 14
    .line 15
    if-eqz v3, :cond_1

    .line 16
    .line 17
    if-eqz v4, :cond_1

    .line 18
    .line 19
    iget-boolean v1, p0, Ljd/a;->e:Z

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {v0}, LU1/u;->S0()V

    .line 25
    .line 26
    .line 27
    iget-object v1, v0, LU1/u;->M:LN1/n;

    .line 28
    .line 29
    invoke-static {v1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    iget v1, v1, LN1/n;->x:I

    .line 33
    .line 34
    :try_start_0
    invoke-static {v1}, Lcom/google/android/gms/internal/consent_sdk/a;->b(I)I

    .line 35
    .line 36
    .line 37
    move-result v2
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    :catch_0
    :cond_1
    :goto_0
    invoke-virtual {v0}, LU1/u;->q0()J

    .line 39
    .line 40
    .line 41
    move-result-wide v5

    .line 42
    move v0, v2

    .line 43
    iget-object v2, p0, Lhd/a;->d:Lad/L;

    .line 44
    .line 45
    invoke-static {v0}, Lcom/google/android/gms/internal/consent_sdk/a;->i(I)I

    .line 46
    .line 47
    .line 48
    move-result v7

    .line 49
    invoke-virtual/range {v2 .. v7}, Lad/L;->s(IIJI)V

    .line 50
    .line 51
    .line 52
    return-void
.end method
