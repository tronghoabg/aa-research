.class public final Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/QonversionPlugin$qonversionSandwich$2$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LGe/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/QonversionPlugin;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "com/qonversion/flutter/sdk/qonversion_flutter_sdk/QonversionPlugin$qonversionSandwich$2$1$1",
        "Lio/qonversion/sandwich/ActivityProvider;",
        "currentActivity",
        "Landroid/app/Activity;",
        "getCurrentActivity",
        "()Landroid/app/Activity;",
        "qonversion_flutter_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/QonversionPlugin;


# direct methods
.method public constructor <init>(Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/QonversionPlugin;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/QonversionPlugin$qonversionSandwich$2$1$1;->this$0:Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/QonversionPlugin;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public getCurrentActivity()Landroid/app/Activity;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/QonversionPlugin$qonversionSandwich$2$1$1;->this$0:Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/QonversionPlugin;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/QonversionPlugin;->access$getActivity$p(Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/QonversionPlugin;)Landroid/app/Activity;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
