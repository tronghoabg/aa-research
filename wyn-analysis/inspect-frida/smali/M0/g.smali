.class public final synthetic LM0/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ltf/a;


# direct methods
.method public synthetic constructor <init>(Ltf/a;I)V
    .locals 0

    .line 1
    iput p2, p0, LM0/g;->a:I

    iput-object p1, p0, LM0/g;->b:Ltf/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, LM0/g;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "$tmp0"

    .line 7
    .line 8
    iget-object v1, p0, LM0/g;->b:Ltf/a;

    .line 9
    .line 10
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v1}, Ltf/a;->invoke()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    iget-object v0, p0, LM0/g;->b:Ltf/a;

    .line 18
    .line 19
    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/QonversionInternal;->a(Ltf/a;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_1
    iget-object v0, p0, LM0/g;->b:Ltf/a;

    .line 24
    .line 25
    invoke-static {v0}, Lcom/vungle/ads/internal/util/y;->b(Ltf/a;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_2
    const-string v0, "$tmp0"

    .line 30
    .line 31
    iget-object v1, p0, LM0/g;->b:Ltf/a;

    .line 32
    .line 33
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-interface {v1}, Ltf/a;->invoke()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
