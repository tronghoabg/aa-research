.class public abstract Lhd/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lad/L;

.field public final b:Lio/flutter/view/TextureRegistry$SurfaceProducer;

.field public c:Laa/f;

.field public final d:LU1/m;


# direct methods
.method public constructor <init>(Lad/L;LN1/w;Ls8/b;Lio/flutter/view/TextureRegistry$SurfaceProducer;Lid/c;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lhd/o;->a:Lad/L;

    .line 5
    .line 6
    iput-object p4, p0, Lhd/o;->b:Lio/flutter/view/TextureRegistry$SurfaceProducer;

    .line 7
    .line 8
    iget p1, p5, Lid/c;->a:I

    .line 9
    .line 10
    packed-switch p1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    new-instance p1, LU1/k;

    .line 14
    .line 15
    iget-object v0, p5, Lid/c;->b:Landroid/content/Context;

    .line 16
    .line 17
    invoke-direct {p1, v0}, LU1/k;-><init>(Landroid/content/Context;)V

    .line 18
    .line 19
    .line 20
    iget-object p5, p5, Lid/c;->c:LJ8/a;

    .line 21
    .line 22
    invoke-virtual {p5, v0}, LJ8/a;->c(Landroid/content/Context;)Lk2/G;

    .line 23
    .line 24
    .line 25
    move-result-object p5

    .line 26
    iget-boolean v0, p1, LU1/k;->s:Z

    .line 27
    .line 28
    xor-int/lit8 v0, v0, 0x1

    .line 29
    .line 30
    invoke-static {v0}, LQ1/k;->g(Z)V

    .line 31
    .line 32
    .line 33
    new-instance v0, LE5/J;

    .line 34
    .line 35
    const/4 v1, 0x3

    .line 36
    invoke-direct {v0, p5, v1}, LE5/J;-><init>(Ljava/lang/Object;I)V

    .line 37
    .line 38
    .line 39
    iput-object v0, p1, LU1/k;->d:Lk8/p;

    .line 40
    .line 41
    invoke-virtual {p1}, LU1/k;->a()LU1/u;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    :goto_0
    move-object v0, p1

    .line 46
    goto :goto_1

    .line 47
    :pswitch_0
    new-instance p1, LU1/k;

    .line 48
    .line 49
    iget-object v0, p5, Lid/c;->b:Landroid/content/Context;

    .line 50
    .line 51
    invoke-direct {p1, v0}, LU1/k;-><init>(Landroid/content/Context;)V

    .line 52
    .line 53
    .line 54
    iget-object p5, p5, Lid/c;->c:LJ8/a;

    .line 55
    .line 56
    invoke-virtual {p5, v0}, LJ8/a;->c(Landroid/content/Context;)Lk2/G;

    .line 57
    .line 58
    .line 59
    move-result-object p5

    .line 60
    iget-boolean v0, p1, LU1/k;->s:Z

    .line 61
    .line 62
    xor-int/lit8 v0, v0, 0x1

    .line 63
    .line 64
    invoke-static {v0}, LQ1/k;->g(Z)V

    .line 65
    .line 66
    .line 67
    new-instance v0, LE5/J;

    .line 68
    .line 69
    const/4 v1, 0x3

    .line 70
    invoke-direct {v0, p5, v1}, LE5/J;-><init>(Ljava/lang/Object;I)V

    .line 71
    .line 72
    .line 73
    iput-object v0, p1, LU1/k;->d:Lk8/p;

    .line 74
    .line 75
    invoke-virtual {p1}, LU1/k;->a()LU1/u;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    goto :goto_0

    .line 80
    :goto_1
    iput-object v0, p0, Lhd/o;->d:LU1/m;

    .line 81
    .line 82
    invoke-static {p2}, Ll8/K;->n(Ljava/lang/Object;)Ll8/e0;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-virtual {v0}, LU1/u;->S0()V

    .line 87
    .line 88
    .line 89
    new-instance v1, Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 92
    .line 93
    .line 94
    const/4 p2, 0x0

    .line 95
    move p5, p2

    .line 96
    :goto_2
    iget v2, p1, Ll8/e0;->d:I

    .line 97
    .line 98
    if-ge p5, v2, :cond_0

    .line 99
    .line 100
    invoke-virtual {p1, p5}, Ll8/e0;->get(I)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    check-cast v2, LN1/w;

    .line 105
    .line 106
    iget-object v3, v0, LU1/u;->q:Lk2/G;

    .line 107
    .line 108
    invoke-interface {v3, v2}, Lk2/G;->c(LN1/w;)Lk2/a;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    add-int/lit8 p5, p5, 0x1

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_0
    invoke-virtual {v0}, LU1/u;->S0()V

    .line 119
    .line 120
    .line 121
    const/4 v5, -0x1

    .line 122
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    const/4 v2, 0x1

    .line 128
    invoke-virtual/range {v0 .. v5}, LU1/u;->F0(Ljava/util/List;ZJI)V

    .line 129
    .line 130
    .line 131
    iget-object p1, p0, Lhd/o;->d:LU1/m;

    .line 132
    .line 133
    check-cast p1, LU1/u;

    .line 134
    .line 135
    invoke-virtual {p1}, LU1/u;->z0()V

    .line 136
    .line 137
    .line 138
    iget-object p1, p0, Lhd/o;->d:LU1/m;

    .line 139
    .line 140
    invoke-virtual {p0, p1, p4}, Lhd/o;->a(LU1/m;Lio/flutter/view/TextureRegistry$SurfaceProducer;)Lhd/a;

    .line 141
    .line 142
    .line 143
    move-result-object p4

    .line 144
    check-cast p1, LU1/u;

    .line 145
    .line 146
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    iget-object p1, p1, LU1/u;->l:LQ1/j;

    .line 150
    .line 151
    invoke-virtual {p1, p4}, LQ1/j;->a(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    iget-object p1, p0, Lhd/o;->d:LU1/m;

    .line 155
    .line 156
    iget-boolean p3, p3, Ls8/b;->b:Z

    .line 157
    .line 158
    new-instance p4, LN1/c;

    .line 159
    .line 160
    const/4 p5, 0x3

    .line 161
    const/4 v0, 0x1

    .line 162
    invoke-direct {p4, p5, p2, v0}, LN1/c;-><init>(III)V

    .line 163
    .line 164
    .line 165
    xor-int/lit8 p2, p3, 0x1

    .line 166
    .line 167
    check-cast p1, LU1/u;

    .line 168
    .line 169
    invoke-virtual {p1, p4, p2}, LU1/u;->E0(LN1/c;Z)V

    .line 170
    .line 171
    .line 172
    return-void

    .line 173
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public abstract a(LU1/m;Lio/flutter/view/TextureRegistry$SurfaceProducer;)Lhd/a;
.end method

.method public b()V
    .locals 3

    .line 1
    iget-object v0, p0, Lhd/o;->c:Laa/f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, v0, Laa/f;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Luc/f;

    .line 8
    .line 9
    iget-object v0, v0, Laa/f;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Ljava/lang/String;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static {v1, v0, v2}, Lcom/google/android/gms/internal/consent_sdk/a;->J(Luc/f;Ljava/lang/String;Lhd/o;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lhd/o;->d:LU1/m;

    .line 18
    .line 19
    check-cast v0, LU1/u;

    .line 20
    .line 21
    invoke-virtual {v0}, LU1/u;->A0()V

    .line 22
    .line 23
    .line 24
    return-void
.end method
