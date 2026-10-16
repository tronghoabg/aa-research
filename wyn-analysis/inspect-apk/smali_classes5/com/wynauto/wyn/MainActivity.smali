.class public final Lcom/wynauto/wyn/MainActivity;
.super Lio/flutter/embedding/android/FlutterActivity;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0012\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0012\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0001\u0010\r\u001a\u00020\u000eH\u0016J\u0008\u0010\u000f\u001a\u00020\u000cH\u0002J\u0008\u0010\u0010\u001a\u00020\u000cH\u0002J\u0010\u0010\u0011\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0002J0\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0016H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/wynauto/wyn/MainActivity;",
        "Lio/flutter/embedding/android/FlutterActivity;",
        "<init>",
        "()V",
        "CHANNEL",
        "",
        "CAMERA_CONVERTER_CHANNEL",
        "channel",
        "Lio/flutter/plugin/common/MethodChannel;",
        "gnssStatusCallback",
        "Landroid/location/GnssStatus$Callback;",
        "configureFlutterEngine",
        "",
        "flutterEngine",
        "Lio/flutter/embedding/engine/FlutterEngine;",
        "startGnssStatusUpdates",
        "stopGnssStatusUpdates",
        "setupCameraConverterChannel",
        "yuvToJpeg",
        "",
        "nv21",
        "width",
        "",
        "height",
        "quality",
        "rotation",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic j:I


# instance fields
.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public h:Luc/r;

.field public i:Landroid/location/GnssStatus$Callback;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lio/flutter/embedding/android/FlutterActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "wyn.wynauto.com/main_channel"

    .line 5
    .line 6
    iput-object v0, p0, Lcom/wynauto/wyn/MainActivity;->f:Ljava/lang/String;

    .line 7
    .line 8
    const-string v0, "wyn.wynauto.com/camera_converter"

    .line 9
    .line 10
    iput-object v0, p0, Lcom/wynauto/wyn/MainActivity;->g:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method

.method public static B([BIIII)[B
    .locals 8

    .line 1
    new-instance v0, Landroid/graphics/YuvImage;

    .line 2
    .line 3
    const/16 v2, 0x11

    .line 4
    .line 5
    const/4 v5, 0x0

    .line 6
    move-object v1, p0

    .line 7
    move v3, p1

    .line 8
    move v4, p2

    .line 9
    invoke-direct/range {v0 .. v5}, Landroid/graphics/YuvImage;-><init>([BIII[I)V

    .line 10
    .line 11
    .line 12
    new-instance p0, Ljava/io/ByteArrayOutputStream;

    .line 13
    .line 14
    invoke-direct {p0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 15
    .line 16
    .line 17
    new-instance p1, Landroid/graphics/Rect;

    .line 18
    .line 19
    const/4 p2, 0x0

    .line 20
    invoke-direct {p1, p2, p2, v3, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p1, p3, p0}, Landroid/graphics/YuvImage;->compressToJpeg(Landroid/graphics/Rect;ILjava/io/OutputStream;)Z

    .line 24
    .line 25
    .line 26
    const-string p1, "toByteArray(...)"

    .line 27
    .line 28
    if-nez p4, :cond_0

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-object p0

    .line 38
    :cond_0
    invoke-virtual {p0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    array-length v0, p0

    .line 43
    invoke-static {p0, p2, v0}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    new-instance v6, Landroid/graphics/Matrix;

    .line 48
    .line 49
    invoke-direct {v6}, Landroid/graphics/Matrix;-><init>()V

    .line 50
    .line 51
    .line 52
    int-to-float p0, p4

    .line 53
    invoke-virtual {v6, p0}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    const/4 v2, 0x0

    .line 65
    const/4 v3, 0x0

    .line 66
    const/4 v7, 0x1

    .line 67
    invoke-static/range {v1 .. v7}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    const-string p2, "createBitmap(...)"

    .line 72
    .line 73
    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 77
    .line 78
    .line 79
    new-instance p2, Ljava/io/ByteArrayOutputStream;

    .line 80
    .line 81
    invoke-direct {p2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 82
    .line 83
    .line 84
    sget-object p4, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    .line 85
    .line 86
    invoke-virtual {p0, p4, p3, p2}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    return-object p0
.end method


# virtual methods
.method public final b(Llc/b;)V
    .locals 3

    .line 1
    const-string v0, "flutterEngine"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lio/flutter/embedding/android/FlutterActivity;->b(Llc/b;)V

    .line 7
    .line 8
    .line 9
    new-instance v0, Luc/r;

    .line 10
    .line 11
    iget-object p1, p1, Llc/b;->c:Lmc/b;

    .line 12
    .line 13
    iget-object v1, p1, Lmc/b;->f:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, La2/c;

    .line 16
    .line 17
    iget-object v2, p0, Lcom/wynauto/wyn/MainActivity;->f:Ljava/lang/String;

    .line 18
    .line 19
    invoke-direct {v0, v1, v2}, Luc/r;-><init>(Luc/f;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lcom/wynauto/wyn/MainActivity;->h:Luc/r;

    .line 23
    .line 24
    new-instance v0, Luc/r;

    .line 25
    .line 26
    iget-object v1, p0, Lcom/wynauto/wyn/MainActivity;->g:Ljava/lang/String;

    .line 27
    .line 28
    iget-object p1, p1, Lmc/b;->f:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p1, La2/c;

    .line 31
    .line 32
    invoke-direct {v0, p1, v1}, Luc/r;-><init>(Luc/f;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    new-instance p1, LNb/a;

    .line 36
    .line 37
    const/4 v1, 0x1

    .line 38
    invoke-direct {p1, p0, v1}, LNb/a;-><init>(Lcom/wynauto/wyn/MainActivity;I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p1}, Luc/r;->b(Luc/p;)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lcom/wynauto/wyn/MainActivity;->h:Luc/r;

    .line 45
    .line 46
    if-eqz p1, :cond_0

    .line 47
    .line 48
    new-instance v0, LNb/a;

    .line 49
    .line 50
    const/4 v1, 0x0

    .line 51
    invoke-direct {v0, p0, v1}, LNb/a;-><init>(Lcom/wynauto/wyn/MainActivity;I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, v0}, Luc/r;->b(Luc/p;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_0
    const-string p1, "channel"

    .line 59
    .line 60
    invoke-static {p1}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const/4 p1, 0x0

    .line 64
    throw p1
.end method
