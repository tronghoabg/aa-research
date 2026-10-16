.class public final Lc0/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lc0/o;


# instance fields
.field public final a:LP/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lc0/o;

    .line 2
    .line 3
    invoke-direct {v0}, Lc0/o;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lc0/o;->b:Lc0/o;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LP/d;

    .line 5
    .line 6
    const/16 v1, 0x10

    .line 7
    .line 8
    new-array v1, v1, [Lc0/q;

    .line 9
    .line 10
    invoke-direct {v0, v1}, LP/d;-><init>([Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lc0/o;->a:LP/d;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 13

    .line 1
    iget-object v0, p0, Lc0/o;->a:LP/d;

    .line 2
    .line 3
    invoke-virtual {v0}, LP/d;->j()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_c

    .line 8
    .line 9
    iget v1, v0, LP/d;->c:I

    .line 10
    .line 11
    if-lez v1, :cond_b

    .line 12
    .line 13
    iget-object v0, v0, LP/d;->a:[Ljava/lang/Object;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    move v3, v2

    .line 17
    :cond_0
    aget-object v4, v0, v3

    .line 18
    .line 19
    check-cast v4, Lc0/q;

    .line 20
    .line 21
    iget-object v4, v4, Lc0/q;->b:LP/d;

    .line 22
    .line 23
    iget v5, v4, LP/d;->c:I

    .line 24
    .line 25
    const/4 v6, 0x0

    .line 26
    if-lez v5, :cond_9

    .line 27
    .line 28
    iget-object v4, v4, LP/d;->a:[Ljava/lang/Object;

    .line 29
    .line 30
    move v7, v2

    .line 31
    :cond_1
    aget-object v8, v4, v7

    .line 32
    .line 33
    check-cast v8, Lc0/g;

    .line 34
    .line 35
    if-eqz v6, :cond_7

    .line 36
    .line 37
    iget-object v9, v6, Lc0/g;->k:Lt0/y;

    .line 38
    .line 39
    if-eqz v9, :cond_7

    .line 40
    .line 41
    iget-object v9, v9, Lt0/y;->e:Lt0/t;

    .line 42
    .line 43
    if-nez v9, :cond_2

    .line 44
    .line 45
    goto :goto_3

    .line 46
    :cond_2
    iget-object v10, v8, Lc0/g;->k:Lt0/y;

    .line 47
    .line 48
    if-eqz v10, :cond_8

    .line 49
    .line 50
    iget-object v10, v10, Lt0/y;->e:Lt0/t;

    .line 51
    .line 52
    if-nez v10, :cond_3

    .line 53
    .line 54
    goto :goto_4

    .line 55
    :cond_3
    :goto_0
    iget v11, v9, Lt0/t;->h:I

    .line 56
    .line 57
    iget v12, v10, Lt0/t;->h:I

    .line 58
    .line 59
    if-le v11, v12, :cond_4

    .line 60
    .line 61
    invoke-virtual {v9}, Lt0/t;->j()Lt0/t;

    .line 62
    .line 63
    .line 64
    move-result-object v9

    .line 65
    invoke-static {v9}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_4
    :goto_1
    iget v11, v10, Lt0/t;->h:I

    .line 70
    .line 71
    iget v12, v9, Lt0/t;->h:I

    .line 72
    .line 73
    if-le v11, v12, :cond_5

    .line 74
    .line 75
    invoke-virtual {v10}, Lt0/t;->j()Lt0/t;

    .line 76
    .line 77
    .line 78
    move-result-object v10

    .line 79
    invoke-static {v10}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_5
    :goto_2
    invoke-virtual {v9}, Lt0/t;->j()Lt0/t;

    .line 84
    .line 85
    .line 86
    move-result-object v11

    .line 87
    invoke-virtual {v10}, Lt0/t;->j()Lt0/t;

    .line 88
    .line 89
    .line 90
    move-result-object v12

    .line 91
    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v11

    .line 95
    if-nez v11, :cond_6

    .line 96
    .line 97
    invoke-virtual {v9}, Lt0/t;->j()Lt0/t;

    .line 98
    .line 99
    .line 100
    move-result-object v9

    .line 101
    invoke-static {v9}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v10}, Lt0/t;->j()Lt0/t;

    .line 105
    .line 106
    .line 107
    move-result-object v10

    .line 108
    invoke-static {v10}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_6
    invoke-virtual {v9}, Lt0/t;->j()Lt0/t;

    .line 113
    .line 114
    .line 115
    move-result-object v11

    .line 116
    invoke-static {v11}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v11}, Lt0/t;->l()LP/d;

    .line 120
    .line 121
    .line 122
    move-result-object v11

    .line 123
    invoke-virtual {v11, v9}, LP/d;->h(Ljava/lang/Object;)I

    .line 124
    .line 125
    .line 126
    move-result v9

    .line 127
    invoke-virtual {v11, v10}, LP/d;->h(Ljava/lang/Object;)I

    .line 128
    .line 129
    .line 130
    move-result v10

    .line 131
    if-ge v9, v10, :cond_7

    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_7
    :goto_3
    move-object v6, v8

    .line 135
    :cond_8
    :goto_4
    add-int/lit8 v7, v7, 0x1

    .line 136
    .line 137
    if-lt v7, v5, :cond_1

    .line 138
    .line 139
    :cond_9
    if-eqz v6, :cond_a

    .line 140
    .line 141
    invoke-static {v6}, Lxg/g;->M(Lc0/g;)V

    .line 142
    .line 143
    .line 144
    :cond_a
    add-int/lit8 v3, v3, 0x1

    .line 145
    .line 146
    if-lt v3, v1, :cond_0

    .line 147
    .line 148
    :cond_b
    return-void

    .line 149
    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 150
    .line 151
    const-string v1, "\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n"

    .line 152
    .line 153
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    throw v0
.end method
