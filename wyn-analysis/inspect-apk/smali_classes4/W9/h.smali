.class public final synthetic LW9/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/Continuation;
.implements Lt/a;
.implements Lr6/i;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ZLjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p2, p0, LW9/h;->b:Ljava/lang/Object;

    iput-object p3, p0, LW9/h;->c:Ljava/lang/Object;

    iput-boolean p1, p0, LW9/h;->a:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ILf6/Z;[I)Ll8/e0;
    .locals 9

    .line 1
    iget-object v0, p0, LW9/h;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lr6/l;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    new-instance v8, Ln2/d;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v8, v0, v1}, Ln2/d;-><init>(Ljava/lang/Object;I)V

    .line 12
    .line 13
    .line 14
    invoke-static {}, Ll8/K;->i()Ll8/H;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v1, 0x0

    .line 19
    move v4, v1

    .line 20
    :goto_0
    iget v1, p2, Lf6/Z;->a:I

    .line 21
    .line 22
    if-ge v4, v1, :cond_0

    .line 23
    .line 24
    new-instance v1, Lr6/c;

    .line 25
    .line 26
    aget v6, p3, v4

    .line 27
    .line 28
    iget-object v2, p0, LW9/h;->c:Ljava/lang/Object;

    .line 29
    .line 30
    move-object v5, v2

    .line 31
    check-cast v5, Lr6/f;

    .line 32
    .line 33
    iget-boolean v7, p0, LW9/h;->a:Z

    .line 34
    .line 35
    move v2, p1

    .line 36
    move-object v3, p2

    .line 37
    invoke-direct/range {v1 .. v8}, Lr6/c;-><init>(ILf6/Z;ILr6/f;IZLn2/d;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ll8/E;->a(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    add-int/lit8 v4, v4, 0x1

    .line 44
    .line 45
    move p1, v2

    .line 46
    move-object p2, v3

    .line 47
    goto :goto_0

    .line 48
    :cond_0
    invoke-virtual {v0}, Ll8/H;->g()Ll8/e0;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    return-object p1
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Lcom/applovin/impl/i5;

    iget-object v0, p0, LW9/h;->b:Ljava/lang/Object;

    check-cast v0, Lcom/applovin/impl/sdk/ad/b;

    iget-object v1, p0, LW9/h;->c:Ljava/lang/Object;

    check-cast v1, Landroid/view/MotionEvent;

    iget-boolean v2, p0, LW9/h;->a:Z

    invoke-static {v0, v1, v2, p1}, Lcom/applovin/impl/sdk/ad/b;->v(Lcom/applovin/impl/sdk/ad/b;Landroid/view/MotionEvent;ZLcom/applovin/impl/i5;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Ln7/c;->h()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/16 v1, 0x192

    .line 18
    .line 19
    if-eq v0, v1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object p1, p0, LW9/h;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p1, Landroid/content/Context;

    .line 25
    .line 26
    iget-object v0, p0, LW9/h;->c:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Landroid/content/Intent;

    .line 29
    .line 30
    iget-boolean v1, p0, LW9/h;->a:Z

    .line 31
    .line 32
    invoke-static {p1, v0, v1}, LW9/i;->a(Landroid/content/Context;Landroid/content/Intent;Z)Lcom/google/android/gms/tasks/Task;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    new-instance v0, Lcom/applovin/impl/T0;

    .line 37
    .line 38
    const/4 v1, 0x1

    .line 39
    invoke-direct {v0, v1}, Lcom/applovin/impl/T0;-><init>(I)V

    .line 40
    .line 41
    .line 42
    new-instance v1, LV1/c;

    .line 43
    .line 44
    const/4 v2, 0x7

    .line 45
    invoke-direct {v1, v2}, LV1/c;-><init>(I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/tasks/Task;->continueWith(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    :cond_1
    :goto_0
    return-object p1
.end method
