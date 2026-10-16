.class public final LVa/mb;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:Z

.field public c:Ljava/lang/String;

.field public final synthetic d:LVa/ob;


# direct methods
.method public constructor <init>(LVa/ob;)V
    .locals 0

    .line 1
    iput-object p1, p0, LVa/mb;->d:LVa/ob;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-boolean p1, p0, LVa/mb;->a:Z

    .line 8
    .line 9
    iput-boolean p1, p0, LVa/mb;->b:Z

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    iput-object p1, p0, LVa/mb;->c:Ljava/lang/String;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p2, p0, LVa/mb;->d:LVa/ob;

    .line 2
    .line 3
    invoke-virtual {p2, p1}, LVa/ob;->a(Landroid/webkit/WebView;)V

    .line 4
    .line 5
    .line 6
    const/4 p2, 0x0

    .line 7
    iput-boolean p2, p0, LVa/mb;->a:Z

    .line 8
    .line 9
    const/4 p2, 0x1

    .line 10
    iput-boolean p2, p0, LVa/mb;->b:Z

    .line 11
    .line 12
    iget-object p2, p0, LVa/mb;->c:Ljava/lang/String;

    .line 13
    .line 14
    if-nez p2, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/webkit/WebView;->getOriginalUrl()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, LVa/mb;->c:Ljava/lang/String;

    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public final onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    iget-object p2, p0, LVa/mb;->d:LVa/ob;

    .line 2
    .line 3
    invoke-virtual {p2, p1}, LVa/ob;->a(Landroid/webkit/WebView;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    iput-boolean p1, p0, LVa/mb;->a:Z

    .line 8
    .line 9
    return-void
.end method

.method public final shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z
    .locals 0

    .line 13
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    .line 14
    invoke-virtual {p0, p1, p2}, LVa/mb;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public final shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 5

    .line 1
    iget-object v0, p0, LVa/mb;->d:LVa/ob;

    iget-object v1, v0, LVa/ob;->a:Ljava/lang/String;

    .line 2
    invoke-virtual {p2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {p1}, Landroid/webkit/WebView;->getOriginalUrl()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, LVa/mb;->c:Ljava/lang/String;

    .line 4
    iget-object v1, v0, LVa/ob;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {p2, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p2

    .line 5
    invoke-virtual {v0, p1, v1, p2}, LVa/ob;->d(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;)V

    return v2

    .line 6
    :cond_0
    iget-object v1, p0, LVa/mb;->c:Ljava/lang/String;

    if-nez v1, :cond_1

    .line 7
    invoke-virtual {p1}, Landroid/webkit/WebView;->getOriginalUrl()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, LVa/mb;->c:Ljava/lang/String;

    .line 8
    :cond_1
    iget-boolean v1, p0, LVa/mb;->a:Z

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    iget-boolean v1, p0, LVa/mb;->b:Z

    if-nez v1, :cond_3

    .line 9
    :cond_2
    invoke-virtual {p1}, Landroid/webkit/WebView;->getOriginalUrl()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_4

    iget-object v1, p0, LVa/mb;->c:Ljava/lang/String;

    if-eqz v1, :cond_4

    invoke-virtual {p1}, Landroid/webkit/WebView;->getOriginalUrl()Ljava/lang/String;

    move-result-object v1

    iget-object v4, p0, LVa/mb;->c:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    :cond_3
    move v1, v2

    goto :goto_0

    :cond_4
    move v1, v3

    .line 10
    :goto_0
    invoke-virtual {v0, p1, p2, v1}, LVa/ob;->b(Landroid/webkit/WebView;Ljava/lang/String;Z)V

    .line 11
    iput-boolean v2, p0, LVa/mb;->b:Z

    .line 12
    iput-boolean v3, p0, LVa/mb;->a:Z

    return v3
.end method
