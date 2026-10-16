.class Lcom/iab/omid/library/vungle/messagelistener/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx3/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/iab/omid/library/vungle/messagelistener/a;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/iab/omid/library/vungle/messagelistener/a;


# direct methods
.method public constructor <init>(Lcom/iab/omid/library/vungle/messagelistener/a;)V
    .locals 0

    iput-object p1, p0, Lcom/iab/omid/library/vungle/messagelistener/a$a;->a:Lcom/iab/omid/library/vungle/messagelistener/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPostMessage(Landroid/webkit/WebView;Lx3/e;Landroid/net/Uri;ZLx3/a;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/iab/omid/library/vungle/messagelistener/a$a;->a:Lcom/iab/omid/library/vungle/messagelistener/a;

    .line 2
    .line 3
    invoke-virtual {p2}, Lx3/e;->a()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-static {p1, p2}, Lcom/iab/omid/library/vungle/messagelistener/a;->a(Lcom/iab/omid/library/vungle/messagelistener/a;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
