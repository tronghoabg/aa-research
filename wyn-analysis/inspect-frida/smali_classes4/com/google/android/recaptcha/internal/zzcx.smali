.class public final Lcom/google/android/recaptcha/internal/zzcx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/recaptcha/RecaptchaClient;
.implements Lcom/google/android/recaptcha/RecaptchaTasksClient;


# static fields
.field private static final zza:LBf/i;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final zzb:Landroid/app/Application;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final zzc:Lcom/google/android/recaptcha/internal/zzl;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final zzd:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final zze:Lcom/google/android/recaptcha/internal/zzbv;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final zzf:Lcom/google/android/recaptcha/internal/zzpq;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final zzg:Lcom/google/android/recaptcha/internal/zzdc;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final zzh:Lcom/google/android/recaptcha/internal/zzbl;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final zzi:Lcom/google/android/recaptcha/internal/zzbo;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LBf/i;

    .line 2
    .line 3
    const-string v1, "^[a-zA-Z0-9/_]{0,100}$"

    .line 4
    .line 5
    invoke-direct {v0, v1}, LBf/i;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/google/android/recaptcha/internal/zzcx;->zza:LBf/i;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Landroid/app/Application;Lcom/google/android/recaptcha/internal/zzl;Ljava/lang/String;Lcom/google/android/recaptcha/internal/zzbo;Lcom/google/android/recaptcha/internal/zzbv;Lcom/google/android/recaptcha/internal/zzpq;Lcom/google/android/recaptcha/internal/zzdc;Lcom/google/android/recaptcha/internal/zzbl;Lcom/google/android/recaptcha/internal/zzds;)V
    .locals 0
    .param p1    # Landroid/app/Application;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/android/recaptcha/internal/zzl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/google/android/recaptcha/internal/zzbo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/google/android/recaptcha/internal/zzbv;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lcom/google/android/recaptcha/internal/zzpq;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lcom/google/android/recaptcha/internal/zzdc;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Lcom/google/android/recaptcha/internal/zzbl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p9    # Lcom/google/android/recaptcha/internal/zzds;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzcx;->zzb:Landroid/app/Application;

    iput-object p2, p0, Lcom/google/android/recaptcha/internal/zzcx;->zzc:Lcom/google/android/recaptcha/internal/zzl;

    iput-object p3, p0, Lcom/google/android/recaptcha/internal/zzcx;->zzd:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/recaptcha/internal/zzcx;->zzi:Lcom/google/android/recaptcha/internal/zzbo;

    iput-object p5, p0, Lcom/google/android/recaptcha/internal/zzcx;->zze:Lcom/google/android/recaptcha/internal/zzbv;

    iput-object p6, p0, Lcom/google/android/recaptcha/internal/zzcx;->zzf:Lcom/google/android/recaptcha/internal/zzpq;

    iput-object p7, p0, Lcom/google/android/recaptcha/internal/zzcx;->zzg:Lcom/google/android/recaptcha/internal/zzdc;

    iput-object p8, p0, Lcom/google/android/recaptcha/internal/zzcx;->zzh:Lcom/google/android/recaptcha/internal/zzbl;

    return-void
.end method

.method public static final synthetic zza(Lcom/google/android/recaptcha/internal/zzcx;)Lcom/google/android/recaptcha/internal/zzbv;
    .locals 0

    iget-object p0, p0, Lcom/google/android/recaptcha/internal/zzcx;->zze:Lcom/google/android/recaptcha/internal/zzbv;

    return-object p0
.end method

.method public static final synthetic zzb(Lcom/google/android/recaptcha/internal/zzcx;)Lcom/google/android/recaptcha/internal/zzpq;
    .locals 0

    iget-object p0, p0, Lcom/google/android/recaptcha/internal/zzcx;->zzf:Lcom/google/android/recaptcha/internal/zzpq;

    return-object p0
.end method

