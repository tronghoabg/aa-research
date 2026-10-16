.class public final Lf5/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/speech/RecognitionSupportCallback;


# instance fields
.field public final synthetic a:LWa/h;

.field public final synthetic b:Lf5/h;

.field public final synthetic c:Lkotlin/jvm/internal/G;


# direct methods
.method public constructor <init>(LWa/h;Lf5/h;Lkotlin/jvm/internal/G;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lf5/f;->a:LWa/h;

    .line 5
    .line 6
    iput-object p2, p0, Lf5/f;->b:Lf5/h;

    .line 7
    .line 8
    iput-object p3, p0, Lf5/f;->c:Lkotlin/jvm/internal/G;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onError(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lf5/f;->b:Lf5/h;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "error from checkRecognitionSupport: "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {v0, p1}, Lf5/h;->c(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lf5/f;->c:Lkotlin/jvm/internal/G;

    .line 21
    .line 22
    iget-object p1, p1, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p1, Landroid/speech/SpeechRecognizer;

    .line 25
    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/speech/SpeechRecognizer;->destroy()V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method public final onSupportResult(Landroid/speech/RecognitionSupport;)V
    .locals 3

    .line 1
    const-string v0, "recognitionSupport"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lf5/a;

    .line 7
    .line 8
    iget-object v1, p0, Lf5/f;->a:LWa/h;

    .line 9
    .line 10
    iget-object v2, p0, Lf5/f;->b:Lf5/h;

    .line 11
    .line 12
    iget-boolean v2, v2, Lf5/h;->i:Z

    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, Lf5/a;-><init>(LWa/h;Z)V

    .line 15
    .line 16
    .line 17
    invoke-static {p1}, Lea/T;->o(Landroid/speech/RecognitionSupport;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {v0, p1}, Lf5/a;->b(Ljava/util/List;)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lf5/f;->c:Lkotlin/jvm/internal/G;

    .line 25
    .line 26
    iget-object p1, p1, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p1, Landroid/speech/SpeechRecognizer;

    .line 29
    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    invoke-virtual {p1}, Landroid/speech/SpeechRecognizer;->destroy()V

    .line 33
    .line 34
    .line 35
    :cond_0
    return-void
.end method
