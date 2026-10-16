.class Lcom/bytedance/sdk/openadsdk/component/reward/uef/dj$4$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/component/reward/uef/lw$uef;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/component/reward/uef/dj$4;->uef(Landroid/view/View;FFFFLandroid/util/SparseArray;IIIZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/dj$4;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef/dj$4;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dj$4$1;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/dj$4;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public uef(Landroid/view/View;FFFFLandroid/util/SparseArray;III)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "FFFF",
            "Landroid/util/SparseArray<",
            "Lcom/bytedance/sdk/openadsdk/core/yo/yo$uef;",
            ">;III)V"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dj$4$1;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/dj$4;

    iget-object v1, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dj$4;->yo:Lcom/bytedance/sdk/openadsdk/component/reward/uef/dj;

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    invoke-static/range {v1 .. v10}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dj;->uef(Lcom/bytedance/sdk/openadsdk/component/reward/uef/dj;Landroid/view/View;FFFFLandroid/util/SparseArray;III)V

    return-void
.end method

.method public uef(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dj$4$1;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/dj$4;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dj$4;->yo:Lcom/bytedance/sdk/openadsdk/component/reward/uef/dj;

    invoke-static {v0, p1, p2}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dj;->uef(Lcom/bytedance/sdk/openadsdk/component/reward/uef/dj;Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method
