.class public final synthetic LI8/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/SuccessContinuation;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LI8/b;


# direct methods
.method public synthetic constructor <init>(LI8/b;I)V
    .locals 0

    .line 1
    iput p2, p0, LI8/a;->a:I

    iput-object p1, p0, LI8/a;->b:LI8/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final then(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;
    .locals 3

    .line 1
    iget v0, p0, LI8/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, LC7/d;

    .line 7
    .line 8
    iget-object v0, p0, LI8/a;->b:LI8/b;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p1, LA7/B0;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p1, Lcom/google/android/gms/common/api/t;

    .line 19
    .line 20
    check-cast p1, LC7/e;

    .line 21
    .line 22
    invoke-interface {p1}, LC7/e;->getJwsResult()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    new-instance v1, LD6/c1;

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    invoke-direct {v1, p1, v2}, LD6/c1;-><init>(Ljava/lang/String;Z)V

    .line 33
    .line 34
    .line 35
    new-instance p1, LB8/c;

    .line 36
    .line 37
    const/4 v2, 0x3

    .line 38
    invoke-direct {p1, v2, v0, v1}, LB8/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object v1, v0, LI8/b;->d:Ljava/util/concurrent/Executor;

    .line 42
    .line 43
    invoke-static {v1, p1}, Lcom/google/android/gms/tasks/Tasks;->call(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    new-instance v1, LF5/d;

    .line 48
    .line 49
    const/16 v2, 0x9

    .line 50
    .line 51
    invoke-direct {v1, v2}, LF5/d;-><init>(I)V

    .line 52
    .line 53
    .line 54
    iget-object v0, v0, LI8/b;->c:Ljava/util/concurrent/Executor;

    .line 55
    .line 56
    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    return-object p1

    .line 61
    :pswitch_0
    check-cast p1, LC7/g;

    .line 62
    .line 63
    iget-object v0, p0, LI8/a;->b:LI8/b;

    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    const-string v1, ""

    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/l;->asGoogleApiClient()Lcom/google/android/gms/common/api/o;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    iget-object v0, v0, LI8/b;->f:Ljava/lang/String;

    .line 79
    .line 80
    invoke-static {p1, v1, v0}, Lcom/google/android/gms/internal/safetynet/zzae;->zza(Lcom/google/android/gms/common/api/o;[BLjava/lang/String;)Lcom/google/android/gms/common/api/r;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    new-instance v0, LC7/d;

    .line 85
    .line 86
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 87
    .line 88
    .line 89
    new-instance v1, Lcom/google/android/gms/common/internal/w;

    .line 90
    .line 91
    invoke-direct {v1, v0}, Lcom/google/android/gms/common/internal/w;-><init>(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    invoke-static {p1, v1}, Lcom/google/android/gms/common/internal/v;->o(Lcom/google/android/gms/common/api/r;Lcom/google/android/gms/common/internal/u;)Lcom/google/android/gms/tasks/Task;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    return-object p1

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
