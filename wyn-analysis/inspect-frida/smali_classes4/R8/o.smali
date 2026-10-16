.class public final synthetic LR8/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LR8/s;

.field public final synthetic c:J

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(LR8/s;JLjava/lang/String;I)V
    .locals 0

    .line 1
    iput p5, p0, LR8/o;->a:I

    iput-object p1, p0, LR8/o;->b:LR8/s;

    iput-wide p2, p0, LR8/o;->c:J

    iput-object p4, p0, LR8/o;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget v0, p0, LR8/o;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v2, p0, LR8/o;->b:LR8/s;

    .line 7
    .line 8
    iget-object v0, v2, LR8/s;->p:LS8/f;

    .line 9
    .line 10
    iget-object v0, v0, LS8/f;->b:LS8/c;

    .line 11
    .line 12
    new-instance v1, LR8/o;

    .line 13
    .line 14
    iget-wide v3, p0, LR8/o;->c:J

    .line 15
    .line 16
    iget-object v5, p0, LR8/o;->d:Ljava/lang/String;

    .line 17
    .line 18
    const/4 v6, 0x0

    .line 19
    invoke-direct/range {v1 .. v6}, LR8/o;-><init>(LR8/s;JLjava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, LS8/c;->b(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_0
    iget-object v0, p0, LR8/o;->b:LR8/s;

    .line 27
    .line 28
    iget-object v0, v0, LR8/s;->h:LR8/m;

    .line 29
    .line 30
    iget-object v1, v0, LR8/m;->n:LR8/u;

    .line 31
    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    iget-object v1, v1, LR8/u;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    iget-object v0, v0, LR8/m;->i:LT8/e;

    .line 44
    .line 45
    iget-object v0, v0, LT8/e;->b:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, LT8/c;

    .line 48
    .line 49
    iget-wide v1, p0, LR8/o;->c:J

    .line 50
    .line 51
    iget-object v3, p0, LR8/o;->d:Ljava/lang/String;

    .line 52
    .line 53
    invoke-interface {v0, v1, v2, v3}, LT8/c;->e(JLjava/lang/String;)V

    .line 54
    .line 55
    .line 56
    :goto_0
    return-void

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
