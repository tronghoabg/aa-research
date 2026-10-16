.class public final synthetic Lf5/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lf5/h;

.field public final synthetic b:Z

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Z


# direct methods
.method public synthetic constructor <init>(Lf5/h;ZLjava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf5/e;->a:Lf5/h;

    iput-boolean p2, p0, Lf5/e;->b:Z

    iput-object p3, p0, Lf5/e;->c:Ljava/lang/String;

    iput-boolean p4, p0, Lf5/e;->d:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    const-string v1, "android.speech.action.RECOGNIZE_SPEECH"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v1, "In RecognizerIntent apply"

    .line 9
    .line 10
    iget-object v2, p0, Lf5/e;->a:Lf5/h;

    .line 11
    .line 12
    invoke-virtual {v2, v1}, Lf5/h;->c(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v1, "android.speech.extra.LANGUAGE_MODEL"

    .line 16
    .line 17
    const-string v3, "free_form"

    .line 18
    .line 19
    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 20
    .line 21
    .line 22
    const-string v1, "put model"

    .line 23
    .line 24
    invoke-virtual {v2, v1}, Lf5/h;->c(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-object v1, v2, Lf5/h;->a:Landroid/content/Context;

    .line 28
    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 36
    .line 37
    const-string v3, "calling_package"

    .line 38
    .line 39
    invoke-virtual {v0, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 40
    .line 41
    .line 42
    :cond_0
    const-string v1, "put package"

    .line 43
    .line 44
    invoke-virtual {v2, v1}, Lf5/h;->c(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const-string v1, "android.speech.extra.PARTIAL_RESULTS"

    .line 48
    .line 49
    iget-boolean v3, p0, Lf5/e;->b:Z

    .line 50
    .line 51
    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 52
    .line 53
    .line 54
    const-string v1, "put partial"

    .line 55
    .line 56
    invoke-virtual {v2, v1}, Lf5/h;->c(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v1}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    iget-object v3, p0, Lf5/e;->c:Ljava/lang/String;

    .line 68
    .line 69
    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-nez v1, :cond_1

    .line 74
    .line 75
    const-string v1, "android.speech.extra.LANGUAGE"

    .line 76
    .line 77
    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 78
    .line 79
    .line 80
    const-string v1, "put languageTag"

    .line 81
    .line 82
    invoke-virtual {v2, v1}, Lf5/h;->c(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    :cond_1
    iget-boolean v1, p0, Lf5/e;->d:Z

    .line 86
    .line 87
    if-eqz v1, :cond_2

    .line 88
    .line 89
    const-string v3, "android.speech.extra.PREFER_OFFLINE"

    .line 90
    .line 91
    invoke-virtual {v0, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 92
    .line 93
    .line 94
    :cond_2
    const-string v1, "android.speech.extra.MAX_RESULTS"

    .line 95
    .line 96
    const/16 v3, 0xa

    .line 97
    .line 98
    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 99
    .line 100
    .line 101
    iput-object v0, v2, Lf5/h;->q:Landroid/content/Intent;

    .line 102
    .line 103
    return-void
.end method
