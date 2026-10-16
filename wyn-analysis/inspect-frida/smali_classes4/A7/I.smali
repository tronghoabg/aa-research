.class public final LA7/I;
.super LA7/Y;
.source "SourceFile"


# instance fields
.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:I

.field public f:Ljava/lang/String;

.field public g:J

.field public h:J

.field public i:Ljava/util/List;

.field public j:Ljava/lang/String;

.field public k:I

.field public l:Ljava/lang/String;

.field public m:Ljava/lang/String;

.field public n:Ljava/lang/String;

.field public o:J

.field public p:Ljava/lang/String;


# virtual methods
.method public final j0()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final k0()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, LA7/Y;->h0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LA7/I;->c:Ljava/lang/String;

    .line 5
    .line 6
    invoke-static {v0}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, LA7/I;->c:Ljava/lang/String;

    .line 10
    .line 11
    return-object v0
.end method

.method public final l0()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, LA7/B;->c0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LA7/Y;->h0()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, LA7/I;->l:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, LA7/I;->l:Ljava/lang/String;

    .line 13
    .line 14
    return-object v0
.end method

.method public final m0()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0}, LA7/B;->c0()V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, LA7/B0;->a0()LA7/Z;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, LA7/Z;->n0()LA7/F0;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    sget-object v2, LA7/E0;->c:LA7/E0;

    .line 14
    .line 15
    invoke-virtual {v1, v2}, LA7/F0;->i(LA7/E0;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-string v1, "Analytics Storage consent is not granted"

    .line 26
    .line 27
    iget-object v0, v0, LA7/N;->m:LA7/P;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, LA7/P;->c(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/16 v1, 0x10

    .line 35
    .line 36
    new-array v1, v1, [B

    .line 37
    .line 38
    invoke-virtual {p0}, LA7/B0;->b0()LA7/U1;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v2}, LA7/U1;->r1()Ljava/security/SecureRandom;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v2, v1}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 47
    .line 48
    .line 49
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 50
    .line 51
    new-instance v3, Ljava/math/BigInteger;

    .line 52
    .line 53
    invoke-direct {v3, v0, v1}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 54
    .line 55
    .line 56
    new-array v0, v0, [Ljava/lang/Object;

    .line 57
    .line 58
    const/4 v1, 0x0

    .line 59
    aput-object v3, v0, v1

    .line 60
    .line 61
    const-string v1, "%032x"

    .line 62
    .line 63
    invoke-static {v2, v1, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    :goto_0
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    if-nez v0, :cond_1

    .line 72
    .line 73
    const-string v2, "null"

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_1
    const-string v2, "not null"

    .line 77
    .line 78
    :goto_1
    const-string v3, "Resetting session stitching token to "

    .line 79
    .line 80
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    iget-object v1, v1, LA7/N;->m:LA7/P;

    .line 85
    .line 86
    invoke-virtual {v1, v2}, LA7/P;->c(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    iput-object v0, p0, LA7/I;->n:Ljava/lang/String;

    .line 90
    .line 91
    iget-object v0, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v0, LA7/n0;

    .line 94
    .line 95
    iget-object v0, v0, LA7/n0;->n:Ln7/b;

    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 101
    .line 102
    .line 103
    move-result-wide v0

    .line 104
    iput-wide v0, p0, LA7/I;->o:J

    .line 105
    .line 106
    return-void
.end method
