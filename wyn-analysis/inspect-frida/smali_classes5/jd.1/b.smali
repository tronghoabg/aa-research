.class public final Ljd/b;
.super Lhd/o;
.source "SourceFile"

# interfaces
.implements Lio/flutter/view/q;


# instance fields
.field public e:Z


# virtual methods
.method public final a(LU1/m;Lio/flutter/view/TextureRegistry$SurfaceProducer;)Lhd/a;
    .locals 2

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-interface {p2}, Lio/flutter/view/TextureRegistry$SurfaceProducer;->handlesCropAndRotation()Z

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    new-instance v0, Ljd/a;

    .line 8
    .line 9
    iget-object v1, p0, Lhd/o;->a:Lad/L;

    .line 10
    .line 11
    invoke-direct {v0, p1, v1}, Lhd/a;-><init>(LU1/m;Lad/L;)V

    .line 12
    .line 13
    .line 14
    iput-boolean p2, v0, Ljd/a;->e:Z

    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 18
    .line 19
    const-string p2, "surfaceProducer cannot be null to create an ExoPlayerEventListener for TextureVideoPlayer."

    .line 20
    .line 21
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw p1
.end method

.method public final b()V
    .locals 1

    .line 1
    invoke-super {p0}, Lhd/o;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lhd/o;->b:Lio/flutter/view/TextureRegistry$SurfaceProducer;

    .line 5
    .line 6
    invoke-interface {v0}, Lio/flutter/view/TextureRegistry$SurfaceProducer;->release()V

    .line 7
    .line 8
    .line 9
    return-void
.end method
