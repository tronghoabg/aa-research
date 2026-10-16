.class public abstract Lcom/android/billingclient/api/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final A:Lcom/android/billingclient/api/BillingResult;

.field public static final B:Lcom/android/billingclient/api/BillingResult;

.field public static final C:Lcom/android/billingclient/api/BillingResult;

.field public static final D:Lcom/android/billingclient/api/BillingResult;

.field public static final a:Lcom/android/billingclient/api/BillingResult;

.field public static final b:Lcom/android/billingclient/api/BillingResult;

.field public static final c:Lcom/android/billingclient/api/BillingResult;

.field public static final d:Lcom/android/billingclient/api/BillingResult;

.field public static final e:Lcom/android/billingclient/api/BillingResult;

.field public static final f:Lcom/android/billingclient/api/BillingResult;

.field public static final g:Lcom/android/billingclient/api/BillingResult;

.field public static final h:Lcom/android/billingclient/api/BillingResult;

.field public static final i:Lcom/android/billingclient/api/BillingResult;

.field public static final j:Lcom/android/billingclient/api/BillingResult;

.field public static final k:Lcom/android/billingclient/api/BillingResult;

.field public static final l:Lcom/android/billingclient/api/BillingResult;

.field public static final m:Lcom/android/billingclient/api/BillingResult;

.field public static final n:Lcom/android/billingclient/api/BillingResult;

.field public static final o:Lcom/android/billingclient/api/BillingResult;

.field public static final p:Lcom/android/billingclient/api/BillingResult;

.field public static final q:Lcom/android/billingclient/api/BillingResult;

.field public static final r:Lcom/android/billingclient/api/BillingResult;

.field public static final s:Lcom/android/billingclient/api/BillingResult;

.field public static final t:Lcom/android/billingclient/api/BillingResult;

.field public static final u:Lcom/android/billingclient/api/BillingResult;

.field public static final v:Lcom/android/billingclient/api/BillingResult;

.field public static final w:Lcom/android/billingclient/api/BillingResult;

.field public static final x:Lcom/android/billingclient/api/BillingResult;

.field public static final y:Lcom/android/billingclient/api/BillingResult;

