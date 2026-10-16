.class public final synthetic Lw8/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll9/b;


# virtual methods
.method public final a(Ll9/a;)V
    .locals 2

    .line 1
    iget-object p1, p1, Ll9/a;->a:Ls8/b;

    .line 2
    .line 3
    iget-boolean p1, p1, Ls8/b;->b:Z

    .line 4
    .line 5
    const-class v0, Lw8/e;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lw8/e;->c:Lw8/e;

    .line 9
    .line 10
    invoke-static {v1}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, v1, Lw8/e;->a:Lz7/a;

    .line 14
    .line 15
    iget-object v1, v1, Lz7/a;->a:Lcom/google/android/gms/internal/measurement/zzdy;

    .line 16
    .line 17
    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/measurement/zzdy;->zza(Z)V

    .line 18
    .line 19
    .line 20
    monitor-exit v0

    .line 21
    return-void

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    throw p1
.end method
