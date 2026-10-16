.class public Lad/q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/Boolean;

.field public final d:Ljava/util/List;

.field public final e:Ljava/lang/Integer;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/util/Map;

.field public final h:Ljava/lang/String;

.field public final i:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lad/q;->a:Ljava/util/List;

    .line 5
    .line 6
    iput-object p2, p0, Lad/q;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lad/q;->c:Ljava/lang/Boolean;

    .line 9
    .line 10
    iput-object p4, p0, Lad/q;->d:Ljava/util/List;

    .line 11
    .line 12
    iput-object p5, p0, Lad/q;->e:Ljava/lang/Integer;

    .line 13
    .line 14
    iput-object p6, p0, Lad/q;->f:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p7, p0, Lad/q;->g:Ljava/util/Map;

    .line 17
    .line 18
    iput-object p8, p0, Lad/q;->h:Ljava/lang/String;

    .line 19
    .line 20
    iput-object p9, p0, Lad/q;->i:Ljava/util/List;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final a()Lx6/g;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/ads/AdRequest$Builder;

    .line 2
    .line 3
    const/16 v1, 0xe

    .line 4
    .line 5
    invoke-direct {v0, v1}, LA7/B0;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lad/q;->b(LA7/B0;)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lx6/g;

    .line 12
    .line 13
    invoke-direct {v1, v0}, Lx6/g;-><init>(LA7/B0;)V

    .line 14
    .line 15
    .line 16
    return-object v1
.end method

