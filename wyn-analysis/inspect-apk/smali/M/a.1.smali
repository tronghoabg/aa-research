.class public final LM/a;
.super LA7/B0;
.source "SourceFile"

# interfaces
.implements LN/q0;


# instance fields
.field public final b:Z

.field public final c:F

.field public final d:LN/V;

.field public final e:LN/V;

.field public final f:LM/q;

.field public final g:LN/Y;

.field public final h:LN/Y;

.field public i:J

.field public j:I

.field public final k:LA0/p;


# direct methods
.method public constructor <init>(ZLN/V;LN/V;LM/q;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p3}, LA7/B0;-><init>(ZLN/V;)V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, LM/a;->b:Z

    .line 5
    .line 6
    const/high16 p1, 0x7fc00000    # Float.NaN

    .line 7
    .line 8
    iput p1, p0, LM/a;->c:F

    .line 9
    .line 10
    iput-object p2, p0, LM/a;->d:LN/V;

    .line 11
    .line 12
    iput-object p3, p0, LM/a;->e:LN/V;

    .line 13
    .line 14
    iput-object p4, p0, LM/a;->f:LM/q;

    .line 15
    .line 16
    sget-object p1, LN/P;->f:LN/P;

    .line 17
    .line 18
    const/4 p2, 0x0

    .line 19
    invoke-static {p2, p1}, LN/d;->G(Ljava/lang/Object;LN/A0;)LN/Y;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    iput-object p2, p0, LM/a;->g:LN/Y;

    .line 24
    .line 25
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 26
    .line 27
    invoke-static {p2, p1}, LN/d;->G(Ljava/lang/Object;LN/A0;)LN/Y;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iput-object p1, p0, LM/a;->h:LN/Y;

    .line 32
    .line 33
    sget-wide p1, Ld0/f;->b:J

    .line 34
    .line 35
    iput-wide p1, p0, LM/a;->i:J

    .line 36
    .line 37
    const/4 p1, -0x1

    .line 38
    iput p1, p0, LM/a;->j:I

    .line 39
    .line 40
    new-instance p1, LA0/p;

    .line 41
    .line 42
    const/16 p2, 0x8

    .line 43
    .line 44
    invoke-direct {p1, p0, p2}, LA0/p;-><init>(Ljava/lang/Object;I)V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, LM/a;->k:LA0/p;

    .line 48
    .line 49
    return-void
.end method


# virtual methods
.method public final N(LD/k;)V
    .locals 0

    .line 1
    iget-object p1, p0, LM/a;->g:LN/Y;

    .line 2
    .line 3
    invoke-virtual {p1}, LN/Y;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, LM/r;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, LM/r;->d()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final c()V
    .locals 0

    .line 1
    return-void
.end method

