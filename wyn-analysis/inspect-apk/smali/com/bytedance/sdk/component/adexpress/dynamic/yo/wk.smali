.class public Lcom/bytedance/sdk/component/adexpress/dynamic/yo/wk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/component/adexpress/dynamic/yo/xs;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/bytedance/sdk/component/adexpress/dynamic/yo/xs<",
        "Lcom/bytedance/sdk/component/adexpress/ivm/sy;",
        ">;"
    }
.end annotation


# instance fields
.field private bcc:I

.field private cz:Lorg/json/JSONObject;

.field private ivm:I

.field private lw:Ljava/lang/String;

.field private moa:Lcom/bytedance/sdk/component/adexpress/dynamic/moa/xs;

.field private oa:Landroid/content/Context;

.field private uef:Lcom/bytedance/sdk/component/adexpress/ivm/sy;

.field private xs:I

.field private yo:Lcom/bytedance/sdk/component/adexpress/dynamic/dynamicview/lw;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/bytedance/sdk/component/adexpress/dynamic/dynamicview/lw;Lcom/bytedance/sdk/component/adexpress/dynamic/moa/xs;Ljava/lang/String;IIILorg/json/JSONObject;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/wk;->oa:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/wk;->yo:Lcom/bytedance/sdk/component/adexpress/dynamic/dynamicview/lw;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/wk;->moa:Lcom/bytedance/sdk/component/adexpress/dynamic/moa/xs;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/wk;->lw:Ljava/lang/String;

    .line 11
    .line 12
    iput p5, p0, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/wk;->ivm:I

    .line 13
    .line 14
    iput p6, p0, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/wk;->xs:I

    .line 15
    .line 16
    iput p7, p0, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/wk;->bcc:I

    .line 17
    .line 18
    iput-object p8, p0, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/wk;->cz:Lorg/json/JSONObject;

    .line 19
    .line 20
    invoke-direct {p0}, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/wk;->lw()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method private lw()V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/wk;->yo:Lcom/bytedance/sdk/component/adexpress/dynamic/dynamicview/lw;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/adexpress/dynamic/dynamicview/lw;->getDynamicClickListener()Lcom/bytedance/sdk/component/adexpress/dynamic/ivm/uef;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    .line 8
    .line 9
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v2, "convertActionType"

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    :catchall_0
    const-string v1, "16"

    .line 19
    .line 20
    iget-object v2, p0, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/wk;->lw:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    new-instance v2, Lcom/bytedance/sdk/component/adexpress/ivm/sy;

    .line 29
    .line 30
    iget-object v3, p0, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/wk;->oa:Landroid/content/Context;

    .line 31
    .line 32
    invoke-static {v3}, Lcom/bytedance/sdk/component/adexpress/yo/uef;->bcc(Landroid/content/Context;)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    iget v5, p0, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/wk;->ivm:I

    .line 37
    .line 38
    iget v6, p0, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/wk;->xs:I

    .line 39
    .line 40
    iget v7, p0, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/wk;->bcc:I

    .line 41
    .line 42
    iget-object v8, p0, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/wk;->cz:Lorg/json/JSONObject;

    .line 43
    .line 44
    invoke-direct/range {v2 .. v8}, Lcom/bytedance/sdk/component/adexpress/ivm/sy;-><init>(Landroid/content/Context;Landroid/view/View;IIILorg/json/JSONObject;)V

    .line 45
    .line 46
    .line 47
    iput-object v2, p0, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/wk;->uef:Lcom/bytedance/sdk/component/adexpress/ivm/sy;

    .line 48
    .line 49
    invoke-virtual {v2}, Lcom/bytedance/sdk/component/adexpress/ivm/sy;->getShakeLayout()Landroid/widget/LinearLayout;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    if-eqz v1, :cond_1

    .line 54
    .line 55
    iget-object v1, p0, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/wk;->uef:Lcom/bytedance/sdk/component/adexpress/ivm/sy;

    .line 56
    .line 57
    invoke-virtual {v1}, Lcom/bytedance/sdk/component/adexpress/ivm/sy;->getShakeLayout()Landroid/widget/LinearLayout;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    move-object v2, v0

    .line 62
    check-cast v2, Landroid/view/View$OnClickListener;

    .line 63
    .line 64
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    new-instance v3, Lcom/bytedance/sdk/component/adexpress/ivm/sy;

    .line 69
    .line 70
    iget-object v4, p0, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/wk;->oa:Landroid/content/Context;

    .line 71
    .line 72
    invoke-static {v4}, Lcom/bytedance/sdk/component/adexpress/yo/uef;->xs(Landroid/content/Context;)Landroid/view/View;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    iget v6, p0, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/wk;->ivm:I

    .line 77
    .line 78
    iget v7, p0, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/wk;->xs:I

    .line 79
    .line 80
    iget v8, p0, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/wk;->bcc:I

    .line 81
    .line 82
    iget-object v9, p0, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/wk;->cz:Lorg/json/JSONObject;

    .line 83
    .line 84
    invoke-direct/range {v3 .. v9}, Lcom/bytedance/sdk/component/adexpress/ivm/sy;-><init>(Landroid/content/Context;Landroid/view/View;IIILorg/json/JSONObject;)V

    .line 85
    .line 86
    .line 87
    iput-object v3, p0, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/wk;->uef:Lcom/bytedance/sdk/component/adexpress/ivm/sy;

    .line 88
    .line 89
    :cond_1
    :goto_0
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 90
    .line 91
    const/4 v2, -0x1

    .line 92
    invoke-direct {v1, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 93
    .line 94
    .line 95
    iget-object v2, p0, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/wk;->uef:Lcom/bytedance/sdk/component/adexpress/ivm/sy;

    .line 96
    .line 97
    const/16 v3, 0x11

    .line 98
    .line 99
    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 100
    .line 101
    .line 102
    iput v3, v1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 103
    .line 104
    iget-object v2, p0, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/wk;->uef:Lcom/bytedance/sdk/component/adexpress/ivm/sy;

    .line 105
    .line 106
    invoke-virtual {v2, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 107
    .line 108
    .line 109
    iget-object v1, p0, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/wk;->uef:Lcom/bytedance/sdk/component/adexpress/ivm/sy;

    .line 110
    .line 111
    iget-object v2, p0, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/wk;->oa:Landroid/content/Context;

    .line 112
    .line 113
    iget-object v3, p0, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/wk;->moa:Lcom/bytedance/sdk/component/adexpress/dynamic/moa/xs;

    .line 114
    .line 115
    invoke-virtual {v3}, Lcom/bytedance/sdk/component/adexpress/dynamic/moa/xs;->vjj()I

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    int-to-float v3, v3

    .line 120
    invoke-static {v2, v3}, Lcom/bytedance/sdk/component/adexpress/moa/xs;->uef(Landroid/content/Context;F)F

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    invoke-virtual {v1, v2}, Landroid/view/View;->setTranslationY(F)V

    .line 125
    .line 126
    .line 127
    iget-object v1, p0, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/wk;->uef:Lcom/bytedance/sdk/component/adexpress/ivm/sy;

    .line 128
    .line 129
    iget-object v2, p0, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/wk;->moa:Lcom/bytedance/sdk/component/adexpress/dynamic/moa/xs;

    .line 130
    .line 131
    invoke-virtual {v2}, Lcom/bytedance/sdk/component/adexpress/dynamic/moa/xs;->rj()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    invoke-virtual {v1, v2}, Lcom/bytedance/sdk/component/adexpress/ivm/sy;->setShakeText(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    iget-object v1, p0, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/wk;->uef:Lcom/bytedance/sdk/component/adexpress/ivm/sy;

    .line 139
    .line 140
    const/4 v2, 0x0

    .line 141
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 142
    .line 143
    .line 144
    iget-object v1, p0, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/wk;->uef:Lcom/bytedance/sdk/component/adexpress/ivm/sy;

    .line 145
    .line 146
    new-instance v2, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/wk$1;

    .line 147
    .line 148
    invoke-direct {v2, p0, v0}, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/wk$1;-><init>(Lcom/bytedance/sdk/component/adexpress/dynamic/yo/wk;Lcom/bytedance/sdk/component/adexpress/dynamic/ivm/uef;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v1, v2}, Lcom/bytedance/sdk/component/adexpress/ivm/sy;->setOnShakeViewListener(Lcom/bytedance/sdk/component/adexpress/ivm/sy$uef;)V

    .line 152
    .line 153
    .line 154
    return-void
.end method


# virtual methods
.method public moa()Lcom/bytedance/sdk/component/adexpress/ivm/sy;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/wk;->uef:Lcom/bytedance/sdk/component/adexpress/ivm/sy;

    .line 2
    .line 3
    return-object v0
.end method

.method public oa()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/wk;->uef:Lcom/bytedance/sdk/component/adexpress/ivm/sy;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public uef()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/wk;->uef:Lcom/bytedance/sdk/component/adexpress/ivm/sy;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/adexpress/ivm/sy;->uef()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public synthetic yo()Landroid/view/ViewGroup;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/wk;->moa()Lcom/bytedance/sdk/component/adexpress/ivm/sy;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
