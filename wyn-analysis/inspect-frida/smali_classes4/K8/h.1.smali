.class public final LK8/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LK8/e;


# direct methods
.method public constructor <init>(LK8/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LK8/h;->a:LK8/e;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(LJ8/s;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;
    .locals 7

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object v3, p0, LK8/h;->a:LK8/e;

    .line 5
    .line 6
    iget-object v0, v3, LK8/e;->c:Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {v0}, Ls8/g;->f(Ljava/lang/String;)Ls8/g;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Ls8/g;)Lcom/google/firebase/auth/FirebaseAuth;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    instance-of v1, p1, LJ8/y;

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    move-object v2, p1

    .line 24
    check-cast v2, LJ8/y;

    .line 25
    .line 26
    new-instance v5, LJ8/g;

    .line 27
    .line 28
    invoke-direct {v5, v0}, LJ8/g;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    .line 29
    .line 30
    .line 31
    move-object v1, v0

    .line 32
    iget-object v0, v1, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/zzabj;

    .line 33
    .line 34
    iget-object v1, v1, Lcom/google/firebase/auth/FirebaseAuth;->a:Ls8/g;

    .line 35
    .line 36
    move-object v4, p2

    .line 37
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/zzabj;->zza(Ls8/g;LJ8/y;LJ8/o;Ljava/lang/String;LK8/J;)Lcom/google/android/gms/tasks/Task;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    return-object p1

    .line 42
    :cond_0
    move-object v4, p2

    .line 43
    move-object v1, v0

    .line 44
    instance-of p2, p1, LJ8/B;

    .line 45
    .line 46
    if-eqz p2, :cond_1

    .line 47
    .line 48
    move-object v2, p1

    .line 49
    check-cast v2, LJ8/B;

    .line 50
    .line 51
    iget-object v5, v1, Lcom/google/firebase/auth/FirebaseAuth;->k:Ljava/lang/String;

    .line 52
    .line 53
    new-instance v6, LJ8/g;

    .line 54
    .line 55
    invoke-direct {v6, v1}, LJ8/g;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    .line 56
    .line 57
    .line 58
    iget-object v0, v1, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/zzabj;

    .line 59
    .line 60
    iget-object v1, v1, Lcom/google/firebase/auth/FirebaseAuth;->a:Ls8/g;

    .line 61
    .line 62
    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzabj;->zza(Ls8/g;LJ8/B;LJ8/o;Ljava/lang/String;Ljava/lang/String;LK8/J;)Lcom/google/android/gms/tasks/Task;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    return-object p1

    .line 67
    :cond_1
    new-instance p1, Lcom/google/android/gms/common/api/Status;

    .line 68
    .line 69
    const/4 p2, 0x0

    .line 70
    const/16 v0, 0x445b

    .line 71
    .line 72
    invoke-direct {p1, v0, p2, p2, p2}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Ld7/b;)V

    .line 73
    .line 74
    .line 75
    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadg;->zza(Lcom/google/android/gms/common/api/Status;)Ls8/j;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    return-object p1
.end method
