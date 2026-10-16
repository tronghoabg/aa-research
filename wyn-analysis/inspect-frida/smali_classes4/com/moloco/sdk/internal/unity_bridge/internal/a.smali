.class public final synthetic Lcom/moloco/sdk/internal/unity_bridge/internal/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/moloco/sdk/internal/unity_bridge/MolocoUnityLoadCallback;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/moloco/sdk/internal/unity_bridge/MolocoUnityLoadCallback;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p3, p0, Lcom/moloco/sdk/internal/unity_bridge/internal/a;->a:I

    iput-object p1, p0, Lcom/moloco/sdk/internal/unity_bridge/internal/a;->b:Lcom/moloco/sdk/internal/unity_bridge/MolocoUnityLoadCallback;

    iput-object p2, p0, Lcom/moloco/sdk/internal/unity_bridge/internal/a;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/moloco/sdk/internal/unity_bridge/internal/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/moloco/sdk/internal/unity_bridge/internal/a;->b:Lcom/moloco/sdk/internal/unity_bridge/MolocoUnityLoadCallback;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/moloco/sdk/internal/unity_bridge/internal/a;->c:Ljava/lang/String;

    .line 9
    .line 10
    invoke-interface {v0, v1}, Lcom/moloco/sdk/internal/unity_bridge/MolocoUnityLoadCallback;->onAdLoadSuccess(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object v0, p0, Lcom/moloco/sdk/internal/unity_bridge/internal/a;->b:Lcom/moloco/sdk/internal/unity_bridge/MolocoUnityLoadCallback;

    .line 15
    .line 16
    iget-object v1, p0, Lcom/moloco/sdk/internal/unity_bridge/internal/a;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-interface {v0, v1}, Lcom/moloco/sdk/internal/unity_bridge/MolocoUnityLoadCallback;->onAdLoadSuccess(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
