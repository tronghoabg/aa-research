.class public final synthetic Lk2/S;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lk2/X;


# direct methods
.method public synthetic constructor <init>(Lk2/X;I)V
    .locals 0

    .line 1
    iput p2, p0, Lk2/S;->a:I

    iput-object p1, p0, Lk2/S;->b:Lk2/X;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Lk2/S;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iget-object v1, p0, Lk2/S;->b:Lk2/X;

    .line 8
    .line 9
    iput-boolean v0, v1, Lk2/X;->I:Z

    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    iget-object v0, p0, Lk2/S;->b:Lk2/X;

    .line 13
    .line 14
    iget-boolean v1, v0, Lk2/X;->O:Z

    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    iget-object v1, v0, Lk2/X;->r:Lk2/E;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-interface {v1, v0}, Lk2/e0;->a(Lk2/f0;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void

    .line 27
    :pswitch_1
    iget-object v0, p0, Lk2/S;->b:Lk2/X;

    .line 28
    .line 29
    invoke-virtual {v0}, Lk2/X;->v()V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
