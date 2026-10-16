.class public final Lcom/google/android/gms/common/internal/D;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/q;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/common/api/r;

.field public final synthetic b:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field public final synthetic c:Lcom/google/android/gms/common/internal/u;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/r;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/android/gms/common/internal/u;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/common/internal/D;->a:Lcom/google/android/gms/common/api/r;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/common/internal/D;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/android/gms/common/internal/D;->c:Lcom/google/android/gms/common/internal/u;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/common/api/Status;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->V()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lcom/google/android/gms/common/internal/D;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 10
    .line 11
    iget-object v0, p0, Lcom/google/android/gms/common/internal/D;->a:Lcom/google/android/gms/common/api/r;

    .line 12
    .line 13
    const-wide/16 v2, 0x0

    .line 14
    .line 15
    invoke-virtual {v0, v2, v3, p1}, Lcom/google/android/gms/common/api/r;->await(JLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/common/api/t;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget-object v0, p0, Lcom/google/android/gms/common/internal/D;->c:Lcom/google/android/gms/common/internal/u;

    .line 20
    .line 21
    invoke-interface {v0, p1}, Lcom/google/android/gms/common/internal/u;->a(Lcom/google/android/gms/common/api/t;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {v1, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->n(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/j;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {v1, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method
