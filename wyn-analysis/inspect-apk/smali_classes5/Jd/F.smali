.class public final synthetic LJd/F;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LJd/H;


# direct methods
.method public synthetic constructor <init>(LJd/H;I)V
    .locals 0

    .line 1
    iput p2, p0, LJd/F;->a:I

    iput-object p1, p0, LJd/F;->b:LJd/H;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 12

    .line 1
    const/4 v0, -0x1

    .line 2
    const/16 v1, 0x40

    .line 3
    .line 4
    const/16 v2, 0x3a

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x4

    .line 8
    const/4 v5, 0x6

    .line 9
    const/16 v6, 0x23

    .line 10
    .line 11
    const/4 v7, 0x0

    .line 12
    const-string v8, "substring(...)"

    .line 13
    .line 14
    const-string v9, ""

    .line 15
    .line 16
    iget-object v10, p0, LJd/F;->b:LJd/H;

    .line 17
    .line 18
    iget v11, p0, LJd/F;->a:I

    .line 19
    .line 20
    packed-switch v11, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    iget-object v0, v10, LJd/H;->f:Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {v0, v6, v7, v5}, LBf/k;->v0(Ljava/lang/CharSequence;CII)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    add-int/lit8 v0, v0, 0x1

    .line 30
    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    iget-object v1, v10, LJd/H;->f:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v9

    .line 40
    invoke-static {v9, v8}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    :goto_0
    return-object v9

    .line 44
    :pswitch_0
    iget-object v0, v10, LJd/H;->d:Ljava/lang/String;

    .line 45
    .line 46
    if-nez v0, :cond_1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_2

    .line 54
    .line 55
    move-object v3, v9

    .line 56
    goto :goto_1

    .line 57
    :cond_2
    iget-object v0, v10, LJd/H;->h:LJd/D;

    .line 58
    .line 59
    iget-object v0, v0, LJd/D;->a:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    add-int/lit8 v0, v0, 0x3

    .line 66
    .line 67
    iget-object v3, v10, LJd/H;->f:Ljava/lang/String;

    .line 68
    .line 69
    invoke-static {v3, v2, v0, v4}, LBf/k;->v0(Ljava/lang/CharSequence;CII)I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    add-int/lit8 v0, v0, 0x1

    .line 74
    .line 75
    invoke-static {v3, v1, v7, v5}, LBf/k;->v0(Ljava/lang/CharSequence;CII)I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    invoke-virtual {v3, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    invoke-static {v3, v8}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    :goto_1
    return-object v3

    .line 87
    :pswitch_1
    iget-object v0, v10, LJd/H;->c:Ljava/lang/String;

    .line 88
    .line 89
    if-nez v0, :cond_3

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_3
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-nez v0, :cond_4

    .line 97
    .line 98
    move-object v3, v9

    .line 99
    goto :goto_2

    .line 100
    :cond_4
    iget-object v0, v10, LJd/H;->h:LJd/D;

    .line 101
    .line 102
    iget-object v0, v0, LJd/D;->a:Ljava/lang/String;

    .line 103
    .line 104
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    add-int/lit8 v0, v0, 0x3

    .line 109
    .line 110
    const/4 v1, 0x2

    .line 111
    new-array v1, v1, [C

    .line 112
    .line 113
    fill-array-data v1, :array_0

    .line 114
    .line 115
    .line 116
    iget-object v2, v10, LJd/H;->f:Ljava/lang/String;

    .line 117
    .line 118
    invoke-static {v2, v1, v0, v7}, LBf/k;->x0(Ljava/lang/CharSequence;[CIZ)I

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    invoke-static {v3, v8}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    :goto_2
    return-object v3

    .line 130
    :pswitch_2
    iget-object v1, v10, LJd/H;->f:Ljava/lang/String;

    .line 131
    .line 132
    iget-object v2, v10, LJd/H;->h:LJd/D;

    .line 133
    .line 134
    iget-object v2, v2, LJd/D;->a:Ljava/lang/String;

    .line 135
    .line 136
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    add-int/lit8 v2, v2, 0x3

    .line 141
    .line 142
    const/16 v3, 0x2f

    .line 143
    .line 144
    invoke-static {v1, v3, v2, v4}, LBf/k;->v0(Ljava/lang/CharSequence;CII)I

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    if-ne v1, v0, :cond_5

    .line 149
    .line 150
    goto :goto_3

    .line 151
    :cond_5
    iget-object v2, v10, LJd/H;->f:Ljava/lang/String;

    .line 152
    .line 153
    invoke-static {v2, v6, v1, v4}, LBf/k;->v0(Ljava/lang/CharSequence;CII)I

    .line 154
    .line 155
    .line 156
    move-result v3

    .line 157
    if-ne v3, v0, :cond_6

    .line 158
    .line 159
    invoke-virtual {v2, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v9

    .line 163
    invoke-static {v9, v8}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    goto :goto_3

    .line 167
    :cond_6
    invoke-virtual {v2, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v9

    .line 171
    invoke-static {v9, v8}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    :goto_3
    return-object v9

    .line 175
    :pswitch_3
    iget-object v1, v10, LJd/H;->f:Ljava/lang/String;

    .line 176
    .line 177
    const/16 v2, 0x3f

    .line 178
    .line 179
    invoke-static {v1, v2, v7, v5}, LBf/k;->v0(Ljava/lang/CharSequence;CII)I

    .line 180
    .line 181
    .line 182
    move-result v1

    .line 183
    add-int/lit8 v1, v1, 0x1

    .line 184
    .line 185
    if-nez v1, :cond_7

    .line 186
    .line 187
    goto :goto_4

    .line 188
    :cond_7
    iget-object v2, v10, LJd/H;->f:Ljava/lang/String;

    .line 189
    .line 190
    invoke-static {v2, v6, v1, v4}, LBf/k;->v0(Ljava/lang/CharSequence;CII)I

    .line 191
    .line 192
    .line 193
    move-result v3

    .line 194
    if-ne v3, v0, :cond_8

    .line 195
    .line 196
    invoke-virtual {v2, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v9

    .line 200
    invoke-static {v9, v8}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    goto :goto_4

    .line 204
    :cond_8
    invoke-virtual {v2, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v9

    .line 208
    invoke-static {v9, v8}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    :goto_4
    return-object v9

    .line 212
    nop

    .line 213
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    :array_0
    .array-data 2
        0x3as
        0x40s
    .end array-data
.end method
