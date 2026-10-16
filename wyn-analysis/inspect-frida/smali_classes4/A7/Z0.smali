.class public final LA7/Z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:J

.field public final synthetic c:LA7/P0;


# direct methods
.method public synthetic constructor <init>(LA7/P0;JI)V
    .locals 0

    .line 1
    iput p4, p0, LA7/Z0;->a:I

    iput-wide p2, p0, LA7/Z0;->b:J

    iput-object p1, p0, LA7/Z0;->c:LA7/P0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, LA7/Z0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iget-object v1, p0, LA7/Z0;->c:LA7/P0;

    .line 8
    .line 9
    iget-wide v2, p0, LA7/Z0;->b:J

    .line 10
    .line 11
    invoke-virtual {v1, v2, v3, v0}, LA7/P0;->l0(JZ)V

    .line 12
    .line 13
    .line 14
    iget-object v0, v1, LA7/B0;->a:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, LA7/n0;

    .line 17
    .line 18
    invoke-virtual {v0}, LA7/n0;->m()LA7/m1;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 23
    .line 24
    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, LA7/m1;->n0(Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_0
    iget-object v0, p0, LA7/Z0;->c:LA7/P0;

    .line 32
    .line 33
    invoke-virtual {v0}, LA7/B0;->a0()LA7/Z;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iget-object v1, v1, LA7/Z;->l:LA7/a0;

    .line 38
    .line 39
    iget-wide v2, p0, LA7/Z0;->b:J

    .line 40
    .line 41
    invoke-virtual {v1, v2, v3}, LA7/a0;->f(J)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, LA7/B0;->zzj()LA7/N;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    iget-object v0, v0, LA7/N;->m:LA7/P;

    .line 53
    .line 54
    const-string v2, "Session timeout duration set"

    .line 55
    .line 56
    invoke-virtual {v0, v2, v1}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
