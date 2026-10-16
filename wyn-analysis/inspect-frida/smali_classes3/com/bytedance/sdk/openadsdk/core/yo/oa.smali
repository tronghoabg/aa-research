.class public Lcom/bytedance/sdk/openadsdk/core/yo/oa;
.super Lcom/bytedance/sdk/openadsdk/core/yo/yo;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/sdk/openadsdk/core/yo/oa$uef;
    }
.end annotation


# static fields
.field private static lz:I = -0x80000000


# instance fields
.field protected ab:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field protected final bcc:I

.field protected bs:Lcom/bytedance/sdk/openadsdk/core/moa/uef;

.field protected cq:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

.field protected cz:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field protected dj:Lcom/bytedance/sdk/openadsdk/core/yo/oa$uef;

.field protected dz:Z

.field protected final ivm:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

.field public lw:Lcom/bytedance/sdk/openadsdk/core/model/ab;

.field protected moa:Landroid/content/Context;

.field private oa:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field protected oib:I

.field protected sy:Lcom/bytedance/sdk/openadsdk/core/zjm/oa;

.field private uef:Ljava/lang/String;

.field protected wk:Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/yo;

.field protected wrv:Lcom/bytedance/sdk/openadsdk/api/nativeAd/PAGNativeAd;

.field protected final xs:Ljava/lang/String;

.field private yo:Z

.field protected zjm:Lcom/bytedance/sdk/openadsdk/core/model/wrv;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/core/yo/yo;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->dz:Z

    .line 3
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->oib:I

    .line 4
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->yo:Z

    .line 5
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->moa:Landroid/content/Context;

    .line 6
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->ivm:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 7
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->xs:Ljava/lang/String;

    .line 8
    iput p4, p0, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->bcc:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;IZ)V
    .locals 0

    .line 9
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/bytedance/sdk/openadsdk/core/yo/oa;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;I)V

    .line 10
    iput-boolean p5, p0, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->yo:Z

    return-void
.end method

.method private static uef(Landroid/content/Context;)I
    .locals 2

    .line 97
    sget v0, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->lz:I

    const/high16 v1, -0x80000000

    if-ne v0, v1, :cond_0

    .line 98
    const-string v0, "btn_native_creative"

    invoke-static {p0, v0}, Lcom/bytedance/sdk/component/utils/orq;->lw(Landroid/content/Context;Ljava/lang/String;)I

    move-result p0

    sput p0, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->lz:I

    .line 99
    :cond_0
    sget p0, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->lz:I

    return p0
.end method

