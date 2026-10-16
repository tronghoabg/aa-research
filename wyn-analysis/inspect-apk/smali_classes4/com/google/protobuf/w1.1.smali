.class public final Lcom/google/protobuf/w1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Lcom/google/protobuf/w1;


# instance fields
.field public final a:Lcom/google/protobuf/b1;

.field public final b:Lj$/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/protobuf/w1;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/protobuf/w1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/protobuf/w1;->c:Lcom/google/protobuf/w1;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lj$/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/google/protobuf/w1;->b:Lj$/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    new-instance v0, Lcom/google/protobuf/b1;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, v1}, Lcom/google/protobuf/b1;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lcom/google/protobuf/w1;->a:Lcom/google/protobuf/b1;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Class;)Lcom/google/protobuf/D1;
    .locals 10

    .line 1
    const-string v0, "messageType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lcom/google/protobuf/Internal;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/google/protobuf/w1;->b:Lj$/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    invoke-virtual {v1, p1}, Lj$/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    check-cast v2, Lcom/google/protobuf/D1;

    .line 13
    .line 14
    if-nez v2, :cond_a

    .line 15
    .line 16
    iget-object v2, p0, Lcom/google/protobuf/w1;->a:Lcom/google/protobuf/b1;

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    sget-object v3, Lcom/google/protobuf/E1;->a:Ljava/lang/Class;

    .line 22
    .line 23
    const-class v3, Lcom/google/protobuf/GeneratedMessageLite;

    .line 24
    .line 25
    invoke-virtual {v3, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-nez v4, :cond_1

    .line 30
    .line 31
    sget-object v4, Lcom/google/protobuf/E1;->a:Ljava/lang/Class;

    .line 32
    .line 33
    if-eqz v4, :cond_1

    .line 34
    .line 35
    invoke-virtual {v4, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 43
    .line 44
    const-string v0, "Message classes must extend GeneratedMessageV3 or GeneratedMessageLite"

    .line 45
    .line 46
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_1
    :goto_0
    iget-object v2, v2, Lcom/google/protobuf/b1;->a:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v2, Lcom/google/protobuf/h1;

    .line 53
    .line 54
    invoke-interface {v2, p1}, Lcom/google/protobuf/h1;->a(Ljava/lang/Class;)Lcom/google/protobuf/g1;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-interface {v4}, Lcom/google/protobuf/g1;->a()Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    const-string v5, "Protobuf runtime is not correctly loaded."

    .line 63
    .line 64
    if-eqz v2, :cond_4

    .line 65
    .line 66
    invoke-virtual {v3, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-eqz v2, :cond_2

    .line 71
    .line 72
    sget-object v2, Lcom/google/protobuf/E1;->c:Lcom/google/protobuf/Y1;

    .line 73
    .line 74
    sget-object v3, Lcom/google/protobuf/m0;->a:Lcom/google/protobuf/l0;

    .line 75
    .line 76
    invoke-interface {v4}, Lcom/google/protobuf/g1;->b()Lcom/google/protobuf/MessageLite;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    new-instance v5, Lcom/google/protobuf/l1;

    .line 81
    .line 82
    invoke-direct {v5, v2, v3, v4}, Lcom/google/protobuf/l1;-><init>(Lcom/google/protobuf/X1;Lcom/google/protobuf/j0;Lcom/google/protobuf/MessageLite;)V

    .line 83
    .line 84
    .line 85
    goto/16 :goto_1

    .line 86
    .line 87
    :cond_2
    sget-object v2, Lcom/google/protobuf/E1;->b:Lcom/google/protobuf/X1;

    .line 88
    .line 89
    sget-object v3, Lcom/google/protobuf/m0;->b:Lcom/google/protobuf/j0;

    .line 90
    .line 91
    if-eqz v3, :cond_3

    .line 92
    .line 93
    invoke-interface {v4}, Lcom/google/protobuf/g1;->b()Lcom/google/protobuf/MessageLite;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    new-instance v5, Lcom/google/protobuf/l1;

    .line 98
    .line 99
    invoke-direct {v5, v2, v3, v4}, Lcom/google/protobuf/l1;-><init>(Lcom/google/protobuf/X1;Lcom/google/protobuf/j0;Lcom/google/protobuf/MessageLite;)V

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 104
    .line 105
    invoke-direct {p1, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    throw p1

    .line 109
    :cond_4
    invoke-virtual {v3, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    const/4 v3, 0x1

    .line 114
    if-eqz v2, :cond_6

    .line 115
    .line 116
    sget-object v2, Lcom/google/protobuf/Z0;->a:[I

    .line 117
    .line 118
    invoke-interface {v4}, Lcom/google/protobuf/g1;->getSyntax()Lcom/google/protobuf/ProtoSyntax;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 123
    .line 124
    .line 125
    move-result v5

    .line 126
    aget v2, v2, v5

    .line 127
    .line 128
    if-eq v2, v3, :cond_5

    .line 129
    .line 130
    sget-object v5, Lcom/google/protobuf/p1;->b:Lcom/google/protobuf/o1;

    .line 131
    .line 132
    sget-object v6, Lcom/google/protobuf/W0;->b:Lcom/google/protobuf/V0;

    .line 133
    .line 134
    sget-object v7, Lcom/google/protobuf/E1;->c:Lcom/google/protobuf/Y1;

    .line 135
    .line 136
    sget-object v8, Lcom/google/protobuf/m0;->a:Lcom/google/protobuf/l0;

    .line 137
    .line 138
    sget-object v9, Lcom/google/protobuf/f1;->b:Lcom/google/protobuf/e1;

    .line 139
    .line 140
    invoke-static/range {v4 .. v9}, Lcom/google/protobuf/k1;->B(Lcom/google/protobuf/g1;Lcom/google/protobuf/o1;Lcom/google/protobuf/W0;Lcom/google/protobuf/X1;Lcom/google/protobuf/j0;Lcom/google/protobuf/e1;)Lcom/google/protobuf/k1;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    goto :goto_1

    .line 145
    :cond_5
    sget-object v5, Lcom/google/protobuf/p1;->b:Lcom/google/protobuf/o1;

    .line 146
    .line 147
    sget-object v6, Lcom/google/protobuf/W0;->b:Lcom/google/protobuf/V0;

    .line 148
    .line 149
    sget-object v7, Lcom/google/protobuf/E1;->c:Lcom/google/protobuf/Y1;

    .line 150
    .line 151
    sget-object v9, Lcom/google/protobuf/f1;->b:Lcom/google/protobuf/e1;

    .line 152
    .line 153
    const/4 v8, 0x0

    .line 154
    invoke-static/range {v4 .. v9}, Lcom/google/protobuf/k1;->B(Lcom/google/protobuf/g1;Lcom/google/protobuf/o1;Lcom/google/protobuf/W0;Lcom/google/protobuf/X1;Lcom/google/protobuf/j0;Lcom/google/protobuf/e1;)Lcom/google/protobuf/k1;

    .line 155
    .line 156
    .line 157
    move-result-object v5

    .line 158
    goto :goto_1

    .line 159
    :cond_6
    sget-object v2, Lcom/google/protobuf/Z0;->a:[I

    .line 160
    .line 161
    invoke-interface {v4}, Lcom/google/protobuf/g1;->getSyntax()Lcom/google/protobuf/ProtoSyntax;

    .line 162
    .line 163
    .line 164
    move-result-object v6

    .line 165
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 166
    .line 167
    .line 168
    move-result v6

    .line 169
    aget v2, v2, v6

    .line 170
    .line 171
    if-eq v2, v3, :cond_8

    .line 172
    .line 173
    move-object v2, v5

    .line 174
    sget-object v5, Lcom/google/protobuf/p1;->a:Lcom/google/protobuf/o1;

    .line 175
    .line 176
    sget-object v6, Lcom/google/protobuf/W0;->a:Lcom/google/protobuf/U0;

    .line 177
    .line 178
    sget-object v7, Lcom/google/protobuf/E1;->b:Lcom/google/protobuf/X1;

    .line 179
    .line 180
    sget-object v8, Lcom/google/protobuf/m0;->b:Lcom/google/protobuf/j0;

    .line 181
    .line 182
    if-eqz v8, :cond_7

    .line 183
    .line 184
    sget-object v9, Lcom/google/protobuf/f1;->a:Lcom/google/protobuf/e1;

    .line 185
    .line 186
    invoke-static/range {v4 .. v9}, Lcom/google/protobuf/k1;->B(Lcom/google/protobuf/g1;Lcom/google/protobuf/o1;Lcom/google/protobuf/W0;Lcom/google/protobuf/X1;Lcom/google/protobuf/j0;Lcom/google/protobuf/e1;)Lcom/google/protobuf/k1;

    .line 187
    .line 188
    .line 189
    move-result-object v5

    .line 190
    goto :goto_1

    .line 191
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 192
    .line 193
    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    throw p1

    .line 197
    :cond_8
    sget-object v5, Lcom/google/protobuf/p1;->a:Lcom/google/protobuf/o1;

    .line 198
    .line 199
    sget-object v6, Lcom/google/protobuf/W0;->a:Lcom/google/protobuf/U0;

    .line 200
    .line 201
    sget-object v7, Lcom/google/protobuf/E1;->b:Lcom/google/protobuf/X1;

    .line 202
    .line 203
    sget-object v9, Lcom/google/protobuf/f1;->a:Lcom/google/protobuf/e1;

    .line 204
    .line 205
    const/4 v8, 0x0

    .line 206
    invoke-static/range {v4 .. v9}, Lcom/google/protobuf/k1;->B(Lcom/google/protobuf/g1;Lcom/google/protobuf/o1;Lcom/google/protobuf/W0;Lcom/google/protobuf/X1;Lcom/google/protobuf/j0;Lcom/google/protobuf/e1;)Lcom/google/protobuf/k1;

    .line 207
    .line 208
    .line 209
    move-result-object v5

    .line 210
    :goto_1
    invoke-static {p1, v0}, Lcom/google/protobuf/Internal;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    const-string v0, "schema"

    .line 214
    .line 215
    invoke-static {v5, v0}, Lcom/google/protobuf/Internal;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v1, p1, v5}, Lj$/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    check-cast p1, Lcom/google/protobuf/D1;

    .line 223
    .line 224
    if-eqz p1, :cond_9

    .line 225
    .line 226
    return-object p1

    .line 227
    :cond_9
    return-object v5

    .line 228
    :cond_a
    return-object v2
.end method

.method public final b(Ljava/lang/Object;)Lcom/google/protobuf/D1;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Lcom/google/protobuf/w1;->a(Ljava/lang/Class;)Lcom/google/protobuf/D1;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
