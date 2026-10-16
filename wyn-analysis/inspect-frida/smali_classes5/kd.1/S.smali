.class public final synthetic Lkd/S;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/webkit/WebView;

.field public final synthetic c:F

.field public final synthetic d:F

.field public final synthetic e:Landroid/webkit/WebViewClient;


# direct methods
.method public synthetic constructor <init>(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;FFI)V
    .locals 0

    .line 1
    iput p5, p0, Lkd/S;->a:I

    iput-object p1, p0, Lkd/S;->e:Landroid/webkit/WebViewClient;

    iput-object p2, p0, Lkd/S;->b:Landroid/webkit/WebView;

    iput p3, p0, Lkd/S;->c:F

    iput p4, p0, Lkd/S;->d:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget v0, p0, Lkd/S;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lkd/S;->c:F

    .line 7
    .line 8
    float-to-double v4, v0

    .line 9
    iget v0, p0, Lkd/S;->d:F

    .line 10
    .line 11
    float-to-double v6, v0

    .line 12
    new-instance v8, Lcom/moloco/sdk/internal/publisher/d;

    .line 13
    .line 14
    const/16 v0, 0x19

    .line 15
    .line 16
    invoke-direct {v8, v0}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lkd/S;->e:Landroid/webkit/WebViewClient;

    .line 20
    .line 21
    move-object v2, v0

    .line 22
    check-cast v2, Lkd/W;

    .line 23
    .line 24
    iget-object v1, v2, Lkd/W;->a:Lkd/r;

    .line 25
    .line 26
    iget-object v3, p0, Lkd/S;->b:Landroid/webkit/WebView;

    .line 27
    .line 28
    invoke-virtual/range {v1 .. v8}, Lkd/r;->m(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;DDLtf/l;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :pswitch_0
    iget v0, p0, Lkd/S;->c:F

    .line 33
    .line 34
    float-to-double v4, v0

    .line 35
    iget v0, p0, Lkd/S;->d:F

    .line 36
    .line 37
    float-to-double v6, v0

    .line 38
    new-instance v8, Lcom/moloco/sdk/internal/publisher/d;

    .line 39
    .line 40
    const/16 v0, 0x18

    .line 41
    .line 42
    invoke-direct {v8, v0}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Lkd/S;->e:Landroid/webkit/WebViewClient;

    .line 46
    .line 47
    move-object v2, v0

    .line 48
    check-cast v2, Lkd/T;

    .line 49
    .line 50
    iget-object v1, v2, Lkd/T;->a:Lkd/r;

    .line 51
    .line 52
    iget-object v3, p0, Lkd/S;->b:Landroid/webkit/WebView;

    .line 53
    .line 54
    invoke-virtual/range {v1 .. v8}, Lkd/r;->m(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;DDLtf/l;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
