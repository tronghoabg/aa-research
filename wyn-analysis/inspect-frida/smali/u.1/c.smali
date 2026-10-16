.class public final Lu/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Landroid/os/Bundle;

.field public final synthetic d:Lu/f;


# direct methods
.method public synthetic constructor <init>(Lu/f;Ljava/lang/String;Landroid/os/Bundle;I)V
    .locals 0

    .line 1
    iput p4, p0, Lu/c;->a:I

    iput-object p1, p0, Lu/c;->d:Lu/f;

    iput-object p2, p0, Lu/c;->b:Ljava/lang/String;

    iput-object p3, p0, Lu/c;->c:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Lu/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lu/c;->d:Lu/f;

    .line 7
    .line 8
    iget-object v0, v0, Lu/f;->b:Lu/a;

    .line 9
    .line 10
    iget-object v1, p0, Lu/c;->b:Ljava/lang/String;

    .line 11
    .line 12
    iget-object v2, p0, Lu/c;->c:Landroid/os/Bundle;

    .line 13
    .line 14
    invoke-virtual {v0, v1, v2}, Lu/a;->onPostMessage(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    iget-object v0, p0, Lu/c;->d:Lu/f;

    .line 19
    .line 20
    iget-object v0, v0, Lu/f;->b:Lu/a;

    .line 21
    .line 22
    iget-object v1, p0, Lu/c;->b:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v2, p0, Lu/c;->c:Landroid/os/Bundle;

    .line 25
    .line 26
    invoke-virtual {v0, v1, v2}, Lu/a;->extraCallback(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
