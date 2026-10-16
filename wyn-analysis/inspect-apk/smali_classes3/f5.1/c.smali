.class public final synthetic Lf5/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lf5/h;


# direct methods
.method public synthetic constructor <init>(Lf5/h;I)V
    .locals 0

    .line 1
    iput p2, p0, Lf5/c;->a:I

    iput-object p1, p0, Lf5/c;->b:Lf5/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Lf5/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lf5/c;->b:Lf5/h;

    .line 7
    .line 8
    iget-object v0, v0, Lf5/h;->p:Landroid/speech/SpeechRecognizer;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/speech/SpeechRecognizer;->stopListening()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void

    .line 16
    :pswitch_0
    iget-object v0, p0, Lf5/c;->b:Lf5/h;

    .line 17
    .line 18
    iget-object v0, v0, Lf5/h;->p:Landroid/speech/SpeechRecognizer;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/speech/SpeechRecognizer;->cancel()V

    .line 23
    .line 24
    .line 25
    :cond_1
    return-void

    .line 26
    :pswitch_1
    iget-object v0, p0, Lf5/c;->b:Lf5/h;

    .line 27
    .line 28
    iget-object v1, v0, Lf5/h;->p:Landroid/speech/SpeechRecognizer;

    .line 29
    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    iget-object v0, v0, Lf5/h;->q:Landroid/content/Intent;

    .line 33
    .line 34
    invoke-virtual {v1, v0}, Landroid/speech/SpeechRecognizer;->startListening(Landroid/content/Intent;)V

    .line 35
    .line 36
    .line 37
    :cond_2
    return-void

    .line 38
    :pswitch_2
    const-string v0, "Recognizer destroy"

    .line 39
    .line 40
    iget-object v1, p0, Lf5/c;->b:Lf5/h;

    .line 41
    .line 42
    invoke-virtual {v1, v0}, Lf5/h;->c(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iget-object v0, v1, Lf5/h;->p:Landroid/speech/SpeechRecognizer;

    .line 46
    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    invoke-virtual {v0}, Landroid/speech/SpeechRecognizer;->destroy()V

    .line 50
    .line 51
    .line 52
    :cond_3
    const/4 v0, 0x0

    .line 53
    iput-object v0, v1, Lf5/h;->p:Landroid/speech/SpeechRecognizer;

    .line 54
    .line 55
    return-void

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
