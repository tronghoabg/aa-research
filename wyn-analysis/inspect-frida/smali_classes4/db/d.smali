.class public final Ldb/d;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LR8/a;


# direct methods
.method public synthetic constructor <init>(LR8/a;I)V
    .locals 0

    .line 1
    iput p2, p0, Ldb/d;->a:I

    iput-object p1, p0, Ldb/d;->b:LR8/a;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .line 1
    iget-object v0, p0, Ldb/d;->b:LR8/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "intent"

    .line 5
    .line 6
    const-string v3, "context"

    .line 7
    .line 8
    iget v4, p0, Ldb/d;->a:I

    .line 9
    .line 10
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    packed-switch v4, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    const-string p1, "android.media.extra.SCO_AUDIO_STATE"

    .line 20
    .line 21
    const/4 v2, -0x1

    .line 22
    invoke-virtual {p2, p1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const-string v3, "android.media.extra.SCO_AUDIO_PREVIOUS_STATE"

    .line 31
    .line 32
    invoke-virtual {p2, v3, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    const/4 v2, 0x2

    .line 41
    new-array v2, v2, [Ljava/lang/Object;

    .line 42
    .line 43
    aput-object p1, v2, v1

    .line 44
    .line 45
    const/4 p1, 0x1

    .line 46
    aput-object p2, v2, p1

    .line 47
    .line 48
    const-string p1, "onScoAudioStateUpdated"

    .line 49
    .line 50
    invoke-virtual {v0, p1, v2}, LR8/a;->m(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :pswitch_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    const-string p2, "android.media.AUDIO_BECOMING_NOISY"

    .line 59
    .line 60
    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-eqz p1, :cond_0

    .line 65
    .line 66
    new-array p1, v1, [Ljava/lang/Object;

    .line 67
    .line 68
    const-string p2, "onBecomingNoisy"

    .line 69
    .line 70
    invoke-virtual {v0, p2, p1}, LR8/a;->m(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    :cond_0
    return-void

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
