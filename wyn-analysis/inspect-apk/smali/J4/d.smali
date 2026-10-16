.class public abstract LJ4/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI4/q;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, LJ4/d;->a:I

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    .line 7
    new-array v0, v0, [I

    iput-object v0, p0, LJ4/d;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, LJ4/d;->a:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, LJ4/d;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/Class;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LJ4/d;->a:I

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, LJ4/d;->b:Ljava/lang/Object;

    .line 13
    iput-object p2, p0, LJ4/d;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lj/w;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LJ4/d;->a:I

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ4/d;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LJ4/d;->a:I

    const-string v0, "content"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parameters"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LJ4/d;->b:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, LJ4/d;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lmd/d;Lmd/c;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, LJ4/d;->a:I

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    const-string v0, "channel"

    invoke-static {p1, v0}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LJ4/d;->b:Ljava/lang/Object;

    .line 10
    const-string p1, "callOptions"

    invoke-static {p2, p1}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LJ4/d;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public c()V
    .locals 2

    .line 1
    iget-object v0, p0, LJ4/d;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LA7/V1;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    :try_start_0
    iget-object v1, p0, LJ4/d;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Lj/w;

    .line 10
    .line 11
    iget-object v1, v1, Lj/w;->k:Landroid/content/Context;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    .line 16
    :catch_0
    const/4 v0, 0x0

    .line 17
    iput-object v0, p0, LJ4/d;->b:Ljava/lang/Object;

    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public d(LI4/v;)LI4/p;
    .locals 4

    .line 1
    new-instance v0, LJ4/g;

    .line 2
    .line 3
    iget-object v1, p0, LJ4/d;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/lang/Class;

    .line 6
    .line 7
    const-class v2, Ljava/io/File;

    .line 8
    .line 9
    invoke-virtual {p1, v2, v1}, LI4/v;->b(Ljava/lang/Class;Ljava/lang/Class;)LI4/p;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const-class v3, Landroid/net/Uri;

    .line 14
    .line 15
    invoke-virtual {p1, v3, v1}, LI4/v;->b(Ljava/lang/Class;Ljava/lang/Class;)LI4/p;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget-object v3, p0, LJ4/d;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v3, Landroid/content/Context;

    .line 22
    .line 23
    invoke-direct {v0, v3, v2, p1, v1}, LJ4/g;-><init>(Landroid/content/Context;LI4/p;LI4/p;Ljava/lang/Class;)V

    .line 24
    .line 25
    .line 26
    return-object v0
.end method

.method public abstract e()Landroid/content/IntentFilter;
.end method

.method public abstract f(I)[I
.end method

.method public abstract g()I
.end method

.method public h(Landroid/view/MenuItem;)Landroid/view/MenuItem;
    .locals 2

    .line 1
    instance-of v0, p1, Ld1/a;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    check-cast p1, Ld1/a;

    .line 6
    .line 7
    iget-object v0, p0, LJ4/d;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lx/v;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    new-instance v0, Lx/v;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-direct {v0, v1}, Lx/v;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, LJ4/d;->c:Ljava/lang/Object;

    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, LJ4/d;->c:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Lx/v;

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Lx/v;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Landroid/view/MenuItem;

    .line 30
    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    new-instance v0, Lp/r;

    .line 34
    .line 35
    iget-object v1, p0, LJ4/d;->b:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v1, Landroid/content/Context;

    .line 38
    .line 39
    invoke-direct {v0, v1, p1}, Lp/r;-><init>(Landroid/content/Context;Ld1/a;)V

    .line 40
    .line 41
    .line 42
    iget-object v1, p0, LJ4/d;->c:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, Lx/v;

    .line 45
    .line 46
    invoke-virtual {v1, p1, v0}, Lx/v;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    :cond_1
    return-object v0

    .line 50
    :cond_2
    return-object p1
.end method

.method public i(II)[I
    .locals 2

    .line 1
    if-ltz p1, :cond_1

    .line 2
    .line 3
    if-ltz p2, :cond_1

    .line 4
    .line 5
    if-ne p1, p2, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iget-object v1, p0, LJ4/d;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, [I

    .line 12
    .line 13
    aput p1, v1, v0

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    aput p2, v1, p1

    .line 17
    .line 18
    return-object v1

    .line 19
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 20
    return-object p1
.end method

.method public j()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LJ4/d;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    const-string v0, "text"

    .line 9
    .line 10
    invoke-static {v0}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    throw v0
.end method

.method public abstract k()V
.end method

.method public l(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LJ4/d;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/util/List;

    .line 9
    .line 10
    invoke-static {v0}, Lr7/e;->z(Ljava/util/List;)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-ltz v1, :cond_1

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    :goto_0
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    check-cast v3, LJd/j;

    .line 22
    .line 23
    iget-object v4, v3, LJd/j;->a:Ljava/lang/String;

    .line 24
    .line 25
    const/4 v5, 0x1

    .line 26
    invoke-static {v4, p1, v5}, LBf/r;->c0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-eqz v4, :cond_0

    .line 31
    .line 32
    iget-object p1, v3, LJd/j;->b:Ljava/lang/String;

    .line 33
    .line 34
    return-object p1

    .line 35
    :cond_0
    if-eq v2, v1, :cond_1

    .line 36
    .line 37
    add-int/lit8 v2, v2, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const/4 p1, 0x0

    .line 41
    return-object p1
.end method

.method public abstract m(I)[I
.end method

.method public n()V
    .locals 3

    .line 1
    invoke-virtual {p0}, LJ4/d;->c()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LJ4/d;->e()Landroid/content/IntentFilter;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroid/content/IntentFilter;->countActions()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object v1, p0, LJ4/d;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, LA7/V1;

    .line 18
    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    new-instance v1, LA7/V1;

    .line 22
    .line 23
    const/16 v2, 0xb

    .line 24
    .line 25
    invoke-direct {v1, p0, v2}, LA7/V1;-><init>(Ljava/lang/Object;I)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, LJ4/d;->b:Ljava/lang/Object;

    .line 29
    .line 30
    :cond_1
    iget-object v1, p0, LJ4/d;->c:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, Lj/w;

    .line 33
    .line 34
    iget-object v1, v1, Lj/w;->k:Landroid/content/Context;

    .line 35
    .line 36
    iget-object v2, p0, LJ4/d;->b:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v2, LA7/V1;

    .line 39
    .line 40
    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    iget v3, v0, LJ4/d;->a:I

    .line 6
    .line 7
    packed-switch v3, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-super {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    return-object v1

    .line 15
    :pswitch_0
    iget-object v3, v0, LJ4/d;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v3, Ljava/util/List;

    .line 18
    .line 19
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    iget-object v5, v0, LJ4/d;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v5, Ljava/lang/String;

    .line 26
    .line 27
    if-eqz v4, :cond_0

    .line 28
    .line 29
    goto/16 :goto_a

    .line 30
    .line 31
    :cond_0
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    move-object v6, v3

    .line 36
    check-cast v6, Ljava/lang/Iterable;

    .line 37
    .line 38
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    const/4 v7, 0x0

    .line 43
    move v8, v7

    .line 44
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v9

    .line 48
    if-eqz v9, :cond_1

    .line 49
    .line 50
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v9

    .line 54
    check-cast v9, LJd/j;

    .line 55
    .line 56
    iget-object v10, v9, LJd/j;->a:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 59
    .line 60
    .line 61
    move-result v10

    .line 62
    iget-object v9, v9, LJd/j;->b:Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 65
    .line 66
    .line 67
    move-result v9

    .line 68
    add-int/2addr v9, v10

    .line 69
    add-int/lit8 v9, v9, 0x3

    .line 70
    .line 71
    add-int/2addr v8, v9

    .line 72
    goto :goto_0

    .line 73
    :cond_1
    add-int/2addr v4, v8

    .line 74
    new-instance v6, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    invoke-direct {v6, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-static {v3}, Lr7/e;->z(Ljava/util/List;)I

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    if-ltz v4, :cond_13

    .line 87
    .line 88
    move v5, v7

    .line 89
    :goto_1
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v8

    .line 93
    check-cast v8, LJd/j;

    .line 94
    .line 95
    const-string v9, "; "

    .line 96
    .line 97
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    iget-object v9, v8, LJd/j;->a:Ljava/lang/String;

    .line 101
    .line 102
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    const-string v9, "="

    .line 106
    .line 107
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    sget-object v9, LJd/k;->a:Ljava/util/Set;

    .line 111
    .line 112
    iget-object v8, v8, LJd/j;->b:Ljava/lang/String;

    .line 113
    .line 114
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 115
    .line 116
    .line 117
    move-result v9

    .line 118
    const/16 v10, 0x22

    .line 119
    .line 120
    const/16 v11, 0x5c

    .line 121
    .line 122
    if-nez v9, :cond_2

    .line 123
    .line 124
    goto :goto_5

    .line 125
    :cond_2
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 126
    .line 127
    .line 128
    move-result v9

    .line 129
    if-ge v9, v1, :cond_3

    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_3
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 133
    .line 134
    .line 135
    move-result v9

    .line 136
    if-eqz v9, :cond_12

    .line 137
    .line 138
    invoke-virtual {v8, v7}, Ljava/lang/String;->charAt(I)C

    .line 139
    .line 140
    .line 141
    move-result v9

    .line 142
    if-ne v9, v10, :cond_9

    .line 143
    .line 144
    invoke-static {v8}, LBf/k;->z0(Ljava/lang/CharSequence;)C

    .line 145
    .line 146
    .line 147
    move-result v9

    .line 148
    if-eq v9, v10, :cond_4

    .line 149
    .line 150
    goto :goto_3

    .line 151
    :cond_4
    move v9, v2

    .line 152
    :cond_5
    const/4 v12, 0x4

    .line 153
    invoke-static {v8, v10, v9, v12}, LBf/k;->v0(Ljava/lang/CharSequence;CII)I

    .line 154
    .line 155
    .line 156
    move-result v9

    .line 157
    invoke-static {v8}, LBf/k;->s0(Ljava/lang/CharSequence;)I

    .line 158
    .line 159
    .line 160
    move-result v12

    .line 161
    if-ne v9, v12, :cond_6

    .line 162
    .line 163
    goto/16 :goto_8

    .line 164
    .line 165
    :cond_6
    add-int/lit8 v12, v9, -0x1

    .line 166
    .line 167
    move v13, v7

    .line 168
    :goto_2
    invoke-virtual {v8, v12}, Ljava/lang/String;->charAt(I)C

    .line 169
    .line 170
    .line 171
    move-result v14

    .line 172
    if-ne v14, v11, :cond_7

    .line 173
    .line 174
    add-int/2addr v13, v2

    .line 175
    add-int/lit8 v12, v12, -0x1

    .line 176
    .line 177
    goto :goto_2

    .line 178
    :cond_7
    rem-int/2addr v13, v1

    .line 179
    if-nez v13, :cond_8

    .line 180
    .line 181
    goto :goto_3

    .line 182
    :cond_8
    add-int/2addr v9, v2

    .line 183
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 184
    .line 185
    .line 186
    move-result v12

    .line 187
    if-lt v9, v12, :cond_5

    .line 188
    .line 189
    goto/16 :goto_8

    .line 190
    .line 191
    :cond_9
    :goto_3
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 192
    .line 193
    .line 194
    move-result v9

    .line 195
    move v12, v7

    .line 196
    :goto_4
    if-ge v12, v9, :cond_11

    .line 197
    .line 198
    invoke-virtual {v8, v12}, Ljava/lang/String;->charAt(I)C

    .line 199
    .line 200
    .line 201
    move-result v13

    .line 202
    invoke-static {v13}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 203
    .line 204
    .line 205
    move-result-object v13

    .line 206
    sget-object v14, LJd/k;->a:Ljava/util/Set;

    .line 207
    .line 208
    invoke-interface {v14, v13}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v13

    .line 212
    if-eqz v13, :cond_10

    .line 213
    .line 214
    :goto_5
    new-instance v9, Ljava/lang/StringBuilder;

    .line 215
    .line 216
    const-string v12, "\""

    .line 217
    .line 218
    invoke-direct {v9, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 222
    .line 223
    .line 224
    move-result v13

    .line 225
    move v14, v7

    .line 226
    :goto_6
    if-ge v14, v13, :cond_f

    .line 227
    .line 228
    invoke-virtual {v8, v14}, Ljava/lang/String;->charAt(I)C

    .line 229
    .line 230
    .line 231
    move-result v15

    .line 232
    const/16 v1, 0x9

    .line 233
    .line 234
    if-eq v15, v1, :cond_e

    .line 235
    .line 236
    const/16 v1, 0xa

    .line 237
    .line 238
    if-eq v15, v1, :cond_d

    .line 239
    .line 240
    const/16 v1, 0xd

    .line 241
    .line 242
    if-eq v15, v1, :cond_c

    .line 243
    .line 244
    if-eq v15, v10, :cond_b

    .line 245
    .line 246
    if-eq v15, v11, :cond_a

    .line 247
    .line 248
    invoke-virtual {v9, v15}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    goto :goto_7

    .line 252
    :cond_a
    const-string v1, "\\\\"

    .line 253
    .line 254
    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    goto :goto_7

    .line 258
    :cond_b
    const-string v1, "\\\""

    .line 259
    .line 260
    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    goto :goto_7

    .line 264
    :cond_c
    const-string v1, "\\r"

    .line 265
    .line 266
    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    goto :goto_7

    .line 270
    :cond_d
    const-string v1, "\\n"

    .line 271
    .line 272
    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    goto :goto_7

    .line 276
    :cond_e
    const-string v1, "\\t"

    .line 277
    .line 278
    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    :goto_7
    add-int/2addr v14, v2

    .line 282
    const/4 v1, 0x2

    .line 283
    goto :goto_6

    .line 284
    :cond_f
    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 285
    .line 286
    .line 287
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 292
    .line 293
    .line 294
    goto :goto_9

    .line 295
    :cond_10
    add-int/2addr v12, v2

    .line 296
    const/4 v1, 0x2

    .line 297
    goto :goto_4

    .line 298
    :cond_11
    :goto_8
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    .line 301
    :goto_9
    if-eq v5, v4, :cond_13

    .line 302
    .line 303
    add-int/2addr v5, v2

    .line 304
    const/4 v1, 0x2

    .line 305
    goto/16 :goto_1

    .line 306
    .line 307
    :cond_12
    new-instance v1, Ljava/util/NoSuchElementException;

    .line 308
    .line 309
    const-string v2, "Char sequence is empty."

    .line 310
    .line 311
    invoke-direct {v1, v2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    throw v1

    .line 315
    :cond_13
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v5

    .line 319
    invoke-static {v5}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 320
    .line 321
    .line 322
    :goto_a
    return-object v5

    .line 323
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
