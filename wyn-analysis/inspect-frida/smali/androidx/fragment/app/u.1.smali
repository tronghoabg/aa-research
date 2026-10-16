.class public final synthetic Landroidx/fragment/app/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/fragment/app/u;->a:I

    iput-object p1, p0, Landroidx/fragment/app/u;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Landroidx/fragment/app/u;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/fragment/app/u;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    const/4 v1, 0x4

    .line 11
    invoke-static {v0, v1}, Landroidx/fragment/app/o0;->a(Ljava/util/ArrayList;I)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    iget-object v0, p0, Landroidx/fragment/app/u;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Landroidx/fragment/app/F;

    .line 18
    .line 19
    iget-object v1, v0, Landroidx/fragment/app/F;->mViewLifecycleOwner:Landroidx/fragment/app/w0;

    .line 20
    .line 21
    iget-object v2, v0, Landroidx/fragment/app/F;->mSavedViewRegistryState:Landroid/os/Bundle;

    .line 22
    .line 23
    iget-object v1, v1, Landroidx/fragment/app/w0;->e:Ln3/e;

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ln3/e;->b(Landroid/os/Bundle;)V

    .line 26
    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    iput-object v1, v0, Landroidx/fragment/app/F;->mSavedViewRegistryState:Landroid/os/Bundle;

    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
