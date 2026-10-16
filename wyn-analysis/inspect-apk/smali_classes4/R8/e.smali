.class public final LR8/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Ljava/lang/String;

.field public static final c:Ljava/util/concurrent/atomic/AtomicLong;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 18
    .line 19
    .line 20
    move-result-wide v1

    .line 21
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v0}, LR8/g;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sput-object v0, LR8/e;->b:Ljava/lang/String;

    .line 33
    .line 34
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 35
    .line 36
    const-wide/16 v1, 0x0

    .line 37
    .line 38
    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 39
    .line 40
    .line 41
    sput-object v0, LR8/e;->c:Ljava/util/concurrent/atomic/AtomicLong;

    .line 42
    .line 43
    return-void
.end method

.method public constructor <init>()V
    .locals 16

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x2

    .line 3
    const/4 v2, 0x1

    .line 4
    const/4 v3, 0x0

    .line 5
    const/4 v4, 0x4

    .line 6
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v5, Ljava/util/Date;

    .line 10
    .line 11
    invoke-direct {v5}, Ljava/util/Date;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v5}, Ljava/util/Date;->getTime()J

    .line 15
    .line 16
    .line 17
    move-result-wide v5

    .line 18
    const-wide/16 v7, 0x3e8

    .line 19
    .line 20
    div-long v9, v5, v7

    .line 21
    .line 22
    rem-long/2addr v5, v7

    .line 23
    invoke-static {v4}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 24
    .line 25
    .line 26
    move-result-object v7

    .line 27
    long-to-int v8, v9

    .line 28
    invoke-virtual {v7, v8}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 29
    .line 30
    .line 31
    sget-object v8, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 32
    .line 33
    invoke-virtual {v7, v8}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v7, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->array()[B

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    aget-byte v8, v7, v3

    .line 44
    .line 45
    aget-byte v9, v7, v2

    .line 46
    .line 47
    aget-byte v10, v7, v1

    .line 48
    .line 49
    aget-byte v7, v7, v0

    .line 50
    .line 51
    invoke-static {v5, v6}, LR8/e;->a(J)[B

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    aget-byte v6, v5, v3

    .line 56
    .line 57
    aget-byte v5, v5, v2

    .line 58
    .line 59
    sget-object v11, LR8/e;->c:Ljava/util/concurrent/atomic/AtomicLong;

    .line 60
    .line 61
    invoke-virtual {v11}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    .line 62
    .line 63
    .line 64
    move-result-wide v11

    .line 65
    invoke-static {v11, v12}, LR8/e;->a(J)[B

    .line 66
    .line 67
    .line 68
    move-result-object v11

    .line 69
    aget-byte v12, v11, v3

    .line 70
    .line 71
    aget-byte v11, v11, v2

    .line 72
    .line 73
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 74
    .line 75
    .line 76
    move-result v13

    .line 77
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object v13

    .line 81
    invoke-virtual {v13}, Ljava/lang/Integer;->shortValue()S

    .line 82
    .line 83
    .line 84
    move-result v13

    .line 85
    int-to-long v13, v13

    .line 86
    invoke-static {v13, v14}, LR8/e;->a(J)[B

    .line 87
    .line 88
    .line 89
    move-result-object v13

    .line 90
    aget-byte v14, v13, v3

    .line 91
    .line 92
    aget-byte v13, v13, v2

    .line 93
    .line 94
    const/16 v15, 0xa

    .line 95
    .line 96
    new-array v15, v15, [B

    .line 97
    .line 98
    aput-byte v8, v15, v3

    .line 99
    .line 100
    aput-byte v9, v15, v2

    .line 101
    .line 102
    aput-byte v10, v15, v1

    .line 103
    .line 104
    aput-byte v7, v15, v0

    .line 105
    .line 106
    aput-byte v6, v15, v4

    .line 107
    .line 108
    const/4 v6, 0x5

    .line 109
    aput-byte v5, v15, v6

    .line 110
    .line 111
    const/4 v5, 0x6

    .line 112
    aput-byte v12, v15, v5

    .line 113
    .line 114
    const/4 v5, 0x7

    .line 115
    aput-byte v11, v15, v5

    .line 116
    .line 117
    const/16 v5, 0x8

    .line 118
    .line 119
    aput-byte v14, v15, v5

    .line 120
    .line 121
    const/16 v5, 0x9

    .line 122
    .line 123
    aput-byte v13, v15, v5

    .line 124
    .line 125
    invoke-static {v15}, LR8/g;->e([B)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    sget-object v6, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 130
    .line 131
    const/16 v7, 0xc

    .line 132
    .line 133
    invoke-virtual {v5, v3, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v8

    .line 137
    const/16 v9, 0x10

    .line 138
    .line 139
    invoke-virtual {v5, v7, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v10

    .line 143
    const/16 v11, 0x14

    .line 144
    .line 145
    invoke-virtual {v5, v9, v11}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    sget-object v9, LR8/e;->b:Ljava/lang/String;

    .line 150
    .line 151
    invoke-virtual {v9, v3, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v7

    .line 155
    new-array v4, v4, [Ljava/lang/Object;

    .line 156
    .line 157
    aput-object v8, v4, v3

    .line 158
    .line 159
    aput-object v10, v4, v2

    .line 160
    .line 161
    aput-object v5, v4, v1

    .line 162
    .line 163
    aput-object v7, v4, v0

    .line 164
    .line 165
    const-string v0, "%s%s%s%s"

    .line 166
    .line 167
    invoke-static {v6, v0, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    invoke-virtual {v0, v6}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    move-object/from16 v1, p0

    .line 176
    .line 177
    iput-object v0, v1, LR8/e;->a:Ljava/lang/String;

    .line 178
    .line 179
    return-void
.end method

.method public static a(J)[B
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    long-to-int p0, p0

    .line 7
    int-to-short p0, p0

    .line 8
    invoke-virtual {v0, p0}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 9
    .line 10
    .line 11
    sget-object p0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    invoke-virtual {v0, p0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LR8/e;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
