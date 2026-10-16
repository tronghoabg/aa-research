.class public final Lza/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA7/C;
.implements LC5/a;
.implements Lcom/google/android/gms/internal/mlkit_vision_text_common/zzu;
.implements LI4/q;
.implements LK6/b;
.implements LLe/c;
.implements LR4/i;
.implements LT8/c;
.implements LVa/rb;


# instance fields
.field public final synthetic a:I


# direct methods
.method public constructor <init>()V
    .locals 1

    const/16 v0, 0x16

    iput v0, p0, Lza/a;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    sget-object v0, Ll8/K;->b:Ll8/I;

    .line 4
    sget-object v0, Ll8/e0;->e:Ll8/e0;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lza/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(LP7/c;LP7/c;)V
    .locals 1

    const/16 v0, 0x18

    iput v0, p0, Lza/a;->a:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    cmpg-float p1, v0, p1

    if-gtz p1, :cond_0

    return-void

    .line 7
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public static synthetic g(Lza/a;Lkotlin/reflect/KClass;)V
    .locals 1

    .line 1
    sget-object v0, Lff/v;->a:Lff/v;

    .line 2
    .line 3
    invoke-virtual {p0, p1, v0}, Lza/a;->f(Lkotlin/reflect/KClass;Ljava/util/List;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .line 1
    return-void
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    return-object p1
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public c()J
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public d(LI4/v;)LI4/p;
    .locals 3

    .line 1
    new-instance v0, LJ4/b;

    .line 2
    .line 3
    const-class v1, LI4/f;

    .line 4
    .line 5
    const-class v2, Ljava/io/InputStream;

    .line 6
    .line 7
    invoke-virtual {p1, v1, v2}, LI4/v;->b(Ljava/lang/Class;Ljava/lang/Class;)LI4/p;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {v0, p1}, LJ4/b;-><init>(LI4/p;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public e(JLjava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public f(Lkotlin/reflect/KClass;Ljava/util/List;)V
    .locals 1

    .line 1
    const-string v0, "kClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "typeArgumentsSerializers"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public n(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Object;
    .locals 6

    .line 1
    new-instance v0, LVa/c8;

    .line 2
    .line 3
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    shr-int/lit8 p2, p2, 0x10

    .line 15
    .line 16
    add-int/lit8 p2, p2, 0xa

    .line 17
    .line 18
    const-string v1, ""

    .line 19
    .line 20
    invoke-static {v1}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    add-int/lit16 v2, v2, 0xd3

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-static {v3}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    rsub-int/lit8 v3, v3, 0x1

    .line 32
    .line 33
    const-string v4, "\u0007\ufffe\ufffb\uffff\u000c\u0002\uffee\u0008\u0003\ufffb"

    .line 34
    .line 35
    invoke-static {p2, v2, v3, v4}, LVa/c8;->a(IIILjava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    iput-boolean p2, v0, LVa/c8;->a:Z

    .line 48
    .line 49
    invoke-static {v1}, Landroid/os/Process;->getGidForName(Ljava/lang/String;)I

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    rsub-int/lit8 p2, p2, 0x8

    .line 54
    .line 55
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    .line 56
    .line 57
    .line 58
    move-result-wide v2

    .line 59
    const-wide/16 v4, -0x1

    .line 60
    .line 61
    cmp-long v2, v2, v4

    .line 62
    .line 63
    add-int/lit16 v2, v2, 0xd1

    .line 64
    .line 65
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    shr-int/lit8 v3, v3, 0x10

    .line 70
    .line 71
    rsub-int/lit8 v3, v3, 0x3

    .line 72
    .line 73
    const-string v4, "\u000e\u0000\ufffb\u0008\u0003\ufffb\uffe7\u000c\uffff"

    .line 74
    .line 75
    invoke-static {p2, v2, v3, v4}, LVa/c8;->a(IIILjava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 84
    .line 85
    .line 86
    move-result p2

    .line 87
    iput-boolean p2, v0, LVa/c8;->b:Z

    .line 88
    .line 89
    invoke-static {v1}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    move-result p2

    .line 93
    add-int/lit8 p2, p2, 0x6

    .line 94
    .line 95
    invoke-static {v1}, Landroid/os/Process;->getGidForName(Ljava/lang/String;)I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    add-int/lit16 v1, v1, 0xd7

    .line 100
    .line 101
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    shr-int/lit8 v2, v2, 0x8

    .line 106
    .line 107
    add-int/lit8 v2, v2, 0x6

    .line 108
    .line 109
    const-string v3, "\ufffa\u0005\ufffe\n\ufffb\u0003"

    .line 110
    .line 111
    invoke-static {p2, v1, v2, v3}, LVa/c8;->a(IIILjava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p2

    .line 119
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-static {p1}, LVa/t8;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    iput-object p1, v0, LVa/c8;->c:Ljava/lang/String;

    .line 128
    .line 129
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Lza/a;->a:I

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
    const-string v0, "IdentityFunction"

    .line 12
    .line 13
    return-object v0

    .line 14
    nop

    .line 15
    :pswitch_data_0
    .packed-switch 0x17
        :pswitch_0
    .end packed-switch
.end method

.method public zza()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lza/a;->a:I

    packed-switch v0, :pswitch_data_0

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpu;->zzf()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 3
    :pswitch_0
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzny;->zzc()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 4
    :pswitch_1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpi;->zza()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 5
    :pswitch_2
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzng;->zzaz()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 6
    :pswitch_3
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzng;->zzq()J

    move-result-wide v0

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    .line 7
    :pswitch_4
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzng;->zzl()J

    move-result-wide v0

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    .line 8
    :pswitch_5
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzng;->zzh()J

    move-result-wide v0

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    .line 9
    :pswitch_6
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzng;->zzac()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    .line 10
    :pswitch_7
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzng;->zzab()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    .line 11
    :pswitch_8
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzng;->zzah()J

    move-result-wide v0

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    .line 12
    :pswitch_9
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzng;->zzai()J

    move-result-wide v0

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    .line 13
    :pswitch_a
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zznx;->zzb()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 14
    :pswitch_b
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpn;->zze()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
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
    .locals 0

    check-cast p1, LCa/e;

    .line 1
    invoke-virtual {p1}, LCa/d;->p()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
