.class public final LI/f;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:LI/i;


# direct methods
.method public synthetic constructor <init>(LI/i;I)V
    .locals 0

    .line 1
    iput p2, p0, LI/f;->i:I

    iput-object p1, p0, LI/f;->j:LI/i;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    sget-object v1, Lef/C;->a:Lef/C;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v4, p0, LI/f;->j:LI/i;

    .line 8
    .line 9
    iget v5, p0, LI/f;->i:I

    .line 10
    .line 11
    packed-switch v5, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p1, Lg0/d;

    .line 15
    .line 16
    const-string v0, "$this$drawBehind"

    .line 17
    .line 18
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, v4, LI/i;->a:LVa/X7;

    .line 22
    .line 23
    iget-object v4, v0, LVa/X7;->c:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v4, Lz0/n;

    .line 26
    .line 27
    if-eqz v4, :cond_5

    .line 28
    .line 29
    iget-object v0, v0, LVa/X7;->d:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, LN/Y;

    .line 32
    .line 33
    invoke-virtual {v0}, LN/Y;->getValue()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    invoke-interface {p1}, Lg0/d;->u()Lba/a;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p1}, Lba/a;->v()Le0/o;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    const-string p1, "canvas"

    .line 45
    .line 46
    invoke-static {v6, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    iget-wide v7, v4, Lz0/n;->c:J

    .line 50
    .line 51
    const/16 p1, 0x20

    .line 52
    .line 53
    shr-long v9, v7, p1

    .line 54
    .line 55
    long-to-int p1, v9

    .line 56
    int-to-float p1, p1

    .line 57
    iget-object v5, v4, Lz0/n;->b:Lz0/d;

    .line 58
    .line 59
    iget v0, v5, Lz0/d;->d:F

    .line 60
    .line 61
    cmpg-float v0, p1, v0

    .line 62
    .line 63
    iget-object v4, v4, Lz0/n;->a:Lz0/m;

    .line 64
    .line 65
    iget-object v9, v4, Lz0/m;->b:Lz0/p;

    .line 66
    .line 67
    const-wide v10, 0xffffffffL

    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    if-gez v0, :cond_0

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_0
    iget-boolean v0, v5, Lz0/d;->c:Z

    .line 76
    .line 77
    if-nez v0, :cond_1

    .line 78
    .line 79
    and-long v12, v7, v10

    .line 80
    .line 81
    long-to-int v0, v12

    .line 82
    int-to-float v0, v0

    .line 83
    iget v12, v5, Lz0/d;->e:F

    .line 84
    .line 85
    cmpg-float v0, v0, v12

    .line 86
    .line 87
    if-gez v0, :cond_2

    .line 88
    .line 89
    :cond_1
    :goto_0
    iget v0, v4, Lz0/m;->e:I

    .line 90
    .line 91
    if-ne v0, v3, :cond_2

    .line 92
    .line 93
    move v2, v3

    .line 94
    :cond_2
    if-eqz v2, :cond_3

    .line 95
    .line 96
    and-long v3, v7, v10

    .line 97
    .line 98
    long-to-int v0, v3

    .line 99
    int-to-float v0, v0

    .line 100
    sget-wide v3, Ld0/c;->b:J

    .line 101
    .line 102
    invoke-static {p1, v0}, Lcom/moloco/sdk/internal/publisher/H;->I(FF)J

    .line 103
    .line 104
    .line 105
    move-result-wide v7

    .line 106
    invoke-static {v3, v4, v7, v8}, La/a;->f(JJ)Ld0/d;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-interface {v6}, Le0/o;->m()V

    .line 111
    .line 112
    .line 113
    invoke-interface {v6, p1}, Le0/o;->j(Ld0/d;)V

    .line 114
    .line 115
    .line 116
    :cond_3
    :try_start_0
    iget-object p1, v9, Lz0/p;->a:Lz0/j;

    .line 117
    .line 118
    iget-object p1, p1, Lz0/j;->a:LK0/g;

    .line 119
    .line 120
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    iget-object p1, v9, Lz0/p;->a:Lz0/j;

    .line 124
    .line 125
    iget-object p1, p1, Lz0/j;->a:LK0/g;

    .line 126
    .line 127
    invoke-interface {p1}, LK0/g;->a()J

    .line 128
    .line 129
    .line 130
    move-result-wide v7

    .line 131
    iget-object p1, v9, Lz0/p;->a:Lz0/j;

    .line 132
    .line 133
    iget-object v9, p1, Lz0/j;->n:Le0/D;

    .line 134
    .line 135
    iget-object v10, p1, Lz0/j;->m:LK0/d;

    .line 136
    .line 137
    invoke-virtual/range {v5 .. v10}, Lz0/d;->a(Le0/o;JLe0/D;LK0/d;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 138
    .line 139
    .line 140
    if-eqz v2, :cond_5

    .line 141
    .line 142
    invoke-interface {v6}, Le0/o;->restore()V

    .line 143
    .line 144
    .line 145
    goto :goto_1

    .line 146
    :catchall_0
    move-exception v0

    .line 147
    move-object p1, v0

    .line 148
    if-eqz v2, :cond_4

    .line 149
    .line 150
    invoke-interface {v6}, Le0/o;->restore()V

    .line 151
    .line 152
    .line 153
    :cond_4
    throw p1

    .line 154
    :cond_5
    :goto_1
    return-object v1

    .line 155
    :pswitch_0
    check-cast p1, Ljava/util/List;

    .line 156
    .line 157
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    iget-object v0, v4, LI/i;->a:LVa/X7;

    .line 161
    .line 162
    iget-object v0, v0, LVa/X7;->c:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v0, Lz0/n;

    .line 165
    .line 166
    if-eqz v0, :cond_6

    .line 167
    .line 168
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move v2, v3

    .line 172
    :cond_6
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    return-object p1

    .line 177
    :pswitch_1
    check-cast p1, Lr0/k;

    .line 178
    .line 179
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    iget-object p1, v4, LI/i;->a:LVa/X7;

    .line 183
    .line 184
    sget-object p1, LJ/b;->a:LN/D;

    .line 185
    .line 186
    return-object v1

    .line 187
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
