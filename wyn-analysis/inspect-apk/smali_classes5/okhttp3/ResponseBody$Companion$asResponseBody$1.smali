.class public final Lokhttp3/ResponseBody$Companion$asResponseBody$1;
.super Lokhttp3/ResponseBody;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\n\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "okhttp3/ResponseBody$Companion$asResponseBody$1",
        "Lokhttp3/ResponseBody;",
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
.field public final synthetic d:Lokhttp3/MediaType;

.field public final synthetic e:J

.field public final synthetic f:Lcg/i;


# direct methods
.method public constructor <init>(Lcg/i;Lokhttp3/MediaType;J)V
    .locals 0

    .line 1
    iput-object p2, p0, Lokhttp3/ResponseBody$Companion$asResponseBody$1;->d:Lokhttp3/MediaType;

    .line 2
    .line 3
    iput-wide p3, p0, Lokhttp3/ResponseBody$Companion$asResponseBody$1;->e:J

    .line 4
    .line 5
    iput-object p1, p0, Lokhttp3/ResponseBody$Companion$asResponseBody$1;->f:Lcg/i;

    .line 6
    .line 7
    invoke-direct {p0}, Lokhttp3/ResponseBody;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final contentLength()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lokhttp3/ResponseBody$Companion$asResponseBody$1;->e:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final contentType()Lokhttp3/MediaType;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/ResponseBody$Companion$asResponseBody$1;->d:Lokhttp3/MediaType;

    .line 2
    .line 3
    return-object v0
.end method

.method public final source()Lcg/i;
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/ResponseBody$Companion$asResponseBody$1;->f:Lcg/i;

    .line 2
    .line 3
    return-object v0
.end method
