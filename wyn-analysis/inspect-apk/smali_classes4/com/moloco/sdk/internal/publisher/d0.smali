.class public final synthetic Lcom/moloco/sdk/internal/publisher/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/moloco/sdk/internal/publisher/l0;


# direct methods
.method public synthetic constructor <init>(Lcom/moloco/sdk/internal/publisher/l0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/moloco/sdk/internal/publisher/d0;->a:I

    iput-object p1, p0, Lcom/moloco/sdk/internal/publisher/d0;->b:Lcom/moloco/sdk/internal/publisher/l0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lcom/moloco/sdk/internal/publisher/d0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/d0;->b:Lcom/moloco/sdk/internal/publisher/l0;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/moloco/sdk/internal/publisher/l0;->c()Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/l;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0

    .line 13
    :pswitch_0
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/d0;->b:Lcom/moloco/sdk/internal/publisher/l0;

    .line 14
    .line 15
    iget-object v0, v0, Lcom/moloco/sdk/internal/publisher/l0;->h:LC8/i;

    .line 16
    .line 17
    iget-object v0, v0, LC8/i;->d:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Lcom/moloco/sdk/internal/publisher/D;

    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_1
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/d0;->b:Lcom/moloco/sdk/internal/publisher/l0;

    .line 23
    .line 24
    iget-object v0, v0, Lcom/moloco/sdk/internal/publisher/l0;->h:LC8/i;

    .line 25
    .line 26
    iget-object v0, v0, LC8/i;->c:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Lcom/moloco/sdk/internal/ortb/model/d;

    .line 29
    .line 30
    return-object v0

    .line 31
    :pswitch_2
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/d0;->b:Lcom/moloco/sdk/internal/publisher/l0;

    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/moloco/sdk/internal/publisher/l0;->c()Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/l;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    return-object v0

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
