.class public final Lod/F;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:La2/c;


# direct methods
.method public synthetic constructor <init>(La2/c;I)V
    .locals 0

    .line 1
    iput p2, p0, Lod/F;->a:I

    iput-object p1, p0, Lod/F;->b:La2/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Lod/F;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lod/F;->b:La2/c;

    .line 7
    .line 8
    iget-object v0, v0, La2/c;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lod/M0;

    .line 11
    .line 12
    iget-object v1, v0, Lod/M0;->G:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const-string v2, "Channel must have been shut down"

    .line 19
    .line 20
    invoke-static {v2, v1}, LFe/e;->w(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    iput-boolean v1, v0, Lod/M0;->I:Z

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-virtual {v0, v1}, Lod/M0;->w(Z)V

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, Lod/M0;->p(Lod/M0;)V

    .line 31
    .line 32
    .line 33
    invoke-static {v0}, Lod/M0;->q(Lod/M0;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_0
    iget-object v0, p0, Lod/F;->b:La2/c;

    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    invoke-virtual {v0, v1}, La2/c;->O(Z)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :pswitch_1
    iget-object v0, p0, Lod/F;->b:La2/c;

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    invoke-virtual {v0, v1}, La2/c;->O(Z)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
