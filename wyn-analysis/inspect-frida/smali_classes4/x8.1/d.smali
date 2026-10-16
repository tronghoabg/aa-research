.class public final Lx8/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx8/a;


# instance fields
.field public a:Ljava/util/HashSet;

.field public b:Lw8/b;


# virtual methods
.method public final a(Ljava/util/HashSet;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lx8/d;->a:Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/HashSet;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_a

    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/util/HashSet;->size()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    const/16 v4, 0x32

    .line 32
    .line 33
    if-ge v3, v4, :cond_a

    .line 34
    .line 35
    sget-object v3, Lx8/b;->a:Ll8/P;

    .line 36
    .line 37
    if-nez v2, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-nez v3, :cond_1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    const/4 v3, 0x0

    .line 48
    invoke-virtual {v2, v3}, Ljava/lang/String;->codePointAt(I)I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    invoke-static {v4}, Ljava/lang/Character;->isLetter(I)Z

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    const/16 v6, 0x5f

    .line 57
    .line 58
    if-nez v5, :cond_2

    .line 59
    .line 60
    if-eq v4, v6, :cond_2

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    invoke-static {v4}, Ljava/lang/Character;->charCount(I)I

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    :goto_1
    if-ge v4, v5, :cond_4

    .line 72
    .line 73
    invoke-virtual {v2, v4}, Ljava/lang/String;->codePointAt(I)I

    .line 74
    .line 75
    .line 76
    move-result v7

    .line 77
    if-eq v7, v6, :cond_3

    .line 78
    .line 79
    invoke-static {v7}, Ljava/lang/Character;->isLetterOrDigit(I)Z

    .line 80
    .line 81
    .line 82
    move-result v8

    .line 83
    if-nez v8, :cond_3

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_3
    invoke-static {v7}, Ljava/lang/Character;->charCount(I)I

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    add-int/2addr v4, v7

    .line 91
    goto :goto_1

    .line 92
    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    if-nez v4, :cond_5

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_5
    invoke-virtual {v2, v3}, Ljava/lang/String;->codePointAt(I)I

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    invoke-static {v3}, Ljava/lang/Character;->isLetter(I)Z

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    if-nez v4, :cond_6

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_6
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 111
    .line 112
    .line 113
    move-result v4

    .line 114
    invoke-static {v3}, Ljava/lang/Character;->charCount(I)I

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    :goto_2
    if-ge v3, v4, :cond_8

    .line 119
    .line 120
    invoke-virtual {v2, v3}, Ljava/lang/String;->codePointAt(I)I

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    if-eq v5, v6, :cond_7

    .line 125
    .line 126
    invoke-static {v5}, Ljava/lang/Character;->isLetterOrDigit(I)Z

    .line 127
    .line 128
    .line 129
    move-result v7

    .line 130
    if-nez v7, :cond_7

    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_7
    invoke-static {v5}, Ljava/lang/Character;->charCount(I)I

    .line 134
    .line 135
    .line 136
    move-result v5

    .line 137
    add-int/2addr v3, v5

    .line 138
    goto :goto_2

    .line 139
    :cond_8
    sget-object v3, LA7/I0;->a:[Ljava/lang/String;

    .line 140
    .line 141
    sget-object v4, LA7/I0;->c:[Ljava/lang/String;

    .line 142
    .line 143
    invoke-static {v2, v3, v4}, LA7/I0;->c(Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    if-eqz v3, :cond_9

    .line 148
    .line 149
    move-object v2, v3

    .line 150
    :cond_9
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    goto/16 :goto_0

    .line 154
    .line 155
    :cond_a
    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 156
    .line 157
    .line 158
    return-void
.end method
