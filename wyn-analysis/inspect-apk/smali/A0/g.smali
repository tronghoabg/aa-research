.class public final LA0/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA0/m;


# virtual methods
.method public a(LA0/n;)Landroid/text/StaticLayout;
    .locals 5
    .param p1    # LA0/n;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "params"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, LA0/n;->c:Landroid/text/TextPaint;

    .line 7
    .line 8
    iget v1, p1, LA0/n;->d:I

    .line 9
    .line 10
    iget-object v2, p1, LA0/n;->a:Ljava/lang/CharSequence;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    iget v4, p1, LA0/n;->b:I

    .line 14
    .line 15
    invoke-static {v2, v3, v4, v0, v1}, Landroid/text/StaticLayout$Builder;->obtain(Ljava/lang/CharSequence;IILandroid/text/TextPaint;I)Landroid/text/StaticLayout$Builder;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v1, p1, LA0/n;->e:Landroid/text/TextDirectionHeuristic;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/text/StaticLayout$Builder;->setTextDirection(Landroid/text/TextDirectionHeuristic;)Landroid/text/StaticLayout$Builder;

    .line 22
    .line 23
    .line 24
    iget-object v1, p1, LA0/n;->f:Landroid/text/Layout$Alignment;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroid/text/StaticLayout$Builder;->setAlignment(Landroid/text/Layout$Alignment;)Landroid/text/StaticLayout$Builder;

    .line 27
    .line 28
    .line 29
    iget v1, p1, LA0/n;->g:I

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/text/StaticLayout$Builder;->setMaxLines(I)Landroid/text/StaticLayout$Builder;

    .line 32
    .line 33
    .line 34
    iget-object v1, p1, LA0/n;->h:Landroid/text/TextUtils$TruncateAt;

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Landroid/text/StaticLayout$Builder;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)Landroid/text/StaticLayout$Builder;

    .line 37
    .line 38
    .line 39
    iget v1, p1, LA0/n;->i:I

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Landroid/text/StaticLayout$Builder;->setEllipsizedWidth(I)Landroid/text/StaticLayout$Builder;

    .line 42
    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    const/high16 v2, 0x3f800000    # 1.0f

    .line 46
    .line 47
    invoke-virtual {v0, v1, v2}, Landroid/text/StaticLayout$Builder;->setLineSpacing(FF)Landroid/text/StaticLayout$Builder;

    .line 48
    .line 49
    .line 50
    const/4 v1, 0x1

    .line 51
    invoke-virtual {v0, v1}, Landroid/text/StaticLayout$Builder;->setIncludePad(Z)Landroid/text/StaticLayout$Builder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v3}, Landroid/text/StaticLayout$Builder;->setBreakStrategy(I)Landroid/text/StaticLayout$Builder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v3}, Landroid/text/StaticLayout$Builder;->setHyphenationFrequency(I)Landroid/text/StaticLayout$Builder;

    .line 58
    .line 59
    .line 60
    const/4 v2, 0x0

    .line 61
    invoke-virtual {v0, v2, v2}, Landroid/text/StaticLayout$Builder;->setIndents([I[I)Landroid/text/StaticLayout$Builder;

    .line 62
    .line 63
    .line 64
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 65
    .line 66
    const/16 v3, 0x1a

    .line 67
    .line 68
    if-lt v2, v3, :cond_0

    .line 69
    .line 70
    sget-object v3, LA0/i;->a:LA0/i;

    .line 71
    .line 72
    iget p1, p1, LA0/n;->j:I

    .line 73
    .line 74
    invoke-virtual {v3, v0, p1}, LA0/i;->a(Landroid/text/StaticLayout$Builder;I)V

    .line 75
    .line 76
    .line 77
    :cond_0
    const/16 p1, 0x1c

    .line 78
    .line 79
    if-lt v2, p1, :cond_1

    .line 80
    .line 81
    sget-object p1, LA0/k;->a:LA0/k;

    .line 82
    .line 83
    invoke-virtual {p1, v0, v1}, LA0/k;->a(Landroid/text/StaticLayout$Builder;Z)V

    .line 84
    .line 85
    .line 86
    :cond_1
    invoke-virtual {v0}, Landroid/text/StaticLayout$Builder;->build()Landroid/text/StaticLayout;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    const-string v0, "obtain(params.text, para\u2026  }\n            }.build()"

    .line 91
    .line 92
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    return-object p1
.end method
