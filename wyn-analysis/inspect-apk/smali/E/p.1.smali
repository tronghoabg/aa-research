.class public abstract LE/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LE/o;

.field public static final b:LE/m;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, LZ/a;->a:LZ/d;

    .line 2
    .line 3
    new-instance v1, LE/o;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, v0, v2}, LE/o;-><init>(LZ/d;Z)V

    .line 7
    .line 8
    .line 9
    sput-object v1, LE/p;->a:LE/o;

    .line 10
    .line 11
    sget-object v0, LE/m;->b:LE/m;

    .line 12
    .line 13
    sput-object v0, LE/p;->b:LE/m;

    .line 14
    .line 15
    return-void
.end method

.method public static final a(LZ/k;LN/o;I)V
    .locals 7

    .line 1
    const-string v0, "modifier"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const v0, -0xc96ce69

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, v0}, LN/o;->N(I)LN/o;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, p0}, LN/o;->e(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x2

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x4

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v0, v1

    .line 22
    :goto_0
    or-int/2addr v0, p2

    .line 23
    and-int/lit8 v0, v0, 0xb

    .line 24
    .line 25
    if-ne v0, v1, :cond_2

    .line 26
    .line 27
    invoke-virtual {p1}, LN/o;->x()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    invoke-virtual {p1}, LN/o;->I()V

    .line 35
    .line 36
    .line 37
    goto :goto_3

    .line 38
    :cond_2
    :goto_1
    const v0, -0x4ee9b9da

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v0}, LN/o;->M(I)V

    .line 42
    .line 43
    .line 44
    sget-object v0, Lu0/M;->e:LN/L0;

    .line 45
    .line 46
    invoke-virtual {p1, v0}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, LL0/b;

    .line 51
    .line 52
    sget-object v1, Lu0/M;->k:LN/L0;

    .line 53
    .line 54
    invoke-virtual {p1, v1}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    check-cast v1, LL0/i;

    .line 59
    .line 60
    sget-object v2, Lu0/M;->o:LN/L0;

    .line 61
    .line 62
    invoke-virtual {p1, v2}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    check-cast v2, Lu0/p0;

    .line 67
    .line 68
    sget-object v3, Lt0/c;->g9:Lt0/b;

    .line 69
    .line 70
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    sget-object v3, Lt0/b;->b:Lt0/d;

    .line 74
    .line 75
    invoke-static {p0}, LS3/f;->y(LZ/k;)LV/d;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    invoke-virtual {p1}, LN/o;->O()V

    .line 80
    .line 81
    .line 82
    iget-boolean v5, p1, LN/o;->O:Z

    .line 83
    .line 84
    if-eqz v5, :cond_3

    .line 85
    .line 86
    invoke-virtual {p1, v3}, LN/o;->k(Ltf/a;)V

    .line 87
    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_3
    invoke-virtual {p1}, LN/o;->X()V

    .line 91
    .line 92
    .line 93
    :goto_2
    const/4 v3, 0x0

    .line 94
    iput-boolean v3, p1, LN/o;->x:Z

    .line 95
    .line 96
    sget-object v5, Lt0/b;->e:Lt0/a;

    .line 97
    .line 98
    sget-object v6, LE/p;->b:LE/m;

    .line 99
    .line 100
    invoke-static {p1, v6, v5}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 101
    .line 102
    .line 103
    sget-object v5, Lt0/b;->d:Lt0/a;

    .line 104
    .line 105
    invoke-static {p1, v0, v5}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 106
    .line 107
    .line 108
    sget-object v0, Lt0/b;->f:Lt0/a;

    .line 109
    .line 110
    invoke-static {p1, v1, v0}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 111
    .line 112
    .line 113
    sget-object v0, Lt0/b;->g:Lt0/a;

    .line 114
    .line 115
    invoke-static {p1, v2, v0, p1}, Lwg/b;->b(LN/o;Lu0/p0;Lt0/a;LN/o;)LN/u0;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    const v1, 0x7ab4aae9

    .line 120
    .line 121
    .line 122
    invoke-static {v3, v4, v0, p1, v1}, Lwg/b;->d(ILV/d;LN/u0;LN/o;I)V

    .line 123
    .line 124
    .line 125
    const v0, 0x3cde39c0

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1, v0}, LN/o;->M(I)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1, v3}, LN/o;->p(Z)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1, v3}, LN/o;->p(Z)V

    .line 135
    .line 136
    .line 137
    const/4 v0, 0x1

    .line 138
    invoke-virtual {p1, v0}, LN/o;->p(Z)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p1, v3}, LN/o;->p(Z)V

    .line 142
    .line 143
    .line 144
    :goto_3
    invoke-virtual {p1}, LN/o;->r()LN/i0;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    if-nez p1, :cond_4

    .line 149
    .line 150
    return-void

    .line 151
    :cond_4
    new-instance v0, LE/k;

    .line 152
    .line 153
    const/4 v1, 0x0

    .line 154
    invoke-direct {v0, p0, p2, v1}, LE/k;-><init>(Ljava/lang/Object;II)V

    .line 155
    .line 156
    .line 157
    iput-object v0, p1, LN/i0;->d:Ltf/p;

    .line 158
    .line 159
    return-void
