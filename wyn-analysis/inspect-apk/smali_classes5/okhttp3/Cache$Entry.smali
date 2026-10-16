.class final Lokhttp3/Cache$Entry;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/Cache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Entry"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/Cache$Entry$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\u0008\u0002\u0018\u00002\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Lokhttp3/Cache$Entry;",
        "",
        "Companion",
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


# static fields
.field public static final k:Ljava/lang/String;

.field public static final l:Ljava/lang/String;


# instance fields
.field public final a:Lokhttp3/HttpUrl;

.field public final b:Lokhttp3/Headers;

.field public final c:Ljava/lang/String;

.field public final d:Lokhttp3/Protocol;

.field public final e:I

.field public final f:Ljava/lang/String;

.field public final g:Lokhttp3/Headers;

.field public final h:Lokhttp3/Handshake;

.field public final i:J

.field public final j:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lokhttp3/Cache$Entry$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lokhttp3/Cache$Entry$Companion;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, Lokhttp3/internal/platform/Platform;->a:Lokhttp3/internal/platform/Platform$Companion;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    sget-object v0, Lokhttp3/internal/platform/Platform;->b:Lokhttp3/internal/platform/Platform;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const-string v0, "OkHttp"

    .line 18
    .line 19
    const-string v1, "-Sent-Millis"

    .line 20
    .line 21
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    sput-object v1, Lokhttp3/Cache$Entry;->k:Ljava/lang/String;

    .line 26
    .line 27
    sget-object v1, Lokhttp3/internal/platform/Platform;->b:Lokhttp3/internal/platform/Platform;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    const-string v1, "-Received-Millis"

    .line 33
    .line 34
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, Lokhttp3/Cache$Entry;->l:Ljava/lang/String;

    .line 39
    .line 40
    return-void
.end method

