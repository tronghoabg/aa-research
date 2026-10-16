.class public final synthetic Lcom/moloco/sdk/internal/ilrd/provider/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/moloco/sdk/internal/ilrd/provider/g;


# direct methods
.method public synthetic constructor <init>(Lcom/moloco/sdk/internal/ilrd/provider/g;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/moloco/sdk/internal/ilrd/provider/e;->a:I

    iput-object p1, p0, Lcom/moloco/sdk/internal/ilrd/provider/e;->b:Lcom/moloco/sdk/internal/ilrd/provider/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lcom/moloco/sdk/internal/ilrd/provider/e;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/moloco/sdk/internal/ilrd/provider/e;->b:Lcom/moloco/sdk/internal/ilrd/provider/g;

    .line 7
    .line 8
    iget-object v0, v0, Lcom/moloco/sdk/internal/ilrd/provider/g;->f:LHf/j0;

    .line 9
    .line 10
    new-instance v1, LHf/d0;

    .line 11
    .line 12
    invoke-direct {v1, v0}, LHf/d0;-><init>(LHf/b0;)V

    .line 13
    .line 14
    .line 15
    return-object v1

    .line 16
    :pswitch_0
    iget-object v0, p0, Lcom/moloco/sdk/internal/ilrd/provider/e;->b:Lcom/moloco/sdk/internal/ilrd/provider/g;

    .line 17
    .line 18
    iget-object v0, v0, Lcom/moloco/sdk/internal/ilrd/provider/g;->e:LHf/x0;

    .line 19
    .line 20
    new-instance v1, LHf/e0;

    .line 21
    .line 22
    invoke-direct {v1, v0}, LHf/e0;-><init>(LHf/c0;)V

    .line 23
    .line 24
    .line 25
    return-object v1

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
