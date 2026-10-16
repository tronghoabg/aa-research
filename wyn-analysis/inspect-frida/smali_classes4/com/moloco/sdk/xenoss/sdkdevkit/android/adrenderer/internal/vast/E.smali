.class public final Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I;

.field public final b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/p;

.field public final c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/o;

.field public final d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/L0;

.field public final e:Lcom/moloco/sdk/internal/services/E;

.field public final f:Lwd/c;

.field public final g:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/p;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/p;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/o;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/L0;Lcom/moloco/sdk/internal/services/E;Lwd/c;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/p;)V
    .locals 1

    .line 1
    const-string v0, "parseVast"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "mediaConfig"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "mediaCacheRepository"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "vastTracker"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "connectivityService"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "httpClient"

    .line 27
    .line 28
    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I;

    .line 35
    .line 36
    iput-object p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/p;

    .line 37
    .line 38
    iput-object p3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/o;

    .line 39
    .line 40
    iput-object p4, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/L0;

    .line 41
    .line 42
    iput-object p5, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;->e:Lcom/moloco/sdk/internal/services/E;

    .line 43
    .line 44
    iput-object p6, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;->f:Lwd/c;

    .line 45
    .line 46
    iput-object p7, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;->g:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/p;

    .line 47
    .line 48
    return-void
.end method

