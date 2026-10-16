.class Lcom/bytedance/sdk/openadsdk/utils/gb$yo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/sdk/openadsdk/utils/gb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "yo"
.end annotation


# static fields
.field private static final uef:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    const-string v0, "TTAD.ToolUtils"

    .line 2
    .line 3
    const-string v1, "init hasBindingAdapterPositionMethod start status = 0"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/bytedance/sdk/component/utils/dhk;->uef(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    :try_start_0
    const-class v2, Landroidx/recyclerview/widget/m0;

    .line 10
    .line 11
    sget v3, Landroidx/recyclerview/widget/m0;->b:I

    .line 12
    .line 13
    const-string v3, "getBindingAdapterPosition"

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    new-array v5, v4, [Ljava/lang/Class;

    .line 17
    .line 18
    invoke-virtual {v2, v3, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 19
    .line 20
    .line 21
    move-result-object v2
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1

    .line 22
    if-nez v2, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v1, v4

    .line 26
    goto :goto_0

    .line 27
    :catch_0
    const/4 v1, 0x1

    .line 28
    :catch_1
    :goto_0
    sput v1, Lcom/bytedance/sdk/openadsdk/utils/gb$yo;->uef:I

    .line 29
    .line 30
    const-string v2, "init hasBindingAdapterPositionMethod end status = "

    .line 31
    .line 32
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-static {v0, v1}, Lcom/bytedance/sdk/component/utils/dhk;->uef(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public static synthetic uef()I
    .locals 1

    .line 1
    sget v0, Lcom/bytedance/sdk/openadsdk/utils/gb$yo;->uef:I

    .line 2
    .line 3
    return v0
.end method
