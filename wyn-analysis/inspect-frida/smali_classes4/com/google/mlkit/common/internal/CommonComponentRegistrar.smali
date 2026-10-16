.class public Lcom/google/mlkit/common/internal/CommonComponentRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getComponents()Ljava/util/List;
    .locals 14

    .line 1
    sget-object v0, Lya/k;->b:LL8/b;

    .line 2
    .line 3
    const-class v1, Lza/a;

    .line 4
    .line 5
    invoke-static {v1}, LL8/b;->b(Ljava/lang/Class;)LL8/a;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-class v2, Lya/g;

    .line 10
    .line 11
    invoke-static {v2}, LL8/l;->d(Ljava/lang/Class;)LL8/l;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-virtual {v1, v3}, LL8/a;->c(LL8/l;)V

    .line 16
    .line 17
    .line 18
    new-instance v3, Landroidx/fragment/app/X;

    .line 19
    .line 20
    const/16 v4, 0xe

    .line 21
    .line 22
    invoke-direct {v3, v4}, Landroidx/fragment/app/X;-><init>(I)V

    .line 23
    .line 24
    .line 25
    iput-object v3, v1, LL8/a;->g:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-virtual {v1}, LL8/a;->d()LL8/b;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const-class v3, Lya/h;

    .line 32
    .line 33
    invoke-static {v3}, LL8/b;->b(Ljava/lang/Class;)LL8/a;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    new-instance v5, La2/k;

    .line 38
    .line 39
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object v5, v4, LL8/a;->g:Ljava/lang/Object;

    .line 43
    .line 44
    invoke-virtual {v4}, LL8/a;->d()LL8/b;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    const-class v5, Lxa/d;

    .line 49
    .line 50
    invoke-static {v5}, LL8/b;->b(Ljava/lang/Class;)LL8/a;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    new-instance v6, LL8/l;

    .line 55
    .line 56
    const/4 v7, 0x2

    .line 57
    const/4 v8, 0x0

    .line 58
    const-class v9, Lxa/c;

    .line 59
    .line 60
    invoke-direct {v6, v7, v8, v9}, LL8/l;-><init>(IILjava/lang/Class;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v5, v6}, LL8/a;->c(LL8/l;)V

    .line 64
    .line 65
    .line 66
    new-instance v6, La9/a;

    .line 67
    .line 68
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 69
    .line 70
    .line 71
    iput-object v6, v5, LL8/a;->g:Ljava/lang/Object;

    .line 72
    .line 73
    invoke-virtual {v5}, LL8/a;->d()LL8/b;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    const-class v6, Lya/d;

    .line 78
    .line 79
    invoke-static {v6}, LL8/b;->b(Ljava/lang/Class;)LL8/a;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    new-instance v7, LL8/l;

    .line 84
    .line 85
    const/4 v8, 0x1

    .line 86
    invoke-direct {v7, v8, v8, v3}, LL8/l;-><init>(IILjava/lang/Class;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v6, v7}, LL8/a;->c(LL8/l;)V

    .line 90
    .line 91
    .line 92
    new-instance v3, La9/b;

    .line 93
    .line 94
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 95
    .line 96
    .line 97
    iput-object v3, v6, LL8/a;->g:Ljava/lang/Object;

    .line 98
    .line 99
    invoke-virtual {v6}, LL8/a;->d()LL8/b;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    const-class v6, Lya/a;

    .line 104
    .line 105
    invoke-static {v6}, LL8/b;->b(Ljava/lang/Class;)LL8/a;

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    new-instance v10, Lab/b;

    .line 110
    .line 111
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 112
    .line 113
    .line 114
    iput-object v10, v7, LL8/a;->g:Ljava/lang/Object;

    .line 115
    .line 116
    invoke-virtual {v7}, LL8/a;->d()LL8/b;

    .line 117
    .line 118
    .line 119
    move-result-object v7

    .line 120
    const-class v10, Lya/b;

    .line 121
    .line 122
    invoke-static {v10}, LL8/b;->b(Ljava/lang/Class;)LL8/a;

    .line 123
    .line 124
    .line 125
    move-result-object v10

    .line 126
    invoke-static {v6}, LL8/l;->d(Ljava/lang/Class;)LL8/l;

    .line 127
    .line 128
    .line 129
    move-result-object v6

    .line 130
    invoke-virtual {v10, v6}, LL8/a;->c(LL8/l;)V

    .line 131
    .line 132
    .line 133
    new-instance v6, Lad/r;

    .line 134
    .line 135
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 136
    .line 137
    .line 138
    iput-object v6, v10, LL8/a;->g:Ljava/lang/Object;

    .line 139
    .line 140
    invoke-virtual {v10}, LL8/a;->d()LL8/b;

    .line 141
    .line 142
    .line 143
    move-result-object v6

    .line 144
    const-class v10, Lwa/a;

    .line 145
    .line 146
    invoke-static {v10}, LL8/b;->b(Ljava/lang/Class;)LL8/a;

    .line 147
    .line 148
    .line 149
    move-result-object v11

    .line 150
    invoke-static {v2}, LL8/l;->d(Ljava/lang/Class;)LL8/l;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    invoke-virtual {v11, v2}, LL8/a;->c(LL8/l;)V

    .line 155
    .line 156
    .line 157
    new-instance v2, Lad/I;

    .line 158
    .line 159
    const/16 v12, 0xf

    .line 160
    .line 161
    invoke-direct {v2, v12}, Lad/I;-><init>(I)V

    .line 162
    .line 163
    .line 164
    iput-object v2, v11, LL8/a;->g:Ljava/lang/Object;

    .line 165
    .line 166
    invoke-virtual {v11}, LL8/a;->d()LL8/b;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    invoke-static {v9}, LL8/b;->b(Ljava/lang/Class;)LL8/a;

    .line 171
    .line 172
    .line 173
    move-result-object v9

    .line 174
    iput v8, v9, LL8/a;->c:I

    .line 175
    .line 176
    new-instance v11, LL8/l;

    .line 177
    .line 178
    invoke-direct {v11, v8, v8, v10}, LL8/l;-><init>(IILjava/lang/Class;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v9, v11}, LL8/a;->c(LL8/l;)V

    .line 182
    .line 183
    .line 184
    new-instance v8, Lae/b;

    .line 185
    .line 186
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 187
    .line 188
    .line 189
    iput-object v8, v9, LL8/a;->g:Ljava/lang/Object;

    .line 190
    .line 191
    invoke-virtual {v9}, LL8/a;->d()LL8/b;

    .line 192
    .line 193
    .line 194
    move-result-object v8

    .line 195
    move-object v13, v7

    .line 196
    move-object v7, v2

    .line 197
    move-object v2, v4

    .line 198
    move-object v4, v3

    .line 199
    move-object v3, v5

    .line 200
    move-object v5, v13

    .line 201
    invoke-static/range {v0 .. v8}, Lcom/google/android/gms/internal/mlkit_common/zzaf;->zzi(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_common/zzaf;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    return-object v0
.end method
