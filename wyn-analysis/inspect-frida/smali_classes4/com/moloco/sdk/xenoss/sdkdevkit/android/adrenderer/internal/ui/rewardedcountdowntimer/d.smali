.class public final synthetic Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/rewardedcountdowntimer/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LN/V;


# direct methods
.method public synthetic constructor <init>(LN/V;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/rewardedcountdowntimer/d;->a:I

    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/rewardedcountdowntimer/d;->b:LN/V;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/rewardedcountdowntimer/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Boolean;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/z;

    .line 12
    .line 13
    invoke-direct {v0, p1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/z;-><init>(Ljava/lang/Comparable;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/rewardedcountdowntimer/d;->b:LN/V;

    .line 17
    .line 18
    invoke-interface {p1, v0}, LN/V;->setValue(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    sget-object p1, Lef/C;->a:Lef/C;

    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_0
    check-cast p1, LL0/h;

    .line 25
    .line 26
    iget-wide v0, p1, LL0/h;->a:J

    .line 27
    .line 28
    new-instance p1, LL0/h;

    .line 29
    .line 30
    invoke-direct {p1, v0, v1}, LL0/h;-><init>(J)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/rewardedcountdowntimer/d;->b:LN/V;

    .line 34
    .line 35
    invoke-interface {v0, p1}, LN/V;->setValue(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    sget-object p1, Lef/C;->a:Lef/C;

    .line 39
    .line 40
    return-object p1

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
