.class public final LA7/S;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_vision_text_common/zzub;


# static fields
.field public static f:LA7/S;

.field public static g:Lio/flutter/view/s;


# instance fields
.field public final synthetic a:I

.field public b:J

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    iput p1, p0, LA7/S;->a:I

    packed-switch p1, :pswitch_data_0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void

    .line 2
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 3
    iput-wide v0, p0, LA7/S;->b:J

    .line 4
    new-instance p1, Lg0/b;

    invoke-direct {p1}, Lg0/b;-><init>()V

    iput-object p1, p0, LA7/S;->e:Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic constructor <init>(LEa/a;JLcom/google/android/gms/internal/mlkit_vision_text_common/zzou;LAa/a;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LA7/S;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA7/S;->c:Ljava/lang/Object;

    iput-wide p2, p0, LA7/S;->b:J

    iput-object p4, p0, LA7/S;->d:Ljava/lang/Object;

    iput-object p5, p0, LA7/S;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lio/flutter/embedding/engine/FlutterJNI;)V
    .locals 3

    const/4 v0, 0x3

    iput v0, p0, LA7/S;->a:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    .line 6
    iput-wide v0, p0, LA7/S;->b:J

    .line 7
    new-instance v0, Lio/flutter/view/t;

    const-wide/16 v1, 0x0

    invoke-direct {v0, p0, v1, v2}, Lio/flutter/view/t;-><init>(LA7/S;J)V

    iput-object v0, p0, LA7/S;->d:Ljava/lang/Object;

    .line 8
    new-instance v0, Lio/flutter/view/a;

    invoke-direct {v0, p0}, Lio/flutter/view/a;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, LA7/S;->e:Ljava/lang/Object;

    .line 9
    iput-object p1, p0, LA7/S;->c:Ljava/lang/Object;

    return-void
.end method

