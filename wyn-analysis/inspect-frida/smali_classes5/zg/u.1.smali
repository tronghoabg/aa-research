.class public final Lzg/u;
.super Lokhttp3/ResponseBody;
.source "SourceFile"


# instance fields
.field public final d:Lokhttp3/ResponseBody;

.field public final e:Lcg/B;

.field public f:Ljava/io/IOException;


# direct methods
.method public constructor <init>(Lokhttp3/ResponseBody;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lokhttp3/ResponseBody;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lzg/u;->d:Lokhttp3/ResponseBody;

    .line 5
    .line 6
    new-instance v0, LZ3/b;

    .line 7
    .line 8
    invoke-virtual {p1}, Lokhttp3/ResponseBody;->source()Lcg/i;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Lcg/i;

    .line 13
    .line 14
    invoke-direct {v0, p0, p1}, LZ3/b;-><init>(Lzg/u;Lcg/i;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lcg/b;->d(Lcg/H;)Lcg/B;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Lzg/u;->e:Lcg/B;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lzg/u;->d:Lokhttp3/ResponseBody;

    .line 2
    .line 3
    invoke-virtual {v0}, Lokhttp3/ResponseBody;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final contentLength()J
    .locals 2

    .line 1
    iget-object v0, p0, Lzg/u;->d:Lokhttp3/ResponseBody;

    .line 2
    .line 3
    invoke-virtual {v0}, Lokhttp3/ResponseBody;->contentLength()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final contentType()Lokhttp3/MediaType;
    .locals 1

    .line 1
    iget-object v0, p0, Lzg/u;->d:Lokhttp3/ResponseBody;

    .line 2
    .line 3
    invoke-virtual {v0}, Lokhttp3/ResponseBody;->contentType()Lokhttp3/MediaType;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final source()Lcg/i;
    .locals 1

    .line 1
    iget-object v0, p0, Lzg/u;->e:Lcg/B;

    .line 2
    .line 3
    return-object v0
.end method
