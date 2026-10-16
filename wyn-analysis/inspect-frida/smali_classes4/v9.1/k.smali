.class public final Lv9/k;
.super Lmd/x;
.source "SourceFile"


# instance fields
.field public final synthetic a:[Lmd/f;

.field public final synthetic b:Lcom/google/android/gms/tasks/Task;

.field public final synthetic c:Lv9/m;


# direct methods
.method public constructor <init>(Lv9/m;[Lmd/f;Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv9/k;->c:Lv9/m;

    .line 5
    .line 6
    iput-object p2, p0, Lv9/k;->a:[Lmd/f;

    .line 7
    .line 8
    iput-object p3, p0, Lv9/k;->b:Lcom/google/android/gms/tasks/Task;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final b()V
    .locals 3

    .line 1
    iget-object v0, p0, Lv9/k;->a:[Lmd/f;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lv9/k;->c:Lv9/m;

    .line 9
    .line 10
    iget-object v0, v0, Lv9/m;->a:Lw9/e;

    .line 11
    .line 12
    iget-object v0, v0, Lw9/e;->a:Lw9/c;

    .line 13
    .line 14
    new-instance v1, Lm9/B;

    .line 15
    .line 16
    const/16 v2, 0x1a

    .line 17
    .line 18
    invoke-direct {v1, v2}, Lm9/B;-><init>(I)V

    .line 19
    .line 20
    .line 21
    iget-object v2, p0, Lv9/k;->b:Lcom/google/android/gms/tasks/Task;

    .line 22
    .line 23
    invoke-virtual {v2, v0, v1}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    invoke-super {p0}, Lmd/x;->b()V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final f()Lmd/f;
    .locals 5

    .line 1
    iget-object v0, p0, Lv9/k;->a:[Lmd/f;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v2, v0, v1

    .line 5
    .line 6
    if-eqz v2, :cond_0

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v2, v1

    .line 11
    :goto_0
    const-string v3, "ClientCall used before onOpen() callback"

    .line 12
    .line 13
    new-array v4, v1, [Ljava/lang/Object;

    .line 14
    .line 15
    invoke-static {v2, v3, v4}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    aget-object v0, v0, v1

    .line 19
    .line 20
    return-object v0
.end method
