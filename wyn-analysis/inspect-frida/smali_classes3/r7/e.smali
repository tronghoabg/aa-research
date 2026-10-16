.class public abstract Lr7/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Ljava/lang/ClassLoader;

.field public static b:Ljava/lang/Thread;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lj$/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static A(Lq/Y;)Li1/c;
    .locals 8

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    new-instance v0, Li1/c;

    .line 8
    .line 9
    invoke-static {p0}, LY0/c;->m(Lq/Y;)Landroid/text/PrecomputedText$Params;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-direct {v0, p0}, Li1/c;-><init>(Landroid/text/PrecomputedText$Params;)V

    .line 14
    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    new-instance v2, Landroid/text/TextPaint;

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-direct {v2, v3}, Landroid/text/TextPaint;-><init>(Landroid/graphics/Paint;)V

    .line 24
    .line 25
    .line 26
    sget-object v3, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_LTR:Landroid/text/TextDirectionHeuristic;

    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/widget/TextView;->getBreakStrategy()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    invoke-virtual {p0}, Landroid/widget/TextView;->getHyphenationFrequency()I

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    invoke-virtual {p0}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    instance-of v6, v6, Landroid/text/method/PasswordTransformationMethod;

    .line 41
    .line 42
    if-eqz v6, :cond_1

    .line 43
    .line 44
    sget-object v3, Landroid/text/TextDirectionHeuristics;->LTR:Landroid/text/TextDirectionHeuristic;

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_1
    const/4 v6, 0x1

    .line 48
    const/4 v7, 0x0

    .line 49
    if-lt v0, v1, :cond_4

    .line 50
    .line 51
    invoke-virtual {p0}, Landroid/widget/TextView;->getInputType()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    and-int/lit8 v0, v0, 0xf

    .line 56
    .line 57
    const/4 v1, 0x3

    .line 58
    if-ne v0, v1, :cond_4

    .line 59
    .line 60
    invoke-virtual {p0}, Landroid/widget/TextView;->getTextLocale()Ljava/util/Locale;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-static {p0}, LY0/a;->d(Ljava/util/Locale;)Landroid/icu/text/DecimalFormatSymbols;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-static {p0}, LY0/c;->c(Landroid/icu/text/DecimalFormatSymbols;)[Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    aget-object p0, p0, v7

    .line 73
    .line 74
    invoke-virtual {p0, v7}, Ljava/lang/String;->codePointAt(I)I

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    invoke-static {p0}, Ljava/lang/Character;->getDirectionality(I)B

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    if-eq p0, v6, :cond_3

    .line 83
    .line 84
    const/4 v0, 0x2

    .line 85
    if-ne p0, v0, :cond_2

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_2
    sget-object v3, Landroid/text/TextDirectionHeuristics;->LTR:Landroid/text/TextDirectionHeuristic;

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_3
    :goto_0
    sget-object v3, Landroid/text/TextDirectionHeuristics;->RTL:Landroid/text/TextDirectionHeuristic;

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-ne v0, v6, :cond_5

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_5
    move v6, v7

    .line 102
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->getTextDirection()I

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    packed-switch p0, :pswitch_data_0

    .line 107
    .line 108
    .line 109
    if-eqz v6, :cond_6

    .line 110
    .line 111
    sget-object v3, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_RTL:Landroid/text/TextDirectionHeuristic;

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :pswitch_0
    sget-object v3, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_RTL:Landroid/text/TextDirectionHeuristic;

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :pswitch_1
    sget-object v3, Landroid/text/TextDirectionHeuristics;->LOCALE:Landroid/text/TextDirectionHeuristic;

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :pswitch_2
    sget-object v3, Landroid/text/TextDirectionHeuristics;->RTL:Landroid/text/TextDirectionHeuristic;

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :pswitch_3
    sget-object v3, Landroid/text/TextDirectionHeuristics;->LTR:Landroid/text/TextDirectionHeuristic;

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :pswitch_4
    sget-object v3, Landroid/text/TextDirectionHeuristics;->ANYRTL_LTR:Landroid/text/TextDirectionHeuristic;

    .line 127
    .line 128
    :cond_6
    :goto_2
    :pswitch_5
    new-instance p0, Li1/c;

    .line 129
    .line 130
    invoke-direct {p0, v2, v3, v4, v5}, Li1/c;-><init>(Landroid/text/TextPaint;Landroid/text/TextDirectionHeuristic;II)V

    .line 131
    .line 132
    .line 133
    return-object p0

    .line 134
    nop

    .line 135
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_5
        :pswitch_0
    .end packed-switch
.end method

.method public static B(Landroid/content/Context;)V
    .locals 4

    .line 1
    invoke-static {p0}, Lff/B;->w(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "proxy_notification_initialized"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    const-string v0, "firebase_messaging_notification_delegation_enabled"

    .line 16
    .line 17
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const/16 v3, 0x80

    .line 32
    .line 33
    invoke-virtual {v2, v1, v3}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    iget-object v2, v1, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 40
    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    invoke-virtual {v2, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_1

    .line 48
    .line 49
    iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 50
    .line 51
    invoke-virtual {v1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 52
    .line 53
    .line 54
    move-result v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 55
    goto :goto_0

    .line 56
    :catch_0
    :cond_1
    const/4 v0, 0x1

    .line 57
    :goto_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 58
    .line 59
    const/16 v2, 0x1d

    .line 60
    .line 61
    if-lt v1, v2, :cond_2

    .line 62
    .line 63
    new-instance v1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 64
    .line 65
    invoke-direct {v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 66
    .line 67
    .line 68
    new-instance v2, LW9/r;

    .line 69
    .line 70
    const/4 v3, 0x0

    .line 71
    invoke-direct {v2, p0, v0, v1, v3}, LW9/r;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2}, LW9/r;->run()V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_2
    const/4 p0, 0x0

    .line 82
    invoke-static {p0}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 83
    .line 84
    .line 85
    :goto_1
    return-void
.end method

.method public static C(Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    .line 1
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "singletonList(...)"

    .line 6
    .line 7
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public static varargs D([Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    .line 1
    const-string v0, "elements"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    array-length v0, p0

    .line 7
    if-lez v0, :cond_0

    .line 8
    .line 9
    invoke-static {p0}, Lff/m;->c0([Ljava/lang/Object;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    sget-object p0, Lff/v;->a:Lff/v;

    .line 15
    .line 16
    return-object p0
.end method

.method public static E(Ljava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-static {p0}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0

    .line 8
    :cond_0
    sget-object p0, Lff/v;->a:Lff/v;

    .line 9
    .line 10
    return-object p0
.end method

.method public static final F(LN/o;LZ/k;)LZ/k;
    .locals 3

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "modifier"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, LZ/k;->v()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_0
    const v0, 0x48ae8da7

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0}, LN/o;->M(I)V

    .line 22
    .line 23
    .line 24
    sget-object v0, LZ/i;->a:LZ/i;

    .line 25
    .line 26
    new-instance v1, LE/k;

    .line 27
    .line 28
    const/4 v2, 0x4

    .line 29
    invoke-direct {v1, p0, v2}, LE/k;-><init>(Ljava/lang/Object;I)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p1, v0, v1}, LZ/k;->p(Ljava/lang/Object;Ltf/p;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, LZ/k;

    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    invoke-virtual {p0, v0}, LN/o;->p(Z)V

    .line 40
    .line 41
    .line 42
    return-object p1
.end method

.method public static varargs G([Ljava/lang/Object;)Ljava/util/ArrayList;
    .locals 3

    .line 1
    const-string v0, "elements"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    array-length v0, p0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance p0, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 16
    .line 17
    new-instance v1, Lff/k;

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-direct {v1, p0, v2}, Lff/k;-><init>([Ljava/lang/Object;Z)V

    .line 21
    .line 22
    .line 23
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 24
    .line 25
    .line 26
    return-object v0
.end method

.method public static H(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;Landroid/widget/TextView;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    iget-object p0, p1, Landroid/view/inputmethod/EditorInfo;->hintText:Ljava/lang/CharSequence;

    .line 4
    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    :goto_0
    instance-of p1, p0, Landroid/view/View;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    invoke-interface {p0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    return-void
.end method

.method public static final I(Ljava/util/List;)Ljava/util/List;
    .locals 2

    .line 1
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :cond_1
    sget-object p0, Lff/v;->a:Lff/v;

    .line 22
    .line 23
    return-object p0
.end method

.method public static final J(Lef/i;Ljava/lang/String;IILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p2, p3, p1}, Lr7/e;->O(IILjava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-interface {p0}, Lef/i;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Ljava/util/ArrayList;

    .line 17
    .line 18
    new-instance p2, LJd/j;

    .line 19
    .line 20
    invoke-direct {p2, p1, p4}, LJd/j;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public static K(Lio/flutter/plugins/firebase/crashlytics/FlutterError;)V
    .locals 7

    .line 1
    invoke-static {}, LN8/c;->a()LN8/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    const-string v2, "Recorded on-demand fatal events: "

    .line 8
    .line 9
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, v0, LN8/c;->a:LR8/s;

    .line 13
    .line 14
    iget-object v2, v0, LR8/s;->c:LS3/s;

    .line 15
    .line 16
    iget-object v3, v2, LS3/s;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 19
    .line 20
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const-string v3, "FirebaseCrashlytics"

    .line 32
    .line 33
    const/4 v4, 0x3

    .line 34
    invoke-static {v3, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    const/4 v6, 0x0

    .line 39
    if-eqz v5, :cond_0

    .line 40
    .line 41
    invoke-static {v3, v1, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 42
    .line 43
    .line 44
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    const-string v5, "Dropped on-demand fatal events: "

    .line 47
    .line 48
    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    iget-object v2, v2, LS3/s;->c:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v2, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 54
    .line 55
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-static {v3, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-eqz v2, :cond_1

    .line 71
    .line 72
    invoke-static {v3, v1, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 73
    .line 74
    .line 75
    :cond_1
    iget-object v1, v0, LR8/s;->p:LS8/f;

    .line 76
    .line 77
    iget-object v1, v1, LS8/f;->a:LS8/c;

    .line 78
    .line 79
    new-instance v2, LR8/p;

    .line 80
    .line 81
    const/4 v3, 0x1

    .line 82
    invoke-direct {v2, v0, p0, v3}, LR8/p;-><init>(LR8/s;Lio/flutter/plugins/firebase/crashlytics/FlutterError;I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1, v2}, LS8/c;->b(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public static L(Landroid/widget/TextView;I)V
    .locals 3

    .line 1
    invoke-static {p1}, Lj1/d;->c(I)V

    .line 2
    .line 3
    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    .line 6
    const/16 v1, 0x1c

    .line 7
    .line 8
    if-lt v0, v1, :cond_0

    .line 9
    .line 10
    invoke-static {p0, p1}, LY0/c;->p(Landroid/widget/TextView;I)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {p0}, Landroid/widget/TextView;->getIncludeFontPadding()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    iget v0, v0, Landroid/graphics/Paint$FontMetricsInt;->top:I

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    iget v0, v0, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 32
    .line 33
    :goto_0
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-le p1, v1, :cond_2

    .line 38
    .line 39
    add-int/2addr p1, v0

    .line 40
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    invoke-virtual {p0, v0, p1, v1, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 53
    .line 54
    .line 55
    :cond_2
    return-void
.end method

.method public static M(Landroid/widget/TextView;I)V
    .locals 3

    .line 1
    invoke-static {p1}, Lj1/d;->c(I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p0}, Landroid/widget/TextView;->getIncludeFontPadding()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    iget v0, v0, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget v0, v0, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 22
    .line 23
    :goto_0
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-le p1, v1, :cond_1

    .line 28
    .line 29
    sub-int/2addr p1, v0

    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    invoke-virtual {p0, v0, v1, v2, p1}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 43
    .line 44
    .line 45
    :cond_1
    return-void
.end method

.method public static N(Luc/f;Lkd/o;)V
    .locals 5

    .line 1
    const-string v0, "binaryMessenger"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-object v0, p1, Lkd/o;->a:LC8/i;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, LC8/i;->q()Luc/n;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance v0, Lkd/b;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    :goto_0
    new-instance v1, LVa/X7;

    .line 23
    .line 24
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getIssuedBy"

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    new-instance v2, Lkd/B;

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    invoke-direct {v2, p1, v4}, Lkd/B;-><init>(Lkd/o;I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v2}, LVa/X7;->n(Luc/b;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    invoke-virtual {v1, v3}, LVa/X7;->n(Luc/b;)V

    .line 43
    .line 44
    .line 45
    :goto_1
    new-instance v1, LVa/X7;

    .line 46
    .line 47
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getIssuedTo"

    .line 48
    .line 49
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    if-eqz p1, :cond_2

    .line 53
    .line 54
    new-instance v2, Lkd/B;

    .line 55
    .line 56
    const/4 v4, 0x1

    .line 57
    invoke-direct {v2, p1, v4}, Lkd/B;-><init>(Lkd/o;I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v2}, LVa/X7;->n(Luc/b;)V

    .line 61
    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_2
    invoke-virtual {v1, v3}, LVa/X7;->n(Luc/b;)V

    .line 65
    .line 66
    .line 67
    :goto_2
    new-instance v1, LVa/X7;

    .line 68
    .line 69
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getValidNotAfterMsSinceEpoch"

    .line 70
    .line 71
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    if-eqz p1, :cond_3

    .line 75
    .line 76
    new-instance v2, Lkd/B;

    .line 77
    .line 78
    const/4 v4, 0x2

    .line 79
    invoke-direct {v2, p1, v4}, Lkd/B;-><init>(Lkd/o;I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, v2}, LVa/X7;->n(Luc/b;)V

    .line 83
    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_3
    invoke-virtual {v1, v3}, LVa/X7;->n(Luc/b;)V

    .line 87
    .line 88
    .line 89
    :goto_3
    new-instance v1, LVa/X7;

    .line 90
    .line 91
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getValidNotBeforeMsSinceEpoch"

    .line 92
    .line 93
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    if-eqz p1, :cond_4

    .line 97
    .line 98
    new-instance v2, Lkd/B;

    .line 99
    .line 100
    const/4 v4, 0x3

    .line 101
    invoke-direct {v2, p1, v4}, Lkd/B;-><init>(Lkd/o;I)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1, v2}, LVa/X7;->n(Luc/b;)V

    .line 105
    .line 106
    .line 107
    goto :goto_4

    .line 108
    :cond_4
    invoke-virtual {v1, v3}, LVa/X7;->n(Luc/b;)V

    .line 109
    .line 110
    .line 111
    :goto_4
    new-instance v1, LVa/X7;

    .line 112
    .line 113
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getX509Certificate"

    .line 114
    .line 115
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    if-eqz p1, :cond_5

    .line 119
    .line 120
    new-instance p0, Lkd/B;

    .line 121
    .line 122
    const/4 v0, 0x4

    .line 123
    invoke-direct {p0, p1, v0}, Lkd/B;-><init>(Lkd/o;I)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v1, p0}, LVa/X7;->n(Luc/b;)V

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :cond_5
    invoke-virtual {v1, v3}, LVa/X7;->n(Luc/b;)V

    .line 131
    .line 132
    .line 133
    return-void
.end method

.method public static final O(IILjava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p2, p0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string p1, "substring(...)"

    .line 6
    .line 7
    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p0}, LBf/k;->V0(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public static P()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/ArithmeticException;

    .line 2
    .line 3
    const-string v1, "Index overflow has happened."

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public static final Q(Lz0/b;LL0/b;LE0/e;)Landroid/text/SpannableString;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "density"

    .line 4
    .line 5
    move-object/from16 v5, p1

    .line 6
    .line 7
    invoke-static {v5, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v1, "fontFamilyResolver"

    .line 11
    .line 12
    move-object/from16 v2, p2

    .line 13
    .line 14
    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    new-instance v2, Landroid/text/SpannableString;

    .line 18
    .line 19
    iget-object v1, v0, Lz0/b;->a:Ljava/lang/String;

    .line 20
    .line 21
    invoke-direct {v2, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 22
    .line 23
    .line 24
    iget-object v8, v0, Lz0/b;->b:Ljava/util/List;

    .line 25
    .line 26
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 27
    .line 28
    .line 29
    move-result v9

    .line 30
    const/4 v10, 0x0

    .line 31
    move v11, v10

    .line 32
    :goto_0
    const/16 v12, 0x21

    .line 33
    .line 34
    if-ge v11, v9, :cond_c

    .line 35
    .line 36
    invoke-interface {v8, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    check-cast v3, Lz0/a;

    .line 41
    .line 42
    iget-object v4, v3, Lz0/a;->a:Ljava/lang/Object;

    .line 43
    .line 44
    move-object v13, v4

    .line 45
    check-cast v13, Lz0/j;

    .line 46
    .line 47
    iget-object v4, v13, Lz0/j;->a:LK0/g;

    .line 48
    .line 49
    invoke-interface {v4}, LK0/g;->a()J

    .line 50
    .line 51
    .line 52
    move-result-wide v6

    .line 53
    iget-object v4, v13, Lz0/j;->a:LK0/g;

    .line 54
    .line 55
    invoke-interface {v4}, LK0/g;->a()J

    .line 56
    .line 57
    .line 58
    move-result-wide v14

    .line 59
    invoke-static {v6, v7, v14, v15}, Le0/q;->b(JJ)Z

    .line 60
    .line 61
    .line 62
    move-result v14

    .line 63
    if-eqz v14, :cond_0

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_0
    sget-wide v14, Le0/q;->i:J

    .line 67
    .line 68
    cmp-long v4, v6, v14

    .line 69
    .line 70
    if-eqz v4, :cond_1

    .line 71
    .line 72
    new-instance v4, LK0/b;

    .line 73
    .line 74
    invoke-direct {v4, v6, v7}, LK0/b;-><init>(J)V

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_1
    sget-object v4, LK0/f;->a:LK0/f;

    .line 79
    .line 80
    :goto_1
    invoke-interface {v4}, LK0/g;->a()J

    .line 81
    .line 82
    .line 83
    move-result-wide v6

    .line 84
    iget v4, v3, Lz0/a;->b:I

    .line 85
    .line 86
    iget v3, v3, Lz0/a;->c:I

    .line 87
    .line 88
    invoke-static {v2, v6, v7, v4, v3}, Lxg/g;->P(Landroid/text/SpannableString;JII)V

    .line 89
    .line 90
    .line 91
    move v7, v3

    .line 92
    move v6, v4

    .line 93
    iget-wide v3, v13, Lz0/j;->b:J

    .line 94
    .line 95
    invoke-static/range {v2 .. v7}, Lxg/g;->Q(Landroid/text/SpannableString;JLL0/b;II)V

    .line 96
    .line 97
    .line 98
    iget-object v3, v13, Lz0/j;->c:LE0/l;

    .line 99
    .line 100
    iget-object v4, v13, Lz0/j;->d:LE0/j;

    .line 101
    .line 102
    if-nez v3, :cond_2

    .line 103
    .line 104
    if-eqz v4, :cond_5

    .line 105
    .line 106
    :cond_2
    if-nez v3, :cond_3

    .line 107
    .line 108
    sget-object v3, LE0/l;->d:LE0/l;

    .line 109
    .line 110
    :cond_3
    if-eqz v4, :cond_4

    .line 111
    .line 112
    iget v4, v4, LE0/j;->a:I

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_4
    move v4, v10

    .line 116
    :goto_2
    new-instance v5, Landroid/text/style/StyleSpan;

    .line 117
    .line 118
    invoke-static {v3, v4}, Ltg/b;->z(LE0/l;I)I

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    invoke-direct {v5, v3}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2, v5, v6, v7, v12}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 126
    .line 127
    .line 128
    :cond_5
    iget-object v3, v13, Lz0/j;->m:LK0/d;

    .line 129
    .line 130
    if-eqz v3, :cond_9

    .line 131
    .line 132
    iget v3, v3, LK0/d;->a:I

    .line 133
    .line 134
    or-int/lit8 v4, v3, 0x1

    .line 135
    .line 136
    const/4 v5, 0x1

    .line 137
    if-ne v4, v3, :cond_6

    .line 138
    .line 139
    move v4, v5

    .line 140
    goto :goto_3

    .line 141
    :cond_6
    move v4, v10

    .line 142
    :goto_3
    if-eqz v4, :cond_7

    .line 143
    .line 144
    new-instance v4, Landroid/text/style/UnderlineSpan;

    .line 145
    .line 146
    invoke-direct {v4}, Landroid/text/style/UnderlineSpan;-><init>()V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v2, v4, v6, v7, v12}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 150
    .line 151
    .line 152
    :cond_7
    or-int/lit8 v4, v3, 0x2

    .line 153
    .line 154
    if-ne v4, v3, :cond_8

    .line 155
    .line 156
    goto :goto_4

    .line 157
    :cond_8
    move v5, v10

    .line 158
    :goto_4
    if-eqz v5, :cond_9

    .line 159
    .line 160
    new-instance v3, Landroid/text/style/StrikethroughSpan;

    .line 161
    .line 162
    invoke-direct {v3}, Landroid/text/style/StrikethroughSpan;-><init>()V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2, v3, v6, v7, v12}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 166
    .line 167
    .line 168
    :cond_9
    iget-object v3, v13, Lz0/j;->j:LK0/h;

    .line 169
    .line 170
    if-eqz v3, :cond_a

    .line 171
    .line 172
    new-instance v4, Landroid/text/style/ScaleXSpan;

    .line 173
    .line 174
    iget v3, v3, LK0/h;->a:F

    .line 175
    .line 176
    invoke-direct {v4, v3}, Landroid/text/style/ScaleXSpan;-><init>(F)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v2, v4, v6, v7, v12}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 180
    .line 181
    .line 182
    :cond_a
    iget-object v3, v13, Lz0/j;->k:LG0/c;

    .line 183
    .line 184
    invoke-static {v2, v3, v6, v7}, Lxg/g;->R(Landroid/text/SpannableString;LG0/c;II)V

    .line 185
    .line 186
    .line 187
    sget-wide v3, Le0/q;->i:J

    .line 188
    .line 189
    iget-wide v12, v13, Lz0/j;->l:J

    .line 190
    .line 191
    cmp-long v3, v12, v3

    .line 192
    .line 193
    if-eqz v3, :cond_b

    .line 194
    .line 195
    new-instance v3, Landroid/text/style/BackgroundColorSpan;

    .line 196
    .line 197
    invoke-static {v12, v13}, Le0/z;->s(J)I

    .line 198
    .line 199
    .line 200
    move-result v4

    .line 201
    invoke-direct {v3, v4}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    .line 202
    .line 203
    .line 204
    invoke-static {v2, v3, v6, v7}, Lxg/g;->S(Landroid/text/Spannable;Ljava/lang/Object;II)V

    .line 205
    .line 206
    .line 207
    :cond_b
    add-int/lit8 v11, v11, 0x1

    .line 208
    .line 209
    move-object/from16 v5, p1

    .line 210
    .line 211
    goto/16 :goto_0

    .line 212
    .line 213
    :cond_c
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 214
    .line 215
    .line 216
    move-result v1

    .line 217
    new-instance v3, Ljava/util/ArrayList;

    .line 218
    .line 219
    iget-object v0, v0, Lz0/b;->d:Ljava/util/List;

    .line 220
    .line 221
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 222
    .line 223
    .line 224
    move-result v4

    .line 225
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 226
    .line 227
    .line 228
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 229
    .line 230
    .line 231
    move-result v4

    .line 232
    move v5, v10

    .line 233
    :goto_5
    if-ge v5, v4, :cond_e

    .line 234
    .line 235
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v6

    .line 239
    move-object v7, v6

    .line 240
    check-cast v7, Lz0/a;

    .line 241
    .line 242
    iget-object v8, v7, Lz0/a;->a:Ljava/lang/Object;

    .line 243
    .line 244
    instance-of v8, v8, Lz0/q;

    .line 245
    .line 246
    if-eqz v8, :cond_d

    .line 247
    .line 248
    iget v8, v7, Lz0/a;->b:I

    .line 249
    .line 250
    iget v7, v7, Lz0/a;->c:I

    .line 251
    .line 252
    invoke-static {v10, v1, v8, v7}, Lz0/c;->b(IIII)Z

    .line 253
    .line 254
    .line 255
    move-result v7

    .line 256
    if-eqz v7, :cond_d

    .line 257
    .line 258
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    :cond_d
    add-int/lit8 v5, v5, 0x1

    .line 262
    .line 263
    goto :goto_5

    .line 264
    :cond_e
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 265
    .line 266
    .line 267
    move-result v0

    .line 268
    :goto_6
    if-ge v10, v0, :cond_f

    .line 269
    .line 270
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    check-cast v1, Lz0/a;

    .line 275
    .line 276
    iget-object v4, v1, Lz0/a;->a:Ljava/lang/Object;

    .line 277
    .line 278
    check-cast v4, Lz0/q;

    .line 279
    .line 280
    const-string v5, "<this>"

    .line 281
    .line 282
    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    new-instance v5, Landroid/text/style/TtsSpan$VerbatimBuilder;

    .line 286
    .line 287
    const/4 v6, 0x0

    .line 288
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 289
    .line 290
    .line 291
    invoke-direct {v5, v6}, Landroid/text/style/TtsSpan$VerbatimBuilder;-><init>(Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v5}, Landroid/text/style/TtsSpan$Builder;->build()Landroid/text/style/TtsSpan;

    .line 295
    .line 296
    .line 297
    move-result-object v4

    .line 298
    const-string v5, "builder.build()"

    .line 299
    .line 300
    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    iget v5, v1, Lz0/a;->b:I

    .line 304
    .line 305
    iget v1, v1, Lz0/a;->c:I

    .line 306
    .line 307
    invoke-virtual {v2, v4, v5, v1, v12}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 308
    .line 309
    .line 310
    add-int/lit8 v10, v10, 0x1

    .line 311
    .line 312
    goto :goto_6

    .line 313
    :cond_f
    return-object v2
.end method

.method public static final R(Ljava/util/ArrayList;)Ljava/util/List;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_0
    invoke-static {p0}, Lff/o;->q0(Ljava/util/List;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_1
    sget-object p0, Lff/v;->a:Lff/v;

    .line 30
    .line 31
    return-object p0
.end method

.method public static final S(Ljava/util/Map;)Ljava/util/Map;
    .locals 2

    .line 1
    invoke-interface {p0}, Ljava/util/Map;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 11
    .line 12
    invoke-direct {v0, p0}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lj$/util/DesugarCollections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_0
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, Ljava/lang/Iterable;

    .line 25
    .line 26
    invoke-static {p0}, Lff/o;->p0(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, Ljava/util/Map$Entry;

    .line 31
    .line 32
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-static {v0, p0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :cond_1
    sget-object p0, Lff/w;->a:Lff/w;

    .line 46
    .line 47
    return-object p0
.end method

.method public static T(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode$Callback;
    .locals 2

    .line 1
    instance-of v0, p0, Ln1/h;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    .line 7
    const/16 v1, 0x1a

    .line 8
    .line 9
    if-lt v0, v1, :cond_0

    .line 10
    .line 11
    check-cast p0, Ln1/h;

    .line 12
    .line 13
    iget-object p0, p0, Ln1/h;->a:Landroid/view/ActionMode$Callback;

    .line 14
    .line 15
    :cond_0
    return-object p0
.end method

.method public static U(Landroid/view/ActionMode$Callback;Landroid/widget/TextView;)Landroid/view/ActionMode$Callback;
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-lt v0, v1, :cond_1

    .line 6
    .line 7
    const/16 v1, 0x1b

    .line 8
    .line 9
    if-gt v0, v1, :cond_1

    .line 10
    .line 11
    instance-of v0, p0, Ln1/h;

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance v0, Ln1/h;

    .line 19
    .line 20
    invoke-direct {v0, p0, p1}, Ln1/h;-><init>(Landroid/view/ActionMode$Callback;Landroid/widget/TextView;)V

    .line 21
    .line 22
    .line 23
    return-object v0

    .line 24
    :cond_1
    :goto_0
    return-object p0
.end method

.method public static V(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/nio/Buffer;->limit()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    div-int/lit8 v1, v0, 0x6

    .line 9
    .line 10
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v2, 0x0

    .line 15
    move v3, v2

    .line 16
    :goto_0
    mul-int/lit8 v4, v1, 0x4

    .line 17
    .line 18
    if-ge v3, v4, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0, v3}, Ljava/nio/ByteBuffer;->get(I)B

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    invoke-virtual {v0, v3, v4}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 25
    .line 26
    .line 27
    add-int/lit8 v3, v3, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    :goto_1
    add-int v3, v1, v1

    .line 31
    .line 32
    if-ge v2, v3, :cond_1

    .line 33
    .line 34
    add-int v3, v4, v2

    .line 35
    .line 36
    rem-int/lit8 v5, v2, 0x2

    .line 37
    .line 38
    mul-int/2addr v5, v1

    .line 39
    add-int/2addr v5, v4

    .line 40
    div-int/lit8 v6, v2, 0x2

    .line 41
    .line 42
    add-int/2addr v6, v5

    .line 43
    invoke-virtual {p0, v6}, Ljava/nio/ByteBuffer;->get(I)B

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    invoke-virtual {v0, v3, v5}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 48
    .line 49
    .line 50
    add-int/lit8 v2, v2, 0x1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    return-object v0
.end method

.method public static W(I)I
    .locals 6

    .line 1
    const/4 v0, 0x6

    .line 2
    const/4 v1, 0x1

    .line 3
    new-array v2, v0, [I

    .line 4
    .line 5
    fill-array-data v2, :array_0

    .line 6
    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    :goto_0
    if-ge v3, v0, :cond_2

    .line 10
    .line 11
    aget v4, v2, v3

    .line 12
    .line 13
    add-int/lit8 v5, v4, -0x1

    .line 14
    .line 15
    if-eqz v4, :cond_1

    .line 16
    .line 17
    if-ne v5, p0, :cond_0

    .line 18
    .line 19
    return v4

    .line 20
    :cond_0
    add-int/2addr v3, v1

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const/4 p0, 0x0

    .line 23
    throw p0

    .line 24
    :cond_2
    return v1

    .line 25
    :array_0
    .array-data 4
        0x1
        0x2
        0x3
        0x4
        0x5
        0x6
    .end array-data
.end method

.method public static X(Landroid/graphics/Bitmap;III)Landroid/graphics/Bitmap;
    .locals 7

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-static {p0, p1, p1, p2, p3}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0

    .line 9
    :cond_0
    new-instance v5, Landroid/graphics/Matrix;

    .line 10
    .line 11
    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    .line 12
    .line 13
    .line 14
    int-to-float p1, p1

    .line 15
    invoke-virtual {v5, p1}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 16
    .line 17
    .line 18
    const/4 v6, 0x1

    .line 19
    const/4 v1, 0x0

    .line 20
    const/4 v2, 0x0

    .line 21
    move-object v0, p0

    .line 22
    move v3, p2

    .line 23
    move v4, p3

    .line 24
    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method public static declared-synchronized Y()Ljava/lang/ClassLoader;
    .locals 13

    .line 1
    const-class v0, Lr7/e;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lr7/e;->a:Ljava/lang/ClassLoader;

    .line 5
    .line 6
    if-nez v1, :cond_8

    .line 7
    .line 8
    const-string v1, "Failed to get thread context classloader "

    .line 9
    .line 10
    sget-object v2, Lr7/e;->b:Ljava/lang/Thread;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    if-nez v2, :cond_7

    .line 14
    .line 15
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v2}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v2}, Ljava/lang/Thread;->getThreadGroup()Ljava/lang/ThreadGroup;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const-string v4, "Failed to enumerate thread/threadgroup "

    .line 28
    .line 29
    if-nez v2, :cond_0

    .line 30
    .line 31
    move-object v2, v3

    .line 32
    goto/16 :goto_8

    .line 33
    .line 34
    :cond_0
    const-class v5, Ljava/lang/Void;

    .line 35
    .line 36
    monitor-enter v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 37
    :try_start_1
    invoke-virtual {v2}, Ljava/lang/ThreadGroup;->activeGroupCount()I

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    new-array v7, v6, [Ljava/lang/ThreadGroup;

    .line 42
    .line 43
    invoke-virtual {v2, v7}, Ljava/lang/ThreadGroup;->enumerate([Ljava/lang/ThreadGroup;)I

    .line 44
    .line 45
    .line 46
    const/4 v8, 0x0

    .line 47
    move v9, v8

    .line 48
    :goto_0
    if-ge v9, v6, :cond_2

    .line 49
    .line 50
    aget-object v10, v7, v9

    .line 51
    .line 52
    const-string v11, "dynamiteLoader"

    .line 53
    .line 54
    invoke-virtual {v10}, Ljava/lang/ThreadGroup;->getName()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v12

    .line 58
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v11

    .line 62
    if-eqz v11, :cond_1

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_1
    add-int/lit8 v9, v9, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :catchall_0
    move-exception v1

    .line 69
    goto/16 :goto_9

    .line 70
    .line 71
    :catch_0
    move-exception v2

    .line 72
    goto :goto_5

    .line 73
    :cond_2
    move-object v10, v3

    .line 74
    :goto_1
    if-nez v10, :cond_3

    .line 75
    .line 76
    new-instance v10, Ljava/lang/ThreadGroup;

    .line 77
    .line 78
    const-string v6, "dynamiteLoader"

    .line 79
    .line 80
    invoke-direct {v10, v2, v6}, Ljava/lang/ThreadGroup;-><init>(Ljava/lang/ThreadGroup;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    :cond_3
    invoke-virtual {v10}, Ljava/lang/ThreadGroup;->activeCount()I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    new-array v6, v2, [Ljava/lang/Thread;

    .line 88
    .line 89
    invoke-virtual {v10, v6}, Ljava/lang/ThreadGroup;->enumerate([Ljava/lang/Thread;)I

    .line 90
    .line 91
    .line 92
    :goto_2
    if-ge v8, v2, :cond_5

    .line 93
    .line 94
    aget-object v7, v6, v8

    .line 95
    .line 96
    const-string v9, "GmsDynamite"

    .line 97
    .line 98
    invoke-virtual {v7}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v11

    .line 102
    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v9
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 106
    if-eqz v9, :cond_4

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_4
    add-int/lit8 v8, v8, 0x1

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_5
    move-object v7, v3

    .line 113
    :goto_3
    if-nez v7, :cond_6

    .line 114
    .line 115
    :try_start_2
    new-instance v2, LWe/k;

    .line 116
    .line 117
    const-string v6, "GmsDynamite"

    .line 118
    .line 119
    invoke-direct {v2, v10, v6}, LWe/k;-><init>(Ljava/lang/ThreadGroup;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 120
    .line 121
    .line 122
    :try_start_3
    invoke-virtual {v2, v3}, Ljava/lang/Thread;->setContextClassLoader(Ljava/lang/ClassLoader;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V
    :try_end_3
    .catch Ljava/lang/SecurityException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 126
    .line 127
    .line 128
    move-object v7, v2

    .line 129
    goto :goto_7

    .line 130
    :catch_1
    move-exception v6

    .line 131
    move-object v7, v2

    .line 132
    goto :goto_6

    .line 133
    :goto_4
    move-object v6, v2

    .line 134
    goto :goto_6

    .line 135
    :catch_2
    move-exception v2

    .line 136
    goto :goto_4

    .line 137
    :goto_5
    move-object v6, v2

    .line 138
    move-object v7, v3

    .line 139
    :goto_6
    :try_start_4
    const-string v2, "DynamiteLoaderV2CL"

    .line 140
    .line 141
    invoke-virtual {v6}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v6

    .line 145
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v8

    .line 149
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 150
    .line 151
    .line 152
    move-result v8

    .line 153
    add-int/lit8 v8, v8, 0x27

    .line 154
    .line 155
    new-instance v9, Ljava/lang/StringBuilder;

    .line 156
    .line 157
    invoke-direct {v9, v8}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    invoke-static {v2, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 171
    .line 172
    .line 173
    :cond_6
    :goto_7
    monitor-exit v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 174
    move-object v2, v7

    .line 175
    :goto_8
    :try_start_5
    sput-object v2, Lr7/e;->b:Ljava/lang/Thread;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 176
    .line 177
    if-nez v2, :cond_7

    .line 178
    .line 179
    goto :goto_b

    .line 180
    :catchall_1
    move-exception v1

    .line 181
    goto :goto_e

    .line 182
    :goto_9
    :try_start_6
    monitor-exit v5
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 183
    :try_start_7
    throw v1

    .line 184
    :cond_7
    monitor-enter v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 185
    :try_start_8
    sget-object v4, Lr7/e;->b:Ljava/lang/Thread;

    .line 186
    .line 187
    invoke-virtual {v4}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    .line 188
    .line 189
    .line 190
    move-result-object v3
    :try_end_8
    .catch Ljava/lang/SecurityException; {:try_start_8 .. :try_end_8} :catch_3
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 191
    goto :goto_a

    .line 192
    :catchall_2
    move-exception v1

    .line 193
    goto :goto_c

    .line 194
    :catch_3
    move-exception v4

    .line 195
    :try_start_9
    const-string v5, "DynamiteLoaderV2CL"

    .line 196
    .line 197
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v4

    .line 201
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v6

    .line 205
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 206
    .line 207
    .line 208
    move-result v6

    .line 209
    add-int/lit8 v6, v6, 0x29

    .line 210
    .line 211
    new-instance v7, Ljava/lang/StringBuilder;

    .line 212
    .line 213
    invoke-direct {v7, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    invoke-static {v5, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 227
    .line 228
    .line 229
    :goto_a
    monitor-exit v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 230
    :goto_b
    :try_start_a
    sput-object v3, Lr7/e;->a:Ljava/lang/ClassLoader;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 231
    .line 232
    goto :goto_d

    .line 233
    :goto_c
    :try_start_b
    monitor-exit v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 234
    :try_start_c
    throw v1

    .line 235
    :cond_8
    :goto_d
    sget-object v1, Lr7/e;->a:Ljava/lang/ClassLoader;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    .line 236
    .line 237
    monitor-exit v0

    .line 238
    return-object v1

    .line 239
    :goto_e
    :try_start_d
    monitor-exit v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    .line 240
    throw v1
.end method

.method public static Z(II[B)[B
    .locals 10

    .line 1
    const/4 v1, 0x1

    .line 2
    const/4 v2, 0x0

    .line 3
    const-class v3, Ljava/lang/Throwable;

    .line 4
    .line 5
    new-instance v4, Landroid/graphics/YuvImage;

    .line 6
    .line 7
    const/16 v6, 0x11

    .line 8
    .line 9
    const/4 v9, 0x0

    .line 10
    move v7, p0

    .line 11
    move v8, p1

    .line 12
    move-object v5, p2

    .line 13
    invoke-direct/range {v4 .. v9}, Landroid/graphics/YuvImage;-><init>([BIII[I)V

    .line 14
    .line 15
    .line 16
    :try_start_0
    new-instance p0, Ljava/io/ByteArrayOutputStream;

    .line 17
    .line 18
    invoke-direct {p0}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 19
    .line 20
    .line 21
    :try_start_1
    new-instance p1, Landroid/graphics/Rect;

    .line 22
    .line 23
    invoke-direct {p1, v2, v2, v7, v8}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 24
    .line 25
    .line 26
    const/16 p2, 0x64

    .line 27
    .line 28
    invoke-virtual {v4, p1, p2, p0}, Landroid/graphics/YuvImage;->compressToJpeg(Landroid/graphics/Rect;ILjava/io/OutputStream;)Z

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 32
    .line 33
    .line 34
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 35
    :try_start_2
    invoke-virtual {p0}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 36
    .line 37
    .line 38
    return-object p1

    .line 39
    :catchall_0
    move-exception v0

    .line 40
    move-object p1, v0

    .line 41
    :try_start_3
    invoke-virtual {p0}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catchall_1
    move-exception v0

    .line 46
    move-object p0, v0

    .line 47
    :try_start_4
    const-string p2, "addSuppressed"

    .line 48
    .line 49
    new-array v0, v1, [Ljava/lang/Class;

    .line 50
    .line 51
    aput-object v3, v0, v2

    .line 52
    .line 53
    invoke-virtual {v3, p2, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    new-array v0, v1, [Ljava/lang/Object;

    .line 58
    .line 59
    aput-object p0, v0, v2

    .line 60
    .line 61
    invoke-virtual {p2, p1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 62
    .line 63
    .line 64
    :catch_0
    :goto_0
    :try_start_5
    throw p1
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1

    .line 65
    :catch_1
    move-exception v0

    .line 66
    move-object p0, v0

    .line 67
    const-string p1, "ImageConvertUtils"

    .line 68
    .line 69
    const-string p2, "Error closing ByteArrayOutputStream"

    .line 70
    .line 71
    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 72
    .line 73
    .line 74
    new-instance p1, Lua/a;

    .line 75
    .line 76
    const-string p2, "Image conversion error from NV21 format"

    .line 77
    .line 78
    invoke-direct {p1, p2, p0}, Lua/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 79
    .line 80
    .line 81
    throw p1
.end method

.method public static final a(Ljava/lang/String;)J
    .locals 3

    .line 1
    if-eqz p0, :cond_6

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const v1, 0x12944

    .line 8
    .line 9
    .line 10
    const/16 v2, 0x8

    .line 11
    .line 12
    if-eq v0, v1, :cond_4

    .line 13
    .line 14
    const v1, 0x3c29bbd

    .line 15
    .line 16
    .line 17
    if-eq v0, v1, :cond_2

    .line 18
    .line 19
    const v1, 0x14b858b8

    .line 20
    .line 21
    .line 22
    if-eq v0, v1, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const-string v0, "LevelPlay"

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-nez p0, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    sget-object p0, LCf/c;->d:LCf/c;

    .line 35
    .line 36
    invoke-static {v2, p0}, LFe/b;->S(ILCf/c;)J

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    return-wide v0

    .line 41
    :cond_2
    const-string v0, "AdMob"

    .line 42
    .line 43
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    if-nez p0, :cond_3

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_3
    sget-object p0, LCf/c;->d:LCf/c;

    .line 51
    .line 52
    invoke-static {v2, p0}, LFe/b;->S(ILCf/c;)J

    .line 53
    .line 54
    .line 55
    move-result-wide v0

    .line 56
    return-wide v0

    .line 57
    :cond_4
    const-string v0, "MAX"

    .line 58
    .line 59
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-nez p0, :cond_5

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_5
    sget-object p0, LCf/c;->d:LCf/c;

    .line 67
    .line 68
    invoke-static {v2, p0}, LFe/b;->S(ILCf/c;)J

    .line 69
    .line 70
    .line 71
    move-result-wide v0

    .line 72
    return-wide v0

    .line 73
    :cond_6
    :goto_0
    sget-object p0, LCf/c;->d:LCf/c;

    .line 74
    .line 75
    const/16 v0, 0x3c

    .line 76
    .line 77
    invoke-static {v0, p0}, LFe/b;->S(ILCf/c;)J

    .line 78
    .line 79
    .line 80
    move-result-wide v0

    .line 81
    return-wide v0
.end method

.method public static final b(JJJLZ/d;LE/F;JLh0/c;Lh0/c;LN/o;I)LV/d;
    .locals 18

    .line 1
    move-object/from16 v0, p12

    .line 2
    .line 3
    move/from16 v1, p13

    .line 4
    .line 5
    const v2, 0x1aae99fd

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v2}, LN/o;->M(I)V

    .line 9
    .line 10
    .line 11
    and-int/lit8 v2, v1, 0x1

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    sget-wide v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/utils/a;->c:J

    .line 16
    .line 17
    move-wide v11, v2

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-wide/from16 v11, p0

    .line 20
    .line 21
    :goto_0
    and-int/lit8 v2, v1, 0x2

    .line 22
    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    move-wide v13, v11

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    move-wide/from16 v13, p2

    .line 28
    .line 29
    :goto_1
    sget-object v15, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/utils/a;->e:LH/d;

    .line 30
    .line 31
    and-int/lit8 v2, v1, 0x8

    .line 32
    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    sget-wide v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/utils/a;->d:J

    .line 36
    .line 37
    move-wide/from16 v16, v2

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_2
    move-wide/from16 v16, p4

    .line 41
    .line 42
    :goto_2
    and-int/lit8 v2, v1, 0x10

    .line 43
    .line 44
    if-eqz v2, :cond_3

    .line 45
    .line 46
    sget-object v2, LZ/a;->a:LZ/d;

    .line 47
    .line 48
    move-object v5, v2

    .line 49
    goto :goto_3

    .line 50
    :cond_3
    move-object/from16 v5, p6

    .line 51
    .line 52
    :goto_3
    and-int/lit8 v2, v1, 0x20

    .line 53
    .line 54
    if-eqz v2, :cond_4

    .line 55
    .line 56
    sget v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/utils/a;->a:F

    .line 57
    .line 58
    new-instance v3, LE/F;

    .line 59
    .line 60
    invoke-direct {v3, v2, v2, v2, v2}, LE/F;-><init>(FFFF)V

    .line 61
    .line 62
    .line 63
    move-object v6, v3

    .line 64
    goto :goto_4

    .line 65
    :cond_4
    move-object/from16 v6, p7

    .line 66
    .line 67
    :goto_4
    and-int/lit8 v2, v1, 0x40

    .line 68
    .line 69
    if-eqz v2, :cond_5

    .line 70
    .line 71
    sget-object v2, LK/g;->a:LN/L0;

    .line 72
    .line 73
    invoke-virtual {v0, v2}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    check-cast v2, LK/e;

    .line 78
    .line 79
    invoke-virtual {v2}, LK/e;->b()J

    .line 80
    .line 81
    .line 82
    move-result-wide v2

    .line 83
    move-wide v9, v2

    .line 84
    goto :goto_5

    .line 85
    :cond_5
    move-wide/from16 v9, p8

    .line 86
    .line 87
    :goto_5
    and-int/lit16 v2, v1, 0x80

    .line 88
    .line 89
    if-eqz v2, :cond_6

    .line 90
    .line 91
    const v2, 0x7f080150

    .line 92
    .line 93
    .line 94
    invoke-static {v2, v0}, Lff/B;->H(ILN/o;)Lh0/c;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    move-object v7, v2

    .line 99
    goto :goto_6

    .line 100
    :cond_6
    move-object/from16 v7, p10

    .line 101
    .line 102
    :goto_6
    and-int/lit16 v1, v1, 0x100

    .line 103
    .line 104
    if-eqz v1, :cond_7

    .line 105
    .line 106
    const v1, 0x7f080151

    .line 107
    .line 108
    .line 109
    invoke-static {v1, v0}, Lff/B;->H(ILN/o;)Lh0/c;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    move-object v8, v1

    .line 114
    goto :goto_7

    .line 115
    :cond_7
    move-object/from16 v8, p11

    .line 116
    .line 117
    :goto_7
    new-instance v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/N;

    .line 118
    .line 119
    invoke-direct/range {v4 .. v17}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/N;-><init>(LZ/d;LE/F;Lh0/c;Lh0/c;JJJLe0/E;J)V

    .line 120
    .line 121
    .line 122
    const v1, -0x208b0666

    .line 123
    .line 124
    .line 125
    invoke-static {v0, v1, v4}, LV/e;->b(LN/o;ILef/e;)LV/d;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    const/4 v2, 0x0

    .line 130
    invoke-virtual {v0, v2}, LN/o;->p(Z)V

    .line 131
    .line 132
    .line 133
    return-object v1
.end method

.method public static final c(LZ/d;LE/F;JLN/o;I)LV/d;
    .locals 2

    .line 1
    const v0, 0x2aad5f00

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4, v0}, LN/o;->M(I)V

    .line 5
    .line 6
    .line 7
    and-int/lit8 v0, p5, 0x1

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object p0, LZ/a;->h:LZ/d;

    .line 12
    .line 13
    :cond_0
    and-int/lit8 v0, p5, 0x2

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    int-to-float p1, v1

    .line 19
    new-instance v0, LE/F;

    .line 20
    .line 21
    invoke-direct {v0, p1, p1, p1, p1}, LE/F;-><init>(FFFF)V

    .line 22
    .line 23
    .line 24
    move-object p1, v0

    .line 25
    :cond_1
    and-int/lit8 p5, p5, 0x4

    .line 26
    .line 27
    if-eqz p5, :cond_2

    .line 28
    .line 29
    sget-object p2, LK/g;->a:LN/L0;

    .line 30
    .line 31
    invoke-virtual {p4, p2}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    check-cast p2, LK/e;

    .line 36
    .line 37
    invoke-virtual {p2}, LK/e;->b()J

    .line 38
    .line 39
    .line 40
    move-result-wide p2

    .line 41
    :cond_2
    new-instance p5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/P;

    .line 42
    .line 43
    invoke-direct {p5, p0, p1, p2, p3}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/P;-><init>(LZ/d;LE/F;J)V

    .line 44
    .line 45
    .line 46
    const p0, 0x753f526e

    .line 47
    .line 48
    .line 49
    invoke-static {p4, p0, p5}, LV/e;->b(LN/o;ILef/e;)LV/d;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-virtual {p4, v1}, LN/o;->p(Z)V

    .line 54
    .line 55
    .line 56
    return-object p0
.end method

.method public static final d(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Li8/l;

    .line 21
    .line 22
    new-instance v2, Landroid/os/Bundle;

    .line 23
    .line 24
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 25
    .line 26
    .line 27
    iget v3, v1, Li8/l;->a:I

    .line 28
    .line 29
    const-string v4, "event_type"

    .line 30
    .line 31
    invoke-virtual {v2, v4, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 32
    .line 33
    .line 34
    const-string v3, "event_timestamp"

    .line 35
    .line 36
    iget-wide v4, v1, Li8/l;->b:J

    .line 37
    .line 38
    invoke-virtual {v2, v3, v4, v5}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    return-object v0
.end method

.method public static final e(LZ/k;Ltf/l;LN/o;I)V
    .locals 12

    .line 1
    const-string v0, "onClick"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const v0, 0x3ddded44

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2, v0}, LN/o;->N(I)LN/o;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p2, p0}, LN/o;->e(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x4

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x2

    .line 21
    :goto_0
    or-int/2addr v0, p3

    .line 22
    const-string v1, "https://cdn-f.adsmoloco.com/moloco-cdn/privacy.html"

    .line 23
    .line 24
    invoke-virtual {p2, v1}, LN/o;->e(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    const/16 v2, 0x20

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    const/16 v2, 0x10

    .line 34
    .line 35
    :goto_1
    or-int/2addr v0, v2

    .line 36
    invoke-virtual {p2, p1}, LN/o;->e(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_2

    .line 41
    .line 42
    const/16 v2, 0x100

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_2
    const/16 v2, 0x80

    .line 46
    .line 47
    :goto_2
    or-int/2addr v0, v2

    .line 48
    and-int/lit16 v0, v0, 0x93

    .line 49
    .line 50
    const/16 v2, 0x92

    .line 51
    .line 52
    if-ne v0, v2, :cond_4

    .line 53
    .line 54
    invoke-virtual {p2}, LN/o;->x()Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-nez v0, :cond_3

    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_3
    invoke-virtual {p2}, LN/o;->I()V

    .line 62
    .line 63
    .line 64
    move-object v7, p2

    .line 65
    goto/16 :goto_4

    .line 66
    .line 67
    :cond_4
    :goto_3
    const v0, -0x15ad76e2

    .line 68
    .line 69
    .line 70
    invoke-virtual {p2, v0}, LN/o;->M(I)V

    .line 71
    .line 72
    .line 73
    const-string v3, "Ad Badge"

    .line 74
    .line 75
    invoke-virtual {p2, v3}, LN/o;->e(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    invoke-virtual {p2}, LN/o;->F()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    sget-object v4, LN/k;->a:LN/P;

    .line 84
    .line 85
    if-nez v0, :cond_5

    .line 86
    .line 87
    if-ne v2, v4, :cond_6

    .line 88
    .line 89
    :cond_5
    new-instance v2, Lcom/moloco/sdk/internal/publisher/d;

    .line 90
    .line 91
    const/16 v0, 0xa

    .line 92
    .line 93
    invoke-direct {v2, v0}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p2, v2}, LN/o;->U(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    :cond_6
    check-cast v2, Ltf/l;

    .line 100
    .line 101
    const/4 v0, 0x0

    .line 102
    invoke-virtual {p2, v0}, LN/o;->p(Z)V

    .line 103
    .line 104
    .line 105
    invoke-static {p0, v0, v2}, LFe/g;->J(LZ/k;ZLtf/l;)LZ/k;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    const/16 v5, 0xc

    .line 110
    .line 111
    int-to-float v7, v5

    .line 112
    sget-object v5, LE/L;->a:LE/x;

    .line 113
    .line 114
    const-string v5, "$this$requiredSize"

    .line 115
    .line 116
    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    new-instance v6, LE/M;

    .line 120
    .line 121
    const/4 v11, 0x0

    .line 122
    move v8, v7

    .line 123
    move v9, v7

    .line 124
    move v10, v7

    .line 125
    invoke-direct/range {v6 .. v11}, LE/M;-><init>(FFFFZ)V

    .line 126
    .line 127
    .line 128
    invoke-interface {v2, v6}, LZ/k;->g(LZ/k;)LZ/k;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    const v5, -0x15ad5c2e

    .line 133
    .line 134
    .line 135
    invoke-virtual {p2, v5}, LN/o;->M(I)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p2, p1}, LN/o;->e(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v5

    .line 142
    invoke-virtual {p2, v1}, LN/o;->e(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    or-int/2addr v1, v5

    .line 147
    invoke-virtual {p2}, LN/o;->F()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v5

    .line 151
    if-nez v1, :cond_7

    .line 152
    .line 153
    if-ne v5, v4, :cond_8

    .line 154
    .line 155
    :cond_7
    new-instance v5, LAf/q;

    .line 156
    .line 157
    const/16 v1, 0x16

    .line 158
    .line 159
    invoke-direct {v5, p1, v1}, LAf/q;-><init>(Ljava/lang/Object;I)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {p2, v5}, LN/o;->U(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    :cond_8
    check-cast v5, Ltf/a;

    .line 166
    .line 167
    invoke-virtual {p2, v0}, LN/o;->p(Z)V

    .line 168
    .line 169
    .line 170
    const/4 v0, 0x7

    .line 171
    const/4 v1, 0x0

    .line 172
    invoke-static {v2, v1, v5, v0}, Lcom/moloco/sdk/internal/publisher/H;->R(LZ/k;Lx0/e;Ltf/a;I)LZ/k;

    .line 173
    .line 174
    .line 175
    move-result-object v4

    .line 176
    const v0, 0x7f080155

    .line 177
    .line 178
    .line 179
    invoke-static {v0, p2}, Lff/B;->H(ILN/o;)Lh0/c;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    sget-wide v5, Le0/q;->i:J

    .line 184
    .line 185
    const/16 v8, 0xc30

    .line 186
    .line 187
    move-object v7, p2

    .line 188
    invoke-static/range {v2 .. v8}, LK/t;->a(Lh0/c;Ljava/lang/String;LZ/k;JLN/o;I)V

    .line 189
    .line 190
    .line 191
    :goto_4
    invoke-virtual {v7}, LN/o;->r()LN/i0;

    .line 192
    .line 193
    .line 194
    move-result-object p2

    .line 195
    if-eqz p2, :cond_9

    .line 196
    .line 197
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/c;

    .line 198
    .line 199
    invoke-direct {v0, p0, p1, p3}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/c;-><init>(LZ/k;Ltf/l;I)V

    .line 200
    .line 201
    .line 202
    iput-object v0, p2, LN/i0;->d:Ltf/p;

    .line 203
    .line 204
    :cond_9
    return-void
.end method

.method public static final f(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/y;LZ/k;JLtf/u;Ltf/c;Ltf/c;Ltf/c;Ltf/u;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/s;Ltf/s;Ltf/t;Ltf/u;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/S;ZLN/o;II)V
    .locals 28

    move-object/from16 v2, p0

    move-wide/from16 v8, p2

    move-object/from16 v10, p8

    move-object/from16 v11, p15

    move/from16 v12, p16

    move/from16 v13, p17

    const-string v0, "adViewModel"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x58bc9466

    .line 1
    invoke-virtual {v11, v0}, LN/o;->N(I)LN/o;

    invoke-virtual {v11, v2}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v12

    and-int/lit8 v4, v13, 0x2

    const/16 v6, 0x20

    if-eqz v4, :cond_1

    or-int/lit8 v0, v0, 0x30

    move-object/from16 v7, p1

    goto :goto_2

    :cond_1
    move-object/from16 v7, p1

    invoke-virtual {v11, v7}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_2

    move v14, v6

    goto :goto_1

    :cond_2
    const/16 v14, 0x10

    :goto_1
    or-int/2addr v0, v14

    :goto_2
    and-int/lit16 v14, v12, 0x180

    const/16 v16, 0x80

    if-nez v14, :cond_4

    invoke-virtual {v11, v8, v9}, LN/o;->d(J)Z

    move-result v14

    if-eqz v14, :cond_3

    const/16 v14, 0x100

    goto :goto_3

    :cond_3
    move/from16 v14, v16

    :goto_3
    or-int/2addr v0, v14

    :cond_4
    move-object/from16 v2, p4

    invoke-virtual {v11, v2}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v14

    const/16 v17, 0x400

    const/16 v18, 0x800

    if-eqz v14, :cond_5

    move/from16 v14, v18

    goto :goto_4

    :cond_5
    move/from16 v14, v17

    :goto_4
    or-int/2addr v0, v14

    and-int/lit16 v14, v12, 0x6000

    if-nez v14, :cond_7

    move-object/from16 v14, p5

    invoke-virtual {v11, v14}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_6

    const/16 v19, 0x4000

    goto :goto_5

    :cond_6
    const/16 v19, 0x2000

    :goto_5
    or-int v0, v0, v19

    goto :goto_6

    :cond_7
    move-object/from16 v14, p5

    :goto_6
    const/high16 v19, 0x30000

    and-int v19, v12, v19

    move-object/from16 v15, p6

    if-nez v19, :cond_9

    invoke-virtual {v11, v15}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_8

    const/high16 v20, 0x20000

    goto :goto_7

    :cond_8
    const/high16 v20, 0x10000

    :goto_7
    or-int v0, v0, v20

    :cond_9
    and-int/lit8 v20, v13, 0x40

    move-object/from16 v1, p7

    if-nez v20, :cond_a

    invoke-virtual {v11, v1}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_a

    const/high16 v21, 0x100000

    goto :goto_8

    :cond_a
    const/high16 v21, 0x80000

    :goto_8
    or-int v0, v0, v21

    const/high16 v21, 0xc00000

    and-int v21, v12, v21

    if-nez v21, :cond_c

    invoke-virtual {v11, v10}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_b

    const/high16 v21, 0x800000

    goto :goto_9

    :cond_b
    const/high16 v21, 0x400000

    :goto_9
    or-int v0, v0, v21

    :cond_c
    move-object/from16 v1, p9

    invoke-virtual {v11, v1}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_d

    const/high16 v21, 0x4000000

    goto :goto_a

    :cond_d
    const/high16 v21, 0x2000000

    :goto_a
    or-int v0, v0, v21

    const/high16 v21, 0x30000000

    and-int v21, v12, v21

    move-object/from16 v3, p10

    if-nez v21, :cond_f

    invoke-virtual {v11, v3}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_e

    const/high16 v22, 0x20000000

    goto :goto_b

    :cond_e
    const/high16 v22, 0x10000000

    :goto_b
    or-int v0, v0, v22

    :cond_f
    and-int/lit16 v5, v13, 0x400

    if-nez v5, :cond_10

    move-object/from16 v5, p11

    invoke-virtual {v11, v5}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_11

    const/16 v20, 0x4

    :goto_c
    move-object/from16 v5, p12

    goto :goto_d

    :cond_10
    move-object/from16 v5, p11

    :cond_11
    const/16 v20, 0x2

    goto :goto_c

    :goto_d
    invoke-virtual {v11, v5}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_12

    goto :goto_e

    :cond_12
    const/16 v6, 0x10

    :goto_e
    or-int v6, v20, v6

    move/from16 v20, v0

    move-object/from16 v0, p13

    invoke-virtual {v11, v0}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_13

    const/16 v16, 0x100

    :cond_13
    or-int v6, v6, v16

    and-int/lit16 v0, v13, 0x2000

    if-eqz v0, :cond_14

    or-int/lit16 v6, v6, 0xc00

    move/from16 v16, v0

    move/from16 v0, p14

    goto :goto_f

    :cond_14
    move/from16 v16, v0

    move/from16 v0, p14

    invoke-virtual {v11, v0}, LN/o;->f(Z)Z

    move-result v19

    if-eqz v19, :cond_15

    move/from16 v17, v18

    :cond_15
    or-int v6, v6, v17

    :goto_f
    const v17, 0x12492493

    and-int v0, v20, v17

    const v1, 0x12492492

    if-ne v0, v1, :cond_17

    and-int/lit16 v0, v6, 0x493

    const/16 v1, 0x492

    if-ne v0, v1, :cond_17

    invoke-virtual {v11}, LN/o;->x()Z

    move-result v0

    if-nez v0, :cond_16

    goto :goto_10

    .line 2
    :cond_16
    invoke-virtual {v11}, LN/o;->I()V

    move-object/from16 v8, p7

    move-object/from16 v12, p11

    move/from16 v15, p14

    move-object v2, v7

    move-object v14, v11

    goto/16 :goto_20

    .line 3
    :cond_17
    :goto_10
    invoke-virtual {v11}, LN/o;->K()V

    and-int/lit8 v0, v12, 0x1

    sget-object v1, LZ/i;->a:LZ/i;

    const v6, -0x380001

    if-eqz v0, :cond_1a

    invoke-virtual {v11}, LN/o;->w()Z

    move-result v0

    if-eqz v0, :cond_18

    goto :goto_13

    .line 4
    :cond_18
    invoke-virtual {v11}, LN/o;->I()V

    and-int/lit8 v0, v13, 0x40

    if-eqz v0, :cond_19

    and-int v0, v20, v6

    goto :goto_11

    :cond_19
    move/from16 v0, v20

    :goto_11
    move-object/from16 v18, p7

    move-object/from16 v4, p11

    move/from16 v19, p14

    move/from16 v20, v0

    :goto_12
    move-object/from16 v16, v7

    goto :goto_16

    :cond_1a
    :goto_13
    if-eqz v4, :cond_1b

    move-object v7, v1

    :cond_1b
    and-int/lit8 v0, v13, 0x40

    if-eqz v0, :cond_1c

    and-int v0, v20, v6

    move/from16 v20, v0

    move-object v0, v15

    goto :goto_14

    :cond_1c
    move-object/from16 v0, p7

    :goto_14
    and-int/lit16 v4, v13, 0x400

    if-eqz v4, :cond_1d

    const/4 v4, 0x0

    const/4 v6, 0x3

    .line 5
    invoke-static {v4, v4, v11, v6}, Lka/e0;->c(LZ/d;LE/F;LN/o;I)LV/d;

    move-result-object v4

    goto :goto_15

    :cond_1d
    move-object/from16 v4, p11

    :goto_15
    if-eqz v16, :cond_1e

    move-object/from16 v18, v0

    move-object/from16 v16, v7

    const/16 v19, 0x1

    goto :goto_16

    :cond_1e
    move/from16 v19, p14

    move-object/from16 v18, v0

    goto :goto_12

    .line 6
    :goto_16
    invoke-virtual {v11}, LN/o;->q()V

    .line 7
    invoke-static/range {v16 .. v16}, LE/L;->a(LZ/k;)LZ/k;

    move-result-object v0

    .line 8
    sget-object v6, Le0/z;->a:Lad/I;

    .line 9
    invoke-static {v0, v8, v9, v6}, LU8/v0;->l(LZ/k;JLe0/E;)LZ/k;

    move-result-object v0

    const v6, 0x2bb5b5d7

    .line 10
    invoke-virtual {v11, v6}, LN/o;->M(I)V

    .line 11
    sget-object v6, LZ/a;->a:LZ/d;

    const/4 v7, 0x0

    .line 12
    invoke-static {v6, v7, v11}, LE/p;->c(LZ/d;ZLN/o;)Lr0/n;

    move-result-object v6

    const v10, -0x4ee9b9da

    .line 13
    invoke-virtual {v11, v10}, LN/o;->M(I)V

    .line 14
    sget-object v10, Lu0/M;->e:LN/L0;

    .line 15
    invoke-virtual {v11, v10}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    move-result-object v10

    .line 16
    check-cast v10, LL0/b;

    .line 17
    sget-object v7, Lu0/M;->k:LN/L0;

    .line 18
    invoke-virtual {v11, v7}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    move-result-object v7

    .line 19
    check-cast v7, LL0/i;

    move-object/from16 p7, v0

    .line 20
    sget-object v0, Lu0/M;->o:LN/L0;

    .line 21
    invoke-virtual {v11, v0}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    move-result-object v0

    .line 22
    check-cast v0, Lu0/p0;

    .line 23
    sget-object v22, Lt0/c;->g9:Lt0/b;

    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v22, v1

    .line 24
    sget-object v1, Lt0/b;->b:Lt0/d;

    .line 25
    invoke-static/range {p7 .. p7}, LS3/f;->y(LZ/k;)LV/d;

    move-result-object v2

    .line 26
    invoke-virtual {v11}, LN/o;->O()V

    .line 27
    iget-boolean v3, v11, LN/o;->O:Z

    if-eqz v3, :cond_1f

    .line 28
    invoke-virtual {v11, v1}, LN/o;->k(Ltf/a;)V

    :goto_17
    const/4 v1, 0x0

    goto :goto_18

    .line 29
    :cond_1f
    invoke-virtual {v11}, LN/o;->X()V

    goto :goto_17

    .line 30
    :goto_18
    iput-boolean v1, v11, LN/o;->x:Z

    .line 31
    sget-object v1, Lt0/b;->e:Lt0/a;

    .line 32
    invoke-static {v11, v6, v1}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 33
    sget-object v1, Lt0/b;->d:Lt0/a;

    .line 34
    invoke-static {v11, v10, v1}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 35
    sget-object v1, Lt0/b;->f:Lt0/a;

    .line 36
    invoke-static {v11, v7, v1}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 37
    sget-object v1, Lt0/b;->g:Lt0/a;

    .line 38
    invoke-static {v11, v0, v1, v11}, Lwg/b;->b(LN/o;Lu0/p0;Lt0/a;LN/o;)LN/u0;

    move-result-object v0

    const v1, 0x7ab4aae9

    const/4 v3, 0x0

    invoke-static {v3, v2, v0, v11, v1}, Lwg/b;->d(ILV/d;LN/u0;LN/o;I)V

    const v0, -0x7f65a980

    .line 39
    invoke-virtual {v11, v0}, LN/o;->M(I)V

    .line 40
    sget-object v10, LE/q;->a:LE/q;

    .line 41
    move-object/from16 v0, p0

    check-cast v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/q;

    iget-object v1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/q;->e:LHf/e0;

    invoke-static {v1, v11, v3}, LN/d;->u(LHf/v0;LN/o;I)LN/V;

    move-result-object v23

    .line 42
    invoke-interface/range {v23 .. v23}, LN/K0;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v24, v2

    check-cast v24, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/x;

    move-object v2, v0

    .line 43
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/H;

    move-object/from16 v7, p0

    move-object/from16 v3, p10

    move-object/from16 v6, p13

    move-object v9, v2

    move-object/from16 v8, v22

    move-object/from16 v2, p4

    move-object/from16 v22, v1

    move-object/from16 v1, p9

    invoke-direct/range {v0 .. v7}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/H;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/s;Ltf/u;Ltf/s;Ltf/t;Ltf/u;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/S;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/y;)V

    move-object/from16 v25, v4

    const v1, 0x48a069dc    # 328526.88f

    invoke-static {v11, v1, v0}, LV/e;->b(LN/o;ILef/e;)LV/d;

    move-result-object v3

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/16 v5, 0xc00

    const/4 v6, 0x6

    move-object v4, v11

    move-object/from16 v0, v24

    invoke-static/range {v0 .. v6}, LFe/g;->c(Ljava/lang/Object;LZ/k;LA/Z;LV/d;LN/o;II)V

    .line 44
    invoke-interface/range {v23 .. v23}, LN/K0;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/x;

    shl-int/lit8 v0, v20, 0x3

    and-int/lit8 v0, v0, 0x70

    const/4 v11, 0x6

    or-int/2addr v0, v11

    shr-int/lit8 v2, v20, 0x6

    and-int/lit16 v2, v2, 0x1c00

    or-int/2addr v0, v2

    const v2, 0xe000

    and-int v2, v20, v2

    or-int/2addr v0, v2

    const/16 v17, 0x3

    shr-int/lit8 v2, v20, 0x3

    const/high16 v3, 0x70000

    and-int/2addr v2, v3

    or-int v6, v0, v2

    const/4 v7, 0x0

    move-object/from16 v0, p0

    move-object/from16 v5, p15

    move-object v3, v14

    move-object v2, v15

    move-object/from16 v4, v18

    .line 45
    invoke-static/range {v0 .. v7}, Ltg/b;->c(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/y;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/x;Ltf/c;Ltf/c;Ltf/c;LN/o;II)V

    move-object v2, v0

    move-object v15, v4

    move-object v14, v5

    const v0, -0x560d6637

    invoke-virtual {v14, v0}, LN/o;->M(I)V

    sget-object v0, LN/k;->a:LN/P;

    if-nez p8, :cond_20

    move-object v9, v2

    move/from16 p7, v11

    move-object v11, v0

    move-object v0, v10

    const/4 v10, 0x0

    goto/16 :goto_1b

    .line 46
    :cond_20
    iget-object v1, v9, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/q;->f:LHf/e0;

    const/4 v3, 0x0

    invoke-static {v1, v14, v3}, LN/d;->u(LHf/v0;LN/o;I)LN/V;

    move-result-object v1

    .line 47
    invoke-interface {v1}, LN/K0;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Ljava/lang/Boolean;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v1, 0x6f1f4773

    .line 48
    invoke-virtual {v14, v1}, LN/o;->M(I)V

    invoke-virtual {v14, v2}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v1

    .line 49
    invoke-virtual {v14}, LN/o;->F()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_21

    if-ne v3, v0, :cond_22

    :cond_21
    move-object v1, v0

    goto :goto_19

    :cond_22
    move/from16 p7, v11

    move-object v11, v0

    goto :goto_1a

    .line 50
    :goto_19
    new-instance v0, LEf/p0;

    .line 51
    const-class v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/y;

    const-string v4, "onButtonRendered"

    move-object v5, v1

    const/4 v1, 0x1

    move-object v6, v5

    const-string v5, "onButtonRendered(Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/CustomUserEventBuilderService$UserInteraction$Button;)V"

    move-object v7, v6

    const/4 v6, 0x0

    move-object/from16 v17, v7

    const/16 v7, 0x9

    move/from16 p7, v11

    move-object/from16 v11, v17

    invoke-direct/range {v0 .. v7}, LEf/p0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 52
    invoke-virtual {v14, v0}, LN/o;->U(Ljava/lang/Object;)V

    move-object v3, v0

    .line 53
    :goto_1a
    move-object/from16 v17, v3

    check-cast v17, Lkotlin/reflect/KFunction;

    const/4 v3, 0x0

    .line 54
    invoke-virtual {v14, v3}, LN/o;->p(Z)V

    const v0, 0x6f1f4d48

    .line 55
    invoke-virtual {v14, v0}, LN/o;->M(I)V

    invoke-virtual {v14, v2}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v0

    .line 56
    invoke-virtual {v14}, LN/o;->F()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_23

    if-ne v1, v11, :cond_24

    .line 57
    :cond_23
    new-instance v0, LS8/d;

    .line 58
    const-class v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/y;

    const-string v4, "onCTA"

    const/4 v1, 0x0

    const-string v5, "onCTA()V"

    const/4 v6, 0x0

    const/16 v7, 0x14

    invoke-direct/range {v0 .. v7}, LS8/d;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 59
    invoke-virtual {v14, v0}, LN/o;->U(Ljava/lang/Object;)V

    move-object v1, v0

    .line 60
    :cond_24
    move-object v5, v1

    check-cast v5, Lkotlin/reflect/KFunction;

    const/4 v0, 0x0

    .line 61
    invoke-virtual {v14, v0}, LN/o;->p(Z)V

    .line 62
    invoke-static/range {p7 .. p7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    move-object v2, v9

    move-object v1, v10

    move-object v6, v14

    move-object/from16 v4, v17

    move-object/from16 v3, v22

    move-object/from16 v9, p0

    move v10, v0

    move-object/from16 v0, p8

    .line 63
    invoke-interface/range {v0 .. v7}, Ltf/u;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v0, v1

    .line 64
    :goto_1b
    invoke-virtual {v14, v10}, LN/o;->p(Z)V

    const v1, -0x560d42c3

    .line 65
    invoke-virtual {v14, v1}, LN/o;->M(I)V

    if-eqz v19, :cond_29

    .line 66
    sget-object v1, LZ/a;->g:LZ/d;

    invoke-virtual {v0, v8, v1}, LE/q;->a(LZ/k;LZ/d;)LZ/k;

    move-result-object v1

    const/16 v2, 0xc

    int-to-float v2, v2

    .line 67
    invoke-static {v1, v2}, Lcom/moloco/sdk/internal/publisher/H;->f0(LZ/k;F)LZ/k;

    move-result-object v1

    const v2, -0x6343b0d6

    .line 68
    invoke-virtual {v14, v2}, LN/o;->M(I)V

    .line 69
    invoke-static {}, Lcom/moloco/sdk/service_locator/i;->a()Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;

    move-result-object v2

    const v3, -0x30dc56e9

    .line 70
    invoke-virtual {v14, v3}, LN/o;->M(I)V

    invoke-virtual {v14, v2}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v3

    const-string v4, "https://cdn-f.adsmoloco.com/moloco-cdn/privacy.html"

    invoke-virtual {v14, v4}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    .line 71
    invoke-virtual {v14}, LN/o;->F()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_25

    if-ne v4, v11, :cond_26

    .line 72
    :cond_25
    new-instance v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/a;

    const/4 v3, 0x0

    invoke-direct {v4, v2, v3}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/a;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;I)V

    .line 73
    invoke-virtual {v14, v4}, LN/o;->U(Ljava/lang/Object;)V

    .line 74
    :cond_26
    check-cast v4, Ltf/l;

    const/4 v3, 0x0

    .line 75
    invoke-virtual {v14, v3}, LN/o;->p(Z)V

    .line 76
    new-instance v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/e;

    invoke-direct {v2, v1, v4}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/e;-><init>(LZ/k;Ltf/l;)V

    const v1, 0x2e93aa00

    invoke-static {v14, v1, v2}, LV/e;->b(LN/o;ILef/e;)LV/d;

    move-result-object v8

    .line 77
    invoke-virtual {v14, v3}, LN/o;->p(Z)V

    const v1, -0x560d2b4c

    .line 78
    invoke-virtual {v14, v1}, LN/o;->M(I)V

    invoke-virtual {v14, v9}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v1

    .line 79
    invoke-virtual {v14}, LN/o;->F()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_27

    if-ne v2, v11, :cond_28

    :cond_27
    move-object v1, v0

    goto :goto_1c

    :cond_28
    move-object v9, v0

    goto :goto_1d

    .line 80
    :goto_1c
    new-instance v0, LEf/p0;

    .line 81
    const-class v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/y;

    const-string v4, "onButtonRendered"

    move-object v2, v1

    const/4 v1, 0x1

    const-string v5, "onButtonRendered(Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/CustomUserEventBuilderService$UserInteraction$Button;)V"

    const/4 v6, 0x0

    const/16 v7, 0xa

    move-object/from16 v27, v9

    move-object v9, v2

    move-object/from16 v2, v27

    invoke-direct/range {v0 .. v7}, LEf/p0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 82
    invoke-virtual {v14, v0}, LN/o;->U(Ljava/lang/Object;)V

    move-object v2, v0

    .line 83
    :goto_1d
    check-cast v2, Lkotlin/reflect/KFunction;

    const/4 v10, 0x0

    .line 84
    invoke-virtual {v14, v10}, LN/o;->p(Z)V

    .line 85
    invoke-static/range {p7 .. p7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    move-object v0, v8

    move-object v1, v9

    move-object v4, v14

    move-object/from16 v3, v22

    .line 86
    invoke-virtual/range {v0 .. v5}, LV/d;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1e
    const/4 v0, 0x1

    goto :goto_1f

    :cond_29
    const/4 v10, 0x0

    goto :goto_1e

    .line 87
    :goto_1f
    invoke-static {v14, v10, v10, v10, v0}, Lwg/b;->e(LN/o;ZZZZ)V

    .line 88
    invoke-virtual {v14, v10}, LN/o;->p(Z)V

    .line 89
    invoke-virtual {v14, v10}, LN/o;->p(Z)V

    move-object v8, v15

    move-object/from16 v2, v16

    move/from16 v15, v19

    move-object/from16 v12, v25

    .line 90
    :goto_20
    invoke-virtual {v14}, LN/o;->r()LN/i0;

    move-result-object v0

    if-eqz v0, :cond_2a

    move-object v1, v0

    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/F;

    move-wide/from16 v3, p2

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v14, p13

    move/from16 v16, p16

    move-object/from16 v26, v1

    move/from16 v17, v13

    move-object/from16 v1, p0

    move-object/from16 v13, p12

    invoke-direct/range {v0 .. v17}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/F;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/y;LZ/k;JLtf/u;Ltf/c;Ltf/c;Ltf/c;Ltf/u;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/s;Ltf/s;Ltf/t;Ltf/u;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/S;ZII)V

    move-object/from16 v1, v26

    .line 91
    iput-object v0, v1, LN/i0;->d:Ltf/p;

    :cond_2a
    return-void
.end method

.method public static g(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 5
    .line 6
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    throw p0
.end method

.method public static final h(Ltf/l;LZ/k;Ltf/l;LN/o;I)V
    .locals 11

    .line 1
    const v1, -0x1b5c31a6

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3, v1}, LN/o;->N(I)LN/o;

    .line 5
    .line 6
    .line 7
    and-int/lit8 v1, p4, 0x6

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {p3, p0}, LN/o;->e(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    if-eqz v4, :cond_0

    .line 16
    .line 17
    const/4 v4, 0x4

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v4, 0x2

    .line 20
    :goto_0
    or-int/2addr v4, p4

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move v4, p4

    .line 23
    :goto_1
    and-int/lit8 v5, p4, 0x30

    .line 24
    .line 25
    if-nez v5, :cond_3

    .line 26
    .line 27
    invoke-virtual {p3, p1}, LN/o;->e(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    if-eqz v5, :cond_2

    .line 32
    .line 33
    const/16 v5, 0x20

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_2
    const/16 v5, 0x10

    .line 37
    .line 38
    :goto_2
    or-int/2addr v4, v5

    .line 39
    :cond_3
    and-int/lit16 v5, p4, 0x180

    .line 40
    .line 41
    if-nez v5, :cond_5

    .line 42
    .line 43
    const-string v5, "https://cdn-f.adsmoloco.com/moloco-cdn/privacy.html"

    .line 44
    .line 45
    invoke-virtual {p3, v5}, LN/o;->e(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    if-eqz v5, :cond_4

    .line 50
    .line 51
    const/16 v5, 0x100

    .line 52
    .line 53
    goto :goto_3

    .line 54
    :cond_4
    const/16 v5, 0x80

    .line 55
    .line 56
    :goto_3
    or-int/2addr v4, v5

    .line 57
    :cond_5
    and-int/lit16 v5, p4, 0xc00

    .line 58
    .line 59
    if-nez v5, :cond_7

    .line 60
    .line 61
    invoke-virtual {p3, p2}, LN/o;->e(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    if-eqz v5, :cond_6

    .line 66
    .line 67
    const/16 v5, 0x800

    .line 68
    .line 69
    goto :goto_4

    .line 70
    :cond_6
    const/16 v5, 0x400

    .line 71
    .line 72
    :goto_4
    or-int/2addr v4, v5

    .line 73
    :cond_7
    and-int/lit16 v5, v4, 0x493

    .line 74
    .line 75
    const/16 v6, 0x492

    .line 76
    .line 77
    if-ne v5, v6, :cond_9

    .line 78
    .line 79
    invoke-virtual {p3}, LN/o;->x()Z

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    if-nez v5, :cond_8

    .line 84
    .line 85
    goto :goto_5

    .line 86
    :cond_8
    invoke-virtual {p3}, LN/o;->I()V

    .line 87
    .line 88
    .line 89
    goto :goto_6

    .line 90
    :cond_9
    :goto_5
    sget-object v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/c;->g:Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/c;

    .line 91
    .line 92
    new-instance v6, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/d;

    .line 93
    .line 94
    invoke-direct {v6, p1, p2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/d;-><init>(LZ/k;Ltf/l;)V

    .line 95
    .line 96
    .line 97
    const v7, -0x6be87306

    .line 98
    .line 99
    .line 100
    invoke-static {p3, v7, v6}, LV/e;->b(LN/o;ILef/e;)LV/d;

    .line 101
    .line 102
    .line 103
    move-result-object v7

    .line 104
    shl-int/lit8 v4, v4, 0x6

    .line 105
    .line 106
    and-int/lit16 v4, v4, 0x380

    .line 107
    .line 108
    or-int/lit16 v9, v4, 0xc30

    .line 109
    .line 110
    const/4 v4, 0x0

    .line 111
    const/4 v10, 0x1

    .line 112
    move-object v6, p0

    .line 113
    move-object v8, p3

    .line 114
    invoke-static/range {v4 .. v10}, La/a;->h(LZ/k;Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/c;Ltf/l;LV/d;LN/o;II)V

    .line 115
    .line 116
    .line 117
    :goto_6
    invoke-virtual {p3}, LN/o;->r()LN/i0;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    if-eqz v6, :cond_a

    .line 122
    .line 123
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/b;

    .line 124
    .line 125
    const/4 v5, 0x0

    .line 126
    move-object v1, p0

    .line 127
    move-object v2, p1

    .line 128
    move-object v3, p2

    .line 129
    move v4, p4

    .line 130
    invoke-direct/range {v0 .. v5}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/b;-><init>(Ljava/lang/Object;LZ/k;Ljava/lang/Object;II)V

    .line 131
    .line 132
    .line 133
    iput-object v0, v6, LN/i0;->d:Ltf/p;

    .line 134
    .line 135
    :cond_a
    return-void
.end method

.method public static varargs i([Ljava/lang/Object;)Ljava/util/ArrayList;
    .locals 3

    .line 1
    array-length v0, p0

    .line 2
    if-nez v0, :cond_0

    .line 3
    .line 4
    new-instance p0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    new-instance v1, Lff/k;

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    invoke-direct {v1, p0, v2}, Lff/k;-><init>([Ljava/lang/Object;Z)V

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public static final j(Ljava/lang/String;)J
    .locals 3

    .line 1
    if-eqz p0, :cond_6

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const v1, 0x12944

    .line 8
    .line 9
    .line 10
    const/16 v2, 0x1a

    .line 11
    .line 12
    if-eq v0, v1, :cond_4

    .line 13
    .line 14
    const v1, 0x3c29bbd

    .line 15
    .line 16
    .line 17
    if-eq v0, v1, :cond_2

    .line 18
    .line 19
    const v1, 0x14b858b8

    .line 20
    .line 21
    .line 22
    if-eq v0, v1, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const-string v0, "LevelPlay"

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-nez p0, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    sget-object p0, LCf/c;->d:LCf/c;

    .line 35
    .line 36
    invoke-static {v2, p0}, LFe/b;->S(ILCf/c;)J

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    return-wide v0

    .line 41
    :cond_2
    const-string v0, "AdMob"

    .line 42
    .line 43
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    if-nez p0, :cond_3

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_3
    sget-object p0, LCf/c;->d:LCf/c;

    .line 51
    .line 52
    invoke-static {v2, p0}, LFe/b;->S(ILCf/c;)J

    .line 53
    .line 54
    .line 55
    move-result-wide v0

    .line 56
    return-wide v0

    .line 57
    :cond_4
    const-string v0, "MAX"

    .line 58
    .line 59
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-nez p0, :cond_5

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_5
    sget-object p0, LCf/c;->d:LCf/c;

    .line 67
    .line 68
    invoke-static {v2, p0}, LFe/b;->S(ILCf/c;)J

    .line 69
    .line 70
    .line 71
    move-result-wide v0

    .line 72
    return-wide v0

    .line 73
    :cond_6
    :goto_0
    sget-object p0, LCf/c;->d:LCf/c;

    .line 74
    .line 75
    const/16 v0, 0x3c

    .line 76
    .line 77
    invoke-static {v0, p0}, LFe/b;->S(ILCf/c;)J

    .line 78
    .line 79
    .line 80
    move-result-wide v0

    .line 81
    return-wide v0
.end method

.method public static k(Ljava/util/ArrayList;Ljava/lang/Comparable;)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "<this>"

    .line 6
    .line 7
    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    const-string v3, ")."

    .line 16
    .line 17
    if-ltz v0, :cond_4

    .line 18
    .line 19
    if-gt v0, v1, :cond_3

    .line 20
    .line 21
    add-int/lit8 v0, v0, -0x1

    .line 22
    .line 23
    :goto_0
    if-gt v2, v0, :cond_2

    .line 24
    .line 25
    add-int v1, v2, v0

    .line 26
    .line 27
    ushr-int/lit8 v1, v1, 0x1

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    check-cast v3, Ljava/lang/Comparable;

    .line 34
    .line 35
    invoke-static {v3, p1}, Landroid/support/v4/media/session/b;->W(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-gez v3, :cond_0

    .line 40
    .line 41
    add-int/lit8 v2, v1, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    if-lez v3, :cond_1

    .line 45
    .line 46
    add-int/lit8 v0, v1, -0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    return v1

    .line 50
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 51
    .line 52
    neg-int p0, v2

    .line 53
    return p0

    .line 54
    :cond_3
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    .line 55
    .line 56
    const-string p1, "toIndex ("

    .line 57
    .line 58
    const-string v2, ") is greater than size ("

    .line 59
    .line 60
    invoke-static {p1, v0, v2, v1, v3}, LN0/a;->e(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-direct {p0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw p0

    .line 68
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 69
    .line 70
    const-string p1, "fromIndex ("

    .line 71
    .line 72
    const-string v1, ") is greater than toIndex ("

    .line 73
    .line 74
    invoke-static {p1, v2, v1, v0, v3}, LN0/a;->e(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    throw p0
.end method

.method public static l(Lgf/b;)Lgf/b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lgf/b;->g()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lgf/b;->c:Z

    .line 6
    .line 7
    iget v0, p0, Lgf/b;->b:I

    .line 8
    .line 9
    if-lez v0, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object p0, Lgf/b;->d:Lgf/b;

    .line 13
    .line 14
    return-object p0
.end method

.method public static final m(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    :try_start_0
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception p0

    .line 14
    invoke-static {p1, p0}, LFe/b;->d(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    :cond_1
    return-void
.end method

.method public static final n(LZ/k;Ltf/q;)LZ/k;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LZ/g;

    .line 7
    .line 8
    invoke-direct {v0, p1}, LZ/g;-><init>(Ltf/q;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, v0}, LZ/k;->g(LZ/k;)LZ/k;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public static t()Lgf/b;
    .locals 2

    .line 1
    new-instance v0, Lgf/b;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lgf/b;-><init>(I)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public static final u(Ljava/nio/charset/CharsetDecoder;LPf/i;)Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const v0, 0x7fffffff

    .line 7
    .line 8
    .line 9
    int-to-long v0, v0

    .line 10
    invoke-interface {p1}, LPf/i;->getBuffer()LPf/a;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    iget-wide v2, v2, LPf/a;->c:J

    .line 15
    .line 16
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    long-to-int v0, v0

    .line 21
    new-instance v1, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/nio/charset/CharsetDecoder;->charset()Ljava/nio/charset/Charset;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    sget-object v2, LBf/a;->a:Ljava/nio/charset/Charset;

    .line 34
    .line 35
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    invoke-static {p1}, LPf/j;->g(LPf/i;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    invoke-static {p1}, LFe/b;->C(LPf/i;)J

    .line 50
    .line 51
    .line 52
    const/4 v0, -0x1

    .line 53
    invoke-static {p1, v0}, LPf/j;->f(LPf/i;I)[B

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    new-instance v0, LQf/a;

    .line 58
    .line 59
    invoke-virtual {p0}, Ljava/nio/charset/CharsetDecoder;->charset()Ljava/nio/charset/Charset;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-static {p0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    new-instance v0, Ljava/lang/String;

    .line 67
    .line 68
    invoke-direct {v0, p1, p0}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 72
    .line 73
    .line 74
    :goto_0
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    return-object p0
.end method

.method public static final v(Ljf/c;Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    instance-of v0, p1, LEf/N;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, LEf/N;

    .line 6
    .line 7
    iget-object p1, p1, LEf/N;->a:Ljava/lang/Throwable;

    .line 8
    .line 9
    :cond_0
    invoke-static {p1}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {p0, v0}, Ljf/c;->resumeWith(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    throw p1
.end method

.method public static final w(LZ/k;)LZ/k;
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LE/V;

    .line 7
    .line 8
    const/4 v1, 0x3

    .line 9
    invoke-direct {v0, v1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 10
    .line 11
    .line 12
    invoke-static {p0, v0}, Lr7/e;->n(LZ/k;Ltf/q;)LZ/k;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static final x(Ljava/nio/charset/CharsetEncoder;Ljava/lang/String;II)LPf/a;
    .locals 3

    .line 1
    const-string v0, "input"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LPf/a;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    if-lt p2, p3, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-static {p0, p1, p2, p3}, Lp7/b;->r(Ljava/nio/charset/CharsetEncoder;Ljava/lang/String;II)[B

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    array-length v2, v1

    .line 19
    invoke-virtual {v0, v2, v1}, LPf/a;->w(I[B)V

    .line 20
    .line 21
    .line 22
    array-length v1, v1

    .line 23
    if-ltz v1, :cond_1

    .line 24
    .line 25
    add-int/2addr p2, v1

    .line 26
    if-lt p2, p3, :cond_0

    .line 27
    .line 28
    :goto_0
    return-object v0

    .line 29
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 30
    .line 31
    const-string p1, "Check failed."

    .line 32
    .line 33
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw p0
.end method

.method public static z(Ljava/util/List;)I
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    add-int/lit8 p0, p0, -0x1

    .line 11
    .line 12
    return p0
.end method


# virtual methods
.method public abstract o(Landroid/content/Context;La1/e;Landroid/content/res/Resources;I)Landroid/graphics/Typeface;
.end method

.method public abstract p(Landroid/content/Context;[Lh1/i;I)Landroid/graphics/Typeface;
.end method

.method public q(Landroid/content/Context;Ljava/util/List;I)Landroid/graphics/Typeface;
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string p2, "createFromFontInfoWithFallback must only be called on API 29+"

    .line 4
    .line 5
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method

.method public r(Landroid/content/Context;Ljava/io/InputStream;)Landroid/graphics/Typeface;
    .locals 1

    .line 1
    invoke-static {p1}, Lff/B;->y(Landroid/content/Context;)Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_0
    :try_start_0
    invoke-static {p1, p2}, Lff/B;->m(Ljava/io/File;Ljava/io/InputStream;)Z

    .line 10
    .line 11
    .line 12
    move-result p2
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    if-nez p2, :cond_1

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 16
    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_1
    :try_start_1
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-static {p2}, Landroid/graphics/Typeface;->createFromFile(Ljava/lang/String;)Landroid/graphics/Typeface;

    .line 24
    .line 25
    .line 26
    move-result-object p2
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 28
    .line 29
    .line 30
    return-object p2

    .line 31
    :catchall_0
    move-exception p2

    .line 32
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 33
    .line 34
    .line 35
    throw p2

    .line 36
    :catch_0
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 37
    .line 38
    .line 39
    return-object v0
.end method

.method public s(Landroid/content/Context;Landroid/content/res/Resources;ILjava/lang/String;I)Landroid/graphics/Typeface;
    .locals 0

    .line 1
    invoke-static {p1}, Lff/B;->y(Landroid/content/Context;)Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 p4, 0x0

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    return-object p4

    .line 9
    :cond_0
    :try_start_0
    invoke-static {p1, p2, p3}, Lff/B;->l(Ljava/io/File;Landroid/content/res/Resources;I)Z

    .line 10
    .line 11
    .line 12
    move-result p2
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    if-nez p2, :cond_1

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 16
    .line 17
    .line 18
    return-object p4

    .line 19
    :cond_1
    :try_start_1
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-static {p2}, Landroid/graphics/Typeface;->createFromFile(Ljava/lang/String;)Landroid/graphics/Typeface;

    .line 24
    .line 25
    .line 26
    move-result-object p2
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 28
    .line 29
    .line 30
    return-object p2

    .line 31
    :catchall_0
    move-exception p2

    .line 32
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 33
    .line 34
    .line 35
    throw p2

    .line 36
    :catch_0
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 37
    .line 38
    .line 39
    return-object p4
.end method

.method public y([Lh1/i;I)Lh1/i;
    .locals 10

    .line 1
    new-instance v0, Lae/d;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lae/d;-><init>(I)V

    .line 5
    .line 6
    .line 7
    and-int/lit8 v0, p2, 0x1

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/16 v0, 0x190

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/16 v0, 0x2bc

    .line 15
    .line 16
    :goto_0
    and-int/lit8 p2, p2, 0x2

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    const/4 v2, 0x0

    .line 20
    if-eqz p2, :cond_1

    .line 21
    .line 22
    move p2, v1

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    move p2, v2

    .line 25
    :goto_1
    array-length v3, p1

    .line 26
    const/4 v4, 0x0

    .line 27
    const v5, 0x7fffffff

    .line 28
    .line 29
    .line 30
    move v6, v2

    .line 31
    :goto_2
    if-ge v6, v3, :cond_5

    .line 32
    .line 33
    aget-object v7, p1, v6

    .line 34
    .line 35
    iget v8, v7, Lh1/i;->c:I

    .line 36
    .line 37
    sub-int/2addr v8, v0

    .line 38
    invoke-static {v8}, Ljava/lang/Math;->abs(I)I

    .line 39
    .line 40
    .line 41
    move-result v8

    .line 42
    mul-int/lit8 v8, v8, 0x2

    .line 43
    .line 44
    iget-boolean v9, v7, Lh1/i;->d:Z

    .line 45
    .line 46
    if-ne v9, p2, :cond_2

    .line 47
    .line 48
    move v9, v2

    .line 49
    goto :goto_3

    .line 50
    :cond_2
    move v9, v1

    .line 51
    :goto_3
    add-int/2addr v8, v9

    .line 52
    if-eqz v4, :cond_3

    .line 53
    .line 54
    if-le v5, v8, :cond_4

    .line 55
    .line 56
    :cond_3
    move-object v4, v7

    .line 57
    move v5, v8

    .line 58
    :cond_4
    add-int/lit8 v6, v6, 0x1

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_5
    return-object v4
.end method