.method public static final synthetic zzc(Lcom/google/android/recaptcha/internal/zzcx;JLjava/lang/String;Lcom/google/android/recaptcha/internal/zzdc;Ljf/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    const/4 p3, 0x0

    .line 2
    const/4 p4, 0x0

    .line 3
    const-wide/16 p1, 0x0

    .line 4
    .line 5
    invoke-direct/range {p0 .. p5}, Lcom/google/android/recaptcha/internal/zzcx;->zzf(JLjava/lang/String;Lcom/google/android/recaptcha/internal/zzdc;Ljf/c;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static final synthetic zzd(Lcom/google/android/recaptcha/internal/zzcx;Lcom/google/android/recaptcha/RecaptchaAction;JLjf/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/recaptcha/internal/zzcx;->zzg(Lcom/google/android/recaptcha/RecaptchaAction;JLjf/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final zzf(JLjava/lang/String;Lcom/google/android/recaptcha/internal/zzdc;Ljf/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p5, Lcom/google/android/recaptcha/internal/zzcp;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, Lcom/google/android/recaptcha/internal/zzcp;

    .line 7
    .line 8
    iget v1, v0, Lcom/google/android/recaptcha/internal/zzcp;->zzc:I

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
    iput v1, v0, Lcom/google/android/recaptcha/internal/zzcp;->zzc:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/google/android/recaptcha/internal/zzcp;

    .line 21
    .line 22
    invoke-direct {v0, p0, p5}, Lcom/google/android/recaptcha/internal/zzcp;-><init>(Lcom/google/android/recaptcha/internal/zzcx;Ljf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p5, v0, Lcom/google/android/recaptcha/internal/zzcp;->zza:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, Lcom/google/android/recaptcha/internal/zzcp;->zzc:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p1, v0, Lcom/google/android/recaptcha/internal/zzcp;->zzd:Lcom/google/android/recaptcha/internal/zzdf;

    .line 37
    .line 38
    :try_start_0
    invoke-static {p5}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :catch_0
    move-exception p2

    .line 43
    goto :goto_2

    .line 44
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p1

    .line 52
    :cond_2
    invoke-static {p5}, LFe/e;->U(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    const/16 p5, 0x1b

    .line 56
    .line 57
    invoke-virtual {p4, p5}, Lcom/google/android/recaptcha/internal/zzdc;->zzf(I)Lcom/google/android/recaptcha/internal/zzdf;

    .line 58
    .line 59
    .line 60
    move-result-object p4

    .line 61
    :try_start_1
    iget-object p5, p0, Lcom/google/android/recaptcha/internal/zzcx;->zzc:Lcom/google/android/recaptcha/internal/zzl;

    .line 62
    .line 63
    iput-object p4, v0, Lcom/google/android/recaptcha/internal/zzcp;->zzd:Lcom/google/android/recaptcha/internal/zzdf;

    .line 64
    .line 65
    iput v3, v0, Lcom/google/android/recaptcha/internal/zzcp;->zzc:I

    .line 66
    .line 67
    invoke-virtual {p5, p3, p1, p2, v0}, Lcom/google/android/recaptcha/internal/zzl;->zzb(Ljava/lang/String;JLjf/c;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p5
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 71
    if-eq p5, v1, :cond_3

    .line 72
    .line 73
    move-object p1, p4

    .line 74
    :goto_1
    :try_start_2
    check-cast p5, Lcom/google/android/recaptcha/internal/zzpw;

    .line 75
    .line 76
    invoke-virtual {p1}, Lcom/google/android/recaptcha/internal/zzdf;->zza()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 77
    .line 78
    .line 79
    return-object p5

    .line 80
    :cond_3
    return-object v1

    .line 81
    :catch_1
    move-exception p1

    .line 82
    move-object p2, p1

    .line 83
    move-object p1, p4

    .line 84
    :goto_2
    instance-of p3, p2, Lcom/google/android/recaptcha/internal/zzbj;

    .line 85
    .line 86
    if-eqz p3, :cond_4

    .line 87
    .line 88
    check-cast p2, Lcom/google/android/recaptcha/internal/zzbj;

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_4
    new-instance p2, Lcom/google/android/recaptcha/internal/zzbj;

    .line 92
    .line 93
    sget-object p3, Lcom/google/android/recaptcha/internal/zzbh;->zzb:Lcom/google/android/recaptcha/internal/zzbh;

    .line 94
    .line 95
    sget-object p4, Lcom/google/android/recaptcha/internal/zzbg;->zzaa:Lcom/google/android/recaptcha/internal/zzbg;

    .line 96
    .line 97
    const/4 p5, 0x0

    .line 98
    invoke-direct {p2, p3, p4, p5}, Lcom/google/android/recaptcha/internal/zzbj;-><init>(Lcom/google/android/recaptcha/internal/zzbh;Lcom/google/android/recaptcha/internal/zzbg;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    :goto_3
    invoke-virtual {p1, p2}, Lcom/google/android/recaptcha/internal/zzdf;->zzb(Lcom/google/android/recaptcha/internal/zzbj;)V

    .line 102
    .line 103
    .line 104
    throw p2
.end method

.method private final zzg(Lcom/google/android/recaptcha/RecaptchaAction;JLjf/c;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-wide/from16 v2, p2

    .line 4
    .line 5
    move-object/from16 v0, p4

    .line 6
    .line 7
    instance-of v4, v0, Lcom/google/android/recaptcha/internal/zzcs;

    .line 8
    .line 9
    if-eqz v4, :cond_0

    .line 10
    .line 11
    move-object v4, v0

    .line 12
    check-cast v4, Lcom/google/android/recaptcha/internal/zzcs;

    .line 13
    .line 14
    iget v5, v4, Lcom/google/android/recaptcha/internal/zzcs;->zzf:I

    .line 15
    .line 16
    const/high16 v6, -0x80000000

    .line 17
    .line 18
    and-int v7, v5, v6

    .line 19
    .line 20
    if-eqz v7, :cond_0

    .line 21
    .line 22
    sub-int/2addr v5, v6

    .line 23
    iput v5, v4, Lcom/google/android/recaptcha/internal/zzcs;->zzf:I

    .line 24
    .line 25
    :goto_0
    move-object v6, v4

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    new-instance v4, Lcom/google/android/recaptcha/internal/zzcs;

    .line 28
    .line 29
    invoke-direct {v4, v1, v0}, Lcom/google/android/recaptcha/internal/zzcs;-><init>(Lcom/google/android/recaptcha/internal/zzcx;Ljf/c;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :goto_1
    iget-object v0, v6, Lcom/google/android/recaptcha/internal/zzcs;->zzd:Ljava/lang/Object;

    .line 34
    .line 35
    sget-object v7, Lkf/a;->a:Lkf/a;

    .line 36
    .line 37
    iget v4, v6, Lcom/google/android/recaptcha/internal/zzcs;->zzf:I

    .line 38
    .line 39
    const/4 v8, 0x2

    .line 40
    const/4 v5, 0x1

    .line 41
    const/4 v9, 0x0

    .line 42
    if-eqz v4, :cond_3

    .line 43
    .line 44
    if-eq v4, v5, :cond_2

    .line 45
    .line 46
    if-ne v4, v8, :cond_1

    .line 47
    .line 48
    iget-object v2, v6, Lcom/google/android/recaptcha/internal/zzcs;->zzb:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v2, Lcom/google/android/recaptcha/internal/zzdf;

    .line 51
    .line 52
    iget-object v3, v6, Lcom/google/android/recaptcha/internal/zzcs;->zza:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v3, Lcom/google/android/recaptcha/internal/zzdc;

    .line 55
    .line 56
    iget-object v4, v6, Lcom/google/android/recaptcha/internal/zzcs;->zzg:Lcom/google/android/recaptcha/internal/zzcx;

    .line 57
    .line 58
    :try_start_0
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    .line 60
    .line 61
    move-object v1, v4

    .line 62
    goto/16 :goto_4

    .line 63
    .line 64
    :catch_0
    move-exception v0

    .line 65
    move-object v1, v4

    .line 66
    goto/16 :goto_7

    .line 67
    .line 68
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 69
    .line 70
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 71
    .line 72
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw v0

    .line 76
    :cond_2
    iget-wide v2, v6, Lcom/google/android/recaptcha/internal/zzcs;->zzc:D

    .line 77
    .line 78
    iget-object v4, v6, Lcom/google/android/recaptcha/internal/zzcs;->zzh:Lcom/google/android/recaptcha/internal/zzdf;

    .line 79
    .line 80
    iget-object v5, v6, Lcom/google/android/recaptcha/internal/zzcs;->zzb:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v5, Lcom/google/android/recaptcha/internal/zzdc;

    .line 83
    .line 84
    iget-object v10, v6, Lcom/google/android/recaptcha/internal/zzcs;->zza:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v10, Lcom/google/android/recaptcha/RecaptchaAction;

    .line 87
    .line 88
    iget-object v11, v6, Lcom/google/android/recaptcha/internal/zzcs;->zzg:Lcom/google/android/recaptcha/internal/zzcx;

    .line 89
    .line 90
    :try_start_1
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 91
    .line 92
    .line 93
    move-object/from16 v18, v10

    .line 94
    .line 95
    move-object v1, v11

    .line 96
    goto/16 :goto_3

    .line 97
    .line 98
    :catch_1
    move-exception v0

    .line 99
    move-object v2, v4

    .line 100
    move-object v1, v11

    .line 101
    goto/16 :goto_7

    .line 102
    .line 103
    :cond_3
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    iget-object v0, v1, Lcom/google/android/recaptcha/internal/zzcx;->zzg:Lcom/google/android/recaptcha/internal/zzdc;

    .line 115
    .line 116
    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzdc;->zza()Lcom/google/android/recaptcha/internal/zzdc;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-virtual {v0, v4}, Lcom/google/android/recaptcha/internal/zzdc;->zzc(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzdc;

    .line 121
    .line 122
    .line 123
    const/16 v10, 0x9

    .line 124
    .line 125
    invoke-virtual {v0, v10}, Lcom/google/android/recaptcha/internal/zzdc;->zzf(I)Lcom/google/android/recaptcha/internal/zzdf;

    .line 126
    .line 127
    .line 128
    move-result-object v10

    .line 129
    long-to-double v11, v2

    .line 130
    const/4 v13, 0x7

    .line 131
    :try_start_2
    invoke-virtual {v0, v13}, Lcom/google/android/recaptcha/internal/zzdc;->zzf(I)Lcom/google/android/recaptcha/internal/zzdf;

    .line 132
    .line 133
    .line 134
    move-result-object v13

    .line 135
    sget-object v14, Lcom/google/android/recaptcha/internal/zzcx;->zza:LBf/i;

    .line 136
    .line 137
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/recaptcha/RecaptchaAction;->getAction()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v15

    .line 141
    invoke-virtual {v14, v15}, LBf/i;->b(Ljava/lang/String;)Z

    .line 142
    .line 143
    .line 144
    move-result v14

    .line 145
    if-nez v14, :cond_4

    .line 146
    .line 147
    new-instance v14, Lcom/google/android/recaptcha/internal/zzbj;

    .line 148
    .line 149
    sget-object v15, Lcom/google/android/recaptcha/internal/zzbh;->zzg:Lcom/google/android/recaptcha/internal/zzbh;

    .line 150
    .line 151
    sget-object v8, Lcom/google/android/recaptcha/internal/zzbg;->zzh:Lcom/google/android/recaptcha/internal/zzbg;

    .line 152
    .line 153
    invoke-direct {v14, v15, v8, v9}, Lcom/google/android/recaptcha/internal/zzbj;-><init>(Lcom/google/android/recaptcha/internal/zzbh;Lcom/google/android/recaptcha/internal/zzbg;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    goto :goto_2

    .line 157
    :catch_2
    move-exception v0

    .line 158
    goto/16 :goto_6

    .line 159
    .line 160
    :cond_4
    move-object v14, v9

    .line 161
    :goto_2
    const-wide/16 v15, 0x1388

    .line 162
    .line 163
    cmp-long v2, v2, v15

    .line 164
    .line 165
    if-gez v2, :cond_5

    .line 166
    .line 167
    new-instance v14, Lcom/google/android/recaptcha/internal/zzbj;

    .line 168
    .line 169
    sget-object v2, Lcom/google/android/recaptcha/internal/zzbh;->zzb:Lcom/google/android/recaptcha/internal/zzbh;

    .line 170
    .line 171
    sget-object v3, Lcom/google/android/recaptcha/internal/zzbg;->zzI:Lcom/google/android/recaptcha/internal/zzbg;

    .line 172
    .line 173
    invoke-direct {v14, v2, v3, v9}, Lcom/google/android/recaptcha/internal/zzbj;-><init>(Lcom/google/android/recaptcha/internal/zzbh;Lcom/google/android/recaptcha/internal/zzbg;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    :cond_5
    if-nez v14, :cond_7

    .line 177
    .line 178
    invoke-virtual {v13}, Lcom/google/android/recaptcha/internal/zzdf;->zza()V

    .line 179
    .line 180
    .line 181
    const-wide v2, 0x3fdccccccccccccdL    # 0.45

    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    mul-double/2addr v2, v11

    .line 187
    iput-object v1, v6, Lcom/google/android/recaptcha/internal/zzcs;->zzg:Lcom/google/android/recaptcha/internal/zzcx;

    .line 188
    .line 189
    move-object/from16 v8, p1

    .line 190
    .line 191
    iput-object v8, v6, Lcom/google/android/recaptcha/internal/zzcs;->zza:Ljava/lang/Object;

    .line 192
    .line 193
    iput-object v0, v6, Lcom/google/android/recaptcha/internal/zzcs;->zzb:Ljava/lang/Object;

    .line 194
    .line 195
    iput-object v10, v6, Lcom/google/android/recaptcha/internal/zzcs;->zzh:Lcom/google/android/recaptcha/internal/zzdf;

    .line 196
    .line 197
    const-wide v13, 0x3fe199999999999aL    # 0.55

    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    mul-double/2addr v11, v13

    .line 203
    iput-wide v11, v6, Lcom/google/android/recaptcha/internal/zzcs;->zzc:D

    .line 204
    .line 205
    iput v5, v6, Lcom/google/android/recaptcha/internal/zzcs;->zzf:I

    .line 206
    .line 207
    double-to-long v2, v2

    .line 208
    move-object v5, v0

    .line 209
    invoke-direct/range {v1 .. v6}, Lcom/google/android/recaptcha/internal/zzcx;->zzf(JLjava/lang/String;Lcom/google/android/recaptcha/internal/zzdc;Ljf/c;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 213
    if-eq v0, v7, :cond_6

    .line 214
    .line 215
    move-object/from16 v1, p0

    .line 216
    .line 217
    move-object/from16 v18, v8

    .line 218
    .line 219
    move-object v4, v10

    .line 220
    move-wide v2, v11

    .line 221
    :goto_3
    :try_start_3
    move-object/from16 v19, v0

    .line 222
    .line 223
    check-cast v19, Lcom/google/android/recaptcha/internal/zzpw;

    .line 224
    .line 225
    double-to-long v14, v2

    .line 226
    iput-object v1, v6, Lcom/google/android/recaptcha/internal/zzcs;->zzg:Lcom/google/android/recaptcha/internal/zzcx;

    .line 227
    .line 228
    iput-object v5, v6, Lcom/google/android/recaptcha/internal/zzcs;->zza:Ljava/lang/Object;

    .line 229
    .line 230
    iput-object v4, v6, Lcom/google/android/recaptcha/internal/zzcs;->zzb:Ljava/lang/Object;

    .line 231
    .line 232
    iput-object v9, v6, Lcom/google/android/recaptcha/internal/zzcs;->zzh:Lcom/google/android/recaptcha/internal/zzdf;

    .line 233
    .line 234
    const/4 v0, 0x2

    .line 235
    iput v0, v6, Lcom/google/android/recaptcha/internal/zzcs;->zzf:I

    .line 236
    .line 237
    iget-object v0, v1, Lcom/google/android/recaptcha/internal/zzcx;->zzi:Lcom/google/android/recaptcha/internal/zzbo;

    .line 238
    .line 239
    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzbo;->zza()LEf/E;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    invoke-interface {v0}, LEf/E;->getCoroutineContext()Ljf/h;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    new-instance v13, Lcom/google/android/recaptcha/internal/zzcv;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_5

    .line 248
    .line 249
    const/16 v20, 0x0

    .line 250
    .line 251
    move-object/from16 v17, v1

    .line 252
    .line 253
    move-object/from16 v16, v5

    .line 254
    .line 255
    :try_start_4
    invoke-direct/range {v13 .. v20}, Lcom/google/android/recaptcha/internal/zzcv;-><init>(JLcom/google/android/recaptcha/internal/zzdc;Lcom/google/android/recaptcha/internal/zzcx;Lcom/google/android/recaptcha/RecaptchaAction;Lcom/google/android/recaptcha/internal/zzpw;Ljf/c;)V

    .line 256
    .line 257
    .line 258
    invoke-static {v0, v13, v6}, LEf/H;->P(Ljf/h;Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    .line 262
    if-eq v0, v7, :cond_6

    .line 263
    .line 264
    move-object v2, v4

    .line 265
    move-object/from16 v3, v16

    .line 266
    .line 267
    move-object/from16 v1, v17

    .line 268
    .line 269
    :goto_4
    :try_start_5
    check-cast v0, Lcom/google/android/recaptcha/internal/zzqf;

    .line 270
    .line 271
    invoke-direct {v1, v0, v3}, Lcom/google/android/recaptcha/internal/zzcx;->zzh(Lcom/google/android/recaptcha/internal/zzqf;Lcom/google/android/recaptcha/internal/zzdc;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v2}, Lcom/google/android/recaptcha/internal/zzdf;->zza()V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzqf;->zzj()Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    .line 281
    return-object v0

    .line 282
    :catch_3
    move-exception v0

    .line 283
    goto :goto_7

    .line 284
    :catch_4
    move-exception v0

    .line 285
    goto :goto_5

    .line 286
    :catch_5
    move-exception v0

    .line 287
    move-object/from16 v17, v1

    .line 288
    .line 289
    :goto_5
    move-object v2, v4

    .line 290
    move-object/from16 v1, v17

    .line 291
    .line 292
    goto :goto_7

    .line 293
    :cond_6
    return-object v7

    .line 294
    :cond_7
    :try_start_6
    invoke-virtual {v13, v14}, Lcom/google/android/recaptcha/internal/zzdf;->zzb(Lcom/google/android/recaptcha/internal/zzbj;)V

    .line 295
    .line 296
    .line 297
    throw v14
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    .line 298
    :goto_6
    move-object/from16 v1, p0

    .line 299
    .line 300
    move-object v2, v10

    .line 301
    :goto_7
    instance-of v3, v0, Lcom/google/android/recaptcha/internal/zzbj;

    .line 302
    .line 303
    if-eqz v3, :cond_8

    .line 304
    .line 305
    check-cast v0, Lcom/google/android/recaptcha/internal/zzbj;

    .line 306
    .line 307
    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzbj;->zzb()Lcom/google/android/recaptcha/internal/zzbh;

    .line 308
    .line 309
    .line 310
    move-result-object v3

    .line 311
    sget-object v4, Lcom/google/android/recaptcha/internal/zzbh;->zzc:Lcom/google/android/recaptcha/internal/zzbh;

    .line 312
    .line 313
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    move-result v3

    .line 317
    if-eqz v3, :cond_9

    .line 318
    .line 319
    iget-object v3, v1, Lcom/google/android/recaptcha/internal/zzcx;->zzb:Landroid/app/Application;

    .line 320
    .line 321
    invoke-direct {v1, v3}, Lcom/google/android/recaptcha/internal/zzcx;->zzi(Landroid/app/Application;)Z

    .line 322
    .line 323
    .line 324
    move-result v1

    .line 325
    if-nez v1, :cond_9

    .line 326
    .line 327
    new-instance v0, Lcom/google/android/recaptcha/internal/zzbj;

    .line 328
    .line 329
    sget-object v1, Lcom/google/android/recaptcha/internal/zzbg;->zzap:Lcom/google/android/recaptcha/internal/zzbg;

    .line 330
    .line 331
    invoke-direct {v0, v4, v1, v9}, Lcom/google/android/recaptcha/internal/zzbj;-><init>(Lcom/google/android/recaptcha/internal/zzbh;Lcom/google/android/recaptcha/internal/zzbg;Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    goto :goto_8

    .line 335
    :cond_8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    new-instance v1, Lcom/google/android/recaptcha/internal/zzbj;

    .line 340
    .line 341
    sget-object v3, Lcom/google/android/recaptcha/internal/zzbh;->zzb:Lcom/google/android/recaptcha/internal/zzbh;

    .line 342
    .line 343
    sget-object v4, Lcom/google/android/recaptcha/internal/zzbg;->zzX:Lcom/google/android/recaptcha/internal/zzbg;

    .line 344
    .line 345
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    invoke-direct {v1, v3, v4, v0}, Lcom/google/android/recaptcha/internal/zzbj;-><init>(Lcom/google/android/recaptcha/internal/zzbh;Lcom/google/android/recaptcha/internal/zzbg;Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
    move-object v0, v1

    .line 353
    :cond_9
    :goto_8
    invoke-virtual {v2, v0}, Lcom/google/android/recaptcha/internal/zzdf;->zzb(Lcom/google/android/recaptcha/internal/zzbj;)V

    .line 354
    .line 355
    .line 356
    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzbj;->zzc()Lcom/google/android/recaptcha/RecaptchaException;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    return-object v0
.end method

.method private final zzh(Lcom/google/android/recaptcha/internal/zzqf;Lcom/google/android/recaptcha/internal/zzdc;)V
    .locals 4

    .line 1
    const/16 v0, 0x1d

    .line 2
    .line 3
    invoke-virtual {p2, v0}, Lcom/google/android/recaptcha/internal/zzdc;->zzf(I)Lcom/google/android/recaptcha/internal/zzdf;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    :try_start_0
    invoke-virtual {p1}, Lcom/google/android/recaptcha/internal/zzqf;->zzk()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/16 v1, 0xa

    .line 12
    .line 13
    invoke-static {v0, v1}, Lff/p;->a0(Ljava/lang/Iterable;I)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-static {v1}, Lff/B;->D(I)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/16 v2, 0x10

    .line 22
    .line 23
    if-ge v1, v2, :cond_0

    .line 24
    .line 25
    move v1, v2

    .line 26
    :cond_0
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 27
    .line 28
    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, Lcom/google/android/recaptcha/internal/zzqh;

    .line 46
    .line 47
    invoke-virtual {v1}, Lcom/google/android/recaptcha/internal/zzqh;->zzg()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-virtual {v1}, Lcom/google/android/recaptcha/internal/zzqh;->zzi()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :catch_0
    move-exception p1

    .line 60
    goto :goto_1

    .line 61
    :cond_1
    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzcx;->zzh:Lcom/google/android/recaptcha/internal/zzbl;

    .line 62
    .line 63
    invoke-virtual {v0, v2}, Lcom/google/android/recaptcha/internal/zzbl;->zzb(Ljava/util/Map;)V

    .line 64
    .line 65
    .line 66
    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzcx;->zzc:Lcom/google/android/recaptcha/internal/zzl;

    .line 67
    .line 68
    invoke-virtual {v0, p1}, Lcom/google/android/recaptcha/internal/zzl;->zzf(Lcom/google/android/recaptcha/internal/zzqf;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 69
    .line 70
    .line 71
    invoke-virtual {p2}, Lcom/google/android/recaptcha/internal/zzdf;->zza()V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :goto_1
    instance-of v0, p1, Lcom/google/android/recaptcha/internal/zzbj;

    .line 76
    .line 77
    if-eqz v0, :cond_2

    .line 78
    .line 79
    check-cast p1, Lcom/google/android/recaptcha/internal/zzbj;

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_2
    new-instance p1, Lcom/google/android/recaptcha/internal/zzbj;

    .line 83
    .line 84
    sget-object v0, Lcom/google/android/recaptcha/internal/zzbh;->zzb:Lcom/google/android/recaptcha/internal/zzbh;

    .line 85
    .line 86
    sget-object v1, Lcom/google/android/recaptcha/internal/zzbg;->zzaa:Lcom/google/android/recaptcha/internal/zzbg;

    .line 87
    .line 88
    const/4 v2, 0x0

    .line 89
    invoke-direct {p1, v0, v1, v2}, Lcom/google/android/recaptcha/internal/zzbj;-><init>(Lcom/google/android/recaptcha/internal/zzbh;Lcom/google/android/recaptcha/internal/zzbg;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    :goto_2
    invoke-virtual {p2, p1}, Lcom/google/android/recaptcha/internal/zzdf;->zzb(Lcom/google/android/recaptcha/internal/zzbj;)V

    .line 93
    .line 94
    .line 95
    throw p1
.end method

.method private final zzi(Landroid/app/Application;)Z
    .locals 1

    .line 1
    sget v0, Lcom/google/android/recaptcha/internal/zzbb;->zza:I

    .line 2
    .line 3
    sget-object v0, Lcom/google/android/recaptcha/internal/zzcw;->zza:Lcom/google/android/recaptcha/internal/zzcw;

    .line 4
    .line 5
    invoke-static {v0}, LFe/c;->z(Ltf/a;)Lef/p;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lef/p;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lcom/google/android/recaptcha/internal/zzbk;

    .line 14
    .line 15
    invoke-static {p1}, Lcom/google/android/recaptcha/internal/zzbk;->zzb(Landroid/content/Context;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1
.end method


# virtual methods
.method public final execute-0E7RQCE(Lcom/google/android/recaptcha/RecaptchaAction;JLjf/c;)Ljava/lang/Object;
    .locals 4
    .param p1    # Lcom/google/android/recaptcha/RecaptchaAction;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljf/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/recaptcha/RecaptchaAction;",
            "J",
            "Ljf/c<",
            "-",
            "Lef/n;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    instance-of v0, p4, Lcom/google/android/recaptcha/internal/zzcq;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lcom/google/android/recaptcha/internal/zzcq;

    .line 7
    .line 8
    iget v1, v0, Lcom/google/android/recaptcha/internal/zzcq;->zzc:I

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
    iput v1, v0, Lcom/google/android/recaptcha/internal/zzcq;->zzc:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/google/android/recaptcha/internal/zzcq;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Lcom/google/android/recaptcha/internal/zzcq;-><init>(Lcom/google/android/recaptcha/internal/zzcx;Ljf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lcom/google/android/recaptcha/internal/zzcq;->zza:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, Lcom/google/android/recaptcha/internal/zzcq;->zzc:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p4}, LFe/e;->U(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    check-cast p4, Lef/n;

    .line 40
    .line 41
    iget-object p1, p4, Lef/n;->a:Ljava/lang/Object;

    .line 42
    .line 43
    return-object p1

    .line 44
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p1

    .line 52
    :cond_2
    invoke-static {p4}, LFe/e;->U(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iput v3, v0, Lcom/google/android/recaptcha/internal/zzcq;->zzc:I

    .line 56
    .line 57
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/google/android/recaptcha/internal/zzcx;->zzg(Lcom/google/android/recaptcha/RecaptchaAction;JLjf/c;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    if-ne p1, v1, :cond_3

    .line 62
    .line 63
    return-object v1

    .line 64
    :cond_3
    return-object p1
.end method

.method public final execute-gIAlu-s(Lcom/google/android/recaptcha/RecaptchaAction;Ljf/c;)Ljava/lang/Object;
    .locals 4
    .param p1    # Lcom/google/android/recaptcha/RecaptchaAction;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljf/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/recaptcha/RecaptchaAction;",
            "Ljf/c<",
            "-",
            "Lef/n;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    instance-of v0, p2, Lcom/google/android/recaptcha/internal/zzcr;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/google/android/recaptcha/internal/zzcr;

    .line 7
    .line 8
    iget v1, v0, Lcom/google/android/recaptcha/internal/zzcr;->zzc:I

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
    iput v1, v0, Lcom/google/android/recaptcha/internal/zzcr;->zzc:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/google/android/recaptcha/internal/zzcr;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcom/google/android/recaptcha/internal/zzcr;-><init>(Lcom/google/android/recaptcha/internal/zzcx;Ljf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/google/android/recaptcha/internal/zzcr;->zza:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, Lcom/google/android/recaptcha/internal/zzcr;->zzc:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    check-cast p2, Lef/n;

    .line 40
    .line 41
    iget-object p1, p2, Lef/n;->a:Ljava/lang/Object;

    .line 42
    .line 43
    return-object p1

    .line 44
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p1

    .line 52
    :cond_2
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iput v3, v0, Lcom/google/android/recaptcha/internal/zzcr;->zzc:I

    .line 56
    .line 57
    const-wide/16 v2, 0x2710

    .line 58
    .line 59
    invoke-virtual {p0, p1, v2, v3, v0}, Lcom/google/android/recaptcha/internal/zzcx;->execute-0E7RQCE(Lcom/google/android/recaptcha/RecaptchaAction;JLjf/c;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    if-ne p1, v1, :cond_3

    .line 64
    .line 65
    return-object v1

    .line 66
    :cond_3
    return-object p1
.end method

.method public final executeTask(Lcom/google/android/recaptcha/RecaptchaAction;)Lcom/google/android/gms/tasks/Task;
    .locals 7
    .param p1    # Lcom/google/android/recaptcha/RecaptchaAction;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/recaptcha/RecaptchaAction;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzcx;->zzi:Lcom/google/android/recaptcha/internal/zzbo;

    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzbo;->zzb()LEf/E;

    move-result-object v0

    new-instance v1, Lcom/google/android/recaptcha/internal/zzct;

    const-wide/16 v4, 0x2710

    const/4 v6, 0x0

    move-object v2, p0

    move-object v3, p1

    invoke-direct/range {v1 .. v6}, Lcom/google/android/recaptcha/internal/zzct;-><init>(Lcom/google/android/recaptcha/internal/zzcx;Lcom/google/android/recaptcha/RecaptchaAction;JLjf/c;)V

    const/4 p1, 0x3

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, p1}, LEf/H;->h(LEf/E;Ljf/h;Ltf/p;I)LEf/L;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/recaptcha/internal/zzax;->zza(LEf/K;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final executeTask(Lcom/google/android/recaptcha/RecaptchaAction;J)Lcom/google/android/gms/tasks/Task;
    .locals 7
    .param p1    # Lcom/google/android/recaptcha/RecaptchaAction;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/recaptcha/RecaptchaAction;",
            "J)",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzcx;->zzi:Lcom/google/android/recaptcha/internal/zzbo;

    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzbo;->zzb()LEf/E;

    move-result-object v0

    new-instance v1, Lcom/google/android/recaptcha/internal/zzct;

    const/4 v6, 0x0

    move-object v2, p0

    move-object v3, p1

    move-wide v4, p2

    invoke-direct/range {v1 .. v6}, Lcom/google/android/recaptcha/internal/zzct;-><init>(Lcom/google/android/recaptcha/internal/zzcx;Lcom/google/android/recaptcha/RecaptchaAction;JLjf/c;)V

    const/4 p1, 0x3

    const/4 p2, 0x0

    invoke-static {v0, p2, v1, p1}, LEf/H;->h(LEf/E;Ljf/h;Ltf/p;I)LEf/L;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/recaptcha/internal/zzax;->zza(LEf/K;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final zze()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzcx;->zzd:Ljava/lang/String;

    return-object v0
.end method
