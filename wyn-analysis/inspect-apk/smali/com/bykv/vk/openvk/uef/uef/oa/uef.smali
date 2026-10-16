.class public Lcom/bykv/vk/openvk/uef/uef/oa/uef;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static bcc:I = 0x2000

.field private static ivm:Z = false

.field private static lw:Lcom/bykv/vk/openvk/uef/uef/uef/uef/oa; = null

.field public static moa:I = 0xa

.field public static oa:I = 0xa

.field public static uef:I = 0x32

.field private static xs:I = 0x1

.field public static yo:I = 0xa


# direct methods
.method public static ivm()I
    .locals 1

    .line 1
    sget v0, Lcom/bykv/vk/openvk/uef/uef/oa/uef;->xs:I

    .line 2
    .line 3
    return v0
.end method

.method public static lw()I
    .locals 1

    .line 1
    sget v0, Lcom/bykv/vk/openvk/uef/uef/oa/uef;->moa:I

    .line 2
    .line 3
    return v0
.end method

.method public static moa()I
    .locals 1

    .line 1
    sget v0, Lcom/bykv/vk/openvk/uef/uef/oa/uef;->yo:I

    .line 2
    .line 3
    return v0
.end method

.method public static oa()I
    .locals 1

    .line 2
    sget v0, Lcom/bykv/vk/openvk/uef/uef/oa/uef;->uef:I

    return v0
.end method

.method public static oa(Ljava/lang/String;)Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/bykv/vk/openvk/uef/uef/oa/uef;->ivm:Z

    if-eqz v0, :cond_0

    if-eqz p0, :cond_0

    const-string v0, ".mp4"

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static uef()V
    .locals 1

    .line 19
    sget-object v0, Lcom/bykv/vk/openvk/uef/uef/oa/uef;->lw:Lcom/bykv/vk/openvk/uef/uef/uef/uef/oa;

    if-eqz v0, :cond_0

    .line 20
    invoke-interface {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/uef/oa;->moa()V

    :cond_0
    return-void
.end method

.method public static uef(Lcom/bykv/vk/openvk/uef/uef/uef/uef/oa;)V
    .locals 0

    .line 18
    sput-object p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef;->lw:Lcom/bykv/vk/openvk/uef/uef/uef/uef/oa;

    return-void
.end method

.method public static uef(Ljava/lang/String;)V
    .locals 3

    .line 13
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 14
    :cond_0
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 15
    const-string p0, "check_moov"

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result p0

    const/4 v2, 0x1

    if-ne p0, v2, :cond_1

    move v1, v2

    :cond_1
    sput-boolean v1, Lcom/bykv/vk/openvk/uef/uef/oa/uef;->ivm:Z

    .line 16
    const-string p0, "new_media_source"

    invoke-virtual {v0, p0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result p0

    sput p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef;->xs:I

    .line 17
    const-string p0, "read_buffer_size_k"

    const/16 v1, 0x8

    invoke-virtual {v0, p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result p0

    mul-int/lit16 p0, p0, 0x400

    sput p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef;->bcc:I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :goto_0
    return-void
.end method

.method public static uef(Lorg/json/JSONObject;)V
    .locals 3

    if-nez p0, :cond_0

    return-void

    .line 1
    :cond_0
    :try_start_0
    const-string v0, "splash"

    const/16 v1, 0x32

    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    sput v0, Lcom/bykv/vk/openvk/uef/uef/oa/uef;->uef:I

    .line 2
    const-string v0, "reward"

    const/16 v2, 0xa

    invoke-virtual {p0, v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    sput v0, Lcom/bykv/vk/openvk/uef/uef/oa/uef;->oa:I

    .line 3
    const-string v0, "brand"

    invoke-virtual {p0, v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    sput v0, Lcom/bykv/vk/openvk/uef/uef/oa/uef;->yo:I

    .line 4
    const-string v0, "other"

    invoke-virtual {p0, v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result p0

    sput p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef;->moa:I

    .line 5
    sget v0, Lcom/bykv/vk/openvk/uef/uef/oa/uef;->uef:I

    if-gez v0, :cond_1

    .line 6
    sput v1, Lcom/bykv/vk/openvk/uef/uef/oa/uef;->uef:I

    .line 7
    :cond_1
    sget v0, Lcom/bykv/vk/openvk/uef/uef/oa/uef;->oa:I

    if-gez v0, :cond_2

    .line 8
    sput v2, Lcom/bykv/vk/openvk/uef/uef/oa/uef;->oa:I

    .line 9
    :cond_2
    sget v0, Lcom/bykv/vk/openvk/uef/uef/oa/uef;->yo:I

    if-gez v0, :cond_3

    .line 10
    sput v2, Lcom/bykv/vk/openvk/uef/uef/oa/uef;->yo:I

    :cond_3
    if-gez p0, :cond_4

    .line 11
    sput v2, Lcom/bykv/vk/openvk/uef/uef/oa/uef;->moa:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_4
    return-void

    :catchall_0
    move-exception p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    return-void
.end method

.method public static xs()I
    .locals 1

    .line 1
    sget v0, Lcom/bykv/vk/openvk/uef/uef/oa/uef;->bcc:I

    .line 2
    .line 3
    return v0
.end method

.method public static yo()I
    .locals 1

    .line 1
    sget v0, Lcom/bykv/vk/openvk/uef/uef/oa/uef;->oa:I

    .line 2
    .line 3
    return v0
.end method
