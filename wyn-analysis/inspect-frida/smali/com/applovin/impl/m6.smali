.class public abstract Lcom/applovin/impl/m6;
.super Lcom/applovin/impl/j5;
.source "SourceFile"

# interfaces
.implements Lcom/applovin/impl/q0$e;


# instance fields
.field private final g:Lcom/applovin/impl/sdk/network/a;

.field private final h:Lcom/applovin/impl/q0$e;

.field private i:Lcom/applovin/impl/e6$b;

.field private j:Lcom/applovin/impl/y4;

.field private k:Lcom/applovin/impl/y4;

.field protected l:Lcom/applovin/impl/q0$b;


# direct methods
.method public constructor <init>(Lcom/applovin/impl/sdk/network/a;Lcom/applovin/impl/sdk/k;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lcom/applovin/impl/m6;-><init>(Lcom/applovin/impl/sdk/network/a;Lcom/applovin/impl/sdk/k;Z)V

    return-void
.end method

.method public constructor <init>(Lcom/applovin/impl/sdk/network/a;Lcom/applovin/impl/sdk/k;Z)V
    .locals 1

    .line 2
    const-string v0, "TaskRepeatRequest"

    invoke-direct {p0, v0, p2, p3}, Lcom/applovin/impl/j5;-><init>(Ljava/lang/String;Lcom/applovin/impl/sdk/k;Z)V

    .line 3
    sget-object p3, Lcom/applovin/impl/e6$b;->e:Lcom/applovin/impl/e6$b;

    iput-object p3, p0, Lcom/applovin/impl/m6;->i:Lcom/applovin/impl/e6$b;

    if-eqz p1, :cond_0

    .line 4
    invoke-virtual {p1}, Lcom/applovin/impl/sdk/network/a;->f()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, p3}, Lcom/applovin/impl/j5;->a(Ljava/lang/String;)V

    .line 5
    iput-object p1, p0, Lcom/applovin/impl/m6;->g:Lcom/applovin/impl/sdk/network/a;

    .line 6
    new-instance p1, Lcom/applovin/impl/q0$b;

    invoke-direct {p1}, Lcom/applovin/impl/q0$b;-><init>()V

    iput-object p1, p0, Lcom/applovin/impl/m6;->l:Lcom/applovin/impl/q0$b;

    .line 7
    new-instance p1, Lcom/applovin/impl/m6$a;

    invoke-direct {p1, p0, p2}, Lcom/applovin/impl/m6$a;-><init>(Lcom/applovin/impl/m6;Lcom/applovin/impl/sdk/k;)V

    iput-object p1, p0, Lcom/applovin/impl/m6;->h:Lcom/applovin/impl/q0$e;

    return-void

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "No request specified"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic a(Lcom/applovin/impl/m6;)Lcom/applovin/impl/sdk/network/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/applovin/impl/m6;->g:Lcom/applovin/impl/sdk/network/a;

    return-object p0
.end method

