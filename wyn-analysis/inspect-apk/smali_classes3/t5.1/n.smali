.class public final Lt5/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv5/b;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lt5/n;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lt5/n;->a:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v1, LVa/ka;

    .line 9
    .line 10
    const/16 v2, 0xf

    .line 11
    .line 12
    invoke-direct {v1, v2}, LVa/ka;-><init>(I)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    sget-object v3, Lq5/e;->a:Lq5/e;

    .line 21
    .line 22
    sget-object v9, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 23
    .line 24
    const-string v10, "Null flags"

    .line 25
    .line 26
    if-eqz v9, :cond_4

    .line 27
    .line 28
    new-instance v4, Lz5/b;

    .line 29
    .line 30
    const-wide/16 v5, 0x7530

    .line 31
    .line 32
    const-wide/32 v7, 0x5265c00

    .line 33
    .line 34
    .line 35
    invoke-direct/range {v4 .. v9}, Lz5/b;-><init>(JJLjava/util/Set;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    sget-object v3, Lq5/e;->c:Lq5/e;

    .line 42
    .line 43
    if-eqz v9, :cond_3

    .line 44
    .line 45
    new-instance v4, Lz5/b;

    .line 46
    .line 47
    const-wide/16 v5, 0x3e8

    .line 48
    .line 49
    const-wide/32 v7, 0x5265c00

    .line 50
    .line 51
    .line 52
    invoke-direct/range {v4 .. v9}, Lz5/b;-><init>(JJLjava/util/Set;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    sget-object v3, Lq5/e;->b:Lq5/e;

    .line 59
    .line 60
    if-eqz v9, :cond_2

    .line 61
    .line 62
    const/4 v4, 0x1

    .line 63
    new-array v4, v4, [Lz5/d;

    .line 64
    .line 65
    sget-object v5, Lz5/d;->b:Lz5/d;

    .line 66
    .line 67
    const/4 v6, 0x0

    .line 68
    aput-object v5, v4, v6

    .line 69
    .line 70
    new-instance v5, Ljava/util/HashSet;

    .line 71
    .line 72
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    invoke-direct {v5, v4}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 77
    .line 78
    .line 79
    invoke-static {v5}, Lj$/util/DesugarCollections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 80
    .line 81
    .line 82
    move-result-object v16

    .line 83
    if-eqz v16, :cond_1

    .line 84
    .line 85
    new-instance v11, Lz5/b;

    .line 86
    .line 87
    const-wide/32 v12, 0x5265c00

    .line 88
    .line 89
    .line 90
    const-wide/32 v14, 0x5265c00

    .line 91
    .line 92
    .line 93
    invoke-direct/range {v11 .. v16}, Lz5/b;-><init>(JJLjava/util/Set;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2, v3, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    invoke-interface {v3}, Ljava/util/Set;->size()I

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    invoke-static {}, Lq5/e;->values()[Lq5/e;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    array-length v4, v4

    .line 112
    if-lt v3, v4, :cond_0

    .line 113
    .line 114
    new-instance v3, Ljava/util/HashMap;

    .line 115
    .line 116
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 117
    .line 118
    .line 119
    new-instance v3, Lz5/a;

    .line 120
    .line 121
    invoke-direct {v3, v1, v2}, Lz5/a;-><init>(LC5/a;Ljava/util/HashMap;)V

    .line 122
    .line 123
    .line 124
    return-object v3

    .line 125
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 126
    .line 127
    const-string v2, "Not all priorities have been configured"

    .line 128
    .line 129
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    throw v1

    .line 133
    :cond_1
    new-instance v1, Ljava/lang/NullPointerException;

    .line 134
    .line 135
    invoke-direct {v1, v10}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    throw v1

    .line 139
    :cond_2
    new-instance v1, Ljava/lang/NullPointerException;

    .line 140
    .line 141
    invoke-direct {v1, v10}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    throw v1

    .line 145
    :cond_3
    new-instance v1, Ljava/lang/NullPointerException;

    .line 146
    .line 147
    invoke-direct {v1, v10}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    throw v1

    .line 151
    :cond_4
    new-instance v1, Ljava/lang/NullPointerException;

    .line 152
    .line 153
    invoke-direct {v1, v10}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    throw v1

    .line 157
    :pswitch_0
    new-instance v1, LA7/V0;

    .line 158
    .line 159
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    const/4 v3, 0x4

    .line 164
    invoke-direct {v1, v2, v3}, LA7/V0;-><init>(Ljava/lang/Object;I)V

    .line 165
    .line 166
    .line 167
    return-object v1

    .line 168
    nop

    .line 169
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
