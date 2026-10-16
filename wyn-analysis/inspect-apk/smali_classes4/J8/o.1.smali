.class public abstract LJ8/o;
.super Lf7/a;
.source "SourceFile"

# interfaces
.implements LJ8/E;


# virtual methods
.method public abstract V()Ljava/lang/String;
.end method

.method public abstract W()Z
.end method

.method public final X()Lcom/google/android/gms/tasks/Task;
    .locals 3

    .line 1
    move-object v0, p0

    .line 2
    check-cast v0, LK8/e;

    .line 3
    .line 4
    iget-object v0, v0, LK8/e;->c:Ljava/lang/String;

    .line 5
    .line 6
    invoke-static {v0}, Ls8/g;->f(Ljava/lang/String;)Ls8/g;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Ls8/g;)Lcom/google/firebase/auth/FirebaseAuth;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    new-instance v1, LJ8/h;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-direct {v1, v0, v2}, LJ8/h;-><init>(Lcom/google/firebase/auth/FirebaseAuth;I)V

    .line 21
    .line 22
    .line 23
    iget-object v2, v0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/zzabj;

    .line 24
    .line 25
    iget-object v0, v0, Lcom/google/firebase/auth/FirebaseAuth;->a:Ls8/g;

    .line 26
    .line 27
    invoke-virtual {v2, v0, p0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzabj;->zza(Ls8/g;LJ8/o;LK8/E;)Lcom/google/android/gms/tasks/Task;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    return-object v0
.end method

.method public abstract Y(Ljava/util/ArrayList;)LK8/e;
.end method

.method public abstract Z(Ljava/util/ArrayList;)V
.end method