.method public static uef(Landroid/view/View;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Z)Z
    .locals 3

    const/4 v0, 0x1

    if-eqz p0, :cond_7

    if-nez p1, :cond_0

    goto :goto_1

    .line 57
    :cond_0
    :try_start_0
    sget v1, Lcom/bytedance/sdk/component/adexpress/dynamic/uef;->dhk:I

    invoke-virtual {p0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 58
    invoke-virtual {p0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 59
    const-string v1, "click"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p0, :cond_1

    return p2

    :cond_1
    return v0

    .line 60
    :catch_0
    :cond_2
    invoke-static {p0}, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->yo(Landroid/view/View;)Z

    move-result p0

    const/4 v1, 0x0

    if-eqz p0, :cond_5

    .line 61
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->vjj()I

    move-result p0

    if-ne p0, v0, :cond_4

    if-eqz p2, :cond_3

    goto :goto_0

    :cond_3
    return v1

    :cond_4
    :goto_0
    return v0

    .line 62
    :cond_5
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->hnk()I

    move-result p0

    if-ne p0, v0, :cond_7

    if-eqz p2, :cond_6

    goto :goto_1

    :cond_6
    return v1

    :cond_7
    :goto_1
    return v0
.end method

.method public static yo(Landroid/view/View;)Z
    .locals 2

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x1f000009

    if-eq v1, v0, :cond_1

    const v0, 0x1f00000b

    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v1

    if-eq v0, v1, :cond_1

    const v0, 0x1f000007

    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v1

    if-eq v0, v1, :cond_1

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->uef(Landroid/content/Context;)I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v1

    if-eq v0, v1, :cond_1

    sget v0, Lcom/bytedance/sdk/openadsdk/utils/bs;->nj:I

    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v1

    if-eq v0, v1, :cond_1

    sget v0, Lcom/bytedance/sdk/openadsdk/utils/bs;->anj:I

    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result p0

    if-ne v0, p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public lw()Ljava/lang/String;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->uef:Ljava/lang/String;

    return-object v0
.end method

.method public lw(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->dz:Z

    return-void
.end method

.method public moa()Landroid/view/View;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->oa:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->oa:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    return-object v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public moa(I)V
    .locals 0

    .line 3
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->oib:I

    return-void
.end method

.method public oa(I)V
    .locals 0

    .line 2
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/yo/yo;->ue:I

    return-void
.end method

.method public oa(Landroid/view/View;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->cz:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public uef(FFFFLandroid/util/SparseArray;JJLandroid/view/View;Ljava/lang/String;FIFILorg/json/JSONObject;Lorg/json/JSONObject;)Lcom/bytedance/sdk/openadsdk/core/model/wrv;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FFFF",
            "Landroid/util/SparseArray<",
            "Lcom/bytedance/sdk/openadsdk/core/yo/yo$uef;",
            ">;JJ",
            "Landroid/view/View;",
            "Ljava/lang/String;",
            "FIFI",
            "Lorg/json/JSONObject;",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/bytedance/sdk/openadsdk/core/model/wrv;"
        }
    .end annotation

    .line 63
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;

    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;-><init>()V

    .line 64
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;->ivm(F)Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;

    move-result-object p1

    .line 65
    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;->lw(F)Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;

    move-result-object p1

    .line 66
    invoke-virtual {p1, p3}, Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;->moa(F)Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;

    move-result-object p1

    .line 67
    invoke-virtual {p1, p4}, Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;->yo(F)Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;

    move-result-object p1

    .line 68
    invoke-virtual {p1, p6, p7}, Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;->oa(J)Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;

    move-result-object p1

    .line 69
    invoke-virtual {p1, p8, p9}, Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;->uef(J)Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;

    move-result-object p1

    .line 70
    invoke-static {p10}, Lcom/bytedance/sdk/openadsdk/utils/af;->uef(Landroid/view/View;)[I

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;->uef([I)Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;

    move-result-object p1

    .line 71
    invoke-static {p10}, Lcom/bytedance/sdk/openadsdk/utils/af;->yo(Landroid/view/View;)[I

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;->oa([I)Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;

    move-result-object p1

    iget p2, p0, Lcom/bytedance/sdk/openadsdk/core/yo/yo;->gr:I

    .line 72
    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;->moa(I)Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;

    move-result-object p1

    iget p2, p0, Lcom/bytedance/sdk/openadsdk/core/yo/yo;->ue:I

    .line 73
    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;->lw(I)Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;

    move-result-object p1

    iget p2, p0, Lcom/bytedance/sdk/openadsdk/core/yo/yo;->pz:I

    .line 74
    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;->ivm(I)Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;

    move-result-object p1

    .line 75
    invoke-virtual {p1, p5}, Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;->uef(Landroid/util/SparseArray;)Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;

    move-result-object p1

    .line 76
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/zjm;->oa()Lcom/bytedance/sdk/openadsdk/core/zjm;

    move-result-object p2

    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/core/zjm;->uef()Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x2

    :goto_0
    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;->oa(I)Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;

    move-result-object p1

    .line 77
    invoke-virtual {p1, p11}, Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;

    move-result-object p1

    .line 78
    invoke-virtual {p1, p12}, Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;->uef(F)Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;

    move-result-object p1

    .line 79
    invoke-virtual {p1, p13}, Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;->yo(I)Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;

    move-result-object p1

    .line 80
    invoke-virtual {p1, p14}, Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;->oa(F)Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;

    move-result-object p1

    move/from16 p2, p15

    .line 81
    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;->uef(I)Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;

    move-result-object p1

    move-object/from16 p2, p16

    .line 82
    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;->uef(Lorg/json/JSONObject;)Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;

    move-result-object p1

    move-object/from16 p2, p17

    .line 83
    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;->oa(Lorg/json/JSONObject;)Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;

    move-result-object p1

    .line 84
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/wrv$uef;->uef()Lcom/bytedance/sdk/openadsdk/core/model/wrv;

    move-result-object p1

    return-object p1
.end method

.method public uef(I)V
    .locals 0

    .line 13
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/yo/yo;->pz:I

    return-void
.end method

.method public uef(Landroid/app/Activity;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->oa:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public uef(Landroid/view/View;FFFFLandroid/util/SparseArray;Z)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "FFFF",
            "Landroid/util/SparseArray<",
            "Lcom/bytedance/sdk/openadsdk/core/yo/yo$uef;",
            ">;Z)V"
        }
    .end annotation

    move-object/from16 v0, p0

    .line 14
    iget-object v1, v0, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->moa:Landroid/content/Context;

    if-nez v1, :cond_0

    .line 15
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    move-result-object v1

    iput-object v1, v0, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->moa:Landroid/content/Context;

    .line 16
    :cond_0
    iget-boolean v1, v0, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->yo:Z

    if-nez v1, :cond_1

    const/4 v2, 0x1

    move-object/from16 v1, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    invoke-virtual/range {v0 .. v8}, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->uef(Landroid/view/View;IFFFFLandroid/util/SparseArray;Z)Z

    move-result v2

    if-eqz v2, :cond_1

    :goto_0
    move-object v1, v0

    goto/16 :goto_8

    .line 17
    :cond_1
    iget-object v1, v0, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->moa:Landroid/content/Context;

    if-nez v1, :cond_2

    goto :goto_0

    .line 18
    :cond_2
    iget-object v1, v0, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/model/ab;

    const/16 v19, 0x0

    const/4 v2, -0x1

    const/16 v20, 0x0

    if-eqz v1, :cond_3

    .line 19
    iget v3, v1, Lcom/bytedance/sdk/openadsdk/core/model/ab;->bcc:I

    .line 20
    iget-object v4, v1, Lcom/bytedance/sdk/openadsdk/core/model/ab;->cz:Lorg/json/JSONObject;

    .line 21
    iget-object v5, v1, Lcom/bytedance/sdk/openadsdk/core/model/ab;->cq:Lorg/json/JSONObject;

    .line 22
    iget-boolean v1, v1, Lcom/bytedance/sdk/openadsdk/core/model/ab;->dz:Z

    move/from16 v21, v1

    move/from16 v16, v3

    move-object/from16 v17, v4

    move-object/from16 v18, v5

    goto :goto_1

    :cond_3
    move/from16 v16, v2

    move/from16 v21, v19

    move-object/from16 v17, v20

    move-object/from16 v18, v17

    .line 23
    :goto_1
    iget-wide v7, v0, Lcom/bytedance/sdk/openadsdk/core/yo/yo;->gsd:J

    iget-wide v9, v0, Lcom/bytedance/sdk/openadsdk/core/yo/yo;->rt:J

    iget-object v1, v0, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->cz:Ljava/lang/ref/WeakReference;

    if-nez v1, :cond_4

    move-object/from16 v11, v20

    goto :goto_2

    .line 24
    :cond_4
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    move-object v11, v1

    :goto_2
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->lw()Ljava/lang/String;

    move-result-object v12

    iget-object v1, v0, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->moa:Landroid/content/Context;

    .line 25
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/utils/af;->bcc(Landroid/content/Context;)F

    move-result v13

    iget-object v1, v0, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->moa:Landroid/content/Context;

    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/utils/af;->zjm(Landroid/content/Context;)I

    move-result v14

    iget-object v1, v0, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->moa:Landroid/content/Context;

    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/utils/af;->cz(Landroid/content/Context;)F

    move-result v15

    move/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    move-object/from16 v6, p6

    move-object v1, v0

    move-object/from16 v0, p1

    .line 26
    invoke-virtual/range {v1 .. v18}, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->uef(FFFFLandroid/util/SparseArray;JJLandroid/view/View;Ljava/lang/String;FIFILorg/json/JSONObject;Lorg/json/JSONObject;)Lcom/bytedance/sdk/openadsdk/core/model/wrv;

    move-result-object v2

    iput-object v2, v1, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->zjm:Lcom/bytedance/sdk/openadsdk/core/model/wrv;

    .line 27
    iget-object v3, v1, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->ab:Ljava/util/Map;

    invoke-virtual {v1, v2, v3}, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->uef(Lcom/bytedance/sdk/openadsdk/core/model/wrv;Ljava/util/Map;)Z

    move-result v2

    if-eqz v2, :cond_5

    goto/16 :goto_8

    .line 28
    :cond_5
    iget-object v2, v1, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->cq:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    if-eqz v2, :cond_7

    .line 29
    iget-object v2, v1, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->ab:Ljava/util/Map;

    if-nez v2, :cond_6

    .line 30
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, v1, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->ab:Ljava/util/Map;

    .line 31
    :cond_6
    iget-object v2, v1, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->ab:Ljava/util/Map;

    iget-object v3, v1, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->cq:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    invoke-interface {v3}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;->ivm()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "duration"

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    :cond_7
    iget-object v6, v1, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->ivm:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 33
    iget-boolean v2, v1, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->yo:Z

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-nez v2, :cond_8

    if-eqz v21, :cond_9

    :cond_8
    move/from16 v2, p7

    goto/16 :goto_6

    .line 34
    :cond_9
    iget-object v2, v1, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->dj:Lcom/bytedance/sdk/openadsdk/core/yo/oa$uef;

    if-eqz v2, :cond_a

    const/4 v5, -0x1

    .line 35
    invoke-interface {v2, v0, v5}, Lcom/bytedance/sdk/openadsdk/core/yo/oa$uef;->uef(Landroid/view/View;I)V

    :cond_a
    move/from16 v2, p7

    .line 36
    invoke-virtual {v1, v0, v2}, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->uef(Landroid/view/View;Z)Z

    move-result v5

    if-nez v5, :cond_b

    goto/16 :goto_8

    .line 37
    :cond_b
    invoke-static {v6}, Lcom/bytedance/sdk/openadsdk/core/model/cp;->oa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v12

    if-eqz v12, :cond_c

    .line 38
    iget-object v5, v1, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->xs:Ljava/lang/String;

    :goto_3
    move-object v10, v5

    goto :goto_4

    :cond_c
    iget v5, v1, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->bcc:I

    invoke-static {v5}, Lcom/bytedance/sdk/openadsdk/utils/gb;->uef(I)Ljava/lang/String;

    move-result-object v5

    goto :goto_3

    :goto_4
    if-eqz v0, :cond_d

    const v5, 0x1f000042

    .line 39
    :try_start_0
    invoke-virtual {v0, v5}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v5

    .line 40
    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v7, v5}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_d

    .line 41
    invoke-static {v4}, Lcom/bytedance/sdk/openadsdk/core/pu;->uef(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_d
    if-eqz v0, :cond_e

    .line 42
    invoke-static {v0}, Lcom/bytedance/sdk/component/utils/oa;->uef(Landroid/view/View;)Landroid/app/Activity;

    move-result-object v20

    :cond_e
    if-nez v20, :cond_f

    .line 43
    iget-object v0, v1, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->moa:Landroid/content/Context;

    move-object v5, v0

    goto :goto_5

    :cond_f
    move-object/from16 v5, v20

    .line 44
    :goto_5
    iget v7, v1, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->bcc:I

    iget-object v8, v1, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->wrv:Lcom/bytedance/sdk/openadsdk/api/nativeAd/PAGNativeAd;

    iget-object v9, v1, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->bs:Lcom/bytedance/sdk/openadsdk/core/moa/uef;

    iget-object v11, v1, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->wk:Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/yo;

    const/4 v13, 0x0

    invoke-static/range {v5 .. v13}, Lcom/bytedance/sdk/openadsdk/core/pu;->uef(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;ILcom/bytedance/sdk/openadsdk/api/nativeAd/PAGNativeAd;Lcom/bytedance/sdk/openadsdk/core/moa/uef;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/yo;ZI)Z

    move-result v0

    .line 45
    invoke-static/range {v19 .. v19}, Lcom/bytedance/sdk/openadsdk/core/pu;->uef(Z)V

    if-nez v0, :cond_10

    if-eqz v6, :cond_10

    .line 46
    invoke-virtual {v6}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->agr()Lcom/bytedance/sdk/openadsdk/core/model/cq;

    move-result-object v5

    if-eqz v5, :cond_10

    .line 47
    invoke-virtual {v6}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->agr()Lcom/bytedance/sdk/openadsdk/core/model/cq;

    move-result-object v5

    invoke-virtual {v5}, Lcom/bytedance/sdk/openadsdk/core/model/cq;->yo()I

    move-result v5

    if-ne v5, v3, :cond_10

    goto/16 :goto_8

    :cond_10
    if-eqz v6, :cond_11

    if-nez v0, :cond_11

    .line 48
    invoke-virtual {v6}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->cc()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_11

    iget-object v5, v1, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->xs:Ljava/lang/String;

    invoke-static {v5}, Lcom/bytedance/sdk/openadsdk/moa/oa;->uef(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_11

    .line 49
    iget-object v5, v1, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->moa:Landroid/content/Context;

    iget-object v7, v1, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->xs:Ljava/lang/String;

    invoke-static {v5, v7}, Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/moa;->uef(Landroid/content/Context;Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/yo;

    move-result-object v5

    invoke-interface {v5, v6}, Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/yo;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    .line 50
    :cond_11
    iget-object v5, v1, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->zjm:Lcom/bytedance/sdk/openadsdk/core/model/wrv;

    iget-object v7, v1, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->xs:Ljava/lang/String;

    iget-object v8, v1, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->ab:Ljava/util/Map;

    if-eqz v2, :cond_12

    move v3, v4

    :cond_12
    const-string v2, "click"

    move/from16 p5, v0

    move-object/from16 p1, v2

    move/from16 p7, v3

    move-object/from16 p3, v5

    move-object/from16 p2, v6

    move-object/from16 p4, v7

    move-object/from16 p6, v8

    invoke-static/range {p1 .. p7}, Lcom/bytedance/sdk/openadsdk/moa/yo;->uef(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/core/model/wrv;Ljava/lang/String;ZLjava/util/Map;I)V

    return-void

    .line 51
    :goto_6
    iget-object v0, v1, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->zjm:Lcom/bytedance/sdk/openadsdk/core/model/wrv;

    iget-object v5, v1, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->xs:Ljava/lang/String;

    iget-object v7, v1, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->ab:Ljava/util/Map;

    if-eqz v2, :cond_13

    move v3, v4

    :cond_13
    const-string v2, "click"

    const/4 v4, 0x1

    move-object/from16 p3, v0

    move-object/from16 p1, v2

    move/from16 p7, v3

    move/from16 p5, v4

    move-object/from16 p4, v5

    move-object/from16 p2, v6

    move-object/from16 p6, v7

    invoke-static/range {p1 .. p7}, Lcom/bytedance/sdk/openadsdk/moa/yo;->uef(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/core/model/wrv;Ljava/lang/String;ZLjava/util/Map;I)V

    .line 52
    invoke-virtual {v6}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->odd()Lcom/bytedance/sdk/openadsdk/core/model/moa;

    move-result-object v0

    if-eqz v0, :cond_15

    .line 53
    invoke-virtual {v6}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ebe()Z

    move-result v2

    if-nez v2, :cond_15

    .line 54
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/moa;->uef()Lcom/bytedance/sdk/openadsdk/core/dz/moa;

    move-result-object v0

    if-eqz v0, :cond_15

    .line 55
    iget-object v2, v1, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->cq:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    if-eqz v2, :cond_14

    invoke-interface {v2}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;->ivm()J

    move-result-wide v2

    goto :goto_7

    :cond_14
    const-wide/16 v2, 0x0

    :goto_7
    invoke-virtual {v0, v2, v3}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->xs(J)V

    :cond_15
    :goto_8
    return-void
.end method

.method public uef(Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;)V
    .locals 0

    .line 6
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->cq:Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/api/nativeAd/PAGNativeAd;)V
    .locals 0

    .line 4
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->wrv:Lcom/bytedance/sdk/openadsdk/api/nativeAd/PAGNativeAd;

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/moa/uef;)V
    .locals 0

    .line 5
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->bs:Lcom/bytedance/sdk/openadsdk/core/moa/uef;

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/yo/oa$uef;)V
    .locals 0

    .line 7
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->dj:Lcom/bytedance/sdk/openadsdk/core/yo/oa$uef;

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/zjm/oa;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->sy:Lcom/bytedance/sdk/openadsdk/core/zjm/oa;

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/yo;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->wk:Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/yo;

    return-void
.end method

.method public uef(Ljava/lang/String;)V
    .locals 0

    .line 100
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->uef:Ljava/lang/String;

    return-void
.end method

.method public uef(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 9
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->ab:Ljava/util/Map;

    if-eqz v0, :cond_0

    .line 10
    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 11
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->ab:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 12
    :cond_0
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->ab:Ljava/util/Map;

    return-void
.end method

.method public uef(Landroid/view/View;IFFFFLandroid/util/SparseArray;Z)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "IFFFF",
            "Landroid/util/SparseArray<",
            "Lcom/bytedance/sdk/openadsdk/core/yo/yo$uef;",
            ">;Z)Z"
        }
    .end annotation

    .line 85
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->sy:Lcom/bytedance/sdk/openadsdk/core/zjm/oa;

    if-eqz v0, :cond_0

    .line 86
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;

    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;-><init>()V

    .line 87
    invoke-virtual {v0, p3}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->moa(F)Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;

    move-result-object p3

    .line 88
    invoke-virtual {p3, p4}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->yo(F)Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;

    move-result-object p3

    .line 89
    invoke-virtual {p3, p5}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->oa(F)Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;

    move-result-object p3

    .line 90
    invoke-virtual {p3, p6}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->uef(F)Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;

    move-result-object p3

    iget-wide p4, p0, Lcom/bytedance/sdk/openadsdk/core/yo/yo;->gsd:J

    .line 91
    invoke-virtual {p3, p4, p5}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->oa(J)Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;

    move-result-object p3

    iget-wide p4, p0, Lcom/bytedance/sdk/openadsdk/core/yo/yo;->rt:J

    .line 92
    invoke-virtual {p3, p4, p5}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->uef(J)Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;

    move-result-object p3

    .line 93
    invoke-virtual {p3, p7}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->uef(Landroid/util/SparseArray;)Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;

    move-result-object p3

    .line 94
    invoke-virtual {p3, p8}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->uef(Z)Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;

    move-result-object p3

    .line 95
    invoke-virtual {p3}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->uef()Lcom/bytedance/sdk/openadsdk/core/model/ab;

    move-result-object p3

    .line 96
    iget-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->sy:Lcom/bytedance/sdk/openadsdk/core/zjm/oa;

    invoke-interface {p4, p1, p2, p3}, Lcom/bytedance/sdk/openadsdk/core/zjm/oa;->uef(Landroid/view/View;ILcom/bytedance/sdk/openadsdk/core/model/ab;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public uef(Landroid/view/View;Z)Z
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->ivm:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {p1, v0, p2}, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->uef(Landroid/view/View;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Z)Z

    move-result p1

    return p1
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/model/wrv;Ljava/util/Map;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bytedance/sdk/openadsdk/core/model/wrv;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    .line 1
    const/4 p1, 0x0

    return p1
.end method

.method public yo(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/yo/yo;->gr:I

    return-void
.end method
