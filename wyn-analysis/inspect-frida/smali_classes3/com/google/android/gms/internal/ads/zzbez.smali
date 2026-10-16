.class public final Lcom/google/android/gms/internal/ads/zzbez;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
.implements Landroid/view/ViewTreeObserver$OnScrollChangedListener;
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# static fields
.field private static final zzc:J


# instance fields
.field zza:Landroid/content/BroadcastReceiver;

.field final zzb:Ljava/lang/ref/WeakReference;

.field private final zzd:Landroid/content/Context;

.field private zze:Landroid/app/Application;

.field private final zzf:Landroid/view/WindowManager;

.field private final zzg:Landroid/os/PowerManager;

.field private final zzh:Landroid/app/KeyguardManager;

.field private zzi:Ljava/lang/ref/WeakReference;

.field private zzj:Lcom/google/android/gms/internal/ads/zzbfl;

.field private final zzk:LG6/C;

.field private zzl:Z

.field private zzm:I

.field private final zzn:Ljava/util/HashSet;

.field private final zzo:Landroid/util/DisplayMetrics;

.field private final zzp:Landroid/graphics/Rect;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbix;->zzcd:Lcom/google/android/gms/internal/ads/zzbio;

    .line 2
    .line 3
    sget-object v1, LD6/s;->e:LD6/s;

    .line 4
    .line 5
    iget-object v1, v1, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/Long;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    sput-wide v0, Lcom/google/android/gms/internal/ads/zzbez;->zzc:J

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LG6/C;

    .line 5
    .line 6
    sget-wide v1, Lcom/google/android/gms/internal/ads/zzbez;->zzc:J

    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, LG6/C;-><init>(J)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzk:LG6/C;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzl:Z

    .line 15
    .line 16
    const/4 v0, -0x1

    .line 17
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzm:I

    .line 18
    .line 19
    new-instance v0, Ljava/util/HashSet;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzn:Ljava/util/HashSet;

    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzd:Landroid/content/Context;

    .line 31
    .line 32
    const-string v1, "window"

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Landroid/view/WindowManager;

    .line 39
    .line 40
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzf:Landroid/view/WindowManager;

    .line 41
    .line 42
    const-string v2, "power"

    .line 43
    .line 44
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    check-cast v2, Landroid/os/PowerManager;

    .line 49
    .line 50
    iput-object v2, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzg:Landroid/os/PowerManager;

    .line 51
    .line 52
    const-string v2, "keyguard"

    .line 53
    .line 54
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    check-cast v2, Landroid/app/KeyguardManager;

    .line 59
    .line 60
    iput-object v2, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzh:Landroid/app/KeyguardManager;

    .line 61
    .line 62
    instance-of v2, v0, Landroid/app/Application;

    .line 63
    .line 64
    if-eqz v2, :cond_0

    .line 65
    .line 66
    move-object v2, v0

    .line 67
    check-cast v2, Landroid/app/Application;

    .line 68
    .line 69
    iput-object v2, p0, Lcom/google/android/gms/internal/ads/zzbez;->zze:Landroid/app/Application;

    .line 70
    .line 71
    new-instance v2, Lcom/google/android/gms/internal/ads/zzbfl;

    .line 72
    .line 73
    check-cast v0, Landroid/app/Application;

    .line 74
    .line 75
    invoke-direct {v2, v0, p0}, Lcom/google/android/gms/internal/ads/zzbfl;-><init>(Landroid/app/Application;Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 76
    .line 77
    .line 78
    iput-object v2, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzj:Lcom/google/android/gms/internal/ads/zzbfl;

    .line 79
    .line 80
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzo:Landroid/util/DisplayMetrics;

    .line 89
    .line 90
    new-instance p1, Landroid/graphics/Rect;

    .line 91
    .line 92
    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    .line 93
    .line 94
    .line 95
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzp:Landroid/graphics/Rect;

    .line 96
    .line 97
    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    iput v0, p1, Landroid/graphics/Rect;->right:I

    .line 106
    .line 107
    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-virtual {v0}, Landroid/view/Display;->getHeight()I

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    iput v0, p1, Landroid/graphics/Rect;->bottom:I

    .line 116
    .line 117
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzb:Ljava/lang/ref/WeakReference;

    .line 118
    .line 119
    if-eqz p1, :cond_1

    .line 120
    .line 121
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    check-cast p1, Landroid/view/View;

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_1
    const/4 p1, 0x0

    .line 129
    :goto_0
    if-eqz p1, :cond_2

    .line 130
    .line 131
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 132
    .line 133
    .line 134
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzbez;->zzm(Landroid/view/View;)V

    .line 135
    .line 136
    .line 137
    :cond_2
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 138
    .line 139
    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzb:Ljava/lang/ref/WeakReference;

    .line 143
    .line 144
    if-eqz p2, :cond_4

    .line 145
    .line 146
    invoke-virtual {p2}, Landroid/view/View;->isAttachedToWindow()Z

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    if-eqz p1, :cond_3

    .line 151
    .line 152
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/ads/zzbez;->zzl(Landroid/view/View;)V

    .line 153
    .line 154
    .line 155
    :cond_3
    invoke-virtual {p2, p0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 156
    .line 157
    .line 158
    :cond_4
    return-void
.end method

.method private final zzh()V
    .locals 2

    .line 1
    sget-object v0, LG6/U;->l:LG6/M;

    .line 2
    .line 3
    new-instance v1, Lcom/google/android/gms/internal/ads/zzbey;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/zzbey;-><init>(Lcom/google/android/gms/internal/ads/zzbez;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private final zzi(Landroid/app/Activity;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzb:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Landroid/view/View;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    if-ne v0, p1, :cond_1

    .line 35
    .line 36
    iput p2, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzm:I

    .line 37
    .line 38
    :cond_1
    :goto_0
    return-void
.end method

.method private final zzj(I)V
    .locals 32

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v2, p1

    .line 4
    .line 5
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzbez;->zzn:Ljava/util/HashSet;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_14

    .line 14
    .line 15
    :cond_0
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzbez;->zzb:Ljava/lang/ref/WeakReference;

    .line 16
    .line 17
    if-eqz v0, :cond_18

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    move-object v3, v0

    .line 24
    check-cast v3, Landroid/view/View;

    .line 25
    .line 26
    new-instance v4, Landroid/graphics/Rect;

    .line 27
    .line 28
    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    .line 29
    .line 30
    .line 31
    new-instance v5, Landroid/graphics/Rect;

    .line 32
    .line 33
    invoke-direct {v5}, Landroid/graphics/Rect;-><init>()V

    .line 34
    .line 35
    .line 36
    new-instance v6, Landroid/graphics/Rect;

    .line 37
    .line 38
    invoke-direct {v6}, Landroid/graphics/Rect;-><init>()V

    .line 39
    .line 40
    .line 41
    new-instance v7, Landroid/graphics/Rect;

    .line 42
    .line 43
    invoke-direct {v7}, Landroid/graphics/Rect;-><init>()V

    .line 44
    .line 45
    .line 46
    const/4 v0, 0x2

    .line 47
    new-array v8, v0, [I

    .line 48
    .line 49
    new-array v9, v0, [I

    .line 50
    .line 51
    const/4 v10, 0x1

    .line 52
    const/4 v11, 0x0

    .line 53
    if-eqz v3, :cond_2

    .line 54
    .line 55
    invoke-virtual {v3, v5}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 56
    .line 57
    .line 58
    move-result v12

    .line 59
    invoke-virtual {v3, v6}, Landroid/view/View;->getLocalVisibleRect(Landroid/graphics/Rect;)Z

    .line 60
    .line 61
    .line 62
    move-result v13

    .line 63
    invoke-virtual {v3, v7}, Landroid/view/View;->getHitRect(Landroid/graphics/Rect;)V

    .line 64
    .line 65
    .line 66
    :try_start_0
    invoke-virtual {v3, v8}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v3, v9}, Landroid/view/View;->getLocationInWindow([I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :catch_0
    move-exception v0

    .line 74
    sget v14, LG6/L;->b:I

    .line 75
    .line 76
    const-string v14, "Failure getting view location."

    .line 77
    .line 78
    invoke-static {v14, v0}, LH6/l;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    :goto_0
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbix;->zzgi:Lcom/google/android/gms/internal/ads/zzbio;

    .line 82
    .line 83
    sget-object v14, LD6/s;->e:LD6/s;

    .line 84
    .line 85
    iget-object v14, v14, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 86
    .line 87
    invoke-virtual {v14, v0}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    check-cast v0, Ljava/lang/Boolean;

    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-eqz v0, :cond_1

    .line 98
    .line 99
    aget v0, v9, v11

    .line 100
    .line 101
    iput v0, v4, Landroid/graphics/Rect;->left:I

    .line 102
    .line 103
    aget v0, v9, v10

    .line 104
    .line 105
    iput v0, v4, Landroid/graphics/Rect;->top:I

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_1
    aget v0, v8, v11

    .line 109
    .line 110
    iput v0, v4, Landroid/graphics/Rect;->left:I

    .line 111
    .line 112
    aget v0, v8, v10

    .line 113
    .line 114
    iput v0, v4, Landroid/graphics/Rect;->top:I

    .line 115
    .line 116
    :goto_1
    iget v0, v4, Landroid/graphics/Rect;->left:I

    .line 117
    .line 118
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 119
    .line 120
    .line 121
    move-result v8

    .line 122
    add-int/2addr v8, v0

    .line 123
    iput v8, v4, Landroid/graphics/Rect;->right:I

    .line 124
    .line 125
    iget v0, v4, Landroid/graphics/Rect;->top:I

    .line 126
    .line 127
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 128
    .line 129
    .line 130
    move-result v8

    .line 131
    add-int/2addr v8, v0

    .line 132
    iput v8, v4, Landroid/graphics/Rect;->bottom:I

    .line 133
    .line 134
    move-object v8, v3

    .line 135
    goto :goto_2

    .line 136
    :cond_2
    const/4 v0, 0x0

    .line 137
    move-object v8, v0

    .line 138
    move v12, v11

    .line 139
    move v13, v12

    .line 140
    :goto_2
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbix;->zzcg:Lcom/google/android/gms/internal/ads/zzbio;

    .line 141
    .line 142
    sget-object v9, LD6/s;->e:LD6/s;

    .line 143
    .line 144
    iget-object v9, v9, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 145
    .line 146
    invoke-virtual {v9, v0}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    check-cast v0, Ljava/lang/Boolean;

    .line 151
    .line 152
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    if-eqz v0, :cond_5

    .line 157
    .line 158
    if-eqz v8, :cond_5

    .line 159
    .line 160
    :try_start_1
    new-instance v0, Ljava/util/ArrayList;

    .line 161
    .line 162
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v8}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 166
    .line 167
    .line 168
    move-result-object v9

    .line 169
    :goto_3
    instance-of v14, v9, Landroid/view/View;

    .line 170
    .line 171
    if-eqz v14, :cond_4

    .line 172
    .line 173
    move-object v14, v9

    .line 174
    check-cast v14, Landroid/view/View;

    .line 175
    .line 176
    new-instance v15, Landroid/graphics/Rect;

    .line 177
    .line 178
    invoke-direct {v15}, Landroid/graphics/Rect;-><init>()V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v14}, Landroid/view/View;->isScrollContainer()Z

    .line 182
    .line 183
    .line 184
    move-result v16

    .line 185
    if-eqz v16, :cond_3

    .line 186
    .line 187
    invoke-virtual {v14, v15}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 188
    .line 189
    .line 190
    move-result v14

    .line 191
    if-eqz v14, :cond_3

    .line 192
    .line 193
    invoke-virtual {v1, v15}, Lcom/google/android/gms/internal/ads/zzbez;->zzc(Landroid/graphics/Rect;)Landroid/graphics/Rect;

    .line 194
    .line 195
    .line 196
    move-result-object v14

    .line 197
    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    goto :goto_4

    .line 201
    :catch_1
    move-exception v0

    .line 202
    goto :goto_6

    .line 203
    :cond_3
    :goto_4
    invoke-interface {v9}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 204
    .line 205
    .line 206
    move-result-object v9
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 207
    goto :goto_3

    .line 208
    :cond_4
    :goto_5
    move-object/from16 v31, v0

    .line 209
    .line 210
    goto :goto_7

    .line 211
    :goto_6
    sget-object v9, LC6/n;->D:LC6/n;

    .line 212
    .line 213
    iget-object v9, v9, LC6/n;->h:Lcom/google/android/gms/internal/ads/zzcfk;

    .line 214
    .line 215
    const-string v14, "PositionWatcher.getParentScrollViewRects"

    .line 216
    .line 217
    invoke-virtual {v9, v0, v14}, Lcom/google/android/gms/internal/ads/zzcfk;->zzh(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 221
    .line 222
    goto :goto_5

    .line 223
    :cond_5
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 224
    .line 225
    goto :goto_5

    .line 226
    :goto_7
    if-eqz v8, :cond_6

    .line 227
    .line 228
    invoke-virtual {v8}, Landroid/view/View;->getWindowVisibility()I

    .line 229
    .line 230
    .line 231
    move-result v9

    .line 232
    goto :goto_8

    .line 233
    :cond_6
    const/16 v9, 0x8

    .line 234
    .line 235
    :goto_8
    iget v14, v1, Lcom/google/android/gms/internal/ads/zzbez;->zzm:I

    .line 236
    .line 237
    const/4 v15, -0x1

    .line 238
    if-eq v14, v15, :cond_7

    .line 239
    .line 240
    move v9, v14

    .line 241
    :cond_7
    sget-object v14, LC6/n;->D:LC6/n;

    .line 242
    .line 243
    iget-object v15, v14, LC6/n;->c:LG6/U;

    .line 244
    .line 245
    invoke-static {v8}, LG6/U;->Q(Landroid/view/View;)J

    .line 246
    .line 247
    .line 248
    move-result-wide v26

    .line 249
    sget-object v15, Lcom/google/android/gms/internal/ads/zzbix;->zzmi:Lcom/google/android/gms/internal/ads/zzbio;

    .line 250
    .line 251
    sget-object v0, LD6/s;->e:LD6/s;

    .line 252
    .line 253
    iget-object v11, v0, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 254
    .line 255
    invoke-virtual {v11, v15}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v11

    .line 259
    check-cast v11, Ljava/lang/Boolean;

    .line 260
    .line 261
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    .line 262
    .line 263
    .line 264
    move-result v11

    .line 265
    iget-object v0, v0, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 266
    .line 267
    if-eqz v11, :cond_c

    .line 268
    .line 269
    if-eqz v3, :cond_9

    .line 270
    .line 271
    iget-object v3, v1, Lcom/google/android/gms/internal/ads/zzbez;->zzg:Landroid/os/PowerManager;

    .line 272
    .line 273
    iget-object v11, v1, Lcom/google/android/gms/internal/ads/zzbez;->zzh:Landroid/app/KeyguardManager;

    .line 274
    .line 275
    invoke-static {v8, v3, v11}, LG6/U;->r(Landroid/view/View;Landroid/os/PowerManager;Landroid/app/KeyguardManager;)Z

    .line 276
    .line 277
    .line 278
    move-result v3

    .line 279
    if-eqz v3, :cond_9

    .line 280
    .line 281
    if-eqz v12, :cond_b

    .line 282
    .line 283
    if-eqz v13, :cond_a

    .line 284
    .line 285
    sget-object v3, Lcom/google/android/gms/internal/ads/zzbix;->zzml:Lcom/google/android/gms/internal/ads/zzbio;

    .line 286
    .line 287
    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v3

    .line 291
    check-cast v3, Ljava/lang/Integer;

    .line 292
    .line 293
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 294
    .line 295
    .line 296
    move-result v3

    .line 297
    int-to-long v11, v3

    .line 298
    cmp-long v3, v26, v11

    .line 299
    .line 300
    if-ltz v3, :cond_8

    .line 301
    .line 302
    if-nez v9, :cond_8

    .line 303
    .line 304
    :goto_9
    move v3, v10

    .line 305
    move v12, v3

    .line 306
    move v13, v12

    .line 307
    const/4 v9, 0x0

    .line 308
    goto :goto_a

    .line 309
    :cond_8
    move v12, v10

    .line 310
    move v13, v12

    .line 311
    :cond_9
    const/4 v3, 0x0

    .line 312
    goto :goto_a

    .line 313
    :cond_a
    move v12, v10

    .line 314
    const/4 v3, 0x0

    .line 315
    const/4 v13, 0x0

    .line 316
    goto :goto_a

    .line 317
    :cond_b
    const/4 v3, 0x0

    .line 318
    const/4 v12, 0x0

    .line 319
    goto :goto_a

    .line 320
    :cond_c
    if-eqz v3, :cond_9

    .line 321
    .line 322
    iget-object v3, v1, Lcom/google/android/gms/internal/ads/zzbez;->zzg:Landroid/os/PowerManager;

    .line 323
    .line 324
    iget-object v11, v1, Lcom/google/android/gms/internal/ads/zzbez;->zzh:Landroid/app/KeyguardManager;

    .line 325
    .line 326
    invoke-static {v8, v3, v11}, LG6/U;->r(Landroid/view/View;Landroid/os/PowerManager;Landroid/app/KeyguardManager;)Z

    .line 327
    .line 328
    .line 329
    move-result v3

    .line 330
    if-eqz v3, :cond_9

    .line 331
    .line 332
    if-eqz v12, :cond_b

    .line 333
    .line 334
    if-eqz v13, :cond_a

    .line 335
    .line 336
    if-nez v9, :cond_8

    .line 337
    .line 338
    goto :goto_9

    .line 339
    :goto_a
    sget-object v11, Lcom/google/android/gms/internal/ads/zzbix;->zzmn:Lcom/google/android/gms/internal/ads/zzbio;

    .line 340
    .line 341
    invoke-virtual {v0, v11}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object v11

    .line 345
    check-cast v11, Ljava/lang/Boolean;

    .line 346
    .line 347
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    .line 348
    .line 349
    .line 350
    move-result v11

    .line 351
    if-eqz v11, :cond_12

    .line 352
    .line 353
    iget-object v11, v1, Lcom/google/android/gms/internal/ads/zzbez;->zzg:Landroid/os/PowerManager;

    .line 354
    .line 355
    iget-object v15, v1, Lcom/google/android/gms/internal/ads/zzbez;->zzh:Landroid/app/KeyguardManager;

    .line 356
    .line 357
    invoke-static {v8, v11, v15}, LG6/U;->r(Landroid/view/View;Landroid/os/PowerManager;Landroid/app/KeyguardManager;)Z

    .line 358
    .line 359
    .line 360
    move-result v11

    .line 361
    if-eq v10, v11, :cond_d

    .line 362
    .line 363
    const/4 v11, 0x0

    .line 364
    goto :goto_b

    .line 365
    :cond_d
    const/16 v11, 0x40

    .line 366
    .line 367
    :goto_b
    if-eq v10, v12, :cond_e

    .line 368
    .line 369
    const/4 v15, 0x0

    .line 370
    goto :goto_c

    .line 371
    :cond_e
    const/16 v15, 0x8

    .line 372
    .line 373
    :goto_c
    if-eq v10, v13, :cond_f

    .line 374
    .line 375
    const/16 v18, 0x0

    .line 376
    .line 377
    goto :goto_d

    .line 378
    :cond_f
    const/16 v18, 0x10

    .line 379
    .line 380
    :goto_d
    if-nez v9, :cond_10

    .line 381
    .line 382
    const/16 v9, 0x80

    .line 383
    .line 384
    goto :goto_e

    .line 385
    :cond_10
    const/4 v9, 0x0

    .line 386
    :goto_e
    sget-object v10, Lcom/google/android/gms/internal/ads/zzbix;->zzml:Lcom/google/android/gms/internal/ads/zzbio;

    .line 387
    .line 388
    invoke-virtual {v0, v10}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    check-cast v0, Ljava/lang/Integer;

    .line 393
    .line 394
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 395
    .line 396
    .line 397
    move-result v0

    .line 398
    move/from16 v20, v9

    .line 399
    .line 400
    int-to-long v9, v0

    .line 401
    cmp-long v0, v26, v9

    .line 402
    .line 403
    if-ltz v0, :cond_11

    .line 404
    .line 405
    const/16 v0, 0x20

    .line 406
    .line 407
    goto :goto_f

    .line 408
    :cond_11
    const/4 v0, 0x0

    .line 409
    :goto_f
    or-int v9, v11, v15

    .line 410
    .line 411
    or-int v9, v9, v18

    .line 412
    .line 413
    or-int v9, v9, v20

    .line 414
    .line 415
    or-int/2addr v0, v9

    .line 416
    or-int/2addr v0, v3

    .line 417
    invoke-static {v0, v8}, LG6/U;->j(ILandroid/view/View;)V

    .line 418
    .line 419
    .line 420
    const/4 v9, 0x1

    .line 421
    goto :goto_10

    .line 422
    :cond_12
    move v9, v10

    .line 423
    :goto_10
    if-ne v2, v9, :cond_13

    .line 424
    .line 425
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzbez;->zzk:LG6/C;

    .line 426
    .line 427
    invoke-virtual {v0}, LG6/C;->a()Z

    .line 428
    .line 429
    .line 430
    move-result v0

    .line 431
    if-nez v0, :cond_13

    .line 432
    .line 433
    iget-boolean v0, v1, Lcom/google/android/gms/internal/ads/zzbez;->zzl:Z

    .line 434
    .line 435
    if-eq v3, v0, :cond_18

    .line 436
    .line 437
    :cond_13
    if-nez v3, :cond_14

    .line 438
    .line 439
    iget-boolean v0, v1, Lcom/google/android/gms/internal/ads/zzbez;->zzl:Z

    .line 440
    .line 441
    if-nez v0, :cond_14

    .line 442
    .line 443
    const/4 v9, 0x1

    .line 444
    if-eq v2, v9, :cond_18

    .line 445
    .line 446
    goto :goto_11

    .line 447
    :cond_14
    const/4 v9, 0x1

    .line 448
    :goto_11
    new-instance v0, Lcom/google/android/gms/internal/ads/zzbew;

    .line 449
    .line 450
    iget-object v2, v14, LC6/n;->k:Ln7/b;

    .line 451
    .line 452
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 453
    .line 454
    .line 455
    const/16 v2, 0x8

    .line 456
    .line 457
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 458
    .line 459
    .line 460
    move-result-wide v15

    .line 461
    iget-object v10, v1, Lcom/google/android/gms/internal/ads/zzbez;->zzg:Landroid/os/PowerManager;

    .line 462
    .line 463
    invoke-virtual {v10}, Landroid/os/PowerManager;->isScreenOn()Z

    .line 464
    .line 465
    .line 466
    move-result v10

    .line 467
    if-eqz v8, :cond_15

    .line 468
    .line 469
    invoke-virtual {v8}, Landroid/view/View;->isAttachedToWindow()Z

    .line 470
    .line 471
    .line 472
    move-result v11

    .line 473
    if-eqz v11, :cond_15

    .line 474
    .line 475
    move/from16 v18, v9

    .line 476
    .line 477
    goto :goto_12

    .line 478
    :cond_15
    const/16 v18, 0x0

    .line 479
    .line 480
    :goto_12
    if-eqz v8, :cond_16

    .line 481
    .line 482
    invoke-virtual {v8}, Landroid/view/View;->getWindowVisibility()I

    .line 483
    .line 484
    .line 485
    move-result v2

    .line 486
    :cond_16
    move/from16 v19, v2

    .line 487
    .line 488
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzbez;->zzp:Landroid/graphics/Rect;

    .line 489
    .line 490
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzbez;->zzc(Landroid/graphics/Rect;)Landroid/graphics/Rect;

    .line 491
    .line 492
    .line 493
    move-result-object v20

    .line 494
    invoke-virtual {v1, v4}, Lcom/google/android/gms/internal/ads/zzbez;->zzc(Landroid/graphics/Rect;)Landroid/graphics/Rect;

    .line 495
    .line 496
    .line 497
    move-result-object v21

    .line 498
    invoke-virtual {v1, v5}, Lcom/google/android/gms/internal/ads/zzbez;->zzc(Landroid/graphics/Rect;)Landroid/graphics/Rect;

    .line 499
    .line 500
    .line 501
    move-result-object v22

    .line 502
    invoke-virtual {v1, v6}, Lcom/google/android/gms/internal/ads/zzbez;->zzc(Landroid/graphics/Rect;)Landroid/graphics/Rect;

    .line 503
    .line 504
    .line 505
    move-result-object v24

    .line 506
    invoke-virtual {v1, v7}, Lcom/google/android/gms/internal/ads/zzbez;->zzc(Landroid/graphics/Rect;)Landroid/graphics/Rect;

    .line 507
    .line 508
    .line 509
    move-result-object v28

    .line 510
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzbez;->zzo:Landroid/util/DisplayMetrics;

    .line 511
    .line 512
    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    .line 513
    .line 514
    move-object v14, v0

    .line 515
    move/from16 v29, v2

    .line 516
    .line 517
    move/from16 v30, v3

    .line 518
    .line 519
    move/from16 v17, v10

    .line 520
    .line 521
    move/from16 v23, v12

    .line 522
    .line 523
    move/from16 v25, v13

    .line 524
    .line 525
    invoke-direct/range {v14 .. v31}, Lcom/google/android/gms/internal/ads/zzbew;-><init>(JZZILandroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Rect;ZLandroid/graphics/Rect;ZJLandroid/graphics/Rect;FZLjava/util/List;)V

    .line 526
    .line 527
    .line 528
    move/from16 v10, v30

    .line 529
    .line 530
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzbez;->zzn:Ljava/util/HashSet;

    .line 531
    .line 532
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 533
    .line 534
    .line 535
    move-result-object v0

    .line 536
    :goto_13
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 537
    .line 538
    .line 539
    move-result v2

    .line 540
    if-eqz v2, :cond_17

    .line 541
    .line 542
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 543
    .line 544
    .line 545
    move-result-object v2

    .line 546
    check-cast v2, Lcom/google/android/gms/internal/ads/zzbex;

    .line 547
    .line 548
    invoke-interface {v2, v14}, Lcom/google/android/gms/internal/ads/zzbex;->zzdj(Lcom/google/android/gms/internal/ads/zzbew;)V

    .line 549
    .line 550
    .line 551
    goto :goto_13

    .line 552
    :cond_17
    iput-boolean v10, v1, Lcom/google/android/gms/internal/ads/zzbez;->zzl:Z

    .line 553
    .line 554
    :cond_18
    :goto_14
    return-void
.end method

.method private final zzk(I)I
    .locals 1

    .line 1
    int-to-float p1, p1

    .line 2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzo:Landroid/util/DisplayMetrics;

    .line 3
    .line 4
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 5
    .line 6
    div-float/2addr p1, v0

    .line 7
    float-to-int p1, p1

    .line 8
    return p1
.end method

.method private final zzl(Landroid/view/View;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzi:Ljava/lang/ref/WeakReference;

    .line 17
    .line 18
    invoke-virtual {p1, p0}, Landroid/view/ViewTreeObserver;->addOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, p0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbez;->zza:Landroid/content/BroadcastReceiver;

    .line 25
    .line 26
    if-nez p1, :cond_3

    .line 27
    .line 28
    new-instance p1, Landroid/content/IntentFilter;

    .line 29
    .line 30
    invoke-direct {p1}, Landroid/content/IntentFilter;-><init>()V

    .line 31
    .line 32
    .line 33
    const-string v0, "android.intent.action.SCREEN_ON"

    .line 34
    .line 35
    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const-string v0, "android.intent.action.SCREEN_OFF"

    .line 39
    .line 40
    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const-string v0, "android.intent.action.USER_PRESENT"

    .line 44
    .line 45
    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    new-instance v0, Lcom/google/android/gms/internal/ads/zzbev;

    .line 49
    .line 50
    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzbev;-><init>(Lcom/google/android/gms/internal/ads/zzbez;)V

    .line 51
    .line 52
    .line 53
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzbez;->zza:Landroid/content/BroadcastReceiver;

    .line 54
    .line 55
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzd:Landroid/content/Context;

    .line 56
    .line 57
    sget-object v2, LC6/n;->D:LC6/n;

    .line 58
    .line 59
    iget-object v2, v2, LC6/n;->A:LG6/I;

    .line 60
    .line 61
    monitor-enter v2

    .line 62
    :try_start_0
    iget-boolean v3, v2, LG6/I;->c:Z

    .line 63
    .line 64
    if-eqz v3, :cond_1

    .line 65
    .line 66
    iget-object v1, v2, LG6/I;->e:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v1, Ljava/util/WeakHashMap;

    .line 69
    .line 70
    invoke-virtual {v1, v0, p1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    .line 72
    .line 73
    monitor-exit v2

    .line 74
    goto :goto_1

    .line 75
    :cond_1
    :try_start_1
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzbix;->zza(Landroid/content/Context;)V

    .line 76
    .line 77
    .line 78
    sget-object v3, Lcom/google/android/gms/internal/ads/zzbix;->zzmF:Lcom/google/android/gms/internal/ads/zzbio;

    .line 79
    .line 80
    sget-object v4, LD6/s;->e:LD6/s;

    .line 81
    .line 82
    iget-object v4, v4, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 83
    .line 84
    invoke-virtual {v4, v3}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    check-cast v3, Ljava/lang/Boolean;

    .line 89
    .line 90
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    if-eqz v3, :cond_2

    .line 95
    .line 96
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 97
    .line 98
    const/16 v4, 0x21

    .line 99
    .line 100
    if-lt v3, v4, :cond_2

    .line 101
    .line 102
    invoke-static {v1, v0, p1}, LA0/h;->r(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 103
    .line 104
    .line 105
    monitor-exit v2

    .line 106
    goto :goto_1

    .line 107
    :catchall_0
    move-exception p1

    .line 108
    goto :goto_0

    .line 109
    :cond_2
    :try_start_2
    invoke-virtual {v1, v0, p1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 110
    .line 111
    .line 112
    monitor-exit v2

    .line 113
    goto :goto_1

    .line 114
    :goto_0
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 115
    throw p1

    .line 116
    :cond_3
    :goto_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbez;->zze:Landroid/app/Application;

    .line 117
    .line 118
    if-eqz p1, :cond_4

    .line 119
    .line 120
    :try_start_4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzj:Lcom/google/android/gms/internal/ads/zzbfl;

    .line 121
    .line 122
    invoke-virtual {p1, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :catch_0
    move-exception p1

    .line 127
    sget v0, LG6/L;->b:I

    .line 128
    .line 129
    const-string v0, "Error registering activity lifecycle callbacks."

    .line 130
    .line 131
    invoke-static {v0, p1}, LH6/l;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 132
    .line 133
    .line 134
    :cond_4
    return-void
.end method

.method private final zzm(Landroid/view/View;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzi:Ljava/lang/ref/WeakReference;

    .line 3
    .line 4
    if-eqz v1, :cond_1

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Landroid/view/ViewTreeObserver;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-virtual {v1, p0}, Landroid/view/ViewTreeObserver;->removeOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catch_0
    move-exception v1

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    :goto_0
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzi:Ljava/lang/ref/WeakReference;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :goto_1
    sget v2, LG6/L;->b:I

    .line 33
    .line 34
    const-string v2, "Error while unregistering listeners from the last ViewTreeObserver."

    .line 35
    .line 36
    invoke-static {v2, v1}, LH6/l;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    :goto_2
    :try_start_1
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_2

    .line 48
    .line 49
    invoke-virtual {p1, p0}, Landroid/view/ViewTreeObserver;->removeOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 53
    .line 54
    .line 55
    goto :goto_3

    .line 56
    :catch_1
    move-exception p1

    .line 57
    sget v1, LG6/L;->b:I

    .line 58
    .line 59
    const-string v1, "Error while unregistering listeners from the ViewTreeObserver."

    .line 60
    .line 61
    invoke-static {v1, p1}, LH6/l;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 62
    .line 63
    .line 64
    :cond_2
    :goto_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbez;->zza:Landroid/content/BroadcastReceiver;

    .line 65
    .line 66
    if-eqz p1, :cond_3

    .line 67
    .line 68
    :try_start_2
    sget-object v1, LC6/n;->D:LC6/n;

    .line 69
    .line 70
    iget-object v1, v1, LC6/n;->A:LG6/I;

    .line 71
    .line 72
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzd:Landroid/content/Context;

    .line 73
    .line 74
    invoke-virtual {v1, v2, p1}, LG6/I;->c(Landroid/content/Context;Landroid/content/BroadcastReceiver;)V
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 75
    .line 76
    .line 77
    goto :goto_6

    .line 78
    :catch_2
    move-exception p1

    .line 79
    goto :goto_4

    .line 80
    :catch_3
    move-exception p1

    .line 81
    goto :goto_5

    .line 82
    :goto_4
    sget-object v1, LC6/n;->D:LC6/n;

    .line 83
    .line 84
    iget-object v1, v1, LC6/n;->h:Lcom/google/android/gms/internal/ads/zzcfk;

    .line 85
    .line 86
    const-string v2, "ActiveViewUnit.stopScreenStatusMonitoring"

    .line 87
    .line 88
    invoke-virtual {v1, p1, v2}, Lcom/google/android/gms/internal/ads/zzcfk;->zzh(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    goto :goto_6

    .line 92
    :goto_5
    sget v1, LG6/L;->b:I

    .line 93
    .line 94
    const-string v1, "Failed trying to unregister the receiver"

    .line 95
    .line 96
    invoke-static {v1, p1}, LH6/l;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 97
    .line 98
    .line 99
    :goto_6
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzbez;->zza:Landroid/content/BroadcastReceiver;

    .line 100
    .line 101
    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbez;->zze:Landroid/app/Application;

    .line 102
    .line 103
    if-eqz p1, :cond_4

    .line 104
    .line 105
    :try_start_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzj:Lcom/google/android/gms/internal/ads/zzbfl;

    .line 106
    .line 107
    invoke-virtual {p1, v0}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_4

    .line 108
    .line 109
    .line 110
    goto :goto_7

    .line 111
    :catch_4
    move-exception p1

    .line 112
    sget v0, LG6/L;->b:I

    .line 113
    .line 114
    const-string v0, "Error registering activity lifecycle callbacks."

    .line 115
    .line 116
    invoke-static {v0, p1}, LH6/l;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 117
    .line 118
    .line 119
    :cond_4
    :goto_7
    return-void
.end method


# virtual methods
.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    const/4 p2, 0x0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzbez;->zzi(Landroid/app/Activity;I)V

    .line 3
    .line 4
    .line 5
    const/4 p1, 0x3

    .line 6
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzbez;->zzj(I)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbez;->zzh()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 0

    .line 1
    const/4 p1, 0x3

    .line 2
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzbez;->zzj(I)V

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbez;->zzh()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ads/zzbez;->zzi(Landroid/app/Activity;I)V

    .line 3
    .line 4
    .line 5
    const/4 p1, 0x3

    .line 6
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzbez;->zzj(I)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbez;->zzh()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ads/zzbez;->zzi(Landroid/app/Activity;I)V

    .line 3
    .line 4
    .line 5
    const/4 p1, 0x3

    .line 6
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzbez;->zzj(I)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbez;->zzh()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    const/4 p1, 0x3

    .line 2
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzbez;->zzj(I)V

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbez;->zzh()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ads/zzbez;->zzi(Landroid/app/Activity;I)V

    .line 3
    .line 4
    .line 5
    const/4 p1, 0x3

    .line 6
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzbez;->zzj(I)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbez;->zzh()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 0

    .line 1
    const/4 p1, 0x3

    .line 2
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzbez;->zzj(I)V

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbez;->zzh()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final onGlobalLayout()V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzbez;->zzj(I)V

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbez;->zzh()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final onScrollChanged()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzbez;->zzj(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzm:I

    .line 3
    .line 4
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzbez;->zzl(Landroid/view/View;)V

    .line 5
    .line 6
    .line 7
    const/4 p1, 0x3

    .line 8
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzbez;->zzj(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzm:I

    .line 3
    .line 4
    const/4 v0, 0x3

    .line 5
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzbez;->zzj(I)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbez;->zzh()V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzbez;->zzm(Landroid/view/View;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/zzbex;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzn:Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x3

    .line 7
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzbez;->zzj(I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzbex;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzn:Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final zzc(Landroid/graphics/Rect;)Landroid/graphics/Rect;
    .locals 4

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    .line 2
    .line 3
    iget v1, p1, Landroid/graphics/Rect;->left:I

    .line 4
    .line 5
    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/zzbez;->zzk(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget v2, p1, Landroid/graphics/Rect;->top:I

    .line 10
    .line 11
    invoke-direct {p0, v2}, Lcom/google/android/gms/internal/ads/zzbez;->zzk(I)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    iget v3, p1, Landroid/graphics/Rect;->right:I

    .line 16
    .line 17
    invoke-direct {p0, v3}, Lcom/google/android/gms/internal/ads/zzbez;->zzk(I)I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    .line 22
    .line 23
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzbez;->zzk(I)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    invoke-direct {v0, v1, v2, v3, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 28
    .line 29
    .line 30
    return-object v0
.end method

.method public final zzd(J)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzk:LG6/C;

    .line 2
    .line 3
    iget-object v1, v0, LG6/C;->c:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    iput-wide p1, v0, LG6/C;->a:J

    .line 7
    .line 8
    monitor-exit v1

    .line 9
    return-void

    .line 10
    :catchall_0
    move-exception p1

    .line 11
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    throw p1
.end method

.method public final zze()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbez;->zzk:LG6/C;

    .line 2
    .line 3
    sget-wide v1, Lcom/google/android/gms/internal/ads/zzbez;->zzc:J

    .line 4
    .line 5
    iget-object v3, v0, LG6/C;->c:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v3

    .line 8
    :try_start_0
    iput-wide v1, v0, LG6/C;->a:J

    .line 9
    .line 10
    monitor-exit v3

    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception v0

    .line 13
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    throw v0
.end method

.method public final synthetic zzf()V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzbez;->zzj(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final synthetic zzg(I)V
    .locals 0

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzbez;->zzj(I)V

    return-void
.end method
