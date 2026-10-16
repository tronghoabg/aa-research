.class public abstract synthetic Lcom/google/android/gms/internal/consent_sdk/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static A(III)I
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbtk;->zbD(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    add-int/2addr p0, p1

    .line 6
    add-int/2addr p0, p2

    .line 7
    return p0
.end method

.method public static B(ILh9/c;)Lh9/d;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzct;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzct;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzct;->zza(I)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzct;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzct;->zzb()Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcx;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p1, p0}, Lh9/c;->b(Ljava/lang/annotation/Annotation;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lh9/c;->a()Lh9/d;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public static C(III)I
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/internal/play_billing/zzby;->zzw(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    add-int/2addr p0, p1

    .line 6
    add-int/2addr p0, p2

    .line 7
    return p0
.end method

.method public static D(III)I
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/android/recaptcha/internal/zzjg;->zzx(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    add-int/2addr p0, p1

    .line 6
    add-int/2addr p0, p2

    .line 7
    return p0
.end method

.method public static E(Luc/f;Lb7/k;)V
    .locals 5

    .line 1
    new-instance v0, LVa/X7;

    .line 2
    .line 3
    sget-object v1, Lgd/c;->d:Lgd/c;

    .line 4
    .line 5
    const-string v2, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.canLaunchUrl"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    new-instance v2, Lgd/d;

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    invoke-direct {v2, p1, v4}, Lgd/d;-><init>(Lb7/k;I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    new-instance v0, LVa/X7;

    .line 27
    .line 28
    const-string v2, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.launchUrl"

    .line 29
    .line 30
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    new-instance v2, Lgd/d;

    .line 36
    .line 37
    const/4 v4, 0x1

    .line 38
    invoke-direct {v2, p1, v4}, Lgd/d;-><init>(Lb7/k;I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 46
    .line 47
    .line 48
    :goto_1
    new-instance v0, LVa/X7;

    .line 49
    .line 50
    const-string v2, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.openUrlInApp"

    .line 51
    .line 52
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    if-eqz p1, :cond_2

    .line 56
    .line 57
    new-instance v2, Lgd/d;

    .line 58
    .line 59
    const/4 v4, 0x2

    .line 60
    invoke-direct {v2, p1, v4}, Lgd/d;-><init>(Lb7/k;I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 64
    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_2
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 68
    .line 69
    .line 70
    :goto_2
    new-instance v0, LVa/X7;

    .line 71
    .line 72
    const-string v2, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.supportsCustomTabs"

    .line 73
    .line 74
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    if-eqz p1, :cond_3

    .line 78
    .line 79
    new-instance v2, Lgd/d;

    .line 80
    .line 81
    const/4 v4, 0x3

    .line 82
    invoke-direct {v2, p1, v4}, Lgd/d;-><init>(Lb7/k;I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 86
    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_3
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 90
    .line 91
    .line 92
    :goto_3
    new-instance v0, LVa/X7;

    .line 93
    .line 94
    const-string v2, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.closeWebView"

    .line 95
    .line 96
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    if-eqz p1, :cond_4

    .line 100
    .line 101
    new-instance p0, Lgd/d;

    .line 102
    .line 103
    const/4 v1, 0x4

    .line 104
    invoke-direct {p0, p1, v1}, Lgd/d;-><init>(Lb7/k;I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, p0}, LVa/X7;->n(Luc/b;)V

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :cond_4
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 112
    .line 113
    .line 114
    return-void
.end method

.method public static F(Luc/f;Ldd/e;)V
    .locals 5

    .line 1
    new-instance v0, LVa/X7;

    .line 2
    .line 3
    sget-object v1, Ldd/i;->d:Ldd/i;

    .line 4
    .line 5
    const-string v2, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.init"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    new-instance v2, Ldd/d;

    .line 14
    .line 15
    const/4 v4, 0x3

    .line 16
    invoke-direct {v2, p1, v4}, Ldd/d;-><init>(Ldd/e;I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    new-instance v0, LVa/X7;

    .line 27
    .line 28
    const-string v2, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.signInSilently"

    .line 29
    .line 30
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    new-instance v2, Ldd/d;

    .line 36
    .line 37
    const/4 v4, 0x4

    .line 38
    invoke-direct {v2, p1, v4}, Ldd/d;-><init>(Ldd/e;I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 46
    .line 47
    .line 48
    :goto_1
    new-instance v0, LVa/X7;

    .line 49
    .line 50
    const-string v2, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.signIn"

    .line 51
    .line 52
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    if-eqz p1, :cond_2

    .line 56
    .line 57
    new-instance v2, Ldd/d;

    .line 58
    .line 59
    const/4 v4, 0x5

    .line 60
    invoke-direct {v2, p1, v4}, Ldd/d;-><init>(Ldd/e;I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 64
    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_2
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 68
    .line 69
    .line 70
    :goto_2
    new-instance v0, LVa/X7;

    .line 71
    .line 72
    const-string v2, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.getAccessToken"

    .line 73
    .line 74
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    if-eqz p1, :cond_3

    .line 78
    .line 79
    new-instance v2, Ldd/d;

    .line 80
    .line 81
    const/4 v4, 0x6

    .line 82
    invoke-direct {v2, p1, v4}, Ldd/d;-><init>(Ldd/e;I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 86
    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_3
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 90
    .line 91
    .line 92
    :goto_3
    new-instance v0, LVa/X7;

    .line 93
    .line 94
    const-string v2, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.signOut"

    .line 95
    .line 96
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    if-eqz p1, :cond_4

    .line 100
    .line 101
    new-instance v2, Ldd/d;

    .line 102
    .line 103
    const/4 v4, 0x7

    .line 104
    invoke-direct {v2, p1, v4}, Ldd/d;-><init>(Ldd/e;I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 108
    .line 109
    .line 110
    goto :goto_4

    .line 111
    :cond_4
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 112
    .line 113
    .line 114
    :goto_4
    new-instance v0, LVa/X7;

    .line 115
    .line 116
    const-string v2, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.disconnect"

    .line 117
    .line 118
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    if-eqz p1, :cond_5

    .line 122
    .line 123
    new-instance v2, Ldd/d;

    .line 124
    .line 125
    const/16 v4, 0x8

    .line 126
    .line 127
    invoke-direct {v2, p1, v4}, Ldd/d;-><init>(Ldd/e;I)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 131
    .line 132
    .line 133
    goto :goto_5

    .line 134
    :cond_5
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 135
    .line 136
    .line 137
    :goto_5
    new-instance v0, LVa/X7;

    .line 138
    .line 139
    const-string v2, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.isSignedIn"

    .line 140
    .line 141
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    if-eqz p1, :cond_6

    .line 145
    .line 146
    new-instance v2, Ldd/d;

    .line 147
    .line 148
    const/16 v4, 0x9

    .line 149
    .line 150
    invoke-direct {v2, p1, v4}, Ldd/d;-><init>(Ldd/e;I)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 154
    .line 155
    .line 156
    goto :goto_6

    .line 157
    :cond_6
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 158
    .line 159
    .line 160
    :goto_6
    new-instance v0, LVa/X7;

    .line 161
    .line 162
    const-string v2, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.clearAuthCache"

    .line 163
    .line 164
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    if-eqz p1, :cond_7

    .line 168
    .line 169
    new-instance v2, Ldd/d;

    .line 170
    .line 171
    const/16 v4, 0xa

    .line 172
    .line 173
    invoke-direct {v2, p1, v4}, Ldd/d;-><init>(Ldd/e;I)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 177
    .line 178
    .line 179
    goto :goto_7

    .line 180
    :cond_7
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 181
    .line 182
    .line 183
    :goto_7
    new-instance v0, LVa/X7;

    .line 184
    .line 185
    const-string v2, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.requestScopes"

    .line 186
    .line 187
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    if-eqz p1, :cond_8

    .line 191
    .line 192
    new-instance p0, Ldd/d;

    .line 193
    .line 194
    const/16 v1, 0xb

    .line 195
    .line 196
    invoke-direct {p0, p1, v1}, Ldd/d;-><init>(Ldd/e;I)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v0, p0}, LVa/X7;->n(Luc/b;)V

    .line 200
    .line 201
    .line 202
    return-void

    .line 203
    :cond_8
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 204
    .line 205
    .line 206
    return-void
.end method

.method public static G(Luc/f;Led/d;)V
    .locals 5

    .line 1
    invoke-interface {p0}, Luc/f;->b()Lab/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, LVa/X7;

    .line 6
    .line 7
    sget-object v2, Led/b;->d:Led/b;

    .line 8
    .line 9
    const-string v3, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getTemporaryPath"

    .line 10
    .line 11
    invoke-direct {v1, p0, v2, v0, v3}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    new-instance v3, Led/a;

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    invoke-direct {v3, p1, v4}, Led/a;-><init>(Led/d;I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v3}, LVa/X7;->n(Luc/b;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {v1, v0}, LVa/X7;->n(Luc/b;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    invoke-interface {p0}, Luc/f;->b()Lab/b;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    new-instance v3, LVa/X7;

    .line 35
    .line 36
    const-string v4, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationSupportPath"

    .line 37
    .line 38
    invoke-direct {v3, p0, v2, v1, v4}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    new-instance v1, Led/a;

    .line 44
    .line 45
    const/4 v4, 0x1

    .line 46
    invoke-direct {v1, p1, v4}, Led/a;-><init>(Led/d;I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3, v1}, LVa/X7;->n(Luc/b;)V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    invoke-virtual {v3, v0}, LVa/X7;->n(Luc/b;)V

    .line 54
    .line 55
    .line 56
    :goto_1
    invoke-interface {p0}, Luc/f;->b()Lab/b;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    new-instance v3, LVa/X7;

    .line 61
    .line 62
    const-string v4, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationDocumentsPath"

    .line 63
    .line 64
    invoke-direct {v3, p0, v2, v1, v4}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    if-eqz p1, :cond_2

    .line 68
    .line 69
    new-instance v1, Led/a;

    .line 70
    .line 71
    const/4 v4, 0x2

    .line 72
    invoke-direct {v1, p1, v4}, Led/a;-><init>(Led/d;I)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v3, v1}, LVa/X7;->n(Luc/b;)V

    .line 76
    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_2
    invoke-virtual {v3, v0}, LVa/X7;->n(Luc/b;)V

    .line 80
    .line 81
    .line 82
    :goto_2
    invoke-interface {p0}, Luc/f;->b()Lab/b;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    new-instance v3, LVa/X7;

    .line 87
    .line 88
    const-string v4, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationCachePath"

    .line 89
    .line 90
    invoke-direct {v3, p0, v2, v1, v4}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    if-eqz p1, :cond_3

    .line 94
    .line 95
    new-instance v1, Led/a;

    .line 96
    .line 97
    const/4 v4, 0x3

    .line 98
    invoke-direct {v1, p1, v4}, Led/a;-><init>(Led/d;I)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v3, v1}, LVa/X7;->n(Luc/b;)V

    .line 102
    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_3
    invoke-virtual {v3, v0}, LVa/X7;->n(Luc/b;)V

    .line 106
    .line 107
    .line 108
    :goto_3
    invoke-interface {p0}, Luc/f;->b()Lab/b;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    new-instance v3, LVa/X7;

    .line 113
    .line 114
    const-string v4, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePath"

    .line 115
    .line 116
    invoke-direct {v3, p0, v2, v1, v4}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    if-eqz p1, :cond_4

    .line 120
    .line 121
    new-instance v1, Led/a;

    .line 122
    .line 123
    const/4 v4, 0x4

    .line 124
    invoke-direct {v1, p1, v4}, Led/a;-><init>(Led/d;I)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v3, v1}, LVa/X7;->n(Luc/b;)V

    .line 128
    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_4
    invoke-virtual {v3, v0}, LVa/X7;->n(Luc/b;)V

    .line 132
    .line 133
    .line 134
    :goto_4
    invoke-interface {p0}, Luc/f;->b()Lab/b;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    new-instance v3, LVa/X7;

    .line 139
    .line 140
    const-string v4, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalCachePaths"

    .line 141
    .line 142
    invoke-direct {v3, p0, v2, v1, v4}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    if-eqz p1, :cond_5

    .line 146
    .line 147
    new-instance v1, Led/a;

    .line 148
    .line 149
    const/4 v4, 0x5

    .line 150
    invoke-direct {v1, p1, v4}, Led/a;-><init>(Led/d;I)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v3, v1}, LVa/X7;->n(Luc/b;)V

    .line 154
    .line 155
    .line 156
    goto :goto_5

    .line 157
    :cond_5
    invoke-virtual {v3, v0}, LVa/X7;->n(Luc/b;)V

    .line 158
    .line 159
    .line 160
    :goto_5
    invoke-interface {p0}, Luc/f;->b()Lab/b;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    new-instance v3, LVa/X7;

    .line 165
    .line 166
    const-string v4, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePaths"

    .line 167
    .line 168
    invoke-direct {v3, p0, v2, v1, v4}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    if-eqz p1, :cond_6

    .line 172
    .line 173
    new-instance p0, Led/a;

    .line 174
    .line 175
    const/4 v0, 0x6

    .line 176
    invoke-direct {p0, p1, v0}, Led/a;-><init>(Led/d;I)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v3, p0}, LVa/X7;->n(Luc/b;)V

    .line 180
    .line 181
    .line 182
    return-void

    .line 183
    :cond_6
    invoke-virtual {v3, v0}, LVa/X7;->n(Luc/b;)V

    .line 184
    .line 185
    .line 186
    return-void
.end method

.method public static H(Luc/f;Lfd/a;)V
    .locals 5

    .line 1
    invoke-interface {p0}, Luc/f;->b()Lab/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, LVa/X7;

    .line 6
    .line 7
    new-instance v2, Luc/w;

    .line 8
    .line 9
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v3, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.remove"

    .line 13
    .line 14
    invoke-direct {v1, p0, v2, v0, v3}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    new-instance v2, Lfd/b;

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-direct {v2, p1, v3}, Lfd/b;-><init>(Lfd/a;I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v2}, LVa/X7;->n(Luc/b;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {v1, v0}, LVa/X7;->n(Luc/b;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    invoke-interface {p0}, Luc/f;->b()Lab/b;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    new-instance v2, LVa/X7;

    .line 38
    .line 39
    new-instance v3, Luc/w;

    .line 40
    .line 41
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 42
    .line 43
    .line 44
    const-string v4, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setBool"

    .line 45
    .line 46
    invoke-direct {v2, p0, v3, v1, v4}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    if-eqz p1, :cond_1

    .line 50
    .line 51
    new-instance v1, Lfd/b;

    .line 52
    .line 53
    const/4 v3, 0x1

    .line 54
    invoke-direct {v1, p1, v3}, Lfd/b;-><init>(Lfd/a;I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2, v1}, LVa/X7;->n(Luc/b;)V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    invoke-virtual {v2, v0}, LVa/X7;->n(Luc/b;)V

    .line 62
    .line 63
    .line 64
    :goto_1
    invoke-interface {p0}, Luc/f;->b()Lab/b;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    new-instance v2, LVa/X7;

    .line 69
    .line 70
    new-instance v3, Luc/w;

    .line 71
    .line 72
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 73
    .line 74
    .line 75
    const-string v4, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setString"

    .line 76
    .line 77
    invoke-direct {v2, p0, v3, v1, v4}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    if-eqz p1, :cond_2

    .line 81
    .line 82
    new-instance v1, Lfd/b;

    .line 83
    .line 84
    const/4 v3, 0x2

    .line 85
    invoke-direct {v1, p1, v3}, Lfd/b;-><init>(Lfd/a;I)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2, v1}, LVa/X7;->n(Luc/b;)V

    .line 89
    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_2
    invoke-virtual {v2, v0}, LVa/X7;->n(Luc/b;)V

    .line 93
    .line 94
    .line 95
    :goto_2
    invoke-interface {p0}, Luc/f;->b()Lab/b;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    new-instance v2, LVa/X7;

    .line 100
    .line 101
    new-instance v3, Luc/w;

    .line 102
    .line 103
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 104
    .line 105
    .line 106
    const-string v4, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setInt"

    .line 107
    .line 108
    invoke-direct {v2, p0, v3, v1, v4}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    if-eqz p1, :cond_3

    .line 112
    .line 113
    new-instance v1, Lfd/b;

    .line 114
    .line 115
    const/4 v3, 0x3

    .line 116
    invoke-direct {v1, p1, v3}, Lfd/b;-><init>(Lfd/a;I)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2, v1}, LVa/X7;->n(Luc/b;)V

    .line 120
    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_3
    invoke-virtual {v2, v0}, LVa/X7;->n(Luc/b;)V

    .line 124
    .line 125
    .line 126
    :goto_3
    invoke-interface {p0}, Luc/f;->b()Lab/b;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    new-instance v2, LVa/X7;

    .line 131
    .line 132
    new-instance v3, Luc/w;

    .line 133
    .line 134
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 135
    .line 136
    .line 137
    const-string v4, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDouble"

    .line 138
    .line 139
    invoke-direct {v2, p0, v3, v1, v4}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    if-eqz p1, :cond_4

    .line 143
    .line 144
    new-instance v1, Lfd/b;

    .line 145
    .line 146
    const/4 v3, 0x4

    .line 147
    invoke-direct {v1, p1, v3}, Lfd/b;-><init>(Lfd/a;I)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v2, v1}, LVa/X7;->n(Luc/b;)V

    .line 151
    .line 152
    .line 153
    goto :goto_4

    .line 154
    :cond_4
    invoke-virtual {v2, v0}, LVa/X7;->n(Luc/b;)V

    .line 155
    .line 156
    .line 157
    :goto_4
    invoke-interface {p0}, Luc/f;->b()Lab/b;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    new-instance v2, LVa/X7;

    .line 162
    .line 163
    new-instance v3, Luc/w;

    .line 164
    .line 165
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 166
    .line 167
    .line 168
    const-string v4, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setStringList"

    .line 169
    .line 170
    invoke-direct {v2, p0, v3, v1, v4}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    if-eqz p1, :cond_5

    .line 174
    .line 175
    new-instance v1, Lfd/b;

    .line 176
    .line 177
    const/4 v3, 0x5

    .line 178
    invoke-direct {v1, p1, v3}, Lfd/b;-><init>(Lfd/a;I)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v2, v1}, LVa/X7;->n(Luc/b;)V

    .line 182
    .line 183
    .line 184
    goto :goto_5

    .line 185
    :cond_5
    invoke-virtual {v2, v0}, LVa/X7;->n(Luc/b;)V

    .line 186
    .line 187
    .line 188
    :goto_5
    invoke-interface {p0}, Luc/f;->b()Lab/b;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    new-instance v2, LVa/X7;

    .line 193
    .line 194
    new-instance v3, Luc/w;

    .line 195
    .line 196
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 197
    .line 198
    .line 199
    const-string v4, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.clear"

    .line 200
    .line 201
    invoke-direct {v2, p0, v3, v1, v4}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    if-eqz p1, :cond_6

    .line 205
    .line 206
    new-instance v1, Lfd/b;

    .line 207
    .line 208
    const/4 v3, 0x6

    .line 209
    invoke-direct {v1, p1, v3}, Lfd/b;-><init>(Lfd/a;I)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v2, v1}, LVa/X7;->n(Luc/b;)V

    .line 213
    .line 214
    .line 215
    goto :goto_6

    .line 216
    :cond_6
    invoke-virtual {v2, v0}, LVa/X7;->n(Luc/b;)V

    .line 217
    .line 218
    .line 219
    :goto_6
    invoke-interface {p0}, Luc/f;->b()Lab/b;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    new-instance v2, LVa/X7;

    .line 224
    .line 225
    new-instance v3, Luc/w;

    .line 226
    .line 227
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 228
    .line 229
    .line 230
    const-string v4, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.getAll"

    .line 231
    .line 232
    invoke-direct {v2, p0, v3, v1, v4}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    if-eqz p1, :cond_7

    .line 236
    .line 237
    new-instance p0, Lfd/b;

    .line 238
    .line 239
    const/4 v0, 0x7

    .line 240
    invoke-direct {p0, p1, v0}, Lfd/b;-><init>(Lfd/a;I)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v2, p0}, LVa/X7;->n(Luc/b;)V

    .line 244
    .line 245
    .line 246
    return-void

    .line 247
    :cond_7
    invoke-virtual {v2, v0}, LVa/X7;->n(Luc/b;)V

    .line 248
    .line 249
    .line 250
    return-void
.end method

.method public static I(Luc/f;Lhd/q;)V
    .locals 5

    .line 1
    new-instance v0, LVa/X7;

    .line 2
    .line 3
    sget-object v1, Lhd/f;->d:Lhd/f;

    .line 4
    .line 5
    const-string v2, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.initialize"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    new-instance v2, Lhd/d;

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    invoke-direct {v2, p1, v4}, Lhd/d;-><init>(Lhd/q;I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    new-instance v0, LVa/X7;

    .line 27
    .line 28
    const-string v2, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.createForPlatformView"

    .line 29
    .line 30
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    new-instance v2, Lhd/d;

    .line 36
    .line 37
    const/4 v4, 0x1

    .line 38
    invoke-direct {v2, p1, v4}, Lhd/d;-><init>(Lhd/q;I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 46
    .line 47
    .line 48
    :goto_1
    new-instance v0, LVa/X7;

    .line 49
    .line 50
    const-string v2, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.createForTextureView"

    .line 51
    .line 52
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    if-eqz p1, :cond_2

    .line 56
    .line 57
    new-instance v2, Lhd/d;

    .line 58
    .line 59
    const/4 v4, 0x2

    .line 60
    invoke-direct {v2, p1, v4}, Lhd/d;-><init>(Lhd/q;I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 64
    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_2
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 68
    .line 69
    .line 70
    :goto_2
    new-instance v0, LVa/X7;

    .line 71
    .line 72
    const-string v2, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.dispose"

    .line 73
    .line 74
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    if-eqz p1, :cond_3

    .line 78
    .line 79
    new-instance v2, Lhd/d;

    .line 80
    .line 81
    const/4 v4, 0x3

    .line 82
    invoke-direct {v2, p1, v4}, Lhd/d;-><init>(Lhd/q;I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 86
    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_3
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 90
    .line 91
    .line 92
    :goto_3
    new-instance v0, LVa/X7;

    .line 93
    .line 94
    const-string v2, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.setMixWithOthers"

    .line 95
    .line 96
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    if-eqz p1, :cond_4

    .line 100
    .line 101
    new-instance v2, Lhd/d;

    .line 102
    .line 103
    const/4 v4, 0x4

    .line 104
    invoke-direct {v2, p1, v4}, Lhd/d;-><init>(Lhd/q;I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 108
    .line 109
    .line 110
    goto :goto_4

    .line 111
    :cond_4
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 112
    .line 113
    .line 114
    :goto_4
    new-instance v0, LVa/X7;

    .line 115
    .line 116
    const-string v2, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.getLookupKeyForAsset"

    .line 117
    .line 118
    invoke-direct {v0, p0, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    if-eqz p1, :cond_5

    .line 122
    .line 123
    new-instance p0, Lhd/d;

    .line 124
    .line 125
    const/4 v1, 0x5

    .line 126
    invoke-direct {p0, p1, v1}, Lhd/d;-><init>(Lhd/q;I)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, p0}, LVa/X7;->n(Luc/b;)V

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :cond_5
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 134
    .line 135
    .line 136
    return-void
.end method

.method public static J(Luc/f;Ljava/lang/String;Lhd/o;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string p1, ""

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const-string v0, "."

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    :goto_0
    new-instance v0, LVa/X7;

    .line 17
    .line 18
    const-string v1, "dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.setLooping"

    .line 19
    .line 20
    invoke-static {v1, p1}, LR8/v;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    sget-object v2, Lhd/f;->d:Lhd/f;

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-direct {v0, p0, v2, v3, v1}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    if-eqz p2, :cond_1

    .line 31
    .line 32
    new-instance v1, Lhd/k;

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    invoke-direct {v1, p2, v4}, Lhd/k;-><init>(Lhd/o;I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, LVa/X7;->n(Luc/b;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 43
    .line 44
    .line 45
    :goto_1
    new-instance v0, LVa/X7;

    .line 46
    .line 47
    const-string v1, "dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.setVolume"

    .line 48
    .line 49
    invoke-static {v1, p1}, LR8/v;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-direct {v0, p0, v2, v3, v1}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    if-eqz p2, :cond_2

    .line 57
    .line 58
    new-instance v1, Lhd/k;

    .line 59
    .line 60
    const/4 v4, 0x1

    .line 61
    invoke-direct {v1, p2, v4}, Lhd/k;-><init>(Lhd/o;I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v1}, LVa/X7;->n(Luc/b;)V

    .line 65
    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_2
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 69
    .line 70
    .line 71
    :goto_2
    new-instance v0, LVa/X7;

    .line 72
    .line 73
    const-string v1, "dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.setPlaybackSpeed"

    .line 74
    .line 75
    invoke-static {v1, p1}, LR8/v;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-direct {v0, p0, v2, v3, v1}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    if-eqz p2, :cond_3

    .line 83
    .line 84
    new-instance v1, Lhd/k;

    .line 85
    .line 86
    const/4 v4, 0x2

    .line 87
    invoke-direct {v1, p2, v4}, Lhd/k;-><init>(Lhd/o;I)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v1}, LVa/X7;->n(Luc/b;)V

    .line 91
    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_3
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 95
    .line 96
    .line 97
    :goto_3
    new-instance v0, LVa/X7;

    .line 98
    .line 99
    const-string v1, "dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.play"

    .line 100
    .line 101
    invoke-static {v1, p1}, LR8/v;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-direct {v0, p0, v2, v3, v1}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    if-eqz p2, :cond_4

    .line 109
    .line 110
    new-instance v1, Lhd/k;

    .line 111
    .line 112
    const/4 v4, 0x3

    .line 113
    invoke-direct {v1, p2, v4}, Lhd/k;-><init>(Lhd/o;I)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, v1}, LVa/X7;->n(Luc/b;)V

    .line 117
    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_4
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 121
    .line 122
    .line 123
    :goto_4
    new-instance v0, LVa/X7;

    .line 124
    .line 125
    const-string v1, "dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.pause"

    .line 126
    .line 127
    invoke-static {v1, p1}, LR8/v;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    invoke-direct {v0, p0, v2, v3, v1}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    if-eqz p2, :cond_5

    .line 135
    .line 136
    new-instance v1, Lhd/k;

    .line 137
    .line 138
    const/4 v4, 0x4

    .line 139
    invoke-direct {v1, p2, v4}, Lhd/k;-><init>(Lhd/o;I)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0, v1}, LVa/X7;->n(Luc/b;)V

    .line 143
    .line 144
    .line 145
    goto :goto_5

    .line 146
    :cond_5
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 147
    .line 148
    .line 149
    :goto_5
    new-instance v0, LVa/X7;

    .line 150
    .line 151
    const-string v1, "dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.seekTo"

    .line 152
    .line 153
    invoke-static {v1, p1}, LR8/v;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    invoke-direct {v0, p0, v2, v3, v1}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    if-eqz p2, :cond_6

    .line 161
    .line 162
    new-instance v1, Lhd/k;

    .line 163
    .line 164
    const/4 v4, 0x5

    .line 165
    invoke-direct {v1, p2, v4}, Lhd/k;-><init>(Lhd/o;I)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0, v1}, LVa/X7;->n(Luc/b;)V

    .line 169
    .line 170
    .line 171
    goto :goto_6

    .line 172
    :cond_6
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 173
    .line 174
    .line 175
    :goto_6
    new-instance v0, LVa/X7;

    .line 176
    .line 177
    const-string v1, "dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.getPlaybackState"

    .line 178
    .line 179
    invoke-static {v1, p1}, LR8/v;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    invoke-direct {v0, p0, v2, v3, p1}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    if-eqz p2, :cond_7

    .line 187
    .line 188
    new-instance p0, Lhd/k;

    .line 189
    .line 190
    const/4 p1, 0x6

    .line 191
    invoke-direct {p0, p2, p1}, Lhd/k;-><init>(Lhd/o;I)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v0, p0}, LVa/X7;->n(Luc/b;)V

    .line 195
    .line 196
    .line 197
    return-void

    .line 198
    :cond_7
    invoke-virtual {v0, v3}, LVa/X7;->n(Luc/b;)V

    .line 199
    .line 200
    .line 201
    return-void
.end method

.method public static a(JJ)J
    .locals 2

    .line 1
    invoke-static {p0, p1}, Ld0/f;->d(J)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p2, p3}, Ld0/c;->b(J)F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    sub-float/2addr v0, v1

    .line 10
    invoke-static {p0, p1}, Ld0/f;->b(J)F

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    invoke-static {p2, p3}, Ld0/c;->c(J)F

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    sub-float/2addr p0, p1

    .line 19
    invoke-static {v0, p0}, Lcom/moloco/sdk/internal/publisher/H;->I(FF)J

    .line 20
    .line 21
    .line 22
    move-result-wide p0

    .line 23
    return-wide p0
.end method

.method public static b(I)I
    .locals 5

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-static {v0}, LA/f;->g(I)[I

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    array-length v1, v0

    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    if-ge v2, v1, :cond_1

    .line 9
    .line 10
    aget v3, v0, v2

    .line 11
    .line 12
    invoke-static {v3}, Lcom/google/android/gms/internal/consent_sdk/a;->i(I)I

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    if-ne v4, p0, :cond_0

    .line 17
    .line 18
    return v3

    .line 19
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 23
    .line 24
    const-string v1, "Invalid rotation degrees specified: "

    .line 25
    .line 26
    invoke-static {p0, v1}, Lka/n;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw v0
.end method

.method public static c(Lg0/d;JFFJLg0/g;)V
    .locals 10

    .line 1
    sget-wide v5, Ld0/c;->b:J

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move-wide v1, p1

    .line 5
    move v3, p3

    .line 6
    move v4, p4

    .line 7
    move-wide v7, p5

    .line 8
    move-object/from16 v9, p7

    .line 9
    .line 10
    invoke-interface/range {v0 .. v9}, Lg0/d;->w(JFFJJLg0/g;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static d(Lg0/d;Le0/d;JJJFLe0/r;II)V
    .locals 16

    .line 1
    move/from16 v0, p11

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x2

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    sget-wide v1, LL0/g;->b:J

    .line 8
    .line 9
    move-wide v5, v1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-wide/from16 v5, p2

    .line 12
    .line 13
    :goto_0
    sget-wide v9, LL0/g;->b:J

    .line 14
    .line 15
    and-int/lit8 v1, v0, 0x10

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    move-wide/from16 v11, p4

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move-wide/from16 v11, p6

    .line 23
    .line 24
    :goto_1
    and-int/lit8 v1, v0, 0x20

    .line 25
    .line 26
    if-eqz v1, :cond_2

    .line 27
    .line 28
    const/high16 v1, 0x3f800000    # 1.0f

    .line 29
    .line 30
    move v13, v1

    .line 31
    goto :goto_2

    .line 32
    :cond_2
    move/from16 v13, p8

    .line 33
    .line 34
    :goto_2
    and-int/lit16 v0, v0, 0x200

    .line 35
    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    const/4 v0, 0x1

    .line 39
    move v15, v0

    .line 40
    :goto_3
    move-object/from16 v3, p0

    .line 41
    .line 42
    move-object/from16 v4, p1

    .line 43
    .line 44
    move-wide/from16 v7, p4

    .line 45
    .line 46
    move-object/from16 v14, p9

    .line 47
    .line 48
    goto :goto_4

    .line 49
    :cond_3
    move/from16 v15, p10

    .line 50
    .line 51
    goto :goto_3

    .line 52
    :goto_4
    invoke-interface/range {v3 .. v15}, Lg0/d;->f(Le0/d;JJJJFLe0/r;I)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public static synthetic e(Lg0/d;Le0/f;Le0/m;FLg0/g;I)V
    .locals 1

    .line 1
    and-int/lit8 v0, p5, 0x4

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/high16 p3, 0x3f800000    # 1.0f

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p5, p5, 0x8

    .line 8
    .line 9
    if-eqz p5, :cond_1

    .line 10
    .line 11
    sget-object p4, Lg0/f;->b:Lg0/f;

    .line 12
    .line 13
    :cond_1
    invoke-interface {p0, p1, p2, p3, p4}, Lg0/d;->i(Le0/f;Le0/m;FLg0/c;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static f(Lt0/v;Le0/m;JJFLg0/c;I)V
    .locals 8

    .line 1
    and-int/lit8 v0, p8, 0x2

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-wide p2, Ld0/c;->b:J

    .line 6
    .line 7
    :cond_0
    move-wide v2, p2

    .line 8
    and-int/lit8 p2, p8, 0x4

    .line 9
    .line 10
    if-eqz p2, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, Lt0/v;->c()J

    .line 13
    .line 14
    .line 15
    move-result-wide p2

    .line 16
    invoke-static {p2, p3, v2, v3}, Lcom/google/android/gms/internal/consent_sdk/a;->a(JJ)J

    .line 17
    .line 18
    .line 19
    move-result-wide p4

    .line 20
    :cond_1
    move-wide v4, p4

    .line 21
    and-int/lit8 p2, p8, 0x8

    .line 22
    .line 23
    if-eqz p2, :cond_2

    .line 24
    .line 25
    const/high16 p2, 0x3f800000    # 1.0f

    .line 26
    .line 27
    move v6, p2

    .line 28
    goto :goto_0

    .line 29
    :cond_2
    move v6, p6

    .line 30
    :goto_0
    and-int/lit8 p2, p8, 0x10

    .line 31
    .line 32
    if-eqz p2, :cond_3

    .line 33
    .line 34
    sget-object p2, Lg0/f;->b:Lg0/f;

    .line 35
    .line 36
    move-object v7, p2

    .line 37
    :goto_1
    move-object v0, p0

    .line 38
    move-object v1, p1

    .line 39
    goto :goto_2

    .line 40
    :cond_3
    move-object v7, p7

    .line 41
    goto :goto_1

    .line 42
    :goto_2
    invoke-virtual/range {v0 .. v7}, Lt0/v;->e(Le0/m;JJFLg0/c;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public static g(Lg0/d;JJFLe0/r;I)V
    .locals 11

    .line 1
    sget-wide v3, Ld0/c;->b:J

    .line 2
    .line 3
    and-int/lit8 v0, p7, 0x4

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {p0}, Lg0/d;->c()J

    .line 8
    .line 9
    .line 10
    move-result-wide p3

    .line 11
    invoke-static {p3, p4, v3, v4}, Lcom/google/android/gms/internal/consent_sdk/a;->a(JJ)J

    .line 12
    .line 13
    .line 14
    move-result-wide p3

    .line 15
    :cond_0
    move-wide v5, p3

    .line 16
    and-int/lit8 p3, p7, 0x8

    .line 17
    .line 18
    if-eqz p3, :cond_1

    .line 19
    .line 20
    const/high16 p3, 0x3f800000    # 1.0f

    .line 21
    .line 22
    move v7, p3

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    move/from16 v7, p5

    .line 25
    .line 26
    :goto_0
    sget-object v8, Lg0/f;->b:Lg0/f;

    .line 27
    .line 28
    and-int/lit8 p3, p7, 0x20

    .line 29
    .line 30
    if-eqz p3, :cond_2

    .line 31
    .line 32
    const/4 p3, 0x0

    .line 33
    move-object v9, p3

    .line 34
    goto :goto_1

    .line 35
    :cond_2
    move-object/from16 v9, p6

    .line 36
    .line 37
    :goto_1
    and-int/lit8 p3, p7, 0x40

    .line 38
    .line 39
    if-eqz p3, :cond_3

    .line 40
    .line 41
    const/4 p3, 0x3

    .line 42
    :goto_2
    move-object v0, p0

    .line 43
    move-wide v1, p1

    .line 44
    move v10, p3

    .line 45
    goto :goto_3

    .line 46
    :cond_3
    const/4 p3, 0x0

    .line 47
    goto :goto_2

    .line 48
    :goto_3
    invoke-interface/range {v0 .. v10}, Lg0/d;->k(JJJFLg0/c;Le0/r;I)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public static h(Lt0/v;Le0/m;JJJLg0/c;I)V
    .locals 10

    .line 1
    and-int/lit8 v0, p9, 0x2

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-wide p2, Ld0/c;->b:J

    .line 6
    .line 7
    :cond_0
    move-wide v2, p2

    .line 8
    and-int/lit8 p2, p9, 0x4

    .line 9
    .line 10
    if-eqz p2, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, Lt0/v;->c()J

    .line 13
    .line 14
    .line 15
    move-result-wide p2

    .line 16
    invoke-static {p2, p3, v2, v3}, Lcom/google/android/gms/internal/consent_sdk/a;->a(JJ)J

    .line 17
    .line 18
    .line 19
    move-result-wide p2

    .line 20
    move-wide v4, p2

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    move-wide v4, p4

    .line 23
    :goto_0
    and-int/lit8 p2, p9, 0x20

    .line 24
    .line 25
    if-eqz p2, :cond_2

    .line 26
    .line 27
    sget-object p2, Lg0/f;->b:Lg0/f;

    .line 28
    .line 29
    move-object v9, p2

    .line 30
    goto :goto_1

    .line 31
    :cond_2
    move-object/from16 v9, p8

    .line 32
    .line 33
    :goto_1
    const/high16 v8, 0x3f800000    # 1.0f

    .line 34
    .line 35
    move-object v0, p0

    .line 36
    move-object v1, p1

    .line 37
    move-wide/from16 v6, p6

    .line 38
    .line 39
    invoke-virtual/range {v0 .. v9}, Lt0/v;->g(Le0/m;JJJFLg0/c;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public static synthetic i(I)I
    .locals 1

    .line 1
    const/4 v0, 0x1

    if-eq p0, v0, :cond_3

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-ne p0, v0, :cond_0

    const/16 p0, 0x10e

    return p0

    :cond_0
    const/4 p0, 0x0

    throw p0

    :cond_1
    const/16 p0, 0xb4

    return p0

    :cond_2
    const/16 p0, 0x5a

    return p0

    :cond_3
    const/4 p0, 0x0

    return p0
.end method

.method public static synthetic j(I)Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    const-string p0, "ACTION_POWERSAVING"

    return-object p0

    :cond_0
    const/4 p0, 0x0

    throw p0

    :cond_1
    const-string p0, "ACTION_NOTIFICATIONS"

    return-object p0

    :cond_2
    const-string p0, "ACTION_AUTOSTART"

    return-object p0
.end method

.method public static synthetic k(I)Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v1, 0x2

    if-eq p0, v1, :cond_2

    const/4 v0, 0x3

    const/4 v1, 0x0

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-ne p0, v0, :cond_0

    return v1

    :cond_0
    const/4 p0, 0x0

    throw p0

    :cond_1
    return v1

    :cond_2
    return v0
.end method

.method public static synthetic l(I)I
    .locals 0

    .line 1
    packed-switch p0, :pswitch_data_0

    const/4 p0, 0x0

    throw p0

    :pswitch_0
    const/high16 p0, 0x40000000    # 2.0f

    return p0

    :pswitch_1
    const/high16 p0, 0x20000000

    return p0

    :pswitch_2
    const/high16 p0, 0x10000000

    return p0

    :pswitch_3
    const/high16 p0, 0x8000000

    return p0

    :pswitch_4
    const/high16 p0, 0x4000000

    return p0

    :pswitch_5
    const/high16 p0, 0x2000000

    return p0

    :pswitch_6
    const/high16 p0, 0x1000000

    return p0

    :pswitch_7
    const/high16 p0, 0x800000

    return p0

    :pswitch_8
    const/high16 p0, 0x400000

    return p0

    :pswitch_9
    const/high16 p0, 0x200000

    return p0

    :pswitch_a
    const/high16 p0, 0x100000

    return p0

    :pswitch_b
    const/high16 p0, 0x80000

    return p0

    :pswitch_c
    const/high16 p0, 0x40000

    return p0

    :pswitch_d
    const/high16 p0, 0x20000

    return p0

    :pswitch_e
    const/high16 p0, 0x10000

    return p0

    :pswitch_f
    const p0, 0x8000

    return p0

    :pswitch_10
    const/16 p0, 0x4000

    return p0

    :pswitch_11
    const/16 p0, 0x2000

    return p0

    :pswitch_12
    const/16 p0, 0x1000

    return p0

    :pswitch_13
    const/16 p0, 0x800

    return p0

    :pswitch_14
    const/16 p0, 0x400

    return p0

    :pswitch_15
    const/16 p0, 0x200

    return p0

    :pswitch_16
    const/16 p0, 0x100

    return p0

    :pswitch_17
    const/16 p0, 0x80

    return p0

    :pswitch_18
    const/16 p0, 0x40

    return p0

    :pswitch_19
    const/16 p0, 0x20

    return p0

    :pswitch_1a
    const/16 p0, 0x10

    return p0

    :pswitch_1b
    const/16 p0, 0x8

    return p0

    :pswitch_1c
    const/4 p0, 0x4

    return p0

    :pswitch_1d
    const/4 p0, 0x2

    return p0

    :pswitch_1e
    const/4 p0, 0x1

    return p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
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

.method public static synthetic m(I)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    if-eq p0, v0, :cond_3

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eq p0, v1, :cond_2

    const/4 v1, 0x3

    if-eq p0, v1, :cond_1

    const/4 v0, 0x4

    if-ne p0, v0, :cond_0

    return v2

    :cond_0
    const/4 p0, 0x0

    throw p0

    :cond_1
    return v0

    :cond_2
    return v2

    :cond_3
    return v0
.end method

.method public static n(III)I
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/internal/consent_sdk/zzpv;->zzC(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    add-int/2addr p0, p1

    .line 6
    add-int/2addr p0, p2

    .line 7
    return p0
.end method

.method public static o(I)Lcom/google/android/gms/internal/mlkit_common/zzbc;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/mlkit_common/zzay;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_common/zzay;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/mlkit_common/zzay;->zza(I)Lcom/google/android/gms/internal/mlkit_common/zzay;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_common/zzay;->zzb()Lcom/google/android/gms/internal/mlkit_common/zzbc;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public static p(Lcom/google/android/gms/internal/mlkit_common/zzbc;Ljava/util/HashMap;Lcom/google/android/gms/internal/mlkit_common/zzbc;Ljava/util/HashMap;I)Lcom/google/android/gms/internal/mlkit_common/zzbc;
    .locals 0

    .line 1
    invoke-interface {p0}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p1, p0, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    new-instance p0, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-direct {p0, p3}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, Lj$/util/DesugarCollections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 14
    .line 15
    .line 16
    new-instance p0, Lcom/google/android/gms/internal/mlkit_common/zzay;

    .line 17
    .line 18
    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_common/zzay;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p4}, Lcom/google/android/gms/internal/mlkit_common/zzay;->zza(I)Lcom/google/android/gms/internal/mlkit_common/zzay;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_common/zzay;->zzb()Lcom/google/android/gms/internal/mlkit_common/zzbc;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method public static q(I)Lcom/google/android/gms/internal/mlkit_vision_common/zzai;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_common/zzae;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_common/zzae;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/mlkit_vision_common/zzae;->zza(I)Lcom/google/android/gms/internal/mlkit_vision_common/zzae;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_common/zzae;->zzb()Lcom/google/android/gms/internal/mlkit_vision_common/zzai;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public static r(I)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcx;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzct;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzct;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzct;->zza(I)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzct;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzct;->zzb()Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcx;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public static s(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcx;Ljava/util/HashMap;Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcx;Ljava/util/HashMap;I)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcx;
    .locals 0

    .line 1
    invoke-interface {p0}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p1, p0, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    new-instance p0, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-direct {p0, p3}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, Lj$/util/DesugarCollections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 14
    .line 15
    .line 16
    new-instance p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzct;

    .line 17
    .line 18
    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzct;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p4}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzct;->zza(I)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzct;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzct;->zzb()Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcx;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method public static t(ILh9/c;)Lh9/d;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/mlkit_common/zzay;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_common/zzay;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/mlkit_common/zzay;->zza(I)Lcom/google/android/gms/internal/mlkit_common/zzay;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_common/zzay;->zzb()Lcom/google/android/gms/internal/mlkit_common/zzbc;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p1, p0}, Lh9/c;->b(Ljava/lang/annotation/Annotation;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lh9/c;->a()Lh9/d;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public static u(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public static v(Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2, p3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-static {p0, p4}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public static w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public static x(Lcom/google/android/gms/internal/mlkit_common/zzbc;Ljava/util/HashMap;Lcom/google/android/gms/internal/mlkit_common/zzbc;Ljava/util/HashMap;)V
    .locals 0

    .line 1
    invoke-interface {p0}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p1, p0, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    new-instance p0, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-direct {p0, p3}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, Lj$/util/DesugarCollections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static y(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcx;Ljava/util/HashMap;Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcx;Ljava/util/HashMap;)V
    .locals 0

    .line 1
    invoke-interface {p0}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p1, p0, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    new-instance p0, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-direct {p0, p3}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, Lj$/util/DesugarCollections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static z(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/internal/logger/Logger;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-interface {p2, p0}, Lcom/qonversion/android/sdk/internal/logger/Logger;->debug(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