.method public static synthetic a(Lcom/applovin/impl/m6;Lcom/applovin/impl/y4;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/applovin/impl/m6;->a(Lcom/applovin/impl/y4;)V

    return-void
.end method

.method private a(Lcom/applovin/impl/y4;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 4
    invoke-virtual {p0}, Lcom/applovin/impl/j5;->b()Lcom/applovin/impl/sdk/k;

    move-result-object v0

    invoke-virtual {v0}, Lcom/applovin/impl/sdk/k;->p0()Lcom/applovin/impl/z4;

    move-result-object v0

    .line 5
    invoke-virtual {p1}, Lcom/applovin/impl/y4;->a()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/applovin/impl/z4;->a(Lcom/applovin/impl/y4;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public static synthetic b(Lcom/applovin/impl/m6;)Lcom/applovin/impl/y4;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/applovin/impl/m6;->j:Lcom/applovin/impl/y4;

    return-object p0
.end method

.method public static synthetic c(Lcom/applovin/impl/m6;)Lcom/applovin/impl/e6$b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/applovin/impl/m6;->i:Lcom/applovin/impl/e6$b;

    return-object p0
.end method

.method public static synthetic d(Lcom/applovin/impl/m6;)Lcom/applovin/impl/y4;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/applovin/impl/m6;->k:Lcom/applovin/impl/y4;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public a(Lcom/applovin/impl/e6$b;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/applovin/impl/m6;->i:Lcom/applovin/impl/e6$b;

    return-void
.end method

.method public abstract a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Object;)V
.end method

.method public abstract a(Ljava/lang/String;Ljava/lang/Object;I)V
.end method

.method public b(Lcom/applovin/impl/y4;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/applovin/impl/m6;->k:Lcom/applovin/impl/y4;

    return-void
.end method

.method public c(Lcom/applovin/impl/y4;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/applovin/impl/m6;->j:Lcom/applovin/impl/y4;

    return-void
.end method

.method public run()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/applovin/impl/j5;->b()Lcom/applovin/impl/sdk/k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/applovin/impl/sdk/k;->w()Lcom/applovin/impl/q0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, Lcom/applovin/impl/j5;->b()Lcom/applovin/impl/sdk/k;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Lcom/applovin/impl/sdk/k;->F0()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x0

    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/applovin/impl/j5;->b()Lcom/applovin/impl/sdk/k;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1}, Lcom/applovin/impl/sdk/k;->C0()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const-string v0, "AppLovinSdk"

    .line 32
    .line 33
    const-string v1, "AppLovin SDK is disabled"

    .line 34
    .line 35
    invoke-static {v0, v1}, Lcom/applovin/impl/sdk/o;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lcom/applovin/impl/m6;->g:Lcom/applovin/impl/sdk/network/a;

    .line 39
    .line 40
    invoke-virtual {v0}, Lcom/applovin/impl/sdk/network/a;->f()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const/16 v1, -0x16

    .line 45
    .line 46
    invoke-virtual {p0, v0, v1, v2, v2}, Lcom/applovin/impl/m6;->a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_1
    :goto_0
    iget-object v1, p0, Lcom/applovin/impl/m6;->g:Lcom/applovin/impl/sdk/network/a;

    .line 51
    .line 52
    invoke-virtual {v1}, Lcom/applovin/impl/sdk/network/a;->f()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-static {v1}, Lcom/applovin/impl/sdk/utils/StringUtils;->isValidString(Ljava/lang/String;)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_4

    .line 61
    .line 62
    iget-object v1, p0, Lcom/applovin/impl/m6;->g:Lcom/applovin/impl/sdk/network/a;

    .line 63
    .line 64
    invoke-virtual {v1}, Lcom/applovin/impl/sdk/network/a;->f()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    const/4 v3, 0x4

    .line 73
    if-lt v1, v3, :cond_4

    .line 74
    .line 75
    iget-object v1, p0, Lcom/applovin/impl/m6;->g:Lcom/applovin/impl/sdk/network/a;

    .line 76
    .line 77
    invoke-virtual {v1}, Lcom/applovin/impl/sdk/network/a;->h()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-eqz v1, :cond_3

    .line 86
    .line 87
    iget-object v1, p0, Lcom/applovin/impl/m6;->g:Lcom/applovin/impl/sdk/network/a;

    .line 88
    .line 89
    invoke-virtual {v1}, Lcom/applovin/impl/sdk/network/a;->b()Lorg/json/JSONObject;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    if-eqz v1, :cond_2

    .line 94
    .line 95
    const-string v1, "POST"

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_2
    const-string v1, "GET"

    .line 99
    .line 100
    :goto_1
    iget-object v2, p0, Lcom/applovin/impl/m6;->g:Lcom/applovin/impl/sdk/network/a;

    .line 101
    .line 102
    invoke-virtual {v2, v1}, Lcom/applovin/impl/sdk/network/a;->b(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    :cond_3
    iget-object v1, p0, Lcom/applovin/impl/m6;->g:Lcom/applovin/impl/sdk/network/a;

    .line 106
    .line 107
    iget-object v2, p0, Lcom/applovin/impl/m6;->l:Lcom/applovin/impl/q0$b;

    .line 108
    .line 109
    iget-object v3, p0, Lcom/applovin/impl/m6;->h:Lcom/applovin/impl/q0$e;

    .line 110
    .line 111
    invoke-virtual {v0, v1, v2, v3}, Lcom/applovin/impl/q0;->a(Lcom/applovin/impl/sdk/network/a;Lcom/applovin/impl/q0$b;Lcom/applovin/impl/q0$e;)V

    .line 112
    .line 113
    .line 114
    return-void

    .line 115
    :cond_4
    invoke-static {}, Lcom/applovin/impl/sdk/o;->a()Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-eqz v0, :cond_5

    .line 120
    .line 121
    iget-object v0, p0, Lcom/applovin/impl/j5;->c:Lcom/applovin/impl/sdk/o;

    .line 122
    .line 123
    iget-object v1, p0, Lcom/applovin/impl/j5;->b:Ljava/lang/String;

    .line 124
    .line 125
    const-string v3, "Task has an invalid or null request endpoint."

    .line 126
    .line 127
    invoke-virtual {v0, v1, v3}, Lcom/applovin/impl/sdk/o;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    :cond_5
    iget-object v0, p0, Lcom/applovin/impl/m6;->g:Lcom/applovin/impl/sdk/network/a;

    .line 131
    .line 132
    invoke-virtual {v0}, Lcom/applovin/impl/sdk/network/a;->f()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    const/16 v1, -0x384

    .line 137
    .line 138
    invoke-virtual {p0, v0, v1, v2, v2}, Lcom/applovin/impl/m6;->a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    return-void
.end method
