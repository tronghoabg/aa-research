.class public final LC8/n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LC8/h;

.field public final b:Lza/a;

.field public volatile c:Z

.field public volatile d:I

.field public volatile e:J

.field public volatile f:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;LC8/f;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, LC8/h;

    .line 5
    .line 6
    invoke-static {p2}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, p2, p3, p4}, LC8/h;-><init>(LC8/f;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;)V

    .line 10
    .line 11
    .line 12
    new-instance p2, Lza/a;

    .line 13
    .line 14
    const/16 p3, 0xf

    .line 15
    .line 16
    invoke-direct {p2, p3}, Lza/a;-><init>(I)V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, LC8/n;->a:LC8/h;

    .line 23
    .line 24
    iput-object p2, p0, LC8/n;->b:Lza/a;

    .line 25
    .line 26
    const-wide/16 p3, -0x1

    .line 27
    .line 28
    iput-wide p3, p0, LC8/n;->e:J

    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, Landroid/app/Application;

    .line 35
    .line 36
    invoke-static {p1}, Lcom/google/android/gms/common/api/internal/d;->c(Landroid/app/Application;)V

    .line 37
    .line 38
    .line 39
    sget-object p1, Lcom/google/android/gms/common/api/internal/d;->e:Lcom/google/android/gms/common/api/internal/d;

    .line 40
    .line 41
    new-instance p3, LC8/m;

    .line 42
    .line 43
    invoke-direct {p3, p0, v0, p2}, LC8/m;-><init>(LC8/n;LC8/h;Lza/a;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, p3}, Lcom/google/android/gms/common/api/internal/d;->a(Lcom/google/android/gms/common/api/internal/c;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 5

    .line 1
    iget v0, p0, LC8/n;->d:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    if-lez p1, :cond_0

    .line 6
    .line 7
    iput p1, p0, LC8/n;->d:I

    .line 8
    .line 9
    invoke-virtual {p0}, LC8/n;->b()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, LC8/n;->a:LC8/h;

    .line 16
    .line 17
    iget-wide v1, p0, LC8/n;->e:J

    .line 18
    .line 19
    iget-object v3, p0, LC8/n;->b:Lza/a;

    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 25
    .line 26
    .line 27
    move-result-wide v3

    .line 28
    sub-long/2addr v1, v3

    .line 29
    invoke-virtual {v0, v1, v2}, LC8/h;->b(J)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iget v0, p0, LC8/n;->d:I

    .line 34
    .line 35
    if-lez v0, :cond_1

    .line 36
    .line 37
    if-nez p1, :cond_1

    .line 38
    .line 39
    iget-object v0, p0, LC8/n;->a:LC8/h;

    .line 40
    .line 41
    invoke-virtual {v0}, LC8/h;->a()V

    .line 42
    .line 43
    .line 44
    :cond_1
    :goto_0
    iput p1, p0, LC8/n;->d:I

    .line 45
    .line 46
    return-void
.end method

.method public final b()Z
    .locals 4

    .line 1
    iget-boolean v0, p0, LC8/n;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, LC8/n;->c:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget v0, p0, LC8/n;->d:I

    .line 10
    .line 11
    if-lez v0, :cond_0

    .line 12
    .line 13
    iget-wide v0, p0, LC8/n;->e:J

    .line 14
    .line 15
    const-wide/16 v2, -0x1

    .line 16
    .line 17
    cmp-long v0, v0, v2

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    return v0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    return v0
.end method
