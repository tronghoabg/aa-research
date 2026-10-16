.class public final LFe/l;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:LFe/m;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/lang/String;


# direct methods
.method public constructor <init>(LFe/m;Ljava/lang/String;Ljava/lang/String;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LFe/l;->c:LFe/m;

    .line 2
    .line 3
    iput-object p2, p0, LFe/l;->d:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, LFe/l;->e:Ljava/lang/String;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Llf/j;-><init>(ILjf/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 4

    .line 1
    new-instance v0, LFe/l;

    .line 2
    .line 3
    iget-object v1, p0, LFe/l;->d:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, LFe/l;->e:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, LFe/l;->c:LFe/m;

    .line 8
    .line 9
    invoke-direct {v0, v3, v1, v2, p2}, LFe/l;-><init>(LFe/m;Ljava/lang/String;Ljava/lang/String;Ljf/c;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, LFe/l;->b:Ljava/lang/Object;

    .line 13
    .line 14
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LEf/E;

    .line 2
    .line 3
    check-cast p2, Ljf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LFe/l;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LFe/l;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LFe/l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    iget v1, p0, LFe/l;->a:I

    .line 4
    .line 5
    sget-object v2, Lef/C;->a:Lef/C;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    const/4 v5, 0x2

    .line 10
    iget-object v6, p0, LFe/l;->c:LFe/m;

    .line 11
    .line 12
    if-eqz v1, :cond_2

    .line 13
    .line 14
    if-eq v1, v4, :cond_1

    .line 15
    .line 16
    if-ne v1, v5, :cond_0

    .line 17
    .line 18
    :try_start_0
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catch Lbe/b; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    goto :goto_2

    .line 22
    :catch_0
    move-exception p1

    .line 23
    goto/16 :goto_3

    .line 24
    .line 25
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p1

    .line 33
    :cond_1
    iget-object v1, p0, LFe/l;->b:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v1, LEf/E;

    .line 36
    .line 37
    :try_start_1
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_1
    .catch Lbe/b; {:try_start_1 .. :try_end_1} :catch_0

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, LFe/l;->b:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p1, LEf/E;

    .line 47
    .line 48
    iget-object v1, v6, LA7/B0;->a:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v1, Lac/a;

    .line 51
    .line 52
    const-string v7, "ScreenPresenter -> loading the screen to present"

    .line 53
    .line 54
    invoke-virtual {v1, v7}, Lac/a;->O(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    :try_start_2
    iget-object v1, p0, LFe/l;->d:Ljava/lang/String;

    .line 58
    .line 59
    if-eqz v1, :cond_4

    .line 60
    .line 61
    iget-object v7, v6, LFe/m;->b:LCe/a;

    .line 62
    .line 63
    iput-object p1, p0, LFe/l;->b:Ljava/lang/Object;

    .line 64
    .line 65
    iput v4, p0, LFe/l;->a:I

    .line 66
    .line 67
    invoke-virtual {v7, v1, p0}, LCe/a;->e0(Ljava/lang/String;Llf/c;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    if-ne p1, v0, :cond_3

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_3
    :goto_0
    check-cast p1, Lqe/a;

    .line 75
    .line 76
    if-nez p1, :cond_6

    .line 77
    .line 78
    :cond_4
    iget-object p1, p0, LFe/l;->e:Ljava/lang/String;

    .line 79
    .line 80
    if-eqz p1, :cond_7

    .line 81
    .line 82
    iget-object v1, v6, LFe/m;->b:LCe/a;

    .line 83
    .line 84
    iput-object v3, p0, LFe/l;->b:Ljava/lang/Object;

    .line 85
    .line 86
    iput v5, p0, LFe/l;->a:I

    .line 87
    .line 88
    invoke-virtual {v1, p1, p0}, LCe/a;->f0(Ljava/lang/String;Llf/c;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    if-ne p1, v0, :cond_5

    .line 93
    .line 94
    :goto_1
    return-object v0

    .line 95
    :cond_5
    :goto_2
    check-cast p1, Lqe/a;
    :try_end_2
    .catch Lbe/b; {:try_start_2 .. :try_end_2} :catch_0

    .line 96
    .line 97
    :cond_6
    iput-object p1, v6, LFe/m;->h:Lqe/a;

    .line 98
    .line 99
    iget-object v0, p1, Lqe/a;->a:Ljava/lang/String;

    .line 100
    .line 101
    const-string v1, "ScreenPresenter -> displaying the screen with id "

    .line 102
    .line 103
    const-string v3, ", context key: "

    .line 104
    .line 105
    invoke-static {v1, v0, v3}, Lcom/google/android/gms/internal/consent_sdk/a;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    iget-object v1, p1, Lqe/a;->c:Ljava/lang/String;

    .line 110
    .line 111
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    iget-object v1, v6, LA7/B0;->a:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v1, Lac/a;

    .line 121
    .line 122
    invoke-virtual {v1, v0}, Lac/a;->O(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    iget-object v0, v6, LFe/m;->c:LFe/h;

    .line 126
    .line 127
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    iget-object v1, p1, Lqe/a;->a:Ljava/lang/String;

    .line 131
    .line 132
    iget-object p1, p1, Lqe/a;->b:Ljava/lang/String;

    .line 133
    .line 134
    invoke-virtual {v0}, Landroidx/fragment/app/F;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    if-eqz v3, :cond_8

    .line 139
    .line 140
    new-instance v4, LAb/a;

    .line 141
    .line 142
    const/4 v5, 0x3

    .line 143
    invoke-direct {v4, v0, p1, v1, v5}, LAb/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v3, v4}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 147
    .line 148
    .line 149
    return-object v2

    .line 150
    :cond_7
    :try_start_3
    const-string p1, "Neither context key, nor screen id is provided to load screen"

    .line 151
    .line 152
    iget-object v0, v6, LA7/B0;->a:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v0, Lac/a;

    .line 155
    .line 156
    const-string v1, "ScreenPresenter -> Neither context key, nor screen id is provided to load screen"

    .line 157
    .line 158
    invoke-static {v0, v1}, LBa/c;->q(Lac/a;Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    new-instance v0, LG9/e;

    .line 162
    .line 163
    sget-object v1, Lbe/a;->k:Lbe/a;

    .line 164
    .line 165
    invoke-direct {v0, v1, p1, v3}, LG9/e;-><init>(Lbe/a;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 166
    .line 167
    .line 168
    iget-object p1, v6, LFe/m;->d:LC8/i;

    .line 169
    .line 170
    iget-object p1, p1, LC8/i;->e:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast p1, Lre/c;

    .line 173
    .line 174
    if-eqz p1, :cond_8

    .line 175
    .line 176
    invoke-virtual {p1, v0}, Lre/c;->d(LG9/e;)V
    :try_end_3
    .catch Lbe/b; {:try_start_3 .. :try_end_3} :catch_0

    .line 177
    .line 178
    .line 179
    return-object v2

    .line 180
    :goto_3
    iget-object v0, v6, LA7/B0;->a:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast v0, Lac/a;

    .line 183
    .line 184
    new-instance v1, Ljava/lang/StringBuilder;

    .line 185
    .line 186
    const-string v4, "ScreenPresenter -> Failed to fetch No-Code screen. "

    .line 187
    .line 188
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    invoke-static {v0, v1}, LBa/c;->q(Lac/a;Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    iget-object v0, v6, LFe/m;->d:LC8/i;

    .line 202
    .line 203
    iget-object v0, v0, LC8/i;->e:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast v0, Lre/c;

    .line 206
    .line 207
    if-eqz v0, :cond_8

    .line 208
    .line 209
    new-instance v1, LG9/e;

    .line 210
    .line 211
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v4

    .line 215
    iget-object p1, p1, Lbe/b;->a:Lbe/a;

    .line 216
    .line 217
    invoke-direct {v1, p1, v4, v3}, LG9/e;-><init>(Lbe/a;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v0, v1}, Lre/c;->d(LG9/e;)V

    .line 221
    .line 222
    .line 223
    :cond_8
    return-object v2
.end method
