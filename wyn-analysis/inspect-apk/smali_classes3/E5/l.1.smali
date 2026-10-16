.class public final LE5/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu6/j;
.implements LEa/e;
.implements LU1/D;


# instance fields
.field public final synthetic a:I

.field public b:Z

.field public c:Z

.field public final d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LE5/O;Lu6/q;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LE5/l;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LE5/l;->e:Ljava/lang/Object;

    .line 4
    new-instance p1, LA7/a0;

    invoke-direct {p1, p2}, LA7/a0;-><init>(Lu6/q;)V

    iput-object p1, p0, LE5/l;->d:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, LE5/l;->b:Z

    return-void
.end method

.method public constructor <init>(LU1/z;LQ1/q;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LE5/l;->a:I

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, LE5/l;->e:Ljava/lang/Object;

    .line 8
    new-instance p1, LA7/a0;

    invoke-direct {p1, p2}, LA7/a0;-><init>(LQ1/q;)V

    iput-object p1, p0, LE5/l;->d:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 9
    iput-boolean p1, p0, LE5/l;->b:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, LE5/l;->a:I

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, LE5/l;->b:Z

    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, LE5/l;->c:Z

    .line 13
    iput-object p1, p0, LE5/l;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LCa/h;Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LE5/l;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LE5/l;->d:Ljava/lang/Object;

    iput-object p2, p0, LE5/l;->e:Ljava/lang/Object;

    iput-object p3, p0, LE5/l;->f:Ljava/lang/Object;

    return-void
.end method

.method public static b(LCa/h;Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzvh;
    .locals 10

    .line 1
    instance-of v0, p0, LEa/c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move-object v0, p0

    .line 7
    check-cast v0, LEa/c;

    .line 8
    .line 9
    invoke-interface {v0}, LEa/c;->zza()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    :cond_0
    move v9, v1

    .line 17
    new-instance v2, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzvh;

    .line 18
    .line 19
    invoke-interface {p0}, LCa/h;->b()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    const-string v8, "en"

    .line 24
    .line 25
    const/4 v6, 0x1

    .line 26
    const-string v4, "optional-module-text-latin"

    .line 27
    .line 28
    const/4 v7, 0x1

    .line 29
    move-object v5, p1

    .line 30
    invoke-direct/range {v2 .. v9}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzvh;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    return-object v2
.end method


# virtual methods
.method public a(LE5/r0;)V
    .locals 1

    .line 1
    iget-object v0, p0, LE5/l;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lu6/j;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0, p1}, Lu6/j;->a(LE5/r0;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, LE5/l;->g:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, Lu6/j;

    .line 13
    .line 14
    invoke-interface {p1}, Lu6/j;->e()LE5/r0;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    :cond_0
    iget-object v0, p0, LE5/l;->d:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, LA7/a0;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, LA7/a0;->a(LE5/r0;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public c(LAa/a;)LCa/f;
    .locals 9

    .line 1
    iget-object v0, p0, LE5/l;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuv;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, LE5/l;->zzb()V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, LE5/l;->g:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuv;

    .line 13
    .line 14
    invoke-static {v0}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-boolean v1, p0, LE5/l;->b:Z

    .line 18
    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    :try_start_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuv;->zze()V

    .line 22
    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    iput-boolean v1, p0, LE5/l;->b:Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catch_0
    move-exception v0

    .line 29
    move-object p1, v0

    .line 30
    iget-object v0, p0, LE5/l;->e:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, LCa/h;

    .line 33
    .line 34
    invoke-interface {v0}, LCa/h;->a()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    new-instance v1, Lua/a;

    .line 39
    .line 40
    const-string v2, "Failed to init text recognizer "

    .line 41
    .line 42
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-direct {v1, v0, p1}, Lua/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 47
    .line 48
    .line 49
    throw v1

    .line 50
    :cond_1
    :goto_0
    new-instance v2, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuq;

    .line 51
    .line 52
    iget v3, p1, LAa/a;->f:I

    .line 53
    .line 54
    iget v4, p1, LAa/a;->c:I

    .line 55
    .line 56
    iget v5, p1, LAa/a;->d:I

    .line 57
    .line 58
    iget v1, p1, LAa/a;->e:I

    .line 59
    .line 60
    invoke-static {v1}, Lp7/b;->k(I)I

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 65
    .line 66
    .line 67
    move-result-wide v7

    .line 68
    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuq;-><init>(IIIIJ)V

    .line 69
    .line 70
    .line 71
    sget-object v1, LBa/a;->b:LBa/a;

    .line 72
    .line 73
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    iget v1, p1, LAa/a;->f:I

    .line 77
    .line 78
    const/4 v3, -0x1

    .line 79
    if-eq v1, v3, :cond_5

    .line 80
    .line 81
    const/16 v3, 0x11

    .line 82
    .line 83
    if-eq v1, v3, :cond_4

    .line 84
    .line 85
    const/16 v3, 0x23

    .line 86
    .line 87
    if-eq v1, v3, :cond_3

    .line 88
    .line 89
    const v3, 0x32315659

    .line 90
    .line 91
    .line 92
    if-ne v1, v3, :cond_2

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_2
    new-instance v0, Lua/a;

    .line 96
    .line 97
    iget p1, p1, LAa/a;->f:I

    .line 98
    .line 99
    const-string v1, "Unsupported image format: "

    .line 100
    .line 101
    invoke-static {p1, v1}, Lka/n;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    const/4 v1, 0x3

    .line 106
    invoke-direct {v0, p1, v1}, Lua/a;-><init>(Ljava/lang/String;I)V

    .line 107
    .line 108
    .line 109
    throw v0

    .line 110
    :cond_3
    new-instance p1, Lq7/b;

    .line 111
    .line 112
    const/4 v1, 0x0

    .line 113
    invoke-direct {p1, v1}, Lq7/b;-><init>(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_4
    :goto_1
    iget-object p1, p1, LAa/a;->b:Ljava/nio/ByteBuffer;

    .line 118
    .line 119
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    new-instance v1, Lq7/b;

    .line 123
    .line 124
    invoke-direct {v1, p1}, Lq7/b;-><init>(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    :goto_2
    move-object p1, v1

    .line 128
    goto :goto_3

    .line 129
    :cond_5
    iget-object p1, p1, LAa/a;->a:Landroid/graphics/Bitmap;

    .line 130
    .line 131
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    new-instance v1, Lq7/b;

    .line 135
    .line 136
    invoke-direct {v1, p1}, Lq7/b;-><init>(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    goto :goto_2

    .line 140
    :goto_3
    :try_start_1
    invoke-virtual {v0, p1, v2}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuv;->zzd(Lq7/a;Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuq;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzvf;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    new-instance v0, LCa/f;

    .line 145
    .line 146
    invoke-direct {v0, p1}, LCa/f;-><init>(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzvf;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    .line 147
    .line 148
    .line 149
    return-object v0

    .line 150
    :catch_1
    move-exception v0

    .line 151
    move-object p1, v0

    .line 152
    iget-object v0, p0, LE5/l;->e:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v0, LCa/h;

    .line 155
    .line 156
    invoke-interface {v0}, LCa/h;->a()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    new-instance v1, Lua/a;

    .line 161
    .line 162
    const-string v2, "Failed to run text recognizer "

    .line 163
    .line 164
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-direct {v1, v0, p1}, Lua/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 169
    .line 170
    .line 171
    throw v1
.end method

.method public e()LE5/r0;
    .locals 1

    .line 1
    iget-object v0, p0, LE5/l;->g:Ljava/lang/Object;

    check-cast v0, Lu6/j;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lu6/j;->e()LE5/r0;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    iget-object v0, p0, LE5/l;->d:Ljava/lang/Object;

    check-cast v0, LA7/a0;

    iget-object v0, v0, LA7/a0;->f:Ljava/lang/Object;

    check-cast v0, LE5/r0;

    return-object v0
.end method

.method public e()LN1/F;
    .locals 1

    .line 4
    iget-object v0, p0, LE5/l;->g:Ljava/lang/Object;

    check-cast v0, LU1/D;

    if-eqz v0, :cond_0

    .line 5
    invoke-interface {v0}, LU1/D;->e()LN1/F;

    move-result-object v0

    return-object v0

    .line 6
    :cond_0
    iget-object v0, p0, LE5/l;->d:Ljava/lang/Object;

    check-cast v0, LA7/a0;

    iget-object v0, v0, LA7/a0;->f:Ljava/lang/Object;

    check-cast v0, LN1/F;

    return-object v0
.end method

.method public g()J
    .locals 2

    .line 1
    iget v0, p0, LE5/l;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, LE5/l;->b:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, LE5/l;->d:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, LA7/a0;

    .line 13
    .line 14
    invoke-virtual {v0}, LA7/a0;->g()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v0, p0, LE5/l;->g:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, LU1/D;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-interface {v0}, LU1/D;->g()J

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    :goto_0
    return-wide v0

    .line 31
    :pswitch_0
    iget-boolean v0, p0, LE5/l;->b:Z

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    iget-object v0, p0, LE5/l;->d:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, LA7/a0;

    .line 38
    .line 39
    invoke-virtual {v0}, LA7/a0;->g()J

    .line 40
    .line 41
    .line 42
    move-result-wide v0

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    iget-object v0, p0, LE5/l;->g:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Lu6/j;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-interface {v0}, Lu6/j;->g()J

    .line 52
    .line 53
    .line 54
    move-result-wide v0

    .line 55
    :goto_1
    return-wide v0

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public n()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LE5/l;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LE5/l;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, LA7/a0;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    return v0

    .line 14
    :cond_0
    iget-object v0, p0, LE5/l;->g:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, LU1/D;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-interface {v0}, LU1/D;->n()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    return v0
.end method

.method public q(LN1/F;)V
    .locals 1

    .line 1
    iget-object v0, p0, LE5/l;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LU1/D;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0, p1}, LU1/D;->q(LN1/F;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, LE5/l;->g:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, LU1/D;

    .line 13
    .line 14
    invoke-interface {p1}, LU1/D;->e()LN1/F;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    :cond_0
    iget-object v0, p0, LE5/l;->d:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, LA7/a0;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, LA7/a0;->q(LN1/F;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public zzb()V
    .locals 8

    .line 1
    iget-object v0, p0, LE5/l;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;

    .line 4
    .line 5
    iget-object v1, p0, LE5/l;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroid/content/Context;

    .line 8
    .line 9
    iget-object v2, p0, LE5/l;->e:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, LCa/h;

    .line 12
    .line 13
    iget-object v3, p0, LE5/l;->g:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuv;

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    :try_start_0
    instance-of v3, v2, LEa/b;

    .line 21
    .line 22
    const/4 v4, 0x0

    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    move-object v5, v2

    .line 26
    check-cast v5, LEa/b;

    .line 27
    .line 28
    invoke-interface {v5}, LEa/b;->zza()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    goto :goto_0

    .line 33
    :catch_0
    move-exception v1

    .line 34
    goto/16 :goto_2

    .line 35
    .line 36
    :catch_1
    move-exception v3

    .line 37
    goto/16 :goto_3

    .line 38
    .line 39
    :cond_1
    move-object v5, v4

    .line 40
    :goto_0
    invoke-interface {v2}, LCa/h;->c()Z

    .line 41
    .line 42
    .line 43
    move-result v6
    :try_end_0
    .catch Lr7/a; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    const-string v7, "DecoupledTextDelegate"

    .line 45
    .line 46
    if-eqz v6, :cond_2

    .line 47
    .line 48
    :try_start_1
    const-string v3, "Start loading thick OCR module."

    .line 49
    .line 50
    invoke-static {v7, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 51
    .line 52
    .line 53
    sget-object v3, Lr7/d;->c:Lad/r;

    .line 54
    .line 55
    invoke-interface {v2}, LCa/h;->e()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-static {v1, v3, v4}, Lr7/d;->c(Landroid/content/Context;Lr7/c;Ljava/lang/String;)Lr7/d;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    const-string v4, "com.google.mlkit.vision.text.bundled.common.BundledTextRecognizerCreator"

    .line 64
    .line 65
    invoke-virtual {v3, v4}, Lr7/d;->b(Ljava/lang/String;)Landroid/os/IBinder;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-static {v3}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzux;->zza(Landroid/os/IBinder;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuy;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    new-instance v4, Lq7/b;

    .line 74
    .line 75
    invoke-direct {v4, v1}, Lq7/b;-><init>(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    invoke-static {v2, v5}, LE5/l;->b(LCa/h;Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzvh;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    invoke-interface {v3, v4, v5}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuy;->zze(Lq7/a;Lcom/google/android/gms/internal/mlkit_vision_text_common/zzvh;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuv;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    goto :goto_1

    .line 87
    :cond_2
    if-eqz v3, :cond_3

    .line 88
    .line 89
    const-string v3, "Start loading custom OCR module."

    .line 90
    .line 91
    invoke-static {v7, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 92
    .line 93
    .line 94
    sget-object v3, Lr7/d;->b:Lab/b;

    .line 95
    .line 96
    invoke-interface {v2}, LCa/h;->e()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    invoke-static {v1, v3, v6}, Lr7/d;->c(Landroid/content/Context;Lr7/c;Ljava/lang/String;)Lr7/d;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    const-string v6, "com.google.android.gms.vision.text.mlkit.CommonTextRecognizerCreator"

    .line 105
    .line 106
    invoke-virtual {v3, v6}, Lr7/d;->b(Ljava/lang/String;)Landroid/os/IBinder;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    invoke-static {v3}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzut;->zza(Landroid/os/IBinder;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuu;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    new-instance v6, Lq7/b;

    .line 115
    .line 116
    invoke-direct {v6, v1}, Lq7/b;-><init>(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    invoke-static {v2, v5}, LE5/l;->b(LCa/h;Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzvh;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    invoke-interface {v3, v6, v4, v5}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuu;->zzd(Lq7/a;Lq7/a;Lcom/google/android/gms/internal/mlkit_vision_text_common/zzvh;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuv;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    goto :goto_1

    .line 128
    :cond_3
    const-string v3, "Start loading thin OCR module."

    .line 129
    .line 130
    invoke-static {v7, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 131
    .line 132
    .line 133
    sget-object v3, Lr7/d;->b:Lab/b;

    .line 134
    .line 135
    invoke-interface {v2}, LCa/h;->e()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    invoke-static {v1, v3, v4}, Lr7/d;->c(Landroid/content/Context;Lr7/c;Ljava/lang/String;)Lr7/d;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    const-string v4, "com.google.android.gms.vision.text.mlkit.TextRecognizerCreator"

    .line 144
    .line 145
    invoke-virtual {v3, v4}, Lr7/d;->b(Ljava/lang/String;)Landroid/os/IBinder;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    invoke-static {v3}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzux;->zza(Landroid/os/IBinder;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuy;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    new-instance v4, Lq7/b;

    .line 154
    .line 155
    invoke-direct {v4, v1}, Lq7/b;-><init>(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    invoke-interface {v3, v4}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuy;->zzd(Lq7/a;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuv;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    :goto_1
    iput-object v3, p0, LE5/l;->g:Ljava/lang/Object;

    .line 163
    .line 164
    invoke-interface {v2}, LCa/h;->c()Z

    .line 165
    .line 166
    .line 167
    move-result v3

    .line 168
    sget-object v4, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzou;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzou;

    .line 169
    .line 170
    new-instance v5, LE4/F;

    .line 171
    .line 172
    invoke-direct {v5, v3, v4}, LE4/F;-><init>(ZLcom/google/android/gms/internal/mlkit_vision_text_common/zzou;)V

    .line 173
    .line 174
    .line 175
    sget-object v3, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzov;->zzi:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzov;

    .line 176
    .line 177
    invoke-virtual {v0, v5, v3}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;->zzf(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzub;Lcom/google/android/gms/internal/mlkit_vision_text_common/zzov;)V
    :try_end_1
    .catch Lr7/a; {:try_start_1 .. :try_end_1} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    .line 178
    .line 179
    .line 180
    return-void

    .line 181
    :goto_2
    invoke-interface {v2}, LCa/h;->c()Z

    .line 182
    .line 183
    .line 184
    move-result v3

    .line 185
    sget-object v4, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzou;->zzC:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzou;

    .line 186
    .line 187
    new-instance v5, LE4/F;

    .line 188
    .line 189
    invoke-direct {v5, v3, v4}, LE4/F;-><init>(ZLcom/google/android/gms/internal/mlkit_vision_text_common/zzou;)V

    .line 190
    .line 191
    .line 192
    sget-object v3, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzov;->zzi:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzov;

    .line 193
    .line 194
    invoke-virtual {v0, v5, v3}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;->zzf(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzub;Lcom/google/android/gms/internal/mlkit_vision_text_common/zzov;)V

    .line 195
    .line 196
    .line 197
    invoke-interface {v2}, LCa/h;->a()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    new-instance v2, Lua/a;

    .line 202
    .line 203
    const-string v3, "Failed to create text recognizer "

    .line 204
    .line 205
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-direct {v2, v0, v1}, Lua/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 210
    .line 211
    .line 212
    throw v2

    .line 213
    :goto_3
    invoke-interface {v2}, LCa/h;->c()Z

    .line 214
    .line 215
    .line 216
    move-result v4

    .line 217
    sget-object v5, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzou;->zzB:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzou;

    .line 218
    .line 219
    new-instance v6, LE4/F;

    .line 220
    .line 221
    invoke-direct {v6, v4, v5}, LE4/F;-><init>(ZLcom/google/android/gms/internal/mlkit_vision_text_common/zzou;)V

    .line 222
    .line 223
    .line 224
    sget-object v4, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzov;->zzi:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzov;

    .line 225
    .line 226
    invoke-virtual {v0, v6, v4}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;->zzf(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzub;Lcom/google/android/gms/internal/mlkit_vision_text_common/zzov;)V

    .line 227
    .line 228
    .line 229
    invoke-interface {v2}, LCa/h;->c()Z

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    if-nez v0, :cond_5

    .line 234
    .line 235
    iget-boolean v0, p0, LE5/l;->c:Z

    .line 236
    .line 237
    if-eqz v0, :cond_4

    .line 238
    .line 239
    goto :goto_4

    .line 240
    :cond_4
    invoke-static {v2}, LA6/h;->T(LCa/h;)[Ld7/d;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    invoke-static {v1, v0}, Lya/j;->b(Landroid/content/Context;[Ld7/d;)V

    .line 245
    .line 246
    .line 247
    const/4 v0, 0x1

    .line 248
    iput-boolean v0, p0, LE5/l;->c:Z

    .line 249
    .line 250
    :goto_4
    new-instance v0, Lua/a;

    .line 251
    .line 252
    const-string v1, "Waiting for the text optional module to be downloaded. Please wait."

    .line 253
    .line 254
    const/16 v2, 0xe

    .line 255
    .line 256
    invoke-direct {v0, v1, v2}, Lua/a;-><init>(Ljava/lang/String;I)V

    .line 257
    .line 258
    .line 259
    throw v0

    .line 260
    :cond_5
    new-instance v0, Lua/a;

    .line 261
    .line 262
    invoke-interface {v2}, LCa/h;->a()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    const-string v4, "Failed to load text module "

    .line 271
    .line 272
    const-string v5, ". "

    .line 273
    .line 274
    invoke-static {v4, v1, v5, v2}, LN0/a;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    invoke-direct {v0, v1, v3}, Lua/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 279
    .line 280
    .line 281
    throw v0
.end method

.method public zzc()V
    .locals 3

    .line 1
    iget-object v0, p0, LE5/l;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuv;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    :try_start_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuv;->zzf()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :catch_0
    move-exception v0

    .line 12
    iget-object v1, p0, LE5/l;->e:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, LCa/h;

    .line 15
    .line 16
    invoke-interface {v1}, LCa/h;->a()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-string v2, "Failed to release text recognizer "

    .line 21
    .line 22
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const-string v2, "DecoupledTextDelegate"

    .line 27
    .line 28
    invoke-static {v2, v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 29
    .line 30
    .line 31
    :goto_0
    const/4 v0, 0x0

    .line 32
    iput-object v0, p0, LE5/l;->g:Ljava/lang/Object;

    .line 33
    .line 34
    :cond_0
    const/4 v0, 0x0

    .line 35
    iput-boolean v0, p0, LE5/l;->b:Z

    .line 36
    .line 37
    return-void
.end method
