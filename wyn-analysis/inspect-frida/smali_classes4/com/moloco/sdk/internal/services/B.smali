.class public final Lcom/moloco/sdk/internal/services/B;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;

.field public final b:Lcom/moloco/sdk/internal/services/events/c;


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;Lcom/moloco/sdk/internal/services/events/c;)V
    .locals 1

    .line 1
    const-string v0, "externalLinkHandler"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "customUserEventBuilderService"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/moloco/sdk/internal/services/B;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/moloco/sdk/internal/services/B;->b:Lcom/moloco/sdk/internal/services/events/c;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/staticrenderer/model/a;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/s;LHf/j0;Llf/c;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p5

    .line 6
    .line 7
    instance-of v3, v2, Lcom/moloco/sdk/internal/services/A;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, Lcom/moloco/sdk/internal/services/A;

    .line 13
    .line 14
    iget v4, v3, Lcom/moloco/sdk/internal/services/A;->e:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, Lcom/moloco/sdk/internal/services/A;->e:I

    .line 24
    .line 25
    :goto_0
    move-object v9, v3

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    new-instance v3, Lcom/moloco/sdk/internal/services/A;

    .line 28
    .line 29
    invoke-direct {v3, v0, v2}, Lcom/moloco/sdk/internal/services/A;-><init>(Lcom/moloco/sdk/internal/services/B;Llf/c;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :goto_1
    iget-object v2, v9, Lcom/moloco/sdk/internal/services/A;->c:Ljava/lang/Object;

    .line 34
    .line 35
    sget-object v3, Lkf/a;->a:Lkf/a;

    .line 36
    .line 37
    iget v4, v9, Lcom/moloco/sdk/internal/services/A;->e:I

    .line 38
    .line 39
    sget-object v10, Lef/C;->a:Lef/C;

    .line 40
    .line 41
    const/4 v11, 0x2

    .line 42
    const/4 v5, 0x1

    .line 43
    if-eqz v4, :cond_3

    .line 44
    .line 45
    if-eq v4, v5, :cond_2

    .line 46
    .line 47
    if-ne v4, v11, :cond_1

    .line 48
    .line 49
    invoke-static {v2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    return-object v10

    .line 53
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw v1

    .line 61
    :cond_2
    iget-object v1, v9, Lcom/moloco/sdk/internal/services/A;->b:LHf/b0;

    .line 62
    .line 63
    iget-object v4, v9, Lcom/moloco/sdk/internal/services/A;->a:Lcom/moloco/sdk/internal/services/B;

    .line 64
    .line 65
    invoke-static {v2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_3
    invoke-static {v2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 73
    .line 74
    .line 75
    move-result-wide v6

    .line 76
    new-instance v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/g;

    .line 77
    .line 78
    iget v4, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/staticrenderer/model/a;->e:I

    .line 79
    .line 80
    invoke-static {v4}, LFe/e;->c(I)F

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    iget v8, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/staticrenderer/model/a;->f:I

    .line 85
    .line 86
    invoke-static {v8}, LFe/e;->c(I)F

    .line 87
    .line 88
    .line 89
    move-result v8

    .line 90
    invoke-direct {v2, v4, v8}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/g;-><init>(FF)V

    .line 91
    .line 92
    .line 93
    move-wide v12, v6

    .line 94
    new-instance v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/e;

    .line 95
    .line 96
    new-instance v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/g;

    .line 97
    .line 98
    iget v6, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/staticrenderer/model/a;->a:I

    .line 99
    .line 100
    invoke-static {v6}, LFe/e;->c(I)F

    .line 101
    .line 102
    .line 103
    move-result v6

    .line 104
    iget v8, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/staticrenderer/model/a;->b:I

    .line 105
    .line 106
    invoke-static {v8}, LFe/e;->c(I)F

    .line 107
    .line 108
    .line 109
    move-result v8

    .line 110
    invoke-direct {v4, v6, v8}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/g;-><init>(FF)V

    .line 111
    .line 112
    .line 113
    new-instance v6, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/h;

    .line 114
    .line 115
    iget v8, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/staticrenderer/model/a;->d:I

    .line 116
    .line 117
    invoke-static {v8}, LFe/e;->c(I)F

    .line 118
    .line 119
    .line 120
    move-result v8

    .line 121
    iget v1, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/staticrenderer/model/a;->c:I

    .line 122
    .line 123
    invoke-static {v1}, LFe/e;->c(I)F

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    invoke-direct {v6, v8, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/h;-><init>(FF)V

    .line 128
    .line 129
    .line 130
    invoke-virtual/range {p3 .. p3}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/s;->b()Ljava/util/ArrayList;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-direct {v7, v2, v4, v6, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/e;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/g;Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/g;Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/h;Ljava/util/List;)V

    .line 135
    .line 136
    .line 137
    iput-object v0, v9, Lcom/moloco/sdk/internal/services/A;->a:Lcom/moloco/sdk/internal/services/B;

    .line 138
    .line 139
    move-object/from16 v1, p4

    .line 140
    .line 141
    iput-object v1, v9, Lcom/moloco/sdk/internal/services/A;->b:LHf/b0;

    .line 142
    .line 143
    iput v5, v9, Lcom/moloco/sdk/internal/services/A;->e:I

    .line 144
    .line 145
    iget-object v4, v0, Lcom/moloco/sdk/internal/services/B;->b:Lcom/moloco/sdk/internal/services/events/c;

    .line 146
    .line 147
    move-object/from16 v8, p1

    .line 148
    .line 149
    move-wide v5, v12

    .line 150
    invoke-virtual/range {v4 .. v9}, Lcom/moloco/sdk/internal/services/events/c;->a(JLBa/c;Ljava/lang/String;Llf/c;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    if-ne v2, v3, :cond_4

    .line 155
    .line 156
    goto :goto_3

    .line 157
    :cond_4
    move-object v4, v0

    .line 158
    :goto_2
    check-cast v2, Ljava/lang/String;

    .line 159
    .line 160
    sget-object v12, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 161
    .line 162
    const-string v5, "Launching url: "

    .line 163
    .line 164
    invoke-static {v5, v2}, LR8/v;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v14

    .line 168
    const-string v13, "ClickthroughService"

    .line 169
    .line 170
    const/4 v15, 0x0

    .line 171
    const/16 v16, 0x4

    .line 172
    .line 173
    const/16 v17, 0x0

    .line 174
    .line 175
    invoke-static/range {v12 .. v17}, Lcom/moloco/sdk/internal/MolocoLogger;->debug$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    iget-object v4, v4, Lcom/moloco/sdk/internal/services/B;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;

    .line 179
    .line 180
    if-nez v2, :cond_5

    .line 181
    .line 182
    const-string v2, ""

    .line 183
    .line 184
    :cond_5
    invoke-virtual {v4, v2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;->a(Ljava/lang/String;)Z

    .line 185
    .line 186
    .line 187
    move-result v2

    .line 188
    if-eqz v2, :cond_6

    .line 189
    .line 190
    if-eqz v1, :cond_6

    .line 191
    .line 192
    const/4 v2, 0x0

    .line 193
    iput-object v2, v9, Lcom/moloco/sdk/internal/services/A;->a:Lcom/moloco/sdk/internal/services/B;

    .line 194
    .line 195
    iput-object v2, v9, Lcom/moloco/sdk/internal/services/A;->b:LHf/b0;

    .line 196
    .line 197
    iput v11, v9, Lcom/moloco/sdk/internal/services/A;->e:I

    .line 198
    .line 199
    invoke-interface {v1, v10, v9}, LHf/b0;->emit(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    if-ne v1, v3, :cond_6

    .line 204
    .line 205
    :goto_3
    return-object v3

    .line 206
    :cond_6
    return-object v10
.end method
