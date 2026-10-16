.class public final LSe/d;
.super LHe/g;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LSe/d;->a:I

    iput-object p1, p0, LSe/d;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(LHe/h;)V
    .locals 3

    .line 1
    iget v0, p0, LSe/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, LSe/l;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p1, v1}, LSe/l;-><init>(Ljava/lang/Object;I)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, LSe/d;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p1, LHe/a;

    .line 15
    .line 16
    invoke-virtual {p1, v0}, LHe/a;->d(LHe/b;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    new-instance v0, LSe/c;

    .line 21
    .line 22
    invoke-direct {v0, p1}, LSe/c;-><init>(LHe/h;)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p1, v0}, LHe/h;->a(LJe/b;)V

    .line 26
    .line 27
    .line 28
    :try_start_0
    iget-object p1, p0, LSe/d;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p1, LA5/h;

    .line 31
    .line 32
    new-instance v1, LJ9/A;

    .line 33
    .line 34
    invoke-direct {v1, v0}, LJ9/A;-><init>(LSe/c;)V

    .line 35
    .line 36
    .line 37
    iget-object v2, p1, LA5/h;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v2, Lcom/google/android/gms/tasks/Task;

    .line 40
    .line 41
    iget-object p1, p1, LA5/h;->c:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, Ljava/util/concurrent/Executor;

    .line 44
    .line 45
    invoke-virtual {v2, p1, v1}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    .line 46
    .line 47
    .line 48
    new-instance v1, LJ9/A;

    .line 49
    .line 50
    invoke-direct {v1, v0}, LJ9/A;-><init>(LSe/c;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2, p1, v1}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :catchall_0
    move-exception p1

    .line 58
    invoke-static {p1}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, p1}, LSe/c;->onError(Ljava/lang/Throwable;)V

    .line 62
    .line 63
    .line 64
    :goto_0
    return-void

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
