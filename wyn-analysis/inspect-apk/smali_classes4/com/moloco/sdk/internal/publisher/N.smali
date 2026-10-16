.class public final Lcom/moloco/sdk/internal/publisher/N;
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
    iput-object p1, p0, Lcom/moloco/sdk/internal/publisher/N;->b:Lcom/moloco/sdk/internal/publisher/V;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/moloco/sdk/internal/publisher/N;->c:LR0/e;

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
    new-instance v0, Lcom/moloco/sdk/internal/publisher/N;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/moloco/sdk/internal/publisher/N;->b:Lcom/moloco/sdk/internal/publisher/V;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/moloco/sdk/internal/publisher/N;->c:LR0/e;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, Lcom/moloco/sdk/internal/publisher/N;-><init>(Lcom/moloco/sdk/internal/publisher/V;LR0/e;Ljf/c;)V

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
    iput-boolean p1, v0, Lcom/moloco/sdk/internal/publisher/N;->a:Z

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
    invoke-virtual {p0, p1, p2}, Lcom/moloco/sdk/internal/publisher/N;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Lcom/moloco/sdk/internal/publisher/N;

    .line 13
    .line 14
    sget-object p2, Lef/C;->a:Lef/C;

    .line 15
    .line 16
    invoke-virtual {p1, p2}, Lcom/moloco/sdk/internal/publisher/N;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-boolean p1, p0, Lcom/moloco/sdk/internal/publisher/N;->a:Z

    .line 7
    .line 8
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/N;->b:Lcom/moloco/sdk/internal/publisher/V;

    .line 9
    .line 10
    iget-object v1, v0, Lcom/moloco/sdk/internal/publisher/V;->t:LR0/e;

    .line 11
    .line 12
    iput-boolean p1, v1, LR0/e;->b:Z

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    iget-object v3, v0, Lcom/moloco/sdk/internal/publisher/V;->d:Ljava/lang/String;

    .line 16
    .line 17
    const/4 v4, 0x6

    .line 18
    if-eqz p1, :cond_2

    .line 19
    .line 20
    iget-object p1, v0, Lcom/moloco/sdk/internal/publisher/V;->r:Lcom/moloco/sdk/acm/l;

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    iget-object v1, v1, LR0/e;->d:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/e;

    .line 27
    .line 28
    const-string v5, "toLowerCase(...)"

    .line 29
    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    invoke-interface {v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/m;->getCreativeType()Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/l;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    if-eqz v1, :cond_0

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    if-eqz v1, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    sget-object v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/l;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/l;

    .line 46
    .line 47
    const-string v1, "UNKNOWN"

    .line 48
    .line 49
    :goto_0
    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 50
    .line 51
    invoke-virtual {v1, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    sget-object v6, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 59
    .line 60
    iget-object v6, v0, Lcom/moloco/sdk/internal/publisher/V;->o:Lcom/moloco/sdk/publisher/AdFormatType;

    .line 61
    .line 62
    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 67
    .line 68
    invoke-virtual {v6, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    const-string v5, "ad_type"

    .line 76
    .line 77
    invoke-virtual {p1, v5, v6}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    const-string v5, "creative_type"

    .line 81
    .line 82
    invoke-virtual {p1, v5, v1}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    iget-object v1, v0, Lcom/moloco/sdk/internal/publisher/V;->m:Lcom/moloco/sdk/acm/recorder/c;

    .line 86
    .line 87
    invoke-virtual {v1, p1}, Lcom/moloco/sdk/acm/recorder/c;->b(Lcom/moloco/sdk/acm/l;)V

    .line 88
    .line 89
    .line 90
    :cond_1
    invoke-static {v0}, Lcom/moloco/sdk/internal/publisher/V;->c(Lcom/moloco/sdk/internal/publisher/V;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    sget-object v5, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 95
    .line 96
    const-string v1, "Banner parent view type: "

    .line 97
    .line 98
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    const-string v6, "BannerViewImpl"

    .line 103
    .line 104
    const/4 v8, 0x0

    .line 105
    const/4 v9, 0x4

    .line 106
    const/4 v10, 0x0

    .line 107
    invoke-static/range {v5 .. v10}, Lcom/moloco/sdk/internal/MolocoLogger;->debug$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    iget-object v0, v0, Lcom/moloco/sdk/internal/publisher/V;->v:LY2/B;

    .line 111
    .line 112
    if-eqz v0, :cond_4

    .line 113
    .line 114
    invoke-static {v3, v2, v2, v4, v2}, Lcom/moloco/sdk/publisher/MolocoAdKt;->createAdInfo$default(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;ILjava/lang/Object;)Lcom/moloco/sdk/publisher/MolocoAd;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-virtual {v0, v1, p1}, LY2/B;->d(Lcom/moloco/sdk/publisher/MolocoAd;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_2
    iget-object p1, v0, Lcom/moloco/sdk/internal/publisher/V;->v:LY2/B;

    .line 123
    .line 124
    if-eqz p1, :cond_3

    .line 125
    .line 126
    invoke-static {v3, v2, v2, v4, v2}, Lcom/moloco/sdk/publisher/MolocoAdKt;->createAdInfo$default(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;ILjava/lang/Object;)Lcom/moloco/sdk/publisher/MolocoAd;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-virtual {p1, v0}, LY2/B;->s(Lcom/moloco/sdk/publisher/MolocoAd;)V

    .line 131
    .line 132
    .line 133
    :cond_3
    iget-object p1, p0, Lcom/moloco/sdk/internal/publisher/N;->c:LR0/e;

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
    invoke-virtual {p1, v2}, LEf/z0;->cancel(Ljava/util/concurrent/CancellationException;)V

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
