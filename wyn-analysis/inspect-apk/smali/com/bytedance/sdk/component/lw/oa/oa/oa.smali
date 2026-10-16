.class public Lcom/bytedance/sdk/component/lw/oa/oa/oa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/component/lw/oa/oa/ivm;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private uef(Lcom/bytedance/sdk/component/lw/oa/yo/yo;)Ljava/lang/String;
    .locals 0

    .line 8
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->uef()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/bytedance/sdk/component/utils/ab;->uef(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public uef()Ljava/lang/String;
    .locals 1

    .line 7
    const-string v0, "generate_key"

    return-object v0
.end method

.method public uef(Lcom/bytedance/sdk/component/lw/oa/yo/yo;Lcom/bytedance/sdk/component/lw/oib;Lcom/bytedance/sdk/component/lw/oa/yo/uef;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->bcc()Ljava/lang/String;

    move-result-object p2

    .line 2
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 3
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/component/lw/oa/oa/oa;->uef(Lcom/bytedance/sdk/component/lw/oa/yo/yo;)Ljava/lang/String;

    move-result-object p2

    .line 4
    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->oa(Ljava/lang/String;)V

    .line 5
    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->uef(Ljava/lang/String;)V

    .line 6
    :cond_0
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->uef()Ljava/lang/String;

    const/4 p1, 0x1

    return p1
.end method
