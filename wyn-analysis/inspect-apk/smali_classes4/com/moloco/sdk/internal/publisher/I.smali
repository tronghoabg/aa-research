.class public final synthetic Lcom/moloco/sdk/internal/publisher/I;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/moloco/sdk/internal/publisher/V;


# direct methods
.method public synthetic constructor <init>(Lcom/moloco/sdk/internal/publisher/V;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/moloco/sdk/internal/publisher/I;->a:I

    iput-object p1, p0, Lcom/moloco/sdk/internal/publisher/I;->b:Lcom/moloco/sdk/internal/publisher/V;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lcom/moloco/sdk/internal/publisher/I;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/d;

    .line 7
    .line 8
    const-string v0, "button"

    .line 9
    .line 10
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/I;->b:Lcom/moloco/sdk/internal/publisher/V;

    .line 14
    .line 15
    iget-object v0, v0, Lcom/moloco/sdk/internal/publisher/V;->u:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/s;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/s;->a(Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/d;)V

    .line 18
    .line 19
    .line 20
    sget-object p1, Lef/C;->a:Lef/C;

    .line 21
    .line 22
    return-object p1

    .line 23
    :pswitch_0
    check-cast p1, Ljava/lang/Long;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lcom/moloco/sdk/internal/publisher/I;->b:Lcom/moloco/sdk/internal/publisher/V;

    .line 29
    .line 30
    iget-object p1, p1, Lcom/moloco/sdk/internal/publisher/V;->i:LW1/r;

    .line 31
    .line 32
    invoke-virtual {p1}, LW1/r;->a()J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    new-instance p1, LCf/a;

    .line 37
    .line 38
    invoke-direct {p1, v0, v1}, LCf/a;-><init>(J)V

    .line 39
    .line 40
    .line 41
    return-object p1

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
