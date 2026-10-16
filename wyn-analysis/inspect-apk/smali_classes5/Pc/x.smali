.class public final synthetic LPc/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luc/b;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lc8/e;


# direct methods
.method public synthetic constructor <init>(Lc8/e;I)V
    .locals 0

    .line 1
    iput p2, p0, LPc/x;->a:I

    iput-object p1, p0, LPc/x;->b:Lc8/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Lba/a;)V
    .locals 7

    .line 1
    iget v0, p0, LPc/x;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "android.intent.action.VIEW"

    .line 7
    .line 8
    new-instance v1, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    check-cast p1, Ljava/util/ArrayList;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    check-cast v3, Ljava/lang/String;

    .line 21
    .line 22
    const/4 v4, 0x1

    .line 23
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Ljava/lang/String;

    .line 28
    .line 29
    iget-object v4, p0, LPc/x;->b:Lc8/e;

    .line 30
    .line 31
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    sget-object v4, LPc/l;->a:Ljava/util/HashMap;

    .line 35
    .line 36
    invoke-virtual {v4, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    check-cast v3, LK8/B;

    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    const-string v4, "qrCodeUrl cannot be empty."

    .line 46
    .line 47
    invoke-static {p1, v4}, Lcom/google/android/gms/common/internal/v;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/high16 v4, 0x10000000

    .line 51
    .line 52
    :try_start_0
    iget-object v5, v3, LK8/B;->g:Lcom/google/firebase/auth/FirebaseAuth;

    .line 53
    .line 54
    iget-object v5, v5, Lcom/google/firebase/auth/FirebaseAuth;->a:Ls8/g;

    .line 55
    .line 56
    invoke-virtual {v5}, Ls8/g;->a()V

    .line 57
    .line 58
    .line 59
    new-instance v6, Landroid/content/Intent;

    .line 60
    .line 61
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-direct {v6, v0, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v6, v4}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    iget-object v5, v5, Ls8/g;->a:Landroid/content/Context;

    .line 73
    .line 74
    invoke-virtual {v5, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :catch_0
    iget-object p1, v3, LK8/B;->g:Lcom/google/firebase/auth/FirebaseAuth;

    .line 79
    .line 80
    iget-object p1, p1, Lcom/google/firebase/auth/FirebaseAuth;->a:Ls8/g;

    .line 81
    .line 82
    invoke-virtual {p1}, Ls8/g;->a()V

    .line 83
    .line 84
    .line 85
    new-instance v3, Landroid/content/Intent;

    .line 86
    .line 87
    const-string v5, "https://play.google.com/store/search?q=otpauth&c=apps"

    .line 88
    .line 89
    invoke-static {v5}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    invoke-direct {v3, v0, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v3, v4}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    iget-object p1, p1, Ls8/g;->a:Landroid/content/Context;

    .line 101
    .line 102
    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 103
    .line 104
    .line 105
    :goto_0
    const/4 p1, 0x0

    .line 106
    invoke-virtual {v1, v2, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p2, v1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :pswitch_0
    new-instance v0, Ljava/util/ArrayList;

    .line 114
    .line 115
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 116
    .line 117
    .line 118
    check-cast p1, Ljava/util/ArrayList;

    .line 119
    .line 120
    const/4 v1, 0x0

    .line 121
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    check-cast v2, Ljava/lang/String;

    .line 126
    .line 127
    const/4 v3, 0x1

    .line 128
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    check-cast v3, Ljava/lang/String;

    .line 133
    .line 134
    const/4 v4, 0x2

    .line 135
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    check-cast p1, Ljava/lang/String;

    .line 140
    .line 141
    iget-object v4, p0, LPc/x;->b:Lc8/e;

    .line 142
    .line 143
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    sget-object v4, LPc/l;->a:Ljava/util/HashMap;

    .line 147
    .line 148
    invoke-virtual {v4, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    check-cast v2, LK8/B;

    .line 153
    .line 154
    if-eqz v3, :cond_1

    .line 155
    .line 156
    if-nez p1, :cond_0

    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_0
    invoke-virtual {v2, v3, p1}, LK8/B;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    goto :goto_2

    .line 170
    :cond_1
    :goto_1
    iget-object p1, v2, LK8/B;->g:Lcom/google/firebase/auth/FirebaseAuth;

    .line 171
    .line 172
    iget-object v3, p1, Lcom/google/firebase/auth/FirebaseAuth;->f:LJ8/o;

    .line 173
    .line 174
    const-string v4, "Current user cannot be null, since user is required to be logged in to enroll for TOTP MFA."

    .line 175
    .line 176
    invoke-static {v3, v4}, Lcom/google/android/gms/common/internal/v;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    check-cast v3, LK8/e;

    .line 180
    .line 181
    iget-object v3, v3, LK8/e;->b:LK8/U;

    .line 182
    .line 183
    iget-object v3, v3, LK8/U;->f:Ljava/lang/String;

    .line 184
    .line 185
    const-string v4, "Email cannot be empty, since verified email is required to use MFA."

    .line 186
    .line 187
    invoke-static {v3, v4}, Lcom/google/android/gms/common/internal/v;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    iget-object p1, p1, Lcom/google/firebase/auth/FirebaseAuth;->a:Ls8/g;

    .line 191
    .line 192
    invoke-virtual {p1}, Ls8/g;->a()V

    .line 193
    .line 194
    .line 195
    iget-object p1, p1, Ls8/g;->b:Ljava/lang/String;

    .line 196
    .line 197
    invoke-virtual {v2, v3, p1}, LK8/B;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {p2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    :goto_2
    return-void

    .line 208
    nop

    .line 209
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
