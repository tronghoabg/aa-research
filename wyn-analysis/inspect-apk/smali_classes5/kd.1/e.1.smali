.class public final synthetic Lkd/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luc/b;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lkd/d;


# direct methods
.method public synthetic constructor <init>(Lkd/d;I)V
    .locals 0

    .line 1
    iput p2, p0, Lkd/e;->a:I

    iput-object p1, p0, Lkd/e;->b:Lkd/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Lba/a;)V
    .locals 10

    .line 1
    const-string v0, ", Stacktrace: "

    .line 2
    .line 3
    const-string v1, "Cause: "

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x3

    .line 8
    const/4 v5, 0x0

    .line 9
    iget-object v6, p0, Lkd/e;->b:Lkd/d;

    .line 10
    .line 11
    const/4 v7, 0x0

    .line 12
    iget v8, p0, Lkd/e;->a:I

    .line 13
    .line 14
    packed-switch v8, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    :try_start_0
    iget-object p1, v6, Lkd/d;->b:Ljava/util/WeakHashMap;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/util/WeakHashMap;->clear()V

    .line 20
    .line 21
    .line 22
    iget-object p1, v6, Lkd/d;->c:Ljava/util/HashMap;

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/util/HashMap;->clear()V

    .line 25
    .line 26
    .line 27
    iget-object p1, v6, Lkd/d;->d:Ljava/util/HashMap;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/util/HashMap;->clear()V

    .line 30
    .line 31
    .line 32
    iget-object p1, v6, Lkd/d;->f:Ljava/util/HashMap;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/util/HashMap;->clear()V

    .line 35
    .line 36
    .line 37
    invoke-static {v5}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception p1

    .line 43
    instance-of v5, p1, Lkd/a;

    .line 44
    .line 45
    if-eqz v5, :cond_0

    .line 46
    .line 47
    check-cast p1, Lkd/a;

    .line 48
    .line 49
    iget-object v0, p1, Lkd/a;->b:Ljava/lang/String;

    .line 50
    .line 51
    iget-object v1, p1, Lkd/a;->c:Ljava/lang/String;

    .line 52
    .line 53
    iget-object p1, p1, Lkd/a;->a:Ljava/lang/String;

    .line 54
    .line 55
    new-array v4, v4, [Ljava/lang/Object;

    .line 56
    .line 57
    aput-object p1, v4, v7

    .line 58
    .line 59
    aput-object v0, v4, v3

    .line 60
    .line 61
    aput-object v1, v4, v2

    .line 62
    .line 63
    invoke-static {v4}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    goto :goto_0

    .line 68
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-static {v1, v0, p1, v4}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    filled-new-array {v2, v3, p1}, [Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-static {p1}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    :goto_0
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :pswitch_0
    const-string v8, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 105
    .line 106
    invoke-static {p1, v8}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    check-cast p1, Ljava/util/List;

    .line 110
    .line 111
    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    const-string v8, "null cannot be cast to non-null type kotlin.Long"

    .line 116
    .line 117
    invoke-static {p1, v8}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    check-cast p1, Ljava/lang/Long;

    .line 121
    .line 122
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 123
    .line 124
    .line 125
    move-result-wide v8

    .line 126
    :try_start_1
    invoke-virtual {v6}, Lkd/d;->f()V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v6, v8, v9}, Lkd/d;->e(J)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v8

    .line 133
    instance-of v9, v8, Lkd/a0;

    .line 134
    .line 135
    if-eqz v9, :cond_1

    .line 136
    .line 137
    check-cast v8, Lkd/a0;

    .line 138
    .line 139
    invoke-virtual {v8}, Landroid/webkit/WebView;->destroy()V

    .line 140
    .line 141
    .line 142
    :cond_1
    iget-object v6, v6, Lkd/d;->d:Ljava/util/HashMap;

    .line 143
    .line 144
    invoke-virtual {v6, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    invoke-static {v5}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 148
    .line 149
    .line 150
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 151
    goto :goto_1

    .line 152
    :catchall_1
    move-exception p1

    .line 153
    instance-of v5, p1, Lkd/a;

    .line 154
    .line 155
    if-eqz v5, :cond_2

    .line 156
    .line 157
    check-cast p1, Lkd/a;

    .line 158
    .line 159
    iget-object v0, p1, Lkd/a;->b:Ljava/lang/String;

    .line 160
    .line 161
    iget-object v1, p1, Lkd/a;->c:Ljava/lang/String;

    .line 162
    .line 163
    iget-object p1, p1, Lkd/a;->a:Ljava/lang/String;

    .line 164
    .line 165
    new-array v4, v4, [Ljava/lang/Object;

    .line 166
    .line 167
    aput-object p1, v4, v7

    .line 168
    .line 169
    aput-object v0, v4, v3

    .line 170
    .line 171
    aput-object v1, v4, v2

    .line 172
    .line 173
    invoke-static {v4}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    goto :goto_1

    .line 178
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 191
    .line 192
    .line 193
    move-result-object v4

    .line 194
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    invoke-static {v1, v0, p1, v4}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    filled-new-array {v2, v3, p1}, [Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    invoke-static {p1}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    :goto_1
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    return-void

    .line 214
    nop

    .line 215
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
