.class public Lcom/google/firebase/inappmessaging/display/FirebaseInAppMessagingDisplayRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-fiamd"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a(Lcom/google/firebase/inappmessaging/display/FirebaseInAppMessagingDisplayRegistrar;LC6/l;)LB9/f;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/firebase/inappmessaging/display/FirebaseInAppMessagingDisplayRegistrar;->buildFirebaseInAppMessagingUI(LL8/c;)LB9/f;

    move-result-object p0

    return-object p0
.end method

.method private buildFirebaseInAppMessagingUI(LL8/c;)LB9/f;
    .locals 13

    .line 1
    const-class v0, Ls8/g;

    .line 2
    .line 3
    invoke-interface {p1, v0}, LL8/c;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ls8/g;

    .line 8
    .line 9
    const-class v1, Lz9/B;

    .line 10
    .line 11
    invoke-interface {p1, v1}, LL8/c;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Lz9/B;

    .line 16
    .line 17
    invoke-virtual {v0}, Ls8/g;->a()V

    .line 18
    .line 19
    .line 20
    iget-object v0, v0, Ls8/g;->a:Landroid/content/Context;

    .line 21
    .line 22
    check-cast v0, Landroid/app/Application;

    .line 23
    .line 24
    new-instance v1, Ly3/j;

    .line 25
    .line 26
    const/16 v2, 0x9

    .line 27
    .line 28
    invoke-direct {v1, v0, v2}, Ly3/j;-><init>(Ljava/lang/Object;I)V

    .line 29
    .line 30
    .line 31
    new-instance v2, Lza/a;

    .line 32
    .line 33
    const/16 v3, 0x12

    .line 34
    .line 35
    invoke-direct {v2, v3}, Lza/a;-><init>(I)V

    .line 36
    .line 37
    .line 38
    new-instance v3, LS3/q;

    .line 39
    .line 40
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 41
    .line 42
    .line 43
    new-instance v4, LG9/a;

    .line 44
    .line 45
    const/4 v5, 0x0

    .line 46
    invoke-direct {v4, v1, v5}, LG9/a;-><init>(Ljava/lang/Object;I)V

    .line 47
    .line 48
    .line 49
    invoke-static {v4}, LC9/a;->a(Ldf/a;)Ldf/a;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    iput-object v1, v3, LS3/q;->a:Ljava/lang/Object;

    .line 54
    .line 55
    sget-object v1, LD9/e;->b:LD9/f;

    .line 56
    .line 57
    invoke-static {v1}, LC9/a;->a(Ldf/a;)Ldf/a;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    iput-object v1, v3, LS3/q;->b:Ljava/lang/Object;

    .line 62
    .line 63
    iget-object v1, v3, LS3/q;->a:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v1, Ldf/a;

    .line 66
    .line 67
    new-instance v4, LD9/b;

    .line 68
    .line 69
    const/4 v5, 0x0

    .line 70
    invoke-direct {v4, v1, v5}, LD9/b;-><init>(Ldf/a;I)V

    .line 71
    .line 72
    .line 73
    invoke-static {v4}, LC9/a;->a(Ldf/a;)Ldf/a;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    iput-object v1, v3, LS3/q;->c:Ljava/lang/Object;

    .line 78
    .line 79
    iget-object v1, v3, LS3/q;->a:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v1, Ldf/a;

    .line 82
    .line 83
    new-instance v4, LG9/d;

    .line 84
    .line 85
    invoke-direct {v4, v2, v1}, LG9/d;-><init>(Lza/a;Ldf/a;)V

    .line 86
    .line 87
    .line 88
    new-instance v1, LG9/c;

    .line 89
    .line 90
    const/4 v5, 0x7

    .line 91
    invoke-direct {v1, v2, v4, v5}, LG9/c;-><init>(Lza/a;LG9/d;I)V

    .line 92
    .line 93
    .line 94
    iput-object v1, v3, LS3/q;->d:Ljava/lang/Object;

    .line 95
    .line 96
    new-instance v1, LG9/c;

    .line 97
    .line 98
    const/4 v5, 0x4

    .line 99
    invoke-direct {v1, v2, v4, v5}, LG9/c;-><init>(Lza/a;LG9/d;I)V

    .line 100
    .line 101
    .line 102
    iput-object v1, v3, LS3/q;->e:Ljava/lang/Object;

    .line 103
    .line 104
    new-instance v1, LG9/c;

    .line 105
    .line 106
    const/4 v5, 0x5

    .line 107
    invoke-direct {v1, v2, v4, v5}, LG9/c;-><init>(Lza/a;LG9/d;I)V

    .line 108
    .line 109
    .line 110
    iput-object v1, v3, LS3/q;->f:Ljava/lang/Object;

    .line 111
    .line 112
    new-instance v1, LG9/c;

    .line 113
    .line 114
    const/4 v5, 0x6

    .line 115
    invoke-direct {v1, v2, v4, v5}, LG9/c;-><init>(Lza/a;LG9/d;I)V

    .line 116
    .line 117
    .line 118
    iput-object v1, v3, LS3/q;->g:Ljava/lang/Object;

    .line 119
    .line 120
    new-instance v1, LG9/c;

    .line 121
    .line 122
    const/4 v5, 0x2

    .line 123
    invoke-direct {v1, v2, v4, v5}, LG9/c;-><init>(Lza/a;LG9/d;I)V

    .line 124
    .line 125
    .line 126
    iput-object v1, v3, LS3/q;->h:Ljava/lang/Object;

    .line 127
    .line 128
    new-instance v1, LG9/c;

    .line 129
    .line 130
    const/4 v5, 0x3

    .line 131
    invoke-direct {v1, v2, v4, v5}, LG9/c;-><init>(Lza/a;LG9/d;I)V

    .line 132
    .line 133
    .line 134
    iput-object v1, v3, LS3/q;->i:Ljava/lang/Object;

    .line 135
    .line 136
    new-instance v1, LG9/c;

    .line 137
    .line 138
    const/4 v5, 0x1

    .line 139
    invoke-direct {v1, v2, v4, v5}, LG9/c;-><init>(Lza/a;LG9/d;I)V

    .line 140
    .line 141
    .line 142
    iput-object v1, v3, LS3/q;->j:Ljava/lang/Object;

    .line 143
    .line 144
    new-instance v1, LG9/c;

    .line 145
    .line 146
    const/4 v5, 0x0

    .line 147
    invoke-direct {v1, v2, v4, v5}, LG9/c;-><init>(Lza/a;LG9/d;I)V

    .line 148
    .line 149
    .line 150
    iput-object v1, v3, LS3/q;->k:Ljava/lang/Object;

    .line 151
    .line 152
    new-instance v1, LS3/l;

    .line 153
    .line 154
    invoke-direct {v1, p1}, LS3/l;-><init>(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    new-instance p1, Lya/b;

    .line 158
    .line 159
    const/16 v2, 0x12

    .line 160
    .line 161
    invoke-direct {p1, v2}, Lya/b;-><init>(I)V

    .line 162
    .line 163
    .line 164
    new-instance v2, LG9/a;

    .line 165
    .line 166
    const/4 v4, 0x2

    .line 167
    invoke-direct {v2, v1, v4}, LG9/a;-><init>(Ljava/lang/Object;I)V

    .line 168
    .line 169
    .line 170
    invoke-static {v2}, LC9/a;->a(Ldf/a;)Ldf/a;

    .line 171
    .line 172
    .line 173
    move-result-object v6

    .line 174
    new-instance v7, LF9/a;

    .line 175
    .line 176
    const/4 v1, 0x2

    .line 177
    invoke-direct {v7, v3, v1}, LF9/a;-><init>(LS3/q;I)V

    .line 178
    .line 179
    .line 180
    new-instance v10, LF9/a;

    .line 181
    .line 182
    const/4 v1, 0x3

    .line 183
    invoke-direct {v10, v3, v1}, LF9/a;-><init>(LS3/q;I)V

    .line 184
    .line 185
    .line 186
    new-instance v1, LG9/a;

    .line 187
    .line 188
    invoke-direct {v1, p1, v10}, LG9/a;-><init>(Lya/b;LF9/a;)V

    .line 189
    .line 190
    .line 191
    invoke-static {v1}, LC9/a;->a(Ldf/a;)Ldf/a;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    new-instance v1, LD9/b;

    .line 196
    .line 197
    const/4 v2, 0x1

    .line 198
    invoke-direct {v1, p1, v2}, LD9/b;-><init>(Ldf/a;I)V

    .line 199
    .line 200
    .line 201
    invoke-static {v1}, LC9/a;->a(Ldf/a;)Ldf/a;

    .line 202
    .line 203
    .line 204
    move-result-object v8

    .line 205
    new-instance v9, LF9/a;

    .line 206
    .line 207
    const/4 p1, 0x0

    .line 208
    invoke-direct {v9, v3, p1}, LF9/a;-><init>(LS3/q;I)V

    .line 209
    .line 210
    .line 211
    new-instance v11, LF9/a;

    .line 212
    .line 213
    const/4 p1, 0x1

    .line 214
    invoke-direct {v11, v3, p1}, LF9/a;-><init>(LS3/q;I)V

    .line 215
    .line 216
    .line 217
    sget-object p1, LD9/e;->a:LD9/f;

    .line 218
    .line 219
    invoke-static {p1}, LC9/a;->a(Ldf/a;)Ldf/a;

    .line 220
    .line 221
    .line 222
    move-result-object v12

    .line 223
    new-instance v5, LB9/g;

    .line 224
    .line 225
    invoke-direct/range {v5 .. v12}, LB9/g;-><init>(Ldf/a;LF9/a;Ldf/a;LF9/a;LF9/a;LF9/a;Ldf/a;)V

    .line 226
    .line 227
    .line 228
    invoke-static {v5}, LC9/a;->a(Ldf/a;)Ldf/a;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    check-cast p1, LC9/a;

    .line 233
    .line 234
    invoke-virtual {p1}, LC9/a;->get()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    check-cast p1, LB9/f;

    .line 239
    .line 240
    invoke-virtual {v0, p1}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 241
    .line 242
    .line 243
    return-object p1
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 5
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LL8/b;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    const-class v2, LB9/f;

    .line 4
    .line 5
    invoke-static {v2}, LL8/b;->b(Ljava/lang/Class;)LL8/a;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    const-string v3, "fire-fiamd"

    .line 10
    .line 11
    iput-object v3, v2, LL8/a;->a:Ljava/lang/Object;

    .line 12
    .line 13
    const-class v4, Ls8/g;

    .line 14
    .line 15
    invoke-static {v4}, LL8/l;->d(Ljava/lang/Class;)LL8/l;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-virtual {v2, v4}, LL8/a;->c(LL8/l;)V

    .line 20
    .line 21
    .line 22
    const-class v4, Lz9/B;

    .line 23
    .line 24
    invoke-static {v4}, LL8/l;->d(Ljava/lang/Class;)LL8/l;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-virtual {v2, v4}, LL8/a;->c(LL8/l;)V

    .line 29
    .line 30
    .line 31
    new-instance v4, LB8/b;

    .line 32
    .line 33
    invoke-direct {v4, p0, v1}, LB8/b;-><init>(Ljava/lang/Object;I)V

    .line 34
    .line 35
    .line 36
    iput-object v4, v2, LL8/a;->g:Ljava/lang/Object;

    .line 37
    .line 38
    invoke-virtual {v2, v0}, LL8/a;->f(I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2}, LL8/a;->d()LL8/b;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    const-string v4, "21.0.1"

    .line 46
    .line 47
    invoke-static {v3, v4}, Lic/d;->m(Ljava/lang/String;Ljava/lang/String;)LL8/b;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    new-array v0, v0, [LL8/b;

    .line 52
    .line 53
    const/4 v4, 0x0

    .line 54
    aput-object v2, v0, v4

    .line 55
    .line 56
    aput-object v3, v0, v1

    .line 57
    .line 58
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    return-object v0
.end method
