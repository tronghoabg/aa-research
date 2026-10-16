.class public final synthetic Lcom/moloco/sdk/internal/publisher/J;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/moloco/sdk/internal/publisher/V;


# direct methods
.method public synthetic constructor <init>(Lcom/moloco/sdk/internal/publisher/V;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/moloco/sdk/internal/publisher/J;->a:I

    iput-object p1, p0, Lcom/moloco/sdk/internal/publisher/J;->b:Lcom/moloco/sdk/internal/publisher/V;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lcom/moloco/sdk/internal/publisher/J;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/J;->b:Lcom/moloco/sdk/internal/publisher/V;

    .line 7
    .line 8
    iget-object v0, v0, Lcom/moloco/sdk/internal/publisher/V;->t:LR0/e;

    .line 9
    .line 10
    iget-object v0, v0, LR0/e;->d:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/e;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-interface {v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/m;->getCreativeType()Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/l;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    :goto_0
    return-object v0

    .line 23
    :pswitch_0
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/J;->b:Lcom/moloco/sdk/internal/publisher/V;

    .line 24
    .line 25
    iget-object v0, v0, Lcom/moloco/sdk/internal/publisher/V;->t:LR0/e;

    .line 26
    .line 27
    iget-object v0, v0, LR0/e;->f:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, Lcom/moloco/sdk/internal/publisher/D;

    .line 30
    .line 31
    return-object v0

    .line 32
    :pswitch_1
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/J;->b:Lcom/moloco/sdk/internal/publisher/V;

    .line 33
    .line 34
    iget-object v0, v0, Lcom/moloco/sdk/internal/publisher/V;->t:LR0/e;

    .line 35
    .line 36
    iget-object v0, v0, LR0/e;->e:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Lcom/moloco/sdk/internal/ortb/model/d;

    .line 39
    .line 40
    return-object v0

    .line 41
    :pswitch_2
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/J;->b:Lcom/moloco/sdk/internal/publisher/V;

    .line 42
    .line 43
    iget-object v0, v0, Lcom/moloco/sdk/internal/publisher/V;->t:LR0/e;

    .line 44
    .line 45
    iget-object v0, v0, LR0/e;->d:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/e;

    .line 48
    .line 49
    if-eqz v0, :cond_1

    .line 50
    .line 51
    invoke-interface {v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/m;->getCreativeType()Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/l;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    goto :goto_1

    .line 56
    :cond_1
    const/4 v0, 0x0

    .line 57
    :goto_1
    return-object v0

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
