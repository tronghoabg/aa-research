.class public final Lcom/google/android/gms/internal/ads/zzfxc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfwd;


# static fields
.field private static final zza:Lcom/google/android/gms/internal/ads/zzfxc;

.field private static final zzb:Landroid/os/Handler;

.field private static zzc:Landroid/os/Handler;

.field private static final zzk:Ljava/lang/Runnable;

.field private static final zzl:Ljava/lang/Runnable;


# instance fields
.field private final zzd:Ljava/util/List;

.field private zze:I

.field private final zzf:Ljava/util/List;

.field private final zzg:Lcom/google/android/gms/internal/ads/zzfwf;

.field private final zzh:Lcom/google/android/gms/internal/ads/zzfwv;

.field private final zzi:Lcom/google/android/gms/internal/ads/zzfww;

.field private zzj:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfxc;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzfxc;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/gms/internal/ads/zzfxc;->zza:Lcom/google/android/gms/internal/ads/zzfxc;

    .line 7
    .line 8
    new-instance v0, Landroid/os/Handler;

    .line 9
    .line 10
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lcom/google/android/gms/internal/ads/zzfxc;->zzb:Landroid/os/Handler;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    sput-object v0, Lcom/google/android/gms/internal/ads/zzfxc;->zzc:Landroid/os/Handler;

    .line 21
    .line 22
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfwy;

    .line 23
    .line 24
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzfwy;-><init>()V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lcom/google/android/gms/internal/ads/zzfxc;->zzk:Ljava/lang/Runnable;

    .line 28
    .line 29
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfwz;

    .line 30
    .line 31
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzfwz;-><init>()V

    .line 32
    .line 33
    .line 34
    sput-object v0, Lcom/google/android/gms/internal/ads/zzfxc;->zzl:Ljava/lang/Runnable;

    .line 35
    .line 36
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzfxc;->zzd:Ljava/util/List;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzfxc;->zzf:Ljava/util/List;

    .line 17
    .line 18
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfwv;

    .line 19
    .line 20
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzfwv;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzfxc;->zzh:Lcom/google/android/gms/internal/ads/zzfwv;

    .line 24
    .line 25
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfwf;

    .line 26
    .line 27
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzfwf;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzfxc;->zzg:Lcom/google/android/gms/internal/ads/zzfwf;

    .line 31
    .line 32
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfww;

    .line 33
    .line 34
    new-instance v1, Lcom/google/android/gms/internal/ads/zzfxf;

    .line 35
    .line 36
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzfxf;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzfww;-><init>(Lcom/google/android/gms/internal/ads/zzfxf;)V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzfxc;->zzi:Lcom/google/android/gms/internal/ads/zzfww;

    .line 43
    .line 44
    return-void
.end method

.method public static zzb()Lcom/google/android/gms/internal/ads/zzfxc;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzfxc;->zza:Lcom/google/android/gms/internal/ads/zzfxc;

    return-object v0
.end method

.method public static synthetic zzg()Landroid/os/Handler;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzfxc;->zzc:Landroid/os/Handler;

    return-object v0
.end method

.method public static synthetic zzi()Ljava/lang/Runnable;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzfxc;->zzk:Ljava/lang/Runnable;

    return-object v0
.end method

.method public static synthetic zzj()Ljava/lang/Runnable;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzfxc;->zzl:Ljava/lang/Runnable;

    return-object v0
.end method

.method private final zzk(Landroid/view/View;Lcom/google/android/gms/internal/ads/zzfwe;Lorg/json/JSONObject;IZ)V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p4, v0, :cond_0

    .line 3
    .line 4
    :goto_0
    move-object v4, p0

    .line 5
    move-object v2, p1

    .line 6
    move-object v1, p2

    .line 7
    move-object v3, p3

    .line 8
    move v6, p5

    .line 9
    move v5, v0

    .line 10
    goto :goto_1

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    goto :goto_0

    .line 13
    :goto_1
    invoke-interface/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/zzfwe;->zzb(Landroid/view/View;Lorg/json/JSONObject;Lcom/google/android/gms/internal/ads/zzfwd;ZZ)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method private static final zzl()V
    .locals 2

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzfxc;->zzc:Landroid/os/Handler;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v1, Lcom/google/android/gms/internal/ads/zzfxc;->zzl:Ljava/lang/Runnable;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    sput-object v0, Lcom/google/android/gms/internal/ads/zzfxc;->zzc:Landroid/os/Handler;

    .line 12
    .line 13
    :cond_0
    return-void
