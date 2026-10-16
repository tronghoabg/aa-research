.class public final Lad/Z;
.super Lio/flutter/plugin/platform/f;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LG9/e;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lad/Z;->a:I

    .line 5
    sget-object v0, Luc/w;->a:Luc/w;

    invoke-direct {p0, v0}, Lio/flutter/plugin/platform/f;-><init>(Luc/w;)V

    .line 6
    iput-object p1, p0, Lad/Z;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/unity3d/services/core/webview/b;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lad/Z;->a:I

    .line 3
    sget-object v0, Lhd/f;->d:Lhd/f;

    invoke-direct {p0, v0}, Lio/flutter/plugin/platform/f;-><init>(Luc/w;)V

    .line 4
    iput-object p1, p0, Lad/Z;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lkd/d;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lad/Z;->a:I

    .line 1
    sget-object v0, Luc/w;->a:Luc/w;

    invoke-direct {p0, v0}, Lio/flutter/plugin/platform/f;-><init>(Luc/w;)V

    .line 2
    iput-object p1, p0, Lad/Z;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final create(Landroid/content/Context;ILjava/lang/Object;)Lio/flutter/plugin/platform/e;
    .locals 5

    .line 1
    const/4 p2, 0x0

    .line 2
    const/4 v0, 0x1

    .line 3
    iget-object v1, p0, Lad/Z;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iget v2, p0, Lad/Z;->a:I

    .line 6
    .line 7
    packed-switch v2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object p1, p3

    .line 11
    check-cast p1, Ljava/lang/Integer;

    .line 12
    .line 13
    if-eqz p1, :cond_2

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    int-to-long p1, p1

    .line 20
    check-cast v1, Lkd/d;

    .line 21
    .line 22
    invoke-virtual {v1, p1, p2}, Lkd/d;->e(J)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    instance-of p2, p1, Lio/flutter/plugin/platform/e;

    .line 27
    .line 28
    if-eqz p2, :cond_0

    .line 29
    .line 30
    check-cast p1, Lio/flutter/plugin/platform/e;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    instance-of p2, p1, Landroid/view/View;

    .line 34
    .line 35
    if-eqz p2, :cond_1

    .line 36
    .line 37
    new-instance p2, Lad/N;

    .line 38
    .line 39
    check-cast p1, Landroid/view/View;

    .line 40
    .line 41
    invoke-direct {p2, p1, v0}, Lad/N;-><init>(Landroid/view/View;I)V

    .line 42
    .line 43
    .line 44
    move-object p1, p2

    .line 45
    :goto_0
    return-object p1

    .line 46
    :cond_1
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    new-instance v0, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    const-string v1, "Unable to find a PlatformView or View instance: "

    .line 51
    .line 52
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string p3, ", "

    .line 59
    .line 60
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw p2

    .line 74
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 75
    .line 76
    const-string p2, "An identifier is required to retrieve a View instance."

    .line 77
    .line 78
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    throw p1

    .line 82
    :pswitch_0
    check-cast p3, Lhd/h;

    .line 83
    .line 84
    invoke-static {p3}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    iget-object p2, p3, Lhd/h;->a:Ljava/lang/Long;

    .line 88
    .line 89
    check-cast v1, Lcom/unity3d/services/core/webview/b;

    .line 90
    .line 91
    iget-object p3, v1, Lcom/unity3d/services/core/webview/b;->b:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast p3, Landroid/util/LongSparseArray;

    .line 94
    .line 95
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 96
    .line 97
    .line 98
    move-result-wide v0

    .line 99
    invoke-virtual {p3, v0, v1}, Landroid/util/LongSparseArray;->get(J)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    check-cast p2, Lhd/o;

    .line 104
    .line 105
    iget-object p2, p2, Lhd/o;->d:LU1/m;

    .line 106
    .line 107
    new-instance p3, Lad/Y;

    .line 108
    .line 109
    invoke-direct {p3, p1, p2}, Lad/Y;-><init>(Landroid/content/Context;LU1/m;)V

    .line 110
    .line 111
    .line 112
    return-object p3

    .line 113
    :pswitch_1
    const-class v2, Lad/Z;

    .line 114
    .line 115
    const-string v3, "This ad may have not been loaded or has been disposed. Ad with the following id could not be found: %d."

    .line 116
    .line 117
    if-nez p3, :cond_3

    .line 118
    .line 119
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 120
    .line 121
    .line 122
    move-result-object p3

    .line 123
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    new-array v0, v0, [Ljava/lang/Object;

    .line 128
    .line 129
    aput-object v1, v0, p2

    .line 130
    .line 131
    invoke-static {p3, v3, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p2

    .line 135
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p3

    .line 139
    invoke-static {p3, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 140
    .line 141
    .line 142
    new-instance p2, Lad/Y;

    .line 143
    .line 144
    invoke-direct {p2, p1}, Lad/Y;-><init>(Landroid/content/Context;)V

    .line 145
    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_3
    check-cast p3, Ljava/lang/Integer;

    .line 149
    .line 150
    check-cast v1, LG9/e;

    .line 151
    .line 152
    iget-object v1, v1, LG9/e;->c:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v1, Ljava/util/HashMap;

    .line 155
    .line 156
    invoke-virtual {v1, p3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    check-cast v1, Lad/i;

    .line 161
    .line 162
    if-eqz v1, :cond_5

    .line 163
    .line 164
    invoke-virtual {v1}, Lad/i;->b()Lio/flutter/plugin/platform/e;

    .line 165
    .line 166
    .line 167
    move-result-object v4

    .line 168
    if-nez v4, :cond_4

    .line 169
    .line 170
    goto :goto_1

    .line 171
    :cond_4
    invoke-virtual {v1}, Lad/i;->b()Lio/flutter/plugin/platform/e;

    .line 172
    .line 173
    .line 174
    move-result-object p2

    .line 175
    goto :goto_2

    .line 176
    :cond_5
    :goto_1
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    new-array v0, v0, [Ljava/lang/Object;

    .line 181
    .line 182
    aput-object p3, v0, p2

    .line 183
    .line 184
    invoke-static {v1, v3, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p2

    .line 188
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object p3

    .line 192
    invoke-static {p3, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 193
    .line 194
    .line 195
    new-instance p2, Lad/Y;

    .line 196
    .line 197
    invoke-direct {p2, p1}, Lad/Y;-><init>(Landroid/content/Context;)V

    .line 198
    .line 199
    .line 200
    :goto_2
    return-object p2

    .line 201
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
