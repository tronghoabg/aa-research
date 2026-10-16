.class public final synthetic Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/rewardedcountdowntimer/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:F

.field public final synthetic c:LA/e;

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(JFLA/e;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/rewardedcountdowntimer/k;->a:J

    iput p3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/rewardedcountdowntimer/k;->b:F

    iput-object p4, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/rewardedcountdowntimer/k;->c:LA/e;

    iput-wide p5, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/rewardedcountdowntimer/k;->d:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Lg0/d;

    .line 3
    .line 4
    const-string p1, "$this$Canvas"

    .line 5
    .line 6
    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Lg0/d;->c()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    invoke-static {v1, v2}, Ld0/f;->d(J)F

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-interface {v0}, Lg0/d;->c()J

    .line 18
    .line 19
    .line 20
    move-result-wide v1

    .line 21
    invoke-static {v1, v2}, Ld0/f;->b(J)F

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-static {p1, v1}, Lcom/moloco/sdk/internal/publisher/H;->I(FF)J

    .line 26
    .line 27
    .line 28
    move-result-wide v5

    .line 29
    new-instance v7, Lg0/g;

    .line 30
    .line 31
    iget p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/rewardedcountdowntimer/k;->b:F

    .line 32
    .line 33
    invoke-interface {v0, p1}, LL0/b;->t(F)F

    .line 34
    .line 35
    .line 36
    move-result v8

    .line 37
    const/4 v10, 0x1

    .line 38
    const/16 v12, 0x1a

    .line 39
    .line 40
    const/4 v9, 0x0

    .line 41
    const/4 v11, 0x0

    .line 42
    invoke-direct/range {v7 .. v12}, Lg0/g;-><init>(FFIII)V

    .line 43
    .line 44
    .line 45
    const/high16 v3, 0x43b40000    # 360.0f

    .line 46
    .line 47
    const/high16 v4, 0x43b40000    # 360.0f

    .line 48
    .line 49
    iget-wide v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/rewardedcountdowntimer/k;->a:J

    .line 50
    .line 51
    invoke-static/range {v0 .. v7}, Lcom/google/android/gms/internal/consent_sdk/a;->c(Lg0/d;JFFJLg0/g;)V

    .line 52
    .line 53
    .line 54
    iget-object v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/rewardedcountdowntimer/k;->c:LA/e;

    .line 55
    .line 56
    invoke-virtual {v1}, LA/e;->d()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    check-cast v2, Ljava/lang/Number;

    .line 61
    .line 62
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    const/4 v3, 0x0

    .line 67
    cmpl-float v2, v2, v3

    .line 68
    .line 69
    if-lez v2, :cond_1

    .line 70
    .line 71
    invoke-virtual {v1}, LA/e;->d()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    check-cast v1, Ljava/lang/Number;

    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    cmpg-float v2, v1, v3

    .line 82
    .line 83
    if-gez v2, :cond_0

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_0
    move v3, v1

    .line 87
    :goto_0
    const/high16 v1, -0x3c4c0000    # -360.0f

    .line 88
    .line 89
    mul-float v4, v3, v1

    .line 90
    .line 91
    invoke-interface {v0}, Lg0/d;->c()J

    .line 92
    .line 93
    .line 94
    move-result-wide v1

    .line 95
    invoke-static {v1, v2}, Ld0/f;->d(J)F

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    invoke-interface {v0}, Lg0/d;->c()J

    .line 100
    .line 101
    .line 102
    move-result-wide v2

    .line 103
    invoke-static {v2, v3}, Ld0/f;->b(J)F

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    invoke-static {v1, v2}, Lcom/moloco/sdk/internal/publisher/H;->I(FF)J

    .line 108
    .line 109
    .line 110
    move-result-wide v5

    .line 111
    new-instance v7, Lg0/g;

    .line 112
    .line 113
    invoke-interface {v0, p1}, LL0/b;->t(F)F

    .line 114
    .line 115
    .line 116
    move-result v8

    .line 117
    const/4 v10, 0x1

    .line 118
    const/16 v12, 0x1a

    .line 119
    .line 120
    const/4 v9, 0x0

    .line 121
    const/4 v11, 0x0

    .line 122
    invoke-direct/range {v7 .. v12}, Lg0/g;-><init>(FFIII)V

    .line 123
    .line 124
    .line 125
    iget-wide v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/rewardedcountdowntimer/k;->d:J

    .line 126
    .line 127
    const/high16 v3, 0x43870000    # 270.0f

    .line 128
    .line 129
    invoke-static/range {v0 .. v7}, Lcom/google/android/gms/internal/consent_sdk/a;->c(Lg0/d;JFFJLg0/g;)V

    .line 130
    .line 131
    .line 132
    :cond_1
    sget-object p1, Lef/C;->a:Lef/C;

    .line 133
    .line 134
    return-object p1
.end method
