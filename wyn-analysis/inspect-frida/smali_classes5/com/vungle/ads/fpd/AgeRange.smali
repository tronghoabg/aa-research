.class public final enum Lcom/vungle/ads/fpd/AgeRange;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/vungle/ads/fpd/AgeRange$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/vungle/ads/fpd/AgeRange;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000f\u0008\u0086\u0001\u0018\u0000 \u000e2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000cj\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/vungle/ads/fpd/AgeRange;",
        "",
        "",
        "a",
        "I",
        "getId",
        "()I",
        "id",
        "Lzf/g;",
        "b",
        "Lzf/g;",
        "getRange",
        "()Lzf/g;",
        "range",
        "Companion",
        "AGE_18_20",
        "AGE_21_30",
        "AGE_31_40",
        "AGE_41_50",
        "AGE_51_60",
        "AGE_61_70",
        "AGE_71_75",
        "OTHERS",
        "vungle-ads_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# static fields
.field public static final enum AGE_18_20:Lcom/vungle/ads/fpd/AgeRange;

.field public static final enum AGE_21_30:Lcom/vungle/ads/fpd/AgeRange;

.field public static final enum AGE_31_40:Lcom/vungle/ads/fpd/AgeRange;

.field public static final enum AGE_41_50:Lcom/vungle/ads/fpd/AgeRange;

.field public static final enum AGE_51_60:Lcom/vungle/ads/fpd/AgeRange;

.field public static final enum AGE_61_70:Lcom/vungle/ads/fpd/AgeRange;

.field public static final enum AGE_71_75:Lcom/vungle/ads/fpd/AgeRange;

.field public static final Companion:Lcom/vungle/ads/fpd/AgeRange$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final enum OTHERS:Lcom/vungle/ads/fpd/AgeRange;

