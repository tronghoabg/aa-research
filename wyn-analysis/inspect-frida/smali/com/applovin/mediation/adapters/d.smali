.class public final synthetic Lcom/applovin/mediation/adapters/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lcom/applovin/mediation/adapters/MolocoMediationAdapter;Lcom/applovin/mediation/MaxAdFormat;Lcom/applovin/mediation/adapter/listeners/MaxAdViewAdapterListener;Lcom/applovin/mediation/adapter/parameters/MaxAdapterResponseParameters;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lcom/applovin/mediation/adapters/d;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/applovin/mediation/adapters/d;->b:Ljava/lang/Object;

    iput-object p2, p0, Lcom/applovin/mediation/adapters/d;->d:Ljava/lang/Object;

    iput-object p3, p0, Lcom/applovin/mediation/adapters/d;->e:Ljava/lang/Object;

    iput-object p4, p0, Lcom/applovin/mediation/adapters/d;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/applovin/mediation/adapters/MolocoMediationAdapter;Lcom/applovin/mediation/adapter/listeners/MaxNativeAdAdapterListener;Lcom/applovin/mediation/adapter/parameters/MaxAdapterResponseParameters;Landroid/app/Activity;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lcom/applovin/mediation/adapters/d;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/applovin/mediation/adapters/d;->b:Ljava/lang/Object;

    iput-object p2, p0, Lcom/applovin/mediation/adapters/d;->d:Ljava/lang/Object;

    iput-object p3, p0, Lcom/applovin/mediation/adapters/d;->c:Ljava/lang/Object;

    iput-object p4, p0, Lcom/applovin/mediation/adapters/d;->e:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lef/e;Ljava/lang/Object;II)V
    .locals 0

    .line 3
    iput p6, p0, Lcom/applovin/mediation/adapters/d;->a:I

    iput-object p1, p0, Lcom/applovin/mediation/adapters/d;->b:Ljava/lang/Object;

    iput-object p2, p0, Lcom/applovin/mediation/adapters/d;->d:Ljava/lang/Object;

    iput-object p3, p0, Lcom/applovin/mediation/adapters/d;->e:Ljava/lang/Object;

    iput-object p4, p0, Lcom/applovin/mediation/adapters/d;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lcom/applovin/mediation/adapters/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v5, p1

    .line 7
    check-cast v5, LN/o;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lcom/applovin/mediation/adapters/d;->e:Ljava/lang/Object;

    .line 15
    .line 16
    move-object v3, p1

    .line 17
    check-cast v3, Ltf/a;

    .line 18
    .line 19
    iget-object p1, p0, Lcom/applovin/mediation/adapters/d;->c:Ljava/lang/Object;

    .line 20
    .line 21
    move-object v4, p1

    .line 22
    check-cast v4, LZ/k;

    .line 23
    .line 24
    iget-object p1, p0, Lcom/applovin/mediation/adapters/d;->b:Ljava/lang/Object;

    .line 25
    .line 26
    move-object v1, p1

    .line 27
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/s;

    .line 28
    .line 29
    iget-object p1, p0, Lcom/applovin/mediation/adapters/d;->d:Ljava/lang/Object;

    .line 30
    .line 31
    move-object v2, p1

    .line 32
    check-cast v2, Ltf/a;

    .line 33
    .line 34
    const/4 v6, 0x1

    .line 35
    invoke-static/range {v1 .. v6}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/B;->a(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/s;Ltf/a;Ltf/a;LZ/k;LN/o;I)V

    .line 36
    .line 37
    .line 38
    sget-object p1, Lef/C;->a:Lef/C;

    .line 39
    .line 40
    return-object p1

    .line 41
    :pswitch_0
    move-object v4, p1

    .line 42
    check-cast v4, LN/o;

    .line 43
    .line 44
    check-cast p2, Ljava/lang/Integer;

    .line 45
    .line 46
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lcom/applovin/mediation/adapters/d;->b:Ljava/lang/Object;

    .line 50
    .line 51
    move-object v0, p1

    .line 52
    check-cast v0, Landroid/app/Activity;

    .line 53
    .line 54
    iget-object p1, p0, Lcom/applovin/mediation/adapters/d;->d:Ljava/lang/Object;

    .line 55
    .line 56
    move-object v1, p1

    .line 57
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/q;

    .line 58
    .line 59
    iget-object p1, p0, Lcom/applovin/mediation/adapters/d;->e:Ljava/lang/Object;

    .line 60
    .line 61
    move-object v2, p1

    .line 62
    check-cast v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/G;

    .line 63
    .line 64
    iget-object p1, p0, Lcom/applovin/mediation/adapters/d;->c:Ljava/lang/Object;

    .line 65
    .line 66
    move-object v3, p1

    .line 67
    check-cast v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;

    .line 68
    .line 69
    const/4 v5, 0x1

    .line 70
    invoke-static/range {v0 .. v5}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/G;->f(Landroid/app/Activity;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/q;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/G;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;LN/o;I)V

    .line 71
    .line 72
    .line 73
    sget-object p1, Lef/C;->a:Lef/C;

    .line 74
    .line 75
    return-object p1

    .line 76
    :pswitch_1
    move-object v4, p1

    .line 77
    check-cast v4, LN/o;

    .line 78
    .line 79
    check-cast p2, Ljava/lang/Integer;

    .line 80
    .line 81
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    iget-object p1, p0, Lcom/applovin/mediation/adapters/d;->e:Ljava/lang/Object;

    .line 85
    .line 86
    move-object v2, p1

    .line 87
    check-cast v2, Ltf/a;

    .line 88
    .line 89
    iget-object p1, p0, Lcom/applovin/mediation/adapters/d;->c:Ljava/lang/Object;

    .line 90
    .line 91
    move-object v3, p1

    .line 92
    check-cast v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/F0;

    .line 93
    .line 94
    iget-object p1, p0, Lcom/applovin/mediation/adapters/d;->b:Ljava/lang/Object;

    .line 95
    .line 96
    move-object v0, p1

    .line 97
    check-cast v0, LZ/k;

    .line 98
    .line 99
    iget-object p1, p0, Lcom/applovin/mediation/adapters/d;->d:Ljava/lang/Object;

    .line 100
    .line 101
    move-object v1, p1

    .line 102
    check-cast v1, Ljava/lang/String;

    .line 103
    .line 104
    const/16 v5, 0x181

    .line 105
    .line 106
    invoke-static/range {v0 .. v5}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/B;->a(LZ/k;Ljava/lang/String;Ltf/a;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/F0;LN/o;I)V

    .line 107
    .line 108
    .line 109
    sget-object p1, Lef/C;->a:Lef/C;

    .line 110
    .line 111
    return-object p1

    .line 112
    :pswitch_2
    move-object v4, p1

    .line 113
    check-cast v4, Lcom/moloco/sdk/publisher/NativeAd;

    .line 114
    .line 115
    move-object v5, p2

    .line 116
    check-cast v5, Lcom/moloco/sdk/publisher/MolocoAdError$AdCreateError;

    .line 117
    .line 118
    iget-object p1, p0, Lcom/applovin/mediation/adapters/d;->b:Ljava/lang/Object;

    .line 119
    .line 120
    move-object v0, p1

    .line 121
    check-cast v0, Lcom/applovin/mediation/adapters/MolocoMediationAdapter;

    .line 122
    .line 123
    iget-object p1, p0, Lcom/applovin/mediation/adapters/d;->c:Ljava/lang/Object;

    .line 124
    .line 125
    move-object v2, p1

    .line 126
    check-cast v2, Lcom/applovin/mediation/adapter/parameters/MaxAdapterResponseParameters;

    .line 127
    .line 128
    iget-object p1, p0, Lcom/applovin/mediation/adapters/d;->e:Ljava/lang/Object;

    .line 129
    .line 130
    move-object v3, p1

    .line 131
    check-cast v3, Landroid/app/Activity;

    .line 132
    .line 133
    iget-object p1, p0, Lcom/applovin/mediation/adapters/d;->d:Ljava/lang/Object;

    .line 134
    .line 135
    move-object v1, p1

    .line 136
    check-cast v1, Lcom/applovin/mediation/adapter/listeners/MaxNativeAdAdapterListener;

    .line 137
    .line 138
    invoke-static/range {v0 .. v5}, Lcom/applovin/mediation/adapters/MolocoMediationAdapter;->b(Lcom/applovin/mediation/adapters/MolocoMediationAdapter;Lcom/applovin/mediation/adapter/listeners/MaxNativeAdAdapterListener;Lcom/applovin/mediation/adapter/parameters/MaxAdapterResponseParameters;Landroid/app/Activity;Lcom/moloco/sdk/publisher/NativeAd;Lcom/moloco/sdk/publisher/MolocoAdError$AdCreateError;)Lef/C;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    return-object p1

    .line 143
    :pswitch_3
    move-object v4, p1

    .line 144
    check-cast v4, Lcom/moloco/sdk/publisher/Banner;

    .line 145
    .line 146
    move-object v5, p2

    .line 147
    check-cast v5, Lcom/moloco/sdk/publisher/MolocoAdError$AdCreateError;

    .line 148
    .line 149
    iget-object p1, p0, Lcom/applovin/mediation/adapters/d;->b:Ljava/lang/Object;

    .line 150
    .line 151
    move-object v0, p1

    .line 152
    check-cast v0, Lcom/applovin/mediation/adapters/MolocoMediationAdapter;

    .line 153
    .line 154
    iget-object p1, p0, Lcom/applovin/mediation/adapters/d;->d:Ljava/lang/Object;

    .line 155
    .line 156
    move-object v1, p1

    .line 157
    check-cast v1, Lcom/applovin/mediation/MaxAdFormat;

    .line 158
    .line 159
    iget-object p1, p0, Lcom/applovin/mediation/adapters/d;->c:Ljava/lang/Object;

    .line 160
    .line 161
    move-object v3, p1

    .line 162
    check-cast v3, Lcom/applovin/mediation/adapter/parameters/MaxAdapterResponseParameters;

    .line 163
    .line 164
    iget-object p1, p0, Lcom/applovin/mediation/adapters/d;->e:Ljava/lang/Object;

    .line 165
    .line 166
    move-object v2, p1

    .line 167
    check-cast v2, Lcom/applovin/mediation/adapter/listeners/MaxAdViewAdapterListener;

    .line 168
    .line 169
    invoke-static/range {v0 .. v5}, Lcom/applovin/mediation/adapters/MolocoMediationAdapter;->j(Lcom/applovin/mediation/adapters/MolocoMediationAdapter;Lcom/applovin/mediation/MaxAdFormat;Lcom/applovin/mediation/adapter/listeners/MaxAdViewAdapterListener;Lcom/applovin/mediation/adapter/parameters/MaxAdapterResponseParameters;Lcom/moloco/sdk/publisher/Banner;Lcom/moloco/sdk/publisher/MolocoAdError$AdCreateError;)Lef/C;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    return-object p1

    .line 174
    nop

    .line 175
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
