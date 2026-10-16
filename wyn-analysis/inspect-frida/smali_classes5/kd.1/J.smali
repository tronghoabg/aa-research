.class public final synthetic Lkd/J;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luc/b;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lkd/r;


# direct methods
.method public synthetic constructor <init>(Lkd/r;I)V
    .locals 0

    .line 1
    iput p2, p0, Lkd/J;->a:I

    iput-object p1, p0, Lkd/J;->b:Lkd/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Lba/a;)V
    .locals 12

    .line 1
    const-string v0, ", Stacktrace: "

    .line 2
    .line 3
    const-string v1, "Cause: "

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x3

    .line 7
    const/4 v4, 0x0

    .line 8
    const/16 v5, 0x18

    .line 9
    .line 10
    const-string v6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 11
    .line 12
    iget-object v7, p0, Lkd/J;->b:Lkd/r;

    .line 13
    .line 14
    const/4 v8, 0x1

    .line 15
    const/4 v9, 0x0

    .line 16
    iget v10, p0, Lkd/J;->a:I

    .line 17
    .line 18
    packed-switch v10, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    invoke-static {p1, v6}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    check-cast p1, Ljava/util/List;

    .line 25
    .line 26
    invoke-interface {p1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    const-string v10, "null cannot be cast to non-null type android.webkit.WebViewClient"

    .line 31
    .line 32
    invoke-static {v6, v10}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    check-cast v6, Landroid/webkit/WebViewClient;

    .line 36
    .line 37
    invoke-interface {p1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    const-string v10, "null cannot be cast to non-null type kotlin.Boolean"

    .line 42
    .line 43
    invoke-static {p1, v10}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    check-cast p1, Ljava/lang/Boolean;

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    :try_start_0
    instance-of v10, v6, Lkd/T;

    .line 53
    .line 54
    if-eqz v10, :cond_0

    .line 55
    .line 56
    check-cast v6, Lkd/T;

    .line 57
    .line 58
    iput-boolean p1, v6, Lkd/T;->b:Z

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_0
    iget-object v7, v7, Lkd/r;->a:LC8/i;

    .line 62
    .line 63
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 67
    .line 68
    if-lt v7, v5, :cond_1

    .line 69
    .line 70
    move v5, v8

    .line 71
    goto :goto_0

    .line 72
    :cond_1
    move v5, v9

    .line 73
    :goto_0
    if-eqz v5, :cond_2

    .line 74
    .line 75
    instance-of v5, v6, Lkd/W;

    .line 76
    .line 77
    if-eqz v5, :cond_2

    .line 78
    .line 79
    check-cast v6, Lkd/W;

    .line 80
    .line 81
    iput-boolean p1, v6, Lkd/W;->b:Z

    .line 82
    .line 83
    :goto_1
    invoke-static {v4}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    goto :goto_3

    .line 88
    :catchall_0
    move-exception p1

    .line 89
    goto :goto_2

    .line 90
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 91
    .line 92
    const-string v4, "This WebViewClient doesn\'t support setting the returnValueForShouldOverrideUrlLoading."

    .line 93
    .line 94
    invoke-direct {p1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 98
    :goto_2
    instance-of v4, p1, Lkd/a;

    .line 99
    .line 100
    if-eqz v4, :cond_3

    .line 101
    .line 102
    check-cast p1, Lkd/a;

    .line 103
    .line 104
    iget-object v0, p1, Lkd/a;->b:Ljava/lang/String;

    .line 105
    .line 106
    iget-object v1, p1, Lkd/a;->c:Ljava/lang/String;

    .line 107
    .line 108
    iget-object p1, p1, Lkd/a;->a:Ljava/lang/String;

    .line 109
    .line 110
    new-array v3, v3, [Ljava/lang/Object;

    .line 111
    .line 112
    aput-object p1, v3, v9

    .line 113
    .line 114
    aput-object v0, v3, v8

    .line 115
    .line 116
    aput-object v1, v3, v2

    .line 117
    .line 118
    invoke-static {v3}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    goto :goto_3

    .line 123
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    invoke-static {v1, v0, p1, v4}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    filled-new-array {v2, v3, p1}, [Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    invoke-static {p1}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    :goto_3
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    return-void

    .line 159
    :pswitch_0
    invoke-static {p1, v6}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    check-cast p1, Ljava/util/List;

    .line 163
    .line 164
    invoke-interface {p1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    const-string v6, "null cannot be cast to non-null type kotlin.Long"

    .line 169
    .line 170
    invoke-static {p1, v6}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    check-cast p1, Ljava/lang/Long;

    .line 174
    .line 175
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 176
    .line 177
    .line 178
    move-result-wide v10

    .line 179
    :try_start_1
    iget-object p1, v7, Lkd/r;->a:LC8/i;

    .line 180
    .line 181
    iget-object p1, p1, LC8/i;->d:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast p1, Lkd/d;

    .line 184
    .line 185
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 186
    .line 187
    if-lt v6, v5, :cond_4

    .line 188
    .line 189
    move v5, v8

    .line 190
    goto :goto_4

    .line 191
    :cond_4
    move v5, v9

    .line 192
    :goto_4
    if-eqz v5, :cond_5

    .line 193
    .line 194
    new-instance v5, Lkd/W;

    .line 195
    .line 196
    invoke-direct {v5, v7}, Lkd/W;-><init>(Lkd/r;)V

    .line 197
    .line 198
    .line 199
    goto :goto_5

    .line 200
    :cond_5
    new-instance v5, Lkd/T;

    .line 201
    .line 202
    invoke-direct {v5, v7}, Lkd/T;-><init>(Lkd/r;)V

    .line 203
    .line 204
    .line 205
    :goto_5
    invoke-virtual {p1, v10, v11, v5}, Lkd/d;->a(JLjava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    invoke-static {v4}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 209
    .line 210
    .line 211
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 212
    goto :goto_6

    .line 213
    :catchall_1
    move-exception p1

    .line 214
    instance-of v4, p1, Lkd/a;

    .line 215
    .line 216
    if-eqz v4, :cond_6

    .line 217
    .line 218
    check-cast p1, Lkd/a;

    .line 219
    .line 220
    iget-object v0, p1, Lkd/a;->b:Ljava/lang/String;

    .line 221
    .line 222
    iget-object v1, p1, Lkd/a;->c:Ljava/lang/String;

    .line 223
    .line 224
    iget-object p1, p1, Lkd/a;->a:Ljava/lang/String;

    .line 225
    .line 226
    new-array v3, v3, [Ljava/lang/Object;

    .line 227
    .line 228
    aput-object p1, v3, v9

    .line 229
    .line 230
    aput-object v0, v3, v8

    .line 231
    .line 232
    aput-object v1, v3, v2

    .line 233
    .line 234
    invoke-static {v3}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    goto :goto_6

    .line 239
    :cond_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    move-result-object v2

    .line 243
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v3

    .line 251
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 252
    .line 253
    .line 254
    move-result-object v4

    .line 255
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object p1

    .line 259
    invoke-static {v1, v0, p1, v4}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object p1

    .line 263
    filled-new-array {v2, v3, p1}, [Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    invoke-static {p1}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 268
    .line 269
    .line 270
    move-result-object p1

    .line 271
    :goto_6
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    return-void

    .line 275
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