.end method


# virtual methods
.method public final zza(Landroid/view/View;Lcom/google/android/gms/internal/ads/zzfwe;Lorg/json/JSONObject;Z)V
    .locals 9

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzfwt;->zza(Landroid/view/View;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfxc;->zzh:Lcom/google/android/gms/internal/ads/zzfwv;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzfwv;->zzl(Landroid/view/View;)I

    .line 10
    .line 11
    .line 12
    move-result v5

    .line 13
    const/4 v1, 0x3

    .line 14
    if-ne v5, v1, :cond_1

    .line 15
    .line 16
    :cond_0
    move-object v1, p0

    .line 17
    goto/16 :goto_7

    .line 18
    .line 19
    :cond_1
    invoke-interface {p2, p1}, Lcom/google/android/gms/internal/ads/zzfwe;->zza(Landroid/view/View;)Lorg/json/JSONObject;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-static {p3, v4}, Lcom/google/android/gms/internal/ads/zzfwo;->zze(Lorg/json/JSONObject;Lorg/json/JSONObject;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzfwv;->zzg(Landroid/view/View;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p3

    .line 30
    const/4 v7, 0x1

    .line 31
    if-eqz p3, :cond_3

    .line 32
    .line 33
    invoke-static {v4, p3}, Lcom/google/android/gms/internal/ads/zzfwo;->zzd(Lorg/json/JSONObject;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzfxc;->zzh:Lcom/google/android/gms/internal/ads/zzfwv;

    .line 37
    .line 38
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zzfwv;->zzj(Landroid/view/View;)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    :try_start_0
    const-string p2, "hasWindowFocus"

    .line 47
    .line 48
    invoke-virtual {v4, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :catch_0
    move-exception v0

    .line 53
    move-object p1, v0

    .line 54
    const-string p2, "Error with setting has window focus"

    .line 55
    .line 56
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/zzfwp;->zza(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 57
    .line 58
    .line 59
    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzfxc;->zzh:Lcom/google/android/gms/internal/ads/zzfwv;

    .line 60
    .line 61
    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/zzfwv;->zzk(Ljava/lang/String;)Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    if-eqz p1, :cond_2

    .line 70
    .line 71
    :try_start_1
    const-string p1, "isPipActive"

    .line 72
    .line 73
    invoke-virtual {v4, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :catch_1
    move-exception v0

    .line 78
    move-object p1, v0

    .line 79
    const-string p2, "Error with setting is picture-in-picture active"

    .line 80
    .line 81
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/zzfwp;->zza(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 82
    .line 83
    .line 84
    :cond_2
    :goto_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzfxc;->zzh:Lcom/google/android/gms/internal/ads/zzfwv;

    .line 85
    .line 86
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfwv;->zzf()V

    .line 87
    .line 88
    .line 89
    move-object v1, p0

    .line 90
    goto/16 :goto_6

    .line 91
    .line 92
    :cond_3
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzfwv;->zzi(Landroid/view/View;)Lcom/google/android/gms/internal/ads/zzfwu;

    .line 93
    .line 94
    .line 95
    move-result-object p3

    .line 96
    const/4 v1, 0x0

    .line 97
    if-eqz p3, :cond_5

    .line 98
    .line 99
    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/zzfwu;->zzb()Lcom/google/android/gms/internal/ads/zzfvv;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    new-instance v2, Lorg/json/JSONArray;

    .line 104
    .line 105
    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/zzfwu;->zzc()Ljava/util/ArrayList;

    .line 109
    .line 110
    .line 111
    move-result-object p3

    .line 112
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    move v6, v1

    .line 117
    :goto_2
    if-ge v6, v3, :cond_4

    .line 118
    .line 119
    invoke-interface {p3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v8

    .line 123
    check-cast v8, Ljava/lang/String;

    .line 124
    .line 125
    invoke-virtual {v2, v8}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 126
    .line 127
    .line 128
    add-int/lit8 v6, v6, 0x1

    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_4
    :try_start_2
    const-string p3, "isFriendlyObstructionFor"

    .line 132
    .line 133
    invoke-virtual {v4, p3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 134
    .line 135
    .line 136
    const-string p3, "friendlyObstructionClass"

    .line 137
    .line 138
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfvv;->zzb()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    invoke-virtual {v4, p3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 143
    .line 144
    .line 145
    const-string p3, "friendlyObstructionPurpose"

    .line 146
    .line 147
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfvv;->zzc()Lcom/google/android/gms/internal/ads/zzfvb;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    invoke-virtual {v4, p3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 152
    .line 153
    .line 154
    const-string p3, "friendlyObstructionReason"

    .line 155
    .line 156
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfvv;->zzd()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-virtual {v4, p3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2

    .line 161
    .line 162
    .line 163
    :goto_3
    move p3, v7

    .line 164
    goto :goto_4

    .line 165
    :catch_2
    move-exception v0

    .line 166
    move-object p3, v0

    .line 167
    const-string v0, "Error with setting friendly obstruction"

    .line 168
    .line 169
    invoke-static {v0, p3}, Lcom/google/android/gms/internal/ads/zzfwp;->zza(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 170
    .line 171
    .line 172
    goto :goto_3

    .line 173
    :cond_5
    move p3, v1

    .line 174
    :goto_4
    if-nez p4, :cond_6

    .line 175
    .line 176
    if-eqz p3, :cond_7

    .line 177
    .line 178
    :cond_6
    move-object v1, p0

    .line 179
    move-object v2, p1

    .line 180
    move-object v3, p2

    .line 181
    move v6, v7

    .line 182
    goto :goto_5

    .line 183
    :cond_7
    move-object v2, p1

    .line 184
    move-object v3, p2

    .line 185
    move v6, v1

    .line 186
    move-object v1, p0

    .line 187
    :goto_5
    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/zzfxc;->zzk(Landroid/view/View;Lcom/google/android/gms/internal/ads/zzfwe;Lorg/json/JSONObject;IZ)V

    .line 188
    .line 189
    .line 190
    :goto_6
    iget p1, v1, Lcom/google/android/gms/internal/ads/zzfxc;->zze:I

    .line 191
    .line 192
    add-int/2addr p1, v7

    .line 193
    iput p1, v1, Lcom/google/android/gms/internal/ads/zzfxc;->zze:I

    .line 194
    .line 195
    :goto_7
    return-void
.end method

.method public final zzc()V
    .locals 4

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzfxc;->zzc:Landroid/os/Handler;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/os/Handler;

    .line 6
    .line 7
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lcom/google/android/gms/internal/ads/zzfxc;->zzc:Landroid/os/Handler;

    .line 15
    .line 16
    sget-object v1, Lcom/google/android/gms/internal/ads/zzfxc;->zzk:Ljava/lang/Runnable;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 19
    .line 20
    .line 21
    sget-object v0, Lcom/google/android/gms/internal/ads/zzfxc;->zzc:Landroid/os/Handler;

    .line 22
    .line 23
    sget-object v1, Lcom/google/android/gms/internal/ads/zzfxc;->zzl:Ljava/lang/Runnable;

    .line 24
    .line 25
    const-wide/16 v2, 0xc8

    .line 26
    .line 27
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method public final zzd()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfxc;->zzl()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfxc;->zzd:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 7
    .line 8
    .line 9
    sget-object v0, Lcom/google/android/gms/internal/ads/zzfxc;->zzb:Landroid/os/Handler;

    .line 10
    .line 11
    new-instance v1, Lcom/google/android/gms/internal/ads/zzfwx;

    .line 12
    .line 13
    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/zzfwx;-><init>(Lcom/google/android/gms/internal/ads/zzfxc;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final zze()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfxc;->zzl()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final synthetic zzf()V
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzfxc;->zze:I

    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfxc;->zzf:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfvs;->zza()Lcom/google/android/gms/internal/ads/zzfvs;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfvs;->zzf()Ljava/util/Collection;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Lcom/google/android/gms/internal/ads/zzfuy;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 35
    .line 36
    .line 37
    move-result-wide v0

    .line 38
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzfxc;->zzj:J

    .line 39
    .line 40
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfxc;->zzh:Lcom/google/android/gms/internal/ads/zzfwv;

    .line 41
    .line 42
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzfwv;->zzd()V

    .line 43
    .line 44
    .line 45
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzfxc;->zzg:Lcom/google/android/gms/internal/ads/zzfwf;

    .line 46
    .line 47
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 48
    .line 49
    .line 50
    move-result-wide v3

    .line 51
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfwf;->zza()Lcom/google/android/gms/internal/ads/zzfwe;

    .line 52
    .line 53
    .line 54
    move-result-object v7

    .line 55
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzfwv;->zzb()Ljava/util/HashSet;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    const/4 v5, 0x0

    .line 64
    if-lez v0, :cond_2

    .line 65
    .line 66
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzfwv;->zzb()Ljava/util/HashSet;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_2

    .line 79
    .line 80
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    move-object v8, v0

    .line 85
    check-cast v8, Ljava/lang/String;

    .line 86
    .line 87
    invoke-interface {v7, v5}, Lcom/google/android/gms/internal/ads/zzfwe;->zza(Landroid/view/View;)Lorg/json/JSONObject;

    .line 88
    .line 89
    .line 90
    move-result-object v9

    .line 91
    invoke-virtual {v1, v8}, Lcom/google/android/gms/internal/ads/zzfwv;->zzh(Ljava/lang/String;)Landroid/view/View;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfwf;->zzb()Lcom/google/android/gms/internal/ads/zzfwe;

    .line 96
    .line 97
    .line 98
    move-result-object v10

    .line 99
    invoke-virtual {v1, v8}, Lcom/google/android/gms/internal/ads/zzfwv;->zzc(Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v11

    .line 103
    if-eqz v11, :cond_1

    .line 104
    .line 105
    invoke-interface {v10, v0}, Lcom/google/android/gms/internal/ads/zzfwe;->zza(Landroid/view/View;)Lorg/json/JSONObject;

    .line 106
    .line 107
    .line 108
    move-result-object v10

    .line 109
    invoke-static {v10, v8}, Lcom/google/android/gms/internal/ads/zzfwo;->zzd(Lorg/json/JSONObject;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    :try_start_0
    const-string v0, "notVisibleReason"

    .line 113
    .line 114
    invoke-virtual {v10, v0, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 115
    .line 116
    .line 117
    goto :goto_2

    .line 118
    :catch_0
    move-exception v0

    .line 119
    const-string v11, "Error with setting not visible reason"

    .line 120
    .line 121
    invoke-static {v11, v0}, Lcom/google/android/gms/internal/ads/zzfwp;->zza(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 122
    .line 123
    .line 124
    :goto_2
    invoke-static {v9, v10}, Lcom/google/android/gms/internal/ads/zzfwo;->zze(Lorg/json/JSONObject;Lorg/json/JSONObject;)V

    .line 125
    .line 126
    .line 127
    :cond_1
    invoke-static {v9}, Lcom/google/android/gms/internal/ads/zzfwo;->zzf(Lorg/json/JSONObject;)V

    .line 128
    .line 129
    .line 130
    new-instance v0, Ljava/util/HashSet;

    .line 131
    .line 132
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    iget-object v8, p0, Lcom/google/android/gms/internal/ads/zzfxc;->zzi:Lcom/google/android/gms/internal/ads/zzfww;

    .line 139
    .line 140
    invoke-virtual {v8, v9, v0, v3, v4}, Lcom/google/android/gms/internal/ads/zzfww;->zzb(Lorg/json/JSONObject;Ljava/util/HashSet;J)V

    .line 141
    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfxc;->zzh:Lcom/google/android/gms/internal/ads/zzfwv;

    .line 145
    .line 146
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfwv;->zza()Ljava/util/HashSet;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    invoke-virtual {v1}, Ljava/util/HashSet;->size()I

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    if-lez v1, :cond_3

    .line 155
    .line 156
    invoke-interface {v7, v5}, Lcom/google/android/gms/internal/ads/zzfwe;->zza(Landroid/view/View;)Lorg/json/JSONObject;

    .line 157
    .line 158
    .line 159
    move-result-object v8

    .line 160
    const/4 v9, 0x1

    .line 161
    const/4 v10, 0x0

    .line 162
    const/4 v6, 0x0

    .line 163
    move-object v5, p0

    .line 164
    invoke-direct/range {v5 .. v10}, Lcom/google/android/gms/internal/ads/zzfxc;->zzk(Landroid/view/View;Lcom/google/android/gms/internal/ads/zzfwe;Lorg/json/JSONObject;IZ)V

    .line 165
    .line 166
    .line 167
    invoke-static {v8}, Lcom/google/android/gms/internal/ads/zzfwo;->zzf(Lorg/json/JSONObject;)V

    .line 168
    .line 169
    .line 170
    iget-object v1, v5, Lcom/google/android/gms/internal/ads/zzfxc;->zzi:Lcom/google/android/gms/internal/ads/zzfww;

    .line 171
    .line 172
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfwv;->zza()Ljava/util/HashSet;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    invoke-virtual {v1, v8, v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzfww;->zza(Lorg/json/JSONObject;Ljava/util/HashSet;J)V

    .line 177
    .line 178
    .line 179
    goto :goto_3

    .line 180
    :cond_3
    move-object v5, p0

    .line 181
    iget-object v1, v5, Lcom/google/android/gms/internal/ads/zzfxc;->zzi:Lcom/google/android/gms/internal/ads/zzfww;

    .line 182
    .line 183
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzfww;->zzc()V

    .line 184
    .line 185
    .line 186
    :goto_3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfwv;->zze()V

    .line 187
    .line 188
    .line 189
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 190
    .line 191
    .line 192
    move-result-wide v0

    .line 193
    iget-wide v2, v5, Lcom/google/android/gms/internal/ads/zzfxc;->zzj:J

    .line 194
    .line 195
    sub-long/2addr v0, v2

    .line 196
    iget-object v2, v5, Lcom/google/android/gms/internal/ads/zzfxc;->zzd:Ljava/util/List;

    .line 197
    .line 198
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 199
    .line 200
    .line 201
    move-result v3

    .line 202
    if-lez v3, :cond_5

    .line 203
    .line 204
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    :cond_4
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 209
    .line 210
    .line 211
    move-result v3

    .line 212
    if-eqz v3, :cond_5

    .line 213
    .line 214
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v3

    .line 218
    check-cast v3, Lcom/google/android/gms/internal/ads/zzfxb;

    .line 219
    .line 220
    sget-object v4, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 221
    .line 222
    invoke-virtual {v4, v0, v1}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 223
    .line 224
    .line 225
    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/zzfxb;->zzb()V

    .line 226
    .line 227
    .line 228
    instance-of v4, v3, Lcom/google/android/gms/internal/ads/zzfxa;

    .line 229
    .line 230
    if-eqz v4, :cond_4

    .line 231
    .line 232
    check-cast v3, Lcom/google/android/gms/internal/ads/zzfxa;

    .line 233
    .line 234
    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/zzfxa;->zza()V

    .line 235
    .line 236
    .line 237
    goto :goto_4

    .line 238
    :cond_5
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfwc;->zza()Lcom/google/android/gms/internal/ads/zzfwc;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfwc;->zzc()V

    .line 243
    .line 244
    .line 245
    return-void
.end method

.method public final synthetic zzh()Lcom/google/android/gms/internal/ads/zzfww;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfxc;->zzi:Lcom/google/android/gms/internal/ads/zzfww;

    return-object v0
.end method
