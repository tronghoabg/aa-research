.class public final enum Lae/e;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final b:Lae/d;

.field public static final enum c:Lae/e;

.field public static final enum d:Lae/e;

.field public static final enum e:Lae/e;

.field public static final enum f:Lae/e;

.field public static final enum g:Lae/e;

.field public static final enum h:Lae/e;

.field public static final enum i:Lae/e;

.field public static final enum j:Lae/e;

.field public static final synthetic k:[Lae/e;

.field public static final synthetic l:Lmf/b;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 22

    .line 1
    new-instance v0, Lae/e;

    .line 2
    .line 3
    const-string v1, "unknown"

    .line 4
    .line 5
    const-string v2, "Unknown"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v2, v3, v1}, Lae/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lae/e;->c:Lae/e;

    .line 12
    .line 13
    new-instance v1, Lae/e;

    .line 14
    .line 15
    const-string v2, "url"

    .line 16
    .line 17
    const-string v4, "Url"

    .line 18
    .line 19
    const/4 v5, 0x1

    .line 20
    invoke-direct {v1, v4, v5, v2}, Lae/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v1, Lae/e;->d:Lae/e;

    .line 24
    .line 25
    new-instance v2, Lae/e;

    .line 26
    .line 27
    const-string v4, "deeplink"

    .line 28
    .line 29
    const-string v6, "DeepLink"

    .line 30
    .line 31
    const/4 v7, 0x2

    .line 32
    invoke-direct {v2, v6, v7, v4}, Lae/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v2, Lae/e;->e:Lae/e;

    .line 36
    .line 37
    new-instance v4, Lae/e;

    .line 38
    .line 39
    const-string v6, "navigation"

    .line 40
    .line 41
    const-string v8, "Navigation"

    .line 42
    .line 43
    const/4 v9, 0x3

    .line 44
    invoke-direct {v4, v8, v9, v6}, Lae/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v4, Lae/e;->f:Lae/e;

    .line 48
    .line 49
    new-instance v6, Lae/e;

    .line 50
    .line 51
    const-string v8, "purchase"

    .line 52
    .line 53
    const-string v10, "Purchase"

    .line 54
    .line 55
    const/4 v11, 0x4

    .line 56
    invoke-direct {v6, v10, v11, v8}, Lae/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sput-object v6, Lae/e;->g:Lae/e;

    .line 60
    .line 61
    new-instance v8, Lae/e;

    .line 62
    .line 63
    const-string v10, "restore"

    .line 64
    .line 65
    const-string v12, "Restore"

    .line 66
    .line 67
    const/4 v13, 0x5

    .line 68
    invoke-direct {v8, v12, v13, v10}, Lae/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 69
    .line 70
    .line 71
    sput-object v8, Lae/e;->h:Lae/e;

    .line 72
    .line 73
    new-instance v10, Lae/e;

    .line 74
    .line 75
    const-string v12, "close"

    .line 76
    .line 77
    const-string v14, "Close"

    .line 78
    .line 79
    const/4 v15, 0x6

    .line 80
    invoke-direct {v10, v14, v15, v12}, Lae/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 81
    .line 82
    .line 83
    sput-object v10, Lae/e;->i:Lae/e;

    .line 84
    .line 85
    new-instance v12, Lae/e;

    .line 86
    .line 87
    const-string v14, "closeAll"

    .line 88
    .line 89
    move/from16 v16, v5

    .line 90
    .line 91
    const-string v5, "CloseAll"

    .line 92
    .line 93
    move/from16 v17, v7

    .line 94
    .line 95
    const/4 v7, 0x7

    .line 96
    invoke-direct {v12, v5, v7, v14}, Lae/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 97
    .line 98
    .line 99
    sput-object v12, Lae/e;->j:Lae/e;

    .line 100
    .line 101
    new-instance v5, Lae/e;

    .line 102
    .line 103
    const-string v14, "getProducts"

    .line 104
    .line 105
    move/from16 v18, v7

    .line 106
    .line 107
    const-string v7, "LoadProducts"

    .line 108
    .line 109
    move/from16 v19, v9

    .line 110
    .line 111
    const/16 v9, 0x8

    .line 112
    .line 113
    invoke-direct {v5, v7, v9, v14}, Lae/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 114
    .line 115
    .line 116
    new-instance v7, Lae/e;

    .line 117
    .line 118
    const-string v14, "showScreen"

    .line 119
    .line 120
    move/from16 v20, v9

    .line 121
    .line 122
    const-string v9, "ShowScreen"

    .line 123
    .line 124
    move/from16 v21, v11

    .line 125
    .line 126
    const/16 v11, 0x9

    .line 127
    .line 128
    invoke-direct {v7, v9, v11, v14}, Lae/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 129
    .line 130
    .line 131
    const/16 v9, 0xa

    .line 132
    .line 133
    new-array v9, v9, [Lae/e;

    .line 134
    .line 135
    aput-object v0, v9, v3

    .line 136
    .line 137
    aput-object v1, v9, v16

    .line 138
    .line 139
    aput-object v2, v9, v17

    .line 140
    .line 141
    aput-object v4, v9, v19

    .line 142
    .line 143
    aput-object v6, v9, v21

    .line 144
    .line 145
    aput-object v8, v9, v13

    .line 146
    .line 147
    aput-object v10, v9, v15

    .line 148
    .line 149
    aput-object v12, v9, v18

    .line 150
    .line 151
    aput-object v5, v9, v20

    .line 152
    .line 153
    aput-object v7, v9, v11

    .line 154
    .line 155
    sput-object v9, Lae/e;->k:[Lae/e;

    .line 156
    .line 157
    invoke-static {v9}, Lic/d;->t([Ljava/lang/Enum;)Lmf/b;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    sput-object v0, Lae/e;->l:Lmf/b;

    .line 162
    .line 163
    new-instance v0, Lae/d;

    .line 164
    .line 165
    invoke-direct {v0, v3}, Lae/d;-><init>(I)V

    .line 166
    .line 167
    .line 168
    sput-object v0, Lae/e;->b:Lae/d;

    .line 169
    .line 170
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lae/e;->a:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lae/e;
    .locals 1

    .line 1
    const-class v0, Lae/e;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lae/e;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lae/e;
    .locals 1

    .line 1
    sget-object v0, Lae/e;->k:[Lae/e;

    .line 2
    .line 3
    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lae/e;

    .line 8
    .line 9
    return-object v0
.end method