.method public constructor <init>(Lcg/H;)V
    .locals 11

    const-string v0, "rawSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    move-object v0, p1

    check-cast v0, Ljava/io/Closeable;

    :try_start_0
    move-object v1, v0

    check-cast v1, Lcg/H;

    .line 3
    invoke-static {p1}, Lcg/b;->d(Lcg/H;)Lcg/B;

    move-result-object p1

    const-wide v1, 0x7fffffffffffffffL

    .line 4
    invoke-virtual {p1, v1, v2}, Lcg/B;->readUtf8LineStrict(J)Ljava/lang/String;

    move-result-object v3

    .line 5
    sget-object v4, Lokhttp3/HttpUrl;->k:Lokhttp3/HttpUrl$Companion;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v4, 0x0

    .line 6
    :try_start_1
    invoke-static {v3}, Lokhttp3/HttpUrl$Companion;->c(Ljava/lang/String;)Lokhttp3/HttpUrl;

    move-result-object v5
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-object v5, v4

    :goto_0
    if-eqz v5, :cond_7

    .line 7
    :try_start_2
    iput-object v5, p0, Lokhttp3/Cache$Entry;->a:Lokhttp3/HttpUrl;

    .line 8
    invoke-virtual {p1, v1, v2}, Lcg/B;->readUtf8LineStrict(J)Ljava/lang/String;

    move-result-object v3

    .line 9
    iput-object v3, p0, Lokhttp3/Cache$Entry;->c:Ljava/lang/String;

    .line 10
    new-instance v3, Lokhttp3/Headers$Builder;

    invoke-direct {v3}, Lokhttp3/Headers$Builder;-><init>()V

    .line 11
    sget-object v5, Lokhttp3/Cache;->b:Lokhttp3/Cache$Companion;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lokhttp3/Cache$Companion;->b(Lcg/B;)I

    move-result v5

    const/4 v6, 0x0

    move v7, v6

    :goto_1
    if-ge v7, v5, :cond_0

    add-int/lit8 v7, v7, 0x1

    .line 12
    invoke-virtual {p1, v1, v2}, Lcg/B;->readUtf8LineStrict(J)Ljava/lang/String;

    move-result-object v8

    .line 13
    invoke-virtual {v3, v8}, Lokhttp3/Headers$Builder;->b(Ljava/lang/String;)V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto/16 :goto_7

    .line 14
    :cond_0
    invoke-virtual {v3}, Lokhttp3/Headers$Builder;->d()Lokhttp3/Headers;

    move-result-object v3

    iput-object v3, p0, Lokhttp3/Cache$Entry;->b:Lokhttp3/Headers;

    .line 15
    sget-object v3, Lokhttp3/internal/http/StatusLine;->d:Lokhttp3/internal/http/StatusLine$Companion;

    .line 16
    invoke-virtual {p1, v1, v2}, Lcg/B;->readUtf8LineStrict(J)Ljava/lang/String;

    move-result-object v5

    .line 17
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5}, Lokhttp3/internal/http/StatusLine$Companion;->a(Ljava/lang/String;)Lokhttp3/internal/http/StatusLine;

    move-result-object v3

    .line 18
    iget-object v5, v3, Lokhttp3/internal/http/StatusLine;->a:Lokhttp3/Protocol;

    iput-object v5, p0, Lokhttp3/Cache$Entry;->d:Lokhttp3/Protocol;

    .line 19
    iget v5, v3, Lokhttp3/internal/http/StatusLine;->b:I

    iput v5, p0, Lokhttp3/Cache$Entry;->e:I

    .line 20
    iget-object v3, v3, Lokhttp3/internal/http/StatusLine;->c:Ljava/lang/String;

    iput-object v3, p0, Lokhttp3/Cache$Entry;->f:Ljava/lang/String;

    .line 21
    new-instance v3, Lokhttp3/Headers$Builder;

    invoke-direct {v3}, Lokhttp3/Headers$Builder;-><init>()V

    .line 22
    sget-object v5, Lokhttp3/Cache;->b:Lokhttp3/Cache$Companion;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lokhttp3/Cache$Companion;->b(Lcg/B;)I

    move-result v5

    :goto_2
    if-ge v6, v5, :cond_1

    add-int/lit8 v6, v6, 0x1

    .line 23
    invoke-virtual {p1, v1, v2}, Lcg/B;->readUtf8LineStrict(J)Ljava/lang/String;

    move-result-object v7

    .line 24
    invoke-virtual {v3, v7}, Lokhttp3/Headers$Builder;->b(Ljava/lang/String;)V

    goto :goto_2

    .line 25
    :cond_1
    sget-object v5, Lokhttp3/Cache$Entry;->k:Ljava/lang/String;

    invoke-virtual {v3, v5}, Lokhttp3/Headers$Builder;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 26
    sget-object v7, Lokhttp3/Cache$Entry;->l:Ljava/lang/String;

    invoke-virtual {v3, v7}, Lokhttp3/Headers$Builder;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 27
    invoke-virtual {v3, v5}, Lokhttp3/Headers$Builder;->f(Ljava/lang/String;)V

    .line 28
    invoke-virtual {v3, v7}, Lokhttp3/Headers$Builder;->f(Ljava/lang/String;)V

    const-wide/16 v9, 0x0

    if-nez v6, :cond_2

    move-wide v5, v9

    goto :goto_3

    .line 29
    :cond_2
    invoke-static {v6}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v5

    :goto_3
    iput-wide v5, p0, Lokhttp3/Cache$Entry;->i:J

    if-nez v8, :cond_3

    goto :goto_4

    .line 30
    :cond_3
    invoke-static {v8}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v9

    :goto_4
    iput-wide v9, p0, Lokhttp3/Cache$Entry;->j:J

    .line 31
    invoke-virtual {v3}, Lokhttp3/Headers$Builder;->d()Lokhttp3/Headers;

    move-result-object v3

    iput-object v3, p0, Lokhttp3/Cache$Entry;->g:Lokhttp3/Headers;

    .line 32
    iget-object v3, p0, Lokhttp3/Cache$Entry;->a:Lokhttp3/HttpUrl;

    iget-object v3, v3, Lokhttp3/HttpUrl;->a:Ljava/lang/String;

    .line 33
    const-string v5, "https"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 34
    invoke-virtual {p1, v1, v2}, Lcg/B;->readUtf8LineStrict(J)Ljava/lang/String;

    move-result-object v3

    .line 35
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-gtz v4, :cond_5

    .line 36
    invoke-virtual {p1, v1, v2}, Lcg/B;->readUtf8LineStrict(J)Ljava/lang/String;

    move-result-object v3

    .line 37
    sget-object v4, Lokhttp3/CipherSuite;->b:Lokhttp3/CipherSuite$Companion;

    invoke-virtual {v4, v3}, Lokhttp3/CipherSuite$Companion;->b(Ljava/lang/String;)Lokhttp3/CipherSuite;

    move-result-object v3

    .line 38
    invoke-static {p1}, Lokhttp3/Cache$Entry;->a(Lcg/B;)Ljava/util/List;

    move-result-object v4

    .line 39
    invoke-static {p1}, Lokhttp3/Cache$Entry;->a(Lcg/B;)Ljava/util/List;

    move-result-object v5

    .line 40
    invoke-virtual {p1}, Lcg/B;->exhausted()Z

    move-result v6

    if-nez v6, :cond_4

    .line 41
    sget-object v6, Lokhttp3/TlsVersion;->b:Lokhttp3/TlsVersion$Companion;

    .line 42
    invoke-virtual {p1, v1, v2}, Lcg/B;->readUtf8LineStrict(J)Ljava/lang/String;

    move-result-object p1

    .line 43
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lokhttp3/TlsVersion$Companion;->a(Ljava/lang/String;)Lokhttp3/TlsVersion;

    move-result-object p1

    goto :goto_5

    .line 44
    :cond_4
    sget-object p1, Lokhttp3/TlsVersion;->g:Lokhttp3/TlsVersion;

    .line 45
    :goto_5
    sget-object v1, Lokhttp3/Handshake;->e:Lokhttp3/Handshake$Companion;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    invoke-static {v4}, Lokhttp3/internal/Util;->x(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    .line 47
    new-instance v2, Lokhttp3/Handshake;

    invoke-static {v5}, Lokhttp3/internal/Util;->x(Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    new-instance v5, Lokhttp3/Handshake$Companion$get$1;

    invoke-direct {v5, v1}, Lokhttp3/Handshake$Companion$get$1;-><init>(Ljava/util/List;)V

    invoke-direct {v2, p1, v3, v4, v5}, Lokhttp3/Handshake;-><init>(Lokhttp3/TlsVersion;Lokhttp3/CipherSuite;Ljava/util/List;Ltf/a;)V

    .line 48
    iput-object v2, p0, Lokhttp3/Cache$Entry;->h:Lokhttp3/Handshake;

    goto :goto_6

    .line 49
    :cond_5
    new-instance p1, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "expected \"\" but was \""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x22

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 50
    :cond_6
    iput-object v4, p0, Lokhttp3/Cache$Entry;->h:Lokhttp3/Handshake;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 51
    :goto_6
    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    return-void

    .line 52
    :cond_7
    :try_start_3
    new-instance p1, Ljava/io/IOException;

    const-string v1, "Cache corruption for "

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 53
    sget-object v1, Lokhttp3/internal/platform/Platform;->a:Lokhttp3/internal/platform/Platform$Companion;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    sget-object v1, Lokhttp3/internal/platform/Platform;->b:Lokhttp3/internal/platform/Platform;

    .line 55
    const-string v2, "cache corruption"

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x5

    invoke-static {v2, v1, p1}, Lokhttp3/internal/platform/Platform;->i(Ljava/lang/String;ILjava/lang/Throwable;)V

    .line 56
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 57
    :goto_7
    :try_start_4
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception v1

    invoke-static {v0, p1}, LBa/c;->n(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public constructor <init>(Lokhttp3/Response;)V
    .locals 10

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    iget-object v0, p1, Lokhttp3/Response;->a:Lokhttp3/Request;

    iget-object v1, v0, Lokhttp3/Request;->a:Lokhttp3/HttpUrl;

    .line 60
    iput-object v1, p0, Lokhttp3/Cache$Entry;->a:Lokhttp3/HttpUrl;

    .line 61
    sget-object v1, Lokhttp3/Cache;->b:Lokhttp3/Cache$Companion;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    iget-object v1, p1, Lokhttp3/Response;->h:Lokhttp3/Response;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 63
    iget-object v1, v1, Lokhttp3/Response;->a:Lokhttp3/Request;

    iget-object v1, v1, Lokhttp3/Request;->c:Lokhttp3/Headers;

    .line 64
    iget-object v2, p1, Lokhttp3/Response;->f:Lokhttp3/Headers;

    invoke-static {v2}, Lokhttp3/Cache$Companion;->c(Lokhttp3/Headers;)Ljava/util/Set;

    move-result-object v3

    .line 65
    invoke-interface {v3}, Ljava/util/Set;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_0

    sget-object v1, Lokhttp3/internal/Util;->b:Lokhttp3/Headers;

    goto :goto_1

    .line 66
    :cond_0
    new-instance v4, Lokhttp3/Headers$Builder;

    invoke-direct {v4}, Lokhttp3/Headers$Builder;-><init>()V

    .line 67
    invoke-virtual {v1}, Lokhttp3/Headers;->size()I

    move-result v5

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_2

    add-int/lit8 v7, v6, 0x1

    .line 68
    invoke-virtual {v1, v6}, Lokhttp3/Headers;->c(I)Ljava/lang/String;

    move-result-object v8

    .line 69
    invoke-interface {v3, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    .line 70
    invoke-virtual {v1, v6}, Lokhttp3/Headers;->f(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v8, v6}, Lokhttp3/Headers$Builder;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    move v6, v7

    goto :goto_0

    .line 71
    :cond_2
    invoke-virtual {v4}, Lokhttp3/Headers$Builder;->d()Lokhttp3/Headers;

    move-result-object v1

    .line 72
    :goto_1
    iput-object v1, p0, Lokhttp3/Cache$Entry;->b:Lokhttp3/Headers;

    .line 73
    iget-object v0, v0, Lokhttp3/Request;->b:Ljava/lang/String;

    iput-object v0, p0, Lokhttp3/Cache$Entry;->c:Ljava/lang/String;

    .line 74
    iget-object v0, p1, Lokhttp3/Response;->b:Lokhttp3/Protocol;

    iput-object v0, p0, Lokhttp3/Cache$Entry;->d:Lokhttp3/Protocol;

    .line 75
    iget v0, p1, Lokhttp3/Response;->d:I

    iput v0, p0, Lokhttp3/Cache$Entry;->e:I

    .line 76
    iget-object v0, p1, Lokhttp3/Response;->c:Ljava/lang/String;

    iput-object v0, p0, Lokhttp3/Cache$Entry;->f:Ljava/lang/String;

    .line 77
    iput-object v2, p0, Lokhttp3/Cache$Entry;->g:Lokhttp3/Headers;

    .line 78
    iget-object v0, p1, Lokhttp3/Response;->e:Lokhttp3/Handshake;

    iput-object v0, p0, Lokhttp3/Cache$Entry;->h:Lokhttp3/Handshake;

    .line 79
    iget-wide v0, p1, Lokhttp3/Response;->k:J

    iput-wide v0, p0, Lokhttp3/Cache$Entry;->i:J

    .line 80
    iget-wide v0, p1, Lokhttp3/Response;->l:J

    iput-wide v0, p0, Lokhttp3/Cache$Entry;->j:J

    return-void
.end method

.method public static a(Lcg/B;)Ljava/util/List;
    .locals 7

    .line 1
    sget-object v0, Lokhttp3/Cache;->b:Lokhttp3/Cache$Companion;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lokhttp3/Cache$Companion;->b(Lcg/B;)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, -0x1

    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    sget-object p0, Lff/v;->a:Lff/v;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    :try_start_0
    const-string v1, "X.509"

    .line 17
    .line 18
    invoke-static {v1}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    new-instance v2, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 25
    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    :goto_0
    if-ge v3, v0, :cond_1

    .line 29
    .line 30
    add-int/lit8 v3, v3, 0x1

    .line 31
    .line 32
    const-wide v4, 0x7fffffffffffffffL

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v4, v5}, Lcg/B;->readUtf8LineStrict(J)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    new-instance v5, Lcg/g;

    .line 42
    .line 43
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 44
    .line 45
    .line 46
    sget-object v6, Lcg/j;->d:Lcg/j;

    .line 47
    .line 48
    invoke-static {v4}, Lab/b;->a(Ljava/lang/String;)Lcg/j;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-static {v4}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v5, v4}, Lcg/g;->Q(Lcg/j;)V

    .line 56
    .line 57
    .line 58
    new-instance v4, LCd/t;

    .line 59
    .line 60
    const/4 v6, 0x2

    .line 61
    invoke-direct {v4, v5, v6}, LCd/t;-><init>(Ljava/lang/Object;I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1, v4}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    return-object v2

    .line 73
    :catch_0
    move-exception p0

    .line 74
    new-instance v0, Ljava/io/IOException;

    .line 75
    .line 76
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw v0
.end method

.method public static b(Lcg/A;Ljava/util/List;)V
    .locals 3

    .line 1
    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-long v0, v0

    .line 6
    invoke-virtual {p0, v0, v1}, Lcg/A;->writeDecimalLong(J)Lcg/h;

    .line 7
    .line 8
    .line 9
    const/16 v0, 0xa

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lcg/A;->writeByte(I)Lcg/h;

    .line 12
    .line 13
    .line 14
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Ljava/security/cert/Certificate;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/security/cert/Certificate;->getEncoded()[B

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    sget-object v2, Lcg/j;->d:Lcg/j;

    .line 35
    .line 36
    const-string v2, "bytes"

    .line 37
    .line 38
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-static {v1}, Lab/b;->g([B)Lcg/j;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v1}, Lcg/j;->a()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {p0, v1}, Lcg/A;->writeUtf8(Ljava/lang/String;)Lcg/h;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, v0}, Lcg/A;->writeByte(I)Lcg/h;
    :try_end_0
    .catch Ljava/security/cert/CertificateEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    return-void

    .line 57
    :catch_0
    move-exception p0

    .line 58
    new-instance p1, Ljava/io/IOException;

    .line 59
    .line 60
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw p1
.end method


# virtual methods
.method public final c(Lokhttp3/internal/cache/DiskLruCache$Editor;)V
    .locals 11

    .line 1
    iget-object v0, p0, Lokhttp3/Cache$Entry;->a:Lokhttp3/HttpUrl;

    .line 2
    .line 3
    iget-object v1, p0, Lokhttp3/Cache$Entry;->h:Lokhttp3/Handshake;

    .line 4
    .line 5
    iget-object v2, p0, Lokhttp3/Cache$Entry;->g:Lokhttp3/Headers;

    .line 6
    .line 7
    iget-object v3, p0, Lokhttp3/Cache$Entry;->b:Lokhttp3/Headers;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-virtual {p1, v4}, Lokhttp3/internal/cache/DiskLruCache$Editor;->d(I)Lcg/F;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p1}, Lcg/b;->c(Lcg/F;)Lcg/A;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    :try_start_0
    iget-object v5, v0, Lokhttp3/HttpUrl;->i:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {p1, v5}, Lcg/A;->writeUtf8(Ljava/lang/String;)Lcg/h;

    .line 21
    .line 22
    .line 23
    const/16 v5, 0xa

    .line 24
    .line 25
    invoke-virtual {p1, v5}, Lcg/A;->writeByte(I)Lcg/h;

    .line 26
    .line 27
    .line 28
    iget-object v6, p0, Lokhttp3/Cache$Entry;->c:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {p1, v6}, Lcg/A;->writeUtf8(Ljava/lang/String;)Lcg/h;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, v5}, Lcg/A;->writeByte(I)Lcg/h;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3}, Lokhttp3/Headers;->size()I

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    int-to-long v6, v6

    .line 41
    invoke-virtual {p1, v6, v7}, Lcg/A;->writeDecimalLong(J)Lcg/h;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v5}, Lcg/A;->writeByte(I)Lcg/h;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v3}, Lokhttp3/Headers;->size()I

    .line 48
    .line 49
    .line 50
    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    move v7, v4

    .line 52
    :goto_0
    const-string v8, ": "

    .line 53
    .line 54
    if-ge v7, v6, :cond_0

    .line 55
    .line 56
    add-int/lit8 v9, v7, 0x1

    .line 57
    .line 58
    :try_start_1
    invoke-virtual {v3, v7}, Lokhttp3/Headers;->c(I)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v10

    .line 62
    invoke-virtual {p1, v10}, Lcg/A;->writeUtf8(Ljava/lang/String;)Lcg/h;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v8}, Lcg/A;->writeUtf8(Ljava/lang/String;)Lcg/h;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v3, v7}, Lokhttp3/Headers;->f(I)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v7

    .line 72
    invoke-interface {p1, v7}, Lcg/h;->writeUtf8(Ljava/lang/String;)Lcg/h;

    .line 73
    .line 74
    .line 75
    invoke-interface {p1, v5}, Lcg/h;->writeByte(I)Lcg/h;

    .line 76
    .line 77
    .line 78
    move v7, v9

    .line 79
    goto :goto_0

    .line 80
    :catchall_0
    move-exception v0

    .line 81
    goto/16 :goto_2

    .line 82
    .line 83
    :cond_0
    new-instance v3, Lokhttp3/internal/http/StatusLine;

    .line 84
    .line 85
    iget-object v6, p0, Lokhttp3/Cache$Entry;->d:Lokhttp3/Protocol;

    .line 86
    .line 87
    iget v7, p0, Lokhttp3/Cache$Entry;->e:I

    .line 88
    .line 89
    iget-object v9, p0, Lokhttp3/Cache$Entry;->f:Ljava/lang/String;

    .line 90
    .line 91
    invoke-direct {v3, v6, v7, v9}, Lokhttp3/internal/http/StatusLine;-><init>(Lokhttp3/Protocol;ILjava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v3}, Lokhttp3/internal/http/StatusLine;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    invoke-virtual {p1, v3}, Lcg/A;->writeUtf8(Ljava/lang/String;)Lcg/h;

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1, v5}, Lcg/A;->writeByte(I)Lcg/h;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2}, Lokhttp3/Headers;->size()I

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    add-int/lit8 v3, v3, 0x2

    .line 109
    .line 110
    int-to-long v6, v3

    .line 111
    invoke-virtual {p1, v6, v7}, Lcg/A;->writeDecimalLong(J)Lcg/h;

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1, v5}, Lcg/A;->writeByte(I)Lcg/h;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2}, Lokhttp3/Headers;->size()I

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    :goto_1
    if-ge v4, v3, :cond_1

    .line 122
    .line 123
    add-int/lit8 v6, v4, 0x1

    .line 124
    .line 125
    invoke-virtual {v2, v4}, Lokhttp3/Headers;->c(I)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v7

    .line 129
    invoke-virtual {p1, v7}, Lcg/A;->writeUtf8(Ljava/lang/String;)Lcg/h;

    .line 130
    .line 131
    .line 132
    invoke-virtual {p1, v8}, Lcg/A;->writeUtf8(Ljava/lang/String;)Lcg/h;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v2, v4}, Lokhttp3/Headers;->f(I)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    invoke-interface {p1, v4}, Lcg/h;->writeUtf8(Ljava/lang/String;)Lcg/h;

    .line 140
    .line 141
    .line 142
    invoke-interface {p1, v5}, Lcg/h;->writeByte(I)Lcg/h;

    .line 143
    .line 144
    .line 145
    move v4, v6

    .line 146
    goto :goto_1

    .line 147
    :cond_1
    sget-object v2, Lokhttp3/Cache$Entry;->k:Ljava/lang/String;

    .line 148
    .line 149
    invoke-virtual {p1, v2}, Lcg/A;->writeUtf8(Ljava/lang/String;)Lcg/h;

    .line 150
    .line 151
    .line 152
    invoke-virtual {p1, v8}, Lcg/A;->writeUtf8(Ljava/lang/String;)Lcg/h;

    .line 153
    .line 154
    .line 155
    iget-wide v2, p0, Lokhttp3/Cache$Entry;->i:J

    .line 156
    .line 157
    invoke-interface {p1, v2, v3}, Lcg/h;->writeDecimalLong(J)Lcg/h;

    .line 158
    .line 159
    .line 160
    invoke-interface {p1, v5}, Lcg/h;->writeByte(I)Lcg/h;

    .line 161
    .line 162
    .line 163
    sget-object v2, Lokhttp3/Cache$Entry;->l:Ljava/lang/String;

    .line 164
    .line 165
    invoke-virtual {p1, v2}, Lcg/A;->writeUtf8(Ljava/lang/String;)Lcg/h;

    .line 166
    .line 167
    .line 168
    invoke-virtual {p1, v8}, Lcg/A;->writeUtf8(Ljava/lang/String;)Lcg/h;

    .line 169
    .line 170
    .line 171
    iget-wide v2, p0, Lokhttp3/Cache$Entry;->j:J

    .line 172
    .line 173
    invoke-interface {p1, v2, v3}, Lcg/h;->writeDecimalLong(J)Lcg/h;

    .line 174
    .line 175
    .line 176
    invoke-interface {p1, v5}, Lcg/h;->writeByte(I)Lcg/h;

    .line 177
    .line 178
    .line 179
    iget-object v0, v0, Lokhttp3/HttpUrl;->a:Ljava/lang/String;

    .line 180
    .line 181
    const-string v2, "https"

    .line 182
    .line 183
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v0

    .line 187
    if-eqz v0, :cond_2

    .line 188
    .line 189
    invoke-virtual {p1, v5}, Lcg/A;->writeByte(I)Lcg/h;

    .line 190
    .line 191
    .line 192
    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    iget-object v0, v1, Lokhttp3/Handshake;->b:Lokhttp3/CipherSuite;

    .line 196
    .line 197
    iget-object v0, v0, Lokhttp3/CipherSuite;->a:Ljava/lang/String;

    .line 198
    .line 199
    invoke-virtual {p1, v0}, Lcg/A;->writeUtf8(Ljava/lang/String;)Lcg/h;

    .line 200
    .line 201
    .line 202
    invoke-virtual {p1, v5}, Lcg/A;->writeByte(I)Lcg/h;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v1}, Lokhttp3/Handshake;->a()Ljava/util/List;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-static {p1, v0}, Lokhttp3/Cache$Entry;->b(Lcg/A;Ljava/util/List;)V

    .line 210
    .line 211
    .line 212
    iget-object v0, v1, Lokhttp3/Handshake;->c:Ljava/util/List;

    .line 213
    .line 214
    invoke-static {p1, v0}, Lokhttp3/Cache$Entry;->b(Lcg/A;Ljava/util/List;)V

    .line 215
    .line 216
    .line 217
    iget-object v0, v1, Lokhttp3/Handshake;->a:Lokhttp3/TlsVersion;

    .line 218
    .line 219
    iget-object v0, v0, Lokhttp3/TlsVersion;->a:Ljava/lang/String;

    .line 220
    .line 221
    invoke-virtual {p1, v0}, Lcg/A;->writeUtf8(Ljava/lang/String;)Lcg/h;

    .line 222
    .line 223
    .line 224
    invoke-virtual {p1, v5}, Lcg/A;->writeByte(I)Lcg/h;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 225
    .line 226
    .line 227
    :cond_2
    invoke-virtual {p1}, Lcg/A;->close()V

    .line 228
    .line 229
    .line 230
    return-void

    .line 231
    :goto_2
    :try_start_2
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 232
    :catchall_1
    move-exception v1

    .line 233
    invoke-static {p1, v0}, LBa/c;->n(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 234
    .line 235
    .line 236
    throw v1
.end method
