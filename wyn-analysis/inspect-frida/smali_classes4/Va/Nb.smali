.class public final LVa/Nb;
.super LVa/Ba;
.source "SourceFile"


# instance fields
.field public final synthetic c:I

.field public synthetic d:LVa/ba;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LVa/Nb;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 4

    .line 1
    iget v0, p0, LVa/Nb;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    iget-object v1, p0, LVa/Nb;->d:LVa/ba;

    .line 9
    .line 10
    invoke-static {v1}, LVa/ba;->b(LVa/ba;)Ljava/util/HashMap;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 19
    .line 20
    .line 21
    invoke-static {v1}, LVa/ba;->b(LVa/ba;)Ljava/util/HashMap;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, LVa/d;

    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    sget v2, LVa/d;->p:I

    .line 48
    .line 49
    add-int/lit8 v2, v2, 0x2b

    .line 50
    .line 51
    rem-int/lit16 v2, v2, 0x80

    .line 52
    .line 53
    sput v2, LVa/d;->o:I

    .line 54
    .line 55
    const/4 v2, 0x0

    .line 56
    invoke-virtual {v1, v2}, LVa/Mb;->l(LVa/Lb;)V

    .line 57
    .line 58
    .line 59
    invoke-static {}, LVa/Za;->n()LVa/Za;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-virtual {v2, v1}, LVa/Za;->m(LVa/gb;)V

    .line 64
    .line 65
    .line 66
    sget v1, LVa/d;->p:I

    .line 67
    .line 68
    add-int/lit8 v1, v1, 0x15

    .line 69
    .line 70
    rem-int/lit16 v2, v1, 0x80

    .line 71
    .line 72
    sput v2, LVa/d;->o:I

    .line 73
    .line 74
    rem-int/lit8 v1, v1, 0x2

    .line 75
    .line 76
    if-eqz v1, :cond_0

    .line 77
    .line 78
    const/4 v1, 0x3

    .line 79
    div-int/lit8 v1, v1, 0x0

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_1
    return-void

    .line 83
    :pswitch_0
    new-instance v0, Ljava/util/ArrayList;

    .line 84
    .line 85
    iget-object v1, p0, LVa/Nb;->d:LVa/ba;

    .line 86
    .line 87
    invoke-static {v1}, LVa/ba;->m(LVa/ba;)Ljava/util/HashMap;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 96
    .line 97
    .line 98
    invoke-static {v1}, LVa/ba;->m(LVa/ba;)Ljava/util/HashMap;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    if-eqz v1, :cond_4

    .line 114
    .line 115
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    check-cast v1, LVa/Tb;

    .line 120
    .line 121
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    sget v2, LVa/Tb;->t:I

    .line 125
    .line 126
    add-int/lit8 v2, v2, 0x63

    .line 127
    .line 128
    rem-int/lit16 v3, v2, 0x80

    .line 129
    .line 130
    sput v3, LVa/Tb;->s:I

    .line 131
    .line 132
    rem-int/lit8 v2, v2, 0x2

    .line 133
    .line 134
    const/4 v3, 0x0

    .line 135
    if-nez v2, :cond_3

    .line 136
    .line 137
    invoke-virtual {v1, v3}, LVa/Mb;->l(LVa/Lb;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v1, v3}, LVa/Tb;->R(LVa/q;)V

    .line 141
    .line 142
    .line 143
    invoke-static {}, LVa/fb;->e()LVa/fb;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    invoke-virtual {v2, v1}, LVa/fb;->k(LVa/db;)V

    .line 148
    .line 149
    .line 150
    sget v1, LVa/Tb;->s:I

    .line 151
    .line 152
    add-int/lit8 v1, v1, 0x6f

    .line 153
    .line 154
    rem-int/lit16 v2, v1, 0x80

    .line 155
    .line 156
    sput v2, LVa/Tb;->t:I

    .line 157
    .line 158
    rem-int/lit8 v1, v1, 0x2

    .line 159
    .line 160
    if-eqz v1, :cond_2

    .line 161
    .line 162
    goto :goto_1

    .line 163
    :cond_2
    throw v3

    .line 164
    :cond_3
    invoke-virtual {v1, v3}, LVa/Mb;->l(LVa/Lb;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v1, v3}, LVa/Tb;->R(LVa/q;)V

    .line 168
    .line 169
    .line 170
    invoke-static {}, LVa/fb;->e()LVa/fb;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-virtual {v0, v1}, LVa/fb;->k(LVa/db;)V

    .line 175
    .line 176
    .line 177
    throw v3

    .line 178
    :cond_4
    return-void

    .line 179
    :pswitch_1
    new-instance v0, Ljava/util/ArrayList;

    .line 180
    .line 181
    iget-object v1, p0, LVa/Nb;->d:LVa/ba;

    .line 182
    .line 183
    invoke-static {v1}, LVa/ba;->q(LVa/ba;)Ljava/util/HashMap;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 192
    .line 193
    .line 194
    invoke-static {v1}, LVa/ba;->q(LVa/ba;)Ljava/util/HashMap;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 206
    .line 207
    .line 208
    move-result v1

    .line 209
    if-eqz v1, :cond_5

    .line 210
    .line 211
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    check-cast v1, LVa/i;

    .line 216
    .line 217
    invoke-virtual {v1}, LVa/i;->E()V

    .line 218
    .line 219
    .line 220
    goto :goto_2

    .line 221
    :cond_5
    return-void

    .line 222
    nop

    .line 223
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
