.class public final LVa/tb;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/Class;

.field public b:Ljava/lang/String;

.field public c:Ljava/util/ArrayList;


# direct methods
.method public static a(Ljava/lang/String;IIIZ)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, [C

    .line 6
    .line 7
    sget-object v0, LVa/Ab;->x:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    new-array v1, p1, [C

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    sput v2, LVa/Ab;->v:I

    .line 14
    .line 15
    :goto_0
    sget v3, LVa/Ab;->v:I

    .line 16
    .line 17
    if-ge v3, p1, :cond_0

    .line 18
    .line 19
    aget-char v4, p0, v3

    .line 20
    .line 21
    add-int/2addr v4, p2

    .line 22
    int-to-char v4, v4

    .line 23
    aput-char v4, v1, v3

    .line 24
    .line 25
    add-int/lit8 v4, v4, -0x7

    .line 26
    .line 27
    int-to-char v4, v4

    .line 28
    aput-char v4, v1, v3

    .line 29
    .line 30
    add-int/lit8 v3, v3, 0x1

    .line 31
    .line 32
    sput v3, LVa/Ab;->v:I

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception p0

    .line 36
    goto :goto_2

    .line 37
    :cond_0
    if-lez p3, :cond_1

    .line 38
    .line 39
    sput p3, LVa/Ab;->w:I

    .line 40
    .line 41
    new-array p0, p1, [C

    .line 42
    .line 43
    invoke-static {v1, v2, p0, v2, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 44
    .line 45
    .line 46
    sget p2, LVa/Ab;->w:I

    .line 47
    .line 48
    sub-int p3, p1, p2

    .line 49
    .line 50
    invoke-static {p0, v2, v1, p3, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 51
    .line 52
    .line 53
    sget p2, LVa/Ab;->w:I

    .line 54
    .line 55
    sub-int p3, p1, p2

    .line 56
    .line 57
    invoke-static {p0, p2, v1, v2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 58
    .line 59
    .line 60
    :cond_1
    if-eqz p4, :cond_3

    .line 61
    .line 62
    new-array p0, p1, [C

    .line 63
    .line 64
    sput v2, LVa/Ab;->v:I

    .line 65
    .line 66
    :goto_1
    sget p2, LVa/Ab;->v:I

    .line 67
    .line 68
    if-ge p2, p1, :cond_2

    .line 69
    .line 70
    sub-int p3, p1, p2

    .line 71
    .line 72
    add-int/lit8 p3, p3, -0x1

    .line 73
    .line 74
    aget-char p3, v1, p3

    .line 75
    .line 76
    aput-char p3, p0, p2

    .line 77
    .line 78
    add-int/lit8 p2, p2, 0x1

    .line 79
    .line 80
    sput p2, LVa/Ab;->v:I

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_2
    move-object v1, p0

    .line 84
    :cond_3
    new-instance p0, Ljava/lang/String;

    .line 85
    .line 86
    invoke-direct {p0, v1}, Ljava/lang/String;-><init>([C)V

    .line 87
    .line 88
    .line 89
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    return-object p0

    .line 91
    :goto_2
    monitor-exit v0

    .line 92
    throw p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    if-eqz p1, :cond_4

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-class v1, LVa/tb;

    .line 12
    .line 13
    if-eq v1, v0, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    check-cast p1, LVa/tb;

    .line 17
    .line 18
    iget-object v0, p0, LVa/tb;->a:Ljava/lang/Class;

    .line 19
    .line 20
    iget-object v1, p1, LVa/tb;->a:Ljava/lang/Class;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_2

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_2
    iget-object v0, p0, LVa/tb;->b:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v1, p1, LVa/tb;->b:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_3

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_3
    iget-object v0, p0, LVa/tb;->c:Ljava/util/ArrayList;

    .line 41
    .line 42
    iget-object p1, p1, LVa/tb;->c:Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    return p1

    .line 49
    :cond_4
    :goto_0
    const/4 p1, 0x0

    .line 50
    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, LVa/tb;->a:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, LVa/tb;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v0

    .line 16
    mul-int/lit8 v1, v1, 0x1f

    .line 17
    .line 18
    iget-object v0, p0, LVa/tb;->c:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/util/ArrayList;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, v1

    .line 25
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 11

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    shr-int/lit8 v1, v1, 0x16

    .line 8
    .line 9
    rsub-int/lit8 v1, v1, 0x11

    .line 10
    .line 11
    const-string v2, ""

    .line 12
    .line 13
    const/16 v3, 0x30

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    invoke-static {v2, v3, v4, v4}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CII)I

    .line 17
    .line 18
    .line 19
    move-result v5

    .line 20
    rsub-int/lit8 v5, v5, 0x6d

    .line 21
    .line 22
    invoke-static {v4}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 23
    .line 24
    .line 25
    move-result v6

    .line 26
    add-int/lit8 v6, v6, 0x2

    .line 27
    .line 28
    const-string v7, "\u0007\u0014\uffe6\ufffe\r\u0001\u0008\ufffd\uffdd\ufffe\uffff\u0002\u0007\u0002\r\u0002\u0008"

    .line 29
    .line 30
    invoke-static {v7, v1, v5, v6, v4}, LVa/tb;->a(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-static {v4}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    .line 42
    .line 43
    .line 44
    move-result-wide v5

    .line 45
    const-wide/16 v7, 0x0

    .line 46
    .line 47
    cmp-long v1, v5, v7

    .line 48
    .line 49
    add-int/lit8 v1, v1, 0xd

    .line 50
    .line 51
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    .line 52
    .line 53
    .line 54
    move-result-wide v5

    .line 55
    const-wide/16 v9, -0x1

    .line 56
    .line 57
    cmp-long v5, v5, v9

    .line 58
    .line 59
    add-int/lit8 v5, v5, 0x67

    .line 60
    .line 61
    invoke-static {v4}, Landroid/graphics/Color;->blue(I)I

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    add-int/lit8 v6, v6, 0x4

    .line 66
    .line 67
    const-string v9, "\u0000\u0012\u0012\uffdc\u000c\uffee\u0001\t\u0004\u0002\u0013\uffe2\u000b"

    .line 68
    .line 69
    invoke-static {v9, v1, v5, v6, v4}, LVa/tb;->a(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    iget-object v1, p0, LVa/tb;->a:Ljava/lang/Class;

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-static {v7, v8}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    rsub-int/lit8 v1, v1, 0xf

    .line 90
    .line 91
    invoke-static {v2, v3, v4}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    add-int/lit8 v5, v5, 0x5d

    .line 96
    .line 97
    invoke-static {v2, v3, v4, v4}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CII)I

    .line 98
    .line 99
    .line 100
    move-result v6

    .line 101
    add-int/lit8 v6, v6, 0x6

    .line 102
    .line 103
    const/4 v9, 0x1

    .line 104
    const-string v10, "\u0010\ufff8\u0018\uffcb\uffd7\uffd2\uffe8\u0010\u0018\u000c\ufff9\u000f\u001a\u0013\u001f"

    .line 105
    .line 106
    invoke-static {v10, v1, v5, v6, v9}, LVa/tb;->a(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    iget-object v1, p0, LVa/tb;->b:Ljava/lang/String;

    .line 118
    .line 119
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    const/16 v1, 0x27

    .line 123
    .line 124
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-static {v2}, Landroid/os/Process;->getGidForName(Ljava/lang/String;)I

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    add-int/lit8 v1, v1, 0xf

    .line 132
    .line 133
    invoke-static {v4}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    .line 134
    .line 135
    .line 136
    move-result-wide v5

    .line 137
    cmp-long v5, v5, v7

    .line 138
    .line 139
    rsub-int/lit8 v5, v5, 0x60

    .line 140
    .line 141
    invoke-static {v2, v3, v4, v4}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CII)I

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    rsub-int/lit8 v2, v2, 0x2

    .line 146
    .line 147
    const-string v3, "\u000c\u001a\uffe4\uffd3\uffc7\u0014\uffe8\u0019\u000e\uffea\u0013\u0008\u001a\u001a"

    .line 148
    .line 149
    invoke-static {v3, v1, v5, v2, v4}, LVa/tb;->a(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    iget-object v1, p0, LVa/tb;->c:Ljava/util/ArrayList;

    .line 161
    .line 162
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    const/16 v1, 0x7d

    .line 166
    .line 167
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    return-object v0
.end method
