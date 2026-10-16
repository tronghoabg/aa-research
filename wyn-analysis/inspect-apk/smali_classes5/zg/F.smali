.class public final Lzg/F;
.super Lzg/a0;
.source "SourceFile"


# instance fields
.field public final synthetic b:I

.field public final c:Ljava/lang/reflect/Method;

.field public final d:I

.field public final e:Lzg/j;

.field public final f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;ILokhttp3/Headers;Lzg/j;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lzg/F;->b:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lzg/F;->c:Ljava/lang/reflect/Method;

    .line 3
    iput p2, p0, Lzg/F;->d:I

    .line 4
    iput-object p3, p0, Lzg/F;->f:Ljava/lang/Object;

    .line 5
    iput-object p4, p0, Lzg/F;->e:Lzg/j;

    return-void
.end method

.method public constructor <init>(Ljava/lang/reflect/Method;ILzg/j;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lzg/F;->b:I

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, Lzg/F;->c:Ljava/lang/reflect/Method;

    .line 8
    iput p2, p0, Lzg/F;->d:I

    .line 9
    iput-object p3, p0, Lzg/F;->e:Lzg/j;

    .line 10
    iput-object p4, p0, Lzg/F;->f:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Lzg/N;Ljava/lang/Object;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lzg/F;->e:Lzg/j;

    .line 2
    .line 3
    iget-object v1, p0, Lzg/F;->f:Ljava/lang/Object;

    .line 4
    .line 5
    iget v2, p0, Lzg/F;->d:I

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iget-object v4, p0, Lzg/F;->c:Ljava/lang/reflect/Method;

    .line 9
    .line 10
    iget v5, p0, Lzg/F;->b:I

    .line 11
    .line 12
    packed-switch v5, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p2, Ljava/util/Map;

    .line 16
    .line 17
    if-eqz p2, :cond_3

    .line 18
    .line 19
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    if-eqz v5, :cond_2

    .line 32
    .line 33
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    check-cast v5, Ljava/util/Map$Entry;

    .line 38
    .line 39
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    check-cast v6, Ljava/lang/String;

    .line 44
    .line 45
    if-eqz v6, :cond_1

    .line 46
    .line 47
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    if-eqz v5, :cond_0

    .line 52
    .line 53
    const-string v7, "form-data; name=\""

    .line 54
    .line 55
    const-string v8, "\""

    .line 56
    .line 57
    invoke-static {v7, v6, v8}, LA7/p0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    const-string v7, "Content-Disposition"

    .line 62
    .line 63
    const-string v8, "Content-Transfer-Encoding"

    .line 64
    .line 65
    move-object v9, v1

    .line 66
    check-cast v9, Ljava/lang/String;

    .line 67
    .line 68
    filled-new-array {v7, v6, v8, v9}, [Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    sget-object v7, Lokhttp3/Headers;->b:Lokhttp3/Headers$Companion;

    .line 73
    .line 74
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-static {v6}, Lokhttp3/Headers$Companion;->c([Ljava/lang/String;)Lokhttp3/Headers;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    invoke-interface {v0, v5}, Lzg/j;->convert(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    check-cast v5, Lokhttp3/RequestBody;

    .line 86
    .line 87
    invoke-virtual {p1, v6, v5}, Lzg/N;->c(Lokhttp3/Headers;Lokhttp3/RequestBody;)V

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_0
    const-string p1, "Part map contained null value for key \'"

    .line 92
    .line 93
    const-string p2, "\'."

    .line 94
    .line 95
    invoke-static {p1, v6, p2}, LA7/p0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    new-array p2, v3, [Ljava/lang/Object;

    .line 100
    .line 101
    invoke-static {v4, v2, p1, p2}, Lzg/a0;->k(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    throw p1

    .line 106
    :cond_1
    const-string p1, "Part map contained null key."

    .line 107
    .line 108
    new-array p2, v3, [Ljava/lang/Object;

    .line 109
    .line 110
    invoke-static {v4, v2, p1, p2}, Lzg/a0;->k(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    throw p1

    .line 115
    :cond_2
    return-void

    .line 116
    :cond_3
    const-string p1, "Part map was null."

    .line 117
    .line 118
    new-array p2, v3, [Ljava/lang/Object;

    .line 119
    .line 120
    invoke-static {v4, v2, p1, p2}, Lzg/a0;->k(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    throw p1

    .line 125
    :pswitch_0
    if-nez p2, :cond_4

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_4
    :try_start_0
    invoke-interface {v0, p2}, Lzg/j;->convert(Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    check-cast v0, Lokhttp3/RequestBody;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 133
    .line 134
    check-cast v1, Lokhttp3/Headers;

    .line 135
    .line 136
    invoke-virtual {p1, v1, v0}, Lzg/N;->c(Lokhttp3/Headers;Lokhttp3/RequestBody;)V

    .line 137
    .line 138
    .line 139
    :goto_1
    return-void

    .line 140
    :catch_0
    move-exception p1

    .line 141
    new-instance v0, Ljava/lang/StringBuilder;

    .line 142
    .line 143
    const-string v1, "Unable to convert "

    .line 144
    .line 145
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    const-string p2, " to RequestBody"

    .line 152
    .line 153
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p2

    .line 160
    const/4 v0, 0x1

    .line 161
    new-array v0, v0, [Ljava/lang/Object;

    .line 162
    .line 163
    aput-object p1, v0, v3

    .line 164
    .line 165
    invoke-static {v4, v2, p2, v0}, Lzg/a0;->k(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    throw p1

    .line 170
    nop

    .line 171
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
