.class public final Llb/e;
.super Landroid/speech/tts/UtteranceProgressListener;
.source "SourceFile"


# instance fields
.field public final synthetic a:Llb/f;


# direct methods
.method public constructor <init>(Llb/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Llb/e;->a:Llb/f;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/speech/tts/UtteranceProgressListener;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(IILjava/lang/String;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, "STF_"

    .line 3
    .line 4
    invoke-static {p3, v1, v0}, LBf/r;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Llb/e;->a:Llb/f;

    .line 11
    .line 12
    iget-object v1, v0, Llb/f;->l:Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-virtual {v1, p3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p3

    .line 18
    check-cast p3, Ljava/lang/String;

    .line 19
    .line 20
    const-string v1, "text"

    .line 21
    .line 22
    invoke-static {v1, p3}, Lcb/a;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/util/HashMap;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const-string v2, "start"

    .line 27
    .line 28
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    const-string v2, "end"

    .line 36
    .line 37
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    invoke-static {p3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p3, p1, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const-string p2, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    .line 52
    .line 53
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const-string p2, "word"

    .line 57
    .line 58
    invoke-virtual {v1, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    const-string p1, "speak.onProgress"

    .line 62
    .line 63
    invoke-static {v0, p1, v1}, Llb/f;->a(Llb/f;Ljava/lang/String;Ljava/io/Serializable;)V

    .line 64
    .line 65
    .line 66
    :cond_0
    return-void
.end method

.method public final onDone(Ljava/lang/String;)V
    .locals 5

    .line 1
    const-string v0, "utteranceId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "SIL_"

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-static {p1, v0, v1}, LBf/r;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    const-string v0, "STF_"

    .line 17
    .line 18
    invoke-static {p1, v0, v1}, LBf/r;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Llb/e;->a:Llb/f;

    .line 23
    .line 24
    if-eqz v0, :cond_3

    .line 25
    .line 26
    iget-object v0, v2, Llb/f;->v:Landroid/os/ParcelFileDescriptor;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->close()V

    .line 31
    .line 32
    .line 33
    :cond_1
    iget-boolean v0, v2, Llb/f;->g:Z

    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    iput-boolean v1, v2, Llb/f;->h:Z

    .line 38
    .line 39
    iget-object v0, v2, Llb/f;->a:Landroid/os/Handler;

    .line 40
    .line 41
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    new-instance v3, Llb/a;

    .line 45
    .line 46
    const/4 v4, 0x1

    .line 47
    invoke-direct {v3, v2, v4}, Llb/a;-><init>(Llb/f;I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 51
    .line 52
    .line 53
    :cond_2
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 54
    .line 55
    const-string v3, "synth.onComplete"

    .line 56
    .line 57
    invoke-static {v2, v3, v0}, Llb/f;->a(Llb/f;Ljava/lang/String;Ljava/io/Serializable;)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    iget-boolean v0, v2, Llb/f;->e:Z

    .line 62
    .line 63
    if-eqz v0, :cond_4

    .line 64
    .line 65
    iget v0, v2, Llb/f;->s:I

    .line 66
    .line 67
    if-nez v0, :cond_4

    .line 68
    .line 69
    iput-boolean v1, v2, Llb/f;->f:Z

    .line 70
    .line 71
    iget-object v0, v2, Llb/f;->a:Landroid/os/Handler;

    .line 72
    .line 73
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    new-instance v3, Llb/a;

    .line 77
    .line 78
    const/4 v4, 0x0

    .line 79
    invoke-direct {v3, v2, v4}, Llb/a;-><init>(Llb/f;I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 83
    .line 84
    .line 85
    :cond_4
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 86
    .line 87
    const-string v3, "speak.onComplete"

    .line 88
    .line 89
    invoke-static {v2, v3, v0}, Llb/f;->a(Llb/f;Ljava/lang/String;Ljava/io/Serializable;)V

    .line 90
    .line 91
    .line 92
    :goto_0
    iput v1, v2, Llb/f;->o:I

    .line 93
    .line 94
    const/4 v0, 0x0

    .line 95
    iput-object v0, v2, Llb/f;->q:Ljava/lang/String;

    .line 96
    .line 97
    iget-object v0, v2, Llb/f;->l:Ljava/util/HashMap;

    .line 98
    .line 99
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    invoke-static {v2}, Llb/f;->b(Llb/f;)V

    .line 103
    .line 104
    .line 105
    return-void
.end method

.method public final onError(Ljava/lang/String;)V
    .locals 3

    const-string v0, "utteranceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    const-string v0, "STF_"

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, LBf/r;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p1

    .line 2
    iget-object v0, p0, Llb/e;->a:Llb/f;

    if-eqz p1, :cond_2

    .line 3
    iget-object p1, v0, Llb/f;->v:Landroid/os/ParcelFileDescriptor;

    if-eqz p1, :cond_0

    .line 4
    const-string v2, "Error synthesizing TTS to file"

    invoke-virtual {p1, v2}, Landroid/os/ParcelFileDescriptor;->closeWithError(Ljava/lang/String;)V

    .line 5
    :cond_0
    iget-boolean p1, v0, Llb/f;->g:Z

    if-eqz p1, :cond_1

    .line 6
    iput-boolean v1, v0, Llb/f;->h:Z

    .line 7
    :cond_1
    const-string p1, "synth.onError"

    const-string v1, "Error from TextToSpeech (synth)"

    invoke-static {v0, p1, v1}, Llb/f;->a(Llb/f;Ljava/lang/String;Ljava/io/Serializable;)V

    goto :goto_0

    .line 8
    :cond_2
    iget-boolean p1, v0, Llb/f;->e:Z

    if-eqz p1, :cond_3

    .line 9
    iput-boolean v1, v0, Llb/f;->f:Z

    .line 10
    :cond_3
    const-string p1, "speak.onError"

    const-string v1, "Error from TextToSpeech (speak)"

    invoke-static {v0, p1, v1}, Llb/f;->a(Llb/f;Ljava/lang/String;Ljava/io/Serializable;)V

    .line 11
    :goto_0
    invoke-static {v0}, Llb/f;->b(Llb/f;)V

    return-void
.end method

.method public final onError(Ljava/lang/String;I)V
    .locals 3

    const-string v0, "utteranceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    const-string v0, "STF_"

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, LBf/r;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p1

    .line 13
    iget-object v0, p0, Llb/e;->a:Llb/f;

    if-eqz p1, :cond_2

    .line 14
    iget-object p1, v0, Llb/f;->v:Landroid/os/ParcelFileDescriptor;

    if-eqz p1, :cond_0

    .line 15
    const-string v2, "Error synthesizing TTS to file"

    invoke-virtual {p1, v2}, Landroid/os/ParcelFileDescriptor;->closeWithError(Ljava/lang/String;)V

    .line 16
    :cond_0
    iget-boolean p1, v0, Llb/f;->g:Z

    if-eqz p1, :cond_1

    .line 17
    iput-boolean v1, v0, Llb/f;->h:Z

    .line 18
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "Error from TextToSpeech (synth) - "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "synth.onError"

    invoke-static {v0, p2, p1}, Llb/f;->a(Llb/f;Ljava/lang/String;Ljava/io/Serializable;)V

    return-void

    .line 19
    :cond_2
    iget-boolean p1, v0, Llb/f;->e:Z

    if-eqz p1, :cond_3

    .line 20
    iput-boolean v1, v0, Llb/f;->f:Z

    .line 21
    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "Error from TextToSpeech (speak) - "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "speak.onError"

    invoke-static {v0, p2, p1}, Llb/f;->a(Llb/f;Ljava/lang/String;Ljava/io/Serializable;)V

    return-void
.end method

.method public final onRangeStart(Ljava/lang/String;III)V
    .locals 2

    .line 1
    const-string v0, "utteranceId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    const-string v1, "STF_"

    .line 8
    .line 9
    invoke-static {p1, v1, v0}, LBf/r;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Llb/e;->a:Llb/f;

    .line 16
    .line 17
    iput p2, v0, Llb/f;->o:I

    .line 18
    .line 19
    invoke-super {p0, p1, p2, p3, p4}, Landroid/speech/tts/UtteranceProgressListener;->onRangeStart(Ljava/lang/String;III)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p2, p3, p1}, Llb/e;->a(IILjava/lang/String;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public final onStart(Ljava/lang/String;)V
    .locals 4

    .line 1
    const-string v0, "utteranceId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "STF_"

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-static {p1, v0, v1}, LBf/r;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget-object v2, p0, Llb/e;->a:Llb/f;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 18
    .line 19
    const-string v3, "synth.onStart"

    .line 20
    .line 21
    invoke-static {v2, v3, v0}, Llb/f;->a(Llb/f;Ljava/lang/String;Ljava/io/Serializable;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-boolean v0, v2, Llb/f;->r:Z

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 30
    .line 31
    const-string v3, "speak.onContinue"

    .line 32
    .line 33
    invoke-static {v2, v3, v0}, Llb/f;->a(Llb/f;Ljava/lang/String;Ljava/io/Serializable;)V

    .line 34
    .line 35
    .line 36
    iput-boolean v1, v2, Llb/f;->r:Z

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 40
    .line 41
    const-string v3, "speak.onStart"

    .line 42
    .line 43
    invoke-static {v2, v3, v0}, Llb/f;->a(Llb/f;Ljava/lang/String;Ljava/io/Serializable;)V

    .line 44
    .line 45
    .line 46
    :goto_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 47
    .line 48
    const/16 v3, 0x1a

    .line 49
    .line 50
    if-ge v0, v3, :cond_2

    .line 51
    .line 52
    iget-object v0, v2, Llb/f;->l:Ljava/util/HashMap;

    .line 53
    .line 54
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    check-cast v0, Ljava/lang/String;

    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    invoke-virtual {p0, v1, v0, p1}, Llb/e;->a(IILjava/lang/String;)V

    .line 68
    .line 69
    .line 70
    :cond_2
    return-void
.end method

.method public final onStop(Ljava/lang/String;Z)V
    .locals 1

    .line 1
    const-string p2, "utteranceId"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Llb/e;->a:Llb/f;

    .line 7
    .line 8
    iget-boolean p2, p1, Llb/f;->e:Z

    .line 9
    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    const/4 p2, 0x0

    .line 13
    iput-boolean p2, p1, Llb/f;->f:Z

    .line 14
    .line 15
    :cond_0
    iget-boolean p2, p1, Llb/f;->r:Z

    .line 16
    .line 17
    if-eqz p2, :cond_1

    .line 18
    .line 19
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 20
    .line 21
    const-string v0, "speak.onPause"

    .line 22
    .line 23
    invoke-static {p1, v0, p2}, Llb/f;->a(Llb/f;Ljava/lang/String;Ljava/io/Serializable;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 28
    .line 29
    const-string v0, "speak.onCancel"

    .line 30
    .line 31
    invoke-static {p1, v0, p2}, Llb/f;->a(Llb/f;Ljava/lang/String;Ljava/io/Serializable;)V

    .line 32
    .line 33
    .line 34
    :goto_0
    invoke-static {p1}, Llb/f;->b(Llb/f;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method