.end method

.method public static final b(Lr0/s;Lr0/t;Lr0/m;LL0/i;IILZ/d;)V
    .locals 6

    .line 1
    invoke-interface {p2}, Lr0/m;->a()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    instance-of v0, p2, LE/j;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast p2, LE/j;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p2, 0x0

    .line 13
    :goto_0
    if-eqz p2, :cond_2

    .line 14
    .line 15
    iget-object p2, p2, LE/j;->b:LZ/d;

    .line 16
    .line 17
    if-nez p2, :cond_1

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_1
    move-object v0, p2

    .line 21
    goto :goto_2

    .line 22
    :cond_2
    :goto_1
    move-object v0, p6

    .line 23
    :goto_2
    iget p2, p1, Lr0/t;->a:I

    .line 24
    .line 25
    iget p6, p1, Lr0/t;->b:I

    .line 26
    .line 27
    invoke-static {p2, p6}, LBa/c;->a(II)J

    .line 28
    .line 29
    .line 30
    move-result-wide v1

    .line 31
    invoke-static {p4, p5}, LBa/c;->a(II)J

    .line 32
    .line 33
    .line 34
    move-result-wide v3

    .line 35
    move-object v5, p3

    .line 36
    invoke-virtual/range {v0 .. v5}, LZ/d;->a(JJLL0/i;)J

    .line 37
    .line 38
    .line 39
    move-result-wide p2

    .line 40
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    const/4 p0, 0x0

    .line 44
    invoke-static {p1, p2, p3, p0}, Lr0/s;->b(Lr0/t;JF)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public static final c(LZ/d;ZLN/o;)Lr0/n;
    .locals 3

    .line 1
    const v0, 0x35e7844

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2, v0}, LN/o;->M(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, LZ/a;->a:LZ/d;

    .line 8
    .line 9
    invoke-virtual {p0, v0}, LZ/d;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    sget-object p0, LE/p;->a:LE/o;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const v2, 0x1e7b2b64

    .line 26
    .line 27
    .line 28
    invoke-virtual {p2, v2}, LN/o;->M(I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2, p0}, LN/o;->e(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    invoke-virtual {p2, v0}, LN/o;->e(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    or-int/2addr v0, v2

    .line 40
    invoke-virtual {p2}, LN/o;->F()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    if-nez v0, :cond_1

    .line 45
    .line 46
    sget-object v0, LN/k;->a:LN/P;

    .line 47
    .line 48
    if-ne v2, v0, :cond_2

    .line 49
    .line 50
    :cond_1
    new-instance v2, LE/o;

    .line 51
    .line 52
    invoke-direct {v2, p0, p1}, LE/o;-><init>(LZ/d;Z)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p2, v2}, LN/o;->U(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    :cond_2
    invoke-virtual {p2, v1}, LN/o;->p(Z)V

    .line 59
    .line 60
    .line 61
    move-object p0, v2

    .line 62
    check-cast p0, Lr0/n;

    .line 63
    .line 64
    :goto_0
    invoke-virtual {p2, v1}, LN/o;->p(Z)V

    .line 65
    .line 66
    .line 67
    return-object p0
.end method
