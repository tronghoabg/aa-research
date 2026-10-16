.class public Lad/L;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/ads/nativead/d;
.implements Lcom/google/android/gms/common/internal/e;
.implements Lf4/h;
.implements Lnet/zetetic/database/sqlcipher/SQLiteDatabaseHook;
.implements Lh1/a;
.implements Lp/w;
.implements Luc/d;
.implements Lorg/chromium/net/c;
.implements Lq/l;
.implements Luc/p;
.implements Lcom/google/android/gms/common/api/internal/w;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    iput p1, p0, Lad/L;->a:I

    sparse-switch p1, :sswitch_data_0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1a

    if-lt p1, v0, :cond_0

    .line 21
    new-instance p1, Ll1/g;

    .line 22
    invoke-direct {p1, p0}, Ll1/f;-><init>(Lad/L;)V

    .line 23
    iput-object p1, p0, Lad/L;->b:Ljava/lang/Object;

    goto :goto_0

    .line 24
    :cond_0
    new-instance p1, Ll1/f;

    invoke-direct {p1, p0}, Ll1/f;-><init>(Lad/L;)V

    iput-object p1, p0, Lad/L;->b:Ljava/lang/Object;

    :goto_0
    return-void

    .line 25
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lad/L;->b:Ljava/lang/Object;

    return-void

    .line 27
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void

    .line 28
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lad/L;->b:Ljava/lang/Object;

    return-void

    .line 30
    :sswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object p1, p0, Lad/L;->b:Ljava/lang/Object;

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x10 -> :sswitch_3
        0x13 -> :sswitch_2
        0x17 -> :sswitch_1
        0x18 -> :sswitch_0
    .end sparse-switch
.end method

.method public constructor <init>(Lad/J;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lad/L;->a:I

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lad/L;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/net/Uri;)V
    .locals 1

    const/4 v0, 0x7

    iput v0, p0, Lad/L;->a:I

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/content/ContentResolver;->acquireUnstableContentProviderClient(Landroid/net/Uri;)Landroid/content/ContentProviderClient;

    move-result-object p1

    iput-object p1, p0, Lad/L;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/net/Uri;Landroid/content/ClipDescription;Landroid/net/Uri;)V
    .locals 7

    const/16 v0, 0xe

    iput v0, p0, Lad/L;->a:I

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x19

    if-lt v0, v1, :cond_0

    .line 34
    new-instance v0, Lm1/f;

    invoke-direct {v0, p1, p2, p3}, Lm1/f;-><init>(Landroid/net/Uri;Landroid/content/ClipDescription;Landroid/net/Uri;)V

    iput-object v0, p0, Lad/L;->b:Ljava/lang/Object;

    goto :goto_0

    .line 35
    :cond_0
    new-instance v1, Lb7/k;

    const/16 v2, 0x1d

    const/4 v6, 0x0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v1 .. v6}, Lb7/k;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V

    iput-object v1, p0, Lad/L;->b:Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 2

    const/16 v0, 0xc

    iput v0, p0, Lad/L;->a:I

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 12
    new-instance v0, Lk1/A;

    .line 13
    invoke-direct {v0, p1}, Lk1/y;-><init>(Landroid/view/View;)V

    .line 14
    iput-object p1, v0, Lk1/A;->b:Landroid/view/View;

    .line 15
    iput-object v0, p0, Lad/L;->b:Ljava/lang/Object;

    goto :goto_0

    .line 16
    :cond_0
    new-instance v0, Lk1/y;

    invoke-direct {v0, p1}, Lk1/y;-><init>(Landroid/view/View;)V

    iput-object v0, p0, Lad/L;->b:Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lad/L;->a:I

    iput-object p1, p0, Lad/L;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lmc/b;)V
    .locals 5

    const/16 v0, 0x19

    iput v0, p0, Lad/L;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v0, Landroidx/fragment/app/X;

    const/16 v1, 0xd

    .line 5
    invoke-direct {v0, v1}, Landroidx/fragment/app/X;-><init>(I)V

    .line 6
    new-instance v1, Luc/r;

    sget-object v2, Luc/x;->b:Luc/x;

    const/4 v3, 0x0

    .line 7
    const-string v4, "flutter/backgesture"

    invoke-direct {v1, p1, v4, v2, v3}, Luc/r;-><init>(Luc/f;Ljava/lang/String;Luc/s;Lab/b;)V

    .line 8
    iput-object v1, p0, Lad/L;->b:Ljava/lang/Object;

    .line 9
    invoke-virtual {v1, v0}, Luc/r;->b(Luc/p;)V

    return-void
.end method

.method public synthetic constructor <init>(Lu7/a;Lv7/y;)V
    .locals 0

    const/16 p1, 0x1d

    iput p1, p0, Lad/L;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lad/L;->b:Ljava/lang/Object;

    return-void
.end method

