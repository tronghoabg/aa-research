.class public final LA7/B1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN2/g;
.implements LS5/d;


# instance fields
.field public final synthetic a:I

.field public b:J

.field public c:J

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LA7/B1;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(IIJ)V
    .locals 0

    iput p2, p0, LA7/B1;->a:I

    packed-switch p2, :pswitch_data_0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iget-object p2, p0, LA7/B1;->d:Ljava/lang/Object;

    check-cast p2, Lt6/a;

    if-nez p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-static {p2}, Lu6/a;->i(Z)V

    .line 12
    iput-wide p3, p0, LA7/B1;->b:J

    int-to-long p1, p1

    add-long/2addr p3, p1

    .line 13
    iput-wide p3, p0, LA7/B1;->c:J

    return-void

    .line 14
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iget-object p2, p0, LA7/B1;->d:Ljava/lang/Object;

    check-cast p2, Lo2/a;

    if-nez p2, :cond_1

    const/4 p2, 0x1

    goto :goto_1

    :cond_1
    const/4 p2, 0x0

    :goto_1
    invoke-static {p2}, LQ1/k;->g(Z)V

    .line 16
    iput-wide p3, p0, LA7/B1;->b:J

    int-to-long p1, p1

    add-long/2addr p3, p1

    .line 17
    iput-wide p3, p0, LA7/B1;->c:J

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(LA7/x1;)V
    .locals 3

    const/4 v0, 0x0

    iput v0, p0, LA7/B1;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA7/B1;->e:Ljava/lang/Object;

    .line 3
    new-instance v0, LA7/C1;

    iget-object v1, p1, LA7/B0;->a:Ljava/lang/Object;

    check-cast v1, LA7/n0;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, LA7/C1;-><init>(Ljava/lang/Object;LA7/C0;I)V

    iput-object v0, p0, LA7/B1;->d:Ljava/lang/Object;

    .line 4
    iget-object p1, p1, LA7/B0;->a:Ljava/lang/Object;

    check-cast p1, LA7/n0;

    .line 5
    iget-object p1, p1, LA7/n0;->n:Ln7/b;

    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    .line 8
    iput-wide v0, p0, LA7/B1;->b:J

    .line 9
    iput-wide v0, p0, LA7/B1;->c:J

    return-void
.end method


# virtual methods
.method public a()LJ5/t;
    .locals 5

    .line 1
    iget-wide v0, p0, LA7/B1;->b:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lu6/a;->i(Z)V

    .line 2
    new-instance v0, LJ5/o;

    iget-object v1, p0, LA7/B1;->d:Ljava/lang/Object;

    check-cast v1, LJ5/p;

    iget-wide v2, p0, LA7/B1;->b:J

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, LJ5/o;-><init>(Ljava/lang/Object;JI)V

    return-object v0
.end method

.method public a()Ls2/w;
    .locals 5

    .line 3
    iget-wide v0, p0, LA7/B1;->b:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, LQ1/k;->g(Z)V

    .line 4
    new-instance v0, Ls2/q;

    iget-object v1, p0, LA7/B1;->d:Ljava/lang/Object;

    check-cast v1, LJ5/p;

    iget-wide v2, p0, LA7/B1;->b:J

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Ls2/q;-><init>(Ljava/lang/Object;JI)V

    return-object v0
.end method