.field public static final synthetic c:[Lcom/vungle/ads/fpd/AgeRange;


# instance fields
.field public final a:I

.field public final b:Lzf/g;


# direct methods
.method public static constructor <clinit>()V
    .locals 19

    .line 1
    const/4 v0, 0x7

    .line 2
    const/4 v1, 0x6

    .line 3
    const/4 v2, 0x5

    .line 4
    const/4 v3, 0x4

    .line 5
    const/4 v4, 0x3

    .line 6
    const/4 v5, 0x2

    .line 7
    const/4 v6, 0x0

    .line 8
    const/4 v7, 0x1

    .line 9
    new-instance v8, Lcom/vungle/ads/fpd/AgeRange;

    .line 10
    .line 11
    new-instance v9, Lzf/g;

    .line 12
    .line 13
    const/16 v10, 0x12

    .line 14
    .line 15
    const/16 v11, 0x14

    .line 16
    .line 17
    invoke-direct {v9, v10, v11, v7}, Lzf/e;-><init>(III)V

    .line 18
    .line 19
    .line 20
    const-string v10, "AGE_18_20"

    .line 21
    .line 22
    invoke-direct {v8, v10, v6, v7, v9}, Lcom/vungle/ads/fpd/AgeRange;-><init>(Ljava/lang/String;IILzf/g;)V

    .line 23
    .line 24
    .line 25
    sput-object v8, Lcom/vungle/ads/fpd/AgeRange;->AGE_18_20:Lcom/vungle/ads/fpd/AgeRange;

    .line 26
    .line 27
    new-instance v9, Lcom/vungle/ads/fpd/AgeRange;

    .line 28
    .line 29
    new-instance v10, Lzf/g;

    .line 30
    .line 31
    const/16 v11, 0x15

    .line 32
    .line 33
    const/16 v12, 0x1e

    .line 34
    .line 35
    invoke-direct {v10, v11, v12, v7}, Lzf/e;-><init>(III)V

    .line 36
    .line 37
    .line 38
    const-string v11, "AGE_21_30"

    .line 39
    .line 40
    invoke-direct {v9, v11, v7, v5, v10}, Lcom/vungle/ads/fpd/AgeRange;-><init>(Ljava/lang/String;IILzf/g;)V

    .line 41
    .line 42
    .line 43
    sput-object v9, Lcom/vungle/ads/fpd/AgeRange;->AGE_21_30:Lcom/vungle/ads/fpd/AgeRange;

    .line 44
    .line 45
    new-instance v10, Lcom/vungle/ads/fpd/AgeRange;

    .line 46
    .line 47
    new-instance v11, Lzf/g;

    .line 48
    .line 49
    const/16 v12, 0x1f

    .line 50
    .line 51
    const/16 v13, 0x28

    .line 52
    .line 53
    invoke-direct {v11, v12, v13, v7}, Lzf/e;-><init>(III)V

    .line 54
    .line 55
    .line 56
    const-string v12, "AGE_31_40"

    .line 57
    .line 58
    invoke-direct {v10, v12, v5, v4, v11}, Lcom/vungle/ads/fpd/AgeRange;-><init>(Ljava/lang/String;IILzf/g;)V

    .line 59
    .line 60
    .line 61
    sput-object v10, Lcom/vungle/ads/fpd/AgeRange;->AGE_31_40:Lcom/vungle/ads/fpd/AgeRange;

    .line 62
    .line 63
    new-instance v11, Lcom/vungle/ads/fpd/AgeRange;

    .line 64
    .line 65
    new-instance v12, Lzf/g;

    .line 66
    .line 67
    const/16 v13, 0x29

    .line 68
    .line 69
    const/16 v14, 0x32

    .line 70
    .line 71
    invoke-direct {v12, v13, v14, v7}, Lzf/e;-><init>(III)V

    .line 72
    .line 73
    .line 74
    const-string v13, "AGE_41_50"

    .line 75
    .line 76
    invoke-direct {v11, v13, v4, v3, v12}, Lcom/vungle/ads/fpd/AgeRange;-><init>(Ljava/lang/String;IILzf/g;)V

    .line 77
    .line 78
    .line 79
    sput-object v11, Lcom/vungle/ads/fpd/AgeRange;->AGE_41_50:Lcom/vungle/ads/fpd/AgeRange;

    .line 80
    .line 81
    new-instance v12, Lcom/vungle/ads/fpd/AgeRange;

    .line 82
    .line 83
    new-instance v13, Lzf/g;

    .line 84
    .line 85
    const/16 v14, 0x33

    .line 86
    .line 87
    const/16 v15, 0x3c

    .line 88
    .line 89
    invoke-direct {v13, v14, v15, v7}, Lzf/e;-><init>(III)V

    .line 90
    .line 91
    .line 92
    const-string v14, "AGE_51_60"

    .line 93
    .line 94
    invoke-direct {v12, v14, v3, v2, v13}, Lcom/vungle/ads/fpd/AgeRange;-><init>(Ljava/lang/String;IILzf/g;)V

    .line 95
    .line 96
    .line 97
    sput-object v12, Lcom/vungle/ads/fpd/AgeRange;->AGE_51_60:Lcom/vungle/ads/fpd/AgeRange;

    .line 98
    .line 99
    new-instance v13, Lcom/vungle/ads/fpd/AgeRange;

    .line 100
    .line 101
    new-instance v14, Lzf/g;

    .line 102
    .line 103
    const/16 v15, 0x3d

    .line 104
    .line 105
    move/from16 v16, v3

    .line 106
    .line 107
    const/16 v3, 0x46

    .line 108
    .line 109
    invoke-direct {v14, v15, v3, v7}, Lzf/e;-><init>(III)V

    .line 110
    .line 111
    .line 112
    const-string v3, "AGE_61_70"

    .line 113
    .line 114
    invoke-direct {v13, v3, v2, v1, v14}, Lcom/vungle/ads/fpd/AgeRange;-><init>(Ljava/lang/String;IILzf/g;)V

    .line 115
    .line 116
    .line 117
    sput-object v13, Lcom/vungle/ads/fpd/AgeRange;->AGE_61_70:Lcom/vungle/ads/fpd/AgeRange;

    .line 118
    .line 119
    new-instance v3, Lcom/vungle/ads/fpd/AgeRange;

    .line 120
    .line 121
    new-instance v14, Lzf/g;

    .line 122
    .line 123
    const/16 v15, 0x47

    .line 124
    .line 125
    move/from16 v17, v2

    .line 126
    .line 127
    const/16 v2, 0x4b

    .line 128
    .line 129
    invoke-direct {v14, v15, v2, v7}, Lzf/e;-><init>(III)V

    .line 130
    .line 131
    .line 132
    const-string v2, "AGE_71_75"

    .line 133
    .line 134
    invoke-direct {v3, v2, v1, v0, v14}, Lcom/vungle/ads/fpd/AgeRange;-><init>(Ljava/lang/String;IILzf/g;)V

    .line 135
    .line 136
    .line 137
    sput-object v3, Lcom/vungle/ads/fpd/AgeRange;->AGE_71_75:Lcom/vungle/ads/fpd/AgeRange;

    .line 138
    .line 139
    new-instance v2, Lcom/vungle/ads/fpd/AgeRange;

    .line 140
    .line 141
    new-instance v14, Lzf/g;

    .line 142
    .line 143
    const/high16 v15, -0x80000000

    .line 144
    .line 145
    move/from16 v18, v1

    .line 146
    .line 147
    const v1, 0x7fffffff

    .line 148
    .line 149
    .line 150
    invoke-direct {v14, v15, v1, v7}, Lzf/e;-><init>(III)V

    .line 151
    .line 152
    .line 153
    const-string v1, "OTHERS"

    .line 154
    .line 155
    invoke-direct {v2, v1, v0, v6, v14}, Lcom/vungle/ads/fpd/AgeRange;-><init>(Ljava/lang/String;IILzf/g;)V

    .line 156
    .line 157
    .line 158
    sput-object v2, Lcom/vungle/ads/fpd/AgeRange;->OTHERS:Lcom/vungle/ads/fpd/AgeRange;

    .line 159
    .line 160
    const/16 v1, 0x8

    .line 161
    .line 162
    new-array v1, v1, [Lcom/vungle/ads/fpd/AgeRange;

    .line 163
    .line 164
    aput-object v8, v1, v6

    .line 165
    .line 166
    aput-object v9, v1, v7

    .line 167
    .line 168
    aput-object v10, v1, v5

    .line 169
    .line 170
    aput-object v11, v1, v4

    .line 171
    .line 172
    aput-object v12, v1, v16

    .line 173
    .line 174
    aput-object v13, v1, v17

    .line 175
    .line 176
    aput-object v3, v1, v18

    .line 177
    .line 178
    aput-object v2, v1, v0

    .line 179
    .line 180
    sput-object v1, Lcom/vungle/ads/fpd/AgeRange;->c:[Lcom/vungle/ads/fpd/AgeRange;

    .line 181
    .line 182
    new-instance v0, Lcom/vungle/ads/fpd/AgeRange$Companion;

    .line 183
    .line 184
    const/4 v1, 0x0

    .line 185
    invoke-direct {v0, v1}, Lcom/vungle/ads/fpd/AgeRange$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 186
    .line 187
    .line 188
    sput-object v0, Lcom/vungle/ads/fpd/AgeRange;->Companion:Lcom/vungle/ads/fpd/AgeRange$Companion;

    .line 189
    .line 190
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IILzf/g;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lcom/vungle/ads/fpd/AgeRange;->a:I

    .line 5
    .line 6
    iput-object p4, p0, Lcom/vungle/ads/fpd/AgeRange;->b:Lzf/g;

    .line 7
    .line 8
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/vungle/ads/fpd/AgeRange;
    .locals 1

    const-class v0, Lcom/vungle/ads/fpd/AgeRange;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/vungle/ads/fpd/AgeRange;

    return-object p0
.end method

.method public static values()[Lcom/vungle/ads/fpd/AgeRange;
    .locals 1

    sget-object v0, Lcom/vungle/ads/fpd/AgeRange;->c:[Lcom/vungle/ads/fpd/AgeRange;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/vungle/ads/fpd/AgeRange;

    return-object v0
.end method


# virtual methods
.method public final getId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/vungle/ads/fpd/AgeRange;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public final getRange()Lzf/g;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/vungle/ads/fpd/AgeRange;->b:Lzf/g;

    .line 2
    .line 3
    return-object v0
.end method
