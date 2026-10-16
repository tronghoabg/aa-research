.class public final LA7/u1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LA7/t1;


# direct methods
.method public synthetic constructor <init>(LA7/t1;I)V
    .locals 0

    .line 1
    iput p2, p0, LA7/u1;->a:I

    iput-object p1, p0, LA7/u1;->b:LA7/t1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, LA7/u1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA7/u1;->b:LA7/t1;

    .line 7
    .line 8
    iget-object v1, v0, LA7/t1;->c:LA7/m1;

    .line 9
    .line 10
    new-instance v2, Landroid/content/ComponentName;

    .line 11
    .line 12
    iget-object v0, v0, LA7/t1;->c:LA7/m1;

    .line 13
    .line 14
    iget-object v0, v0, LA7/B0;->a:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, LA7/n0;

    .line 17
    .line 18
    iget-object v0, v0, LA7/n0;->a:Landroid/content/Context;

    .line 19
    .line 20
    const-string v3, "com.google.android.gms.measurement.AppMeasurementService"

    .line 21
    .line 22
    invoke-direct {v2, v0, v3}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, LA7/B;->c0()V

    .line 26
    .line 27
    .line 28
    iget-object v0, v1, LA7/m1;->d:LA7/F;

    .line 29
    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    iput-object v0, v1, LA7/m1;->d:LA7/F;

    .line 34
    .line 35
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const-string v3, "Disconnected from device MeasurementService"

    .line 40
    .line 41
    iget-object v0, v0, LA7/N;->n:LA7/P;

    .line 42
    .line 43
    invoke-virtual {v0, v3, v2}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, LA7/B;->c0()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, LA7/m1;->p0()V

    .line 50
    .line 51
    .line 52
    :cond_0
    return-void

    .line 53
    :pswitch_0
    iget-object v0, p0, LA7/u1;->b:LA7/t1;

    .line 54
    .line 55
    iget-object v0, v0, LA7/t1;->c:LA7/m1;

    .line 56
    .line 57
    const/4 v1, 0x0

    .line 58
    iput-object v1, v0, LA7/m1;->d:LA7/F;

    .line 59
    .line 60
    invoke-virtual {v0}, LA7/m1;->u0()V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
