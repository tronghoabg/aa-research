.class public final LF9/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldf/a;


# instance fields
.field public final synthetic a:I

.field public final b:LS3/q;


# direct methods
.method public synthetic constructor <init>(LS3/q;I)V
    .locals 0

    .line 1
    iput p2, p0, LF9/a;->a:I

    iput-object p1, p0, LF9/a;->b:LS3/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, LF9/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LF9/a;->b:LS3/q;

    .line 7
    .line 8
    iget-object v0, v0, LS3/q;->a:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ldf/a;

    .line 11
    .line 12
    invoke-interface {v0}, Ldf/a;->get()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Landroid/app/Application;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_0
    new-instance v0, Ljava/lang/NullPointerException;

    .line 22
    .line 23
    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 24
    .line 25
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw v0

    .line 29
    :pswitch_0
    iget-object v0, p0, LF9/a;->b:LS3/q;

    .line 30
    .line 31
    new-instance v1, LY9/c;

    .line 32
    .line 33
    const/4 v2, 0x6

    .line 34
    invoke-direct {v1, v2}, LY9/c;-><init>(I)V

    .line 35
    .line 36
    .line 37
    iget-object v2, v0, LS3/q;->d:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v2, LG9/c;

    .line 40
    .line 41
    iget-object v1, v1, LY9/c;->b:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 44
    .line 45
    const-string v3, "IMAGE_ONLY_PORTRAIT"

    .line 46
    .line 47
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    iget-object v2, v0, LS3/q;->e:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v2, LG9/c;

    .line 53
    .line 54
    const-string v3, "IMAGE_ONLY_LANDSCAPE"

    .line 55
    .line 56
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    iget-object v2, v0, LS3/q;->f:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v2, LG9/c;

    .line 62
    .line 63
    const-string v3, "MODAL_LANDSCAPE"

    .line 64
    .line 65
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    iget-object v2, v0, LS3/q;->g:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v2, LG9/c;

    .line 71
    .line 72
    const-string v3, "MODAL_PORTRAIT"

    .line 73
    .line 74
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    iget-object v2, v0, LS3/q;->h:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v2, LG9/c;

    .line 80
    .line 81
    const-string v3, "CARD_LANDSCAPE"

    .line 82
    .line 83
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    iget-object v2, v0, LS3/q;->i:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v2, LG9/c;

    .line 89
    .line 90
    const-string v3, "CARD_PORTRAIT"

    .line 91
    .line 92
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    iget-object v2, v0, LS3/q;->j:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v2, LG9/c;

    .line 98
    .line 99
    const-string v3, "BANNER_PORTRAIT"

    .line 100
    .line 101
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    iget-object v0, v0, LS3/q;->k:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v0, LG9/c;

    .line 107
    .line 108
    const-string v2, "BANNER_LANDSCAPE"

    .line 109
    .line 110
    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-eqz v0, :cond_1

    .line 118
    .line 119
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_1
    invoke-static {v1}, Lj$/util/DesugarCollections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    :goto_0
    if-eqz v0, :cond_2

    .line 127
    .line 128
    check-cast v0, Ljava/util/Map;

    .line 129
    .line 130
    return-object v0

    .line 131
    :cond_2
    new-instance v0, Ljava/lang/NullPointerException;

    .line 132
    .line 133
    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 134
    .line 135
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    throw v0

    .line 139
    :pswitch_1
    iget-object v0, p0, LF9/a;->b:LS3/q;

    .line 140
    .line 141
    iget-object v0, v0, LS3/q;->c:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v0, Ldf/a;

    .line 144
    .line 145
    invoke-interface {v0}, Ldf/a;->get()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    check-cast v0, LD9/a;

    .line 150
    .line 151
    if-eqz v0, :cond_3

    .line 152
    .line 153
    return-object v0

    .line 154
    :cond_3
    new-instance v0, Ljava/lang/NullPointerException;

    .line 155
    .line 156
    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 157
    .line 158
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    throw v0

    .line 162
    :pswitch_2
    iget-object v0, p0, LF9/a;->b:LS3/q;

    .line 163
    .line 164
    iget-object v0, v0, LS3/q;->b:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v0, Ldf/a;

    .line 167
    .line 168
    invoke-interface {v0}, Ldf/a;->get()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    check-cast v0, LD9/i;

    .line 173
    .line 174
    if-eqz v0, :cond_4

    .line 175
    .line 176
    return-object v0

    .line 177
    :cond_4
    new-instance v0, Ljava/lang/NullPointerException;

    .line 178
    .line 179
    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 180
    .line 181
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    throw v0

    .line 185
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
