.class public final LK8/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/Continuation;
.implements Lcom/google/android/gms/tasks/OnFailureListener;


# static fields
.field public static final c:LK8/b;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LK8/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LK8/b;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LK8/b;->c:LK8/b;

    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LK8/b;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p2, p0, LK8/b;->a:I

    iput-object p1, p0, LK8/b;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Lcom/google/firebase/auth/FirebaseAuth;Landroid/app/Activity;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 6

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    new-instance p0, LJ8/k;

    .line 4
    .line 5
    const-string p1, "ERROR_MISSING_ACTIVITY"

    .line 6
    .line 7
    const-string v0, "App verification failed - a valid Activity is required to complete the Recaptcha flow"

    .line 8
    .line 9
    invoke-direct {p0, p1, v0}, LJ8/j;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p2, p0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Ls8/g;

    .line 17
    .line 18
    invoke-virtual {v0}, Ls8/g;->a()V

    .line 19
    .line 20
    .line 21
    iget-object v0, v0, Ls8/g;->a:Landroid/content/Context;

    .line 22
    .line 23
    invoke-static {v0, p0}, LK8/x;->b(Landroid/content/Context;Lcom/google/firebase/auth/FirebaseAuth;)V

    .line 24
    .line 25
    .line 26
    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 27
    .line 28
    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 29
    .line 30
    .line 31
    sget-object v1, LE4/F;->d:LE4/F;

    .line 32
    .line 33
    if-nez v1, :cond_1

    .line 34
    .line 35
    new-instance v1, LE4/F;

    .line 36
    .line 37
    const/4 v2, 0x3

    .line 38
    invoke-direct {v1, v2}, LE4/F;-><init>(I)V

    .line 39
    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    iput-boolean v2, v1, LE4/F;->b:Z

    .line 43
    .line 44
    sput-object v1, LE4/F;->d:LE4/F;

    .line 45
    .line 46
    :cond_1
    sget-object v1, LE4/F;->d:LE4/F;

    .line 47
    .line 48
    iget-boolean v2, v1, LE4/F;->b:Z

    .line 49
    .line 50
    if-nez v2, :cond_2

    .line 51
    .line 52
    new-instance v2, LK8/r;

    .line 53
    .line 54
    invoke-direct {v2, v1, p1, v0}, LK8/r;-><init>(LE4/F;Landroid/app/Activity;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 55
    .line 56
    .line 57
    iput-object v2, v1, LE4/F;->c:Ljava/lang/Object;

    .line 58
    .line 59
    invoke-static {p1}, Landroidx/localbroadcastmanager/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroidx/localbroadcastmanager/content/LocalBroadcastManager;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    new-instance v4, Landroid/content/IntentFilter;

    .line 64
    .line 65
    const-string v5, "com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT"

    .line 66
    .line 67
    invoke-direct {v4, v5}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v3, v2, v4}, Landroidx/localbroadcastmanager/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 71
    .line 72
    .line 73
    const/4 v2, 0x1

    .line 74
    iput-boolean v2, v1, LE4/F;->b:Z

    .line 75
    .line 76
    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzaep;

    .line 77
    .line 78
    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzaep;-><init>(Lcom/google/firebase/auth/FirebaseAuth;Landroid/app/Activity;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzaep;->zza()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    goto :goto_0

    .line 89
    :cond_2
    new-instance p0, Lcom/google/android/gms/common/api/Status;

    .line 90
    .line 91
    const/16 p1, 0x42a1

    .line 92
    .line 93
    const-string v0, "reCAPTCHA flow already in progress"

    .line 94
    .line 95
    const/4 v1, 0x0

    .line 96
    invoke-direct {p0, p1, v0, v1, v1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Ld7/b;)V

    .line 97
    .line 98
    .line 99
    invoke-static {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzadg;->zza(Lcom/google/android/gms/common/api/Status;)Ls8/j;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-static {p0}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    :goto_0
    new-instance p1, LK8/G;

    .line 108
    .line 109
    const/4 v0, 0x2

    .line 110
    invoke-direct {p1, v0, p2}, LK8/G;-><init>(ILcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0, p1}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    new-instance p1, LK8/G;

    .line 118
    .line 119
    const/4 v0, 0x1

    .line 120
    invoke-direct {p1, v0, p2}, LK8/G;-><init>(ILcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0, p1}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    .line 124
    .line 125
    .line 126
    return-void
.end method


# virtual methods
.method public a(Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/String;Landroid/app/Activity;ZZZLcom/google/android/recaptcha/RecaptchaAction;)Lcom/google/android/gms/tasks/Task;
    .locals 12

    .line 1
    move/from16 v0, p5

    .line 2
    .line 3
    iget-object v2, p1, Lcom/google/firebase/auth/FirebaseAuth;->g:LK8/f;

    .line 4
    .line 5
    sget-object v6, LK8/F;->c:LK8/F;

    .line 6
    .line 7
    iget-object v3, p1, Lcom/google/firebase/auth/FirebaseAuth;->a:Ls8/g;

    .line 8
    .line 9
    invoke-static {v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzafb;->zza(Ls8/g;)Z

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    const/4 v5, 0x0

    .line 14
    if-nez v4, :cond_9

    .line 15
    .line 16
    iget-boolean v4, v2, LK8/f;->a:Z

    .line 17
    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    goto/16 :goto_5

    .line 21
    .line 22
    :cond_0
    iget-boolean v4, v2, LK8/f;->b:Z

    .line 23
    .line 24
    new-instance v7, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string v8, "ForceRecaptchaV2Flow from phoneAuthOptions = "

    .line 27
    .line 28
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v8, ", ForceRecaptchav2Flow from firebaseSettings = "

    .line 35
    .line 36
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    const-string v7, "b"

    .line 47
    .line 48
    invoke-static {v7, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    if-nez v0, :cond_2

    .line 52
    .line 53
    iget-boolean v0, v2, LK8/f;->b:Z

    .line 54
    .line 55
    if-eqz v0, :cond_1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    const/4 v0, 0x0

    .line 59
    goto :goto_1

    .line 60
    :cond_2
    :goto_0
    const/4 v0, 0x1

    .line 61
    :goto_1
    new-instance v2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 62
    .line 63
    invoke-direct {v2}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 64
    .line 65
    .line 66
    iget-object v4, v6, LK8/F;->a:LK8/x;

    .line 67
    .line 68
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 72
    .line 73
    .line 74
    move-result-wide v8

    .line 75
    iget-wide v10, v4, LK8/x;->b:J

    .line 76
    .line 77
    sub-long/2addr v8, v10

    .line 78
    const-wide/32 v10, 0x36ee80

    .line 79
    .line 80
    .line 81
    cmp-long v8, v8, v10

    .line 82
    .line 83
    if-gez v8, :cond_3

    .line 84
    .line 85
    iget-object v4, v4, LK8/x;->a:Lcom/google/android/gms/tasks/Task;

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_3
    move-object v4, v5

    .line 89
    :goto_2
    if-eqz v4, :cond_5

    .line 90
    .line 91
    invoke-virtual {v4}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 92
    .line 93
    .line 94
    move-result v8

    .line 95
    if-eqz v8, :cond_4

    .line 96
    .line 97
    invoke-virtual {v4}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    check-cast v0, Ljava/lang/String;

    .line 102
    .line 103
    new-instance v1, LK8/K;

    .line 104
    .line 105
    invoke-direct {v1, v0, v5, v5}, LK8/K;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-static {v1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    return-object v0

    .line 113
    :cond_4
    invoke-virtual {v4}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    new-instance v5, Ljava/lang/StringBuilder;

    .line 122
    .line 123
    const-string v8, "Error in previous reCAPTCHAV2 flow: "

    .line 124
    .line 125
    invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    invoke-static {v7, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 136
    .line 137
    .line 138
    const-string v4, "Continuing with application verification as normal"

    .line 139
    .line 140
    invoke-static {v7, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 141
    .line 142
    .line 143
    :cond_5
    if-nez v0, :cond_6

    .line 144
    .line 145
    if-eqz p6, :cond_7

    .line 146
    .line 147
    :cond_6
    move-object v1, p1

    .line 148
    move-object v3, p3

    .line 149
    move/from16 v4, p4

    .line 150
    .line 151
    move v5, v0

    .line 152
    move-object v7, v2

    .line 153
    move-object v0, p0

    .line 154
    move-object v2, p2

    .line 155
    goto :goto_3

    .line 156
    :cond_7
    iget-object v0, p1, Lcom/google/firebase/auth/FirebaseAuth;->l:LC6/l;

    .line 157
    .line 158
    if-nez v0, :cond_8

    .line 159
    .line 160
    new-instance v0, LC6/l;

    .line 161
    .line 162
    invoke-direct {v0, v3, p1}, LC6/l;-><init>(Ls8/g;Lcom/google/firebase/auth/FirebaseAuth;)V

    .line 163
    .line 164
    .line 165
    iput-object v0, p1, Lcom/google/firebase/auth/FirebaseAuth;->l:LC6/l;

    .line 166
    .line 167
    :cond_8
    iget-object v0, p1, Lcom/google/firebase/auth/FirebaseAuth;->l:LC6/l;

    .line 168
    .line 169
    iget-object v3, p1, Lcom/google/firebase/auth/FirebaseAuth;->k:Ljava/lang/String;

    .line 170
    .line 171
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 172
    .line 173
    invoke-virtual {v0, v3, v4}, LC6/l;->G(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/google/android/gms/tasks/Task;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    new-instance v3, Lx4/d;

    .line 178
    .line 179
    const/16 v4, 0x14

    .line 180
    .line 181
    invoke-direct {v3, v4}, Lx4/d;-><init>(I)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v0, v3}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    new-instance v3, LK8/A;

    .line 189
    .line 190
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 191
    .line 192
    .line 193
    iput-object p0, v3, LK8/A;->c:Ljava/lang/Object;

    .line 194
    .line 195
    iput-object v2, v3, LK8/A;->d:Ljava/lang/Object;

    .line 196
    .line 197
    iput-object p1, v3, LK8/A;->e:Ljava/lang/Object;

    .line 198
    .line 199
    move-object/from16 v1, p7

    .line 200
    .line 201
    iput-object v1, v3, LK8/A;->f:Ljava/lang/Object;

    .line 202
    .line 203
    iput-object p2, v3, LK8/A;->a:Ljava/lang/String;

    .line 204
    .line 205
    iput-object p3, v3, LK8/A;->g:Ljava/lang/Object;

    .line 206
    .line 207
    move/from16 v8, p4

    .line 208
    .line 209
    iput-boolean v8, v3, LK8/A;->b:Z

    .line 210
    .line 211
    iput-object v6, v3, LK8/A;->h:Ljava/lang/Object;

    .line 212
    .line 213
    invoke-virtual {v0, v3}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 214
    .line 215
    .line 216
    move-object v7, v2

    .line 217
    goto :goto_4

    .line 218
    :goto_3
    invoke-virtual/range {v0 .. v7}, LK8/b;->c(Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/String;Landroid/app/Activity;ZZLK8/F;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 219
    .line 220
    .line 221
    :goto_4
    invoke-virtual {v7}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    return-object v0

    .line 226
    :cond_9
    :goto_5
    new-instance v0, LK8/K;

    .line 227
    .line 228
    invoke-direct {v0, v5, v5, v5}, LK8/K;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    return-object v0
.end method

.method public c(Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/String;Landroid/app/Activity;ZZLK8/F;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    .line 1
    if-eqz p4, :cond_1

    .line 2
    .line 3
    if-nez p5, :cond_1

    .line 4
    .line 5
    iget-object p4, p1, Lcom/google/firebase/auth/FirebaseAuth;->a:Ls8/g;

    .line 6
    .line 7
    invoke-virtual {p4}, Ls8/g;->a()V

    .line 8
    .line 9
    .line 10
    iget-object p4, p4, Ls8/g;->a:Landroid/content/Context;

    .line 11
    .line 12
    invoke-static {p4}, Lcom/google/android/play/core/integrity/IntegrityManagerFactory;->create(Landroid/content/Context;)Lcom/google/android/play/core/integrity/IntegrityManager;

    .line 13
    .line 14
    .line 15
    move-result-object p4

    .line 16
    iget-object p5, p0, LK8/b;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p5, Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 21
    .line 22
    .line 23
    move-result p5

    .line 24
    if-nez p5, :cond_0

    .line 25
    .line 26
    new-instance p5, Lcom/google/android/gms/internal/firebase-auth-api/zzagh;

    .line 27
    .line 28
    iget-object p6, p0, LK8/b;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p6, Ljava/lang/String;

    .line 31
    .line 32
    invoke-direct {p5, p6}, Lcom/google/android/gms/internal/firebase-auth-api/zzagh;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-static {p5}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 36
    .line 37
    .line 38
    move-result-object p5

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    iget-object p5, p1, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/zzabj;

    .line 41
    .line 42
    invoke-virtual {p5}, Lcom/google/android/gms/internal/firebase-auth-api/zzabj;->zza()Lcom/google/android/gms/tasks/Task;

    .line 43
    .line 44
    .line 45
    move-result-object p5

    .line 46
    :goto_0
    new-instance p6, LK8/I;

    .line 47
    .line 48
    invoke-direct {p6, p0, p2, p4}, LK8/I;-><init>(LK8/b;Ljava/lang/String;Lcom/google/android/play/core/integrity/IntegrityManager;)V

    .line 49
    .line 50
    .line 51
    iget-object p2, p1, Lcom/google/firebase/auth/FirebaseAuth;->z:Ljava/util/concurrent/Executor;

    .line 52
    .line 53
    invoke-virtual {p5, p2, p6}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    new-instance p4, LVa/Y7;

    .line 58
    .line 59
    invoke-direct {p4}, Ljava/lang/Object;-><init>()V

    .line 60
    .line 61
    .line 62
    iput-object p0, p4, LVa/Y7;->a:Ljava/lang/Object;

    .line 63
    .line 64
    iput-object p7, p4, LVa/Y7;->b:Ljava/lang/Object;

    .line 65
    .line 66
    iput-object p1, p4, LVa/Y7;->c:Ljava/lang/Object;

    .line 67
    .line 68
    iput-object p3, p4, LVa/Y7;->d:Ljava/lang/Object;

    .line 69
    .line 70
    invoke-virtual {p2, p4}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_1
    invoke-static {p1, p3, p7}, LK8/b;->b(Lcom/google/firebase/auth/FirebaseAuth;Landroid/app/Activity;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public onFailure(Ljava/lang/Exception;)V
    .locals 8

    .line 1
    instance-of p1, p1, Ls8/k;

    .line 2
    .line 3
    if-eqz p1, :cond_2

    .line 4
    .line 5
    sget-object p1, LK8/l;->f:Lh7/a;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    new-array v1, v0, [Ljava/lang/Object;

    .line 9
    .line 10
    const-string v2, "Failure to refresh token; scheduling refresh after failure"

    .line 11
    .line 12
    invoke-virtual {p1, v2, v1}, Lh7/a;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, LK8/b;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, LA7/p;

    .line 18
    .line 19
    iget-object v1, v1, LA7/p;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, LK8/l;

    .line 22
    .line 23
    iget-wide v2, v1, LK8/l;->b:J

    .line 24
    .line 25
    long-to-int v2, v2

    .line 26
    const/16 v3, 0x1e

    .line 27
    .line 28
    if-eq v2, v3, :cond_1

    .line 29
    .line 30
    const/16 v3, 0x3c

    .line 31
    .line 32
    if-eq v2, v3, :cond_1

    .line 33
    .line 34
    const/16 v3, 0x78

    .line 35
    .line 36
    if-eq v2, v3, :cond_1

    .line 37
    .line 38
    const/16 v3, 0xf0

    .line 39
    .line 40
    if-eq v2, v3, :cond_1

    .line 41
    .line 42
    const/16 v3, 0x1e0

    .line 43
    .line 44
    if-eq v2, v3, :cond_1

    .line 45
    .line 46
    const/16 v3, 0x3c0

    .line 47
    .line 48
    if-eq v2, v3, :cond_0

    .line 49
    .line 50
    const-wide/16 v2, 0x1e

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    const-wide/16 v2, 0x3c0

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    const-wide/16 v2, 0x2

    .line 57
    .line 58
    iget-wide v4, v1, LK8/l;->b:J

    .line 59
    .line 60
    mul-long/2addr v2, v4

    .line 61
    :goto_0
    iput-wide v2, v1, LK8/l;->b:J

    .line 62
    .line 63
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 64
    .line 65
    .line 66
    move-result-wide v2

    .line 67
    iget-wide v4, v1, LK8/l;->b:J

    .line 68
    .line 69
    const-wide/16 v6, 0x3e8

    .line 70
    .line 71
    mul-long/2addr v4, v6

    .line 72
    add-long/2addr v4, v2

    .line 73
    iput-wide v4, v1, LK8/l;->a:J

    .line 74
    .line 75
    iget-wide v2, v1, LK8/l;->a:J

    .line 76
    .line 77
    const-string v4, "Scheduling refresh for "

    .line 78
    .line 79
    invoke-static {v2, v3, v4}, LA7/p0;->k(JLjava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    new-array v0, v0, [Ljava/lang/Object;

    .line 84
    .line 85
    invoke-virtual {p1, v2, v0}, Lh7/a;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    iget-object p1, v1, LK8/l;->d:Lcom/google/android/gms/internal/firebase-auth-api/zzg;

    .line 89
    .line 90
    iget-object v0, v1, LK8/l;->e:LA7/p;

    .line 91
    .line 92
    iget-wide v1, v1, LK8/l;->b:J

    .line 93
    .line 94
    mul-long/2addr v1, v6

    .line 95
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 96
    .line 97
    .line 98
    :cond_2
    return-void
.end method

.method public then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, LK8/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Lcom/google/android/recaptcha/RecaptchaTasksClient;

    .line 17
    .line 18
    iget-object v0, p0, LK8/b;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lcom/google/android/recaptcha/RecaptchaAction;

    .line 21
    .line 22
    invoke-interface {p1, v0}, Lcom/google/android/recaptcha/RecaptchaTasksClient;->executeTask(Lcom/google/android/recaptcha/RecaptchaAction;)Lcom/google/android/gms/tasks/Task;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    instance-of v0, p1, LK8/y;

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    const-string v0, "RecaptchaHandler"

    .line 39
    .line 40
    const/4 v1, 0x4

    .line 41
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_1

    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    new-instance v1, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    const-string v2, "Ignoring error related to fetching recaptcha config - "

    .line 54
    .line 55
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    :cond_1
    const-string p1, ""

    .line 69
    .line 70
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    goto :goto_0

    .line 75
    :cond_2
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    :goto_0
    return-object p1

    .line 80
    :pswitch_1
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    iget-object v1, p0, LK8/b;->b:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v1, Lcom/moloco/sdk/internal/publisher/H;

    .line 87
    .line 88
    if-nez v0, :cond_3

    .line 89
    .line 90
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    new-instance v0, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    const-string v2, "Failed to get Recaptcha token, error - "

    .line 104
    .line 105
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    const-string p1, "\n\n Failing open with a fake token."

    .line 112
    .line 113
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    const-string v0, "RecaptchaCallWrapper"

    .line 121
    .line 122
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 123
    .line 124
    .line 125
    const-string p1, "NO_RECAPTCHA"

    .line 126
    .line 127
    invoke-virtual {v1, p1}, Lcom/moloco/sdk/internal/publisher/H;->y0(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    goto :goto_1

    .line 132
    :cond_3
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    check-cast p1, Ljava/lang/String;

    .line 137
    .line 138
    invoke-virtual {v1, p1}, Lcom/moloco/sdk/internal/publisher/H;->y0(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    :goto_1
    return-object p1

    .line 143
    :pswitch_2
    iget-object v0, p0, LK8/b;->b:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v0, LK8/i;

    .line 146
    .line 147
    iget-object v1, v0, LK8/i;->d:LJ8/I;

    .line 148
    .line 149
    if-nez v1, :cond_4

    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_4
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    if-eqz v1, :cond_5

    .line 157
    .line 158
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    check-cast p1, LK8/T;

    .line 163
    .line 164
    new-instance v1, LK8/T;

    .line 165
    .line 166
    iget-object v2, p1, LK8/T;->a:LK8/e;

    .line 167
    .line 168
    iget-object v0, v0, LK8/i;->d:LJ8/I;

    .line 169
    .line 170
    iget-object p1, p1, LK8/T;->b:LK8/Q;

    .line 171
    .line 172
    invoke-direct {v1, v2, p1, v0}, LK8/T;-><init>(LK8/e;LK8/Q;LJ8/I;)V

    .line 173
    .line 174
    .line 175
    invoke-static {v1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    goto :goto_2

    .line 180
    :cond_5
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    instance-of v1, p1, LJ8/m;

    .line 185
    .line 186
    if-eqz v1, :cond_6

    .line 187
    .line 188
    move-object v1, p1

    .line 189
    check-cast v1, LJ8/m;

    .line 190
    .line 191
    iget-object v0, v0, LK8/i;->d:LJ8/I;

    .line 192
    .line 193
    iput-object v0, v1, LJ8/m;->b:LJ8/d;

    .line 194
    .line 195
    :cond_6
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    :goto_2
    return-object p1

    .line 200
    :pswitch_3
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    if-nez v0, :cond_7

    .line 205
    .line 206
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    goto :goto_3

    .line 215
    :cond_7
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    check-cast p1, LJ8/p;

    .line 220
    .line 221
    iget-object p1, p1, LJ8/p;->a:Ljava/lang/String;

    .line 222
    .line 223
    iget-object v0, p0, LK8/b;->b:Ljava/lang/Object;

    .line 224
    .line 225
    check-cast v0, LK8/h;

    .line 226
    .line 227
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    new-instance v1, LK8/j;

    .line 231
    .line 232
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 233
    .line 234
    .line 235
    iput-object p1, v1, LK8/j;->a:Ljava/lang/String;

    .line 236
    .line 237
    iget-object p1, v0, LK8/h;->a:LK8/e;

    .line 238
    .line 239
    iput-object p1, v1, LK8/j;->e:LK8/e;

    .line 240
    .line 241
    invoke-static {v1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 242
    .line 243
    .line 244
    move-result-object p1

    .line 245
    :goto_3
    return-object p1

    .line 246
    nop

    .line 247
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
