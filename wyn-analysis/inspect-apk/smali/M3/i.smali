.class public final LM3/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final b:I

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Landroid/view/View;I)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LM3/i;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM3/i;->d:Ljava/lang/Object;

    iput-object p2, p0, LM3/i;->c:Ljava/lang/Object;

    iput p3, p0, LM3/i;->b:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, LM3/i;->a:I

    iput-object p1, p0, LM3/i;->d:Ljava/lang/Object;

    iput p2, p0, LM3/i;->b:I

    iput-object p3, p0, LM3/i;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    .line 2
    iput p4, p0, LM3/i;->a:I

    iput-object p1, p0, LM3/i;->c:Ljava/lang/Object;

    iput-object p2, p0, LM3/i;->d:Ljava/lang/Object;

    iput p3, p0, LM3/i;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, LM3/i;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LM3/i;->d:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lu/f;

    .line 9
    .line 10
    iget-object v0, v0, Lu/f;->b:Lu/a;

    .line 11
    .line 12
    iget v1, p0, LM3/i;->b:I

    .line 13
    .line 14
    iget-object v2, p0, LM3/i;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Landroid/os/Bundle;

    .line 17
    .line 18
    invoke-virtual {v0, v1, v2}, Lu/a;->onNavigationEvent(ILandroid/os/Bundle;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    iget-object v0, p0, LM3/i;->d:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Landroid/graphics/Typeface;

    .line 25
    .line 26
    iget v1, p0, LM3/i;->b:I

    .line 27
    .line 28
    iget-object v2, p0, LM3/i;->c:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v2, Landroid/widget/TextView;

    .line 31
    .line 32
    invoke-virtual {v2, v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_1
    new-instance v0, Landroid/content/Intent;

    .line 37
    .line 38
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 39
    .line 40
    .line 41
    const-string v1, "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST"

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const-string v1, "androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION"

    .line 48
    .line 49
    iget-object v2, p0, LM3/i;->c:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v2, Landroid/content/IntentSender$SendIntentException;

    .line 52
    .line 53
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iget-object v1, p0, LM3/i;->d:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v1, Landroidx/activity/f;

    .line 60
    .line 61
    iget v2, p0, LM3/i;->b:I

    .line 62
    .line 63
    const/4 v3, 0x0

    .line 64
    invoke-virtual {v1, v2, v3, v0}, Lg/h;->a(IILandroid/content/Intent;)Z

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :pswitch_2
    iget-object v0, p0, LM3/i;->c:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, LR/e;

    .line 71
    .line 72
    iget-object v0, v0, LR/e;->a:Ljava/lang/Object;

    .line 73
    .line 74
    iget-object v1, p0, LM3/i;->d:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v1, Landroidx/activity/f;

    .line 77
    .line 78
    iget-object v2, v1, Lg/h;->a:Ljava/util/HashMap;

    .line 79
    .line 80
    iget v3, p0, LM3/i;->b:I

    .line 81
    .line 82
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    check-cast v2, Ljava/lang/String;

    .line 91
    .line 92
    if-nez v2, :cond_0

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_0
    iget-object v3, v1, Lg/h;->e:Ljava/util/HashMap;

    .line 96
    .line 97
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    check-cast v3, Lg/f;

    .line 102
    .line 103
    if-eqz v3, :cond_2

    .line 104
    .line 105
    iget-object v3, v3, Lg/f;->a:Lg/b;

    .line 106
    .line 107
    if-nez v3, :cond_1

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_1
    iget-object v1, v1, Lg/h;->d:Ljava/util/ArrayList;

    .line 111
    .line 112
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    if-eqz v1, :cond_3

    .line 117
    .line 118
    invoke-interface {v3, v0}, Lg/b;->onActivityResult(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_2
    :goto_0
    iget-object v3, v1, Lg/h;->g:Landroid/os/Bundle;

    .line 123
    .line 124
    invoke-virtual {v3, v2}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    iget-object v1, v1, Lg/h;->f:Ljava/util/HashMap;

    .line 128
    .line 129
    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    :cond_3
    :goto_1
    return-void

    .line 133
    :pswitch_3
    iget-object v0, p0, LM3/i;->d:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v0, Landroidx/work/impl/foreground/SystemForegroundService;

    .line 136
    .line 137
    iget-object v0, v0, Landroidx/work/impl/foreground/SystemForegroundService;->e:Landroid/app/NotificationManager;

    .line 138
    .line 139
    iget v1, p0, LM3/i;->b:I

    .line 140
    .line 141
    iget-object v2, p0, LM3/i;->c:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v2, Landroid/app/Notification;

    .line 144
    .line 145
    invoke-virtual {v0, v1, v2}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 146
    .line 147
    .line 148
    return-void

    .line 149
    :pswitch_4
    iget-object v0, p0, LM3/i;->d:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 152
    .line 153
    iget-object v1, p0, LM3/i;->c:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v1, Landroid/view/View;

    .line 156
    .line 157
    iget v2, p0, LM3/i;->b:I

    .line 158
    .line 159
    const/4 v3, 0x0

    .line 160
    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->C(Landroid/view/View;IZ)V

    .line 161
    .line 162
    .line 163
    return-void

    .line 164
    :pswitch_5
    iget-object v0, p0, LM3/i;->d:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v0, Landroid/content/Intent;

    .line 167
    .line 168
    iget v1, p0, LM3/i;->b:I

    .line 169
    .line 170
    iget-object v2, p0, LM3/i;->c:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v2, LM3/j;

    .line 173
    .line 174
    invoke-virtual {v2, v0, v1}, LM3/j;->a(Landroid/content/Intent;I)V

    .line 175
    .line 176
    .line 177
    return-void

    .line 178
    nop

    .line 179
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
