.class public abstract Lya/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[Ld7/d;

.field public static final b:Ld7/d;

.field public static final c:Lcom/google/android/gms/internal/mlkit_common/zzai;


# direct methods
.method static constructor <clinit>()V
    .locals 14

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ld7/d;

    .line 3
    .line 4
    sput-object v0, Lya/j;->a:[Ld7/d;

    .line 5
    .line 6
    new-instance v0, Ld7/d;

    .line 7
    .line 8
    const-string v1, "vision.barcode"

    .line 9
    .line 10
    const-wide/16 v2, 0x1

    .line 11
    .line 12
    invoke-direct {v0, v1, v2, v3}, Ld7/d;-><init>(Ljava/lang/String;J)V

    .line 13
    .line 14
    .line 15
    new-instance v1, Ld7/d;

    .line 16
    .line 17
    const-string v4, "vision.custom.ica"

    .line 18
    .line 19
    invoke-direct {v1, v4, v2, v3}, Ld7/d;-><init>(Ljava/lang/String;J)V

    .line 20
    .line 21
    .line 22
    new-instance v4, Ld7/d;

    .line 23
    .line 24
    const-string v5, "vision.face"

    .line 25
    .line 26
    invoke-direct {v4, v5, v2, v3}, Ld7/d;-><init>(Ljava/lang/String;J)V

    .line 27
    .line 28
    .line 29
    new-instance v5, Ld7/d;

    .line 30
    .line 31
    const-string v6, "vision.ica"

    .line 32
    .line 33
    invoke-direct {v5, v6, v2, v3}, Ld7/d;-><init>(Ljava/lang/String;J)V

    .line 34
    .line 35
    .line 36
    new-instance v6, Ld7/d;

    .line 37
    .line 38
    const-string v7, "vision.ocr"

    .line 39
    .line 40
    invoke-direct {v6, v7, v2, v3}, Ld7/d;-><init>(Ljava/lang/String;J)V

    .line 41
    .line 42
    .line 43
    sput-object v6, Lya/j;->b:Ld7/d;

    .line 44
    .line 45
    new-instance v7, Ld7/d;

    .line 46
    .line 47
    const-string v8, "mlkit.ocr.chinese"

    .line 48
    .line 49
    invoke-direct {v7, v8, v2, v3}, Ld7/d;-><init>(Ljava/lang/String;J)V

    .line 50
    .line 51
    .line 52
    new-instance v7, Ld7/d;

    .line 53
    .line 54
    const-string v8, "mlkit.ocr.common"

    .line 55
    .line 56
    invoke-direct {v7, v8, v2, v3}, Ld7/d;-><init>(Ljava/lang/String;J)V

    .line 57
    .line 58
    .line 59
    new-instance v7, Ld7/d;

    .line 60
    .line 61
    const-string v8, "mlkit.ocr.devanagari"

    .line 62
    .line 63
    invoke-direct {v7, v8, v2, v3}, Ld7/d;-><init>(Ljava/lang/String;J)V

    .line 64
    .line 65
    .line 66
    new-instance v7, Ld7/d;

    .line 67
    .line 68
    const-string v8, "mlkit.ocr.japanese"

    .line 69
    .line 70
    invoke-direct {v7, v8, v2, v3}, Ld7/d;-><init>(Ljava/lang/String;J)V

    .line 71
    .line 72
    .line 73
    new-instance v7, Ld7/d;

    .line 74
    .line 75
    const-string v8, "mlkit.ocr.korean"

    .line 76
    .line 77
    invoke-direct {v7, v8, v2, v3}, Ld7/d;-><init>(Ljava/lang/String;J)V

    .line 78
    .line 79
    .line 80
    new-instance v7, Ld7/d;

    .line 81
    .line 82
    const-string v8, "mlkit.langid"

    .line 83
    .line 84
    invoke-direct {v7, v8, v2, v3}, Ld7/d;-><init>(Ljava/lang/String;J)V

    .line 85
    .line 86
    .line 87
    new-instance v8, Ld7/d;

    .line 88
    .line 89
    const-string v9, "mlkit.nlclassifier"

    .line 90
    .line 91
    invoke-direct {v8, v9, v2, v3}, Ld7/d;-><init>(Ljava/lang/String;J)V

    .line 92
    .line 93
    .line 94
    new-instance v9, Ld7/d;

    .line 95
    .line 96
    const-string v10, "tflite_dynamite"

    .line 97
    .line 98
    invoke-direct {v9, v10, v2, v3}, Ld7/d;-><init>(Ljava/lang/String;J)V

    .line 99
    .line 100
    .line 101
    new-instance v11, Ld7/d;

    .line 102
    .line 103
    const-string v12, "mlkit.barcode.ui"

    .line 104
    .line 105
    invoke-direct {v11, v12, v2, v3}, Ld7/d;-><init>(Ljava/lang/String;J)V

    .line 106
    .line 107
    .line 108
    new-instance v12, Ld7/d;

    .line 109
    .line 110
    const-string v13, "mlkit.smartreply"

    .line 111
    .line 112
    invoke-direct {v12, v13, v2, v3}, Ld7/d;-><init>(Ljava/lang/String;J)V

    .line 113
    .line 114
    .line 115
    new-instance v2, Lcom/google/android/gms/internal/mlkit_common/zzah;

    .line 116
    .line 117
    invoke-direct {v2}, Lcom/google/android/gms/internal/mlkit_common/zzah;-><init>()V

    .line 118
    .line 119
    .line 120
    const-string v3, "barcode"

    .line 121
    .line 122
    invoke-virtual {v2, v3, v0}, Lcom/google/android/gms/internal/mlkit_common/zzah;->zza(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_common/zzah;

    .line 123
    .line 124
    .line 125
    const-string v3, "custom_ica"

    .line 126
    .line 127
    invoke-virtual {v2, v3, v1}, Lcom/google/android/gms/internal/mlkit_common/zzah;->zza(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_common/zzah;

    .line 128
    .line 129
    .line 130
    const-string v3, "face"

    .line 131
    .line 132
    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/internal/mlkit_common/zzah;->zza(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_common/zzah;

    .line 133
    .line 134
    .line 135
    const-string v3, "ica"

    .line 136
    .line 137
    invoke-virtual {v2, v3, v5}, Lcom/google/android/gms/internal/mlkit_common/zzah;->zza(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_common/zzah;

    .line 138
    .line 139
    .line 140
    const-string v3, "ocr"

    .line 141
    .line 142
    invoke-virtual {v2, v3, v6}, Lcom/google/android/gms/internal/mlkit_common/zzah;->zza(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_common/zzah;

    .line 143
    .line 144
    .line 145
    const-string v3, "langid"

    .line 146
    .line 147
    invoke-virtual {v2, v3, v7}, Lcom/google/android/gms/internal/mlkit_common/zzah;->zza(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_common/zzah;

    .line 148
    .line 149
    .line 150
    const-string v3, "nlclassifier"

    .line 151
    .line 152
    invoke-virtual {v2, v3, v8}, Lcom/google/android/gms/internal/mlkit_common/zzah;->zza(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_common/zzah;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2, v10, v9}, Lcom/google/android/gms/internal/mlkit_common/zzah;->zza(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_common/zzah;

    .line 156
    .line 157
    .line 158
    const-string v3, "barcode_ui"

    .line 159
    .line 160
    invoke-virtual {v2, v3, v11}, Lcom/google/android/gms/internal/mlkit_common/zzah;->zza(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_common/zzah;

    .line 161
    .line 162
    .line 163
    const-string v3, "smart_reply"

    .line 164
    .line 165
    invoke-virtual {v2, v3, v12}, Lcom/google/android/gms/internal/mlkit_common/zzah;->zza(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_common/zzah;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v2}, Lcom/google/android/gms/internal/mlkit_common/zzah;->zzb()Lcom/google/android/gms/internal/mlkit_common/zzai;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    sput-object v2, Lya/j;->c:Lcom/google/android/gms/internal/mlkit_common/zzai;

    .line 173
    .line 174
    new-instance v2, Lcom/google/android/gms/internal/mlkit_common/zzah;

    .line 175
    .line 176
    invoke-direct {v2}, Lcom/google/android/gms/internal/mlkit_common/zzah;-><init>()V

    .line 177
    .line 178
    .line 179
    const-string v3, "com.google.android.gms.vision.barcode"

    .line 180
    .line 181
    invoke-virtual {v2, v3, v0}, Lcom/google/android/gms/internal/mlkit_common/zzah;->zza(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_common/zzah;

    .line 182
    .line 183
    .line 184
    const-string v0, "com.google.android.gms.vision.custom.ica"

    .line 185
    .line 186
    invoke-virtual {v2, v0, v1}, Lcom/google/android/gms/internal/mlkit_common/zzah;->zza(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_common/zzah;

    .line 187
    .line 188
    .line 189
    const-string v0, "com.google.android.gms.vision.face"

    .line 190
    .line 191
    invoke-virtual {v2, v0, v4}, Lcom/google/android/gms/internal/mlkit_common/zzah;->zza(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_common/zzah;

    .line 192
    .line 193
    .line 194
    const-string v0, "com.google.android.gms.vision.ica"

    .line 195
    .line 196
    invoke-virtual {v2, v0, v5}, Lcom/google/android/gms/internal/mlkit_common/zzah;->zza(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_common/zzah;

    .line 197
    .line 198
    .line 199
    const-string v0, "com.google.android.gms.vision.ocr"

    .line 200
    .line 201
    invoke-virtual {v2, v0, v6}, Lcom/google/android/gms/internal/mlkit_common/zzah;->zza(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_common/zzah;

    .line 202
    .line 203
    .line 204
    const-string v0, "com.google.android.gms.mlkit.langid"

    .line 205
    .line 206
    invoke-virtual {v2, v0, v7}, Lcom/google/android/gms/internal/mlkit_common/zzah;->zza(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_common/zzah;

    .line 207
    .line 208
    .line 209
    const-string v0, "com.google.android.gms.mlkit.nlclassifier"

    .line 210
    .line 211
    invoke-virtual {v2, v0, v8}, Lcom/google/android/gms/internal/mlkit_common/zzah;->zza(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_common/zzah;

    .line 212
    .line 213
    .line 214
    const-string v0, "com.google.android.gms.tflite_dynamite"

    .line 215
    .line 216
    invoke-virtual {v2, v0, v9}, Lcom/google/android/gms/internal/mlkit_common/zzah;->zza(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_common/zzah;

    .line 217
    .line 218
    .line 219
    const-string v0, "com.google.android.gms.mlkit_smartreply"

    .line 220
    .line 221
    invoke-virtual {v2, v0, v12}, Lcom/google/android/gms/internal/mlkit_common/zzah;->zza(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_common/zzah;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v2}, Lcom/google/android/gms/internal/mlkit_common/zzah;->zzb()Lcom/google/android/gms/internal/mlkit_common/zzai;

    .line 225
    .line 226
    .line 227
    return-void
.end method

.method public static a(Landroid/content/Context;)V
    .locals 5

    .line 1
    const-string v0, "ocr"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/android/gms/internal/mlkit_common/zzaf;->zzh(Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_common/zzaf;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Ld7/f;->b:Ld7/f;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {p0}, Ld7/f;->a(Landroid/content/Context;)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const v2, 0xd33d260

    .line 17
    .line 18
    .line 19
    if-lt v1, v2, :cond_1

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    new-array v1, v1, [Ld7/d;

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-ge v2, v3, :cond_0

    .line 33
    .line 34
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    sget-object v4, Lya/j;->c:Lcom/google/android/gms/internal/mlkit_common/zzai;

    .line 39
    .line 40
    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    check-cast v3, Ld7/d;

    .line 45
    .line 46
    invoke-static {v3}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    aput-object v3, v1, v2

    .line 50
    .line 51
    add-int/lit8 v2, v2, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    invoke-static {p0, v1}, Lya/j;->b(Landroid/content/Context;[Ld7/d;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_1
    new-instance v1, Landroid/content/Intent;

    .line 59
    .line 60
    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 61
    .line 62
    .line 63
    const-string v2, "com.google.android.gms"

    .line 64
    .line 65
    const-string v3, "com.google.android.gms.vision.DependencyBroadcastReceiverProxy"

    .line 66
    .line 67
    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 68
    .line 69
    .line 70
    const-string v2, "com.google.android.gms.vision.DEPENDENCY"

    .line 71
    .line 72
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 73
    .line 74
    .line 75
    const-string v2, ","

    .line 76
    .line 77
    invoke-static {v2, v0}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    const-string v2, "com.google.android.gms.vision.DEPENDENCIES"

    .line 82
    .line 83
    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 91
    .line 92
    const-string v2, "requester_app_package"

    .line 93
    .line 94
    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 98
    .line 99
    .line 100
    return-void
.end method

.method public static b(Landroid/content/Context;[Ld7/d;)V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    new-instance v2, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v3, Lya/q;

    .line 9
    .line 10
    invoke-direct {v3, p1}, Lya/q;-><init>([Ld7/d;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    xor-int/2addr p1, v1

    .line 21
    const-string v3, "APIs must not be empty."

    .line 22
    .line 23
    invoke-static {v3, p1}, Lcom/google/android/gms/common/internal/v;->a(Ljava/lang/String;Z)V

    .line 24
    .line 25
    .line 26
    new-instance v4, Lj7/g;

    .line 27
    .line 28
    sget-object v8, Lcom/google/android/gms/common/api/e;->X8:Lcom/google/android/gms/common/api/d;

    .line 29
    .line 30
    sget-object v9, Lcom/google/android/gms/common/api/k;->c:Lcom/google/android/gms/common/api/k;

    .line 31
    .line 32
    const/4 v6, 0x0

    .line 33
    sget-object v7, Lj7/g;->a:Lcom/google/android/gms/common/api/i;

    .line 34
    .line 35
    move-object v5, p0

    .line 36
    invoke-direct/range {v4 .. v9}, Lcom/google/android/gms/common/api/l;-><init>(Landroid/content/Context;Landroid/app/Activity;Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/e;Lcom/google/android/gms/common/api/k;)V

    .line 37
    .line 38
    .line 39
    new-instance p0, Ljava/util/TreeSet;

    .line 40
    .line 41
    sget-object p1, Lj7/b;->a:Lj7/b;

    .line 42
    .line 43
    invoke-direct {p0, p1}, Ljava/util/TreeSet;-><init>(Ljava/util/Comparator;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_0

    .line 55
    .line 56
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    check-cast v2, Lcom/google/android/gms/common/api/p;

    .line 61
    .line 62
    invoke-interface {v2}, Lcom/google/android/gms/common/api/p;->a()[Ld7/d;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-static {p0, v2}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_0
    new-instance p1, Lj7/a;

    .line 71
    .line 72
    new-instance v2, Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-direct {v2, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 75
    .line 76
    .line 77
    const/4 p0, 0x0

    .line 78
    invoke-direct {p1, v2, v1, p0, p0}, Lj7/a;-><init>(Ljava/util/ArrayList;ZLjava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    iget-object p0, p1, Lj7/a;->a:Ljava/util/ArrayList;

    .line 82
    .line 83
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 84
    .line 85
    .line 86
    move-result p0

    .line 87
    if-eqz p0, :cond_1

    .line 88
    .line 89
    new-instance p0, Li7/c;

    .line 90
    .line 91
    invoke-direct {p0, v0, v0}, Li7/c;-><init>(IZ)V

    .line 92
    .line 93
    .line 94
    invoke-static {p0}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    goto :goto_1

    .line 99
    :cond_1
    invoke-static {}, Lcom/google/android/gms/common/api/internal/A;->a()LN7/e;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    new-array v2, v1, [Ld7/d;

    .line 104
    .line 105
    sget-object v3, Lcom/google/android/gms/internal/base/zav;->zaa:Ld7/d;

    .line 106
    .line 107
    aput-object v3, v2, v0

    .line 108
    .line 109
    iput-object v2, p0, LN7/e;->e:Ljava/lang/Object;

    .line 110
    .line 111
    iput-boolean v1, p0, LN7/e;->b:Z

    .line 112
    .line 113
    const/16 v0, 0x6aa8

    .line 114
    .line 115
    iput v0, p0, LN7/e;->c:I

    .line 116
    .line 117
    new-instance v0, La2/v;

    .line 118
    .line 119
    invoke-direct {v0, v4, p1}, La2/v;-><init>(Lj7/g;Lj7/a;)V

    .line 120
    .line 121
    .line 122
    iput-object v0, p0, LN7/e;->d:Ljava/lang/Object;

    .line 123
    .line 124
    invoke-virtual {p0}, LN7/e;->e()Lcom/google/android/gms/common/api/internal/V;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    invoke-virtual {v4, p0}, Lcom/google/android/gms/common/api/l;->doRead(Lcom/google/android/gms/common/api/internal/A;)Lcom/google/android/gms/tasks/Task;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    :goto_1
    new-instance p1, Lae/d;

    .line 133
    .line 134
    const/16 v0, 0x10

    .line 135
    .line 136
    invoke-direct {p1, v0}, Lae/d;-><init>(I)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p0, p1}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    .line 140
    .line 141
    .line 142
    return-void
.end method
