.class public final Lcom/google/android/gms/internal/ads/zzbyh;
.super Lcom/google/android/gms/internal/ads/zzbyn;
.source "SourceFile"


# instance fields
.field private zza:Ljava/lang/String;

.field private zzb:Z

.field private zzc:I

.field private zzd:I

.field private zze:I

.field private zzf:I

.field private zzg:I

.field private zzh:I

.field private final zzi:Ljava/lang/Object;

.field private final zzj:Lcom/google/android/gms/internal/ads/zzclb;

.field private final zzk:Landroid/app/Activity;

.field private zzl:Lcom/google/android/gms/internal/ads/zzcnl;

.field private zzm:Landroid/widget/ImageView;

.field private zzn:Landroid/widget/LinearLayout;

.field private final zzo:Lcom/google/android/gms/internal/ads/zzbyo;

.field private zzp:Landroid/widget/PopupWindow;

.field private zzq:Landroid/widget/RelativeLayout;

.field private zzr:Landroid/view/ViewGroup;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    const-string v3, "center"

    .line 2
    .line 3
    const-string v4, "bottom-left"

    .line 4
    .line 5
    const-string v0, "top-left"

    .line 6
    .line 7
    const-string v1, "top-right"

    .line 8
    .line 9
    const-string v2, "top-center"

    .line 10
    .line 11
    const-string v5, "bottom-right"

    .line 12
    .line 13
    const-string v6, "bottom-center"

    .line 14
    .line 15
    filled-new-array/range {v0 .. v6}, [Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, Lx/f;

    .line 20
    .line 21
    const/4 v2, 0x7

    .line 22
    invoke-direct {v1, v2}, Lx/f;-><init>(I)V

    .line 23
    .line 24
    .line 25
    invoke-static {v1, v0}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    invoke-static {v1}, Lj$/util/DesugarCollections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzclb;Lcom/google/android/gms/internal/ads/zzbyo;)V
    .locals 2

    .line 1
    const-string v0, "resize"

    .line 2
    .line 3
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ads/zzbyn;-><init>(Lcom/google/android/gms/internal/ads/zzclb;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "top-right"

    .line 7
    .line 8
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzbyh;->zza:Ljava/lang/String;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzbyh;->zzb:Z

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbyh;->zzc:I

    .line 15
    .line 16
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbyh;->zzd:I

    .line 17
    .line 18
    const/4 v1, -0x1

    .line 19
    iput v1, p0, Lcom/google/android/gms/internal/ads/zzbyh;->zze:I

    .line 20
    .line 21
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbyh;->zzf:I

    .line 22
    .line 23
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbyh;->zzg:I

    .line 24
    .line 25
    iput v1, p0, Lcom/google/android/gms/internal/ads/zzbyh;->zzh:I

    .line 26
    .line 27
    new-instance v0, Ljava/lang/Object;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzbyh;->zzi:Ljava/lang/Object;

    .line 33
    .line 34
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbyh;->zzj:Lcom/google/android/gms/internal/ads/zzclb;

    .line 35
    .line 36
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzclb;->zzj()Landroid/app/Activity;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbyh;->zzk:Landroid/app/Activity;

    .line 41
    .line 42
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzbyh;->zzo:Lcom/google/android/gms/internal/ads/zzbyo;

    .line 43
    .line 44
    return-void
.end method

.method private final zzm(Z)V
    .locals 4

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbix;->zzmw:Lcom/google/android/gms/internal/ads/zzbio;

    .line 2
    .line 3
    sget-object v1, LD6/s;->e:LD6/s;

    .line 4
    .line 5
    iget-object v2, v1, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 6
    .line 7
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbyh;->zzq:Landroid/widget/RelativeLayout;

    .line 20
    .line 21
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzbyh;->zzj:Lcom/google/android/gms/internal/ads/zzclb;

    .line 22
    .line 23
    check-cast v2, Landroid/view/View;

    .line 24
    .line 25
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbyh;->zzp:Landroid/widget/PopupWindow;

    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbyh;->zzp:Landroid/widget/PopupWindow;

    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbyh;->zzq:Landroid/widget/RelativeLayout;

    .line 40
    .line 41
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzbyh;->zzj:Lcom/google/android/gms/internal/ads/zzclb;

    .line 42
    .line 43
    check-cast v2, Landroid/view/View;

    .line 44
    .line 45
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 46
    .line 47
    .line 48
    :goto_0
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbix;->zzmx:Lcom/google/android/gms/internal/ads/zzbio;

    .line 49
    .line 50
    iget-object v2, v1, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 51
    .line 52
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, Ljava/lang/Boolean;

    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_1

    .line 63
    .line 64
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbyh;->zzj:Lcom/google/android/gms/internal/ads/zzclb;

    .line 65
    .line 66
    check-cast v0, Landroid/view/View;

    .line 67
    .line 68
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    instance-of v3, v2, Landroid/view/ViewGroup;

    .line 73
    .line 74
    if-eqz v3, :cond_1

    .line 75
    .line 76
    check-cast v2, Landroid/view/ViewGroup;

    .line 77
    .line 78
    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 79
    .line 80
    .line 81
    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbyh;->zzr:Landroid/view/ViewGroup;

    .line 82
    .line 83
    if-eqz v0, :cond_3

    .line 84
    .line 85
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzbyh;->zzm:Landroid/widget/ImageView;

    .line 86
    .line 87
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 88
    .line 89
    .line 90
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbix;->zzmy:Lcom/google/android/gms/internal/ads/zzbio;

    .line 91
    .line 92
    iget-object v1, v1, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 93
    .line 94
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    check-cast v0, Ljava/lang/Boolean;

    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-eqz v0, :cond_2

    .line 105
    .line 106
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbyh;->zzr:Landroid/view/ViewGroup;

    .line 107
    .line 108
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbyh;->zzj:Lcom/google/android/gms/internal/ads/zzclb;

    .line 109
    .line 110
    move-object v2, v1

    .line 111
    check-cast v2, Landroid/view/View;

    .line 112
    .line 113
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 114
    .line 115
    .line 116
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbyh;->zzl:Lcom/google/android/gms/internal/ads/zzcnl;

    .line 117
    .line 118
    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/zzclb;->zzaf(Lcom/google/android/gms/internal/ads/zzcnl;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 119
    .line 120
    .line 121
    goto :goto_1

    .line 122
    :catch_0
    move-exception v0

    .line 123
    sget v1, LG6/L;->b:I

    .line 124
    .line 125
    const-string v1, "Unable to add webview back to view hierarchy."

    .line 126
    .line 127
    invoke-static {v1, v0}, LH6/l;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 128
    .line 129
    .line 130
    sget-object v1, LC6/n;->D:LC6/n;

    .line 131
    .line 132
    iget-object v1, v1, LC6/n;->h:Lcom/google/android/gms/internal/ads/zzcfk;

    .line 133
    .line 134
    const-string v2, "MraidCallResizeHandler.collapseInternal"

    .line 135
    .line 136
    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/ads/zzcfk;->zzh(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbyh;->zzr:Landroid/view/ViewGroup;

    .line 141
    .line 142
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbyh;->zzj:Lcom/google/android/gms/internal/ads/zzclb;

    .line 143
    .line 144
    move-object v2, v1

    .line 145
    check-cast v2, Landroid/view/View;

    .line 146
    .line 147
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 148
    .line 149
    .line 150
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbyh;->zzl:Lcom/google/android/gms/internal/ads/zzcnl;

    .line 151
    .line 152
    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/zzclb;->zzaf(Lcom/google/android/gms/internal/ads/zzcnl;)V

    .line 153
    .line 154
    .line 155
    :cond_3
    :goto_1
    if-eqz p1, :cond_4

    .line 156
    .line 157
    const-string p1, "default"

    .line 158
    .line 159
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzbyn;->zzk(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbyh;->zzo:Lcom/google/android/gms/internal/ads/zzbyo;

    .line 163
    .line 164
    if-eqz p1, :cond_4

    .line 165
    .line 166
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzbyo;->zzb()V

    .line 167
    .line 168
    .line 169
    :cond_4
    const/4 p1, 0x0

    .line 170
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbyh;->zzp:Landroid/widget/PopupWindow;

    .line 171
    .line 172
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbyh;->zzq:Landroid/widget/RelativeLayout;

    .line 173
    .line 174
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbyh;->zzr:Landroid/view/ViewGroup;

    .line 175
    .line 176
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbyh;->zzn:Landroid/widget/LinearLayout;

    .line 177
    .line 178
    return-void
.end method


# virtual methods
.method public final zza(Ljava/util/Map;)V
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzi:Ljava/lang/Object;

    .line 6
    .line 7
    const-string v3, "Cannot show popup window: "

    .line 8
    .line 9
    monitor-enter v2

    .line 10
    :try_start_0
    iget-object v4, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzk:Landroid/app/Activity;

    .line 11
    .line 12
    if-nez v4, :cond_0

    .line 13
    .line 14
    const-string v0, "Not an activity context. Cannot resize."

    .line 15
    .line 16
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbyn;->zzg(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    monitor-exit v2

    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    goto/16 :goto_10

    .line 23
    .line 24
    :cond_0
    iget-object v5, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzj:Lcom/google/android/gms/internal/ads/zzclb;

    .line 25
    .line 26
    invoke-interface {v5}, Lcom/google/android/gms/internal/ads/zzclb;->zzN()Lcom/google/android/gms/internal/ads/zzcnl;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    if-nez v6, :cond_1

    .line 31
    .line 32
    const-string v0, "Webview is not yet available, size is not set."

    .line 33
    .line 34
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbyn;->zzg(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    monitor-exit v2

    .line 38
    return-void

    .line 39
    :cond_1
    invoke-interface {v5}, Lcom/google/android/gms/internal/ads/zzclb;->zzN()Lcom/google/android/gms/internal/ads/zzcnl;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzcnl;->zzg()Z

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    if-eqz v6, :cond_2

    .line 48
    .line 49
    const-string v0, "Is interstitial. Cannot resize an interstitial."

    .line 50
    .line 51
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbyn;->zzg(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    monitor-exit v2

    .line 55
    return-void

    .line 56
    :cond_2
    invoke-interface {v5}, Lcom/google/android/gms/internal/ads/zzclb;->zzW()Z

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    if-eqz v6, :cond_3

    .line 61
    .line 62
    const-string v0, "Cannot resize an expanded banner."

    .line 63
    .line 64
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbyn;->zzg(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    monitor-exit v2

    .line 68
    return-void

    .line 69
    :cond_3
    const-string v6, "width"

    .line 70
    .line 71
    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    check-cast v6, Ljava/lang/CharSequence;

    .line 76
    .line 77
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    if-nez v6, :cond_4

    .line 82
    .line 83
    sget-object v6, LC6/n;->D:LC6/n;

    .line 84
    .line 85
    iget-object v6, v6, LC6/n;->c:LG6/U;

    .line 86
    .line 87
    const-string v6, "width"

    .line 88
    .line 89
    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v6

    .line 93
    check-cast v6, Ljava/lang/String;

    .line 94
    .line 95
    invoke-static {v6}, LG6/U;->n(Ljava/lang/String;)I

    .line 96
    .line 97
    .line 98
    move-result v6

    .line 99
    iput v6, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzh:I

    .line 100
    .line 101
    :cond_4
    const-string v6, "height"

    .line 102
    .line 103
    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    check-cast v6, Ljava/lang/CharSequence;

    .line 108
    .line 109
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 110
    .line 111
    .line 112
    move-result v6

    .line 113
    if-nez v6, :cond_5

    .line 114
    .line 115
    sget-object v6, LC6/n;->D:LC6/n;

    .line 116
    .line 117
    iget-object v6, v6, LC6/n;->c:LG6/U;

    .line 118
    .line 119
    const-string v6, "height"

    .line 120
    .line 121
    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v6

    .line 125
    check-cast v6, Ljava/lang/String;

    .line 126
    .line 127
    invoke-static {v6}, LG6/U;->n(Ljava/lang/String;)I

    .line 128
    .line 129
    .line 130
    move-result v6

    .line 131
    iput v6, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zze:I

    .line 132
    .line 133
    :cond_5
    const-string v6, "offsetX"

    .line 134
    .line 135
    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v6

    .line 139
    check-cast v6, Ljava/lang/CharSequence;

    .line 140
    .line 141
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 142
    .line 143
    .line 144
    move-result v6

    .line 145
    if-nez v6, :cond_6

    .line 146
    .line 147
    sget-object v6, LC6/n;->D:LC6/n;

    .line 148
    .line 149
    iget-object v6, v6, LC6/n;->c:LG6/U;

    .line 150
    .line 151
    const-string v6, "offsetX"

    .line 152
    .line 153
    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v6

    .line 157
    check-cast v6, Ljava/lang/String;

    .line 158
    .line 159
    invoke-static {v6}, LG6/U;->n(Ljava/lang/String;)I

    .line 160
    .line 161
    .line 162
    move-result v6

    .line 163
    iput v6, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzf:I

    .line 164
    .line 165
    :cond_6
    const-string v6, "offsetY"

    .line 166
    .line 167
    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v6

    .line 171
    check-cast v6, Ljava/lang/CharSequence;

    .line 172
    .line 173
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 174
    .line 175
    .line 176
    move-result v6

    .line 177
    if-nez v6, :cond_7

    .line 178
    .line 179
    sget-object v6, LC6/n;->D:LC6/n;

    .line 180
    .line 181
    iget-object v6, v6, LC6/n;->c:LG6/U;

    .line 182
    .line 183
    const-string v6, "offsetY"

    .line 184
    .line 185
    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v6

    .line 189
    check-cast v6, Ljava/lang/String;

    .line 190
    .line 191
    invoke-static {v6}, LG6/U;->n(Ljava/lang/String;)I

    .line 192
    .line 193
    .line 194
    move-result v6

    .line 195
    iput v6, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzg:I

    .line 196
    .line 197
    :cond_7
    const-string v6, "allowOffscreen"

    .line 198
    .line 199
    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v6

    .line 203
    check-cast v6, Ljava/lang/CharSequence;

    .line 204
    .line 205
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 206
    .line 207
    .line 208
    move-result v6

    .line 209
    if-nez v6, :cond_8

    .line 210
    .line 211
    const-string v6, "allowOffscreen"

    .line 212
    .line 213
    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v6

    .line 217
    check-cast v6, Ljava/lang/String;

    .line 218
    .line 219
    invoke-static {v6}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 220
    .line 221
    .line 222
    move-result v6

    .line 223
    iput-boolean v6, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzb:Z

    .line 224
    .line 225
    :cond_8
    const-string v6, "customClosePosition"

    .line 226
    .line 227
    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    check-cast v0, Ljava/lang/String;

    .line 232
    .line 233
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 234
    .line 235
    .line 236
    move-result v6

    .line 237
    if-nez v6, :cond_9

    .line 238
    .line 239
    iput-object v0, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zza:Ljava/lang/String;

    .line 240
    .line 241
    :cond_9
    iget v0, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzh:I

    .line 242
    .line 243
    if-ltz v0, :cond_2c

    .line 244
    .line 245
    iget v0, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zze:I

    .line 246
    .line 247
    if-ltz v0, :cond_2c

    .line 248
    .line 249
    invoke-virtual {v4}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    if-eqz v0, :cond_2b

    .line 254
    .line 255
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 256
    .line 257
    .line 258
    move-result-object v6

    .line 259
    if-nez v6, :cond_a

    .line 260
    .line 261
    goto/16 :goto_f

    .line 262
    .line 263
    :cond_a
    sget-object v6, LC6/n;->D:LC6/n;

    .line 264
    .line 265
    iget-object v6, v6, LC6/n;->c:LG6/U;

    .line 266
    .line 267
    invoke-static {v4}, LG6/U;->p(Landroid/app/Activity;)[I

    .line 268
    .line 269
    .line 270
    move-result-object v6

    .line 271
    sget-object v7, LD6/q;->g:LD6/q;

    .line 272
    .line 273
    iget-object v8, v7, LD6/q;->a:LH6/f;

    .line 274
    .line 275
    const/4 v9, 0x0

    .line 276
    aget v10, v6, v9

    .line 277
    .line 278
    invoke-virtual {v8, v4, v10}, LH6/f;->h(Landroid/content/Context;I)I

    .line 279
    .line 280
    .line 281
    move-result v8

    .line 282
    iget-object v10, v7, LD6/q;->a:LH6/f;

    .line 283
    .line 284
    const/4 v11, 0x1

    .line 285
    aget v6, v6, v11

    .line 286
    .line 287
    invoke-virtual {v10, v4, v6}, LH6/f;->h(Landroid/content/Context;I)I

    .line 288
    .line 289
    .line 290
    move-result v6

    .line 291
    filled-new-array {v8, v6}, [I

    .line 292
    .line 293
    .line 294
    move-result-object v6

    .line 295
    invoke-static {v4}, LG6/U;->q(Landroid/app/Activity;)[I

    .line 296
    .line 297
    .line 298
    move-result-object v8

    .line 299
    aget v10, v6, v9

    .line 300
    .line 301
    aget v6, v6, v11

    .line 302
    .line 303
    iget v12, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzh:I

    .line 304
    .line 305
    const/4 v14, 0x2

    .line 306
    move/from16 v16, v9

    .line 307
    .line 308
    const/16 v13, 0x32

    .line 309
    .line 310
    const/16 v17, 0x0

    .line 311
    .line 312
    if-lt v12, v13, :cond_b

    .line 313
    .line 314
    if-le v12, v10, :cond_c

    .line 315
    .line 316
    :cond_b
    move/from16 v18, v13

    .line 317
    .line 318
    goto/16 :goto_9

    .line 319
    .line 320
    :cond_c
    iget v9, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zze:I

    .line 321
    .line 322
    if-lt v9, v13, :cond_d

    .line 323
    .line 324
    if-le v9, v6, :cond_e

    .line 325
    .line 326
    :cond_d
    move/from16 v18, v13

    .line 327
    .line 328
    goto/16 :goto_8

    .line 329
    .line 330
    :cond_e
    if-ne v9, v6, :cond_f

    .line 331
    .line 332
    if-ne v12, v10, :cond_f

    .line 333
    .line 334
    const-string v6, "Cannot resize to a full-screen ad."

    .line 335
    .line 336
    sget v8, LG6/L;->b:I

    .line 337
    .line 338
    invoke-static {v6}, LH6/l;->f(Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    move/from16 v18, v13

    .line 342
    .line 343
    goto/16 :goto_a

    .line 344
    .line 345
    :cond_f
    iget-boolean v6, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzb:Z

    .line 346
    .line 347
    if-eqz v6, :cond_17

    .line 348
    .line 349
    move/from16 v18, v13

    .line 350
    .line 351
    iget-object v13, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zza:Ljava/lang/String;

    .line 352
    .line 353
    invoke-virtual {v13}, Ljava/lang/String;->hashCode()I

    .line 354
    .line 355
    .line 356
    move-result v19
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 357
    sparse-switch v19, :sswitch_data_0

    .line 358
    .line 359
    .line 360
    goto :goto_0

    .line 361
    :sswitch_0
    const-string v15, "top-center"

    .line 362
    .line 363
    invoke-virtual {v13, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 364
    .line 365
    .line 366
    move-result v13

    .line 367
    if-eqz v13, :cond_10

    .line 368
    .line 369
    move v13, v11

    .line 370
    goto :goto_1

    .line 371
    :sswitch_1
    const-string v15, "bottom-center"

    .line 372
    .line 373
    invoke-virtual {v13, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 374
    .line 375
    .line 376
    move-result v13

    .line 377
    if-eqz v13, :cond_10

    .line 378
    .line 379
    const/4 v13, 0x4

    .line 380
    goto :goto_1

    .line 381
    :sswitch_2
    const-string v15, "bottom-right"

    .line 382
    .line 383
    invoke-virtual {v13, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 384
    .line 385
    .line 386
    move-result v13

    .line 387
    if-eqz v13, :cond_10

    .line 388
    .line 389
    const/4 v13, 0x5

    .line 390
    goto :goto_1

    .line 391
    :sswitch_3
    const-string v15, "bottom-left"

    .line 392
    .line 393
    invoke-virtual {v13, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 394
    .line 395
    .line 396
    move-result v13

    .line 397
    if-eqz v13, :cond_10

    .line 398
    .line 399
    const/4 v13, 0x3

    .line 400
    goto :goto_1

    .line 401
    :sswitch_4
    const-string v15, "top-left"

    .line 402
    .line 403
    invoke-virtual {v13, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 404
    .line 405
    .line 406
    move-result v13

    .line 407
    if-eqz v13, :cond_10

    .line 408
    .line 409
    move/from16 v13, v16

    .line 410
    .line 411
    goto :goto_1

    .line 412
    :sswitch_5
    const-string v15, "center"

    .line 413
    .line 414
    invoke-virtual {v13, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 415
    .line 416
    .line 417
    move-result v13

    .line 418
    if-eqz v13, :cond_10

    .line 419
    .line 420
    move v13, v14

    .line 421
    goto :goto_1

    .line 422
    :cond_10
    :goto_0
    const/4 v13, -0x1

    .line 423
    :goto_1
    if-eqz v13, :cond_16

    .line 424
    .line 425
    if-eq v13, v11, :cond_15

    .line 426
    .line 427
    if-eq v13, v14, :cond_14

    .line 428
    .line 429
    const/4 v15, 0x3

    .line 430
    if-eq v13, v15, :cond_13

    .line 431
    .line 432
    const/4 v15, 0x4

    .line 433
    if-eq v13, v15, :cond_12

    .line 434
    .line 435
    const/4 v15, 0x5

    .line 436
    if-eq v13, v15, :cond_11

    .line 437
    .line 438
    :try_start_1
    iget v9, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzc:I

    .line 439
    .line 440
    iget v13, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzf:I

    .line 441
    .line 442
    add-int/2addr v9, v13

    .line 443
    add-int/2addr v9, v12

    .line 444
    add-int/lit8 v9, v9, -0x32

    .line 445
    .line 446
    iget v12, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzd:I

    .line 447
    .line 448
    :goto_2
    iget v13, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzg:I

    .line 449
    .line 450
    add-int/2addr v12, v13

    .line 451
    goto :goto_5

    .line 452
    :cond_11
    iget v13, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzc:I

    .line 453
    .line 454
    iget v15, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzf:I

    .line 455
    .line 456
    add-int/2addr v13, v15

    .line 457
    add-int/2addr v13, v12

    .line 458
    add-int/lit8 v12, v13, -0x32

    .line 459
    .line 460
    iget v13, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzd:I

    .line 461
    .line 462
    :goto_3
    iget v15, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzg:I

    .line 463
    .line 464
    add-int/2addr v13, v15

    .line 465
    add-int/2addr v13, v9

    .line 466
    add-int/lit8 v9, v13, -0x32

    .line 467
    .line 468
    :goto_4
    move/from16 v20, v12

    .line 469
    .line 470
    move v12, v9

    .line 471
    move/from16 v9, v20

    .line 472
    .line 473
    goto :goto_5

    .line 474
    :cond_12
    iget v13, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzc:I

    .line 475
    .line 476
    iget v15, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzf:I

    .line 477
    .line 478
    shr-int/2addr v12, v11

    .line 479
    add-int/2addr v13, v15

    .line 480
    add-int/2addr v13, v12

    .line 481
    add-int/lit8 v12, v13, -0x19

    .line 482
    .line 483
    iget v13, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzd:I

    .line 484
    .line 485
    goto :goto_3

    .line 486
    :cond_13
    iget v12, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzc:I

    .line 487
    .line 488
    iget v13, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzf:I

    .line 489
    .line 490
    add-int/2addr v12, v13

    .line 491
    iget v13, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzd:I

    .line 492
    .line 493
    goto :goto_3

    .line 494
    :cond_14
    iget v13, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzc:I

    .line 495
    .line 496
    iget v15, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzf:I

    .line 497
    .line 498
    shr-int/2addr v12, v11

    .line 499
    add-int/2addr v13, v15

    .line 500
    add-int/2addr v13, v12

    .line 501
    add-int/lit8 v12, v13, -0x19

    .line 502
    .line 503
    iget v13, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzd:I

    .line 504
    .line 505
    iget v15, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzg:I

    .line 506
    .line 507
    add-int/2addr v13, v15

    .line 508
    shr-int/2addr v9, v11

    .line 509
    add-int/2addr v13, v9

    .line 510
    add-int/lit8 v9, v13, -0x19

    .line 511
    .line 512
    goto :goto_4

    .line 513
    :cond_15
    iget v9, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzc:I

    .line 514
    .line 515
    iget v13, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzf:I

    .line 516
    .line 517
    shr-int/2addr v12, v11

    .line 518
    add-int/2addr v9, v13

    .line 519
    add-int/2addr v9, v12

    .line 520
    add-int/lit8 v9, v9, -0x19

    .line 521
    .line 522
    iget v12, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzd:I

    .line 523
    .line 524
    goto :goto_2

    .line 525
    :cond_16
    iget v9, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzc:I

    .line 526
    .line 527
    iget v12, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzf:I

    .line 528
    .line 529
    add-int/2addr v9, v12

    .line 530
    iget v12, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzd:I

    .line 531
    .line 532
    goto :goto_2

    .line 533
    :goto_5
    if-ltz v9, :cond_1e

    .line 534
    .line 535
    add-int/lit8 v9, v9, 0x32

    .line 536
    .line 537
    if-gt v9, v10, :cond_1e

    .line 538
    .line 539
    aget v9, v8, v16

    .line 540
    .line 541
    if-lt v12, v9, :cond_1e

    .line 542
    .line 543
    add-int/lit8 v12, v12, 0x32

    .line 544
    .line 545
    aget v8, v8, v11

    .line 546
    .line 547
    if-le v12, v8, :cond_18

    .line 548
    .line 549
    goto/16 :goto_a

    .line 550
    .line 551
    :cond_17
    move/from16 v18, v13

    .line 552
    .line 553
    :cond_18
    if-eqz v6, :cond_19

    .line 554
    .line 555
    iget v6, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzc:I

    .line 556
    .line 557
    iget v8, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzf:I

    .line 558
    .line 559
    add-int/2addr v6, v8

    .line 560
    iget v8, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzd:I

    .line 561
    .line 562
    iget v9, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzg:I

    .line 563
    .line 564
    add-int/2addr v8, v9

    .line 565
    filled-new-array {v6, v8}, [I

    .line 566
    .line 567
    .line 568
    move-result-object v17

    .line 569
    goto :goto_a

    .line 570
    :cond_19
    invoke-static {v4}, LG6/U;->p(Landroid/app/Activity;)[I

    .line 571
    .line 572
    .line 573
    move-result-object v6

    .line 574
    iget-object v8, v7, LD6/q;->a:LH6/f;

    .line 575
    .line 576
    aget v9, v6, v16

    .line 577
    .line 578
    invoke-virtual {v8, v4, v9}, LH6/f;->h(Landroid/content/Context;I)I

    .line 579
    .line 580
    .line 581
    move-result v8

    .line 582
    iget-object v9, v7, LD6/q;->a:LH6/f;

    .line 583
    .line 584
    aget v6, v6, v11

    .line 585
    .line 586
    invoke-virtual {v9, v4, v6}, LH6/f;->h(Landroid/content/Context;I)I

    .line 587
    .line 588
    .line 589
    move-result v6

    .line 590
    filled-new-array {v8, v6}, [I

    .line 591
    .line 592
    .line 593
    move-result-object v6

    .line 594
    invoke-static {v4}, LG6/U;->q(Landroid/app/Activity;)[I

    .line 595
    .line 596
    .line 597
    move-result-object v8

    .line 598
    aget v6, v6, v16

    .line 599
    .line 600
    iget v9, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzc:I

    .line 601
    .line 602
    iget v10, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzf:I

    .line 603
    .line 604
    add-int/2addr v9, v10

    .line 605
    iget v10, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzd:I

    .line 606
    .line 607
    iget v12, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzg:I

    .line 608
    .line 609
    add-int/2addr v10, v12

    .line 610
    if-gez v9, :cond_1a

    .line 611
    .line 612
    move/from16 v6, v16

    .line 613
    .line 614
    goto :goto_6

    .line 615
    :cond_1a
    iget v12, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzh:I

    .line 616
    .line 617
    add-int v13, v9, v12

    .line 618
    .line 619
    if-le v13, v6, :cond_1b

    .line 620
    .line 621
    sub-int/2addr v6, v12

    .line 622
    goto :goto_6

    .line 623
    :cond_1b
    move v6, v9

    .line 624
    :goto_6
    aget v9, v8, v16

    .line 625
    .line 626
    if-ge v10, v9, :cond_1c

    .line 627
    .line 628
    move v10, v9

    .line 629
    goto :goto_7

    .line 630
    :cond_1c
    iget v9, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zze:I

    .line 631
    .line 632
    add-int v12, v10, v9

    .line 633
    .line 634
    aget v8, v8, v11

    .line 635
    .line 636
    if-le v12, v8, :cond_1d

    .line 637
    .line 638
    sub-int v10, v8, v9

    .line 639
    .line 640
    :cond_1d
    :goto_7
    filled-new-array {v6, v10}, [I

    .line 641
    .line 642
    .line 643
    move-result-object v17

    .line 644
    goto :goto_a

    .line 645
    :goto_8
    const-string v6, "Height is too small or too large."

    .line 646
    .line 647
    sget v8, LG6/L;->b:I

    .line 648
    .line 649
    invoke-static {v6}, LH6/l;->f(Ljava/lang/String;)V

    .line 650
    .line 651
    .line 652
    goto :goto_a

    .line 653
    :goto_9
    const-string v6, "Width is too small or too large."

    .line 654
    .line 655
    sget v8, LG6/L;->b:I

    .line 656
    .line 657
    invoke-static {v6}, LH6/l;->f(Ljava/lang/String;)V

    .line 658
    .line 659
    .line 660
    :cond_1e
    :goto_a
    if-nez v17, :cond_1f

    .line 661
    .line 662
    const-string v0, "Resize location out of screen or close button is not visible."

    .line 663
    .line 664
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbyn;->zzg(Ljava/lang/String;)V

    .line 665
    .line 666
    .line 667
    monitor-exit v2

    .line 668
    return-void

    .line 669
    :cond_1f
    iget-object v6, v7, LD6/q;->a:LH6/f;

    .line 670
    .line 671
    iget v6, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzh:I

    .line 672
    .line 673
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 674
    .line 675
    .line 676
    move-result-object v7

    .line 677
    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 678
    .line 679
    .line 680
    move-result-object v7

    .line 681
    invoke-static {v7, v6}, LH6/f;->s(Landroid/util/DisplayMetrics;I)I

    .line 682
    .line 683
    .line 684
    move-result v6

    .line 685
    iget v7, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zze:I

    .line 686
    .line 687
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 688
    .line 689
    .line 690
    move-result-object v8

    .line 691
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 692
    .line 693
    .line 694
    move-result-object v8

    .line 695
    invoke-static {v8, v7}, LH6/f;->s(Landroid/util/DisplayMetrics;I)I

    .line 696
    .line 697
    .line 698
    move-result v7

    .line 699
    move-object v8, v5

    .line 700
    check-cast v8, Landroid/view/View;

    .line 701
    .line 702
    invoke-virtual {v8}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 703
    .line 704
    .line 705
    move-result-object v8

    .line 706
    instance-of v9, v8, Landroid/view/ViewGroup;

    .line 707
    .line 708
    if-eqz v9, :cond_2a

    .line 709
    .line 710
    check-cast v8, Landroid/view/ViewGroup;

    .line 711
    .line 712
    move-object v9, v5

    .line 713
    check-cast v9, Landroid/view/View;

    .line 714
    .line 715
    invoke-virtual {v8, v9}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 716
    .line 717
    .line 718
    iget-object v9, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzp:Landroid/widget/PopupWindow;

    .line 719
    .line 720
    if-nez v9, :cond_20

    .line 721
    .line 722
    iput-object v8, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzr:Landroid/view/ViewGroup;

    .line 723
    .line 724
    move-object v8, v5

    .line 725
    check-cast v8, Landroid/view/View;

    .line 726
    .line 727
    invoke-virtual {v8, v11}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 728
    .line 729
    .line 730
    move-object v8, v5

    .line 731
    check-cast v8, Landroid/view/View;

    .line 732
    .line 733
    invoke-virtual {v8}, Landroid/view/View;->getDrawingCache()Landroid/graphics/Bitmap;

    .line 734
    .line 735
    .line 736
    move-result-object v8

    .line 737
    invoke-static {v8}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 738
    .line 739
    .line 740
    move-result-object v8

    .line 741
    move-object v9, v5

    .line 742
    check-cast v9, Landroid/view/View;

    .line 743
    .line 744
    move/from16 v10, v16

    .line 745
    .line 746
    invoke-virtual {v9, v10}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 747
    .line 748
    .line 749
    new-instance v9, Landroid/widget/ImageView;

    .line 750
    .line 751
    invoke-direct {v9, v4}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 752
    .line 753
    .line 754
    iput-object v9, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzm:Landroid/widget/ImageView;

    .line 755
    .line 756
    invoke-virtual {v9, v8}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 757
    .line 758
    .line 759
    invoke-interface {v5}, Lcom/google/android/gms/internal/ads/zzclb;->zzN()Lcom/google/android/gms/internal/ads/zzcnl;

    .line 760
    .line 761
    .line 762
    move-result-object v8

    .line 763
    iput-object v8, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzl:Lcom/google/android/gms/internal/ads/zzcnl;

    .line 764
    .line 765
    iget-object v8, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzr:Landroid/view/ViewGroup;

    .line 766
    .line 767
    iget-object v9, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzm:Landroid/widget/ImageView;

    .line 768
    .line 769
    invoke-virtual {v8, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 770
    .line 771
    .line 772
    goto :goto_b

    .line 773
    :cond_20
    invoke-virtual {v9}, Landroid/widget/PopupWindow;->dismiss()V

    .line 774
    .line 775
    .line 776
    :goto_b
    new-instance v8, Landroid/widget/RelativeLayout;

    .line 777
    .line 778
    invoke-direct {v8, v4}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 779
    .line 780
    .line 781
    iput-object v8, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzq:Landroid/widget/RelativeLayout;

    .line 782
    .line 783
    const/4 v10, 0x0

    .line 784
    invoke-virtual {v8, v10}, Landroid/view/View;->setBackgroundColor(I)V

    .line 785
    .line 786
    .line 787
    iget-object v8, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzq:Landroid/widget/RelativeLayout;

    .line 788
    .line 789
    new-instance v9, Landroid/view/ViewGroup$LayoutParams;

    .line 790
    .line 791
    invoke-direct {v9, v6, v7}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 792
    .line 793
    .line 794
    invoke-virtual {v8, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 795
    .line 796
    .line 797
    iget-object v8, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzq:Landroid/widget/RelativeLayout;

    .line 798
    .line 799
    new-instance v9, Landroid/widget/PopupWindow;

    .line 800
    .line 801
    const/4 v10, 0x0

    .line 802
    invoke-direct {v9, v8, v6, v7, v10}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;IIZ)V

    .line 803
    .line 804
    .line 805
    iput-object v9, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzp:Landroid/widget/PopupWindow;

    .line 806
    .line 807
    invoke-virtual {v9, v10}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 808
    .line 809
    .line 810
    iget-object v8, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzp:Landroid/widget/PopupWindow;

    .line 811
    .line 812
    invoke-virtual {v8, v11}, Landroid/widget/PopupWindow;->setTouchable(Z)V

    .line 813
    .line 814
    .line 815
    iget-object v8, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzp:Landroid/widget/PopupWindow;

    .line 816
    .line 817
    iget-boolean v9, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzb:Z

    .line 818
    .line 819
    xor-int/2addr v9, v11

    .line 820
    invoke-virtual {v8, v9}, Landroid/widget/PopupWindow;->setClippingEnabled(Z)V

    .line 821
    .line 822
    .line 823
    iget-object v8, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzq:Landroid/widget/RelativeLayout;

    .line 824
    .line 825
    check-cast v5, Landroid/view/View;

    .line 826
    .line 827
    const/4 v9, -0x1

    .line 828
    invoke-virtual {v8, v5, v9, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    .line 829
    .line 830
    .line 831
    new-instance v5, Landroid/widget/LinearLayout;

    .line 832
    .line 833
    invoke-direct {v5, v4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 834
    .line 835
    .line 836
    iput-object v5, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzn:Landroid/widget/LinearLayout;

    .line 837
    .line 838
    new-instance v5, Landroid/widget/RelativeLayout$LayoutParams;

    .line 839
    .line 840
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 841
    .line 842
    .line 843
    move-result-object v8

    .line 844
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 845
    .line 846
    .line 847
    move-result-object v8

    .line 848
    move/from16 v10, v18

    .line 849
    .line 850
    invoke-static {v8, v10}, LH6/f;->s(Landroid/util/DisplayMetrics;I)I

    .line 851
    .line 852
    .line 853
    move-result v8

    .line 854
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 855
    .line 856
    .line 857
    move-result-object v12

    .line 858
    invoke-virtual {v12}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 859
    .line 860
    .line 861
    move-result-object v12

    .line 862
    invoke-static {v12, v10}, LH6/f;->s(Landroid/util/DisplayMetrics;I)I

    .line 863
    .line 864
    .line 865
    move-result v10

    .line 866
    invoke-direct {v5, v8, v10}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 867
    .line 868
    .line 869
    iget-object v8, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zza:Ljava/lang/String;

    .line 870
    .line 871
    invoke-virtual {v8}, Ljava/lang/String;->hashCode()I

    .line 872
    .line 873
    .line 874
    move-result v10
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 875
    sparse-switch v10, :sswitch_data_1

    .line 876
    .line 877
    .line 878
    goto :goto_c

    .line 879
    :sswitch_6
    const-string v10, "top-center"

    .line 880
    .line 881
    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 882
    .line 883
    .line 884
    move-result v8

    .line 885
    if-eqz v8, :cond_21

    .line 886
    .line 887
    move v13, v11

    .line 888
    goto :goto_d

    .line 889
    :sswitch_7
    const-string v10, "bottom-center"

    .line 890
    .line 891
    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 892
    .line 893
    .line 894
    move-result v8

    .line 895
    if-eqz v8, :cond_21

    .line 896
    .line 897
    const/4 v13, 0x4

    .line 898
    goto :goto_d

    .line 899
    :sswitch_8
    const-string v10, "bottom-right"

    .line 900
    .line 901
    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 902
    .line 903
    .line 904
    move-result v8

    .line 905
    if-eqz v8, :cond_21

    .line 906
    .line 907
    const/4 v13, 0x5

    .line 908
    goto :goto_d

    .line 909
    :sswitch_9
    const-string v10, "bottom-left"

    .line 910
    .line 911
    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 912
    .line 913
    .line 914
    move-result v8

    .line 915
    if-eqz v8, :cond_21

    .line 916
    .line 917
    const/4 v13, 0x3

    .line 918
    goto :goto_d

    .line 919
    :sswitch_a
    const-string v10, "top-left"

    .line 920
    .line 921
    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 922
    .line 923
    .line 924
    move-result v8

    .line 925
    if-eqz v8, :cond_21

    .line 926
    .line 927
    const/4 v13, 0x0

    .line 928
    goto :goto_d

    .line 929
    :sswitch_b
    const-string v10, "center"

    .line 930
    .line 931
    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 932
    .line 933
    .line 934
    move-result v8

    .line 935
    if-eqz v8, :cond_21

    .line 936
    .line 937
    move v13, v14

    .line 938
    goto :goto_d

    .line 939
    :cond_21
    :goto_c
    move v13, v9

    .line 940
    :goto_d
    const/16 v8, 0x9

    .line 941
    .line 942
    const/16 v9, 0xa

    .line 943
    .line 944
    if-eqz v13, :cond_27

    .line 945
    .line 946
    const/16 v10, 0xe

    .line 947
    .line 948
    if-eq v13, v11, :cond_26

    .line 949
    .line 950
    if-eq v13, v14, :cond_25

    .line 951
    .line 952
    const/16 v12, 0xc

    .line 953
    .line 954
    const/4 v15, 0x3

    .line 955
    if-eq v13, v15, :cond_24

    .line 956
    .line 957
    const/4 v15, 0x4

    .line 958
    if-eq v13, v15, :cond_23

    .line 959
    .line 960
    const/16 v8, 0xb

    .line 961
    .line 962
    const/4 v15, 0x5

    .line 963
    if-eq v13, v15, :cond_22

    .line 964
    .line 965
    :try_start_2
    invoke-virtual {v5, v9}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 966
    .line 967
    .line 968
    invoke-virtual {v5, v8}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 969
    .line 970
    .line 971
    goto :goto_e

    .line 972
    :cond_22
    invoke-virtual {v5, v12}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 973
    .line 974
    .line 975
    invoke-virtual {v5, v8}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 976
    .line 977
    .line 978
    goto :goto_e

    .line 979
    :cond_23
    invoke-virtual {v5, v12}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 980
    .line 981
    .line 982
    invoke-virtual {v5, v10}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 983
    .line 984
    .line 985
    goto :goto_e

    .line 986
    :cond_24
    invoke-virtual {v5, v12}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 987
    .line 988
    .line 989
    invoke-virtual {v5, v8}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 990
    .line 991
    .line 992
    goto :goto_e

    .line 993
    :cond_25
    const/16 v8, 0xd

    .line 994
    .line 995
    invoke-virtual {v5, v8}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 996
    .line 997
    .line 998
    goto :goto_e

    .line 999
    :cond_26
    invoke-virtual {v5, v9}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 1000
    .line 1001
    .line 1002
    invoke-virtual {v5, v10}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 1003
    .line 1004
    .line 1005
    goto :goto_e

    .line 1006
    :cond_27
    invoke-virtual {v5, v9}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 1007
    .line 1008
    .line 1009
    invoke-virtual {v5, v8}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 1010
    .line 1011
    .line 1012
    :goto_e
    iget-object v8, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzn:Landroid/widget/LinearLayout;

    .line 1013
    .line 1014
    new-instance v9, Lcom/google/android/gms/internal/ads/zzbyf;

    .line 1015
    .line 1016
    invoke-direct {v9, v1}, Lcom/google/android/gms/internal/ads/zzbyf;-><init>(Lcom/google/android/gms/internal/ads/zzbyh;)V

    .line 1017
    .line 1018
    .line 1019
    invoke-virtual {v8, v9}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1020
    .line 1021
    .line 1022
    iget-object v8, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzn:Landroid/widget/LinearLayout;

    .line 1023
    .line 1024
    const-string v9, "Close button"

    .line 1025
    .line 1026
    invoke-virtual {v8, v9}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 1027
    .line 1028
    .line 1029
    iget-object v8, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzq:Landroid/widget/RelativeLayout;

    .line 1030
    .line 1031
    iget-object v9, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzn:Landroid/widget/LinearLayout;

    .line 1032
    .line 1033
    invoke-virtual {v8, v9, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1034
    .line 1035
    .line 1036
    :try_start_3
    iget-object v5, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzp:Landroid/widget/PopupWindow;

    .line 1037
    .line 1038
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v0

    .line 1042
    const/16 v16, 0x0

    .line 1043
    .line 1044
    aget v8, v17, v16

    .line 1045
    .line 1046
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1047
    .line 1048
    .line 1049
    move-result-object v9

    .line 1050
    invoke-virtual {v9}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v9

    .line 1054
    invoke-static {v9, v8}, LH6/f;->s(Landroid/util/DisplayMetrics;I)I

    .line 1055
    .line 1056
    .line 1057
    move-result v8

    .line 1058
    aget v9, v17, v11

    .line 1059
    .line 1060
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v4

    .line 1064
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v4

    .line 1068
    invoke-static {v4, v9}, LH6/f;->s(Landroid/util/DisplayMetrics;I)I

    .line 1069
    .line 1070
    .line 1071
    move-result v4

    .line 1072
    const/4 v10, 0x0

    .line 1073
    invoke-virtual {v5, v0, v10, v8, v4}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 1074
    .line 1075
    .line 1076
    :try_start_4
    aget v0, v17, v10

    .line 1077
    .line 1078
    aget v3, v17, v11

    .line 1079
    .line 1080
    iget-object v4, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzo:Lcom/google/android/gms/internal/ads/zzbyo;

    .line 1081
    .line 1082
    if-eqz v4, :cond_28

    .line 1083
    .line 1084
    iget v5, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzh:I

    .line 1085
    .line 1086
    iget v8, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zze:I

    .line 1087
    .line 1088
    invoke-interface {v4, v0, v3, v5, v8}, Lcom/google/android/gms/internal/ads/zzbyo;->zza(IIII)V

    .line 1089
    .line 1090
    .line 1091
    :cond_28
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzj:Lcom/google/android/gms/internal/ads/zzclb;

    .line 1092
    .line 1093
    invoke-static {v6, v7}, Lcom/google/android/gms/internal/ads/zzcnl;->zzc(II)Lcom/google/android/gms/internal/ads/zzcnl;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v3

    .line 1097
    invoke-interface {v0, v3}, Lcom/google/android/gms/internal/ads/zzclb;->zzaf(Lcom/google/android/gms/internal/ads/zzcnl;)V

    .line 1098
    .line 1099
    .line 1100
    const/16 v16, 0x0

    .line 1101
    .line 1102
    aget v0, v17, v16

    .line 1103
    .line 1104
    aget v3, v17, v11

    .line 1105
    .line 1106
    iget-object v4, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzk:Landroid/app/Activity;

    .line 1107
    .line 1108
    invoke-static {v4}, LG6/U;->q(Landroid/app/Activity;)[I

    .line 1109
    .line 1110
    .line 1111
    move-result-object v4

    .line 1112
    aget v4, v4, v16

    .line 1113
    .line 1114
    sub-int/2addr v3, v4

    .line 1115
    iget v4, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzh:I

    .line 1116
    .line 1117
    iget v5, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zze:I

    .line 1118
    .line 1119
    invoke-virtual {v1, v0, v3, v4, v5}, Lcom/google/android/gms/internal/ads/zzbyn;->zzi(IIII)V

    .line 1120
    .line 1121
    .line 1122
    const-string v0, "resized"

    .line 1123
    .line 1124
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbyn;->zzk(Ljava/lang/String;)V

    .line 1125
    .line 1126
    .line 1127
    monitor-exit v2

    .line 1128
    return-void

    .line 1129
    :catch_0
    move-exception v0

    .line 1130
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1131
    .line 1132
    .line 1133
    move-result-object v0

    .line 1134
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1135
    .line 1136
    .line 1137
    move-result-object v4

    .line 1138
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 1139
    .line 1140
    .line 1141
    move-result v4

    .line 1142
    add-int/lit8 v4, v4, 0x1a

    .line 1143
    .line 1144
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1145
    .line 1146
    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1147
    .line 1148
    .line 1149
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1150
    .line 1151
    .line 1152
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1153
    .line 1154
    .line 1155
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1156
    .line 1157
    .line 1158
    move-result-object v0

    .line 1159
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbyn;->zzg(Ljava/lang/String;)V

    .line 1160
    .line 1161
    .line 1162
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzq:Landroid/widget/RelativeLayout;

    .line 1163
    .line 1164
    iget-object v3, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzj:Lcom/google/android/gms/internal/ads/zzclb;

    .line 1165
    .line 1166
    move-object v4, v3

    .line 1167
    check-cast v4, Landroid/view/View;

    .line 1168
    .line 1169
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 1170
    .line 1171
    .line 1172
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzr:Landroid/view/ViewGroup;

    .line 1173
    .line 1174
    if-eqz v0, :cond_29

    .line 1175
    .line 1176
    iget-object v4, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzm:Landroid/widget/ImageView;

    .line 1177
    .line 1178
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 1179
    .line 1180
    .line 1181
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzr:Landroid/view/ViewGroup;

    .line 1182
    .line 1183
    move-object v4, v3

    .line 1184
    check-cast v4, Landroid/view/View;

    .line 1185
    .line 1186
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1187
    .line 1188
    .line 1189
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzbyh;->zzl:Lcom/google/android/gms/internal/ads/zzcnl;

    .line 1190
    .line 1191
    invoke-interface {v3, v0}, Lcom/google/android/gms/internal/ads/zzclb;->zzaf(Lcom/google/android/gms/internal/ads/zzcnl;)V

    .line 1192
    .line 1193
    .line 1194
    :cond_29
    monitor-exit v2

    .line 1195
    return-void

    .line 1196
    :cond_2a
    const-string v0, "Webview is detached, probably in the middle of a resize or expand."

    .line 1197
    .line 1198
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbyn;->zzg(Ljava/lang/String;)V

    .line 1199
    .line 1200
    .line 1201
    monitor-exit v2

    .line 1202
    return-void

    .line 1203
    :cond_2b
    :goto_f
    const-string v0, "Activity context is not ready, cannot get window or decor view."

    .line 1204
    .line 1205
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbyn;->zzg(Ljava/lang/String;)V

    .line 1206
    .line 1207
    .line 1208
    monitor-exit v2

    .line 1209
    return-void

    .line 1210
    :cond_2c
    const-string v0, "Invalid width and height options. Cannot resize."

    .line 1211
    .line 1212
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbyn;->zzg(Ljava/lang/String;)V

    .line 1213
    .line 1214
    .line 1215
    monitor-exit v2

    .line 1216
    return-void

    .line 1217
    :goto_10
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 1218
    throw v0

    .line 1219
    :sswitch_data_0
    .sparse-switch
        -0x514d33ab -> :sswitch_5
        -0x3c587281 -> :sswitch_4
        -0x27103597 -> :sswitch_3
        0x455fe3fa -> :sswitch_2
        0x4ccee637 -> :sswitch_1
        0x68a23bcd -> :sswitch_0
    .end sparse-switch

    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    :sswitch_data_1
    .sparse-switch
        -0x514d33ab -> :sswitch_b
        -0x3c587281 -> :sswitch_a
        -0x27103597 -> :sswitch_9
        0x455fe3fa -> :sswitch_8
        0x4ccee637 -> :sswitch_7
        0x68a23bcd -> :sswitch_6
    .end sparse-switch
.end method

.method public final zzb(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbyh;->zzi:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbyh;->zzp:Landroid/widget/PopupWindow;

    .line 5
    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbix;->zzmv:Lcom/google/android/gms/internal/ads/zzbio;

    .line 9
    .line 10
    sget-object v2, LD6/s;->e:LD6/s;

    .line 11
    .line 12
    iget-object v2, v2, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 13
    .line 14
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Ljava/lang/Boolean;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    if-eq v1, v2, :cond_0

    .line 39
    .line 40
    sget-object v1, Lcom/google/android/gms/internal/ads/zzcfy;->zzf:Lcom/google/android/gms/internal/ads/zzhcp;

    .line 41
    .line 42
    new-instance v2, Lcom/google/android/gms/internal/ads/zzbyg;

    .line 43
    .line 44
    invoke-direct {v2, p0, p1}, Lcom/google/android/gms/internal/ads/zzbyg;-><init>(Lcom/google/android/gms/internal/ads/zzbyh;Z)V

    .line 45
    .line 46
    .line 47
    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/zzhcp;->zza(Ljava/lang/Runnable;)Lp8/p;

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    move-exception p1

    .line 52
    goto :goto_1

    .line 53
    :cond_0
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzbyh;->zzm(Z)V

    .line 54
    .line 55
    .line 56
    :cond_1
    :goto_0
    monitor-exit v0

    .line 57
    return-void

    .line 58
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    throw p1
.end method

.method public final zzc(IIZ)V
    .locals 0

    .line 1
    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzbyh;->zzi:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter p3

    .line 4
    :try_start_0
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzbyh;->zzc:I

    .line 5
    .line 6
    iput p2, p0, Lcom/google/android/gms/internal/ads/zzbyh;->zzd:I

    .line 7
    .line 8
    monitor-exit p3

    .line 9
    return-void

    .line 10
    :catchall_0
    move-exception p1

    .line 11
    monitor-exit p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    throw p1
.end method

.method public final zzd()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbyh;->zzi:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbyh;->zzp:Landroid/widget/PopupWindow;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v1, 0x0

    .line 11
    :goto_0
    monitor-exit v0

    .line 12
    return v1

    .line 13
    :catchall_0
    move-exception v1

    .line 14
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    throw v1
.end method

.method public final zze(II)V
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzbyh;->zzc:I

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzbyh;->zzd:I

    return-void
.end method

.method public final synthetic zzf(Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzbyh;->zzm(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
