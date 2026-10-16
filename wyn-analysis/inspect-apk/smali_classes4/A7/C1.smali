.class public final LA7/C1;
.super LA7/n;
.source "SourceFile"


# instance fields
.field public final synthetic e:I

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;LA7/C0;I)V
    .locals 0

    .line 1
    iput p3, p0, LA7/C1;->e:I

    iput-object p1, p0, LA7/C1;->f:Ljava/lang/Object;

    invoke-direct {p0, p2}, LA7/n;-><init>(LA7/C0;)V

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 5

    .line 1
    iget v0, p0, LA7/C1;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA7/C1;->f:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LA7/F1;

    .line 9
    .line 10
    invoke-virtual {v0}, LA7/F1;->k0()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, LA7/B0;->zzj()LA7/N;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const-string v2, "Starting upload from DelayedRunnable"

    .line 18
    .line 19
    iget-object v1, v1, LA7/N;->n:LA7/P;

    .line 20
    .line 21
    invoke-virtual {v1, v2}, LA7/P;->c(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, v0, LA7/H1;->b:LA7/L1;

    .line 25
    .line 26
    invoke-virtual {v0}, LA7/L1;->b0()V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_0
    iget-object v0, p0, LA7/C1;->f:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, LA7/B1;

    .line 33
    .line 34
    iget-object v1, v0, LA7/B1;->e:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v1, LA7/x1;

    .line 37
    .line 38
    invoke-virtual {v1}, LA7/B;->c0()V

    .line 39
    .line 40
    .line 41
    iget-object v1, v0, LA7/B1;->e:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v1, LA7/x1;

    .line 44
    .line 45
    iget-object v2, v1, LA7/B0;->a:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v2, LA7/n0;

    .line 48
    .line 49
    iget-object v2, v2, LA7/n0;->n:Ln7/b;

    .line 50
    .line 51
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 55
    .line 56
    .line 57
    move-result-wide v2

    .line 58
    const/4 v4, 0x0

    .line 59
    invoke-virtual {v0, v2, v3, v4, v4}, LA7/B1;->c(JZZ)Z

    .line 60
    .line 61
    .line 62
    iget-object v0, v1, LA7/B0;->a:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, LA7/n0;

    .line 65
    .line 66
    invoke-virtual {v0}, LA7/n0;->h()LA7/r;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    iget-object v0, v0, LA7/n0;->n:Ln7/b;

    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 76
    .line 77
    .line 78
    move-result-wide v2

    .line 79
    invoke-virtual {v1, v2, v3}, LA7/r;->h0(J)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
