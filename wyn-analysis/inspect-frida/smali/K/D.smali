.class public final LK/D;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public final synthetic i:LZ/i;

.field public final synthetic j:Le0/E;

.field public final synthetic k:J

.field public final synthetic l:F

.field public final synthetic m:I

.field public final synthetic n:F

.field public final synthetic o:LV/d;


# direct methods
.method public constructor <init>(LZ/i;Le0/E;JFIFLV/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK/D;->i:LZ/i;

    .line 2
    .line 3
    iput-object p2, p0, LK/D;->j:Le0/E;

    .line 4
    .line 5
    iput-wide p3, p0, LK/D;->k:J

    .line 6
    .line 7
    iput p5, p0, LK/D;->l:F

    .line 8
    .line 9
    iput p6, p0, LK/D;->m:I

    .line 10
    .line 11
    iput p7, p0, LK/D;->n:F

    .line 12
    .line 13
    iput-object p8, p0, LK/D;->o:LV/d;

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    move-object v4, p1

    .line 2
    check-cast v4, LN/o;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Number;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    and-int/lit8 p1, p1, 0xb

    .line 11
    .line 12
    sget-object p2, Lef/C;->a:Lef/C;

    .line 13
    .line 14
    const/4 v6, 0x2

    .line 15
    if-ne p1, v6, :cond_1

    .line 16
    .line 17
    invoke-virtual {v4}, LN/o;->x()Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-nez p1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {v4}, LN/o;->I()V

    .line 25
    .line 26
    .line 27
    return-object p2

    .line 28
    :cond_1
    :goto_0
    sget-object p1, LK/q;->a:LN/L0;

    .line 29
    .line 30
    invoke-virtual {v4, p1}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    move-object v2, p1

    .line 35
    check-cast v2, LK/o;

    .line 36
    .line 37
    iget p1, p0, LK/D;->m:I

    .line 38
    .line 39
    shr-int/lit8 v0, p1, 0x6

    .line 40
    .line 41
    and-int/lit8 v5, v0, 0xe

    .line 42
    .line 43
    iget-wide v0, p0, LK/D;->k:J

    .line 44
    .line 45
    iget v3, p0, LK/D;->l:F

    .line 46
    .line 47
    invoke-static/range {v0 .. v5}, LFe/g;->o(JLK/o;FLN/o;I)J

    .line 48
    .line 49
    .line 50
    move-result-wide v9

    .line 51
    const/4 v11, 0x0

    .line 52
    iget v12, p0, LK/D;->n:F

    .line 53
    .line 54
    iget-object v7, p0, LK/D;->i:LZ/i;

    .line 55
    .line 56
    iget-object v8, p0, LK/D;->j:Le0/E;

    .line 57
    .line 58
    invoke-static/range {v7 .. v12}, LFe/g;->n(LZ/k;Le0/E;JLB/h;F)LZ/k;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    sget-object v1, LK/B;->j:LK/B;

    .line 63
    .line 64
    const/4 v2, 0x0

    .line 65
    invoke-static {v0, v2, v1}, LFe/g;->J(LZ/k;ZLtf/l;)LZ/k;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    new-instance v1, LK/C;

    .line 70
    .line 71
    const/4 v3, 0x0

    .line 72
    invoke-direct {v1, v6, v3}, Llf/j;-><init>(ILjf/c;)V

    .line 73
    .line 74
    .line 75
    invoke-static {v0, p2, v1}, Lp0/w;->a(LZ/k;Ljava/lang/Object;Ltf/p;)LZ/k;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    const v1, 0x2bb5b5d7

    .line 80
    .line 81
    .line 82
    invoke-virtual {v4, v1}, LN/o;->M(I)V

    .line 83
    .line 84
    .line 85
    sget-object v1, LZ/a;->a:LZ/d;

    .line 86
    .line 87
    const/4 v3, 0x1

    .line 88
    invoke-static {v1, v3, v4}, LE/p;->c(LZ/d;ZLN/o;)Lr0/n;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    const v5, -0x4ee9b9da

    .line 93
    .line 94
    .line 95
    invoke-virtual {v4, v5}, LN/o;->M(I)V

    .line 96
    .line 97
    .line 98
    sget-object v5, Lu0/M;->e:LN/L0;

    .line 99
    .line 100
    invoke-virtual {v4, v5}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    check-cast v5, LL0/b;

    .line 105
    .line 106
    sget-object v6, Lu0/M;->k:LN/L0;

    .line 107
    .line 108
    invoke-virtual {v4, v6}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    check-cast v6, LL0/i;

    .line 113
    .line 114
    sget-object v7, Lu0/M;->o:LN/L0;

    .line 115
    .line 116
    invoke-virtual {v4, v7}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v7

    .line 120
    check-cast v7, Lu0/p0;

    .line 121
    .line 122
    sget-object v8, Lt0/c;->g9:Lt0/b;

    .line 123
    .line 124
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    sget-object v8, Lt0/b;->b:Lt0/d;

    .line 128
    .line 129
    invoke-static {v0}, LS3/f;->y(LZ/k;)LV/d;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-virtual {v4}, LN/o;->O()V

    .line 134
    .line 135
    .line 136
    iget-boolean v9, v4, LN/o;->O:Z

    .line 137
    .line 138
    if-eqz v9, :cond_2

    .line 139
    .line 140
    invoke-virtual {v4, v8}, LN/o;->k(Ltf/a;)V

    .line 141
    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_2
    invoke-virtual {v4}, LN/o;->X()V

    .line 145
    .line 146
    .line 147
    :goto_1
    iput-boolean v2, v4, LN/o;->x:Z

    .line 148
    .line 149
    sget-object v8, Lt0/b;->e:Lt0/a;

    .line 150
    .line 151
    invoke-static {v4, v1, v8}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 152
    .line 153
    .line 154
    sget-object v1, Lt0/b;->d:Lt0/a;

    .line 155
    .line 156
    invoke-static {v4, v5, v1}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 157
    .line 158
    .line 159
    sget-object v1, Lt0/b;->f:Lt0/a;

    .line 160
    .line 161
    invoke-static {v4, v6, v1}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 162
    .line 163
    .line 164
    sget-object v1, Lt0/b;->g:Lt0/a;

    .line 165
    .line 166
    invoke-static {v4, v7, v1, v4}, Lwg/b;->b(LN/o;Lu0/p0;Lt0/a;LN/o;)LN/u0;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    const v5, 0x7ab4aae9

    .line 171
    .line 172
    .line 173
    invoke-static {v2, v0, v1, v4, v5}, Lwg/b;->d(ILV/d;LN/u0;LN/o;I)V

    .line 174
    .line 175
    .line 176
    const v0, -0x7f65a980

    .line 177
    .line 178
    .line 179
    invoke-virtual {v4, v0}, LN/o;->M(I)V

    .line 180
    .line 181
    .line 182
    const v0, 0x5bc49640

    .line 183
    .line 184
    .line 185
    invoke-virtual {v4, v0}, LN/o;->M(I)V

    .line 186
    .line 187
    .line 188
    shr-int/lit8 p1, p1, 0x12

    .line 189
    .line 190
    and-int/lit8 p1, p1, 0xe

    .line 191
    .line 192
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    iget-object v0, p0, LK/D;->o:LV/d;

    .line 197
    .line 198
    invoke-virtual {v0, v4, p1}, LV/d;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v4, v2}, LN/o;->p(Z)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v4, v2}, LN/o;->p(Z)V

    .line 205
    .line 206
    .line 207
    invoke-static {v4, v2, v3, v2, v2}, Lwg/b;->e(LN/o;ZZZZ)V

    .line 208
    .line 209
    .line 210
    return-object p2
.end method