.field public static final z:Lcom/android/billingclient/api/BillingResult;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const/4 v0, 0x3

    .line 2
    const-string v1, "Google Play In-app Billing API version is less than 3"

    .line 3
    .line 4
    invoke-static {v0, v1}, Lka/n;->c(ILjava/lang/String;)Lcom/android/billingclient/api/BillingResult;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    sput-object v1, Lcom/android/billingclient/api/i;->a:Lcom/android/billingclient/api/BillingResult;

    .line 9
    .line 10
    const-string v1, "Google Play In-app Billing API version is less than 9"

    .line 11
    .line 12
    invoke-static {v0, v1}, Lka/n;->c(ILjava/lang/String;)Lcom/android/billingclient/api/BillingResult;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    sput-object v1, Lcom/android/billingclient/api/i;->b:Lcom/android/billingclient/api/BillingResult;

    .line 17
    .line 18
    const-string v1, "Billing service unavailable on device."

    .line 19
    .line 20
    invoke-static {v0, v1}, Lka/n;->c(ILjava/lang/String;)Lcom/android/billingclient/api/BillingResult;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sput-object v0, Lcom/android/billingclient/api/i;->c:Lcom/android/billingclient/api/BillingResult;

    .line 25
    .line 26
    const/4 v0, 0x5

    .line 27
    const-string v1, "Client is already in the process of connecting to billing service."

    .line 28
    .line 29
    invoke-static {v0, v1}, Lka/n;->c(ILjava/lang/String;)Lcom/android/billingclient/api/BillingResult;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    sput-object v1, Lcom/android/billingclient/api/i;->d:Lcom/android/billingclient/api/BillingResult;

    .line 34
    .line 35
    const-string v1, "The list of SKUs can\'t be empty."

    .line 36
    .line 37
    invoke-static {v0, v1}, Lka/n;->c(ILjava/lang/String;)Lcom/android/billingclient/api/BillingResult;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    sput-object v1, Lcom/android/billingclient/api/i;->e:Lcom/android/billingclient/api/BillingResult;

    .line 42
    .line 43
    const-string v1, "SKU type can\'t be empty."

    .line 44
    .line 45
    invoke-static {v0, v1}, Lka/n;->c(ILjava/lang/String;)Lcom/android/billingclient/api/BillingResult;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    sput-object v1, Lcom/android/billingclient/api/i;->f:Lcom/android/billingclient/api/BillingResult;

    .line 50
    .line 51
    const-string v1, "Product type can\'t be empty."

    .line 52
    .line 53
    invoke-static {v0, v1}, Lka/n;->c(ILjava/lang/String;)Lcom/android/billingclient/api/BillingResult;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    sput-object v1, Lcom/android/billingclient/api/i;->g:Lcom/android/billingclient/api/BillingResult;

    .line 58
    .line 59
    const/4 v1, -0x2

    .line 60
    const-string v2, "Client does not support extra params."

    .line 61
    .line 62
    invoke-static {v1, v2}, Lka/n;->c(ILjava/lang/String;)Lcom/android/billingclient/api/BillingResult;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    sput-object v2, Lcom/android/billingclient/api/i;->h:Lcom/android/billingclient/api/BillingResult;

    .line 67
    .line 68
    const-string v2, "Invalid purchase token."

    .line 69
    .line 70
    invoke-static {v0, v2}, Lka/n;->c(ILjava/lang/String;)Lcom/android/billingclient/api/BillingResult;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    sput-object v2, Lcom/android/billingclient/api/i;->i:Lcom/android/billingclient/api/BillingResult;

    .line 75
    .line 76
    const/4 v2, 0x6

    .line 77
    const-string v3, "An internal error occurred."

    .line 78
    .line 79
    invoke-static {v2, v3}, Lka/n;->c(ILjava/lang/String;)Lcom/android/billingclient/api/BillingResult;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    sput-object v2, Lcom/android/billingclient/api/i;->j:Lcom/android/billingclient/api/BillingResult;

    .line 84
    .line 85
    invoke-static {}, Lcom/android/billingclient/api/BillingResult;->newBuilder()Lcom/android/billingclient/api/BillingResult$Builder;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-virtual {v2, v0}, Lcom/android/billingclient/api/BillingResult$Builder;->setResponseCode(I)Lcom/android/billingclient/api/BillingResult$Builder;

    .line 90
    .line 91
    .line 92
    const-string v3, "SKU can\'t be null."

    .line 93
    .line 94
    invoke-virtual {v2, v3}, Lcom/android/billingclient/api/BillingResult$Builder;->setDebugMessage(Ljava/lang/String;)Lcom/android/billingclient/api/BillingResult$Builder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2}, Lcom/android/billingclient/api/BillingResult$Builder;->build()Lcom/android/billingclient/api/BillingResult;

    .line 98
    .line 99
    .line 100
    invoke-static {}, Lcom/android/billingclient/api/BillingResult;->newBuilder()Lcom/android/billingclient/api/BillingResult$Builder;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    const/4 v3, 0x0

    .line 105
    invoke-virtual {v2, v3}, Lcom/android/billingclient/api/BillingResult$Builder;->setResponseCode(I)Lcom/android/billingclient/api/BillingResult$Builder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2}, Lcom/android/billingclient/api/BillingResult$Builder;->build()Lcom/android/billingclient/api/BillingResult;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    sput-object v2, Lcom/android/billingclient/api/i;->k:Lcom/android/billingclient/api/BillingResult;

    .line 113
    .line 114
    const/4 v2, -0x1

    .line 115
    const-string v3, "Service connection is disconnected."

    .line 116
    .line 117
    invoke-static {v2, v3}, Lka/n;->c(ILjava/lang/String;)Lcom/android/billingclient/api/BillingResult;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    sput-object v2, Lcom/android/billingclient/api/i;->l:Lcom/android/billingclient/api/BillingResult;

    .line 122
    .line 123
    const/4 v2, 0x2

    .line 124
    const-string v3, "Timeout communicating with service."

    .line 125
    .line 126
    invoke-static {v2, v3}, Lka/n;->c(ILjava/lang/String;)Lcom/android/billingclient/api/BillingResult;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    sput-object v2, Lcom/android/billingclient/api/i;->m:Lcom/android/billingclient/api/BillingResult;

    .line 131
    .line 132
    const-string v2, "Client does not support subscriptions."

    .line 133
    .line 134
    invoke-static {v1, v2}, Lka/n;->c(ILjava/lang/String;)Lcom/android/billingclient/api/BillingResult;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    sput-object v2, Lcom/android/billingclient/api/i;->n:Lcom/android/billingclient/api/BillingResult;

    .line 139
    .line 140
    const-string v2, "Client does not support subscriptions update."

    .line 141
    .line 142
    invoke-static {v1, v2}, Lka/n;->c(ILjava/lang/String;)Lcom/android/billingclient/api/BillingResult;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    sput-object v2, Lcom/android/billingclient/api/i;->o:Lcom/android/billingclient/api/BillingResult;

    .line 147
    .line 148
    const-string v2, "Client does not support get purchase history."

    .line 149
    .line 150
    invoke-static {v1, v2}, Lka/n;->c(ILjava/lang/String;)Lcom/android/billingclient/api/BillingResult;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    sput-object v2, Lcom/android/billingclient/api/i;->p:Lcom/android/billingclient/api/BillingResult;

    .line 155
    .line 156
    const-string v2, "Client does not support price change confirmation."

    .line 157
    .line 158
    invoke-static {v1, v2}, Lka/n;->c(ILjava/lang/String;)Lcom/android/billingclient/api/BillingResult;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    sput-object v2, Lcom/android/billingclient/api/i;->q:Lcom/android/billingclient/api/BillingResult;

    .line 163
    .line 164
    const-string v2, "Play Store version installed does not support cross selling products."

    .line 165
    .line 166
    invoke-static {v1, v2}, Lka/n;->c(ILjava/lang/String;)Lcom/android/billingclient/api/BillingResult;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    sput-object v2, Lcom/android/billingclient/api/i;->r:Lcom/android/billingclient/api/BillingResult;

    .line 171
    .line 172
    const-string v2, "Client does not support multi-item purchases."

    .line 173
    .line 174
    invoke-static {v1, v2}, Lka/n;->c(ILjava/lang/String;)Lcom/android/billingclient/api/BillingResult;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    sput-object v2, Lcom/android/billingclient/api/i;->s:Lcom/android/billingclient/api/BillingResult;

    .line 179
    .line 180
    const-string v2, "Client does not support offer_id_token."

    .line 181
    .line 182
    invoke-static {v1, v2}, Lka/n;->c(ILjava/lang/String;)Lcom/android/billingclient/api/BillingResult;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    sput-object v2, Lcom/android/billingclient/api/i;->t:Lcom/android/billingclient/api/BillingResult;

    .line 187
    .line 188
    const-string v2, "Client does not support ProductDetails."

    .line 189
    .line 190
    invoke-static {v1, v2}, Lka/n;->c(ILjava/lang/String;)Lcom/android/billingclient/api/BillingResult;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    sput-object v2, Lcom/android/billingclient/api/i;->u:Lcom/android/billingclient/api/BillingResult;

    .line 195
    .line 196
    const-string v2, "Client does not support in-app messages."

    .line 197
    .line 198
    invoke-static {v1, v2}, Lka/n;->c(ILjava/lang/String;)Lcom/android/billingclient/api/BillingResult;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    sput-object v2, Lcom/android/billingclient/api/i;->v:Lcom/android/billingclient/api/BillingResult;

    .line 203
    .line 204
    invoke-static {}, Lcom/android/billingclient/api/BillingResult;->newBuilder()Lcom/android/billingclient/api/BillingResult$Builder;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    invoke-virtual {v2, v1}, Lcom/android/billingclient/api/BillingResult$Builder;->setResponseCode(I)Lcom/android/billingclient/api/BillingResult$Builder;

    .line 209
    .line 210
    .line 211
    const-string v3, "Client does not support user choice billing."

    .line 212
    .line 213
    invoke-virtual {v2, v3}, Lcom/android/billingclient/api/BillingResult$Builder;->setDebugMessage(Ljava/lang/String;)Lcom/android/billingclient/api/BillingResult$Builder;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v2}, Lcom/android/billingclient/api/BillingResult$Builder;->build()Lcom/android/billingclient/api/BillingResult;

    .line 217
    .line 218
    .line 219
    invoke-static {}, Lcom/android/billingclient/api/BillingResult;->newBuilder()Lcom/android/billingclient/api/BillingResult$Builder;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    invoke-virtual {v2, v1}, Lcom/android/billingclient/api/BillingResult$Builder;->setResponseCode(I)Lcom/android/billingclient/api/BillingResult$Builder;

    .line 224
    .line 225
    .line 226
    const-string v3, "Play Store version installed does not support external offer."

    .line 227
    .line 228
    invoke-virtual {v2, v3}, Lcom/android/billingclient/api/BillingResult$Builder;->setDebugMessage(Ljava/lang/String;)Lcom/android/billingclient/api/BillingResult$Builder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v2}, Lcom/android/billingclient/api/BillingResult$Builder;->build()Lcom/android/billingclient/api/BillingResult;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    sput-object v2, Lcom/android/billingclient/api/i;->w:Lcom/android/billingclient/api/BillingResult;

    .line 236
    .line 237
    const-string v2, "Unknown feature"

    .line 238
    .line 239
    invoke-static {v0, v2}, Lka/n;->c(ILjava/lang/String;)Lcom/android/billingclient/api/BillingResult;

    .line 240
    .line 241
    .line 242
    move-result-object v2

    .line 243
    sput-object v2, Lcom/android/billingclient/api/i;->x:Lcom/android/billingclient/api/BillingResult;

    .line 244
    .line 245
    const-string v2, "Play Store version installed does not support get billing config."

    .line 246
    .line 247
    invoke-static {v1, v2}, Lka/n;->c(ILjava/lang/String;)Lcom/android/billingclient/api/BillingResult;

    .line 248
    .line 249
    .line 250
    move-result-object v2

    .line 251
    sput-object v2, Lcom/android/billingclient/api/i;->y:Lcom/android/billingclient/api/BillingResult;

    .line 252
    .line 253
    const-string v2, "Query product details with serialized docid is not supported."

    .line 254
    .line 255
    invoke-static {v1, v2}, Lka/n;->c(ILjava/lang/String;)Lcom/android/billingclient/api/BillingResult;

    .line 256
    .line 257
    .line 258
    move-result-object v2

    .line 259
    sput-object v2, Lcom/android/billingclient/api/i;->z:Lcom/android/billingclient/api/BillingResult;

    .line 260
    .line 261
    const/4 v2, 0x4

    .line 262
    const-string v3, "Item is unavailable for purchase."

    .line 263
    .line 264
    invoke-static {v2, v3}, Lka/n;->c(ILjava/lang/String;)Lcom/android/billingclient/api/BillingResult;

    .line 265
    .line 266
    .line 267
    move-result-object v2

    .line 268
    sput-object v2, Lcom/android/billingclient/api/i;->A:Lcom/android/billingclient/api/BillingResult;

    .line 269
    .line 270
    const-string v2, "Query product details with developer specified account is not supported."

    .line 271
    .line 272
    invoke-static {v1, v2}, Lka/n;->c(ILjava/lang/String;)Lcom/android/billingclient/api/BillingResult;

    .line 273
    .line 274
    .line 275
    move-result-object v2

    .line 276
    sput-object v2, Lcom/android/billingclient/api/i;->B:Lcom/android/billingclient/api/BillingResult;

    .line 277
    .line 278
    const-string v2, "Play Store version installed does not support alternative billing only."

    .line 279
    .line 280
    invoke-static {v1, v2}, Lka/n;->c(ILjava/lang/String;)Lcom/android/billingclient/api/BillingResult;

    .line 281
    .line 282
    .line 283
    move-result-object v1

    .line 284
    sput-object v1, Lcom/android/billingclient/api/i;->C:Lcom/android/billingclient/api/BillingResult;

    .line 285
    .line 286
    const-string v1, "To use this API you must specify a PurchasesUpdateListener when initializing a BillingClient."

    .line 287
    .line 288
    invoke-static {v0, v1}, Lka/n;->c(ILjava/lang/String;)Lcom/android/billingclient/api/BillingResult;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    sput-object v0, Lcom/android/billingclient/api/i;->D:Lcom/android/billingclient/api/BillingResult;

    .line 293
    .line 294
    return-void
.end method

.method public static a(ILjava/lang/String;)Lcom/android/billingclient/api/BillingResult;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lka/n;->c(ILjava/lang/String;)Lcom/android/billingclient/api/BillingResult;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method
