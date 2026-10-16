.class final Lcom/google/android/recaptcha/internal/zzdz;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field zza:Ljava/lang/Object;

.field zzb:Ljava/lang/Object;

.field zzc:I

.field final synthetic zzd:Lcom/google/android/recaptcha/internal/zzek;

.field final synthetic zze:Lcom/google/android/recaptcha/internal/zzea;

.field final synthetic zzf:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/android/recaptcha/internal/zzek;Lcom/google/android/recaptcha/internal/zzea;Ljava/lang/String;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzdz;->zzd:Lcom/google/android/recaptcha/internal/zzek;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/google/android/recaptcha/internal/zzdz;->zze:Lcom/google/android/recaptcha/internal/zzea;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/google/android/recaptcha/internal/zzdz;->zzf:Ljava/lang/String;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Llf/j;-><init>(ILjf/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljf/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-instance p1, Lcom/google/android/recaptcha/internal/zzdz;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzdz;->zzd:Lcom/google/android/recaptcha/internal/zzek;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzdz;->zze:Lcom/google/android/recaptcha/internal/zzea;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/google/android/recaptcha/internal/zzdz;->zzf:Ljava/lang/String;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/google/android/recaptcha/internal/zzdz;-><init>(Lcom/google/android/recaptcha/internal/zzek;Lcom/google/android/recaptcha/internal/zzea;Ljava/lang/String;Ljf/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LEf/E;

    .line 2
    .line 3
    check-cast p2, Ljf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/google/android/recaptcha/internal/zzdz;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    sget-object p2, Lef/C;->a:Lef/C;

    .line 10
    .line 11
    check-cast p1, Lcom/google/android/recaptcha/internal/zzdz;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lcom/google/android/recaptcha/internal/zzdz;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    iget v1, p0, Lcom/google/android/recaptcha/internal/zzdz;->zzc:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    if-eq v1, v2, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    goto/16 :goto_2

    .line 14
    .line 15
    :cond_0
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzdz;->zzb:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v2, p0, Lcom/google/android/recaptcha/internal/zzdz;->zza:Ljava/lang/Object;

    .line 18
    .line 19
    :try_start_0
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catch_0
    move-exception p1

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzdz;->zzd:Lcom/google/android/recaptcha/internal/zzek;

    .line 29
    .line 30
    new-instance v1, Lcom/google/android/recaptcha/internal/zzbt;

    .line 31
    .line 32
    invoke-direct {v1}, Lcom/google/android/recaptcha/internal/zzbt;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object v1, p1, Lcom/google/android/recaptcha/internal/zzek;->zza:Lcom/google/android/recaptcha/internal/zzbt;

    .line 36
    .line 37
    :try_start_1
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzdz;->zzf:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {}, Lcom/google/android/recaptcha/internal/zzhz;->zzh()Lcom/google/android/recaptcha/internal/zzhz;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v1, p1}, Lcom/google/android/recaptcha/internal/zzhz;->zzj(Ljava/lang/CharSequence;)[B

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-static {p1}, Lcom/google/android/recaptcha/internal/zzro;->zzi([B)Lcom/google/android/recaptcha/internal/zzro;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p1}, Lcom/google/android/recaptcha/internal/zzro;->zzf()Lcom/google/android/recaptcha/internal/zzqq;

    .line 52
    .line 53
    .line 54
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzdz;->zze:Lcom/google/android/recaptcha/internal/zzea;

    .line 55
    .line 56
    invoke-static {v1}, Lcom/google/android/recaptcha/internal/zzea;->zzb(Lcom/google/android/recaptcha/internal/zzea;)Lcom/google/android/recaptcha/internal/zzge;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-interface {v1, p1}, Lcom/google/android/recaptcha/internal/zzge;->zza(Lcom/google/android/recaptcha/internal/zzro;)Lcom/google/android/recaptcha/internal/zzrg;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-static {}, Lcom/google/android/recaptcha/internal/zzgz;->zzb()Lcom/google/android/recaptcha/internal/zzgz;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    iget-object v4, p0, Lcom/google/android/recaptcha/internal/zzdz;->zze:Lcom/google/android/recaptcha/internal/zzea;

    .line 69
    .line 70
    invoke-virtual {v1}, Lcom/google/android/recaptcha/internal/zzrg;->zzi()Ljava/util/List;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    iget-object v5, p0, Lcom/google/android/recaptcha/internal/zzdz;->zzd:Lcom/google/android/recaptcha/internal/zzek;

    .line 75
    .line 76
    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzdz;->zza:Ljava/lang/Object;

    .line 77
    .line 78
    iput-object v3, p0, Lcom/google/android/recaptcha/internal/zzdz;->zzb:Ljava/lang/Object;

    .line 79
    .line 80
    iput v2, p0, Lcom/google/android/recaptcha/internal/zzdz;->zzc:I

    .line 81
    .line 82
    invoke-static {v4, v1, v5, p0}, Lcom/google/android/recaptcha/internal/zzea;->zzc(Lcom/google/android/recaptcha/internal/zzea;Ljava/util/List;Lcom/google/android/recaptcha/internal/zzek;Ljf/c;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    if-eq v1, v0, :cond_2

    .line 87
    .line 88
    move-object v2, p1

    .line 89
    move-object v1, v3

    .line 90
    :goto_0
    move-object p1, v1

    .line 91
    check-cast p1, Lcom/google/android/recaptcha/internal/zzgz;

    .line 92
    .line 93
    invoke-virtual {p1}, Lcom/google/android/recaptcha/internal/zzgz;->zzf()Lcom/google/android/recaptcha/internal/zzgz;

    .line 94
    .line 95
    .line 96
    sget-object p1, Ljava/util/concurrent/TimeUnit;->MICROSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 97
    .line 98
    check-cast v1, Lcom/google/android/recaptcha/internal/zzgz;

    .line 99
    .line 100
    invoke-virtual {v1, p1}, Lcom/google/android/recaptcha/internal/zzgz;->zza(Ljava/util/concurrent/TimeUnit;)J

    .line 101
    .line 102
    .line 103
    move-result-wide v3

    .line 104
    new-instance p1, Ljava/lang/Long;

    .line 105
    .line 106
    invoke-direct {p1, v3, v4}, Ljava/lang/Long;-><init>(J)V

    .line 107
    .line 108
    .line 109
    check-cast v2, Lcom/google/android/recaptcha/internal/zzro;

    .line 110
    .line 111
    invoke-virtual {v2}, Lcom/google/android/recaptcha/internal/zzro;->zzf()Lcom/google/android/recaptcha/internal/zzqq;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 112
    .line 113
    .line 114
    goto :goto_2

    .line 115
    :goto_1
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzdz;->zze:Lcom/google/android/recaptcha/internal/zzea;

    .line 116
    .line 117
    iget-object v2, p0, Lcom/google/android/recaptcha/internal/zzdz;->zzd:Lcom/google/android/recaptcha/internal/zzek;

    .line 118
    .line 119
    const/4 v3, 0x0

    .line 120
    iput-object v3, p0, Lcom/google/android/recaptcha/internal/zzdz;->zza:Ljava/lang/Object;

    .line 121
    .line 122
    iput-object v3, p0, Lcom/google/android/recaptcha/internal/zzdz;->zzb:Ljava/lang/Object;

    .line 123
    .line 124
    const/4 v3, 0x2

    .line 125
    iput v3, p0, Lcom/google/android/recaptcha/internal/zzdz;->zzc:I

    .line 126
    .line 127
    invoke-static {v1, p1, v2, p0}, Lcom/google/android/recaptcha/internal/zzea;->zzd(Lcom/google/android/recaptcha/internal/zzea;Ljava/lang/Exception;Lcom/google/android/recaptcha/internal/zzek;Ljf/c;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    if-ne p1, v0, :cond_3

    .line 132
    .line 133
    :cond_2
    return-object v0

    .line 134
    :cond_3
    :goto_2
    sget-object p1, Lef/C;->a:Lef/C;

    .line 135
    .line 136
    return-object p1
.end method