.method public static a(Ljava/util/List;Lcom/moloco/sdk/common_adapter_internal/a;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/b;
    .locals 8

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_2

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    move-object v2, v1

    .line 21
    check-cast v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/i;

    .line 22
    .line 23
    iget-object v3, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/i;->c:Ljava/lang/String;

    .line 24
    .line 25
    if-eqz v3, :cond_1

    .line 26
    .line 27
    invoke-static {v3}, LBf/k;->y0(Ljava/lang/CharSequence;)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    :cond_1
    iget-object v2, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/i;->f:Ljava/util/List;

    .line 34
    .line 35
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-nez v2, :cond_0

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    iget p0, p1, Lcom/moloco/sdk/common_adapter_internal/a;->a:I

    .line 46
    .line 47
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    iget p1, p1, Lcom/moloco/sdk/common_adapter_internal/a;->b:I

    .line 52
    .line 53
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    new-instance v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/i;

    .line 58
    .line 59
    invoke-direct {v1, p0, p1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/i;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 60
    .line 61
    .line 62
    invoke-static {v1, v0}, Lff/o;->M0(Ljava/util/Comparator;Ljava/lang/Iterable;)Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-static {p0}, Lff/o;->s0(Ljava/util/List;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    check-cast p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/i;

    .line 71
    .line 72
    const/4 p1, 0x0

    .line 73
    if-eqz p0, :cond_9

    .line 74
    .line 75
    sget-object v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/G;->a:LA0/f;

    .line 76
    .line 77
    iget-object v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/i;->f:Ljava/util/List;

    .line 78
    .line 79
    invoke-static {v0, v1}, Lff/o;->M0(Ljava/util/Comparator;Ljava/lang/Iterable;)Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-static {v0}, Lff/o;->q0(Ljava/util/List;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    move-object v2, v0

    .line 88
    check-cast v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/I;

    .line 89
    .line 90
    const/4 v0, 0x0

    .line 91
    iget-object v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/i;->a:Ljava/lang/Integer;

    .line 92
    .line 93
    if-eqz v1, :cond_3

    .line 94
    .line 95
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    move v3, v1

    .line 100
    goto :goto_1

    .line 101
    :cond_3
    move v3, v0

    .line 102
    :goto_1
    iget-object v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/i;->b:Ljava/lang/Integer;

    .line 103
    .line 104
    if-eqz v1, :cond_4

    .line 105
    .line 106
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    :cond_4
    move v4, v0

    .line 111
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/i;->d:LY2/B;

    .line 112
    .line 113
    if-eqz v0, :cond_5

    .line 114
    .line 115
    iget-object p1, v0, LY2/B;->c:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast p1, Ljava/lang/String;

    .line 118
    .line 119
    :cond_5
    move-object v5, p1

    .line 120
    if-eqz v0, :cond_7

    .line 121
    .line 122
    iget-object p1, v0, LY2/B;->b:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast p1, Ljava/util/List;

    .line 125
    .line 126
    if-nez p1, :cond_6

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_6
    :goto_2
    move-object v6, p1

    .line 130
    goto :goto_4

    .line 131
    :cond_7
    :goto_3
    sget-object p1, Lff/v;->a:Lff/v;

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :goto_4
    new-instance v7, Ljava/util/ArrayList;

    .line 135
    .line 136
    iget-object p0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/i;->e:Ljava/util/List;

    .line 137
    .line 138
    const/16 p1, 0xa

    .line 139
    .line 140
    invoke-static {p0, p1}, Lff/p;->a0(Ljava/lang/Iterable;I)I

    .line 141
    .line 142
    .line 143
    move-result p1

    .line 144
    invoke-direct {v7, p1}, Ljava/util/ArrayList;-><init>(I)V

    .line 145
    .line 146
    .line 147
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 152
    .line 153
    .line 154
    move-result p1

    .line 155
    if-eqz p1, :cond_8

    .line 156
    .line 157
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    check-cast p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/B;

    .line 162
    .line 163
    iget-object p1, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/B;->b:Ljava/lang/String;

    .line 164
    .line 165
    invoke-virtual {v7, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    goto :goto_5

    .line 169
    :cond_8
    new-instance v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/b;

    .line 170
    .line 171
    invoke-direct/range {v1 .. v7}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/b;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/I;IILjava/lang/String;Ljava/util/List;Ljava/util/ArrayList;)V

    .line 172
    .line 173
    .line 174
    return-object v1

    .line 175
    :cond_9
    return-object p1
.end method

.method public static b(Ljava/util/List;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/h;
    .locals 10

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_2

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    move-object v2, v1

    .line 21
    check-cast v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/q;

    .line 22
    .line 23
    iget-object v2, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/q;->c:Ljava/lang/String;

    .line 24
    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    invoke-static {v2}, LBf/k;->y0(Ljava/lang/CharSequence;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    :cond_1
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    sget-object p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/G;->b:LA0/f;

    .line 38
    .line 39
    invoke-static {p0, v0}, Lff/o;->M0(Ljava/util/Comparator;Ljava/lang/Iterable;)Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-static {p0}, Lff/o;->s0(Ljava/util/List;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/q;

    .line 48
    .line 49
    const/4 v0, 0x0

    .line 50
    if-eqz p0, :cond_8

    .line 51
    .line 52
    new-instance v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/h;

    .line 53
    .line 54
    const/4 v2, 0x0

    .line 55
    iget-object v3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/q;->a:Ljava/lang/Integer;

    .line 56
    .line 57
    if-eqz v3, :cond_3

    .line 58
    .line 59
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    goto :goto_1

    .line 64
    :cond_3
    move v3, v2

    .line 65
    :goto_1
    iget-object v4, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/q;->b:Ljava/lang/Integer;

    .line 66
    .line 67
    if-eqz v4, :cond_4

    .line 68
    .line 69
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    :cond_4
    move v4, v2

    .line 74
    iget-object v2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/q;->f:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/r;

    .line 75
    .line 76
    if-eqz v2, :cond_5

    .line 77
    .line 78
    iget-object v0, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/r;->a:Ljava/lang/String;

    .line 79
    .line 80
    :cond_5
    move-object v5, v0

    .line 81
    if-eqz v2, :cond_7

    .line 82
    .line 83
    iget-object v0, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/r;->b:Ljava/util/List;

    .line 84
    .line 85
    if-nez v0, :cond_6

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_6
    :goto_2
    move-object v6, v0

    .line 89
    goto :goto_4

    .line 90
    :cond_7
    :goto_3
    sget-object v0, Lff/v;->a:Lff/v;

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :goto_4
    iget-object v8, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/q;->e:Ljava/lang/Long;

    .line 94
    .line 95
    iget-object v9, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/q;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/y;

    .line 96
    .line 97
    iget-object v2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/q;->h:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/I;

    .line 98
    .line 99
    iget-object v7, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/q;->g:Ljava/util/List;

    .line 100
    .line 101
    invoke-direct/range {v1 .. v9}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/h;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/I;IILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/y;)V

    .line 102
    .line 103
    .line 104
    return-object v1

    .line 105
    :cond_8
    return-object v0
.end method

.method public static final c(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/b;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/n;DLcom/moloco/sdk/common_adapter_internal/a;ZLjava/lang/String;Llf/c;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p8

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    instance-of v4, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/w;

    .line 13
    .line 14
    if-eqz v4, :cond_0

    .line 15
    .line 16
    move-object v4, v3

    .line 17
    check-cast v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/w;

    .line 18
    .line 19
    iget v5, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/w;->l:I

    .line 20
    .line 21
    const/high16 v6, -0x80000000

    .line 22
    .line 23
    and-int v7, v5, v6

    .line 24
    .line 25
    if-eqz v7, :cond_0

    .line 26
    .line 27
    sub-int/2addr v5, v6

    .line 28
    iput v5, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/w;->l:I

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    new-instance v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/w;

    .line 32
    .line 33
    invoke-direct {v4, v0, v3}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/w;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;Llf/c;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    iget-object v3, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/w;->j:Ljava/lang/Object;

    .line 37
    .line 38
    sget-object v5, Lkf/a;->a:Lkf/a;

    .line 39
    .line 40
    iget v6, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/w;->l:I

    .line 41
    .line 42
    const-string v7, "Failed to load wrapper vast ad: "

    .line 43
    .line 44
    const/4 v8, 0x2

    .line 45
    const/4 v9, 0x1

    .line 46
    if-eqz v6, :cond_3

    .line 47
    .line 48
    if-eq v6, v9, :cond_2

    .line 49
    .line 50
    if-ne v6, v8, :cond_1

    .line 51
    .line 52
    invoke-static {v3}, LFe/e;->U(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    return-object v3

    .line 56
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 57
    .line 58
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 59
    .line 60
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw v0

    .line 64
    :cond_2
    iget v0, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/w;->i:I

    .line 65
    .line 66
    iget-boolean v1, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/w;->h:Z

    .line 67
    .line 68
    iget-wide v11, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/w;->g:D

    .line 69
    .line 70
    iget-object v2, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/w;->f:Ljava/util/ArrayList;

    .line 71
    .line 72
    iget-object v6, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/w;->e:Ljava/lang/String;

    .line 73
    .line 74
    iget-object v13, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/w;->d:Lcom/moloco/sdk/common_adapter_internal/a;

    .line 75
    .line 76
    iget-object v14, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/w;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/n;

    .line 77
    .line 78
    iget-object v15, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/w;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/b;

    .line 79
    .line 80
    iget-object v8, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/w;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;

    .line 81
    .line 82
    invoke-static {v3}, LFe/e;->U(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    goto/16 :goto_3

    .line 86
    .line 87
    :cond_3
    invoke-static {v3}, LFe/e;->U(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    sget-object v16, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 91
    .line 92
    new-instance v3, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    const-string v6, "Loading wrapper vast ad: "

    .line 95
    .line 96
    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    iget-object v6, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/b;->a:Ljava/lang/String;

    .line 100
    .line 101
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v18

    .line 108
    const/16 v21, 0xc

    .line 109
    .line 110
    const/16 v22, 0x0

    .line 111
    .line 112
    const-string v17, "VastAdLoaderImpl"

    .line 113
    .line 114
    const/16 v19, 0x0

    .line 115
    .line 116
    const/16 v20, 0x0

    .line 117
    .line 118
    invoke-static/range {v16 .. v22}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    if-eqz v2, :cond_4

    .line 122
    .line 123
    iget v3, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/n;->a:I

    .line 124
    .line 125
    add-int/2addr v3, v9

    .line 126
    goto :goto_1

    .line 127
    :cond_4
    const/4 v3, 0x0

    .line 128
    :goto_1
    if-eqz v2, :cond_5

    .line 129
    .line 130
    iget-object v6, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/n;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/l;

    .line 131
    .line 132
    iget-object v6, v6, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/l;->b:Ljava/util/List;

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_5
    const/4 v6, 0x0

    .line 136
    :goto_2
    iget-object v8, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/b;->d:Ljava/util/List;

    .line 137
    .line 138
    invoke-static {v6, v8}, Lad/I;->c(Ljava/util/List;Ljava/util/List;)Ljava/util/ArrayList;

    .line 139
    .line 140
    .line 141
    move-result-object v6

    .line 142
    const/4 v8, 0x4

    .line 143
    if-gt v3, v8, :cond_12

    .line 144
    .line 145
    if-eqz v2, :cond_6

    .line 146
    .line 147
    iget-object v8, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/n;->b:Ljava/util/Set;

    .line 148
    .line 149
    iget-object v11, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/b;->a:Ljava/lang/String;

    .line 150
    .line 151
    invoke-interface {v8, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v8

    .line 155
    if-ne v8, v9, :cond_6

    .line 156
    .line 157
    goto/16 :goto_a

    .line 158
    .line 159
    :cond_6
    if-eqz v2, :cond_7

    .line 160
    .line 161
    iget-boolean v8, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/n;->c:Z

    .line 162
    .line 163
    if-nez v8, :cond_7

    .line 164
    .line 165
    goto/16 :goto_a

    .line 166
    .line 167
    :cond_7
    iput-object v0, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/w;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;

    .line 168
    .line 169
    iput-object v1, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/w;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/b;

    .line 170
    .line 171
    iput-object v2, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/w;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/n;

    .line 172
    .line 173
    move-object/from16 v8, p5

    .line 174
    .line 175
    iput-object v8, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/w;->d:Lcom/moloco/sdk/common_adapter_internal/a;

    .line 176
    .line 177
    move-object/from16 v11, p7

    .line 178
    .line 179
    iput-object v11, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/w;->e:Ljava/lang/String;

    .line 180
    .line 181
    iput-object v6, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/w;->f:Ljava/util/ArrayList;

    .line 182
    .line 183
    move-wide/from16 v12, p3

    .line 184
    .line 185
    iput-wide v12, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/w;->g:D

    .line 186
    .line 187
    move/from16 v14, p6

    .line 188
    .line 189
    iput-boolean v14, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/w;->h:Z

    .line 190
    .line 191
    iput v3, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/w;->i:I

    .line 192
    .line 193
    iput v9, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/w;->l:I

    .line 194
    .line 195
    invoke-virtual {v0, v1, v6, v4}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;->e(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/b;Ljava/util/ArrayList;Llf/c;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v15

    .line 199
    if-ne v15, v5, :cond_8

    .line 200
    .line 201
    goto/16 :goto_9

    .line 202
    .line 203
    :cond_8
    move-object/from16 v23, v8

    .line 204
    .line 205
    move-object v8, v0

    .line 206
    move v0, v3

    .line 207
    move-object v3, v15

    .line 208
    move-object v15, v1

    .line 209
    move v1, v14

    .line 210
    move-object v14, v2

    .line 211
    move-object v2, v6

    .line 212
    move-object v6, v11

    .line 213
    move-wide v11, v12

    .line 214
    move-object/from16 v13, v23

    .line 215
    .line 216
    :goto_3
    check-cast v3, Lcom/moloco/sdk/internal/A;

    .line 217
    .line 218
    instance-of v9, v3, Lcom/moloco/sdk/internal/y;

    .line 219
    .line 220
    if-eqz v9, :cond_9

    .line 221
    .line 222
    sget-object v0, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 223
    .line 224
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    new-instance v1, Ljava/lang/StringBuilder;

    .line 228
    .line 229
    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    check-cast v3, Lcom/moloco/sdk/internal/y;

    .line 233
    .line 234
    iget-object v2, v3, Lcom/moloco/sdk/internal/y;->a:Ljava/lang/Object;

    .line 235
    .line 236
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    const/16 v2, 0xc

    .line 244
    .line 245
    const/4 v4, 0x0

    .line 246
    const-string v5, "VastAdLoaderImpl"

    .line 247
    .line 248
    const/4 v6, 0x0

    .line 249
    const/4 v7, 0x0

    .line 250
    move-object/from16 p0, v0

    .line 251
    .line 252
    move-object/from16 p2, v1

    .line 253
    .line 254
    move/from16 p5, v2

    .line 255
    .line 256
    move-object/from16 p6, v4

    .line 257
    .line 258
    move-object/from16 p1, v5

    .line 259
    .line 260
    move-object/from16 p3, v6

    .line 261
    .line 262
    move/from16 p4, v7

    .line 263
    .line 264
    invoke-static/range {p0 .. p6}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    new-instance v0, Lcom/moloco/sdk/internal/y;

    .line 268
    .line 269
    iget-object v1, v3, Lcom/moloco/sdk/internal/y;->a:Ljava/lang/Object;

    .line 270
    .line 271
    invoke-direct {v0, v1}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    return-object v0

    .line 275
    :cond_9
    instance-of v7, v3, Lcom/moloco/sdk/internal/z;

    .line 276
    .line 277
    if-eqz v7, :cond_11

    .line 278
    .line 279
    check-cast v3, Lcom/moloco/sdk/internal/z;

    .line 280
    .line 281
    iget-object v3, v3, Lcom/moloco/sdk/internal/z;->a:Ljava/lang/Object;

    .line 282
    .line 283
    check-cast v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/D;

    .line 284
    .line 285
    if-eqz v14, :cond_a

    .line 286
    .line 287
    iget-object v7, v14, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/n;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/l;

    .line 288
    .line 289
    iget-object v7, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/l;->a:Ljava/util/List;

    .line 290
    .line 291
    goto :goto_4

    .line 292
    :cond_a
    const/4 v7, 0x0

    .line 293
    :goto_4
    iget-object v9, v15, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/b;->c:Ljava/util/List;

    .line 294
    .line 295
    invoke-static {v7, v9}, Lad/I;->c(Ljava/util/List;Ljava/util/List;)Ljava/util/ArrayList;

    .line 296
    .line 297
    .line 298
    move-result-object v7

    .line 299
    if-eqz v14, :cond_b

    .line 300
    .line 301
    iget-object v9, v14, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/n;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/l;

    .line 302
    .line 303
    iget-object v9, v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/l;->c:Ljava/util/List;

    .line 304
    .line 305
    goto :goto_5

    .line 306
    :cond_b
    const/4 v9, 0x0

    .line 307
    :goto_5
    iget-object v10, v15, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/b;->e:Ljava/util/List;

    .line 308
    .line 309
    invoke-static {v10}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 310
    .line 311
    .line 312
    move-result-object v10

    .line 313
    invoke-static {v9, v10}, Lad/I;->c(Ljava/util/List;Ljava/util/List;)Ljava/util/ArrayList;

    .line 314
    .line 315
    .line 316
    move-result-object v9

    .line 317
    if-eqz v14, :cond_c

    .line 318
    .line 319
    iget-object v10, v14, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/n;->b:Ljava/util/Set;

    .line 320
    .line 321
    goto :goto_6

    .line 322
    :cond_c
    const/4 v10, 0x0

    .line 323
    :goto_6
    new-instance v14, Ljava/util/LinkedHashSet;

    .line 324
    .line 325
    invoke-direct {v14}, Ljava/util/LinkedHashSet;-><init>()V

    .line 326
    .line 327
    .line 328
    if-eqz v10, :cond_d

    .line 329
    .line 330
    invoke-static {v10, v14}, Lff/t;->e0(Ljava/lang/Iterable;Ljava/util/Collection;)V

    .line 331
    .line 332
    .line 333
    :cond_d
    iget-object v10, v15, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/b;->a:Ljava/lang/String;

    .line 334
    .line 335
    if-eqz v10, :cond_e

    .line 336
    .line 337
    invoke-interface {v14, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 338
    .line 339
    .line 340
    :cond_e
    new-instance v10, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/n;

    .line 341
    .line 342
    iget-object v15, v15, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/b;->b:Ljava/lang/Boolean;

    .line 343
    .line 344
    if-eqz v15, :cond_f

    .line 345
    .line 346
    invoke-virtual {v15}, Ljava/lang/Boolean;->booleanValue()Z

    .line 347
    .line 348
    .line 349
    move-result v15

    .line 350
    :goto_7
    move/from16 p6, v1

    .line 351
    .line 352
    goto :goto_8

    .line 353
    :cond_f
    const/4 v15, 0x1

    .line 354
    goto :goto_7

    .line 355
    :goto_8
    new-instance v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/l;

    .line 356
    .line 357
    invoke-direct {v1, v7, v2, v9}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/l;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 358
    .line 359
    .line 360
    invoke-direct {v10, v0, v14, v15, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/n;-><init>(ILjava/util/Set;ZLcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/l;)V

    .line 361
    .line 362
    .line 363
    const/4 v0, 0x0

    .line 364
    iput-object v0, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/w;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;

    .line 365
    .line 366
    iput-object v0, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/w;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/b;

    .line 367
    .line 368
    iput-object v0, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/w;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/n;

    .line 369
    .line 370
    iput-object v0, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/w;->d:Lcom/moloco/sdk/common_adapter_internal/a;

    .line 371
    .line 372
    iput-object v0, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/w;->e:Ljava/lang/String;

    .line 373
    .line 374
    iput-object v0, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/w;->f:Ljava/util/ArrayList;

    .line 375
    .line 376
    const/4 v0, 0x2

    .line 377
    iput v0, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/w;->l:I

    .line 378
    .line 379
    move-object/from16 p1, v3

    .line 380
    .line 381
    move-object/from16 p8, v4

    .line 382
    .line 383
    move-object/from16 p7, v6

    .line 384
    .line 385
    move-object/from16 p0, v8

    .line 386
    .line 387
    move-object/from16 p2, v10

    .line 388
    .line 389
    move-wide/from16 p3, v11

    .line 390
    .line 391
    move-object/from16 p5, v13

    .line 392
    .line 393
    invoke-virtual/range {p0 .. p8}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;->g(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/D;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/n;DLcom/moloco/sdk/common_adapter_internal/a;ZLjava/lang/String;Llf/c;)Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    if-ne v0, v5, :cond_10

    .line 398
    .line 399
    :goto_9
    return-object v5

    .line 400
    :cond_10
    return-object v0

    .line 401
    :cond_11
    new-instance v0, LE5/Q;

    .line 402
    .line 403
    const/16 v1, 0x9

    .line 404
    .line 405
    const/4 v2, 0x0

    .line 406
    invoke-direct {v0, v2, v1}, LE5/Q;-><init>(BI)V

    .line 407
    .line 408
    .line 409
    throw v0

    .line 410
    :cond_12
    :goto_a
    sget-object v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/E;->e:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/E;

    .line 411
    .line 412
    const/16 v2, 0xc

    .line 413
    .line 414
    iget-object v0, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/L0;

    .line 415
    .line 416
    invoke-static {v0, v6, v1, v2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/G;->g(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/L0;Ljava/util/List;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/E;I)V

    .line 417
    .line 418
    .line 419
    sget-object v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/k;->e:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/k;

    .line 420
    .line 421
    new-instance v1, Ljava/lang/StringBuilder;

    .line 422
    .line 423
    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 424
    .line 425
    .line 426
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 427
    .line 428
    .line 429
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 430
    .line 431
    .line 432
    move-result-object v1

    .line 433
    const/16 v2, 0xc

    .line 434
    .line 435
    const/4 v3, 0x0

    .line 436
    const-string v4, "VastAdLoaderImpl"

    .line 437
    .line 438
    const/4 v5, 0x0

    .line 439
    const/4 v6, 0x0

    .line 440
    move-object/from16 p2, v1

    .line 441
    .line 442
    move/from16 p5, v2

    .line 443
    .line 444
    move-object/from16 p6, v3

    .line 445
    .line 446
    move-object/from16 p1, v4

    .line 447
    .line 448
    move-object/from16 p3, v5

    .line 449
    .line 450
    move/from16 p4, v6

    .line 451
    .line 452
    move-object/from16 p0, v16

    .line 453
    .line 454
    invoke-static/range {p0 .. p6}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 455
    .line 456
    .line 457
    new-instance v1, Lcom/moloco/sdk/internal/y;

    .line 458
    .line 459
    invoke-direct {v1, v0}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V

    .line 460
    .line 461
    .line 462
    return-object v1
.end method

.method public static final d(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/t;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/l;DLcom/moloco/sdk/common_adapter_internal/a;ZLjava/lang/String;Llf/c;)Ljava/lang/Object;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p8

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    instance-of v4, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/r;

    .line 13
    .line 14
    if-eqz v4, :cond_0

    .line 15
    .line 16
    move-object v4, v3

    .line 17
    check-cast v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/r;

    .line 18
    .line 19
    iget v5, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/r;->q:I

    .line 20
    .line 21
    const/high16 v6, -0x80000000

    .line 22
    .line 23
    and-int v7, v5, v6

    .line 24
    .line 25
    if-eqz v7, :cond_0

    .line 26
    .line 27
    sub-int/2addr v5, v6

    .line 28
    iput v5, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/r;->q:I

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    new-instance v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/r;

    .line 32
    .line 33
    invoke-direct {v4, v0, v3}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/r;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;Llf/c;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    iget-object v3, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/r;->o:Ljava/lang/Object;

    .line 37
    .line 38
    sget-object v5, Lkf/a;->a:Lkf/a;

    .line 39
    .line 40
    iget v6, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/r;->q:I

    .line 41
    .line 42
    const/4 v7, 0x1

    .line 43
    if-eqz v6, :cond_2

    .line 44
    .line 45
    if-ne v6, v7, :cond_1

    .line 46
    .line 47
    iget-boolean v0, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/r;->n:Z

    .line 48
    .line 49
    iget-wide v1, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/r;->m:D

    .line 50
    .line 51
    iget-object v6, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/r;->l:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/j;

    .line 52
    .line 53
    iget-object v9, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/r;->k:Ljava/util/Iterator;

    .line 54
    .line 55
    check-cast v9, Ljava/util/Iterator;

    .line 56
    .line 57
    iget-object v10, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/r;->j:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/k;

    .line 58
    .line 59
    iget-object v11, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/r;->i:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/b;

    .line 60
    .line 61
    iget-object v12, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/r;->h:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/i;

    .line 62
    .line 63
    iget-object v13, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/r;->g:Lef/i;

    .line 64
    .line 65
    iget-object v14, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/r;->f:Ljava/util/List;

    .line 66
    .line 67
    check-cast v14, Ljava/util/List;

    .line 68
    .line 69
    iget-object v15, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/r;->e:Ljava/lang/String;

    .line 70
    .line 71
    iget-object v8, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/r;->d:Lcom/moloco/sdk/common_adapter_internal/a;

    .line 72
    .line 73
    iget-object v7, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/r;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/l;

    .line 74
    .line 75
    move/from16 p0, v0

    .line 76
    .line 77
    iget-object v0, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/r;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/t;

    .line 78
    .line 79
    move-object/from16 p1, v0

    .line 80
    .line 81
    iget-object v0, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/r;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;

    .line 82
    .line 83
    invoke-static {v3}, LFe/e;->U(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    move/from16 v26, p0

    .line 87
    .line 88
    move-wide/from16 v22, v1

    .line 89
    .line 90
    move-object/from16 v28, v4

    .line 91
    .line 92
    move-object/from16 v27, v15

    .line 93
    .line 94
    move-object/from16 v1, p1

    .line 95
    .line 96
    move-object v4, v0

    .line 97
    move-object v15, v6

    .line 98
    const/4 v0, 0x1

    .line 99
    move-object v6, v5

    .line 100
    goto/16 :goto_5

    .line 101
    .line 102
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 103
    .line 104
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 105
    .line 106
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    throw v0

    .line 110
    :cond_2
    invoke-static {v3}, LFe/e;->U(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    sget-object v6, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 114
    .line 115
    const/16 v11, 0xc

    .line 116
    .line 117
    const/4 v12, 0x0

    .line 118
    const-string v7, "VastAdLoaderImpl"

    .line 119
    .line 120
    const-string v8, "Trying to load RenderAd"

    .line 121
    .line 122
    const/4 v9, 0x0

    .line 123
    const/4 v10, 0x0

    .line 124
    invoke-static/range {v6 .. v12}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    if-eqz v2, :cond_3

    .line 128
    .line 129
    iget-object v3, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/l;->b:Ljava/util/List;

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_3
    const/4 v3, 0x0

    .line 133
    :goto_1
    iget-object v7, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/t;->b:Ljava/util/List;

    .line 134
    .line 135
    invoke-static {v3, v7}, Lad/I;->c(Ljava/util/List;Ljava/util/List;)Ljava/util/ArrayList;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    iget-object v7, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/t;->c:Ljava/util/List;

    .line 140
    .line 141
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 142
    .line 143
    .line 144
    move-result v8

    .line 145
    if-eqz v8, :cond_4

    .line 146
    .line 147
    sget-object v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/E;->g:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/E;

    .line 148
    .line 149
    const/16 v2, 0xc

    .line 150
    .line 151
    iget-object v0, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/L0;

    .line 152
    .line 153
    invoke-static {v0, v3, v1, v2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/G;->g(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/L0;Ljava/util/List;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/E;I)V

    .line 154
    .line 155
    .line 156
    const/16 v0, 0xc

    .line 157
    .line 158
    const/4 v1, 0x0

    .line 159
    const-string v2, "VastAdLoaderImpl"

    .line 160
    .line 161
    const-string v3, "No creatives in InLine"

    .line 162
    .line 163
    const/4 v4, 0x0

    .line 164
    const/4 v5, 0x0

    .line 165
    move/from16 p5, v0

    .line 166
    .line 167
    move-object/from16 p6, v1

    .line 168
    .line 169
    move-object/from16 p1, v2

    .line 170
    .line 171
    move-object/from16 p2, v3

    .line 172
    .line 173
    move-object/from16 p3, v4

    .line 174
    .line 175
    move/from16 p4, v5

    .line 176
    .line 177
    move-object/from16 p0, v6

    .line 178
    .line 179
    invoke-static/range {p0 .. p6}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    new-instance v0, Lcom/moloco/sdk/internal/y;

    .line 183
    .line 184
    sget-object v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/k;->h:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/k;

    .line 185
    .line 186
    invoke-direct {v0, v1}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    return-object v0

    .line 190
    :cond_4
    new-instance v6, LBf/g;

    .line 191
    .line 192
    const/16 v8, 0x9

    .line 193
    .line 194
    invoke-direct {v6, v8, v0, v2}, LBf/g;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    invoke-static {v6}, LFe/c;->z(Ltf/a;)Lef/p;

    .line 198
    .line 199
    .line 200
    move-result-object v6

    .line 201
    sget-object v8, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/k;->i:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/k;

    .line 202
    .line 203
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 204
    .line 205
    .line 206
    move-result-object v7

    .line 207
    move-object/from16 v21, v3

    .line 208
    .line 209
    move-object v9, v4

    .line 210
    move-object v14, v6

    .line 211
    move-object v10, v7

    .line 212
    move-object v11, v8

    .line 213
    const/4 v12, 0x0

    .line 214
    const/4 v13, 0x0

    .line 215
    move-wide/from16 v3, p3

    .line 216
    .line 217
    move-object/from16 v6, p5

    .line 218
    .line 219
    move/from16 v7, p6

    .line 220
    .line 221
    move-object/from16 v8, p7

    .line 222
    .line 223
    :goto_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 224
    .line 225
    .line 226
    move-result v15

    .line 227
    if-eqz v15, :cond_5

    .line 228
    .line 229
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v15

    .line 233
    check-cast v15, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/j;

    .line 234
    .line 235
    if-eqz v13, :cond_6

    .line 236
    .line 237
    if-eqz v12, :cond_6

    .line 238
    .line 239
    :cond_5
    move-object v4, v0

    .line 240
    move-object v8, v6

    .line 241
    move-object/from16 v5, v21

    .line 242
    .line 243
    goto/16 :goto_9

    .line 244
    .line 245
    :cond_6
    move-object/from16 p0, v10

    .line 246
    .line 247
    iget-object v10, v15, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/j;->d:Ljava/lang/String;

    .line 248
    .line 249
    if-eqz v10, :cond_8

    .line 250
    .line 251
    invoke-static {v10}, LBf/k;->y0(Ljava/lang/CharSequence;)Z

    .line 252
    .line 253
    .line 254
    move-result v10

    .line 255
    if-eqz v10, :cond_7

    .line 256
    .line 257
    goto :goto_3

    .line 258
    :cond_7
    const/4 v10, 0x0

    .line 259
    goto :goto_4

    .line 260
    :cond_8
    :goto_3
    const/4 v10, 0x1

    .line 261
    :goto_4
    if-nez v10, :cond_9

    .line 262
    .line 263
    move-object/from16 v10, p0

    .line 264
    .line 265
    goto :goto_2

    .line 266
    :cond_9
    if-nez v13, :cond_e

    .line 267
    .line 268
    iget-object v10, v15, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/j;->e:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/m;

    .line 269
    .line 270
    move-object/from16 v29, v5

    .line 271
    .line 272
    instance-of v5, v10, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/l;

    .line 273
    .line 274
    if-eqz v5, :cond_d

    .line 275
    .line 276
    check-cast v10, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/l;

    .line 277
    .line 278
    iget-object v5, v10, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/l;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/u;

    .line 279
    .line 280
    invoke-interface {v14}, Lef/i;->getValue()Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v17

    .line 284
    move-object/from16 v18, v5

    .line 285
    .line 286
    move-object/from16 v5, v17

    .line 287
    .line 288
    check-cast v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/m;

    .line 289
    .line 290
    iget-object v5, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/m;->a:Ljava/util/ArrayList;

    .line 291
    .line 292
    invoke-interface {v14}, Lef/i;->getValue()Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v17

    .line 296
    move-object/from16 v19, v5

    .line 297
    .line 298
    move-object/from16 v5, v17

    .line 299
    .line 300
    check-cast v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/m;

    .line 301
    .line 302
    iget-object v5, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/m;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/a;

    .line 303
    .line 304
    iget-object v10, v10, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/l;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/u;

    .line 305
    .line 306
    iput-object v0, v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/r;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;

    .line 307
    .line 308
    iput-object v1, v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/r;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/t;

    .line 309
    .line 310
    iput-object v2, v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/r;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/l;

    .line 311
    .line 312
    iput-object v6, v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/r;->d:Lcom/moloco/sdk/common_adapter_internal/a;

    .line 313
    .line 314
    iput-object v8, v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/r;->e:Ljava/lang/String;

    .line 315
    .line 316
    move-object/from16 v17, v0

    .line 317
    .line 318
    move-object/from16 v0, v21

    .line 319
    .line 320
    check-cast v0, Ljava/util/List;

    .line 321
    .line 322
    iput-object v0, v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/r;->f:Ljava/util/List;

    .line 323
    .line 324
    iput-object v14, v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/r;->g:Lef/i;

    .line 325
    .line 326
    iput-object v13, v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/r;->h:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/i;

    .line 327
    .line 328
    iput-object v12, v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/r;->i:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/b;

    .line 329
    .line 330
    iput-object v11, v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/r;->j:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/k;

    .line 331
    .line 332
    move-object/from16 v0, p0

    .line 333
    .line 334
    check-cast v0, Ljava/util/Iterator;

    .line 335
    .line 336
    iput-object v0, v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/r;->k:Ljava/util/Iterator;

    .line 337
    .line 338
    iput-object v15, v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/r;->l:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/j;

    .line 339
    .line 340
    iput-wide v3, v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/r;->m:D

    .line 341
    .line 342
    iput-boolean v7, v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/r;->n:Z

    .line 343
    .line 344
    const/4 v0, 0x1

    .line 345
    iput v0, v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/r;->q:I

    .line 346
    .line 347
    iget-object v10, v10, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/u;->b:Ljava/lang/Long;

    .line 348
    .line 349
    move-wide/from16 v22, v3

    .line 350
    .line 351
    move-object/from16 v20, v5

    .line 352
    .line 353
    move-object/from16 v25, v6

    .line 354
    .line 355
    move/from16 v26, v7

    .line 356
    .line 357
    move-object/from16 v27, v8

    .line 358
    .line 359
    move-object/from16 v28, v9

    .line 360
    .line 361
    move-object/from16 v24, v10

    .line 362
    .line 363
    invoke-virtual/range {v17 .. v28}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;->f(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/u;Ljava/util/ArrayList;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/a;Ljava/util/List;DLjava/lang/Long;Lcom/moloco/sdk/common_adapter_internal/a;ZLjava/lang/String;Llf/c;)Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v3

    .line 367
    move-object/from16 v4, v17

    .line 368
    .line 369
    move-object/from16 v5, v21

    .line 370
    .line 371
    move-object/from16 v8, v25

    .line 372
    .line 373
    move-object/from16 v6, v29

    .line 374
    .line 375
    if-ne v3, v6, :cond_a

    .line 376
    .line 377
    return-object v6

    .line 378
    :cond_a
    move-object/from16 v9, p0

    .line 379
    .line 380
    move-object v7, v2

    .line 381
    move-object v10, v11

    .line 382
    move-object v11, v12

    .line 383
    move-object v12, v13

    .line 384
    move-object v13, v14

    .line 385
    move-object v14, v5

    .line 386
    :goto_5
    check-cast v3, Lcom/moloco/sdk/internal/A;

    .line 387
    .line 388
    instance-of v2, v3, Lcom/moloco/sdk/internal/y;

    .line 389
    .line 390
    if-eqz v2, :cond_b

    .line 391
    .line 392
    sget-object v2, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 393
    .line 394
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 395
    .line 396
    .line 397
    new-instance v5, Ljava/lang/StringBuilder;

    .line 398
    .line 399
    const-string v10, "Failed to prepare RenderLinear: "

    .line 400
    .line 401
    invoke-direct {v5, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 402
    .line 403
    .line 404
    check-cast v3, Lcom/moloco/sdk/internal/y;

    .line 405
    .line 406
    iget-object v10, v3, Lcom/moloco/sdk/internal/y;->a:Ljava/lang/Object;

    .line 407
    .line 408
    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 409
    .line 410
    .line 411
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v5

    .line 415
    const/16 v10, 0xc

    .line 416
    .line 417
    const/16 v16, 0x0

    .line 418
    .line 419
    const-string v17, "VastAdLoaderImpl"

    .line 420
    .line 421
    const/16 v18, 0x0

    .line 422
    .line 423
    const/16 v19, 0x0

    .line 424
    .line 425
    move-object/from16 p0, v2

    .line 426
    .line 427
    move-object/from16 p2, v5

    .line 428
    .line 429
    move/from16 p5, v10

    .line 430
    .line 431
    move-object/from16 p6, v16

    .line 432
    .line 433
    move-object/from16 p1, v17

    .line 434
    .line 435
    move-object/from16 p3, v18

    .line 436
    .line 437
    move/from16 p4, v19

    .line 438
    .line 439
    invoke-static/range {p0 .. p6}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 440
    .line 441
    .line 442
    iget-object v2, v3, Lcom/moloco/sdk/internal/y;->a:Ljava/lang/Object;

    .line 443
    .line 444
    check-cast v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/k;

    .line 445
    .line 446
    move-object v10, v9

    .line 447
    move-object/from16 v21, v14

    .line 448
    .line 449
    move-object/from16 v9, v28

    .line 450
    .line 451
    move-object v14, v13

    .line 452
    move-object v13, v12

    .line 453
    move-object v12, v11

    .line 454
    move-object v11, v2

    .line 455
    move-object v2, v7

    .line 456
    move/from16 v7, v26

    .line 457
    .line 458
    goto :goto_8

    .line 459
    :cond_b
    instance-of v2, v3, Lcom/moloco/sdk/internal/z;

    .line 460
    .line 461
    if-eqz v2, :cond_c

    .line 462
    .line 463
    check-cast v3, Lcom/moloco/sdk/internal/z;

    .line 464
    .line 465
    iget-object v2, v3, Lcom/moloco/sdk/internal/z;->a:Ljava/lang/Object;

    .line 466
    .line 467
    check-cast v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/i;

    .line 468
    .line 469
    move-object v12, v11

    .line 470
    move-object/from16 v21, v14

    .line 471
    .line 472
    move-object v11, v10

    .line 473
    move-object v14, v13

    .line 474
    move-object v13, v2

    .line 475
    move-object v2, v7

    .line 476
    move-object v10, v9

    .line 477
    :goto_6
    move/from16 v7, v26

    .line 478
    .line 479
    move-object/from16 v9, v28

    .line 480
    .line 481
    goto :goto_8

    .line 482
    :cond_c
    new-instance v0, LE5/Q;

    .line 483
    .line 484
    const/16 v1, 0x9

    .line 485
    .line 486
    const/4 v2, 0x0

    .line 487
    invoke-direct {v0, v2, v1}, LE5/Q;-><init>(BI)V

    .line 488
    .line 489
    .line 490
    throw v0

    .line 491
    :cond_d
    move-object/from16 v27, v8

    .line 492
    .line 493
    move-object v8, v6

    .line 494
    move-object/from16 v6, v29

    .line 495
    .line 496
    move-wide/from16 v22, v3

    .line 497
    .line 498
    move/from16 v26, v7

    .line 499
    .line 500
    move-object/from16 v28, v9

    .line 501
    .line 502
    move-object/from16 v5, v21

    .line 503
    .line 504
    move-object v4, v0

    .line 505
    const/4 v0, 0x1

    .line 506
    goto :goto_7

    .line 507
    :cond_e
    move-object/from16 v27, v8

    .line 508
    .line 509
    move-object v8, v6

    .line 510
    move-object v6, v5

    .line 511
    move-wide/from16 v22, v3

    .line 512
    .line 513
    move/from16 v26, v7

    .line 514
    .line 515
    move-object/from16 v28, v9

    .line 516
    .line 517
    move-object v4, v0

    .line 518
    const/4 v0, 0x1

    .line 519
    move-object/from16 v5, v21

    .line 520
    .line 521
    :goto_7
    move-object/from16 v10, p0

    .line 522
    .line 523
    move-object/from16 v21, v5

    .line 524
    .line 525
    goto :goto_6

    .line 526
    :goto_8
    if-nez v12, :cond_f

    .line 527
    .line 528
    iget-object v3, v15, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/j;->e:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/m;

    .line 529
    .line 530
    instance-of v5, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/k;

    .line 531
    .line 532
    if-eqz v5, :cond_f

    .line 533
    .line 534
    check-cast v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/k;

    .line 535
    .line 536
    iget-object v3, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/k;->a:Ljava/util/List;

    .line 537
    .line 538
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 539
    .line 540
    .line 541
    invoke-static {v3, v8}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;->a(Ljava/util/List;Lcom/moloco/sdk/common_adapter_internal/a;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/b;

    .line 542
    .line 543
    .line 544
    move-result-object v12

    .line 545
    :cond_f
    move-object v0, v4

    .line 546
    move-object v5, v6

    .line 547
    move-object v6, v8

    .line 548
    move-wide/from16 v3, v22

    .line 549
    .line 550
    move-object/from16 v8, v27

    .line 551
    .line 552
    goto/16 :goto_2

    .line 553
    .line 554
    :goto_9
    if-nez v13, :cond_10

    .line 555
    .line 556
    sget-object v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/E;->h:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/E;

    .line 557
    .line 558
    invoke-virtual {v4, v5, v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;->j(Ljava/util/List;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/E;)V

    .line 559
    .line 560
    .line 561
    sget-object v0, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 562
    .line 563
    new-instance v1, Ljava/lang/StringBuilder;

    .line 564
    .line 565
    const-string v2, "Failed to load linear: "

    .line 566
    .line 567
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 568
    .line 569
    .line 570
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 571
    .line 572
    .line 573
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 574
    .line 575
    .line 576
    move-result-object v1

    .line 577
    const/16 v2, 0xc

    .line 578
    .line 579
    const/4 v3, 0x0

    .line 580
    const-string v4, "VastAdLoaderImpl"

    .line 581
    .line 582
    const/4 v5, 0x0

    .line 583
    const/4 v6, 0x0

    .line 584
    move-object/from16 p0, v0

    .line 585
    .line 586
    move-object/from16 p2, v1

    .line 587
    .line 588
    move/from16 p5, v2

    .line 589
    .line 590
    move-object/from16 p6, v3

    .line 591
    .line 592
    move-object/from16 p1, v4

    .line 593
    .line 594
    move-object/from16 p3, v5

    .line 595
    .line 596
    move/from16 p4, v6

    .line 597
    .line 598
    invoke-static/range {p0 .. p6}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 599
    .line 600
    .line 601
    new-instance v0, Lcom/moloco/sdk/internal/y;

    .line 602
    .line 603
    invoke-direct {v0, v11}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V

    .line 604
    .line 605
    .line 606
    return-object v0

    .line 607
    :cond_10
    sget-object v0, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 608
    .line 609
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 610
    .line 611
    .line 612
    const/16 v3, 0xc

    .line 613
    .line 614
    const/4 v6, 0x0

    .line 615
    const-string v7, "VastAdLoaderImpl"

    .line 616
    .line 617
    const-string v9, "RenderAd loaded successfully."

    .line 618
    .line 619
    const/4 v10, 0x0

    .line 620
    const/4 v11, 0x0

    .line 621
    move-object/from16 p0, v0

    .line 622
    .line 623
    move/from16 p5, v3

    .line 624
    .line 625
    move-object/from16 p6, v6

    .line 626
    .line 627
    move-object/from16 p1, v7

    .line 628
    .line 629
    move-object/from16 p2, v9

    .line 630
    .line 631
    move-object/from16 p3, v10

    .line 632
    .line 633
    move/from16 p4, v11

    .line 634
    .line 635
    invoke-static/range {p0 .. p6}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 636
    .line 637
    .line 638
    iget-object v0, v13, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/i;->g:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/h;

    .line 639
    .line 640
    if-nez v0, :cond_11

    .line 641
    .line 642
    invoke-interface {v14}, Lef/i;->getValue()Ljava/lang/Object;

    .line 643
    .line 644
    .line 645
    move-result-object v0

    .line 646
    check-cast v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/m;

    .line 647
    .line 648
    iget-object v0, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/m;->c:Ljava/util/ArrayList;

    .line 649
    .line 650
    new-instance v3, LBf/e;

    .line 651
    .line 652
    const/4 v6, 0x1

    .line 653
    invoke-direct {v3, v0, v6}, LBf/e;-><init>(Ljava/lang/Object;I)V

    .line 654
    .line 655
    .line 656
    invoke-static {v3}, Lff/o;->j0(Ljava/lang/Iterable;)LAf/o;

    .line 657
    .line 658
    .line 659
    move-result-object v0

    .line 660
    new-instance v3, Lcom/moloco/sdk/internal/publisher/d;

    .line 661
    .line 662
    const/16 v6, 0x12

    .line 663
    .line 664
    invoke-direct {v3, v4, v6}, Lcom/moloco/sdk/internal/publisher/d;-><init>(Ljava/lang/Object;I)V

    .line 665
    .line 666
    .line 667
    invoke-static {v0, v3}, LAf/n;->d0(LAf/k;Ltf/l;)LAf/g;

    .line 668
    .line 669
    .line 670
    move-result-object v0

    .line 671
    invoke-static {v0}, LAf/n;->X(LAf/k;)Ljava/lang/Object;

    .line 672
    .line 673
    .line 674
    move-result-object v0

    .line 675
    check-cast v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/h;

    .line 676
    .line 677
    const-string v3, "localMediaResource"

    .line 678
    .line 679
    iget-object v6, v13, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/i;->b:Ljava/io/File;

    .line 680
    .line 681
    invoke-static {v6, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 682
    .line 683
    .line 684
    const-string v3, "networkMediaResource"

    .line 685
    .line 686
    iget-object v7, v13, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/i;->d:Ljava/lang/String;

    .line 687
    .line 688
    invoke-static {v7, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 689
    .line 690
    .line 691
    iget-object v3, v13, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/i;->f:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/k;

    .line 692
    .line 693
    new-instance v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/i;

    .line 694
    .line 695
    iget-object v10, v13, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/i;->e:Ljava/lang/String;

    .line 696
    .line 697
    iget-object v11, v13, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/i;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/y;

    .line 698
    .line 699
    iget-object v13, v13, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/i;->c:Ljava/lang/Integer;

    .line 700
    .line 701
    move-object/from16 p7, v0

    .line 702
    .line 703
    move-object/from16 p6, v3

    .line 704
    .line 705
    move-object/from16 p2, v6

    .line 706
    .line 707
    move-object/from16 p4, v7

    .line 708
    .line 709
    move-object/from16 p0, v9

    .line 710
    .line 711
    move-object/from16 p5, v10

    .line 712
    .line 713
    move-object/from16 p1, v11

    .line 714
    .line 715
    move-object/from16 p3, v13

    .line 716
    .line 717
    invoke-direct/range {p0 .. p7}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/i;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/y;Ljava/io/File;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/k;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/h;)V

    .line 718
    .line 719
    .line 720
    move-object/from16 v13, p0

    .line 721
    .line 722
    :cond_11
    if-nez v12, :cond_12

    .line 723
    .line 724
    invoke-interface {v14}, Lef/i;->getValue()Ljava/lang/Object;

    .line 725
    .line 726
    .line 727
    move-result-object v0

    .line 728
    check-cast v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/m;

    .line 729
    .line 730
    iget-object v0, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/m;->d:Ljava/util/ArrayList;

    .line 731
    .line 732
    new-instance v3, LBf/e;

    .line 733
    .line 734
    const/4 v6, 0x1

    .line 735
    invoke-direct {v3, v0, v6}, LBf/e;-><init>(Ljava/lang/Object;I)V

    .line 736
    .line 737
    .line 738
    invoke-static {v3}, Lff/o;->j0(Ljava/lang/Iterable;)LAf/o;

    .line 739
    .line 740
    .line 741
    move-result-object v0

    .line 742
    new-instance v3, LAf/r;

    .line 743
    .line 744
    invoke-direct {v3, v4, v8}, LAf/r;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;Lcom/moloco/sdk/common_adapter_internal/a;)V

    .line 745
    .line 746
    .line 747
    invoke-static {v0, v3}, LAf/n;->d0(LAf/k;Ltf/l;)LAf/g;

    .line 748
    .line 749
    .line 750
    move-result-object v0

    .line 751
    invoke-static {v0}, LAf/n;->X(LAf/k;)Ljava/lang/Object;

    .line 752
    .line 753
    .line 754
    move-result-object v0

    .line 755
    move-object v12, v0

    .line 756
    check-cast v12, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/b;

    .line 757
    .line 758
    :cond_12
    if-eqz v2, :cond_13

    .line 759
    .line 760
    iget-object v8, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/l;->a:Ljava/util/List;

    .line 761
    .line 762
    goto :goto_a

    .line 763
    :cond_13
    const/4 v8, 0x0

    .line 764
    :goto_a
    iget-object v0, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/t;->a:Ljava/util/List;

    .line 765
    .line 766
    invoke-static {v8, v0}, Lad/I;->c(Ljava/util/List;Ljava/util/List;)Ljava/util/ArrayList;

    .line 767
    .line 768
    .line 769
    move-result-object v0

    .line 770
    new-instance v1, Ljava/util/ArrayList;

    .line 771
    .line 772
    const/16 v2, 0xa

    .line 773
    .line 774
    invoke-static {v0, v2}, Lff/p;->a0(Ljava/lang/Iterable;I)I

    .line 775
    .line 776
    .line 777
    move-result v2

    .line 778
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 779
    .line 780
    .line 781
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 782
    .line 783
    .line 784
    move-result-object v0

    .line 785
    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 786
    .line 787
    .line 788
    move-result v2

    .line 789
    if-eqz v2, :cond_14

    .line 790
    .line 791
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 792
    .line 793
    .line 794
    move-result-object v2

    .line 795
    check-cast v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/s;

    .line 796
    .line 797
    iget-object v2, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/s;->a:Ljava/lang/String;

    .line 798
    .line 799
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 800
    .line 801
    .line 802
    goto :goto_b

    .line 803
    :cond_14
    sget-object v0, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 804
    .line 805
    const/16 v2, 0xc

    .line 806
    .line 807
    const/4 v3, 0x0

    .line 808
    const-string v4, "VastAdLoaderImpl"

    .line 809
    .line 810
    const-string v6, "Returning RenderAd"

    .line 811
    .line 812
    const/4 v7, 0x0

    .line 813
    const/4 v8, 0x0

    .line 814
    move-object/from16 p0, v0

    .line 815
    .line 816
    move/from16 p5, v2

    .line 817
    .line 818
    move-object/from16 p6, v3

    .line 819
    .line 820
    move-object/from16 p1, v4

    .line 821
    .line 822
    move-object/from16 p2, v6

    .line 823
    .line 824
    move-object/from16 p3, v7

    .line 825
    .line 826
    move/from16 p4, v8

    .line 827
    .line 828
    invoke-static/range {p0 .. p6}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 829
    .line 830
    .line 831
    new-instance v0, Lcom/moloco/sdk/internal/z;

    .line 832
    .line 833
    new-instance v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/a;

    .line 834
    .line 835
    const/4 v3, 0x0

    .line 836
    move-object/from16 p3, v1

    .line 837
    .line 838
    move-object/from16 p0, v2

    .line 839
    .line 840
    move-object/from16 p5, v3

    .line 841
    .line 842
    move-object/from16 p4, v5

    .line 843
    .line 844
    move-object/from16 p2, v12

    .line 845
    .line 846
    move-object/from16 p1, v13

    .line 847
    .line 848
    invoke-direct/range {p0 .. p5}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/a;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/i;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/b;Ljava/util/List;Ljava/util/List;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/z0;)V

    .line 849
    .line 850
    .line 851
    move-object/from16 v1, p0

    .line 852
    .line 853
    invoke-direct {v0, v1}, Lcom/moloco/sdk/internal/z;-><init>(Ljava/lang/Object;)V

    .line 854
    .line 855
    .line 856
    return-object v0
.end method


# virtual methods
.method public final e(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/b;Ljava/util/ArrayList;Llf/c;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    const-string v3, "Fetching wrapper vast tag url: "

    .line 8
    .line 9
    instance-of v4, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/q;

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    move-object v4, v2

    .line 14
    check-cast v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/q;

    .line 15
    .line 16
    iget v5, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/q;->e:I

    .line 17
    .line 18
    const/high16 v6, -0x80000000

    .line 19
    .line 20
    and-int v7, v5, v6

    .line 21
    .line 22
    if-eqz v7, :cond_0

    .line 23
    .line 24
    sub-int/2addr v5, v6

    .line 25
    iput v5, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/q;->e:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/q;

    .line 29
    .line 30
    invoke-direct {v4, v1, v2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/q;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;Llf/c;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object v2, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/q;->c:Ljava/lang/Object;

    .line 34
    .line 35
    sget-object v5, Lkf/a;->a:Lkf/a;

    .line 36
    .line 37
    iget v6, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/q;->e:I

    .line 38
    .line 39
    const/4 v7, 0x3

    .line 40
    const/4 v8, 0x2

    .line 41
    const/4 v9, 0x1

    .line 42
    if-eqz v6, :cond_5

    .line 43
    .line 44
    if-eq v6, v9, :cond_4

    .line 45
    .line 46
    if-eq v6, v8, :cond_2

    .line 47
    .line 48
    if-ne v6, v7, :cond_1

    .line 49
    .line 50
    iget-object v0, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/q;->b:Ljava/util/List;

    .line 51
    .line 52
    check-cast v0, Ljava/util/List;

    .line 53
    .line 54
    iget-object v3, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/q;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;

    .line 55
    .line 56
    invoke-static {v2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto/16 :goto_4

    .line 60
    .line 61
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 62
    .line 63
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 64
    .line 65
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw v0

    .line 69
    :cond_2
    iget-object v0, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/q;->b:Ljava/util/List;

    .line 70
    .line 71
    move-object v3, v0

    .line 72
    check-cast v3, Ljava/util/List;

    .line 73
    .line 74
    iget-object v6, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/q;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;

    .line 75
    .line 76
    :try_start_0
    invoke-static {v2}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catch LCd/c0; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 77
    .line 78
    .line 79
    move-object v0, v2

    .line 80
    move-object v2, v3

    .line 81
    :cond_3
    move-object v3, v6

    .line 82
    goto/16 :goto_2

    .line 83
    .line 84
    :catch_0
    move-exception v0

    .line 85
    move-object v2, v3

    .line 86
    goto/16 :goto_a

    .line 87
    .line 88
    :catch_1
    move-exception v0

    .line 89
    move-object v2, v3

    .line 90
    goto/16 :goto_c

    .line 91
    .line 92
    :cond_4
    iget-object v0, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/q;->b:Ljava/util/List;

    .line 93
    .line 94
    move-object v3, v0

    .line 95
    check-cast v3, Ljava/util/List;

    .line 96
    .line 97
    iget-object v6, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/q;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;

    .line 98
    .line 99
    :try_start_1
    invoke-static {v2}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_1
    .catch LCd/c0; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 100
    .line 101
    .line 102
    move-object v0, v2

    .line 103
    move-object v2, v3

    .line 104
    goto :goto_1

    .line 105
    :cond_5
    invoke-static {v2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    :try_start_2
    sget-object v10, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 109
    .line 110
    const-string v11, "VastAdLoaderImpl"

    .line 111
    .line 112
    new-instance v2, Ljava/lang/StringBuilder;

    .line 113
    .line 114
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    iget-object v3, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/b;->a:Ljava/lang/String;

    .line 118
    .line 119
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v12

    .line 126
    const/4 v13, 0x0

    .line 127
    const/4 v14, 0x0

    .line 128
    const/16 v15, 0xc

    .line 129
    .line 130
    const/16 v16, 0x0

    .line 131
    .line 132
    invoke-static/range {v10 .. v16}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    iget-object v2, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;->f:Lwd/c;

    .line 136
    .line 137
    iget-object v0, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/b;->a:Ljava/lang/String;

    .line 138
    .line 139
    new-instance v3, LFd/c;

    .line 140
    .line 141
    invoke-direct {v3}, LFd/c;-><init>()V

    .line 142
    .line 143
    .line 144
    invoke-static {v3, v0}, LFd/e;->b(LFd/c;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    const-wide/16 v10, 0x1388

    .line 148
    .line 149
    invoke-static {v3, v10, v11}, LA6/h;->d(LFd/c;J)V

    .line 150
    .line 151
    .line 152
    sget-object v0, LJd/s;->b:LJd/s;

    .line 153
    .line 154
    invoke-virtual {v3, v0}, LFd/c;->c(LJd/s;)V

    .line 155
    .line 156
    .line 157
    new-instance v0, LS3/s;

    .line 158
    .line 159
    invoke-direct {v0, v3, v2}, LS3/s;-><init>(LFd/c;Lwd/c;)V

    .line 160
    .line 161
    .line 162
    iput-object v1, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/q;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;
    :try_end_2
    .catch LCd/c0; {:try_start_2 .. :try_end_2} :catch_9
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_8

    .line 163
    .line 164
    move-object/from16 v2, p2

    .line 165
    .line 166
    :try_start_3
    iput-object v2, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/q;->b:Ljava/util/List;

    .line 167
    .line 168
    iput v9, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/q;->e:I

    .line 169
    .line 170
    invoke-virtual {v0, v4}, LS3/s;->p(Llf/c;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v0
    :try_end_3
    .catch LCd/c0; {:try_start_3 .. :try_end_3} :catch_7
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_6

    .line 174
    if-ne v0, v5, :cond_6

    .line 175
    .line 176
    goto :goto_3

    .line 177
    :cond_6
    move-object v6, v1

    .line 178
    :goto_1
    :try_start_4
    check-cast v0, LGd/a;

    .line 179
    .line 180
    iput-object v6, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/q;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;

    .line 181
    .line 182
    move-object v3, v2

    .line 183
    check-cast v3, Ljava/util/List;

    .line 184
    .line 185
    iput-object v3, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/q;->b:Ljava/util/List;

    .line 186
    .line 187
    iput v8, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/q;->e:I

    .line 188
    .line 189
    sget-object v3, LBf/a;->a:Ljava/nio/charset/Charset;

    .line 190
    .line 191
    invoke-static {v0, v3, v4}, Lgc/b;->h(LGd/a;Ljava/nio/charset/Charset;Llf/c;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v0
    :try_end_4
    .catch LCd/c0; {:try_start_4 .. :try_end_4} :catch_5
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    .line 195
    if-ne v0, v5, :cond_3

    .line 196
    .line 197
    goto :goto_3

    .line 198
    :goto_2
    :try_start_5
    check-cast v0, Ljava/lang/String;
    :try_end_5
    .catch LCd/c0; {:try_start_5 .. :try_end_5} :catch_3
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    .line 199
    .line 200
    iget-object v6, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I;

    .line 201
    .line 202
    iput-object v3, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/q;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;

    .line 203
    .line 204
    move-object v8, v2

    .line 205
    check-cast v8, Ljava/util/List;

    .line 206
    .line 207
    iput-object v8, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/q;->b:Ljava/util/List;

    .line 208
    .line 209
    iput v7, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/q;->e:I

    .line 210
    .line 211
    invoke-virtual {v6, v0, v4}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I;->a(Ljava/lang/String;Llf/c;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    if-ne v0, v5, :cond_7

    .line 216
    .line 217
    :goto_3
    return-object v5

    .line 218
    :cond_7
    move-object/from16 v17, v2

    .line 219
    .line 220
    move-object v2, v0

    .line 221
    move-object/from16 v0, v17

    .line 222
    .line 223
    :goto_4
    instance-of v4, v2, Lcom/moloco/sdk/internal/z;

    .line 224
    .line 225
    const/4 v5, 0x0

    .line 226
    if-eqz v4, :cond_8

    .line 227
    .line 228
    check-cast v2, Lcom/moloco/sdk/internal/z;

    .line 229
    .line 230
    goto :goto_5

    .line 231
    :cond_8
    move-object v2, v5

    .line 232
    :goto_5
    if-eqz v2, :cond_9

    .line 233
    .line 234
    iget-object v2, v2, Lcom/moloco/sdk/internal/z;->a:Ljava/lang/Object;

    .line 235
    .line 236
    move-object v5, v2

    .line 237
    check-cast v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/D;

    .line 238
    .line 239
    :cond_9
    if-nez v5, :cond_a

    .line 240
    .line 241
    sget-object v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/E;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/E;

    .line 242
    .line 243
    invoke-virtual {v3, v0, v2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;->j(Ljava/util/List;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/E;)V

    .line 244
    .line 245
    .line 246
    sget-object v4, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 247
    .line 248
    const/4 v7, 0x0

    .line 249
    const/4 v8, 0x0

    .line 250
    const-string v5, "VastAdLoaderImpl"

    .line 251
    .line 252
    const-string v6, "Failed to create VAST object from XML"

    .line 253
    .line 254
    const/16 v9, 0xc

    .line 255
    .line 256
    const/4 v10, 0x0

    .line 257
    invoke-static/range {v4 .. v10}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    new-instance v0, Lcom/moloco/sdk/internal/y;

    .line 261
    .line 262
    sget-object v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/k;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/k;

    .line 263
    .line 264
    invoke-direct {v0, v2}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    return-object v0

    .line 268
    :cond_a
    new-instance v0, Lcom/moloco/sdk/internal/z;

    .line 269
    .line 270
    invoke-direct {v0, v5}, Lcom/moloco/sdk/internal/z;-><init>(Ljava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    return-object v0

    .line 274
    :catch_2
    move-exception v0

    .line 275
    :goto_6
    move-object v10, v0

    .line 276
    goto :goto_b

    .line 277
    :catch_3
    move-exception v0

    .line 278
    :goto_7
    move-object v10, v0

    .line 279
    goto :goto_d

    .line 280
    :catch_4
    move-exception v0

    .line 281
    goto :goto_a

    .line 282
    :catch_5
    move-exception v0

    .line 283
    goto :goto_c

    .line 284
    :goto_8
    move-object v6, v1

    .line 285
    goto :goto_a

    .line 286
    :goto_9
    move-object v6, v1

    .line 287
    goto :goto_c

    .line 288
    :catch_6
    move-exception v0

    .line 289
    goto :goto_8

    .line 290
    :catch_7
    move-exception v0

    .line 291
    goto :goto_9

    .line 292
    :catch_8
    move-exception v0

    .line 293
    move-object/from16 v2, p2

    .line 294
    .line 295
    goto :goto_8

    .line 296
    :catch_9
    move-exception v0

    .line 297
    move-object/from16 v2, p2

    .line 298
    .line 299
    goto :goto_9

    .line 300
    :goto_a
    move-object v3, v6

    .line 301
    goto :goto_6

    .line 302
    :goto_b
    sget-object v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/E;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/E;

    .line 303
    .line 304
    invoke-virtual {v3, v2, v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;->j(Ljava/util/List;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/E;)V

    .line 305
    .line 306
    .line 307
    sget-object v7, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 308
    .line 309
    const-string v9, "Fetching wrapper vast tag url fetch error"

    .line 310
    .line 311
    const/4 v11, 0x0

    .line 312
    const-string v8, "VastAdLoaderImpl"

    .line 313
    .line 314
    const/16 v12, 0x8

    .line 315
    .line 316
    const/4 v13, 0x0

    .line 317
    invoke-static/range {v7 .. v13}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 318
    .line 319
    .line 320
    new-instance v0, Lcom/moloco/sdk/internal/y;

    .line 321
    .line 322
    sget-object v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/k;->g:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/k;

    .line 323
    .line 324
    invoke-direct {v0, v2}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V

    .line 325
    .line 326
    .line 327
    return-object v0

    .line 328
    :goto_c
    move-object v3, v6

    .line 329
    goto :goto_7

    .line 330
    :goto_d
    sget-object v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/E;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/E;

    .line 331
    .line 332
    invoke-virtual {v3, v2, v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;->j(Ljava/util/List;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/E;)V

    .line 333
    .line 334
    .line 335
    sget-object v7, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 336
    .line 337
    const-string v9, "Fetching wrapper vast tag url timed out"

    .line 338
    .line 339
    const/4 v11, 0x0

    .line 340
    const-string v8, "VastAdLoaderImpl"

    .line 341
    .line 342
    const/16 v12, 0x8

    .line 343
    .line 344
    const/4 v13, 0x0

    .line 345
    invoke-static/range {v7 .. v13}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 346
    .line 347
    .line 348
    new-instance v0, Lcom/moloco/sdk/internal/y;

    .line 349
    .line 350
    sget-object v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/k;->f:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/k;

    .line 351
    .line 352
    invoke-direct {v0, v2}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V

    .line 353
    .line 354
    .line 355
    return-object v0
.end method

.method public final f(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/u;Ljava/util/ArrayList;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/a;Ljava/util/List;DLjava/lang/Long;Lcom/moloco/sdk/common_adapter_internal/a;ZLjava/lang/String;Llf/c;)Ljava/lang/Object;
    .locals 30

    .line 1
    move-object/from16 v3, p0

    .line 2
    .line 3
    move-object/from16 v6, p1

    .line 4
    .line 5
    move-object/from16 v0, p8

    .line 6
    .line 7
    move-object/from16 v1, p11

    .line 8
    .line 9
    instance-of v2, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/A;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    move-object v2, v1

    .line 14
    check-cast v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/A;

    .line 15
    .line 16
    iget v4, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/A;->h:I

    .line 17
    .line 18
    const/high16 v5, -0x80000000

    .line 19
    .line 20
    and-int v7, v4, v5

    .line 21
    .line 22
    if-eqz v7, :cond_0

    .line 23
    .line 24
    sub-int/2addr v4, v5

    .line 25
    iput v4, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/A;->h:I

    .line 26
    .line 27
    :goto_0
    move-object v7, v2

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    new-instance v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/A;

    .line 30
    .line 31
    invoke-direct {v2, v3, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/A;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;Llf/c;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :goto_1
    iget-object v1, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/A;->f:Ljava/lang/Object;

    .line 36
    .line 37
    sget-object v8, Lkf/a;->a:Lkf/a;

    .line 38
    .line 39
    iget v2, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/A;->h:I

    .line 40
    .line 41
    const/4 v9, 0x1

    .line 42
    if-eqz v2, :cond_2

    .line 43
    .line 44
    if-ne v2, v9, :cond_1

    .line 45
    .line 46
    iget-object v0, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/A;->e:Lkotlin/jvm/internal/G;

    .line 47
    .line 48
    iget-object v2, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/A;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/a;

    .line 49
    .line 50
    iget-object v4, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/A;->c:Ljava/util/List;

    .line 51
    .line 52
    check-cast v4, Ljava/util/List;

    .line 53
    .line 54
    iget-object v5, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/A;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/u;

    .line 55
    .line 56
    iget-object v6, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/A;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;

    .line 57
    .line 58
    invoke-static {v1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto/16 :goto_4

    .line 62
    .line 63
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 64
    .line 65
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 66
    .line 67
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw v0

    .line 71
    :cond_2
    invoke-static {v1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    sget-object v10, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 75
    .line 76
    new-instance v1, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    const-string v2, "Preparing InLine RenderLinear with target linear size: "

    .line 79
    .line 80
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    move-wide/from16 v4, p5

    .line 84
    .line 85
    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v12

    .line 92
    const/4 v13, 0x0

    .line 93
    const/4 v14, 0x0

    .line 94
    const-string v11, "VastAdLoaderImpl"

    .line 95
    .line 96
    const/16 v15, 0xc

    .line 97
    .line 98
    const/16 v16, 0x0

    .line 99
    .line 100
    invoke-static/range {v10 .. v16}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    iget-object v1, v6, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/u;->c:Ljava/util/List;

    .line 104
    .line 105
    new-instance v2, Ljava/util/ArrayList;

    .line 106
    .line 107
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 108
    .line 109
    .line 110
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    :cond_3
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 115
    .line 116
    .line 117
    move-result v10

    .line 118
    if-eqz v10, :cond_6

    .line 119
    .line 120
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v10

    .line 124
    move-object v11, v10

    .line 125
    check-cast v11, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/v;

    .line 126
    .line 127
    iget-object v12, v11, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/v;->i:Ljava/lang/String;

    .line 128
    .line 129
    if-eqz v12, :cond_4

    .line 130
    .line 131
    invoke-static {v12}, LBf/k;->y0(Ljava/lang/CharSequence;)Z

    .line 132
    .line 133
    .line 134
    move-result v12

    .line 135
    if-eqz v12, :cond_3

    .line 136
    .line 137
    :cond_4
    iget-boolean v12, v11, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/v;->b:Z

    .line 138
    .line 139
    if-eqz v12, :cond_3

    .line 140
    .line 141
    sget-object v12, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 142
    .line 143
    iget-object v11, v11, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/v;->c:Ljava/lang/String;

    .line 144
    .line 145
    invoke-virtual {v11, v12}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v11

    .line 149
    const-string v12, "toLowerCase(...)"

    .line 150
    .line 151
    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    const-string v12, "video/mp4"

    .line 155
    .line 156
    invoke-virtual {v11, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v12

    .line 160
    if-nez v12, :cond_5

    .line 161
    .line 162
    const-string v12, "video/3gpp"

    .line 163
    .line 164
    invoke-virtual {v11, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v12

    .line 168
    if-nez v12, :cond_5

    .line 169
    .line 170
    const-string v12, "video/webm"

    .line 171
    .line 172
    invoke-virtual {v11, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v11

    .line 176
    if-eqz v11, :cond_3

    .line 177
    .line 178
    :cond_5
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    goto :goto_2

    .line 182
    :cond_6
    iget v1, v0, Lcom/moloco/sdk/common_adapter_internal/a;->a:I

    .line 183
    .line 184
    new-instance v15, Ljava/lang/Integer;

    .line 185
    .line 186
    invoke-direct {v15, v1}, Ljava/lang/Integer;-><init>(I)V

    .line 187
    .line 188
    .line 189
    new-instance v1, Ljava/lang/Integer;

    .line 190
    .line 191
    iget v0, v0, Lcom/moloco/sdk/common_adapter_internal/a;->b:I

    .line 192
    .line 193
    invoke-direct {v1, v0}, Ljava/lang/Integer;-><init>(I)V

    .line 194
    .line 195
    .line 196
    new-instance v11, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/j;

    .line 197
    .line 198
    move-object/from16 v14, p7

    .line 199
    .line 200
    move-object/from16 v16, v1

    .line 201
    .line 202
    move-wide v12, v4

    .line 203
    invoke-direct/range {v11 .. v16}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/j;-><init>(DLjava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 204
    .line 205
    .line 206
    invoke-static {v11, v2}, Lff/o;->M0(Ljava/util/Comparator;Ljava/lang/Iterable;)Ljava/util/List;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 211
    .line 212
    .line 213
    move-result v1

    .line 214
    if-eqz v1, :cond_7

    .line 215
    .line 216
    sget-object v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/E;->i:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/E;

    .line 217
    .line 218
    move-object/from16 v1, p4

    .line 219
    .line 220
    invoke-virtual {v3, v1, v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;->j(Ljava/util/List;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/E;)V

    .line 221
    .line 222
    .line 223
    new-instance v0, Lcom/moloco/sdk/internal/y;

    .line 224
    .line 225
    sget-object v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/k;->j:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/k;

    .line 226
    .line 227
    invoke-direct {v0, v1}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    return-object v0

    .line 231
    :cond_7
    new-instance v5, Lkotlin/jvm/internal/G;

    .line 232
    .line 233
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 234
    .line 235
    .line 236
    sget-object v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/k;->E:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/k;

    .line 237
    .line 238
    iput-object v1, v5, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 239
    .line 240
    new-instance v1, LHf/o;

    .line 241
    .line 242
    check-cast v0, Ljava/util/List;

    .line 243
    .line 244
    invoke-direct {v1, v0}, LHf/o;-><init>(Ljava/util/List;)V

    .line 245
    .line 246
    .line 247
    instance-of v0, v1, LHf/d;

    .line 248
    .line 249
    if-eqz v0, :cond_8

    .line 250
    .line 251
    goto :goto_3

    .line 252
    :cond_8
    new-instance v0, LHf/g;

    .line 253
    .line 254
    invoke-direct {v0, v1}, LHf/g;-><init>(LHf/o;)V

    .line 255
    .line 256
    .line 257
    move-object v1, v0

    .line 258
    :goto_3
    check-cast v1, LHf/d;

    .line 259
    .line 260
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/z;

    .line 261
    .line 262
    move/from16 v2, p9

    .line 263
    .line 264
    move-object/from16 v4, p10

    .line 265
    .line 266
    invoke-direct/range {v0 .. v5}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/z;-><init>(LHf/d;ZLcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;Ljava/lang/String;Lkotlin/jvm/internal/G;)V

    .line 267
    .line 268
    .line 269
    iput-object v3, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/A;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;

    .line 270
    .line 271
    iput-object v6, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/A;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/u;

    .line 272
    .line 273
    move-object/from16 v1, p2

    .line 274
    .line 275
    iput-object v1, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/A;->c:Ljava/util/List;

    .line 276
    .line 277
    move-object/from16 v2, p3

    .line 278
    .line 279
    iput-object v2, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/A;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/a;

    .line 280
    .line 281
    iput-object v5, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/A;->e:Lkotlin/jvm/internal/G;

    .line 282
    .line 283
    iput v9, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/A;->h:I

    .line 284
    .line 285
    invoke-static {v0, v7}, LHf/k0;->q(LHf/l;Llf/c;)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    if-ne v0, v8, :cond_9

    .line 290
    .line 291
    return-object v8

    .line 292
    :cond_9
    move-object v4, v1

    .line 293
    move-object v1, v0

    .line 294
    move-object v0, v5

    .line 295
    move-object v5, v6

    .line 296
    move-object v6, v3

    .line 297
    :goto_4
    check-cast v1, Lef/k;

    .line 298
    .line 299
    if-nez v1, :cond_a

    .line 300
    .line 301
    new-instance v1, Lcom/moloco/sdk/internal/y;

    .line 302
    .line 303
    iget-object v2, v0, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 304
    .line 305
    invoke-direct {v1, v2}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V

    .line 306
    .line 307
    .line 308
    sget-object v2, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 309
    .line 310
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 311
    .line 312
    .line 313
    new-instance v4, Ljava/lang/StringBuilder;

    .line 314
    .line 315
    const-string v5, "Failed to load media file: "

    .line 316
    .line 317
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    iget-object v0, v0, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 321
    .line 322
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    const/4 v4, 0x0

    .line 330
    const/4 v5, 0x0

    .line 331
    const-string v6, "VastAdLoaderImpl"

    .line 332
    .line 333
    const/16 v7, 0xc

    .line 334
    .line 335
    const/4 v8, 0x0

    .line 336
    move-object/from16 p3, v0

    .line 337
    .line 338
    move-object/from16 p1, v2

    .line 339
    .line 340
    move-object/from16 p4, v4

    .line 341
    .line 342
    move/from16 p5, v5

    .line 343
    .line 344
    move-object/from16 p2, v6

    .line 345
    .line 346
    move/from16 p6, v7

    .line 347
    .line 348
    move-object/from16 p7, v8

    .line 349
    .line 350
    invoke-static/range {p1 .. p7}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 351
    .line 352
    .line 353
    return-object v1

    .line 354
    :cond_a
    iget-object v0, v1, Lef/k;->a:Ljava/lang/Object;

    .line 355
    .line 356
    check-cast v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/v;

    .line 357
    .line 358
    iget-object v1, v1, Lef/k;->b:Ljava/lang/Object;

    .line 359
    .line 360
    check-cast v1, Ljava/io/File;

    .line 361
    .line 362
    sget-object v7, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 363
    .line 364
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 365
    .line 366
    .line 367
    new-instance v6, Ljava/lang/StringBuilder;

    .line 368
    .line 369
    const-string v8, "Found a RenderLinear MediaFile: "

    .line 370
    .line 371
    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 372
    .line 373
    .line 374
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v8

    .line 378
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 379
    .line 380
    .line 381
    const-string v8, " for url: "

    .line 382
    .line 383
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 384
    .line 385
    .line 386
    iget-object v8, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/v;->a:Ljava/lang/String;

    .line 387
    .line 388
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 389
    .line 390
    .line 391
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v6

    .line 395
    const/4 v8, 0x0

    .line 396
    const/4 v9, 0x0

    .line 397
    const-string v10, "VastAdLoaderImpl"

    .line 398
    .line 399
    const/16 v11, 0xc

    .line 400
    .line 401
    const/4 v12, 0x0

    .line 402
    move-object/from16 p3, v6

    .line 403
    .line 404
    move-object/from16 p1, v7

    .line 405
    .line 406
    move-object/from16 p4, v8

    .line 407
    .line 408
    move/from16 p5, v9

    .line 409
    .line 410
    move-object/from16 p2, v10

    .line 411
    .line 412
    move/from16 p6, v11

    .line 413
    .line 414
    move-object/from16 p7, v12

    .line 415
    .line 416
    invoke-static/range {p1 .. p7}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 417
    .line 418
    .line 419
    move-object/from16 v6, p1

    .line 420
    .line 421
    iget-object v7, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/u;->e:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/a;

    .line 422
    .line 423
    const/4 v8, 0x0

    .line 424
    if-eqz v7, :cond_b

    .line 425
    .line 426
    iget-object v7, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/a;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/J;

    .line 427
    .line 428
    if-eqz v7, :cond_b

    .line 429
    .line 430
    iget-object v7, v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/J;->a:Ljava/lang/String;

    .line 431
    .line 432
    goto :goto_5

    .line 433
    :cond_b
    move-object v7, v8

    .line 434
    :goto_5
    iget-object v9, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/u;->d:Ljava/util/List;

    .line 435
    .line 436
    invoke-static {v9, v4}, Lad/I;->c(Ljava/util/List;Ljava/util/List;)Ljava/util/ArrayList;

    .line 437
    .line 438
    .line 439
    move-result-object v4

    .line 440
    iget-object v9, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/u;->e:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/a;

    .line 441
    .line 442
    if-eqz v9, :cond_c

    .line 443
    .line 444
    iget-object v10, v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/a;->b:Ljava/util/List;

    .line 445
    .line 446
    goto :goto_6

    .line 447
    :cond_c
    move-object v10, v8

    .line 448
    :goto_6
    if-eqz v2, :cond_d

    .line 449
    .line 450
    iget-object v11, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/a;->b:Ljava/util/List;

    .line 451
    .line 452
    goto :goto_7

    .line 453
    :cond_d
    move-object v11, v8

    .line 454
    :goto_7
    invoke-static {v10, v11}, Lad/I;->c(Ljava/util/List;Ljava/util/List;)Ljava/util/ArrayList;

    .line 455
    .line 456
    .line 457
    move-result-object v10

    .line 458
    if-eqz v9, :cond_e

    .line 459
    .line 460
    iget-object v9, v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/a;->c:Ljava/util/List;

    .line 461
    .line 462
    goto :goto_8

    .line 463
    :cond_e
    move-object v9, v8

    .line 464
    :goto_8
    if-eqz v2, :cond_f

    .line 465
    .line 466
    iget-object v2, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/a;->c:Ljava/util/List;

    .line 467
    .line 468
    goto :goto_9

    .line 469
    :cond_f
    move-object v2, v8

    .line 470
    :goto_9
    invoke-static {v9, v2}, Lad/I;->c(Ljava/util/List;Ljava/util/List;)Ljava/util/ArrayList;

    .line 471
    .line 472
    .line 473
    new-instance v2, Ljava/lang/StringBuilder;

    .line 474
    .line 475
    const-string v9, "Returning RenderLinear for url: "

    .line 476
    .line 477
    invoke-direct {v2, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 478
    .line 479
    .line 480
    iget-object v9, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/v;->a:Ljava/lang/String;

    .line 481
    .line 482
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 483
    .line 484
    .line 485
    const-string v9, ", with bitrate: "

    .line 486
    .line 487
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 488
    .line 489
    .line 490
    iget-object v9, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/v;->f:Ljava/lang/Integer;

    .line 491
    .line 492
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 493
    .line 494
    .line 495
    const/16 v9, 0x20

    .line 496
    .line 497
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 498
    .line 499
    .line 500
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 501
    .line 502
    .line 503
    move-result-object v2

    .line 504
    const/4 v9, 0x0

    .line 505
    const/4 v11, 0x0

    .line 506
    const-string v12, "VastAdLoaderImpl"

    .line 507
    .line 508
    const/16 v13, 0xc

    .line 509
    .line 510
    const/4 v14, 0x0

    .line 511
    move-object/from16 p3, v2

    .line 512
    .line 513
    move-object/from16 p1, v6

    .line 514
    .line 515
    move-object/from16 p4, v9

    .line 516
    .line 517
    move/from16 p5, v11

    .line 518
    .line 519
    move-object/from16 p2, v12

    .line 520
    .line 521
    move/from16 p6, v13

    .line 522
    .line 523
    move-object/from16 p7, v14

    .line 524
    .line 525
    invoke-static/range {p1 .. p7}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 526
    .line 527
    .line 528
    new-instance v2, Lcom/moloco/sdk/internal/z;

    .line 529
    .line 530
    new-instance v6, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/i;

    .line 531
    .line 532
    new-instance v9, Ljava/util/LinkedHashMap;

    .line 533
    .line 534
    invoke-direct {v9}, Ljava/util/LinkedHashMap;-><init>()V

    .line 535
    .line 536
    .line 537
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 538
    .line 539
    .line 540
    move-result-object v4

    .line 541
    :goto_a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 542
    .line 543
    .line 544
    move-result v11

    .line 545
    if-eqz v11, :cond_11

    .line 546
    .line 547
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 548
    .line 549
    .line 550
    move-result-object v11

    .line 551
    move-object v12, v11

    .line 552
    check-cast v12, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/B;

    .line 553
    .line 554
    iget-object v12, v12, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/B;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/C;

    .line 555
    .line 556
    invoke-virtual {v9, v12}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 557
    .line 558
    .line 559
    move-result-object v13

    .line 560
    if-nez v13, :cond_10

    .line 561
    .line 562
    new-instance v13, Ljava/util/ArrayList;

    .line 563
    .line 564
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 565
    .line 566
    .line 567
    invoke-interface {v9, v12, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 568
    .line 569
    .line 570
    :cond_10
    check-cast v13, Ljava/util/List;

    .line 571
    .line 572
    invoke-interface {v13, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 573
    .line 574
    .line 575
    goto :goto_a

    .line 576
    :cond_11
    new-instance v14, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/k;

    .line 577
    .line 578
    sget-object v4, Lff/v;->a:Lff/v;

    .line 579
    .line 580
    new-instance v15, Ljava/util/ArrayList;

    .line 581
    .line 582
    const/16 v11, 0xa

    .line 583
    .line 584
    invoke-static {v10, v11}, Lff/p;->a0(Ljava/lang/Iterable;I)I

    .line 585
    .line 586
    .line 587
    move-result v11

    .line 588
    invoke-direct {v15, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 589
    .line 590
    .line 591
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 592
    .line 593
    .line 594
    move-result-object v10

    .line 595
    :goto_b
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 596
    .line 597
    .line 598
    move-result v11

    .line 599
    if-eqz v11, :cond_12

    .line 600
    .line 601
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 602
    .line 603
    .line 604
    move-result-object v11

    .line 605
    check-cast v11, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/J;

    .line 606
    .line 607
    iget-object v11, v11, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/J;->a:Ljava/lang/String;

    .line 608
    .line 609
    invoke-virtual {v15, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 610
    .line 611
    .line 612
    goto :goto_b

    .line 613
    :cond_12
    sget-object v10, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/C;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/C;

    .line 614
    .line 615
    invoke-static {v9, v10}, Lad/I;->g(Ljava/util/LinkedHashMap;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/C;)Ljava/util/List;

    .line 616
    .line 617
    .line 618
    move-result-object v16

    .line 619
    sget-object v10, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/C;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/C;

    .line 620
    .line 621
    invoke-static {v9, v10}, Lad/I;->g(Ljava/util/LinkedHashMap;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/C;)Ljava/util/List;

    .line 622
    .line 623
    .line 624
    move-result-object v17

    .line 625
    sget-object v10, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/C;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/C;

    .line 626
    .line 627
    invoke-static {v9, v10}, Lad/I;->g(Ljava/util/LinkedHashMap;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/C;)Ljava/util/List;

    .line 628
    .line 629
    .line 630
    move-result-object v18

    .line 631
    sget-object v10, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/C;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/C;

    .line 632
    .line 633
    invoke-static {v9, v10}, Lad/I;->g(Ljava/util/LinkedHashMap;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/C;)Ljava/util/List;

    .line 634
    .line 635
    .line 636
    move-result-object v19

    .line 637
    sget-object v10, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/C;->e:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/C;

    .line 638
    .line 639
    invoke-static {v9, v10}, Lad/I;->g(Ljava/util/LinkedHashMap;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/C;)Ljava/util/List;

    .line 640
    .line 641
    .line 642
    move-result-object v20

    .line 643
    sget-object v10, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/C;->f:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/C;

    .line 644
    .line 645
    invoke-static {v9, v10}, Lad/I;->g(Ljava/util/LinkedHashMap;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/C;)Ljava/util/List;

    .line 646
    .line 647
    .line 648
    move-result-object v21

    .line 649
    sget-object v10, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/C;->g:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/C;

    .line 650
    .line 651
    invoke-static {v9, v10}, Lad/I;->g(Ljava/util/LinkedHashMap;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/C;)Ljava/util/List;

    .line 652
    .line 653
    .line 654
    move-result-object v22

    .line 655
    sget-object v10, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/C;->h:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/C;

    .line 656
    .line 657
    invoke-static {v9, v10}, Lad/I;->g(Ljava/util/LinkedHashMap;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/C;)Ljava/util/List;

    .line 658
    .line 659
    .line 660
    move-result-object v23

    .line 661
    sget-object v10, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/C;->i:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/C;

    .line 662
    .line 663
    invoke-static {v9, v10}, Lad/I;->g(Ljava/util/LinkedHashMap;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/C;)Ljava/util/List;

    .line 664
    .line 665
    .line 666
    move-result-object v24

    .line 667
    sget-object v10, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/C;->k:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/C;

    .line 668
    .line 669
    invoke-static {v9, v10}, Lad/I;->g(Ljava/util/LinkedHashMap;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/C;)Ljava/util/List;

    .line 670
    .line 671
    .line 672
    move-result-object v25

    .line 673
    sget-object v10, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/C;->j:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/C;

    .line 674
    .line 675
    invoke-static {v9, v10}, Lad/I;->g(Ljava/util/LinkedHashMap;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/C;)Ljava/util/List;

    .line 676
    .line 677
    .line 678
    move-result-object v26

    .line 679
    sget-object v10, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/C;->m:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/C;

    .line 680
    .line 681
    invoke-static {v9, v10}, Lad/I;->g(Ljava/util/LinkedHashMap;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/C;)Ljava/util/List;

    .line 682
    .line 683
    .line 684
    move-result-object v27

    .line 685
    sget-object v10, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/C;->l:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/C;

    .line 686
    .line 687
    invoke-static {v9, v10}, Lad/I;->g(Ljava/util/LinkedHashMap;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/C;)Ljava/util/List;

    .line 688
    .line 689
    .line 690
    move-result-object v28

    .line 691
    sget-object v10, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/C;->n:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/C;

    .line 692
    .line 693
    invoke-virtual {v9, v10}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 694
    .line 695
    .line 696
    move-result-object v9

    .line 697
    check-cast v9, Ljava/util/List;

    .line 698
    .line 699
    if-eqz v9, :cond_15

    .line 700
    .line 701
    new-instance v4, Ljava/util/ArrayList;

    .line 702
    .line 703
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 704
    .line 705
    .line 706
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 707
    .line 708
    .line 709
    move-result-object v9

    .line 710
    :cond_13
    :goto_c
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 711
    .line 712
    .line 713
    move-result v10

    .line 714
    if-eqz v10, :cond_15

    .line 715
    .line 716
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 717
    .line 718
    .line 719
    move-result-object v10

    .line 720
    check-cast v10, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/B;

    .line 721
    .line 722
    iget-object v11, v10, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/B;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/y;

    .line 723
    .line 724
    if-nez v11, :cond_14

    .line 725
    .line 726
    move-object v12, v8

    .line 727
    goto :goto_d

    .line 728
    :cond_14
    new-instance v12, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/j;

    .line 729
    .line 730
    iget-object v10, v10, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/B;->b:Ljava/lang/String;

    .line 731
    .line 732
    invoke-direct {v12, v10, v11}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/j;-><init>(Ljava/lang/String;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/y;)V

    .line 733
    .line 734
    .line 735
    :goto_d
    if-eqz v12, :cond_13

    .line 736
    .line 737
    invoke-virtual {v4, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 738
    .line 739
    .line 740
    goto :goto_c

    .line 741
    :cond_15
    move-object/from16 v29, v4

    .line 742
    .line 743
    invoke-direct/range {v14 .. v29}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/k;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 744
    .line 745
    .line 746
    iget-object v4, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/u;->f:Ljava/util/List;

    .line 747
    .line 748
    invoke-static {v4}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;->b(Ljava/util/List;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/h;

    .line 749
    .line 750
    .line 751
    move-result-object v4

    .line 752
    iget-object v8, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/v;->f:Ljava/lang/Integer;

    .line 753
    .line 754
    iget-object v0, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/v;->a:Ljava/lang/String;

    .line 755
    .line 756
    iget-object v5, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/u;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/y;

    .line 757
    .line 758
    move-object/from16 p5, v0

    .line 759
    .line 760
    move-object/from16 p3, v1

    .line 761
    .line 762
    move-object/from16 p8, v4

    .line 763
    .line 764
    move-object/from16 p2, v5

    .line 765
    .line 766
    move-object/from16 p1, v6

    .line 767
    .line 768
    move-object/from16 p6, v7

    .line 769
    .line 770
    move-object/from16 p4, v8

    .line 771
    .line 772
    move-object/from16 p7, v14

    .line 773
    .line 774
    invoke-direct/range {p1 .. p8}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/i;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/y;Ljava/io/File;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/k;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/h;)V

    .line 775
    .line 776
    .line 777
    move-object/from16 v0, p1

    .line 778
    .line 779
    invoke-direct {v2, v0}, Lcom/moloco/sdk/internal/z;-><init>(Ljava/lang/Object;)V

    .line 780
    .line 781
    .line 782
    return-object v2
.end method

.method public final g(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/D;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/n;DLcom/moloco/sdk/common_adapter_internal/a;ZLjava/lang/String;Llf/c;)Ljava/lang/Object;
    .locals 13

    .line 1
    move-object/from16 v3, p8

    .line 2
    .line 3
    instance-of v4, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/v;

    .line 4
    .line 5
    if-eqz v4, :cond_0

    .line 6
    .line 7
    move-object v4, v3

    .line 8
    check-cast v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/v;

    .line 9
    .line 10
    iget v5, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/v;->e:I

    .line 11
    .line 12
    const/high16 v6, -0x80000000

    .line 13
    .line 14
    and-int v7, v5, v6

    .line 15
    .line 16
    if-eqz v7, :cond_0

    .line 17
    .line 18
    sub-int/2addr v5, v6

    .line 19
    iput v5, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/v;->e:I

    .line 20
    .line 21
    :goto_0
    move-object v10, v4

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    new-instance v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/v;

    .line 24
    .line 25
    invoke-direct {v4, p0, v3}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/v;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;Llf/c;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :goto_1
    iget-object v3, v10, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/v;->c:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v11, Lkf/a;->a:Lkf/a;

    .line 32
    .line 33
    iget v4, v10, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/v;->e:I

    .line 34
    .line 35
    const/4 v12, 0x1

    .line 36
    if-eqz v4, :cond_2

    .line 37
    .line 38
    if-ne v4, v12, :cond_1

    .line 39
    .line 40
    iget-object v0, v10, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/v;->b:Lkotlin/jvm/internal/G;

    .line 41
    .line 42
    iget-object v1, v10, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/v;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;

    .line 43
    .line 44
    invoke-static {v3}, LFe/e;->U(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto/16 :goto_6

    .line 48
    .line 49
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw v0

    .line 57
    :cond_2
    invoke-static {v3}, LFe/e;->U(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    sget-object v3, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 61
    .line 62
    new-instance v4, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    const-string v5, "Loading vast ad with wrapperChainParams: "

    .line 65
    .line 66
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    const/4 v6, 0x0

    .line 77
    const/4 v7, 0x0

    .line 78
    const-string v4, "VastAdLoaderImpl"

    .line 79
    .line 80
    const/16 v8, 0xc

    .line 81
    .line 82
    const/4 v9, 0x0

    .line 83
    invoke-static/range {v3 .. v9}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    const/4 v3, 0x0

    .line 87
    if-eqz p2, :cond_3

    .line 88
    .line 89
    iget-object v4, p2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/n;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/l;

    .line 90
    .line 91
    iget-object v4, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/l;->b:Ljava/util/List;

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_3
    move-object v4, v3

    .line 95
    :goto_2
    iget-object v5, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/D;->b:Ljava/lang/String;

    .line 96
    .line 97
    if-eqz v5, :cond_5

    .line 98
    .line 99
    invoke-static {v5}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    new-instance v6, Ljava/util/ArrayList;

    .line 104
    .line 105
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 106
    .line 107
    .line 108
    if-eqz v4, :cond_4

    .line 109
    .line 110
    invoke-static {v4, v6}, Lff/t;->e0(Ljava/lang/Iterable;Ljava/util/Collection;)V

    .line 111
    .line 112
    .line 113
    :cond_4
    invoke-static {v5, v6}, Lff/t;->e0(Ljava/lang/Iterable;Ljava/util/Collection;)V

    .line 114
    .line 115
    .line 116
    move-object v4, v6

    .line 117
    goto :goto_3

    .line 118
    :cond_5
    if-nez v4, :cond_6

    .line 119
    .line 120
    sget-object v4, Lff/v;->a:Lff/v;

    .line 121
    .line 122
    :cond_6
    :goto_3
    iget-object v0, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/D;->a:Ljava/util/List;

    .line 123
    .line 124
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 125
    .line 126
    .line 127
    move-result v5

    .line 128
    if-eqz v5, :cond_8

    .line 129
    .line 130
    if-eqz p2, :cond_7

    .line 131
    .line 132
    sget-object v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/E;->f:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/E;

    .line 133
    .line 134
    :cond_7
    const/16 v0, 0xc

    .line 135
    .line 136
    iget-object v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/L0;

    .line 137
    .line 138
    invoke-static {v1, v4, v3, v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/G;->g(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/L0;Ljava/util/List;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/E;I)V

    .line 139
    .line 140
    .line 141
    new-instance v0, Lcom/moloco/sdk/internal/y;

    .line 142
    .line 143
    sget-object v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/k;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/k;

    .line 144
    .line 145
    invoke-direct {v0, v1}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    return-object v0

    .line 149
    :cond_8
    if-eqz p2, :cond_9

    .line 150
    .line 151
    iget-object v3, p2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/n;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/l;

    .line 152
    .line 153
    iget-object v5, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/l;->a:Ljava/util/List;

    .line 154
    .line 155
    iget-object v3, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/l;->c:Ljava/util/List;

    .line 156
    .line 157
    new-instance v6, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/l;

    .line 158
    .line 159
    invoke-direct {v6, v5, v4, v3}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/l;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 160
    .line 161
    .line 162
    iget-object v3, p2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/n;->b:Ljava/util/Set;

    .line 163
    .line 164
    new-instance v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/n;

    .line 165
    .line 166
    iget v5, p2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/n;->a:I

    .line 167
    .line 168
    iget-boolean v1, p2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/n;->c:Z

    .line 169
    .line 170
    invoke-direct {v4, v5, v3, v1, v6}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/n;-><init>(ILjava/util/Set;ZLcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/l;)V

    .line 171
    .line 172
    .line 173
    move-object v3, v4

    .line 174
    :cond_9
    new-instance v9, Lkotlin/jvm/internal/G;

    .line 175
    .line 176
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 177
    .line 178
    .line 179
    sget-object v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/k;->F:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/k;

    .line 180
    .line 181
    iput-object v1, v9, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 182
    .line 183
    new-instance v1, Ljava/util/ArrayList;

    .line 184
    .line 185
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 186
    .line 187
    .line 188
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    :cond_a
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 193
    .line 194
    .line 195
    move-result v4

    .line 196
    if-eqz v4, :cond_c

    .line 197
    .line 198
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    move-object v5, v4

    .line 203
    check-cast v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/c;

    .line 204
    .line 205
    iget-object v6, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/c;->a:Ljava/lang/Integer;

    .line 206
    .line 207
    if-eqz v6, :cond_b

    .line 208
    .line 209
    new-instance v6, Lzf/g;

    .line 210
    .line 211
    const/4 v7, 0x0

    .line 212
    invoke-direct {v6, v7, v12, v12}, Lzf/e;-><init>(III)V

    .line 213
    .line 214
    .line 215
    iget-object v5, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/c;->a:Ljava/lang/Integer;

    .line 216
    .line 217
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 218
    .line 219
    .line 220
    move-result v5

    .line 221
    invoke-virtual {v6, v5}, Lzf/g;->a(I)Z

    .line 222
    .line 223
    .line 224
    move-result v5

    .line 225
    if-eqz v5, :cond_a

    .line 226
    .line 227
    :cond_b
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    goto :goto_4

    .line 231
    :cond_c
    new-instance v0, LA7/R0;

    .line 232
    .line 233
    const/16 v4, 0xb

    .line 234
    .line 235
    invoke-direct {v0, v4}, LA7/R0;-><init>(I)V

    .line 236
    .line 237
    .line 238
    invoke-static {v0, v1}, Lff/o;->M0(Ljava/util/Comparator;Ljava/lang/Iterable;)Ljava/util/List;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    new-instance v1, LHf/o;

    .line 243
    .line 244
    check-cast v0, Ljava/util/List;

    .line 245
    .line 246
    invoke-direct {v1, v0}, LHf/o;-><init>(Ljava/util/List;)V

    .line 247
    .line 248
    .line 249
    instance-of v0, v1, LHf/d;

    .line 250
    .line 251
    if-eqz v0, :cond_d

    .line 252
    .line 253
    goto :goto_5

    .line 254
    :cond_d
    new-instance v0, LHf/g;

    .line 255
    .line 256
    invoke-direct {v0, v1}, LHf/g;-><init>(LHf/o;)V

    .line 257
    .line 258
    .line 259
    move-object v1, v0

    .line 260
    :goto_5
    check-cast v1, LHf/d;

    .line 261
    .line 262
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/u;

    .line 263
    .line 264
    move-object v2, p0

    .line 265
    move-wide/from16 v4, p3

    .line 266
    .line 267
    move-object/from16 v6, p5

    .line 268
    .line 269
    move/from16 v7, p6

    .line 270
    .line 271
    move-object/from16 v8, p7

    .line 272
    .line 273
    invoke-direct/range {v0 .. v9}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/u;-><init>(LHf/d;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/n;DLcom/moloco/sdk/common_adapter_internal/a;ZLjava/lang/String;Lkotlin/jvm/internal/G;)V

    .line 274
    .line 275
    .line 276
    iput-object p0, v10, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/v;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;

    .line 277
    .line 278
    iput-object v9, v10, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/v;->b:Lkotlin/jvm/internal/G;

    .line 279
    .line 280
    iput v12, v10, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/v;->e:I

    .line 281
    .line 282
    invoke-static {v0, v10}, LHf/k0;->q(LHf/l;Llf/c;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v3

    .line 286
    if-ne v3, v11, :cond_e

    .line 287
    .line 288
    return-object v11

    .line 289
    :cond_e
    move-object v1, p0

    .line 290
    move-object v0, v9

    .line 291
    :goto_6
    check-cast v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/a;

    .line 292
    .line 293
    if-nez v3, :cond_f

    .line 294
    .line 295
    new-instance v3, Lcom/moloco/sdk/internal/y;

    .line 296
    .line 297
    iget-object v4, v0, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 298
    .line 299
    invoke-direct {v3, v4}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V

    .line 300
    .line 301
    .line 302
    sget-object v4, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 303
    .line 304
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 305
    .line 306
    .line 307
    new-instance v1, Ljava/lang/StringBuilder;

    .line 308
    .line 309
    const-string v5, "Failed to load linear: "

    .line 310
    .line 311
    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    iget-object v0, v0, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 315
    .line 316
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    const/4 v1, 0x0

    .line 324
    const/4 v5, 0x0

    .line 325
    const-string v6, "VastAdLoaderImpl"

    .line 326
    .line 327
    const/16 v7, 0xc

    .line 328
    .line 329
    const/4 v8, 0x0

    .line 330
    move-object/from16 p3, v0

    .line 331
    .line 332
    move-object/from16 p4, v1

    .line 333
    .line 334
    move-object p1, v4

    .line 335
    move/from16 p5, v5

    .line 336
    .line 337
    move-object p2, v6

    .line 338
    move/from16 p6, v7

    .line 339
    .line 340
    move-object/from16 p7, v8

    .line 341
    .line 342
    invoke-static/range {p1 .. p7}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 343
    .line 344
    .line 345
    return-object v3

    .line 346
    :cond_f
    new-instance v0, Lcom/moloco/sdk/internal/z;

    .line 347
    .line 348
    invoke-direct {v0, v3}, Lcom/moloco/sdk/internal/z;-><init>(Ljava/lang/Object;)V

    .line 349
    .line 350
    .line 351
    return-object v0
.end method

.method public final h(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/a;JLlf/c;)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v0, p4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/B;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/B;

    .line 7
    .line 8
    iget v1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/B;->e:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/B;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/B;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/B;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;Llf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/B;->c:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/B;->e:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/B;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/a;

    .line 37
    .line 38
    iget-object p2, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/B;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;

    .line 39
    .line 40
    invoke-static {p4}, LFe/e;->U(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p1

    .line 52
    :cond_2
    invoke-static {p4}, LFe/e;->U(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    sget-object v4, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 56
    .line 57
    new-instance p4, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    const-string v2, "Waiting for "

    .line 60
    .line 61
    invoke-direct {p4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-static {p2, p3}, LCf/a;->j(J)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {p4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string v2, " to load the vast media file: "

    .line 72
    .line 73
    invoke-virtual {p4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    iget-object v2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/o;

    .line 77
    .line 78
    invoke-virtual {p4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    const/4 v7, 0x0

    .line 86
    const/4 v8, 0x0

    .line 87
    const-string v5, "VastAdLoaderImpl"

    .line 88
    .line 89
    const/16 v9, 0xc

    .line 90
    .line 91
    const/4 v10, 0x0

    .line 92
    invoke-static/range {v4 .. v10}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    new-instance p4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/D;

    .line 96
    .line 97
    const/4 v2, 0x0

    .line 98
    invoke-direct {p4, p0, p1, v2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/D;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/a;Ljf/c;)V

    .line 99
    .line 100
    .line 101
    iput-object p0, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/B;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;

    .line 102
    .line 103
    iput-object p1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/B;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/a;

    .line 104
    .line 105
    iput v3, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/B;->e:I

    .line 106
    .line 107
    invoke-static {p2, p3, p4, v0}, LEf/H;->S(JLtf/p;Llf/c;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p4

    .line 111
    if-ne p4, v1, :cond_3

    .line 112
    .line 113
    return-object v1

    .line 114
    :cond_3
    move-object p2, p0

    .line 115
    :goto_1
    check-cast p4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/h;

    .line 116
    .line 117
    sget-object v0, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 118
    .line 119
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    const/4 v3, 0x0

    .line 123
    const/4 v4, 0x0

    .line 124
    const-string v1, "VastAdLoaderImpl"

    .line 125
    .line 126
    const-string v2, "Either timeout occurred or media file streaming had terminal status"

    .line 127
    .line 128
    const/16 v5, 0xc

    .line 129
    .line 130
    const/4 v6, 0x0

    .line 131
    invoke-static/range {v0 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    new-instance p3, Ljava/lang/StringBuilder;

    .line 135
    .line 136
    const-string v1, "Stream status: "

    .line 137
    .line 138
    invoke-direct {p3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    const-string v1, " on timeout"

    .line 145
    .line 146
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    const-string v1, "VastAdLoaderImpl"

    .line 154
    .line 155
    invoke-static/range {v0 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    if-nez p4, :cond_7

    .line 159
    .line 160
    iget-object p3, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/a;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/i;

    .line 161
    .line 162
    iget-object p3, p3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/i;->b:Ljava/io/File;

    .line 163
    .line 164
    invoke-virtual {p3}, Ljava/io/File;->exists()Z

    .line 165
    .line 166
    .line 167
    move-result p4

    .line 168
    if-eqz p4, :cond_6

    .line 169
    .line 170
    invoke-virtual {p3}, Ljava/io/File;->length()J

    .line 171
    .line 172
    .line 173
    move-result-wide v1

    .line 174
    const-wide/16 v3, 0x0

    .line 175
    .line 176
    cmp-long p4, v1, v3

    .line 177
    .line 178
    if-nez p4, :cond_4

    .line 179
    .line 180
    goto/16 :goto_2

    .line 181
    .line 182
    :cond_4
    const/4 v3, 0x0

    .line 183
    const/4 v4, 0x0

    .line 184
    const-string v1, "VastAdLoaderImpl"

    .line 185
    .line 186
    const-string v2, "Local vast media resource exists and has some content. Checking for bitrate information"

    .line 187
    .line 188
    const/16 v5, 0xc

    .line 189
    .line 190
    const/4 v6, 0x0

    .line 191
    invoke-static/range {v0 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    iget-object p4, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/a;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/i;

    .line 195
    .line 196
    iget-object p4, p4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/i;->c:Ljava/lang/Integer;

    .line 197
    .line 198
    if-eqz p4, :cond_5

    .line 199
    .line 200
    new-instance v1, Ljava/lang/StringBuilder;

    .line 201
    .line 202
    const-string v2, "Checking for playability of VAST ad with bitrate: "

    .line 203
    .line 204
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v2

    .line 214
    const/4 v3, 0x0

    .line 215
    const/4 v4, 0x0

    .line 216
    const-string v1, "VastAdLoaderImpl"

    .line 217
    .line 218
    const/16 v5, 0xc

    .line 219
    .line 220
    const/4 v6, 0x0

    .line 221
    invoke-static/range {v0 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {p3}, Ljava/io/File;->length()J

    .line 225
    .line 226
    .line 227
    move-result-wide v1

    .line 228
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 229
    .line 230
    .line 231
    move-result p3

    .line 232
    const/16 p4, 0x8

    .line 233
    .line 234
    int-to-long v3, p4

    .line 235
    mul-long/2addr v1, v3

    .line 236
    mul-int/lit16 p3, p3, 0x3e8

    .line 237
    .line 238
    long-to-double v1, v1

    .line 239
    int-to-double p3, p3

    .line 240
    div-double p3, v1, p3

    .line 241
    .line 242
    new-instance v1, Ljava/lang/StringBuilder;

    .line 243
    .line 244
    const-string v2, "VAST ad has playable duration: "

    .line 245
    .line 246
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v1, p3, p4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    const-string v2, " seconds"

    .line 253
    .line 254
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    const/4 v3, 0x0

    .line 262
    const/4 v4, 0x0

    .line 263
    const-string v1, "VastAdLoaderImpl"

    .line 264
    .line 265
    const/16 v5, 0xc

    .line 266
    .line 267
    const/4 v6, 0x0

    .line 268
    invoke-static/range {v0 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 269
    .line 270
    .line 271
    iget-object p2, p2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/p;

    .line 272
    .line 273
    iget-wide v1, p2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/p;->c:D

    .line 274
    .line 275
    cmpg-double p2, p3, v1

    .line 276
    .line 277
    if-gez p2, :cond_9

    .line 278
    .line 279
    const/4 v3, 0x0

    .line 280
    const/4 v4, 0x0

    .line 281
    const-string v1, "VastAdLoaderImpl"

    .line 282
    .line 283
    const-string v2, "VAST does not have enough playable duration, so failing "

    .line 284
    .line 285
    const/16 v5, 0xc

    .line 286
    .line 287
    const/4 v6, 0x0

    .line 288
    invoke-static/range {v0 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 289
    .line 290
    .line 291
    new-instance p1, Lcom/moloco/sdk/internal/y;

    .line 292
    .line 293
    sget-object p2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/k;->y:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/k;

    .line 294
    .line 295
    invoke-direct {p1, p2}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    return-object p1

    .line 299
    :cond_5
    const/4 v3, 0x0

    .line 300
    const/4 v4, 0x0

    .line 301
    const-string v1, "VastAdLoaderImpl"

    .line 302
    .line 303
    const-string v2, "VAST ad playable duration cannot be determined due to no bitrate information"

    .line 304
    .line 305
    const/16 v5, 0xc

    .line 306
    .line 307
    const/4 v6, 0x0

    .line 308
    invoke-static/range {v0 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 309
    .line 310
    .line 311
    new-instance p1, Lcom/moloco/sdk/internal/y;

    .line 312
    .line 313
    sget-object p2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/k;->z:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/k;

    .line 314
    .line 315
    invoke-direct {p1, p2}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V

    .line 316
    .line 317
    .line 318
    return-object p1

    .line 319
    :cond_6
    :goto_2
    new-instance p1, Ljava/lang/StringBuilder;

    .line 320
    .line 321
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 322
    .line 323
    .line 324
    invoke-virtual {p3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object p2

    .line 328
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 329
    .line 330
    .line 331
    const-string p2, " does not exist or is empty"

    .line 332
    .line 333
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 334
    .line 335
    .line 336
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v2

    .line 340
    const/4 v3, 0x0

    .line 341
    const/4 v4, 0x0

    .line 342
    const-string v1, "VastAdLoaderImpl"

    .line 343
    .line 344
    const/16 v5, 0xc

    .line 345
    .line 346
    const/4 v6, 0x0

    .line 347
    invoke-static/range {v0 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 348
    .line 349
    .line 350
    const-string v1, "VastAdLoaderImpl"

    .line 351
    .line 352
    const-string v2, "Failed to start streaming media file, reporting timeout error"

    .line 353
    .line 354
    invoke-static/range {v0 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 355
    .line 356
    .line 357
    new-instance p1, Lcom/moloco/sdk/internal/y;

    .line 358
    .line 359
    sget-object p2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/k;->x:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/k;

    .line 360
    .line 361
    invoke-direct {p1, p2}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V

    .line 362
    .line 363
    .line 364
    return-object p1

    .line 365
    :cond_7
    instance-of p2, p4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/d;

    .line 366
    .line 367
    if-eqz p2, :cond_8

    .line 368
    .line 369
    const/4 v3, 0x0

    .line 370
    const/4 v4, 0x0

    .line 371
    const-string v1, "VastAdLoaderImpl"

    .line 372
    .line 373
    const-string v2, "Streamed entire file successfully"

    .line 374
    .line 375
    const/16 v5, 0xc

    .line 376
    .line 377
    const/4 v6, 0x0

    .line 378
    invoke-static/range {v0 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 379
    .line 380
    .line 381
    new-instance p2, Lcom/moloco/sdk/internal/z;

    .line 382
    .line 383
    invoke-direct {p2, p1}, Lcom/moloco/sdk/internal/z;-><init>(Ljava/lang/Object;)V

    .line 384
    .line 385
    .line 386
    return-object p2

    .line 387
    :cond_8
    instance-of p2, p4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/e;

    .line 388
    .line 389
    if-eqz p2, :cond_9

    .line 390
    .line 391
    const/4 v3, 0x0

    .line 392
    const/4 v4, 0x0

    .line 393
    const-string v1, "VastAdLoaderImpl"

    .line 394
    .line 395
    const-string v2, "Failed to stream file"

    .line 396
    .line 397
    const/16 v5, 0xc

    .line 398
    .line 399
    const/4 v6, 0x0

    .line 400
    invoke-static/range {v0 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 401
    .line 402
    .line 403
    new-instance p1, Lcom/moloco/sdk/internal/y;

    .line 404
    .line 405
    check-cast p4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/e;

    .line 406
    .line 407
    iget-object p2, p4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/e;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/g;

    .line 408
    .line 409
    invoke-static {p2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/G;->a(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/g;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/k;

    .line 410
    .line 411
    .line 412
    move-result-object p2

    .line 413
    invoke-direct {p1, p2}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V

    .line 414
    .line 415
    .line 416
    return-object p1

    .line 417
    :cond_9
    const/4 v3, 0x0

    .line 418
    const/4 v4, 0x0

    .line 419
    const-string v1, "VastAdLoaderImpl"

    .line 420
    .line 421
    const-string v2, "Media file partially exists and ready for streaming"

    .line 422
    .line 423
    const/16 v5, 0xc

    .line 424
    .line 425
    const/4 v6, 0x0

    .line 426
    invoke-static/range {v0 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 427
    .line 428
    .line 429
    new-instance p2, Lcom/moloco/sdk/internal/z;

    .line 430
    .line 431
    invoke-direct {p2, p1}, Lcom/moloco/sdk/internal/z;-><init>(Ljava/lang/Object;)V

    .line 432
    .line 433
    .line 434
    return-object p2
.end method

.method public final i(Ljava/lang/String;Ljava/lang/String;ZLlf/c;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p4

    .line 4
    .line 5
    instance-of v2, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/o;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/o;

    .line 11
    .line 12
    iget v3, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/o;->f:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/o;->f:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/o;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/o;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;Llf/c;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/o;->d:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, Lkf/a;->a:Lkf/a;

    .line 32
    .line 33
    iget v4, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/o;->f:I

    .line 34
    .line 35
    const/4 v5, 0x2

    .line 36
    const/4 v6, 0x1

    .line 37
    if-eqz v4, :cond_3

    .line 38
    .line 39
    if-eq v4, v6, :cond_2

    .line 40
    .line 41
    if-ne v4, v5, :cond_1

    .line 42
    .line 43
    invoke-static {v1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto/16 :goto_4

    .line 47
    .line 48
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw v1

    .line 56
    :cond_2
    iget-boolean v4, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/o;->c:Z

    .line 57
    .line 58
    iget-object v6, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/o;->b:Ljava/lang/String;

    .line 59
    .line 60
    iget-object v7, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/o;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;

    .line 61
    .line 62
    invoke-static {v1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    move-object v11, v6

    .line 66
    move-object v8, v7

    .line 67
    :goto_1
    move v10, v4

    .line 68
    goto :goto_2

    .line 69
    :cond_3
    invoke-static {v1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    iput-object v0, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/o;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;

    .line 73
    .line 74
    move-object/from16 v1, p2

    .line 75
    .line 76
    iput-object v1, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/o;->b:Ljava/lang/String;

    .line 77
    .line 78
    move/from16 v4, p3

    .line 79
    .line 80
    iput-boolean v4, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/o;->c:Z

    .line 81
    .line 82
    iput v6, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/o;->f:I

    .line 83
    .line 84
    iget-object v6, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I;

    .line 85
    .line 86
    move-object/from16 v7, p1

    .line 87
    .line 88
    invoke-virtual {v6, v7, v2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I;->a(Ljava/lang/String;Llf/c;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    if-ne v6, v3, :cond_4

    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_4
    move-object v8, v0

    .line 96
    move-object v11, v1

    .line 97
    move-object v1, v6

    .line 98
    goto :goto_1

    .line 99
    :goto_2
    check-cast v1, Lcom/moloco/sdk/internal/A;

    .line 100
    .line 101
    instance-of v4, v1, Lcom/moloco/sdk/internal/y;

    .line 102
    .line 103
    if-eqz v4, :cond_5

    .line 104
    .line 105
    sget-object v12, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 106
    .line 107
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    new-instance v2, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    const-string v3, "Failed to parse vast XML: "

    .line 113
    .line 114
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    check-cast v1, Lcom/moloco/sdk/internal/y;

    .line 118
    .line 119
    iget-object v3, v1, Lcom/moloco/sdk/internal/y;->a:Ljava/lang/Object;

    .line 120
    .line 121
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v14

    .line 128
    const/4 v15, 0x0

    .line 129
    const/16 v16, 0x0

    .line 130
    .line 131
    const-string v13, "VastAdLoaderImpl"

    .line 132
    .line 133
    const/16 v17, 0xc

    .line 134
    .line 135
    const/16 v18, 0x0

    .line 136
    .line 137
    invoke-static/range {v12 .. v18}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    new-instance v2, Lcom/moloco/sdk/internal/y;

    .line 141
    .line 142
    iget-object v1, v1, Lcom/moloco/sdk/internal/y;->a:Ljava/lang/Object;

    .line 143
    .line 144
    invoke-direct {v2, v1}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    return-object v2

    .line 148
    :cond_5
    instance-of v4, v1, Lcom/moloco/sdk/internal/z;

    .line 149
    .line 150
    if-eqz v4, :cond_9

    .line 151
    .line 152
    check-cast v1, Lcom/moloco/sdk/internal/z;

    .line 153
    .line 154
    iget-object v1, v1, Lcom/moloco/sdk/internal/z;->a:Ljava/lang/Object;

    .line 155
    .line 156
    move-object v9, v1

    .line 157
    check-cast v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/D;

    .line 158
    .line 159
    sget-object v1, LEf/S;->a:LLf/e;

    .line 160
    .line 161
    new-instance v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/p;

    .line 162
    .line 163
    const/4 v12, 0x0

    .line 164
    invoke-direct/range {v7 .. v12}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/p;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/D;ZLjava/lang/String;Ljf/c;)V

    .line 165
    .line 166
    .line 167
    const/4 v4, 0x0

    .line 168
    iput-object v4, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/o;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;

    .line 169
    .line 170
    iput-object v4, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/o;->b:Ljava/lang/String;

    .line 171
    .line 172
    iput v5, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/o;->f:I

    .line 173
    .line 174
    invoke-static {v1, v7, v2}, LEf/H;->P(Ljf/h;Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    if-ne v1, v3, :cond_6

    .line 179
    .line 180
    :goto_3
    return-object v3

    .line 181
    :cond_6
    :goto_4
    check-cast v1, Lcom/moloco/sdk/internal/A;

    .line 182
    .line 183
    instance-of v2, v1, Lcom/moloco/sdk/internal/y;

    .line 184
    .line 185
    if-eqz v2, :cond_7

    .line 186
    .line 187
    new-instance v2, Lcom/moloco/sdk/internal/y;

    .line 188
    .line 189
    check-cast v1, Lcom/moloco/sdk/internal/y;

    .line 190
    .line 191
    iget-object v1, v1, Lcom/moloco/sdk/internal/y;->a:Ljava/lang/Object;

    .line 192
    .line 193
    invoke-direct {v2, v1}, Lcom/moloco/sdk/internal/y;-><init>(Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    return-object v2

    .line 197
    :cond_7
    instance-of v2, v1, Lcom/moloco/sdk/internal/z;

    .line 198
    .line 199
    if-eqz v2, :cond_8

    .line 200
    .line 201
    new-instance v2, Lcom/moloco/sdk/internal/z;

    .line 202
    .line 203
    check-cast v1, Lcom/moloco/sdk/internal/z;

    .line 204
    .line 205
    iget-object v1, v1, Lcom/moloco/sdk/internal/z;->a:Ljava/lang/Object;

    .line 206
    .line 207
    invoke-direct {v2, v1}, Lcom/moloco/sdk/internal/z;-><init>(Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    return-object v2

    .line 211
    :cond_8
    new-instance v1, LE5/Q;

    .line 212
    .line 213
    const/16 v2, 0x9

    .line 214
    .line 215
    const/4 v3, 0x0

    .line 216
    invoke-direct {v1, v3, v2}, LE5/Q;-><init>(BI)V

    .line 217
    .line 218
    .line 219
    throw v1

    .line 220
    :cond_9
    new-instance v1, LE5/Q;

    .line 221
    .line 222
    const/16 v2, 0x9

    .line 223
    .line 224
    const/4 v3, 0x0

    .line 225
    invoke-direct {v1, v3, v2}, LE5/Q;-><init>(BI)V

    .line 226
    .line 227
    .line 228
    throw v1
.end method

.method public final j(Ljava/util/List;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/E;)V
    .locals 2

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    iget-object v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/L0;

    .line 4
    .line 5
    invoke-static {v1, p1, p2, v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/G;->g(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/L0;Ljava/util/List;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/E;I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
