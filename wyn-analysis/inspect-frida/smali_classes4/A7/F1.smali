.class public final LA7/F1;
.super LA7/G1;
.source "SourceFile"


# instance fields
.field public final d:Landroid/app/AlarmManager;

.field public e:LA7/C1;

.field public f:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(LA7/L1;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, LA7/G1;-><init>(LA7/L1;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p1, LA7/n0;

    .line 7
    .line 8
    iget-object p1, p1, LA7/n0;->a:Landroid/content/Context;

    .line 9
    .line 10
    const-string v0, "alarm"

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Landroid/app/AlarmManager;

    .line 17
    .line 18
    iput-object p1, p0, LA7/F1;->d:Landroid/app/AlarmManager;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final j0()Z
    .locals 2

    .line 1
    iget-object v0, p0, LA7/F1;->d:Landroid/app/AlarmManager;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LA7/F1;->m0()Landroid/app/PendingIntent;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 13
    .line 14
    const/16 v1, 0x18

    .line 15
    .line 16
    if-lt v0, v1, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, LA7/n0;

    .line 21
    .line 22
    iget-object v0, v0, LA7/n0;->a:Landroid/content/Context;

    .line 23
    .line 24
    const-string v1, "jobscheduler"

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Landroid/app/job/JobScheduler;

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    invoke-virtual {p0}, LA7/F1;->l0()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    invoke-virtual {v0, v1}, Landroid/app/job/JobScheduler;->cancel(I)V

    .line 39
    .line 40
    .line 41
    :cond_1
    const/4 v0, 0x0

    .line 42
    return v0
.end method

.method public final k0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, LA7/G1;->h0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, "Unscheduling upload"

    .line 9
    .line 10
    iget-object v0, v0, LA7/N;->n:LA7/P;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, LA7/P;->c(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, LA7/F1;->d:Landroid/app/AlarmManager;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, LA7/F1;->m0()Landroid/app/PendingIntent;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v0, v1}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-virtual {p0}, LA7/F1;->n0()LA7/n;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, LA7/n;->a()V

    .line 31
    .line 32
    .line 33
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 34
    .line 35
    const/16 v1, 0x18

    .line 36
    .line 37
    if-lt v0, v1, :cond_1

    .line 38
    .line 39
    iget-object v0, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, LA7/n0;

    .line 42
    .line 43
    iget-object v0, v0, LA7/n0;->a:Landroid/content/Context;

    .line 44
    .line 45
    const-string v1, "jobscheduler"

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Landroid/app/job/JobScheduler;

    .line 52
    .line 53
    if-eqz v0, :cond_1

    .line 54
    .line 55
    invoke-virtual {p0}, LA7/F1;->l0()I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    invoke-virtual {v0, v1}, Landroid/app/job/JobScheduler;->cancel(I)V

    .line 60
    .line 61
    .line 62
    :cond_1
    return-void
.end method

.method public final l0()I
    .locals 3

    .line 1
    iget-object v0, p0, LA7/F1;->f:Ljava/lang/Integer;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, LA7/n0;

    .line 8
    .line 9
    iget-object v0, v0, LA7/n0;->a:Landroid/content/Context;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v2, "measurement"

    .line 18
    .line 19
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iput-object v0, p0, LA7/F1;->f:Ljava/lang/Integer;

    .line 38
    .line 39
    :cond_0
    iget-object v0, p0, LA7/F1;->f:Ljava/lang/Integer;

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    return v0
.end method

.method public final m0()Landroid/app/PendingIntent;
    .locals 4

    .line 1
    iget-object v0, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LA7/n0;

    .line 4
    .line 5
    iget-object v0, v0, LA7/n0;->a:Landroid/content/Context;

    .line 6
    .line 7
    new-instance v1, Landroid/content/Intent;

    .line 8
    .line 9
    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v2, "com.google.android.gms.measurement.AppMeasurementReceiver"

    .line 13
    .line 14
    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const-string v2, "com.google.android.gms.measurement.UPLOAD"

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const/4 v2, 0x0

    .line 25
    sget v3, Lcom/google/android/gms/internal/measurement/zzcw;->zza:I

    .line 26
    .line 27
    invoke-static {v0, v2, v1, v3}, Lcom/google/android/gms/internal/measurement/zzcw;->zza(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    return-object v0
.end method

.method public final n0()LA7/n;
    .locals 3

    .line 1
    iget-object v0, p0, LA7/F1;->e:LA7/C1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, LA7/C1;

    .line 6
    .line 7
    iget-object v1, p0, LA7/H1;->b:LA7/L1;

    .line 8
    .line 9
    iget-object v1, v1, LA7/L1;->l:LA7/n0;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    invoke-direct {v0, p0, v1, v2}, LA7/C1;-><init>(Ljava/lang/Object;LA7/C0;I)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, LA7/F1;->e:LA7/C1;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, LA7/F1;->e:LA7/C1;

    .line 18
    .line 19
    return-object v0
.end method
