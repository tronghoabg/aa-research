.class public final synthetic LN6/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lsb/a;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lsb/a;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p3, p0, LN6/t;->a:I

    iput-object p1, p0, LN6/t;->b:Lsb/a;

    iput-object p2, p0, LN6/t;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 3

    .line 1
    iget v0, p0, LN6/t;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LN6/t;->b:Lsb/a;

    .line 7
    .line 8
    iget-object v0, v0, Lsb/a;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, LN6/a;

    .line 11
    .line 12
    iget-object v0, v0, LN6/a;->b:Landroid/webkit/WebView;

    .line 13
    .line 14
    iget-object v1, p0, LN6/t;->c:Ljava/lang/String;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-virtual {v0, v1, v2}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    iget-object v0, p0, LN6/t;->b:Lsb/a;

    .line 22
    .line 23
    iget-object v0, v0, Lsb/a;->c:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, LN6/a;

    .line 26
    .line 27
    iget-object v0, v0, LN6/a;->b:Landroid/webkit/WebView;

    .line 28
    .line 29
    iget-object v1, p0, LN6/t;->c:Ljava/lang/String;

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    invoke-virtual {v0, v1, v2}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
