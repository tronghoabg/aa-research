.class public Lcom/applovin/impl/e6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/applovin/impl/e6$d;,
        Lcom/applovin/impl/e6$b;,
        Lcom/applovin/impl/e6$c;,
        Lcom/applovin/impl/e6$e;
    }
.end annotation


# static fields
.field private static final r:Ljava/util/concurrent/ExecutorService;


# instance fields
.field private final a:Lcom/applovin/impl/sdk/k;

.field private final b:Lcom/applovin/impl/sdk/o;

.field private final c:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

.field private final d:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

.field private final e:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

.field private final f:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

.field private final g:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

.field private final h:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

.field private final i:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

.field private final j:Ljava/util/Map;

.field private k:Ljava/util/concurrent/ExecutorService;

.field private l:Ljava/util/concurrent/ExecutorService;

.field private final m:Ljava/util/List;

.field private final n:Ljava/lang/Object;

.field private o:Z

.field private p:Z

.field private final q:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    sput-object v0, Lcom/applovin/impl/e6;->r:Ljava/util/concurrent/ExecutorService;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Lcom/applovin/impl/sdk/k;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/applovin/impl/e6;->j:Ljava/util/Map;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    const/4 v1, 0x5

    .line 14
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lcom/applovin/impl/e6;->m:Ljava/util/List;

    .line 18
    .line 19
    new-instance v0, Ljava/lang/Object;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lcom/applovin/impl/e6;->n:Ljava/lang/Object;

    .line 25
    .line 26
    iput-object p1, p0, Lcom/applovin/impl/e6;->a:Lcom/applovin/impl/sdk/k;

    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/applovin/impl/sdk/k;->O()Lcom/applovin/impl/sdk/o;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, Lcom/applovin/impl/e6;->b:Lcom/applovin/impl/sdk/o;

    .line 33
    .line 34
    sget-object v0, Lcom/applovin/impl/y4;->T:Lcom/applovin/impl/y4;

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Lcom/applovin/impl/sdk/k;->a(Lcom/applovin/impl/y4;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Ljava/lang/Boolean;

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iput-boolean v0, p0, Lcom/applovin/impl/e6;->p:Z

    .line 47
    .line 48
    sget-object v0, Lcom/applovin/impl/y4;->T6:Lcom/applovin/impl/y4;

    .line 49
    .line 50
    invoke-virtual {p1, v0}, Lcom/applovin/impl/sdk/k;->a(Lcom/applovin/impl/y4;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, Ljava/lang/Boolean;

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iput-boolean v0, p0, Lcom/applovin/impl/e6;->q:Z

    .line 61
    .line 62
    sget-object v0, Lcom/applovin/impl/y4;->O:Lcom/applovin/impl/y4;

    .line 63
    .line 64
    invoke-virtual {p1, v0}, Lcom/applovin/impl/sdk/k;->a(Lcom/applovin/impl/y4;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    check-cast v0, Ljava/lang/Integer;

    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    const-string v1, "auxiliary_operations"

    .line 75
    .line 76
    invoke-direct {p0, v1, v0}, Lcom/applovin/impl/e6;->b(Ljava/lang/String;I)Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    iput-object v0, p0, Lcom/applovin/impl/e6;->c:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 81
    .line 82
    sget-object v0, Lcom/applovin/impl/y4;->N:Lcom/applovin/impl/y4;

    .line 83
    .line 84
    invoke-virtual {p1, v0}, Lcom/applovin/impl/sdk/k;->a(Lcom/applovin/impl/y4;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    check-cast v0, Ljava/lang/Integer;

    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    const-string v1, "shared_thread_pool"

    .line 95
    .line 96
    invoke-direct {p0, v1, v0}, Lcom/applovin/impl/e6;->b(Ljava/lang/String;I)Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    iput-object v0, p0, Lcom/applovin/impl/e6;->d:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 101
    .line 102
    sget-object v0, Lcom/applovin/impl/y4;->U:Lcom/applovin/impl/y4;

    .line 103
    .line 104
    invoke-virtual {p1, v0}, Lcom/applovin/impl/sdk/k;->a(Lcom/applovin/impl/y4;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    check-cast v0, Ljava/lang/Integer;

    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    const-string v1, "core"

    .line 115
    .line 116
    invoke-direct {p0, v1, v0}, Lcom/applovin/impl/e6;->b(Ljava/lang/String;I)Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    iput-object v0, p0, Lcom/applovin/impl/e6;->e:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 121
    .line 122
    sget-object v0, Lcom/applovin/impl/y4;->V:Lcom/applovin/impl/y4;

    .line 123
    .line 124
    invoke-virtual {p1, v0}, Lcom/applovin/impl/sdk/k;->a(Lcom/applovin/impl/y4;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    check-cast v0, Ljava/lang/Integer;

    .line 129
    .line 130
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    const-string v1, "caching"

    .line 135
    .line 136
    invoke-direct {p0, v1, v0}, Lcom/applovin/impl/e6;->b(Ljava/lang/String;I)Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    iput-object v0, p0, Lcom/applovin/impl/e6;->g:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 141
    .line 142
    sget-object v0, Lcom/applovin/impl/y4;->W:Lcom/applovin/impl/y4;

    .line 143
    .line 144
    invoke-virtual {p1, v0}, Lcom/applovin/impl/sdk/k;->a(Lcom/applovin/impl/y4;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    check-cast v0, Ljava/lang/Integer;

    .line 149
    .line 150
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    const-string v1, "mediation"

    .line 155
    .line 156
    invoke-direct {p0, v1, v0}, Lcom/applovin/impl/e6;->b(Ljava/lang/String;I)Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    iput-object v0, p0, Lcom/applovin/impl/e6;->h:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 161
    .line 162
    sget-object v0, Lcom/applovin/impl/y4;->X:Lcom/applovin/impl/y4;

    .line 163
    .line 164
    invoke-virtual {p1, v0}, Lcom/applovin/impl/sdk/k;->a(Lcom/applovin/impl/y4;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    check-cast v0, Ljava/lang/Integer;

    .line 169
    .line 170
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    const-string v1, "timeout"

    .line 175
    .line 176
    invoke-direct {p0, v1, v0}, Lcom/applovin/impl/e6;->b(Ljava/lang/String;I)Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    iput-object v0, p0, Lcom/applovin/impl/e6;->f:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 181
    .line 182
    sget-object v0, Lcom/applovin/impl/y4;->Y:Lcom/applovin/impl/y4;

    .line 183
    .line 184
    invoke-virtual {p1, v0}, Lcom/applovin/impl/sdk/k;->a(Lcom/applovin/impl/y4;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    check-cast v0, Ljava/lang/Integer;

    .line 189
    .line 190
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 191
    .line 192
    .line 193
    move-result v0

    .line 194
    const-string v1, "other"

    .line 195
    .line 196
    invoke-direct {p0, v1, v0}, Lcom/applovin/impl/e6;->b(Ljava/lang/String;I)Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    iput-object v0, p0, Lcom/applovin/impl/e6;->i:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 201
    .line 202
    sget-object v0, Lcom/applovin/impl/y4;->N0:Lcom/applovin/impl/y4;

    .line 203
    .line 204
    invoke-virtual {p1, v0}, Lcom/applovin/impl/sdk/k;->a(Lcom/applovin/impl/y4;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    check-cast v0, Ljava/lang/Boolean;

    .line 209
    .line 210
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 211
    .line 212
    .line 213
    move-result v0

    .line 214
    if-eqz v0, :cond_0

    .line 215
    .line 216
    sget-object v0, Lcom/applovin/impl/y4;->O0:Lcom/applovin/impl/y4;

    .line 217
    .line 218
    invoke-virtual {p1, v0}, Lcom/applovin/impl/sdk/k;->a(Lcom/applovin/impl/y4;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    check-cast v0, Ljava/lang/Boolean;

    .line 223
    .line 224
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    if-eqz v0, :cond_0

    .line 229
    .line 230
    sget-object v0, Lcom/applovin/impl/y4;->P0:Lcom/applovin/impl/y4;

    .line 231
    .line 232
    invoke-virtual {p1, v0}, Lcom/applovin/impl/sdk/k;->a(Lcom/applovin/impl/y4;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    check-cast v0, Ljava/lang/Integer;

    .line 237
    .line 238
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 239
    .line 240
    .line 241
    move-result v0

    .line 242
    new-instance v1, Lcom/applovin/impl/e6$d;

    .line 243
    .line 244
    const-string v2, "com.applovin.sdk.caching.shared"

    .line 245
    .line 246
    invoke-direct {v1, p0, v2}, Lcom/applovin/impl/e6$d;-><init>(Lcom/applovin/impl/e6;Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    invoke-static {v0, v1}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    iput-object v0, p0, Lcom/applovin/impl/e6;->k:Ljava/util/concurrent/ExecutorService;

    .line 254
    .line 255
    sget-object v0, Lcom/applovin/impl/y4;->Q0:Lcom/applovin/impl/y4;

    .line 256
    .line 257
    invoke-virtual {p1, v0}, Lcom/applovin/impl/sdk/k;->a(Lcom/applovin/impl/y4;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object p1

    .line 261
    check-cast p1, Ljava/lang/Integer;

    .line 262
    .line 263
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 264
    .line 265
    .line 266
    move-result p1

    .line 267
    new-instance v0, Lcom/applovin/impl/e6$d;

    .line 268
    .line 269
    const-string v1, "com.applovin.sdk.caching.html.shared"

    .line 270
    .line 271
    invoke-direct {v0, p0, v1}, Lcom/applovin/impl/e6$d;-><init>(Lcom/applovin/impl/e6;Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    invoke-static {p1, v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 275
    .line 276
    .line 277
    move-result-object p1

    .line 278
    iput-object p1, p0, Lcom/applovin/impl/e6;->l:Ljava/util/concurrent/ExecutorService;

    .line 279
    .line 280
    :cond_0
    return-void
.end method

.method public static synthetic a(Lcom/applovin/impl/e6;)Lcom/applovin/impl/sdk/k;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/applovin/impl/e6;->a:Lcom/applovin/impl/sdk/k;

    return-object p0
.end method

.method private a(Lcom/applovin/impl/e6$e;)Ljava/util/concurrent/ScheduledThreadPoolExecutor;
    .locals 1

    .line 46
    sget-object v0, Lcom/applovin/impl/e6$a;->a:[I

    iget-object p1, p1, Lcom/applovin/impl/e6$e;->e:Lcom/applovin/impl/e6$b;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    .line 47
    iget-object p1, p0, Lcom/applovin/impl/e6;->i:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    return-object p1

    .line 48
    :cond_0
    iget-object p1, p0, Lcom/applovin/impl/e6;->f:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    return-object p1

    .line 49
    :cond_1
    iget-object p1, p0, Lcom/applovin/impl/e6;->h:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    return-object p1

    .line 50
    :cond_2
    iget-object p1, p0, Lcom/applovin/impl/e6;->g:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    return-object p1

    .line 51
    :cond_3
    iget-object p1, p0, Lcom/applovin/impl/e6;->e:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    return-object p1
.end method

.method private a(Lcom/applovin/impl/e6$e;JZ)V
    .locals 3

    .line 41
    iget-boolean v0, p0, Lcom/applovin/impl/e6;->p:Z

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lcom/applovin/impl/e6;->a(Lcom/applovin/impl/e6$e;)Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/applovin/impl/e6;->d:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    :goto_0
    const-wide/16 v1, 0x0

    cmp-long v1, p2, v1

    if-lez v1, :cond_2

    if-eqz p4, :cond_1

    .line 42
    iget-object p4, p0, Lcom/applovin/impl/e6;->a:Lcom/applovin/impl/sdk/k;

    new-instance v1, Lcom/applovin/impl/F;

    const/4 v2, 0x1

    invoke-direct {v1, v2, v0, p1}, Lcom/applovin/impl/F;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p2, p3, p4, v1}, Lcom/applovin/impl/g0;->a(JLcom/applovin/impl/sdk/k;Ljava/lang/Runnable;)Lcom/applovin/impl/g0;

    return-void

    .line 43
    :cond_1
    sget-object p4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, p1, p2, p3, p4}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    return-void

    .line 44
    :cond_2
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method public static synthetic a(Lcom/applovin/impl/e6;Ljava/lang/String;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/applovin/impl/e6;->a(Ljava/lang/String;Ljava/lang/Runnable;)V

    return-void
.end method

.method private synthetic a(Ljava/lang/String;Ljava/lang/Runnable;)V
    .locals 2

    .line 26
    new-instance v0, Lcom/applovin/impl/s6;

    iget-object v1, p0, Lcom/applovin/impl/e6;->a:Lcom/applovin/impl/sdk/k;

    invoke-direct {v0, v1, p1, p2}, Lcom/applovin/impl/s6;-><init>(Lcom/applovin/impl/sdk/k;Ljava/lang/String;Ljava/lang/Runnable;)V

    invoke-virtual {p0, v0}, Lcom/applovin/impl/e6;->a(Lcom/applovin/impl/j5;)V

    return-void
.end method

.method private static synthetic a(Ljava/util/concurrent/ScheduledThreadPoolExecutor;Lcom/applovin/impl/e6$e;)V
    .locals 0

    .line 45
    invoke-virtual {p0, p1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic b(Lcom/applovin/impl/e6;)Lcom/applovin/impl/sdk/o;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/applovin/impl/e6;->b:Lcom/applovin/impl/sdk/o;

    return-object p0
.end method

.method private b(Ljava/lang/String;I)Ljava/util/concurrent/ScheduledThreadPoolExecutor;
    .locals 2

    .line 16
    new-instance v0, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    new-instance v1, Lcom/applovin/impl/e6$d;

    invoke-direct {v1, p0, p1}, Lcom/applovin/impl/e6$d;-><init>(Lcom/applovin/impl/e6;Ljava/lang/String;)V

    invoke-direct {v0, p2, v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    return-object v0
.end method

.method public static synthetic b(Ljava/util/concurrent/ScheduledThreadPoolExecutor;Lcom/applovin/impl/e6$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/applovin/impl/e6;->a(Ljava/util/concurrent/ScheduledThreadPoolExecutor;Lcom/applovin/impl/e6$e;)V

    return-void
.end method

.method private b(Lcom/applovin/impl/e6$e;)Z
    .locals 3

    .line 9
    iget-object v0, p1, Lcom/applovin/impl/e6$e;->d:Lcom/applovin/impl/j5;

    invoke-virtual {v0}, Lcom/applovin/impl/j5;->d()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/applovin/impl/e6;->n:Ljava/lang/Object;

    monitor-enter v0

    .line 11
    :try_start_0
    iget-boolean v2, p0, Lcom/applovin/impl/e6;->o:Z

    if-eqz v2, :cond_1

    .line 12
    monitor-exit v0

    return v1

    :catchall_0
    move-exception p1

    goto :goto_0

    .line 13
    :cond_1
    iget-object v1, p0, Lcom/applovin/impl/e6;->m:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    .line 14
    monitor-exit v0

    return p1

    .line 15
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method


# virtual methods
.method public a(Ljava/util/List;Ljava/util/concurrent/ExecutorService;)Ljava/util/List;
    .locals 4

    .line 53
    const-string v0, "TaskManager"

    const-string v1, "Awaiting "

    :try_start_0
    invoke-static {}, Lcom/applovin/impl/sdk/o;->a()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/applovin/impl/e6;->b:Lcom/applovin/impl/sdk/o;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " tasks..."

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lcom/applovin/impl/sdk/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 54
    :cond_0
    :goto_0
    invoke-interface {p2, p1}, Ljava/util/concurrent/ExecutorService;->invokeAll(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    .line 55
    :goto_1
    invoke-static {}, Lcom/applovin/impl/sdk/o;->a()Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p2, p0, Lcom/applovin/impl/e6;->b:Lcom/applovin/impl/sdk/o;

    const-string v1, "Awaiting tasks were interrupted"

    invoke-virtual {p2, v0, v1, p1}, Lcom/applovin/impl/sdk/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public a(Ljava/lang/String;)Ljava/util/concurrent/Executor;
    .locals 1

    .line 25
    new-instance v0, Lcom/applovin/impl/L;

    invoke-direct {v0, p0, p1}, Lcom/applovin/impl/L;-><init>(Lcom/applovin/impl/e6;Ljava/lang/String;)V

    return-object v0
.end method

.method public a()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/applovin/impl/e6;->k:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method public a(Ljava/lang/String;I)Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 52
    new-instance v0, Lcom/applovin/impl/e6$d;

    invoke-direct {v0, p0, p1}, Lcom/applovin/impl/e6$d;-><init>(Lcom/applovin/impl/e6;Ljava/lang/String;)V

    invoke-static {p2, v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    return-object p1
.end method

.method public a(Lcom/applovin/impl/j5;)V
    .locals 4

    if-eqz p1, :cond_4

    .line 27
    iget-boolean v0, p0, Lcom/applovin/impl/e6;->p:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/applovin/impl/e6;->e:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/applovin/impl/e6;->d:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 28
    :goto_0
    :try_start_0
    invoke-static {}, Lcom/applovin/impl/o7;->h()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 29
    new-instance v1, Lcom/applovin/impl/e6$e;

    iget-object v2, p0, Lcom/applovin/impl/e6;->a:Lcom/applovin/impl/sdk/k;

    sget-object v3, Lcom/applovin/impl/e6$b;->a:Lcom/applovin/impl/e6$b;

    invoke-direct {v1, v2, p1, v3}, Lcom/applovin/impl/e6$e;-><init>(Lcom/applovin/impl/sdk/k;Lcom/applovin/impl/j5;Lcom/applovin/impl/e6$b;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void

    :catchall_0
    move-exception v0

    goto :goto_1

    .line 30
    :cond_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iget-object v1, p0, Lcom/applovin/impl/e6;->a:Lcom/applovin/impl/sdk/k;

    sget-object v2, Lcom/applovin/impl/y4;->w:Lcom/applovin/impl/y4;

    invoke-virtual {v1, v2}, Lcom/applovin/impl/sdk/k;->a(Lcom/applovin/impl/y4;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {p1, v0, v1, v2}, Lcom/applovin/impl/j5;->b(Ljava/lang/Thread;J)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    .line 31
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    if-eqz v0, :cond_3

    const/4 v1, 0x0

    .line 32
    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    .line 33
    :goto_1
    invoke-static {}, Lcom/applovin/impl/sdk/o;->a()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/applovin/impl/e6;->b:Lcom/applovin/impl/sdk/o;

    invoke-virtual {p1}, Lcom/applovin/impl/j5;->c()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Task failed execution"

    invoke-virtual {v1, v2, v3, v0}, Lcom/applovin/impl/sdk/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 34
    :cond_2
    invoke-virtual {p1, v0}, Lcom/applovin/impl/j5;->a(Ljava/lang/Throwable;)V

    :cond_3
    return-void

    .line 35
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "No task specified"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Lcom/applovin/impl/j5;Lcom/applovin/impl/e6$b;)V
    .locals 2

    const-wide/16 v0, 0x0

    .line 4
    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/applovin/impl/e6;->a(Lcom/applovin/impl/j5;Lcom/applovin/impl/e6$b;J)V

    return-void
.end method

.method public a(Lcom/applovin/impl/j5;Lcom/applovin/impl/e6$b;J)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-wide v3, p3

    .line 5
    invoke-virtual/range {v0 .. v5}, Lcom/applovin/impl/e6;->a(Lcom/applovin/impl/j5;Lcom/applovin/impl/e6$b;JZ)V

    return-void
.end method

.method public a(Lcom/applovin/impl/j5;Lcom/applovin/impl/e6$b;JZ)V
    .locals 7

    if-eqz p1, :cond_4

    const-wide/16 v0, 0x0

    cmp-long v0, p3, v0

    if-ltz v0, :cond_3

    .line 6
    iget-boolean v0, p0, Lcom/applovin/impl/e6;->q:Z

    if-eqz v0, :cond_0

    .line 7
    new-instance v1, Lcom/applovin/impl/e6$c;

    iget-object v2, p0, Lcom/applovin/impl/e6;->a:Lcom/applovin/impl/sdk/k;

    move-object v3, p1

    move-object v4, p2

    move-wide v5, p3

    invoke-direct/range {v1 .. v6}, Lcom/applovin/impl/e6$c;-><init>(Lcom/applovin/impl/sdk/k;Lcom/applovin/impl/j5;Lcom/applovin/impl/e6$b;J)V

    goto :goto_0

    :cond_0
    move-object v3, p1

    move-object v4, p2

    move-wide v5, p3

    .line 8
    new-instance v1, Lcom/applovin/impl/e6$e;

    iget-object p1, p0, Lcom/applovin/impl/e6;->a:Lcom/applovin/impl/sdk/k;

    invoke-direct {v1, p1, v3, v4}, Lcom/applovin/impl/e6$e;-><init>(Lcom/applovin/impl/sdk/k;Lcom/applovin/impl/j5;Lcom/applovin/impl/e6$b;)V

    .line 9
    :goto_0
    invoke-direct {p0, v1}, Lcom/applovin/impl/e6;->b(Lcom/applovin/impl/e6$e;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 10
    invoke-direct {p0, v1, v5, v6, p5}, Lcom/applovin/impl/e6;->a(Lcom/applovin/impl/e6$e;JZ)V

    return-void

    .line 11
    :cond_1
    invoke-static {}, Lcom/applovin/impl/sdk/o;->a()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/applovin/impl/e6;->b:Lcom/applovin/impl/sdk/o;

    invoke-virtual {v3}, Lcom/applovin/impl/j5;->c()Ljava/lang/String;

    move-result-object p2

    const-string p3, "Task execution delayed until after init"

    invoke-virtual {p1, p2, p3}, Lcom/applovin/impl/sdk/o;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-void

    :cond_3
    move-wide v5, p3

    .line 12
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid delay (millis) specified: "

    .line 13
    invoke-static {v5, v6, p2}, LA7/p0;->k(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 14
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 15
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "No task specified"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Lcom/applovin/impl/j5;Lcom/applovin/impl/k3;)V
    .locals 3

    .line 36
    invoke-virtual {p2}, Lcom/applovin/impl/k3;->b()Ljava/lang/String;

    move-result-object p2

    .line 37
    iget-object v0, p0, Lcom/applovin/impl/e6;->j:Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 38
    invoke-direct {p0, p2, v0}, Lcom/applovin/impl/e6;->b(Ljava/lang/String;I)Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    move-result-object v0

    .line 39
    iget-object v1, p0, Lcom/applovin/impl/e6;->j:Ljava/util/Map;

    invoke-interface {v1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    :cond_0
    new-instance p2, Lcom/applovin/impl/e6$e;

    iget-object v1, p0, Lcom/applovin/impl/e6;->a:Lcom/applovin/impl/sdk/k;

    sget-object v2, Lcom/applovin/impl/e6$b;->c:Lcom/applovin/impl/e6$b;

    invoke-direct {p2, v1, p1, v2}, Lcom/applovin/impl/e6$e;-><init>(Lcom/applovin/impl/sdk/k;Lcom/applovin/impl/j5;Lcom/applovin/impl/e6$b;)V

    invoke-virtual {v0, p2}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method public a(Ljava/lang/Runnable;Lcom/applovin/impl/e6$b;)V
    .locals 4

    .line 20
    iget-boolean v0, p0, Lcom/applovin/impl/e6;->p:Z

    if-eqz v0, :cond_0

    .line 21
    new-instance v0, Lcom/applovin/impl/e6$e;

    iget-object v1, p0, Lcom/applovin/impl/e6;->a:Lcom/applovin/impl/sdk/k;

    new-instance v2, Lcom/applovin/impl/s6;

    const-string v3, "auxiliaryOperation"

    invoke-direct {v2, v1, v3, p1}, Lcom/applovin/impl/s6;-><init>(Lcom/applovin/impl/sdk/k;Ljava/lang/String;Ljava/lang/Runnable;)V

    invoke-direct {v0, v1, v2, p2}, Lcom/applovin/impl/e6$e;-><init>(Lcom/applovin/impl/sdk/k;Lcom/applovin/impl/j5;Lcom/applovin/impl/e6$b;)V

    .line 22
    invoke-direct {p0, v0}, Lcom/applovin/impl/e6;->a(Lcom/applovin/impl/e6$e;)Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    move-result-object p1

    .line 23
    invoke-virtual {p1, v0}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void

    .line 24
    :cond_0
    iget-object p2, p0, Lcom/applovin/impl/e6;->c:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    invoke-virtual {p2, p1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method public b()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 8
    iget-boolean v0, p0, Lcom/applovin/impl/e6;->p:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/applovin/impl/e6;->i:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/applovin/impl/e6;->c:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    return-object v0
.end method

.method public b(Lcom/applovin/impl/j5;Lcom/applovin/impl/e6$b;J)Ljava/util/concurrent/ScheduledFuture;
    .locals 2

    .line 3
    iget-boolean v0, p0, Lcom/applovin/impl/e6;->p:Z

    if-eqz v0, :cond_0

    .line 4
    new-instance v0, Lcom/applovin/impl/e6$e;

    iget-object v1, p0, Lcom/applovin/impl/e6;->a:Lcom/applovin/impl/sdk/k;

    invoke-direct {v0, v1, p1, p2}, Lcom/applovin/impl/e6$e;-><init>(Lcom/applovin/impl/sdk/k;Lcom/applovin/impl/j5;Lcom/applovin/impl/e6$b;)V

    .line 5
    invoke-direct {p0, v0}, Lcom/applovin/impl/e6;->a(Lcom/applovin/impl/e6$e;)Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    move-result-object p2

    .line 6
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p2, p1, p3, p4, v0}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    return-object p1

    .line 7
    :cond_0
    iget-object p2, p0, Lcom/applovin/impl/e6;->c:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p2, p1, p3, p4, v0}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    return-object p1
.end method

.method public c()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/applovin/impl/e6;->p:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/applovin/impl/e6;->g:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    sget-object v0, Lcom/applovin/impl/e6;->r:Ljava/util/concurrent/ExecutorService;

    .line 9
    .line 10
    return-object v0
.end method

.method public d()Ljava/util/concurrent/Executor;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/applovin/impl/e6;->p:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/applovin/impl/e6;->e:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/applovin/impl/e6;->d:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 9
    .line 10
    return-object v0
.end method

.method public e()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/applovin/impl/e6;->l:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    return-object v0
.end method

.method public f()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/applovin/impl/e6;->a()Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/applovin/impl/e6;->e()Ljava/util/concurrent/ExecutorService;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
.end method

.method public g()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/applovin/impl/e6;->o:Z

    .line 2
    .line 3
    return v0
.end method

.method public h()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/applovin/impl/e6;->n:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    :try_start_0
    iput-boolean v1, p0, Lcom/applovin/impl/e6;->o:Z

    .line 6
    .line 7
    iget-object v1, p0, Lcom/applovin/impl/e6;->m:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Lcom/applovin/impl/e6$e;

    .line 24
    .line 25
    iget-boolean v3, p0, Lcom/applovin/impl/e6;->q:Z

    .line 26
    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    check-cast v2, Lcom/applovin/impl/e6$c;

    .line 30
    .line 31
    iget-object v3, v2, Lcom/applovin/impl/e6$e;->d:Lcom/applovin/impl/j5;

    .line 32
    .line 33
    iget-object v4, v2, Lcom/applovin/impl/e6$e;->e:Lcom/applovin/impl/e6$b;

    .line 34
    .line 35
    invoke-static {v2}, Lcom/applovin/impl/e6$c;->a(Lcom/applovin/impl/e6$c;)J

    .line 36
    .line 37
    .line 38
    move-result-wide v5

    .line 39
    invoke-virtual {p0, v3, v4, v5, v6}, Lcom/applovin/impl/e6;->a(Lcom/applovin/impl/j5;Lcom/applovin/impl/e6$b;J)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception v1

    .line 44
    goto :goto_1

    .line 45
    :cond_0
    iget-object v3, v2, Lcom/applovin/impl/e6$e;->d:Lcom/applovin/impl/j5;

    .line 46
    .line 47
    iget-object v2, v2, Lcom/applovin/impl/e6$e;->e:Lcom/applovin/impl/e6$b;

    .line 48
    .line 49
    invoke-virtual {p0, v3, v2}, Lcom/applovin/impl/e6;->a(Lcom/applovin/impl/j5;Lcom/applovin/impl/e6$b;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    iget-object v1, p0, Lcom/applovin/impl/e6;->m:Ljava/util/List;

    .line 54
    .line 55
    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 56
    .line 57
    .line 58
    monitor-exit v0

    .line 59
    return-void

    .line 60
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    throw v1
.end method

.method public i()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/applovin/impl/e6;->n:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :try_start_0
    iput-boolean v1, p0, Lcom/applovin/impl/e6;->o:Z

    .line 6
    .line 7
    monitor-exit v0

    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception v1

    .line 10
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    throw v1
.end method
