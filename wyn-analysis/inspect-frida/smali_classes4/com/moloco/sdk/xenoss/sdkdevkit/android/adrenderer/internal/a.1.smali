.class public final synthetic Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/moloco/sdk/internal/publisher/i0;


# direct methods
.method public synthetic constructor <init>(Lcom/moloco/sdk/internal/publisher/i0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/a;->a:I

    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/a;->b:Lcom/moloco/sdk/internal/publisher/i0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/a;->b:Lcom/moloco/sdk/internal/publisher/i0;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/moloco/sdk/internal/publisher/i0;->a()V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    return-object v0

    .line 14
    :pswitch_0
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/a;->b:Lcom/moloco/sdk/internal/publisher/i0;

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/moloco/sdk/internal/publisher/i0;->a()V

    .line 17
    .line 18
    .line 19
    sget-object v0, Lef/C;->a:Lef/C;

    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_1
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/a;->b:Lcom/moloco/sdk/internal/publisher/i0;

    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/moloco/sdk/internal/publisher/i0;->b()V

    .line 25
    .line 26
    .line 27
    sget-object v0, Lef/C;->a:Lef/C;

    .line 28
    .line 29
    return-object v0

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
