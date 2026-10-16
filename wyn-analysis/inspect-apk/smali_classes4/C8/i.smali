.class public final LC8/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LL8/e;
.implements Lcom/google/android/gms/internal/ads/zzhcc;
.implements LP2/d;
.implements Lh6/f;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    iput p1, p0, LC8/i;->a:I

    sparse-switch p1, :sswitch_data_0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 26
    iput-object p1, p0, LC8/i;->b:Ljava/lang/Object;

    .line 27
    iput-object p1, p0, LC8/i;->c:Ljava/lang/Object;

    .line 28
    iput-object p1, p0, LC8/i;->d:Ljava/lang/Object;

    .line 29
    iput-object p1, p0, LC8/i;->e:Ljava/lang/Object;

    .line 30
    iput-object p1, p0, LC8/i;->f:Ljava/lang/Object;

    return-void

    .line 31
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LC8/i;->b:Ljava/lang/Object;

    .line 33
    new-instance p1, Li0/A;

    invoke-direct {p1}, Li0/A;-><init>()V

    iput-object p1, p0, LC8/i;->c:Ljava/lang/Object;

    .line 34
    new-instance p1, Li0/A;

    invoke-direct {p1}, Li0/A;-><init>()V

    iput-object p1, p0, LC8/i;->d:Ljava/lang/Object;

    .line 35
    new-instance p1, Li0/A;

    invoke-direct {p1}, Li0/A;-><init>()V

    iput-object p1, p0, LC8/i;->e:Ljava/lang/Object;

    .line 36
    new-instance p1, Li0/A;

    invoke-direct {p1}, Li0/A;-><init>()V

    iput-object p1, p0, LC8/i;->f:Ljava/lang/Object;

    return-void

    .line 37
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    new-instance p1, LCd/u;

    const/16 v0, 0x1a

    invoke-direct {p1, v0}, LCd/u;-><init>(I)V

    invoke-static {p1}, LFe/c;->z(Ltf/a;)Lef/p;

    move-result-object p1

    iput-object p1, p0, LC8/i;->b:Ljava/lang/Object;

    .line 39
    new-instance p1, LCd/u;

    const/16 v0, 0x1b

    invoke-direct {p1, v0}, LCd/u;-><init>(I)V

    invoke-static {p1}, LFe/c;->z(Ltf/a;)Lef/p;

    move-result-object p1

    iput-object p1, p0, LC8/i;->c:Ljava/lang/Object;

    .line 40
    new-instance p1, LCd/u;

    const/16 v0, 0x1c

    invoke-direct {p1, v0}, LCd/u;-><init>(I)V

    invoke-static {p1}, LFe/c;->z(Ltf/a;)Lef/p;

    move-result-object p1

    .line 41
    new-instance v0, LCd/u;

    const/16 v1, 0x1d

    invoke-direct {v0, v1}, LCd/u;-><init>(I)V

    invoke-static {v0}, LFe/c;->z(Ltf/a;)Lef/p;

    move-result-object v0

    iput-object v0, p0, LC8/i;->d:Ljava/lang/Object;

    .line 42
    invoke-virtual {p1}, Lef/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 43
    invoke-static {v0}, Ljavax/crypto/KeyGenerator;->getInstance(Ljava/lang/String;)Ljavax/crypto/KeyGenerator;

    move-result-object v0

    const/16 v1, 0x100

    .line 44
    invoke-virtual {v0, v1}, Ljavax/crypto/KeyGenerator;->init(I)V

    .line 45
    invoke-virtual {v0}, Ljavax/crypto/KeyGenerator;->generateKey()Ljavax/crypto/SecretKey;

    move-result-object v0

    invoke-interface {v0}, Ljava/security/Key;->getEncoded()[B

    move-result-object v0

    .line 46
    new-instance v1, Ljavax/crypto/spec/SecretKeySpec;

    .line 47
    invoke-virtual {p1}, Lef/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 48
    invoke-direct {v1, v0, p1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 49
    iput-object v1, p0, LC8/i;->e:Ljava/lang/Object;

    .line 50
    new-instance p1, Lcom/moloco/sdk/internal/services/encryption/a;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Lcom/moloco/sdk/internal/services/encryption/a;-><init>(I)V

    invoke-static {p1}, LFe/c;->z(Ltf/a;)Lef/p;

    move-result-object p1

    iput-object p1, p0, LC8/i;->f:Ljava/lang/Object;

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x9 -> :sswitch_1
        0xd -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 1
    iput p1, p0, LC8/i;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(LJ5/i;)V
    .locals 1

    const/16 v0, 0xb

    iput v0, p0, LC8/i;->a:I

    .line 131
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 132
    iput-object p1, p0, LC8/i;->b:Ljava/lang/Object;

    .line 133
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, LC8/i;->c:Ljava/lang/Object;

    .line 134
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, LC8/i;->d:Ljava/lang/Object;

    .line 135
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, LC8/i;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LKd/a;Lcom/moloco/sdk/internal/services/k;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x7

    iput v0, p0, LC8/i;->a:I

    const-string v0, "timeProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, LC8/i;->b:Ljava/lang/Object;

    .line 12
    iput-object p2, p0, LC8/i;->d:Ljava/lang/Object;

    .line 13
    iput-object p3, p0, LC8/i;->c:Ljava/lang/Object;

    .line 14
    new-instance p1, Ljava/text/SimpleDateFormat;

    const-string p2, "HH:mm:ss"

    invoke-direct {p1, p2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, LC8/i;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LN6/j;Lp8/p;Lcom/google/android/gms/internal/ads/zzcex;Lcom/google/android/gms/internal/ads/zzceq;Lcom/google/android/gms/internal/ads/zzfqg;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LC8/i;->a:I

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LC8/i;->b:Ljava/lang/Object;

    iput-object p3, p0, LC8/i;->c:Ljava/lang/Object;

    iput-object p4, p0, LC8/i;->d:Ljava/lang/Object;

    iput-object p5, p0, LC8/i;->e:Ljava/lang/Object;

    iput-object p1, p0, LC8/i;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LV2/c;Ljava/util/HashMap;Ljava/util/HashMap;Ljava/util/HashMap;)V
    .locals 2

    const/4 v0, 0x4

    iput v0, p0, LC8/i;->a:I

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    iput-object p1, p0, LC8/i;->b:Ljava/lang/Object;

    .line 73
    iput-object p3, p0, LC8/i;->e:Ljava/lang/Object;

    .line 74
    iput-object p4, p0, LC8/i;->f:Ljava/lang/Object;

    .line 75
    invoke-static {p2}, Lj$/util/DesugarCollections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p2

    iput-object p2, p0, LC8/i;->d:Ljava/lang/Object;

    .line 76
    new-instance p2, Ljava/util/TreeSet;

    invoke-direct {p2}, Ljava/util/TreeSet;-><init>()V

    const/4 p3, 0x0

    .line 77
    invoke-virtual {p1, p2, p3}, LV2/c;->d(Ljava/util/TreeSet;Z)V

    .line 78
    invoke-virtual {p2}, Ljava/util/TreeSet;->size()I

    move-result p1

    new-array p1, p1, [J

    .line 79
    invoke-virtual {p2}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/Long;

    invoke-virtual {p4}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    add-int/lit8 p4, p3, 0x1

    .line 80
    aput-wide v0, p1, p3

    move p3, p4

    goto :goto_0

    .line 81
    :cond_0
    iput-object p1, p0, LC8/i;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LX3/b;)V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, LC8/i;->a:I

    .line 125
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 126
    iget-object v0, p1, LX3/b;->a:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lff/o;->U0(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, LC8/i;->b:Ljava/lang/Object;

    .line 127
    iget-object v0, p1, LX3/b;->b:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lff/o;->U0(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, LC8/i;->c:Ljava/lang/Object;

    .line 128
    iget-object v0, p1, LX3/b;->c:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lff/o;->U0(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, LC8/i;->d:Ljava/lang/Object;

    .line 129
    iget-object v0, p1, LX3/b;->d:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lff/o;->U0(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, LC8/i;->e:Ljava/lang/Object;

    .line 130
    iget-object p1, p1, LX3/b;->e:Ljava/util/List;

    check-cast p1, Ljava/util/Collection;

    invoke-static {p1}, Lff/o;->U0(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, LC8/i;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La2/v;Ljava/util/Locale;LC8/i;)V
    .locals 1

    const/16 v0, 0x15

    iput v0, p0, LC8/i;->a:I

    const-string v0, "localStorage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "locale"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    iput-object p1, p0, LC8/i;->b:Ljava/lang/Object;

    .line 53
    iput-object p2, p0, LC8/i;->c:Ljava/lang/Object;

    .line 54
    iput-object p3, p0, LC8/i;->d:Ljava/lang/Object;

    .line 55
    new-instance p1, Lwe/a;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lwe/a;-><init>(LC8/i;I)V

    invoke-static {p1}, LFe/c;->z(Ltf/a;)Lef/p;

    move-result-object p1

    iput-object p1, p0, LC8/i;->e:Ljava/lang/Object;

    .line 56
    new-instance p1, Lwe/a;

    const/4 p2, 0x1

    invoke-direct {p1, p0, p2}, Lwe/a;-><init>(LC8/i;I)V

    invoke-static {p1}, LFe/c;->z(Ltf/a;)Lef/p;

    move-result-object p1

    iput-object p1, p0, LC8/i;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LA7/b0;)V
    .locals 2

    const/4 v0, 0x3

    iput v0, p0, LC8/i;->a:I

    .line 93
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 94
    new-instance v0, LQb/a;

    invoke-direct {v0, p0}, LQb/a;-><init>(LC8/i;)V

    iput-object v0, p0, LC8/i;->f:Ljava/lang/Object;

    .line 95
    iput-object p1, p0, LC8/i;->b:Ljava/lang/Object;

    .line 96
    iput-object p2, p0, LC8/i;->c:Ljava/lang/Object;

    .line 97
    sget p2, Lx7/o;->a:I

    .line 98
    new-instance p2, Lcom/google/android/gms/internal/location/zzbi;

    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/location/zzbi;-><init>(Landroid/content/Context;)V

    .line 99
    iput-object p2, p0, LC8/i;->d:Ljava/lang/Object;

    .line 100
    invoke-static {}, Lcom/google/android/gms/location/LocationRequest;->V()Lcom/google/android/gms/location/LocationRequest;

    move-result-object p1

    iput-object p1, p0, LC8/i;->e:Ljava/lang/Object;

    const/16 p2, 0x64

    .line 101
    invoke-static {p2}, Lx7/z;->b(I)V

    iput p2, p1, Lcom/google/android/gms/location/LocationRequest;->a:I

    .line 102
    iget-object p1, p0, LC8/i;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/android/gms/location/LocationRequest;

    const-wide/16 v0, 0x2710

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/location/LocationRequest;->X(J)V

    .line 103
    iget-object p1, p0, LC8/i;->e:Ljava/lang/Object;

    check-cast p1, Lcom/google/android/gms/location/LocationRequest;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide/16 v0, 0x1388

    .line 104
    iput-wide v0, p1, Lcom/google/android/gms/location/LocationRequest;->c:J

    return-void
.end method

.method public constructor <init>(Landroid/content/SharedPreferences;Ljava/util/concurrent/ScheduledThreadPoolExecutor;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, LC8/i;->a:I

    .line 105
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 106
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, LC8/i;->e:Ljava/lang/Object;

    .line 107
    iput-object p1, p0, LC8/i;->b:Ljava/lang/Object;

    .line 108
    const-string p1, "topic_operation_queue"

    iput-object p1, p0, LC8/i;->c:Ljava/lang/Object;

    .line 109
    const-string p1, ","

    iput-object p1, p0, LC8/i;->d:Ljava/lang/Object;

    .line 110
    iput-object p2, p0, LC8/i;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lb7/k;)V
    .locals 2

    const/16 v0, 0x10

    iput v0, p0, LC8/i;->a:I

    .line 2
    iget-object v0, p1, Lb7/k;->b:Ljava/lang/Object;

    check-cast v0, Lre/d;

    iget-object v1, p1, Lb7/k;->c:Ljava/lang/Object;

    check-cast v1, Lk3/p;

    iget-object p1, p1, Lb7/k;->d:Ljava/lang/Object;

    check-cast p1, Lre/a;

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object v0, p0, LC8/i;->b:Ljava/lang/Object;

    .line 5
    iput-object v1, p0, LC8/i;->c:Ljava/lang/Object;

    .line 6
    iput-object p1, p0, LC8/i;->d:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, LC8/i;->e:Ljava/lang/Object;

    .line 8
    iput-object p1, p0, LC8/i;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/moloco/sdk/internal/services/events/c;Ljava/util/List;Ljava/util/ArrayList;)V
    .locals 3

    const/16 v0, 0xa

    iput v0, p0, LC8/i;->a:I

    .line 16
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/s;

    invoke-direct {v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/s;-><init>()V

    .line 17
    invoke-static {}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/M0;->a()Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/L0;

    move-result-object v1

    .line 18
    const-string v2, "customUserEventBuilderService"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "vastTracker"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, LC8/i;->b:Ljava/lang/Object;

    .line 21
    iput-object p2, p0, LC8/i;->c:Ljava/lang/Object;

    .line 22
    iput-object p3, p0, LC8/i;->d:Ljava/lang/Object;

    .line 23
    iput-object v0, p0, LC8/i;->e:Ljava/lang/Object;

    .line 24
    iput-object v1, p0, LC8/i;->f:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 9
    iput p6, p0, LC8/i;->a:I

    iput-object p1, p0, LC8/i;->b:Ljava/lang/Object;

    iput-object p2, p0, LC8/i;->c:Ljava/lang/Object;

    iput-object p3, p0, LC8/i;->d:Ljava/lang/Object;

    iput-object p4, p0, LC8/i;->e:Ljava/lang/Object;

    iput-object p5, p0, LC8/i;->f:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lo6/d;Ljava/util/HashMap;Ljava/util/HashMap;Ljava/util/HashMap;)V
    .locals 2

    const/16 v0, 0xf

    iput v0, p0, LC8/i;->a:I

    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 83
    iput-object p1, p0, LC8/i;->b:Ljava/lang/Object;

    .line 84
    iput-object p3, p0, LC8/i;->e:Ljava/lang/Object;

    .line 85
    iput-object p4, p0, LC8/i;->f:Ljava/lang/Object;

    .line 86
    invoke-static {p2}, Lj$/util/DesugarCollections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p2

    iput-object p2, p0, LC8/i;->d:Ljava/lang/Object;

    .line 87
    new-instance p2, Ljava/util/TreeSet;

    invoke-direct {p2}, Ljava/util/TreeSet;-><init>()V

    const/4 p3, 0x0

    .line 88
    invoke-virtual {p1, p2, p3}, Lo6/d;->d(Ljava/util/TreeSet;Z)V

    .line 89
    invoke-virtual {p2}, Ljava/util/TreeSet;->size()I

    move-result p1

    new-array p1, p1, [J

    .line 90
    invoke-virtual {p2}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/Long;

    invoke-virtual {p4}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    add-int/lit8 p4, p3, 0x1

    .line 91
    aput-wide v0, p1, p3

    move p3, p4

    goto :goto_0

    .line 92
    :cond_0
    iput-object p1, p0, LC8/i;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ls8/g;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, LC8/i;->a:I

    .line 111
    invoke-virtual {p1}, Ls8/g;->a()V

    .line 112
    invoke-virtual {p1}, Ls8/g;->a()V

    .line 113
    const-class v0, LC8/f;

    invoke-virtual {p1, v0}, Ls8/g;->c(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LC8/f;

    .line 114
    iget-object v0, v0, LC8/f;->b:LO9/b;

    .line 115
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 116
    iget-object v1, p1, Ls8/g;->a:Landroid/content/Context;

    invoke-static {v1}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 117
    iget-object p1, p1, Ls8/g;->c:Ls8/l;

    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 118
    invoke-static {v0}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 119
    iput-object v1, p0, LC8/i;->b:Ljava/lang/Object;

    .line 120
    iget-object v1, p1, Ls8/l;->a:Ljava/lang/String;

    iput-object v1, p0, LC8/i;->c:Ljava/lang/Object;

    .line 121
    iget-object v1, p1, Ls8/l;->b:Ljava/lang/String;

    iput-object v1, p0, LC8/i;->d:Ljava/lang/Object;

    .line 122
    iget-object p1, p1, Ls8/l;->g:Ljava/lang/String;

    iput-object p1, p0, LC8/i;->e:Ljava/lang/Object;

    if-eqz p1, :cond_0

    .line 123
    iput-object v0, p0, LC8/i;->f:Ljava/lang/Object;

    return-void

    .line 124
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "FirebaseOptions#getProjectId cannot be null."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Luc/f;Landroid/content/Context;Lkd/q;)V
    .locals 2

    const/16 v0, 0xe

    iput v0, p0, LC8/i;->a:I

    .line 57
    const-string v0, "binaryMessenger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC8/i;->c:Ljava/lang/Object;

    .line 59
    new-instance v0, Lkd/f;

    invoke-direct {v0, p1}, Lkd/f;-><init>(Luc/f;)V

    .line 60
    new-instance p1, Lcom/google/android/gms/ads/nativead/l;

    const/16 v1, 0x8

    invoke-direct {p1, v0, v1}, Lcom/google/android/gms/ads/nativead/l;-><init>(Ljava/lang/Object;I)V

    .line 61
    new-instance v0, Lkd/d;

    invoke-direct {v0, p1}, Lkd/d;-><init>(Lcom/google/android/gms/ads/nativead/l;)V

    .line 62
    iput-object v0, p0, LC8/i;->d:Ljava/lang/Object;

    .line 63
    iput-object p2, p0, LC8/i;->b:Ljava/lang/Object;

    .line 64
    iput-object p3, p0, LC8/i;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lv6/l;Lad/r;LC8/i;Lab/b;La9/b;)V
    .locals 1

    const/16 v0, 0x12

    iput v0, p0, LC8/i;->a:I

    const-string v0, "delayCalculator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorMapper"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    iput-object p1, p0, LC8/i;->b:Ljava/lang/Object;

    .line 67
    iput-object p2, p0, LC8/i;->c:Ljava/lang/Object;

    .line 68
    iput-object p3, p0, LC8/i;->d:Ljava/lang/Object;

    .line 69
    iput-object p4, p0, LC8/i;->e:Ljava/lang/Object;

    .line 70
    iput-object p5, p0, LC8/i;->f:Ljava/lang/Object;

    return-void
.end method

.method public static l(Landroid/content/SharedPreferences;Ljava/util/concurrent/ScheduledThreadPoolExecutor;)LC8/i;
    .locals 5

    .line 1
    new-instance v0, LC8/i;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, LC8/i;-><init>(Landroid/content/SharedPreferences;Ljava/util/concurrent/ScheduledThreadPoolExecutor;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, v0, LC8/i;->e:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Ljava/util/ArrayDeque;

    .line 9
    .line 10
    monitor-enter p0

    .line 11
    :try_start_0
    iget-object p1, v0, LC8/i;->e:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Ljava/util/ArrayDeque;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    .line 16
    .line 17
    .line 18
    iget-object p1, v0, LC8/i;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p1, Landroid/content/SharedPreferences;

    .line 21
    .line 22
    iget-object v1, v0, LC8/i;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, Ljava/lang/String;

    .line 25
    .line 26
    const-string v2, ""

    .line 27
    .line 28
    invoke-interface {p1, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-nez v1, :cond_4

    .line 37
    .line 38
    iget-object v1, v0, LC8/i;->d:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v1, Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {p1, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-nez v1, :cond_0

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_0
    iget-object v1, v0, LC8/i;->d:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v1, Ljava/lang/String;

    .line 52
    .line 53
    const/4 v2, -0x1

    .line 54
    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    array-length v1, p1

    .line 59
    if-nez v1, :cond_1

    .line 60
    .line 61
    const-string v1, "FirebaseMessaging"

    .line 62
    .line 63
    const-string v2, "Corrupted queue. Please check the queue contents and item separator provided"

    .line 64
    .line 65
    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :catchall_0
    move-exception p1

    .line 70
    goto :goto_3

    .line 71
    :cond_1
    :goto_0
    array-length v1, p1

    .line 72
    const/4 v2, 0x0

    .line 73
    :goto_1
    if-ge v2, v1, :cond_3

    .line 74
    .line 75
    aget-object v3, p1, v2

    .line 76
    .line 77
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    if-nez v4, :cond_2

    .line 82
    .line 83
    iget-object v4, v0, LC8/i;->e:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v4, Ljava/util/ArrayDeque;

    .line 86
    .line 87
    invoke-virtual {v4, v3}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_3
    monitor-exit p0

    .line 94
    return-object v0

    .line 95
    :cond_4
    :goto_2
    monitor-exit p0

    .line 96
    return-object v0

    .line 97
    :goto_3
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 98
    throw p1
.end method

.method public static m(Le0/x;DDDDDDDZZ)V
    .locals 50

    .line 1
    move-wide/from16 v1, p1

    .line 2
    .line 3
    move-wide/from16 v5, p5

    .line 4
    .line 5
    move-wide/from16 v3, p9

    .line 6
    .line 7
    const/16 v0, 0xb4

    .line 8
    .line 9
    int-to-double v7, v0

    .line 10
    div-double v7, p13, v7

    .line 11
    .line 12
    const-wide v9, 0x400921fb54442d18L    # Math.PI

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    mul-double/2addr v7, v9

    .line 18
    invoke-static {v7, v8}, Ljava/lang/Math;->cos(D)D

    .line 19
    .line 20
    .line 21
    move-result-wide v11

    .line 22
    invoke-static {v7, v8}, Ljava/lang/Math;->sin(D)D

    .line 23
    .line 24
    .line 25
    move-result-wide v13

    .line 26
    mul-double v15, v1, v11

    .line 27
    .line 28
    mul-double v17, p3, v13

    .line 29
    .line 30
    add-double v17, v17, v15

    .line 31
    .line 32
    div-double v17, v17, v3

    .line 33
    .line 34
    move-wide v15, v9

    .line 35
    neg-double v9, v1

    .line 36
    mul-double/2addr v9, v13

    .line 37
    mul-double v19, p3, v11

    .line 38
    .line 39
    add-double v19, v19, v9

    .line 40
    .line 41
    div-double v19, v19, p11

    .line 42
    .line 43
    mul-double v9, v5, v11

    .line 44
    .line 45
    mul-double v21, p7, v13

    .line 46
    .line 47
    add-double v21, v21, v9

    .line 48
    .line 49
    div-double v21, v21, v3

    .line 50
    .line 51
    neg-double v9, v5

    .line 52
    mul-double/2addr v9, v13

    .line 53
    mul-double v23, p7, v11

    .line 54
    .line 55
    add-double v23, v23, v9

    .line 56
    .line 57
    div-double v23, v23, p11

    .line 58
    .line 59
    sub-double v9, v17, v21

    .line 60
    .line 61
    sub-double v25, v19, v23

    .line 62
    .line 63
    add-double v27, v17, v21

    .line 64
    .line 65
    const/4 v0, 0x2

    .line 66
    int-to-double v0, v0

    .line 67
    div-double v27, v27, v0

    .line 68
    .line 69
    add-double v29, v19, v23

    .line 70
    .line 71
    div-double v29, v29, v0

    .line 72
    .line 73
    mul-double v31, v9, v9

    .line 74
    .line 75
    mul-double v33, v25, v25

    .line 76
    .line 77
    add-double v33, v33, v31

    .line 78
    .line 79
    const-wide/16 v31, 0x0

    .line 80
    .line 81
    cmpg-double v2, v33, v31

    .line 82
    .line 83
    if-nez v2, :cond_0

    .line 84
    .line 85
    goto/16 :goto_4

    .line 86
    .line 87
    :cond_0
    const-wide/high16 v35, 0x3ff0000000000000L    # 1.0

    .line 88
    .line 89
    div-double v35, v35, v33

    .line 90
    .line 91
    const-wide/high16 v37, 0x3fd0000000000000L    # 0.25

    .line 92
    .line 93
    sub-double v35, v35, v37

    .line 94
    .line 95
    cmpg-double v2, v35, v31

    .line 96
    .line 97
    if-gez v2, :cond_1

    .line 98
    .line 99
    invoke-static/range {v33 .. v34}, Ljava/lang/Math;->sqrt(D)D

    .line 100
    .line 101
    .line 102
    move-result-wide v0

    .line 103
    const-wide v7, 0x3ffffff583a53b8eL    # 1.99999

    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    div-double/2addr v0, v7

    .line 109
    double-to-float v0, v0

    .line 110
    float-to-double v0, v0

    .line 111
    mul-double v9, v3, v0

    .line 112
    .line 113
    mul-double v11, p11, v0

    .line 114
    .line 115
    move-object/from16 v0, p0

    .line 116
    .line 117
    move-wide/from16 v1, p1

    .line 118
    .line 119
    move-wide/from16 v3, p3

    .line 120
    .line 121
    move-wide/from16 v7, p7

    .line 122
    .line 123
    move-wide/from16 v13, p13

    .line 124
    .line 125
    move/from16 v15, p15

    .line 126
    .line 127
    move/from16 v16, p16

    .line 128
    .line 129
    invoke-static/range {v0 .. v16}, LC8/i;->m(Le0/x;DDDDDDDZZ)V

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :cond_1
    move/from16 v2, p16

    .line 134
    .line 135
    invoke-static/range {v35 .. v36}, Ljava/lang/Math;->sqrt(D)D

    .line 136
    .line 137
    .line 138
    move-result-wide v5

    .line 139
    mul-double/2addr v9, v5

    .line 140
    mul-double v5, v5, v25

    .line 141
    .line 142
    move-wide/from16 v25, v15

    .line 143
    .line 144
    move/from16 v15, p15

    .line 145
    .line 146
    if-ne v15, v2, :cond_2

    .line 147
    .line 148
    sub-double v27, v27, v5

    .line 149
    .line 150
    add-double v29, v29, v9

    .line 151
    .line 152
    goto :goto_0

    .line 153
    :cond_2
    add-double v27, v27, v5

    .line 154
    .line 155
    sub-double v29, v29, v9

    .line 156
    .line 157
    :goto_0
    sub-double v5, v19, v29

    .line 158
    .line 159
    sub-double v9, v17, v27

    .line 160
    .line 161
    invoke-static {v5, v6, v9, v10}, Ljava/lang/Math;->atan2(DD)D

    .line 162
    .line 163
    .line 164
    move-result-wide v5

    .line 165
    sub-double v9, v23, v29

    .line 166
    .line 167
    move-wide v15, v0

    .line 168
    sub-double v0, v21, v27

    .line 169
    .line 170
    invoke-static {v9, v10, v0, v1}, Ljava/lang/Math;->atan2(DD)D

    .line 171
    .line 172
    .line 173
    move-result-wide v0

    .line 174
    sub-double/2addr v0, v5

    .line 175
    cmpl-double v9, v0, v31

    .line 176
    .line 177
    const/16 v17, 0x0

    .line 178
    .line 179
    if-ltz v9, :cond_3

    .line 180
    .line 181
    const/4 v10, 0x1

    .line 182
    goto :goto_1

    .line 183
    :cond_3
    move/from16 v10, v17

    .line 184
    .line 185
    :goto_1
    if-eq v2, v10, :cond_5

    .line 186
    .line 187
    const-wide v18, 0x401921fb54442d18L    # 6.283185307179586

    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    if-lez v9, :cond_4

    .line 193
    .line 194
    sub-double v0, v0, v18

    .line 195
    .line 196
    goto :goto_2

    .line 197
    :cond_4
    add-double v0, v0, v18

    .line 198
    .line 199
    :cond_5
    :goto_2
    mul-double v27, v27, v3

    .line 200
    .line 201
    mul-double v29, v29, p11

    .line 202
    .line 203
    mul-double v9, v27, v11

    .line 204
    .line 205
    mul-double v18, v29, v13

    .line 206
    .line 207
    sub-double v9, v9, v18

    .line 208
    .line 209
    mul-double v27, v27, v13

    .line 210
    .line 211
    mul-double v29, v29, v11

    .line 212
    .line 213
    add-double v29, v29, v27

    .line 214
    .line 215
    const/4 v2, 0x4

    .line 216
    int-to-double v11, v2

    .line 217
    mul-double v13, v0, v11

    .line 218
    .line 219
    div-double v13, v13, v25

    .line 220
    .line 221
    invoke-static {v13, v14}, Ljava/lang/Math;->abs(D)D

    .line 222
    .line 223
    .line 224
    move-result-wide v13

    .line 225
    invoke-static {v13, v14}, Ljava/lang/Math;->ceil(D)D

    .line 226
    .line 227
    .line 228
    move-result-wide v13

    .line 229
    double-to-int v2, v13

    .line 230
    invoke-static {v7, v8}, Ljava/lang/Math;->cos(D)D

    .line 231
    .line 232
    .line 233
    move-result-wide v13

    .line 234
    invoke-static {v7, v8}, Ljava/lang/Math;->sin(D)D

    .line 235
    .line 236
    .line 237
    move-result-wide v7

    .line 238
    invoke-static {v5, v6}, Ljava/lang/Math;->cos(D)D

    .line 239
    .line 240
    .line 241
    move-result-wide v18

    .line 242
    invoke-static {v5, v6}, Ljava/lang/Math;->sin(D)D

    .line 243
    .line 244
    .line 245
    move-result-wide v20

    .line 246
    move-wide/from16 p6, v0

    .line 247
    .line 248
    neg-double v0, v3

    .line 249
    mul-double v22, v0, v13

    .line 250
    .line 251
    mul-double v24, v22, v20

    .line 252
    .line 253
    mul-double v26, p11, v7

    .line 254
    .line 255
    mul-double v31, v26, v18

    .line 256
    .line 257
    sub-double v24, v24, v31

    .line 258
    .line 259
    mul-double/2addr v0, v7

    .line 260
    mul-double v20, v20, v0

    .line 261
    .line 262
    mul-double v31, p11, v13

    .line 263
    .line 264
    mul-double v18, v18, v31

    .line 265
    .line 266
    add-double v18, v18, v20

    .line 267
    .line 268
    move-wide/from16 p13, v0

    .line 269
    .line 270
    int-to-double v0, v2

    .line 271
    div-double v0, p6, v0

    .line 272
    .line 273
    move-wide/from16 p6, v0

    .line 274
    .line 275
    move/from16 v0, v17

    .line 276
    .line 277
    move-wide/from16 v33, v24

    .line 278
    .line 279
    move-wide/from16 v24, v18

    .line 280
    .line 281
    move-wide/from16 v17, p3

    .line 282
    .line 283
    move-wide/from16 v19, v5

    .line 284
    .line 285
    move-wide/from16 v5, p1

    .line 286
    .line 287
    :goto_3
    if-ge v0, v2, :cond_6

    .line 288
    .line 289
    add-double v35, v19, p6

    .line 290
    .line 291
    invoke-static/range {v35 .. v36}, Ljava/lang/Math;->sin(D)D

    .line 292
    .line 293
    .line 294
    move-result-wide v37

    .line 295
    invoke-static/range {v35 .. v36}, Ljava/lang/Math;->cos(D)D

    .line 296
    .line 297
    .line 298
    move-result-wide v39

    .line 299
    mul-double v41, v3, v13

    .line 300
    .line 301
    mul-double v41, v41, v39

    .line 302
    .line 303
    add-double v41, v41, v9

    .line 304
    .line 305
    mul-double v43, v26, v37

    .line 306
    .line 307
    move/from16 v21, v0

    .line 308
    .line 309
    sub-double v0, v41, v43

    .line 310
    .line 311
    mul-double v41, v3, v7

    .line 312
    .line 313
    mul-double v41, v41, v39

    .line 314
    .line 315
    add-double v41, v41, v29

    .line 316
    .line 317
    mul-double v43, v31, v37

    .line 318
    .line 319
    move v4, v2

    .line 320
    add-double v2, v43, v41

    .line 321
    .line 322
    mul-double v41, v22, v37

    .line 323
    .line 324
    mul-double v43, v26, v39

    .line 325
    .line 326
    sub-double v41, v41, v43

    .line 327
    .line 328
    mul-double v37, v37, p13

    .line 329
    .line 330
    mul-double v39, v39, v31

    .line 331
    .line 332
    add-double v37, v39, v37

    .line 333
    .line 334
    sub-double v19, v35, v19

    .line 335
    .line 336
    div-double v39, v19, v15

    .line 337
    .line 338
    invoke-static/range {v39 .. v40}, Ljava/lang/Math;->tan(D)D

    .line 339
    .line 340
    .line 341
    move-result-wide v39

    .line 342
    invoke-static/range {v19 .. v20}, Ljava/lang/Math;->sin(D)D

    .line 343
    .line 344
    .line 345
    move-result-wide v19

    .line 346
    const-wide/high16 v43, 0x4008000000000000L    # 3.0

    .line 347
    .line 348
    mul-double v43, v43, v39

    .line 349
    .line 350
    mul-double v43, v43, v39

    .line 351
    .line 352
    add-double v43, v43, v11

    .line 353
    .line 354
    invoke-static/range {v43 .. v44}, Ljava/lang/Math;->sqrt(D)D

    .line 355
    .line 356
    .line 357
    move-result-wide v39

    .line 358
    move/from16 p1, v4

    .line 359
    .line 360
    move-wide/from16 p2, v5

    .line 361
    .line 362
    const/4 v4, 0x1

    .line 363
    int-to-double v5, v4

    .line 364
    sub-double v39, v39, v5

    .line 365
    .line 366
    mul-double v39, v39, v19

    .line 367
    .line 368
    const/4 v5, 0x3

    .line 369
    int-to-double v5, v5

    .line 370
    div-double v39, v39, v5

    .line 371
    .line 372
    mul-double v33, v33, v39

    .line 373
    .line 374
    add-double v5, v33, p2

    .line 375
    .line 376
    mul-double v24, v24, v39

    .line 377
    .line 378
    move-wide/from16 p2, v5

    .line 379
    .line 380
    add-double v4, v24, v17

    .line 381
    .line 382
    mul-double v17, v39, v41

    .line 383
    .line 384
    move-wide/from16 p15, v7

    .line 385
    .line 386
    sub-double v6, v0, v17

    .line 387
    .line 388
    mul-double v39, v39, v37

    .line 389
    .line 390
    move-wide/from16 v17, v9

    .line 391
    .line 392
    sub-double v8, v2, v39

    .line 393
    .line 394
    move-wide/from16 v19, v11

    .line 395
    .line 396
    move-wide/from16 v10, p2

    .line 397
    .line 398
    double-to-float v10, v10

    .line 399
    double-to-float v4, v4

    .line 400
    double-to-float v5, v6

    .line 401
    double-to-float v6, v8

    .line 402
    double-to-float v7, v0

    .line 403
    double-to-float v8, v2

    .line 404
    move-object/from16 v9, p0

    .line 405
    .line 406
    check-cast v9, Le0/f;

    .line 407
    .line 408
    iget-object v9, v9, Le0/f;->a:Landroid/graphics/Path;

    .line 409
    .line 410
    move/from16 v45, v4

    .line 411
    .line 412
    move/from16 v46, v5

    .line 413
    .line 414
    move/from16 v47, v6

    .line 415
    .line 416
    move/from16 v48, v7

    .line 417
    .line 418
    move/from16 v49, v8

    .line 419
    .line 420
    move-object/from16 v43, v9

    .line 421
    .line 422
    move/from16 v44, v10

    .line 423
    .line 424
    invoke-virtual/range {v43 .. v49}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 425
    .line 426
    .line 427
    add-int/lit8 v4, v21, 0x1

    .line 428
    .line 429
    move-wide/from16 v7, p15

    .line 430
    .line 431
    move-wide v5, v0

    .line 432
    move v0, v4

    .line 433
    move-wide/from16 v9, v17

    .line 434
    .line 435
    move-wide/from16 v11, v19

    .line 436
    .line 437
    move-wide/from16 v19, v35

    .line 438
    .line 439
    move-wide/from16 v24, v37

    .line 440
    .line 441
    move-wide/from16 v33, v41

    .line 442
    .line 443
    move-wide/from16 v17, v2

    .line 444
    .line 445
    move/from16 v2, p1

    .line 446
    .line 447
    move-wide/from16 v3, p9

    .line 448
    .line 449
    goto/16 :goto_3

    .line 450
    .line 451
    :cond_6
    :goto_4
    return-void
.end method

.method public static t(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v1, ", Message: "

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v1, ", Stacktrace: "

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-static {p0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    const-string v0, "WebChromeClientImpl"

    .line 46
    .line 47
    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    return-void
.end method


# virtual methods
.method public a(J)I
    .locals 2

    .line 1
    iget v0, p0, LC8/i;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LC8/i;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, [J

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-static {v0, p1, p2, v1}, Lu6/v;->b([JJZ)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    array-length p2, v0

    .line 16
    if-ge p1, p2, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p1, -0x1

    .line 20
    :goto_0
    return p1

    .line 21
    :pswitch_0
    iget-object v0, p0, LC8/i;->c:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, [J

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-static {v0, p1, p2, v1}, LQ1/x;->a([JJZ)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    array-length p2, v0

    .line 31
    if-ge p1, p2, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    const/4 p1, -0x1

    .line 35
    :goto_1
    return p1

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method public declared-synchronized b(JLtf/l;)V
    .locals 9

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, LC8/i;->e:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, LEf/H0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    :try_start_1
    const-string v1, "job"

    .line 9
    .line 10
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, LEf/z0;->isActive()Z

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
    invoke-virtual {v0, v1}, LEf/z0;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 21
    .line 22
    .line 23
    sget-object v2, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 24
    .line 25
    new-instance v0, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string v1, "Task "

    .line 28
    .line 29
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, LC8/i;->c:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, Ljava/lang/String;

    .line 35
    .line 36
    const-string v3, " cancelled"

    .line 37
    .line 38
    invoke-static {v0, v1, v3}, Lwg/b;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    const/4 v5, 0x0

    .line 43
    const/4 v6, 0x0

    .line 44
    const-string v3, "IlrdScheduler"

    .line 45
    .line 46
    const/16 v7, 0xc

    .line 47
    .line 48
    const/4 v8, 0x0

    .line 49
    invoke-static/range {v2 .. v8}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catchall_0
    move-exception v0

    .line 54
    move-object p1, v0

    .line 55
    move-object v2, p0

    .line 56
    goto :goto_2

    .line 57
    :cond_0
    :goto_0
    :try_start_2
    iget-object v0, p0, LC8/i;->b:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v0, LKd/a;

    .line 60
    .line 61
    new-instance v1, Lcom/moloco/sdk/internal/ilrd/w;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 62
    .line 63
    const/4 v6, 0x0

    .line 64
    move-object v2, p0

    .line 65
    move-wide v3, p1

    .line 66
    move-object v5, p3

    .line 67
    :try_start_3
    invoke-direct/range {v1 .. v6}, Lcom/moloco/sdk/internal/ilrd/w;-><init>(LC8/i;JLtf/l;Ljf/c;)V

    .line 68
    .line 69
    .line 70
    const/4 p1, 0x3

    .line 71
    const/4 p2, 0x0

    .line 72
    invoke-static {v0, p2, v1, p1}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    iput-object p1, v2, LC8/i;->e:Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 77
    .line 78
    monitor-exit p0

    .line 79
    return-void

    .line 80
    :catchall_1
    move-exception v0

    .line 81
    :goto_1
    move-object p1, v0

    .line 82
    goto :goto_2

    .line 83
    :catchall_2
    move-exception v0

    .line 84
    move-object v2, p0

    .line 85
    goto :goto_1

    .line 86
    :goto_2
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 87
    throw p1
.end method

.method public c(Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/g;)V
    .locals 4

    .line 1
    const-string v0, "lastClickPosition"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LC8/i;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/util/List;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, LC8/i;->e:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/s;

    .line 15
    .line 16
    invoke-virtual {v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/s;->b()Ljava/util/ArrayList;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iget-object v2, p0, LC8/i;->f:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/L0;

    .line 23
    .line 24
    iget-object v3, p0, LC8/i;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v3, Lcom/moloco/sdk/internal/services/events/c;

    .line 27
    .line 28
    invoke-static {v2, v0, v1, v3, p1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/G;->h(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/L0;Ljava/util/List;Ljava/util/ArrayList;Lcom/moloco/sdk/internal/services/events/c;Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/g;)V

    .line 29
    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    iput-object p1, p0, LC8/i;->c:Ljava/lang/Object;

    .line 33
    .line 34
    :cond_0
    return-void
.end method

.method public d(Ljava/lang/String;)[B
    .locals 3

    .line 1
    const-string v0, "rsaPublicKey"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LC8/i;->e:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljavax/crypto/spec/SecretKeySpec;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljavax/crypto/spec/SecretKeySpec;->getEncoded()[B

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const-string v2, "getEncoded(...)"

    .line 15
    .line 16
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, LC8/i;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Lef/p;

    .line 22
    .line 23
    invoke-virtual {v1}, Lef/p;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v1}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const/4 v2, 0x0

    .line 34
    invoke-static {p1, v2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    new-instance v2, Ljava/security/spec/X509EncodedKeySpec;

    .line 39
    .line 40
    invoke-direct {v2, p1}, Ljava/security/spec/X509EncodedKeySpec;-><init>([B)V

    .line 41
    .line 42
    .line 43
    iget-object p1, p0, LC8/i;->b:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, Lef/p;

    .line 46
    .line 47
    invoke-virtual {p1}, Lef/p;->getValue()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    check-cast p1, Ljava/lang/String;

    .line 52
    .line 53
    invoke-static {p1}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p1, v2}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    const-string v2, "generatePublic(...)"

    .line 62
    .line 63
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    const/4 v2, 0x1

    .line 67
    invoke-virtual {v1, v2, p1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Ljavax/crypto/spec/SecretKeySpec;->getEncoded()[B

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {v1, p1}, Ljavax/crypto/Cipher;->doFinal([B)[B

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    const-string v0, "doFinal(...)"

    .line 79
    .line 80
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    return-object p1
.end method

.method public e(Lb4/f;Ljava/lang/Class;)V
    .locals 2

    .line 1
    iget-object v0, p0, LC8/i;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    new-instance v1, Lef/k;

    .line 6
    .line 7
    invoke-direct {v1, p1, p2}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public f(Le4/a;Ljava/lang/Class;)V
    .locals 2

    .line 1
    iget-object v0, p0, LC8/i;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    new-instance v1, Lef/k;

    .line 6
    .line 7
    invoke-direct {v1, p1, p2}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public g(J)Ljava/util/List;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v2, p1

    .line 4
    .line 5
    iget v1, v0, LC8/i;->a:I

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, LC8/i;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lo6/d;

    .line 13
    .line 14
    new-instance v8, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    iget-object v4, v1, Lo6/d;->h:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v1, v2, v3, v4, v8}, Lo6/d;->g(JLjava/lang/String;Ljava/util/ArrayList;)V

    .line 22
    .line 23
    .line 24
    new-instance v6, Ljava/util/TreeMap;

    .line 25
    .line 26
    invoke-direct {v6}, Ljava/util/TreeMap;-><init>()V

    .line 27
    .line 28
    .line 29
    const/4 v4, 0x0

    .line 30
    iget-object v5, v1, Lo6/d;->h:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual/range {v1 .. v6}, Lo6/d;->i(JZLjava/lang/String;Ljava/util/TreeMap;)V

    .line 33
    .line 34
    .line 35
    iget-object v2, v0, LC8/i;->e:Ljava/lang/Object;

    .line 36
    .line 37
    move-object v5, v2

    .line 38
    check-cast v5, Ljava/util/HashMap;

    .line 39
    .line 40
    iget-object v2, v0, LC8/i;->d:Ljava/lang/Object;

    .line 41
    .line 42
    move-object v4, v2

    .line 43
    check-cast v4, Ljava/util/Map;

    .line 44
    .line 45
    move-object v7, v6

    .line 46
    iget-object v6, v1, Lo6/d;->h:Ljava/lang/String;

    .line 47
    .line 48
    move-wide/from16 v2, p1

    .line 49
    .line 50
    invoke-virtual/range {v1 .. v7}, Lo6/d;->h(JLjava/util/Map;Ljava/util/HashMap;Ljava/lang/String;Ljava/util/TreeMap;)V

    .line 51
    .line 52
    .line 53
    move-object v6, v7

    .line 54
    new-instance v1, Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    const/4 v4, 0x0

    .line 68
    if-eqz v3, :cond_1

    .line 69
    .line 70
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    check-cast v3, Landroid/util/Pair;

    .line 75
    .line 76
    iget-object v7, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 77
    .line 78
    iget-object v8, v0, LC8/i;->f:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v8, Ljava/util/HashMap;

    .line 81
    .line 82
    invoke-virtual {v8, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    check-cast v7, Ljava/lang/String;

    .line 87
    .line 88
    if-nez v7, :cond_0

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_0
    invoke-static {v7, v4}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 92
    .line 93
    .line 94
    move-result-object v7

    .line 95
    array-length v8, v7

    .line 96
    invoke-static {v7, v4, v8}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    .line 97
    .line 98
    .line 99
    move-result-object v13

    .line 100
    iget-object v3, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 101
    .line 102
    invoke-virtual {v5, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    check-cast v3, Lo6/e;

    .line 107
    .line 108
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    new-instance v9, Lh6/b;

    .line 112
    .line 113
    const/16 v23, 0x0

    .line 114
    .line 115
    const/high16 v24, -0x1000000

    .line 116
    .line 117
    const/4 v10, 0x0

    .line 118
    iget v14, v3, Lo6/e;->c:F

    .line 119
    .line 120
    const/4 v15, 0x0

    .line 121
    iget v4, v3, Lo6/e;->e:I

    .line 122
    .line 123
    iget v7, v3, Lo6/e;->b:F

    .line 124
    .line 125
    const/16 v18, 0x0

    .line 126
    .line 127
    const/high16 v19, -0x80000000

    .line 128
    .line 129
    const v20, -0x800001

    .line 130
    .line 131
    .line 132
    iget v8, v3, Lo6/e;->f:F

    .line 133
    .line 134
    iget v11, v3, Lo6/e;->g:F

    .line 135
    .line 136
    iget v3, v3, Lo6/e;->j:I

    .line 137
    .line 138
    const/16 v26, 0x0

    .line 139
    .line 140
    move/from16 v22, v11

    .line 141
    .line 142
    move-object v11, v10

    .line 143
    move-object v12, v10

    .line 144
    move/from16 v25, v3

    .line 145
    .line 146
    move/from16 v16, v4

    .line 147
    .line 148
    move/from16 v17, v7

    .line 149
    .line 150
    move/from16 v21, v8

    .line 151
    .line 152
    invoke-direct/range {v9 .. v26}, Lh6/b;-><init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;Landroid/text/Layout$Alignment;Landroid/graphics/Bitmap;FIIFIIFFFZIIF)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    goto :goto_0

    .line 159
    :cond_1
    invoke-virtual {v6}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 168
    .line 169
    .line 170
    move-result v3

    .line 171
    if-eqz v3, :cond_d

    .line 172
    .line 173
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    check-cast v3, Ljava/util/Map$Entry;

    .line 178
    .line 179
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v6

    .line 183
    invoke-virtual {v5, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v6

    .line 187
    check-cast v6, Lo6/e;

    .line 188
    .line 189
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    check-cast v3, Lh6/a;

    .line 197
    .line 198
    iget-object v7, v3, Lh6/a;->a:Ljava/lang/CharSequence;

    .line 199
    .line 200
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    check-cast v7, Landroid/text/SpannableStringBuilder;

    .line 204
    .line 205
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    .line 206
    .line 207
    .line 208
    move-result v8

    .line 209
    const-class v9, Lo6/a;

    .line 210
    .line 211
    invoke-virtual {v7, v4, v8, v9}, Landroid/text/SpannableStringBuilder;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v8

    .line 215
    check-cast v8, [Lo6/a;

    .line 216
    .line 217
    array-length v9, v8

    .line 218
    move v10, v4

    .line 219
    :goto_2
    if-ge v10, v9, :cond_2

    .line 220
    .line 221
    aget-object v11, v8, v10

    .line 222
    .line 223
    invoke-virtual {v7, v11}, Landroid/text/SpannableStringBuilder;->getSpanStart(Ljava/lang/Object;)I

    .line 224
    .line 225
    .line 226
    move-result v12

    .line 227
    invoke-virtual {v7, v11}, Landroid/text/SpannableStringBuilder;->getSpanEnd(Ljava/lang/Object;)I

    .line 228
    .line 229
    .line 230
    move-result v11

    .line 231
    const-string v13, ""

    .line 232
    .line 233
    invoke-virtual {v7, v12, v11, v13}, Landroid/text/SpannableStringBuilder;->replace(IILjava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 234
    .line 235
    .line 236
    add-int/lit8 v10, v10, 0x1

    .line 237
    .line 238
    goto :goto_2

    .line 239
    :cond_2
    move v8, v4

    .line 240
    :goto_3
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    .line 241
    .line 242
    .line 243
    move-result v9

    .line 244
    const/16 v10, 0x20

    .line 245
    .line 246
    if-ge v8, v9, :cond_5

    .line 247
    .line 248
    invoke-virtual {v7, v8}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 249
    .line 250
    .line 251
    move-result v9

    .line 252
    if-ne v9, v10, :cond_4

    .line 253
    .line 254
    add-int/lit8 v9, v8, 0x1

    .line 255
    .line 256
    move v11, v9

    .line 257
    :goto_4
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    .line 258
    .line 259
    .line 260
    move-result v12

    .line 261
    if-ge v11, v12, :cond_3

    .line 262
    .line 263
    invoke-virtual {v7, v11}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 264
    .line 265
    .line 266
    move-result v12

    .line 267
    if-ne v12, v10, :cond_3

    .line 268
    .line 269
    add-int/lit8 v11, v11, 0x1

    .line 270
    .line 271
    goto :goto_4

    .line 272
    :cond_3
    sub-int/2addr v11, v9

    .line 273
    if-lez v11, :cond_4

    .line 274
    .line 275
    add-int/2addr v11, v8

    .line 276
    invoke-virtual {v7, v8, v11}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 277
    .line 278
    .line 279
    :cond_4
    add-int/lit8 v8, v8, 0x1

    .line 280
    .line 281
    goto :goto_3

    .line 282
    :cond_5
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    .line 283
    .line 284
    .line 285
    move-result v8

    .line 286
    const/4 v9, 0x1

    .line 287
    if-lez v8, :cond_6

    .line 288
    .line 289
    invoke-virtual {v7, v4}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 290
    .line 291
    .line 292
    move-result v8

    .line 293
    if-ne v8, v10, :cond_6

    .line 294
    .line 295
    invoke-virtual {v7, v4, v9}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 296
    .line 297
    .line 298
    :cond_6
    move v8, v4

    .line 299
    :goto_5
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    .line 300
    .line 301
    .line 302
    move-result v11

    .line 303
    sub-int/2addr v11, v9

    .line 304
    const/16 v12, 0xa

    .line 305
    .line 306
    if-ge v8, v11, :cond_8

    .line 307
    .line 308
    invoke-virtual {v7, v8}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 309
    .line 310
    .line 311
    move-result v11

    .line 312
    if-ne v11, v12, :cond_7

    .line 313
    .line 314
    add-int/lit8 v11, v8, 0x1

    .line 315
    .line 316
    invoke-virtual {v7, v11}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 317
    .line 318
    .line 319
    move-result v12

    .line 320
    if-ne v12, v10, :cond_7

    .line 321
    .line 322
    add-int/lit8 v12, v8, 0x2

    .line 323
    .line 324
    invoke-virtual {v7, v11, v12}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 325
    .line 326
    .line 327
    :cond_7
    add-int/lit8 v8, v8, 0x1

    .line 328
    .line 329
    goto :goto_5

    .line 330
    :cond_8
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    .line 331
    .line 332
    .line 333
    move-result v8

    .line 334
    if-lez v8, :cond_9

    .line 335
    .line 336
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    .line 337
    .line 338
    .line 339
    move-result v8

    .line 340
    sub-int/2addr v8, v9

    .line 341
    invoke-virtual {v7, v8}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 342
    .line 343
    .line 344
    move-result v8

    .line 345
    if-ne v8, v10, :cond_9

    .line 346
    .line 347
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    .line 348
    .line 349
    .line 350
    move-result v8

    .line 351
    sub-int/2addr v8, v9

    .line 352
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    .line 353
    .line 354
    .line 355
    move-result v11

    .line 356
    invoke-virtual {v7, v8, v11}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 357
    .line 358
    .line 359
    :cond_9
    move v8, v4

    .line 360
    :goto_6
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    .line 361
    .line 362
    .line 363
    move-result v11

    .line 364
    sub-int/2addr v11, v9

    .line 365
    if-ge v8, v11, :cond_b

    .line 366
    .line 367
    invoke-virtual {v7, v8}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 368
    .line 369
    .line 370
    move-result v11

    .line 371
    if-ne v11, v10, :cond_a

    .line 372
    .line 373
    add-int/lit8 v11, v8, 0x1

    .line 374
    .line 375
    invoke-virtual {v7, v11}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 376
    .line 377
    .line 378
    move-result v13

    .line 379
    if-ne v13, v12, :cond_a

    .line 380
    .line 381
    invoke-virtual {v7, v8, v11}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 382
    .line 383
    .line 384
    :cond_a
    add-int/lit8 v8, v8, 0x1

    .line 385
    .line 386
    goto :goto_6

    .line 387
    :cond_b
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    .line 388
    .line 389
    .line 390
    move-result v8

    .line 391
    if-lez v8, :cond_c

    .line 392
    .line 393
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    .line 394
    .line 395
    .line 396
    move-result v8

    .line 397
    sub-int/2addr v8, v9

    .line 398
    invoke-virtual {v7, v8}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 399
    .line 400
    .line 401
    move-result v8

    .line 402
    if-ne v8, v12, :cond_c

    .line 403
    .line 404
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    .line 405
    .line 406
    .line 407
    move-result v8

    .line 408
    sub-int/2addr v8, v9

    .line 409
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    .line 410
    .line 411
    .line 412
    move-result v9

    .line 413
    invoke-virtual {v7, v8, v9}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 414
    .line 415
    .line 416
    :cond_c
    iget v7, v6, Lo6/e;->c:F

    .line 417
    .line 418
    iput v7, v3, Lh6/a;->e:F

    .line 419
    .line 420
    iget v7, v6, Lo6/e;->d:I

    .line 421
    .line 422
    iput v7, v3, Lh6/a;->f:I

    .line 423
    .line 424
    iget v7, v6, Lo6/e;->e:I

    .line 425
    .line 426
    iput v7, v3, Lh6/a;->g:I

    .line 427
    .line 428
    iget v7, v6, Lo6/e;->b:F

    .line 429
    .line 430
    iput v7, v3, Lh6/a;->h:F

    .line 431
    .line 432
    iget v7, v6, Lo6/e;->f:F

    .line 433
    .line 434
    iput v7, v3, Lh6/a;->l:F

    .line 435
    .line 436
    iget v7, v6, Lo6/e;->i:F

    .line 437
    .line 438
    iput v7, v3, Lh6/a;->k:F

    .line 439
    .line 440
    iget v7, v6, Lo6/e;->h:I

    .line 441
    .line 442
    iput v7, v3, Lh6/a;->j:I

    .line 443
    .line 444
    iget v6, v6, Lo6/e;->j:I

    .line 445
    .line 446
    iput v6, v3, Lh6/a;->p:I

    .line 447
    .line 448
    invoke-virtual {v3}, Lh6/a;->a()Lh6/b;

    .line 449
    .line 450
    .line 451
    move-result-object v3

    .line 452
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 453
    .line 454
    .line 455
    goto/16 :goto_1

    .line 456
    .line 457
    :cond_d
    return-object v1

    .line 458
    :pswitch_0
    iget-object v1, v0, LC8/i;->b:Ljava/lang/Object;

    .line 459
    .line 460
    check-cast v1, LV2/c;

    .line 461
    .line 462
    new-instance v8, Ljava/util/ArrayList;

    .line 463
    .line 464
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 465
    .line 466
    .line 467
    iget-object v4, v1, LV2/c;->h:Ljava/lang/String;

    .line 468
    .line 469
    invoke-virtual {v1, v2, v3, v4, v8}, LV2/c;->g(JLjava/lang/String;Ljava/util/ArrayList;)V

    .line 470
    .line 471
    .line 472
    new-instance v6, Ljava/util/TreeMap;

    .line 473
    .line 474
    invoke-direct {v6}, Ljava/util/TreeMap;-><init>()V

    .line 475
    .line 476
    .line 477
    const/4 v4, 0x0

    .line 478
    iget-object v5, v1, LV2/c;->h:Ljava/lang/String;

    .line 479
    .line 480
    invoke-virtual/range {v1 .. v6}, LV2/c;->i(JZLjava/lang/String;Ljava/util/TreeMap;)V

    .line 481
    .line 482
    .line 483
    iget-object v2, v0, LC8/i;->e:Ljava/lang/Object;

    .line 484
    .line 485
    move-object v5, v2

    .line 486
    check-cast v5, Ljava/util/HashMap;

    .line 487
    .line 488
    iget-object v2, v0, LC8/i;->d:Ljava/lang/Object;

    .line 489
    .line 490
    move-object v4, v2

    .line 491
    check-cast v4, Ljava/util/Map;

    .line 492
    .line 493
    move-object v7, v6

    .line 494
    iget-object v6, v1, LV2/c;->h:Ljava/lang/String;

    .line 495
    .line 496
    move-wide/from16 v2, p1

    .line 497
    .line 498
    invoke-virtual/range {v1 .. v7}, LV2/c;->h(JLjava/util/Map;Ljava/util/HashMap;Ljava/lang/String;Ljava/util/TreeMap;)V

    .line 499
    .line 500
    .line 501
    move-object v6, v7

    .line 502
    new-instance v1, Ljava/util/ArrayList;

    .line 503
    .line 504
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 505
    .line 506
    .line 507
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 508
    .line 509
    .line 510
    move-result-object v2

    .line 511
    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 512
    .line 513
    .line 514
    move-result v3

    .line 515
    const/4 v4, 0x0

    .line 516
    if-eqz v3, :cond_f

    .line 517
    .line 518
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 519
    .line 520
    .line 521
    move-result-object v3

    .line 522
    check-cast v3, Landroid/util/Pair;

    .line 523
    .line 524
    iget-object v7, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 525
    .line 526
    iget-object v8, v0, LC8/i;->f:Ljava/lang/Object;

    .line 527
    .line 528
    check-cast v8, Ljava/util/HashMap;

    .line 529
    .line 530
    invoke-virtual {v8, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 531
    .line 532
    .line 533
    move-result-object v7

    .line 534
    check-cast v7, Ljava/lang/String;

    .line 535
    .line 536
    if-nez v7, :cond_e

    .line 537
    .line 538
    goto :goto_7

    .line 539
    :cond_e
    invoke-static {v7, v4}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 540
    .line 541
    .line 542
    move-result-object v7

    .line 543
    array-length v8, v7

    .line 544
    invoke-static {v7, v4, v8}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    .line 545
    .line 546
    .line 547
    move-result-object v13

    .line 548
    iget-object v3, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 549
    .line 550
    invoke-virtual {v5, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 551
    .line 552
    .line 553
    move-result-object v3

    .line 554
    check-cast v3, LV2/f;

    .line 555
    .line 556
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 557
    .line 558
    .line 559
    new-instance v9, LP1/b;

    .line 560
    .line 561
    const/16 v23, 0x0

    .line 562
    .line 563
    const/high16 v24, -0x1000000

    .line 564
    .line 565
    const/4 v10, 0x0

    .line 566
    iget v14, v3, LV2/f;->c:F

    .line 567
    .line 568
    const/4 v15, 0x0

    .line 569
    iget v4, v3, LV2/f;->e:I

    .line 570
    .line 571
    iget v7, v3, LV2/f;->b:F

    .line 572
    .line 573
    const/16 v18, 0x0

    .line 574
    .line 575
    const/high16 v19, -0x80000000

    .line 576
    .line 577
    const v20, -0x800001

    .line 578
    .line 579
    .line 580
    iget v8, v3, LV2/f;->f:F

    .line 581
    .line 582
    iget v11, v3, LV2/f;->g:F

    .line 583
    .line 584
    iget v3, v3, LV2/f;->j:I

    .line 585
    .line 586
    const/16 v26, 0x0

    .line 587
    .line 588
    move/from16 v22, v11

    .line 589
    .line 590
    move-object v11, v10

    .line 591
    move-object v12, v10

    .line 592
    move/from16 v25, v3

    .line 593
    .line 594
    move/from16 v16, v4

    .line 595
    .line 596
    move/from16 v17, v7

    .line 597
    .line 598
    move/from16 v21, v8

    .line 599
    .line 600
    invoke-direct/range {v9 .. v26}, LP1/b;-><init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;Landroid/text/Layout$Alignment;Landroid/graphics/Bitmap;FIIFIIFFFZIIF)V

    .line 601
    .line 602
    .line 603
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 604
    .line 605
    .line 606
    goto :goto_7

    .line 607
    :cond_f
    invoke-virtual {v6}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    .line 608
    .line 609
    .line 610
    move-result-object v2

    .line 611
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 612
    .line 613
    .line 614
    move-result-object v2

    .line 615
    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 616
    .line 617
    .line 618
    move-result v3

    .line 619
    if-eqz v3, :cond_1b

    .line 620
    .line 621
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 622
    .line 623
    .line 624
    move-result-object v3

    .line 625
    check-cast v3, Ljava/util/Map$Entry;

    .line 626
    .line 627
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 628
    .line 629
    .line 630
    move-result-object v6

    .line 631
    invoke-virtual {v5, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 632
    .line 633
    .line 634
    move-result-object v6

    .line 635
    check-cast v6, LV2/f;

    .line 636
    .line 637
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 638
    .line 639
    .line 640
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 641
    .line 642
    .line 643
    move-result-object v3

    .line 644
    check-cast v3, LP1/a;

    .line 645
    .line 646
    iget-object v7, v3, LP1/a;->a:Ljava/lang/CharSequence;

    .line 647
    .line 648
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 649
    .line 650
    .line 651
    check-cast v7, Landroid/text/SpannableStringBuilder;

    .line 652
    .line 653
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    .line 654
    .line 655
    .line 656
    move-result v8

    .line 657
    const-class v9, LV2/a;

    .line 658
    .line 659
    invoke-virtual {v7, v4, v8, v9}, Landroid/text/SpannableStringBuilder;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 660
    .line 661
    .line 662
    move-result-object v8

    .line 663
    check-cast v8, [LV2/a;

    .line 664
    .line 665
    array-length v9, v8

    .line 666
    move v10, v4

    .line 667
    :goto_9
    if-ge v10, v9, :cond_10

    .line 668
    .line 669
    aget-object v11, v8, v10

    .line 670
    .line 671
    invoke-virtual {v7, v11}, Landroid/text/SpannableStringBuilder;->getSpanStart(Ljava/lang/Object;)I

    .line 672
    .line 673
    .line 674
    move-result v12

    .line 675
    invoke-virtual {v7, v11}, Landroid/text/SpannableStringBuilder;->getSpanEnd(Ljava/lang/Object;)I

    .line 676
    .line 677
    .line 678
    move-result v11

    .line 679
    const-string v13, ""

    .line 680
    .line 681
    invoke-virtual {v7, v12, v11, v13}, Landroid/text/SpannableStringBuilder;->replace(IILjava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 682
    .line 683
    .line 684
    add-int/lit8 v10, v10, 0x1

    .line 685
    .line 686
    goto :goto_9

    .line 687
    :cond_10
    move v8, v4

    .line 688
    :goto_a
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    .line 689
    .line 690
    .line 691
    move-result v9

    .line 692
    const/16 v10, 0x20

    .line 693
    .line 694
    if-ge v8, v9, :cond_13

    .line 695
    .line 696
    invoke-virtual {v7, v8}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 697
    .line 698
    .line 699
    move-result v9

    .line 700
    if-ne v9, v10, :cond_12

    .line 701
    .line 702
    add-int/lit8 v9, v8, 0x1

    .line 703
    .line 704
    move v11, v9

    .line 705
    :goto_b
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    .line 706
    .line 707
    .line 708
    move-result v12

    .line 709
    if-ge v11, v12, :cond_11

    .line 710
    .line 711
    invoke-virtual {v7, v11}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 712
    .line 713
    .line 714
    move-result v12

    .line 715
    if-ne v12, v10, :cond_11

    .line 716
    .line 717
    add-int/lit8 v11, v11, 0x1

    .line 718
    .line 719
    goto :goto_b

    .line 720
    :cond_11
    sub-int/2addr v11, v9

    .line 721
    if-lez v11, :cond_12

    .line 722
    .line 723
    add-int/2addr v11, v8

    .line 724
    invoke-virtual {v7, v8, v11}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 725
    .line 726
    .line 727
    :cond_12
    add-int/lit8 v8, v8, 0x1

    .line 728
    .line 729
    goto :goto_a

    .line 730
    :cond_13
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    .line 731
    .line 732
    .line 733
    move-result v8

    .line 734
    const/4 v9, 0x1

    .line 735
    if-lez v8, :cond_14

    .line 736
    .line 737
    invoke-virtual {v7, v4}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 738
    .line 739
    .line 740
    move-result v8

    .line 741
    if-ne v8, v10, :cond_14

    .line 742
    .line 743
    invoke-virtual {v7, v4, v9}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 744
    .line 745
    .line 746
    :cond_14
    move v8, v4

    .line 747
    :goto_c
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    .line 748
    .line 749
    .line 750
    move-result v11

    .line 751
    sub-int/2addr v11, v9

    .line 752
    const/16 v12, 0xa

    .line 753
    .line 754
    if-ge v8, v11, :cond_16

    .line 755
    .line 756
    invoke-virtual {v7, v8}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 757
    .line 758
    .line 759
    move-result v11

    .line 760
    if-ne v11, v12, :cond_15

    .line 761
    .line 762
    add-int/lit8 v11, v8, 0x1

    .line 763
    .line 764
    invoke-virtual {v7, v11}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 765
    .line 766
    .line 767
    move-result v12

    .line 768
    if-ne v12, v10, :cond_15

    .line 769
    .line 770
    add-int/lit8 v12, v8, 0x2

    .line 771
    .line 772
    invoke-virtual {v7, v11, v12}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 773
    .line 774
    .line 775
    :cond_15
    add-int/lit8 v8, v8, 0x1

    .line 776
    .line 777
    goto :goto_c

    .line 778
    :cond_16
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    .line 779
    .line 780
    .line 781
    move-result v8

    .line 782
    if-lez v8, :cond_17

    .line 783
    .line 784
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    .line 785
    .line 786
    .line 787
    move-result v8

    .line 788
    sub-int/2addr v8, v9

    .line 789
    invoke-virtual {v7, v8}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 790
    .line 791
    .line 792
    move-result v8

    .line 793
    if-ne v8, v10, :cond_17

    .line 794
    .line 795
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    .line 796
    .line 797
    .line 798
    move-result v8

    .line 799
    sub-int/2addr v8, v9

    .line 800
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    .line 801
    .line 802
    .line 803
    move-result v11

    .line 804
    invoke-virtual {v7, v8, v11}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 805
    .line 806
    .line 807
    :cond_17
    move v8, v4

    .line 808
    :goto_d
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    .line 809
    .line 810
    .line 811
    move-result v11

    .line 812
    sub-int/2addr v11, v9

    .line 813
    if-ge v8, v11, :cond_19

    .line 814
    .line 815
    invoke-virtual {v7, v8}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 816
    .line 817
    .line 818
    move-result v11

    .line 819
    if-ne v11, v10, :cond_18

    .line 820
    .line 821
    add-int/lit8 v11, v8, 0x1

    .line 822
    .line 823
    invoke-virtual {v7, v11}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 824
    .line 825
    .line 826
    move-result v13

    .line 827
    if-ne v13, v12, :cond_18

    .line 828
    .line 829
    invoke-virtual {v7, v8, v11}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 830
    .line 831
    .line 832
    :cond_18
    add-int/lit8 v8, v8, 0x1

    .line 833
    .line 834
    goto :goto_d

    .line 835
    :cond_19
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    .line 836
    .line 837
    .line 838
    move-result v8

    .line 839
    if-lez v8, :cond_1a

    .line 840
    .line 841
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    .line 842
    .line 843
    .line 844
    move-result v8

    .line 845
    sub-int/2addr v8, v9

    .line 846
    invoke-virtual {v7, v8}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 847
    .line 848
    .line 849
    move-result v8

    .line 850
    if-ne v8, v12, :cond_1a

    .line 851
    .line 852
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    .line 853
    .line 854
    .line 855
    move-result v8

    .line 856
    sub-int/2addr v8, v9

    .line 857
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    .line 858
    .line 859
    .line 860
    move-result v9

    .line 861
    invoke-virtual {v7, v8, v9}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 862
    .line 863
    .line 864
    :cond_1a
    iget v7, v6, LV2/f;->c:F

    .line 865
    .line 866
    iput v7, v3, LP1/a;->e:F

    .line 867
    .line 868
    iget v7, v6, LV2/f;->d:I

    .line 869
    .line 870
    iput v7, v3, LP1/a;->f:I

    .line 871
    .line 872
    iget v7, v6, LV2/f;->e:I

    .line 873
    .line 874
    iput v7, v3, LP1/a;->g:I

    .line 875
    .line 876
    iget v7, v6, LV2/f;->b:F

    .line 877
    .line 878
    iput v7, v3, LP1/a;->h:F

    .line 879
    .line 880
    iget v7, v6, LV2/f;->f:F

    .line 881
    .line 882
    iput v7, v3, LP1/a;->l:F

    .line 883
    .line 884
    iget v7, v6, LV2/f;->i:F

    .line 885
    .line 886
    iput v7, v3, LP1/a;->k:F

    .line 887
    .line 888
    iget v7, v6, LV2/f;->h:I

    .line 889
    .line 890
    iput v7, v3, LP1/a;->j:I

    .line 891
    .line 892
    iget v6, v6, LV2/f;->j:I

    .line 893
    .line 894
    iput v6, v3, LP1/a;->p:I

    .line 895
    .line 896
    invoke-virtual {v3}, LP1/a;->a()LP1/b;

    .line 897
    .line 898
    .line 899
    move-result-object v3

    .line 900
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 901
    .line 902
    .line 903
    goto/16 :goto_8

    .line 904
    .line 905
    :cond_1b
    return-object v1

    .line 906
    nop

    .line 907
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method public h(Ljava/lang/String;)Z
    .locals 3

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    iget-object v0, p0, LC8/i;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object v0, p0, LC8/i;->e:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Ljava/util/ArrayDeque;

    .line 21
    .line 22
    monitor-enter v0

    .line 23
    :try_start_0
    iget-object v1, p0, LC8/i;->e:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, Ljava/util/ArrayDeque;

    .line 26
    .line 27
    invoke-virtual {v1, p1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    new-instance v1, LC8/g;

    .line 34
    .line 35
    const/16 v2, 0x13

    .line 36
    .line 37
    invoke-direct {v1, p0, v2}, LC8/g;-><init>(Ljava/lang/Object;I)V

    .line 38
    .line 39
    .line 40
    iget-object v2, p0, LC8/i;->f:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v2, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 43
    .line 44
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    monitor-exit v0

    .line 48
    return p1

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    throw p1

    .line 52
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 53
    return p1
.end method

.method public i(C[F)V
    .locals 23

    .line 1
    move/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v1, LC8/i;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, Ljava/util/ArrayList;

    .line 10
    .line 11
    const/16 v4, 0x7a

    .line 12
    .line 13
    if-ne v0, v4, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/16 v4, 0x5a

    .line 17
    .line 18
    if-ne v0, v4, :cond_1

    .line 19
    .line 20
    :goto_0
    sget-object v0, Li0/h;->c:Li0/h;

    .line 21
    .line 22
    invoke-static {v0}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    goto/16 :goto_17

    .line 27
    .line 28
    :cond_1
    const/4 v4, 0x1

    .line 29
    const/4 v5, 0x2

    .line 30
    const/16 v6, 0x6d

    .line 31
    .line 32
    const/16 v7, 0xa

    .line 33
    .line 34
    const/4 v8, 0x0

    .line 35
    if-ne v0, v6, :cond_4

    .line 36
    .line 37
    new-instance v0, Lzf/g;

    .line 38
    .line 39
    array-length v6, v2

    .line 40
    sub-int/2addr v6, v5

    .line 41
    invoke-direct {v0, v8, v6, v4}, Lzf/e;-><init>(III)V

    .line 42
    .line 43
    .line 44
    invoke-static {v0, v5}, Landroid/support/v4/media/session/b;->r0(Lzf/g;I)Lzf/e;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    new-instance v5, Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-static {v0, v7}, Lff/p;->a0(Ljava/lang/Iterable;I)I

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Lzf/e;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    :goto_1
    move-object v6, v0

    .line 62
    check-cast v6, Lzf/f;

    .line 63
    .line 64
    iget-boolean v6, v6, Lzf/f;->c:Z

    .line 65
    .line 66
    if-eqz v6, :cond_3

    .line 67
    .line 68
    move-object v6, v0

    .line 69
    check-cast v6, Lzf/f;

    .line 70
    .line 71
    invoke-virtual {v6}, Lzf/f;->a()I

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    add-int/lit8 v7, v6, 0x2

    .line 76
    .line 77
    invoke-static {v2, v6, v7}, Lff/m;->l0([FII)[F

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    new-instance v9, Li0/t;

    .line 82
    .line 83
    aget v10, v7, v8

    .line 84
    .line 85
    aget v7, v7, v4

    .line 86
    .line 87
    invoke-direct {v9, v10, v7}, Li0/t;-><init>(FF)V

    .line 88
    .line 89
    .line 90
    if-lez v6, :cond_2

    .line 91
    .line 92
    new-instance v9, Li0/s;

    .line 93
    .line 94
    invoke-direct {v9, v10, v7}, Li0/s;-><init>(FF)V

    .line 95
    .line 96
    .line 97
    :cond_2
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_3
    move-object v0, v5

    .line 102
    goto/16 :goto_17

    .line 103
    .line 104
    :cond_4
    const/16 v6, 0x4d

    .line 105
    .line 106
    if-ne v0, v6, :cond_6

    .line 107
    .line 108
    new-instance v0, Lzf/g;

    .line 109
    .line 110
    array-length v6, v2

    .line 111
    sub-int/2addr v6, v5

    .line 112
    invoke-direct {v0, v8, v6, v4}, Lzf/e;-><init>(III)V

    .line 113
    .line 114
    .line 115
    invoke-static {v0, v5}, Landroid/support/v4/media/session/b;->r0(Lzf/g;I)Lzf/e;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    new-instance v5, Ljava/util/ArrayList;

    .line 120
    .line 121
    invoke-static {v0, v7}, Lff/p;->a0(Ljava/lang/Iterable;I)I

    .line 122
    .line 123
    .line 124
    move-result v6

    .line 125
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0}, Lzf/e;->iterator()Ljava/util/Iterator;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    :goto_2
    move-object v6, v0

    .line 133
    check-cast v6, Lzf/f;

    .line 134
    .line 135
    iget-boolean v6, v6, Lzf/f;->c:Z

    .line 136
    .line 137
    if-eqz v6, :cond_3

    .line 138
    .line 139
    move-object v6, v0

    .line 140
    check-cast v6, Lzf/f;

    .line 141
    .line 142
    invoke-virtual {v6}, Lzf/f;->a()I

    .line 143
    .line 144
    .line 145
    move-result v6

    .line 146
    add-int/lit8 v7, v6, 0x2

    .line 147
    .line 148
    invoke-static {v2, v6, v7}, Lff/m;->l0([FII)[F

    .line 149
    .line 150
    .line 151
    move-result-object v7

    .line 152
    new-instance v9, Li0/l;

    .line 153
    .line 154
    aget v10, v7, v8

    .line 155
    .line 156
    aget v7, v7, v4

    .line 157
    .line 158
    invoke-direct {v9, v10, v7}, Li0/l;-><init>(FF)V

    .line 159
    .line 160
    .line 161
    if-lez v6, :cond_5

    .line 162
    .line 163
    new-instance v9, Li0/k;

    .line 164
    .line 165
    invoke-direct {v9, v10, v7}, Li0/k;-><init>(FF)V

    .line 166
    .line 167
    .line 168
    :cond_5
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    goto :goto_2

    .line 172
    :cond_6
    const/16 v6, 0x6c

    .line 173
    .line 174
    if-ne v0, v6, :cond_7

    .line 175
    .line 176
    new-instance v0, Lzf/g;

    .line 177
    .line 178
    array-length v6, v2

    .line 179
    sub-int/2addr v6, v5

    .line 180
    invoke-direct {v0, v8, v6, v4}, Lzf/e;-><init>(III)V

    .line 181
    .line 182
    .line 183
    invoke-static {v0, v5}, Landroid/support/v4/media/session/b;->r0(Lzf/g;I)Lzf/e;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    new-instance v5, Ljava/util/ArrayList;

    .line 188
    .line 189
    invoke-static {v0, v7}, Lff/p;->a0(Ljava/lang/Iterable;I)I

    .line 190
    .line 191
    .line 192
    move-result v6

    .line 193
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v0}, Lzf/e;->iterator()Ljava/util/Iterator;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    :goto_3
    move-object v6, v0

    .line 201
    check-cast v6, Lzf/f;

    .line 202
    .line 203
    iget-boolean v6, v6, Lzf/f;->c:Z

    .line 204
    .line 205
    if-eqz v6, :cond_3

    .line 206
    .line 207
    move-object v6, v0

    .line 208
    check-cast v6, Lzf/f;

    .line 209
    .line 210
    invoke-virtual {v6}, Lzf/f;->a()I

    .line 211
    .line 212
    .line 213
    move-result v6

    .line 214
    add-int/lit8 v7, v6, 0x2

    .line 215
    .line 216
    invoke-static {v2, v6, v7}, Lff/m;->l0([FII)[F

    .line 217
    .line 218
    .line 219
    move-result-object v6

    .line 220
    new-instance v7, Li0/s;

    .line 221
    .line 222
    aget v9, v6, v8

    .line 223
    .line 224
    aget v6, v6, v4

    .line 225
    .line 226
    invoke-direct {v7, v9, v6}, Li0/s;-><init>(FF)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    goto :goto_3

    .line 233
    :cond_7
    const/16 v6, 0x4c

    .line 234
    .line 235
    if-ne v0, v6, :cond_8

    .line 236
    .line 237
    new-instance v0, Lzf/g;

    .line 238
    .line 239
    array-length v6, v2

    .line 240
    sub-int/2addr v6, v5

    .line 241
    invoke-direct {v0, v8, v6, v4}, Lzf/e;-><init>(III)V

    .line 242
    .line 243
    .line 244
    invoke-static {v0, v5}, Landroid/support/v4/media/session/b;->r0(Lzf/g;I)Lzf/e;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    new-instance v5, Ljava/util/ArrayList;

    .line 249
    .line 250
    invoke-static {v0, v7}, Lff/p;->a0(Ljava/lang/Iterable;I)I

    .line 251
    .line 252
    .line 253
    move-result v6

    .line 254
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v0}, Lzf/e;->iterator()Ljava/util/Iterator;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    :goto_4
    move-object v6, v0

    .line 262
    check-cast v6, Lzf/f;

    .line 263
    .line 264
    iget-boolean v6, v6, Lzf/f;->c:Z

    .line 265
    .line 266
    if-eqz v6, :cond_3

    .line 267
    .line 268
    move-object v6, v0

    .line 269
    check-cast v6, Lzf/f;

    .line 270
    .line 271
    invoke-virtual {v6}, Lzf/f;->a()I

    .line 272
    .line 273
    .line 274
    move-result v6

    .line 275
    add-int/lit8 v7, v6, 0x2

    .line 276
    .line 277
    invoke-static {v2, v6, v7}, Lff/m;->l0([FII)[F

    .line 278
    .line 279
    .line 280
    move-result-object v6

    .line 281
    new-instance v7, Li0/k;

    .line 282
    .line 283
    aget v9, v6, v8

    .line 284
    .line 285
    aget v6, v6, v4

    .line 286
    .line 287
    invoke-direct {v7, v9, v6}, Li0/k;-><init>(FF)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    goto :goto_4

    .line 294
    :cond_8
    const/16 v6, 0x68

    .line 295
    .line 296
    if-ne v0, v6, :cond_a

    .line 297
    .line 298
    new-instance v0, Lzf/g;

    .line 299
    .line 300
    array-length v5, v2

    .line 301
    sub-int/2addr v5, v4

    .line 302
    invoke-direct {v0, v8, v5, v4}, Lzf/e;-><init>(III)V

    .line 303
    .line 304
    .line 305
    invoke-static {v0, v4}, Landroid/support/v4/media/session/b;->r0(Lzf/g;I)Lzf/e;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    new-instance v4, Ljava/util/ArrayList;

    .line 310
    .line 311
    invoke-static {v0, v7}, Lff/p;->a0(Ljava/lang/Iterable;I)I

    .line 312
    .line 313
    .line 314
    move-result v5

    .line 315
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v0}, Lzf/e;->iterator()Ljava/util/Iterator;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    :goto_5
    move-object v5, v0

    .line 323
    check-cast v5, Lzf/f;

    .line 324
    .line 325
    iget-boolean v5, v5, Lzf/f;->c:Z

    .line 326
    .line 327
    if-eqz v5, :cond_9

    .line 328
    .line 329
    move-object v5, v0

    .line 330
    check-cast v5, Lzf/f;

    .line 331
    .line 332
    invoke-virtual {v5}, Lzf/f;->a()I

    .line 333
    .line 334
    .line 335
    move-result v5

    .line 336
    add-int/lit8 v6, v5, 0x1

    .line 337
    .line 338
    invoke-static {v2, v5, v6}, Lff/m;->l0([FII)[F

    .line 339
    .line 340
    .line 341
    move-result-object v5

    .line 342
    new-instance v6, Li0/r;

    .line 343
    .line 344
    aget v5, v5, v8

    .line 345
    .line 346
    invoke-direct {v6, v5}, Li0/r;-><init>(F)V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 350
    .line 351
    .line 352
    goto :goto_5

    .line 353
    :cond_9
    move-object v0, v4

    .line 354
    goto/16 :goto_17

    .line 355
    .line 356
    :cond_a
    const/16 v6, 0x48

    .line 357
    .line 358
    if-ne v0, v6, :cond_b

    .line 359
    .line 360
    new-instance v0, Lzf/g;

    .line 361
    .line 362
    array-length v5, v2

    .line 363
    sub-int/2addr v5, v4

    .line 364
    invoke-direct {v0, v8, v5, v4}, Lzf/e;-><init>(III)V

    .line 365
    .line 366
    .line 367
    invoke-static {v0, v4}, Landroid/support/v4/media/session/b;->r0(Lzf/g;I)Lzf/e;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    new-instance v4, Ljava/util/ArrayList;

    .line 372
    .line 373
    invoke-static {v0, v7}, Lff/p;->a0(Ljava/lang/Iterable;I)I

    .line 374
    .line 375
    .line 376
    move-result v5

    .line 377
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 378
    .line 379
    .line 380
    invoke-virtual {v0}, Lzf/e;->iterator()Ljava/util/Iterator;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    :goto_6
    move-object v5, v0

    .line 385
    check-cast v5, Lzf/f;

    .line 386
    .line 387
    iget-boolean v5, v5, Lzf/f;->c:Z

    .line 388
    .line 389
    if-eqz v5, :cond_9

    .line 390
    .line 391
    move-object v5, v0

    .line 392
    check-cast v5, Lzf/f;

    .line 393
    .line 394
    invoke-virtual {v5}, Lzf/f;->a()I

    .line 395
    .line 396
    .line 397
    move-result v5

    .line 398
    add-int/lit8 v6, v5, 0x1

    .line 399
    .line 400
    invoke-static {v2, v5, v6}, Lff/m;->l0([FII)[F

    .line 401
    .line 402
    .line 403
    move-result-object v5

    .line 404
    new-instance v6, Li0/j;

    .line 405
    .line 406
    aget v5, v5, v8

    .line 407
    .line 408
    invoke-direct {v6, v5}, Li0/j;-><init>(F)V

    .line 409
    .line 410
    .line 411
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 412
    .line 413
    .line 414
    goto :goto_6

    .line 415
    :cond_b
    const/16 v6, 0x76

    .line 416
    .line 417
    if-ne v0, v6, :cond_c

    .line 418
    .line 419
    new-instance v0, Lzf/g;

    .line 420
    .line 421
    array-length v5, v2

    .line 422
    sub-int/2addr v5, v4

    .line 423
    invoke-direct {v0, v8, v5, v4}, Lzf/e;-><init>(III)V

    .line 424
    .line 425
    .line 426
    invoke-static {v0, v4}, Landroid/support/v4/media/session/b;->r0(Lzf/g;I)Lzf/e;

    .line 427
    .line 428
    .line 429
    move-result-object v0

    .line 430
    new-instance v4, Ljava/util/ArrayList;

    .line 431
    .line 432
    invoke-static {v0, v7}, Lff/p;->a0(Ljava/lang/Iterable;I)I

    .line 433
    .line 434
    .line 435
    move-result v5

    .line 436
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 437
    .line 438
    .line 439
    invoke-virtual {v0}, Lzf/e;->iterator()Ljava/util/Iterator;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    :goto_7
    move-object v5, v0

    .line 444
    check-cast v5, Lzf/f;

    .line 445
    .line 446
    iget-boolean v5, v5, Lzf/f;->c:Z

    .line 447
    .line 448
    if-eqz v5, :cond_9

    .line 449
    .line 450
    move-object v5, v0

    .line 451
    check-cast v5, Lzf/f;

    .line 452
    .line 453
    invoke-virtual {v5}, Lzf/f;->a()I

    .line 454
    .line 455
    .line 456
    move-result v5

    .line 457
    add-int/lit8 v6, v5, 0x1

    .line 458
    .line 459
    invoke-static {v2, v5, v6}, Lff/m;->l0([FII)[F

    .line 460
    .line 461
    .line 462
    move-result-object v5

    .line 463
    new-instance v6, Li0/x;

    .line 464
    .line 465
    aget v5, v5, v8

    .line 466
    .line 467
    invoke-direct {v6, v5}, Li0/x;-><init>(F)V

    .line 468
    .line 469
    .line 470
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 471
    .line 472
    .line 473
    goto :goto_7

    .line 474
    :cond_c
    const/16 v6, 0x56

    .line 475
    .line 476
    if-ne v0, v6, :cond_d

    .line 477
    .line 478
    new-instance v0, Lzf/g;

    .line 479
    .line 480
    array-length v5, v2

    .line 481
    sub-int/2addr v5, v4

    .line 482
    invoke-direct {v0, v8, v5, v4}, Lzf/e;-><init>(III)V

    .line 483
    .line 484
    .line 485
    invoke-static {v0, v4}, Landroid/support/v4/media/session/b;->r0(Lzf/g;I)Lzf/e;

    .line 486
    .line 487
    .line 488
    move-result-object v0

    .line 489
    new-instance v4, Ljava/util/ArrayList;

    .line 490
    .line 491
    invoke-static {v0, v7}, Lff/p;->a0(Ljava/lang/Iterable;I)I

    .line 492
    .line 493
    .line 494
    move-result v5

    .line 495
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 496
    .line 497
    .line 498
    invoke-virtual {v0}, Lzf/e;->iterator()Ljava/util/Iterator;

    .line 499
    .line 500
    .line 501
    move-result-object v0

    .line 502
    :goto_8
    move-object v5, v0

    .line 503
    check-cast v5, Lzf/f;

    .line 504
    .line 505
    iget-boolean v5, v5, Lzf/f;->c:Z

    .line 506
    .line 507
    if-eqz v5, :cond_9

    .line 508
    .line 509
    move-object v5, v0

    .line 510
    check-cast v5, Lzf/f;

    .line 511
    .line 512
    invoke-virtual {v5}, Lzf/f;->a()I

    .line 513
    .line 514
    .line 515
    move-result v5

    .line 516
    add-int/lit8 v6, v5, 0x1

    .line 517
    .line 518
    invoke-static {v2, v5, v6}, Lff/m;->l0([FII)[F

    .line 519
    .line 520
    .line 521
    move-result-object v5

    .line 522
    new-instance v6, Li0/y;

    .line 523
    .line 524
    aget v5, v5, v8

    .line 525
    .line 526
    invoke-direct {v6, v5}, Li0/y;-><init>(F)V

    .line 527
    .line 528
    .line 529
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 530
    .line 531
    .line 532
    goto :goto_8

    .line 533
    :cond_d
    const/4 v6, 0x6

    .line 534
    const/4 v9, 0x4

    .line 535
    const/16 v10, 0x63

    .line 536
    .line 537
    const/4 v11, 0x5

    .line 538
    const/4 v12, 0x3

    .line 539
    if-ne v0, v10, :cond_f

    .line 540
    .line 541
    new-instance v0, Lzf/g;

    .line 542
    .line 543
    array-length v10, v2

    .line 544
    sub-int/2addr v10, v6

    .line 545
    invoke-direct {v0, v8, v10, v4}, Lzf/e;-><init>(III)V

    .line 546
    .line 547
    .line 548
    invoke-static {v0, v6}, Landroid/support/v4/media/session/b;->r0(Lzf/g;I)Lzf/e;

    .line 549
    .line 550
    .line 551
    move-result-object v0

    .line 552
    new-instance v6, Ljava/util/ArrayList;

    .line 553
    .line 554
    invoke-static {v0, v7}, Lff/p;->a0(Ljava/lang/Iterable;I)I

    .line 555
    .line 556
    .line 557
    move-result v7

    .line 558
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 559
    .line 560
    .line 561
    invoke-virtual {v0}, Lzf/e;->iterator()Ljava/util/Iterator;

    .line 562
    .line 563
    .line 564
    move-result-object v0

    .line 565
    :goto_9
    move-object v7, v0

    .line 566
    check-cast v7, Lzf/f;

    .line 567
    .line 568
    iget-boolean v7, v7, Lzf/f;->c:Z

    .line 569
    .line 570
    if-eqz v7, :cond_e

    .line 571
    .line 572
    move-object v7, v0

    .line 573
    check-cast v7, Lzf/f;

    .line 574
    .line 575
    invoke-virtual {v7}, Lzf/f;->a()I

    .line 576
    .line 577
    .line 578
    move-result v7

    .line 579
    add-int/lit8 v10, v7, 0x6

    .line 580
    .line 581
    invoke-static {v2, v7, v10}, Lff/m;->l0([FII)[F

    .line 582
    .line 583
    .line 584
    move-result-object v7

    .line 585
    new-instance v13, Li0/q;

    .line 586
    .line 587
    aget v14, v7, v8

    .line 588
    .line 589
    aget v15, v7, v4

    .line 590
    .line 591
    aget v16, v7, v5

    .line 592
    .line 593
    aget v17, v7, v12

    .line 594
    .line 595
    aget v18, v7, v9

    .line 596
    .line 597
    aget v19, v7, v11

    .line 598
    .line 599
    invoke-direct/range {v13 .. v19}, Li0/q;-><init>(FFFFFF)V

    .line 600
    .line 601
    .line 602
    invoke-virtual {v6, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 603
    .line 604
    .line 605
    goto :goto_9

    .line 606
    :cond_e
    move-object v0, v6

    .line 607
    goto/16 :goto_17

    .line 608
    .line 609
    :cond_f
    const/16 v10, 0x43

    .line 610
    .line 611
    if-ne v0, v10, :cond_10

    .line 612
    .line 613
    new-instance v0, Lzf/g;

    .line 614
    .line 615
    array-length v10, v2

    .line 616
    sub-int/2addr v10, v6

    .line 617
    invoke-direct {v0, v8, v10, v4}, Lzf/e;-><init>(III)V

    .line 618
    .line 619
    .line 620
    invoke-static {v0, v6}, Landroid/support/v4/media/session/b;->r0(Lzf/g;I)Lzf/e;

    .line 621
    .line 622
    .line 623
    move-result-object v0

    .line 624
    new-instance v6, Ljava/util/ArrayList;

    .line 625
    .line 626
    invoke-static {v0, v7}, Lff/p;->a0(Ljava/lang/Iterable;I)I

    .line 627
    .line 628
    .line 629
    move-result v7

    .line 630
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 631
    .line 632
    .line 633
    invoke-virtual {v0}, Lzf/e;->iterator()Ljava/util/Iterator;

    .line 634
    .line 635
    .line 636
    move-result-object v0

    .line 637
    :goto_a
    move-object v7, v0

    .line 638
    check-cast v7, Lzf/f;

    .line 639
    .line 640
    iget-boolean v7, v7, Lzf/f;->c:Z

    .line 641
    .line 642
    if-eqz v7, :cond_e

    .line 643
    .line 644
    move-object v7, v0

    .line 645
    check-cast v7, Lzf/f;

    .line 646
    .line 647
    invoke-virtual {v7}, Lzf/f;->a()I

    .line 648
    .line 649
    .line 650
    move-result v7

    .line 651
    add-int/lit8 v10, v7, 0x6

    .line 652
    .line 653
    invoke-static {v2, v7, v10}, Lff/m;->l0([FII)[F

    .line 654
    .line 655
    .line 656
    move-result-object v7

    .line 657
    new-instance v13, Li0/i;

    .line 658
    .line 659
    aget v14, v7, v8

    .line 660
    .line 661
    aget v15, v7, v4

    .line 662
    .line 663
    aget v16, v7, v5

    .line 664
    .line 665
    aget v17, v7, v12

    .line 666
    .line 667
    aget v18, v7, v9

    .line 668
    .line 669
    aget v19, v7, v11

    .line 670
    .line 671
    invoke-direct/range {v13 .. v19}, Li0/i;-><init>(FFFFFF)V

    .line 672
    .line 673
    .line 674
    invoke-virtual {v6, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 675
    .line 676
    .line 677
    goto :goto_a

    .line 678
    :cond_10
    const/16 v10, 0x73

    .line 679
    .line 680
    if-ne v0, v10, :cond_11

    .line 681
    .line 682
    new-instance v0, Lzf/g;

    .line 683
    .line 684
    array-length v6, v2

    .line 685
    sub-int/2addr v6, v9

    .line 686
    invoke-direct {v0, v8, v6, v4}, Lzf/e;-><init>(III)V

    .line 687
    .line 688
    .line 689
    invoke-static {v0, v9}, Landroid/support/v4/media/session/b;->r0(Lzf/g;I)Lzf/e;

    .line 690
    .line 691
    .line 692
    move-result-object v0

    .line 693
    new-instance v6, Ljava/util/ArrayList;

    .line 694
    .line 695
    invoke-static {v0, v7}, Lff/p;->a0(Ljava/lang/Iterable;I)I

    .line 696
    .line 697
    .line 698
    move-result v7

    .line 699
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 700
    .line 701
    .line 702
    invoke-virtual {v0}, Lzf/e;->iterator()Ljava/util/Iterator;

    .line 703
    .line 704
    .line 705
    move-result-object v0

    .line 706
    :goto_b
    move-object v7, v0

    .line 707
    check-cast v7, Lzf/f;

    .line 708
    .line 709
    iget-boolean v7, v7, Lzf/f;->c:Z

    .line 710
    .line 711
    if-eqz v7, :cond_e

    .line 712
    .line 713
    move-object v7, v0

    .line 714
    check-cast v7, Lzf/f;

    .line 715
    .line 716
    invoke-virtual {v7}, Lzf/f;->a()I

    .line 717
    .line 718
    .line 719
    move-result v7

    .line 720
    add-int/lit8 v9, v7, 0x4

    .line 721
    .line 722
    invoke-static {v2, v7, v9}, Lff/m;->l0([FII)[F

    .line 723
    .line 724
    .line 725
    move-result-object v7

    .line 726
    new-instance v9, Li0/v;

    .line 727
    .line 728
    aget v10, v7, v8

    .line 729
    .line 730
    aget v11, v7, v4

    .line 731
    .line 732
    aget v13, v7, v5

    .line 733
    .line 734
    aget v7, v7, v12

    .line 735
    .line 736
    invoke-direct {v9, v10, v11, v13, v7}, Li0/v;-><init>(FFFF)V

    .line 737
    .line 738
    .line 739
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 740
    .line 741
    .line 742
    goto :goto_b

    .line 743
    :cond_11
    const/16 v10, 0x53

    .line 744
    .line 745
    if-ne v0, v10, :cond_12

    .line 746
    .line 747
    new-instance v0, Lzf/g;

    .line 748
    .line 749
    array-length v6, v2

    .line 750
    sub-int/2addr v6, v9

    .line 751
    invoke-direct {v0, v8, v6, v4}, Lzf/e;-><init>(III)V

    .line 752
    .line 753
    .line 754
    invoke-static {v0, v9}, Landroid/support/v4/media/session/b;->r0(Lzf/g;I)Lzf/e;

    .line 755
    .line 756
    .line 757
    move-result-object v0

    .line 758
    new-instance v6, Ljava/util/ArrayList;

    .line 759
    .line 760
    invoke-static {v0, v7}, Lff/p;->a0(Ljava/lang/Iterable;I)I

    .line 761
    .line 762
    .line 763
    move-result v7

    .line 764
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 765
    .line 766
    .line 767
    invoke-virtual {v0}, Lzf/e;->iterator()Ljava/util/Iterator;

    .line 768
    .line 769
    .line 770
    move-result-object v0

    .line 771
    :goto_c
    move-object v7, v0

    .line 772
    check-cast v7, Lzf/f;

    .line 773
    .line 774
    iget-boolean v7, v7, Lzf/f;->c:Z

    .line 775
    .line 776
    if-eqz v7, :cond_e

    .line 777
    .line 778
    move-object v7, v0

    .line 779
    check-cast v7, Lzf/f;

    .line 780
    .line 781
    invoke-virtual {v7}, Lzf/f;->a()I

    .line 782
    .line 783
    .line 784
    move-result v7

    .line 785
    add-int/lit8 v9, v7, 0x4

    .line 786
    .line 787
    invoke-static {v2, v7, v9}, Lff/m;->l0([FII)[F

    .line 788
    .line 789
    .line 790
    move-result-object v7

    .line 791
    new-instance v9, Li0/n;

    .line 792
    .line 793
    aget v10, v7, v8

    .line 794
    .line 795
    aget v11, v7, v4

    .line 796
    .line 797
    aget v13, v7, v5

    .line 798
    .line 799
    aget v7, v7, v12

    .line 800
    .line 801
    invoke-direct {v9, v10, v11, v13, v7}, Li0/n;-><init>(FFFF)V

    .line 802
    .line 803
    .line 804
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 805
    .line 806
    .line 807
    goto :goto_c

    .line 808
    :cond_12
    const/16 v10, 0x71

    .line 809
    .line 810
    if-ne v0, v10, :cond_13

    .line 811
    .line 812
    new-instance v0, Lzf/g;

    .line 813
    .line 814
    array-length v6, v2

    .line 815
    sub-int/2addr v6, v9

    .line 816
    invoke-direct {v0, v8, v6, v4}, Lzf/e;-><init>(III)V

    .line 817
    .line 818
    .line 819
    invoke-static {v0, v9}, Landroid/support/v4/media/session/b;->r0(Lzf/g;I)Lzf/e;

    .line 820
    .line 821
    .line 822
    move-result-object v0

    .line 823
    new-instance v6, Ljava/util/ArrayList;

    .line 824
    .line 825
    invoke-static {v0, v7}, Lff/p;->a0(Ljava/lang/Iterable;I)I

    .line 826
    .line 827
    .line 828
    move-result v7

    .line 829
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 830
    .line 831
    .line 832
    invoke-virtual {v0}, Lzf/e;->iterator()Ljava/util/Iterator;

    .line 833
    .line 834
    .line 835
    move-result-object v0

    .line 836
    :goto_d
    move-object v7, v0

    .line 837
    check-cast v7, Lzf/f;

    .line 838
    .line 839
    iget-boolean v7, v7, Lzf/f;->c:Z

    .line 840
    .line 841
    if-eqz v7, :cond_e

    .line 842
    .line 843
    move-object v7, v0

    .line 844
    check-cast v7, Lzf/f;

    .line 845
    .line 846
    invoke-virtual {v7}, Lzf/f;->a()I

    .line 847
    .line 848
    .line 849
    move-result v7

    .line 850
    add-int/lit8 v9, v7, 0x4

    .line 851
    .line 852
    invoke-static {v2, v7, v9}, Lff/m;->l0([FII)[F

    .line 853
    .line 854
    .line 855
    move-result-object v7

    .line 856
    new-instance v9, Li0/u;

    .line 857
    .line 858
    aget v10, v7, v8

    .line 859
    .line 860
    aget v11, v7, v4

    .line 861
    .line 862
    aget v13, v7, v5

    .line 863
    .line 864
    aget v7, v7, v12

    .line 865
    .line 866
    invoke-direct {v9, v10, v11, v13, v7}, Li0/u;-><init>(FFFF)V

    .line 867
    .line 868
    .line 869
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 870
    .line 871
    .line 872
    goto :goto_d

    .line 873
    :cond_13
    const/16 v10, 0x51

    .line 874
    .line 875
    if-ne v0, v10, :cond_14

    .line 876
    .line 877
    new-instance v0, Lzf/g;

    .line 878
    .line 879
    array-length v6, v2

    .line 880
    sub-int/2addr v6, v9

    .line 881
    invoke-direct {v0, v8, v6, v4}, Lzf/e;-><init>(III)V

    .line 882
    .line 883
    .line 884
    invoke-static {v0, v9}, Landroid/support/v4/media/session/b;->r0(Lzf/g;I)Lzf/e;

    .line 885
    .line 886
    .line 887
    move-result-object v0

    .line 888
    new-instance v6, Ljava/util/ArrayList;

    .line 889
    .line 890
    invoke-static {v0, v7}, Lff/p;->a0(Ljava/lang/Iterable;I)I

    .line 891
    .line 892
    .line 893
    move-result v7

    .line 894
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 895
    .line 896
    .line 897
    invoke-virtual {v0}, Lzf/e;->iterator()Ljava/util/Iterator;

    .line 898
    .line 899
    .line 900
    move-result-object v0

    .line 901
    :goto_e
    move-object v7, v0

    .line 902
    check-cast v7, Lzf/f;

    .line 903
    .line 904
    iget-boolean v7, v7, Lzf/f;->c:Z

    .line 905
    .line 906
    if-eqz v7, :cond_e

    .line 907
    .line 908
    move-object v7, v0

    .line 909
    check-cast v7, Lzf/f;

    .line 910
    .line 911
    invoke-virtual {v7}, Lzf/f;->a()I

    .line 912
    .line 913
    .line 914
    move-result v7

    .line 915
    add-int/lit8 v9, v7, 0x4

    .line 916
    .line 917
    invoke-static {v2, v7, v9}, Lff/m;->l0([FII)[F

    .line 918
    .line 919
    .line 920
    move-result-object v7

    .line 921
    new-instance v9, Li0/m;

    .line 922
    .line 923
    aget v10, v7, v8

    .line 924
    .line 925
    aget v11, v7, v4

    .line 926
    .line 927
    aget v13, v7, v5

    .line 928
    .line 929
    aget v7, v7, v12

    .line 930
    .line 931
    invoke-direct {v9, v10, v11, v13, v7}, Li0/m;-><init>(FFFF)V

    .line 932
    .line 933
    .line 934
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 935
    .line 936
    .line 937
    goto :goto_e

    .line 938
    :cond_14
    const/16 v10, 0x74

    .line 939
    .line 940
    if-ne v0, v10, :cond_15

    .line 941
    .line 942
    new-instance v0, Lzf/g;

    .line 943
    .line 944
    array-length v6, v2

    .line 945
    sub-int/2addr v6, v5

    .line 946
    invoke-direct {v0, v8, v6, v4}, Lzf/e;-><init>(III)V

    .line 947
    .line 948
    .line 949
    invoke-static {v0, v5}, Landroid/support/v4/media/session/b;->r0(Lzf/g;I)Lzf/e;

    .line 950
    .line 951
    .line 952
    move-result-object v0

    .line 953
    new-instance v5, Ljava/util/ArrayList;

    .line 954
    .line 955
    invoke-static {v0, v7}, Lff/p;->a0(Ljava/lang/Iterable;I)I

    .line 956
    .line 957
    .line 958
    move-result v6

    .line 959
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 960
    .line 961
    .line 962
    invoke-virtual {v0}, Lzf/e;->iterator()Ljava/util/Iterator;

    .line 963
    .line 964
    .line 965
    move-result-object v0

    .line 966
    :goto_f
    move-object v6, v0

    .line 967
    check-cast v6, Lzf/f;

    .line 968
    .line 969
    iget-boolean v6, v6, Lzf/f;->c:Z

    .line 970
    .line 971
    if-eqz v6, :cond_3

    .line 972
    .line 973
    move-object v6, v0

    .line 974
    check-cast v6, Lzf/f;

    .line 975
    .line 976
    invoke-virtual {v6}, Lzf/f;->a()I

    .line 977
    .line 978
    .line 979
    move-result v6

    .line 980
    add-int/lit8 v7, v6, 0x2

    .line 981
    .line 982
    invoke-static {v2, v6, v7}, Lff/m;->l0([FII)[F

    .line 983
    .line 984
    .line 985
    move-result-object v6

    .line 986
    new-instance v7, Li0/w;

    .line 987
    .line 988
    aget v9, v6, v8

    .line 989
    .line 990
    aget v6, v6, v4

    .line 991
    .line 992
    invoke-direct {v7, v9, v6}, Li0/w;-><init>(FF)V

    .line 993
    .line 994
    .line 995
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 996
    .line 997
    .line 998
    goto :goto_f

    .line 999
    :cond_15
    const/16 v10, 0x54

    .line 1000
    .line 1001
    if-ne v0, v10, :cond_16

    .line 1002
    .line 1003
    new-instance v0, Lzf/g;

    .line 1004
    .line 1005
    array-length v6, v2

    .line 1006
    sub-int/2addr v6, v5

    .line 1007
    invoke-direct {v0, v8, v6, v4}, Lzf/e;-><init>(III)V

    .line 1008
    .line 1009
    .line 1010
    invoke-static {v0, v5}, Landroid/support/v4/media/session/b;->r0(Lzf/g;I)Lzf/e;

    .line 1011
    .line 1012
    .line 1013
    move-result-object v0

    .line 1014
    new-instance v5, Ljava/util/ArrayList;

    .line 1015
    .line 1016
    invoke-static {v0, v7}, Lff/p;->a0(Ljava/lang/Iterable;I)I

    .line 1017
    .line 1018
    .line 1019
    move-result v6

    .line 1020
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 1021
    .line 1022
    .line 1023
    invoke-virtual {v0}, Lzf/e;->iterator()Ljava/util/Iterator;

    .line 1024
    .line 1025
    .line 1026
    move-result-object v0

    .line 1027
    :goto_10
    move-object v6, v0

    .line 1028
    check-cast v6, Lzf/f;

    .line 1029
    .line 1030
    iget-boolean v6, v6, Lzf/f;->c:Z

    .line 1031
    .line 1032
    if-eqz v6, :cond_3

    .line 1033
    .line 1034
    move-object v6, v0

    .line 1035
    check-cast v6, Lzf/f;

    .line 1036
    .line 1037
    invoke-virtual {v6}, Lzf/f;->a()I

    .line 1038
    .line 1039
    .line 1040
    move-result v6

    .line 1041
    add-int/lit8 v7, v6, 0x2

    .line 1042
    .line 1043
    invoke-static {v2, v6, v7}, Lff/m;->l0([FII)[F

    .line 1044
    .line 1045
    .line 1046
    move-result-object v6

    .line 1047
    new-instance v7, Li0/o;

    .line 1048
    .line 1049
    aget v9, v6, v8

    .line 1050
    .line 1051
    aget v6, v6, v4

    .line 1052
    .line 1053
    invoke-direct {v7, v9, v6}, Li0/o;-><init>(FF)V

    .line 1054
    .line 1055
    .line 1056
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1057
    .line 1058
    .line 1059
    goto :goto_10

    .line 1060
    :cond_16
    const/4 v10, 0x7

    .line 1061
    const/16 v13, 0x61

    .line 1062
    .line 1063
    const/4 v14, 0x0

    .line 1064
    if-ne v0, v13, :cond_1a

    .line 1065
    .line 1066
    new-instance v0, Lzf/g;

    .line 1067
    .line 1068
    array-length v13, v2

    .line 1069
    sub-int/2addr v13, v10

    .line 1070
    invoke-direct {v0, v8, v13, v4}, Lzf/e;-><init>(III)V

    .line 1071
    .line 1072
    .line 1073
    invoke-static {v0, v10}, Landroid/support/v4/media/session/b;->r0(Lzf/g;I)Lzf/e;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v0

    .line 1077
    new-instance v10, Ljava/util/ArrayList;

    .line 1078
    .line 1079
    invoke-static {v0, v7}, Lff/p;->a0(Ljava/lang/Iterable;I)I

    .line 1080
    .line 1081
    .line 1082
    move-result v7

    .line 1083
    invoke-direct {v10, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 1084
    .line 1085
    .line 1086
    invoke-virtual {v0}, Lzf/e;->iterator()Ljava/util/Iterator;

    .line 1087
    .line 1088
    .line 1089
    move-result-object v0

    .line 1090
    :goto_11
    move-object v7, v0

    .line 1091
    check-cast v7, Lzf/f;

    .line 1092
    .line 1093
    iget-boolean v7, v7, Lzf/f;->c:Z

    .line 1094
    .line 1095
    if-eqz v7, :cond_19

    .line 1096
    .line 1097
    move-object v7, v0

    .line 1098
    check-cast v7, Lzf/f;

    .line 1099
    .line 1100
    invoke-virtual {v7}, Lzf/f;->a()I

    .line 1101
    .line 1102
    .line 1103
    move-result v7

    .line 1104
    add-int/lit8 v13, v7, 0x7

    .line 1105
    .line 1106
    invoke-static {v2, v7, v13}, Lff/m;->l0([FII)[F

    .line 1107
    .line 1108
    .line 1109
    move-result-object v7

    .line 1110
    new-instance v15, Li0/p;

    .line 1111
    .line 1112
    aget v16, v7, v8

    .line 1113
    .line 1114
    aget v17, v7, v4

    .line 1115
    .line 1116
    aget v18, v7, v5

    .line 1117
    .line 1118
    aget v13, v7, v12

    .line 1119
    .line 1120
    invoke-static {v13, v14}, Ljava/lang/Float;->compare(FF)I

    .line 1121
    .line 1122
    .line 1123
    move-result v13

    .line 1124
    if-eqz v13, :cond_17

    .line 1125
    .line 1126
    move/from16 v19, v4

    .line 1127
    .line 1128
    goto :goto_12

    .line 1129
    :cond_17
    move/from16 v19, v8

    .line 1130
    .line 1131
    :goto_12
    aget v13, v7, v9

    .line 1132
    .line 1133
    invoke-static {v13, v14}, Ljava/lang/Float;->compare(FF)I

    .line 1134
    .line 1135
    .line 1136
    move-result v13

    .line 1137
    if-eqz v13, :cond_18

    .line 1138
    .line 1139
    move/from16 v20, v4

    .line 1140
    .line 1141
    goto :goto_13

    .line 1142
    :cond_18
    move/from16 v20, v8

    .line 1143
    .line 1144
    :goto_13
    aget v21, v7, v11

    .line 1145
    .line 1146
    aget v22, v7, v6

    .line 1147
    .line 1148
    invoke-direct/range {v15 .. v22}, Li0/p;-><init>(FFFZZFF)V

    .line 1149
    .line 1150
    .line 1151
    invoke-virtual {v10, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1152
    .line 1153
    .line 1154
    goto :goto_11

    .line 1155
    :cond_19
    move-object v0, v10

    .line 1156
    goto :goto_17

    .line 1157
    :cond_1a
    const/16 v13, 0x41

    .line 1158
    .line 1159
    if-ne v0, v13, :cond_1d

    .line 1160
    .line 1161
    new-instance v0, Lzf/g;

    .line 1162
    .line 1163
    array-length v13, v2

    .line 1164
    sub-int/2addr v13, v10

    .line 1165
    invoke-direct {v0, v8, v13, v4}, Lzf/e;-><init>(III)V

    .line 1166
    .line 1167
    .line 1168
    invoke-static {v0, v10}, Landroid/support/v4/media/session/b;->r0(Lzf/g;I)Lzf/e;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v0

    .line 1172
    new-instance v10, Ljava/util/ArrayList;

    .line 1173
    .line 1174
    invoke-static {v0, v7}, Lff/p;->a0(Ljava/lang/Iterable;I)I

    .line 1175
    .line 1176
    .line 1177
    move-result v7

    .line 1178
    invoke-direct {v10, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 1179
    .line 1180
    .line 1181
    invoke-virtual {v0}, Lzf/e;->iterator()Ljava/util/Iterator;

    .line 1182
    .line 1183
    .line 1184
    move-result-object v0

    .line 1185
    :goto_14
    move-object v7, v0

    .line 1186
    check-cast v7, Lzf/f;

    .line 1187
    .line 1188
    iget-boolean v7, v7, Lzf/f;->c:Z

    .line 1189
    .line 1190
    if-eqz v7, :cond_19

    .line 1191
    .line 1192
    move-object v7, v0

    .line 1193
    check-cast v7, Lzf/f;

    .line 1194
    .line 1195
    invoke-virtual {v7}, Lzf/f;->a()I

    .line 1196
    .line 1197
    .line 1198
    move-result v7

    .line 1199
    add-int/lit8 v13, v7, 0x7

    .line 1200
    .line 1201
    invoke-static {v2, v7, v13}, Lff/m;->l0([FII)[F

    .line 1202
    .line 1203
    .line 1204
    move-result-object v7

    .line 1205
    new-instance v15, Li0/g;

    .line 1206
    .line 1207
    aget v16, v7, v8

    .line 1208
    .line 1209
    aget v17, v7, v4

    .line 1210
    .line 1211
    aget v18, v7, v5

    .line 1212
    .line 1213
    aget v13, v7, v12

    .line 1214
    .line 1215
    invoke-static {v13, v14}, Ljava/lang/Float;->compare(FF)I

    .line 1216
    .line 1217
    .line 1218
    move-result v13

    .line 1219
    if-eqz v13, :cond_1b

    .line 1220
    .line 1221
    move/from16 v19, v4

    .line 1222
    .line 1223
    goto :goto_15

    .line 1224
    :cond_1b
    move/from16 v19, v8

    .line 1225
    .line 1226
    :goto_15
    aget v13, v7, v9

    .line 1227
    .line 1228
    invoke-static {v13, v14}, Ljava/lang/Float;->compare(FF)I

    .line 1229
    .line 1230
    .line 1231
    move-result v13

    .line 1232
    if-eqz v13, :cond_1c

    .line 1233
    .line 1234
    move/from16 v20, v4

    .line 1235
    .line 1236
    goto :goto_16

    .line 1237
    :cond_1c
    move/from16 v20, v8

    .line 1238
    .line 1239
    :goto_16
    aget v21, v7, v11

    .line 1240
    .line 1241
    aget v22, v7, v6

    .line 1242
    .line 1243
    invoke-direct/range {v15 .. v22}, Li0/g;-><init>(FFFZZFF)V

    .line 1244
    .line 1245
    .line 1246
    invoke-virtual {v10, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1247
    .line 1248
    .line 1249
    goto :goto_14

    .line 1250
    :goto_17
    check-cast v0, Ljava/util/Collection;

    .line 1251
    .line 1252
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 1253
    .line 1254
    .line 1255
    return-void

    .line 1256
    :cond_1d
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 1257
    .line 1258
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1259
    .line 1260
    const-string v4, "Unknown command for: "

    .line 1261
    .line 1262
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1263
    .line 1264
    .line 1265
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1266
    .line 1267
    .line 1268
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1269
    .line 1270
    .line 1271
    move-result-object v0

    .line 1272
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1273
    .line 1274
    .line 1275
    throw v2
.end method

.method public j()Ljava/util/Map;
    .locals 8

    .line 1
    iget-object v0, p0, LC8/i;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/Locale;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, LC8/i;->d:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, LC8/i;

    .line 12
    .line 13
    iget-object v1, v1, LC8/i;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Lre/d;

    .line 16
    .line 17
    iget-object v1, v1, Lre/d;->a:Ljava/lang/String;

    .line 18
    .line 19
    const-string v2, "Bearer "

    .line 20
    .line 21
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    sget-object v2, Lte/a;->a:[Lte/a;

    .line 26
    .line 27
    new-instance v2, Lef/k;

    .line 28
    .line 29
    const-string v3, "Authorization"

    .line 30
    .line 31
    invoke-direct {v2, v3, v1}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    new-instance v1, Lef/k;

    .line 35
    .line 36
    const-string v3, "User-Locale"

    .line 37
    .line 38
    invoke-direct {v1, v3, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, LC8/i;->e:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Lef/p;

    .line 44
    .line 45
    invoke-virtual {v0}, Lef/p;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Ljava/lang/String;

    .line 50
    .line 51
    new-instance v3, Lef/k;

    .line 52
    .line 53
    const-string v4, "Source"

    .line 54
    .line 55
    invoke-direct {v3, v4, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, LC8/i;->f:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v0, Lef/p;

    .line 61
    .line 62
    invoke-virtual {v0}, Lef/p;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, Ljava/lang/String;

    .line 67
    .line 68
    new-instance v4, Lef/k;

    .line 69
    .line 70
    const-string v5, "Source-Version"

    .line 71
    .line 72
    invoke-direct {v4, v5, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    new-instance v0, Lef/k;

    .line 76
    .line 77
    const-string v5, "Platform"

    .line 78
    .line 79
    const-string v6, "android"

    .line 80
    .line 81
    invoke-direct {v0, v5, v6}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    sget-object v5, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 85
    .line 86
    new-instance v6, Lef/k;

    .line 87
    .line 88
    const-string v7, "Platform-Version"

    .line 89
    .line 90
    invoke-direct {v6, v7, v5}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    const/4 v5, 0x6

    .line 94
    new-array v5, v5, [Lef/k;

    .line 95
    .line 96
    const/4 v7, 0x0

    .line 97
    aput-object v2, v5, v7

    .line 98
    .line 99
    const/4 v2, 0x1

    .line 100
    aput-object v1, v5, v2

    .line 101
    .line 102
    const/4 v1, 0x2

    .line 103
    aput-object v3, v5, v1

    .line 104
    .line 105
    const/4 v1, 0x3

    .line 106
    aput-object v4, v5, v1

    .line 107
    .line 108
    const/4 v1, 0x4

    .line 109
    aput-object v0, v5, v1

    .line 110
    .line 111
    const/4 v0, 0x5

    .line 112
    aput-object v6, v5, v0

    .line 113
    .line 114
    invoke-static {v5}, Lff/A;->R([Lef/k;)Ljava/util/Map;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    return-object v0
.end method

.method public k(I)J
    .locals 3

    .line 1
    iget v0, p0, LC8/i;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LC8/i;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, [J

    .line 9
    .line 10
    aget-wide v1, v0, p1

    .line 11
    .line 12
    return-wide v1

    .line 13
    :pswitch_0
    iget-object v0, p0, LC8/i;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, [J

    .line 16
    .line 17
    aget-wide v1, v0, p1

    .line 18
    .line 19
    return-wide v1

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method public n([BILC8/j;)LC8/a;
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x3

    .line 3
    const/4 v2, 0x2

    .line 4
    iget-wide v3, p3, LC8/j;->b:J

    .line 5
    .line 6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 7
    .line 8
    .line 9
    move-result-wide v5

    .line 10
    cmp-long v3, v3, v5

    .line 11
    .line 12
    if-gtz v3, :cond_3

    .line 13
    .line 14
    new-instance v3, Ljava/net/URL;

    .line 15
    .line 16
    if-eq p2, v2, :cond_1

    .line 17
    .line 18
    if-ne p2, v1, :cond_0

    .line 19
    .line 20
    const-string p2, "https://firebaseappcheck.googleapis.com/v1/projects/%s/apps/%s:exchangePlayIntegrityToken?key=%s"

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 24
    .line 25
    const-string p2, "Unknown token type."

    .line 26
    .line 27
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :cond_1
    const-string p2, "https://firebaseappcheck.googleapis.com/v1/projects/%s/apps/%s:exchangeDebugToken?key=%s"

    .line 32
    .line 33
    :goto_0
    iget-object v4, p0, LC8/i;->c:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v4, Ljava/lang/String;

    .line 36
    .line 37
    iget-object v5, p0, LC8/i;->e:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v5, Ljava/lang/String;

    .line 40
    .line 41
    iget-object v6, p0, LC8/i;->d:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v6, Ljava/lang/String;

    .line 44
    .line 45
    new-array v1, v1, [Ljava/lang/Object;

    .line 46
    .line 47
    const/4 v7, 0x0

    .line 48
    aput-object v5, v1, v7

    .line 49
    .line 50
    aput-object v6, v1, v0

    .line 51
    .line 52
    aput-object v4, v1, v2

    .line 53
    .line 54
    invoke-static {p2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    invoke-direct {v3, p2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, v3, p1, p3, v0}, LC8/i;->u(Ljava/net/URL;[BLC8/j;Z)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    new-instance p2, Lorg/json/JSONObject;

    .line 66
    .line 67
    invoke-direct {p2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    const-string p1, "token"

    .line 71
    .line 72
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-static {p1}, Ln7/f;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    const-string p3, "ttl"

    .line 81
    .line 82
    invoke-virtual {p2, p3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    invoke-static {p2}, Ln7/f;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    if-eqz p1, :cond_2

    .line 91
    .line 92
    if-eqz p2, :cond_2

    .line 93
    .line 94
    new-instance p3, LC8/a;

    .line 95
    .line 96
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 97
    .line 98
    .line 99
    iput-object p1, p3, LC8/a;->a:Ljava/lang/String;

    .line 100
    .line 101
    iput-object p2, p3, LC8/a;->b:Ljava/lang/String;

    .line 102
    .line 103
    return-object p3

    .line 104
    :cond_2
    new-instance p1, Ls8/j;

    .line 105
    .line 106
    const-string p2, "Unexpected server response."

    .line 107
    .line 108
    invoke-direct {p1, p2}, Ls8/j;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    throw p1

    .line 112
    :cond_3
    new-instance p1, Ls8/j;

    .line 113
    .line 114
    const-string p2, "Too many attempts."

    .line 115
    .line 116
    invoke-direct {p1, p2}, Ls8/j;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    throw p1
.end method

.method public o(LC6/l;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, LC8/i;->e:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v4, v0

    .line 4
    check-cast v4, LL8/t;

    .line 5
    .line 6
    iget-object v0, p0, LC8/i;->f:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v5, v0

    .line 9
    check-cast v5, LL8/t;

    .line 10
    .line 11
    iget-object v0, p0, LC8/i;->b:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v1, v0

    .line 14
    check-cast v1, LL8/t;

    .line 15
    .line 16
    iget-object v0, p0, LC8/i;->c:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v2, v0

    .line 19
    check-cast v2, LL8/t;

    .line 20
    .line 21
    iget-object v0, p0, LC8/i;->d:Ljava/lang/Object;

    .line 22
    .line 23
    move-object v3, v0

    .line 24
    check-cast v3, LL8/t;

    .line 25
    .line 26
    move-object v6, p1

    .line 27
    invoke-static/range {v1 .. v6}, Lcom/google/firebase/auth/FirebaseAuthRegistrar;->lambda$getComponents$0(LL8/t;LL8/t;LL8/t;LL8/t;LL8/t;LL8/c;)Lcom/google/firebase/auth/FirebaseAuth;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1
.end method

.method public p()I
    .locals 1

    .line 1
    iget v0, p0, LC8/i;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LC8/i;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, [J

    .line 9
    .line 10
    array-length v0, v0

    .line 11
    return v0

    .line 12
    :pswitch_0
    iget-object v0, p0, LC8/i;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, [J

    .line 15
    .line 16
    array-length v0, v0

    .line 17
    return v0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method public q()Luc/n;
    .locals 1

    .line 1
    iget-object v0, p0, LC8/i;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkd/g;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lkd/g;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Lkd/g;-><init>(LC8/i;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, LC8/i;->e:Ljava/lang/Object;

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, LC8/i;->e:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lkd/g;

    .line 17
    .line 18
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public r(Lve/a;Lbe/b;)Lve/c;
    .locals 2

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    :try_start_0
    iget-object p2, p1, Lve/a;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p2, Ljava/util/Map;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    const-string v0, "error"

    .line 8
    .line 9
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    instance-of v0, p2, Ljava/util/Map;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    check-cast p2, Ljava/util/Map;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p2, 0x0

    .line 21
    :goto_0
    iget p1, p1, Lve/a;->a:I

    .line 22
    .line 23
    if-eqz p2, :cond_2

    .line 24
    .line 25
    iget-object v0, p0, LC8/i;->e:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Lab/b;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    const-string v0, "message"

    .line 33
    .line 34
    invoke-static {v0, p2}, LFe/e;->G(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    if-nez v0, :cond_1

    .line 39
    .line 40
    const-string v0, "No message provided"

    .line 41
    .line 42
    :cond_1
    const-string v1, "type"

    .line 43
    .line 44
    invoke-static {v1, p2}, LFe/e;->G(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    const-string v1, "code"

    .line 48
    .line 49
    invoke-static {v1, p2}, LFe/e;->G(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    new-instance p2, Lve/c;

    .line 53
    .line 54
    invoke-direct {p2, p1, v0}, Lve/c;-><init>(ILjava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-object p2

    .line 58
    :cond_2
    new-instance p2, Lve/c;

    .line 59
    .line 60
    const-string v0, "No error data provided"

    .line 61
    .line 62
    invoke-direct {p2, p1, v0}, Lve/c;-><init>(ILjava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-object p2

    .line 66
    :catch_0
    move-exception p1

    .line 67
    new-instance p2, Lbe/b;

    .line 68
    .line 69
    sget-object v0, Lbe/a;->i:Lbe/a;

    .line 70
    .line 71
    const-string v1, "Unexpected payload type. Map expected"

    .line 72
    .line 73
    invoke-direct {p2, v0, v1, p1}, Lbe/b;-><init>(Lbe/a;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    throw p2

    .line 77
    :cond_3
    if-eqz p2, :cond_4

    .line 78
    .line 79
    throw p2

    .line 80
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 81
    .line 82
    const-string p2, "Unreachable code. Either response or executionException should be non-null"

    .line 83
    .line 84
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw p1
.end method

.method public s()Ljava/lang/String;
    .locals 6

    .line 1
    const-string v0, "C8.i"

    .line 2
    .line 3
    iget-object v1, p0, LC8/i;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Landroid/content/Context;

    .line 6
    .line 7
    const-string v2, "Could not get fingerprint hash for package: "

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    :try_start_0
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    invoke-static {v1, v4}, Ln7/c;->g(Landroid/content/Context;Ljava/lang/String;)[B

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    if-nez v4, :cond_0

    .line 19
    .line 20
    new-instance v4, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    return-object v3

    .line 40
    :catch_0
    move-exception v2

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-static {v4}, Ln7/c;->c([B)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    return-object v0

    .line 47
    :goto_0
    new-instance v4, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    const-string v5, "No such package: "

    .line 50
    .line 51
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-static {v0, v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 66
    .line 67
    .line 68
    return-object v3
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, LC8/i;->a:I

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
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v1, "RemoteEvent{snapshotVersion="

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, LC8/i;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Ls9/o;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v1, ", targetChanges="

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, LC8/i;->c:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, Ljava/util/Map;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v1, ", targetMismatches="

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    iget-object v1, p0, LC8/i;->d:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, Ljava/util/Map;

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v1, ", documentUpdates="

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    iget-object v1, p0, LC8/i;->e:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v1, Ljava/util/Map;

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v1, ", resolvedLimboDocuments="

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    iget-object v1, p0, LC8/i;->f:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v1, Ljava/util/Set;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const/16 v1, 0x7d

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    return-object v0

    .line 83
    :pswitch_data_0
    .packed-switch 0x14
        :pswitch_0
    .end packed-switch
.end method

.method public u(Ljava/net/URL;[BLC8/j;Z)Ljava/lang/String;
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ljava/net/HttpURLConnection;

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    :try_start_0
    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 9
    .line 10
    .line 11
    array-length v1, p2

    .line 12
    invoke-virtual {p1, v1}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V

    .line 13
    .line 14
    .line 15
    const-string v1, "Content-Type"

    .line 16
    .line 17
    const-string v2, "application/json"

    .line 18
    .line 19
    invoke-virtual {p1, v1, v2}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, LC8/i;->f:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, LO9/b;

    .line 25
    .line 26
    invoke-interface {v1}, LO9/b;->get()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Lx9/e;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    :try_start_1
    check-cast v1, Lx9/c;

    .line 36
    .line 37
    invoke-virtual {v1}, Lx9/c;->b()Lcom/google/android/gms/tasks/Task;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-static {v1}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 46
    .line 47
    move-object v2, v1

    .line 48
    goto :goto_0

    .line 49
    :catch_0
    :try_start_2
    const-string v1, "C8.i"

    .line 50
    .line 51
    const-string v3, "Unable to get heartbeats!"

    .line 52
    .line 53
    invoke-static {v1, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    :cond_0
    :goto_0
    if-eqz v2, :cond_1

    .line 57
    .line 58
    const-string v1, "X-Firebase-Client"

    .line 59
    .line 60
    invoke-virtual {p1, v1, v2}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :catchall_0
    move-exception p2

    .line 65
    goto/16 :goto_b

    .line 66
    .line 67
    :cond_1
    :goto_1
    const-string v1, "X-Android-Package"

    .line 68
    .line 69
    iget-object v2, p0, LC8/i;->b:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v2, Landroid/content/Context;

    .line 72
    .line 73
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {p1, v1, v2}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    const-string v1, "X-Android-Cert"

    .line 81
    .line 82
    invoke-virtual {p0}, LC8/i;->s()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-virtual {p1, v1, v2}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    new-instance v1, Ljava/io/BufferedOutputStream;

    .line 90
    .line 91
    invoke-virtual {p1}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    array-length v3, p2

    .line 96
    invoke-direct {v1, v2, v3}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 97
    .line 98
    .line 99
    :try_start_3
    array-length v2, p2

    .line 100
    const/4 v3, 0x0

    .line 101
    invoke-virtual {v1, p2, v3, v2}, Ljava/io/OutputStream;->write([BII)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 102
    .line 103
    .line 104
    :try_start_4
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 108
    .line 109
    .line 110
    move-result p2

    .line 111
    const/16 v1, 0x12c

    .line 112
    .line 113
    const/16 v2, 0xc8

    .line 114
    .line 115
    if-lt p2, v2, :cond_2

    .line 116
    .line 117
    if-ge p2, v1, :cond_2

    .line 118
    .line 119
    move v4, v0

    .line 120
    goto :goto_2

    .line 121
    :cond_2
    move v4, v3

    .line 122
    :goto_2
    if-eqz v4, :cond_3

    .line 123
    .line 124
    invoke-virtual {p1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    goto :goto_3

    .line 129
    :cond_3
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    :goto_3
    new-instance v5, Ljava/lang/StringBuilder;

    .line 134
    .line 135
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 136
    .line 137
    .line 138
    new-instance v6, Ljava/io/BufferedReader;

    .line 139
    .line 140
    new-instance v7, Ljava/io/InputStreamReader;

    .line 141
    .line 142
    const-string v8, "UTF-8"

    .line 143
    .line 144
    invoke-direct {v7, v4, v8}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    invoke-direct {v6, v7}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 148
    .line 149
    .line 150
    :goto_4
    :try_start_5
    invoke-virtual {v6}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    if-eqz v4, :cond_4

    .line 155
    .line 156
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 157
    .line 158
    .line 159
    goto :goto_4

    .line 160
    :catchall_1
    move-exception p2

    .line 161
    goto/16 :goto_8

    .line 162
    .line 163
    :cond_4
    :try_start_6
    invoke-virtual {v6}, Ljava/io/BufferedReader;->close()V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    if-lt p2, v2, :cond_5

    .line 171
    .line 172
    if-ge p2, v1, :cond_5

    .line 173
    .line 174
    goto :goto_5

    .line 175
    :cond_5
    move v0, v3

    .line 176
    :goto_5
    if-nez v0, :cond_8

    .line 177
    .line 178
    iget-wide v0, p3, LC8/j;->a:J

    .line 179
    .line 180
    const-wide/16 v2, 0x1

    .line 181
    .line 182
    add-long/2addr v0, v2

    .line 183
    iput-wide v0, p3, LC8/j;->a:J

    .line 184
    .line 185
    const/16 p4, 0x190

    .line 186
    .line 187
    if-eq p2, p4, :cond_7

    .line 188
    .line 189
    const/16 p4, 0x194

    .line 190
    .line 191
    if-ne p2, p4, :cond_6

    .line 192
    .line 193
    goto :goto_6

    .line 194
    :cond_6
    invoke-static {}, Ljava/lang/Math;->random()D

    .line 195
    .line 196
    .line 197
    move-result-wide v0

    .line 198
    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    .line 199
    .line 200
    mul-double/2addr v0, v2

    .line 201
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    .line 202
    .line 203
    add-double/2addr v0, v2

    .line 204
    iget-wide v2, p3, LC8/j;->a:J

    .line 205
    .line 206
    long-to-double v2, v2

    .line 207
    mul-double/2addr v2, v0

    .line 208
    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    .line 209
    .line 210
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 211
    .line 212
    .line 213
    move-result-wide v0

    .line 214
    const-wide v2, 0x408f400000000000L    # 1000.0

    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    mul-double/2addr v0, v2

    .line 220
    double-to-long v0, v0

    .line 221
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 222
    .line 223
    .line 224
    move-result-wide v2

    .line 225
    const-wide/32 v5, 0xdbba00

    .line 226
    .line 227
    .line 228
    invoke-static {v0, v1, v5, v6}, Ljava/lang/Math;->min(JJ)J

    .line 229
    .line 230
    .line 231
    move-result-wide v0

    .line 232
    add-long/2addr v0, v2

    .line 233
    iput-wide v0, p3, LC8/j;->b:J

    .line 234
    .line 235
    goto :goto_7

    .line 236
    :cond_7
    :goto_6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 237
    .line 238
    .line 239
    move-result-wide v0

    .line 240
    const-wide/32 v2, 0x5265c00

    .line 241
    .line 242
    .line 243
    add-long/2addr v0, v2

    .line 244
    iput-wide v0, p3, LC8/j;->b:J

    .line 245
    .line 246
    :goto_7
    new-instance p2, Lorg/json/JSONObject;

    .line 247
    .line 248
    invoke-direct {p2, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    const-string p3, "error"

    .line 252
    .line 253
    invoke-virtual {p2, p3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object p2

    .line 257
    new-instance p3, Lorg/json/JSONObject;

    .line 258
    .line 259
    invoke-direct {p3, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    const-string p2, "code"

    .line 263
    .line 264
    invoke-virtual {p3, p2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 265
    .line 266
    .line 267
    move-result p2

    .line 268
    const-string p4, "message"

    .line 269
    .line 270
    invoke-virtual {p3, p4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object p3

    .line 274
    new-instance p4, Ls8/j;

    .line 275
    .line 276
    new-instance v0, Ljava/lang/StringBuilder;

    .line 277
    .line 278
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 279
    .line 280
    .line 281
    const-string v1, "Error returned from API. code: "

    .line 282
    .line 283
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    const-string p2, " body: "

    .line 290
    .line 291
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object p2

    .line 301
    invoke-direct {p4, p2}, Ls8/j;-><init>(Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    throw p4

    .line 305
    :cond_8
    if-eqz p4, :cond_9

    .line 306
    .line 307
    const-wide/16 v0, 0x0

    .line 308
    .line 309
    iput-wide v0, p3, LC8/j;->a:J

    .line 310
    .line 311
    const-wide/16 v0, -0x1

    .line 312
    .line 313
    iput-wide v0, p3, LC8/j;->b:J
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 314
    .line 315
    :cond_9
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 316
    .line 317
    .line 318
    return-object v4

    .line 319
    :goto_8
    :try_start_7
    invoke-virtual {v6}, Ljava/io/BufferedReader;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 320
    .line 321
    .line 322
    goto :goto_9

    .line 323
    :catchall_2
    move-exception p3

    .line 324
    :try_start_8
    invoke-virtual {p2, p3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 325
    .line 326
    .line 327
    :goto_9
    throw p2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 328
    :catchall_3
    move-exception p2

    .line 329
    :try_start_9
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 330
    .line 331
    .line 332
    goto :goto_a

    .line 333
    :catchall_4
    move-exception p3

    .line 334
    :try_start_a
    invoke-virtual {p2, p3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 335
    .line 336
    .line 337
    :goto_a
    throw p2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 338
    :goto_b
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 339
    .line 340
    .line 341
    throw p2
.end method

.method public v()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, LC8/i;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayDeque;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, LC8/i;->e:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Ljava/util/ArrayDeque;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Ljava/lang/String;

    .line 15
    .line 16
    monitor-exit v0

    .line 17
    return-object v1

    .line 18
    :catchall_0
    move-exception v1

    .line 19
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    throw v1
.end method

.method public w(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    iget-object v0, p0, LC8/i;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayDeque;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, LC8/i;->e:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Ljava/util/ArrayDeque;

    .line 9
    .line 10
    invoke-virtual {v1, p1}, Ljava/util/ArrayDeque;->remove(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    new-instance v1, LC8/g;

    .line 17
    .line 18
    const/16 v2, 0x13

    .line 19
    .line 20
    invoke-direct {v1, p0, v2}, LC8/g;-><init>(Ljava/lang/Object;I)V

    .line 21
    .line 22
    .line 23
    iget-object v2, p0, LC8/i;->f:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v2, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 26
    .line 27
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    monitor-exit v0

    .line 31
    return p1

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    throw p1
.end method

.method public x(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    iget-object v0, p0, LC8/i;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/Context;

    .line 4
    .line 5
    instance-of v1, v0, Landroid/app/Activity;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Landroid/app/Activity;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    new-instance v0, Landroid/os/Handler;

    .line 16
    .line 17
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public y(Le0/x;)V
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "target"

    .line 6
    .line 7
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    move-object v2, v1

    .line 11
    check-cast v2, Le0/f;

    .line 12
    .line 13
    invoke-virtual {v2}, Le0/f;->c()V

    .line 14
    .line 15
    .line 16
    iget-object v3, v0, LC8/i;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, Li0/A;

    .line 19
    .line 20
    invoke-virtual {v3}, Li0/A;->a()V

    .line 21
    .line 22
    .line 23
    iget-object v4, v0, LC8/i;->d:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v4, Li0/A;

    .line 26
    .line 27
    invoke-virtual {v4}, Li0/A;->a()V

    .line 28
    .line 29
    .line 30
    iget-object v5, v0, LC8/i;->e:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v5, Li0/A;

    .line 33
    .line 34
    invoke-virtual {v5}, Li0/A;->a()V

    .line 35
    .line 36
    .line 37
    iget-object v6, v0, LC8/i;->f:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v6, Li0/A;

    .line 40
    .line 41
    invoke-virtual {v6}, Li0/A;->a()V

    .line 42
    .line 43
    .line 44
    iget-object v7, v0, LC8/i;->b:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v7, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 49
    .line 50
    .line 51
    move-result v8

    .line 52
    const/4 v9, 0x0

    .line 53
    const/4 v10, 0x0

    .line 54
    :goto_0
    if-ge v10, v8, :cond_18

    .line 55
    .line 56
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v11

    .line 60
    check-cast v11, Li0/z;

    .line 61
    .line 62
    if-nez v9, :cond_0

    .line 63
    .line 64
    move-object v9, v11

    .line 65
    :cond_0
    instance-of v12, v11, Li0/h;

    .line 66
    .line 67
    iget-object v13, v2, Le0/f;->a:Landroid/graphics/Path;

    .line 68
    .line 69
    if-eqz v12, :cond_1

    .line 70
    .line 71
    iget v9, v5, Li0/A;->a:F

    .line 72
    .line 73
    iput v9, v3, Li0/A;->a:F

    .line 74
    .line 75
    iget v9, v5, Li0/A;->b:F

    .line 76
    .line 77
    iput v9, v3, Li0/A;->b:F

    .line 78
    .line 79
    iget v9, v5, Li0/A;->a:F

    .line 80
    .line 81
    iput v9, v4, Li0/A;->a:F

    .line 82
    .line 83
    iget v9, v5, Li0/A;->b:F

    .line 84
    .line 85
    iput v9, v4, Li0/A;->b:F

    .line 86
    .line 87
    invoke-virtual {v13}, Landroid/graphics/Path;->close()V

    .line 88
    .line 89
    .line 90
    iget v9, v3, Li0/A;->a:F

    .line 91
    .line 92
    iget v12, v3, Li0/A;->b:F

    .line 93
    .line 94
    invoke-virtual {v13, v9, v12}, Landroid/graphics/Path;->moveTo(FF)V

    .line 95
    .line 96
    .line 97
    :goto_1
    move-object/from16 v18, v2

    .line 98
    .line 99
    move-object v2, v4

    .line 100
    move-object/from16 v19, v5

    .line 101
    .line 102
    move-object/from16 v20, v6

    .line 103
    .line 104
    move-object/from16 v21, v7

    .line 105
    .line 106
    move/from16 v22, v8

    .line 107
    .line 108
    move/from16 v23, v10

    .line 109
    .line 110
    move-object/from16 v28, v11

    .line 111
    .line 112
    goto/16 :goto_6

    .line 113
    .line 114
    :cond_1
    instance-of v12, v11, Li0/t;

    .line 115
    .line 116
    if-eqz v12, :cond_2

    .line 117
    .line 118
    move-object v9, v11

    .line 119
    check-cast v9, Li0/t;

    .line 120
    .line 121
    iget v12, v3, Li0/A;->a:F

    .line 122
    .line 123
    iget v14, v9, Li0/t;->c:F

    .line 124
    .line 125
    add-float/2addr v12, v14

    .line 126
    iput v12, v3, Li0/A;->a:F

    .line 127
    .line 128
    iget v12, v3, Li0/A;->b:F

    .line 129
    .line 130
    iget v9, v9, Li0/t;->d:F

    .line 131
    .line 132
    add-float/2addr v12, v9

    .line 133
    iput v12, v3, Li0/A;->b:F

    .line 134
    .line 135
    invoke-virtual {v13, v14, v9}, Landroid/graphics/Path;->rMoveTo(FF)V

    .line 136
    .line 137
    .line 138
    iget v9, v3, Li0/A;->a:F

    .line 139
    .line 140
    iput v9, v5, Li0/A;->a:F

    .line 141
    .line 142
    iget v9, v3, Li0/A;->b:F

    .line 143
    .line 144
    iput v9, v5, Li0/A;->b:F

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_2
    instance-of v12, v11, Li0/l;

    .line 148
    .line 149
    if-eqz v12, :cond_3

    .line 150
    .line 151
    move-object v9, v11

    .line 152
    check-cast v9, Li0/l;

    .line 153
    .line 154
    iget v12, v9, Li0/l;->c:F

    .line 155
    .line 156
    iput v12, v3, Li0/A;->a:F

    .line 157
    .line 158
    iget v9, v9, Li0/l;->d:F

    .line 159
    .line 160
    iput v9, v3, Li0/A;->b:F

    .line 161
    .line 162
    invoke-virtual {v13, v12, v9}, Landroid/graphics/Path;->moveTo(FF)V

    .line 163
    .line 164
    .line 165
    iget v9, v3, Li0/A;->a:F

    .line 166
    .line 167
    iput v9, v5, Li0/A;->a:F

    .line 168
    .line 169
    iget v9, v3, Li0/A;->b:F

    .line 170
    .line 171
    iput v9, v5, Li0/A;->b:F

    .line 172
    .line 173
    goto :goto_1

    .line 174
    :cond_3
    instance-of v12, v11, Li0/s;

    .line 175
    .line 176
    if-eqz v12, :cond_4

    .line 177
    .line 178
    move-object v9, v11

    .line 179
    check-cast v9, Li0/s;

    .line 180
    .line 181
    iget v12, v9, Li0/s;->c:F

    .line 182
    .line 183
    iget v14, v9, Li0/s;->d:F

    .line 184
    .line 185
    invoke-virtual {v13, v12, v14}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 186
    .line 187
    .line 188
    iget v12, v3, Li0/A;->a:F

    .line 189
    .line 190
    iget v9, v9, Li0/s;->c:F

    .line 191
    .line 192
    add-float/2addr v12, v9

    .line 193
    iput v12, v3, Li0/A;->a:F

    .line 194
    .line 195
    iget v9, v3, Li0/A;->b:F

    .line 196
    .line 197
    add-float/2addr v9, v14

    .line 198
    iput v9, v3, Li0/A;->b:F

    .line 199
    .line 200
    goto :goto_1

    .line 201
    :cond_4
    instance-of v12, v11, Li0/k;

    .line 202
    .line 203
    if-eqz v12, :cond_5

    .line 204
    .line 205
    move-object v9, v11

    .line 206
    check-cast v9, Li0/k;

    .line 207
    .line 208
    iget v12, v9, Li0/k;->c:F

    .line 209
    .line 210
    iget v14, v9, Li0/k;->d:F

    .line 211
    .line 212
    invoke-virtual {v13, v12, v14}, Landroid/graphics/Path;->lineTo(FF)V

    .line 213
    .line 214
    .line 215
    iget v9, v9, Li0/k;->c:F

    .line 216
    .line 217
    iput v9, v3, Li0/A;->a:F

    .line 218
    .line 219
    iput v14, v3, Li0/A;->b:F

    .line 220
    .line 221
    goto :goto_1

    .line 222
    :cond_5
    instance-of v12, v11, Li0/r;

    .line 223
    .line 224
    const/4 v14, 0x0

    .line 225
    if-eqz v12, :cond_6

    .line 226
    .line 227
    move-object v9, v11

    .line 228
    check-cast v9, Li0/r;

    .line 229
    .line 230
    iget v12, v9, Li0/r;->c:F

    .line 231
    .line 232
    invoke-virtual {v13, v12, v14}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 233
    .line 234
    .line 235
    iget v12, v3, Li0/A;->a:F

    .line 236
    .line 237
    iget v9, v9, Li0/r;->c:F

    .line 238
    .line 239
    add-float/2addr v12, v9

    .line 240
    iput v12, v3, Li0/A;->a:F

    .line 241
    .line 242
    goto/16 :goto_1

    .line 243
    .line 244
    :cond_6
    instance-of v12, v11, Li0/j;

    .line 245
    .line 246
    if-eqz v12, :cond_7

    .line 247
    .line 248
    move-object v9, v11

    .line 249
    check-cast v9, Li0/j;

    .line 250
    .line 251
    iget v12, v9, Li0/j;->c:F

    .line 252
    .line 253
    iget v14, v3, Li0/A;->b:F

    .line 254
    .line 255
    invoke-virtual {v13, v12, v14}, Landroid/graphics/Path;->lineTo(FF)V

    .line 256
    .line 257
    .line 258
    iget v9, v9, Li0/j;->c:F

    .line 259
    .line 260
    iput v9, v3, Li0/A;->a:F

    .line 261
    .line 262
    goto/16 :goto_1

    .line 263
    .line 264
    :cond_7
    instance-of v12, v11, Li0/x;

    .line 265
    .line 266
    if-eqz v12, :cond_8

    .line 267
    .line 268
    move-object v9, v11

    .line 269
    check-cast v9, Li0/x;

    .line 270
    .line 271
    iget v12, v9, Li0/x;->c:F

    .line 272
    .line 273
    invoke-virtual {v13, v14, v12}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 274
    .line 275
    .line 276
    iget v12, v3, Li0/A;->b:F

    .line 277
    .line 278
    iget v9, v9, Li0/x;->c:F

    .line 279
    .line 280
    add-float/2addr v12, v9

    .line 281
    iput v12, v3, Li0/A;->b:F

    .line 282
    .line 283
    goto/16 :goto_1

    .line 284
    .line 285
    :cond_8
    instance-of v12, v11, Li0/y;

    .line 286
    .line 287
    if-eqz v12, :cond_9

    .line 288
    .line 289
    move-object v9, v11

    .line 290
    check-cast v9, Li0/y;

    .line 291
    .line 292
    iget v12, v3, Li0/A;->a:F

    .line 293
    .line 294
    iget v14, v9, Li0/y;->c:F

    .line 295
    .line 296
    invoke-virtual {v13, v12, v14}, Landroid/graphics/Path;->lineTo(FF)V

    .line 297
    .line 298
    .line 299
    iget v9, v9, Li0/y;->c:F

    .line 300
    .line 301
    iput v9, v3, Li0/A;->b:F

    .line 302
    .line 303
    goto/16 :goto_1

    .line 304
    .line 305
    :cond_9
    instance-of v12, v11, Li0/q;

    .line 306
    .line 307
    if-eqz v12, :cond_a

    .line 308
    .line 309
    move-object v9, v11

    .line 310
    check-cast v9, Li0/q;

    .line 311
    .line 312
    iget v14, v9, Li0/q;->c:F

    .line 313
    .line 314
    iget v15, v9, Li0/q;->d:F

    .line 315
    .line 316
    iget v12, v9, Li0/q;->e:F

    .line 317
    .line 318
    iget v0, v9, Li0/q;->f:F

    .line 319
    .line 320
    move/from16 v17, v0

    .line 321
    .line 322
    iget v0, v9, Li0/q;->g:F

    .line 323
    .line 324
    move/from16 v18, v0

    .line 325
    .line 326
    iget v0, v9, Li0/q;->h:F

    .line 327
    .line 328
    move/from16 v19, v0

    .line 329
    .line 330
    move/from16 v16, v12

    .line 331
    .line 332
    invoke-virtual/range {v13 .. v19}, Landroid/graphics/Path;->rCubicTo(FFFFFF)V

    .line 333
    .line 334
    .line 335
    iget v0, v3, Li0/A;->a:F

    .line 336
    .line 337
    iget v12, v9, Li0/q;->e:F

    .line 338
    .line 339
    add-float/2addr v0, v12

    .line 340
    iput v0, v4, Li0/A;->a:F

    .line 341
    .line 342
    iget v0, v3, Li0/A;->b:F

    .line 343
    .line 344
    iget v12, v9, Li0/q;->f:F

    .line 345
    .line 346
    add-float/2addr v0, v12

    .line 347
    iput v0, v4, Li0/A;->b:F

    .line 348
    .line 349
    iget v0, v3, Li0/A;->a:F

    .line 350
    .line 351
    iget v12, v9, Li0/q;->g:F

    .line 352
    .line 353
    add-float/2addr v0, v12

    .line 354
    iput v0, v3, Li0/A;->a:F

    .line 355
    .line 356
    iget v0, v3, Li0/A;->b:F

    .line 357
    .line 358
    iget v9, v9, Li0/q;->h:F

    .line 359
    .line 360
    add-float/2addr v0, v9

    .line 361
    iput v0, v3, Li0/A;->b:F

    .line 362
    .line 363
    goto/16 :goto_1

    .line 364
    .line 365
    :cond_a
    instance-of v0, v11, Li0/i;

    .line 366
    .line 367
    if-eqz v0, :cond_b

    .line 368
    .line 369
    move-object v0, v11

    .line 370
    check-cast v0, Li0/i;

    .line 371
    .line 372
    iget v14, v0, Li0/i;->c:F

    .line 373
    .line 374
    iget v15, v0, Li0/i;->d:F

    .line 375
    .line 376
    iget v9, v0, Li0/i;->e:F

    .line 377
    .line 378
    iget v12, v0, Li0/i;->f:F

    .line 379
    .line 380
    iget v1, v0, Li0/i;->g:F

    .line 381
    .line 382
    move/from16 v18, v1

    .line 383
    .line 384
    iget v1, v0, Li0/i;->h:F

    .line 385
    .line 386
    move/from16 v19, v1

    .line 387
    .line 388
    move/from16 v16, v9

    .line 389
    .line 390
    move/from16 v17, v12

    .line 391
    .line 392
    invoke-virtual/range {v13 .. v19}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 393
    .line 394
    .line 395
    iget v1, v0, Li0/i;->e:F

    .line 396
    .line 397
    iput v1, v4, Li0/A;->a:F

    .line 398
    .line 399
    iget v1, v0, Li0/i;->f:F

    .line 400
    .line 401
    iput v1, v4, Li0/A;->b:F

    .line 402
    .line 403
    iget v1, v0, Li0/i;->g:F

    .line 404
    .line 405
    iput v1, v3, Li0/A;->a:F

    .line 406
    .line 407
    iget v0, v0, Li0/i;->h:F

    .line 408
    .line 409
    iput v0, v3, Li0/A;->b:F

    .line 410
    .line 411
    goto/16 :goto_1

    .line 412
    .line 413
    :cond_b
    instance-of v0, v11, Li0/v;

    .line 414
    .line 415
    if-eqz v0, :cond_d

    .line 416
    .line 417
    move-object v0, v11

    .line 418
    check-cast v0, Li0/v;

    .line 419
    .line 420
    invoke-static {v9}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 421
    .line 422
    .line 423
    iget-boolean v1, v9, Li0/z;->a:Z

    .line 424
    .line 425
    if-eqz v1, :cond_c

    .line 426
    .line 427
    iget v1, v3, Li0/A;->a:F

    .line 428
    .line 429
    iget v9, v4, Li0/A;->a:F

    .line 430
    .line 431
    sub-float/2addr v1, v9

    .line 432
    iput v1, v6, Li0/A;->a:F

    .line 433
    .line 434
    iget v1, v3, Li0/A;->b:F

    .line 435
    .line 436
    iget v9, v4, Li0/A;->b:F

    .line 437
    .line 438
    sub-float/2addr v1, v9

    .line 439
    iput v1, v6, Li0/A;->b:F

    .line 440
    .line 441
    goto :goto_2

    .line 442
    :cond_c
    invoke-virtual {v6}, Li0/A;->a()V

    .line 443
    .line 444
    .line 445
    :goto_2
    iget v14, v6, Li0/A;->a:F

    .line 446
    .line 447
    iget v15, v6, Li0/A;->b:F

    .line 448
    .line 449
    iget v1, v0, Li0/v;->c:F

    .line 450
    .line 451
    iget v9, v0, Li0/v;->d:F

    .line 452
    .line 453
    iget v12, v0, Li0/v;->e:F

    .line 454
    .line 455
    move/from16 v16, v1

    .line 456
    .line 457
    iget v1, v0, Li0/v;->f:F

    .line 458
    .line 459
    move/from16 v19, v1

    .line 460
    .line 461
    move/from16 v17, v9

    .line 462
    .line 463
    move/from16 v18, v12

    .line 464
    .line 465
    invoke-virtual/range {v13 .. v19}, Landroid/graphics/Path;->rCubicTo(FFFFFF)V

    .line 466
    .line 467
    .line 468
    iget v1, v3, Li0/A;->a:F

    .line 469
    .line 470
    iget v9, v0, Li0/v;->c:F

    .line 471
    .line 472
    add-float/2addr v1, v9

    .line 473
    iput v1, v4, Li0/A;->a:F

    .line 474
    .line 475
    iget v1, v3, Li0/A;->b:F

    .line 476
    .line 477
    iget v9, v0, Li0/v;->d:F

    .line 478
    .line 479
    add-float/2addr v1, v9

    .line 480
    iput v1, v4, Li0/A;->b:F

    .line 481
    .line 482
    iget v1, v3, Li0/A;->a:F

    .line 483
    .line 484
    iget v9, v0, Li0/v;->e:F

    .line 485
    .line 486
    add-float/2addr v1, v9

    .line 487
    iput v1, v3, Li0/A;->a:F

    .line 488
    .line 489
    iget v1, v3, Li0/A;->b:F

    .line 490
    .line 491
    iget v0, v0, Li0/v;->f:F

    .line 492
    .line 493
    add-float/2addr v1, v0

    .line 494
    iput v1, v3, Li0/A;->b:F

    .line 495
    .line 496
    goto/16 :goto_1

    .line 497
    .line 498
    :cond_d
    instance-of v0, v11, Li0/n;

    .line 499
    .line 500
    const/4 v1, 0x2

    .line 501
    if-eqz v0, :cond_f

    .line 502
    .line 503
    move-object v0, v11

    .line 504
    check-cast v0, Li0/n;

    .line 505
    .line 506
    invoke-static {v9}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 507
    .line 508
    .line 509
    iget-boolean v9, v9, Li0/z;->a:Z

    .line 510
    .line 511
    if-eqz v9, :cond_e

    .line 512
    .line 513
    int-to-float v1, v1

    .line 514
    iget v9, v3, Li0/A;->a:F

    .line 515
    .line 516
    mul-float/2addr v9, v1

    .line 517
    iget v12, v4, Li0/A;->a:F

    .line 518
    .line 519
    sub-float/2addr v9, v12

    .line 520
    iput v9, v6, Li0/A;->a:F

    .line 521
    .line 522
    iget v9, v3, Li0/A;->b:F

    .line 523
    .line 524
    mul-float/2addr v1, v9

    .line 525
    iget v9, v4, Li0/A;->b:F

    .line 526
    .line 527
    sub-float/2addr v1, v9

    .line 528
    iput v1, v6, Li0/A;->b:F

    .line 529
    .line 530
    goto :goto_3

    .line 531
    :cond_e
    iget v1, v3, Li0/A;->a:F

    .line 532
    .line 533
    iput v1, v6, Li0/A;->a:F

    .line 534
    .line 535
    iget v1, v3, Li0/A;->b:F

    .line 536
    .line 537
    iput v1, v6, Li0/A;->b:F

    .line 538
    .line 539
    :goto_3
    iget v14, v6, Li0/A;->a:F

    .line 540
    .line 541
    iget v15, v6, Li0/A;->b:F

    .line 542
    .line 543
    iget v1, v0, Li0/n;->c:F

    .line 544
    .line 545
    iget v9, v0, Li0/n;->d:F

    .line 546
    .line 547
    iget v12, v0, Li0/n;->e:F

    .line 548
    .line 549
    move/from16 v16, v1

    .line 550
    .line 551
    iget v1, v0, Li0/n;->f:F

    .line 552
    .line 553
    move/from16 v19, v1

    .line 554
    .line 555
    move/from16 v17, v9

    .line 556
    .line 557
    move/from16 v18, v12

    .line 558
    .line 559
    invoke-virtual/range {v13 .. v19}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 560
    .line 561
    .line 562
    iget v1, v0, Li0/n;->c:F

    .line 563
    .line 564
    iput v1, v4, Li0/A;->a:F

    .line 565
    .line 566
    iget v1, v0, Li0/n;->d:F

    .line 567
    .line 568
    iput v1, v4, Li0/A;->b:F

    .line 569
    .line 570
    iget v1, v0, Li0/n;->e:F

    .line 571
    .line 572
    iput v1, v3, Li0/A;->a:F

    .line 573
    .line 574
    iget v0, v0, Li0/n;->f:F

    .line 575
    .line 576
    iput v0, v3, Li0/A;->b:F

    .line 577
    .line 578
    goto/16 :goto_1

    .line 579
    .line 580
    :cond_f
    instance-of v0, v11, Li0/u;

    .line 581
    .line 582
    if-eqz v0, :cond_10

    .line 583
    .line 584
    move-object v0, v11

    .line 585
    check-cast v0, Li0/u;

    .line 586
    .line 587
    iget v1, v0, Li0/u;->c:F

    .line 588
    .line 589
    iget v9, v0, Li0/u;->d:F

    .line 590
    .line 591
    iget v12, v0, Li0/u;->e:F

    .line 592
    .line 593
    iget v14, v0, Li0/u;->f:F

    .line 594
    .line 595
    invoke-virtual {v13, v1, v9, v12, v14}, Landroid/graphics/Path;->rQuadTo(FFFF)V

    .line 596
    .line 597
    .line 598
    iget v1, v3, Li0/A;->a:F

    .line 599
    .line 600
    iget v0, v0, Li0/u;->c:F

    .line 601
    .line 602
    add-float/2addr v1, v0

    .line 603
    iput v1, v4, Li0/A;->a:F

    .line 604
    .line 605
    iget v0, v3, Li0/A;->b:F

    .line 606
    .line 607
    add-float/2addr v0, v9

    .line 608
    iput v0, v4, Li0/A;->b:F

    .line 609
    .line 610
    iget v0, v3, Li0/A;->a:F

    .line 611
    .line 612
    add-float/2addr v0, v12

    .line 613
    iput v0, v3, Li0/A;->a:F

    .line 614
    .line 615
    iget v0, v3, Li0/A;->b:F

    .line 616
    .line 617
    add-float/2addr v0, v14

    .line 618
    iput v0, v3, Li0/A;->b:F

    .line 619
    .line 620
    goto/16 :goto_1

    .line 621
    .line 622
    :cond_10
    instance-of v0, v11, Li0/m;

    .line 623
    .line 624
    if-eqz v0, :cond_11

    .line 625
    .line 626
    move-object v0, v11

    .line 627
    check-cast v0, Li0/m;

    .line 628
    .line 629
    iget v1, v0, Li0/m;->c:F

    .line 630
    .line 631
    iget v9, v0, Li0/m;->d:F

    .line 632
    .line 633
    iget v12, v0, Li0/m;->e:F

    .line 634
    .line 635
    iget v14, v0, Li0/m;->f:F

    .line 636
    .line 637
    invoke-virtual {v13, v1, v9, v12, v14}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 638
    .line 639
    .line 640
    iget v0, v0, Li0/m;->c:F

    .line 641
    .line 642
    iput v0, v4, Li0/A;->a:F

    .line 643
    .line 644
    iput v9, v4, Li0/A;->b:F

    .line 645
    .line 646
    iput v12, v3, Li0/A;->a:F

    .line 647
    .line 648
    iput v14, v3, Li0/A;->b:F

    .line 649
    .line 650
    goto/16 :goto_1

    .line 651
    .line 652
    :cond_11
    instance-of v0, v11, Li0/w;

    .line 653
    .line 654
    if-eqz v0, :cond_13

    .line 655
    .line 656
    move-object v0, v11

    .line 657
    check-cast v0, Li0/w;

    .line 658
    .line 659
    invoke-static {v9}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 660
    .line 661
    .line 662
    iget-boolean v1, v9, Li0/z;->b:Z

    .line 663
    .line 664
    if-eqz v1, :cond_12

    .line 665
    .line 666
    iget v1, v3, Li0/A;->a:F

    .line 667
    .line 668
    iget v9, v4, Li0/A;->a:F

    .line 669
    .line 670
    sub-float/2addr v1, v9

    .line 671
    iput v1, v6, Li0/A;->a:F

    .line 672
    .line 673
    iget v1, v3, Li0/A;->b:F

    .line 674
    .line 675
    iget v9, v4, Li0/A;->b:F

    .line 676
    .line 677
    sub-float/2addr v1, v9

    .line 678
    iput v1, v6, Li0/A;->b:F

    .line 679
    .line 680
    goto :goto_4

    .line 681
    :cond_12
    invoke-virtual {v6}, Li0/A;->a()V

    .line 682
    .line 683
    .line 684
    :goto_4
    iget v1, v6, Li0/A;->a:F

    .line 685
    .line 686
    iget v9, v6, Li0/A;->b:F

    .line 687
    .line 688
    iget v12, v0, Li0/w;->c:F

    .line 689
    .line 690
    iget v14, v0, Li0/w;->d:F

    .line 691
    .line 692
    invoke-virtual {v13, v1, v9, v12, v14}, Landroid/graphics/Path;->rQuadTo(FFFF)V

    .line 693
    .line 694
    .line 695
    iget v1, v3, Li0/A;->a:F

    .line 696
    .line 697
    iget v9, v6, Li0/A;->a:F

    .line 698
    .line 699
    add-float/2addr v1, v9

    .line 700
    iput v1, v4, Li0/A;->a:F

    .line 701
    .line 702
    iget v1, v3, Li0/A;->b:F

    .line 703
    .line 704
    iget v9, v6, Li0/A;->b:F

    .line 705
    .line 706
    add-float/2addr v1, v9

    .line 707
    iput v1, v4, Li0/A;->b:F

    .line 708
    .line 709
    iget v1, v3, Li0/A;->a:F

    .line 710
    .line 711
    iget v0, v0, Li0/w;->c:F

    .line 712
    .line 713
    add-float/2addr v1, v0

    .line 714
    iput v1, v3, Li0/A;->a:F

    .line 715
    .line 716
    iget v0, v3, Li0/A;->b:F

    .line 717
    .line 718
    add-float/2addr v0, v14

    .line 719
    iput v0, v3, Li0/A;->b:F

    .line 720
    .line 721
    goto/16 :goto_1

    .line 722
    .line 723
    :cond_13
    instance-of v0, v11, Li0/o;

    .line 724
    .line 725
    if-eqz v0, :cond_15

    .line 726
    .line 727
    move-object v0, v11

    .line 728
    check-cast v0, Li0/o;

    .line 729
    .line 730
    invoke-static {v9}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 731
    .line 732
    .line 733
    iget-boolean v9, v9, Li0/z;->b:Z

    .line 734
    .line 735
    if-eqz v9, :cond_14

    .line 736
    .line 737
    int-to-float v1, v1

    .line 738
    iget v9, v3, Li0/A;->a:F

    .line 739
    .line 740
    mul-float/2addr v9, v1

    .line 741
    iget v12, v4, Li0/A;->a:F

    .line 742
    .line 743
    sub-float/2addr v9, v12

    .line 744
    iput v9, v6, Li0/A;->a:F

    .line 745
    .line 746
    iget v9, v3, Li0/A;->b:F

    .line 747
    .line 748
    mul-float/2addr v1, v9

    .line 749
    iget v9, v4, Li0/A;->b:F

    .line 750
    .line 751
    sub-float/2addr v1, v9

    .line 752
    iput v1, v6, Li0/A;->b:F

    .line 753
    .line 754
    goto :goto_5

    .line 755
    :cond_14
    iget v1, v3, Li0/A;->a:F

    .line 756
    .line 757
    iput v1, v6, Li0/A;->a:F

    .line 758
    .line 759
    iget v1, v3, Li0/A;->b:F

    .line 760
    .line 761
    iput v1, v6, Li0/A;->b:F

    .line 762
    .line 763
    :goto_5
    iget v1, v6, Li0/A;->a:F

    .line 764
    .line 765
    iget v9, v6, Li0/A;->b:F

    .line 766
    .line 767
    iget v12, v0, Li0/o;->c:F

    .line 768
    .line 769
    iget v14, v0, Li0/o;->d:F

    .line 770
    .line 771
    invoke-virtual {v13, v1, v9, v12, v14}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 772
    .line 773
    .line 774
    iget v1, v6, Li0/A;->a:F

    .line 775
    .line 776
    iput v1, v4, Li0/A;->a:F

    .line 777
    .line 778
    iget v1, v6, Li0/A;->b:F

    .line 779
    .line 780
    iput v1, v4, Li0/A;->b:F

    .line 781
    .line 782
    iget v0, v0, Li0/o;->c:F

    .line 783
    .line 784
    iput v0, v3, Li0/A;->a:F

    .line 785
    .line 786
    iput v14, v3, Li0/A;->b:F

    .line 787
    .line 788
    goto/16 :goto_1

    .line 789
    .line 790
    :cond_15
    instance-of v0, v11, Li0/p;

    .line 791
    .line 792
    if-eqz v0, :cond_16

    .line 793
    .line 794
    move-object v0, v11

    .line 795
    check-cast v0, Li0/p;

    .line 796
    .line 797
    iget v1, v0, Li0/p;->h:F

    .line 798
    .line 799
    iget v9, v3, Li0/A;->a:F

    .line 800
    .line 801
    add-float/2addr v1, v9

    .line 802
    iget v12, v3, Li0/A;->b:F

    .line 803
    .line 804
    iget v13, v0, Li0/p;->i:F

    .line 805
    .line 806
    add-float/2addr v13, v12

    .line 807
    float-to-double v14, v9

    .line 808
    move-object v9, v2

    .line 809
    move-object/from16 v16, v3

    .line 810
    .line 811
    float-to-double v2, v12

    .line 812
    move-object v12, v6

    .line 813
    move-object/from16 v17, v7

    .line 814
    .line 815
    float-to-double v6, v1

    .line 816
    move/from16 v19, v8

    .line 817
    .line 818
    move-object/from16 v18, v9

    .line 819
    .line 820
    float-to-double v8, v13

    .line 821
    move/from16 v20, v1

    .line 822
    .line 823
    iget v1, v0, Li0/p;->c:F

    .line 824
    .line 825
    move-wide/from16 v21, v2

    .line 826
    .line 827
    float-to-double v1, v1

    .line 828
    iget v3, v0, Li0/p;->d:F

    .line 829
    .line 830
    move-wide/from16 v23, v1

    .line 831
    .line 832
    float-to-double v1, v3

    .line 833
    iget v3, v0, Li0/p;->e:F

    .line 834
    .line 835
    move-wide/from16 v25, v1

    .line 836
    .line 837
    float-to-double v1, v3

    .line 838
    iget-boolean v3, v0, Li0/p;->f:Z

    .line 839
    .line 840
    iget-boolean v0, v0, Li0/p;->g:Z

    .line 841
    .line 842
    move-object/from16 v27, v4

    .line 843
    .line 844
    move-object/from16 v28, v11

    .line 845
    .line 846
    move/from16 v30, v13

    .line 847
    .line 848
    move/from16 v29, v20

    .line 849
    .line 850
    move-object/from16 v20, v12

    .line 851
    .line 852
    move-wide/from16 v12, v25

    .line 853
    .line 854
    move-wide/from16 v33, v1

    .line 855
    .line 856
    move-object/from16 v1, p1

    .line 857
    .line 858
    move-object/from16 v35, v17

    .line 859
    .line 860
    move/from16 v17, v0

    .line 861
    .line 862
    move-object/from16 v0, v16

    .line 863
    .line 864
    move/from16 v16, v3

    .line 865
    .line 866
    move-wide v2, v14

    .line 867
    move-wide/from16 v14, v33

    .line 868
    .line 869
    move/from16 v33, v19

    .line 870
    .line 871
    move-object/from16 v19, v5

    .line 872
    .line 873
    move-wide/from16 v4, v21

    .line 874
    .line 875
    move-object/from16 v21, v35

    .line 876
    .line 877
    move/from16 v22, v33

    .line 878
    .line 879
    move-wide/from16 v33, v23

    .line 880
    .line 881
    move/from16 v23, v10

    .line 882
    .line 883
    move-wide/from16 v10, v33

    .line 884
    .line 885
    invoke-static/range {v1 .. v17}, LC8/i;->m(Le0/x;DDDDDDDZZ)V

    .line 886
    .line 887
    .line 888
    move/from16 v1, v29

    .line 889
    .line 890
    iput v1, v0, Li0/A;->a:F

    .line 891
    .line 892
    move/from16 v13, v30

    .line 893
    .line 894
    iput v13, v0, Li0/A;->b:F

    .line 895
    .line 896
    move-object/from16 v2, v27

    .line 897
    .line 898
    iput v1, v2, Li0/A;->a:F

    .line 899
    .line 900
    iput v13, v2, Li0/A;->b:F

    .line 901
    .line 902
    move-object v3, v0

    .line 903
    goto/16 :goto_6

    .line 904
    .line 905
    :cond_16
    move-object/from16 v18, v2

    .line 906
    .line 907
    move-object v0, v3

    .line 908
    move-object v2, v4

    .line 909
    move-object/from16 v19, v5

    .line 910
    .line 911
    move-object/from16 v20, v6

    .line 912
    .line 913
    move-object/from16 v21, v7

    .line 914
    .line 915
    move/from16 v22, v8

    .line 916
    .line 917
    move/from16 v23, v10

    .line 918
    .line 919
    move-object v1, v11

    .line 920
    instance-of v3, v1, Li0/g;

    .line 921
    .line 922
    if-eqz v3, :cond_17

    .line 923
    .line 924
    move-object v3, v1

    .line 925
    check-cast v3, Li0/g;

    .line 926
    .line 927
    iget v4, v0, Li0/A;->a:F

    .line 928
    .line 929
    float-to-double v4, v4

    .line 930
    iget v6, v0, Li0/A;->b:F

    .line 931
    .line 932
    float-to-double v6, v6

    .line 933
    iget v8, v3, Li0/g;->h:F

    .line 934
    .line 935
    float-to-double v8, v8

    .line 936
    iget v10, v3, Li0/g;->i:F

    .line 937
    .line 938
    move-wide v11, v4

    .line 939
    move-wide v4, v6

    .line 940
    move-wide v6, v8

    .line 941
    float-to-double v8, v10

    .line 942
    iget v13, v3, Li0/g;->c:F

    .line 943
    .line 944
    float-to-double v13, v13

    .line 945
    iget v15, v3, Li0/g;->d:F

    .line 946
    .line 947
    move-object/from16 v28, v1

    .line 948
    .line 949
    move-object/from16 v27, v2

    .line 950
    .line 951
    float-to-double v1, v15

    .line 952
    iget v15, v3, Li0/g;->e:F

    .line 953
    .line 954
    move-wide/from16 v16, v1

    .line 955
    .line 956
    float-to-double v1, v15

    .line 957
    iget-boolean v15, v3, Li0/g;->f:Z

    .line 958
    .line 959
    move-wide/from16 v24, v1

    .line 960
    .line 961
    iget-boolean v1, v3, Li0/g;->g:Z

    .line 962
    .line 963
    move/from16 v32, v10

    .line 964
    .line 965
    move-object/from16 v31, v27

    .line 966
    .line 967
    move/from16 v33, v1

    .line 968
    .line 969
    move-object/from16 v1, p1

    .line 970
    .line 971
    move-wide/from16 v34, v24

    .line 972
    .line 973
    move-object/from16 v24, v0

    .line 974
    .line 975
    move-object v0, v3

    .line 976
    move-wide v2, v11

    .line 977
    move-wide v10, v13

    .line 978
    move-wide/from16 v12, v16

    .line 979
    .line 980
    move/from16 v17, v33

    .line 981
    .line 982
    move/from16 v16, v15

    .line 983
    .line 984
    move-wide/from16 v14, v34

    .line 985
    .line 986
    invoke-static/range {v1 .. v17}, LC8/i;->m(Le0/x;DDDDDDDZZ)V

    .line 987
    .line 988
    .line 989
    iget v0, v0, Li0/g;->h:F

    .line 990
    .line 991
    move-object/from16 v3, v24

    .line 992
    .line 993
    iput v0, v3, Li0/A;->a:F

    .line 994
    .line 995
    move/from16 v1, v32

    .line 996
    .line 997
    iput v1, v3, Li0/A;->b:F

    .line 998
    .line 999
    move-object/from16 v2, v31

    .line 1000
    .line 1001
    iput v0, v2, Li0/A;->a:F

    .line 1002
    .line 1003
    iput v1, v2, Li0/A;->b:F

    .line 1004
    .line 1005
    goto :goto_6

    .line 1006
    :cond_17
    move-object v3, v0

    .line 1007
    move-object/from16 v28, v1

    .line 1008
    .line 1009
    :goto_6
    add-int/lit8 v10, v23, 0x1

    .line 1010
    .line 1011
    move-object/from16 v0, p0

    .line 1012
    .line 1013
    move-object/from16 v1, p1

    .line 1014
    .line 1015
    move-object v4, v2

    .line 1016
    move-object/from16 v2, v18

    .line 1017
    .line 1018
    move-object/from16 v5, v19

    .line 1019
    .line 1020
    move-object/from16 v6, v20

    .line 1021
    .line 1022
    move-object/from16 v7, v21

    .line 1023
    .line 1024
    move/from16 v8, v22

    .line 1025
    .line 1026
    move-object/from16 v9, v28

    .line 1027
    .line 1028
    goto/16 :goto_0

    .line 1029
    .line 1030
    :cond_18
    return-void
.end method

.method public zza(Ljava/lang/Throwable;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbix;->zziM:Lcom/google/android/gms/internal/ads/zzbio;

    .line 6
    .line 7
    sget-object v2, LD6/s;->e:LD6/s;

    .line 8
    .line 9
    iget-object v2, v2, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 10
    .line 11
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Ljava/lang/Boolean;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const-string v2, "Internal error. "

    .line 22
    .line 23
    const-string v3, "SignalGeneratorImpl.generateSignals"

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    sget-object v1, LC6/n;->D:LC6/n;

    .line 28
    .line 29
    iget-object v1, v1, LC6/n;->h:Lcom/google/android/gms/internal/ads/zzcfk;

    .line 30
    .line 31
    invoke-virtual {v1, p1, v3}, Lcom/google/android/gms/internal/ads/zzcfk;->zzi(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    sget-object v1, LC6/n;->D:LC6/n;

    .line 36
    .line 37
    iget-object v1, v1, LC6/n;->h:Lcom/google/android/gms/internal/ads/zzcfk;

    .line 38
    .line 39
    invoke-virtual {v1, p1, v3}, Lcom/google/android/gms/internal/ads/zzcfk;->zzh(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :goto_0
    iget-object v1, p0, LC8/i;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, Lp8/p;

    .line 45
    .line 46
    iget-object v3, p0, LC8/i;->c:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v3, Lcom/google/android/gms/internal/ads/zzcex;

    .line 49
    .line 50
    invoke-static {v1, v3}, LN6/j;->a0(Lp8/p;Lcom/google/android/gms/internal/ads/zzcex;)Lcom/google/android/gms/internal/ads/zzfqq;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    sget-object v3, Lcom/google/android/gms/internal/ads/zzbkq;->zze:Lcom/google/android/gms/internal/ads/zzbkh;

    .line 55
    .line 56
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzbkh;->zze()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    check-cast v3, Ljava/lang/Boolean;

    .line 61
    .line 62
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-eqz v3, :cond_1

    .line 67
    .line 68
    if-eqz v1, :cond_1

    .line 69
    .line 70
    iget-object v3, p0, LC8/i;->e:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v3, Lcom/google/android/gms/internal/ads/zzfqg;

    .line 73
    .line 74
    invoke-interface {v3, p1}, Lcom/google/android/gms/internal/ads/zzfqg;->zzj(Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzfqg;

    .line 75
    .line 76
    .line 77
    const/4 p1, 0x0

    .line 78
    invoke-interface {v3, p1}, Lcom/google/android/gms/internal/ads/zzfqg;->zzd(Z)Lcom/google/android/gms/internal/ads/zzfqg;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/ads/zzfqq;->zza(Lcom/google/android/gms/internal/ads/zzfqg;)Lcom/google/android/gms/internal/ads/zzfqq;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzfqq;->zzh()V

    .line 85
    .line 86
    .line 87
    :cond_1
    iget-object p1, p0, LC8/i;->d:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast p1, Lcom/google/android/gms/internal/ads/zzceq;

    .line 90
    .line 91
    if-nez p1, :cond_2

    .line 92
    .line 93
    return-void

    .line 94
    :cond_2
    :try_start_0
    const-string v1, "Unknown format is no longer supported."

    .line 95
    .line 96
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    if-eqz v1, :cond_3

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_3
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    add-int/lit8 v1, v1, 0x10

    .line 112
    .line 113
    new-instance v3, Ljava/lang/StringBuilder;

    .line 114
    .line 115
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    :goto_1
    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/zzceq;->zzb(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :catch_0
    move-exception p1

    .line 133
    sget v0, LG6/L;->b:I

    .line 134
    .line 135
    const-string v0, ""

    .line 136
    .line 137
    invoke-static {v0, p1}, LH6/l;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 138
    .line 139
    .line 140
    return-void
.end method

.method public zzb(Ljava/lang/Object;)V
    .locals 13

    .line 1
    const-string v0, "QueryInfo generation has been disabled."

    .line 2
    .line 3
    iget-object v1, p0, LC8/i;->f:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, LN6/j;

    .line 6
    .line 7
    iget-object v2, v1, LN6/j;->B:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    check-cast p1, LN6/s;

    .line 10
    .line 11
    iget-object v3, p0, LC8/i;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v3, Lcom/google/android/gms/internal/ads/zzcex;

    .line 14
    .line 15
    iget-object v4, p0, LC8/i;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v4, Lp8/p;

    .line 18
    .line 19
    invoke-static {v4, v3}, LN6/j;->a0(Lp8/p;Lcom/google/android/gms/internal/ads/zzcex;)Lcom/google/android/gms/internal/ads/zzfqq;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    const/4 v4, 0x1

    .line 24
    invoke-virtual {v2, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 25
    .line 26
    .line 27
    sget-object v2, Lcom/google/android/gms/internal/ads/zzbix;->zziG:Lcom/google/android/gms/internal/ads/zzbio;

    .line 28
    .line 29
    sget-object v5, LD6/s;->e:LD6/s;

    .line 30
    .line 31
    iget-object v5, v5, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 32
    .line 33
    invoke-virtual {v5, v2}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Ljava/lang/Boolean;

    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    const-string v5, "Internal error for request JSON: "

    .line 44
    .line 45
    const/4 v6, 0x0

    .line 46
    iget-object v7, p0, LC8/i;->d:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v7, Lcom/google/android/gms/internal/ads/zzceq;

    .line 49
    .line 50
    iget-object v8, p0, LC8/i;->e:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v8, Lcom/google/android/gms/internal/ads/zzfqg;

    .line 53
    .line 54
    if-nez v2, :cond_1

    .line 55
    .line 56
    if-eqz v7, :cond_0

    .line 57
    .line 58
    :try_start_0
    invoke-interface {v7, v0}, Lcom/google/android/gms/internal/ads/zzceq;->zzb(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :catch_0
    move-exception p1

    .line 63
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    sget v1, LG6/L;->b:I

    .line 72
    .line 73
    invoke-static {p1}, LH6/l;->c(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    :cond_0
    :goto_0
    sget-object p1, Lcom/google/android/gms/internal/ads/zzbkq;->zze:Lcom/google/android/gms/internal/ads/zzbkh;

    .line 77
    .line 78
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbkh;->zze()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    check-cast p1, Ljava/lang/Boolean;

    .line 83
    .line 84
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    if-eqz p1, :cond_b

    .line 89
    .line 90
    if-eqz v3, :cond_b

    .line 91
    .line 92
    invoke-interface {v8, v0}, Lcom/google/android/gms/internal/ads/zzfqg;->zzk(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzfqg;

    .line 93
    .line 94
    .line 95
    invoke-interface {v8, v6}, Lcom/google/android/gms/internal/ads/zzfqg;->zzd(Z)Lcom/google/android/gms/internal/ads/zzfqg;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v3, v8}, Lcom/google/android/gms/internal/ads/zzfqq;->zza(Lcom/google/android/gms/internal/ads/zzfqg;)Lcom/google/android/gms/internal/ads/zzfqq;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzfqq;->zzh()V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :cond_1
    const-string v0, "SignalGeneratorImpl.generateSignals.onSuccess"

    .line 106
    .line 107
    const-string v2, ""

    .line 108
    .line 109
    if-nez p1, :cond_3

    .line 110
    .line 111
    if-eqz v7, :cond_2

    .line 112
    .line 113
    const/4 p1, 0x0

    .line 114
    :try_start_1
    invoke-interface {v7, p1, p1, p1}, Lcom/google/android/gms/internal/ads/zzceq;->zzc(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    :catchall_0
    move-exception p1

    .line 119
    goto/16 :goto_3

    .line 120
    .line 121
    :catch_1
    move-exception p1

    .line 122
    goto/16 :goto_2

    .line 123
    .line 124
    :cond_2
    :goto_1
    invoke-interface {v8, v4}, Lcom/google/android/gms/internal/ads/zzfqg;->zzd(Z)Lcom/google/android/gms/internal/ads/zzfqg;
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 125
    .line 126
    .line 127
    sget-object p1, Lcom/google/android/gms/internal/ads/zzbkq;->zze:Lcom/google/android/gms/internal/ads/zzbkh;

    .line 128
    .line 129
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbkh;->zze()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    check-cast p1, Ljava/lang/Boolean;

    .line 134
    .line 135
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 136
    .line 137
    .line 138
    move-result p1

    .line 139
    if-eqz p1, :cond_b

    .line 140
    .line 141
    if-eqz v3, :cond_b

    .line 142
    .line 143
    invoke-virtual {v3, v8}, Lcom/google/android/gms/internal/ads/zzfqq;->zza(Lcom/google/android/gms/internal/ads/zzfqg;)Lcom/google/android/gms/internal/ads/zzfqq;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzfqq;->zzh()V

    .line 147
    .line 148
    .line 149
    return-void

    .line 150
    :cond_3
    :try_start_2
    new-instance v9, Lorg/json/JSONObject;

    .line 151
    .line 152
    iget-object v10, p1, LN6/s;->b:Ljava/lang/String;

    .line 153
    .line 154
    invoke-direct {v9, v10}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 155
    .line 156
    .line 157
    :try_start_3
    const-string v5, "request_id"

    .line 158
    .line 159
    invoke-virtual {v9, v5, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v5

    .line 163
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 164
    .line 165
    .line 166
    move-result v5

    .line 167
    if-eqz v5, :cond_5

    .line 168
    .line 169
    const-string p1, "The request ID is empty in request JSON."

    .line 170
    .line 171
    sget v1, LG6/L;->b:I

    .line 172
    .line 173
    invoke-static {p1}, LH6/l;->f(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    if-eqz v7, :cond_4

    .line 177
    .line 178
    const-string p1, "Internal error: request ID is empty in request JSON."

    .line 179
    .line 180
    invoke-interface {v7, p1}, Lcom/google/android/gms/internal/ads/zzceq;->zzb(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    :cond_4
    const-string p1, "Request ID empty"

    .line 184
    .line 185
    invoke-interface {v8, p1}, Lcom/google/android/gms/internal/ads/zzfqg;->zzk(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzfqg;

    .line 186
    .line 187
    .line 188
    invoke-interface {v8, v6}, Lcom/google/android/gms/internal/ads/zzfqg;->zzd(Z)Lcom/google/android/gms/internal/ads/zzfqg;
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 189
    .line 190
    .line 191
    sget-object p1, Lcom/google/android/gms/internal/ads/zzbkq;->zze:Lcom/google/android/gms/internal/ads/zzbkh;

    .line 192
    .line 193
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbkh;->zze()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    check-cast p1, Ljava/lang/Boolean;

    .line 198
    .line 199
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 200
    .line 201
    .line 202
    move-result p1

    .line 203
    if-eqz p1, :cond_b

    .line 204
    .line 205
    if-eqz v3, :cond_b

    .line 206
    .line 207
    invoke-virtual {v3, v8}, Lcom/google/android/gms/internal/ads/zzfqq;->zza(Lcom/google/android/gms/internal/ads/zzfqg;)Lcom/google/android/gms/internal/ads/zzfqq;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzfqq;->zzh()V

    .line 211
    .line 212
    .line 213
    return-void

    .line 214
    :cond_5
    :try_start_4
    iget-object v5, p1, LN6/s;->d:Landroid/os/Bundle;

    .line 215
    .line 216
    iget-boolean v9, v1, LN6/j;->p:Z
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 217
    .line 218
    iget-object v10, v1, LN6/j;->q:Ljava/lang/String;

    .line 219
    .line 220
    iget-object v11, v1, LN6/j;->r:Ljava/lang/String;

    .line 221
    .line 222
    if-eqz v9, :cond_6

    .line 223
    .line 224
    if-eqz v5, :cond_6

    .line 225
    .line 226
    const/4 v9, -0x1

    .line 227
    :try_start_5
    invoke-virtual {v5, v11, v9}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 228
    .line 229
    .line 230
    move-result v12

    .line 231
    if-ne v12, v9, :cond_6

    .line 232
    .line 233
    iget-object v9, v1, LN6/j;->s:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 234
    .line 235
    invoke-virtual {v9}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 236
    .line 237
    .line 238
    move-result v9

    .line 239
    invoke-virtual {v5, v11, v9}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 240
    .line 241
    .line 242
    :cond_6
    iget-boolean v9, v1, LN6/j;->o:Z

    .line 243
    .line 244
    if-eqz v9, :cond_8

    .line 245
    .line 246
    if-eqz v5, :cond_8

    .line 247
    .line 248
    invoke-virtual {v5, v10}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v9

    .line 252
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 253
    .line 254
    .line 255
    move-result v9

    .line 256
    if-eqz v9, :cond_8

    .line 257
    .line 258
    iget-object v9, v1, LN6/j;->u:Ljava/lang/String;

    .line 259
    .line 260
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 261
    .line 262
    .line 263
    move-result v9

    .line 264
    if-eqz v9, :cond_7

    .line 265
    .line 266
    sget-object v9, LC6/n;->D:LC6/n;

    .line 267
    .line 268
    iget-object v9, v9, LC6/n;->c:LG6/U;

    .line 269
    .line 270
    iget-object v11, v1, LN6/j;->b:Landroid/content/Context;

    .line 271
    .line 272
    iget-object v12, v1, LN6/j;->t:LH6/a;

    .line 273
    .line 274
    iget-object v12, v12, LH6/a;->a:Ljava/lang/String;

    .line 275
    .line 276
    invoke-virtual {v9, v11, v12}, LG6/U;->E(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v9

    .line 280
    iput-object v9, v1, LN6/j;->u:Ljava/lang/String;

    .line 281
    .line 282
    :cond_7
    iget-object v1, v1, LN6/j;->u:Ljava/lang/String;

    .line 283
    .line 284
    invoke-virtual {v5, v10, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    :cond_8
    if-eqz v7, :cond_9

    .line 288
    .line 289
    iget-object v1, p1, LN6/s;->a:Ljava/lang/String;

    .line 290
    .line 291
    iget-object p1, p1, LN6/s;->b:Ljava/lang/String;

    .line 292
    .line 293
    invoke-interface {v7, v1, p1, v5}, Lcom/google/android/gms/internal/ads/zzceq;->zzc(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 294
    .line 295
    .line 296
    :cond_9
    invoke-interface {v8, v4}, Lcom/google/android/gms/internal/ads/zzfqg;->zzd(Z)Lcom/google/android/gms/internal/ads/zzfqg;
    :try_end_5
    .catch Landroid/os/RemoteException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 297
    .line 298
    .line 299
    sget-object p1, Lcom/google/android/gms/internal/ads/zzbkq;->zze:Lcom/google/android/gms/internal/ads/zzbkh;

    .line 300
    .line 301
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbkh;->zze()Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object p1

    .line 305
    check-cast p1, Ljava/lang/Boolean;

    .line 306
    .line 307
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 308
    .line 309
    .line 310
    move-result p1

    .line 311
    if-eqz p1, :cond_b

    .line 312
    .line 313
    if-eqz v3, :cond_b

    .line 314
    .line 315
    invoke-virtual {v3, v8}, Lcom/google/android/gms/internal/ads/zzfqq;->zza(Lcom/google/android/gms/internal/ads/zzfqg;)Lcom/google/android/gms/internal/ads/zzfqq;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzfqq;->zzh()V

    .line 319
    .line 320
    .line 321
    return-void

    .line 322
    :catch_2
    move-exception p1

    .line 323
    :try_start_6
    const-string v1, "Failed to create JSON object from the request string."

    .line 324
    .line 325
    sget v4, LG6/L;->b:I

    .line 326
    .line 327
    invoke-static {v1}, LH6/l;->f(Ljava/lang/String;)V

    .line 328
    .line 329
    .line 330
    if-eqz v7, :cond_a

    .line 331
    .line 332
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v1

    .line 336
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 337
    .line 338
    .line 339
    move-result v4

    .line 340
    add-int/lit8 v4, v4, 0x21

    .line 341
    .line 342
    new-instance v9, Ljava/lang/StringBuilder;

    .line 343
    .line 344
    invoke-direct {v9, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 348
    .line 349
    .line 350
    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 351
    .line 352
    .line 353
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v1

    .line 357
    invoke-interface {v7, v1}, Lcom/google/android/gms/internal/ads/zzceq;->zzb(Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    :cond_a
    invoke-interface {v8, p1}, Lcom/google/android/gms/internal/ads/zzfqg;->zzj(Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzfqg;

    .line 361
    .line 362
    .line 363
    invoke-interface {v8, v6}, Lcom/google/android/gms/internal/ads/zzfqg;->zzd(Z)Lcom/google/android/gms/internal/ads/zzfqg;

    .line 364
    .line 365
    .line 366
    sget-object v1, LC6/n;->D:LC6/n;

    .line 367
    .line 368
    iget-object v1, v1, LC6/n;->h:Lcom/google/android/gms/internal/ads/zzcfk;

    .line 369
    .line 370
    invoke-virtual {v1, p1, v0}, Lcom/google/android/gms/internal/ads/zzcfk;->zzh(Ljava/lang/Throwable;Ljava/lang/String;)V
    :try_end_6
    .catch Landroid/os/RemoteException; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 371
    .line 372
    .line 373
    sget-object p1, Lcom/google/android/gms/internal/ads/zzbkq;->zze:Lcom/google/android/gms/internal/ads/zzbkh;

    .line 374
    .line 375
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbkh;->zze()Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object p1

    .line 379
    check-cast p1, Ljava/lang/Boolean;

    .line 380
    .line 381
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 382
    .line 383
    .line 384
    move-result p1

    .line 385
    if-eqz p1, :cond_b

    .line 386
    .line 387
    if-eqz v3, :cond_b

    .line 388
    .line 389
    invoke-virtual {v3, v8}, Lcom/google/android/gms/internal/ads/zzfqq;->zza(Lcom/google/android/gms/internal/ads/zzfqg;)Lcom/google/android/gms/internal/ads/zzfqq;

    .line 390
    .line 391
    .line 392
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzfqq;->zzh()V

    .line 393
    .line 394
    .line 395
    return-void

    .line 396
    :goto_2
    :try_start_7
    invoke-interface {v8, p1}, Lcom/google/android/gms/internal/ads/zzfqg;->zzj(Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzfqg;

    .line 397
    .line 398
    .line 399
    invoke-interface {v8, v6}, Lcom/google/android/gms/internal/ads/zzfqg;->zzd(Z)Lcom/google/android/gms/internal/ads/zzfqg;

    .line 400
    .line 401
    .line 402
    sget v1, LG6/L;->b:I

    .line 403
    .line 404
    invoke-static {v2, p1}, LH6/l;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 405
    .line 406
    .line 407
    sget-object v1, LC6/n;->D:LC6/n;

    .line 408
    .line 409
    iget-object v1, v1, LC6/n;->h:Lcom/google/android/gms/internal/ads/zzcfk;

    .line 410
    .line 411
    invoke-virtual {v1, p1, v0}, Lcom/google/android/gms/internal/ads/zzcfk;->zzh(Ljava/lang/Throwable;Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 412
    .line 413
    .line 414
    sget-object p1, Lcom/google/android/gms/internal/ads/zzbkq;->zze:Lcom/google/android/gms/internal/ads/zzbkh;

    .line 415
    .line 416
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbkh;->zze()Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object p1

    .line 420
    check-cast p1, Ljava/lang/Boolean;

    .line 421
    .line 422
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 423
    .line 424
    .line 425
    move-result p1

    .line 426
    if-eqz p1, :cond_b

    .line 427
    .line 428
    if-eqz v3, :cond_b

    .line 429
    .line 430
    invoke-virtual {v3, v8}, Lcom/google/android/gms/internal/ads/zzfqq;->zza(Lcom/google/android/gms/internal/ads/zzfqg;)Lcom/google/android/gms/internal/ads/zzfqq;

    .line 431
    .line 432
    .line 433
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzfqq;->zzh()V

    .line 434
    .line 435
    .line 436
    :cond_b
    return-void

    .line 437
    :goto_3
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbkq;->zze:Lcom/google/android/gms/internal/ads/zzbkh;

    .line 438
    .line 439
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbkh;->zze()Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    check-cast v0, Ljava/lang/Boolean;

    .line 444
    .line 445
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 446
    .line 447
    .line 448
    move-result v0

    .line 449
    if-eqz v0, :cond_c

    .line 450
    .line 451
    if-eqz v3, :cond_c

    .line 452
    .line 453
    invoke-virtual {v3, v8}, Lcom/google/android/gms/internal/ads/zzfqq;->zza(Lcom/google/android/gms/internal/ads/zzfqg;)Lcom/google/android/gms/internal/ads/zzfqq;

    .line 454
    .line 455
    .line 456
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzfqq;->zzh()V

    .line 457
    .line 458
    .line 459
    :cond_c
    throw p1
.end method
