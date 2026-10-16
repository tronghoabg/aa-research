.class public final LA7/g0;
.super Lx/j;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(ILX2/j;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LA7/g0;->a:I

    iput-object p2, p0, LA7/g0;->b:Ljava/lang/Object;

    .line 2
    invoke-direct {p0, p1}, Lx/j;-><init>(I)V

    return-void
.end method

.method public constructor <init>(LA7/f0;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LA7/g0;->a:I

    .line 1
    iput-object p1, p0, LA7/g0;->b:Ljava/lang/Object;

    const/16 p1, 0x14

    invoke-direct {p0, p1}, Lx/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public create(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, LA7/g0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lx/j;->create(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1

    .line 11
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, LA7/g0;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, LA7/f0;

    .line 19
    .line 20
    invoke-virtual {v0}, LA7/G1;->h0()V

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    iget-object v1, v0, LA7/f0;->h:Lx/e;

    .line 34
    .line 35
    invoke-virtual {v1, p1}, Lx/v;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, Lcom/google/android/gms/internal/measurement/zzfr$zzd;

    .line 40
    .line 41
    if-nez v2, :cond_1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzfr$zzd;->zza()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_3

    .line 49
    .line 50
    invoke-virtual {v1, p1}, Lx/v;->containsKey(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_2

    .line 55
    .line 56
    invoke-virtual {v1, p1}, Lx/v;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    if-eqz v2, :cond_2

    .line 61
    .line 62
    invoke-virtual {v1, p1}, Lx/v;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    check-cast v1, Lcom/google/android/gms/internal/measurement/zzfr$zzd;

    .line 67
    .line 68
    invoke-virtual {v0, p1, v1}, LA7/f0;->q0(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzfr$zzd;)V

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_2
    invoke-virtual {v0, p1}, LA7/f0;->B0(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    :goto_0
    iget-object v0, v0, LA7/f0;->j:LA7/g0;

    .line 76
    .line 77
    invoke-virtual {v0}, Lx/j;->snapshot()Ljava/util/Map;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    check-cast p1, Lcom/google/android/gms/internal/measurement/zzb;

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_3
    :goto_1
    const/4 p1, 0x0

    .line 89
    :goto_2
    return-object p1

    .line 90
    nop

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public entryRemoved(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, LA7/g0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3, p4}, Lx/j;->entryRemoved(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    check-cast p2, Lf4/c;

    .line 11
    .line 12
    check-cast p3, Lf4/f;

    .line 13
    .line 14
    check-cast p4, Lf4/f;

    .line 15
    .line 16
    iget-object p1, p0, LA7/g0;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p1, LX2/j;

    .line 19
    .line 20
    iget-object p1, p1, LX2/j;->b:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p1, Lf4/i;

    .line 23
    .line 24
    iget-object p4, p3, Lf4/f;->a:Landroid/graphics/Bitmap;

    .line 25
    .line 26
    iget-object v0, p3, Lf4/f;->b:Ljava/util/Map;

    .line 27
    .line 28
    iget p3, p3, Lf4/f;->c:I

    .line 29
    .line 30
    invoke-interface {p1, p2, p4, v0, p3}, Lf4/i;->r(Lf4/c;Landroid/graphics/Bitmap;Ljava/util/Map;I)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public sizeOf(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .line 1
    iget v0, p0, LA7/g0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Lx/j;->sizeOf(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1

    .line 11
    :pswitch_0
    check-cast p1, Lf4/c;

    .line 12
    .line 13
    check-cast p2, Lf4/f;

    .line 14
    .line 15
    iget p1, p2, Lf4/f;->c:I

    .line 16
    .line 17
    return p1

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
