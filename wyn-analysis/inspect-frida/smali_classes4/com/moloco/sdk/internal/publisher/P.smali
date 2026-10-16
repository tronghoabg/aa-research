.class public final Lcom/moloco/sdk/internal/publisher/P;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public synthetic a:Z

.field public final synthetic b:Lcom/moloco/sdk/internal/publisher/V;

.field public final synthetic c:LR0/e;


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/internal/publisher/V;LR0/e;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/moloco/sdk/internal/publisher/P;->b:Lcom/moloco/sdk/internal/publisher/V;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/moloco/sdk/internal/publisher/P;->c:LR0/e;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Llf/j;-><init>(ILjf/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 3

    .line 1
    new-instance v0, Lcom/moloco/sdk/internal/publisher/P;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/moloco/sdk/internal/publisher/P;->b:Lcom/moloco/sdk/internal/publisher/V;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/moloco/sdk/internal/publisher/P;->c:LR0/e;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, Lcom/moloco/sdk/internal/publisher/P;-><init>(Lcom/moloco/sdk/internal/publisher/V;LR0/e;Ljf/c;)V

    .line 8
    .line 9
    .line 10
    check-cast p1, Ljava/lang/Boolean;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    iput-boolean p1, v0, Lcom/moloco/sdk/internal/publisher/P;->a:Z

    .line 17
    .line 18
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 4
    .line 5
    .line 6
    check-cast p2, Ljf/c;

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2}, Lcom/moloco/sdk/internal/publisher/P;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Lcom/moloco/sdk/internal/publisher/P;

    .line 13
    .line 14
    sget-object p2, Lef/C;->a:Lef/C;

    .line 15
    .line 16
    invoke-virtual {p1, p2}, Lcom/moloco/sdk/internal/publisher/P;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-boolean p1, p0, Lcom/moloco/sdk/internal/publisher/P;->a:Z

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    const/4 v1, 0x6

    .line 10
    iget-object v2, p0, Lcom/moloco/sdk/internal/publisher/P;->b:Lcom/moloco/sdk/internal/publisher/V;

    .line 11
    .line 12
    if-eqz p1, :cond_2

    .line 13
    .line 14
    iget-object p1, v2, Lcom/moloco/sdk/internal/publisher/V;->r:Lcom/moloco/sdk/acm/l;

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    iget-object v3, v2, Lcom/moloco/sdk/internal/publisher/V;->t:LR0/e;

    .line 19
    .line 20
    iget-object v3, v3, LR0/e;->d:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/e;

    .line 23
    .line 24
    const-string v4, "toLowerCase(...)"

    .line 25
    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    invoke-interface {v3}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/m;->getCreativeType()Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/l;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    if-eqz v3, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    sget-object v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/l;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/l;

    .line 42
    .line 43
    const-string v3, "UNKNOWN"

    .line 44
    .line 45
    :goto_0
    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 46
    .line 47
    invoke-virtual {v3, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    sget-object v5, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 55
    .line 56
    iget-object v5, v2, Lcom/moloco/sdk/internal/publisher/V;->o:Lcom/moloco/sdk/publisher/AdFormatType;

    .line 57
    .line 58
    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 63
    .line 64
    invoke-virtual {v5, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const-string v4, "ad_type"

    .line 72
    .line 73
    invoke-virtual {p1, v4, v5}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    const-string v4, "creative_type"

    .line 77
    .line 78
    invoke-virtual {p1, v4, v3}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    iget-object v3, v2, Lcom/moloco/sdk/internal/publisher/V;->m:Lcom/moloco/sdk/acm/recorder/c;

    .line 82
    .line 83
    invoke-virtual {v3, p1}, Lcom/moloco/sdk/acm/recorder/c;->b(Lcom/moloco/sdk/acm/l;)V

    .line 84
    .line 85
    .line 86
    :cond_1
    invoke-static {v2}, Lcom/moloco/sdk/internal/publisher/V;->c(Lcom/moloco/sdk/internal/publisher/V;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    sget-object v3, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 91
    .line 92
    const-string v4, "Banner parent view type: "

    .line 93
    .line 94
    invoke-virtual {v4, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    const-string v4, "BannerViewImpl"

    .line 99
    .line 100
    const/4 v6, 0x0

    .line 101
    const/4 v7, 0x4

    .line 102
    const/4 v8, 0x0

    .line 103
    invoke-static/range {v3 .. v8}, Lcom/moloco/sdk/internal/MolocoLogger;->debug$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    iget-object v3, v2, Lcom/moloco/sdk/internal/publisher/V;->v:LY2/B;

    .line 107
    .line 108
    if-eqz v3, :cond_4

    .line 109
    .line 110
    iget-object v2, v2, Lcom/moloco/sdk/internal/publisher/V;->d:Ljava/lang/String;

    .line 111
    .line 112
    invoke-static {v2, v0, v0, v1, v0}, Lcom/moloco/sdk/publisher/MolocoAdKt;->createAdInfo$default(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;ILjava/lang/Object;)Lcom/moloco/sdk/publisher/MolocoAd;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {v3, v0, p1}, LY2/B;->d(Lcom/moloco/sdk/publisher/MolocoAd;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_2
    iget-object p1, v2, Lcom/moloco/sdk/internal/publisher/V;->v:LY2/B;

    .line 121
    .line 122
    if-eqz p1, :cond_3

    .line 123
    .line 124
    iget-object v2, v2, Lcom/moloco/sdk/internal/publisher/V;->d:Ljava/lang/String;

    .line 125
    .line 126
    invoke-static {v2, v0, v0, v1, v0}, Lcom/moloco/sdk/publisher/MolocoAdKt;->createAdInfo$default(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;ILjava/lang/Object;)Lcom/moloco/sdk/publisher/MolocoAd;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-virtual {p1, v1}, LY2/B;->s(Lcom/moloco/sdk/publisher/MolocoAd;)V

    .line 131
    .line 132
    .line 133
    :cond_3
    iget-object p1, p0, Lcom/moloco/sdk/internal/publisher/P;->c:LR0/e;

    .line 134
    .line 135
    iget-object p1, p1, LR0/e;->g:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast p1, LEf/H0;

    .line 138
    .line 139
    if-eqz p1, :cond_4

    .line 140
    .line 141
    invoke-virtual {p1, v0}, LEf/z0;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 142
    .line 143
    .line 144
    :cond_4
    :goto_1
    sget-object p1, Lef/C;->a:Lef/C;

    .line 145
    .line 146
    return-object p1
.end method
