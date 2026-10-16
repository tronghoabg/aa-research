.class public final synthetic Lf6/J;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lf6/N;


# direct methods
.method public synthetic constructor <init>(Lf6/N;I)V
    .locals 0

    .line 1
    iput p2, p0, Lf6/J;->a:I

    iput-object p1, p0, Lf6/J;->b:Lf6/N;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Lf6/J;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iget-object v1, p0, Lf6/J;->b:Lf6/N;

    .line 8
    .line 9
    iput-boolean v0, v1, Lf6/N;->E:Z

    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    iget-object v0, p0, Lf6/J;->b:Lf6/N;

    .line 13
    .line 14
    iget-boolean v1, v0, Lf6/N;->K:Z

    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    iget-object v1, v0, Lf6/N;->p:Lf6/v;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-interface {v1, v0}, Lf6/v;->b(Lf6/W;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void

    .line 27
    :pswitch_1
    iget-object v0, p0, Lf6/J;->b:Lf6/N;

    .line 28
    .line 29
    invoke-virtual {v0}, Lf6/N;->u()V

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
