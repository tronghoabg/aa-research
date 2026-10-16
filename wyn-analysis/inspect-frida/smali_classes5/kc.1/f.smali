.class public final Lkc/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Llc/b;

.field public c:Lkc/r;

.field public d:LN2/j;

.field public e:Lkc/d;

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:Z

.field public j:Ljava/lang/Integer;

.field public final k:Lkc/c;


# direct methods
.method public constructor <init>(Lkc/e;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lkc/c;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, Lkc/c;-><init>(Ljava/lang/Object;I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lkc/f;->k:Lkc/c;

    .line 11
    .line 12
    iput-object p1, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    iput-boolean p1, p0, Lkc/f;->h:Z

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a(LE5/l;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-interface {v0}, Lkc/e;->n()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    :cond_0
    invoke-static {}, Lb7/k;->z()Lb7/k;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v0, v0, Lb7/k;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Loc/d;

    .line 22
    .line 23
    iget-object v0, v0, Loc/d;->d:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, LM/y;

    .line 26
    .line 27
    iget-object v0, v0, LM/y;->c:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, Ljava/lang/String;

    .line 30
    .line 31
    :cond_1
    new-instance v1, Lmc/a;

    .line 32
    .line 33
    iget-object v2, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 34
    .line 35
    invoke-interface {v2}, Lkc/e;->s()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-direct {v1, v0, v2}, Lmc/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 43
    .line 44
    invoke-interface {v0}, Lkc/e;->l()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    if-nez v0, :cond_2

    .line 49
    .line 50
    iget-object v0, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 51
    .line 52
    invoke-interface {v0}, Lkc/e;->getActivity()Landroid/app/Activity;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {p0, v0}, Lkc/f;->d(Landroid/content/Intent;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    if-nez v0, :cond_2

    .line 65
    .line 66
    const-string v0, "/"

    .line 67
    .line 68
    :cond_2
    iput-object v1, p1, LE5/l;->e:Ljava/lang/Object;

    .line 69
    .line 70
    iput-object v0, p1, LE5/l;->f:Ljava/lang/Object;

    .line 71
    .line 72
    iget-object v0, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 73
    .line 74
    invoke-interface {v0}, Lkc/e;->f()Ljava/util/List;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    iput-object v0, p1, LE5/l;->g:Ljava/lang/Object;

    .line 79
    .line 80
    return-void
.end method

.method public final b()V
    .locals 3

    .line 1
    iget-object v0, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-interface {v0}, Lkc/e;->z()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-interface {v0}, Lkc/e;->k()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    .line 16
    .line 17
    new-instance v1, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string v2, "The internal FlutterEngine created by "

    .line 20
    .line 21
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iget-object v2, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v2, " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine"

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    throw v0
.end method

.method public final c()V
    .locals 2

    .line 1
    iget-object v0, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    const-string v1, "Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate."

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0
.end method

.method public final d(Landroid/content/Intent;)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-interface {v0}, Lkc/e;->t()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    return-object p1
.end method

.method public final e(IILandroid/content/Intent;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lkc/f;->c()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lkc/f;->b:Llc/b;

    .line 5
    .line 6
    if-eqz v0, :cond_4

    .line 7
    .line 8
    invoke-static {p3}, Lj$/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lkc/f;->b:Llc/b;

    .line 12
    .line 13
    iget-object v0, v0, Llc/b;->d:LK8/H;

    .line 14
    .line 15
    invoke-virtual {v0}, LK8/H;->n()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_3

    .line 20
    .line 21
    const-string v1, "FlutterEngineConnectionRegistry#onActivityResult"

    .line 22
    .line 23
    invoke-static {v1}, Lld/a;->b(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :try_start_0
    iget-object v0, v0, LK8/H;->g:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Lq/s1;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    new-instance v1, Ljava/util/HashSet;

    .line 34
    .line 35
    iget-object v0, v0, Lq/s1;->d:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Ljava/util/HashSet;

    .line 38
    .line 39
    invoke-direct {v1, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    const/4 v1, 0x0

    .line 47
    :cond_0
    move v2, v1

    .line 48
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_2

    .line 53
    .line 54
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    check-cast v3, Luc/t;

    .line 59
    .line 60
    invoke-interface {v3, p1, p2, p3}, Luc/t;->onActivityResult(IILandroid/content/Intent;)Z

    .line 61
    .line 62
    .line 63
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    if-nez v3, :cond_1

    .line 65
    .line 66
    if-eqz v2, :cond_0

    .line 67
    .line 68
    :cond_1
    const/4 v2, 0x1

    .line 69
    goto :goto_0

    .line 70
    :catchall_0
    move-exception p1

    .line 71
    goto :goto_1

    .line 72
    :cond_2
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :goto_1
    :try_start_1
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 77
    .line 78
    .line 79
    goto :goto_2

    .line 80
    :catchall_1
    move-exception p2

    .line 81
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 82
    .line 83
    .line 84
    :goto_2
    throw p1

    .line 85
    :cond_3
    const-string p1, "FlutterEngineCxnRegstry"

    .line 86
    .line 87
    const-string p2, "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached."

    .line 88
    .line 89
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :cond_4
    const-string p1, "FlutterActivityAndFragmentDelegate"

    .line 94
    .line 95
    const-string p2, "onActivityResult() invoked before FlutterFragment was attached to an Activity."

    .line 96
    .line 97
    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 98
    .line 99
    .line 100
    return-void
.end method

.method public final f()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lkc/f;->c()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lkc/f;->b:Llc/b;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    if-nez v0, :cond_7

    .line 8
    .line 9
    iget-object v0, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-interface {v0}, Lkc/e;->h()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-static {}, LE4/y;->a()LE4/y;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    iget-object v2, v2, LE4/y;->a:Ljava/util/HashMap;

    .line 22
    .line 23
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Llc/b;

    .line 28
    .line 29
    iput-object v2, p0, Lkc/f;->b:Llc/b;

    .line 30
    .line 31
    iput-boolean v1, p0, Lkc/f;->f:Z

    .line 32
    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    goto/16 :goto_3

    .line 36
    .line 37
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 38
    .line 39
    const-string v2, "The requested cached FlutterEngine did not exist in the FlutterEngineCache: \'"

    .line 40
    .line 41
    const-string v3, "\'"

    .line 42
    .line 43
    invoke-static {v2, v0, v3}, LA7/p0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw v1

    .line 51
    :cond_1
    iget-object v0, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 52
    .line 53
    invoke-interface {v0}, Lkc/e;->getContext()Landroid/content/Context;

    .line 54
    .line 55
    .line 56
    invoke-interface {v0}, Lkc/e;->a()Llc/b;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iput-object v0, p0, Lkc/f;->b:Llc/b;

    .line 61
    .line 62
    if-eqz v0, :cond_2

    .line 63
    .line 64
    iput-boolean v1, p0, Lkc/f;->f:Z

    .line 65
    .line 66
    goto/16 :goto_3

    .line 67
    .line 68
    :cond_2
    iget-object v0, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 69
    .line 70
    invoke-interface {v0}, Lkc/e;->x()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    const/4 v2, 0x0

    .line 75
    if-eqz v0, :cond_6

    .line 76
    .line 77
    sget-object v3, Llc/e;->b:Llc/e;

    .line 78
    .line 79
    if-nez v3, :cond_4

    .line 80
    .line 81
    const-class v3, Llc/e;

    .line 82
    .line 83
    monitor-enter v3

    .line 84
    :try_start_0
    sget-object v4, Llc/e;->b:Llc/e;

    .line 85
    .line 86
    if-nez v4, :cond_3

    .line 87
    .line 88
    new-instance v4, Llc/e;

    .line 89
    .line 90
    const/4 v5, 0x0

    .line 91
    invoke-direct {v4, v5}, Llc/e;-><init>(I)V

    .line 92
    .line 93
    .line 94
    sput-object v4, Llc/e;->b:Llc/e;

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :catchall_0
    move-exception v0

    .line 98
    goto :goto_1

    .line 99
    :cond_3
    :goto_0
    monitor-exit v3

    .line 100
    goto :goto_2

    .line 101
    :goto_1
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 102
    throw v0

    .line 103
    :cond_4
    :goto_2
    sget-object v3, Llc/e;->b:Llc/e;

    .line 104
    .line 105
    iget-object v3, v3, Llc/e;->a:Ljava/util/HashMap;

    .line 106
    .line 107
    invoke-virtual {v3, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    check-cast v3, Llc/d;

    .line 112
    .line 113
    if-eqz v3, :cond_5

    .line 114
    .line 115
    new-instance v0, LE5/l;

    .line 116
    .line 117
    iget-object v4, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 118
    .line 119
    invoke-interface {v4}, Lkc/e;->getContext()Landroid/content/Context;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    invoke-direct {v0, v4}, LE5/l;-><init>(Landroid/content/Context;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0, v0}, Lkc/f;->a(LE5/l;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v3, v0}, Llc/d;->a(LE5/l;)Llc/b;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    iput-object v0, p0, Lkc/f;->b:Llc/b;

    .line 134
    .line 135
    iput-boolean v2, p0, Lkc/f;->f:Z

    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_5
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 139
    .line 140
    const-string v2, "The requested cached FlutterEngineGroup did not exist in the FlutterEngineGroupCache: \'"

    .line 141
    .line 142
    const-string v3, "\'"

    .line 143
    .line 144
    invoke-static {v2, v0, v3}, LA7/p0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    throw v1

    .line 152
    :cond_6
    new-instance v0, Llc/d;

    .line 153
    .line 154
    iget-object v3, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 155
    .line 156
    invoke-interface {v3}, Lkc/e;->getContext()Landroid/content/Context;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    iget-object v4, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 161
    .line 162
    invoke-interface {v4}, Lkc/e;->o()La2/v;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    invoke-virtual {v4}, La2/v;->z()[Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    invoke-direct {v0, v3, v4}, Llc/d;-><init>(Landroid/content/Context;[Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    new-instance v3, LE5/l;

    .line 174
    .line 175
    iget-object v4, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 176
    .line 177
    invoke-interface {v4}, Lkc/e;->getContext()Landroid/content/Context;

    .line 178
    .line 179
    .line 180
    move-result-object v4

    .line 181
    invoke-direct {v3, v4}, LE5/l;-><init>(Landroid/content/Context;)V

    .line 182
    .line 183
    .line 184
    iput-boolean v2, v3, LE5/l;->b:Z

    .line 185
    .line 186
    iget-object v4, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 187
    .line 188
    invoke-interface {v4}, Lkc/e;->i()Z

    .line 189
    .line 190
    .line 191
    move-result v4

    .line 192
    iput-boolean v4, v3, LE5/l;->c:Z

    .line 193
    .line 194
    invoke-virtual {p0, v3}, Lkc/f;->a(LE5/l;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v0, v3}, Llc/d;->a(LE5/l;)Llc/b;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    iput-object v0, p0, Lkc/f;->b:Llc/b;

    .line 202
    .line 203
    iput-boolean v2, p0, Lkc/f;->f:Z

    .line 204
    .line 205
    :cond_7
    :goto_3
    iget-object v0, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 206
    .line 207
    invoke-interface {v0}, Lkc/e;->y()Z

    .line 208
    .line 209
    .line 210
    move-result v0

    .line 211
    if-eqz v0, :cond_a

    .line 212
    .line 213
    iget-object v0, p0, Lkc/f;->b:Llc/b;

    .line 214
    .line 215
    iget-object v0, v0, Llc/b;->d:LK8/H;

    .line 216
    .line 217
    iget-object v2, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 218
    .line 219
    invoke-interface {v2}, Lkc/e;->getLifecycle()Landroidx/lifecycle/o;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    const-string v3, "FlutterEngineConnectionRegistry#attachToActivity"

    .line 227
    .line 228
    invoke-static {v3}, Lld/a;->b(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    :try_start_1
    iget-object v3, v0, LK8/H;->f:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast v3, Lkc/f;

    .line 234
    .line 235
    if-eqz v3, :cond_8

    .line 236
    .line 237
    invoke-virtual {v3}, Lkc/f;->b()V

    .line 238
    .line 239
    .line 240
    goto :goto_4

    .line 241
    :catchall_1
    move-exception v0

    .line 242
    goto :goto_5

    .line 243
    :cond_8
    :goto_4
    invoke-virtual {v0}, LK8/H;->l()V

    .line 244
    .line 245
    .line 246
    iput-object p0, v0, LK8/H;->f:Ljava/lang/Object;

    .line 247
    .line 248
    iget-object v3, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 249
    .line 250
    invoke-interface {v3}, Lkc/e;->getActivity()Landroid/app/Activity;

    .line 251
    .line 252
    .line 253
    move-result-object v3

    .line 254
    if-eqz v3, :cond_9

    .line 255
    .line 256
    invoke-virtual {v0, v3, v2}, LK8/H;->f(Landroid/app/Activity;Landroidx/lifecycle/o;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 257
    .line 258
    .line 259
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 260
    .line 261
    .line 262
    goto :goto_7

    .line 263
    :cond_9
    :try_start_2
    new-instance v0, Ljava/lang/AssertionError;

    .line 264
    .line 265
    const-string v1, "FlutterActivityAndFragmentDelegate\'s getAppComponent should only be queried after onAttach, when the host\'s activity should always be non-null"

    .line 266
    .line 267
    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 268
    .line 269
    .line 270
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 271
    :goto_5
    :try_start_3
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 272
    .line 273
    .line 274
    goto :goto_6

    .line 275
    :catchall_2
    move-exception v1

    .line 276
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 277
    .line 278
    .line 279
    :goto_6
    throw v0

    .line 280
    :cond_a
    :goto_7
    iget-object v0, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 281
    .line 282
    invoke-interface {v0}, Lkc/e;->getActivity()Landroid/app/Activity;

    .line 283
    .line 284
    .line 285
    move-result-object v2

    .line 286
    iget-object v3, p0, Lkc/f;->b:Llc/b;

    .line 287
    .line 288
    invoke-interface {v0, v2, v3}, Lkc/e;->m(Landroid/app/Activity;Llc/b;)LN2/j;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    iput-object v0, p0, Lkc/f;->d:LN2/j;

    .line 293
    .line 294
    iget-object v0, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 295
    .line 296
    iget-object v2, p0, Lkc/f;->b:Llc/b;

    .line 297
    .line 298
    invoke-interface {v0, v2}, Lkc/e;->b(Llc/b;)V

    .line 299
    .line 300
    .line 301
    iput-boolean v1, p0, Lkc/f;->i:Z

    .line 302
    .line 303
    return-void
.end method

.method public final g(IZ)Lkc/r;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lkc/f;->c()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 5
    .line 6
    invoke-interface {v0}, Lkc/e;->p()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-ne v0, v1, :cond_1

    .line 13
    .line 14
    new-instance v0, Lkc/n;

    .line 15
    .line 16
    iget-object v3, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 17
    .line 18
    invoke-interface {v3}, Lkc/e;->getContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    iget-object v4, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-interface {v4}, Lkc/e;->q()I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    const/4 v5, 0x2

    .line 29
    if-ne v4, v5, :cond_0

    .line 30
    .line 31
    move v2, v1

    .line 32
    :cond_0
    invoke-direct {v0, v3, v2}, Lkc/n;-><init>(Landroid/content/Context;Z)V

    .line 33
    .line 34
    .line 35
    iget-object v2, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    new-instance v2, Lkc/r;

    .line 41
    .line 42
    iget-object v3, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 43
    .line 44
    invoke-interface {v3}, Lkc/e;->getContext()Landroid/content/Context;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-direct {v2, v3, v0}, Lkc/r;-><init>(Landroid/content/Context;Lkc/n;)V

    .line 49
    .line 50
    .line 51
    iput-object v2, p0, Lkc/f;->c:Lkc/r;

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    new-instance v0, Lkc/p;

    .line 55
    .line 56
    iget-object v3, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 57
    .line 58
    invoke-interface {v3}, Lkc/e;->getContext()Landroid/content/Context;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-direct {v0, v3}, Lkc/p;-><init>(Landroid/content/Context;)V

    .line 63
    .line 64
    .line 65
    iget-object v3, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 66
    .line 67
    invoke-interface {v3}, Lkc/e;->q()I

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-ne v3, v1, :cond_2

    .line 72
    .line 73
    move v2, v1

    .line 74
    :cond_2
    invoke-virtual {v0, v2}, Landroid/view/TextureView;->setOpaque(Z)V

    .line 75
    .line 76
    .line 77
    iget-object v2, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 78
    .line 79
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    new-instance v2, Lkc/r;

    .line 83
    .line 84
    iget-object v3, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 85
    .line 86
    invoke-interface {v3}, Lkc/e;->getContext()Landroid/content/Context;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    invoke-direct {v2, v3, v0}, Lkc/r;-><init>(Landroid/content/Context;Lkc/p;)V

    .line 91
    .line 92
    .line 93
    iput-object v2, p0, Lkc/f;->c:Lkc/r;

    .line 94
    .line 95
    :goto_0
    iget-object v0, p0, Lkc/f;->c:Lkc/r;

    .line 96
    .line 97
    iget-object v2, p0, Lkc/f;->k:Lkc/c;

    .line 98
    .line 99
    iget-object v0, v0, Lkc/r;->f:Ljava/util/HashSet;

    .line 100
    .line 101
    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    iget-object v0, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    iget-object v0, p0, Lkc/f;->c:Lkc/r;

    .line 110
    .line 111
    iget-object v2, p0, Lkc/f;->b:Llc/b;

    .line 112
    .line 113
    invoke-virtual {v0, v2}, Lkc/r;->a(Llc/b;)V

    .line 114
    .line 115
    .line 116
    iget-object v0, p0, Lkc/f;->c:Lkc/r;

    .line 117
    .line 118
    invoke-virtual {v0, p1}, Landroid/view/View;->setId(I)V

    .line 119
    .line 120
    .line 121
    if-eqz p2, :cond_5

    .line 122
    .line 123
    iget-object p1, p0, Lkc/f;->c:Lkc/r;

    .line 124
    .line 125
    iget-object p2, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 126
    .line 127
    invoke-interface {p2}, Lkc/e;->p()I

    .line 128
    .line 129
    .line 130
    move-result p2

    .line 131
    if-ne p2, v1, :cond_4

    .line 132
    .line 133
    iget-object p2, p0, Lkc/f;->e:Lkc/d;

    .line 134
    .line 135
    if-eqz p2, :cond_3

    .line 136
    .line 137
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 138
    .line 139
    .line 140
    move-result-object p2

    .line 141
    iget-object v0, p0, Lkc/f;->e:Lkc/d;

    .line 142
    .line 143
    invoke-virtual {p2, v0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 144
    .line 145
    .line 146
    :cond_3
    new-instance p2, Lkc/d;

    .line 147
    .line 148
    invoke-direct {p2, p0, p1}, Lkc/d;-><init>(Lkc/f;Lkc/r;)V

    .line 149
    .line 150
    .line 151
    iput-object p2, p0, Lkc/f;->e:Lkc/d;

    .line 152
    .line 153
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    iget-object p2, p0, Lkc/f;->e:Lkc/d;

    .line 158
    .line 159
    invoke-virtual {p1, p2}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 160
    .line 161
    .line 162
    goto :goto_1

    .line 163
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 164
    .line 165
    const-string p2, "Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`."

    .line 166
    .line 167
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    throw p1

    .line 171
    :cond_5
    :goto_1
    iget-object p1, p0, Lkc/f;->c:Lkc/r;

    .line 172
    .line 173
    return-object p1
.end method

.method public final h()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lkc/f;->c()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lkc/f;->e:Lkc/d;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lkc/f;->c:Lkc/r;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, Lkc/f;->e:Lkc/d;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    iput-object v0, p0, Lkc/f;->e:Lkc/d;

    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Lkc/f;->c:Lkc/r;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0}, Lkc/r;->b()V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lkc/f;->c:Lkc/r;

    .line 30
    .line 31
    iget-object v1, p0, Lkc/f;->k:Lkc/c;

    .line 32
    .line 33
    iget-object v0, v0, Lkc/r;->f:Ljava/util/HashSet;

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    :cond_1
    return-void
.end method

.method public final i()V
    .locals 10

    .line 1
    iget-boolean v0, p0, Lkc/f;->i:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {p0}, Lkc/f;->c()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v1, p0, Lkc/f;->b:Llc/b;

    .line 12
    .line 13
    invoke-interface {v0, v1}, Lkc/e;->c(Llc/b;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 17
    .line 18
    invoke-interface {v0}, Lkc/e;->y()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x1

    .line 23
    if-eqz v0, :cond_4

    .line 24
    .line 25
    iget-object v0, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-interface {v0}, Lkc/e;->getActivity()Landroid/app/Activity;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_3

    .line 36
    .line 37
    iget-object v0, p0, Lkc/f;->b:Llc/b;

    .line 38
    .line 39
    iget-object v0, v0, Llc/b;->d:LK8/H;

    .line 40
    .line 41
    invoke-virtual {v0}, LK8/H;->n()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_2

    .line 46
    .line 47
    const-string v2, "FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges"

    .line 48
    .line 49
    invoke-static {v2}, Lld/a;->b(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    :try_start_0
    iput-boolean v1, v0, LK8/H;->a:Z

    .line 53
    .line 54
    iget-object v2, v0, LK8/H;->e:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v2, Ljava/util/HashMap;

    .line 57
    .line 58
    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    if-eqz v3, :cond_1

    .line 71
    .line 72
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    check-cast v3, Lrc/a;

    .line 77
    .line 78
    invoke-interface {v3}, Lrc/a;->onDetachedFromActivityForConfigChanges()V

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :catchall_0
    move-exception v0

    .line 83
    goto :goto_1

    .line 84
    :cond_1
    invoke-virtual {v0}, LK8/H;->j()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    .line 86
    .line 87
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 88
    .line 89
    .line 90
    goto :goto_3

    .line 91
    :goto_1
    :try_start_1
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :catchall_1
    move-exception v1

    .line 96
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 97
    .line 98
    .line 99
    :goto_2
    throw v0

    .line 100
    :cond_2
    const-string v0, "FlutterEngineCxnRegstry"

    .line 101
    .line 102
    const-string v2, "Attempted to detach plugins from an Activity when no Activity was attached."

    .line 103
    .line 104
    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 105
    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_3
    iget-object v0, p0, Lkc/f;->b:Llc/b;

    .line 109
    .line 110
    iget-object v0, v0, Llc/b;->d:LK8/H;

    .line 111
    .line 112
    invoke-virtual {v0}, LK8/H;->i()V

    .line 113
    .line 114
    .line 115
    :cond_4
    :goto_3
    iget-object v0, p0, Lkc/f;->d:LN2/j;

    .line 116
    .line 117
    const/4 v2, 0x0

    .line 118
    if-eqz v0, :cond_5

    .line 119
    .line 120
    iget-object v0, v0, LN2/j;->d:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v0, Lba/a;

    .line 123
    .line 124
    iput-object v2, v0, Lba/a;->c:Ljava/lang/Object;

    .line 125
    .line 126
    iput-object v2, p0, Lkc/f;->d:LN2/j;

    .line 127
    .line 128
    :cond_5
    iget-object v0, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 129
    .line 130
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    iget-object v0, p0, Lkc/f;->b:Llc/b;

    .line 134
    .line 135
    if-eqz v0, :cond_6

    .line 136
    .line 137
    iget-object v0, v0, Llc/b;->g:Lg2/k;

    .line 138
    .line 139
    iget-boolean v3, v0, Lg2/k;->a:Z

    .line 140
    .line 141
    invoke-virtual {v0, v1, v3}, Lg2/k;->f(IZ)V

    .line 142
    .line 143
    .line 144
    :cond_6
    iget-object v0, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 145
    .line 146
    invoke-interface {v0}, Lkc/e;->z()Z

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    const/4 v1, 0x0

    .line 151
    if-eqz v0, :cond_f

    .line 152
    .line 153
    iget-object v0, p0, Lkc/f;->b:Llc/b;

    .line 154
    .line 155
    iget-object v3, v0, Llc/b;->t:Ljava/util/HashSet;

    .line 156
    .line 157
    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 162
    .line 163
    .line 164
    move-result v4

    .line 165
    if-eqz v4, :cond_7

    .line 166
    .line 167
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v4

    .line 171
    check-cast v4, Llc/a;

    .line 172
    .line 173
    invoke-interface {v4}, Llc/a;->b()V

    .line 174
    .line 175
    .line 176
    goto :goto_4

    .line 177
    :cond_7
    iget-object v3, v0, Llc/b;->d:LK8/H;

    .line 178
    .line 179
    invoke-virtual {v3}, LK8/H;->l()V

    .line 180
    .line 181
    .line 182
    new-instance v4, Ljava/util/HashSet;

    .line 183
    .line 184
    iget-object v5, v3, LK8/H;->b:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v5, Ljava/util/HashMap;

    .line 187
    .line 188
    invoke-virtual {v5}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 189
    .line 190
    .line 191
    move-result-object v6

    .line 192
    invoke-direct {v4, v6}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 196
    .line 197
    .line 198
    move-result-object v4

    .line 199
    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 200
    .line 201
    .line 202
    move-result v6

    .line 203
    if-eqz v6, :cond_b

    .line 204
    .line 205
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v6

    .line 209
    check-cast v6, Ljava/lang/Class;

    .line 210
    .line 211
    invoke-virtual {v5, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v7

    .line 215
    check-cast v7, Lqc/b;

    .line 216
    .line 217
    if-nez v7, :cond_8

    .line 218
    .line 219
    goto :goto_5

    .line 220
    :cond_8
    invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v8

    .line 224
    const-string v9, "FlutterEngineConnectionRegistry#remove "

    .line 225
    .line 226
    invoke-virtual {v9, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v8

    .line 230
    invoke-static {v8}, Lld/a;->b(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    :try_start_2
    instance-of v8, v7, Lrc/a;

    .line 234
    .line 235
    if-eqz v8, :cond_a

    .line 236
    .line 237
    invoke-virtual {v3}, LK8/H;->n()Z

    .line 238
    .line 239
    .line 240
    move-result v8

    .line 241
    if-eqz v8, :cond_9

    .line 242
    .line 243
    move-object v8, v7

    .line 244
    check-cast v8, Lrc/a;

    .line 245
    .line 246
    invoke-interface {v8}, Lrc/a;->onDetachedFromActivity()V

    .line 247
    .line 248
    .line 249
    goto :goto_6

    .line 250
    :catchall_2
    move-exception v0

    .line 251
    goto :goto_7

    .line 252
    :cond_9
    :goto_6
    iget-object v8, v3, LK8/H;->e:Ljava/lang/Object;

    .line 253
    .line 254
    check-cast v8, Ljava/util/HashMap;

    .line 255
    .line 256
    invoke-virtual {v8, v6}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    :cond_a
    iget-object v8, v3, LK8/H;->d:Ljava/lang/Object;

    .line 260
    .line 261
    check-cast v8, Lqc/a;

    .line 262
    .line 263
    invoke-interface {v7, v8}, Lqc/b;->onDetachedFromEngine(Lqc/a;)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v5, v6}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 267
    .line 268
    .line 269
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 270
    .line 271
    .line 272
    goto :goto_5

    .line 273
    :goto_7
    :try_start_3
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 274
    .line 275
    .line 276
    goto :goto_8

    .line 277
    :catchall_3
    move-exception v1

    .line 278
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 279
    .line 280
    .line 281
    :goto_8
    throw v0

    .line 282
    :cond_b
    invoke-virtual {v5}, Ljava/util/HashMap;->clear()V

    .line 283
    .line 284
    .line 285
    :goto_9
    iget-object v3, v0, Llc/b;->r:Lio/flutter/plugin/platform/q;

    .line 286
    .line 287
    iget-object v4, v3, Lio/flutter/plugin/platform/q;->k:Landroid/util/SparseArray;

    .line 288
    .line 289
    invoke-virtual {v4}, Landroid/util/SparseArray;->size()I

    .line 290
    .line 291
    .line 292
    move-result v5

    .line 293
    if-lez v5, :cond_c

    .line 294
    .line 295
    invoke-virtual {v4, v1}, Landroid/util/SparseArray;->keyAt(I)I

    .line 296
    .line 297
    .line 298
    move-result v4

    .line 299
    iget-object v3, v3, Lio/flutter/plugin/platform/q;->v:Lio/flutter/plugin/platform/n;

    .line 300
    .line 301
    invoke-virtual {v3, v4}, Lio/flutter/plugin/platform/n;->e(I)V

    .line 302
    .line 303
    .line 304
    goto :goto_9

    .line 305
    :cond_c
    :goto_a
    iget-object v3, v0, Llc/b;->s:Lio/flutter/plugin/platform/p;

    .line 306
    .line 307
    iget-object v4, v3, Lio/flutter/plugin/platform/p;->i:Landroid/util/SparseArray;

    .line 308
    .line 309
    invoke-virtual {v4}, Landroid/util/SparseArray;->size()I

    .line 310
    .line 311
    .line 312
    move-result v5

    .line 313
    if-lez v5, :cond_d

    .line 314
    .line 315
    invoke-virtual {v4, v1}, Landroid/util/SparseArray;->keyAt(I)I

    .line 316
    .line 317
    .line 318
    move-result v4

    .line 319
    iget-object v3, v3, Lio/flutter/plugin/platform/p;->p:Lio/flutter/plugin/platform/n;

    .line 320
    .line 321
    invoke-virtual {v3, v4}, Lio/flutter/plugin/platform/n;->e(I)V

    .line 322
    .line 323
    .line 324
    goto :goto_a

    .line 325
    :cond_d
    iget-object v3, v0, Llc/b;->c:Lmc/b;

    .line 326
    .line 327
    iget-object v3, v3, Lmc/b;->c:Ljava/lang/Object;

    .line 328
    .line 329
    check-cast v3, Lio/flutter/embedding/engine/FlutterJNI;

    .line 330
    .line 331
    invoke-virtual {v3, v2}, Lio/flutter/embedding/engine/FlutterJNI;->setPlatformMessageHandler(Lmc/k;)V

    .line 332
    .line 333
    .line 334
    iget-object v3, v0, Llc/b;->a:Lio/flutter/embedding/engine/FlutterJNI;

    .line 335
    .line 336
    iget-object v4, v0, Llc/b;->v:Leb/e;

    .line 337
    .line 338
    invoke-virtual {v3, v4}, Lio/flutter/embedding/engine/FlutterJNI;->removeEngineLifecycleListener(Llc/a;)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v3, v2}, Lio/flutter/embedding/engine/FlutterJNI;->setDeferredComponentManager(Lnc/a;)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {v3}, Lio/flutter/embedding/engine/FlutterJNI;->detachFromNativeAndReleaseResources()V

    .line 345
    .line 346
    .line 347
    invoke-static {}, Lb7/k;->z()Lb7/k;

    .line 348
    .line 349
    .line 350
    move-result-object v3

    .line 351
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 352
    .line 353
    .line 354
    sget-object v3, Llc/b;->x:Ljava/util/HashMap;

    .line 355
    .line 356
    iget-wide v4, v0, Llc/b;->u:J

    .line 357
    .line 358
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    invoke-virtual {v3, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    iget-object v0, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 366
    .line 367
    invoke-interface {v0}, Lkc/e;->h()Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    if-eqz v0, :cond_e

    .line 372
    .line 373
    invoke-static {}, LE4/y;->a()LE4/y;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    iget-object v3, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 378
    .line 379
    invoke-interface {v3}, Lkc/e;->h()Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v3

    .line 383
    invoke-virtual {v0, v3, v2}, LE4/y;->b(Ljava/lang/String;Llc/b;)V

    .line 384
    .line 385
    .line 386
    :cond_e
    iput-object v2, p0, Lkc/f;->b:Llc/b;

    .line 387
    .line 388
    :cond_f
    iput-boolean v1, p0, Lkc/f;->i:Z

    .line 389
    .line 390
    return-void
.end method

.method public final j(Landroid/content/Intent;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lkc/f;->c()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lkc/f;->b:Llc/b;

    .line 5
    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    iget-object v0, v0, Llc/b;->d:LK8/H;

    .line 9
    .line 10
    invoke-virtual {v0}, LK8/H;->n()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    const-string v1, "FlutterEngineConnectionRegistry#onNewIntent"

    .line 17
    .line 18
    invoke-static {v1}, Lld/a;->b(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    :try_start_0
    iget-object v0, v0, LK8/H;->g:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Lq/s1;

    .line 24
    .line 25
    iget-object v0, v0, Lq/s1;->e:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Ljava/util/HashSet;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_0

    .line 38
    .line 39
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, Luc/u;

    .line 44
    .line 45
    invoke-interface {v1, p1}, Luc/u;->onNewIntent(Landroid/content/Intent;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    goto :goto_1

    .line 51
    :cond_0
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 52
    .line 53
    .line 54
    goto :goto_3

    .line 55
    :goto_1
    :try_start_1
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 56
    .line 57
    .line 58
    goto :goto_2

    .line 59
    :catchall_1
    move-exception v0

    .line 60
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    :goto_2
    throw p1

    .line 64
    :cond_1
    const-string v0, "FlutterEngineCxnRegstry"

    .line 65
    .line 66
    const-string v1, "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached."

    .line 67
    .line 68
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 69
    .line 70
    .line 71
    :goto_3
    invoke-virtual {p0, p1}, Lkc/f;->d(Landroid/content/Intent;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    if-eqz p1, :cond_2

    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-nez v0, :cond_2

    .line 82
    .line 83
    iget-object v0, p0, Lkc/f;->b:Llc/b;

    .line 84
    .line 85
    iget-object v0, v0, Llc/b;->i:Lac/a;

    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    new-instance v1, Ljava/util/HashMap;

    .line 91
    .line 92
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 93
    .line 94
    .line 95
    const-string v2, "location"

    .line 96
    .line 97
    invoke-virtual {v1, v2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    iget-object p1, v0, Lac/a;->b:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast p1, Luc/r;

    .line 103
    .line 104
    const-string v0, "pushRouteInformation"

    .line 105
    .line 106
    const/4 v2, 0x0

    .line 107
    invoke-virtual {p1, v0, v1, v2}, Luc/r;->a(Ljava/lang/String;Ljava/lang/Object;Luc/q;)V

    .line 108
    .line 109
    .line 110
    :cond_2
    return-void

    .line 111
    :cond_3
    const-string p1, "FlutterActivityAndFragmentDelegate"

    .line 112
    .line 113
    const-string v0, "onNewIntent() invoked before FlutterFragment was attached to an Activity."

    .line 114
    .line 115
    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 116
    .line 117
    .line 118
    return-void
.end method

.method public final k()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lkc/f;->c()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lkc/f;->b:Llc/b;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-object v0, p0, Lkc/f;->d:LN2/j;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, LN2/j;->q()V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lkc/f;->b:Llc/b;

    .line 16
    .line 17
    iget-object v0, v0, Llc/b;->r:Lio/flutter/plugin/platform/q;

    .line 18
    .line 19
    invoke-virtual {v0}, Lio/flutter/plugin/platform/q;->m()V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    const-string v0, "FlutterActivityAndFragmentDelegate"

    .line 24
    .line 25
    const-string v1, "onPostResume() invoked before FlutterFragment was attached to an Activity."

    .line 26
    .line 27
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final l(I[Ljava/lang/String;[I)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lkc/f;->c()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lkc/f;->b:Llc/b;

    .line 5
    .line 6
    if-eqz v0, :cond_4

    .line 7
    .line 8
    invoke-static {p2}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    invoke-static {p3}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lkc/f;->b:Llc/b;

    .line 15
    .line 16
    iget-object v0, v0, Llc/b;->d:LK8/H;

    .line 17
    .line 18
    invoke-virtual {v0}, LK8/H;->n()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_3

    .line 23
    .line 24
    const-string v1, "FlutterEngineConnectionRegistry#onRequestPermissionsResult"

    .line 25
    .line 26
    invoke-static {v1}, Lld/a;->b(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :try_start_0
    iget-object v0, v0, LK8/H;->g:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Lq/s1;

    .line 32
    .line 33
    iget-object v0, v0, Lq/s1;->c:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Ljava/util/HashSet;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    const/4 v1, 0x0

    .line 42
    :cond_0
    move v2, v1

    .line 43
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eqz v3, :cond_2

    .line 48
    .line 49
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    check-cast v3, Luc/v;

    .line 54
    .line 55
    invoke-interface {v3, p1, p2, p3}, Luc/v;->onRequestPermissionsResult(I[Ljava/lang/String;[I)Z

    .line 56
    .line 57
    .line 58
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    if-nez v3, :cond_1

    .line 60
    .line 61
    if-eqz v2, :cond_0

    .line 62
    .line 63
    :cond_1
    const/4 v2, 0x1

    .line 64
    goto :goto_0

    .line 65
    :catchall_0
    move-exception p1

    .line 66
    goto :goto_1

    .line 67
    :cond_2
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :goto_1
    :try_start_1
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 72
    .line 73
    .line 74
    goto :goto_2

    .line 75
    :catchall_1
    move-exception p2

    .line 76
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 77
    .line 78
    .line 79
    :goto_2
    throw p1

    .line 80
    :cond_3
    const-string p1, "FlutterEngineCxnRegstry"

    .line 81
    .line 82
    const-string p2, "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached."

    .line 83
    .line 84
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_4
    const-string p1, "FlutterActivityAndFragmentDelegate"

    .line 89
    .line 90
    const-string p2, "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity."

    .line 91
    .line 92
    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 93
    .line 94
    .line 95
    return-void
.end method

.method public final m(Landroid/os/Bundle;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lkc/f;->c()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const-string v1, "plugins"

    .line 8
    .line 9
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 10
    .line 11
    .line 12
    const-string v1, "framework"

    .line 13
    .line 14
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object p1, v0

    .line 20
    :goto_0
    iget-object v1, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 21
    .line 22
    invoke-interface {v1}, Lkc/e;->i()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_3

    .line 27
    .line 28
    iget-object v1, p0, Lkc/f;->b:Llc/b;

    .line 29
    .line 30
    iget-object v1, v1, Llc/b;->k:Lq/o;

    .line 31
    .line 32
    const/4 v2, 0x1

    .line 33
    iput-boolean v2, v1, Lq/o;->d:Z

    .line 34
    .line 35
    iget-object v2, v1, Lq/o;->b:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v2, Ltc/g;

    .line 38
    .line 39
    if-eqz v2, :cond_1

    .line 40
    .line 41
    invoke-static {p1}, Lq/o;->d([B)Ljava/util/HashMap;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v2, v3}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iput-object v0, v1, Lq/o;->b:Ljava/lang/Object;

    .line 49
    .line 50
    iput-object p1, v1, Lq/o;->f:Ljava/lang/Object;

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    iget-boolean v2, v1, Lq/o;->e:Z

    .line 54
    .line 55
    if-eqz v2, :cond_2

    .line 56
    .line 57
    invoke-static {p1}, Lq/o;->d([B)Ljava/util/HashMap;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    new-instance v3, Ltc/g;

    .line 62
    .line 63
    const/4 v4, 0x0

    .line 64
    invoke-direct {v3, v4, v1, p1}, Ltc/g;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iget-object p1, v1, Lq/o;->a:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p1, Luc/r;

    .line 70
    .line 71
    const-string v1, "push"

    .line 72
    .line 73
    invoke-virtual {p1, v1, v2, v3}, Luc/r;->a(Ljava/lang/String;Ljava/lang/Object;Luc/q;)V

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_2
    iput-object p1, v1, Lq/o;->f:Ljava/lang/Object;

    .line 78
    .line 79
    :cond_3
    :goto_1
    iget-object p1, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 80
    .line 81
    invoke-interface {p1}, Lkc/e;->y()Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-eqz p1, :cond_7

    .line 86
    .line 87
    iget-object p1, p0, Lkc/f;->b:Llc/b;

    .line 88
    .line 89
    iget-object p1, p1, Llc/b;->d:LK8/H;

    .line 90
    .line 91
    invoke-virtual {p1}, LK8/H;->n()Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-eqz v1, :cond_6

    .line 96
    .line 97
    const-string v1, "FlutterEngineConnectionRegistry#onRestoreInstanceState"

    .line 98
    .line 99
    invoke-static {v1}, Lld/a;->b(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    :try_start_0
    iget-object p1, p1, LK8/H;->g:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast p1, Lq/s1;

    .line 105
    .line 106
    iget-object p1, p1, Lq/s1;->g:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast p1, Ljava/util/HashSet;

    .line 109
    .line 110
    invoke-virtual {p1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 115
    .line 116
    .line 117
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 118
    if-nez v1, :cond_4

    .line 119
    .line 120
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :cond_4
    :try_start_1
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    if-nez p1, :cond_5

    .line 129
    .line 130
    throw v0

    .line 131
    :catchall_0
    move-exception p1

    .line 132
    goto :goto_2

    .line 133
    :cond_5
    new-instance p1, Ljava/lang/ClassCastException;

    .line 134
    .line 135
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 136
    .line 137
    .line 138
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 139
    :goto_2
    :try_start_2
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 140
    .line 141
    .line 142
    goto :goto_3

    .line 143
    :catchall_1
    move-exception v0

    .line 144
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 145
    .line 146
    .line 147
    :goto_3
    throw p1

    .line 148
    :cond_6
    const-string p1, "FlutterEngineCxnRegstry"

    .line 149
    .line 150
    const-string v0, "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached."

    .line 151
    .line 152
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 153
    .line 154
    .line 155
    :cond_7
    return-void
.end method

.method public final n(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lkc/f;->c()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 5
    .line 6
    invoke-interface {v0}, Lkc/e;->i()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lkc/f;->b:Llc/b;

    .line 13
    .line 14
    iget-object v0, v0, Llc/b;->k:Lq/o;

    .line 15
    .line 16
    iget-object v0, v0, Lq/o;->f:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, [B

    .line 19
    .line 20
    const-string v1, "framework"

    .line 21
    .line 22
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-interface {v0}, Lkc/e;->y()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_4

    .line 32
    .line 33
    new-instance v0, Landroid/os/Bundle;

    .line 34
    .line 35
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lkc/f;->b:Llc/b;

    .line 39
    .line 40
    iget-object v1, v1, Llc/b;->d:LK8/H;

    .line 41
    .line 42
    invoke-virtual {v1}, LK8/H;->n()Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_3

    .line 47
    .line 48
    const-string v2, "FlutterEngineConnectionRegistry#onSaveInstanceState"

    .line 49
    .line 50
    invoke-static {v2}, Lld/a;->b(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    :try_start_0
    iget-object v1, v1, LK8/H;->g:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v1, Lq/s1;

    .line 56
    .line 57
    iget-object v1, v1, Lq/s1;->g:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v1, Ljava/util/HashSet;

    .line 60
    .line 61
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    if-nez v2, :cond_1

    .line 70
    .line 71
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 72
    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_1
    :try_start_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    if-nez p1, :cond_2

    .line 80
    .line 81
    const/4 p1, 0x0

    .line 82
    throw p1

    .line 83
    :catchall_0
    move-exception p1

    .line 84
    goto :goto_0

    .line 85
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 86
    .line 87
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 88
    .line 89
    .line 90
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 91
    :goto_0
    :try_start_2
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :catchall_1
    move-exception v0

    .line 96
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 97
    .line 98
    .line 99
    :goto_1
    throw p1

    .line 100
    :cond_3
    const-string v1, "FlutterEngineCxnRegstry"

    .line 101
    .line 102
    const-string v2, "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached."

    .line 103
    .line 104
    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 105
    .line 106
    .line 107
    :goto_2
    const-string v1, "plugins"

    .line 108
    .line 109
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 110
    .line 111
    .line 112
    :cond_4
    iget-object v0, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 113
    .line 114
    invoke-interface {v0}, Lkc/e;->h()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    if-eqz v0, :cond_5

    .line 119
    .line 120
    iget-object v0, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 121
    .line 122
    invoke-interface {v0}, Lkc/e;->z()Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-nez v0, :cond_5

    .line 127
    .line 128
    iget-object v0, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 129
    .line 130
    invoke-interface {v0}, Lkc/e;->v()Z

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    const-string v1, "enableOnBackInvokedCallbackState"

    .line 135
    .line 136
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 137
    .line 138
    .line 139
    :cond_5
    return-void
.end method

.method public final o()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lkc/f;->c()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 5
    .line 6
    invoke-interface {v0}, Lkc/e;->h()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto/16 :goto_1

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lkc/f;->b:Llc/b;

    .line 15
    .line 16
    iget-object v0, v0, Llc/b;->c:Lmc/b;

    .line 17
    .line 18
    iget-boolean v0, v0, Lmc/b;->b:Z

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    goto/16 :goto_1

    .line 23
    .line 24
    :cond_1
    iget-object v0, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 25
    .line 26
    invoke-interface {v0}, Lkc/e;->l()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    if-nez v0, :cond_2

    .line 31
    .line 32
    iget-object v0, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 33
    .line 34
    invoke-interface {v0}, Lkc/e;->getActivity()Landroid/app/Activity;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {p0, v0}, Lkc/f;->d(Landroid/content/Intent;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    if-nez v0, :cond_2

    .line 47
    .line 48
    const-string v0, "/"

    .line 49
    .line 50
    :cond_2
    iget-object v1, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 51
    .line 52
    invoke-interface {v1}, Lkc/e;->A()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    iget-object v2, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 57
    .line 58
    invoke-interface {v2}, Lkc/e;->s()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    iget-object v2, p0, Lkc/f;->b:Llc/b;

    .line 62
    .line 63
    iget-object v2, v2, Llc/b;->i:Lac/a;

    .line 64
    .line 65
    iget-object v2, v2, Lac/a;->b:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v2, Luc/r;

    .line 68
    .line 69
    const-string v3, "setInitialRoute"

    .line 70
    .line 71
    const/4 v4, 0x0

    .line 72
    invoke-virtual {v2, v3, v0, v4}, Luc/r;->a(Ljava/lang/String;Ljava/lang/Object;Luc/q;)V

    .line 73
    .line 74
    .line 75
    iget-object v0, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 76
    .line 77
    invoke-interface {v0}, Lkc/e;->n()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    if-eqz v0, :cond_3

    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-eqz v2, :cond_4

    .line 88
    .line 89
    :cond_3
    invoke-static {}, Lb7/k;->z()Lb7/k;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    iget-object v0, v0, Lb7/k;->b:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v0, Loc/d;

    .line 96
    .line 97
    iget-object v0, v0, Loc/d;->d:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v0, LM/y;

    .line 100
    .line 101
    iget-object v0, v0, LM/y;->c:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v0, Ljava/lang/String;

    .line 104
    .line 105
    :cond_4
    if-nez v1, :cond_5

    .line 106
    .line 107
    new-instance v1, Lmc/a;

    .line 108
    .line 109
    iget-object v2, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 110
    .line 111
    invoke-interface {v2}, Lkc/e;->s()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-direct {v1, v0, v2}, Lmc/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_5
    new-instance v2, Lmc/a;

    .line 120
    .line 121
    iget-object v3, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 122
    .line 123
    invoke-interface {v3}, Lkc/e;->s()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    invoke-direct {v2, v0, v1, v3}, Lmc/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    move-object v1, v2

    .line 131
    :goto_0
    iget-object v0, p0, Lkc/f;->b:Llc/b;

    .line 132
    .line 133
    iget-object v0, v0, Llc/b;->c:Lmc/b;

    .line 134
    .line 135
    iget-object v2, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 136
    .line 137
    invoke-interface {v2}, Lkc/e;->f()Ljava/util/List;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    invoke-virtual {v0, v1, v2}, Lmc/b;->d(Lmc/a;Ljava/util/List;)V

    .line 142
    .line 143
    .line 144
    :goto_1
    iget-object v0, p0, Lkc/f;->j:Ljava/lang/Integer;

    .line 145
    .line 146
    if-eqz v0, :cond_6

    .line 147
    .line 148
    iget-object v1, p0, Lkc/f;->c:Lkc/r;

    .line 149
    .line 150
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    invoke-virtual {v1, v0}, Lkc/r;->setVisibility(I)V

    .line 155
    .line 156
    .line 157
    :cond_6
    return-void
.end method

.method public final p()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lkc/f;->c()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lkc/f;->b:Llc/b;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, v0, Llc/b;->g:Lg2/k;

    .line 14
    .line 15
    iget-boolean v1, v0, Lg2/k;->a:Z

    .line 16
    .line 17
    const/4 v2, 0x5

    .line 18
    invoke-virtual {v0, v2, v1}, Lg2/k;->f(IZ)V

    .line 19
    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, Lkc/f;->c:Lkc/r;

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, Lkc/f;->j:Ljava/lang/Integer;

    .line 32
    .line 33
    iget-object v0, p0, Lkc/f;->c:Lkc/r;

    .line 34
    .line 35
    const/16 v1, 0x8

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Lkc/r;->setVisibility(I)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lkc/f;->b:Llc/b;

    .line 41
    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    const/16 v1, 0x28

    .line 45
    .line 46
    iget-object v0, v0, Llc/b;->b:Lio/flutter/embedding/engine/renderer/k;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Lio/flutter/embedding/engine/renderer/k;->e(I)V

    .line 49
    .line 50
    .line 51
    :cond_1
    return-void
.end method

.method public final q(I)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lkc/f;->c()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lkc/f;->b:Llc/b;

    .line 5
    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    iget-boolean v1, p0, Lkc/f;->h:Z

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    const/16 v1, 0xa

    .line 14
    .line 15
    if-lt p1, v1, :cond_1

    .line 16
    .line 17
    iget-object v0, v0, Llc/b;->c:Lmc/b;

    .line 18
    .line 19
    iget-object v0, v0, Lmc/b;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Lio/flutter/embedding/engine/FlutterJNI;

    .line 22
    .line 23
    invoke-virtual {v0}, Lio/flutter/embedding/engine/FlutterJNI;->isAttached()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    invoke-virtual {v0}, Lio/flutter/embedding/engine/FlutterJNI;->notifyLowMemoryWarning()V

    .line 30
    .line 31
    .line 32
    :cond_0
    iget-object v0, p0, Lkc/f;->b:Llc/b;

    .line 33
    .line 34
    iget-object v0, v0, Llc/b;->p:Ltc/a;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    new-instance v1, Ljava/util/HashMap;

    .line 40
    .line 41
    const/4 v3, 0x1

    .line 42
    invoke-direct {v1, v3}, Ljava/util/HashMap;-><init>(I)V

    .line 43
    .line 44
    .line 45
    const-string v3, "type"

    .line 46
    .line 47
    const-string v4, "memoryPressure"

    .line 48
    .line 49
    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    iget-object v0, v0, Ltc/a;->a:LVa/X7;

    .line 53
    .line 54
    invoke-virtual {v0, v1, v2}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 55
    .line 56
    .line 57
    :cond_1
    iget-object v0, p0, Lkc/f;->b:Llc/b;

    .line 58
    .line 59
    iget-object v0, v0, Llc/b;->b:Lio/flutter/embedding/engine/renderer/k;

    .line 60
    .line 61
    invoke-virtual {v0, p1}, Lio/flutter/embedding/engine/renderer/k;->e(I)V

    .line 62
    .line 63
    .line 64
    iget-object v0, p0, Lkc/f;->b:Llc/b;

    .line 65
    .line 66
    iget-object v0, v0, Llc/b;->r:Lio/flutter/plugin/platform/q;

    .line 67
    .line 68
    const/16 v1, 0x28

    .line 69
    .line 70
    if-ge p1, v1, :cond_2

    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_2
    iget-object p1, v0, Lio/flutter/plugin/platform/q;->i:Ljava/util/HashMap;

    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_3

    .line 91
    .line 92
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    check-cast v0, Lio/flutter/plugin/platform/B;

    .line 97
    .line 98
    iget-object v0, v0, Lio/flutter/plugin/platform/B;->h:Landroid/hardware/display/VirtualDisplay;

    .line 99
    .line 100
    invoke-virtual {v0, v2}, Landroid/hardware/display/VirtualDisplay;->setSurface(Landroid/view/Surface;)V

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_3
    return-void
.end method

.method public final r()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lkc/f;->c()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lkc/f;->b:Llc/b;

    .line 5
    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    iget-object v0, v0, Llc/b;->d:LK8/H;

    .line 9
    .line 10
    invoke-virtual {v0}, LK8/H;->n()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_2

    .line 15
    .line 16
    const-string v1, "FlutterEngineConnectionRegistry#onUserLeaveHint"

    .line 17
    .line 18
    invoke-static {v1}, Lld/a;->b(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    :try_start_0
    iget-object v0, v0, LK8/H;->g:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Lq/s1;

    .line 24
    .line 25
    iget-object v0, v0, Lq/s1;->f:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Ljava/util/HashSet;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    if-nez v1, :cond_0

    .line 38
    .line 39
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_0
    :try_start_1
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    if-nez v0, :cond_1

    .line 48
    .line 49
    const/4 v0, 0x0

    .line 50
    throw v0

    .line 51
    :catchall_0
    move-exception v0

    .line 52
    goto :goto_0

    .line 53
    :cond_1
    new-instance v0, Ljava/lang/ClassCastException;

    .line 54
    .line 55
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 56
    .line 57
    .line 58
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 59
    :goto_0
    :try_start_2
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :catchall_1
    move-exception v1

    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    :goto_1
    throw v0

    .line 68
    :cond_2
    const-string v0, "FlutterEngineCxnRegstry"

    .line 69
    .line 70
    const-string v1, "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached."

    .line 71
    .line 72
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_3
    const-string v0, "FlutterActivityAndFragmentDelegate"

    .line 77
    .line 78
    const-string v1, "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity."

    .line 79
    .line 80
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method public final s(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lkc/f;->c()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lkc/f;->a:Ljava/lang/Object;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lkc/f;->b:Llc/b;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, v0, Llc/b;->g:Lg2/k;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    iget p1, v0, Lg2/k;->b:I

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-virtual {v0, p1, v1}, Lg2/k;->f(IZ)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    iget p1, v0, Lg2/k;->b:I

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-virtual {v0, p1, v1}, Lg2/k;->f(IZ)V

    .line 28
    .line 29
    .line 30
    :cond_1
    return-void
.end method