.method public static f(Landroid/window/BackEvent;)Ljava/util/HashMap;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {p0}, Lh3/e;->c(Landroid/window/BackEvent;)F

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-static {p0}, Lh3/e;->t(Landroid/window/BackEvent;)F

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-nez v3, :cond_1

    .line 20
    .line 21
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    const/4 v3, 0x2

    .line 37
    new-array v3, v3, [Ljava/lang/Float;

    .line 38
    .line 39
    const/4 v4, 0x0

    .line 40
    aput-object v1, v3, v4

    .line 41
    .line 42
    const/4 v1, 0x1

    .line 43
    aput-object v2, v3, v1

    .line 44
    .line 45
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    :goto_0
    const/4 v1, 0x0

    .line 51
    :goto_1
    const-string v2, "touchOffset"

    .line 52
    .line 53
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    invoke-static {p0}, Lh3/e;->w(Landroid/window/BackEvent;)F

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    const-string v2, "progress"

    .line 65
    .line 66
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    invoke-static {p0}, Lh3/e;->f(Landroid/window/BackEvent;)I

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    const-string v1, "swipeEdge"

    .line 78
    .line 79
    invoke-virtual {v0, v1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    return-object v0
.end method

.method public static r(I)Z
    .locals 1

    .line 1
    const/16 v0, 0x30

    .line 2
    .line 3
    if-gt v0, p0, :cond_0

    .line 4
    .line 5
    const/16 v0, 0x39

    .line 6
    .line 7
    if-le p0, v0, :cond_2

    .line 8
    .line 9
    :cond_0
    const/16 v0, 0x23

    .line 10
    .line 11
    if-eq p0, v0, :cond_2

    .line 12
    .line 13
    const/16 v0, 0x2a

    .line 14
    .line 15
    if-ne p0, v0, :cond_1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    const/4 p0, 0x0

    .line 19
    return p0

    .line 20
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 21
    return p0
.end method


# virtual methods
.method public F(Lp/k;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Lp/k;->k()Lp/k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lad/L;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lj/w;

    .line 10
    .line 11
    iget-boolean v1, v0, Lj/w;->F:Z

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget-object v1, v0, Lj/w;->l:Landroid/view/Window;

    .line 16
    .line 17
    invoke-virtual {v1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    iget-boolean v0, v0, Lj/w;->Q:Z

    .line 24
    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    const/16 v0, 0x6c

    .line 28
    .line 29
    invoke-interface {v1, v0, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 30
    .line 31
    .line 32
    :cond_0
    const/4 p1, 0x1

    .line 33
    return p1
.end method

.method public O(Lf4/c;Landroid/graphics/Bitmap;Ljava/util/Map;)V
    .locals 2

    .line 1
    invoke-static {p2}, Lp7/b;->t(Landroid/graphics/Bitmap;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lad/L;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lf4/i;

    .line 8
    .line 9
    invoke-interface {v1, p1, p2, p3, v0}, Lf4/i;->r(Lf4/c;Landroid/graphics/Bitmap;Ljava/util/Map;I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public a(Lnet/zetetic/database/sqlcipher/SQLiteConnection;)V
    .locals 4

    .line 1
    const-string v0, "PRAGMA cipher_migrate;"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p1, v0, v1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->l(Ljava/lang/String;[Ljava/lang/Object;)J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    cmp-long p1, v0, v2

    .line 11
    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object p1, p0, Lad/L;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p1, Ljava/lang/Exception;

    .line 18
    .line 19
    throw p1
.end method

.method public accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/fido/zzp;

    .line 2
    .line 3
    check-cast p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 4
    .line 5
    new-instance v0, Lu7/b;

    .line 6
    .line 7
    invoke-direct {v0, p2}, Lu7/b;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/f;->getService()Landroid/os/IInterface;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lcom/google/android/gms/internal/fido/zzs;

    .line 15
    .line 16
    iget-object p2, p0, Lad/L;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p2, Lv7/y;

    .line 19
    .line 20
    invoke-virtual {p1, v0, p2}, Lcom/google/android/gms/internal/fido/zzs;->zzc(Lcom/google/android/gms/internal/fido/zzr;Lv7/y;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public b(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public c(Landroid/net/Uri;[Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    .locals 8

    .line 1
    const-string v3, "query = ?"

    .line 2
    .line 3
    const/4 v7, 0x0

    .line 4
    iget-object v0, p0, Lad/L;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Landroid/content/ContentProviderClient;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return-object v7

    .line 11
    :cond_0
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x0

    .line 13
    move-object v1, p1

    .line 14
    move-object v2, p2

    .line 15
    move-object v4, p3

    .line 16
    :try_start_0
    invoke-virtual/range {v0 .. v6}, Landroid/content/ContentProviderClient;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/database/Cursor;

    .line 17
    .line 18
    .line 19
    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    return-object p1

    .line 21
    :catch_0
    move-exception v0

    .line 22
    move-object p1, v0

    .line 23
    const-string p2, "FontsProvider"

    .line 24
    .line 25
    const-string p3, "Unable to query the content provider"

    .line 26
    .line 27
    invoke-static {p2, p3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 28
    .line 29
    .line 30
    return-object v7
.end method

.method public close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lad/L;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/ContentProviderClient;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/content/ContentProviderClient;->release()Z

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public d(Ljava/nio/ByteBuffer;Lmc/g;)V
    .locals 0

    .line 1
    sget-object p2, Luc/y;->b:Luc/y;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Luc/y;->c(Ljava/nio/ByteBuffer;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lad/L;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p1, Lmc/b;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public e(Ls9/m;)Z
    .locals 3

    .line 1
    iget-object v0, p1, Ls9/e;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    rem-int/lit8 v0, v0, 0x2

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x1

    .line 11
    if-ne v0, v2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v2, v1

    .line 15
    :goto_0
    const-string v0, "Expected a collection path."

    .line 16
    .line 17
    new-array v1, v1, [Ljava/lang/Object;

    .line 18
    .line 19
    invoke-static {v2, v0, v1}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Ls9/e;->f()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {p1}, Ls9/e;->k()Ls9/e;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, Ls9/m;

    .line 31
    .line 32
    iget-object v1, p0, Lad/L;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, Ljava/util/HashMap;

    .line 35
    .line 36
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, Ljava/util/HashSet;

    .line 41
    .line 42
    if-nez v2, :cond_1

    .line 43
    .line 44
    new-instance v2, Ljava/util/HashSet;

    .line 45
    .line 46
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    :cond_1
    invoke-virtual {v2, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    return p1
.end method

.method public g()Ljava/nio/channels/FileChannel;
    .locals 2

    .line 1
    new-instance v0, Ljava/io/FileInputStream;

    .line 2
    .line 3
    iget-object v1, p0, Lad/L;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/io/File;

    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/io/FileInputStream;->getChannel()Ljava/nio/channels/FileChannel;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0
.end method

.method public h(Ljava/lang/String;)Lx6/g;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lad/L;->n()Lcom/google/android/gms/ads/AdRequest$Builder;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    new-instance v0, Lx6/g;

    .line 15
    .line 16
    invoke-direct {v0, p1}, Lx6/g;-><init>(LA7/B0;)V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_0
    invoke-virtual {p0}, Lad/L;->n()Lcom/google/android/gms/ads/AdRequest$Builder;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/AdRequest$Builder;->setAdString(Ljava/lang/String;)Lcom/google/android/gms/ads/AdRequest$Builder;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    new-instance v0, Lx6/g;

    .line 32
    .line 33
    invoke-direct {v0, p1}, Lx6/g;-><init>(LA7/B0;)V

    .line 34
    .line 35
    .line 36
    return-object v0
.end method

.method public i(I)Ll1/e;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return-object p1
.end method

.method public j(Ljava/lang/Object;)Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v1, Ljava/io/StringWriter;

    .line 2
    .line 3
    invoke-direct {v1}, Ljava/io/StringWriter;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    new-instance v0, Lj9/e;

    .line 7
    .line 8
    iget-object v2, p0, Lad/L;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v2, Lj9/d;

    .line 11
    .line 12
    move-object v3, v2

    .line 13
    iget-object v2, v3, Lj9/d;->a:Ljava/util/HashMap;

    .line 14
    .line 15
    move-object v4, v3

    .line 16
    iget-object v3, v4, Lj9/d;->b:Ljava/util/HashMap;

    .line 17
    .line 18
    move-object v5, v4

    .line 19
    iget-object v4, v5, Lj9/d;->c:Lj9/a;

    .line 20
    .line 21
    iget-boolean v5, v5, Lj9/d;->d:Z

    .line 22
    .line 23
    invoke-direct/range {v0 .. v5}, Lj9/e;-><init>(Ljava/io/Writer;Ljava/util/HashMap;Ljava/util/HashMap;Lj9/a;Z)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p1}, Lj9/e;->a(Ljava/lang/Object;)Lj9/e;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lj9/e;->c()V

    .line 30
    .line 31
    .line 32
    iget-object p1, v0, Lj9/e;->b:Landroid/util/JsonWriter;

    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/util/JsonWriter;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    .line 36
    .line 37
    :catch_0
    invoke-virtual {v1}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    return-object p1
.end method

.method public k(I)Ll1/e;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return-object p1
.end method

.method public l(Lp/k;Z)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Lp/k;->k()Lp/k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-eq v0, p1, :cond_0

    .line 8
    .line 9
    move v3, v2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v3, v1

    .line 12
    :goto_0
    if-eqz v3, :cond_1

    .line 13
    .line 14
    move-object p1, v0

    .line 15
    :cond_1
    iget-object v4, p0, Lad/L;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v4, Lj/w;

    .line 18
    .line 19
    iget-object v5, v4, Lj/w;->L:[Lj/v;

    .line 20
    .line 21
    if-eqz v5, :cond_2

    .line 22
    .line 23
    array-length v6, v5

    .line 24
    goto :goto_1

    .line 25
    :cond_2
    move v6, v1

    .line 26
    :goto_1
    if-ge v1, v6, :cond_4

    .line 27
    .line 28
    aget-object v7, v5, v1

    .line 29
    .line 30
    if-eqz v7, :cond_3

    .line 31
    .line 32
    iget-object v8, v7, Lj/v;->h:Lp/k;

    .line 33
    .line 34
    if-ne v8, p1, :cond_3

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_4
    const/4 v7, 0x0

    .line 41
    :goto_2
    if-eqz v7, :cond_6

    .line 42
    .line 43
    if-eqz v3, :cond_5

    .line 44
    .line 45
    iget p1, v7, Lj/v;->a:I

    .line 46
    .line 47
    invoke-virtual {v4, p1, v7, v0}, Lj/w;->p(ILj/v;Lp/k;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v4, v7, v2}, Lj/w;->r(Lj/v;Z)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_5
    invoke-virtual {v4, v7, p2}, Lj/w;->r(Lj/v;Z)V

    .line 55
    .line 56
    .line 57
    :cond_6
    return-void
.end method

.method public m(Lf4/c;)Lf4/d;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return-object p1
.end method

.method public n()Lcom/google/android/gms/ads/AdRequest$Builder;
    .locals 3

    .line 1
    new-instance v0, Lcom/google/android/gms/ads/AdRequest$Builder;

    .line 2
    .line 3
    const/16 v1, 0xe

    .line 4
    .line 5
    invoke-direct {v0, v1}, LA7/B0;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lad/L;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, LD6/c1;

    .line 11
    .line 12
    iget-object v1, v1, LD6/c1;->a:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/AdRequest$Builder;->setRequestAgent(Ljava/lang/String;)Lcom/google/android/gms/ads/AdRequest$Builder;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "query_info_type"

    .line 19
    .line 20
    const-string v2, "requester_type_5"

    .line 21
    .line 22
    invoke-static {v1, v2}, Lka/n;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const-class v2, Lcom/google/ads/mediation/admob/AdMobAdapter;

    .line 27
    .line 28
    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/ads/AdRequest$Builder;->addNetworkExtrasBundle(Ljava/lang/Class;Landroid/os/Bundle;)Lcom/google/android/gms/ads/AdRequest$Builder;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    return-object v0
.end method

.method public o()I
    .locals 3

    .line 1
    iget-object v0, p0, Lad/L;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 4
    .line 5
    iget v1, v0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->m:I

    .line 6
    .line 7
    iget v2, v0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->l:I

    .line 8
    .line 9
    sub-int/2addr v1, v2

    .line 10
    iget v0, v0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->n:I

    .line 11
    .line 12
    sub-int/2addr v1, v0

    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0
.end method

.method public onMethodCall(Luc/o;Luc/q;)V
    .locals 29

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const/4 v2, 0x5

    .line 6
    const/4 v3, 0x4

    .line 7
    const/4 v4, 0x3

    .line 8
    const/4 v5, 0x2

    .line 9
    const/4 v6, 0x0

    .line 10
    const-string v7, "error"

    .line 11
    .line 12
    const/4 v8, 0x1

    .line 13
    const/4 v9, 0x0

    .line 14
    iget v10, v1, Lad/L;->a:I

    .line 15
    .line 16
    packed-switch v10, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    iget-object v2, v1, Lad/L;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, Ltc/j;

    .line 22
    .line 23
    iget-object v3, v2, Ltc/j;->a:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v3, Lio/flutter/plugin/editing/f;

    .line 26
    .line 27
    if-nez v3, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iget-object v3, v0, Luc/o;->a:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v0, v0, Luc/o;->b:Ljava/lang/Object;

    .line 33
    .line 34
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    const-string v4, "SpellCheck.initiateSpellCheck"

    .line 38
    .line 39
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-nez v3, :cond_1

    .line 44
    .line 45
    move-object/from16 v0, p2

    .line 46
    .line 47
    check-cast v0, Ltc/g;

    .line 48
    .line 49
    invoke-virtual {v0}, Ltc/g;->c()V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    :try_start_0
    check-cast v0, Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    check-cast v3, Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    check-cast v0, Ljava/lang/String;

    .line 66
    .line 67
    iget-object v2, v2, Ltc/j;->a:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v2, Lio/flutter/plugin/editing/f;

    .line 70
    .line 71
    move-object/from16 v4, p2

    .line 72
    .line 73
    check-cast v4, Ltc/g;

    .line 74
    .line 75
    invoke-virtual {v2, v3, v0, v4}, Lio/flutter/plugin/editing/f;->a(Ljava/lang/String;Ljava/lang/String;Ltc/g;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :catch_0
    move-exception v0

    .line 80
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    move-object/from16 v2, p2

    .line 85
    .line 86
    check-cast v2, Ltc/g;

    .line 87
    .line 88
    invoke-virtual {v2, v7, v0, v6}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    :goto_0
    return-void

    .line 92
    :pswitch_0
    iget-object v10, v1, Lad/L;->b:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v10, LY2/B;

    .line 95
    .line 96
    iget-object v11, v10, LY2/B;->c:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v11, Lio/flutter/plugin/platform/n;

    .line 99
    .line 100
    if-nez v11, :cond_2

    .line 101
    .line 102
    goto/16 :goto_4

    .line 103
    .line 104
    :cond_2
    iget-object v11, v0, Luc/o;->a:Ljava/lang/String;

    .line 105
    .line 106
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    const-string v12, "direction"

    .line 110
    .line 111
    const-string v13, "id"

    .line 112
    .line 113
    iget-object v0, v0, Luc/o;->b:Ljava/lang/Object;

    .line 114
    .line 115
    const/4 v14, -0x1

    .line 116
    invoke-virtual {v11}, Ljava/lang/String;->hashCode()I

    .line 117
    .line 118
    .line 119
    move-result v15

    .line 120
    sparse-switch v15, :sswitch_data_0

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :sswitch_0
    const-string v15, "dispose"

    .line 125
    .line 126
    invoke-virtual {v11, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v11

    .line 130
    if-nez v11, :cond_3

    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_3
    move v14, v2

    .line 134
    goto :goto_1

    .line 135
    :sswitch_1
    const-string v15, "isSurfaceControlEnabled"

    .line 136
    .line 137
    invoke-virtual {v11, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v11

    .line 141
    if-nez v11, :cond_4

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_4
    move v14, v3

    .line 145
    goto :goto_1

    .line 146
    :sswitch_2
    const-string v15, "setDirection"

    .line 147
    .line 148
    invoke-virtual {v11, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v11

    .line 152
    if-nez v11, :cond_5

    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_5
    move v14, v4

    .line 156
    goto :goto_1

    .line 157
    :sswitch_3
    const-string v15, "touch"

    .line 158
    .line 159
    invoke-virtual {v11, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v11

    .line 163
    if-nez v11, :cond_6

    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_6
    move v14, v5

    .line 167
    goto :goto_1

    .line 168
    :sswitch_4
    const-string v15, "clearFocus"

    .line 169
    .line 170
    invoke-virtual {v11, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v11

    .line 174
    if-nez v11, :cond_7

    .line 175
    .line 176
    goto :goto_1

    .line 177
    :cond_7
    move v14, v8

    .line 178
    goto :goto_1

    .line 179
    :sswitch_5
    const-string v15, "create"

    .line 180
    .line 181
    invoke-virtual {v11, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v11

    .line 185
    if-nez v11, :cond_8

    .line 186
    .line 187
    goto :goto_1

    .line 188
    :cond_8
    move v14, v9

    .line 189
    :goto_1
    packed-switch v14, :pswitch_data_1

    .line 190
    .line 191
    .line 192
    move-object/from16 v0, p2

    .line 193
    .line 194
    check-cast v0, Ltc/g;

    .line 195
    .line 196
    invoke-virtual {v0}, Ltc/g;->c()V

    .line 197
    .line 198
    .line 199
    goto/16 :goto_4

    .line 200
    .line 201
    :pswitch_1
    check-cast v0, Ljava/util/Map;

    .line 202
    .line 203
    invoke-interface {v0, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    check-cast v0, Ljava/lang/Integer;

    .line 208
    .line 209
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 210
    .line 211
    .line 212
    move-result v0

    .line 213
    :try_start_1
    iget-object v2, v10, LY2/B;->c:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast v2, Lio/flutter/plugin/platform/n;

    .line 216
    .line 217
    invoke-virtual {v2, v0}, Lio/flutter/plugin/platform/n;->e(I)V

    .line 218
    .line 219
    .line 220
    move-object/from16 v0, p2

    .line 221
    .line 222
    check-cast v0, Ltc/g;

    .line 223
    .line 224
    invoke-virtual {v0, v6}, Ltc/g;->a(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    .line 225
    .line 226
    .line 227
    goto/16 :goto_4

    .line 228
    .line 229
    :catch_1
    move-exception v0

    .line 230
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    move-object/from16 v2, p2

    .line 235
    .line 236
    check-cast v2, Ltc/g;

    .line 237
    .line 238
    invoke-virtual {v2, v7, v0, v6}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 239
    .line 240
    .line 241
    goto/16 :goto_4

    .line 242
    .line 243
    :pswitch_2
    iget-object v0, v10, LY2/B;->c:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast v0, Lio/flutter/plugin/platform/n;

    .line 246
    .line 247
    iget-object v0, v0, Lio/flutter/plugin/platform/n;->b:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast v0, Lio/flutter/plugin/platform/p;

    .line 250
    .line 251
    iget-object v0, v0, Lio/flutter/plugin/platform/p;->e:Lio/flutter/embedding/engine/FlutterJNI;

    .line 252
    .line 253
    if-nez v0, :cond_9

    .line 254
    .line 255
    goto :goto_2

    .line 256
    :cond_9
    invoke-virtual {v0}, Lio/flutter/embedding/engine/FlutterJNI;->IsSurfaceControlEnabled()Z

    .line 257
    .line 258
    .line 259
    move-result v9

    .line 260
    :goto_2
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    move-object/from16 v2, p2

    .line 265
    .line 266
    check-cast v2, Ltc/g;

    .line 267
    .line 268
    invoke-virtual {v2, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 269
    .line 270
    .line 271
    goto/16 :goto_4

    .line 272
    .line 273
    :pswitch_3
    check-cast v0, Ljava/util/Map;

    .line 274
    .line 275
    invoke-interface {v0, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v2

    .line 279
    check-cast v2, Ljava/lang/Integer;

    .line 280
    .line 281
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 282
    .line 283
    .line 284
    move-result v2

    .line 285
    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    check-cast v0, Ljava/lang/Integer;

    .line 290
    .line 291
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 292
    .line 293
    .line 294
    move-result v0

    .line 295
    :try_start_2
    iget-object v3, v10, LY2/B;->c:Ljava/lang/Object;

    .line 296
    .line 297
    check-cast v3, Lio/flutter/plugin/platform/n;

    .line 298
    .line 299
    invoke-virtual {v3, v2, v0}, Lio/flutter/plugin/platform/n;->l(II)V

    .line 300
    .line 301
    .line 302
    move-object/from16 v0, p2

    .line 303
    .line 304
    check-cast v0, Ltc/g;

    .line 305
    .line 306
    invoke-virtual {v0, v6}, Ltc/g;->a(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_2

    .line 307
    .line 308
    .line 309
    goto/16 :goto_4

    .line 310
    .line 311
    :catch_2
    move-exception v0

    .line 312
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    move-object/from16 v2, p2

    .line 317
    .line 318
    check-cast v2, Ltc/g;

    .line 319
    .line 320
    invoke-virtual {v2, v7, v0, v6}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 321
    .line 322
    .line 323
    goto/16 :goto_4

    .line 324
    .line 325
    :pswitch_4
    check-cast v0, Ljava/util/List;

    .line 326
    .line 327
    new-instance v11, Ltc/f;

    .line 328
    .line 329
    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v9

    .line 333
    check-cast v9, Ljava/lang/Integer;

    .line 334
    .line 335
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 336
    .line 337
    .line 338
    move-result v12

    .line 339
    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v8

    .line 343
    move-object v13, v8

    .line 344
    check-cast v13, Ljava/lang/Number;

    .line 345
    .line 346
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v5

    .line 350
    move-object v14, v5

    .line 351
    check-cast v14, Ljava/lang/Number;

    .line 352
    .line 353
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v4

    .line 357
    check-cast v4, Ljava/lang/Integer;

    .line 358
    .line 359
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 360
    .line 361
    .line 362
    move-result v15

    .line 363
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v3

    .line 367
    check-cast v3, Ljava/lang/Integer;

    .line 368
    .line 369
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 370
    .line 371
    .line 372
    move-result v16

    .line 373
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v17

    .line 377
    const/4 v2, 0x6

    .line 378
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v18

    .line 382
    const/4 v2, 0x7

    .line 383
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v2

    .line 387
    check-cast v2, Ljava/lang/Integer;

    .line 388
    .line 389
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 390
    .line 391
    .line 392
    move-result v19

    .line 393
    const/16 v2, 0x8

    .line 394
    .line 395
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v2

    .line 399
    check-cast v2, Ljava/lang/Integer;

    .line 400
    .line 401
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 402
    .line 403
    .line 404
    move-result v20

    .line 405
    const/16 v2, 0x9

    .line 406
    .line 407
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v2

    .line 411
    check-cast v2, Ljava/lang/Double;

    .line 412
    .line 413
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    .line 414
    .line 415
    .line 416
    move-result-wide v2

    .line 417
    double-to-float v2, v2

    .line 418
    const/16 v3, 0xa

    .line 419
    .line 420
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v3

    .line 424
    check-cast v3, Ljava/lang/Double;

    .line 425
    .line 426
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    .line 427
    .line 428
    .line 429
    move-result-wide v3

    .line 430
    double-to-float v3, v3

    .line 431
    const/16 v4, 0xb

    .line 432
    .line 433
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v4

    .line 437
    check-cast v4, Ljava/lang/Integer;

    .line 438
    .line 439
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 440
    .line 441
    .line 442
    move-result v23

    .line 443
    const/16 v4, 0xc

    .line 444
    .line 445
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object v4

    .line 449
    check-cast v4, Ljava/lang/Integer;

    .line 450
    .line 451
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 452
    .line 453
    .line 454
    move-result v24

    .line 455
    const/16 v4, 0xd

    .line 456
    .line 457
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object v4

    .line 461
    check-cast v4, Ljava/lang/Integer;

    .line 462
    .line 463
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 464
    .line 465
    .line 466
    move-result v25

    .line 467
    const/16 v4, 0xe

    .line 468
    .line 469
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    move-result-object v4

    .line 473
    check-cast v4, Ljava/lang/Integer;

    .line 474
    .line 475
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 476
    .line 477
    .line 478
    move-result v26

    .line 479
    const/16 v4, 0xf

    .line 480
    .line 481
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    move-result-object v0

    .line 485
    check-cast v0, Ljava/lang/Number;

    .line 486
    .line 487
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 488
    .line 489
    .line 490
    move-result-wide v27

    .line 491
    move/from16 v21, v2

    .line 492
    .line 493
    move/from16 v22, v3

    .line 494
    .line 495
    invoke-direct/range {v11 .. v28}, Ltc/f;-><init>(ILjava/lang/Number;Ljava/lang/Number;IILjava/lang/Object;Ljava/lang/Object;IIFFIIIIJ)V

    .line 496
    .line 497
    .line 498
    :try_start_3
    iget-object v0, v10, LY2/B;->c:Ljava/lang/Object;

    .line 499
    .line 500
    check-cast v0, Lio/flutter/plugin/platform/n;

    .line 501
    .line 502
    invoke-virtual {v0, v11}, Lio/flutter/plugin/platform/n;->i(Ltc/f;)V

    .line 503
    .line 504
    .line 505
    move-object/from16 v0, p2

    .line 506
    .line 507
    check-cast v0, Ltc/g;

    .line 508
    .line 509
    invoke-virtual {v0, v6}, Ltc/g;->a(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_3

    .line 510
    .line 511
    .line 512
    goto/16 :goto_4

    .line 513
    .line 514
    :catch_3
    move-exception v0

    .line 515
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 516
    .line 517
    .line 518
    move-result-object v0

    .line 519
    move-object/from16 v2, p2

    .line 520
    .line 521
    check-cast v2, Ltc/g;

    .line 522
    .line 523
    invoke-virtual {v2, v7, v0, v6}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 524
    .line 525
    .line 526
    goto/16 :goto_4

    .line 527
    .line 528
    :pswitch_5
    check-cast v0, Ljava/lang/Integer;

    .line 529
    .line 530
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 531
    .line 532
    .line 533
    move-result v0

    .line 534
    :try_start_4
    iget-object v2, v10, LY2/B;->c:Ljava/lang/Object;

    .line 535
    .line 536
    check-cast v2, Lio/flutter/plugin/platform/n;

    .line 537
    .line 538
    invoke-virtual {v2, v0}, Lio/flutter/plugin/platform/n;->b(I)V

    .line 539
    .line 540
    .line 541
    move-object/from16 v0, p2

    .line 542
    .line 543
    check-cast v0, Ltc/g;

    .line 544
    .line 545
    invoke-virtual {v0, v6}, Ltc/g;->a(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/IllegalStateException; {:try_start_4 .. :try_end_4} :catch_4

    .line 546
    .line 547
    .line 548
    goto :goto_4

    .line 549
    :catch_4
    move-exception v0

    .line 550
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 551
    .line 552
    .line 553
    move-result-object v0

    .line 554
    move-object/from16 v2, p2

    .line 555
    .line 556
    check-cast v2, Ltc/g;

    .line 557
    .line 558
    invoke-virtual {v2, v7, v0, v6}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 559
    .line 560
    .line 561
    goto :goto_4

    .line 562
    :pswitch_6
    check-cast v0, Ljava/util/Map;

    .line 563
    .line 564
    const-string v2, "params"

    .line 565
    .line 566
    invoke-interface {v0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 567
    .line 568
    .line 569
    move-result v3

    .line 570
    if-eqz v3, :cond_a

    .line 571
    .line 572
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 573
    .line 574
    .line 575
    move-result-object v2

    .line 576
    check-cast v2, [B

    .line 577
    .line 578
    invoke-static {v2}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 579
    .line 580
    .line 581
    move-result-object v2

    .line 582
    goto :goto_3

    .line 583
    :cond_a
    move-object v2, v6

    .line 584
    :goto_3
    :try_start_5
    new-instance v3, LM2/d;

    .line 585
    .line 586
    invoke-interface {v0, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 587
    .line 588
    .line 589
    move-result-object v4

    .line 590
    check-cast v4, Ljava/lang/Integer;

    .line 591
    .line 592
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 593
    .line 594
    .line 595
    move-result v4

    .line 596
    const-string v5, "viewType"

    .line 597
    .line 598
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 599
    .line 600
    .line 601
    move-result-object v5

    .line 602
    check-cast v5, Ljava/lang/String;

    .line 603
    .line 604
    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 605
    .line 606
    .line 607
    move-result-object v0

    .line 608
    check-cast v0, Ljava/lang/Integer;

    .line 609
    .line 610
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 611
    .line 612
    .line 613
    move-result v0

    .line 614
    invoke-direct {v3, v5, v2, v4, v0}, LM2/d;-><init>(Ljava/lang/String;Ljava/nio/ByteBuffer;II)V

    .line 615
    .line 616
    .line 617
    iget-object v0, v10, LY2/B;->c:Ljava/lang/Object;

    .line 618
    .line 619
    check-cast v0, Lio/flutter/plugin/platform/n;

    .line 620
    .line 621
    invoke-virtual {v0, v3}, Lio/flutter/plugin/platform/n;->d(LM2/d;)V

    .line 622
    .line 623
    .line 624
    move-object/from16 v0, p2

    .line 625
    .line 626
    check-cast v0, Ltc/g;

    .line 627
    .line 628
    invoke-virtual {v0, v6}, Ltc/g;->a(Ljava/lang/Object;)V
    :try_end_5
    .catch Ljava/lang/IllegalStateException; {:try_start_5 .. :try_end_5} :catch_5

    .line 629
    .line 630
    .line 631
    goto :goto_4

    .line 632
    :catch_5
    move-exception v0

    .line 633
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 634
    .line 635
    .line 636
    move-result-object v0

    .line 637
    move-object/from16 v2, p2

    .line 638
    .line 639
    check-cast v2, Ltc/g;

    .line 640
    .line 641
    invoke-virtual {v2, v7, v0, v6}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 642
    .line 643
    .line 644
    :goto_4
    return-void

    .line 645
    :pswitch_7
    const-string v2, "Error when setting cursors: "

    .line 646
    .line 647
    iget-object v3, v1, Lad/L;->b:Ljava/lang/Object;

    .line 648
    .line 649
    check-cast v3, La2/c;

    .line 650
    .line 651
    iget-object v4, v3, La2/c;->b:Ljava/lang/Object;

    .line 652
    .line 653
    check-cast v4, Lwc/a;

    .line 654
    .line 655
    if-nez v4, :cond_b

    .line 656
    .line 657
    goto :goto_6

    .line 658
    :cond_b
    iget-object v4, v0, Luc/o;->a:Ljava/lang/String;

    .line 659
    .line 660
    :try_start_6
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 661
    .line 662
    .line 663
    move-result v5

    .line 664
    const v8, -0x4de8d908

    .line 665
    .line 666
    .line 667
    if-eq v5, v8, :cond_c

    .line 668
    .line 669
    goto :goto_6

    .line 670
    :cond_c
    const-string v5, "activateSystemCursor"

    .line 671
    .line 672
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 673
    .line 674
    .line 675
    move-result v4

    .line 676
    if-eqz v4, :cond_d

    .line 677
    .line 678
    iget-object v0, v0, Luc/o;->b:Ljava/lang/Object;

    .line 679
    .line 680
    check-cast v0, Ljava/util/HashMap;

    .line 681
    .line 682
    const-string v4, "kind"

    .line 683
    .line 684
    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 685
    .line 686
    .line 687
    move-result-object v0

    .line 688
    check-cast v0, Ljava/lang/String;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6

    .line 689
    .line 690
    :try_start_7
    iget-object v3, v3, La2/c;->b:Ljava/lang/Object;

    .line 691
    .line 692
    check-cast v3, Lwc/a;

    .line 693
    .line 694
    invoke-virtual {v3, v0}, Lwc/a;->a(Ljava/lang/String;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_7

    .line 695
    .line 696
    .line 697
    :try_start_8
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 698
    .line 699
    move-object/from16 v2, p2

    .line 700
    .line 701
    check-cast v2, Ltc/g;

    .line 702
    .line 703
    invoke-virtual {v2, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 704
    .line 705
    .line 706
    goto :goto_6

    .line 707
    :catch_6
    move-exception v0

    .line 708
    goto :goto_5

    .line 709
    :catch_7
    move-exception v0

    .line 710
    new-instance v3, Ljava/lang/StringBuilder;

    .line 711
    .line 712
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 713
    .line 714
    .line 715
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 716
    .line 717
    .line 718
    move-result-object v0

    .line 719
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 720
    .line 721
    .line 722
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 723
    .line 724
    .line 725
    move-result-object v0

    .line 726
    move-object/from16 v2, p2

    .line 727
    .line 728
    check-cast v2, Ltc/g;

    .line 729
    .line 730
    invoke-virtual {v2, v7, v0, v6}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_6

    .line 731
    .line 732
    .line 733
    goto :goto_6

    .line 734
    :goto_5
    new-instance v2, Ljava/lang/StringBuilder;

    .line 735
    .line 736
    const-string v3, "Unhandled error: "

    .line 737
    .line 738
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 739
    .line 740
    .line 741
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 742
    .line 743
    .line 744
    move-result-object v0

    .line 745
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 746
    .line 747
    .line 748
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 749
    .line 750
    .line 751
    move-result-object v0

    .line 752
    move-object/from16 v2, p2

    .line 753
    .line 754
    check-cast v2, Ltc/g;

    .line 755
    .line 756
    invoke-virtual {v2, v7, v0, v6}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 757
    .line 758
    .line 759
    :cond_d
    :goto_6
    return-void

    .line 760
    nop

    .line 761
    :pswitch_data_0
    .packed-switch 0x1a
        :pswitch_7
        :pswitch_0
    .end packed-switch

    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    :sswitch_data_0
    .sparse-switch
        -0x509a5f04 -> :sswitch_5
        -0x2d106975 -> :sswitch_4
        0x696df3f -> :sswitch_3
        0x2261393d -> :sswitch_2
        0x2cc8f227 -> :sswitch_1
        0x63a5261f -> :sswitch_0
    .end sparse-switch

    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public onNativeAdLoaded(Lcom/google/android/gms/ads/nativead/NativeAd;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lad/L;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_11

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lad/J;

    .line 16
    .line 17
    iget-object v1, v0, Lad/J;->h:Lbd/b;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    const-string v2, "layout_inflater"

    .line 23
    .line 24
    iget-object v3, v0, Lad/J;->j:Landroid/content/Context;

    .line 25
    .line 26
    invoke-virtual {v3, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Landroid/view/LayoutInflater;

    .line 31
    .line 32
    iget-object v3, v1, Lbd/b;->a:Lbd/d;

    .line 33
    .line 34
    iget v3, v3, Lbd/d;->a:I

    .line 35
    .line 36
    const/4 v4, 0x0

    .line 37
    invoke-virtual {v2, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, Lcom/google/android/ads/nativetemplates/TemplateView;

    .line 42
    .line 43
    new-instance v3, Lp5/a;

    .line 44
    .line 45
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 46
    .line 47
    .line 48
    iget-object v4, v1, Lbd/b;->b:Landroid/graphics/drawable/ColorDrawable;

    .line 49
    .line 50
    if-eqz v4, :cond_0

    .line 51
    .line 52
    iput-object v4, v3, Lp5/a;->q:Landroid/graphics/drawable/ColorDrawable;

    .line 53
    .line 54
    :cond_0
    iget-object v4, v1, Lbd/b;->c:Lbd/c;

    .line 55
    .line 56
    if-eqz v4, :cond_4

    .line 57
    .line 58
    iget-object v5, v4, Lbd/c;->b:Landroid/graphics/drawable/ColorDrawable;

    .line 59
    .line 60
    if-eqz v5, :cond_1

    .line 61
    .line 62
    iput-object v5, v3, Lp5/a;->d:Landroid/graphics/drawable/ColorDrawable;

    .line 63
    .line 64
    :cond_1
    iget-object v5, v4, Lbd/c;->a:Landroid/graphics/drawable/ColorDrawable;

    .line 65
    .line 66
    if-eqz v5, :cond_2

    .line 67
    .line 68
    invoke-virtual {v5}, Landroid/graphics/drawable/ColorDrawable;->getColor()I

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    iput-object v5, v3, Lp5/a;->c:Ljava/lang/Integer;

    .line 77
    .line 78
    :cond_2
    iget-object v5, v4, Lbd/c;->c:Lbd/a;

    .line 79
    .line 80
    if-eqz v5, :cond_3

    .line 81
    .line 82
    invoke-virtual {v5}, Lbd/a;->a()Landroid/graphics/Typeface;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    iput-object v5, v3, Lp5/a;->a:Landroid/graphics/Typeface;

    .line 87
    .line 88
    :cond_3
    invoke-virtual {v4}, Lbd/c;->a()Ljava/lang/Float;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    if-eqz v5, :cond_4

    .line 93
    .line 94
    invoke-virtual {v4}, Lbd/c;->a()Ljava/lang/Float;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    iput v4, v3, Lp5/a;->b:F

    .line 103
    .line 104
    :cond_4
    iget-object v4, v1, Lbd/b;->d:Lbd/c;

    .line 105
    .line 106
    if-eqz v4, :cond_8

    .line 107
    .line 108
    iget-object v5, v4, Lbd/c;->b:Landroid/graphics/drawable/ColorDrawable;

    .line 109
    .line 110
    if-eqz v5, :cond_5

    .line 111
    .line 112
    iput-object v5, v3, Lp5/a;->h:Landroid/graphics/drawable/ColorDrawable;

    .line 113
    .line 114
    :cond_5
    iget-object v5, v4, Lbd/c;->a:Landroid/graphics/drawable/ColorDrawable;

    .line 115
    .line 116
    if-eqz v5, :cond_6

    .line 117
    .line 118
    invoke-virtual {v5}, Landroid/graphics/drawable/ColorDrawable;->getColor()I

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    iput-object v5, v3, Lp5/a;->g:Ljava/lang/Integer;

    .line 127
    .line 128
    :cond_6
    iget-object v5, v4, Lbd/c;->c:Lbd/a;

    .line 129
    .line 130
    if-eqz v5, :cond_7

    .line 131
    .line 132
    invoke-virtual {v5}, Lbd/a;->a()Landroid/graphics/Typeface;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    iput-object v5, v3, Lp5/a;->e:Landroid/graphics/Typeface;

    .line 137
    .line 138
    :cond_7
    invoke-virtual {v4}, Lbd/c;->a()Ljava/lang/Float;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    if-eqz v5, :cond_8

    .line 143
    .line 144
    invoke-virtual {v4}, Lbd/c;->a()Ljava/lang/Float;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    .line 149
    .line 150
    .line 151
    move-result v4

    .line 152
    iput v4, v3, Lp5/a;->f:F

    .line 153
    .line 154
    :cond_8
    iget-object v4, v1, Lbd/b;->e:Lbd/c;

    .line 155
    .line 156
    if-eqz v4, :cond_c

    .line 157
    .line 158
    iget-object v5, v4, Lbd/c;->b:Landroid/graphics/drawable/ColorDrawable;

    .line 159
    .line 160
    if-eqz v5, :cond_9

    .line 161
    .line 162
    iput-object v5, v3, Lp5/a;->l:Landroid/graphics/drawable/ColorDrawable;

    .line 163
    .line 164
    :cond_9
    iget-object v5, v4, Lbd/c;->a:Landroid/graphics/drawable/ColorDrawable;

    .line 165
    .line 166
    if-eqz v5, :cond_a

    .line 167
    .line 168
    invoke-virtual {v5}, Landroid/graphics/drawable/ColorDrawable;->getColor()I

    .line 169
    .line 170
    .line 171
    move-result v5

    .line 172
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 173
    .line 174
    .line 175
    move-result-object v5

    .line 176
    iput-object v5, v3, Lp5/a;->k:Ljava/lang/Integer;

    .line 177
    .line 178
    :cond_a
    iget-object v5, v4, Lbd/c;->c:Lbd/a;

    .line 179
    .line 180
    if-eqz v5, :cond_b

    .line 181
    .line 182
    invoke-virtual {v5}, Lbd/a;->a()Landroid/graphics/Typeface;

    .line 183
    .line 184
    .line 185
    move-result-object v5

    .line 186
    iput-object v5, v3, Lp5/a;->i:Landroid/graphics/Typeface;

    .line 187
    .line 188
    :cond_b
    invoke-virtual {v4}, Lbd/c;->a()Ljava/lang/Float;

    .line 189
    .line 190
    .line 191
    move-result-object v5

    .line 192
    if-eqz v5, :cond_c

    .line 193
    .line 194
    invoke-virtual {v4}, Lbd/c;->a()Ljava/lang/Float;

    .line 195
    .line 196
    .line 197
    move-result-object v4

    .line 198
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    .line 199
    .line 200
    .line 201
    move-result v4

    .line 202
    iput v4, v3, Lp5/a;->j:F

    .line 203
    .line 204
    :cond_c
    iget-object v1, v1, Lbd/b;->f:Lbd/c;

    .line 205
    .line 206
    if-eqz v1, :cond_10

    .line 207
    .line 208
    iget-object v4, v1, Lbd/c;->b:Landroid/graphics/drawable/ColorDrawable;

    .line 209
    .line 210
    if-eqz v4, :cond_d

    .line 211
    .line 212
    iput-object v4, v3, Lp5/a;->p:Landroid/graphics/drawable/ColorDrawable;

    .line 213
    .line 214
    :cond_d
    iget-object v4, v1, Lbd/c;->a:Landroid/graphics/drawable/ColorDrawable;

    .line 215
    .line 216
    if-eqz v4, :cond_e

    .line 217
    .line 218
    invoke-virtual {v4}, Landroid/graphics/drawable/ColorDrawable;->getColor()I

    .line 219
    .line 220
    .line 221
    move-result v4

    .line 222
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 223
    .line 224
    .line 225
    move-result-object v4

    .line 226
    iput-object v4, v3, Lp5/a;->o:Ljava/lang/Integer;

    .line 227
    .line 228
    :cond_e
    iget-object v4, v1, Lbd/c;->c:Lbd/a;

    .line 229
    .line 230
    if-eqz v4, :cond_f

    .line 231
    .line 232
    invoke-virtual {v4}, Lbd/a;->a()Landroid/graphics/Typeface;

    .line 233
    .line 234
    .line 235
    move-result-object v4

    .line 236
    iput-object v4, v3, Lp5/a;->m:Landroid/graphics/Typeface;

    .line 237
    .line 238
    :cond_f
    invoke-virtual {v1}, Lbd/c;->a()Ljava/lang/Float;

    .line 239
    .line 240
    .line 241
    move-result-object v4

    .line 242
    if-eqz v4, :cond_10

    .line 243
    .line 244
    invoke-virtual {v1}, Lbd/c;->a()Ljava/lang/Float;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 249
    .line 250
    .line 251
    move-result v1

    .line 252
    iput v1, v3, Lp5/a;->n:F

    .line 253
    .line 254
    :cond_10
    invoke-virtual {v2, v3}, Lcom/google/android/ads/nativetemplates/TemplateView;->setStyles(Lp5/a;)V

    .line 255
    .line 256
    .line 257
    iput-object v2, v0, Lad/J;->i:Lcom/google/android/ads/nativetemplates/TemplateView;

    .line 258
    .line 259
    invoke-virtual {v2, p1}, Lcom/google/android/ads/nativetemplates/TemplateView;->setNativeAd(Lcom/google/android/gms/ads/nativead/NativeAd;)V

    .line 260
    .line 261
    .line 262
    new-instance v1, LS3/e;

    .line 263
    .line 264
    iget-object v2, v0, Lad/J;->b:LG9/e;

    .line 265
    .line 266
    const/16 v3, 0x1c

    .line 267
    .line 268
    const/4 v4, 0x0

    .line 269
    invoke-direct {v1, v2, v4, v0, v3}, LS3/e;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {p1, v1}, Lcom/google/android/gms/ads/nativead/NativeAd;->setOnPaidEventListener(Lx6/q;)V

    .line 273
    .line 274
    .line 275
    iget v0, v0, Lad/i;->a:I

    .line 276
    .line 277
    invoke-virtual {p1}, Lcom/google/android/gms/ads/nativead/NativeAd;->getResponseInfo()Lx6/t;

    .line 278
    .line 279
    .line 280
    move-result-object p1

    .line 281
    invoke-virtual {v2, v0, p1}, LG9/e;->z(ILx6/t;)V

    .line 282
    .line 283
    .line 284
    :cond_11
    return-void
.end method

.method public p(I)Lc9/d;
    .locals 6

    .line 1
    iget-object v0, p0, Lad/L;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lp9/s;

    .line 4
    .line 5
    invoke-virtual {v0}, Lp9/s;->e()Lp9/z;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, v0, Lp9/z;->g:Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lp9/y;

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    iget-boolean v2, v1, Lp9/y;->b:Z

    .line 24
    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    sget-object p1, Ls9/h;->c:Lc9/d;

    .line 28
    .line 29
    iget-object v0, v1, Lp9/y;->a:Ls9/h;

    .line 30
    .line 31
    invoke-virtual {p1, v0}, Lc9/d;->a(Ljava/lang/Object;)Lc9/d;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    goto/16 :goto_3

    .line 36
    .line 37
    :cond_0
    sget-object v1, Ls9/h;->c:Lc9/d;

    .line 38
    .line 39
    iget-object v2, v0, Lp9/z;->d:Ljava/util/HashMap;

    .line 40
    .line 41
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-eqz v3, :cond_4

    .line 50
    .line 51
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    check-cast p1, Ljava/util/List;

    .line 60
    .line 61
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-eqz v2, :cond_4

    .line 70
    .line 71
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    check-cast v2, Lp9/u;

    .line 76
    .line 77
    iget-object v3, v0, Lp9/z;->c:Ljava/util/HashMap;

    .line 78
    .line 79
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    if-eqz v4, :cond_1

    .line 84
    .line 85
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    check-cast v2, Lp9/w;

    .line 90
    .line 91
    iget-object v2, v2, Lp9/w;->c:Lp9/C;

    .line 92
    .line 93
    iget-object v2, v2, Lp9/C;->e:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v2, Lc9/d;

    .line 96
    .line 97
    iget-object v3, v1, Lc9/d;->a:Lc9/c;

    .line 98
    .line 99
    invoke-virtual {v3}, Lc9/c;->size()I

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    iget-object v4, v2, Lc9/d;->a:Lc9/c;

    .line 104
    .line 105
    invoke-virtual {v4}, Lc9/c;->size()I

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    if-ge v3, v4, :cond_2

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_2
    move-object v5, v2

    .line 113
    move-object v2, v1

    .line 114
    move-object v1, v5

    .line 115
    :goto_1
    invoke-virtual {v1}, Lc9/d;->iterator()Ljava/util/Iterator;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    :goto_2
    move-object v3, v1

    .line 120
    check-cast v3, LA7/v;

    .line 121
    .line 122
    iget-object v4, v3, LA7/v;->b:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v4, Ljava/util/Iterator;

    .line 125
    .line 126
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    if-eqz v4, :cond_3

    .line 131
    .line 132
    invoke-virtual {v3}, LA7/v;->next()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    invoke-virtual {v2, v3}, Lc9/d;->a(Ljava/lang/Object;)Lc9/d;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    goto :goto_2

    .line 141
    :cond_3
    move-object v1, v2

    .line 142
    goto :goto_0

    .line 143
    :cond_4
    move-object p1, v1

    .line 144
    :goto_3
    return-object p1
.end method

.method public q(FFFF)V
    .locals 5

    .line 1
    iget-object v0, p0, Lad/L;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lba/a;

    .line 4
    .line 5
    invoke-virtual {v0}, Lba/a;->v()Le0/o;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0}, Lba/a;->y()J

    .line 10
    .line 11
    .line 12
    move-result-wide v2

    .line 13
    invoke-static {v2, v3}, Ld0/f;->d(J)F

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    add-float/2addr p3, p1

    .line 18
    sub-float/2addr v2, p3

    .line 19
    invoke-virtual {v0}, Lba/a;->y()J

    .line 20
    .line 21
    .line 22
    move-result-wide v3

    .line 23
    invoke-static {v3, v4}, Ld0/f;->b(J)F

    .line 24
    .line 25
    .line 26
    move-result p3

    .line 27
    add-float/2addr p4, p2

    .line 28
    sub-float/2addr p3, p4

    .line 29
    invoke-static {v2, p3}, Lcom/moloco/sdk/internal/publisher/H;->I(FF)J

    .line 30
    .line 31
    .line 32
    move-result-wide p3

    .line 33
    invoke-static {p3, p4}, Ld0/f;->d(J)F

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    const/4 v3, 0x0

    .line 38
    cmpl-float v2, v2, v3

    .line 39
    .line 40
    if-ltz v2, :cond_0

    .line 41
    .line 42
    invoke-static {p3, p4}, Ld0/f;->b(J)F

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    cmpl-float v2, v2, v3

    .line 47
    .line 48
    if-ltz v2, :cond_0

    .line 49
    .line 50
    invoke-virtual {v0, p3, p4}, Lba/a;->J(J)V

    .line 51
    .line 52
    .line 53
    invoke-interface {v1, p1, p2}, Le0/o;->f(FF)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 58
    .line 59
    const-string p2, "Width and height must be greater than or equal to zero"

    .line 60
    .line 61
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p1
.end method

.method public s(IIJI)V
    .locals 3

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    const-string v1, "initialized"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcb/a;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/util/HashMap;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "width"

    .line 10
    .line 11
    const-string v2, "height"

    .line 12
    .line 13
    invoke-static {p1, v0, v1, p2, v2}, LN0/a;->p(ILjava/util/HashMap;Ljava/lang/String;ILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const-string p2, "duration"

    .line 21
    .line 22
    invoke-virtual {v0, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    if-eqz p5, :cond_0

    .line 26
    .line 27
    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    const-string p2, "rotationCorrection"

    .line 32
    .line 33
    invoke-virtual {v0, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    :cond_0
    iget-object p1, p0, Lad/L;->b:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p1, Lhd/n;

    .line 39
    .line 40
    invoke-virtual {p1, v0}, Lhd/n;->a(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public t(IILandroid/os/Bundle;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public u(LY2/B;Lu0/n;)LE5/b;
    .locals 35

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 4
    .line 5
    iget-object v2, v0, LY2/B;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    invoke-direct {v1, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    const/4 v5, 0x0

    .line 21
    :goto_0
    if-ge v5, v3, :cond_2

    .line 22
    .line 23
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    check-cast v6, Lp0/m;

    .line 28
    .line 29
    move-object/from16 v7, p0

    .line 30
    .line 31
    iget-object v8, v7, Lad/L;->b:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v8, Ljava/util/LinkedHashMap;

    .line 34
    .line 35
    iget-wide v9, v6, Lp0/m;->a:J

    .line 36
    .line 37
    new-instance v11, Lp0/j;

    .line 38
    .line 39
    invoke-direct {v11, v9, v10}, Lp0/j;-><init>(J)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v8, v11}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v9

    .line 46
    check-cast v9, Lp0/l;

    .line 47
    .line 48
    if-nez v9, :cond_0

    .line 49
    .line 50
    iget-wide v9, v6, Lp0/m;->b:J

    .line 51
    .line 52
    iget-wide v11, v6, Lp0/m;->d:J

    .line 53
    .line 54
    move-wide/from16 v23, v9

    .line 55
    .line 56
    move-wide/from16 v25, v11

    .line 57
    .line 58
    const/16 v27, 0x0

    .line 59
    .line 60
    move-object/from16 v12, p2

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_0
    iget-wide v10, v9, Lp0/l;->b:J

    .line 64
    .line 65
    move-object/from16 v12, p2

    .line 66
    .line 67
    invoke-virtual {v12, v10, v11}, Lu0/n;->t(J)J

    .line 68
    .line 69
    .line 70
    move-result-wide v10

    .line 71
    iget-wide v13, v9, Lp0/l;->a:J

    .line 72
    .line 73
    iget-boolean v9, v9, Lp0/l;->c:Z

    .line 74
    .line 75
    move/from16 v27, v9

    .line 76
    .line 77
    move-wide/from16 v25, v10

    .line 78
    .line 79
    move-wide/from16 v23, v13

    .line 80
    .line 81
    :goto_1
    new-instance v9, Lp0/j;

    .line 82
    .line 83
    iget-wide v10, v6, Lp0/m;->a:J

    .line 84
    .line 85
    invoke-direct {v9, v10, v11}, Lp0/j;-><init>(J)V

    .line 86
    .line 87
    .line 88
    new-instance v15, Lp0/k;

    .line 89
    .line 90
    iget-object v13, v6, Lp0/m;->h:Ljava/util/ArrayList;

    .line 91
    .line 92
    move/from16 v32, v5

    .line 93
    .line 94
    iget-wide v4, v6, Lp0/m;->i:J

    .line 95
    .line 96
    move-object/from16 v16, v15

    .line 97
    .line 98
    iget-wide v14, v6, Lp0/m;->b:J

    .line 99
    .line 100
    move-object/from16 v33, v2

    .line 101
    .line 102
    move/from16 v34, v3

    .line 103
    .line 104
    iget-wide v2, v6, Lp0/m;->d:J

    .line 105
    .line 106
    move-wide/from16 v20, v2

    .line 107
    .line 108
    iget-boolean v2, v6, Lp0/m;->e:Z

    .line 109
    .line 110
    iget v3, v6, Lp0/m;->f:I

    .line 111
    .line 112
    move/from16 v22, v2

    .line 113
    .line 114
    move/from16 v28, v3

    .line 115
    .line 116
    move-wide/from16 v30, v4

    .line 117
    .line 118
    move-object/from16 v29, v13

    .line 119
    .line 120
    move-wide/from16 v18, v14

    .line 121
    .line 122
    move-object/from16 v15, v16

    .line 123
    .line 124
    move-wide/from16 v16, v10

    .line 125
    .line 126
    invoke-direct/range {v15 .. v31}, Lp0/k;-><init>(JJJZJJZILjava/util/ArrayList;J)V

    .line 127
    .line 128
    .line 129
    invoke-interface {v1, v9, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    iget-wide v2, v6, Lp0/m;->a:J

    .line 133
    .line 134
    iget-boolean v4, v6, Lp0/m;->e:Z

    .line 135
    .line 136
    if-eqz v4, :cond_1

    .line 137
    .line 138
    new-instance v5, Lp0/j;

    .line 139
    .line 140
    invoke-direct {v5, v2, v3}, Lp0/j;-><init>(J)V

    .line 141
    .line 142
    .line 143
    new-instance v13, Lp0/l;

    .line 144
    .line 145
    iget-wide v14, v6, Lp0/m;->b:J

    .line 146
    .line 147
    iget-wide v2, v6, Lp0/m;->c:J

    .line 148
    .line 149
    move-wide/from16 v16, v2

    .line 150
    .line 151
    move/from16 v18, v4

    .line 152
    .line 153
    invoke-direct/range {v13 .. v18}, Lp0/l;-><init>(JJZ)V

    .line 154
    .line 155
    .line 156
    invoke-interface {v8, v5, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_1
    new-instance v4, Lp0/j;

    .line 161
    .line 162
    invoke-direct {v4, v2, v3}, Lp0/j;-><init>(J)V

    .line 163
    .line 164
    .line 165
    invoke-interface {v8, v4}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    :goto_2
    add-int/lit8 v5, v32, 0x1

    .line 169
    .line 170
    move-object/from16 v2, v33

    .line 171
    .line 172
    move/from16 v3, v34

    .line 173
    .line 174
    goto/16 :goto_0

    .line 175
    .line 176
    :cond_2
    move-object/from16 v7, p0

    .line 177
    .line 178
    new-instance v2, LE5/b;

    .line 179
    .line 180
    invoke-direct {v2, v1, v0}, LE5/b;-><init>(Ljava/util/LinkedHashMap;LY2/B;)V

    .line 181
    .line 182
    .line 183
    return-object v2
.end method

.method public v(FF)V
    .locals 1

    .line 1
    iget-object v0, p0, Lad/L;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lba/a;

    .line 4
    .line 5
    invoke-virtual {v0}, Lba/a;->v()Le0/o;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0, p1, p2}, Le0/o;->f(FF)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public w(Lmd/b0;[B)V
    .locals 3

    .line 1
    const-string v0, "/"

    .line 2
    .line 3
    invoke-static {}, LXd/b;->c()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lad/L;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lpd/k;

    .line 14
    .line 15
    iget-object v0, v0, Lpd/k;->j:LF6/r;

    .line 16
    .line 17
    iget-object v0, v0, LF6/r;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-eqz p2, :cond_0

    .line 29
    .line 30
    iget-object v1, p0, Lad/L;->b:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, Lpd/k;

    .line 33
    .line 34
    const/4 v2, 0x1

    .line 35
    iput-boolean v2, v1, Lpd/k;->q:Z

    .line 36
    .line 37
    new-instance v1, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v0, "?"

    .line 46
    .line 47
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    sget-object v0, Lm8/e;->d:Lm8/c;

    .line 51
    .line 52
    invoke-virtual {v0, p2}, Lm8/e;->c([B)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    goto :goto_0

    .line 64
    :catchall_0
    move-exception p1

    .line 65
    goto :goto_1

    .line 66
    :cond_0
    :goto_0
    iget-object p2, p0, Lad/L;->b:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast p2, Lpd/k;

    .line 69
    .line 70
    iget-object p2, p2, Lpd/k;->n:Lpd/j;

    .line 71
    .line 72
    iget-object p2, p2, Lpd/j;->w:Ljava/lang/Object;

    .line 73
    .line 74
    monitor-enter p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
    :try_start_1
    iget-object v1, p0, Lad/L;->b:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v1, Lpd/k;

    .line 78
    .line 79
    iget-object v1, v1, Lpd/k;->n:Lpd/j;

    .line 80
    .line 81
    invoke-static {v1, p1, v0}, Lpd/j;->k(Lpd/j;Lmd/b0;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 85
    sget-object p1, LXd/b;->a:LXd/a;

    .line 86
    .line 87
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :catchall_1
    move-exception p1

    .line 92
    :try_start_2
    monitor-exit p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 93
    :try_start_3
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 94
    :goto_1
    :try_start_4
    sget-object p2, LXd/b;->a:LXd/a;

    .line 95
    .line 96
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 97
    .line 98
    .line 99
    goto :goto_2

    .line 100
    :catchall_2
    move-exception p2

    .line 101
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 102
    .line 103
    .line 104
    :goto_2
    throw p1
.end method
