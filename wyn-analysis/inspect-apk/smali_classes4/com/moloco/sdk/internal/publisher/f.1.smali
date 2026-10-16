.class public final synthetic Lcom/moloco/sdk/internal/publisher/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/moloco/sdk/internal/publisher/g;


# direct methods
.method public synthetic constructor <init>(Lcom/moloco/sdk/internal/publisher/g;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/moloco/sdk/internal/publisher/f;->a:I

    iput-object p1, p0, Lcom/moloco/sdk/internal/publisher/f;->b:Lcom/moloco/sdk/internal/publisher/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lcom/moloco/sdk/internal/publisher/f;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/f;->b:Lcom/moloco/sdk/internal/publisher/g;

    .line 7
    .line 8
    iget-object v0, v0, Lcom/moloco/sdk/internal/publisher/g;->a:Lcom/moloco/sdk/internal/publisher/l0;

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/moloco/sdk/internal/publisher/l0;->c()Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/l;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    :pswitch_0
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/f;->b:Lcom/moloco/sdk/internal/publisher/g;

    .line 16
    .line 17
    iget-object v0, v0, Lcom/moloco/sdk/internal/publisher/g;->a:Lcom/moloco/sdk/internal/publisher/l0;

    .line 18
    .line 19
    iget-object v0, v0, Lcom/moloco/sdk/internal/publisher/l0;->h:LC8/i;

    .line 20
    .line 21
    iget-object v0, v0, LC8/i;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/o;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    invoke-interface {v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/o;->k()LHf/v0;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    check-cast v0, LHf/x0;

    .line 34
    .line 35
    invoke-virtual {v0}, LHf/x0;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Ljava/lang/Boolean;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 v0, 0x0

    .line 43
    :goto_0
    return-object v0

    .line 44
    :pswitch_1
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/f;->b:Lcom/moloco/sdk/internal/publisher/g;

    .line 45
    .line 46
    iget-object v0, v0, Lcom/moloco/sdk/internal/publisher/g;->a:Lcom/moloco/sdk/internal/publisher/l0;

    .line 47
    .line 48
    iget-object v0, v0, Lcom/moloco/sdk/internal/publisher/l0;->h:LC8/i;

    .line 49
    .line 50
    iget-object v0, v0, LC8/i;->c:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, Lcom/moloco/sdk/internal/ortb/model/d;

    .line 53
    .line 54
    return-object v0

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
