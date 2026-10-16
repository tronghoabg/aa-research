.class public final LA7/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LU1/D;
.implements Lu6/j;


# instance fields
.field public final synthetic a:I

.field public b:Z

.field public c:J

.field public d:J

.field public final e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LA7/Z;Ljava/lang/String;J)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LA7/a0;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA7/a0;->f:Ljava/lang/Object;

    .line 2
    invoke-static {p2}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 3
    iput-object p2, p0, LA7/a0;->e:Ljava/lang/Object;

    .line 4
    iput-wide p3, p0, LA7/a0;->c:J

    return-void
.end method

.method public constructor <init>(LQ1/q;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LA7/a0;->a:I

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput-object p1, p0, LA7/a0;->e:Ljava/lang/Object;

    .line 10
    sget-object p1, LN1/F;->d:LN1/F;

    iput-object p1, p0, LA7/a0;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lu6/q;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LA7/a0;->a:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, LA7/a0;->e:Ljava/lang/Object;

    .line 7
    sget-object p1, LE5/r0;->d:LE5/r0;

    iput-object p1, p0, LA7/a0;->f:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(LE5/r0;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, LA7/a0;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LA7/a0;->g()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    invoke-virtual {p0, v0, v1}, LA7/a0;->b(J)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iput-object p1, p0, LA7/a0;->f:Ljava/lang/Object;

    .line 13
    .line 14
    return-void
.end method

.method public b(J)V
    .locals 1

    .line 1
    iget v0, p0, LA7/a0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iput-wide p1, p0, LA7/a0;->c:J

    .line 7
    .line 8
    iget-boolean p1, p0, LA7/a0;->b:Z

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    iget-object p1, p0, LA7/a0;->e:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p1, Lu6/q;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 20
    .line 21
    .line 22
    move-result-wide p1

    .line 23
    iput-wide p1, p0, LA7/a0;->d:J

    .line 24
    .line 25
    :cond_0
    return-void

    .line 26
    :pswitch_0
    iput-wide p1, p0, LA7/a0;->c:J

    .line 27
    .line 28
    iget-boolean p1, p0, LA7/a0;->b:Z

    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    iget-object p1, p0, LA7/a0;->e:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p1, LQ1/q;

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 40
    .line 41
    .line 42
    move-result-wide p1

    .line 43
    iput-wide p1, p0, LA7/a0;->d:J

    .line 44
    .line 45
    :cond_1
    return-void

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public c()V
    .locals 2

    .line 1
    iget v0, p0, LA7/a0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, LA7/a0;->b:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, LA7/a0;->e:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lu6/q;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    iput-wide v0, p0, LA7/a0;->d:J

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    iput-boolean v0, p0, LA7/a0;->b:Z

    .line 25
    .line 26
    :cond_0
    return-void

    .line 27
    :pswitch_0
    iget-boolean v0, p0, LA7/a0;->b:Z

    .line 28
    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    iget-object v0, p0, LA7/a0;->e:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, LQ1/q;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    iput-wide v0, p0, LA7/a0;->d:J

    .line 43
    .line 44
    const/4 v0, 0x1

    .line 45
    iput-boolean v0, p0, LA7/a0;->b:Z

    .line 46
    .line 47
    :cond_1
    return-void

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public d()J
    .locals 4

    .line 1
    iget-boolean v0, p0, LA7/a0;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, LA7/a0;->b:Z

    .line 7
    .line 8
    iget-object v0, p0, LA7/a0;->f:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, LA7/Z;

    .line 11
    .line 12
    invoke-virtual {v0}, LA7/Z;->l0()Landroid/content/SharedPreferences;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v1, p0, LA7/a0;->e:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Ljava/lang/String;

    .line 19
    .line 20
    iget-wide v2, p0, LA7/a0;->c:J

    .line 21
    .line 22
    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 23
    .line 24
    .line 25
    move-result-wide v0

    .line 26
    iput-wide v0, p0, LA7/a0;->d:J

    .line 27
    .line 28
    :cond_0
    iget-wide v0, p0, LA7/a0;->d:J

    .line 29
    .line 30
    return-wide v0
.end method

.method public e()LE5/r0;
    .locals 1

    .line 1
    iget-object v0, p0, LA7/a0;->f:Ljava/lang/Object;

    check-cast v0, LE5/r0;

    return-object v0
.end method

.method public e()LN1/F;
    .locals 1

    .line 2
    iget-object v0, p0, LA7/a0;->f:Ljava/lang/Object;

    check-cast v0, LN1/F;

    return-object v0
.end method

.method public f(J)V
    .locals 2

    .line 1
    iget-object v0, p0, LA7/a0;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LA7/Z;

    .line 4
    .line 5
    invoke-virtual {v0}, LA7/Z;->l0()Landroid/content/SharedPreferences;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, LA7/a0;->e:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Ljava/lang/String;

    .line 16
    .line 17
    invoke-interface {v0, v1, p1, p2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 18
    .line 19
    .line 20
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 21
    .line 22
    .line 23
    iput-wide p1, p0, LA7/a0;->d:J

    .line 24
    .line 25
    return-void
.end method

.method public g()J
    .locals 7

    .line 1
    iget v0, p0, LA7/a0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-wide v0, p0, LA7/a0;->c:J

    .line 7
    .line 8
    iget-boolean v2, p0, LA7/a0;->b:Z

    .line 9
    .line 10
    if-eqz v2, :cond_1

    .line 11
    .line 12
    iget-object v2, p0, LA7/a0;->e:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Lu6/q;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 20
    .line 21
    .line 22
    move-result-wide v2

    .line 23
    iget-wide v4, p0, LA7/a0;->d:J

    .line 24
    .line 25
    sub-long/2addr v2, v4

    .line 26
    iget-object v4, p0, LA7/a0;->f:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v4, LE5/r0;

    .line 29
    .line 30
    iget v5, v4, LE5/r0;->a:F

    .line 31
    .line 32
    const/high16 v6, 0x3f800000    # 1.0f

    .line 33
    .line 34
    cmpl-float v5, v5, v6

    .line 35
    .line 36
    if-nez v5, :cond_0

    .line 37
    .line 38
    invoke-static {v2, v3}, Lu6/v;->y(J)J

    .line 39
    .line 40
    .line 41
    move-result-wide v2

    .line 42
    :goto_0
    add-long/2addr v0, v2

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    iget v4, v4, LE5/r0;->c:I

    .line 45
    .line 46
    int-to-long v4, v4

    .line 47
    mul-long/2addr v2, v4

    .line 48
    goto :goto_0

    .line 49
    :cond_1
    :goto_1
    return-wide v0

    .line 50
    :pswitch_0
    iget-wide v0, p0, LA7/a0;->c:J

    .line 51
    .line 52
    iget-boolean v2, p0, LA7/a0;->b:Z

    .line 53
    .line 54
    if-eqz v2, :cond_3

    .line 55
    .line 56
    iget-object v2, p0, LA7/a0;->e:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v2, LQ1/q;

    .line 59
    .line 60
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 64
    .line 65
    .line 66
    move-result-wide v2

    .line 67
    iget-wide v4, p0, LA7/a0;->d:J

    .line 68
    .line 69
    sub-long/2addr v2, v4

    .line 70
    iget-object v4, p0, LA7/a0;->f:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v4, LN1/F;

    .line 73
    .line 74
    iget v5, v4, LN1/F;->a:F

    .line 75
    .line 76
    const/high16 v6, 0x3f800000    # 1.0f

    .line 77
    .line 78
    cmpl-float v5, v5, v6

    .line 79
    .line 80
    if-nez v5, :cond_2

    .line 81
    .line 82
    invoke-static {v2, v3}, LQ1/x;->K(J)J

    .line 83
    .line 84
    .line 85
    move-result-wide v2

    .line 86
    :goto_2
    add-long/2addr v0, v2

    .line 87
    goto :goto_3

    .line 88
    :cond_2
    iget v4, v4, LN1/F;->c:I

    .line 89
    .line 90
    int-to-long v4, v4

    .line 91
    mul-long/2addr v2, v4

    .line 92
    goto :goto_2

    .line 93
    :cond_3
    :goto_3
    return-wide v0

    .line 94
    nop

    .line 95
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic n()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    return v0
.end method

.method public q(LN1/F;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, LA7/a0;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LA7/a0;->g()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    invoke-virtual {p0, v0, v1}, LA7/a0;->b(J)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iput-object p1, p0, LA7/a0;->f:Ljava/lang/Object;

    .line 13
    .line 14
    return-void
.end method
