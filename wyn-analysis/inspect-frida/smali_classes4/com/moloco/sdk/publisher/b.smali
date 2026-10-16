.class public final synthetic Lcom/moloco/sdk/publisher/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/widget/FrameLayout;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/FrameLayout;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/moloco/sdk/publisher/b;->a:I

    iput-object p1, p0, Lcom/moloco/sdk/publisher/b;->b:Landroid/widget/FrameLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lcom/moloco/sdk/publisher/b;->a:I

    check-cast p1, Lcom/moloco/sdk/publisher/Banner;

    check-cast p2, Lcom/moloco/sdk/publisher/MolocoAdError$AdCreateError;

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/moloco/sdk/publisher/b;->b:Landroid/widget/FrameLayout;

    invoke-static {v0, p1, p2}, Lcom/moloco/sdk/publisher/MolocoSamplesKt;->a(Landroid/widget/FrameLayout;Lcom/moloco/sdk/publisher/Banner;Lcom/moloco/sdk/publisher/MolocoAdError$AdCreateError;)Lef/C;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lcom/moloco/sdk/publisher/b;->b:Landroid/widget/FrameLayout;

    invoke-static {v0, p1, p2}, Lcom/moloco/sdk/publisher/MolocoSamplesKt;->b(Landroid/widget/FrameLayout;Lcom/moloco/sdk/publisher/Banner;Lcom/moloco/sdk/publisher/MolocoAdError$AdCreateError;)Lef/C;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lcom/moloco/sdk/publisher/b;->b:Landroid/widget/FrameLayout;

    invoke-static {v0, p1, p2}, Lcom/moloco/sdk/publisher/MolocoSamplesKt;->d(Landroid/widget/FrameLayout;Lcom/moloco/sdk/publisher/Banner;Lcom/moloco/sdk/publisher/MolocoAdError$AdCreateError;)Lef/C;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
