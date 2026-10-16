.class public final LE9/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LE9/d;->a:I

    iput-object p1, p0, LE9/d;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 4

    .line 1
    iget-object v0, p0, LE9/d;->b:Ljava/lang/Object;

    .line 2
    .line 3
    iget v1, p0, LE9/d;->a:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast v0, Lq/J;

    .line 9
    .line 10
    iget-object v1, v0, Lq/J;->H:Lq/M;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    sget-object v2, Lk1/S;->a:Ljava/util/WeakHashMap;

    .line 16
    .line 17
    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    iget-object v2, v0, Lq/J;->F:Landroid/graphics/Rect;

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    invoke-virtual {v0}, Lq/J;->q()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Lq/F0;->show()V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-virtual {v0}, Lq/F0;->dismiss()V

    .line 39
    .line 40
    .line 41
    :goto_0
    return-void

    .line 42
    :pswitch_0
    check-cast v0, Lq/M;

    .line 43
    .line 44
    invoke-virtual {v0}, Lq/M;->getInternalPopup()Lq/L;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-interface {v1}, Lq/L;->a()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-nez v1, :cond_1

    .line 53
    .line 54
    invoke-static {v0}, Lq/E;->b(Landroid/view/View;)I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    invoke-static {v0}, Lq/E;->a(Landroid/view/View;)I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    iget-object v3, v0, Lq/M;->f:Lq/L;

    .line 63
    .line 64
    invoke-interface {v3, v1, v2}, Lq/L;->i(II)V

    .line 65
    .line 66
    .line 67
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    if-eqz v0, :cond_2

    .line 72
    .line 73
    invoke-static {v0, p0}, Lq/D;->a(Landroid/view/ViewTreeObserver;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 74
    .line 75
    .line 76
    :cond_2
    return-void

    .line 77
    :pswitch_1
    check-cast v0, Lp/C;

    .line 78
    .line 79
    invoke-virtual {v0}, Lp/C;->a()Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-eqz v1, :cond_5

    .line 84
    .line 85
    iget-object v1, v0, Lp/C;->h:Lq/L0;

    .line 86
    .line 87
    iget-boolean v2, v1, Lq/F0;->y:Z

    .line 88
    .line 89
    if-nez v2, :cond_5

    .line 90
    .line 91
    iget-object v2, v0, Lp/C;->m:Landroid/view/View;

    .line 92
    .line 93
    if-eqz v2, :cond_4

    .line 94
    .line 95
    invoke-virtual {v2}, Landroid/view/View;->isShown()Z

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    if-nez v2, :cond_3

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_3
    invoke-virtual {v1}, Lq/F0;->show()V

    .line 103
    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_4
    :goto_1
    invoke-virtual {v0}, Lp/C;->dismiss()V

    .line 107
    .line 108
    .line 109
    :cond_5
    :goto_2
    return-void

    .line 110
    :pswitch_2
    check-cast v0, Lp/e;

    .line 111
    .line 112
    invoke-virtual {v0}, Lp/e;->a()Z

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    if-eqz v1, :cond_8

    .line 117
    .line 118
    iget-object v1, v0, Lp/e;->h:Ljava/util/ArrayList;

    .line 119
    .line 120
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    if-lez v2, :cond_8

    .line 125
    .line 126
    const/4 v2, 0x0

    .line 127
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    check-cast v2, Lp/d;

    .line 132
    .line 133
    iget-object v2, v2, Lp/d;->a:Lq/L0;

    .line 134
    .line 135
    iget-boolean v2, v2, Lq/F0;->y:Z

    .line 136
    .line 137
    if-nez v2, :cond_8

    .line 138
    .line 139
    iget-object v2, v0, Lp/e;->o:Landroid/view/View;

    .line 140
    .line 141
    if-eqz v2, :cond_7

    .line 142
    .line 143
    invoke-virtual {v2}, Landroid/view/View;->isShown()Z

    .line 144
    .line 145
    .line 146
    move-result v2

    .line 147
    if-nez v2, :cond_6

    .line 148
    .line 149
    goto :goto_4

    .line 150
    :cond_6
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    if-eqz v1, :cond_8

    .line 159
    .line 160
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    check-cast v1, Lp/d;

    .line 165
    .line 166
    iget-object v1, v1, Lp/d;->a:Lq/L0;

    .line 167
    .line 168
    invoke-virtual {v1}, Lq/F0;->show()V

    .line 169
    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_7
    :goto_4
    invoke-virtual {v0}, Lp/e;->dismiss()V

    .line 173
    .line 174
    .line 175
    :cond_8
    return-void

    .line 176
    :pswitch_3
    check-cast v0, Ll4/g;

    .line 177
    .line 178
    iget-object v1, v0, Ll4/g;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 179
    .line 180
    invoke-virtual {v1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    invoke-virtual {v1, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 185
    .line 186
    .line 187
    iget v1, v0, Ll4/g;->p:I

    .line 188
    .line 189
    const/4 v2, 0x2

    .line 190
    if-eq v1, v2, :cond_9

    .line 191
    .line 192
    const/4 v3, 0x3

    .line 193
    if-ne v1, v3, :cond_b

    .line 194
    .line 195
    :cond_9
    if-ne v1, v2, :cond_b

    .line 196
    .line 197
    iget-object v1, v0, Ll4/g;->c:Ll4/e;

    .line 198
    .line 199
    iget v1, v1, Ll4/e;->u:I

    .line 200
    .line 201
    if-gez v1, :cond_a

    .line 202
    .line 203
    goto :goto_5

    .line 204
    :cond_a
    iget-object v0, v0, Ll4/g;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 205
    .line 206
    new-instance v2, LR3/c;

    .line 207
    .line 208
    const/4 v3, 0x4

    .line 209
    invoke-direct {v2, p0, v1, v3}, LR3/c;-><init>(Ljava/lang/Object;II)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v0, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 213
    .line 214
    .line 215
    :cond_b
    :goto_5
    return-void

    .line 216
    :pswitch_4
    check-cast v0, LE9/g;

    .line 217
    .line 218
    iget-object v0, v0, LE9/g;->i:Landroid/widget/ImageView;

    .line 219
    .line 220
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 225
    .line 226
    .line 227
    return-void

    .line 228
    :pswitch_5
    check-cast v0, LE9/e;

    .line 229
    .line 230
    iget-object v0, v0, LE9/e;->i:Landroid/widget/ImageView;

    .line 231
    .line 232
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 237
    .line 238
    .line 239
    return-void

    .line 240
    nop

    .line 241
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
