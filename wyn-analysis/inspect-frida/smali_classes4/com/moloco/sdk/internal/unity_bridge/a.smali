.class public final synthetic Lcom/moloco/sdk/internal/unity_bridge/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/moloco/sdk/publisher/MolocoInitializationListener;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lcom/moloco/sdk/internal/unity_bridge/MolocoUnityInitCallback;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/moloco/sdk/internal/unity_bridge/MolocoUnityInitCallback;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/moloco/sdk/internal/unity_bridge/a;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/moloco/sdk/internal/unity_bridge/a;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/moloco/sdk/internal/unity_bridge/a;->c:Lcom/moloco/sdk/internal/unity_bridge/MolocoUnityInitCallback;

    return-void
.end method


# virtual methods
.method public final onMolocoInitializationStatus(Lcom/moloco/sdk/publisher/MolocoInitStatus;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/internal/unity_bridge/a;->b:Ljava/lang/String;

    iget-object v1, p0, Lcom/moloco/sdk/internal/unity_bridge/a;->c:Lcom/moloco/sdk/internal/unity_bridge/MolocoUnityInitCallback;

    iget-object v2, p0, Lcom/moloco/sdk/internal/unity_bridge/a;->a:Ljava/lang/String;

    invoke-static {v2, v0, v1, p1}, Lcom/moloco/sdk/internal/unity_bridge/MolocoUnityPlugin;->b(Ljava/lang/String;Ljava/lang/String;Lcom/moloco/sdk/internal/unity_bridge/MolocoUnityInitCallback;Lcom/moloco/sdk/publisher/MolocoInitStatus;)V

    return-void
.end method
