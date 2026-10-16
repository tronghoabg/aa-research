.class public final Lc4/g;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:I

.field public final synthetic b:Lc4/h;

.field public final synthetic c:Lh4/h;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Lh4/l;

.field public final synthetic f:LX3/c;

.field public final synthetic g:Lf4/c;

.field public final synthetic h:Lc4/j;


# direct methods
.method public constructor <init>(Lc4/h;Lh4/h;Ljava/lang/Object;Lh4/l;LX3/c;Lf4/c;Lc4/j;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc4/g;->b:Lc4/h;

    .line 2
    .line 3
    iput-object p2, p0, Lc4/g;->c:Lh4/h;

    .line 4
    .line 5
    iput-object p3, p0, Lc4/g;->d:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p4, p0, Lc4/g;->e:Lh4/l;

    .line 8
    .line 9
    iput-object p5, p0, Lc4/g;->f:LX3/c;

    .line 10
    .line 11
    iput-object p6, p0, Lc4/g;->g:Lf4/c;

    .line 12
    .line 13
    iput-object p7, p0, Lc4/g;->h:Lc4/j;

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-direct {p0, p1, p8}, Llf/j;-><init>(ILjf/c;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 9

    .line 1
    new-instance v0, Lc4/g;

    .line 2
    .line 3
    iget-object v6, p0, Lc4/g;->g:Lf4/c;

    .line 4
    .line 5
    iget-object v7, p0, Lc4/g;->h:Lc4/j;

    .line 6
    .line 7
    iget-object v1, p0, Lc4/g;->b:Lc4/h;

    .line 8
    .line 9
    iget-object v2, p0, Lc4/g;->c:Lh4/h;

    .line 10
    .line 11
    iget-object v3, p0, Lc4/g;->d:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v4, p0, Lc4/g;->e:Lh4/l;

    .line 14
    .line 15
    iget-object v5, p0, Lc4/g;->f:LX3/c;

    .line 16
    .line 17
    move-object v8, p2

    .line 18
    invoke-direct/range {v0 .. v8}, Lc4/g;-><init>(Lc4/h;Lh4/h;Ljava/lang/Object;Lh4/l;LX3/c;Lf4/c;Lc4/j;Ljf/c;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LEf/E;

    .line 2
    .line 3
    check-cast p2, Ljf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lc4/g;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lc4/g;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lc4/g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    sget-object v6, Lkf/a;->a:Lkf/a;

    .line 4
    .line 5
    iget v0, v5, Lc4/g;->a:I

    .line 6
    .line 7
    const/4 v7, 0x1

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    if-ne v0, v7, :cond_0

    .line 11
    .line 12
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    move-object/from16 v0, p1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 19
    .line 20
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 21
    .line 22
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw v0

    .line 26
    :cond_1
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iput v7, v5, Lc4/g;->a:I

    .line 30
    .line 31
    iget-object v3, v5, Lc4/g;->e:Lh4/l;

    .line 32
    .line 33
    iget-object v4, v5, Lc4/g;->f:LX3/c;

    .line 34
    .line 35
    iget-object v0, v5, Lc4/g;->b:Lc4/h;

    .line 36
    .line 37
    iget-object v1, v5, Lc4/g;->c:Lh4/h;

    .line 38
    .line 39
    iget-object v2, v5, Lc4/g;->d:Ljava/lang/Object;

    .line 40
    .line 41
    invoke-static/range {v0 .. v5}, Lc4/h;->b(Lc4/h;Lh4/h;Ljava/lang/Object;Lh4/l;LX3/c;Llf/c;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    if-ne v0, v6, :cond_2

    .line 46
    .line 47
    return-object v6

    .line 48
    :cond_2
    :goto_0
    check-cast v0, Lc4/a;

    .line 49
    .line 50
    iget-object v1, v5, Lc4/g;->b:Lc4/h;

    .line 51
    .line 52
    iget-object v1, v1, Lc4/h;->c:La2/c;

    .line 53
    .line 54
    iget-object v2, v5, Lc4/g;->c:Lh4/h;

    .line 55
    .line 56
    iget v2, v2, Lh4/h;->w:I

    .line 57
    .line 58
    invoke-static {v2}, Lcom/google/android/gms/internal/consent_sdk/a;->m(I)Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    const/4 v3, 0x0

    .line 63
    const/4 v4, 0x0

    .line 64
    iget-object v6, v5, Lc4/g;->g:Lf4/c;

    .line 65
    .line 66
    if-nez v2, :cond_4

    .line 67
    .line 68
    :cond_3
    :goto_1
    move v1, v3

    .line 69
    goto :goto_3

    .line 70
    :cond_4
    iget-object v1, v1, La2/c;->b:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v1, LX3/k;

    .line 73
    .line 74
    iget-object v1, v1, LX3/k;->e:Lef/p;

    .line 75
    .line 76
    invoke-virtual {v1}, Lef/p;->getValue()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    check-cast v1, Lf4/e;

    .line 81
    .line 82
    if-eqz v1, :cond_3

    .line 83
    .line 84
    if-nez v6, :cond_5

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_5
    iget-object v2, v0, Lc4/a;->a:Landroid/graphics/drawable/Drawable;

    .line 88
    .line 89
    instance-of v8, v2, Landroid/graphics/drawable/BitmapDrawable;

    .line 90
    .line 91
    if-eqz v8, :cond_6

    .line 92
    .line 93
    check-cast v2, Landroid/graphics/drawable/BitmapDrawable;

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_6
    move-object v2, v4

    .line 97
    :goto_2
    if-eqz v2, :cond_3

    .line 98
    .line 99
    invoke-virtual {v2}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    if-nez v2, :cond_7

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_7
    new-instance v8, Ljava/util/LinkedHashMap;

    .line 107
    .line 108
    invoke-direct {v8}, Ljava/util/LinkedHashMap;-><init>()V

    .line 109
    .line 110
    .line 111
    iget-boolean v9, v0, Lc4/a;->b:Z

    .line 112
    .line 113
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 114
    .line 115
    .line 116
    move-result-object v9

    .line 117
    const-string v10, "coil#is_sampled"

    .line 118
    .line 119
    invoke-interface {v8, v10, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    iget-object v9, v0, Lc4/a;->d:Ljava/lang/String;

    .line 123
    .line 124
    if-eqz v9, :cond_8

    .line 125
    .line 126
    const-string v10, "coil#disk_cache_key"

    .line 127
    .line 128
    invoke-interface {v8, v10, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    :cond_8
    iget-object v9, v6, Lf4/c;->b:Ljava/util/Map;

    .line 132
    .line 133
    invoke-static {v9}, Lr7/e;->S(Ljava/util/Map;)Ljava/util/Map;

    .line 134
    .line 135
    .line 136
    move-result-object v9

    .line 137
    new-instance v10, Lf4/c;

    .line 138
    .line 139
    iget-object v11, v6, Lf4/c;->a:Ljava/lang/String;

    .line 140
    .line 141
    invoke-direct {v10, v11, v9}, Lf4/c;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 142
    .line 143
    .line 144
    invoke-static {v8}, Lr7/e;->S(Ljava/util/Map;)Ljava/util/Map;

    .line 145
    .line 146
    .line 147
    move-result-object v8

    .line 148
    iget-object v1, v1, Lf4/e;->a:Lf4/h;

    .line 149
    .line 150
    invoke-interface {v1, v10, v2, v8}, Lf4/h;->O(Lf4/c;Landroid/graphics/Bitmap;Ljava/util/Map;)V

    .line 151
    .line 152
    .line 153
    move v1, v7

    .line 154
    :goto_3
    iget-object v9, v0, Lc4/a;->a:Landroid/graphics/drawable/Drawable;

    .line 155
    .line 156
    if-eqz v1, :cond_9

    .line 157
    .line 158
    move-object v12, v6

    .line 159
    goto :goto_4

    .line 160
    :cond_9
    move-object v12, v4

    .line 161
    :goto_4
    sget-object v1, Lk4/e;->a:Landroid/graphics/Bitmap$Config;

    .line 162
    .line 163
    iget-object v1, v5, Lc4/g;->h:Lc4/j;

    .line 164
    .line 165
    instance-of v2, v1, Lc4/j;

    .line 166
    .line 167
    if-eqz v2, :cond_a

    .line 168
    .line 169
    iget-boolean v1, v1, Lc4/j;->g:Z

    .line 170
    .line 171
    if-eqz v1, :cond_a

    .line 172
    .line 173
    move v15, v7

    .line 174
    goto :goto_5

    .line 175
    :cond_a
    move v15, v3

    .line 176
    :goto_5
    new-instance v8, Lh4/o;

    .line 177
    .line 178
    iget-object v13, v0, Lc4/a;->d:Ljava/lang/String;

    .line 179
    .line 180
    iget-boolean v14, v0, Lc4/a;->b:Z

    .line 181
    .line 182
    iget-object v10, v5, Lc4/g;->c:Lh4/h;

    .line 183
    .line 184
    iget v11, v0, Lc4/a;->c:I

    .line 185
    .line 186
    invoke-direct/range {v8 .. v15}, Lh4/o;-><init>(Landroid/graphics/drawable/Drawable;Lh4/h;ILf4/c;Ljava/lang/String;ZZ)V

    .line 187
    .line 188
    .line 189
    return-object v8
.end method