.method public static a(Landroid/hardware/display/DisplayManager;Lio/flutter/embedding/engine/FlutterJNI;)LA7/S;
    .locals 5

    .line 1
    sget-object v0, LA7/S;->f:LA7/S;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, LA7/S;

    .line 6
    .line 7
    invoke-direct {v0, p1}, LA7/S;-><init>(Lio/flutter/embedding/engine/FlutterJNI;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, LA7/S;->f:LA7/S;

    .line 11
    .line 12
    :cond_0
    sget-object v0, LA7/S;->g:Lio/flutter/view/s;

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    new-instance v0, Lio/flutter/view/s;

    .line 17
    .line 18
    sget-object v1, LA7/S;->f:LA7/S;

    .line 19
    .line 20
    invoke-static {v1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-direct {v0, v1, p0, v2}, Lio/flutter/view/s;-><init>(Ljava/lang/Object;Landroid/hardware/display/DisplayManager;I)V

    .line 25
    .line 26
    .line 27
    sput-object v0, LA7/S;->g:Lio/flutter/view/s;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-virtual {p0, v0, v1}, Landroid/hardware/display/DisplayManager;->registerDisplayListener(Landroid/hardware/display/DisplayManager$DisplayListener;Landroid/os/Handler;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    sget-object v0, LA7/S;->f:LA7/S;

    .line 34
    .line 35
    iget-wide v0, v0, LA7/S;->b:J

    .line 36
    .line 37
    const-wide/16 v2, -0x1

    .line 38
    .line 39
    cmp-long v0, v0, v2

    .line 40
    .line 41
    if-nez v0, :cond_2

    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    invoke-virtual {p0, v0}, Landroid/hardware/display/DisplayManager;->getDisplay(I)Landroid/view/Display;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p0}, Landroid/view/Display;->getRefreshRate()F

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    sget-object v0, LA7/S;->f:LA7/S;

    .line 53
    .line 54
    const-wide v1, 0x41cdcd6500000000L    # 1.0E9

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    float-to-double v3, p0

    .line 60
    div-double/2addr v1, v3

    .line 61
    double-to-long v1, v1

    .line 62
    iput-wide v1, v0, LA7/S;->b:J

    .line 63
    .line 64
    invoke-virtual {p1, p0}, Lio/flutter/embedding/engine/FlutterJNI;->setRefreshRateFPS(F)V

    .line 65
    .line 66
    .line 67
    :cond_2
    sget-object p0, LA7/S;->f:LA7/S;

    .line 68
    .line 69
    return-object p0
.end method

.method public static c(LA7/x;)LA7/S;
    .locals 4

    .line 1
    new-instance v0, LA7/S;

    .line 2
    .line 3
    iget-object v1, p0, LA7/x;->a:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, LA7/x;->b:LA7/w;

    .line 6
    .line 7
    invoke-virtual {v2}, LA7/w;->W()Landroid/os/Bundle;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-direct {v0, v3}, LA7/S;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iput-object v1, v0, LA7/S;->c:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v1, p0, LA7/x;->c:Ljava/lang/String;

    .line 18
    .line 19
    iput-object v1, v0, LA7/S;->d:Ljava/lang/Object;

    .line 20
    .line 21
    iput-object v2, v0, LA7/S;->e:Ljava/lang/Object;

    .line 22
    .line 23
    iget-wide v1, p0, LA7/x;->d:J

    .line 24
    .line 25
    iput-wide v1, v0, LA7/S;->b:J

    .line 26
    .line 27
    return-object v0
.end method


# virtual methods
.method public b()LA7/x;
    .locals 6

    .line 1
    new-instance v0, LA7/x;

    .line 2
    .line 3
    new-instance v2, LA7/w;

    .line 4
    .line 5
    new-instance v1, Landroid/os/Bundle;

    .line 6
    .line 7
    iget-object v3, p0, LA7/S;->e:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, Landroid/os/Bundle;

    .line 10
    .line 11
    invoke-direct {v1, v3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {v2, v1}, LA7/w;-><init>(Landroid/os/Bundle;)V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, LA7/S;->d:Ljava/lang/Object;

    .line 18
    .line 19
    move-object v3, v1

    .line 20
    check-cast v3, Ljava/lang/String;

    .line 21
    .line 22
    iget-wide v4, p0, LA7/S;->b:J

    .line 23
    .line 24
    iget-object v1, p0, LA7/S;->c:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Ljava/lang/String;

    .line 27
    .line 28
    invoke-direct/range {v0 .. v5}, LA7/x;-><init>(Ljava/lang/String;LA7/w;Ljava/lang/String;J)V

    .line 29
    .line 30
    .line 31
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget v0, p0, LA7/S;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    iget-object v0, p0, LA7/S;->e:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Landroid/os/Bundle;

    .line 14
    .line 15
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v2, "origin="

    .line 22
    .line 23
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object v2, p0, LA7/S;->d:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v2, Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v2, ",name="

    .line 34
    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v2, p0, LA7/S;->c:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v2, Ljava/lang/String;

    .line 41
    .line 42
    const-string v3, ",params="

    .line 43
    .line 44
    invoke-static {v1, v2, v3, v0}, LVa/M6;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    return-object v0

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public zza()Lcom/google/android/gms/internal/mlkit_vision_text_common/zztr;
    .locals 9

    .line 1
    iget-object v0, p0, LA7/S;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LEa/a;

    .line 4
    .line 5
    iget-wide v1, p0, LA7/S;->b:J

    .line 6
    .line 7
    iget-object v3, p0, LA7/S;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzou;

    .line 10
    .line 11
    iget-object v4, p0, LA7/S;->e:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v4, LAa/a;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    new-instance v5, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrx;

    .line 19
    .line 20
    invoke-direct {v5}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrx;-><init>()V

    .line 21
    .line 22
    .line 23
    new-instance v6, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzoh;

    .line 24
    .line 25
    invoke-direct {v6}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzoh;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v6, v1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzoh;->zzc(Ljava/lang/Long;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzoh;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v6, v3}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzoh;->zzd(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzou;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzoh;

    .line 36
    .line 37
    .line 38
    sget-boolean v1, LEa/a;->i:Z

    .line 39
    .line 40
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v6, v1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzoh;->zze(Ljava/lang/Boolean;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzoh;

    .line 45
    .line 46
    .line 47
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 48
    .line 49
    invoke-virtual {v6, v1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzoh;->zza(Ljava/lang/Boolean;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzoh;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v6, v1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzoh;->zzb(Ljava/lang/Boolean;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzoh;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v6}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzoh;->zzf()Lcom/google/android/gms/internal/mlkit_vision_text_common/zzoj;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v5, v1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrx;->zzd(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzoj;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrx;

    .line 60
    .line 61
    .line 62
    sget-object v1, LEa/a;->j:LBa/a;

    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    iget v1, v4, LAa/a;->f:I

    .line 68
    .line 69
    const/16 v2, 0x23

    .line 70
    .line 71
    const v3, 0x32315659

    .line 72
    .line 73
    .line 74
    const/16 v6, 0x11

    .line 75
    .line 76
    const/4 v7, -0x1

    .line 77
    if-ne v1, v7, :cond_0

    .line 78
    .line 79
    iget-object v4, v4, LAa/a;->a:Landroid/graphics/Bitmap;

    .line 80
    .line 81
    invoke-static {v4}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getAllocationByteCount()I

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    goto :goto_1

    .line 89
    :cond_0
    if-eq v1, v6, :cond_3

    .line 90
    .line 91
    if-ne v1, v3, :cond_1

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_1
    if-eq v1, v2, :cond_2

    .line 95
    .line 96
    const/4 v4, 0x0

    .line 97
    goto :goto_1

    .line 98
    :cond_2
    const/4 v0, 0x0

    .line 99
    invoke-static {v0}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    throw v0

    .line 103
    :cond_3
    :goto_0
    iget-object v4, v4, LAa/a;->b:Ljava/nio/ByteBuffer;

    .line 104
    .line 105
    invoke-static {v4}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v4}, Ljava/nio/Buffer;->limit()I

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    :goto_1
    new-instance v8, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzoa;

    .line 113
    .line 114
    invoke-direct {v8}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzoa;-><init>()V

    .line 115
    .line 116
    .line 117
    if-eq v1, v7, :cond_8

    .line 118
    .line 119
    if-eq v1, v2, :cond_7

    .line 120
    .line 121
    if-eq v1, v3, :cond_6

    .line 122
    .line 123
    const/16 v2, 0x10

    .line 124
    .line 125
    if-eq v1, v2, :cond_5

    .line 126
    .line 127
    if-eq v1, v6, :cond_4

    .line 128
    .line 129
    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzob;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzob;

    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_4
    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzob;->zzc:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzob;

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_5
    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzob;->zzb:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzob;

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_6
    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzob;->zzd:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzob;

    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_7
    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzob;->zze:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzob;

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_8
    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzob;->zzg:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzob;

    .line 145
    .line 146
    :goto_2
    invoke-virtual {v8, v1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzoa;->zza(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzob;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzoa;

    .line 147
    .line 148
    .line 149
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    invoke-virtual {v8, v1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzoa;->zzb(Ljava/lang/Integer;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzoa;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v8}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzoa;->zzd()Lcom/google/android/gms/internal/mlkit_vision_text_common/zzod;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-virtual {v5, v1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrx;->zzc(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzod;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrx;

    .line 161
    .line 162
    .line 163
    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsa;

    .line 164
    .line 165
    invoke-direct {v1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsa;-><init>()V

    .line 166
    .line 167
    .line 168
    iget-object v2, v0, LEa/a;->g:LCa/h;

    .line 169
    .line 170
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    const/4 v2, 0x1

    .line 174
    invoke-static {v2}, LA6/c;->P(I)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsa;->zza(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsa;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsa;->zzc()Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsd;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    invoke-virtual {v5, v1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrx;->zze(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsd;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrx;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v5}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrx;->zzf()Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrz;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    new-instance v2, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzow;

    .line 193
    .line 194
    invoke-direct {v2}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzow;-><init>()V

    .line 195
    .line 196
    .line 197
    iget-object v0, v0, LEa/a;->g:LCa/h;

    .line 198
    .line 199
    invoke-interface {v0}, LCa/h;->c()Z

    .line 200
    .line 201
    .line 202
    move-result v0

    .line 203
    if-eqz v0, :cond_9

    .line 204
    .line 205
    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzot;->zzc:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzot;

    .line 206
    .line 207
    goto :goto_3

    .line 208
    :cond_9
    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzot;->zzb:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzot;

    .line 209
    .line 210
    :goto_3
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzow;->zze(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzot;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzow;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzow;->zzh(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrz;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzow;

    .line 214
    .line 215
    .line 216
    invoke-static {v2}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuf;->zzf(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzow;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zztr;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    return-object v0
.end method
