.class public final LVa/Za;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf6/D;
.implements LI5/g;
.implements Lcom/google/android/gms/tasks/Continuation;
.implements LT6/h;
.implements Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/n;
.implements Lkb/c;


# static fields
.field public static e:LVa/Za;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, LVa/Za;->a:Ljava/lang/Object;

    iput-object p2, p0, LVa/Za;->b:Ljava/lang/Object;

    iput-object p3, p0, LVa/Za;->c:Ljava/lang/Object;

    iput-object p4, p0, LVa/Za;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static l(LVa/Za;Landroid/view/View;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, LVa/Za;->c:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, LVa/gb;

    .line 21
    .line 22
    invoke-interface {v1, p1}, LVa/gb;->c(Landroid/view/View;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    monitor-exit p0

    .line 29
    return-void

    .line 30
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31
    throw p1
.end method

.method public static declared-synchronized n()LVa/Za;
    .locals 3

    .line 1
    const-class v0, LVa/Za;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, LVa/Za;->e:LVa/Za;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, LVa/Za;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    new-instance v2, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v2, v1, LVa/Za;->a:Ljava/lang/Object;

    .line 19
    .line 20
    new-instance v2, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v2, v1, LVa/Za;->c:Ljava/lang/Object;

    .line 26
    .line 27
    new-instance v2, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v2, v1, LVa/Za;->b:Ljava/lang/Object;

    .line 33
    .line 34
    new-instance v2, LVa/Ya;

    .line 35
    .line 36
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object v1, v2, LVa/Ya;->a:LVa/Za;

    .line 40
    .line 41
    iput-object v2, v1, LVa/Za;->d:Ljava/lang/Object;

    .line 42
    .line 43
    sput-object v1, LVa/Za;->e:LVa/Za;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception v1

    .line 47
    goto :goto_1

    .line 48
    :cond_0
    :goto_0
    sget-object v1, LVa/Za;->e:LVa/Za;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    monitor-exit v0

    .line 51
    return-object v1

    .line 52
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 53
    throw v1
.end method


# virtual methods
.method public A(ILf6/z;Lf6/p;Lf6/u;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LVa/Za;->i(ILf6/z;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, LVa/Za;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, LI5/f;

    .line 10
    .line 11
    invoke-virtual {p1, p3, p4}, LI5/f;->c(Lf6/p;Lf6/u;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public C(ILf6/z;Lf6/p;Lf6/u;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LVa/Za;->i(ILf6/z;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, LVa/Za;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, LI5/f;

    .line 10
    .line 11
    invoke-virtual {p1, p3, p4}, LI5/f;->d(Lf6/p;Lf6/u;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public D(ILf6/z;Lf6/p;Lf6/u;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LVa/Za;->i(ILf6/z;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, LVa/Za;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, LI5/f;

    .line 10
    .line 11
    invoke-virtual {p1, p3, p4}, LI5/f;->f(Lf6/p;Lf6/u;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public H(ILf6/z;Lf6/u;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LVa/Za;->i(ILf6/z;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, LVa/Za;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, LI5/f;

    .line 10
    .line 11
    invoke-virtual {p1, p3}, LI5/f;->b(Lf6/u;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public a(Ljava/util/HashMap;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "sqlite_error"

    .line 2
    .line 3
    iput-object v0, p0, LVa/Za;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, LVa/Za;->c:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p1, p0, LVa/Za;->d:Ljava/lang/Object;

    .line 8
    .line 9
    return-void
.end method

.method public b(Ljava/io/Serializable;)V
    .locals 0

    .line 1
    iput-object p1, p0, LVa/Za;->a:Ljava/lang/Object;

    .line 2
    .line 3
    return-void
.end method

.method public c(Landroid/os/IBinder;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/internal/auth/zze;->zzb(Landroid/os/IBinder;)Lcom/google/android/gms/internal/auth/zzf;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, LVa/Za;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Landroid/accounts/Account;

    .line 8
    .line 9
    iget-object v1, p0, LVa/Za;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Landroid/os/Bundle;

    .line 12
    .line 13
    iget-object v2, p0, LVa/Za;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v2, Ljava/lang/String;

    .line 16
    .line 17
    invoke-interface {p1, v0, v2, v1}, Lcom/google/android/gms/internal/auth/zzf;->zze(Landroid/accounts/Account;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    iget-object v0, p0, LVa/Za;->d:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Landroid/content/Context;

    .line 26
    .line 27
    invoke-static {v0, p1}, LT6/d;->a(Landroid/content/Context;Landroid/os/Bundle;)Lcom/google/android/gms/auth/TokenData;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1

    .line 32
    :cond_0
    new-instance p1, Ljava/io/IOException;

    .line 33
    .line 34
    const-string v0, "Service call returned null"

    .line 35
    .line 36
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw p1
.end method

.method public d(Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;)Ljava/util/HashMap;
    .locals 8

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_3

    .line 24
    .line 25
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Ls9/k;

    .line 30
    .line 31
    iget-object v4, v3, Ls9/k;->a:Ls9/h;

    .line 32
    .line 33
    invoke-interface {p2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    check-cast v4, Lt9/d;

    .line 38
    .line 39
    iget-object v5, v3, Ls9/k;->a:Ls9/h;

    .line 40
    .line 41
    invoke-interface {p3, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    if-eqz v6, :cond_1

    .line 46
    .line 47
    if-eqz v4, :cond_0

    .line 48
    .line 49
    iget-object v6, v4, Lt9/d;->b:Lt9/h;

    .line 50
    .line 51
    instance-of v6, v6, Lt9/l;

    .line 52
    .line 53
    if-eqz v6, :cond_1

    .line 54
    .line 55
    :cond_0
    invoke-virtual {v0, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    if-eqz v4, :cond_2

    .line 60
    .line 61
    iget-object v4, v4, Lt9/d;->b:Lt9/h;

    .line 62
    .line 63
    invoke-virtual {v4}, Lt9/h;->d()Lt9/f;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    invoke-virtual {v1, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v4}, Lt9/h;->d()Lt9/f;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    new-instance v6, Ls8/q;

    .line 75
    .line 76
    new-instance v7, Ljava/util/Date;

    .line 77
    .line 78
    invoke-direct {v7}, Ljava/util/Date;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-direct {v6, v7}, Ls8/q;-><init>(Ljava/util/Date;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v4, v3, v5, v6}, Lt9/h;->a(Ls9/k;Lt9/f;Ls8/q;)Lt9/f;

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_2
    sget-object v3, Lt9/f;->b:Lt9/f;

    .line 89
    .line 90
    invoke-virtual {v1, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_3
    invoke-virtual {p0, v0}, LVa/Za;->k(Ljava/util/Map;)Ljava/util/HashMap;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    invoke-virtual {v1, p2}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 99
    .line 100
    .line 101
    new-instance p2, Ljava/util/HashMap;

    .line 102
    .line 103
    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    .line 104
    .line 105
    .line 106
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 115
    .line 116
    .line 117
    move-result p3

    .line 118
    if-eqz p3, :cond_4

    .line 119
    .line 120
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p3

    .line 124
    check-cast p3, Ljava/util/Map$Entry;

    .line 125
    .line 126
    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    check-cast v0, Ls9/h;

    .line 131
    .line 132
    new-instance v2, Lr9/x;

    .line 133
    .line 134
    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    check-cast v3, Ls9/k;

    .line 139
    .line 140
    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p3

    .line 144
    invoke-virtual {v1, p3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p3

    .line 148
    check-cast p3, Lt9/f;

    .line 149
    .line 150
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 151
    .line 152
    .line 153
    iput-object v3, v2, Lr9/x;->a:Ls9/k;

    .line 154
    .line 155
    iput-object p3, v2, Lr9/x;->b:Lt9/f;

    .line 156
    .line 157
    invoke-virtual {p2, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_4
    return-object p2
.end method

.method public destroy()V
    .locals 3

    .line 1
    iget-object v0, p0, LVa/Za;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/Integer;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    sget-object v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/Z;->a:Ljava/util/LinkedHashMap;

    .line 12
    .line 13
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    :cond_0
    iget-object v0, p0, LVa/Za;->b:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lkotlin/jvm/internal/G;

    .line 23
    .line 24
    iget-object v1, v0, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/w;

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/p;->destroy()V

    .line 31
    .line 32
    .line 33
    :cond_1
    const/4 v1, 0x0

    .line 34
    iput-object v1, v0, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 35
    .line 36
    iget-object v0, p0, LVa/Za;->c:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Lkotlin/jvm/internal/G;

    .line 39
    .line 40
    iget-object v2, v0, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/t0;

    .line 43
    .line 44
    if-eqz v2, :cond_2

    .line 45
    .line 46
    invoke-virtual {v2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/t0;->destroy()V

    .line 47
    .line 48
    .line 49
    :cond_2
    iput-object v1, v0, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 50
    .line 51
    iget-object v0, p0, LVa/Za;->d:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Lkotlin/jvm/internal/G;

    .line 54
    .line 55
    iget-object v2, v0, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v2, LEf/E;

    .line 58
    .line 59
    if-eqz v2, :cond_3

    .line 60
    .line 61
    invoke-static {v2, v1}, LEf/H;->j(LEf/E;Ljava/util/concurrent/CancellationException;)V

    .line 62
    .line 63
    .line 64
    :cond_3
    iput-object v1, v0, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 65
    .line 66
    return-void
.end method

.method public e(Ljava/lang/Iterable;)Lc9/c;
    .locals 1

    .line 1
    iget-object v0, p0, LVa/Za;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lr9/A;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lr9/A;->y(Ljava/lang/Iterable;)Ljava/util/HashMap;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    new-instance v0, Ljava/util/HashSet;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1, v0}, LVa/Za;->h(Ljava/util/Map;Ljava/util/HashSet;)Lc9/c;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method

.method public f(Lp9/u;Ls9/b;LR1/i;)Lc9/c;
    .locals 7

    .line 1
    iget v0, p2, Ls9/b;->c:I

    .line 2
    .line 3
    iget-object v1, p0, LVa/Za;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lr9/b;

    .line 6
    .line 7
    iget-object v2, p1, Lp9/u;->f:Ls9/m;

    .line 8
    .line 9
    invoke-interface {v1, v2, v0}, Lr9/b;->h(Ls9/m;I)Ljava/util/HashMap;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object v2, p0, LVa/Za;->a:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, Lr9/A;

    .line 20
    .line 21
    invoke-interface {v2, p1, p2, v1, p3}, Lr9/A;->C(Lp9/u;Ls9/b;Ljava/util/Set;LR1/i;)Ljava/util/HashMap;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 26
    .line 27
    .line 28
    move-result-object p3

    .line 29
    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object p3

    .line 33
    :cond_0
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, Ljava/util/Map$Entry;

    .line 44
    .line 45
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {p2, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-nez v2, :cond_0

    .line 54
    .line 55
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    check-cast v2, Ls9/h;

    .line 60
    .line 61
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    check-cast v1, Ls9/h;

    .line 66
    .line 67
    invoke-static {v1}, Ls9/k;->g(Ls9/h;)Ls9/k;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {p2, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_1
    sget-object p3, Ls9/g;->a:Lc9/b;

    .line 76
    .line 77
    invoke-virtual {p2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    :cond_2
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    if-eqz v1, :cond_4

    .line 90
    .line 91
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    check-cast v1, Ljava/util/Map$Entry;

    .line 96
    .line 97
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    check-cast v2, Lt9/d;

    .line 106
    .line 107
    if-eqz v2, :cond_3

    .line 108
    .line 109
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    check-cast v3, Ls9/k;

    .line 114
    .line 115
    sget-object v4, Lt9/f;->b:Lt9/f;

    .line 116
    .line 117
    new-instance v5, Ls8/q;

    .line 118
    .line 119
    new-instance v6, Ljava/util/Date;

    .line 120
    .line 121
    invoke-direct {v6}, Ljava/util/Date;-><init>()V

    .line 122
    .line 123
    .line 124
    invoke-direct {v5, v6}, Ls8/q;-><init>(Ljava/util/Date;)V

    .line 125
    .line 126
    .line 127
    iget-object v2, v2, Lt9/d;->b:Lt9/h;

    .line 128
    .line 129
    invoke-virtual {v2, v3, v4, v5}, Lt9/h;->a(Ls9/k;Lt9/f;Ls8/q;)Lt9/f;

    .line 130
    .line 131
    .line 132
    :cond_3
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    check-cast v2, Ls9/k;

    .line 137
    .line 138
    invoke-virtual {p1, v2}, Lp9/u;->g(Ls9/k;)Z

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    if-eqz v2, :cond_2

    .line 143
    .line 144
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    check-cast v2, Ls9/h;

    .line 149
    .line 150
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    check-cast v1, Ls9/k;

    .line 155
    .line 156
    invoke-virtual {p3, v2, v1}, Lc9/c;->g(Ljava/lang/Object;Ljava/lang/Object;)Lc9/c;

    .line 157
    .line 158
    .line 159
    move-result-object p3

    .line 160
    goto :goto_1

    .line 161
    :cond_4
    return-object p3
.end method

.method public g(Lp9/u;Ls9/b;LR1/i;)Lc9/c;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Lp9/u;->e()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    iget-object v3, v1, Lp9/u;->f:Ls9/m;

    .line 10
    .line 11
    if-eqz v2, :cond_4

    .line 12
    .line 13
    sget-object v1, Ls9/g;->a:Lc9/b;

    .line 14
    .line 15
    new-instance v2, Ls9/h;

    .line 16
    .line 17
    invoke-direct {v2, v3}, Ls9/h;-><init>(Ls9/m;)V

    .line 18
    .line 19
    .line 20
    iget-object v3, v0, LVa/Za;->c:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v3, Lr9/b;

    .line 23
    .line 24
    invoke-interface {v3, v2}, Lr9/b;->e(Ls9/h;)Lt9/d;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    if-eqz v3, :cond_1

    .line 29
    .line 30
    iget-object v4, v3, Lt9/d;->b:Lt9/h;

    .line 31
    .line 32
    instance-of v4, v4, Lt9/l;

    .line 33
    .line 34
    if-eqz v4, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-static {v2}, Ls9/k;->g(Ls9/h;)Ls9/k;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    :goto_0
    iget-object v4, v0, LVa/Za;->a:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v4, Lr9/A;

    .line 45
    .line 46
    invoke-interface {v4, v2}, Lr9/A;->B(Ls9/h;)Ls9/k;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    :goto_1
    if-eqz v3, :cond_2

    .line 51
    .line 52
    sget-object v4, Lt9/f;->b:Lt9/f;

    .line 53
    .line 54
    new-instance v5, Ls8/q;

    .line 55
    .line 56
    new-instance v6, Ljava/util/Date;

    .line 57
    .line 58
    invoke-direct {v6}, Ljava/util/Date;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-direct {v5, v6}, Ls8/q;-><init>(Ljava/util/Date;)V

    .line 62
    .line 63
    .line 64
    iget-object v3, v3, Lt9/d;->b:Lt9/h;

    .line 65
    .line 66
    invoke-virtual {v3, v2, v4, v5}, Lt9/h;->a(Ls9/k;Lt9/f;Ls8/q;)Lt9/f;

    .line 67
    .line 68
    .line 69
    :cond_2
    invoke-virtual {v2}, Ls9/k;->d()Z

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-eqz v3, :cond_3

    .line 74
    .line 75
    iget-object v3, v2, Ls9/k;->a:Ls9/h;

    .line 76
    .line 77
    invoke-virtual {v1, v3, v2}, Lc9/b;->g(Ljava/lang/Object;Ljava/lang/Object;)Lc9/c;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    :cond_3
    return-object v1

    .line 82
    :cond_4
    iget-object v2, v1, Lp9/u;->g:Ljava/lang/String;

    .line 83
    .line 84
    if-eqz v2, :cond_7

    .line 85
    .line 86
    invoke-virtual {v3}, Ls9/e;->h()Z

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    const/4 v4, 0x0

    .line 91
    new-array v4, v4, [Ljava/lang/Object;

    .line 92
    .line 93
    const-string v5, "Currently we only support collection group queries at the root."

    .line 94
    .line 95
    invoke-static {v3, v5, v4}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    sget-object v3, Ls9/g;->a:Lc9/b;

    .line 99
    .line 100
    iget-object v4, v0, LVa/Za;->d:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v4, Lr9/f;

    .line 103
    .line 104
    invoke-interface {v4, v2}, Lr9/f;->t(Ljava/lang/String;)Ljava/util/List;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    :cond_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 113
    .line 114
    .line 115
    move-result v5

    .line 116
    if-eqz v5, :cond_6

    .line 117
    .line 118
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    check-cast v5, Ls9/m;

    .line 123
    .line 124
    invoke-virtual {v5, v2}, Ls9/e;->a(Ljava/lang/String;)Ls9/e;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    move-object v7, v5

    .line 129
    check-cast v7, Ls9/m;

    .line 130
    .line 131
    new-instance v6, Lp9/u;

    .line 132
    .line 133
    iget-wide v11, v1, Lp9/u;->h:J

    .line 134
    .line 135
    iget v13, v1, Lp9/u;->i:I

    .line 136
    .line 137
    const/4 v8, 0x0

    .line 138
    iget-object v9, v1, Lp9/u;->e:Ljava/util/List;

    .line 139
    .line 140
    iget-object v10, v1, Lp9/u;->a:Ljava/util/List;

    .line 141
    .line 142
    iget-object v14, v1, Lp9/u;->j:Lp9/c;

    .line 143
    .line 144
    iget-object v15, v1, Lp9/u;->k:Lp9/c;

    .line 145
    .line 146
    invoke-direct/range {v6 .. v15}, Lp9/u;-><init>(Ls9/m;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JILp9/c;Lp9/c;)V

    .line 147
    .line 148
    .line 149
    move-object/from16 v5, p2

    .line 150
    .line 151
    move-object/from16 v7, p3

    .line 152
    .line 153
    invoke-virtual {v0, v6, v5, v7}, LVa/Za;->f(Lp9/u;Ls9/b;LR1/i;)Lc9/c;

    .line 154
    .line 155
    .line 156
    move-result-object v6

    .line 157
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 158
    .line 159
    .line 160
    move-result-object v6

    .line 161
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 162
    .line 163
    .line 164
    move-result v8

    .line 165
    if-eqz v8, :cond_5

    .line 166
    .line 167
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v8

    .line 171
    check-cast v8, Ljava/util/Map$Entry;

    .line 172
    .line 173
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v9

    .line 177
    check-cast v9, Ls9/h;

    .line 178
    .line 179
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v8

    .line 183
    check-cast v8, Ls9/k;

    .line 184
    .line 185
    invoke-virtual {v3, v9, v8}, Lc9/c;->g(Ljava/lang/Object;Ljava/lang/Object;)Lc9/c;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    goto :goto_2

    .line 190
    :cond_6
    return-object v3

    .line 191
    :cond_7
    move-object/from16 v5, p2

    .line 192
    .line 193
    move-object/from16 v7, p3

    .line 194
    .line 195
    invoke-virtual/range {p0 .. p3}, LVa/Za;->f(Lp9/u;Ls9/b;LR1/i;)Lc9/c;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    return-object v1
.end method

.method public h(Ljava/util/Map;Ljava/util/HashSet;)Lc9/c;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {p0, v0, v1}, LVa/Za;->j(Ljava/util/Map;Ljava/util/Set;)V

    .line 11
    .line 12
    .line 13
    sget-object v1, Ls9/g;->a:Lc9/b;

    .line 14
    .line 15
    invoke-virtual {p0, p1, v0, p2}, LVa/Za;->d(Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;)Ljava/util/HashMap;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    if-eqz p2, :cond_0

    .line 32
    .line 33
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    check-cast p2, Ljava/util/Map$Entry;

    .line 38
    .line 39
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, Ls9/h;

    .line 44
    .line 45
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    check-cast p2, Lr9/x;

    .line 50
    .line 51
    iget-object p2, p2, Lr9/x;->a:Ls9/k;

    .line 52
    .line 53
    invoke-virtual {v1, v0, p2}, Lc9/c;->g(Ljava/lang/Object;Ljava/lang/Object;)Lc9/c;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    goto :goto_0

    .line 58
    :cond_0
    return-object v1
.end method

.method public i(ILf6/z;)Z
    .locals 8

    .line 1
    iget-object v0, p0, LVa/Za;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LE5/m0;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz p2, :cond_2

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    move v3, v2

    .line 10
    :goto_0
    iget-object v4, v0, LE5/m0;->c:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    if-ge v3, v4, :cond_1

    .line 17
    .line 18
    iget-object v4, v0, LE5/m0;->c:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    check-cast v4, Lf6/z;

    .line 25
    .line 26
    iget-wide v4, v4, Lf6/x;->d:J

    .line 27
    .line 28
    iget-wide v6, p2, Lf6/x;->d:J

    .line 29
    .line 30
    cmp-long v4, v4, v6

    .line 31
    .line 32
    if-nez v4, :cond_0

    .line 33
    .line 34
    iget-object v1, v0, LE5/m0;->b:Ljava/lang/Object;

    .line 35
    .line 36
    iget-object v3, p2, Lf6/x;->a:Ljava/lang/Object;

    .line 37
    .line 38
    invoke-static {v1, v3}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {p2, v1}, Lf6/z;->b(Ljava/lang/Object;)Lf6/z;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    goto :goto_1

    .line 47
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    :goto_1
    if-nez v1, :cond_2

    .line 51
    .line 52
    return v2

    .line 53
    :cond_2
    iget p2, v0, LE5/m0;->d:I

    .line 54
    .line 55
    add-int/2addr p1, p2

    .line 56
    iget-object p2, p0, LVa/Za;->b:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p2, LI5/f;

    .line 59
    .line 60
    iget v0, p2, LI5/f;->a:I

    .line 61
    .line 62
    iget-object v2, p0, LVa/Za;->d:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v2, LE5/n0;

    .line 65
    .line 66
    if-ne v0, p1, :cond_3

    .line 67
    .line 68
    iget-object p2, p2, LI5/f;->b:Lf6/z;

    .line 69
    .line 70
    invoke-static {p2, v1}, Lu6/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    if-nez p2, :cond_4

    .line 75
    .line 76
    :cond_3
    iget-object p2, v2, LE5/n0;->j:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast p2, LI5/f;

    .line 79
    .line 80
    new-instance v0, LI5/f;

    .line 81
    .line 82
    iget-object p2, p2, LI5/f;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 83
    .line 84
    invoke-direct {v0, p2, p1, v1}, LI5/f;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILf6/z;)V

    .line 85
    .line 86
    .line 87
    iput-object v0, p0, LVa/Za;->b:Ljava/lang/Object;

    .line 88
    .line 89
    :cond_4
    iget-object p2, p0, LVa/Za;->c:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast p2, LI5/f;

    .line 92
    .line 93
    iget v0, p2, LI5/f;->a:I

    .line 94
    .line 95
    if-ne v0, p1, :cond_5

    .line 96
    .line 97
    iget-object p2, p2, LI5/f;->b:Lf6/z;

    .line 98
    .line 99
    invoke-static {p2, v1}, Lu6/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result p2

    .line 103
    if-nez p2, :cond_6

    .line 104
    .line 105
    :cond_5
    iget-object p2, v2, LE5/n0;->k:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast p2, LI5/f;

    .line 108
    .line 109
    new-instance v0, LI5/f;

    .line 110
    .line 111
    iget-object p2, p2, LI5/f;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 112
    .line 113
    invoke-direct {v0, p2, p1, v1}, LI5/f;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILf6/z;)V

    .line 114
    .line 115
    .line 116
    iput-object v0, p0, LVa/Za;->c:Ljava/lang/Object;

    .line 117
    .line 118
    :cond_6
    const/4 p1, 0x1

    .line 119
    return p1
.end method

.method public j(Ljava/util/Map;Ljava/util/Set;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/TreeSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/TreeSet;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Ls9/h;

    .line 21
    .line 22
    invoke-interface {p1, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-nez v2, :cond_0

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    iget-object p2, p0, LVa/Za;->c:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p2, Lr9/b;

    .line 35
    .line 36
    invoke-interface {p2, v0}, Lr9/b;->d(Ljava/util/TreeSet;)Ljava/util/HashMap;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-interface {p1, p2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public k(Ljava/util/Map;)Ljava/util/HashMap;
    .locals 9

    .line 1
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, LVa/Za;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lr9/v;

    .line 8
    .line 9
    check-cast v0, Ljava/util/Set;

    .line 10
    .line 11
    invoke-interface {v1, v0}, Lr9/v;->g(Ljava/util/Set;)Ljava/util/ArrayList;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    new-instance v2, Ljava/util/TreeMap;

    .line 21
    .line 22
    invoke-direct {v2}, Ljava/util/TreeMap;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eqz v3, :cond_4

    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Lt9/i;

    .line 40
    .line 41
    invoke-virtual {v3}, Lt9/i;->b()Ljava/util/HashSet;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    if-eqz v5, :cond_0

    .line 54
    .line 55
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    check-cast v5, Ls9/h;

    .line 60
    .line 61
    invoke-interface {p1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    check-cast v6, Ls9/k;

    .line 66
    .line 67
    if-nez v6, :cond_1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    invoke-virtual {v1, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    if-eqz v7, :cond_2

    .line 75
    .line 76
    invoke-virtual {v1, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    check-cast v7, Lt9/f;

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_2
    sget-object v7, Lt9/f;->b:Lt9/f;

    .line 84
    .line 85
    :goto_1
    invoke-virtual {v3, v6, v7}, Lt9/i;->a(Ls9/k;Lt9/f;)Lt9/f;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    invoke-virtual {v1, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    iget v6, v3, Lt9/i;->a:I

    .line 93
    .line 94
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 95
    .line 96
    .line 97
    move-result-object v7

    .line 98
    invoke-virtual {v2, v7}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v7

    .line 102
    if-nez v7, :cond_3

    .line 103
    .line 104
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 105
    .line 106
    .line 107
    move-result-object v7

    .line 108
    new-instance v8, Ljava/util/HashSet;

    .line 109
    .line 110
    invoke-direct {v8}, Ljava/util/HashSet;-><init>()V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2, v7, v8}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    :cond_3
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    invoke-virtual {v2, v6}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v6

    .line 124
    check-cast v6, Ljava/util/Set;

    .line 125
    .line 126
    invoke-interface {v6, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_4
    new-instance v0, Ljava/util/HashSet;

    .line 131
    .line 132
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v2}, Ljava/util/TreeMap;->descendingMap()Ljava/util/NavigableMap;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    invoke-interface {v2}, Ljava/util/SortedMap;->entrySet()Ljava/util/Set;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 148
    .line 149
    .line 150
    move-result v3

    .line 151
    if-eqz v3, :cond_8

    .line 152
    .line 153
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    check-cast v3, Ljava/util/Map$Entry;

    .line 158
    .line 159
    new-instance v4, Ljava/util/HashMap;

    .line 160
    .line 161
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 162
    .line 163
    .line 164
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v5

    .line 168
    check-cast v5, Ljava/util/Set;

    .line 169
    .line 170
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 171
    .line 172
    .line 173
    move-result-object v5

    .line 174
    :cond_5
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 175
    .line 176
    .line 177
    move-result v6

    .line 178
    if-eqz v6, :cond_7

    .line 179
    .line 180
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v6

    .line 184
    check-cast v6, Ls9/h;

    .line 185
    .line 186
    invoke-virtual {v0, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v7

    .line 190
    if-nez v7, :cond_5

    .line 191
    .line 192
    invoke-interface {p1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v7

    .line 196
    check-cast v7, Ls9/k;

    .line 197
    .line 198
    invoke-virtual {v1, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v8

    .line 202
    check-cast v8, Lt9/f;

    .line 203
    .line 204
    invoke-static {v7, v8}, Lt9/h;->c(Ls9/k;Lt9/f;)Lt9/h;

    .line 205
    .line 206
    .line 207
    move-result-object v7

    .line 208
    if-eqz v7, :cond_6

    .line 209
    .line 210
    invoke-virtual {v4, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    :cond_6
    invoke-virtual {v0, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    goto :goto_3

    .line 217
    :cond_7
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v3

    .line 221
    check-cast v3, Ljava/lang/Integer;

    .line 222
    .line 223
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 224
    .line 225
    .line 226
    move-result v3

    .line 227
    iget-object v5, p0, LVa/Za;->c:Ljava/lang/Object;

    .line 228
    .line 229
    check-cast v5, Lr9/b;

    .line 230
    .line 231
    invoke-interface {v5, v3, v4}, Lr9/b;->g(ILjava/util/HashMap;)V

    .line 232
    .line 233
    .line 234
    goto :goto_2

    .line 235
    :cond_8
    return-object v1
.end method

.method public m(LVa/gb;)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, LVa/Za;->c:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, LVa/Za;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p1, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    invoke-static {}, LVa/Xa;->g()LVa/Xa;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iget-object v0, p0, LVa/Za;->d:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, LVa/Ya;

    .line 26
    .line 27
    new-instance v1, LVa/Ta;

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    invoke-direct {v1, p1, v0, v2}, LVa/Ta;-><init>(LVa/Xa;LVa/va;I)V

    .line 31
    .line 32
    .line 33
    invoke-static {v1}, LVa/Cb;->j(LVa/Ba;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    goto :goto_1

    .line 39
    :cond_0
    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    return-void

    .line 41
    :goto_1
    monitor-exit p0

    .line 42
    throw p1
.end method

.method public o(ILf6/z;Lf6/p;Lf6/u;Ljava/io/IOException;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LVa/Za;->i(ILf6/z;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, LVa/Za;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, LI5/f;

    .line 10
    .line 11
    invoke-virtual {p1, p3, p4, p5, p6}, LI5/f;->e(Lf6/p;Lf6/u;Ljava/io/IOException;Z)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public p(LVa/gb;)V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, LVa/Za;->c:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    invoke-static {}, LVa/Xa;->g()LVa/Xa;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, LVa/Za;->d:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, LVa/Ya;

    .line 17
    .line 18
    new-instance v2, LVa/Ta;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-direct {v2, v0, v1, v3}, LVa/Ta;-><init>(LVa/Xa;LVa/va;I)V

    .line 22
    .line 23
    .line 24
    invoke-static {v2}, LVa/Cb;->j(LVa/Ba;)V

    .line 25
    .line 26
    .line 27
    new-instance v0, LVa/y;

    .line 28
    .line 29
    const/16 v1, 0x14

    .line 30
    .line 31
    invoke-direct {v0, v1}, LVa/y;-><init>(I)V

    .line 32
    .line 33
    .line 34
    iput-object p0, v0, LVa/y;->e:Ljava/lang/Object;

    .line 35
    .line 36
    iput-object p1, v0, LVa/y;->d:Ljava/lang/Object;

    .line 37
    .line 38
    invoke-static {v0}, LVa/Cb;->g(LVa/Ba;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :catchall_0
    move-exception p1

    .line 43
    monitor-exit p0

    .line 44
    throw p1
.end method

.method public then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, LVa/Za;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/google/android/recaptcha/RecaptchaAction;

    .line 4
    .line 5
    iget-object v1, p0, LVa/Za;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lcom/google/firebase/auth/FirebaseAuth;

    .line 8
    .line 9
    iget-object v2, p0, LVa/Za;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Ljava/lang/String;

    .line 12
    .line 13
    iget-object v3, p0, LVa/Za;->d:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, LK8/b;

    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1

    .line 32
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadg;->zzd(Ljava/lang/Exception;)Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-eqz v4, :cond_3

    .line 44
    .line 45
    const-string p1, "RecaptchaCallWrapper"

    .line 46
    .line 47
    const/4 v4, 0x4

    .line 48
    invoke-static {p1, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-eqz p1, :cond_1

    .line 53
    .line 54
    const-string p1, "RecaptchaCallWrapper"

    .line 55
    .line 56
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    const-string v5, "Falling back to recaptcha enterprise flow for action "

    .line 61
    .line 62
    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    invoke-static {p1, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 67
    .line 68
    .line 69
    :cond_1
    invoke-virtual {v1}, Lcom/google/firebase/auth/FirebaseAuth;->n()LC6/l;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    if-nez p1, :cond_2

    .line 74
    .line 75
    new-instance p1, LC6/l;

    .line 76
    .line 77
    iget-object v4, v1, Lcom/google/firebase/auth/FirebaseAuth;->a:Ls8/g;

    .line 78
    .line 79
    invoke-direct {p1, v4, v1}, LC6/l;-><init>(Ls8/g;Lcom/google/firebase/auth/FirebaseAuth;)V

    .line 80
    .line 81
    .line 82
    monitor-enter v1

    .line 83
    :try_start_0
    iput-object p1, v1, Lcom/google/firebase/auth/FirebaseAuth;->l:LC6/l;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 84
    .line 85
    monitor-exit v1

    .line 86
    goto :goto_0

    .line 87
    :catchall_0
    move-exception p1

    .line 88
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 89
    throw p1

    .line 90
    :cond_2
    :goto_0
    invoke-virtual {v1}, Lcom/google/firebase/auth/FirebaseAuth;->n()LC6/l;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 95
    .line 96
    invoke-virtual {p1, v2, v1, v0}, LC6/l;->H(Ljava/lang/String;Ljava/lang/Boolean;Lcom/google/android/recaptcha/RecaptchaAction;)Lcom/google/android/gms/tasks/Task;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    new-instance v4, LW9/u;

    .line 101
    .line 102
    invoke-direct {v4, v2, p1, v0, v3}, LW9/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1, v3}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-virtual {p1, v4}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    return-object p1

    .line 114
    :cond_3
    const-string v1, "RecaptchaCallWrapper"

    .line 115
    .line 116
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    new-instance v3, Ljava/lang/StringBuilder;

    .line 125
    .line 126
    const-string v4, "Initial task failed for action "

    .line 127
    .line 128
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    const-string v0, "with exception - "

    .line 135
    .line 136
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 147
    .line 148
    .line 149
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    return-object p1
.end method
