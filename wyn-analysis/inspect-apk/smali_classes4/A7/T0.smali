.class public final synthetic LA7/T0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public synthetic b:J

.field public synthetic c:Ljava/lang/Object;

.field public synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, LA7/T0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(LA7/i1;LA7/j1;J)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LA7/T0;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LA7/T0;->c:Ljava/lang/Object;

    iput-wide p3, p0, LA7/T0;->b:J

    iput-object p1, p0, LA7/T0;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, LA7/T0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA7/T0;->d:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LA7/i1;

    .line 9
    .line 10
    iget-object v1, p0, LA7/T0;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, LA7/j1;

    .line 13
    .line 14
    iget-wide v2, p0, LA7/T0;->b:J

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    invoke-virtual {v0, v1, v4, v2, v3}, LA7/i1;->n0(LA7/j1;ZJ)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    iput-object v1, v0, LA7/i1;->e:LA7/j1;

    .line 22
    .line 23
    iget-object v0, v0, LA7/B0;->a:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, LA7/n0;

    .line 26
    .line 27
    invoke-static {v0}, LA7/p0;->h(LA7/n0;)LA7/m1;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    new-instance v2, LA7/p;

    .line 32
    .line 33
    const/16 v3, 0xa

    .line 34
    .line 35
    invoke-direct {v2, v3, v0, v1}, LA7/p;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v2}, LA7/m1;->m0(Ljava/lang/Runnable;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :pswitch_0
    iget-object v0, p0, LA7/T0;->c:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, LA7/P0;

    .line 45
    .line 46
    iget-object v1, v0, LA7/B0;->a:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v1, LA7/n0;

    .line 49
    .line 50
    invoke-virtual {v1}, LA7/n0;->j()LA7/I;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v1}, LA7/I;->l0()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_0

    .line 63
    .line 64
    const/4 v1, 0x0

    .line 65
    iget-object v2, p0, LA7/T0;->d:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v2, Landroid/os/Bundle;

    .line 68
    .line 69
    iget-wide v3, p0, LA7/T0;->b:J

    .line 70
    .line 71
    invoke-virtual {v0, v2, v1, v3, v4}, LA7/P0;->r0(Landroid/os/Bundle;IJ)V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_0
    invoke-virtual {v0}, LA7/B0;->zzj()LA7/N;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    const-string v1, "Using developer consent only; google app id found"

    .line 80
    .line 81
    iget-object v0, v0, LA7/N;->k:LA7/P;

    .line 82
    .line 83
    invoke-virtual {v0, v1}, LA7/P;->c(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    :goto_0
    return-void

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
