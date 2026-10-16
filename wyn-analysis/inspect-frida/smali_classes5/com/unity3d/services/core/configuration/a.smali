.class public final synthetic Lcom/unity3d/services/core/configuration/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/unity3d/ads/core/domain/HttpClientProvider;


# direct methods
.method public synthetic constructor <init>(Lcom/unity3d/ads/core/domain/HttpClientProvider;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/unity3d/services/core/configuration/a;->a:I

    iput-object p1, p0, Lcom/unity3d/services/core/configuration/a;->b:Lcom/unity3d/ads/core/domain/HttpClientProvider;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lcom/unity3d/services/core/configuration/a;->a:I

    check-cast p1, LEf/E;

    check-cast p2, Ljf/c;

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/unity3d/services/core/configuration/a;->b:Lcom/unity3d/ads/core/domain/HttpClientProvider;

    invoke-static {v0, p1, p2}, Lcom/unity3d/services/core/configuration/InitializeThread$InitializeStateLoadWeb;->a(Lcom/unity3d/ads/core/domain/HttpClientProvider;LEf/E;Ljf/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lcom/unity3d/services/core/configuration/a;->b:Lcom/unity3d/ads/core/domain/HttpClientProvider;

    invoke-static {v0, p1, p2}, Lcom/unity3d/services/core/configuration/InitializeThread$InitializeStateDownloadWebView;->a(Lcom/unity3d/ads/core/domain/HttpClientProvider;LEf/E;Ljf/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lcom/unity3d/services/core/configuration/a;->b:Lcom/unity3d/ads/core/domain/HttpClientProvider;

    invoke-static {v0, p1, p2}, Lcom/unity3d/services/core/configuration/InitializeThread$InitializeStateConfig;->a(Lcom/unity3d/ads/core/domain/HttpClientProvider;LEf/E;Ljf/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
