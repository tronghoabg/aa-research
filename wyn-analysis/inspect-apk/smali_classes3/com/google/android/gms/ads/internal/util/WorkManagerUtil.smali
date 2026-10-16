.class public Lcom/google/android/gms/ads/internal/util/WorkManagerUtil;
.super Lcom/google/android/gms/internal/ads/zzbem;
.source "SourceFile"

# interfaces
.implements LG6/A;


# direct methods
.method public constructor <init>()V
    .locals 1
    .annotation build Lcom/google/android/apps/common/proguard/UsedByReflection;
        value = "This class must be instantiated reflectively so that the default class loader can be used."
    .end annotation

    .line 1
    const-string v0, "com.google.android.gms.ads.internal.util.IWorkManagerUtil"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzbem;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static R(Landroid/content/Context;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    new-instance v0, Lx9/d;

    .line 6
    .line 7
    const/16 v1, 0x13

    .line 8
    .line 9
    invoke-direct {v0, v1}, Lx9/d;-><init>(I)V

    .line 10
    .line 11
    .line 12
    new-instance v1, LJ3/b;

    .line 13
    .line 14
    invoke-direct {v1, v0}, LJ3/b;-><init>(Lx9/d;)V

    .line 15
    .line 16
    .line 17
    invoke-static {p0, v1}, LK3/q;->d(Landroid/content/Context;LJ3/b;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    .line 20
    :catch_0
    return-void
.end method


# virtual methods
.method public final zzdd(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 2

    .line 1
    const/4 p4, 0x1

    .line 2
    if-eq p1, p4, :cond_2

    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    if-eq p1, v0, :cond_1

    .line 6
    .line 7
    const/4 v0, 0x3

    .line 8
    if-eq p1, v0, :cond_0

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    return p1

    .line 12
    :cond_0
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {p1}, Lq7/b;->R(Landroid/os/IBinder;)Lq7/a;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    sget-object v0, LE6/a;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 21
    .line 22
    invoke-static {p2, v0}, Lcom/google/android/gms/internal/ads/zzben;->zzb(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, LE6/a;

    .line 27
    .line 28
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzben;->zzh(Landroid/os/Parcel;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {p0, p1, v0}, LG6/A;->zzg(Lq7/a;LE6/a;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-static {p1}, Lq7/b;->R(Landroid/os/IBinder;)Lq7/a;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzben;->zzh(Landroid/os/Parcel;)V

    .line 51
    .line 52
    .line 53
    invoke-interface {p0, p1}, LG6/A;->zzf(Lq7/a;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-static {p1}, Lq7/b;->R(Landroid/os/IBinder;)Lq7/a;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzben;->zzh(Landroid/os/Parcel;)V

    .line 77
    .line 78
    .line 79
    invoke-interface {p0, p1, v0, v1}, LG6/A;->zze(Lq7/a;Ljava/lang/String;Ljava/lang/String;)Z

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 87
    .line 88
    .line 89
    :goto_0
    return p4
.end method

.method public final zze(Lq7/a;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 1
    new-instance v0, LE6/a;

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    invoke-direct {v0, p2, p3, v1}, LE6/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/ads/internal/util/WorkManagerUtil;->zzg(Lq7/a;LE6/a;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
.end method

.method public final zzf(Lq7/a;)V
    .locals 12

    .line 1
    invoke-static {p1}, Lq7/b;->S(Lq7/a;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroid/content/Context;

    .line 6
    .line 7
    invoke-static {p1}, Lcom/google/android/gms/ads/internal/util/WorkManagerUtil;->R(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    :try_start_0
    invoke-static {p1}, LK3/q;->c(Landroid/content/Context;)LK3/q;

    .line 11
    .line 12
    .line 13
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    new-instance v0, LT3/c;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-direct {v0, p1, v1}, LT3/c;-><init>(LK3/q;I)V

    .line 18
    .line 19
    .line 20
    iget-object v1, p1, LK3/q;->d:Lb7/k;

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Lb7/k;->v(Ljava/lang/Runnable;)V

    .line 23
    .line 24
    .line 25
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 28
    .line 29
    .line 30
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 31
    .line 32
    const/16 v2, 0x18

    .line 33
    .line 34
    if-lt v1, v2, :cond_0

    .line 35
    .line 36
    invoke-static {v0}, Lff/o;->X0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    :goto_0
    move-object v11, v0

    .line 41
    goto :goto_1

    .line 42
    :cond_0
    sget-object v0, Lff/x;->a:Lff/x;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :goto_1
    new-instance v1, LJ3/d;

    .line 46
    .line 47
    const/4 v5, 0x0

    .line 48
    const/4 v6, 0x0

    .line 49
    const/4 v2, 0x2

    .line 50
    const/4 v3, 0x0

    .line 51
    const/4 v4, 0x0

    .line 52
    const-wide/16 v7, -0x1

    .line 53
    .line 54
    const-wide/16 v9, -0x1

    .line 55
    .line 56
    invoke-direct/range {v1 .. v11}, LJ3/d;-><init>(IZZZZJJLjava/util/Set;)V

    .line 57
    .line 58
    .line 59
    new-instance v0, LA7/b0;

    .line 60
    .line 61
    const-class v2, Lcom/google/android/gms/ads/internal/offline/buffering/OfflinePingSender;

    .line 62
    .line 63
    invoke-direct {v0, v2}, LA7/b0;-><init>(Ljava/lang/Class;)V

    .line 64
    .line 65
    .line 66
    iget-object v2, v0, LA7/b0;->d:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v2, LS3/p;

    .line 69
    .line 70
    iput-object v1, v2, LS3/p;->j:LJ3/d;

    .line 71
    .line 72
    iget-object v1, v0, LA7/b0;->e:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v1, Ljava/util/Set;

    .line 75
    .line 76
    const-string v2, "offline_ping_sender_work"

    .line 77
    .line 78
    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, LA7/b0;->i()LJ3/s;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {p1, v0}, LJ3/x;->a(LJ3/s;)LS3/e;

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :catch_0
    move-exception v0

    .line 90
    move-object p1, v0

    .line 91
    const-string v0, "Failed to instantiate WorkManager."

    .line 92
    .line 93
    invoke-static {v0, p1}, LH6/l;->g(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 94
    .line 95
    .line 96
    return-void
.end method

.method public final zzg(Lq7/a;LE6/a;)Z
    .locals 12

    .line 1
    invoke-static {p1}, Lq7/b;->S(Lq7/a;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroid/content/Context;

    .line 6
    .line 7
    invoke-static {p1}, Lcom/google/android/gms/ads/internal/util/WorkManagerUtil;->R(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 13
    .line 14
    .line 15
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 16
    .line 17
    const/16 v2, 0x18

    .line 18
    .line 19
    if-lt v1, v2, :cond_0

    .line 20
    .line 21
    invoke-static {v0}, Lff/o;->X0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :goto_0
    move-object v11, v0

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    sget-object v0, Lff/x;->a:Lff/x;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :goto_1
    new-instance v1, LJ3/d;

    .line 31
    .line 32
    const/4 v5, 0x0

    .line 33
    const/4 v6, 0x0

    .line 34
    const/4 v2, 0x2

    .line 35
    const/4 v3, 0x0

    .line 36
    const/4 v4, 0x0

    .line 37
    const-wide/16 v7, -0x1

    .line 38
    .line 39
    const-wide/16 v9, -0x1

    .line 40
    .line 41
    invoke-direct/range {v1 .. v11}, LJ3/d;-><init>(IZZZZJJLjava/util/Set;)V

    .line 42
    .line 43
    .line 44
    new-instance v0, Ljava/util/HashMap;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 47
    .line 48
    .line 49
    iget-object v2, p2, LE6/a;->a:Ljava/lang/String;

    .line 50
    .line 51
    const-string v3, "uri"

    .line 52
    .line 53
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    const-string v2, "gws_query_id"

    .line 57
    .line 58
    iget-object v3, p2, LE6/a;->b:Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    const-string v2, "image_url"

    .line 64
    .line 65
    iget-object p2, p2, LE6/a;->c:Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {v0, v2, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    new-instance p2, LJ3/h;

    .line 71
    .line 72
    invoke-direct {p2, v0}, LJ3/h;-><init>(Ljava/util/HashMap;)V

    .line 73
    .line 74
    .line 75
    invoke-static {p2}, LJ3/h;->c(LJ3/h;)[B

    .line 76
    .line 77
    .line 78
    new-instance v0, LA7/b0;

    .line 79
    .line 80
    const-class v2, Lcom/google/android/gms/ads/internal/offline/buffering/OfflineNotificationPoster;

    .line 81
    .line 82
    invoke-direct {v0, v2}, LA7/b0;-><init>(Ljava/lang/Class;)V

    .line 83
    .line 84
    .line 85
    iget-object v2, v0, LA7/b0;->d:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v2, LS3/p;

    .line 88
    .line 89
    iput-object v1, v2, LS3/p;->j:LJ3/d;

    .line 90
    .line 91
    iput-object p2, v2, LS3/p;->e:LJ3/h;

    .line 92
    .line 93
    iget-object p2, v0, LA7/b0;->e:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast p2, Ljava/util/Set;

    .line 96
    .line 97
    const-string v1, "offline_notification_work"

    .line 98
    .line 99
    invoke-interface {p2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0}, LA7/b0;->i()LJ3/s;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    :try_start_0
    invoke-static {p1}, LK3/q;->c(Landroid/content/Context;)LK3/q;

    .line 107
    .line 108
    .line 109
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 110
    invoke-virtual {p1, p2}, LJ3/x;->a(LJ3/s;)LS3/e;

    .line 111
    .line 112
    .line 113
    const/4 p1, 0x1

    .line 114
    return p1

    .line 115
    :catch_0
    move-exception v0

    .line 116
    move-object p1, v0

    .line 117
    const-string p2, "Failed to instantiate WorkManager."

    .line 118
    .line 119
    invoke-static {p2, p1}, LH6/l;->g(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 120
    .line 121
    .line 122
    const/4 p1, 0x0

    .line 123
    return p1
.end method
