.class public final synthetic Lm9/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm9/L;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lp9/b;

.field public final synthetic c:Lp9/n;

.field public final synthetic d:Lp9/v;


# direct methods
.method public synthetic constructor <init>(Lp9/b;Lp9/n;Lp9/v;I)V
    .locals 0

    .line 1
    iput p4, p0, Lm9/l;->a:I

    iput-object p1, p0, Lm9/l;->b:Lp9/b;

    iput-object p2, p0, Lm9/l;->c:Lp9/n;

    iput-object p3, p0, Lm9/l;->d:Lp9/v;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final remove()V
    .locals 4

    .line 1
    iget v0, p0, Lm9/l;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm9/l;->b:Lp9/b;

    .line 7
    .line 8
    iget-object v1, p0, Lm9/l;->c:Lp9/n;

    .line 9
    .line 10
    iget-object v2, p0, Lm9/l;->d:Lp9/v;

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    iput-boolean v3, v0, Lp9/b;->c:Z

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    new-instance v0, Lp9/m;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-direct {v0, v1, v2, v3}, Lp9/m;-><init>(Lp9/n;Lp9/v;I)V

    .line 22
    .line 23
    .line 24
    iget-object v1, v1, Lp9/n;->d:Lw9/e;

    .line 25
    .line 26
    invoke-virtual {v1, v0}, Lw9/e;->a(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_0
    iget-object v0, p0, Lm9/l;->b:Lp9/b;

    .line 31
    .line 32
    iget-object v1, p0, Lm9/l;->c:Lp9/n;

    .line 33
    .line 34
    iget-object v2, p0, Lm9/l;->d:Lp9/v;

    .line 35
    .line 36
    const/4 v3, 0x1

    .line 37
    iput-boolean v3, v0, Lp9/b;->c:Z

    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    new-instance v0, Lp9/m;

    .line 43
    .line 44
    const/4 v3, 0x0

    .line 45
    invoke-direct {v0, v1, v2, v3}, Lp9/m;-><init>(Lp9/n;Lp9/v;I)V

    .line 46
    .line 47
    .line 48
    iget-object v1, v1, Lp9/n;->d:Lw9/e;

    .line 49
    .line 50
    invoke-virtual {v1, v0}, Lw9/e;->a(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
