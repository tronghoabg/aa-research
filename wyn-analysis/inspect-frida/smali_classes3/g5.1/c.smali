.class public final Lg5/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:LWa/h;

.field public final synthetic d:Ljava/lang/Boolean;

.field public final synthetic e:Lg5/a;

.field public final synthetic f:Luc/o;

.field public final synthetic g:Z

.field public final synthetic h:I

.field public final synthetic i:Lg5/e;


# direct methods
.method public constructor <init>(Lg5/e;ZLjava/lang/String;LWa/h;Ljava/lang/Boolean;Lg5/a;Luc/o;ZI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg5/c;->i:Lg5/e;

    .line 5
    .line 6
    iput-boolean p2, p0, Lg5/c;->a:Z

    .line 7
    .line 8
    iput-object p3, p0, Lg5/c;->b:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lg5/c;->c:LWa/h;

    .line 11
    .line 12
    iput-object p5, p0, Lg5/c;->d:Ljava/lang/Boolean;

    .line 13
    .line 14
    iput-object p6, p0, Lg5/c;->e:Lg5/a;

    .line 15
    .line 16
    iput-object p7, p0, Lg5/c;->f:Luc/o;

    .line 17
    .line 18
    iput-boolean p8, p0, Lg5/c;->g:Z

    .line 19
    .line 20
    iput p9, p0, Lg5/c;->h:I

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    const-string v0, "open_failed "

    .line 2
    .line 3
    sget-object v1, Lg5/e;->h:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    iget-boolean v2, p0, Lg5/c;->a:Z

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    new-instance v2, Ljava/io/File;

    .line 12
    .line 13
    iget-object v4, p0, Lg5/c;->b:Ljava/lang/String;

    .line 14
    .line 15
    invoke-direct {v2, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    new-instance v4, Ljava/io/File;

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/io/File;->getParent()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-direct {v4, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-nez v2, :cond_0

    .line 32
    .line 33
    invoke-virtual {v4}, Ljava/io/File;->mkdirs()Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-nez v2, :cond_0

    .line 38
    .line 39
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-nez v2, :cond_0

    .line 44
    .line 45
    iget-object v2, p0, Lg5/c;->c:LWa/h;

    .line 46
    .line 47
    const-string v4, "sqlite_error"

    .line 48
    .line 49
    new-instance v5, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Lg5/c;->b:Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v2, v4, v0, v3}, LWa/h;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    return-void

    .line 68
    :catchall_0
    move-exception v0

    .line 69
    goto/16 :goto_4

    .line 70
    .line 71
    :cond_0
    :try_start_1
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 72
    .line 73
    iget-object v2, p0, Lg5/c;->d:Ljava/lang/Boolean;

    .line 74
    .line 75
    invoke-virtual {v0, v2}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    const/4 v2, 0x1

    .line 80
    if-eqz v0, :cond_1

    .line 81
    .line 82
    iget-object v0, p0, Lg5/c;->e:Lg5/a;

    .line 83
    .line 84
    new-instance v3, Lae/d;

    .line 85
    .line 86
    const/4 v4, 0x6

    .line 87
    invoke-direct {v3, v4}, Lae/d;-><init>(I)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v2, v3}, Lg5/a;->c(ILae/d;)V

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :catch_0
    move-exception v0

    .line 95
    goto :goto_3

    .line 96
    :cond_1
    iget-object v0, p0, Lg5/c;->e:Lg5/a;

    .line 97
    .line 98
    const/high16 v4, 0x10000000

    .line 99
    .line 100
    invoke-virtual {v0, v4, v3}, Lg5/a;->c(ILae/d;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 101
    .line 102
    .line 103
    :goto_0
    :try_start_2
    sget-object v0, Lg5/e;->g:Ljava/lang/Object;

    .line 104
    .line 105
    monitor-enter v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 106
    :try_start_3
    iget-boolean v3, p0, Lg5/c;->g:Z

    .line 107
    .line 108
    if-eqz v3, :cond_2

    .line 109
    .line 110
    sget-object v3, Lg5/e;->c:Ljava/util/HashMap;

    .line 111
    .line 112
    iget-object v4, p0, Lg5/c;->b:Ljava/lang/String;

    .line 113
    .line 114
    iget v5, p0, Lg5/c;->h:I

    .line 115
    .line 116
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :catchall_1
    move-exception v2

    .line 125
    goto :goto_2

    .line 126
    :cond_2
    :goto_1
    sget-object v3, Lg5/e;->m:Ljava/util/HashMap;

    .line 127
    .line 128
    iget v4, p0, Lg5/c;->h:I

    .line 129
    .line 130
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    iget-object v5, p0, Lg5/c;->e:Lg5/a;

    .line 135
    .line 136
    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 140
    :try_start_4
    iget-object v0, p0, Lg5/c;->e:Lg5/a;

    .line 141
    .line 142
    iget v0, v0, Lg5/a;->e:I

    .line 143
    .line 144
    if-lt v0, v2, :cond_3

    .line 145
    .line 146
    const-string v0, "Sqflite"

    .line 147
    .line 148
    new-instance v2, Ljava/lang/StringBuilder;

    .line 149
    .line 150
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 151
    .line 152
    .line 153
    iget-object v3, p0, Lg5/c;->e:Lg5/a;

    .line 154
    .line 155
    invoke-virtual {v3}, Lg5/a;->b()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    const-string v3, "opened "

    .line 163
    .line 164
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    iget v3, p0, Lg5/c;->h:I

    .line 168
    .line 169
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    const-string v3, " "

    .line 173
    .line 174
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    iget-object v3, p0, Lg5/c;->b:Ljava/lang/String;

    .line 178
    .line 179
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 187
    .line 188
    .line 189
    :cond_3
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 190
    iget-object v0, p0, Lg5/c;->c:LWa/h;

    .line 191
    .line 192
    iget v1, p0, Lg5/c;->h:I

    .line 193
    .line 194
    const/4 v2, 0x0

    .line 195
    invoke-static {v1, v2, v2}, Lg5/e;->k(IZZ)Ljava/util/HashMap;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    invoke-virtual {v0, v1}, LWa/h;->a(Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    return-void

    .line 203
    :goto_2
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 204
    :try_start_6
    throw v2

    .line 205
    :goto_3
    new-instance v2, Lh5/d;

    .line 206
    .line 207
    iget-object v3, p0, Lg5/c;->f:Luc/o;

    .line 208
    .line 209
    iget-object v4, p0, Lg5/c;->c:LWa/h;

    .line 210
    .line 211
    invoke-direct {v2, v3, v4}, Lh5/d;-><init>(Luc/o;Luc/q;)V

    .line 212
    .line 213
    .line 214
    iget-object v3, p0, Lg5/c;->i:Lg5/e;

    .line 215
    .line 216
    iget-object v4, p0, Lg5/c;->e:Lg5/a;

    .line 217
    .line 218
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    invoke-static {v0, v2, v4}, Lg5/e;->j(Ljava/lang/Exception;LU8/v0;Lg5/a;)V

    .line 222
    .line 223
    .line 224
    monitor-exit v1

    .line 225
    return-void

    .line 226
    :goto_4
    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 227
    throw v0
.end method
