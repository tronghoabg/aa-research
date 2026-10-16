.class public final synthetic Lkd/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lba/a;


# direct methods
.method public synthetic constructor <init>(Lba/a;I)V
    .locals 0

    .line 1
    iput p2, p0, Lkd/y;->a:I

    iput-object p1, p0, Lkd/y;->b:Lba/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    sget-object v0, Lef/C;->a:Lef/C;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, ", Stacktrace: "

    .line 5
    .line 6
    const-string v3, "Cause: "

    .line 7
    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x1

    .line 10
    const/4 v6, 0x0

    .line 11
    const/4 v7, 0x3

    .line 12
    iget-object v8, p0, Lkd/y;->b:Lba/a;

    .line 13
    .line 14
    iget v9, p0, Lkd/y;->a:I

    .line 15
    .line 16
    check-cast p1, Lef/n;

    .line 17
    .line 18
    packed-switch v9, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    iget-object v9, p1, Lef/n;->a:Ljava/lang/Object;

    .line 22
    .line 23
    invoke-static {v9}, Lef/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 24
    .line 25
    .line 26
    move-result-object v9

    .line 27
    if-eqz v9, :cond_1

    .line 28
    .line 29
    instance-of p1, v9, Lkd/a;

    .line 30
    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    check-cast v9, Lkd/a;

    .line 34
    .line 35
    iget-object p1, v9, Lkd/a;->b:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v1, v9, Lkd/a;->c:Ljava/lang/String;

    .line 38
    .line 39
    iget-object v2, v9, Lkd/a;->a:Ljava/lang/String;

    .line 40
    .line 41
    new-array v3, v7, [Ljava/lang/Object;

    .line 42
    .line 43
    aput-object v2, v3, v6

    .line 44
    .line 45
    aput-object p1, v3, v5

    .line 46
    .line 47
    aput-object v1, v3, v4

    .line 48
    .line 49
    invoke-static {v3}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {v9}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v9}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    invoke-static {v9}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    invoke-static {v3, v2, v5, v4}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    filled-new-array {p1, v1, v2}, [Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-static {p1}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    :goto_0
    invoke-virtual {v8, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_1
    iget-object p1, p1, Lef/n;->a:Ljava/lang/Object;

    .line 91
    .line 92
    instance-of v2, p1, Lef/m;

    .line 93
    .line 94
    if-eqz v2, :cond_2

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_2
    move-object v1, p1

    .line 98
    :goto_1
    check-cast v1, Ljava/lang/String;

    .line 99
    .line 100
    invoke-static {v1}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-virtual {v8, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    :goto_2
    return-object v0

    .line 108
    :pswitch_0
    iget-object v9, p1, Lef/n;->a:Ljava/lang/Object;

    .line 109
    .line 110
    invoke-static {v9}, Lef/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 111
    .line 112
    .line 113
    move-result-object v9

    .line 114
    if-eqz v9, :cond_4

    .line 115
    .line 116
    instance-of p1, v9, Lkd/a;

    .line 117
    .line 118
    if-eqz p1, :cond_3

    .line 119
    .line 120
    check-cast v9, Lkd/a;

    .line 121
    .line 122
    iget-object p1, v9, Lkd/a;->b:Ljava/lang/String;

    .line 123
    .line 124
    iget-object v1, v9, Lkd/a;->c:Ljava/lang/String;

    .line 125
    .line 126
    iget-object v2, v9, Lkd/a;->a:Ljava/lang/String;

    .line 127
    .line 128
    new-array v3, v7, [Ljava/lang/Object;

    .line 129
    .line 130
    aput-object v2, v3, v6

    .line 131
    .line 132
    aput-object p1, v3, v5

    .line 133
    .line 134
    aput-object v1, v3, v4

    .line 135
    .line 136
    invoke-static {v3}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    goto :goto_3

    .line 141
    :cond_3
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    invoke-virtual {v9}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    invoke-virtual {v9}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    invoke-static {v9}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v5

    .line 161
    invoke-static {v3, v2, v5, v4}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    filled-new-array {p1, v1, v2}, [Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    invoke-static {p1}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    :goto_3
    invoke-virtual {v8, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    goto :goto_5

    .line 177
    :cond_4
    iget-object p1, p1, Lef/n;->a:Ljava/lang/Object;

    .line 178
    .line 179
    instance-of v2, p1, Lef/m;

    .line 180
    .line 181
    if-eqz v2, :cond_5

    .line 182
    .line 183
    goto :goto_4

    .line 184
    :cond_5
    move-object v1, p1

    .line 185
    :goto_4
    check-cast v1, Ljava/lang/Boolean;

    .line 186
    .line 187
    invoke-static {v1}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    invoke-virtual {v8, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    :goto_5
    return-object v0

    .line 195
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
