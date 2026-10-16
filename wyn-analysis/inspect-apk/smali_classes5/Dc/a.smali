.class public final LDc/a;
.super Lzc/a;
.source "SourceFile"


# instance fields
.field public b:Landroid/util/Size;

.field public c:Lu0/w0;

.field public d:Landroid/hardware/camera2/params/MeteringRectangle;

.field public final e:LJc/b;

.field public f:Z

.field public g:[Landroid/hardware/camera2/params/MeteringRectangle;


# direct methods
.method public constructor <init>(Lt6/q;LJc/b;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lzc/a;-><init>(Lt6/q;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, LDc/a;->f:Z

    .line 6
    .line 7
    iput-object p2, p0, LDc/a;->e:LJc/b;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(Landroid/hardware/camera2/CaptureRequest$Builder;)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object v1, p0, Lzc/a;->a:Lt6/q;

    .line 3
    .line 4
    iget-object v1, v1, Lt6/q;->a:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, Landroid/hardware/camera2/CameraCharacteristics;

    .line 7
    .line 8
    sget-object v2, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_MAX_REGIONS_AE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Ljava/lang/Integer;

    .line 15
    .line 16
    if-eqz v1, :cond_2

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-lez v1, :cond_2

    .line 23
    .line 24
    iget-boolean v1, p0, LDc/a;->f:Z

    .line 25
    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_REGIONS:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 29
    .line 30
    invoke-virtual {p1, v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->get(Landroid/hardware/camera2/CaptureRequest$Key;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, [Landroid/hardware/camera2/params/MeteringRectangle;

    .line 35
    .line 36
    iput-object v1, p0, LDc/a;->g:[Landroid/hardware/camera2/params/MeteringRectangle;

    .line 37
    .line 38
    iput-boolean v0, p0, LDc/a;->f:Z

    .line 39
    .line 40
    :cond_0
    iget-object v1, p0, LDc/a;->d:Landroid/hardware/camera2/params/MeteringRectangle;

    .line 41
    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    sget-object v2, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_REGIONS:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 45
    .line 46
    new-array v0, v0, [Landroid/hardware/camera2/params/MeteringRectangle;

    .line 47
    .line 48
    const/4 v3, 0x0

    .line 49
    aput-object v1, v0, v3

    .line 50
    .line 51
    invoke-virtual {p1, v2, v0}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_1
    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_REGIONS:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 56
    .line 57
    iget-object v1, p0, LDc/a;->g:[Landroid/hardware/camera2/params/MeteringRectangle;

    .line 58
    .line 59
    invoke-virtual {p1, v0, v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    :cond_2
    return-void
.end method

.method public final b()V
    .locals 6

    .line 1
    iget-object v0, p0, LDc/a;->b:Landroid/util/Size;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-object v1, p0, LDc/a;->c:Lu0/w0;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, LDc/a;->d:Landroid/hardware/camera2/params/MeteringRectangle;

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v2, p0, LDc/a;->e:LJc/b;

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
    iget-object v3, p0, LDc/a;->c:Lu0/w0;

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
    iput-object v0, p0, LDc/a;->d:Landroid/hardware/camera2/params/MeteringRectangle;

    .line 47
    .line 48
    return-void

    .line 49
    :cond_2
    new-instance v0, Ljava/lang/AssertionError;

    .line 50
    .line 51
    const-string v1, "The cameraBoundaries should be set (using `ExposurePointFeature.setCameraBoundaries(Size)`) before updating the exposure point."

    .line 52
    .line 53
    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    throw v0
.end method
