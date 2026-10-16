.class public final synthetic Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/rewardedcountdowntimer/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:F

.field public final synthetic c:LA/e;

.field public final synthetic d:J

.field public final synthetic e:LN/V;


# direct methods
.method public synthetic constructor <init>(JFLA/e;JLN/V;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/rewardedcountdowntimer/e;->a:J

    iput p3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/rewardedcountdowntimer/e;->b:F

    iput-object p4, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/rewardedcountdowntimer/e;->c:LA/e;

    iput-wide p5, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/rewardedcountdowntimer/e;->d:J

    iput-object p7, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/rewardedcountdowntimer/e;->e:LN/V;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Lg0/d;

    .line 6
    .line 7
    const-string v2, "$this$Canvas"

    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v9, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/rewardedcountdowntimer/e;->e:LN/V;

    .line 13
    .line 14
    invoke-interface {v9}, LN/K0;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, LL0/h;

    .line 19
    .line 20
    iget-wide v2, v2, LL0/h;->a:J

    .line 21
    .line 22
    const/16 v10, 0x20

    .line 23
    .line 24
    shr-long/2addr v2, v10

    .line 25
    long-to-int v2, v2

    .line 26
    int-to-float v2, v2

    .line 27
    invoke-interface {v9}, LN/K0;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, LL0/h;

    .line 32
    .line 33
    iget-wide v3, v3, LL0/h;->a:J

    .line 34
    .line 35
    const-wide v11, 0xffffffffL

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    and-long/2addr v3, v11

    .line 41
    long-to-int v3, v3

    .line 42
    int-to-float v3, v3

    .line 43
    invoke-static {v2, v3}, Lcom/moloco/sdk/internal/publisher/H;->I(FF)J

    .line 44
    .line 45
    .line 46
    move-result-wide v6

    .line 47
    new-instance v8, Lg0/g;

    .line 48
    .line 49
    iget v2, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/rewardedcountdowntimer/e;->b:F

    .line 50
    .line 51
    invoke-interface {v1, v2}, LL0/b;->t(F)F

    .line 52
    .line 53
    .line 54
    move-result v14

    .line 55
    const/16 v16, 0x1

    .line 56
    .line 57
    const/16 v18, 0x1a

    .line 58
    .line 59
    const/4 v15, 0x0

    .line 60
    const/16 v17, 0x0

    .line 61
    .line 62
    move-object v13, v8

    .line 63
    invoke-direct/range {v13 .. v18}, Lg0/g;-><init>(FFIII)V

    .line 64
    .line 65
    .line 66
    const/high16 v4, 0x43b40000    # 360.0f

    .line 67
    .line 68
    const/high16 v5, 0x43b40000    # 360.0f

    .line 69
    .line 70
    move v13, v2

    .line 71
    iget-wide v2, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/rewardedcountdowntimer/e;->a:J

    .line 72
    .line 73
    invoke-static/range {v1 .. v8}, Lcom/google/android/gms/internal/consent_sdk/a;->c(Lg0/d;JFFJLg0/g;)V

    .line 74
    .line 75
    .line 76
    iget-object v2, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/rewardedcountdowntimer/e;->c:LA/e;

    .line 77
    .line 78
    invoke-virtual {v2}, LA/e;->d()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    check-cast v3, Ljava/lang/Number;

    .line 83
    .line 84
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    const/4 v4, 0x0

    .line 89
    cmpl-float v3, v3, v4

    .line 90
    .line 91
    if-lez v3, :cond_1

    .line 92
    .line 93
    invoke-virtual {v2}, LA/e;->d()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    check-cast v2, Ljava/lang/Number;

    .line 98
    .line 99
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    cmpg-float v3, v2, v4

    .line 104
    .line 105
    if-gez v3, :cond_0

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_0
    move v4, v2

    .line 109
    :goto_0
    const/high16 v2, -0x3c4c0000    # -360.0f

    .line 110
    .line 111
    mul-float v5, v4, v2

    .line 112
    .line 113
    invoke-interface {v9}, LN/K0;->getValue()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    check-cast v2, LL0/h;

    .line 118
    .line 119
    iget-wide v2, v2, LL0/h;->a:J

    .line 120
    .line 121
    shr-long/2addr v2, v10

    .line 122
    long-to-int v2, v2

    .line 123
    int-to-float v2, v2

    .line 124
    invoke-interface {v9}, LN/K0;->getValue()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    check-cast v3, LL0/h;

    .line 129
    .line 130
    iget-wide v3, v3, LL0/h;->a:J

    .line 131
    .line 132
    and-long/2addr v3, v11

    .line 133
    long-to-int v3, v3

    .line 134
    int-to-float v3, v3

    .line 135
    invoke-static {v2, v3}, Lcom/moloco/sdk/internal/publisher/H;->I(FF)J

    .line 136
    .line 137
    .line 138
    move-result-wide v6

    .line 139
    new-instance v14, Lg0/g;

    .line 140
    .line 141
    invoke-interface {v1, v13}, LL0/b;->t(F)F

    .line 142
    .line 143
    .line 144
    move-result v15

    .line 145
    const/16 v17, 0x1

    .line 146
    .line 147
    const/16 v19, 0x1a

    .line 148
    .line 149
    const/16 v16, 0x0

    .line 150
    .line 151
    const/16 v18, 0x0

    .line 152
    .line 153
    invoke-direct/range {v14 .. v19}, Lg0/g;-><init>(FFIII)V

    .line 154
    .line 155
    .line 156
    iget-wide v2, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/rewardedcountdowntimer/e;->d:J

    .line 157
    .line 158
    const/high16 v4, 0x43870000    # 270.0f

    .line 159
    .line 160
    move-object v8, v14

    .line 161
    invoke-static/range {v1 .. v8}, Lcom/google/android/gms/internal/consent_sdk/a;->c(Lg0/d;JFFJLg0/g;)V

    .line 162
    .line 163
    .line 164
    :cond_1
    sget-object v1, Lef/C;->a:Lef/C;

    .line 165
    .line 166
    return-object v1
.end method
