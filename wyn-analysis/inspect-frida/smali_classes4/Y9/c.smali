.class public final LY9/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA/o;
.implements Lcom/google/android/gms/internal/measurement/zzv;
.implements LI4/q;
.implements Lcom/google/android/gms/tasks/Continuation;
.implements Lcom/google/android/gms/internal/ads/zzhcc;
.implements LLe/c;


# static fields
.field public static volatile c:LY9/c;

.field public static d:LY9/c;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(F)V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, LY9/c;->a:I

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    new-instance v0, LA/w;

    const v1, 0x3c23d70a    # 0.01f

    .line 34
    invoke-direct {v0, p1, v1}, LA/w;-><init>(FF)V

    .line 35
    iput-object v0, p0, LY9/c;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 3

    const/high16 v0, 0x3f800000    # 1.0f

    const/4 v1, 0x0

    iput p1, p0, LY9/c;->a:I

    sparse-switch p1, :sswitch_data_0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, LY9/c;->b:Ljava/lang/Object;

    return-void

    .line 6
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    new-instance p1, La2/e;

    const/4 v2, 0x5

    .line 8
    invoke-direct {p1, v2, v0, v1}, La2/e;-><init>(IFZ)V

    .line 9
    iput-object p1, p0, LY9/c;->b:Ljava/lang/Object;

    return-void

    .line 10
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    sget-object p1, Lx/t;->a:[J

    .line 12
    new-instance p1, Lx/o;

    invoke-direct {p1}, Lx/o;-><init>()V

    .line 13
    iput-object p1, p0, LY9/c;->b:Ljava/lang/Object;

    return-void

    .line 14
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    new-instance p1, LY9/c;

    const/16 v0, 0xb

    invoke-direct {p1, v0}, LY9/c;-><init>(I)V

    iput-object p1, p0, LY9/c;->b:Ljava/lang/Object;

    return-void

    .line 16
    :sswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LY9/c;->b:Ljava/lang/Object;

    return-void

    .line 18
    :sswitch_4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    new-instance p1, LI4/m;

    const-wide/16 v0, 0x1f4

    .line 20
    invoke-direct {p1, v0, v1}, LW1/r;-><init>(J)V

    .line 21
    iput-object p1, p0, LY9/c;->b:Ljava/lang/Object;

    return-void

    .line 22
    :sswitch_5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lj$/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, LY9/c;->b:Ljava/lang/Object;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 23
    invoke-direct {p1, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    return-void

    .line 24
    :sswitch_6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-instance p1, Ljava/util/LinkedHashMap;

    const/16 v1, 0x8

    int-to-float v1, v1

    const/high16 v2, 0x3f400000    # 0.75f

    div-float/2addr v1, v2

    add-float/2addr v1, v0

    float-to-int v0, v1

    invoke-direct {p1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 26
    iput-object p1, p0, LY9/c;->b:Ljava/lang/Object;

    return-void

    :sswitch_data_0
    .sparse-switch
        0x6 -> :sswitch_6
        0xa -> :sswitch_5
        0xb -> :sswitch_4
        0xd -> :sswitch_3
        0xe -> :sswitch_2
        0x14 -> :sswitch_1
        0x1d -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 1
    iput p1, p0, LY9/c;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(LN6/j;)V
    .locals 1

    const/16 v0, 0x12

    iput v0, p0, LY9/c;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, LY9/c;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LX8/c;)V
    .locals 2

    const/16 v0, 0x1c

    iput v0, p0, LY9/c;->a:I

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance v0, Ljava/io/File;

    iget-object p1, p1, LX8/c;->c:Ljava/lang/Object;

    check-cast p1, Ljava/io/File;

    const-string v1, "com.crashlytics.settings.json"

    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 29
    iput-object v0, p0, LY9/c;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p2, p0, LY9/c;->a:I

    iput-object p1, p0, LY9/c;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/util/UUID;I[B)V
    .locals 0

    const/16 p2, 0x11

    iput p2, p0, LY9/c;->a:I

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, LY9/c;->b:Ljava/lang/Object;

    return-void
.end method

.method public static e(Lxg/g;)LBa/c;
    .locals 2

    .line 1
    new-instance v0, LS1/v;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, LS1/v;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance p0, Ljava/util/HashMap;

    .line 11
    .line 12
    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 13
    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    throw p0
.end method

.method public static h()LY9/c;
    .locals 3

    .line 1
    sget-object v0, LY9/c;->d:LY9/c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, LY9/c;

    .line 6
    .line 7
    const/16 v1, 0x1b

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v0, v1, v2}, LY9/c;-><init>(IZ)V

    .line 11
    .line 12
    .line 13
    sput-object v0, LY9/c;->d:LY9/c;

    .line 14
    .line 15
    :cond_0
    sget-object v0, LY9/c;->d:LY9/c;

    .line 16
    .line 17
    return-object v0
.end method

.method public static k(Lorg/json/JSONArray;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-ge v1, v2, :cond_2

    .line 12
    .line 13
    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    instance-of v3, v2, Lorg/json/JSONArray;

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    check-cast v2, Lorg/json/JSONArray;

    .line 22
    .line 23
    invoke-static {v2}, LY9/c;->k(Lorg/json/JSONArray;)Ljava/util/ArrayList;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    instance-of v3, v2, Lorg/json/JSONObject;

    .line 29
    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    check-cast v2, Lorg/json/JSONObject;

    .line 33
    .line 34
    invoke-static {v2}, LY9/c;->l(Lorg/json/JSONObject;)Ljava/util/HashMap;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    :cond_1
    :goto_1
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    return-object v0
.end method

.method public static l(Lorg/json/JSONObject;)Ljava/util/HashMap;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_2

    .line 15
    .line 16
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    instance-of v4, v3, Lorg/json/JSONArray;

    .line 27
    .line 28
    if-eqz v4, :cond_0

    .line 29
    .line 30
    check-cast v3, Lorg/json/JSONArray;

    .line 31
    .line 32
    invoke-static {v3}, LY9/c;->k(Lorg/json/JSONArray;)Ljava/util/ArrayList;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    instance-of v4, v3, Lorg/json/JSONObject;

    .line 38
    .line 39
    if-eqz v4, :cond_1

    .line 40
    .line 41
    check-cast v3, Lorg/json/JSONObject;

    .line 42
    .line 43
    invoke-static {v3}, LY9/c;->l(Lorg/json/JSONObject;)Ljava/util/HashMap;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    :cond_1
    :goto_1
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    return-object v0
.end method


# virtual methods
.method public a(Landroid/view/View;)Lorg/json/JSONObject;
    .locals 4

    .line 1
    const/4 p1, 0x0

    .line 2
    invoke-static {p1, p1, p1, p1}, LRa/b;->a(IIII)Lorg/json/JSONObject;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    sget-object v1, Lka/e0;->g:Landroid/app/UiModeManager;

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {v1}, Landroid/app/UiModeManager;->getCurrentModeType()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eq v1, v2, :cond_1

    .line 16
    .line 17
    const/4 v3, 0x4

    .line 18
    if-eq v1, v3, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    sget v1, Lp7/b;->c:I

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    :goto_0
    const/4 v1, 0x2

    .line 25
    :goto_1
    sget-object v3, LRa/a;->a:[I

    .line 26
    .line 27
    invoke-static {v1}, LA/f;->f(I)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    aget v1, v3, v1

    .line 32
    .line 33
    if-eq v1, v2, :cond_2

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_2
    move p1, v2

    .line 37
    :goto_2
    :try_start_0
    const-string v1, "noOutputDevice"

    .line 38
    .line 39
    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    .line 42
    return-object v0

    .line 43
    :catch_0
    move-exception p1

    .line 44
    const-string v1, "OMIDLIB"

    .line 45
    .line 46
    const-string v2, "Error with setting output device status"

    .line 47
    .line 48
    invoke-static {v1, v2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 49
    .line 50
    .line 51
    return-object v0
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, LY9/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LY9/c;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LSe/h;

    .line 9
    .line 10
    iget-object v0, v0, LSe/h;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lx4/d;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    new-array v1, v1, [Ljava/lang/Object;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    aput-object p1, v1, v2

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lx4/d;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1

    .line 25
    :pswitch_0
    check-cast p1, Ljava/util/List;

    .line 26
    .line 27
    iget-object v0, p0, LY9/c;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, LA0/f;

    .line 30
    .line 31
    invoke-static {p1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 32
    .line 33
    .line 34
    return-object p1

    .line 35
    :pswitch_data_0
    .packed-switch 0x13
        :pswitch_0
    .end packed-switch
.end method

.method public b(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 5

    .line 1
    iget-object v0, p0, LY9/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lx/o;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lx/o;->d(Ljava/lang/Object;)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-gez v1, :cond_0

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v2, 0x0

    .line 14
    :goto_0
    if-eqz v2, :cond_1

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    iget-object v3, v0, Lx/o;->c:[Ljava/lang/Object;

    .line 19
    .line 20
    aget-object v3, v3, v1

    .line 21
    .line 22
    :goto_1
    if-nez v3, :cond_2

    .line 23
    .line 24
    goto :goto_3

    .line 25
    :cond_2
    instance-of v4, v3, Lx/r;

    .line 26
    .line 27
    if-eqz v4, :cond_3

    .line 28
    .line 29
    move-object v4, v3

    .line 30
    check-cast v4, Lx/r;

    .line 31
    .line 32
    invoke-virtual {v4, p2}, Lx/r;->a(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_3
    if-eq v3, p2, :cond_4

    .line 37
    .line 38
    new-instance v4, Lx/r;

    .line 39
    .line 40
    invoke-direct {v4}, Lx/r;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v4, v3}, Lx/r;->a(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    invoke-virtual {v4, p2}, Lx/r;->a(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-object p2, v4

    .line 50
    goto :goto_3

    .line 51
    :cond_4
    :goto_2
    move-object p2, v3

    .line 52
    :goto_3
    if-eqz v2, :cond_5

    .line 53
    .line 54
    not-int v1, v1

    .line 55
    iget-object v2, v0, Lx/o;->b:[Ljava/lang/Object;

    .line 56
    .line 57
    aput-object p1, v2, v1

    .line 58
    .line 59
    iget-object p1, v0, Lx/o;->c:[Ljava/lang/Object;

    .line 60
    .line 61
    aput-object p2, p1, v1

    .line 62
    .line 63
    return-void

    .line 64
    :cond_5
    iget-object p1, v0, Lx/o;->c:[Ljava/lang/Object;

    .line 65
    .line 66
    aput-object p2, p1, v1

    .line 67
    .line 68
    return-void
.end method

.method public c()LX8/c;
    .locals 6

    .line 1
    iget-object v0, p0, LY9/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LG9/e;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v1, LX8/c;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance v2, LG9/f;

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-direct {v2, v3, v0}, LG9/f;-><init>(ILG9/e;)V

    .line 16
    .line 17
    .line 18
    invoke-static {v2}, LC9/a;->a(Ldf/a;)Ldf/a;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    iput-object v2, v1, LX8/c;->a:Ljava/lang/Object;

    .line 23
    .line 24
    new-instance v2, LG9/f;

    .line 25
    .line 26
    const/4 v3, 0x2

    .line 27
    invoke-direct {v2, v3, v0}, LG9/f;-><init>(ILG9/e;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v2}, LC9/a;->a(Ldf/a;)Ldf/a;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    iput-object v2, v1, LX8/c;->b:Ljava/lang/Object;

    .line 35
    .line 36
    new-instance v3, LG9/f;

    .line 37
    .line 38
    const/4 v4, 0x1

    .line 39
    invoke-direct {v3, v4, v0}, LG9/f;-><init>(ILG9/e;)V

    .line 40
    .line 41
    .line 42
    iput-object v3, v1, LX8/c;->c:Ljava/lang/Object;

    .line 43
    .line 44
    iget-object v0, v1, LX8/c;->a:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Ldf/a;

    .line 47
    .line 48
    new-instance v4, LE9/b;

    .line 49
    .line 50
    const/4 v5, 0x2

    .line 51
    invoke-direct {v4, v0, v2, v3, v5}, LE9/b;-><init>(Ldf/a;Ldf/a;LG9/f;I)V

    .line 52
    .line 53
    .line 54
    invoke-static {v4}, LC9/a;->a(Ldf/a;)Ldf/a;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iput-object v0, v1, LX8/c;->d:Ljava/lang/Object;

    .line 59
    .line 60
    iget-object v0, v1, LX8/c;->a:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v0, Ldf/a;

    .line 63
    .line 64
    iget-object v2, v1, LX8/c;->b:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v2, Ldf/a;

    .line 67
    .line 68
    iget-object v3, v1, LX8/c;->c:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v3, LG9/f;

    .line 71
    .line 72
    new-instance v4, LE9/b;

    .line 73
    .line 74
    const/4 v5, 0x3

    .line 75
    invoke-direct {v4, v0, v2, v3, v5}, LE9/b;-><init>(Ldf/a;Ldf/a;LG9/f;I)V

    .line 76
    .line 77
    .line 78
    invoke-static {v4}, LC9/a;->a(Ldf/a;)Ldf/a;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    iput-object v0, v1, LX8/c;->e:Ljava/lang/Object;

    .line 83
    .line 84
    iget-object v0, v1, LX8/c;->a:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v0, Ldf/a;

    .line 87
    .line 88
    iget-object v2, v1, LX8/c;->b:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v2, Ldf/a;

    .line 91
    .line 92
    iget-object v3, v1, LX8/c;->c:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v3, LG9/f;

    .line 95
    .line 96
    new-instance v4, LE9/b;

    .line 97
    .line 98
    const/4 v5, 0x0

    .line 99
    invoke-direct {v4, v0, v2, v3, v5}, LE9/b;-><init>(Ldf/a;Ldf/a;LG9/f;I)V

    .line 100
    .line 101
    .line 102
    invoke-static {v4}, LC9/a;->a(Ldf/a;)Ldf/a;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    iput-object v0, v1, LX8/c;->f:Ljava/lang/Object;

    .line 107
    .line 108
    iget-object v0, v1, LX8/c;->a:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v0, Ldf/a;

    .line 111
    .line 112
    iget-object v2, v1, LX8/c;->b:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v2, Ldf/a;

    .line 115
    .line 116
    iget-object v3, v1, LX8/c;->c:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v3, LG9/f;

    .line 119
    .line 120
    new-instance v4, LE9/b;

    .line 121
    .line 122
    const/4 v5, 0x1

    .line 123
    invoke-direct {v4, v0, v2, v3, v5}, LE9/b;-><init>(Ldf/a;Ldf/a;LG9/f;I)V

    .line 124
    .line 125
    .line 126
    invoke-static {v4}, LC9/a;->a(Ldf/a;)Ldf/a;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    iput-object v0, v1, LX8/c;->g:Ljava/lang/Object;

    .line 131
    .line 132
    return-object v1

    .line 133
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 134
    .line 135
    new-instance v1, Ljava/lang/StringBuilder;

    .line 136
    .line 137
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 138
    .line 139
    .line 140
    const-class v2, LG9/e;

    .line 141
    .line 142
    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    const-string v2, " must be set"

    .line 150
    .line 151
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    throw v0
.end method

.method public d(LI4/v;)LI4/p;
    .locals 2

    .line 1
    iget p1, p0, LY9/c;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, LJ4/a;

    .line 7
    .line 8
    iget-object v0, p0, LY9/c;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, LY9/c;

    .line 11
    .line 12
    invoke-direct {p1, v0}, LJ4/a;-><init>(LY9/c;)V

    .line 13
    .line 14
    .line 15
    return-object p1

    .line 16
    :pswitch_0
    new-instance p1, LI4/b;

    .line 17
    .line 18
    sget-object v0, LI4/A;->b:LI4/A;

    .line 19
    .line 20
    iget-object v1, p0, LY9/c;->b:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v1, Landroid/content/res/Resources;

    .line 23
    .line 24
    invoke-direct {p1, v1, v0}, LI4/b;-><init>(Landroid/content/res/Resources;LI4/p;)V

    .line 25
    .line 26
    .line 27
    return-object p1

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_0
    .end packed-switch
.end method

.method public f(Ljava/lang/Object;Lkotlin/reflect/KClass;Landroid/app/Activity;LF3/b;)LA3/d;
    .locals 6

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x1

    .line 4
    const-string v3, "clazz"

    .line 5
    .line 6
    invoke-static {p2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    new-instance v3, LA3/c;

    .line 10
    .line 11
    invoke-direct {v3, p2, p4}, LA3/c;-><init>(Lkotlin/reflect/KClass;LF3/b;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, LY9/c;->q()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    new-array p4, v2, [Ljava/lang/Class;

    .line 19
    .line 20
    aput-object p2, p4, v1

    .line 21
    .line 22
    iget-object p2, p0, LY9/c;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p2, Ljava/lang/ClassLoader;

    .line 25
    .line 26
    invoke-static {p2, p4, v3}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    const-string p4, "newProxyInstance(loader,\u2026onsumerClass()), handler)"

    .line 31
    .line 32
    invoke-static {p2, p4}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object p4

    .line 39
    invoke-virtual {p0}, LY9/c;->q()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    new-array v4, v0, [Ljava/lang/Class;

    .line 44
    .line 45
    const-class v5, Landroid/app/Activity;

    .line 46
    .line 47
    aput-object v5, v4, v1

    .line 48
    .line 49
    aput-object v3, v4, v2

    .line 50
    .line 51
    const-string v3, "addWindowLayoutInfoListener"

    .line 52
    .line 53
    invoke-virtual {p4, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 54
    .line 55
    .line 56
    move-result-object p4

    .line 57
    new-array v0, v0, [Ljava/lang/Object;

    .line 58
    .line 59
    aput-object p3, v0, v1

    .line 60
    .line 61
    aput-object p2, v0, v2

    .line 62
    .line 63
    invoke-virtual {p4, p1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    move-result-object p3

    .line 70
    invoke-virtual {p0}, LY9/c;->q()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    move-result-object p4

    .line 74
    new-array v0, v2, [Ljava/lang/Class;

    .line 75
    .line 76
    aput-object p4, v0, v1

    .line 77
    .line 78
    const-string p4, "removeWindowLayoutInfoListener"

    .line 79
    .line 80
    invoke-virtual {p3, p4, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 81
    .line 82
    .line 83
    move-result-object p3

    .line 84
    new-instance p4, LA3/d;

    .line 85
    .line 86
    invoke-direct {p4, p3, p1, p2}, LA3/d;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    return-object p4
.end method

.method public g(Ljava/lang/String;)Ljava/util/HashMap;
    .locals 4

    .line 1
    invoke-virtual {p0}, LY9/c;->i()Landroid/content/SharedPreferences;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    :try_start_0
    new-instance v2, Ljava/util/HashMap;

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    invoke-direct {v2, v3}, Ljava/util/HashMap;-><init>(I)V

    .line 16
    .line 17
    .line 18
    new-instance v3, Lorg/json/JSONObject;

    .line 19
    .line 20
    invoke-direct {v3, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v3}, LY9/c;->l(Lorg/json/JSONObject;)Ljava/util/HashMap;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v3, "to"

    .line 28
    .line 29
    invoke-virtual {v0, v3, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    const-string p1, "message"

    .line 33
    .line 34
    invoke-virtual {v2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    .line 36
    .line 37
    return-object v2

    .line 38
    :catch_0
    move-exception p1

    .line 39
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 40
    .line 41
    .line 42
    :cond_0
    return-object v1
.end method

.method public get(I)LA/v;
    .locals 0

    .line 1
    iget-object p1, p0, LY9/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, LA/w;

    .line 4
    .line 5
    return-object p1
.end method

.method public i()Landroid/content/SharedPreferences;
    .locals 3

    .line 1
    iget-object v0, p0, LY9/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/SharedPreferences;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lka/e0;->h:Landroid/content/Context;

    .line 8
    .line 9
    const-string v1, "io.flutter.plugins.firebase.messaging"

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, LY9/c;->b:Ljava/lang/Object;

    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, LY9/c;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Landroid/content/SharedPreferences;

    .line 21
    .line 22
    return-object v0
.end method

.method public j()Ljava/util/Set;
    .locals 2

    .line 1
    iget-object v0, p0, LY9/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashSet;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, LY9/c;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Ljava/util/HashSet;

    .line 9
    .line 10
    invoke-static {v1}, Lj$/util/DesugarCollections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    monitor-exit v0

    .line 15
    return-object v1

    .line 16
    :catchall_0
    move-exception v1

    .line 17
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    throw v1
.end method

.method public m()Lorg/json/JSONObject;
    .locals 6

    .line 1
    const-string v0, "Error while closing settings cache file."

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const-string v2, "FirebaseCrashlytics"

    .line 5
    .line 6
    invoke-static {v2, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v3, 0x0

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const-string v1, "Checking for cached settings..."

    .line 14
    .line 15
    invoke-static {v2, v1, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 16
    .line 17
    .line 18
    :cond_0
    :try_start_0
    iget-object v1, p0, LY9/c;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Ljava/io/File;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-eqz v4, :cond_1

    .line 27
    .line 28
    new-instance v4, Ljava/io/FileInputStream;

    .line 29
    .line 30
    invoke-direct {v4, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 31
    .line 32
    .line 33
    :try_start_1
    invoke-static {v4}, LR8/g;->i(Ljava/io/FileInputStream;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    new-instance v5, Lorg/json/JSONObject;

    .line 38
    .line 39
    invoke-direct {v5, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    .line 41
    .line 42
    move-object v3, v4

    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception v1

    .line 45
    move-object v3, v4

    .line 46
    goto :goto_2

    .line 47
    :catch_0
    move-exception v1

    .line 48
    goto :goto_1

    .line 49
    :catchall_1
    move-exception v1

    .line 50
    goto :goto_2

    .line 51
    :catch_1
    move-exception v1

    .line 52
    move-object v4, v3

    .line 53
    goto :goto_1

    .line 54
    :cond_1
    :try_start_2
    const-string v1, "Settings file does not exist."

    .line 55
    .line 56
    const/4 v4, 0x2

    .line 57
    invoke-static {v2, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    if-eqz v4, :cond_2

    .line 62
    .line 63
    invoke-static {v2, v1, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 64
    .line 65
    .line 66
    :cond_2
    move-object v5, v3

    .line 67
    :goto_0
    invoke-static {v3, v0}, LR8/g;->b(Ljava/io/Closeable;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    return-object v5

    .line 71
    :goto_1
    :try_start_3
    const-string v5, "Failed to fetch cached settings"

    .line 72
    .line 73
    invoke-static {v2, v5, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 74
    .line 75
    .line 76
    invoke-static {v4, v0}, LR8/g;->b(Ljava/io/Closeable;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    return-object v3

    .line 80
    :goto_2
    invoke-static {v3, v0}, LR8/g;->b(Ljava/io/Closeable;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw v1
.end method

.method public n(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 3

    .line 1
    iget-object v0, p0, LY9/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lx/o;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lx/o;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    instance-of v2, v1, Lx/r;

    .line 13
    .line 14
    if-eqz v2, :cond_2

    .line 15
    .line 16
    check-cast v1, Lx/r;

    .line 17
    .line 18
    invoke-virtual {v1, p2}, Lx/r;->j(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    if-eqz p2, :cond_1

    .line 23
    .line 24
    invoke-virtual {v1}, Lx/r;->g()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {v0, p1}, Lx/o;->g(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    return p2

    .line 34
    :cond_2
    invoke-virtual {v1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    if-eqz p2, :cond_3

    .line 39
    .line 40
    invoke-virtual {v0, p1}, Lx/o;->g(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    const/4 p1, 0x1

    .line 44
    return p1

    .line 45
    :cond_3
    :goto_0
    const/4 p1, 0x0

    .line 46
    return p1
.end method

.method public o(Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, LY9/c;->i()Landroid/content/SharedPreferences;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, LY9/c;->i()Landroid/content/SharedPreferences;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v1, "notification_ids"

    .line 21
    .line 22
    const-string v2, ""

    .line 23
    .line 24
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-nez v3, :cond_0

    .line 33
    .line 34
    const-string v3, ","

    .line 35
    .line 36
    invoke-virtual {p1, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {v0, p1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p0}, LY9/c;->i()Landroid/content/SharedPreferences;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 57
    .line 58
    .line 59
    :cond_0
    return-void
.end method

.method public p(Ljava/lang/Object;)V
    .locals 14

    .line 1
    iget-object v0, p0, LY9/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lx/o;

    .line 4
    .line 5
    iget-object v1, v0, Lx/o;->a:[J

    .line 6
    .line 7
    array-length v2, v1

    .line 8
    add-int/lit8 v2, v2, -0x2

    .line 9
    .line 10
    if-ltz v2, :cond_5

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    move v4, v3

    .line 14
    :goto_0
    aget-wide v5, v1, v4

    .line 15
    .line 16
    not-long v7, v5

    .line 17
    const/4 v9, 0x7

    .line 18
    shl-long/2addr v7, v9

    .line 19
    and-long/2addr v7, v5

    .line 20
    const-wide v9, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    and-long/2addr v7, v9

    .line 26
    cmp-long v7, v7, v9

    .line 27
    .line 28
    if-eqz v7, :cond_4

    .line 29
    .line 30
    sub-int v7, v4, v2

    .line 31
    .line 32
    not-int v7, v7

    .line 33
    ushr-int/lit8 v7, v7, 0x1f

    .line 34
    .line 35
    const/16 v8, 0x8

    .line 36
    .line 37
    rsub-int/lit8 v7, v7, 0x8

    .line 38
    .line 39
    move v9, v3

    .line 40
    :goto_1
    if-ge v9, v7, :cond_3

    .line 41
    .line 42
    const-wide/16 v10, 0xff

    .line 43
    .line 44
    and-long/2addr v10, v5

    .line 45
    const-wide/16 v12, 0x80

    .line 46
    .line 47
    cmp-long v10, v10, v12

    .line 48
    .line 49
    if-gez v10, :cond_2

    .line 50
    .line 51
    shl-int/lit8 v10, v4, 0x3

    .line 52
    .line 53
    add-int/2addr v10, v9

    .line 54
    iget-object v11, v0, Lx/o;->b:[Ljava/lang/Object;

    .line 55
    .line 56
    aget-object v11, v11, v10

    .line 57
    .line 58
    iget-object v11, v0, Lx/o;->c:[Ljava/lang/Object;

    .line 59
    .line 60
    aget-object v11, v11, v10

    .line 61
    .line 62
    instance-of v12, v11, Lx/r;

    .line 63
    .line 64
    if-eqz v12, :cond_0

    .line 65
    .line 66
    const-string v12, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScope$lambda$3>"

    .line 67
    .line 68
    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    check-cast v11, Lx/r;

    .line 72
    .line 73
    invoke-virtual {v11, p1}, Lx/r;->j(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    invoke-virtual {v11}, Lx/r;->g()Z

    .line 77
    .line 78
    .line 79
    move-result v11

    .line 80
    goto :goto_2

    .line 81
    :cond_0
    if-ne v11, p1, :cond_1

    .line 82
    .line 83
    const/4 v11, 0x1

    .line 84
    goto :goto_2

    .line 85
    :cond_1
    move v11, v3

    .line 86
    :goto_2
    if-eqz v11, :cond_2

    .line 87
    .line 88
    invoke-virtual {v0, v10}, Lx/o;->h(I)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    :cond_2
    shr-long/2addr v5, v8

    .line 92
    add-int/lit8 v9, v9, 0x1

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_3
    if-ne v7, v8, :cond_5

    .line 96
    .line 97
    :cond_4
    if-eq v4, v2, :cond_5

    .line 98
    .line 99
    add-int/lit8 v4, v4, 0x1

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_5
    return-void
.end method

.method public q()Ljava/lang/Class;
    .locals 2

    .line 1
    iget-object v0, p0, LY9/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/ClassLoader;

    .line 4
    .line 5
    const-string v1, "java.util.function.Consumer"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "loader.loadClass(\"java.util.function.Consumer\")"

    .line 12
    .line 13
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public r()V
    .locals 5

    .line 1
    iget-object v0, p0, LY9/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LA7/x1;

    .line 4
    .line 5
    invoke-virtual {v0}, LA7/B;->c0()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, LA7/B0;->a0()LA7/Z;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget-object v2, v0, LA7/B0;->a:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, LA7/n0;

    .line 15
    .line 16
    iget-object v3, v2, LA7/n0;->n:Ln7/b;

    .line 17
    .line 18
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 22
    .line 23
    .line 24
    move-result-wide v3

    .line 25
    invoke-virtual {v1, v3, v4}, LA7/Z;->i0(J)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    invoke-virtual {v0}, LA7/B0;->a0()LA7/Z;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    iget-object v1, v1, LA7/Z;->m:LA7/X;

    .line 36
    .line 37
    const/4 v3, 0x1

    .line 38
    invoke-virtual {v1, v3}, LA7/X;->c(Z)V

    .line 39
    .line 40
    .line 41
    new-instance v1, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 42
    .line 43
    invoke-direct {v1}, Landroid/app/ActivityManager$RunningAppProcessInfo;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-static {v1}, Landroid/app/ActivityManager;->getMyMemoryState(Landroid/app/ActivityManager$RunningAppProcessInfo;)V

    .line 47
    .line 48
    .line 49
    iget v1, v1, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    .line 50
    .line 51
    const/16 v3, 0x64

    .line 52
    .line 53
    if-ne v1, v3, :cond_0

    .line 54
    .line 55
    invoke-virtual {v0}, LA7/B0;->zzj()LA7/N;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    const-string v1, "Detected application was in foreground"

    .line 60
    .line 61
    iget-object v0, v0, LA7/N;->n:LA7/P;

    .line 62
    .line 63
    invoke-virtual {v0, v1}, LA7/P;->c(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    iget-object v0, v2, LA7/n0;->n:Ln7/b;

    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 72
    .line 73
    .line 74
    move-result-wide v0

    .line 75
    invoke-virtual {p0, v0, v1}, LY9/c;->u(J)V

    .line 76
    .line 77
    .line 78
    :cond_0
    return-void
.end method

.method public s(J)V
    .locals 3

    .line 1
    iget-object v0, p0, LY9/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LA7/x1;

    .line 4
    .line 5
    invoke-virtual {v0}, LA7/B;->c0()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, LA7/x1;->k0()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, LA7/B0;->a0()LA7/Z;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1, p1, p2}, LA7/Z;->i0(J)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0}, LA7/B0;->a0()LA7/Z;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iget-object v1, v1, LA7/Z;->m:LA7/X;

    .line 26
    .line 27
    const/4 v2, 0x1

    .line 28
    invoke-virtual {v1, v2}, LA7/X;->c(Z)V

    .line 29
    .line 30
    .line 31
    iget-object v1, v0, LA7/B0;->a:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, LA7/n0;

    .line 34
    .line 35
    invoke-virtual {v1}, LA7/n0;->j()LA7/I;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1}, LA7/I;->m0()V

    .line 40
    .line 41
    .line 42
    :cond_0
    invoke-virtual {v0}, LA7/B0;->a0()LA7/Z;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    iget-object v1, v1, LA7/Z;->q:LA7/a0;

    .line 47
    .line 48
    invoke-virtual {v1, p1, p2}, LA7/a0;->f(J)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, LA7/B0;->a0()LA7/Z;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iget-object v0, v0, LA7/Z;->m:LA7/X;

    .line 56
    .line 57
    invoke-virtual {v0}, LA7/X;->d()Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_1

    .line 62
    .line 63
    invoke-virtual {p0, p1, p2}, LY9/c;->u(J)V

    .line 64
    .line 65
    .line 66
    :cond_1
    return-void
.end method

.method public t(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 4

    .line 1
    iget-object v0, p0, LY9/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LA7/n0;

    .line 4
    .line 5
    iget-object v1, v0, LA7/n0;->j:LA7/k0;

    .line 6
    .line 7
    invoke-static {v1}, LA7/n0;->d(LA7/D0;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, LA7/k0;->c0()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, LA7/n0;->e()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_3

    .line 18
    .line 19
    invoke-virtual {p2}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    const-string p1, "auto"

    .line 34
    .line 35
    :cond_1
    new-instance v1, Landroid/net/Uri$Builder;

    .line 36
    .line 37
    invoke-direct {v1}, Landroid/net/Uri$Builder;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, p1}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p2}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_2

    .line 56
    .line 57
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    check-cast v2, Ljava/lang/String;

    .line 62
    .line 63
    invoke-virtual {p2, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-virtual {v1, v2, v3}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    invoke-virtual {v1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    :goto_1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 80
    .line 81
    .line 82
    move-result p2

    .line 83
    if-nez p2, :cond_3

    .line 84
    .line 85
    iget-object p2, v0, LA7/n0;->h:LA7/Z;

    .line 86
    .line 87
    invoke-static {p2}, LA7/n0;->c(LA7/B0;)V

    .line 88
    .line 89
    .line 90
    iget-object v1, p2, LA7/Z;->x:LA7/b0;

    .line 91
    .line 92
    invoke-virtual {v1, p1}, LA7/b0;->v(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-static {p2}, LA7/n0;->c(LA7/B0;)V

    .line 96
    .line 97
    .line 98
    iget-object p1, v0, LA7/n0;->n:Ln7/b;

    .line 99
    .line 100
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 104
    .line 105
    .line 106
    move-result-wide v0

    .line 107
    iget-object p1, p2, LA7/Z;->y:LA7/a0;

    .line 108
    .line 109
    invoke-virtual {p1, v0, v1}, LA7/a0;->f(J)V

    .line 110
    .line 111
    .line 112
    :cond_3
    return-void
.end method

.method public then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, LJ8/p;

    .line 6
    .line 7
    iget-object v0, p0, LY9/c;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, LJ8/o;

    .line 10
    .line 11
    check-cast v0, LK8/e;

    .line 12
    .line 13
    iget-object v0, v0, LK8/e;->c:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v0}, Ls8/g;->f(Ljava/lang/String;)Ls8/g;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Ls8/g;)Lcom/google/firebase/auth/FirebaseAuth;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object p1, p1, LJ8/p;->a:Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iget-object v1, v0, Lcom/google/firebase/auth/FirebaseAuth;->i:Ljava/lang/String;

    .line 35
    .line 36
    if-eqz v1, :cond_0

    .line 37
    .line 38
    new-instance v2, LJ8/b;

    .line 39
    .line 40
    new-instance v3, LG6/m;

    .line 41
    .line 42
    const/4 v4, 0x1

    .line 43
    invoke-direct {v3, v4}, LG6/m;-><init>(I)V

    .line 44
    .line 45
    .line 46
    invoke-direct {v2, v3}, LJ8/b;-><init>(LG6/m;)V

    .line 47
    .line 48
    .line 49
    iput-object v1, v2, LJ8/b;->h:Ljava/lang/String;

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    const/4 v2, 0x0

    .line 53
    :goto_0
    iget-object v1, v0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/zzabj;

    .line 54
    .line 55
    iget-object v0, v0, Lcom/google/firebase/auth/FirebaseAuth;->a:Ls8/g;

    .line 56
    .line 57
    invoke-virtual {v1, v0, v2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzabj;->zza(Ls8/g;LJ8/b;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    return-object p1
.end method

.method public u(J)V
    .locals 9

    .line 1
    iget-object v0, p0, LY9/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v6, v0

    .line 4
    check-cast v6, LA7/x1;

    .line 5
    .line 6
    invoke-virtual {v6}, LA7/B;->c0()V

    .line 7
    .line 8
    .line 9
    iget-object v0, v6, LA7/B0;->a:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, LA7/n0;

    .line 12
    .line 13
    invoke-virtual {v0}, LA7/n0;->e()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    goto/16 :goto_0

    .line 20
    .line 21
    :cond_0
    invoke-virtual {v6}, LA7/B0;->a0()LA7/Z;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iget-object v1, v1, LA7/Z;->q:LA7/a0;

    .line 26
    .line 27
    invoke-virtual {v1, p1, p2}, LA7/a0;->f(J)V

    .line 28
    .line 29
    .line 30
    iget-object v0, v0, LA7/n0;->n:Ln7/b;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 36
    .line 37
    .line 38
    move-result-wide v0

    .line 39
    invoke-virtual {v6}, LA7/B0;->zzj()LA7/N;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iget-object v1, v2, LA7/N;->n:LA7/P;

    .line 48
    .line 49
    const-string v2, "Session started, time"

    .line 50
    .line 51
    invoke-virtual {v1, v2, v0}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    const-wide/16 v0, 0x3e8

    .line 55
    .line 56
    div-long v7, p1, v0

    .line 57
    .line 58
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-virtual {v6}, LA7/B;->e0()LA7/P0;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    const-string v4, "auto"

    .line 67
    .line 68
    const-string v5, "_sid"

    .line 69
    .line 70
    move-wide v1, p1

    .line 71
    invoke-virtual/range {v0 .. v5}, LA7/P0;->k0(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v6}, LA7/B0;->a0()LA7/Z;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    iget-object v0, v0, LA7/Z;->r:LA7/a0;

    .line 79
    .line 80
    invoke-virtual {v0, v7, v8}, LA7/a0;->f(J)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v6}, LA7/B0;->a0()LA7/Z;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    iget-object v0, v0, LA7/Z;->m:LA7/X;

    .line 88
    .line 89
    const/4 v1, 0x0

    .line 90
    invoke-virtual {v0, v1}, LA7/X;->c(Z)V

    .line 91
    .line 92
    .line 93
    new-instance v3, Landroid/os/Bundle;

    .line 94
    .line 95
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 96
    .line 97
    .line 98
    const-string v0, "_sid"

    .line 99
    .line 100
    invoke-virtual {v3, v0, v7, v8}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v6}, LA7/B;->e0()LA7/P0;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    const-string v1, "auto"

    .line 108
    .line 109
    const-string v2, "_s"

    .line 110
    .line 111
    move-wide v4, p1

    .line 112
    invoke-virtual/range {v0 .. v5}, LA7/P0;->v0(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v6}, LA7/B0;->a0()LA7/Z;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    iget-object v0, v0, LA7/Z;->w:LA7/b0;

    .line 120
    .line 121
    invoke-virtual {v0}, LA7/b0;->u()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    if-nez v1, :cond_1

    .line 130
    .line 131
    const-string v1, "_ffr"

    .line 132
    .line 133
    invoke-static {v1, v0}, Lka/n;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    invoke-virtual {v6}, LA7/B;->e0()LA7/P0;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    const-string v1, "auto"

    .line 142
    .line 143
    const-string v2, "_ssr"

    .line 144
    .line 145
    move-wide v4, p1

    .line 146
    invoke-virtual/range {v0 .. v5}, LA7/P0;->v0(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V

    .line 147
    .line 148
    .line 149
    :cond_1
    :goto_0
    return-void
.end method

.method public v()Z
    .locals 4

    .line 1
    iget-object v0, p0, LY9/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LA7/n0;

    .line 4
    .line 5
    iget-object v0, v0, LA7/n0;->h:LA7/Z;

    .line 6
    .line 7
    invoke-static {v0}, LA7/n0;->c(LA7/B0;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, v0, LA7/Z;->y:LA7/a0;

    .line 11
    .line 12
    invoke-virtual {v0}, LA7/a0;->d()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    const-wide/16 v2, 0x0

    .line 17
    .line 18
    cmp-long v0, v0, v2

    .line 19
    .line 20
    if-lez v0, :cond_0

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    return v0

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    return v0
.end method

.method public w()Z
    .locals 5

    .line 1
    invoke-virtual {p0}, LY9/c;->v()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, LY9/c;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, LA7/n0;

    .line 11
    .line 12
    iget-object v1, v0, LA7/n0;->n:Ln7/b;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 18
    .line 19
    .line 20
    move-result-wide v1

    .line 21
    iget-object v3, v0, LA7/n0;->h:LA7/Z;

    .line 22
    .line 23
    invoke-static {v3}, LA7/n0;->c(LA7/B0;)V

    .line 24
    .line 25
    .line 26
    iget-object v3, v3, LA7/Z;->y:LA7/a0;

    .line 27
    .line 28
    invoke-virtual {v3}, LA7/a0;->d()J

    .line 29
    .line 30
    .line 31
    move-result-wide v3

    .line 32
    sub-long/2addr v1, v3

    .line 33
    const/4 v3, 0x0

    .line 34
    sget-object v4, LA7/y;->W:LA7/D;

    .line 35
    .line 36
    iget-object v0, v0, LA7/n0;->g:LA7/e;

    .line 37
    .line 38
    invoke-virtual {v0, v3, v4}, LA7/e;->j0(Ljava/lang/String;LA7/D;)J

    .line 39
    .line 40
    .line 41
    move-result-wide v3

    .line 42
    cmp-long v0, v1, v3

    .line 43
    .line 44
    if-lez v0, :cond_1

    .line 45
    .line 46
    const/4 v0, 0x1

    .line 47
    return v0

    .line 48
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 49
    return v0
.end method

.method public zza(Lcom/google/android/gms/internal/measurement/zzs;Ljava/lang/String;Ljava/util/List;ZZ)V
    .locals 4

    .line 22
    sget-object v0, LA7/j0;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    iget-object v3, p0, LY9/c;->b:Ljava/lang/Object;

    check-cast v3, LA7/f0;

    if-eq p1, v2, :cond_7

    if-eq p1, v1, :cond_4

    if-eq p1, v0, :cond_1

    const/4 p4, 0x4

    if-eq p1, p4, :cond_0

    .line 23
    invoke-virtual {v3}, LA7/B0;->zzj()LA7/N;

    move-result-object p1

    iget-object p1, p1, LA7/N;->l:LA7/P;

    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {v3}, LA7/B0;->zzj()LA7/N;

    move-result-object p1

    .line 25
    iget-object p1, p1, LA7/N;->n:LA7/P;

    goto :goto_0

    :cond_1
    if-eqz p4, :cond_2

    .line 26
    invoke-virtual {v3}, LA7/B0;->zzj()LA7/N;

    move-result-object p1

    iget-object p1, p1, LA7/N;->j:LA7/P;

    goto :goto_0

    :cond_2
    if-nez p5, :cond_3

    .line 27
    invoke-virtual {v3}, LA7/B0;->zzj()LA7/N;

    move-result-object p1

    iget-object p1, p1, LA7/N;->k:LA7/P;

    goto :goto_0

    .line 28
    :cond_3
    invoke-virtual {v3}, LA7/B0;->zzj()LA7/N;

    move-result-object p1

    .line 29
    iget-object p1, p1, LA7/N;->i:LA7/P;

    goto :goto_0

    :cond_4
    if-eqz p4, :cond_5

    .line 30
    invoke-virtual {v3}, LA7/B0;->zzj()LA7/N;

    move-result-object p1

    iget-object p1, p1, LA7/N;->g:LA7/P;

    goto :goto_0

    :cond_5
    if-nez p5, :cond_6

    .line 31
    invoke-virtual {v3}, LA7/B0;->zzj()LA7/N;

    move-result-object p1

    iget-object p1, p1, LA7/N;->h:LA7/P;

    goto :goto_0

    .line 32
    :cond_6
    invoke-virtual {v3}, LA7/B0;->zzj()LA7/N;

    move-result-object p1

    .line 33
    iget-object p1, p1, LA7/N;->f:LA7/P;

    goto :goto_0

    .line 34
    :cond_7
    invoke-virtual {v3}, LA7/B0;->zzj()LA7/N;

    move-result-object p1

    .line 35
    iget-object p1, p1, LA7/N;->m:LA7/P;

    .line 36
    :goto_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p4

    const/4 p5, 0x0

    if-eq p4, v2, :cond_a

    if-eq p4, v1, :cond_9

    if-eq p4, v0, :cond_8

    .line 37
    invoke-virtual {p1, p2}, LA7/P;->c(Ljava/lang/String;)V

    return-void

    .line 38
    :cond_8
    invoke-interface {p3, p5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p4

    invoke-interface {p3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p5

    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {p1, p4, p5, p3, p2}, LA7/P;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    return-void

    .line 39
    :cond_9
    invoke-interface {p3, p5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p4

    invoke-interface {p3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {p1, p4, p2, p3}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    .line 40
    :cond_a
    invoke-interface {p3, p5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public zza(Ljava/lang/Throwable;)V
    .locals 10

    const/4 v0, 0x6

    .line 1
    sget-object v1, LC6/n;->D:LC6/n;

    iget-object v1, v1, LC6/n;->h:Lcom/google/android/gms/internal/ads/zzcfk;

    .line 2
    const-string v2, "SignalGeneratorImpl.initializeWebViewForSignalCollection"

    invoke-virtual {v1, p1, v2}, Lcom/google/android/gms/internal/ads/zzcfk;->zzh(Ljava/lang/Throwable;Ljava/lang/String;)V

    new-instance v1, Landroid/util/Pair;

    .line 3
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    const-string v3, "sgf_reason"

    invoke-direct {v1, v3, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Landroid/util/Pair;

    const-string v3, "se"

    const-string v4, "query_g"

    invoke-direct {v2, v3, v4}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Landroid/util/Pair;

    .line 4
    const-string v4, "BANNER"

    const-string v5, "ad_format"

    invoke-direct {v3, v5, v4}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v4, Landroid/util/Pair;

    .line 5
    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, "rtype"

    invoke-direct {v4, v6, v5}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, Landroid/util/Pair;

    const-string v6, "scar"

    const-string v7, "true"

    invoke-direct {v5, v6, v7}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v6, Landroid/util/Pair;

    .line 6
    iget-object v7, p0, LY9/c;->b:Ljava/lang/Object;

    check-cast v7, LN6/j;

    iget-object v8, v7, LN6/j;->C:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 7
    invoke-virtual {v8}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v8

    const-string v9, "sgi_rn"

    invoke-direct {v6, v9, v8}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-array v0, v0, [Landroid/util/Pair;

    const/4 v8, 0x0

    aput-object v1, v0, v8

    const/4 v1, 0x1

    aput-object v2, v0, v1

    const/4 v1, 0x2

    aput-object v3, v0, v1

    const/4 v1, 0x3

    aput-object v4, v0, v1

    const/4 v1, 0x4

    aput-object v5, v0, v1

    const/4 v1, 0x5

    aput-object v6, v0, v1

    const-string v1, "sgf"

    .line 8
    iget-object v2, v7, LN6/j;->k:Lcom/google/android/gms/internal/ads/zzdzy;

    invoke-static {v2, v1, v0}, Lp7/b;->a0(Lcom/google/android/gms/internal/ads/zzdzy;Ljava/lang/String;[Landroid/util/Pair;)V

    .line 9
    sget v0, LG6/L;->b:I

    const-string v0, "Failed to initialize webview for loading SDKCore. "

    .line 10
    invoke-static {v0, p1}, LH6/l;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 11
    sget-object p1, Lcom/google/android/gms/internal/ads/zzbix;->zzlp:Lcom/google/android/gms/internal/ads/zzbio;

    .line 12
    sget-object v0, LD6/s;->e:LD6/s;

    iget-object v1, v0, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 13
    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    move-result-object p1

    .line 14
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 15
    iget-object p1, v7, LN6/j;->B:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 16
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    if-nez p1, :cond_0

    .line 17
    iget-object p1, v7, LN6/j;->C:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 18
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result p1

    sget-object v1, Lcom/google/android/gms/internal/ads/zzbix;->zzlq:Lcom/google/android/gms/internal/ads/zzbio;

    .line 19
    iget-object v0, v0, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    move-result-object v0

    .line 20
    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 21
    invoke-virtual {v7}, LN6/j;->U()V

    :cond_0
    return-void
.end method

.method public zzb(Ljava/lang/Object;)V
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    check-cast p1, LN6/s;

    .line 3
    .line 4
    sget p1, LG6/L;->b:I

    .line 5
    .line 6
    const-string p1, "Initialized webview successfully for SDKCore."

    .line 7
    .line 8
    invoke-static {p1}, LH6/l;->a(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object p1, Lcom/google/android/gms/internal/ads/zzbix;->zzlp:Lcom/google/android/gms/internal/ads/zzbio;

    .line 12
    .line 13
    sget-object v1, LD6/s;->e:LD6/s;

    .line 14
    .line 15
    iget-object v1, v1, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 16
    .line 17
    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    new-instance p1, Landroid/util/Pair;

    .line 30
    .line 31
    const-string v1, "se"

    .line 32
    .line 33
    const-string v2, "query_g"

    .line 34
    .line 35
    invoke-direct {p1, v1, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    new-instance v1, Landroid/util/Pair;

    .line 39
    .line 40
    const-string v2, "BANNER"

    .line 41
    .line 42
    const-string v3, "ad_format"

    .line 43
    .line 44
    invoke-direct {v1, v3, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    new-instance v2, Landroid/util/Pair;

    .line 48
    .line 49
    const/4 v3, 0x6

    .line 50
    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    const-string v4, "rtype"

    .line 55
    .line 56
    invoke-direct {v2, v4, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    new-instance v3, Landroid/util/Pair;

    .line 60
    .line 61
    const-string v4, "scar"

    .line 62
    .line 63
    const-string v5, "true"

    .line 64
    .line 65
    invoke-direct {v3, v4, v5}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    new-instance v4, Landroid/util/Pair;

    .line 69
    .line 70
    iget-object v5, p0, LY9/c;->b:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v5, LN6/j;

    .line 73
    .line 74
    iget-object v6, v5, LN6/j;->C:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 75
    .line 76
    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 77
    .line 78
    .line 79
    move-result v6

    .line 80
    invoke-static {v6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    const-string v7, "sgi_rn"

    .line 85
    .line 86
    invoke-direct {v4, v7, v6}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    const/4 v6, 0x5

    .line 90
    new-array v6, v6, [Landroid/util/Pair;

    .line 91
    .line 92
    const/4 v7, 0x0

    .line 93
    aput-object p1, v6, v7

    .line 94
    .line 95
    aput-object v1, v6, v0

    .line 96
    .line 97
    const/4 p1, 0x2

    .line 98
    aput-object v2, v6, p1

    .line 99
    .line 100
    const/4 p1, 0x3

    .line 101
    aput-object v3, v6, p1

    .line 102
    .line 103
    const/4 p1, 0x4

    .line 104
    aput-object v4, v6, p1

    .line 105
    .line 106
    const-string p1, "sgs"

    .line 107
    .line 108
    iget-object v1, v5, LN6/j;->k:Lcom/google/android/gms/internal/ads/zzdzy;

    .line 109
    .line 110
    invoke-static {v1, p1, v6}, Lp7/b;->a0(Lcom/google/android/gms/internal/ads/zzdzy;Ljava/lang/String;[Landroid/util/Pair;)V

    .line 111
    .line 112
    .line 113
    iget-object p1, v5, LN6/j;->B:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 114
    .line 115
    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 116
    .line 117
    .line 118
    :cond_0
    return-void
.end method
