.class public final LA7/q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/google/android/gms/internal/measurement/zzdo;

.field public final synthetic c:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/google/android/gms/internal/measurement/zzdo;I)V
    .locals 0

    .line 1
    iput p3, p0, LA7/q0;->a:I

    iput-object p2, p0, LA7/q0;->b:Lcom/google/android/gms/internal/measurement/zzdo;

    iput-object p1, p0, LA7/q0;->c:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, LA7/q0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA7/q0;->c:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    .line 7
    .line 8
    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LA7/n0;

    .line 9
    .line 10
    iget-object v1, v1, LA7/n0;->l:LA7/U1;

    .line 11
    .line 12
    invoke-static {v1}, LA7/n0;->c(LA7/B0;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LA7/n0;

    .line 16
    .line 17
    iget-object v2, v0, LA7/n0;->A:Ljava/lang/Boolean;

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    iget-object v0, v0, LA7/n0;->A:Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v0, 0x0

    .line 32
    :goto_0
    iget-object v2, p0, LA7/q0;->b:Lcom/google/android/gms/internal/measurement/zzdo;

    .line 33
    .line 34
    invoke-virtual {v1, v2, v0}, LA7/U1;->C0(Lcom/google/android/gms/internal/measurement/zzdo;Z)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :pswitch_0
    iget-object v0, p0, LA7/q0;->c:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    .line 39
    .line 40
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:LA7/n0;

    .line 41
    .line 42
    invoke-static {v0}, LA7/p0;->h(LA7/n0;)LA7/m1;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    const/4 v1, 0x0

    .line 47
    invoke-virtual {v0, v1}, LA7/m1;->w0(Z)LA7/N1;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    new-instance v2, LA7/w0;

    .line 52
    .line 53
    iget-object v3, p0, LA7/q0;->b:Lcom/google/android/gms/internal/measurement/zzdo;

    .line 54
    .line 55
    const/4 v4, 0x6

    .line 56
    invoke-direct {v2, v0, v1, v3, v4}, LA7/w0;-><init>(LA7/m1;LA7/N1;Ljava/lang/Object;I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v2}, LA7/m1;->m0(Ljava/lang/Runnable;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
