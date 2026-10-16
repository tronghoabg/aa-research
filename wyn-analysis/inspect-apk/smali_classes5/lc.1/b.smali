.class public final Llc/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lld/b;


# static fields
.field public static w:J = 0x1L

.field public static final x:Ljava/util/HashMap;


# instance fields
.field public final a:Lio/flutter/embedding/engine/FlutterJNI;

.field public final b:Lio/flutter/embedding/engine/renderer/k;

.field public final c:Lmc/b;

.field public final d:LK8/H;

.field public final e:Lvc/a;

.field public final f:Lme/a;

.field public final g:Lg2/k;

.field public final h:La2/c;

.field public final i:Lac/a;

.field public final j:Lad/L;

.field public final k:Lq/o;

.field public final l:Lba/a;

.field public final m:La2/v;

.field public final n:Ltc/i;

.field public final o:Ltc/j;

.field public final p:Ltc/a;

.field public final q:Lt6/q;

.field public final r:Lio/flutter/plugin/platform/q;

.field public final s:Lio/flutter/plugin/platform/p;

.field public final t:Ljava/util/HashSet;

.field public final u:J

.field public final v:Leb/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Llc/b;->x:Ljava/util/HashMap;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lio/flutter/embedding/engine/FlutterJNI;Lio/flutter/plugin/platform/q;[Ljava/lang/String;ZZ)V
    .locals 9

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Llc/b;->t:Ljava/util/HashSet;

    .line 5
    new-instance v0, Leb/e;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Leb/e;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Llc/b;->v:Leb/e;

    .line 6
    sget-wide v0, Llc/b;->w:J

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    sput-wide v2, Llc/b;->w:J

    iput-wide v0, p0, Llc/b;->u:J

    .line 7
    sget-object v2, Llc/b;->x:Ljava/util/HashMap;

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v2, v0, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 9
    :catch_0
    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    .line 10
    :goto_0
    invoke-static {}, Lb7/k;->z()Lb7/k;

    move-result-object v1

    if-nez p2, :cond_0

    .line 11
    iget-object p2, v1, Lb7/k;->c:Ljava/lang/Object;

    .line 12
    new-instance p2, Lio/flutter/embedding/engine/FlutterJNI;

    invoke-direct {p2}, Lio/flutter/embedding/engine/FlutterJNI;-><init>()V

    .line 13
    :cond_0
    iput-object p2, p0, Llc/b;->a:Lio/flutter/embedding/engine/FlutterJNI;

    .line 14
    new-instance v2, Lmc/b;

    iget-wide v3, p0, Llc/b;->u:J

    invoke-direct {v2, p2, v0, v3, v4}, Lmc/b;-><init>(Lio/flutter/embedding/engine/FlutterJNI;Landroid/content/res/AssetManager;J)V

    iput-object v2, p0, Llc/b;->c:Lmc/b;

    .line 15
    iget-object v0, v2, Lmc/b;->e:Ljava/lang/Object;

    check-cast v0, Lmc/j;

    invoke-virtual {p2, v0}, Lio/flutter/embedding/engine/FlutterJNI;->setPlatformMessageHandler(Lmc/k;)V

    .line 16
    invoke-static {}, Lb7/k;->z()Lb7/k;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    new-instance v0, Lme/a;

    .line 18
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 19
    new-instance v3, La2/v;

    const/16 v4, 0x1a

    invoke-direct {v3, v0, v4}, La2/v;-><init>(Ljava/lang/Object;I)V

    .line 20
    new-instance v4, LVa/X7;

    sget-object v5, Luc/w;->a:Luc/w;

    const/4 v6, 0x0

    .line 21
    const-string v7, "flutter/accessibility"

    invoke-direct {v4, v2, v5, v6, v7}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    iput-object v4, v0, Lme/a;->a:Ljava/lang/Object;

    .line 23
    invoke-virtual {v4, v3}, LVa/X7;->n(Luc/b;)V

    .line 24
    iput-object p2, v0, Lme/a;->b:Ljava/lang/Object;

    .line 25
    iput-object v0, p0, Llc/b;->f:Lme/a;

    .line 26
    new-instance v0, La2/k;

    .line 27
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance v3, La2/c;

    const/16 v4, 0x1b

    invoke-direct {v3, v0, v4}, La2/c;-><init>(Ljava/lang/Object;I)V

    .line 29
    new-instance v0, Luc/r;

    sget-object v4, Luc/x;->b:Luc/x;

    const/4 v5, 0x0

    .line 30
    const-string v6, "flutter/deferredcomponent"

    invoke-direct {v0, v2, v6, v4, v5}, Luc/r;-><init>(Luc/f;Ljava/lang/String;Luc/s;Lab/b;)V

    .line 31
    invoke-virtual {v0, v3}, Luc/r;->b(Luc/p;)V

    .line 32
    invoke-static {}, Lb7/k;->z()Lb7/k;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 34
    new-instance v0, Lg2/k;

    invoke-direct {v0, v2}, Lg2/k;-><init>(Lmc/b;)V

    iput-object v0, p0, Llc/b;->g:Lg2/k;

    .line 35
    new-instance v0, Lt6/q;

    const/4 v3, 0x1

    invoke-direct {v0, v2, v3}, Lt6/q;-><init>(Lmc/b;I)V

    .line 36
    new-instance v3, La2/c;

    invoke-direct {v3, v2}, La2/c;-><init>(Lmc/b;)V

    iput-object v3, p0, Llc/b;->h:La2/c;

    .line 37
    new-instance v3, Lac/a;

    invoke-direct {v3, v2}, Lac/a;-><init>(Lmc/b;)V

    iput-object v3, p0, Llc/b;->i:Lac/a;

    .line 38
    new-instance v3, Lad/L;

    invoke-direct {v3, v2}, Lad/L;-><init>(Lmc/b;)V

    iput-object v3, p0, Llc/b;->j:Lad/L;

    .line 39
    new-instance v3, Lba/a;

    invoke-direct {v3, v2}, Lba/a;-><init>(Lmc/b;)V

    iput-object v3, p0, Llc/b;->l:Lba/a;

    .line 40
    new-instance v3, Lba/a;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    invoke-direct {v3, v2, v4}, Lba/a;-><init>(Lmc/b;Landroid/content/pm/PackageManager;)V

    .line 41
    new-instance v4, Lq/o;

    .line 42
    new-instance v5, Luc/r;

    sget-object v6, Luc/x;->b:Luc/x;

    const/4 v7, 0x0

    .line 43
    const-string v8, "flutter/restoration"

    invoke-direct {v5, v2, v8, v6, v7}, Luc/r;-><init>(Luc/f;Ljava/lang/String;Luc/s;Lab/b;)V

    .line 44
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    const/4 v6, 0x0

    .line 45
    iput-boolean v6, v4, Lq/o;->d:Z

    .line 46
    iput-boolean v6, v4, Lq/o;->e:Z

    .line 47
    new-instance v6, Lac/a;

    const/16 v7, 0x17

    invoke-direct {v6, v4, v7}, Lac/a;-><init>(Ljava/lang/Object;I)V

    .line 48
    iput-object v5, v4, Lq/o;->a:Ljava/lang/Object;

    .line 49
    iput-boolean p6, v4, Lq/o;->c:Z

    .line 50
    invoke-virtual {v5, v6}, Luc/r;->b(Luc/p;)V

    .line 51
    iput-object v4, p0, Llc/b;->k:Lq/o;

    .line 52
    new-instance p6, La2/v;

    invoke-direct {p6, v2}, La2/v;-><init>(Lmc/b;)V

    iput-object p6, p0, Llc/b;->m:La2/v;

    .line 53
    new-instance p6, Ltc/i;

    invoke-direct {p6, v2}, Ltc/i;-><init>(Lmc/b;)V

    iput-object p6, p0, Llc/b;->n:Ltc/i;

    .line 54
    new-instance p6, Ltc/j;

    .line 55
    invoke-direct {p6}, Ljava/lang/Object;-><init>()V

    .line 56
    new-instance v4, Lad/L;

    const/16 v5, 0x1c

    invoke-direct {v4, p6, v5}, Lad/L;-><init>(Ljava/lang/Object;I)V

    .line 57
    new-instance v5, Luc/r;

    sget-object v6, Luc/x;->b:Luc/x;

    const/4 v7, 0x0

    .line 58
    const-string v8, "flutter/spellcheck"

    invoke-direct {v5, v2, v8, v6, v7}, Luc/r;-><init>(Luc/f;Ljava/lang/String;Luc/s;Lab/b;)V

    .line 59
    invoke-virtual {v5, v4}, Luc/r;->b(Luc/p;)V

    .line 60
    iput-object p6, p0, Llc/b;->o:Ltc/j;

    .line 61
    new-instance p6, Ltc/a;

    invoke-direct {p6, v2}, Ltc/a;-><init>(Lmc/b;)V

    iput-object p6, p0, Llc/b;->p:Ltc/a;

    .line 62
    new-instance p6, Lt6/q;

    const/4 v4, 0x3

    invoke-direct {p6, v2, v4}, Lt6/q;-><init>(Lmc/b;I)V

    iput-object p6, p0, Llc/b;->q:Lt6/q;

    .line 63
    new-instance p6, Lvc/a;

    invoke-direct {p6, p1, v0}, Lvc/a;-><init>(Landroid/content/Context;Lt6/q;)V

    iput-object p6, p0, Llc/b;->e:Lvc/a;

    .line 64
    iget-object v0, v1, Lb7/k;->b:Ljava/lang/Object;

    check-cast v0, Loc/d;

    .line 65
    invoke-virtual {p2}, Lio/flutter/embedding/engine/FlutterJNI;->isAttached()Z

    move-result v2

    if-nez v2, :cond_1

    .line 66
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v0, v2}, Loc/d;->c(Landroid/content/Context;)V

    .line 67
    invoke-virtual {v0, p1, p4}, Loc/d;->a(Landroid/content/Context;[Ljava/lang/String;)V

    .line 68
    :cond_1
    new-instance p4, Lio/flutter/plugin/platform/p;

    invoke-direct {p4}, Lio/flutter/plugin/platform/p;-><init>()V

    .line 69
    iget-object v2, p3, Lio/flutter/plugin/platform/q;->a:Lio/flutter/plugin/platform/n;

    iput-object v2, p4, Lio/flutter/plugin/platform/p;->a:Lio/flutter/plugin/platform/n;

    .line 70
    iput-object p2, p4, Lio/flutter/plugin/platform/p;->e:Lio/flutter/embedding/engine/FlutterJNI;

    .line 71
    iget-object v2, p0, Llc/b;->v:Leb/e;

    invoke-virtual {p2, v2}, Lio/flutter/embedding/engine/FlutterJNI;->addEngineLifecycleListener(Llc/a;)V

    .line 72
    invoke-virtual {p2, p3}, Lio/flutter/embedding/engine/FlutterJNI;->setPlatformViewsController(Lio/flutter/plugin/platform/q;)V

    .line 73
    invoke-virtual {p2, p4}, Lio/flutter/embedding/engine/FlutterJNI;->setPlatformViewsController2(Lio/flutter/plugin/platform/p;)V

    .line 74
    invoke-virtual {p2, p6}, Lio/flutter/embedding/engine/FlutterJNI;->setLocalizationPlugin(Lvc/a;)V

    .line 75
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-virtual {p2, v1}, Lio/flutter/embedding/engine/FlutterJNI;->setDeferredComponentManager(Lnc/a;)V

    .line 76
    invoke-virtual {p2}, Lio/flutter/embedding/engine/FlutterJNI;->isAttached()Z

    move-result v1

    if-nez v1, :cond_3

    .line 77
    invoke-virtual {p2}, Lio/flutter/embedding/engine/FlutterJNI;->attachToNative()V

    .line 78
    invoke-virtual {p2}, Lio/flutter/embedding/engine/FlutterJNI;->isAttached()Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    .line 79
    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "FlutterEngine failed to attach to its native Object reference."

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 80
    :cond_3
    :goto_1
    new-instance v1, Lio/flutter/embedding/engine/renderer/k;

    invoke-direct {v1, p2}, Lio/flutter/embedding/engine/renderer/k;-><init>(Lio/flutter/embedding/engine/FlutterJNI;)V

    iput-object v1, p0, Llc/b;->b:Lio/flutter/embedding/engine/renderer/k;

    .line 81
    iput-object p3, p0, Llc/b;->r:Lio/flutter/plugin/platform/q;

    .line 82
    iput-object p4, p0, Llc/b;->s:Lio/flutter/plugin/platform/p;

    .line 83
    new-instance p2, LK8/H;

    .line 84
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p3

    invoke-direct {p2, p3, p0, v0}, LK8/H;-><init>(Landroid/content/Context;Llc/b;Loc/d;)V

    iput-object p2, p0, Llc/b;->d:LK8/H;

    .line 85
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    invoke-virtual {p3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p3

    invoke-virtual {p6, p3}, Lvc/a;->b(Landroid/content/res/Configuration;)V

    if-eqz p5, :cond_4

    .line 86
    iget-object p3, v0, Loc/d;->d:Ljava/lang/Object;

    check-cast p3, LM/y;

    .line 87
    iget-boolean p3, p3, LM/y;->a:Z

    if-eqz p3, :cond_4

    .line 88
    invoke-static {p0}, LA6/h;->H(Llc/b;)V

    .line 89
    :cond_4
    invoke-static {p1, p0}, LS3/f;->i(Landroid/content/Context;Lld/b;)V

    .line 90
    new-instance p1, Lxc/a;

    invoke-direct {p1, v3}, Lxc/a;-><init>(Lba/a;)V

    .line 91
    invoke-virtual {p2, p1}, LK8/H;->e(Lqc/b;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;[Ljava/lang/String;)V
    .locals 7

    .line 1
    new-instance v3, Lio/flutter/plugin/platform/q;

    invoke-direct {v3}, Lio/flutter/plugin/platform/q;-><init>()V

    const/4 v2, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v4, p2

    .line 2
    invoke-direct/range {v0 .. v6}, Llc/b;-><init>(Landroid/content/Context;Lio/flutter/embedding/engine/FlutterJNI;Lio/flutter/plugin/platform/q;[Ljava/lang/String;ZZ)V

    return-void
.end method
