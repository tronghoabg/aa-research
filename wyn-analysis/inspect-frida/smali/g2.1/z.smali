.class public final Lg2/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final g:Ljava/nio/charset/Charset;


# instance fields
.field public final a:LY2/B;

.field public final b:Lo2/m;

.field public final c:Ljava/util/Map;

.field public d:Lg2/y;

.field public e:Ljava/net/Socket;

.field public volatile f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 2
    .line 3
    sput-object v0, Lg2/z;->g:Ljava/nio/charset/Charset;

    .line 4
    .line 5
    return-void
.end method

.method public constructor <init>(LY2/B;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg2/z;->a:LY2/B;

    .line 5
    .line 6
    new-instance p1, Lo2/m;

    .line 7
    .line 8
    const-string v0, "ExoPlayer:RtspMessageChannel:ReceiverLoader"

    .line 9
    .line 10
    invoke-direct {p1, v0}, Lo2/m;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lg2/z;->b:Lo2/m;

    .line 14
    .line 15
    invoke-static {}, LVa/M6;->v()Ljava/util/Map;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Lg2/z;->c:Ljava/util/Map;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final a(Ljava/net/Socket;)V
    .locals 3

    .line 1
    iput-object p1, p0, Lg2/z;->e:Ljava/net/Socket;

    .line 2
    .line 3
    new-instance v0, Lg2/y;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, p0, v1}, Lg2/y;-><init>(Lg2/z;Ljava/io/OutputStream;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lg2/z;->d:Lg2/y;

    .line 13
    .line 14
    new-instance v0, Lg2/x;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-direct {v0, p0, p1}, Lg2/x;-><init>(Lg2/z;Ljava/io/InputStream;)V

    .line 21
    .line 22
    .line 23
    new-instance p1, La2/v;

    .line 24
    .line 25
    const/16 v1, 0x9

    .line 26
    .line 27
    invoke-direct {p1, p0, v1}, La2/v;-><init>(Ljava/lang/Object;I)V

    .line 28
    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    iget-object v2, p0, Lg2/z;->b:Lo2/m;

    .line 32
    .line 33
    invoke-virtual {v2, v0, p1, v1}, Lo2/m;->f(Lo2/j;Lo2/h;I)J

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final b(Ll8/e0;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lg2/z;->d:Lg2/y;

    .line 2
    .line 3
    invoke-static {v0}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lg2/z;->d:Lg2/y;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance v1, LB8/e;

    .line 12
    .line 13
    sget-object v2, Lg2/A;->h:Ljava/lang/String;

    .line 14
    .line 15
    invoke-direct {v1, v2}, LB8/e;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, p1}, LB8/e;->e(Ljava/lang/Iterable;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    sget-object v2, Lg2/z;->g:Ljava/nio/charset/Charset;

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iget-object v2, v0, Lg2/y;->c:Landroid/os/Handler;

    .line 29
    .line 30
    new-instance v3, Lcom/applovin/impl/sdk/nativeAd/e;

    .line 31
    .line 32
    invoke-direct {v3, v0, v1, p1}, Lcom/applovin/impl/sdk/nativeAd/e;-><init>(Lg2/y;[BLl8/e0;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final close()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lg2/z;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    :try_start_0
    iget-object v1, p0, Lg2/z;->d:Lg2/y;

    .line 8
    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {v1}, Lg2/y;->close()V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception v1

    .line 16
    goto :goto_1

    .line 17
    :cond_1
    :goto_0
    iget-object v1, p0, Lg2/z;->b:Lo2/m;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v1, v2}, Lo2/m;->e(Lo2/k;)V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lg2/z;->e:Ljava/net/Socket;

    .line 24
    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/net/Socket;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    .line 30
    :cond_2
    iput-boolean v0, p0, Lg2/z;->f:Z

    .line 31
    .line 32
    return-void

    .line 33
    :goto_1
    iput-boolean v0, p0, Lg2/z;->f:Z

    .line 34
    .line 35
    throw v1
.end method
