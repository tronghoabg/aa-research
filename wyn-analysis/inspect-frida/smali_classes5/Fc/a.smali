.class public final LFc/a;
.super Lzc/a;
.source "SourceFile"


# instance fields
.field public b:Landroid/util/Size;

.field public c:Lu0/w0;

.field public d:Landroid/hardware/camera2/params/MeteringRectangle;

.field public final e:LJc/b;


# direct methods
.method public constructor <init>(Lt6/q;LJc/b;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lzc/a;-><init>(Lt6/q;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, LFc/a;->e:LJc/b;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Landroid/hardware/camera2/CaptureRequest$Builder;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lzc/a;->a:Lt6/q;

    .line 2
    .line 3
    iget-object v0, v0, Lt6/q;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Landroid/hardware/camera2/CameraCharacteristics;

    .line 6
    .line 7
    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_MAX_REGIONS_AF:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/Integer;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-lez v0, :cond_1

    .line 22
    .line 23
    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_REGIONS:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 24
    .line 25
    iget-object v1, p0, LFc/a;->d:Landroid/hardware/camera2/params/MeteringRectangle;

    .line 26
    .line 27
    if-nez v1, :cond_0

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v2, 0x1

    .line 32
    new-array v2, v2, [Landroid/hardware/camera2/params/MeteringRectangle;

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    aput-object v1, v2, v3

    .line 36
    .line 37
    move-object v1, v2

    .line 38
    :goto_0
    invoke-virtual {p1, v0, v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    return-void
.end method

.method public final b()V
    .locals 6

    .line 1
    iget-object v0, p0, LFc/a;->b:Landroid/util/Size;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-object v1, p0, LFc/a;->c:Lu0/w0;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, LFc/a;->d:Landroid/hardware/camera2/params/MeteringRectangle;

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v2, p0, LFc/a;->e:LJc/b;

    .line 14
    .line 15
    iget v3, v2, LJc/b;->d:I

    .line 16
    .line 17
    if-nez v3, :cond_1

    .line 18
    .line 19
    iget-object v2, v2, LJc/b;->c:LJc/a;

    .line 20
    .line 21
    iget v3, v2, LJc/a;->e:I

    .line 22
    .line 23
    :cond_1
    move v5, v3

    .line 24
    iget-object v1, v1, Lu0/w0;->a:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Ljava/lang/Double;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 29
    .line 30
    .line 31
    move-result-wide v1

    .line 32
    iget-object v3, p0, LFc/a;->c:Lu0/w0;

    .line 33
    .line 34
    iget-object v3, v3, Lu0/w0;->b:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v3, Ljava/lang/Double;

    .line 37
    .line 38
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    .line 39
    .line 40
    .line 41
    move-result-wide v3

    .line 42
    invoke-static/range {v0 .. v5}, LA6/h;->n(Landroid/util/Size;DDI)Landroid/hardware/camera2/params/MeteringRectangle;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, LFc/a;->d:Landroid/hardware/camera2/params/MeteringRectangle;

    .line 47
    .line 48
    return-void

    .line 49
    :cond_2
    new-instance v0, Ljava/lang/AssertionError;

    .line 50
    .line 51
    const-string v1, "The cameraBoundaries should be set (using `FocusPointFeature.setCameraBoundaries(Size)`) before updating the focus point."

    .line 52
    .line 53
    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    throw v0
.end method
