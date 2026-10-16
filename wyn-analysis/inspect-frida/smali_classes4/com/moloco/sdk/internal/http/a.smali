.class public final synthetic Lcom/moloco/sdk/internal/http/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/moloco/sdk/internal/services/w;

.field public final synthetic c:Lcom/moloco/sdk/internal/services/F;


# direct methods
.method public synthetic constructor <init>(Lcom/moloco/sdk/internal/services/w;Lcom/moloco/sdk/internal/services/F;I)V
    .locals 0

    .line 1
    iput p3, p0, Lcom/moloco/sdk/internal/http/a;->a:I

    iput-object p1, p0, Lcom/moloco/sdk/internal/http/a;->b:Lcom/moloco/sdk/internal/services/w;

    iput-object p2, p0, Lcom/moloco/sdk/internal/http/a;->c:Lcom/moloco/sdk/internal/services/F;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    const/16 v1, 0x1c

    .line 3
    .line 4
    sget-object v2, Lef/C;->a:Lef/C;

    .line 5
    .line 6
    iget-object v3, p0, Lcom/moloco/sdk/internal/http/a;->c:Lcom/moloco/sdk/internal/services/F;

    .line 7
    .line 8
    iget-object v4, p0, Lcom/moloco/sdk/internal/http/a;->b:Lcom/moloco/sdk/internal/services/w;

    .line 9
    .line 10
    iget v5, p0, Lcom/moloco/sdk/internal/http/a;->a:I

    .line 11
    .line 12
    packed-switch v5, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p1, LJd/n;

    .line 16
    .line 17
    const-string v0, "$this$headers"

    .line 18
    .line 19
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    new-instance v0, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v1, "AppBundle/"

    .line 25
    .line 26
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iget-object v1, v4, Lcom/moloco/sdk/internal/services/w;->a:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v1, "; AppVersion/"

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    iget-object v1, v4, Lcom/moloco/sdk/internal/services/w;->b:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v1, "; AppKey/"

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    sget-object v1, Lcom/moloco/sdk/publisher/Moloco;->INSTANCE:Lcom/moloco/sdk/publisher/Moloco;

    .line 50
    .line 51
    invoke-virtual {v1}, Lcom/moloco/sdk/publisher/Moloco;->getAppKey$moloco_sdk_release()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const/16 v1, 0x3b

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    const-string v1, "X-Moloco-App-Info"

    .line 68
    .line 69
    invoke-virtual {p1, v1, v0}, LA7/B0;->z(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    new-instance v0, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    const-string v1, "make/"

    .line 75
    .line 76
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    iget-object v1, v3, Lcom/moloco/sdk/internal/services/F;->a:Ljava/lang/String;

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string v1, "; model/"

    .line 85
    .line 86
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    iget-object v1, v3, Lcom/moloco/sdk/internal/services/F;->b:Ljava/lang/String;

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string v1, "; hwv/"

    .line 95
    .line 96
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    iget-object v1, v3, Lcom/moloco/sdk/internal/services/F;->c:Ljava/lang/String;

    .line 100
    .line 101
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string v1, "; osv/"

    .line 105
    .line 106
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 110
    .line 111
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    const-string v1, "; OS/Android;"

    .line 115
    .line 116
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    const-string v1, "X-Moloco-Device-Info"

    .line 124
    .line 125
    invoke-virtual {p1, v1, v0}, LA7/B0;->z(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    const-string v0, "X-Moloco-SDK-Info"

    .line 129
    .line 130
    const-string v1, "SdkVersion/4.8.1"

    .line 131
    .line 132
    invoke-virtual {p1, v0, v1}, LA7/B0;->z(Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    return-object v2

    .line 136
    :pswitch_0
    check-cast p1, LCd/h;

    .line 137
    .line 138
    const-string v0, "$this$defaultRequest"

    .line 139
    .line 140
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    new-instance v0, Lcom/moloco/sdk/internal/http/a;

    .line 144
    .line 145
    const/4 v1, 0x2

    .line 146
    invoke-direct {v0, v4, v3, v1}, Lcom/moloco/sdk/internal/http/a;-><init>(Lcom/moloco/sdk/internal/services/w;Lcom/moloco/sdk/internal/services/F;I)V

    .line 147
    .line 148
    .line 149
    invoke-static {p1, v0}, LFd/e;->a(LJd/r;Ltf/l;)V

    .line 150
    .line 151
    .line 152
    return-object v2

    .line 153
    :pswitch_1
    check-cast p1, Lwd/d;

    .line 154
    .line 155
    const-string v5, "$this$HttpClient"

    .line 156
    .line 157
    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    sget-object v5, LCd/z0;->b:LDd/c;

    .line 161
    .line 162
    new-instance v6, LAd/g;

    .line 163
    .line 164
    const/16 v7, 0x1d

    .line 165
    .line 166
    invoke-direct {v6, v7}, LAd/g;-><init>(I)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {p1, v5, v6}, Lwd/d;->a(LCd/G;Ltf/l;)V

    .line 170
    .line 171
    .line 172
    sget-object v5, LCd/q0;->b:LDd/c;

    .line 173
    .line 174
    new-instance v6, Lcom/moloco/sdk/internal/publisher/d;

    .line 175
    .line 176
    invoke-direct {v6, v1}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {p1, v5, v6}, Lwd/d;->a(LCd/G;Ltf/l;)V

    .line 180
    .line 181
    .line 182
    sget-object v5, LCd/b0;->c:LDd/c;

    .line 183
    .line 184
    new-instance v6, Lcom/moloco/sdk/internal/publisher/d;

    .line 185
    .line 186
    invoke-direct {v6, v1}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {p1, v5, v6}, Lwd/d;->a(LCd/G;Ltf/l;)V

    .line 190
    .line 191
    .line 192
    new-instance v1, Lcom/moloco/sdk/internal/http/a;

    .line 193
    .line 194
    invoke-direct {v1, v4, v3, v0}, Lcom/moloco/sdk/internal/http/a;-><init>(Lcom/moloco/sdk/internal/services/w;Lcom/moloco/sdk/internal/services/F;I)V

    .line 195
    .line 196
    .line 197
    sget-object v3, LCd/k;->a:Lvg/b;

    .line 198
    .line 199
    sget-object v3, LCd/j;->b:LCd/b;

    .line 200
    .line 201
    new-instance v4, LAf/r;

    .line 202
    .line 203
    invoke-direct {v4, v1, v0}, LAf/r;-><init>(Ljava/lang/Object;I)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {p1, v3, v4}, Lwd/d;->a(LCd/G;Ltf/l;)V

    .line 207
    .line 208
    .line 209
    return-object v2

    .line 210
    nop

    .line 211
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
