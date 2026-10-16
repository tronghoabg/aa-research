.class public final LA7/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LEa/e;
.implements LHe/j;


# instance fields
.field public final synthetic a:I

.field public b:Z

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(BI)V
    .locals 0

    iput p2, p0, LA7/b0;->a:I

    packed-switch p2, :pswitch_data_0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA7/b0;->c:Ljava/lang/Object;

    .line 20
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LA7/b0;->d:Ljava/lang/Object;

    .line 21
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LA7/b0;->e:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 22
    iput-boolean p1, p0, LA7/b0;->b:Z

    return-void

    .line 23
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA7/b0;->c:Ljava/lang/Object;

    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, LA7/b0;->d:Ljava/lang/Object;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 24
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, LA7/b0;->e:Ljava/lang/Object;

    return-void

    .line 25
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 p1, 0x10

    .line 26
    new-array p2, p1, [F

    iput-object p2, p0, LA7/b0;->c:Ljava/lang/Object;

    .line 27
    new-array p1, p1, [F

    iput-object p1, p0, LA7/b0;->d:Ljava/lang/Object;

    .line 28
    new-instance p1, LQ1/t;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, LQ1/t;-><init>(I)V

    iput-object p1, p0, LA7/b0;->e:Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0xf
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(I)V
    .locals 1

    const/16 v0, 0x9

    iput v0, p0, LA7/b0;->a:I

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    new-array v0, p1, [J

    iput-object v0, p0, LA7/b0;->c:Ljava/lang/Object;

    .line 71
    new-array v0, p1, [Z

    iput-object v0, p0, LA7/b0;->d:Ljava/lang/Object;

    .line 72
    new-array p1, p1, [I

    iput-object p1, p0, LA7/b0;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LA7/Z;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LA7/b0;->a:I

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA7/b0;->e:Ljava/lang/Object;

    .line 7
    invoke-static {p2}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 8
    iput-object p2, p0, LA7/b0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LHe/j;LTe/n;)V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, LA7/b0;->a:I

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, LA7/b0;->c:Ljava/lang/Object;

    .line 36
    iput-object p2, p0, LA7/b0;->d:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 37
    iput-boolean p1, p0, LA7/b0;->b:Z

    .line 38
    new-instance p1, LJe/c;

    const/4 p2, 0x1

    .line 39
    invoke-direct {p1, p2}, LJe/c;-><init>(I)V

    .line 40
    iput-object p1, p0, LA7/b0;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LVa/jb;)V
    .locals 1

    const/4 v0, 0x7

    iput v0, p0, LA7/b0;->a:I

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 10
    iput-boolean v0, p0, LA7/b0;->b:Z

    .line 11
    iput-object p1, p0, LA7/b0;->c:Ljava/lang/Object;

    .line 12
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, LA7/b0;->d:Ljava/lang/Object;

    .line 13
    new-instance p1, LVa/q;

    const/4 v0, 0x4

    .line 14
    invoke-direct {p1, v0}, LVa/q;-><init>(I)V

    .line 15
    iput-object p0, p1, LVa/q;->b:Ljava/lang/Object;

    .line 16
    iput-object p1, p0, LA7/b0;->e:Ljava/lang/Object;

    .line 17
    invoke-static {}, LVa/fb;->e()LVa/fb;

    move-result-object p1

    iget-object v0, p0, LA7/b0;->e:Ljava/lang/Object;

    check-cast v0, LVa/q;

    invoke-virtual {p1, v0}, LVa/fb;->f(LVa/db;)V

    return-void
.end method

.method public constructor <init>(LX8/c;Z)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, LA7/b0;->a:I

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA7/b0;->e:Ljava/lang/Object;

    .line 64
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, LA7/b0;->d:Ljava/lang/Object;

    .line 65
    iput-boolean p2, p0, LA7/b0;->b:Z

    .line 66
    new-instance p1, LT8/d;

    if-eqz p2, :cond_0

    const/16 p2, 0x2000

    goto :goto_0

    :cond_0
    const/16 p2, 0x400

    .line 67
    :goto_0
    invoke-direct {p1, p2}, LT8/d;-><init>(I)V

    .line 68
    new-instance p2, Ljava/util/concurrent/atomic/AtomicMarkableReference;

    const/4 v0, 0x0

    invoke-direct {p2, p1, v0}, Ljava/util/concurrent/atomic/AtomicMarkableReference;-><init>(Ljava/lang/Object;Z)V

    iput-object p2, p0, LA7/b0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La4/f;La4/b;)V
    .locals 1

    const/16 v0, 0x8

    iput v0, p0, LA7/b0;->a:I

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA7/b0;->e:Ljava/lang/Object;

    iput-object p2, p0, LA7/b0;->c:Ljava/lang/Object;

    .line 74
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x2

    .line 75
    new-array p1, p1, [Z

    iput-object p1, p0, LA7/b0;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    iput p2, p0, LA7/b0;->a:I

    packed-switch p2, :pswitch_data_0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p2, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzp;

    const/4 v0, 0x0

    .line 2
    invoke-direct {p2, v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzp;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, LA7/b0;->d:Ljava/lang/Object;

    iput-object p1, p0, LA7/b0;->c:Ljava/lang/Object;

    return-void

    .line 3
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p2, 0x0

    .line 4
    iput-boolean p2, p0, LA7/b0;->b:Z

    .line 5
    new-instance p2, LC8/i;

    invoke-direct {p2, p1, p0}, LC8/i;-><init>(Landroid/content/Context;LA7/b0;)V

    iput-object p2, p0, LA7/b0;->e:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Landroid/media/Spatializer;I)V
    .locals 0

    iput p2, p0, LA7/b0;->a:I

    packed-switch p2, :pswitch_data_0

    .line 81
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 82
    iput-object p1, p0, LA7/b0;->c:Ljava/lang/Object;

    .line 83
    invoke-static {p1}, LG5/f;->a(Landroid/media/Spatializer;)I

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, LA7/b0;->b:Z

    return-void

    .line 84
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 85
    iput-object p1, p0, LA7/b0;->c:Ljava/lang/Object;

    .line 86
    invoke-static {p1}, LG5/f;->a(Landroid/media/Spatializer;)I

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    iput-boolean p1, p0, LA7/b0;->b:Z

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Ljava/lang/Class;)V
    .locals 32

    move-object/from16 v0, p0

    const/4 v1, 0x2

    iput v1, v0, LA7/b0;->a:I

    .line 46
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 47
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    const-string v2, "randomUUID()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, LA7/b0;->c:Ljava/lang/Object;

    .line 48
    new-instance v3, LS3/p;

    iget-object v1, v0, LA7/b0;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/UUID;

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v1, "id.toString()"

    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    const/16 v18, 0x0

    const/16 v28, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const-wide/16 v12, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    const v30, 0xffffa

    const/16 v31, 0x0

    .line 49
    invoke-direct/range {v3 .. v31}, LS3/p;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;LJ3/h;LJ3/h;JJJLJ3/d;IIJJJJZIIII)V

    .line 50
    iput-object v3, v0, LA7/b0;->d:Ljava/lang/Object;

    .line 51
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    .line 52
    new-instance v2, Ljava/util/LinkedHashSet;

    const/4 v3, 0x1

    invoke-static {v3}, Lff/B;->D(I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/LinkedHashSet;-><init>(I)V

    invoke-static {v1, v2}, Lff/m;->F0([Ljava/lang/Object;Ljava/util/LinkedHashSet;)V

    .line 53
    iput-object v2, v0, LA7/b0;->e:Ljava/lang/Object;

    .line 54
    iget-object v1, v0, LA7/b0;->d:Ljava/lang/Object;

    check-cast v1, LS3/p;

    .line 55
    const-class v2, Landroidx/work/OverwritingInputMerger;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, LS3/p;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    const/16 v0, 0xa

    iput v0, p0, LA7/b0;->a:I

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    new-instance v0, LG9/e;

    const/16 v1, 0x1c

    .line 58
    invoke-direct {v0, v1}, LG9/e;-><init>(I)V

    .line 59
    iput-object v0, p0, LA7/b0;->d:Ljava/lang/Object;

    .line 60
    iput-object v0, p0, LA7/b0;->e:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 61
    iput-boolean v0, p0, LA7/b0;->b:Z

    .line 62
    iput-object p1, p0, LA7/b0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ls9/f;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    const/16 v0, 0xc

    iput v0, p0, LA7/b0;->a:I

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, LA7/b0;->e:Ljava/lang/Object;

    .line 31
    iput-object p2, p0, LA7/b0;->c:Ljava/lang/Object;

    .line 32
    iput-object p3, p0, LA7/b0;->d:Ljava/lang/Object;

    .line 33
    iput-boolean p4, p0, LA7/b0;->b:Z

    return-void
.end method

.method public constructor <init>(Ls9/i;La2/v;Lc9/d;Z)V
    .locals 1

    const/16 v0, 0xd

    iput v0, p0, LA7/b0;->a:I

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p1, p0, LA7/b0;->c:Ljava/lang/Object;

    .line 43
    iput-object p2, p0, LA7/b0;->d:Ljava/lang/Object;

    .line 44
    iput-object p3, p0, LA7/b0;->e:Ljava/lang/Object;

    .line 45
    iput-boolean p4, p0, LA7/b0;->b:Z

    return-void
.end method

.method public constructor <init>(Lz4/c;Lz4/b;)V
    .locals 1

    const/16 v0, 0x11

    iput v0, p0, LA7/b0;->a:I

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA7/b0;->e:Ljava/lang/Object;

    .line 77
    iput-object p2, p0, LA7/b0;->c:Ljava/lang/Object;

    .line 78
    iget-boolean p2, p2, Lz4/b;->e:Z

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 79
    :cond_0
    iget p1, p1, Lz4/c;->g:I

    .line 80
    new-array p1, p1, [Z

    :goto_0
    iput-object p1, p0, LA7/b0;->d:Ljava/lang/Object;

    return-void
.end method

.method public static m([F[F)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, v0}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    .line 3
    .line 4
    .line 5
    const/16 v1, 0xa

    .line 6
    .line 7
    aget v2, p1, v1

    .line 8
    .line 9
    mul-float/2addr v2, v2

    .line 10
    const/16 v3, 0x8

    .line 11
    .line 12
    aget v4, p1, v3

    .line 13
    .line 14
    mul-float/2addr v4, v4

    .line 15
    add-float/2addr v4, v2

    .line 16
    float-to-double v4, v4

    .line 17
    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    .line 18
    .line 19
    .line 20
    move-result-wide v4

    .line 21
    double-to-float v2, v4

    .line 22
    aget v4, p1, v1

    .line 23
    .line 24
    div-float/2addr v4, v2

    .line 25
    aput v4, p0, v0

    .line 26
    .line 27
    aget p1, p1, v3

    .line 28
    .line 29
    div-float v0, p1, v2

    .line 30
    .line 31
    const/4 v5, 0x2

    .line 32
    aput v0, p0, v5

    .line 33
    .line 34
    neg-float p1, p1

    .line 35
    div-float/2addr p1, v2

    .line 36
    aput p1, p0, v3

    .line 37
    .line 38
    aput v4, p0, v1

    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public a(LJe/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, LA7/b0;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LJe/c;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, LJe/c;->c(LJe/b;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, LA7/b0;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, LA7/b0;->b:Z

    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, LA7/b0;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, LHe/j;

    .line 11
    .line 12
    invoke-interface {v0, p1}, LHe/j;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public c(LAa/a;)LCa/f;
    .locals 30

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const/4 v5, 0x0

    .line 6
    const/16 v6, 0x11

    .line 7
    .line 8
    const/4 v7, 0x1

    .line 9
    iget-object v8, v1, LA7/b0;->e:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v8, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzh;

    .line 12
    .line 13
    if-nez v8, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1}, LA7/b0;->zzb()V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v8, v1, LA7/b0;->e:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v8, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzh;

    .line 21
    .line 22
    if-eqz v8, :cond_12

    .line 23
    .line 24
    iget v8, v0, LAa/a;->f:I

    .line 25
    .line 26
    const/4 v9, -0x1

    .line 27
    if-ne v8, v9, :cond_1

    .line 28
    .line 29
    iget-object v8, v0, LAa/a;->a:Landroid/graphics/Bitmap;

    .line 30
    .line 31
    iget v9, v0, LAa/a;->e:I

    .line 32
    .line 33
    invoke-static {v9}, Lp7/b;->k(I)I

    .line 34
    .line 35
    .line 36
    move-result v9

    .line 37
    move v15, v9

    .line 38
    goto/16 :goto_2

    .line 39
    .line 40
    :cond_1
    if-eq v8, v9, :cond_6

    .line 41
    .line 42
    if-eq v8, v6, :cond_4

    .line 43
    .line 44
    const/16 v9, 0x23

    .line 45
    .line 46
    if-eq v8, v9, :cond_3

    .line 47
    .line 48
    const v9, 0x32315659

    .line 49
    .line 50
    .line 51
    if-ne v8, v9, :cond_2

    .line 52
    .line 53
    iget-object v8, v0, LAa/a;->b:Ljava/nio/ByteBuffer;

    .line 54
    .line 55
    invoke-static {v8}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget v9, v0, LAa/a;->c:I

    .line 59
    .line 60
    iget v10, v0, LAa/a;->d:I

    .line 61
    .line 62
    iget v11, v0, LAa/a;->e:I

    .line 63
    .line 64
    invoke-static {v8}, Lr7/e;->V(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 65
    .line 66
    .line 67
    move-result-object v8

    .line 68
    invoke-virtual {v8}, Ljava/nio/ByteBuffer;->array()[B

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    invoke-static {v9, v10, v8}, Lr7/e;->Z(II[B)[B

    .line 73
    .line 74
    .line 75
    move-result-object v8

    .line 76
    array-length v9, v8

    .line 77
    invoke-static {v8, v5, v9}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    .line 78
    .line 79
    .line 80
    move-result-object v8

    .line 81
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getWidth()I

    .line 82
    .line 83
    .line 84
    move-result v9

    .line 85
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getHeight()I

    .line 86
    .line 87
    .line 88
    move-result v10

    .line 89
    invoke-static {v8, v11, v9, v10}, Lr7/e;->X(Landroid/graphics/Bitmap;III)Landroid/graphics/Bitmap;

    .line 90
    .line 91
    .line 92
    move-result-object v8

    .line 93
    goto :goto_1

    .line 94
    :cond_2
    new-instance v0, Lua/a;

    .line 95
    .line 96
    const-string v2, "Unsupported image format"

    .line 97
    .line 98
    const/16 v3, 0xd

    .line 99
    .line 100
    invoke-direct {v0, v2, v3}, Lua/a;-><init>(Ljava/lang/String;I)V

    .line 101
    .line 102
    .line 103
    throw v0

    .line 104
    :cond_3
    const/4 v0, 0x0

    .line 105
    invoke-static {v0}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    throw v0

    .line 109
    :cond_4
    iget-object v8, v0, LAa/a;->b:Ljava/nio/ByteBuffer;

    .line 110
    .line 111
    invoke-static {v8}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    iget v9, v0, LAa/a;->c:I

    .line 115
    .line 116
    iget v10, v0, LAa/a;->d:I

    .line 117
    .line 118
    iget v11, v0, LAa/a;->e:I

    .line 119
    .line 120
    invoke-virtual {v8}, Ljava/nio/ByteBuffer;->hasArray()Z

    .line 121
    .line 122
    .line 123
    move-result v12

    .line 124
    if-eqz v12, :cond_5

    .line 125
    .line 126
    invoke-virtual {v8}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 127
    .line 128
    .line 129
    move-result v12

    .line 130
    if-nez v12, :cond_5

    .line 131
    .line 132
    invoke-virtual {v8}, Ljava/nio/ByteBuffer;->array()[B

    .line 133
    .line 134
    .line 135
    move-result-object v8

    .line 136
    goto :goto_0

    .line 137
    :cond_5
    invoke-virtual {v8}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v8}, Ljava/nio/Buffer;->limit()I

    .line 141
    .line 142
    .line 143
    move-result v12

    .line 144
    new-array v13, v12, [B

    .line 145
    .line 146
    invoke-virtual {v8, v13, v5, v12}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 147
    .line 148
    .line 149
    move-object v8, v13

    .line 150
    :goto_0
    invoke-static {v9, v10, v8}, Lr7/e;->Z(II[B)[B

    .line 151
    .line 152
    .line 153
    move-result-object v8

    .line 154
    array-length v9, v8

    .line 155
    invoke-static {v8, v5, v9}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    .line 156
    .line 157
    .line 158
    move-result-object v8

    .line 159
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getWidth()I

    .line 160
    .line 161
    .line 162
    move-result v9

    .line 163
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getHeight()I

    .line 164
    .line 165
    .line 166
    move-result v10

    .line 167
    invoke-static {v8, v11, v9, v10}, Lr7/e;->X(Landroid/graphics/Bitmap;III)Landroid/graphics/Bitmap;

    .line 168
    .line 169
    .line 170
    move-result-object v8

    .line 171
    goto :goto_1

    .line 172
    :cond_6
    iget-object v8, v0, LAa/a;->a:Landroid/graphics/Bitmap;

    .line 173
    .line 174
    invoke-static {v8}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    iget v9, v0, LAa/a;->e:I

    .line 178
    .line 179
    iget v10, v0, LAa/a;->c:I

    .line 180
    .line 181
    iget v11, v0, LAa/a;->d:I

    .line 182
    .line 183
    invoke-static {v8, v9, v10, v11}, Lr7/e;->X(Landroid/graphics/Bitmap;III)Landroid/graphics/Bitmap;

    .line 184
    .line 185
    .line 186
    move-result-object v8

    .line 187
    :goto_1
    move v15, v5

    .line 188
    :goto_2
    new-instance v9, Lq7/b;

    .line 189
    .line 190
    invoke-direct {v9, v8}, Lq7/b;-><init>(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    move-object v8, v9

    .line 194
    new-instance v9, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzd;

    .line 195
    .line 196
    iget v10, v0, LAa/a;->c:I

    .line 197
    .line 198
    iget v11, v0, LAa/a;->d:I

    .line 199
    .line 200
    const/4 v12, 0x0

    .line 201
    const-wide/16 v13, 0x0

    .line 202
    .line 203
    invoke-direct/range {v9 .. v15}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzd;-><init>(IIIJI)V

    .line 204
    .line 205
    .line 206
    :try_start_0
    iget-object v0, v1, LA7/b0;->e:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzh;

    .line 209
    .line 210
    invoke-static {v0}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v0, v8, v9}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzh;->zze(Lq7/a;Lcom/google/android/gms/internal/mlkit_vision_text_common/zzd;)[Lcom/google/android/gms/internal/mlkit_vision_text_common/zzl;

    .line 214
    .line 215
    .line 216
    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 217
    sget-object v8, LEa/d;->a:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzv;

    .line 218
    .line 219
    new-instance v8, Landroid/util/SparseArray;

    .line 220
    .line 221
    invoke-direct {v8}, Landroid/util/SparseArray;-><init>()V

    .line 222
    .line 223
    .line 224
    array-length v9, v0

    .line 225
    move v10, v5

    .line 226
    :goto_3
    if-ge v10, v9, :cond_8

    .line 227
    .line 228
    aget-object v11, v0, v10

    .line 229
    .line 230
    iget v12, v11, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzl;->zzj:I

    .line 231
    .line 232
    invoke-virtual {v8, v12}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v12

    .line 236
    check-cast v12, Landroid/util/SparseArray;

    .line 237
    .line 238
    if-nez v12, :cond_7

    .line 239
    .line 240
    new-instance v12, Landroid/util/SparseArray;

    .line 241
    .line 242
    invoke-direct {v12}, Landroid/util/SparseArray;-><init>()V

    .line 243
    .line 244
    .line 245
    iget v13, v11, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzl;->zzj:I

    .line 246
    .line 247
    invoke-virtual {v8, v13, v12}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    :cond_7
    iget v13, v11, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzl;->zzk:I

    .line 251
    .line 252
    invoke-virtual {v12, v13, v11}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    add-int/2addr v10, v7

    .line 256
    goto :goto_3

    .line 257
    :cond_8
    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbh;

    .line 258
    .line 259
    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbh;-><init>()V

    .line 260
    .line 261
    .line 262
    move v9, v5

    .line 263
    :goto_4
    invoke-virtual {v8}, Landroid/util/SparseArray;->size()I

    .line 264
    .line 265
    .line 266
    move-result v10

    .line 267
    sget-object v11, LEa/d;->a:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzv;

    .line 268
    .line 269
    if-ge v9, v10, :cond_11

    .line 270
    .line 271
    invoke-virtual {v8, v9}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v10

    .line 275
    check-cast v10, Landroid/util/SparseArray;

    .line 276
    .line 277
    new-instance v12, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbh;

    .line 278
    .line 279
    invoke-direct {v12}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbh;-><init>()V

    .line 280
    .line 281
    .line 282
    move v13, v5

    .line 283
    :goto_5
    invoke-virtual {v10}, Landroid/util/SparseArray;->size()I

    .line 284
    .line 285
    .line 286
    move-result v14

    .line 287
    if-ge v13, v14, :cond_9

    .line 288
    .line 289
    invoke-virtual {v10, v13}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v14

    .line 293
    check-cast v14, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzl;

    .line 294
    .line 295
    invoke-virtual {v12, v14}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbh;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbh;

    .line 296
    .line 297
    .line 298
    add-int/2addr v13, v7

    .line 299
    goto :goto_5

    .line 300
    :cond_9
    invoke-virtual {v12}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbh;->zzb()Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbk;

    .line 301
    .line 302
    .line 303
    move-result-object v10

    .line 304
    new-instance v12, LVa/ka;

    .line 305
    .line 306
    invoke-direct {v12, v6}, LVa/ka;-><init>(I)V

    .line 307
    .line 308
    .line 309
    invoke-static {v10, v12}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbu;->zza(Ljava/util/List;Lcom/google/android/gms/internal/mlkit_vision_text_common/zzu;)Ljava/util/List;

    .line 310
    .line 311
    .line 312
    move-result-object v12

    .line 313
    invoke-interface {v10, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v13

    .line 317
    check-cast v13, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzl;

    .line 318
    .line 319
    iget-object v13, v13, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzl;->zzb:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzf;

    .line 320
    .line 321
    invoke-virtual {v10, v5}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbk;->zzj(I)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcp;

    .line 322
    .line 323
    .line 324
    move-result-object v10

    .line 325
    const/high16 v14, -0x80000000

    .line 326
    .line 327
    const v15, 0x7fffffff

    .line 328
    .line 329
    .line 330
    move v2, v15

    .line 331
    move v3, v2

    .line 332
    const/16 v19, 0x3

    .line 333
    .line 334
    const/16 v20, 0x2

    .line 335
    .line 336
    move v15, v14

    .line 337
    :goto_6
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 338
    .line 339
    .line 340
    move-result v16

    .line 341
    if-eqz v16, :cond_b

    .line 342
    .line 343
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v16

    .line 347
    move/from16 v21, v5

    .line 348
    .line 349
    move-object/from16 v5, v16

    .line 350
    .line 351
    check-cast v5, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzl;

    .line 352
    .line 353
    iget-object v5, v5, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzl;->zzb:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzf;

    .line 354
    .line 355
    move/from16 v22, v7

    .line 356
    .line 357
    iget v7, v13, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzf;->zza:I

    .line 358
    .line 359
    neg-int v7, v7

    .line 360
    iget v6, v13, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzf;->zzb:I

    .line 361
    .line 362
    neg-int v6, v6

    .line 363
    iget v4, v13, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzf;->zze:F

    .line 364
    .line 365
    move-object/from16 p1, v8

    .line 366
    .line 367
    move/from16 v23, v9

    .line 368
    .line 369
    float-to-double v8, v4

    .line 370
    invoke-static {v8, v9}, Ljava/lang/Math;->toRadians(D)D

    .line 371
    .line 372
    .line 373
    move-result-wide v8

    .line 374
    invoke-static {v8, v9}, Ljava/lang/Math;->sin(D)D

    .line 375
    .line 376
    .line 377
    move-result-wide v8

    .line 378
    iget v4, v13, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzf;->zze:F

    .line 379
    .line 380
    move-wide/from16 v16, v8

    .line 381
    .line 382
    float-to-double v8, v4

    .line 383
    invoke-static {v8, v9}, Ljava/lang/Math;->toRadians(D)D

    .line 384
    .line 385
    .line 386
    move-result-wide v8

    .line 387
    invoke-static {v8, v9}, Ljava/lang/Math;->cos(D)D

    .line 388
    .line 389
    .line 390
    move-result-wide v8

    .line 391
    const/4 v4, 0x4

    .line 392
    new-array v1, v4, [Landroid/graphics/Point;

    .line 393
    .line 394
    new-instance v4, Landroid/graphics/Point;

    .line 395
    .line 396
    move-object/from16 v18, v1

    .line 397
    .line 398
    iget v1, v5, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzf;->zza:I

    .line 399
    .line 400
    move-wide/from16 v24, v8

    .line 401
    .line 402
    iget v8, v5, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzf;->zzb:I

    .line 403
    .line 404
    invoke-direct {v4, v1, v8}, Landroid/graphics/Point;-><init>(II)V

    .line 405
    .line 406
    .line 407
    aput-object v4, v18, v21

    .line 408
    .line 409
    invoke-virtual {v4, v7, v6}, Landroid/graphics/Point;->offset(II)V

    .line 410
    .line 411
    .line 412
    aget-object v1, v18, v21

    .line 413
    .line 414
    iget v4, v1, Landroid/graphics/Point;->x:I

    .line 415
    .line 416
    int-to-double v6, v4

    .line 417
    mul-double v6, v6, v24

    .line 418
    .line 419
    iget v8, v1, Landroid/graphics/Point;->y:I

    .line 420
    .line 421
    int-to-double v8, v8

    .line 422
    mul-double v26, v8, v16

    .line 423
    .line 424
    neg-int v4, v4

    .line 425
    move-wide/from16 v28, v6

    .line 426
    .line 427
    int-to-double v6, v4

    .line 428
    mul-double v6, v6, v16

    .line 429
    .line 430
    mul-double v8, v8, v24

    .line 431
    .line 432
    move-wide/from16 v16, v6

    .line 433
    .line 434
    add-double v6, v28, v26

    .line 435
    .line 436
    double-to-int v4, v6

    .line 437
    iput v4, v1, Landroid/graphics/Point;->x:I

    .line 438
    .line 439
    add-double v6, v16, v8

    .line 440
    .line 441
    double-to-int v6, v6

    .line 442
    iput v6, v1, Landroid/graphics/Point;->y:I

    .line 443
    .line 444
    new-instance v1, Landroid/graphics/Point;

    .line 445
    .line 446
    iget v7, v5, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzf;->zzc:I

    .line 447
    .line 448
    add-int/2addr v7, v4

    .line 449
    invoke-direct {v1, v7, v6}, Landroid/graphics/Point;-><init>(II)V

    .line 450
    .line 451
    .line 452
    aput-object v1, v18, v22

    .line 453
    .line 454
    new-instance v1, Landroid/graphics/Point;

    .line 455
    .line 456
    iget v7, v5, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzf;->zzc:I

    .line 457
    .line 458
    add-int/2addr v7, v4

    .line 459
    iget v8, v5, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzf;->zzd:I

    .line 460
    .line 461
    add-int/2addr v8, v6

    .line 462
    invoke-direct {v1, v7, v8}, Landroid/graphics/Point;-><init>(II)V

    .line 463
    .line 464
    .line 465
    aput-object v1, v18, v20

    .line 466
    .line 467
    new-instance v1, Landroid/graphics/Point;

    .line 468
    .line 469
    iget v5, v5, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzf;->zzd:I

    .line 470
    .line 471
    add-int/2addr v6, v5

    .line 472
    invoke-direct {v1, v4, v6}, Landroid/graphics/Point;-><init>(II)V

    .line 473
    .line 474
    .line 475
    aput-object v1, v18, v19

    .line 476
    .line 477
    move/from16 v1, v21

    .line 478
    .line 479
    :goto_7
    const/4 v4, 0x4

    .line 480
    if-ge v1, v4, :cond_a

    .line 481
    .line 482
    aget-object v4, v18, v1

    .line 483
    .line 484
    iget v5, v4, Landroid/graphics/Point;->x:I

    .line 485
    .line 486
    invoke-static {v2, v5}, Ljava/lang/Math;->min(II)I

    .line 487
    .line 488
    .line 489
    move-result v2

    .line 490
    iget v5, v4, Landroid/graphics/Point;->x:I

    .line 491
    .line 492
    invoke-static {v14, v5}, Ljava/lang/Math;->max(II)I

    .line 493
    .line 494
    .line 495
    move-result v14

    .line 496
    iget v5, v4, Landroid/graphics/Point;->y:I

    .line 497
    .line 498
    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    .line 499
    .line 500
    .line 501
    move-result v3

    .line 502
    iget v4, v4, Landroid/graphics/Point;->y:I

    .line 503
    .line 504
    invoke-static {v15, v4}, Ljava/lang/Math;->max(II)I

    .line 505
    .line 506
    .line 507
    move-result v15

    .line 508
    add-int/lit8 v1, v1, 0x1

    .line 509
    .line 510
    goto :goto_7

    .line 511
    :cond_a
    move-object/from16 v1, p0

    .line 512
    .line 513
    move-object/from16 v8, p1

    .line 514
    .line 515
    move/from16 v5, v21

    .line 516
    .line 517
    move/from16 v7, v22

    .line 518
    .line 519
    move/from16 v9, v23

    .line 520
    .line 521
    const/16 v6, 0x11

    .line 522
    .line 523
    goto/16 :goto_6

    .line 524
    .line 525
    :cond_b
    move/from16 v21, v5

    .line 526
    .line 527
    move/from16 v22, v7

    .line 528
    .line 529
    move-object/from16 p1, v8

    .line 530
    .line 531
    move/from16 v23, v9

    .line 532
    .line 533
    iget v1, v13, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzf;->zza:I

    .line 534
    .line 535
    iget v4, v13, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzf;->zzb:I

    .line 536
    .line 537
    iget v5, v13, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzf;->zze:F

    .line 538
    .line 539
    float-to-double v5, v5

    .line 540
    invoke-static {v5, v6}, Ljava/lang/Math;->toRadians(D)D

    .line 541
    .line 542
    .line 543
    move-result-wide v5

    .line 544
    invoke-static {v5, v6}, Ljava/lang/Math;->sin(D)D

    .line 545
    .line 546
    .line 547
    move-result-wide v5

    .line 548
    iget v7, v13, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzf;->zze:F

    .line 549
    .line 550
    float-to-double v7, v7

    .line 551
    invoke-static {v7, v8}, Ljava/lang/Math;->toRadians(D)D

    .line 552
    .line 553
    .line 554
    move-result-wide v7

    .line 555
    invoke-static {v7, v8}, Ljava/lang/Math;->cos(D)D

    .line 556
    .line 557
    .line 558
    move-result-wide v7

    .line 559
    new-instance v9, Landroid/graphics/Point;

    .line 560
    .line 561
    invoke-direct {v9, v2, v3}, Landroid/graphics/Point;-><init>(II)V

    .line 562
    .line 563
    .line 564
    new-instance v10, Landroid/graphics/Point;

    .line 565
    .line 566
    invoke-direct {v10, v14, v3}, Landroid/graphics/Point;-><init>(II)V

    .line 567
    .line 568
    .line 569
    new-instance v3, Landroid/graphics/Point;

    .line 570
    .line 571
    invoke-direct {v3, v14, v15}, Landroid/graphics/Point;-><init>(II)V

    .line 572
    .line 573
    .line 574
    new-instance v13, Landroid/graphics/Point;

    .line 575
    .line 576
    invoke-direct {v13, v2, v15}, Landroid/graphics/Point;-><init>(II)V

    .line 577
    .line 578
    .line 579
    const/4 v2, 0x4

    .line 580
    new-array v14, v2, [Landroid/graphics/Point;

    .line 581
    .line 582
    aput-object v9, v14, v21

    .line 583
    .line 584
    aput-object v10, v14, v22

    .line 585
    .line 586
    aput-object v3, v14, v20

    .line 587
    .line 588
    aput-object v13, v14, v19

    .line 589
    .line 590
    move/from16 v3, v21

    .line 591
    .line 592
    :goto_8
    if-ge v3, v2, :cond_c

    .line 593
    .line 594
    aget-object v9, v14, v3

    .line 595
    .line 596
    iget v10, v9, Landroid/graphics/Point;->x:I

    .line 597
    .line 598
    move v13, v3

    .line 599
    int-to-double v2, v10

    .line 600
    mul-double v15, v2, v7

    .line 601
    .line 602
    iget v10, v9, Landroid/graphics/Point;->y:I

    .line 603
    .line 604
    move-wide/from16 v17, v2

    .line 605
    .line 606
    int-to-double v2, v10

    .line 607
    mul-double v24, v2, v5

    .line 608
    .line 609
    mul-double v17, v17, v5

    .line 610
    .line 611
    mul-double/2addr v2, v7

    .line 612
    move-wide/from16 v26, v2

    .line 613
    .line 614
    sub-double v2, v15, v24

    .line 615
    .line 616
    double-to-int v2, v2

    .line 617
    iput v2, v9, Landroid/graphics/Point;->x:I

    .line 618
    .line 619
    add-double v2, v17, v26

    .line 620
    .line 621
    double-to-int v2, v2

    .line 622
    iput v2, v9, Landroid/graphics/Point;->y:I

    .line 623
    .line 624
    invoke-virtual {v9, v1, v4}, Landroid/graphics/Point;->offset(II)V

    .line 625
    .line 626
    .line 627
    add-int/lit8 v3, v13, 0x1

    .line 628
    .line 629
    const/4 v2, 0x4

    .line 630
    goto :goto_8

    .line 631
    :cond_c
    invoke-static {v14}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 632
    .line 633
    .line 634
    move-result-object v16

    .line 635
    new-instance v13, LCa/e;

    .line 636
    .line 637
    new-instance v1, LXd/c;

    .line 638
    .line 639
    const/16 v2, 0x11

    .line 640
    .line 641
    invoke-direct {v1, v2}, LXd/c;-><init>(I)V

    .line 642
    .line 643
    .line 644
    invoke-static {v12, v1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbu;->zza(Ljava/util/List;Lcom/google/android/gms/internal/mlkit_vision_text_common/zzu;)Ljava/util/List;

    .line 645
    .line 646
    .line 647
    move-result-object v1

    .line 648
    invoke-virtual {v11, v1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzv;->zzb(Ljava/lang/Iterable;)Ljava/lang/String;

    .line 649
    .line 650
    .line 651
    move-result-object v14

    .line 652
    invoke-static/range {v16 .. v16}, LBa/c;->W(Ljava/util/List;)Landroid/graphics/Rect;

    .line 653
    .line 654
    .line 655
    move-result-object v15

    .line 656
    new-instance v1, Ljava/util/HashMap;

    .line 657
    .line 658
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 659
    .line 660
    .line 661
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 662
    .line 663
    .line 664
    move-result-object v3

    .line 665
    :goto_9
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 666
    .line 667
    .line 668
    move-result v4

    .line 669
    if-eqz v4, :cond_e

    .line 670
    .line 671
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 672
    .line 673
    .line 674
    move-result-object v4

    .line 675
    check-cast v4, LCa/b;

    .line 676
    .line 677
    iget-object v4, v4, LCa/d;->b:Ljava/io/Serializable;

    .line 678
    .line 679
    check-cast v4, Ljava/lang/String;

    .line 680
    .line 681
    invoke-virtual {v1, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 682
    .line 683
    .line 684
    move-result v5

    .line 685
    if-eqz v5, :cond_d

    .line 686
    .line 687
    invoke-virtual {v1, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 688
    .line 689
    .line 690
    move-result-object v5

    .line 691
    check-cast v5, Ljava/lang/Integer;

    .line 692
    .line 693
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 694
    .line 695
    .line 696
    move-result v5

    .line 697
    goto :goto_a

    .line 698
    :cond_d
    move/from16 v5, v21

    .line 699
    .line 700
    :goto_a
    add-int/lit8 v5, v5, 0x1

    .line 701
    .line 702
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 703
    .line 704
    .line 705
    move-result-object v5

    .line 706
    invoke-virtual {v1, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 707
    .line 708
    .line 709
    goto :goto_9

    .line 710
    :cond_e
    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 711
    .line 712
    .line 713
    move-result-object v1

    .line 714
    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    .line 715
    .line 716
    .line 717
    move-result v3

    .line 718
    if-eqz v3, :cond_f

    .line 719
    .line 720
    goto :goto_c

    .line 721
    :cond_f
    sget-object v3, LEa/d;->b:LA7/R0;

    .line 722
    .line 723
    invoke-static {v1, v3}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    .line 724
    .line 725
    .line 726
    move-result-object v1

    .line 727
    check-cast v1, Ljava/util/Map$Entry;

    .line 728
    .line 729
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 730
    .line 731
    .line 732
    move-result-object v1

    .line 733
    check-cast v1, Ljava/lang/String;

    .line 734
    .line 735
    invoke-static {v1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzy;->zzb(Ljava/lang/String;)Z

    .line 736
    .line 737
    .line 738
    move-result v3

    .line 739
    if-nez v3, :cond_10

    .line 740
    .line 741
    :goto_b
    move-object/from16 v17, v1

    .line 742
    .line 743
    move-object/from16 v18, v12

    .line 744
    .line 745
    goto :goto_d

    .line 746
    :cond_10
    :goto_c
    const-string v1, "und"

    .line 747
    .line 748
    goto :goto_b

    .line 749
    :goto_d
    invoke-direct/range {v13 .. v18}, LCa/e;-><init>(Ljava/lang/String;Landroid/graphics/Rect;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V

    .line 750
    .line 751
    .line 752
    invoke-virtual {v0, v13}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbh;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbh;

    .line 753
    .line 754
    .line 755
    add-int/lit8 v9, v23, 0x1

    .line 756
    .line 757
    move-object/from16 v1, p0

    .line 758
    .line 759
    move-object/from16 v8, p1

    .line 760
    .line 761
    move v6, v2

    .line 762
    move/from16 v5, v21

    .line 763
    .line 764
    move/from16 v7, v22

    .line 765
    .line 766
    goto/16 :goto_4

    .line 767
    .line 768
    :cond_11
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbh;->zzb()Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbk;

    .line 769
    .line 770
    .line 771
    move-result-object v0

    .line 772
    new-instance v1, LCa/f;

    .line 773
    .line 774
    new-instance v2, Lza/a;

    .line 775
    .line 776
    const/16 v3, 0x10

    .line 777
    .line 778
    invoke-direct {v2, v3}, Lza/a;-><init>(I)V

    .line 779
    .line 780
    .line 781
    invoke-static {v0, v2}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbu;->zza(Ljava/util/List;Lcom/google/android/gms/internal/mlkit_vision_text_common/zzu;)Ljava/util/List;

    .line 782
    .line 783
    .line 784
    move-result-object v2

    .line 785
    invoke-virtual {v11, v2}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzv;->zzb(Ljava/lang/Iterable;)Ljava/lang/String;

    .line 786
    .line 787
    .line 788
    move-result-object v2

    .line 789
    invoke-direct {v1, v2, v0}, LCa/f;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbk;)V

    .line 790
    .line 791
    .line 792
    return-object v1

    .line 793
    :catch_0
    move-exception v0

    .line 794
    new-instance v1, Lua/a;

    .line 795
    .line 796
    const-string v2, "Failed to run legacy text recognizer."

    .line 797
    .line 798
    invoke-direct {v1, v2, v0}, Lua/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 799
    .line 800
    .line 801
    throw v1

    .line 802
    :cond_12
    new-instance v0, Lua/a;

    .line 803
    .line 804
    const-string v1, "Waiting for the text recognition module to be downloaded. Please wait."

    .line 805
    .line 806
    const/16 v2, 0xe

    .line 807
    .line 808
    invoke-direct {v0, v1, v2}, Lua/a;-><init>(Ljava/lang/String;I)V

    .line 809
    .line 810
    .line 811
    throw v0
.end method

.method public d()V
    .locals 2

    .line 1
    iget-object v0, p0, LA7/b0;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lz4/c;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-static {v0, p0, v1}, Lz4/c;->a(Lz4/c;LA7/b0;Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public e(JLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p3, p1}, LA7/b0;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public f(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, LG9/e;

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    invoke-direct {v0, v1}, LG9/e;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, LA7/b0;->e:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, LG9/e;

    .line 11
    .line 12
    iput-object v0, v1, LG9/e;->d:Ljava/lang/Object;

    .line 13
    .line 14
    iput-object v0, p0, LA7/b0;->e:Ljava/lang/Object;

    .line 15
    .line 16
    iput-object p1, v0, LG9/e;->c:Ljava/lang/Object;

    .line 17
    .line 18
    iput-object p2, v0, LG9/e;->b:Ljava/lang/Object;

    .line 19
    .line 20
    return-void
.end method

.method public g(Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-static {p2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p0, p1, p2}, LA7/b0;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public h(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Lk8/i;

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    invoke-direct {v0, v1}, LG9/e;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, LA7/b0;->e:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, LG9/e;

    .line 11
    .line 12
    iput-object v0, v1, LG9/e;->d:Ljava/lang/Object;

    .line 13
    .line 14
    iput-object v0, p0, LA7/b0;->e:Ljava/lang/Object;

    .line 15
    .line 16
    iput-object p2, v0, LG9/e;->c:Ljava/lang/Object;

    .line 17
    .line 18
    iput-object p1, v0, LG9/e;->b:Ljava/lang/Object;

    .line 19
    .line 20
    return-void
.end method

.method public i()LJ3/s;
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-boolean v1, v0, LA7/b0;->b:Z

    .line 4
    .line 5
    if-eqz v1, :cond_1

    .line 6
    .line 7
    iget-object v1, v0, LA7/b0;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, LS3/p;

    .line 10
    .line 11
    iget-object v1, v1, LS3/p;->j:LJ3/d;

    .line 12
    .line 13
    iget-boolean v1, v1, LJ3/d;->c:Z

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 19
    .line 20
    const-string v2, "Cannot set backoff criteria on an idle mode job"

    .line 21
    .line 22
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw v1

    .line 26
    :cond_1
    :goto_0
    new-instance v1, LJ3/s;

    .line 27
    .line 28
    iget-object v2, v0, LA7/b0;->c:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v2, Ljava/util/UUID;

    .line 31
    .line 32
    iget-object v3, v0, LA7/b0;->d:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v3, LS3/p;

    .line 35
    .line 36
    iget-object v4, v0, LA7/b0;->e:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v4, Ljava/util/Set;

    .line 39
    .line 40
    invoke-direct {v1, v2, v3, v4}, LJ3/s;-><init>(Ljava/util/UUID;LS3/p;Ljava/util/Set;)V

    .line 41
    .line 42
    .line 43
    iget-object v2, v0, LA7/b0;->d:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v2, LS3/p;

    .line 46
    .line 47
    iget-object v2, v2, LS3/p;->j:LJ3/d;

    .line 48
    .line 49
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 50
    .line 51
    const/16 v4, 0x18

    .line 52
    .line 53
    if-lt v3, v4, :cond_2

    .line 54
    .line 55
    iget-object v3, v2, LJ3/d;->h:Ljava/util/Set;

    .line 56
    .line 57
    check-cast v3, Ljava/util/Collection;

    .line 58
    .line 59
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-eqz v3, :cond_4

    .line 64
    .line 65
    :cond_2
    iget-boolean v3, v2, LJ3/d;->d:Z

    .line 66
    .line 67
    if-nez v3, :cond_4

    .line 68
    .line 69
    iget-boolean v3, v2, LJ3/d;->b:Z

    .line 70
    .line 71
    if-nez v3, :cond_4

    .line 72
    .line 73
    iget-boolean v2, v2, LJ3/d;->c:Z

    .line 74
    .line 75
    if-eqz v2, :cond_3

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    const/4 v2, 0x0

    .line 79
    goto :goto_2

    .line 80
    :cond_4
    :goto_1
    const/4 v2, 0x1

    .line 81
    :goto_2
    iget-object v3, v0, LA7/b0;->d:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v3, LS3/p;

    .line 84
    .line 85
    iget-boolean v4, v3, LS3/p;->q:Z

    .line 86
    .line 87
    if-eqz v4, :cond_7

    .line 88
    .line 89
    if-nez v2, :cond_6

    .line 90
    .line 91
    iget-wide v2, v3, LS3/p;->g:J

    .line 92
    .line 93
    const-wide/16 v4, 0x0

    .line 94
    .line 95
    cmp-long v2, v2, v4

    .line 96
    .line 97
    if-gtz v2, :cond_5

    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_5
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 101
    .line 102
    const-string v2, "Expedited jobs cannot be delayed"

    .line 103
    .line 104
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    throw v1

    .line 108
    :cond_6
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 109
    .line 110
    const-string v2, "Expedited jobs only support network and storage constraints"

    .line 111
    .line 112
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw v1

    .line 116
    :cond_7
    :goto_3
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    const-string v3, "randomUUID()"

    .line 121
    .line 122
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    iput-object v2, v0, LA7/b0;->c:Ljava/lang/Object;

    .line 126
    .line 127
    new-instance v4, LS3/p;

    .line 128
    .line 129
    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v5

    .line 133
    const-string v2, "id.toString()"

    .line 134
    .line 135
    invoke-static {v5, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    iget-object v2, v0, LA7/b0;->d:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v2, LS3/p;

    .line 141
    .line 142
    const-string v3, "other"

    .line 143
    .line 144
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    iget v6, v2, LS3/p;->b:I

    .line 148
    .line 149
    iget-object v8, v2, LS3/p;->d:Ljava/lang/String;

    .line 150
    .line 151
    new-instance v9, LJ3/h;

    .line 152
    .line 153
    iget-object v7, v2, LS3/p;->e:LJ3/h;

    .line 154
    .line 155
    invoke-direct {v9, v7}, LJ3/h;-><init>(LJ3/h;)V

    .line 156
    .line 157
    .line 158
    new-instance v10, LJ3/h;

    .line 159
    .line 160
    iget-object v7, v2, LS3/p;->f:LJ3/h;

    .line 161
    .line 162
    invoke-direct {v10, v7}, LJ3/h;-><init>(LJ3/h;)V

    .line 163
    .line 164
    .line 165
    new-instance v17, LJ3/d;

    .line 166
    .line 167
    iget-object v7, v2, LS3/p;->j:LJ3/d;

    .line 168
    .line 169
    invoke-static {v7, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    iget-boolean v3, v7, LJ3/d;->e:Z

    .line 173
    .line 174
    iget-object v11, v7, LJ3/d;->h:Ljava/util/Set;

    .line 175
    .line 176
    iget v12, v7, LJ3/d;->a:I

    .line 177
    .line 178
    iget-boolean v13, v7, LJ3/d;->b:Z

    .line 179
    .line 180
    iget-boolean v14, v7, LJ3/d;->c:Z

    .line 181
    .line 182
    iget-boolean v15, v7, LJ3/d;->d:Z

    .line 183
    .line 184
    move/from16 v16, v3

    .line 185
    .line 186
    move-object/from16 v22, v4

    .line 187
    .line 188
    iget-wide v3, v7, LJ3/d;->f:J

    .line 189
    .line 190
    move-wide/from16 v18, v3

    .line 191
    .line 192
    iget-wide v3, v7, LJ3/d;->g:J

    .line 193
    .line 194
    move-object/from16 v21, v11

    .line 195
    .line 196
    move-object/from16 v11, v17

    .line 197
    .line 198
    move-wide/from16 v17, v18

    .line 199
    .line 200
    move-wide/from16 v19, v3

    .line 201
    .line 202
    invoke-direct/range {v11 .. v21}, LJ3/d;-><init>(IZZZZJJLjava/util/Set;)V

    .line 203
    .line 204
    .line 205
    move-object/from16 v17, v11

    .line 206
    .line 207
    iget v3, v2, LS3/p;->l:I

    .line 208
    .line 209
    iget-wide v11, v2, LS3/p;->m:J

    .line 210
    .line 211
    iget-wide v13, v2, LS3/p;->n:J

    .line 212
    .line 213
    iget-boolean v4, v2, LS3/p;->q:Z

    .line 214
    .line 215
    iget v7, v2, LS3/p;->s:I

    .line 216
    .line 217
    move/from16 v30, v7

    .line 218
    .line 219
    iget-object v7, v2, LS3/p;->c:Ljava/lang/String;

    .line 220
    .line 221
    move-wide/from16 v20, v11

    .line 222
    .line 223
    iget-wide v11, v2, LS3/p;->g:J

    .line 224
    .line 225
    move/from16 v28, v4

    .line 226
    .line 227
    move-object/from16 v4, v22

    .line 228
    .line 229
    move-wide/from16 v22, v13

    .line 230
    .line 231
    iget-wide v13, v2, LS3/p;->h:J

    .line 232
    .line 233
    move/from16 v19, v3

    .line 234
    .line 235
    move-object v15, v4

    .line 236
    iget-wide v3, v2, LS3/p;->i:J

    .line 237
    .line 238
    move-object/from16 v33, v1

    .line 239
    .line 240
    iget v1, v2, LS3/p;->k:I

    .line 241
    .line 242
    move-wide/from16 v24, v3

    .line 243
    .line 244
    iget-wide v3, v2, LS3/p;->o:J

    .line 245
    .line 246
    move-wide/from16 v26, v3

    .line 247
    .line 248
    iget-wide v3, v2, LS3/p;->p:J

    .line 249
    .line 250
    iget v2, v2, LS3/p;->r:I

    .line 251
    .line 252
    const/16 v32, 0x0

    .line 253
    .line 254
    const/high16 v31, 0x80000

    .line 255
    .line 256
    move-wide/from16 v34, v3

    .line 257
    .line 258
    move-object v4, v15

    .line 259
    move-wide/from16 v15, v24

    .line 260
    .line 261
    move-wide/from16 v24, v26

    .line 262
    .line 263
    move-wide/from16 v26, v34

    .line 264
    .line 265
    move/from16 v18, v1

    .line 266
    .line 267
    move/from16 v29, v2

    .line 268
    .line 269
    invoke-direct/range {v4 .. v32}, LS3/p;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;LJ3/h;LJ3/h;JJJLJ3/d;IIJJJJZIIII)V

    .line 270
    .line 271
    .line 272
    iput-object v4, v0, LA7/b0;->d:Ljava/lang/Object;

    .line 273
    .line 274
    return-object v33
.end method

.method public j(LE5/T;LG5/h;)Z
    .locals 3

    .line 1
    iget-object v0, p1, LE5/T;->l:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "audio/eac3-joc"

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget v1, p1, LE5/T;->y:I

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/16 v0, 0x10

    .line 14
    .line 15
    if-ne v1, v0, :cond_0

    .line 16
    .line 17
    const/16 v1, 0xc

    .line 18
    .line 19
    :cond_0
    new-instance v0, Landroid/media/AudioFormat$Builder;

    .line 20
    .line 21
    invoke-direct {v0}, Landroid/media/AudioFormat$Builder;-><init>()V

    .line 22
    .line 23
    .line 24
    const/4 v2, 0x2

    .line 25
    invoke-virtual {v0, v2}, Landroid/media/AudioFormat$Builder;->setEncoding(I)Landroid/media/AudioFormat$Builder;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v1}, Lu6/v;->k(I)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-virtual {v0, v1}, Landroid/media/AudioFormat$Builder;->setChannelMask(I)Landroid/media/AudioFormat$Builder;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const/4 v1, -0x1

    .line 38
    iget p1, p1, LE5/T;->z:I

    .line 39
    .line 40
    if-eq p1, v1, :cond_1

    .line 41
    .line 42
    invoke-virtual {v0, p1}, Landroid/media/AudioFormat$Builder;->setSampleRate(I)Landroid/media/AudioFormat$Builder;

    .line 43
    .line 44
    .line 45
    :cond_1
    iget-object p1, p0, LA7/b0;->c:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p1, Landroid/media/Spatializer;

    .line 48
    .line 49
    invoke-virtual {p2}, LG5/h;->a()LA/e0;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    iget-object p2, p2, LA/e0;->b:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p2, Landroid/media/AudioAttributes;

    .line 56
    .line 57
    invoke-virtual {v0}, Landroid/media/AudioFormat$Builder;->build()Landroid/media/AudioFormat;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-static {p1, p2, v0}, LG5/f;->l(Landroid/media/Spatializer;Landroid/media/AudioAttributes;Landroid/media/AudioFormat;)Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    return p1
.end method

.method public k(LN1/c;LN1/n;)Z
    .locals 4

    .line 1
    iget-object v0, p2, LN1/n;->n:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "audio/eac3-joc"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, -0x1

    .line 10
    iget v2, p2, LN1/n;->C:I

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/16 v0, 0x10

    .line 15
    .line 16
    if-ne v2, v0, :cond_3

    .line 17
    .line 18
    const/16 v2, 0xc

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object v0, p2, LN1/n;->n:Ljava/lang/String;

    .line 22
    .line 23
    const-string v3, "audio/iamf"

    .line 24
    .line 25
    invoke-static {v0, v3}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_1

    .line 30
    .line 31
    if-ne v2, v1, :cond_3

    .line 32
    .line 33
    const/4 v2, 0x6

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const-string v3, "audio/ac4"

    .line 36
    .line 37
    invoke-static {v0, v3}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    const/16 v0, 0x12

    .line 44
    .line 45
    if-eq v2, v0, :cond_2

    .line 46
    .line 47
    const/16 v0, 0x15

    .line 48
    .line 49
    if-ne v2, v0, :cond_3

    .line 50
    .line 51
    :cond_2
    const/16 v2, 0x18

    .line 52
    .line 53
    :cond_3
    :goto_0
    invoke-static {v2}, LQ1/x;->q(I)I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_4

    .line 58
    .line 59
    const/4 p1, 0x0

    .line 60
    return p1

    .line 61
    :cond_4
    new-instance v2, Landroid/media/AudioFormat$Builder;

    .line 62
    .line 63
    invoke-direct {v2}, Landroid/media/AudioFormat$Builder;-><init>()V

    .line 64
    .line 65
    .line 66
    const/4 v3, 0x2

    .line 67
    invoke-virtual {v2, v3}, Landroid/media/AudioFormat$Builder;->setEncoding(I)Landroid/media/AudioFormat$Builder;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-virtual {v2, v0}, Landroid/media/AudioFormat$Builder;->setChannelMask(I)Landroid/media/AudioFormat$Builder;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iget p2, p2, LN1/n;->D:I

    .line 76
    .line 77
    if-eq p2, v1, :cond_5

    .line 78
    .line 79
    invoke-virtual {v0, p2}, Landroid/media/AudioFormat$Builder;->setSampleRate(I)Landroid/media/AudioFormat$Builder;

    .line 80
    .line 81
    .line 82
    :cond_5
    iget-object p2, p0, LA7/b0;->c:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast p2, Landroid/media/Spatializer;

    .line 85
    .line 86
    invoke-virtual {p1}, LN1/c;->a()Ly3/j;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    iget-object p1, p1, Ly3/j;->b:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast p1, Landroid/media/AudioAttributes;

    .line 93
    .line 94
    invoke-virtual {v0}, Landroid/media/AudioFormat$Builder;->build()Landroid/media/AudioFormat;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-static {p2, p1, v0}, LG5/f;->l(Landroid/media/Spatializer;Landroid/media/AudioAttributes;Landroid/media/AudioFormat;)Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    return p1
.end method

.method public l(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, LA7/b0;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La4/f;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-boolean v1, p0, LA7/b0;->b:Z

    .line 7
    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    iget-object v1, p0, LA7/b0;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, La4/b;

    .line 13
    .line 14
    iget-object v1, v1, La4/b;->g:LA7/b0;

    .line 15
    .line 16
    invoke-static {v1, p0}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-static {v0, p0, p1}, La4/f;->a(La4/f;LA7/b0;Z)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    :goto_0
    const/4 p1, 0x1

    .line 29
    iput-boolean p1, p0, LA7/b0;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    monitor-exit v0

    .line 32
    return-void

    .line 33
    :cond_1
    :try_start_1
    const-string p1, "editor is closed"

    .line 34
    .line 35
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 36
    .line 37
    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    :goto_1
    monitor-exit v0

    .line 42
    throw p1
.end method

.method public n(I)Lcg/y;
    .locals 4

    .line 1
    iget-object v0, p0, LA7/b0;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La4/f;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-boolean v1, p0, LA7/b0;->b:Z

    .line 7
    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    iget-object v1, p0, LA7/b0;->d:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, [Z

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    aput-boolean v2, v1, p1

    .line 16
    .line 17
    iget-object v1, p0, LA7/b0;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, La4/b;

    .line 20
    .line 21
    iget-object v1, v1, La4/b;->d:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iget-object v1, v0, La4/f;->p:La4/d;

    .line 28
    .line 29
    move-object v2, p1

    .line 30
    check-cast v2, Lcg/y;

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Lcg/m;->c(Lcg/y;)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-nez v3, :cond_0

    .line 37
    .line 38
    invoke-virtual {v1, v2}, La4/d;->h(Lcg/y;)Lcg/F;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-static {v1}, Lk4/e;->a(Ljava/io/Closeable;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    check-cast p1, Lcg/y;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    monitor-exit v0

    .line 48
    return-object p1

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    :try_start_1
    const-string p1, "editor is closed"

    .line 52
    .line 53
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 59
    :goto_0
    monitor-exit v0

    .line 60
    throw p1
.end method

.method public o()Ljava/io/File;
    .locals 5

    .line 1
    iget-object v0, p0, LA7/b0;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lz4/c;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, LA7/b0;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Lz4/b;

    .line 9
    .line 10
    iget-object v2, v1, Lz4/b;->f:LA7/b0;

    .line 11
    .line 12
    if-ne v2, p0, :cond_2

    .line 13
    .line 14
    iget-boolean v2, v1, Lz4/b;->e:Z

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    iget-object v2, p0, LA7/b0;->d:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, [Z

    .line 22
    .line 23
    const/4 v4, 0x1

    .line 24
    aput-boolean v4, v2, v3

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception v1

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    :goto_0
    iget-object v1, v1, Lz4/b;->d:[Ljava/io/File;

    .line 30
    .line 31
    aget-object v1, v1, v3

    .line 32
    .line 33
    iget-object v2, p0, LA7/b0;->e:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v2, Lz4/c;

    .line 36
    .line 37
    iget-object v2, v2, Lz4/c;->a:Ljava/io/File;

    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-nez v2, :cond_1

    .line 44
    .line 45
    iget-object v2, p0, LA7/b0;->e:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v2, Lz4/c;

    .line 48
    .line 49
    iget-object v2, v2, Lz4/c;->a:Ljava/io/File;

    .line 50
    .line 51
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 52
    .line 53
    .line 54
    :cond_1
    monitor-exit v0

    .line 55
    return-object v1

    .line 56
    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 57
    .line 58
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 59
    .line 60
    .line 61
    throw v1

    .line 62
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    throw v1
.end method

.method public onComplete()V
    .locals 1

    .line 1
    iget-boolean v0, p0, LA7/b0;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, LA7/b0;->b:Z

    .line 7
    .line 8
    iget-object v0, p0, LA7/b0;->d:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, LTe/n;

    .line 11
    .line 12
    invoke-virtual {v0, p0}, LHe/i;->c(LHe/j;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-object v0, p0, LA7/b0;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, LHe/j;

    .line 19
    .line 20
    invoke-interface {v0}, LHe/j;->onComplete()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object v0, p0, LA7/b0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LHe/j;

    .line 4
    .line 5
    invoke-interface {v0, p1}, LHe/j;->onError(Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public p()[I
    .locals 10

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, LA7/b0;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    const/4 v0, 0x0

    .line 8
    return-object v0

    .line 9
    :cond_0
    :try_start_1
    iget-object v0, p0, LA7/b0;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, [J

    .line 12
    .line 13
    array-length v1, v0

    .line 14
    const/4 v2, 0x0

    .line 15
    move v3, v2

    .line 16
    move v4, v3

    .line 17
    :goto_0
    if-ge v3, v1, :cond_4

    .line 18
    .line 19
    aget-wide v5, v0, v3

    .line 20
    .line 21
    add-int/lit8 v7, v4, 0x1

    .line 22
    .line 23
    const-wide/16 v8, 0x0

    .line 24
    .line 25
    cmp-long v5, v5, v8

    .line 26
    .line 27
    const/4 v6, 0x1

    .line 28
    if-lez v5, :cond_1

    .line 29
    .line 30
    move v5, v6

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move v5, v2

    .line 33
    :goto_1
    iget-object v8, p0, LA7/b0;->d:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v8, [Z

    .line 36
    .line 37
    aget-boolean v9, v8, v4

    .line 38
    .line 39
    if-eq v5, v9, :cond_3

    .line 40
    .line 41
    iget-object v9, p0, LA7/b0;->e:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v9, [I

    .line 44
    .line 45
    if-eqz v5, :cond_2

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_2
    const/4 v6, 0x2

    .line 49
    :goto_2
    aput v6, v9, v4

    .line 50
    .line 51
    goto :goto_3

    .line 52
    :catchall_0
    move-exception v0

    .line 53
    goto :goto_4

    .line 54
    :cond_3
    iget-object v6, p0, LA7/b0;->e:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v6, [I

    .line 57
    .line 58
    aput v2, v6, v4

    .line 59
    .line 60
    :goto_3
    aput-boolean v5, v8, v4

    .line 61
    .line 62
    add-int/lit8 v3, v3, 0x1

    .line 63
    .line 64
    move v4, v7

    .line 65
    goto :goto_0

    .line 66
    :cond_4
    iput-boolean v2, p0, LA7/b0;->b:Z

    .line 67
    .line 68
    iget-object v0, p0, LA7/b0;->e:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, [I

    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    check-cast v0, [I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 77
    .line 78
    monitor-exit p0

    .line 79
    return-object v0

    .line 80
    :goto_4
    monitor-exit p0

    .line 81
    throw v0
.end method

.method public q()Z
    .locals 2

    .line 1
    iget-object v0, p0, LA7/b0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, LA7/b0;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    monitor-exit v0

    .line 10
    throw v1
.end method

.method public r(I)V
    .locals 10

    .line 1
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 2
    .line 3
    const-string v1, "backoffPolicy"

    .line 4
    .line 5
    invoke-static {p1, v1}, Lka/n;->m(ILjava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v1, "timeUnit"

    .line 9
    .line 10
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    iput-boolean v1, p0, LA7/b0;->b:Z

    .line 15
    .line 16
    iget-object v1, p0, LA7/b0;->d:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, LS3/p;

    .line 19
    .line 20
    iput p1, v1, LS3/p;->l:I

    .line 21
    .line 22
    const-wide/16 v2, 0x2710

    .line 23
    .line 24
    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 25
    .line 26
    .line 27
    move-result-wide v4

    .line 28
    const-wide/32 v6, 0x112a880

    .line 29
    .line 30
    .line 31
    cmp-long p1, v4, v6

    .line 32
    .line 33
    sget-object v0, LS3/p;->u:Ljava/lang/String;

    .line 34
    .line 35
    if-lez p1, :cond_0

    .line 36
    .line 37
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    const-string v6, "Backoff delay duration exceeds maximum value"

    .line 42
    .line 43
    invoke-virtual {p1, v0, v6}, LJ3/r;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    cmp-long p1, v4, v2

    .line 47
    .line 48
    if-gez p1, :cond_1

    .line 49
    .line 50
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    const-string v2, "Backoff delay duration less than minimum value"

    .line 55
    .line 56
    invoke-virtual {p1, v0, v2}, LJ3/r;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    :cond_1
    const-wide/16 v6, 0x2710

    .line 60
    .line 61
    const-wide/32 v8, 0x112a880

    .line 62
    .line 63
    .line 64
    invoke-static/range {v4 .. v9}, Landroid/support/v4/media/session/b;->T(JJJ)J

    .line 65
    .line 66
    .line 67
    move-result-wide v2

    .line 68
    iput-wide v2, v1, LS3/p;->m:J

    .line 69
    .line 70
    return-void
.end method

.method public s(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, LA7/b0;->c:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Ljava/util/concurrent/atomic/AtomicMarkableReference;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->getReference()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, LT8/d;

    .line 11
    .line 12
    invoke-virtual {v0, p1, p2}, LT8/d;->c(Ljava/lang/String;Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    monitor-exit p0

    .line 20
    return p1

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object p1, p0, LA7/b0;->c:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p1, Ljava/util/concurrent/atomic/AtomicMarkableReference;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->getReference()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    check-cast p2, LT8/d;

    .line 32
    .line 33
    const/4 v0, 0x1

    .line 34
    invoke-virtual {p1, p2, v0}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->set(Ljava/lang/Object;Z)V

    .line 35
    .line 36
    .line 37
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    new-instance p1, LC8/g;

    .line 39
    .line 40
    const/16 p2, 0xd

    .line 41
    .line 42
    invoke-direct {p1, p0, p2}, LC8/g;-><init>(Ljava/lang/Object;I)V

    .line 43
    .line 44
    .line 45
    iget-object p2, p0, LA7/b0;->d:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p2, Ljava/util/concurrent/atomic/AtomicReference;

    .line 48
    .line 49
    :cond_1
    const/4 v1, 0x0

    .line 50
    invoke-virtual {p2, v1, p1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_2

    .line 55
    .line 56
    iget-object p2, p0, LA7/b0;->e:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p2, LX8/c;

    .line 59
    .line 60
    iget-object p2, p2, LX8/c;->c:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast p2, LS8/f;

    .line 63
    .line 64
    iget-object p2, p2, LS8/f;->b:LS8/c;

    .line 65
    .line 66
    invoke-virtual {p2, p1}, LS8/c;->b(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    .line 67
    .line 68
    .line 69
    return v0

    .line 70
    :cond_2
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    if-eqz v1, :cond_1

    .line 75
    .line 76
    return v0

    .line 77
    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 78
    throw p1
.end method

.method public t(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    .locals 3

    .line 1
    iget-object v0, p0, LA7/b0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, LA7/b0;->b:Z

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    iget-object v1, p0, LA7/b0;->d:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Ljava/util/ArrayDeque;

    .line 11
    .line 12
    new-instance v2, Lya/r;

    .line 13
    .line 14
    invoke-direct {v2, p1, p2}, Lya/r;-><init>(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    monitor-exit v0

    .line 21
    return-void

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v1, 0x1

    .line 25
    iput-boolean v1, p0, LA7/b0;->b:Z

    .line 26
    .line 27
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    invoke-virtual {p0, p1, p2}, LA7/b0;->w(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    iget v1, p0, LA7/b0;->a:I

    .line 3
    .line 4
    packed-switch v1, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    :pswitch_0
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :pswitch_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v1, "DatabaseInfo(databaseId:"

    .line 15
    .line 16
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, LA7/b0;->e:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Ls9/f;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v1, " host:"

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, LA7/b0;->d:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, Ljava/lang/String;

    .line 34
    .line 35
    const-string v2, ")"

    .line 36
    .line 37
    invoke-static {v0, v1, v2}, Lwg/b;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    return-object v0

    .line 42
    :pswitch_2
    iget-boolean v1, p0, LA7/b0;->b:Z

    .line 43
    .line 44
    new-instance v2, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    const/16 v3, 0x20

    .line 47
    .line 48
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 49
    .line 50
    .line 51
    iget-object v3, p0, LA7/b0;->c:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v3, Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const/16 v3, 0x7b

    .line 59
    .line 60
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    iget-object v3, p0, LA7/b0;->d:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v3, LG9/e;

    .line 66
    .line 67
    iget-object v3, v3, LG9/e;->d:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v3, LG9/e;

    .line 70
    .line 71
    const-string v4, ""

    .line 72
    .line 73
    :goto_0
    if-eqz v3, :cond_4

    .line 74
    .line 75
    iget-object v5, v3, LG9/e;->c:Ljava/lang/Object;

    .line 76
    .line 77
    instance-of v6, v3, Lk8/i;

    .line 78
    .line 79
    if-nez v6, :cond_0

    .line 80
    .line 81
    if-nez v5, :cond_0

    .line 82
    .line 83
    if-nez v1, :cond_3

    .line 84
    .line 85
    :cond_0
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    iget-object v4, v3, LG9/e;->b:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v4, Ljava/lang/String;

    .line 91
    .line 92
    if-eqz v4, :cond_1

    .line 93
    .line 94
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    const/16 v4, 0x3d

    .line 98
    .line 99
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    :cond_1
    if-eqz v5, :cond_2

    .line 103
    .line 104
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    invoke-virtual {v4}, Ljava/lang/Class;->isArray()Z

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    if-eqz v4, :cond_2

    .line 113
    .line 114
    new-array v4, v0, [Ljava/lang/Object;

    .line 115
    .line 116
    const/4 v6, 0x0

    .line 117
    aput-object v5, v4, v6

    .line 118
    .line 119
    invoke-static {v4}, Ljava/util/Arrays;->deepToString([Ljava/lang/Object;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 124
    .line 125
    .line 126
    move-result v5

    .line 127
    sub-int/2addr v5, v0

    .line 128
    invoke-virtual {v2, v4, v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_2
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    :goto_1
    const-string v4, ", "

    .line 136
    .line 137
    :cond_3
    iget-object v3, v3, LG9/e;->d:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v3, LG9/e;

    .line 140
    .line 141
    goto :goto_0

    .line 142
    :cond_4
    const/16 v0, 0x7d

    .line 143
    .line 144
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    return-object v0

    .line 152
    nop

    .line 153
    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public u()Ljava/lang/String;
    .locals 3

    .line 1
    iget-boolean v0, p0, LA7/b0;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, LA7/b0;->b:Z

    .line 7
    .line 8
    iget-object v0, p0, LA7/b0;->e:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, LA7/Z;

    .line 11
    .line 12
    invoke-virtual {v0}, LA7/Z;->l0()Landroid/content/SharedPreferences;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v1, p0, LA7/b0;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Ljava/lang/String;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, LA7/b0;->d:Ljava/lang/Object;

    .line 26
    .line 27
    :cond_0
    iget-object v0, p0, LA7/b0;->d:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, Ljava/lang/String;

    .line 30
    .line 31
    return-object v0
.end method

.method public v(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, LA7/b0;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LA7/Z;

    .line 4
    .line 5
    invoke-virtual {v0}, LA7/Z;->l0()Landroid/content/SharedPreferences;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, LA7/b0;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Ljava/lang/String;

    .line 16
    .line 17
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 18
    .line 19
    .line 20
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, LA7/b0;->d:Ljava/lang/Object;

    .line 24
    .line 25
    return-void
.end method

.method public w(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    .locals 2

    .line 1
    new-instance v0, Lya/m;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1, p0, p1}, Lya/m;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    :try_start_0
    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :catch_0
    invoke-virtual {p0}, LA7/b0;->zzc()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public x()V
    .locals 3

    .line 1
    iget-object v0, p0, LA7/b0;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/os/Handler;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, LA7/b0;->e:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, LVa/q;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-static {}, LVa/fb;->e()LVa/fb;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v2, p0, LA7/b0;->e:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, LVa/q;

    .line 22
    .line 23
    invoke-virtual {v0, v2}, LVa/fb;->k(LVa/db;)V

    .line 24
    .line 25
    .line 26
    iput-object v1, p0, LA7/b0;->e:Ljava/lang/Object;

    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public zzb()V
    .locals 4

    .line 1
    iget-object v0, p0, LA7/b0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/Context;

    .line 4
    .line 5
    iget-object v1, p0, LA7/b0;->e:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzh;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    :try_start_0
    sget-object v1, Lr7/d;->b:Lab/b;

    .line 13
    .line 14
    const-string v2, "com.google.android.gms.vision.dynamite"

    .line 15
    .line 16
    invoke-static {v0, v1, v2}, Lr7/d;->c(Landroid/content/Context;Lr7/c;Ljava/lang/String;)Lr7/d;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-string v2, "com.google.android.gms.vision.text.ChimeraNativeTextRecognizerCreator"

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Lr7/d;->b(Ljava/lang/String;)Landroid/os/IBinder;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-static {v1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzj;->zza(Landroid/os/IBinder;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzk;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    new-instance v2, Lq7/b;

    .line 31
    .line 32
    invoke-direct {v2, v0}, Lq7/b;-><init>(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object v3, p0, LA7/b0;->d:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v3, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzp;

    .line 38
    .line 39
    invoke-interface {v1, v2, v3}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzk;->zzd(Lq7/a;Lcom/google/android/gms/internal/mlkit_vision_text_common/zzp;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzh;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    iput-object v1, p0, LA7/b0;->e:Ljava/lang/Object;

    .line 44
    .line 45
    if-nez v1, :cond_1

    .line 46
    .line 47
    iget-boolean v1, p0, LA7/b0;->b:Z

    .line 48
    .line 49
    if-nez v1, :cond_1

    .line 50
    .line 51
    const-string v1, "LegacyTextDelegate"

    .line 52
    .line 53
    const-string v2, "Request OCR optional module download."

    .line 54
    .line 55
    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    invoke-static {v0}, Lya/j;->a(Landroid/content/Context;)V

    .line 59
    .line 60
    .line 61
    const/4 v0, 0x1

    .line 62
    iput-boolean v0, p0, LA7/b0;->b:Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lr7/a; {:try_start_0 .. :try_end_0} :catch_0

    .line 63
    .line 64
    return-void

    .line 65
    :catch_0
    move-exception v0

    .line 66
    goto :goto_1

    .line 67
    :catch_1
    move-exception v0

    .line 68
    goto :goto_2

    .line 69
    :cond_1
    :goto_0
    return-void

    .line 70
    :goto_1
    new-instance v1, Lua/a;

    .line 71
    .line 72
    const-string v2, "Failed to load deprecated vision dynamite module."

    .line 73
    .line 74
    invoke-direct {v1, v2, v0}, Lua/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 75
    .line 76
    .line 77
    throw v1

    .line 78
    :goto_2
    new-instance v1, Lua/a;

    .line 79
    .line 80
    const-string v2, "Failed to create legacy text recognizer."

    .line 81
    .line 82
    invoke-direct {v1, v2, v0}, Lua/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 83
    .line 84
    .line 85
    throw v1
.end method

.method public zzc()V
    .locals 3

    .line 1
    iget v0, p0, LA7/b0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA7/b0;->c:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    iget-object v1, p0, LA7/b0;->d:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Ljava/util/ArrayDeque;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    iput-boolean v1, p0, LA7/b0;->b:Z

    .line 21
    .line 22
    monitor-exit v0

    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v1

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    iget-object v1, p0, LA7/b0;->d:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Ljava/util/ArrayDeque;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Lya/r;

    .line 35
    .line 36
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    iget-object v0, v1, Lya/r;->a:Ljava/util/concurrent/Executor;

    .line 38
    .line 39
    iget-object v1, v1, Lya/r;->b:Ljava/lang/Runnable;

    .line 40
    .line 41
    invoke-virtual {p0, v1, v0}, LA7/b0;->w(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 42
    .line 43
    .line 44
    :goto_0
    return-void

    .line 45
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 46
    throw v1

    .line 47
    :pswitch_0
    iget-object v0, p0, LA7/b0;->e:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzh;

    .line 50
    .line 51
    if-eqz v0, :cond_1

    .line 52
    .line 53
    :try_start_2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzh;->zzd()V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0

    .line 54
    .line 55
    .line 56
    goto :goto_2

    .line 57
    :catch_0
    move-exception v0

    .line 58
    const-string v1, "LegacyTextDelegate"

    .line 59
    .line 60
    const-string v2, "Failed to release legacy text recognizer."

    .line 61
    .line 62
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 63
    .line 64
    .line 65
    :goto_2
    const/4 v0, 0x0

    .line 66
    iput-object v0, p0, LA7/b0;->e:Ljava/lang/Object;

    .line 67
    .line 68
    :cond_1
    return-void

    .line 69
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
