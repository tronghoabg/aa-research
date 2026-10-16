.class public final Lf9/g;
.super Lcom/google/android/gms/common/api/internal/A;
.source "SourceFile"


# instance fields
.field public final d:Ljava/lang/String;

.field public final e:LO9/b;


# direct methods
.method public constructor <init>(LO9/b;Ljava/lang/String;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/16 v1, 0x3391

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {p0, v2, v0, v1}, Lcom/google/android/gms/common/api/internal/A;-><init>([Ld7/d;ZI)V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, Lf9/g;->d:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p1, p0, Lf9/g;->e:LO9/b;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final b(Lcom/google/android/gms/common/api/b;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 2

    .line 1
    check-cast p1, Lf9/c;

    .line 2
    .line 3
    new-instance v0, Lf9/f;

    .line 4
    .line 5
    iget-object v1, p0, Lf9/g;->e:LO9/b;

    .line 6
    .line 7
    invoke-direct {v0, v1, p2}, Lf9/f;-><init>(LO9/b;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 8
    .line 9
    .line 10
    iget-object p2, p0, Lf9/g;->d:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    :try_start_0
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/f;->getService()Landroid/os/IInterface;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Lf9/l;

    .line 20
    .line 21
    check-cast p1, Lf9/j;

    .line 22
    .line 23
    invoke-virtual {p1, v0, p2}, Lf9/j;->S(Lf9/f;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    .line 26
    :catch_0
    return-void
.end method
