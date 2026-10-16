.class public final Lio/flutter/plugin/platform/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/platform/g;


# instance fields
.field public a:I

.field public b:I

.field public c:Z

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;


# virtual methods
.method public a(II)V
    .locals 1

    .line 1
    iput p1, p0, Lio/flutter/plugin/platform/x;->a:I

    .line 2
    .line 3
    iput p2, p0, Lio/flutter/plugin/platform/x;->b:I

    .line 4
    .line 5
    iget-object v0, p0, Lio/flutter/plugin/platform/x;->e:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Landroid/graphics/SurfaceTexture;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, p1, p2}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    const-string v2, "Could not reach Cloud Firestore backend. "

    .line 4
    .line 5
    const-string v3, "\nThis typically indicates that your device does not have a healthy Internet connection at the moment. The client will operate in offline mode until it is able to successfully connect to the backend."

    .line 6
    .line 7
    invoke-static {v2, p1, v3}, LA7/p0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-boolean v2, p0, Lio/flutter/plugin/platform/x;->c:Z

    .line 12
    .line 13
    const-string v3, "%s"

    .line 14
    .line 15
    const-string v4, "OnlineStateTracker"

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    new-array v1, v1, [Ljava/lang/Object;

    .line 20
    .line 21
    aput-object p1, v1, v0

    .line 22
    .line 23
    const/4 p1, 0x2

    .line 24
    invoke-static {v4, v3, p1, v1}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iput-boolean v0, p0, Lio/flutter/plugin/platform/x;->c:Z

    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    new-array v2, v1, [Ljava/lang/Object;

    .line 31
    .line 32
    aput-object p1, v2, v0

    .line 33
    .line 34
    invoke-static {v4, v3, v1, v2}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public c(I)V
    .locals 10

    .line 1
    iget v0, p0, Lio/flutter/plugin/platform/x;->a:I

    .line 2
    .line 3
    if-eq p1, v0, :cond_6

    .line 4
    .line 5
    iput p1, p0, Lio/flutter/plugin/platform/x;->a:I

    .line 6
    .line 7
    iget-object v0, p0, Lio/flutter/plugin/platform/x;->f:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lo1/c;

    .line 10
    .line 11
    iget-object v0, v0, Lo1/c;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lad/L;

    .line 14
    .line 15
    iget-object v0, v0, Lad/L;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lp9/s;

    .line 18
    .line 19
    invoke-virtual {v0}, Lp9/s;->e()Lp9/z;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, "handleOnlineStateChange"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lp9/z;->a(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    new-instance v1, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    iget-object v2, v0, Lp9/z;->c:Ljava/util/HashMap;

    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    const/4 v4, 0x0

    .line 48
    if-eqz v3, :cond_2

    .line 49
    .line 50
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    check-cast v3, Ljava/util/Map$Entry;

    .line 55
    .line 56
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    check-cast v3, Lp9/w;

    .line 61
    .line 62
    iget-object v3, v3, Lp9/w;->c:Lp9/C;

    .line 63
    .line 64
    iget-boolean v5, v3, Lp9/C;->b:Z

    .line 65
    .line 66
    const/4 v6, 0x0

    .line 67
    if-eqz v5, :cond_1

    .line 68
    .line 69
    const/4 v5, 0x3

    .line 70
    if-ne p1, v5, :cond_1

    .line 71
    .line 72
    iput-boolean v4, v3, Lp9/C;->b:Z

    .line 73
    .line 74
    new-instance v5, LA7/b0;

    .line 75
    .line 76
    iget-object v7, v3, Lp9/C;->d:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v7, Ls9/i;

    .line 79
    .line 80
    new-instance v8, La2/v;

    .line 81
    .line 82
    const/16 v9, 0x13

    .line 83
    .line 84
    invoke-direct {v8, v9}, La2/v;-><init>(I)V

    .line 85
    .line 86
    .line 87
    iget-object v9, v3, Lp9/C;->g:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v9, Lc9/d;

    .line 90
    .line 91
    invoke-direct {v5, v7, v8, v9, v4}, LA7/b0;-><init>(Ls9/i;La2/v;Lc9/d;Z)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v3, v5, v6, v4}, Lp9/C;->a(LA7/b0;Lv9/t;Z)LX2/j;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    goto :goto_1

    .line 99
    :cond_1
    new-instance v3, LX2/j;

    .line 100
    .line 101
    sget-object v5, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 102
    .line 103
    const/16 v7, 0x19

    .line 104
    .line 105
    invoke-direct {v3, v7, v6, v5}, LX2/j;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    :goto_1
    iget-object v5, v3, LX2/j;->c:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v5, Ljava/util/List;

    .line 111
    .line 112
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 113
    .line 114
    .line 115
    move-result v5

    .line 116
    const-string v6, "OnlineState should not affect limbo documents."

    .line 117
    .line 118
    new-array v4, v4, [Ljava/lang/Object;

    .line 119
    .line 120
    invoke-static {v5, v6, v4}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    iget-object v3, v3, LX2/j;->b:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v3, Lp9/D;

    .line 126
    .line 127
    if-eqz v3, :cond_0

    .line 128
    .line 129
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_2
    iget-object v2, v0, Lp9/z;->m:LQ1/n;

    .line 134
    .line 135
    invoke-virtual {v2, v1}, LQ1/n;->e(Ljava/util/List;)V

    .line 136
    .line 137
    .line 138
    iget-object v0, v0, Lp9/z;->m:LQ1/n;

    .line 139
    .line 140
    iput p1, v0, LQ1/n;->a:I

    .line 141
    .line 142
    iget-object v1, v0, LQ1/n;->c:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v1, Ljava/util/HashMap;

    .line 145
    .line 146
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    if-eqz v2, :cond_5

    .line 159
    .line 160
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    check-cast v2, Lp9/h;

    .line 165
    .line 166
    iget-object v2, v2, Lp9/h;->a:Ljava/util/ArrayList;

    .line 167
    .line 168
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    :cond_4
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    if-eqz v3, :cond_3

    .line 177
    .line 178
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    check-cast v3, Lp9/v;

    .line 183
    .line 184
    iput p1, v3, Lp9/v;->e:I

    .line 185
    .line 186
    iget-object v5, v3, Lp9/v;->f:Lp9/D;

    .line 187
    .line 188
    if-eqz v5, :cond_4

    .line 189
    .line 190
    iget-boolean v6, v3, Lp9/v;->d:Z

    .line 191
    .line 192
    if-nez v6, :cond_4

    .line 193
    .line 194
    invoke-virtual {v3, v5, p1}, Lp9/v;->d(Lp9/D;I)Z

    .line 195
    .line 196
    .line 197
    move-result v5

    .line 198
    if-eqz v5, :cond_4

    .line 199
    .line 200
    iget-object v4, v3, Lp9/v;->f:Lp9/D;

    .line 201
    .line 202
    invoke-virtual {v3, v4}, Lp9/v;->c(Lp9/D;)V

    .line 203
    .line 204
    .line 205
    const/4 v4, 0x1

    .line 206
    goto :goto_2

    .line 207
    :cond_5
    if-eqz v4, :cond_6

    .line 208
    .line 209
    invoke-virtual {v0}, LQ1/n;->f()V

    .line 210
    .line 211
    .line 212
    :cond_6
    return-void
.end method

.method public d(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/platform/x;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lme/a;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lme/a;->n()V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Lio/flutter/plugin/platform/x;->d:Ljava/lang/Object;

    .line 12
    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    iput v0, p0, Lio/flutter/plugin/platform/x;->b:I

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    if-ne p1, v1, :cond_1

    .line 18
    .line 19
    iput-boolean v0, p0, Lio/flutter/plugin/platform/x;->c:Z

    .line 20
    .line 21
    :cond_1
    invoke-virtual {p0, p1}, Lio/flutter/plugin/platform/x;->c(I)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public getHeight()I
    .locals 1

    .line 1
    iget v0, p0, Lio/flutter/plugin/platform/x;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public getId()J
    .locals 2

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/platform/x;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/flutter/embedding/engine/renderer/i;

    .line 4
    .line 5
    iget-wide v0, v0, Lio/flutter/embedding/engine/renderer/i;->a:J

    .line 6
    .line 7
    return-wide v0
.end method

.method public getSurface()Landroid/view/Surface;
    .locals 3

    .line 1
    iget-object v0, p0, Lio/flutter/plugin/platform/x;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/Surface;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-boolean v2, p0, Lio/flutter/plugin/platform/x;->c:Z

    .line 9
    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    .line 16
    .line 17
    .line 18
    iput-object v1, p0, Lio/flutter/plugin/platform/x;->f:Ljava/lang/Object;

    .line 19
    .line 20
    :cond_1
    new-instance v0, Landroid/view/Surface;

    .line 21
    .line 22
    iget-object v2, p0, Lio/flutter/plugin/platform/x;->e:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v2, Landroid/graphics/SurfaceTexture;

    .line 25
    .line 26
    invoke-direct {v0, v2}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Lio/flutter/plugin/platform/x;->f:Ljava/lang/Object;

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    iput-boolean v0, p0, Lio/flutter/plugin/platform/x;->c:Z

    .line 33
    .line 34
    :goto_0
    iget-object v0, p0, Lio/flutter/plugin/platform/x;->e:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, Landroid/graphics/SurfaceTexture;

    .line 37
    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    invoke-static {v0}, Lio/flutter/plugin/editing/h;->A(Landroid/graphics/SurfaceTexture;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    iget-object v0, p0, Lio/flutter/plugin/platform/x;->f:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, Landroid/view/Surface;

    .line 50
    .line 51
    return-object v0

    .line 52
    :cond_3
    :goto_1
    return-object v1
.end method

.method public getWidth()I
    .locals 1

    .line 1
    iget v0, p0, Lio/flutter/plugin/platform/x;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public release()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lio/flutter/plugin/platform/x;->e:Ljava/lang/Object;

    .line 3
    .line 4
    iget-object v1, p0, Lio/flutter/plugin/platform/x;->f:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, Landroid/view/Surface;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v1}, Landroid/view/Surface;->release()V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lio/flutter/plugin/platform/x;->f:Ljava/lang/Object;

    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public synthetic scheduleFrame()V
    .locals 0

    .line 1
    return-void
.end method
