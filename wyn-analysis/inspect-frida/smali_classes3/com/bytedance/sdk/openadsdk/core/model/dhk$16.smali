.class Lcom/bytedance/sdk/openadsdk/core/model/dhk$16;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/core/model/dhk;->dj()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/core/model/dhk;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/core/model/dhk;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/model/dhk$16;->uef:Lcom/bytedance/sdk/openadsdk/core/model/dhk;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/dhk$16;->uef:Lcom/bytedance/sdk/openadsdk/core/model/dhk;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->cz()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_3

    .line 9
    .line 10
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    if-eq v0, v1, :cond_1

    .line 17
    .line 18
    const/4 v2, 0x2

    .line 19
    if-eq v0, v2, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v0, 0x3

    .line 23
    invoke-virtual {p2, v0}, Landroid/view/MotionEvent;->setAction(I)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/model/dhk$16;->uef:Lcom/bytedance/sdk/openadsdk/core/model/dhk;

    .line 32
    .line 33
    invoke-static {v2}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->oib(Lcom/bytedance/sdk/openadsdk/core/model/dhk;)F

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/core/model/dhk$16;->uef:Lcom/bytedance/sdk/openadsdk/core/model/dhk;

    .line 38
    .line 39
    invoke-static {v3}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->xs(Lcom/bytedance/sdk/openadsdk/core/model/dhk;)Landroid/app/Activity;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-static {v2, v0, v3}, Lcom/bytedance/sdk/openadsdk/utils/af;->uef(FFLandroid/content/Context;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/dhk$16;->uef:Lcom/bytedance/sdk/openadsdk/core/model/dhk;

    .line 50
    .line 51
    const/4 v2, 0x5

    .line 52
    invoke-virtual {v0, v2}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->oa(I)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/dhk$16;->uef:Lcom/bytedance/sdk/openadsdk/core/model/dhk;

    .line 57
    .line 58
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    invoke-static {v0, v2}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->uef(Lcom/bytedance/sdk/openadsdk/core/model/dhk;F)F

    .line 63
    .line 64
    .line 65
    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/dhk$16;->uef:Lcom/bytedance/sdk/openadsdk/core/model/dhk;

    .line 66
    .line 67
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->dhk(Lcom/bytedance/sdk/openadsdk/core/model/dhk;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_4

    .line 72
    .line 73
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-ne v0, v1, :cond_4

    .line 78
    .line 79
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/dhk$16;->uef:Lcom/bytedance/sdk/openadsdk/core/model/dhk;

    .line 80
    .line 81
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->cz(Lcom/bytedance/sdk/openadsdk/core/model/dhk;)Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    if-eqz v0, :cond_4

    .line 86
    .line 87
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/dhk$16;->uef:Lcom/bytedance/sdk/openadsdk/core/model/dhk;

    .line 88
    .line 89
    new-instance v2, Lcom/bytedance/sdk/openadsdk/core/model/dhk$16$1;

    .line 90
    .line 91
    invoke-direct {v2, p0}, Lcom/bytedance/sdk/openadsdk/core/model/dhk$16$1;-><init>(Lcom/bytedance/sdk/openadsdk/core/model/dhk$16;)V

    .line 92
    .line 93
    .line 94
    invoke-static {v0, v2}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->uef(Lcom/bytedance/sdk/openadsdk/core/model/dhk;Ljava/lang/Runnable;)Z

    .line 95
    .line 96
    .line 97
    :cond_4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/dhk$16;->uef:Lcom/bytedance/sdk/openadsdk/core/model/dhk;

    .line 98
    .line 99
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->oa(Lcom/bytedance/sdk/openadsdk/core/model/dhk;)Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_5

    .line 104
    .line 105
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/dhk$16;->uef:Lcom/bytedance/sdk/openadsdk/core/model/dhk;

    .line 106
    .line 107
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->xs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 108
    .line 109
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->zjm(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-eqz v0, :cond_6

    .line 114
    .line 115
    :cond_5
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/dhk$16;->uef:Lcom/bytedance/sdk/openadsdk/core/model/dhk;

    .line 116
    .line 117
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->xs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 118
    .line 119
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->xs(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    if-nez v0, :cond_6

    .line 124
    .line 125
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/model/dhk$16;->uef:Lcom/bytedance/sdk/openadsdk/core/model/dhk;

    .line 126
    .line 127
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->dz:Lcom/bytedance/sdk/openadsdk/core/yo/oa;

    .line 128
    .line 129
    invoke-virtual {v0, p1, p2}, Lcom/bytedance/sdk/openadsdk/core/yo/yo;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z

    .line 130
    .line 131
    .line 132
    :cond_6
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/model/dhk$16;->uef:Lcom/bytedance/sdk/openadsdk/core/model/dhk;

    .line 133
    .line 134
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->oa(Lcom/bytedance/sdk/openadsdk/core/model/dhk;)Z

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    if-eqz p1, :cond_7

    .line 139
    .line 140
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/model/dhk$16;->uef:Lcom/bytedance/sdk/openadsdk/core/model/dhk;

    .line 141
    .line 142
    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->xs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 143
    .line 144
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->zjm(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    if-eqz p1, :cond_8

    .line 149
    .line 150
    :cond_7
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/model/dhk$16;->uef:Lcom/bytedance/sdk/openadsdk/core/model/dhk;

    .line 151
    .line 152
    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->xs:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 153
    .line 154
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->xs(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    if-nez p1, :cond_8

    .line 159
    .line 160
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 161
    .line 162
    .line 163
    move-result p1

    .line 164
    if-ne p1, v1, :cond_8

    .line 165
    .line 166
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/model/dhk$16;->uef:Lcom/bytedance/sdk/openadsdk/core/model/dhk;

    .line 167
    .line 168
    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->dz:Lcom/bytedance/sdk/openadsdk/core/yo/oa;

    .line 169
    .line 170
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/yo/yo;->ivm()Z

    .line 171
    .line 172
    .line 173
    move-result p1

    .line 174
    if-eqz p1, :cond_8

    .line 175
    .line 176
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/model/dhk$16;->uef:Lcom/bytedance/sdk/openadsdk/core/model/dhk;

    .line 177
    .line 178
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->tpx(Lcom/bytedance/sdk/openadsdk/core/model/dhk;)Lcom/bytedance/sdk/component/cz/ivm;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/cz/ivm;->getWebView()Landroid/webkit/WebView;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    invoke-virtual {p1}, Landroid/view/View;->performClick()Z

    .line 187
    .line 188
    .line 189
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/model/dhk$16;->uef:Lcom/bytedance/sdk/openadsdk/core/model/dhk;

    .line 190
    .line 191
    invoke-static {p1, v1}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->uef(Lcom/bytedance/sdk/openadsdk/core/model/dhk;Z)Z

    .line 192
    .line 193
    .line 194
    :cond_8
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/model/dhk$16;->uef:Lcom/bytedance/sdk/openadsdk/core/model/dhk;

    .line 195
    .line 196
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->sy(Lcom/bytedance/sdk/openadsdk/core/model/dhk;)Lcom/bytedance/sdk/openadsdk/moa/cq;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    if-eqz p1, :cond_9

    .line 201
    .line 202
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/model/dhk$16;->uef:Lcom/bytedance/sdk/openadsdk/core/model/dhk;

    .line 203
    .line 204
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->sy(Lcom/bytedance/sdk/openadsdk/core/model/dhk;)Lcom/bytedance/sdk/openadsdk/moa/cq;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/moa/cq;->uef(Landroid/view/MotionEvent;)V

    .line 209
    .line 210
    .line 211
    :cond_9
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/model/dhk$16;->uef:Lcom/bytedance/sdk/openadsdk/core/model/dhk;

    .line 212
    .line 213
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->orq(Lcom/bytedance/sdk/openadsdk/core/model/dhk;)Lcom/bytedance/sdk/openadsdk/common/lw;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    if-eqz p1, :cond_a

    .line 218
    .line 219
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/model/dhk$16;->uef:Lcom/bytedance/sdk/openadsdk/core/model/dhk;

    .line 220
    .line 221
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->orq(Lcom/bytedance/sdk/openadsdk/core/model/dhk;)Lcom/bytedance/sdk/openadsdk/common/lw;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/common/lw;->uef(Landroid/view/MotionEvent;)V

    .line 226
    .line 227
    .line 228
    :cond_a
    const/4 p1, 0x0

    .line 229
    return p1
.end method
