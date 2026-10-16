.class public final Lcom/moloco/sdk/internal/services/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/moloco/sdk/internal/services/i;->a:Landroid/content/Context;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()Lcom/moloco/sdk/internal/services/h;
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/internal/services/i;->a:Landroid/content/Context;

    .line 2
    .line 3
    new-instance v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/p;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, v0, v2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/p;-><init>(Landroid/content/Context;I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/p;->a()Lcom/moloco/sdk/common_adapter_internal/a;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    iget v10, v2, Landroid/util/DisplayMetrics;->xdpi:F

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget v11, v0, Landroid/util/DisplayMetrics;->ydpi:F

    .line 32
    .line 33
    new-instance v3, Lcom/moloco/sdk/internal/services/h;

    .line 34
    .line 35
    iget v8, v1, Lcom/moloco/sdk/common_adapter_internal/a;->f:F

    .line 36
    .line 37
    iget v9, v1, Lcom/moloco/sdk/common_adapter_internal/a;->e:I

    .line 38
    .line 39
    iget v4, v1, Lcom/moloco/sdk/common_adapter_internal/a;->a:I

    .line 40
    .line 41
    iget v5, v1, Lcom/moloco/sdk/common_adapter_internal/a;->c:F

    .line 42
    .line 43
    iget v6, v1, Lcom/moloco/sdk/common_adapter_internal/a;->b:I

    .line 44
    .line 45
    iget v7, v1, Lcom/moloco/sdk/common_adapter_internal/a;->d:F

    .line 46
    .line 47
    invoke-direct/range {v3 .. v11}, Lcom/moloco/sdk/internal/services/h;-><init>(IFIFFIFF)V

    .line 48
    .line 49
    .line 50
    return-object v3
.end method
