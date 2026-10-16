.class public abstract LA/f0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    sget-object v0, LA/b0;->b:LS3/e;

    .line 2
    .line 3
    const/high16 v1, 0x3f800000    # 1.0f

    .line 4
    .line 5
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    new-instance v3, Lef/k;

    .line 10
    .line 11
    invoke-direct {v3, v0, v2}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    sget-object v0, LA/b0;->h:LS3/e;

    .line 15
    .line 16
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    new-instance v4, Lef/k;

    .line 21
    .line 22
    invoke-direct {v4, v0, v2}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    sget v0, LL0/g;->c:I

    .line 26
    .line 27
    sget-object v0, LA/b0;->g:LS3/e;

    .line 28
    .line 29
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    new-instance v2, Lef/k;

    .line 34
    .line 35
    invoke-direct {v2, v0, v1}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    sget-object v0, LA/b0;->a:LS3/e;

    .line 39
    .line 40
    const v1, 0x3c23d70a    # 0.01f

    .line 41
    .line 42
    .line 43
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    new-instance v5, Lef/k;

    .line 48
    .line 49
    invoke-direct {v5, v0, v1}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    sget-object v0, LA/b0;->i:LS3/e;

    .line 53
    .line 54
    const/high16 v1, 0x3f000000    # 0.5f

    .line 55
    .line 56
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    new-instance v7, Lef/k;

    .line 61
    .line 62
    invoke-direct {v7, v0, v6}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    sget v0, Ld0/f;->d:I

    .line 66
    .line 67
    sget-object v0, LA/b0;->e:LS3/e;

    .line 68
    .line 69
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    new-instance v8, Lef/k;

    .line 74
    .line 75
    invoke-direct {v8, v0, v6}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    sget v0, Ld0/c;->e:I

    .line 79
    .line 80
    sget-object v0, LA/b0;->f:LS3/e;

    .line 81
    .line 82
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    new-instance v6, Lef/k;

    .line 87
    .line 88
    invoke-direct {v6, v0, v1}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    sget-object v0, LA/b0;->c:LS3/e;

    .line 92
    .line 93
    const v1, 0x3dcccccd    # 0.1f

    .line 94
    .line 95
    .line 96
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 97
    .line 98
    .line 99
    move-result-object v9

    .line 100
    new-instance v10, Lef/k;

    .line 101
    .line 102
    invoke-direct {v10, v0, v9}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    sget v0, LL0/e;->c:I

    .line 106
    .line 107
    sget-object v0, LA/b0;->d:LS3/e;

    .line 108
    .line 109
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    new-instance v9, Lef/k;

    .line 114
    .line 115
    invoke-direct {v9, v0, v1}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    const/16 v0, 0x9

    .line 119
    .line 120
    new-array v0, v0, [Lef/k;

    .line 121
    .line 122
    const/4 v1, 0x0

    .line 123
    aput-object v3, v0, v1

    .line 124
    .line 125
    const/4 v1, 0x1

    .line 126
    aput-object v4, v0, v1

    .line 127
    .line 128
    const/4 v1, 0x2

    .line 129
    aput-object v2, v0, v1

    .line 130
    .line 131
    const/4 v1, 0x3

    .line 132
    aput-object v5, v0, v1

    .line 133
    .line 134
    const/4 v1, 0x4

    .line 135
    aput-object v7, v0, v1

    .line 136
    .line 137
    const/4 v1, 0x5

    .line 138
    aput-object v8, v0, v1

    .line 139
    .line 140
    const/4 v1, 0x6

    .line 141
    aput-object v6, v0, v1

    .line 142
    .line 143
    const/4 v1, 0x7

    .line 144
    aput-object v10, v0, v1

    .line 145
    .line 146
    const/16 v1, 0x8

    .line 147
    .line 148
    aput-object v9, v0, v1

    .line 149
    .line 150
    invoke-static {v0}, Lff/A;->R([Lef/k;)Ljava/util/Map;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    sput-object v0, LA/f0;->a:Ljava/lang/Object;

    .line 155
    .line 156
    return-void
.end method
