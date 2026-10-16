.class public abstract Lcom/google/protobuf/X1;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract a(Ljava/lang/Object;)Lcom/google/protobuf/UnknownFieldSetLite;
.end method

.method public final b(ILcom/google/protobuf/B;Ljava/lang/Object;)Z
    .locals 7

    .line 1
    iget v0, p2, Lcom/google/protobuf/B;->b:I

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/protobuf/WireFormat;->getTagFieldNumber(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {v0}, Lcom/google/protobuf/WireFormat;->getTagWireType(I)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v2, 0x1

    .line 12
    const/4 v3, 0x0

    .line 13
    if-eqz v0, :cond_9

    .line 14
    .line 15
    if-eq v0, v2, :cond_8

    .line 16
    .line 17
    const/4 v4, 0x2

    .line 18
    if-eq v0, v4, :cond_7

    .line 19
    .line 20
    const/4 v4, 0x4

    .line 21
    const/4 v5, 0x3

    .line 22
    if-eq v0, v5, :cond_2

    .line 23
    .line 24
    if-eq v0, v4, :cond_1

    .line 25
    .line 26
    const/4 p1, 0x5

    .line 27
    if-ne v0, p1, :cond_0

    .line 28
    .line 29
    invoke-virtual {p2, p1}, Lcom/google/protobuf/B;->x(I)V

    .line 30
    .line 31
    .line 32
    iget-object p2, p2, Lcom/google/protobuf/B;->a:Lcom/google/protobuf/CodedInputStream;

    .line 33
    .line 34
    invoke-virtual {p2}, Lcom/google/protobuf/CodedInputStream;->readFixed32()I

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    check-cast p3, Lcom/google/protobuf/UnknownFieldSetLite;

    .line 39
    .line 40
    invoke-static {v1, p1}, Lcom/google/protobuf/WireFormat;->makeTag(II)I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-virtual {p3, p1, p2}, Lcom/google/protobuf/UnknownFieldSetLite;->storeField(ILjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    return v2

    .line 52
    :cond_0
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->invalidWireType()Lcom/google/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    throw p1

    .line 57
    :cond_1
    return v3

    .line 58
    :cond_2
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSetLite;->newInstance()Lcom/google/protobuf/UnknownFieldSetLite;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-static {v1, v4}, Lcom/google/protobuf/WireFormat;->makeTag(II)I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    add-int/2addr p1, v2

    .line 67
    const/16 v4, 0x64

    .line 68
    .line 69
    if-ge p1, v4, :cond_6

    .line 70
    .line 71
    :cond_3
    invoke-virtual {p2}, Lcom/google/protobuf/B;->a()I

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    const v6, 0x7fffffff

    .line 76
    .line 77
    .line 78
    if-eq v4, v6, :cond_4

    .line 79
    .line 80
    invoke-virtual {p0, p1, p2, v0}, Lcom/google/protobuf/X1;->b(ILcom/google/protobuf/B;Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    if-nez v4, :cond_3

    .line 85
    .line 86
    :cond_4
    iget p1, p2, Lcom/google/protobuf/B;->b:I

    .line 87
    .line 88
    if-ne v3, p1, :cond_5

    .line 89
    .line 90
    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSetLite;->makeImmutable()V

    .line 91
    .line 92
    .line 93
    check-cast p3, Lcom/google/protobuf/UnknownFieldSetLite;

    .line 94
    .line 95
    invoke-static {v1, v5}, Lcom/google/protobuf/WireFormat;->makeTag(II)I

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    invoke-virtual {p3, p1, v0}, Lcom/google/protobuf/UnknownFieldSetLite;->storeField(ILjava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    return v2

    .line 103
    :cond_5
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->invalidEndTag()Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    throw p1

    .line 108
    :cond_6
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->recursionLimitExceeded()Lcom/google/protobuf/InvalidProtocolBufferException;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    throw p1

    .line 113
    :cond_7
    invoke-virtual {p2}, Lcom/google/protobuf/B;->e()Lcom/google/protobuf/ByteString;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    check-cast p3, Lcom/google/protobuf/UnknownFieldSetLite;

    .line 118
    .line 119
    invoke-static {v1, v4}, Lcom/google/protobuf/WireFormat;->makeTag(II)I

    .line 120
    .line 121
    .line 122
    move-result p2

    .line 123
    invoke-virtual {p3, p2, p1}, Lcom/google/protobuf/UnknownFieldSetLite;->storeField(ILjava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    return v2

    .line 127
    :cond_8
    invoke-virtual {p2, v2}, Lcom/google/protobuf/B;->x(I)V

    .line 128
    .line 129
    .line 130
    iget-object p1, p2, Lcom/google/protobuf/B;->a:Lcom/google/protobuf/CodedInputStream;

    .line 131
    .line 132
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readFixed64()J

    .line 133
    .line 134
    .line 135
    move-result-wide p1

    .line 136
    check-cast p3, Lcom/google/protobuf/UnknownFieldSetLite;

    .line 137
    .line 138
    invoke-static {v1, v2}, Lcom/google/protobuf/WireFormat;->makeTag(II)I

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-virtual {p3, v0, p1}, Lcom/google/protobuf/UnknownFieldSetLite;->storeField(ILjava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    return v2

    .line 150
    :cond_9
    invoke-virtual {p2, v3}, Lcom/google/protobuf/B;->x(I)V

    .line 151
    .line 152
    .line 153
    iget-object p1, p2, Lcom/google/protobuf/B;->a:Lcom/google/protobuf/CodedInputStream;

    .line 154
    .line 155
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt64()J

    .line 156
    .line 157
    .line 158
    move-result-wide p1

    .line 159
    check-cast p3, Lcom/google/protobuf/UnknownFieldSetLite;

    .line 160
    .line 161
    invoke-static {v1, v3}, Lcom/google/protobuf/WireFormat;->makeTag(II)I

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    invoke-virtual {p3, v0, p1}, Lcom/google/protobuf/UnknownFieldSetLite;->storeField(ILjava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    return v2
.end method

.method public abstract c(Ljava/lang/Object;Ljava/lang/Object;)V
.end method