.method public b(J)V
    .locals 2

    .line 1
    iget v0, p0, LA7/B1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA7/B1;->e:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LS3/e;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    iget-object v0, v0, LS3/e;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, [J

    .line 14
    .line 15
    invoke-static {v0, p1, p2, v1}, Lu6/v;->e([JJZ)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    aget-wide p1, v0, p1

    .line 20
    .line 21
    iput-wide p1, p0, LA7/B1;->c:J

    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_0
    iget-object v0, p0, LA7/B1;->e:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, LY2/B;

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    iget-object v0, v0, LY2/B;->b:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, [J

    .line 32
    .line 33
    invoke-static {v0, p1, p2, v1}, LQ1/x;->e([JJZ)I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    aget-wide p1, v0, p1

    .line 38
    .line 39
    iput-wide p1, p0, LA7/B1;->c:J

    .line 40
    .line 41
    return-void

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public c(JZZ)Z
    .locals 6

    .line 1
    iget-object v0, p0, LA7/B1;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LA7/x1;

    .line 4
    .line 5
    invoke-virtual {v0}, LA7/B;->c0()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, LA7/Y;->h0()V

    .line 9
    .line 10
    .line 11
    iget-object v1, v0, LA7/B0;->a:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, LA7/n0;

    .line 14
    .line 15
    invoke-virtual {v1}, LA7/n0;->e()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0}, LA7/B0;->a0()LA7/Z;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    iget-object v3, v1, LA7/n0;->n:Ln7/b;

    .line 26
    .line 27
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 31
    .line 32
    .line 33
    move-result-wide v3

    .line 34
    iget-object v2, v2, LA7/Z;->q:LA7/a0;

    .line 35
    .line 36
    invoke-virtual {v2, v3, v4}, LA7/a0;->f(J)V

    .line 37
    .line 38
    .line 39
    :cond_0
    iget-wide v2, p0, LA7/B1;->b:J

    .line 40
    .line 41
    sub-long v2, p1, v2

    .line 42
    .line 43
    if-nez p3, :cond_1

    .line 44
    .line 45
    const-wide/16 v4, 0x3e8

    .line 46
    .line 47
    cmp-long p3, v2, v4

    .line 48
    .line 49
    if-gez p3, :cond_1

    .line 50
    .line 51
    invoke-virtual {v0}, LA7/B0;->zzj()LA7/N;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    iget-object p1, p1, LA7/N;->n:LA7/P;

    .line 60
    .line 61
    const-string p3, "Screen exposed for less than 1000 ms. Event not sent. time"

    .line 62
    .line 63
    invoke-virtual {p1, p3, p2}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    const/4 p1, 0x0

    .line 67
    return p1

    .line 68
    :cond_1
    if-nez p4, :cond_2

    .line 69
    .line 70
    iget-wide v2, p0, LA7/B1;->c:J

    .line 71
    .line 72
    sub-long v2, p1, v2

    .line 73
    .line 74
    iput-wide p1, p0, LA7/B1;->c:J

    .line 75
    .line 76
    :cond_2
    invoke-virtual {v0}, LA7/B0;->zzj()LA7/N;

    .line 77
    .line 78
    .line 79
    move-result-object p3

    .line 80
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    iget-object p3, p3, LA7/N;->n:LA7/P;

    .line 85
    .line 86
    const-string v5, "Recording user engagement, ms"

    .line 87
    .line 88
    invoke-virtual {p3, v5, v4}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    new-instance p3, Landroid/os/Bundle;

    .line 92
    .line 93
    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    .line 94
    .line 95
    .line 96
    const-string v4, "_et"

    .line 97
    .line 98
    invoke-virtual {p3, v4, v2, v3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 99
    .line 100
    .line 101
    iget-object v1, v1, LA7/n0;->g:LA7/e;

    .line 102
    .line 103
    invoke-virtual {v1}, LA7/e;->q0()Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    const/4 v2, 0x1

    .line 108
    xor-int/2addr v1, v2

    .line 109
    invoke-virtual {v0}, LA7/B;->f0()LA7/i1;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    invoke-virtual {v3, v1}, LA7/i1;->k0(Z)LA7/j1;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-static {v1, p3, v2}, LA7/U1;->u0(LA7/j1;Landroid/os/Bundle;Z)V

    .line 118
    .line 119
    .line 120
    if-nez p4, :cond_3

    .line 121
    .line 122
    invoke-virtual {v0}, LA7/B;->e0()LA7/P0;

    .line 123
    .line 124
    .line 125
    move-result-object p4

    .line 126
    const-string v0, "auto"

    .line 127
    .line 128
    const-string v1, "_e"

    .line 129
    .line 130
    invoke-virtual {p4, v0, v1, p3}, LA7/P0;->H0(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 131
    .line 132
    .line 133
    :cond_3
    iput-wide p1, p0, LA7/B1;->b:J

    .line 134
    .line 135
    iget-object p1, p0, LA7/B1;->d:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast p1, LA7/C1;

    .line 138
    .line 139
    invoke-virtual {p1}, LA7/n;->a()V

    .line 140
    .line 141
    .line 142
    sget-object p2, LA7/y;->d0:LA7/D;

    .line 143
    .line 144
    const/4 p3, 0x0

    .line 145
    invoke-virtual {p2, p3}, LA7/D;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p2

    .line 149
    check-cast p2, Ljava/lang/Long;

    .line 150
    .line 151
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 152
    .line 153
    .line 154
    move-result-wide p2

    .line 155
    invoke-virtual {p1, p2, p3}, LA7/n;->b(J)V

    .line 156
    .line 157
    .line 158
    return v2
.end method

.method public d(LJ5/h;)J
    .locals 6

    .line 1
    iget-wide v0, p0, LA7/B1;->c:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long p1, v0, v2

    .line 6
    .line 7
    const-wide/16 v2, -0x1

    .line 8
    .line 9
    if-ltz p1, :cond_0

    .line 10
    .line 11
    const-wide/16 v4, 0x2

    .line 12
    .line 13
    add-long/2addr v0, v4

    .line 14
    neg-long v0, v0

    .line 15
    iput-wide v2, p0, LA7/B1;->c:J

    .line 16
    .line 17
    return-wide v0

    .line 18
    :cond_0
    return-wide v2
.end method

.method public f(Ls2/j;)J
    .locals 6

    .line 1
    iget-wide v0, p0, LA7/B1;->c:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long p1, v0, v2

    .line 6
    .line 7
    const-wide/16 v2, -0x1

    .line 8
    .line 9
    if-ltz p1, :cond_0

    .line 10
    .line 11
    const-wide/16 v4, 0x2

    .line 12
    .line 13
    add-long/2addr v0, v4

    .line 14
    neg-long v0, v0

    .line 15
    iput-wide v2, p0, LA7/B1;->c:J

    .line 16
    .line 17
    return-wide v0

    .line 18
    :cond_0
    return-wide v2
.end method
