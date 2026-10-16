.class public final synthetic LJ9/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLe/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LJ9/o;


# direct methods
.method public synthetic constructor <init>(LJ9/o;I)V
    .locals 0

    .line 1
    iput p2, p0, LJ9/n;->a:I

    iput-object p1, p0, LJ9/n;->b:LJ9/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LJ9/o;LN9/a;)V
    .locals 0

    .line 2
    const/4 p2, 0x1

    iput p2, p0, LJ9/n;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ9/n;->b:LJ9/o;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget v0, p0, LJ9/n;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iget-object v1, p0, LJ9/n;->b:LJ9/o;

    .line 8
    .line 9
    iput-boolean v0, v1, LJ9/o;->a:Z

    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    iget-object v0, p0, LJ9/n;->b:LJ9/o;

    .line 13
    .line 14
    iget-object v1, v0, LJ9/o;->g:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, LJ9/G;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-object v0, v0, LJ9/o;->i:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, LN9/h;

    .line 24
    .line 25
    iget-object v2, v0, LN9/h;->b:LE5/b;

    .line 26
    .line 27
    iget-boolean v2, v2, LE5/b;->b:Z

    .line 28
    .line 29
    if-nez v2, :cond_0

    .line 30
    .line 31
    iget-object v2, v1, LJ9/G;->c:LP9/d;

    .line 32
    .line 33
    check-cast v2, LP9/c;

    .line 34
    .line 35
    invoke-virtual {v2}, LP9/c;->d()Lcom/google/android/gms/tasks/Task;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    new-instance v3, LJ9/E;

    .line 40
    .line 41
    const/4 v4, 0x1

    .line 42
    invoke-direct {v3, v1, v0, v4}, LJ9/E;-><init>(LJ9/G;LN9/h;I)V

    .line 43
    .line 44
    .line 45
    iget-object v4, v1, LJ9/G;->g:Ljava/util/concurrent/Executor;

    .line 46
    .line 47
    invoke-virtual {v2, v4, v3}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    .line 48
    .line 49
    .line 50
    const-string v2, "fiam_action"

    .line 51
    .line 52
    const/4 v3, 0x1

    .line 53
    invoke-virtual {v1, v0, v2, v3}, LJ9/G;->c(LN9/h;Ljava/lang/String;Z)V

    .line 54
    .line 55
    .line 56
    :cond_0
    iget-object v0, v1, LJ9/G;->f:LJ9/j;

    .line 57
    .line 58
    iget-object v0, v0, LJ9/j;->b:Ljava/util/HashMap;

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-nez v1, :cond_1

    .line 73
    .line 74
    return-void

    .line 75
    :cond_1
    invoke-static {v0}, LVa/M6;->j(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    throw v0

    .line 80
    :pswitch_1
    iget-object v0, p0, LJ9/n;->b:LJ9/o;

    .line 81
    .line 82
    iget-object v1, v0, LJ9/o;->g:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v1, LJ9/G;

    .line 85
    .line 86
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    iget-object v0, v0, LJ9/o;->i:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v0, LN9/h;

    .line 92
    .line 93
    iget-object v2, v0, LN9/h;->b:LE5/b;

    .line 94
    .line 95
    iget-boolean v2, v2, LE5/b;->b:Z

    .line 96
    .line 97
    if-nez v2, :cond_7

    .line 98
    .line 99
    iget-object v2, v1, LJ9/G;->c:LP9/d;

    .line 100
    .line 101
    check-cast v2, LP9/c;

    .line 102
    .line 103
    invoke-virtual {v2}, LP9/c;->d()Lcom/google/android/gms/tasks/Task;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    new-instance v3, LJ9/E;

    .line 108
    .line 109
    const/4 v4, 0x0

    .line 110
    invoke-direct {v3, v1, v0, v4}, LJ9/E;-><init>(LJ9/G;LN9/h;I)V

    .line 111
    .line 112
    .line 113
    iget-object v4, v1, LJ9/G;->g:Ljava/util/concurrent/Executor;

    .line 114
    .line 115
    invoke-virtual {v2, v4, v3}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    .line 116
    .line 117
    .line 118
    sget-object v2, LJ9/F;->a:[I

    .line 119
    .line 120
    iget-object v3, v0, LN9/h;->a:Lcom/google/firebase/inappmessaging/model/MessageType;

    .line 121
    .line 122
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    aget v2, v2, v3

    .line 127
    .line 128
    const/4 v3, 0x0

    .line 129
    const/4 v4, 0x1

    .line 130
    if-eq v2, v4, :cond_5

    .line 131
    .line 132
    const/4 v5, 0x2

    .line 133
    if-eq v2, v5, :cond_4

    .line 134
    .line 135
    const/4 v5, 0x3

    .line 136
    if-eq v2, v5, :cond_3

    .line 137
    .line 138
    const/4 v5, 0x4

    .line 139
    if-eq v2, v5, :cond_2

    .line 140
    .line 141
    const-string v2, "FIAM.Headless"

    .line 142
    .line 143
    const-string v4, "Unable to determine if impression should be counted as conversion."

    .line 144
    .line 145
    invoke-static {v2, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 146
    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_2
    move-object v2, v0

    .line 150
    check-cast v2, LN9/g;

    .line 151
    .line 152
    iget-object v2, v2, LN9/g;->d:LN9/a;

    .line 153
    .line 154
    invoke-static {v2}, LJ9/G;->b(LN9/a;)Z

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    :goto_0
    xor-int/lit8 v3, v2, 0x1

    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_3
    move-object v2, v0

    .line 162
    check-cast v2, LN9/c;

    .line 163
    .line 164
    iget-object v2, v2, LN9/c;->f:LN9/a;

    .line 165
    .line 166
    invoke-static {v2}, LJ9/G;->b(LN9/a;)Z

    .line 167
    .line 168
    .line 169
    move-result v2

    .line 170
    goto :goto_0

    .line 171
    :cond_4
    move-object v2, v0

    .line 172
    check-cast v2, LN9/i;

    .line 173
    .line 174
    iget-object v2, v2, LN9/i;->f:LN9/a;

    .line 175
    .line 176
    invoke-static {v2}, LJ9/G;->b(LN9/a;)Z

    .line 177
    .line 178
    .line 179
    move-result v2

    .line 180
    goto :goto_0

    .line 181
    :cond_5
    move-object v2, v0

    .line 182
    check-cast v2, LN9/e;

    .line 183
    .line 184
    iget-object v5, v2, LN9/e;->f:LN9/a;

    .line 185
    .line 186
    invoke-static {v5}, LJ9/G;->b(LN9/a;)Z

    .line 187
    .line 188
    .line 189
    move-result v5

    .line 190
    iget-object v2, v2, LN9/e;->g:LN9/a;

    .line 191
    .line 192
    invoke-static {v2}, LJ9/G;->b(LN9/a;)Z

    .line 193
    .line 194
    .line 195
    move-result v2

    .line 196
    if-nez v5, :cond_6

    .line 197
    .line 198
    if-nez v2, :cond_6

    .line 199
    .line 200
    move v3, v4

    .line 201
    :cond_6
    :goto_1
    const-string v2, "fiam_impression"

    .line 202
    .line 203
    invoke-virtual {v1, v0, v2, v3}, LJ9/G;->c(LN9/h;Ljava/lang/String;Z)V

    .line 204
    .line 205
    .line 206
    :cond_7
    iget-object v0, v1, LJ9/G;->f:LJ9/j;

    .line 207
    .line 208
    iget-object v0, v0, LJ9/j;->e:Ljava/util/HashMap;

    .line 209
    .line 210
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 219
    .line 220
    .line 221
    move-result v1

    .line 222
    if-nez v1, :cond_8

    .line 223
    .line 224
    return-void

    .line 225
    :cond_8
    invoke-static {v0}, LVa/M6;->j(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    throw v0

    .line 230
    nop

    .line 231
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
