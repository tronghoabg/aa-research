.class public final Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LHf/m;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LY2/B;


# direct methods
.method public synthetic constructor <init>(LY2/B;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s;->a:I

    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s;->b:LY2/B;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s;->a:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lef/C;

    .line 7
    .line 8
    iget-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s;->b:LY2/B;

    .line 9
    .line 10
    invoke-virtual {p1}, LY2/B;->a()V

    .line 11
    .line 12
    .line 13
    sget-object p1, Lef/C;->a:Lef/C;

    .line 14
    .line 15
    return-object p1

    .line 16
    :pswitch_0
    check-cast p1, Lef/C;

    .line 17
    .line 18
    iget-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s;->b:LY2/B;

    .line 19
    .line 20
    invoke-virtual {p1}, LY2/B;->a()V

    .line 21
    .line 22
    .line 23
    sget-object p1, Lef/C;->a:Lef/C;

    .line 24
    .line 25
    return-object p1

    .line 26
    :pswitch_1
    check-cast p1, Lef/C;

    .line 27
    .line 28
    iget-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/s;->b:LY2/B;

    .line 29
    .line 30
    invoke-virtual {p1}, LY2/B;->b()V

    .line 31
    .line 32
    .line 33
    sget-object p1, Lef/C;->a:Lef/C;

    .line 34
    .line 35
    return-object p1

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