.method public final e0()V
    .locals 5

    .line 1
    iget-object v0, p0, LM/a;->f:LM/q;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, LM/a;->g:LN/Y;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-virtual {v1, v2}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object v1, v0, LM/q;->d:LS3/e;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object v2, v1, LS3/e;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, Ljava/util/LinkedHashMap;

    .line 20
    .line 21
    invoke-virtual {v2, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    check-cast v3, LM/r;

    .line 26
    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    invoke-virtual {v3}, LM/r;->c()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    check-cast v4, LM/r;

    .line 37
    .line 38
    if-eqz v4, :cond_0

    .line 39
    .line 40
    iget-object v1, v1, LS3/e;->c:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 43
    .line 44
    invoke-interface {v1, v4}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, LM/a;

    .line 49
    .line 50
    :cond_0
    invoke-interface {v2, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    iget-object v0, v0, LM/q;->c:Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    :cond_1
    return-void
.end method

.method public final j()V
    .locals 0

    .line 1
    invoke-virtual {p0}, LM/a;->e0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final k()V
    .locals 0

    .line 1
    invoke-virtual {p0}, LM/a;->e0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final l(Lt0/v;)V
    .locals 11

    .line 1
    iget-object v0, p1, Lt0/v;->a:Lg0/b;

    .line 2
    .line 3
    iget-object v1, v0, Lg0/b;->b:Lba/a;

    .line 4
    .line 5
    invoke-virtual {v1}, Lba/a;->y()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    iput-wide v1, p0, LM/a;->i:J

    .line 10
    .line 11
    iget v1, p0, LM/a;->c:F

    .line 12
    .line 13
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    iget-object v3, v0, Lg0/b;->b:Lba/a;

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    invoke-virtual {v3}, Lba/a;->y()J

    .line 22
    .line 23
    .line 24
    move-result-wide v4

    .line 25
    iget-boolean v2, p0, LM/a;->b:Z

    .line 26
    .line 27
    invoke-static {p1, v2, v4, v5}, LM/p;->a(Lg0/d;ZJ)F

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    invoke-static {v2}, Lvf/a;->H(F)I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-virtual {p1, v1}, Lt0/v;->j(F)I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    :goto_0
    iput v2, p0, LM/a;->j:I

    .line 41
    .line 42
    iget-object v2, p0, LM/a;->d:LN/V;

    .line 43
    .line 44
    invoke-interface {v2}, LN/K0;->getValue()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    check-cast v2, Le0/q;

    .line 49
    .line 50
    iget-wide v9, v2, Le0/q;->a:J

    .line 51
    .line 52
    iget-object v2, p0, LM/a;->e:LN/V;

    .line 53
    .line 54
    invoke-interface {v2}, LN/K0;->getValue()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    check-cast v2, LM/g;

    .line 59
    .line 60
    iget v5, v2, LM/g;->d:F

    .line 61
    .line 62
    invoke-virtual {p1}, Lt0/v;->a()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, p1, v1, v9, v10}, LA7/B0;->C(Lt0/v;FJ)V

    .line 66
    .line 67
    .line 68
    iget-object p1, v0, Lg0/b;->b:Lba/a;

    .line 69
    .line 70
    invoke-virtual {p1}, Lba/a;->v()Le0/o;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    iget-object v0, p0, LM/a;->h:LN/Y;

    .line 75
    .line 76
    invoke-virtual {v0}, LN/Y;->getValue()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    check-cast v0, Ljava/lang/Boolean;

    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 83
    .line 84
    .line 85
    iget-object v0, p0, LM/a;->g:LN/Y;

    .line 86
    .line 87
    invoke-virtual {v0}, LN/Y;->getValue()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    move-object v4, v0

    .line 92
    check-cast v4, LM/r;

    .line 93
    .line 94
    if-eqz v4, :cond_1

    .line 95
    .line 96
    invoke-virtual {v3}, Lba/a;->y()J

    .line 97
    .line 98
    .line 99
    move-result-wide v7

    .line 100
    iget v6, p0, LM/a;->j:I

    .line 101
    .line 102
    invoke-virtual/range {v4 .. v10}, LM/r;->e(FIJJ)V

    .line 103
    .line 104
    .line 105
    sget-object v0, Le0/c;->a:Landroid/graphics/Canvas;

    .line 106
    .line 107
    const-string v0, "<this>"

    .line 108
    .line 109
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    check-cast p1, Le0/b;

    .line 113
    .line 114
    iget-object p1, p1, Le0/b;->a:Landroid/graphics/Canvas;

    .line 115
    .line 116
    invoke-virtual {v4, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 117
    .line 118
    .line 119
    :cond_1
    return-void
.end method

.method public final y(LD/k;LEf/E;)V
    .locals 13

    .line 1
    const-string v0, "interaction"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "scope"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p2, p0, LM/a;->f:LM/q;

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object v0, p2, LM/q;->d:LS3/e;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-object v1, v0, LS3/e;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 24
    .line 25
    invoke-virtual {v1, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, LM/r;

    .line 30
    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    :goto_0
    move-object v3, v2

    .line 34
    goto/16 :goto_4

    .line 35
    .line 36
    :cond_0
    iget-object v2, p2, LM/q;->c:Ljava/util/ArrayList;

    .line 37
    .line 38
    const-string v3, "<this>"

    .line 39
    .line 40
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    const/4 v4, 0x0

    .line 48
    const/4 v5, 0x0

    .line 49
    if-eqz v3, :cond_1

    .line 50
    .line 51
    move-object v2, v5

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    :goto_1
    check-cast v2, LM/r;

    .line 58
    .line 59
    iget-object v0, v0, LS3/e;->c:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 62
    .line 63
    if-nez v2, :cond_6

    .line 64
    .line 65
    iget v2, p2, LM/q;->e:I

    .line 66
    .line 67
    iget-object v3, p2, LM/q;->b:Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-static {v3}, Lr7/e;->z(Ljava/util/List;)I

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    if-le v2, v6, :cond_2

    .line 74
    .line 75
    new-instance v2, LM/r;

    .line 76
    .line 77
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    const-string v6, "context"

    .line 82
    .line 83
    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-direct {v2, v5}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p2, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_2
    iget v2, p2, LM/q;->e:I

    .line 97
    .line 98
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    check-cast v2, LM/r;

    .line 103
    .line 104
    const-string v3, "rippleHostView"

    .line 105
    .line 106
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    check-cast v3, LM/a;

    .line 114
    .line 115
    if-eqz v3, :cond_4

    .line 116
    .line 117
    iget-object v6, v3, LM/a;->g:LN/Y;

    .line 118
    .line 119
    invoke-virtual {v6, v5}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    check-cast v5, LM/r;

    .line 127
    .line 128
    if-eqz v5, :cond_3

    .line 129
    .line 130
    invoke-interface {v0, v5}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v5

    .line 134
    check-cast v5, LM/a;

    .line 135
    .line 136
    :cond_3
    invoke-interface {v1, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v2}, LM/r;->c()V

    .line 140
    .line 141
    .line 142
    :cond_4
    :goto_2
    iget v3, p2, LM/q;->e:I

    .line 143
    .line 144
    iget v5, p2, LM/q;->a:I

    .line 145
    .line 146
    add-int/lit8 v5, v5, -0x1

    .line 147
    .line 148
    if-ge v3, v5, :cond_5

    .line 149
    .line 150
    add-int/lit8 v3, v3, 0x1

    .line 151
    .line 152
    iput v3, p2, LM/q;->e:I

    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_5
    iput v4, p2, LM/q;->e:I

    .line 156
    .line 157
    :cond_6
    :goto_3
    invoke-interface {v1, p0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    invoke-interface {v0, v2, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    goto/16 :goto_0

    .line 164
    .line 165
    :goto_4
    iget-wide v6, p0, LM/a;->i:J

    .line 166
    .line 167
    iget v8, p0, LM/a;->j:I

    .line 168
    .line 169
    iget-object p2, p0, LM/a;->d:LN/V;

    .line 170
    .line 171
    invoke-interface {p2}, LN/K0;->getValue()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object p2

    .line 175
    check-cast p2, Le0/q;

    .line 176
    .line 177
    iget-wide v9, p2, Le0/q;->a:J

    .line 178
    .line 179
    iget-object p2, p0, LM/a;->e:LN/V;

    .line 180
    .line 181
    invoke-interface {p2}, LN/K0;->getValue()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object p2

    .line 185
    check-cast p2, LM/g;

    .line 186
    .line 187
    iget v11, p2, LM/g;->d:F

    .line 188
    .line 189
    iget-object v12, p0, LM/a;->k:LA0/p;

    .line 190
    .line 191
    iget-boolean v5, p0, LM/a;->b:Z

    .line 192
    .line 193
    move-object v4, p1

    .line 194
    invoke-virtual/range {v3 .. v12}, LM/r;->b(LD/k;ZJIJFLA0/p;)V

    .line 195
    .line 196
    .line 197
    iget-object p1, p0, LM/a;->g:LN/Y;

    .line 198
    .line 199
    invoke-virtual {p1, v3}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    return-void
.end method
