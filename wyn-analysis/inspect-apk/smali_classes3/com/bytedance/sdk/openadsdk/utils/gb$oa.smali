.class public Lcom/bytedance/sdk/openadsdk/utils/gb$oa;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/sdk/openadsdk/utils/gb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "oa"
.end annotation


# instance fields
.field public final oa:I

.field public final uef:Landroid/content/ComponentName;


# direct methods
.method public constructor <init>(Landroid/content/ComponentName;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/utils/gb$oa;->uef:Landroid/content/ComponentName;

    .line 5
    .line 6
    iput p2, p0, Lcom/bytedance/sdk/openadsdk/utils/gb$oa;->oa:I

    .line 7
    .line 8
    return-void
.end method
