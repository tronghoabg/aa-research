.class public Lcom/bytedance/sdk/openadsdk/utils/ab;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/oem/uef;


# static fields
.field private static ivm:Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;

.field private static lw:Z

.field private static moa:Ljava/lang/String;

.field private static oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

.field private static final uef:Lcom/bytedance/sdk/openadsdk/utils/ab;

.field private static xs:Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;

.field private static yo:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/bytedance/sdk/openadsdk/utils/ab;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/utils/ab;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/bytedance/sdk/openadsdk/utils/ab;->uef:Lcom/bytedance/sdk/openadsdk/utils/ab;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic bcc()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/bytedance/sdk/openadsdk/utils/ab;->moa:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic ivm()Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;
    .locals 1

    .line 1
    sget-object v0, Lcom/bytedance/sdk/openadsdk/utils/ab;->ivm:Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic lw()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/bytedance/sdk/openadsdk/utils/ab;->lw:Z

    .line 2
    .line 3
    return v0
.end method

.method public static synthetic moa()Landroid/content/Context;
    .locals 1

    .line 1
    sget-object v0, Lcom/bytedance/sdk/openadsdk/utils/ab;->yo:Landroid/content/Context;

    .line 2
    .line 3
    return-object v0
.end method

.method public static oa()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    sput-boolean v0, Lcom/bytedance/sdk/openadsdk/utils/ab;->lw:Z

    .line 3
    .line 4
    return-void
.end method

.method public static uef()V
    .locals 2

    .line 12
    sget-object v0, Lcom/bytedance/sdk/openadsdk/utils/ab;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    if-nez v0, :cond_0

    return-void

    .line 13
    :cond_0
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lcom/bytedance/sdk/openadsdk/utils/ab;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/oem/IPBroadcastReceiver;->uef(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Lcom/bytedance/sdk/openadsdk/oem/IPBroadcastReceiver;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 14
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/oem/IPBroadcastReceiver;->uef()V

    :cond_1
    const/4 v0, 0x0

    .line 15
    sput-boolean v0, Lcom/bytedance/sdk/openadsdk/utils/ab;->lw:Z

    const/4 v0, 0x0

    .line 16
    sput-object v0, Lcom/bytedance/sdk/openadsdk/utils/ab;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 17
    sput-object v0, Lcom/bytedance/sdk/openadsdk/utils/ab;->yo:Landroid/content/Context;

    .line 18
    sput-object v0, Lcom/bytedance/sdk/openadsdk/utils/ab;->moa:Ljava/lang/String;

    .line 19
    sput-object v0, Lcom/bytedance/sdk/openadsdk/utils/ab;->ivm:Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;

    .line 20
    sput-object v0, Lcom/bytedance/sdk/openadsdk/utils/ab;->xs:Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;

    return-void
.end method

.method public static uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Landroid/content/Context;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-static {p0, p1, p2, v0, p3}, Lcom/bytedance/sdk/openadsdk/utils/ab;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Landroid/content/Context;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;)V

    return-void
.end method

.method public static uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Landroid/content/Context;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-static {p0, p1, p2, p3, v0}, Lcom/bytedance/sdk/openadsdk/utils/ab;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Landroid/content/Context;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;)V

    return-void
.end method

.method public static uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Landroid/content/Context;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;)V
    .locals 2

    .line 3
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->azx()Lcom/bytedance/sdk/openadsdk/core/model/pz;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/pz;->xs()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/pz;->bcc()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    sput-object p0, Lcom/bytedance/sdk/openadsdk/utils/ab;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 6
    sput-object p1, Lcom/bytedance/sdk/openadsdk/utils/ab;->yo:Landroid/content/Context;

    .line 7
    sput-object p2, Lcom/bytedance/sdk/openadsdk/utils/ab;->moa:Ljava/lang/String;

    .line 8
    sput-object p3, Lcom/bytedance/sdk/openadsdk/utils/ab;->ivm:Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;

    .line 9
    sput-object p4, Lcom/bytedance/sdk/openadsdk/utils/ab;->xs:Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;

    .line 10
    invoke-static {p1, p0}, Lcom/bytedance/sdk/openadsdk/oem/IPBroadcastReceiver;->uef(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Lcom/bytedance/sdk/openadsdk/oem/IPBroadcastReceiver;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 11
    sget-object p1, Lcom/bytedance/sdk/openadsdk/utils/ab;->uef:Lcom/bytedance/sdk/openadsdk/utils/ab;

    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/openadsdk/oem/IPBroadcastReceiver;->uef(Lcom/bytedance/sdk/openadsdk/oem/uef;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static synthetic xs()Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;
    .locals 1

    .line 1
    sget-object v0, Lcom/bytedance/sdk/openadsdk/utils/ab;->xs:Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic yo()Lcom/bytedance/sdk/openadsdk/core/model/gzw;
    .locals 1

    .line 1
    sget-object v0, Lcom/bytedance/sdk/openadsdk/utils/ab;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public uef(Ljava/lang/String;I)V
    .locals 2

    .line 21
    sget-object v0, Lcom/bytedance/sdk/openadsdk/utils/ab;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    if-eqz v0, :cond_3

    sget-object v1, Lcom/bytedance/sdk/openadsdk/utils/ab;->yo:Landroid/content/Context;

    if-nez v1, :cond_0

    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->no()Lcom/bytedance/sdk/openadsdk/core/model/ivm;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 23
    :cond_1
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/ivm;->yo()Ljava/lang/String;

    move-result-object v0

    .line 24
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    .line 25
    :cond_2
    new-instance p1, Lcom/bytedance/sdk/openadsdk/utils/ab$1;

    invoke-direct {p1, p0, p2}, Lcom/bytedance/sdk/openadsdk/utils/ab$1;-><init>(Lcom/bytedance/sdk/openadsdk/utils/ab;I)V

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/utils/km;->uef(Ljava/lang/Runnable;)V

    :cond_3
    :goto_0
    return-void
.end method
