.class public final Lokhttp3/RequestBody$Companion$toRequestBody$2;
.super Lokhttp3/RequestBody;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\n\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "okhttp3/RequestBody$Companion$toRequestBody$2",
        "Lokhttp3/RequestBody;",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic c:Lokhttp3/MediaType;

.field public final synthetic d:I

.field public final synthetic e:[B

.field public final synthetic f:I


# direct methods
.method public constructor <init>(Lokhttp3/MediaType;[BII)V
    .locals 0

    .line 1
    iput-object p1, p0, Lokhttp3/RequestBody$Companion$toRequestBody$2;->c:Lokhttp3/MediaType;

    .line 2
    .line 3
    iput p3, p0, Lokhttp3/RequestBody$Companion$toRequestBody$2;->d:I

    .line 4
    .line 5
    iput-object p2, p0, Lokhttp3/RequestBody$Companion$toRequestBody$2;->e:[B

    .line 6
    .line 7
    iput p4, p0, Lokhttp3/RequestBody$Companion$toRequestBody$2;->f:I

    .line 8
    .line 9
    invoke-direct {p0}, Lokhttp3/RequestBody;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final contentLength()J
    .locals 2

    .line 1
    iget v0, p0, Lokhttp3/RequestBody$Companion$toRequestBody$2;->d:I

    .line 2
    .line 3
    int-to-long v0, v0

    .line 4
    return-wide v0
.end method

.method public final contentType()Lokhttp3/MediaType;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/RequestBody$Companion$toRequestBody$2;->c:Lokhttp3/MediaType;

    .line 2
    .line 3
    return-object v0
.end method

.method public final writeTo(Lcg/h;)V
    .locals 3

    .line 1
    iget v0, p0, Lokhttp3/RequestBody$Companion$toRequestBody$2;->d:I

    .line 2
    .line 3
    iget-object v1, p0, Lokhttp3/RequestBody$Companion$toRequestBody$2;->e:[B

    .line 4
    .line 5
    iget v2, p0, Lokhttp3/RequestBody$Companion$toRequestBody$2;->f:I

    .line 6
    .line 7
    invoke-interface {p1, v2, v0, v1}, Lcg/h;->T(II[B)Lcg/h;

    .line 8
    .line 9
    .line 10
    return-void
.end method
