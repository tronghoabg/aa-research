.class public final synthetic LX1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LX1/f;


# direct methods
.method public synthetic constructor <init>(LX1/f;I)V
    .locals 0

    .line 1
    iput p2, p0, LX1/c;->a:I

    iput-object p1, p0, LX1/c;->b:LX1/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, LX1/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iget-object v1, p0, LX1/c;->b:LX1/f;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, LX1/f;->y(Z)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    iget-object v0, p0, LX1/c;->b:LX1/f;

    .line 14
    .line 15
    invoke-virtual {v0}, LX1/f;->z()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
