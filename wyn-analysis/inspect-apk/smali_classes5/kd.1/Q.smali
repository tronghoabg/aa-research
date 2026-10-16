.class public final synthetic Lkd/Q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lkd/T;

.field public final synthetic c:Landroid/webkit/WebView;

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lkd/T;Landroid/webkit/WebView;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p4, p0, Lkd/Q;->a:I

    iput-object p1, p0, Lkd/Q;->b:Lkd/T;

    iput-object p2, p0, Lkd/Q;->c:Landroid/webkit/WebView;

    iput-object p3, p0, Lkd/Q;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Lkd/Q;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/moloco/sdk/internal/publisher/d;

    .line 7
    .line 8
    const/16 v1, 0x18

    .line 9
    .line 10
    invoke-direct {v0, v1}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lkd/Q;->b:Lkd/T;

    .line 14
    .line 15
    iget-object v2, v1, Lkd/T;->a:Lkd/r;

    .line 16
    .line 17
    iget-object v3, p0, Lkd/Q;->c:Landroid/webkit/WebView;

    .line 18
    .line 19
    iget-object v4, p0, Lkd/Q;->d:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v2, v1, v3, v4, v0}, Lkd/r;->f(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Ljava/lang/String;Ltf/l;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_0
    new-instance v0, Lcom/moloco/sdk/internal/publisher/d;

    .line 26
    .line 27
    const/16 v1, 0x18

    .line 28
    .line 29
    invoke-direct {v0, v1}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Lkd/Q;->b:Lkd/T;

    .line 33
    .line 34
    iget-object v2, v1, Lkd/T;->a:Lkd/r;

    .line 35
    .line 36
    iget-object v3, p0, Lkd/Q;->c:Landroid/webkit/WebView;

    .line 37
    .line 38
    iget-object v4, p0, Lkd/Q;->d:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v2, v1, v3, v4, v0}, Lkd/r;->e(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Ljava/lang/String;Ltf/l;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :pswitch_1
    new-instance v0, Lcom/moloco/sdk/internal/publisher/d;

    .line 45
    .line 46
    const/16 v1, 0x18

    .line 47
    .line 48
    invoke-direct {v0, v1}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, Lkd/Q;->b:Lkd/T;

    .line 52
    .line 53
    iget-object v2, v1, Lkd/T;->a:Lkd/r;

    .line 54
    .line 55
    iget-object v3, p0, Lkd/Q;->c:Landroid/webkit/WebView;

    .line 56
    .line 57
    iget-object v4, p0, Lkd/Q;->d:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {v2, v1, v3, v4, v0}, Lkd/r;->c(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Ljava/lang/String;Ltf/l;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :pswitch_2
    new-instance v0, Lcom/moloco/sdk/internal/publisher/d;

    .line 64
    .line 65
    const/16 v1, 0x18

    .line 66
    .line 67
    invoke-direct {v0, v1}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 68
    .line 69
    .line 70
    iget-object v1, p0, Lkd/Q;->b:Lkd/T;

    .line 71
    .line 72
    iget-object v2, v1, Lkd/T;->a:Lkd/r;

    .line 73
    .line 74
    iget-object v3, p0, Lkd/Q;->c:Landroid/webkit/WebView;

    .line 75
    .line 76
    iget-object v4, p0, Lkd/Q;->d:Ljava/lang/String;

    .line 77
    .line 78
    invoke-virtual {v2, v1, v3, v4, v0}, Lkd/r;->d(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Ljava/lang/String;Ltf/l;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :pswitch_3
    new-instance v0, Lcom/moloco/sdk/internal/publisher/d;

    .line 83
    .line 84
    const/16 v1, 0x18

    .line 85
    .line 86
    invoke-direct {v0, v1}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 87
    .line 88
    .line 89
    iget-object v1, p0, Lkd/Q;->b:Lkd/T;

    .line 90
    .line 91
    iget-object v2, v1, Lkd/T;->a:Lkd/r;

    .line 92
    .line 93
    iget-object v3, p0, Lkd/Q;->c:Landroid/webkit/WebView;

    .line 94
    .line 95
    iget-object v4, p0, Lkd/Q;->d:Ljava/lang/String;

    .line 96
    .line 97
    invoke-virtual {v2, v1, v3, v4, v0}, Lkd/r;->o(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Ljava/lang/String;Ltf/l;)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
