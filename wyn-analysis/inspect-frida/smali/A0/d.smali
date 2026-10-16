.class public final LA0/d;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/a;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, LA0/d;->i:I

    iput-object p1, p0, LA0/d;->j:Ljava/lang/Object;

    iput-object p2, p0, LA0/d;->k:Ljava/lang/Object;

    iput-object p3, p0, LA0/d;->l:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, LA0/d;->i:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA0/d;->j:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lu0/a;

    .line 9
    .line 10
    iget-object v1, p0, LA0/d;->k:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/T;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, LA0/d;->l:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, Lu0/V;

    .line 20
    .line 21
    const-string v2, "listener"

    .line 22
    .line 23
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-static {v0}, Landroid/support/v4/media/session/b;->g0(Landroid/view/View;)Lr1/a;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v0, v0, Lr1/a;->a:Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    sget-object v0, Lef/C;->a:Lef/C;

    .line 36
    .line 37
    return-object v0

    .line 38
    :pswitch_0
    iget-object v0, p0, LA0/d;->j:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Landroidx/fragment/app/m;

    .line 41
    .line 42
    iget-object v0, v0, Landroidx/fragment/app/m;->f:Landroidx/fragment/app/v0;

    .line 43
    .line 44
    iget-object v1, p0, LA0/d;->k:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v1, Landroid/view/ViewGroup;

    .line 47
    .line 48
    iget-object v2, p0, LA0/d;->l:Ljava/lang/Object;

    .line 49
    .line 50
    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/v0;->c(Landroid/view/ViewGroup;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    sget-object v0, Lef/C;->a:Lef/C;

    .line 54
    .line 55
    return-object v0

    .line 56
    :pswitch_1
    iget-object v0, p0, LA0/d;->j:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, LDd/c;

    .line 59
    .line 60
    iget-object v0, v0, LDd/c;->b:Ljava/lang/Object;

    .line 61
    .line 62
    invoke-interface {v0}, Lef/i;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, Landroid/text/BoringLayout$Metrics;

    .line 67
    .line 68
    iget-object v1, p0, LA0/d;->l:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v1, Landroid/text/TextPaint;

    .line 71
    .line 72
    iget-object v2, p0, LA0/d;->k:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v2, Ljava/lang/CharSequence;

    .line 75
    .line 76
    if-eqz v0, :cond_0

    .line 77
    .line 78
    iget v0, v0, Landroid/text/BoringLayout$Metrics;->width:I

    .line 79
    .line 80
    int-to-float v0, v0

    .line 81
    goto :goto_0

    .line 82
    :cond_0
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    const/4 v3, 0x0

    .line 87
    invoke-static {v2, v3, v0, v1}, Landroid/text/Layout;->getDesiredWidth(Ljava/lang/CharSequence;IILandroid/text/TextPaint;)F

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    :goto_0
    const/4 v3, 0x0

    .line 92
    cmpg-float v4, v0, v3

    .line 93
    .line 94
    if-nez v4, :cond_1

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_1
    instance-of v4, v2, Landroid/text/Spanned;

    .line 98
    .line 99
    if-eqz v4, :cond_4

    .line 100
    .line 101
    invoke-virtual {v1}, Landroid/graphics/Paint;->getLetterSpacing()F

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    cmpg-float v1, v1, v3

    .line 106
    .line 107
    if-nez v1, :cond_3

    .line 108
    .line 109
    check-cast v2, Landroid/text/Spanned;

    .line 110
    .line 111
    const-string v1, "<this>"

    .line 112
    .line 113
    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    const/4 v3, -0x1

    .line 121
    const-class v4, LC0/d;

    .line 122
    .line 123
    invoke-interface {v2, v3, v1, v4}, Landroid/text/Spanned;->nextSpanTransition(IILjava/lang/Class;)I

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 128
    .line 129
    .line 130
    move-result v4

    .line 131
    if-eq v1, v4, :cond_2

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_2
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    const-class v4, LC0/c;

    .line 139
    .line 140
    invoke-interface {v2, v3, v1, v4}, Landroid/text/Spanned;->nextSpanTransition(IILjava/lang/Class;)I

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    if-eq v1, v2, :cond_4

    .line 149
    .line 150
    :cond_3
    :goto_1
    const/high16 v1, 0x3f000000    # 0.5f

    .line 151
    .line 152
    add-float/2addr v0, v1

    .line 153
    :cond_4
    :goto_2
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    return-object v0

    .line 158
    nop

    .line 159
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
