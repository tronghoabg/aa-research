.class public final Lea/Y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lea/Y;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lea/Y;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lea/Y;->a:Lea/Y;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(LP9/d;Llf/c;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p2, Lea/q;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lea/q;

    .line 7
    .line 8
    iget v1, v0, Lea/q;->d:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lea/q;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lea/q;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lea/q;-><init>(Lea/Y;Llf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lea/q;->b:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, Lea/q;->d:I

    .line 30
    .line 31
    const-string v3, ""

    .line 32
    .line 33
    const-string v4, "InstallationId"

    .line 34
    .line 35
    const/4 v5, 0x2

    .line 36
    const/4 v6, 0x1

    .line 37
    if-eqz v2, :cond_3

    .line 38
    .line 39
    if-eq v2, v6, :cond_2

    .line 40
    .line 41
    if-ne v2, v5, :cond_1

    .line 42
    .line 43
    iget-object p1, v0, Lea/q;->a:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, Ljava/lang/String;

    .line 46
    .line 47
    :try_start_0
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    .line 49
    .line 50
    goto/16 :goto_6

    .line 51
    .line 52
    :catch_0
    move-exception p2

    .line 53
    goto/16 :goto_7

    .line 54
    .line 55
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 56
    .line 57
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p1

    .line 63
    :cond_2
    iget-object p1, v0, Lea/q;->a:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast p1, LP9/d;

    .line 66
    .line 67
    :try_start_1
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :catch_1
    move-exception p2

    .line 72
    goto :goto_3

    .line 73
    :cond_3
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    :try_start_2
    move-object p2, p1

    .line 77
    check-cast p2, LP9/c;

    .line 78
    .line 79
    invoke-virtual {p2}, LP9/c;->e()Lcom/google/android/gms/tasks/Task;

    .line 80
    .line 81
    .line 82
    move-result-object p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 83
    :try_start_3
    const-string v2, "firebaseInstallations.getToken(false)"

    .line 84
    .line 85
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    iput-object p2, v0, Lea/q;->a:Ljava/lang/Object;

    .line 89
    .line 90
    iput v6, v0, Lea/q;->d:I

    .line 91
    .line 92
    invoke-static {p1, v0}, LFe/e;->k(Lcom/google/android/gms/tasks/Task;Lea/q;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 96
    if-ne p1, v1, :cond_4

    .line 97
    .line 98
    goto :goto_5

    .line 99
    :cond_4
    move-object v7, p2

    .line 100
    move-object p2, p1

    .line 101
    move-object p1, v7

    .line 102
    :goto_1
    :try_start_4
    check-cast p2, LP9/a;

    .line 103
    .line 104
    iget-object p2, p2, LP9/a;->a:Ljava/lang/String;

    .line 105
    .line 106
    const-string v2, "{\n          firebaseInst\u2026).await().token\n        }"

    .line 107
    .line 108
    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    .line 109
    .line 110
    .line 111
    move-object v7, p2

    .line 112
    move-object p2, p1

    .line 113
    move-object p1, v7

    .line 114
    goto :goto_4

    .line 115
    :goto_2
    move-object v7, p2

    .line 116
    move-object p2, p1

    .line 117
    move-object p1, v7

    .line 118
    goto :goto_3

    .line 119
    :catch_2
    move-exception p1

    .line 120
    goto :goto_2

    .line 121
    :goto_3
    const-string v2, "Error getting authentication token."

    .line 122
    .line 123
    invoke-static {v4, v2, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 124
    .line 125
    .line 126
    move-object p2, p1

    .line 127
    move-object p1, v3

    .line 128
    :goto_4
    :try_start_5
    check-cast p2, LP9/c;

    .line 129
    .line 130
    invoke-virtual {p2}, LP9/c;->d()Lcom/google/android/gms/tasks/Task;

    .line 131
    .line 132
    .line 133
    move-result-object p2

    .line 134
    const-string v2, "firebaseInstallations.id"

    .line 135
    .line 136
    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    iput-object p1, v0, Lea/q;->a:Ljava/lang/Object;

    .line 140
    .line 141
    iput v5, v0, Lea/q;->d:I

    .line 142
    .line 143
    invoke-static {p2, v0}, LFe/e;->k(Lcom/google/android/gms/tasks/Task;Lea/q;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p2

    .line 147
    if-ne p2, v1, :cond_5

    .line 148
    .line 149
    :goto_5
    return-object v1

    .line 150
    :cond_5
    :goto_6
    const-string v0, "{\n          firebaseInst\u2026ions.id.await()\n        }"

    .line 151
    .line 152
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    check-cast p2, Ljava/lang/String;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 156
    .line 157
    move-object v3, p2

    .line 158
    goto :goto_8

    .line 159
    :goto_7
    const-string v0, "Error getting Firebase installation id ."

    .line 160
    .line 161
    invoke-static {v4, v0, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 162
    .line 163
    .line 164
    :goto_8
    new-instance p2, Lea/r;

    .line 165
    .line 166
    invoke-direct {p2, v3, p1}, Lea/r;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    return-object p2
.end method
