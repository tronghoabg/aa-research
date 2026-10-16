.class final Lcom/bytedance/adsdk/oa/ivm$yo$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/adsdk/oa/ivm$yo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/bytedance/adsdk/oa/ivm$yo;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/bytedance/adsdk/oa/ivm$yo$1;->uef(Landroid/os/Parcel;)Lcom/bytedance/adsdk/oa/ivm$yo;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/bytedance/adsdk/oa/ivm$yo$1;->uef(I)[Lcom/bytedance/adsdk/oa/ivm$yo;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public uef(Landroid/os/Parcel;)Lcom/bytedance/adsdk/oa/ivm$yo;
    .locals 2

    .line 1
    new-instance v0, Lcom/bytedance/adsdk/oa/ivm$yo;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/bytedance/adsdk/oa/ivm$yo;-><init>(Landroid/os/Parcel;Lcom/bytedance/adsdk/oa/ivm$1;)V

    return-object v0
.end method

.method public uef(I)[Lcom/bytedance/adsdk/oa/ivm$yo;
    .locals 0

    .line 2
    new-array p1, p1, [Lcom/bytedance/adsdk/oa/ivm$yo;

    return-object p1
.end method
