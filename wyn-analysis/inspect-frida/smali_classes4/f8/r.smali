.class public final Lf8/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lf8/r;->a:I

    iput-object p1, p0, Lf8/r;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 8

    .line 1
    iget p1, p0, Lf8/r;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lf8/r;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Landroidx/appcompat/widget/SearchView;

    .line 9
    .line 10
    invoke-virtual {p1, p3}, Landroidx/appcompat/widget/SearchView;->p(I)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object p1, p0, Lf8/r;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p1, Lq/J;

    .line 17
    .line 18
    iget-object p4, p1, Lq/J;->H:Lq/M;

    .line 19
    .line 20
    invoke-virtual {p4, p3}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 21
    .line 22
    .line 23
    iget-object p4, p1, Lq/J;->H:Lq/M;

    .line 24
    .line 25
    invoke-virtual {p4}, Landroid/widget/AdapterView;->getOnItemClickListener()Landroid/widget/AdapterView$OnItemClickListener;

    .line 26
    .line 27
    .line 28
    move-result-object p5

    .line 29
    if-eqz p5, :cond_0

    .line 30
    .line 31
    iget-object p5, p1, Lq/J;->E:Lq/H;

    .line 32
    .line 33
    invoke-virtual {p5, p3}, Lq/H;->getItemId(I)J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    invoke-virtual {p4, p2, p3, v0, v1}, Landroid/widget/AdapterView;->performItemClick(Landroid/view/View;IJ)Z

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-virtual {p1}, Lq/F0;->dismiss()V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :pswitch_1
    const/4 p1, 0x0

    .line 45
    iget-object v0, p0, Lf8/r;->b:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Lf8/t;

    .line 48
    .line 49
    if-gez p3, :cond_2

    .line 50
    .line 51
    iget-object v1, v0, Lf8/t;->e:Lq/F0;

    .line 52
    .line 53
    iget-object v2, v1, Lq/F0;->z:Lq/w;

    .line 54
    .line 55
    invoke-virtual {v2}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-nez v2, :cond_1

    .line 60
    .line 61
    move-object v1, p1

    .line 62
    goto :goto_0

    .line 63
    :cond_1
    iget-object v1, v1, Lq/F0;->c:Lq/t0;

    .line 64
    .line 65
    invoke-virtual {v1}, Landroid/widget/AdapterView;->getSelectedItem()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    goto :goto_0

    .line 70
    :cond_2
    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->getAdapter()Landroid/widget/ListAdapter;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-interface {v1, p3}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    :goto_0
    invoke-static {v0, v1}, Lf8/t;->a(Lf8/t;Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->getOnItemClickListener()Landroid/widget/AdapterView$OnItemClickListener;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    iget-object v0, v0, Lf8/t;->e:Lq/F0;

    .line 86
    .line 87
    if-eqz v2, :cond_8

    .line 88
    .line 89
    if-eqz p2, :cond_4

    .line 90
    .line 91
    if-gez p3, :cond_3

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_3
    :goto_1
    move-object v4, p2

    .line 95
    move v5, p3

    .line 96
    move-wide v6, p4

    .line 97
    goto :goto_7

    .line 98
    :cond_4
    :goto_2
    iget-object p2, v0, Lq/F0;->z:Lq/w;

    .line 99
    .line 100
    invoke-virtual {p2}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 101
    .line 102
    .line 103
    move-result p2

    .line 104
    if-nez p2, :cond_5

    .line 105
    .line 106
    :goto_3
    move-object p2, p1

    .line 107
    goto :goto_4

    .line 108
    :cond_5
    iget-object p1, v0, Lq/F0;->c:Lq/t0;

    .line 109
    .line 110
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getSelectedView()Landroid/view/View;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    goto :goto_3

    .line 115
    :goto_4
    iget-object p1, v0, Lq/F0;->z:Lq/w;

    .line 116
    .line 117
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    if-nez p1, :cond_6

    .line 122
    .line 123
    const/4 p1, -0x1

    .line 124
    :goto_5
    move p3, p1

    .line 125
    goto :goto_6

    .line 126
    :cond_6
    iget-object p1, v0, Lq/F0;->c:Lq/t0;

    .line 127
    .line 128
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    goto :goto_5

    .line 133
    :goto_6
    iget-object p1, v0, Lq/F0;->z:Lq/w;

    .line 134
    .line 135
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 136
    .line 137
    .line 138
    move-result p1

    .line 139
    if-nez p1, :cond_7

    .line 140
    .line 141
    const-wide/high16 p4, -0x8000000000000000L

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_7
    iget-object p1, v0, Lq/F0;->c:Lq/t0;

    .line 145
    .line 146
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getSelectedItemId()J

    .line 147
    .line 148
    .line 149
    move-result-wide p4

    .line 150
    goto :goto_1

    .line 151
    :goto_7
    iget-object v3, v0, Lq/F0;->c:Lq/t0;

    .line 152
    .line 153
    invoke-interface/range {v2 .. v7}, Landroid/widget/AdapterView$OnItemClickListener;->onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    .line 154
    .line 155
    .line 156
    :cond_8
    invoke-virtual {v0}, Lq/F0;->dismiss()V

    .line 157
    .line 158
    .line 159
    return-void

    .line 160
    nop

    .line 161
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
