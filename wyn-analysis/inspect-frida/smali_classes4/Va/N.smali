.class public final LVa/N;
.super LVa/Ba;
.source "SourceFile"


# instance fields
.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Landroid/content/Context;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Ljava/util/List;

.field public final synthetic g:Ljava/util/LinkedHashMap;

.field public final synthetic h:LVa/v;

.field public final synthetic i:LVa/V;


# direct methods
.method public constructor <init>(LVa/V;Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;Ljava/util/List;Ljava/util/LinkedHashMap;LVa/v;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LVa/N;->i:LVa/V;

    .line 5
    .line 6
    iput-object p2, p0, LVa/N;->c:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, LVa/N;->d:Landroid/content/Context;

    .line 9
    .line 10
    iput-object p4, p0, LVa/N;->e:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, LVa/N;->f:Ljava/util/List;

    .line 13
    .line 14
    iput-object p6, p0, LVa/N;->g:Ljava/util/LinkedHashMap;

    .line 15
    .line 16
    iput-object p7, p0, LVa/N;->h:LVa/v;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final c()V
    .locals 11

    .line 1
    invoke-static {}, LVa/G;->S()LVa/G;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget v1, LVa/V;->p:I

    .line 6
    .line 7
    add-int/lit8 v1, v1, 0x63

    .line 8
    .line 9
    rem-int/lit16 v2, v1, 0x80

    .line 10
    .line 11
    sput v2, LVa/V;->q:I

    .line 12
    .line 13
    rem-int/lit8 v1, v1, 0x2

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    iget-object v3, p0, LVa/N;->i:LVa/V;

    .line 17
    .line 18
    if-eqz v1, :cond_3

    .line 19
    .line 20
    iget-object v1, v3, LVa/V;->k:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v4, p0, LVa/N;->c:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v0, v4, v1}, LVa/G;->V(Ljava/lang/String;Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    new-instance v10, LVa/M;

    .line 31
    .line 32
    invoke-direct {v10, p0}, LVa/M;-><init>(LVa/N;)V

    .line 33
    .line 34
    .line 35
    sget v0, LVa/V;->q:I

    .line 36
    .line 37
    add-int/lit8 v0, v0, 0x39

    .line 38
    .line 39
    rem-int/lit16 v1, v0, 0x80

    .line 40
    .line 41
    sput v1, LVa/V;->p:I

    .line 42
    .line 43
    rem-int/lit8 v0, v0, 0x2

    .line 44
    .line 45
    iget-object v7, p0, LVa/N;->e:Ljava/lang/String;

    .line 46
    .line 47
    iget-object v8, p0, LVa/N;->c:Ljava/lang/String;

    .line 48
    .line 49
    iget-object v9, p0, LVa/N;->f:Ljava/util/List;

    .line 50
    .line 51
    iget-object v5, p0, LVa/N;->i:LVa/V;

    .line 52
    .line 53
    iget-object v6, p0, LVa/N;->d:Landroid/content/Context;

    .line 54
    .line 55
    invoke-virtual/range {v5 .. v10}, LVa/V;->q(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;LVa/M;)V

    .line 56
    .line 57
    .line 58
    if-nez v0, :cond_0

    .line 59
    .line 60
    return-void

    .line 61
    :cond_0
    throw v2

    .line 62
    :cond_1
    new-instance v0, Lorg/json/JSONObject;

    .line 63
    .line 64
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 65
    .line 66
    .line 67
    sget v1, LVa/V;->p:I

    .line 68
    .line 69
    add-int/lit8 v1, v1, 0x7

    .line 70
    .line 71
    rem-int/lit16 v2, v1, 0x80

    .line 72
    .line 73
    sput v2, LVa/V;->q:I

    .line 74
    .line 75
    rem-int/lit8 v1, v1, 0x2

    .line 76
    .line 77
    invoke-virtual {v3, v4, v0}, LVa/V;->s(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 78
    .line 79
    .line 80
    if-nez v1, :cond_2

    .line 81
    .line 82
    const/16 v1, 0x57

    .line 83
    .line 84
    div-int/lit8 v1, v1, 0x0

    .line 85
    .line 86
    :cond_2
    sget v1, LVa/V;->q:I

    .line 87
    .line 88
    add-int/lit8 v1, v1, 0x1b

    .line 89
    .line 90
    rem-int/lit16 v1, v1, 0x80

    .line 91
    .line 92
    sput v1, LVa/V;->p:I

    .line 93
    .line 94
    invoke-static {v3}, LVa/V;->h(LVa/V;)Ljava/util/HashMap;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-virtual {v1, v4, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    new-instance v0, LVa/M;

    .line 102
    .line 103
    invoke-direct {v0}, LVa/M;-><init>()V

    .line 104
    .line 105
    .line 106
    iput-object p0, v0, LVa/M;->d:LVa/N;

    .line 107
    .line 108
    invoke-static {}, LVa/G;->S()LVa/G;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-virtual {v1}, LVa/G;->E()I

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    int-to-long v1, v1

    .line 117
    invoke-static {v0, v1, v2}, LVa/Cb;->a(LVa/Ba;J)V

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :cond_3
    iget-object v0, v3, LVa/V;->k:Ljava/lang/String;

    .line 122
    .line 123
    throw v2
.end method
