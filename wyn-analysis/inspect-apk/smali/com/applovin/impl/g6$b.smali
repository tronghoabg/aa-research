.class Lcom/applovin/impl/g6$b;
.super Lcom/applovin/impl/j5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/applovin/impl/g6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field private final g:J

.field private final h:I

.field private final i:Lcom/applovin/impl/y2;

.field private final j:Ljava/util/List;

.field final synthetic k:Lcom/applovin/impl/g6;


# direct methods
.method private constructor <init>(Lcom/applovin/impl/g6;ILjava/util/List;)V
    .locals 2

    .line 2
    iput-object p1, p0, Lcom/applovin/impl/g6$b;->k:Lcom/applovin/impl/g6;

    .line 3
    invoke-static {p1}, Lcom/applovin/impl/g6;->a(Lcom/applovin/impl/g6;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Lcom/applovin/impl/g6;->b(Lcom/applovin/impl/g6;)Lcom/applovin/impl/sdk/k;

    move-result-object v1

    invoke-static {p1}, Lcom/applovin/impl/g6;->d(Lcom/applovin/impl/g6;)Lcom/applovin/impl/a3;

    move-result-object p1

    invoke-virtual {p1}, Lcom/applovin/impl/a3;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v0, v1, p1}, Lcom/applovin/impl/j5;-><init>(Ljava/lang/String;Lcom/applovin/impl/sdk/k;Ljava/lang/String;)V

    .line 4
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/applovin/impl/g6$b;->g:J

    .line 5
    iput p2, p0, Lcom/applovin/impl/g6$b;->h:I

    .line 6
    invoke-interface {p3, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/applovin/impl/y2;

    iput-object p1, p0, Lcom/applovin/impl/g6$b;->i:Lcom/applovin/impl/y2;

    .line 7
    iput-object p3, p0, Lcom/applovin/impl/g6$b;->j:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/applovin/impl/g6;ILjava/util/List;Lcom/applovin/impl/g6$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/applovin/impl/g6$b;-><init>(Lcom/applovin/impl/g6;ILjava/util/List;)V

    return-void
.end method

.method public static synthetic a(Lcom/applovin/impl/g6$b;)Lcom/applovin/impl/sdk/o;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/applovin/impl/j5;->c:Lcom/applovin/impl/sdk/o;

    return-object p0
.end method

.method public static synthetic a(Lcom/applovin/impl/g6$b;Lcom/applovin/impl/y2;Lcom/applovin/mediation/MaxNetworkResponseInfo$AdLoadState;JLcom/applovin/mediation/MaxError;)V
    .locals 0

    .line 2
    invoke-direct/range {p0 .. p5}, Lcom/applovin/impl/g6$b;->a(Lcom/applovin/impl/y2;Lcom/applovin/mediation/MaxNetworkResponseInfo$AdLoadState;JLcom/applovin/mediation/MaxError;)V

    return-void
.end method

.method public static synthetic a(Lcom/applovin/impl/g6$b;Ljava/lang/String;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lcom/applovin/impl/g6$b;->b(Ljava/lang/String;)V

    return-void
.end method

.method private a(Lcom/applovin/impl/y2;Lcom/applovin/mediation/MaxNetworkResponseInfo$AdLoadState;JLcom/applovin/mediation/MaxError;)V
    .locals 9

    .line 4
    invoke-virtual {p1}, Lcom/applovin/impl/y2;->T()Z

    move-result v4

    .line 5
    invoke-virtual {p1}, Lcom/applovin/impl/k3;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/applovin/impl/w3;->a(Ljava/lang/String;)Lcom/applovin/mediation/MaxMediatedNetworkInfo;

    move-result-object v2

    .line 6
    new-instance v0, Lcom/applovin/impl/mediation/MaxNetworkResponseInfoImpl;

    invoke-virtual {p1}, Lcom/applovin/impl/y2;->E()Landroid/os/Bundle;

    move-result-object v3

    invoke-virtual {p1}, Lcom/applovin/impl/y2;->B()Ljava/lang/String;

    move-result-object v7

    move-object v1, p2

    move-wide v5, p3

    move-object v8, p5

    invoke-direct/range {v0 .. v8}, Lcom/applovin/impl/mediation/MaxNetworkResponseInfoImpl;-><init>(Lcom/applovin/mediation/MaxNetworkResponseInfo$AdLoadState;Lcom/applovin/mediation/MaxMediatedNetworkInfo;Landroid/os/Bundle;ZJLjava/lang/String;Lcom/applovin/mediation/MaxError;)V

    .line 7
    iget-object p1, p0, Lcom/applovin/impl/g6$b;->k:Lcom/applovin/impl/g6;

    invoke-static {p1}, Lcom/applovin/impl/g6;->c(Lcom/applovin/impl/g6;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static synthetic b(Lcom/applovin/impl/g6$b;)I
    .locals 0

    .line 2
    iget p0, p0, Lcom/applovin/impl/g6$b;->h:I

    return p0
.end method

.method private b(Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public static synthetic c(Lcom/applovin/impl/g6$b;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/applovin/impl/g6$b;->j:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic d(Lcom/applovin/impl/g6$b;)Lcom/applovin/impl/sdk/o;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/applovin/impl/j5;->c:Lcom/applovin/impl/sdk/o;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic e(Lcom/applovin/impl/g6$b;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/applovin/impl/j5;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic f(Lcom/applovin/impl/g6$b;)Lcom/applovin/impl/sdk/o;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/applovin/impl/j5;->c:Lcom/applovin/impl/sdk/o;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic g(Lcom/applovin/impl/g6$b;)Lcom/applovin/impl/y2;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/applovin/impl/g6$b;->i:Lcom/applovin/impl/y2;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic h(Lcom/applovin/impl/g6$b;)Lcom/applovin/impl/sdk/k;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/applovin/impl/j5;->a:Lcom/applovin/impl/sdk/k;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic i(Lcom/applovin/impl/g6$b;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/applovin/impl/g6$b;->g:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static synthetic j(Lcom/applovin/impl/g6$b;)Lcom/applovin/impl/sdk/o;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/applovin/impl/j5;->c:Lcom/applovin/impl/sdk/o;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic k(Lcom/applovin/impl/g6$b;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/applovin/impl/j5;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/applovin/impl/g6$b;->k:Lcom/applovin/impl/g6;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/applovin/impl/g6;->d(Lcom/applovin/impl/g6;)Lcom/applovin/impl/a3;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/applovin/impl/a3;->b()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Lcom/applovin/impl/g6$b;->k:Lcom/applovin/impl/g6;

    .line 12
    .line 13
    invoke-static {v1}, Lcom/applovin/impl/g6;->d(Lcom/applovin/impl/g6;)Lcom/applovin/impl/a3;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Lcom/applovin/impl/a3;->a()Lcom/applovin/mediation/MaxAdFormat;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {}, Lcom/applovin/impl/sdk/o;->a()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    iget-object v2, p0, Lcom/applovin/impl/j5;->c:Lcom/applovin/impl/sdk/o;

    .line 28
    .line 29
    iget-object v3, p0, Lcom/applovin/impl/j5;->b:Ljava/lang/String;

    .line 30
    .line 31
    new-instance v4, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    const-string v5, "Loading ad "

    .line 34
    .line 35
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    iget v5, p0, Lcom/applovin/impl/g6$b;->h:I

    .line 39
    .line 40
    add-int/lit8 v5, v5, 0x1

    .line 41
    .line 42
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v5, " of "

    .line 46
    .line 47
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    iget-object v5, p0, Lcom/applovin/impl/g6$b;->j:Ljava/util/List;

    .line 51
    .line 52
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string v5, " from "

    .line 60
    .line 61
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    iget-object v5, p0, Lcom/applovin/impl/g6$b;->i:Lcom/applovin/impl/y2;

    .line 65
    .line 66
    invoke-virtual {v5}, Lcom/applovin/impl/k3;->c()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v5, " for "

    .line 74
    .line 75
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1}, Lcom/applovin/mediation/MaxAdFormat;->getLabel()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string v5, " ad unit "

    .line 86
    .line 87
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-static {v4, v0, v2, v3}, Lcb/a;->w(Ljava/lang/StringBuilder;Ljava/lang/String;Lcom/applovin/impl/sdk/o;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    :cond_0
    const-string v2, "started to load ad"

    .line 94
    .line 95
    invoke-direct {p0, v2}, Lcom/applovin/impl/g6$b;->b(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    iget-object v2, p0, Lcom/applovin/impl/g6$b;->k:Lcom/applovin/impl/g6;

    .line 99
    .line 100
    invoke-static {v2}, Lcom/applovin/impl/g6;->e(Lcom/applovin/impl/g6;)Ljava/lang/ref/WeakReference;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    check-cast v2, Landroid/content/Context;

    .line 109
    .line 110
    instance-of v3, v2, Landroid/app/Activity;

    .line 111
    .line 112
    if-eqz v3, :cond_1

    .line 113
    .line 114
    check-cast v2, Landroid/app/Activity;

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_1
    iget-object v2, p0, Lcom/applovin/impl/j5;->a:Lcom/applovin/impl/sdk/k;

    .line 118
    .line 119
    invoke-virtual {v2}, Lcom/applovin/impl/sdk/k;->v0()Landroid/app/Activity;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    :goto_0
    iget-object v3, p0, Lcom/applovin/impl/j5;->a:Lcom/applovin/impl/sdk/k;

    .line 124
    .line 125
    invoke-virtual {v3}, Lcom/applovin/impl/sdk/k;->a0()Lcom/applovin/impl/sdk/p;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    iget-object v4, p0, Lcom/applovin/impl/g6$b;->i:Lcom/applovin/impl/y2;

    .line 130
    .line 131
    invoke-virtual {v3, v4}, Lcom/applovin/impl/sdk/p;->b(Lcom/applovin/impl/y2;)V

    .line 132
    .line 133
    .line 134
    iget-object v3, p0, Lcom/applovin/impl/j5;->a:Lcom/applovin/impl/sdk/k;

    .line 135
    .line 136
    invoke-virtual {v3}, Lcom/applovin/impl/sdk/k;->X()Lcom/applovin/impl/mediation/MediationServiceImpl;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    iget-object v4, p0, Lcom/applovin/impl/g6$b;->i:Lcom/applovin/impl/y2;

    .line 141
    .line 142
    new-instance v5, Lcom/applovin/impl/g6$b$a;

    .line 143
    .line 144
    iget-object v6, p0, Lcom/applovin/impl/g6$b;->k:Lcom/applovin/impl/g6;

    .line 145
    .line 146
    invoke-static {v6}, Lcom/applovin/impl/g6;->f(Lcom/applovin/impl/g6;)Lcom/applovin/impl/mediation/ads/a$a;

    .line 147
    .line 148
    .line 149
    move-result-object v6

    .line 150
    invoke-direct {v5, p0, v6, v1, v0}, Lcom/applovin/impl/g6$b$a;-><init>(Lcom/applovin/impl/g6$b;Lcom/applovin/impl/mediation/ads/a$a;Lcom/applovin/mediation/MaxAdFormat;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v3, v0, v4, v2, v5}, Lcom/applovin/impl/mediation/MediationServiceImpl;->loadThirdPartyMediatedAd(Ljava/lang/String;Lcom/applovin/impl/y2;Landroid/app/Activity;Lcom/applovin/impl/mediation/ads/a$a;)V

    .line 154
    .line 155
    .line 156
    return-void
.end method