.method public final b(LA7/B0;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lad/q;->a:Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {p1, v1}, LA7/B0;->w(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v0, p0, Lad/q;->b:Ljava/lang/String;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {p1, v0}, LA7/B0;->T(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    new-instance v0, Ljava/util/HashMap;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, Lad/q;->i:Ljava/util/List;

    .line 38
    .line 39
    if-eqz v1, :cond_3

    .line 40
    .line 41
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-nez v2, :cond_2

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    invoke-static {v1}, LVa/M6;->j(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    throw p1

    .line 57
    :cond_3
    :goto_1
    iget-object v1, p0, Lad/q;->g:Ljava/util/Map;

    .line 58
    .line 59
    const-class v2, Lcom/google/ads/mediation/admob/AdMobAdapter;

    .line 60
    .line 61
    if-eqz v1, :cond_5

    .line 62
    .line 63
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-nez v3, :cond_5

    .line 68
    .line 69
    new-instance v3, Landroid/os/Bundle;

    .line 70
    .line 71
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 72
    .line 73
    .line 74
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    if-eqz v4, :cond_4

    .line 87
    .line 88
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    check-cast v4, Ljava/util/Map$Entry;

    .line 93
    .line 94
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    check-cast v5, Ljava/lang/String;

    .line 99
    .line 100
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    check-cast v4, Ljava/lang/String;

    .line 105
    .line 106
    invoke-virtual {v3, v5, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_4
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    :cond_5
    iget-object v1, p0, Lad/q;->c:Ljava/lang/Boolean;

    .line 114
    .line 115
    if-eqz v1, :cond_7

    .line 116
    .line 117
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    if-eqz v1, :cond_7

    .line 122
    .line 123
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    check-cast v1, Landroid/os/Bundle;

    .line 128
    .line 129
    if-nez v1, :cond_6

    .line 130
    .line 131
    new-instance v1, Landroid/os/Bundle;

    .line 132
    .line 133
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 134
    .line 135
    .line 136
    :cond_6
    const-string v3, "npa"

    .line 137
    .line 138
    const-string v4, "1"

    .line 139
    .line 140
    invoke-virtual {v1, v3, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    :cond_7
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    if-eqz v1, :cond_8

    .line 159
    .line 160
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    check-cast v1, Ljava/util/Map$Entry;

    .line 165
    .line 166
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    check-cast v2, Ljava/lang/Class;

    .line 171
    .line 172
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    check-cast v1, Landroid/os/Bundle;

    .line 177
    .line 178
    invoke-virtual {p1, v2, v1}, LA7/B0;->x(Ljava/lang/Class;Landroid/os/Bundle;)LA7/B0;

    .line 179
    .line 180
    .line 181
    goto :goto_3

    .line 182
    :cond_8
    iget-object v0, p0, Lad/q;->d:Ljava/util/List;

    .line 183
    .line 184
    if-eqz v0, :cond_9

    .line 185
    .line 186
    invoke-virtual {p1, v0}, LA7/B0;->U(Ljava/util/List;)V

    .line 187
    .line 188
    .line 189
    :cond_9
    iget-object v0, p0, Lad/q;->e:Ljava/lang/Integer;

    .line 190
    .line 191
    if-eqz v0, :cond_a

    .line 192
    .line 193
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    iget-object v1, p1, LA7/B0;->a:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast v1, LD6/P0;

    .line 200
    .line 201
    iput v0, v1, LD6/P0;->n:I

    .line 202
    .line 203
    :cond_a
    iget-object v0, p0, Lad/q;->h:Ljava/lang/String;

    .line 204
    .line 205
    invoke-virtual {p1, v0}, LA7/B0;->V(Ljava/lang/String;)LA7/B0;

    .line 206
    .line 207
    .line 208
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lad/q;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lad/q;

    .line 12
    .line 13
    iget-object v1, p1, Lad/q;->a:Ljava/util/List;

    .line 14
    .line 15
    iget-object v3, p0, Lad/q;->a:Ljava/util/List;

    .line 16
    .line 17
    invoke-static {v3, v1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    iget-object v1, p0, Lad/q;->b:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v3, p1, Lad/q;->b:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {v1, v3}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    iget-object v1, p0, Lad/q;->c:Ljava/lang/Boolean;

    .line 34
    .line 35
    iget-object v3, p1, Lad/q;->c:Ljava/lang/Boolean;

    .line 36
    .line 37
    invoke-static {v1, v3}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    iget-object v1, p0, Lad/q;->d:Ljava/util/List;

    .line 44
    .line 45
    iget-object v3, p1, Lad/q;->d:Ljava/util/List;

    .line 46
    .line 47
    invoke-static {v1, v3}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_2

    .line 52
    .line 53
    iget-object v1, p0, Lad/q;->e:Ljava/lang/Integer;

    .line 54
    .line 55
    iget-object v3, p1, Lad/q;->e:Ljava/lang/Integer;

    .line 56
    .line 57
    invoke-static {v1, v3}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_2

    .line 62
    .line 63
    iget-object v1, p0, Lad/q;->f:Ljava/lang/String;

    .line 64
    .line 65
    iget-object v3, p1, Lad/q;->f:Ljava/lang/String;

    .line 66
    .line 67
    invoke-static {v1, v3}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_2

    .line 72
    .line 73
    iget-object v1, p0, Lad/q;->g:Ljava/util/Map;

    .line 74
    .line 75
    iget-object v3, p1, Lad/q;->g:Ljava/util/Map;

    .line 76
    .line 77
    invoke-static {v1, v3}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-eqz v1, :cond_2

    .line 82
    .line 83
    iget-object v1, p0, Lad/q;->i:Ljava/util/List;

    .line 84
    .line 85
    iget-object p1, p1, Lad/q;->i:Ljava/util/List;

    .line 86
    .line 87
    invoke-static {v1, p1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-eqz p1, :cond_2

    .line 92
    .line 93
    return v0

    .line 94
    :cond_2
    return v2
.end method

.method public hashCode()I
    .locals 9

    .line 1
    iget-object v0, p0, Lad/q;->i:Ljava/util/List;

    .line 2
    .line 3
    iget-object v1, p0, Lad/q;->a:Ljava/util/List;

    .line 4
    .line 5
    iget-object v2, p0, Lad/q;->b:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lad/q;->c:Ljava/lang/Boolean;

    .line 8
    .line 9
    iget-object v4, p0, Lad/q;->d:Ljava/util/List;

    .line 10
    .line 11
    iget-object v5, p0, Lad/q;->e:Ljava/lang/Integer;

    .line 12
    .line 13
    iget-object v6, p0, Lad/q;->f:Ljava/lang/String;

    .line 14
    .line 15
    const/16 v7, 0x8

    .line 16
    .line 17
    new-array v7, v7, [Ljava/lang/Object;

    .line 18
    .line 19
    const/4 v8, 0x0

    .line 20
    aput-object v1, v7, v8

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    aput-object v2, v7, v1

    .line 24
    .line 25
    const/4 v1, 0x2

    .line 26
    aput-object v3, v7, v1

    .line 27
    .line 28
    const/4 v1, 0x3

    .line 29
    aput-object v4, v7, v1

    .line 30
    .line 31
    const/4 v1, 0x4

    .line 32
    aput-object v5, v7, v1

    .line 33
    .line 34
    const/4 v1, 0x5

    .line 35
    aput-object v6, v7, v1

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    const/4 v2, 0x6

    .line 39
    aput-object v1, v7, v2

    .line 40
    .line 41
    const/4 v1, 0x7

    .line 42
    aput-object v0, v7, v1

    .line 43
    .line 44
    invoke-static {v7}, Lj$/util/Objects;->hash([Ljava/lang/Object;)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    return v0
.end method
