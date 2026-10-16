.class public final Landroidx/media3/exoplayer/rtsp/RtspMediaSource$Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk2/G;


# instance fields
.field public final a:Ljavax/net/SocketFactory;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Ljavax/net/SocketFactory;->getDefault()Ljavax/net/SocketFactory;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Landroidx/media3/exoplayer/rtsp/RtspMediaSource$Factory;->a:Ljavax/net/SocketFactory;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Lwa/a;)Lk2/G;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final b(Z)Lk2/G;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final c(LN1/w;)Lk2/a;
    .locals 3

    .line 1
    iget-object v0, p1, LN1/w;->b:LN1/t;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v0, Lg2/v;

    .line 7
    .line 8
    new-instance v1, Lad/I;

    .line 9
    .line 10
    const/4 v2, 0x6

    .line 11
    invoke-direct {v1, v2}, Lad/I;-><init>(I)V

    .line 12
    .line 13
    .line 14
    iget-object v2, p0, Landroidx/media3/exoplayer/rtsp/RtspMediaSource$Factory;->a:Ljavax/net/SocketFactory;

    .line 15
    .line 16
    invoke-direct {v0, p1, v1, v2}, Lg2/v;-><init>(LN1/w;Lad/I;Ljavax/net/SocketFactory;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method
