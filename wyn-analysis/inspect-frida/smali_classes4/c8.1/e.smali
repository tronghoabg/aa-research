.class public Lc8/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA7/C;
.implements Lcom/google/android/gms/common/api/internal/w;
.implements LE0/n;
.implements Lcom/google/android/gms/internal/mlkit_vision_text_common/zzu;
.implements LG0/d;
.implements LJ5/m;
.implements LL4/l;
.implements Lcom/google/android/gms/tasks/SuccessContinuation;
.implements LV5/j;
.implements LVa/rb;
.implements LZ4/c;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lc8/e;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LC7/g;)V
    .locals 0

    const/16 p1, 0xf

    iput p1, p0, Lc8/e;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(LV5/i;)Landroid/media/MediaCodec;
    .locals 2

    .line 1
    iget-object v0, p0, LV5/i;->a:LV5/n;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, LV5/i;->a:LV5/n;

    .line 7
    .line 8
    iget-object p0, p0, LV5/n;->a:Ljava/lang/String;

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v1, "createCodec:"

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v0}, Lu6/a;->b(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-static {p0}, Landroid/media/MediaCodec;->createByCodecName(Ljava/lang/String;)Landroid/media/MediaCodec;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-static {}, Lu6/a;->q()V

    .line 32
    .line 33
    .line 34
    return-object p0
.end method

.method public static e()Z
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 0

    .line 1
    return-void
.end method

.method public accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/safetynet/zzaf;

    .line 2
    .line 3
    check-cast p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 4
    .line 5
    new-instance v0, LC7/m;

    .line 6
    .line 7
    invoke-direct {v0, p2}, LC7/m;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/f;->getService()Landroid/os/IInterface;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lcom/google/android/gms/internal/safetynet/zzh;

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/safetynet/zzh;->zzf(Lcom/google/android/gms/internal/safetynet/zzg;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public b()Ljava/util/List;
    .locals 3

    .line 1
    new-instance v0, LG0/a;

    .line 2
    .line 3
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v2, "getDefault()"

    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, LG0/a;-><init>(Ljava/util/Locale;)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
.end method

.method public d(LF4/a;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    return-void
.end method

.method public h()V
    .locals 0

    .line 1
    return-void
.end method

.method public i(LE0/m;LE0/l;I)Landroid/graphics/Typeface;
    .locals 0

    .line 1
    const-string p3, "name"

    .line 2
    .line 3
    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p3, "fontWeight"

    .line 7
    .line 8
    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget p1, p2, LE0/l;->a:I

    .line 15
    .line 16
    div-int/lit8 p1, p1, 0x64

    .line 17
    .line 18
    const/4 p2, 0x2

    .line 19
    if-ltz p1, :cond_1

    .line 20
    .line 21
    if-lt p1, p2, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 p1, 0x0

    .line 25
    throw p1

    .line 26
    :cond_1
    :goto_0
    const/4 p3, 0x4

    .line 27
    if-gt p2, p1, :cond_3

    .line 28
    .line 29
    if-lt p1, p3, :cond_2

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_2
    const/4 p1, 0x0

    .line 33
    throw p1

    .line 34
    :cond_3
    :goto_1
    if-eq p1, p3, :cond_6

    .line 35
    .line 36
    const/4 p2, 0x5

    .line 37
    if-eq p1, p2, :cond_5

    .line 38
    .line 39
    const/4 p2, 0x6

    .line 40
    const/16 p3, 0x8

    .line 41
    .line 42
    if-gt p2, p1, :cond_4

    .line 43
    .line 44
    if-lt p1, p3, :cond_6

    .line 45
    .line 46
    :cond_4
    if-gt p3, p1, :cond_6

    .line 47
    .line 48
    const/16 p2, 0xb

    .line 49
    .line 50
    if-ge p1, p2, :cond_6

    .line 51
    .line 52
    const/4 p1, 0x0

    .line 53
    throw p1

    .line 54
    :cond_5
    const/4 p1, 0x0

    .line 55
    throw p1

    .line 56
    :cond_6
    const/4 p1, 0x0

    .line 57
    throw p1
.end method

.method public j(LV5/i;)LV5/k;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-static {p1}, Lc8/e;->c(LV5/i;)Landroid/media/MediaCodec;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    const-string v1, "configureCodec"

    .line 7
    .line 8
    invoke-static {v1}, Lu6/a;->b(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p1, LV5/i;->b:Landroid/media/MediaFormat;

    .line 12
    .line 13
    iget-object v2, p1, LV5/i;->d:Landroid/view/Surface;

    .line 14
    .line 15
    iget-object p1, p1, LV5/i;->e:Landroid/media/MediaCrypto;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-virtual {v0, v1, v2, p1, v3}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    .line 19
    .line 20
    .line 21
    invoke-static {}, Lu6/a;->q()V

    .line 22
    .line 23
    .line 24
    const-string p1, "startCodec"

    .line 25
    .line 26
    invoke-static {p1}, Lu6/a;->b(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/media/MediaCodec;->start()V

    .line 30
    .line 31
    .line 32
    invoke-static {}, Lu6/a;->q()V

    .line 33
    .line 34
    .line 35
    new-instance p1, LDd/c;

    .line 36
    .line 37
    invoke-direct {p1, v0}, LDd/c;-><init>(Landroid/media/MediaCodec;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    .line 40
    return-object p1

    .line 41
    :catch_0
    move-exception p1

    .line 42
    goto :goto_0

    .line 43
    :catch_1
    move-exception p1

    .line 44
    :goto_0
    if-eqz v0, :cond_0

    .line 45
    .line 46
    invoke-virtual {v0}, Landroid/media/MediaCodec;->release()V

    .line 47
    .line 48
    .line 49
    :cond_0
    throw p1
.end method

.method public l()V
    .locals 0

    .line 1
    return-void
.end method

.method public m(II)LJ5/w;
    .locals 0

    .line 1
    new-instance p1, LJ5/j;

    .line 2
    .line 3
    invoke-direct {p1}, LJ5/j;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p1
.end method

.method public synthetic n(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p2, p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    return-object p1
.end method

.method public o(LE0/l;I)Landroid/graphics/Typeface;
    .locals 1

    .line 1
    const-string v0, "fontWeight"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-nez p2, :cond_0

    .line 7
    .line 8
    sget-object v0, LE0/l;->d:LE0/l;

    .line 9
    .line 10
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    sget-object p1, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 17
    .line 18
    const-string p2, "DEFAULT"

    .line 19
    .line 20
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-static {p1, p2}, Ltg/b;->z(LE0/l;I)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    invoke-static {p1}, Landroid/graphics/Typeface;->defaultFromStyle(I)Landroid/graphics/Typeface;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const-string p2, "{\n            Typeface.d\u2026le(targetStyle)\n        }"

    .line 33
    .line 34
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :goto_0
    return-object p1
.end method

.method public then(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Void;

    .line 2
    .line 3
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 4
    .line 5
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public x(LJ5/t;)V
    .locals 0

    .line 1
    return-void
.end method

.method public zza()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lc8/e;->a:I

    packed-switch v0, :pswitch_data_0

    .line 7
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpb;->zzb()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 8
    :pswitch_0
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpo;->zzb()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 9
    :pswitch_1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpc;->zza()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 10
    :pswitch_2
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzng;->zzy()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    .line 11
    :pswitch_3
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzng;->zzay()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 12
    :pswitch_4
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzng;->zzn()J

    move-result-wide v0

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    .line 13
    :pswitch_5
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzph;->zzd()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    .line 14
    :pswitch_6
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzng;->zzap()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    .line 15
    :pswitch_7
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzng;->zzu()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    .line 16
    :pswitch_8
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzng;->zzak()J

    move-result-wide v0

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    .line 17
    :pswitch_9
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zznf;->zza()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 18
    :pswitch_a
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zznx;->zza()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 19
    :pswitch_b
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpn;->zzb()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public zza(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    check-cast p1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzr;

    sget-object v0, LEa/d;->a:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzv;

    .line 1
    iget-object v0, p1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzr;->zzb:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzf;

    .line 2
    invoke-static {v0}, LBa/c;->X(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzf;)Ljava/util/List;

    move-result-object v4

    new-instance v1, LCa/a;

    .line 3
    iget-object v0, p1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzr;->zzd:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzy;->zzb(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, ""

    :goto_0
    move-object v2, v0

    goto :goto_1

    :cond_0
    iget-object v0, p1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzr;->zzd:Ljava/lang/String;

    goto :goto_0

    .line 4
    :goto_1
    invoke-static {v4}, LBa/c;->W(Ljava/util/List;)Landroid/graphics/Rect;

    move-result-object v3

    .line 5
    iget-object v0, p1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzr;->zzf:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzy;->zzb(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "und"

    :goto_2
    move-object v5, v0

    goto :goto_3

    :cond_1
    iget-object v0, p1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzr;->zzf:Ljava/lang/String;

    goto :goto_2

    :goto_3
    iget v6, p1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzr;->zze:F

    iget-object p1, p1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzr;->zzb:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzf;

    iget v7, p1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzf;->zze:F

    .line 6
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbk;->zzh()Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbk;

    move-result-object v8

    invoke-direct/range {v1 .. v8}, LCa/a;-><init>(Ljava/lang/String;Landroid/graphics/Rect;Ljava/util/List;Ljava/lang/String;FFLcom/google/android/gms/internal/mlkit_vision_text_common/zzbk;)V

    return-object v1
.end method
